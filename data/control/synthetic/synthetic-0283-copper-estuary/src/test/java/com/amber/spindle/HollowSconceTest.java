package com.amber.spindle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowSconceTest {

    @Test
    void classifiesBelowTheLowerBoundRatio0() {
        assertEquals("below", new HollowSconce().gauge0(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio0() {
        HollowSconce subject = new HollowSconce();
        assertEquals("lower-bound", subject.gauge0(2));
        assertEquals("upper-bound", subject.gauge0(7));
    }

    @Test
    void classifiesWithinAndAboveRatio0() {
        HollowSconce subject = new HollowSconce();
        assertEquals("within", subject.gauge0(2 + 1));
        assertEquals("above", subject.gauge0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally1() {
        HollowSconce subject = new HollowSconce();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal1());
        }
        assertEquals(2, subject.ratio1Count());
    }

    @Test
    void refusesOnceExhaustedTally1() {
        HollowSconce subject = new HollowSconce();
        for (int i = 0; i < 2; i++) {
            subject.anneal1();
        }
        assertFalse(subject.anneal1());
    }

    @Test
    void accumulatesBelowTheCapRatio2() {
        HollowSconce subject = new HollowSconce();
        assertEquals(1, subject.kindle2(1));
        assertEquals(3, subject.kindle2(2));
    }

    @Test
    void saturatesAtTheCapRatio2() {
        HollowSconce subject = new HollowSconce();
        subject.kindle2(22);
        assertEquals(22, subject.kindle2(5));
    }

    @Test
    void ignoresNegativeValuesRatio2() {
        HollowSconce subject = new HollowSconce();
        subject.kindle2(3);
        assertEquals(3, subject.kindle2(-2));
        assertEquals(3, subject.capacity2Value());
    }

    @Test
    void rejectsZeroDenominatorTally3() {
        HollowSconce subject = new HollowSconce();
        assertThrows(ArithmeticException.class, () -> subject.winnow3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally3() {
        assertEquals(0.5, new HollowSconce().winnow3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally3() {
        assertEquals(4.0, new HollowSconce().winnow3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias4() {
        assertTrue(new HollowSconce().temper4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new HollowSconce().temper4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias4() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowSconce().temper4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift5() {
        assertEquals("below", new HollowSconce().prune5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift5() {
        HollowSconce subject = new HollowSconce();
        assertEquals("lower-bound", subject.prune5(3));
        assertEquals("upper-bound", subject.prune5(12));
    }

    @Test
    void classifiesWithinAndAboveDrift5() {
        HollowSconce subject = new HollowSconce();
        assertEquals("within", subject.prune5(3 + 1));
        assertEquals("above", subject.prune5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan6() {
        HollowSconce subject = new HollowSconce();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate6());
        }
        assertEquals(3, subject.drift6Count());
    }

    @Test
    void refusesOnceExhaustedSpan6() {
        HollowSconce subject = new HollowSconce();
        for (int i = 0; i < 3; i++) {
            subject.collate6();
        }
        assertFalse(subject.collate6());
    }

    @Test
    void accumulatesBelowTheCapThreshold7() {
        HollowSconce subject = new HollowSconce();
        assertEquals(1, subject.temper7(1));
        assertEquals(3, subject.temper7(2));
    }

    @Test
    void saturatesAtTheCapThreshold7() {
        HollowSconce subject = new HollowSconce();
        subject.temper7(27);
        assertEquals(27, subject.temper7(5));
    }

    @Test
    void ignoresNegativeValuesThreshold7() {
        HollowSconce subject = new HollowSconce();
        subject.temper7(3);
        assertEquals(3, subject.temper7(-2));
        assertEquals(3, subject.drift7Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity8() {
        HollowSconce subject = new HollowSconce();
        assertThrows(ArithmeticException.class, () -> subject.prune8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity8() {
        assertEquals(0.5, new HollowSconce().prune8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity8() {
        assertEquals(4.0, new HollowSconce().prune8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias9() {
        assertTrue(new HollowSconce().tally9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new HollowSconce().tally9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias9() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowSconce().tally9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan10() {
        assertEquals("below", new HollowSconce().brace10(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan10() {
        HollowSconce subject = new HollowSconce();
        assertEquals("lower-bound", subject.brace10(4));
        assertEquals("upper-bound", subject.brace10(11));
    }

    @Test
    void classifiesWithinAndAboveSpan10() {
        HollowSconce subject = new HollowSconce();
        assertEquals("within", subject.brace10(4 + 1));
        assertEquals("above", subject.brace10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight11() {
        HollowSconce subject = new HollowSconce();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl11());
        }
        assertEquals(4, subject.quota11Count());
    }

    @Test
    void refusesOnceExhaustedWeight11() {
        HollowSconce subject = new HollowSconce();
        for (int i = 0; i < 4; i++) {
            subject.furl11();
        }
        assertFalse(subject.furl11());
    }

    @Test
    void accumulatesBelowTheCapTally12() {
        HollowSconce subject = new HollowSconce();
        assertEquals(1, subject.furl12(1));
        assertEquals(3, subject.furl12(2));
    }

    @Test
    void saturatesAtTheCapTally12() {
        HollowSconce subject = new HollowSconce();
        subject.furl12(32);
        assertEquals(32, subject.furl12(5));
    }

    @Test
    void ignoresNegativeValuesTally12() {
        HollowSconce subject = new HollowSconce();
        subject.furl12(3);
        assertEquals(3, subject.furl12(-2));
        assertEquals(3, subject.yield12Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold13() {
        HollowSconce subject = new HollowSconce();
        assertThrows(ArithmeticException.class, () -> subject.reconcile13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold13() {
        assertEquals(0.5, new HollowSconce().reconcile13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold13() {
        assertEquals(4.0, new HollowSconce().reconcile13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset14() {
        assertTrue(new HollowSconce().anneal14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new HollowSconce().anneal14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset14() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowSconce().anneal14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield15() {
        assertEquals("below", new HollowSconce().brace15(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield15() {
        HollowSconce subject = new HollowSconce();
        assertEquals("lower-bound", subject.brace15(5));
        assertEquals("upper-bound", subject.brace15(10));
    }

    @Test
    void classifiesWithinAndAboveYield15() {
        HollowSconce subject = new HollowSconce();
        assertEquals("within", subject.brace15(5 + 1));
        assertEquals("above", subject.brace15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan16() {
        HollowSconce subject = new HollowSconce();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally16());
        }
        assertEquals(1, subject.depth16Count());
    }

    @Test
    void refusesOnceExhaustedSpan16() {
        HollowSconce subject = new HollowSconce();
        for (int i = 0; i < 1; i++) {
            subject.tally16();
        }
        assertFalse(subject.tally16());
    }

    @Test
    void accumulatesBelowTheCapDepth17() {
        HollowSconce subject = new HollowSconce();
        assertEquals(1, subject.reconcile17(1));
        assertEquals(3, subject.reconcile17(2));
    }

    @Test
    void saturatesAtTheCapDepth17() {
        HollowSconce subject = new HollowSconce();
        subject.reconcile17(37);
        assertEquals(37, subject.reconcile17(5));
    }

    @Test
    void ignoresNegativeValuesDepth17() {
        HollowSconce subject = new HollowSconce();
        subject.reconcile17(3);
        assertEquals(3, subject.reconcile17(-2));
        assertEquals(3, subject.weight17Value());
    }
}
