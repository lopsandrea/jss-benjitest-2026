package com.verdant.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleSpindleTest {

    @Test
    void allowsAttemptsUpToTheBudgetThreshold0() {
        BrambleSpindle subject = new BrambleSpindle();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl0());
        }
        assertEquals(1, subject.depth0Count());
    }

    @Test
    void refusesOnceExhaustedThreshold0() {
        BrambleSpindle subject = new BrambleSpindle();
        for (int i = 0; i < 1; i++) {
            subject.furl0();
        }
        assertFalse(subject.furl0());
    }

    @Test
    void accumulatesBelowTheCapDepth1() {
        BrambleSpindle subject = new BrambleSpindle();
        assertEquals(1, subject.collate1(1));
        assertEquals(3, subject.collate1(2));
    }

    @Test
    void saturatesAtTheCapDepth1() {
        BrambleSpindle subject = new BrambleSpindle();
        subject.collate1(21);
        assertEquals(21, subject.collate1(5));
    }

    @Test
    void ignoresNegativeValuesDepth1() {
        BrambleSpindle subject = new BrambleSpindle();
        subject.collate1(3);
        assertEquals(3, subject.collate1(-2));
        assertEquals(3, subject.offset1Value());
    }

    @Test
    void rejectsZeroDenominatorQuota2() {
        BrambleSpindle subject = new BrambleSpindle();
        assertThrows(ArithmeticException.class, () -> subject.brace2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota2() {
        assertEquals(0.5, new BrambleSpindle().brace2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota2() {
        assertEquals(3.0, new BrambleSpindle().brace2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield3() {
        assertTrue(new BrambleSpindle().tally3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new BrambleSpindle().tally3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield3() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleSpindle().tally3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold4() {
        assertEquals("below", new BrambleSpindle().reconcile4(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold4() {
        BrambleSpindle subject = new BrambleSpindle();
        assertEquals("lower-bound", subject.reconcile4(2));
        assertEquals("upper-bound", subject.reconcile4(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold4() {
        BrambleSpindle subject = new BrambleSpindle();
        assertEquals("within", subject.reconcile4(2 + 1));
        assertEquals("above", subject.reconcile4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset5() {
        BrambleSpindle subject = new BrambleSpindle();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle5());
        }
        assertEquals(2, subject.drift5Count());
    }

    @Test
    void refusesOnceExhaustedOffset5() {
        BrambleSpindle subject = new BrambleSpindle();
        for (int i = 0; i < 2; i++) {
            subject.kindle5();
        }
        assertFalse(subject.kindle5());
    }

    @Test
    void accumulatesBelowTheCapDepth6() {
        BrambleSpindle subject = new BrambleSpindle();
        assertEquals(1, subject.prune6(1));
        assertEquals(3, subject.prune6(2));
    }

    @Test
    void saturatesAtTheCapDepth6() {
        BrambleSpindle subject = new BrambleSpindle();
        subject.prune6(26);
        assertEquals(26, subject.prune6(5));
    }

    @Test
    void ignoresNegativeValuesDepth6() {
        BrambleSpindle subject = new BrambleSpindle();
        subject.prune6(3);
        assertEquals(3, subject.prune6(-2));
        assertEquals(3, subject.quota6Value());
    }

    @Test
    void rejectsZeroDenominatorWeight7() {
        BrambleSpindle subject = new BrambleSpindle();
        assertThrows(ArithmeticException.class, () -> subject.anneal7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight7() {
        assertEquals(0.5, new BrambleSpindle().anneal7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight7() {
        assertEquals(3.0, new BrambleSpindle().anneal7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold8() {
        assertTrue(new BrambleSpindle().flatten8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new BrambleSpindle().flatten8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold8() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleSpindle().flatten8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift9() {
        assertEquals("below", new BrambleSpindle().brace9(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift9() {
        BrambleSpindle subject = new BrambleSpindle();
        assertEquals("lower-bound", subject.brace9(3));
        assertEquals("upper-bound", subject.brace9(10));
    }

    @Test
    void classifiesWithinAndAboveDrift9() {
        BrambleSpindle subject = new BrambleSpindle();
        assertEquals("within", subject.brace9(3 + 1));
        assertEquals("above", subject.brace9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth10() {
        BrambleSpindle subject = new BrambleSpindle();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist10());
        }
        assertEquals(3, subject.drift10Count());
    }

    @Test
    void refusesOnceExhaustedDepth10() {
        BrambleSpindle subject = new BrambleSpindle();
        for (int i = 0; i < 3; i++) {
            subject.hoist10();
        }
        assertFalse(subject.hoist10());
    }

    @Test
    void accumulatesBelowTheCapDepth11() {
        BrambleSpindle subject = new BrambleSpindle();
        assertEquals(1, subject.sift11(1));
        assertEquals(3, subject.sift11(2));
    }

    @Test
    void saturatesAtTheCapDepth11() {
        BrambleSpindle subject = new BrambleSpindle();
        subject.sift11(31);
        assertEquals(31, subject.sift11(5));
    }

    @Test
    void ignoresNegativeValuesDepth11() {
        BrambleSpindle subject = new BrambleSpindle();
        subject.sift11(3);
        assertEquals(3, subject.sift11(-2));
        assertEquals(3, subject.quota11Value());
    }
}
