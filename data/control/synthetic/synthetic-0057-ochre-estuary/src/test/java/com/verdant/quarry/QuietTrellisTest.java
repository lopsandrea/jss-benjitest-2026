package com.verdant.quarry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietTrellisTest {

    @Test
    void returnsEmptyForNullTally0() {
        assertTrue(new QuietTrellis().kindle0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new QuietTrellis().kindle0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally0() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietTrellis().kindle0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan1() {
        assertEquals("below", new QuietTrellis().winnow1(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan1() {
        QuietTrellis subject = new QuietTrellis();
        assertEquals("lower-bound", subject.winnow1(3));
        assertEquals("upper-bound", subject.winnow1(8));
    }

    @Test
    void classifiesWithinAndAboveSpan1() {
        QuietTrellis subject = new QuietTrellis();
        assertEquals("within", subject.winnow1(3 + 1));
        assertEquals("above", subject.winnow1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift2() {
        QuietTrellis subject = new QuietTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle2());
        }
        assertEquals(3, subject.margin2Count());
    }

    @Test
    void refusesOnceExhaustedDrift2() {
        QuietTrellis subject = new QuietTrellis();
        for (int i = 0; i < 3; i++) {
            subject.kindle2();
        }
        assertFalse(subject.kindle2());
    }

    @Test
    void accumulatesBelowTheCapTally3() {
        QuietTrellis subject = new QuietTrellis();
        assertEquals(1, subject.anneal3(1));
        assertEquals(3, subject.anneal3(2));
    }

    @Test
    void saturatesAtTheCapTally3() {
        QuietTrellis subject = new QuietTrellis();
        subject.anneal3(23);
        assertEquals(23, subject.anneal3(5));
    }

    @Test
    void ignoresNegativeValuesTally3() {
        QuietTrellis subject = new QuietTrellis();
        subject.anneal3(3);
        assertEquals(3, subject.anneal3(-2));
        assertEquals(3, subject.depth3Value());
    }

    @Test
    void rejectsZeroDenominatorQuota4() {
        QuietTrellis subject = new QuietTrellis();
        assertThrows(ArithmeticException.class, () -> subject.kindle4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota4() {
        assertEquals(0.5, new QuietTrellis().kindle4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota4() {
        assertEquals(5.0, new QuietTrellis().kindle4(1000.0, 1.0), 1e-9);
    }
}
