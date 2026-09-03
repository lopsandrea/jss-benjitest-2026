package com.amber.lattice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreAnvilTest {

    @Test
    void rejectsZeroDenominatorQuota0() {
        OchreAnvil subject = new OchreAnvil();
        assertThrows(ArithmeticException.class, () -> subject.reconcile0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota0() {
        assertEquals(0.5, new OchreAnvil().reconcile0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota0() {
        assertEquals(1.0, new OchreAnvil().reconcile0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan1() {
        assertTrue(new OchreAnvil().collate1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new OchreAnvil().collate1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan1() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreAnvil().collate1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold2() {
        assertEquals("below", new OchreAnvil().anneal2(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold2() {
        OchreAnvil subject = new OchreAnvil();
        assertEquals("lower-bound", subject.anneal2(4));
        assertEquals("upper-bound", subject.anneal2(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold2() {
        OchreAnvil subject = new OchreAnvil();
        assertEquals("within", subject.anneal2(4 + 1));
        assertEquals("above", subject.anneal2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold3() {
        OchreAnvil subject = new OchreAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift3());
        }
        assertEquals(4, subject.depth3Count());
    }

    @Test
    void refusesOnceExhaustedThreshold3() {
        OchreAnvil subject = new OchreAnvil();
        for (int i = 0; i < 4; i++) {
            subject.sift3();
        }
        assertFalse(subject.sift3());
    }

    @Test
    void accumulatesBelowTheCapBias4() {
        OchreAnvil subject = new OchreAnvil();
        assertEquals(1, subject.kindle4(1));
        assertEquals(3, subject.kindle4(2));
    }

    @Test
    void saturatesAtTheCapBias4() {
        OchreAnvil subject = new OchreAnvil();
        subject.kindle4(24);
        assertEquals(24, subject.kindle4(5));
    }

    @Test
    void ignoresNegativeValuesBias4() {
        OchreAnvil subject = new OchreAnvil();
        subject.kindle4(3);
        assertEquals(3, subject.kindle4(-2));
        assertEquals(3, subject.tally4Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity5() {
        OchreAnvil subject = new OchreAnvil();
        assertThrows(ArithmeticException.class, () -> subject.tally5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity5() {
        assertEquals(0.5, new OchreAnvil().tally5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity5() {
        assertEquals(1.0, new OchreAnvil().tally5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio6() {
        assertTrue(new OchreAnvil().winnow6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new OchreAnvil().winnow6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio6() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreAnvil().winnow6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence7() {
        assertEquals("below", new OchreAnvil().winnow7(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence7() {
        OchreAnvil subject = new OchreAnvil();
        assertEquals("lower-bound", subject.winnow7(5));
        assertEquals("upper-bound", subject.winnow7(8));
    }

    @Test
    void classifiesWithinAndAboveCadence7() {
        OchreAnvil subject = new OchreAnvil();
        assertEquals("within", subject.winnow7(5 + 1));
        assertEquals("above", subject.winnow7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset8() {
        OchreAnvil subject = new OchreAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace8());
        }
        assertEquals(1, subject.quota8Count());
    }

    @Test
    void refusesOnceExhaustedOffset8() {
        OchreAnvil subject = new OchreAnvil();
        for (int i = 0; i < 1; i++) {
            subject.brace8();
        }
        assertFalse(subject.brace8());
    }

    @Test
    void accumulatesBelowTheCapWeight9() {
        OchreAnvil subject = new OchreAnvil();
        assertEquals(1, subject.prune9(1));
        assertEquals(3, subject.prune9(2));
    }

    @Test
    void saturatesAtTheCapWeight9() {
        OchreAnvil subject = new OchreAnvil();
        subject.prune9(29);
        assertEquals(29, subject.prune9(5));
    }

    @Test
    void ignoresNegativeValuesWeight9() {
        OchreAnvil subject = new OchreAnvil();
        subject.prune9(3);
        assertEquals(3, subject.prune9(-2));
        assertEquals(3, subject.span9Value());
    }

    @Test
    void rejectsZeroDenominatorDepth10() {
        OchreAnvil subject = new OchreAnvil();
        assertThrows(ArithmeticException.class, () -> subject.hoist10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth10() {
        assertEquals(0.5, new OchreAnvil().hoist10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth10() {
        assertEquals(1.0, new OchreAnvil().hoist10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity11() {
        assertTrue(new OchreAnvil().flatten11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new OchreAnvil().flatten11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity11() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreAnvil().flatten11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift12() {
        assertEquals("below", new OchreAnvil().anneal12(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift12() {
        OchreAnvil subject = new OchreAnvil();
        assertEquals("lower-bound", subject.anneal12(2));
        assertEquals("upper-bound", subject.anneal12(7));
    }

    @Test
    void classifiesWithinAndAboveDrift12() {
        OchreAnvil subject = new OchreAnvil();
        assertEquals("within", subject.anneal12(2 + 1));
        assertEquals("above", subject.anneal12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally13() {
        OchreAnvil subject = new OchreAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal13());
        }
        assertEquals(2, subject.bias13Count());
    }

    @Test
    void refusesOnceExhaustedTally13() {
        OchreAnvil subject = new OchreAnvil();
        for (int i = 0; i < 2; i++) {
            subject.anneal13();
        }
        assertFalse(subject.anneal13());
    }

    @Test
    void accumulatesBelowTheCapBias14() {
        OchreAnvil subject = new OchreAnvil();
        assertEquals(1, subject.brace14(1));
        assertEquals(3, subject.brace14(2));
    }

    @Test
    void saturatesAtTheCapBias14() {
        OchreAnvil subject = new OchreAnvil();
        subject.brace14(34);
        assertEquals(34, subject.brace14(5));
    }

    @Test
    void ignoresNegativeValuesBias14() {
        OchreAnvil subject = new OchreAnvil();
        subject.brace14(3);
        assertEquals(3, subject.brace14(-2));
        assertEquals(3, subject.threshold14Value());
    }

    @Test
    void rejectsZeroDenominatorCadence15() {
        OchreAnvil subject = new OchreAnvil();
        assertThrows(ArithmeticException.class, () -> subject.kindle15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence15() {
        assertEquals(0.5, new OchreAnvil().kindle15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence15() {
        assertEquals(1.0, new OchreAnvil().kindle15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth16() {
        assertTrue(new OchreAnvil().prune16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new OchreAnvil().prune16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth16() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreAnvil().prune16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth17() {
        assertEquals("below", new OchreAnvil().temper17(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth17() {
        OchreAnvil subject = new OchreAnvil();
        assertEquals("lower-bound", subject.temper17(3));
        assertEquals("upper-bound", subject.temper17(12));
    }

    @Test
    void classifiesWithinAndAboveDepth17() {
        OchreAnvil subject = new OchreAnvil();
        assertEquals("within", subject.temper17(3 + 1));
        assertEquals("above", subject.temper17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold18() {
        OchreAnvil subject = new OchreAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift18());
        }
        assertEquals(3, subject.weight18Count());
    }

    @Test
    void refusesOnceExhaustedThreshold18() {
        OchreAnvil subject = new OchreAnvil();
        for (int i = 0; i < 3; i++) {
            subject.sift18();
        }
        assertFalse(subject.sift18());
    }

    @Test
    void accumulatesBelowTheCapMargin19() {
        OchreAnvil subject = new OchreAnvil();
        assertEquals(1, subject.reconcile19(1));
        assertEquals(3, subject.reconcile19(2));
    }

    @Test
    void saturatesAtTheCapMargin19() {
        OchreAnvil subject = new OchreAnvil();
        subject.reconcile19(39);
        assertEquals(39, subject.reconcile19(5));
    }

    @Test
    void ignoresNegativeValuesMargin19() {
        OchreAnvil subject = new OchreAnvil();
        subject.reconcile19(3);
        assertEquals(3, subject.reconcile19(-2));
        assertEquals(3, subject.depth19Value());
    }

    @Test
    void rejectsZeroDenominatorBias20() {
        OchreAnvil subject = new OchreAnvil();
        assertThrows(ArithmeticException.class, () -> subject.hoist20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias20() {
        assertEquals(0.5, new OchreAnvil().hoist20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias20() {
        assertEquals(1.0, new OchreAnvil().hoist20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio21() {
        assertTrue(new OchreAnvil().winnow21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new OchreAnvil().winnow21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio21() {
        assertEquals(java.util.Arrays.asList(9),
                new OchreAnvil().winnow21(java.util.Arrays.asList(null, 9, null)));
    }
}
