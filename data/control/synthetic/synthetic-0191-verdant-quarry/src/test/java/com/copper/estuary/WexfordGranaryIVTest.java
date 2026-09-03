package com.copper.estuary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordGranaryIVTest {

    @Test
    void rejectsZeroDenominatorOffset0() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertThrows(ArithmeticException.class, () -> subject.winnow0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset0() {
        assertEquals(0.5, new WexfordGranaryIV().winnow0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset0() {
        assertEquals(1.0, new WexfordGranaryIV().winnow0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight1() {
        assertTrue(new WexfordGranaryIV().prune1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new WexfordGranaryIV().prune1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight1() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordGranaryIV().prune1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan2() {
        assertEquals("below", new WexfordGranaryIV().prune2(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan2() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("lower-bound", subject.prune2(4));
        assertEquals("upper-bound", subject.prune2(9));
    }

    @Test
    void classifiesWithinAndAboveSpan2() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("within", subject.prune2(4 + 1));
        assertEquals("above", subject.prune2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota3() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge3());
        }
        assertEquals(4, subject.capacity3Count());
    }

    @Test
    void refusesOnceExhaustedQuota3() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        for (int i = 0; i < 4; i++) {
            subject.gauge3();
        }
        assertFalse(subject.gauge3());
    }

    @Test
    void accumulatesBelowTheCapSpan4() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals(1, subject.tally4(1));
        assertEquals(3, subject.tally4(2));
    }

    @Test
    void saturatesAtTheCapSpan4() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        subject.tally4(24);
        assertEquals(24, subject.tally4(5));
    }

    @Test
    void ignoresNegativeValuesSpan4() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        subject.tally4(3);
        assertEquals(3, subject.tally4(-2));
        assertEquals(3, subject.capacity4Value());
    }

    @Test
    void rejectsZeroDenominatorMargin5() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertThrows(ArithmeticException.class, () -> subject.collate5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin5() {
        assertEquals(0.5, new WexfordGranaryIV().collate5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin5() {
        assertEquals(1.0, new WexfordGranaryIV().collate5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio6() {
        assertTrue(new WexfordGranaryIV().sift6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new WexfordGranaryIV().sift6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio6() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordGranaryIV().sift6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight7() {
        assertEquals("below", new WexfordGranaryIV().gauge7(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight7() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("lower-bound", subject.gauge7(5));
        assertEquals("upper-bound", subject.gauge7(8));
    }

    @Test
    void classifiesWithinAndAboveWeight7() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("within", subject.gauge7(5 + 1));
        assertEquals("above", subject.gauge7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio8() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal8());
        }
        assertEquals(1, subject.tally8Count());
    }

    @Test
    void refusesOnceExhaustedRatio8() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        for (int i = 0; i < 1; i++) {
            subject.anneal8();
        }
        assertFalse(subject.anneal8());
    }

    @Test
    void accumulatesBelowTheCapDrift9() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals(1, subject.reconcile9(1));
        assertEquals(3, subject.reconcile9(2));
    }

    @Test
    void saturatesAtTheCapDrift9() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        subject.reconcile9(29);
        assertEquals(29, subject.reconcile9(5));
    }

    @Test
    void ignoresNegativeValuesDrift9() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        subject.reconcile9(3);
        assertEquals(3, subject.reconcile9(-2));
        assertEquals(3, subject.margin9Value());
    }

    @Test
    void rejectsZeroDenominatorDepth10() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertThrows(ArithmeticException.class, () -> subject.anneal10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth10() {
        assertEquals(0.5, new WexfordGranaryIV().anneal10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth10() {
        assertEquals(1.0, new WexfordGranaryIV().anneal10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight11() {
        assertTrue(new WexfordGranaryIV().kindle11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new WexfordGranaryIV().kindle11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight11() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordGranaryIV().kindle11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold12() {
        assertEquals("below", new WexfordGranaryIV().brace12(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold12() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("lower-bound", subject.brace12(2));
        assertEquals("upper-bound", subject.brace12(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold12() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("within", subject.brace12(2 + 1));
        assertEquals("above", subject.brace12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield13() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate13());
        }
        assertEquals(2, subject.capacity13Count());
    }

    @Test
    void refusesOnceExhaustedYield13() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        for (int i = 0; i < 2; i++) {
            subject.collate13();
        }
        assertFalse(subject.collate13());
    }

    @Test
    void accumulatesBelowTheCapDrift14() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals(1, subject.anneal14(1));
        assertEquals(3, subject.anneal14(2));
    }

    @Test
    void saturatesAtTheCapDrift14() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        subject.anneal14(34);
        assertEquals(34, subject.anneal14(5));
    }

    @Test
    void ignoresNegativeValuesDrift14() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        subject.anneal14(3);
        assertEquals(3, subject.anneal14(-2));
        assertEquals(3, subject.yield14Value());
    }

    @Test
    void rejectsZeroDenominatorDrift15() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertThrows(ArithmeticException.class, () -> subject.hoist15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift15() {
        assertEquals(0.5, new WexfordGranaryIV().hoist15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift15() {
        assertEquals(1.0, new WexfordGranaryIV().hoist15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota16() {
        assertTrue(new WexfordGranaryIV().reconcile16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new WexfordGranaryIV().reconcile16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota16() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordGranaryIV().reconcile16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth17() {
        assertEquals("below", new WexfordGranaryIV().prune17(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth17() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("lower-bound", subject.prune17(3));
        assertEquals("upper-bound", subject.prune17(12));
    }

    @Test
    void classifiesWithinAndAboveDepth17() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("within", subject.prune17(3 + 1));
        assertEquals("above", subject.prune17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota18() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist18());
        }
        assertEquals(3, subject.bias18Count());
    }

    @Test
    void refusesOnceExhaustedQuota18() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        for (int i = 0; i < 3; i++) {
            subject.hoist18();
        }
        assertFalse(subject.hoist18());
    }

    @Test
    void accumulatesBelowTheCapMargin19() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals(1, subject.gauge19(1));
        assertEquals(3, subject.gauge19(2));
    }

    @Test
    void saturatesAtTheCapMargin19() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        subject.gauge19(39);
        assertEquals(39, subject.gauge19(5));
    }

    @Test
    void ignoresNegativeValuesMargin19() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        subject.gauge19(3);
        assertEquals(3, subject.gauge19(-2));
        assertEquals(3, subject.weight19Value());
    }

    @Test
    void rejectsZeroDenominatorRatio20() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertThrows(ArithmeticException.class, () -> subject.winnow20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio20() {
        assertEquals(0.5, new WexfordGranaryIV().winnow20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio20() {
        assertEquals(1.0, new WexfordGranaryIV().winnow20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan21() {
        assertTrue(new WexfordGranaryIV().flatten21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new WexfordGranaryIV().flatten21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan21() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordGranaryIV().flatten21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold22() {
        assertEquals("below", new WexfordGranaryIV().winnow22(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold22() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("lower-bound", subject.winnow22(4));
        assertEquals("upper-bound", subject.winnow22(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold22() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("within", subject.winnow22(4 + 1));
        assertEquals("above", subject.winnow22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth23() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate23());
        }
        assertEquals(4, subject.threshold23Count());
    }

    @Test
    void refusesOnceExhaustedDepth23() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        for (int i = 0; i < 4; i++) {
            subject.collate23();
        }
        assertFalse(subject.collate23());
    }

    @Test
    void accumulatesBelowTheCapYield24() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals(1, subject.collate24(1));
        assertEquals(3, subject.collate24(2));
    }

    @Test
    void saturatesAtTheCapYield24() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        subject.collate24(44);
        assertEquals(44, subject.collate24(5));
    }

    @Test
    void ignoresNegativeValuesYield24() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        subject.collate24(3);
        assertEquals(3, subject.collate24(-2));
        assertEquals(3, subject.offset24Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold25() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertThrows(ArithmeticException.class, () -> subject.collate25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold25() {
        assertEquals(0.5, new WexfordGranaryIV().collate25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold25() {
        assertEquals(1.0, new WexfordGranaryIV().collate25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset26() {
        assertTrue(new WexfordGranaryIV().brace26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new WexfordGranaryIV().brace26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset26() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordGranaryIV().brace26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias27() {
        assertEquals("below", new WexfordGranaryIV().sift27(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias27() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("lower-bound", subject.sift27(5));
        assertEquals("upper-bound", subject.sift27(10));
    }

    @Test
    void classifiesWithinAndAboveBias27() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("within", subject.sift27(5 + 1));
        assertEquals("above", subject.sift27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight28() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge28());
        }
        assertEquals(1, subject.yield28Count());
    }

    @Test
    void refusesOnceExhaustedWeight28() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        for (int i = 0; i < 1; i++) {
            subject.gauge28();
        }
        assertFalse(subject.gauge28());
    }

    @Test
    void accumulatesBelowTheCapTally29() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals(1, subject.prune29(1));
        assertEquals(3, subject.prune29(2));
    }

    @Test
    void saturatesAtTheCapTally29() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        subject.prune29(49);
        assertEquals(49, subject.prune29(5));
    }

    @Test
    void ignoresNegativeValuesTally29() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        subject.prune29(3);
        assertEquals(3, subject.prune29(-2));
        assertEquals(3, subject.weight29Value());
    }

    @Test
    void rejectsZeroDenominatorDepth30() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertThrows(ArithmeticException.class, () -> subject.brace30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth30() {
        assertEquals(0.5, new WexfordGranaryIV().brace30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth30() {
        assertEquals(1.0, new WexfordGranaryIV().brace30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan31() {
        assertTrue(new WexfordGranaryIV().winnow31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new WexfordGranaryIV().winnow31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan31() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordGranaryIV().winnow31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio32() {
        assertEquals("below", new WexfordGranaryIV().anneal32(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio32() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("lower-bound", subject.anneal32(2));
        assertEquals("upper-bound", subject.anneal32(9));
    }

    @Test
    void classifiesWithinAndAboveRatio32() {
        WexfordGranaryIV subject = new WexfordGranaryIV();
        assertEquals("within", subject.anneal32(2 + 1));
        assertEquals("above", subject.anneal32(9 + 1));
    }
}
