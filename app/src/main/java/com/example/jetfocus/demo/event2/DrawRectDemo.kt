package com.example.jetfocus.demo.event2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.demo.event1.DemoTheme

@Preview
@Composable
fun DrawRectDemo() {
    DemoTheme {
        Spacer(modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
            .aspectRatio(16f / 9)
            .drawBehind {
                repeat(24) {
                    drawLine(
                        Color.Gray,
                        start = Offset(0f, it * (size.height / 24)),
                        end = Offset(size.width, it * (size.height / 24)),
                        0.5.dp.toPx()
                    )
                }

                val barWidth = size.width / 14
                val barHeightPerLevel = size.height / 24f
                val fullBarHeight = size.height
                val padding = (size.width - barWidth * 7) / 7
                repeat(7) {
                    drawRect(
                        Color.White,
                        Offset(
                            x = (barWidth + padding) * it ,
                            y = fullBarHeight - (barHeightPerLevel * (8 + it))
                        ),
                        Size(
                            width = barWidth,
                            height = barHeightPerLevel * (8 + it)
                        ),
                    )
                }
            })
    }
}