package com.ochre.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreWeirTest {

    @Test
    void returnsEmptyForNullMargin0() {
        assertTrue(new OchreWeir().gauge0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new OchreWeir().gauge0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin0() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreWeir().gauge0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota1() {
        assertEquals("below", new OchreWeir().reconcile1(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota1() {
        OchreWeir subject = new OchreWeir();
        assertEquals("lower-bound", subject.reconcile1(3));
        assertEquals("upper-bound", subject.reconcile1(8));
    }

    @Test
    void classifiesWithinAndAboveQuota1() {
        OchreWeir subject = new OchreWeir();
        assertEquals("within", subject.reconcile1(3 + 1));
        assertEquals("above", subject.reconcile1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity2() {
        OchreWeir subject = new OchreWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile2());
        }
        assertEquals(3, subject.tally2Count());
    }

    @Test
    void refusesOnceExhaustedCapacity2() {
        OchreWeir subject = new OchreWeir();
        for (int i = 0; i < 3; i++) {
            subject.reconcile2();
        }
        assertFalse(subject.reconcile2());
    }

    @Test
    void accumulatesBelowTheCapWeight3() {
        OchreWeir subject = new OchreWeir();
        assertEquals(1, subject.prune3(1));
        assertEquals(3, subject.prune3(2));
    }

    @Test
    void saturatesAtTheCapWeight3() {
        OchreWeir subject = new OchreWeir();
        subject.prune3(23);
        assertEquals(23, subject.prune3(5));
    }

    @Test
    void ignoresNegativeValuesWeight3() {
        OchreWeir subject = new OchreWeir();
        subject.prune3(3);
        assertEquals(3, subject.prune3(-2));
        assertEquals(3, subject.bias3Value());
    }

    @Test
    void rejectsZeroDenominatorMargin4() {
        OchreWeir subject = new OchreWeir();
        assertThrows(ArithmeticException.class, () -> subject.sift4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin4() {
        assertEquals(0.5, new OchreWeir().sift4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin4() {
        assertEquals(5.0, new OchreWeir().sift4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold5() {
        assertTrue(new OchreWeir().winnow5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new OchreWeir().winnow5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold5() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreWeir().winnow5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift6() {
        assertEquals("below", new OchreWeir().furl6(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift6() {
        OchreWeir subject = new OchreWeir();
        assertEquals("lower-bound", subject.furl6(4));
        assertEquals("upper-bound", subject.furl6(7));
    }

    @Test
    void classifiesWithinAndAboveDrift6() {
        OchreWeir subject = new OchreWeir();
        assertEquals("within", subject.furl6(4 + 1));
        assertEquals("above", subject.furl6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin7() {
        OchreWeir subject = new OchreWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten7());
        }
        assertEquals(4, subject.weight7Count());
    }

    @Test
    void refusesOnceExhaustedMargin7() {
        OchreWeir subject = new OchreWeir();
        for (int i = 0; i < 4; i++) {
            subject.flatten7();
        }
        assertFalse(subject.flatten7());
    }

    @Test
    void accumulatesBelowTheCapBias8() {
        OchreWeir subject = new OchreWeir();
        assertEquals(1, subject.winnow8(1));
        assertEquals(3, subject.winnow8(2));
    }

    @Test
    void saturatesAtTheCapBias8() {
        OchreWeir subject = new OchreWeir();
        subject.winnow8(28);
        assertEquals(28, subject.winnow8(5));
    }

    @Test
    void ignoresNegativeValuesBias8() {
        OchreWeir subject = new OchreWeir();
        subject.winnow8(3);
        assertEquals(3, subject.winnow8(-2));
        assertEquals(3, subject.weight8Value());
    }

    @Test
    void rejectsZeroDenominatorMargin9() {
        OchreWeir subject = new OchreWeir();
        assertThrows(ArithmeticException.class, () -> subject.anneal9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin9() {
        assertEquals(0.5, new OchreWeir().anneal9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin9() {
        assertEquals(5.0, new OchreWeir().anneal9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio10() {
        assertTrue(new OchreWeir().brace10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new OchreWeir().brace10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio10() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreWeir().brace10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold11() {
        assertEquals("below", new OchreWeir().furl11(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold11() {
        OchreWeir subject = new OchreWeir();
        assertEquals("lower-bound", subject.furl11(5));
        assertEquals("upper-bound", subject.furl11(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold11() {
        OchreWeir subject = new OchreWeir();
        assertEquals("within", subject.furl11(5 + 1));
        assertEquals("above", subject.furl11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias12() {
        OchreWeir subject = new OchreWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle12());
        }
        assertEquals(1, subject.tally12Count());
    }

    @Test
    void refusesOnceExhaustedBias12() {
        OchreWeir subject = new OchreWeir();
        for (int i = 0; i < 1; i++) {
            subject.kindle12();
        }
        assertFalse(subject.kindle12());
    }

    @Test
    void accumulatesBelowTheCapBias13() {
        OchreWeir subject = new OchreWeir();
        assertEquals(1, subject.brace13(1));
        assertEquals(3, subject.brace13(2));
    }

    @Test
    void saturatesAtTheCapBias13() {
        OchreWeir subject = new OchreWeir();
        subject.brace13(33);
        assertEquals(33, subject.brace13(5));
    }

    @Test
    void ignoresNegativeValuesBias13() {
        OchreWeir subject = new OchreWeir();
        subject.brace13(3);
        assertEquals(3, subject.brace13(-2));
        assertEquals(3, subject.drift13Value());
    }

    @Test
    void rejectsZeroDenominatorWeight14() {
        OchreWeir subject = new OchreWeir();
        assertThrows(ArithmeticException.class, () -> subject.tally14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight14() {
        assertEquals(0.5, new OchreWeir().tally14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight14() {
        assertEquals(5.0, new OchreWeir().tally14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin15() {
        assertTrue(new OchreWeir().gauge15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new OchreWeir().gauge15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin15() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreWeir().gauge15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally16() {
        assertEquals("below", new OchreWeir().kindle16(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally16() {
        OchreWeir subject = new OchreWeir();
        assertEquals("lower-bound", subject.kindle16(2));
        assertEquals("upper-bound", subject.kindle16(11));
    }

    @Test
    void classifiesWithinAndAboveTally16() {
        OchreWeir subject = new OchreWeir();
        assertEquals("within", subject.kindle16(2 + 1));
        assertEquals("above", subject.kindle16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota17() {
        OchreWeir subject = new OchreWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist17());
        }
        assertEquals(2, subject.threshold17Count());
    }

    @Test
    void refusesOnceExhaustedQuota17() {
        OchreWeir subject = new OchreWeir();
        for (int i = 0; i < 2; i++) {
            subject.hoist17();
        }
        assertFalse(subject.hoist17());
    }

    @Test
    void accumulatesBelowTheCapMargin18() {
        OchreWeir subject = new OchreWeir();
        assertEquals(1, subject.prune18(1));
        assertEquals(3, subject.prune18(2));
    }

    @Test
    void saturatesAtTheCapMargin18() {
        OchreWeir subject = new OchreWeir();
        subject.prune18(38);
        assertEquals(38, subject.prune18(5));
    }

    @Test
    void ignoresNegativeValuesMargin18() {
        OchreWeir subject = new OchreWeir();
        subject.prune18(3);
        assertEquals(3, subject.prune18(-2));
        assertEquals(3, subject.span18Value());
    }

    @Test
    void rejectsZeroDenominatorYield19() {
        OchreWeir subject = new OchreWeir();
        assertThrows(ArithmeticException.class, () -> subject.reconcile19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield19() {
        assertEquals(0.5, new OchreWeir().reconcile19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield19() {
        assertEquals(5.0, new OchreWeir().reconcile19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan20() {
        assertTrue(new OchreWeir().furl20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new OchreWeir().furl20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan20() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreWeir().furl20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias21() {
        assertEquals("below", new OchreWeir().anneal21(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias21() {
        OchreWeir subject = new OchreWeir();
        assertEquals("lower-bound", subject.anneal21(3));
        assertEquals("upper-bound", subject.anneal21(10));
    }

    @Test
    void classifiesWithinAndAboveBias21() {
        OchreWeir subject = new OchreWeir();
        assertEquals("within", subject.anneal21(3 + 1));
        assertEquals("above", subject.anneal21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth22() {
        OchreWeir subject = new OchreWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl22());
        }
        assertEquals(3, subject.margin22Count());
    }

    @Test
    void refusesOnceExhaustedDepth22() {
        OchreWeir subject = new OchreWeir();
        for (int i = 0; i < 3; i++) {
            subject.furl22();
        }
        assertFalse(subject.furl22());
    }

    @Test
    void accumulatesBelowTheCapWeight23() {
        OchreWeir subject = new OchreWeir();
        assertEquals(1, subject.hoist23(1));
        assertEquals(3, subject.hoist23(2));
    }

    @Test
    void saturatesAtTheCapWeight23() {
        OchreWeir subject = new OchreWeir();
        subject.hoist23(43);
        assertEquals(43, subject.hoist23(5));
    }

    @Test
    void ignoresNegativeValuesWeight23() {
        OchreWeir subject = new OchreWeir();
        subject.hoist23(3);
        assertEquals(3, subject.hoist23(-2));
        assertEquals(3, subject.drift23Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity24() {
        OchreWeir subject = new OchreWeir();
        assertThrows(ArithmeticException.class, () -> subject.hoist24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity24() {
        assertEquals(0.5, new OchreWeir().hoist24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity24() {
        assertEquals(5.0, new OchreWeir().hoist24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset25() {
        assertTrue(new OchreWeir().tally25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new OchreWeir().tally25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset25() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreWeir().tally25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold26() {
        assertEquals("below", new OchreWeir().sift26(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold26() {
        OchreWeir subject = new OchreWeir();
        assertEquals("lower-bound", subject.sift26(4));
        assertEquals("upper-bound", subject.sift26(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold26() {
        OchreWeir subject = new OchreWeir();
        assertEquals("within", subject.sift26(4 + 1));
        assertEquals("above", subject.sift26(9 + 1));
    }
}
