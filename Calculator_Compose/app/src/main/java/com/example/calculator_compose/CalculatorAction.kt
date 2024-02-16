package com.example.calculator_compose

sealed class CalculatorAction{
    data class Number( val number: Int): calculatorAction()
    object Clear: CalculatorAction();
    object Delete: CalculatorAction();
    object Decimal: CalculatorAction();
    object Calculate: CalculatorAction();
    data class Operation(val opertaion: CalculatorOpertaion):CalculatorAction()
}