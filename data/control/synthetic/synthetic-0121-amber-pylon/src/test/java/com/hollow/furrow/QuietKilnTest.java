package com.hollow.furrow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietKilnTest {

    @Test
    void rejectsZeroDenominatorCapacity0() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.reconcile0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity0() {
        assertEquals(0.5, new QuietKiln().reconcile0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity0() {
        assertEquals(1.0, new QuietKiln().reconcile0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence1() {
        assertTrue(new QuietKiln().furl1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new QuietKiln().furl1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence1() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietKiln().furl1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset2() {
        assertEquals("below", new QuietKiln().winnow2(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset2() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.winnow2(4));
        assertEquals("upper-bound", subject.winnow2(9));
    }

    @Test
    void classifiesWithinAndAboveOffset2() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.winnow2(4 + 1));
        assertEquals("above", subject.winnow2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin3() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune3());
        }
        assertEquals(4, subject.weight3Count());
    }

    @Test
    void refusesOnceExhaustedMargin3() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            subject.prune3();
        }
        assertFalse(subject.prune3());
    }

    @Test
    void accumulatesBelowTheCapCapacity4() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.gauge4(1));
        assertEquals(3, subject.gauge4(2));
    }

    @Test
    void saturatesAtTheCapCapacity4() {
        QuietKiln subject = new QuietKiln();
        subject.gauge4(24);
        assertEquals(24, subject.gauge4(5));
    }

    @Test
    void ignoresNegativeValuesCapacity4() {
        QuietKiln subject = new QuietKiln();
        subject.gauge4(3);
        assertEquals(3, subject.gauge4(-2));
        assertEquals(3, subject.depth4Value());
    }

    @Test
    void rejectsZeroDenominatorTally5() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally5() {
        assertEquals(0.5, new QuietKiln().winnow5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally5() {
        assertEquals(1.0, new QuietKiln().winnow5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold6() {
        assertTrue(new QuietKiln().prune6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new QuietKiln().prune6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold6() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietKiln().prune6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio7() {
        assertEquals("below", new QuietKiln().furl7(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio7() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.furl7(5));
        assertEquals("upper-bound", subject.furl7(8));
    }

    @Test
    void classifiesWithinAndAboveRatio7() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.furl7(5 + 1));
        assertEquals("above", subject.furl7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias8() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally8());
        }
        assertEquals(1, subject.quota8Count());
    }

    @Test
    void refusesOnceExhaustedBias8() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            subject.tally8();
        }
        assertFalse(subject.tally8());
    }

    @Test
    void accumulatesBelowTheCapDrift9() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.kindle9(1));
        assertEquals(3, subject.kindle9(2));
    }

    @Test
    void saturatesAtTheCapDrift9() {
        QuietKiln subject = new QuietKiln();
        subject.kindle9(29);
        assertEquals(29, subject.kindle9(5));
    }

    @Test
    void ignoresNegativeValuesDrift9() {
        QuietKiln subject = new QuietKiln();
        subject.kindle9(3);
        assertEquals(3, subject.kindle9(-2));
        assertEquals(3, subject.span9Value());
    }

    @Test
    void rejectsZeroDenominatorOffset10() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.temper10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset10() {
        assertEquals(0.5, new QuietKiln().temper10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset10() {
        assertEquals(1.0, new QuietKiln().temper10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift11() {
        assertTrue(new QuietKiln().reconcile11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new QuietKiln().reconcile11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift11() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietKiln().reconcile11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan12() {
        assertEquals("below", new QuietKiln().reconcile12(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan12() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.reconcile12(2));
        assertEquals("upper-bound", subject.reconcile12(7));
    }

    @Test
    void classifiesWithinAndAboveSpan12() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.reconcile12(2 + 1));
        assertEquals("above", subject.reconcile12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield13() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge13());
        }
        assertEquals(2, subject.ratio13Count());
    }

    @Test
    void refusesOnceExhaustedYield13() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 2; i++) {
            subject.gauge13();
        }
        assertFalse(subject.gauge13());
    }

    @Test
    void accumulatesBelowTheCapSpan14() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.winnow14(1));
        assertEquals(3, subject.winnow14(2));
    }

    @Test
    void saturatesAtTheCapSpan14() {
        QuietKiln subject = new QuietKiln();
        subject.winnow14(34);
        assertEquals(34, subject.winnow14(5));
    }

    @Test
    void ignoresNegativeValuesSpan14() {
        QuietKiln subject = new QuietKiln();
        subject.winnow14(3);
        assertEquals(3, subject.winnow14(-2));
        assertEquals(3, subject.cadence14Value());
    }

    @Test
    void rejectsZeroDenominatorMargin15() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin15() {
        assertEquals(0.5, new QuietKiln().prune15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin15() {
        assertEquals(1.0, new QuietKiln().prune15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan16() {
        assertTrue(new QuietKiln().gauge16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new QuietKiln().gauge16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan16() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietKiln().gauge16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity17() {
        assertEquals("below", new QuietKiln().prune17(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity17() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.prune17(3));
        assertEquals("upper-bound", subject.prune17(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity17() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.prune17(3 + 1));
        assertEquals("above", subject.prune17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth18() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace18());
        }
        assertEquals(3, subject.ratio18Count());
    }

    @Test
    void refusesOnceExhaustedDepth18() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 3; i++) {
            subject.brace18();
        }
        assertFalse(subject.brace18());
    }

    @Test
    void accumulatesBelowTheCapRatio19() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.brace19(1));
        assertEquals(3, subject.brace19(2));
    }

    @Test
    void saturatesAtTheCapRatio19() {
        QuietKiln subject = new QuietKiln();
        subject.brace19(39);
        assertEquals(39, subject.brace19(5));
    }

    @Test
    void ignoresNegativeValuesRatio19() {
        QuietKiln subject = new QuietKiln();
        subject.brace19(3);
        assertEquals(3, subject.brace19(-2));
        assertEquals(3, subject.weight19Value());
    }

    @Test
    void rejectsZeroDenominatorWeight20() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight20() {
        assertEquals(0.5, new QuietKiln().kindle20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight20() {
        assertEquals(1.0, new QuietKiln().kindle20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight21() {
        assertTrue(new QuietKiln().temper21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new QuietKiln().temper21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight21() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietKiln().temper21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan22() {
        assertEquals("below", new QuietKiln().brace22(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan22() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.brace22(4));
        assertEquals("upper-bound", subject.brace22(11));
    }

    @Test
    void classifiesWithinAndAboveSpan22() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.brace22(4 + 1));
        assertEquals("above", subject.brace22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio23() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle23());
        }
        assertEquals(4, subject.weight23Count());
    }

    @Test
    void refusesOnceExhaustedRatio23() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            subject.kindle23();
        }
        assertFalse(subject.kindle23());
    }

    @Test
    void accumulatesBelowTheCapYield24() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.collate24(1));
        assertEquals(3, subject.collate24(2));
    }

    @Test
    void saturatesAtTheCapYield24() {
        QuietKiln subject = new QuietKiln();
        subject.collate24(44);
        assertEquals(44, subject.collate24(5));
    }

    @Test
    void ignoresNegativeValuesYield24() {
        QuietKiln subject = new QuietKiln();
        subject.collate24(3);
        assertEquals(3, subject.collate24(-2));
        assertEquals(3, subject.margin24Value());
    }

    @Test
    void rejectsZeroDenominatorWeight25() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.furl25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight25() {
        assertEquals(0.5, new QuietKiln().furl25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight25() {
        assertEquals(1.0, new QuietKiln().furl25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth26() {
        assertTrue(new QuietKiln().tally26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new QuietKiln().tally26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth26() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietKiln().tally26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight27() {
        assertEquals("below", new QuietKiln().temper27(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight27() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.temper27(5));
        assertEquals("upper-bound", subject.temper27(10));
    }

    @Test
    void classifiesWithinAndAboveWeight27() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.temper27(5 + 1));
        assertEquals("above", subject.temper27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth28() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge28());
        }
        assertEquals(1, subject.cadence28Count());
    }

    @Test
    void refusesOnceExhaustedDepth28() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            subject.gauge28();
        }
        assertFalse(subject.gauge28());
    }

    @Test
    void accumulatesBelowTheCapDepth29() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.collate29(1));
        assertEquals(3, subject.collate29(2));
    }

    @Test
    void saturatesAtTheCapDepth29() {
        QuietKiln subject = new QuietKiln();
        subject.collate29(49);
        assertEquals(49, subject.collate29(5));
    }

    @Test
    void ignoresNegativeValuesDepth29() {
        QuietKiln subject = new QuietKiln();
        subject.collate29(3);
        assertEquals(3, subject.collate29(-2));
        assertEquals(3, subject.drift29Value());
    }

    @Test
    void rejectsZeroDenominatorTally30() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally30() {
        assertEquals(0.5, new QuietKiln().kindle30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally30() {
        assertEquals(1.0, new QuietKiln().kindle30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold31() {
        assertTrue(new QuietKiln().tally31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new QuietKiln().tally31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold31() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietKiln().tally31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota32() {
        assertEquals("below", new QuietKiln().sift32(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota32() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.sift32(2));
        assertEquals("upper-bound", subject.sift32(9));
    }

    @Test
    void classifiesWithinAndAboveQuota32() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.sift32(2 + 1));
        assertEquals("above", subject.sift32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias33() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge33());
        }
        assertEquals(2, subject.threshold33Count());
    }

    @Test
    void refusesOnceExhaustedBias33() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 2; i++) {
            subject.gauge33();
        }
        assertFalse(subject.gauge33());
    }

    @Test
    void accumulatesBelowTheCapWeight34() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.furl34(1));
        assertEquals(3, subject.furl34(2));
    }

    @Test
    void saturatesAtTheCapWeight34() {
        QuietKiln subject = new QuietKiln();
        subject.furl34(54);
        assertEquals(54, subject.furl34(5));
    }

    @Test
    void ignoresNegativeValuesWeight34() {
        QuietKiln subject = new QuietKiln();
        subject.furl34(3);
        assertEquals(3, subject.furl34(-2));
        assertEquals(3, subject.span34Value());
    }

    @Test
    void rejectsZeroDenominatorRatio35() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.collate35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio35() {
        assertEquals(0.5, new QuietKiln().collate35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio35() {
        assertEquals(1.0, new QuietKiln().collate35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally36() {
        assertTrue(new QuietKiln().sift36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new QuietKiln().sift36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally36() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietKiln().sift36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence37() {
        assertEquals("below", new QuietKiln().temper37(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence37() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.temper37(3));
        assertEquals("upper-bound", subject.temper37(8));
    }

    @Test
    void classifiesWithinAndAboveCadence37() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.temper37(3 + 1));
        assertEquals("above", subject.temper37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset38() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper38());
        }
        assertEquals(3, subject.capacity38Count());
    }

    @Test
    void refusesOnceExhaustedOffset38() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 3; i++) {
            subject.temper38();
        }
        assertFalse(subject.temper38());
    }

    @Test
    void accumulatesBelowTheCapThreshold39() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.reconcile39(1));
        assertEquals(3, subject.reconcile39(2));
    }

    @Test
    void saturatesAtTheCapThreshold39() {
        QuietKiln subject = new QuietKiln();
        subject.reconcile39(59);
        assertEquals(59, subject.reconcile39(5));
    }

    @Test
    void ignoresNegativeValuesThreshold39() {
        QuietKiln subject = new QuietKiln();
        subject.reconcile39(3);
        assertEquals(3, subject.reconcile39(-2));
        assertEquals(3, subject.ratio39Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold40() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold40() {
        assertEquals(0.5, new QuietKiln().sift40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold40() {
        assertEquals(1.0, new QuietKiln().sift40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth41() {
        assertTrue(new QuietKiln().furl41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new QuietKiln().furl41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth41() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietKiln().furl41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence42() {
        assertEquals("below", new QuietKiln().temper42(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence42() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.temper42(4));
        assertEquals("upper-bound", subject.temper42(7));
    }

    @Test
    void classifiesWithinAndAboveCadence42() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.temper42(4 + 1));
        assertEquals("above", subject.temper42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset43() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow43());
        }
        assertEquals(4, subject.cadence43Count());
    }

    @Test
    void refusesOnceExhaustedOffset43() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            subject.winnow43();
        }
        assertFalse(subject.winnow43());
    }

    @Test
    void accumulatesBelowTheCapRatio44() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.gauge44(1));
        assertEquals(3, subject.gauge44(2));
    }

    @Test
    void saturatesAtTheCapRatio44() {
        QuietKiln subject = new QuietKiln();
        subject.gauge44(24);
        assertEquals(24, subject.gauge44(5));
    }

    @Test
    void ignoresNegativeValuesRatio44() {
        QuietKiln subject = new QuietKiln();
        subject.gauge44(3);
        assertEquals(3, subject.gauge44(-2));
        assertEquals(3, subject.yield44Value());
    }

    @Test
    void rejectsZeroDenominatorOffset45() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset45() {
        assertEquals(0.5, new QuietKiln().gauge45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset45() {
        assertEquals(1.0, new QuietKiln().gauge45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan46() {
        assertTrue(new QuietKiln().prune46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new QuietKiln().prune46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan46() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietKiln().prune46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota47() {
        assertEquals("below", new QuietKiln().collate47(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota47() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.collate47(5));
        assertEquals("upper-bound", subject.collate47(12));
    }

    @Test
    void classifiesWithinAndAboveQuota47() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.collate47(5 + 1));
        assertEquals("above", subject.collate47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift48() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten48());
        }
        assertEquals(1, subject.ratio48Count());
    }

    @Test
    void refusesOnceExhaustedDrift48() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            subject.flatten48();
        }
        assertFalse(subject.flatten48());
    }

    @Test
    void accumulatesBelowTheCapThreshold49() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.collate49(1));
        assertEquals(3, subject.collate49(2));
    }

    @Test
    void saturatesAtTheCapThreshold49() {
        QuietKiln subject = new QuietKiln();
        subject.collate49(29);
        assertEquals(29, subject.collate49(5));
    }

    @Test
    void ignoresNegativeValuesThreshold49() {
        QuietKiln subject = new QuietKiln();
        subject.collate49(3);
        assertEquals(3, subject.collate49(-2));
        assertEquals(3, subject.drift49Value());
    }

    @Test
    void rejectsZeroDenominatorRatio50() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.furl50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio50() {
        assertEquals(0.5, new QuietKiln().furl50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio50() {
        assertEquals(1.0, new QuietKiln().furl50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota51() {
        assertTrue(new QuietKiln().reconcile51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new QuietKiln().reconcile51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota51() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietKiln().reconcile51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight52() {
        assertEquals("below", new QuietKiln().furl52(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight52() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.furl52(2));
        assertEquals("upper-bound", subject.furl52(11));
    }

    @Test
    void classifiesWithinAndAboveWeight52() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.furl52(2 + 1));
        assertEquals("above", subject.furl52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity53() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl53());
        }
        assertEquals(2, subject.tally53Count());
    }

    @Test
    void refusesOnceExhaustedCapacity53() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 2; i++) {
            subject.furl53();
        }
        assertFalse(subject.furl53());
    }

    @Test
    void accumulatesBelowTheCapSpan54() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.reconcile54(1));
        assertEquals(3, subject.reconcile54(2));
    }

    @Test
    void saturatesAtTheCapSpan54() {
        QuietKiln subject = new QuietKiln();
        subject.reconcile54(34);
        assertEquals(34, subject.reconcile54(5));
    }

    @Test
    void ignoresNegativeValuesSpan54() {
        QuietKiln subject = new QuietKiln();
        subject.reconcile54(3);
        assertEquals(3, subject.reconcile54(-2));
        assertEquals(3, subject.drift54Value());
    }

    @Test
    void rejectsZeroDenominatorRatio55() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio55() {
        assertEquals(0.5, new QuietKiln().gauge55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio55() {
        assertEquals(1.0, new QuietKiln().gauge55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift56() {
        assertTrue(new QuietKiln().furl56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new QuietKiln().furl56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift56() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietKiln().furl56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio57() {
        assertEquals("below", new QuietKiln().gauge57(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio57() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.gauge57(3));
        assertEquals("upper-bound", subject.gauge57(10));
    }

    @Test
    void classifiesWithinAndAboveRatio57() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.gauge57(3 + 1));
        assertEquals("above", subject.gauge57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth58() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate58());
        }
        assertEquals(3, subject.cadence58Count());
    }

    @Test
    void refusesOnceExhaustedDepth58() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 3; i++) {
            subject.collate58();
        }
        assertFalse(subject.collate58());
    }

    @Test
    void accumulatesBelowTheCapBias59() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.tally59(1));
        assertEquals(3, subject.tally59(2));
    }

    @Test
    void saturatesAtTheCapBias59() {
        QuietKiln subject = new QuietKiln();
        subject.tally59(39);
        assertEquals(39, subject.tally59(5));
    }

    @Test
    void ignoresNegativeValuesBias59() {
        QuietKiln subject = new QuietKiln();
        subject.tally59(3);
        assertEquals(3, subject.tally59(-2));
        assertEquals(3, subject.offset59Value());
    }

    @Test
    void rejectsZeroDenominatorRatio60() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.temper60(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio60() {
        assertEquals(0.5, new QuietKiln().temper60(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio60() {
        assertEquals(1.0, new QuietKiln().temper60(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight61() {
        assertTrue(new QuietKiln().reconcile61(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight61() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new QuietKiln().reconcile61(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight61() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietKiln().reconcile61(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold62() {
        assertEquals("below", new QuietKiln().prune62(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold62() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.prune62(4));
        assertEquals("upper-bound", subject.prune62(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold62() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.prune62(4 + 1));
        assertEquals("above", subject.prune62(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence63() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten63());
        }
        assertEquals(4, subject.yield63Count());
    }

    @Test
    void refusesOnceExhaustedCadence63() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            subject.flatten63();
        }
        assertFalse(subject.flatten63());
    }

    @Test
    void accumulatesBelowTheCapCadence64() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.furl64(1));
        assertEquals(3, subject.furl64(2));
    }

    @Test
    void saturatesAtTheCapCadence64() {
        QuietKiln subject = new QuietKiln();
        subject.furl64(44);
        assertEquals(44, subject.furl64(5));
    }

    @Test
    void ignoresNegativeValuesCadence64() {
        QuietKiln subject = new QuietKiln();
        subject.furl64(3);
        assertEquals(3, subject.furl64(-2));
        assertEquals(3, subject.offset64Value());
    }

    @Test
    void rejectsZeroDenominatorDrift65() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist65(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift65() {
        assertEquals(0.5, new QuietKiln().hoist65(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift65() {
        assertEquals(1.0, new QuietKiln().hoist65(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias66() {
        assertTrue(new QuietKiln().winnow66(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias66() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new QuietKiln().winnow66(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias66() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietKiln().winnow66(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio67() {
        assertEquals("below", new QuietKiln().temper67(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio67() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.temper67(5));
        assertEquals("upper-bound", subject.temper67(8));
    }

    @Test
    void classifiesWithinAndAboveRatio67() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.temper67(5 + 1));
        assertEquals("above", subject.temper67(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin68() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally68());
        }
        assertEquals(1, subject.ratio68Count());
    }

    @Test
    void refusesOnceExhaustedMargin68() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            subject.tally68();
        }
        assertFalse(subject.tally68());
    }

    @Test
    void accumulatesBelowTheCapMargin69() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.kindle69(1));
        assertEquals(3, subject.kindle69(2));
    }

    @Test
    void saturatesAtTheCapMargin69() {
        QuietKiln subject = new QuietKiln();
        subject.kindle69(49);
        assertEquals(49, subject.kindle69(5));
    }

    @Test
    void ignoresNegativeValuesMargin69() {
        QuietKiln subject = new QuietKiln();
        subject.kindle69(3);
        assertEquals(3, subject.kindle69(-2));
        assertEquals(3, subject.cadence69Value());
    }

    @Test
    void rejectsZeroDenominatorMargin70() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge70(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin70() {
        assertEquals(0.5, new QuietKiln().gauge70(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin70() {
        assertEquals(1.0, new QuietKiln().gauge70(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan71() {
        assertTrue(new QuietKiln().furl71(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan71() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new QuietKiln().furl71(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan71() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietKiln().furl71(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan72() {
        assertEquals("below", new QuietKiln().reconcile72(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan72() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.reconcile72(2));
        assertEquals("upper-bound", subject.reconcile72(7));
    }

    @Test
    void classifiesWithinAndAboveSpan72() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.reconcile72(2 + 1));
        assertEquals("above", subject.reconcile72(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold73() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile73());
        }
        assertEquals(2, subject.drift73Count());
    }

    @Test
    void refusesOnceExhaustedThreshold73() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 2; i++) {
            subject.reconcile73();
        }
        assertFalse(subject.reconcile73());
    }

    @Test
    void accumulatesBelowTheCapMargin74() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.brace74(1));
        assertEquals(3, subject.brace74(2));
    }

    @Test
    void saturatesAtTheCapMargin74() {
        QuietKiln subject = new QuietKiln();
        subject.brace74(54);
        assertEquals(54, subject.brace74(5));
    }

    @Test
    void ignoresNegativeValuesMargin74() {
        QuietKiln subject = new QuietKiln();
        subject.brace74(3);
        assertEquals(3, subject.brace74(-2));
        assertEquals(3, subject.quota74Value());
    }

    @Test
    void rejectsZeroDenominatorRatio75() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist75(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio75() {
        assertEquals(0.5, new QuietKiln().hoist75(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio75() {
        assertEquals(1.0, new QuietKiln().hoist75(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan76() {
        assertTrue(new QuietKiln().gauge76(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan76() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new QuietKiln().gauge76(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan76() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietKiln().gauge76(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin77() {
        assertEquals("below", new QuietKiln().temper77(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin77() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.temper77(3));
        assertEquals("upper-bound", subject.temper77(12));
    }

    @Test
    void classifiesWithinAndAboveMargin77() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.temper77(3 + 1));
        assertEquals("above", subject.temper77(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity78() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl78());
        }
        assertEquals(3, subject.quota78Count());
    }

    @Test
    void refusesOnceExhaustedCapacity78() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 3; i++) {
            subject.furl78();
        }
        assertFalse(subject.furl78());
    }

    @Test
    void accumulatesBelowTheCapOffset79() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.kindle79(1));
        assertEquals(3, subject.kindle79(2));
    }

    @Test
    void saturatesAtTheCapOffset79() {
        QuietKiln subject = new QuietKiln();
        subject.kindle79(59);
        assertEquals(59, subject.kindle79(5));
    }

    @Test
    void ignoresNegativeValuesOffset79() {
        QuietKiln subject = new QuietKiln();
        subject.kindle79(3);
        assertEquals(3, subject.kindle79(-2));
        assertEquals(3, subject.quota79Value());
    }

    @Test
    void rejectsZeroDenominatorRatio80() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge80(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio80() {
        assertEquals(0.5, new QuietKiln().gauge80(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio80() {
        assertEquals(1.0, new QuietKiln().gauge80(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence81() {
        assertTrue(new QuietKiln().tally81(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence81() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new QuietKiln().tally81(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence81() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietKiln().tally81(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence82() {
        assertEquals("below", new QuietKiln().flatten82(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence82() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.flatten82(4));
        assertEquals("upper-bound", subject.flatten82(11));
    }

    @Test
    void classifiesWithinAndAboveCadence82() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.flatten82(4 + 1));
        assertEquals("above", subject.flatten82(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold83() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow83());
        }
        assertEquals(4, subject.tally83Count());
    }

    @Test
    void refusesOnceExhaustedThreshold83() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            subject.winnow83();
        }
        assertFalse(subject.winnow83());
    }

    @Test
    void accumulatesBelowTheCapTally84() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.collate84(1));
        assertEquals(3, subject.collate84(2));
    }

    @Test
    void saturatesAtTheCapTally84() {
        QuietKiln subject = new QuietKiln();
        subject.collate84(24);
        assertEquals(24, subject.collate84(5));
    }

    @Test
    void ignoresNegativeValuesTally84() {
        QuietKiln subject = new QuietKiln();
        subject.collate84(3);
        assertEquals(3, subject.collate84(-2));
        assertEquals(3, subject.bias84Value());
    }

    @Test
    void rejectsZeroDenominatorTally85() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle85(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally85() {
        assertEquals(0.5, new QuietKiln().kindle85(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally85() {
        assertEquals(1.0, new QuietKiln().kindle85(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight86() {
        assertTrue(new QuietKiln().gauge86(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight86() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new QuietKiln().gauge86(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight86() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietKiln().gauge86(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift87() {
        assertEquals("below", new QuietKiln().hoist87(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift87() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.hoist87(5));
        assertEquals("upper-bound", subject.hoist87(10));
    }

    @Test
    void classifiesWithinAndAboveDrift87() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.hoist87(5 + 1));
        assertEquals("above", subject.hoist87(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan88() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten88());
        }
        assertEquals(1, subject.capacity88Count());
    }

    @Test
    void refusesOnceExhaustedSpan88() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            subject.flatten88();
        }
        assertFalse(subject.flatten88());
    }

    @Test
    void accumulatesBelowTheCapCapacity89() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.flatten89(1));
        assertEquals(3, subject.flatten89(2));
    }

    @Test
    void saturatesAtTheCapCapacity89() {
        QuietKiln subject = new QuietKiln();
        subject.flatten89(29);
        assertEquals(29, subject.flatten89(5));
    }

    @Test
    void ignoresNegativeValuesCapacity89() {
        QuietKiln subject = new QuietKiln();
        subject.flatten89(3);
        assertEquals(3, subject.flatten89(-2));
        assertEquals(3, subject.offset89Value());
    }

    @Test
    void rejectsZeroDenominatorOffset90() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift90(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset90() {
        assertEquals(0.5, new QuietKiln().sift90(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset90() {
        assertEquals(1.0, new QuietKiln().sift90(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan91() {
        assertTrue(new QuietKiln().brace91(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan91() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new QuietKiln().brace91(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan91() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietKiln().brace91(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity92() {
        assertEquals("below", new QuietKiln().furl92(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity92() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.furl92(2));
        assertEquals("upper-bound", subject.furl92(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity92() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.furl92(2 + 1));
        assertEquals("above", subject.furl92(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift93() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile93());
        }
        assertEquals(2, subject.offset93Count());
    }

    @Test
    void refusesOnceExhaustedDrift93() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 2; i++) {
            subject.reconcile93();
        }
        assertFalse(subject.reconcile93());
    }

    @Test
    void accumulatesBelowTheCapDepth94() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.winnow94(1));
        assertEquals(3, subject.winnow94(2));
    }

    @Test
    void saturatesAtTheCapDepth94() {
        QuietKiln subject = new QuietKiln();
        subject.winnow94(34);
        assertEquals(34, subject.winnow94(5));
    }

    @Test
    void ignoresNegativeValuesDepth94() {
        QuietKiln subject = new QuietKiln();
        subject.winnow94(3);
        assertEquals(3, subject.winnow94(-2));
        assertEquals(3, subject.ratio94Value());
    }

    @Test
    void rejectsZeroDenominatorDepth95() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift95(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth95() {
        assertEquals(0.5, new QuietKiln().sift95(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth95() {
        assertEquals(1.0, new QuietKiln().sift95(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota96() {
        assertTrue(new QuietKiln().flatten96(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota96() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new QuietKiln().flatten96(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota96() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietKiln().flatten96(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield97() {
        assertEquals("below", new QuietKiln().tally97(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield97() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.tally97(3));
        assertEquals("upper-bound", subject.tally97(8));
    }

    @Test
    void classifiesWithinAndAboveYield97() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.tally97(3 + 1));
        assertEquals("above", subject.tally97(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence98() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle98());
        }
        assertEquals(3, subject.tally98Count());
    }

    @Test
    void refusesOnceExhaustedCadence98() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 3; i++) {
            subject.kindle98();
        }
        assertFalse(subject.kindle98());
    }

    @Test
    void accumulatesBelowTheCapQuota99() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.temper99(1));
        assertEquals(3, subject.temper99(2));
    }

    @Test
    void saturatesAtTheCapQuota99() {
        QuietKiln subject = new QuietKiln();
        subject.temper99(39);
        assertEquals(39, subject.temper99(5));
    }

    @Test
    void ignoresNegativeValuesQuota99() {
        QuietKiln subject = new QuietKiln();
        subject.temper99(3);
        assertEquals(3, subject.temper99(-2));
        assertEquals(3, subject.offset99Value());
    }

    @Test
    void rejectsZeroDenominatorDrift100() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist100(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift100() {
        assertEquals(0.5, new QuietKiln().hoist100(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift100() {
        assertEquals(1.0, new QuietKiln().hoist100(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth101() {
        assertTrue(new QuietKiln().gauge101(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth101() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new QuietKiln().gauge101(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth101() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietKiln().gauge101(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin102() {
        assertEquals("below", new QuietKiln().furl102(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin102() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.furl102(4));
        assertEquals("upper-bound", subject.furl102(7));
    }

    @Test
    void classifiesWithinAndAboveMargin102() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.furl102(4 + 1));
        assertEquals("above", subject.furl102(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio103() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal103());
        }
        assertEquals(4, subject.drift103Count());
    }

    @Test
    void refusesOnceExhaustedRatio103() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            subject.anneal103();
        }
        assertFalse(subject.anneal103());
    }

    @Test
    void accumulatesBelowTheCapDepth104() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.sift104(1));
        assertEquals(3, subject.sift104(2));
    }

    @Test
    void saturatesAtTheCapDepth104() {
        QuietKiln subject = new QuietKiln();
        subject.sift104(44);
        assertEquals(44, subject.sift104(5));
    }

    @Test
    void ignoresNegativeValuesDepth104() {
        QuietKiln subject = new QuietKiln();
        subject.sift104(3);
        assertEquals(3, subject.sift104(-2));
        assertEquals(3, subject.offset104Value());
    }

    @Test
    void rejectsZeroDenominatorDepth105() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist105(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth105() {
        assertEquals(0.5, new QuietKiln().hoist105(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth105() {
        assertEquals(1.0, new QuietKiln().hoist105(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence106() {
        assertTrue(new QuietKiln().gauge106(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence106() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new QuietKiln().gauge106(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence106() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietKiln().gauge106(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield107() {
        assertEquals("below", new QuietKiln().prune107(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield107() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.prune107(5));
        assertEquals("upper-bound", subject.prune107(12));
    }

    @Test
    void classifiesWithinAndAboveYield107() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.prune107(5 + 1));
        assertEquals("above", subject.prune107(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth108() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist108());
        }
        assertEquals(1, subject.cadence108Count());
    }

    @Test
    void refusesOnceExhaustedDepth108() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            subject.hoist108();
        }
        assertFalse(subject.hoist108());
    }

    @Test
    void accumulatesBelowTheCapCapacity109() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.sift109(1));
        assertEquals(3, subject.sift109(2));
    }

    @Test
    void saturatesAtTheCapCapacity109() {
        QuietKiln subject = new QuietKiln();
        subject.sift109(49);
        assertEquals(49, subject.sift109(5));
    }

    @Test
    void ignoresNegativeValuesCapacity109() {
        QuietKiln subject = new QuietKiln();
        subject.sift109(3);
        assertEquals(3, subject.sift109(-2));
        assertEquals(3, subject.bias109Value());
    }

    @Test
    void rejectsZeroDenominatorSpan110() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.temper110(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan110() {
        assertEquals(0.5, new QuietKiln().temper110(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan110() {
        assertEquals(1.0, new QuietKiln().temper110(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift111() {
        assertTrue(new QuietKiln().gauge111(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift111() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new QuietKiln().gauge111(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift111() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietKiln().gauge111(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold112() {
        assertEquals("below", new QuietKiln().kindle112(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold112() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.kindle112(2));
        assertEquals("upper-bound", subject.kindle112(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold112() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.kindle112(2 + 1));
        assertEquals("above", subject.kindle112(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth113() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune113());
        }
        assertEquals(2, subject.tally113Count());
    }

    @Test
    void refusesOnceExhaustedDepth113() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 2; i++) {
            subject.prune113();
        }
        assertFalse(subject.prune113());
    }

    @Test
    void accumulatesBelowTheCapWeight114() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.collate114(1));
        assertEquals(3, subject.collate114(2));
    }

    @Test
    void saturatesAtTheCapWeight114() {
        QuietKiln subject = new QuietKiln();
        subject.collate114(54);
        assertEquals(54, subject.collate114(5));
    }

    @Test
    void ignoresNegativeValuesWeight114() {
        QuietKiln subject = new QuietKiln();
        subject.collate114(3);
        assertEquals(3, subject.collate114(-2));
        assertEquals(3, subject.drift114Value());
    }

    @Test
    void rejectsZeroDenominatorBias115() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge115(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias115() {
        assertEquals(0.5, new QuietKiln().gauge115(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias115() {
        assertEquals(1.0, new QuietKiln().gauge115(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence116() {
        assertTrue(new QuietKiln().anneal116(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence116() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new QuietKiln().anneal116(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence116() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietKiln().anneal116(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity117() {
        assertEquals("below", new QuietKiln().reconcile117(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity117() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.reconcile117(3));
        assertEquals("upper-bound", subject.reconcile117(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity117() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.reconcile117(3 + 1));
        assertEquals("above", subject.reconcile117(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold118() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle118());
        }
        assertEquals(3, subject.bias118Count());
    }

    @Test
    void refusesOnceExhaustedThreshold118() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 3; i++) {
            subject.kindle118();
        }
        assertFalse(subject.kindle118());
    }

    @Test
    void accumulatesBelowTheCapMargin119() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.kindle119(1));
        assertEquals(3, subject.kindle119(2));
    }

    @Test
    void saturatesAtTheCapMargin119() {
        QuietKiln subject = new QuietKiln();
        subject.kindle119(59);
        assertEquals(59, subject.kindle119(5));
    }

    @Test
    void ignoresNegativeValuesMargin119() {
        QuietKiln subject = new QuietKiln();
        subject.kindle119(3);
        assertEquals(3, subject.kindle119(-2));
        assertEquals(3, subject.span119Value());
    }

    @Test
    void rejectsZeroDenominatorYield120() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist120(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield120() {
        assertEquals(0.5, new QuietKiln().hoist120(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield120() {
        assertEquals(1.0, new QuietKiln().hoist120(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan121() {
        assertTrue(new QuietKiln().tally121(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan121() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new QuietKiln().tally121(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan121() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietKiln().tally121(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield122() {
        assertEquals("below", new QuietKiln().flatten122(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield122() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.flatten122(4));
        assertEquals("upper-bound", subject.flatten122(9));
    }

    @Test
    void classifiesWithinAndAboveYield122() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.flatten122(4 + 1));
        assertEquals("above", subject.flatten122(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset123() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift123());
        }
        assertEquals(4, subject.yield123Count());
    }

    @Test
    void refusesOnceExhaustedOffset123() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 4; i++) {
            subject.sift123();
        }
        assertFalse(subject.sift123());
    }

    @Test
    void accumulatesBelowTheCapCapacity124() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.prune124(1));
        assertEquals(3, subject.prune124(2));
    }

    @Test
    void saturatesAtTheCapCapacity124() {
        QuietKiln subject = new QuietKiln();
        subject.prune124(24);
        assertEquals(24, subject.prune124(5));
    }

    @Test
    void ignoresNegativeValuesCapacity124() {
        QuietKiln subject = new QuietKiln();
        subject.prune124(3);
        assertEquals(3, subject.prune124(-2));
        assertEquals(3, subject.offset124Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold125() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge125(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold125() {
        assertEquals(0.5, new QuietKiln().gauge125(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold125() {
        assertEquals(1.0, new QuietKiln().gauge125(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan126() {
        assertTrue(new QuietKiln().tally126(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan126() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new QuietKiln().tally126(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan126() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietKiln().tally126(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota127() {
        assertEquals("below", new QuietKiln().anneal127(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota127() {
        QuietKiln subject = new QuietKiln();
        assertEquals("lower-bound", subject.anneal127(5));
        assertEquals("upper-bound", subject.anneal127(8));
    }

    @Test
    void classifiesWithinAndAboveQuota127() {
        QuietKiln subject = new QuietKiln();
        assertEquals("within", subject.anneal127(5 + 1));
        assertEquals("above", subject.anneal127(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota128() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally128());
        }
        assertEquals(1, subject.bias128Count());
    }

    @Test
    void refusesOnceExhaustedQuota128() {
        QuietKiln subject = new QuietKiln();
        for (int i = 0; i < 1; i++) {
            subject.tally128();
        }
        assertFalse(subject.tally128());
    }

    @Test
    void accumulatesBelowTheCapThreshold129() {
        QuietKiln subject = new QuietKiln();
        assertEquals(1, subject.sift129(1));
        assertEquals(3, subject.sift129(2));
    }

    @Test
    void saturatesAtTheCapThreshold129() {
        QuietKiln subject = new QuietKiln();
        subject.sift129(29);
        assertEquals(29, subject.sift129(5));
    }

    @Test
    void ignoresNegativeValuesThreshold129() {
        QuietKiln subject = new QuietKiln();
        subject.sift129(3);
        assertEquals(3, subject.sift129(-2));
        assertEquals(3, subject.depth129Value());
    }

    @Test
    void rejectsZeroDenominatorDrift130() {
        QuietKiln subject = new QuietKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift130(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift130() {
        assertEquals(0.5, new QuietKiln().sift130(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift130() {
        assertEquals(1.0, new QuietKiln().sift130(1000.0, 1.0), 1e-9);
    }
}
