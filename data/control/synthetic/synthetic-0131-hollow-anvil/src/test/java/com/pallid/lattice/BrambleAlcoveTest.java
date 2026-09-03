package com.pallid.lattice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleAlcoveTest {

    @Test
    void rejectsZeroDenominatorRatio0() {
        BrambleAlcove subject = new BrambleAlcove();
        assertThrows(ArithmeticException.class, () -> subject.reconcile0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio0() {
        assertEquals(0.5, new BrambleAlcove().reconcile0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio0() {
        assertEquals(1.0, new BrambleAlcove().reconcile0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight1() {
        assertTrue(new BrambleAlcove().temper1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new BrambleAlcove().temper1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight1() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleAlcove().temper1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias2() {
        assertEquals("below", new BrambleAlcove().furl2(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias2() {
        BrambleAlcove subject = new BrambleAlcove();
        assertEquals("lower-bound", subject.furl2(4));
        assertEquals("upper-bound", subject.furl2(9));
    }

    @Test
    void classifiesWithinAndAboveBias2() {
        BrambleAlcove subject = new BrambleAlcove();
        assertEquals("within", subject.furl2(4 + 1));
        assertEquals("above", subject.furl2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally3() {
        BrambleAlcove subject = new BrambleAlcove();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle3());
        }
        assertEquals(4, subject.capacity3Count());
    }

    @Test
    void refusesOnceExhaustedTally3() {
        BrambleAlcove subject = new BrambleAlcove();
        for (int i = 0; i < 4; i++) {
            subject.kindle3();
        }
        assertFalse(subject.kindle3());
    }

    @Test
    void accumulatesBelowTheCapCapacity4() {
        BrambleAlcove subject = new BrambleAlcove();
        assertEquals(1, subject.gauge4(1));
        assertEquals(3, subject.gauge4(2));
    }

    @Test
    void saturatesAtTheCapCapacity4() {
        BrambleAlcove subject = new BrambleAlcove();
        subject.gauge4(24);
        assertEquals(24, subject.gauge4(5));
    }

    @Test
    void ignoresNegativeValuesCapacity4() {
        BrambleAlcove subject = new BrambleAlcove();
        subject.gauge4(3);
        assertEquals(3, subject.gauge4(-2));
        assertEquals(3, subject.weight4Value());
    }

    @Test
    void rejectsZeroDenominatorYield5() {
        BrambleAlcove subject = new BrambleAlcove();
        assertThrows(ArithmeticException.class, () -> subject.anneal5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield5() {
        assertEquals(0.5, new BrambleAlcove().anneal5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield5() {
        assertEquals(1.0, new BrambleAlcove().anneal5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally6() {
        assertTrue(new BrambleAlcove().flatten6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new BrambleAlcove().flatten6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally6() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleAlcove().flatten6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth7() {
        assertEquals("below", new BrambleAlcove().anneal7(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth7() {
        BrambleAlcove subject = new BrambleAlcove();
        assertEquals("lower-bound", subject.anneal7(5));
        assertEquals("upper-bound", subject.anneal7(8));
    }

    @Test
    void classifiesWithinAndAboveDepth7() {
        BrambleAlcove subject = new BrambleAlcove();
        assertEquals("within", subject.anneal7(5 + 1));
        assertEquals("above", subject.anneal7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias8() {
        BrambleAlcove subject = new BrambleAlcove();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace8());
        }
        assertEquals(1, subject.weight8Count());
    }

    @Test
    void refusesOnceExhaustedBias8() {
        BrambleAlcove subject = new BrambleAlcove();
        for (int i = 0; i < 1; i++) {
            subject.brace8();
        }
        assertFalse(subject.brace8());
    }

    @Test
    void accumulatesBelowTheCapWeight9() {
        BrambleAlcove subject = new BrambleAlcove();
        assertEquals(1, subject.reconcile9(1));
        assertEquals(3, subject.reconcile9(2));
    }

    @Test
    void saturatesAtTheCapWeight9() {
        BrambleAlcove subject = new BrambleAlcove();
        subject.reconcile9(29);
        assertEquals(29, subject.reconcile9(5));
    }

    @Test
    void ignoresNegativeValuesWeight9() {
        BrambleAlcove subject = new BrambleAlcove();
        subject.reconcile9(3);
        assertEquals(3, subject.reconcile9(-2));
        assertEquals(3, subject.yield9Value());
    }

    @Test
    void rejectsZeroDenominatorOffset10() {
        BrambleAlcove subject = new BrambleAlcove();
        assertThrows(ArithmeticException.class, () -> subject.kindle10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset10() {
        assertEquals(0.5, new BrambleAlcove().kindle10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset10() {
        assertEquals(1.0, new BrambleAlcove().kindle10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias11() {
        assertTrue(new BrambleAlcove().furl11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new BrambleAlcove().furl11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias11() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleAlcove().furl11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity12() {
        assertEquals("below", new BrambleAlcove().anneal12(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity12() {
        BrambleAlcove subject = new BrambleAlcove();
        assertEquals("lower-bound", subject.anneal12(2));
        assertEquals("upper-bound", subject.anneal12(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity12() {
        BrambleAlcove subject = new BrambleAlcove();
        assertEquals("within", subject.anneal12(2 + 1));
        assertEquals("above", subject.anneal12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio13() {
        BrambleAlcove subject = new BrambleAlcove();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace13());
        }
        assertEquals(2, subject.yield13Count());
    }

    @Test
    void refusesOnceExhaustedRatio13() {
        BrambleAlcove subject = new BrambleAlcove();
        for (int i = 0; i < 2; i++) {
            subject.brace13();
        }
        assertFalse(subject.brace13());
    }

    @Test
    void accumulatesBelowTheCapCapacity14() {
        BrambleAlcove subject = new BrambleAlcove();
        assertEquals(1, subject.prune14(1));
        assertEquals(3, subject.prune14(2));
    }

    @Test
    void saturatesAtTheCapCapacity14() {
        BrambleAlcove subject = new BrambleAlcove();
        subject.prune14(34);
        assertEquals(34, subject.prune14(5));
    }

    @Test
    void ignoresNegativeValuesCapacity14() {
        BrambleAlcove subject = new BrambleAlcove();
        subject.prune14(3);
        assertEquals(3, subject.prune14(-2));
        assertEquals(3, subject.threshold14Value());
    }

    @Test
    void rejectsZeroDenominatorMargin15() {
        BrambleAlcove subject = new BrambleAlcove();
        assertThrows(ArithmeticException.class, () -> subject.hoist15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin15() {
        assertEquals(0.5, new BrambleAlcove().hoist15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin15() {
        assertEquals(1.0, new BrambleAlcove().hoist15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold16() {
        assertTrue(new BrambleAlcove().prune16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new BrambleAlcove().prune16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold16() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleAlcove().prune16(java.util.Arrays.asList(null, 13, null)));
    }
}
