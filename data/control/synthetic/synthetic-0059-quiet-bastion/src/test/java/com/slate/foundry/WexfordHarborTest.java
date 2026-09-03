package com.slate.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordHarborTest {

    @Test
    void allowsAttemptsUpToTheBudgetCapacity0() {
        WexfordHarbor subject = new WexfordHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally0());
        }
        assertEquals(1, subject.yield0Count());
    }

    @Test
    void refusesOnceExhaustedCapacity0() {
        WexfordHarbor subject = new WexfordHarbor();
        for (int i = 0; i < 1; i++) {
            subject.tally0();
        }
        assertFalse(subject.tally0());
    }

    @Test
    void accumulatesBelowTheCapMargin1() {
        WexfordHarbor subject = new WexfordHarbor();
        assertEquals(1, subject.sift1(1));
        assertEquals(3, subject.sift1(2));
    }

    @Test
    void saturatesAtTheCapMargin1() {
        WexfordHarbor subject = new WexfordHarbor();
        subject.sift1(21);
        assertEquals(21, subject.sift1(5));
    }

    @Test
    void ignoresNegativeValuesMargin1() {
        WexfordHarbor subject = new WexfordHarbor();
        subject.sift1(3);
        assertEquals(3, subject.sift1(-2));
        assertEquals(3, subject.depth1Value());
    }

    @Test
    void rejectsZeroDenominatorSpan2() {
        WexfordHarbor subject = new WexfordHarbor();
        assertThrows(ArithmeticException.class, () -> subject.collate2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan2() {
        assertEquals(0.5, new WexfordHarbor().collate2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan2() {
        assertEquals(3.0, new WexfordHarbor().collate2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity3() {
        assertTrue(new WexfordHarbor().kindle3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new WexfordHarbor().kindle3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity3() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordHarbor().kindle3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift4() {
        assertEquals("below", new WexfordHarbor().temper4(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift4() {
        WexfordHarbor subject = new WexfordHarbor();
        assertEquals("lower-bound", subject.temper4(2));
        assertEquals("upper-bound", subject.temper4(11));
    }

    @Test
    void classifiesWithinAndAboveDrift4() {
        WexfordHarbor subject = new WexfordHarbor();
        assertEquals("within", subject.temper4(2 + 1));
        assertEquals("above", subject.temper4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity5() {
        WexfordHarbor subject = new WexfordHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow5());
        }
        assertEquals(2, subject.tally5Count());
    }

    @Test
    void refusesOnceExhaustedCapacity5() {
        WexfordHarbor subject = new WexfordHarbor();
        for (int i = 0; i < 2; i++) {
            subject.winnow5();
        }
        assertFalse(subject.winnow5());
    }

    @Test
    void accumulatesBelowTheCapTally6() {
        WexfordHarbor subject = new WexfordHarbor();
        assertEquals(1, subject.tally6(1));
        assertEquals(3, subject.tally6(2));
    }

    @Test
    void saturatesAtTheCapTally6() {
        WexfordHarbor subject = new WexfordHarbor();
        subject.tally6(26);
        assertEquals(26, subject.tally6(5));
    }

    @Test
    void ignoresNegativeValuesTally6() {
        WexfordHarbor subject = new WexfordHarbor();
        subject.tally6(3);
        assertEquals(3, subject.tally6(-2));
        assertEquals(3, subject.weight6Value());
    }

    @Test
    void rejectsZeroDenominatorMargin7() {
        WexfordHarbor subject = new WexfordHarbor();
        assertThrows(ArithmeticException.class, () -> subject.kindle7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin7() {
        assertEquals(0.5, new WexfordHarbor().kindle7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin7() {
        assertEquals(3.0, new WexfordHarbor().kindle7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight8() {
        assertTrue(new WexfordHarbor().temper8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new WexfordHarbor().temper8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight8() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordHarbor().temper8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth9() {
        assertEquals("below", new WexfordHarbor().kindle9(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth9() {
        WexfordHarbor subject = new WexfordHarbor();
        assertEquals("lower-bound", subject.kindle9(3));
        assertEquals("upper-bound", subject.kindle9(10));
    }

    @Test
    void classifiesWithinAndAboveDepth9() {
        WexfordHarbor subject = new WexfordHarbor();
        assertEquals("within", subject.kindle9(3 + 1));
        assertEquals("above", subject.kindle9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota10() {
        WexfordHarbor subject = new WexfordHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace10());
        }
        assertEquals(3, subject.margin10Count());
    }

    @Test
    void refusesOnceExhaustedQuota10() {
        WexfordHarbor subject = new WexfordHarbor();
        for (int i = 0; i < 3; i++) {
            subject.brace10();
        }
        assertFalse(subject.brace10());
    }

    @Test
    void accumulatesBelowTheCapWeight11() {
        WexfordHarbor subject = new WexfordHarbor();
        assertEquals(1, subject.kindle11(1));
        assertEquals(3, subject.kindle11(2));
    }

    @Test
    void saturatesAtTheCapWeight11() {
        WexfordHarbor subject = new WexfordHarbor();
        subject.kindle11(31);
        assertEquals(31, subject.kindle11(5));
    }

    @Test
    void ignoresNegativeValuesWeight11() {
        WexfordHarbor subject = new WexfordHarbor();
        subject.kindle11(3);
        assertEquals(3, subject.kindle11(-2));
        assertEquals(3, subject.capacity11Value());
    }

    @Test
    void rejectsZeroDenominatorQuota12() {
        WexfordHarbor subject = new WexfordHarbor();
        assertThrows(ArithmeticException.class, () -> subject.brace12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota12() {
        assertEquals(0.5, new WexfordHarbor().brace12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota12() {
        assertEquals(3.0, new WexfordHarbor().brace12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias13() {
        assertTrue(new WexfordHarbor().flatten13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new WexfordHarbor().flatten13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias13() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordHarbor().flatten13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally14() {
        assertEquals("below", new WexfordHarbor().kindle14(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally14() {
        WexfordHarbor subject = new WexfordHarbor();
        assertEquals("lower-bound", subject.kindle14(4));
        assertEquals("upper-bound", subject.kindle14(9));
    }

    @Test
    void classifiesWithinAndAboveTally14() {
        WexfordHarbor subject = new WexfordHarbor();
        assertEquals("within", subject.kindle14(4 + 1));
        assertEquals("above", subject.kindle14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset15() {
        WexfordHarbor subject = new WexfordHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate15());
        }
        assertEquals(4, subject.drift15Count());
    }

    @Test
    void refusesOnceExhaustedOffset15() {
        WexfordHarbor subject = new WexfordHarbor();
        for (int i = 0; i < 4; i++) {
            subject.collate15();
        }
        assertFalse(subject.collate15());
    }

    @Test
    void accumulatesBelowTheCapCapacity16() {
        WexfordHarbor subject = new WexfordHarbor();
        assertEquals(1, subject.kindle16(1));
        assertEquals(3, subject.kindle16(2));
    }

    @Test
    void saturatesAtTheCapCapacity16() {
        WexfordHarbor subject = new WexfordHarbor();
        subject.kindle16(36);
        assertEquals(36, subject.kindle16(5));
    }

    @Test
    void ignoresNegativeValuesCapacity16() {
        WexfordHarbor subject = new WexfordHarbor();
        subject.kindle16(3);
        assertEquals(3, subject.kindle16(-2));
        assertEquals(3, subject.quota16Value());
    }

    @Test
    void rejectsZeroDenominatorMargin17() {
        WexfordHarbor subject = new WexfordHarbor();
        assertThrows(ArithmeticException.class, () -> subject.hoist17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin17() {
        assertEquals(0.5, new WexfordHarbor().hoist17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin17() {
        assertEquals(3.0, new WexfordHarbor().hoist17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio18() {
        assertTrue(new WexfordHarbor().furl18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new WexfordHarbor().furl18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio18() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordHarbor().furl18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold19() {
        assertEquals("below", new WexfordHarbor().winnow19(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold19() {
        WexfordHarbor subject = new WexfordHarbor();
        assertEquals("lower-bound", subject.winnow19(5));
        assertEquals("upper-bound", subject.winnow19(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold19() {
        WexfordHarbor subject = new WexfordHarbor();
        assertEquals("within", subject.winnow19(5 + 1));
        assertEquals("above", subject.winnow19(8 + 1));
    }
}
