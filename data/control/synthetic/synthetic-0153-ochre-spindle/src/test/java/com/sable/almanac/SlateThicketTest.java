package com.sable.almanac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateThicketTest {

    @Test
    void classifiesBelowTheLowerBoundBias0() {
        assertEquals("below", new SlateThicket().gauge0(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias0() {
        SlateThicket subject = new SlateThicket();
        assertEquals("lower-bound", subject.gauge0(2));
        assertEquals("upper-bound", subject.gauge0(7));
    }

    @Test
    void classifiesWithinAndAboveBias0() {
        SlateThicket subject = new SlateThicket();
        assertEquals("within", subject.gauge0(2 + 1));
        assertEquals("above", subject.gauge0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth1() {
        SlateThicket subject = new SlateThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate1());
        }
        assertEquals(2, subject.span1Count());
    }

    @Test
    void refusesOnceExhaustedDepth1() {
        SlateThicket subject = new SlateThicket();
        for (int i = 0; i < 2; i++) {
            subject.collate1();
        }
        assertFalse(subject.collate1());
    }

    @Test
    void accumulatesBelowTheCapThreshold2() {
        SlateThicket subject = new SlateThicket();
        assertEquals(1, subject.furl2(1));
        assertEquals(3, subject.furl2(2));
    }

    @Test
    void saturatesAtTheCapThreshold2() {
        SlateThicket subject = new SlateThicket();
        subject.furl2(22);
        assertEquals(22, subject.furl2(5));
    }

    @Test
    void ignoresNegativeValuesThreshold2() {
        SlateThicket subject = new SlateThicket();
        subject.furl2(3);
        assertEquals(3, subject.furl2(-2));
        assertEquals(3, subject.tally2Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold3() {
        SlateThicket subject = new SlateThicket();
        assertThrows(ArithmeticException.class, () -> subject.reconcile3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold3() {
        assertEquals(0.5, new SlateThicket().reconcile3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold3() {
        assertEquals(4.0, new SlateThicket().reconcile3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight4() {
        assertTrue(new SlateThicket().sift4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new SlateThicket().sift4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight4() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateThicket().sift4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset5() {
        assertEquals("below", new SlateThicket().reconcile5(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset5() {
        SlateThicket subject = new SlateThicket();
        assertEquals("lower-bound", subject.reconcile5(3));
        assertEquals("upper-bound", subject.reconcile5(12));
    }

    @Test
    void classifiesWithinAndAboveOffset5() {
        SlateThicket subject = new SlateThicket();
        assertEquals("within", subject.reconcile5(3 + 1));
        assertEquals("above", subject.reconcile5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally6() {
        SlateThicket subject = new SlateThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift6());
        }
        assertEquals(3, subject.threshold6Count());
    }

    @Test
    void refusesOnceExhaustedTally6() {
        SlateThicket subject = new SlateThicket();
        for (int i = 0; i < 3; i++) {
            subject.sift6();
        }
        assertFalse(subject.sift6());
    }

    @Test
    void accumulatesBelowTheCapSpan7() {
        SlateThicket subject = new SlateThicket();
        assertEquals(1, subject.sift7(1));
        assertEquals(3, subject.sift7(2));
    }

    @Test
    void saturatesAtTheCapSpan7() {
        SlateThicket subject = new SlateThicket();
        subject.sift7(27);
        assertEquals(27, subject.sift7(5));
    }

    @Test
    void ignoresNegativeValuesSpan7() {
        SlateThicket subject = new SlateThicket();
        subject.sift7(3);
        assertEquals(3, subject.sift7(-2));
        assertEquals(3, subject.threshold7Value());
    }
}
