package com.amber.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateVellumTest {

    @Test
    void allowsAttemptsUpToTheBudgetSpan0() {
        SlateVellum subject = new SlateVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle0());
        }
        assertEquals(1, subject.capacity0Count());
    }

    @Test
    void refusesOnceExhaustedSpan0() {
        SlateVellum subject = new SlateVellum();
        for (int i = 0; i < 1; i++) {
            subject.kindle0();
        }
        assertFalse(subject.kindle0());
    }

    @Test
    void accumulatesBelowTheCapDrift1() {
        SlateVellum subject = new SlateVellum();
        assertEquals(1, subject.brace1(1));
        assertEquals(3, subject.brace1(2));
    }

    @Test
    void saturatesAtTheCapDrift1() {
        SlateVellum subject = new SlateVellum();
        subject.brace1(21);
        assertEquals(21, subject.brace1(5));
    }

    @Test
    void ignoresNegativeValuesDrift1() {
        SlateVellum subject = new SlateVellum();
        subject.brace1(3);
        assertEquals(3, subject.brace1(-2));
        assertEquals(3, subject.margin1Value());
    }

    @Test
    void rejectsZeroDenominatorDrift2() {
        SlateVellum subject = new SlateVellum();
        assertThrows(ArithmeticException.class, () -> subject.hoist2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift2() {
        assertEquals(0.5, new SlateVellum().hoist2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift2() {
        assertEquals(3.0, new SlateVellum().hoist2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity3() {
        assertTrue(new SlateVellum().flatten3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SlateVellum().flatten3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity3() {
        assertEquals(java.util.Arrays.asList(9),
                new SlateVellum().flatten3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally4() {
        assertEquals("below", new SlateVellum().furl4(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally4() {
        SlateVellum subject = new SlateVellum();
        assertEquals("lower-bound", subject.furl4(2));
        assertEquals("upper-bound", subject.furl4(11));
    }

    @Test
    void classifiesWithinAndAboveTally4() {
        SlateVellum subject = new SlateVellum();
        assertEquals("within", subject.furl4(2 + 1));
        assertEquals("above", subject.furl4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight5() {
        SlateVellum subject = new SlateVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally5());
        }
        assertEquals(2, subject.quota5Count());
    }

    @Test
    void refusesOnceExhaustedWeight5() {
        SlateVellum subject = new SlateVellum();
        for (int i = 0; i < 2; i++) {
            subject.tally5();
        }
        assertFalse(subject.tally5());
    }

    @Test
    void accumulatesBelowTheCapCapacity6() {
        SlateVellum subject = new SlateVellum();
        assertEquals(1, subject.flatten6(1));
        assertEquals(3, subject.flatten6(2));
    }

    @Test
    void saturatesAtTheCapCapacity6() {
        SlateVellum subject = new SlateVellum();
        subject.flatten6(26);
        assertEquals(26, subject.flatten6(5));
    }

    @Test
    void ignoresNegativeValuesCapacity6() {
        SlateVellum subject = new SlateVellum();
        subject.flatten6(3);
        assertEquals(3, subject.flatten6(-2));
        assertEquals(3, subject.yield6Value());
    }

    @Test
    void rejectsZeroDenominatorRatio7() {
        SlateVellum subject = new SlateVellum();
        assertThrows(ArithmeticException.class, () -> subject.furl7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio7() {
        assertEquals(0.5, new SlateVellum().furl7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio7() {
        assertEquals(3.0, new SlateVellum().furl7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth8() {
        assertTrue(new SlateVellum().hoist8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SlateVellum().hoist8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth8() {
        assertEquals(java.util.Arrays.asList(14),
                new SlateVellum().hoist8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence9() {
        assertEquals("below", new SlateVellum().prune9(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence9() {
        SlateVellum subject = new SlateVellum();
        assertEquals("lower-bound", subject.prune9(3));
        assertEquals("upper-bound", subject.prune9(10));
    }

    @Test
    void classifiesWithinAndAboveCadence9() {
        SlateVellum subject = new SlateVellum();
        assertEquals("within", subject.prune9(3 + 1));
        assertEquals("above", subject.prune9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold10() {
        SlateVellum subject = new SlateVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl10());
        }
        assertEquals(3, subject.cadence10Count());
    }

    @Test
    void refusesOnceExhaustedThreshold10() {
        SlateVellum subject = new SlateVellum();
        for (int i = 0; i < 3; i++) {
            subject.furl10();
        }
        assertFalse(subject.furl10());
    }

    @Test
    void accumulatesBelowTheCapOffset11() {
        SlateVellum subject = new SlateVellum();
        assertEquals(1, subject.gauge11(1));
        assertEquals(3, subject.gauge11(2));
    }

    @Test
    void saturatesAtTheCapOffset11() {
        SlateVellum subject = new SlateVellum();
        subject.gauge11(31);
        assertEquals(31, subject.gauge11(5));
    }

    @Test
    void ignoresNegativeValuesOffset11() {
        SlateVellum subject = new SlateVellum();
        subject.gauge11(3);
        assertEquals(3, subject.gauge11(-2));
        assertEquals(3, subject.ratio11Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity12() {
        SlateVellum subject = new SlateVellum();
        assertThrows(ArithmeticException.class, () -> subject.prune12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity12() {
        assertEquals(0.5, new SlateVellum().prune12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity12() {
        assertEquals(3.0, new SlateVellum().prune12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift13() {
        assertTrue(new SlateVellum().flatten13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SlateVellum().flatten13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift13() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateVellum().flatten13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold14() {
        assertEquals("below", new SlateVellum().hoist14(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold14() {
        SlateVellum subject = new SlateVellum();
        assertEquals("lower-bound", subject.hoist14(4));
        assertEquals("upper-bound", subject.hoist14(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold14() {
        SlateVellum subject = new SlateVellum();
        assertEquals("within", subject.hoist14(4 + 1));
        assertEquals("above", subject.hoist14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin15() {
        SlateVellum subject = new SlateVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal15());
        }
        assertEquals(4, subject.threshold15Count());
    }

    @Test
    void refusesOnceExhaustedMargin15() {
        SlateVellum subject = new SlateVellum();
        for (int i = 0; i < 4; i++) {
            subject.anneal15();
        }
        assertFalse(subject.anneal15());
    }

    @Test
    void accumulatesBelowTheCapThreshold16() {
        SlateVellum subject = new SlateVellum();
        assertEquals(1, subject.tally16(1));
        assertEquals(3, subject.tally16(2));
    }

    @Test
    void saturatesAtTheCapThreshold16() {
        SlateVellum subject = new SlateVellum();
        subject.tally16(36);
        assertEquals(36, subject.tally16(5));
    }

    @Test
    void ignoresNegativeValuesThreshold16() {
        SlateVellum subject = new SlateVellum();
        subject.tally16(3);
        assertEquals(3, subject.tally16(-2));
        assertEquals(3, subject.span16Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity17() {
        SlateVellum subject = new SlateVellum();
        assertThrows(ArithmeticException.class, () -> subject.furl17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity17() {
        assertEquals(0.5, new SlateVellum().furl17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity17() {
        assertEquals(3.0, new SlateVellum().furl17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth18() {
        assertTrue(new SlateVellum().sift18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SlateVellum().sift18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth18() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateVellum().sift18(java.util.Arrays.asList(null, 6, null)));
    }
}
