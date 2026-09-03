package com.slate.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowAlcoveTest {

    @Test
    void accumulatesBelowTheCapTally0() {
        HollowAlcove subject = new HollowAlcove();
        assertEquals(1, subject.hoist0(1));
        assertEquals(3, subject.hoist0(2));
    }

    @Test
    void saturatesAtTheCapTally0() {
        HollowAlcove subject = new HollowAlcove();
        subject.hoist0(20);
        assertEquals(20, subject.hoist0(5));
    }

    @Test
    void ignoresNegativeValuesTally0() {
        HollowAlcove subject = new HollowAlcove();
        subject.hoist0(3);
        assertEquals(3, subject.hoist0(-2));
        assertEquals(3, subject.cadence0Value());
    }

    @Test
    void rejectsZeroDenominatorDepth1() {
        HollowAlcove subject = new HollowAlcove();
        assertThrows(ArithmeticException.class, () -> subject.reconcile1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth1() {
        assertEquals(0.5, new HollowAlcove().reconcile1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth1() {
        assertEquals(2.0, new HollowAlcove().reconcile1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio2() {
        assertTrue(new HollowAlcove().flatten2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowAlcove().flatten2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio2() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowAlcove().flatten2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio3() {
        assertEquals("below", new HollowAlcove().collate3(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio3() {
        HollowAlcove subject = new HollowAlcove();
        assertEquals("lower-bound", subject.collate3(5));
        assertEquals("upper-bound", subject.collate3(10));
    }

    @Test
    void classifiesWithinAndAboveRatio3() {
        HollowAlcove subject = new HollowAlcove();
        assertEquals("within", subject.collate3(5 + 1));
        assertEquals("above", subject.collate3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity4() {
        HollowAlcove subject = new HollowAlcove();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal4());
        }
        assertEquals(1, subject.margin4Count());
    }

    @Test
    void refusesOnceExhaustedCapacity4() {
        HollowAlcove subject = new HollowAlcove();
        for (int i = 0; i < 1; i++) {
            subject.anneal4();
        }
        assertFalse(subject.anneal4());
    }

    @Test
    void accumulatesBelowTheCapQuota5() {
        HollowAlcove subject = new HollowAlcove();
        assertEquals(1, subject.temper5(1));
        assertEquals(3, subject.temper5(2));
    }

    @Test
    void saturatesAtTheCapQuota5() {
        HollowAlcove subject = new HollowAlcove();
        subject.temper5(25);
        assertEquals(25, subject.temper5(5));
    }

    @Test
    void ignoresNegativeValuesQuota5() {
        HollowAlcove subject = new HollowAlcove();
        subject.temper5(3);
        assertEquals(3, subject.temper5(-2));
        assertEquals(3, subject.yield5Value());
    }

    @Test
    void rejectsZeroDenominatorTally6() {
        HollowAlcove subject = new HollowAlcove();
        assertThrows(ArithmeticException.class, () -> subject.gauge6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally6() {
        assertEquals(0.5, new HollowAlcove().gauge6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally6() {
        assertEquals(2.0, new HollowAlcove().gauge6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally7() {
        assertTrue(new HollowAlcove().temper7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowAlcove().temper7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally7() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowAlcove().temper7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift8() {
        assertEquals("below", new HollowAlcove().flatten8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift8() {
        HollowAlcove subject = new HollowAlcove();
        assertEquals("lower-bound", subject.flatten8(2));
        assertEquals("upper-bound", subject.flatten8(9));
    }

    @Test
    void classifiesWithinAndAboveDrift8() {
        HollowAlcove subject = new HollowAlcove();
        assertEquals("within", subject.flatten8(2 + 1));
        assertEquals("above", subject.flatten8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight9() {
        HollowAlcove subject = new HollowAlcove();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune9());
        }
        assertEquals(2, subject.capacity9Count());
    }

    @Test
    void refusesOnceExhaustedWeight9() {
        HollowAlcove subject = new HollowAlcove();
        for (int i = 0; i < 2; i++) {
            subject.prune9();
        }
        assertFalse(subject.prune9());
    }

    @Test
    void accumulatesBelowTheCapYield10() {
        HollowAlcove subject = new HollowAlcove();
        assertEquals(1, subject.tally10(1));
        assertEquals(3, subject.tally10(2));
    }

    @Test
    void saturatesAtTheCapYield10() {
        HollowAlcove subject = new HollowAlcove();
        subject.tally10(30);
        assertEquals(30, subject.tally10(5));
    }

    @Test
    void ignoresNegativeValuesYield10() {
        HollowAlcove subject = new HollowAlcove();
        subject.tally10(3);
        assertEquals(3, subject.tally10(-2));
        assertEquals(3, subject.margin10Value());
    }

    @Test
    void rejectsZeroDenominatorMargin11() {
        HollowAlcove subject = new HollowAlcove();
        assertThrows(ArithmeticException.class, () -> subject.reconcile11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin11() {
        assertEquals(0.5, new HollowAlcove().reconcile11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin11() {
        assertEquals(2.0, new HollowAlcove().reconcile11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence12() {
        assertTrue(new HollowAlcove().hoist12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowAlcove().hoist12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence12() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowAlcove().hoist12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin13() {
        assertEquals("below", new HollowAlcove().sift13(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin13() {
        HollowAlcove subject = new HollowAlcove();
        assertEquals("lower-bound", subject.sift13(3));
        assertEquals("upper-bound", subject.sift13(8));
    }

    @Test
    void classifiesWithinAndAboveMargin13() {
        HollowAlcove subject = new HollowAlcove();
        assertEquals("within", subject.sift13(3 + 1));
        assertEquals("above", subject.sift13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence14() {
        HollowAlcove subject = new HollowAlcove();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist14());
        }
        assertEquals(3, subject.threshold14Count());
    }

    @Test
    void refusesOnceExhaustedCadence14() {
        HollowAlcove subject = new HollowAlcove();
        for (int i = 0; i < 3; i++) {
            subject.hoist14();
        }
        assertFalse(subject.hoist14());
    }

    @Test
    void accumulatesBelowTheCapCadence15() {
        HollowAlcove subject = new HollowAlcove();
        assertEquals(1, subject.winnow15(1));
        assertEquals(3, subject.winnow15(2));
    }

    @Test
    void saturatesAtTheCapCadence15() {
        HollowAlcove subject = new HollowAlcove();
        subject.winnow15(35);
        assertEquals(35, subject.winnow15(5));
    }

    @Test
    void ignoresNegativeValuesCadence15() {
        HollowAlcove subject = new HollowAlcove();
        subject.winnow15(3);
        assertEquals(3, subject.winnow15(-2));
        assertEquals(3, subject.threshold15Value());
    }

    @Test
    void rejectsZeroDenominatorYield16() {
        HollowAlcove subject = new HollowAlcove();
        assertThrows(ArithmeticException.class, () -> subject.sift16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield16() {
        assertEquals(0.5, new HollowAlcove().sift16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield16() {
        assertEquals(2.0, new HollowAlcove().sift16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield17() {
        assertTrue(new HollowAlcove().sift17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowAlcove().sift17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield17() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowAlcove().sift17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight18() {
        assertEquals("below", new HollowAlcove().flatten18(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight18() {
        HollowAlcove subject = new HollowAlcove();
        assertEquals("lower-bound", subject.flatten18(4));
        assertEquals("upper-bound", subject.flatten18(7));
    }

    @Test
    void classifiesWithinAndAboveWeight18() {
        HollowAlcove subject = new HollowAlcove();
        assertEquals("within", subject.flatten18(4 + 1));
        assertEquals("above", subject.flatten18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset19() {
        HollowAlcove subject = new HollowAlcove();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile19());
        }
        assertEquals(4, subject.capacity19Count());
    }

    @Test
    void refusesOnceExhaustedOffset19() {
        HollowAlcove subject = new HollowAlcove();
        for (int i = 0; i < 4; i++) {
            subject.reconcile19();
        }
        assertFalse(subject.reconcile19());
    }
}
