package com.example.jetfocus.demo.event1

import android.content.Context
import android.content.res.Resources.getSystem
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.example.jetfocus.R

class CustomViewComponent : View {

    constructor(context: Context) : super(context) {
        init(null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init(attrs, defStyle)
    }

    private fun init(attrs: AttributeSet?, defStyle: Int) {
        // Load attributes
        val a = context.obtainStyledAttributes(
            attrs, R.styleable.CustomViewComponent, defStyle, 0
        )
        a.recycle()

        // Set up a default TextPaint object
        paint = Paint()
    }


    private lateinit var paint: Paint
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val density = getSystem().displayMetrics.density
        val radius = 100f * density
        val centerX = width / 2f
        val centerY = height / 2f

        paint.color = Color.RED
        canvas.drawCircle(centerX, centerY, radius, paint)
        paint.color = Color.GREEN
        canvas.drawCircle(centerX, centerY, radius * 0.8f, paint)
        paint.color = Color.BLUE
        canvas.drawCircle(centerX, centerY, radius * 0.6f, paint)

        paint.color = Color.BLACK
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 10f * density
        canvas.drawRect(
            centerX - (250f * density) / 2,
            centerY - (300f * density) / 2 ,
            centerX + (250f * density) / 2,
            centerY + (300f * density) / 2,
            paint
        )
        paint.style = Paint.Style.FILL
    }
}