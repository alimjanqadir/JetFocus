package com.example.jetfocus.demo.event2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import graphics.drawGrid
import graphics.drawRuler


@Preview(device = "spec:width=240dp,height=240dp,dpi=640")
@Composable
@ExperimentalTextApi
fun QuadraticCurveDemo() {
    val textMeasurer = rememberTextMeasurer()
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .drawWithCache {
            val path = Path()
            path.moveTo(40.dp.toPx(), 40.dp.toPx())
            path.relativeQuadraticBezierTo(
                40.dp.toPx(), 120.dp.toPx(),
                80.dp.toPx(), 0.dp.toPx()
            )
            onDrawBehind {
                drawRuler(textMeasurer)
                drawGrid()
                // cursor 20 80
                drawCircle(Color.Black, radius = 10f, Offset(80.dp.toPx(), 160.dp.toPx()))

                drawPath(path, Color.Black, style = Stroke(4.dp.toPx()))
            }
        })
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun QuadraticCurveDemo1() {
    val textMeasurer = rememberTextMeasurer()
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .drawWithCache {
            val path = Path()
            onDrawBehind {
                drawRuler(textMeasurer)
                drawGrid()

                path.moveTo(40.dp.toPx(), 40.dp.toPx())
                path.relativeQuadraticBezierTo(
                    40.dp.toPx(), -40.dp.toPx(),
                    80.dp.toPx(), 0.dp.toPx()
                )
                path.relativeMoveTo(-100.dp.toPx(), 40.dp.toPx())
                path.relativeQuadraticBezierTo(
                    60.dp.toPx(), -40.dp.toPx(),
                    120.dp.toPx(), 0.dp.toPx()
                )
                path.relativeMoveTo(
                    -140.dp.toPx(),
                    40.dp.toPx()
                )
                path.relativeQuadraticBezierTo(
                    80.dp.toPx(),
                    -40.dp.toPx(),
                    160.dp.toPx(),
                    0.dp.toPx()
                )
                drawPath(path, Color.Black, style = Stroke(4.dp.toPx()))
            }
        })
}


@OptIn(ExperimentalTextApi::class)
@Preview(device = "spec:width=240dp,height=240dp,dpi=640")
@Composable
fun QuadraticCurveDemoResult() {
    val textMeasurer = rememberTextMeasurer()
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .drawWithCache {
            val path = Path()
            path.moveTo(50f.dp.toPx(), 170f.dp.toPx())
            path.quadraticBezierTo(
                100f.dp.toPx(),
                80f.dp.toPx(),
                150f.dp.toPx(),
                170f.dp.toPx()
            )
            path.moveTo(100f.dp.toPx(), 125f.dp.toPx())
            path.quadraticBezierTo(
                150f.dp.toPx(),
                50f.dp.toPx(),
                200f.dp.toPx(),
                125f.dp.toPx()
            )
            path.moveTo(50f.dp.toPx(), 50f.dp.toPx())
            path.lineTo(200f.dp.toPx(), 50f.dp.toPx())
            path.lineTo(200f.dp.toPx(), 200f.dp.toPx())
            path.lineTo(50f.dp.toPx(), 200f.dp.toPx())
            path.lineTo(50f.dp.toPx(), 50f.dp.toPx())
            path.close()
            onDrawBehind {
                drawRuler(textMeasurer)
                drawGrid()

                drawPath(path, Color.Black, style = Stroke(20f))
            }
        })
}
