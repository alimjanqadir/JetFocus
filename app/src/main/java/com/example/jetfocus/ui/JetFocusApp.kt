package com.example.jetfocus.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Tag
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.ui.theme.JetFocusTheme
import kotlinx.coroutines.launch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds
import kotlin.time.DurationUnit

@Composable
fun JetFocusApp() {
    JetFocusTheme {
        Surface {
            TimeScreen()
        }
    }
}

val DEFAULT_TIMER_TIME_IN_MILLISECONDS: Long = 25.minutes.inWholeMilliseconds

@Composable
fun TimeScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        var countDownInMills: Long by remember { mutableStateOf(DEFAULT_TIMER_TIME_IN_MILLISECONDS) }
        var isIdle by remember { mutableStateOf(true) }
        var isTimerOn by remember { mutableStateOf(false) }
        var isStopped by remember { mutableStateOf(false) }
        val coroutineScope = rememberCoroutineScope()
        var job: Job? by remember { mutableStateOf(null) }

        fun startTimer() {
            job = coroutineScope.launch {
                while (countDownInMills > 0) {
                    delay(1.seconds)
                    countDownInMills -= 1.seconds.inWholeMilliseconds
                }
            }
            isTimerOn = true
            isIdle = false
        }

        fun stopTimer() {
            isTimerOn = false
            isStopped = true
            job?.cancel()
        }

        fun resumeTimer() {
            isTimerOn = true
            isStopped = false
            startTimer()
        }

        fun cancelTimer() {
            countDownInMills = DEFAULT_TIMER_TIME_IN_MILLISECONDS
            isTimerOn = false
            isStopped = false
            isIdle = true
        }

        CountDownTimer(
            timeInMills = countDownInMills,

            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = 200.dp)
        )
        if (isTimerOn) {
            Button(
                modifier = Modifier
                    .align(Alignment.Center)
                    .offset(y = 120.dp),
                onClick = { stopTimer() }) {
                Text("Stop")
            }
        } else {
            if (isIdle) {
                Button(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .offset(y = 120.dp), onClick = { startTimer() }) {
                    Text("Start")
                }
            } else {
                Row(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .offset(y = 120.dp)
                ) {
                    Button(onClick = { resumeTimer() }) {
                        Text("Resume")
                    }
                    Spacer(modifier = Modifier.width(6.dp))
                    Button(onClick = { cancelTimer() }) {
                        Text("Cancel")
                    }
                }
            }
        }

    }
}


@Composable
fun CountDownTimer(
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.displayLarge,
    timeInMills: Long
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        println(timeInMills)
        val timerFormat = SimpleDateFormat("mm:ss", Locale.getDefault())
        val formattedText = timerFormat.format(Date(timeInMills))
        println(formattedText)
        Text(formattedText, style = style)
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