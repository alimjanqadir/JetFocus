package com.example.jetfocus.demo.event3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext



@Composable
fun SideEffectDemo() {
    // 获取系统语言
    val locales = LocalContext.current.resources.configuration.locales.get(0)
    // UI 逻辑
    Row {
        Column {
            Box {
                Text("... $locales")
            }
        }
    }
}

@Composable
fun SideEffectDemo1() {
    val state by remember { mutableStateOf(0) }
    // UI 逻辑
    Row {
        // Row 的范围
        var i = 0;
        Column {
            // Column 的范围
            i += 1
            Box {
                // Box 的范围
                Text("... $i")
            }
        }
    }
}
