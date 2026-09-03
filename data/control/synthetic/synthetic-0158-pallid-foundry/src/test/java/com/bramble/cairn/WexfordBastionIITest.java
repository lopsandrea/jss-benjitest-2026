package com.bramble.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordBastionIITest {

    @Test
    void classifiesBelowTheLowerBoundCadence0() {
        assertEquals("below", new WexfordBastionII().anneal0(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence0() {
        WexfordBastionII subject = new WexfordBastionII();
        assertEquals("lower-bound", subject.anneal0(2));
        assertEquals("upper-bound", subject.anneal0(7));
    }

    @Test
    void classifiesWithinAndAboveCadence0() {
        WexfordBastionII subject = new WexfordBastionII();
        assertEquals("within", subject.anneal0(2 + 1));
        assertEquals("above", subject.anneal0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin1() {
        WexfordBastionII subject = new WexfordBastionII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace1());
        }
        assertEquals(2, subject.span1Count());
    }

    @Test
    void refusesOnceExhaustedMargin1() {
        WexfordBastionII subject = new WexfordBastionII();
        for (int i = 0; i < 2; i++) {
            subject.brace1();
        }
        assertFalse(subject.brace1());
    }

    @Test
    void accumulatesBelowTheCapDrift2() {
        WexfordBastionII subject = new WexfordBastionII();
        assertEquals(1, subject.kindle2(1));
        assertEquals(3, subject.kindle2(2));
    }

    @Test
    void saturatesAtTheCapDrift2() {
        WexfordBastionII subject = new WexfordBastionII();
        subject.kindle2(22);
        assertEquals(22, subject.kindle2(5));
    }

    @Test
    void ignoresNegativeValuesDrift2() {
        WexfordBastionII subject = new WexfordBastionII();
        subject.kindle2(3);
        assertEquals(3, subject.kindle2(-2));
        assertEquals(3, subject.bias2Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold3() {
        WexfordBastionII subject = new WexfordBastionII();
        assertThrows(ArithmeticException.class, () -> subject.gauge3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold3() {
        assertEquals(0.5, new WexfordBastionII().gauge3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold3() {
        assertEquals(4.0, new WexfordBastionII().gauge3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin4() {
        assertTrue(new WexfordBastionII().collate4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new WexfordBastionII().collate4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin4() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordBastionII().collate4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias5() {
        assertEquals("below", new WexfordBastionII().sift5(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias5() {
        WexfordBastionII subject = new WexfordBastionII();
        assertEquals("lower-bound", subject.sift5(3));
        assertEquals("upper-bound", subject.sift5(12));
    }

    @Test
    void classifiesWithinAndAboveBias5() {
        WexfordBastionII subject = new WexfordBastionII();
        assertEquals("within", subject.sift5(3 + 1));
        assertEquals("above", subject.sift5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence6() {
        WexfordBastionII subject = new WexfordBastionII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten6());
        }
        assertEquals(3, subject.tally6Count());
    }

    @Test
    void refusesOnceExhaustedCadence6() {
        WexfordBastionII subject = new WexfordBastionII();
        for (int i = 0; i < 3; i++) {
            subject.flatten6();
        }
        assertFalse(subject.flatten6());
    }

    @Test
    void accumulatesBelowTheCapOffset7() {
        WexfordBastionII subject = new WexfordBastionII();
        assertEquals(1, subject.gauge7(1));
        assertEquals(3, subject.gauge7(2));
    }

    @Test
    void saturatesAtTheCapOffset7() {
        WexfordBastionII subject = new WexfordBastionII();
        subject.gauge7(27);
        assertEquals(27, subject.gauge7(5));
    }

    @Test
    void ignoresNegativeValuesOffset7() {
        WexfordBastionII subject = new WexfordBastionII();
        subject.gauge7(3);
        assertEquals(3, subject.gauge7(-2));
        assertEquals(3, subject.margin7Value());
    }

    @Test
    void rejectsZeroDenominatorBias8() {
        WexfordBastionII subject = new WexfordBastionII();
        assertThrows(ArithmeticException.class, () -> subject.brace8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias8() {
        assertEquals(0.5, new WexfordBastionII().brace8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias8() {
        assertEquals(4.0, new WexfordBastionII().brace8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity9() {
        assertTrue(new WexfordBastionII().winnow9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new WexfordBastionII().winnow9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity9() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordBastionII().winnow9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan10() {
        assertEquals("below", new WexfordBastionII().prune10(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan10() {
        WexfordBastionII subject = new WexfordBastionII();
        assertEquals("lower-bound", subject.prune10(4));
        assertEquals("upper-bound", subject.prune10(11));
    }

    @Test
    void classifiesWithinAndAboveSpan10() {
        WexfordBastionII subject = new WexfordBastionII();
        assertEquals("within", subject.prune10(4 + 1));
        assertEquals("above", subject.prune10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift11() {
        WexfordBastionII subject = new WexfordBastionII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist11());
        }
        assertEquals(4, subject.ratio11Count());
    }

    @Test
    void refusesOnceExhaustedDrift11() {
        WexfordBastionII subject = new WexfordBastionII();
        for (int i = 0; i < 4; i++) {
            subject.hoist11();
        }
        assertFalse(subject.hoist11());
    }

    @Test
    void accumulatesBelowTheCapTally12() {
        WexfordBastionII subject = new WexfordBastionII();
        assertEquals(1, subject.furl12(1));
        assertEquals(3, subject.furl12(2));
    }

    @Test
    void saturatesAtTheCapTally12() {
        WexfordBastionII subject = new WexfordBastionII();
        subject.furl12(32);
        assertEquals(32, subject.furl12(5));
    }

    @Test
    void ignoresNegativeValuesTally12() {
        WexfordBastionII subject = new WexfordBastionII();
        subject.furl12(3);
        assertEquals(3, subject.furl12(-2));
        assertEquals(3, subject.offset12Value());
    }
}
