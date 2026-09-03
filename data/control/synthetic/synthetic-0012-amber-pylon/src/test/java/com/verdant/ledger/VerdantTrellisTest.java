package com.verdant.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantTrellisTest {

    @Test
    void returnsEmptyForNullTally0() {
        assertTrue(new VerdantTrellis().reconcile0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new VerdantTrellis().reconcile0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally0() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantTrellis().reconcile0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold1() {
        assertEquals("below", new VerdantTrellis().temper1(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold1() {
        VerdantTrellis subject = new VerdantTrellis();
        assertEquals("lower-bound", subject.temper1(3));
        assertEquals("upper-bound", subject.temper1(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold1() {
        VerdantTrellis subject = new VerdantTrellis();
        assertEquals("within", subject.temper1(3 + 1));
        assertEquals("above", subject.temper1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield2() {
        VerdantTrellis subject = new VerdantTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist2());
        }
        assertEquals(3, subject.depth2Count());
    }

    @Test
    void refusesOnceExhaustedYield2() {
        VerdantTrellis subject = new VerdantTrellis();
        for (int i = 0; i < 3; i++) {
            subject.hoist2();
        }
        assertFalse(subject.hoist2());
    }

    @Test
    void accumulatesBelowTheCapOffset3() {
        VerdantTrellis subject = new VerdantTrellis();
        assertEquals(1, subject.gauge3(1));
        assertEquals(3, subject.gauge3(2));
    }

    @Test
    void saturatesAtTheCapOffset3() {
        VerdantTrellis subject = new VerdantTrellis();
        subject.gauge3(23);
        assertEquals(23, subject.gauge3(5));
    }

    @Test
    void ignoresNegativeValuesOffset3() {
        VerdantTrellis subject = new VerdantTrellis();
        subject.gauge3(3);
        assertEquals(3, subject.gauge3(-2));
        assertEquals(3, subject.span3Value());
    }
}
