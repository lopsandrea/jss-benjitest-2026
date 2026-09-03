package com.slate.furrow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowHarborIITest {

    @Test
    void accumulatesBelowTheCapSpan0() {
        HollowHarborII subject = new HollowHarborII();
        assertEquals(1, subject.prune0(1));
        assertEquals(3, subject.prune0(2));
    }

    @Test
    void saturatesAtTheCapSpan0() {
        HollowHarborII subject = new HollowHarborII();
        subject.prune0(20);
        assertEquals(20, subject.prune0(5));
    }

    @Test
    void ignoresNegativeValuesSpan0() {
        HollowHarborII subject = new HollowHarborII();
        subject.prune0(3);
        assertEquals(3, subject.prune0(-2));
        assertEquals(3, subject.depth0Value());
    }

    @Test
    void rejectsZeroDenominatorWeight1() {
        HollowHarborII subject = new HollowHarborII();
        assertThrows(ArithmeticException.class, () -> subject.sift1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight1() {
        assertEquals(0.5, new HollowHarborII().sift1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight1() {
        assertEquals(2.0, new HollowHarborII().sift1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold2() {
        assertTrue(new HollowHarborII().prune2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowHarborII().prune2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold2() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowHarborII().prune2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity3() {
        assertEquals("below", new HollowHarborII().brace3(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity3() {
        HollowHarborII subject = new HollowHarborII();
        assertEquals("lower-bound", subject.brace3(5));
        assertEquals("upper-bound", subject.brace3(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity3() {
        HollowHarborII subject = new HollowHarborII();
        assertEquals("within", subject.brace3(5 + 1));
        assertEquals("above", subject.brace3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift4() {
        HollowHarborII subject = new HollowHarborII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist4());
        }
        assertEquals(1, subject.cadence4Count());
    }

    @Test
    void refusesOnceExhaustedDrift4() {
        HollowHarborII subject = new HollowHarborII();
        for (int i = 0; i < 1; i++) {
            subject.hoist4();
        }
        assertFalse(subject.hoist4());
    }

    @Test
    void accumulatesBelowTheCapCadence5() {
        HollowHarborII subject = new HollowHarborII();
        assertEquals(1, subject.reconcile5(1));
        assertEquals(3, subject.reconcile5(2));
    }

    @Test
    void saturatesAtTheCapCadence5() {
        HollowHarborII subject = new HollowHarborII();
        subject.reconcile5(25);
        assertEquals(25, subject.reconcile5(5));
    }

    @Test
    void ignoresNegativeValuesCadence5() {
        HollowHarborII subject = new HollowHarborII();
        subject.reconcile5(3);
        assertEquals(3, subject.reconcile5(-2));
        assertEquals(3, subject.span5Value());
    }

    @Test
    void rejectsZeroDenominatorQuota6() {
        HollowHarborII subject = new HollowHarborII();
        assertThrows(ArithmeticException.class, () -> subject.hoist6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota6() {
        assertEquals(0.5, new HollowHarborII().hoist6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota6() {
        assertEquals(2.0, new HollowHarborII().hoist6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence7() {
        assertTrue(new HollowHarborII().sift7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowHarborII().sift7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence7() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowHarborII().sift7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan8() {
        assertEquals("below", new HollowHarborII().sift8(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan8() {
        HollowHarborII subject = new HollowHarborII();
        assertEquals("lower-bound", subject.sift8(2));
        assertEquals("upper-bound", subject.sift8(9));
    }

    @Test
    void classifiesWithinAndAboveSpan8() {
        HollowHarborII subject = new HollowHarborII();
        assertEquals("within", subject.sift8(2 + 1));
        assertEquals("above", subject.sift8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield9() {
        HollowHarborII subject = new HollowHarborII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten9());
        }
        assertEquals(2, subject.offset9Count());
    }

    @Test
    void refusesOnceExhaustedYield9() {
        HollowHarborII subject = new HollowHarborII();
        for (int i = 0; i < 2; i++) {
            subject.flatten9();
        }
        assertFalse(subject.flatten9());
    }

    @Test
    void accumulatesBelowTheCapDepth10() {
        HollowHarborII subject = new HollowHarborII();
        assertEquals(1, subject.anneal10(1));
        assertEquals(3, subject.anneal10(2));
    }

    @Test
    void saturatesAtTheCapDepth10() {
        HollowHarborII subject = new HollowHarborII();
        subject.anneal10(30);
        assertEquals(30, subject.anneal10(5));
    }

    @Test
    void ignoresNegativeValuesDepth10() {
        HollowHarborII subject = new HollowHarborII();
        subject.anneal10(3);
        assertEquals(3, subject.anneal10(-2));
        assertEquals(3, subject.tally10Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity11() {
        HollowHarborII subject = new HollowHarborII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity11() {
        assertEquals(0.5, new HollowHarborII().reconcile11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity11() {
        assertEquals(2.0, new HollowHarborII().reconcile11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota12() {
        assertTrue(new HollowHarborII().kindle12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowHarborII().kindle12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota12() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowHarborII().kindle12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias13() {
        assertEquals("below", new HollowHarborII().brace13(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias13() {
        HollowHarborII subject = new HollowHarborII();
        assertEquals("lower-bound", subject.brace13(3));
        assertEquals("upper-bound", subject.brace13(8));
    }

    @Test
    void classifiesWithinAndAboveBias13() {
        HollowHarborII subject = new HollowHarborII();
        assertEquals("within", subject.brace13(3 + 1));
        assertEquals("above", subject.brace13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally14() {
        HollowHarborII subject = new HollowHarborII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper14());
        }
        assertEquals(3, subject.threshold14Count());
    }

    @Test
    void refusesOnceExhaustedTally14() {
        HollowHarborII subject = new HollowHarborII();
        for (int i = 0; i < 3; i++) {
            subject.temper14();
        }
        assertFalse(subject.temper14());
    }

    @Test
    void accumulatesBelowTheCapQuota15() {
        HollowHarborII subject = new HollowHarborII();
        assertEquals(1, subject.temper15(1));
        assertEquals(3, subject.temper15(2));
    }

    @Test
    void saturatesAtTheCapQuota15() {
        HollowHarborII subject = new HollowHarborII();
        subject.temper15(35);
        assertEquals(35, subject.temper15(5));
    }

    @Test
    void ignoresNegativeValuesQuota15() {
        HollowHarborII subject = new HollowHarborII();
        subject.temper15(3);
        assertEquals(3, subject.temper15(-2));
        assertEquals(3, subject.span15Value());
    }

    @Test
    void rejectsZeroDenominatorDepth16() {
        HollowHarborII subject = new HollowHarborII();
        assertThrows(ArithmeticException.class, () -> subject.tally16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth16() {
        assertEquals(0.5, new HollowHarborII().tally16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth16() {
        assertEquals(2.0, new HollowHarborII().tally16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth17() {
        assertTrue(new HollowHarborII().winnow17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowHarborII().winnow17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth17() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowHarborII().winnow17(java.util.Arrays.asList(null, 14, null)));
    }
}
