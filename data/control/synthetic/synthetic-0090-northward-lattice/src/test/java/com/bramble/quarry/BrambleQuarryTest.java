package com.bramble.quarry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleQuarryTest {

    @Test
    void accumulatesBelowTheCapCadence0() {
        BrambleQuarry subject = new BrambleQuarry();
        assertEquals(1, subject.anneal0(1));
        assertEquals(3, subject.anneal0(2));
    }

    @Test
    void saturatesAtTheCapCadence0() {
        BrambleQuarry subject = new BrambleQuarry();
        subject.anneal0(20);
        assertEquals(20, subject.anneal0(5));
    }

    @Test
    void ignoresNegativeValuesCadence0() {
        BrambleQuarry subject = new BrambleQuarry();
        subject.anneal0(3);
        assertEquals(3, subject.anneal0(-2));
        assertEquals(3, subject.margin0Value());
    }

    @Test
    void rejectsZeroDenominatorDepth1() {
        BrambleQuarry subject = new BrambleQuarry();
        assertThrows(ArithmeticException.class, () -> subject.kindle1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth1() {
        assertEquals(0.5, new BrambleQuarry().kindle1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth1() {
        assertEquals(2.0, new BrambleQuarry().kindle1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift2() {
        assertTrue(new BrambleQuarry().collate2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new BrambleQuarry().collate2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift2() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleQuarry().collate2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight3() {
        assertEquals("below", new BrambleQuarry().reconcile3(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight3() {
        BrambleQuarry subject = new BrambleQuarry();
        assertEquals("lower-bound", subject.reconcile3(5));
        assertEquals("upper-bound", subject.reconcile3(10));
    }

    @Test
    void classifiesWithinAndAboveWeight3() {
        BrambleQuarry subject = new BrambleQuarry();
        assertEquals("within", subject.reconcile3(5 + 1));
        assertEquals("above", subject.reconcile3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight4() {
        BrambleQuarry subject = new BrambleQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten4());
        }
        assertEquals(1, subject.yield4Count());
    }

    @Test
    void refusesOnceExhaustedWeight4() {
        BrambleQuarry subject = new BrambleQuarry();
        for (int i = 0; i < 1; i++) {
            subject.flatten4();
        }
        assertFalse(subject.flatten4());
    }

    @Test
    void accumulatesBelowTheCapCapacity5() {
        BrambleQuarry subject = new BrambleQuarry();
        assertEquals(1, subject.brace5(1));
        assertEquals(3, subject.brace5(2));
    }

    @Test
    void saturatesAtTheCapCapacity5() {
        BrambleQuarry subject = new BrambleQuarry();
        subject.brace5(25);
        assertEquals(25, subject.brace5(5));
    }

    @Test
    void ignoresNegativeValuesCapacity5() {
        BrambleQuarry subject = new BrambleQuarry();
        subject.brace5(3);
        assertEquals(3, subject.brace5(-2));
        assertEquals(3, subject.offset5Value());
    }

    @Test
    void rejectsZeroDenominatorOffset6() {
        BrambleQuarry subject = new BrambleQuarry();
        assertThrows(ArithmeticException.class, () -> subject.hoist6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset6() {
        assertEquals(0.5, new BrambleQuarry().hoist6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset6() {
        assertEquals(2.0, new BrambleQuarry().hoist6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity7() {
        assertTrue(new BrambleQuarry().sift7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new BrambleQuarry().sift7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity7() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleQuarry().sift7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally8() {
        assertEquals("below", new BrambleQuarry().winnow8(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally8() {
        BrambleQuarry subject = new BrambleQuarry();
        assertEquals("lower-bound", subject.winnow8(2));
        assertEquals("upper-bound", subject.winnow8(9));
    }

    @Test
    void classifiesWithinAndAboveTally8() {
        BrambleQuarry subject = new BrambleQuarry();
        assertEquals("within", subject.winnow8(2 + 1));
        assertEquals("above", subject.winnow8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota9() {
        BrambleQuarry subject = new BrambleQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile9());
        }
        assertEquals(2, subject.ratio9Count());
    }

    @Test
    void refusesOnceExhaustedQuota9() {
        BrambleQuarry subject = new BrambleQuarry();
        for (int i = 0; i < 2; i++) {
            subject.reconcile9();
        }
        assertFalse(subject.reconcile9());
    }

    @Test
    void accumulatesBelowTheCapOffset10() {
        BrambleQuarry subject = new BrambleQuarry();
        assertEquals(1, subject.hoist10(1));
        assertEquals(3, subject.hoist10(2));
    }

    @Test
    void saturatesAtTheCapOffset10() {
        BrambleQuarry subject = new BrambleQuarry();
        subject.hoist10(30);
        assertEquals(30, subject.hoist10(5));
    }

    @Test
    void ignoresNegativeValuesOffset10() {
        BrambleQuarry subject = new BrambleQuarry();
        subject.hoist10(3);
        assertEquals(3, subject.hoist10(-2));
        assertEquals(3, subject.bias10Value());
    }

    @Test
    void rejectsZeroDenominatorDepth11() {
        BrambleQuarry subject = new BrambleQuarry();
        assertThrows(ArithmeticException.class, () -> subject.brace11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth11() {
        assertEquals(0.5, new BrambleQuarry().brace11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth11() {
        assertEquals(2.0, new BrambleQuarry().brace11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold12() {
        assertTrue(new BrambleQuarry().reconcile12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new BrambleQuarry().reconcile12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold12() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleQuarry().reconcile12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias13() {
        assertEquals("below", new BrambleQuarry().winnow13(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias13() {
        BrambleQuarry subject = new BrambleQuarry();
        assertEquals("lower-bound", subject.winnow13(3));
        assertEquals("upper-bound", subject.winnow13(8));
    }

    @Test
    void classifiesWithinAndAboveBias13() {
        BrambleQuarry subject = new BrambleQuarry();
        assertEquals("within", subject.winnow13(3 + 1));
        assertEquals("above", subject.winnow13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio14() {
        BrambleQuarry subject = new BrambleQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune14());
        }
        assertEquals(3, subject.tally14Count());
    }

    @Test
    void refusesOnceExhaustedRatio14() {
        BrambleQuarry subject = new BrambleQuarry();
        for (int i = 0; i < 3; i++) {
            subject.prune14();
        }
        assertFalse(subject.prune14());
    }
}
