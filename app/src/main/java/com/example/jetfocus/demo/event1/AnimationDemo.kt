@file:OptIn(ExperimentalAnimationApi::class)

package com.example.jetfocus.demo.event1

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun AnimationDemo() {
    val visible by remember { mutableStateOf(true) }
    Column {
        val density = LocalDensity.current
        AnimatedVisibility(
            visible = visible,
            enter = slideInVertically { with(density) { -40.dp.roundToPx() } }
                    + expandVertically(expandFrom = Alignment.Top)
                    + fadeIn(initialAlpha = 0.3f),
            exit = slideOutVertically() + shrinkVertically() + fadeOut()
        ) {
            Text(
                "Hello",
            )
        }
    }
}