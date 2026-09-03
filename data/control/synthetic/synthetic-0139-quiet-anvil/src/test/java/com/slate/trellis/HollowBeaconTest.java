package com.slate.trellis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowBeaconTest {

    @Test
    void allowsAttemptsUpToTheBudgetCadence0() {
        HollowBeacon subject = new HollowBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile0());
        }
        assertEquals(1, subject.depth0Count());
    }

    @Test
    void refusesOnceExhaustedCadence0() {
        HollowBeacon subject = new HollowBeacon();
        for (int i = 0; i < 1; i++) {
            subject.reconcile0();
        }
        assertFalse(subject.reconcile0());
    }

    @Test
    void accumulatesBelowTheCapDrift1() {
        HollowBeacon subject = new HollowBeacon();
        assertEquals(1, subject.temper1(1));
        assertEquals(3, subject.temper1(2));
    }

    @Test
    void saturatesAtTheCapDrift1() {
        HollowBeacon subject = new HollowBeacon();
        subject.temper1(21);
        assertEquals(21, subject.temper1(5));
    }

    @Test
    void ignoresNegativeValuesDrift1() {
        HollowBeacon subject = new HollowBeacon();
        subject.temper1(3);
        assertEquals(3, subject.temper1(-2));
        assertEquals(3, subject.ratio1Value());
    }

    @Test
    void rejectsZeroDenominatorSpan2() {
        HollowBeacon subject = new HollowBeacon();
        assertThrows(ArithmeticException.class, () -> subject.sift2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan2() {
        assertEquals(0.5, new HollowBeacon().sift2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan2() {
        assertEquals(3.0, new HollowBeacon().sift2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan3() {
        assertTrue(new HollowBeacon().gauge3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new HollowBeacon().gauge3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan3() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowBeacon().gauge3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity4() {
        assertEquals("below", new HollowBeacon().furl4(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity4() {
        HollowBeacon subject = new HollowBeacon();
        assertEquals("lower-bound", subject.furl4(2));
        assertEquals("upper-bound", subject.furl4(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity4() {
        HollowBeacon subject = new HollowBeacon();
        assertEquals("within", subject.furl4(2 + 1));
        assertEquals("above", subject.furl4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias5() {
        HollowBeacon subject = new HollowBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune5());
        }
        assertEquals(2, subject.ratio5Count());
    }

    @Test
    void refusesOnceExhaustedBias5() {
        HollowBeacon subject = new HollowBeacon();
        for (int i = 0; i < 2; i++) {
            subject.prune5();
        }
        assertFalse(subject.prune5());
    }

    @Test
    void accumulatesBelowTheCapOffset6() {
        HollowBeacon subject = new HollowBeacon();
        assertEquals(1, subject.winnow6(1));
        assertEquals(3, subject.winnow6(2));
    }

    @Test
    void saturatesAtTheCapOffset6() {
        HollowBeacon subject = new HollowBeacon();
        subject.winnow6(26);
        assertEquals(26, subject.winnow6(5));
    }

    @Test
    void ignoresNegativeValuesOffset6() {
        HollowBeacon subject = new HollowBeacon();
        subject.winnow6(3);
        assertEquals(3, subject.winnow6(-2));
        assertEquals(3, subject.ratio6Value());
    }

    @Test
    void rejectsZeroDenominatorDrift7() {
        HollowBeacon subject = new HollowBeacon();
        assertThrows(ArithmeticException.class, () -> subject.temper7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift7() {
        assertEquals(0.5, new HollowBeacon().temper7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift7() {
        assertEquals(3.0, new HollowBeacon().temper7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio8() {
        assertTrue(new HollowBeacon().anneal8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new HollowBeacon().anneal8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio8() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowBeacon().anneal8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset9() {
        assertEquals("below", new HollowBeacon().tally9(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset9() {
        HollowBeacon subject = new HollowBeacon();
        assertEquals("lower-bound", subject.tally9(3));
        assertEquals("upper-bound", subject.tally9(10));
    }

    @Test
    void classifiesWithinAndAboveOffset9() {
        HollowBeacon subject = new HollowBeacon();
        assertEquals("within", subject.tally9(3 + 1));
        assertEquals("above", subject.tally9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight10() {
        HollowBeacon subject = new HollowBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune10());
        }
        assertEquals(3, subject.cadence10Count());
    }

    @Test
    void refusesOnceExhaustedWeight10() {
        HollowBeacon subject = new HollowBeacon();
        for (int i = 0; i < 3; i++) {
            subject.prune10();
        }
        assertFalse(subject.prune10());
    }

    @Test
    void accumulatesBelowTheCapDrift11() {
        HollowBeacon subject = new HollowBeacon();
        assertEquals(1, subject.tally11(1));
        assertEquals(3, subject.tally11(2));
    }

    @Test
    void saturatesAtTheCapDrift11() {
        HollowBeacon subject = new HollowBeacon();
        subject.tally11(31);
        assertEquals(31, subject.tally11(5));
    }

    @Test
    void ignoresNegativeValuesDrift11() {
        HollowBeacon subject = new HollowBeacon();
        subject.tally11(3);
        assertEquals(3, subject.tally11(-2));
        assertEquals(3, subject.cadence11Value());
    }

    @Test
    void rejectsZeroDenominatorTally12() {
        HollowBeacon subject = new HollowBeacon();
        assertThrows(ArithmeticException.class, () -> subject.winnow12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally12() {
        assertEquals(0.5, new HollowBeacon().winnow12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally12() {
        assertEquals(3.0, new HollowBeacon().winnow12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias13() {
        assertTrue(new HollowBeacon().winnow13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new HollowBeacon().winnow13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias13() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowBeacon().winnow13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence14() {
        assertEquals("below", new HollowBeacon().brace14(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence14() {
        HollowBeacon subject = new HollowBeacon();
        assertEquals("lower-bound", subject.brace14(4));
        assertEquals("upper-bound", subject.brace14(9));
    }

    @Test
    void classifiesWithinAndAboveCadence14() {
        HollowBeacon subject = new HollowBeacon();
        assertEquals("within", subject.brace14(4 + 1));
        assertEquals("above", subject.brace14(9 + 1));
    }
}
