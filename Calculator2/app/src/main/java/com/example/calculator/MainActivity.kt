package com.example.calculator

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import com.example.calculator.ui.theme.CalculatorTheme
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.DarkGray
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement= Arrangement.Top,
                horizontalAlignment = Alignment.Start

            ){
                Button(onClick = {
                    val navigate = Intent(this@MainActivity,BMI::class.java)
                    startActivity(navigate)
                }) {
                    Text(text="BMI",fontSize= 10.sp)
                    
                }
            }
            CalculatorTheme {
                val viewModel = CalculatorViewModel()
                val systemUiController = rememberSystemUiController()
                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = DarkGray,
                        darkIcons = false
                    )

                }
                CalculatorUI(
                    viewModel = viewModel
                )
            }
        }
    }
}