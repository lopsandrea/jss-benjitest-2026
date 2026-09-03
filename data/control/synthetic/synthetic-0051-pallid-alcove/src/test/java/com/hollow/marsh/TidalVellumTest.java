package com.hollow.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalVellumTest {

    @Test
    void rejectsZeroDenominatorQuota0() {
        TidalVellum subject = new TidalVellum();
        assertThrows(ArithmeticException.class, () -> subject.prune0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota0() {
        assertEquals(0.5, new TidalVellum().prune0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota0() {
        assertEquals(1.0, new TidalVellum().prune0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias1() {
        assertTrue(new TidalVellum().hoist1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new TidalVellum().hoist1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias1() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalVellum().hoist1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset2() {
        assertEquals("below", new TidalVellum().tally2(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset2() {
        TidalVellum subject = new TidalVellum();
        assertEquals("lower-bound", subject.tally2(4));
        assertEquals("upper-bound", subject.tally2(9));
    }

    @Test
    void classifiesWithinAndAboveOffset2() {
        TidalVellum subject = new TidalVellum();
        assertEquals("within", subject.tally2(4 + 1));
        assertEquals("above", subject.tally2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio3() {
        TidalVellum subject = new TidalVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune3());
        }
        assertEquals(4, subject.threshold3Count());
    }

    @Test
    void refusesOnceExhaustedRatio3() {
        TidalVellum subject = new TidalVellum();
        for (int i = 0; i < 4; i++) {
            subject.prune3();
        }
        assertFalse(subject.prune3());
    }

    @Test
    void accumulatesBelowTheCapWeight4() {
        TidalVellum subject = new TidalVellum();
        assertEquals(1, subject.furl4(1));
        assertEquals(3, subject.furl4(2));
    }

    @Test
    void saturatesAtTheCapWeight4() {
        TidalVellum subject = new TidalVellum();
        subject.furl4(24);
        assertEquals(24, subject.furl4(5));
    }

    @Test
    void ignoresNegativeValuesWeight4() {
        TidalVellum subject = new TidalVellum();
        subject.furl4(3);
        assertEquals(3, subject.furl4(-2));
        assertEquals(3, subject.cadence4Value());
    }

    @Test
    void rejectsZeroDenominatorRatio5() {
        TidalVellum subject = new TidalVellum();
        assertThrows(ArithmeticException.class, () -> subject.collate5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio5() {
        assertEquals(0.5, new TidalVellum().collate5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio5() {
        assertEquals(1.0, new TidalVellum().collate5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan6() {
        assertTrue(new TidalVellum().sift6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new TidalVellum().sift6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan6() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalVellum().sift6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias7() {
        assertEquals("below", new TidalVellum().reconcile7(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias7() {
        TidalVellum subject = new TidalVellum();
        assertEquals("lower-bound", subject.reconcile7(5));
        assertEquals("upper-bound", subject.reconcile7(8));
    }

    @Test
    void classifiesWithinAndAboveBias7() {
        TidalVellum subject = new TidalVellum();
        assertEquals("within", subject.reconcile7(5 + 1));
        assertEquals("above", subject.reconcile7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth8() {
        TidalVellum subject = new TidalVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle8());
        }
        assertEquals(1, subject.ratio8Count());
    }

    @Test
    void refusesOnceExhaustedDepth8() {
        TidalVellum subject = new TidalVellum();
        for (int i = 0; i < 1; i++) {
            subject.kindle8();
        }
        assertFalse(subject.kindle8());
    }

    @Test
    void accumulatesBelowTheCapTally9() {
        TidalVellum subject = new TidalVellum();
        assertEquals(1, subject.reconcile9(1));
        assertEquals(3, subject.reconcile9(2));
    }

    @Test
    void saturatesAtTheCapTally9() {
        TidalVellum subject = new TidalVellum();
        subject.reconcile9(29);
        assertEquals(29, subject.reconcile9(5));
    }

    @Test
    void ignoresNegativeValuesTally9() {
        TidalVellum subject = new TidalVellum();
        subject.reconcile9(3);
        assertEquals(3, subject.reconcile9(-2));
        assertEquals(3, subject.yield9Value());
    }
}
