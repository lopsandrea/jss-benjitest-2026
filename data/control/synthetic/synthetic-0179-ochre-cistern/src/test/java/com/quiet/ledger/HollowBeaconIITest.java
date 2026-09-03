package com.quiet.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowBeaconIITest {

    @Test
    void allowsAttemptsUpToTheBudgetTally0() {
        HollowBeaconII subject = new HollowBeaconII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile0());
        }
        assertEquals(1, subject.offset0Count());
    }

    @Test
    void refusesOnceExhaustedTally0() {
        HollowBeaconII subject = new HollowBeaconII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile0();
        }
        assertFalse(subject.reconcile0());
    }

    @Test
    void accumulatesBelowTheCapMargin1() {
        HollowBeaconII subject = new HollowBeaconII();
        assertEquals(1, subject.hoist1(1));
        assertEquals(3, subject.hoist1(2));
    }

    @Test
    void saturatesAtTheCapMargin1() {
        HollowBeaconII subject = new HollowBeaconII();
        subject.hoist1(21);
        assertEquals(21, subject.hoist1(5));
    }

    @Test
    void ignoresNegativeValuesMargin1() {
        HollowBeaconII subject = new HollowBeaconII();
        subject.hoist1(3);
        assertEquals(3, subject.hoist1(-2));
        assertEquals(3, subject.capacity1Value());
    }

    @Test
    void rejectsZeroDenominatorBias2() {
        HollowBeaconII subject = new HollowBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.furl2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias2() {
        assertEquals(0.5, new HollowBeaconII().furl2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias2() {
        assertEquals(3.0, new HollowBeaconII().furl2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan3() {
        assertTrue(new HollowBeaconII().kindle3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new HollowBeaconII().kindle3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan3() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowBeaconII().kindle3(java.util.Arrays.asList(null, 9, null)));
    }
}
