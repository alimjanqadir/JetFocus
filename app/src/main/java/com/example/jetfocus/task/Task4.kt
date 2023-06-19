package com.example.jetfocus.task

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.R

class Task4 {
    // 把视图水平对齐
    @Composable
    fun Card() {
        Column(
             horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.size(96.dp),
                painter = painterResource(R.drawable.jetpack_compose),
                contentDescription = null
            )
            Text(
                text = "Hello World",
            )
        }
    }

    @Composable
    @Preview()
    fun Preview() {
        Card()
    }
}
