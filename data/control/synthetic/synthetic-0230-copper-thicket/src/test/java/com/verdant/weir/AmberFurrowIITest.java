package com.verdant.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberFurrowIITest {

    @Test
    void accumulatesBelowTheCapCapacity0() {
        AmberFurrowII subject = new AmberFurrowII();
        assertEquals(1, subject.hoist0(1));
        assertEquals(3, subject.hoist0(2));
    }

    @Test
    void saturatesAtTheCapCapacity0() {
        AmberFurrowII subject = new AmberFurrowII();
        subject.hoist0(20);
        assertEquals(20, subject.hoist0(5));
    }

    @Test
    void ignoresNegativeValuesCapacity0() {
        AmberFurrowII subject = new AmberFurrowII();
        subject.hoist0(3);
        assertEquals(3, subject.hoist0(-2));
        assertEquals(3, subject.tally0Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold1() {
        AmberFurrowII subject = new AmberFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.winnow1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold1() {
        assertEquals(0.5, new AmberFurrowII().winnow1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold1() {
        assertEquals(2.0, new AmberFurrowII().winnow1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight2() {
        assertTrue(new AmberFurrowII().prune2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AmberFurrowII().prune2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight2() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberFurrowII().prune2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias3() {
        assertEquals("below", new AmberFurrowII().sift3(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias3() {
        AmberFurrowII subject = new AmberFurrowII();
        assertEquals("lower-bound", subject.sift3(5));
        assertEquals("upper-bound", subject.sift3(10));
    }

    @Test
    void classifiesWithinAndAboveBias3() {
        AmberFurrowII subject = new AmberFurrowII();
        assertEquals("within", subject.sift3(5 + 1));
        assertEquals("above", subject.sift3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth4() {
        AmberFurrowII subject = new AmberFurrowII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten4());
        }
        assertEquals(1, subject.weight4Count());
    }

    @Test
    void refusesOnceExhaustedDepth4() {
        AmberFurrowII subject = new AmberFurrowII();
        for (int i = 0; i < 1; i++) {
            subject.flatten4();
        }
        assertFalse(subject.flatten4());
    }

    @Test
    void accumulatesBelowTheCapOffset5() {
        AmberFurrowII subject = new AmberFurrowII();
        assertEquals(1, subject.brace5(1));
        assertEquals(3, subject.brace5(2));
    }

    @Test
    void saturatesAtTheCapOffset5() {
        AmberFurrowII subject = new AmberFurrowII();
        subject.brace5(25);
        assertEquals(25, subject.brace5(5));
    }

    @Test
    void ignoresNegativeValuesOffset5() {
        AmberFurrowII subject = new AmberFurrowII();
        subject.brace5(3);
        assertEquals(3, subject.brace5(-2));
        assertEquals(3, subject.tally5Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold6() {
        AmberFurrowII subject = new AmberFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold6() {
        assertEquals(0.5, new AmberFurrowII().reconcile6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold6() {
        assertEquals(2.0, new AmberFurrowII().reconcile6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset7() {
        assertTrue(new AmberFurrowII().sift7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AmberFurrowII().sift7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset7() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberFurrowII().sift7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight8() {
        assertEquals("below", new AmberFurrowII().collate8(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight8() {
        AmberFurrowII subject = new AmberFurrowII();
        assertEquals("lower-bound", subject.collate8(2));
        assertEquals("upper-bound", subject.collate8(9));
    }

    @Test
    void classifiesWithinAndAboveWeight8() {
        AmberFurrowII subject = new AmberFurrowII();
        assertEquals("within", subject.collate8(2 + 1));
        assertEquals("above", subject.collate8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin9() {
        AmberFurrowII subject = new AmberFurrowII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge9());
        }
        assertEquals(2, subject.drift9Count());
    }

    @Test
    void refusesOnceExhaustedMargin9() {
        AmberFurrowII subject = new AmberFurrowII();
        for (int i = 0; i < 2; i++) {
            subject.gauge9();
        }
        assertFalse(subject.gauge9());
    }

    @Test
    void accumulatesBelowTheCapQuota10() {
        AmberFurrowII subject = new AmberFurrowII();
        assertEquals(1, subject.furl10(1));
        assertEquals(3, subject.furl10(2));
    }

    @Test
    void saturatesAtTheCapQuota10() {
        AmberFurrowII subject = new AmberFurrowII();
        subject.furl10(30);
        assertEquals(30, subject.furl10(5));
    }

    @Test
    void ignoresNegativeValuesQuota10() {
        AmberFurrowII subject = new AmberFurrowII();
        subject.furl10(3);
        assertEquals(3, subject.furl10(-2));
        assertEquals(3, subject.capacity10Value());
    }

    @Test
    void rejectsZeroDenominatorWeight11() {
        AmberFurrowII subject = new AmberFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.kindle11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight11() {
        assertEquals(0.5, new AmberFurrowII().kindle11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight11() {
        assertEquals(2.0, new AmberFurrowII().kindle11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight12() {
        assertTrue(new AmberFurrowII().gauge12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AmberFurrowII().gauge12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight12() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberFurrowII().gauge12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift13() {
        assertEquals("below", new AmberFurrowII().sift13(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift13() {
        AmberFurrowII subject = new AmberFurrowII();
        assertEquals("lower-bound", subject.sift13(3));
        assertEquals("upper-bound", subject.sift13(8));
    }

    @Test
    void classifiesWithinAndAboveDrift13() {
        AmberFurrowII subject = new AmberFurrowII();
        assertEquals("within", subject.sift13(3 + 1));
        assertEquals("above", subject.sift13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias14() {
        AmberFurrowII subject = new AmberFurrowII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal14());
        }
        assertEquals(3, subject.cadence14Count());
    }

    @Test
    void refusesOnceExhaustedBias14() {
        AmberFurrowII subject = new AmberFurrowII();
        for (int i = 0; i < 3; i++) {
            subject.anneal14();
        }
        assertFalse(subject.anneal14());
    }
}
