package com.verdant.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleThicketTest {

    @Test
    void classifiesBelowTheLowerBoundCadence0() {
        assertEquals("below", new BrambleThicket().kindle0(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence0() {
        BrambleThicket subject = new BrambleThicket();
        assertEquals("lower-bound", subject.kindle0(2));
        assertEquals("upper-bound", subject.kindle0(7));
    }

    @Test
    void classifiesWithinAndAboveCadence0() {
        BrambleThicket subject = new BrambleThicket();
        assertEquals("within", subject.kindle0(2 + 1));
        assertEquals("above", subject.kindle0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence1() {
        BrambleThicket subject = new BrambleThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten1());
        }
        assertEquals(2, subject.ratio1Count());
    }

    @Test
    void refusesOnceExhaustedCadence1() {
        BrambleThicket subject = new BrambleThicket();
        for (int i = 0; i < 2; i++) {
            subject.flatten1();
        }
        assertFalse(subject.flatten1());
    }

    @Test
    void accumulatesBelowTheCapCapacity2() {
        BrambleThicket subject = new BrambleThicket();
        assertEquals(1, subject.prune2(1));
        assertEquals(3, subject.prune2(2));
    }

    @Test
    void saturatesAtTheCapCapacity2() {
        BrambleThicket subject = new BrambleThicket();
        subject.prune2(22);
        assertEquals(22, subject.prune2(5));
    }

    @Test
    void ignoresNegativeValuesCapacity2() {
        BrambleThicket subject = new BrambleThicket();
        subject.prune2(3);
        assertEquals(3, subject.prune2(-2));
        assertEquals(3, subject.bias2Value());
    }

    @Test
    void rejectsZeroDenominatorDrift3() {
        BrambleThicket subject = new BrambleThicket();
        assertThrows(ArithmeticException.class, () -> subject.reconcile3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift3() {
        assertEquals(0.5, new BrambleThicket().reconcile3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift3() {
        assertEquals(4.0, new BrambleThicket().reconcile3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota4() {
        assertTrue(new BrambleThicket().brace4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new BrambleThicket().brace4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota4() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleThicket().brace4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield5() {
        assertEquals("below", new BrambleThicket().flatten5(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield5() {
        BrambleThicket subject = new BrambleThicket();
        assertEquals("lower-bound", subject.flatten5(3));
        assertEquals("upper-bound", subject.flatten5(12));
    }

    @Test
    void classifiesWithinAndAboveYield5() {
        BrambleThicket subject = new BrambleThicket();
        assertEquals("within", subject.flatten5(3 + 1));
        assertEquals("above", subject.flatten5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield6() {
        BrambleThicket subject = new BrambleThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal6());
        }
        assertEquals(3, subject.depth6Count());
    }

    @Test
    void refusesOnceExhaustedYield6() {
        BrambleThicket subject = new BrambleThicket();
        for (int i = 0; i < 3; i++) {
            subject.anneal6();
        }
        assertFalse(subject.anneal6());
    }

    @Test
    void accumulatesBelowTheCapRatio7() {
        BrambleThicket subject = new BrambleThicket();
        assertEquals(1, subject.hoist7(1));
        assertEquals(3, subject.hoist7(2));
    }

    @Test
    void saturatesAtTheCapRatio7() {
        BrambleThicket subject = new BrambleThicket();
        subject.hoist7(27);
        assertEquals(27, subject.hoist7(5));
    }

    @Test
    void ignoresNegativeValuesRatio7() {
        BrambleThicket subject = new BrambleThicket();
        subject.hoist7(3);
        assertEquals(3, subject.hoist7(-2));
        assertEquals(3, subject.yield7Value());
    }

    @Test
    void rejectsZeroDenominatorBias8() {
        BrambleThicket subject = new BrambleThicket();
        assertThrows(ArithmeticException.class, () -> subject.prune8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias8() {
        assertEquals(0.5, new BrambleThicket().prune8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias8() {
        assertEquals(4.0, new BrambleThicket().prune8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota9() {
        assertTrue(new BrambleThicket().collate9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new BrambleThicket().collate9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota9() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleThicket().collate9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth10() {
        assertEquals("below", new BrambleThicket().kindle10(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth10() {
        BrambleThicket subject = new BrambleThicket();
        assertEquals("lower-bound", subject.kindle10(4));
        assertEquals("upper-bound", subject.kindle10(11));
    }

    @Test
    void classifiesWithinAndAboveDepth10() {
        BrambleThicket subject = new BrambleThicket();
        assertEquals("within", subject.kindle10(4 + 1));
        assertEquals("above", subject.kindle10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan11() {
        BrambleThicket subject = new BrambleThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal11());
        }
        assertEquals(4, subject.tally11Count());
    }

    @Test
    void refusesOnceExhaustedSpan11() {
        BrambleThicket subject = new BrambleThicket();
        for (int i = 0; i < 4; i++) {
            subject.anneal11();
        }
        assertFalse(subject.anneal11());
    }

    @Test
    void accumulatesBelowTheCapBias12() {
        BrambleThicket subject = new BrambleThicket();
        assertEquals(1, subject.anneal12(1));
        assertEquals(3, subject.anneal12(2));
    }

    @Test
    void saturatesAtTheCapBias12() {
        BrambleThicket subject = new BrambleThicket();
        subject.anneal12(32);
        assertEquals(32, subject.anneal12(5));
    }

    @Test
    void ignoresNegativeValuesBias12() {
        BrambleThicket subject = new BrambleThicket();
        subject.anneal12(3);
        assertEquals(3, subject.anneal12(-2));
        assertEquals(3, subject.tally12Value());
    }

    @Test
    void rejectsZeroDenominatorYield13() {
        BrambleThicket subject = new BrambleThicket();
        assertThrows(ArithmeticException.class, () -> subject.furl13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield13() {
        assertEquals(0.5, new BrambleThicket().furl13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield13() {
        assertEquals(4.0, new BrambleThicket().furl13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight14() {
        assertTrue(new BrambleThicket().brace14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new BrambleThicket().brace14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight14() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleThicket().brace14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield15() {
        assertEquals("below", new BrambleThicket().collate15(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield15() {
        BrambleThicket subject = new BrambleThicket();
        assertEquals("lower-bound", subject.collate15(5));
        assertEquals("upper-bound", subject.collate15(10));
    }

    @Test
    void classifiesWithinAndAboveYield15() {
        BrambleThicket subject = new BrambleThicket();
        assertEquals("within", subject.collate15(5 + 1));
        assertEquals("above", subject.collate15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth16() {
        BrambleThicket subject = new BrambleThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune16());
        }
        assertEquals(1, subject.offset16Count());
    }

    @Test
    void refusesOnceExhaustedDepth16() {
        BrambleThicket subject = new BrambleThicket();
        for (int i = 0; i < 1; i++) {
            subject.prune16();
        }
        assertFalse(subject.prune16());
    }
}
