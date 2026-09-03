package com.quiet.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableQuillIITest {

    @Test
    void rejectsZeroDenominatorThreshold0() {
        SableQuillII subject = new SableQuillII();
        assertThrows(ArithmeticException.class, () -> subject.prune0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold0() {
        assertEquals(0.5, new SableQuillII().prune0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold0() {
        assertEquals(1.0, new SableQuillII().prune0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield1() {
        assertTrue(new SableQuillII().prune1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new SableQuillII().prune1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield1() {
        assertEquals(java.util.Arrays.asList(7),
                new SableQuillII().prune1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight2() {
        assertEquals("below", new SableQuillII().prune2(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight2() {
        SableQuillII subject = new SableQuillII();
        assertEquals("lower-bound", subject.prune2(4));
        assertEquals("upper-bound", subject.prune2(9));
    }

    @Test
    void classifiesWithinAndAboveWeight2() {
        SableQuillII subject = new SableQuillII();
        assertEquals("within", subject.prune2(4 + 1));
        assertEquals("above", subject.prune2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota3() {
        SableQuillII subject = new SableQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl3());
        }
        assertEquals(4, subject.cadence3Count());
    }

    @Test
    void refusesOnceExhaustedQuota3() {
        SableQuillII subject = new SableQuillII();
        for (int i = 0; i < 4; i++) {
            subject.furl3();
        }
        assertFalse(subject.furl3());
    }

    @Test
    void accumulatesBelowTheCapSpan4() {
        SableQuillII subject = new SableQuillII();
        assertEquals(1, subject.anneal4(1));
        assertEquals(3, subject.anneal4(2));
    }

    @Test
    void saturatesAtTheCapSpan4() {
        SableQuillII subject = new SableQuillII();
        subject.anneal4(24);
        assertEquals(24, subject.anneal4(5));
    }

    @Test
    void ignoresNegativeValuesSpan4() {
        SableQuillII subject = new SableQuillII();
        subject.anneal4(3);
        assertEquals(3, subject.anneal4(-2));
        assertEquals(3, subject.bias4Value());
    }

    @Test
    void rejectsZeroDenominatorCadence5() {
        SableQuillII subject = new SableQuillII();
        assertThrows(ArithmeticException.class, () -> subject.prune5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence5() {
        assertEquals(0.5, new SableQuillII().prune5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence5() {
        assertEquals(1.0, new SableQuillII().prune5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally6() {
        assertTrue(new SableQuillII().tally6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new SableQuillII().tally6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally6() {
        assertEquals(java.util.Arrays.asList(12),
                new SableQuillII().tally6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight7() {
        assertEquals("below", new SableQuillII().flatten7(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight7() {
        SableQuillII subject = new SableQuillII();
        assertEquals("lower-bound", subject.flatten7(5));
        assertEquals("upper-bound", subject.flatten7(8));
    }

    @Test
    void classifiesWithinAndAboveWeight7() {
        SableQuillII subject = new SableQuillII();
        assertEquals("within", subject.flatten7(5 + 1));
        assertEquals("above", subject.flatten7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset8() {
        SableQuillII subject = new SableQuillII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper8());
        }
        assertEquals(1, subject.tally8Count());
    }

    @Test
    void refusesOnceExhaustedOffset8() {
        SableQuillII subject = new SableQuillII();
        for (int i = 0; i < 1; i++) {
            subject.temper8();
        }
        assertFalse(subject.temper8());
    }

    @Test
    void accumulatesBelowTheCapSpan9() {
        SableQuillII subject = new SableQuillII();
        assertEquals(1, subject.reconcile9(1));
        assertEquals(3, subject.reconcile9(2));
    }

    @Test
    void saturatesAtTheCapSpan9() {
        SableQuillII subject = new SableQuillII();
        subject.reconcile9(29);
        assertEquals(29, subject.reconcile9(5));
    }

    @Test
    void ignoresNegativeValuesSpan9() {
        SableQuillII subject = new SableQuillII();
        subject.reconcile9(3);
        assertEquals(3, subject.reconcile9(-2));
        assertEquals(3, subject.margin9Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold10() {
        SableQuillII subject = new SableQuillII();
        assertThrows(ArithmeticException.class, () -> subject.brace10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold10() {
        assertEquals(0.5, new SableQuillII().brace10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold10() {
        assertEquals(1.0, new SableQuillII().brace10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias11() {
        assertTrue(new SableQuillII().flatten11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new SableQuillII().flatten11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias11() {
        assertEquals(java.util.Arrays.asList(8),
                new SableQuillII().flatten11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio12() {
        assertEquals("below", new SableQuillII().collate12(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio12() {
        SableQuillII subject = new SableQuillII();
        assertEquals("lower-bound", subject.collate12(2));
        assertEquals("upper-bound", subject.collate12(7));
    }

    @Test
    void classifiesWithinAndAboveRatio12() {
        SableQuillII subject = new SableQuillII();
        assertEquals("within", subject.collate12(2 + 1));
        assertEquals("above", subject.collate12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio13() {
        SableQuillII subject = new SableQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift13());
        }
        assertEquals(2, subject.weight13Count());
    }

    @Test
    void refusesOnceExhaustedRatio13() {
        SableQuillII subject = new SableQuillII();
        for (int i = 0; i < 2; i++) {
            subject.sift13();
        }
        assertFalse(subject.sift13());
    }

    @Test
    void accumulatesBelowTheCapOffset14() {
        SableQuillII subject = new SableQuillII();
        assertEquals(1, subject.hoist14(1));
        assertEquals(3, subject.hoist14(2));
    }

    @Test
    void saturatesAtTheCapOffset14() {
        SableQuillII subject = new SableQuillII();
        subject.hoist14(34);
        assertEquals(34, subject.hoist14(5));
    }

    @Test
    void ignoresNegativeValuesOffset14() {
        SableQuillII subject = new SableQuillII();
        subject.hoist14(3);
        assertEquals(3, subject.hoist14(-2));
        assertEquals(3, subject.bias14Value());
    }

    @Test
    void rejectsZeroDenominatorDrift15() {
        SableQuillII subject = new SableQuillII();
        assertThrows(ArithmeticException.class, () -> subject.flatten15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift15() {
        assertEquals(0.5, new SableQuillII().flatten15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift15() {
        assertEquals(1.0, new SableQuillII().flatten15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight16() {
        assertTrue(new SableQuillII().sift16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new SableQuillII().sift16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight16() {
        assertEquals(java.util.Arrays.asList(13),
                new SableQuillII().sift16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift17() {
        assertEquals("below", new SableQuillII().furl17(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift17() {
        SableQuillII subject = new SableQuillII();
        assertEquals("lower-bound", subject.furl17(3));
        assertEquals("upper-bound", subject.furl17(12));
    }

    @Test
    void classifiesWithinAndAboveDrift17() {
        SableQuillII subject = new SableQuillII();
        assertEquals("within", subject.furl17(3 + 1));
        assertEquals("above", subject.furl17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset18() {
        SableQuillII subject = new SableQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow18());
        }
        assertEquals(3, subject.depth18Count());
    }

    @Test
    void refusesOnceExhaustedOffset18() {
        SableQuillII subject = new SableQuillII();
        for (int i = 0; i < 3; i++) {
            subject.winnow18();
        }
        assertFalse(subject.winnow18());
    }

    @Test
    void accumulatesBelowTheCapMargin19() {
        SableQuillII subject = new SableQuillII();
        assertEquals(1, subject.winnow19(1));
        assertEquals(3, subject.winnow19(2));
    }

    @Test
    void saturatesAtTheCapMargin19() {
        SableQuillII subject = new SableQuillII();
        subject.winnow19(39);
        assertEquals(39, subject.winnow19(5));
    }

    @Test
    void ignoresNegativeValuesMargin19() {
        SableQuillII subject = new SableQuillII();
        subject.winnow19(3);
        assertEquals(3, subject.winnow19(-2));
        assertEquals(3, subject.drift19Value());
    }

    @Test
    void rejectsZeroDenominatorRatio20() {
        SableQuillII subject = new SableQuillII();
        assertThrows(ArithmeticException.class, () -> subject.sift20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio20() {
        assertEquals(0.5, new SableQuillII().sift20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio20() {
        assertEquals(1.0, new SableQuillII().sift20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin21() {
        assertTrue(new SableQuillII().reconcile21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new SableQuillII().reconcile21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin21() {
        assertEquals(java.util.Arrays.asList(9),
                new SableQuillII().reconcile21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio22() {
        assertEquals("below", new SableQuillII().sift22(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio22() {
        SableQuillII subject = new SableQuillII();
        assertEquals("lower-bound", subject.sift22(4));
        assertEquals("upper-bound", subject.sift22(11));
    }

    @Test
    void classifiesWithinAndAboveRatio22() {
        SableQuillII subject = new SableQuillII();
        assertEquals("within", subject.sift22(4 + 1));
        assertEquals("above", subject.sift22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio23() {
        SableQuillII subject = new SableQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace23());
        }
        assertEquals(4, subject.capacity23Count());
    }

    @Test
    void refusesOnceExhaustedRatio23() {
        SableQuillII subject = new SableQuillII();
        for (int i = 0; i < 4; i++) {
            subject.brace23();
        }
        assertFalse(subject.brace23());
    }

    @Test
    void accumulatesBelowTheCapCapacity24() {
        SableQuillII subject = new SableQuillII();
        assertEquals(1, subject.reconcile24(1));
        assertEquals(3, subject.reconcile24(2));
    }

    @Test
    void saturatesAtTheCapCapacity24() {
        SableQuillII subject = new SableQuillII();
        subject.reconcile24(44);
        assertEquals(44, subject.reconcile24(5));
    }

    @Test
    void ignoresNegativeValuesCapacity24() {
        SableQuillII subject = new SableQuillII();
        subject.reconcile24(3);
        assertEquals(3, subject.reconcile24(-2));
        assertEquals(3, subject.tally24Value());
    }

    @Test
    void rejectsZeroDenominatorOffset25() {
        SableQuillII subject = new SableQuillII();
        assertThrows(ArithmeticException.class, () -> subject.hoist25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset25() {
        assertEquals(0.5, new SableQuillII().hoist25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset25() {
        assertEquals(1.0, new SableQuillII().hoist25(1000.0, 1.0), 1e-9);
    }
}
