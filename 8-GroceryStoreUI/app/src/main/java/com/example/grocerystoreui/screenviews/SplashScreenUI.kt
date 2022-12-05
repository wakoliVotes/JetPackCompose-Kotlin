package com.example.grocerystoreui.screenviews

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.grocerystoreui.R
import com.example.grocerystoreui.navigation.MainActions
import kotlinx.coroutines.delay

@SuppressLint("ProduceStateDoesNotAssignValue")
@Composable
fun SplashScreenUI(actions: MainActions) {
    androidx.compose.material.Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo"
            )
        }
    }
    produceState(initialValue = -1) {
        delay(3000)
        actions.gotoOnBoarding()
    }
}