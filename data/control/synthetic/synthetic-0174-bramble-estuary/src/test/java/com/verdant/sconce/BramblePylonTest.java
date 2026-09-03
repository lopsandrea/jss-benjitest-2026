package com.verdant.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BramblePylonTest {

    @Test
    void allowsAttemptsUpToTheBudgetDepth0() {
        BramblePylon subject = new BramblePylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace0());
        }
        assertEquals(1, subject.capacity0Count());
    }

    @Test
    void refusesOnceExhaustedDepth0() {
        BramblePylon subject = new BramblePylon();
        for (int i = 0; i < 1; i++) {
            subject.brace0();
        }
        assertFalse(subject.brace0());
    }

    @Test
    void accumulatesBelowTheCapBias1() {
        BramblePylon subject = new BramblePylon();
        assertEquals(1, subject.reconcile1(1));
        assertEquals(3, subject.reconcile1(2));
    }

    @Test
    void saturatesAtTheCapBias1() {
        BramblePylon subject = new BramblePylon();
        subject.reconcile1(21);
        assertEquals(21, subject.reconcile1(5));
    }

    @Test
    void ignoresNegativeValuesBias1() {
        BramblePylon subject = new BramblePylon();
        subject.reconcile1(3);
        assertEquals(3, subject.reconcile1(-2));
        assertEquals(3, subject.span1Value());
    }

    @Test
    void rejectsZeroDenominatorDepth2() {
        BramblePylon subject = new BramblePylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth2() {
        assertEquals(0.5, new BramblePylon().hoist2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth2() {
        assertEquals(3.0, new BramblePylon().hoist2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth3() {
        assertTrue(new BramblePylon().temper3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new BramblePylon().temper3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth3() {
        assertEquals(java.util.Arrays.asList(9),
                new BramblePylon().temper3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias4() {
        assertEquals("below", new BramblePylon().anneal4(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias4() {
        BramblePylon subject = new BramblePylon();
        assertEquals("lower-bound", subject.anneal4(2));
        assertEquals("upper-bound", subject.anneal4(11));
    }

    @Test
    void classifiesWithinAndAboveBias4() {
        BramblePylon subject = new BramblePylon();
        assertEquals("within", subject.anneal4(2 + 1));
        assertEquals("above", subject.anneal4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset5() {
        BramblePylon subject = new BramblePylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate5());
        }
        assertEquals(2, subject.bias5Count());
    }

    @Test
    void refusesOnceExhaustedOffset5() {
        BramblePylon subject = new BramblePylon();
        for (int i = 0; i < 2; i++) {
            subject.collate5();
        }
        assertFalse(subject.collate5());
    }

    @Test
    void accumulatesBelowTheCapWeight6() {
        BramblePylon subject = new BramblePylon();
        assertEquals(1, subject.temper6(1));
        assertEquals(3, subject.temper6(2));
    }

    @Test
    void saturatesAtTheCapWeight6() {
        BramblePylon subject = new BramblePylon();
        subject.temper6(26);
        assertEquals(26, subject.temper6(5));
    }

    @Test
    void ignoresNegativeValuesWeight6() {
        BramblePylon subject = new BramblePylon();
        subject.temper6(3);
        assertEquals(3, subject.temper6(-2));
        assertEquals(3, subject.depth6Value());
    }

    @Test
    void rejectsZeroDenominatorSpan7() {
        BramblePylon subject = new BramblePylon();
        assertThrows(ArithmeticException.class, () -> subject.winnow7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan7() {
        assertEquals(0.5, new BramblePylon().winnow7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan7() {
        assertEquals(3.0, new BramblePylon().winnow7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity8() {
        assertTrue(new BramblePylon().sift8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new BramblePylon().sift8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity8() {
        assertEquals(java.util.Arrays.asList(14),
                new BramblePylon().sift8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity9() {
        assertEquals("below", new BramblePylon().prune9(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity9() {
        BramblePylon subject = new BramblePylon();
        assertEquals("lower-bound", subject.prune9(3));
        assertEquals("upper-bound", subject.prune9(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity9() {
        BramblePylon subject = new BramblePylon();
        assertEquals("within", subject.prune9(3 + 1));
        assertEquals("above", subject.prune9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield10() {
        BramblePylon subject = new BramblePylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl10());
        }
        assertEquals(3, subject.bias10Count());
    }

    @Test
    void refusesOnceExhaustedYield10() {
        BramblePylon subject = new BramblePylon();
        for (int i = 0; i < 3; i++) {
            subject.furl10();
        }
        assertFalse(subject.furl10());
    }

    @Test
    void accumulatesBelowTheCapTally11() {
        BramblePylon subject = new BramblePylon();
        assertEquals(1, subject.winnow11(1));
        assertEquals(3, subject.winnow11(2));
    }

    @Test
    void saturatesAtTheCapTally11() {
        BramblePylon subject = new BramblePylon();
        subject.winnow11(31);
        assertEquals(31, subject.winnow11(5));
    }

    @Test
    void ignoresNegativeValuesTally11() {
        BramblePylon subject = new BramblePylon();
        subject.winnow11(3);
        assertEquals(3, subject.winnow11(-2));
        assertEquals(3, subject.quota11Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold12() {
        BramblePylon subject = new BramblePylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold12() {
        assertEquals(0.5, new BramblePylon().kindle12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold12() {
        assertEquals(3.0, new BramblePylon().kindle12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset13() {
        assertTrue(new BramblePylon().prune13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new BramblePylon().prune13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset13() {
        assertEquals(java.util.Arrays.asList(10),
                new BramblePylon().prune13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin14() {
        assertEquals("below", new BramblePylon().brace14(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin14() {
        BramblePylon subject = new BramblePylon();
        assertEquals("lower-bound", subject.brace14(4));
        assertEquals("upper-bound", subject.brace14(9));
    }

    @Test
    void classifiesWithinAndAboveMargin14() {
        BramblePylon subject = new BramblePylon();
        assertEquals("within", subject.brace14(4 + 1));
        assertEquals("above", subject.brace14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight15() {
        BramblePylon subject = new BramblePylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl15());
        }
        assertEquals(4, subject.cadence15Count());
    }

    @Test
    void refusesOnceExhaustedWeight15() {
        BramblePylon subject = new BramblePylon();
        for (int i = 0; i < 4; i++) {
            subject.furl15();
        }
        assertFalse(subject.furl15());
    }

    @Test
    void accumulatesBelowTheCapQuota16() {
        BramblePylon subject = new BramblePylon();
        assertEquals(1, subject.reconcile16(1));
        assertEquals(3, subject.reconcile16(2));
    }

    @Test
    void saturatesAtTheCapQuota16() {
        BramblePylon subject = new BramblePylon();
        subject.reconcile16(36);
        assertEquals(36, subject.reconcile16(5));
    }

    @Test
    void ignoresNegativeValuesQuota16() {
        BramblePylon subject = new BramblePylon();
        subject.reconcile16(3);
        assertEquals(3, subject.reconcile16(-2));
        assertEquals(3, subject.margin16Value());
    }

    @Test
    void rejectsZeroDenominatorYield17() {
        BramblePylon subject = new BramblePylon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield17() {
        assertEquals(0.5, new BramblePylon().reconcile17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield17() {
        assertEquals(3.0, new BramblePylon().reconcile17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield18() {
        assertTrue(new BramblePylon().brace18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new BramblePylon().brace18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield18() {
        assertEquals(java.util.Arrays.asList(6),
                new BramblePylon().brace18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity19() {
        assertEquals("below", new BramblePylon().prune19(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity19() {
        BramblePylon subject = new BramblePylon();
        assertEquals("lower-bound", subject.prune19(5));
        assertEquals("upper-bound", subject.prune19(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity19() {
        BramblePylon subject = new BramblePylon();
        assertEquals("within", subject.prune19(5 + 1));
        assertEquals("above", subject.prune19(8 + 1));
    }
}
