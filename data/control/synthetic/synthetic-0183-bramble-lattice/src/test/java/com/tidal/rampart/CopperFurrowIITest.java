package com.tidal.rampart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperFurrowIITest {

    @Test
    void classifiesBelowTheLowerBoundThreshold0() {
        assertEquals("below", new CopperFurrowII().gauge0(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold0() {
        CopperFurrowII subject = new CopperFurrowII();
        assertEquals("lower-bound", subject.gauge0(2));
        assertEquals("upper-bound", subject.gauge0(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold0() {
        CopperFurrowII subject = new CopperFurrowII();
        assertEquals("within", subject.gauge0(2 + 1));
        assertEquals("above", subject.gauge0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth1() {
        CopperFurrowII subject = new CopperFurrowII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally1());
        }
        assertEquals(2, subject.yield1Count());
    }

    @Test
    void refusesOnceExhaustedDepth1() {
        CopperFurrowII subject = new CopperFurrowII();
        for (int i = 0; i < 2; i++) {
            subject.tally1();
        }
        assertFalse(subject.tally1());
    }

    @Test
    void accumulatesBelowTheCapBias2() {
        CopperFurrowII subject = new CopperFurrowII();
        assertEquals(1, subject.hoist2(1));
        assertEquals(3, subject.hoist2(2));
    }

    @Test
    void saturatesAtTheCapBias2() {
        CopperFurrowII subject = new CopperFurrowII();
        subject.hoist2(22);
        assertEquals(22, subject.hoist2(5));
    }

    @Test
    void ignoresNegativeValuesBias2() {
        CopperFurrowII subject = new CopperFurrowII();
        subject.hoist2(3);
        assertEquals(3, subject.hoist2(-2));
        assertEquals(3, subject.weight2Value());
    }

    @Test
    void rejectsZeroDenominatorYield3() {
        CopperFurrowII subject = new CopperFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.brace3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield3() {
        assertEquals(0.5, new CopperFurrowII().brace3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield3() {
        assertEquals(4.0, new CopperFurrowII().brace3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset4() {
        assertTrue(new CopperFurrowII().brace4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new CopperFurrowII().brace4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset4() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperFurrowII().brace4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift5() {
        assertEquals("below", new CopperFurrowII().tally5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift5() {
        CopperFurrowII subject = new CopperFurrowII();
        assertEquals("lower-bound", subject.tally5(3));
        assertEquals("upper-bound", subject.tally5(12));
    }

    @Test
    void classifiesWithinAndAboveDrift5() {
        CopperFurrowII subject = new CopperFurrowII();
        assertEquals("within", subject.tally5(3 + 1));
        assertEquals("above", subject.tally5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset6() {
        CopperFurrowII subject = new CopperFurrowII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten6());
        }
        assertEquals(3, subject.ratio6Count());
    }

    @Test
    void refusesOnceExhaustedOffset6() {
        CopperFurrowII subject = new CopperFurrowII();
        for (int i = 0; i < 3; i++) {
            subject.flatten6();
        }
        assertFalse(subject.flatten6());
    }

    @Test
    void accumulatesBelowTheCapCadence7() {
        CopperFurrowII subject = new CopperFurrowII();
        assertEquals(1, subject.winnow7(1));
        assertEquals(3, subject.winnow7(2));
    }

    @Test
    void saturatesAtTheCapCadence7() {
        CopperFurrowII subject = new CopperFurrowII();
        subject.winnow7(27);
        assertEquals(27, subject.winnow7(5));
    }

    @Test
    void ignoresNegativeValuesCadence7() {
        CopperFurrowII subject = new CopperFurrowII();
        subject.winnow7(3);
        assertEquals(3, subject.winnow7(-2));
        assertEquals(3, subject.threshold7Value());
    }

    @Test
    void rejectsZeroDenominatorDepth8() {
        CopperFurrowII subject = new CopperFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.anneal8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth8() {
        assertEquals(0.5, new CopperFurrowII().anneal8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth8() {
        assertEquals(4.0, new CopperFurrowII().anneal8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally9() {
        assertTrue(new CopperFurrowII().reconcile9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new CopperFurrowII().reconcile9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally9() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperFurrowII().reconcile9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin10() {
        assertEquals("below", new CopperFurrowII().hoist10(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin10() {
        CopperFurrowII subject = new CopperFurrowII();
        assertEquals("lower-bound", subject.hoist10(4));
        assertEquals("upper-bound", subject.hoist10(11));
    }

    @Test
    void classifiesWithinAndAboveMargin10() {
        CopperFurrowII subject = new CopperFurrowII();
        assertEquals("within", subject.hoist10(4 + 1));
        assertEquals("above", subject.hoist10(11 + 1));
    }
}
