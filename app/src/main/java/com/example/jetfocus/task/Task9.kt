package com.example.jetfocus.task

import android.content.res.Configuration
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetfocus.ui.theme.TaskTheme

// Grids
@OptIn(ExperimentalFoundationApi::class)
class Task9 {
    // TODO("用LazyVerticalGrid实现3*3的网格数据显示")
    // TODO("如果用LazyHorizontalGrid会有什么不一样")
    // TODO("也试试用LazyVerticalStaggeredGrid和LazyHorizontalStaggeredGrid。")
    @Composable
    fun UI() {
        LazyVerticalGrid(columns = GridCells.Fixed(3)) {
            users.forEach {user ->
                item {
                    UserAvatar(user.imageId)
                }
            }
        }
    }

    @Composable
    fun UserAvatar(imageId: Int) {
        Image(
            painter = painterResource(imageId),
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