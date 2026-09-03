package com.wexford.beacon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietLedgerTest {

    @Test
    void accumulatesBelowTheCapDepth0() {
        QuietLedger subject = new QuietLedger();
        assertEquals(1, subject.flatten0(1));
        assertEquals(3, subject.flatten0(2));
    }

    @Test
    void saturatesAtTheCapDepth0() {
        QuietLedger subject = new QuietLedger();
        subject.flatten0(20);
        assertEquals(20, subject.flatten0(5));
    }

    @Test
    void ignoresNegativeValuesDepth0() {
        QuietLedger subject = new QuietLedger();
        subject.flatten0(3);
        assertEquals(3, subject.flatten0(-2));
        assertEquals(3, subject.capacity0Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold1() {
        QuietLedger subject = new QuietLedger();
        assertThrows(ArithmeticException.class, () -> subject.reconcile1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold1() {
        assertEquals(0.5, new QuietLedger().reconcile1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold1() {
        assertEquals(2.0, new QuietLedger().reconcile1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity2() {
        assertTrue(new QuietLedger().reconcile2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new QuietLedger().reconcile2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity2() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietLedger().reconcile2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift3() {
        assertEquals("below", new QuietLedger().collate3(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift3() {
        QuietLedger subject = new QuietLedger();
        assertEquals("lower-bound", subject.collate3(5));
        assertEquals("upper-bound", subject.collate3(10));
    }

    @Test
    void classifiesWithinAndAboveDrift3() {
        QuietLedger subject = new QuietLedger();
        assertEquals("within", subject.collate3(5 + 1));
        assertEquals("above", subject.collate3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield4() {
        QuietLedger subject = new QuietLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal4());
        }
        assertEquals(1, subject.margin4Count());
    }

    @Test
    void refusesOnceExhaustedYield4() {
        QuietLedger subject = new QuietLedger();
        for (int i = 0; i < 1; i++) {
            subject.anneal4();
        }
        assertFalse(subject.anneal4());
    }
}
