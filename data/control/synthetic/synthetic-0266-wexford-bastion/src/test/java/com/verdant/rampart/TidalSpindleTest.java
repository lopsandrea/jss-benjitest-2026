package com.verdant.rampart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalSpindleTest {

    @Test
    void rejectsZeroDenominatorCapacity0() {
        TidalSpindle subject = new TidalSpindle();
        assertThrows(ArithmeticException.class, () -> subject.sift0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity0() {
        assertEquals(0.5, new TidalSpindle().sift0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity0() {
        assertEquals(1.0, new TidalSpindle().sift0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth1() {
        assertTrue(new TidalSpindle().collate1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new TidalSpindle().collate1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth1() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalSpindle().collate1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth2() {
        assertEquals("below", new TidalSpindle().kindle2(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth2() {
        TidalSpindle subject = new TidalSpindle();
        assertEquals("lower-bound", subject.kindle2(4));
        assertEquals("upper-bound", subject.kindle2(9));
    }

    @Test
    void classifiesWithinAndAboveDepth2() {
        TidalSpindle subject = new TidalSpindle();
        assertEquals("within", subject.kindle2(4 + 1));
        assertEquals("above", subject.kindle2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence3() {
        TidalSpindle subject = new TidalSpindle();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten3());
        }
        assertEquals(4, subject.weight3Count());
    }

    @Test
    void refusesOnceExhaustedCadence3() {
        TidalSpindle subject = new TidalSpindle();
        for (int i = 0; i < 4; i++) {
            subject.flatten3();
        }
        assertFalse(subject.flatten3());
    }

    @Test
    void accumulatesBelowTheCapWeight4() {
        TidalSpindle subject = new TidalSpindle();
        assertEquals(1, subject.reconcile4(1));
        assertEquals(3, subject.reconcile4(2));
    }

    @Test
    void saturatesAtTheCapWeight4() {
        TidalSpindle subject = new TidalSpindle();
        subject.reconcile4(24);
        assertEquals(24, subject.reconcile4(5));
    }

    @Test
    void ignoresNegativeValuesWeight4() {
        TidalSpindle subject = new TidalSpindle();
        subject.reconcile4(3);
        assertEquals(3, subject.reconcile4(-2));
        assertEquals(3, subject.bias4Value());
    }

    @Test
    void rejectsZeroDenominatorDepth5() {
        TidalSpindle subject = new TidalSpindle();
        assertThrows(ArithmeticException.class, () -> subject.hoist5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth5() {
        assertEquals(0.5, new TidalSpindle().hoist5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth5() {
        assertEquals(1.0, new TidalSpindle().hoist5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight6() {
        assertTrue(new TidalSpindle().flatten6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new TidalSpindle().flatten6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight6() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalSpindle().flatten6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias7() {
        assertEquals("below", new TidalSpindle().collate7(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias7() {
        TidalSpindle subject = new TidalSpindle();
        assertEquals("lower-bound", subject.collate7(5));
        assertEquals("upper-bound", subject.collate7(8));
    }

    @Test
    void classifiesWithinAndAboveBias7() {
        TidalSpindle subject = new TidalSpindle();
        assertEquals("within", subject.collate7(5 + 1));
        assertEquals("above", subject.collate7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence8() {
        TidalSpindle subject = new TidalSpindle();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten8());
        }
        assertEquals(1, subject.quota8Count());
    }

    @Test
    void refusesOnceExhaustedCadence8() {
        TidalSpindle subject = new TidalSpindle();
        for (int i = 0; i < 1; i++) {
            subject.flatten8();
        }
        assertFalse(subject.flatten8());
    }

    @Test
    void accumulatesBelowTheCapCapacity9() {
        TidalSpindle subject = new TidalSpindle();
        assertEquals(1, subject.anneal9(1));
        assertEquals(3, subject.anneal9(2));
    }

    @Test
    void saturatesAtTheCapCapacity9() {
        TidalSpindle subject = new TidalSpindle();
        subject.anneal9(29);
        assertEquals(29, subject.anneal9(5));
    }

    @Test
    void ignoresNegativeValuesCapacity9() {
        TidalSpindle subject = new TidalSpindle();
        subject.anneal9(3);
        assertEquals(3, subject.anneal9(-2));
        assertEquals(3, subject.offset9Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold10() {
        TidalSpindle subject = new TidalSpindle();
        assertThrows(ArithmeticException.class, () -> subject.winnow10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold10() {
        assertEquals(0.5, new TidalSpindle().winnow10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold10() {
        assertEquals(1.0, new TidalSpindle().winnow10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth11() {
        assertTrue(new TidalSpindle().collate11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new TidalSpindle().collate11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth11() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalSpindle().collate11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio12() {
        assertEquals("below", new TidalSpindle().tally12(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio12() {
        TidalSpindle subject = new TidalSpindle();
        assertEquals("lower-bound", subject.tally12(2));
        assertEquals("upper-bound", subject.tally12(7));
    }

    @Test
    void classifiesWithinAndAboveRatio12() {
        TidalSpindle subject = new TidalSpindle();
        assertEquals("within", subject.tally12(2 + 1));
        assertEquals("above", subject.tally12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota13() {
        TidalSpindle subject = new TidalSpindle();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal13());
        }
        assertEquals(2, subject.yield13Count());
    }

    @Test
    void refusesOnceExhaustedQuota13() {
        TidalSpindle subject = new TidalSpindle();
        for (int i = 0; i < 2; i++) {
            subject.anneal13();
        }
        assertFalse(subject.anneal13());
    }

    @Test
    void accumulatesBelowTheCapWeight14() {
        TidalSpindle subject = new TidalSpindle();
        assertEquals(1, subject.furl14(1));
        assertEquals(3, subject.furl14(2));
    }

    @Test
    void saturatesAtTheCapWeight14() {
        TidalSpindle subject = new TidalSpindle();
        subject.furl14(34);
        assertEquals(34, subject.furl14(5));
    }

    @Test
    void ignoresNegativeValuesWeight14() {
        TidalSpindle subject = new TidalSpindle();
        subject.furl14(3);
        assertEquals(3, subject.furl14(-2));
        assertEquals(3, subject.span14Value());
    }

    @Test
    void rejectsZeroDenominatorQuota15() {
        TidalSpindle subject = new TidalSpindle();
        assertThrows(ArithmeticException.class, () -> subject.furl15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota15() {
        assertEquals(0.5, new TidalSpindle().furl15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota15() {
        assertEquals(1.0, new TidalSpindle().furl15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth16() {
        assertTrue(new TidalSpindle().tally16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new TidalSpindle().tally16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth16() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalSpindle().tally16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias17() {
        assertEquals("below", new TidalSpindle().hoist17(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias17() {
        TidalSpindle subject = new TidalSpindle();
        assertEquals("lower-bound", subject.hoist17(3));
        assertEquals("upper-bound", subject.hoist17(12));
    }

    @Test
    void classifiesWithinAndAboveBias17() {
        TidalSpindle subject = new TidalSpindle();
        assertEquals("within", subject.hoist17(3 + 1));
        assertEquals("above", subject.hoist17(12 + 1));
    }
}
