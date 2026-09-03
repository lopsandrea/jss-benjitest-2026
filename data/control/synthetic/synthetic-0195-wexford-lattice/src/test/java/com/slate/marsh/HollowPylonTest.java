package com.slate.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowPylonTest {

    @Test
    void accumulatesBelowTheCapCapacity0() {
        HollowPylon subject = new HollowPylon();
        assertEquals(1, subject.temper0(1));
        assertEquals(3, subject.temper0(2));
    }

    @Test
    void saturatesAtTheCapCapacity0() {
        HollowPylon subject = new HollowPylon();
        subject.temper0(20);
        assertEquals(20, subject.temper0(5));
    }

    @Test
    void ignoresNegativeValuesCapacity0() {
        HollowPylon subject = new HollowPylon();
        subject.temper0(3);
        assertEquals(3, subject.temper0(-2));
        assertEquals(3, subject.yield0Value());
    }

    @Test
    void rejectsZeroDenominatorYield1() {
        HollowPylon subject = new HollowPylon();
        assertThrows(ArithmeticException.class, () -> subject.collate1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield1() {
        assertEquals(0.5, new HollowPylon().collate1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield1() {
        assertEquals(2.0, new HollowPylon().collate1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold2() {
        assertTrue(new HollowPylon().prune2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowPylon().prune2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold2() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowPylon().prune2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold3() {
        assertEquals("below", new HollowPylon().sift3(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold3() {
        HollowPylon subject = new HollowPylon();
        assertEquals("lower-bound", subject.sift3(5));
        assertEquals("upper-bound", subject.sift3(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold3() {
        HollowPylon subject = new HollowPylon();
        assertEquals("within", subject.sift3(5 + 1));
        assertEquals("above", subject.sift3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin4() {
        HollowPylon subject = new HollowPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift4());
        }
        assertEquals(1, subject.drift4Count());
    }

    @Test
    void refusesOnceExhaustedMargin4() {
        HollowPylon subject = new HollowPylon();
        for (int i = 0; i < 1; i++) {
            subject.sift4();
        }
        assertFalse(subject.sift4());
    }

    @Test
    void accumulatesBelowTheCapDrift5() {
        HollowPylon subject = new HollowPylon();
        assertEquals(1, subject.tally5(1));
        assertEquals(3, subject.tally5(2));
    }

    @Test
    void saturatesAtTheCapDrift5() {
        HollowPylon subject = new HollowPylon();
        subject.tally5(25);
        assertEquals(25, subject.tally5(5));
    }

    @Test
    void ignoresNegativeValuesDrift5() {
        HollowPylon subject = new HollowPylon();
        subject.tally5(3);
        assertEquals(3, subject.tally5(-2));
        assertEquals(3, subject.bias5Value());
    }

    @Test
    void rejectsZeroDenominatorYield6() {
        HollowPylon subject = new HollowPylon();
        assertThrows(ArithmeticException.class, () -> subject.tally6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield6() {
        assertEquals(0.5, new HollowPylon().tally6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield6() {
        assertEquals(2.0, new HollowPylon().tally6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio7() {
        assertTrue(new HollowPylon().hoist7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowPylon().hoist7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio7() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowPylon().hoist7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally8() {
        assertEquals("below", new HollowPylon().furl8(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally8() {
        HollowPylon subject = new HollowPylon();
        assertEquals("lower-bound", subject.furl8(2));
        assertEquals("upper-bound", subject.furl8(9));
    }

    @Test
    void classifiesWithinAndAboveTally8() {
        HollowPylon subject = new HollowPylon();
        assertEquals("within", subject.furl8(2 + 1));
        assertEquals("above", subject.furl8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset9() {
        HollowPylon subject = new HollowPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper9());
        }
        assertEquals(2, subject.drift9Count());
    }

    @Test
    void refusesOnceExhaustedOffset9() {
        HollowPylon subject = new HollowPylon();
        for (int i = 0; i < 2; i++) {
            subject.temper9();
        }
        assertFalse(subject.temper9());
    }

    @Test
    void accumulatesBelowTheCapDepth10() {
        HollowPylon subject = new HollowPylon();
        assertEquals(1, subject.flatten10(1));
        assertEquals(3, subject.flatten10(2));
    }

    @Test
    void saturatesAtTheCapDepth10() {
        HollowPylon subject = new HollowPylon();
        subject.flatten10(30);
        assertEquals(30, subject.flatten10(5));
    }

    @Test
    void ignoresNegativeValuesDepth10() {
        HollowPylon subject = new HollowPylon();
        subject.flatten10(3);
        assertEquals(3, subject.flatten10(-2));
        assertEquals(3, subject.span10Value());
    }

    @Test
    void rejectsZeroDenominatorMargin11() {
        HollowPylon subject = new HollowPylon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin11() {
        assertEquals(0.5, new HollowPylon().reconcile11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin11() {
        assertEquals(2.0, new HollowPylon().reconcile11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth12() {
        assertTrue(new HollowPylon().brace12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowPylon().brace12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth12() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowPylon().brace12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence13() {
        assertEquals("below", new HollowPylon().brace13(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence13() {
        HollowPylon subject = new HollowPylon();
        assertEquals("lower-bound", subject.brace13(3));
        assertEquals("upper-bound", subject.brace13(8));
    }

    @Test
    void classifiesWithinAndAboveCadence13() {
        HollowPylon subject = new HollowPylon();
        assertEquals("within", subject.brace13(3 + 1));
        assertEquals("above", subject.brace13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield14() {
        HollowPylon subject = new HollowPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune14());
        }
        assertEquals(3, subject.offset14Count());
    }

    @Test
    void refusesOnceExhaustedYield14() {
        HollowPylon subject = new HollowPylon();
        for (int i = 0; i < 3; i++) {
            subject.prune14();
        }
        assertFalse(subject.prune14());
    }

    @Test
    void accumulatesBelowTheCapYield15() {
        HollowPylon subject = new HollowPylon();
        assertEquals(1, subject.reconcile15(1));
        assertEquals(3, subject.reconcile15(2));
    }

    @Test
    void saturatesAtTheCapYield15() {
        HollowPylon subject = new HollowPylon();
        subject.reconcile15(35);
        assertEquals(35, subject.reconcile15(5));
    }

    @Test
    void ignoresNegativeValuesYield15() {
        HollowPylon subject = new HollowPylon();
        subject.reconcile15(3);
        assertEquals(3, subject.reconcile15(-2));
        assertEquals(3, subject.weight15Value());
    }

    @Test
    void rejectsZeroDenominatorDrift16() {
        HollowPylon subject = new HollowPylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift16() {
        assertEquals(0.5, new HollowPylon().kindle16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift16() {
        assertEquals(2.0, new HollowPylon().kindle16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield17() {
        assertTrue(new HollowPylon().hoist17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowPylon().hoist17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield17() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowPylon().hoist17(java.util.Arrays.asList(null, 14, null)));
    }
}
