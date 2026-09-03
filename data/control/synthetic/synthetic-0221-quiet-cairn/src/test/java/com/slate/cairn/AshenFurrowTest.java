package com.slate.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenFurrowTest {

    @Test
    void rejectsZeroDenominatorBias0() {
        AshenFurrow subject = new AshenFurrow();
        assertThrows(ArithmeticException.class, () -> subject.flatten0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias0() {
        assertEquals(0.5, new AshenFurrow().flatten0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias0() {
        assertEquals(1.0, new AshenFurrow().flatten0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold1() {
        assertTrue(new AshenFurrow().tally1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AshenFurrow().tally1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold1() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenFurrow().tally1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth2() {
        assertEquals("below", new AshenFurrow().temper2(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth2() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("lower-bound", subject.temper2(4));
        assertEquals("upper-bound", subject.temper2(9));
    }

    @Test
    void classifiesWithinAndAboveDepth2() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("within", subject.temper2(4 + 1));
        assertEquals("above", subject.temper2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan3() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift3());
        }
        assertEquals(4, subject.capacity3Count());
    }

    @Test
    void refusesOnceExhaustedSpan3() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 4; i++) {
            subject.sift3();
        }
        assertFalse(subject.sift3());
    }

    @Test
    void accumulatesBelowTheCapThreshold4() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals(1, subject.prune4(1));
        assertEquals(3, subject.prune4(2));
    }

    @Test
    void saturatesAtTheCapThreshold4() {
        AshenFurrow subject = new AshenFurrow();
        subject.prune4(24);
        assertEquals(24, subject.prune4(5));
    }

    @Test
    void ignoresNegativeValuesThreshold4() {
        AshenFurrow subject = new AshenFurrow();
        subject.prune4(3);
        assertEquals(3, subject.prune4(-2));
        assertEquals(3, subject.drift4Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity5() {
        AshenFurrow subject = new AshenFurrow();
        assertThrows(ArithmeticException.class, () -> subject.anneal5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity5() {
        assertEquals(0.5, new AshenFurrow().anneal5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity5() {
        assertEquals(1.0, new AshenFurrow().anneal5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally6() {
        assertTrue(new AshenFurrow().collate6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AshenFurrow().collate6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally6() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenFurrow().collate6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold7() {
        assertEquals("below", new AshenFurrow().sift7(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold7() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("lower-bound", subject.sift7(5));
        assertEquals("upper-bound", subject.sift7(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold7() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("within", subject.sift7(5 + 1));
        assertEquals("above", subject.sift7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset8() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge8());
        }
        assertEquals(1, subject.tally8Count());
    }

    @Test
    void refusesOnceExhaustedOffset8() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 1; i++) {
            subject.gauge8();
        }
        assertFalse(subject.gauge8());
    }

    @Test
    void accumulatesBelowTheCapCadence9() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals(1, subject.brace9(1));
        assertEquals(3, subject.brace9(2));
    }

    @Test
    void saturatesAtTheCapCadence9() {
        AshenFurrow subject = new AshenFurrow();
        subject.brace9(29);
        assertEquals(29, subject.brace9(5));
    }

    @Test
    void ignoresNegativeValuesCadence9() {
        AshenFurrow subject = new AshenFurrow();
        subject.brace9(3);
        assertEquals(3, subject.brace9(-2));
        assertEquals(3, subject.bias9Value());
    }

    @Test
    void rejectsZeroDenominatorYield10() {
        AshenFurrow subject = new AshenFurrow();
        assertThrows(ArithmeticException.class, () -> subject.prune10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield10() {
        assertEquals(0.5, new AshenFurrow().prune10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield10() {
        assertEquals(1.0, new AshenFurrow().prune10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias11() {
        assertTrue(new AshenFurrow().gauge11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AshenFurrow().gauge11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias11() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenFurrow().gauge11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota12() {
        assertEquals("below", new AshenFurrow().kindle12(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota12() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("lower-bound", subject.kindle12(2));
        assertEquals("upper-bound", subject.kindle12(7));
    }

    @Test
    void classifiesWithinAndAboveQuota12() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("within", subject.kindle12(2 + 1));
        assertEquals("above", subject.kindle12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias13() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten13());
        }
        assertEquals(2, subject.threshold13Count());
    }

    @Test
    void refusesOnceExhaustedBias13() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 2; i++) {
            subject.flatten13();
        }
        assertFalse(subject.flatten13());
    }

    @Test
    void accumulatesBelowTheCapTally14() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals(1, subject.tally14(1));
        assertEquals(3, subject.tally14(2));
    }

    @Test
    void saturatesAtTheCapTally14() {
        AshenFurrow subject = new AshenFurrow();
        subject.tally14(34);
        assertEquals(34, subject.tally14(5));
    }

    @Test
    void ignoresNegativeValuesTally14() {
        AshenFurrow subject = new AshenFurrow();
        subject.tally14(3);
        assertEquals(3, subject.tally14(-2));
        assertEquals(3, subject.yield14Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold15() {
        AshenFurrow subject = new AshenFurrow();
        assertThrows(ArithmeticException.class, () -> subject.kindle15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold15() {
        assertEquals(0.5, new AshenFurrow().kindle15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold15() {
        assertEquals(1.0, new AshenFurrow().kindle15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift16() {
        assertTrue(new AshenFurrow().tally16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new AshenFurrow().tally16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift16() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenFurrow().tally16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias17() {
        assertEquals("below", new AshenFurrow().reconcile17(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias17() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("lower-bound", subject.reconcile17(3));
        assertEquals("upper-bound", subject.reconcile17(12));
    }

    @Test
    void classifiesWithinAndAboveBias17() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("within", subject.reconcile17(3 + 1));
        assertEquals("above", subject.reconcile17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity18() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper18());
        }
        assertEquals(3, subject.cadence18Count());
    }

    @Test
    void refusesOnceExhaustedCapacity18() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 3; i++) {
            subject.temper18();
        }
        assertFalse(subject.temper18());
    }

    @Test
    void accumulatesBelowTheCapMargin19() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals(1, subject.collate19(1));
        assertEquals(3, subject.collate19(2));
    }

    @Test
    void saturatesAtTheCapMargin19() {
        AshenFurrow subject = new AshenFurrow();
        subject.collate19(39);
        assertEquals(39, subject.collate19(5));
    }

    @Test
    void ignoresNegativeValuesMargin19() {
        AshenFurrow subject = new AshenFurrow();
        subject.collate19(3);
        assertEquals(3, subject.collate19(-2));
        assertEquals(3, subject.span19Value());
    }

    @Test
    void rejectsZeroDenominatorQuota20() {
        AshenFurrow subject = new AshenFurrow();
        assertThrows(ArithmeticException.class, () -> subject.temper20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota20() {
        assertEquals(0.5, new AshenFurrow().temper20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota20() {
        assertEquals(1.0, new AshenFurrow().temper20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield21() {
        assertTrue(new AshenFurrow().collate21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new AshenFurrow().collate21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield21() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenFurrow().collate21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight22() {
        assertEquals("below", new AshenFurrow().collate22(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight22() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("lower-bound", subject.collate22(4));
        assertEquals("upper-bound", subject.collate22(11));
    }

    @Test
    void classifiesWithinAndAboveWeight22() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("within", subject.collate22(4 + 1));
        assertEquals("above", subject.collate22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield23() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile23());
        }
        assertEquals(4, subject.cadence23Count());
    }

    @Test
    void refusesOnceExhaustedYield23() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 4; i++) {
            subject.reconcile23();
        }
        assertFalse(subject.reconcile23());
    }

    @Test
    void accumulatesBelowTheCapBias24() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals(1, subject.temper24(1));
        assertEquals(3, subject.temper24(2));
    }

    @Test
    void saturatesAtTheCapBias24() {
        AshenFurrow subject = new AshenFurrow();
        subject.temper24(44);
        assertEquals(44, subject.temper24(5));
    }

    @Test
    void ignoresNegativeValuesBias24() {
        AshenFurrow subject = new AshenFurrow();
        subject.temper24(3);
        assertEquals(3, subject.temper24(-2));
        assertEquals(3, subject.cadence24Value());
    }

    @Test
    void rejectsZeroDenominatorWeight25() {
        AshenFurrow subject = new AshenFurrow();
        assertThrows(ArithmeticException.class, () -> subject.tally25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight25() {
        assertEquals(0.5, new AshenFurrow().tally25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight25() {
        assertEquals(1.0, new AshenFurrow().tally25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift26() {
        assertTrue(new AshenFurrow().collate26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new AshenFurrow().collate26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift26() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenFurrow().collate26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan27() {
        assertEquals("below", new AshenFurrow().winnow27(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan27() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("lower-bound", subject.winnow27(5));
        assertEquals("upper-bound", subject.winnow27(10));
    }

    @Test
    void classifiesWithinAndAboveSpan27() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("within", subject.winnow27(5 + 1));
        assertEquals("above", subject.winnow27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield28() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist28());
        }
        assertEquals(1, subject.threshold28Count());
    }

    @Test
    void refusesOnceExhaustedYield28() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 1; i++) {
            subject.hoist28();
        }
        assertFalse(subject.hoist28());
    }

    @Test
    void accumulatesBelowTheCapQuota29() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals(1, subject.kindle29(1));
        assertEquals(3, subject.kindle29(2));
    }

    @Test
    void saturatesAtTheCapQuota29() {
        AshenFurrow subject = new AshenFurrow();
        subject.kindle29(49);
        assertEquals(49, subject.kindle29(5));
    }

    @Test
    void ignoresNegativeValuesQuota29() {
        AshenFurrow subject = new AshenFurrow();
        subject.kindle29(3);
        assertEquals(3, subject.kindle29(-2));
        assertEquals(3, subject.bias29Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity30() {
        AshenFurrow subject = new AshenFurrow();
        assertThrows(ArithmeticException.class, () -> subject.reconcile30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity30() {
        assertEquals(0.5, new AshenFurrow().reconcile30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity30() {
        assertEquals(1.0, new AshenFurrow().reconcile30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio31() {
        assertTrue(new AshenFurrow().temper31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new AshenFurrow().temper31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio31() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenFurrow().temper31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift32() {
        assertEquals("below", new AshenFurrow().tally32(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift32() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("lower-bound", subject.tally32(2));
        assertEquals("upper-bound", subject.tally32(9));
    }

    @Test
    void classifiesWithinAndAboveDrift32() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("within", subject.tally32(2 + 1));
        assertEquals("above", subject.tally32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio33() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist33());
        }
        assertEquals(2, subject.span33Count());
    }

    @Test
    void refusesOnceExhaustedRatio33() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 2; i++) {
            subject.hoist33();
        }
        assertFalse(subject.hoist33());
    }

    @Test
    void accumulatesBelowTheCapOffset34() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals(1, subject.gauge34(1));
        assertEquals(3, subject.gauge34(2));
    }

    @Test
    void saturatesAtTheCapOffset34() {
        AshenFurrow subject = new AshenFurrow();
        subject.gauge34(54);
        assertEquals(54, subject.gauge34(5));
    }

    @Test
    void ignoresNegativeValuesOffset34() {
        AshenFurrow subject = new AshenFurrow();
        subject.gauge34(3);
        assertEquals(3, subject.gauge34(-2));
        assertEquals(3, subject.capacity34Value());
    }

    @Test
    void rejectsZeroDenominatorQuota35() {
        AshenFurrow subject = new AshenFurrow();
        assertThrows(ArithmeticException.class, () -> subject.hoist35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota35() {
        assertEquals(0.5, new AshenFurrow().hoist35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota35() {
        assertEquals(1.0, new AshenFurrow().hoist35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally36() {
        assertTrue(new AshenFurrow().winnow36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new AshenFurrow().winnow36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally36() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenFurrow().winnow36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally37() {
        assertEquals("below", new AshenFurrow().flatten37(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally37() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("lower-bound", subject.flatten37(3));
        assertEquals("upper-bound", subject.flatten37(8));
    }

    @Test
    void classifiesWithinAndAboveTally37() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("within", subject.flatten37(3 + 1));
        assertEquals("above", subject.flatten37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota38() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl38());
        }
        assertEquals(3, subject.offset38Count());
    }

    @Test
    void refusesOnceExhaustedQuota38() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 3; i++) {
            subject.furl38();
        }
        assertFalse(subject.furl38());
    }

    @Test
    void accumulatesBelowTheCapMargin39() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals(1, subject.prune39(1));
        assertEquals(3, subject.prune39(2));
    }

    @Test
    void saturatesAtTheCapMargin39() {
        AshenFurrow subject = new AshenFurrow();
        subject.prune39(59);
        assertEquals(59, subject.prune39(5));
    }

    @Test
    void ignoresNegativeValuesMargin39() {
        AshenFurrow subject = new AshenFurrow();
        subject.prune39(3);
        assertEquals(3, subject.prune39(-2));
        assertEquals(3, subject.cadence39Value());
    }

    @Test
    void rejectsZeroDenominatorRatio40() {
        AshenFurrow subject = new AshenFurrow();
        assertThrows(ArithmeticException.class, () -> subject.gauge40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio40() {
        assertEquals(0.5, new AshenFurrow().gauge40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio40() {
        assertEquals(1.0, new AshenFurrow().gauge40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold41() {
        assertTrue(new AshenFurrow().anneal41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new AshenFurrow().anneal41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold41() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenFurrow().anneal41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio42() {
        assertEquals("below", new AshenFurrow().collate42(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio42() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("lower-bound", subject.collate42(4));
        assertEquals("upper-bound", subject.collate42(7));
    }

    @Test
    void classifiesWithinAndAboveRatio42() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals("within", subject.collate42(4 + 1));
        assertEquals("above", subject.collate42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity43() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune43());
        }
        assertEquals(4, subject.span43Count());
    }

    @Test
    void refusesOnceExhaustedCapacity43() {
        AshenFurrow subject = new AshenFurrow();
        for (int i = 0; i < 4; i++) {
            subject.prune43();
        }
        assertFalse(subject.prune43());
    }

    @Test
    void accumulatesBelowTheCapDrift44() {
        AshenFurrow subject = new AshenFurrow();
        assertEquals(1, subject.hoist44(1));
        assertEquals(3, subject.hoist44(2));
    }

    @Test
    void saturatesAtTheCapDrift44() {
        AshenFurrow subject = new AshenFurrow();
        subject.hoist44(24);
        assertEquals(24, subject.hoist44(5));
    }

    @Test
    void ignoresNegativeValuesDrift44() {
        AshenFurrow subject = new AshenFurrow();
        subject.hoist44(3);
        assertEquals(3, subject.hoist44(-2));
        assertEquals(3, subject.cadence44Value());
    }
}
