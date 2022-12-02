package com.example.grocerystoreui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.Build
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.grocerystoreui.ui.theme.black
import com.example.grocerystoreui.ui.theme.blue
import com.example.grocerystoreui.R


@Composable
fun TopBarWithBackArrow(title: String, onBackClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        IconButton(
            onClick = { onBackClick() }
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = stringResource(R.string.text_back_icon),
                tint = black,
                modifier = Modifier.size(32.dp)
            )
            
        }
        Text(text = title,
            color = Color.Black,
            modifier = Modifier.padding(start = 16.dp),
            textAlign = TextAlign.Center,
            fontSize = 10.sp
        )
        IconButton(
            onClick = { /*TODO*/ }
        ) {
            Icon(imageVector = Icons.Outlined.Build,
                contentDescription = stringResource(R.string.text_filter_icon),
                tint = blue
            )
        }
    }
}