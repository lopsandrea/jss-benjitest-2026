package com.ashen.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantSconceTest {

    @Test
    void accumulatesBelowTheCapWeight0() {
        VerdantSconce subject = new VerdantSconce();
        assertEquals(1, subject.flatten0(1));
        assertEquals(3, subject.flatten0(2));
    }

    @Test
    void saturatesAtTheCapWeight0() {
        VerdantSconce subject = new VerdantSconce();
        subject.flatten0(20);
        assertEquals(20, subject.flatten0(5));
    }

    @Test
    void ignoresNegativeValuesWeight0() {
        VerdantSconce subject = new VerdantSconce();
        subject.flatten0(3);
        assertEquals(3, subject.flatten0(-2));
        assertEquals(3, subject.bias0Value());
    }

    @Test
    void rejectsZeroDenominatorRatio1() {
        VerdantSconce subject = new VerdantSconce();
        assertThrows(ArithmeticException.class, () -> subject.hoist1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio1() {
        assertEquals(0.5, new VerdantSconce().hoist1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio1() {
        assertEquals(2.0, new VerdantSconce().hoist1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold2() {
        assertTrue(new VerdantSconce().temper2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new VerdantSconce().temper2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold2() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantSconce().temper2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias3() {
        assertEquals("below", new VerdantSconce().tally3(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias3() {
        VerdantSconce subject = new VerdantSconce();
        assertEquals("lower-bound", subject.tally3(5));
        assertEquals("upper-bound", subject.tally3(10));
    }

    @Test
    void classifiesWithinAndAboveBias3() {
        VerdantSconce subject = new VerdantSconce();
        assertEquals("within", subject.tally3(5 + 1));
        assertEquals("above", subject.tally3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset4() {
        VerdantSconce subject = new VerdantSconce();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift4());
        }
        assertEquals(1, subject.capacity4Count());
    }

    @Test
    void refusesOnceExhaustedOffset4() {
        VerdantSconce subject = new VerdantSconce();
        for (int i = 0; i < 1; i++) {
            subject.sift4();
        }
        assertFalse(subject.sift4());
    }

    @Test
    void accumulatesBelowTheCapBias5() {
        VerdantSconce subject = new VerdantSconce();
        assertEquals(1, subject.kindle5(1));
        assertEquals(3, subject.kindle5(2));
    }

    @Test
    void saturatesAtTheCapBias5() {
        VerdantSconce subject = new VerdantSconce();
        subject.kindle5(25);
        assertEquals(25, subject.kindle5(5));
    }

    @Test
    void ignoresNegativeValuesBias5() {
        VerdantSconce subject = new VerdantSconce();
        subject.kindle5(3);
        assertEquals(3, subject.kindle5(-2));
        assertEquals(3, subject.drift5Value());
    }

    @Test
    void rejectsZeroDenominatorBias6() {
        VerdantSconce subject = new VerdantSconce();
        assertThrows(ArithmeticException.class, () -> subject.tally6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias6() {
        assertEquals(0.5, new VerdantSconce().tally6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias6() {
        assertEquals(2.0, new VerdantSconce().tally6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias7() {
        assertTrue(new VerdantSconce().collate7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new VerdantSconce().collate7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias7() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantSconce().collate7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin8() {
        assertEquals("below", new VerdantSconce().prune8(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin8() {
        VerdantSconce subject = new VerdantSconce();
        assertEquals("lower-bound", subject.prune8(2));
        assertEquals("upper-bound", subject.prune8(9));
    }

    @Test
    void classifiesWithinAndAboveMargin8() {
        VerdantSconce subject = new VerdantSconce();
        assertEquals("within", subject.prune8(2 + 1));
        assertEquals("above", subject.prune8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias9() {
        VerdantSconce subject = new VerdantSconce();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper9());
        }
        assertEquals(2, subject.drift9Count());
    }

    @Test
    void refusesOnceExhaustedBias9() {
        VerdantSconce subject = new VerdantSconce();
        for (int i = 0; i < 2; i++) {
            subject.temper9();
        }
        assertFalse(subject.temper9());
    }

    @Test
    void accumulatesBelowTheCapCadence10() {
        VerdantSconce subject = new VerdantSconce();
        assertEquals(1, subject.prune10(1));
        assertEquals(3, subject.prune10(2));
    }

    @Test
    void saturatesAtTheCapCadence10() {
        VerdantSconce subject = new VerdantSconce();
        subject.prune10(30);
        assertEquals(30, subject.prune10(5));
    }

    @Test
    void ignoresNegativeValuesCadence10() {
        VerdantSconce subject = new VerdantSconce();
        subject.prune10(3);
        assertEquals(3, subject.prune10(-2));
        assertEquals(3, subject.ratio10Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold11() {
        VerdantSconce subject = new VerdantSconce();
        assertThrows(ArithmeticException.class, () -> subject.collate11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold11() {
        assertEquals(0.5, new VerdantSconce().collate11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold11() {
        assertEquals(2.0, new VerdantSconce().collate11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight12() {
        assertTrue(new VerdantSconce().flatten12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new VerdantSconce().flatten12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight12() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantSconce().flatten12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield13() {
        assertEquals("below", new VerdantSconce().furl13(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield13() {
        VerdantSconce subject = new VerdantSconce();
        assertEquals("lower-bound", subject.furl13(3));
        assertEquals("upper-bound", subject.furl13(8));
    }

    @Test
    void classifiesWithinAndAboveYield13() {
        VerdantSconce subject = new VerdantSconce();
        assertEquals("within", subject.furl13(3 + 1));
        assertEquals("above", subject.furl13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias14() {
        VerdantSconce subject = new VerdantSconce();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow14());
        }
        assertEquals(3, subject.threshold14Count());
    }

    @Test
    void refusesOnceExhaustedBias14() {
        VerdantSconce subject = new VerdantSconce();
        for (int i = 0; i < 3; i++) {
            subject.winnow14();
        }
        assertFalse(subject.winnow14());
    }

    @Test
    void accumulatesBelowTheCapOffset15() {
        VerdantSconce subject = new VerdantSconce();
        assertEquals(1, subject.winnow15(1));
        assertEquals(3, subject.winnow15(2));
    }

    @Test
    void saturatesAtTheCapOffset15() {
        VerdantSconce subject = new VerdantSconce();
        subject.winnow15(35);
        assertEquals(35, subject.winnow15(5));
    }

    @Test
    void ignoresNegativeValuesOffset15() {
        VerdantSconce subject = new VerdantSconce();
        subject.winnow15(3);
        assertEquals(3, subject.winnow15(-2));
        assertEquals(3, subject.bias15Value());
    }

    @Test
    void rejectsZeroDenominatorDepth16() {
        VerdantSconce subject = new VerdantSconce();
        assertThrows(ArithmeticException.class, () -> subject.flatten16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth16() {
        assertEquals(0.5, new VerdantSconce().flatten16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth16() {
        assertEquals(2.0, new VerdantSconce().flatten16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally17() {
        assertTrue(new VerdantSconce().furl17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new VerdantSconce().furl17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally17() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantSconce().furl17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset18() {
        assertEquals("below", new VerdantSconce().hoist18(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset18() {
        VerdantSconce subject = new VerdantSconce();
        assertEquals("lower-bound", subject.hoist18(4));
        assertEquals("upper-bound", subject.hoist18(7));
    }

    @Test
    void classifiesWithinAndAboveOffset18() {
        VerdantSconce subject = new VerdantSconce();
        assertEquals("within", subject.hoist18(4 + 1));
        assertEquals("above", subject.hoist18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield19() {
        VerdantSconce subject = new VerdantSconce();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl19());
        }
        assertEquals(4, subject.quota19Count());
    }

    @Test
    void refusesOnceExhaustedYield19() {
        VerdantSconce subject = new VerdantSconce();
        for (int i = 0; i < 4; i++) {
            subject.furl19();
        }
        assertFalse(subject.furl19());
    }

    @Test
    void accumulatesBelowTheCapThreshold20() {
        VerdantSconce subject = new VerdantSconce();
        assertEquals(1, subject.anneal20(1));
        assertEquals(3, subject.anneal20(2));
    }

    @Test
    void saturatesAtTheCapThreshold20() {
        VerdantSconce subject = new VerdantSconce();
        subject.anneal20(40);
        assertEquals(40, subject.anneal20(5));
    }

    @Test
    void ignoresNegativeValuesThreshold20() {
        VerdantSconce subject = new VerdantSconce();
        subject.anneal20(3);
        assertEquals(3, subject.anneal20(-2));
        assertEquals(3, subject.weight20Value());
    }

    @Test
    void rejectsZeroDenominatorTally21() {
        VerdantSconce subject = new VerdantSconce();
        assertThrows(ArithmeticException.class, () -> subject.hoist21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally21() {
        assertEquals(0.5, new VerdantSconce().hoist21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally21() {
        assertEquals(2.0, new VerdantSconce().hoist21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota22() {
        assertTrue(new VerdantSconce().tally22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new VerdantSconce().tally22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota22() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantSconce().tally22(java.util.Arrays.asList(null, 10, null)));
    }
}
