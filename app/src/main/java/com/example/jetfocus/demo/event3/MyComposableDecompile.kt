@file:Suppress("UNUSED_ANONYMOUS_PARAMETER", "NAME_SHADOWING")

package com.example.jetfocus.demo.event3

import androidx.compose.runtime.Composer

fun MyComposableDecompile(composer: Composer, changed: Int) {
    composer.startRestartGroup(123) // MyComposable开始重组范围
    if (changed != 0 || !composer.skipping) {
        Card(
            /*一些参数被忽略 Modifier, shape, cardColor */
            { composer, changed ->
               content()
            },
            composer, changed,
        )
    } else {
        // 跳过
        composer.skipToGroupEnd()
    }
    // 结束重组范围。重组范围的逻辑，有关此范围的状态改变时递归调用实现重组
    composer.endRestartGroup()?.updateScope { composer, force ->
        MyComposableDecompile(composer, changed or 1)
    }
}

fun content() {
    TODO("Not yet implemented")
}

