package com.example.calculator

data class ValueState(
    val label: String, // lable
    val suffix: String, // units
    val value: String = "", // A string representing the user's input value.
    val error: String? = null // error meaage if any
) {
    fun toNumber() = value.toDoubleOrNull()
}
