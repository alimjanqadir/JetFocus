//package androidx.compose.material3;
//
//import androidx.compose.foundation.BorderStroke;
//import androidx.compose.foundation.interaction.InteractionSourceKt;
//import androidx.compose.foundation.interaction.MutableInteractionSource;
//import androidx.compose.foundation.layout.Arrangement;
//import androidx.compose.foundation.layout.ColumnKt;
//import androidx.compose.foundation.layout.ColumnScope;
//import androidx.compose.foundation.layout.ColumnScopeInstance;
//import androidx.compose.runtime.Applier;
//import androidx.compose.runtime.ComposablesKt;
//import androidx.compose.runtime.Composer;
//import androidx.compose.runtime.ComposerKt;
//import androidx.compose.runtime.RecomposeScopeImplKt;
//import androidx.compose.runtime.ScopeUpdateScope;
//import androidx.compose.runtime.SkippableUpdater;
//import androidx.compose.runtime.Updater;
//import androidx.compose.runtime.internal.ComposableLambdaKt;
//import androidx.compose.ui.Alignment;
//import androidx.compose.ui.Modifier;
//import androidx.compose.ui.graphics.Shape;
//import androidx.compose.ui.layout.LayoutKt;
//import androidx.compose.ui.layout.MeasurePolicy;
//import androidx.compose.ui.node.ComposeUiNode;
//import androidx.compose.ui.platform.CompositionLocalsKt;
//import androidx.compose.ui.platform.ViewConfiguration;
//import androidx.compose.ui.platform.coreshims.ViewCompatShims;
//import androidx.compose.ui.unit.Density;
//import androidx.compose.ui.unit.LayoutDirection;
//import kotlin.Metadata;
//import kotlin.Unit;
//import kotlin.jvm.functions.Function0;
//import kotlin.jvm.functions.Function2;
//import kotlin.jvm.functions.Function3;
//import kotlin.jvm.internal.Intrinsics;
///* compiled from: Card.kt */
//@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a_\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0018\u001au\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001a\u001aS\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001b\u001a\u007f\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a]\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u001d"}, d2 = {"Card", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/CardColors;", "elevation", "Landroidx/compose/material3/CardElevation;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedCard", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedCard", "material3_release"}, k = 2, mv = {1, ViewCompatShims.IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS, 0}, xi = 48)
///* loaded from: /Users/alimjan/Developer/Mobile/Android/JetFocus/app/build/outputs/apk/debug/classes.dex */
//public final class CardKt {
//    /* JADX WARN: Removed duplicated region for block: B:101:0x014b  */
//    /* JADX WARN: Removed duplicated region for block: B:102:0x0162  */
//    /* JADX WARN: Removed duplicated region for block: B:104:0x0165  */
//    /* JADX WARN: Removed duplicated region for block: B:105:0x0167  */
//    /* JADX WARN: Removed duplicated region for block: B:108:0x0172  */
//    /* JADX WARN: Removed duplicated region for block: B:111:0x01fe  */
//    /* JADX WARN: Removed duplicated region for block: B:115:0x020e  */
//    /* JADX WARN: Removed duplicated region for block: B:116:0x0211  */
//    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
//    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
//    /* JADX WARN: Removed duplicated region for block: B:93:0x0115  */
//    /* JADX WARN: Removed duplicated region for block: B:94:0x011e  */
//    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
//    /* JADX WARN: Removed duplicated region for block: B:98:0x0144  */
//    /*
//        Code decompiled incorrectly, please refer to instructions dump.
//    */
//    public static final void Card(Modifier modifier, Shape shape, CardColors colors, CardElevation elevation, BorderStroke border, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer $composer, final int $changed, final int i) {
//        Modifier modifier2;
//        Shape shape2;
//        CardColors cardColors;
//        Object obj;
//        Object obj2;
//        int i2;
//        Modifier modifier3;
//        Shape shape3;
//        CardColors colors2;
//        CardElevation elevation2;
//        BorderStroke border2;
//        Modifier modifier4;
//        Shape shape4;
//        CardColors colors3;
//        CardElevation elevation3;
//        BorderStroke border3;
//        ScopeUpdateScope endRestartGroup;
//        int i3;
//        int i4;
//        int i5;
//        Intrinsics.checkNotNullParameter(function3, "content");
//        Composer $composer2 = $composer.startRestartGroup(1179621553);
//        ComposerKt.sourceInformation($composer2, "C(Card)P(4,5,1,3)77@3629L5,78@3674L12,79@3732L15,86@3923L30,87@3991L28,88@4062L56,89@4162L57,83@3839L460:Card.kt#uh7d8r");
//        final int $dirty = $changed;
//        int i6 = i & 1;
//        if (i6 != 0) {
//            $dirty |= 6;
//            modifier2 = modifier;
//        } else if (($changed & 14) == 0) {
//            modifier2 = modifier;
//            $dirty |= $composer2.changed(modifier2) ? 4 : 2;
//        } else {
//            modifier2 = modifier;
//        }
//        if (($changed & 112) == 0) {
//            if ((i & 2) == 0) {
//                shape2 = shape;
//                if ($composer2.changed(shape2)) {
//                    i5 = 32;
//                    $dirty |= i5;
//                }
//            } else {
//                shape2 = shape;
//            }
//            i5 = 16;
//            $dirty |= i5;
//        } else {
//            shape2 = shape;
//        }
//        if (($changed & 896) == 0) {
//            if ((i & 4) == 0) {
//                cardColors = colors;
//                if ($composer2.changed(cardColors)) {
//                    i4 = 256;
//                    $dirty |= i4;
//                }
//            } else {
//                cardColors = colors;
//            }
//            i4 = 128;
//            $dirty |= i4;
//        } else {
//            cardColors = colors;
//        }
//        if (($changed & 7168) == 0) {
//            if ((i & 8) == 0) {
//                obj = elevation;
//                if ($composer2.changed(obj)) {
//                    i3 = 2048;
//                    $dirty |= i3;
//                }
//            } else {
//                obj = elevation;
//            }
//            i3 = 1024;
//            $dirty |= i3;
//        } else {
//            obj = elevation;
//        }
//        int i7 = i & 16;
//        if (i7 != 0) {
//            $dirty |= 24576;
//            obj2 = border;
//        } else if ((57344 & $changed) == 0) {
//            obj2 = border;
//            $dirty |= $composer2.changed(obj2) ? 16384 : 8192;
//        } else {
//            obj2 = border;
//        }
//        if ((i & 32) == 0) {
//            if ((458752 & $changed) == 0) {
//                i2 = $composer2.changedInstance(function3) ? 131072 : 65536;
//            }
//            if ((374491 & $dirty) == 74898 || !$composer2.getSkipping()) {
//                $composer2.startDefaults();
//                if (($changed & 1) != 0 || $composer2.getDefaultsInvalid()) {
//                    modifier3 = i6 == 0 ? Modifier.Companion : modifier2;
//                    if ((i & 2) == 0) {
//                        shape3 = CardDefaults.INSTANCE.getShape($composer2, 6);
//                        $dirty &= -113;
//                    } else {
//                        shape3 = shape2;
//                    }
//                    if ((i & 4) == 0) {
//                        colors2 = CardDefaults.INSTANCE.m1568cardColorsro_MJ88(0L, 0L, 0L, 0L, $composer2, 24576, 15);
//                        $dirty &= -897;
//                    } else {
//                        colors2 = cardColors;
//                    }
//                    if ((i & 8) == 0) {
//                        elevation2 = CardDefaults.INSTANCE.m1569cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, 1572864, 63);
//                        $dirty &= -7169;
//                    } else {
//                        elevation2 = obj;
//                    }
//                    border2 = i7 == 0 ? null : border;
//                } else {
//                    $composer2.skipToGroupEnd();
//                    if ((i & 2) != 0) {
//                        $dirty &= -113;
//                    }
//                    if ((i & 4) != 0) {
//                        $dirty &= -897;
//                    }
//                    if ((i & 8) != 0) {
//                        $dirty &= -7169;
//                    }
//                    modifier3 = modifier2;
//                    shape3 = shape2;
//                    colors2 = cardColors;
//                    elevation2 = obj;
//                    border2 = obj2;
//                }
//                $composer2.endDefaults();
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventStart(1179621553, $dirty, -1, "androidx.compose.material3.Card (Card.kt:75)");
//                }
//                SurfaceKt.m2095SurfaceT9BRK9s(modifier3, shape3, colors2.containerColor$material3_release(true, $composer2, (($dirty >> 3) & 112) | 6).getValue().m3343unboximpl(), colors2.contentColor$material3_release(true, $composer2, (($dirty >> 3) & 112) | 6).getValue().m3343unboximpl(), elevation2.tonalElevation$material3_release(true, null, $composer2, (($dirty >> 3) & 896) | 54).getValue().unbox-impl(), elevation2.shadowElevation$material3_release(true, null, $composer2, (($dirty >> 3) & 896) | 54).getValue().unbox-impl(), border2, ComposableLambdaKt.composableLambda($composer2, 664103990, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$1
//                    /* JADX INFO: Access modifiers changed from: package-private */
//                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//                    /* JADX WARN: Multi-variable type inference failed */
//                    {
//                        super(2);
//                    }
//
//                    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
//                        invoke((Composer) p1, ((Number) p2).intValue());
//                        return Unit.INSTANCE;
//                    }
//
//                    public final void invoke(Composer $composer3, int $changed2) {
//                        ComposerKt.sourceInformation($composer3, "C92@4268L25:Card.kt#uh7d8r");
//                        if (($changed2 & 11) == 2 && $composer3.getSkipping()) {
//                            $composer3.skipToGroupEnd();
//                            return;
//                        }
//                        if (ComposerKt.isTraceInProgress()) {
//                            ComposerKt.traceEventStart(664103990, $changed2, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:91)");
//                        }
//                        Function3 content$iv = function3;
//                        int $changed$iv = ($dirty >> 6) & 7168;
//                        $composer3.startReplaceableGroup(-483455358);
//                        ComposerKt.sourceInformation($composer3, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
//                        Modifier modifier$iv = Modifier.Companion;
//                        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
//                        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
//                        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
//                        int $changed$iv$iv = ($changed$iv << 3) & 112;
//                        $composer3.startReplaceableGroup(-1323940314);
//                        ComposerKt.sourceInformation($composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
//                        ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                        Object consume = $composer3.consume(CompositionLocalsKt.getLocalDensity());
//                        ComposerKt.sourceInformationMarkerEnd($composer3);
//                        Density density$iv$iv = (Density) consume;
//                        ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                        Object consume2 = $composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
//                        ComposerKt.sourceInformationMarkerEnd($composer3);
//                        LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
//                        ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                        Object consume3 = $composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
//                        ComposerKt.sourceInformationMarkerEnd($composer3);
//                        ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
//                        Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor();
//                        Function3 skippableUpdate$iv$iv$iv = LayoutKt.materializerOf(modifier$iv);
//                        int $changed$iv$iv$iv = (($changed$iv$iv << 9) & 7168) | 6;
//                        if (!($composer3.getApplier() instanceof Applier)) {
//                            ComposablesKt.invalidApplier();
//                        }
//                        $composer3.startReusableNode();
//                        if ($composer3.getInserting()) {
//                            $composer3.createNode(factory$iv$iv$iv);
//                        } else {
//                            $composer3.useNode();
//                        }
//                        $composer3.disableReusing();
//                        Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m2941constructorimpl($composer3);
//                        Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
//                        Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, ComposeUiNode.Companion.getSetDensity());
//                        Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, ComposeUiNode.Companion.getSetLayoutDirection());
//                        Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, ComposeUiNode.Companion.getSetViewConfiguration());
//                        $composer3.enableReusing();
//                        skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.m2929boximpl(SkippableUpdater.m2930constructorimpl($composer3)), $composer3, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
//                        $composer3.startReplaceableGroup(2058660585);
//                        int i8 = ($changed$iv$iv$iv >> 9) & 14;
//                        ComposerKt.sourceInformationMarkerStart($composer3, 276693704, "C79@4027L9:Column.kt#2w3rfo");
//                        content$iv.invoke(ColumnScopeInstance.INSTANCE, $composer3, Integer.valueOf((($changed$iv >> 6) & 112) | 6));
//                        ComposerKt.sourceInformationMarkerEnd($composer3);
//                        $composer3.endReplaceableGroup();
//                        $composer3.endNode();
//                        $composer3.endReplaceableGroup();
//                        $composer3.endReplaceableGroup();
//                        if (ComposerKt.isTraceInProgress()) {
//                            ComposerKt.traceEventEnd();
//                        }
//                    }
//                }), $composer2, 12582912 | ($dirty & 14) | ($dirty & 112) | (($dirty << 6) & 3670016), 0);
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventEnd();
//                }
//                modifier4 = modifier3;
//                shape4 = shape3;
//                colors3 = colors2;
//                elevation3 = elevation2;
//                border3 = border2;
//            } else {
//                $composer2.skipToGroupEnd();
//                modifier4 = modifier2;
//                shape4 = shape2;
//                colors3 = cardColors;
//                border3 = obj2;
//                elevation3 = obj;
//            }
//            endRestartGroup = $composer2.endRestartGroup();
//            if (endRestartGroup != null) {
//                return;
//            }
//            final Modifier modifier5 = modifier4;
//            final Shape shape5 = shape4;
//            final CardColors cardColors2 = colors3;
//            final CardElevation cardElevation = elevation3;
//            final BorderStroke borderStroke = border3;
//            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$2
//                /* JADX INFO: Access modifiers changed from: package-private */
//                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//                /* JADX WARN: Multi-variable type inference failed */
//                {
//                    super(2);
//                }
//
//                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
//                    invoke((Composer) obj3, ((Number) obj4).intValue());
//                    return Unit.INSTANCE;
//                }
//
//                public final void invoke(Composer composer, int i8) {
//                    CardKt.Card(Modifier.this, shape5, cardColors2, cardElevation, borderStroke, function3, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
//                }
//            });
//            return;
//        }
//        i2 = 196608;
//        $dirty |= i2;
//        if ((374491 & $dirty) == 74898) {
//        }
//        $composer2.startDefaults();
//        if (($changed & 1) != 0) {
//        }
//        if (i6 == 0) {
//        }
//        if ((i & 2) == 0) {
//        }
//        if ((i & 4) == 0) {
//        }
//        if ((i & 8) == 0) {
//        }
//        if (i7 == 0) {
//        }
//        $composer2.endDefaults();
//        if (ComposerKt.isTraceInProgress()) {
//        }
//        SurfaceKt.m2095SurfaceT9BRK9s(modifier3, shape3, colors2.containerColor$material3_release(true, $composer2, (($dirty >> 3) & 112) | 6).getValue().m3343unboximpl(), colors2.contentColor$material3_release(true, $composer2, (($dirty >> 3) & 112) | 6).getValue().m3343unboximpl(), elevation2.tonalElevation$material3_release(true, null, $composer2, (($dirty >> 3) & 896) | 54).getValue().unbox-impl(), elevation2.shadowElevation$material3_release(true, null, $composer2, (($dirty >> 3) & 896) | 54).getValue().unbox-impl(), border2, ComposableLambdaKt.composableLambda($composer2, 664103990, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$1
//            /* JADX INFO: Access modifiers changed from: package-private */
//            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//            /* JADX WARN: Multi-variable type inference failed */
//            {
//                super(2);
//            }
//
//            public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
//                invoke((Composer) p1, ((Number) p2).intValue());
//                return Unit.INSTANCE;
//            }
//
//            public final void invoke(Composer $composer3, int $changed2) {
//                ComposerKt.sourceInformation($composer3, "C92@4268L25:Card.kt#uh7d8r");
//                if (($changed2 & 11) == 2 && $composer3.getSkipping()) {
//                    $composer3.skipToGroupEnd();
//                    return;
//                }
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventStart(664103990, $changed2, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:91)");
//                }
//                Function3 content$iv = function3;
//                int $changed$iv = ($dirty >> 6) & 7168;
//                $composer3.startReplaceableGroup(-483455358);
//                ComposerKt.sourceInformation($composer3, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
//                Modifier modifier$iv = Modifier.Companion;
//                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
//                Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
//                MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
//                int $changed$iv$iv = ($changed$iv << 3) & 112;
//                $composer3.startReplaceableGroup(-1323940314);
//                ComposerKt.sourceInformation($composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
//                ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                Object consume = $composer3.consume(CompositionLocalsKt.getLocalDensity());
//                ComposerKt.sourceInformationMarkerEnd($composer3);
//                Density density$iv$iv = (Density) consume;
//                ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                Object consume2 = $composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
//                ComposerKt.sourceInformationMarkerEnd($composer3);
//                LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
//                ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                Object consume3 = $composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
//                ComposerKt.sourceInformationMarkerEnd($composer3);
//                ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
//                Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor();
//                Function3 skippableUpdate$iv$iv$iv = LayoutKt.materializerOf(modifier$iv);
//                int $changed$iv$iv$iv = (($changed$iv$iv << 9) & 7168) | 6;
//                if (!($composer3.getApplier() instanceof Applier)) {
//                    ComposablesKt.invalidApplier();
//                }
//                $composer3.startReusableNode();
//                if ($composer3.getInserting()) {
//                    $composer3.createNode(factory$iv$iv$iv);
//                } else {
//                    $composer3.useNode();
//                }
//                $composer3.disableReusing();
//                Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m2941constructorimpl($composer3);
//                Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
//                Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, ComposeUiNode.Companion.getSetDensity());
//                Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, ComposeUiNode.Companion.getSetLayoutDirection());
//                Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, ComposeUiNode.Companion.getSetViewConfiguration());
//                $composer3.enableReusing();
//                skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.m2929boximpl(SkippableUpdater.m2930constructorimpl($composer3)), $composer3, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
//                $composer3.startReplaceableGroup(2058660585);
//                int i8 = ($changed$iv$iv$iv >> 9) & 14;
//                ComposerKt.sourceInformationMarkerStart($composer3, 276693704, "C79@4027L9:Column.kt#2w3rfo");
//                content$iv.invoke(ColumnScopeInstance.INSTANCE, $composer3, Integer.valueOf((($changed$iv >> 6) & 112) | 6));
//                ComposerKt.sourceInformationMarkerEnd($composer3);
//                $composer3.endReplaceableGroup();
//                $composer3.endNode();
//                $composer3.endReplaceableGroup();
//                $composer3.endReplaceableGroup();
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventEnd();
//                }
//            }
//        }), $composer2, 12582912 | ($dirty & 14) | ($dirty & 112) | (($dirty << 6) & 3670016), 0);
//        if (ComposerKt.isTraceInProgress()) {
//        }
//        modifier4 = modifier3;
//        shape4 = shape3;
//        colors3 = colors2;
//        elevation3 = elevation2;
//        border3 = border2;
//        endRestartGroup = $composer2.endRestartGroup();
//        if (endRestartGroup != null) {
//        }
//    }
//
//    /* JADX WARN: Removed duplicated region for block: B:121:0x0192  */
//    /* JADX WARN: Removed duplicated region for block: B:122:0x0197  */
//    /* JADX WARN: Removed duplicated region for block: B:124:0x019b  */
//    /* JADX WARN: Removed duplicated region for block: B:125:0x019d  */
//    /* JADX WARN: Removed duplicated region for block: B:128:0x01a2  */
//    /* JADX WARN: Removed duplicated region for block: B:129:0x01ac  */
//    /* JADX WARN: Removed duplicated region for block: B:132:0x01b1  */
//    /* JADX WARN: Removed duplicated region for block: B:133:0x01d2  */
//    /* JADX WARN: Removed duplicated region for block: B:136:0x01d8  */
//    /* JADX WARN: Removed duplicated region for block: B:137:0x01f1  */
//    /* JADX WARN: Removed duplicated region for block: B:139:0x01f4  */
//    /* JADX WARN: Removed duplicated region for block: B:140:0x01f6  */
//    /* JADX WARN: Removed duplicated region for block: B:142:0x01fa  */
//    /* JADX WARN: Removed duplicated region for block: B:147:0x023f  */
//    /* JADX WARN: Removed duplicated region for block: B:150:0x0259  */
//    /* JADX WARN: Removed duplicated region for block: B:153:0x0325  */
//    /* JADX WARN: Removed duplicated region for block: B:158:0x0331  */
//    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
//    /*
//        Code decompiled incorrectly, please refer to instructions dump.
//    */
//    public static final void Card(final Function0<Unit> function0, Modifier modifier, boolean enabled, Shape shape, CardColors colors, CardElevation elevation, BorderStroke border, MutableInteractionSource interactionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer $composer, final int $changed, final int i) {
//        boolean z;
//        Shape shape2;
//        CardColors cardColors;
//        Object obj;
//        BorderStroke border2;
//        int i2;
//        Shape shape3;
//        int i3;
//        CardColors colors2;
//        CardElevation elevation2;
//        Modifier modifier2;
//        final int $dirty;
//        MutableInteractionSource interactionSource2;
//        boolean enabled2;
//        BorderStroke border3;
//        Shape shape4;
//        CardColors colors3;
//        CardElevation elevation3;
//        Object value$iv$iv;
//        CardColors colors4;
//        boolean enabled3;
//        CardElevation elevation4;
//        Composer $composer2;
//        ScopeUpdateScope endRestartGroup;
//        int i4;
//        int i5;
//        int i6;
//        Intrinsics.checkNotNullParameter(function0, "onClick");
//        Intrinsics.checkNotNullParameter(function3, "content");
//        Composer $composer3 = $composer.startRestartGroup(-2024281376);
//        ComposerKt.sourceInformation($composer3, "C(Card)P(7,6,4,8,1,3!1,5)135@6366L5,136@6411L12,137@6469L15,139@6570L39,147@6805L23,148@6866L21,149@6930L42,150@7016L43,142@6667L519:Card.kt#uh7d8r");
//        int $dirty2 = $changed;
//        if ((i & 1) != 0) {
//            $dirty2 |= 6;
//        } else if (($changed & 14) == 0) {
//            $dirty2 |= $composer3.changedInstance(function0) ? 4 : 2;
//        }
//        int i7 = i & 2;
//        if (i7 != 0) {
//            $dirty2 |= 48;
//        } else if (($changed & 112) == 0) {
//            $dirty2 |= $composer3.changed(modifier) ? 32 : 16;
//        }
//        int i8 = i & 4;
//        if (i8 != 0) {
//            $dirty2 |= 384;
//            z = enabled;
//        } else if (($changed & 896) == 0) {
//            z = enabled;
//            $dirty2 |= $composer3.changed(z) ? 256 : 128;
//        } else {
//            z = enabled;
//        }
//        if (($changed & 7168) == 0) {
//            if ((i & 8) == 0) {
//                shape2 = shape;
//                if ($composer3.changed(shape2)) {
//                    i6 = 2048;
//                    $dirty2 |= i6;
//                }
//            } else {
//                shape2 = shape;
//            }
//            i6 = 1024;
//            $dirty2 |= i6;
//        } else {
//            shape2 = shape;
//        }
//        if ((57344 & $changed) == 0) {
//            if ((i & 16) == 0) {
//                cardColors = colors;
//                if ($composer3.changed(cardColors)) {
//                    i5 = 16384;
//                    $dirty2 |= i5;
//                }
//            } else {
//                cardColors = colors;
//            }
//            i5 = 8192;
//            $dirty2 |= i5;
//        } else {
//            cardColors = colors;
//        }
//        if ((458752 & $changed) == 0) {
//            if ((i & 32) == 0) {
//                obj = elevation;
//                if ($composer3.changed(obj)) {
//                    i4 = 131072;
//                    $dirty2 |= i4;
//                }
//            } else {
//                obj = elevation;
//            }
//            i4 = 65536;
//            $dirty2 |= i4;
//        } else {
//            obj = elevation;
//        }
//        int i9 = i & 64;
//        if (i9 != 0) {
//            $dirty2 |= 1572864;
//            border2 = border;
//        } else if ((3670016 & $changed) == 0) {
//            border2 = border;
//            $dirty2 |= $composer3.changed(border2) ? 1048576 : 524288;
//        } else {
//            border2 = border;
//        }
//        int i10 = i & 128;
//        if (i10 != 0) {
//            $dirty2 |= 12582912;
//        } else if (($changed & 29360128) == 0) {
//            $dirty2 |= $composer3.changed(interactionSource) ? 8388608 : 4194304;
//        }
//        if ((i & 256) == 0) {
//            if (($changed & 234881024) == 0) {
//                i2 = $composer3.changedInstance(function3) ? 67108864 : 33554432;
//            }
//            if ((191739611 & $dirty2) == 38347922 || !$composer3.getSkipping()) {
//                $composer3.startDefaults();
//                if (($changed & 1) != 0 || $composer3.getDefaultsInvalid()) {
//                    Modifier.Companion modifier3 = i7 == 0 ? Modifier.Companion : modifier;
//                    boolean enabled4 = i8 == 0 ? true : z;
//                    if ((i & 8) == 0) {
//                        shape3 = CardDefaults.INSTANCE.getShape($composer3, 6);
//                        $dirty2 &= -7169;
//                    } else {
//                        shape3 = shape2;
//                    }
//                    if ((i & 16) == 0) {
//                        i3 = i10;
//                        colors2 = CardDefaults.INSTANCE.m1568cardColorsro_MJ88(0L, 0L, 0L, 0L, $composer3, 24576, 15);
//                        $dirty2 &= -57345;
//                    } else {
//                        i3 = i10;
//                        colors2 = cardColors;
//                    }
//                    if ((i & 32) == 0) {
//                        elevation2 = CardDefaults.INSTANCE.m1569cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, 1572864, 63);
//                        $dirty2 &= -458753;
//                    } else {
//                        elevation2 = obj;
//                    }
//                    BorderStroke border4 = i9 == 0 ? null : border;
//                    if (i3 == 0) {
//                        $composer3.startReplaceableGroup(-492369756);
//                        ComposerKt.sourceInformation($composer3, "CC(remember):Composables.kt#9igjgp");
//                        Modifier modifier4 = modifier3;
//                        Object it$iv$iv = $composer3.rememberedValue();
//                        int $dirty3 = $dirty2;
//                        if (it$iv$iv == Composer.Companion.getEmpty()) {
//                            value$iv$iv = InteractionSourceKt.MutableInteractionSource();
//                            $composer3.updateRememberedValue(value$iv$iv);
//                        } else {
//                            value$iv$iv = it$iv$iv;
//                        }
//                        $composer3.endReplaceableGroup();
//                        modifier2 = modifier4;
//                        $dirty = $dirty3;
//                        interactionSource2 = (MutableInteractionSource) value$iv$iv;
//                        enabled2 = enabled4;
//                        border3 = border4;
//                        shape4 = shape3;
//                        colors3 = colors2;
//                        elevation3 = elevation2;
//                    } else {
//                        modifier2 = modifier3;
//                        $dirty = $dirty2;
//                        interactionSource2 = interactionSource;
//                        enabled2 = enabled4;
//                        border3 = border4;
//                        shape4 = shape3;
//                        colors3 = colors2;
//                        elevation3 = elevation2;
//                    }
//                } else {
//                    $composer3.skipToGroupEnd();
//                    if ((i & 8) != 0) {
//                        $dirty2 &= -7169;
//                    }
//                    if ((i & 16) != 0) {
//                        $dirty2 &= -57345;
//                    }
//                    if ((i & 32) != 0) {
//                        modifier2 = modifier;
//                        interactionSource2 = interactionSource;
//                        $dirty = $dirty2 & (-458753);
//                        enabled2 = z;
//                        shape4 = shape2;
//                        colors3 = cardColors;
//                        border3 = border2;
//                        elevation3 = obj;
//                    } else {
//                        modifier2 = modifier;
//                        interactionSource2 = interactionSource;
//                        $dirty = $dirty2;
//                        enabled2 = z;
//                        shape4 = shape2;
//                        colors3 = cardColors;
//                        border3 = border2;
//                        elevation3 = obj;
//                    }
//                }
//                $composer3.endDefaults();
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventStart(-2024281376, $dirty, -1, "androidx.compose.material3.Card (Card.kt:131)");
//                }
//                colors4 = colors3;
//                enabled3 = enabled2;
//                elevation4 = elevation3;
//                $composer2 = $composer3;
//                SurfaceKt.m2098Surfaceo_FOJdg(function0, modifier2, enabled3, shape4, colors3.containerColor$material3_release(enabled2, $composer3, (($dirty >> 6) & 14) | (($dirty >> 9) & 112)).getValue().m3343unboximpl(), colors3.contentColor$material3_release(enabled2, $composer3, (($dirty >> 6) & 14) | (($dirty >> 9) & 112)).getValue().m3343unboximpl(), elevation3.tonalElevation$material3_release(enabled2, interactionSource2, $composer3, (($dirty >> 6) & 14) | (($dirty >> 18) & 112) | (($dirty >> 9) & 896)).getValue().unbox-impl(), elevation3.shadowElevation$material3_release(enabled2, interactionSource2, $composer3, (($dirty >> 9) & 896) | (($dirty >> 6) & 14) | (($dirty >> 18) & 112)).getValue().unbox-impl(), border3, interactionSource2, ComposableLambdaKt.composableLambda($composer3, 776921067, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$4
//                    /* JADX INFO: Access modifiers changed from: package-private */
//                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//                    /* JADX WARN: Multi-variable type inference failed */
//                    {
//                        super(2);
//                    }
//
//                    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
//                        invoke((Composer) p1, ((Number) p2).intValue());
//                        return Unit.INSTANCE;
//                    }
//
//                    public final void invoke(Composer $composer4, int $changed2) {
//                        ComposerKt.sourceInformation($composer4, "C154@7155L25:Card.kt#uh7d8r");
//                        if (($changed2 & 11) == 2 && $composer4.getSkipping()) {
//                            $composer4.skipToGroupEnd();
//                            return;
//                        }
//                        if (ComposerKt.isTraceInProgress()) {
//                            ComposerKt.traceEventStart(776921067, $changed2, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
//                        }
//                        Function3 content$iv = function3;
//                        int $changed$iv = ($dirty >> 15) & 7168;
//                        $composer4.startReplaceableGroup(-483455358);
//                        ComposerKt.sourceInformation($composer4, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
//                        Modifier modifier$iv = Modifier.Companion;
//                        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
//                        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
//                        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer4, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
//                        int $changed$iv$iv = ($changed$iv << 3) & 112;
//                        $composer4.startReplaceableGroup(-1323940314);
//                        ComposerKt.sourceInformation($composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
//                        ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                        Object consume = $composer4.consume(CompositionLocalsKt.getLocalDensity());
//                        ComposerKt.sourceInformationMarkerEnd($composer4);
//                        Density density$iv$iv = (Density) consume;
//                        ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                        Object consume2 = $composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
//                        ComposerKt.sourceInformationMarkerEnd($composer4);
//                        LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
//                        ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                        Object consume3 = $composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
//                        ComposerKt.sourceInformationMarkerEnd($composer4);
//                        ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
//                        Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor();
//                        Function3 skippableUpdate$iv$iv$iv = LayoutKt.materializerOf(modifier$iv);
//                        int $changed$iv$iv$iv = (($changed$iv$iv << 9) & 7168) | 6;
//                        if (!($composer4.getApplier() instanceof Applier)) {
//                            ComposablesKt.invalidApplier();
//                        }
//                        $composer4.startReusableNode();
//                        if ($composer4.getInserting()) {
//                            $composer4.createNode(factory$iv$iv$iv);
//                        } else {
//                            $composer4.useNode();
//                        }
//                        $composer4.disableReusing();
//                        Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m2941constructorimpl($composer4);
//                        Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
//                        Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, ComposeUiNode.Companion.getSetDensity());
//                        Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, ComposeUiNode.Companion.getSetLayoutDirection());
//                        Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, ComposeUiNode.Companion.getSetViewConfiguration());
//                        $composer4.enableReusing();
//                        skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.m2929boximpl(SkippableUpdater.m2930constructorimpl($composer4)), $composer4, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
//                        $composer4.startReplaceableGroup(2058660585);
//                        int i11 = ($changed$iv$iv$iv >> 9) & 14;
//                        ComposerKt.sourceInformationMarkerStart($composer4, 276693704, "C79@4027L9:Column.kt#2w3rfo");
//                        content$iv.invoke(ColumnScopeInstance.INSTANCE, $composer4, Integer.valueOf((($changed$iv >> 6) & 112) | 6));
//                        ComposerKt.sourceInformationMarkerEnd($composer4);
//                        $composer4.endReplaceableGroup();
//                        $composer4.endNode();
//                        $composer4.endReplaceableGroup();
//                        $composer4.endReplaceableGroup();
//                        if (ComposerKt.isTraceInProgress()) {
//                            ComposerKt.traceEventEnd();
//                        }
//                    }
//                }), $composer2, ($dirty & 14) | ($dirty & 112) | ($dirty & 896) | ($dirty & 7168) | (($dirty << 6) & 234881024) | (($dirty << 6) & 1879048192), 6, 0);
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventEnd();
//                }
//                border2 = border3;
//            } else {
//                $composer3.skipToGroupEnd();
//                modifier2 = modifier;
//                interactionSource2 = interactionSource;
//                $composer2 = $composer3;
//                enabled3 = z;
//                shape4 = shape2;
//                colors4 = cardColors;
//                elevation4 = obj;
//            }
//            endRestartGroup = $composer2.endRestartGroup();
//            if (endRestartGroup != null) {
//                return;
//            }
//            final Modifier modifier5 = modifier2;
//            final boolean z2 = enabled3;
//            final Shape shape5 = shape4;
//            final CardColors cardColors2 = colors4;
//            final CardElevation cardElevation = elevation4;
//            final BorderStroke borderStroke = border2;
//            final MutableInteractionSource mutableInteractionSource = interactionSource2;
//            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$5
//                /* JADX INFO: Access modifiers changed from: package-private */
//                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//                /* JADX WARN: Multi-variable type inference failed */
//                {
//                    super(2);
//                }
//
//                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
//                    invoke((Composer) obj2, ((Number) obj3).intValue());
//                    return Unit.INSTANCE;
//                }
//
//                public final void invoke(Composer composer, int i11) {
//                    CardKt.Card(function0, modifier5, z2, shape5, cardColors2, cardElevation, borderStroke, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
//                }
//            });
//            return;
//        }
//        i2 = 100663296;
//        $dirty2 |= i2;
//        if ((191739611 & $dirty2) == 38347922) {
//        }
//        $composer3.startDefaults();
//        if (($changed & 1) != 0) {
//        }
//        if (i7 == 0) {
//        }
//        if (i8 == 0) {
//        }
//        if ((i & 8) == 0) {
//        }
//        if ((i & 16) == 0) {
//        }
//        if ((i & 32) == 0) {
//        }
//        if (i9 == 0) {
//        }
//        if (i3 == 0) {
//        }
//        $composer3.endDefaults();
//        if (ComposerKt.isTraceInProgress()) {
//        }
//        colors4 = colors3;
//        enabled3 = enabled2;
//        elevation4 = elevation3;
//        $composer2 = $composer3;
//        SurfaceKt.m2098Surfaceo_FOJdg(function0, modifier2, enabled3, shape4, colors3.containerColor$material3_release(enabled2, $composer3, (($dirty >> 6) & 14) | (($dirty >> 9) & 112)).getValue().m3343unboximpl(), colors3.contentColor$material3_release(enabled2, $composer3, (($dirty >> 6) & 14) | (($dirty >> 9) & 112)).getValue().m3343unboximpl(), elevation3.tonalElevation$material3_release(enabled2, interactionSource2, $composer3, (($dirty >> 6) & 14) | (($dirty >> 18) & 112) | (($dirty >> 9) & 896)).getValue().unbox-impl(), elevation3.shadowElevation$material3_release(enabled2, interactionSource2, $composer3, (($dirty >> 9) & 896) | (($dirty >> 6) & 14) | (($dirty >> 18) & 112)).getValue().unbox-impl(), border3, interactionSource2, ComposableLambdaKt.composableLambda($composer3, 776921067, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$4
//            /* JADX INFO: Access modifiers changed from: package-private */
//            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//            /* JADX WARN: Multi-variable type inference failed */
//            {
//                super(2);
//            }
//
//            public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
//                invoke((Composer) p1, ((Number) p2).intValue());
//                return Unit.INSTANCE;
//            }
//
//            public final void invoke(Composer $composer4, int $changed2) {
//                ComposerKt.sourceInformation($composer4, "C154@7155L25:Card.kt#uh7d8r");
//                if (($changed2 & 11) == 2 && $composer4.getSkipping()) {
//                    $composer4.skipToGroupEnd();
//                    return;
//                }
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventStart(776921067, $changed2, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
//                }
//                Function3 content$iv = function3;
//                int $changed$iv = ($dirty >> 15) & 7168;
//                $composer4.startReplaceableGroup(-483455358);
//                ComposerKt.sourceInformation($composer4, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
//                Modifier modifier$iv = Modifier.Companion;
//                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
//                Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
//                MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer4, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
//                int $changed$iv$iv = ($changed$iv << 3) & 112;
//                $composer4.startReplaceableGroup(-1323940314);
//                ComposerKt.sourceInformation($composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
//                ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                Object consume = $composer4.consume(CompositionLocalsKt.getLocalDensity());
//                ComposerKt.sourceInformationMarkerEnd($composer4);
//                Density density$iv$iv = (Density) consume;
//                ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                Object consume2 = $composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
//                ComposerKt.sourceInformationMarkerEnd($composer4);
//                LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
//                ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                Object consume3 = $composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
//                ComposerKt.sourceInformationMarkerEnd($composer4);
//                ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
//                Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor();
//                Function3 skippableUpdate$iv$iv$iv = LayoutKt.materializerOf(modifier$iv);
//                int $changed$iv$iv$iv = (($changed$iv$iv << 9) & 7168) | 6;
//                if (!($composer4.getApplier() instanceof Applier)) {
//                    ComposablesKt.invalidApplier();
//                }
//                $composer4.startReusableNode();
//                if ($composer4.getInserting()) {
//                    $composer4.createNode(factory$iv$iv$iv);
//                } else {
//                    $composer4.useNode();
//                }
//                $composer4.disableReusing();
//                Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m2941constructorimpl($composer4);
//                Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
//                Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, ComposeUiNode.Companion.getSetDensity());
//                Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, ComposeUiNode.Companion.getSetLayoutDirection());
//                Updater.m2948setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, ComposeUiNode.Companion.getSetViewConfiguration());
//                $composer4.enableReusing();
//                skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.m2929boximpl(SkippableUpdater.m2930constructorimpl($composer4)), $composer4, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
//                $composer4.startReplaceableGroup(2058660585);
//                int i11 = ($changed$iv$iv$iv >> 9) & 14;
//                ComposerKt.sourceInformationMarkerStart($composer4, 276693704, "C79@4027L9:Column.kt#2w3rfo");
//                content$iv.invoke(ColumnScopeInstance.INSTANCE, $composer4, Integer.valueOf((($changed$iv >> 6) & 112) | 6));
//                ComposerKt.sourceInformationMarkerEnd($composer4);
//                $composer4.endReplaceableGroup();
//                $composer4.endNode();
//                $composer4.endReplaceableGroup();
//                $composer4.endReplaceableGroup();
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventEnd();
//                }
//            }
//        }), $composer2, ($dirty & 14) | ($dirty & 112) | ($dirty & 896) | ($dirty & 7168) | (($dirty << 6) & 234881024) | (($dirty << 6) & 1879048192), 6, 0);
//        if (ComposerKt.isTraceInProgress()) {
//        }
//        border2 = border3;
//        endRestartGroup = $composer2.endRestartGroup();
//        if (endRestartGroup != null) {
//        }
//    }
//
//    public static final void ElevatedCard(Modifier modifier, Shape shape, CardColors colors, CardElevation elevation, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer $composer, final int $changed, final int i) {
//        Object obj;
//        Object obj2;
//        Object obj3;
//        Object obj4;
//        Shape shape2;
//        CardColors colors2;
//        int $dirty;
//        Modifier modifier2;
//        Shape shape3;
//        CardColors colors3;
//        CardElevation elevation2;
//        Composer $composer2;
//        int i2;
//        int i3;
//        int i4;
//        Intrinsics.checkNotNullParameter(function3, "content");
//        Composer $composer3 = $composer.startRestartGroup(895940201);
//        ComposerKt.sourceInformation($composer3, "C(ElevatedCard)P(3,4!1,2)185@8633L13,186@8686L20,187@8752L23,189@8829L140:Card.kt#uh7d8r");
//        int $dirty2 = $changed;
//        int i5 = i & 1;
//        if (i5 != 0) {
//            $dirty2 |= 6;
//            obj = modifier;
//        } else if (($changed & 14) == 0) {
//            obj = modifier;
//            $dirty2 |= $composer3.changed(obj) ? 4 : 2;
//        } else {
//            obj = modifier;
//        }
//        if (($changed & 112) == 0) {
//            if ((i & 2) == 0) {
//                obj2 = shape;
//                if ($composer3.changed(obj2)) {
//                    i4 = 32;
//                    $dirty2 |= i4;
//                }
//            } else {
//                obj2 = shape;
//            }
//            i4 = 16;
//            $dirty2 |= i4;
//        } else {
//            obj2 = shape;
//        }
//        if (($changed & 896) == 0) {
//            if ((i & 4) == 0) {
//                obj3 = colors;
//                if ($composer3.changed(obj3)) {
//                    i3 = 256;
//                    $dirty2 |= i3;
//                }
//            } else {
//                obj3 = colors;
//            }
//            i3 = 128;
//            $dirty2 |= i3;
//        } else {
//            obj3 = colors;
//        }
//        if (($changed & 7168) == 0) {
//            if ((i & 8) == 0) {
//                obj4 = elevation;
//                if ($composer3.changed(obj4)) {
//                    i2 = 2048;
//                    $dirty2 |= i2;
//                }
//            } else {
//                obj4 = elevation;
//            }
//            i2 = 1024;
//            $dirty2 |= i2;
//        } else {
//            obj4 = elevation;
//        }
//        if ((i & 16) != 0) {
//            $dirty2 |= 24576;
//        } else if ((57344 & $changed) == 0) {
//            $dirty2 |= $composer3.changedInstance(function3) ? 16384 : 8192;
//        }
//        if ((46811 & $dirty2) == 9362 && $composer3.getSkipping()) {
//            $composer3.skipToGroupEnd();
//            modifier2 = obj;
//            shape3 = obj2;
//            colors3 = obj3;
//            elevation2 = obj4;
//            $composer2 = $composer3;
//        } else {
//            $composer3.startDefaults();
//            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
//                Modifier modifier3 = i5 != 0 ? Modifier.Companion : obj;
//                if ((i & 2) != 0) {
//                    shape2 = CardDefaults.INSTANCE.getElevatedShape($composer3, 6);
//                    $dirty2 &= -113;
//                } else {
//                    shape2 = obj2;
//                }
//                if ((i & 4) != 0) {
//                    colors2 = CardDefaults.INSTANCE.m1570elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, $composer3, 24576, 15);
//                    $dirty2 &= -897;
//                } else {
//                    colors2 = obj3;
//                }
//                if ((i & 8) != 0) {
//                    $dirty = $dirty2 & (-7169);
//                    modifier2 = modifier3;
//                    shape3 = shape2;
//                    colors3 = colors2;
//                    elevation2 = CardDefaults.INSTANCE.m1571elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, 1572864, 63);
//                } else {
//                    $dirty = $dirty2;
//                    modifier2 = modifier3;
//                    shape3 = shape2;
//                    colors3 = colors2;
//                    elevation2 = obj4;
//                }
//            } else {
//                $composer3.skipToGroupEnd();
//                if ((i & 2) != 0) {
//                    $dirty2 &= -113;
//                }
//                if ((i & 4) != 0) {
//                    $dirty2 &= -897;
//                }
//                if ((i & 8) != 0) {
//                    $dirty2 &= -7169;
//                }
//                $dirty = $dirty2;
//                modifier2 = obj;
//                shape3 = obj2;
//                colors3 = obj3;
//                elevation2 = obj4;
//            }
//            $composer3.endDefaults();
//            if (ComposerKt.isTraceInProgress()) {
//                ComposerKt.traceEventStart(895940201, $dirty, -1, "androidx.compose.material3.ElevatedCard (Card.kt:183)");
//            }
//            $composer2 = $composer3;
//            Card(modifier2, shape3, colors3, elevation2, null, function3, $composer3, ($dirty & 14) | 24576 | ($dirty & 112) | ($dirty & 896) | ($dirty & 7168) | (($dirty << 3) & 458752), 0);
//            if (ComposerKt.isTraceInProgress()) {
//                ComposerKt.traceEventEnd();
//            }
//        }
//        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
//        if (endRestartGroup == null) {
//            return;
//        }
//        final Modifier modifier4 = modifier2;
//        final Shape shape4 = shape3;
//        final CardColors cardColors = colors3;
//        final CardElevation cardElevation = elevation2;
//        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$ElevatedCard$1
//            /* JADX INFO: Access modifiers changed from: package-private */
//            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//            /* JADX WARN: Multi-variable type inference failed */
//            {
//                super(2);
//            }
//
//            public /* bridge */ /* synthetic */ Object invoke(Object obj5, Object obj6) {
//                invoke((Composer) obj5, ((Number) obj6).intValue());
//                return Unit.INSTANCE;
//            }
//
//            public final void invoke(Composer composer, int i6) {
//                CardKt.ElevatedCard(Modifier.this, shape4, cardColors, cardElevation, function3, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
//            }
//        });
//    }
//
//    /* JADX WARN: Removed duplicated region for block: B:110:0x0173  */
//    /* JADX WARN: Removed duplicated region for block: B:111:0x0178  */
//    /* JADX WARN: Removed duplicated region for block: B:113:0x017b  */
//    /* JADX WARN: Removed duplicated region for block: B:114:0x017f  */
//    /* JADX WARN: Removed duplicated region for block: B:117:0x0185  */
//    /* JADX WARN: Removed duplicated region for block: B:118:0x0191  */
//    /* JADX WARN: Removed duplicated region for block: B:121:0x0197  */
//    /* JADX WARN: Removed duplicated region for block: B:122:0x01b1  */
//    /* JADX WARN: Removed duplicated region for block: B:125:0x01b9  */
//    /* JADX WARN: Removed duplicated region for block: B:126:0x01d1  */
//    /* JADX WARN: Removed duplicated region for block: B:128:0x01d5  */
//    /* JADX WARN: Removed duplicated region for block: B:133:0x0211  */
//    /* JADX WARN: Removed duplicated region for block: B:136:0x0224  */
//    /* JADX WARN: Removed duplicated region for block: B:139:0x0279  */
//    /* JADX WARN: Removed duplicated region for block: B:143:0x0283  */
//    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
//    /*
//        Code decompiled incorrectly, please refer to instructions dump.
//    */
//    public static final void ElevatedCard(final Function0<Unit> function0, Modifier modifier, boolean enabled, Shape shape, CardColors colors, CardElevation elevation, MutableInteractionSource interactionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer $composer, final int $changed, final int i) {
//        Object obj;
//        boolean z;
//        Object obj2;
//        Object obj3;
//        Object obj4;
//        Object obj5;
//        int i2;
//        boolean enabled2;
//        Shape shape2;
//        int $dirty;
//        CardColors colors2;
//        CardElevation elevation2;
//        MutableInteractionSource interactionSource2;
//        CardElevation elevation3;
//        int $dirty2;
//        CardColors colors3;
//        Modifier modifier2;
//        Object value$iv$iv;
//        Composer $composer2;
//        ScopeUpdateScope endRestartGroup;
//        int i3;
//        int i4;
//        int i5;
//        Intrinsics.checkNotNullParameter(function0, "onClick");
//        Intrinsics.checkNotNullParameter(function3, "content");
//        Composer $composer3 = $composer.startRestartGroup(-1850977784);
//        ComposerKt.sourceInformation($composer3, "C(ElevatedCard)P(6,5,3,7!1,2,4)234@10976L13,235@11029L20,236@11095L23,237@11170L39,239@11263L229:Card.kt#uh7d8r");
//        int $dirty3 = $changed;
//        if ((i & 1) != 0) {
//            $dirty3 |= 6;
//        } else if (($changed & 14) == 0) {
//            $dirty3 |= $composer3.changedInstance(function0) ? 4 : 2;
//        }
//        int i6 = i & 2;
//        if (i6 != 0) {
//            $dirty3 |= 48;
//            obj = modifier;
//        } else if (($changed & 112) == 0) {
//            obj = modifier;
//            $dirty3 |= $composer3.changed(obj) ? 32 : 16;
//        } else {
//            obj = modifier;
//        }
//        int i7 = i & 4;
//        if (i7 != 0) {
//            $dirty3 |= 384;
//            z = enabled;
//        } else if (($changed & 896) == 0) {
//            z = enabled;
//            $dirty3 |= $composer3.changed(z) ? 256 : 128;
//        } else {
//            z = enabled;
//        }
//        if (($changed & 7168) == 0) {
//            if ((i & 8) == 0) {
//                obj2 = shape;
//                if ($composer3.changed(obj2)) {
//                    i5 = 2048;
//                    $dirty3 |= i5;
//                }
//            } else {
//                obj2 = shape;
//            }
//            i5 = 1024;
//            $dirty3 |= i5;
//        } else {
//            obj2 = shape;
//        }
//        if (($changed & 57344) == 0) {
//            if ((i & 16) == 0) {
//                obj3 = colors;
//                if ($composer3.changed(obj3)) {
//                    i4 = 16384;
//                    $dirty3 |= i4;
//                }
//            } else {
//                obj3 = colors;
//            }
//            i4 = 8192;
//            $dirty3 |= i4;
//        } else {
//            obj3 = colors;
//        }
//        if (($changed & 458752) == 0) {
//            if ((i & 32) == 0) {
//                obj4 = elevation;
//                if ($composer3.changed(obj4)) {
//                    i3 = 131072;
//                    $dirty3 |= i3;
//                }
//            } else {
//                obj4 = elevation;
//            }
//            i3 = 65536;
//            $dirty3 |= i3;
//        } else {
//            obj4 = elevation;
//        }
//        int i8 = i & 64;
//        if (i8 != 0) {
//            $dirty3 |= 1572864;
//            obj5 = interactionSource;
//        } else if ((3670016 & $changed) == 0) {
//            obj5 = interactionSource;
//            $dirty3 |= $composer3.changed(obj5) ? 1048576 : 524288;
//        } else {
//            obj5 = interactionSource;
//        }
//        if ((i & 128) == 0) {
//            if (($changed & 29360128) == 0) {
//                i2 = $composer3.changedInstance(function3) ? 8388608 : 4194304;
//            }
//            if ((23967451 & $dirty3) == 4793490 || !$composer3.getSkipping()) {
//                $composer3.startDefaults();
//                if (($changed & 1) != 0 || $composer3.getDefaultsInvalid()) {
//                    Modifier modifier3 = i6 == 0 ? Modifier.Companion : obj;
//                    enabled2 = i7 == 0 ? true : z;
//                    if ((i & 8) == 0) {
//                        $dirty3 &= -7169;
//                        shape2 = CardDefaults.INSTANCE.getElevatedShape($composer3, 6);
//                    } else {
//                        shape2 = obj2;
//                    }
//                    if ((i & 16) == 0) {
//                        $dirty = $dirty3 & (-57345);
//                        colors2 = CardDefaults.INSTANCE.m1570elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, $composer3, 24576, 15);
//                    } else {
//                        $dirty = $dirty3;
//                        colors2 = obj3;
//                    }
//                    if ((i & 32) == 0) {
//                        elevation2 = CardDefaults.INSTANCE.m1571elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, 1572864, 63);
//                        $dirty &= -458753;
//                    } else {
//                        elevation2 = elevation;
//                    }
//                    if (i8 == 0) {
//                        $composer3.startReplaceableGroup(-492369756);
//                        ComposerKt.sourceInformation($composer3, "CC(remember):Composables.kt#9igjgp");
//                        Object it$iv$iv = $composer3.rememberedValue();
//                        if (it$iv$iv == Composer.Companion.getEmpty()) {
//                            value$iv$iv = InteractionSourceKt.MutableInteractionSource();
//                            $composer3.updateRememberedValue(value$iv$iv);
//                        } else {
//                            value$iv$iv = it$iv$iv;
//                        }
//                        $composer3.endReplaceableGroup();
//                        elevation3 = elevation2;
//                        interactionSource2 = (MutableInteractionSource) value$iv$iv;
//                        $dirty2 = $dirty;
//                        colors3 = colors2;
//                        modifier2 = modifier3;
//                    } else {
//                        interactionSource2 = interactionSource;
//                        elevation3 = elevation2;
//                        $dirty2 = $dirty;
//                        colors3 = colors2;
//                        modifier2 = modifier3;
//                    }
//                } else {
//                    $composer3.skipToGroupEnd();
//                    if ((i & 8) != 0) {
//                        $dirty3 &= -7169;
//                    }
//                    if ((i & 16) != 0) {
//                        $dirty3 &= -57345;
//                    }
//                    if ((i & 32) != 0) {
//                        modifier2 = obj;
//                        enabled2 = z;
//                        shape2 = obj2;
//                        colors3 = obj3;
//                        interactionSource2 = obj5;
//                        elevation3 = obj4;
//                        $dirty2 = $dirty3 & (-458753);
//                    } else {
//                        modifier2 = obj;
//                        enabled2 = z;
//                        shape2 = obj2;
//                        colors3 = obj3;
//                        interactionSource2 = obj5;
//                        elevation3 = obj4;
//                        $dirty2 = $dirty3;
//                    }
//                }
//                $composer3.endDefaults();
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventStart(-1850977784, $dirty2, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
//                }
//                $composer2 = $composer3;
//                Card(function0, modifier2, enabled2, shape2, colors3, elevation3, null, interactionSource2, function3, $composer3, ($dirty2 & 14) | 1572864 | ($dirty2 & 112) | ($dirty2 & 896) | ($dirty2 & 7168) | ($dirty2 & 57344) | ($dirty2 & 458752) | (($dirty2 << 3) & 29360128) | (234881024 & ($dirty2 << 3)), 0);
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventEnd();
//                }
//            } else {
//                $composer3.skipToGroupEnd();
//                modifier2 = obj;
//                enabled2 = z;
//                shape2 = obj2;
//                colors3 = obj3;
//                interactionSource2 = obj5;
//                elevation3 = obj4;
//                $composer2 = $composer3;
//            }
//            endRestartGroup = $composer2.endRestartGroup();
//            if (endRestartGroup != null) {
//                return;
//            }
//            final Modifier modifier4 = modifier2;
//            final boolean z2 = enabled2;
//            final Shape shape3 = shape2;
//            final CardColors cardColors = colors3;
//            final CardElevation cardElevation = elevation3;
//            final MutableInteractionSource mutableInteractionSource = interactionSource2;
//            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$ElevatedCard$3
//                /* JADX INFO: Access modifiers changed from: package-private */
//                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//                /* JADX WARN: Multi-variable type inference failed */
//                {
//                    super(2);
//                }
//
//                public /* bridge */ /* synthetic */ Object invoke(Object obj6, Object obj7) {
//                    invoke((Composer) obj6, ((Number) obj7).intValue());
//                    return Unit.INSTANCE;
//                }
//
//                public final void invoke(Composer composer, int i9) {
//                    CardKt.ElevatedCard(function0, modifier4, z2, shape3, cardColors, cardElevation, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
//                }
//            });
//            return;
//        }
//        i2 = 12582912;
//        $dirty3 |= i2;
//        if ((23967451 & $dirty3) == 4793490) {
//        }
//        $composer3.startDefaults();
//        if (($changed & 1) != 0) {
//        }
//        if (i6 == 0) {
//        }
//        if (i7 == 0) {
//        }
//        if ((i & 8) == 0) {
//        }
//        if ((i & 16) == 0) {
//        }
//        if ((i & 32) == 0) {
//        }
//        if (i8 == 0) {
//        }
//        $composer3.endDefaults();
//        if (ComposerKt.isTraceInProgress()) {
//        }
//        $composer2 = $composer3;
//        Card(function0, modifier2, enabled2, shape2, colors3, elevation3, null, interactionSource2, function3, $composer3, ($dirty2 & 14) | 1572864 | ($dirty2 & 112) | ($dirty2 & 896) | ($dirty2 & 7168) | ($dirty2 & 57344) | ($dirty2 & 458752) | (($dirty2 << 3) & 29360128) | (234881024 & ($dirty2 << 3)), 0);
//        if (ComposerKt.isTraceInProgress()) {
//        }
//        endRestartGroup = $composer2.endRestartGroup();
//        if (endRestartGroup != null) {
//        }
//    }
//
//    /* JADX WARN: Removed duplicated region for block: B:100:0x0134  */
//    /* JADX WARN: Removed duplicated region for block: B:101:0x0150  */
//    /* JADX WARN: Removed duplicated region for block: B:104:0x0155  */
//    /* JADX WARN: Removed duplicated region for block: B:105:0x016c  */
//    /* JADX WARN: Removed duplicated region for block: B:108:0x0171  */
//    /* JADX WARN: Removed duplicated region for block: B:109:0x0184  */
//    /* JADX WARN: Removed duplicated region for block: B:112:0x0194  */
//    /* JADX WARN: Removed duplicated region for block: B:115:0x01cb  */
//    /* JADX WARN: Removed duplicated region for block: B:119:0x01d5  */
//    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
//    /* JADX WARN: Removed duplicated region for block: B:92:0x011b  */
//    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
//    /* JADX WARN: Removed duplicated region for block: B:96:0x0125  */
//    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
//    /*
//        Code decompiled incorrectly, please refer to instructions dump.
//    */
//    public static final void OutlinedCard(Modifier modifier, Shape shape, CardColors colors, CardElevation elevation, BorderStroke border, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer $composer, final int $changed, final int i) {
//        Object obj;
//        Object obj2;
//        Object obj3;
//        Object obj4;
//        Object obj5;
//        int i2;
//        Shape shape2;
//        CardColors colors2;
//        CardElevation elevation2;
//        BorderStroke border2;
//        int $dirty;
//        Modifier modifier2;
//        Shape shape3;
//        CardColors colors3;
//        CardElevation elevation3;
//        Composer $composer2;
//        ScopeUpdateScope endRestartGroup;
//        int i3;
//        int i4;
//        int i5;
//        int i6;
//        Intrinsics.checkNotNullParameter(function3, "content");
//        Composer $composer3 = $composer.startRestartGroup(740336179);
//        ComposerKt.sourceInformation($composer3, "C(OutlinedCard)P(4,5,1,3)279@13027L13,280@13080L20,281@13146L23,282@13211L20,284@13285L142:Card.kt#uh7d8r");
//        int $dirty2 = $changed;
//        int i7 = i & 1;
//        if (i7 != 0) {
//            $dirty2 |= 6;
//            obj = modifier;
//        } else if (($changed & 14) == 0) {
//            obj = modifier;
//            $dirty2 |= $composer3.changed(obj) ? 4 : 2;
//        } else {
//            obj = modifier;
//        }
//        if (($changed & 112) == 0) {
//            if ((i & 2) == 0) {
//                obj2 = shape;
//                if ($composer3.changed(obj2)) {
//                    i6 = 32;
//                    $dirty2 |= i6;
//                }
//            } else {
//                obj2 = shape;
//            }
//            i6 = 16;
//            $dirty2 |= i6;
//        } else {
//            obj2 = shape;
//        }
//        if (($changed & 896) == 0) {
//            if ((i & 4) == 0) {
//                obj3 = colors;
//                if ($composer3.changed(obj3)) {
//                    i5 = 256;
//                    $dirty2 |= i5;
//                }
//            } else {
//                obj3 = colors;
//            }
//            i5 = 128;
//            $dirty2 |= i5;
//        } else {
//            obj3 = colors;
//        }
//        if (($changed & 7168) == 0) {
//            if ((i & 8) == 0) {
//                obj4 = elevation;
//                if ($composer3.changed(obj4)) {
//                    i4 = 2048;
//                    $dirty2 |= i4;
//                }
//            } else {
//                obj4 = elevation;
//            }
//            i4 = 1024;
//            $dirty2 |= i4;
//        } else {
//            obj4 = elevation;
//        }
//        if (($changed & 57344) == 0) {
//            if ((i & 16) == 0) {
//                obj5 = border;
//                if ($composer3.changed(obj5)) {
//                    i3 = 16384;
//                    $dirty2 |= i3;
//                }
//            } else {
//                obj5 = border;
//            }
//            i3 = 8192;
//            $dirty2 |= i3;
//        } else {
//            obj5 = border;
//        }
//        if ((i & 32) == 0) {
//            if (($changed & 458752) == 0) {
//                i2 = $composer3.changedInstance(function3) ? 131072 : 65536;
//            }
//            if ((374491 & $dirty2) == 74898 || !$composer3.getSkipping()) {
//                $composer3.startDefaults();
//                if (($changed & 1) != 0 || $composer3.getDefaultsInvalid()) {
//                    Modifier modifier3 = i7 == 0 ? Modifier.Companion : obj;
//                    if ((i & 2) == 0) {
//                        shape2 = CardDefaults.INSTANCE.getOutlinedShape($composer3, 6);
//                        $dirty2 &= -113;
//                    } else {
//                        shape2 = obj2;
//                    }
//                    if ((i & 4) == 0) {
//                        colors2 = CardDefaults.INSTANCE.m1572outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, $composer3, 24576, 15);
//                        $dirty2 &= -897;
//                    } else {
//                        colors2 = obj3;
//                    }
//                    if ((i & 8) == 0) {
//                        elevation2 = CardDefaults.INSTANCE.m1573outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, 1572864, 63);
//                        $dirty2 &= -7169;
//                    } else {
//                        elevation2 = obj4;
//                    }
//                    if ((i & 16) == 0) {
//                        modifier2 = modifier3;
//                        shape3 = shape2;
//                        colors3 = colors2;
//                        elevation3 = elevation2;
//                        border2 = CardDefaults.INSTANCE.outlinedCardBorder(false, $composer3, 48, 1);
//                        $dirty = $dirty2 & (-57345);
//                    } else {
//                        border2 = border;
//                        $dirty = $dirty2;
//                        modifier2 = modifier3;
//                        shape3 = shape2;
//                        colors3 = colors2;
//                        elevation3 = elevation2;
//                    }
//                } else {
//                    $composer3.skipToGroupEnd();
//                    if ((i & 2) != 0) {
//                        $dirty2 &= -113;
//                    }
//                    if ((i & 4) != 0) {
//                        $dirty2 &= -897;
//                    }
//                    if ((i & 8) != 0) {
//                        $dirty2 &= -7169;
//                    }
//                    if ((i & 16) != 0) {
//                        modifier2 = obj;
//                        shape3 = obj2;
//                        colors3 = obj3;
//                        border2 = obj5;
//                        elevation3 = obj4;
//                        $dirty = $dirty2 & (-57345);
//                    } else {
//                        modifier2 = obj;
//                        shape3 = obj2;
//                        colors3 = obj3;
//                        border2 = obj5;
//                        elevation3 = obj4;
//                        $dirty = $dirty2;
//                    }
//                }
//                $composer3.endDefaults();
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventStart(740336179, $dirty, -1, "androidx.compose.material3.OutlinedCard (Card.kt:277)");
//                }
//                $composer2 = $composer3;
//                Card(modifier2, shape3, colors3, elevation3, border2, function3, $composer3, ($dirty & 14) | ($dirty & 112) | ($dirty & 896) | ($dirty & 7168) | ($dirty & 57344) | ($dirty & 458752), 0);
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventEnd();
//                }
//            } else {
//                $composer3.skipToGroupEnd();
//                modifier2 = obj;
//                shape3 = obj2;
//                colors3 = obj3;
//                $composer2 = $composer3;
//                border2 = obj5;
//                elevation3 = obj4;
//            }
//            endRestartGroup = $composer2.endRestartGroup();
//            if (endRestartGroup != null) {
//                return;
//            }
//            final Modifier modifier4 = modifier2;
//            final Shape shape4 = shape3;
//            final CardColors cardColors = colors3;
//            final CardElevation cardElevation = elevation3;
//            final BorderStroke borderStroke = border2;
//            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$1
//                /* JADX INFO: Access modifiers changed from: package-private */
//                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//                /* JADX WARN: Multi-variable type inference failed */
//                {
//                    super(2);
//                }
//
//                public /* bridge */ /* synthetic */ Object invoke(Object obj6, Object obj7) {
//                    invoke((Composer) obj6, ((Number) obj7).intValue());
//                    return Unit.INSTANCE;
//                }
//
//                public final void invoke(Composer composer, int i8) {
//                    CardKt.OutlinedCard(Modifier.this, shape4, cardColors, cardElevation, borderStroke, function3, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
//                }
//            });
//            return;
//        }
//        i2 = 196608;
//        $dirty2 |= i2;
//        if ((374491 & $dirty2) == 74898) {
//        }
//        $composer3.startDefaults();
//        if (($changed & 1) != 0) {
//        }
//        if (i7 == 0) {
//        }
//        if ((i & 2) == 0) {
//        }
//        if ((i & 4) == 0) {
//        }
//        if ((i & 8) == 0) {
//        }
//        if ((i & 16) == 0) {
//        }
//        $composer3.endDefaults();
//        if (ComposerKt.isTraceInProgress()) {
//        }
//        $composer2 = $composer3;
//        Card(modifier2, shape3, colors3, elevation3, border2, function3, $composer3, ($dirty & 14) | ($dirty & 112) | ($dirty & 896) | ($dirty & 7168) | ($dirty & 57344) | ($dirty & 458752), 0);
//        if (ComposerKt.isTraceInProgress()) {
//        }
//        endRestartGroup = $composer2.endRestartGroup();
//        if (endRestartGroup != null) {
//        }
//    }
//
//    /* JADX WARN: Removed duplicated region for block: B:124:0x019f  */
//    /* JADX WARN: Removed duplicated region for block: B:125:0x01a4  */
//    /* JADX WARN: Removed duplicated region for block: B:127:0x01a8  */
//    /* JADX WARN: Removed duplicated region for block: B:130:0x01ae  */
//    /* JADX WARN: Removed duplicated region for block: B:131:0x01ba  */
//    /* JADX WARN: Removed duplicated region for block: B:134:0x01c0  */
//    /* JADX WARN: Removed duplicated region for block: B:135:0x01dd  */
//    /* JADX WARN: Removed duplicated region for block: B:138:0x01e5  */
//    /* JADX WARN: Removed duplicated region for block: B:139:0x0209  */
//    /* JADX WARN: Removed duplicated region for block: B:142:0x0213  */
//    /* JADX WARN: Removed duplicated region for block: B:143:0x0228  */
//    /* JADX WARN: Removed duplicated region for block: B:145:0x022e  */
//    /* JADX WARN: Removed duplicated region for block: B:150:0x026f  */
//    /* JADX WARN: Removed duplicated region for block: B:153:0x0288  */
//    /* JADX WARN: Removed duplicated region for block: B:156:0x02db  */
//    /* JADX WARN: Removed duplicated region for block: B:160:0x02e5  */
//    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
//    /*
//        Code decompiled incorrectly, please refer to instructions dump.
//    */
//    public static final void OutlinedCard(final Function0<Unit> function0, Modifier modifier, boolean enabled, Shape shape, CardColors colors, CardElevation elevation, BorderStroke border, MutableInteractionSource interactionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer $composer, final int $changed, final int i) {
//        boolean enabled2;
//        Object obj;
//        Object obj2;
//        Object obj3;
//        Object obj4;
//        int i2;
//        Shape shape2;
//        int $dirty;
//        CardColors colors2;
//        boolean enabled3;
//        int i3;
//        CardElevation elevation2;
//        boolean enabled4;
//        BorderStroke border2;
//        MutableInteractionSource interactionSource2;
//        CardElevation elevation3;
//        BorderStroke border3;
//        CardColors colors3;
//        int $dirty2;
//        Modifier modifier2;
//        boolean enabled5;
//        Object value$iv$iv;
//        Composer $composer2;
//        ScopeUpdateScope endRestartGroup;
//        int i4;
//        int i5;
//        int i6;
//        int i7;
//        Intrinsics.checkNotNullParameter(function0, "onClick");
//        Intrinsics.checkNotNullParameter(function3, "content");
//        Composer $composer3 = $composer.startRestartGroup(-727137250);
//        ComposerKt.sourceInformation($composer3, "C(OutlinedCard)P(7,6,4,8,1,3!1,5)330@15524L13,331@15577L20,332@15643L23,333@15708L27,334@15787L39,336@15880L231:Card.kt#uh7d8r");
//        int $dirty3 = $changed;
//        if ((i & 1) != 0) {
//            $dirty3 |= 6;
//        } else if (($changed & 14) == 0) {
//            $dirty3 |= $composer3.changedInstance(function0) ? 4 : 2;
//        }
//        int i8 = i & 2;
//        if (i8 != 0) {
//            $dirty3 |= 48;
//        } else if (($changed & 112) == 0) {
//            $dirty3 |= $composer3.changed(modifier) ? 32 : 16;
//        }
//        int i9 = i & 4;
//        if (i9 != 0) {
//            $dirty3 |= 384;
//            enabled2 = enabled;
//        } else if (($changed & 896) == 0) {
//            enabled2 = enabled;
//            $dirty3 |= $composer3.changed(enabled2) ? 256 : 128;
//        } else {
//            enabled2 = enabled;
//        }
//        if (($changed & 7168) == 0) {
//            if ((i & 8) == 0) {
//                obj = shape;
//                if ($composer3.changed(obj)) {
//                    i7 = 2048;
//                    $dirty3 |= i7;
//                }
//            } else {
//                obj = shape;
//            }
//            i7 = 1024;
//            $dirty3 |= i7;
//        } else {
//            obj = shape;
//        }
//        if (($changed & 57344) == 0) {
//            if ((i & 16) == 0) {
//                obj2 = colors;
//                if ($composer3.changed(obj2)) {
//                    i6 = 16384;
//                    $dirty3 |= i6;
//                }
//            } else {
//                obj2 = colors;
//            }
//            i6 = 8192;
//            $dirty3 |= i6;
//        } else {
//            obj2 = colors;
//        }
//        if (($changed & 458752) == 0) {
//            if ((i & 32) == 0) {
//                obj3 = elevation;
//                if ($composer3.changed(obj3)) {
//                    i5 = 131072;
//                    $dirty3 |= i5;
//                }
//            } else {
//                obj3 = elevation;
//            }
//            i5 = 65536;
//            $dirty3 |= i5;
//        } else {
//            obj3 = elevation;
//        }
//        if (($changed & 3670016) == 0) {
//            if ((i & 64) == 0) {
//                obj4 = border;
//                if ($composer3.changed(obj4)) {
//                    i4 = 1048576;
//                    $dirty3 |= i4;
//                }
//            } else {
//                obj4 = border;
//            }
//            i4 = 524288;
//            $dirty3 |= i4;
//        } else {
//            obj4 = border;
//        }
//        int i10 = i & 128;
//        if (i10 != 0) {
//            $dirty3 |= 12582912;
//        } else if (($changed & 29360128) == 0) {
//            $dirty3 |= $composer3.changed(interactionSource) ? 8388608 : 4194304;
//        }
//        if ((i & 256) == 0) {
//            if (($changed & 234881024) == 0) {
//                i2 = $composer3.changedInstance(function3) ? 67108864 : 33554432;
//            }
//            if ((191739611 & $dirty3) == 38347922 || !$composer3.getSkipping()) {
//                $composer3.startDefaults();
//                if (($changed & 1) != 0 || $composer3.getDefaultsInvalid()) {
//                    Modifier.Companion modifier3 = i8 == 0 ? Modifier.Companion : modifier;
//                    if (i9 != 0) {
//                        enabled2 = true;
//                    }
//                    if ((i & 8) == 0) {
//                        $dirty3 &= -7169;
//                        shape2 = CardDefaults.INSTANCE.getOutlinedShape($composer3, 6);
//                    } else {
//                        shape2 = obj;
//                    }
//                    if ((i & 16) == 0) {
//                        $dirty = $dirty3 & (-57345);
//                        colors2 = CardDefaults.INSTANCE.m1572outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, $composer3, 24576, 15);
//                    } else {
//                        $dirty = $dirty3;
//                        colors2 = obj2;
//                    }
//                    if ((i & 32) == 0) {
//                        enabled3 = enabled2;
//                        i3 = i10;
//                        elevation2 = CardDefaults.INSTANCE.m1573outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, 1572864, 63);
//                        $dirty &= -458753;
//                    } else {
//                        enabled3 = enabled2;
//                        i3 = i10;
//                        elevation2 = elevation;
//                    }
//                    if ((i & 64) == 0) {
//                        enabled4 = enabled3;
//                        border2 = CardDefaults.INSTANCE.outlinedCardBorder(enabled4, $composer3, (($dirty >> 6) & 14) | 48, 0);
//                        $dirty &= -3670017;
//                    } else {
//                        enabled4 = enabled3;
//                        border2 = border;
//                    }
//                    if (i3 == 0) {
//                        $composer3.startReplaceableGroup(-492369756);
//                        ComposerKt.sourceInformation($composer3, "CC(remember):Composables.kt#9igjgp");
//                        Object it$iv$iv = $composer3.rememberedValue();
//                        Modifier modifier4 = modifier3;
//                        if (it$iv$iv == Composer.Companion.getEmpty()) {
//                            value$iv$iv = InteractionSourceKt.MutableInteractionSource();
//                            $composer3.updateRememberedValue(value$iv$iv);
//                        } else {
//                            value$iv$iv = it$iv$iv;
//                        }
//                        $composer3.endReplaceableGroup();
//                        interactionSource2 = (MutableInteractionSource) value$iv$iv;
//                        elevation3 = elevation2;
//                        border3 = border2;
//                        colors3 = colors2;
//                        $dirty2 = $dirty;
//                        modifier2 = modifier4;
//                        enabled5 = enabled4;
//                    } else {
//                        interactionSource2 = interactionSource;
//                        elevation3 = elevation2;
//                        border3 = border2;
//                        colors3 = colors2;
//                        $dirty2 = $dirty;
//                        modifier2 = modifier3;
//                        enabled5 = enabled4;
//                    }
//                } else {
//                    $composer3.skipToGroupEnd();
//                    if ((i & 8) != 0) {
//                        $dirty3 &= -7169;
//                    }
//                    if ((i & 16) != 0) {
//                        $dirty3 &= -57345;
//                    }
//                    if ((i & 32) != 0) {
//                        $dirty3 &= -458753;
//                    }
//                    if ((i & 64) != 0) {
//                        modifier2 = modifier;
//                        interactionSource2 = interactionSource;
//                        enabled5 = enabled2;
//                        shape2 = obj;
//                        colors3 = obj2;
//                        border3 = obj4;
//                        elevation3 = obj3;
//                        $dirty2 = (-3670017) & $dirty3;
//                    } else {
//                        modifier2 = modifier;
//                        interactionSource2 = interactionSource;
//                        enabled5 = enabled2;
//                        shape2 = obj;
//                        colors3 = obj2;
//                        border3 = obj4;
//                        elevation3 = obj3;
//                        $dirty2 = $dirty3;
//                    }
//                }
//                $composer3.endDefaults();
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventStart(-727137250, $dirty2, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
//                }
//                $composer2 = $composer3;
//                Card(function0, modifier2, enabled5, shape2, colors3, elevation3, border3, interactionSource2, function3, $composer3, ($dirty2 & 14) | ($dirty2 & 112) | ($dirty2 & 896) | ($dirty2 & 7168) | ($dirty2 & 57344) | ($dirty2 & 458752) | ($dirty2 & 3670016) | ($dirty2 & 29360128) | ($dirty2 & 234881024), 0);
//                if (ComposerKt.isTraceInProgress()) {
//                    ComposerKt.traceEventEnd();
//                }
//            } else {
//                $composer3.skipToGroupEnd();
//                modifier2 = modifier;
//                interactionSource2 = interactionSource;
//                enabled5 = enabled2;
//                shape2 = obj;
//                colors3 = obj2;
//                border3 = obj4;
//                elevation3 = obj3;
//                $composer2 = $composer3;
//            }
//            endRestartGroup = $composer2.endRestartGroup();
//            if (endRestartGroup != null) {
//                return;
//            }
//            final Modifier modifier5 = modifier2;
//            final boolean z = enabled5;
//            final Shape shape3 = shape2;
//            final CardColors cardColors = colors3;
//            final CardElevation cardElevation = elevation3;
//            final BorderStroke borderStroke = border3;
//            final MutableInteractionSource mutableInteractionSource = interactionSource2;
//            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$3
//                /* JADX INFO: Access modifiers changed from: package-private */
//                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//                /* JADX WARN: Multi-variable type inference failed */
//                {
//                    super(2);
//                }
//
//                public /* bridge */ /* synthetic */ Object invoke(Object obj5, Object obj6) {
//                    invoke((Composer) obj5, ((Number) obj6).intValue());
//                    return Unit.INSTANCE;
//                }
//
//                public final void invoke(Composer composer, int i11) {
//                    CardKt.OutlinedCard(function0, modifier5, z, shape3, cardColors, cardElevation, borderStroke, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
//                }
//            });
//            return;
//        }
//        i2 = 100663296;
//        $dirty3 |= i2;
//        if ((191739611 & $dirty3) == 38347922) {
//        }
//        $composer3.startDefaults();
//        if (($changed & 1) != 0) {
//        }
//        if (i8 == 0) {
//        }
//        if (i9 != 0) {
//        }
//        if ((i & 8) == 0) {
//        }
//        if ((i & 16) == 0) {
//        }
//        if ((i & 32) == 0) {
//        }
//        if ((i & 64) == 0) {
//        }
//        if (i3 == 0) {
//        }
//        $composer3.endDefaults();
//        if (ComposerKt.isTraceInProgress()) {
//        }
//        $composer2 = $composer3;
//        Card(function0, modifier2, enabled5, shape2, colors3, elevation3, border3, interactionSource2, function3, $composer3, ($dirty2 & 14) | ($dirty2 & 112) | ($dirty2 & 896) | ($dirty2 & 7168) | ($dirty2 & 57344) | ($dirty2 & 458752) | ($dirty2 & 3670016) | ($dirty2 & 29360128) | ($dirty2 & 234881024), 0);
//        if (ComposerKt.isTraceInProgress()) {
//        }
//        endRestartGroup = $composer2.endRestartGroup();
//        if (endRestartGroup != null) {
//        }
//    }
//}
