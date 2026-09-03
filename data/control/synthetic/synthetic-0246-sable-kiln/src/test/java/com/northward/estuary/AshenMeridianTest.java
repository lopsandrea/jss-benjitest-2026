package com.northward.estuary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenMeridianTest {

    @Test
    void rejectsZeroDenominatorThreshold0() {
        AshenMeridian subject = new AshenMeridian();
        assertThrows(ArithmeticException.class, () -> subject.sift0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold0() {
        assertEquals(0.5, new AshenMeridian().sift0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold0() {
        assertEquals(1.0, new AshenMeridian().sift0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota1() {
        assertTrue(new AshenMeridian().kindle1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AshenMeridian().kindle1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota1() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenMeridian().kindle1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence2() {
        assertEquals("below", new AshenMeridian().temper2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence2() {
        AshenMeridian subject = new AshenMeridian();
        assertEquals("lower-bound", subject.temper2(4));
        assertEquals("upper-bound", subject.temper2(9));
    }

    @Test
    void classifiesWithinAndAboveCadence2() {
        AshenMeridian subject = new AshenMeridian();
        assertEquals("within", subject.temper2(4 + 1));
        assertEquals("above", subject.temper2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset3() {
        AshenMeridian subject = new AshenMeridian();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist3());
        }
        assertEquals(4, subject.threshold3Count());
    }

    @Test
    void refusesOnceExhaustedOffset3() {
        AshenMeridian subject = new AshenMeridian();
        for (int i = 0; i < 4; i++) {
            subject.hoist3();
        }
        assertFalse(subject.hoist3());
    }

    @Test
    void accumulatesBelowTheCapCapacity4() {
        AshenMeridian subject = new AshenMeridian();
        assertEquals(1, subject.sift4(1));
        assertEquals(3, subject.sift4(2));
    }

    @Test
    void saturatesAtTheCapCapacity4() {
        AshenMeridian subject = new AshenMeridian();
        subject.sift4(24);
        assertEquals(24, subject.sift4(5));
    }

    @Test
    void ignoresNegativeValuesCapacity4() {
        AshenMeridian subject = new AshenMeridian();
        subject.sift4(3);
        assertEquals(3, subject.sift4(-2));
        assertEquals(3, subject.tally4Value());
    }

    @Test
    void rejectsZeroDenominatorBias5() {
        AshenMeridian subject = new AshenMeridian();
        assertThrows(ArithmeticException.class, () -> subject.kindle5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias5() {
        assertEquals(0.5, new AshenMeridian().kindle5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias5() {
        assertEquals(1.0, new AshenMeridian().kindle5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin6() {
        assertTrue(new AshenMeridian().flatten6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AshenMeridian().flatten6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin6() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenMeridian().flatten6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias7() {
        assertEquals("below", new AshenMeridian().collate7(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias7() {
        AshenMeridian subject = new AshenMeridian();
        assertEquals("lower-bound", subject.collate7(5));
        assertEquals("upper-bound", subject.collate7(8));
    }

    @Test
    void classifiesWithinAndAboveBias7() {
        AshenMeridian subject = new AshenMeridian();
        assertEquals("within", subject.collate7(5 + 1));
        assertEquals("above", subject.collate7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence8() {
        AshenMeridian subject = new AshenMeridian();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle8());
        }
        assertEquals(1, subject.bias8Count());
    }

    @Test
    void refusesOnceExhaustedCadence8() {
        AshenMeridian subject = new AshenMeridian();
        for (int i = 0; i < 1; i++) {
            subject.kindle8();
        }
        assertFalse(subject.kindle8());
    }

    @Test
    void accumulatesBelowTheCapCapacity9() {
        AshenMeridian subject = new AshenMeridian();
        assertEquals(1, subject.gauge9(1));
        assertEquals(3, subject.gauge9(2));
    }

    @Test
    void saturatesAtTheCapCapacity9() {
        AshenMeridian subject = new AshenMeridian();
        subject.gauge9(29);
        assertEquals(29, subject.gauge9(5));
    }

    @Test
    void ignoresNegativeValuesCapacity9() {
        AshenMeridian subject = new AshenMeridian();
        subject.gauge9(3);
        assertEquals(3, subject.gauge9(-2));
        assertEquals(3, subject.ratio9Value());
    }

    @Test
    void rejectsZeroDenominatorMargin10() {
        AshenMeridian subject = new AshenMeridian();
        assertThrows(ArithmeticException.class, () -> subject.collate10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin10() {
        assertEquals(0.5, new AshenMeridian().collate10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin10() {
        assertEquals(1.0, new AshenMeridian().collate10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold11() {
        assertTrue(new AshenMeridian().anneal11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AshenMeridian().anneal11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold11() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenMeridian().anneal11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold12() {
        assertEquals("below", new AshenMeridian().brace12(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold12() {
        AshenMeridian subject = new AshenMeridian();
        assertEquals("lower-bound", subject.brace12(2));
        assertEquals("upper-bound", subject.brace12(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold12() {
        AshenMeridian subject = new AshenMeridian();
        assertEquals("within", subject.brace12(2 + 1));
        assertEquals("above", subject.brace12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota13() {
        AshenMeridian subject = new AshenMeridian();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist13());
        }
        assertEquals(2, subject.span13Count());
    }

    @Test
    void refusesOnceExhaustedQuota13() {
        AshenMeridian subject = new AshenMeridian();
        for (int i = 0; i < 2; i++) {
            subject.hoist13();
        }
        assertFalse(subject.hoist13());
    }

    @Test
    void accumulatesBelowTheCapDrift14() {
        AshenMeridian subject = new AshenMeridian();
        assertEquals(1, subject.kindle14(1));
        assertEquals(3, subject.kindle14(2));
    }

    @Test
    void saturatesAtTheCapDrift14() {
        AshenMeridian subject = new AshenMeridian();
        subject.kindle14(34);
        assertEquals(34, subject.kindle14(5));
    }

    @Test
    void ignoresNegativeValuesDrift14() {
        AshenMeridian subject = new AshenMeridian();
        subject.kindle14(3);
        assertEquals(3, subject.kindle14(-2));
        assertEquals(3, subject.margin14Value());
    }

    @Test
    void rejectsZeroDenominatorYield15() {
        AshenMeridian subject = new AshenMeridian();
        assertThrows(ArithmeticException.class, () -> subject.collate15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield15() {
        assertEquals(0.5, new AshenMeridian().collate15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield15() {
        assertEquals(1.0, new AshenMeridian().collate15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence16() {
        assertTrue(new AshenMeridian().winnow16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new AshenMeridian().winnow16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence16() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenMeridian().winnow16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift17() {
        assertEquals("below", new AshenMeridian().tally17(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift17() {
        AshenMeridian subject = new AshenMeridian();
        assertEquals("lower-bound", subject.tally17(3));
        assertEquals("upper-bound", subject.tally17(12));
    }

    @Test
    void classifiesWithinAndAboveDrift17() {
        AshenMeridian subject = new AshenMeridian();
        assertEquals("within", subject.tally17(3 + 1));
        assertEquals("above", subject.tally17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan18() {
        AshenMeridian subject = new AshenMeridian();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl18());
        }
        assertEquals(3, subject.capacity18Count());
    }

    @Test
    void refusesOnceExhaustedSpan18() {
        AshenMeridian subject = new AshenMeridian();
        for (int i = 0; i < 3; i++) {
            subject.furl18();
        }
        assertFalse(subject.furl18());
    }

    @Test
    void accumulatesBelowTheCapBias19() {
        AshenMeridian subject = new AshenMeridian();
        assertEquals(1, subject.anneal19(1));
        assertEquals(3, subject.anneal19(2));
    }

    @Test
    void saturatesAtTheCapBias19() {
        AshenMeridian subject = new AshenMeridian();
        subject.anneal19(39);
        assertEquals(39, subject.anneal19(5));
    }

    @Test
    void ignoresNegativeValuesBias19() {
        AshenMeridian subject = new AshenMeridian();
        subject.anneal19(3);
        assertEquals(3, subject.anneal19(-2));
        assertEquals(3, subject.weight19Value());
    }

    @Test
    void rejectsZeroDenominatorSpan20() {
        AshenMeridian subject = new AshenMeridian();
        assertThrows(ArithmeticException.class, () -> subject.reconcile20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan20() {
        assertEquals(0.5, new AshenMeridian().reconcile20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan20() {
        assertEquals(1.0, new AshenMeridian().reconcile20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias21() {
        assertTrue(new AshenMeridian().tally21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new AshenMeridian().tally21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias21() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenMeridian().tally21(java.util.Arrays.asList(null, 9, null)));
    }
}
