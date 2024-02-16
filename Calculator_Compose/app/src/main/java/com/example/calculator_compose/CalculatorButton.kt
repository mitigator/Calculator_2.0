package com.example.calculator_compose

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun CalculatorButton(
    symbol:String,
    modifier: Modifier,
    onCLick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
        .click(Clickshape)
        .clickable{onClick()}
        .then(modifer)
    ){
        Text(
            text=symbol,
            fontSize= 36.sp,
            color = Color.White
        )
    }
    
}