package com.example.grocerystoreui.screenviews

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.grocerystoreui.navigation.MainActions

@Composable
fun HomeUI(actions: MainActions){
    var text by remember {
        mutableStateOf("")
    }
    var itemList = listOf("Favorites", "Home Sweet", "Organics", "Fresh")


    androidx.compose.material.Surface (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            ) {


    }

}