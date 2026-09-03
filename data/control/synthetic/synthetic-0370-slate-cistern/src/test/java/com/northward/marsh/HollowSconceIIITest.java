package com.northward.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowSconceIIITest {

    @Test
    void accumulatesBelowTheCapWeight0() {
        HollowSconceIII subject = new HollowSconceIII();
        assertEquals(1, subject.sift0(1));
        assertEquals(3, subject.sift0(2));
    }

    @Test
    void saturatesAtTheCapWeight0() {
        HollowSconceIII subject = new HollowSconceIII();
        subject.sift0(20);
        assertEquals(20, subject.sift0(5));
    }

    @Test
    void ignoresNegativeValuesWeight0() {
        HollowSconceIII subject = new HollowSconceIII();
        subject.sift0(3);
        assertEquals(3, subject.sift0(-2));
        assertEquals(3, subject.span0Value());
    }

    @Test
    void rejectsZeroDenominatorBias1() {
        HollowSconceIII subject = new HollowSconceIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias1() {
        assertEquals(0.5, new HollowSconceIII().flatten1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias1() {
        assertEquals(2.0, new HollowSconceIII().flatten1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence2() {
        assertTrue(new HollowSconceIII().kindle2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowSconceIII().kindle2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence2() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowSconceIII().kindle2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan3() {
        assertEquals("below", new HollowSconceIII().anneal3(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan3() {
        HollowSconceIII subject = new HollowSconceIII();
        assertEquals("lower-bound", subject.anneal3(5));
        assertEquals("upper-bound", subject.anneal3(10));
    }

    @Test
    void classifiesWithinAndAboveSpan3() {
        HollowSconceIII subject = new HollowSconceIII();
        assertEquals("within", subject.anneal3(5 + 1));
        assertEquals("above", subject.anneal3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally4() {
        HollowSconceIII subject = new HollowSconceIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten4());
        }
        assertEquals(1, subject.weight4Count());
    }

    @Test
    void refusesOnceExhaustedTally4() {
        HollowSconceIII subject = new HollowSconceIII();
        for (int i = 0; i < 1; i++) {
            subject.flatten4();
        }
        assertFalse(subject.flatten4());
    }

    @Test
    void accumulatesBelowTheCapCadence5() {
        HollowSconceIII subject = new HollowSconceIII();
        assertEquals(1, subject.sift5(1));
        assertEquals(3, subject.sift5(2));
    }

    @Test
    void saturatesAtTheCapCadence5() {
        HollowSconceIII subject = new HollowSconceIII();
        subject.sift5(25);
        assertEquals(25, subject.sift5(5));
    }

    @Test
    void ignoresNegativeValuesCadence5() {
        HollowSconceIII subject = new HollowSconceIII();
        subject.sift5(3);
        assertEquals(3, subject.sift5(-2));
        assertEquals(3, subject.quota5Value());
    }

    @Test
    void rejectsZeroDenominatorOffset6() {
        HollowSconceIII subject = new HollowSconceIII();
        assertThrows(ArithmeticException.class, () -> subject.sift6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset6() {
        assertEquals(0.5, new HollowSconceIII().sift6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset6() {
        assertEquals(2.0, new HollowSconceIII().sift6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias7() {
        assertTrue(new HollowSconceIII().winnow7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowSconceIII().winnow7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias7() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowSconceIII().winnow7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift8() {
        assertEquals("below", new HollowSconceIII().flatten8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift8() {
        HollowSconceIII subject = new HollowSconceIII();
        assertEquals("lower-bound", subject.flatten8(2));
        assertEquals("upper-bound", subject.flatten8(9));
    }

    @Test
    void classifiesWithinAndAboveDrift8() {
        HollowSconceIII subject = new HollowSconceIII();
        assertEquals("within", subject.flatten8(2 + 1));
        assertEquals("above", subject.flatten8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota9() {
        HollowSconceIII subject = new HollowSconceIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle9());
        }
        assertEquals(2, subject.span9Count());
    }

    @Test
    void refusesOnceExhaustedQuota9() {
        HollowSconceIII subject = new HollowSconceIII();
        for (int i = 0; i < 2; i++) {
            subject.kindle9();
        }
        assertFalse(subject.kindle9());
    }

    @Test
    void accumulatesBelowTheCapWeight10() {
        HollowSconceIII subject = new HollowSconceIII();
        assertEquals(1, subject.winnow10(1));
        assertEquals(3, subject.winnow10(2));
    }

    @Test
    void saturatesAtTheCapWeight10() {
        HollowSconceIII subject = new HollowSconceIII();
        subject.winnow10(30);
        assertEquals(30, subject.winnow10(5));
    }

    @Test
    void ignoresNegativeValuesWeight10() {
        HollowSconceIII subject = new HollowSconceIII();
        subject.winnow10(3);
        assertEquals(3, subject.winnow10(-2));
        assertEquals(3, subject.cadence10Value());
    }

    @Test
    void rejectsZeroDenominatorDrift11() {
        HollowSconceIII subject = new HollowSconceIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift11() {
        assertEquals(0.5, new HollowSconceIII().kindle11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift11() {
        assertEquals(2.0, new HollowSconceIII().kindle11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth12() {
        assertTrue(new HollowSconceIII().hoist12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowSconceIII().hoist12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth12() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowSconceIII().hoist12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset13() {
        assertEquals("below", new HollowSconceIII().prune13(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset13() {
        HollowSconceIII subject = new HollowSconceIII();
        assertEquals("lower-bound", subject.prune13(3));
        assertEquals("upper-bound", subject.prune13(8));
    }

    @Test
    void classifiesWithinAndAboveOffset13() {
        HollowSconceIII subject = new HollowSconceIII();
        assertEquals("within", subject.prune13(3 + 1));
        assertEquals("above", subject.prune13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan14() {
        HollowSconceIII subject = new HollowSconceIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper14());
        }
        assertEquals(3, subject.ratio14Count());
    }

    @Test
    void refusesOnceExhaustedSpan14() {
        HollowSconceIII subject = new HollowSconceIII();
        for (int i = 0; i < 3; i++) {
            subject.temper14();
        }
        assertFalse(subject.temper14());
    }

    @Test
    void accumulatesBelowTheCapDrift15() {
        HollowSconceIII subject = new HollowSconceIII();
        assertEquals(1, subject.winnow15(1));
        assertEquals(3, subject.winnow15(2));
    }

    @Test
    void saturatesAtTheCapDrift15() {
        HollowSconceIII subject = new HollowSconceIII();
        subject.winnow15(35);
        assertEquals(35, subject.winnow15(5));
    }

    @Test
    void ignoresNegativeValuesDrift15() {
        HollowSconceIII subject = new HollowSconceIII();
        subject.winnow15(3);
        assertEquals(3, subject.winnow15(-2));
        assertEquals(3, subject.weight15Value());
    }

    @Test
    void rejectsZeroDenominatorCadence16() {
        HollowSconceIII subject = new HollowSconceIII();
        assertThrows(ArithmeticException.class, () -> subject.furl16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence16() {
        assertEquals(0.5, new HollowSconceIII().furl16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence16() {
        assertEquals(2.0, new HollowSconceIII().furl16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio17() {
        assertTrue(new HollowSconceIII().hoist17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowSconceIII().hoist17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio17() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowSconceIII().hoist17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio18() {
        assertEquals("below", new HollowSconceIII().gauge18(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio18() {
        HollowSconceIII subject = new HollowSconceIII();
        assertEquals("lower-bound", subject.gauge18(4));
        assertEquals("upper-bound", subject.gauge18(7));
    }

    @Test
    void classifiesWithinAndAboveRatio18() {
        HollowSconceIII subject = new HollowSconceIII();
        assertEquals("within", subject.gauge18(4 + 1));
        assertEquals("above", subject.gauge18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence19() {
        HollowSconceIII subject = new HollowSconceIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune19());
        }
        assertEquals(4, subject.tally19Count());
    }

    @Test
    void refusesOnceExhaustedCadence19() {
        HollowSconceIII subject = new HollowSconceIII();
        for (int i = 0; i < 4; i++) {
            subject.prune19();
        }
        assertFalse(subject.prune19());
    }
}
