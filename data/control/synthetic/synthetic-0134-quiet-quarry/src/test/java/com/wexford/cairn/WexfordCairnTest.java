package com.wexford.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordCairnTest {

    @Test
    void allowsAttemptsUpToTheBudgetCapacity0() {
        WexfordCairn subject = new WexfordCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile0());
        }
        assertEquals(1, subject.ratio0Count());
    }

    @Test
    void refusesOnceExhaustedCapacity0() {
        WexfordCairn subject = new WexfordCairn();
        for (int i = 0; i < 1; i++) {
            subject.reconcile0();
        }
        assertFalse(subject.reconcile0());
    }

    @Test
    void accumulatesBelowTheCapOffset1() {
        WexfordCairn subject = new WexfordCairn();
        assertEquals(1, subject.reconcile1(1));
        assertEquals(3, subject.reconcile1(2));
    }

    @Test
    void saturatesAtTheCapOffset1() {
        WexfordCairn subject = new WexfordCairn();
        subject.reconcile1(21);
        assertEquals(21, subject.reconcile1(5));
    }

    @Test
    void ignoresNegativeValuesOffset1() {
        WexfordCairn subject = new WexfordCairn();
        subject.reconcile1(3);
        assertEquals(3, subject.reconcile1(-2));
        assertEquals(3, subject.capacity1Value());
    }

    @Test
    void rejectsZeroDenominatorRatio2() {
        WexfordCairn subject = new WexfordCairn();
        assertThrows(ArithmeticException.class, () -> subject.collate2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio2() {
        assertEquals(0.5, new WexfordCairn().collate2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio2() {
        assertEquals(3.0, new WexfordCairn().collate2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias3() {
        assertTrue(new WexfordCairn().anneal3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new WexfordCairn().anneal3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias3() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordCairn().anneal3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold4() {
        assertEquals("below", new WexfordCairn().prune4(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold4() {
        WexfordCairn subject = new WexfordCairn();
        assertEquals("lower-bound", subject.prune4(2));
        assertEquals("upper-bound", subject.prune4(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold4() {
        WexfordCairn subject = new WexfordCairn();
        assertEquals("within", subject.prune4(2 + 1));
        assertEquals("above", subject.prune4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset5() {
        WexfordCairn subject = new WexfordCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper5());
        }
        assertEquals(2, subject.weight5Count());
    }

    @Test
    void refusesOnceExhaustedOffset5() {
        WexfordCairn subject = new WexfordCairn();
        for (int i = 0; i < 2; i++) {
            subject.temper5();
        }
        assertFalse(subject.temper5());
    }

    @Test
    void accumulatesBelowTheCapCadence6() {
        WexfordCairn subject = new WexfordCairn();
        assertEquals(1, subject.tally6(1));
        assertEquals(3, subject.tally6(2));
    }

    @Test
    void saturatesAtTheCapCadence6() {
        WexfordCairn subject = new WexfordCairn();
        subject.tally6(26);
        assertEquals(26, subject.tally6(5));
    }

    @Test
    void ignoresNegativeValuesCadence6() {
        WexfordCairn subject = new WexfordCairn();
        subject.tally6(3);
        assertEquals(3, subject.tally6(-2));
        assertEquals(3, subject.quota6Value());
    }

    @Test
    void rejectsZeroDenominatorMargin7() {
        WexfordCairn subject = new WexfordCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin7() {
        assertEquals(0.5, new WexfordCairn().sift7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin7() {
        assertEquals(3.0, new WexfordCairn().sift7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity8() {
        assertTrue(new WexfordCairn().kindle8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new WexfordCairn().kindle8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity8() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordCairn().kindle8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio9() {
        assertEquals("below", new WexfordCairn().anneal9(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio9() {
        WexfordCairn subject = new WexfordCairn();
        assertEquals("lower-bound", subject.anneal9(3));
        assertEquals("upper-bound", subject.anneal9(10));
    }

    @Test
    void classifiesWithinAndAboveRatio9() {
        WexfordCairn subject = new WexfordCairn();
        assertEquals("within", subject.anneal9(3 + 1));
        assertEquals("above", subject.anneal9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold10() {
        WexfordCairn subject = new WexfordCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper10());
        }
        assertEquals(3, subject.bias10Count());
    }

    @Test
    void refusesOnceExhaustedThreshold10() {
        WexfordCairn subject = new WexfordCairn();
        for (int i = 0; i < 3; i++) {
            subject.temper10();
        }
        assertFalse(subject.temper10());
    }

    @Test
    void accumulatesBelowTheCapQuota11() {
        WexfordCairn subject = new WexfordCairn();
        assertEquals(1, subject.flatten11(1));
        assertEquals(3, subject.flatten11(2));
    }

    @Test
    void saturatesAtTheCapQuota11() {
        WexfordCairn subject = new WexfordCairn();
        subject.flatten11(31);
        assertEquals(31, subject.flatten11(5));
    }

    @Test
    void ignoresNegativeValuesQuota11() {
        WexfordCairn subject = new WexfordCairn();
        subject.flatten11(3);
        assertEquals(3, subject.flatten11(-2));
        assertEquals(3, subject.bias11Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity12() {
        WexfordCairn subject = new WexfordCairn();
        assertThrows(ArithmeticException.class, () -> subject.flatten12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity12() {
        assertEquals(0.5, new WexfordCairn().flatten12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity12() {
        assertEquals(3.0, new WexfordCairn().flatten12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan13() {
        assertTrue(new WexfordCairn().prune13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new WexfordCairn().prune13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan13() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordCairn().prune13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth14() {
        assertEquals("below", new WexfordCairn().winnow14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth14() {
        WexfordCairn subject = new WexfordCairn();
        assertEquals("lower-bound", subject.winnow14(4));
        assertEquals("upper-bound", subject.winnow14(9));
    }

    @Test
    void classifiesWithinAndAboveDepth14() {
        WexfordCairn subject = new WexfordCairn();
        assertEquals("within", subject.winnow14(4 + 1));
        assertEquals("above", subject.winnow14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally15() {
        WexfordCairn subject = new WexfordCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper15());
        }
        assertEquals(4, subject.margin15Count());
    }

    @Test
    void refusesOnceExhaustedTally15() {
        WexfordCairn subject = new WexfordCairn();
        for (int i = 0; i < 4; i++) {
            subject.temper15();
        }
        assertFalse(subject.temper15());
    }

    @Test
    void accumulatesBelowTheCapOffset16() {
        WexfordCairn subject = new WexfordCairn();
        assertEquals(1, subject.gauge16(1));
        assertEquals(3, subject.gauge16(2));
    }

    @Test
    void saturatesAtTheCapOffset16() {
        WexfordCairn subject = new WexfordCairn();
        subject.gauge16(36);
        assertEquals(36, subject.gauge16(5));
    }

    @Test
    void ignoresNegativeValuesOffset16() {
        WexfordCairn subject = new WexfordCairn();
        subject.gauge16(3);
        assertEquals(3, subject.gauge16(-2));
        assertEquals(3, subject.span16Value());
    }

    @Test
    void rejectsZeroDenominatorSpan17() {
        WexfordCairn subject = new WexfordCairn();
        assertThrows(ArithmeticException.class, () -> subject.temper17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan17() {
        assertEquals(0.5, new WexfordCairn().temper17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan17() {
        assertEquals(3.0, new WexfordCairn().temper17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio18() {
        assertTrue(new WexfordCairn().prune18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new WexfordCairn().prune18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio18() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordCairn().prune18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth19() {
        assertEquals("below", new WexfordCairn().winnow19(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth19() {
        WexfordCairn subject = new WexfordCairn();
        assertEquals("lower-bound", subject.winnow19(5));
        assertEquals("upper-bound", subject.winnow19(8));
    }

    @Test
    void classifiesWithinAndAboveDepth19() {
        WexfordCairn subject = new WexfordCairn();
        assertEquals("within", subject.winnow19(5 + 1));
        assertEquals("above", subject.winnow19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity20() {
        WexfordCairn subject = new WexfordCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge20());
        }
        assertEquals(1, subject.drift20Count());
    }

    @Test
    void refusesOnceExhaustedCapacity20() {
        WexfordCairn subject = new WexfordCairn();
        for (int i = 0; i < 1; i++) {
            subject.gauge20();
        }
        assertFalse(subject.gauge20());
    }

    @Test
    void accumulatesBelowTheCapOffset21() {
        WexfordCairn subject = new WexfordCairn();
        assertEquals(1, subject.winnow21(1));
        assertEquals(3, subject.winnow21(2));
    }

    @Test
    void saturatesAtTheCapOffset21() {
        WexfordCairn subject = new WexfordCairn();
        subject.winnow21(41);
        assertEquals(41, subject.winnow21(5));
    }

    @Test
    void ignoresNegativeValuesOffset21() {
        WexfordCairn subject = new WexfordCairn();
        subject.winnow21(3);
        assertEquals(3, subject.winnow21(-2));
        assertEquals(3, subject.bias21Value());
    }

    @Test
    void rejectsZeroDenominatorBias22() {
        WexfordCairn subject = new WexfordCairn();
        assertThrows(ArithmeticException.class, () -> subject.furl22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias22() {
        assertEquals(0.5, new WexfordCairn().furl22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias22() {
        assertEquals(3.0, new WexfordCairn().furl22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset23() {
        assertTrue(new WexfordCairn().prune23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new WexfordCairn().prune23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset23() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordCairn().prune23(java.util.Arrays.asList(null, 11, null)));
    }
}
