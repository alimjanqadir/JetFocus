@file:Suppress("LocalVariableName", "UNUSED_ANONYMOUS_PARAMETER", "All", "unused", "NAME_SHADOWING")

package com.example.jetfocus.demo.event3

import androidx.compose.runtime.Composer

fun EmptyComposableWithTwoParamsDecompile(param1: Int, param2: Int, composer: Composer, changed: Int) {
    composer.startRestartGroup(123) // 重组范围标记开始

    // 对函数参数做改动检查
    var dirty: Int = changed
    if (changed and 0b1110 == 0) { // 检查参数一
        dirty = dirty or if (composer.changed(param1)) 0b100 else 0b010
    }

    if (changed and 0b1110000 == 0) { // 检查参数二
        dirty = dirty or if (composer.changed(param2)) 0b100000 else 0b10000
    }

    // 按检查结果来判断是否可以跳过
    if (dirty and 0b1011011 != 0b10010 || composer.skipping) {
        println("param1: $param1, param2: $param2")
    } else {
        // 跳过
        composer.skipToGroupEnd()
    }

    // 重组范围标记结束。有关此范围的状态改变时递归调用实现重组
    composer.endRestartGroup()?.updateScope { composer, force ->
        EmptyComposableWithTwoParamsDecompile(param1, param2, composer, changed or 1)
    }
}