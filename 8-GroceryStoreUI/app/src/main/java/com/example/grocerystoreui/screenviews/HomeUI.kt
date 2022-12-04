package com.example.grocerystoreui.screenviews

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.grocerystoreui.R
import com.example.grocerystoreui.navigation.MainActions
import com.example.grocerystoreui.ui.theme.*

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
                        imageVector = Icons.Filled.Search,
                        contentDescription = stringResource(R.string.text_search_icon),
                        tint = lightSilver
                    )
                },
            )
            Spacer(modifier = Modifier.height(24.dp))
            LazyRow(
                modifier = Modifier.height(24.dp)
            )
            {
                items(itemList.size) { item ->
                    Box(
                        modifier = Modifier
                            .border(
                                color = if (item == 0) gold else Color.Transparent,
                                width = 2.dp,
                                shape = RoundedCornerShape(24.dp)
                            )
                    )
                    {
                        Text(
                            modifier = Modifier
                                .padding(
                                    start = 16.dp,
                                    end = 16.dp,
                                    top = 8.dp,
                                    bottom = 8.dp
                                ),
                            text = itemList[item],
                            color = if (item == 0) gold else Color.LightGray
                        )
                    }
                    Spacer(modifier = Modifier.height(24.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(0.5f)
                                .wrapContentHeight()
                                .clip(RoundedCornerShape(16.dp))
                                .background(navajoWhite)
                        ){
                            Column(modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp))
                            {
                                Box(
                                    modifier = Modifier
                                        .clip(CircleShape)
                                        .background(white)
                                        .padding(4.dp)
                                ){
                                    Icon(
                                        imageVector = Icons.Default.Favorite,
                                        contentDescription = stringResource(R.string.text_heart_icon),
                                        tint = Color.Red
                                    )
                                }

                            }
                        }

                    }

                }

            }
        }


    }

}