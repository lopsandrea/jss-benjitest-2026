package com.quiet.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenMeridianIITest {

    @Test
    void returnsEmptyForNullMargin0() {
        assertTrue(new AshenMeridianII().brace0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenMeridianII().brace0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin0() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenMeridianII().brace0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan1() {
        assertEquals("below", new AshenMeridianII().winnow1(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan1() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals("lower-bound", subject.winnow1(3));
        assertEquals("upper-bound", subject.winnow1(8));
    }

    @Test
    void classifiesWithinAndAboveSpan1() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals("within", subject.winnow1(3 + 1));
        assertEquals("above", subject.winnow1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan2() {
        AshenMeridianII subject = new AshenMeridianII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally2());
        }
        assertEquals(3, subject.yield2Count());
    }

    @Test
    void refusesOnceExhaustedSpan2() {
        AshenMeridianII subject = new AshenMeridianII();
        for (int i = 0; i < 3; i++) {
            subject.tally2();
        }
        assertFalse(subject.tally2());
    }

    @Test
    void accumulatesBelowTheCapWeight3() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals(1, subject.hoist3(1));
        assertEquals(3, subject.hoist3(2));
    }

    @Test
    void saturatesAtTheCapWeight3() {
        AshenMeridianII subject = new AshenMeridianII();
        subject.hoist3(23);
        assertEquals(23, subject.hoist3(5));
    }

    @Test
    void ignoresNegativeValuesWeight3() {
        AshenMeridianII subject = new AshenMeridianII();
        subject.hoist3(3);
        assertEquals(3, subject.hoist3(-2));
        assertEquals(3, subject.drift3Value());
    }

    @Test
    void rejectsZeroDenominatorBias4() {
        AshenMeridianII subject = new AshenMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.gauge4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias4() {
        assertEquals(0.5, new AshenMeridianII().gauge4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias4() {
        assertEquals(5.0, new AshenMeridianII().gauge4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift5() {
        assertTrue(new AshenMeridianII().furl5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenMeridianII().furl5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift5() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenMeridianII().furl5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally6() {
        assertEquals("below", new AshenMeridianII().hoist6(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally6() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals("lower-bound", subject.hoist6(4));
        assertEquals("upper-bound", subject.hoist6(7));
    }

    @Test
    void classifiesWithinAndAboveTally6() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals("within", subject.hoist6(4 + 1));
        assertEquals("above", subject.hoist6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight7() {
        AshenMeridianII subject = new AshenMeridianII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl7());
        }
        assertEquals(4, subject.depth7Count());
    }

    @Test
    void refusesOnceExhaustedWeight7() {
        AshenMeridianII subject = new AshenMeridianII();
        for (int i = 0; i < 4; i++) {
            subject.furl7();
        }
        assertFalse(subject.furl7());
    }

    @Test
    void accumulatesBelowTheCapTally8() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals(1, subject.tally8(1));
        assertEquals(3, subject.tally8(2));
    }

    @Test
    void saturatesAtTheCapTally8() {
        AshenMeridianII subject = new AshenMeridianII();
        subject.tally8(28);
        assertEquals(28, subject.tally8(5));
    }

    @Test
    void ignoresNegativeValuesTally8() {
        AshenMeridianII subject = new AshenMeridianII();
        subject.tally8(3);
        assertEquals(3, subject.tally8(-2));
        assertEquals(3, subject.cadence8Value());
    }

    @Test
    void rejectsZeroDenominatorSpan9() {
        AshenMeridianII subject = new AshenMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.sift9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan9() {
        assertEquals(0.5, new AshenMeridianII().sift9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan9() {
        assertEquals(5.0, new AshenMeridianII().sift9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota10() {
        assertTrue(new AshenMeridianII().hoist10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenMeridianII().hoist10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota10() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenMeridianII().hoist10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth11() {
        assertEquals("below", new AshenMeridianII().reconcile11(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth11() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals("lower-bound", subject.reconcile11(5));
        assertEquals("upper-bound", subject.reconcile11(12));
    }

    @Test
    void classifiesWithinAndAboveDepth11() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals("within", subject.reconcile11(5 + 1));
        assertEquals("above", subject.reconcile11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally12() {
        AshenMeridianII subject = new AshenMeridianII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten12());
        }
        assertEquals(1, subject.offset12Count());
    }

    @Test
    void refusesOnceExhaustedTally12() {
        AshenMeridianII subject = new AshenMeridianII();
        for (int i = 0; i < 1; i++) {
            subject.flatten12();
        }
        assertFalse(subject.flatten12());
    }

    @Test
    void accumulatesBelowTheCapThreshold13() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals(1, subject.prune13(1));
        assertEquals(3, subject.prune13(2));
    }

    @Test
    void saturatesAtTheCapThreshold13() {
        AshenMeridianII subject = new AshenMeridianII();
        subject.prune13(33);
        assertEquals(33, subject.prune13(5));
    }

    @Test
    void ignoresNegativeValuesThreshold13() {
        AshenMeridianII subject = new AshenMeridianII();
        subject.prune13(3);
        assertEquals(3, subject.prune13(-2));
        assertEquals(3, subject.quota13Value());
    }

    @Test
    void rejectsZeroDenominatorMargin14() {
        AshenMeridianII subject = new AshenMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.collate14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin14() {
        assertEquals(0.5, new AshenMeridianII().collate14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin14() {
        assertEquals(5.0, new AshenMeridianII().collate14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota15() {
        assertTrue(new AshenMeridianII().tally15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenMeridianII().tally15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota15() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenMeridianII().tally15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota16() {
        assertEquals("below", new AshenMeridianII().tally16(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota16() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals("lower-bound", subject.tally16(2));
        assertEquals("upper-bound", subject.tally16(11));
    }

    @Test
    void classifiesWithinAndAboveQuota16() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals("within", subject.tally16(2 + 1));
        assertEquals("above", subject.tally16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan17() {
        AshenMeridianII subject = new AshenMeridianII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace17());
        }
        assertEquals(2, subject.offset17Count());
    }

    @Test
    void refusesOnceExhaustedSpan17() {
        AshenMeridianII subject = new AshenMeridianII();
        for (int i = 0; i < 2; i++) {
            subject.brace17();
        }
        assertFalse(subject.brace17());
    }

    @Test
    void accumulatesBelowTheCapThreshold18() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals(1, subject.reconcile18(1));
        assertEquals(3, subject.reconcile18(2));
    }

    @Test
    void saturatesAtTheCapThreshold18() {
        AshenMeridianII subject = new AshenMeridianII();
        subject.reconcile18(38);
        assertEquals(38, subject.reconcile18(5));
    }

    @Test
    void ignoresNegativeValuesThreshold18() {
        AshenMeridianII subject = new AshenMeridianII();
        subject.reconcile18(3);
        assertEquals(3, subject.reconcile18(-2));
        assertEquals(3, subject.yield18Value());
    }

    @Test
    void rejectsZeroDenominatorDrift19() {
        AshenMeridianII subject = new AshenMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.anneal19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift19() {
        assertEquals(0.5, new AshenMeridianII().anneal19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift19() {
        assertEquals(5.0, new AshenMeridianII().anneal19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally20() {
        assertTrue(new AshenMeridianII().sift20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenMeridianII().sift20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally20() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenMeridianII().sift20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence21() {
        assertEquals("below", new AshenMeridianII().winnow21(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence21() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals("lower-bound", subject.winnow21(3));
        assertEquals("upper-bound", subject.winnow21(10));
    }

    @Test
    void classifiesWithinAndAboveCadence21() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals("within", subject.winnow21(3 + 1));
        assertEquals("above", subject.winnow21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield22() {
        AshenMeridianII subject = new AshenMeridianII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile22());
        }
        assertEquals(3, subject.span22Count());
    }

    @Test
    void refusesOnceExhaustedYield22() {
        AshenMeridianII subject = new AshenMeridianII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile22();
        }
        assertFalse(subject.reconcile22());
    }

    @Test
    void accumulatesBelowTheCapOffset23() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals(1, subject.tally23(1));
        assertEquals(3, subject.tally23(2));
    }

    @Test
    void saturatesAtTheCapOffset23() {
        AshenMeridianII subject = new AshenMeridianII();
        subject.tally23(43);
        assertEquals(43, subject.tally23(5));
    }

    @Test
    void ignoresNegativeValuesOffset23() {
        AshenMeridianII subject = new AshenMeridianII();
        subject.tally23(3);
        assertEquals(3, subject.tally23(-2));
        assertEquals(3, subject.threshold23Value());
    }

    @Test
    void rejectsZeroDenominatorBias24() {
        AshenMeridianII subject = new AshenMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.temper24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias24() {
        assertEquals(0.5, new AshenMeridianII().temper24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias24() {
        assertEquals(5.0, new AshenMeridianII().temper24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence25() {
        assertTrue(new AshenMeridianII().sift25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenMeridianII().sift25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence25() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenMeridianII().sift25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth26() {
        assertEquals("below", new AshenMeridianII().tally26(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth26() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals("lower-bound", subject.tally26(4));
        assertEquals("upper-bound", subject.tally26(9));
    }

    @Test
    void classifiesWithinAndAboveDepth26() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals("within", subject.tally26(4 + 1));
        assertEquals("above", subject.tally26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight27() {
        AshenMeridianII subject = new AshenMeridianII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl27());
        }
        assertEquals(4, subject.cadence27Count());
    }

    @Test
    void refusesOnceExhaustedWeight27() {
        AshenMeridianII subject = new AshenMeridianII();
        for (int i = 0; i < 4; i++) {
            subject.furl27();
        }
        assertFalse(subject.furl27());
    }

    @Test
    void accumulatesBelowTheCapQuota28() {
        AshenMeridianII subject = new AshenMeridianII();
        assertEquals(1, subject.winnow28(1));
        assertEquals(3, subject.winnow28(2));
    }

    @Test
    void saturatesAtTheCapQuota28() {
        AshenMeridianII subject = new AshenMeridianII();
        subject.winnow28(48);
        assertEquals(48, subject.winnow28(5));
    }

    @Test
    void ignoresNegativeValuesQuota28() {
        AshenMeridianII subject = new AshenMeridianII();
        subject.winnow28(3);
        assertEquals(3, subject.winnow28(-2));
        assertEquals(3, subject.cadence28Value());
    }
}
