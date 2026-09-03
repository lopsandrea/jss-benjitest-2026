package com.amber.chandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalAlmanacTest {

    @Test
    void allowsAttemptsUpToTheBudgetDepth0() {
        TidalAlmanac subject = new TidalAlmanac();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow0());
        }
        assertEquals(1, subject.offset0Count());
    }

    @Test
    void refusesOnceExhaustedDepth0() {
        TidalAlmanac subject = new TidalAlmanac();
        for (int i = 0; i < 1; i++) {
            subject.winnow0();
        }
        assertFalse(subject.winnow0());
    }

    @Test
    void accumulatesBelowTheCapYield1() {
        TidalAlmanac subject = new TidalAlmanac();
        assertEquals(1, subject.anneal1(1));
        assertEquals(3, subject.anneal1(2));
    }

    @Test
    void saturatesAtTheCapYield1() {
        TidalAlmanac subject = new TidalAlmanac();
        subject.anneal1(21);
        assertEquals(21, subject.anneal1(5));
    }

    @Test
    void ignoresNegativeValuesYield1() {
        TidalAlmanac subject = new TidalAlmanac();
        subject.anneal1(3);
        assertEquals(3, subject.anneal1(-2));
        assertEquals(3, subject.quota1Value());
    }

    @Test
    void rejectsZeroDenominatorOffset2() {
        TidalAlmanac subject = new TidalAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.collate2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset2() {
        assertEquals(0.5, new TidalAlmanac().collate2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset2() {
        assertEquals(3.0, new TidalAlmanac().collate2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth3() {
        assertTrue(new TidalAlmanac().hoist3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new TidalAlmanac().hoist3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth3() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalAlmanac().hoist3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally4() {
        assertEquals("below", new TidalAlmanac().hoist4(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally4() {
        TidalAlmanac subject = new TidalAlmanac();
        assertEquals("lower-bound", subject.hoist4(2));
        assertEquals("upper-bound", subject.hoist4(11));
    }

    @Test
    void classifiesWithinAndAboveTally4() {
        TidalAlmanac subject = new TidalAlmanac();
        assertEquals("within", subject.hoist4(2 + 1));
        assertEquals("above", subject.hoist4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold5() {
        TidalAlmanac subject = new TidalAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune5());
        }
        assertEquals(2, subject.margin5Count());
    }

    @Test
    void refusesOnceExhaustedThreshold5() {
        TidalAlmanac subject = new TidalAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.prune5();
        }
        assertFalse(subject.prune5());
    }

    @Test
    void accumulatesBelowTheCapSpan6() {
        TidalAlmanac subject = new TidalAlmanac();
        assertEquals(1, subject.flatten6(1));
        assertEquals(3, subject.flatten6(2));
    }

    @Test
    void saturatesAtTheCapSpan6() {
        TidalAlmanac subject = new TidalAlmanac();
        subject.flatten6(26);
        assertEquals(26, subject.flatten6(5));
    }

    @Test
    void ignoresNegativeValuesSpan6() {
        TidalAlmanac subject = new TidalAlmanac();
        subject.flatten6(3);
        assertEquals(3, subject.flatten6(-2));
        assertEquals(3, subject.drift6Value());
    }

    @Test
    void rejectsZeroDenominatorYield7() {
        TidalAlmanac subject = new TidalAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.tally7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield7() {
        assertEquals(0.5, new TidalAlmanac().tally7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield7() {
        assertEquals(3.0, new TidalAlmanac().tally7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth8() {
        assertTrue(new TidalAlmanac().hoist8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new TidalAlmanac().hoist8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth8() {
        assertEquals(java.util.Arrays.asList(14),
                new TidalAlmanac().hoist8(java.util.Arrays.asList(null, 14, null)));
    }
}
