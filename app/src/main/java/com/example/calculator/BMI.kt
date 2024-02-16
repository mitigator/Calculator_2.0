package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculator.ui.theme.BackGround
import com.example.calculator.ui.theme. CalculatorTheme

import com.example.calculator.ui.theme.CalculatorTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class BMI : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                val viewModel = MainViewModel()
                val systemUiController = rememberSystemUiController()

                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = BackGround, //Your color
                        darkIcons = false
                    )
                }
                MainScreen(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = BackGround),
                    viewModel = viewModel
                )
            }
        }
    }
}

