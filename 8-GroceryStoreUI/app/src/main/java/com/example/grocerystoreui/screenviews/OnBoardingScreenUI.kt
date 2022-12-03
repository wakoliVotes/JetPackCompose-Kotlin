package com.example.grocerystoreui.screenviews

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.grocerystoreui.R
import com.example.grocerystoreui.navigation.MainActions
import com.example.grocerystoreui.ui.theme.blue

@SuppressLint("ProduceStateDoesNotAssignValue")
@Composable
fun OnBoardingScreenUI(actions: MainActions) {
    var pageCount by remember {
        mutableStateOf(0)
    }
    val onBoardingImageList =
        listOf(
            R.drawable.onboarding_1,
            R.drawable.onboarding_2,
            R.drawable.onboarding_3
        )
    val onBoardingHeadingList =
        listOf(
            stringResource(id = R.string.onboarding_heading_1),
            stringResource(id = R.string.onboarding_heading_2),
            stringResource(id = R.string.onboarding_heading_3)
        )

    val onBoardingDescriptionList =
        listOf(
            stringResource(id = R.string.onboarding_description_1),
            stringResource(id = R.string.onboarding_description_2),
            stringResource(id = R.string.onboarding_description_3)
        )

    if (pageCount == 3) {
        produceState(initialValue = -1) { gotoDashBoard(actions) }
        return
    }
    androidx.compose.material.Surface(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 64.dp)
        ) {
            Image(painter = painterResource(id = onBoardingImageList[pageCount]),
                contentDescription = "OnBoarding Images",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
            Spacer(modifier = Modifier.height(44.dp))
            Text(
                text = onBoardingHeadingList[pageCount],
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = onBoardingDescriptionList[pageCount],
                textAlign = TextAlign.Center,
                color = Color.Gray,
                fontSize = 14.sp
            )
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .background(if (pageCount == 0) blue else Color.LightGray)
                        .clip(CircleShape)
                        .size(if (pageCount == 0) 10.dp else 8.dp)
                )
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                Box(
                    modifier = Modifier
                        .background(if (pageCount == 1) blue else Color.LightGray)
                        .clip(CircleShape)
                        .size(if (pageCount == 1) 10.dp else 8.dp)
                )
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                Box(
                    modifier = Modifier
                        .background(if (pageCount == 3) blue else Color.LightGray)
                        .clip(CircleShape)
                        .size(if (pageCount == 2) 10.dp else 8.dp)
                )

            }
            Spacer(modifier = Modifier.padding(horizontal = 24.dp))
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 16.dp)
                    ) {
                ClickableText(
                    text = AnnotatedString("Skip"),
                    onClick = {
                        gotoDashBoard(actions)
                    },
                    style = TextStyle(
                        textAlign = TextAlign.Center,
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                )
                Button(
                    onClick = {
                        pageCount++
                    },
                    elevation = null,
                    shape = RoundedCornerShape(24.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = blue
                    )
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

private fun gotoDashBoard(actions: MainActions) {
    actions.gotoDashBoard()
}