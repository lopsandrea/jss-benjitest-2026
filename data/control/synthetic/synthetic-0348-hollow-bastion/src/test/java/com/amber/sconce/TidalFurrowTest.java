package com.amber.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalFurrowTest {

    @Test
    void classifiesBelowTheLowerBoundCadence0() {
        assertEquals("below", new TidalFurrow().gauge0(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence0() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("lower-bound", subject.gauge0(2));
        assertEquals("upper-bound", subject.gauge0(7));
    }

    @Test
    void classifiesWithinAndAboveCadence0() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("within", subject.gauge0(2 + 1));
        assertEquals("above", subject.gauge0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio1() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten1());
        }
        assertEquals(2, subject.tally1Count());
    }

    @Test
    void refusesOnceExhaustedRatio1() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 2; i++) {
            subject.flatten1();
        }
        assertFalse(subject.flatten1());
    }

    @Test
    void accumulatesBelowTheCapDrift2() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals(1, subject.flatten2(1));
        assertEquals(3, subject.flatten2(2));
    }

    @Test
    void saturatesAtTheCapDrift2() {
        TidalFurrow subject = new TidalFurrow();
        subject.flatten2(22);
        assertEquals(22, subject.flatten2(5));
    }

    @Test
    void ignoresNegativeValuesDrift2() {
        TidalFurrow subject = new TidalFurrow();
        subject.flatten2(3);
        assertEquals(3, subject.flatten2(-2));
        assertEquals(3, subject.quota2Value());
    }

    @Test
    void rejectsZeroDenominatorTally3() {
        TidalFurrow subject = new TidalFurrow();
        assertThrows(ArithmeticException.class, () -> subject.anneal3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally3() {
        assertEquals(0.5, new TidalFurrow().anneal3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally3() {
        assertEquals(4.0, new TidalFurrow().anneal3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield4() {
        assertTrue(new TidalFurrow().gauge4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new TidalFurrow().gauge4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield4() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalFurrow().gauge4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity5() {
        assertEquals("below", new TidalFurrow().gauge5(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity5() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("lower-bound", subject.gauge5(3));
        assertEquals("upper-bound", subject.gauge5(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity5() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("within", subject.gauge5(3 + 1));
        assertEquals("above", subject.gauge5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally6() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune6());
        }
        assertEquals(3, subject.cadence6Count());
    }

    @Test
    void refusesOnceExhaustedTally6() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 3; i++) {
            subject.prune6();
        }
        assertFalse(subject.prune6());
    }

    @Test
    void accumulatesBelowTheCapThreshold7() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals(1, subject.reconcile7(1));
        assertEquals(3, subject.reconcile7(2));
    }

    @Test
    void saturatesAtTheCapThreshold7() {
        TidalFurrow subject = new TidalFurrow();
        subject.reconcile7(27);
        assertEquals(27, subject.reconcile7(5));
    }

    @Test
    void ignoresNegativeValuesThreshold7() {
        TidalFurrow subject = new TidalFurrow();
        subject.reconcile7(3);
        assertEquals(3, subject.reconcile7(-2));
        assertEquals(3, subject.capacity7Value());
    }

    @Test
    void rejectsZeroDenominatorOffset8() {
        TidalFurrow subject = new TidalFurrow();
        assertThrows(ArithmeticException.class, () -> subject.collate8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset8() {
        assertEquals(0.5, new TidalFurrow().collate8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset8() {
        assertEquals(4.0, new TidalFurrow().collate8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally9() {
        assertTrue(new TidalFurrow().flatten9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new TidalFurrow().flatten9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally9() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalFurrow().flatten9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio10() {
        assertEquals("below", new TidalFurrow().collate10(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio10() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("lower-bound", subject.collate10(4));
        assertEquals("upper-bound", subject.collate10(11));
    }

    @Test
    void classifiesWithinAndAboveRatio10() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("within", subject.collate10(4 + 1));
        assertEquals("above", subject.collate10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset11() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile11());
        }
        assertEquals(4, subject.weight11Count());
    }

    @Test
    void refusesOnceExhaustedOffset11() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 4; i++) {
            subject.reconcile11();
        }
        assertFalse(subject.reconcile11());
    }

    @Test
    void accumulatesBelowTheCapDrift12() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals(1, subject.gauge12(1));
        assertEquals(3, subject.gauge12(2));
    }

    @Test
    void saturatesAtTheCapDrift12() {
        TidalFurrow subject = new TidalFurrow();
        subject.gauge12(32);
        assertEquals(32, subject.gauge12(5));
    }

    @Test
    void ignoresNegativeValuesDrift12() {
        TidalFurrow subject = new TidalFurrow();
        subject.gauge12(3);
        assertEquals(3, subject.gauge12(-2));
        assertEquals(3, subject.yield12Value());
    }

    @Test
    void rejectsZeroDenominatorTally13() {
        TidalFurrow subject = new TidalFurrow();
        assertThrows(ArithmeticException.class, () -> subject.anneal13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally13() {
        assertEquals(0.5, new TidalFurrow().anneal13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally13() {
        assertEquals(4.0, new TidalFurrow().anneal13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift14() {
        assertTrue(new TidalFurrow().tally14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new TidalFurrow().tally14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift14() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalFurrow().tally14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally15() {
        assertEquals("below", new TidalFurrow().collate15(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally15() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("lower-bound", subject.collate15(5));
        assertEquals("upper-bound", subject.collate15(10));
    }

    @Test
    void classifiesWithinAndAboveTally15() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("within", subject.collate15(5 + 1));
        assertEquals("above", subject.collate15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift16() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune16());
        }
        assertEquals(1, subject.weight16Count());
    }

    @Test
    void refusesOnceExhaustedDrift16() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 1; i++) {
            subject.prune16();
        }
        assertFalse(subject.prune16());
    }

    @Test
    void accumulatesBelowTheCapOffset17() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals(1, subject.reconcile17(1));
        assertEquals(3, subject.reconcile17(2));
    }

    @Test
    void saturatesAtTheCapOffset17() {
        TidalFurrow subject = new TidalFurrow();
        subject.reconcile17(37);
        assertEquals(37, subject.reconcile17(5));
    }

    @Test
    void ignoresNegativeValuesOffset17() {
        TidalFurrow subject = new TidalFurrow();
        subject.reconcile17(3);
        assertEquals(3, subject.reconcile17(-2));
        assertEquals(3, subject.cadence17Value());
    }

    @Test
    void rejectsZeroDenominatorDepth18() {
        TidalFurrow subject = new TidalFurrow();
        assertThrows(ArithmeticException.class, () -> subject.kindle18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth18() {
        assertEquals(0.5, new TidalFurrow().kindle18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth18() {
        assertEquals(4.0, new TidalFurrow().kindle18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold19() {
        assertTrue(new TidalFurrow().temper19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new TidalFurrow().temper19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold19() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalFurrow().temper19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias20() {
        assertEquals("below", new TidalFurrow().hoist20(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias20() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("lower-bound", subject.hoist20(2));
        assertEquals("upper-bound", subject.hoist20(9));
    }

    @Test
    void classifiesWithinAndAboveBias20() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("within", subject.hoist20(2 + 1));
        assertEquals("above", subject.hoist20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset21() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate21());
        }
        assertEquals(2, subject.threshold21Count());
    }

    @Test
    void refusesOnceExhaustedOffset21() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 2; i++) {
            subject.collate21();
        }
        assertFalse(subject.collate21());
    }

    @Test
    void accumulatesBelowTheCapMargin22() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals(1, subject.kindle22(1));
        assertEquals(3, subject.kindle22(2));
    }

    @Test
    void saturatesAtTheCapMargin22() {
        TidalFurrow subject = new TidalFurrow();
        subject.kindle22(42);
        assertEquals(42, subject.kindle22(5));
    }

    @Test
    void ignoresNegativeValuesMargin22() {
        TidalFurrow subject = new TidalFurrow();
        subject.kindle22(3);
        assertEquals(3, subject.kindle22(-2));
        assertEquals(3, subject.offset22Value());
    }

    @Test
    void rejectsZeroDenominatorTally23() {
        TidalFurrow subject = new TidalFurrow();
        assertThrows(ArithmeticException.class, () -> subject.winnow23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally23() {
        assertEquals(0.5, new TidalFurrow().winnow23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally23() {
        assertEquals(4.0, new TidalFurrow().winnow23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin24() {
        assertTrue(new TidalFurrow().temper24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new TidalFurrow().temper24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin24() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalFurrow().temper24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight25() {
        assertEquals("below", new TidalFurrow().anneal25(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight25() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("lower-bound", subject.anneal25(3));
        assertEquals("upper-bound", subject.anneal25(8));
    }

    @Test
    void classifiesWithinAndAboveWeight25() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("within", subject.anneal25(3 + 1));
        assertEquals("above", subject.anneal25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio26() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow26());
        }
        assertEquals(3, subject.capacity26Count());
    }

    @Test
    void refusesOnceExhaustedRatio26() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 3; i++) {
            subject.winnow26();
        }
        assertFalse(subject.winnow26());
    }

    @Test
    void accumulatesBelowTheCapBias27() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals(1, subject.furl27(1));
        assertEquals(3, subject.furl27(2));
    }

    @Test
    void saturatesAtTheCapBias27() {
        TidalFurrow subject = new TidalFurrow();
        subject.furl27(47);
        assertEquals(47, subject.furl27(5));
    }

    @Test
    void ignoresNegativeValuesBias27() {
        TidalFurrow subject = new TidalFurrow();
        subject.furl27(3);
        assertEquals(3, subject.furl27(-2));
        assertEquals(3, subject.threshold27Value());
    }

    @Test
    void rejectsZeroDenominatorCadence28() {
        TidalFurrow subject = new TidalFurrow();
        assertThrows(ArithmeticException.class, () -> subject.winnow28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence28() {
        assertEquals(0.5, new TidalFurrow().winnow28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence28() {
        assertEquals(4.0, new TidalFurrow().winnow28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield29() {
        assertTrue(new TidalFurrow().reconcile29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new TidalFurrow().reconcile29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield29() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalFurrow().reconcile29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold30() {
        assertEquals("below", new TidalFurrow().brace30(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold30() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("lower-bound", subject.brace30(4));
        assertEquals("upper-bound", subject.brace30(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold30() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("within", subject.brace30(4 + 1));
        assertEquals("above", subject.brace30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift31() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift31());
        }
        assertEquals(4, subject.depth31Count());
    }

    @Test
    void refusesOnceExhaustedDrift31() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 4; i++) {
            subject.sift31();
        }
        assertFalse(subject.sift31());
    }

    @Test
    void accumulatesBelowTheCapCadence32() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals(1, subject.brace32(1));
        assertEquals(3, subject.brace32(2));
    }

    @Test
    void saturatesAtTheCapCadence32() {
        TidalFurrow subject = new TidalFurrow();
        subject.brace32(52);
        assertEquals(52, subject.brace32(5));
    }

    @Test
    void ignoresNegativeValuesCadence32() {
        TidalFurrow subject = new TidalFurrow();
        subject.brace32(3);
        assertEquals(3, subject.brace32(-2));
        assertEquals(3, subject.yield32Value());
    }

    @Test
    void rejectsZeroDenominatorOffset33() {
        TidalFurrow subject = new TidalFurrow();
        assertThrows(ArithmeticException.class, () -> subject.gauge33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset33() {
        assertEquals(0.5, new TidalFurrow().gauge33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset33() {
        assertEquals(4.0, new TidalFurrow().gauge33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota34() {
        assertTrue(new TidalFurrow().anneal34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new TidalFurrow().anneal34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota34() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalFurrow().anneal34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan35() {
        assertEquals("below", new TidalFurrow().collate35(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan35() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("lower-bound", subject.collate35(5));
        assertEquals("upper-bound", subject.collate35(12));
    }

    @Test
    void classifiesWithinAndAboveSpan35() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("within", subject.collate35(5 + 1));
        assertEquals("above", subject.collate35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight36() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace36());
        }
        assertEquals(1, subject.offset36Count());
    }

    @Test
    void refusesOnceExhaustedWeight36() {
        TidalFurrow subject = new TidalFurrow();
        for (int i = 0; i < 1; i++) {
            subject.brace36();
        }
        assertFalse(subject.brace36());
    }

    @Test
    void accumulatesBelowTheCapWeight37() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals(1, subject.collate37(1));
        assertEquals(3, subject.collate37(2));
    }

    @Test
    void saturatesAtTheCapWeight37() {
        TidalFurrow subject = new TidalFurrow();
        subject.collate37(57);
        assertEquals(57, subject.collate37(5));
    }

    @Test
    void ignoresNegativeValuesWeight37() {
        TidalFurrow subject = new TidalFurrow();
        subject.collate37(3);
        assertEquals(3, subject.collate37(-2));
        assertEquals(3, subject.cadence37Value());
    }

    @Test
    void rejectsZeroDenominatorMargin38() {
        TidalFurrow subject = new TidalFurrow();
        assertThrows(ArithmeticException.class, () -> subject.winnow38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin38() {
        assertEquals(0.5, new TidalFurrow().winnow38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin38() {
        assertEquals(4.0, new TidalFurrow().winnow38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield39() {
        assertTrue(new TidalFurrow().flatten39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new TidalFurrow().flatten39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield39() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalFurrow().flatten39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight40() {
        assertEquals("below", new TidalFurrow().hoist40(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight40() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("lower-bound", subject.hoist40(2));
        assertEquals("upper-bound", subject.hoist40(11));
    }

    @Test
    void classifiesWithinAndAboveWeight40() {
        TidalFurrow subject = new TidalFurrow();
        assertEquals("within", subject.hoist40(2 + 1));
        assertEquals("above", subject.hoist40(11 + 1));
    }
}
