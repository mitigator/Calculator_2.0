package com.example.calculator

@Composable
private fun ModeSelector(selectedMode: BmiViewModel.Mode, updateMode: (BmiViewModel.Mode) -> Unit) {
    Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
        BmiViewModel.Mode.values().forEach {
            ElevatedFilterChip(selectedMode == it, onClick = { updateMode(it) },
                label = {
                    Text(it.name)
                }
            )
        }
    }
}

annotation class Composable

@Composable
fun RowScope.ActionButton(text: String, onClick: () -> Unit) {
    val focusManager = LocalFocusManager.current
    Button(
        onClick = { focusManager.clearFocus(); onClick() },
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.weight(1f),
        contentPadding = PaddingValues(14.dp)
    ) {
        Text(text, fontSize = 15.sp)
    }
}

@Composable
fun CustomTextField(state: ValueState, imeAction: ImeAction, onValueChange: (String) -> Unit, ) {
    val focusManager = LocalFocusManager.current
    OutlinedTextField(
        value = state.value,
        isError = state.error != null,
        supportingText = { state.error?.let { Text(it) } },
        label = { Text(state.label) },
        suffix = { Text(state.prefix) },
        onValueChange = onValueChange,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal, imeAction = imeAction),
        keyboardActions = KeyboardActions(onDone = {
            focusManager.clearFocus()
        })
    )
}
