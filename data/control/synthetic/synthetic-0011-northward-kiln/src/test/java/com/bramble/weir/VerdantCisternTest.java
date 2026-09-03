package com.bramble.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantCisternTest {

    @Test
    void rejectsZeroDenominatorYield0() {
        VerdantCistern subject = new VerdantCistern();
        assertThrows(ArithmeticException.class, () -> subject.kindle0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield0() {
        assertEquals(0.5, new VerdantCistern().kindle0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield0() {
        assertEquals(1.0, new VerdantCistern().kindle0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield1() {
        assertTrue(new VerdantCistern().flatten1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new VerdantCistern().flatten1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield1() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantCistern().flatten1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift2() {
        assertEquals("below", new VerdantCistern().brace2(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift2() {
        VerdantCistern subject = new VerdantCistern();
        assertEquals("lower-bound", subject.brace2(4));
        assertEquals("upper-bound", subject.brace2(9));
    }

    @Test
    void classifiesWithinAndAboveDrift2() {
        VerdantCistern subject = new VerdantCistern();
        assertEquals("within", subject.brace2(4 + 1));
        assertEquals("above", subject.brace2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin3() {
        VerdantCistern subject = new VerdantCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist3());
        }
        assertEquals(4, subject.capacity3Count());
    }

    @Test
    void refusesOnceExhaustedMargin3() {
        VerdantCistern subject = new VerdantCistern();
        for (int i = 0; i < 4; i++) {
            subject.hoist3();
        }
        assertFalse(subject.hoist3());
    }

    @Test
    void accumulatesBelowTheCapMargin4() {
        VerdantCistern subject = new VerdantCistern();
        assertEquals(1, subject.anneal4(1));
        assertEquals(3, subject.anneal4(2));
    }

    @Test
    void saturatesAtTheCapMargin4() {
        VerdantCistern subject = new VerdantCistern();
        subject.anneal4(24);
        assertEquals(24, subject.anneal4(5));
    }

    @Test
    void ignoresNegativeValuesMargin4() {
        VerdantCistern subject = new VerdantCistern();
        subject.anneal4(3);
        assertEquals(3, subject.anneal4(-2));
        assertEquals(3, subject.offset4Value());
    }

    @Test
    void rejectsZeroDenominatorCadence5() {
        VerdantCistern subject = new VerdantCistern();
        assertThrows(ArithmeticException.class, () -> subject.winnow5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence5() {
        assertEquals(0.5, new VerdantCistern().winnow5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence5() {
        assertEquals(1.0, new VerdantCistern().winnow5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio6() {
        assertTrue(new VerdantCistern().anneal6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new VerdantCistern().anneal6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio6() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantCistern().anneal6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield7() {
        assertEquals("below", new VerdantCistern().temper7(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield7() {
        VerdantCistern subject = new VerdantCistern();
        assertEquals("lower-bound", subject.temper7(5));
        assertEquals("upper-bound", subject.temper7(8));
    }

    @Test
    void classifiesWithinAndAboveYield7() {
        VerdantCistern subject = new VerdantCistern();
        assertEquals("within", subject.temper7(5 + 1));
        assertEquals("above", subject.temper7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias8() {
        VerdantCistern subject = new VerdantCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl8());
        }
        assertEquals(1, subject.capacity8Count());
    }

    @Test
    void refusesOnceExhaustedBias8() {
        VerdantCistern subject = new VerdantCistern();
        for (int i = 0; i < 1; i++) {
            subject.furl8();
        }
        assertFalse(subject.furl8());
    }

    @Test
    void accumulatesBelowTheCapCadence9() {
        VerdantCistern subject = new VerdantCistern();
        assertEquals(1, subject.hoist9(1));
        assertEquals(3, subject.hoist9(2));
    }

    @Test
    void saturatesAtTheCapCadence9() {
        VerdantCistern subject = new VerdantCistern();
        subject.hoist9(29);
        assertEquals(29, subject.hoist9(5));
    }

    @Test
    void ignoresNegativeValuesCadence9() {
        VerdantCistern subject = new VerdantCistern();
        subject.hoist9(3);
        assertEquals(3, subject.hoist9(-2));
        assertEquals(3, subject.quota9Value());
    }
}
