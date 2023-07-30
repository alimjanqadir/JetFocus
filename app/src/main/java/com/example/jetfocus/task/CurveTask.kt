package com.example.jetfocus.task

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun CurveTask() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .drawWithCache {
            val path = Path()
            onDrawBehind {
            }
        })
}