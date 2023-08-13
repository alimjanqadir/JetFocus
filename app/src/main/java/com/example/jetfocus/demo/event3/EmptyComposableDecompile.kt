@file:Suppress("LocalVariableName", "UNUSED_ANONYMOUS_PARAMETER", "All", "unused", "NAME_SHADOWING")

package com.example.jetfocus.demo.event3

import androidx.compose.runtime.Composer

fun EmptyComposableDecompile(composer: Composer, changed: Int) {
    composer.startRestartGroup(123) // // 重组范围标记开始

    if (changed != 0 || composer.skipping) {
        // 暂时没有别的UI逻辑
    } else {
        // 跳过
        composer.skipToGroupEnd()
    }

    // 重组范围标记结束。有关此范围的状态改变时递归调用实现重组
    composer.endRestartGroup()?.updateScope { composer, force ->
        EmptyComposableDecompile(composer, changed or 1)
    }
}