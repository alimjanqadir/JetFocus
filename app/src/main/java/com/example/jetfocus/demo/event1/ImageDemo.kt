package com.example.jetfocus.demo.event1

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetfocus.R

// TODO("显示一个图片用资源‘R.drawable.jetpack_compose’", modifier: size, contentScale, padding, clip, border, clickable)
@Preview
@Composable
fun ImageDemo() {
    Image(
        painter = painterResource(R.drawable.avatar_2),
        null,

    )
}