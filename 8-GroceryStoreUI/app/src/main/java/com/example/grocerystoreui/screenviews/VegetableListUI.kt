package com.example.grocerystoreui.screenviews

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.grocerystoreui.R
import com.example.grocerystoreui.datautils.GroceryData
import com.example.grocerystoreui.navigation.MainActions
import com.example.grocerystoreui.ui.theme.aliceBlue
import com.example.grocerystoreui.ui.theme.azureishWhite
import com.example.grocerystoreui.ui.theme.cultured
import com.example.grocerystoreui.ui.theme.seashell

@Composable
fun VegetableListUI(actions: MainActions) {
    var text by remember {
        mutableStateOf("")
    }
    val vegetablesItemList = listOf(
        GroceryData(R.drawable.carrot, "Carrot", "Ksh. 120.00/Kg", seashell),
        GroceryData(R.drawable.tomato, "Tomato", "Ksh. 130.50/Kg", aliceBlue),
        GroceryData(R.drawable.pumpkin, "Pumpkin", "Ksh. 90.60/Kg", cultured),
        GroceryData(R.drawable.cauliflower, "Cauliflower", "Ksh. 100.00/Kg", azureishWhite),
        GroceryData(R.drawable.red_capsicum, "Capsicum", "Ksh. 300.10/Kg", seashell),
        GroceryData(R.drawable.onion, "Onion", "Ksh. 250.00/Kg", aliceBlue),
    )
    androidx.compose.material.Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        LazyColumn(

        ){
            item {
                Spacer(modifier = Modifier.height(24.dp))
                Row (
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp)
                        ) {
                    Image(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "Back Arrow Image"
                    )
                    Text(
                        text = ""
                    )

                }
            }
        }

    }


}