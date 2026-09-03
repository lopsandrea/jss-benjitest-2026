package com.amber.furrow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowQuillTest {

    @Test
    void classifiesBelowTheLowerBoundWeight0() {
        assertEquals("below", new HollowQuill().tally0(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight0() {
        HollowQuill subject = new HollowQuill();
        assertEquals("lower-bound", subject.tally0(2));
        assertEquals("upper-bound", subject.tally0(7));
    }

    @Test
    void classifiesWithinAndAboveWeight0() {
        HollowQuill subject = new HollowQuill();
        assertEquals("within", subject.tally0(2 + 1));
        assertEquals("above", subject.tally0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift1() {
        HollowQuill subject = new HollowQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune1());
        }
        assertEquals(2, subject.margin1Count());
    }

    @Test
    void refusesOnceExhaustedDrift1() {
        HollowQuill subject = new HollowQuill();
        for (int i = 0; i < 2; i++) {
            subject.prune1();
        }
        assertFalse(subject.prune1());
    }

    @Test
    void accumulatesBelowTheCapTally2() {
        HollowQuill subject = new HollowQuill();
        assertEquals(1, subject.collate2(1));
        assertEquals(3, subject.collate2(2));
    }

    @Test
    void saturatesAtTheCapTally2() {
        HollowQuill subject = new HollowQuill();
        subject.collate2(22);
        assertEquals(22, subject.collate2(5));
    }

    @Test
    void ignoresNegativeValuesTally2() {
        HollowQuill subject = new HollowQuill();
        subject.collate2(3);
        assertEquals(3, subject.collate2(-2));
        assertEquals(3, subject.span2Value());
    }

    @Test
    void rejectsZeroDenominatorSpan3() {
        HollowQuill subject = new HollowQuill();
        assertThrows(ArithmeticException.class, () -> subject.kindle3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan3() {
        assertEquals(0.5, new HollowQuill().kindle3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan3() {
        assertEquals(4.0, new HollowQuill().kindle3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight4() {
        assertTrue(new HollowQuill().kindle4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new HollowQuill().kindle4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight4() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowQuill().kindle4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota5() {
        assertEquals("below", new HollowQuill().flatten5(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota5() {
        HollowQuill subject = new HollowQuill();
        assertEquals("lower-bound", subject.flatten5(3));
        assertEquals("upper-bound", subject.flatten5(12));
    }

    @Test
    void classifiesWithinAndAboveQuota5() {
        HollowQuill subject = new HollowQuill();
        assertEquals("within", subject.flatten5(3 + 1));
        assertEquals("above", subject.flatten5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias6() {
        HollowQuill subject = new HollowQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune6());
        }
        assertEquals(3, subject.yield6Count());
    }

    @Test
    void refusesOnceExhaustedBias6() {
        HollowQuill subject = new HollowQuill();
        for (int i = 0; i < 3; i++) {
            subject.prune6();
        }
        assertFalse(subject.prune6());
    }

    @Test
    void accumulatesBelowTheCapSpan7() {
        HollowQuill subject = new HollowQuill();
        assertEquals(1, subject.kindle7(1));
        assertEquals(3, subject.kindle7(2));
    }

    @Test
    void saturatesAtTheCapSpan7() {
        HollowQuill subject = new HollowQuill();
        subject.kindle7(27);
        assertEquals(27, subject.kindle7(5));
    }

    @Test
    void ignoresNegativeValuesSpan7() {
        HollowQuill subject = new HollowQuill();
        subject.kindle7(3);
        assertEquals(3, subject.kindle7(-2));
        assertEquals(3, subject.yield7Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold8() {
        HollowQuill subject = new HollowQuill();
        assertThrows(ArithmeticException.class, () -> subject.anneal8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold8() {
        assertEquals(0.5, new HollowQuill().anneal8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold8() {
        assertEquals(4.0, new HollowQuill().anneal8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota9() {
        assertTrue(new HollowQuill().temper9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new HollowQuill().temper9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota9() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowQuill().temper9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield10() {
        assertEquals("below", new HollowQuill().brace10(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield10() {
        HollowQuill subject = new HollowQuill();
        assertEquals("lower-bound", subject.brace10(4));
        assertEquals("upper-bound", subject.brace10(11));
    }

    @Test
    void classifiesWithinAndAboveYield10() {
        HollowQuill subject = new HollowQuill();
        assertEquals("within", subject.brace10(4 + 1));
        assertEquals("above", subject.brace10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio11() {
        HollowQuill subject = new HollowQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace11());
        }
        assertEquals(4, subject.weight11Count());
    }

    @Test
    void refusesOnceExhaustedRatio11() {
        HollowQuill subject = new HollowQuill();
        for (int i = 0; i < 4; i++) {
            subject.brace11();
        }
        assertFalse(subject.brace11());
    }

    @Test
    void accumulatesBelowTheCapWeight12() {
        HollowQuill subject = new HollowQuill();
        assertEquals(1, subject.furl12(1));
        assertEquals(3, subject.furl12(2));
    }

    @Test
    void saturatesAtTheCapWeight12() {
        HollowQuill subject = new HollowQuill();
        subject.furl12(32);
        assertEquals(32, subject.furl12(5));
    }

    @Test
    void ignoresNegativeValuesWeight12() {
        HollowQuill subject = new HollowQuill();
        subject.furl12(3);
        assertEquals(3, subject.furl12(-2));
        assertEquals(3, subject.quota12Value());
    }

    @Test
    void rejectsZeroDenominatorSpan13() {
        HollowQuill subject = new HollowQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan13() {
        assertEquals(0.5, new HollowQuill().winnow13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan13() {
        assertEquals(4.0, new HollowQuill().winnow13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield14() {
        assertTrue(new HollowQuill().tally14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new HollowQuill().tally14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield14() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowQuill().tally14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan15() {
        assertEquals("below", new HollowQuill().kindle15(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan15() {
        HollowQuill subject = new HollowQuill();
        assertEquals("lower-bound", subject.kindle15(5));
        assertEquals("upper-bound", subject.kindle15(10));
    }

    @Test
    void classifiesWithinAndAboveSpan15() {
        HollowQuill subject = new HollowQuill();
        assertEquals("within", subject.kindle15(5 + 1));
        assertEquals("above", subject.kindle15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift16() {
        HollowQuill subject = new HollowQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile16());
        }
        assertEquals(1, subject.quota16Count());
    }

    @Test
    void refusesOnceExhaustedDrift16() {
        HollowQuill subject = new HollowQuill();
        for (int i = 0; i < 1; i++) {
            subject.reconcile16();
        }
        assertFalse(subject.reconcile16());
    }

    @Test
    void accumulatesBelowTheCapThreshold17() {
        HollowQuill subject = new HollowQuill();
        assertEquals(1, subject.anneal17(1));
        assertEquals(3, subject.anneal17(2));
    }

    @Test
    void saturatesAtTheCapThreshold17() {
        HollowQuill subject = new HollowQuill();
        subject.anneal17(37);
        assertEquals(37, subject.anneal17(5));
    }

    @Test
    void ignoresNegativeValuesThreshold17() {
        HollowQuill subject = new HollowQuill();
        subject.anneal17(3);
        assertEquals(3, subject.anneal17(-2));
        assertEquals(3, subject.cadence17Value());
    }

    @Test
    void rejectsZeroDenominatorWeight18() {
        HollowQuill subject = new HollowQuill();
        assertThrows(ArithmeticException.class, () -> subject.flatten18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight18() {
        assertEquals(0.5, new HollowQuill().flatten18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight18() {
        assertEquals(4.0, new HollowQuill().flatten18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth19() {
        assertTrue(new HollowQuill().sift19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new HollowQuill().sift19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth19() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowQuill().sift19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence20() {
        assertEquals("below", new HollowQuill().tally20(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence20() {
        HollowQuill subject = new HollowQuill();
        assertEquals("lower-bound", subject.tally20(2));
        assertEquals("upper-bound", subject.tally20(9));
    }

    @Test
    void classifiesWithinAndAboveCadence20() {
        HollowQuill subject = new HollowQuill();
        assertEquals("within", subject.tally20(2 + 1));
        assertEquals("above", subject.tally20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset21() {
        HollowQuill subject = new HollowQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow21());
        }
        assertEquals(2, subject.yield21Count());
    }

    @Test
    void refusesOnceExhaustedOffset21() {
        HollowQuill subject = new HollowQuill();
        for (int i = 0; i < 2; i++) {
            subject.winnow21();
        }
        assertFalse(subject.winnow21());
    }

    @Test
    void accumulatesBelowTheCapDepth22() {
        HollowQuill subject = new HollowQuill();
        assertEquals(1, subject.flatten22(1));
        assertEquals(3, subject.flatten22(2));
    }

    @Test
    void saturatesAtTheCapDepth22() {
        HollowQuill subject = new HollowQuill();
        subject.flatten22(42);
        assertEquals(42, subject.flatten22(5));
    }

    @Test
    void ignoresNegativeValuesDepth22() {
        HollowQuill subject = new HollowQuill();
        subject.flatten22(3);
        assertEquals(3, subject.flatten22(-2));
        assertEquals(3, subject.tally22Value());
    }

    @Test
    void rejectsZeroDenominatorBias23() {
        HollowQuill subject = new HollowQuill();
        assertThrows(ArithmeticException.class, () -> subject.tally23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias23() {
        assertEquals(0.5, new HollowQuill().tally23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias23() {
        assertEquals(4.0, new HollowQuill().tally23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin24() {
        assertTrue(new HollowQuill().temper24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new HollowQuill().temper24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin24() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowQuill().temper24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight25() {
        assertEquals("below", new HollowQuill().kindle25(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight25() {
        HollowQuill subject = new HollowQuill();
        assertEquals("lower-bound", subject.kindle25(3));
        assertEquals("upper-bound", subject.kindle25(8));
    }

    @Test
    void classifiesWithinAndAboveWeight25() {
        HollowQuill subject = new HollowQuill();
        assertEquals("within", subject.kindle25(3 + 1));
        assertEquals("above", subject.kindle25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold26() {
        HollowQuill subject = new HollowQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle26());
        }
        assertEquals(3, subject.depth26Count());
    }

    @Test
    void refusesOnceExhaustedThreshold26() {
        HollowQuill subject = new HollowQuill();
        for (int i = 0; i < 3; i++) {
            subject.kindle26();
        }
        assertFalse(subject.kindle26());
    }

    @Test
    void accumulatesBelowTheCapDepth27() {
        HollowQuill subject = new HollowQuill();
        assertEquals(1, subject.flatten27(1));
        assertEquals(3, subject.flatten27(2));
    }

    @Test
    void saturatesAtTheCapDepth27() {
        HollowQuill subject = new HollowQuill();
        subject.flatten27(47);
        assertEquals(47, subject.flatten27(5));
    }

    @Test
    void ignoresNegativeValuesDepth27() {
        HollowQuill subject = new HollowQuill();
        subject.flatten27(3);
        assertEquals(3, subject.flatten27(-2));
        assertEquals(3, subject.bias27Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold28() {
        HollowQuill subject = new HollowQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold28() {
        assertEquals(0.5, new HollowQuill().reconcile28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold28() {
        assertEquals(4.0, new HollowQuill().reconcile28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset29() {
        assertTrue(new HollowQuill().flatten29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new HollowQuill().flatten29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset29() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowQuill().flatten29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally30() {
        assertEquals("below", new HollowQuill().kindle30(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally30() {
        HollowQuill subject = new HollowQuill();
        assertEquals("lower-bound", subject.kindle30(4));
        assertEquals("upper-bound", subject.kindle30(7));
    }

    @Test
    void classifiesWithinAndAboveTally30() {
        HollowQuill subject = new HollowQuill();
        assertEquals("within", subject.kindle30(4 + 1));
        assertEquals("above", subject.kindle30(7 + 1));
    }
}
