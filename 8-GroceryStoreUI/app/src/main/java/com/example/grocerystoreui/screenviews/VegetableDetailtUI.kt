package com.example.grocerystoreui.screenviews

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.runtime.Composable
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
import com.example.grocerystoreui.navigation.MainActions
import com.example.grocerystoreui.ui.theme.*

@Composable
fun VegetableDetailUI(actions: MainActions) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(azureishWhite)
    ) {
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(white)
                    .padding(8.dp)
            )
            {
                Icon(imageVector = Icons.Outlined.KeyboardArrowLeft,
                    contentDescription = stringResource(R.string.text_back_icon),
                    tint = Color.Red
                )
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        )
        {
            Image(painter = painterResource(id = R.drawable.red_capsicum),
                contentDescription = "Tomato Image",
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(44.dp))
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .clip(RoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp))
                .background(white)
                .padding(24.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            )
            {
                Text(
                    text = "Sawi Hijau",
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
                Text(
                    text = "Ksh. 34.00/Kg",
                    color = gold,
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Sawi Hijau It contains folate, potassium, vitamin C, and vitamin B-6 and cholesterol. Vitamin B-6 and folate prevent penampukan compounds.",
                    color = Color.Gray,
                    fontSize = 24.sp
                )
                Spacer(modifier = Modifier.height(28.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Column(modifier = Modifier.wrapContentHeight()) {
                        Text(
                            text = "Total",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = black,
                        )
                        Text(
                            text = "Ksh. 34.00/Kg",
                            color = gold,
                            fontSize = 14.sp
                        )
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(lightSilver)
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Icon(imageVector = Icons.Default.Add,
                                contentDescription = stringResource(R.string.text_add_icon),
                                tint = white
                            )
                        }

                    }
                    Spacer(modifier = Modifier.height(24.dp))
                    Button(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(24.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = blue
                        ),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(
                            text = "Next",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                }
            }
        }
    }
}