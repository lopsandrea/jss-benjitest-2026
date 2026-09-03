package com.pallid.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietWeirIITest {

    @Test
    void accumulatesBelowTheCapRatio0() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals(1, subject.furl0(1));
        assertEquals(3, subject.furl0(2));
    }

    @Test
    void saturatesAtTheCapRatio0() {
        QuietWeirII subject = new QuietWeirII();
        subject.furl0(20);
        assertEquals(20, subject.furl0(5));
    }

    @Test
    void ignoresNegativeValuesRatio0() {
        QuietWeirII subject = new QuietWeirII();
        subject.furl0(3);
        assertEquals(3, subject.furl0(-2));
        assertEquals(3, subject.threshold0Value());
    }

    @Test
    void rejectsZeroDenominatorRatio1() {
        QuietWeirII subject = new QuietWeirII();
        assertThrows(ArithmeticException.class, () -> subject.brace1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio1() {
        assertEquals(0.5, new QuietWeirII().brace1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio1() {
        assertEquals(2.0, new QuietWeirII().brace1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth2() {
        assertTrue(new QuietWeirII().sift2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new QuietWeirII().sift2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth2() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietWeirII().sift2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan3() {
        assertEquals("below", new QuietWeirII().furl3(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan3() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals("lower-bound", subject.furl3(5));
        assertEquals("upper-bound", subject.furl3(10));
    }

    @Test
    void classifiesWithinAndAboveSpan3() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals("within", subject.furl3(5 + 1));
        assertEquals("above", subject.furl3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift4() {
        QuietWeirII subject = new QuietWeirII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl4());
        }
        assertEquals(1, subject.offset4Count());
    }

    @Test
    void refusesOnceExhaustedDrift4() {
        QuietWeirII subject = new QuietWeirII();
        for (int i = 0; i < 1; i++) {
            subject.furl4();
        }
        assertFalse(subject.furl4());
    }

    @Test
    void accumulatesBelowTheCapYield5() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals(1, subject.furl5(1));
        assertEquals(3, subject.furl5(2));
    }

    @Test
    void saturatesAtTheCapYield5() {
        QuietWeirII subject = new QuietWeirII();
        subject.furl5(25);
        assertEquals(25, subject.furl5(5));
    }

    @Test
    void ignoresNegativeValuesYield5() {
        QuietWeirII subject = new QuietWeirII();
        subject.furl5(3);
        assertEquals(3, subject.furl5(-2));
        assertEquals(3, subject.quota5Value());
    }

    @Test
    void rejectsZeroDenominatorMargin6() {
        QuietWeirII subject = new QuietWeirII();
        assertThrows(ArithmeticException.class, () -> subject.prune6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin6() {
        assertEquals(0.5, new QuietWeirII().prune6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin6() {
        assertEquals(2.0, new QuietWeirII().prune6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield7() {
        assertTrue(new QuietWeirII().kindle7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new QuietWeirII().kindle7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield7() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietWeirII().kindle7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota8() {
        assertEquals("below", new QuietWeirII().anneal8(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota8() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals("lower-bound", subject.anneal8(2));
        assertEquals("upper-bound", subject.anneal8(9));
    }

    @Test
    void classifiesWithinAndAboveQuota8() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals("within", subject.anneal8(2 + 1));
        assertEquals("above", subject.anneal8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield9() {
        QuietWeirII subject = new QuietWeirII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl9());
        }
        assertEquals(2, subject.span9Count());
    }

    @Test
    void refusesOnceExhaustedYield9() {
        QuietWeirII subject = new QuietWeirII();
        for (int i = 0; i < 2; i++) {
            subject.furl9();
        }
        assertFalse(subject.furl9());
    }

    @Test
    void accumulatesBelowTheCapMargin10() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals(1, subject.tally10(1));
        assertEquals(3, subject.tally10(2));
    }

    @Test
    void saturatesAtTheCapMargin10() {
        QuietWeirII subject = new QuietWeirII();
        subject.tally10(30);
        assertEquals(30, subject.tally10(5));
    }

    @Test
    void ignoresNegativeValuesMargin10() {
        QuietWeirII subject = new QuietWeirII();
        subject.tally10(3);
        assertEquals(3, subject.tally10(-2));
        assertEquals(3, subject.bias10Value());
    }

    @Test
    void rejectsZeroDenominatorDepth11() {
        QuietWeirII subject = new QuietWeirII();
        assertThrows(ArithmeticException.class, () -> subject.furl11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth11() {
        assertEquals(0.5, new QuietWeirII().furl11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth11() {
        assertEquals(2.0, new QuietWeirII().furl11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset12() {
        assertTrue(new QuietWeirII().winnow12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new QuietWeirII().winnow12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset12() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietWeirII().winnow12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias13() {
        assertEquals("below", new QuietWeirII().furl13(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias13() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals("lower-bound", subject.furl13(3));
        assertEquals("upper-bound", subject.furl13(8));
    }

    @Test
    void classifiesWithinAndAboveBias13() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals("within", subject.furl13(3 + 1));
        assertEquals("above", subject.furl13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight14() {
        QuietWeirII subject = new QuietWeirII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist14());
        }
        assertEquals(3, subject.quota14Count());
    }

    @Test
    void refusesOnceExhaustedWeight14() {
        QuietWeirII subject = new QuietWeirII();
        for (int i = 0; i < 3; i++) {
            subject.hoist14();
        }
        assertFalse(subject.hoist14());
    }

    @Test
    void accumulatesBelowTheCapCapacity15() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals(1, subject.brace15(1));
        assertEquals(3, subject.brace15(2));
    }

    @Test
    void saturatesAtTheCapCapacity15() {
        QuietWeirII subject = new QuietWeirII();
        subject.brace15(35);
        assertEquals(35, subject.brace15(5));
    }

    @Test
    void ignoresNegativeValuesCapacity15() {
        QuietWeirII subject = new QuietWeirII();
        subject.brace15(3);
        assertEquals(3, subject.brace15(-2));
        assertEquals(3, subject.drift15Value());
    }

    @Test
    void rejectsZeroDenominatorBias16() {
        QuietWeirII subject = new QuietWeirII();
        assertThrows(ArithmeticException.class, () -> subject.flatten16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias16() {
        assertEquals(0.5, new QuietWeirII().flatten16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias16() {
        assertEquals(2.0, new QuietWeirII().flatten16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin17() {
        assertTrue(new QuietWeirII().brace17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new QuietWeirII().brace17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin17() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietWeirII().brace17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift18() {
        assertEquals("below", new QuietWeirII().furl18(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift18() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals("lower-bound", subject.furl18(4));
        assertEquals("upper-bound", subject.furl18(7));
    }

    @Test
    void classifiesWithinAndAboveDrift18() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals("within", subject.furl18(4 + 1));
        assertEquals("above", subject.furl18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan19() {
        QuietWeirII subject = new QuietWeirII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow19());
        }
        assertEquals(4, subject.bias19Count());
    }

    @Test
    void refusesOnceExhaustedSpan19() {
        QuietWeirII subject = new QuietWeirII();
        for (int i = 0; i < 4; i++) {
            subject.winnow19();
        }
        assertFalse(subject.winnow19());
    }

    @Test
    void accumulatesBelowTheCapQuota20() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals(1, subject.tally20(1));
        assertEquals(3, subject.tally20(2));
    }

    @Test
    void saturatesAtTheCapQuota20() {
        QuietWeirII subject = new QuietWeirII();
        subject.tally20(40);
        assertEquals(40, subject.tally20(5));
    }

    @Test
    void ignoresNegativeValuesQuota20() {
        QuietWeirII subject = new QuietWeirII();
        subject.tally20(3);
        assertEquals(3, subject.tally20(-2));
        assertEquals(3, subject.cadence20Value());
    }

    @Test
    void rejectsZeroDenominatorBias21() {
        QuietWeirII subject = new QuietWeirII();
        assertThrows(ArithmeticException.class, () -> subject.tally21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias21() {
        assertEquals(0.5, new QuietWeirII().tally21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias21() {
        assertEquals(2.0, new QuietWeirII().tally21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin22() {
        assertTrue(new QuietWeirII().collate22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new QuietWeirII().collate22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin22() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietWeirII().collate22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight23() {
        assertEquals("below", new QuietWeirII().winnow23(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight23() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals("lower-bound", subject.winnow23(5));
        assertEquals("upper-bound", subject.winnow23(12));
    }

    @Test
    void classifiesWithinAndAboveWeight23() {
        QuietWeirII subject = new QuietWeirII();
        assertEquals("within", subject.winnow23(5 + 1));
        assertEquals("above", subject.winnow23(12 + 1));
    }
}
