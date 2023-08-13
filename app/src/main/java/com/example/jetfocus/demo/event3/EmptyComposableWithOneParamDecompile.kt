@file:Suppress("LocalVariableName", "UNUSED_ANONYMOUS_PARAMETER", "All", "unused", "NAME_SHADOWING")

package com.example.jetfocus.demo.event3

import androidx.compose.runtime.Composer

fun EmptyComposableWithOneParamDecompile(param: Int, composer: Composer, changed: Int) {
    composer.startRestartGroup(123) // 开始重组范围

    // 对函数参数做改动检查
    var dirty: Int = changed
    if (changed and 0b1110 == 0) {
        dirty = dirty or if (composer.changed(param))  0b100 else 0b010
    }

    // 按检查结果来判断是否可以跳过
    if (dirty and 0b1011 != 0b010 || composer.skipping) {
        println(param)
    } else {
        // 跳过
        composer.skipToGroupEnd()
    }

    // 结束重组范围。重组范围的逻辑，有关此范围的状态改变时递归调用实现重组
    composer.endRestartGroup()?.updateScope { composer, force ->
        EmptyComposableWithOneParamDecompile(param, composer, changed or 1)
    }
}