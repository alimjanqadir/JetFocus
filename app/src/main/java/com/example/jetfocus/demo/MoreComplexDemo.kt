package com.example.jetfocus.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetfocus.R

@Preview
@Composable
fun MoreComplexDemo() {
    var count by remember { mutableStateOf(0) }
    Surface {
        Column {
            Row {
                Button(onClick = {
                    count += 1
                }) {
                    Text("Click")
                }
                Button(onClick = {
                    count -= 1
                }) {
                    Text("Click 2")
                }
            }
            repeat(count) {
                UserInfoItem(
                    name = "Andy",
                    job = "安卓开发者",
                    imageId = R.drawable.andy,
                    intro = "写代码，游泳，他还每周去足球场踢一场比赛。"
                )
            }
        }
    }
}

@Composable
private fun UserInfoItem(
    modifier: Modifier = Modifier,
    imageId: Int,
    name: String,
    job: String,
    intro: String
) {
    Row(modifier = modifier) {
        UserAvatar(modifier = Modifier.padding(10.dp), imageId = imageId, name)
        Column(modifier = Modifier.padding(horizontal = 10.dp)) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                "职位：$job", style = TextStyle(
                    fontSize = 24.sp
                )
            )
            Text(
                text = "爱好：$intro", style = TextStyle(
                    fontSize = 18.sp,
                )
            )
        }
    }
}

@Composable
private fun UserAvatar(modifier: Modifier, imageId: Int, name: String) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .clip(CircleShape),
            painter = painterResource(imageId),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = name,
        )
    }
}