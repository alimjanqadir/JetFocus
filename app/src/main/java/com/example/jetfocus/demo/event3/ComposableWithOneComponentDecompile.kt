@file:Suppress("LocalVariableName", "UNUSED_ANONYMOUS_PARAMETER", "All", "unused", "NAME_SHADOWING")

package com.example.jetfocus.demo.event3

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composer
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
fun ComposableWithOneComponentDecompile(composer: Composer, changed: Int) {
    composer.startRestartGroup(123) // 开始重组范围
    if (changed != 0 || composer.skipping) { // 如果不能跳过就执行UI逻辑
        Spacer(modifier = Modifier.size(10.dp), composer, changed or 1)
    } else {
        // 跳过
        composer.skipToGroupEnd()
    }
    // 结束重组范围。重组范围的逻辑，有关此范围的状态改变时递归调用实现重组
    composer.endRestartGroup()?.updateScope { composer, _ ->
        ComposableWithOneComponentDecompile(composer, changed or 1)
    }
}

fun Spacer(modifier: Modifier, composer: Composer, i: Int) {
    TODO("Not yet implemented")
}
