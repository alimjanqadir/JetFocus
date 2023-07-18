package com.example.jetfocus.ui

import android.icu.text.SimpleDateFormat
import android.view.Choreographer
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.withFrameMillis
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.AndroidUiFrameClock
import androidx.compose.ui.text.TextStyle
import com.example.jetfocus.ui.TimerState.INITIAL
import com.example.jetfocus.ui.TimerState.RESUME
import com.example.jetfocus.ui.TimerState.START
import kotlinx.coroutines.launch
import java.util.Date
import java.util.Locale
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

@Composable
fun Ticker(
    isOn: Boolean = false,
    onTick: (tick: Long) -> Unit,
    duration: Duration = 1.seconds,
    content: @Composable () -> Unit
) {
    LaunchedEffect(isOn) {
        if (isOn) {
            launch {
                val androidUiFrameClock = AndroidUiFrameClock(Choreographer.getInstance())
                var lastFrameDelta = androidUiFrameClock.withFrameMillis { it }
                while (true) {
                    androidUiFrameClock.withFrameMillis { currentFrameDelta ->
                        onTick(currentFrameDelta - lastFrameDelta)
                        lastFrameDelta = currentFrameDelta
                    }
                }
            }
        }
    }
    content()
}

enum class TimerState {
    INITIAL, START, STOP, RESUME
}

@Composable
fun rememberTimerState() = remember { mutableStateOf(INITIAL) }

@Composable
fun CountDownTimer(
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.displayLarge,
    duration: Duration,
    onFinish: () -> Unit = {},
    state: TimerState = INITIAL
) {
    var countDownInMills: Long by remember { mutableStateOf(duration.inWholeMilliseconds) }
    fun resetValue() {
        countDownInMills = duration.inWholeMilliseconds
    }

    if (state == INITIAL) resetValue()
    Box {
        Ticker(
            onTick = {
                countDownInMills -= it
                println("tick: $it")
            },
            isOn = state == START || state == RESUME
        ) {
            val timerFormat = SimpleDateFormat("mm:ss", Locale.getDefault())
            val formattedText = timerFormat.format(Date(countDownInMills))
            Text(modifier = modifier, text = formattedText, style = style)
        }
    }
}
