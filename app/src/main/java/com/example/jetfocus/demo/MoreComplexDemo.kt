package com.example.jetfocus.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetfocus.task.User
import com.example.jetfocus.task.users

@Preview
@Composable
fun MoreComplexDemo() {
    var count by remember { mutableStateOf(0) }
    Surface {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Row {
                Button(onClick = {
                    count += 1
                }) {
                    Text("Add")
                }
                Button(onClick = {
                    count -= 1
                }) {
                    Text("Remove")
                }
            }
            repeat(count) {
                UserInfoItem(users[it])
            }
        }
    }
}

@Composable
private fun UserInfoItem(
    user: User,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        UserInfoSimple(modifier = Modifier.padding(10.dp), imageId = user.imageId, user.name)
        Column(modifier = Modifier.padding(horizontal = 10.dp)) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                "职位：${user.title}", style = TextStyle(
                    fontSize = 24.sp
                )
            )
            Text(
                text = "爱好：${user.intro}", style = TextStyle(
                    fontSize = 18.sp,
                )
            )
        }
    }
}

@Composable
private fun UserInfoSimple(modifier: Modifier, imageId: Int, name: String) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop,
            painter = painterResource(imageId),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = name,
        )
    }
}