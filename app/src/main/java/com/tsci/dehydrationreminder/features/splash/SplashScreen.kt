package com.tsci.dehydrationreminder.features.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

/**
 * Created by Burak Taşcı on 10.11.2022.
 */
@Composable
fun SplashScreen(
    navController: NavController,
) {
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan)) {

    }
}