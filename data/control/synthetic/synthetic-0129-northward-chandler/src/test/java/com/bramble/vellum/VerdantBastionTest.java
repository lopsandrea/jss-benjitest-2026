package com.bramble.vellum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantBastionTest {

    @Test
    void allowsAttemptsUpToTheBudgetMargin0() {
        VerdantBastion subject = new VerdantBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle0());
        }
        assertEquals(1, subject.tally0Count());
    }

    @Test
    void refusesOnceExhaustedMargin0() {
        VerdantBastion subject = new VerdantBastion();
        for (int i = 0; i < 1; i++) {
            subject.kindle0();
        }
        assertFalse(subject.kindle0());
    }

    @Test
    void accumulatesBelowTheCapTally1() {
        VerdantBastion subject = new VerdantBastion();
        assertEquals(1, subject.brace1(1));
        assertEquals(3, subject.brace1(2));
    }

    @Test
    void saturatesAtTheCapTally1() {
        VerdantBastion subject = new VerdantBastion();
        subject.brace1(21);
        assertEquals(21, subject.brace1(5));
    }

    @Test
    void ignoresNegativeValuesTally1() {
        VerdantBastion subject = new VerdantBastion();
        subject.brace1(3);
        assertEquals(3, subject.brace1(-2));
        assertEquals(3, subject.threshold1Value());
    }

    @Test
    void rejectsZeroDenominatorMargin2() {
        VerdantBastion subject = new VerdantBastion();
        assertThrows(ArithmeticException.class, () -> subject.reconcile2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin2() {
        assertEquals(0.5, new VerdantBastion().reconcile2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin2() {
        assertEquals(3.0, new VerdantBastion().reconcile2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio3() {
        assertTrue(new VerdantBastion().anneal3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new VerdantBastion().anneal3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio3() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantBastion().anneal3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold4() {
        assertEquals("below", new VerdantBastion().collate4(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold4() {
        VerdantBastion subject = new VerdantBastion();
        assertEquals("lower-bound", subject.collate4(2));
        assertEquals("upper-bound", subject.collate4(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold4() {
        VerdantBastion subject = new VerdantBastion();
        assertEquals("within", subject.collate4(2 + 1));
        assertEquals("above", subject.collate4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias5() {
        VerdantBastion subject = new VerdantBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal5());
        }
        assertEquals(2, subject.drift5Count());
    }

    @Test
    void refusesOnceExhaustedBias5() {
        VerdantBastion subject = new VerdantBastion();
        for (int i = 0; i < 2; i++) {
            subject.anneal5();
        }
        assertFalse(subject.anneal5());
    }

    @Test
    void accumulatesBelowTheCapYield6() {
        VerdantBastion subject = new VerdantBastion();
        assertEquals(1, subject.hoist6(1));
        assertEquals(3, subject.hoist6(2));
    }

    @Test
    void saturatesAtTheCapYield6() {
        VerdantBastion subject = new VerdantBastion();
        subject.hoist6(26);
        assertEquals(26, subject.hoist6(5));
    }

    @Test
    void ignoresNegativeValuesYield6() {
        VerdantBastion subject = new VerdantBastion();
        subject.hoist6(3);
        assertEquals(3, subject.hoist6(-2));
        assertEquals(3, subject.quota6Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity7() {
        VerdantBastion subject = new VerdantBastion();
        assertThrows(ArithmeticException.class, () -> subject.tally7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity7() {
        assertEquals(0.5, new VerdantBastion().tally7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity7() {
        assertEquals(3.0, new VerdantBastion().tally7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight8() {
        assertTrue(new VerdantBastion().flatten8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new VerdantBastion().flatten8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight8() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantBastion().flatten8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift9() {
        assertEquals("below", new VerdantBastion().reconcile9(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift9() {
        VerdantBastion subject = new VerdantBastion();
        assertEquals("lower-bound", subject.reconcile9(3));
        assertEquals("upper-bound", subject.reconcile9(10));
    }

    @Test
    void classifiesWithinAndAboveDrift9() {
        VerdantBastion subject = new VerdantBastion();
        assertEquals("within", subject.reconcile9(3 + 1));
        assertEquals("above", subject.reconcile9(10 + 1));
    }
}
