package com.example.jetfocus.demo.event1

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//TODO(Theme, DynamicColor, Preview)

@Preview
@Composable
fun Counter() {
    var count by remember { mutableStateOf(0) }
    Row {
        Button(onClick = { count += 1 }) {
            Text("+")
        }
        Text(
            text = "$count", fontSize = 24.sp, modifier = Modifier.padding(8.dp)
        )
        Button(onClick = { count -= 1 }) {
            Text("-")
        }
    }
}