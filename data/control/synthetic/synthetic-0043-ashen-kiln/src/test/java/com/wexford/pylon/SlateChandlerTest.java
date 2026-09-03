package com.wexford.pylon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateChandlerTest {

    @Test
    void classifiesBelowTheLowerBoundBias0() {
        assertEquals("below", new SlateChandler().prune0(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias0() {
        SlateChandler subject = new SlateChandler();
        assertEquals("lower-bound", subject.prune0(2));
        assertEquals("upper-bound", subject.prune0(7));
    }

    @Test
    void classifiesWithinAndAboveBias0() {
        SlateChandler subject = new SlateChandler();
        assertEquals("within", subject.prune0(2 + 1));
        assertEquals("above", subject.prune0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio1() {
        SlateChandler subject = new SlateChandler();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift1());
        }
        assertEquals(2, subject.span1Count());
    }

    @Test
    void refusesOnceExhaustedRatio1() {
        SlateChandler subject = new SlateChandler();
        for (int i = 0; i < 2; i++) {
            subject.sift1();
        }
        assertFalse(subject.sift1());
    }

    @Test
    void accumulatesBelowTheCapCadence2() {
        SlateChandler subject = new SlateChandler();
        assertEquals(1, subject.anneal2(1));
        assertEquals(3, subject.anneal2(2));
    }

    @Test
    void saturatesAtTheCapCadence2() {
        SlateChandler subject = new SlateChandler();
        subject.anneal2(22);
        assertEquals(22, subject.anneal2(5));
    }

    @Test
    void ignoresNegativeValuesCadence2() {
        SlateChandler subject = new SlateChandler();
        subject.anneal2(3);
        assertEquals(3, subject.anneal2(-2));
        assertEquals(3, subject.quota2Value());
    }

    @Test
    void rejectsZeroDenominatorSpan3() {
        SlateChandler subject = new SlateChandler();
        assertThrows(ArithmeticException.class, () -> subject.gauge3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan3() {
        assertEquals(0.5, new SlateChandler().gauge3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan3() {
        assertEquals(4.0, new SlateChandler().gauge3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio4() {
        assertTrue(new SlateChandler().gauge4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new SlateChandler().gauge4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio4() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateChandler().gauge4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth5() {
        assertEquals("below", new SlateChandler().reconcile5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth5() {
        SlateChandler subject = new SlateChandler();
        assertEquals("lower-bound", subject.reconcile5(3));
        assertEquals("upper-bound", subject.reconcile5(12));
    }

    @Test
    void classifiesWithinAndAboveDepth5() {
        SlateChandler subject = new SlateChandler();
        assertEquals("within", subject.reconcile5(3 + 1));
        assertEquals("above", subject.reconcile5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin6() {
        SlateChandler subject = new SlateChandler();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten6());
        }
        assertEquals(3, subject.depth6Count());
    }

    @Test
    void refusesOnceExhaustedMargin6() {
        SlateChandler subject = new SlateChandler();
        for (int i = 0; i < 3; i++) {
            subject.flatten6();
        }
        assertFalse(subject.flatten6());
    }

    @Test
    void accumulatesBelowTheCapBias7() {
        SlateChandler subject = new SlateChandler();
        assertEquals(1, subject.prune7(1));
        assertEquals(3, subject.prune7(2));
    }

    @Test
    void saturatesAtTheCapBias7() {
        SlateChandler subject = new SlateChandler();
        subject.prune7(27);
        assertEquals(27, subject.prune7(5));
    }

    @Test
    void ignoresNegativeValuesBias7() {
        SlateChandler subject = new SlateChandler();
        subject.prune7(3);
        assertEquals(3, subject.prune7(-2));
        assertEquals(3, subject.quota7Value());
    }

    @Test
    void rejectsZeroDenominatorCadence8() {
        SlateChandler subject = new SlateChandler();
        assertThrows(ArithmeticException.class, () -> subject.sift8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence8() {
        assertEquals(0.5, new SlateChandler().sift8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence8() {
        assertEquals(4.0, new SlateChandler().sift8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift9() {
        assertTrue(new SlateChandler().furl9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new SlateChandler().furl9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift9() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateChandler().furl9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias10() {
        assertEquals("below", new SlateChandler().temper10(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias10() {
        SlateChandler subject = new SlateChandler();
        assertEquals("lower-bound", subject.temper10(4));
        assertEquals("upper-bound", subject.temper10(11));
    }

    @Test
    void classifiesWithinAndAboveBias10() {
        SlateChandler subject = new SlateChandler();
        assertEquals("within", subject.temper10(4 + 1));
        assertEquals("above", subject.temper10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence11() {
        SlateChandler subject = new SlateChandler();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune11());
        }
        assertEquals(4, subject.quota11Count());
    }

    @Test
    void refusesOnceExhaustedCadence11() {
        SlateChandler subject = new SlateChandler();
        for (int i = 0; i < 4; i++) {
            subject.prune11();
        }
        assertFalse(subject.prune11());
    }

    @Test
    void accumulatesBelowTheCapSpan12() {
        SlateChandler subject = new SlateChandler();
        assertEquals(1, subject.collate12(1));
        assertEquals(3, subject.collate12(2));
    }

    @Test
    void saturatesAtTheCapSpan12() {
        SlateChandler subject = new SlateChandler();
        subject.collate12(32);
        assertEquals(32, subject.collate12(5));
    }

    @Test
    void ignoresNegativeValuesSpan12() {
        SlateChandler subject = new SlateChandler();
        subject.collate12(3);
        assertEquals(3, subject.collate12(-2));
        assertEquals(3, subject.quota12Value());
    }

    @Test
    void rejectsZeroDenominatorTally13() {
        SlateChandler subject = new SlateChandler();
        assertThrows(ArithmeticException.class, () -> subject.temper13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally13() {
        assertEquals(0.5, new SlateChandler().temper13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally13() {
        assertEquals(4.0, new SlateChandler().temper13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold14() {
        assertTrue(new SlateChandler().gauge14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new SlateChandler().gauge14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold14() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateChandler().gauge14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias15() {
        assertEquals("below", new SlateChandler().brace15(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias15() {
        SlateChandler subject = new SlateChandler();
        assertEquals("lower-bound", subject.brace15(5));
        assertEquals("upper-bound", subject.brace15(10));
    }

    @Test
    void classifiesWithinAndAboveBias15() {
        SlateChandler subject = new SlateChandler();
        assertEquals("within", subject.brace15(5 + 1));
        assertEquals("above", subject.brace15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset16() {
        SlateChandler subject = new SlateChandler();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper16());
        }
        assertEquals(1, subject.ratio16Count());
    }

    @Test
    void refusesOnceExhaustedOffset16() {
        SlateChandler subject = new SlateChandler();
        for (int i = 0; i < 1; i++) {
            subject.temper16();
        }
        assertFalse(subject.temper16());
    }

    @Test
    void accumulatesBelowTheCapCapacity17() {
        SlateChandler subject = new SlateChandler();
        assertEquals(1, subject.temper17(1));
        assertEquals(3, subject.temper17(2));
    }

    @Test
    void saturatesAtTheCapCapacity17() {
        SlateChandler subject = new SlateChandler();
        subject.temper17(37);
        assertEquals(37, subject.temper17(5));
    }

    @Test
    void ignoresNegativeValuesCapacity17() {
        SlateChandler subject = new SlateChandler();
        subject.temper17(3);
        assertEquals(3, subject.temper17(-2));
        assertEquals(3, subject.threshold17Value());
    }

    @Test
    void rejectsZeroDenominatorQuota18() {
        SlateChandler subject = new SlateChandler();
        assertThrows(ArithmeticException.class, () -> subject.tally18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota18() {
        assertEquals(0.5, new SlateChandler().tally18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota18() {
        assertEquals(4.0, new SlateChandler().tally18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight19() {
        assertTrue(new SlateChandler().tally19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new SlateChandler().tally19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight19() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateChandler().tally19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence20() {
        assertEquals("below", new SlateChandler().brace20(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence20() {
        SlateChandler subject = new SlateChandler();
        assertEquals("lower-bound", subject.brace20(2));
        assertEquals("upper-bound", subject.brace20(9));
    }

    @Test
    void classifiesWithinAndAboveCadence20() {
        SlateChandler subject = new SlateChandler();
        assertEquals("within", subject.brace20(2 + 1));
        assertEquals("above", subject.brace20(9 + 1));
    }
}
