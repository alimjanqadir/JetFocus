package com.example.jetfocus.demo.event1

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetfocus.task.User
import com.example.jetfocus.task.users

// Todo(Colum, Row, Box, Button nest containers and implement UserInfoItem, surface, modularize)
@Preview
@Preview(
    "dynamic red dominated mode", wallpaper = Wallpapers.RED_DOMINATED_EXAMPLE
)
@Preview(
    "dynamic blue dominated mode", wallpaper = Wallpapers.BLUE_DOMINATED_EXAMPLE
)
@Preview("dynamic green dominated mode", wallpaper = Wallpapers.GREEN_DOMINATED_EXAMPLE)
@Preview(
    "dark mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
fun LayoutDemo() {
    DemoThemeDynamic {
        Surface {
            Column {
                users.forEach { user ->
                    UserInfoItem(user)
                }
            }
        }
    }
}

@Composable
private fun UserInfoItem(user: User) {
    Row {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            UserInfoSimple(user)
        }
        UserInfo(user)
    }
}

@Composable
private fun UserInfo(user: User) {
    Column(modifier = Modifier.padding(10.dp)) {
        Text(text = "职业：${user.job}", fontSize = 14.sp)
        Text(text = "介绍：${user.intro}", fontSize = 14.sp)
    }
}

@Composable
private fun UserInfoSimple(user: User) {
    Image(
        painter = painterResource(id = user.imageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(start = 10.dp, top = 10.dp)
            .size(80.dp)
            .clip(CircleShape)
            .border(4.dp, Color.Green, CircleShape)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = user.name, fontSize = 14.sp)
}