//package com.example.jetfocus.demo.event3;
//
//import androidx.compose.runtime.Composer;
//import androidx.compose.runtime.ComposerKt;
//import androidx.compose.runtime.RecomposeScopeImplKt;
//import androidx.compose.runtime.ScopeUpdateScope;
//import kotlin.Metadata;
//import kotlin.Unit;
//import kotlin.jvm.functions.Function2;
///* compiled from: MovabeGroup.kt */
//@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Group", "", "(Landroidx/compose/runtime/Composer;I)V", "MovableGroupDemo", "app_debug"}, k = 2, mv = {1, 9, 0}, xi = 48)
///* loaded from: /Users/alimjan/Developer/Mobile/Android/JetFocus/app/build/outputs/apk/debug/classes8.dex */
//public final class MoveabeGroupKt {
//    public static final void MovableGroupDemo(Composer $composer, final int $changed) {
//        Composer $composer2 = $composer.startRestartGroup(1970462330);
//        ComposerKt.sourceInformation($composer2, "C(MovableGroupDemo):MovabeGroup.kt#mmohyy");
//        if ($changed != 0 || !$composer2.getSkipping()) {
//            if (ComposerKt.isTraceInProgress()) {
//                ComposerKt.traceEventStart(1970462330, $changed, -1, "com.example.jetfocus.demo.event3.MovableGroupDemo (MovabeGroup.kt:10)");
//            }
//            $composer2.startMovableGroup(1555520137, Integer.valueOf(LiveLiterals$MoveabeGroupKt.INSTANCE.m40Int$0$vararg$arg0$callkey$funMovableGroupDemo()));
//            ComposerKt.sourceInformation($composer2, "12@342L7");
//            Group($composer2, 0);
//            $composer2.endMovableGroup();
//            $composer2.startMovableGroup(1555520172, Integer.valueOf(LiveLiterals$MoveabeGroupKt.INSTANCE.m41Int$0$vararg$arg0$callkey1$funMovableGroupDemo()));
//            ComposerKt.sourceInformation($composer2, "15@377L7");
//            Group($composer2, 0);
//            $composer2.endMovableGroup();
//            $composer2.startMovableGroup(1555520207, Integer.valueOf(LiveLiterals$MoveabeGroupKt.INSTANCE.m42Int$0$vararg$arg0$callkey2$funMovableGroupDemo()));
//            ComposerKt.sourceInformation($composer2, "18@412L7");
//            Group($composer2, 0);
//            $composer2.endMovableGroup();
//            $composer2.startMovableGroup(1555520242, Integer.valueOf(LiveLiterals$MoveabeGroupKt.INSTANCE.m43Int$0$vararg$arg0$callkey3$funMovableGroupDemo()));
//            ComposerKt.sourceInformation($composer2, "21@447L7");
//            Group($composer2, 0);
//            $composer2.endMovableGroup();
//            $composer2.startMovableGroup(1555520277, Integer.valueOf(LiveLiterals$MoveabeGroupKt.INSTANCE.m44Int$0$vararg$arg0$callkey4$funMovableGroupDemo()));
//            ComposerKt.sourceInformation($composer2, "24@482L7");
//            Group($composer2, 0);
//            $composer2.endMovableGroup();
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
//        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.example.jetfocus.demo.event3.MoveabeGroupKt$MovableGroupDemo$1
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
//                MoveabeGroupKt.MovableGroupDemo(composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
//            }
//        });
//    }
//
//    public static final void Group(Composer $composer, final int $changed) {
//        Composer $composer2 = $composer.startRestartGroup(-480498135);
//        ComposerKt.sourceInformation($composer2, "C(Group):MovabeGroup.kt#mmohyy");
//        if ($changed != 0 || !$composer2.getSkipping()) {
//            if (ComposerKt.isTraceInProgress()) {
//                ComposerKt.traceEventStart(-480498135, $changed, -1, "com.example.jetfocus.demo.event3.Group (MovabeGroup.kt:29)");
//            }
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
//        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.example.jetfocus.demo.event3.MoveabeGroupKt$Group$1
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
//                MoveabeGroupKt.Group(composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
//            }
//        });
//    }
//}
