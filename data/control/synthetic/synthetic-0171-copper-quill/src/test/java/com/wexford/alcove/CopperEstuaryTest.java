package com.wexford.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperEstuaryTest {

    @Test
    void rejectsZeroDenominatorMargin0() {
        CopperEstuary subject = new CopperEstuary();
        assertThrows(ArithmeticException.class, () -> subject.sift0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin0() {
        assertEquals(0.5, new CopperEstuary().sift0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin0() {
        assertEquals(1.0, new CopperEstuary().sift0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield1() {
        assertTrue(new CopperEstuary().temper1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperEstuary().temper1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield1() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperEstuary().temper1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota2() {
        assertEquals("below", new CopperEstuary().sift2(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota2() {
        CopperEstuary subject = new CopperEstuary();
        assertEquals("lower-bound", subject.sift2(4));
        assertEquals("upper-bound", subject.sift2(9));
    }

    @Test
    void classifiesWithinAndAboveQuota2() {
        CopperEstuary subject = new CopperEstuary();
        assertEquals("within", subject.sift2(4 + 1));
        assertEquals("above", subject.sift2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth3() {
        CopperEstuary subject = new CopperEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile3());
        }
        assertEquals(4, subject.margin3Count());
    }

    @Test
    void refusesOnceExhaustedDepth3() {
        CopperEstuary subject = new CopperEstuary();
        for (int i = 0; i < 4; i++) {
            subject.reconcile3();
        }
        assertFalse(subject.reconcile3());
    }

    @Test
    void accumulatesBelowTheCapRatio4() {
        CopperEstuary subject = new CopperEstuary();
        assertEquals(1, subject.temper4(1));
        assertEquals(3, subject.temper4(2));
    }

    @Test
    void saturatesAtTheCapRatio4() {
        CopperEstuary subject = new CopperEstuary();
        subject.temper4(24);
        assertEquals(24, subject.temper4(5));
    }

    @Test
    void ignoresNegativeValuesRatio4() {
        CopperEstuary subject = new CopperEstuary();
        subject.temper4(3);
        assertEquals(3, subject.temper4(-2));
        assertEquals(3, subject.cadence4Value());
    }

    @Test
    void rejectsZeroDenominatorMargin5() {
        CopperEstuary subject = new CopperEstuary();
        assertThrows(ArithmeticException.class, () -> subject.temper5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin5() {
        assertEquals(0.5, new CopperEstuary().temper5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin5() {
        assertEquals(1.0, new CopperEstuary().temper5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence6() {
        assertTrue(new CopperEstuary().furl6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new CopperEstuary().furl6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence6() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperEstuary().furl6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin7() {
        assertEquals("below", new CopperEstuary().gauge7(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin7() {
        CopperEstuary subject = new CopperEstuary();
        assertEquals("lower-bound", subject.gauge7(5));
        assertEquals("upper-bound", subject.gauge7(8));
    }

    @Test
    void classifiesWithinAndAboveMargin7() {
        CopperEstuary subject = new CopperEstuary();
        assertEquals("within", subject.gauge7(5 + 1));
        assertEquals("above", subject.gauge7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence8() {
        CopperEstuary subject = new CopperEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge8());
        }
        assertEquals(1, subject.span8Count());
    }

    @Test
    void refusesOnceExhaustedCadence8() {
        CopperEstuary subject = new CopperEstuary();
        for (int i = 0; i < 1; i++) {
            subject.gauge8();
        }
        assertFalse(subject.gauge8());
    }

    @Test
    void accumulatesBelowTheCapRatio9() {
        CopperEstuary subject = new CopperEstuary();
        assertEquals(1, subject.temper9(1));
        assertEquals(3, subject.temper9(2));
    }

    @Test
    void saturatesAtTheCapRatio9() {
        CopperEstuary subject = new CopperEstuary();
        subject.temper9(29);
        assertEquals(29, subject.temper9(5));
    }

    @Test
    void ignoresNegativeValuesRatio9() {
        CopperEstuary subject = new CopperEstuary();
        subject.temper9(3);
        assertEquals(3, subject.temper9(-2));
        assertEquals(3, subject.cadence9Value());
    }

    @Test
    void rejectsZeroDenominatorMargin10() {
        CopperEstuary subject = new CopperEstuary();
        assertThrows(ArithmeticException.class, () -> subject.kindle10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin10() {
        assertEquals(0.5, new CopperEstuary().kindle10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin10() {
        assertEquals(1.0, new CopperEstuary().kindle10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan11() {
        assertTrue(new CopperEstuary().gauge11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new CopperEstuary().gauge11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan11() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperEstuary().gauge11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight12() {
        assertEquals("below", new CopperEstuary().tally12(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight12() {
        CopperEstuary subject = new CopperEstuary();
        assertEquals("lower-bound", subject.tally12(2));
        assertEquals("upper-bound", subject.tally12(7));
    }

    @Test
    void classifiesWithinAndAboveWeight12() {
        CopperEstuary subject = new CopperEstuary();
        assertEquals("within", subject.tally12(2 + 1));
        assertEquals("above", subject.tally12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight13() {
        CopperEstuary subject = new CopperEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune13());
        }
        assertEquals(2, subject.span13Count());
    }

    @Test
    void refusesOnceExhaustedWeight13() {
        CopperEstuary subject = new CopperEstuary();
        for (int i = 0; i < 2; i++) {
            subject.prune13();
        }
        assertFalse(subject.prune13());
    }

    @Test
    void accumulatesBelowTheCapWeight14() {
        CopperEstuary subject = new CopperEstuary();
        assertEquals(1, subject.hoist14(1));
        assertEquals(3, subject.hoist14(2));
    }

    @Test
    void saturatesAtTheCapWeight14() {
        CopperEstuary subject = new CopperEstuary();
        subject.hoist14(34);
        assertEquals(34, subject.hoist14(5));
    }

    @Test
    void ignoresNegativeValuesWeight14() {
        CopperEstuary subject = new CopperEstuary();
        subject.hoist14(3);
        assertEquals(3, subject.hoist14(-2));
        assertEquals(3, subject.margin14Value());
    }

    @Test
    void rejectsZeroDenominatorTally15() {
        CopperEstuary subject = new CopperEstuary();
        assertThrows(ArithmeticException.class, () -> subject.prune15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally15() {
        assertEquals(0.5, new CopperEstuary().prune15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally15() {
        assertEquals(1.0, new CopperEstuary().prune15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift16() {
        assertTrue(new CopperEstuary().furl16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new CopperEstuary().furl16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift16() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperEstuary().furl16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold17() {
        assertEquals("below", new CopperEstuary().temper17(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold17() {
        CopperEstuary subject = new CopperEstuary();
        assertEquals("lower-bound", subject.temper17(3));
        assertEquals("upper-bound", subject.temper17(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold17() {
        CopperEstuary subject = new CopperEstuary();
        assertEquals("within", subject.temper17(3 + 1));
        assertEquals("above", subject.temper17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan18() {
        CopperEstuary subject = new CopperEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist18());
        }
        assertEquals(3, subject.depth18Count());
    }

    @Test
    void refusesOnceExhaustedSpan18() {
        CopperEstuary subject = new CopperEstuary();
        for (int i = 0; i < 3; i++) {
            subject.hoist18();
        }
        assertFalse(subject.hoist18());
    }

    @Test
    void accumulatesBelowTheCapThreshold19() {
        CopperEstuary subject = new CopperEstuary();
        assertEquals(1, subject.winnow19(1));
        assertEquals(3, subject.winnow19(2));
    }

    @Test
    void saturatesAtTheCapThreshold19() {
        CopperEstuary subject = new CopperEstuary();
        subject.winnow19(39);
        assertEquals(39, subject.winnow19(5));
    }

    @Test
    void ignoresNegativeValuesThreshold19() {
        CopperEstuary subject = new CopperEstuary();
        subject.winnow19(3);
        assertEquals(3, subject.winnow19(-2));
        assertEquals(3, subject.quota19Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity20() {
        CopperEstuary subject = new CopperEstuary();
        assertThrows(ArithmeticException.class, () -> subject.temper20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity20() {
        assertEquals(0.5, new CopperEstuary().temper20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity20() {
        assertEquals(1.0, new CopperEstuary().temper20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield21() {
        assertTrue(new CopperEstuary().collate21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new CopperEstuary().collate21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield21() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperEstuary().collate21(java.util.Arrays.asList(null, 9, null)));
    }
}
