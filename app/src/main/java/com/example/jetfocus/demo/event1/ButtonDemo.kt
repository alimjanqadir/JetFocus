package com.example.jetfocus.demo.event1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.R


// TODO(text, image, 组件化设计)
@Preview
@Composable
fun ButtonDemo() {
    Button(onClick = {}) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.timer),
                contentDescription = null,
            )
            Text(
                text = "Start",
                modifier = Modifier
                    .padding(horizontal = 8.dp)
            )
        }
    }
}