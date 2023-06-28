package com.example.jetfocus.task

import android.content.res.Configuration
import android.provider.Contacts
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.R
import com.example.jetfocus.ui.theme.TaskTheme

/* LazyRow */
class Task8 {
    // TODO("用LazyRow实现水平方向的大量数据显示")
    // TODO("用LazyRow里用repeat函数创建100个UserInfoCard组件")
    @Composable
    fun UI() {
        LazyRow {
            repeat(100) {
                item {
                    UserInfoCard()
                }
            }
        }
    }

    @Composable
    fun UserInfoCard() {
        Column {
            Image(
                painter = painterResource(R.drawable.andy),
                contentDescription = null
            )
            Text("Andy Holloway")
        }
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
