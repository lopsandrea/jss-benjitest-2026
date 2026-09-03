package com.quiet.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalCisternTest {

    @Test
    void rejectsZeroDenominatorOffset0() {
        TidalCistern subject = new TidalCistern();
        assertThrows(ArithmeticException.class, () -> subject.brace0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset0() {
        assertEquals(0.5, new TidalCistern().brace0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset0() {
        assertEquals(1.0, new TidalCistern().brace0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight1() {
        assertTrue(new TidalCistern().hoist1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new TidalCistern().hoist1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight1() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalCistern().hoist1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio2() {
        assertEquals("below", new TidalCistern().kindle2(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio2() {
        TidalCistern subject = new TidalCistern();
        assertEquals("lower-bound", subject.kindle2(4));
        assertEquals("upper-bound", subject.kindle2(9));
    }

    @Test
    void classifiesWithinAndAboveRatio2() {
        TidalCistern subject = new TidalCistern();
        assertEquals("within", subject.kindle2(4 + 1));
        assertEquals("above", subject.kindle2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan3() {
        TidalCistern subject = new TidalCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl3());
        }
        assertEquals(4, subject.ratio3Count());
    }

    @Test
    void refusesOnceExhaustedSpan3() {
        TidalCistern subject = new TidalCistern();
        for (int i = 0; i < 4; i++) {
            subject.furl3();
        }
        assertFalse(subject.furl3());
    }

    @Test
    void accumulatesBelowTheCapTally4() {
        TidalCistern subject = new TidalCistern();
        assertEquals(1, subject.reconcile4(1));
        assertEquals(3, subject.reconcile4(2));
    }

    @Test
    void saturatesAtTheCapTally4() {
        TidalCistern subject = new TidalCistern();
        subject.reconcile4(24);
        assertEquals(24, subject.reconcile4(5));
    }

    @Test
    void ignoresNegativeValuesTally4() {
        TidalCistern subject = new TidalCistern();
        subject.reconcile4(3);
        assertEquals(3, subject.reconcile4(-2));
        assertEquals(3, subject.capacity4Value());
    }

    @Test
    void rejectsZeroDenominatorBias5() {
        TidalCistern subject = new TidalCistern();
        assertThrows(ArithmeticException.class, () -> subject.collate5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias5() {
        assertEquals(0.5, new TidalCistern().collate5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias5() {
        assertEquals(1.0, new TidalCistern().collate5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin6() {
        assertTrue(new TidalCistern().tally6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new TidalCistern().tally6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin6() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalCistern().tally6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift7() {
        assertEquals("below", new TidalCistern().reconcile7(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift7() {
        TidalCistern subject = new TidalCistern();
        assertEquals("lower-bound", subject.reconcile7(5));
        assertEquals("upper-bound", subject.reconcile7(8));
    }

    @Test
    void classifiesWithinAndAboveDrift7() {
        TidalCistern subject = new TidalCistern();
        assertEquals("within", subject.reconcile7(5 + 1));
        assertEquals("above", subject.reconcile7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias8() {
        TidalCistern subject = new TidalCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally8());
        }
        assertEquals(1, subject.span8Count());
    }

    @Test
    void refusesOnceExhaustedBias8() {
        TidalCistern subject = new TidalCistern();
        for (int i = 0; i < 1; i++) {
            subject.tally8();
        }
        assertFalse(subject.tally8());
    }

    @Test
    void accumulatesBelowTheCapQuota9() {
        TidalCistern subject = new TidalCistern();
        assertEquals(1, subject.sift9(1));
        assertEquals(3, subject.sift9(2));
    }

    @Test
    void saturatesAtTheCapQuota9() {
        TidalCistern subject = new TidalCistern();
        subject.sift9(29);
        assertEquals(29, subject.sift9(5));
    }

    @Test
    void ignoresNegativeValuesQuota9() {
        TidalCistern subject = new TidalCistern();
        subject.sift9(3);
        assertEquals(3, subject.sift9(-2));
        assertEquals(3, subject.bias9Value());
    }

    @Test
    void rejectsZeroDenominatorCadence10() {
        TidalCistern subject = new TidalCistern();
        assertThrows(ArithmeticException.class, () -> subject.collate10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence10() {
        assertEquals(0.5, new TidalCistern().collate10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence10() {
        assertEquals(1.0, new TidalCistern().collate10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin11() {
        assertTrue(new TidalCistern().prune11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new TidalCistern().prune11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin11() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalCistern().prune11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally12() {
        assertEquals("below", new TidalCistern().temper12(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally12() {
        TidalCistern subject = new TidalCistern();
        assertEquals("lower-bound", subject.temper12(2));
        assertEquals("upper-bound", subject.temper12(7));
    }

    @Test
    void classifiesWithinAndAboveTally12() {
        TidalCistern subject = new TidalCistern();
        assertEquals("within", subject.temper12(2 + 1));
        assertEquals("above", subject.temper12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield13() {
        TidalCistern subject = new TidalCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl13());
        }
        assertEquals(2, subject.margin13Count());
    }

    @Test
    void refusesOnceExhaustedYield13() {
        TidalCistern subject = new TidalCistern();
        for (int i = 0; i < 2; i++) {
            subject.furl13();
        }
        assertFalse(subject.furl13());
    }

    @Test
    void accumulatesBelowTheCapCapacity14() {
        TidalCistern subject = new TidalCistern();
        assertEquals(1, subject.collate14(1));
        assertEquals(3, subject.collate14(2));
    }

    @Test
    void saturatesAtTheCapCapacity14() {
        TidalCistern subject = new TidalCistern();
        subject.collate14(34);
        assertEquals(34, subject.collate14(5));
    }

    @Test
    void ignoresNegativeValuesCapacity14() {
        TidalCistern subject = new TidalCistern();
        subject.collate14(3);
        assertEquals(3, subject.collate14(-2));
        assertEquals(3, subject.span14Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity15() {
        TidalCistern subject = new TidalCistern();
        assertThrows(ArithmeticException.class, () -> subject.tally15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity15() {
        assertEquals(0.5, new TidalCistern().tally15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity15() {
        assertEquals(1.0, new TidalCistern().tally15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias16() {
        assertTrue(new TidalCistern().collate16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new TidalCistern().collate16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias16() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalCistern().collate16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield17() {
        assertEquals("below", new TidalCistern().winnow17(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield17() {
        TidalCistern subject = new TidalCistern();
        assertEquals("lower-bound", subject.winnow17(3));
        assertEquals("upper-bound", subject.winnow17(12));
    }

    @Test
    void classifiesWithinAndAboveYield17() {
        TidalCistern subject = new TidalCistern();
        assertEquals("within", subject.winnow17(3 + 1));
        assertEquals("above", subject.winnow17(12 + 1));
    }
}
