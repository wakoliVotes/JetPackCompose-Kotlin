package com.example.starbuckscoffeeui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Will hold all the views and composable functions
// It will then be called in the MainActivity file



@Composable
fun AllHomeDashboard() {
    Column (
        modifier = Modifier.padding(start = 10.dp, end = 10.dp)
            ) {
        // calling all the other functions
        TitleBar()
         StatisticsSummary()
        PopularCoffee()
        FoodDetailsSection()

        // VanillaSweetDetails()
        
    }
}
@Composable
@Preview
fun HomePreview(){
    AllHomeDashboard()
}