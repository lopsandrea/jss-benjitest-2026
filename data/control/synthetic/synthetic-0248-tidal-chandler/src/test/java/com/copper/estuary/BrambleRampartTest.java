package com.copper.estuary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleRampartTest {

    @Test
    void classifiesBelowTheLowerBoundQuota0() {
        assertEquals("below", new BrambleRampart().sift0(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota0() {
        BrambleRampart subject = new BrambleRampart();
        assertEquals("lower-bound", subject.sift0(2));
        assertEquals("upper-bound", subject.sift0(7));
    }

    @Test
    void classifiesWithinAndAboveQuota0() {
        BrambleRampart subject = new BrambleRampart();
        assertEquals("within", subject.sift0(2 + 1));
        assertEquals("above", subject.sift0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence1() {
        BrambleRampart subject = new BrambleRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift1());
        }
        assertEquals(2, subject.threshold1Count());
    }

    @Test
    void refusesOnceExhaustedCadence1() {
        BrambleRampart subject = new BrambleRampart();
        for (int i = 0; i < 2; i++) {
            subject.sift1();
        }
        assertFalse(subject.sift1());
    }

    @Test
    void accumulatesBelowTheCapBias2() {
        BrambleRampart subject = new BrambleRampart();
        assertEquals(1, subject.brace2(1));
        assertEquals(3, subject.brace2(2));
    }

    @Test
    void saturatesAtTheCapBias2() {
        BrambleRampart subject = new BrambleRampart();
        subject.brace2(22);
        assertEquals(22, subject.brace2(5));
    }

    @Test
    void ignoresNegativeValuesBias2() {
        BrambleRampart subject = new BrambleRampart();
        subject.brace2(3);
        assertEquals(3, subject.brace2(-2));
        assertEquals(3, subject.tally2Value());
    }

    @Test
    void rejectsZeroDenominatorMargin3() {
        BrambleRampart subject = new BrambleRampart();
        assertThrows(ArithmeticException.class, () -> subject.reconcile3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin3() {
        assertEquals(0.5, new BrambleRampart().reconcile3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin3() {
        assertEquals(4.0, new BrambleRampart().reconcile3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift4() {
        assertTrue(new BrambleRampart().prune4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new BrambleRampart().prune4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift4() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleRampart().prune4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio5() {
        assertEquals("below", new BrambleRampart().anneal5(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio5() {
        BrambleRampart subject = new BrambleRampart();
        assertEquals("lower-bound", subject.anneal5(3));
        assertEquals("upper-bound", subject.anneal5(12));
    }

    @Test
    void classifiesWithinAndAboveRatio5() {
        BrambleRampart subject = new BrambleRampart();
        assertEquals("within", subject.anneal5(3 + 1));
        assertEquals("above", subject.anneal5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota6() {
        BrambleRampart subject = new BrambleRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal6());
        }
        assertEquals(3, subject.cadence6Count());
    }

    @Test
    void refusesOnceExhaustedQuota6() {
        BrambleRampart subject = new BrambleRampart();
        for (int i = 0; i < 3; i++) {
            subject.anneal6();
        }
        assertFalse(subject.anneal6());
    }

    @Test
    void accumulatesBelowTheCapDepth7() {
        BrambleRampart subject = new BrambleRampart();
        assertEquals(1, subject.winnow7(1));
        assertEquals(3, subject.winnow7(2));
    }

    @Test
    void saturatesAtTheCapDepth7() {
        BrambleRampart subject = new BrambleRampart();
        subject.winnow7(27);
        assertEquals(27, subject.winnow7(5));
    }

    @Test
    void ignoresNegativeValuesDepth7() {
        BrambleRampart subject = new BrambleRampart();
        subject.winnow7(3);
        assertEquals(3, subject.winnow7(-2));
        assertEquals(3, subject.quota7Value());
    }

    @Test
    void rejectsZeroDenominatorDrift8() {
        BrambleRampart subject = new BrambleRampart();
        assertThrows(ArithmeticException.class, () -> subject.anneal8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift8() {
        assertEquals(0.5, new BrambleRampart().anneal8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift8() {
        assertEquals(4.0, new BrambleRampart().anneal8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio9() {
        assertTrue(new BrambleRampart().hoist9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new BrambleRampart().hoist9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio9() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleRampart().hoist9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold10() {
        assertEquals("below", new BrambleRampart().tally10(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold10() {
        BrambleRampart subject = new BrambleRampart();
        assertEquals("lower-bound", subject.tally10(4));
        assertEquals("upper-bound", subject.tally10(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold10() {
        BrambleRampart subject = new BrambleRampart();
        assertEquals("within", subject.tally10(4 + 1));
        assertEquals("above", subject.tally10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight11() {
        BrambleRampart subject = new BrambleRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile11());
        }
        assertEquals(4, subject.depth11Count());
    }

    @Test
    void refusesOnceExhaustedWeight11() {
        BrambleRampart subject = new BrambleRampart();
        for (int i = 0; i < 4; i++) {
            subject.reconcile11();
        }
        assertFalse(subject.reconcile11());
    }

    @Test
    void accumulatesBelowTheCapCapacity12() {
        BrambleRampart subject = new BrambleRampart();
        assertEquals(1, subject.gauge12(1));
        assertEquals(3, subject.gauge12(2));
    }

    @Test
    void saturatesAtTheCapCapacity12() {
        BrambleRampart subject = new BrambleRampart();
        subject.gauge12(32);
        assertEquals(32, subject.gauge12(5));
    }

    @Test
    void ignoresNegativeValuesCapacity12() {
        BrambleRampart subject = new BrambleRampart();
        subject.gauge12(3);
        assertEquals(3, subject.gauge12(-2));
        assertEquals(3, subject.ratio12Value());
    }
}
