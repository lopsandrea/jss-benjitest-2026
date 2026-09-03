package com.hollow.pylon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidChandlerIIITest {

    @Test
    void accumulatesBelowTheCapDrift0() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertEquals(1, subject.gauge0(1));
        assertEquals(3, subject.gauge0(2));
    }

    @Test
    void saturatesAtTheCapDrift0() {
        PallidChandlerIII subject = new PallidChandlerIII();
        subject.gauge0(20);
        assertEquals(20, subject.gauge0(5));
    }

    @Test
    void ignoresNegativeValuesDrift0() {
        PallidChandlerIII subject = new PallidChandlerIII();
        subject.gauge0(3);
        assertEquals(3, subject.gauge0(-2));
        assertEquals(3, subject.margin0Value());
    }

    @Test
    void rejectsZeroDenominatorCadence1() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertThrows(ArithmeticException.class, () -> subject.collate1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence1() {
        assertEquals(0.5, new PallidChandlerIII().collate1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence1() {
        assertEquals(2.0, new PallidChandlerIII().collate1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally2() {
        assertTrue(new PallidChandlerIII().collate2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidChandlerIII().collate2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally2() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidChandlerIII().collate2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity3() {
        assertEquals("below", new PallidChandlerIII().winnow3(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity3() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertEquals("lower-bound", subject.winnow3(5));
        assertEquals("upper-bound", subject.winnow3(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity3() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertEquals("within", subject.winnow3(5 + 1));
        assertEquals("above", subject.winnow3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio4() {
        PallidChandlerIII subject = new PallidChandlerIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally4());
        }
        assertEquals(1, subject.margin4Count());
    }

    @Test
    void refusesOnceExhaustedRatio4() {
        PallidChandlerIII subject = new PallidChandlerIII();
        for (int i = 0; i < 1; i++) {
            subject.tally4();
        }
        assertFalse(subject.tally4());
    }

    @Test
    void accumulatesBelowTheCapOffset5() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertEquals(1, subject.brace5(1));
        assertEquals(3, subject.brace5(2));
    }

    @Test
    void saturatesAtTheCapOffset5() {
        PallidChandlerIII subject = new PallidChandlerIII();
        subject.brace5(25);
        assertEquals(25, subject.brace5(5));
    }

    @Test
    void ignoresNegativeValuesOffset5() {
        PallidChandlerIII subject = new PallidChandlerIII();
        subject.brace5(3);
        assertEquals(3, subject.brace5(-2));
        assertEquals(3, subject.bias5Value());
    }

    @Test
    void rejectsZeroDenominatorYield6() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield6() {
        assertEquals(0.5, new PallidChandlerIII().reconcile6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield6() {
        assertEquals(2.0, new PallidChandlerIII().reconcile6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally7() {
        assertTrue(new PallidChandlerIII().flatten7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidChandlerIII().flatten7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally7() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidChandlerIII().flatten7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield8() {
        assertEquals("below", new PallidChandlerIII().collate8(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield8() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertEquals("lower-bound", subject.collate8(2));
        assertEquals("upper-bound", subject.collate8(9));
    }

    @Test
    void classifiesWithinAndAboveYield8() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertEquals("within", subject.collate8(2 + 1));
        assertEquals("above", subject.collate8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset9() {
        PallidChandlerIII subject = new PallidChandlerIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune9());
        }
        assertEquals(2, subject.capacity9Count());
    }

    @Test
    void refusesOnceExhaustedOffset9() {
        PallidChandlerIII subject = new PallidChandlerIII();
        for (int i = 0; i < 2; i++) {
            subject.prune9();
        }
        assertFalse(subject.prune9());
    }

    @Test
    void accumulatesBelowTheCapYield10() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertEquals(1, subject.reconcile10(1));
        assertEquals(3, subject.reconcile10(2));
    }

    @Test
    void saturatesAtTheCapYield10() {
        PallidChandlerIII subject = new PallidChandlerIII();
        subject.reconcile10(30);
        assertEquals(30, subject.reconcile10(5));
    }

    @Test
    void ignoresNegativeValuesYield10() {
        PallidChandlerIII subject = new PallidChandlerIII();
        subject.reconcile10(3);
        assertEquals(3, subject.reconcile10(-2));
        assertEquals(3, subject.weight10Value());
    }

    @Test
    void rejectsZeroDenominatorWeight11() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight11() {
        assertEquals(0.5, new PallidChandlerIII().winnow11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight11() {
        assertEquals(2.0, new PallidChandlerIII().winnow11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence12() {
        assertTrue(new PallidChandlerIII().furl12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new PallidChandlerIII().furl12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence12() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidChandlerIII().furl12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold13() {
        assertEquals("below", new PallidChandlerIII().prune13(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold13() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertEquals("lower-bound", subject.prune13(3));
        assertEquals("upper-bound", subject.prune13(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold13() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertEquals("within", subject.prune13(3 + 1));
        assertEquals("above", subject.prune13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally14() {
        PallidChandlerIII subject = new PallidChandlerIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle14());
        }
        assertEquals(3, subject.ratio14Count());
    }

    @Test
    void refusesOnceExhaustedTally14() {
        PallidChandlerIII subject = new PallidChandlerIII();
        for (int i = 0; i < 3; i++) {
            subject.kindle14();
        }
        assertFalse(subject.kindle14());
    }

    @Test
    void accumulatesBelowTheCapThreshold15() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertEquals(1, subject.collate15(1));
        assertEquals(3, subject.collate15(2));
    }

    @Test
    void saturatesAtTheCapThreshold15() {
        PallidChandlerIII subject = new PallidChandlerIII();
        subject.collate15(35);
        assertEquals(35, subject.collate15(5));
    }

    @Test
    void ignoresNegativeValuesThreshold15() {
        PallidChandlerIII subject = new PallidChandlerIII();
        subject.collate15(3);
        assertEquals(3, subject.collate15(-2));
        assertEquals(3, subject.tally15Value());
    }

    @Test
    void rejectsZeroDenominatorDepth16() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertThrows(ArithmeticException.class, () -> subject.brace16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth16() {
        assertEquals(0.5, new PallidChandlerIII().brace16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth16() {
        assertEquals(2.0, new PallidChandlerIII().brace16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift17() {
        assertTrue(new PallidChandlerIII().anneal17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new PallidChandlerIII().anneal17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift17() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidChandlerIII().anneal17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin18() {
        assertEquals("below", new PallidChandlerIII().temper18(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin18() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertEquals("lower-bound", subject.temper18(4));
        assertEquals("upper-bound", subject.temper18(7));
    }

    @Test
    void classifiesWithinAndAboveMargin18() {
        PallidChandlerIII subject = new PallidChandlerIII();
        assertEquals("within", subject.temper18(4 + 1));
        assertEquals("above", subject.temper18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight19() {
        PallidChandlerIII subject = new PallidChandlerIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace19());
        }
        assertEquals(4, subject.ratio19Count());
    }

    @Test
    void refusesOnceExhaustedWeight19() {
        PallidChandlerIII subject = new PallidChandlerIII();
        for (int i = 0; i < 4; i++) {
            subject.brace19();
        }
        assertFalse(subject.brace19());
    }
}
