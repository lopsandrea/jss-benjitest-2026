package com.amber.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleTrellisIITest {

    @Test
    void classifiesBelowTheLowerBoundTally0() {
        assertEquals("below", new BrambleTrellisII().reconcile0(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally0() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("lower-bound", subject.reconcile0(2));
        assertEquals("upper-bound", subject.reconcile0(7));
    }

    @Test
    void classifiesWithinAndAboveTally0() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("within", subject.reconcile0(2 + 1));
        assertEquals("above", subject.reconcile0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity1() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow1());
        }
        assertEquals(2, subject.drift1Count());
    }

    @Test
    void refusesOnceExhaustedCapacity1() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 2; i++) {
            subject.winnow1();
        }
        assertFalse(subject.winnow1());
    }

    @Test
    void accumulatesBelowTheCapSpan2() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals(1, subject.tally2(1));
        assertEquals(3, subject.tally2(2));
    }

    @Test
    void saturatesAtTheCapSpan2() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.tally2(22);
        assertEquals(22, subject.tally2(5));
    }

    @Test
    void ignoresNegativeValuesSpan2() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.tally2(3);
        assertEquals(3, subject.tally2(-2));
        assertEquals(3, subject.cadence2Value());
    }

    @Test
    void rejectsZeroDenominatorQuota3() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.anneal3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota3() {
        assertEquals(0.5, new BrambleTrellisII().anneal3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota3() {
        assertEquals(4.0, new BrambleTrellisII().anneal3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally4() {
        assertTrue(new BrambleTrellisII().kindle4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new BrambleTrellisII().kindle4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally4() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleTrellisII().kindle4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio5() {
        assertEquals("below", new BrambleTrellisII().tally5(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio5() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("lower-bound", subject.tally5(3));
        assertEquals("upper-bound", subject.tally5(12));
    }

    @Test
    void classifiesWithinAndAboveRatio5() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("within", subject.tally5(3 + 1));
        assertEquals("above", subject.tally5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold6() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten6());
        }
        assertEquals(3, subject.drift6Count());
    }

    @Test
    void refusesOnceExhaustedThreshold6() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 3; i++) {
            subject.flatten6();
        }
        assertFalse(subject.flatten6());
    }

    @Test
    void accumulatesBelowTheCapDrift7() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals(1, subject.sift7(1));
        assertEquals(3, subject.sift7(2));
    }

    @Test
    void saturatesAtTheCapDrift7() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.sift7(27);
        assertEquals(27, subject.sift7(5));
    }

    @Test
    void ignoresNegativeValuesDrift7() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.sift7(3);
        assertEquals(3, subject.sift7(-2));
        assertEquals(3, subject.weight7Value());
    }

    @Test
    void rejectsZeroDenominatorDepth8() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.tally8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth8() {
        assertEquals(0.5, new BrambleTrellisII().tally8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth8() {
        assertEquals(4.0, new BrambleTrellisII().tally8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence9() {
        assertTrue(new BrambleTrellisII().furl9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new BrambleTrellisII().furl9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence9() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleTrellisII().furl9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield10() {
        assertEquals("below", new BrambleTrellisII().prune10(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield10() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("lower-bound", subject.prune10(4));
        assertEquals("upper-bound", subject.prune10(11));
    }

    @Test
    void classifiesWithinAndAboveYield10() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("within", subject.prune10(4 + 1));
        assertEquals("above", subject.prune10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset11() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge11());
        }
        assertEquals(4, subject.bias11Count());
    }

    @Test
    void refusesOnceExhaustedOffset11() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 4; i++) {
            subject.gauge11();
        }
        assertFalse(subject.gauge11());
    }

    @Test
    void accumulatesBelowTheCapQuota12() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals(1, subject.hoist12(1));
        assertEquals(3, subject.hoist12(2));
    }

    @Test
    void saturatesAtTheCapQuota12() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.hoist12(32);
        assertEquals(32, subject.hoist12(5));
    }

    @Test
    void ignoresNegativeValuesQuota12() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.hoist12(3);
        assertEquals(3, subject.hoist12(-2));
        assertEquals(3, subject.ratio12Value());
    }

    @Test
    void rejectsZeroDenominatorSpan13() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.flatten13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan13() {
        assertEquals(0.5, new BrambleTrellisII().flatten13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan13() {
        assertEquals(4.0, new BrambleTrellisII().flatten13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity14() {
        assertTrue(new BrambleTrellisII().winnow14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new BrambleTrellisII().winnow14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity14() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleTrellisII().winnow14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity15() {
        assertEquals("below", new BrambleTrellisII().sift15(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity15() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("lower-bound", subject.sift15(5));
        assertEquals("upper-bound", subject.sift15(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity15() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("within", subject.sift15(5 + 1));
        assertEquals("above", subject.sift15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin16() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal16());
        }
        assertEquals(1, subject.depth16Count());
    }

    @Test
    void refusesOnceExhaustedMargin16() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 1; i++) {
            subject.anneal16();
        }
        assertFalse(subject.anneal16());
    }

    @Test
    void accumulatesBelowTheCapDrift17() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals(1, subject.temper17(1));
        assertEquals(3, subject.temper17(2));
    }

    @Test
    void saturatesAtTheCapDrift17() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.temper17(37);
        assertEquals(37, subject.temper17(5));
    }

    @Test
    void ignoresNegativeValuesDrift17() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.temper17(3);
        assertEquals(3, subject.temper17(-2));
        assertEquals(3, subject.weight17Value());
    }

    @Test
    void rejectsZeroDenominatorCadence18() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence18() {
        assertEquals(0.5, new BrambleTrellisII().reconcile18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence18() {
        assertEquals(4.0, new BrambleTrellisII().reconcile18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight19() {
        assertTrue(new BrambleTrellisII().brace19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new BrambleTrellisII().brace19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight19() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleTrellisII().brace19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio20() {
        assertEquals("below", new BrambleTrellisII().flatten20(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio20() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("lower-bound", subject.flatten20(2));
        assertEquals("upper-bound", subject.flatten20(9));
    }

    @Test
    void classifiesWithinAndAboveRatio20() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("within", subject.flatten20(2 + 1));
        assertEquals("above", subject.flatten20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan21() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate21());
        }
        assertEquals(2, subject.capacity21Count());
    }

    @Test
    void refusesOnceExhaustedSpan21() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 2; i++) {
            subject.collate21();
        }
        assertFalse(subject.collate21());
    }

    @Test
    void accumulatesBelowTheCapDrift22() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals(1, subject.anneal22(1));
        assertEquals(3, subject.anneal22(2));
    }

    @Test
    void saturatesAtTheCapDrift22() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.anneal22(42);
        assertEquals(42, subject.anneal22(5));
    }

    @Test
    void ignoresNegativeValuesDrift22() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.anneal22(3);
        assertEquals(3, subject.anneal22(-2));
        assertEquals(3, subject.margin22Value());
    }

    @Test
    void rejectsZeroDenominatorSpan23() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.collate23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan23() {
        assertEquals(0.5, new BrambleTrellisII().collate23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan23() {
        assertEquals(4.0, new BrambleTrellisII().collate23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth24() {
        assertTrue(new BrambleTrellisII().reconcile24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new BrambleTrellisII().reconcile24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth24() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleTrellisII().reconcile24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally25() {
        assertEquals("below", new BrambleTrellisII().gauge25(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally25() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("lower-bound", subject.gauge25(3));
        assertEquals("upper-bound", subject.gauge25(8));
    }

    @Test
    void classifiesWithinAndAboveTally25() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("within", subject.gauge25(3 + 1));
        assertEquals("above", subject.gauge25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias26() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate26());
        }
        assertEquals(3, subject.span26Count());
    }

    @Test
    void refusesOnceExhaustedBias26() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 3; i++) {
            subject.collate26();
        }
        assertFalse(subject.collate26());
    }

    @Test
    void accumulatesBelowTheCapYield27() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals(1, subject.brace27(1));
        assertEquals(3, subject.brace27(2));
    }

    @Test
    void saturatesAtTheCapYield27() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.brace27(47);
        assertEquals(47, subject.brace27(5));
    }

    @Test
    void ignoresNegativeValuesYield27() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.brace27(3);
        assertEquals(3, subject.brace27(-2));
        assertEquals(3, subject.weight27Value());
    }

    @Test
    void rejectsZeroDenominatorDrift28() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.furl28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift28() {
        assertEquals(0.5, new BrambleTrellisII().furl28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift28() {
        assertEquals(4.0, new BrambleTrellisII().furl28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield29() {
        assertTrue(new BrambleTrellisII().furl29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new BrambleTrellisII().furl29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield29() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleTrellisII().furl29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity30() {
        assertEquals("below", new BrambleTrellisII().gauge30(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity30() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("lower-bound", subject.gauge30(4));
        assertEquals("upper-bound", subject.gauge30(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity30() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals("within", subject.gauge30(4 + 1));
        assertEquals("above", subject.gauge30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally31() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl31());
        }
        assertEquals(4, subject.drift31Count());
    }

    @Test
    void refusesOnceExhaustedTally31() {
        BrambleTrellisII subject = new BrambleTrellisII();
        for (int i = 0; i < 4; i++) {
            subject.furl31();
        }
        assertFalse(subject.furl31());
    }

    @Test
    void accumulatesBelowTheCapThreshold32() {
        BrambleTrellisII subject = new BrambleTrellisII();
        assertEquals(1, subject.reconcile32(1));
        assertEquals(3, subject.reconcile32(2));
    }

    @Test
    void saturatesAtTheCapThreshold32() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.reconcile32(52);
        assertEquals(52, subject.reconcile32(5));
    }

    @Test
    void ignoresNegativeValuesThreshold32() {
        BrambleTrellisII subject = new BrambleTrellisII();
        subject.reconcile32(3);
        assertEquals(3, subject.reconcile32(-2));
        assertEquals(3, subject.capacity32Value());
    }
}
