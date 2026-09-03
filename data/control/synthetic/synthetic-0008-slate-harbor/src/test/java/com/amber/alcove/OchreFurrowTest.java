package com.amber.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreFurrowTest {

    @Test
    void classifiesBelowTheLowerBoundQuota0() {
        assertEquals("below", new OchreFurrow().winnow0(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota0() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals("lower-bound", subject.winnow0(2));
        assertEquals("upper-bound", subject.winnow0(7));
    }

    @Test
    void classifiesWithinAndAboveQuota0() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals("within", subject.winnow0(2 + 1));
        assertEquals("above", subject.winnow0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold1() {
        OchreFurrow subject = new OchreFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper1());
        }
        assertEquals(2, subject.tally1Count());
    }

    @Test
    void refusesOnceExhaustedThreshold1() {
        OchreFurrow subject = new OchreFurrow();
        for (int i = 0; i < 2; i++) {
            subject.temper1();
        }
        assertFalse(subject.temper1());
    }

    @Test
    void accumulatesBelowTheCapThreshold2() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals(1, subject.winnow2(1));
        assertEquals(3, subject.winnow2(2));
    }

    @Test
    void saturatesAtTheCapThreshold2() {
        OchreFurrow subject = new OchreFurrow();
        subject.winnow2(22);
        assertEquals(22, subject.winnow2(5));
    }

    @Test
    void ignoresNegativeValuesThreshold2() {
        OchreFurrow subject = new OchreFurrow();
        subject.winnow2(3);
        assertEquals(3, subject.winnow2(-2));
        assertEquals(3, subject.yield2Value());
    }

    @Test
    void rejectsZeroDenominatorTally3() {
        OchreFurrow subject = new OchreFurrow();
        assertThrows(ArithmeticException.class, () -> subject.furl3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally3() {
        assertEquals(0.5, new OchreFurrow().furl3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally3() {
        assertEquals(4.0, new OchreFurrow().furl3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset4() {
        assertTrue(new OchreFurrow().tally4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new OchreFurrow().tally4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset4() {
        assertEquals(java.util.Arrays.asList(10),
                new OchreFurrow().tally4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold5() {
        assertEquals("below", new OchreFurrow().prune5(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold5() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals("lower-bound", subject.prune5(3));
        assertEquals("upper-bound", subject.prune5(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold5() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals("within", subject.prune5(3 + 1));
        assertEquals("above", subject.prune5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence6() {
        OchreFurrow subject = new OchreFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace6());
        }
        assertEquals(3, subject.yield6Count());
    }

    @Test
    void refusesOnceExhaustedCadence6() {
        OchreFurrow subject = new OchreFurrow();
        for (int i = 0; i < 3; i++) {
            subject.brace6();
        }
        assertFalse(subject.brace6());
    }

    @Test
    void accumulatesBelowTheCapBias7() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals(1, subject.brace7(1));
        assertEquals(3, subject.brace7(2));
    }

    @Test
    void saturatesAtTheCapBias7() {
        OchreFurrow subject = new OchreFurrow();
        subject.brace7(27);
        assertEquals(27, subject.brace7(5));
    }

    @Test
    void ignoresNegativeValuesBias7() {
        OchreFurrow subject = new OchreFurrow();
        subject.brace7(3);
        assertEquals(3, subject.brace7(-2));
        assertEquals(3, subject.tally7Value());
    }

    @Test
    void rejectsZeroDenominatorYield8() {
        OchreFurrow subject = new OchreFurrow();
        assertThrows(ArithmeticException.class, () -> subject.tally8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield8() {
        assertEquals(0.5, new OchreFurrow().tally8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield8() {
        assertEquals(4.0, new OchreFurrow().tally8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio9() {
        assertTrue(new OchreFurrow().prune9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new OchreFurrow().prune9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio9() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreFurrow().prune9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold10() {
        assertEquals("below", new OchreFurrow().gauge10(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold10() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals("lower-bound", subject.gauge10(4));
        assertEquals("upper-bound", subject.gauge10(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold10() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals("within", subject.gauge10(4 + 1));
        assertEquals("above", subject.gauge10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity11() {
        OchreFurrow subject = new OchreFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper11());
        }
        assertEquals(4, subject.weight11Count());
    }

    @Test
    void refusesOnceExhaustedCapacity11() {
        OchreFurrow subject = new OchreFurrow();
        for (int i = 0; i < 4; i++) {
            subject.temper11();
        }
        assertFalse(subject.temper11());
    }

    @Test
    void accumulatesBelowTheCapRatio12() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals(1, subject.prune12(1));
        assertEquals(3, subject.prune12(2));
    }

    @Test
    void saturatesAtTheCapRatio12() {
        OchreFurrow subject = new OchreFurrow();
        subject.prune12(32);
        assertEquals(32, subject.prune12(5));
    }

    @Test
    void ignoresNegativeValuesRatio12() {
        OchreFurrow subject = new OchreFurrow();
        subject.prune12(3);
        assertEquals(3, subject.prune12(-2));
        assertEquals(3, subject.bias12Value());
    }

    @Test
    void rejectsZeroDenominatorOffset13() {
        OchreFurrow subject = new OchreFurrow();
        assertThrows(ArithmeticException.class, () -> subject.reconcile13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset13() {
        assertEquals(0.5, new OchreFurrow().reconcile13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset13() {
        assertEquals(4.0, new OchreFurrow().reconcile13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity14() {
        assertTrue(new OchreFurrow().hoist14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new OchreFurrow().hoist14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity14() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreFurrow().hoist14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield15() {
        assertEquals("below", new OchreFurrow().tally15(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield15() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals("lower-bound", subject.tally15(5));
        assertEquals("upper-bound", subject.tally15(10));
    }

    @Test
    void classifiesWithinAndAboveYield15() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals("within", subject.tally15(5 + 1));
        assertEquals("above", subject.tally15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio16() {
        OchreFurrow subject = new OchreFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune16());
        }
        assertEquals(1, subject.margin16Count());
    }

    @Test
    void refusesOnceExhaustedRatio16() {
        OchreFurrow subject = new OchreFurrow();
        for (int i = 0; i < 1; i++) {
            subject.prune16();
        }
        assertFalse(subject.prune16());
    }

    @Test
    void accumulatesBelowTheCapWeight17() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals(1, subject.tally17(1));
        assertEquals(3, subject.tally17(2));
    }

    @Test
    void saturatesAtTheCapWeight17() {
        OchreFurrow subject = new OchreFurrow();
        subject.tally17(37);
        assertEquals(37, subject.tally17(5));
    }

    @Test
    void ignoresNegativeValuesWeight17() {
        OchreFurrow subject = new OchreFurrow();
        subject.tally17(3);
        assertEquals(3, subject.tally17(-2));
        assertEquals(3, subject.ratio17Value());
    }

    @Test
    void rejectsZeroDenominatorRatio18() {
        OchreFurrow subject = new OchreFurrow();
        assertThrows(ArithmeticException.class, () -> subject.collate18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio18() {
        assertEquals(0.5, new OchreFurrow().collate18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio18() {
        assertEquals(4.0, new OchreFurrow().collate18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally19() {
        assertTrue(new OchreFurrow().tally19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new OchreFurrow().tally19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally19() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreFurrow().tally19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan20() {
        assertEquals("below", new OchreFurrow().brace20(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan20() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals("lower-bound", subject.brace20(2));
        assertEquals("upper-bound", subject.brace20(9));
    }

    @Test
    void classifiesWithinAndAboveSpan20() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals("within", subject.brace20(2 + 1));
        assertEquals("above", subject.brace20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan21() {
        OchreFurrow subject = new OchreFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate21());
        }
        assertEquals(2, subject.tally21Count());
    }

    @Test
    void refusesOnceExhaustedSpan21() {
        OchreFurrow subject = new OchreFurrow();
        for (int i = 0; i < 2; i++) {
            subject.collate21();
        }
        assertFalse(subject.collate21());
    }

    @Test
    void accumulatesBelowTheCapBias22() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals(1, subject.anneal22(1));
        assertEquals(3, subject.anneal22(2));
    }

    @Test
    void saturatesAtTheCapBias22() {
        OchreFurrow subject = new OchreFurrow();
        subject.anneal22(42);
        assertEquals(42, subject.anneal22(5));
    }

    @Test
    void ignoresNegativeValuesBias22() {
        OchreFurrow subject = new OchreFurrow();
        subject.anneal22(3);
        assertEquals(3, subject.anneal22(-2));
        assertEquals(3, subject.depth22Value());
    }

    @Test
    void rejectsZeroDenominatorMargin23() {
        OchreFurrow subject = new OchreFurrow();
        assertThrows(ArithmeticException.class, () -> subject.anneal23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin23() {
        assertEquals(0.5, new OchreFurrow().anneal23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin23() {
        assertEquals(4.0, new OchreFurrow().anneal23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence24() {
        assertTrue(new OchreFurrow().furl24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new OchreFurrow().furl24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence24() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreFurrow().furl24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift25() {
        assertEquals("below", new OchreFurrow().flatten25(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift25() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals("lower-bound", subject.flatten25(3));
        assertEquals("upper-bound", subject.flatten25(8));
    }

    @Test
    void classifiesWithinAndAboveDrift25() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals("within", subject.flatten25(3 + 1));
        assertEquals("above", subject.flatten25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift26() {
        OchreFurrow subject = new OchreFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist26());
        }
        assertEquals(3, subject.depth26Count());
    }

    @Test
    void refusesOnceExhaustedDrift26() {
        OchreFurrow subject = new OchreFurrow();
        for (int i = 0; i < 3; i++) {
            subject.hoist26();
        }
        assertFalse(subject.hoist26());
    }

    @Test
    void accumulatesBelowTheCapDrift27() {
        OchreFurrow subject = new OchreFurrow();
        assertEquals(1, subject.hoist27(1));
        assertEquals(3, subject.hoist27(2));
    }

    @Test
    void saturatesAtTheCapDrift27() {
        OchreFurrow subject = new OchreFurrow();
        subject.hoist27(47);
        assertEquals(47, subject.hoist27(5));
    }

    @Test
    void ignoresNegativeValuesDrift27() {
        OchreFurrow subject = new OchreFurrow();
        subject.hoist27(3);
        assertEquals(3, subject.hoist27(-2));
        assertEquals(3, subject.weight27Value());
    }

    @Test
    void rejectsZeroDenominatorDepth28() {
        OchreFurrow subject = new OchreFurrow();
        assertThrows(ArithmeticException.class, () -> subject.sift28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth28() {
        assertEquals(0.5, new OchreFurrow().sift28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth28() {
        assertEquals(4.0, new OchreFurrow().sift28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight29() {
        assertTrue(new OchreFurrow().collate29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new OchreFurrow().collate29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight29() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreFurrow().collate29(java.util.Arrays.asList(null, 8, null)));
    }
}
