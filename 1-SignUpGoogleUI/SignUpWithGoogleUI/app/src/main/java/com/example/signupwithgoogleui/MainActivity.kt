package com.example.signupwithgoogleui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.signupwithgoogleui.ui.theme.SignUpWithGoogleUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignUpWithGoogleUITheme {
                Column(modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    GoogleButton (
                        text = "Sign Up with Google",
                        loadingText = "Creating Account ...."

                    ) {
                        Log.d("googleButton", "Clicked")
                    }

                }

                }

            }
        }
}
@Composable
@Preview
fun PreviewMain(){
    GoogleButton {
        
    }
}