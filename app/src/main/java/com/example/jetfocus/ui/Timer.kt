package com.example.jetfocus.ui

import android.icu.text.SimpleDateFormat
import android.view.Choreographer
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.withFrameMillis
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AndroidUiFrameClock
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.ui.TimerState.Initial
import com.example.jetfocus.ui.TimerState.Resume
import com.example.jetfocus.ui.TimerState.Start
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Date
import java.util.Locale
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.roundToInt
import kotlin.math.sin
import kotlin.time.Duration
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

@Composable
fun Ticker(
    isOn: Boolean = false,
    onTick: (tick: Duration) -> Unit,
    duration: Duration = 1.seconds,
    content: @Composable () -> Unit
) {
    LaunchedEffect(isOn) {
        if (isOn) {
            launch {
                val androidUiFrameClock = AndroidUiFrameClock(Choreographer.getInstance())
                var lastFrameDelta = androidUiFrameClock.withFrameMillis { it }
                while (true) {
                    if (duration <= 1.seconds / 60) {
//                        androidUiFrameClock.withFrameMillis { currentFrameDelta ->
//                            onTick(currentFrameDelta - lastFrameDelta)
//                            lastFrameDelta = currentFrameDelta
//                        }
                    } else {
                        onTick(duration)
                        delay(duration)
                    }
                }
            }
        }
    }
    content()
}

enum class TimerState {
    Initial, Start, Stop, Resume
}

@Composable
fun rememberTimerState() = remember { mutableStateOf(Initial) }

@Composable
fun CountDownTimer(
    modifier: Modifier = Modifier,
    state: TimerState = Initial,
    onFinish: () -> Unit,
    style: TextStyle = MaterialTheme.typography.displayLarge,
    duration: Duration = 25.minutes,
    contentAlignment: Alignment = Alignment.Center,
) {
    var countDownDuration: Duration by remember { mutableStateOf(duration) }
    fun resetValue() {
        countDownDuration = duration
    }
    if (state == Initial) resetValue()
    if (countDownDuration <= 0.seconds) {
        resetValue()
        onFinish()
    }

    Box(modifier = modifier
        .drawBehind {
            val circleSize = 10.dp.toPx()
            var degree = -PI / 2
            val degreesPerDot = 2 * PI / 24
            val startX = size.width / 2
            val startY = size.height / 2

            val durationPerDot = duration / 24
            val runningDuration = duration - countDownDuration
            val dotPosition: Int = (runningDuration / durationPerDot).roundToInt() % 24

            repeat(24) {
                drawCircle(
                    if ((state == Start || state == Resume) && it == dotPosition) Color.Yellow else Color.Red,
                    radius = circleSize,
                    center = Offset(
                        x = (startX + (size.width / 2 - circleSize) * cos(degree)).toFloat(),
                        y = (startY + (size.width / 2 - circleSize) * sin(degree)).toFloat(),
                    )
                )
                degree += degreesPerDot
            }
        }
        .aspectRatio(1f)) {
        Ticker(
            onTick = {
                countDownDuration -= it
            }, duration = 1.seconds, isOn = state == Start || state == Resume
        ) {
            val timerFormat = SimpleDateFormat("mm:ss", Locale.getDefault())
            val formattedText = timerFormat.format(Date(countDownDuration.inWholeMilliseconds))
            Text(modifier = Modifier.align(contentAlignment), text = formattedText, style = style)
        }
    }
}

@Preview
@Composable
fun CountDownTimerPreview() {
    var timerState by remember { mutableStateOf(Start) }
    CountDownTimer(
        modifier = Modifier.fillMaxWidth(),
        state = timerState,
        onFinish = { timerState = Initial },
        duration = 5.seconds,
        style = MaterialTheme.typography.displayLarge,
    )
}