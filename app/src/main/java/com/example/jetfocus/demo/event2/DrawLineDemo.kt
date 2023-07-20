package com.example.jetfocus.demo.event2

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun DrawLineDemo() {
    var startOffset by remember { mutableStateOf(Offset(0f, 0f)) }
    var endOffset by remember { mutableStateOf(Offset(0f, 0f)) }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .pointerInput(Unit) {
            detectDragGestures(
                onDragStart = {
                    startOffset = it
                    endOffset = it
                },
                onDrag = { change, dragAmount ->
                    endOffset += dragAmount
                    println(dragAmount)
                },
                onDragEnd = {},
                onDragCancel = {},
            )
        }
        .drawBehind {
            drawLine(Color.Black, startOffset, endOffset)
        }
    )
}