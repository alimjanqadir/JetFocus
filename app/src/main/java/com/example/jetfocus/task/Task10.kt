package com.example.jetfocus.task

import android.content.res.Configuration
import android.widget.CheckBox
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetfocus.ui.theme.TaskTheme

// 重组和状态
class Task10 {
    @Composable
    fun UI() {
        var isChecked by remember { mutableStateOf(false) }
        Checkbox(checked = isChecked, onCheckedChange = { isChecked = !isChecked })
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