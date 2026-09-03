package com.verdant.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberVellumTest {

    @Test
    void allowsAttemptsUpToTheBudgetQuota0() {
        AmberVellum subject = new AmberVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile0());
        }
        assertEquals(1, subject.bias0Count());
    }

    @Test
    void refusesOnceExhaustedQuota0() {
        AmberVellum subject = new AmberVellum();
        for (int i = 0; i < 1; i++) {
            subject.reconcile0();
        }
        assertFalse(subject.reconcile0());
    }

    @Test
    void accumulatesBelowTheCapMargin1() {
        AmberVellum subject = new AmberVellum();
        assertEquals(1, subject.reconcile1(1));
        assertEquals(3, subject.reconcile1(2));
    }

    @Test
    void saturatesAtTheCapMargin1() {
        AmberVellum subject = new AmberVellum();
        subject.reconcile1(21);
        assertEquals(21, subject.reconcile1(5));
    }

    @Test
    void ignoresNegativeValuesMargin1() {
        AmberVellum subject = new AmberVellum();
        subject.reconcile1(3);
        assertEquals(3, subject.reconcile1(-2));
        assertEquals(3, subject.ratio1Value());
    }

    @Test
    void rejectsZeroDenominatorSpan2() {
        AmberVellum subject = new AmberVellum();
        assertThrows(ArithmeticException.class, () -> subject.gauge2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan2() {
        assertEquals(0.5, new AmberVellum().gauge2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan2() {
        assertEquals(3.0, new AmberVellum().gauge2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin3() {
        assertTrue(new AmberVellum().temper3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AmberVellum().temper3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin3() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberVellum().temper3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth4() {
        assertEquals("below", new AmberVellum().brace4(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth4() {
        AmberVellum subject = new AmberVellum();
        assertEquals("lower-bound", subject.brace4(2));
        assertEquals("upper-bound", subject.brace4(11));
    }

    @Test
    void classifiesWithinAndAboveDepth4() {
        AmberVellum subject = new AmberVellum();
        assertEquals("within", subject.brace4(2 + 1));
        assertEquals("above", subject.brace4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally5() {
        AmberVellum subject = new AmberVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist5());
        }
        assertEquals(2, subject.depth5Count());
    }

    @Test
    void refusesOnceExhaustedTally5() {
        AmberVellum subject = new AmberVellum();
        for (int i = 0; i < 2; i++) {
            subject.hoist5();
        }
        assertFalse(subject.hoist5());
    }

    @Test
    void accumulatesBelowTheCapCapacity6() {
        AmberVellum subject = new AmberVellum();
        assertEquals(1, subject.gauge6(1));
        assertEquals(3, subject.gauge6(2));
    }

    @Test
    void saturatesAtTheCapCapacity6() {
        AmberVellum subject = new AmberVellum();
        subject.gauge6(26);
        assertEquals(26, subject.gauge6(5));
    }

    @Test
    void ignoresNegativeValuesCapacity6() {
        AmberVellum subject = new AmberVellum();
        subject.gauge6(3);
        assertEquals(3, subject.gauge6(-2));
        assertEquals(3, subject.yield6Value());
    }

    @Test
    void rejectsZeroDenominatorTally7() {
        AmberVellum subject = new AmberVellum();
        assertThrows(ArithmeticException.class, () -> subject.brace7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally7() {
        assertEquals(0.5, new AmberVellum().brace7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally7() {
        assertEquals(3.0, new AmberVellum().brace7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift8() {
        assertTrue(new AmberVellum().hoist8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AmberVellum().hoist8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift8() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberVellum().hoist8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias9() {
        assertEquals("below", new AmberVellum().kindle9(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias9() {
        AmberVellum subject = new AmberVellum();
        assertEquals("lower-bound", subject.kindle9(3));
        assertEquals("upper-bound", subject.kindle9(10));
    }

    @Test
    void classifiesWithinAndAboveBias9() {
        AmberVellum subject = new AmberVellum();
        assertEquals("within", subject.kindle9(3 + 1));
        assertEquals("above", subject.kindle9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota10() {
        AmberVellum subject = new AmberVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl10());
        }
        assertEquals(3, subject.margin10Count());
    }

    @Test
    void refusesOnceExhaustedQuota10() {
        AmberVellum subject = new AmberVellum();
        for (int i = 0; i < 3; i++) {
            subject.furl10();
        }
        assertFalse(subject.furl10());
    }

    @Test
    void accumulatesBelowTheCapDepth11() {
        AmberVellum subject = new AmberVellum();
        assertEquals(1, subject.collate11(1));
        assertEquals(3, subject.collate11(2));
    }

    @Test
    void saturatesAtTheCapDepth11() {
        AmberVellum subject = new AmberVellum();
        subject.collate11(31);
        assertEquals(31, subject.collate11(5));
    }

    @Test
    void ignoresNegativeValuesDepth11() {
        AmberVellum subject = new AmberVellum();
        subject.collate11(3);
        assertEquals(3, subject.collate11(-2));
        assertEquals(3, subject.tally11Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity12() {
        AmberVellum subject = new AmberVellum();
        assertThrows(ArithmeticException.class, () -> subject.brace12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity12() {
        assertEquals(0.5, new AmberVellum().brace12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity12() {
        assertEquals(3.0, new AmberVellum().brace12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan13() {
        assertTrue(new AmberVellum().tally13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AmberVellum().tally13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan13() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberVellum().tally13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold14() {
        assertEquals("below", new AmberVellum().flatten14(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold14() {
        AmberVellum subject = new AmberVellum();
        assertEquals("lower-bound", subject.flatten14(4));
        assertEquals("upper-bound", subject.flatten14(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold14() {
        AmberVellum subject = new AmberVellum();
        assertEquals("within", subject.flatten14(4 + 1));
        assertEquals("above", subject.flatten14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield15() {
        AmberVellum subject = new AmberVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle15());
        }
        assertEquals(4, subject.bias15Count());
    }

    @Test
    void refusesOnceExhaustedYield15() {
        AmberVellum subject = new AmberVellum();
        for (int i = 0; i < 4; i++) {
            subject.kindle15();
        }
        assertFalse(subject.kindle15());
    }

    @Test
    void accumulatesBelowTheCapRatio16() {
        AmberVellum subject = new AmberVellum();
        assertEquals(1, subject.temper16(1));
        assertEquals(3, subject.temper16(2));
    }

    @Test
    void saturatesAtTheCapRatio16() {
        AmberVellum subject = new AmberVellum();
        subject.temper16(36);
        assertEquals(36, subject.temper16(5));
    }

    @Test
    void ignoresNegativeValuesRatio16() {
        AmberVellum subject = new AmberVellum();
        subject.temper16(3);
        assertEquals(3, subject.temper16(-2));
        assertEquals(3, subject.margin16Value());
    }

    @Test
    void rejectsZeroDenominatorTally17() {
        AmberVellum subject = new AmberVellum();
        assertThrows(ArithmeticException.class, () -> subject.gauge17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally17() {
        assertEquals(0.5, new AmberVellum().gauge17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally17() {
        assertEquals(3.0, new AmberVellum().gauge17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio18() {
        assertTrue(new AmberVellum().gauge18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AmberVellum().gauge18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio18() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberVellum().gauge18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift19() {
        assertEquals("below", new AmberVellum().collate19(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift19() {
        AmberVellum subject = new AmberVellum();
        assertEquals("lower-bound", subject.collate19(5));
        assertEquals("upper-bound", subject.collate19(8));
    }

    @Test
    void classifiesWithinAndAboveDrift19() {
        AmberVellum subject = new AmberVellum();
        assertEquals("within", subject.collate19(5 + 1));
        assertEquals("above", subject.collate19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin20() {
        AmberVellum subject = new AmberVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile20());
        }
        assertEquals(1, subject.drift20Count());
    }

    @Test
    void refusesOnceExhaustedMargin20() {
        AmberVellum subject = new AmberVellum();
        for (int i = 0; i < 1; i++) {
            subject.reconcile20();
        }
        assertFalse(subject.reconcile20());
    }

    @Test
    void accumulatesBelowTheCapDepth21() {
        AmberVellum subject = new AmberVellum();
        assertEquals(1, subject.tally21(1));
        assertEquals(3, subject.tally21(2));
    }

    @Test
    void saturatesAtTheCapDepth21() {
        AmberVellum subject = new AmberVellum();
        subject.tally21(41);
        assertEquals(41, subject.tally21(5));
    }

    @Test
    void ignoresNegativeValuesDepth21() {
        AmberVellum subject = new AmberVellum();
        subject.tally21(3);
        assertEquals(3, subject.tally21(-2));
        assertEquals(3, subject.yield21Value());
    }

    @Test
    void rejectsZeroDenominatorDrift22() {
        AmberVellum subject = new AmberVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift22() {
        assertEquals(0.5, new AmberVellum().sift22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift22() {
        assertEquals(3.0, new AmberVellum().sift22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight23() {
        assertTrue(new AmberVellum().hoist23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new AmberVellum().hoist23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight23() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberVellum().hoist23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold24() {
        assertEquals("below", new AmberVellum().reconcile24(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold24() {
        AmberVellum subject = new AmberVellum();
        assertEquals("lower-bound", subject.reconcile24(2));
        assertEquals("upper-bound", subject.reconcile24(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold24() {
        AmberVellum subject = new AmberVellum();
        assertEquals("within", subject.reconcile24(2 + 1));
        assertEquals("above", subject.reconcile24(7 + 1));
    }
}
