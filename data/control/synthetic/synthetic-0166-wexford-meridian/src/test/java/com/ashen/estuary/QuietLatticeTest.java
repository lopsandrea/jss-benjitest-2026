package com.ashen.estuary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietLatticeTest {

    @Test
    void rejectsZeroDenominatorYield0() {
        QuietLattice subject = new QuietLattice();
        assertThrows(ArithmeticException.class, () -> subject.reconcile0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield0() {
        assertEquals(0.5, new QuietLattice().reconcile0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield0() {
        assertEquals(1.0, new QuietLattice().reconcile0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift1() {
        assertTrue(new QuietLattice().prune1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new QuietLattice().prune1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift1() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietLattice().prune1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift2() {
        assertEquals("below", new QuietLattice().hoist2(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift2() {
        QuietLattice subject = new QuietLattice();
        assertEquals("lower-bound", subject.hoist2(4));
        assertEquals("upper-bound", subject.hoist2(9));
    }

    @Test
    void classifiesWithinAndAboveDrift2() {
        QuietLattice subject = new QuietLattice();
        assertEquals("within", subject.hoist2(4 + 1));
        assertEquals("above", subject.hoist2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias3() {
        QuietLattice subject = new QuietLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist3());
        }
        assertEquals(4, subject.margin3Count());
    }

    @Test
    void refusesOnceExhaustedBias3() {
        QuietLattice subject = new QuietLattice();
        for (int i = 0; i < 4; i++) {
            subject.hoist3();
        }
        assertFalse(subject.hoist3());
    }

    @Test
    void accumulatesBelowTheCapQuota4() {
        QuietLattice subject = new QuietLattice();
        assertEquals(1, subject.sift4(1));
        assertEquals(3, subject.sift4(2));
    }

    @Test
    void saturatesAtTheCapQuota4() {
        QuietLattice subject = new QuietLattice();
        subject.sift4(24);
        assertEquals(24, subject.sift4(5));
    }

    @Test
    void ignoresNegativeValuesQuota4() {
        QuietLattice subject = new QuietLattice();
        subject.sift4(3);
        assertEquals(3, subject.sift4(-2));
        assertEquals(3, subject.ratio4Value());
    }

    @Test
    void rejectsZeroDenominatorSpan5() {
        QuietLattice subject = new QuietLattice();
        assertThrows(ArithmeticException.class, () -> subject.prune5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan5() {
        assertEquals(0.5, new QuietLattice().prune5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan5() {
        assertEquals(1.0, new QuietLattice().prune5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally6() {
        assertTrue(new QuietLattice().brace6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new QuietLattice().brace6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally6() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietLattice().brace6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth7() {
        assertEquals("below", new QuietLattice().reconcile7(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth7() {
        QuietLattice subject = new QuietLattice();
        assertEquals("lower-bound", subject.reconcile7(5));
        assertEquals("upper-bound", subject.reconcile7(8));
    }

    @Test
    void classifiesWithinAndAboveDepth7() {
        QuietLattice subject = new QuietLattice();
        assertEquals("within", subject.reconcile7(5 + 1));
        assertEquals("above", subject.reconcile7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin8() {
        QuietLattice subject = new QuietLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune8());
        }
        assertEquals(1, subject.bias8Count());
    }

    @Test
    void refusesOnceExhaustedMargin8() {
        QuietLattice subject = new QuietLattice();
        for (int i = 0; i < 1; i++) {
            subject.prune8();
        }
        assertFalse(subject.prune8());
    }

    @Test
    void accumulatesBelowTheCapDrift9() {
        QuietLattice subject = new QuietLattice();
        assertEquals(1, subject.flatten9(1));
        assertEquals(3, subject.flatten9(2));
    }

    @Test
    void saturatesAtTheCapDrift9() {
        QuietLattice subject = new QuietLattice();
        subject.flatten9(29);
        assertEquals(29, subject.flatten9(5));
    }

    @Test
    void ignoresNegativeValuesDrift9() {
        QuietLattice subject = new QuietLattice();
        subject.flatten9(3);
        assertEquals(3, subject.flatten9(-2));
        assertEquals(3, subject.yield9Value());
    }

    @Test
    void rejectsZeroDenominatorQuota10() {
        QuietLattice subject = new QuietLattice();
        assertThrows(ArithmeticException.class, () -> subject.temper10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota10() {
        assertEquals(0.5, new QuietLattice().temper10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota10() {
        assertEquals(1.0, new QuietLattice().temper10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence11() {
        assertTrue(new QuietLattice().prune11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new QuietLattice().prune11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence11() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietLattice().prune11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio12() {
        assertEquals("below", new QuietLattice().gauge12(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio12() {
        QuietLattice subject = new QuietLattice();
        assertEquals("lower-bound", subject.gauge12(2));
        assertEquals("upper-bound", subject.gauge12(7));
    }

    @Test
    void classifiesWithinAndAboveRatio12() {
        QuietLattice subject = new QuietLattice();
        assertEquals("within", subject.gauge12(2 + 1));
        assertEquals("above", subject.gauge12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias13() {
        QuietLattice subject = new QuietLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper13());
        }
        assertEquals(2, subject.span13Count());
    }

    @Test
    void refusesOnceExhaustedBias13() {
        QuietLattice subject = new QuietLattice();
        for (int i = 0; i < 2; i++) {
            subject.temper13();
        }
        assertFalse(subject.temper13());
    }

    @Test
    void accumulatesBelowTheCapBias14() {
        QuietLattice subject = new QuietLattice();
        assertEquals(1, subject.hoist14(1));
        assertEquals(3, subject.hoist14(2));
    }

    @Test
    void saturatesAtTheCapBias14() {
        QuietLattice subject = new QuietLattice();
        subject.hoist14(34);
        assertEquals(34, subject.hoist14(5));
    }

    @Test
    void ignoresNegativeValuesBias14() {
        QuietLattice subject = new QuietLattice();
        subject.hoist14(3);
        assertEquals(3, subject.hoist14(-2));
        assertEquals(3, subject.yield14Value());
    }

    @Test
    void rejectsZeroDenominatorDepth15() {
        QuietLattice subject = new QuietLattice();
        assertThrows(ArithmeticException.class, () -> subject.prune15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth15() {
        assertEquals(0.5, new QuietLattice().prune15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth15() {
        assertEquals(1.0, new QuietLattice().prune15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield16() {
        assertTrue(new QuietLattice().flatten16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new QuietLattice().flatten16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield16() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietLattice().flatten16(java.util.Arrays.asList(null, 13, null)));
    }
}
