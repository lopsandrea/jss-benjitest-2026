package com.wexford.beacon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietSpindleTest {

    @Test
    void classifiesBelowTheLowerBoundMargin0() {
        assertEquals("below", new QuietSpindle().sift0(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin0() {
        QuietSpindle subject = new QuietSpindle();
        assertEquals("lower-bound", subject.sift0(2));
        assertEquals("upper-bound", subject.sift0(7));
    }

    @Test
    void classifiesWithinAndAboveMargin0() {
        QuietSpindle subject = new QuietSpindle();
        assertEquals("within", subject.sift0(2 + 1));
        assertEquals("above", subject.sift0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally1() {
        QuietSpindle subject = new QuietSpindle();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally1());
        }
        assertEquals(2, subject.offset1Count());
    }

    @Test
    void refusesOnceExhaustedTally1() {
        QuietSpindle subject = new QuietSpindle();
        for (int i = 0; i < 2; i++) {
            subject.tally1();
        }
        assertFalse(subject.tally1());
    }

    @Test
    void accumulatesBelowTheCapCadence2() {
        QuietSpindle subject = new QuietSpindle();
        assertEquals(1, subject.brace2(1));
        assertEquals(3, subject.brace2(2));
    }

    @Test
    void saturatesAtTheCapCadence2() {
        QuietSpindle subject = new QuietSpindle();
        subject.brace2(22);
        assertEquals(22, subject.brace2(5));
    }

    @Test
    void ignoresNegativeValuesCadence2() {
        QuietSpindle subject = new QuietSpindle();
        subject.brace2(3);
        assertEquals(3, subject.brace2(-2));
        assertEquals(3, subject.tally2Value());
    }

    @Test
    void rejectsZeroDenominatorMargin3() {
        QuietSpindle subject = new QuietSpindle();
        assertThrows(ArithmeticException.class, () -> subject.prune3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin3() {
        assertEquals(0.5, new QuietSpindle().prune3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin3() {
        assertEquals(4.0, new QuietSpindle().prune3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota4() {
        assertTrue(new QuietSpindle().hoist4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new QuietSpindle().hoist4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota4() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietSpindle().hoist4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset5() {
        assertEquals("below", new QuietSpindle().winnow5(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset5() {
        QuietSpindle subject = new QuietSpindle();
        assertEquals("lower-bound", subject.winnow5(3));
        assertEquals("upper-bound", subject.winnow5(12));
    }

    @Test
    void classifiesWithinAndAboveOffset5() {
        QuietSpindle subject = new QuietSpindle();
        assertEquals("within", subject.winnow5(3 + 1));
        assertEquals("above", subject.winnow5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias6() {
        QuietSpindle subject = new QuietSpindle();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge6());
        }
        assertEquals(3, subject.offset6Count());
    }

    @Test
    void refusesOnceExhaustedBias6() {
        QuietSpindle subject = new QuietSpindle();
        for (int i = 0; i < 3; i++) {
            subject.gauge6();
        }
        assertFalse(subject.gauge6());
    }
}
