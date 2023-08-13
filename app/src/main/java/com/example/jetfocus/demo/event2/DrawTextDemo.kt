package com.example.jetfocus.demo.event2

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalTextApi::class)
@Composable
@Preview
fun DrawTextDemo() {
    val textMeasurer = rememberTextMeasurer()
    Canvas(modifier = Modifier
        .size(200.dp, 200.dp)
        .background(Color.White)) {
        drawText(textMeasurer.measure("Hello Compose!"), Color.Black)
    }
}