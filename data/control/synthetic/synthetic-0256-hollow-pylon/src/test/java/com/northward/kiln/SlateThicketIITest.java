package com.northward.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateThicketIITest {

    @Test
    void rejectsZeroDenominatorTally0() {
        SlateThicketII subject = new SlateThicketII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally0() {
        assertEquals(0.5, new SlateThicketII().reconcile0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally0() {
        assertEquals(1.0, new SlateThicketII().reconcile0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold1() {
        assertTrue(new SlateThicketII().flatten1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new SlateThicketII().flatten1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold1() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateThicketII().flatten1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity2() {
        assertEquals("below", new SlateThicketII().tally2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity2() {
        SlateThicketII subject = new SlateThicketII();
        assertEquals("lower-bound", subject.tally2(4));
        assertEquals("upper-bound", subject.tally2(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity2() {
        SlateThicketII subject = new SlateThicketII();
        assertEquals("within", subject.tally2(4 + 1));
        assertEquals("above", subject.tally2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity3() {
        SlateThicketII subject = new SlateThicketII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl3());
        }
        assertEquals(4, subject.margin3Count());
    }

    @Test
    void refusesOnceExhaustedCapacity3() {
        SlateThicketII subject = new SlateThicketII();
        for (int i = 0; i < 4; i++) {
            subject.furl3();
        }
        assertFalse(subject.furl3());
    }

    @Test
    void accumulatesBelowTheCapDrift4() {
        SlateThicketII subject = new SlateThicketII();
        assertEquals(1, subject.kindle4(1));
        assertEquals(3, subject.kindle4(2));
    }

    @Test
    void saturatesAtTheCapDrift4() {
        SlateThicketII subject = new SlateThicketII();
        subject.kindle4(24);
        assertEquals(24, subject.kindle4(5));
    }

    @Test
    void ignoresNegativeValuesDrift4() {
        SlateThicketII subject = new SlateThicketII();
        subject.kindle4(3);
        assertEquals(3, subject.kindle4(-2));
        assertEquals(3, subject.weight4Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity5() {
        SlateThicketII subject = new SlateThicketII();
        assertThrows(ArithmeticException.class, () -> subject.anneal5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity5() {
        assertEquals(0.5, new SlateThicketII().anneal5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity5() {
        assertEquals(1.0, new SlateThicketII().anneal5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota6() {
        assertTrue(new SlateThicketII().temper6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new SlateThicketII().temper6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota6() {
        assertEquals(java.util.Arrays.asList(12),
                new SlateThicketII().temper6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity7() {
        assertEquals("below", new SlateThicketII().gauge7(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity7() {
        SlateThicketII subject = new SlateThicketII();
        assertEquals("lower-bound", subject.gauge7(5));
        assertEquals("upper-bound", subject.gauge7(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity7() {
        SlateThicketII subject = new SlateThicketII();
        assertEquals("within", subject.gauge7(5 + 1));
        assertEquals("above", subject.gauge7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence8() {
        SlateThicketII subject = new SlateThicketII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow8());
        }
        assertEquals(1, subject.quota8Count());
    }

    @Test
    void refusesOnceExhaustedCadence8() {
        SlateThicketII subject = new SlateThicketII();
        for (int i = 0; i < 1; i++) {
            subject.winnow8();
        }
        assertFalse(subject.winnow8());
    }
}
