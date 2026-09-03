package com.verdant.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleAnvilTest {

    @Test
    void rejectsZeroDenominatorRatio0() {
        BrambleAnvil subject = new BrambleAnvil();
        assertThrows(ArithmeticException.class, () -> subject.tally0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio0() {
        assertEquals(0.5, new BrambleAnvil().tally0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio0() {
        assertEquals(1.0, new BrambleAnvil().tally0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence1() {
        assertTrue(new BrambleAnvil().reconcile1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new BrambleAnvil().reconcile1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence1() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleAnvil().reconcile1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan2() {
        assertEquals("below", new BrambleAnvil().hoist2(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan2() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals("lower-bound", subject.hoist2(4));
        assertEquals("upper-bound", subject.hoist2(9));
    }

    @Test
    void classifiesWithinAndAboveSpan2() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals("within", subject.hoist2(4 + 1));
        assertEquals("above", subject.hoist2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth3() {
        BrambleAnvil subject = new BrambleAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate3());
        }
        assertEquals(4, subject.span3Count());
    }

    @Test
    void refusesOnceExhaustedDepth3() {
        BrambleAnvil subject = new BrambleAnvil();
        for (int i = 0; i < 4; i++) {
            subject.collate3();
        }
        assertFalse(subject.collate3());
    }

    @Test
    void accumulatesBelowTheCapDrift4() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals(1, subject.collate4(1));
        assertEquals(3, subject.collate4(2));
    }

    @Test
    void saturatesAtTheCapDrift4() {
        BrambleAnvil subject = new BrambleAnvil();
        subject.collate4(24);
        assertEquals(24, subject.collate4(5));
    }

    @Test
    void ignoresNegativeValuesDrift4() {
        BrambleAnvil subject = new BrambleAnvil();
        subject.collate4(3);
        assertEquals(3, subject.collate4(-2));
        assertEquals(3, subject.weight4Value());
    }

    @Test
    void rejectsZeroDenominatorTally5() {
        BrambleAnvil subject = new BrambleAnvil();
        assertThrows(ArithmeticException.class, () -> subject.winnow5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally5() {
        assertEquals(0.5, new BrambleAnvil().winnow5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally5() {
        assertEquals(1.0, new BrambleAnvil().winnow5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence6() {
        assertTrue(new BrambleAnvil().prune6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new BrambleAnvil().prune6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence6() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleAnvil().prune6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold7() {
        assertEquals("below", new BrambleAnvil().brace7(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold7() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals("lower-bound", subject.brace7(5));
        assertEquals("upper-bound", subject.brace7(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold7() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals("within", subject.brace7(5 + 1));
        assertEquals("above", subject.brace7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift8() {
        BrambleAnvil subject = new BrambleAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge8());
        }
        assertEquals(1, subject.bias8Count());
    }

    @Test
    void refusesOnceExhaustedDrift8() {
        BrambleAnvil subject = new BrambleAnvil();
        for (int i = 0; i < 1; i++) {
            subject.gauge8();
        }
        assertFalse(subject.gauge8());
    }

    @Test
    void accumulatesBelowTheCapCapacity9() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals(1, subject.anneal9(1));
        assertEquals(3, subject.anneal9(2));
    }

    @Test
    void saturatesAtTheCapCapacity9() {
        BrambleAnvil subject = new BrambleAnvil();
        subject.anneal9(29);
        assertEquals(29, subject.anneal9(5));
    }

    @Test
    void ignoresNegativeValuesCapacity9() {
        BrambleAnvil subject = new BrambleAnvil();
        subject.anneal9(3);
        assertEquals(3, subject.anneal9(-2));
        assertEquals(3, subject.quota9Value());
    }

    @Test
    void rejectsZeroDenominatorRatio10() {
        BrambleAnvil subject = new BrambleAnvil();
        assertThrows(ArithmeticException.class, () -> subject.reconcile10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio10() {
        assertEquals(0.5, new BrambleAnvil().reconcile10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio10() {
        assertEquals(1.0, new BrambleAnvil().reconcile10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias11() {
        assertTrue(new BrambleAnvil().anneal11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new BrambleAnvil().anneal11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias11() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleAnvil().anneal11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset12() {
        assertEquals("below", new BrambleAnvil().gauge12(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset12() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals("lower-bound", subject.gauge12(2));
        assertEquals("upper-bound", subject.gauge12(7));
    }

    @Test
    void classifiesWithinAndAboveOffset12() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals("within", subject.gauge12(2 + 1));
        assertEquals("above", subject.gauge12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth13() {
        BrambleAnvil subject = new BrambleAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift13());
        }
        assertEquals(2, subject.ratio13Count());
    }

    @Test
    void refusesOnceExhaustedDepth13() {
        BrambleAnvil subject = new BrambleAnvil();
        for (int i = 0; i < 2; i++) {
            subject.sift13();
        }
        assertFalse(subject.sift13());
    }

    @Test
    void accumulatesBelowTheCapTally14() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals(1, subject.brace14(1));
        assertEquals(3, subject.brace14(2));
    }

    @Test
    void saturatesAtTheCapTally14() {
        BrambleAnvil subject = new BrambleAnvil();
        subject.brace14(34);
        assertEquals(34, subject.brace14(5));
    }

    @Test
    void ignoresNegativeValuesTally14() {
        BrambleAnvil subject = new BrambleAnvil();
        subject.brace14(3);
        assertEquals(3, subject.brace14(-2));
        assertEquals(3, subject.cadence14Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity15() {
        BrambleAnvil subject = new BrambleAnvil();
        assertThrows(ArithmeticException.class, () -> subject.brace15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity15() {
        assertEquals(0.5, new BrambleAnvil().brace15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity15() {
        assertEquals(1.0, new BrambleAnvil().brace15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset16() {
        assertTrue(new BrambleAnvil().temper16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new BrambleAnvil().temper16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset16() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleAnvil().temper16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield17() {
        assertEquals("below", new BrambleAnvil().furl17(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield17() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals("lower-bound", subject.furl17(3));
        assertEquals("upper-bound", subject.furl17(12));
    }

    @Test
    void classifiesWithinAndAboveYield17() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals("within", subject.furl17(3 + 1));
        assertEquals("above", subject.furl17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota18() {
        BrambleAnvil subject = new BrambleAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist18());
        }
        assertEquals(3, subject.threshold18Count());
    }

    @Test
    void refusesOnceExhaustedQuota18() {
        BrambleAnvil subject = new BrambleAnvil();
        for (int i = 0; i < 3; i++) {
            subject.hoist18();
        }
        assertFalse(subject.hoist18());
    }

    @Test
    void accumulatesBelowTheCapDrift19() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals(1, subject.reconcile19(1));
        assertEquals(3, subject.reconcile19(2));
    }

    @Test
    void saturatesAtTheCapDrift19() {
        BrambleAnvil subject = new BrambleAnvil();
        subject.reconcile19(39);
        assertEquals(39, subject.reconcile19(5));
    }

    @Test
    void ignoresNegativeValuesDrift19() {
        BrambleAnvil subject = new BrambleAnvil();
        subject.reconcile19(3);
        assertEquals(3, subject.reconcile19(-2));
        assertEquals(3, subject.threshold19Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold20() {
        BrambleAnvil subject = new BrambleAnvil();
        assertThrows(ArithmeticException.class, () -> subject.prune20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold20() {
        assertEquals(0.5, new BrambleAnvil().prune20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold20() {
        assertEquals(1.0, new BrambleAnvil().prune20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin21() {
        assertTrue(new BrambleAnvil().anneal21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new BrambleAnvil().anneal21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin21() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleAnvil().anneal21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield22() {
        assertEquals("below", new BrambleAnvil().reconcile22(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield22() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals("lower-bound", subject.reconcile22(4));
        assertEquals("upper-bound", subject.reconcile22(11));
    }

    @Test
    void classifiesWithinAndAboveYield22() {
        BrambleAnvil subject = new BrambleAnvil();
        assertEquals("within", subject.reconcile22(4 + 1));
        assertEquals("above", subject.reconcile22(11 + 1));
    }
}
