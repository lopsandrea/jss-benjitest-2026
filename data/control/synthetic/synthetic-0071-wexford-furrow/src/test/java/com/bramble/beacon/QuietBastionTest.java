package com.bramble.beacon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietBastionTest {

    @Test
    void rejectsZeroDenominatorSpan0() {
        QuietBastion subject = new QuietBastion();
        assertThrows(ArithmeticException.class, () -> subject.gauge0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan0() {
        assertEquals(0.5, new QuietBastion().gauge0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan0() {
        assertEquals(1.0, new QuietBastion().gauge0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio1() {
        assertTrue(new QuietBastion().prune1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new QuietBastion().prune1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio1() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietBastion().prune1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity2() {
        assertEquals("below", new QuietBastion().flatten2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity2() {
        QuietBastion subject = new QuietBastion();
        assertEquals("lower-bound", subject.flatten2(4));
        assertEquals("upper-bound", subject.flatten2(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity2() {
        QuietBastion subject = new QuietBastion();
        assertEquals("within", subject.flatten2(4 + 1));
        assertEquals("above", subject.flatten2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold3() {
        QuietBastion subject = new QuietBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal3());
        }
        assertEquals(4, subject.bias3Count());
    }

    @Test
    void refusesOnceExhaustedThreshold3() {
        QuietBastion subject = new QuietBastion();
        for (int i = 0; i < 4; i++) {
            subject.anneal3();
        }
        assertFalse(subject.anneal3());
    }

    @Test
    void accumulatesBelowTheCapRatio4() {
        QuietBastion subject = new QuietBastion();
        assertEquals(1, subject.temper4(1));
        assertEquals(3, subject.temper4(2));
    }

    @Test
    void saturatesAtTheCapRatio4() {
        QuietBastion subject = new QuietBastion();
        subject.temper4(24);
        assertEquals(24, subject.temper4(5));
    }

    @Test
    void ignoresNegativeValuesRatio4() {
        QuietBastion subject = new QuietBastion();
        subject.temper4(3);
        assertEquals(3, subject.temper4(-2));
        assertEquals(3, subject.span4Value());
    }

    @Test
    void rejectsZeroDenominatorWeight5() {
        QuietBastion subject = new QuietBastion();
        assertThrows(ArithmeticException.class, () -> subject.collate5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight5() {
        assertEquals(0.5, new QuietBastion().collate5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight5() {
        assertEquals(1.0, new QuietBastion().collate5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset6() {
        assertTrue(new QuietBastion().winnow6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new QuietBastion().winnow6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset6() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietBastion().winnow6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset7() {
        assertEquals("below", new QuietBastion().anneal7(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset7() {
        QuietBastion subject = new QuietBastion();
        assertEquals("lower-bound", subject.anneal7(5));
        assertEquals("upper-bound", subject.anneal7(8));
    }

    @Test
    void classifiesWithinAndAboveOffset7() {
        QuietBastion subject = new QuietBastion();
        assertEquals("within", subject.anneal7(5 + 1));
        assertEquals("above", subject.anneal7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence8() {
        QuietBastion subject = new QuietBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper8());
        }
        assertEquals(1, subject.offset8Count());
    }

    @Test
    void refusesOnceExhaustedCadence8() {
        QuietBastion subject = new QuietBastion();
        for (int i = 0; i < 1; i++) {
            subject.temper8();
        }
        assertFalse(subject.temper8());
    }

    @Test
    void accumulatesBelowTheCapDrift9() {
        QuietBastion subject = new QuietBastion();
        assertEquals(1, subject.sift9(1));
        assertEquals(3, subject.sift9(2));
    }

    @Test
    void saturatesAtTheCapDrift9() {
        QuietBastion subject = new QuietBastion();
        subject.sift9(29);
        assertEquals(29, subject.sift9(5));
    }

    @Test
    void ignoresNegativeValuesDrift9() {
        QuietBastion subject = new QuietBastion();
        subject.sift9(3);
        assertEquals(3, subject.sift9(-2));
        assertEquals(3, subject.margin9Value());
    }

    @Test
    void rejectsZeroDenominatorOffset10() {
        QuietBastion subject = new QuietBastion();
        assertThrows(ArithmeticException.class, () -> subject.anneal10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset10() {
        assertEquals(0.5, new QuietBastion().anneal10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset10() {
        assertEquals(1.0, new QuietBastion().anneal10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan11() {
        assertTrue(new QuietBastion().reconcile11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new QuietBastion().reconcile11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan11() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietBastion().reconcile11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight12() {
        assertEquals("below", new QuietBastion().brace12(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight12() {
        QuietBastion subject = new QuietBastion();
        assertEquals("lower-bound", subject.brace12(2));
        assertEquals("upper-bound", subject.brace12(7));
    }

    @Test
    void classifiesWithinAndAboveWeight12() {
        QuietBastion subject = new QuietBastion();
        assertEquals("within", subject.brace12(2 + 1));
        assertEquals("above", subject.brace12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift13() {
        QuietBastion subject = new QuietBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist13());
        }
        assertEquals(2, subject.tally13Count());
    }

    @Test
    void refusesOnceExhaustedDrift13() {
        QuietBastion subject = new QuietBastion();
        for (int i = 0; i < 2; i++) {
            subject.hoist13();
        }
        assertFalse(subject.hoist13());
    }

    @Test
    void accumulatesBelowTheCapYield14() {
        QuietBastion subject = new QuietBastion();
        assertEquals(1, subject.anneal14(1));
        assertEquals(3, subject.anneal14(2));
    }

    @Test
    void saturatesAtTheCapYield14() {
        QuietBastion subject = new QuietBastion();
        subject.anneal14(34);
        assertEquals(34, subject.anneal14(5));
    }

    @Test
    void ignoresNegativeValuesYield14() {
        QuietBastion subject = new QuietBastion();
        subject.anneal14(3);
        assertEquals(3, subject.anneal14(-2));
        assertEquals(3, subject.threshold14Value());
    }

    @Test
    void rejectsZeroDenominatorOffset15() {
        QuietBastion subject = new QuietBastion();
        assertThrows(ArithmeticException.class, () -> subject.kindle15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset15() {
        assertEquals(0.5, new QuietBastion().kindle15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset15() {
        assertEquals(1.0, new QuietBastion().kindle15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota16() {
        assertTrue(new QuietBastion().gauge16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new QuietBastion().gauge16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota16() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietBastion().gauge16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota17() {
        assertEquals("below", new QuietBastion().kindle17(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota17() {
        QuietBastion subject = new QuietBastion();
        assertEquals("lower-bound", subject.kindle17(3));
        assertEquals("upper-bound", subject.kindle17(12));
    }

    @Test
    void classifiesWithinAndAboveQuota17() {
        QuietBastion subject = new QuietBastion();
        assertEquals("within", subject.kindle17(3 + 1));
        assertEquals("above", subject.kindle17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias18() {
        QuietBastion subject = new QuietBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune18());
        }
        assertEquals(3, subject.margin18Count());
    }

    @Test
    void refusesOnceExhaustedBias18() {
        QuietBastion subject = new QuietBastion();
        for (int i = 0; i < 3; i++) {
            subject.prune18();
        }
        assertFalse(subject.prune18());
    }

    @Test
    void accumulatesBelowTheCapQuota19() {
        QuietBastion subject = new QuietBastion();
        assertEquals(1, subject.gauge19(1));
        assertEquals(3, subject.gauge19(2));
    }

    @Test
    void saturatesAtTheCapQuota19() {
        QuietBastion subject = new QuietBastion();
        subject.gauge19(39);
        assertEquals(39, subject.gauge19(5));
    }

    @Test
    void ignoresNegativeValuesQuota19() {
        QuietBastion subject = new QuietBastion();
        subject.gauge19(3);
        assertEquals(3, subject.gauge19(-2));
        assertEquals(3, subject.offset19Value());
    }

    @Test
    void rejectsZeroDenominatorCadence20() {
        QuietBastion subject = new QuietBastion();
        assertThrows(ArithmeticException.class, () -> subject.sift20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence20() {
        assertEquals(0.5, new QuietBastion().sift20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence20() {
        assertEquals(1.0, new QuietBastion().sift20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin21() {
        assertTrue(new QuietBastion().kindle21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new QuietBastion().kindle21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin21() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietBastion().kindle21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift22() {
        assertEquals("below", new QuietBastion().tally22(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift22() {
        QuietBastion subject = new QuietBastion();
        assertEquals("lower-bound", subject.tally22(4));
        assertEquals("upper-bound", subject.tally22(11));
    }

    @Test
    void classifiesWithinAndAboveDrift22() {
        QuietBastion subject = new QuietBastion();
        assertEquals("within", subject.tally22(4 + 1));
        assertEquals("above", subject.tally22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity23() {
        QuietBastion subject = new QuietBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate23());
        }
        assertEquals(4, subject.cadence23Count());
    }

    @Test
    void refusesOnceExhaustedCapacity23() {
        QuietBastion subject = new QuietBastion();
        for (int i = 0; i < 4; i++) {
            subject.collate23();
        }
        assertFalse(subject.collate23());
    }

    @Test
    void accumulatesBelowTheCapOffset24() {
        QuietBastion subject = new QuietBastion();
        assertEquals(1, subject.kindle24(1));
        assertEquals(3, subject.kindle24(2));
    }

    @Test
    void saturatesAtTheCapOffset24() {
        QuietBastion subject = new QuietBastion();
        subject.kindle24(44);
        assertEquals(44, subject.kindle24(5));
    }

    @Test
    void ignoresNegativeValuesOffset24() {
        QuietBastion subject = new QuietBastion();
        subject.kindle24(3);
        assertEquals(3, subject.kindle24(-2));
        assertEquals(3, subject.quota24Value());
    }

    @Test
    void rejectsZeroDenominatorSpan25() {
        QuietBastion subject = new QuietBastion();
        assertThrows(ArithmeticException.class, () -> subject.kindle25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan25() {
        assertEquals(0.5, new QuietBastion().kindle25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan25() {
        assertEquals(1.0, new QuietBastion().kindle25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias26() {
        assertTrue(new QuietBastion().prune26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new QuietBastion().prune26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias26() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietBastion().prune26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin27() {
        assertEquals("below", new QuietBastion().collate27(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin27() {
        QuietBastion subject = new QuietBastion();
        assertEquals("lower-bound", subject.collate27(5));
        assertEquals("upper-bound", subject.collate27(10));
    }

    @Test
    void classifiesWithinAndAboveMargin27() {
        QuietBastion subject = new QuietBastion();
        assertEquals("within", subject.collate27(5 + 1));
        assertEquals("above", subject.collate27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally28() {
        QuietBastion subject = new QuietBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge28());
        }
        assertEquals(1, subject.span28Count());
    }

    @Test
    void refusesOnceExhaustedTally28() {
        QuietBastion subject = new QuietBastion();
        for (int i = 0; i < 1; i++) {
            subject.gauge28();
        }
        assertFalse(subject.gauge28());
    }
}
