package com.example.starbuckscoffeeui.screens


import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// Will hold all the views and composable functions
// It will then be called in the MainActivity file



@Composable
fun StatisticsSummary() {
    Text(text = "Welcome to Starbucks Coffee")
}


@Composable
@Preview
fun StatisticsPreview(){
    StatisticsSummary()
}