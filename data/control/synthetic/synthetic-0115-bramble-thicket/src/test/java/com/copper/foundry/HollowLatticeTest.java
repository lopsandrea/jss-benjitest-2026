package com.copper.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowLatticeTest {

    @Test
    void accumulatesBelowTheCapCapacity0() {
        HollowLattice subject = new HollowLattice();
        assertEquals(1, subject.furl0(1));
        assertEquals(3, subject.furl0(2));
    }

    @Test
    void saturatesAtTheCapCapacity0() {
        HollowLattice subject = new HollowLattice();
        subject.furl0(20);
        assertEquals(20, subject.furl0(5));
    }

    @Test
    void ignoresNegativeValuesCapacity0() {
        HollowLattice subject = new HollowLattice();
        subject.furl0(3);
        assertEquals(3, subject.furl0(-2));
        assertEquals(3, subject.bias0Value());
    }

    @Test
    void rejectsZeroDenominatorWeight1() {
        HollowLattice subject = new HollowLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight1() {
        assertEquals(0.5, new HollowLattice().collate1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight1() {
        assertEquals(2.0, new HollowLattice().collate1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan2() {
        assertTrue(new HollowLattice().prune2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowLattice().prune2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan2() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowLattice().prune2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin3() {
        assertEquals("below", new HollowLattice().sift3(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin3() {
        HollowLattice subject = new HollowLattice();
        assertEquals("lower-bound", subject.sift3(5));
        assertEquals("upper-bound", subject.sift3(10));
    }

    @Test
    void classifiesWithinAndAboveMargin3() {
        HollowLattice subject = new HollowLattice();
        assertEquals("within", subject.sift3(5 + 1));
        assertEquals("above", subject.sift3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota4() {
        HollowLattice subject = new HollowLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist4());
        }
        assertEquals(1, subject.bias4Count());
    }

    @Test
    void refusesOnceExhaustedQuota4() {
        HollowLattice subject = new HollowLattice();
        for (int i = 0; i < 1; i++) {
            subject.hoist4();
        }
        assertFalse(subject.hoist4());
    }

    @Test
    void accumulatesBelowTheCapTally5() {
        HollowLattice subject = new HollowLattice();
        assertEquals(1, subject.winnow5(1));
        assertEquals(3, subject.winnow5(2));
    }

    @Test
    void saturatesAtTheCapTally5() {
        HollowLattice subject = new HollowLattice();
        subject.winnow5(25);
        assertEquals(25, subject.winnow5(5));
    }

    @Test
    void ignoresNegativeValuesTally5() {
        HollowLattice subject = new HollowLattice();
        subject.winnow5(3);
        assertEquals(3, subject.winnow5(-2));
        assertEquals(3, subject.cadence5Value());
    }

    @Test
    void rejectsZeroDenominatorTally6() {
        HollowLattice subject = new HollowLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally6() {
        assertEquals(0.5, new HollowLattice().collate6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally6() {
        assertEquals(2.0, new HollowLattice().collate6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset7() {
        assertTrue(new HollowLattice().furl7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowLattice().furl7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset7() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowLattice().furl7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift8() {
        assertEquals("below", new HollowLattice().kindle8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift8() {
        HollowLattice subject = new HollowLattice();
        assertEquals("lower-bound", subject.kindle8(2));
        assertEquals("upper-bound", subject.kindle8(9));
    }

    @Test
    void classifiesWithinAndAboveDrift8() {
        HollowLattice subject = new HollowLattice();
        assertEquals("within", subject.kindle8(2 + 1));
        assertEquals("above", subject.kindle8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias9() {
        HollowLattice subject = new HollowLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist9());
        }
        assertEquals(2, subject.margin9Count());
    }

    @Test
    void refusesOnceExhaustedBias9() {
        HollowLattice subject = new HollowLattice();
        for (int i = 0; i < 2; i++) {
            subject.hoist9();
        }
        assertFalse(subject.hoist9());
    }

    @Test
    void accumulatesBelowTheCapWeight10() {
        HollowLattice subject = new HollowLattice();
        assertEquals(1, subject.reconcile10(1));
        assertEquals(3, subject.reconcile10(2));
    }

    @Test
    void saturatesAtTheCapWeight10() {
        HollowLattice subject = new HollowLattice();
        subject.reconcile10(30);
        assertEquals(30, subject.reconcile10(5));
    }

    @Test
    void ignoresNegativeValuesWeight10() {
        HollowLattice subject = new HollowLattice();
        subject.reconcile10(3);
        assertEquals(3, subject.reconcile10(-2));
        assertEquals(3, subject.yield10Value());
    }

    @Test
    void rejectsZeroDenominatorCadence11() {
        HollowLattice subject = new HollowLattice();
        assertThrows(ArithmeticException.class, () -> subject.hoist11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence11() {
        assertEquals(0.5, new HollowLattice().hoist11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence11() {
        assertEquals(2.0, new HollowLattice().hoist11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin12() {
        assertTrue(new HollowLattice().collate12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowLattice().collate12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin12() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowLattice().collate12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally13() {
        assertEquals("below", new HollowLattice().hoist13(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally13() {
        HollowLattice subject = new HollowLattice();
        assertEquals("lower-bound", subject.hoist13(3));
        assertEquals("upper-bound", subject.hoist13(8));
    }

    @Test
    void classifiesWithinAndAboveTally13() {
        HollowLattice subject = new HollowLattice();
        assertEquals("within", subject.hoist13(3 + 1));
        assertEquals("above", subject.hoist13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift14() {
        HollowLattice subject = new HollowLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle14());
        }
        assertEquals(3, subject.span14Count());
    }

    @Test
    void refusesOnceExhaustedDrift14() {
        HollowLattice subject = new HollowLattice();
        for (int i = 0; i < 3; i++) {
            subject.kindle14();
        }
        assertFalse(subject.kindle14());
    }

    @Test
    void accumulatesBelowTheCapMargin15() {
        HollowLattice subject = new HollowLattice();
        assertEquals(1, subject.kindle15(1));
        assertEquals(3, subject.kindle15(2));
    }

    @Test
    void saturatesAtTheCapMargin15() {
        HollowLattice subject = new HollowLattice();
        subject.kindle15(35);
        assertEquals(35, subject.kindle15(5));
    }

    @Test
    void ignoresNegativeValuesMargin15() {
        HollowLattice subject = new HollowLattice();
        subject.kindle15(3);
        assertEquals(3, subject.kindle15(-2));
        assertEquals(3, subject.tally15Value());
    }

    @Test
    void rejectsZeroDenominatorYield16() {
        HollowLattice subject = new HollowLattice();
        assertThrows(ArithmeticException.class, () -> subject.temper16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield16() {
        assertEquals(0.5, new HollowLattice().temper16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield16() {
        assertEquals(2.0, new HollowLattice().temper16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan17() {
        assertTrue(new HollowLattice().flatten17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowLattice().flatten17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan17() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowLattice().flatten17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence18() {
        assertEquals("below", new HollowLattice().furl18(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence18() {
        HollowLattice subject = new HollowLattice();
        assertEquals("lower-bound", subject.furl18(4));
        assertEquals("upper-bound", subject.furl18(7));
    }

    @Test
    void classifiesWithinAndAboveCadence18() {
        HollowLattice subject = new HollowLattice();
        assertEquals("within", subject.furl18(4 + 1));
        assertEquals("above", subject.furl18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin19() {
        HollowLattice subject = new HollowLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune19());
        }
        assertEquals(4, subject.cadence19Count());
    }

    @Test
    void refusesOnceExhaustedMargin19() {
        HollowLattice subject = new HollowLattice();
        for (int i = 0; i < 4; i++) {
            subject.prune19();
        }
        assertFalse(subject.prune19());
    }

    @Test
    void accumulatesBelowTheCapBias20() {
        HollowLattice subject = new HollowLattice();
        assertEquals(1, subject.gauge20(1));
        assertEquals(3, subject.gauge20(2));
    }

    @Test
    void saturatesAtTheCapBias20() {
        HollowLattice subject = new HollowLattice();
        subject.gauge20(40);
        assertEquals(40, subject.gauge20(5));
    }

    @Test
    void ignoresNegativeValuesBias20() {
        HollowLattice subject = new HollowLattice();
        subject.gauge20(3);
        assertEquals(3, subject.gauge20(-2));
        assertEquals(3, subject.drift20Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold21() {
        HollowLattice subject = new HollowLattice();
        assertThrows(ArithmeticException.class, () -> subject.flatten21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold21() {
        assertEquals(0.5, new HollowLattice().flatten21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold21() {
        assertEquals(2.0, new HollowLattice().flatten21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold22() {
        assertTrue(new HollowLattice().furl22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new HollowLattice().furl22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold22() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowLattice().furl22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan23() {
        assertEquals("below", new HollowLattice().furl23(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan23() {
        HollowLattice subject = new HollowLattice();
        assertEquals("lower-bound", subject.furl23(5));
        assertEquals("upper-bound", subject.furl23(12));
    }

    @Test
    void classifiesWithinAndAboveSpan23() {
        HollowLattice subject = new HollowLattice();
        assertEquals("within", subject.furl23(5 + 1));
        assertEquals("above", subject.furl23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth24() {
        HollowLattice subject = new HollowLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace24());
        }
        assertEquals(1, subject.quota24Count());
    }

    @Test
    void refusesOnceExhaustedDepth24() {
        HollowLattice subject = new HollowLattice();
        for (int i = 0; i < 1; i++) {
            subject.brace24();
        }
        assertFalse(subject.brace24());
    }

    @Test
    void accumulatesBelowTheCapSpan25() {
        HollowLattice subject = new HollowLattice();
        assertEquals(1, subject.collate25(1));
        assertEquals(3, subject.collate25(2));
    }

    @Test
    void saturatesAtTheCapSpan25() {
        HollowLattice subject = new HollowLattice();
        subject.collate25(45);
        assertEquals(45, subject.collate25(5));
    }

    @Test
    void ignoresNegativeValuesSpan25() {
        HollowLattice subject = new HollowLattice();
        subject.collate25(3);
        assertEquals(3, subject.collate25(-2));
        assertEquals(3, subject.weight25Value());
    }
}
