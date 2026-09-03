package com.wexford.rampart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberAnvilIITest {

    @Test
    void allowsAttemptsUpToTheBudgetMargin0() {
        AmberAnvilII subject = new AmberAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten0());
        }
        assertEquals(1, subject.ratio0Count());
    }

    @Test
    void refusesOnceExhaustedMargin0() {
        AmberAnvilII subject = new AmberAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.flatten0();
        }
        assertFalse(subject.flatten0());
    }

    @Test
    void accumulatesBelowTheCapCapacity1() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals(1, subject.temper1(1));
        assertEquals(3, subject.temper1(2));
    }

    @Test
    void saturatesAtTheCapCapacity1() {
        AmberAnvilII subject = new AmberAnvilII();
        subject.temper1(21);
        assertEquals(21, subject.temper1(5));
    }

    @Test
    void ignoresNegativeValuesCapacity1() {
        AmberAnvilII subject = new AmberAnvilII();
        subject.temper1(3);
        assertEquals(3, subject.temper1(-2));
        assertEquals(3, subject.offset1Value());
    }

    @Test
    void rejectsZeroDenominatorTally2() {
        AmberAnvilII subject = new AmberAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.collate2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally2() {
        assertEquals(0.5, new AmberAnvilII().collate2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally2() {
        assertEquals(3.0, new AmberAnvilII().collate2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally3() {
        assertTrue(new AmberAnvilII().collate3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AmberAnvilII().collate3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally3() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberAnvilII().collate3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin4() {
        assertEquals("below", new AmberAnvilII().brace4(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin4() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals("lower-bound", subject.brace4(2));
        assertEquals("upper-bound", subject.brace4(11));
    }

    @Test
    void classifiesWithinAndAboveMargin4() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals("within", subject.brace4(2 + 1));
        assertEquals("above", subject.brace4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio5() {
        AmberAnvilII subject = new AmberAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune5());
        }
        assertEquals(2, subject.margin5Count());
    }

    @Test
    void refusesOnceExhaustedRatio5() {
        AmberAnvilII subject = new AmberAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.prune5();
        }
        assertFalse(subject.prune5());
    }

    @Test
    void accumulatesBelowTheCapQuota6() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals(1, subject.gauge6(1));
        assertEquals(3, subject.gauge6(2));
    }

    @Test
    void saturatesAtTheCapQuota6() {
        AmberAnvilII subject = new AmberAnvilII();
        subject.gauge6(26);
        assertEquals(26, subject.gauge6(5));
    }

    @Test
    void ignoresNegativeValuesQuota6() {
        AmberAnvilII subject = new AmberAnvilII();
        subject.gauge6(3);
        assertEquals(3, subject.gauge6(-2));
        assertEquals(3, subject.bias6Value());
    }

    @Test
    void rejectsZeroDenominatorRatio7() {
        AmberAnvilII subject = new AmberAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.tally7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio7() {
        assertEquals(0.5, new AmberAnvilII().tally7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio7() {
        assertEquals(3.0, new AmberAnvilII().tally7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio8() {
        assertTrue(new AmberAnvilII().winnow8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AmberAnvilII().winnow8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio8() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberAnvilII().winnow8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally9() {
        assertEquals("below", new AmberAnvilII().sift9(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally9() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals("lower-bound", subject.sift9(3));
        assertEquals("upper-bound", subject.sift9(10));
    }

    @Test
    void classifiesWithinAndAboveTally9() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals("within", subject.sift9(3 + 1));
        assertEquals("above", subject.sift9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold10() {
        AmberAnvilII subject = new AmberAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl10());
        }
        assertEquals(3, subject.quota10Count());
    }

    @Test
    void refusesOnceExhaustedThreshold10() {
        AmberAnvilII subject = new AmberAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.furl10();
        }
        assertFalse(subject.furl10());
    }

    @Test
    void accumulatesBelowTheCapBias11() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals(1, subject.hoist11(1));
        assertEquals(3, subject.hoist11(2));
    }

    @Test
    void saturatesAtTheCapBias11() {
        AmberAnvilII subject = new AmberAnvilII();
        subject.hoist11(31);
        assertEquals(31, subject.hoist11(5));
    }

    @Test
    void ignoresNegativeValuesBias11() {
        AmberAnvilII subject = new AmberAnvilII();
        subject.hoist11(3);
        assertEquals(3, subject.hoist11(-2));
        assertEquals(3, subject.tally11Value());
    }

    @Test
    void rejectsZeroDenominatorMargin12() {
        AmberAnvilII subject = new AmberAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.kindle12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin12() {
        assertEquals(0.5, new AmberAnvilII().kindle12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin12() {
        assertEquals(3.0, new AmberAnvilII().kindle12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset13() {
        assertTrue(new AmberAnvilII().prune13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AmberAnvilII().prune13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset13() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberAnvilII().prune13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight14() {
        assertEquals("below", new AmberAnvilII().anneal14(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight14() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals("lower-bound", subject.anneal14(4));
        assertEquals("upper-bound", subject.anneal14(9));
    }

    @Test
    void classifiesWithinAndAboveWeight14() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals("within", subject.anneal14(4 + 1));
        assertEquals("above", subject.anneal14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift15() {
        AmberAnvilII subject = new AmberAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally15());
        }
        assertEquals(4, subject.margin15Count());
    }

    @Test
    void refusesOnceExhaustedDrift15() {
        AmberAnvilII subject = new AmberAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.tally15();
        }
        assertFalse(subject.tally15());
    }

    @Test
    void accumulatesBelowTheCapQuota16() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals(1, subject.gauge16(1));
        assertEquals(3, subject.gauge16(2));
    }

    @Test
    void saturatesAtTheCapQuota16() {
        AmberAnvilII subject = new AmberAnvilII();
        subject.gauge16(36);
        assertEquals(36, subject.gauge16(5));
    }

    @Test
    void ignoresNegativeValuesQuota16() {
        AmberAnvilII subject = new AmberAnvilII();
        subject.gauge16(3);
        assertEquals(3, subject.gauge16(-2));
        assertEquals(3, subject.drift16Value());
    }

    @Test
    void rejectsZeroDenominatorDrift17() {
        AmberAnvilII subject = new AmberAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.gauge17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift17() {
        assertEquals(0.5, new AmberAnvilII().gauge17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift17() {
        assertEquals(3.0, new AmberAnvilII().gauge17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold18() {
        assertTrue(new AmberAnvilII().prune18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AmberAnvilII().prune18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold18() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberAnvilII().prune18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight19() {
        assertEquals("below", new AmberAnvilII().flatten19(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight19() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals("lower-bound", subject.flatten19(5));
        assertEquals("upper-bound", subject.flatten19(8));
    }

    @Test
    void classifiesWithinAndAboveWeight19() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals("within", subject.flatten19(5 + 1));
        assertEquals("above", subject.flatten19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight20() {
        AmberAnvilII subject = new AmberAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten20());
        }
        assertEquals(1, subject.ratio20Count());
    }

    @Test
    void refusesOnceExhaustedWeight20() {
        AmberAnvilII subject = new AmberAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.flatten20();
        }
        assertFalse(subject.flatten20());
    }

    @Test
    void accumulatesBelowTheCapYield21() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals(1, subject.tally21(1));
        assertEquals(3, subject.tally21(2));
    }

    @Test
    void saturatesAtTheCapYield21() {
        AmberAnvilII subject = new AmberAnvilII();
        subject.tally21(41);
        assertEquals(41, subject.tally21(5));
    }

    @Test
    void ignoresNegativeValuesYield21() {
        AmberAnvilII subject = new AmberAnvilII();
        subject.tally21(3);
        assertEquals(3, subject.tally21(-2));
        assertEquals(3, subject.threshold21Value());
    }

    @Test
    void rejectsZeroDenominatorSpan22() {
        AmberAnvilII subject = new AmberAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.temper22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan22() {
        assertEquals(0.5, new AmberAnvilII().temper22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan22() {
        assertEquals(3.0, new AmberAnvilII().temper22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally23() {
        assertTrue(new AmberAnvilII().furl23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new AmberAnvilII().furl23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally23() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberAnvilII().furl23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin24() {
        assertEquals("below", new AmberAnvilII().hoist24(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin24() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals("lower-bound", subject.hoist24(2));
        assertEquals("upper-bound", subject.hoist24(7));
    }

    @Test
    void classifiesWithinAndAboveMargin24() {
        AmberAnvilII subject = new AmberAnvilII();
        assertEquals("within", subject.hoist24(2 + 1));
        assertEquals("above", subject.hoist24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan25() {
        AmberAnvilII subject = new AmberAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate25());
        }
        assertEquals(2, subject.depth25Count());
    }

    @Test
    void refusesOnceExhaustedSpan25() {
        AmberAnvilII subject = new AmberAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.collate25();
        }
        assertFalse(subject.collate25());
    }
}
