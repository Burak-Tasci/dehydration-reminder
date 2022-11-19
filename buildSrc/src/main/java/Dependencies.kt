/**
 * Created by Burak Taşcı on 6.11.2022.
 */

/**
 * To define dependencies
 */
object Dependencies {
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }
    val junit by lazy { "junit:junit:${Versions.jUnit}" }

    object Compose  {
        val composeActivity by lazy { "androidx.activity:activity-compose:${Versions.compose}" }
        val composeUi by lazy { "androidx.compose.ui:ui:${Versions.compose}" }
        val composeToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.compose}" }
        val composeTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }
        val composeMaterial by lazy { "androidx.compose.material:material:${Versions.compose}" }
        val composeUiTestJUnit by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose}" }
        val composeUiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.compose}" }
        val composeMaterialIcons by lazy { "androidx.compose.material:material-icons-extended:${Versions.compose}" }
    }


    object Hilt  {
        val android by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
        val compiler by lazy { "com.google.dagger:hilt-compiler:${Versions.hilt}" }
        val dagger by lazy { "com.google.dagger:dagger:${Versions.hilt}" }
        val daggerCompiler by lazy { "com.google.dagger:dagger-compiler:${Versions.hilt}" }
        val navigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigation}" }
    }

    object Lifecycle {
        val viewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}" }
        val runtime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}" }
        val viewModelCompose by lazy { "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}" }
    }

    object Coroutines{
        val core by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}" }
        val android by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}" }
        val playService by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.coroutines}" }
    }

    // Compose Nav Destinations
    object ComposeDestinations {
        val core by lazy { "io.github.raamcosta.compose-destinations:core:${Versions.composeDestination}" }
        val ksp by lazy { "io.github.raamcosta.compose-destinations:ksp:${Versions.composeDestination}" }
    }
}