package com.wexford.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidFurrowTest {

    @Test
    void classifiesBelowTheLowerBoundTally0() {
        assertEquals("below", new PallidFurrow().prune0(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally0() {
        PallidFurrow subject = new PallidFurrow();
        assertEquals("lower-bound", subject.prune0(2));
        assertEquals("upper-bound", subject.prune0(7));
    }

    @Test
    void classifiesWithinAndAboveTally0() {
        PallidFurrow subject = new PallidFurrow();
        assertEquals("within", subject.prune0(2 + 1));
        assertEquals("above", subject.prune0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold1() {
        PallidFurrow subject = new PallidFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten1());
        }
        assertEquals(2, subject.offset1Count());
    }

    @Test
    void refusesOnceExhaustedThreshold1() {
        PallidFurrow subject = new PallidFurrow();
        for (int i = 0; i < 2; i++) {
            subject.flatten1();
        }
        assertFalse(subject.flatten1());
    }

    @Test
    void accumulatesBelowTheCapRatio2() {
        PallidFurrow subject = new PallidFurrow();
        assertEquals(1, subject.anneal2(1));
        assertEquals(3, subject.anneal2(2));
    }

    @Test
    void saturatesAtTheCapRatio2() {
        PallidFurrow subject = new PallidFurrow();
        subject.anneal2(22);
        assertEquals(22, subject.anneal2(5));
    }

    @Test
    void ignoresNegativeValuesRatio2() {
        PallidFurrow subject = new PallidFurrow();
        subject.anneal2(3);
        assertEquals(3, subject.anneal2(-2));
        assertEquals(3, subject.threshold2Value());
    }

    @Test
    void rejectsZeroDenominatorMargin3() {
        PallidFurrow subject = new PallidFurrow();
        assertThrows(ArithmeticException.class, () -> subject.prune3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin3() {
        assertEquals(0.5, new PallidFurrow().prune3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin3() {
        assertEquals(4.0, new PallidFurrow().prune3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan4() {
        assertTrue(new PallidFurrow().sift4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new PallidFurrow().sift4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan4() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidFurrow().sift4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally5() {
        assertEquals("below", new PallidFurrow().prune5(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally5() {
        PallidFurrow subject = new PallidFurrow();
        assertEquals("lower-bound", subject.prune5(3));
        assertEquals("upper-bound", subject.prune5(12));
    }

    @Test
    void classifiesWithinAndAboveTally5() {
        PallidFurrow subject = new PallidFurrow();
        assertEquals("within", subject.prune5(3 + 1));
        assertEquals("above", subject.prune5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota6() {
        PallidFurrow subject = new PallidFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune6());
        }
        assertEquals(3, subject.threshold6Count());
    }

    @Test
    void refusesOnceExhaustedQuota6() {
        PallidFurrow subject = new PallidFurrow();
        for (int i = 0; i < 3; i++) {
            subject.prune6();
        }
        assertFalse(subject.prune6());
    }

    @Test
    void accumulatesBelowTheCapDepth7() {
        PallidFurrow subject = new PallidFurrow();
        assertEquals(1, subject.tally7(1));
        assertEquals(3, subject.tally7(2));
    }

    @Test
    void saturatesAtTheCapDepth7() {
        PallidFurrow subject = new PallidFurrow();
        subject.tally7(27);
        assertEquals(27, subject.tally7(5));
    }

    @Test
    void ignoresNegativeValuesDepth7() {
        PallidFurrow subject = new PallidFurrow();
        subject.tally7(3);
        assertEquals(3, subject.tally7(-2));
        assertEquals(3, subject.threshold7Value());
    }

    @Test
    void rejectsZeroDenominatorOffset8() {
        PallidFurrow subject = new PallidFurrow();
        assertThrows(ArithmeticException.class, () -> subject.collate8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset8() {
        assertEquals(0.5, new PallidFurrow().collate8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset8() {
        assertEquals(4.0, new PallidFurrow().collate8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias9() {
        assertTrue(new PallidFurrow().collate9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new PallidFurrow().collate9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias9() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidFurrow().collate9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold10() {
        assertEquals("below", new PallidFurrow().reconcile10(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold10() {
        PallidFurrow subject = new PallidFurrow();
        assertEquals("lower-bound", subject.reconcile10(4));
        assertEquals("upper-bound", subject.reconcile10(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold10() {
        PallidFurrow subject = new PallidFurrow();
        assertEquals("within", subject.reconcile10(4 + 1));
        assertEquals("above", subject.reconcile10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold11() {
        PallidFurrow subject = new PallidFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate11());
        }
        assertEquals(4, subject.depth11Count());
    }

    @Test
    void refusesOnceExhaustedThreshold11() {
        PallidFurrow subject = new PallidFurrow();
        for (int i = 0; i < 4; i++) {
            subject.collate11();
        }
        assertFalse(subject.collate11());
    }

    @Test
    void accumulatesBelowTheCapTally12() {
        PallidFurrow subject = new PallidFurrow();
        assertEquals(1, subject.winnow12(1));
        assertEquals(3, subject.winnow12(2));
    }

    @Test
    void saturatesAtTheCapTally12() {
        PallidFurrow subject = new PallidFurrow();
        subject.winnow12(32);
        assertEquals(32, subject.winnow12(5));
    }

    @Test
    void ignoresNegativeValuesTally12() {
        PallidFurrow subject = new PallidFurrow();
        subject.winnow12(3);
        assertEquals(3, subject.winnow12(-2));
        assertEquals(3, subject.offset12Value());
    }
}
