package com.tsci.dehydrationreminder.features.splash

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.animateValue
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.tsci.dehydrationreminder.R
import com.tsci.dehydrationreminder.ui.theme.Bone
import kotlinx.coroutines.delay

/**
 * Created by Burak Taşcı on 10.11.2022.
 */
@OptIn(ExperimentalAnimationApi::class)
@Composable
fun SplashScreen(
    navController: NavController,
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Bone),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        WaterDropAnimation(
            animationEnd = {
                // TODO navigate to onboarding
            }
        )
    }

}


@Composable
fun WaterDropAnimation(
    modifier: Modifier = Modifier,
    animationEnd: () -> Unit = { },
    initialDp: Dp = 36.dp,
    targetDp: Dp = 108.dp
) {
    val transition = rememberInfiniteTransition()
    val size by transition.animateValue(
        initialValue = initialDp,
        targetValue = targetDp,
        typeConverter = Dp.VectorConverter,
        animationSpec = infiniteRepeatable(
            animation = tween(2000),
            repeatMode = RepeatMode.Reverse
        )
    )
    Image(
        painter = painterResource(id = R.drawable.full_water_level),
        contentDescription = null,
        modifier = modifier
            .size(size)
    )
    LaunchedEffect(key1 = ""){
        delay(5000L)
        animationEnd.invoke()
    }

}