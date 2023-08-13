//package androidx.compose.material3;
//
//import androidx.compose.foundation.text.BasicTextKt;
//import androidx.compose.foundation.text.InlineTextContent;
//import androidx.compose.runtime.Composer;
//import androidx.compose.runtime.ComposerKt;
//import androidx.compose.runtime.CompositionLocalKt;
//import androidx.compose.runtime.ProvidableCompositionLocal;
//import androidx.compose.runtime.ProvidedValue;
//import androidx.compose.runtime.ScopeUpdateScope;
//import androidx.compose.runtime.SnapshotStateKt;
//import androidx.compose.ui.Modifier;
//import androidx.compose.ui.graphics.Color;
//import androidx.compose.ui.graphics.Shadow;
//import androidx.compose.ui.text.AnnotatedString;
//import androidx.compose.ui.text.TextLayoutResult;
//import androidx.compose.ui.text.TextStyle;
//import androidx.compose.ui.text.font.FontFamily;
//import androidx.compose.ui.text.font.FontStyle;
//import androidx.compose.ui.text.font.FontSynthesis;
//import androidx.compose.ui.text.font.FontWeight;
//import androidx.compose.ui.text.intl.LocaleList;
//import androidx.compose.ui.text.style.BaselineShift;
//import androidx.compose.ui.text.style.TextAlign;
//import androidx.compose.ui.text.style.TextDecoration;
//import androidx.compose.ui.text.style.TextDirection;
//import androidx.compose.ui.text.style.TextGeometricTransform;
//import androidx.compose.ui.text.style.TextIndent;
//import androidx.compose.ui.text.style.TextOverflow;
//import androidx.compose.ui.unit.TextUnit;
//import java.util.Map;
//import kotlin.Metadata;
//import kotlin.Unit;
//import kotlin.collections.MapsKt;
//import kotlin.jvm.functions.Function0;
//import kotlin.jvm.functions.Function1;
//import kotlin.jvm.functions.Function2;
//import kotlin.jvm.internal.DefaultConstructorMarker;
//import kotlin.jvm.internal.Intrinsics;
///* compiled from: Text.kt */
//@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aß\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001aÉ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020)2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
///* loaded from: /Users/alimjan/Downloads/classes.dex */
//public final class TextKt {
//    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material3.TextKt$LocalTextStyle$1
//        /* renamed from: invoke */
//        public final TextStyle m1873invoke() {
//            return TextStyle.Companion.getDefault();
//        }
//    });
//
//    /* renamed from: Text-fLXpl1I  reason: not valid java name */
//    public static final void m1872TextfLXpl1I(final String text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, Function1<? super TextLayoutResult, Unit> function1, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int i) {
//        int i2;
//        long color2;
//        long fontSize2;
//        FontStyle fontStyle2;
//        FontWeight fontWeight2;
//        FontFamily fontFamily2;
//        long letterSpacing2;
//        TextAlign textAlign2;
//        long lineHeight2;
//        int overflow2;
//        boolean softWrap2;
//        int maxLines2;
//        Function1 onTextLayout;
//        TextStyle style2;
//        Modifier modifier2;
//        int $dirty1;
//        TextDecoration textDecoration2;
//        long color3;
//        long textColor;
//        Modifier modifier3;
//        TextDecoration textDecoration3;
//        TextStyle style3;
//        int overflow3;
//        TextAlign textAlign3;
//        boolean softWrap3;
//        int maxLines3;
//        Function1 onTextLayout2;
//        FontStyle fontStyle3;
//        FontWeight fontWeight3;
//        FontFamily fontFamily3;
//        long letterSpacing3;
//        long lineHeight3;
//        long color4;
//        long fontSize3;
//        int i3;
//        Intrinsics.checkNotNullParameter(text, "text");
//        Composer $composer2 = $composer.startRestartGroup(1968784669);
//        ComposerKt.sourceInformation($composer2, "C(Text)P(13,8,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,15,14:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,10:c#ui.text.style.TextOverflow,11)104@5368L7,127@6086L145:Text.kt#uh7d8r");
//        int $dirty = $changed;
//        int $dirty12 = $changed1;
//        if ((i & 1) != 0) {
//            $dirty |= 6;
//        } else if (($changed & 14) == 0) {
//            $dirty |= $composer2.changed(text) ? 4 : 2;
//        }
//        int i4 = i & 2;
//        if (i4 != 0) {
//            $dirty |= 48;
//        } else if (($changed & 112) == 0) {
//            $dirty |= $composer2.changed(modifier) ? 32 : 16;
//        }
//        int i5 = i & 4;
//        if (i5 != 0) {
//            $dirty |= 384;
//        } else if (($changed & 896) == 0) {
//            $dirty |= $composer2.changed(color) ? 256 : 128;
//        }
//        int i6 = i & 8;
//        if (i6 != 0) {
//            $dirty |= 3072;
//        } else if (($changed & 7168) == 0) {
//            $dirty |= $composer2.changed(fontSize) ? 2048 : 1024;
//        }
//        int i7 = i & 16;
//        if (i7 != 0) {
//            $dirty |= 24576;
//        } else if (($changed & 57344) == 0) {
//            $dirty |= $composer2.changed(fontStyle) ? 16384 : 8192;
//        }
//        int i8 = i & 32;
//        if (i8 != 0) {
//            $dirty |= 196608;
//        } else if (($changed & 458752) == 0) {
//            $dirty |= $composer2.changed(fontWeight) ? 131072 : 65536;
//        }
//        int i9 = i & 64;
//        if (i9 != 0) {
//            $dirty |= 1572864;
//        } else if (($changed & 3670016) == 0) {
//            $dirty |= $composer2.changed(fontFamily) ? 1048576 : 524288;
//        }
//        int i10 = i & 128;
//        if (i10 != 0) {
//            $dirty |= 12582912;
//        } else if (($changed & 29360128) == 0) {
//            $dirty |= $composer2.changed(letterSpacing) ? 8388608 : 4194304;
//        }
//        int i11 = i & 256;
//        if (i11 != 0) {
//            $dirty |= 100663296;
//        } else if (($changed & 234881024) == 0) {
//            $dirty |= $composer2.changed(textDecoration) ? 67108864 : 33554432;
//        }
//        int i12 = i & 512;
//        if (i12 != 0) {
//            $dirty |= 805306368;
//        } else if (($changed & 1879048192) == 0) {
//            $dirty |= $composer2.changed(textAlign) ? 536870912 : 268435456;
//        }
//        int i13 = i & 1024;
//        if (i13 != 0) {
//            $dirty12 |= 6;
//        } else if (($changed1 & 14) == 0) {
//            $dirty12 |= $composer2.changed(lineHeight) ? 4 : 2;
//        }
//        int i14 = i & 2048;
//        if (i14 != 0) {
//            $dirty12 |= 48;
//        } else if (($changed1 & 112) == 0) {
//            $dirty12 |= $composer2.changed(overflow) ? 32 : 16;
//        }
//        int i15 = i & 4096;
//        if (i15 != 0) {
//            $dirty12 |= 384;
//        } else if (($changed1 & 896) == 0) {
//            $dirty12 |= $composer2.changed(softWrap) ? 256 : 128;
//        }
//        int i16 = i & 8192;
//        if (i16 != 0) {
//            $dirty12 |= 3072;
//        } else if (($changed1 & 7168) == 0) {
//            $dirty12 |= $composer2.changed(maxLines) ? 2048 : 1024;
//        }
//        int i17 = i & 16384;
//        if (i17 != 0) {
//            $dirty12 |= 24576;
//            i2 = i17;
//        } else if (($changed1 & 57344) == 0) {
//            i2 = i17;
//            $dirty12 |= $composer2.changed(function1) ? 16384 : 8192;
//        } else {
//            i2 = i17;
//        }
//        if (($changed1 & 458752) == 0) {
//            if ((i & 32768) == 0 && $composer2.changed(style)) {
//                i3 = 131072;
//                $dirty12 |= i3;
//            }
//            i3 = 65536;
//            $dirty12 |= i3;
//        }
//        if (($dirty & 1533916891) == 306783378 && (374491 & $dirty12) == 74898 && $composer2.getSkipping()) {
//            $composer2.skipToGroupEnd();
//            modifier3 = modifier;
//            color4 = color;
//            fontSize3 = fontSize;
//            fontStyle3 = fontStyle;
//            fontWeight3 = fontWeight;
//            fontFamily3 = fontFamily;
//            letterSpacing3 = letterSpacing;
//            textDecoration3 = textDecoration;
//            textAlign3 = textAlign;
//            lineHeight3 = lineHeight;
//            overflow3 = overflow;
//            softWrap3 = softWrap;
//            maxLines3 = maxLines;
//            onTextLayout2 = function1;
//            style3 = style;
//        } else {
//            $composer2.startDefaults();
//            if (($changed & 1) == 0 || $composer2.getDefaultsInvalid()) {
//                Modifier.Companion modifier4 = i4 != 0 ? Modifier.Companion : modifier;
//                color2 = i5 != 0 ? Color.Companion.m2925getUnspecified0d7_KjU() : color;
//                fontSize2 = i6 != 0 ? TextUnit.Companion.m5722getUnspecifiedXSAIIZE() : fontSize;
//                fontStyle2 = i7 != 0 ? null : fontStyle;
//                fontWeight2 = i8 != 0 ? null : fontWeight;
//                fontFamily2 = i9 != 0 ? null : fontFamily;
//                letterSpacing2 = i10 != 0 ? TextUnit.Companion.m5722getUnspecifiedXSAIIZE() : letterSpacing;
//                TextDecoration textDecoration4 = i11 != 0 ? null : textDecoration;
//                textAlign2 = i12 != 0 ? null : textAlign;
//                lineHeight2 = i13 != 0 ? TextUnit.Companion.m5722getUnspecifiedXSAIIZE() : lineHeight;
//                overflow2 = i14 != 0 ? TextOverflow.Companion.m5425getClipgIe3tQ8() : overflow;
//                softWrap2 = i15 != 0 ? true : softWrap;
//                maxLines2 = i16 != 0 ? Integer.MAX_VALUE : maxLines;
//                onTextLayout = i2 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$1
//                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
//                        invoke((TextLayoutResult) p1);
//                        return Unit.INSTANCE;
//                    }
//
//                    public final void invoke(TextLayoutResult it) {
//                        Intrinsics.checkNotNullParameter(it, "it");
//                    }
//                } : function1;
//                if ((i & 32768) != 0) {
//                    TextDecoration textDecoration5 = textDecoration4;
//                    Modifier modifier5 = modifier4;
//                    ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                    Object consume = $composer2.consume(LocalTextStyle);
//                    ComposerKt.sourceInformationMarkerEnd($composer2);
//                    style2 = (TextStyle) consume;
//                    $dirty1 = $dirty12 & (-458753);
//                    textDecoration2 = textDecoration5;
//                    modifier2 = modifier5;
//                } else {
//                    TextDecoration textDecoration6 = textDecoration4;
//                    Modifier modifier6 = modifier4;
//                    style2 = style;
//                    modifier2 = modifier6;
//                    $dirty1 = $dirty12;
//                    textDecoration2 = textDecoration6;
//                }
//            } else {
//                $composer2.skipToGroupEnd();
//                if ((i & 32768) != 0) {
//                    int i18 = (-458753) & $dirty12;
//                    color2 = color;
//                    fontSize2 = fontSize;
//                    fontStyle2 = fontStyle;
//                    fontWeight2 = fontWeight;
//                    fontFamily2 = fontFamily;
//                    letterSpacing2 = letterSpacing;
//                    textDecoration2 = textDecoration;
//                    textAlign2 = textAlign;
//                    lineHeight2 = lineHeight;
//                    overflow2 = overflow;
//                    softWrap2 = softWrap;
//                    maxLines2 = maxLines;
//                    onTextLayout = function1;
//                    style2 = style;
//                    $dirty1 = i18;
//                    modifier2 = modifier;
//                } else {
//                    modifier2 = modifier;
//                    color2 = color;
//                    fontSize2 = fontSize;
//                    fontStyle2 = fontStyle;
//                    fontWeight2 = fontWeight;
//                    fontFamily2 = fontFamily;
//                    letterSpacing2 = letterSpacing;
//                    textAlign2 = textAlign;
//                    lineHeight2 = lineHeight;
//                    overflow2 = overflow;
//                    softWrap2 = softWrap;
//                    maxLines2 = maxLines;
//                    onTextLayout = function1;
//                    style2 = style;
//                    $dirty1 = $dirty12;
//                    textDecoration2 = textDecoration;
//                }
//            }
//            $composer2.endDefaults();
//            if (ComposerKt.isTraceInProgress()) {
//                ComposerKt.traceEventStart(1968784669, $dirty, $dirty1, "androidx.compose.material3.Text (Text.kt:88)");
//            }
//            $composer2.startReplaceableGroup(79582607);
//            ComposerKt.sourceInformation($composer2, "*109@5483L7");
//            long $this$takeOrElse_u2dDxMtmZc$iv = color2;
//            if ($this$takeOrElse_u2dDxMtmZc$iv != Color.Companion.m2925getUnspecified0d7_KjU()) {
//                color3 = color2;
//                textColor = $this$takeOrElse_u2dDxMtmZc$iv;
//            } else {
//                long $this$takeOrElse_u2dDxMtmZc$iv2 = style2.m5034getColor0d7_KjU();
//                if ($this$takeOrElse_u2dDxMtmZc$iv2 != Color.Companion.m2925getUnspecified0d7_KjU()) {
//                    color3 = color2;
//                } else {
//                    color3 = color2;
//                    ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                    Object consume2 = $composer2.consume(ContentColorKt.getLocalContentColor());
//                    ComposerKt.sourceInformationMarkerEnd($composer2);
//                    $this$takeOrElse_u2dDxMtmZc$iv2 = ((Color) consume2).m2899unboximpl();
//                }
//                textColor = $this$takeOrElse_u2dDxMtmZc$iv2;
//            }
//            $composer2.endReplaceableGroup();
//            TextStyle mergedStyle = style2.merge(new TextStyle(textColor, fontSize2, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, letterSpacing2, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, lineHeight2, (TextIndent) null, 175952, (DefaultConstructorMarker) null));
//            BasicTextKt.m800BasicTextBpD7jsM(text, modifier2, mergedStyle, onTextLayout, overflow2, softWrap2, maxLines2, $composer2, ($dirty & 14) | ($dirty & 112) | (($dirty1 >> 3) & 7168) | (($dirty1 << 9) & 57344) | (($dirty1 << 9) & 458752) | (3670016 & ($dirty1 << 9)), 0);
//            if (ComposerKt.isTraceInProgress()) {
//                ComposerKt.traceEventEnd();
//            }
//            modifier3 = modifier2;
//            textDecoration3 = textDecoration2;
//            style3 = style2;
//            overflow3 = overflow2;
//            textAlign3 = textAlign2;
//            softWrap3 = softWrap2;
//            maxLines3 = maxLines2;
//            onTextLayout2 = onTextLayout;
//            fontStyle3 = fontStyle2;
//            fontWeight3 = fontWeight2;
//            fontFamily3 = fontFamily2;
//            letterSpacing3 = letterSpacing2;
//            lineHeight3 = lineHeight2;
//            color4 = color3;
//            fontSize3 = fontSize2;
//        }
//        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
//        if (endRestartGroup == null) {
//            return;
//        }
//        final Modifier modifier7 = modifier3;
//        final long j = color4;
//        final long j2 = fontSize3;
//        final FontStyle fontStyle4 = fontStyle3;
//        final FontWeight fontWeight4 = fontWeight3;
//        final FontFamily fontFamily4 = fontFamily3;
//        final long j3 = letterSpacing3;
//        final TextDecoration textDecoration7 = textDecoration3;
//        final TextAlign textAlign4 = textAlign3;
//        final long j4 = lineHeight3;
//        final int i19 = overflow3;
//        final boolean z = softWrap3;
//        final int i20 = maxLines3;
//        final Function1 function12 = onTextLayout2;
//        final TextStyle textStyle = style3;
//        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$2
//            /* JADX INFO: Access modifiers changed from: package-private */
//            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//            /* JADX WARN: Multi-variable type inference failed */
//            {
//                super(2);
//            }
//
//            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
//                invoke((Composer) obj, ((Number) obj2).intValue());
//                return Unit.INSTANCE;
//            }
//
//            public final void invoke(Composer composer, int i21) {
//                TextKt.m1872TextfLXpl1I(text, modifier7, j, j2, fontStyle4, fontWeight4, fontFamily4, j3, textDecoration7, textAlign4, j4, i19, z, i20, function12, textStyle, composer, $changed | 1, $changed1, i);
//            }
//        });
//    }
//
//    /* renamed from: Text--4IGK_g  reason: not valid java name */
//    public static final void m1871Text4IGK_g(final AnnotatedString text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int i) {
//        int i2;
//        long color2;
//        long fontSize2;
//        FontStyle fontStyle2;
//        FontWeight fontWeight2;
//        FontFamily fontFamily2;
//        long letterSpacing2;
//        TextAlign textAlign2;
//        Map inlineContent;
//        TextStyle style2;
//        Modifier modifier2;
//        int $dirty1;
//        Function1 onTextLayout;
//        long lineHeight2;
//        TextDecoration textDecoration2;
//        Map inlineContent2;
//        int maxLines2;
//        boolean softWrap2;
//        int overflow2;
//        Map inlineContent3;
//        int maxLines3;
//        long textColor;
//        int $dirty;
//        Map inlineContent4;
//        int maxLines4;
//        Modifier modifier3;
//        TextDecoration textDecoration3;
//        long lineHeight3;
//        TextAlign textAlign3;
//        int overflow3;
//        boolean softWrap3;
//        FontStyle fontStyle3;
//        FontWeight fontWeight3;
//        FontFamily fontFamily3;
//        TextStyle style3;
//        Function1 onTextLayout2;
//        long color3;
//        long letterSpacing3;
//        long fontSize3;
//        int i3;
//        Intrinsics.checkNotNullParameter(text, "text");
//        Composer $composer2 = $composer.startRestartGroup(224529679);
//        ComposerKt.sourceInformation($composer2, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12,8)206@10226L7,228@10943L167:Text.kt#uh7d8r");
//        int $dirty2 = $changed;
//        int $dirty12 = $changed1;
//        if ((i & 1) != 0) {
//            $dirty2 |= 6;
//        } else if (($changed & 14) == 0) {
//            $dirty2 |= $composer2.changed(text) ? 4 : 2;
//        }
//        int i4 = i & 2;
//        if (i4 != 0) {
//            $dirty2 |= 48;
//        } else if (($changed & 112) == 0) {
//            $dirty2 |= $composer2.changed(modifier) ? 32 : 16;
//        }
//        int i5 = i & 4;
//        if (i5 != 0) {
//            $dirty2 |= 384;
//        } else if (($changed & 896) == 0) {
//            $dirty2 |= $composer2.changed(color) ? 256 : 128;
//        }
//        int i6 = i & 8;
//        if (i6 != 0) {
//            $dirty2 |= 3072;
//        } else if (($changed & 7168) == 0) {
//            $dirty2 |= $composer2.changed(fontSize) ? 2048 : 1024;
//        }
//        int i7 = i & 16;
//        if (i7 != 0) {
//            $dirty2 |= 24576;
//        } else if (($changed & 57344) == 0) {
//            $dirty2 |= $composer2.changed(fontStyle) ? 16384 : 8192;
//        }
//        int i8 = i & 32;
//        if (i8 != 0) {
//            $dirty2 |= 196608;
//        } else if (($changed & 458752) == 0) {
//            $dirty2 |= $composer2.changed(fontWeight) ? 131072 : 65536;
//        }
//        int i9 = i & 64;
//        if (i9 != 0) {
//            $dirty2 |= 1572864;
//        } else if (($changed & 3670016) == 0) {
//            $dirty2 |= $composer2.changed(fontFamily) ? 1048576 : 524288;
//        }
//        int i10 = i & 128;
//        if (i10 != 0) {
//            $dirty2 |= 12582912;
//        } else if (($changed & 29360128) == 0) {
//            $dirty2 |= $composer2.changed(letterSpacing) ? 8388608 : 4194304;
//        }
//        int i11 = i & 256;
//        if (i11 != 0) {
//            $dirty2 |= 100663296;
//        } else if (($changed & 234881024) == 0) {
//            $dirty2 |= $composer2.changed(textDecoration) ? 67108864 : 33554432;
//        }
//        int i12 = i & 512;
//        if (i12 != 0) {
//            $dirty2 |= 805306368;
//        } else if (($changed & 1879048192) == 0) {
//            $dirty2 |= $composer2.changed(textAlign) ? 536870912 : 268435456;
//        }
//        int i13 = i & 1024;
//        if (i13 != 0) {
//            $dirty12 |= 6;
//        } else if (($changed1 & 14) == 0) {
//            $dirty12 |= $composer2.changed(lineHeight) ? 4 : 2;
//        }
//        int i14 = i & 2048;
//        if (i14 != 0) {
//            $dirty12 |= 48;
//        } else if (($changed1 & 112) == 0) {
//            $dirty12 |= $composer2.changed(overflow) ? 32 : 16;
//        }
//        int i15 = i & 4096;
//        if (i15 != 0) {
//            $dirty12 |= 384;
//        } else if (($changed1 & 896) == 0) {
//            $dirty12 |= $composer2.changed(softWrap) ? 256 : 128;
//        }
//        int i16 = i & 8192;
//        if (i16 != 0) {
//            $dirty12 |= 3072;
//        } else if (($changed1 & 7168) == 0) {
//            $dirty12 |= $composer2.changed(maxLines) ? 2048 : 1024;
//        }
//        int i17 = i & 16384;
//        if (i17 != 0) {
//            $dirty12 |= 8192;
//        }
//        int i18 = i & 32768;
//        if (i18 != 0) {
//            $dirty12 |= 196608;
//            i2 = i16;
//        } else if (($changed1 & 458752) == 0) {
//            i2 = i16;
//            $dirty12 |= $composer2.changed(function1) ? 131072 : 65536;
//        } else {
//            i2 = i16;
//        }
//        if (($changed1 & 3670016) == 0) {
//            if ((i & 65536) == 0 && $composer2.changed(style)) {
//                i3 = 1048576;
//                $dirty12 |= i3;
//            }
//            i3 = 524288;
//            $dirty12 |= i3;
//        }
//        if (i17 == 16384 && (1533916891 & $dirty2) == 306783378 && (2995931 & $dirty12) == 599186 && $composer2.getSkipping()) {
//            $composer2.skipToGroupEnd();
//            modifier3 = modifier;
//            color3 = color;
//            fontSize3 = fontSize;
//            fontStyle3 = fontStyle;
//            fontWeight3 = fontWeight;
//            fontFamily3 = fontFamily;
//            letterSpacing3 = letterSpacing;
//            textDecoration3 = textDecoration;
//            textAlign3 = textAlign;
//            lineHeight3 = lineHeight;
//            overflow3 = overflow;
//            softWrap3 = softWrap;
//            maxLines4 = maxLines;
//            inlineContent4 = map;
//            onTextLayout2 = function1;
//            style3 = style;
//            $dirty = $dirty2;
//        } else {
//            $composer2.startDefaults();
//            if (($changed & 1) == 0 || $composer2.getDefaultsInvalid()) {
//                Modifier.Companion modifier4 = i4 != 0 ? Modifier.Companion : modifier;
//                color2 = i5 != 0 ? Color.Companion.m2925getUnspecified0d7_KjU() : color;
//                fontSize2 = i6 != 0 ? TextUnit.Companion.m5722getUnspecifiedXSAIIZE() : fontSize;
//                fontStyle2 = i7 != 0 ? null : fontStyle;
//                fontWeight2 = i8 != 0 ? null : fontWeight;
//                fontFamily2 = i9 != 0 ? null : fontFamily;
//                letterSpacing2 = i10 != 0 ? TextUnit.Companion.m5722getUnspecifiedXSAIIZE() : letterSpacing;
//                TextDecoration textDecoration4 = i11 != 0 ? null : textDecoration;
//                textAlign2 = i12 != 0 ? null : textAlign;
//                long lineHeight4 = i13 != 0 ? TextUnit.Companion.m5722getUnspecifiedXSAIIZE() : lineHeight;
//                int overflow4 = i14 != 0 ? TextOverflow.Companion.m5425getClipgIe3tQ8() : overflow;
//                boolean softWrap4 = i15 != 0 ? true : softWrap;
//                int maxLines5 = i2 != 0 ? Integer.MAX_VALUE : maxLines;
//                if (i17 != 0) {
//                    inlineContent = MapsKt.emptyMap();
//                    $dirty12 &= -57345;
//                } else {
//                    inlineContent = map;
//                }
//                Function1 onTextLayout3 = i18 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$3
//                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
//                        invoke((TextLayoutResult) p1);
//                        return Unit.INSTANCE;
//                    }
//
//                    public final void invoke(TextLayoutResult it) {
//                        Intrinsics.checkNotNullParameter(it, "it");
//                    }
//                } : function1;
//                if ((i & 65536) != 0) {
//                    Modifier modifier5 = modifier4;
//                    ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                    Object consume = $composer2.consume(LocalTextStyle);
//                    ComposerKt.sourceInformationMarkerEnd($composer2);
//                    style2 = (TextStyle) consume;
//                    $dirty1 = $dirty12 & (-3670017);
//                    onTextLayout = onTextLayout3;
//                    lineHeight2 = lineHeight4;
//                    textDecoration2 = textDecoration4;
//                    modifier2 = modifier5;
//                    inlineContent2 = inlineContent;
//                    maxLines2 = maxLines5;
//                    softWrap2 = softWrap4;
//                    overflow2 = overflow4;
//                } else {
//                    TextDecoration textDecoration5 = textDecoration4;
//                    style2 = style;
//                    modifier2 = modifier4;
//                    $dirty1 = $dirty12;
//                    onTextLayout = onTextLayout3;
//                    lineHeight2 = lineHeight4;
//                    textDecoration2 = textDecoration5;
//                    inlineContent2 = inlineContent;
//                    maxLines2 = maxLines5;
//                    softWrap2 = softWrap4;
//                    overflow2 = overflow4;
//                }
//            } else {
//                $composer2.skipToGroupEnd();
//                if (i17 != 0) {
//                    $dirty12 &= -57345;
//                }
//                if ((i & 65536) != 0) {
//                    int i19 = (-3670017) & $dirty12;
//                    color2 = color;
//                    fontSize2 = fontSize;
//                    fontStyle2 = fontStyle;
//                    fontWeight2 = fontWeight;
//                    fontFamily2 = fontFamily;
//                    letterSpacing2 = letterSpacing;
//                    textDecoration2 = textDecoration;
//                    textAlign2 = textAlign;
//                    lineHeight2 = lineHeight;
//                    overflow2 = overflow;
//                    softWrap2 = softWrap;
//                    maxLines2 = maxLines;
//                    inlineContent2 = map;
//                    onTextLayout = function1;
//                    style2 = style;
//                    $dirty1 = i19;
//                    modifier2 = modifier;
//                } else {
//                    modifier2 = modifier;
//                    color2 = color;
//                    fontSize2 = fontSize;
//                    fontStyle2 = fontStyle;
//                    fontWeight2 = fontWeight;
//                    fontFamily2 = fontFamily;
//                    letterSpacing2 = letterSpacing;
//                    textAlign2 = textAlign;
//                    lineHeight2 = lineHeight;
//                    overflow2 = overflow;
//                    softWrap2 = softWrap;
//                    maxLines2 = maxLines;
//                    inlineContent2 = map;
//                    onTextLayout = function1;
//                    style2 = style;
//                    $dirty1 = $dirty12;
//                    textDecoration2 = textDecoration;
//                }
//            }
//            $composer2.endDefaults();
//            if (ComposerKt.isTraceInProgress()) {
//                inlineContent3 = inlineContent2;
//                ComposerKt.traceEventStart(224529679, $dirty2, $dirty1, "androidx.compose.material3.Text (Text.kt:189)");
//            } else {
//                inlineContent3 = inlineContent2;
//            }
//            $composer2.startReplaceableGroup(79587464);
//            ComposerKt.sourceInformation($composer2, "*210@10340L7");
//            long $this$takeOrElse_u2dDxMtmZc$iv = color2;
//            if ($this$takeOrElse_u2dDxMtmZc$iv != Color.Companion.m2925getUnspecified0d7_KjU()) {
//                maxLines3 = maxLines2;
//                textColor = $this$takeOrElse_u2dDxMtmZc$iv;
//            } else {
//                long $this$takeOrElse_u2dDxMtmZc$iv2 = style2.m5034getColor0d7_KjU();
//                if ($this$takeOrElse_u2dDxMtmZc$iv2 != Color.Companion.m2925getUnspecified0d7_KjU()) {
//                    maxLines3 = maxLines2;
//                } else {
//                    maxLines3 = maxLines2;
//                    ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
//                    Object consume2 = $composer2.consume(ContentColorKt.getLocalContentColor());
//                    ComposerKt.sourceInformationMarkerEnd($composer2);
//                    $this$takeOrElse_u2dDxMtmZc$iv2 = ((Color) consume2).m2899unboximpl();
//                }
//                textColor = $this$takeOrElse_u2dDxMtmZc$iv2;
//            }
//            $composer2.endReplaceableGroup();
//            TextStyle style4 = style2;
//            TextStyle mergedStyle = style4.merge(new TextStyle(textColor, fontSize2, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, letterSpacing2, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, lineHeight2, (TextIndent) null, 175952, (DefaultConstructorMarker) null));
//            $dirty = $dirty2;
//            BasicTextKt.m798BasicText4YKlhWE(text, modifier2, mergedStyle, onTextLayout, overflow2, softWrap2, maxLines3, inlineContent3, $composer2, (($dirty1 >> 6) & 7168) | ($dirty2 & 14) | 16777216 | ($dirty2 & 112) | (($dirty1 << 9) & 57344) | (($dirty1 << 9) & 458752) | (($dirty1 << 9) & 3670016), 0);
//            if (ComposerKt.isTraceInProgress()) {
//                ComposerKt.traceEventEnd();
//            }
//            inlineContent4 = inlineContent3;
//            maxLines4 = maxLines3;
//            modifier3 = modifier2;
//            textDecoration3 = textDecoration2;
//            lineHeight3 = lineHeight2;
//            textAlign3 = textAlign2;
//            overflow3 = overflow2;
//            softWrap3 = softWrap2;
//            fontStyle3 = fontStyle2;
//            fontWeight3 = fontWeight2;
//            fontFamily3 = fontFamily2;
//            style3 = style4;
//            onTextLayout2 = onTextLayout;
//            color3 = color2;
//            letterSpacing3 = letterSpacing2;
//            fontSize3 = fontSize2;
//        }
//        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
//        if (endRestartGroup == null) {
//            return;
//        }
//        final Modifier modifier6 = modifier3;
//        final long j = color3;
//        final long j2 = fontSize3;
//        final FontStyle fontStyle4 = fontStyle3;
//        final FontWeight fontWeight4 = fontWeight3;
//        final FontFamily fontFamily4 = fontFamily3;
//        final long j3 = letterSpacing3;
//        final TextDecoration textDecoration6 = textDecoration3;
//        final TextAlign textAlign4 = textAlign3;
//        final long j4 = lineHeight3;
//        final int i20 = overflow3;
//        final boolean z = softWrap3;
//        final int i21 = maxLines4;
//        final Map map2 = inlineContent4;
//        final Function1 function12 = onTextLayout2;
//        final TextStyle textStyle = style3;
//        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$4
//            /* JADX INFO: Access modifiers changed from: package-private */
//            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//            /* JADX WARN: Multi-variable type inference failed */
//            {
//                super(2);
//            }
//
//            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
//                invoke((Composer) obj, ((Number) obj2).intValue());
//                return Unit.INSTANCE;
//            }
//
//            public final void invoke(Composer composer, int i22) {
//                TextKt.m1871Text4IGK_g(AnnotatedString.this, modifier6, j, j2, fontStyle4, fontWeight4, fontFamily4, j3, textDecoration6, textAlign4, j4, i20, z, i21, map2, function12, textStyle, composer, $changed | 1, $changed1, i);
//            }
//        });
//    }
//
//    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
//        return LocalTextStyle;
//    }
//
//    public static final void ProvideTextStyle(final TextStyle value, final Function2<? super Composer, ? super Integer, Unit> function2, Composer $composer, final int $changed) {
//        Intrinsics.checkNotNullParameter(value, "value");
//        Intrinsics.checkNotNullParameter(function2, "content");
//        Composer $composer2 = $composer.startRestartGroup(-460300127);
//        ComposerKt.sourceInformation($composer2, "C(ProvideTextStyle)P(1)259@12067L7,260@12092L80:Text.kt#uh7d8r");
//        int $dirty = $changed;
//        if (($changed & 14) == 0) {
//            $dirty |= $composer2.changed(value) ? 4 : 2;
//        }
//        if (($changed & 112) == 0) {
//            $dirty |= $composer2.changed(function2) ? 32 : 16;
//        }
//        if (($dirty & 91) != 18 || !$composer2.getSkipping()) {
//            if (ComposerKt.isTraceInProgress()) {
//                ComposerKt.traceEventStart(-460300127, $dirty, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:258)");
//            }
//            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
//            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
//            Object consume = $composer2.consume(providableCompositionLocal);
//            ComposerKt.sourceInformationMarkerEnd($composer2);
//            TextStyle mergedStyle = ((TextStyle) consume).merge(value);
//            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{providableCompositionLocal.provides(mergedStyle)}, function2, $composer2, ($dirty & 112) | 8);
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
//        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$ProvideTextStyle$1
//            /* JADX INFO: Access modifiers changed from: package-private */
//            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//            /* JADX WARN: Multi-variable type inference failed */
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
//                TextKt.ProvideTextStyle(TextStyle.this, function2, composer, $changed | 1);
//            }
//        });
//    }
//}
