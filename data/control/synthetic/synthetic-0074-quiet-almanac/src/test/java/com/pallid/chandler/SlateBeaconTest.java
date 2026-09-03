package com.pallid.chandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateBeaconTest {

    @Test
    void allowsAttemptsUpToTheBudgetYield0() {
        SlateBeacon subject = new SlateBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist0());
        }
        assertEquals(1, subject.threshold0Count());
    }

    @Test
    void refusesOnceExhaustedYield0() {
        SlateBeacon subject = new SlateBeacon();
        for (int i = 0; i < 1; i++) {
            subject.hoist0();
        }
        assertFalse(subject.hoist0());
    }

    @Test
    void accumulatesBelowTheCapWeight1() {
        SlateBeacon subject = new SlateBeacon();
        assertEquals(1, subject.hoist1(1));
        assertEquals(3, subject.hoist1(2));
    }

    @Test
    void saturatesAtTheCapWeight1() {
        SlateBeacon subject = new SlateBeacon();
        subject.hoist1(21);
        assertEquals(21, subject.hoist1(5));
    }

    @Test
    void ignoresNegativeValuesWeight1() {
        SlateBeacon subject = new SlateBeacon();
        subject.hoist1(3);
        assertEquals(3, subject.hoist1(-2));
        assertEquals(3, subject.depth1Value());
    }

    @Test
    void rejectsZeroDenominatorCadence2() {
        SlateBeacon subject = new SlateBeacon();
        assertThrows(ArithmeticException.class, () -> subject.gauge2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence2() {
        assertEquals(0.5, new SlateBeacon().gauge2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence2() {
        assertEquals(3.0, new SlateBeacon().gauge2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth3() {
        assertTrue(new SlateBeacon().furl3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SlateBeacon().furl3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth3() {
        assertEquals(java.util.Arrays.asList(9),
                new SlateBeacon().furl3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin4() {
        assertEquals("below", new SlateBeacon().reconcile4(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin4() {
        SlateBeacon subject = new SlateBeacon();
        assertEquals("lower-bound", subject.reconcile4(2));
        assertEquals("upper-bound", subject.reconcile4(11));
    }

    @Test
    void classifiesWithinAndAboveMargin4() {
        SlateBeacon subject = new SlateBeacon();
        assertEquals("within", subject.reconcile4(2 + 1));
        assertEquals("above", subject.reconcile4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight5() {
        SlateBeacon subject = new SlateBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle5());
        }
        assertEquals(2, subject.bias5Count());
    }

    @Test
    void refusesOnceExhaustedWeight5() {
        SlateBeacon subject = new SlateBeacon();
        for (int i = 0; i < 2; i++) {
            subject.kindle5();
        }
        assertFalse(subject.kindle5());
    }

    @Test
    void accumulatesBelowTheCapBias6() {
        SlateBeacon subject = new SlateBeacon();
        assertEquals(1, subject.tally6(1));
        assertEquals(3, subject.tally6(2));
    }

    @Test
    void saturatesAtTheCapBias6() {
        SlateBeacon subject = new SlateBeacon();
        subject.tally6(26);
        assertEquals(26, subject.tally6(5));
    }

    @Test
    void ignoresNegativeValuesBias6() {
        SlateBeacon subject = new SlateBeacon();
        subject.tally6(3);
        assertEquals(3, subject.tally6(-2));
        assertEquals(3, subject.cadence6Value());
    }
}
