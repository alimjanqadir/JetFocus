package com.example.jetfocus.task

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetfocus.R

/*熟悉布局：Column。*/
class Task2 {
    // TODO("1. 把“Hello World”的文字换成“Andy Holloway”的姓名")
    // TODO("2. 然后文字上方加一个图片，用已有的资源R.drawable.andy")
    // TODO("3. 最后把HelloWorld的函数名换成UserInfoCard")

    @Composable
    fun UserInfoCard() {
        Column {
            Image(
                painter = painterResource(R.drawable.andy),
                contentDescription = null)
            Text("Andy Holloway")
        }
    }

    @Composable
    @Preview()
    fun Preview() {
        UserInfoCard()
    }
}
