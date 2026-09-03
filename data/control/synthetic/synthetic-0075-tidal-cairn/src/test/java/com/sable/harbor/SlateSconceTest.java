package com.sable.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateSconceTest {

    @Test
    void accumulatesBelowTheCapDepth0() {
        SlateSconce subject = new SlateSconce();
        assertEquals(1, subject.collate0(1));
        assertEquals(3, subject.collate0(2));
    }

    @Test
    void saturatesAtTheCapDepth0() {
        SlateSconce subject = new SlateSconce();
        subject.collate0(20);
        assertEquals(20, subject.collate0(5));
    }

    @Test
    void ignoresNegativeValuesDepth0() {
        SlateSconce subject = new SlateSconce();
        subject.collate0(3);
        assertEquals(3, subject.collate0(-2));
        assertEquals(3, subject.bias0Value());
    }

    @Test
    void rejectsZeroDenominatorMargin1() {
        SlateSconce subject = new SlateSconce();
        assertThrows(ArithmeticException.class, () -> subject.gauge1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin1() {
        assertEquals(0.5, new SlateSconce().gauge1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin1() {
        assertEquals(2.0, new SlateSconce().gauge1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally2() {
        assertTrue(new SlateSconce().kindle2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new SlateSconce().kindle2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally2() {
        assertEquals(java.util.Arrays.asList(8),
                new SlateSconce().kindle2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold3() {
        assertEquals("below", new SlateSconce().gauge3(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold3() {
        SlateSconce subject = new SlateSconce();
        assertEquals("lower-bound", subject.gauge3(5));
        assertEquals("upper-bound", subject.gauge3(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold3() {
        SlateSconce subject = new SlateSconce();
        assertEquals("within", subject.gauge3(5 + 1));
        assertEquals("above", subject.gauge3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity4() {
        SlateSconce subject = new SlateSconce();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper4());
        }
        assertEquals(1, subject.bias4Count());
    }

    @Test
    void refusesOnceExhaustedCapacity4() {
        SlateSconce subject = new SlateSconce();
        for (int i = 0; i < 1; i++) {
            subject.temper4();
        }
        assertFalse(subject.temper4());
    }

    @Test
    void accumulatesBelowTheCapBias5() {
        SlateSconce subject = new SlateSconce();
        assertEquals(1, subject.reconcile5(1));
        assertEquals(3, subject.reconcile5(2));
    }

    @Test
    void saturatesAtTheCapBias5() {
        SlateSconce subject = new SlateSconce();
        subject.reconcile5(25);
        assertEquals(25, subject.reconcile5(5));
    }

    @Test
    void ignoresNegativeValuesBias5() {
        SlateSconce subject = new SlateSconce();
        subject.reconcile5(3);
        assertEquals(3, subject.reconcile5(-2));
        assertEquals(3, subject.capacity5Value());
    }

    @Test
    void rejectsZeroDenominatorDepth6() {
        SlateSconce subject = new SlateSconce();
        assertThrows(ArithmeticException.class, () -> subject.gauge6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth6() {
        assertEquals(0.5, new SlateSconce().gauge6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth6() {
        assertEquals(2.0, new SlateSconce().gauge6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth7() {
        assertTrue(new SlateSconce().tally7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new SlateSconce().tally7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth7() {
        assertEquals(java.util.Arrays.asList(13),
                new SlateSconce().tally7(java.util.Arrays.asList(null, 13, null)));
    }
}
