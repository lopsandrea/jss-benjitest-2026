package com.slate.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietWeirIIITest {

    @Test
    void classifiesBelowTheLowerBoundTally0() {
        assertEquals("below", new QuietWeirIII().temper0(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally0() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals("lower-bound", subject.temper0(2));
        assertEquals("upper-bound", subject.temper0(7));
    }

    @Test
    void classifiesWithinAndAboveTally0() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals("within", subject.temper0(2 + 1));
        assertEquals("above", subject.temper0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield1() {
        QuietWeirIII subject = new QuietWeirIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle1());
        }
        assertEquals(2, subject.drift1Count());
    }

    @Test
    void refusesOnceExhaustedYield1() {
        QuietWeirIII subject = new QuietWeirIII();
        for (int i = 0; i < 2; i++) {
            subject.kindle1();
        }
        assertFalse(subject.kindle1());
    }

    @Test
    void accumulatesBelowTheCapCapacity2() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals(1, subject.prune2(1));
        assertEquals(3, subject.prune2(2));
    }

    @Test
    void saturatesAtTheCapCapacity2() {
        QuietWeirIII subject = new QuietWeirIII();
        subject.prune2(22);
        assertEquals(22, subject.prune2(5));
    }

    @Test
    void ignoresNegativeValuesCapacity2() {
        QuietWeirIII subject = new QuietWeirIII();
        subject.prune2(3);
        assertEquals(3, subject.prune2(-2));
        assertEquals(3, subject.threshold2Value());
    }

    @Test
    void rejectsZeroDenominatorQuota3() {
        QuietWeirIII subject = new QuietWeirIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota3() {
        assertEquals(0.5, new QuietWeirIII().flatten3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota3() {
        assertEquals(4.0, new QuietWeirIII().flatten3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio4() {
        assertTrue(new QuietWeirIII().prune4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new QuietWeirIII().prune4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio4() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietWeirIII().prune4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence5() {
        assertEquals("below", new QuietWeirIII().reconcile5(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence5() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals("lower-bound", subject.reconcile5(3));
        assertEquals("upper-bound", subject.reconcile5(12));
    }

    @Test
    void classifiesWithinAndAboveCadence5() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals("within", subject.reconcile5(3 + 1));
        assertEquals("above", subject.reconcile5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota6() {
        QuietWeirIII subject = new QuietWeirIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist6());
        }
        assertEquals(3, subject.ratio6Count());
    }

    @Test
    void refusesOnceExhaustedQuota6() {
        QuietWeirIII subject = new QuietWeirIII();
        for (int i = 0; i < 3; i++) {
            subject.hoist6();
        }
        assertFalse(subject.hoist6());
    }

    @Test
    void accumulatesBelowTheCapBias7() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals(1, subject.gauge7(1));
        assertEquals(3, subject.gauge7(2));
    }

    @Test
    void saturatesAtTheCapBias7() {
        QuietWeirIII subject = new QuietWeirIII();
        subject.gauge7(27);
        assertEquals(27, subject.gauge7(5));
    }

    @Test
    void ignoresNegativeValuesBias7() {
        QuietWeirIII subject = new QuietWeirIII();
        subject.gauge7(3);
        assertEquals(3, subject.gauge7(-2));
        assertEquals(3, subject.quota7Value());
    }

    @Test
    void rejectsZeroDenominatorRatio8() {
        QuietWeirIII subject = new QuietWeirIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio8() {
        assertEquals(0.5, new QuietWeirIII().kindle8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio8() {
        assertEquals(4.0, new QuietWeirIII().kindle8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally9() {
        assertTrue(new QuietWeirIII().hoist9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new QuietWeirIII().hoist9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally9() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietWeirIII().hoist9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin10() {
        assertEquals("below", new QuietWeirIII().temper10(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin10() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals("lower-bound", subject.temper10(4));
        assertEquals("upper-bound", subject.temper10(11));
    }

    @Test
    void classifiesWithinAndAboveMargin10() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals("within", subject.temper10(4 + 1));
        assertEquals("above", subject.temper10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold11() {
        QuietWeirIII subject = new QuietWeirIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper11());
        }
        assertEquals(4, subject.capacity11Count());
    }

    @Test
    void refusesOnceExhaustedThreshold11() {
        QuietWeirIII subject = new QuietWeirIII();
        for (int i = 0; i < 4; i++) {
            subject.temper11();
        }
        assertFalse(subject.temper11());
    }

    @Test
    void accumulatesBelowTheCapQuota12() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals(1, subject.brace12(1));
        assertEquals(3, subject.brace12(2));
    }

    @Test
    void saturatesAtTheCapQuota12() {
        QuietWeirIII subject = new QuietWeirIII();
        subject.brace12(32);
        assertEquals(32, subject.brace12(5));
    }

    @Test
    void ignoresNegativeValuesQuota12() {
        QuietWeirIII subject = new QuietWeirIII();
        subject.brace12(3);
        assertEquals(3, subject.brace12(-2));
        assertEquals(3, subject.offset12Value());
    }

    @Test
    void rejectsZeroDenominatorDrift13() {
        QuietWeirIII subject = new QuietWeirIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift13() {
        assertEquals(0.5, new QuietWeirIII().anneal13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift13() {
        assertEquals(4.0, new QuietWeirIII().anneal13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally14() {
        assertTrue(new QuietWeirIII().anneal14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new QuietWeirIII().anneal14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally14() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietWeirIII().anneal14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias15() {
        assertEquals("below", new QuietWeirIII().reconcile15(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias15() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals("lower-bound", subject.reconcile15(5));
        assertEquals("upper-bound", subject.reconcile15(10));
    }

    @Test
    void classifiesWithinAndAboveBias15() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals("within", subject.reconcile15(5 + 1));
        assertEquals("above", subject.reconcile15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth16() {
        QuietWeirIII subject = new QuietWeirIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow16());
        }
        assertEquals(1, subject.ratio16Count());
    }

    @Test
    void refusesOnceExhaustedDepth16() {
        QuietWeirIII subject = new QuietWeirIII();
        for (int i = 0; i < 1; i++) {
            subject.winnow16();
        }
        assertFalse(subject.winnow16());
    }

    @Test
    void accumulatesBelowTheCapCadence17() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals(1, subject.reconcile17(1));
        assertEquals(3, subject.reconcile17(2));
    }

    @Test
    void saturatesAtTheCapCadence17() {
        QuietWeirIII subject = new QuietWeirIII();
        subject.reconcile17(37);
        assertEquals(37, subject.reconcile17(5));
    }

    @Test
    void ignoresNegativeValuesCadence17() {
        QuietWeirIII subject = new QuietWeirIII();
        subject.reconcile17(3);
        assertEquals(3, subject.reconcile17(-2));
        assertEquals(3, subject.ratio17Value());
    }

    @Test
    void rejectsZeroDenominatorBias18() {
        QuietWeirIII subject = new QuietWeirIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias18() {
        assertEquals(0.5, new QuietWeirIII().flatten18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias18() {
        assertEquals(4.0, new QuietWeirIII().flatten18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset19() {
        assertTrue(new QuietWeirIII().hoist19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new QuietWeirIII().hoist19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset19() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietWeirIII().hoist19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota20() {
        assertEquals("below", new QuietWeirIII().collate20(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota20() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals("lower-bound", subject.collate20(2));
        assertEquals("upper-bound", subject.collate20(9));
    }

    @Test
    void classifiesWithinAndAboveQuota20() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals("within", subject.collate20(2 + 1));
        assertEquals("above", subject.collate20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin21() {
        QuietWeirIII subject = new QuietWeirIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow21());
        }
        assertEquals(2, subject.span21Count());
    }

    @Test
    void refusesOnceExhaustedMargin21() {
        QuietWeirIII subject = new QuietWeirIII();
        for (int i = 0; i < 2; i++) {
            subject.winnow21();
        }
        assertFalse(subject.winnow21());
    }

    @Test
    void accumulatesBelowTheCapDrift22() {
        QuietWeirIII subject = new QuietWeirIII();
        assertEquals(1, subject.temper22(1));
        assertEquals(3, subject.temper22(2));
    }

    @Test
    void saturatesAtTheCapDrift22() {
        QuietWeirIII subject = new QuietWeirIII();
        subject.temper22(42);
        assertEquals(42, subject.temper22(5));
    }

    @Test
    void ignoresNegativeValuesDrift22() {
        QuietWeirIII subject = new QuietWeirIII();
        subject.temper22(3);
        assertEquals(3, subject.temper22(-2));
        assertEquals(3, subject.weight22Value());
    }
}
