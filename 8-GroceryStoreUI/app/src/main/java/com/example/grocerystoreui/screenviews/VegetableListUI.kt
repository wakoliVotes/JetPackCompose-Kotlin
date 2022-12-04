package com.example.grocerystoreui.screenviews

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowLeft
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.grocerystoreui.R
import com.example.grocerystoreui.datautils.GroceryData
import com.example.grocerystoreui.navigation.MainActions
import com.example.grocerystoreui.ui.theme.*

@ExperimentalMaterialApi
@Composable
fun VegetableListUI(actions: MainActions) {
    var text by remember {
        mutableStateOf("")
    }
    val vegetablesItemList = listOf(
        GroceryData(R.drawable.carrot, "Carrot", "Ksh. 120.00/Kg", seashell),
        GroceryData(R.drawable.tomato, "Tomato", "Ksh. 130.50/Kg", aliceBlue),
        GroceryData(R.drawable.pumpkin, "Pumpkin", "Ksh. 90.60/Kg", cultured),
        GroceryData(R.drawable.cauliflower, "Cauliflower", "Ksh. 100.00/Kg", azureishWhite),
        GroceryData(R.drawable.red_capsicum, "Capsicum", "Ksh. 300.10/Kg", seashell),
        GroceryData(R.drawable.onion, "Onion", "Ksh. 250.00/Kg", aliceBlue),
    )
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        LazyColumn {
            item {
                Spacer(modifier = Modifier.height(24.dp))
                Row(
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp)
                ) {
                    Image(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "Back Arrow Image"
                    )
                    Text(
                        text = "Lengkapi Nutrisimu",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Image(
                        painter = painterResource(id = R.drawable.filter),
                        contentDescription = "Filter Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(modifier = Modifier.height(36.dp))
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
            }
            items(vegetablesItemList.windowed(2,2,true)) { sublist ->
                Row(modifier = Modifier.fillMaxWidth()) {
                    sublist.foEach { item ->
                        Card(
                            modifier = Modifier
                                .fillParentMaxWidth(0.5f)
                                .padding(4.dp),
                            shape = RoundedCornerShape(16.dp),
                            backgroundColor = item.cardBg,
                            onClick = {
                                actions.gotoVegetableDetail()
                            }
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp),
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(4.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(item.image),
                                        contentDescription = "Vegetable",
                                    )
                                }
                                Spacer(modifier = Modifier.height(24.dp))
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Column(modifier = Modifier.wrapContentHeight()) {

                                        Text(
                                            text = item.name,
                                            fontSize = 13.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = black,
                                        )
                                        Text(
                                            text = item.price,
                                            fontSize = 11.sp,
                                            color = black,
                                        )
                                    }
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(gold),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Add,
                                            contentDescription = stringResource(R.string.text_add_icon),
                                            tint = white
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
}