package com.ashen.cistern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardCisternIITest {

    @Test
    void rejectsZeroDenominatorMargin0() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertThrows(ArithmeticException.class, () -> subject.hoist0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin0() {
        assertEquals(0.5, new NorthwardCisternII().hoist0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin0() {
        assertEquals(1.0, new NorthwardCisternII().hoist0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth1() {
        assertTrue(new NorthwardCisternII().prune1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new NorthwardCisternII().prune1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth1() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardCisternII().prune1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield2() {
        assertEquals("below", new NorthwardCisternII().kindle2(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield2() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("lower-bound", subject.kindle2(4));
        assertEquals("upper-bound", subject.kindle2(9));
    }

    @Test
    void classifiesWithinAndAboveYield2() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("within", subject.kindle2(4 + 1));
        assertEquals("above", subject.kindle2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio3() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten3());
        }
        assertEquals(4, subject.margin3Count());
    }

    @Test
    void refusesOnceExhaustedRatio3() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 4; i++) {
            subject.flatten3();
        }
        assertFalse(subject.flatten3());
    }

    @Test
    void accumulatesBelowTheCapCadence4() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals(1, subject.brace4(1));
        assertEquals(3, subject.brace4(2));
    }

    @Test
    void saturatesAtTheCapCadence4() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.brace4(24);
        assertEquals(24, subject.brace4(5));
    }

    @Test
    void ignoresNegativeValuesCadence4() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.brace4(3);
        assertEquals(3, subject.brace4(-2));
        assertEquals(3, subject.margin4Value());
    }

    @Test
    void rejectsZeroDenominatorCadence5() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertThrows(ArithmeticException.class, () -> subject.prune5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence5() {
        assertEquals(0.5, new NorthwardCisternII().prune5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence5() {
        assertEquals(1.0, new NorthwardCisternII().prune5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally6() {
        assertTrue(new NorthwardCisternII().brace6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new NorthwardCisternII().brace6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally6() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardCisternII().brace6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias7() {
        assertEquals("below", new NorthwardCisternII().tally7(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias7() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("lower-bound", subject.tally7(5));
        assertEquals("upper-bound", subject.tally7(8));
    }

    @Test
    void classifiesWithinAndAboveBias7() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("within", subject.tally7(5 + 1));
        assertEquals("above", subject.tally7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota8() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift8());
        }
        assertEquals(1, subject.ratio8Count());
    }

    @Test
    void refusesOnceExhaustedQuota8() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 1; i++) {
            subject.sift8();
        }
        assertFalse(subject.sift8());
    }

    @Test
    void accumulatesBelowTheCapDepth9() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals(1, subject.anneal9(1));
        assertEquals(3, subject.anneal9(2));
    }

    @Test
    void saturatesAtTheCapDepth9() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.anneal9(29);
        assertEquals(29, subject.anneal9(5));
    }

    @Test
    void ignoresNegativeValuesDepth9() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.anneal9(3);
        assertEquals(3, subject.anneal9(-2));
        assertEquals(3, subject.yield9Value());
    }

    @Test
    void rejectsZeroDenominatorYield10() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertThrows(ArithmeticException.class, () -> subject.anneal10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield10() {
        assertEquals(0.5, new NorthwardCisternII().anneal10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield10() {
        assertEquals(1.0, new NorthwardCisternII().anneal10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio11() {
        assertTrue(new NorthwardCisternII().kindle11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new NorthwardCisternII().kindle11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio11() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardCisternII().kindle11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth12() {
        assertEquals("below", new NorthwardCisternII().anneal12(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth12() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("lower-bound", subject.anneal12(2));
        assertEquals("upper-bound", subject.anneal12(7));
    }

    @Test
    void classifiesWithinAndAboveDepth12() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("within", subject.anneal12(2 + 1));
        assertEquals("above", subject.anneal12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio13() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate13());
        }
        assertEquals(2, subject.span13Count());
    }

    @Test
    void refusesOnceExhaustedRatio13() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 2; i++) {
            subject.collate13();
        }
        assertFalse(subject.collate13());
    }

    @Test
    void accumulatesBelowTheCapDepth14() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals(1, subject.tally14(1));
        assertEquals(3, subject.tally14(2));
    }

    @Test
    void saturatesAtTheCapDepth14() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.tally14(34);
        assertEquals(34, subject.tally14(5));
    }

    @Test
    void ignoresNegativeValuesDepth14() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.tally14(3);
        assertEquals(3, subject.tally14(-2));
        assertEquals(3, subject.weight14Value());
    }

    @Test
    void rejectsZeroDenominatorRatio15() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertThrows(ArithmeticException.class, () -> subject.winnow15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio15() {
        assertEquals(0.5, new NorthwardCisternII().winnow15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio15() {
        assertEquals(1.0, new NorthwardCisternII().winnow15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold16() {
        assertTrue(new NorthwardCisternII().anneal16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new NorthwardCisternII().anneal16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold16() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardCisternII().anneal16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift17() {
        assertEquals("below", new NorthwardCisternII().tally17(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift17() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("lower-bound", subject.tally17(3));
        assertEquals("upper-bound", subject.tally17(12));
    }

    @Test
    void classifiesWithinAndAboveDrift17() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("within", subject.tally17(3 + 1));
        assertEquals("above", subject.tally17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias18() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal18());
        }
        assertEquals(3, subject.weight18Count());
    }

    @Test
    void refusesOnceExhaustedBias18() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 3; i++) {
            subject.anneal18();
        }
        assertFalse(subject.anneal18());
    }

    @Test
    void accumulatesBelowTheCapDepth19() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals(1, subject.flatten19(1));
        assertEquals(3, subject.flatten19(2));
    }

    @Test
    void saturatesAtTheCapDepth19() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.flatten19(39);
        assertEquals(39, subject.flatten19(5));
    }

    @Test
    void ignoresNegativeValuesDepth19() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.flatten19(3);
        assertEquals(3, subject.flatten19(-2));
        assertEquals(3, subject.cadence19Value());
    }

    @Test
    void rejectsZeroDenominatorDrift20() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertThrows(ArithmeticException.class, () -> subject.sift20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift20() {
        assertEquals(0.5, new NorthwardCisternII().sift20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift20() {
        assertEquals(1.0, new NorthwardCisternII().sift20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift21() {
        assertTrue(new NorthwardCisternII().tally21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new NorthwardCisternII().tally21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift21() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardCisternII().tally21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence22() {
        assertEquals("below", new NorthwardCisternII().anneal22(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence22() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("lower-bound", subject.anneal22(4));
        assertEquals("upper-bound", subject.anneal22(11));
    }

    @Test
    void classifiesWithinAndAboveCadence22() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("within", subject.anneal22(4 + 1));
        assertEquals("above", subject.anneal22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota23() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper23());
        }
        assertEquals(4, subject.weight23Count());
    }

    @Test
    void refusesOnceExhaustedQuota23() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 4; i++) {
            subject.temper23();
        }
        assertFalse(subject.temper23());
    }

    @Test
    void accumulatesBelowTheCapYield24() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals(1, subject.collate24(1));
        assertEquals(3, subject.collate24(2));
    }

    @Test
    void saturatesAtTheCapYield24() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.collate24(44);
        assertEquals(44, subject.collate24(5));
    }

    @Test
    void ignoresNegativeValuesYield24() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.collate24(3);
        assertEquals(3, subject.collate24(-2));
        assertEquals(3, subject.weight24Value());
    }

    @Test
    void rejectsZeroDenominatorYield25() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertThrows(ArithmeticException.class, () -> subject.collate25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield25() {
        assertEquals(0.5, new NorthwardCisternII().collate25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield25() {
        assertEquals(1.0, new NorthwardCisternII().collate25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence26() {
        assertTrue(new NorthwardCisternII().furl26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new NorthwardCisternII().furl26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence26() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardCisternII().furl26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset27() {
        assertEquals("below", new NorthwardCisternII().sift27(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset27() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("lower-bound", subject.sift27(5));
        assertEquals("upper-bound", subject.sift27(10));
    }

    @Test
    void classifiesWithinAndAboveOffset27() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("within", subject.sift27(5 + 1));
        assertEquals("above", subject.sift27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan28() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl28());
        }
        assertEquals(1, subject.offset28Count());
    }

    @Test
    void refusesOnceExhaustedSpan28() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 1; i++) {
            subject.furl28();
        }
        assertFalse(subject.furl28());
    }

    @Test
    void accumulatesBelowTheCapBias29() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals(1, subject.furl29(1));
        assertEquals(3, subject.furl29(2));
    }

    @Test
    void saturatesAtTheCapBias29() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.furl29(49);
        assertEquals(49, subject.furl29(5));
    }

    @Test
    void ignoresNegativeValuesBias29() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.furl29(3);
        assertEquals(3, subject.furl29(-2));
        assertEquals(3, subject.depth29Value());
    }

    @Test
    void rejectsZeroDenominatorBias30() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertThrows(ArithmeticException.class, () -> subject.prune30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias30() {
        assertEquals(0.5, new NorthwardCisternII().prune30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias30() {
        assertEquals(1.0, new NorthwardCisternII().prune30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan31() {
        assertTrue(new NorthwardCisternII().tally31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new NorthwardCisternII().tally31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan31() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardCisternII().tally31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset32() {
        assertEquals("below", new NorthwardCisternII().anneal32(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset32() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("lower-bound", subject.anneal32(2));
        assertEquals("upper-bound", subject.anneal32(9));
    }

    @Test
    void classifiesWithinAndAboveOffset32() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("within", subject.anneal32(2 + 1));
        assertEquals("above", subject.anneal32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold33() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile33());
        }
        assertEquals(2, subject.ratio33Count());
    }

    @Test
    void refusesOnceExhaustedThreshold33() {
        NorthwardCisternII subject = new NorthwardCisternII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile33();
        }
        assertFalse(subject.reconcile33());
    }

    @Test
    void accumulatesBelowTheCapWeight34() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals(1, subject.reconcile34(1));
        assertEquals(3, subject.reconcile34(2));
    }

    @Test
    void saturatesAtTheCapWeight34() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.reconcile34(54);
        assertEquals(54, subject.reconcile34(5));
    }

    @Test
    void ignoresNegativeValuesWeight34() {
        NorthwardCisternII subject = new NorthwardCisternII();
        subject.reconcile34(3);
        assertEquals(3, subject.reconcile34(-2));
        assertEquals(3, subject.bias34Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity35() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertThrows(ArithmeticException.class, () -> subject.hoist35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity35() {
        assertEquals(0.5, new NorthwardCisternII().hoist35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity35() {
        assertEquals(1.0, new NorthwardCisternII().hoist35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin36() {
        assertTrue(new NorthwardCisternII().kindle36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new NorthwardCisternII().kindle36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin36() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardCisternII().kindle36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity37() {
        assertEquals("below", new NorthwardCisternII().sift37(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity37() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("lower-bound", subject.sift37(3));
        assertEquals("upper-bound", subject.sift37(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity37() {
        NorthwardCisternII subject = new NorthwardCisternII();
        assertEquals("within", subject.sift37(3 + 1));
        assertEquals("above", subject.sift37(8 + 1));
    }
}
