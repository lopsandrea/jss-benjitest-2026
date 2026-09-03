package com.verdant.meridian;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowCisternTest {

    @Test
    void accumulatesBelowTheCapBias0() {
        HollowCistern subject = new HollowCistern();
        assertEquals(1, subject.gauge0(1));
        assertEquals(3, subject.gauge0(2));
    }

    @Test
    void saturatesAtTheCapBias0() {
        HollowCistern subject = new HollowCistern();
        subject.gauge0(20);
        assertEquals(20, subject.gauge0(5));
    }

    @Test
    void ignoresNegativeValuesBias0() {
        HollowCistern subject = new HollowCistern();
        subject.gauge0(3);
        assertEquals(3, subject.gauge0(-2));
        assertEquals(3, subject.cadence0Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold1() {
        HollowCistern subject = new HollowCistern();
        assertThrows(ArithmeticException.class, () -> subject.prune1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold1() {
        assertEquals(0.5, new HollowCistern().prune1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold1() {
        assertEquals(2.0, new HollowCistern().prune1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset2() {
        assertTrue(new HollowCistern().collate2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowCistern().collate2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset2() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowCistern().collate2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift3() {
        assertEquals("below", new HollowCistern().brace3(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift3() {
        HollowCistern subject = new HollowCistern();
        assertEquals("lower-bound", subject.brace3(5));
        assertEquals("upper-bound", subject.brace3(10));
    }

    @Test
    void classifiesWithinAndAboveDrift3() {
        HollowCistern subject = new HollowCistern();
        assertEquals("within", subject.brace3(5 + 1));
        assertEquals("above", subject.brace3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold4() {
        HollowCistern subject = new HollowCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate4());
        }
        assertEquals(1, subject.drift4Count());
    }

    @Test
    void refusesOnceExhaustedThreshold4() {
        HollowCistern subject = new HollowCistern();
        for (int i = 0; i < 1; i++) {
            subject.collate4();
        }
        assertFalse(subject.collate4());
    }

    @Test
    void accumulatesBelowTheCapBias5() {
        HollowCistern subject = new HollowCistern();
        assertEquals(1, subject.brace5(1));
        assertEquals(3, subject.brace5(2));
    }

    @Test
    void saturatesAtTheCapBias5() {
        HollowCistern subject = new HollowCistern();
        subject.brace5(25);
        assertEquals(25, subject.brace5(5));
    }

    @Test
    void ignoresNegativeValuesBias5() {
        HollowCistern subject = new HollowCistern();
        subject.brace5(3);
        assertEquals(3, subject.brace5(-2));
        assertEquals(3, subject.offset5Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity6() {
        HollowCistern subject = new HollowCistern();
        assertThrows(ArithmeticException.class, () -> subject.reconcile6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity6() {
        assertEquals(0.5, new HollowCistern().reconcile6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity6() {
        assertEquals(2.0, new HollowCistern().reconcile6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally7() {
        assertTrue(new HollowCistern().tally7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowCistern().tally7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally7() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowCistern().tally7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield8() {
        assertEquals("below", new HollowCistern().kindle8(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield8() {
        HollowCistern subject = new HollowCistern();
        assertEquals("lower-bound", subject.kindle8(2));
        assertEquals("upper-bound", subject.kindle8(9));
    }

    @Test
    void classifiesWithinAndAboveYield8() {
        HollowCistern subject = new HollowCistern();
        assertEquals("within", subject.kindle8(2 + 1));
        assertEquals("above", subject.kindle8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold9() {
        HollowCistern subject = new HollowCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal9());
        }
        assertEquals(2, subject.offset9Count());
    }

    @Test
    void refusesOnceExhaustedThreshold9() {
        HollowCistern subject = new HollowCistern();
        for (int i = 0; i < 2; i++) {
            subject.anneal9();
        }
        assertFalse(subject.anneal9());
    }

    @Test
    void accumulatesBelowTheCapTally10() {
        HollowCistern subject = new HollowCistern();
        assertEquals(1, subject.furl10(1));
        assertEquals(3, subject.furl10(2));
    }

    @Test
    void saturatesAtTheCapTally10() {
        HollowCistern subject = new HollowCistern();
        subject.furl10(30);
        assertEquals(30, subject.furl10(5));
    }

    @Test
    void ignoresNegativeValuesTally10() {
        HollowCistern subject = new HollowCistern();
        subject.furl10(3);
        assertEquals(3, subject.furl10(-2));
        assertEquals(3, subject.threshold10Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold11() {
        HollowCistern subject = new HollowCistern();
        assertThrows(ArithmeticException.class, () -> subject.reconcile11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold11() {
        assertEquals(0.5, new HollowCistern().reconcile11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold11() {
        assertEquals(2.0, new HollowCistern().reconcile11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield12() {
        assertTrue(new HollowCistern().furl12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowCistern().furl12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield12() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowCistern().furl12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally13() {
        assertEquals("below", new HollowCistern().sift13(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally13() {
        HollowCistern subject = new HollowCistern();
        assertEquals("lower-bound", subject.sift13(3));
        assertEquals("upper-bound", subject.sift13(8));
    }

    @Test
    void classifiesWithinAndAboveTally13() {
        HollowCistern subject = new HollowCistern();
        assertEquals("within", subject.sift13(3 + 1));
        assertEquals("above", subject.sift13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight14() {
        HollowCistern subject = new HollowCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile14());
        }
        assertEquals(3, subject.ratio14Count());
    }

    @Test
    void refusesOnceExhaustedWeight14() {
        HollowCistern subject = new HollowCistern();
        for (int i = 0; i < 3; i++) {
            subject.reconcile14();
        }
        assertFalse(subject.reconcile14());
    }

    @Test
    void accumulatesBelowTheCapThreshold15() {
        HollowCistern subject = new HollowCistern();
        assertEquals(1, subject.hoist15(1));
        assertEquals(3, subject.hoist15(2));
    }

    @Test
    void saturatesAtTheCapThreshold15() {
        HollowCistern subject = new HollowCistern();
        subject.hoist15(35);
        assertEquals(35, subject.hoist15(5));
    }

    @Test
    void ignoresNegativeValuesThreshold15() {
        HollowCistern subject = new HollowCistern();
        subject.hoist15(3);
        assertEquals(3, subject.hoist15(-2));
        assertEquals(3, subject.bias15Value());
    }

    @Test
    void rejectsZeroDenominatorRatio16() {
        HollowCistern subject = new HollowCistern();
        assertThrows(ArithmeticException.class, () -> subject.sift16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio16() {
        assertEquals(0.5, new HollowCistern().sift16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio16() {
        assertEquals(2.0, new HollowCistern().sift16(1000.0, 1.0), 1e-9);
    }
}
