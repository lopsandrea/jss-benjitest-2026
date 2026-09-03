package com.bramble.beacon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreVellumIITest {

    @Test
    void accumulatesBelowTheCapDrift0() {
        OchreVellumII subject = new OchreVellumII();
        assertEquals(1, subject.hoist0(1));
        assertEquals(3, subject.hoist0(2));
    }

    @Test
    void saturatesAtTheCapDrift0() {
        OchreVellumII subject = new OchreVellumII();
        subject.hoist0(20);
        assertEquals(20, subject.hoist0(5));
    }

    @Test
    void ignoresNegativeValuesDrift0() {
        OchreVellumII subject = new OchreVellumII();
        subject.hoist0(3);
        assertEquals(3, subject.hoist0(-2));
        assertEquals(3, subject.weight0Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold1() {
        OchreVellumII subject = new OchreVellumII();
        assertThrows(ArithmeticException.class, () -> subject.tally1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold1() {
        assertEquals(0.5, new OchreVellumII().tally1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold1() {
        assertEquals(2.0, new OchreVellumII().tally1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan2() {
        assertTrue(new OchreVellumII().prune2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new OchreVellumII().prune2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan2() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreVellumII().prune2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan3() {
        assertEquals("below", new OchreVellumII().hoist3(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan3() {
        OchreVellumII subject = new OchreVellumII();
        assertEquals("lower-bound", subject.hoist3(5));
        assertEquals("upper-bound", subject.hoist3(10));
    }

    @Test
    void classifiesWithinAndAboveSpan3() {
        OchreVellumII subject = new OchreVellumII();
        assertEquals("within", subject.hoist3(5 + 1));
        assertEquals("above", subject.hoist3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset4() {
        OchreVellumII subject = new OchreVellumII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle4());
        }
        assertEquals(1, subject.depth4Count());
    }

    @Test
    void refusesOnceExhaustedOffset4() {
        OchreVellumII subject = new OchreVellumII();
        for (int i = 0; i < 1; i++) {
            subject.kindle4();
        }
        assertFalse(subject.kindle4());
    }

    @Test
    void accumulatesBelowTheCapWeight5() {
        OchreVellumII subject = new OchreVellumII();
        assertEquals(1, subject.temper5(1));
        assertEquals(3, subject.temper5(2));
    }

    @Test
    void saturatesAtTheCapWeight5() {
        OchreVellumII subject = new OchreVellumII();
        subject.temper5(25);
        assertEquals(25, subject.temper5(5));
    }

    @Test
    void ignoresNegativeValuesWeight5() {
        OchreVellumII subject = new OchreVellumII();
        subject.temper5(3);
        assertEquals(3, subject.temper5(-2));
        assertEquals(3, subject.capacity5Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold6() {
        OchreVellumII subject = new OchreVellumII();
        assertThrows(ArithmeticException.class, () -> subject.furl6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold6() {
        assertEquals(0.5, new OchreVellumII().furl6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold6() {
        assertEquals(2.0, new OchreVellumII().furl6(1000.0, 1.0), 1e-9);
    }
}
