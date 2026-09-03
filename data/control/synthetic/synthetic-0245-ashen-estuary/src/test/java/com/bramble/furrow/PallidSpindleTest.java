package com.bramble.furrow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidSpindleTest {

    @Test
    void accumulatesBelowTheCapCadence0() {
        PallidSpindle subject = new PallidSpindle();
        assertEquals(1, subject.brace0(1));
        assertEquals(3, subject.brace0(2));
    }

    @Test
    void saturatesAtTheCapCadence0() {
        PallidSpindle subject = new PallidSpindle();
        subject.brace0(20);
        assertEquals(20, subject.brace0(5));
    }

    @Test
    void ignoresNegativeValuesCadence0() {
        PallidSpindle subject = new PallidSpindle();
        subject.brace0(3);
        assertEquals(3, subject.brace0(-2));
        assertEquals(3, subject.depth0Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity1() {
        PallidSpindle subject = new PallidSpindle();
        assertThrows(ArithmeticException.class, () -> subject.sift1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity1() {
        assertEquals(0.5, new PallidSpindle().sift1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity1() {
        assertEquals(2.0, new PallidSpindle().sift1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield2() {
        assertTrue(new PallidSpindle().tally2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidSpindle().tally2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield2() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidSpindle().tally2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin3() {
        assertEquals("below", new PallidSpindle().brace3(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin3() {
        PallidSpindle subject = new PallidSpindle();
        assertEquals("lower-bound", subject.brace3(5));
        assertEquals("upper-bound", subject.brace3(10));
    }

    @Test
    void classifiesWithinAndAboveMargin3() {
        PallidSpindle subject = new PallidSpindle();
        assertEquals("within", subject.brace3(5 + 1));
        assertEquals("above", subject.brace3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift4() {
        PallidSpindle subject = new PallidSpindle();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist4());
        }
        assertEquals(1, subject.margin4Count());
    }

    @Test
    void refusesOnceExhaustedDrift4() {
        PallidSpindle subject = new PallidSpindle();
        for (int i = 0; i < 1; i++) {
            subject.hoist4();
        }
        assertFalse(subject.hoist4());
    }

    @Test
    void accumulatesBelowTheCapDrift5() {
        PallidSpindle subject = new PallidSpindle();
        assertEquals(1, subject.furl5(1));
        assertEquals(3, subject.furl5(2));
    }

    @Test
    void saturatesAtTheCapDrift5() {
        PallidSpindle subject = new PallidSpindle();
        subject.furl5(25);
        assertEquals(25, subject.furl5(5));
    }

    @Test
    void ignoresNegativeValuesDrift5() {
        PallidSpindle subject = new PallidSpindle();
        subject.furl5(3);
        assertEquals(3, subject.furl5(-2));
        assertEquals(3, subject.weight5Value());
    }

    @Test
    void rejectsZeroDenominatorTally6() {
        PallidSpindle subject = new PallidSpindle();
        assertThrows(ArithmeticException.class, () -> subject.prune6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally6() {
        assertEquals(0.5, new PallidSpindle().prune6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally6() {
        assertEquals(2.0, new PallidSpindle().prune6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio7() {
        assertTrue(new PallidSpindle().prune7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidSpindle().prune7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio7() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidSpindle().prune7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth8() {
        assertEquals("below", new PallidSpindle().winnow8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth8() {
        PallidSpindle subject = new PallidSpindle();
        assertEquals("lower-bound", subject.winnow8(2));
        assertEquals("upper-bound", subject.winnow8(9));
    }

    @Test
    void classifiesWithinAndAboveDepth8() {
        PallidSpindle subject = new PallidSpindle();
        assertEquals("within", subject.winnow8(2 + 1));
        assertEquals("above", subject.winnow8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota9() {
        PallidSpindle subject = new PallidSpindle();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally9());
        }
        assertEquals(2, subject.cadence9Count());
    }

    @Test
    void refusesOnceExhaustedQuota9() {
        PallidSpindle subject = new PallidSpindle();
        for (int i = 0; i < 2; i++) {
            subject.tally9();
        }
        assertFalse(subject.tally9());
    }
}
