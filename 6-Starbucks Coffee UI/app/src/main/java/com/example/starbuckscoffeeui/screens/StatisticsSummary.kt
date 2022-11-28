package com.example.starbuckscoffeeui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


// Will hold all the views and composable functions
// It will then be called in the MainActivity file



@Composable
fun StatisticsSummary() {
    MaterialTheme() {
        LazyRow(modifier = Modifier.fillMaxWidth()) {
            item{
            Row(modifier = Modifier.padding(start = 10.dp, top = 10.dp).fillMaxWidth()) {
                Card(
                    elevation = 10.dp,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(8.dp))
                ) {
                    Box(modifier = Modifier
                        .height(60.dp)
                        .width(120.dp)
                        .background(color = Color(red = 32, green = 151, blue = 64))
                    )

                    {
                        Column(
                            modifier = Modifier.padding(5.dp),
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                text = "99+",
                                style = TextStyle(
                                    fontFamily = FontFamily.Monospace,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.White
                                )
                            )
                            Text(
                                text = "All Products",
                                style = TextStyle(
                                    color = Color.White,
                                    fontFamily = FontFamily.Monospace,
                                    fontWeight = FontWeight.SemiBold
                                )
                            )
                        }
                    }
                }
                //Next Card
                Card(
                    elevation = 10.dp,
                    modifier = Modifier
                        .padding(start = 10.dp, bottom = 10.dp)
                        .alpha(0.30f)
                        .clip(shape = RoundedCornerShape(8.dp))
                ) {
                    Box(modifier = Modifier
                        .height(60.dp)
                        .width(120.dp)

                    )
                    {
                        Column(modifier = Modifier.padding(5.dp),) {
                            Text(
                                text = "23",
                                style = TextStyle(
                                    fontWeight = FontWeight.Bold,
                                    fontFamily = FontFamily.Monospace
                                )
                            )
                            Text(
                                text = "Food",
                                style = TextStyle(
                                    fontWeight = FontWeight.SemiBold,
                                    fontFamily = FontFamily.Monospace
                                )
                            )

                        }

                    }


                }
                // Next card
                Card(
                    elevation = 10.dp,
                    modifier = Modifier
                        .padding(start = 10.dp, bottom = 10.dp)
                        .alpha(0.30f)
                        .clip(shape = RoundedCornerShape(8.dp))
                ) {
                    Box(modifier = Modifier
                        .height(60.dp)
                        .width(120.dp))
                    {
                        Column(modifier = Modifier.padding(5.dp),) {
                            Text(
                                text = "48",
                                style = TextStyle(
                                    fontWeight = FontWeight.Bold,
                                    fontFamily = FontFamily.Monospace
                                )
                            )
                            Text(
                                text = "Coffees",
                                style = TextStyle(
                                    fontWeight = FontWeight.SemiBold,
                                    fontFamily = FontFamily.Monospace
                                )
                            )

                        }

                    }


                }
                // Next card
                Card(
                    elevation = 10.dp,
                    modifier = Modifier
                        .padding(start = 10.dp, bottom = 10.dp)
                        .alpha(0.30f)
                        .clip(shape = RoundedCornerShape(8.dp))
                ) {
                    Box(modifier = Modifier
                        .height(60.dp)
                        .width(120.dp))
                    {
                        Column(modifier = Modifier.padding(5.dp),) {
                            Text(
                                text = "14",
                                style = TextStyle(
                                    fontWeight = FontWeight.Bold,
                                    fontFamily = FontFamily.Monospace
                                )
                            )
                            Text(
                                text = "Teas",
                                style = TextStyle(
                                    fontWeight = FontWeight.SemiBold,
                                    fontFamily = FontFamily.Monospace
                                )
                            )

                        }

                    }


                }
                // Next card
                Card(
                    elevation = 10.dp,
                    modifier = Modifier
                        .padding(start = 10.dp, bottom = 10.dp)
                        .alpha(0.30f)
                        .clip(shape = RoundedCornerShape(8.dp))
                ) {
                    Box(modifier = Modifier
                        .height(60.dp)
                        .width(120.dp))
                    {
                        Column(modifier = Modifier.padding(5.dp),) {
                            Text(
                                text = "52",
                                style = TextStyle(
                                    fontWeight = FontWeight.Bold,
                                    fontFamily = FontFamily.Monospace
                                )
                            )
                            Text(
                                text = "Creamers",
                                style = TextStyle(
                                    fontWeight = FontWeight.SemiBold,
                                    fontFamily = FontFamily.Monospace
                                )
                            )

                        }

                    }


                }
                
            }
        }
            
        }
        

    }
}


@Composable
@Preview
fun StatisticsPreview(){
    StatisticsSummary()
}