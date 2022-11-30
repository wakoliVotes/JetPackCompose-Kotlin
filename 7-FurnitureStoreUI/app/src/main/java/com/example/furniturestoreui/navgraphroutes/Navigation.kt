package com.example.furniturestoreui.navgraphroutes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.furniturestoreui.screensui.AppSplashScreen
import com.example.furniturestoreui.screensui.DashBoardUI
import com.example.furniturestoreui.screensui.ProductContentSection
import com.example.furniturestoreui.screensui.ProductListing

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = RoutesSealed.AppSplashScreen.route
    ){
        composable(RoutesSealed.AppSplashScreen.route) {
            AppSplashScreen(navController = navController)
            
        }
        composable(RoutesSealed.DashBoardUI.route){
            DashBoardUI()
        }
        composable(RoutesSealed.ProductListing.route){
            ProductListing()
        }
        composable(RoutesSealed.ProductContentSection.route) {
            ProductContentSection()
        }
    }
}