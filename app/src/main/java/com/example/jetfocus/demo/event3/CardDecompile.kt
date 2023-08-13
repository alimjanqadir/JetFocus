@file:Suppress("UNUSED_ANONYMOUS_PARAMETER", "NAME_SHADOWING", "UNUSED_PARAMETER", "unused")

package com.example.jetfocus.demo.event3

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Composer


fun CardDecompile(
    /*隐藏部分参数*/
    param1: Any,
    content: @Composable () -> Unit,
    composer: Composer,
    changed: Int
) {
    composer.startRestartGroup(123) // 开始重组范围

    // 对函数参数做改动检查，有多个参数，被隐藏
    var dirty: Int = changed
    if (changed and 0b1110 == 0) {
        dirty = dirty or if (composer.changed(param1)) 0b100 else 0b010
    }

    // 按检查结果来判断是否可以跳过
    if (dirty and 0b1011011 != 0b10010 || composer.skipping) {
        Surface(
            /*一些参数被忽略 Modifier, shape, cardColor */
            { composer, changed -> // BoxScope
                Text("Hello", composer, changed)
                Text("World", composer, changed)
            },
            composer, changed,
        )
    } else {
        // 跳过
        composer.skipToGroupEnd()
    }

    // 结束重组范围。重组范围的逻辑，有关此范围的状态改变时递归调用实现重组
    composer.endRestartGroup()?.updateScope { composer, force ->
        CardDecompile(param1, content, composer, changed or 1)
    }
}

fun Text(s: String, composer: Composer, changed: Int) {
    TODO("Not yet implemented")
}

fun Surface(function: @Composable (Composer, Int) -> Unit, composer: Composer, changed: Int) {
    TODO("Not yet implemented")
}

fun Card(function: (Composer, Int) -> Unit, composer: Composer, changed: Int) {
    TODO("Not yet implemented")
}
