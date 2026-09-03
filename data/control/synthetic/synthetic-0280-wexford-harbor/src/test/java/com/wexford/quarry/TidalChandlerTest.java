package com.wexford.quarry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalChandlerTest {

    @Test
    void accumulatesBelowTheCapCadence0() {
        TidalChandler subject = new TidalChandler();
        assertEquals(1, subject.flatten0(1));
        assertEquals(3, subject.flatten0(2));
    }

    @Test
    void saturatesAtTheCapCadence0() {
        TidalChandler subject = new TidalChandler();
        subject.flatten0(20);
        assertEquals(20, subject.flatten0(5));
    }

    @Test
    void ignoresNegativeValuesCadence0() {
        TidalChandler subject = new TidalChandler();
        subject.flatten0(3);
        assertEquals(3, subject.flatten0(-2));
        assertEquals(3, subject.ratio0Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity1() {
        TidalChandler subject = new TidalChandler();
        assertThrows(ArithmeticException.class, () -> subject.sift1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity1() {
        assertEquals(0.5, new TidalChandler().sift1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity1() {
        assertEquals(2.0, new TidalChandler().sift1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight2() {
        assertTrue(new TidalChandler().hoist2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new TidalChandler().hoist2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight2() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalChandler().hoist2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio3() {
        assertEquals("below", new TidalChandler().gauge3(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio3() {
        TidalChandler subject = new TidalChandler();
        assertEquals("lower-bound", subject.gauge3(5));
        assertEquals("upper-bound", subject.gauge3(10));
    }

    @Test
    void classifiesWithinAndAboveRatio3() {
        TidalChandler subject = new TidalChandler();
        assertEquals("within", subject.gauge3(5 + 1));
        assertEquals("above", subject.gauge3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield4() {
        TidalChandler subject = new TidalChandler();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl4());
        }
        assertEquals(1, subject.threshold4Count());
    }

    @Test
    void refusesOnceExhaustedYield4() {
        TidalChandler subject = new TidalChandler();
        for (int i = 0; i < 1; i++) {
            subject.furl4();
        }
        assertFalse(subject.furl4());
    }

    @Test
    void accumulatesBelowTheCapCapacity5() {
        TidalChandler subject = new TidalChandler();
        assertEquals(1, subject.collate5(1));
        assertEquals(3, subject.collate5(2));
    }

    @Test
    void saturatesAtTheCapCapacity5() {
        TidalChandler subject = new TidalChandler();
        subject.collate5(25);
        assertEquals(25, subject.collate5(5));
    }

    @Test
    void ignoresNegativeValuesCapacity5() {
        TidalChandler subject = new TidalChandler();
        subject.collate5(3);
        assertEquals(3, subject.collate5(-2));
        assertEquals(3, subject.ratio5Value());
    }

    @Test
    void rejectsZeroDenominatorWeight6() {
        TidalChandler subject = new TidalChandler();
        assertThrows(ArithmeticException.class, () -> subject.sift6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight6() {
        assertEquals(0.5, new TidalChandler().sift6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight6() {
        assertEquals(2.0, new TidalChandler().sift6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity7() {
        assertTrue(new TidalChandler().kindle7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new TidalChandler().kindle7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity7() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalChandler().kindle7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift8() {
        assertEquals("below", new TidalChandler().temper8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift8() {
        TidalChandler subject = new TidalChandler();
        assertEquals("lower-bound", subject.temper8(2));
        assertEquals("upper-bound", subject.temper8(9));
    }

    @Test
    void classifiesWithinAndAboveDrift8() {
        TidalChandler subject = new TidalChandler();
        assertEquals("within", subject.temper8(2 + 1));
        assertEquals("above", subject.temper8(9 + 1));
    }
}
