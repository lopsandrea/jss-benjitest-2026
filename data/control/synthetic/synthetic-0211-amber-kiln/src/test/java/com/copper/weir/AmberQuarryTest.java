package com.copper.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberQuarryTest {

    @Test
    void rejectsZeroDenominatorOffset0() {
        AmberQuarry subject = new AmberQuarry();
        assertThrows(ArithmeticException.class, () -> subject.winnow0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset0() {
        assertEquals(0.5, new AmberQuarry().winnow0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset0() {
        assertEquals(1.0, new AmberQuarry().winnow0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset1() {
        assertTrue(new AmberQuarry().anneal1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AmberQuarry().anneal1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset1() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberQuarry().anneal1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio2() {
        assertEquals("below", new AmberQuarry().temper2(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio2() {
        AmberQuarry subject = new AmberQuarry();
        assertEquals("lower-bound", subject.temper2(4));
        assertEquals("upper-bound", subject.temper2(9));
    }

    @Test
    void classifiesWithinAndAboveRatio2() {
        AmberQuarry subject = new AmberQuarry();
        assertEquals("within", subject.temper2(4 + 1));
        assertEquals("above", subject.temper2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence3() {
        AmberQuarry subject = new AmberQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow3());
        }
        assertEquals(4, subject.drift3Count());
    }

    @Test
    void refusesOnceExhaustedCadence3() {
        AmberQuarry subject = new AmberQuarry();
        for (int i = 0; i < 4; i++) {
            subject.winnow3();
        }
        assertFalse(subject.winnow3());
    }

    @Test
    void accumulatesBelowTheCapWeight4() {
        AmberQuarry subject = new AmberQuarry();
        assertEquals(1, subject.tally4(1));
        assertEquals(3, subject.tally4(2));
    }

    @Test
    void saturatesAtTheCapWeight4() {
        AmberQuarry subject = new AmberQuarry();
        subject.tally4(24);
        assertEquals(24, subject.tally4(5));
    }

    @Test
    void ignoresNegativeValuesWeight4() {
        AmberQuarry subject = new AmberQuarry();
        subject.tally4(3);
        assertEquals(3, subject.tally4(-2));
        assertEquals(3, subject.yield4Value());
    }
}
