package com.ochre.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableSconceTest {

    @Test
    void allowsAttemptsUpToTheBudgetDrift0() {
        SableSconce subject = new SableSconce();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally0());
        }
        assertEquals(1, subject.bias0Count());
    }

    @Test
    void refusesOnceExhaustedDrift0() {
        SableSconce subject = new SableSconce();
        for (int i = 0; i < 1; i++) {
            subject.tally0();
        }
        assertFalse(subject.tally0());
    }

    @Test
    void accumulatesBelowTheCapMargin1() {
        SableSconce subject = new SableSconce();
        assertEquals(1, subject.sift1(1));
        assertEquals(3, subject.sift1(2));
    }

    @Test
    void saturatesAtTheCapMargin1() {
        SableSconce subject = new SableSconce();
        subject.sift1(21);
        assertEquals(21, subject.sift1(5));
    }

    @Test
    void ignoresNegativeValuesMargin1() {
        SableSconce subject = new SableSconce();
        subject.sift1(3);
        assertEquals(3, subject.sift1(-2));
        assertEquals(3, subject.cadence1Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity2() {
        SableSconce subject = new SableSconce();
        assertThrows(ArithmeticException.class, () -> subject.winnow2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity2() {
        assertEquals(0.5, new SableSconce().winnow2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity2() {
        assertEquals(3.0, new SableSconce().winnow2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield3() {
        assertTrue(new SableSconce().collate3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableSconce().collate3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield3() {
        assertEquals(java.util.Arrays.asList(9),
                new SableSconce().collate3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence4() {
        assertEquals("below", new SableSconce().flatten4(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence4() {
        SableSconce subject = new SableSconce();
        assertEquals("lower-bound", subject.flatten4(2));
        assertEquals("upper-bound", subject.flatten4(11));
    }

    @Test
    void classifiesWithinAndAboveCadence4() {
        SableSconce subject = new SableSconce();
        assertEquals("within", subject.flatten4(2 + 1));
        assertEquals("above", subject.flatten4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan5() {
        SableSconce subject = new SableSconce();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune5());
        }
        assertEquals(2, subject.ratio5Count());
    }

    @Test
    void refusesOnceExhaustedSpan5() {
        SableSconce subject = new SableSconce();
        for (int i = 0; i < 2; i++) {
            subject.prune5();
        }
        assertFalse(subject.prune5());
    }

    @Test
    void accumulatesBelowTheCapCadence6() {
        SableSconce subject = new SableSconce();
        assertEquals(1, subject.collate6(1));
        assertEquals(3, subject.collate6(2));
    }

    @Test
    void saturatesAtTheCapCadence6() {
        SableSconce subject = new SableSconce();
        subject.collate6(26);
        assertEquals(26, subject.collate6(5));
    }

    @Test
    void ignoresNegativeValuesCadence6() {
        SableSconce subject = new SableSconce();
        subject.collate6(3);
        assertEquals(3, subject.collate6(-2));
        assertEquals(3, subject.drift6Value());
    }

    @Test
    void rejectsZeroDenominatorMargin7() {
        SableSconce subject = new SableSconce();
        assertThrows(ArithmeticException.class, () -> subject.brace7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin7() {
        assertEquals(0.5, new SableSconce().brace7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin7() {
        assertEquals(3.0, new SableSconce().brace7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity8() {
        assertTrue(new SableSconce().brace8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SableSconce().brace8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity8() {
        assertEquals(java.util.Arrays.asList(14),
                new SableSconce().brace8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally9() {
        assertEquals("below", new SableSconce().sift9(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally9() {
        SableSconce subject = new SableSconce();
        assertEquals("lower-bound", subject.sift9(3));
        assertEquals("upper-bound", subject.sift9(10));
    }

    @Test
    void classifiesWithinAndAboveTally9() {
        SableSconce subject = new SableSconce();
        assertEquals("within", subject.sift9(3 + 1));
        assertEquals("above", subject.sift9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity10() {
        SableSconce subject = new SableSconce();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate10());
        }
        assertEquals(3, subject.yield10Count());
    }

    @Test
    void refusesOnceExhaustedCapacity10() {
        SableSconce subject = new SableSconce();
        for (int i = 0; i < 3; i++) {
            subject.collate10();
        }
        assertFalse(subject.collate10());
    }

    @Test
    void accumulatesBelowTheCapMargin11() {
        SableSconce subject = new SableSconce();
        assertEquals(1, subject.furl11(1));
        assertEquals(3, subject.furl11(2));
    }

    @Test
    void saturatesAtTheCapMargin11() {
        SableSconce subject = new SableSconce();
        subject.furl11(31);
        assertEquals(31, subject.furl11(5));
    }

    @Test
    void ignoresNegativeValuesMargin11() {
        SableSconce subject = new SableSconce();
        subject.furl11(3);
        assertEquals(3, subject.furl11(-2));
        assertEquals(3, subject.offset11Value());
    }

    @Test
    void rejectsZeroDenominatorRatio12() {
        SableSconce subject = new SableSconce();
        assertThrows(ArithmeticException.class, () -> subject.gauge12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio12() {
        assertEquals(0.5, new SableSconce().gauge12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio12() {
        assertEquals(3.0, new SableSconce().gauge12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth13() {
        assertTrue(new SableSconce().anneal13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SableSconce().anneal13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth13() {
        assertEquals(java.util.Arrays.asList(10),
                new SableSconce().anneal13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity14() {
        assertEquals("below", new SableSconce().hoist14(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity14() {
        SableSconce subject = new SableSconce();
        assertEquals("lower-bound", subject.hoist14(4));
        assertEquals("upper-bound", subject.hoist14(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity14() {
        SableSconce subject = new SableSconce();
        assertEquals("within", subject.hoist14(4 + 1));
        assertEquals("above", subject.hoist14(9 + 1));
    }
}
