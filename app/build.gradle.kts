plugins {
    id("com.android.application")
    id("kotlin-android")
    kotlin("kapt")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs")
}

android {
    namespace = "com.tsci.dehydrationreminder"
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        applicationId = "com.example.android.dehydrationreminder"
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
    kapt {
        correctErrorTypes = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }
    packagingOptions {
        resources.excludes.add("META-INF/gradle/incremental.annotation.processors")
    }
}
kotlin {
    sourceSets.configureEach {
        kotlin.srcDir("$buildDir/generated/ksp/$name/kotlin/")
    }
}

dependencies {
    implementation(project(":usecases"))
    implementation(project(":ui"))
    implementation(project(":core"))

    implementation(Dependencies.kotlin)
    implementation(Dependencies.composeActivity)
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeToolingPreview)
    implementation(Dependencies.composeMaterial)
    testImplementation(Dependencies.junit)
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation(Dependencies.composeUiTestJUnit)
    debugImplementation(Dependencies.composeTooling)
    debugImplementation(Dependencies.composeUiTestManifest)


    api(Dependencies.hiltAndroid)
    api(Dependencies.hiltCompiler)
    api(Dependencies.lifecycleViewModel)
    api(Dependencies.lifecycleLiveData)
    api(Dependencies.lifecycleRuntime)
    compileOnly(Dependencies.hiltDagger)
    kapt(Dependencies.hiltDaggerCompiler)
}