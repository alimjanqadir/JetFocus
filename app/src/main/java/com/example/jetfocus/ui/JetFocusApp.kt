package com.example.jetfocus.ui

import android.content.res.Configuration
import android.text.format.Time
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Tag
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.ui.theme.JetFocusTheme

@Composable
fun JetFocusApp() {
    JetFocusTheme {
        Surface {
            TimeScreen()
        }
    }
}

@Composable
fun TimeScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        CountDownTimer(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = 200.dp)
        )
        Button(modifier = Modifier
            .align(Alignment.Center)
            .offset(y = 120.dp), onClick = {
                startTimer()
        }) {
            Text("Start")
        }
    }
}

fun startTimer() {
}

@Composable
fun CountDownTimer(
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.displayLarge
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("25:00", style = style)
        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = {}) {
            Text("Focus")
            Icon(Icons.Filled.Tag, contentDescription = null)
        }
    }
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
fun Preview() {
    JetFocusApp()
}