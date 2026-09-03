package com.northward.granary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowKilnTest {

    @Test
    void classifiesBelowTheLowerBoundTally0() {
        assertEquals("below", new HollowKiln().brace0(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally0() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.brace0(2));
        assertEquals("upper-bound", subject.brace0(7));
    }

    @Test
    void classifiesWithinAndAboveTally0() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.brace0(2 + 1));
        assertEquals("above", subject.brace0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset1() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper1());
        }
        assertEquals(2, subject.ratio1Count());
    }

    @Test
    void refusesOnceExhaustedOffset1() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 2; i++) {
            subject.temper1();
        }
        assertFalse(subject.temper1());
    }

    @Test
    void accumulatesBelowTheCapQuota2() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.reconcile2(1));
        assertEquals(3, subject.reconcile2(2));
    }

    @Test
    void saturatesAtTheCapQuota2() {
        HollowKiln subject = new HollowKiln();
        subject.reconcile2(22);
        assertEquals(22, subject.reconcile2(5));
    }

    @Test
    void ignoresNegativeValuesQuota2() {
        HollowKiln subject = new HollowKiln();
        subject.reconcile2(3);
        assertEquals(3, subject.reconcile2(-2));
        assertEquals(3, subject.threshold2Value());
    }

    @Test
    void rejectsZeroDenominatorSpan3() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan3() {
        assertEquals(0.5, new HollowKiln().anneal3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan3() {
        assertEquals(4.0, new HollowKiln().anneal3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold4() {
        assertTrue(new HollowKiln().prune4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new HollowKiln().prune4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold4() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowKiln().prune4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset5() {
        assertEquals("below", new HollowKiln().gauge5(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset5() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.gauge5(3));
        assertEquals("upper-bound", subject.gauge5(12));
    }

    @Test
    void classifiesWithinAndAboveOffset5() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.gauge5(3 + 1));
        assertEquals("above", subject.gauge5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold6() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal6());
        }
        assertEquals(3, subject.capacity6Count());
    }

    @Test
    void refusesOnceExhaustedThreshold6() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 3; i++) {
            subject.anneal6();
        }
        assertFalse(subject.anneal6());
    }

    @Test
    void accumulatesBelowTheCapCapacity7() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.reconcile7(1));
        assertEquals(3, subject.reconcile7(2));
    }

    @Test
    void saturatesAtTheCapCapacity7() {
        HollowKiln subject = new HollowKiln();
        subject.reconcile7(27);
        assertEquals(27, subject.reconcile7(5));
    }

    @Test
    void ignoresNegativeValuesCapacity7() {
        HollowKiln subject = new HollowKiln();
        subject.reconcile7(3);
        assertEquals(3, subject.reconcile7(-2));
        assertEquals(3, subject.yield7Value());
    }

    @Test
    void rejectsZeroDenominatorMargin8() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin8() {
        assertEquals(0.5, new HollowKiln().hoist8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin8() {
        assertEquals(4.0, new HollowKiln().hoist8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence9() {
        assertTrue(new HollowKiln().temper9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new HollowKiln().temper9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence9() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowKiln().temper9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota10() {
        assertEquals("below", new HollowKiln().flatten10(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota10() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.flatten10(4));
        assertEquals("upper-bound", subject.flatten10(11));
    }

    @Test
    void classifiesWithinAndAboveQuota10() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.flatten10(4 + 1));
        assertEquals("above", subject.flatten10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan11() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile11());
        }
        assertEquals(4, subject.cadence11Count());
    }

    @Test
    void refusesOnceExhaustedSpan11() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 4; i++) {
            subject.reconcile11();
        }
        assertFalse(subject.reconcile11());
    }

    @Test
    void accumulatesBelowTheCapMargin12() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.anneal12(1));
        assertEquals(3, subject.anneal12(2));
    }

    @Test
    void saturatesAtTheCapMargin12() {
        HollowKiln subject = new HollowKiln();
        subject.anneal12(32);
        assertEquals(32, subject.anneal12(5));
    }

    @Test
    void ignoresNegativeValuesMargin12() {
        HollowKiln subject = new HollowKiln();
        subject.anneal12(3);
        assertEquals(3, subject.anneal12(-2));
        assertEquals(3, subject.bias12Value());
    }

    @Test
    void rejectsZeroDenominatorCadence13() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence13() {
        assertEquals(0.5, new HollowKiln().tally13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence13() {
        assertEquals(4.0, new HollowKiln().tally13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin14() {
        assertTrue(new HollowKiln().tally14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new HollowKiln().tally14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin14() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowKiln().tally14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield15() {
        assertEquals("below", new HollowKiln().reconcile15(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield15() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.reconcile15(5));
        assertEquals("upper-bound", subject.reconcile15(10));
    }

    @Test
    void classifiesWithinAndAboveYield15() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.reconcile15(5 + 1));
        assertEquals("above", subject.reconcile15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio16() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace16());
        }
        assertEquals(1, subject.tally16Count());
    }

    @Test
    void refusesOnceExhaustedRatio16() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 1; i++) {
            subject.brace16();
        }
        assertFalse(subject.brace16());
    }

    @Test
    void accumulatesBelowTheCapThreshold17() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.temper17(1));
        assertEquals(3, subject.temper17(2));
    }

    @Test
    void saturatesAtTheCapThreshold17() {
        HollowKiln subject = new HollowKiln();
        subject.temper17(37);
        assertEquals(37, subject.temper17(5));
    }

    @Test
    void ignoresNegativeValuesThreshold17() {
        HollowKiln subject = new HollowKiln();
        subject.temper17(3);
        assertEquals(3, subject.temper17(-2));
        assertEquals(3, subject.margin17Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold18() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.flatten18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold18() {
        assertEquals(0.5, new HollowKiln().flatten18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold18() {
        assertEquals(4.0, new HollowKiln().flatten18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset19() {
        assertTrue(new HollowKiln().collate19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new HollowKiln().collate19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset19() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowKiln().collate19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin20() {
        assertEquals("below", new HollowKiln().hoist20(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin20() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.hoist20(2));
        assertEquals("upper-bound", subject.hoist20(9));
    }

    @Test
    void classifiesWithinAndAboveMargin20() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.hoist20(2 + 1));
        assertEquals("above", subject.hoist20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth21() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge21());
        }
        assertEquals(2, subject.bias21Count());
    }

    @Test
    void refusesOnceExhaustedDepth21() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 2; i++) {
            subject.gauge21();
        }
        assertFalse(subject.gauge21());
    }

    @Test
    void accumulatesBelowTheCapQuota22() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.kindle22(1));
        assertEquals(3, subject.kindle22(2));
    }

    @Test
    void saturatesAtTheCapQuota22() {
        HollowKiln subject = new HollowKiln();
        subject.kindle22(42);
        assertEquals(42, subject.kindle22(5));
    }

    @Test
    void ignoresNegativeValuesQuota22() {
        HollowKiln subject = new HollowKiln();
        subject.kindle22(3);
        assertEquals(3, subject.kindle22(-2));
        assertEquals(3, subject.drift22Value());
    }

    @Test
    void rejectsZeroDenominatorMargin23() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin23() {
        assertEquals(0.5, new HollowKiln().sift23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin23() {
        assertEquals(4.0, new HollowKiln().sift23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio24() {
        assertTrue(new HollowKiln().collate24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new HollowKiln().collate24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio24() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowKiln().collate24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift25() {
        assertEquals("below", new HollowKiln().prune25(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift25() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.prune25(3));
        assertEquals("upper-bound", subject.prune25(8));
    }

    @Test
    void classifiesWithinAndAboveDrift25() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.prune25(3 + 1));
        assertEquals("above", subject.prune25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan26() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal26());
        }
        assertEquals(3, subject.yield26Count());
    }

    @Test
    void refusesOnceExhaustedSpan26() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 3; i++) {
            subject.anneal26();
        }
        assertFalse(subject.anneal26());
    }

    @Test
    void accumulatesBelowTheCapDepth27() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.flatten27(1));
        assertEquals(3, subject.flatten27(2));
    }

    @Test
    void saturatesAtTheCapDepth27() {
        HollowKiln subject = new HollowKiln();
        subject.flatten27(47);
        assertEquals(47, subject.flatten27(5));
    }

    @Test
    void ignoresNegativeValuesDepth27() {
        HollowKiln subject = new HollowKiln();
        subject.flatten27(3);
        assertEquals(3, subject.flatten27(-2));
        assertEquals(3, subject.yield27Value());
    }

    @Test
    void rejectsZeroDenominatorDrift28() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift28() {
        assertEquals(0.5, new HollowKiln().gauge28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift28() {
        assertEquals(4.0, new HollowKiln().gauge28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold29() {
        assertTrue(new HollowKiln().sift29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new HollowKiln().sift29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold29() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowKiln().sift29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight30() {
        assertEquals("below", new HollowKiln().sift30(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight30() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.sift30(4));
        assertEquals("upper-bound", subject.sift30(7));
    }

    @Test
    void classifiesWithinAndAboveWeight30() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.sift30(4 + 1));
        assertEquals("above", subject.sift30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset31() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally31());
        }
        assertEquals(4, subject.span31Count());
    }

    @Test
    void refusesOnceExhaustedOffset31() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 4; i++) {
            subject.tally31();
        }
        assertFalse(subject.tally31());
    }

    @Test
    void accumulatesBelowTheCapTally32() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.brace32(1));
        assertEquals(3, subject.brace32(2));
    }

    @Test
    void saturatesAtTheCapTally32() {
        HollowKiln subject = new HollowKiln();
        subject.brace32(52);
        assertEquals(52, subject.brace32(5));
    }

    @Test
    void ignoresNegativeValuesTally32() {
        HollowKiln subject = new HollowKiln();
        subject.brace32(3);
        assertEquals(3, subject.brace32(-2));
        assertEquals(3, subject.span32Value());
    }

    @Test
    void rejectsZeroDenominatorMargin33() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin33() {
        assertEquals(0.5, new HollowKiln().tally33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin33() {
        assertEquals(4.0, new HollowKiln().tally33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin34() {
        assertTrue(new HollowKiln().gauge34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new HollowKiln().gauge34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin34() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowKiln().gauge34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity35() {
        assertEquals("below", new HollowKiln().hoist35(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity35() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.hoist35(5));
        assertEquals("upper-bound", subject.hoist35(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity35() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.hoist35(5 + 1));
        assertEquals("above", subject.hoist35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift36() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist36());
        }
        assertEquals(1, subject.bias36Count());
    }

    @Test
    void refusesOnceExhaustedDrift36() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 1; i++) {
            subject.hoist36();
        }
        assertFalse(subject.hoist36());
    }

    @Test
    void accumulatesBelowTheCapQuota37() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.temper37(1));
        assertEquals(3, subject.temper37(2));
    }

    @Test
    void saturatesAtTheCapQuota37() {
        HollowKiln subject = new HollowKiln();
        subject.temper37(57);
        assertEquals(57, subject.temper37(5));
    }

    @Test
    void ignoresNegativeValuesQuota37() {
        HollowKiln subject = new HollowKiln();
        subject.temper37(3);
        assertEquals(3, subject.temper37(-2));
        assertEquals(3, subject.ratio37Value());
    }

    @Test
    void rejectsZeroDenominatorYield38() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield38() {
        assertEquals(0.5, new HollowKiln().winnow38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield38() {
        assertEquals(4.0, new HollowKiln().winnow38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight39() {
        assertTrue(new HollowKiln().reconcile39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new HollowKiln().reconcile39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight39() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowKiln().reconcile39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin40() {
        assertEquals("below", new HollowKiln().temper40(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin40() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.temper40(2));
        assertEquals("upper-bound", subject.temper40(11));
    }

    @Test
    void classifiesWithinAndAboveMargin40() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.temper40(2 + 1));
        assertEquals("above", subject.temper40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence41() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist41());
        }
        assertEquals(2, subject.drift41Count());
    }

    @Test
    void refusesOnceExhaustedCadence41() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 2; i++) {
            subject.hoist41();
        }
        assertFalse(subject.hoist41());
    }

    @Test
    void accumulatesBelowTheCapRatio42() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.tally42(1));
        assertEquals(3, subject.tally42(2));
    }

    @Test
    void saturatesAtTheCapRatio42() {
        HollowKiln subject = new HollowKiln();
        subject.tally42(22);
        assertEquals(22, subject.tally42(5));
    }

    @Test
    void ignoresNegativeValuesRatio42() {
        HollowKiln subject = new HollowKiln();
        subject.tally42(3);
        assertEquals(3, subject.tally42(-2));
        assertEquals(3, subject.offset42Value());
    }

    @Test
    void rejectsZeroDenominatorQuota43() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.flatten43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota43() {
        assertEquals(0.5, new HollowKiln().flatten43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota43() {
        assertEquals(4.0, new HollowKiln().flatten43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence44() {
        assertTrue(new HollowKiln().brace44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new HollowKiln().brace44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence44() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowKiln().brace44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold45() {
        assertEquals("below", new HollowKiln().collate45(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold45() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.collate45(3));
        assertEquals("upper-bound", subject.collate45(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold45() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.collate45(3 + 1));
        assertEquals("above", subject.collate45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally46() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace46());
        }
        assertEquals(3, subject.offset46Count());
    }

    @Test
    void refusesOnceExhaustedTally46() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 3; i++) {
            subject.brace46();
        }
        assertFalse(subject.brace46());
    }

    @Test
    void accumulatesBelowTheCapYield47() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.hoist47(1));
        assertEquals(3, subject.hoist47(2));
    }

    @Test
    void saturatesAtTheCapYield47() {
        HollowKiln subject = new HollowKiln();
        subject.hoist47(27);
        assertEquals(27, subject.hoist47(5));
    }

    @Test
    void ignoresNegativeValuesYield47() {
        HollowKiln subject = new HollowKiln();
        subject.hoist47(3);
        assertEquals(3, subject.hoist47(-2));
        assertEquals(3, subject.cadence47Value());
    }

    @Test
    void rejectsZeroDenominatorDepth48() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth48() {
        assertEquals(0.5, new HollowKiln().gauge48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth48() {
        assertEquals(4.0, new HollowKiln().gauge48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally49() {
        assertTrue(new HollowKiln().reconcile49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new HollowKiln().reconcile49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally49() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowKiln().reconcile49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight50() {
        assertEquals("below", new HollowKiln().temper50(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight50() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.temper50(4));
        assertEquals("upper-bound", subject.temper50(9));
    }

    @Test
    void classifiesWithinAndAboveWeight50() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.temper50(4 + 1));
        assertEquals("above", subject.temper50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth51() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace51());
        }
        assertEquals(4, subject.bias51Count());
    }

    @Test
    void refusesOnceExhaustedDepth51() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 4; i++) {
            subject.brace51();
        }
        assertFalse(subject.brace51());
    }

    @Test
    void accumulatesBelowTheCapOffset52() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.brace52(1));
        assertEquals(3, subject.brace52(2));
    }

    @Test
    void saturatesAtTheCapOffset52() {
        HollowKiln subject = new HollowKiln();
        subject.brace52(32);
        assertEquals(32, subject.brace52(5));
    }

    @Test
    void ignoresNegativeValuesOffset52() {
        HollowKiln subject = new HollowKiln();
        subject.brace52(3);
        assertEquals(3, subject.brace52(-2));
        assertEquals(3, subject.span52Value());
    }

    @Test
    void rejectsZeroDenominatorQuota53() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.collate53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota53() {
        assertEquals(0.5, new HollowKiln().collate53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota53() {
        assertEquals(4.0, new HollowKiln().collate53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias54() {
        assertTrue(new HollowKiln().flatten54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new HollowKiln().flatten54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias54() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowKiln().flatten54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota55() {
        assertEquals("below", new HollowKiln().temper55(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota55() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.temper55(5));
        assertEquals("upper-bound", subject.temper55(8));
    }

    @Test
    void classifiesWithinAndAboveQuota55() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.temper55(5 + 1));
        assertEquals("above", subject.temper55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally56() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle56());
        }
        assertEquals(1, subject.yield56Count());
    }

    @Test
    void refusesOnceExhaustedTally56() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 1; i++) {
            subject.kindle56();
        }
        assertFalse(subject.kindle56());
    }

    @Test
    void accumulatesBelowTheCapCapacity57() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.sift57(1));
        assertEquals(3, subject.sift57(2));
    }

    @Test
    void saturatesAtTheCapCapacity57() {
        HollowKiln subject = new HollowKiln();
        subject.sift57(37);
        assertEquals(37, subject.sift57(5));
    }

    @Test
    void ignoresNegativeValuesCapacity57() {
        HollowKiln subject = new HollowKiln();
        subject.sift57(3);
        assertEquals(3, subject.sift57(-2));
        assertEquals(3, subject.bias57Value());
    }

    @Test
    void rejectsZeroDenominatorDepth58() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth58() {
        assertEquals(0.5, new HollowKiln().kindle58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth58() {
        assertEquals(4.0, new HollowKiln().kindle58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset59() {
        assertTrue(new HollowKiln().anneal59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new HollowKiln().anneal59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset59() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowKiln().anneal59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight60() {
        assertEquals("below", new HollowKiln().sift60(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight60() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.sift60(2));
        assertEquals("upper-bound", subject.sift60(7));
    }

    @Test
    void classifiesWithinAndAboveWeight60() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.sift60(2 + 1));
        assertEquals("above", subject.sift60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio61() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper61());
        }
        assertEquals(2, subject.tally61Count());
    }

    @Test
    void refusesOnceExhaustedRatio61() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 2; i++) {
            subject.temper61();
        }
        assertFalse(subject.temper61());
    }

    @Test
    void accumulatesBelowTheCapDrift62() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.furl62(1));
        assertEquals(3, subject.furl62(2));
    }

    @Test
    void saturatesAtTheCapDrift62() {
        HollowKiln subject = new HollowKiln();
        subject.furl62(42);
        assertEquals(42, subject.furl62(5));
    }

    @Test
    void ignoresNegativeValuesDrift62() {
        HollowKiln subject = new HollowKiln();
        subject.furl62(3);
        assertEquals(3, subject.furl62(-2));
        assertEquals(3, subject.span62Value());
    }

    @Test
    void rejectsZeroDenominatorRatio63() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio63() {
        assertEquals(0.5, new HollowKiln().winnow63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio63() {
        assertEquals(4.0, new HollowKiln().winnow63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset64() {
        assertTrue(new HollowKiln().hoist64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new HollowKiln().hoist64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset64() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowKiln().hoist64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally65() {
        assertEquals("below", new HollowKiln().anneal65(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally65() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.anneal65(3));
        assertEquals("upper-bound", subject.anneal65(12));
    }

    @Test
    void classifiesWithinAndAboveTally65() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.anneal65(3 + 1));
        assertEquals("above", subject.anneal65(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity66() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl66());
        }
        assertEquals(3, subject.bias66Count());
    }

    @Test
    void refusesOnceExhaustedCapacity66() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 3; i++) {
            subject.furl66();
        }
        assertFalse(subject.furl66());
    }

    @Test
    void accumulatesBelowTheCapDepth67() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.kindle67(1));
        assertEquals(3, subject.kindle67(2));
    }

    @Test
    void saturatesAtTheCapDepth67() {
        HollowKiln subject = new HollowKiln();
        subject.kindle67(47);
        assertEquals(47, subject.kindle67(5));
    }

    @Test
    void ignoresNegativeValuesDepth67() {
        HollowKiln subject = new HollowKiln();
        subject.kindle67(3);
        assertEquals(3, subject.kindle67(-2));
        assertEquals(3, subject.capacity67Value());
    }

    @Test
    void rejectsZeroDenominatorTally68() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.brace68(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally68() {
        assertEquals(0.5, new HollowKiln().brace68(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally68() {
        assertEquals(4.0, new HollowKiln().brace68(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias69() {
        assertTrue(new HollowKiln().sift69(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias69() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new HollowKiln().sift69(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias69() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowKiln().sift69(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota70() {
        assertEquals("below", new HollowKiln().furl70(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota70() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.furl70(4));
        assertEquals("upper-bound", subject.furl70(11));
    }

    @Test
    void classifiesWithinAndAboveQuota70() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.furl70(4 + 1));
        assertEquals("above", subject.furl70(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence71() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate71());
        }
        assertEquals(4, subject.quota71Count());
    }

    @Test
    void refusesOnceExhaustedCadence71() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 4; i++) {
            subject.collate71();
        }
        assertFalse(subject.collate71());
    }

    @Test
    void accumulatesBelowTheCapYield72() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.gauge72(1));
        assertEquals(3, subject.gauge72(2));
    }

    @Test
    void saturatesAtTheCapYield72() {
        HollowKiln subject = new HollowKiln();
        subject.gauge72(52);
        assertEquals(52, subject.gauge72(5));
    }

    @Test
    void ignoresNegativeValuesYield72() {
        HollowKiln subject = new HollowKiln();
        subject.gauge72(3);
        assertEquals(3, subject.gauge72(-2));
        assertEquals(3, subject.tally72Value());
    }

    @Test
    void rejectsZeroDenominatorOffset73() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift73(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset73() {
        assertEquals(0.5, new HollowKiln().sift73(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset73() {
        assertEquals(4.0, new HollowKiln().sift73(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence74() {
        assertTrue(new HollowKiln().prune74(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence74() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new HollowKiln().prune74(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence74() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowKiln().prune74(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio75() {
        assertEquals("below", new HollowKiln().winnow75(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio75() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.winnow75(5));
        assertEquals("upper-bound", subject.winnow75(10));
    }

    @Test
    void classifiesWithinAndAboveRatio75() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.winnow75(5 + 1));
        assertEquals("above", subject.winnow75(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift76() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow76());
        }
        assertEquals(1, subject.threshold76Count());
    }

    @Test
    void refusesOnceExhaustedDrift76() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 1; i++) {
            subject.winnow76();
        }
        assertFalse(subject.winnow76());
    }

    @Test
    void accumulatesBelowTheCapBias77() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.collate77(1));
        assertEquals(3, subject.collate77(2));
    }

    @Test
    void saturatesAtTheCapBias77() {
        HollowKiln subject = new HollowKiln();
        subject.collate77(57);
        assertEquals(57, subject.collate77(5));
    }

    @Test
    void ignoresNegativeValuesBias77() {
        HollowKiln subject = new HollowKiln();
        subject.collate77(3);
        assertEquals(3, subject.collate77(-2));
        assertEquals(3, subject.cadence77Value());
    }

    @Test
    void rejectsZeroDenominatorRatio78() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow78(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio78() {
        assertEquals(0.5, new HollowKiln().winnow78(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio78() {
        assertEquals(4.0, new HollowKiln().winnow78(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias79() {
        assertTrue(new HollowKiln().gauge79(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias79() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new HollowKiln().gauge79(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias79() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowKiln().gauge79(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio80() {
        assertEquals("below", new HollowKiln().flatten80(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio80() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.flatten80(2));
        assertEquals("upper-bound", subject.flatten80(9));
    }

    @Test
    void classifiesWithinAndAboveRatio80() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.flatten80(2 + 1));
        assertEquals("above", subject.flatten80(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift81() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune81());
        }
        assertEquals(2, subject.span81Count());
    }

    @Test
    void refusesOnceExhaustedDrift81() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 2; i++) {
            subject.prune81();
        }
        assertFalse(subject.prune81());
    }

    @Test
    void accumulatesBelowTheCapCadence82() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.collate82(1));
        assertEquals(3, subject.collate82(2));
    }

    @Test
    void saturatesAtTheCapCadence82() {
        HollowKiln subject = new HollowKiln();
        subject.collate82(22);
        assertEquals(22, subject.collate82(5));
    }

    @Test
    void ignoresNegativeValuesCadence82() {
        HollowKiln subject = new HollowKiln();
        subject.collate82(3);
        assertEquals(3, subject.collate82(-2));
        assertEquals(3, subject.tally82Value());
    }

    @Test
    void rejectsZeroDenominatorQuota83() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow83(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota83() {
        assertEquals(0.5, new HollowKiln().winnow83(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota83() {
        assertEquals(4.0, new HollowKiln().winnow83(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset84() {
        assertTrue(new HollowKiln().furl84(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset84() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new HollowKiln().furl84(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset84() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowKiln().furl84(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias85() {
        assertEquals("below", new HollowKiln().sift85(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias85() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.sift85(3));
        assertEquals("upper-bound", subject.sift85(8));
    }

    @Test
    void classifiesWithinAndAboveBias85() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.sift85(3 + 1));
        assertEquals("above", subject.sift85(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset86() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge86());
        }
        assertEquals(3, subject.tally86Count());
    }

    @Test
    void refusesOnceExhaustedOffset86() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 3; i++) {
            subject.gauge86();
        }
        assertFalse(subject.gauge86());
    }

    @Test
    void accumulatesBelowTheCapOffset87() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.tally87(1));
        assertEquals(3, subject.tally87(2));
    }

    @Test
    void saturatesAtTheCapOffset87() {
        HollowKiln subject = new HollowKiln();
        subject.tally87(27);
        assertEquals(27, subject.tally87(5));
    }

    @Test
    void ignoresNegativeValuesOffset87() {
        HollowKiln subject = new HollowKiln();
        subject.tally87(3);
        assertEquals(3, subject.tally87(-2));
        assertEquals(3, subject.cadence87Value());
    }

    @Test
    void rejectsZeroDenominatorMargin88() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow88(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin88() {
        assertEquals(0.5, new HollowKiln().winnow88(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin88() {
        assertEquals(4.0, new HollowKiln().winnow88(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight89() {
        assertTrue(new HollowKiln().temper89(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight89() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new HollowKiln().temper89(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight89() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowKiln().temper89(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity90() {
        assertEquals("below", new HollowKiln().winnow90(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity90() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.winnow90(4));
        assertEquals("upper-bound", subject.winnow90(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity90() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.winnow90(4 + 1));
        assertEquals("above", subject.winnow90(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence91() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift91());
        }
        assertEquals(4, subject.drift91Count());
    }

    @Test
    void refusesOnceExhaustedCadence91() {
        HollowKiln subject = new HollowKiln();
        for (int i = 0; i < 4; i++) {
            subject.sift91();
        }
        assertFalse(subject.sift91());
    }

    @Test
    void accumulatesBelowTheCapSpan92() {
        HollowKiln subject = new HollowKiln();
        assertEquals(1, subject.winnow92(1));
        assertEquals(3, subject.winnow92(2));
    }

    @Test
    void saturatesAtTheCapSpan92() {
        HollowKiln subject = new HollowKiln();
        subject.winnow92(32);
        assertEquals(32, subject.winnow92(5));
    }

    @Test
    void ignoresNegativeValuesSpan92() {
        HollowKiln subject = new HollowKiln();
        subject.winnow92(3);
        assertEquals(3, subject.winnow92(-2));
        assertEquals(3, subject.yield92Value());
    }

    @Test
    void rejectsZeroDenominatorCadence93() {
        HollowKiln subject = new HollowKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune93(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence93() {
        assertEquals(0.5, new HollowKiln().prune93(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence93() {
        assertEquals(4.0, new HollowKiln().prune93(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally94() {
        assertTrue(new HollowKiln().collate94(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally94() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new HollowKiln().collate94(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally94() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowKiln().collate94(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin95() {
        assertEquals("below", new HollowKiln().tally95(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin95() {
        HollowKiln subject = new HollowKiln();
        assertEquals("lower-bound", subject.tally95(5));
        assertEquals("upper-bound", subject.tally95(12));
    }

    @Test
    void classifiesWithinAndAboveMargin95() {
        HollowKiln subject = new HollowKiln();
        assertEquals("within", subject.tally95(5 + 1));
        assertEquals("above", subject.tally95(12 + 1));
    }
}
