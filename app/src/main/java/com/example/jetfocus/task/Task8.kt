package com.example.jetfocus.task

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
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
    @Composable
    fun UI() {
        LazyRow {
            repeat(100) {
                item {
                    UserInfoCardSimple()
                }
            }
        }
    }

    @Composable
    fun UserInfoCardSimple() {
        Column(
            modifier = Modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.clip(CircleShape),
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
