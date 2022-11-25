package com.example.starbuckscoffeeui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// Will hold all the views and composable functions
// It will then be called in the MainActivity file



@Composable
fun AllHomeDashboard() {
    Column {
        Text(text = "Welcome to Starbucks Coffee")
        // calling all the other functions
        TitleBar()
        StatisticsSummary()
        PopularCoffee()
        FoodDetailsSection()
        VanillaSweetDetails()
        
    }
}
@Composable
@Preview
fun HomePreview(){
    AllHomeDashboard()
}