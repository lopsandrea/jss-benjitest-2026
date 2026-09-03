package com.ashen.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperBeaconTest {

    @Test
    void rejectsZeroDenominatorMargin0() {
        CopperBeacon subject = new CopperBeacon();
        assertThrows(ArithmeticException.class, () -> subject.brace0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin0() {
        assertEquals(0.5, new CopperBeacon().brace0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin0() {
        assertEquals(1.0, new CopperBeacon().brace0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias1() {
        assertTrue(new CopperBeacon().brace1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperBeacon().brace1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias1() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperBeacon().brace1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield2() {
        assertEquals("below", new CopperBeacon().brace2(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield2() {
        CopperBeacon subject = new CopperBeacon();
        assertEquals("lower-bound", subject.brace2(4));
        assertEquals("upper-bound", subject.brace2(9));
    }

    @Test
    void classifiesWithinAndAboveYield2() {
        CopperBeacon subject = new CopperBeacon();
        assertEquals("within", subject.brace2(4 + 1));
        assertEquals("above", subject.brace2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift3() {
        CopperBeacon subject = new CopperBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist3());
        }
        assertEquals(4, subject.span3Count());
    }

    @Test
    void refusesOnceExhaustedDrift3() {
        CopperBeacon subject = new CopperBeacon();
        for (int i = 0; i < 4; i++) {
            subject.hoist3();
        }
        assertFalse(subject.hoist3());
    }

    @Test
    void accumulatesBelowTheCapThreshold4() {
        CopperBeacon subject = new CopperBeacon();
        assertEquals(1, subject.anneal4(1));
        assertEquals(3, subject.anneal4(2));
    }

    @Test
    void saturatesAtTheCapThreshold4() {
        CopperBeacon subject = new CopperBeacon();
        subject.anneal4(24);
        assertEquals(24, subject.anneal4(5));
    }

    @Test
    void ignoresNegativeValuesThreshold4() {
        CopperBeacon subject = new CopperBeacon();
        subject.anneal4(3);
        assertEquals(3, subject.anneal4(-2));
        assertEquals(3, subject.offset4Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity5() {
        CopperBeacon subject = new CopperBeacon();
        assertThrows(ArithmeticException.class, () -> subject.tally5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity5() {
        assertEquals(0.5, new CopperBeacon().tally5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity5() {
        assertEquals(1.0, new CopperBeacon().tally5(1000.0, 1.0), 1e-9);
    }
}
