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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.ui.TimerState.INITIAL
import com.example.jetfocus.ui.TimerState.RESUME
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
            var timerState by rememberTimerState()
            CountDownTimer(duration = 25.minutes, state = timerState)
            Spacer(modifier = Modifier.height(12.dp))
            TimerControl(
                state = timerState,
                onStart = { timerState = START },
                onResume = { timerState = RESUME },
                onStop = { timerState = STOP },
                onCancel = { timerState = INITIAL },
            )
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}

@Composable
private fun TimerControl(
    state: TimerState,
    onStart: () -> Unit,
    onResume: () -> Unit,
    onStop: () -> Unit,
    onCancel: () -> Unit
) {
    @Composable
    fun StartButton() {
        Button(onClick = {
            onStart()
        }) {
            Text("Start")
        }
    }

    @Composable
    fun StopButton() {
        Button(onClick = {
            onStop()
        }) {
            Text("Stop")
        }
    }

    @Composable
    fun ResumeLayout() {
        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = {
                onResume()
            }) {
                Text("Resume")
            }
            Spacer(modifier = Modifier.width(12.dp))
            Button(onClick = {
                onCancel()
            }) {
                Text("Cancel")
            }
        }
    }
    when (state) {
        INITIAL -> StartButton()
        START -> StopButton()
        STOP -> ResumeLayout()
        RESUME -> StopButton()
    }
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
fun Preview() {
    JetFocusApp()
}