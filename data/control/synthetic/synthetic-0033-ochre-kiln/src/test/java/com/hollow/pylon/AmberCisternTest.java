package com.hollow.pylon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberCisternTest {

    @Test
    void classifiesBelowTheLowerBoundDrift0() {
        assertEquals("below", new AmberCistern().kindle0(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift0() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.kindle0(2));
        assertEquals("upper-bound", subject.kindle0(7));
    }

    @Test
    void classifiesWithinAndAboveDrift0() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.kindle0(2 + 1));
        assertEquals("above", subject.kindle0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth1() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten1());
        }
        assertEquals(2, subject.bias1Count());
    }

    @Test
    void refusesOnceExhaustedDepth1() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 2; i++) {
            subject.flatten1();
        }
        assertFalse(subject.flatten1());
    }

    @Test
    void accumulatesBelowTheCapRatio2() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.furl2(1));
        assertEquals(3, subject.furl2(2));
    }

    @Test
    void saturatesAtTheCapRatio2() {
        AmberCistern subject = new AmberCistern();
        subject.furl2(22);
        assertEquals(22, subject.furl2(5));
    }

    @Test
    void ignoresNegativeValuesRatio2() {
        AmberCistern subject = new AmberCistern();
        subject.furl2(3);
        assertEquals(3, subject.furl2(-2));
        assertEquals(3, subject.depth2Value());
    }

    @Test
    void rejectsZeroDenominatorMargin3() {
        AmberCistern subject = new AmberCistern();
        assertThrows(ArithmeticException.class, () -> subject.temper3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin3() {
        assertEquals(0.5, new AmberCistern().temper3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin3() {
        assertEquals(4.0, new AmberCistern().temper3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio4() {
        assertTrue(new AmberCistern().winnow4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AmberCistern().winnow4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio4() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberCistern().winnow4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally5() {
        assertEquals("below", new AmberCistern().temper5(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally5() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.temper5(3));
        assertEquals("upper-bound", subject.temper5(12));
    }

    @Test
    void classifiesWithinAndAboveTally5() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.temper5(3 + 1));
        assertEquals("above", subject.temper5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold6() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune6());
        }
        assertEquals(3, subject.bias6Count());
    }

    @Test
    void refusesOnceExhaustedThreshold6() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 3; i++) {
            subject.prune6();
        }
        assertFalse(subject.prune6());
    }

    @Test
    void accumulatesBelowTheCapWeight7() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.winnow7(1));
        assertEquals(3, subject.winnow7(2));
    }

    @Test
    void saturatesAtTheCapWeight7() {
        AmberCistern subject = new AmberCistern();
        subject.winnow7(27);
        assertEquals(27, subject.winnow7(5));
    }

    @Test
    void ignoresNegativeValuesWeight7() {
        AmberCistern subject = new AmberCistern();
        subject.winnow7(3);
        assertEquals(3, subject.winnow7(-2));
        assertEquals(3, subject.depth7Value());
    }

    @Test
    void rejectsZeroDenominatorBias8() {
        AmberCistern subject = new AmberCistern();
        assertThrows(ArithmeticException.class, () -> subject.furl8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias8() {
        assertEquals(0.5, new AmberCistern().furl8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias8() {
        assertEquals(4.0, new AmberCistern().furl8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield9() {
        assertTrue(new AmberCistern().hoist9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AmberCistern().hoist9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield9() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberCistern().hoist9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota10() {
        assertEquals("below", new AmberCistern().gauge10(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota10() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.gauge10(4));
        assertEquals("upper-bound", subject.gauge10(11));
    }

    @Test
    void classifiesWithinAndAboveQuota10() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.gauge10(4 + 1));
        assertEquals("above", subject.gauge10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth11() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow11());
        }
        assertEquals(4, subject.drift11Count());
    }

    @Test
    void refusesOnceExhaustedDepth11() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 4; i++) {
            subject.winnow11();
        }
        assertFalse(subject.winnow11());
    }

    @Test
    void accumulatesBelowTheCapTally12() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.brace12(1));
        assertEquals(3, subject.brace12(2));
    }

    @Test
    void saturatesAtTheCapTally12() {
        AmberCistern subject = new AmberCistern();
        subject.brace12(32);
        assertEquals(32, subject.brace12(5));
    }

    @Test
    void ignoresNegativeValuesTally12() {
        AmberCistern subject = new AmberCistern();
        subject.brace12(3);
        assertEquals(3, subject.brace12(-2));
        assertEquals(3, subject.threshold12Value());
    }

    @Test
    void rejectsZeroDenominatorSpan13() {
        AmberCistern subject = new AmberCistern();
        assertThrows(ArithmeticException.class, () -> subject.temper13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan13() {
        assertEquals(0.5, new AmberCistern().temper13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan13() {
        assertEquals(4.0, new AmberCistern().temper13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence14() {
        assertTrue(new AmberCistern().collate14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AmberCistern().collate14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence14() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberCistern().collate14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally15() {
        assertEquals("below", new AmberCistern().flatten15(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally15() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.flatten15(5));
        assertEquals("upper-bound", subject.flatten15(10));
    }

    @Test
    void classifiesWithinAndAboveTally15() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.flatten15(5 + 1));
        assertEquals("above", subject.flatten15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin16() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate16());
        }
        assertEquals(1, subject.offset16Count());
    }

    @Test
    void refusesOnceExhaustedMargin16() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 1; i++) {
            subject.collate16();
        }
        assertFalse(subject.collate16());
    }

    @Test
    void accumulatesBelowTheCapDepth17() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.temper17(1));
        assertEquals(3, subject.temper17(2));
    }

    @Test
    void saturatesAtTheCapDepth17() {
        AmberCistern subject = new AmberCistern();
        subject.temper17(37);
        assertEquals(37, subject.temper17(5));
    }

    @Test
    void ignoresNegativeValuesDepth17() {
        AmberCistern subject = new AmberCistern();
        subject.temper17(3);
        assertEquals(3, subject.temper17(-2));
        assertEquals(3, subject.ratio17Value());
    }

    @Test
    void rejectsZeroDenominatorTally18() {
        AmberCistern subject = new AmberCistern();
        assertThrows(ArithmeticException.class, () -> subject.kindle18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally18() {
        assertEquals(0.5, new AmberCistern().kindle18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally18() {
        assertEquals(4.0, new AmberCistern().kindle18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias19() {
        assertTrue(new AmberCistern().brace19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new AmberCistern().brace19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias19() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberCistern().brace19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset20() {
        assertEquals("below", new AmberCistern().temper20(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset20() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.temper20(2));
        assertEquals("upper-bound", subject.temper20(9));
    }

    @Test
    void classifiesWithinAndAboveOffset20() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.temper20(2 + 1));
        assertEquals("above", subject.temper20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity21() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal21());
        }
        assertEquals(2, subject.yield21Count());
    }

    @Test
    void refusesOnceExhaustedCapacity21() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 2; i++) {
            subject.anneal21();
        }
        assertFalse(subject.anneal21());
    }

    @Test
    void accumulatesBelowTheCapWeight22() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.prune22(1));
        assertEquals(3, subject.prune22(2));
    }

    @Test
    void saturatesAtTheCapWeight22() {
        AmberCistern subject = new AmberCistern();
        subject.prune22(42);
        assertEquals(42, subject.prune22(5));
    }

    @Test
    void ignoresNegativeValuesWeight22() {
        AmberCistern subject = new AmberCistern();
        subject.prune22(3);
        assertEquals(3, subject.prune22(-2));
        assertEquals(3, subject.tally22Value());
    }

    @Test
    void rejectsZeroDenominatorWeight23() {
        AmberCistern subject = new AmberCistern();
        assertThrows(ArithmeticException.class, () -> subject.flatten23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight23() {
        assertEquals(0.5, new AmberCistern().flatten23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight23() {
        assertEquals(4.0, new AmberCistern().flatten23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio24() {
        assertTrue(new AmberCistern().brace24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new AmberCistern().brace24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio24() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberCistern().brace24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin25() {
        assertEquals("below", new AmberCistern().collate25(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin25() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.collate25(3));
        assertEquals("upper-bound", subject.collate25(8));
    }

    @Test
    void classifiesWithinAndAboveMargin25() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.collate25(3 + 1));
        assertEquals("above", subject.collate25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin26() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow26());
        }
        assertEquals(3, subject.drift26Count());
    }

    @Test
    void refusesOnceExhaustedMargin26() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 3; i++) {
            subject.winnow26();
        }
        assertFalse(subject.winnow26());
    }

    @Test
    void accumulatesBelowTheCapSpan27() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.winnow27(1));
        assertEquals(3, subject.winnow27(2));
    }

    @Test
    void saturatesAtTheCapSpan27() {
        AmberCistern subject = new AmberCistern();
        subject.winnow27(47);
        assertEquals(47, subject.winnow27(5));
    }

    @Test
    void ignoresNegativeValuesSpan27() {
        AmberCistern subject = new AmberCistern();
        subject.winnow27(3);
        assertEquals(3, subject.winnow27(-2));
        assertEquals(3, subject.drift27Value());
    }

    @Test
    void rejectsZeroDenominatorBias28() {
        AmberCistern subject = new AmberCistern();
        assertThrows(ArithmeticException.class, () -> subject.temper28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias28() {
        assertEquals(0.5, new AmberCistern().temper28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias28() {
        assertEquals(4.0, new AmberCistern().temper28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota29() {
        assertTrue(new AmberCistern().furl29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new AmberCistern().furl29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota29() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberCistern().furl29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity30() {
        assertEquals("below", new AmberCistern().sift30(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity30() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.sift30(4));
        assertEquals("upper-bound", subject.sift30(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity30() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.sift30(4 + 1));
        assertEquals("above", subject.sift30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota31() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist31());
        }
        assertEquals(4, subject.weight31Count());
    }

    @Test
    void refusesOnceExhaustedQuota31() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 4; i++) {
            subject.hoist31();
        }
        assertFalse(subject.hoist31());
    }

    @Test
    void accumulatesBelowTheCapMargin32() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.prune32(1));
        assertEquals(3, subject.prune32(2));
    }

    @Test
    void saturatesAtTheCapMargin32() {
        AmberCistern subject = new AmberCistern();
        subject.prune32(52);
        assertEquals(52, subject.prune32(5));
    }

    @Test
    void ignoresNegativeValuesMargin32() {
        AmberCistern subject = new AmberCistern();
        subject.prune32(3);
        assertEquals(3, subject.prune32(-2));
        assertEquals(3, subject.offset32Value());
    }

    @Test
    void rejectsZeroDenominatorDepth33() {
        AmberCistern subject = new AmberCistern();
        assertThrows(ArithmeticException.class, () -> subject.sift33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth33() {
        assertEquals(0.5, new AmberCistern().sift33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth33() {
        assertEquals(4.0, new AmberCistern().sift33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias34() {
        assertTrue(new AmberCistern().prune34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new AmberCistern().prune34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias34() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberCistern().prune34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity35() {
        assertEquals("below", new AmberCistern().reconcile35(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity35() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.reconcile35(5));
        assertEquals("upper-bound", subject.reconcile35(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity35() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.reconcile35(5 + 1));
        assertEquals("above", subject.reconcile35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias36() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow36());
        }
        assertEquals(1, subject.offset36Count());
    }

    @Test
    void refusesOnceExhaustedBias36() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 1; i++) {
            subject.winnow36();
        }
        assertFalse(subject.winnow36());
    }

    @Test
    void accumulatesBelowTheCapMargin37() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.kindle37(1));
        assertEquals(3, subject.kindle37(2));
    }

    @Test
    void saturatesAtTheCapMargin37() {
        AmberCistern subject = new AmberCistern();
        subject.kindle37(57);
        assertEquals(57, subject.kindle37(5));
    }

    @Test
    void ignoresNegativeValuesMargin37() {
        AmberCistern subject = new AmberCistern();
        subject.kindle37(3);
        assertEquals(3, subject.kindle37(-2));
        assertEquals(3, subject.ratio37Value());
    }

    @Test
    void rejectsZeroDenominatorYield38() {
        AmberCistern subject = new AmberCistern();
        assertThrows(ArithmeticException.class, () -> subject.brace38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield38() {
        assertEquals(0.5, new AmberCistern().brace38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield38() {
        assertEquals(4.0, new AmberCistern().brace38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence39() {
        assertTrue(new AmberCistern().collate39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new AmberCistern().collate39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence39() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberCistern().collate39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally40() {
        assertEquals("below", new AmberCistern().flatten40(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally40() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.flatten40(2));
        assertEquals("upper-bound", subject.flatten40(11));
    }

    @Test
    void classifiesWithinAndAboveTally40() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.flatten40(2 + 1));
        assertEquals("above", subject.flatten40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias41() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist41());
        }
        assertEquals(2, subject.depth41Count());
    }

    @Test
    void refusesOnceExhaustedBias41() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 2; i++) {
            subject.hoist41();
        }
        assertFalse(subject.hoist41());
    }

    @Test
    void accumulatesBelowTheCapBias42() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.kindle42(1));
        assertEquals(3, subject.kindle42(2));
    }

    @Test
    void saturatesAtTheCapBias42() {
        AmberCistern subject = new AmberCistern();
        subject.kindle42(22);
        assertEquals(22, subject.kindle42(5));
    }

    @Test
    void ignoresNegativeValuesBias42() {
        AmberCistern subject = new AmberCistern();
        subject.kindle42(3);
        assertEquals(3, subject.kindle42(-2));
        assertEquals(3, subject.tally42Value());
    }

    @Test
    void rejectsZeroDenominatorTally43() {
        AmberCistern subject = new AmberCistern();
        assertThrows(ArithmeticException.class, () -> subject.anneal43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally43() {
        assertEquals(0.5, new AmberCistern().anneal43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally43() {
        assertEquals(4.0, new AmberCistern().anneal43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally44() {
        assertTrue(new AmberCistern().collate44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new AmberCistern().collate44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally44() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberCistern().collate44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence45() {
        assertEquals("below", new AmberCistern().tally45(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence45() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.tally45(3));
        assertEquals("upper-bound", subject.tally45(10));
    }

    @Test
    void classifiesWithinAndAboveCadence45() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.tally45(3 + 1));
        assertEquals("above", subject.tally45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin46() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist46());
        }
        assertEquals(3, subject.depth46Count());
    }

    @Test
    void refusesOnceExhaustedMargin46() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 3; i++) {
            subject.hoist46();
        }
        assertFalse(subject.hoist46());
    }

    @Test
    void accumulatesBelowTheCapWeight47() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.reconcile47(1));
        assertEquals(3, subject.reconcile47(2));
    }

    @Test
    void saturatesAtTheCapWeight47() {
        AmberCistern subject = new AmberCistern();
        subject.reconcile47(27);
        assertEquals(27, subject.reconcile47(5));
    }

    @Test
    void ignoresNegativeValuesWeight47() {
        AmberCistern subject = new AmberCistern();
        subject.reconcile47(3);
        assertEquals(3, subject.reconcile47(-2));
        assertEquals(3, subject.threshold47Value());
    }

    @Test
    void rejectsZeroDenominatorYield48() {
        AmberCistern subject = new AmberCistern();
        assertThrows(ArithmeticException.class, () -> subject.temper48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield48() {
        assertEquals(0.5, new AmberCistern().temper48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield48() {
        assertEquals(4.0, new AmberCistern().temper48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity49() {
        assertTrue(new AmberCistern().gauge49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AmberCistern().gauge49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity49() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberCistern().gauge49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset50() {
        assertEquals("below", new AmberCistern().furl50(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset50() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.furl50(4));
        assertEquals("upper-bound", subject.furl50(9));
    }

    @Test
    void classifiesWithinAndAboveOffset50() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.furl50(4 + 1));
        assertEquals("above", subject.furl50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan51() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal51());
        }
        assertEquals(4, subject.offset51Count());
    }

    @Test
    void refusesOnceExhaustedSpan51() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 4; i++) {
            subject.anneal51();
        }
        assertFalse(subject.anneal51());
    }

    @Test
    void accumulatesBelowTheCapDrift52() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.reconcile52(1));
        assertEquals(3, subject.reconcile52(2));
    }

    @Test
    void saturatesAtTheCapDrift52() {
        AmberCistern subject = new AmberCistern();
        subject.reconcile52(32);
        assertEquals(32, subject.reconcile52(5));
    }

    @Test
    void ignoresNegativeValuesDrift52() {
        AmberCistern subject = new AmberCistern();
        subject.reconcile52(3);
        assertEquals(3, subject.reconcile52(-2));
        assertEquals(3, subject.weight52Value());
    }

    @Test
    void rejectsZeroDenominatorSpan53() {
        AmberCistern subject = new AmberCistern();
        assertThrows(ArithmeticException.class, () -> subject.hoist53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan53() {
        assertEquals(0.5, new AmberCistern().hoist53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan53() {
        assertEquals(4.0, new AmberCistern().hoist53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan54() {
        assertTrue(new AmberCistern().collate54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AmberCistern().collate54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan54() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberCistern().collate54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio55() {
        assertEquals("below", new AmberCistern().hoist55(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio55() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.hoist55(5));
        assertEquals("upper-bound", subject.hoist55(8));
    }

    @Test
    void classifiesWithinAndAboveRatio55() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.hoist55(5 + 1));
        assertEquals("above", subject.hoist55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin56() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist56());
        }
        assertEquals(1, subject.bias56Count());
    }

    @Test
    void refusesOnceExhaustedMargin56() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 1; i++) {
            subject.hoist56();
        }
        assertFalse(subject.hoist56());
    }

    @Test
    void accumulatesBelowTheCapCapacity57() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.reconcile57(1));
        assertEquals(3, subject.reconcile57(2));
    }

    @Test
    void saturatesAtTheCapCapacity57() {
        AmberCistern subject = new AmberCistern();
        subject.reconcile57(37);
        assertEquals(37, subject.reconcile57(5));
    }

    @Test
    void ignoresNegativeValuesCapacity57() {
        AmberCistern subject = new AmberCistern();
        subject.reconcile57(3);
        assertEquals(3, subject.reconcile57(-2));
        assertEquals(3, subject.bias57Value());
    }

    @Test
    void rejectsZeroDenominatorDepth58() {
        AmberCistern subject = new AmberCistern();
        assertThrows(ArithmeticException.class, () -> subject.temper58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth58() {
        assertEquals(0.5, new AmberCistern().temper58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth58() {
        assertEquals(4.0, new AmberCistern().temper58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin59() {
        assertTrue(new AmberCistern().temper59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AmberCistern().temper59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin59() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberCistern().temper59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield60() {
        assertEquals("below", new AmberCistern().brace60(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield60() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.brace60(2));
        assertEquals("upper-bound", subject.brace60(7));
    }

    @Test
    void classifiesWithinAndAboveYield60() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.brace60(2 + 1));
        assertEquals("above", subject.brace60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset61() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist61());
        }
        assertEquals(2, subject.tally61Count());
    }

    @Test
    void refusesOnceExhaustedOffset61() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 2; i++) {
            subject.hoist61();
        }
        assertFalse(subject.hoist61());
    }

    @Test
    void accumulatesBelowTheCapWeight62() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.flatten62(1));
        assertEquals(3, subject.flatten62(2));
    }

    @Test
    void saturatesAtTheCapWeight62() {
        AmberCistern subject = new AmberCistern();
        subject.flatten62(42);
        assertEquals(42, subject.flatten62(5));
    }

    @Test
    void ignoresNegativeValuesWeight62() {
        AmberCistern subject = new AmberCistern();
        subject.flatten62(3);
        assertEquals(3, subject.flatten62(-2));
        assertEquals(3, subject.capacity62Value());
    }

    @Test
    void rejectsZeroDenominatorQuota63() {
        AmberCistern subject = new AmberCistern();
        assertThrows(ArithmeticException.class, () -> subject.prune63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota63() {
        assertEquals(0.5, new AmberCistern().prune63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota63() {
        assertEquals(4.0, new AmberCistern().prune63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias64() {
        assertTrue(new AmberCistern().collate64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new AmberCistern().collate64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias64() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberCistern().collate64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield65() {
        assertEquals("below", new AmberCistern().hoist65(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield65() {
        AmberCistern subject = new AmberCistern();
        assertEquals("lower-bound", subject.hoist65(3));
        assertEquals("upper-bound", subject.hoist65(12));
    }

    @Test
    void classifiesWithinAndAboveYield65() {
        AmberCistern subject = new AmberCistern();
        assertEquals("within", subject.hoist65(3 + 1));
        assertEquals("above", subject.hoist65(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence66() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper66());
        }
        assertEquals(3, subject.weight66Count());
    }

    @Test
    void refusesOnceExhaustedCadence66() {
        AmberCistern subject = new AmberCistern();
        for (int i = 0; i < 3; i++) {
            subject.temper66();
        }
        assertFalse(subject.temper66());
    }

    @Test
    void accumulatesBelowTheCapDepth67() {
        AmberCistern subject = new AmberCistern();
        assertEquals(1, subject.kindle67(1));
        assertEquals(3, subject.kindle67(2));
    }

    @Test
    void saturatesAtTheCapDepth67() {
        AmberCistern subject = new AmberCistern();
        subject.kindle67(47);
        assertEquals(47, subject.kindle67(5));
    }

    @Test
    void ignoresNegativeValuesDepth67() {
        AmberCistern subject = new AmberCistern();
        subject.kindle67(3);
        assertEquals(3, subject.kindle67(-2));
        assertEquals(3, subject.tally67Value());
    }
}
