package com.example.jetfocus.task

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class Task2 {
    // 在原有的基础上文字上面再加一个图片，图片ID为R.drawable.jetpack_compose
    @Composable
    fun Card() {
        Text("Hello World")
    }

    @Composable
    @Preview()
    fun Preview() {
        Card()
    }
}
