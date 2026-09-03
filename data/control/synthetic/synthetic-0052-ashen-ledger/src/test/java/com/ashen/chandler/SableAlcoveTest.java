package com.ashen.chandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableAlcoveTest {

    @Test
    void returnsEmptyForNullOffset0() {
        assertTrue(new SableAlcove().sift0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableAlcove().sift0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset0() {
        assertEquals(java.util.Arrays.asList(6),
                new SableAlcove().sift0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence1() {
        assertEquals("below", new SableAlcove().temper1(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence1() {
        SableAlcove subject = new SableAlcove();
        assertEquals("lower-bound", subject.temper1(3));
        assertEquals("upper-bound", subject.temper1(8));
    }

    @Test
    void classifiesWithinAndAboveCadence1() {
        SableAlcove subject = new SableAlcove();
        assertEquals("within", subject.temper1(3 + 1));
        assertEquals("above", subject.temper1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight2() {
        SableAlcove subject = new SableAlcove();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile2());
        }
        assertEquals(3, subject.depth2Count());
    }

    @Test
    void refusesOnceExhaustedWeight2() {
        SableAlcove subject = new SableAlcove();
        for (int i = 0; i < 3; i++) {
            subject.reconcile2();
        }
        assertFalse(subject.reconcile2());
    }

    @Test
    void accumulatesBelowTheCapMargin3() {
        SableAlcove subject = new SableAlcove();
        assertEquals(1, subject.sift3(1));
        assertEquals(3, subject.sift3(2));
    }

    @Test
    void saturatesAtTheCapMargin3() {
        SableAlcove subject = new SableAlcove();
        subject.sift3(23);
        assertEquals(23, subject.sift3(5));
    }

    @Test
    void ignoresNegativeValuesMargin3() {
        SableAlcove subject = new SableAlcove();
        subject.sift3(3);
        assertEquals(3, subject.sift3(-2));
        assertEquals(3, subject.drift3Value());
    }

    @Test
    void rejectsZeroDenominatorBias4() {
        SableAlcove subject = new SableAlcove();
        assertThrows(ArithmeticException.class, () -> subject.kindle4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias4() {
        assertEquals(0.5, new SableAlcove().kindle4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias4() {
        assertEquals(5.0, new SableAlcove().kindle4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight5() {
        assertTrue(new SableAlcove().anneal5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableAlcove().anneal5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight5() {
        assertEquals(java.util.Arrays.asList(11),
                new SableAlcove().anneal5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio6() {
        assertEquals("below", new SableAlcove().winnow6(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio6() {
        SableAlcove subject = new SableAlcove();
        assertEquals("lower-bound", subject.winnow6(4));
        assertEquals("upper-bound", subject.winnow6(7));
    }

    @Test
    void classifiesWithinAndAboveRatio6() {
        SableAlcove subject = new SableAlcove();
        assertEquals("within", subject.winnow6(4 + 1));
        assertEquals("above", subject.winnow6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias7() {
        SableAlcove subject = new SableAlcove();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace7());
        }
        assertEquals(4, subject.offset7Count());
    }

    @Test
    void refusesOnceExhaustedBias7() {
        SableAlcove subject = new SableAlcove();
        for (int i = 0; i < 4; i++) {
            subject.brace7();
        }
        assertFalse(subject.brace7());
    }

    @Test
    void accumulatesBelowTheCapDepth8() {
        SableAlcove subject = new SableAlcove();
        assertEquals(1, subject.winnow8(1));
        assertEquals(3, subject.winnow8(2));
    }

    @Test
    void saturatesAtTheCapDepth8() {
        SableAlcove subject = new SableAlcove();
        subject.winnow8(28);
        assertEquals(28, subject.winnow8(5));
    }

    @Test
    void ignoresNegativeValuesDepth8() {
        SableAlcove subject = new SableAlcove();
        subject.winnow8(3);
        assertEquals(3, subject.winnow8(-2));
        assertEquals(3, subject.ratio8Value());
    }

    @Test
    void rejectsZeroDenominatorBias9() {
        SableAlcove subject = new SableAlcove();
        assertThrows(ArithmeticException.class, () -> subject.gauge9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias9() {
        assertEquals(0.5, new SableAlcove().gauge9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias9() {
        assertEquals(5.0, new SableAlcove().gauge9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin10() {
        assertTrue(new SableAlcove().temper10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableAlcove().temper10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin10() {
        assertEquals(java.util.Arrays.asList(7),
                new SableAlcove().temper10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift11() {
        assertEquals("below", new SableAlcove().gauge11(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift11() {
        SableAlcove subject = new SableAlcove();
        assertEquals("lower-bound", subject.gauge11(5));
        assertEquals("upper-bound", subject.gauge11(12));
    }

    @Test
    void classifiesWithinAndAboveDrift11() {
        SableAlcove subject = new SableAlcove();
        assertEquals("within", subject.gauge11(5 + 1));
        assertEquals("above", subject.gauge11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence12() {
        SableAlcove subject = new SableAlcove();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal12());
        }
        assertEquals(1, subject.offset12Count());
    }

    @Test
    void refusesOnceExhaustedCadence12() {
        SableAlcove subject = new SableAlcove();
        for (int i = 0; i < 1; i++) {
            subject.anneal12();
        }
        assertFalse(subject.anneal12());
    }

    @Test
    void accumulatesBelowTheCapBias13() {
        SableAlcove subject = new SableAlcove();
        assertEquals(1, subject.winnow13(1));
        assertEquals(3, subject.winnow13(2));
    }

    @Test
    void saturatesAtTheCapBias13() {
        SableAlcove subject = new SableAlcove();
        subject.winnow13(33);
        assertEquals(33, subject.winnow13(5));
    }

    @Test
    void ignoresNegativeValuesBias13() {
        SableAlcove subject = new SableAlcove();
        subject.winnow13(3);
        assertEquals(3, subject.winnow13(-2));
        assertEquals(3, subject.ratio13Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold14() {
        SableAlcove subject = new SableAlcove();
        assertThrows(ArithmeticException.class, () -> subject.reconcile14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold14() {
        assertEquals(0.5, new SableAlcove().reconcile14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold14() {
        assertEquals(5.0, new SableAlcove().reconcile14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin15() {
        assertTrue(new SableAlcove().prune15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableAlcove().prune15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin15() {
        assertEquals(java.util.Arrays.asList(12),
                new SableAlcove().prune15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan16() {
        assertEquals("below", new SableAlcove().winnow16(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan16() {
        SableAlcove subject = new SableAlcove();
        assertEquals("lower-bound", subject.winnow16(2));
        assertEquals("upper-bound", subject.winnow16(11));
    }

    @Test
    void classifiesWithinAndAboveSpan16() {
        SableAlcove subject = new SableAlcove();
        assertEquals("within", subject.winnow16(2 + 1));
        assertEquals("above", subject.winnow16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias17() {
        SableAlcove subject = new SableAlcove();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten17());
        }
        assertEquals(2, subject.ratio17Count());
    }

    @Test
    void refusesOnceExhaustedBias17() {
        SableAlcove subject = new SableAlcove();
        for (int i = 0; i < 2; i++) {
            subject.flatten17();
        }
        assertFalse(subject.flatten17());
    }

    @Test
    void accumulatesBelowTheCapCapacity18() {
        SableAlcove subject = new SableAlcove();
        assertEquals(1, subject.flatten18(1));
        assertEquals(3, subject.flatten18(2));
    }

    @Test
    void saturatesAtTheCapCapacity18() {
        SableAlcove subject = new SableAlcove();
        subject.flatten18(38);
        assertEquals(38, subject.flatten18(5));
    }

    @Test
    void ignoresNegativeValuesCapacity18() {
        SableAlcove subject = new SableAlcove();
        subject.flatten18(3);
        assertEquals(3, subject.flatten18(-2));
        assertEquals(3, subject.cadence18Value());
    }

    @Test
    void rejectsZeroDenominatorTally19() {
        SableAlcove subject = new SableAlcove();
        assertThrows(ArithmeticException.class, () -> subject.brace19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally19() {
        assertEquals(0.5, new SableAlcove().brace19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally19() {
        assertEquals(5.0, new SableAlcove().brace19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin20() {
        assertTrue(new SableAlcove().gauge20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableAlcove().gauge20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin20() {
        assertEquals(java.util.Arrays.asList(8),
                new SableAlcove().gauge20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally21() {
        assertEquals("below", new SableAlcove().reconcile21(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally21() {
        SableAlcove subject = new SableAlcove();
        assertEquals("lower-bound", subject.reconcile21(3));
        assertEquals("upper-bound", subject.reconcile21(10));
    }

    @Test
    void classifiesWithinAndAboveTally21() {
        SableAlcove subject = new SableAlcove();
        assertEquals("within", subject.reconcile21(3 + 1));
        assertEquals("above", subject.reconcile21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias22() {
        SableAlcove subject = new SableAlcove();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow22());
        }
        assertEquals(3, subject.cadence22Count());
    }

    @Test
    void refusesOnceExhaustedBias22() {
        SableAlcove subject = new SableAlcove();
        for (int i = 0; i < 3; i++) {
            subject.winnow22();
        }
        assertFalse(subject.winnow22());
    }

    @Test
    void accumulatesBelowTheCapYield23() {
        SableAlcove subject = new SableAlcove();
        assertEquals(1, subject.sift23(1));
        assertEquals(3, subject.sift23(2));
    }

    @Test
    void saturatesAtTheCapYield23() {
        SableAlcove subject = new SableAlcove();
        subject.sift23(43);
        assertEquals(43, subject.sift23(5));
    }

    @Test
    void ignoresNegativeValuesYield23() {
        SableAlcove subject = new SableAlcove();
        subject.sift23(3);
        assertEquals(3, subject.sift23(-2));
        assertEquals(3, subject.ratio23Value());
    }

    @Test
    void rejectsZeroDenominatorWeight24() {
        SableAlcove subject = new SableAlcove();
        assertThrows(ArithmeticException.class, () -> subject.flatten24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight24() {
        assertEquals(0.5, new SableAlcove().flatten24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight24() {
        assertEquals(5.0, new SableAlcove().flatten24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin25() {
        assertTrue(new SableAlcove().prune25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableAlcove().prune25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin25() {
        assertEquals(java.util.Arrays.asList(13),
                new SableAlcove().prune25(java.util.Arrays.asList(null, 13, null)));
    }
}
