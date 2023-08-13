//package com.example.jetfocus.demo.event3;
//
//import androidx.compose.runtime.Composer;
//import androidx.compose.runtime.ComposerKt;
//import androidx.compose.runtime.RecomposeScopeImplKt;
//import androidx.compose.runtime.ScopeUpdateScope;
//import kotlin.Metadata;
//import kotlin.Unit;
//import kotlin.jvm.functions.Function2;
///* compiled from: EmptyComposableWithTwoParam.kt */
//@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"EmptyComposableWithTwoParam", "", "param1", "", "param2", "(IILandroidx/compose/runtime/Composer;I)V", "app_debug"}, k = 2, mv = {1, 9, 0}, xi = 48)
///* loaded from: /Users/alimjan/Developer/Mobile/Android/JetFocus/app/build/outputs/apk/debug/classes8.dex */
//public final class EmptyComposableWithTwoParamKt {
//    public static final void EmptyComposableWithTwoParam(final int param1, final int param2, Composer $composer, final int $changed) {
//        Composer $composer2 = $composer.startRestartGroup(-2058223490);
//        ComposerKt.sourceInformation($composer2, "C(EmptyComposableWithTwoParam):EmptyComposableWithTwoParam.kt#mmohyy");
//        int $dirty = $changed;
//        if (($changed & 14) == 0) {
//            $dirty |= $composer2.changed(param1) ? 4 : 2;
//        }
//        if (($changed & 112) == 0) {
//            $dirty |= $composer2.changed(param2) ? 32 : 16;
//        }
//        if (($dirty & 91) != 18 || !$composer2.getSkipping()) {
//            if (ComposerKt.isTraceInProgress()) {
//                ComposerKt.traceEventStart(-2058223490, $changed, -1, "com.example.jetfocus.demo.event3.EmptyComposableWithTwoParam (EmptyComposableWithTwoParam.kt:6)");
//            }
//            System.out.println((Object) (LiveLiterals$EmptyComposableWithTwoParamKt.INSTANCE.m20String$0$str$arg0$callprintln$funEmptyComposableWithTwoParam() + param1 + LiveLiterals$EmptyComposableWithTwoParamKt.INSTANCE.m21String$2$str$arg0$callprintln$funEmptyComposableWithTwoParam() + param2));
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
//        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.example.jetfocus.demo.event3.EmptyComposableWithTwoParamKt$EmptyComposableWithTwoParam$1
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
//                EmptyComposableWithTwoParamKt.EmptyComposableWithTwoParam(param1, param2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
//            }
//        });
//    }
//}
