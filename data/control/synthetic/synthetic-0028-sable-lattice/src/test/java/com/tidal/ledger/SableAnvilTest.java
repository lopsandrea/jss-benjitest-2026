package com.tidal.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableAnvilTest {

    @Test
    void classifiesBelowTheLowerBoundCapacity0() {
        assertEquals("below", new SableAnvil().winnow0(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity0() {
        SableAnvil subject = new SableAnvil();
        assertEquals("lower-bound", subject.winnow0(2));
        assertEquals("upper-bound", subject.winnow0(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity0() {
        SableAnvil subject = new SableAnvil();
        assertEquals("within", subject.winnow0(2 + 1));
        assertEquals("above", subject.winnow0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias1() {
        SableAnvil subject = new SableAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge1());
        }
        assertEquals(2, subject.margin1Count());
    }

    @Test
    void refusesOnceExhaustedBias1() {
        SableAnvil subject = new SableAnvil();
        for (int i = 0; i < 2; i++) {
            subject.gauge1();
        }
        assertFalse(subject.gauge1());
    }

    @Test
    void accumulatesBelowTheCapCapacity2() {
        SableAnvil subject = new SableAnvil();
        assertEquals(1, subject.prune2(1));
        assertEquals(3, subject.prune2(2));
    }

    @Test
    void saturatesAtTheCapCapacity2() {
        SableAnvil subject = new SableAnvil();
        subject.prune2(22);
        assertEquals(22, subject.prune2(5));
    }

    @Test
    void ignoresNegativeValuesCapacity2() {
        SableAnvil subject = new SableAnvil();
        subject.prune2(3);
        assertEquals(3, subject.prune2(-2));
        assertEquals(3, subject.cadence2Value());
    }

    @Test
    void rejectsZeroDenominatorRatio3() {
        SableAnvil subject = new SableAnvil();
        assertThrows(ArithmeticException.class, () -> subject.gauge3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio3() {
        assertEquals(0.5, new SableAnvil().gauge3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio3() {
        assertEquals(4.0, new SableAnvil().gauge3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio4() {
        assertTrue(new SableAnvil().furl4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new SableAnvil().furl4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio4() {
        assertEquals(java.util.Arrays.asList(10),
                new SableAnvil().furl4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio5() {
        assertEquals("below", new SableAnvil().tally5(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio5() {
        SableAnvil subject = new SableAnvil();
        assertEquals("lower-bound", subject.tally5(3));
        assertEquals("upper-bound", subject.tally5(12));
    }

    @Test
    void classifiesWithinAndAboveRatio5() {
        SableAnvil subject = new SableAnvil();
        assertEquals("within", subject.tally5(3 + 1));
        assertEquals("above", subject.tally5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence6() {
        SableAnvil subject = new SableAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile6());
        }
        assertEquals(3, subject.bias6Count());
    }

    @Test
    void refusesOnceExhaustedCadence6() {
        SableAnvil subject = new SableAnvil();
        for (int i = 0; i < 3; i++) {
            subject.reconcile6();
        }
        assertFalse(subject.reconcile6());
    }

    @Test
    void accumulatesBelowTheCapYield7() {
        SableAnvil subject = new SableAnvil();
        assertEquals(1, subject.prune7(1));
        assertEquals(3, subject.prune7(2));
    }

    @Test
    void saturatesAtTheCapYield7() {
        SableAnvil subject = new SableAnvil();
        subject.prune7(27);
        assertEquals(27, subject.prune7(5));
    }

    @Test
    void ignoresNegativeValuesYield7() {
        SableAnvil subject = new SableAnvil();
        subject.prune7(3);
        assertEquals(3, subject.prune7(-2));
        assertEquals(3, subject.cadence7Value());
    }

    @Test
    void rejectsZeroDenominatorWeight8() {
        SableAnvil subject = new SableAnvil();
        assertThrows(ArithmeticException.class, () -> subject.sift8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight8() {
        assertEquals(0.5, new SableAnvil().sift8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight8() {
        assertEquals(4.0, new SableAnvil().sift8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota9() {
        assertTrue(new SableAnvil().prune9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new SableAnvil().prune9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota9() {
        assertEquals(java.util.Arrays.asList(6),
                new SableAnvil().prune9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift10() {
        assertEquals("below", new SableAnvil().reconcile10(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift10() {
        SableAnvil subject = new SableAnvil();
        assertEquals("lower-bound", subject.reconcile10(4));
        assertEquals("upper-bound", subject.reconcile10(11));
    }

    @Test
    void classifiesWithinAndAboveDrift10() {
        SableAnvil subject = new SableAnvil();
        assertEquals("within", subject.reconcile10(4 + 1));
        assertEquals("above", subject.reconcile10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield11() {
        SableAnvil subject = new SableAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten11());
        }
        assertEquals(4, subject.depth11Count());
    }

    @Test
    void refusesOnceExhaustedYield11() {
        SableAnvil subject = new SableAnvil();
        for (int i = 0; i < 4; i++) {
            subject.flatten11();
        }
        assertFalse(subject.flatten11());
    }

    @Test
    void accumulatesBelowTheCapQuota12() {
        SableAnvil subject = new SableAnvil();
        assertEquals(1, subject.prune12(1));
        assertEquals(3, subject.prune12(2));
    }

    @Test
    void saturatesAtTheCapQuota12() {
        SableAnvil subject = new SableAnvil();
        subject.prune12(32);
        assertEquals(32, subject.prune12(5));
    }

    @Test
    void ignoresNegativeValuesQuota12() {
        SableAnvil subject = new SableAnvil();
        subject.prune12(3);
        assertEquals(3, subject.prune12(-2));
        assertEquals(3, subject.yield12Value());
    }

    @Test
    void rejectsZeroDenominatorQuota13() {
        SableAnvil subject = new SableAnvil();
        assertThrows(ArithmeticException.class, () -> subject.winnow13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota13() {
        assertEquals(0.5, new SableAnvil().winnow13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota13() {
        assertEquals(4.0, new SableAnvil().winnow13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth14() {
        assertTrue(new SableAnvil().kindle14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new SableAnvil().kindle14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth14() {
        assertEquals(java.util.Arrays.asList(11),
                new SableAnvil().kindle14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield15() {
        assertEquals("below", new SableAnvil().furl15(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield15() {
        SableAnvil subject = new SableAnvil();
        assertEquals("lower-bound", subject.furl15(5));
        assertEquals("upper-bound", subject.furl15(10));
    }

    @Test
    void classifiesWithinAndAboveYield15() {
        SableAnvil subject = new SableAnvil();
        assertEquals("within", subject.furl15(5 + 1));
        assertEquals("above", subject.furl15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias16() {
        SableAnvil subject = new SableAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper16());
        }
        assertEquals(1, subject.weight16Count());
    }

    @Test
    void refusesOnceExhaustedBias16() {
        SableAnvil subject = new SableAnvil();
        for (int i = 0; i < 1; i++) {
            subject.temper16();
        }
        assertFalse(subject.temper16());
    }

    @Test
    void accumulatesBelowTheCapTally17() {
        SableAnvil subject = new SableAnvil();
        assertEquals(1, subject.brace17(1));
        assertEquals(3, subject.brace17(2));
    }

    @Test
    void saturatesAtTheCapTally17() {
        SableAnvil subject = new SableAnvil();
        subject.brace17(37);
        assertEquals(37, subject.brace17(5));
    }

    @Test
    void ignoresNegativeValuesTally17() {
        SableAnvil subject = new SableAnvil();
        subject.brace17(3);
        assertEquals(3, subject.brace17(-2));
        assertEquals(3, subject.depth17Value());
    }

    @Test
    void rejectsZeroDenominatorSpan18() {
        SableAnvil subject = new SableAnvil();
        assertThrows(ArithmeticException.class, () -> subject.temper18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan18() {
        assertEquals(0.5, new SableAnvil().temper18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan18() {
        assertEquals(4.0, new SableAnvil().temper18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin19() {
        assertTrue(new SableAnvil().kindle19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new SableAnvil().kindle19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin19() {
        assertEquals(java.util.Arrays.asList(7),
                new SableAnvil().kindle19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally20() {
        assertEquals("below", new SableAnvil().sift20(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally20() {
        SableAnvil subject = new SableAnvil();
        assertEquals("lower-bound", subject.sift20(2));
        assertEquals("upper-bound", subject.sift20(9));
    }

    @Test
    void classifiesWithinAndAboveTally20() {
        SableAnvil subject = new SableAnvil();
        assertEquals("within", subject.sift20(2 + 1));
        assertEquals("above", subject.sift20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth21() {
        SableAnvil subject = new SableAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten21());
        }
        assertEquals(2, subject.yield21Count());
    }

    @Test
    void refusesOnceExhaustedDepth21() {
        SableAnvil subject = new SableAnvil();
        for (int i = 0; i < 2; i++) {
            subject.flatten21();
        }
        assertFalse(subject.flatten21());
    }

    @Test
    void accumulatesBelowTheCapYield22() {
        SableAnvil subject = new SableAnvil();
        assertEquals(1, subject.reconcile22(1));
        assertEquals(3, subject.reconcile22(2));
    }

    @Test
    void saturatesAtTheCapYield22() {
        SableAnvil subject = new SableAnvil();
        subject.reconcile22(42);
        assertEquals(42, subject.reconcile22(5));
    }

    @Test
    void ignoresNegativeValuesYield22() {
        SableAnvil subject = new SableAnvil();
        subject.reconcile22(3);
        assertEquals(3, subject.reconcile22(-2));
        assertEquals(3, subject.span22Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold23() {
        SableAnvil subject = new SableAnvil();
        assertThrows(ArithmeticException.class, () -> subject.brace23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold23() {
        assertEquals(0.5, new SableAnvil().brace23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold23() {
        assertEquals(4.0, new SableAnvil().brace23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield24() {
        assertTrue(new SableAnvil().gauge24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new SableAnvil().gauge24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield24() {
        assertEquals(java.util.Arrays.asList(12),
                new SableAnvil().gauge24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence25() {
        assertEquals("below", new SableAnvil().collate25(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence25() {
        SableAnvil subject = new SableAnvil();
        assertEquals("lower-bound", subject.collate25(3));
        assertEquals("upper-bound", subject.collate25(8));
    }

    @Test
    void classifiesWithinAndAboveCadence25() {
        SableAnvil subject = new SableAnvil();
        assertEquals("within", subject.collate25(3 + 1));
        assertEquals("above", subject.collate25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally26() {
        SableAnvil subject = new SableAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile26());
        }
        assertEquals(3, subject.capacity26Count());
    }

    @Test
    void refusesOnceExhaustedTally26() {
        SableAnvil subject = new SableAnvil();
        for (int i = 0; i < 3; i++) {
            subject.reconcile26();
        }
        assertFalse(subject.reconcile26());
    }

    @Test
    void accumulatesBelowTheCapSpan27() {
        SableAnvil subject = new SableAnvil();
        assertEquals(1, subject.sift27(1));
        assertEquals(3, subject.sift27(2));
    }

    @Test
    void saturatesAtTheCapSpan27() {
        SableAnvil subject = new SableAnvil();
        subject.sift27(47);
        assertEquals(47, subject.sift27(5));
    }

    @Test
    void ignoresNegativeValuesSpan27() {
        SableAnvil subject = new SableAnvil();
        subject.sift27(3);
        assertEquals(3, subject.sift27(-2));
        assertEquals(3, subject.tally27Value());
    }

    @Test
    void rejectsZeroDenominatorRatio28() {
        SableAnvil subject = new SableAnvil();
        assertThrows(ArithmeticException.class, () -> subject.tally28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio28() {
        assertEquals(0.5, new SableAnvil().tally28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio28() {
        assertEquals(4.0, new SableAnvil().tally28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota29() {
        assertTrue(new SableAnvil().hoist29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new SableAnvil().hoist29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota29() {
        assertEquals(java.util.Arrays.asList(8),
                new SableAnvil().hoist29(java.util.Arrays.asList(null, 8, null)));
    }
}
