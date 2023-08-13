@file:Suppress("LocalVariableName", "UNUSED_ANONYMOUS_PARAMETER", "All", "unused", "NAME_SHADOWING")

package com.example.jetfocus.demo.event3

import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MovableGroupDemo() {
    key(1) {
        Group()
    }
    key(2) {
        Group()
    }
    key(3) {
        Group()
    }
    key(4) {
        Group()
    }
    key(5) {
        Group()
    }
}

@Composable
fun Group() {
}
