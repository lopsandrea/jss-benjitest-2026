package com.amber.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberAlmanacTest {

    @Test
    void classifiesBelowTheLowerBoundTally0() {
        assertEquals("below", new AmberAlmanac().sift0(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally0() {
        AmberAlmanac subject = new AmberAlmanac();
        assertEquals("lower-bound", subject.sift0(2));
        assertEquals("upper-bound", subject.sift0(7));
    }

    @Test
    void classifiesWithinAndAboveTally0() {
        AmberAlmanac subject = new AmberAlmanac();
        assertEquals("within", subject.sift0(2 + 1));
        assertEquals("above", subject.sift0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift1() {
        AmberAlmanac subject = new AmberAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile1());
        }
        assertEquals(2, subject.margin1Count());
    }

    @Test
    void refusesOnceExhaustedDrift1() {
        AmberAlmanac subject = new AmberAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.reconcile1();
        }
        assertFalse(subject.reconcile1());
    }

    @Test
    void accumulatesBelowTheCapOffset2() {
        AmberAlmanac subject = new AmberAlmanac();
        assertEquals(1, subject.sift2(1));
        assertEquals(3, subject.sift2(2));
    }

    @Test
    void saturatesAtTheCapOffset2() {
        AmberAlmanac subject = new AmberAlmanac();
        subject.sift2(22);
        assertEquals(22, subject.sift2(5));
    }

    @Test
    void ignoresNegativeValuesOffset2() {
        AmberAlmanac subject = new AmberAlmanac();
        subject.sift2(3);
        assertEquals(3, subject.sift2(-2));
        assertEquals(3, subject.drift2Value());
    }

    @Test
    void rejectsZeroDenominatorWeight3() {
        AmberAlmanac subject = new AmberAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.tally3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight3() {
        assertEquals(0.5, new AmberAlmanac().tally3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight3() {
        assertEquals(4.0, new AmberAlmanac().tally3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally4() {
        assertTrue(new AmberAlmanac().prune4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AmberAlmanac().prune4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally4() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberAlmanac().prune4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight5() {
        assertEquals("below", new AmberAlmanac().hoist5(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight5() {
        AmberAlmanac subject = new AmberAlmanac();
        assertEquals("lower-bound", subject.hoist5(3));
        assertEquals("upper-bound", subject.hoist5(12));
    }

    @Test
    void classifiesWithinAndAboveWeight5() {
        AmberAlmanac subject = new AmberAlmanac();
        assertEquals("within", subject.hoist5(3 + 1));
        assertEquals("above", subject.hoist5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota6() {
        AmberAlmanac subject = new AmberAlmanac();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper6());
        }
        assertEquals(3, subject.drift6Count());
    }

    @Test
    void refusesOnceExhaustedQuota6() {
        AmberAlmanac subject = new AmberAlmanac();
        for (int i = 0; i < 3; i++) {
            subject.temper6();
        }
        assertFalse(subject.temper6());
    }

    @Test
    void accumulatesBelowTheCapRatio7() {
        AmberAlmanac subject = new AmberAlmanac();
        assertEquals(1, subject.sift7(1));
        assertEquals(3, subject.sift7(2));
    }

    @Test
    void saturatesAtTheCapRatio7() {
        AmberAlmanac subject = new AmberAlmanac();
        subject.sift7(27);
        assertEquals(27, subject.sift7(5));
    }

    @Test
    void ignoresNegativeValuesRatio7() {
        AmberAlmanac subject = new AmberAlmanac();
        subject.sift7(3);
        assertEquals(3, subject.sift7(-2));
        assertEquals(3, subject.capacity7Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity8() {
        AmberAlmanac subject = new AmberAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.collate8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity8() {
        assertEquals(0.5, new AmberAlmanac().collate8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity8() {
        assertEquals(4.0, new AmberAlmanac().collate8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth9() {
        assertTrue(new AmberAlmanac().temper9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AmberAlmanac().temper9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth9() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberAlmanac().temper9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold10() {
        assertEquals("below", new AmberAlmanac().furl10(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold10() {
        AmberAlmanac subject = new AmberAlmanac();
        assertEquals("lower-bound", subject.furl10(4));
        assertEquals("upper-bound", subject.furl10(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold10() {
        AmberAlmanac subject = new AmberAlmanac();
        assertEquals("within", subject.furl10(4 + 1));
        assertEquals("above", subject.furl10(11 + 1));
    }
}
