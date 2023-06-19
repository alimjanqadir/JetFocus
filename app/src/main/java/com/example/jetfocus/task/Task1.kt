package com.example.jetfocus.task

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// 写一个HelloWorld的Composable函数并绘制一个“Hello Jetpack Compose!”的文字。
@Composable
fun HelloWorld() {
    Text("Hello World")
}

@Composable
@Preview()
fun Preview() {
    HelloWorld()
}