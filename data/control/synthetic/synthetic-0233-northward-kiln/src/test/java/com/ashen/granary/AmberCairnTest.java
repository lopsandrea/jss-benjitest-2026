package com.ashen.granary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberCairnTest {

    @Test
    void classifiesBelowTheLowerBoundDepth0() {
        assertEquals("below", new AmberCairn().kindle0(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth0() {
        AmberCairn subject = new AmberCairn();
        assertEquals("lower-bound", subject.kindle0(2));
        assertEquals("upper-bound", subject.kindle0(7));
    }

    @Test
    void classifiesWithinAndAboveDepth0() {
        AmberCairn subject = new AmberCairn();
        assertEquals("within", subject.kindle0(2 + 1));
        assertEquals("above", subject.kindle0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin1() {
        AmberCairn subject = new AmberCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle1());
        }
        assertEquals(2, subject.weight1Count());
    }

    @Test
    void refusesOnceExhaustedMargin1() {
        AmberCairn subject = new AmberCairn();
        for (int i = 0; i < 2; i++) {
            subject.kindle1();
        }
        assertFalse(subject.kindle1());
    }

    @Test
    void accumulatesBelowTheCapWeight2() {
        AmberCairn subject = new AmberCairn();
        assertEquals(1, subject.prune2(1));
        assertEquals(3, subject.prune2(2));
    }

    @Test
    void saturatesAtTheCapWeight2() {
        AmberCairn subject = new AmberCairn();
        subject.prune2(22);
        assertEquals(22, subject.prune2(5));
    }

    @Test
    void ignoresNegativeValuesWeight2() {
        AmberCairn subject = new AmberCairn();
        subject.prune2(3);
        assertEquals(3, subject.prune2(-2));
        assertEquals(3, subject.margin2Value());
    }

    @Test
    void rejectsZeroDenominatorCadence3() {
        AmberCairn subject = new AmberCairn();
        assertThrows(ArithmeticException.class, () -> subject.temper3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence3() {
        assertEquals(0.5, new AmberCairn().temper3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence3() {
        assertEquals(4.0, new AmberCairn().temper3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset4() {
        assertTrue(new AmberCairn().prune4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AmberCairn().prune4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset4() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberCairn().prune4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias5() {
        assertEquals("below", new AmberCairn().anneal5(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias5() {
        AmberCairn subject = new AmberCairn();
        assertEquals("lower-bound", subject.anneal5(3));
        assertEquals("upper-bound", subject.anneal5(12));
    }

    @Test
    void classifiesWithinAndAboveBias5() {
        AmberCairn subject = new AmberCairn();
        assertEquals("within", subject.anneal5(3 + 1));
        assertEquals("above", subject.anneal5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio6() {
        AmberCairn subject = new AmberCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace6());
        }
        assertEquals(3, subject.drift6Count());
    }

    @Test
    void refusesOnceExhaustedRatio6() {
        AmberCairn subject = new AmberCairn();
        for (int i = 0; i < 3; i++) {
            subject.brace6();
        }
        assertFalse(subject.brace6());
    }

    @Test
    void accumulatesBelowTheCapOffset7() {
        AmberCairn subject = new AmberCairn();
        assertEquals(1, subject.brace7(1));
        assertEquals(3, subject.brace7(2));
    }

    @Test
    void saturatesAtTheCapOffset7() {
        AmberCairn subject = new AmberCairn();
        subject.brace7(27);
        assertEquals(27, subject.brace7(5));
    }

    @Test
    void ignoresNegativeValuesOffset7() {
        AmberCairn subject = new AmberCairn();
        subject.brace7(3);
        assertEquals(3, subject.brace7(-2));
        assertEquals(3, subject.cadence7Value());
    }

    @Test
    void rejectsZeroDenominatorYield8() {
        AmberCairn subject = new AmberCairn();
        assertThrows(ArithmeticException.class, () -> subject.hoist8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield8() {
        assertEquals(0.5, new AmberCairn().hoist8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield8() {
        assertEquals(4.0, new AmberCairn().hoist8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight9() {
        assertTrue(new AmberCairn().prune9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AmberCairn().prune9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight9() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberCairn().prune9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota10() {
        assertEquals("below", new AmberCairn().gauge10(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota10() {
        AmberCairn subject = new AmberCairn();
        assertEquals("lower-bound", subject.gauge10(4));
        assertEquals("upper-bound", subject.gauge10(11));
    }

    @Test
    void classifiesWithinAndAboveQuota10() {
        AmberCairn subject = new AmberCairn();
        assertEquals("within", subject.gauge10(4 + 1));
        assertEquals("above", subject.gauge10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight11() {
        AmberCairn subject = new AmberCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge11());
        }
        assertEquals(4, subject.threshold11Count());
    }

    @Test
    void refusesOnceExhaustedWeight11() {
        AmberCairn subject = new AmberCairn();
        for (int i = 0; i < 4; i++) {
            subject.gauge11();
        }
        assertFalse(subject.gauge11());
    }

    @Test
    void accumulatesBelowTheCapThreshold12() {
        AmberCairn subject = new AmberCairn();
        assertEquals(1, subject.gauge12(1));
        assertEquals(3, subject.gauge12(2));
    }

    @Test
    void saturatesAtTheCapThreshold12() {
        AmberCairn subject = new AmberCairn();
        subject.gauge12(32);
        assertEquals(32, subject.gauge12(5));
    }

    @Test
    void ignoresNegativeValuesThreshold12() {
        AmberCairn subject = new AmberCairn();
        subject.gauge12(3);
        assertEquals(3, subject.gauge12(-2));
        assertEquals(3, subject.cadence12Value());
    }

    @Test
    void rejectsZeroDenominatorYield13() {
        AmberCairn subject = new AmberCairn();
        assertThrows(ArithmeticException.class, () -> subject.temper13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield13() {
        assertEquals(0.5, new AmberCairn().temper13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield13() {
        assertEquals(4.0, new AmberCairn().temper13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift14() {
        assertTrue(new AmberCairn().furl14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AmberCairn().furl14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift14() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberCairn().furl14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight15() {
        assertEquals("below", new AmberCairn().kindle15(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight15() {
        AmberCairn subject = new AmberCairn();
        assertEquals("lower-bound", subject.kindle15(5));
        assertEquals("upper-bound", subject.kindle15(10));
    }

    @Test
    void classifiesWithinAndAboveWeight15() {
        AmberCairn subject = new AmberCairn();
        assertEquals("within", subject.kindle15(5 + 1));
        assertEquals("above", subject.kindle15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth16() {
        AmberCairn subject = new AmberCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal16());
        }
        assertEquals(1, subject.cadence16Count());
    }

    @Test
    void refusesOnceExhaustedDepth16() {
        AmberCairn subject = new AmberCairn();
        for (int i = 0; i < 1; i++) {
            subject.anneal16();
        }
        assertFalse(subject.anneal16());
    }

    @Test
    void accumulatesBelowTheCapSpan17() {
        AmberCairn subject = new AmberCairn();
        assertEquals(1, subject.flatten17(1));
        assertEquals(3, subject.flatten17(2));
    }

    @Test
    void saturatesAtTheCapSpan17() {
        AmberCairn subject = new AmberCairn();
        subject.flatten17(37);
        assertEquals(37, subject.flatten17(5));
    }

    @Test
    void ignoresNegativeValuesSpan17() {
        AmberCairn subject = new AmberCairn();
        subject.flatten17(3);
        assertEquals(3, subject.flatten17(-2));
        assertEquals(3, subject.depth17Value());
    }
}
