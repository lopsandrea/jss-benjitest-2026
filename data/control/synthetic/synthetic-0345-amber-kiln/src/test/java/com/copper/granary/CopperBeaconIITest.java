package com.copper.granary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperBeaconIITest {

    @Test
    void accumulatesBelowTheCapRatio0() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.temper0(1));
        assertEquals(3, subject.temper0(2));
    }

    @Test
    void saturatesAtTheCapRatio0() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.temper0(20);
        assertEquals(20, subject.temper0(5));
    }

    @Test
    void ignoresNegativeValuesRatio0() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.temper0(3);
        assertEquals(3, subject.temper0(-2));
        assertEquals(3, subject.weight0Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold1() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.collate1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold1() {
        assertEquals(0.5, new CopperBeaconII().collate1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold1() {
        assertEquals(2.0, new CopperBeaconII().collate1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias2() {
        assertTrue(new CopperBeaconII().furl2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new CopperBeaconII().furl2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias2() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperBeaconII().furl2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio3() {
        assertEquals("below", new CopperBeaconII().kindle3(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio3() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.kindle3(5));
        assertEquals("upper-bound", subject.kindle3(10));
    }

    @Test
    void classifiesWithinAndAboveRatio3() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.kindle3(5 + 1));
        assertEquals("above", subject.kindle3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin4() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge4());
        }
        assertEquals(1, subject.threshold4Count());
    }

    @Test
    void refusesOnceExhaustedMargin4() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            subject.gauge4();
        }
        assertFalse(subject.gauge4());
    }

    @Test
    void accumulatesBelowTheCapYield5() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.tally5(1));
        assertEquals(3, subject.tally5(2));
    }

    @Test
    void saturatesAtTheCapYield5() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.tally5(25);
        assertEquals(25, subject.tally5(5));
    }

    @Test
    void ignoresNegativeValuesYield5() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.tally5(3);
        assertEquals(3, subject.tally5(-2));
        assertEquals(3, subject.tally5Value());
    }

    @Test
    void rejectsZeroDenominatorDepth6() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.furl6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth6() {
        assertEquals(0.5, new CopperBeaconII().furl6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth6() {
        assertEquals(2.0, new CopperBeaconII().furl6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence7() {
        assertTrue(new CopperBeaconII().winnow7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new CopperBeaconII().winnow7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence7() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperBeaconII().winnow7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold8() {
        assertEquals("below", new CopperBeaconII().sift8(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold8() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.sift8(2));
        assertEquals("upper-bound", subject.sift8(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold8() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.sift8(2 + 1));
        assertEquals("above", subject.sift8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin9() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge9());
        }
        assertEquals(2, subject.yield9Count());
    }

    @Test
    void refusesOnceExhaustedMargin9() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 2; i++) {
            subject.gauge9();
        }
        assertFalse(subject.gauge9());
    }

    @Test
    void accumulatesBelowTheCapTally10() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.prune10(1));
        assertEquals(3, subject.prune10(2));
    }

    @Test
    void saturatesAtTheCapTally10() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.prune10(30);
        assertEquals(30, subject.prune10(5));
    }

    @Test
    void ignoresNegativeValuesTally10() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.prune10(3);
        assertEquals(3, subject.prune10(-2));
        assertEquals(3, subject.threshold10Value());
    }

    @Test
    void rejectsZeroDenominatorWeight11() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.anneal11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight11() {
        assertEquals(0.5, new CopperBeaconII().anneal11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight11() {
        assertEquals(2.0, new CopperBeaconII().anneal11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield12() {
        assertTrue(new CopperBeaconII().tally12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new CopperBeaconII().tally12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield12() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperBeaconII().tally12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset13() {
        assertEquals("below", new CopperBeaconII().brace13(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset13() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.brace13(3));
        assertEquals("upper-bound", subject.brace13(8));
    }

    @Test
    void classifiesWithinAndAboveOffset13() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.brace13(3 + 1));
        assertEquals("above", subject.brace13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota14() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper14());
        }
        assertEquals(3, subject.drift14Count());
    }

    @Test
    void refusesOnceExhaustedQuota14() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 3; i++) {
            subject.temper14();
        }
        assertFalse(subject.temper14());
    }

    @Test
    void accumulatesBelowTheCapWeight15() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.temper15(1));
        assertEquals(3, subject.temper15(2));
    }

    @Test
    void saturatesAtTheCapWeight15() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.temper15(35);
        assertEquals(35, subject.temper15(5));
    }

    @Test
    void ignoresNegativeValuesWeight15() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.temper15(3);
        assertEquals(3, subject.temper15(-2));
        assertEquals(3, subject.drift15Value());
    }

    @Test
    void rejectsZeroDenominatorRatio16() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.temper16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio16() {
        assertEquals(0.5, new CopperBeaconII().temper16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio16() {
        assertEquals(2.0, new CopperBeaconII().temper16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally17() {
        assertTrue(new CopperBeaconII().flatten17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new CopperBeaconII().flatten17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally17() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperBeaconII().flatten17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan18() {
        assertEquals("below", new CopperBeaconII().collate18(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan18() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.collate18(4));
        assertEquals("upper-bound", subject.collate18(7));
    }

    @Test
    void classifiesWithinAndAboveSpan18() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.collate18(4 + 1));
        assertEquals("above", subject.collate18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence19() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate19());
        }
        assertEquals(4, subject.margin19Count());
    }

    @Test
    void refusesOnceExhaustedCadence19() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 4; i++) {
            subject.collate19();
        }
        assertFalse(subject.collate19());
    }

    @Test
    void accumulatesBelowTheCapThreshold20() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.gauge20(1));
        assertEquals(3, subject.gauge20(2));
    }

    @Test
    void saturatesAtTheCapThreshold20() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.gauge20(40);
        assertEquals(40, subject.gauge20(5));
    }

    @Test
    void ignoresNegativeValuesThreshold20() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.gauge20(3);
        assertEquals(3, subject.gauge20(-2));
        assertEquals(3, subject.capacity20Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold21() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.kindle21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold21() {
        assertEquals(0.5, new CopperBeaconII().kindle21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold21() {
        assertEquals(2.0, new CopperBeaconII().kindle21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin22() {
        assertTrue(new CopperBeaconII().flatten22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new CopperBeaconII().flatten22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin22() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperBeaconII().flatten22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth23() {
        assertEquals("below", new CopperBeaconII().winnow23(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth23() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.winnow23(5));
        assertEquals("upper-bound", subject.winnow23(12));
    }

    @Test
    void classifiesWithinAndAboveDepth23() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.winnow23(5 + 1));
        assertEquals("above", subject.winnow23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias24() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate24());
        }
        assertEquals(1, subject.yield24Count());
    }

    @Test
    void refusesOnceExhaustedBias24() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            subject.collate24();
        }
        assertFalse(subject.collate24());
    }

    @Test
    void accumulatesBelowTheCapBias25() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.prune25(1));
        assertEquals(3, subject.prune25(2));
    }

    @Test
    void saturatesAtTheCapBias25() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.prune25(45);
        assertEquals(45, subject.prune25(5));
    }

    @Test
    void ignoresNegativeValuesBias25() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.prune25(3);
        assertEquals(3, subject.prune25(-2));
        assertEquals(3, subject.span25Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity26() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.brace26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity26() {
        assertEquals(0.5, new CopperBeaconII().brace26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity26() {
        assertEquals(2.0, new CopperBeaconII().brace26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin27() {
        assertTrue(new CopperBeaconII().winnow27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new CopperBeaconII().winnow27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin27() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperBeaconII().winnow27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold28() {
        assertEquals("below", new CopperBeaconII().brace28(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold28() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.brace28(2));
        assertEquals("upper-bound", subject.brace28(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold28() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.brace28(2 + 1));
        assertEquals("above", subject.brace28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield29() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow29());
        }
        assertEquals(2, subject.ratio29Count());
    }

    @Test
    void refusesOnceExhaustedYield29() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 2; i++) {
            subject.winnow29();
        }
        assertFalse(subject.winnow29());
    }

    @Test
    void accumulatesBelowTheCapQuota30() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.furl30(1));
        assertEquals(3, subject.furl30(2));
    }

    @Test
    void saturatesAtTheCapQuota30() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.furl30(50);
        assertEquals(50, subject.furl30(5));
    }

    @Test
    void ignoresNegativeValuesQuota30() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.furl30(3);
        assertEquals(3, subject.furl30(-2));
        assertEquals(3, subject.margin30Value());
    }

    @Test
    void rejectsZeroDenominatorCadence31() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.gauge31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence31() {
        assertEquals(0.5, new CopperBeaconII().gauge31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence31() {
        assertEquals(2.0, new CopperBeaconII().gauge31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold32() {
        assertTrue(new CopperBeaconII().winnow32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new CopperBeaconII().winnow32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold32() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperBeaconII().winnow32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan33() {
        assertEquals("below", new CopperBeaconII().brace33(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan33() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.brace33(3));
        assertEquals("upper-bound", subject.brace33(10));
    }

    @Test
    void classifiesWithinAndAboveSpan33() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.brace33(3 + 1));
        assertEquals("above", subject.brace33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota34() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune34());
        }
        assertEquals(3, subject.threshold34Count());
    }

    @Test
    void refusesOnceExhaustedQuota34() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 3; i++) {
            subject.prune34();
        }
        assertFalse(subject.prune34());
    }

    @Test
    void accumulatesBelowTheCapRatio35() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.reconcile35(1));
        assertEquals(3, subject.reconcile35(2));
    }

    @Test
    void saturatesAtTheCapRatio35() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.reconcile35(55);
        assertEquals(55, subject.reconcile35(5));
    }

    @Test
    void ignoresNegativeValuesRatio35() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.reconcile35(3);
        assertEquals(3, subject.reconcile35(-2));
        assertEquals(3, subject.cadence35Value());
    }

    @Test
    void rejectsZeroDenominatorYield36() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield36() {
        assertEquals(0.5, new CopperBeaconII().reconcile36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield36() {
        assertEquals(2.0, new CopperBeaconII().reconcile36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield37() {
        assertTrue(new CopperBeaconII().reconcile37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new CopperBeaconII().reconcile37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield37() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperBeaconII().reconcile37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight38() {
        assertEquals("below", new CopperBeaconII().winnow38(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight38() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.winnow38(4));
        assertEquals("upper-bound", subject.winnow38(9));
    }

    @Test
    void classifiesWithinAndAboveWeight38() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.winnow38(4 + 1));
        assertEquals("above", subject.winnow38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth39() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate39());
        }
        assertEquals(4, subject.ratio39Count());
    }

    @Test
    void refusesOnceExhaustedDepth39() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 4; i++) {
            subject.collate39();
        }
        assertFalse(subject.collate39());
    }

    @Test
    void accumulatesBelowTheCapThreshold40() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.gauge40(1));
        assertEquals(3, subject.gauge40(2));
    }

    @Test
    void saturatesAtTheCapThreshold40() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.gauge40(20);
        assertEquals(20, subject.gauge40(5));
    }

    @Test
    void ignoresNegativeValuesThreshold40() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.gauge40(3);
        assertEquals(3, subject.gauge40(-2));
        assertEquals(3, subject.margin40Value());
    }

    @Test
    void rejectsZeroDenominatorDrift41() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.anneal41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift41() {
        assertEquals(0.5, new CopperBeaconII().anneal41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift41() {
        assertEquals(2.0, new CopperBeaconII().anneal41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity42() {
        assertTrue(new CopperBeaconII().prune42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new CopperBeaconII().prune42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity42() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperBeaconII().prune42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth43() {
        assertEquals("below", new CopperBeaconII().prune43(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth43() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.prune43(5));
        assertEquals("upper-bound", subject.prune43(8));
    }

    @Test
    void classifiesWithinAndAboveDepth43() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.prune43(5 + 1));
        assertEquals("above", subject.prune43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield44() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile44());
        }
        assertEquals(1, subject.threshold44Count());
    }

    @Test
    void refusesOnceExhaustedYield44() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile44();
        }
        assertFalse(subject.reconcile44());
    }

    @Test
    void accumulatesBelowTheCapCapacity45() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.gauge45(1));
        assertEquals(3, subject.gauge45(2));
    }

    @Test
    void saturatesAtTheCapCapacity45() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.gauge45(25);
        assertEquals(25, subject.gauge45(5));
    }

    @Test
    void ignoresNegativeValuesCapacity45() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.gauge45(3);
        assertEquals(3, subject.gauge45(-2));
        assertEquals(3, subject.weight45Value());
    }

    @Test
    void rejectsZeroDenominatorSpan46() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.collate46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan46() {
        assertEquals(0.5, new CopperBeaconII().collate46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan46() {
        assertEquals(2.0, new CopperBeaconII().collate46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias47() {
        assertTrue(new CopperBeaconII().collate47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new CopperBeaconII().collate47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias47() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperBeaconII().collate47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota48() {
        assertEquals("below", new CopperBeaconII().anneal48(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota48() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.anneal48(2));
        assertEquals("upper-bound", subject.anneal48(7));
    }

    @Test
    void classifiesWithinAndAboveQuota48() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.anneal48(2 + 1));
        assertEquals("above", subject.anneal48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield49() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper49());
        }
        assertEquals(2, subject.drift49Count());
    }

    @Test
    void refusesOnceExhaustedYield49() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 2; i++) {
            subject.temper49();
        }
        assertFalse(subject.temper49());
    }

    @Test
    void accumulatesBelowTheCapBias50() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.tally50(1));
        assertEquals(3, subject.tally50(2));
    }

    @Test
    void saturatesAtTheCapBias50() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.tally50(30);
        assertEquals(30, subject.tally50(5));
    }

    @Test
    void ignoresNegativeValuesBias50() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.tally50(3);
        assertEquals(3, subject.tally50(-2));
        assertEquals(3, subject.tally50Value());
    }

    @Test
    void rejectsZeroDenominatorWeight51() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.winnow51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight51() {
        assertEquals(0.5, new CopperBeaconII().winnow51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight51() {
        assertEquals(2.0, new CopperBeaconII().winnow51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally52() {
        assertTrue(new CopperBeaconII().temper52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new CopperBeaconII().temper52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally52() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperBeaconII().temper52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield53() {
        assertEquals("below", new CopperBeaconII().kindle53(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield53() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.kindle53(3));
        assertEquals("upper-bound", subject.kindle53(12));
    }

    @Test
    void classifiesWithinAndAboveYield53() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.kindle53(3 + 1));
        assertEquals("above", subject.kindle53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally54() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally54());
        }
        assertEquals(3, subject.capacity54Count());
    }

    @Test
    void refusesOnceExhaustedTally54() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 3; i++) {
            subject.tally54();
        }
        assertFalse(subject.tally54());
    }

    @Test
    void accumulatesBelowTheCapBias55() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.kindle55(1));
        assertEquals(3, subject.kindle55(2));
    }

    @Test
    void saturatesAtTheCapBias55() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.kindle55(35);
        assertEquals(35, subject.kindle55(5));
    }

    @Test
    void ignoresNegativeValuesBias55() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.kindle55(3);
        assertEquals(3, subject.kindle55(-2));
        assertEquals(3, subject.drift55Value());
    }

    @Test
    void rejectsZeroDenominatorRatio56() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.temper56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio56() {
        assertEquals(0.5, new CopperBeaconII().temper56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio56() {
        assertEquals(2.0, new CopperBeaconII().temper56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin57() {
        assertTrue(new CopperBeaconII().hoist57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new CopperBeaconII().hoist57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin57() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperBeaconII().hoist57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio58() {
        assertEquals("below", new CopperBeaconII().hoist58(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio58() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.hoist58(4));
        assertEquals("upper-bound", subject.hoist58(11));
    }

    @Test
    void classifiesWithinAndAboveRatio58() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.hoist58(4 + 1));
        assertEquals("above", subject.hoist58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin59() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten59());
        }
        assertEquals(4, subject.drift59Count());
    }

    @Test
    void refusesOnceExhaustedMargin59() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 4; i++) {
            subject.flatten59();
        }
        assertFalse(subject.flatten59());
    }

    @Test
    void accumulatesBelowTheCapOffset60() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.anneal60(1));
        assertEquals(3, subject.anneal60(2));
    }

    @Test
    void saturatesAtTheCapOffset60() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.anneal60(40);
        assertEquals(40, subject.anneal60(5));
    }

    @Test
    void ignoresNegativeValuesOffset60() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.anneal60(3);
        assertEquals(3, subject.anneal60(-2));
        assertEquals(3, subject.depth60Value());
    }

    @Test
    void rejectsZeroDenominatorCadence61() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.tally61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence61() {
        assertEquals(0.5, new CopperBeaconII().tally61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence61() {
        assertEquals(2.0, new CopperBeaconII().tally61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield62() {
        assertTrue(new CopperBeaconII().reconcile62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new CopperBeaconII().reconcile62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield62() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperBeaconII().reconcile62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence63() {
        assertEquals("below", new CopperBeaconII().prune63(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence63() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.prune63(5));
        assertEquals("upper-bound", subject.prune63(10));
    }

    @Test
    void classifiesWithinAndAboveCadence63() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.prune63(5 + 1));
        assertEquals("above", subject.prune63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift64() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal64());
        }
        assertEquals(1, subject.depth64Count());
    }

    @Test
    void refusesOnceExhaustedDrift64() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            subject.anneal64();
        }
        assertFalse(subject.anneal64());
    }

    @Test
    void accumulatesBelowTheCapQuota65() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.sift65(1));
        assertEquals(3, subject.sift65(2));
    }

    @Test
    void saturatesAtTheCapQuota65() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.sift65(45);
        assertEquals(45, subject.sift65(5));
    }

    @Test
    void ignoresNegativeValuesQuota65() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.sift65(3);
        assertEquals(3, subject.sift65(-2));
        assertEquals(3, subject.yield65Value());
    }

    @Test
    void rejectsZeroDenominatorSpan66() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.gauge66(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan66() {
        assertEquals(0.5, new CopperBeaconII().gauge66(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan66() {
        assertEquals(2.0, new CopperBeaconII().gauge66(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift67() {
        assertTrue(new CopperBeaconII().temper67(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift67() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new CopperBeaconII().temper67(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift67() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperBeaconII().temper67(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan68() {
        assertEquals("below", new CopperBeaconII().winnow68(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan68() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.winnow68(2));
        assertEquals("upper-bound", subject.winnow68(9));
    }

    @Test
    void classifiesWithinAndAboveSpan68() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.winnow68(2 + 1));
        assertEquals("above", subject.winnow68(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity69() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist69());
        }
        assertEquals(2, subject.cadence69Count());
    }

    @Test
    void refusesOnceExhaustedCapacity69() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 2; i++) {
            subject.hoist69();
        }
        assertFalse(subject.hoist69());
    }

    @Test
    void accumulatesBelowTheCapSpan70() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.anneal70(1));
        assertEquals(3, subject.anneal70(2));
    }

    @Test
    void saturatesAtTheCapSpan70() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.anneal70(50);
        assertEquals(50, subject.anneal70(5));
    }

    @Test
    void ignoresNegativeValuesSpan70() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.anneal70(3);
        assertEquals(3, subject.anneal70(-2));
        assertEquals(3, subject.drift70Value());
    }

    @Test
    void rejectsZeroDenominatorOffset71() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.furl71(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset71() {
        assertEquals(0.5, new CopperBeaconII().furl71(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset71() {
        assertEquals(2.0, new CopperBeaconII().furl71(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally72() {
        assertTrue(new CopperBeaconII().brace72(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally72() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new CopperBeaconII().brace72(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally72() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperBeaconII().brace72(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota73() {
        assertEquals("below", new CopperBeaconII().flatten73(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota73() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.flatten73(3));
        assertEquals("upper-bound", subject.flatten73(8));
    }

    @Test
    void classifiesWithinAndAboveQuota73() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.flatten73(3 + 1));
        assertEquals("above", subject.flatten73(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift74() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate74());
        }
        assertEquals(3, subject.capacity74Count());
    }

    @Test
    void refusesOnceExhaustedDrift74() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 3; i++) {
            subject.collate74();
        }
        assertFalse(subject.collate74());
    }

    @Test
    void accumulatesBelowTheCapRatio75() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.prune75(1));
        assertEquals(3, subject.prune75(2));
    }

    @Test
    void saturatesAtTheCapRatio75() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.prune75(55);
        assertEquals(55, subject.prune75(5));
    }

    @Test
    void ignoresNegativeValuesRatio75() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.prune75(3);
        assertEquals(3, subject.prune75(-2));
        assertEquals(3, subject.span75Value());
    }

    @Test
    void rejectsZeroDenominatorDrift76() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.kindle76(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift76() {
        assertEquals(0.5, new CopperBeaconII().kindle76(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift76() {
        assertEquals(2.0, new CopperBeaconII().kindle76(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth77() {
        assertTrue(new CopperBeaconII().reconcile77(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth77() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new CopperBeaconII().reconcile77(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth77() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperBeaconII().reconcile77(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold78() {
        assertEquals("below", new CopperBeaconII().collate78(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold78() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.collate78(4));
        assertEquals("upper-bound", subject.collate78(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold78() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.collate78(4 + 1));
        assertEquals("above", subject.collate78(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan79() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate79());
        }
        assertEquals(4, subject.weight79Count());
    }

    @Test
    void refusesOnceExhaustedSpan79() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 4; i++) {
            subject.collate79();
        }
        assertFalse(subject.collate79());
    }

    @Test
    void accumulatesBelowTheCapBias80() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.brace80(1));
        assertEquals(3, subject.brace80(2));
    }

    @Test
    void saturatesAtTheCapBias80() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.brace80(20);
        assertEquals(20, subject.brace80(5));
    }

    @Test
    void ignoresNegativeValuesBias80() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.brace80(3);
        assertEquals(3, subject.brace80(-2));
        assertEquals(3, subject.drift80Value());
    }

    @Test
    void rejectsZeroDenominatorMargin81() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.gauge81(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin81() {
        assertEquals(0.5, new CopperBeaconII().gauge81(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin81() {
        assertEquals(2.0, new CopperBeaconII().gauge81(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity82() {
        assertTrue(new CopperBeaconII().gauge82(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity82() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new CopperBeaconII().gauge82(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity82() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperBeaconII().gauge82(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity83() {
        assertEquals("below", new CopperBeaconII().sift83(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity83() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.sift83(5));
        assertEquals("upper-bound", subject.sift83(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity83() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.sift83(5 + 1));
        assertEquals("above", subject.sift83(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan84() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl84());
        }
        assertEquals(1, subject.bias84Count());
    }

    @Test
    void refusesOnceExhaustedSpan84() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            subject.furl84();
        }
        assertFalse(subject.furl84());
    }

    @Test
    void accumulatesBelowTheCapCapacity85() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.tally85(1));
        assertEquals(3, subject.tally85(2));
    }

    @Test
    void saturatesAtTheCapCapacity85() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.tally85(25);
        assertEquals(25, subject.tally85(5));
    }

    @Test
    void ignoresNegativeValuesCapacity85() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.tally85(3);
        assertEquals(3, subject.tally85(-2));
        assertEquals(3, subject.quota85Value());
    }

    @Test
    void rejectsZeroDenominatorSpan86() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.hoist86(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan86() {
        assertEquals(0.5, new CopperBeaconII().hoist86(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan86() {
        assertEquals(2.0, new CopperBeaconII().hoist86(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota87() {
        assertTrue(new CopperBeaconII().furl87(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota87() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new CopperBeaconII().furl87(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota87() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperBeaconII().furl87(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset88() {
        assertEquals("below", new CopperBeaconII().tally88(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset88() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.tally88(2));
        assertEquals("upper-bound", subject.tally88(11));
    }

    @Test
    void classifiesWithinAndAboveOffset88() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.tally88(2 + 1));
        assertEquals("above", subject.tally88(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift89() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace89());
        }
        assertEquals(2, subject.offset89Count());
    }

    @Test
    void refusesOnceExhaustedDrift89() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 2; i++) {
            subject.brace89();
        }
        assertFalse(subject.brace89());
    }

    @Test
    void accumulatesBelowTheCapYield90() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.collate90(1));
        assertEquals(3, subject.collate90(2));
    }

    @Test
    void saturatesAtTheCapYield90() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.collate90(30);
        assertEquals(30, subject.collate90(5));
    }

    @Test
    void ignoresNegativeValuesYield90() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.collate90(3);
        assertEquals(3, subject.collate90(-2));
        assertEquals(3, subject.drift90Value());
    }

    @Test
    void rejectsZeroDenominatorDepth91() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.furl91(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth91() {
        assertEquals(0.5, new CopperBeaconII().furl91(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth91() {
        assertEquals(2.0, new CopperBeaconII().furl91(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield92() {
        assertTrue(new CopperBeaconII().winnow92(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield92() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new CopperBeaconII().winnow92(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield92() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperBeaconII().winnow92(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio93() {
        assertEquals("below", new CopperBeaconII().temper93(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio93() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.temper93(3));
        assertEquals("upper-bound", subject.temper93(10));
    }

    @Test
    void classifiesWithinAndAboveRatio93() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.temper93(3 + 1));
        assertEquals("above", subject.temper93(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth94() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow94());
        }
        assertEquals(3, subject.weight94Count());
    }

    @Test
    void refusesOnceExhaustedDepth94() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 3; i++) {
            subject.winnow94();
        }
        assertFalse(subject.winnow94());
    }

    @Test
    void accumulatesBelowTheCapMargin95() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.reconcile95(1));
        assertEquals(3, subject.reconcile95(2));
    }

    @Test
    void saturatesAtTheCapMargin95() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.reconcile95(35);
        assertEquals(35, subject.reconcile95(5));
    }

    @Test
    void ignoresNegativeValuesMargin95() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.reconcile95(3);
        assertEquals(3, subject.reconcile95(-2));
        assertEquals(3, subject.quota95Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold96() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.prune96(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold96() {
        assertEquals(0.5, new CopperBeaconII().prune96(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold96() {
        assertEquals(2.0, new CopperBeaconII().prune96(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield97() {
        assertTrue(new CopperBeaconII().prune97(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield97() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new CopperBeaconII().prune97(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield97() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperBeaconII().prune97(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio98() {
        assertEquals("below", new CopperBeaconII().collate98(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio98() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.collate98(4));
        assertEquals("upper-bound", subject.collate98(9));
    }

    @Test
    void classifiesWithinAndAboveRatio98() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.collate98(4 + 1));
        assertEquals("above", subject.collate98(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset99() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift99());
        }
        assertEquals(4, subject.drift99Count());
    }

    @Test
    void refusesOnceExhaustedOffset99() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 4; i++) {
            subject.sift99();
        }
        assertFalse(subject.sift99());
    }

    @Test
    void accumulatesBelowTheCapCapacity100() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.sift100(1));
        assertEquals(3, subject.sift100(2));
    }

    @Test
    void saturatesAtTheCapCapacity100() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.sift100(40);
        assertEquals(40, subject.sift100(5));
    }

    @Test
    void ignoresNegativeValuesCapacity100() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.sift100(3);
        assertEquals(3, subject.sift100(-2));
        assertEquals(3, subject.tally100Value());
    }

    @Test
    void rejectsZeroDenominatorRatio101() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.furl101(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio101() {
        assertEquals(0.5, new CopperBeaconII().furl101(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio101() {
        assertEquals(2.0, new CopperBeaconII().furl101(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota102() {
        assertTrue(new CopperBeaconII().collate102(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota102() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new CopperBeaconII().collate102(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota102() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperBeaconII().collate102(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight103() {
        assertEquals("below", new CopperBeaconII().temper103(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight103() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.temper103(5));
        assertEquals("upper-bound", subject.temper103(8));
    }

    @Test
    void classifiesWithinAndAboveWeight103() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.temper103(5 + 1));
        assertEquals("above", subject.temper103(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight104() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift104());
        }
        assertEquals(1, subject.threshold104Count());
    }

    @Test
    void refusesOnceExhaustedWeight104() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            subject.sift104();
        }
        assertFalse(subject.sift104());
    }

    @Test
    void accumulatesBelowTheCapTally105() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.furl105(1));
        assertEquals(3, subject.furl105(2));
    }

    @Test
    void saturatesAtTheCapTally105() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.furl105(45);
        assertEquals(45, subject.furl105(5));
    }

    @Test
    void ignoresNegativeValuesTally105() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.furl105(3);
        assertEquals(3, subject.furl105(-2));
        assertEquals(3, subject.offset105Value());
    }

    @Test
    void rejectsZeroDenominatorDrift106() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.furl106(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift106() {
        assertEquals(0.5, new CopperBeaconII().furl106(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift106() {
        assertEquals(2.0, new CopperBeaconII().furl106(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan107() {
        assertTrue(new CopperBeaconII().flatten107(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan107() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new CopperBeaconII().flatten107(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan107() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperBeaconII().flatten107(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence108() {
        assertEquals("below", new CopperBeaconII().winnow108(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence108() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.winnow108(2));
        assertEquals("upper-bound", subject.winnow108(7));
    }

    @Test
    void classifiesWithinAndAboveCadence108() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.winnow108(2 + 1));
        assertEquals("above", subject.winnow108(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan109() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift109());
        }
        assertEquals(2, subject.offset109Count());
    }

    @Test
    void refusesOnceExhaustedSpan109() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 2; i++) {
            subject.sift109();
        }
        assertFalse(subject.sift109());
    }

    @Test
    void accumulatesBelowTheCapMargin110() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.prune110(1));
        assertEquals(3, subject.prune110(2));
    }

    @Test
    void saturatesAtTheCapMargin110() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.prune110(50);
        assertEquals(50, subject.prune110(5));
    }

    @Test
    void ignoresNegativeValuesMargin110() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.prune110(3);
        assertEquals(3, subject.prune110(-2));
        assertEquals(3, subject.span110Value());
    }

    @Test
    void rejectsZeroDenominatorMargin111() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.flatten111(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin111() {
        assertEquals(0.5, new CopperBeaconII().flatten111(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin111() {
        assertEquals(2.0, new CopperBeaconII().flatten111(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan112() {
        assertTrue(new CopperBeaconII().prune112(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan112() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new CopperBeaconII().prune112(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan112() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperBeaconII().prune112(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally113() {
        assertEquals("below", new CopperBeaconII().brace113(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally113() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.brace113(3));
        assertEquals("upper-bound", subject.brace113(12));
    }

    @Test
    void classifiesWithinAndAboveTally113() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.brace113(3 + 1));
        assertEquals("above", subject.brace113(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold114() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl114());
        }
        assertEquals(3, subject.depth114Count());
    }

    @Test
    void refusesOnceExhaustedThreshold114() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 3; i++) {
            subject.furl114();
        }
        assertFalse(subject.furl114());
    }

    @Test
    void accumulatesBelowTheCapTally115() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.sift115(1));
        assertEquals(3, subject.sift115(2));
    }

    @Test
    void saturatesAtTheCapTally115() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.sift115(55);
        assertEquals(55, subject.sift115(5));
    }

    @Test
    void ignoresNegativeValuesTally115() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.sift115(3);
        assertEquals(3, subject.sift115(-2));
        assertEquals(3, subject.yield115Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity116() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.anneal116(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity116() {
        assertEquals(0.5, new CopperBeaconII().anneal116(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity116() {
        assertEquals(2.0, new CopperBeaconII().anneal116(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin117() {
        assertTrue(new CopperBeaconII().collate117(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin117() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new CopperBeaconII().collate117(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin117() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperBeaconII().collate117(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio118() {
        assertEquals("below", new CopperBeaconII().hoist118(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio118() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.hoist118(4));
        assertEquals("upper-bound", subject.hoist118(11));
    }

    @Test
    void classifiesWithinAndAboveRatio118() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.hoist118(4 + 1));
        assertEquals("above", subject.hoist118(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold119() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace119());
        }
        assertEquals(4, subject.cadence119Count());
    }

    @Test
    void refusesOnceExhaustedThreshold119() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 4; i++) {
            subject.brace119();
        }
        assertFalse(subject.brace119());
    }

    @Test
    void accumulatesBelowTheCapOffset120() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.winnow120(1));
        assertEquals(3, subject.winnow120(2));
    }

    @Test
    void saturatesAtTheCapOffset120() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.winnow120(20);
        assertEquals(20, subject.winnow120(5));
    }

    @Test
    void ignoresNegativeValuesOffset120() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.winnow120(3);
        assertEquals(3, subject.winnow120(-2));
        assertEquals(3, subject.quota120Value());
    }

    @Test
    void rejectsZeroDenominatorOffset121() {
        CopperBeaconII subject = new CopperBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.furl121(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset121() {
        assertEquals(0.5, new CopperBeaconII().furl121(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset121() {
        assertEquals(2.0, new CopperBeaconII().furl121(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally122() {
        assertTrue(new CopperBeaconII().kindle122(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally122() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new CopperBeaconII().kindle122(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally122() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperBeaconII().kindle122(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence123() {
        assertEquals("below", new CopperBeaconII().furl123(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence123() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("lower-bound", subject.furl123(5));
        assertEquals("upper-bound", subject.furl123(10));
    }

    @Test
    void classifiesWithinAndAboveCadence123() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals("within", subject.furl123(5 + 1));
        assertEquals("above", subject.furl123(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias124() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl124());
        }
        assertEquals(1, subject.margin124Count());
    }

    @Test
    void refusesOnceExhaustedBias124() {
        CopperBeaconII subject = new CopperBeaconII();
        for (int i = 0; i < 1; i++) {
            subject.furl124();
        }
        assertFalse(subject.furl124());
    }

    @Test
    void accumulatesBelowTheCapRatio125() {
        CopperBeaconII subject = new CopperBeaconII();
        assertEquals(1, subject.kindle125(1));
        assertEquals(3, subject.kindle125(2));
    }

    @Test
    void saturatesAtTheCapRatio125() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.kindle125(25);
        assertEquals(25, subject.kindle125(5));
    }

    @Test
    void ignoresNegativeValuesRatio125() {
        CopperBeaconII subject = new CopperBeaconII();
        subject.kindle125(3);
        assertEquals(3, subject.kindle125(-2));
        assertEquals(3, subject.margin125Value());
    }
}
