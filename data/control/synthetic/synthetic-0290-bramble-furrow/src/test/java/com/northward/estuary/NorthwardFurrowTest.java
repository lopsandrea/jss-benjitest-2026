package com.northward.estuary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardFurrowTest {

    @Test
    void accumulatesBelowTheCapDrift0() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertEquals(1, subject.winnow0(1));
        assertEquals(3, subject.winnow0(2));
    }

    @Test
    void saturatesAtTheCapDrift0() {
        NorthwardFurrow subject = new NorthwardFurrow();
        subject.winnow0(20);
        assertEquals(20, subject.winnow0(5));
    }

    @Test
    void ignoresNegativeValuesDrift0() {
        NorthwardFurrow subject = new NorthwardFurrow();
        subject.winnow0(3);
        assertEquals(3, subject.winnow0(-2));
        assertEquals(3, subject.threshold0Value());
    }

    @Test
    void rejectsZeroDenominatorSpan1() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertThrows(ArithmeticException.class, () -> subject.reconcile1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan1() {
        assertEquals(0.5, new NorthwardFurrow().reconcile1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan1() {
        assertEquals(2.0, new NorthwardFurrow().reconcile1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity2() {
        assertTrue(new NorthwardFurrow().hoist2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new NorthwardFurrow().hoist2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity2() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardFurrow().hoist2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight3() {
        assertEquals("below", new NorthwardFurrow().tally3(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight3() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertEquals("lower-bound", subject.tally3(5));
        assertEquals("upper-bound", subject.tally3(10));
    }

    @Test
    void classifiesWithinAndAboveWeight3() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertEquals("within", subject.tally3(5 + 1));
        assertEquals("above", subject.tally3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity4() {
        NorthwardFurrow subject = new NorthwardFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle4());
        }
        assertEquals(1, subject.drift4Count());
    }

    @Test
    void refusesOnceExhaustedCapacity4() {
        NorthwardFurrow subject = new NorthwardFurrow();
        for (int i = 0; i < 1; i++) {
            subject.kindle4();
        }
        assertFalse(subject.kindle4());
    }

    @Test
    void accumulatesBelowTheCapOffset5() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertEquals(1, subject.sift5(1));
        assertEquals(3, subject.sift5(2));
    }

    @Test
    void saturatesAtTheCapOffset5() {
        NorthwardFurrow subject = new NorthwardFurrow();
        subject.sift5(25);
        assertEquals(25, subject.sift5(5));
    }

    @Test
    void ignoresNegativeValuesOffset5() {
        NorthwardFurrow subject = new NorthwardFurrow();
        subject.sift5(3);
        assertEquals(3, subject.sift5(-2));
        assertEquals(3, subject.tally5Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity6() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertThrows(ArithmeticException.class, () -> subject.tally6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity6() {
        assertEquals(0.5, new NorthwardFurrow().tally6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity6() {
        assertEquals(2.0, new NorthwardFurrow().tally6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth7() {
        assertTrue(new NorthwardFurrow().winnow7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new NorthwardFurrow().winnow7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth7() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardFurrow().winnow7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally8() {
        assertEquals("below", new NorthwardFurrow().reconcile8(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally8() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertEquals("lower-bound", subject.reconcile8(2));
        assertEquals("upper-bound", subject.reconcile8(9));
    }

    @Test
    void classifiesWithinAndAboveTally8() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertEquals("within", subject.reconcile8(2 + 1));
        assertEquals("above", subject.reconcile8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias9() {
        NorthwardFurrow subject = new NorthwardFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile9());
        }
        assertEquals(2, subject.quota9Count());
    }

    @Test
    void refusesOnceExhaustedBias9() {
        NorthwardFurrow subject = new NorthwardFurrow();
        for (int i = 0; i < 2; i++) {
            subject.reconcile9();
        }
        assertFalse(subject.reconcile9());
    }

    @Test
    void accumulatesBelowTheCapSpan10() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertEquals(1, subject.prune10(1));
        assertEquals(3, subject.prune10(2));
    }

    @Test
    void saturatesAtTheCapSpan10() {
        NorthwardFurrow subject = new NorthwardFurrow();
        subject.prune10(30);
        assertEquals(30, subject.prune10(5));
    }

    @Test
    void ignoresNegativeValuesSpan10() {
        NorthwardFurrow subject = new NorthwardFurrow();
        subject.prune10(3);
        assertEquals(3, subject.prune10(-2));
        assertEquals(3, subject.drift10Value());
    }

    @Test
    void rejectsZeroDenominatorYield11() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertThrows(ArithmeticException.class, () -> subject.tally11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield11() {
        assertEquals(0.5, new NorthwardFurrow().tally11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield11() {
        assertEquals(2.0, new NorthwardFurrow().tally11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias12() {
        assertTrue(new NorthwardFurrow().collate12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new NorthwardFurrow().collate12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias12() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardFurrow().collate12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight13() {
        assertEquals("below", new NorthwardFurrow().anneal13(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight13() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertEquals("lower-bound", subject.anneal13(3));
        assertEquals("upper-bound", subject.anneal13(8));
    }

    @Test
    void classifiesWithinAndAboveWeight13() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertEquals("within", subject.anneal13(3 + 1));
        assertEquals("above", subject.anneal13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity14() {
        NorthwardFurrow subject = new NorthwardFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle14());
        }
        assertEquals(3, subject.quota14Count());
    }

    @Test
    void refusesOnceExhaustedCapacity14() {
        NorthwardFurrow subject = new NorthwardFurrow();
        for (int i = 0; i < 3; i++) {
            subject.kindle14();
        }
        assertFalse(subject.kindle14());
    }

    @Test
    void accumulatesBelowTheCapDrift15() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertEquals(1, subject.gauge15(1));
        assertEquals(3, subject.gauge15(2));
    }

    @Test
    void saturatesAtTheCapDrift15() {
        NorthwardFurrow subject = new NorthwardFurrow();
        subject.gauge15(35);
        assertEquals(35, subject.gauge15(5));
    }

    @Test
    void ignoresNegativeValuesDrift15() {
        NorthwardFurrow subject = new NorthwardFurrow();
        subject.gauge15(3);
        assertEquals(3, subject.gauge15(-2));
        assertEquals(3, subject.depth15Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity16() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertThrows(ArithmeticException.class, () -> subject.kindle16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity16() {
        assertEquals(0.5, new NorthwardFurrow().kindle16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity16() {
        assertEquals(2.0, new NorthwardFurrow().kindle16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota17() {
        assertTrue(new NorthwardFurrow().kindle17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new NorthwardFurrow().kindle17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota17() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardFurrow().kindle17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield18() {
        assertEquals("below", new NorthwardFurrow().brace18(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield18() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertEquals("lower-bound", subject.brace18(4));
        assertEquals("upper-bound", subject.brace18(7));
    }

    @Test
    void classifiesWithinAndAboveYield18() {
        NorthwardFurrow subject = new NorthwardFurrow();
        assertEquals("within", subject.brace18(4 + 1));
        assertEquals("above", subject.brace18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence19() {
        NorthwardFurrow subject = new NorthwardFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally19());
        }
        assertEquals(4, subject.margin19Count());
    }

    @Test
    void refusesOnceExhaustedCadence19() {
        NorthwardFurrow subject = new NorthwardFurrow();
        for (int i = 0; i < 4; i++) {
            subject.tally19();
        }
        assertFalse(subject.tally19());
    }
}
