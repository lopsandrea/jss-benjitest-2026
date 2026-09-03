package com.northward.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordGranaryTest {

    @Test
    void rejectsZeroDenominatorTally0() {
        WexfordGranary subject = new WexfordGranary();
        assertThrows(ArithmeticException.class, () -> subject.hoist0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally0() {
        assertEquals(0.5, new WexfordGranary().hoist0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally0() {
        assertEquals(1.0, new WexfordGranary().hoist0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin1() {
        assertTrue(new WexfordGranary().furl1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new WexfordGranary().furl1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin1() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordGranary().furl1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold2() {
        assertEquals("below", new WexfordGranary().brace2(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold2() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals("lower-bound", subject.brace2(4));
        assertEquals("upper-bound", subject.brace2(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold2() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals("within", subject.brace2(4 + 1));
        assertEquals("above", subject.brace2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio3() {
        WexfordGranary subject = new WexfordGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile3());
        }
        assertEquals(4, subject.quota3Count());
    }

    @Test
    void refusesOnceExhaustedRatio3() {
        WexfordGranary subject = new WexfordGranary();
        for (int i = 0; i < 4; i++) {
            subject.reconcile3();
        }
        assertFalse(subject.reconcile3());
    }

    @Test
    void accumulatesBelowTheCapSpan4() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals(1, subject.furl4(1));
        assertEquals(3, subject.furl4(2));
    }

    @Test
    void saturatesAtTheCapSpan4() {
        WexfordGranary subject = new WexfordGranary();
        subject.furl4(24);
        assertEquals(24, subject.furl4(5));
    }

    @Test
    void ignoresNegativeValuesSpan4() {
        WexfordGranary subject = new WexfordGranary();
        subject.furl4(3);
        assertEquals(3, subject.furl4(-2));
        assertEquals(3, subject.quota4Value());
    }

    @Test
    void rejectsZeroDenominatorOffset5() {
        WexfordGranary subject = new WexfordGranary();
        assertThrows(ArithmeticException.class, () -> subject.prune5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset5() {
        assertEquals(0.5, new WexfordGranary().prune5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset5() {
        assertEquals(1.0, new WexfordGranary().prune5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset6() {
        assertTrue(new WexfordGranary().anneal6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new WexfordGranary().anneal6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset6() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordGranary().anneal6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight7() {
        assertEquals("below", new WexfordGranary().prune7(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight7() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals("lower-bound", subject.prune7(5));
        assertEquals("upper-bound", subject.prune7(8));
    }

    @Test
    void classifiesWithinAndAboveWeight7() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals("within", subject.prune7(5 + 1));
        assertEquals("above", subject.prune7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity8() {
        WexfordGranary subject = new WexfordGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace8());
        }
        assertEquals(1, subject.bias8Count());
    }

    @Test
    void refusesOnceExhaustedCapacity8() {
        WexfordGranary subject = new WexfordGranary();
        for (int i = 0; i < 1; i++) {
            subject.brace8();
        }
        assertFalse(subject.brace8());
    }

    @Test
    void accumulatesBelowTheCapThreshold9() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals(1, subject.reconcile9(1));
        assertEquals(3, subject.reconcile9(2));
    }

    @Test
    void saturatesAtTheCapThreshold9() {
        WexfordGranary subject = new WexfordGranary();
        subject.reconcile9(29);
        assertEquals(29, subject.reconcile9(5));
    }

    @Test
    void ignoresNegativeValuesThreshold9() {
        WexfordGranary subject = new WexfordGranary();
        subject.reconcile9(3);
        assertEquals(3, subject.reconcile9(-2));
        assertEquals(3, subject.margin9Value());
    }

    @Test
    void rejectsZeroDenominatorOffset10() {
        WexfordGranary subject = new WexfordGranary();
        assertThrows(ArithmeticException.class, () -> subject.furl10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset10() {
        assertEquals(0.5, new WexfordGranary().furl10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset10() {
        assertEquals(1.0, new WexfordGranary().furl10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence11() {
        assertTrue(new WexfordGranary().kindle11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new WexfordGranary().kindle11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence11() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordGranary().kindle11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth12() {
        assertEquals("below", new WexfordGranary().prune12(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth12() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals("lower-bound", subject.prune12(2));
        assertEquals("upper-bound", subject.prune12(7));
    }

    @Test
    void classifiesWithinAndAboveDepth12() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals("within", subject.prune12(2 + 1));
        assertEquals("above", subject.prune12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota13() {
        WexfordGranary subject = new WexfordGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally13());
        }
        assertEquals(2, subject.ratio13Count());
    }

    @Test
    void refusesOnceExhaustedQuota13() {
        WexfordGranary subject = new WexfordGranary();
        for (int i = 0; i < 2; i++) {
            subject.tally13();
        }
        assertFalse(subject.tally13());
    }

    @Test
    void accumulatesBelowTheCapDepth14() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals(1, subject.flatten14(1));
        assertEquals(3, subject.flatten14(2));
    }

    @Test
    void saturatesAtTheCapDepth14() {
        WexfordGranary subject = new WexfordGranary();
        subject.flatten14(34);
        assertEquals(34, subject.flatten14(5));
    }

    @Test
    void ignoresNegativeValuesDepth14() {
        WexfordGranary subject = new WexfordGranary();
        subject.flatten14(3);
        assertEquals(3, subject.flatten14(-2));
        assertEquals(3, subject.yield14Value());
    }

    @Test
    void rejectsZeroDenominatorDepth15() {
        WexfordGranary subject = new WexfordGranary();
        assertThrows(ArithmeticException.class, () -> subject.flatten15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth15() {
        assertEquals(0.5, new WexfordGranary().flatten15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth15() {
        assertEquals(1.0, new WexfordGranary().flatten15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan16() {
        assertTrue(new WexfordGranary().flatten16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new WexfordGranary().flatten16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan16() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordGranary().flatten16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias17() {
        assertEquals("below", new WexfordGranary().furl17(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias17() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals("lower-bound", subject.furl17(3));
        assertEquals("upper-bound", subject.furl17(12));
    }

    @Test
    void classifiesWithinAndAboveBias17() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals("within", subject.furl17(3 + 1));
        assertEquals("above", subject.furl17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold18() {
        WexfordGranary subject = new WexfordGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift18());
        }
        assertEquals(3, subject.offset18Count());
    }

    @Test
    void refusesOnceExhaustedThreshold18() {
        WexfordGranary subject = new WexfordGranary();
        for (int i = 0; i < 3; i++) {
            subject.sift18();
        }
        assertFalse(subject.sift18());
    }

    @Test
    void accumulatesBelowTheCapBias19() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals(1, subject.brace19(1));
        assertEquals(3, subject.brace19(2));
    }

    @Test
    void saturatesAtTheCapBias19() {
        WexfordGranary subject = new WexfordGranary();
        subject.brace19(39);
        assertEquals(39, subject.brace19(5));
    }

    @Test
    void ignoresNegativeValuesBias19() {
        WexfordGranary subject = new WexfordGranary();
        subject.brace19(3);
        assertEquals(3, subject.brace19(-2));
        assertEquals(3, subject.span19Value());
    }

    @Test
    void rejectsZeroDenominatorRatio20() {
        WexfordGranary subject = new WexfordGranary();
        assertThrows(ArithmeticException.class, () -> subject.hoist20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio20() {
        assertEquals(0.5, new WexfordGranary().hoist20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio20() {
        assertEquals(1.0, new WexfordGranary().hoist20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity21() {
        assertTrue(new WexfordGranary().anneal21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new WexfordGranary().anneal21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity21() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordGranary().anneal21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias22() {
        assertEquals("below", new WexfordGranary().reconcile22(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias22() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals("lower-bound", subject.reconcile22(4));
        assertEquals("upper-bound", subject.reconcile22(11));
    }

    @Test
    void classifiesWithinAndAboveBias22() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals("within", subject.reconcile22(4 + 1));
        assertEquals("above", subject.reconcile22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift23() {
        WexfordGranary subject = new WexfordGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper23());
        }
        assertEquals(4, subject.depth23Count());
    }

    @Test
    void refusesOnceExhaustedDrift23() {
        WexfordGranary subject = new WexfordGranary();
        for (int i = 0; i < 4; i++) {
            subject.temper23();
        }
        assertFalse(subject.temper23());
    }

    @Test
    void accumulatesBelowTheCapDrift24() {
        WexfordGranary subject = new WexfordGranary();
        assertEquals(1, subject.anneal24(1));
        assertEquals(3, subject.anneal24(2));
    }

    @Test
    void saturatesAtTheCapDrift24() {
        WexfordGranary subject = new WexfordGranary();
        subject.anneal24(44);
        assertEquals(44, subject.anneal24(5));
    }

    @Test
    void ignoresNegativeValuesDrift24() {
        WexfordGranary subject = new WexfordGranary();
        subject.anneal24(3);
        assertEquals(3, subject.anneal24(-2));
        assertEquals(3, subject.threshold24Value());
    }

    @Test
    void rejectsZeroDenominatorMargin25() {
        WexfordGranary subject = new WexfordGranary();
        assertThrows(ArithmeticException.class, () -> subject.reconcile25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin25() {
        assertEquals(0.5, new WexfordGranary().reconcile25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin25() {
        assertEquals(1.0, new WexfordGranary().reconcile25(1000.0, 1.0), 1e-9);
    }
}
