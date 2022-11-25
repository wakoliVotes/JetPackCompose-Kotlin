package com.example.starbuckscoffeeui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.starbuckscoffeeui.R

// Will hold all the views and composable functions
// It will then be called in the MainActivity file



@Composable
fun PopularCoffee() {
        // Text(text = "Welcome to Starbucks Coffee")
    MaterialTheme {
        Box(
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Popular Coffee",
                    style = TextStyle(fontFamily = FontFamily.Monospace),
                    fontSize = 19.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "See All",
                    style = TextStyle(fontSize = 13.sp),
                    modifier = Modifier
                        .alpha(0.4f)
                        .padding(top = 4.dp, end = 10.dp)
                )
            }
        }
                Spacer(modifier = Modifier.height(35.dp))
                // Next Section with Image
                // Use Row
                Row(
                    modifier = Modifier
                        .padding(start = 10.dp, bottom = 40.dp, top = 30.dp)
                ) {
                    Card(elevation = 10.dp, shape = RoundedCornerShape(8.dp)) {
                        Box(modifier = Modifier.width(130.dp)) {
                            Column(
                                modifier = Modifier
                                    .height(180.dp)
                                    .width(130.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img),
                                    contentDescription = "Popular Coffee",
                                    modifier = Modifier
                                        .clip(
                                            shape = RoundedCornerShape(
                                                topEnd = 8.dp,
                                                topStart = 8.dp
                                            )
                                        )

                                )

                                // Column for next items under image
                                Column(modifier = Modifier.padding(10.dp)) {
                                    Text(
                                        text = "Cold Brew",
                                        style = TextStyle(
                                            fontWeight = FontWeight.Bold,
                                            fontFamily = FontFamily.Monospace

                                        ),
                                        modifier = Modifier.alpha(0.87f)

                                    )
                                    // Next Text
                                    Text(
                                        text = "Calories - 200",
                                        style = TextStyle(
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Bold,
                                            fontFamily = FontFamily.Monospace
                                        ),
                                        modifier = Modifier.alpha(0.4f)
                                    )
                                    Spacer(modifier = Modifier.height(10.dp))
                                    //
                                    Box(

                                        modifier = Modifier
                                            .height(1.dp)
                                            .width(130.dp)
                                            .background(color = Color.Gray)
                                    ){

                                    }
                                    // Spacing
                                    Spacer(modifier = Modifier.height(10.dp))
                                    Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                        Text(
                                            text = "$14",
                                            style = TextStyle(
                                                fontWeight = FontWeight.Bold,
                                                fontFamily = FontFamily.Monospace
                                            ),
                                            modifier = Modifier.alpha(0.87f)
                                        )
                                        Text(
                                            text = "+",
                                            style = TextStyle(
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold,
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
fun PopularPreview(){
    PopularCoffee()
}