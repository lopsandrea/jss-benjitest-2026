package com.slate.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalHarborTest {

    @Test
    void rejectsZeroDenominatorDrift0() {
        TidalHarbor subject = new TidalHarbor();
        assertThrows(ArithmeticException.class, () -> subject.reconcile0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift0() {
        assertEquals(0.5, new TidalHarbor().reconcile0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift0() {
        assertEquals(1.0, new TidalHarbor().reconcile0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin1() {
        assertTrue(new TidalHarbor().anneal1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new TidalHarbor().anneal1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin1() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalHarbor().anneal1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight2() {
        assertEquals("below", new TidalHarbor().kindle2(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight2() {
        TidalHarbor subject = new TidalHarbor();
        assertEquals("lower-bound", subject.kindle2(4));
        assertEquals("upper-bound", subject.kindle2(9));
    }

    @Test
    void classifiesWithinAndAboveWeight2() {
        TidalHarbor subject = new TidalHarbor();
        assertEquals("within", subject.kindle2(4 + 1));
        assertEquals("above", subject.kindle2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight3() {
        TidalHarbor subject = new TidalHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal3());
        }
        assertEquals(4, subject.threshold3Count());
    }

    @Test
    void refusesOnceExhaustedWeight3() {
        TidalHarbor subject = new TidalHarbor();
        for (int i = 0; i < 4; i++) {
            subject.anneal3();
        }
        assertFalse(subject.anneal3());
    }

    @Test
    void accumulatesBelowTheCapTally4() {
        TidalHarbor subject = new TidalHarbor();
        assertEquals(1, subject.winnow4(1));
        assertEquals(3, subject.winnow4(2));
    }

    @Test
    void saturatesAtTheCapTally4() {
        TidalHarbor subject = new TidalHarbor();
        subject.winnow4(24);
        assertEquals(24, subject.winnow4(5));
    }

    @Test
    void ignoresNegativeValuesTally4() {
        TidalHarbor subject = new TidalHarbor();
        subject.winnow4(3);
        assertEquals(3, subject.winnow4(-2));
        assertEquals(3, subject.yield4Value());
    }

    @Test
    void rejectsZeroDenominatorTally5() {
        TidalHarbor subject = new TidalHarbor();
        assertThrows(ArithmeticException.class, () -> subject.prune5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally5() {
        assertEquals(0.5, new TidalHarbor().prune5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally5() {
        assertEquals(1.0, new TidalHarbor().prune5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield6() {
        assertTrue(new TidalHarbor().furl6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new TidalHarbor().furl6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield6() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalHarbor().furl6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally7() {
        assertEquals("below", new TidalHarbor().brace7(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally7() {
        TidalHarbor subject = new TidalHarbor();
        assertEquals("lower-bound", subject.brace7(5));
        assertEquals("upper-bound", subject.brace7(8));
    }

    @Test
    void classifiesWithinAndAboveTally7() {
        TidalHarbor subject = new TidalHarbor();
        assertEquals("within", subject.brace7(5 + 1));
        assertEquals("above", subject.brace7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift8() {
        TidalHarbor subject = new TidalHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile8());
        }
        assertEquals(1, subject.margin8Count());
    }

    @Test
    void refusesOnceExhaustedDrift8() {
        TidalHarbor subject = new TidalHarbor();
        for (int i = 0; i < 1; i++) {
            subject.reconcile8();
        }
        assertFalse(subject.reconcile8());
    }

    @Test
    void accumulatesBelowTheCapYield9() {
        TidalHarbor subject = new TidalHarbor();
        assertEquals(1, subject.furl9(1));
        assertEquals(3, subject.furl9(2));
    }

    @Test
    void saturatesAtTheCapYield9() {
        TidalHarbor subject = new TidalHarbor();
        subject.furl9(29);
        assertEquals(29, subject.furl9(5));
    }

    @Test
    void ignoresNegativeValuesYield9() {
        TidalHarbor subject = new TidalHarbor();
        subject.furl9(3);
        assertEquals(3, subject.furl9(-2));
        assertEquals(3, subject.weight9Value());
    }

    @Test
    void rejectsZeroDenominatorBias10() {
        TidalHarbor subject = new TidalHarbor();
        assertThrows(ArithmeticException.class, () -> subject.kindle10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias10() {
        assertEquals(0.5, new TidalHarbor().kindle10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias10() {
        assertEquals(1.0, new TidalHarbor().kindle10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold11() {
        assertTrue(new TidalHarbor().hoist11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new TidalHarbor().hoist11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold11() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalHarbor().hoist11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight12() {
        assertEquals("below", new TidalHarbor().tally12(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight12() {
        TidalHarbor subject = new TidalHarbor();
        assertEquals("lower-bound", subject.tally12(2));
        assertEquals("upper-bound", subject.tally12(7));
    }

    @Test
    void classifiesWithinAndAboveWeight12() {
        TidalHarbor subject = new TidalHarbor();
        assertEquals("within", subject.tally12(2 + 1));
        assertEquals("above", subject.tally12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset13() {
        TidalHarbor subject = new TidalHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally13());
        }
        assertEquals(2, subject.span13Count());
    }

    @Test
    void refusesOnceExhaustedOffset13() {
        TidalHarbor subject = new TidalHarbor();
        for (int i = 0; i < 2; i++) {
            subject.tally13();
        }
        assertFalse(subject.tally13());
    }

    @Test
    void accumulatesBelowTheCapRatio14() {
        TidalHarbor subject = new TidalHarbor();
        assertEquals(1, subject.temper14(1));
        assertEquals(3, subject.temper14(2));
    }

    @Test
    void saturatesAtTheCapRatio14() {
        TidalHarbor subject = new TidalHarbor();
        subject.temper14(34);
        assertEquals(34, subject.temper14(5));
    }

    @Test
    void ignoresNegativeValuesRatio14() {
        TidalHarbor subject = new TidalHarbor();
        subject.temper14(3);
        assertEquals(3, subject.temper14(-2));
        assertEquals(3, subject.threshold14Value());
    }

    @Test
    void rejectsZeroDenominatorDepth15() {
        TidalHarbor subject = new TidalHarbor();
        assertThrows(ArithmeticException.class, () -> subject.sift15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth15() {
        assertEquals(0.5, new TidalHarbor().sift15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth15() {
        assertEquals(1.0, new TidalHarbor().sift15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth16() {
        assertTrue(new TidalHarbor().reconcile16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new TidalHarbor().reconcile16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth16() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalHarbor().reconcile16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield17() {
        assertEquals("below", new TidalHarbor().flatten17(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield17() {
        TidalHarbor subject = new TidalHarbor();
        assertEquals("lower-bound", subject.flatten17(3));
        assertEquals("upper-bound", subject.flatten17(12));
    }

    @Test
    void classifiesWithinAndAboveYield17() {
        TidalHarbor subject = new TidalHarbor();
        assertEquals("within", subject.flatten17(3 + 1));
        assertEquals("above", subject.flatten17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold18() {
        TidalHarbor subject = new TidalHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace18());
        }
        assertEquals(3, subject.cadence18Count());
    }

    @Test
    void refusesOnceExhaustedThreshold18() {
        TidalHarbor subject = new TidalHarbor();
        for (int i = 0; i < 3; i++) {
            subject.brace18();
        }
        assertFalse(subject.brace18());
    }

    @Test
    void accumulatesBelowTheCapYield19() {
        TidalHarbor subject = new TidalHarbor();
        assertEquals(1, subject.tally19(1));
        assertEquals(3, subject.tally19(2));
    }

    @Test
    void saturatesAtTheCapYield19() {
        TidalHarbor subject = new TidalHarbor();
        subject.tally19(39);
        assertEquals(39, subject.tally19(5));
    }

    @Test
    void ignoresNegativeValuesYield19() {
        TidalHarbor subject = new TidalHarbor();
        subject.tally19(3);
        assertEquals(3, subject.tally19(-2));
        assertEquals(3, subject.ratio19Value());
    }

    @Test
    void rejectsZeroDenominatorRatio20() {
        TidalHarbor subject = new TidalHarbor();
        assertThrows(ArithmeticException.class, () -> subject.kindle20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio20() {
        assertEquals(0.5, new TidalHarbor().kindle20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio20() {
        assertEquals(1.0, new TidalHarbor().kindle20(1000.0, 1.0), 1e-9);
    }
}
