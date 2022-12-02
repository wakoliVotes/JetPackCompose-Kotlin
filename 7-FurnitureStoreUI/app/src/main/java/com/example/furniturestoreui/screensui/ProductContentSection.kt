package com.example.furniturestoreui.screensui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.furniturestoreui.R
import com.example.furniturestoreui.barcomponents.TopBarWithBack
import com.example.furniturestoreui.ui.theme.orangedark
import com.example.furniturestoreui.ui.theme.orangelight
import com.example.furniturestoreui.ui.theme.paledark
import com.example.furniturestoreui.ui.theme.white

// TopBarWithBackProductList
@Preview(showBackground = true)
@Composable
fun ProductContentSection() {
    Box(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Column {
            TopBarWithBack(
                title = "Product",
                onBackClick = {
                },
            )
            Column {
                Content()
            }
        }
    }
}

@Composable
fun Content() {
    Column {
        ProductItemImage()
        ProductContent()
        ProductAbout()
        Spacer(modifier = Modifier.padding(24.dp))
        ProductAddtoCart()

    }
}

@Composable
fun ProductContent() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp)
    ) {
        Column {
            Text(
                text = "Osmond Armchair",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = paledark,
            )
            Text(
                text = "Chair",
                fontSize = 14.sp,
                color = white
            )

        }
        Card(
            modifier = Modifier
                .width(130.dp)
                .height(100.dp),
            elevation = 10.dp
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = "$346",
                    fontSize = 18.sp,
                    color = paledark,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun ProductItemImage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_2),
                contentDescription = "Product Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            )
        }
    }
}

@Composable
fun ProductAbout() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    )
    {
        Box(
            modifier = Modifier
                .size(30.dp)
                .clip(shape = CircleShape)
                .background(orangedark)
        )
        Box(
            modifier = Modifier
                .size(30.dp)
                .clip(shape = CircleShape)
                .background(orangedark)
        )
        Box(
            modifier = Modifier
                .size(30.dp)
                .clip(shape = CircleShape)
                .background(orangelight)
        )

    }
    Spacer(modifier = Modifier.padding(5.dp))
    Column(
        modifier = Modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "In a best traditions, constructed of hardwood\n" +
                    "with padding of high-resilient foam.Created\n" +
                    "by awarded winning duo of Manchesti\n" +
                    "Bermadi and Fresco Duli brothers.",
            fontSize = 18.sp,
            color = white,
            fontWeight = FontWeight.Bold
        )

    }
}


@Composable
fun ProductAddtoCart() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Red),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Card(
                modifier = Modifier
                    .offset(16.dp, ((-40).dp))
                    .fillMaxWidth()
                    .height(70.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.background(Color.DarkGray)
                ) {
                    Icon(
                        imageVector = Icons.Outlined.ShoppingCart,
                        contentDescription = "",
                        tint = white
                    )
                }
            }
            ClickableText(
                text = AnnotatedString("+ Add to Cart"),
                onClick = { offset -> }
            )
        }
    }
}