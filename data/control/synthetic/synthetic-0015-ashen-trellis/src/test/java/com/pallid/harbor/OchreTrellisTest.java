package com.pallid.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreTrellisTest {

    @Test
    void accumulatesBelowTheCapCapacity0() {
        OchreTrellis subject = new OchreTrellis();
        assertEquals(1, subject.anneal0(1));
        assertEquals(3, subject.anneal0(2));
    }

    @Test
    void saturatesAtTheCapCapacity0() {
        OchreTrellis subject = new OchreTrellis();
        subject.anneal0(20);
        assertEquals(20, subject.anneal0(5));
    }

    @Test
    void ignoresNegativeValuesCapacity0() {
        OchreTrellis subject = new OchreTrellis();
        subject.anneal0(3);
        assertEquals(3, subject.anneal0(-2));
        assertEquals(3, subject.weight0Value());
    }

    @Test
    void rejectsZeroDenominatorCadence1() {
        OchreTrellis subject = new OchreTrellis();
        assertThrows(ArithmeticException.class, () -> subject.hoist1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence1() {
        assertEquals(0.5, new OchreTrellis().hoist1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence1() {
        assertEquals(2.0, new OchreTrellis().hoist1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias2() {
        assertTrue(new OchreTrellis().prune2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new OchreTrellis().prune2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias2() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreTrellis().prune2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias3() {
        assertEquals("below", new OchreTrellis().furl3(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias3() {
        OchreTrellis subject = new OchreTrellis();
        assertEquals("lower-bound", subject.furl3(5));
        assertEquals("upper-bound", subject.furl3(10));
    }

    @Test
    void classifiesWithinAndAboveBias3() {
        OchreTrellis subject = new OchreTrellis();
        assertEquals("within", subject.furl3(5 + 1));
        assertEquals("above", subject.furl3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan4() {
        OchreTrellis subject = new OchreTrellis();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge4());
        }
        assertEquals(1, subject.drift4Count());
    }

    @Test
    void refusesOnceExhaustedSpan4() {
        OchreTrellis subject = new OchreTrellis();
        for (int i = 0; i < 1; i++) {
            subject.gauge4();
        }
        assertFalse(subject.gauge4());
    }

    @Test
    void accumulatesBelowTheCapTally5() {
        OchreTrellis subject = new OchreTrellis();
        assertEquals(1, subject.sift5(1));
        assertEquals(3, subject.sift5(2));
    }

    @Test
    void saturatesAtTheCapTally5() {
        OchreTrellis subject = new OchreTrellis();
        subject.sift5(25);
        assertEquals(25, subject.sift5(5));
    }

    @Test
    void ignoresNegativeValuesTally5() {
        OchreTrellis subject = new OchreTrellis();
        subject.sift5(3);
        assertEquals(3, subject.sift5(-2));
        assertEquals(3, subject.drift5Value());
    }

    @Test
    void rejectsZeroDenominatorDrift6() {
        OchreTrellis subject = new OchreTrellis();
        assertThrows(ArithmeticException.class, () -> subject.brace6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift6() {
        assertEquals(0.5, new OchreTrellis().brace6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift6() {
        assertEquals(2.0, new OchreTrellis().brace6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota7() {
        assertTrue(new OchreTrellis().collate7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new OchreTrellis().collate7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota7() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreTrellis().collate7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin8() {
        assertEquals("below", new OchreTrellis().reconcile8(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin8() {
        OchreTrellis subject = new OchreTrellis();
        assertEquals("lower-bound", subject.reconcile8(2));
        assertEquals("upper-bound", subject.reconcile8(9));
    }

    @Test
    void classifiesWithinAndAboveMargin8() {
        OchreTrellis subject = new OchreTrellis();
        assertEquals("within", subject.reconcile8(2 + 1));
        assertEquals("above", subject.reconcile8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield9() {
        OchreTrellis subject = new OchreTrellis();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal9());
        }
        assertEquals(2, subject.span9Count());
    }

    @Test
    void refusesOnceExhaustedYield9() {
        OchreTrellis subject = new OchreTrellis();
        for (int i = 0; i < 2; i++) {
            subject.anneal9();
        }
        assertFalse(subject.anneal9());
    }
}
