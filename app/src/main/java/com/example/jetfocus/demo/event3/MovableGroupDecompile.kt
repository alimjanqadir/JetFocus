@file:Suppress("LocalVariableName", "UNUSED_ANONYMOUS_PARAMETER", "All", "unused", "NAME_SHADOWING")

package com.example.jetfocus.demo.event3

import androidx.compose.runtime.Composer

fun MovableGroupDecompile(composer: Composer, changed: Int) {
    composer.startRestartGroup(6869896) // // 重组范围标记开始
    if (changed != 0 || composer.skipping) {

        // 为每个key标记一个 Movable Group
        composer.startMovableGroup(1555520137, 1)
        Group(composer, 0)
        composer.endMovableGroup()
        composer.startMovableGroup(1555520172, 2)
        Group(composer, 0)
        composer.endMovableGroup()
        composer.startMovableGroup(1555520207, 3)
        Group(composer, 0)
        composer.endMovableGroup()
        composer.startMovableGroup(1555520242, 4)
        Group(composer, 0)
        composer.endMovableGroup()
        composer.startMovableGroup(1555520277, 5)
        Group(composer, 0)
        composer.endMovableGroup()

    } else {
        // 跳过
        composer.skipToGroupEnd()
    }

    // 重组范围标记结束。有关此范围的状态改变时递归调用实现重组
    composer.endRestartGroup()?.updateScope { composer, force ->
        MovableGroupDecompile(composer, changed or 1)
    }
}


fun Group(composer: Composer, changed: Int) {
}
