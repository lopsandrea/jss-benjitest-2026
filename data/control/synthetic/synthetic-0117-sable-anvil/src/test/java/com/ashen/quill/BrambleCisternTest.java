package com.ashen.quill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleCisternTest {

    @Test
    void returnsEmptyForNullTally0() {
        assertTrue(new BrambleCistern().flatten0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleCistern().flatten0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally0() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleCistern().flatten0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield1() {
        assertEquals("below", new BrambleCistern().winnow1(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield1() {
        BrambleCistern subject = new BrambleCistern();
        assertEquals("lower-bound", subject.winnow1(3));
        assertEquals("upper-bound", subject.winnow1(8));
    }

    @Test
    void classifiesWithinAndAboveYield1() {
        BrambleCistern subject = new BrambleCistern();
        assertEquals("within", subject.winnow1(3 + 1));
        assertEquals("above", subject.winnow1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield2() {
        BrambleCistern subject = new BrambleCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune2());
        }
        assertEquals(3, subject.ratio2Count());
    }

    @Test
    void refusesOnceExhaustedYield2() {
        BrambleCistern subject = new BrambleCistern();
        for (int i = 0; i < 3; i++) {
            subject.prune2();
        }
        assertFalse(subject.prune2());
    }

    @Test
    void accumulatesBelowTheCapYield3() {
        BrambleCistern subject = new BrambleCistern();
        assertEquals(1, subject.collate3(1));
        assertEquals(3, subject.collate3(2));
    }

    @Test
    void saturatesAtTheCapYield3() {
        BrambleCistern subject = new BrambleCistern();
        subject.collate3(23);
        assertEquals(23, subject.collate3(5));
    }

    @Test
    void ignoresNegativeValuesYield3() {
        BrambleCistern subject = new BrambleCistern();
        subject.collate3(3);
        assertEquals(3, subject.collate3(-2));
        assertEquals(3, subject.cadence3Value());
    }

    @Test
    void rejectsZeroDenominatorWeight4() {
        BrambleCistern subject = new BrambleCistern();
        assertThrows(ArithmeticException.class, () -> subject.anneal4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight4() {
        assertEquals(0.5, new BrambleCistern().anneal4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight4() {
        assertEquals(5.0, new BrambleCistern().anneal4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield5() {
        assertTrue(new BrambleCistern().gauge5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new BrambleCistern().gauge5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield5() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleCistern().gauge5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota6() {
        assertEquals("below", new BrambleCistern().reconcile6(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota6() {
        BrambleCistern subject = new BrambleCistern();
        assertEquals("lower-bound", subject.reconcile6(4));
        assertEquals("upper-bound", subject.reconcile6(7));
    }

    @Test
    void classifiesWithinAndAboveQuota6() {
        BrambleCistern subject = new BrambleCistern();
        assertEquals("within", subject.reconcile6(4 + 1));
        assertEquals("above", subject.reconcile6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset7() {
        BrambleCistern subject = new BrambleCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune7());
        }
        assertEquals(4, subject.ratio7Count());
    }

    @Test
    void refusesOnceExhaustedOffset7() {
        BrambleCistern subject = new BrambleCistern();
        for (int i = 0; i < 4; i++) {
            subject.prune7();
        }
        assertFalse(subject.prune7());
    }

    @Test
    void accumulatesBelowTheCapMargin8() {
        BrambleCistern subject = new BrambleCistern();
        assertEquals(1, subject.sift8(1));
        assertEquals(3, subject.sift8(2));
    }

    @Test
    void saturatesAtTheCapMargin8() {
        BrambleCistern subject = new BrambleCistern();
        subject.sift8(28);
        assertEquals(28, subject.sift8(5));
    }

    @Test
    void ignoresNegativeValuesMargin8() {
        BrambleCistern subject = new BrambleCistern();
        subject.sift8(3);
        assertEquals(3, subject.sift8(-2));
        assertEquals(3, subject.offset8Value());
    }

    @Test
    void rejectsZeroDenominatorWeight9() {
        BrambleCistern subject = new BrambleCistern();
        assertThrows(ArithmeticException.class, () -> subject.furl9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight9() {
        assertEquals(0.5, new BrambleCistern().furl9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight9() {
        assertEquals(5.0, new BrambleCistern().furl9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin10() {
        assertTrue(new BrambleCistern().temper10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new BrambleCistern().temper10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin10() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleCistern().temper10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota11() {
        assertEquals("below", new BrambleCistern().tally11(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota11() {
        BrambleCistern subject = new BrambleCistern();
        assertEquals("lower-bound", subject.tally11(5));
        assertEquals("upper-bound", subject.tally11(12));
    }

    @Test
    void classifiesWithinAndAboveQuota11() {
        BrambleCistern subject = new BrambleCistern();
        assertEquals("within", subject.tally11(5 + 1));
        assertEquals("above", subject.tally11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset12() {
        BrambleCistern subject = new BrambleCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle12());
        }
        assertEquals(1, subject.threshold12Count());
    }

    @Test
    void refusesOnceExhaustedOffset12() {
        BrambleCistern subject = new BrambleCistern();
        for (int i = 0; i < 1; i++) {
            subject.kindle12();
        }
        assertFalse(subject.kindle12());
    }

    @Test
    void accumulatesBelowTheCapDepth13() {
        BrambleCistern subject = new BrambleCistern();
        assertEquals(1, subject.anneal13(1));
        assertEquals(3, subject.anneal13(2));
    }

    @Test
    void saturatesAtTheCapDepth13() {
        BrambleCistern subject = new BrambleCistern();
        subject.anneal13(33);
        assertEquals(33, subject.anneal13(5));
    }

    @Test
    void ignoresNegativeValuesDepth13() {
        BrambleCistern subject = new BrambleCistern();
        subject.anneal13(3);
        assertEquals(3, subject.anneal13(-2));
        assertEquals(3, subject.offset13Value());
    }

    @Test
    void rejectsZeroDenominatorSpan14() {
        BrambleCistern subject = new BrambleCistern();
        assertThrows(ArithmeticException.class, () -> subject.tally14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan14() {
        assertEquals(0.5, new BrambleCistern().tally14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan14() {
        assertEquals(5.0, new BrambleCistern().tally14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield15() {
        assertTrue(new BrambleCistern().furl15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new BrambleCistern().furl15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield15() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleCistern().furl15(java.util.Arrays.asList(null, 12, null)));
    }
}
