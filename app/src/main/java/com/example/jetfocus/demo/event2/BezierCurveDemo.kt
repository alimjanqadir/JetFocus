package com.example.jetfocus.demo.event2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import graphics.drawGrid
import graphics.drawRuler


@Preview(device = "spec:width=280dp,height=280dp,dpi=640")
@Composable
@ExperimentalTextApi
fun BezierCurveDemo() {
    val textMeasurer = rememberTextMeasurer()

    Box(modifier = Modifier
        .size(280.dp)
        .background(Color.White)
        .drawBehind {
            drawRuler(textMeasurer)
            drawGrid()
        })
}

