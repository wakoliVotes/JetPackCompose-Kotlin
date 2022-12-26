package com.example.grocerystoreui.screenviews

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
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


    Surface(
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
                        text = "Search Groceries",
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
                    Spacer(modifier = Modifier.height(8.dp))
                }
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
                ) {
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp))
                    {
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .background(white)
                                .padding(4.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = stringResource(R.string.text_heart_icon),
                                tint = Color.Red
                            )
                        }

                    }

                    Spacer(modifier = Modifier.height(8.dp))
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            modifier = Modifier
                                .size(100.dp),
                            painter = painterResource(R.drawable.potato),
                            contentDescription = "Potato",
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {

                        Column(
                            modifier = Modifier
                                .wrapContentHeight()
                        ) {
                            Text(
                                text = "Potato",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = black,
                            )
                            Text(
                                text = "Rs. 14.0/Kg",
                                fontSize = 12.sp,
                                color = black,
                            )
                        }
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(gold)
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                modifier = Modifier.size(20.dp, 20.dp),
                                imageVector = Icons.Default.Add,
                                contentDescription = stringResource(R.string.text_add_icon),
                                tint = white
                            )
                        }
                    }

                }
                Spacer(modifier = Modifier.width(16.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.5f)
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(16.dp))
                        .background(water)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .background(white)
                                    .padding(4.dp),
                            ) {
                                Icon(
                                    modifier = Modifier.size(16.dp, 16.dp),
                                    imageVector = Icons.Default.Favorite,
                                    contentDescription = stringResource(R.string.text_heart_icon),
                                    tint = Color.Red
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                modifier = Modifier
                                    .size(100.dp),
                                painter = painterResource(R.drawable.cabbage),
                                contentDescription = "cabbage",
                            )
                        }

                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {

                            Column(
                                modifier = Modifier
                                    .wrapContentHeight()
                            ) {
                                Text(
                                    text = "Cabbage",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = black,
                                )
                                Text(
                                    text = "Rs. 28.0/Kg",
                                    fontSize = 12.sp,
                                    color = black,
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(gold)
                                    .padding(4.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    modifier = Modifier.size(20.dp, 20.dp),
                                    imageVector = Icons.Default.Add,
                                    contentDescription = stringResource(R.string.text_add_icon),
                                    tint = white
                                )
                            }

                        }

                    }
                    Spacer(modifier = Modifier.height(24.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "Lagi Diskon Nikh",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = black,
                        )
                        Text(
                            text = "View All",
                            fontSize = 14.sp,
                            color = gold,
                        )
                    }
                    Spacer(modifier = Modifier.height(24.dp))
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                                .padding(8.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .weight(0.2f)
                                    .height(64.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(lightBlue),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    modifier = Modifier.padding(8.dp),
                                    painter = painterResource(R.drawable.pumpkin),
                                    contentDescription = "pumpkin",
                                )
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Column(
                                verticalArrangement = Arrangement.SpaceEvenly,
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .weight(0.55f)
                                    .wrapContentHeight()
                            ) {
                                Text(
                                    text = "Summer Squash",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.sp,
                                    color = black,
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = "Suitable for reducing body weight",
                                    fontSize = 12.sp,
                                    color = Color.Gray,
                                )
                            }
                            Column(
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .weight(0.25f)
                                    .wrapContentHeight()
                            ) {
                                Text(
                                    text = "Ksh. 90.60/Kg",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 12.sp,
                                    color = gold,
                                )
                                /*Text(
                                text = "Cocok untuk memrunkunkan berat badam",
                                fontSize = 12.sp,
                                color = Color.Gray,
                            )*/
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(24.dp))
                }

            }
        }
    }
}

//@Preview
//@Composable
//fun HomePrev(){
//    HomeUI()
//}