package com.quiet.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalKilnIITest {

    @Test
    void classifiesBelowTheLowerBoundCadence0() {
        assertEquals("below", new TidalKilnII().kindle0(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence0() {
        TidalKilnII subject = new TidalKilnII();
        assertEquals("lower-bound", subject.kindle0(2));
        assertEquals("upper-bound", subject.kindle0(7));
    }

    @Test
    void classifiesWithinAndAboveCadence0() {
        TidalKilnII subject = new TidalKilnII();
        assertEquals("within", subject.kindle0(2 + 1));
        assertEquals("above", subject.kindle0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota1() {
        TidalKilnII subject = new TidalKilnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl1());
        }
        assertEquals(2, subject.span1Count());
    }

    @Test
    void refusesOnceExhaustedQuota1() {
        TidalKilnII subject = new TidalKilnII();
        for (int i = 0; i < 2; i++) {
            subject.furl1();
        }
        assertFalse(subject.furl1());
    }

    @Test
    void accumulatesBelowTheCapOffset2() {
        TidalKilnII subject = new TidalKilnII();
        assertEquals(1, subject.reconcile2(1));
        assertEquals(3, subject.reconcile2(2));
    }

    @Test
    void saturatesAtTheCapOffset2() {
        TidalKilnII subject = new TidalKilnII();
        subject.reconcile2(22);
        assertEquals(22, subject.reconcile2(5));
    }

    @Test
    void ignoresNegativeValuesOffset2() {
        TidalKilnII subject = new TidalKilnII();
        subject.reconcile2(3);
        assertEquals(3, subject.reconcile2(-2));
        assertEquals(3, subject.quota2Value());
    }

    @Test
    void rejectsZeroDenominatorMargin3() {
        TidalKilnII subject = new TidalKilnII();
        assertThrows(ArithmeticException.class, () -> subject.prune3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin3() {
        assertEquals(0.5, new TidalKilnII().prune3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin3() {
        assertEquals(4.0, new TidalKilnII().prune3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence4() {
        assertTrue(new TidalKilnII().flatten4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new TidalKilnII().flatten4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence4() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalKilnII().flatten4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth5() {
        assertEquals("below", new TidalKilnII().prune5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth5() {
        TidalKilnII subject = new TidalKilnII();
        assertEquals("lower-bound", subject.prune5(3));
        assertEquals("upper-bound", subject.prune5(12));
    }

    @Test
    void classifiesWithinAndAboveDepth5() {
        TidalKilnII subject = new TidalKilnII();
        assertEquals("within", subject.prune5(3 + 1));
        assertEquals("above", subject.prune5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence6() {
        TidalKilnII subject = new TidalKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune6());
        }
        assertEquals(3, subject.quota6Count());
    }

    @Test
    void refusesOnceExhaustedCadence6() {
        TidalKilnII subject = new TidalKilnII();
        for (int i = 0; i < 3; i++) {
            subject.prune6();
        }
        assertFalse(subject.prune6());
    }

    @Test
    void accumulatesBelowTheCapCapacity7() {
        TidalKilnII subject = new TidalKilnII();
        assertEquals(1, subject.sift7(1));
        assertEquals(3, subject.sift7(2));
    }

    @Test
    void saturatesAtTheCapCapacity7() {
        TidalKilnII subject = new TidalKilnII();
        subject.sift7(27);
        assertEquals(27, subject.sift7(5));
    }

    @Test
    void ignoresNegativeValuesCapacity7() {
        TidalKilnII subject = new TidalKilnII();
        subject.sift7(3);
        assertEquals(3, subject.sift7(-2));
        assertEquals(3, subject.drift7Value());
    }

    @Test
    void rejectsZeroDenominatorSpan8() {
        TidalKilnII subject = new TidalKilnII();
        assertThrows(ArithmeticException.class, () -> subject.furl8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan8() {
        assertEquals(0.5, new TidalKilnII().furl8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan8() {
        assertEquals(4.0, new TidalKilnII().furl8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota9() {
        assertTrue(new TidalKilnII().collate9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new TidalKilnII().collate9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota9() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalKilnII().collate9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio10() {
        assertEquals("below", new TidalKilnII().anneal10(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio10() {
        TidalKilnII subject = new TidalKilnII();
        assertEquals("lower-bound", subject.anneal10(4));
        assertEquals("upper-bound", subject.anneal10(11));
    }

    @Test
    void classifiesWithinAndAboveRatio10() {
        TidalKilnII subject = new TidalKilnII();
        assertEquals("within", subject.anneal10(4 + 1));
        assertEquals("above", subject.anneal10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity11() {
        TidalKilnII subject = new TidalKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate11());
        }
        assertEquals(4, subject.offset11Count());
    }

    @Test
    void refusesOnceExhaustedCapacity11() {
        TidalKilnII subject = new TidalKilnII();
        for (int i = 0; i < 4; i++) {
            subject.collate11();
        }
        assertFalse(subject.collate11());
    }

    @Test
    void accumulatesBelowTheCapDepth12() {
        TidalKilnII subject = new TidalKilnII();
        assertEquals(1, subject.temper12(1));
        assertEquals(3, subject.temper12(2));
    }

    @Test
    void saturatesAtTheCapDepth12() {
        TidalKilnII subject = new TidalKilnII();
        subject.temper12(32);
        assertEquals(32, subject.temper12(5));
    }

    @Test
    void ignoresNegativeValuesDepth12() {
        TidalKilnII subject = new TidalKilnII();
        subject.temper12(3);
        assertEquals(3, subject.temper12(-2));
        assertEquals(3, subject.margin12Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold13() {
        TidalKilnII subject = new TidalKilnII();
        assertThrows(ArithmeticException.class, () -> subject.brace13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold13() {
        assertEquals(0.5, new TidalKilnII().brace13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold13() {
        assertEquals(4.0, new TidalKilnII().brace13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift14() {
        assertTrue(new TidalKilnII().anneal14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new TidalKilnII().anneal14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift14() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalKilnII().anneal14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias15() {
        assertEquals("below", new TidalKilnII().gauge15(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias15() {
        TidalKilnII subject = new TidalKilnII();
        assertEquals("lower-bound", subject.gauge15(5));
        assertEquals("upper-bound", subject.gauge15(10));
    }

    @Test
    void classifiesWithinAndAboveBias15() {
        TidalKilnII subject = new TidalKilnII();
        assertEquals("within", subject.gauge15(5 + 1));
        assertEquals("above", subject.gauge15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight16() {
        TidalKilnII subject = new TidalKilnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow16());
        }
        assertEquals(1, subject.capacity16Count());
    }

    @Test
    void refusesOnceExhaustedWeight16() {
        TidalKilnII subject = new TidalKilnII();
        for (int i = 0; i < 1; i++) {
            subject.winnow16();
        }
        assertFalse(subject.winnow16());
    }

    @Test
    void accumulatesBelowTheCapYield17() {
        TidalKilnII subject = new TidalKilnII();
        assertEquals(1, subject.gauge17(1));
        assertEquals(3, subject.gauge17(2));
    }

    @Test
    void saturatesAtTheCapYield17() {
        TidalKilnII subject = new TidalKilnII();
        subject.gauge17(37);
        assertEquals(37, subject.gauge17(5));
    }

    @Test
    void ignoresNegativeValuesYield17() {
        TidalKilnII subject = new TidalKilnII();
        subject.gauge17(3);
        assertEquals(3, subject.gauge17(-2));
        assertEquals(3, subject.threshold17Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold18() {
        TidalKilnII subject = new TidalKilnII();
        assertThrows(ArithmeticException.class, () -> subject.gauge18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold18() {
        assertEquals(0.5, new TidalKilnII().gauge18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold18() {
        assertEquals(4.0, new TidalKilnII().gauge18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity19() {
        assertTrue(new TidalKilnII().kindle19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new TidalKilnII().kindle19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity19() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalKilnII().kindle19(java.util.Arrays.asList(null, 7, null)));
    }
}
