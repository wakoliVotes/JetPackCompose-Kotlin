package com.example.grocerystoreui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.grocerystoreui.navigation.NavGraph
import com.example.grocerystoreui.ui.theme.GroceryStoreUITheme


@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GroceriesUIMain()
        }
    }

    @Preview
    @Composable
    fun GroceriesUIMain() {
        GroceryStoreUITheme {
            androidx.compose.material.Surface(color = MaterialTheme.colors.background) {
                NavGraph()
            }
        }
    }
}