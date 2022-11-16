package com.tsci.dehydrationreminder

/**
 * Created by Burak Taşcı on 17.11.2022.
 */
sealed class Screen(val route: String){
    object SplashScreen: Screen("splash_screen")
}