package com.example.grocerystoreui.screenviews

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
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
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.height(24.dp))
            Row (
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp)
                    )
            {

            }


        }


    }

}