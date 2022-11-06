/**
 * Created by Burak Taşcı on 6.11.2022.
 */

/**
 * To define dependencies
 */
object Dependencies {
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }
    val materialDesign by lazy { "com.google.android.material:material:${Versions.material}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    val junit by lazy { "junit:junit:${Versions.jUnit}" }

    //Compose
    val composeActivity by lazy{ "androidx.activity:activity-compose:${Versions.compose}" }
    val composeUi by lazy{ "androidx.compose.ui:ui:${Versions.compose}"}
    val composeToolingPreview by lazy{ "androidx.compose.ui:ui-tooling-preview:${Versions.compose}" }
    val composeTooling by lazy{ "androidx.compose.ui:ui-tooling:${Versions.compose}" }
    val composeMaterial by lazy { "androidx.compose.material:material:${Versions.compose}" }
    val composeUiTestJUnit by lazy{ "androidx.compose.ui:ui-test-junit4:${Versions.compose}" }
    val composeUiTestManifest by lazy{ "androidx.compose.ui:ui-test-manifest:${Versions.compose}" }


    // Hilt
    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.hilt}" }
    val hiltDagger by lazy { "com.google.dagger:dagger:${Versions.hilt}" }
    val hiltDaggerCompiler by lazy { "com.google.dagger:dagger-compiler:${Versions.hilt}" }

    // Lifecycle
    val lifecycleLiveData by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}" }
    val lifecycleViewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}" }
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}" }

    // Coroutines
    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}" }
    val coroutinesAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}" }
    val coroutinesPlayService by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.coroutines}" }
}