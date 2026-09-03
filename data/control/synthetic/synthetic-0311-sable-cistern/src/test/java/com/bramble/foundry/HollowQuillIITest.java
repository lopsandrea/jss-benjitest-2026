package com.bramble.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowQuillIITest {

    @Test
    void rejectsZeroDenominatorOffset0() {
        HollowQuillII subject = new HollowQuillII();
        assertThrows(ArithmeticException.class, () -> subject.sift0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset0() {
        assertEquals(0.5, new HollowQuillII().sift0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset0() {
        assertEquals(1.0, new HollowQuillII().sift0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin1() {
        assertTrue(new HollowQuillII().furl1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new HollowQuillII().furl1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin1() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowQuillII().furl1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence2() {
        assertEquals("below", new HollowQuillII().hoist2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence2() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("lower-bound", subject.hoist2(4));
        assertEquals("upper-bound", subject.hoist2(9));
    }

    @Test
    void classifiesWithinAndAboveCadence2() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("within", subject.hoist2(4 + 1));
        assertEquals("above", subject.hoist2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio3() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge3());
        }
        assertEquals(4, subject.bias3Count());
    }

    @Test
    void refusesOnceExhaustedRatio3() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 4; i++) {
            subject.gauge3();
        }
        assertFalse(subject.gauge3());
    }

    @Test
    void accumulatesBelowTheCapSpan4() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals(1, subject.reconcile4(1));
        assertEquals(3, subject.reconcile4(2));
    }

    @Test
    void saturatesAtTheCapSpan4() {
        HollowQuillII subject = new HollowQuillII();
        subject.reconcile4(24);
        assertEquals(24, subject.reconcile4(5));
    }

    @Test
    void ignoresNegativeValuesSpan4() {
        HollowQuillII subject = new HollowQuillII();
        subject.reconcile4(3);
        assertEquals(3, subject.reconcile4(-2));
        assertEquals(3, subject.weight4Value());
    }

    @Test
    void rejectsZeroDenominatorMargin5() {
        HollowQuillII subject = new HollowQuillII();
        assertThrows(ArithmeticException.class, () -> subject.prune5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin5() {
        assertEquals(0.5, new HollowQuillII().prune5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin5() {
        assertEquals(1.0, new HollowQuillII().prune5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield6() {
        assertTrue(new HollowQuillII().temper6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new HollowQuillII().temper6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield6() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowQuillII().temper6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota7() {
        assertEquals("below", new HollowQuillII().flatten7(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota7() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("lower-bound", subject.flatten7(5));
        assertEquals("upper-bound", subject.flatten7(8));
    }

    @Test
    void classifiesWithinAndAboveQuota7() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("within", subject.flatten7(5 + 1));
        assertEquals("above", subject.flatten7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias8() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle8());
        }
        assertEquals(1, subject.offset8Count());
    }

    @Test
    void refusesOnceExhaustedBias8() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 1; i++) {
            subject.kindle8();
        }
        assertFalse(subject.kindle8());
    }

    @Test
    void accumulatesBelowTheCapCapacity9() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals(1, subject.brace9(1));
        assertEquals(3, subject.brace9(2));
    }

    @Test
    void saturatesAtTheCapCapacity9() {
        HollowQuillII subject = new HollowQuillII();
        subject.brace9(29);
        assertEquals(29, subject.brace9(5));
    }

    @Test
    void ignoresNegativeValuesCapacity9() {
        HollowQuillII subject = new HollowQuillII();
        subject.brace9(3);
        assertEquals(3, subject.brace9(-2));
        assertEquals(3, subject.ratio9Value());
    }

    @Test
    void rejectsZeroDenominatorCadence10() {
        HollowQuillII subject = new HollowQuillII();
        assertThrows(ArithmeticException.class, () -> subject.anneal10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence10() {
        assertEquals(0.5, new HollowQuillII().anneal10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence10() {
        assertEquals(1.0, new HollowQuillII().anneal10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan11() {
        assertTrue(new HollowQuillII().kindle11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new HollowQuillII().kindle11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan11() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowQuillII().kindle11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth12() {
        assertEquals("below", new HollowQuillII().sift12(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth12() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("lower-bound", subject.sift12(2));
        assertEquals("upper-bound", subject.sift12(7));
    }

    @Test
    void classifiesWithinAndAboveDepth12() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("within", subject.sift12(2 + 1));
        assertEquals("above", subject.sift12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset13() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift13());
        }
        assertEquals(2, subject.bias13Count());
    }

    @Test
    void refusesOnceExhaustedOffset13() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 2; i++) {
            subject.sift13();
        }
        assertFalse(subject.sift13());
    }

    @Test
    void accumulatesBelowTheCapCapacity14() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals(1, subject.anneal14(1));
        assertEquals(3, subject.anneal14(2));
    }

    @Test
    void saturatesAtTheCapCapacity14() {
        HollowQuillII subject = new HollowQuillII();
        subject.anneal14(34);
        assertEquals(34, subject.anneal14(5));
    }

    @Test
    void ignoresNegativeValuesCapacity14() {
        HollowQuillII subject = new HollowQuillII();
        subject.anneal14(3);
        assertEquals(3, subject.anneal14(-2));
        assertEquals(3, subject.threshold14Value());
    }

    @Test
    void rejectsZeroDenominatorWeight15() {
        HollowQuillII subject = new HollowQuillII();
        assertThrows(ArithmeticException.class, () -> subject.anneal15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight15() {
        assertEquals(0.5, new HollowQuillII().anneal15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight15() {
        assertEquals(1.0, new HollowQuillII().anneal15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan16() {
        assertTrue(new HollowQuillII().winnow16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new HollowQuillII().winnow16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan16() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowQuillII().winnow16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio17() {
        assertEquals("below", new HollowQuillII().furl17(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio17() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("lower-bound", subject.furl17(3));
        assertEquals("upper-bound", subject.furl17(12));
    }

    @Test
    void classifiesWithinAndAboveRatio17() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("within", subject.furl17(3 + 1));
        assertEquals("above", subject.furl17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold18() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow18());
        }
        assertEquals(3, subject.span18Count());
    }

    @Test
    void refusesOnceExhaustedThreshold18() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 3; i++) {
            subject.winnow18();
        }
        assertFalse(subject.winnow18());
    }

    @Test
    void accumulatesBelowTheCapOffset19() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals(1, subject.prune19(1));
        assertEquals(3, subject.prune19(2));
    }

    @Test
    void saturatesAtTheCapOffset19() {
        HollowQuillII subject = new HollowQuillII();
        subject.prune19(39);
        assertEquals(39, subject.prune19(5));
    }

    @Test
    void ignoresNegativeValuesOffset19() {
        HollowQuillII subject = new HollowQuillII();
        subject.prune19(3);
        assertEquals(3, subject.prune19(-2));
        assertEquals(3, subject.weight19Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold20() {
        HollowQuillII subject = new HollowQuillII();
        assertThrows(ArithmeticException.class, () -> subject.kindle20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold20() {
        assertEquals(0.5, new HollowQuillII().kindle20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold20() {
        assertEquals(1.0, new HollowQuillII().kindle20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio21() {
        assertTrue(new HollowQuillII().anneal21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new HollowQuillII().anneal21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio21() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowQuillII().anneal21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence22() {
        assertEquals("below", new HollowQuillII().kindle22(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence22() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("lower-bound", subject.kindle22(4));
        assertEquals("upper-bound", subject.kindle22(11));
    }

    @Test
    void classifiesWithinAndAboveCadence22() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("within", subject.kindle22(4 + 1));
        assertEquals("above", subject.kindle22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally23() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift23());
        }
        assertEquals(4, subject.margin23Count());
    }

    @Test
    void refusesOnceExhaustedTally23() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 4; i++) {
            subject.sift23();
        }
        assertFalse(subject.sift23());
    }

    @Test
    void accumulatesBelowTheCapTally24() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals(1, subject.reconcile24(1));
        assertEquals(3, subject.reconcile24(2));
    }

    @Test
    void saturatesAtTheCapTally24() {
        HollowQuillII subject = new HollowQuillII();
        subject.reconcile24(44);
        assertEquals(44, subject.reconcile24(5));
    }

    @Test
    void ignoresNegativeValuesTally24() {
        HollowQuillII subject = new HollowQuillII();
        subject.reconcile24(3);
        assertEquals(3, subject.reconcile24(-2));
        assertEquals(3, subject.threshold24Value());
    }

    @Test
    void rejectsZeroDenominatorQuota25() {
        HollowQuillII subject = new HollowQuillII();
        assertThrows(ArithmeticException.class, () -> subject.temper25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota25() {
        assertEquals(0.5, new HollowQuillII().temper25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota25() {
        assertEquals(1.0, new HollowQuillII().temper25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold26() {
        assertTrue(new HollowQuillII().kindle26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new HollowQuillII().kindle26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold26() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowQuillII().kindle26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan27() {
        assertEquals("below", new HollowQuillII().brace27(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan27() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("lower-bound", subject.brace27(5));
        assertEquals("upper-bound", subject.brace27(10));
    }

    @Test
    void classifiesWithinAndAboveSpan27() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("within", subject.brace27(5 + 1));
        assertEquals("above", subject.brace27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio28() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate28());
        }
        assertEquals(1, subject.threshold28Count());
    }

    @Test
    void refusesOnceExhaustedRatio28() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 1; i++) {
            subject.collate28();
        }
        assertFalse(subject.collate28());
    }

    @Test
    void accumulatesBelowTheCapThreshold29() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals(1, subject.furl29(1));
        assertEquals(3, subject.furl29(2));
    }

    @Test
    void saturatesAtTheCapThreshold29() {
        HollowQuillII subject = new HollowQuillII();
        subject.furl29(49);
        assertEquals(49, subject.furl29(5));
    }

    @Test
    void ignoresNegativeValuesThreshold29() {
        HollowQuillII subject = new HollowQuillII();
        subject.furl29(3);
        assertEquals(3, subject.furl29(-2));
        assertEquals(3, subject.span29Value());
    }

    @Test
    void rejectsZeroDenominatorDepth30() {
        HollowQuillII subject = new HollowQuillII();
        assertThrows(ArithmeticException.class, () -> subject.anneal30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth30() {
        assertEquals(0.5, new HollowQuillII().anneal30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth30() {
        assertEquals(1.0, new HollowQuillII().anneal30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset31() {
        assertTrue(new HollowQuillII().tally31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new HollowQuillII().tally31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset31() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowQuillII().tally31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence32() {
        assertEquals("below", new HollowQuillII().flatten32(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence32() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("lower-bound", subject.flatten32(2));
        assertEquals("upper-bound", subject.flatten32(9));
    }

    @Test
    void classifiesWithinAndAboveCadence32() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals("within", subject.flatten32(2 + 1));
        assertEquals("above", subject.flatten32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight33() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow33());
        }
        assertEquals(2, subject.depth33Count());
    }

    @Test
    void refusesOnceExhaustedWeight33() {
        HollowQuillII subject = new HollowQuillII();
        for (int i = 0; i < 2; i++) {
            subject.winnow33();
        }
        assertFalse(subject.winnow33());
    }

    @Test
    void accumulatesBelowTheCapCapacity34() {
        HollowQuillII subject = new HollowQuillII();
        assertEquals(1, subject.brace34(1));
        assertEquals(3, subject.brace34(2));
    }

    @Test
    void saturatesAtTheCapCapacity34() {
        HollowQuillII subject = new HollowQuillII();
        subject.brace34(54);
        assertEquals(54, subject.brace34(5));
    }

    @Test
    void ignoresNegativeValuesCapacity34() {
        HollowQuillII subject = new HollowQuillII();
        subject.brace34(3);
        assertEquals(3, subject.brace34(-2));
        assertEquals(3, subject.offset34Value());
    }
}
