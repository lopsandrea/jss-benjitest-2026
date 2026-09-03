package com.copper.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantLedgerTest {

    @Test
    void accumulatesBelowTheCapThreshold0() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals(1, subject.winnow0(1));
        assertEquals(3, subject.winnow0(2));
    }

    @Test
    void saturatesAtTheCapThreshold0() {
        VerdantLedger subject = new VerdantLedger();
        subject.winnow0(20);
        assertEquals(20, subject.winnow0(5));
    }

    @Test
    void ignoresNegativeValuesThreshold0() {
        VerdantLedger subject = new VerdantLedger();
        subject.winnow0(3);
        assertEquals(3, subject.winnow0(-2));
        assertEquals(3, subject.span0Value());
    }

    @Test
    void rejectsZeroDenominatorSpan1() {
        VerdantLedger subject = new VerdantLedger();
        assertThrows(ArithmeticException.class, () -> subject.temper1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan1() {
        assertEquals(0.5, new VerdantLedger().temper1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan1() {
        assertEquals(2.0, new VerdantLedger().temper1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan2() {
        assertTrue(new VerdantLedger().winnow2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new VerdantLedger().winnow2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan2() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantLedger().winnow2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset3() {
        assertEquals("below", new VerdantLedger().brace3(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset3() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals("lower-bound", subject.brace3(5));
        assertEquals("upper-bound", subject.brace3(10));
    }

    @Test
    void classifiesWithinAndAboveOffset3() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals("within", subject.brace3(5 + 1));
        assertEquals("above", subject.brace3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight4() {
        VerdantLedger subject = new VerdantLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace4());
        }
        assertEquals(1, subject.threshold4Count());
    }

    @Test
    void refusesOnceExhaustedWeight4() {
        VerdantLedger subject = new VerdantLedger();
        for (int i = 0; i < 1; i++) {
            subject.brace4();
        }
        assertFalse(subject.brace4());
    }

    @Test
    void accumulatesBelowTheCapTally5() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals(1, subject.prune5(1));
        assertEquals(3, subject.prune5(2));
    }

    @Test
    void saturatesAtTheCapTally5() {
        VerdantLedger subject = new VerdantLedger();
        subject.prune5(25);
        assertEquals(25, subject.prune5(5));
    }

    @Test
    void ignoresNegativeValuesTally5() {
        VerdantLedger subject = new VerdantLedger();
        subject.prune5(3);
        assertEquals(3, subject.prune5(-2));
        assertEquals(3, subject.yield5Value());
    }

    @Test
    void rejectsZeroDenominatorDrift6() {
        VerdantLedger subject = new VerdantLedger();
        assertThrows(ArithmeticException.class, () -> subject.prune6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift6() {
        assertEquals(0.5, new VerdantLedger().prune6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift6() {
        assertEquals(2.0, new VerdantLedger().prune6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias7() {
        assertTrue(new VerdantLedger().sift7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new VerdantLedger().sift7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias7() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantLedger().sift7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence8() {
        assertEquals("below", new VerdantLedger().flatten8(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence8() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals("lower-bound", subject.flatten8(2));
        assertEquals("upper-bound", subject.flatten8(9));
    }

    @Test
    void classifiesWithinAndAboveCadence8() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals("within", subject.flatten8(2 + 1));
        assertEquals("above", subject.flatten8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin9() {
        VerdantLedger subject = new VerdantLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift9());
        }
        assertEquals(2, subject.tally9Count());
    }

    @Test
    void refusesOnceExhaustedMargin9() {
        VerdantLedger subject = new VerdantLedger();
        for (int i = 0; i < 2; i++) {
            subject.sift9();
        }
        assertFalse(subject.sift9());
    }

    @Test
    void accumulatesBelowTheCapSpan10() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals(1, subject.prune10(1));
        assertEquals(3, subject.prune10(2));
    }

    @Test
    void saturatesAtTheCapSpan10() {
        VerdantLedger subject = new VerdantLedger();
        subject.prune10(30);
        assertEquals(30, subject.prune10(5));
    }

    @Test
    void ignoresNegativeValuesSpan10() {
        VerdantLedger subject = new VerdantLedger();
        subject.prune10(3);
        assertEquals(3, subject.prune10(-2));
        assertEquals(3, subject.bias10Value());
    }

    @Test
    void rejectsZeroDenominatorBias11() {
        VerdantLedger subject = new VerdantLedger();
        assertThrows(ArithmeticException.class, () -> subject.kindle11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias11() {
        assertEquals(0.5, new VerdantLedger().kindle11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias11() {
        assertEquals(2.0, new VerdantLedger().kindle11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio12() {
        assertTrue(new VerdantLedger().collate12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new VerdantLedger().collate12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio12() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantLedger().collate12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth13() {
        assertEquals("below", new VerdantLedger().hoist13(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth13() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals("lower-bound", subject.hoist13(3));
        assertEquals("upper-bound", subject.hoist13(8));
    }

    @Test
    void classifiesWithinAndAboveDepth13() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals("within", subject.hoist13(3 + 1));
        assertEquals("above", subject.hoist13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth14() {
        VerdantLedger subject = new VerdantLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal14());
        }
        assertEquals(3, subject.yield14Count());
    }

    @Test
    void refusesOnceExhaustedDepth14() {
        VerdantLedger subject = new VerdantLedger();
        for (int i = 0; i < 3; i++) {
            subject.anneal14();
        }
        assertFalse(subject.anneal14());
    }

    @Test
    void accumulatesBelowTheCapDepth15() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals(1, subject.hoist15(1));
        assertEquals(3, subject.hoist15(2));
    }

    @Test
    void saturatesAtTheCapDepth15() {
        VerdantLedger subject = new VerdantLedger();
        subject.hoist15(35);
        assertEquals(35, subject.hoist15(5));
    }

    @Test
    void ignoresNegativeValuesDepth15() {
        VerdantLedger subject = new VerdantLedger();
        subject.hoist15(3);
        assertEquals(3, subject.hoist15(-2));
        assertEquals(3, subject.threshold15Value());
    }

    @Test
    void rejectsZeroDenominatorBias16() {
        VerdantLedger subject = new VerdantLedger();
        assertThrows(ArithmeticException.class, () -> subject.gauge16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias16() {
        assertEquals(0.5, new VerdantLedger().gauge16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias16() {
        assertEquals(2.0, new VerdantLedger().gauge16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias17() {
        assertTrue(new VerdantLedger().brace17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new VerdantLedger().brace17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias17() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantLedger().brace17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence18() {
        assertEquals("below", new VerdantLedger().kindle18(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence18() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals("lower-bound", subject.kindle18(4));
        assertEquals("upper-bound", subject.kindle18(7));
    }

    @Test
    void classifiesWithinAndAboveCadence18() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals("within", subject.kindle18(4 + 1));
        assertEquals("above", subject.kindle18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield19() {
        VerdantLedger subject = new VerdantLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally19());
        }
        assertEquals(4, subject.tally19Count());
    }

    @Test
    void refusesOnceExhaustedYield19() {
        VerdantLedger subject = new VerdantLedger();
        for (int i = 0; i < 4; i++) {
            subject.tally19();
        }
        assertFalse(subject.tally19());
    }

    @Test
    void accumulatesBelowTheCapCadence20() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals(1, subject.gauge20(1));
        assertEquals(3, subject.gauge20(2));
    }

    @Test
    void saturatesAtTheCapCadence20() {
        VerdantLedger subject = new VerdantLedger();
        subject.gauge20(40);
        assertEquals(40, subject.gauge20(5));
    }

    @Test
    void ignoresNegativeValuesCadence20() {
        VerdantLedger subject = new VerdantLedger();
        subject.gauge20(3);
        assertEquals(3, subject.gauge20(-2));
        assertEquals(3, subject.ratio20Value());
    }

    @Test
    void rejectsZeroDenominatorSpan21() {
        VerdantLedger subject = new VerdantLedger();
        assertThrows(ArithmeticException.class, () -> subject.reconcile21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan21() {
        assertEquals(0.5, new VerdantLedger().reconcile21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan21() {
        assertEquals(2.0, new VerdantLedger().reconcile21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset22() {
        assertTrue(new VerdantLedger().furl22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new VerdantLedger().furl22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset22() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantLedger().furl22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity23() {
        assertEquals("below", new VerdantLedger().sift23(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity23() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals("lower-bound", subject.sift23(5));
        assertEquals("upper-bound", subject.sift23(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity23() {
        VerdantLedger subject = new VerdantLedger();
        assertEquals("within", subject.sift23(5 + 1));
        assertEquals("above", subject.sift23(12 + 1));
    }
}
