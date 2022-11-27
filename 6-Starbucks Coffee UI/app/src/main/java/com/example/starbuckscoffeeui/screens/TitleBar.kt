package com.example.starbuckscoffeeui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.starbuckscoffeeui.R

// Will hold all the views and composable functions
// It will then be called in the MainActivity file



@Composable
fun TitleBar() {
//    Text(text = "Welcome to Starbucks Coffee")
    MaterialTheme {
        Row (
            horizontalArrangement = Arrangement.SpaceBetween
                )
        {
            Text(
                text = "Starbucks Coffee",
                style = TextStyle(
                    fontFamily = FontFamily.Monospace,
                    fontSize = 19.sp
                )
            )
            Box(
                modifier = Modifier
                    .width(45.dp)
                    .height(45.dp)
            ){
                Box
                {
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(shape = CircleShape)
                            .background(Color.Red)
                    )
                    Image(
                        modifier = Modifier
                            .width(22.dp)
                            .height(22.dp)
                        ,
                        painter = painterResource(id = R.drawable.ic_outline_shopping_basket_24),
                        contentDescription = "Shopping Cart"
                    )


            }

        }
        
    }
}
}


@Composable
@Preview
fun TitleBarPreview(){
    TitleBar()
}