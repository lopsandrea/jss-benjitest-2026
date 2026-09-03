package com.ashen.beacon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberCisternIITest {

    @Test
    void returnsEmptyForNullSpan0() {
        assertTrue(new AmberCisternII().sift0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AmberCisternII().sift0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan0() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberCisternII().sift0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan1() {
        assertEquals("below", new AmberCisternII().tally1(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan1() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals("lower-bound", subject.tally1(3));
        assertEquals("upper-bound", subject.tally1(8));
    }

    @Test
    void classifiesWithinAndAboveSpan1() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals("within", subject.tally1(3 + 1));
        assertEquals("above", subject.tally1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota2() {
        AmberCisternII subject = new AmberCisternII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal2());
        }
        assertEquals(3, subject.cadence2Count());
    }

    @Test
    void refusesOnceExhaustedQuota2() {
        AmberCisternII subject = new AmberCisternII();
        for (int i = 0; i < 3; i++) {
            subject.anneal2();
        }
        assertFalse(subject.anneal2());
    }

    @Test
    void accumulatesBelowTheCapCapacity3() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals(1, subject.prune3(1));
        assertEquals(3, subject.prune3(2));
    }

    @Test
    void saturatesAtTheCapCapacity3() {
        AmberCisternII subject = new AmberCisternII();
        subject.prune3(23);
        assertEquals(23, subject.prune3(5));
    }

    @Test
    void ignoresNegativeValuesCapacity3() {
        AmberCisternII subject = new AmberCisternII();
        subject.prune3(3);
        assertEquals(3, subject.prune3(-2));
        assertEquals(3, subject.quota3Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity4() {
        AmberCisternII subject = new AmberCisternII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity4() {
        assertEquals(0.5, new AmberCisternII().reconcile4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity4() {
        assertEquals(5.0, new AmberCisternII().reconcile4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold5() {
        assertTrue(new AmberCisternII().tally5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AmberCisternII().tally5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold5() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberCisternII().tally5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth6() {
        assertEquals("below", new AmberCisternII().kindle6(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth6() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals("lower-bound", subject.kindle6(4));
        assertEquals("upper-bound", subject.kindle6(7));
    }

    @Test
    void classifiesWithinAndAboveDepth6() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals("within", subject.kindle6(4 + 1));
        assertEquals("above", subject.kindle6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity7() {
        AmberCisternII subject = new AmberCisternII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl7());
        }
        assertEquals(4, subject.offset7Count());
    }

    @Test
    void refusesOnceExhaustedCapacity7() {
        AmberCisternII subject = new AmberCisternII();
        for (int i = 0; i < 4; i++) {
            subject.furl7();
        }
        assertFalse(subject.furl7());
    }

    @Test
    void accumulatesBelowTheCapRatio8() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals(1, subject.kindle8(1));
        assertEquals(3, subject.kindle8(2));
    }

    @Test
    void saturatesAtTheCapRatio8() {
        AmberCisternII subject = new AmberCisternII();
        subject.kindle8(28);
        assertEquals(28, subject.kindle8(5));
    }

    @Test
    void ignoresNegativeValuesRatio8() {
        AmberCisternII subject = new AmberCisternII();
        subject.kindle8(3);
        assertEquals(3, subject.kindle8(-2));
        assertEquals(3, subject.bias8Value());
    }

    @Test
    void rejectsZeroDenominatorYield9() {
        AmberCisternII subject = new AmberCisternII();
        assertThrows(ArithmeticException.class, () -> subject.gauge9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield9() {
        assertEquals(0.5, new AmberCisternII().gauge9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield9() {
        assertEquals(5.0, new AmberCisternII().gauge9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence10() {
        assertTrue(new AmberCisternII().tally10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AmberCisternII().tally10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence10() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberCisternII().tally10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio11() {
        assertEquals("below", new AmberCisternII().winnow11(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio11() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals("lower-bound", subject.winnow11(5));
        assertEquals("upper-bound", subject.winnow11(12));
    }

    @Test
    void classifiesWithinAndAboveRatio11() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals("within", subject.winnow11(5 + 1));
        assertEquals("above", subject.winnow11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift12() {
        AmberCisternII subject = new AmberCisternII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow12());
        }
        assertEquals(1, subject.bias12Count());
    }

    @Test
    void refusesOnceExhaustedDrift12() {
        AmberCisternII subject = new AmberCisternII();
        for (int i = 0; i < 1; i++) {
            subject.winnow12();
        }
        assertFalse(subject.winnow12());
    }

    @Test
    void accumulatesBelowTheCapDepth13() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals(1, subject.gauge13(1));
        assertEquals(3, subject.gauge13(2));
    }

    @Test
    void saturatesAtTheCapDepth13() {
        AmberCisternII subject = new AmberCisternII();
        subject.gauge13(33);
        assertEquals(33, subject.gauge13(5));
    }

    @Test
    void ignoresNegativeValuesDepth13() {
        AmberCisternII subject = new AmberCisternII();
        subject.gauge13(3);
        assertEquals(3, subject.gauge13(-2));
        assertEquals(3, subject.bias13Value());
    }

    @Test
    void rejectsZeroDenominatorMargin14() {
        AmberCisternII subject = new AmberCisternII();
        assertThrows(ArithmeticException.class, () -> subject.collate14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin14() {
        assertEquals(0.5, new AmberCisternII().collate14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin14() {
        assertEquals(5.0, new AmberCisternII().collate14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset15() {
        assertTrue(new AmberCisternII().prune15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AmberCisternII().prune15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset15() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberCisternII().prune15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence16() {
        assertEquals("below", new AmberCisternII().flatten16(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence16() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals("lower-bound", subject.flatten16(2));
        assertEquals("upper-bound", subject.flatten16(11));
    }

    @Test
    void classifiesWithinAndAboveCadence16() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals("within", subject.flatten16(2 + 1));
        assertEquals("above", subject.flatten16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence17() {
        AmberCisternII subject = new AmberCisternII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift17());
        }
        assertEquals(2, subject.tally17Count());
    }

    @Test
    void refusesOnceExhaustedCadence17() {
        AmberCisternII subject = new AmberCisternII();
        for (int i = 0; i < 2; i++) {
            subject.sift17();
        }
        assertFalse(subject.sift17());
    }

    @Test
    void accumulatesBelowTheCapRatio18() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals(1, subject.kindle18(1));
        assertEquals(3, subject.kindle18(2));
    }

    @Test
    void saturatesAtTheCapRatio18() {
        AmberCisternII subject = new AmberCisternII();
        subject.kindle18(38);
        assertEquals(38, subject.kindle18(5));
    }

    @Test
    void ignoresNegativeValuesRatio18() {
        AmberCisternII subject = new AmberCisternII();
        subject.kindle18(3);
        assertEquals(3, subject.kindle18(-2));
        assertEquals(3, subject.offset18Value());
    }

    @Test
    void rejectsZeroDenominatorMargin19() {
        AmberCisternII subject = new AmberCisternII();
        assertThrows(ArithmeticException.class, () -> subject.prune19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin19() {
        assertEquals(0.5, new AmberCisternII().prune19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin19() {
        assertEquals(5.0, new AmberCisternII().prune19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan20() {
        assertTrue(new AmberCisternII().reconcile20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AmberCisternII().reconcile20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan20() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberCisternII().reconcile20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally21() {
        assertEquals("below", new AmberCisternII().furl21(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally21() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals("lower-bound", subject.furl21(3));
        assertEquals("upper-bound", subject.furl21(10));
    }

    @Test
    void classifiesWithinAndAboveTally21() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals("within", subject.furl21(3 + 1));
        assertEquals("above", subject.furl21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity22() {
        AmberCisternII subject = new AmberCisternII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle22());
        }
        assertEquals(3, subject.margin22Count());
    }

    @Test
    void refusesOnceExhaustedCapacity22() {
        AmberCisternII subject = new AmberCisternII();
        for (int i = 0; i < 3; i++) {
            subject.kindle22();
        }
        assertFalse(subject.kindle22());
    }

    @Test
    void accumulatesBelowTheCapCapacity23() {
        AmberCisternII subject = new AmberCisternII();
        assertEquals(1, subject.anneal23(1));
        assertEquals(3, subject.anneal23(2));
    }

    @Test
    void saturatesAtTheCapCapacity23() {
        AmberCisternII subject = new AmberCisternII();
        subject.anneal23(43);
        assertEquals(43, subject.anneal23(5));
    }

    @Test
    void ignoresNegativeValuesCapacity23() {
        AmberCisternII subject = new AmberCisternII();
        subject.anneal23(3);
        assertEquals(3, subject.anneal23(-2));
        assertEquals(3, subject.weight23Value());
    }

    @Test
    void rejectsZeroDenominatorOffset24() {
        AmberCisternII subject = new AmberCisternII();
        assertThrows(ArithmeticException.class, () -> subject.prune24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset24() {
        assertEquals(0.5, new AmberCisternII().prune24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset24() {
        assertEquals(5.0, new AmberCisternII().prune24(1000.0, 1.0), 1e-9);
    }
}
