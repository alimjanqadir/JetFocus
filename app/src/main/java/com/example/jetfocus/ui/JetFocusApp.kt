package com.example.jetfocus.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.ui.TimerState.INITIAL
import com.example.jetfocus.ui.TimerState.START
import com.example.jetfocus.ui.TimerState.STOP
import com.example.jetfocus.ui.theme.JetFocusTheme
import kotlin.time.Duration.Companion.minutes

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
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.Center)
        ) {
            var timerState: TimerState by remember { mutableStateOf(INITIAL) }
            CountDownTimer(
                duration = 25.minutes, state = timerState
            )
            Spacer(modifier = Modifier.height(12.dp))
            when (timerState) {
                INITIAL -> {
                    Button(onClick = {
                        timerState = START
                    }) {
                        Text("Start")
                    }
                }

                START -> {
                    Button(onClick = {
                        timerState = STOP
                    }) {
                        Text("Stop")
                    }
                }

                STOP -> {
                    Row(
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(onClick = {
                            timerState = START
                        }) {
                            Text("Resume")
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Button(onClick = {
                            timerState = INITIAL
                        }) {
                            Text("Cancel")
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
fun Preview() {
    JetFocusApp()
}