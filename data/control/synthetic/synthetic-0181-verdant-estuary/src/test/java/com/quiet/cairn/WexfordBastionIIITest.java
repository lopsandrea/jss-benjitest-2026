package com.quiet.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordBastionIIITest {

    @Test
    void rejectsZeroDenominatorCapacity0() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertThrows(ArithmeticException.class, () -> subject.temper0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity0() {
        assertEquals(0.5, new WexfordBastionIII().temper0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity0() {
        assertEquals(1.0, new WexfordBastionIII().temper0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold1() {
        assertTrue(new WexfordBastionIII().collate1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new WexfordBastionIII().collate1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold1() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordBastionIII().collate1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity2() {
        assertEquals("below", new WexfordBastionIII().temper2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity2() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("lower-bound", subject.temper2(4));
        assertEquals("upper-bound", subject.temper2(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity2() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("within", subject.temper2(4 + 1));
        assertEquals("above", subject.temper2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset3() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal3());
        }
        assertEquals(4, subject.depth3Count());
    }

    @Test
    void refusesOnceExhaustedOffset3() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 4; i++) {
            subject.anneal3();
        }
        assertFalse(subject.anneal3());
    }

    @Test
    void accumulatesBelowTheCapDepth4() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals(1, subject.furl4(1));
        assertEquals(3, subject.furl4(2));
    }

    @Test
    void saturatesAtTheCapDepth4() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.furl4(24);
        assertEquals(24, subject.furl4(5));
    }

    @Test
    void ignoresNegativeValuesDepth4() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.furl4(3);
        assertEquals(3, subject.furl4(-2));
        assertEquals(3, subject.offset4Value());
    }

    @Test
    void rejectsZeroDenominatorRatio5() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertThrows(ArithmeticException.class, () -> subject.sift5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio5() {
        assertEquals(0.5, new WexfordBastionIII().sift5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio5() {
        assertEquals(1.0, new WexfordBastionIII().sift5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota6() {
        assertTrue(new WexfordBastionIII().gauge6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new WexfordBastionIII().gauge6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota6() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordBastionIII().gauge6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio7() {
        assertEquals("below", new WexfordBastionIII().flatten7(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio7() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("lower-bound", subject.flatten7(5));
        assertEquals("upper-bound", subject.flatten7(8));
    }

    @Test
    void classifiesWithinAndAboveRatio7() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("within", subject.flatten7(5 + 1));
        assertEquals("above", subject.flatten7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence8() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge8());
        }
        assertEquals(1, subject.bias8Count());
    }

    @Test
    void refusesOnceExhaustedCadence8() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 1; i++) {
            subject.gauge8();
        }
        assertFalse(subject.gauge8());
    }

    @Test
    void accumulatesBelowTheCapWeight9() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals(1, subject.gauge9(1));
        assertEquals(3, subject.gauge9(2));
    }

    @Test
    void saturatesAtTheCapWeight9() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.gauge9(29);
        assertEquals(29, subject.gauge9(5));
    }

    @Test
    void ignoresNegativeValuesWeight9() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.gauge9(3);
        assertEquals(3, subject.gauge9(-2));
        assertEquals(3, subject.offset9Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold10() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold10() {
        assertEquals(0.5, new WexfordBastionIII().kindle10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold10() {
        assertEquals(1.0, new WexfordBastionIII().kindle10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally11() {
        assertTrue(new WexfordBastionIII().collate11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new WexfordBastionIII().collate11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally11() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordBastionIII().collate11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally12() {
        assertEquals("below", new WexfordBastionIII().hoist12(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally12() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("lower-bound", subject.hoist12(2));
        assertEquals("upper-bound", subject.hoist12(7));
    }

    @Test
    void classifiesWithinAndAboveTally12() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("within", subject.hoist12(2 + 1));
        assertEquals("above", subject.hoist12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota13() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift13());
        }
        assertEquals(2, subject.margin13Count());
    }

    @Test
    void refusesOnceExhaustedQuota13() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 2; i++) {
            subject.sift13();
        }
        assertFalse(subject.sift13());
    }

    @Test
    void accumulatesBelowTheCapThreshold14() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals(1, subject.collate14(1));
        assertEquals(3, subject.collate14(2));
    }

    @Test
    void saturatesAtTheCapThreshold14() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.collate14(34);
        assertEquals(34, subject.collate14(5));
    }

    @Test
    void ignoresNegativeValuesThreshold14() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.collate14(3);
        assertEquals(3, subject.collate14(-2));
        assertEquals(3, subject.margin14Value());
    }

    @Test
    void rejectsZeroDenominatorDepth15() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth15() {
        assertEquals(0.5, new WexfordBastionIII().hoist15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth15() {
        assertEquals(1.0, new WexfordBastionIII().hoist15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield16() {
        assertTrue(new WexfordBastionIII().temper16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new WexfordBastionIII().temper16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield16() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordBastionIII().temper16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset17() {
        assertEquals("below", new WexfordBastionIII().tally17(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset17() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("lower-bound", subject.tally17(3));
        assertEquals("upper-bound", subject.tally17(12));
    }

    @Test
    void classifiesWithinAndAboveOffset17() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("within", subject.tally17(3 + 1));
        assertEquals("above", subject.tally17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield18() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle18());
        }
        assertEquals(3, subject.depth18Count());
    }

    @Test
    void refusesOnceExhaustedYield18() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 3; i++) {
            subject.kindle18();
        }
        assertFalse(subject.kindle18());
    }

    @Test
    void accumulatesBelowTheCapSpan19() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals(1, subject.flatten19(1));
        assertEquals(3, subject.flatten19(2));
    }

    @Test
    void saturatesAtTheCapSpan19() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.flatten19(39);
        assertEquals(39, subject.flatten19(5));
    }

    @Test
    void ignoresNegativeValuesSpan19() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.flatten19(3);
        assertEquals(3, subject.flatten19(-2));
        assertEquals(3, subject.quota19Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity20() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertThrows(ArithmeticException.class, () -> subject.brace20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity20() {
        assertEquals(0.5, new WexfordBastionIII().brace20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity20() {
        assertEquals(1.0, new WexfordBastionIII().brace20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity21() {
        assertTrue(new WexfordBastionIII().tally21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new WexfordBastionIII().tally21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity21() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordBastionIII().tally21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally22() {
        assertEquals("below", new WexfordBastionIII().sift22(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally22() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("lower-bound", subject.sift22(4));
        assertEquals("upper-bound", subject.sift22(11));
    }

    @Test
    void classifiesWithinAndAboveTally22() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("within", subject.sift22(4 + 1));
        assertEquals("above", subject.sift22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias23() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow23());
        }
        assertEquals(4, subject.depth23Count());
    }

    @Test
    void refusesOnceExhaustedBias23() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 4; i++) {
            subject.winnow23();
        }
        assertFalse(subject.winnow23());
    }

    @Test
    void accumulatesBelowTheCapMargin24() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals(1, subject.collate24(1));
        assertEquals(3, subject.collate24(2));
    }

    @Test
    void saturatesAtTheCapMargin24() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.collate24(44);
        assertEquals(44, subject.collate24(5));
    }

    @Test
    void ignoresNegativeValuesMargin24() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.collate24(3);
        assertEquals(3, subject.collate24(-2));
        assertEquals(3, subject.ratio24Value());
    }

    @Test
    void rejectsZeroDenominatorDepth25() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth25() {
        assertEquals(0.5, new WexfordBastionIII().anneal25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth25() {
        assertEquals(1.0, new WexfordBastionIII().anneal25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight26() {
        assertTrue(new WexfordBastionIII().flatten26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new WexfordBastionIII().flatten26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight26() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordBastionIII().flatten26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally27() {
        assertEquals("below", new WexfordBastionIII().collate27(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally27() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("lower-bound", subject.collate27(5));
        assertEquals("upper-bound", subject.collate27(10));
    }

    @Test
    void classifiesWithinAndAboveTally27() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("within", subject.collate27(5 + 1));
        assertEquals("above", subject.collate27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity28() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile28());
        }
        assertEquals(1, subject.yield28Count());
    }

    @Test
    void refusesOnceExhaustedCapacity28() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile28();
        }
        assertFalse(subject.reconcile28());
    }

    @Test
    void accumulatesBelowTheCapYield29() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals(1, subject.kindle29(1));
        assertEquals(3, subject.kindle29(2));
    }

    @Test
    void saturatesAtTheCapYield29() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.kindle29(49);
        assertEquals(49, subject.kindle29(5));
    }

    @Test
    void ignoresNegativeValuesYield29() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.kindle29(3);
        assertEquals(3, subject.kindle29(-2));
        assertEquals(3, subject.drift29Value());
    }

    @Test
    void rejectsZeroDenominatorWeight30() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight30() {
        assertEquals(0.5, new WexfordBastionIII().hoist30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight30() {
        assertEquals(1.0, new WexfordBastionIII().hoist30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias31() {
        assertTrue(new WexfordBastionIII().gauge31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new WexfordBastionIII().gauge31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias31() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordBastionIII().gauge31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota32() {
        assertEquals("below", new WexfordBastionIII().tally32(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota32() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("lower-bound", subject.tally32(2));
        assertEquals("upper-bound", subject.tally32(9));
    }

    @Test
    void classifiesWithinAndAboveQuota32() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("within", subject.tally32(2 + 1));
        assertEquals("above", subject.tally32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth33() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile33());
        }
        assertEquals(2, subject.ratio33Count());
    }

    @Test
    void refusesOnceExhaustedDepth33() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile33();
        }
        assertFalse(subject.reconcile33());
    }

    @Test
    void accumulatesBelowTheCapCadence34() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals(1, subject.furl34(1));
        assertEquals(3, subject.furl34(2));
    }

    @Test
    void saturatesAtTheCapCadence34() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.furl34(54);
        assertEquals(54, subject.furl34(5));
    }

    @Test
    void ignoresNegativeValuesCadence34() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.furl34(3);
        assertEquals(3, subject.furl34(-2));
        assertEquals(3, subject.drift34Value());
    }

    @Test
    void rejectsZeroDenominatorOffset35() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertThrows(ArithmeticException.class, () -> subject.tally35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset35() {
        assertEquals(0.5, new WexfordBastionIII().tally35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset35() {
        assertEquals(1.0, new WexfordBastionIII().tally35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift36() {
        assertTrue(new WexfordBastionIII().flatten36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new WexfordBastionIII().flatten36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift36() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordBastionIII().flatten36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally37() {
        assertEquals("below", new WexfordBastionIII().kindle37(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally37() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("lower-bound", subject.kindle37(3));
        assertEquals("upper-bound", subject.kindle37(8));
    }

    @Test
    void classifiesWithinAndAboveTally37() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("within", subject.kindle37(3 + 1));
        assertEquals("above", subject.kindle37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth38() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow38());
        }
        assertEquals(3, subject.drift38Count());
    }

    @Test
    void refusesOnceExhaustedDepth38() {
        WexfordBastionIII subject = new WexfordBastionIII();
        for (int i = 0; i < 3; i++) {
            subject.winnow38();
        }
        assertFalse(subject.winnow38());
    }

    @Test
    void accumulatesBelowTheCapQuota39() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals(1, subject.reconcile39(1));
        assertEquals(3, subject.reconcile39(2));
    }

    @Test
    void saturatesAtTheCapQuota39() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.reconcile39(59);
        assertEquals(59, subject.reconcile39(5));
    }

    @Test
    void ignoresNegativeValuesQuota39() {
        WexfordBastionIII subject = new WexfordBastionIII();
        subject.reconcile39(3);
        assertEquals(3, subject.reconcile39(-2));
        assertEquals(3, subject.threshold39Value());
    }

    @Test
    void rejectsZeroDenominatorQuota40() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertThrows(ArithmeticException.class, () -> subject.prune40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota40() {
        assertEquals(0.5, new WexfordBastionIII().prune40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota40() {
        assertEquals(1.0, new WexfordBastionIII().prune40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift41() {
        assertTrue(new WexfordBastionIII().sift41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new WexfordBastionIII().sift41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift41() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordBastionIII().sift41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias42() {
        assertEquals("below", new WexfordBastionIII().kindle42(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias42() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("lower-bound", subject.kindle42(4));
        assertEquals("upper-bound", subject.kindle42(7));
    }

    @Test
    void classifiesWithinAndAboveBias42() {
        WexfordBastionIII subject = new WexfordBastionIII();
        assertEquals("within", subject.kindle42(4 + 1));
        assertEquals("above", subject.kindle42(7 + 1));
    }
}
