package com.ashen.vellum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietLatticeIIITest {

    @Test
    void classifiesBelowTheLowerBoundDrift0() {
        assertEquals("below", new QuietLatticeIII().brace0(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift0() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("lower-bound", subject.brace0(2));
        assertEquals("upper-bound", subject.brace0(7));
    }

    @Test
    void classifiesWithinAndAboveDrift0() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("within", subject.brace0(2 + 1));
        assertEquals("above", subject.brace0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset1() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow1());
        }
        assertEquals(2, subject.cadence1Count());
    }

    @Test
    void refusesOnceExhaustedOffset1() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 2; i++) {
            subject.winnow1();
        }
        assertFalse(subject.winnow1());
    }

    @Test
    void accumulatesBelowTheCapDrift2() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals(1, subject.reconcile2(1));
        assertEquals(3, subject.reconcile2(2));
    }

    @Test
    void saturatesAtTheCapDrift2() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.reconcile2(22);
        assertEquals(22, subject.reconcile2(5));
    }

    @Test
    void ignoresNegativeValuesDrift2() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.reconcile2(3);
        assertEquals(3, subject.reconcile2(-2));
        assertEquals(3, subject.margin2Value());
    }

    @Test
    void rejectsZeroDenominatorBias3() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertThrows(ArithmeticException.class, () -> subject.furl3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias3() {
        assertEquals(0.5, new QuietLatticeIII().furl3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias3() {
        assertEquals(4.0, new QuietLatticeIII().furl3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift4() {
        assertTrue(new QuietLatticeIII().gauge4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new QuietLatticeIII().gauge4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift4() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietLatticeIII().gauge4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth5() {
        assertEquals("below", new QuietLatticeIII().anneal5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth5() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("lower-bound", subject.anneal5(3));
        assertEquals("upper-bound", subject.anneal5(12));
    }

    @Test
    void classifiesWithinAndAboveDepth5() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("within", subject.anneal5(3 + 1));
        assertEquals("above", subject.anneal5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota6() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow6());
        }
        assertEquals(3, subject.yield6Count());
    }

    @Test
    void refusesOnceExhaustedQuota6() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 3; i++) {
            subject.winnow6();
        }
        assertFalse(subject.winnow6());
    }

    @Test
    void accumulatesBelowTheCapTally7() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals(1, subject.anneal7(1));
        assertEquals(3, subject.anneal7(2));
    }

    @Test
    void saturatesAtTheCapTally7() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.anneal7(27);
        assertEquals(27, subject.anneal7(5));
    }

    @Test
    void ignoresNegativeValuesTally7() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.anneal7(3);
        assertEquals(3, subject.anneal7(-2));
        assertEquals(3, subject.offset7Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold8() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertThrows(ArithmeticException.class, () -> subject.sift8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold8() {
        assertEquals(0.5, new QuietLatticeIII().sift8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold8() {
        assertEquals(4.0, new QuietLatticeIII().sift8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota9() {
        assertTrue(new QuietLatticeIII().collate9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new QuietLatticeIII().collate9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota9() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietLatticeIII().collate9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias10() {
        assertEquals("below", new QuietLatticeIII().tally10(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias10() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("lower-bound", subject.tally10(4));
        assertEquals("upper-bound", subject.tally10(11));
    }

    @Test
    void classifiesWithinAndAboveBias10() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("within", subject.tally10(4 + 1));
        assertEquals("above", subject.tally10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota11() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal11());
        }
        assertEquals(4, subject.tally11Count());
    }

    @Test
    void refusesOnceExhaustedQuota11() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 4; i++) {
            subject.anneal11();
        }
        assertFalse(subject.anneal11());
    }

    @Test
    void accumulatesBelowTheCapCapacity12() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals(1, subject.anneal12(1));
        assertEquals(3, subject.anneal12(2));
    }

    @Test
    void saturatesAtTheCapCapacity12() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.anneal12(32);
        assertEquals(32, subject.anneal12(5));
    }

    @Test
    void ignoresNegativeValuesCapacity12() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.anneal12(3);
        assertEquals(3, subject.anneal12(-2));
        assertEquals(3, subject.span12Value());
    }

    @Test
    void rejectsZeroDenominatorRatio13() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertThrows(ArithmeticException.class, () -> subject.furl13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio13() {
        assertEquals(0.5, new QuietLatticeIII().furl13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio13() {
        assertEquals(4.0, new QuietLatticeIII().furl13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence14() {
        assertTrue(new QuietLatticeIII().sift14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new QuietLatticeIII().sift14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence14() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietLatticeIII().sift14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity15() {
        assertEquals("below", new QuietLatticeIII().kindle15(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity15() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("lower-bound", subject.kindle15(5));
        assertEquals("upper-bound", subject.kindle15(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity15() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("within", subject.kindle15(5 + 1));
        assertEquals("above", subject.kindle15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota16() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace16());
        }
        assertEquals(1, subject.weight16Count());
    }

    @Test
    void refusesOnceExhaustedQuota16() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 1; i++) {
            subject.brace16();
        }
        assertFalse(subject.brace16());
    }

    @Test
    void accumulatesBelowTheCapCapacity17() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals(1, subject.flatten17(1));
        assertEquals(3, subject.flatten17(2));
    }

    @Test
    void saturatesAtTheCapCapacity17() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.flatten17(37);
        assertEquals(37, subject.flatten17(5));
    }

    @Test
    void ignoresNegativeValuesCapacity17() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.flatten17(3);
        assertEquals(3, subject.flatten17(-2));
        assertEquals(3, subject.offset17Value());
    }

    @Test
    void rejectsZeroDenominatorMargin18() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin18() {
        assertEquals(0.5, new QuietLatticeIII().hoist18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin18() {
        assertEquals(4.0, new QuietLatticeIII().hoist18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold19() {
        assertTrue(new QuietLatticeIII().prune19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new QuietLatticeIII().prune19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold19() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietLatticeIII().prune19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence20() {
        assertEquals("below", new QuietLatticeIII().flatten20(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence20() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("lower-bound", subject.flatten20(2));
        assertEquals("upper-bound", subject.flatten20(9));
    }

    @Test
    void classifiesWithinAndAboveCadence20() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("within", subject.flatten20(2 + 1));
        assertEquals("above", subject.flatten20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin21() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile21());
        }
        assertEquals(2, subject.cadence21Count());
    }

    @Test
    void refusesOnceExhaustedMargin21() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile21();
        }
        assertFalse(subject.reconcile21());
    }

    @Test
    void accumulatesBelowTheCapQuota22() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals(1, subject.prune22(1));
        assertEquals(3, subject.prune22(2));
    }

    @Test
    void saturatesAtTheCapQuota22() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.prune22(42);
        assertEquals(42, subject.prune22(5));
    }

    @Test
    void ignoresNegativeValuesQuota22() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.prune22(3);
        assertEquals(3, subject.prune22(-2));
        assertEquals(3, subject.drift22Value());
    }

    @Test
    void rejectsZeroDenominatorRatio23() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertThrows(ArithmeticException.class, () -> subject.sift23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio23() {
        assertEquals(0.5, new QuietLatticeIII().sift23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio23() {
        assertEquals(4.0, new QuietLatticeIII().sift23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth24() {
        assertTrue(new QuietLatticeIII().gauge24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new QuietLatticeIII().gauge24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth24() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietLatticeIII().gauge24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally25() {
        assertEquals("below", new QuietLatticeIII().gauge25(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally25() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("lower-bound", subject.gauge25(3));
        assertEquals("upper-bound", subject.gauge25(8));
    }

    @Test
    void classifiesWithinAndAboveTally25() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("within", subject.gauge25(3 + 1));
        assertEquals("above", subject.gauge25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight26() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl26());
        }
        assertEquals(3, subject.cadence26Count());
    }

    @Test
    void refusesOnceExhaustedWeight26() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 3; i++) {
            subject.furl26();
        }
        assertFalse(subject.furl26());
    }

    @Test
    void accumulatesBelowTheCapBias27() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals(1, subject.collate27(1));
        assertEquals(3, subject.collate27(2));
    }

    @Test
    void saturatesAtTheCapBias27() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.collate27(47);
        assertEquals(47, subject.collate27(5));
    }

    @Test
    void ignoresNegativeValuesBias27() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.collate27(3);
        assertEquals(3, subject.collate27(-2));
        assertEquals(3, subject.tally27Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold28() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertThrows(ArithmeticException.class, () -> subject.tally28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold28() {
        assertEquals(0.5, new QuietLatticeIII().tally28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold28() {
        assertEquals(4.0, new QuietLatticeIII().tally28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally29() {
        assertTrue(new QuietLatticeIII().temper29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new QuietLatticeIII().temper29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally29() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietLatticeIII().temper29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio30() {
        assertEquals("below", new QuietLatticeIII().gauge30(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio30() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("lower-bound", subject.gauge30(4));
        assertEquals("upper-bound", subject.gauge30(7));
    }

    @Test
    void classifiesWithinAndAboveRatio30() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals("within", subject.gauge30(4 + 1));
        assertEquals("above", subject.gauge30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight31() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper31());
        }
        assertEquals(4, subject.capacity31Count());
    }

    @Test
    void refusesOnceExhaustedWeight31() {
        QuietLatticeIII subject = new QuietLatticeIII();
        for (int i = 0; i < 4; i++) {
            subject.temper31();
        }
        assertFalse(subject.temper31());
    }

    @Test
    void accumulatesBelowTheCapCadence32() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertEquals(1, subject.gauge32(1));
        assertEquals(3, subject.gauge32(2));
    }

    @Test
    void saturatesAtTheCapCadence32() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.gauge32(52);
        assertEquals(52, subject.gauge32(5));
    }

    @Test
    void ignoresNegativeValuesCadence32() {
        QuietLatticeIII subject = new QuietLatticeIII();
        subject.gauge32(3);
        assertEquals(3, subject.gauge32(-2));
        assertEquals(3, subject.weight32Value());
    }

    @Test
    void rejectsZeroDenominatorYield33() {
        QuietLatticeIII subject = new QuietLatticeIII();
        assertThrows(ArithmeticException.class, () -> subject.brace33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield33() {
        assertEquals(0.5, new QuietLatticeIII().brace33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield33() {
        assertEquals(4.0, new QuietLatticeIII().brace33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight34() {
        assertTrue(new QuietLatticeIII().collate34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new QuietLatticeIII().collate34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight34() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietLatticeIII().collate34(java.util.Arrays.asList(null, 13, null)));
    }
}
