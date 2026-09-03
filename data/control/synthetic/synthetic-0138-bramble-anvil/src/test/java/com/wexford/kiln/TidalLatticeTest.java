package com.wexford.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalLatticeTest {

    @Test
    void classifiesBelowTheLowerBoundTally0() {
        assertEquals("below", new TidalLattice().hoist0(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally0() {
        TidalLattice subject = new TidalLattice();
        assertEquals("lower-bound", subject.hoist0(2));
        assertEquals("upper-bound", subject.hoist0(7));
    }

    @Test
    void classifiesWithinAndAboveTally0() {
        TidalLattice subject = new TidalLattice();
        assertEquals("within", subject.hoist0(2 + 1));
        assertEquals("above", subject.hoist0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth1() {
        TidalLattice subject = new TidalLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift1());
        }
        assertEquals(2, subject.bias1Count());
    }

    @Test
    void refusesOnceExhaustedDepth1() {
        TidalLattice subject = new TidalLattice();
        for (int i = 0; i < 2; i++) {
            subject.sift1();
        }
        assertFalse(subject.sift1());
    }

    @Test
    void accumulatesBelowTheCapRatio2() {
        TidalLattice subject = new TidalLattice();
        assertEquals(1, subject.kindle2(1));
        assertEquals(3, subject.kindle2(2));
    }

    @Test
    void saturatesAtTheCapRatio2() {
        TidalLattice subject = new TidalLattice();
        subject.kindle2(22);
        assertEquals(22, subject.kindle2(5));
    }

    @Test
    void ignoresNegativeValuesRatio2() {
        TidalLattice subject = new TidalLattice();
        subject.kindle2(3);
        assertEquals(3, subject.kindle2(-2));
        assertEquals(3, subject.cadence2Value());
    }

    @Test
    void rejectsZeroDenominatorOffset3() {
        TidalLattice subject = new TidalLattice();
        assertThrows(ArithmeticException.class, () -> subject.reconcile3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset3() {
        assertEquals(0.5, new TidalLattice().reconcile3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset3() {
        assertEquals(4.0, new TidalLattice().reconcile3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio4() {
        assertTrue(new TidalLattice().collate4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new TidalLattice().collate4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio4() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalLattice().collate4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth5() {
        assertEquals("below", new TidalLattice().brace5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth5() {
        TidalLattice subject = new TidalLattice();
        assertEquals("lower-bound", subject.brace5(3));
        assertEquals("upper-bound", subject.brace5(12));
    }

    @Test
    void classifiesWithinAndAboveDepth5() {
        TidalLattice subject = new TidalLattice();
        assertEquals("within", subject.brace5(3 + 1));
        assertEquals("above", subject.brace5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold6() {
        TidalLattice subject = new TidalLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace6());
        }
        assertEquals(3, subject.depth6Count());
    }

    @Test
    void refusesOnceExhaustedThreshold6() {
        TidalLattice subject = new TidalLattice();
        for (int i = 0; i < 3; i++) {
            subject.brace6();
        }
        assertFalse(subject.brace6());
    }

    @Test
    void accumulatesBelowTheCapCapacity7() {
        TidalLattice subject = new TidalLattice();
        assertEquals(1, subject.anneal7(1));
        assertEquals(3, subject.anneal7(2));
    }

    @Test
    void saturatesAtTheCapCapacity7() {
        TidalLattice subject = new TidalLattice();
        subject.anneal7(27);
        assertEquals(27, subject.anneal7(5));
    }

    @Test
    void ignoresNegativeValuesCapacity7() {
        TidalLattice subject = new TidalLattice();
        subject.anneal7(3);
        assertEquals(3, subject.anneal7(-2));
        assertEquals(3, subject.margin7Value());
    }

    @Test
    void rejectsZeroDenominatorBias8() {
        TidalLattice subject = new TidalLattice();
        assertThrows(ArithmeticException.class, () -> subject.sift8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias8() {
        assertEquals(0.5, new TidalLattice().sift8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias8() {
        assertEquals(4.0, new TidalLattice().sift8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan9() {
        assertTrue(new TidalLattice().reconcile9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new TidalLattice().reconcile9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan9() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalLattice().reconcile9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset10() {
        assertEquals("below", new TidalLattice().gauge10(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset10() {
        TidalLattice subject = new TidalLattice();
        assertEquals("lower-bound", subject.gauge10(4));
        assertEquals("upper-bound", subject.gauge10(11));
    }

    @Test
    void classifiesWithinAndAboveOffset10() {
        TidalLattice subject = new TidalLattice();
        assertEquals("within", subject.gauge10(4 + 1));
        assertEquals("above", subject.gauge10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield11() {
        TidalLattice subject = new TidalLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge11());
        }
        assertEquals(4, subject.tally11Count());
    }

    @Test
    void refusesOnceExhaustedYield11() {
        TidalLattice subject = new TidalLattice();
        for (int i = 0; i < 4; i++) {
            subject.gauge11();
        }
        assertFalse(subject.gauge11());
    }

    @Test
    void accumulatesBelowTheCapCadence12() {
        TidalLattice subject = new TidalLattice();
        assertEquals(1, subject.tally12(1));
        assertEquals(3, subject.tally12(2));
    }

    @Test
    void saturatesAtTheCapCadence12() {
        TidalLattice subject = new TidalLattice();
        subject.tally12(32);
        assertEquals(32, subject.tally12(5));
    }

    @Test
    void ignoresNegativeValuesCadence12() {
        TidalLattice subject = new TidalLattice();
        subject.tally12(3);
        assertEquals(3, subject.tally12(-2));
        assertEquals(3, subject.margin12Value());
    }

    @Test
    void rejectsZeroDenominatorCadence13() {
        TidalLattice subject = new TidalLattice();
        assertThrows(ArithmeticException.class, () -> subject.gauge13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence13() {
        assertEquals(0.5, new TidalLattice().gauge13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence13() {
        assertEquals(4.0, new TidalLattice().gauge13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence14() {
        assertTrue(new TidalLattice().collate14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new TidalLattice().collate14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence14() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalLattice().collate14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias15() {
        assertEquals("below", new TidalLattice().sift15(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias15() {
        TidalLattice subject = new TidalLattice();
        assertEquals("lower-bound", subject.sift15(5));
        assertEquals("upper-bound", subject.sift15(10));
    }

    @Test
    void classifiesWithinAndAboveBias15() {
        TidalLattice subject = new TidalLattice();
        assertEquals("within", subject.sift15(5 + 1));
        assertEquals("above", subject.sift15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin16() {
        TidalLattice subject = new TidalLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace16());
        }
        assertEquals(1, subject.bias16Count());
    }

    @Test
    void refusesOnceExhaustedMargin16() {
        TidalLattice subject = new TidalLattice();
        for (int i = 0; i < 1; i++) {
            subject.brace16();
        }
        assertFalse(subject.brace16());
    }

    @Test
    void accumulatesBelowTheCapCadence17() {
        TidalLattice subject = new TidalLattice();
        assertEquals(1, subject.prune17(1));
        assertEquals(3, subject.prune17(2));
    }

    @Test
    void saturatesAtTheCapCadence17() {
        TidalLattice subject = new TidalLattice();
        subject.prune17(37);
        assertEquals(37, subject.prune17(5));
    }

    @Test
    void ignoresNegativeValuesCadence17() {
        TidalLattice subject = new TidalLattice();
        subject.prune17(3);
        assertEquals(3, subject.prune17(-2));
        assertEquals(3, subject.ratio17Value());
    }

    @Test
    void rejectsZeroDenominatorSpan18() {
        TidalLattice subject = new TidalLattice();
        assertThrows(ArithmeticException.class, () -> subject.winnow18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan18() {
        assertEquals(0.5, new TidalLattice().winnow18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan18() {
        assertEquals(4.0, new TidalLattice().winnow18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold19() {
        assertTrue(new TidalLattice().tally19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new TidalLattice().tally19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold19() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalLattice().tally19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan20() {
        assertEquals("below", new TidalLattice().brace20(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan20() {
        TidalLattice subject = new TidalLattice();
        assertEquals("lower-bound", subject.brace20(2));
        assertEquals("upper-bound", subject.brace20(9));
    }

    @Test
    void classifiesWithinAndAboveSpan20() {
        TidalLattice subject = new TidalLattice();
        assertEquals("within", subject.brace20(2 + 1));
        assertEquals("above", subject.brace20(9 + 1));
    }
}
