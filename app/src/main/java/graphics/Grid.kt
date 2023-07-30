package graphics

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.roundToInt

@ExperimentalTextApi
fun DrawScope.drawRuler(
    textMeasurer: TextMeasurer, unitsPerGroup: Int = 5, gridSize: Float = 10.dp.toPx()
) {
    val hLineCount = (size.width / gridSize).roundToInt()
    val hGroupCount = (hLineCount / unitsPerGroup)
    val hGroupSize = (size.width / hGroupCount)
    val hTextCount = hGroupCount + 1

    repeat(hTextCount) { i ->
        val textLayoutResult = textMeasurer.measure(
            text = "${(i * hGroupSize / density).roundToInt()}", style = TextStyle(fontSize = 8.sp)
        )
        val lastHorizontalTextPosition = size.width - textLayoutResult.size.width
        if (i != 0) {
            drawText(
                textLayoutResult, topLeft = Offset(
                    x = if (i != hTextCount - 1) hGroupSize * i - textLayoutResult.size.width / 2 else lastHorizontalTextPosition,
                    y = 0f
                )
            )
        }
    }

    val vLineCount = (size.height / gridSize).roundToInt()
    val vGroupCount = (vLineCount / unitsPerGroup)
    val vGroupSize = (size.height / vGroupCount)
    val vTextCount = vGroupCount + 1

    repeat(vTextCount) { i ->
        val textLayoutResult = textMeasurer.measure(
            text = "${(i * hGroupSize / density).roundToInt()}", style = TextStyle(fontSize = 8.sp)
        )
        val lastVTextPosition = size.height - textLayoutResult.size.height
        if (i != 0) {
            drawText(
                textLayoutResult, topLeft = Offset(
                    0f,
                    if (i != vTextCount - 1) vGroupSize * i - textLayoutResult.size.height / 2f else lastVTextPosition
                )
            )
        }
    }
}


@ExperimentalTextApi
fun DrawScope.drawGrid(
    gridSize: Float = 10.dp.toPx()
) {
    val hLineCount = (size.width / gridSize).roundToInt()
    val vLineCount = (size.height / gridSize).roundToInt()

    repeat(hLineCount + 1) { i ->
        // Horizontal lines
        drawLine(
            color = Color.Gray,
            start = Offset(x = gridSize * i, 0f),
            end = Offset(x = gridSize * i, y = size.height)
        )
    }
    repeat(vLineCount + 1) { i ->
        // Vertical lines
        drawLine(
            color = Color.Gray,
            start = Offset(x = 0f, y = gridSize * i),
            end = Offset(x = size.height, y = gridSize * i)
        )
    }
}