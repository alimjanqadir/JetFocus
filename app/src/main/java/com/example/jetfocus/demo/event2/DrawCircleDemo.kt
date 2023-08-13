package com.example.jetfocus.demo.event2

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random.Default.nextFloat

//@Preview
@Preview
@Composable
fun DrawCircleDemo() {
    var circleCenter by remember { mutableStateOf(Offset.Zero) }
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .pointerInput(Unit) {

            }
    ) {

    }

}

@Preview
@Composable
fun BouncingBallHorizontalDemo() {
    var xSpeed by remember { mutableFloatStateOf(100f) }
    var circleCenter by remember { mutableStateOf(Offset.Zero) }
    val radius = 20.dp

    Canvas(modifier = Modifier
        .fillMaxSize()
        .onSizeChanged {
            circleCenter = Offset((it.width / 2).toFloat(), (it.height / 2).toFloat())
        }

    ) {
        if (circleCenter.x + radius.toPx() <= 0) {
            xSpeed = 100f
        }

        if (circleCenter.x + radius.toPx() >= size.width) {
            xSpeed = -100f
        }

        circleCenter += Offset(xSpeed, 0f)

        drawCircle(Color.Red, 20.dp.toPx(), circleCenter)
    }
}

@Preview
@Composable
fun BouncingBallDemo() {
    var xSpeed by remember { mutableFloatStateOf(100f) }
    var ySpeed by remember { mutableFloatStateOf(100f) }
    var circleCenter by remember { mutableStateOf(Offset.Zero) }
    val radius = 20.dp

    Canvas(modifier = Modifier
        .fillMaxSize()
        .onSizeChanged {
            circleCenter = Offset((it.width / 2).toFloat(), (it.height / 2).toFloat())
        }

    ) {
        if (circleCenter.x <= 0) {
            xSpeed = 100f
        }

        if (circleCenter.x >= size.width) {
            xSpeed = -100f
        }

        if (circleCenter.y <= 0) {
            ySpeed = 100f
        }

        if (circleCenter.y >= size.height) {
            ySpeed = -100f
        }

        circleCenter += Offset(xSpeed, ySpeed)

        drawCircle(Color.Red, radius.toPx(), circleCenter)
    }
}

@Preview
@Composable
fun BouncingBallRandomDemo() {
    var xSpeed by remember { mutableFloatStateOf(100f) }
    var ySpeed by remember { mutableFloatStateOf(100f) }
    var circleCenter by remember { mutableStateOf(Offset.Zero) }

    val radius = 20.dp

    fun randomSpeed() = nextFloat() * 100

    Canvas(modifier = Modifier
        .fillMaxSize()
        .onSizeChanged {
            circleCenter = Offset((it.width / 2).toFloat(), (it.height / 2).toFloat())
        }

    ) {
        if (circleCenter.x <= 0) {
            xSpeed = randomSpeed()
        }

        if (circleCenter.x >= size.width) {
            xSpeed = -randomSpeed()
        }

        if (circleCenter.y <= 0) {
            ySpeed = randomSpeed()
        }

        if (circleCenter.y >= size.height) {
            ySpeed = -randomSpeed()
        }

        circleCenter += Offset(xSpeed, ySpeed)

        drawCircle(Color.Red, radius.toPx(), circleCenter)
    }
}