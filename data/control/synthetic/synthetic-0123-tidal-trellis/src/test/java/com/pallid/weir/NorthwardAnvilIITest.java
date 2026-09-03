package com.pallid.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardAnvilIITest {

    @Test
    void classifiesBelowTheLowerBoundCapacity0() {
        assertEquals("below", new NorthwardAnvilII().kindle0(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity0() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals("lower-bound", subject.kindle0(2));
        assertEquals("upper-bound", subject.kindle0(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity0() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals("within", subject.kindle0(2 + 1));
        assertEquals("above", subject.kindle0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence1() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow1());
        }
        assertEquals(2, subject.quota1Count());
    }

    @Test
    void refusesOnceExhaustedCadence1() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.winnow1();
        }
        assertFalse(subject.winnow1());
    }

    @Test
    void accumulatesBelowTheCapYield2() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals(1, subject.flatten2(1));
        assertEquals(3, subject.flatten2(2));
    }

    @Test
    void saturatesAtTheCapYield2() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        subject.flatten2(22);
        assertEquals(22, subject.flatten2(5));
    }

    @Test
    void ignoresNegativeValuesYield2() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        subject.flatten2(3);
        assertEquals(3, subject.flatten2(-2));
        assertEquals(3, subject.quota2Value());
    }

    @Test
    void rejectsZeroDenominatorOffset3() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset3() {
        assertEquals(0.5, new NorthwardAnvilII().reconcile3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset3() {
        assertEquals(4.0, new NorthwardAnvilII().reconcile3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift4() {
        assertTrue(new NorthwardAnvilII().temper4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardAnvilII().temper4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift4() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardAnvilII().temper4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan5() {
        assertEquals("below", new NorthwardAnvilII().kindle5(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan5() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals("lower-bound", subject.kindle5(3));
        assertEquals("upper-bound", subject.kindle5(12));
    }

    @Test
    void classifiesWithinAndAboveSpan5() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals("within", subject.kindle5(3 + 1));
        assertEquals("above", subject.kindle5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset6() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten6());
        }
        assertEquals(3, subject.cadence6Count());
    }

    @Test
    void refusesOnceExhaustedOffset6() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.flatten6();
        }
        assertFalse(subject.flatten6());
    }

    @Test
    void accumulatesBelowTheCapTally7() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals(1, subject.anneal7(1));
        assertEquals(3, subject.anneal7(2));
    }

    @Test
    void saturatesAtTheCapTally7() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        subject.anneal7(27);
        assertEquals(27, subject.anneal7(5));
    }

    @Test
    void ignoresNegativeValuesTally7() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        subject.anneal7(3);
        assertEquals(3, subject.anneal7(-2));
        assertEquals(3, subject.span7Value());
    }

    @Test
    void rejectsZeroDenominatorWeight8() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.brace8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight8() {
        assertEquals(0.5, new NorthwardAnvilII().brace8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight8() {
        assertEquals(4.0, new NorthwardAnvilII().brace8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally9() {
        assertTrue(new NorthwardAnvilII().furl9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new NorthwardAnvilII().furl9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally9() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardAnvilII().furl9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin10() {
        assertEquals("below", new NorthwardAnvilII().sift10(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin10() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals("lower-bound", subject.sift10(4));
        assertEquals("upper-bound", subject.sift10(11));
    }

    @Test
    void classifiesWithinAndAboveMargin10() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals("within", subject.sift10(4 + 1));
        assertEquals("above", subject.sift10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth11() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile11());
        }
        assertEquals(4, subject.span11Count());
    }

    @Test
    void refusesOnceExhaustedDepth11() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile11();
        }
        assertFalse(subject.reconcile11());
    }

    @Test
    void accumulatesBelowTheCapRatio12() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals(1, subject.anneal12(1));
        assertEquals(3, subject.anneal12(2));
    }

    @Test
    void saturatesAtTheCapRatio12() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        subject.anneal12(32);
        assertEquals(32, subject.anneal12(5));
    }

    @Test
    void ignoresNegativeValuesRatio12() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        subject.anneal12(3);
        assertEquals(3, subject.anneal12(-2));
        assertEquals(3, subject.cadence12Value());
    }

    @Test
    void rejectsZeroDenominatorCadence13() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence13() {
        assertEquals(0.5, new NorthwardAnvilII().reconcile13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence13() {
        assertEquals(4.0, new NorthwardAnvilII().reconcile13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias14() {
        assertTrue(new NorthwardAnvilII().anneal14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new NorthwardAnvilII().anneal14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias14() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardAnvilII().anneal14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence15() {
        assertEquals("below", new NorthwardAnvilII().reconcile15(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence15() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals("lower-bound", subject.reconcile15(5));
        assertEquals("upper-bound", subject.reconcile15(10));
    }

    @Test
    void classifiesWithinAndAboveCadence15() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals("within", subject.reconcile15(5 + 1));
        assertEquals("above", subject.reconcile15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield16() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten16());
        }
        assertEquals(1, subject.margin16Count());
    }

    @Test
    void refusesOnceExhaustedYield16() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.flatten16();
        }
        assertFalse(subject.flatten16());
    }

    @Test
    void accumulatesBelowTheCapTally17() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals(1, subject.reconcile17(1));
        assertEquals(3, subject.reconcile17(2));
    }

    @Test
    void saturatesAtTheCapTally17() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        subject.reconcile17(37);
        assertEquals(37, subject.reconcile17(5));
    }

    @Test
    void ignoresNegativeValuesTally17() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        subject.reconcile17(3);
        assertEquals(3, subject.reconcile17(-2));
        assertEquals(3, subject.cadence17Value());
    }

    @Test
    void rejectsZeroDenominatorMargin18() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.prune18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin18() {
        assertEquals(0.5, new NorthwardAnvilII().prune18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin18() {
        assertEquals(4.0, new NorthwardAnvilII().prune18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota19() {
        assertTrue(new NorthwardAnvilII().tally19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new NorthwardAnvilII().tally19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota19() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardAnvilII().tally19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold20() {
        assertEquals("below", new NorthwardAnvilII().gauge20(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold20() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals("lower-bound", subject.gauge20(2));
        assertEquals("upper-bound", subject.gauge20(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold20() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals("within", subject.gauge20(2 + 1));
        assertEquals("above", subject.gauge20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth21() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge21());
        }
        assertEquals(2, subject.weight21Count());
    }

    @Test
    void refusesOnceExhaustedDepth21() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.gauge21();
        }
        assertFalse(subject.gauge21());
    }

    @Test
    void accumulatesBelowTheCapSpan22() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        assertEquals(1, subject.hoist22(1));
        assertEquals(3, subject.hoist22(2));
    }

    @Test
    void saturatesAtTheCapSpan22() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        subject.hoist22(42);
        assertEquals(42, subject.hoist22(5));
    }

    @Test
    void ignoresNegativeValuesSpan22() {
        NorthwardAnvilII subject = new NorthwardAnvilII();
        subject.hoist22(3);
        assertEquals(3, subject.hoist22(-2));
        assertEquals(3, subject.drift22Value());
    }
}
