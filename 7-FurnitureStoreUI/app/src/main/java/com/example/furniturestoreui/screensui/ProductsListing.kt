package com.example.furniturestoreui.screensui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.furniturestoreui.R
import com.example.furniturestoreui.barcomponents.TopBarWithBackProductListing
import com.example.furniturestoreui.ui.theme.black
import com.example.furniturestoreui.ui.theme.platinum
import com.example.furniturestoreui.ui.theme.texttitlewhite
import com.example.furniturestoreui.ui.theme.white


@Preview(showBackground = true)
@Composable
fun ProductListing(){
    Box(modifier = Modifier.verticalScroll(rememberScrollState())){
        Column {
            TopBarWithBackProductListing(
                title = "Armchairs",
                onBackClick = {

                },
            )
            Column {
                ContentList()
            }

        }
    }

}

@Composable
fun ContentList(){
    Column {
        SortFilter()
        Spacer(modifier = Modifier.padding(24.dp))
        Products()

    }
}


@Composable
fun SortFilter(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = { /*TODO*/ },
            border = BorderStroke(1.dp, platinum),
            colors = ButtonDefaults.buttonColors(backgroundColor = white),
            modifier = Modifier.padding(8.dp)

        ) {
            Icon(
                imageVector = Icons.Default.List,
                contentDescription = "",
                tint = Color.Black,
                modifier = Modifier.padding(end = 4.dp)
            )
            Text(
                text = "Sort",
                color = black
            )
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = white),
            elevation = ButtonDefaults.elevation(8.dp),
            modifier = Modifier
                .padding(8.dp)
                .clip(shape = RoundedCornerShape(8.dp))

        ) {
            Icon(
                imageVector = Icons.Default.List,
                contentDescription = "",
                tint = black,
                modifier = Modifier.padding(end = 4.dp)
            )
            Text(
                text = "Filter",
                color = black
            )

        }


    }
}


@Composable
fun Products(){
    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ){
        item {
            LeftSide()
            RightSide()
        }
    }
}


@Composable
fun LeftSide(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        LeftItem(
            imagePainter = painterResource(id = R.drawable.img_3),
            title = "Matteo Armchair",
            price = "$260"
        )
        LeftItem(
            imagePainter = painterResource(id = R.drawable.img_4),
            title = "Primrose Accent",
            price = "$892"
        )
        LeftItem(
            imagePainter = painterResource(id = R.drawable.img_5),
            title = "Crandall 21",
            price = "$845"
        )

    }
}


@Composable
fun LeftItem(
    imagePainter: Painter,
    title : String = "",
    price: String = ""
){
    Card(
        modifier = Modifier
            .width(150.dp)
            .height(150.dp)
            .clickable { },
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = title, color = texttitlewhite
            )
            Text(text = price, fontWeight = FontWeight.Bold)
        }
    }
    Box(
        modifier = Modifier
            .offset(20.dp, (-190).dp)
            .height(120.dp)
    ){
        Image(
            contentScale = ContentScale.Fit,
            painter = imagePainter,
            contentDescription = "",
            modifier = Modifier.aspectRatio(1f)
        )
    }

}

@Composable
fun RightSide(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp, start = 16.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        RightItem(
            imagePainter = painterResource(id = R.drawable.img),
            title = "Araceli Armchair",
            price = "$299.0"
        )
        RightItem(
            imagePainter = painterResource(id = R.drawable.img_1),
            title = "Araceli Armchair",
            price = "$346.0"
        )
        RightItem(
            imagePainter = painterResource(id = R.drawable.img_3),
            title = "Dunham Armchair",
            price = "$783.0"
        )

    }
}


@Composable
fun RightItem(
    imagePainter: Painter,
    title: String = "",
    price: String = ""
){
    Card(
        modifier = Modifier
            .width(150.dp)
            .height(150.dp)
            .clickable { },
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(text = title, color = texttitlewhite)
            Text(text = price, fontWeight = FontWeight.Bold)
        }
    }
        Box(
            modifier = Modifier
                .offset(
                    20.dp, (-210).dp)
                .height(120.dp)
        ){
            Image(
                contentScale = ContentScale.Fit,
                painter = imagePainter,
                contentDescription = "",
                modifier = Modifier.aspectRatio(1f)
            )
        }
    }