package com.example.jetfocus.task

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetfocus.R

class Task2 {
    // 改变图像的大小到96dp
    @Composable
    fun Card() {
        Column {
            Image(
                painter = painterResource(R.drawable.jetpack_compose),
                contentDescription = null
            )
            Text("Hello World")
        }
    }

    @Composable
    @Preview()
    fun Preview() {
        Card()
    }
}
