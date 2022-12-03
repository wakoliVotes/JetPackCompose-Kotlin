package com.example.grocerystoreui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.grocerystoreui.screenviews.DashBoardUI
import com.example.grocerystoreui.screenviews.OnBoardingScreenUI
import com.example.grocerystoreui.screenviews.SplashScreenUI
import com.example.grocerystoreui.screenviews.VegetableDetailUI

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    val actions = remember(navController) {
        MainActions(navController)
    }

    NavHost(navController, startDestination = ScreenRoutes.Splash.route) {

        // Splash Screen

        composable(ScreenRoutes.Splash.route) {
            SplashScreenUI(actions)
        }

        // OnBoarding Screen
        composable(ScreenRoutes.OnBoarding.route) {
            OnBoardingScreenUI(actions)
        }

        // DashBoard
        composable(ScreenRoutes.DashBoard.route) {
            DashBoardUI()
        }

        // Vegetable Details
        composable(ScreenRoutes.VegetableDetail.route) {
            VegetableDetailUI()
        }
    }


}

class MainActions(private val navController: NavHostController) {
    val popBackStack: () -> Unit = {
        navController.popBackStack()
    }

    val upPress: () -> Unit = {
        navController.navigateUp()
    }

    val gotoOnBoarding: () -> Unit = {
        navController.popBackStack()
        navController.navigate(ScreenRoutes.OnBoarding.route)
    }

    val gotoDashBoard: () -> Unit = {
        navController.popBackStack()
        navController.navigate(ScreenRoutes.DashBoard.route)
    }

    val gotoVegetableDetail: () -> Unit = {
        navController.navigate(ScreenRoutes.VegetableDetail.route)
    }
}


