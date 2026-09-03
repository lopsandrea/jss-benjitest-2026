package com.pallid.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantAnvilIIITest {

    @Test
    void accumulatesBelowTheCapDrift0() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals(1, subject.sift0(1));
        assertEquals(3, subject.sift0(2));
    }

    @Test
    void saturatesAtTheCapDrift0() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        subject.sift0(20);
        assertEquals(20, subject.sift0(5));
    }

    @Test
    void ignoresNegativeValuesDrift0() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        subject.sift0(3);
        assertEquals(3, subject.sift0(-2));
        assertEquals(3, subject.ratio0Value());
    }

    @Test
    void rejectsZeroDenominatorSpan1() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan1() {
        assertEquals(0.5, new VerdantAnvilIII().kindle1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan1() {
        assertEquals(2.0, new VerdantAnvilIII().kindle1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio2() {
        assertTrue(new VerdantAnvilIII().temper2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new VerdantAnvilIII().temper2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio2() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantAnvilIII().temper2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity3() {
        assertEquals("below", new VerdantAnvilIII().gauge3(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity3() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals("lower-bound", subject.gauge3(5));
        assertEquals("upper-bound", subject.gauge3(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity3() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals("within", subject.gauge3(5 + 1));
        assertEquals("above", subject.gauge3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan4() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle4());
        }
        assertEquals(1, subject.drift4Count());
    }

    @Test
    void refusesOnceExhaustedSpan4() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        for (int i = 0; i < 1; i++) {
            subject.kindle4();
        }
        assertFalse(subject.kindle4());
    }

    @Test
    void accumulatesBelowTheCapCapacity5() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals(1, subject.flatten5(1));
        assertEquals(3, subject.flatten5(2));
    }

    @Test
    void saturatesAtTheCapCapacity5() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        subject.flatten5(25);
        assertEquals(25, subject.flatten5(5));
    }

    @Test
    void ignoresNegativeValuesCapacity5() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        subject.flatten5(3);
        assertEquals(3, subject.flatten5(-2));
        assertEquals(3, subject.weight5Value());
    }

    @Test
    void rejectsZeroDenominatorMargin6() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin6() {
        assertEquals(0.5, new VerdantAnvilIII().hoist6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin6() {
        assertEquals(2.0, new VerdantAnvilIII().hoist6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight7() {
        assertTrue(new VerdantAnvilIII().tally7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new VerdantAnvilIII().tally7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight7() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantAnvilIII().tally7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally8() {
        assertEquals("below", new VerdantAnvilIII().anneal8(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally8() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals("lower-bound", subject.anneal8(2));
        assertEquals("upper-bound", subject.anneal8(9));
    }

    @Test
    void classifiesWithinAndAboveTally8() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals("within", subject.anneal8(2 + 1));
        assertEquals("above", subject.anneal8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias9() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper9());
        }
        assertEquals(2, subject.ratio9Count());
    }

    @Test
    void refusesOnceExhaustedBias9() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        for (int i = 0; i < 2; i++) {
            subject.temper9();
        }
        assertFalse(subject.temper9());
    }

    @Test
    void accumulatesBelowTheCapQuota10() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals(1, subject.prune10(1));
        assertEquals(3, subject.prune10(2));
    }

    @Test
    void saturatesAtTheCapQuota10() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        subject.prune10(30);
        assertEquals(30, subject.prune10(5));
    }

    @Test
    void ignoresNegativeValuesQuota10() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        subject.prune10(3);
        assertEquals(3, subject.prune10(-2));
        assertEquals(3, subject.cadence10Value());
    }

    @Test
    void rejectsZeroDenominatorQuota11() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota11() {
        assertEquals(0.5, new VerdantAnvilIII().hoist11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota11() {
        assertEquals(2.0, new VerdantAnvilIII().hoist11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota12() {
        assertTrue(new VerdantAnvilIII().temper12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new VerdantAnvilIII().temper12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota12() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantAnvilIII().temper12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally13() {
        assertEquals("below", new VerdantAnvilIII().prune13(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally13() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals("lower-bound", subject.prune13(3));
        assertEquals("upper-bound", subject.prune13(8));
    }

    @Test
    void classifiesWithinAndAboveTally13() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals("within", subject.prune13(3 + 1));
        assertEquals("above", subject.prune13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin14() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally14());
        }
        assertEquals(3, subject.tally14Count());
    }

    @Test
    void refusesOnceExhaustedMargin14() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        for (int i = 0; i < 3; i++) {
            subject.tally14();
        }
        assertFalse(subject.tally14());
    }

    @Test
    void accumulatesBelowTheCapQuota15() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals(1, subject.tally15(1));
        assertEquals(3, subject.tally15(2));
    }

    @Test
    void saturatesAtTheCapQuota15() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        subject.tally15(35);
        assertEquals(35, subject.tally15(5));
    }

    @Test
    void ignoresNegativeValuesQuota15() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        subject.tally15(3);
        assertEquals(3, subject.tally15(-2));
        assertEquals(3, subject.offset15Value());
    }

    @Test
    void rejectsZeroDenominatorWeight16() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertThrows(ArithmeticException.class, () -> subject.furl16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight16() {
        assertEquals(0.5, new VerdantAnvilIII().furl16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight16() {
        assertEquals(2.0, new VerdantAnvilIII().furl16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield17() {
        assertTrue(new VerdantAnvilIII().brace17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new VerdantAnvilIII().brace17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield17() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantAnvilIII().brace17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth18() {
        assertEquals("below", new VerdantAnvilIII().flatten18(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth18() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals("lower-bound", subject.flatten18(4));
        assertEquals("upper-bound", subject.flatten18(7));
    }

    @Test
    void classifiesWithinAndAboveDepth18() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals("within", subject.flatten18(4 + 1));
        assertEquals("above", subject.flatten18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio19() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge19());
        }
        assertEquals(4, subject.drift19Count());
    }

    @Test
    void refusesOnceExhaustedRatio19() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        for (int i = 0; i < 4; i++) {
            subject.gauge19();
        }
        assertFalse(subject.gauge19());
    }

    @Test
    void accumulatesBelowTheCapCadence20() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals(1, subject.temper20(1));
        assertEquals(3, subject.temper20(2));
    }

    @Test
    void saturatesAtTheCapCadence20() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        subject.temper20(40);
        assertEquals(40, subject.temper20(5));
    }

    @Test
    void ignoresNegativeValuesCadence20() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        subject.temper20(3);
        assertEquals(3, subject.temper20(-2));
        assertEquals(3, subject.tally20Value());
    }

    @Test
    void rejectsZeroDenominatorWeight21() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertThrows(ArithmeticException.class, () -> subject.furl21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight21() {
        assertEquals(0.5, new VerdantAnvilIII().furl21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight21() {
        assertEquals(2.0, new VerdantAnvilIII().furl21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota22() {
        assertTrue(new VerdantAnvilIII().collate22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new VerdantAnvilIII().collate22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota22() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantAnvilIII().collate22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield23() {
        assertEquals("below", new VerdantAnvilIII().tally23(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield23() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals("lower-bound", subject.tally23(5));
        assertEquals("upper-bound", subject.tally23(12));
    }

    @Test
    void classifiesWithinAndAboveYield23() {
        VerdantAnvilIII subject = new VerdantAnvilIII();
        assertEquals("within", subject.tally23(5 + 1));
        assertEquals("above", subject.tally23(12 + 1));
    }
}
