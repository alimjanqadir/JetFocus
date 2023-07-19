package com.example.jetfocus.demo.event1

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun RadioButtonDemo() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(true, onClick = {})
        Text(
            "A",
            fontSize = 24.sp,
            modifier = Modifier.padding(end = 16.dp)
        )
    }
}

@Preview
@Composable
fun RadioGroupDemo() {
    val radioOptions = listOf("A", "B", "C")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[0]) }
    val (a, b) = remember {mutableStateOf("")};
    Row(Modifier.selectableGroup()) {
        radioOptions.forEach { text ->
            Row(
                Modifier
                    .selectable(
                        selected = (text == selectedOption),
                        onClick = {
                            onOptionSelected(text)
                        },
                        role = Role.RadioButton
                    )
            ) {
                RadioButton(
                    selected = (text == selectedOption),
                    onClick = null
                )
                Text(
                    text = text,
                    fontSize = 24.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}