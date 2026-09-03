package com.verdant.chandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateVellumIITest {

    @Test
    void allowsAttemptsUpToTheBudgetCadence0() {
        SlateVellumII subject = new SlateVellumII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate0());
        }
        assertEquals(1, subject.bias0Count());
    }

    @Test
    void refusesOnceExhaustedCadence0() {
        SlateVellumII subject = new SlateVellumII();
        for (int i = 0; i < 1; i++) {
            subject.collate0();
        }
        assertFalse(subject.collate0());
    }

    @Test
    void accumulatesBelowTheCapBias1() {
        SlateVellumII subject = new SlateVellumII();
        assertEquals(1, subject.collate1(1));
        assertEquals(3, subject.collate1(2));
    }

    @Test
    void saturatesAtTheCapBias1() {
        SlateVellumII subject = new SlateVellumII();
        subject.collate1(21);
        assertEquals(21, subject.collate1(5));
    }

    @Test
    void ignoresNegativeValuesBias1() {
        SlateVellumII subject = new SlateVellumII();
        subject.collate1(3);
        assertEquals(3, subject.collate1(-2));
        assertEquals(3, subject.depth1Value());
    }

    @Test
    void rejectsZeroDenominatorSpan2() {
        SlateVellumII subject = new SlateVellumII();
        assertThrows(ArithmeticException.class, () -> subject.tally2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan2() {
        assertEquals(0.5, new SlateVellumII().tally2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan2() {
        assertEquals(3.0, new SlateVellumII().tally2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth3() {
        assertTrue(new SlateVellumII().kindle3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SlateVellumII().kindle3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth3() {
        assertEquals(java.util.Arrays.asList(9),
                new SlateVellumII().kindle3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight4() {
        assertEquals("below", new SlateVellumII().tally4(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight4() {
        SlateVellumII subject = new SlateVellumII();
        assertEquals("lower-bound", subject.tally4(2));
        assertEquals("upper-bound", subject.tally4(11));
    }

    @Test
    void classifiesWithinAndAboveWeight4() {
        SlateVellumII subject = new SlateVellumII();
        assertEquals("within", subject.tally4(2 + 1));
        assertEquals("above", subject.tally4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota5() {
        SlateVellumII subject = new SlateVellumII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile5());
        }
        assertEquals(2, subject.threshold5Count());
    }

    @Test
    void refusesOnceExhaustedQuota5() {
        SlateVellumII subject = new SlateVellumII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile5();
        }
        assertFalse(subject.reconcile5());
    }

    @Test
    void accumulatesBelowTheCapCadence6() {
        SlateVellumII subject = new SlateVellumII();
        assertEquals(1, subject.brace6(1));
        assertEquals(3, subject.brace6(2));
    }

    @Test
    void saturatesAtTheCapCadence6() {
        SlateVellumII subject = new SlateVellumII();
        subject.brace6(26);
        assertEquals(26, subject.brace6(5));
    }

    @Test
    void ignoresNegativeValuesCadence6() {
        SlateVellumII subject = new SlateVellumII();
        subject.brace6(3);
        assertEquals(3, subject.brace6(-2));
        assertEquals(3, subject.yield6Value());
    }

    @Test
    void rejectsZeroDenominatorDepth7() {
        SlateVellumII subject = new SlateVellumII();
        assertThrows(ArithmeticException.class, () -> subject.temper7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth7() {
        assertEquals(0.5, new SlateVellumII().temper7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth7() {
        assertEquals(3.0, new SlateVellumII().temper7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan8() {
        assertTrue(new SlateVellumII().gauge8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SlateVellumII().gauge8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan8() {
        assertEquals(java.util.Arrays.asList(14),
                new SlateVellumII().gauge8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset9() {
        assertEquals("below", new SlateVellumII().furl9(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset9() {
        SlateVellumII subject = new SlateVellumII();
        assertEquals("lower-bound", subject.furl9(3));
        assertEquals("upper-bound", subject.furl9(10));
    }

    @Test
    void classifiesWithinAndAboveOffset9() {
        SlateVellumII subject = new SlateVellumII();
        assertEquals("within", subject.furl9(3 + 1));
        assertEquals("above", subject.furl9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift10() {
        SlateVellumII subject = new SlateVellumII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift10());
        }
        assertEquals(3, subject.offset10Count());
    }

    @Test
    void refusesOnceExhaustedDrift10() {
        SlateVellumII subject = new SlateVellumII();
        for (int i = 0; i < 3; i++) {
            subject.sift10();
        }
        assertFalse(subject.sift10());
    }

    @Test
    void accumulatesBelowTheCapQuota11() {
        SlateVellumII subject = new SlateVellumII();
        assertEquals(1, subject.reconcile11(1));
        assertEquals(3, subject.reconcile11(2));
    }

    @Test
    void saturatesAtTheCapQuota11() {
        SlateVellumII subject = new SlateVellumII();
        subject.reconcile11(31);
        assertEquals(31, subject.reconcile11(5));
    }

    @Test
    void ignoresNegativeValuesQuota11() {
        SlateVellumII subject = new SlateVellumII();
        subject.reconcile11(3);
        assertEquals(3, subject.reconcile11(-2));
        assertEquals(3, subject.ratio11Value());
    }

    @Test
    void rejectsZeroDenominatorBias12() {
        SlateVellumII subject = new SlateVellumII();
        assertThrows(ArithmeticException.class, () -> subject.gauge12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias12() {
        assertEquals(0.5, new SlateVellumII().gauge12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias12() {
        assertEquals(3.0, new SlateVellumII().gauge12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan13() {
        assertTrue(new SlateVellumII().hoist13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SlateVellumII().hoist13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan13() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateVellumII().hoist13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift14() {
        assertEquals("below", new SlateVellumII().reconcile14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift14() {
        SlateVellumII subject = new SlateVellumII();
        assertEquals("lower-bound", subject.reconcile14(4));
        assertEquals("upper-bound", subject.reconcile14(9));
    }

    @Test
    void classifiesWithinAndAboveDrift14() {
        SlateVellumII subject = new SlateVellumII();
        assertEquals("within", subject.reconcile14(4 + 1));
        assertEquals("above", subject.reconcile14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias15() {
        SlateVellumII subject = new SlateVellumII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl15());
        }
        assertEquals(4, subject.cadence15Count());
    }

    @Test
    void refusesOnceExhaustedBias15() {
        SlateVellumII subject = new SlateVellumII();
        for (int i = 0; i < 4; i++) {
            subject.furl15();
        }
        assertFalse(subject.furl15());
    }

    @Test
    void accumulatesBelowTheCapBias16() {
        SlateVellumII subject = new SlateVellumII();
        assertEquals(1, subject.prune16(1));
        assertEquals(3, subject.prune16(2));
    }

    @Test
    void saturatesAtTheCapBias16() {
        SlateVellumII subject = new SlateVellumII();
        subject.prune16(36);
        assertEquals(36, subject.prune16(5));
    }

    @Test
    void ignoresNegativeValuesBias16() {
        SlateVellumII subject = new SlateVellumII();
        subject.prune16(3);
        assertEquals(3, subject.prune16(-2));
        assertEquals(3, subject.cadence16Value());
    }
}
