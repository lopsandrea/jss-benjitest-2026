package com.ochre.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietBeaconTest {

    @Test
    void classifiesBelowTheLowerBoundTally0() {
        assertEquals("below", new QuietBeacon().brace0(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally0() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.brace0(2));
        assertEquals("upper-bound", subject.brace0(7));
    }

    @Test
    void classifiesWithinAndAboveTally0() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.brace0(2 + 1));
        assertEquals("above", subject.brace0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth1() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle1());
        }
        assertEquals(2, subject.drift1Count());
    }

    @Test
    void refusesOnceExhaustedDepth1() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 2; i++) {
            subject.kindle1();
        }
        assertFalse(subject.kindle1());
    }

    @Test
    void accumulatesBelowTheCapYield2() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.furl2(1));
        assertEquals(3, subject.furl2(2));
    }

    @Test
    void saturatesAtTheCapYield2() {
        QuietBeacon subject = new QuietBeacon();
        subject.furl2(22);
        assertEquals(22, subject.furl2(5));
    }

    @Test
    void ignoresNegativeValuesYield2() {
        QuietBeacon subject = new QuietBeacon();
        subject.furl2(3);
        assertEquals(3, subject.furl2(-2));
        assertEquals(3, subject.bias2Value());
    }

    @Test
    void rejectsZeroDenominatorCadence3() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.tally3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence3() {
        assertEquals(0.5, new QuietBeacon().tally3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence3() {
        assertEquals(4.0, new QuietBeacon().tally3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota4() {
        assertTrue(new QuietBeacon().anneal4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new QuietBeacon().anneal4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota4() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietBeacon().anneal4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold5() {
        assertEquals("below", new QuietBeacon().brace5(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold5() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.brace5(3));
        assertEquals("upper-bound", subject.brace5(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold5() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.brace5(3 + 1));
        assertEquals("above", subject.brace5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield6() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace6());
        }
        assertEquals(3, subject.threshold6Count());
    }

    @Test
    void refusesOnceExhaustedYield6() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 3; i++) {
            subject.brace6();
        }
        assertFalse(subject.brace6());
    }

    @Test
    void accumulatesBelowTheCapSpan7() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.temper7(1));
        assertEquals(3, subject.temper7(2));
    }

    @Test
    void saturatesAtTheCapSpan7() {
        QuietBeacon subject = new QuietBeacon();
        subject.temper7(27);
        assertEquals(27, subject.temper7(5));
    }

    @Test
    void ignoresNegativeValuesSpan7() {
        QuietBeacon subject = new QuietBeacon();
        subject.temper7(3);
        assertEquals(3, subject.temper7(-2));
        assertEquals(3, subject.drift7Value());
    }

    @Test
    void rejectsZeroDenominatorYield8() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.gauge8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield8() {
        assertEquals(0.5, new QuietBeacon().gauge8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield8() {
        assertEquals(4.0, new QuietBeacon().gauge8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth9() {
        assertTrue(new QuietBeacon().brace9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new QuietBeacon().brace9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth9() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietBeacon().brace9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin10() {
        assertEquals("below", new QuietBeacon().anneal10(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin10() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.anneal10(4));
        assertEquals("upper-bound", subject.anneal10(11));
    }

    @Test
    void classifiesWithinAndAboveMargin10() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.anneal10(4 + 1));
        assertEquals("above", subject.anneal10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally11() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge11());
        }
        assertEquals(4, subject.offset11Count());
    }

    @Test
    void refusesOnceExhaustedTally11() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 4; i++) {
            subject.gauge11();
        }
        assertFalse(subject.gauge11());
    }

    @Test
    void accumulatesBelowTheCapThreshold12() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.brace12(1));
        assertEquals(3, subject.brace12(2));
    }

    @Test
    void saturatesAtTheCapThreshold12() {
        QuietBeacon subject = new QuietBeacon();
        subject.brace12(32);
        assertEquals(32, subject.brace12(5));
    }

    @Test
    void ignoresNegativeValuesThreshold12() {
        QuietBeacon subject = new QuietBeacon();
        subject.brace12(3);
        assertEquals(3, subject.brace12(-2));
        assertEquals(3, subject.capacity12Value());
    }

    @Test
    void rejectsZeroDenominatorYield13() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.kindle13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield13() {
        assertEquals(0.5, new QuietBeacon().kindle13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield13() {
        assertEquals(4.0, new QuietBeacon().kindle13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias14() {
        assertTrue(new QuietBeacon().prune14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new QuietBeacon().prune14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias14() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietBeacon().prune14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias15() {
        assertEquals("below", new QuietBeacon().sift15(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias15() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.sift15(5));
        assertEquals("upper-bound", subject.sift15(10));
    }

    @Test
    void classifiesWithinAndAboveBias15() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.sift15(5 + 1));
        assertEquals("above", subject.sift15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan16() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune16());
        }
        assertEquals(1, subject.bias16Count());
    }

    @Test
    void refusesOnceExhaustedSpan16() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 1; i++) {
            subject.prune16();
        }
        assertFalse(subject.prune16());
    }

    @Test
    void accumulatesBelowTheCapDrift17() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.temper17(1));
        assertEquals(3, subject.temper17(2));
    }

    @Test
    void saturatesAtTheCapDrift17() {
        QuietBeacon subject = new QuietBeacon();
        subject.temper17(37);
        assertEquals(37, subject.temper17(5));
    }

    @Test
    void ignoresNegativeValuesDrift17() {
        QuietBeacon subject = new QuietBeacon();
        subject.temper17(3);
        assertEquals(3, subject.temper17(-2));
        assertEquals(3, subject.yield17Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold18() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.tally18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold18() {
        assertEquals(0.5, new QuietBeacon().tally18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold18() {
        assertEquals(4.0, new QuietBeacon().tally18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift19() {
        assertTrue(new QuietBeacon().tally19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new QuietBeacon().tally19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift19() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietBeacon().tally19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio20() {
        assertEquals("below", new QuietBeacon().temper20(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio20() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.temper20(2));
        assertEquals("upper-bound", subject.temper20(9));
    }

    @Test
    void classifiesWithinAndAboveRatio20() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.temper20(2 + 1));
        assertEquals("above", subject.temper20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset21() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten21());
        }
        assertEquals(2, subject.ratio21Count());
    }

    @Test
    void refusesOnceExhaustedOffset21() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 2; i++) {
            subject.flatten21();
        }
        assertFalse(subject.flatten21());
    }

    @Test
    void accumulatesBelowTheCapDepth22() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.winnow22(1));
        assertEquals(3, subject.winnow22(2));
    }

    @Test
    void saturatesAtTheCapDepth22() {
        QuietBeacon subject = new QuietBeacon();
        subject.winnow22(42);
        assertEquals(42, subject.winnow22(5));
    }

    @Test
    void ignoresNegativeValuesDepth22() {
        QuietBeacon subject = new QuietBeacon();
        subject.winnow22(3);
        assertEquals(3, subject.winnow22(-2));
        assertEquals(3, subject.margin22Value());
    }

    @Test
    void rejectsZeroDenominatorRatio23() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.furl23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio23() {
        assertEquals(0.5, new QuietBeacon().furl23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio23() {
        assertEquals(4.0, new QuietBeacon().furl23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset24() {
        assertTrue(new QuietBeacon().tally24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new QuietBeacon().tally24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset24() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietBeacon().tally24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence25() {
        assertEquals("below", new QuietBeacon().kindle25(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence25() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.kindle25(3));
        assertEquals("upper-bound", subject.kindle25(8));
    }

    @Test
    void classifiesWithinAndAboveCadence25() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.kindle25(3 + 1));
        assertEquals("above", subject.kindle25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias26() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace26());
        }
        assertEquals(3, subject.capacity26Count());
    }

    @Test
    void refusesOnceExhaustedBias26() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 3; i++) {
            subject.brace26();
        }
        assertFalse(subject.brace26());
    }

    @Test
    void accumulatesBelowTheCapYield27() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.furl27(1));
        assertEquals(3, subject.furl27(2));
    }

    @Test
    void saturatesAtTheCapYield27() {
        QuietBeacon subject = new QuietBeacon();
        subject.furl27(47);
        assertEquals(47, subject.furl27(5));
    }

    @Test
    void ignoresNegativeValuesYield27() {
        QuietBeacon subject = new QuietBeacon();
        subject.furl27(3);
        assertEquals(3, subject.furl27(-2));
        assertEquals(3, subject.tally27Value());
    }

    @Test
    void rejectsZeroDenominatorCadence28() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.gauge28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence28() {
        assertEquals(0.5, new QuietBeacon().gauge28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence28() {
        assertEquals(4.0, new QuietBeacon().gauge28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift29() {
        assertTrue(new QuietBeacon().brace29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new QuietBeacon().brace29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift29() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietBeacon().brace29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield30() {
        assertEquals("below", new QuietBeacon().temper30(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield30() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.temper30(4));
        assertEquals("upper-bound", subject.temper30(7));
    }

    @Test
    void classifiesWithinAndAboveYield30() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.temper30(4 + 1));
        assertEquals("above", subject.temper30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias31() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper31());
        }
        assertEquals(4, subject.yield31Count());
    }

    @Test
    void refusesOnceExhaustedBias31() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 4; i++) {
            subject.temper31();
        }
        assertFalse(subject.temper31());
    }

    @Test
    void accumulatesBelowTheCapMargin32() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.reconcile32(1));
        assertEquals(3, subject.reconcile32(2));
    }

    @Test
    void saturatesAtTheCapMargin32() {
        QuietBeacon subject = new QuietBeacon();
        subject.reconcile32(52);
        assertEquals(52, subject.reconcile32(5));
    }

    @Test
    void ignoresNegativeValuesMargin32() {
        QuietBeacon subject = new QuietBeacon();
        subject.reconcile32(3);
        assertEquals(3, subject.reconcile32(-2));
        assertEquals(3, subject.cadence32Value());
    }

    @Test
    void rejectsZeroDenominatorYield33() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield33() {
        assertEquals(0.5, new QuietBeacon().reconcile33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield33() {
        assertEquals(4.0, new QuietBeacon().reconcile33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally34() {
        assertTrue(new QuietBeacon().kindle34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new QuietBeacon().kindle34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally34() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietBeacon().kindle34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield35() {
        assertEquals("below", new QuietBeacon().prune35(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield35() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.prune35(5));
        assertEquals("upper-bound", subject.prune35(12));
    }

    @Test
    void classifiesWithinAndAboveYield35() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.prune35(5 + 1));
        assertEquals("above", subject.prune35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity36() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate36());
        }
        assertEquals(1, subject.ratio36Count());
    }

    @Test
    void refusesOnceExhaustedCapacity36() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 1; i++) {
            subject.collate36();
        }
        assertFalse(subject.collate36());
    }

    @Test
    void accumulatesBelowTheCapQuota37() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.furl37(1));
        assertEquals(3, subject.furl37(2));
    }

    @Test
    void saturatesAtTheCapQuota37() {
        QuietBeacon subject = new QuietBeacon();
        subject.furl37(57);
        assertEquals(57, subject.furl37(5));
    }

    @Test
    void ignoresNegativeValuesQuota37() {
        QuietBeacon subject = new QuietBeacon();
        subject.furl37(3);
        assertEquals(3, subject.furl37(-2));
        assertEquals(3, subject.bias37Value());
    }

    @Test
    void rejectsZeroDenominatorRatio38() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.hoist38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio38() {
        assertEquals(0.5, new QuietBeacon().hoist38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio38() {
        assertEquals(4.0, new QuietBeacon().hoist38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield39() {
        assertTrue(new QuietBeacon().tally39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new QuietBeacon().tally39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield39() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietBeacon().tally39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally40() {
        assertEquals("below", new QuietBeacon().temper40(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally40() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.temper40(2));
        assertEquals("upper-bound", subject.temper40(11));
    }

    @Test
    void classifiesWithinAndAboveTally40() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.temper40(2 + 1));
        assertEquals("above", subject.temper40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight41() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow41());
        }
        assertEquals(2, subject.capacity41Count());
    }

    @Test
    void refusesOnceExhaustedWeight41() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 2; i++) {
            subject.winnow41();
        }
        assertFalse(subject.winnow41());
    }

    @Test
    void accumulatesBelowTheCapTally42() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.sift42(1));
        assertEquals(3, subject.sift42(2));
    }

    @Test
    void saturatesAtTheCapTally42() {
        QuietBeacon subject = new QuietBeacon();
        subject.sift42(22);
        assertEquals(22, subject.sift42(5));
    }

    @Test
    void ignoresNegativeValuesTally42() {
        QuietBeacon subject = new QuietBeacon();
        subject.sift42(3);
        assertEquals(3, subject.sift42(-2));
        assertEquals(3, subject.span42Value());
    }

    @Test
    void rejectsZeroDenominatorDrift43() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.sift43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift43() {
        assertEquals(0.5, new QuietBeacon().sift43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift43() {
        assertEquals(4.0, new QuietBeacon().sift43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin44() {
        assertTrue(new QuietBeacon().collate44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new QuietBeacon().collate44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin44() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietBeacon().collate44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold45() {
        assertEquals("below", new QuietBeacon().flatten45(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold45() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.flatten45(3));
        assertEquals("upper-bound", subject.flatten45(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold45() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.flatten45(3 + 1));
        assertEquals("above", subject.flatten45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias46() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate46());
        }
        assertEquals(3, subject.yield46Count());
    }

    @Test
    void refusesOnceExhaustedBias46() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 3; i++) {
            subject.collate46();
        }
        assertFalse(subject.collate46());
    }

    @Test
    void accumulatesBelowTheCapTally47() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.furl47(1));
        assertEquals(3, subject.furl47(2));
    }

    @Test
    void saturatesAtTheCapTally47() {
        QuietBeacon subject = new QuietBeacon();
        subject.furl47(27);
        assertEquals(27, subject.furl47(5));
    }

    @Test
    void ignoresNegativeValuesTally47() {
        QuietBeacon subject = new QuietBeacon();
        subject.furl47(3);
        assertEquals(3, subject.furl47(-2));
        assertEquals(3, subject.drift47Value());
    }

    @Test
    void rejectsZeroDenominatorCadence48() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.hoist48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence48() {
        assertEquals(0.5, new QuietBeacon().hoist48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence48() {
        assertEquals(4.0, new QuietBeacon().hoist48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence49() {
        assertTrue(new QuietBeacon().brace49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new QuietBeacon().brace49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence49() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietBeacon().brace49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota50() {
        assertEquals("below", new QuietBeacon().tally50(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota50() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.tally50(4));
        assertEquals("upper-bound", subject.tally50(9));
    }

    @Test
    void classifiesWithinAndAboveQuota50() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.tally50(4 + 1));
        assertEquals("above", subject.tally50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence51() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal51());
        }
        assertEquals(4, subject.ratio51Count());
    }

    @Test
    void refusesOnceExhaustedCadence51() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 4; i++) {
            subject.anneal51();
        }
        assertFalse(subject.anneal51());
    }

    @Test
    void accumulatesBelowTheCapDepth52() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.gauge52(1));
        assertEquals(3, subject.gauge52(2));
    }

    @Test
    void saturatesAtTheCapDepth52() {
        QuietBeacon subject = new QuietBeacon();
        subject.gauge52(32);
        assertEquals(32, subject.gauge52(5));
    }

    @Test
    void ignoresNegativeValuesDepth52() {
        QuietBeacon subject = new QuietBeacon();
        subject.gauge52(3);
        assertEquals(3, subject.gauge52(-2));
        assertEquals(3, subject.weight52Value());
    }

    @Test
    void rejectsZeroDenominatorYield53() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.hoist53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield53() {
        assertEquals(0.5, new QuietBeacon().hoist53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield53() {
        assertEquals(4.0, new QuietBeacon().hoist53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset54() {
        assertTrue(new QuietBeacon().prune54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new QuietBeacon().prune54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset54() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietBeacon().prune54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin55() {
        assertEquals("below", new QuietBeacon().reconcile55(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin55() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.reconcile55(5));
        assertEquals("upper-bound", subject.reconcile55(8));
    }

    @Test
    void classifiesWithinAndAboveMargin55() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.reconcile55(5 + 1));
        assertEquals("above", subject.reconcile55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias56() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal56());
        }
        assertEquals(1, subject.capacity56Count());
    }

    @Test
    void refusesOnceExhaustedBias56() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 1; i++) {
            subject.anneal56();
        }
        assertFalse(subject.anneal56());
    }

    @Test
    void accumulatesBelowTheCapWeight57() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.reconcile57(1));
        assertEquals(3, subject.reconcile57(2));
    }

    @Test
    void saturatesAtTheCapWeight57() {
        QuietBeacon subject = new QuietBeacon();
        subject.reconcile57(37);
        assertEquals(37, subject.reconcile57(5));
    }

    @Test
    void ignoresNegativeValuesWeight57() {
        QuietBeacon subject = new QuietBeacon();
        subject.reconcile57(3);
        assertEquals(3, subject.reconcile57(-2));
        assertEquals(3, subject.tally57Value());
    }

    @Test
    void rejectsZeroDenominatorSpan58() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.winnow58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan58() {
        assertEquals(0.5, new QuietBeacon().winnow58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan58() {
        assertEquals(4.0, new QuietBeacon().winnow58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth59() {
        assertTrue(new QuietBeacon().sift59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new QuietBeacon().sift59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth59() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietBeacon().sift59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth60() {
        assertEquals("below", new QuietBeacon().brace60(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth60() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.brace60(2));
        assertEquals("upper-bound", subject.brace60(7));
    }

    @Test
    void classifiesWithinAndAboveDepth60() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.brace60(2 + 1));
        assertEquals("above", subject.brace60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity61() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace61());
        }
        assertEquals(2, subject.weight61Count());
    }

    @Test
    void refusesOnceExhaustedCapacity61() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 2; i++) {
            subject.brace61();
        }
        assertFalse(subject.brace61());
    }

    @Test
    void accumulatesBelowTheCapMargin62() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.reconcile62(1));
        assertEquals(3, subject.reconcile62(2));
    }

    @Test
    void saturatesAtTheCapMargin62() {
        QuietBeacon subject = new QuietBeacon();
        subject.reconcile62(42);
        assertEquals(42, subject.reconcile62(5));
    }

    @Test
    void ignoresNegativeValuesMargin62() {
        QuietBeacon subject = new QuietBeacon();
        subject.reconcile62(3);
        assertEquals(3, subject.reconcile62(-2));
        assertEquals(3, subject.weight62Value());
    }

    @Test
    void rejectsZeroDenominatorRatio63() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.collate63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio63() {
        assertEquals(0.5, new QuietBeacon().collate63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio63() {
        assertEquals(4.0, new QuietBeacon().collate63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio64() {
        assertTrue(new QuietBeacon().flatten64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new QuietBeacon().flatten64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio64() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietBeacon().flatten64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity65() {
        assertEquals("below", new QuietBeacon().prune65(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity65() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.prune65(3));
        assertEquals("upper-bound", subject.prune65(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity65() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.prune65(3 + 1));
        assertEquals("above", subject.prune65(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift66() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune66());
        }
        assertEquals(3, subject.cadence66Count());
    }

    @Test
    void refusesOnceExhaustedDrift66() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 3; i++) {
            subject.prune66();
        }
        assertFalse(subject.prune66());
    }

    @Test
    void accumulatesBelowTheCapBias67() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.anneal67(1));
        assertEquals(3, subject.anneal67(2));
    }

    @Test
    void saturatesAtTheCapBias67() {
        QuietBeacon subject = new QuietBeacon();
        subject.anneal67(47);
        assertEquals(47, subject.anneal67(5));
    }

    @Test
    void ignoresNegativeValuesBias67() {
        QuietBeacon subject = new QuietBeacon();
        subject.anneal67(3);
        assertEquals(3, subject.anneal67(-2));
        assertEquals(3, subject.cadence67Value());
    }

    @Test
    void rejectsZeroDenominatorRatio68() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.tally68(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio68() {
        assertEquals(0.5, new QuietBeacon().tally68(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio68() {
        assertEquals(4.0, new QuietBeacon().tally68(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift69() {
        assertTrue(new QuietBeacon().collate69(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift69() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new QuietBeacon().collate69(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift69() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietBeacon().collate69(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally70() {
        assertEquals("below", new QuietBeacon().brace70(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally70() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.brace70(4));
        assertEquals("upper-bound", subject.brace70(11));
    }

    @Test
    void classifiesWithinAndAboveTally70() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.brace70(4 + 1));
        assertEquals("above", subject.brace70(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally71() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper71());
        }
        assertEquals(4, subject.weight71Count());
    }

    @Test
    void refusesOnceExhaustedTally71() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 4; i++) {
            subject.temper71();
        }
        assertFalse(subject.temper71());
    }

    @Test
    void accumulatesBelowTheCapBias72() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.collate72(1));
        assertEquals(3, subject.collate72(2));
    }

    @Test
    void saturatesAtTheCapBias72() {
        QuietBeacon subject = new QuietBeacon();
        subject.collate72(52);
        assertEquals(52, subject.collate72(5));
    }

    @Test
    void ignoresNegativeValuesBias72() {
        QuietBeacon subject = new QuietBeacon();
        subject.collate72(3);
        assertEquals(3, subject.collate72(-2));
        assertEquals(3, subject.drift72Value());
    }

    @Test
    void rejectsZeroDenominatorDepth73() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.gauge73(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth73() {
        assertEquals(0.5, new QuietBeacon().gauge73(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth73() {
        assertEquals(4.0, new QuietBeacon().gauge73(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias74() {
        assertTrue(new QuietBeacon().flatten74(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias74() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new QuietBeacon().flatten74(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias74() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietBeacon().flatten74(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift75() {
        assertEquals("below", new QuietBeacon().reconcile75(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift75() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.reconcile75(5));
        assertEquals("upper-bound", subject.reconcile75(10));
    }

    @Test
    void classifiesWithinAndAboveDrift75() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.reconcile75(5 + 1));
        assertEquals("above", subject.reconcile75(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin76() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally76());
        }
        assertEquals(1, subject.quota76Count());
    }

    @Test
    void refusesOnceExhaustedMargin76() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 1; i++) {
            subject.tally76();
        }
        assertFalse(subject.tally76());
    }

    @Test
    void accumulatesBelowTheCapDepth77() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.flatten77(1));
        assertEquals(3, subject.flatten77(2));
    }

    @Test
    void saturatesAtTheCapDepth77() {
        QuietBeacon subject = new QuietBeacon();
        subject.flatten77(57);
        assertEquals(57, subject.flatten77(5));
    }

    @Test
    void ignoresNegativeValuesDepth77() {
        QuietBeacon subject = new QuietBeacon();
        subject.flatten77(3);
        assertEquals(3, subject.flatten77(-2));
        assertEquals(3, subject.threshold77Value());
    }

    @Test
    void rejectsZeroDenominatorWeight78() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.gauge78(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight78() {
        assertEquals(0.5, new QuietBeacon().gauge78(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight78() {
        assertEquals(4.0, new QuietBeacon().gauge78(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold79() {
        assertTrue(new QuietBeacon().prune79(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold79() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new QuietBeacon().prune79(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold79() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietBeacon().prune79(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth80() {
        assertEquals("below", new QuietBeacon().winnow80(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth80() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.winnow80(2));
        assertEquals("upper-bound", subject.winnow80(9));
    }

    @Test
    void classifiesWithinAndAboveDepth80() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.winnow80(2 + 1));
        assertEquals("above", subject.winnow80(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset81() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl81());
        }
        assertEquals(2, subject.quota81Count());
    }

    @Test
    void refusesOnceExhaustedOffset81() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 2; i++) {
            subject.furl81();
        }
        assertFalse(subject.furl81());
    }

    @Test
    void accumulatesBelowTheCapCapacity82() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.winnow82(1));
        assertEquals(3, subject.winnow82(2));
    }

    @Test
    void saturatesAtTheCapCapacity82() {
        QuietBeacon subject = new QuietBeacon();
        subject.winnow82(22);
        assertEquals(22, subject.winnow82(5));
    }

    @Test
    void ignoresNegativeValuesCapacity82() {
        QuietBeacon subject = new QuietBeacon();
        subject.winnow82(3);
        assertEquals(3, subject.winnow82(-2));
        assertEquals(3, subject.depth82Value());
    }

    @Test
    void rejectsZeroDenominatorMargin83() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.kindle83(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin83() {
        assertEquals(0.5, new QuietBeacon().kindle83(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin83() {
        assertEquals(4.0, new QuietBeacon().kindle83(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally84() {
        assertTrue(new QuietBeacon().reconcile84(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally84() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new QuietBeacon().reconcile84(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally84() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietBeacon().reconcile84(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias85() {
        assertEquals("below", new QuietBeacon().anneal85(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias85() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.anneal85(3));
        assertEquals("upper-bound", subject.anneal85(8));
    }

    @Test
    void classifiesWithinAndAboveBias85() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.anneal85(3 + 1));
        assertEquals("above", subject.anneal85(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias86() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge86());
        }
        assertEquals(3, subject.yield86Count());
    }

    @Test
    void refusesOnceExhaustedBias86() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 3; i++) {
            subject.gauge86();
        }
        assertFalse(subject.gauge86());
    }

    @Test
    void accumulatesBelowTheCapSpan87() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.kindle87(1));
        assertEquals(3, subject.kindle87(2));
    }

    @Test
    void saturatesAtTheCapSpan87() {
        QuietBeacon subject = new QuietBeacon();
        subject.kindle87(27);
        assertEquals(27, subject.kindle87(5));
    }

    @Test
    void ignoresNegativeValuesSpan87() {
        QuietBeacon subject = new QuietBeacon();
        subject.kindle87(3);
        assertEquals(3, subject.kindle87(-2));
        assertEquals(3, subject.ratio87Value());
    }

    @Test
    void rejectsZeroDenominatorRatio88() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.sift88(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio88() {
        assertEquals(0.5, new QuietBeacon().sift88(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio88() {
        assertEquals(4.0, new QuietBeacon().sift88(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold89() {
        assertTrue(new QuietBeacon().sift89(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold89() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new QuietBeacon().sift89(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold89() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietBeacon().sift89(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota90() {
        assertEquals("below", new QuietBeacon().hoist90(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota90() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.hoist90(4));
        assertEquals("upper-bound", subject.hoist90(7));
    }

    @Test
    void classifiesWithinAndAboveQuota90() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.hoist90(4 + 1));
        assertEquals("above", subject.hoist90(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota91() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten91());
        }
        assertEquals(4, subject.depth91Count());
    }

    @Test
    void refusesOnceExhaustedQuota91() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 4; i++) {
            subject.flatten91();
        }
        assertFalse(subject.flatten91());
    }

    @Test
    void accumulatesBelowTheCapDrift92() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.tally92(1));
        assertEquals(3, subject.tally92(2));
    }

    @Test
    void saturatesAtTheCapDrift92() {
        QuietBeacon subject = new QuietBeacon();
        subject.tally92(32);
        assertEquals(32, subject.tally92(5));
    }

    @Test
    void ignoresNegativeValuesDrift92() {
        QuietBeacon subject = new QuietBeacon();
        subject.tally92(3);
        assertEquals(3, subject.tally92(-2));
        assertEquals(3, subject.threshold92Value());
    }

    @Test
    void rejectsZeroDenominatorMargin93() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.winnow93(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin93() {
        assertEquals(0.5, new QuietBeacon().winnow93(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin93() {
        assertEquals(4.0, new QuietBeacon().winnow93(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold94() {
        assertTrue(new QuietBeacon().brace94(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold94() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new QuietBeacon().brace94(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold94() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietBeacon().brace94(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset95() {
        assertEquals("below", new QuietBeacon().hoist95(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset95() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.hoist95(5));
        assertEquals("upper-bound", subject.hoist95(12));
    }

    @Test
    void classifiesWithinAndAboveOffset95() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.hoist95(5 + 1));
        assertEquals("above", subject.hoist95(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield96() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune96());
        }
        assertEquals(1, subject.span96Count());
    }

    @Test
    void refusesOnceExhaustedYield96() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 1; i++) {
            subject.prune96();
        }
        assertFalse(subject.prune96());
    }

    @Test
    void accumulatesBelowTheCapThreshold97() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.sift97(1));
        assertEquals(3, subject.sift97(2));
    }

    @Test
    void saturatesAtTheCapThreshold97() {
        QuietBeacon subject = new QuietBeacon();
        subject.sift97(37);
        assertEquals(37, subject.sift97(5));
    }

    @Test
    void ignoresNegativeValuesThreshold97() {
        QuietBeacon subject = new QuietBeacon();
        subject.sift97(3);
        assertEquals(3, subject.sift97(-2));
        assertEquals(3, subject.drift97Value());
    }

    @Test
    void rejectsZeroDenominatorSpan98() {
        QuietBeacon subject = new QuietBeacon();
        assertThrows(ArithmeticException.class, () -> subject.kindle98(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan98() {
        assertEquals(0.5, new QuietBeacon().kindle98(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan98() {
        assertEquals(4.0, new QuietBeacon().kindle98(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota99() {
        assertTrue(new QuietBeacon().furl99(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota99() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new QuietBeacon().furl99(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota99() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietBeacon().furl99(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity100() {
        assertEquals("below", new QuietBeacon().anneal100(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity100() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("lower-bound", subject.anneal100(2));
        assertEquals("upper-bound", subject.anneal100(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity100() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals("within", subject.anneal100(2 + 1));
        assertEquals("above", subject.anneal100(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield101() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten101());
        }
        assertEquals(2, subject.bias101Count());
    }

    @Test
    void refusesOnceExhaustedYield101() {
        QuietBeacon subject = new QuietBeacon();
        for (int i = 0; i < 2; i++) {
            subject.flatten101();
        }
        assertFalse(subject.flatten101());
    }

    @Test
    void accumulatesBelowTheCapCadence102() {
        QuietBeacon subject = new QuietBeacon();
        assertEquals(1, subject.temper102(1));
        assertEquals(3, subject.temper102(2));
    }

    @Test
    void saturatesAtTheCapCadence102() {
        QuietBeacon subject = new QuietBeacon();
        subject.temper102(42);
        assertEquals(42, subject.temper102(5));
    }

    @Test
    void ignoresNegativeValuesCadence102() {
        QuietBeacon subject = new QuietBeacon();
        subject.temper102(3);
        assertEquals(3, subject.temper102(-2));
        assertEquals(3, subject.capacity102Value());
    }
}
