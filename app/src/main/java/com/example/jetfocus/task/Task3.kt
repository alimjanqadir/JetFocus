package com.example.jetfocus.task

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetfocus.R

/*熟悉布局：Row。*/
class Task3 {
    @Composable
    fun UserInfoCard() {
        Row {
            Column {
                Image(
                    painter = painterResource(R.drawable.andy), contentDescription = null
                )
                Text("Andy Holloway")
            }
            Column {
                Text("Android Developer")
                Text("Andy 是相当有经验的安卓开发者，他参与了Google的各类大型项目，他喜欢游泳和烘培。")
            }
        }
    }

    @Composable
    @Preview
    fun Preview() {
        UserInfoCard()
    }
}

