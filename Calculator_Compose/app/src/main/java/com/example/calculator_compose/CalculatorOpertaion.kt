package com.example.calculator_compose

sealed class CalculatorOpertaion(val symbol:String) {
    object Add: CalculatorOpertaion("+")
    object Substract: CalculatorOpertaion("-")
    object Multiply: CalculatorOpertaion("*")
    object Divide: CalculatorOpertaion("/")
}