package com.example.jetfocus.demo.event1

import androidx.compose.animation.Animatable
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.scaleIn
import androidx.compose.animation.with
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlin.math.roundToInt

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun ProgressTextUi() {
    var progress by remember { mutableStateOf(0f) }
    var isDone by remember { mutableStateOf(false) }
    val percentageSize = animateFloatAsState(48f, label = "")
    LaunchedEffect(Unit) {
        while (progress <= 1f) {
            delay(100L)
            progress += 0.01f
        }
        isDone = true
    }

    Row(modifier = Modifier.padding(48.dp)) {
        Row {
            val result = (progress * 100).roundToInt()
            Text(
                text = "${if (result >= 100) 100 else result}",
                fontSize = if(isDone) 32.sp else 48.sp, // Bigger after done
                 color = Color.White,
                modifier = Modifier.animateContentSize(spring()),
            )
            Text(
                text = "%", color = Color.White,
            )
        }
        Spacer(modifier = Modifier.width(18.dp))
        Column {
            AnimatedContentSize(targetContentSize = (progress * 100)) {
                val fontSize = if ((progress * 100).roundToInt() in 0..33) 24 else 16
                Row(verticalAlignment = Alignment.CenterVertically) {
                    AnimatedVisibility(fontSize >= 24) {
                        Spacer(
                            modifier = Modifier
                                .width(2.dp)
                                .height(fontSize.dp)
                                .background(Color.White)
                        )
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Grinding",
                        fontSize = fontSize.sp,
                        textAlign = TextAlign.Center,
                        color = if (fontSize >= 24) Color.White else Color.Gray,
                        modifier = Modifier.animateContentSize(),
                    )
                }
            }

            AnimatedContentSize(targetContentSize = (progress * 100)) {
                val fontSize = if ((progress * 100).roundToInt() in 33..66) 24 else 16
                Row(verticalAlignment = Alignment.CenterVertically) {
                    AnimatedVisibility(fontSize >= 24) {
                        Spacer(
                            modifier = Modifier
                                .width(2.dp)
                                .height(fontSize.dp)
                                .background(Color.White)
                        )
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Didpens",
                        fontSize = fontSize.sp,
                        textAlign = TextAlign.Center,
                        color = if (fontSize >= 24) Color.White else Color.Gray,
                        modifier = Modifier.animateContentSize(),
                    )
                }
            }

            AnimatedContentSize(targetContentSize = (progress * 100)) {
                val fontSize = if ((progress * 100).roundToInt() in 66..101) 24 else 16

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    AnimatedVisibility(fontSize >= 24) {
                        Spacer(
                            modifier = Modifier
                                .width(2.dp)
                                .height(fontSize.dp)
                                .background(Color.White)
                        )
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = if ((progress * 100).roundToInt() >= 99) "Enjoy" else "Enjoy",
                        fontSize = fontSize.sp,
                        textAlign = TextAlign.Center,
                        color = if (fontSize >= 24) Color.White else Color.Gray,
                        modifier = Modifier.animateContentSize(),
                    )
                }
            }
        }
//    when {
//      progress < 0.25f -> {
//        BottomNavigationTab(text = "25%", selected = true)
//      }
//      progress < 0.5f -> {
//        BottomNavigationTab(text = "50%", selected = true)
//      }
//      progress < 0.75f -> {
//        BottomNavigationTab(text = "75%", selected = true)
//      }
//      else -> {
//        BottomNavigationTab(text = "100%", selected = true)
//      }
//    }
    }
}

@Composable
fun AnimatedContentSize(targetContentSize: Float, content: @Composable (size: Float) -> Unit) {
    content(targetContentSize)
}

@Preview
@Composable
private fun Preview() {
    ProgressTextUi()
}

