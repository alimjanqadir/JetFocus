@file:OptIn(ExperimentalTextApi::class)

package com.example.jetfocus.demo.event2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import graphics.drawGrid
import graphics.drawRuler


@OptIn(ExperimentalTextApi::class)
@Preview(device = "spec:width=250dp,height=250dp,dpi=640")
@Composable
fun CubicBezierCurveDemo() {
    val textMeasurer = rememberTextMeasurer()
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .drawWithCache {
            val path = Path()
            onDrawBehind {
                drawRuler(textMeasurer)
                drawGrid()

                // Draw Heart

                drawPath(path, Color.Black, style = Stroke(4.dp.toPx()))
            }
        })
}
