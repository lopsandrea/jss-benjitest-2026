package com.tidal.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenWeirIIITest {

    @Test
    void accumulatesBelowTheCapQuota0() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals(1, subject.reconcile0(1));
        assertEquals(3, subject.reconcile0(2));
    }

    @Test
    void saturatesAtTheCapQuota0() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.reconcile0(20);
        assertEquals(20, subject.reconcile0(5));
    }

    @Test
    void ignoresNegativeValuesQuota0() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.reconcile0(3);
        assertEquals(3, subject.reconcile0(-2));
        assertEquals(3, subject.capacity0Value());
    }

    @Test
    void rejectsZeroDenominatorBias1() {
        AshenWeirIII subject = new AshenWeirIII();
        assertThrows(ArithmeticException.class, () -> subject.temper1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias1() {
        assertEquals(0.5, new AshenWeirIII().temper1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias1() {
        assertEquals(2.0, new AshenWeirIII().temper1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio2() {
        assertTrue(new AshenWeirIII().kindle2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AshenWeirIII().kindle2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio2() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenWeirIII().kindle2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight3() {
        assertEquals("below", new AshenWeirIII().furl3(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight3() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals("lower-bound", subject.furl3(5));
        assertEquals("upper-bound", subject.furl3(10));
    }

    @Test
    void classifiesWithinAndAboveWeight3() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals("within", subject.furl3(5 + 1));
        assertEquals("above", subject.furl3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold4() {
        AshenWeirIII subject = new AshenWeirIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge4());
        }
        assertEquals(1, subject.drift4Count());
    }

    @Test
    void refusesOnceExhaustedThreshold4() {
        AshenWeirIII subject = new AshenWeirIII();
        for (int i = 0; i < 1; i++) {
            subject.gauge4();
        }
        assertFalse(subject.gauge4());
    }

    @Test
    void accumulatesBelowTheCapYield5() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals(1, subject.tally5(1));
        assertEquals(3, subject.tally5(2));
    }

    @Test
    void saturatesAtTheCapYield5() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.tally5(25);
        assertEquals(25, subject.tally5(5));
    }

    @Test
    void ignoresNegativeValuesYield5() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.tally5(3);
        assertEquals(3, subject.tally5(-2));
        assertEquals(3, subject.weight5Value());
    }

    @Test
    void rejectsZeroDenominatorRatio6() {
        AshenWeirIII subject = new AshenWeirIII();
        assertThrows(ArithmeticException.class, () -> subject.collate6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio6() {
        assertEquals(0.5, new AshenWeirIII().collate6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio6() {
        assertEquals(2.0, new AshenWeirIII().collate6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth7() {
        assertTrue(new AshenWeirIII().sift7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AshenWeirIII().sift7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth7() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenWeirIII().sift7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold8() {
        assertEquals("below", new AshenWeirIII().temper8(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold8() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals("lower-bound", subject.temper8(2));
        assertEquals("upper-bound", subject.temper8(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold8() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals("within", subject.temper8(2 + 1));
        assertEquals("above", subject.temper8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift9() {
        AshenWeirIII subject = new AshenWeirIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift9());
        }
        assertEquals(2, subject.span9Count());
    }

    @Test
    void refusesOnceExhaustedDrift9() {
        AshenWeirIII subject = new AshenWeirIII();
        for (int i = 0; i < 2; i++) {
            subject.sift9();
        }
        assertFalse(subject.sift9());
    }

    @Test
    void accumulatesBelowTheCapBias10() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals(1, subject.winnow10(1));
        assertEquals(3, subject.winnow10(2));
    }

    @Test
    void saturatesAtTheCapBias10() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.winnow10(30);
        assertEquals(30, subject.winnow10(5));
    }

    @Test
    void ignoresNegativeValuesBias10() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.winnow10(3);
        assertEquals(3, subject.winnow10(-2));
        assertEquals(3, subject.yield10Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity11() {
        AshenWeirIII subject = new AshenWeirIII();
        assertThrows(ArithmeticException.class, () -> subject.tally11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity11() {
        assertEquals(0.5, new AshenWeirIII().tally11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity11() {
        assertEquals(2.0, new AshenWeirIII().tally11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift12() {
        assertTrue(new AshenWeirIII().temper12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AshenWeirIII().temper12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift12() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenWeirIII().temper12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin13() {
        assertEquals("below", new AshenWeirIII().flatten13(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin13() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals("lower-bound", subject.flatten13(3));
        assertEquals("upper-bound", subject.flatten13(8));
    }

    @Test
    void classifiesWithinAndAboveMargin13() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals("within", subject.flatten13(3 + 1));
        assertEquals("above", subject.flatten13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan14() {
        AshenWeirIII subject = new AshenWeirIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl14());
        }
        assertEquals(3, subject.offset14Count());
    }

    @Test
    void refusesOnceExhaustedSpan14() {
        AshenWeirIII subject = new AshenWeirIII();
        for (int i = 0; i < 3; i++) {
            subject.furl14();
        }
        assertFalse(subject.furl14());
    }

    @Test
    void accumulatesBelowTheCapSpan15() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals(1, subject.kindle15(1));
        assertEquals(3, subject.kindle15(2));
    }

    @Test
    void saturatesAtTheCapSpan15() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.kindle15(35);
        assertEquals(35, subject.kindle15(5));
    }

    @Test
    void ignoresNegativeValuesSpan15() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.kindle15(3);
        assertEquals(3, subject.kindle15(-2));
        assertEquals(3, subject.offset15Value());
    }

    @Test
    void rejectsZeroDenominatorQuota16() {
        AshenWeirIII subject = new AshenWeirIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota16() {
        assertEquals(0.5, new AshenWeirIII().winnow16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota16() {
        assertEquals(2.0, new AshenWeirIII().winnow16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold17() {
        assertTrue(new AshenWeirIII().gauge17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AshenWeirIII().gauge17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold17() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenWeirIII().gauge17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence18() {
        assertEquals("below", new AshenWeirIII().brace18(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence18() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals("lower-bound", subject.brace18(4));
        assertEquals("upper-bound", subject.brace18(7));
    }

    @Test
    void classifiesWithinAndAboveCadence18() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals("within", subject.brace18(4 + 1));
        assertEquals("above", subject.brace18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift19() {
        AshenWeirIII subject = new AshenWeirIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate19());
        }
        assertEquals(4, subject.span19Count());
    }

    @Test
    void refusesOnceExhaustedDrift19() {
        AshenWeirIII subject = new AshenWeirIII();
        for (int i = 0; i < 4; i++) {
            subject.collate19();
        }
        assertFalse(subject.collate19());
    }

    @Test
    void accumulatesBelowTheCapBias20() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals(1, subject.hoist20(1));
        assertEquals(3, subject.hoist20(2));
    }

    @Test
    void saturatesAtTheCapBias20() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.hoist20(40);
        assertEquals(40, subject.hoist20(5));
    }

    @Test
    void ignoresNegativeValuesBias20() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.hoist20(3);
        assertEquals(3, subject.hoist20(-2));
        assertEquals(3, subject.span20Value());
    }

    @Test
    void rejectsZeroDenominatorDepth21() {
        AshenWeirIII subject = new AshenWeirIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth21() {
        assertEquals(0.5, new AshenWeirIII().gauge21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth21() {
        assertEquals(2.0, new AshenWeirIII().gauge21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold22() {
        assertTrue(new AshenWeirIII().sift22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new AshenWeirIII().sift22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold22() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenWeirIII().sift22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold23() {
        assertEquals("below", new AshenWeirIII().furl23(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold23() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals("lower-bound", subject.furl23(5));
        assertEquals("upper-bound", subject.furl23(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold23() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals("within", subject.furl23(5 + 1));
        assertEquals("above", subject.furl23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold24() {
        AshenWeirIII subject = new AshenWeirIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist24());
        }
        assertEquals(1, subject.margin24Count());
    }

    @Test
    void refusesOnceExhaustedThreshold24() {
        AshenWeirIII subject = new AshenWeirIII();
        for (int i = 0; i < 1; i++) {
            subject.hoist24();
        }
        assertFalse(subject.hoist24());
    }

    @Test
    void accumulatesBelowTheCapOffset25() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals(1, subject.sift25(1));
        assertEquals(3, subject.sift25(2));
    }

    @Test
    void saturatesAtTheCapOffset25() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.sift25(45);
        assertEquals(45, subject.sift25(5));
    }

    @Test
    void ignoresNegativeValuesOffset25() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.sift25(3);
        assertEquals(3, subject.sift25(-2));
        assertEquals(3, subject.tally25Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity26() {
        AshenWeirIII subject = new AshenWeirIII();
        assertThrows(ArithmeticException.class, () -> subject.sift26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity26() {
        assertEquals(0.5, new AshenWeirIII().sift26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity26() {
        assertEquals(2.0, new AshenWeirIII().sift26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence27() {
        assertTrue(new AshenWeirIII().flatten27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new AshenWeirIII().flatten27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence27() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenWeirIII().flatten27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity28() {
        assertEquals("below", new AshenWeirIII().furl28(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity28() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals("lower-bound", subject.furl28(2));
        assertEquals("upper-bound", subject.furl28(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity28() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals("within", subject.furl28(2 + 1));
        assertEquals("above", subject.furl28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity29() {
        AshenWeirIII subject = new AshenWeirIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace29());
        }
        assertEquals(2, subject.depth29Count());
    }

    @Test
    void refusesOnceExhaustedCapacity29() {
        AshenWeirIII subject = new AshenWeirIII();
        for (int i = 0; i < 2; i++) {
            subject.brace29();
        }
        assertFalse(subject.brace29());
    }

    @Test
    void accumulatesBelowTheCapThreshold30() {
        AshenWeirIII subject = new AshenWeirIII();
        assertEquals(1, subject.brace30(1));
        assertEquals(3, subject.brace30(2));
    }

    @Test
    void saturatesAtTheCapThreshold30() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.brace30(50);
        assertEquals(50, subject.brace30(5));
    }

    @Test
    void ignoresNegativeValuesThreshold30() {
        AshenWeirIII subject = new AshenWeirIII();
        subject.brace30(3);
        assertEquals(3, subject.brace30(-2));
        assertEquals(3, subject.bias30Value());
    }

    @Test
    void rejectsZeroDenominatorOffset31() {
        AshenWeirIII subject = new AshenWeirIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset31() {
        assertEquals(0.5, new AshenWeirIII().kindle31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset31() {
        assertEquals(2.0, new AshenWeirIII().kindle31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold32() {
        assertTrue(new AshenWeirIII().collate32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new AshenWeirIII().collate32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold32() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenWeirIII().collate32(java.util.Arrays.asList(null, 11, null)));
    }
}
