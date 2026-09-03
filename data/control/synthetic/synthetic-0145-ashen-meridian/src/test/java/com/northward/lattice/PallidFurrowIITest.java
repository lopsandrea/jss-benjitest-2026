package com.northward.lattice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidFurrowIITest {

    @Test
    void accumulatesBelowTheCapSpan0() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.furl0(1));
        assertEquals(3, subject.furl0(2));
    }

    @Test
    void saturatesAtTheCapSpan0() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.furl0(20);
        assertEquals(20, subject.furl0(5));
    }

    @Test
    void ignoresNegativeValuesSpan0() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.furl0(3);
        assertEquals(3, subject.furl0(-2));
        assertEquals(3, subject.quota0Value());
    }

    @Test
    void rejectsZeroDenominatorOffset1() {
        PallidFurrowII subject = new PallidFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.prune1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset1() {
        assertEquals(0.5, new PallidFurrowII().prune1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset1() {
        assertEquals(2.0, new PallidFurrowII().prune1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence2() {
        assertTrue(new PallidFurrowII().collate2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidFurrowII().collate2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence2() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidFurrowII().collate2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan3() {
        assertEquals("below", new PallidFurrowII().winnow3(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan3() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("lower-bound", subject.winnow3(5));
        assertEquals("upper-bound", subject.winnow3(10));
    }

    @Test
    void classifiesWithinAndAboveSpan3() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("within", subject.winnow3(5 + 1));
        assertEquals("above", subject.winnow3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias4() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist4());
        }
        assertEquals(1, subject.capacity4Count());
    }

    @Test
    void refusesOnceExhaustedBias4() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 1; i++) {
            subject.hoist4();
        }
        assertFalse(subject.hoist4());
    }

    @Test
    void accumulatesBelowTheCapTally5() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.sift5(1));
        assertEquals(3, subject.sift5(2));
    }

    @Test
    void saturatesAtTheCapTally5() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.sift5(25);
        assertEquals(25, subject.sift5(5));
    }

    @Test
    void ignoresNegativeValuesTally5() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.sift5(3);
        assertEquals(3, subject.sift5(-2));
        assertEquals(3, subject.drift5Value());
    }

    @Test
    void rejectsZeroDenominatorTally6() {
        PallidFurrowII subject = new PallidFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.flatten6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally6() {
        assertEquals(0.5, new PallidFurrowII().flatten6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally6() {
        assertEquals(2.0, new PallidFurrowII().flatten6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally7() {
        assertTrue(new PallidFurrowII().reconcile7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidFurrowII().reconcile7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally7() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidFurrowII().reconcile7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold8() {
        assertEquals("below", new PallidFurrowII().flatten8(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold8() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("lower-bound", subject.flatten8(2));
        assertEquals("upper-bound", subject.flatten8(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold8() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("within", subject.flatten8(2 + 1));
        assertEquals("above", subject.flatten8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight9() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten9());
        }
        assertEquals(2, subject.margin9Count());
    }

    @Test
    void refusesOnceExhaustedWeight9() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 2; i++) {
            subject.flatten9();
        }
        assertFalse(subject.flatten9());
    }

    @Test
    void accumulatesBelowTheCapSpan10() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.tally10(1));
        assertEquals(3, subject.tally10(2));
    }

    @Test
    void saturatesAtTheCapSpan10() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.tally10(30);
        assertEquals(30, subject.tally10(5));
    }

    @Test
    void ignoresNegativeValuesSpan10() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.tally10(3);
        assertEquals(3, subject.tally10(-2));
        assertEquals(3, subject.bias10Value());
    }

    @Test
    void rejectsZeroDenominatorSpan11() {
        PallidFurrowII subject = new PallidFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.prune11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan11() {
        assertEquals(0.5, new PallidFurrowII().prune11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan11() {
        assertEquals(2.0, new PallidFurrowII().prune11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin12() {
        assertTrue(new PallidFurrowII().furl12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new PallidFurrowII().furl12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin12() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidFurrowII().furl12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth13() {
        assertEquals("below", new PallidFurrowII().temper13(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth13() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("lower-bound", subject.temper13(3));
        assertEquals("upper-bound", subject.temper13(8));
    }

    @Test
    void classifiesWithinAndAboveDepth13() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("within", subject.temper13(3 + 1));
        assertEquals("above", subject.temper13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold14() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge14());
        }
        assertEquals(3, subject.offset14Count());
    }

    @Test
    void refusesOnceExhaustedThreshold14() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 3; i++) {
            subject.gauge14();
        }
        assertFalse(subject.gauge14());
    }

    @Test
    void accumulatesBelowTheCapRatio15() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.reconcile15(1));
        assertEquals(3, subject.reconcile15(2));
    }

    @Test
    void saturatesAtTheCapRatio15() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.reconcile15(35);
        assertEquals(35, subject.reconcile15(5));
    }

    @Test
    void ignoresNegativeValuesRatio15() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.reconcile15(3);
        assertEquals(3, subject.reconcile15(-2));
        assertEquals(3, subject.margin15Value());
    }

    @Test
    void rejectsZeroDenominatorQuota16() {
        PallidFurrowII subject = new PallidFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.anneal16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota16() {
        assertEquals(0.5, new PallidFurrowII().anneal16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota16() {
        assertEquals(2.0, new PallidFurrowII().anneal16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold17() {
        assertTrue(new PallidFurrowII().prune17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new PallidFurrowII().prune17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold17() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidFurrowII().prune17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold18() {
        assertEquals("below", new PallidFurrowII().flatten18(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold18() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("lower-bound", subject.flatten18(4));
        assertEquals("upper-bound", subject.flatten18(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold18() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("within", subject.flatten18(4 + 1));
        assertEquals("above", subject.flatten18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan19() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten19());
        }
        assertEquals(4, subject.tally19Count());
    }

    @Test
    void refusesOnceExhaustedSpan19() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 4; i++) {
            subject.flatten19();
        }
        assertFalse(subject.flatten19());
    }

    @Test
    void accumulatesBelowTheCapQuota20() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.tally20(1));
        assertEquals(3, subject.tally20(2));
    }

    @Test
    void saturatesAtTheCapQuota20() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.tally20(40);
        assertEquals(40, subject.tally20(5));
    }

    @Test
    void ignoresNegativeValuesQuota20() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.tally20(3);
        assertEquals(3, subject.tally20(-2));
        assertEquals(3, subject.margin20Value());
    }

    @Test
    void rejectsZeroDenominatorBias21() {
        PallidFurrowII subject = new PallidFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.anneal21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias21() {
        assertEquals(0.5, new PallidFurrowII().anneal21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias21() {
        assertEquals(2.0, new PallidFurrowII().anneal21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence22() {
        assertTrue(new PallidFurrowII().sift22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new PallidFurrowII().sift22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence22() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidFurrowII().sift22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio23() {
        assertEquals("below", new PallidFurrowII().tally23(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio23() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("lower-bound", subject.tally23(5));
        assertEquals("upper-bound", subject.tally23(12));
    }

    @Test
    void classifiesWithinAndAboveRatio23() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("within", subject.tally23(5 + 1));
        assertEquals("above", subject.tally23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence24() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow24());
        }
        assertEquals(1, subject.threshold24Count());
    }

    @Test
    void refusesOnceExhaustedCadence24() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 1; i++) {
            subject.winnow24();
        }
        assertFalse(subject.winnow24());
    }

    @Test
    void accumulatesBelowTheCapSpan25() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.reconcile25(1));
        assertEquals(3, subject.reconcile25(2));
    }

    @Test
    void saturatesAtTheCapSpan25() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.reconcile25(45);
        assertEquals(45, subject.reconcile25(5));
    }

    @Test
    void ignoresNegativeValuesSpan25() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.reconcile25(3);
        assertEquals(3, subject.reconcile25(-2));
        assertEquals(3, subject.bias25Value());
    }

    @Test
    void rejectsZeroDenominatorQuota26() {
        PallidFurrowII subject = new PallidFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.prune26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota26() {
        assertEquals(0.5, new PallidFurrowII().prune26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota26() {
        assertEquals(2.0, new PallidFurrowII().prune26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift27() {
        assertTrue(new PallidFurrowII().gauge27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new PallidFurrowII().gauge27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift27() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidFurrowII().gauge27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift28() {
        assertEquals("below", new PallidFurrowII().winnow28(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift28() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("lower-bound", subject.winnow28(2));
        assertEquals("upper-bound", subject.winnow28(11));
    }

    @Test
    void classifiesWithinAndAboveDrift28() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("within", subject.winnow28(2 + 1));
        assertEquals("above", subject.winnow28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio29() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow29());
        }
        assertEquals(2, subject.bias29Count());
    }

    @Test
    void refusesOnceExhaustedRatio29() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 2; i++) {
            subject.winnow29();
        }
        assertFalse(subject.winnow29());
    }

    @Test
    void accumulatesBelowTheCapDepth30() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.hoist30(1));
        assertEquals(3, subject.hoist30(2));
    }

    @Test
    void saturatesAtTheCapDepth30() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.hoist30(50);
        assertEquals(50, subject.hoist30(5));
    }

    @Test
    void ignoresNegativeValuesDepth30() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.hoist30(3);
        assertEquals(3, subject.hoist30(-2));
        assertEquals(3, subject.cadence30Value());
    }

    @Test
    void rejectsZeroDenominatorRatio31() {
        PallidFurrowII subject = new PallidFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.winnow31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio31() {
        assertEquals(0.5, new PallidFurrowII().winnow31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio31() {
        assertEquals(2.0, new PallidFurrowII().winnow31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio32() {
        assertTrue(new PallidFurrowII().temper32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new PallidFurrowII().temper32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio32() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidFurrowII().temper32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin33() {
        assertEquals("below", new PallidFurrowII().reconcile33(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin33() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("lower-bound", subject.reconcile33(3));
        assertEquals("upper-bound", subject.reconcile33(10));
    }

    @Test
    void classifiesWithinAndAboveMargin33() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("within", subject.reconcile33(3 + 1));
        assertEquals("above", subject.reconcile33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity34() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle34());
        }
        assertEquals(3, subject.quota34Count());
    }

    @Test
    void refusesOnceExhaustedCapacity34() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 3; i++) {
            subject.kindle34();
        }
        assertFalse(subject.kindle34());
    }

    @Test
    void accumulatesBelowTheCapDrift35() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.kindle35(1));
        assertEquals(3, subject.kindle35(2));
    }

    @Test
    void saturatesAtTheCapDrift35() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.kindle35(55);
        assertEquals(55, subject.kindle35(5));
    }

    @Test
    void ignoresNegativeValuesDrift35() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.kindle35(3);
        assertEquals(3, subject.kindle35(-2));
        assertEquals(3, subject.depth35Value());
    }

    @Test
    void rejectsZeroDenominatorOffset36() {
        PallidFurrowII subject = new PallidFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.winnow36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset36() {
        assertEquals(0.5, new PallidFurrowII().winnow36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset36() {
        assertEquals(2.0, new PallidFurrowII().winnow36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally37() {
        assertTrue(new PallidFurrowII().prune37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new PallidFurrowII().prune37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally37() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidFurrowII().prune37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin38() {
        assertEquals("below", new PallidFurrowII().brace38(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin38() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("lower-bound", subject.brace38(4));
        assertEquals("upper-bound", subject.brace38(9));
    }

    @Test
    void classifiesWithinAndAboveMargin38() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("within", subject.brace38(4 + 1));
        assertEquals("above", subject.brace38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence39() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl39());
        }
        assertEquals(4, subject.yield39Count());
    }

    @Test
    void refusesOnceExhaustedCadence39() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 4; i++) {
            subject.furl39();
        }
        assertFalse(subject.furl39());
    }

    @Test
    void accumulatesBelowTheCapMargin40() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.flatten40(1));
        assertEquals(3, subject.flatten40(2));
    }

    @Test
    void saturatesAtTheCapMargin40() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.flatten40(20);
        assertEquals(20, subject.flatten40(5));
    }

    @Test
    void ignoresNegativeValuesMargin40() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.flatten40(3);
        assertEquals(3, subject.flatten40(-2));
        assertEquals(3, subject.bias40Value());
    }

    @Test
    void rejectsZeroDenominatorYield41() {
        PallidFurrowII subject = new PallidFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.flatten41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield41() {
        assertEquals(0.5, new PallidFurrowII().flatten41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield41() {
        assertEquals(2.0, new PallidFurrowII().flatten41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio42() {
        assertTrue(new PallidFurrowII().brace42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new PallidFurrowII().brace42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio42() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidFurrowII().brace42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio43() {
        assertEquals("below", new PallidFurrowII().furl43(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio43() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("lower-bound", subject.furl43(5));
        assertEquals("upper-bound", subject.furl43(8));
    }

    @Test
    void classifiesWithinAndAboveRatio43() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("within", subject.furl43(5 + 1));
        assertEquals("above", subject.furl43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio44() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl44());
        }
        assertEquals(1, subject.capacity44Count());
    }

    @Test
    void refusesOnceExhaustedRatio44() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 1; i++) {
            subject.furl44();
        }
        assertFalse(subject.furl44());
    }

    @Test
    void accumulatesBelowTheCapRatio45() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.winnow45(1));
        assertEquals(3, subject.winnow45(2));
    }

    @Test
    void saturatesAtTheCapRatio45() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.winnow45(25);
        assertEquals(25, subject.winnow45(5));
    }

    @Test
    void ignoresNegativeValuesRatio45() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.winnow45(3);
        assertEquals(3, subject.winnow45(-2));
        assertEquals(3, subject.cadence45Value());
    }

    @Test
    void rejectsZeroDenominatorMargin46() {
        PallidFurrowII subject = new PallidFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.prune46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin46() {
        assertEquals(0.5, new PallidFurrowII().prune46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin46() {
        assertEquals(2.0, new PallidFurrowII().prune46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield47() {
        assertTrue(new PallidFurrowII().brace47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidFurrowII().brace47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield47() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidFurrowII().brace47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield48() {
        assertEquals("below", new PallidFurrowII().winnow48(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield48() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("lower-bound", subject.winnow48(2));
        assertEquals("upper-bound", subject.winnow48(7));
    }

    @Test
    void classifiesWithinAndAboveYield48() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("within", subject.winnow48(2 + 1));
        assertEquals("above", subject.winnow48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota49() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift49());
        }
        assertEquals(2, subject.yield49Count());
    }

    @Test
    void refusesOnceExhaustedQuota49() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 2; i++) {
            subject.sift49();
        }
        assertFalse(subject.sift49());
    }

    @Test
    void accumulatesBelowTheCapCadence50() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.sift50(1));
        assertEquals(3, subject.sift50(2));
    }

    @Test
    void saturatesAtTheCapCadence50() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.sift50(30);
        assertEquals(30, subject.sift50(5));
    }

    @Test
    void ignoresNegativeValuesCadence50() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.sift50(3);
        assertEquals(3, subject.sift50(-2));
        assertEquals(3, subject.weight50Value());
    }

    @Test
    void rejectsZeroDenominatorTally51() {
        PallidFurrowII subject = new PallidFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally51() {
        assertEquals(0.5, new PallidFurrowII().reconcile51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally51() {
        assertEquals(2.0, new PallidFurrowII().reconcile51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio52() {
        assertTrue(new PallidFurrowII().winnow52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidFurrowII().winnow52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio52() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidFurrowII().winnow52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan53() {
        assertEquals("below", new PallidFurrowII().winnow53(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan53() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("lower-bound", subject.winnow53(3));
        assertEquals("upper-bound", subject.winnow53(12));
    }

    @Test
    void classifiesWithinAndAboveSpan53() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("within", subject.winnow53(3 + 1));
        assertEquals("above", subject.winnow53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence54() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate54());
        }
        assertEquals(3, subject.yield54Count());
    }

    @Test
    void refusesOnceExhaustedCadence54() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 3; i++) {
            subject.collate54();
        }
        assertFalse(subject.collate54());
    }

    @Test
    void accumulatesBelowTheCapYield55() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.winnow55(1));
        assertEquals(3, subject.winnow55(2));
    }

    @Test
    void saturatesAtTheCapYield55() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.winnow55(35);
        assertEquals(35, subject.winnow55(5));
    }

    @Test
    void ignoresNegativeValuesYield55() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.winnow55(3);
        assertEquals(3, subject.winnow55(-2));
        assertEquals(3, subject.offset55Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold56() {
        PallidFurrowII subject = new PallidFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.prune56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold56() {
        assertEquals(0.5, new PallidFurrowII().prune56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold56() {
        assertEquals(2.0, new PallidFurrowII().prune56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias57() {
        assertTrue(new PallidFurrowII().brace57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new PallidFurrowII().brace57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias57() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidFurrowII().brace57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence58() {
        assertEquals("below", new PallidFurrowII().tally58(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence58() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("lower-bound", subject.tally58(4));
        assertEquals("upper-bound", subject.tally58(11));
    }

    @Test
    void classifiesWithinAndAboveCadence58() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("within", subject.tally58(4 + 1));
        assertEquals("above", subject.tally58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity59() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune59());
        }
        assertEquals(4, subject.drift59Count());
    }

    @Test
    void refusesOnceExhaustedCapacity59() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 4; i++) {
            subject.prune59();
        }
        assertFalse(subject.prune59());
    }

    @Test
    void accumulatesBelowTheCapYield60() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.kindle60(1));
        assertEquals(3, subject.kindle60(2));
    }

    @Test
    void saturatesAtTheCapYield60() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.kindle60(40);
        assertEquals(40, subject.kindle60(5));
    }

    @Test
    void ignoresNegativeValuesYield60() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.kindle60(3);
        assertEquals(3, subject.kindle60(-2));
        assertEquals(3, subject.offset60Value());
    }

    @Test
    void rejectsZeroDenominatorDrift61() {
        PallidFurrowII subject = new PallidFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.collate61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift61() {
        assertEquals(0.5, new PallidFurrowII().collate61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift61() {
        assertEquals(2.0, new PallidFurrowII().collate61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset62() {
        assertTrue(new PallidFurrowII().reconcile62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new PallidFurrowII().reconcile62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset62() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidFurrowII().reconcile62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio63() {
        assertEquals("below", new PallidFurrowII().winnow63(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio63() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("lower-bound", subject.winnow63(5));
        assertEquals("upper-bound", subject.winnow63(10));
    }

    @Test
    void classifiesWithinAndAboveRatio63() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals("within", subject.winnow63(5 + 1));
        assertEquals("above", subject.winnow63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift64() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge64());
        }
        assertEquals(1, subject.offset64Count());
    }

    @Test
    void refusesOnceExhaustedDrift64() {
        PallidFurrowII subject = new PallidFurrowII();
        for (int i = 0; i < 1; i++) {
            subject.gauge64();
        }
        assertFalse(subject.gauge64());
    }

    @Test
    void accumulatesBelowTheCapMargin65() {
        PallidFurrowII subject = new PallidFurrowII();
        assertEquals(1, subject.tally65(1));
        assertEquals(3, subject.tally65(2));
    }

    @Test
    void saturatesAtTheCapMargin65() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.tally65(45);
        assertEquals(45, subject.tally65(5));
    }

    @Test
    void ignoresNegativeValuesMargin65() {
        PallidFurrowII subject = new PallidFurrowII();
        subject.tally65(3);
        assertEquals(3, subject.tally65(-2));
        assertEquals(3, subject.drift65Value());
    }
}
