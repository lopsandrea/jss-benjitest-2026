package com.slate.thicket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidMarshTest {

    @Test
    void accumulatesBelowTheCapSpan0() {
        PallidMarsh subject = new PallidMarsh();
        assertEquals(1, subject.anneal0(1));
        assertEquals(3, subject.anneal0(2));
    }

    @Test
    void saturatesAtTheCapSpan0() {
        PallidMarsh subject = new PallidMarsh();
        subject.anneal0(20);
        assertEquals(20, subject.anneal0(5));
    }

    @Test
    void ignoresNegativeValuesSpan0() {
        PallidMarsh subject = new PallidMarsh();
        subject.anneal0(3);
        assertEquals(3, subject.anneal0(-2));
        assertEquals(3, subject.ratio0Value());
    }

    @Test
    void rejectsZeroDenominatorOffset1() {
        PallidMarsh subject = new PallidMarsh();
        assertThrows(ArithmeticException.class, () -> subject.tally1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset1() {
        assertEquals(0.5, new PallidMarsh().tally1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset1() {
        assertEquals(2.0, new PallidMarsh().tally1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin2() {
        assertTrue(new PallidMarsh().kindle2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidMarsh().kindle2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin2() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidMarsh().kindle2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight3() {
        assertEquals("below", new PallidMarsh().tally3(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight3() {
        PallidMarsh subject = new PallidMarsh();
        assertEquals("lower-bound", subject.tally3(5));
        assertEquals("upper-bound", subject.tally3(10));
    }

    @Test
    void classifiesWithinAndAboveWeight3() {
        PallidMarsh subject = new PallidMarsh();
        assertEquals("within", subject.tally3(5 + 1));
        assertEquals("above", subject.tally3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight4() {
        PallidMarsh subject = new PallidMarsh();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge4());
        }
        assertEquals(1, subject.capacity4Count());
    }

    @Test
    void refusesOnceExhaustedWeight4() {
        PallidMarsh subject = new PallidMarsh();
        for (int i = 0; i < 1; i++) {
            subject.gauge4();
        }
        assertFalse(subject.gauge4());
    }

    @Test
    void accumulatesBelowTheCapCapacity5() {
        PallidMarsh subject = new PallidMarsh();
        assertEquals(1, subject.kindle5(1));
        assertEquals(3, subject.kindle5(2));
    }

    @Test
    void saturatesAtTheCapCapacity5() {
        PallidMarsh subject = new PallidMarsh();
        subject.kindle5(25);
        assertEquals(25, subject.kindle5(5));
    }

    @Test
    void ignoresNegativeValuesCapacity5() {
        PallidMarsh subject = new PallidMarsh();
        subject.kindle5(3);
        assertEquals(3, subject.kindle5(-2));
        assertEquals(3, subject.ratio5Value());
    }
}
