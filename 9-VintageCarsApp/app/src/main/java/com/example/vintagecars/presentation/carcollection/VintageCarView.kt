package com.example.vintagecars.presentation.carcollection

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vintagecars.R
import com.example.vintagecars.ui.theme.hueGreen
import com.example.vintagecars.ui.theme.hueLight
import com.example.vintagecars.ui.theme.lightBlue

@Preview
@Composable
fun VintageCarView() {
    MaterialTheme {
        CarAndSummary()
    }
}

@Preview
@Composable
fun CarAndSummary() {
    // Name Image Summary
    Column(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())

    ) {
        Text(
            text = "Aston Martin DB5 1964",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                color = Color.DarkGray
            ),
            modifier = Modifier
                .padding(start = 5.dp, bottom = 8.dp)
        )
        Card(
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Row (
                modifier = Modifier.background(hueGreen)
                    ) {
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "car image",
                    modifier = Modifier
                        .width(175.dp)
                        .height(140.dp)
                        .padding(5.dp)
                        .clip(RoundedCornerShape(4.dp, 0.dp)),
                    contentScale = ContentScale.FillBounds
                )
                Column {
                    // summary + details
                    Text(
                        modifier = Modifier
                            .padding(top = 5.dp, end = 10.dp),
                        text = "The Aston Martin DB5 was designed to be a talking point and that’s something that’s never really changed. Not only is this one of the most impressive classic cars, it’s also one of the rarest and the most iconic",
                        style = TextStyle(
                            fontSize = 10.sp,
                            textAlign = TextAlign.Justify
                        )
                    )
                    Text(
                        modifier = Modifier
                            .padding(top = 2.dp, end = 10.dp, bottom = 30.dp),
                        text = "Name dropped in the James Bond franchise as well as elsewhere in popular culture, its sky-high price has grown an estimated 790 times since it first arrived on the market. Conceptualized by the Italian designer Carrozzeria Touring Superleggera in Milan, this cool old car was always designed to make an entrance. The more time passes, the bigger the entrance promises to be. ",
                        style = TextStyle(
                            fontSize = 10.sp,
                            textAlign = TextAlign.Justify
                        )
                    )
                }
            }
        }
        CarDetails()
    }
}

@Preview
@Composable
fun CarDetails() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(start = 3.dp,end = 3.dp)
            .offset(0.dp, (-24).dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(5.dp, 12.dp, 5.dp, 5.dp)
        ) {
            Column(
                modifier = Modifier.padding(start = 10.dp)

            ) {
                Text(
                    text = "Brand",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 10.sp
                    )
                )
                Text(
                    text = "Aston Martin",
                    style = TextStyle(
                        fontSize = 9.sp,
                        color = Color.Blue
                    )
                )
            }
            Column {
                Text(
                    text = "Release Year",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 10.sp
                    )
                )
                Text(
                    text = "1964",
                    style = TextStyle(
                        fontSize = 9.sp,
                        color = Color.Magenta
                    )
                )
            }
            Column {
                Text(
                    text = "Model",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 10.sp
                    )
                )
                Text(
                    text = "DB5",
                    style = TextStyle(
                        fontSize = 9.sp,
                        color = Color.Blue
                    )
                )
            }
            Column(
                modifier = Modifier
                    .padding(end = 10.dp)
            ) {
                Text(
                    text = "Sale Value Now",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 10.sp
                    )
                )
                Text(
                    text = "$990000",
                    style = TextStyle(
                        fontSize = 9.sp,
                        color = Color.Magenta
                    )
                )
            }
        }
    }
}