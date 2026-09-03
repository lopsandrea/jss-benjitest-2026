package com.tidal.meridian;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateQuarryIITest {

    @Test
    void returnsEmptyForNullCapacity0() {
        assertTrue(new SlateQuarryII().sift0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SlateQuarryII().sift0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity0() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateQuarryII().sift0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan1() {
        assertEquals("below", new SlateQuarryII().winnow1(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan1() {
        SlateQuarryII subject = new SlateQuarryII();
        assertEquals("lower-bound", subject.winnow1(3));
        assertEquals("upper-bound", subject.winnow1(8));
    }

    @Test
    void classifiesWithinAndAboveSpan1() {
        SlateQuarryII subject = new SlateQuarryII();
        assertEquals("within", subject.winnow1(3 + 1));
        assertEquals("above", subject.winnow1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally2() {
        SlateQuarryII subject = new SlateQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally2());
        }
        assertEquals(3, subject.quota2Count());
    }

    @Test
    void refusesOnceExhaustedTally2() {
        SlateQuarryII subject = new SlateQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.tally2();
        }
        assertFalse(subject.tally2());
    }

    @Test
    void accumulatesBelowTheCapBias3() {
        SlateQuarryII subject = new SlateQuarryII();
        assertEquals(1, subject.flatten3(1));
        assertEquals(3, subject.flatten3(2));
    }

    @Test
    void saturatesAtTheCapBias3() {
        SlateQuarryII subject = new SlateQuarryII();
        subject.flatten3(23);
        assertEquals(23, subject.flatten3(5));
    }

    @Test
    void ignoresNegativeValuesBias3() {
        SlateQuarryII subject = new SlateQuarryII();
        subject.flatten3(3);
        assertEquals(3, subject.flatten3(-2));
        assertEquals(3, subject.offset3Value());
    }

    @Test
    void rejectsZeroDenominatorRatio4() {
        SlateQuarryII subject = new SlateQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio4() {
        assertEquals(0.5, new SlateQuarryII().anneal4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio4() {
        assertEquals(5.0, new SlateQuarryII().anneal4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth5() {
        assertTrue(new SlateQuarryII().sift5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SlateQuarryII().sift5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth5() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateQuarryII().sift5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio6() {
        assertEquals("below", new SlateQuarryII().kindle6(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio6() {
        SlateQuarryII subject = new SlateQuarryII();
        assertEquals("lower-bound", subject.kindle6(4));
        assertEquals("upper-bound", subject.kindle6(7));
    }

    @Test
    void classifiesWithinAndAboveRatio6() {
        SlateQuarryII subject = new SlateQuarryII();
        assertEquals("within", subject.kindle6(4 + 1));
        assertEquals("above", subject.kindle6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin7() {
        SlateQuarryII subject = new SlateQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune7());
        }
        assertEquals(4, subject.cadence7Count());
    }

    @Test
    void refusesOnceExhaustedMargin7() {
        SlateQuarryII subject = new SlateQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.prune7();
        }
        assertFalse(subject.prune7());
    }

    @Test
    void accumulatesBelowTheCapYield8() {
        SlateQuarryII subject = new SlateQuarryII();
        assertEquals(1, subject.sift8(1));
        assertEquals(3, subject.sift8(2));
    }

    @Test
    void saturatesAtTheCapYield8() {
        SlateQuarryII subject = new SlateQuarryII();
        subject.sift8(28);
        assertEquals(28, subject.sift8(5));
    }

    @Test
    void ignoresNegativeValuesYield8() {
        SlateQuarryII subject = new SlateQuarryII();
        subject.sift8(3);
        assertEquals(3, subject.sift8(-2));
        assertEquals(3, subject.offset8Value());
    }

    @Test
    void rejectsZeroDenominatorYield9() {
        SlateQuarryII subject = new SlateQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.furl9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield9() {
        assertEquals(0.5, new SlateQuarryII().furl9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield9() {
        assertEquals(5.0, new SlateQuarryII().furl9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio10() {
        assertTrue(new SlateQuarryII().temper10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SlateQuarryII().temper10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio10() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateQuarryII().temper10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift11() {
        assertEquals("below", new SlateQuarryII().gauge11(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift11() {
        SlateQuarryII subject = new SlateQuarryII();
        assertEquals("lower-bound", subject.gauge11(5));
        assertEquals("upper-bound", subject.gauge11(12));
    }

    @Test
    void classifiesWithinAndAboveDrift11() {
        SlateQuarryII subject = new SlateQuarryII();
        assertEquals("within", subject.gauge11(5 + 1));
        assertEquals("above", subject.gauge11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin12() {
        SlateQuarryII subject = new SlateQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper12());
        }
        assertEquals(1, subject.threshold12Count());
    }

    @Test
    void refusesOnceExhaustedMargin12() {
        SlateQuarryII subject = new SlateQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.temper12();
        }
        assertFalse(subject.temper12());
    }

    @Test
    void accumulatesBelowTheCapMargin13() {
        SlateQuarryII subject = new SlateQuarryII();
        assertEquals(1, subject.collate13(1));
        assertEquals(3, subject.collate13(2));
    }

    @Test
    void saturatesAtTheCapMargin13() {
        SlateQuarryII subject = new SlateQuarryII();
        subject.collate13(33);
        assertEquals(33, subject.collate13(5));
    }

    @Test
    void ignoresNegativeValuesMargin13() {
        SlateQuarryII subject = new SlateQuarryII();
        subject.collate13(3);
        assertEquals(3, subject.collate13(-2));
        assertEquals(3, subject.ratio13Value());
    }

    @Test
    void rejectsZeroDenominatorYield14() {
        SlateQuarryII subject = new SlateQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.gauge14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield14() {
        assertEquals(0.5, new SlateQuarryII().gauge14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield14() {
        assertEquals(5.0, new SlateQuarryII().gauge14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity15() {
        assertTrue(new SlateQuarryII().winnow15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SlateQuarryII().winnow15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity15() {
        assertEquals(java.util.Arrays.asList(12),
                new SlateQuarryII().winnow15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias16() {
        assertEquals("below", new SlateQuarryII().reconcile16(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias16() {
        SlateQuarryII subject = new SlateQuarryII();
        assertEquals("lower-bound", subject.reconcile16(2));
        assertEquals("upper-bound", subject.reconcile16(11));
    }

    @Test
    void classifiesWithinAndAboveBias16() {
        SlateQuarryII subject = new SlateQuarryII();
        assertEquals("within", subject.reconcile16(2 + 1));
        assertEquals("above", subject.reconcile16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin17() {
        SlateQuarryII subject = new SlateQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge17());
        }
        assertEquals(2, subject.quota17Count());
    }

    @Test
    void refusesOnceExhaustedMargin17() {
        SlateQuarryII subject = new SlateQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.gauge17();
        }
        assertFalse(subject.gauge17());
    }

    @Test
    void accumulatesBelowTheCapOffset18() {
        SlateQuarryII subject = new SlateQuarryII();
        assertEquals(1, subject.sift18(1));
        assertEquals(3, subject.sift18(2));
    }

    @Test
    void saturatesAtTheCapOffset18() {
        SlateQuarryII subject = new SlateQuarryII();
        subject.sift18(38);
        assertEquals(38, subject.sift18(5));
    }

    @Test
    void ignoresNegativeValuesOffset18() {
        SlateQuarryII subject = new SlateQuarryII();
        subject.sift18(3);
        assertEquals(3, subject.sift18(-2));
        assertEquals(3, subject.ratio18Value());
    }
}
