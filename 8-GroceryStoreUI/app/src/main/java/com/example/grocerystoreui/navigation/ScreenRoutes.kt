package com.example.grocerystoreui.navigation

import androidx.annotation.StringRes
import com.example.grocerystoreui.R

sealed class ScreenRoutes(val route: String, @StringRes val resourceId: Int) {
    object Splash: ScreenRoutes("splash", R.string.splash)
    object OnBoarding: ScreenRoutes("splash", R.string.onboarding)
    object DashBoard: ScreenRoutes("splash", R.string.dashboard)
    object VegetableDetail: ScreenRoutes("splash", R.string.vegetabledetail)
}
