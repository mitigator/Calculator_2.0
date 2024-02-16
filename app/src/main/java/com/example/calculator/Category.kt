package com.example.calculator

import androidx.compose.ui.graphics.Color
import com.example.calculator.ui.theme.Blue
import com.example.calculator.ui.theme.Green
import com.example.calculator.ui.theme.Orange
import com.example.calculator.ui.theme.Red


enum class Category(val color: Color) {
    Underweight(Blue),
    Normal(Green),
    Overweight(Orange),
    Obese(Red),
}