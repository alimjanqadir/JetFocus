package com.example.jetfocus.demo.event1


import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val LightColors = lightColorScheme(
    primary = Color.Black,
)

private val DarkColors = darkColorScheme(
    primary = Color.White,
)

@Composable
fun DemoTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit
) {
    val colors = if (useDarkTheme) DarkColors else LightColors
    MaterialTheme(
        colorScheme = colors, content = content
    )
}

@Composable
fun DemoThemeDynamic(
    useDarkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit
) {
    val context = LocalContext.current
    val colors = when {
        (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) -> {
            if (useDarkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        useDarkTheme -> DarkColors
        else -> LightColors
    }
    MaterialTheme(
        colorScheme = colors, content = content
    )
}