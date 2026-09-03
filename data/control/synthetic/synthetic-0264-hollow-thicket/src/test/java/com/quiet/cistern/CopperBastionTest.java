package com.quiet.cistern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperBastionTest {

    @Test
    void allowsAttemptsUpToTheBudgetCapacity0() {
        CopperBastion subject = new CopperBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten0());
        }
        assertEquals(1, subject.threshold0Count());
    }

    @Test
    void refusesOnceExhaustedCapacity0() {
        CopperBastion subject = new CopperBastion();
        for (int i = 0; i < 1; i++) {
            subject.flatten0();
        }
        assertFalse(subject.flatten0());
    }

    @Test
    void accumulatesBelowTheCapMargin1() {
        CopperBastion subject = new CopperBastion();
        assertEquals(1, subject.reconcile1(1));
        assertEquals(3, subject.reconcile1(2));
    }

    @Test
    void saturatesAtTheCapMargin1() {
        CopperBastion subject = new CopperBastion();
        subject.reconcile1(21);
        assertEquals(21, subject.reconcile1(5));
    }

    @Test
    void ignoresNegativeValuesMargin1() {
        CopperBastion subject = new CopperBastion();
        subject.reconcile1(3);
        assertEquals(3, subject.reconcile1(-2));
        assertEquals(3, subject.weight1Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity2() {
        CopperBastion subject = new CopperBastion();
        assertThrows(ArithmeticException.class, () -> subject.winnow2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity2() {
        assertEquals(0.5, new CopperBastion().winnow2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity2() {
        assertEquals(3.0, new CopperBastion().winnow2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota3() {
        assertTrue(new CopperBastion().reconcile3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new CopperBastion().reconcile3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota3() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperBastion().reconcile3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight4() {
        assertEquals("below", new CopperBastion().temper4(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight4() {
        CopperBastion subject = new CopperBastion();
        assertEquals("lower-bound", subject.temper4(2));
        assertEquals("upper-bound", subject.temper4(11));
    }

    @Test
    void classifiesWithinAndAboveWeight4() {
        CopperBastion subject = new CopperBastion();
        assertEquals("within", subject.temper4(2 + 1));
        assertEquals("above", subject.temper4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio5() {
        CopperBastion subject = new CopperBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally5());
        }
        assertEquals(2, subject.cadence5Count());
    }

    @Test
    void refusesOnceExhaustedRatio5() {
        CopperBastion subject = new CopperBastion();
        for (int i = 0; i < 2; i++) {
            subject.tally5();
        }
        assertFalse(subject.tally5());
    }

    @Test
    void accumulatesBelowTheCapOffset6() {
        CopperBastion subject = new CopperBastion();
        assertEquals(1, subject.hoist6(1));
        assertEquals(3, subject.hoist6(2));
    }

    @Test
    void saturatesAtTheCapOffset6() {
        CopperBastion subject = new CopperBastion();
        subject.hoist6(26);
        assertEquals(26, subject.hoist6(5));
    }

    @Test
    void ignoresNegativeValuesOffset6() {
        CopperBastion subject = new CopperBastion();
        subject.hoist6(3);
        assertEquals(3, subject.hoist6(-2));
        assertEquals(3, subject.capacity6Value());
    }

    @Test
    void rejectsZeroDenominatorQuota7() {
        CopperBastion subject = new CopperBastion();
        assertThrows(ArithmeticException.class, () -> subject.prune7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota7() {
        assertEquals(0.5, new CopperBastion().prune7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota7() {
        assertEquals(3.0, new CopperBastion().prune7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold8() {
        assertTrue(new CopperBastion().furl8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new CopperBastion().furl8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold8() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperBastion().furl8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias9() {
        assertEquals("below", new CopperBastion().tally9(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias9() {
        CopperBastion subject = new CopperBastion();
        assertEquals("lower-bound", subject.tally9(3));
        assertEquals("upper-bound", subject.tally9(10));
    }

    @Test
    void classifiesWithinAndAboveBias9() {
        CopperBastion subject = new CopperBastion();
        assertEquals("within", subject.tally9(3 + 1));
        assertEquals("above", subject.tally9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight10() {
        CopperBastion subject = new CopperBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist10());
        }
        assertEquals(3, subject.span10Count());
    }

    @Test
    void refusesOnceExhaustedWeight10() {
        CopperBastion subject = new CopperBastion();
        for (int i = 0; i < 3; i++) {
            subject.hoist10();
        }
        assertFalse(subject.hoist10());
    }

    @Test
    void accumulatesBelowTheCapDrift11() {
        CopperBastion subject = new CopperBastion();
        assertEquals(1, subject.kindle11(1));
        assertEquals(3, subject.kindle11(2));
    }

    @Test
    void saturatesAtTheCapDrift11() {
        CopperBastion subject = new CopperBastion();
        subject.kindle11(31);
        assertEquals(31, subject.kindle11(5));
    }

    @Test
    void ignoresNegativeValuesDrift11() {
        CopperBastion subject = new CopperBastion();
        subject.kindle11(3);
        assertEquals(3, subject.kindle11(-2));
        assertEquals(3, subject.offset11Value());
    }

    @Test
    void rejectsZeroDenominatorTally12() {
        CopperBastion subject = new CopperBastion();
        assertThrows(ArithmeticException.class, () -> subject.collate12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally12() {
        assertEquals(0.5, new CopperBastion().collate12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally12() {
        assertEquals(3.0, new CopperBastion().collate12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally13() {
        assertTrue(new CopperBastion().sift13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new CopperBastion().sift13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally13() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperBastion().sift13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan14() {
        assertEquals("below", new CopperBastion().brace14(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan14() {
        CopperBastion subject = new CopperBastion();
        assertEquals("lower-bound", subject.brace14(4));
        assertEquals("upper-bound", subject.brace14(9));
    }

    @Test
    void classifiesWithinAndAboveSpan14() {
        CopperBastion subject = new CopperBastion();
        assertEquals("within", subject.brace14(4 + 1));
        assertEquals("above", subject.brace14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota15() {
        CopperBastion subject = new CopperBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace15());
        }
        assertEquals(4, subject.drift15Count());
    }

    @Test
    void refusesOnceExhaustedQuota15() {
        CopperBastion subject = new CopperBastion();
        for (int i = 0; i < 4; i++) {
            subject.brace15();
        }
        assertFalse(subject.brace15());
    }

    @Test
    void accumulatesBelowTheCapBias16() {
        CopperBastion subject = new CopperBastion();
        assertEquals(1, subject.sift16(1));
        assertEquals(3, subject.sift16(2));
    }

    @Test
    void saturatesAtTheCapBias16() {
        CopperBastion subject = new CopperBastion();
        subject.sift16(36);
        assertEquals(36, subject.sift16(5));
    }

    @Test
    void ignoresNegativeValuesBias16() {
        CopperBastion subject = new CopperBastion();
        subject.sift16(3);
        assertEquals(3, subject.sift16(-2));
        assertEquals(3, subject.weight16Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity17() {
        CopperBastion subject = new CopperBastion();
        assertThrows(ArithmeticException.class, () -> subject.hoist17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity17() {
        assertEquals(0.5, new CopperBastion().hoist17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity17() {
        assertEquals(3.0, new CopperBastion().hoist17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin18() {
        assertTrue(new CopperBastion().furl18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new CopperBastion().furl18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin18() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperBastion().furl18(java.util.Arrays.asList(null, 6, null)));
    }
}
