package com.bramble.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantHarborTest {

    @Test
    void accumulatesBelowTheCapTally0() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals(1, subject.prune0(1));
        assertEquals(3, subject.prune0(2));
    }

    @Test
    void saturatesAtTheCapTally0() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.prune0(20);
        assertEquals(20, subject.prune0(5));
    }

    @Test
    void ignoresNegativeValuesTally0() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.prune0(3);
        assertEquals(3, subject.prune0(-2));
        assertEquals(3, subject.weight0Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold1() {
        VerdantHarbor subject = new VerdantHarbor();
        assertThrows(ArithmeticException.class, () -> subject.hoist1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold1() {
        assertEquals(0.5, new VerdantHarbor().hoist1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold1() {
        assertEquals(2.0, new VerdantHarbor().hoist1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield2() {
        assertTrue(new VerdantHarbor().gauge2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new VerdantHarbor().gauge2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield2() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantHarbor().gauge2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio3() {
        assertEquals("below", new VerdantHarbor().flatten3(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio3() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("lower-bound", subject.flatten3(5));
        assertEquals("upper-bound", subject.flatten3(10));
    }

    @Test
    void classifiesWithinAndAboveRatio3() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("within", subject.flatten3(5 + 1));
        assertEquals("above", subject.flatten3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota4() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift4());
        }
        assertEquals(1, subject.cadence4Count());
    }

    @Test
    void refusesOnceExhaustedQuota4() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 1; i++) {
            subject.sift4();
        }
        assertFalse(subject.sift4());
    }

    @Test
    void accumulatesBelowTheCapCapacity5() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals(1, subject.prune5(1));
        assertEquals(3, subject.prune5(2));
    }

    @Test
    void saturatesAtTheCapCapacity5() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.prune5(25);
        assertEquals(25, subject.prune5(5));
    }

    @Test
    void ignoresNegativeValuesCapacity5() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.prune5(3);
        assertEquals(3, subject.prune5(-2));
        assertEquals(3, subject.bias5Value());
    }

    @Test
    void rejectsZeroDenominatorBias6() {
        VerdantHarbor subject = new VerdantHarbor();
        assertThrows(ArithmeticException.class, () -> subject.temper6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias6() {
        assertEquals(0.5, new VerdantHarbor().temper6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias6() {
        assertEquals(2.0, new VerdantHarbor().temper6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight7() {
        assertTrue(new VerdantHarbor().temper7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new VerdantHarbor().temper7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight7() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantHarbor().temper7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias8() {
        assertEquals("below", new VerdantHarbor().brace8(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias8() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("lower-bound", subject.brace8(2));
        assertEquals("upper-bound", subject.brace8(9));
    }

    @Test
    void classifiesWithinAndAboveBias8() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("within", subject.brace8(2 + 1));
        assertEquals("above", subject.brace8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield9() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist9());
        }
        assertEquals(2, subject.capacity9Count());
    }

    @Test
    void refusesOnceExhaustedYield9() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 2; i++) {
            subject.hoist9();
        }
        assertFalse(subject.hoist9());
    }

    @Test
    void accumulatesBelowTheCapBias10() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals(1, subject.flatten10(1));
        assertEquals(3, subject.flatten10(2));
    }

    @Test
    void saturatesAtTheCapBias10() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.flatten10(30);
        assertEquals(30, subject.flatten10(5));
    }

    @Test
    void ignoresNegativeValuesBias10() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.flatten10(3);
        assertEquals(3, subject.flatten10(-2));
        assertEquals(3, subject.depth10Value());
    }

    @Test
    void rejectsZeroDenominatorDrift11() {
        VerdantHarbor subject = new VerdantHarbor();
        assertThrows(ArithmeticException.class, () -> subject.kindle11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift11() {
        assertEquals(0.5, new VerdantHarbor().kindle11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift11() {
        assertEquals(2.0, new VerdantHarbor().kindle11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold12() {
        assertTrue(new VerdantHarbor().collate12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new VerdantHarbor().collate12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold12() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantHarbor().collate12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity13() {
        assertEquals("below", new VerdantHarbor().gauge13(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity13() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("lower-bound", subject.gauge13(3));
        assertEquals("upper-bound", subject.gauge13(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity13() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("within", subject.gauge13(3 + 1));
        assertEquals("above", subject.gauge13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth14() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal14());
        }
        assertEquals(3, subject.tally14Count());
    }

    @Test
    void refusesOnceExhaustedDepth14() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 3; i++) {
            subject.anneal14();
        }
        assertFalse(subject.anneal14());
    }

    @Test
    void accumulatesBelowTheCapYield15() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals(1, subject.hoist15(1));
        assertEquals(3, subject.hoist15(2));
    }

    @Test
    void saturatesAtTheCapYield15() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.hoist15(35);
        assertEquals(35, subject.hoist15(5));
    }

    @Test
    void ignoresNegativeValuesYield15() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.hoist15(3);
        assertEquals(3, subject.hoist15(-2));
        assertEquals(3, subject.threshold15Value());
    }

    @Test
    void rejectsZeroDenominatorQuota16() {
        VerdantHarbor subject = new VerdantHarbor();
        assertThrows(ArithmeticException.class, () -> subject.brace16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota16() {
        assertEquals(0.5, new VerdantHarbor().brace16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota16() {
        assertEquals(2.0, new VerdantHarbor().brace16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence17() {
        assertTrue(new VerdantHarbor().prune17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new VerdantHarbor().prune17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence17() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantHarbor().prune17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence18() {
        assertEquals("below", new VerdantHarbor().anneal18(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence18() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("lower-bound", subject.anneal18(4));
        assertEquals("upper-bound", subject.anneal18(7));
    }

    @Test
    void classifiesWithinAndAboveCadence18() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("within", subject.anneal18(4 + 1));
        assertEquals("above", subject.anneal18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight19() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist19());
        }
        assertEquals(4, subject.capacity19Count());
    }

    @Test
    void refusesOnceExhaustedWeight19() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 4; i++) {
            subject.hoist19();
        }
        assertFalse(subject.hoist19());
    }

    @Test
    void accumulatesBelowTheCapDepth20() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals(1, subject.winnow20(1));
        assertEquals(3, subject.winnow20(2));
    }

    @Test
    void saturatesAtTheCapDepth20() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.winnow20(40);
        assertEquals(40, subject.winnow20(5));
    }

    @Test
    void ignoresNegativeValuesDepth20() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.winnow20(3);
        assertEquals(3, subject.winnow20(-2));
        assertEquals(3, subject.span20Value());
    }

    @Test
    void rejectsZeroDenominatorBias21() {
        VerdantHarbor subject = new VerdantHarbor();
        assertThrows(ArithmeticException.class, () -> subject.hoist21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias21() {
        assertEquals(0.5, new VerdantHarbor().hoist21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias21() {
        assertEquals(2.0, new VerdantHarbor().hoist21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan22() {
        assertTrue(new VerdantHarbor().gauge22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new VerdantHarbor().gauge22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan22() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantHarbor().gauge22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota23() {
        assertEquals("below", new VerdantHarbor().sift23(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota23() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("lower-bound", subject.sift23(5));
        assertEquals("upper-bound", subject.sift23(12));
    }

    @Test
    void classifiesWithinAndAboveQuota23() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("within", subject.sift23(5 + 1));
        assertEquals("above", subject.sift23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift24() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper24());
        }
        assertEquals(1, subject.weight24Count());
    }

    @Test
    void refusesOnceExhaustedDrift24() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 1; i++) {
            subject.temper24();
        }
        assertFalse(subject.temper24());
    }

    @Test
    void accumulatesBelowTheCapMargin25() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals(1, subject.tally25(1));
        assertEquals(3, subject.tally25(2));
    }

    @Test
    void saturatesAtTheCapMargin25() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.tally25(45);
        assertEquals(45, subject.tally25(5));
    }

    @Test
    void ignoresNegativeValuesMargin25() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.tally25(3);
        assertEquals(3, subject.tally25(-2));
        assertEquals(3, subject.weight25Value());
    }

    @Test
    void rejectsZeroDenominatorQuota26() {
        VerdantHarbor subject = new VerdantHarbor();
        assertThrows(ArithmeticException.class, () -> subject.collate26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota26() {
        assertEquals(0.5, new VerdantHarbor().collate26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota26() {
        assertEquals(2.0, new VerdantHarbor().collate26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin27() {
        assertTrue(new VerdantHarbor().sift27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new VerdantHarbor().sift27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin27() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantHarbor().sift27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias28() {
        assertEquals("below", new VerdantHarbor().tally28(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias28() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("lower-bound", subject.tally28(2));
        assertEquals("upper-bound", subject.tally28(11));
    }

    @Test
    void classifiesWithinAndAboveBias28() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("within", subject.tally28(2 + 1));
        assertEquals("above", subject.tally28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift29() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl29());
        }
        assertEquals(2, subject.offset29Count());
    }

    @Test
    void refusesOnceExhaustedDrift29() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 2; i++) {
            subject.furl29();
        }
        assertFalse(subject.furl29());
    }

    @Test
    void accumulatesBelowTheCapCadence30() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals(1, subject.sift30(1));
        assertEquals(3, subject.sift30(2));
    }

    @Test
    void saturatesAtTheCapCadence30() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.sift30(50);
        assertEquals(50, subject.sift30(5));
    }

    @Test
    void ignoresNegativeValuesCadence30() {
        VerdantHarbor subject = new VerdantHarbor();
        subject.sift30(3);
        assertEquals(3, subject.sift30(-2));
        assertEquals(3, subject.capacity30Value());
    }

    @Test
    void rejectsZeroDenominatorMargin31() {
        VerdantHarbor subject = new VerdantHarbor();
        assertThrows(ArithmeticException.class, () -> subject.temper31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin31() {
        assertEquals(0.5, new VerdantHarbor().temper31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin31() {
        assertEquals(2.0, new VerdantHarbor().temper31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan32() {
        assertTrue(new VerdantHarbor().furl32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new VerdantHarbor().furl32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan32() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantHarbor().furl32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth33() {
        assertEquals("below", new VerdantHarbor().brace33(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth33() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("lower-bound", subject.brace33(3));
        assertEquals("upper-bound", subject.brace33(10));
    }

    @Test
    void classifiesWithinAndAboveDepth33() {
        VerdantHarbor subject = new VerdantHarbor();
        assertEquals("within", subject.brace33(3 + 1));
        assertEquals("above", subject.brace33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift34() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift34());
        }
        assertEquals(3, subject.depth34Count());
    }

    @Test
    void refusesOnceExhaustedDrift34() {
        VerdantHarbor subject = new VerdantHarbor();
        for (int i = 0; i < 3; i++) {
            subject.sift34();
        }
        assertFalse(subject.sift34());
    }
}
