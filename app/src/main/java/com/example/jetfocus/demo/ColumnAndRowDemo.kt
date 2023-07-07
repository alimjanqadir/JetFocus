package com.example.jetfocus.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetfocus.R

@Preview
@Composable
fun ColumnAndRowDemo() {
    Row {
        Column {
            Image(painter = painterResource(R.drawable.andy), contentDescription = null)
            Text("Andy")
        }
        Column {
            Text("职位：安卓开发")
            Text("爱好：写代码，阅读我每月看一本书。我还喜欢踢足球每周去球场去比赛～")
        }
    }
}

