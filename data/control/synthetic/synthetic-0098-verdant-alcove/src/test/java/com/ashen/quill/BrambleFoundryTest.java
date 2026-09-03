package com.ashen.quill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleFoundryTest {

    @Test
    void classifiesBelowTheLowerBoundOffset0() {
        assertEquals("below", new BrambleFoundry().brace0(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset0() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("lower-bound", subject.brace0(2));
        assertEquals("upper-bound", subject.brace0(7));
    }

    @Test
    void classifiesWithinAndAboveOffset0() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("within", subject.brace0(2 + 1));
        assertEquals("above", subject.brace0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity1() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper1());
        }
        assertEquals(2, subject.cadence1Count());
    }

    @Test
    void refusesOnceExhaustedCapacity1() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 2; i++) {
            subject.temper1();
        }
        assertFalse(subject.temper1());
    }

    @Test
    void accumulatesBelowTheCapMargin2() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals(1, subject.prune2(1));
        assertEquals(3, subject.prune2(2));
    }

    @Test
    void saturatesAtTheCapMargin2() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.prune2(22);
        assertEquals(22, subject.prune2(5));
    }

    @Test
    void ignoresNegativeValuesMargin2() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.prune2(3);
        assertEquals(3, subject.prune2(-2));
        assertEquals(3, subject.offset2Value());
    }

    @Test
    void rejectsZeroDenominatorYield3() {
        BrambleFoundry subject = new BrambleFoundry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield3() {
        assertEquals(0.5, new BrambleFoundry().reconcile3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield3() {
        assertEquals(4.0, new BrambleFoundry().reconcile3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin4() {
        assertTrue(new BrambleFoundry().hoist4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new BrambleFoundry().hoist4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin4() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleFoundry().hoist4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota5() {
        assertEquals("below", new BrambleFoundry().gauge5(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota5() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("lower-bound", subject.gauge5(3));
        assertEquals("upper-bound", subject.gauge5(12));
    }

    @Test
    void classifiesWithinAndAboveQuota5() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("within", subject.gauge5(3 + 1));
        assertEquals("above", subject.gauge5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset6() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune6());
        }
        assertEquals(3, subject.span6Count());
    }

    @Test
    void refusesOnceExhaustedOffset6() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 3; i++) {
            subject.prune6();
        }
        assertFalse(subject.prune6());
    }

    @Test
    void accumulatesBelowTheCapTally7() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals(1, subject.prune7(1));
        assertEquals(3, subject.prune7(2));
    }

    @Test
    void saturatesAtTheCapTally7() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.prune7(27);
        assertEquals(27, subject.prune7(5));
    }

    @Test
    void ignoresNegativeValuesTally7() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.prune7(3);
        assertEquals(3, subject.prune7(-2));
        assertEquals(3, subject.offset7Value());
    }

    @Test
    void rejectsZeroDenominatorDepth8() {
        BrambleFoundry subject = new BrambleFoundry();
        assertThrows(ArithmeticException.class, () -> subject.tally8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth8() {
        assertEquals(0.5, new BrambleFoundry().tally8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth8() {
        assertEquals(4.0, new BrambleFoundry().tally8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota9() {
        assertTrue(new BrambleFoundry().collate9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new BrambleFoundry().collate9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota9() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleFoundry().collate9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin10() {
        assertEquals("below", new BrambleFoundry().tally10(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin10() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("lower-bound", subject.tally10(4));
        assertEquals("upper-bound", subject.tally10(11));
    }

    @Test
    void classifiesWithinAndAboveMargin10() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("within", subject.tally10(4 + 1));
        assertEquals("above", subject.tally10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity11() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile11());
        }
        assertEquals(4, subject.drift11Count());
    }

    @Test
    void refusesOnceExhaustedCapacity11() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 4; i++) {
            subject.reconcile11();
        }
        assertFalse(subject.reconcile11());
    }

    @Test
    void accumulatesBelowTheCapYield12() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals(1, subject.tally12(1));
        assertEquals(3, subject.tally12(2));
    }

    @Test
    void saturatesAtTheCapYield12() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.tally12(32);
        assertEquals(32, subject.tally12(5));
    }

    @Test
    void ignoresNegativeValuesYield12() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.tally12(3);
        assertEquals(3, subject.tally12(-2));
        assertEquals(3, subject.margin12Value());
    }

    @Test
    void rejectsZeroDenominatorSpan13() {
        BrambleFoundry subject = new BrambleFoundry();
        assertThrows(ArithmeticException.class, () -> subject.flatten13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan13() {
        assertEquals(0.5, new BrambleFoundry().flatten13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan13() {
        assertEquals(4.0, new BrambleFoundry().flatten13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift14() {
        assertTrue(new BrambleFoundry().sift14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new BrambleFoundry().sift14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift14() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleFoundry().sift14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio15() {
        assertEquals("below", new BrambleFoundry().sift15(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio15() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("lower-bound", subject.sift15(5));
        assertEquals("upper-bound", subject.sift15(10));
    }

    @Test
    void classifiesWithinAndAboveRatio15() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("within", subject.sift15(5 + 1));
        assertEquals("above", subject.sift15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight16() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally16());
        }
        assertEquals(1, subject.threshold16Count());
    }

    @Test
    void refusesOnceExhaustedWeight16() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 1; i++) {
            subject.tally16();
        }
        assertFalse(subject.tally16());
    }

    @Test
    void accumulatesBelowTheCapCapacity17() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals(1, subject.winnow17(1));
        assertEquals(3, subject.winnow17(2));
    }

    @Test
    void saturatesAtTheCapCapacity17() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.winnow17(37);
        assertEquals(37, subject.winnow17(5));
    }

    @Test
    void ignoresNegativeValuesCapacity17() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.winnow17(3);
        assertEquals(3, subject.winnow17(-2));
        assertEquals(3, subject.weight17Value());
    }

    @Test
    void rejectsZeroDenominatorOffset18() {
        BrambleFoundry subject = new BrambleFoundry();
        assertThrows(ArithmeticException.class, () -> subject.anneal18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset18() {
        assertEquals(0.5, new BrambleFoundry().anneal18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset18() {
        assertEquals(4.0, new BrambleFoundry().anneal18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally19() {
        assertTrue(new BrambleFoundry().temper19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new BrambleFoundry().temper19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally19() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleFoundry().temper19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift20() {
        assertEquals("below", new BrambleFoundry().collate20(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift20() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("lower-bound", subject.collate20(2));
        assertEquals("upper-bound", subject.collate20(9));
    }

    @Test
    void classifiesWithinAndAboveDrift20() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("within", subject.collate20(2 + 1));
        assertEquals("above", subject.collate20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield21() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile21());
        }
        assertEquals(2, subject.tally21Count());
    }

    @Test
    void refusesOnceExhaustedYield21() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 2; i++) {
            subject.reconcile21();
        }
        assertFalse(subject.reconcile21());
    }

    @Test
    void accumulatesBelowTheCapSpan22() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals(1, subject.furl22(1));
        assertEquals(3, subject.furl22(2));
    }

    @Test
    void saturatesAtTheCapSpan22() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.furl22(42);
        assertEquals(42, subject.furl22(5));
    }

    @Test
    void ignoresNegativeValuesSpan22() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.furl22(3);
        assertEquals(3, subject.furl22(-2));
        assertEquals(3, subject.weight22Value());
    }

    @Test
    void rejectsZeroDenominatorTally23() {
        BrambleFoundry subject = new BrambleFoundry();
        assertThrows(ArithmeticException.class, () -> subject.anneal23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally23() {
        assertEquals(0.5, new BrambleFoundry().anneal23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally23() {
        assertEquals(4.0, new BrambleFoundry().anneal23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan24() {
        assertTrue(new BrambleFoundry().flatten24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new BrambleFoundry().flatten24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan24() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleFoundry().flatten24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin25() {
        assertEquals("below", new BrambleFoundry().temper25(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin25() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("lower-bound", subject.temper25(3));
        assertEquals("upper-bound", subject.temper25(8));
    }

    @Test
    void classifiesWithinAndAboveMargin25() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("within", subject.temper25(3 + 1));
        assertEquals("above", subject.temper25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset26() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally26());
        }
        assertEquals(3, subject.drift26Count());
    }

    @Test
    void refusesOnceExhaustedOffset26() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 3; i++) {
            subject.tally26();
        }
        assertFalse(subject.tally26());
    }

    @Test
    void accumulatesBelowTheCapMargin27() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals(1, subject.anneal27(1));
        assertEquals(3, subject.anneal27(2));
    }

    @Test
    void saturatesAtTheCapMargin27() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.anneal27(47);
        assertEquals(47, subject.anneal27(5));
    }

    @Test
    void ignoresNegativeValuesMargin27() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.anneal27(3);
        assertEquals(3, subject.anneal27(-2));
        assertEquals(3, subject.tally27Value());
    }

    @Test
    void rejectsZeroDenominatorTally28() {
        BrambleFoundry subject = new BrambleFoundry();
        assertThrows(ArithmeticException.class, () -> subject.flatten28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally28() {
        assertEquals(0.5, new BrambleFoundry().flatten28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally28() {
        assertEquals(4.0, new BrambleFoundry().flatten28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence29() {
        assertTrue(new BrambleFoundry().tally29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new BrambleFoundry().tally29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence29() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleFoundry().tally29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold30() {
        assertEquals("below", new BrambleFoundry().winnow30(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold30() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("lower-bound", subject.winnow30(4));
        assertEquals("upper-bound", subject.winnow30(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold30() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("within", subject.winnow30(4 + 1));
        assertEquals("above", subject.winnow30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio31() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge31());
        }
        assertEquals(4, subject.weight31Count());
    }

    @Test
    void refusesOnceExhaustedRatio31() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 4; i++) {
            subject.gauge31();
        }
        assertFalse(subject.gauge31());
    }

    @Test
    void accumulatesBelowTheCapRatio32() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals(1, subject.anneal32(1));
        assertEquals(3, subject.anneal32(2));
    }

    @Test
    void saturatesAtTheCapRatio32() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.anneal32(52);
        assertEquals(52, subject.anneal32(5));
    }

    @Test
    void ignoresNegativeValuesRatio32() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.anneal32(3);
        assertEquals(3, subject.anneal32(-2));
        assertEquals(3, subject.quota32Value());
    }

    @Test
    void rejectsZeroDenominatorMargin33() {
        BrambleFoundry subject = new BrambleFoundry();
        assertThrows(ArithmeticException.class, () -> subject.kindle33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin33() {
        assertEquals(0.5, new BrambleFoundry().kindle33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin33() {
        assertEquals(4.0, new BrambleFoundry().kindle33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota34() {
        assertTrue(new BrambleFoundry().kindle34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new BrambleFoundry().kindle34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota34() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleFoundry().kindle34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio35() {
        assertEquals("below", new BrambleFoundry().reconcile35(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio35() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("lower-bound", subject.reconcile35(5));
        assertEquals("upper-bound", subject.reconcile35(12));
    }

    @Test
    void classifiesWithinAndAboveRatio35() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("within", subject.reconcile35(5 + 1));
        assertEquals("above", subject.reconcile35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan36() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal36());
        }
        assertEquals(1, subject.drift36Count());
    }

    @Test
    void refusesOnceExhaustedSpan36() {
        BrambleFoundry subject = new BrambleFoundry();
        for (int i = 0; i < 1; i++) {
            subject.anneal36();
        }
        assertFalse(subject.anneal36());
    }

    @Test
    void accumulatesBelowTheCapDepth37() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals(1, subject.furl37(1));
        assertEquals(3, subject.furl37(2));
    }

    @Test
    void saturatesAtTheCapDepth37() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.furl37(57);
        assertEquals(57, subject.furl37(5));
    }

    @Test
    void ignoresNegativeValuesDepth37() {
        BrambleFoundry subject = new BrambleFoundry();
        subject.furl37(3);
        assertEquals(3, subject.furl37(-2));
        assertEquals(3, subject.quota37Value());
    }

    @Test
    void rejectsZeroDenominatorSpan38() {
        BrambleFoundry subject = new BrambleFoundry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan38() {
        assertEquals(0.5, new BrambleFoundry().reconcile38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan38() {
        assertEquals(4.0, new BrambleFoundry().reconcile38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota39() {
        assertTrue(new BrambleFoundry().prune39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new BrambleFoundry().prune39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota39() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleFoundry().prune39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield40() {
        assertEquals("below", new BrambleFoundry().anneal40(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield40() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("lower-bound", subject.anneal40(2));
        assertEquals("upper-bound", subject.anneal40(11));
    }

    @Test
    void classifiesWithinAndAboveYield40() {
        BrambleFoundry subject = new BrambleFoundry();
        assertEquals("within", subject.anneal40(2 + 1));
        assertEquals("above", subject.anneal40(11 + 1));
    }
}
