package com.pallid.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleFurrowTest {

    @Test
    void rejectsZeroDenominatorCadence0() {
        BrambleFurrow subject = new BrambleFurrow();
        assertThrows(ArithmeticException.class, () -> subject.hoist0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence0() {
        assertEquals(0.5, new BrambleFurrow().hoist0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence0() {
        assertEquals(1.0, new BrambleFurrow().hoist0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield1() {
        assertTrue(new BrambleFurrow().winnow1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new BrambleFurrow().winnow1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield1() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleFurrow().winnow1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias2() {
        assertEquals("below", new BrambleFurrow().prune2(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias2() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals("lower-bound", subject.prune2(4));
        assertEquals("upper-bound", subject.prune2(9));
    }

    @Test
    void classifiesWithinAndAboveBias2() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals("within", subject.prune2(4 + 1));
        assertEquals("above", subject.prune2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio3() {
        BrambleFurrow subject = new BrambleFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift3());
        }
        assertEquals(4, subject.capacity3Count());
    }

    @Test
    void refusesOnceExhaustedRatio3() {
        BrambleFurrow subject = new BrambleFurrow();
        for (int i = 0; i < 4; i++) {
            subject.sift3();
        }
        assertFalse(subject.sift3());
    }

    @Test
    void accumulatesBelowTheCapCadence4() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals(1, subject.gauge4(1));
        assertEquals(3, subject.gauge4(2));
    }

    @Test
    void saturatesAtTheCapCadence4() {
        BrambleFurrow subject = new BrambleFurrow();
        subject.gauge4(24);
        assertEquals(24, subject.gauge4(5));
    }

    @Test
    void ignoresNegativeValuesCadence4() {
        BrambleFurrow subject = new BrambleFurrow();
        subject.gauge4(3);
        assertEquals(3, subject.gauge4(-2));
        assertEquals(3, subject.weight4Value());
    }

    @Test
    void rejectsZeroDenominatorSpan5() {
        BrambleFurrow subject = new BrambleFurrow();
        assertThrows(ArithmeticException.class, () -> subject.collate5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan5() {
        assertEquals(0.5, new BrambleFurrow().collate5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan5() {
        assertEquals(1.0, new BrambleFurrow().collate5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin6() {
        assertTrue(new BrambleFurrow().temper6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new BrambleFurrow().temper6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin6() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleFurrow().temper6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota7() {
        assertEquals("below", new BrambleFurrow().collate7(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota7() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals("lower-bound", subject.collate7(5));
        assertEquals("upper-bound", subject.collate7(8));
    }

    @Test
    void classifiesWithinAndAboveQuota7() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals("within", subject.collate7(5 + 1));
        assertEquals("above", subject.collate7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin8() {
        BrambleFurrow subject = new BrambleFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal8());
        }
        assertEquals(1, subject.cadence8Count());
    }

    @Test
    void refusesOnceExhaustedMargin8() {
        BrambleFurrow subject = new BrambleFurrow();
        for (int i = 0; i < 1; i++) {
            subject.anneal8();
        }
        assertFalse(subject.anneal8());
    }

    @Test
    void accumulatesBelowTheCapYield9() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals(1, subject.furl9(1));
        assertEquals(3, subject.furl9(2));
    }

    @Test
    void saturatesAtTheCapYield9() {
        BrambleFurrow subject = new BrambleFurrow();
        subject.furl9(29);
        assertEquals(29, subject.furl9(5));
    }

    @Test
    void ignoresNegativeValuesYield9() {
        BrambleFurrow subject = new BrambleFurrow();
        subject.furl9(3);
        assertEquals(3, subject.furl9(-2));
        assertEquals(3, subject.offset9Value());
    }

    @Test
    void rejectsZeroDenominatorTally10() {
        BrambleFurrow subject = new BrambleFurrow();
        assertThrows(ArithmeticException.class, () -> subject.prune10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally10() {
        assertEquals(0.5, new BrambleFurrow().prune10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally10() {
        assertEquals(1.0, new BrambleFurrow().prune10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota11() {
        assertTrue(new BrambleFurrow().hoist11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new BrambleFurrow().hoist11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota11() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleFurrow().hoist11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth12() {
        assertEquals("below", new BrambleFurrow().hoist12(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth12() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals("lower-bound", subject.hoist12(2));
        assertEquals("upper-bound", subject.hoist12(7));
    }

    @Test
    void classifiesWithinAndAboveDepth12() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals("within", subject.hoist12(2 + 1));
        assertEquals("above", subject.hoist12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally13() {
        BrambleFurrow subject = new BrambleFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl13());
        }
        assertEquals(2, subject.offset13Count());
    }

    @Test
    void refusesOnceExhaustedTally13() {
        BrambleFurrow subject = new BrambleFurrow();
        for (int i = 0; i < 2; i++) {
            subject.furl13();
        }
        assertFalse(subject.furl13());
    }

    @Test
    void accumulatesBelowTheCapYield14() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals(1, subject.furl14(1));
        assertEquals(3, subject.furl14(2));
    }

    @Test
    void saturatesAtTheCapYield14() {
        BrambleFurrow subject = new BrambleFurrow();
        subject.furl14(34);
        assertEquals(34, subject.furl14(5));
    }

    @Test
    void ignoresNegativeValuesYield14() {
        BrambleFurrow subject = new BrambleFurrow();
        subject.furl14(3);
        assertEquals(3, subject.furl14(-2));
        assertEquals(3, subject.cadence14Value());
    }

    @Test
    void rejectsZeroDenominatorYield15() {
        BrambleFurrow subject = new BrambleFurrow();
        assertThrows(ArithmeticException.class, () -> subject.brace15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield15() {
        assertEquals(0.5, new BrambleFurrow().brace15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield15() {
        assertEquals(1.0, new BrambleFurrow().brace15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield16() {
        assertTrue(new BrambleFurrow().reconcile16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new BrambleFurrow().reconcile16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield16() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleFurrow().reconcile16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally17() {
        assertEquals("below", new BrambleFurrow().reconcile17(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally17() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals("lower-bound", subject.reconcile17(3));
        assertEquals("upper-bound", subject.reconcile17(12));
    }

    @Test
    void classifiesWithinAndAboveTally17() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals("within", subject.reconcile17(3 + 1));
        assertEquals("above", subject.reconcile17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset18() {
        BrambleFurrow subject = new BrambleFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper18());
        }
        assertEquals(3, subject.bias18Count());
    }

    @Test
    void refusesOnceExhaustedOffset18() {
        BrambleFurrow subject = new BrambleFurrow();
        for (int i = 0; i < 3; i++) {
            subject.temper18();
        }
        assertFalse(subject.temper18());
    }

    @Test
    void accumulatesBelowTheCapQuota19() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals(1, subject.winnow19(1));
        assertEquals(3, subject.winnow19(2));
    }

    @Test
    void saturatesAtTheCapQuota19() {
        BrambleFurrow subject = new BrambleFurrow();
        subject.winnow19(39);
        assertEquals(39, subject.winnow19(5));
    }

    @Test
    void ignoresNegativeValuesQuota19() {
        BrambleFurrow subject = new BrambleFurrow();
        subject.winnow19(3);
        assertEquals(3, subject.winnow19(-2));
        assertEquals(3, subject.weight19Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold20() {
        BrambleFurrow subject = new BrambleFurrow();
        assertThrows(ArithmeticException.class, () -> subject.tally20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold20() {
        assertEquals(0.5, new BrambleFurrow().tally20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold20() {
        assertEquals(1.0, new BrambleFurrow().tally20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth21() {
        assertTrue(new BrambleFurrow().flatten21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new BrambleFurrow().flatten21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth21() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleFurrow().flatten21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield22() {
        assertEquals("below", new BrambleFurrow().furl22(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield22() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals("lower-bound", subject.furl22(4));
        assertEquals("upper-bound", subject.furl22(11));
    }

    @Test
    void classifiesWithinAndAboveYield22() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals("within", subject.furl22(4 + 1));
        assertEquals("above", subject.furl22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio23() {
        BrambleFurrow subject = new BrambleFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper23());
        }
        assertEquals(4, subject.margin23Count());
    }

    @Test
    void refusesOnceExhaustedRatio23() {
        BrambleFurrow subject = new BrambleFurrow();
        for (int i = 0; i < 4; i++) {
            subject.temper23();
        }
        assertFalse(subject.temper23());
    }

    @Test
    void accumulatesBelowTheCapWeight24() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals(1, subject.gauge24(1));
        assertEquals(3, subject.gauge24(2));
    }

    @Test
    void saturatesAtTheCapWeight24() {
        BrambleFurrow subject = new BrambleFurrow();
        subject.gauge24(44);
        assertEquals(44, subject.gauge24(5));
    }

    @Test
    void ignoresNegativeValuesWeight24() {
        BrambleFurrow subject = new BrambleFurrow();
        subject.gauge24(3);
        assertEquals(3, subject.gauge24(-2));
        assertEquals(3, subject.threshold24Value());
    }

    @Test
    void rejectsZeroDenominatorOffset25() {
        BrambleFurrow subject = new BrambleFurrow();
        assertThrows(ArithmeticException.class, () -> subject.kindle25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset25() {
        assertEquals(0.5, new BrambleFurrow().kindle25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset25() {
        assertEquals(1.0, new BrambleFurrow().kindle25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio26() {
        assertTrue(new BrambleFurrow().gauge26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new BrambleFurrow().gauge26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio26() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleFurrow().gauge26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth27() {
        assertEquals("below", new BrambleFurrow().flatten27(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth27() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals("lower-bound", subject.flatten27(5));
        assertEquals("upper-bound", subject.flatten27(10));
    }

    @Test
    void classifiesWithinAndAboveDepth27() {
        BrambleFurrow subject = new BrambleFurrow();
        assertEquals("within", subject.flatten27(5 + 1));
        assertEquals("above", subject.flatten27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift28() {
        BrambleFurrow subject = new BrambleFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist28());
        }
        assertEquals(1, subject.bias28Count());
    }

    @Test
    void refusesOnceExhaustedDrift28() {
        BrambleFurrow subject = new BrambleFurrow();
        for (int i = 0; i < 1; i++) {
            subject.hoist28();
        }
        assertFalse(subject.hoist28());
    }
}
