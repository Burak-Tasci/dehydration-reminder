import Dependencies.Compose
import Dependencies.Hilt
import Dependencies.Lifecycle
import Dependencies.ComposeDestinations

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs")
    id("com.google.devtools.ksp") version "1.7.20-1.0.7"
    kotlin("kapt")
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
    implementation(project(":core"))
    implementation(Dependencies.kotlin)
    testImplementation(Dependencies.junit)
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")

    implementation(Compose.composeActivity)
    implementation(Compose.composeUi)
    implementation(Compose.composeToolingPreview)
    implementation(Compose.composeMaterial)
    androidTestImplementation(Compose.composeUiTestJUnit)
    debugImplementation(Compose.composeTooling)
    debugImplementation(Compose.composeUiTestManifest)
    api(Compose.composeMaterialIcons)


    api(Hilt.android)
    api(Hilt.compiler)
    compileOnly(Hilt.dagger)
    kapt(Hilt.daggerCompiler)
    api(Hilt.navigationCompose)

    api(Lifecycle.viewModel)
    api(Lifecycle.runtime)
    api(Lifecycle.viewModelCompose)

    api(ComposeDestinations.core)
    ksp(ComposeDestinations.ksp)



//    implementation "com.google.accompanist:accompanist-swiperefresh:0.24.2-alpha"


}