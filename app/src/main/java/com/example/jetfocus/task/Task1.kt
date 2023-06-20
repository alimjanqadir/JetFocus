package com.example.jetfocus.task

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/* 写出你在这次活动的第一个Composable函数，写完以后删除注释可以看到结果 */
class Task1 {
    @Composable
    fun HelloWorld() {
        Text("Hello Jetpack Compose!")
    }

    @Preview
    @Composable
    fun Preview() {
        HelloWorld()
    }
}