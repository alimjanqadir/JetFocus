@file:OptIn(ExperimentalMaterial3Api::class)
@file:Suppress("CanBeVal")

package com.example.jetfocus.demo.event1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Badge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.example.jetfocus.R
import com.example.jetfocus.demo.event1.WeekDay.*

enum class WeekDay {
    MON, TUE, WEN, THU, FRI, SAT, SUN
}

private class SampleWeekDayProvider: PreviewParameterProvider<WeekDay> {
    override val values = WeekDay.values().asSequence()
}

@Preview
@Composable
fun DeclarativeDemo(@PreviewParameter(SampleWeekDayProvider::class) today: WeekDay) {
    when (today) {
        MON -> ImageWithBadge(color = Color.Green)
        TUE -> ImageWithBadge(color = Color.Yellow)
        WEN -> ImageWithBadge(color = Color.Blue)
        THU -> ImageWithBadge(color = Color.Cyan)
        FRI -> ImageWithBadge(color = Color.Gray)
        SAT -> ImageWithBadge(color = Color.Magenta)
        SUN -> ImageWithBadge(color = Color.Black)
    }
}

@Composable
private fun ImageWithBadge(color: Color) {
    Box {
        Image(
            painter = painterResource(R.drawable.andy),
            contentDescription = null,
        )
        Badge(containerColor = color)
    }
}