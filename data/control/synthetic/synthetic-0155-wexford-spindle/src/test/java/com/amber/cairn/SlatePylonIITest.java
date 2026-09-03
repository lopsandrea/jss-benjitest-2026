package com.amber.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlatePylonIITest {

    @Test
    void accumulatesBelowTheCapRatio0() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals(1, subject.collate0(1));
        assertEquals(3, subject.collate0(2));
    }

    @Test
    void saturatesAtTheCapRatio0() {
        SlatePylonII subject = new SlatePylonII();
        subject.collate0(20);
        assertEquals(20, subject.collate0(5));
    }

    @Test
    void ignoresNegativeValuesRatio0() {
        SlatePylonII subject = new SlatePylonII();
        subject.collate0(3);
        assertEquals(3, subject.collate0(-2));
        assertEquals(3, subject.cadence0Value());
    }

    @Test
    void rejectsZeroDenominatorRatio1() {
        SlatePylonII subject = new SlatePylonII();
        assertThrows(ArithmeticException.class, () -> subject.temper1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio1() {
        assertEquals(0.5, new SlatePylonII().temper1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio1() {
        assertEquals(2.0, new SlatePylonII().temper1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth2() {
        assertTrue(new SlatePylonII().kindle2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new SlatePylonII().kindle2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth2() {
        assertEquals(java.util.Arrays.asList(8),
                new SlatePylonII().kindle2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight3() {
        assertEquals("below", new SlatePylonII().brace3(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight3() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("lower-bound", subject.brace3(5));
        assertEquals("upper-bound", subject.brace3(10));
    }

    @Test
    void classifiesWithinAndAboveWeight3() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("within", subject.brace3(5 + 1));
        assertEquals("above", subject.brace3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally4() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl4());
        }
        assertEquals(1, subject.yield4Count());
    }

    @Test
    void refusesOnceExhaustedTally4() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 1; i++) {
            subject.furl4();
        }
        assertFalse(subject.furl4());
    }

    @Test
    void accumulatesBelowTheCapSpan5() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals(1, subject.gauge5(1));
        assertEquals(3, subject.gauge5(2));
    }

    @Test
    void saturatesAtTheCapSpan5() {
        SlatePylonII subject = new SlatePylonII();
        subject.gauge5(25);
        assertEquals(25, subject.gauge5(5));
    }

    @Test
    void ignoresNegativeValuesSpan5() {
        SlatePylonII subject = new SlatePylonII();
        subject.gauge5(3);
        assertEquals(3, subject.gauge5(-2));
        assertEquals(3, subject.bias5Value());
    }

    @Test
    void rejectsZeroDenominatorRatio6() {
        SlatePylonII subject = new SlatePylonII();
        assertThrows(ArithmeticException.class, () -> subject.hoist6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio6() {
        assertEquals(0.5, new SlatePylonII().hoist6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio6() {
        assertEquals(2.0, new SlatePylonII().hoist6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias7() {
        assertTrue(new SlatePylonII().temper7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new SlatePylonII().temper7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias7() {
        assertEquals(java.util.Arrays.asList(13),
                new SlatePylonII().temper7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence8() {
        assertEquals("below", new SlatePylonII().reconcile8(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence8() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("lower-bound", subject.reconcile8(2));
        assertEquals("upper-bound", subject.reconcile8(9));
    }

    @Test
    void classifiesWithinAndAboveCadence8() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("within", subject.reconcile8(2 + 1));
        assertEquals("above", subject.reconcile8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset9() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow9());
        }
        assertEquals(2, subject.margin9Count());
    }

    @Test
    void refusesOnceExhaustedOffset9() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 2; i++) {
            subject.winnow9();
        }
        assertFalse(subject.winnow9());
    }

    @Test
    void accumulatesBelowTheCapSpan10() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals(1, subject.brace10(1));
        assertEquals(3, subject.brace10(2));
    }

    @Test
    void saturatesAtTheCapSpan10() {
        SlatePylonII subject = new SlatePylonII();
        subject.brace10(30);
        assertEquals(30, subject.brace10(5));
    }

    @Test
    void ignoresNegativeValuesSpan10() {
        SlatePylonII subject = new SlatePylonII();
        subject.brace10(3);
        assertEquals(3, subject.brace10(-2));
        assertEquals(3, subject.cadence10Value());
    }

    @Test
    void rejectsZeroDenominatorYield11() {
        SlatePylonII subject = new SlatePylonII();
        assertThrows(ArithmeticException.class, () -> subject.temper11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield11() {
        assertEquals(0.5, new SlatePylonII().temper11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield11() {
        assertEquals(2.0, new SlatePylonII().temper11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield12() {
        assertTrue(new SlatePylonII().collate12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new SlatePylonII().collate12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield12() {
        assertEquals(java.util.Arrays.asList(9),
                new SlatePylonII().collate12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally13() {
        assertEquals("below", new SlatePylonII().kindle13(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally13() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("lower-bound", subject.kindle13(3));
        assertEquals("upper-bound", subject.kindle13(8));
    }

    @Test
    void classifiesWithinAndAboveTally13() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("within", subject.kindle13(3 + 1));
        assertEquals("above", subject.kindle13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally14() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally14());
        }
        assertEquals(3, subject.drift14Count());
    }

    @Test
    void refusesOnceExhaustedTally14() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 3; i++) {
            subject.tally14();
        }
        assertFalse(subject.tally14());
    }

    @Test
    void accumulatesBelowTheCapCadence15() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals(1, subject.reconcile15(1));
        assertEquals(3, subject.reconcile15(2));
    }

    @Test
    void saturatesAtTheCapCadence15() {
        SlatePylonII subject = new SlatePylonII();
        subject.reconcile15(35);
        assertEquals(35, subject.reconcile15(5));
    }

    @Test
    void ignoresNegativeValuesCadence15() {
        SlatePylonII subject = new SlatePylonII();
        subject.reconcile15(3);
        assertEquals(3, subject.reconcile15(-2));
        assertEquals(3, subject.yield15Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold16() {
        SlatePylonII subject = new SlatePylonII();
        assertThrows(ArithmeticException.class, () -> subject.winnow16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold16() {
        assertEquals(0.5, new SlatePylonII().winnow16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold16() {
        assertEquals(2.0, new SlatePylonII().winnow16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset17() {
        assertTrue(new SlatePylonII().sift17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new SlatePylonII().sift17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset17() {
        assertEquals(java.util.Arrays.asList(14),
                new SlatePylonII().sift17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias18() {
        assertEquals("below", new SlatePylonII().flatten18(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias18() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("lower-bound", subject.flatten18(4));
        assertEquals("upper-bound", subject.flatten18(7));
    }

    @Test
    void classifiesWithinAndAboveBias18() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("within", subject.flatten18(4 + 1));
        assertEquals("above", subject.flatten18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield19() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle19());
        }
        assertEquals(4, subject.weight19Count());
    }

    @Test
    void refusesOnceExhaustedYield19() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 4; i++) {
            subject.kindle19();
        }
        assertFalse(subject.kindle19());
    }

    @Test
    void accumulatesBelowTheCapMargin20() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals(1, subject.kindle20(1));
        assertEquals(3, subject.kindle20(2));
    }

    @Test
    void saturatesAtTheCapMargin20() {
        SlatePylonII subject = new SlatePylonII();
        subject.kindle20(40);
        assertEquals(40, subject.kindle20(5));
    }

    @Test
    void ignoresNegativeValuesMargin20() {
        SlatePylonII subject = new SlatePylonII();
        subject.kindle20(3);
        assertEquals(3, subject.kindle20(-2));
        assertEquals(3, subject.drift20Value());
    }

    @Test
    void rejectsZeroDenominatorDepth21() {
        SlatePylonII subject = new SlatePylonII();
        assertThrows(ArithmeticException.class, () -> subject.gauge21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth21() {
        assertEquals(0.5, new SlatePylonII().gauge21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth21() {
        assertEquals(2.0, new SlatePylonII().gauge21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold22() {
        assertTrue(new SlatePylonII().temper22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new SlatePylonII().temper22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold22() {
        assertEquals(java.util.Arrays.asList(10),
                new SlatePylonII().temper22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin23() {
        assertEquals("below", new SlatePylonII().tally23(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin23() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("lower-bound", subject.tally23(5));
        assertEquals("upper-bound", subject.tally23(12));
    }

    @Test
    void classifiesWithinAndAboveMargin23() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("within", subject.tally23(5 + 1));
        assertEquals("above", subject.tally23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold24() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl24());
        }
        assertEquals(1, subject.tally24Count());
    }

    @Test
    void refusesOnceExhaustedThreshold24() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 1; i++) {
            subject.furl24();
        }
        assertFalse(subject.furl24());
    }

    @Test
    void accumulatesBelowTheCapWeight25() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals(1, subject.flatten25(1));
        assertEquals(3, subject.flatten25(2));
    }

    @Test
    void saturatesAtTheCapWeight25() {
        SlatePylonII subject = new SlatePylonII();
        subject.flatten25(45);
        assertEquals(45, subject.flatten25(5));
    }

    @Test
    void ignoresNegativeValuesWeight25() {
        SlatePylonII subject = new SlatePylonII();
        subject.flatten25(3);
        assertEquals(3, subject.flatten25(-2));
        assertEquals(3, subject.quota25Value());
    }

    @Test
    void rejectsZeroDenominatorDepth26() {
        SlatePylonII subject = new SlatePylonII();
        assertThrows(ArithmeticException.class, () -> subject.flatten26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth26() {
        assertEquals(0.5, new SlatePylonII().flatten26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth26() {
        assertEquals(2.0, new SlatePylonII().flatten26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold27() {
        assertTrue(new SlatePylonII().brace27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new SlatePylonII().brace27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold27() {
        assertEquals(java.util.Arrays.asList(6),
                new SlatePylonII().brace27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio28() {
        assertEquals("below", new SlatePylonII().gauge28(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio28() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("lower-bound", subject.gauge28(2));
        assertEquals("upper-bound", subject.gauge28(11));
    }

    @Test
    void classifiesWithinAndAboveRatio28() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("within", subject.gauge28(2 + 1));
        assertEquals("above", subject.gauge28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth29() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten29());
        }
        assertEquals(2, subject.ratio29Count());
    }

    @Test
    void refusesOnceExhaustedDepth29() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 2; i++) {
            subject.flatten29();
        }
        assertFalse(subject.flatten29());
    }

    @Test
    void accumulatesBelowTheCapBias30() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals(1, subject.kindle30(1));
        assertEquals(3, subject.kindle30(2));
    }

    @Test
    void saturatesAtTheCapBias30() {
        SlatePylonII subject = new SlatePylonII();
        subject.kindle30(50);
        assertEquals(50, subject.kindle30(5));
    }

    @Test
    void ignoresNegativeValuesBias30() {
        SlatePylonII subject = new SlatePylonII();
        subject.kindle30(3);
        assertEquals(3, subject.kindle30(-2));
        assertEquals(3, subject.drift30Value());
    }

    @Test
    void rejectsZeroDenominatorCadence31() {
        SlatePylonII subject = new SlatePylonII();
        assertThrows(ArithmeticException.class, () -> subject.collate31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence31() {
        assertEquals(0.5, new SlatePylonII().collate31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence31() {
        assertEquals(2.0, new SlatePylonII().collate31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight32() {
        assertTrue(new SlatePylonII().flatten32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new SlatePylonII().flatten32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight32() {
        assertEquals(java.util.Arrays.asList(11),
                new SlatePylonII().flatten32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold33() {
        assertEquals("below", new SlatePylonII().anneal33(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold33() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("lower-bound", subject.anneal33(3));
        assertEquals("upper-bound", subject.anneal33(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold33() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("within", subject.anneal33(3 + 1));
        assertEquals("above", subject.anneal33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity34() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper34());
        }
        assertEquals(3, subject.tally34Count());
    }

    @Test
    void refusesOnceExhaustedCapacity34() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 3; i++) {
            subject.temper34();
        }
        assertFalse(subject.temper34());
    }

    @Test
    void accumulatesBelowTheCapQuota35() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals(1, subject.temper35(1));
        assertEquals(3, subject.temper35(2));
    }

    @Test
    void saturatesAtTheCapQuota35() {
        SlatePylonII subject = new SlatePylonII();
        subject.temper35(55);
        assertEquals(55, subject.temper35(5));
    }

    @Test
    void ignoresNegativeValuesQuota35() {
        SlatePylonII subject = new SlatePylonII();
        subject.temper35(3);
        assertEquals(3, subject.temper35(-2));
        assertEquals(3, subject.ratio35Value());
    }

    @Test
    void rejectsZeroDenominatorDrift36() {
        SlatePylonII subject = new SlatePylonII();
        assertThrows(ArithmeticException.class, () -> subject.winnow36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift36() {
        assertEquals(0.5, new SlatePylonII().winnow36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift36() {
        assertEquals(2.0, new SlatePylonII().winnow36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan37() {
        assertTrue(new SlatePylonII().flatten37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new SlatePylonII().flatten37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan37() {
        assertEquals(java.util.Arrays.asList(7),
                new SlatePylonII().flatten37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight38() {
        assertEquals("below", new SlatePylonII().gauge38(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight38() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("lower-bound", subject.gauge38(4));
        assertEquals("upper-bound", subject.gauge38(9));
    }

    @Test
    void classifiesWithinAndAboveWeight38() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("within", subject.gauge38(4 + 1));
        assertEquals("above", subject.gauge38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold39() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune39());
        }
        assertEquals(4, subject.depth39Count());
    }

    @Test
    void refusesOnceExhaustedThreshold39() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 4; i++) {
            subject.prune39();
        }
        assertFalse(subject.prune39());
    }

    @Test
    void accumulatesBelowTheCapSpan40() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals(1, subject.tally40(1));
        assertEquals(3, subject.tally40(2));
    }

    @Test
    void saturatesAtTheCapSpan40() {
        SlatePylonII subject = new SlatePylonII();
        subject.tally40(20);
        assertEquals(20, subject.tally40(5));
    }

    @Test
    void ignoresNegativeValuesSpan40() {
        SlatePylonII subject = new SlatePylonII();
        subject.tally40(3);
        assertEquals(3, subject.tally40(-2));
        assertEquals(3, subject.cadence40Value());
    }

    @Test
    void rejectsZeroDenominatorQuota41() {
        SlatePylonII subject = new SlatePylonII();
        assertThrows(ArithmeticException.class, () -> subject.anneal41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota41() {
        assertEquals(0.5, new SlatePylonII().anneal41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota41() {
        assertEquals(2.0, new SlatePylonII().anneal41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth42() {
        assertTrue(new SlatePylonII().temper42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new SlatePylonII().temper42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth42() {
        assertEquals(java.util.Arrays.asList(12),
                new SlatePylonII().temper42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio43() {
        assertEquals("below", new SlatePylonII().brace43(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio43() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("lower-bound", subject.brace43(5));
        assertEquals("upper-bound", subject.brace43(8));
    }

    @Test
    void classifiesWithinAndAboveRatio43() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("within", subject.brace43(5 + 1));
        assertEquals("above", subject.brace43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio44() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist44());
        }
        assertEquals(1, subject.weight44Count());
    }

    @Test
    void refusesOnceExhaustedRatio44() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 1; i++) {
            subject.hoist44();
        }
        assertFalse(subject.hoist44());
    }

    @Test
    void accumulatesBelowTheCapCadence45() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals(1, subject.kindle45(1));
        assertEquals(3, subject.kindle45(2));
    }

    @Test
    void saturatesAtTheCapCadence45() {
        SlatePylonII subject = new SlatePylonII();
        subject.kindle45(25);
        assertEquals(25, subject.kindle45(5));
    }

    @Test
    void ignoresNegativeValuesCadence45() {
        SlatePylonII subject = new SlatePylonII();
        subject.kindle45(3);
        assertEquals(3, subject.kindle45(-2));
        assertEquals(3, subject.drift45Value());
    }

    @Test
    void rejectsZeroDenominatorDepth46() {
        SlatePylonII subject = new SlatePylonII();
        assertThrows(ArithmeticException.class, () -> subject.gauge46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth46() {
        assertEquals(0.5, new SlatePylonII().gauge46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth46() {
        assertEquals(2.0, new SlatePylonII().gauge46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield47() {
        assertTrue(new SlatePylonII().anneal47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new SlatePylonII().anneal47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield47() {
        assertEquals(java.util.Arrays.asList(8),
                new SlatePylonII().anneal47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift48() {
        assertEquals("below", new SlatePylonII().winnow48(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift48() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("lower-bound", subject.winnow48(2));
        assertEquals("upper-bound", subject.winnow48(7));
    }

    @Test
    void classifiesWithinAndAboveDrift48() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("within", subject.winnow48(2 + 1));
        assertEquals("above", subject.winnow48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin49() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate49());
        }
        assertEquals(2, subject.bias49Count());
    }

    @Test
    void refusesOnceExhaustedMargin49() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 2; i++) {
            subject.collate49();
        }
        assertFalse(subject.collate49());
    }

    @Test
    void accumulatesBelowTheCapTally50() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals(1, subject.anneal50(1));
        assertEquals(3, subject.anneal50(2));
    }

    @Test
    void saturatesAtTheCapTally50() {
        SlatePylonII subject = new SlatePylonII();
        subject.anneal50(30);
        assertEquals(30, subject.anneal50(5));
    }

    @Test
    void ignoresNegativeValuesTally50() {
        SlatePylonII subject = new SlatePylonII();
        subject.anneal50(3);
        assertEquals(3, subject.anneal50(-2));
        assertEquals(3, subject.margin50Value());
    }

    @Test
    void rejectsZeroDenominatorQuota51() {
        SlatePylonII subject = new SlatePylonII();
        assertThrows(ArithmeticException.class, () -> subject.collate51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota51() {
        assertEquals(0.5, new SlatePylonII().collate51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota51() {
        assertEquals(2.0, new SlatePylonII().collate51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield52() {
        assertTrue(new SlatePylonII().reconcile52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new SlatePylonII().reconcile52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield52() {
        assertEquals(java.util.Arrays.asList(13),
                new SlatePylonII().reconcile52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold53() {
        assertEquals("below", new SlatePylonII().hoist53(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold53() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("lower-bound", subject.hoist53(3));
        assertEquals("upper-bound", subject.hoist53(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold53() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("within", subject.hoist53(3 + 1));
        assertEquals("above", subject.hoist53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally54() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally54());
        }
        assertEquals(3, subject.depth54Count());
    }

    @Test
    void refusesOnceExhaustedTally54() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 3; i++) {
            subject.tally54();
        }
        assertFalse(subject.tally54());
    }

    @Test
    void accumulatesBelowTheCapQuota55() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals(1, subject.anneal55(1));
        assertEquals(3, subject.anneal55(2));
    }

    @Test
    void saturatesAtTheCapQuota55() {
        SlatePylonII subject = new SlatePylonII();
        subject.anneal55(35);
        assertEquals(35, subject.anneal55(5));
    }

    @Test
    void ignoresNegativeValuesQuota55() {
        SlatePylonII subject = new SlatePylonII();
        subject.anneal55(3);
        assertEquals(3, subject.anneal55(-2));
        assertEquals(3, subject.capacity55Value());
    }

    @Test
    void rejectsZeroDenominatorRatio56() {
        SlatePylonII subject = new SlatePylonII();
        assertThrows(ArithmeticException.class, () -> subject.furl56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio56() {
        assertEquals(0.5, new SlatePylonII().furl56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio56() {
        assertEquals(2.0, new SlatePylonII().furl56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth57() {
        assertTrue(new SlatePylonII().flatten57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new SlatePylonII().flatten57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth57() {
        assertEquals(java.util.Arrays.asList(9),
                new SlatePylonII().flatten57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias58() {
        assertEquals("below", new SlatePylonII().kindle58(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias58() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("lower-bound", subject.kindle58(4));
        assertEquals("upper-bound", subject.kindle58(11));
    }

    @Test
    void classifiesWithinAndAboveBias58() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals("within", subject.kindle58(4 + 1));
        assertEquals("above", subject.kindle58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield59() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle59());
        }
        assertEquals(4, subject.weight59Count());
    }

    @Test
    void refusesOnceExhaustedYield59() {
        SlatePylonII subject = new SlatePylonII();
        for (int i = 0; i < 4; i++) {
            subject.kindle59();
        }
        assertFalse(subject.kindle59());
    }

    @Test
    void accumulatesBelowTheCapMargin60() {
        SlatePylonII subject = new SlatePylonII();
        assertEquals(1, subject.brace60(1));
        assertEquals(3, subject.brace60(2));
    }

    @Test
    void saturatesAtTheCapMargin60() {
        SlatePylonII subject = new SlatePylonII();
        subject.brace60(40);
        assertEquals(40, subject.brace60(5));
    }

    @Test
    void ignoresNegativeValuesMargin60() {
        SlatePylonII subject = new SlatePylonII();
        subject.brace60(3);
        assertEquals(3, subject.brace60(-2));
        assertEquals(3, subject.weight60Value());
    }

    @Test
    void rejectsZeroDenominatorQuota61() {
        SlatePylonII subject = new SlatePylonII();
        assertThrows(ArithmeticException.class, () -> subject.hoist61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota61() {
        assertEquals(0.5, new SlatePylonII().hoist61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota61() {
        assertEquals(2.0, new SlatePylonII().hoist61(1000.0, 1.0), 1e-9);
    }
}
