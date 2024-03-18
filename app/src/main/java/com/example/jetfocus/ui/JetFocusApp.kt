package com.example.jetfocus.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.example.jetfocus.ui.TimerState.Initial
import com.example.jetfocus.ui.TimerState.Resume
import com.example.jetfocus.ui.TimerState.Start
import com.example.jetfocus.ui.TimerState.Stop
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
            CountDownTimer(
                onFinish = { timerState = Initial },
                duration = 5.minutes,
                state = timerState,
                modifier = Modifier.padding(48.dp),
            )
            Spacer(modifier = Modifier.height(12.dp))
            TimerControl(
                state = timerState,
                onStart = { timerState = Start },
                onResume = { timerState = Resume },
                onStop = { timerState = Stop },
                onCancel = { timerState = Initial },
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
        Initial -> StartButton()
        Start -> StopButton()
        Stop -> ResumeLayout()
        Resume -> StopButton()
    }
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
fun Preview() {
    JetFocusApp()
}