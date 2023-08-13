//package com.example.jetfocus.demo.event3;
//
//import androidx.compose.foundation.BorderStroke;
//import androidx.compose.material3.CardColors;
//import androidx.compose.material3.CardElevation;
//import androidx.compose.material3.CardKt;
//import androidx.compose.runtime.Composer;
//import androidx.compose.runtime.ComposerKt;
//import androidx.compose.runtime.RecomposeScopeImplKt;
//import androidx.compose.runtime.ScopeUpdateScope;
//import androidx.compose.ui.Modifier;
//import androidx.compose.ui.graphics.Shape;
//import kotlin.Metadata;
//import kotlin.Unit;
//import kotlin.jvm.functions.Function2;
///* compiled from: MyComposable.kt */
//@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"MyComposable", "", "(Landroidx/compose/runtime/Composer;I)V", "app_debug"}, k = 2, mv = {1, 9, 0}, xi = 48)
///* loaded from: /Users/alimjan/Developer/Mobile/Android/JetFocus/app/build/outputs/apk/debug/classes8.dex */
//public final class MyComposableKt {
//    public static final void MyComposable(Composer $composer, final int $changed) {
//        Composer $composer2 = $composer.startRestartGroup(-358423694);
//        ComposerKt.sourceInformation($composer2, "C(MyComposable)10@261L57:MyComposable.kt#mmohyy");
//        if ($changed != 0 || !$composer2.getSkipping()) {
//            if (ComposerKt.isTraceInProgress()) {
//                ComposerKt.traceEventStart(-358423694, $changed, -1, "com.example.jetfocus.demo.event3.MyComposable (MyComposable.kt:9)");
//            }
//            CardKt.Card((Modifier) null, (Shape) null, (CardColors) null, (CardElevation) null, (BorderStroke) null, ComposableSingletons$MyComposableKt.INSTANCE.m2getLambda1$app_debug(), $composer2, 196608, 31);
//            if (ComposerKt.isTraceInProgress()) {
//                ComposerKt.traceEventEnd();
//            }
//        } else {
//            $composer2.skipToGroupEnd();
//        }
//        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
//        if (endRestartGroup == null) {
//            return;
//        }
//        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.example.jetfocus.demo.event3.MyComposableKt$MyComposable$1
//            /* JADX INFO: Access modifiers changed from: package-private */
//            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//            {
//                super(2);
//            }
//
//            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
//                invoke((Composer) obj, ((Number) obj2).intValue());
//                return Unit.INSTANCE;
//            }
//
//            public final void invoke(Composer composer, int i) {
//                MyComposableKt.MyComposable(composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
//            }
//        });
//    }
//}
