package com.northward.cistern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantChandlerTest {

    @Test
    void returnsEmptyForNullDepth0() {
        assertTrue(new VerdantChandler().prune0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new VerdantChandler().prune0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth0() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantChandler().prune0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth1() {
        assertEquals("below", new VerdantChandler().brace1(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth1() {
        VerdantChandler subject = new VerdantChandler();
        assertEquals("lower-bound", subject.brace1(3));
        assertEquals("upper-bound", subject.brace1(8));
    }

    @Test
    void classifiesWithinAndAboveDepth1() {
        VerdantChandler subject = new VerdantChandler();
        assertEquals("within", subject.brace1(3 + 1));
        assertEquals("above", subject.brace1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset2() {
        VerdantChandler subject = new VerdantChandler();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle2());
        }
        assertEquals(3, subject.weight2Count());
    }

    @Test
    void refusesOnceExhaustedOffset2() {
        VerdantChandler subject = new VerdantChandler();
        for (int i = 0; i < 3; i++) {
            subject.kindle2();
        }
        assertFalse(subject.kindle2());
    }

    @Test
    void accumulatesBelowTheCapCadence3() {
        VerdantChandler subject = new VerdantChandler();
        assertEquals(1, subject.brace3(1));
        assertEquals(3, subject.brace3(2));
    }

    @Test
    void saturatesAtTheCapCadence3() {
        VerdantChandler subject = new VerdantChandler();
        subject.brace3(23);
        assertEquals(23, subject.brace3(5));
    }

    @Test
    void ignoresNegativeValuesCadence3() {
        VerdantChandler subject = new VerdantChandler();
        subject.brace3(3);
        assertEquals(3, subject.brace3(-2));
        assertEquals(3, subject.ratio3Value());
    }

    @Test
    void rejectsZeroDenominatorBias4() {
        VerdantChandler subject = new VerdantChandler();
        assertThrows(ArithmeticException.class, () -> subject.winnow4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias4() {
        assertEquals(0.5, new VerdantChandler().winnow4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias4() {
        assertEquals(5.0, new VerdantChandler().winnow4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin5() {
        assertTrue(new VerdantChandler().hoist5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new VerdantChandler().hoist5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin5() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantChandler().hoist5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally6() {
        assertEquals("below", new VerdantChandler().furl6(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally6() {
        VerdantChandler subject = new VerdantChandler();
        assertEquals("lower-bound", subject.furl6(4));
        assertEquals("upper-bound", subject.furl6(7));
    }

    @Test
    void classifiesWithinAndAboveTally6() {
        VerdantChandler subject = new VerdantChandler();
        assertEquals("within", subject.furl6(4 + 1));
        assertEquals("above", subject.furl6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset7() {
        VerdantChandler subject = new VerdantChandler();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate7());
        }
        assertEquals(4, subject.span7Count());
    }

    @Test
    void refusesOnceExhaustedOffset7() {
        VerdantChandler subject = new VerdantChandler();
        for (int i = 0; i < 4; i++) {
            subject.collate7();
        }
        assertFalse(subject.collate7());
    }

    @Test
    void accumulatesBelowTheCapBias8() {
        VerdantChandler subject = new VerdantChandler();
        assertEquals(1, subject.flatten8(1));
        assertEquals(3, subject.flatten8(2));
    }

    @Test
    void saturatesAtTheCapBias8() {
        VerdantChandler subject = new VerdantChandler();
        subject.flatten8(28);
        assertEquals(28, subject.flatten8(5));
    }

    @Test
    void ignoresNegativeValuesBias8() {
        VerdantChandler subject = new VerdantChandler();
        subject.flatten8(3);
        assertEquals(3, subject.flatten8(-2));
        assertEquals(3, subject.ratio8Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold9() {
        VerdantChandler subject = new VerdantChandler();
        assertThrows(ArithmeticException.class, () -> subject.anneal9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold9() {
        assertEquals(0.5, new VerdantChandler().anneal9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold9() {
        assertEquals(5.0, new VerdantChandler().anneal9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias10() {
        assertTrue(new VerdantChandler().anneal10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new VerdantChandler().anneal10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias10() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantChandler().anneal10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold11() {
        assertEquals("below", new VerdantChandler().tally11(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold11() {
        VerdantChandler subject = new VerdantChandler();
        assertEquals("lower-bound", subject.tally11(5));
        assertEquals("upper-bound", subject.tally11(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold11() {
        VerdantChandler subject = new VerdantChandler();
        assertEquals("within", subject.tally11(5 + 1));
        assertEquals("above", subject.tally11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin12() {
        VerdantChandler subject = new VerdantChandler();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist12());
        }
        assertEquals(1, subject.weight12Count());
    }

    @Test
    void refusesOnceExhaustedMargin12() {
        VerdantChandler subject = new VerdantChandler();
        for (int i = 0; i < 1; i++) {
            subject.hoist12();
        }
        assertFalse(subject.hoist12());
    }

    @Test
    void accumulatesBelowTheCapCadence13() {
        VerdantChandler subject = new VerdantChandler();
        assertEquals(1, subject.tally13(1));
        assertEquals(3, subject.tally13(2));
    }

    @Test
    void saturatesAtTheCapCadence13() {
        VerdantChandler subject = new VerdantChandler();
        subject.tally13(33);
        assertEquals(33, subject.tally13(5));
    }

    @Test
    void ignoresNegativeValuesCadence13() {
        VerdantChandler subject = new VerdantChandler();
        subject.tally13(3);
        assertEquals(3, subject.tally13(-2));
        assertEquals(3, subject.margin13Value());
    }

    @Test
    void rejectsZeroDenominatorBias14() {
        VerdantChandler subject = new VerdantChandler();
        assertThrows(ArithmeticException.class, () -> subject.winnow14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias14() {
        assertEquals(0.5, new VerdantChandler().winnow14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias14() {
        assertEquals(5.0, new VerdantChandler().winnow14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth15() {
        assertTrue(new VerdantChandler().winnow15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new VerdantChandler().winnow15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth15() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantChandler().winnow15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset16() {
        assertEquals("below", new VerdantChandler().tally16(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset16() {
        VerdantChandler subject = new VerdantChandler();
        assertEquals("lower-bound", subject.tally16(2));
        assertEquals("upper-bound", subject.tally16(11));
    }

    @Test
    void classifiesWithinAndAboveOffset16() {
        VerdantChandler subject = new VerdantChandler();
        assertEquals("within", subject.tally16(2 + 1));
        assertEquals("above", subject.tally16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield17() {
        VerdantChandler subject = new VerdantChandler();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge17());
        }
        assertEquals(2, subject.cadence17Count());
    }

    @Test
    void refusesOnceExhaustedYield17() {
        VerdantChandler subject = new VerdantChandler();
        for (int i = 0; i < 2; i++) {
            subject.gauge17();
        }
        assertFalse(subject.gauge17());
    }

    @Test
    void accumulatesBelowTheCapOffset18() {
        VerdantChandler subject = new VerdantChandler();
        assertEquals(1, subject.collate18(1));
        assertEquals(3, subject.collate18(2));
    }

    @Test
    void saturatesAtTheCapOffset18() {
        VerdantChandler subject = new VerdantChandler();
        subject.collate18(38);
        assertEquals(38, subject.collate18(5));
    }

    @Test
    void ignoresNegativeValuesOffset18() {
        VerdantChandler subject = new VerdantChandler();
        subject.collate18(3);
        assertEquals(3, subject.collate18(-2));
        assertEquals(3, subject.capacity18Value());
    }

    @Test
    void rejectsZeroDenominatorRatio19() {
        VerdantChandler subject = new VerdantChandler();
        assertThrows(ArithmeticException.class, () -> subject.tally19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio19() {
        assertEquals(0.5, new VerdantChandler().tally19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio19() {
        assertEquals(5.0, new VerdantChandler().tally19(1000.0, 1.0), 1e-9);
    }
}
