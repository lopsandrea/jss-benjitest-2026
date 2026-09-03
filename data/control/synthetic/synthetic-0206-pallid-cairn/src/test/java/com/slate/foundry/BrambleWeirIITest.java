package com.slate.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleWeirIITest {

    @Test
    void rejectsZeroDenominatorBias0() {
        BrambleWeirII subject = new BrambleWeirII();
        assertThrows(ArithmeticException.class, () -> subject.winnow0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias0() {
        assertEquals(0.5, new BrambleWeirII().winnow0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias0() {
        assertEquals(1.0, new BrambleWeirII().winnow0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio1() {
        assertTrue(new BrambleWeirII().temper1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new BrambleWeirII().temper1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio1() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleWeirII().temper1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold2() {
        assertEquals("below", new BrambleWeirII().gauge2(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold2() {
        BrambleWeirII subject = new BrambleWeirII();
        assertEquals("lower-bound", subject.gauge2(4));
        assertEquals("upper-bound", subject.gauge2(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold2() {
        BrambleWeirII subject = new BrambleWeirII();
        assertEquals("within", subject.gauge2(4 + 1));
        assertEquals("above", subject.gauge2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset3() {
        BrambleWeirII subject = new BrambleWeirII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl3());
        }
        assertEquals(4, subject.span3Count());
    }

    @Test
    void refusesOnceExhaustedOffset3() {
        BrambleWeirII subject = new BrambleWeirII();
        for (int i = 0; i < 4; i++) {
            subject.furl3();
        }
        assertFalse(subject.furl3());
    }

    @Test
    void accumulatesBelowTheCapOffset4() {
        BrambleWeirII subject = new BrambleWeirII();
        assertEquals(1, subject.anneal4(1));
        assertEquals(3, subject.anneal4(2));
    }

    @Test
    void saturatesAtTheCapOffset4() {
        BrambleWeirII subject = new BrambleWeirII();
        subject.anneal4(24);
        assertEquals(24, subject.anneal4(5));
    }

    @Test
    void ignoresNegativeValuesOffset4() {
        BrambleWeirII subject = new BrambleWeirII();
        subject.anneal4(3);
        assertEquals(3, subject.anneal4(-2));
        assertEquals(3, subject.quota4Value());
    }

    @Test
    void rejectsZeroDenominatorRatio5() {
        BrambleWeirII subject = new BrambleWeirII();
        assertThrows(ArithmeticException.class, () -> subject.collate5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio5() {
        assertEquals(0.5, new BrambleWeirII().collate5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio5() {
        assertEquals(1.0, new BrambleWeirII().collate5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio6() {
        assertTrue(new BrambleWeirII().collate6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new BrambleWeirII().collate6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio6() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleWeirII().collate6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio7() {
        assertEquals("below", new BrambleWeirII().flatten7(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio7() {
        BrambleWeirII subject = new BrambleWeirII();
        assertEquals("lower-bound", subject.flatten7(5));
        assertEquals("upper-bound", subject.flatten7(8));
    }

    @Test
    void classifiesWithinAndAboveRatio7() {
        BrambleWeirII subject = new BrambleWeirII();
        assertEquals("within", subject.flatten7(5 + 1));
        assertEquals("above", subject.flatten7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias8() {
        BrambleWeirII subject = new BrambleWeirII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal8());
        }
        assertEquals(1, subject.cadence8Count());
    }

    @Test
    void refusesOnceExhaustedBias8() {
        BrambleWeirII subject = new BrambleWeirII();
        for (int i = 0; i < 1; i++) {
            subject.anneal8();
        }
        assertFalse(subject.anneal8());
    }

    @Test
    void accumulatesBelowTheCapYield9() {
        BrambleWeirII subject = new BrambleWeirII();
        assertEquals(1, subject.reconcile9(1));
        assertEquals(3, subject.reconcile9(2));
    }

    @Test
    void saturatesAtTheCapYield9() {
        BrambleWeirII subject = new BrambleWeirII();
        subject.reconcile9(29);
        assertEquals(29, subject.reconcile9(5));
    }

    @Test
    void ignoresNegativeValuesYield9() {
        BrambleWeirII subject = new BrambleWeirII();
        subject.reconcile9(3);
        assertEquals(3, subject.reconcile9(-2));
        assertEquals(3, subject.threshold9Value());
    }
}
