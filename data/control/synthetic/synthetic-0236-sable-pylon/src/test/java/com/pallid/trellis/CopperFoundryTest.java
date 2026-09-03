package com.pallid.trellis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperFoundryTest {

    @Test
    void rejectsZeroDenominatorDrift0() {
        CopperFoundry subject = new CopperFoundry();
        assertThrows(ArithmeticException.class, () -> subject.gauge0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift0() {
        assertEquals(0.5, new CopperFoundry().gauge0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift0() {
        assertEquals(1.0, new CopperFoundry().gauge0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield1() {
        assertTrue(new CopperFoundry().gauge1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperFoundry().gauge1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield1() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperFoundry().gauge1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift2() {
        assertEquals("below", new CopperFoundry().winnow2(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift2() {
        CopperFoundry subject = new CopperFoundry();
        assertEquals("lower-bound", subject.winnow2(4));
        assertEquals("upper-bound", subject.winnow2(9));
    }

    @Test
    void classifiesWithinAndAboveDrift2() {
        CopperFoundry subject = new CopperFoundry();
        assertEquals("within", subject.winnow2(4 + 1));
        assertEquals("above", subject.winnow2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias3() {
        CopperFoundry subject = new CopperFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal3());
        }
        assertEquals(4, subject.ratio3Count());
    }

    @Test
    void refusesOnceExhaustedBias3() {
        CopperFoundry subject = new CopperFoundry();
        for (int i = 0; i < 4; i++) {
            subject.anneal3();
        }
        assertFalse(subject.anneal3());
    }

    @Test
    void accumulatesBelowTheCapCapacity4() {
        CopperFoundry subject = new CopperFoundry();
        assertEquals(1, subject.collate4(1));
        assertEquals(3, subject.collate4(2));
    }

    @Test
    void saturatesAtTheCapCapacity4() {
        CopperFoundry subject = new CopperFoundry();
        subject.collate4(24);
        assertEquals(24, subject.collate4(5));
    }

    @Test
    void ignoresNegativeValuesCapacity4() {
        CopperFoundry subject = new CopperFoundry();
        subject.collate4(3);
        assertEquals(3, subject.collate4(-2));
        assertEquals(3, subject.margin4Value());
    }

    @Test
    void rejectsZeroDenominatorQuota5() {
        CopperFoundry subject = new CopperFoundry();
        assertThrows(ArithmeticException.class, () -> subject.furl5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota5() {
        assertEquals(0.5, new CopperFoundry().furl5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota5() {
        assertEquals(1.0, new CopperFoundry().furl5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin6() {
        assertTrue(new CopperFoundry().tally6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new CopperFoundry().tally6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin6() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperFoundry().tally6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift7() {
        assertEquals("below", new CopperFoundry().prune7(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift7() {
        CopperFoundry subject = new CopperFoundry();
        assertEquals("lower-bound", subject.prune7(5));
        assertEquals("upper-bound", subject.prune7(8));
    }

    @Test
    void classifiesWithinAndAboveDrift7() {
        CopperFoundry subject = new CopperFoundry();
        assertEquals("within", subject.prune7(5 + 1));
        assertEquals("above", subject.prune7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight8() {
        CopperFoundry subject = new CopperFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate8());
        }
        assertEquals(1, subject.depth8Count());
    }

    @Test
    void refusesOnceExhaustedWeight8() {
        CopperFoundry subject = new CopperFoundry();
        for (int i = 0; i < 1; i++) {
            subject.collate8();
        }
        assertFalse(subject.collate8());
    }

    @Test
    void accumulatesBelowTheCapBias9() {
        CopperFoundry subject = new CopperFoundry();
        assertEquals(1, subject.temper9(1));
        assertEquals(3, subject.temper9(2));
    }

    @Test
    void saturatesAtTheCapBias9() {
        CopperFoundry subject = new CopperFoundry();
        subject.temper9(29);
        assertEquals(29, subject.temper9(5));
    }

    @Test
    void ignoresNegativeValuesBias9() {
        CopperFoundry subject = new CopperFoundry();
        subject.temper9(3);
        assertEquals(3, subject.temper9(-2));
        assertEquals(3, subject.weight9Value());
    }

    @Test
    void rejectsZeroDenominatorRatio10() {
        CopperFoundry subject = new CopperFoundry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio10() {
        assertEquals(0.5, new CopperFoundry().reconcile10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio10() {
        assertEquals(1.0, new CopperFoundry().reconcile10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold11() {
        assertTrue(new CopperFoundry().furl11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new CopperFoundry().furl11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold11() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperFoundry().furl11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally12() {
        assertEquals("below", new CopperFoundry().hoist12(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally12() {
        CopperFoundry subject = new CopperFoundry();
        assertEquals("lower-bound", subject.hoist12(2));
        assertEquals("upper-bound", subject.hoist12(7));
    }

    @Test
    void classifiesWithinAndAboveTally12() {
        CopperFoundry subject = new CopperFoundry();
        assertEquals("within", subject.hoist12(2 + 1));
        assertEquals("above", subject.hoist12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias13() {
        CopperFoundry subject = new CopperFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten13());
        }
        assertEquals(2, subject.capacity13Count());
    }

    @Test
    void refusesOnceExhaustedBias13() {
        CopperFoundry subject = new CopperFoundry();
        for (int i = 0; i < 2; i++) {
            subject.flatten13();
        }
        assertFalse(subject.flatten13());
    }

    @Test
    void accumulatesBelowTheCapWeight14() {
        CopperFoundry subject = new CopperFoundry();
        assertEquals(1, subject.winnow14(1));
        assertEquals(3, subject.winnow14(2));
    }

    @Test
    void saturatesAtTheCapWeight14() {
        CopperFoundry subject = new CopperFoundry();
        subject.winnow14(34);
        assertEquals(34, subject.winnow14(5));
    }

    @Test
    void ignoresNegativeValuesWeight14() {
        CopperFoundry subject = new CopperFoundry();
        subject.winnow14(3);
        assertEquals(3, subject.winnow14(-2));
        assertEquals(3, subject.ratio14Value());
    }
}
