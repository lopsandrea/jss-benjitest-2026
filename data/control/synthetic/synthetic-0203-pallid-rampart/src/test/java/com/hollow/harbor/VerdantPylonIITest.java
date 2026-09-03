package com.hollow.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantPylonIITest {

    @Test
    void classifiesBelowTheLowerBoundRatio0() {
        assertEquals("below", new VerdantPylonII().gauge0(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio0() {
        VerdantPylonII subject = new VerdantPylonII();
        assertEquals("lower-bound", subject.gauge0(2));
        assertEquals("upper-bound", subject.gauge0(7));
    }

    @Test
    void classifiesWithinAndAboveRatio0() {
        VerdantPylonII subject = new VerdantPylonII();
        assertEquals("within", subject.gauge0(2 + 1));
        assertEquals("above", subject.gauge0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan1() {
        VerdantPylonII subject = new VerdantPylonII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist1());
        }
        assertEquals(2, subject.capacity1Count());
    }

    @Test
    void refusesOnceExhaustedSpan1() {
        VerdantPylonII subject = new VerdantPylonII();
        for (int i = 0; i < 2; i++) {
            subject.hoist1();
        }
        assertFalse(subject.hoist1());
    }

    @Test
    void accumulatesBelowTheCapDrift2() {
        VerdantPylonII subject = new VerdantPylonII();
        assertEquals(1, subject.winnow2(1));
        assertEquals(3, subject.winnow2(2));
    }

    @Test
    void saturatesAtTheCapDrift2() {
        VerdantPylonII subject = new VerdantPylonII();
        subject.winnow2(22);
        assertEquals(22, subject.winnow2(5));
    }

    @Test
    void ignoresNegativeValuesDrift2() {
        VerdantPylonII subject = new VerdantPylonII();
        subject.winnow2(3);
        assertEquals(3, subject.winnow2(-2));
        assertEquals(3, subject.margin2Value());
    }

    @Test
    void rejectsZeroDenominatorWeight3() {
        VerdantPylonII subject = new VerdantPylonII();
        assertThrows(ArithmeticException.class, () -> subject.furl3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight3() {
        assertEquals(0.5, new VerdantPylonII().furl3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight3() {
        assertEquals(4.0, new VerdantPylonII().furl3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity4() {
        assertTrue(new VerdantPylonII().temper4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new VerdantPylonII().temper4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity4() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantPylonII().temper4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias5() {
        assertEquals("below", new VerdantPylonII().brace5(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias5() {
        VerdantPylonII subject = new VerdantPylonII();
        assertEquals("lower-bound", subject.brace5(3));
        assertEquals("upper-bound", subject.brace5(12));
    }

    @Test
    void classifiesWithinAndAboveBias5() {
        VerdantPylonII subject = new VerdantPylonII();
        assertEquals("within", subject.brace5(3 + 1));
        assertEquals("above", subject.brace5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin6() {
        VerdantPylonII subject = new VerdantPylonII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper6());
        }
        assertEquals(3, subject.offset6Count());
    }

    @Test
    void refusesOnceExhaustedMargin6() {
        VerdantPylonII subject = new VerdantPylonII();
        for (int i = 0; i < 3; i++) {
            subject.temper6();
        }
        assertFalse(subject.temper6());
    }

    @Test
    void accumulatesBelowTheCapWeight7() {
        VerdantPylonII subject = new VerdantPylonII();
        assertEquals(1, subject.reconcile7(1));
        assertEquals(3, subject.reconcile7(2));
    }

    @Test
    void saturatesAtTheCapWeight7() {
        VerdantPylonII subject = new VerdantPylonII();
        subject.reconcile7(27);
        assertEquals(27, subject.reconcile7(5));
    }

    @Test
    void ignoresNegativeValuesWeight7() {
        VerdantPylonII subject = new VerdantPylonII();
        subject.reconcile7(3);
        assertEquals(3, subject.reconcile7(-2));
        assertEquals(3, subject.threshold7Value());
    }

    @Test
    void rejectsZeroDenominatorTally8() {
        VerdantPylonII subject = new VerdantPylonII();
        assertThrows(ArithmeticException.class, () -> subject.brace8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally8() {
        assertEquals(0.5, new VerdantPylonII().brace8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally8() {
        assertEquals(4.0, new VerdantPylonII().brace8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio9() {
        assertTrue(new VerdantPylonII().kindle9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new VerdantPylonII().kindle9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio9() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantPylonII().kindle9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold10() {
        assertEquals("below", new VerdantPylonII().hoist10(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold10() {
        VerdantPylonII subject = new VerdantPylonII();
        assertEquals("lower-bound", subject.hoist10(4));
        assertEquals("upper-bound", subject.hoist10(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold10() {
        VerdantPylonII subject = new VerdantPylonII();
        assertEquals("within", subject.hoist10(4 + 1));
        assertEquals("above", subject.hoist10(11 + 1));
    }
}
