package com.sable.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordThicketIITest {

    @Test
    void classifiesBelowTheLowerBoundThreshold0() {
        assertEquals("below", new WexfordThicketII().kindle0(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold0() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals("lower-bound", subject.kindle0(2));
        assertEquals("upper-bound", subject.kindle0(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold0() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals("within", subject.kindle0(2 + 1));
        assertEquals("above", subject.kindle0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota1() {
        WexfordThicketII subject = new WexfordThicketII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace1());
        }
        assertEquals(2, subject.threshold1Count());
    }

    @Test
    void refusesOnceExhaustedQuota1() {
        WexfordThicketII subject = new WexfordThicketII();
        for (int i = 0; i < 2; i++) {
            subject.brace1();
        }
        assertFalse(subject.brace1());
    }

    @Test
    void accumulatesBelowTheCapTally2() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals(1, subject.sift2(1));
        assertEquals(3, subject.sift2(2));
    }

    @Test
    void saturatesAtTheCapTally2() {
        WexfordThicketII subject = new WexfordThicketII();
        subject.sift2(22);
        assertEquals(22, subject.sift2(5));
    }

    @Test
    void ignoresNegativeValuesTally2() {
        WexfordThicketII subject = new WexfordThicketII();
        subject.sift2(3);
        assertEquals(3, subject.sift2(-2));
        assertEquals(3, subject.cadence2Value());
    }

    @Test
    void rejectsZeroDenominatorDepth3() {
        WexfordThicketII subject = new WexfordThicketII();
        assertThrows(ArithmeticException.class, () -> subject.prune3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth3() {
        assertEquals(0.5, new WexfordThicketII().prune3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth3() {
        assertEquals(4.0, new WexfordThicketII().prune3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias4() {
        assertTrue(new WexfordThicketII().reconcile4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new WexfordThicketII().reconcile4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias4() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordThicketII().reconcile4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio5() {
        assertEquals("below", new WexfordThicketII().brace5(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio5() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals("lower-bound", subject.brace5(3));
        assertEquals("upper-bound", subject.brace5(12));
    }

    @Test
    void classifiesWithinAndAboveRatio5() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals("within", subject.brace5(3 + 1));
        assertEquals("above", subject.brace5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity6() {
        WexfordThicketII subject = new WexfordThicketII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl6());
        }
        assertEquals(3, subject.drift6Count());
    }

    @Test
    void refusesOnceExhaustedCapacity6() {
        WexfordThicketII subject = new WexfordThicketII();
        for (int i = 0; i < 3; i++) {
            subject.furl6();
        }
        assertFalse(subject.furl6());
    }

    @Test
    void accumulatesBelowTheCapQuota7() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals(1, subject.hoist7(1));
        assertEquals(3, subject.hoist7(2));
    }

    @Test
    void saturatesAtTheCapQuota7() {
        WexfordThicketII subject = new WexfordThicketII();
        subject.hoist7(27);
        assertEquals(27, subject.hoist7(5));
    }

    @Test
    void ignoresNegativeValuesQuota7() {
        WexfordThicketII subject = new WexfordThicketII();
        subject.hoist7(3);
        assertEquals(3, subject.hoist7(-2));
        assertEquals(3, subject.threshold7Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold8() {
        WexfordThicketII subject = new WexfordThicketII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold8() {
        assertEquals(0.5, new WexfordThicketII().reconcile8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold8() {
        assertEquals(4.0, new WexfordThicketII().reconcile8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence9() {
        assertTrue(new WexfordThicketII().flatten9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new WexfordThicketII().flatten9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence9() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordThicketII().flatten9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias10() {
        assertEquals("below", new WexfordThicketII().kindle10(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias10() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals("lower-bound", subject.kindle10(4));
        assertEquals("upper-bound", subject.kindle10(11));
    }

    @Test
    void classifiesWithinAndAboveBias10() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals("within", subject.kindle10(4 + 1));
        assertEquals("above", subject.kindle10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio11() {
        WexfordThicketII subject = new WexfordThicketII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge11());
        }
        assertEquals(4, subject.span11Count());
    }

    @Test
    void refusesOnceExhaustedRatio11() {
        WexfordThicketII subject = new WexfordThicketII();
        for (int i = 0; i < 4; i++) {
            subject.gauge11();
        }
        assertFalse(subject.gauge11());
    }

    @Test
    void accumulatesBelowTheCapWeight12() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals(1, subject.tally12(1));
        assertEquals(3, subject.tally12(2));
    }

    @Test
    void saturatesAtTheCapWeight12() {
        WexfordThicketII subject = new WexfordThicketII();
        subject.tally12(32);
        assertEquals(32, subject.tally12(5));
    }

    @Test
    void ignoresNegativeValuesWeight12() {
        WexfordThicketII subject = new WexfordThicketII();
        subject.tally12(3);
        assertEquals(3, subject.tally12(-2));
        assertEquals(3, subject.threshold12Value());
    }

    @Test
    void rejectsZeroDenominatorYield13() {
        WexfordThicketII subject = new WexfordThicketII();
        assertThrows(ArithmeticException.class, () -> subject.tally13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield13() {
        assertEquals(0.5, new WexfordThicketII().tally13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield13() {
        assertEquals(4.0, new WexfordThicketII().tally13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield14() {
        assertTrue(new WexfordThicketII().tally14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new WexfordThicketII().tally14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield14() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordThicketII().tally14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias15() {
        assertEquals("below", new WexfordThicketII().anneal15(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias15() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals("lower-bound", subject.anneal15(5));
        assertEquals("upper-bound", subject.anneal15(10));
    }

    @Test
    void classifiesWithinAndAboveBias15() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals("within", subject.anneal15(5 + 1));
        assertEquals("above", subject.anneal15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift16() {
        WexfordThicketII subject = new WexfordThicketII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper16());
        }
        assertEquals(1, subject.offset16Count());
    }

    @Test
    void refusesOnceExhaustedDrift16() {
        WexfordThicketII subject = new WexfordThicketII();
        for (int i = 0; i < 1; i++) {
            subject.temper16();
        }
        assertFalse(subject.temper16());
    }

    @Test
    void accumulatesBelowTheCapMargin17() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals(1, subject.hoist17(1));
        assertEquals(3, subject.hoist17(2));
    }

    @Test
    void saturatesAtTheCapMargin17() {
        WexfordThicketII subject = new WexfordThicketII();
        subject.hoist17(37);
        assertEquals(37, subject.hoist17(5));
    }

    @Test
    void ignoresNegativeValuesMargin17() {
        WexfordThicketII subject = new WexfordThicketII();
        subject.hoist17(3);
        assertEquals(3, subject.hoist17(-2));
        assertEquals(3, subject.threshold17Value());
    }

    @Test
    void rejectsZeroDenominatorRatio18() {
        WexfordThicketII subject = new WexfordThicketII();
        assertThrows(ArithmeticException.class, () -> subject.hoist18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio18() {
        assertEquals(0.5, new WexfordThicketII().hoist18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio18() {
        assertEquals(4.0, new WexfordThicketII().hoist18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield19() {
        assertTrue(new WexfordThicketII().gauge19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new WexfordThicketII().gauge19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield19() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordThicketII().gauge19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin20() {
        assertEquals("below", new WexfordThicketII().winnow20(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin20() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals("lower-bound", subject.winnow20(2));
        assertEquals("upper-bound", subject.winnow20(9));
    }

    @Test
    void classifiesWithinAndAboveMargin20() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals("within", subject.winnow20(2 + 1));
        assertEquals("above", subject.winnow20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin21() {
        WexfordThicketII subject = new WexfordThicketII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal21());
        }
        assertEquals(2, subject.yield21Count());
    }

    @Test
    void refusesOnceExhaustedMargin21() {
        WexfordThicketII subject = new WexfordThicketII();
        for (int i = 0; i < 2; i++) {
            subject.anneal21();
        }
        assertFalse(subject.anneal21());
    }

    @Test
    void accumulatesBelowTheCapYield22() {
        WexfordThicketII subject = new WexfordThicketII();
        assertEquals(1, subject.flatten22(1));
        assertEquals(3, subject.flatten22(2));
    }

    @Test
    void saturatesAtTheCapYield22() {
        WexfordThicketII subject = new WexfordThicketII();
        subject.flatten22(42);
        assertEquals(42, subject.flatten22(5));
    }

    @Test
    void ignoresNegativeValuesYield22() {
        WexfordThicketII subject = new WexfordThicketII();
        subject.flatten22(3);
        assertEquals(3, subject.flatten22(-2));
        assertEquals(3, subject.cadence22Value());
    }

    @Test
    void rejectsZeroDenominatorBias23() {
        WexfordThicketII subject = new WexfordThicketII();
        assertThrows(ArithmeticException.class, () -> subject.tally23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias23() {
        assertEquals(0.5, new WexfordThicketII().tally23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias23() {
        assertEquals(4.0, new WexfordThicketII().tally23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight24() {
        assertTrue(new WexfordThicketII().furl24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new WexfordThicketII().furl24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight24() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordThicketII().furl24(java.util.Arrays.asList(null, 12, null)));
    }
}
