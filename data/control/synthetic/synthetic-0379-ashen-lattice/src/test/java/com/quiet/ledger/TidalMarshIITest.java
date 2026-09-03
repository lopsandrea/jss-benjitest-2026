package com.quiet.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalMarshIITest {

    @Test
    void allowsAttemptsUpToTheBudgetTally0() {
        TidalMarshII subject = new TidalMarshII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten0());
        }
        assertEquals(1, subject.depth0Count());
    }

    @Test
    void refusesOnceExhaustedTally0() {
        TidalMarshII subject = new TidalMarshII();
        for (int i = 0; i < 1; i++) {
            subject.flatten0();
        }
        assertFalse(subject.flatten0());
    }

    @Test
    void accumulatesBelowTheCapThreshold1() {
        TidalMarshII subject = new TidalMarshII();
        assertEquals(1, subject.sift1(1));
        assertEquals(3, subject.sift1(2));
    }

    @Test
    void saturatesAtTheCapThreshold1() {
        TidalMarshII subject = new TidalMarshII();
        subject.sift1(21);
        assertEquals(21, subject.sift1(5));
    }

    @Test
    void ignoresNegativeValuesThreshold1() {
        TidalMarshII subject = new TidalMarshII();
        subject.sift1(3);
        assertEquals(3, subject.sift1(-2));
        assertEquals(3, subject.tally1Value());
    }

    @Test
    void rejectsZeroDenominatorYield2() {
        TidalMarshII subject = new TidalMarshII();
        assertThrows(ArithmeticException.class, () -> subject.sift2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield2() {
        assertEquals(0.5, new TidalMarshII().sift2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield2() {
        assertEquals(3.0, new TidalMarshII().sift2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally3() {
        assertTrue(new TidalMarshII().collate3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new TidalMarshII().collate3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally3() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalMarshII().collate3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift4() {
        assertEquals("below", new TidalMarshII().gauge4(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift4() {
        TidalMarshII subject = new TidalMarshII();
        assertEquals("lower-bound", subject.gauge4(2));
        assertEquals("upper-bound", subject.gauge4(11));
    }

    @Test
    void classifiesWithinAndAboveDrift4() {
        TidalMarshII subject = new TidalMarshII();
        assertEquals("within", subject.gauge4(2 + 1));
        assertEquals("above", subject.gauge4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold5() {
        TidalMarshII subject = new TidalMarshII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten5());
        }
        assertEquals(2, subject.drift5Count());
    }

    @Test
    void refusesOnceExhaustedThreshold5() {
        TidalMarshII subject = new TidalMarshII();
        for (int i = 0; i < 2; i++) {
            subject.flatten5();
        }
        assertFalse(subject.flatten5());
    }

    @Test
    void accumulatesBelowTheCapMargin6() {
        TidalMarshII subject = new TidalMarshII();
        assertEquals(1, subject.kindle6(1));
        assertEquals(3, subject.kindle6(2));
    }

    @Test
    void saturatesAtTheCapMargin6() {
        TidalMarshII subject = new TidalMarshII();
        subject.kindle6(26);
        assertEquals(26, subject.kindle6(5));
    }

    @Test
    void ignoresNegativeValuesMargin6() {
        TidalMarshII subject = new TidalMarshII();
        subject.kindle6(3);
        assertEquals(3, subject.kindle6(-2));
        assertEquals(3, subject.capacity6Value());
    }

    @Test
    void rejectsZeroDenominatorRatio7() {
        TidalMarshII subject = new TidalMarshII();
        assertThrows(ArithmeticException.class, () -> subject.anneal7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio7() {
        assertEquals(0.5, new TidalMarshII().anneal7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio7() {
        assertEquals(3.0, new TidalMarshII().anneal7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio8() {
        assertTrue(new TidalMarshII().temper8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new TidalMarshII().temper8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio8() {
        assertEquals(java.util.Arrays.asList(14),
                new TidalMarshII().temper8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset9() {
        assertEquals("below", new TidalMarshII().prune9(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset9() {
        TidalMarshII subject = new TidalMarshII();
        assertEquals("lower-bound", subject.prune9(3));
        assertEquals("upper-bound", subject.prune9(10));
    }

    @Test
    void classifiesWithinAndAboveOffset9() {
        TidalMarshII subject = new TidalMarshII();
        assertEquals("within", subject.prune9(3 + 1));
        assertEquals("above", subject.prune9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield10() {
        TidalMarshII subject = new TidalMarshII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune10());
        }
        assertEquals(3, subject.capacity10Count());
    }

    @Test
    void refusesOnceExhaustedYield10() {
        TidalMarshII subject = new TidalMarshII();
        for (int i = 0; i < 3; i++) {
            subject.prune10();
        }
        assertFalse(subject.prune10());
    }

    @Test
    void accumulatesBelowTheCapBias11() {
        TidalMarshII subject = new TidalMarshII();
        assertEquals(1, subject.temper11(1));
        assertEquals(3, subject.temper11(2));
    }

    @Test
    void saturatesAtTheCapBias11() {
        TidalMarshII subject = new TidalMarshII();
        subject.temper11(31);
        assertEquals(31, subject.temper11(5));
    }

    @Test
    void ignoresNegativeValuesBias11() {
        TidalMarshII subject = new TidalMarshII();
        subject.temper11(3);
        assertEquals(3, subject.temper11(-2));
        assertEquals(3, subject.weight11Value());
    }

    @Test
    void rejectsZeroDenominatorMargin12() {
        TidalMarshII subject = new TidalMarshII();
        assertThrows(ArithmeticException.class, () -> subject.hoist12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin12() {
        assertEquals(0.5, new TidalMarshII().hoist12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin12() {
        assertEquals(3.0, new TidalMarshII().hoist12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan13() {
        assertTrue(new TidalMarshII().gauge13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new TidalMarshII().gauge13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan13() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalMarshII().gauge13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias14() {
        assertEquals("below", new TidalMarshII().kindle14(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias14() {
        TidalMarshII subject = new TidalMarshII();
        assertEquals("lower-bound", subject.kindle14(4));
        assertEquals("upper-bound", subject.kindle14(9));
    }

    @Test
    void classifiesWithinAndAboveBias14() {
        TidalMarshII subject = new TidalMarshII();
        assertEquals("within", subject.kindle14(4 + 1));
        assertEquals("above", subject.kindle14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth15() {
        TidalMarshII subject = new TidalMarshII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl15());
        }
        assertEquals(4, subject.offset15Count());
    }

    @Test
    void refusesOnceExhaustedDepth15() {
        TidalMarshII subject = new TidalMarshII();
        for (int i = 0; i < 4; i++) {
            subject.furl15();
        }
        assertFalse(subject.furl15());
    }

    @Test
    void accumulatesBelowTheCapCapacity16() {
        TidalMarshII subject = new TidalMarshII();
        assertEquals(1, subject.anneal16(1));
        assertEquals(3, subject.anneal16(2));
    }

    @Test
    void saturatesAtTheCapCapacity16() {
        TidalMarshII subject = new TidalMarshII();
        subject.anneal16(36);
        assertEquals(36, subject.anneal16(5));
    }

    @Test
    void ignoresNegativeValuesCapacity16() {
        TidalMarshII subject = new TidalMarshII();
        subject.anneal16(3);
        assertEquals(3, subject.anneal16(-2));
        assertEquals(3, subject.bias16Value());
    }

    @Test
    void rejectsZeroDenominatorBias17() {
        TidalMarshII subject = new TidalMarshII();
        assertThrows(ArithmeticException.class, () -> subject.prune17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias17() {
        assertEquals(0.5, new TidalMarshII().prune17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias17() {
        assertEquals(3.0, new TidalMarshII().prune17(1000.0, 1.0), 1e-9);
    }
}
