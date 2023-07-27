package com.example.jetfocus.demo.event2

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(backgroundColor = 0xFFFFFFFF, showBackground = true)
@Composable
fun CanvasDemo() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(Color.Black)
    }
}