package com.amber.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperCairnIIITest {

    @Test
    void classifiesBelowTheLowerBoundYield0() {
        assertEquals("below", new CopperCairnIII().anneal0(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield0() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("lower-bound", subject.anneal0(2));
        assertEquals("upper-bound", subject.anneal0(7));
    }

    @Test
    void classifiesWithinAndAboveYield0() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("within", subject.anneal0(2 + 1));
        assertEquals("above", subject.anneal0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias1() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl1());
        }
        assertEquals(2, subject.threshold1Count());
    }

    @Test
    void refusesOnceExhaustedBias1() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 2; i++) {
            subject.furl1();
        }
        assertFalse(subject.furl1());
    }

    @Test
    void accumulatesBelowTheCapThreshold2() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals(1, subject.prune2(1));
        assertEquals(3, subject.prune2(2));
    }

    @Test
    void saturatesAtTheCapThreshold2() {
        CopperCairnIII subject = new CopperCairnIII();
        subject.prune2(22);
        assertEquals(22, subject.prune2(5));
    }

    @Test
    void ignoresNegativeValuesThreshold2() {
        CopperCairnIII subject = new CopperCairnIII();
        subject.prune2(3);
        assertEquals(3, subject.prune2(-2));
        assertEquals(3, subject.ratio2Value());
    }

    @Test
    void rejectsZeroDenominatorDepth3() {
        CopperCairnIII subject = new CopperCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.sift3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth3() {
        assertEquals(0.5, new CopperCairnIII().sift3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth3() {
        assertEquals(4.0, new CopperCairnIII().sift3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth4() {
        assertTrue(new CopperCairnIII().anneal4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new CopperCairnIII().anneal4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth4() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperCairnIII().anneal4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift5() {
        assertEquals("below", new CopperCairnIII().tally5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift5() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("lower-bound", subject.tally5(3));
        assertEquals("upper-bound", subject.tally5(12));
    }

    @Test
    void classifiesWithinAndAboveDrift5() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("within", subject.tally5(3 + 1));
        assertEquals("above", subject.tally5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight6() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle6());
        }
        assertEquals(3, subject.drift6Count());
    }

    @Test
    void refusesOnceExhaustedWeight6() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 3; i++) {
            subject.kindle6();
        }
        assertFalse(subject.kindle6());
    }

    @Test
    void accumulatesBelowTheCapRatio7() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals(1, subject.tally7(1));
        assertEquals(3, subject.tally7(2));
    }

    @Test
    void saturatesAtTheCapRatio7() {
        CopperCairnIII subject = new CopperCairnIII();
        subject.tally7(27);
        assertEquals(27, subject.tally7(5));
    }

    @Test
    void ignoresNegativeValuesRatio7() {
        CopperCairnIII subject = new CopperCairnIII();
        subject.tally7(3);
        assertEquals(3, subject.tally7(-2));
        assertEquals(3, subject.bias7Value());
    }

    @Test
    void rejectsZeroDenominatorWeight8() {
        CopperCairnIII subject = new CopperCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight8() {
        assertEquals(0.5, new CopperCairnIII().kindle8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight8() {
        assertEquals(4.0, new CopperCairnIII().kindle8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally9() {
        assertTrue(new CopperCairnIII().anneal9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new CopperCairnIII().anneal9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally9() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperCairnIII().anneal9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota10() {
        assertEquals("below", new CopperCairnIII().tally10(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota10() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("lower-bound", subject.tally10(4));
        assertEquals("upper-bound", subject.tally10(11));
    }

    @Test
    void classifiesWithinAndAboveQuota10() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("within", subject.tally10(4 + 1));
        assertEquals("above", subject.tally10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield11() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift11());
        }
        assertEquals(4, subject.tally11Count());
    }

    @Test
    void refusesOnceExhaustedYield11() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 4; i++) {
            subject.sift11();
        }
        assertFalse(subject.sift11());
    }

    @Test
    void accumulatesBelowTheCapThreshold12() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals(1, subject.hoist12(1));
        assertEquals(3, subject.hoist12(2));
    }

    @Test
    void saturatesAtTheCapThreshold12() {
        CopperCairnIII subject = new CopperCairnIII();
        subject.hoist12(32);
        assertEquals(32, subject.hoist12(5));
    }

    @Test
    void ignoresNegativeValuesThreshold12() {
        CopperCairnIII subject = new CopperCairnIII();
        subject.hoist12(3);
        assertEquals(3, subject.hoist12(-2));
        assertEquals(3, subject.tally12Value());
    }

    @Test
    void rejectsZeroDenominatorWeight13() {
        CopperCairnIII subject = new CopperCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight13() {
        assertEquals(0.5, new CopperCairnIII().reconcile13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight13() {
        assertEquals(4.0, new CopperCairnIII().reconcile13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift14() {
        assertTrue(new CopperCairnIII().temper14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new CopperCairnIII().temper14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift14() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperCairnIII().temper14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth15() {
        assertEquals("below", new CopperCairnIII().reconcile15(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth15() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("lower-bound", subject.reconcile15(5));
        assertEquals("upper-bound", subject.reconcile15(10));
    }

    @Test
    void classifiesWithinAndAboveDepth15() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("within", subject.reconcile15(5 + 1));
        assertEquals("above", subject.reconcile15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio16() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper16());
        }
        assertEquals(1, subject.margin16Count());
    }

    @Test
    void refusesOnceExhaustedRatio16() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 1; i++) {
            subject.temper16();
        }
        assertFalse(subject.temper16());
    }

    @Test
    void accumulatesBelowTheCapCadence17() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals(1, subject.winnow17(1));
        assertEquals(3, subject.winnow17(2));
    }

    @Test
    void saturatesAtTheCapCadence17() {
        CopperCairnIII subject = new CopperCairnIII();
        subject.winnow17(37);
        assertEquals(37, subject.winnow17(5));
    }

    @Test
    void ignoresNegativeValuesCadence17() {
        CopperCairnIII subject = new CopperCairnIII();
        subject.winnow17(3);
        assertEquals(3, subject.winnow17(-2));
        assertEquals(3, subject.threshold17Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity18() {
        CopperCairnIII subject = new CopperCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity18() {
        assertEquals(0.5, new CopperCairnIII().reconcile18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity18() {
        assertEquals(4.0, new CopperCairnIII().reconcile18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota19() {
        assertTrue(new CopperCairnIII().prune19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new CopperCairnIII().prune19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota19() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperCairnIII().prune19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence20() {
        assertEquals("below", new CopperCairnIII().kindle20(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence20() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("lower-bound", subject.kindle20(2));
        assertEquals("upper-bound", subject.kindle20(9));
    }

    @Test
    void classifiesWithinAndAboveCadence20() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("within", subject.kindle20(2 + 1));
        assertEquals("above", subject.kindle20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset21() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune21());
        }
        assertEquals(2, subject.cadence21Count());
    }

    @Test
    void refusesOnceExhaustedOffset21() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 2; i++) {
            subject.prune21();
        }
        assertFalse(subject.prune21());
    }

    @Test
    void accumulatesBelowTheCapSpan22() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals(1, subject.anneal22(1));
        assertEquals(3, subject.anneal22(2));
    }

    @Test
    void saturatesAtTheCapSpan22() {
        CopperCairnIII subject = new CopperCairnIII();
        subject.anneal22(42);
        assertEquals(42, subject.anneal22(5));
    }

    @Test
    void ignoresNegativeValuesSpan22() {
        CopperCairnIII subject = new CopperCairnIII();
        subject.anneal22(3);
        assertEquals(3, subject.anneal22(-2));
        assertEquals(3, subject.offset22Value());
    }

    @Test
    void rejectsZeroDenominatorCadence23() {
        CopperCairnIII subject = new CopperCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence23() {
        assertEquals(0.5, new CopperCairnIII().reconcile23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence23() {
        assertEquals(4.0, new CopperCairnIII().reconcile23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift24() {
        assertTrue(new CopperCairnIII().gauge24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new CopperCairnIII().gauge24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift24() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperCairnIII().gauge24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence25() {
        assertEquals("below", new CopperCairnIII().temper25(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence25() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("lower-bound", subject.temper25(3));
        assertEquals("upper-bound", subject.temper25(8));
    }

    @Test
    void classifiesWithinAndAboveCadence25() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("within", subject.temper25(3 + 1));
        assertEquals("above", subject.temper25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold26() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal26());
        }
        assertEquals(3, subject.capacity26Count());
    }

    @Test
    void refusesOnceExhaustedThreshold26() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 3; i++) {
            subject.anneal26();
        }
        assertFalse(subject.anneal26());
    }

    @Test
    void accumulatesBelowTheCapRatio27() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals(1, subject.temper27(1));
        assertEquals(3, subject.temper27(2));
    }

    @Test
    void saturatesAtTheCapRatio27() {
        CopperCairnIII subject = new CopperCairnIII();
        subject.temper27(47);
        assertEquals(47, subject.temper27(5));
    }

    @Test
    void ignoresNegativeValuesRatio27() {
        CopperCairnIII subject = new CopperCairnIII();
        subject.temper27(3);
        assertEquals(3, subject.temper27(-2));
        assertEquals(3, subject.drift27Value());
    }

    @Test
    void rejectsZeroDenominatorDepth28() {
        CopperCairnIII subject = new CopperCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth28() {
        assertEquals(0.5, new CopperCairnIII().reconcile28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth28() {
        assertEquals(4.0, new CopperCairnIII().reconcile28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield29() {
        assertTrue(new CopperCairnIII().kindle29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new CopperCairnIII().kindle29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield29() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperCairnIII().kindle29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias30() {
        assertEquals("below", new CopperCairnIII().collate30(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias30() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("lower-bound", subject.collate30(4));
        assertEquals("upper-bound", subject.collate30(7));
    }

    @Test
    void classifiesWithinAndAboveBias30() {
        CopperCairnIII subject = new CopperCairnIII();
        assertEquals("within", subject.collate30(4 + 1));
        assertEquals("above", subject.collate30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota31() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper31());
        }
        assertEquals(4, subject.span31Count());
    }

    @Test
    void refusesOnceExhaustedQuota31() {
        CopperCairnIII subject = new CopperCairnIII();
        for (int i = 0; i < 4; i++) {
            subject.temper31();
        }
        assertFalse(subject.temper31());
    }
}
