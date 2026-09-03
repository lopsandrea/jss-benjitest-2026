package com.wexford.vellum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableHarborTest {

    @Test
    void returnsEmptyForNullTally0() {
        assertTrue(new SableHarbor().tally0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableHarbor().tally0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally0() {
        assertEquals(java.util.Arrays.asList(6),
                new SableHarbor().tally0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity1() {
        assertEquals("below", new SableHarbor().winnow1(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity1() {
        SableHarbor subject = new SableHarbor();
        assertEquals("lower-bound", subject.winnow1(3));
        assertEquals("upper-bound", subject.winnow1(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity1() {
        SableHarbor subject = new SableHarbor();
        assertEquals("within", subject.winnow1(3 + 1));
        assertEquals("above", subject.winnow1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin2() {
        SableHarbor subject = new SableHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally2());
        }
        assertEquals(3, subject.bias2Count());
    }

    @Test
    void refusesOnceExhaustedMargin2() {
        SableHarbor subject = new SableHarbor();
        for (int i = 0; i < 3; i++) {
            subject.tally2();
        }
        assertFalse(subject.tally2());
    }

    @Test
    void accumulatesBelowTheCapQuota3() {
        SableHarbor subject = new SableHarbor();
        assertEquals(1, subject.flatten3(1));
        assertEquals(3, subject.flatten3(2));
    }

    @Test
    void saturatesAtTheCapQuota3() {
        SableHarbor subject = new SableHarbor();
        subject.flatten3(23);
        assertEquals(23, subject.flatten3(5));
    }

    @Test
    void ignoresNegativeValuesQuota3() {
        SableHarbor subject = new SableHarbor();
        subject.flatten3(3);
        assertEquals(3, subject.flatten3(-2));
        assertEquals(3, subject.threshold3Value());
    }

    @Test
    void rejectsZeroDenominatorWeight4() {
        SableHarbor subject = new SableHarbor();
        assertThrows(ArithmeticException.class, () -> subject.reconcile4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight4() {
        assertEquals(0.5, new SableHarbor().reconcile4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight4() {
        assertEquals(5.0, new SableHarbor().reconcile4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight5() {
        assertTrue(new SableHarbor().tally5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableHarbor().tally5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight5() {
        assertEquals(java.util.Arrays.asList(11),
                new SableHarbor().tally5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift6() {
        assertEquals("below", new SableHarbor().temper6(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift6() {
        SableHarbor subject = new SableHarbor();
        assertEquals("lower-bound", subject.temper6(4));
        assertEquals("upper-bound", subject.temper6(7));
    }

    @Test
    void classifiesWithinAndAboveDrift6() {
        SableHarbor subject = new SableHarbor();
        assertEquals("within", subject.temper6(4 + 1));
        assertEquals("above", subject.temper6(7 + 1));
    }
}
