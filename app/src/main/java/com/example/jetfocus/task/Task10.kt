package com.example.jetfocus.task

import android.content.res.Configuration
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetfocus.ui.theme.TaskTheme

// 重组和状态
class Task10 {
    // TODO("显示一个CheckBox组件")
    // TODO("为什么对组件的操作没有任何效果")
    @Composable
    fun UI() {

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