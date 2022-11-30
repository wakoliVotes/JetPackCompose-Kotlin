package com.example.furniturestoreui.navgraphroutes

sealed class RoutesSealed(val route: String) {
    object AppSplashScreen : RoutesSealed("app_splash_screen")
    object DashBoardUI : RoutesSealed("dashboard_screen")
    object ProductContentSection: RoutesSealed("product_content_section")
    object ProductListing: RoutesSealed("product_listing")
}
