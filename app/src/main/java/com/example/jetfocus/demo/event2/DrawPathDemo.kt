package com.example.jetfocus.demo.event2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.ceil
import kotlin.math.roundToInt

@Preview
@Composable
@ExperimentalTextApi
fun DrawPathDemo() {
    val textMeasures = rememberTextMeasurer()
    Spacer(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .drawBehind {
                drawGrid(textMeasures)

                val path = Path()
                path.moveTo(11.995f * 50, 7.23319f * 50)
                path.cubicTo(
                    10.5455f * 50,
                    5.60999f * 50,
                    8.12832f * 50,
                    5.17335f * 50,
                    6.31215f * 50f,
                    6.65972f * 50
                )
                path.cubicTo(
                    4.4959f * 50,
                    8.14609f * 50,
                    4.2403f * 50,
                    10.6312f * 50,
                    5.66654f * 50f,
                    12.3892f * 50
                )
                path.lineTo(11.995f * 50, 18.25f * 50)
                path.lineTo(18.3235f * 50, 12.3892f * 50)
                path.cubicTo(
                    19.7498f * 50,
                    10.6312f * 50,
                    19.5253f * 50,
                    8.13046f * 50,
                    17.6779f * 50,
                    6.65972f * 50
                )
                path.cubicTo(
                    15.8305f * 50,
                    5.18899f * 50,
                    13.4446f * 50,
                    5.60999f * 50,
                    11.995f * 50,
                    7.23319f * 50
                )
                path.close()
                drawPath(path, Color.Red, style = Stroke(width = 2.dp.toPx()))
            }
    )
}

@ExperimentalTextApi
private fun DrawScope.drawGrid(textMeasures: TextMeasurer) {
    repeat(ceil(size.height / 100).roundToInt()) {
        drawText(
            textMeasures.measure(
                AnnotatedString("${(100f * it).roundToInt()}"),
                style = TextStyle(fontSize = 12.sp)
            ),
            topLeft = Offset(100f * it, 0f)
        )
        drawText(
            textMeasures.measure(
                text = AnnotatedString("${(100f * it).roundToInt()}"),
                style = TextStyle(fontSize = 12.sp)
            ),
            topLeft = Offset(0f, 100f * it)
        )
        drawLine(Color.Gray, Offset(0f, 100f * it), Offset(size.width, 100f * it))
        drawLine(Color.Gray, Offset(100f * it, 0f), Offset(100f * it, size.height))
    }
}