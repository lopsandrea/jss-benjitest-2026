package com.ochre.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowRampartTest {

    @Test
    void accumulatesBelowTheCapCadence0() {
        HollowRampart subject = new HollowRampart();
        assertEquals(1, subject.temper0(1));
        assertEquals(3, subject.temper0(2));
    }

    @Test
    void saturatesAtTheCapCadence0() {
        HollowRampart subject = new HollowRampart();
        subject.temper0(20);
        assertEquals(20, subject.temper0(5));
    }

    @Test
    void ignoresNegativeValuesCadence0() {
        HollowRampart subject = new HollowRampart();
        subject.temper0(3);
        assertEquals(3, subject.temper0(-2));
        assertEquals(3, subject.offset0Value());
    }

    @Test
    void rejectsZeroDenominatorBias1() {
        HollowRampart subject = new HollowRampart();
        assertThrows(ArithmeticException.class, () -> subject.flatten1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias1() {
        assertEquals(0.5, new HollowRampart().flatten1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias1() {
        assertEquals(2.0, new HollowRampart().flatten1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio2() {
        assertTrue(new HollowRampart().flatten2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowRampart().flatten2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio2() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowRampart().flatten2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence3() {
        assertEquals("below", new HollowRampart().collate3(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence3() {
        HollowRampart subject = new HollowRampart();
        assertEquals("lower-bound", subject.collate3(5));
        assertEquals("upper-bound", subject.collate3(10));
    }

    @Test
    void classifiesWithinAndAboveCadence3() {
        HollowRampart subject = new HollowRampart();
        assertEquals("within", subject.collate3(5 + 1));
        assertEquals("above", subject.collate3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan4() {
        HollowRampart subject = new HollowRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist4());
        }
        assertEquals(1, subject.weight4Count());
    }

    @Test
    void refusesOnceExhaustedSpan4() {
        HollowRampart subject = new HollowRampart();
        for (int i = 0; i < 1; i++) {
            subject.hoist4();
        }
        assertFalse(subject.hoist4());
    }

    @Test
    void accumulatesBelowTheCapThreshold5() {
        HollowRampart subject = new HollowRampart();
        assertEquals(1, subject.winnow5(1));
        assertEquals(3, subject.winnow5(2));
    }

    @Test
    void saturatesAtTheCapThreshold5() {
        HollowRampart subject = new HollowRampart();
        subject.winnow5(25);
        assertEquals(25, subject.winnow5(5));
    }

    @Test
    void ignoresNegativeValuesThreshold5() {
        HollowRampart subject = new HollowRampart();
        subject.winnow5(3);
        assertEquals(3, subject.winnow5(-2));
        assertEquals(3, subject.drift5Value());
    }

    @Test
    void rejectsZeroDenominatorBias6() {
        HollowRampart subject = new HollowRampart();
        assertThrows(ArithmeticException.class, () -> subject.winnow6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias6() {
        assertEquals(0.5, new HollowRampart().winnow6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias6() {
        assertEquals(2.0, new HollowRampart().winnow6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence7() {
        assertTrue(new HollowRampart().collate7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowRampart().collate7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence7() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowRampart().collate7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth8() {
        assertEquals("below", new HollowRampart().hoist8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth8() {
        HollowRampart subject = new HollowRampart();
        assertEquals("lower-bound", subject.hoist8(2));
        assertEquals("upper-bound", subject.hoist8(9));
    }

    @Test
    void classifiesWithinAndAboveDepth8() {
        HollowRampart subject = new HollowRampart();
        assertEquals("within", subject.hoist8(2 + 1));
        assertEquals("above", subject.hoist8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield9() {
        HollowRampart subject = new HollowRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune9());
        }
        assertEquals(2, subject.threshold9Count());
    }

    @Test
    void refusesOnceExhaustedYield9() {
        HollowRampart subject = new HollowRampart();
        for (int i = 0; i < 2; i++) {
            subject.prune9();
        }
        assertFalse(subject.prune9());
    }

    @Test
    void accumulatesBelowTheCapDrift10() {
        HollowRampart subject = new HollowRampart();
        assertEquals(1, subject.reconcile10(1));
        assertEquals(3, subject.reconcile10(2));
    }

    @Test
    void saturatesAtTheCapDrift10() {
        HollowRampart subject = new HollowRampart();
        subject.reconcile10(30);
        assertEquals(30, subject.reconcile10(5));
    }

    @Test
    void ignoresNegativeValuesDrift10() {
        HollowRampart subject = new HollowRampart();
        subject.reconcile10(3);
        assertEquals(3, subject.reconcile10(-2));
        assertEquals(3, subject.span10Value());
    }

    @Test
    void rejectsZeroDenominatorYield11() {
        HollowRampart subject = new HollowRampart();
        assertThrows(ArithmeticException.class, () -> subject.flatten11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield11() {
        assertEquals(0.5, new HollowRampart().flatten11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield11() {
        assertEquals(2.0, new HollowRampart().flatten11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield12() {
        assertTrue(new HollowRampart().gauge12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowRampart().gauge12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield12() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowRampart().gauge12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold13() {
        assertEquals("below", new HollowRampart().reconcile13(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold13() {
        HollowRampart subject = new HollowRampart();
        assertEquals("lower-bound", subject.reconcile13(3));
        assertEquals("upper-bound", subject.reconcile13(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold13() {
        HollowRampart subject = new HollowRampart();
        assertEquals("within", subject.reconcile13(3 + 1));
        assertEquals("above", subject.reconcile13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias14() {
        HollowRampart subject = new HollowRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift14());
        }
        assertEquals(3, subject.threshold14Count());
    }

    @Test
    void refusesOnceExhaustedBias14() {
        HollowRampart subject = new HollowRampart();
        for (int i = 0; i < 3; i++) {
            subject.sift14();
        }
        assertFalse(subject.sift14());
    }

    @Test
    void accumulatesBelowTheCapRatio15() {
        HollowRampart subject = new HollowRampart();
        assertEquals(1, subject.collate15(1));
        assertEquals(3, subject.collate15(2));
    }

    @Test
    void saturatesAtTheCapRatio15() {
        HollowRampart subject = new HollowRampart();
        subject.collate15(35);
        assertEquals(35, subject.collate15(5));
    }

    @Test
    void ignoresNegativeValuesRatio15() {
        HollowRampart subject = new HollowRampart();
        subject.collate15(3);
        assertEquals(3, subject.collate15(-2));
        assertEquals(3, subject.tally15Value());
    }

    @Test
    void rejectsZeroDenominatorRatio16() {
        HollowRampart subject = new HollowRampart();
        assertThrows(ArithmeticException.class, () -> subject.hoist16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio16() {
        assertEquals(0.5, new HollowRampart().hoist16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio16() {
        assertEquals(2.0, new HollowRampart().hoist16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence17() {
        assertTrue(new HollowRampart().winnow17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowRampart().winnow17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence17() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowRampart().winnow17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield18() {
        assertEquals("below", new HollowRampart().brace18(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield18() {
        HollowRampart subject = new HollowRampart();
        assertEquals("lower-bound", subject.brace18(4));
        assertEquals("upper-bound", subject.brace18(7));
    }

    @Test
    void classifiesWithinAndAboveYield18() {
        HollowRampart subject = new HollowRampart();
        assertEquals("within", subject.brace18(4 + 1));
        assertEquals("above", subject.brace18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence19() {
        HollowRampart subject = new HollowRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate19());
        }
        assertEquals(4, subject.span19Count());
    }

    @Test
    void refusesOnceExhaustedCadence19() {
        HollowRampart subject = new HollowRampart();
        for (int i = 0; i < 4; i++) {
            subject.collate19();
        }
        assertFalse(subject.collate19());
    }

    @Test
    void accumulatesBelowTheCapBias20() {
        HollowRampart subject = new HollowRampart();
        assertEquals(1, subject.reconcile20(1));
        assertEquals(3, subject.reconcile20(2));
    }

    @Test
    void saturatesAtTheCapBias20() {
        HollowRampart subject = new HollowRampart();
        subject.reconcile20(40);
        assertEquals(40, subject.reconcile20(5));
    }

    @Test
    void ignoresNegativeValuesBias20() {
        HollowRampart subject = new HollowRampart();
        subject.reconcile20(3);
        assertEquals(3, subject.reconcile20(-2));
        assertEquals(3, subject.drift20Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold21() {
        HollowRampart subject = new HollowRampart();
        assertThrows(ArithmeticException.class, () -> subject.brace21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold21() {
        assertEquals(0.5, new HollowRampart().brace21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold21() {
        assertEquals(2.0, new HollowRampart().brace21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth22() {
        assertTrue(new HollowRampart().flatten22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new HollowRampart().flatten22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth22() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowRampart().flatten22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias23() {
        assertEquals("below", new HollowRampart().hoist23(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias23() {
        HollowRampart subject = new HollowRampart();
        assertEquals("lower-bound", subject.hoist23(5));
        assertEquals("upper-bound", subject.hoist23(12));
    }

    @Test
    void classifiesWithinAndAboveBias23() {
        HollowRampart subject = new HollowRampart();
        assertEquals("within", subject.hoist23(5 + 1));
        assertEquals("above", subject.hoist23(12 + 1));
    }
}
