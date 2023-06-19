package com.example.jetfocus.task

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.R

class Task5 {
    // 把图片圆边和为个视图加一下空间
    @Composable
    fun Card() {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .size(96.dp)
                    .clip(CircleShape),
                painter = painterResource(R.drawable.jetpack_compose),
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text("Hello World")
        }
    }

    @Composable
    @Preview()
    fun Preview() {
        Card()
    }
}
