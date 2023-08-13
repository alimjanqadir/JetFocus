@file:Suppress("LocalVariableName", "UNUSED_ANONYMOUS_PARAMETER", "All", "unused", "NAME_SHADOWING")

package com.example.jetfocus.demo.event3

import androidx.compose.runtime.Composable

@Composable
fun ReplaceableGroupDemo(showError: Boolean) {
    if (showError) {
        LoginError()
    } else {
        LoginInput()
    }
}

@Composable
fun LoginInput() {
    TODO("Not yet implemented")
}

@Composable
fun LoginError() {
    TODO("Not yet implemented")
}
