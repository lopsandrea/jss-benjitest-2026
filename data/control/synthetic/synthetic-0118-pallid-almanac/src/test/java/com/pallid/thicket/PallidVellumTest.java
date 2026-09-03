package com.pallid.thicket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidVellumTest {

    @Test
    void classifiesBelowTheLowerBoundDepth0() {
        assertEquals("below", new PallidVellum().collate0(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth0() {
        PallidVellum subject = new PallidVellum();
        assertEquals("lower-bound", subject.collate0(2));
        assertEquals("upper-bound", subject.collate0(7));
    }

    @Test
    void classifiesWithinAndAboveDepth0() {
        PallidVellum subject = new PallidVellum();
        assertEquals("within", subject.collate0(2 + 1));
        assertEquals("above", subject.collate0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift1() {
        PallidVellum subject = new PallidVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow1());
        }
        assertEquals(2, subject.cadence1Count());
    }

    @Test
    void refusesOnceExhaustedDrift1() {
        PallidVellum subject = new PallidVellum();
        for (int i = 0; i < 2; i++) {
            subject.winnow1();
        }
        assertFalse(subject.winnow1());
    }

    @Test
    void accumulatesBelowTheCapWeight2() {
        PallidVellum subject = new PallidVellum();
        assertEquals(1, subject.reconcile2(1));
        assertEquals(3, subject.reconcile2(2));
    }

    @Test
    void saturatesAtTheCapWeight2() {
        PallidVellum subject = new PallidVellum();
        subject.reconcile2(22);
        assertEquals(22, subject.reconcile2(5));
    }

    @Test
    void ignoresNegativeValuesWeight2() {
        PallidVellum subject = new PallidVellum();
        subject.reconcile2(3);
        assertEquals(3, subject.reconcile2(-2));
        assertEquals(3, subject.yield2Value());
    }

    @Test
    void rejectsZeroDenominatorDrift3() {
        PallidVellum subject = new PallidVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift3() {
        assertEquals(0.5, new PallidVellum().sift3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift3() {
        assertEquals(4.0, new PallidVellum().sift3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield4() {
        assertTrue(new PallidVellum().prune4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new PallidVellum().prune4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield4() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidVellum().prune4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift5() {
        assertEquals("below", new PallidVellum().hoist5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift5() {
        PallidVellum subject = new PallidVellum();
        assertEquals("lower-bound", subject.hoist5(3));
        assertEquals("upper-bound", subject.hoist5(12));
    }

    @Test
    void classifiesWithinAndAboveDrift5() {
        PallidVellum subject = new PallidVellum();
        assertEquals("within", subject.hoist5(3 + 1));
        assertEquals("above", subject.hoist5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth6() {
        PallidVellum subject = new PallidVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally6());
        }
        assertEquals(3, subject.tally6Count());
    }

    @Test
    void refusesOnceExhaustedDepth6() {
        PallidVellum subject = new PallidVellum();
        for (int i = 0; i < 3; i++) {
            subject.tally6();
        }
        assertFalse(subject.tally6());
    }

    @Test
    void accumulatesBelowTheCapTally7() {
        PallidVellum subject = new PallidVellum();
        assertEquals(1, subject.hoist7(1));
        assertEquals(3, subject.hoist7(2));
    }

    @Test
    void saturatesAtTheCapTally7() {
        PallidVellum subject = new PallidVellum();
        subject.hoist7(27);
        assertEquals(27, subject.hoist7(5));
    }

    @Test
    void ignoresNegativeValuesTally7() {
        PallidVellum subject = new PallidVellum();
        subject.hoist7(3);
        assertEquals(3, subject.hoist7(-2));
        assertEquals(3, subject.quota7Value());
    }

    @Test
    void rejectsZeroDenominatorDepth8() {
        PallidVellum subject = new PallidVellum();
        assertThrows(ArithmeticException.class, () -> subject.prune8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth8() {
        assertEquals(0.5, new PallidVellum().prune8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth8() {
        assertEquals(4.0, new PallidVellum().prune8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight9() {
        assertTrue(new PallidVellum().winnow9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new PallidVellum().winnow9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight9() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidVellum().winnow9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin10() {
        assertEquals("below", new PallidVellum().tally10(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin10() {
        PallidVellum subject = new PallidVellum();
        assertEquals("lower-bound", subject.tally10(4));
        assertEquals("upper-bound", subject.tally10(11));
    }

    @Test
    void classifiesWithinAndAboveMargin10() {
        PallidVellum subject = new PallidVellum();
        assertEquals("within", subject.tally10(4 + 1));
        assertEquals("above", subject.tally10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence11() {
        PallidVellum subject = new PallidVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow11());
        }
        assertEquals(4, subject.tally11Count());
    }

    @Test
    void refusesOnceExhaustedCadence11() {
        PallidVellum subject = new PallidVellum();
        for (int i = 0; i < 4; i++) {
            subject.winnow11();
        }
        assertFalse(subject.winnow11());
    }

    @Test
    void accumulatesBelowTheCapThreshold12() {
        PallidVellum subject = new PallidVellum();
        assertEquals(1, subject.temper12(1));
        assertEquals(3, subject.temper12(2));
    }

    @Test
    void saturatesAtTheCapThreshold12() {
        PallidVellum subject = new PallidVellum();
        subject.temper12(32);
        assertEquals(32, subject.temper12(5));
    }

    @Test
    void ignoresNegativeValuesThreshold12() {
        PallidVellum subject = new PallidVellum();
        subject.temper12(3);
        assertEquals(3, subject.temper12(-2));
        assertEquals(3, subject.quota12Value());
    }

    @Test
    void rejectsZeroDenominatorOffset13() {
        PallidVellum subject = new PallidVellum();
        assertThrows(ArithmeticException.class, () -> subject.gauge13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset13() {
        assertEquals(0.5, new PallidVellum().gauge13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset13() {
        assertEquals(4.0, new PallidVellum().gauge13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence14() {
        assertTrue(new PallidVellum().prune14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new PallidVellum().prune14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence14() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidVellum().prune14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence15() {
        assertEquals("below", new PallidVellum().kindle15(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence15() {
        PallidVellum subject = new PallidVellum();
        assertEquals("lower-bound", subject.kindle15(5));
        assertEquals("upper-bound", subject.kindle15(10));
    }

    @Test
    void classifiesWithinAndAboveCadence15() {
        PallidVellum subject = new PallidVellum();
        assertEquals("within", subject.kindle15(5 + 1));
        assertEquals("above", subject.kindle15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan16() {
        PallidVellum subject = new PallidVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper16());
        }
        assertEquals(1, subject.depth16Count());
    }

    @Test
    void refusesOnceExhaustedSpan16() {
        PallidVellum subject = new PallidVellum();
        for (int i = 0; i < 1; i++) {
            subject.temper16();
        }
        assertFalse(subject.temper16());
    }

    @Test
    void accumulatesBelowTheCapOffset17() {
        PallidVellum subject = new PallidVellum();
        assertEquals(1, subject.tally17(1));
        assertEquals(3, subject.tally17(2));
    }

    @Test
    void saturatesAtTheCapOffset17() {
        PallidVellum subject = new PallidVellum();
        subject.tally17(37);
        assertEquals(37, subject.tally17(5));
    }

    @Test
    void ignoresNegativeValuesOffset17() {
        PallidVellum subject = new PallidVellum();
        subject.tally17(3);
        assertEquals(3, subject.tally17(-2));
        assertEquals(3, subject.weight17Value());
    }

    @Test
    void rejectsZeroDenominatorWeight18() {
        PallidVellum subject = new PallidVellum();
        assertThrows(ArithmeticException.class, () -> subject.tally18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight18() {
        assertEquals(0.5, new PallidVellum().tally18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight18() {
        assertEquals(4.0, new PallidVellum().tally18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias19() {
        assertTrue(new PallidVellum().prune19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new PallidVellum().prune19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias19() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidVellum().prune19(java.util.Arrays.asList(null, 7, null)));
    }
}
