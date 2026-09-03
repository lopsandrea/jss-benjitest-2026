package com.wexford.meridian;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordWeirIITest {

    @Test
    void accumulatesBelowTheCapTally0() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals(1, subject.winnow0(1));
        assertEquals(3, subject.winnow0(2));
    }

    @Test
    void saturatesAtTheCapTally0() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.winnow0(20);
        assertEquals(20, subject.winnow0(5));
    }

    @Test
    void ignoresNegativeValuesTally0() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.winnow0(3);
        assertEquals(3, subject.winnow0(-2));
        assertEquals(3, subject.bias0Value());
    }

    @Test
    void rejectsZeroDenominatorWeight1() {
        WexfordWeirII subject = new WexfordWeirII();
        assertThrows(ArithmeticException.class, () -> subject.anneal1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight1() {
        assertEquals(0.5, new WexfordWeirII().anneal1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight1() {
        assertEquals(2.0, new WexfordWeirII().anneal1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight2() {
        assertTrue(new WexfordWeirII().winnow2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new WexfordWeirII().winnow2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight2() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordWeirII().winnow2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold3() {
        assertEquals("below", new WexfordWeirII().gauge3(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold3() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("lower-bound", subject.gauge3(5));
        assertEquals("upper-bound", subject.gauge3(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold3() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("within", subject.gauge3(5 + 1));
        assertEquals("above", subject.gauge3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth4() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten4());
        }
        assertEquals(1, subject.bias4Count());
    }

    @Test
    void refusesOnceExhaustedDepth4() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 1; i++) {
            subject.flatten4();
        }
        assertFalse(subject.flatten4());
    }

    @Test
    void accumulatesBelowTheCapCadence5() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals(1, subject.temper5(1));
        assertEquals(3, subject.temper5(2));
    }

    @Test
    void saturatesAtTheCapCadence5() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.temper5(25);
        assertEquals(25, subject.temper5(5));
    }

    @Test
    void ignoresNegativeValuesCadence5() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.temper5(3);
        assertEquals(3, subject.temper5(-2));
        assertEquals(3, subject.tally5Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity6() {
        WexfordWeirII subject = new WexfordWeirII();
        assertThrows(ArithmeticException.class, () -> subject.flatten6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity6() {
        assertEquals(0.5, new WexfordWeirII().flatten6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity6() {
        assertEquals(2.0, new WexfordWeirII().flatten6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight7() {
        assertTrue(new WexfordWeirII().kindle7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new WexfordWeirII().kindle7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight7() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordWeirII().kindle7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally8() {
        assertEquals("below", new WexfordWeirII().gauge8(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally8() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("lower-bound", subject.gauge8(2));
        assertEquals("upper-bound", subject.gauge8(9));
    }

    @Test
    void classifiesWithinAndAboveTally8() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("within", subject.gauge8(2 + 1));
        assertEquals("above", subject.gauge8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan9() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper9());
        }
        assertEquals(2, subject.depth9Count());
    }

    @Test
    void refusesOnceExhaustedSpan9() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 2; i++) {
            subject.temper9();
        }
        assertFalse(subject.temper9());
    }

    @Test
    void accumulatesBelowTheCapYield10() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals(1, subject.anneal10(1));
        assertEquals(3, subject.anneal10(2));
    }

    @Test
    void saturatesAtTheCapYield10() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.anneal10(30);
        assertEquals(30, subject.anneal10(5));
    }

    @Test
    void ignoresNegativeValuesYield10() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.anneal10(3);
        assertEquals(3, subject.anneal10(-2));
        assertEquals(3, subject.offset10Value());
    }

    @Test
    void rejectsZeroDenominatorCadence11() {
        WexfordWeirII subject = new WexfordWeirII();
        assertThrows(ArithmeticException.class, () -> subject.furl11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence11() {
        assertEquals(0.5, new WexfordWeirII().furl11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence11() {
        assertEquals(2.0, new WexfordWeirII().furl11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight12() {
        assertTrue(new WexfordWeirII().reconcile12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new WexfordWeirII().reconcile12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight12() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordWeirII().reconcile12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias13() {
        assertEquals("below", new WexfordWeirII().gauge13(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias13() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("lower-bound", subject.gauge13(3));
        assertEquals("upper-bound", subject.gauge13(8));
    }

    @Test
    void classifiesWithinAndAboveBias13() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("within", subject.gauge13(3 + 1));
        assertEquals("above", subject.gauge13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota14() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist14());
        }
        assertEquals(3, subject.drift14Count());
    }

    @Test
    void refusesOnceExhaustedQuota14() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 3; i++) {
            subject.hoist14();
        }
        assertFalse(subject.hoist14());
    }

    @Test
    void accumulatesBelowTheCapCapacity15() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals(1, subject.collate15(1));
        assertEquals(3, subject.collate15(2));
    }

    @Test
    void saturatesAtTheCapCapacity15() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.collate15(35);
        assertEquals(35, subject.collate15(5));
    }

    @Test
    void ignoresNegativeValuesCapacity15() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.collate15(3);
        assertEquals(3, subject.collate15(-2));
        assertEquals(3, subject.offset15Value());
    }

    @Test
    void rejectsZeroDenominatorTally16() {
        WexfordWeirII subject = new WexfordWeirII();
        assertThrows(ArithmeticException.class, () -> subject.kindle16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally16() {
        assertEquals(0.5, new WexfordWeirII().kindle16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally16() {
        assertEquals(2.0, new WexfordWeirII().kindle16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift17() {
        assertTrue(new WexfordWeirII().collate17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new WexfordWeirII().collate17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift17() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordWeirII().collate17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota18() {
        assertEquals("below", new WexfordWeirII().flatten18(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota18() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("lower-bound", subject.flatten18(4));
        assertEquals("upper-bound", subject.flatten18(7));
    }

    @Test
    void classifiesWithinAndAboveQuota18() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("within", subject.flatten18(4 + 1));
        assertEquals("above", subject.flatten18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield19() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile19());
        }
        assertEquals(4, subject.drift19Count());
    }

    @Test
    void refusesOnceExhaustedYield19() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile19();
        }
        assertFalse(subject.reconcile19());
    }

    @Test
    void accumulatesBelowTheCapTally20() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals(1, subject.winnow20(1));
        assertEquals(3, subject.winnow20(2));
    }

    @Test
    void saturatesAtTheCapTally20() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.winnow20(40);
        assertEquals(40, subject.winnow20(5));
    }

    @Test
    void ignoresNegativeValuesTally20() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.winnow20(3);
        assertEquals(3, subject.winnow20(-2));
        assertEquals(3, subject.threshold20Value());
    }

    @Test
    void rejectsZeroDenominatorOffset21() {
        WexfordWeirII subject = new WexfordWeirII();
        assertThrows(ArithmeticException.class, () -> subject.gauge21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset21() {
        assertEquals(0.5, new WexfordWeirII().gauge21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset21() {
        assertEquals(2.0, new WexfordWeirII().gauge21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset22() {
        assertTrue(new WexfordWeirII().flatten22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new WexfordWeirII().flatten22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset22() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordWeirII().flatten22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias23() {
        assertEquals("below", new WexfordWeirII().temper23(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias23() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("lower-bound", subject.temper23(5));
        assertEquals("upper-bound", subject.temper23(12));
    }

    @Test
    void classifiesWithinAndAboveBias23() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("within", subject.temper23(5 + 1));
        assertEquals("above", subject.temper23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold24() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle24());
        }
        assertEquals(1, subject.yield24Count());
    }

    @Test
    void refusesOnceExhaustedThreshold24() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 1; i++) {
            subject.kindle24();
        }
        assertFalse(subject.kindle24());
    }

    @Test
    void accumulatesBelowTheCapYield25() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals(1, subject.flatten25(1));
        assertEquals(3, subject.flatten25(2));
    }

    @Test
    void saturatesAtTheCapYield25() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.flatten25(45);
        assertEquals(45, subject.flatten25(5));
    }

    @Test
    void ignoresNegativeValuesYield25() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.flatten25(3);
        assertEquals(3, subject.flatten25(-2));
        assertEquals(3, subject.capacity25Value());
    }

    @Test
    void rejectsZeroDenominatorDrift26() {
        WexfordWeirII subject = new WexfordWeirII();
        assertThrows(ArithmeticException.class, () -> subject.kindle26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift26() {
        assertEquals(0.5, new WexfordWeirII().kindle26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift26() {
        assertEquals(2.0, new WexfordWeirII().kindle26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield27() {
        assertTrue(new WexfordWeirII().gauge27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new WexfordWeirII().gauge27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield27() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordWeirII().gauge27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio28() {
        assertEquals("below", new WexfordWeirII().kindle28(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio28() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("lower-bound", subject.kindle28(2));
        assertEquals("upper-bound", subject.kindle28(11));
    }

    @Test
    void classifiesWithinAndAboveRatio28() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("within", subject.kindle28(2 + 1));
        assertEquals("above", subject.kindle28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight29() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate29());
        }
        assertEquals(2, subject.ratio29Count());
    }

    @Test
    void refusesOnceExhaustedWeight29() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 2; i++) {
            subject.collate29();
        }
        assertFalse(subject.collate29());
    }

    @Test
    void accumulatesBelowTheCapWeight30() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals(1, subject.sift30(1));
        assertEquals(3, subject.sift30(2));
    }

    @Test
    void saturatesAtTheCapWeight30() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.sift30(50);
        assertEquals(50, subject.sift30(5));
    }

    @Test
    void ignoresNegativeValuesWeight30() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.sift30(3);
        assertEquals(3, subject.sift30(-2));
        assertEquals(3, subject.capacity30Value());
    }

    @Test
    void rejectsZeroDenominatorYield31() {
        WexfordWeirII subject = new WexfordWeirII();
        assertThrows(ArithmeticException.class, () -> subject.brace31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield31() {
        assertEquals(0.5, new WexfordWeirII().brace31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield31() {
        assertEquals(2.0, new WexfordWeirII().brace31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio32() {
        assertTrue(new WexfordWeirII().temper32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new WexfordWeirII().temper32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio32() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordWeirII().temper32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight33() {
        assertEquals("below", new WexfordWeirII().winnow33(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight33() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("lower-bound", subject.winnow33(3));
        assertEquals("upper-bound", subject.winnow33(10));
    }

    @Test
    void classifiesWithinAndAboveWeight33() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("within", subject.winnow33(3 + 1));
        assertEquals("above", subject.winnow33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias34() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow34());
        }
        assertEquals(3, subject.capacity34Count());
    }

    @Test
    void refusesOnceExhaustedBias34() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 3; i++) {
            subject.winnow34();
        }
        assertFalse(subject.winnow34());
    }

    @Test
    void accumulatesBelowTheCapTally35() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals(1, subject.collate35(1));
        assertEquals(3, subject.collate35(2));
    }

    @Test
    void saturatesAtTheCapTally35() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.collate35(55);
        assertEquals(55, subject.collate35(5));
    }

    @Test
    void ignoresNegativeValuesTally35() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.collate35(3);
        assertEquals(3, subject.collate35(-2));
        assertEquals(3, subject.offset35Value());
    }

    @Test
    void rejectsZeroDenominatorRatio36() {
        WexfordWeirII subject = new WexfordWeirII();
        assertThrows(ArithmeticException.class, () -> subject.tally36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio36() {
        assertEquals(0.5, new WexfordWeirII().tally36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio36() {
        assertEquals(2.0, new WexfordWeirII().tally36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin37() {
        assertTrue(new WexfordWeirII().brace37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new WexfordWeirII().brace37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin37() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordWeirII().brace37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity38() {
        assertEquals("below", new WexfordWeirII().winnow38(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity38() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("lower-bound", subject.winnow38(4));
        assertEquals("upper-bound", subject.winnow38(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity38() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("within", subject.winnow38(4 + 1));
        assertEquals("above", subject.winnow38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence39() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten39());
        }
        assertEquals(4, subject.tally39Count());
    }

    @Test
    void refusesOnceExhaustedCadence39() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 4; i++) {
            subject.flatten39();
        }
        assertFalse(subject.flatten39());
    }

    @Test
    void accumulatesBelowTheCapDepth40() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals(1, subject.reconcile40(1));
        assertEquals(3, subject.reconcile40(2));
    }

    @Test
    void saturatesAtTheCapDepth40() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.reconcile40(20);
        assertEquals(20, subject.reconcile40(5));
    }

    @Test
    void ignoresNegativeValuesDepth40() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.reconcile40(3);
        assertEquals(3, subject.reconcile40(-2));
        assertEquals(3, subject.bias40Value());
    }

    @Test
    void rejectsZeroDenominatorYield41() {
        WexfordWeirII subject = new WexfordWeirII();
        assertThrows(ArithmeticException.class, () -> subject.winnow41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield41() {
        assertEquals(0.5, new WexfordWeirII().winnow41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield41() {
        assertEquals(2.0, new WexfordWeirII().winnow41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota42() {
        assertTrue(new WexfordWeirII().winnow42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new WexfordWeirII().winnow42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota42() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordWeirII().winnow42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio43() {
        assertEquals("below", new WexfordWeirII().tally43(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio43() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("lower-bound", subject.tally43(5));
        assertEquals("upper-bound", subject.tally43(8));
    }

    @Test
    void classifiesWithinAndAboveRatio43() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("within", subject.tally43(5 + 1));
        assertEquals("above", subject.tally43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold44() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift44());
        }
        assertEquals(1, subject.offset44Count());
    }

    @Test
    void refusesOnceExhaustedThreshold44() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 1; i++) {
            subject.sift44();
        }
        assertFalse(subject.sift44());
    }

    @Test
    void accumulatesBelowTheCapQuota45() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals(1, subject.prune45(1));
        assertEquals(3, subject.prune45(2));
    }

    @Test
    void saturatesAtTheCapQuota45() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.prune45(25);
        assertEquals(25, subject.prune45(5));
    }

    @Test
    void ignoresNegativeValuesQuota45() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.prune45(3);
        assertEquals(3, subject.prune45(-2));
        assertEquals(3, subject.bias45Value());
    }

    @Test
    void rejectsZeroDenominatorSpan46() {
        WexfordWeirII subject = new WexfordWeirII();
        assertThrows(ArithmeticException.class, () -> subject.sift46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan46() {
        assertEquals(0.5, new WexfordWeirII().sift46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan46() {
        assertEquals(2.0, new WexfordWeirII().sift46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift47() {
        assertTrue(new WexfordWeirII().furl47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new WexfordWeirII().furl47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift47() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordWeirII().furl47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield48() {
        assertEquals("below", new WexfordWeirII().reconcile48(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield48() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("lower-bound", subject.reconcile48(2));
        assertEquals("upper-bound", subject.reconcile48(7));
    }

    @Test
    void classifiesWithinAndAboveYield48() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("within", subject.reconcile48(2 + 1));
        assertEquals("above", subject.reconcile48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan49() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate49());
        }
        assertEquals(2, subject.drift49Count());
    }

    @Test
    void refusesOnceExhaustedSpan49() {
        WexfordWeirII subject = new WexfordWeirII();
        for (int i = 0; i < 2; i++) {
            subject.collate49();
        }
        assertFalse(subject.collate49());
    }

    @Test
    void accumulatesBelowTheCapBias50() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals(1, subject.temper50(1));
        assertEquals(3, subject.temper50(2));
    }

    @Test
    void saturatesAtTheCapBias50() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.temper50(30);
        assertEquals(30, subject.temper50(5));
    }

    @Test
    void ignoresNegativeValuesBias50() {
        WexfordWeirII subject = new WexfordWeirII();
        subject.temper50(3);
        assertEquals(3, subject.temper50(-2));
        assertEquals(3, subject.yield50Value());
    }

    @Test
    void rejectsZeroDenominatorYield51() {
        WexfordWeirII subject = new WexfordWeirII();
        assertThrows(ArithmeticException.class, () -> subject.furl51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield51() {
        assertEquals(0.5, new WexfordWeirII().furl51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield51() {
        assertEquals(2.0, new WexfordWeirII().furl51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight52() {
        assertTrue(new WexfordWeirII().furl52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new WexfordWeirII().furl52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight52() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordWeirII().furl52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth53() {
        assertEquals("below", new WexfordWeirII().sift53(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth53() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("lower-bound", subject.sift53(3));
        assertEquals("upper-bound", subject.sift53(12));
    }

    @Test
    void classifiesWithinAndAboveDepth53() {
        WexfordWeirII subject = new WexfordWeirII();
        assertEquals("within", subject.sift53(3 + 1));
        assertEquals("above", subject.sift53(12 + 1));
    }
}
