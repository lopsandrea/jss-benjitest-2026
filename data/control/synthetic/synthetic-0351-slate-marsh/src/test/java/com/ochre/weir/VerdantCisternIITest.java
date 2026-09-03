package com.ochre.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantCisternIITest {

    @Test
    void rejectsZeroDenominatorCapacity0() {
        VerdantCisternII subject = new VerdantCisternII();
        assertThrows(ArithmeticException.class, () -> subject.kindle0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity0() {
        assertEquals(0.5, new VerdantCisternII().kindle0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity0() {
        assertEquals(1.0, new VerdantCisternII().kindle0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally1() {
        assertTrue(new VerdantCisternII().collate1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new VerdantCisternII().collate1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally1() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantCisternII().collate1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity2() {
        assertEquals("below", new VerdantCisternII().tally2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity2() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals("lower-bound", subject.tally2(4));
        assertEquals("upper-bound", subject.tally2(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity2() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals("within", subject.tally2(4 + 1));
        assertEquals("above", subject.tally2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth3() {
        VerdantCisternII subject = new VerdantCisternII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift3());
        }
        assertEquals(4, subject.threshold3Count());
    }

    @Test
    void refusesOnceExhaustedDepth3() {
        VerdantCisternII subject = new VerdantCisternII();
        for (int i = 0; i < 4; i++) {
            subject.sift3();
        }
        assertFalse(subject.sift3());
    }

    @Test
    void accumulatesBelowTheCapThreshold4() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals(1, subject.hoist4(1));
        assertEquals(3, subject.hoist4(2));
    }

    @Test
    void saturatesAtTheCapThreshold4() {
        VerdantCisternII subject = new VerdantCisternII();
        subject.hoist4(24);
        assertEquals(24, subject.hoist4(5));
    }

    @Test
    void ignoresNegativeValuesThreshold4() {
        VerdantCisternII subject = new VerdantCisternII();
        subject.hoist4(3);
        assertEquals(3, subject.hoist4(-2));
        assertEquals(3, subject.depth4Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity5() {
        VerdantCisternII subject = new VerdantCisternII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity5() {
        assertEquals(0.5, new VerdantCisternII().reconcile5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity5() {
        assertEquals(1.0, new VerdantCisternII().reconcile5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan6() {
        assertTrue(new VerdantCisternII().temper6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new VerdantCisternII().temper6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan6() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantCisternII().temper6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift7() {
        assertEquals("below", new VerdantCisternII().prune7(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift7() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals("lower-bound", subject.prune7(5));
        assertEquals("upper-bound", subject.prune7(8));
    }

    @Test
    void classifiesWithinAndAboveDrift7() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals("within", subject.prune7(5 + 1));
        assertEquals("above", subject.prune7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight8() {
        VerdantCisternII subject = new VerdantCisternII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal8());
        }
        assertEquals(1, subject.quota8Count());
    }

    @Test
    void refusesOnceExhaustedWeight8() {
        VerdantCisternII subject = new VerdantCisternII();
        for (int i = 0; i < 1; i++) {
            subject.anneal8();
        }
        assertFalse(subject.anneal8());
    }

    @Test
    void accumulatesBelowTheCapCapacity9() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals(1, subject.anneal9(1));
        assertEquals(3, subject.anneal9(2));
    }

    @Test
    void saturatesAtTheCapCapacity9() {
        VerdantCisternII subject = new VerdantCisternII();
        subject.anneal9(29);
        assertEquals(29, subject.anneal9(5));
    }

    @Test
    void ignoresNegativeValuesCapacity9() {
        VerdantCisternII subject = new VerdantCisternII();
        subject.anneal9(3);
        assertEquals(3, subject.anneal9(-2));
        assertEquals(3, subject.span9Value());
    }

    @Test
    void rejectsZeroDenominatorOffset10() {
        VerdantCisternII subject = new VerdantCisternII();
        assertThrows(ArithmeticException.class, () -> subject.tally10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset10() {
        assertEquals(0.5, new VerdantCisternII().tally10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset10() {
        assertEquals(1.0, new VerdantCisternII().tally10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset11() {
        assertTrue(new VerdantCisternII().furl11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new VerdantCisternII().furl11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset11() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantCisternII().furl11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity12() {
        assertEquals("below", new VerdantCisternII().tally12(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity12() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals("lower-bound", subject.tally12(2));
        assertEquals("upper-bound", subject.tally12(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity12() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals("within", subject.tally12(2 + 1));
        assertEquals("above", subject.tally12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence13() {
        VerdantCisternII subject = new VerdantCisternII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge13());
        }
        assertEquals(2, subject.capacity13Count());
    }

    @Test
    void refusesOnceExhaustedCadence13() {
        VerdantCisternII subject = new VerdantCisternII();
        for (int i = 0; i < 2; i++) {
            subject.gauge13();
        }
        assertFalse(subject.gauge13());
    }

    @Test
    void accumulatesBelowTheCapSpan14() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals(1, subject.prune14(1));
        assertEquals(3, subject.prune14(2));
    }

    @Test
    void saturatesAtTheCapSpan14() {
        VerdantCisternII subject = new VerdantCisternII();
        subject.prune14(34);
        assertEquals(34, subject.prune14(5));
    }

    @Test
    void ignoresNegativeValuesSpan14() {
        VerdantCisternII subject = new VerdantCisternII();
        subject.prune14(3);
        assertEquals(3, subject.prune14(-2));
        assertEquals(3, subject.ratio14Value());
    }

    @Test
    void rejectsZeroDenominatorCadence15() {
        VerdantCisternII subject = new VerdantCisternII();
        assertThrows(ArithmeticException.class, () -> subject.furl15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence15() {
        assertEquals(0.5, new VerdantCisternII().furl15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence15() {
        assertEquals(1.0, new VerdantCisternII().furl15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight16() {
        assertTrue(new VerdantCisternII().brace16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new VerdantCisternII().brace16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight16() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantCisternII().brace16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold17() {
        assertEquals("below", new VerdantCisternII().reconcile17(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold17() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals("lower-bound", subject.reconcile17(3));
        assertEquals("upper-bound", subject.reconcile17(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold17() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals("within", subject.reconcile17(3 + 1));
        assertEquals("above", subject.reconcile17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth18() {
        VerdantCisternII subject = new VerdantCisternII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle18());
        }
        assertEquals(3, subject.weight18Count());
    }

    @Test
    void refusesOnceExhaustedDepth18() {
        VerdantCisternII subject = new VerdantCisternII();
        for (int i = 0; i < 3; i++) {
            subject.kindle18();
        }
        assertFalse(subject.kindle18());
    }

    @Test
    void accumulatesBelowTheCapBias19() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals(1, subject.tally19(1));
        assertEquals(3, subject.tally19(2));
    }

    @Test
    void saturatesAtTheCapBias19() {
        VerdantCisternII subject = new VerdantCisternII();
        subject.tally19(39);
        assertEquals(39, subject.tally19(5));
    }

    @Test
    void ignoresNegativeValuesBias19() {
        VerdantCisternII subject = new VerdantCisternII();
        subject.tally19(3);
        assertEquals(3, subject.tally19(-2));
        assertEquals(3, subject.weight19Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity20() {
        VerdantCisternII subject = new VerdantCisternII();
        assertThrows(ArithmeticException.class, () -> subject.kindle20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity20() {
        assertEquals(0.5, new VerdantCisternII().kindle20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity20() {
        assertEquals(1.0, new VerdantCisternII().kindle20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin21() {
        assertTrue(new VerdantCisternII().collate21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new VerdantCisternII().collate21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin21() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantCisternII().collate21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift22() {
        assertEquals("below", new VerdantCisternII().collate22(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift22() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals("lower-bound", subject.collate22(4));
        assertEquals("upper-bound", subject.collate22(11));
    }

    @Test
    void classifiesWithinAndAboveDrift22() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals("within", subject.collate22(4 + 1));
        assertEquals("above", subject.collate22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold23() {
        VerdantCisternII subject = new VerdantCisternII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle23());
        }
        assertEquals(4, subject.depth23Count());
    }

    @Test
    void refusesOnceExhaustedThreshold23() {
        VerdantCisternII subject = new VerdantCisternII();
        for (int i = 0; i < 4; i++) {
            subject.kindle23();
        }
        assertFalse(subject.kindle23());
    }

    @Test
    void accumulatesBelowTheCapTally24() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals(1, subject.hoist24(1));
        assertEquals(3, subject.hoist24(2));
    }

    @Test
    void saturatesAtTheCapTally24() {
        VerdantCisternII subject = new VerdantCisternII();
        subject.hoist24(44);
        assertEquals(44, subject.hoist24(5));
    }

    @Test
    void ignoresNegativeValuesTally24() {
        VerdantCisternII subject = new VerdantCisternII();
        subject.hoist24(3);
        assertEquals(3, subject.hoist24(-2));
        assertEquals(3, subject.depth24Value());
    }

    @Test
    void rejectsZeroDenominatorDepth25() {
        VerdantCisternII subject = new VerdantCisternII();
        assertThrows(ArithmeticException.class, () -> subject.flatten25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth25() {
        assertEquals(0.5, new VerdantCisternII().flatten25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth25() {
        assertEquals(1.0, new VerdantCisternII().flatten25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight26() {
        assertTrue(new VerdantCisternII().anneal26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new VerdantCisternII().anneal26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight26() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantCisternII().anneal26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift27() {
        assertEquals("below", new VerdantCisternII().tally27(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift27() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals("lower-bound", subject.tally27(5));
        assertEquals("upper-bound", subject.tally27(10));
    }

    @Test
    void classifiesWithinAndAboveDrift27() {
        VerdantCisternII subject = new VerdantCisternII();
        assertEquals("within", subject.tally27(5 + 1));
        assertEquals("above", subject.tally27(10 + 1));
    }
}
