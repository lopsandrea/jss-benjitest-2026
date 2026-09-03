package com.ochre.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardPylonIITest {

    @Test
    void classifiesBelowTheLowerBoundOffset0() {
        assertEquals("below", new NorthwardPylonII().anneal0(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset0() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("lower-bound", subject.anneal0(2));
        assertEquals("upper-bound", subject.anneal0(7));
    }

    @Test
    void classifiesWithinAndAboveOffset0() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("within", subject.anneal0(2 + 1));
        assertEquals("above", subject.anneal0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift1() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune1());
        }
        assertEquals(2, subject.bias1Count());
    }

    @Test
    void refusesOnceExhaustedDrift1() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 2; i++) {
            subject.prune1();
        }
        assertFalse(subject.prune1());
    }

    @Test
    void accumulatesBelowTheCapDrift2() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals(1, subject.tally2(1));
        assertEquals(3, subject.tally2(2));
    }

    @Test
    void saturatesAtTheCapDrift2() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.tally2(22);
        assertEquals(22, subject.tally2(5));
    }

    @Test
    void ignoresNegativeValuesDrift2() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.tally2(3);
        assertEquals(3, subject.tally2(-2));
        assertEquals(3, subject.offset2Value());
    }

    @Test
    void rejectsZeroDenominatorRatio3() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertThrows(ArithmeticException.class, () -> subject.flatten3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio3() {
        assertEquals(0.5, new NorthwardPylonII().flatten3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio3() {
        assertEquals(4.0, new NorthwardPylonII().flatten3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity4() {
        assertTrue(new NorthwardPylonII().hoist4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardPylonII().hoist4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity4() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardPylonII().hoist4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield5() {
        assertEquals("below", new NorthwardPylonII().anneal5(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield5() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("lower-bound", subject.anneal5(3));
        assertEquals("upper-bound", subject.anneal5(12));
    }

    @Test
    void classifiesWithinAndAboveYield5() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("within", subject.anneal5(3 + 1));
        assertEquals("above", subject.anneal5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold6() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace6());
        }
        assertEquals(3, subject.tally6Count());
    }

    @Test
    void refusesOnceExhaustedThreshold6() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 3; i++) {
            subject.brace6();
        }
        assertFalse(subject.brace6());
    }

    @Test
    void accumulatesBelowTheCapCadence7() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals(1, subject.furl7(1));
        assertEquals(3, subject.furl7(2));
    }

    @Test
    void saturatesAtTheCapCadence7() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.furl7(27);
        assertEquals(27, subject.furl7(5));
    }

    @Test
    void ignoresNegativeValuesCadence7() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.furl7(3);
        assertEquals(3, subject.furl7(-2));
        assertEquals(3, subject.margin7Value());
    }

    @Test
    void rejectsZeroDenominatorCadence8() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertThrows(ArithmeticException.class, () -> subject.sift8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence8() {
        assertEquals(0.5, new NorthwardPylonII().sift8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence8() {
        assertEquals(4.0, new NorthwardPylonII().sift8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally9() {
        assertTrue(new NorthwardPylonII().furl9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new NorthwardPylonII().furl9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally9() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardPylonII().furl9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold10() {
        assertEquals("below", new NorthwardPylonII().winnow10(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold10() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("lower-bound", subject.winnow10(4));
        assertEquals("upper-bound", subject.winnow10(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold10() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("within", subject.winnow10(4 + 1));
        assertEquals("above", subject.winnow10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan11() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile11());
        }
        assertEquals(4, subject.depth11Count());
    }

    @Test
    void refusesOnceExhaustedSpan11() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile11();
        }
        assertFalse(subject.reconcile11());
    }

    @Test
    void accumulatesBelowTheCapSpan12() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals(1, subject.kindle12(1));
        assertEquals(3, subject.kindle12(2));
    }

    @Test
    void saturatesAtTheCapSpan12() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.kindle12(32);
        assertEquals(32, subject.kindle12(5));
    }

    @Test
    void ignoresNegativeValuesSpan12() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.kindle12(3);
        assertEquals(3, subject.kindle12(-2));
        assertEquals(3, subject.bias12Value());
    }

    @Test
    void rejectsZeroDenominatorRatio13() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertThrows(ArithmeticException.class, () -> subject.tally13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio13() {
        assertEquals(0.5, new NorthwardPylonII().tally13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio13() {
        assertEquals(4.0, new NorthwardPylonII().tally13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence14() {
        assertTrue(new NorthwardPylonII().brace14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new NorthwardPylonII().brace14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence14() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardPylonII().brace14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold15() {
        assertEquals("below", new NorthwardPylonII().kindle15(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold15() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("lower-bound", subject.kindle15(5));
        assertEquals("upper-bound", subject.kindle15(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold15() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("within", subject.kindle15(5 + 1));
        assertEquals("above", subject.kindle15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally16() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate16());
        }
        assertEquals(1, subject.threshold16Count());
    }

    @Test
    void refusesOnceExhaustedTally16() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 1; i++) {
            subject.collate16();
        }
        assertFalse(subject.collate16());
    }

    @Test
    void accumulatesBelowTheCapDepth17() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals(1, subject.hoist17(1));
        assertEquals(3, subject.hoist17(2));
    }

    @Test
    void saturatesAtTheCapDepth17() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.hoist17(37);
        assertEquals(37, subject.hoist17(5));
    }

    @Test
    void ignoresNegativeValuesDepth17() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.hoist17(3);
        assertEquals(3, subject.hoist17(-2));
        assertEquals(3, subject.drift17Value());
    }

    @Test
    void rejectsZeroDenominatorCadence18() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertThrows(ArithmeticException.class, () -> subject.flatten18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence18() {
        assertEquals(0.5, new NorthwardPylonII().flatten18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence18() {
        assertEquals(4.0, new NorthwardPylonII().flatten18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota19() {
        assertTrue(new NorthwardPylonII().prune19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new NorthwardPylonII().prune19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota19() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardPylonII().prune19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan20() {
        assertEquals("below", new NorthwardPylonII().temper20(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan20() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("lower-bound", subject.temper20(2));
        assertEquals("upper-bound", subject.temper20(9));
    }

    @Test
    void classifiesWithinAndAboveSpan20() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("within", subject.temper20(2 + 1));
        assertEquals("above", subject.temper20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan21() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge21());
        }
        assertEquals(2, subject.margin21Count());
    }

    @Test
    void refusesOnceExhaustedSpan21() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 2; i++) {
            subject.gauge21();
        }
        assertFalse(subject.gauge21());
    }

    @Test
    void accumulatesBelowTheCapQuota22() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals(1, subject.anneal22(1));
        assertEquals(3, subject.anneal22(2));
    }

    @Test
    void saturatesAtTheCapQuota22() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.anneal22(42);
        assertEquals(42, subject.anneal22(5));
    }

    @Test
    void ignoresNegativeValuesQuota22() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.anneal22(3);
        assertEquals(3, subject.anneal22(-2));
        assertEquals(3, subject.ratio22Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity23() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertThrows(ArithmeticException.class, () -> subject.collate23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity23() {
        assertEquals(0.5, new NorthwardPylonII().collate23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity23() {
        assertEquals(4.0, new NorthwardPylonII().collate23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence24() {
        assertTrue(new NorthwardPylonII().anneal24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new NorthwardPylonII().anneal24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence24() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardPylonII().anneal24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield25() {
        assertEquals("below", new NorthwardPylonII().tally25(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield25() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("lower-bound", subject.tally25(3));
        assertEquals("upper-bound", subject.tally25(8));
    }

    @Test
    void classifiesWithinAndAboveYield25() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("within", subject.tally25(3 + 1));
        assertEquals("above", subject.tally25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin26() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl26());
        }
        assertEquals(3, subject.threshold26Count());
    }

    @Test
    void refusesOnceExhaustedMargin26() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 3; i++) {
            subject.furl26();
        }
        assertFalse(subject.furl26());
    }

    @Test
    void accumulatesBelowTheCapThreshold27() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals(1, subject.prune27(1));
        assertEquals(3, subject.prune27(2));
    }

    @Test
    void saturatesAtTheCapThreshold27() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.prune27(47);
        assertEquals(47, subject.prune27(5));
    }

    @Test
    void ignoresNegativeValuesThreshold27() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.prune27(3);
        assertEquals(3, subject.prune27(-2));
        assertEquals(3, subject.ratio27Value());
    }

    @Test
    void rejectsZeroDenominatorSpan28() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertThrows(ArithmeticException.class, () -> subject.winnow28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan28() {
        assertEquals(0.5, new NorthwardPylonII().winnow28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan28() {
        assertEquals(4.0, new NorthwardPylonII().winnow28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio29() {
        assertTrue(new NorthwardPylonII().tally29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new NorthwardPylonII().tally29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio29() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardPylonII().tally29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset30() {
        assertEquals("below", new NorthwardPylonII().collate30(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset30() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("lower-bound", subject.collate30(4));
        assertEquals("upper-bound", subject.collate30(7));
    }

    @Test
    void classifiesWithinAndAboveOffset30() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("within", subject.collate30(4 + 1));
        assertEquals("above", subject.collate30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield31() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune31());
        }
        assertEquals(4, subject.weight31Count());
    }

    @Test
    void refusesOnceExhaustedYield31() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 4; i++) {
            subject.prune31();
        }
        assertFalse(subject.prune31());
    }

    @Test
    void accumulatesBelowTheCapSpan32() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals(1, subject.anneal32(1));
        assertEquals(3, subject.anneal32(2));
    }

    @Test
    void saturatesAtTheCapSpan32() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.anneal32(52);
        assertEquals(52, subject.anneal32(5));
    }

    @Test
    void ignoresNegativeValuesSpan32() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.anneal32(3);
        assertEquals(3, subject.anneal32(-2));
        assertEquals(3, subject.weight32Value());
    }

    @Test
    void rejectsZeroDenominatorDepth33() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertThrows(ArithmeticException.class, () -> subject.flatten33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth33() {
        assertEquals(0.5, new NorthwardPylonII().flatten33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth33() {
        assertEquals(4.0, new NorthwardPylonII().flatten33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity34() {
        assertTrue(new NorthwardPylonII().hoist34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new NorthwardPylonII().hoist34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity34() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardPylonII().hoist34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota35() {
        assertEquals("below", new NorthwardPylonII().temper35(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota35() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("lower-bound", subject.temper35(5));
        assertEquals("upper-bound", subject.temper35(12));
    }

    @Test
    void classifiesWithinAndAboveQuota35() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals("within", subject.temper35(5 + 1));
        assertEquals("above", subject.temper35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield36() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle36());
        }
        assertEquals(1, subject.weight36Count());
    }

    @Test
    void refusesOnceExhaustedYield36() {
        NorthwardPylonII subject = new NorthwardPylonII();
        for (int i = 0; i < 1; i++) {
            subject.kindle36();
        }
        assertFalse(subject.kindle36());
    }

    @Test
    void accumulatesBelowTheCapQuota37() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertEquals(1, subject.furl37(1));
        assertEquals(3, subject.furl37(2));
    }

    @Test
    void saturatesAtTheCapQuota37() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.furl37(57);
        assertEquals(57, subject.furl37(5));
    }

    @Test
    void ignoresNegativeValuesQuota37() {
        NorthwardPylonII subject = new NorthwardPylonII();
        subject.furl37(3);
        assertEquals(3, subject.furl37(-2));
        assertEquals(3, subject.bias37Value());
    }

    @Test
    void rejectsZeroDenominatorDrift38() {
        NorthwardPylonII subject = new NorthwardPylonII();
        assertThrows(ArithmeticException.class, () -> subject.gauge38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift38() {
        assertEquals(0.5, new NorthwardPylonII().gauge38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift38() {
        assertEquals(4.0, new NorthwardPylonII().gauge38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight39() {
        assertTrue(new NorthwardPylonII().prune39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new NorthwardPylonII().prune39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight39() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardPylonII().prune39(java.util.Arrays.asList(null, 9, null)));
    }
}
