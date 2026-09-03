package com.sable.spindle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowEstuaryTest {

    @Test
    void accumulatesBelowTheCapBias0() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals(1, subject.kindle0(1));
        assertEquals(3, subject.kindle0(2));
    }

    @Test
    void saturatesAtTheCapBias0() {
        HollowEstuary subject = new HollowEstuary();
        subject.kindle0(20);
        assertEquals(20, subject.kindle0(5));
    }

    @Test
    void ignoresNegativeValuesBias0() {
        HollowEstuary subject = new HollowEstuary();
        subject.kindle0(3);
        assertEquals(3, subject.kindle0(-2));
        assertEquals(3, subject.weight0Value());
    }

    @Test
    void rejectsZeroDenominatorYield1() {
        HollowEstuary subject = new HollowEstuary();
        assertThrows(ArithmeticException.class, () -> subject.prune1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield1() {
        assertEquals(0.5, new HollowEstuary().prune1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield1() {
        assertEquals(2.0, new HollowEstuary().prune1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth2() {
        assertTrue(new HollowEstuary().collate2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowEstuary().collate2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth2() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowEstuary().collate2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan3() {
        assertEquals("below", new HollowEstuary().temper3(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan3() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("lower-bound", subject.temper3(5));
        assertEquals("upper-bound", subject.temper3(10));
    }

    @Test
    void classifiesWithinAndAboveSpan3() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("within", subject.temper3(5 + 1));
        assertEquals("above", subject.temper3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias4() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow4());
        }
        assertEquals(1, subject.drift4Count());
    }

    @Test
    void refusesOnceExhaustedBias4() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 1; i++) {
            subject.winnow4();
        }
        assertFalse(subject.winnow4());
    }

    @Test
    void accumulatesBelowTheCapRatio5() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals(1, subject.hoist5(1));
        assertEquals(3, subject.hoist5(2));
    }

    @Test
    void saturatesAtTheCapRatio5() {
        HollowEstuary subject = new HollowEstuary();
        subject.hoist5(25);
        assertEquals(25, subject.hoist5(5));
    }

    @Test
    void ignoresNegativeValuesRatio5() {
        HollowEstuary subject = new HollowEstuary();
        subject.hoist5(3);
        assertEquals(3, subject.hoist5(-2));
        assertEquals(3, subject.capacity5Value());
    }

    @Test
    void rejectsZeroDenominatorDrift6() {
        HollowEstuary subject = new HollowEstuary();
        assertThrows(ArithmeticException.class, () -> subject.prune6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift6() {
        assertEquals(0.5, new HollowEstuary().prune6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift6() {
        assertEquals(2.0, new HollowEstuary().prune6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight7() {
        assertTrue(new HollowEstuary().brace7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowEstuary().brace7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight7() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowEstuary().brace7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset8() {
        assertEquals("below", new HollowEstuary().gauge8(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset8() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("lower-bound", subject.gauge8(2));
        assertEquals("upper-bound", subject.gauge8(9));
    }

    @Test
    void classifiesWithinAndAboveOffset8() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("within", subject.gauge8(2 + 1));
        assertEquals("above", subject.gauge8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity9() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace9());
        }
        assertEquals(2, subject.bias9Count());
    }

    @Test
    void refusesOnceExhaustedCapacity9() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 2; i++) {
            subject.brace9();
        }
        assertFalse(subject.brace9());
    }

    @Test
    void accumulatesBelowTheCapDepth10() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals(1, subject.anneal10(1));
        assertEquals(3, subject.anneal10(2));
    }

    @Test
    void saturatesAtTheCapDepth10() {
        HollowEstuary subject = new HollowEstuary();
        subject.anneal10(30);
        assertEquals(30, subject.anneal10(5));
    }

    @Test
    void ignoresNegativeValuesDepth10() {
        HollowEstuary subject = new HollowEstuary();
        subject.anneal10(3);
        assertEquals(3, subject.anneal10(-2));
        assertEquals(3, subject.tally10Value());
    }

    @Test
    void rejectsZeroDenominatorWeight11() {
        HollowEstuary subject = new HollowEstuary();
        assertThrows(ArithmeticException.class, () -> subject.sift11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight11() {
        assertEquals(0.5, new HollowEstuary().sift11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight11() {
        assertEquals(2.0, new HollowEstuary().sift11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity12() {
        assertTrue(new HollowEstuary().kindle12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowEstuary().kindle12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity12() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowEstuary().kindle12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth13() {
        assertEquals("below", new HollowEstuary().brace13(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth13() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("lower-bound", subject.brace13(3));
        assertEquals("upper-bound", subject.brace13(8));
    }

    @Test
    void classifiesWithinAndAboveDepth13() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("within", subject.brace13(3 + 1));
        assertEquals("above", subject.brace13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias14() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle14());
        }
        assertEquals(3, subject.depth14Count());
    }

    @Test
    void refusesOnceExhaustedBias14() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 3; i++) {
            subject.kindle14();
        }
        assertFalse(subject.kindle14());
    }

    @Test
    void accumulatesBelowTheCapMargin15() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals(1, subject.brace15(1));
        assertEquals(3, subject.brace15(2));
    }

    @Test
    void saturatesAtTheCapMargin15() {
        HollowEstuary subject = new HollowEstuary();
        subject.brace15(35);
        assertEquals(35, subject.brace15(5));
    }

    @Test
    void ignoresNegativeValuesMargin15() {
        HollowEstuary subject = new HollowEstuary();
        subject.brace15(3);
        assertEquals(3, subject.brace15(-2));
        assertEquals(3, subject.drift15Value());
    }

    @Test
    void rejectsZeroDenominatorQuota16() {
        HollowEstuary subject = new HollowEstuary();
        assertThrows(ArithmeticException.class, () -> subject.sift16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota16() {
        assertEquals(0.5, new HollowEstuary().sift16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota16() {
        assertEquals(2.0, new HollowEstuary().sift16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias17() {
        assertTrue(new HollowEstuary().kindle17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowEstuary().kindle17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias17() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowEstuary().kindle17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield18() {
        assertEquals("below", new HollowEstuary().gauge18(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield18() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("lower-bound", subject.gauge18(4));
        assertEquals("upper-bound", subject.gauge18(7));
    }

    @Test
    void classifiesWithinAndAboveYield18() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("within", subject.gauge18(4 + 1));
        assertEquals("above", subject.gauge18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio19() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace19());
        }
        assertEquals(4, subject.drift19Count());
    }

    @Test
    void refusesOnceExhaustedRatio19() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 4; i++) {
            subject.brace19();
        }
        assertFalse(subject.brace19());
    }

    @Test
    void accumulatesBelowTheCapMargin20() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals(1, subject.flatten20(1));
        assertEquals(3, subject.flatten20(2));
    }

    @Test
    void saturatesAtTheCapMargin20() {
        HollowEstuary subject = new HollowEstuary();
        subject.flatten20(40);
        assertEquals(40, subject.flatten20(5));
    }

    @Test
    void ignoresNegativeValuesMargin20() {
        HollowEstuary subject = new HollowEstuary();
        subject.flatten20(3);
        assertEquals(3, subject.flatten20(-2));
        assertEquals(3, subject.threshold20Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold21() {
        HollowEstuary subject = new HollowEstuary();
        assertThrows(ArithmeticException.class, () -> subject.anneal21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold21() {
        assertEquals(0.5, new HollowEstuary().anneal21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold21() {
        assertEquals(2.0, new HollowEstuary().anneal21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset22() {
        assertTrue(new HollowEstuary().winnow22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new HollowEstuary().winnow22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset22() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowEstuary().winnow22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth23() {
        assertEquals("below", new HollowEstuary().gauge23(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth23() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("lower-bound", subject.gauge23(5));
        assertEquals("upper-bound", subject.gauge23(12));
    }

    @Test
    void classifiesWithinAndAboveDepth23() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("within", subject.gauge23(5 + 1));
        assertEquals("above", subject.gauge23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold24() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal24());
        }
        assertEquals(1, subject.bias24Count());
    }

    @Test
    void refusesOnceExhaustedThreshold24() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 1; i++) {
            subject.anneal24();
        }
        assertFalse(subject.anneal24());
    }

    @Test
    void accumulatesBelowTheCapDrift25() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals(1, subject.collate25(1));
        assertEquals(3, subject.collate25(2));
    }

    @Test
    void saturatesAtTheCapDrift25() {
        HollowEstuary subject = new HollowEstuary();
        subject.collate25(45);
        assertEquals(45, subject.collate25(5));
    }

    @Test
    void ignoresNegativeValuesDrift25() {
        HollowEstuary subject = new HollowEstuary();
        subject.collate25(3);
        assertEquals(3, subject.collate25(-2));
        assertEquals(3, subject.span25Value());
    }

    @Test
    void rejectsZeroDenominatorYield26() {
        HollowEstuary subject = new HollowEstuary();
        assertThrows(ArithmeticException.class, () -> subject.temper26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield26() {
        assertEquals(0.5, new HollowEstuary().temper26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield26() {
        assertEquals(2.0, new HollowEstuary().temper26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield27() {
        assertTrue(new HollowEstuary().brace27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new HollowEstuary().brace27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield27() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowEstuary().brace27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield28() {
        assertEquals("below", new HollowEstuary().sift28(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield28() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("lower-bound", subject.sift28(2));
        assertEquals("upper-bound", subject.sift28(11));
    }

    @Test
    void classifiesWithinAndAboveYield28() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("within", subject.sift28(2 + 1));
        assertEquals("above", subject.sift28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan29() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace29());
        }
        assertEquals(2, subject.ratio29Count());
    }

    @Test
    void refusesOnceExhaustedSpan29() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 2; i++) {
            subject.brace29();
        }
        assertFalse(subject.brace29());
    }

    @Test
    void accumulatesBelowTheCapDrift30() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals(1, subject.winnow30(1));
        assertEquals(3, subject.winnow30(2));
    }

    @Test
    void saturatesAtTheCapDrift30() {
        HollowEstuary subject = new HollowEstuary();
        subject.winnow30(50);
        assertEquals(50, subject.winnow30(5));
    }

    @Test
    void ignoresNegativeValuesDrift30() {
        HollowEstuary subject = new HollowEstuary();
        subject.winnow30(3);
        assertEquals(3, subject.winnow30(-2));
        assertEquals(3, subject.yield30Value());
    }

    @Test
    void rejectsZeroDenominatorBias31() {
        HollowEstuary subject = new HollowEstuary();
        assertThrows(ArithmeticException.class, () -> subject.prune31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias31() {
        assertEquals(0.5, new HollowEstuary().prune31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias31() {
        assertEquals(2.0, new HollowEstuary().prune31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio32() {
        assertTrue(new HollowEstuary().collate32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new HollowEstuary().collate32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio32() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowEstuary().collate32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan33() {
        assertEquals("below", new HollowEstuary().kindle33(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan33() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("lower-bound", subject.kindle33(3));
        assertEquals("upper-bound", subject.kindle33(10));
    }

    @Test
    void classifiesWithinAndAboveSpan33() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("within", subject.kindle33(3 + 1));
        assertEquals("above", subject.kindle33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset34() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge34());
        }
        assertEquals(3, subject.tally34Count());
    }

    @Test
    void refusesOnceExhaustedOffset34() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 3; i++) {
            subject.gauge34();
        }
        assertFalse(subject.gauge34());
    }

    @Test
    void accumulatesBelowTheCapDrift35() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals(1, subject.sift35(1));
        assertEquals(3, subject.sift35(2));
    }

    @Test
    void saturatesAtTheCapDrift35() {
        HollowEstuary subject = new HollowEstuary();
        subject.sift35(55);
        assertEquals(55, subject.sift35(5));
    }

    @Test
    void ignoresNegativeValuesDrift35() {
        HollowEstuary subject = new HollowEstuary();
        subject.sift35(3);
        assertEquals(3, subject.sift35(-2));
        assertEquals(3, subject.quota35Value());
    }

    @Test
    void rejectsZeroDenominatorBias36() {
        HollowEstuary subject = new HollowEstuary();
        assertThrows(ArithmeticException.class, () -> subject.collate36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias36() {
        assertEquals(0.5, new HollowEstuary().collate36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias36() {
        assertEquals(2.0, new HollowEstuary().collate36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift37() {
        assertTrue(new HollowEstuary().kindle37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new HollowEstuary().kindle37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift37() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowEstuary().kindle37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight38() {
        assertEquals("below", new HollowEstuary().anneal38(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight38() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("lower-bound", subject.anneal38(4));
        assertEquals("upper-bound", subject.anneal38(9));
    }

    @Test
    void classifiesWithinAndAboveWeight38() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("within", subject.anneal38(4 + 1));
        assertEquals("above", subject.anneal38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset39() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift39());
        }
        assertEquals(4, subject.quota39Count());
    }

    @Test
    void refusesOnceExhaustedOffset39() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 4; i++) {
            subject.sift39();
        }
        assertFalse(subject.sift39());
    }

    @Test
    void accumulatesBelowTheCapMargin40() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals(1, subject.kindle40(1));
        assertEquals(3, subject.kindle40(2));
    }

    @Test
    void saturatesAtTheCapMargin40() {
        HollowEstuary subject = new HollowEstuary();
        subject.kindle40(20);
        assertEquals(20, subject.kindle40(5));
    }

    @Test
    void ignoresNegativeValuesMargin40() {
        HollowEstuary subject = new HollowEstuary();
        subject.kindle40(3);
        assertEquals(3, subject.kindle40(-2));
        assertEquals(3, subject.cadence40Value());
    }

    @Test
    void rejectsZeroDenominatorSpan41() {
        HollowEstuary subject = new HollowEstuary();
        assertThrows(ArithmeticException.class, () -> subject.reconcile41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan41() {
        assertEquals(0.5, new HollowEstuary().reconcile41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan41() {
        assertEquals(2.0, new HollowEstuary().reconcile41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio42() {
        assertTrue(new HollowEstuary().winnow42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new HollowEstuary().winnow42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio42() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowEstuary().winnow42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence43() {
        assertEquals("below", new HollowEstuary().gauge43(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence43() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("lower-bound", subject.gauge43(5));
        assertEquals("upper-bound", subject.gauge43(8));
    }

    @Test
    void classifiesWithinAndAboveCadence43() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("within", subject.gauge43(5 + 1));
        assertEquals("above", subject.gauge43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset44() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist44());
        }
        assertEquals(1, subject.threshold44Count());
    }

    @Test
    void refusesOnceExhaustedOffset44() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 1; i++) {
            subject.hoist44();
        }
        assertFalse(subject.hoist44());
    }

    @Test
    void accumulatesBelowTheCapBias45() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals(1, subject.flatten45(1));
        assertEquals(3, subject.flatten45(2));
    }

    @Test
    void saturatesAtTheCapBias45() {
        HollowEstuary subject = new HollowEstuary();
        subject.flatten45(25);
        assertEquals(25, subject.flatten45(5));
    }

    @Test
    void ignoresNegativeValuesBias45() {
        HollowEstuary subject = new HollowEstuary();
        subject.flatten45(3);
        assertEquals(3, subject.flatten45(-2));
        assertEquals(3, subject.cadence45Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity46() {
        HollowEstuary subject = new HollowEstuary();
        assertThrows(ArithmeticException.class, () -> subject.furl46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity46() {
        assertEquals(0.5, new HollowEstuary().furl46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity46() {
        assertEquals(2.0, new HollowEstuary().furl46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth47() {
        assertTrue(new HollowEstuary().winnow47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowEstuary().winnow47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth47() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowEstuary().winnow47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota48() {
        assertEquals("below", new HollowEstuary().brace48(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota48() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("lower-bound", subject.brace48(2));
        assertEquals("upper-bound", subject.brace48(7));
    }

    @Test
    void classifiesWithinAndAboveQuota48() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("within", subject.brace48(2 + 1));
        assertEquals("above", subject.brace48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity49() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate49());
        }
        assertEquals(2, subject.margin49Count());
    }

    @Test
    void refusesOnceExhaustedCapacity49() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 2; i++) {
            subject.collate49();
        }
        assertFalse(subject.collate49());
    }

    @Test
    void accumulatesBelowTheCapSpan50() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals(1, subject.brace50(1));
        assertEquals(3, subject.brace50(2));
    }

    @Test
    void saturatesAtTheCapSpan50() {
        HollowEstuary subject = new HollowEstuary();
        subject.brace50(30);
        assertEquals(30, subject.brace50(5));
    }

    @Test
    void ignoresNegativeValuesSpan50() {
        HollowEstuary subject = new HollowEstuary();
        subject.brace50(3);
        assertEquals(3, subject.brace50(-2));
        assertEquals(3, subject.tally50Value());
    }

    @Test
    void rejectsZeroDenominatorMargin51() {
        HollowEstuary subject = new HollowEstuary();
        assertThrows(ArithmeticException.class, () -> subject.flatten51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin51() {
        assertEquals(0.5, new HollowEstuary().flatten51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin51() {
        assertEquals(2.0, new HollowEstuary().flatten51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio52() {
        assertTrue(new HollowEstuary().prune52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowEstuary().prune52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio52() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowEstuary().prune52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin53() {
        assertEquals("below", new HollowEstuary().anneal53(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin53() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("lower-bound", subject.anneal53(3));
        assertEquals("upper-bound", subject.anneal53(12));
    }

    @Test
    void classifiesWithinAndAboveMargin53() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("within", subject.anneal53(3 + 1));
        assertEquals("above", subject.anneal53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth54() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate54());
        }
        assertEquals(3, subject.capacity54Count());
    }

    @Test
    void refusesOnceExhaustedDepth54() {
        HollowEstuary subject = new HollowEstuary();
        for (int i = 0; i < 3; i++) {
            subject.collate54();
        }
        assertFalse(subject.collate54());
    }

    @Test
    void accumulatesBelowTheCapOffset55() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals(1, subject.brace55(1));
        assertEquals(3, subject.brace55(2));
    }

    @Test
    void saturatesAtTheCapOffset55() {
        HollowEstuary subject = new HollowEstuary();
        subject.brace55(35);
        assertEquals(35, subject.brace55(5));
    }

    @Test
    void ignoresNegativeValuesOffset55() {
        HollowEstuary subject = new HollowEstuary();
        subject.brace55(3);
        assertEquals(3, subject.brace55(-2));
        assertEquals(3, subject.tally55Value());
    }

    @Test
    void rejectsZeroDenominatorQuota56() {
        HollowEstuary subject = new HollowEstuary();
        assertThrows(ArithmeticException.class, () -> subject.reconcile56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota56() {
        assertEquals(0.5, new HollowEstuary().reconcile56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota56() {
        assertEquals(2.0, new HollowEstuary().reconcile56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin57() {
        assertTrue(new HollowEstuary().hoist57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowEstuary().hoist57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin57() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowEstuary().hoist57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally58() {
        assertEquals("below", new HollowEstuary().temper58(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally58() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("lower-bound", subject.temper58(4));
        assertEquals("upper-bound", subject.temper58(11));
    }

    @Test
    void classifiesWithinAndAboveTally58() {
        HollowEstuary subject = new HollowEstuary();
        assertEquals("within", subject.temper58(4 + 1));
        assertEquals("above", subject.temper58(11 + 1));
    }
}
