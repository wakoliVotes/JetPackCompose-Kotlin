package com.example.grocerystoreui.screenviews

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.grocerystoreui.navigation.MainActions
import com.example.grocerystoreui.R

@Composable
fun DashBoardUI(
    actions: MainActions,
) {
    val sectionState = remember {
        mutableStateOf(DashboardSection.Home)
    }
    val navItems = DashboardSection.values().toList()


    Scaffold(
        bottomBar = {
            items = navItems,
            currentSection = sectionState.value,
            onSectionSelected = {
                sectionState.value = it
            },
        }
    ) { innerPadding ->
        val modifier = Modifier.padding(innerPadding)
        Crossfade(
            modifier = modifier,
            targetState = sectionState.value
        ) { section ->
            when(section) {
                DashboardSection.Home -> HomeUI(actions)
                DashboardSection.List -> VegetableDetailUI(actions)
                else -> {}
            }
        }
    }
}

@Composable
private fun BottomBar(
    items: List<DashboardSection>,
    currentSection: DashboardSection,
    onSectionSelected: (DashboardSection) -> UInt,
) {
    BottomNavigation (
        modifier = Modifier.height(50.dp),
        backgroundColor = MaterialTheme.colors.background,
        contentColor = contentColorFor(MaterialTheme.colors.background)

            ) {
        items.forEach{ section ->
            val selected = section == currentSection

            val iconRes = if (selected) section.selectedIcon else section.icon

            BottomNavigationItem(
                icon = {
                       Icon(
                           painter = painterResource(id = iconRes),
                           contentDescription = "Bottom nav icons",
                           modifier = Modifier.size(24.dp)
                       )
                },
                selected = selected,
                onClick = { onSectionSelected(section) },
                alwaysShowLabel = false
            )
        }

    }
}


private enum class DashboardSection(
    val icon: Int,
    val selectedIcon: Int
) {
    Home(R.drawable.home, R.drawable.home),
    List(R.drawable.list, R.drawable.list),
    ShoppingCart(R.drawable.shopping_cart, R.drawable.shopping_cart),
    Profile(R.drawable.user, R.drawable.user)

}