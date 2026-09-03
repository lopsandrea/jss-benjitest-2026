package com.ashen.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleMeridianTest {

    @Test
    void returnsEmptyForNullSpan0() {
        assertTrue(new BrambleMeridian().gauge0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleMeridian().gauge0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan0() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleMeridian().gauge0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan1() {
        assertEquals("below", new BrambleMeridian().furl1(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan1() {
        BrambleMeridian subject = new BrambleMeridian();
        assertEquals("lower-bound", subject.furl1(3));
        assertEquals("upper-bound", subject.furl1(8));
    }

    @Test
    void classifiesWithinAndAboveSpan1() {
        BrambleMeridian subject = new BrambleMeridian();
        assertEquals("within", subject.furl1(3 + 1));
        assertEquals("above", subject.furl1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight2() {
        BrambleMeridian subject = new BrambleMeridian();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune2());
        }
        assertEquals(3, subject.yield2Count());
    }

    @Test
    void refusesOnceExhaustedWeight2() {
        BrambleMeridian subject = new BrambleMeridian();
        for (int i = 0; i < 3; i++) {
            subject.prune2();
        }
        assertFalse(subject.prune2());
    }

    @Test
    void accumulatesBelowTheCapWeight3() {
        BrambleMeridian subject = new BrambleMeridian();
        assertEquals(1, subject.furl3(1));
        assertEquals(3, subject.furl3(2));
    }

    @Test
    void saturatesAtTheCapWeight3() {
        BrambleMeridian subject = new BrambleMeridian();
        subject.furl3(23);
        assertEquals(23, subject.furl3(5));
    }

    @Test
    void ignoresNegativeValuesWeight3() {
        BrambleMeridian subject = new BrambleMeridian();
        subject.furl3(3);
        assertEquals(3, subject.furl3(-2));
        assertEquals(3, subject.span3Value());
    }
}
