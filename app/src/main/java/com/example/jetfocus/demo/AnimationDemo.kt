package com.example.jetfocus.demo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun AnimationDemo() {
    var visible by remember { mutableStateOf(false) }
    Column {
        Button(onClick = { visible = !visible }) {
            if (visible) {
                Text("Hide")
            } else {
                Text("Show")
            }
        }
        AnimatedVisibility(visible) {
            Text("Hello")
        }
    }
}