package com.example.jetfocus.task

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetfocus.R

// 在原有的基础上文字上面再加一个图片，图片ID为R.drawable.jetpack_compose
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