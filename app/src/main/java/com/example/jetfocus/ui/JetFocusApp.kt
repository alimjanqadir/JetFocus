package com.example.jetfocus.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.example.jetfocus.ui.TimerState.*
import com.example.jetfocus.ui.theme.JetFocusTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.reflect.KProperty
import kotlin.time.Duration
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

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
        CountDownTimer(
            modifier = Modifier
                .align(Alignment.Center),
            duration = 25.minutes
        )
    }
}

@Composable
fun Ticker(
    isOn: Boolean = false,
    onTick: (tick: Int) -> Unit,
    duration: Duration = 1.seconds,
    resetOnOff: Boolean = false,
    content: @Composable () -> Unit
) {
    var tick by remember { mutableStateOf(0) }
    LaunchedEffect(isOn) {
        if (isOn) {
            launch {
                while (true) {
                    delay(duration)
                    tick += 1
                    onTick(tick)
                }
            }
        } else {
            if (resetOnOff) {
                tick = 0
                onTick(tick)
            }
        }
    }
    content()
}

enum class TimerState {
    INITIAL, START, STOP
}

@Composable
fun CountDownTimer(
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.displayLarge,
    duration: Duration,
    state: TimerState = INITIAL
) {
    var countDownInMills: Long by remember { mutableStateOf(duration.inWholeMilliseconds) }
    var timerState: TimerState by remember { mutableStateOf(state) }
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Ticker(
            onTick = { countDownInMills -= 1.seconds.inWholeMilliseconds },
            isOn = timerState == START
        ) {
            val timerFormat = SimpleDateFormat("mm:ss", Locale.getDefault())
            val formattedText = timerFormat.format(Date(countDownInMills))
            Text(modifier = modifier, text = formattedText, style = style)
        }
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
                        countDownInMills = duration.inWholeMilliseconds
                    }) {
                        Text("Cancel")
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
    }
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
fun Preview() {
    JetFocusApp()
}