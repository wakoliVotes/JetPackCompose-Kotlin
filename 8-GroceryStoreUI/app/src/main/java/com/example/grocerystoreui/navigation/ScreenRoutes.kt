package com.example.grocerystoreui.navigation

import androidx.annotation.StringRes
import com.example.grocerystoreui.R

sealed class ScreenRoutes(val route: String, @StringRes val resourceId: Int) {
    object Splash : ScreenRoutes("splash", R.string.splash)
    object OnBoarding : ScreenRoutes("onboarding", R.string.onboarding)
    object DashBoard: ScreenRoutes("dashboard", R.string.dashboard)
    object VegetableDetail: ScreenRoutes("vegetabledetail", R.string.vegetabledetail)
}
