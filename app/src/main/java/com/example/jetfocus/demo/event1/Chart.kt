package com.example.jetfocus.demo.event1

import android.graphics.PointF
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import java.math.BigDecimal
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Chart() {
    Box(
        modifier = Modifier
            .background(Color(red = 50, green = 31, blue = 73))
            .fillMaxSize()
    ) {
        val animationProgress = remember {
            Animatable(0f)
        }
        LaunchedEffect(key1 = graphData) {
            animationProgress.animateTo(1f, tween(3000))
        }

        val coroutineScope = rememberCoroutineScope()

        Spacer(
            modifier = Modifier
                .padding(8.dp)
                .aspectRatio(3 / 2f)
                .fillMaxSize()
                .align(Alignment.Center)
                .clickable {
                    coroutineScope.launch {
                        animationProgress.snapTo(0f)
                        animationProgress.animateTo(1f, tween(3000))
                    }
                }
                .drawWithCache {
                    val path: Path = generatePath(graphData, size)
                    val filledPath = Path()
                    filledPath.addPath(path)
                    filledPath.lineTo(size.width, size.height)
                    filledPath.lineTo(0f, size.height)
                    filledPath.close()

                    onDrawBehind {
                        val barWidthInPx = 1.dp.toPx()
                        drawRect(Color(0xFF737373), style = Stroke(barWidthInPx))

                        // Draw Vertical Lines
                        val verticalLines = 4
                        val verticalLineSize = size.width / (verticalLines + 1)
                        repeat(verticalLines) { i ->
                            val startX = verticalLineSize * (i + 1)
                            drawLine(
                                start = Offset(startX, 0f),
                                end = Offset(startX, size.height),
                                color = Color(0xFF737373),
                                strokeWidth = barWidthInPx
                            )
                        }

                        // Draw horizontal Lines
                        val horizontalLines = 4
                        val sectionSize = size.height / (horizontalLines + 1)
                        repeat(horizontalLines) { i ->
                            val startY = sectionSize * (i + 1)
                            drawLine(
                                start = Offset(0f, startY),
                                end = Offset(size.width, startY),
                                color = Color(0xFF737373),
                                strokeWidth = barWidthInPx
                            )
                        }

                        // Draw path
                        clipRect(right = size.width * animationProgress.value) {
                            drawPath(
                                path,
                                Color.Green,
                                style = Stroke(barWidthInPx)
                            )
                            drawPath(
                                filledPath, Brush.verticalGradient(
                                    listOf(
                                        Color.Green.copy(alpha = 0.4f),
                                        Color.Transparent
                                    )
                                ),
                                style = Fill
                            )
                        }
                    }
                }
        )
    }
}

fun generatePath(data: List<Balance>, size: Size): Path {
    val path = Path()
    val entrySize = data.size - 1
    val weekWidth = size.width / entrySize

    val max = data.maxBy { it.amount }
    val min = data.minBy { it.amount }
    val range = max.amount - min.amount
    val heightPxPerAmount = size.height / range.toFloat()

    var previousBalanceX = 0f
    var previousBalanceY = size.height

    data.forEachIndexed { i, balance ->
        if (i == 0) {
            path.moveTo(
                0f,
                size.height - (balance.amount - min.amount).toFloat() * heightPxPerAmount
            )
        }


        val balanceX = weekWidth * i
        val balanceY = size.height - (balance.amount - min.amount).toFloat() * heightPxPerAmount
        val controlPoint1 = PointF((balanceX + previousBalanceX) / 2f, previousBalanceY)
        val controlPoint2 = PointF((balanceX + previousBalanceX) / 2f, balanceY)
        path.cubicTo(
            controlPoint1.x, controlPoint1.y,
            controlPoint2.x, controlPoint2.y,
            balanceX, balanceY
        )

        previousBalanceX = balanceX
        previousBalanceY = balanceY
    }
    return path
}

@RequiresApi(Build.VERSION_CODES.O)
val graphData = listOf(
    Balance(LocalDate.now(), BigDecimal(65631)),
    Balance(LocalDate.now().plusWeeks(1), BigDecimal(65931)),
    Balance(LocalDate.now().plusWeeks(2), BigDecimal(65851)),
    Balance(LocalDate.now().plusWeeks(3), BigDecimal(65931)),
    Balance(LocalDate.now().plusWeeks(4), BigDecimal(66484)),
    Balance(LocalDate.now().plusWeeks(5), BigDecimal(67684)),
    Balance(LocalDate.now().plusWeeks(6), BigDecimal(66684)),
    Balance(LocalDate.now().plusWeeks(7), BigDecimal(66984)),
    Balance(LocalDate.now().plusWeeks(8), BigDecimal(70600)),
    Balance(LocalDate.now().plusWeeks(9), BigDecimal(71600)),
    Balance(LocalDate.now().plusWeeks(10), BigDecimal(72600)),
    Balance(LocalDate.now().plusWeeks(11), BigDecimal(72526)),
    Balance(LocalDate.now().plusWeeks(12), BigDecimal(72976)),
    Balance(LocalDate.now().plusWeeks(13), BigDecimal(73589)),
)


data class Balance(val date: LocalDate, val amount: BigDecimal)

@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
fun ChartPreview() {
    MaterialTheme {
        Chart()
    }
}
