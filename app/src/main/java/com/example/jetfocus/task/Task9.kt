package com.example.jetfocus.task

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetfocus.R
import com.example.jetfocus.ui.theme.TaskTheme

// Grids
class Task9 {
    // TODO("用LazyVerticalGrid实现3*3的网格数据显示")
    // TODO("如果用LazyHorizontalGrid会有什么不一样")
    // TODO("也试试用LazyVerticalStaggeredGrid和LazyHorizontalStaggeredGrid。")
    // Tips: 用SampleData文件的数据
    @Composable
    fun UI() {

    }

    @Composable
    fun UserAvatar(user: User) {
            Image(
                painter = painterResource(user.imageId),
                contentDescription = null
            )
    }

    @Composable
    @Preview(
        name = "Light Mode",
    )
    @Preview(
        uiMode = Configuration.UI_MODE_NIGHT_YES,
        name = "Dark Mode",
    )
    fun Preview() {
        TaskTheme {
            Surface {
                UI()
            }
        }
    }
}