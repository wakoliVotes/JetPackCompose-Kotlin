package com.example.furniturestoreui.screensui


import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.furniturestoreui.R


@Preview
@Composable
fun DashBoardUI() {
    val itemList = listOf("Chairs", "Sofa", "Beds", "Tables")

    androidx.compose.material.Surface(
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
                title = "Aracelli\n + " +
                        "Armchair",
                price = "$340"
            )
        }
        item {
            ChairsItem(
                imagePainter = painterResource(id = R.drawable.img_2s),
                title = "Primrose\n + " +
                        "Armchair",
                price = "$340"
            )
        }

    }
}