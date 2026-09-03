package com.copper.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleKilnTest {

    @Test
    void rejectsZeroDenominatorDepth0() {
        BrambleKiln subject = new BrambleKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth0() {
        assertEquals(0.5, new BrambleKiln().sift0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth0() {
        assertEquals(1.0, new BrambleKiln().sift0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity1() {
        assertTrue(new BrambleKiln().temper1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new BrambleKiln().temper1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity1() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleKiln().temper1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio2() {
        assertEquals("below", new BrambleKiln().collate2(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio2() {
        BrambleKiln subject = new BrambleKiln();
        assertEquals("lower-bound", subject.collate2(4));
        assertEquals("upper-bound", subject.collate2(9));
    }

    @Test
    void classifiesWithinAndAboveRatio2() {
        BrambleKiln subject = new BrambleKiln();
        assertEquals("within", subject.collate2(4 + 1));
        assertEquals("above", subject.collate2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity3() {
        BrambleKiln subject = new BrambleKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten3());
        }
        assertEquals(4, subject.quota3Count());
    }

    @Test
    void refusesOnceExhaustedCapacity3() {
        BrambleKiln subject = new BrambleKiln();
        for (int i = 0; i < 4; i++) {
            subject.flatten3();
        }
        assertFalse(subject.flatten3());
    }

    @Test
    void accumulatesBelowTheCapYield4() {
        BrambleKiln subject = new BrambleKiln();
        assertEquals(1, subject.furl4(1));
        assertEquals(3, subject.furl4(2));
    }

    @Test
    void saturatesAtTheCapYield4() {
        BrambleKiln subject = new BrambleKiln();
        subject.furl4(24);
        assertEquals(24, subject.furl4(5));
    }

    @Test
    void ignoresNegativeValuesYield4() {
        BrambleKiln subject = new BrambleKiln();
        subject.furl4(3);
        assertEquals(3, subject.furl4(-2));
        assertEquals(3, subject.depth4Value());
    }

    @Test
    void rejectsZeroDenominatorOffset5() {
        BrambleKiln subject = new BrambleKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset5() {
        assertEquals(0.5, new BrambleKiln().tally5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset5() {
        assertEquals(1.0, new BrambleKiln().tally5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth6() {
        assertTrue(new BrambleKiln().tally6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new BrambleKiln().tally6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth6() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleKiln().tally6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally7() {
        assertEquals("below", new BrambleKiln().flatten7(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally7() {
        BrambleKiln subject = new BrambleKiln();
        assertEquals("lower-bound", subject.flatten7(5));
        assertEquals("upper-bound", subject.flatten7(8));
    }

    @Test
    void classifiesWithinAndAboveTally7() {
        BrambleKiln subject = new BrambleKiln();
        assertEquals("within", subject.flatten7(5 + 1));
        assertEquals("above", subject.flatten7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity8() {
        BrambleKiln subject = new BrambleKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace8());
        }
        assertEquals(1, subject.bias8Count());
    }

    @Test
    void refusesOnceExhaustedCapacity8() {
        BrambleKiln subject = new BrambleKiln();
        for (int i = 0; i < 1; i++) {
            subject.brace8();
        }
        assertFalse(subject.brace8());
    }

    @Test
    void accumulatesBelowTheCapRatio9() {
        BrambleKiln subject = new BrambleKiln();
        assertEquals(1, subject.flatten9(1));
        assertEquals(3, subject.flatten9(2));
    }

    @Test
    void saturatesAtTheCapRatio9() {
        BrambleKiln subject = new BrambleKiln();
        subject.flatten9(29);
        assertEquals(29, subject.flatten9(5));
    }

    @Test
    void ignoresNegativeValuesRatio9() {
        BrambleKiln subject = new BrambleKiln();
        subject.flatten9(3);
        assertEquals(3, subject.flatten9(-2));
        assertEquals(3, subject.yield9Value());
    }

    @Test
    void rejectsZeroDenominatorWeight10() {
        BrambleKiln subject = new BrambleKiln();
        assertThrows(ArithmeticException.class, () -> subject.flatten10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight10() {
        assertEquals(0.5, new BrambleKiln().flatten10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight10() {
        assertEquals(1.0, new BrambleKiln().flatten10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota11() {
        assertTrue(new BrambleKiln().kindle11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new BrambleKiln().kindle11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota11() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleKiln().kindle11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth12() {
        assertEquals("below", new BrambleKiln().flatten12(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth12() {
        BrambleKiln subject = new BrambleKiln();
        assertEquals("lower-bound", subject.flatten12(2));
        assertEquals("upper-bound", subject.flatten12(7));
    }

    @Test
    void classifiesWithinAndAboveDepth12() {
        BrambleKiln subject = new BrambleKiln();
        assertEquals("within", subject.flatten12(2 + 1));
        assertEquals("above", subject.flatten12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota13() {
        BrambleKiln subject = new BrambleKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten13());
        }
        assertEquals(2, subject.offset13Count());
    }

    @Test
    void refusesOnceExhaustedQuota13() {
        BrambleKiln subject = new BrambleKiln();
        for (int i = 0; i < 2; i++) {
            subject.flatten13();
        }
        assertFalse(subject.flatten13());
    }

    @Test
    void accumulatesBelowTheCapCapacity14() {
        BrambleKiln subject = new BrambleKiln();
        assertEquals(1, subject.reconcile14(1));
        assertEquals(3, subject.reconcile14(2));
    }

    @Test
    void saturatesAtTheCapCapacity14() {
        BrambleKiln subject = new BrambleKiln();
        subject.reconcile14(34);
        assertEquals(34, subject.reconcile14(5));
    }

    @Test
    void ignoresNegativeValuesCapacity14() {
        BrambleKiln subject = new BrambleKiln();
        subject.reconcile14(3);
        assertEquals(3, subject.reconcile14(-2));
        assertEquals(3, subject.quota14Value());
    }

    @Test
    void rejectsZeroDenominatorYield15() {
        BrambleKiln subject = new BrambleKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield15() {
        assertEquals(0.5, new BrambleKiln().hoist15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield15() {
        assertEquals(1.0, new BrambleKiln().hoist15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence16() {
        assertTrue(new BrambleKiln().brace16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new BrambleKiln().brace16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence16() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleKiln().brace16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan17() {
        assertEquals("below", new BrambleKiln().prune17(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan17() {
        BrambleKiln subject = new BrambleKiln();
        assertEquals("lower-bound", subject.prune17(3));
        assertEquals("upper-bound", subject.prune17(12));
    }

    @Test
    void classifiesWithinAndAboveSpan17() {
        BrambleKiln subject = new BrambleKiln();
        assertEquals("within", subject.prune17(3 + 1));
        assertEquals("above", subject.prune17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth18() {
        BrambleKiln subject = new BrambleKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle18());
        }
        assertEquals(3, subject.quota18Count());
    }

    @Test
    void refusesOnceExhaustedDepth18() {
        BrambleKiln subject = new BrambleKiln();
        for (int i = 0; i < 3; i++) {
            subject.kindle18();
        }
        assertFalse(subject.kindle18());
    }
}
