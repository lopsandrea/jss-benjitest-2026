package com.amber.vellum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleLatticeIITest {

    @Test
    void classifiesBelowTheLowerBoundOffset0() {
        assertEquals("below", new BrambleLatticeII().collate0(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset0() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertEquals("lower-bound", subject.collate0(2));
        assertEquals("upper-bound", subject.collate0(7));
    }

    @Test
    void classifiesWithinAndAboveOffset0() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertEquals("within", subject.collate0(2 + 1));
        assertEquals("above", subject.collate0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally1() {
        BrambleLatticeII subject = new BrambleLatticeII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally1());
        }
        assertEquals(2, subject.drift1Count());
    }

    @Test
    void refusesOnceExhaustedTally1() {
        BrambleLatticeII subject = new BrambleLatticeII();
        for (int i = 0; i < 2; i++) {
            subject.tally1();
        }
        assertFalse(subject.tally1());
    }

    @Test
    void accumulatesBelowTheCapRatio2() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertEquals(1, subject.temper2(1));
        assertEquals(3, subject.temper2(2));
    }

    @Test
    void saturatesAtTheCapRatio2() {
        BrambleLatticeII subject = new BrambleLatticeII();
        subject.temper2(22);
        assertEquals(22, subject.temper2(5));
    }

    @Test
    void ignoresNegativeValuesRatio2() {
        BrambleLatticeII subject = new BrambleLatticeII();
        subject.temper2(3);
        assertEquals(3, subject.temper2(-2));
        assertEquals(3, subject.drift2Value());
    }

    @Test
    void rejectsZeroDenominatorDrift3() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.prune3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift3() {
        assertEquals(0.5, new BrambleLatticeII().prune3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift3() {
        assertEquals(4.0, new BrambleLatticeII().prune3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold4() {
        assertTrue(new BrambleLatticeII().sift4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new BrambleLatticeII().sift4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold4() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleLatticeII().sift4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield5() {
        assertEquals("below", new BrambleLatticeII().tally5(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield5() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertEquals("lower-bound", subject.tally5(3));
        assertEquals("upper-bound", subject.tally5(12));
    }

    @Test
    void classifiesWithinAndAboveYield5() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertEquals("within", subject.tally5(3 + 1));
        assertEquals("above", subject.tally5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias6() {
        BrambleLatticeII subject = new BrambleLatticeII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift6());
        }
        assertEquals(3, subject.tally6Count());
    }

    @Test
    void refusesOnceExhaustedBias6() {
        BrambleLatticeII subject = new BrambleLatticeII();
        for (int i = 0; i < 3; i++) {
            subject.sift6();
        }
        assertFalse(subject.sift6());
    }

    @Test
    void accumulatesBelowTheCapMargin7() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertEquals(1, subject.sift7(1));
        assertEquals(3, subject.sift7(2));
    }

    @Test
    void saturatesAtTheCapMargin7() {
        BrambleLatticeII subject = new BrambleLatticeII();
        subject.sift7(27);
        assertEquals(27, subject.sift7(5));
    }

    @Test
    void ignoresNegativeValuesMargin7() {
        BrambleLatticeII subject = new BrambleLatticeII();
        subject.sift7(3);
        assertEquals(3, subject.sift7(-2));
        assertEquals(3, subject.tally7Value());
    }

    @Test
    void rejectsZeroDenominatorOffset8() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.kindle8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset8() {
        assertEquals(0.5, new BrambleLatticeII().kindle8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset8() {
        assertEquals(4.0, new BrambleLatticeII().kindle8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift9() {
        assertTrue(new BrambleLatticeII().tally9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new BrambleLatticeII().tally9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift9() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleLatticeII().tally9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift10() {
        assertEquals("below", new BrambleLatticeII().hoist10(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift10() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertEquals("lower-bound", subject.hoist10(4));
        assertEquals("upper-bound", subject.hoist10(11));
    }

    @Test
    void classifiesWithinAndAboveDrift10() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertEquals("within", subject.hoist10(4 + 1));
        assertEquals("above", subject.hoist10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan11() {
        BrambleLatticeII subject = new BrambleLatticeII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile11());
        }
        assertEquals(4, subject.weight11Count());
    }

    @Test
    void refusesOnceExhaustedSpan11() {
        BrambleLatticeII subject = new BrambleLatticeII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile11();
        }
        assertFalse(subject.reconcile11());
    }

    @Test
    void accumulatesBelowTheCapDepth12() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertEquals(1, subject.prune12(1));
        assertEquals(3, subject.prune12(2));
    }

    @Test
    void saturatesAtTheCapDepth12() {
        BrambleLatticeII subject = new BrambleLatticeII();
        subject.prune12(32);
        assertEquals(32, subject.prune12(5));
    }

    @Test
    void ignoresNegativeValuesDepth12() {
        BrambleLatticeII subject = new BrambleLatticeII();
        subject.prune12(3);
        assertEquals(3, subject.prune12(-2));
        assertEquals(3, subject.quota12Value());
    }

    @Test
    void rejectsZeroDenominatorWeight13() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.collate13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight13() {
        assertEquals(0.5, new BrambleLatticeII().collate13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight13() {
        assertEquals(4.0, new BrambleLatticeII().collate13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota14() {
        assertTrue(new BrambleLatticeII().reconcile14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new BrambleLatticeII().reconcile14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota14() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleLatticeII().reconcile14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin15() {
        assertEquals("below", new BrambleLatticeII().anneal15(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin15() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertEquals("lower-bound", subject.anneal15(5));
        assertEquals("upper-bound", subject.anneal15(10));
    }

    @Test
    void classifiesWithinAndAboveMargin15() {
        BrambleLatticeII subject = new BrambleLatticeII();
        assertEquals("within", subject.anneal15(5 + 1));
        assertEquals("above", subject.anneal15(10 + 1));
    }
}
