@file:Suppress("LocalVariableName")

package com.example.jetfocus.demo.event3

import androidx.compose.runtime.Composer

fun EmptyComposableDecompile(composer: Composer, changed: Int) {
    composer.startRestartGroup(123) // 开始重组范围
    if (changed != 0 || composer.skipping) {
        // 暂时没有别的UI逻辑
    } else {
        // 跳过
        composer.skipToGroupEnd()
    }
    // 结束重组范围。重组范围的逻辑，有关此范围的状态改变时递归调用实现重组
    composer.endRestartGroup()?.updateScope { composer, _ ->
        EmptyComposableDecompile(composer, changed or 1)
    }
}

fun Text(s: String, composer: Composer, key: Int, changed: Int) {
    TODO("Not yet implemented")
}

fun Layout() {
    TODO("Not yet implemented")
}