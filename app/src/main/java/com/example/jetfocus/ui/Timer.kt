package com.example.jetfocus.ui

import android.icu.text.SimpleDateFormat
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import com.example.jetfocus.ui.TimerState.INITIAL
import com.example.jetfocus.ui.TimerState.START
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Date
import java.util.Locale
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

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
    if(state == INITIAL) countDownInMills = duration.inWholeMilliseconds
    Box {
        Ticker(
            onTick = { countDownInMills -= 1.seconds.inWholeMilliseconds },
            isOn = state == START
        ) {
            val timerFormat = SimpleDateFormat("mm:ss", Locale.getDefault())
            val formattedText = timerFormat.format(Date(countDownInMills))
            Text(modifier = modifier, text = formattedText, style = style)
        }
    }
}
