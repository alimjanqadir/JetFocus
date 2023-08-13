//@file:Suppress("unused")
//
//package com.example.jetfocus.demo.event3
//
//import androidx.compose.material3.LocalContentColor
//import androidx.compose.runtime.Composer
//import androidx.compose.runtime.CompositionLocalMap
//import androidx.compose.runtime.InternalComposeApi
//import androidx.compose.runtime.SkippableUpdater
//import androidx.compose.runtime.Updater
//import androidx.compose.ui.ExperimentalComposeUiApi
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.takeOrElse
//import androidx.compose.ui.layout.Measurable
//import androidx.compose.ui.layout.MeasurePolicy
//import androidx.compose.ui.layout.MeasureResult
//import androidx.compose.ui.layout.MeasureScope
//import androidx.compose.ui.materialize
//import androidx.compose.ui.platform.ViewConfiguration
//import androidx.compose.ui.unit.Constraints
//import androidx.compose.ui.unit.Density
//import androidx.compose.ui.unit.LayoutDirection
//
//
//fun TextDecompile(modifier: Modifier, composer: Composer, changed: Int) {
//    composer.startRestartGroup(123) // Text 开始重组范围
//    var dirty = changed
//    dirty = dirty or 0b001
//    dirty = dirty or 0b001
//    dirty = dirty or 0b001
//    if (changed != 0 || !composer.skipping) {
//        composer.startReplaceableGroup(-72882467) // 选 textColor if 语句
//        val textColor = color.takeOrElse {
//            style.color.takeOrElse {
//                LocalContentColor.current
//            }
//        }
//        composer.endReplaceableGroup() // textColor 可替换组结束
//        val changedForSpacer: Int = changed shl 3 and 112 or 384
//        composer.endReplaceableGroup(-1323940314) // Layout可替换组开始(用可替换组的原因是内联函数)
//        BasicText("", composer, changed)
//        composer.endReplaceableGroup() // Spacer 可替换组结束
//    } else {
//        // 跳过
//        composer.skipToGroupEnd()
//    }
//
//    // 结束重组范围。重组范围的逻辑，有关此范围的状态改变时递归调用实现重组
//    composer.endRestartGroup()?.updateScope { composer, force ->
//        TextDecompile(composer, changed or 1)
//    }
//}
//
//
//private fun <T> Updater<T>.update() {
//    TODO("Not yet implemented")
//}
//
//
//
//
//private object SpacerMeasurePolicy : MeasurePolicy {
//
//    override fun MeasureScope.measure(
//        measurables: List<Measurable>,
//        constraints: Constraints
//    ): MeasureResult {
//        return with(constraints) {
//            val width = if (hasFixedWidth) maxWidth else 0
//            val height = if (hasFixedHeight) maxHeight else 0
//            layout(width, height) {}
//        }
//    }
//}
//
//internal interface ComposeUiNode {
//    var measurePolicy: MeasurePolicy
//    var layoutDirection: LayoutDirection
//    var density: Density
//    var modifier: Modifier
//    var viewConfiguration: ViewConfiguration
//    var compositionLocalMap: CompositionLocalMap
//
//    @ExperimentalComposeUiApi
//    var compositeKeyHash: Int
//
//    /**
//     * Object of pre-allocated lambdas used to make use with ComposeNode allocation-less.
//     */
//    companion object {
//        val Constructor: () -> ComposeUiNode = TODO()
//        val VirtualConstructor: () -> ComposeUiNode = TODO()
//        val SetModifier: ComposeUiNode.(Modifier) -> Unit = { this.modifier = it }
//        val SetDensity: ComposeUiNode.(Density) -> Unit = { this.density = it }
//        val SetResolvedCompositionLocals: ComposeUiNode.(CompositionLocalMap) -> Unit =
//            { this.compositionLocalMap = it }
//        val SetMeasurePolicy: ComposeUiNode.(MeasurePolicy) -> Unit =
//            { this.measurePolicy = it }
//        val SetLayoutDirection: ComposeUiNode.(LayoutDirection) -> Unit =
//            { this.layoutDirection = it }
//        val SetViewConfiguration: ComposeUiNode.(ViewConfiguration) -> Unit =
//            { this.viewConfiguration = it }
//
//        @get:ExperimentalComposeUiApi
//        @Suppress("OPT_IN_MARKER_ON_WRONG_TARGET")
//        @ExperimentalComposeUiApi
//        val SetCompositeKeyHash: ComposeUiNode.(Int) -> Unit =
//            { this.compositeKeyHash = it }
//    }
//}
