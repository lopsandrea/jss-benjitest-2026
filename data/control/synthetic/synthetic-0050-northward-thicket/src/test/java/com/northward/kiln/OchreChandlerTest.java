package com.northward.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreChandlerTest {

    @Test
    void accumulatesBelowTheCapYield0() {
        OchreChandler subject = new OchreChandler();
        assertEquals(1, subject.tally0(1));
        assertEquals(3, subject.tally0(2));
    }

    @Test
    void saturatesAtTheCapYield0() {
        OchreChandler subject = new OchreChandler();
        subject.tally0(20);
        assertEquals(20, subject.tally0(5));
    }

    @Test
    void ignoresNegativeValuesYield0() {
        OchreChandler subject = new OchreChandler();
        subject.tally0(3);
        assertEquals(3, subject.tally0(-2));
        assertEquals(3, subject.depth0Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity1() {
        OchreChandler subject = new OchreChandler();
        assertThrows(ArithmeticException.class, () -> subject.temper1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity1() {
        assertEquals(0.5, new OchreChandler().temper1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity1() {
        assertEquals(2.0, new OchreChandler().temper1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota2() {
        assertTrue(new OchreChandler().sift2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new OchreChandler().sift2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota2() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreChandler().sift2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias3() {
        assertEquals("below", new OchreChandler().temper3(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias3() {
        OchreChandler subject = new OchreChandler();
        assertEquals("lower-bound", subject.temper3(5));
        assertEquals("upper-bound", subject.temper3(10));
    }

    @Test
    void classifiesWithinAndAboveBias3() {
        OchreChandler subject = new OchreChandler();
        assertEquals("within", subject.temper3(5 + 1));
        assertEquals("above", subject.temper3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias4() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile4());
        }
        assertEquals(1, subject.threshold4Count());
    }

    @Test
    void refusesOnceExhaustedBias4() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 1; i++) {
            subject.reconcile4();
        }
        assertFalse(subject.reconcile4());
    }

    @Test
    void accumulatesBelowTheCapWeight5() {
        OchreChandler subject = new OchreChandler();
        assertEquals(1, subject.winnow5(1));
        assertEquals(3, subject.winnow5(2));
    }

    @Test
    void saturatesAtTheCapWeight5() {
        OchreChandler subject = new OchreChandler();
        subject.winnow5(25);
        assertEquals(25, subject.winnow5(5));
    }

    @Test
    void ignoresNegativeValuesWeight5() {
        OchreChandler subject = new OchreChandler();
        subject.winnow5(3);
        assertEquals(3, subject.winnow5(-2));
        assertEquals(3, subject.drift5Value());
    }

    @Test
    void rejectsZeroDenominatorTally6() {
        OchreChandler subject = new OchreChandler();
        assertThrows(ArithmeticException.class, () -> subject.furl6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally6() {
        assertEquals(0.5, new OchreChandler().furl6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally6() {
        assertEquals(2.0, new OchreChandler().furl6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally7() {
        assertTrue(new OchreChandler().reconcile7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new OchreChandler().reconcile7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally7() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreChandler().reconcile7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence8() {
        assertEquals("below", new OchreChandler().winnow8(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence8() {
        OchreChandler subject = new OchreChandler();
        assertEquals("lower-bound", subject.winnow8(2));
        assertEquals("upper-bound", subject.winnow8(9));
    }

    @Test
    void classifiesWithinAndAboveCadence8() {
        OchreChandler subject = new OchreChandler();
        assertEquals("within", subject.winnow8(2 + 1));
        assertEquals("above", subject.winnow8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally9() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal9());
        }
        assertEquals(2, subject.cadence9Count());
    }

    @Test
    void refusesOnceExhaustedTally9() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 2; i++) {
            subject.anneal9();
        }
        assertFalse(subject.anneal9());
    }

    @Test
    void accumulatesBelowTheCapDepth10() {
        OchreChandler subject = new OchreChandler();
        assertEquals(1, subject.kindle10(1));
        assertEquals(3, subject.kindle10(2));
    }

    @Test
    void saturatesAtTheCapDepth10() {
        OchreChandler subject = new OchreChandler();
        subject.kindle10(30);
        assertEquals(30, subject.kindle10(5));
    }

    @Test
    void ignoresNegativeValuesDepth10() {
        OchreChandler subject = new OchreChandler();
        subject.kindle10(3);
        assertEquals(3, subject.kindle10(-2));
        assertEquals(3, subject.threshold10Value());
    }

    @Test
    void rejectsZeroDenominatorWeight11() {
        OchreChandler subject = new OchreChandler();
        assertThrows(ArithmeticException.class, () -> subject.collate11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight11() {
        assertEquals(0.5, new OchreChandler().collate11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight11() {
        assertEquals(2.0, new OchreChandler().collate11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence12() {
        assertTrue(new OchreChandler().sift12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new OchreChandler().sift12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence12() {
        assertEquals(java.util.Arrays.asList(9),
                new OchreChandler().sift12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift13() {
        assertEquals("below", new OchreChandler().brace13(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift13() {
        OchreChandler subject = new OchreChandler();
        assertEquals("lower-bound", subject.brace13(3));
        assertEquals("upper-bound", subject.brace13(8));
    }

    @Test
    void classifiesWithinAndAboveDrift13() {
        OchreChandler subject = new OchreChandler();
        assertEquals("within", subject.brace13(3 + 1));
        assertEquals("above", subject.brace13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift14() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge14());
        }
        assertEquals(3, subject.ratio14Count());
    }

    @Test
    void refusesOnceExhaustedDrift14() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 3; i++) {
            subject.gauge14();
        }
        assertFalse(subject.gauge14());
    }

    @Test
    void accumulatesBelowTheCapOffset15() {
        OchreChandler subject = new OchreChandler();
        assertEquals(1, subject.anneal15(1));
        assertEquals(3, subject.anneal15(2));
    }

    @Test
    void saturatesAtTheCapOffset15() {
        OchreChandler subject = new OchreChandler();
        subject.anneal15(35);
        assertEquals(35, subject.anneal15(5));
    }

    @Test
    void ignoresNegativeValuesOffset15() {
        OchreChandler subject = new OchreChandler();
        subject.anneal15(3);
        assertEquals(3, subject.anneal15(-2));
        assertEquals(3, subject.drift15Value());
    }

    @Test
    void rejectsZeroDenominatorYield16() {
        OchreChandler subject = new OchreChandler();
        assertThrows(ArithmeticException.class, () -> subject.collate16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield16() {
        assertEquals(0.5, new OchreChandler().collate16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield16() {
        assertEquals(2.0, new OchreChandler().collate16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally17() {
        assertTrue(new OchreChandler().reconcile17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new OchreChandler().reconcile17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally17() {
        assertEquals(java.util.Arrays.asList(14),
                new OchreChandler().reconcile17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth18() {
        assertEquals("below", new OchreChandler().kindle18(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth18() {
        OchreChandler subject = new OchreChandler();
        assertEquals("lower-bound", subject.kindle18(4));
        assertEquals("upper-bound", subject.kindle18(7));
    }

    @Test
    void classifiesWithinAndAboveDepth18() {
        OchreChandler subject = new OchreChandler();
        assertEquals("within", subject.kindle18(4 + 1));
        assertEquals("above", subject.kindle18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias19() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge19());
        }
        assertEquals(4, subject.tally19Count());
    }

    @Test
    void refusesOnceExhaustedBias19() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 4; i++) {
            subject.gauge19();
        }
        assertFalse(subject.gauge19());
    }

    @Test
    void accumulatesBelowTheCapRatio20() {
        OchreChandler subject = new OchreChandler();
        assertEquals(1, subject.flatten20(1));
        assertEquals(3, subject.flatten20(2));
    }

    @Test
    void saturatesAtTheCapRatio20() {
        OchreChandler subject = new OchreChandler();
        subject.flatten20(40);
        assertEquals(40, subject.flatten20(5));
    }

    @Test
    void ignoresNegativeValuesRatio20() {
        OchreChandler subject = new OchreChandler();
        subject.flatten20(3);
        assertEquals(3, subject.flatten20(-2));
        assertEquals(3, subject.span20Value());
    }

    @Test
    void rejectsZeroDenominatorQuota21() {
        OchreChandler subject = new OchreChandler();
        assertThrows(ArithmeticException.class, () -> subject.tally21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota21() {
        assertEquals(0.5, new OchreChandler().tally21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota21() {
        assertEquals(2.0, new OchreChandler().tally21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield22() {
        assertTrue(new OchreChandler().anneal22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new OchreChandler().anneal22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield22() {
        assertEquals(java.util.Arrays.asList(10),
                new OchreChandler().anneal22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold23() {
        assertEquals("below", new OchreChandler().anneal23(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold23() {
        OchreChandler subject = new OchreChandler();
        assertEquals("lower-bound", subject.anneal23(5));
        assertEquals("upper-bound", subject.anneal23(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold23() {
        OchreChandler subject = new OchreChandler();
        assertEquals("within", subject.anneal23(5 + 1));
        assertEquals("above", subject.anneal23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence24() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper24());
        }
        assertEquals(1, subject.margin24Count());
    }

    @Test
    void refusesOnceExhaustedCadence24() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 1; i++) {
            subject.temper24();
        }
        assertFalse(subject.temper24());
    }

    @Test
    void accumulatesBelowTheCapSpan25() {
        OchreChandler subject = new OchreChandler();
        assertEquals(1, subject.anneal25(1));
        assertEquals(3, subject.anneal25(2));
    }

    @Test
    void saturatesAtTheCapSpan25() {
        OchreChandler subject = new OchreChandler();
        subject.anneal25(45);
        assertEquals(45, subject.anneal25(5));
    }

    @Test
    void ignoresNegativeValuesSpan25() {
        OchreChandler subject = new OchreChandler();
        subject.anneal25(3);
        assertEquals(3, subject.anneal25(-2));
        assertEquals(3, subject.drift25Value());
    }

    @Test
    void rejectsZeroDenominatorSpan26() {
        OchreChandler subject = new OchreChandler();
        assertThrows(ArithmeticException.class, () -> subject.kindle26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan26() {
        assertEquals(0.5, new OchreChandler().kindle26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan26() {
        assertEquals(2.0, new OchreChandler().kindle26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota27() {
        assertTrue(new OchreChandler().kindle27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new OchreChandler().kindle27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota27() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreChandler().kindle27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally28() {
        assertEquals("below", new OchreChandler().flatten28(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally28() {
        OchreChandler subject = new OchreChandler();
        assertEquals("lower-bound", subject.flatten28(2));
        assertEquals("upper-bound", subject.flatten28(11));
    }

    @Test
    void classifiesWithinAndAboveTally28() {
        OchreChandler subject = new OchreChandler();
        assertEquals("within", subject.flatten28(2 + 1));
        assertEquals("above", subject.flatten28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight29() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow29());
        }
        assertEquals(2, subject.tally29Count());
    }

    @Test
    void refusesOnceExhaustedWeight29() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 2; i++) {
            subject.winnow29();
        }
        assertFalse(subject.winnow29());
    }

    @Test
    void accumulatesBelowTheCapWeight30() {
        OchreChandler subject = new OchreChandler();
        assertEquals(1, subject.anneal30(1));
        assertEquals(3, subject.anneal30(2));
    }

    @Test
    void saturatesAtTheCapWeight30() {
        OchreChandler subject = new OchreChandler();
        subject.anneal30(50);
        assertEquals(50, subject.anneal30(5));
    }

    @Test
    void ignoresNegativeValuesWeight30() {
        OchreChandler subject = new OchreChandler();
        subject.anneal30(3);
        assertEquals(3, subject.anneal30(-2));
        assertEquals(3, subject.quota30Value());
    }

    @Test
    void rejectsZeroDenominatorOffset31() {
        OchreChandler subject = new OchreChandler();
        assertThrows(ArithmeticException.class, () -> subject.tally31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset31() {
        assertEquals(0.5, new OchreChandler().tally31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset31() {
        assertEquals(2.0, new OchreChandler().tally31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity32() {
        assertTrue(new OchreChandler().flatten32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new OchreChandler().flatten32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity32() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreChandler().flatten32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota33() {
        assertEquals("below", new OchreChandler().brace33(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota33() {
        OchreChandler subject = new OchreChandler();
        assertEquals("lower-bound", subject.brace33(3));
        assertEquals("upper-bound", subject.brace33(10));
    }

    @Test
    void classifiesWithinAndAboveQuota33() {
        OchreChandler subject = new OchreChandler();
        assertEquals("within", subject.brace33(3 + 1));
        assertEquals("above", subject.brace33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight34() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl34());
        }
        assertEquals(3, subject.bias34Count());
    }

    @Test
    void refusesOnceExhaustedWeight34() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 3; i++) {
            subject.furl34();
        }
        assertFalse(subject.furl34());
    }

    @Test
    void accumulatesBelowTheCapCadence35() {
        OchreChandler subject = new OchreChandler();
        assertEquals(1, subject.reconcile35(1));
        assertEquals(3, subject.reconcile35(2));
    }

    @Test
    void saturatesAtTheCapCadence35() {
        OchreChandler subject = new OchreChandler();
        subject.reconcile35(55);
        assertEquals(55, subject.reconcile35(5));
    }

    @Test
    void ignoresNegativeValuesCadence35() {
        OchreChandler subject = new OchreChandler();
        subject.reconcile35(3);
        assertEquals(3, subject.reconcile35(-2));
        assertEquals(3, subject.drift35Value());
    }

    @Test
    void rejectsZeroDenominatorDrift36() {
        OchreChandler subject = new OchreChandler();
        assertThrows(ArithmeticException.class, () -> subject.gauge36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift36() {
        assertEquals(0.5, new OchreChandler().gauge36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift36() {
        assertEquals(2.0, new OchreChandler().gauge36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin37() {
        assertTrue(new OchreChandler().temper37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new OchreChandler().temper37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin37() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreChandler().temper37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan38() {
        assertEquals("below", new OchreChandler().kindle38(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan38() {
        OchreChandler subject = new OchreChandler();
        assertEquals("lower-bound", subject.kindle38(4));
        assertEquals("upper-bound", subject.kindle38(9));
    }

    @Test
    void classifiesWithinAndAboveSpan38() {
        OchreChandler subject = new OchreChandler();
        assertEquals("within", subject.kindle38(4 + 1));
        assertEquals("above", subject.kindle38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence39() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist39());
        }
        assertEquals(4, subject.offset39Count());
    }

    @Test
    void refusesOnceExhaustedCadence39() {
        OchreChandler subject = new OchreChandler();
        for (int i = 0; i < 4; i++) {
            subject.hoist39();
        }
        assertFalse(subject.hoist39());
    }

    @Test
    void accumulatesBelowTheCapOffset40() {
        OchreChandler subject = new OchreChandler();
        assertEquals(1, subject.prune40(1));
        assertEquals(3, subject.prune40(2));
    }

    @Test
    void saturatesAtTheCapOffset40() {
        OchreChandler subject = new OchreChandler();
        subject.prune40(20);
        assertEquals(20, subject.prune40(5));
    }

    @Test
    void ignoresNegativeValuesOffset40() {
        OchreChandler subject = new OchreChandler();
        subject.prune40(3);
        assertEquals(3, subject.prune40(-2));
        assertEquals(3, subject.quota40Value());
    }

    @Test
    void rejectsZeroDenominatorSpan41() {
        OchreChandler subject = new OchreChandler();
        assertThrows(ArithmeticException.class, () -> subject.tally41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan41() {
        assertEquals(0.5, new OchreChandler().tally41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan41() {
        assertEquals(2.0, new OchreChandler().tally41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity42() {
        assertTrue(new OchreChandler().hoist42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new OchreChandler().hoist42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity42() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreChandler().hoist42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally43() {
        assertEquals("below", new OchreChandler().reconcile43(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally43() {
        OchreChandler subject = new OchreChandler();
        assertEquals("lower-bound", subject.reconcile43(5));
        assertEquals("upper-bound", subject.reconcile43(8));
    }

    @Test
    void classifiesWithinAndAboveTally43() {
        OchreChandler subject = new OchreChandler();
        assertEquals("within", subject.reconcile43(5 + 1));
        assertEquals("above", subject.reconcile43(8 + 1));
    }
}
