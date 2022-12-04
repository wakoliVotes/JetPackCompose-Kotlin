package com.example.grocerystoreui.screenviews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.grocerystoreui.R
import com.example.grocerystoreui.navigation.MainActions
import com.example.grocerystoreui.ui.theme.ghostWhite
import com.example.grocerystoreui.ui.theme.platinum

@Composable
fun HomeUI(actions: MainActions) {
    var text by remember {
        mutableStateOf("")
    }
    var itemList = listOf("Favorites", "Home Sweet", "Organics", "Fresh")


    androidx.compose.material.Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp)
            )
            {
                Image(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(id = R.drawable.menu),
                    contentDescription = "Menu Image"
                )
                Image(
                    modifier = Modifier.size(32.dp),
                    painter = painterResource(id = R.drawable.onboarding_2),
                    contentDescription = "User Profile Image",
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "With the best conditions and prices",
                textAlign = TextAlign.Center,
                color = Color.Gray,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = ghostWhite,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                value = text,
                onValueChange = { text = it },
                placeholder = {
                    Text(
                        text = "Carl Sayuran",
                        color = platinum
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = ,
                        contentDescription = )
                }
            )


        }


    }

}