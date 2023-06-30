package com.example.jetfocus.demo

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetfocus.R

// TODO("显示一个图片，没有大小，或其他修改")
@Preview
@Composable
fun ImageDemo() {
    Image(
        painter = painterResource(R.drawable.jetpack_compose),
        contentDescription = null
    )
}