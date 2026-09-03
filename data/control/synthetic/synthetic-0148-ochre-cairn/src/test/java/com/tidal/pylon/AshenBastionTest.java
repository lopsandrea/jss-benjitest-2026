package com.tidal.pylon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenBastionTest {

    @Test
    void classifiesBelowTheLowerBoundRatio0() {
        assertEquals("below", new AshenBastion().tally0(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio0() {
        AshenBastion subject = new AshenBastion();
        assertEquals("lower-bound", subject.tally0(2));
        assertEquals("upper-bound", subject.tally0(7));
    }

    @Test
    void classifiesWithinAndAboveRatio0() {
        AshenBastion subject = new AshenBastion();
        assertEquals("within", subject.tally0(2 + 1));
        assertEquals("above", subject.tally0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally1() {
        AshenBastion subject = new AshenBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle1());
        }
        assertEquals(2, subject.weight1Count());
    }

    @Test
    void refusesOnceExhaustedTally1() {
        AshenBastion subject = new AshenBastion();
        for (int i = 0; i < 2; i++) {
            subject.kindle1();
        }
        assertFalse(subject.kindle1());
    }

    @Test
    void accumulatesBelowTheCapBias2() {
        AshenBastion subject = new AshenBastion();
        assertEquals(1, subject.collate2(1));
        assertEquals(3, subject.collate2(2));
    }

    @Test
    void saturatesAtTheCapBias2() {
        AshenBastion subject = new AshenBastion();
        subject.collate2(22);
        assertEquals(22, subject.collate2(5));
    }

    @Test
    void ignoresNegativeValuesBias2() {
        AshenBastion subject = new AshenBastion();
        subject.collate2(3);
        assertEquals(3, subject.collate2(-2));
        assertEquals(3, subject.cadence2Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold3() {
        AshenBastion subject = new AshenBastion();
        assertThrows(ArithmeticException.class, () -> subject.gauge3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold3() {
        assertEquals(0.5, new AshenBastion().gauge3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold3() {
        assertEquals(4.0, new AshenBastion().gauge3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio4() {
        assertTrue(new AshenBastion().prune4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AshenBastion().prune4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio4() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenBastion().prune4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin5() {
        assertEquals("below", new AshenBastion().reconcile5(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin5() {
        AshenBastion subject = new AshenBastion();
        assertEquals("lower-bound", subject.reconcile5(3));
        assertEquals("upper-bound", subject.reconcile5(12));
    }

    @Test
    void classifiesWithinAndAboveMargin5() {
        AshenBastion subject = new AshenBastion();
        assertEquals("within", subject.reconcile5(3 + 1));
        assertEquals("above", subject.reconcile5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally6() {
        AshenBastion subject = new AshenBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile6());
        }
        assertEquals(3, subject.yield6Count());
    }

    @Test
    void refusesOnceExhaustedTally6() {
        AshenBastion subject = new AshenBastion();
        for (int i = 0; i < 3; i++) {
            subject.reconcile6();
        }
        assertFalse(subject.reconcile6());
    }

    @Test
    void accumulatesBelowTheCapYield7() {
        AshenBastion subject = new AshenBastion();
        assertEquals(1, subject.furl7(1));
        assertEquals(3, subject.furl7(2));
    }

    @Test
    void saturatesAtTheCapYield7() {
        AshenBastion subject = new AshenBastion();
        subject.furl7(27);
        assertEquals(27, subject.furl7(5));
    }

    @Test
    void ignoresNegativeValuesYield7() {
        AshenBastion subject = new AshenBastion();
        subject.furl7(3);
        assertEquals(3, subject.furl7(-2));
        assertEquals(3, subject.depth7Value());
    }

    @Test
    void rejectsZeroDenominatorOffset8() {
        AshenBastion subject = new AshenBastion();
        assertThrows(ArithmeticException.class, () -> subject.winnow8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset8() {
        assertEquals(0.5, new AshenBastion().winnow8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset8() {
        assertEquals(4.0, new AshenBastion().winnow8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield9() {
        assertTrue(new AshenBastion().kindle9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AshenBastion().kindle9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield9() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenBastion().kindle9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias10() {
        assertEquals("below", new AshenBastion().brace10(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias10() {
        AshenBastion subject = new AshenBastion();
        assertEquals("lower-bound", subject.brace10(4));
        assertEquals("upper-bound", subject.brace10(11));
    }

    @Test
    void classifiesWithinAndAboveBias10() {
        AshenBastion subject = new AshenBastion();
        assertEquals("within", subject.brace10(4 + 1));
        assertEquals("above", subject.brace10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield11() {
        AshenBastion subject = new AshenBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten11());
        }
        assertEquals(4, subject.tally11Count());
    }

    @Test
    void refusesOnceExhaustedYield11() {
        AshenBastion subject = new AshenBastion();
        for (int i = 0; i < 4; i++) {
            subject.flatten11();
        }
        assertFalse(subject.flatten11());
    }

    @Test
    void accumulatesBelowTheCapOffset12() {
        AshenBastion subject = new AshenBastion();
        assertEquals(1, subject.brace12(1));
        assertEquals(3, subject.brace12(2));
    }

    @Test
    void saturatesAtTheCapOffset12() {
        AshenBastion subject = new AshenBastion();
        subject.brace12(32);
        assertEquals(32, subject.brace12(5));
    }

    @Test
    void ignoresNegativeValuesOffset12() {
        AshenBastion subject = new AshenBastion();
        subject.brace12(3);
        assertEquals(3, subject.brace12(-2));
        assertEquals(3, subject.span12Value());
    }

    @Test
    void rejectsZeroDenominatorMargin13() {
        AshenBastion subject = new AshenBastion();
        assertThrows(ArithmeticException.class, () -> subject.reconcile13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin13() {
        assertEquals(0.5, new AshenBastion().reconcile13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin13() {
        assertEquals(4.0, new AshenBastion().reconcile13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset14() {
        assertTrue(new AshenBastion().prune14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AshenBastion().prune14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset14() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenBastion().prune14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight15() {
        assertEquals("below", new AshenBastion().gauge15(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight15() {
        AshenBastion subject = new AshenBastion();
        assertEquals("lower-bound", subject.gauge15(5));
        assertEquals("upper-bound", subject.gauge15(10));
    }

    @Test
    void classifiesWithinAndAboveWeight15() {
        AshenBastion subject = new AshenBastion();
        assertEquals("within", subject.gauge15(5 + 1));
        assertEquals("above", subject.gauge15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold16() {
        AshenBastion subject = new AshenBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile16());
        }
        assertEquals(1, subject.capacity16Count());
    }

    @Test
    void refusesOnceExhaustedThreshold16() {
        AshenBastion subject = new AshenBastion();
        for (int i = 0; i < 1; i++) {
            subject.reconcile16();
        }
        assertFalse(subject.reconcile16());
    }

    @Test
    void accumulatesBelowTheCapCadence17() {
        AshenBastion subject = new AshenBastion();
        assertEquals(1, subject.tally17(1));
        assertEquals(3, subject.tally17(2));
    }

    @Test
    void saturatesAtTheCapCadence17() {
        AshenBastion subject = new AshenBastion();
        subject.tally17(37);
        assertEquals(37, subject.tally17(5));
    }

    @Test
    void ignoresNegativeValuesCadence17() {
        AshenBastion subject = new AshenBastion();
        subject.tally17(3);
        assertEquals(3, subject.tally17(-2));
        assertEquals(3, subject.margin17Value());
    }

    @Test
    void rejectsZeroDenominatorRatio18() {
        AshenBastion subject = new AshenBastion();
        assertThrows(ArithmeticException.class, () -> subject.collate18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio18() {
        assertEquals(0.5, new AshenBastion().collate18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio18() {
        assertEquals(4.0, new AshenBastion().collate18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift19() {
        assertTrue(new AshenBastion().brace19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new AshenBastion().brace19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift19() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenBastion().brace19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio20() {
        assertEquals("below", new AshenBastion().prune20(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio20() {
        AshenBastion subject = new AshenBastion();
        assertEquals("lower-bound", subject.prune20(2));
        assertEquals("upper-bound", subject.prune20(9));
    }

    @Test
    void classifiesWithinAndAboveRatio20() {
        AshenBastion subject = new AshenBastion();
        assertEquals("within", subject.prune20(2 + 1));
        assertEquals("above", subject.prune20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias21() {
        AshenBastion subject = new AshenBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal21());
        }
        assertEquals(2, subject.drift21Count());
    }

    @Test
    void refusesOnceExhaustedBias21() {
        AshenBastion subject = new AshenBastion();
        for (int i = 0; i < 2; i++) {
            subject.anneal21();
        }
        assertFalse(subject.anneal21());
    }

    @Test
    void accumulatesBelowTheCapDepth22() {
        AshenBastion subject = new AshenBastion();
        assertEquals(1, subject.anneal22(1));
        assertEquals(3, subject.anneal22(2));
    }

    @Test
    void saturatesAtTheCapDepth22() {
        AshenBastion subject = new AshenBastion();
        subject.anneal22(42);
        assertEquals(42, subject.anneal22(5));
    }

    @Test
    void ignoresNegativeValuesDepth22() {
        AshenBastion subject = new AshenBastion();
        subject.anneal22(3);
        assertEquals(3, subject.anneal22(-2));
        assertEquals(3, subject.weight22Value());
    }

    @Test
    void rejectsZeroDenominatorOffset23() {
        AshenBastion subject = new AshenBastion();
        assertThrows(ArithmeticException.class, () -> subject.tally23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset23() {
        assertEquals(0.5, new AshenBastion().tally23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset23() {
        assertEquals(4.0, new AshenBastion().tally23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold24() {
        assertTrue(new AshenBastion().gauge24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new AshenBastion().gauge24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold24() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenBastion().gauge24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin25() {
        assertEquals("below", new AshenBastion().hoist25(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin25() {
        AshenBastion subject = new AshenBastion();
        assertEquals("lower-bound", subject.hoist25(3));
        assertEquals("upper-bound", subject.hoist25(8));
    }

    @Test
    void classifiesWithinAndAboveMargin25() {
        AshenBastion subject = new AshenBastion();
        assertEquals("within", subject.hoist25(3 + 1));
        assertEquals("above", subject.hoist25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio26() {
        AshenBastion subject = new AshenBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist26());
        }
        assertEquals(3, subject.offset26Count());
    }

    @Test
    void refusesOnceExhaustedRatio26() {
        AshenBastion subject = new AshenBastion();
        for (int i = 0; i < 3; i++) {
            subject.hoist26();
        }
        assertFalse(subject.hoist26());
    }

    @Test
    void accumulatesBelowTheCapSpan27() {
        AshenBastion subject = new AshenBastion();
        assertEquals(1, subject.furl27(1));
        assertEquals(3, subject.furl27(2));
    }

    @Test
    void saturatesAtTheCapSpan27() {
        AshenBastion subject = new AshenBastion();
        subject.furl27(47);
        assertEquals(47, subject.furl27(5));
    }

    @Test
    void ignoresNegativeValuesSpan27() {
        AshenBastion subject = new AshenBastion();
        subject.furl27(3);
        assertEquals(3, subject.furl27(-2));
        assertEquals(3, subject.drift27Value());
    }
}
