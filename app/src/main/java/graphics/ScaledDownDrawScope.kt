package graphics

import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawContext
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ScaledDownDrawScope(
    override val density: Float,
    override val fontScale: Float,
    override val drawContext: DrawContext,
    override val layoutDirection: LayoutDirection
) : DrawScope {
    override fun drawArc(
        brush: Brush,
        startAngle: Float,
        sweepAngle: Float,
        useCenter: Boolean,
        topLeft: Offset,
        size: Size,
        alpha: Float,
        style: DrawStyle,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawArc(
        color: Color,
        startAngle: Float,
        sweepAngle: Float,
        useCenter: Boolean,
        topLeft: Offset,
        size: Size,
        alpha: Float,
        style: DrawStyle,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawCircle(
        brush: Brush,
        radius: Float,
        center: Offset,
        alpha: Float,
        style: DrawStyle,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawCircle(
        color: Color,
        radius: Float,
        center: Offset,
        alpha: Float,
        style: DrawStyle,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawImage(
        image: ImageBitmap,
        topLeft: Offset,
        alpha: Float,
        style: DrawStyle,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawImage(
        image: ImageBitmap,
        srcOffset: IntOffset,
        srcSize: IntSize,
        dstOffset: IntOffset,
        dstSize: IntSize,
        alpha: Float,
        style: DrawStyle,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawLine(
        brush: Brush,
        start: Offset,
        end: Offset,
        strokeWidth: Float,
        cap: StrokeCap,
        pathEffect: PathEffect?,
        alpha: Float,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawLine(
        color: Color,
        start: Offset,
        end: Offset,
        strokeWidth: Float,
        cap: StrokeCap,
        pathEffect: PathEffect?,
        alpha: Float,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawOval(
        brush: Brush,
        topLeft: Offset,
        size: Size,
        alpha: Float,
        style: DrawStyle,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawOval(
        color: Color,
        topLeft: Offset,
        size: Size,
        alpha: Float,
        style: DrawStyle,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawPath(
        path: Path,
        brush: Brush,
        alpha: Float,
        style: DrawStyle,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawPath(
        path: Path,
        color: Color,
        alpha: Float,
        style: DrawStyle,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawPoints(
        points: List<Offset>,
        pointMode: PointMode,
        brush: Brush,
        strokeWidth: Float,
        cap: StrokeCap,
        pathEffect: PathEffect?,
        alpha: Float,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawPoints(
        points: List<Offset>,
        pointMode: PointMode,
        color: Color,
        strokeWidth: Float,
        cap: StrokeCap,
        pathEffect: PathEffect?,
        alpha: Float,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawRect(
        brush: Brush,
        topLeft: Offset,
        size: Size,
        alpha: Float,
        style: DrawStyle,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawRect(
        color: Color,
        topLeft: Offset,
        size: Size,
        alpha: Float,
        style: DrawStyle,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawRoundRect(
        brush: Brush,
        topLeft: Offset,
        size: Size,
        cornerRadius: CornerRadius,
        alpha: Float,
        style: DrawStyle,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }

    override fun drawRoundRect(
        color: Color,
        topLeft: Offset,
        size: Size,
        cornerRadius: CornerRadius,
        style: DrawStyle,
        alpha: Float,
        colorFilter: ColorFilter?,
        blendMode: BlendMode
    ) {
        TODO("Not yet implemented")
    }
}

@ExperimentalTextApi
private fun ScaledDownDrawScope.drawRuler(
    textMeasurer: TextMeasurer,
    lineCount: Int = 24,
    unitsPerGroup: Int = 4,
    canvasSize: Size = Size(
        width = 240.dp.toPx(),
        height = 240.dp.toPx()
    ),
) {
    val groupCount = (lineCount / unitsPerGroup)
    val groupSize = (canvasSize.width / groupCount)
    val rulerTextCount = groupCount + 1
    val inset = (size.width - canvasSize.width)

    repeat(rulerTextCount) { i ->
        val textLayoutResult = textMeasurer.measure(
            text = "${i * unitsPerGroup}",
            style = TextStyle(fontSize = 8.sp)
        )
        drawText(
            textLayoutResult,
            topLeft = Offset(
                x = inset / 2 + groupSize * i - textLayoutResult.size.width / 2,
                y = inset / 2 - textLayoutResult.size.height
            )
        )

        drawText(
            textLayoutResult,
            topLeft = Offset(
                inset / 4 - textLayoutResult.size.height / 4,
                inset / 4 + groupSize * i + textLayoutResult.size.height / 2
            )
        )
    }
}


@ExperimentalTextApi
private fun ScaledDownDrawScope.drawGrid(
    canvasSize: Size = Size(
        width = 240.dp.toPx(),
        height = 240.dp.toPx()
    ),
    lineCount: Int = 24
) {
    val gridSize = (canvasSize.width / lineCount)
    val inset = (size.width - canvasSize.width)

    repeat(lineCount + 1) { i ->
        // Horizontal lines
        drawLine(
            color = Color.Gray,
            start = Offset(x = inset / 2 + gridSize * i, y = inset / 2),
            end = Offset(x = inset / 2 + gridSize * i, y = canvasSize.width + inset / 2)
        )
        // Vertical lines
        drawLine(
            color = Color.Gray,
            start = Offset(x = inset / 2, y = gridSize * i + inset / 2),
            end = Offset(x = canvasSize.width + inset / 2, y = gridSize * i + inset / 2)
        )
    }
}