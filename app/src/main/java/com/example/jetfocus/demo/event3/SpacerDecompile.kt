@file:Suppress("unused")

package com.example.jetfocus.demo.event3

import androidx.compose.runtime.Composer
import androidx.compose.runtime.CompositionLocalMap
import androidx.compose.runtime.InternalComposeApi
import androidx.compose.runtime.SkippableUpdater
import androidx.compose.runtime.Updater
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.materialize
import androidx.compose.ui.platform.ViewConfiguration
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

/*准备节点需要的Modifier链*/


fun SpacerDecompile(modifier: Modifier, composer: Composer, changed: Int) {
    composer.startReplaceableGroup(-72882467) // 作为不可重组组件 Spacer 标记可替换组开始而不是可重组组

    composer.startReplaceableGroup(-1323940314) // Layout 是内联函数所以也标记可替换组

    // 准备节点所需的属性
    val spacerMeasurePolicy = SpacerMeasurePolicy
    val compositionLocalMap = composer.currentCompositionLocalMap
    val materializedModifiers = composer.materialize(modifier)  /*准备节点的Modifier链*/

    // 准备节点构造器
    val factory: () -> Any = ComposeUiNode.Constructor
    // 创建节点
    composer.startReusableNode()
    if (composer.inserting) {
        /* 用节点构造器创建节点*/
        composer.createNode(factory)
    } else {
        composer.useNode()
    }
    // 设置节点属性
    Updater<ComposeUiNode>(composer).set(spacerMeasurePolicy, ComposeUiNode.SetMeasurePolicy)
    Updater<ComposeUiNode>(composer).set(compositionLocalMap, ComposeUiNode.SetResolvedCompositionLocals)
    Updater<ComposeUiNode>(composer).set(materializedModifiers, ComposeUiNode.SetModifier)

    composer.startReplaceableGroup(2058660585) // content lambda
    composer.endReplaceableGroup() // content lambda

    composer.endNode()
    // 创建节点结束

    composer.endReplaceableGroup() // Layout 可替换组结束
    composer.endReplaceableGroup() // Spacer 可替换组结束
}


private fun <T> Updater<T>.update() {
    TODO("Not yet implemented")
}




private object SpacerMeasurePolicy : MeasurePolicy {

    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints
    ): MeasureResult {
        return with(constraints) {
            val width = if (hasFixedWidth) maxWidth else 0
            val height = if (hasFixedHeight) maxHeight else 0
            layout(width, height) {}
        }
    }
}

internal interface ComposeUiNode {
    var measurePolicy: MeasurePolicy
    var layoutDirection: LayoutDirection
    var density: Density
    var modifier: Modifier
    var viewConfiguration: ViewConfiguration
    var compositionLocalMap: CompositionLocalMap

    @ExperimentalComposeUiApi
    var compositeKeyHash: Int

    /**
     * Object of pre-allocated lambdas used to make use with ComposeNode allocation-less.
     */
    companion object {
        val Constructor: () -> ComposeUiNode = TODO()
        val VirtualConstructor: () -> ComposeUiNode = TODO()
        val SetModifier: ComposeUiNode.(Modifier) -> Unit = { this.modifier = it }
        val SetDensity: ComposeUiNode.(Density) -> Unit = { this.density = it }
        val SetResolvedCompositionLocals: ComposeUiNode.(CompositionLocalMap) -> Unit =
            { this.compositionLocalMap = it }
        val SetMeasurePolicy: ComposeUiNode.(MeasurePolicy) -> Unit =
            { this.measurePolicy = it }
        val SetLayoutDirection: ComposeUiNode.(LayoutDirection) -> Unit =
            { this.layoutDirection = it }
        val SetViewConfiguration: ComposeUiNode.(ViewConfiguration) -> Unit =
            { this.viewConfiguration = it }

        @get:ExperimentalComposeUiApi
        @Suppress("OPT_IN_MARKER_ON_WRONG_TARGET")
        @ExperimentalComposeUiApi
        val SetCompositeKeyHash: ComposeUiNode.(Int) -> Unit =
            { this.compositeKeyHash = it }
    }
}
