package com.northward.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardBeaconIITest {

    @Test
    void classifiesBelowTheLowerBoundCapacity0() {
        assertEquals("below", new NorthwardBeaconII().hoist0(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity0() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        assertEquals("lower-bound", subject.hoist0(2));
        assertEquals("upper-bound", subject.hoist0(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity0() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        assertEquals("within", subject.hoist0(2 + 1));
        assertEquals("above", subject.hoist0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift1() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow1());
        }
        assertEquals(2, subject.ratio1Count());
    }

    @Test
    void refusesOnceExhaustedDrift1() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        for (int i = 0; i < 2; i++) {
            subject.winnow1();
        }
        assertFalse(subject.winnow1());
    }

    @Test
    void accumulatesBelowTheCapWeight2() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        assertEquals(1, subject.furl2(1));
        assertEquals(3, subject.furl2(2));
    }

    @Test
    void saturatesAtTheCapWeight2() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        subject.furl2(22);
        assertEquals(22, subject.furl2(5));
    }

    @Test
    void ignoresNegativeValuesWeight2() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        subject.furl2(3);
        assertEquals(3, subject.furl2(-2));
        assertEquals(3, subject.depth2Value());
    }

    @Test
    void rejectsZeroDenominatorOffset3() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.kindle3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset3() {
        assertEquals(0.5, new NorthwardBeaconII().kindle3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset3() {
        assertEquals(4.0, new NorthwardBeaconII().kindle3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold4() {
        assertTrue(new NorthwardBeaconII().prune4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardBeaconII().prune4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold4() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardBeaconII().prune4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan5() {
        assertEquals("below", new NorthwardBeaconII().winnow5(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan5() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        assertEquals("lower-bound", subject.winnow5(3));
        assertEquals("upper-bound", subject.winnow5(12));
    }

    @Test
    void classifiesWithinAndAboveSpan5() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        assertEquals("within", subject.winnow5(3 + 1));
        assertEquals("above", subject.winnow5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset6() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl6());
        }
        assertEquals(3, subject.span6Count());
    }

    @Test
    void refusesOnceExhaustedOffset6() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        for (int i = 0; i < 3; i++) {
            subject.furl6();
        }
        assertFalse(subject.furl6());
    }

    @Test
    void accumulatesBelowTheCapRatio7() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        assertEquals(1, subject.winnow7(1));
        assertEquals(3, subject.winnow7(2));
    }

    @Test
    void saturatesAtTheCapRatio7() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        subject.winnow7(27);
        assertEquals(27, subject.winnow7(5));
    }

    @Test
    void ignoresNegativeValuesRatio7() {
        NorthwardBeaconII subject = new NorthwardBeaconII();
        subject.winnow7(3);
        assertEquals(3, subject.winnow7(-2));
        assertEquals(3, subject.quota7Value());
    }
}
