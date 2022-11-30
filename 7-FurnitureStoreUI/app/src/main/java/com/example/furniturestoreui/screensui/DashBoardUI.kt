package com.example.furniturestoreui.screensui


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.furniturestoreui.R


@Preview
@Composable
fun DashBoardUI() {
    val itemList = listOf("Chairs", "Sofa", "Beds", "Tables")

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Green)
    ) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.padding(5.dp))
            Header()
            Spacer(modifier = Modifier.padding(24.dp))
            CategoryChairs(itemList)
            Spacer(modifier = Modifier.padding(24.dp))
            CategoryBestOffers()
            Spacer(modifier = Modifier.padding(24.dp))
            CategoryMore()
        }
    }
}


@Composable
fun Header() {
    Row(
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("Our ")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.DarkGray
                    )
                ) {
                    append("Products")
                }
            },
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier,
            fontSize = 24.sp
        )

        Card(
            modifier = Modifier.width(50.dp),
            elevation = 4.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = ""
                )

            }

        }

    }
}


@Composable
fun CategoryChairs(itemList: List<String>) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        items(itemList.size) { item ->
            Box(
                modifier = Modifier.border(
                    color = if (item == 0) Color.DarkGray else Color.Transparent,
                    width = 2.dp,
                    shape = RoundedCornerShape(24.dp)
                )
            ) {
                Text(
                    modifier = Modifier.padding(
                        start = 16.dp,
                        top = 8.dp,
                        end = 16.dp,
                        bottom = 8.dp
                    ),
                    text = itemList[item],
                    color = if (item == 0) Color.DarkGray else Color.Transparent
                )

                Spacer(modifier = Modifier.padding(8.dp))
            }

        }
    }
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            ChairsItem(
                imagePainter = painterResource(id = R.drawable.img),
                title = "Matteo\n + " +
                        "Armchair",
                price = "$340"
            )
        }
        item {
            ChairsItem(
                imagePainter = painterResource(id = R.drawable.img_1),
                title = "Araceli\n + " +
                        "Armchair",
                price = "$340"
            )
        }
        item {
            ChairsItem(
                imagePainter = painterResource(id = R.drawable.img_2),
                title = "Primrose\n + " +
                        "Armchair",
                price = "$340"
            )
        }

    }
}


@Composable
fun ChairsItem(
    imagePainter: Painter,
    title: String = "",
    price: String = "",
) {
    Card(
        modifier = Modifier
            .width(200.dp)
            .clickable {

            },
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
        {
            Image(
                painter = imagePainter,
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f),
                contentScale = ContentScale.Fit
            )
            Text(
                text = title, color = Color.White
            )
            Text(
                text = price, fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun CategoryBestOffers() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("Best")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.DarkGray
                    )
                ) {
                    append("Offers")
                }
            },
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier,
            fontSize = 24.sp
        )

        CategoryBestOffersItems(
            imagePainter = painterResource(id = R.drawable.img_7),
            title = "Ingrit MV",
            subtitle = "Sofa",
            price = "$2699",
            backgroundcolor = Color.LightGray
        )
        CategoryBestOffersItems(
            imagePainter = painterResource(id = R.drawable.img_7),
            title = "Montesquieu",
            subtitle = "Bed",
            price = "$1499",
            backgroundcolor = Color.LightGray
        )
        CategoryBestOffersItems(
            imagePainter = painterResource(id = R.drawable.img_7),
            title = "Molina Sofa",
            subtitle = "Sofa",
            price = "$1299",
            backgroundcolor = Color.LightGray
        )
        

    }
}

@Composable
fun CategoryBestOffersItems(
    imagePainter: Painter,
    title: String = "",
    subtitle: String = "",
    price: String = "",
    backgroundcolor: Color = Color.Transparent,

    ) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(top = 24.dp)
    )
    {
        Box(
            modifier = Modifier
                .height(90.dp)
                .fillMaxWidth(0.2f)
                .background(backgroundcolor),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier.padding(8.dp),
                painter = imagePainter,
                contentDescription = ""
            )
        }

    }
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .offset((-60).dp)
            .wrapContentHeight()
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = subtitle,
            fontSize = 12.sp,
            color = Color.Gray
        )
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .wrapContentHeight()
    ) {

        Text(
            text = price,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }
}


@Composable
fun CategoryMore() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "New",
            color = Color.DarkGray,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Soon",
            color = Color.White,
            fontSize = 14.sp,
            modifier = Modifier.offset((-60).dp)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .height(70.dp)
                .width(110.dp)
                .offset((20).dp),
            elevation = null,
            shape = RoundedCornerShape(
                topStartPercent = 50,
            ),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.DarkGray
            )

        ) {
            Text(
                text = "see more",
                color = Color.White,
                fontSize = 12.sp
            )
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "",
                modifier = Modifier.padding(start = 5.dp),
                tint = Color.White
            )

        }
    }
}