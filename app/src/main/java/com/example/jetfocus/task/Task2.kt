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
