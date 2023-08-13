//package com.example.jetfocus.demo.event3;
//
//import androidx.compose.foundation.layout.ColumnScope;
//import androidx.compose.material3.TextKt;
//import androidx.compose.runtime.Composer;
//import androidx.compose.runtime.ComposerKt;
//import androidx.compose.runtime.internal.ComposableLambdaKt;
//import androidx.compose.ui.Modifier;
//import androidx.compose.ui.text.TextStyle;
//import androidx.compose.ui.text.font.FontFamily;
//import androidx.compose.ui.text.font.FontStyle;
//import androidx.compose.ui.text.font.FontWeight;
//import androidx.compose.ui.text.style.TextAlign;
//import androidx.compose.ui.text.style.TextDecoration;
//import kotlin.Metadata;
//import kotlin.Unit;
//import kotlin.jvm.functions.Function1;
//import kotlin.jvm.functions.Function3;
//import kotlin.jvm.internal.Intrinsics;
///* compiled from: MyComposable.kt */
//@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
///* loaded from: /Users/alimjan/Developer/Mobile/Android/JetFocus/app/build/outputs/apk/debug/classes8.dex */
//public final class ComposableSingletons$MyComposableKt {
//    public static final ComposableSingletons$MyComposableKt INSTANCE = new ComposableSingletons$MyComposableKt();
//
//    /* renamed from: lambda-1  reason: not valid java name */
//    public static Function3<ColumnScope, Composer, Integer, Unit> f2lambda1 = ComposableLambdaKt.composableLambdaInstance(-385382464, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.jetfocus.demo.event3.ComposableSingletons$MyComposableKt$lambda-1$1
//        public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
//            invoke((ColumnScope) p1, (Composer) p2, ((Number) p3).intValue());
//            return Unit.INSTANCE;
//        }
//
//        public final void invoke(ColumnScope $this$Card, Composer $composer, int $changed) {
//            Intrinsics.checkNotNullParameter($this$Card, "$this$Card");
//            ComposerKt.sourceInformation($composer, "C11@276L13,12@298L14:MyComposable.kt#mmohyy");
//            if (($changed & 81) != 16 || !$composer.getSkipping()) {
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventStart(-385382464, $changed, -1, "com.example.jetfocus.demo.event3.ComposableSingletons$MyComposableKt.lambda-1.<anonymous> (MyComposable.kt:10)");
//                }
//                TextKt.Text--4IGK_g(LiveLiterals$MyComposableKt.INSTANCE.m24x654bf42f(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 131070);
//                TextKt.Text--4IGK_g(LiveLiterals$MyComposableKt.INSTANCE.m25x6d29328b(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 131070);
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventEnd();
//                    return;
//                }
//                return;
//            }
//            $composer.skipToGroupEnd();
//        }
//    });
//
//    /* renamed from: getLambda-1$app_debug  reason: not valid java name */
//    public final Function3<ColumnScope, Composer, Integer, Unit> m2getLambda1$app_debug() {
//        return f2lambda1;
//    }
//}
