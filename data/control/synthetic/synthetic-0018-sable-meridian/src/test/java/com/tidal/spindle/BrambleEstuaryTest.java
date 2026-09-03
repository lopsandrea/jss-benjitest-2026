package com.tidal.spindle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleEstuaryTest {

    @Test
    void classifiesBelowTheLowerBoundSpan0() {
        assertEquals("below", new BrambleEstuary().kindle0(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan0() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("lower-bound", subject.kindle0(2));
        assertEquals("upper-bound", subject.kindle0(7));
    }

    @Test
    void classifiesWithinAndAboveSpan0() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("within", subject.kindle0(2 + 1));
        assertEquals("above", subject.kindle0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio1() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal1());
        }
        assertEquals(2, subject.offset1Count());
    }

    @Test
    void refusesOnceExhaustedRatio1() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 2; i++) {
            subject.anneal1();
        }
        assertFalse(subject.anneal1());
    }

    @Test
    void accumulatesBelowTheCapCapacity2() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals(1, subject.temper2(1));
        assertEquals(3, subject.temper2(2));
    }

    @Test
    void saturatesAtTheCapCapacity2() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.temper2(22);
        assertEquals(22, subject.temper2(5));
    }

    @Test
    void ignoresNegativeValuesCapacity2() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.temper2(3);
        assertEquals(3, subject.temper2(-2));
        assertEquals(3, subject.tally2Value());
    }

    @Test
    void rejectsZeroDenominatorYield3() {
        BrambleEstuary subject = new BrambleEstuary();
        assertThrows(ArithmeticException.class, () -> subject.brace3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield3() {
        assertEquals(0.5, new BrambleEstuary().brace3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield3() {
        assertEquals(4.0, new BrambleEstuary().brace3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth4() {
        assertTrue(new BrambleEstuary().winnow4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new BrambleEstuary().winnow4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth4() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleEstuary().winnow4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift5() {
        assertEquals("below", new BrambleEstuary().sift5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift5() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("lower-bound", subject.sift5(3));
        assertEquals("upper-bound", subject.sift5(12));
    }

    @Test
    void classifiesWithinAndAboveDrift5() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("within", subject.sift5(3 + 1));
        assertEquals("above", subject.sift5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias6() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten6());
        }
        assertEquals(3, subject.quota6Count());
    }

    @Test
    void refusesOnceExhaustedBias6() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 3; i++) {
            subject.flatten6();
        }
        assertFalse(subject.flatten6());
    }

    @Test
    void accumulatesBelowTheCapBias7() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals(1, subject.flatten7(1));
        assertEquals(3, subject.flatten7(2));
    }

    @Test
    void saturatesAtTheCapBias7() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.flatten7(27);
        assertEquals(27, subject.flatten7(5));
    }

    @Test
    void ignoresNegativeValuesBias7() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.flatten7(3);
        assertEquals(3, subject.flatten7(-2));
        assertEquals(3, subject.drift7Value());
    }

    @Test
    void rejectsZeroDenominatorCadence8() {
        BrambleEstuary subject = new BrambleEstuary();
        assertThrows(ArithmeticException.class, () -> subject.hoist8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence8() {
        assertEquals(0.5, new BrambleEstuary().hoist8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence8() {
        assertEquals(4.0, new BrambleEstuary().hoist8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence9() {
        assertTrue(new BrambleEstuary().reconcile9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new BrambleEstuary().reconcile9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence9() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleEstuary().reconcile9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan10() {
        assertEquals("below", new BrambleEstuary().gauge10(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan10() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("lower-bound", subject.gauge10(4));
        assertEquals("upper-bound", subject.gauge10(11));
    }

    @Test
    void classifiesWithinAndAboveSpan10() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("within", subject.gauge10(4 + 1));
        assertEquals("above", subject.gauge10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth11() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune11());
        }
        assertEquals(4, subject.threshold11Count());
    }

    @Test
    void refusesOnceExhaustedDepth11() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 4; i++) {
            subject.prune11();
        }
        assertFalse(subject.prune11());
    }

    @Test
    void accumulatesBelowTheCapCadence12() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals(1, subject.tally12(1));
        assertEquals(3, subject.tally12(2));
    }

    @Test
    void saturatesAtTheCapCadence12() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.tally12(32);
        assertEquals(32, subject.tally12(5));
    }

    @Test
    void ignoresNegativeValuesCadence12() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.tally12(3);
        assertEquals(3, subject.tally12(-2));
        assertEquals(3, subject.depth12Value());
    }

    @Test
    void rejectsZeroDenominatorBias13() {
        BrambleEstuary subject = new BrambleEstuary();
        assertThrows(ArithmeticException.class, () -> subject.anneal13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias13() {
        assertEquals(0.5, new BrambleEstuary().anneal13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias13() {
        assertEquals(4.0, new BrambleEstuary().anneal13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan14() {
        assertTrue(new BrambleEstuary().reconcile14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new BrambleEstuary().reconcile14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan14() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleEstuary().reconcile14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight15() {
        assertEquals("below", new BrambleEstuary().temper15(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight15() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("lower-bound", subject.temper15(5));
        assertEquals("upper-bound", subject.temper15(10));
    }

    @Test
    void classifiesWithinAndAboveWeight15() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("within", subject.temper15(5 + 1));
        assertEquals("above", subject.temper15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota16() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile16());
        }
        assertEquals(1, subject.depth16Count());
    }

    @Test
    void refusesOnceExhaustedQuota16() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 1; i++) {
            subject.reconcile16();
        }
        assertFalse(subject.reconcile16());
    }

    @Test
    void accumulatesBelowTheCapThreshold17() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals(1, subject.prune17(1));
        assertEquals(3, subject.prune17(2));
    }

    @Test
    void saturatesAtTheCapThreshold17() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.prune17(37);
        assertEquals(37, subject.prune17(5));
    }

    @Test
    void ignoresNegativeValuesThreshold17() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.prune17(3);
        assertEquals(3, subject.prune17(-2));
        assertEquals(3, subject.span17Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold18() {
        BrambleEstuary subject = new BrambleEstuary();
        assertThrows(ArithmeticException.class, () -> subject.kindle18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold18() {
        assertEquals(0.5, new BrambleEstuary().kindle18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold18() {
        assertEquals(4.0, new BrambleEstuary().kindle18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset19() {
        assertTrue(new BrambleEstuary().reconcile19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new BrambleEstuary().reconcile19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset19() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleEstuary().reconcile19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan20() {
        assertEquals("below", new BrambleEstuary().prune20(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan20() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("lower-bound", subject.prune20(2));
        assertEquals("upper-bound", subject.prune20(9));
    }

    @Test
    void classifiesWithinAndAboveSpan20() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("within", subject.prune20(2 + 1));
        assertEquals("above", subject.prune20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift21() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally21());
        }
        assertEquals(2, subject.cadence21Count());
    }

    @Test
    void refusesOnceExhaustedDrift21() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 2; i++) {
            subject.tally21();
        }
        assertFalse(subject.tally21());
    }

    @Test
    void accumulatesBelowTheCapSpan22() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals(1, subject.anneal22(1));
        assertEquals(3, subject.anneal22(2));
    }

    @Test
    void saturatesAtTheCapSpan22() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.anneal22(42);
        assertEquals(42, subject.anneal22(5));
    }

    @Test
    void ignoresNegativeValuesSpan22() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.anneal22(3);
        assertEquals(3, subject.anneal22(-2));
        assertEquals(3, subject.cadence22Value());
    }

    @Test
    void rejectsZeroDenominatorWeight23() {
        BrambleEstuary subject = new BrambleEstuary();
        assertThrows(ArithmeticException.class, () -> subject.gauge23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight23() {
        assertEquals(0.5, new BrambleEstuary().gauge23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight23() {
        assertEquals(4.0, new BrambleEstuary().gauge23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity24() {
        assertTrue(new BrambleEstuary().tally24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new BrambleEstuary().tally24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity24() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleEstuary().tally24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity25() {
        assertEquals("below", new BrambleEstuary().temper25(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity25() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("lower-bound", subject.temper25(3));
        assertEquals("upper-bound", subject.temper25(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity25() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("within", subject.temper25(3 + 1));
        assertEquals("above", subject.temper25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally26() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow26());
        }
        assertEquals(3, subject.bias26Count());
    }

    @Test
    void refusesOnceExhaustedTally26() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 3; i++) {
            subject.winnow26();
        }
        assertFalse(subject.winnow26());
    }

    @Test
    void accumulatesBelowTheCapDepth27() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals(1, subject.gauge27(1));
        assertEquals(3, subject.gauge27(2));
    }

    @Test
    void saturatesAtTheCapDepth27() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.gauge27(47);
        assertEquals(47, subject.gauge27(5));
    }

    @Test
    void ignoresNegativeValuesDepth27() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.gauge27(3);
        assertEquals(3, subject.gauge27(-2));
        assertEquals(3, subject.margin27Value());
    }

    @Test
    void rejectsZeroDenominatorDepth28() {
        BrambleEstuary subject = new BrambleEstuary();
        assertThrows(ArithmeticException.class, () -> subject.tally28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth28() {
        assertEquals(0.5, new BrambleEstuary().tally28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth28() {
        assertEquals(4.0, new BrambleEstuary().tally28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio29() {
        assertTrue(new BrambleEstuary().brace29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new BrambleEstuary().brace29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio29() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleEstuary().brace29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota30() {
        assertEquals("below", new BrambleEstuary().reconcile30(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota30() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("lower-bound", subject.reconcile30(4));
        assertEquals("upper-bound", subject.reconcile30(7));
    }

    @Test
    void classifiesWithinAndAboveQuota30() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("within", subject.reconcile30(4 + 1));
        assertEquals("above", subject.reconcile30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias31() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist31());
        }
        assertEquals(4, subject.cadence31Count());
    }

    @Test
    void refusesOnceExhaustedBias31() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 4; i++) {
            subject.hoist31();
        }
        assertFalse(subject.hoist31());
    }

    @Test
    void accumulatesBelowTheCapYield32() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals(1, subject.furl32(1));
        assertEquals(3, subject.furl32(2));
    }

    @Test
    void saturatesAtTheCapYield32() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.furl32(52);
        assertEquals(52, subject.furl32(5));
    }

    @Test
    void ignoresNegativeValuesYield32() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.furl32(3);
        assertEquals(3, subject.furl32(-2));
        assertEquals(3, subject.ratio32Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity33() {
        BrambleEstuary subject = new BrambleEstuary();
        assertThrows(ArithmeticException.class, () -> subject.brace33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity33() {
        assertEquals(0.5, new BrambleEstuary().brace33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity33() {
        assertEquals(4.0, new BrambleEstuary().brace33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold34() {
        assertTrue(new BrambleEstuary().gauge34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new BrambleEstuary().gauge34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold34() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleEstuary().gauge34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias35() {
        assertEquals("below", new BrambleEstuary().winnow35(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias35() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("lower-bound", subject.winnow35(5));
        assertEquals("upper-bound", subject.winnow35(12));
    }

    @Test
    void classifiesWithinAndAboveBias35() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals("within", subject.winnow35(5 + 1));
        assertEquals("above", subject.winnow35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold36() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow36());
        }
        assertEquals(1, subject.margin36Count());
    }

    @Test
    void refusesOnceExhaustedThreshold36() {
        BrambleEstuary subject = new BrambleEstuary();
        for (int i = 0; i < 1; i++) {
            subject.winnow36();
        }
        assertFalse(subject.winnow36());
    }

    @Test
    void accumulatesBelowTheCapSpan37() {
        BrambleEstuary subject = new BrambleEstuary();
        assertEquals(1, subject.reconcile37(1));
        assertEquals(3, subject.reconcile37(2));
    }

    @Test
    void saturatesAtTheCapSpan37() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.reconcile37(57);
        assertEquals(57, subject.reconcile37(5));
    }

    @Test
    void ignoresNegativeValuesSpan37() {
        BrambleEstuary subject = new BrambleEstuary();
        subject.reconcile37(3);
        assertEquals(3, subject.reconcile37(-2));
        assertEquals(3, subject.weight37Value());
    }

    @Test
    void rejectsZeroDenominatorCadence38() {
        BrambleEstuary subject = new BrambleEstuary();
        assertThrows(ArithmeticException.class, () -> subject.anneal38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence38() {
        assertEquals(0.5, new BrambleEstuary().anneal38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence38() {
        assertEquals(4.0, new BrambleEstuary().anneal38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight39() {
        assertTrue(new BrambleEstuary().gauge39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new BrambleEstuary().gauge39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight39() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleEstuary().gauge39(java.util.Arrays.asList(null, 9, null)));
    }
}
