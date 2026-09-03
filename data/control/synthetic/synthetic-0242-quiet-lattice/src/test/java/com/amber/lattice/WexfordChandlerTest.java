package com.amber.lattice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordChandlerTest {

    @Test
    void returnsEmptyForNullQuota0() {
        assertTrue(new WexfordChandler().gauge0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordChandler().gauge0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota0() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordChandler().gauge0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias1() {
        assertEquals("below", new WexfordChandler().tally1(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias1() {
        WexfordChandler subject = new WexfordChandler();
        assertEquals("lower-bound", subject.tally1(3));
        assertEquals("upper-bound", subject.tally1(8));
    }

    @Test
    void classifiesWithinAndAboveBias1() {
        WexfordChandler subject = new WexfordChandler();
        assertEquals("within", subject.tally1(3 + 1));
        assertEquals("above", subject.tally1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias2() {
        WexfordChandler subject = new WexfordChandler();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper2());
        }
        assertEquals(3, subject.tally2Count());
    }

    @Test
    void refusesOnceExhaustedBias2() {
        WexfordChandler subject = new WexfordChandler();
        for (int i = 0; i < 3; i++) {
            subject.temper2();
        }
        assertFalse(subject.temper2());
    }

    @Test
    void accumulatesBelowTheCapYield3() {
        WexfordChandler subject = new WexfordChandler();
        assertEquals(1, subject.kindle3(1));
        assertEquals(3, subject.kindle3(2));
    }

    @Test
    void saturatesAtTheCapYield3() {
        WexfordChandler subject = new WexfordChandler();
        subject.kindle3(23);
        assertEquals(23, subject.kindle3(5));
    }

    @Test
    void ignoresNegativeValuesYield3() {
        WexfordChandler subject = new WexfordChandler();
        subject.kindle3(3);
        assertEquals(3, subject.kindle3(-2));
        assertEquals(3, subject.quota3Value());
    }

    @Test
    void rejectsZeroDenominatorTally4() {
        WexfordChandler subject = new WexfordChandler();
        assertThrows(ArithmeticException.class, () -> subject.temper4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally4() {
        assertEquals(0.5, new WexfordChandler().temper4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally4() {
        assertEquals(5.0, new WexfordChandler().temper4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset5() {
        assertTrue(new WexfordChandler().winnow5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordChandler().winnow5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset5() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordChandler().winnow5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence6() {
        assertEquals("below", new WexfordChandler().kindle6(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence6() {
        WexfordChandler subject = new WexfordChandler();
        assertEquals("lower-bound", subject.kindle6(4));
        assertEquals("upper-bound", subject.kindle6(7));
    }

    @Test
    void classifiesWithinAndAboveCadence6() {
        WexfordChandler subject = new WexfordChandler();
        assertEquals("within", subject.kindle6(4 + 1));
        assertEquals("above", subject.kindle6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence7() {
        WexfordChandler subject = new WexfordChandler();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile7());
        }
        assertEquals(4, subject.threshold7Count());
    }

    @Test
    void refusesOnceExhaustedCadence7() {
        WexfordChandler subject = new WexfordChandler();
        for (int i = 0; i < 4; i++) {
            subject.reconcile7();
        }
        assertFalse(subject.reconcile7());
    }

    @Test
    void accumulatesBelowTheCapSpan8() {
        WexfordChandler subject = new WexfordChandler();
        assertEquals(1, subject.reconcile8(1));
        assertEquals(3, subject.reconcile8(2));
    }

    @Test
    void saturatesAtTheCapSpan8() {
        WexfordChandler subject = new WexfordChandler();
        subject.reconcile8(28);
        assertEquals(28, subject.reconcile8(5));
    }

    @Test
    void ignoresNegativeValuesSpan8() {
        WexfordChandler subject = new WexfordChandler();
        subject.reconcile8(3);
        assertEquals(3, subject.reconcile8(-2));
        assertEquals(3, subject.capacity8Value());
    }

    @Test
    void rejectsZeroDenominatorRatio9() {
        WexfordChandler subject = new WexfordChandler();
        assertThrows(ArithmeticException.class, () -> subject.anneal9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio9() {
        assertEquals(0.5, new WexfordChandler().anneal9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio9() {
        assertEquals(5.0, new WexfordChandler().anneal9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset10() {
        assertTrue(new WexfordChandler().tally10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordChandler().tally10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset10() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordChandler().tally10(java.util.Arrays.asList(null, 7, null)));
    }
}
