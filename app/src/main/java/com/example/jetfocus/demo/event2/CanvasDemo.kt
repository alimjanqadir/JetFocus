package com.example.jetfocus.demo.event2

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(backgroundColor = 0xFFFFFFFF, showBackground = true)
@Composable
fun CanvasDemo() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(Color.Red, radius = 100.dp.toPx())
        drawCircle(Color.Green, radius = 80.dp.toPx())
        drawCircle(Color.Blue, radius = 60.dp.toPx())
        drawRect(
            Color.Black,
            topLeft = Offset(
                center.x - (250.dp / 2).toPx(),
                center.y - (300.dp / 2).toPx()
            ),
            size = Size(250.dp.toPx(), 300.dp.toPx()),
            style = Stroke(10.dp.toPx())
        )
    }
}