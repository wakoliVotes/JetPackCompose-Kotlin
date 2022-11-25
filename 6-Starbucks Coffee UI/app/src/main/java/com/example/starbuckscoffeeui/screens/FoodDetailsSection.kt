package com.example.starbuckscoffeeui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun FoodDetailsSection() {
//    Text(text = "Welcome to Starbucks Coffee")
    MaterialTheme() {
        Column() {
            Box(){
                Row(
                    modifier =Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = "Food",
                        style = TextStyle(fontFamily = FontFamily.Monospace),
                        fontSize = 19.sp
                    )


                    Text(
                        text = "See  All",
                        style = TextStyle(fontSize = 13.sp),
                    modifier = Modifier.padding(top = 4.dp, end = 10.dp)
                    )

                }
            }
            Spacer(Modifier.height(15.dp))
            Row(horizontalArrangement = Arrangement.Absolute.SpaceBetween) {
                Box(modifier = Modifier
                    .height(50.dp)
                    .width(70.dp)
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "food one",
                        Modifier.clip(RoundedCornerShape(topEnd = 8.dp, bottomEnd = 8.dp, bottomStart = 8.dp))
                    )
                }
                Column() {
                    Text(
                        text = "Honey BBQ Chicken",
                        style = TextStyle(fontFamily = FontFamily.Monospace)
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                        Text(
                            text = "8 min",
                            style = TextStyle(fontWeight = FontWeight.Bold)
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        Text(
                            text = "370 kcal",
                            style = TextStyle(fontWeight = FontWeight.Bold)

                        )
                        Text(
                            modifier = Modifier.padding(end = 10.dp),
                            text = "$13",
                            style = TextStyle(fontFamily = FontFamily.Monospace, fontWeight = FontWeight.SemiBold)
                        )

                    }

                }
                
            }
            

        }

    }
}


@Composable
@Preview
fun FoodPreview(){
    FoodDetailsSection()
}