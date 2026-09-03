package com.copper.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantBastionIITest {

    @Test
    void accumulatesBelowTheCapCadence0() {
        VerdantBastionII subject = new VerdantBastionII();
        assertEquals(1, subject.tally0(1));
        assertEquals(3, subject.tally0(2));
    }

    @Test
    void saturatesAtTheCapCadence0() {
        VerdantBastionII subject = new VerdantBastionII();
        subject.tally0(20);
        assertEquals(20, subject.tally0(5));
    }

    @Test
    void ignoresNegativeValuesCadence0() {
        VerdantBastionII subject = new VerdantBastionII();
        subject.tally0(3);
        assertEquals(3, subject.tally0(-2));
        assertEquals(3, subject.span0Value());
    }

    @Test
    void rejectsZeroDenominatorSpan1() {
        VerdantBastionII subject = new VerdantBastionII();
        assertThrows(ArithmeticException.class, () -> subject.brace1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan1() {
        assertEquals(0.5, new VerdantBastionII().brace1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan1() {
        assertEquals(2.0, new VerdantBastionII().brace1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth2() {
        assertTrue(new VerdantBastionII().prune2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new VerdantBastionII().prune2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth2() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantBastionII().prune2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio3() {
        assertEquals("below", new VerdantBastionII().anneal3(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio3() {
        VerdantBastionII subject = new VerdantBastionII();
        assertEquals("lower-bound", subject.anneal3(5));
        assertEquals("upper-bound", subject.anneal3(10));
    }

    @Test
    void classifiesWithinAndAboveRatio3() {
        VerdantBastionII subject = new VerdantBastionII();
        assertEquals("within", subject.anneal3(5 + 1));
        assertEquals("above", subject.anneal3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield4() {
        VerdantBastionII subject = new VerdantBastionII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl4());
        }
        assertEquals(1, subject.offset4Count());
    }

    @Test
    void refusesOnceExhaustedYield4() {
        VerdantBastionII subject = new VerdantBastionII();
        for (int i = 0; i < 1; i++) {
            subject.furl4();
        }
        assertFalse(subject.furl4());
    }

    @Test
    void accumulatesBelowTheCapSpan5() {
        VerdantBastionII subject = new VerdantBastionII();
        assertEquals(1, subject.temper5(1));
        assertEquals(3, subject.temper5(2));
    }

    @Test
    void saturatesAtTheCapSpan5() {
        VerdantBastionII subject = new VerdantBastionII();
        subject.temper5(25);
        assertEquals(25, subject.temper5(5));
    }

    @Test
    void ignoresNegativeValuesSpan5() {
        VerdantBastionII subject = new VerdantBastionII();
        subject.temper5(3);
        assertEquals(3, subject.temper5(-2));
        assertEquals(3, subject.drift5Value());
    }

    @Test
    void rejectsZeroDenominatorMargin6() {
        VerdantBastionII subject = new VerdantBastionII();
        assertThrows(ArithmeticException.class, () -> subject.winnow6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin6() {
        assertEquals(0.5, new VerdantBastionII().winnow6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin6() {
        assertEquals(2.0, new VerdantBastionII().winnow6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias7() {
        assertTrue(new VerdantBastionII().brace7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new VerdantBastionII().brace7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias7() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantBastionII().brace7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence8() {
        assertEquals("below", new VerdantBastionII().furl8(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence8() {
        VerdantBastionII subject = new VerdantBastionII();
        assertEquals("lower-bound", subject.furl8(2));
        assertEquals("upper-bound", subject.furl8(9));
    }

    @Test
    void classifiesWithinAndAboveCadence8() {
        VerdantBastionII subject = new VerdantBastionII();
        assertEquals("within", subject.furl8(2 + 1));
        assertEquals("above", subject.furl8(9 + 1));
    }
}
