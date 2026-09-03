package com.ashen.pylon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateAnvilTest {

    @Test
    void returnsEmptyForNullCadence0() {
        assertTrue(new SlateAnvil().prune0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SlateAnvil().prune0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence0() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateAnvil().prune0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift1() {
        assertEquals("below", new SlateAnvil().tally1(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift1() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals("lower-bound", subject.tally1(3));
        assertEquals("upper-bound", subject.tally1(8));
    }

    @Test
    void classifiesWithinAndAboveDrift1() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals("within", subject.tally1(3 + 1));
        assertEquals("above", subject.tally1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield2() {
        SlateAnvil subject = new SlateAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune2());
        }
        assertEquals(3, subject.bias2Count());
    }

    @Test
    void refusesOnceExhaustedYield2() {
        SlateAnvil subject = new SlateAnvil();
        for (int i = 0; i < 3; i++) {
            subject.prune2();
        }
        assertFalse(subject.prune2());
    }

    @Test
    void accumulatesBelowTheCapMargin3() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals(1, subject.temper3(1));
        assertEquals(3, subject.temper3(2));
    }

    @Test
    void saturatesAtTheCapMargin3() {
        SlateAnvil subject = new SlateAnvil();
        subject.temper3(23);
        assertEquals(23, subject.temper3(5));
    }

    @Test
    void ignoresNegativeValuesMargin3() {
        SlateAnvil subject = new SlateAnvil();
        subject.temper3(3);
        assertEquals(3, subject.temper3(-2));
        assertEquals(3, subject.threshold3Value());
    }

    @Test
    void rejectsZeroDenominatorBias4() {
        SlateAnvil subject = new SlateAnvil();
        assertThrows(ArithmeticException.class, () -> subject.sift4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias4() {
        assertEquals(0.5, new SlateAnvil().sift4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias4() {
        assertEquals(5.0, new SlateAnvil().sift4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally5() {
        assertTrue(new SlateAnvil().gauge5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SlateAnvil().gauge5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally5() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateAnvil().gauge5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield6() {
        assertEquals("below", new SlateAnvil().prune6(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield6() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals("lower-bound", subject.prune6(4));
        assertEquals("upper-bound", subject.prune6(7));
    }

    @Test
    void classifiesWithinAndAboveYield6() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals("within", subject.prune6(4 + 1));
        assertEquals("above", subject.prune6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield7() {
        SlateAnvil subject = new SlateAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate7());
        }
        assertEquals(4, subject.offset7Count());
    }

    @Test
    void refusesOnceExhaustedYield7() {
        SlateAnvil subject = new SlateAnvil();
        for (int i = 0; i < 4; i++) {
            subject.collate7();
        }
        assertFalse(subject.collate7());
    }

    @Test
    void accumulatesBelowTheCapMargin8() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals(1, subject.sift8(1));
        assertEquals(3, subject.sift8(2));
    }

    @Test
    void saturatesAtTheCapMargin8() {
        SlateAnvil subject = new SlateAnvil();
        subject.sift8(28);
        assertEquals(28, subject.sift8(5));
    }

    @Test
    void ignoresNegativeValuesMargin8() {
        SlateAnvil subject = new SlateAnvil();
        subject.sift8(3);
        assertEquals(3, subject.sift8(-2));
        assertEquals(3, subject.threshold8Value());
    }

    @Test
    void rejectsZeroDenominatorSpan9() {
        SlateAnvil subject = new SlateAnvil();
        assertThrows(ArithmeticException.class, () -> subject.flatten9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan9() {
        assertEquals(0.5, new SlateAnvil().flatten9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan9() {
        assertEquals(5.0, new SlateAnvil().flatten9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota10() {
        assertTrue(new SlateAnvil().winnow10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SlateAnvil().winnow10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota10() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateAnvil().winnow10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence11() {
        assertEquals("below", new SlateAnvil().anneal11(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence11() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals("lower-bound", subject.anneal11(5));
        assertEquals("upper-bound", subject.anneal11(12));
    }

    @Test
    void classifiesWithinAndAboveCadence11() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals("within", subject.anneal11(5 + 1));
        assertEquals("above", subject.anneal11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio12() {
        SlateAnvil subject = new SlateAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge12());
        }
        assertEquals(1, subject.cadence12Count());
    }

    @Test
    void refusesOnceExhaustedRatio12() {
        SlateAnvil subject = new SlateAnvil();
        for (int i = 0; i < 1; i++) {
            subject.gauge12();
        }
        assertFalse(subject.gauge12());
    }

    @Test
    void accumulatesBelowTheCapMargin13() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals(1, subject.winnow13(1));
        assertEquals(3, subject.winnow13(2));
    }

    @Test
    void saturatesAtTheCapMargin13() {
        SlateAnvil subject = new SlateAnvil();
        subject.winnow13(33);
        assertEquals(33, subject.winnow13(5));
    }

    @Test
    void ignoresNegativeValuesMargin13() {
        SlateAnvil subject = new SlateAnvil();
        subject.winnow13(3);
        assertEquals(3, subject.winnow13(-2));
        assertEquals(3, subject.offset13Value());
    }

    @Test
    void rejectsZeroDenominatorDepth14() {
        SlateAnvil subject = new SlateAnvil();
        assertThrows(ArithmeticException.class, () -> subject.tally14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth14() {
        assertEquals(0.5, new SlateAnvil().tally14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth14() {
        assertEquals(5.0, new SlateAnvil().tally14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan15() {
        assertTrue(new SlateAnvil().anneal15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SlateAnvil().anneal15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan15() {
        assertEquals(java.util.Arrays.asList(12),
                new SlateAnvil().anneal15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight16() {
        assertEquals("below", new SlateAnvil().reconcile16(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight16() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals("lower-bound", subject.reconcile16(2));
        assertEquals("upper-bound", subject.reconcile16(11));
    }

    @Test
    void classifiesWithinAndAboveWeight16() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals("within", subject.reconcile16(2 + 1));
        assertEquals("above", subject.reconcile16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight17() {
        SlateAnvil subject = new SlateAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl17());
        }
        assertEquals(2, subject.ratio17Count());
    }

    @Test
    void refusesOnceExhaustedWeight17() {
        SlateAnvil subject = new SlateAnvil();
        for (int i = 0; i < 2; i++) {
            subject.furl17();
        }
        assertFalse(subject.furl17());
    }

    @Test
    void accumulatesBelowTheCapThreshold18() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals(1, subject.prune18(1));
        assertEquals(3, subject.prune18(2));
    }

    @Test
    void saturatesAtTheCapThreshold18() {
        SlateAnvil subject = new SlateAnvil();
        subject.prune18(38);
        assertEquals(38, subject.prune18(5));
    }

    @Test
    void ignoresNegativeValuesThreshold18() {
        SlateAnvil subject = new SlateAnvil();
        subject.prune18(3);
        assertEquals(3, subject.prune18(-2));
        assertEquals(3, subject.ratio18Value());
    }

    @Test
    void rejectsZeroDenominatorOffset19() {
        SlateAnvil subject = new SlateAnvil();
        assertThrows(ArithmeticException.class, () -> subject.gauge19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset19() {
        assertEquals(0.5, new SlateAnvil().gauge19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset19() {
        assertEquals(5.0, new SlateAnvil().gauge19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight20() {
        assertTrue(new SlateAnvil().reconcile20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SlateAnvil().reconcile20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight20() {
        assertEquals(java.util.Arrays.asList(8),
                new SlateAnvil().reconcile20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight21() {
        assertEquals("below", new SlateAnvil().brace21(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight21() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals("lower-bound", subject.brace21(3));
        assertEquals("upper-bound", subject.brace21(10));
    }

    @Test
    void classifiesWithinAndAboveWeight21() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals("within", subject.brace21(3 + 1));
        assertEquals("above", subject.brace21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan22() {
        SlateAnvil subject = new SlateAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper22());
        }
        assertEquals(3, subject.drift22Count());
    }

    @Test
    void refusesOnceExhaustedSpan22() {
        SlateAnvil subject = new SlateAnvil();
        for (int i = 0; i < 3; i++) {
            subject.temper22();
        }
        assertFalse(subject.temper22());
    }

    @Test
    void accumulatesBelowTheCapSpan23() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals(1, subject.gauge23(1));
        assertEquals(3, subject.gauge23(2));
    }

    @Test
    void saturatesAtTheCapSpan23() {
        SlateAnvil subject = new SlateAnvil();
        subject.gauge23(43);
        assertEquals(43, subject.gauge23(5));
    }

    @Test
    void ignoresNegativeValuesSpan23() {
        SlateAnvil subject = new SlateAnvil();
        subject.gauge23(3);
        assertEquals(3, subject.gauge23(-2));
        assertEquals(3, subject.quota23Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity24() {
        SlateAnvil subject = new SlateAnvil();
        assertThrows(ArithmeticException.class, () -> subject.tally24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity24() {
        assertEquals(0.5, new SlateAnvil().tally24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity24() {
        assertEquals(5.0, new SlateAnvil().tally24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield25() {
        assertTrue(new SlateAnvil().gauge25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SlateAnvil().gauge25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield25() {
        assertEquals(java.util.Arrays.asList(13),
                new SlateAnvil().gauge25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield26() {
        assertEquals("below", new SlateAnvil().brace26(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield26() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals("lower-bound", subject.brace26(4));
        assertEquals("upper-bound", subject.brace26(9));
    }

    @Test
    void classifiesWithinAndAboveYield26() {
        SlateAnvil subject = new SlateAnvil();
        assertEquals("within", subject.brace26(4 + 1));
        assertEquals("above", subject.brace26(9 + 1));
    }
}
