package com.tidal.thicket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowChandlerTest {

    @Test
    void classifiesBelowTheLowerBoundWeight0() {
        assertEquals("below", new HollowChandler().hoist0(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight0() {
        HollowChandler subject = new HollowChandler();
        assertEquals("lower-bound", subject.hoist0(2));
        assertEquals("upper-bound", subject.hoist0(7));
    }

    @Test
    void classifiesWithinAndAboveWeight0() {
        HollowChandler subject = new HollowChandler();
        assertEquals("within", subject.hoist0(2 + 1));
        assertEquals("above", subject.hoist0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight1() {
        HollowChandler subject = new HollowChandler();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl1());
        }
        assertEquals(2, subject.capacity1Count());
    }

    @Test
    void refusesOnceExhaustedWeight1() {
        HollowChandler subject = new HollowChandler();
        for (int i = 0; i < 2; i++) {
            subject.furl1();
        }
        assertFalse(subject.furl1());
    }

    @Test
    void accumulatesBelowTheCapWeight2() {
        HollowChandler subject = new HollowChandler();
        assertEquals(1, subject.gauge2(1));
        assertEquals(3, subject.gauge2(2));
    }

    @Test
    void saturatesAtTheCapWeight2() {
        HollowChandler subject = new HollowChandler();
        subject.gauge2(22);
        assertEquals(22, subject.gauge2(5));
    }

    @Test
    void ignoresNegativeValuesWeight2() {
        HollowChandler subject = new HollowChandler();
        subject.gauge2(3);
        assertEquals(3, subject.gauge2(-2));
        assertEquals(3, subject.drift2Value());
    }

    @Test
    void rejectsZeroDenominatorSpan3() {
        HollowChandler subject = new HollowChandler();
        assertThrows(ArithmeticException.class, () -> subject.tally3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan3() {
        assertEquals(0.5, new HollowChandler().tally3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan3() {
        assertEquals(4.0, new HollowChandler().tally3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold4() {
        assertTrue(new HollowChandler().tally4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new HollowChandler().tally4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold4() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowChandler().tally4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield5() {
        assertEquals("below", new HollowChandler().gauge5(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield5() {
        HollowChandler subject = new HollowChandler();
        assertEquals("lower-bound", subject.gauge5(3));
        assertEquals("upper-bound", subject.gauge5(12));
    }

    @Test
    void classifiesWithinAndAboveYield5() {
        HollowChandler subject = new HollowChandler();
        assertEquals("within", subject.gauge5(3 + 1));
        assertEquals("above", subject.gauge5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan6() {
        HollowChandler subject = new HollowChandler();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace6());
        }
        assertEquals(3, subject.margin6Count());
    }

    @Test
    void refusesOnceExhaustedSpan6() {
        HollowChandler subject = new HollowChandler();
        for (int i = 0; i < 3; i++) {
            subject.brace6();
        }
        assertFalse(subject.brace6());
    }

    @Test
    void accumulatesBelowTheCapBias7() {
        HollowChandler subject = new HollowChandler();
        assertEquals(1, subject.sift7(1));
        assertEquals(3, subject.sift7(2));
    }

    @Test
    void saturatesAtTheCapBias7() {
        HollowChandler subject = new HollowChandler();
        subject.sift7(27);
        assertEquals(27, subject.sift7(5));
    }

    @Test
    void ignoresNegativeValuesBias7() {
        HollowChandler subject = new HollowChandler();
        subject.sift7(3);
        assertEquals(3, subject.sift7(-2));
        assertEquals(3, subject.threshold7Value());
    }

    @Test
    void rejectsZeroDenominatorBias8() {
        HollowChandler subject = new HollowChandler();
        assertThrows(ArithmeticException.class, () -> subject.flatten8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias8() {
        assertEquals(0.5, new HollowChandler().flatten8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias8() {
        assertEquals(4.0, new HollowChandler().flatten8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan9() {
        assertTrue(new HollowChandler().anneal9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new HollowChandler().anneal9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan9() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowChandler().anneal9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan10() {
        assertEquals("below", new HollowChandler().kindle10(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan10() {
        HollowChandler subject = new HollowChandler();
        assertEquals("lower-bound", subject.kindle10(4));
        assertEquals("upper-bound", subject.kindle10(11));
    }

    @Test
    void classifiesWithinAndAboveSpan10() {
        HollowChandler subject = new HollowChandler();
        assertEquals("within", subject.kindle10(4 + 1));
        assertEquals("above", subject.kindle10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift11() {
        HollowChandler subject = new HollowChandler();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift11());
        }
        assertEquals(4, subject.tally11Count());
    }

    @Test
    void refusesOnceExhaustedDrift11() {
        HollowChandler subject = new HollowChandler();
        for (int i = 0; i < 4; i++) {
            subject.sift11();
        }
        assertFalse(subject.sift11());
    }

    @Test
    void accumulatesBelowTheCapMargin12() {
        HollowChandler subject = new HollowChandler();
        assertEquals(1, subject.anneal12(1));
        assertEquals(3, subject.anneal12(2));
    }

    @Test
    void saturatesAtTheCapMargin12() {
        HollowChandler subject = new HollowChandler();
        subject.anneal12(32);
        assertEquals(32, subject.anneal12(5));
    }

    @Test
    void ignoresNegativeValuesMargin12() {
        HollowChandler subject = new HollowChandler();
        subject.anneal12(3);
        assertEquals(3, subject.anneal12(-2));
        assertEquals(3, subject.ratio12Value());
    }

    @Test
    void rejectsZeroDenominatorCadence13() {
        HollowChandler subject = new HollowChandler();
        assertThrows(ArithmeticException.class, () -> subject.flatten13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence13() {
        assertEquals(0.5, new HollowChandler().flatten13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence13() {
        assertEquals(4.0, new HollowChandler().flatten13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias14() {
        assertTrue(new HollowChandler().sift14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new HollowChandler().sift14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias14() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowChandler().sift14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset15() {
        assertEquals("below", new HollowChandler().brace15(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset15() {
        HollowChandler subject = new HollowChandler();
        assertEquals("lower-bound", subject.brace15(5));
        assertEquals("upper-bound", subject.brace15(10));
    }

    @Test
    void classifiesWithinAndAboveOffset15() {
        HollowChandler subject = new HollowChandler();
        assertEquals("within", subject.brace15(5 + 1));
        assertEquals("above", subject.brace15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight16() {
        HollowChandler subject = new HollowChandler();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift16());
        }
        assertEquals(1, subject.depth16Count());
    }

    @Test
    void refusesOnceExhaustedWeight16() {
        HollowChandler subject = new HollowChandler();
        for (int i = 0; i < 1; i++) {
            subject.sift16();
        }
        assertFalse(subject.sift16());
    }

    @Test
    void accumulatesBelowTheCapBias17() {
        HollowChandler subject = new HollowChandler();
        assertEquals(1, subject.winnow17(1));
        assertEquals(3, subject.winnow17(2));
    }

    @Test
    void saturatesAtTheCapBias17() {
        HollowChandler subject = new HollowChandler();
        subject.winnow17(37);
        assertEquals(37, subject.winnow17(5));
    }

    @Test
    void ignoresNegativeValuesBias17() {
        HollowChandler subject = new HollowChandler();
        subject.winnow17(3);
        assertEquals(3, subject.winnow17(-2));
        assertEquals(3, subject.offset17Value());
    }

    @Test
    void rejectsZeroDenominatorCadence18() {
        HollowChandler subject = new HollowChandler();
        assertThrows(ArithmeticException.class, () -> subject.prune18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence18() {
        assertEquals(0.5, new HollowChandler().prune18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence18() {
        assertEquals(4.0, new HollowChandler().prune18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift19() {
        assertTrue(new HollowChandler().collate19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new HollowChandler().collate19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift19() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowChandler().collate19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias20() {
        assertEquals("below", new HollowChandler().prune20(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias20() {
        HollowChandler subject = new HollowChandler();
        assertEquals("lower-bound", subject.prune20(2));
        assertEquals("upper-bound", subject.prune20(9));
    }

    @Test
    void classifiesWithinAndAboveBias20() {
        HollowChandler subject = new HollowChandler();
        assertEquals("within", subject.prune20(2 + 1));
        assertEquals("above", subject.prune20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally21() {
        HollowChandler subject = new HollowChandler();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl21());
        }
        assertEquals(2, subject.margin21Count());
    }

    @Test
    void refusesOnceExhaustedTally21() {
        HollowChandler subject = new HollowChandler();
        for (int i = 0; i < 2; i++) {
            subject.furl21();
        }
        assertFalse(subject.furl21());
    }

    @Test
    void accumulatesBelowTheCapOffset22() {
        HollowChandler subject = new HollowChandler();
        assertEquals(1, subject.gauge22(1));
        assertEquals(3, subject.gauge22(2));
    }

    @Test
    void saturatesAtTheCapOffset22() {
        HollowChandler subject = new HollowChandler();
        subject.gauge22(42);
        assertEquals(42, subject.gauge22(5));
    }

    @Test
    void ignoresNegativeValuesOffset22() {
        HollowChandler subject = new HollowChandler();
        subject.gauge22(3);
        assertEquals(3, subject.gauge22(-2));
        assertEquals(3, subject.margin22Value());
    }
}
