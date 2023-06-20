package com.example.jetfocus.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = lightPrimary,
    onPrimary = lightOnPrimary,
    surface = lightSurface,
    onSurface = lightOnSurface
)

private val DarkColors = lightColorScheme(
    primary = darkPrimary,
    onPrimary = darkOnPrimary,
    surface = darkSurface,
    onSurface = darkOnSurface
)

@Composable
fun TaskTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit
) {
    val colors = if (useDarkTheme) DarkColors else LightColors
    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}

@Composable
fun JetFocusTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit
) {
    val colors = if (useDarkTheme) DarkColors else LightColors
    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}