package com.tidal.meridian;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordWeirTest {

    @Test
    void rejectsZeroDenominatorWeight0() {
        WexfordWeir subject = new WexfordWeir();
        assertThrows(ArithmeticException.class, () -> subject.gauge0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight0() {
        assertEquals(0.5, new WexfordWeir().gauge0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight0() {
        assertEquals(1.0, new WexfordWeir().gauge0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield1() {
        assertTrue(new WexfordWeir().flatten1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new WexfordWeir().flatten1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield1() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordWeir().flatten1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence2() {
        assertEquals("below", new WexfordWeir().collate2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence2() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("lower-bound", subject.collate2(4));
        assertEquals("upper-bound", subject.collate2(9));
    }

    @Test
    void classifiesWithinAndAboveCadence2() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("within", subject.collate2(4 + 1));
        assertEquals("above", subject.collate2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold3() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift3());
        }
        assertEquals(4, subject.cadence3Count());
    }

    @Test
    void refusesOnceExhaustedThreshold3() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 4; i++) {
            subject.sift3();
        }
        assertFalse(subject.sift3());
    }

    @Test
    void accumulatesBelowTheCapWeight4() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals(1, subject.collate4(1));
        assertEquals(3, subject.collate4(2));
    }

    @Test
    void saturatesAtTheCapWeight4() {
        WexfordWeir subject = new WexfordWeir();
        subject.collate4(24);
        assertEquals(24, subject.collate4(5));
    }

    @Test
    void ignoresNegativeValuesWeight4() {
        WexfordWeir subject = new WexfordWeir();
        subject.collate4(3);
        assertEquals(3, subject.collate4(-2));
        assertEquals(3, subject.yield4Value());
    }

    @Test
    void rejectsZeroDenominatorMargin5() {
        WexfordWeir subject = new WexfordWeir();
        assertThrows(ArithmeticException.class, () -> subject.prune5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin5() {
        assertEquals(0.5, new WexfordWeir().prune5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin5() {
        assertEquals(1.0, new WexfordWeir().prune5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence6() {
        assertTrue(new WexfordWeir().winnow6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new WexfordWeir().winnow6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence6() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordWeir().winnow6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight7() {
        assertEquals("below", new WexfordWeir().kindle7(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight7() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("lower-bound", subject.kindle7(5));
        assertEquals("upper-bound", subject.kindle7(8));
    }

    @Test
    void classifiesWithinAndAboveWeight7() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("within", subject.kindle7(5 + 1));
        assertEquals("above", subject.kindle7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight8() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten8());
        }
        assertEquals(1, subject.yield8Count());
    }

    @Test
    void refusesOnceExhaustedWeight8() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 1; i++) {
            subject.flatten8();
        }
        assertFalse(subject.flatten8());
    }

    @Test
    void accumulatesBelowTheCapQuota9() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals(1, subject.collate9(1));
        assertEquals(3, subject.collate9(2));
    }

    @Test
    void saturatesAtTheCapQuota9() {
        WexfordWeir subject = new WexfordWeir();
        subject.collate9(29);
        assertEquals(29, subject.collate9(5));
    }

    @Test
    void ignoresNegativeValuesQuota9() {
        WexfordWeir subject = new WexfordWeir();
        subject.collate9(3);
        assertEquals(3, subject.collate9(-2));
        assertEquals(3, subject.bias9Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold10() {
        WexfordWeir subject = new WexfordWeir();
        assertThrows(ArithmeticException.class, () -> subject.collate10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold10() {
        assertEquals(0.5, new WexfordWeir().collate10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold10() {
        assertEquals(1.0, new WexfordWeir().collate10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity11() {
        assertTrue(new WexfordWeir().furl11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new WexfordWeir().furl11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity11() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordWeir().furl11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio12() {
        assertEquals("below", new WexfordWeir().winnow12(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio12() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("lower-bound", subject.winnow12(2));
        assertEquals("upper-bound", subject.winnow12(7));
    }

    @Test
    void classifiesWithinAndAboveRatio12() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("within", subject.winnow12(2 + 1));
        assertEquals("above", subject.winnow12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota13() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle13());
        }
        assertEquals(2, subject.cadence13Count());
    }

    @Test
    void refusesOnceExhaustedQuota13() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 2; i++) {
            subject.kindle13();
        }
        assertFalse(subject.kindle13());
    }

    @Test
    void accumulatesBelowTheCapYield14() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals(1, subject.brace14(1));
        assertEquals(3, subject.brace14(2));
    }

    @Test
    void saturatesAtTheCapYield14() {
        WexfordWeir subject = new WexfordWeir();
        subject.brace14(34);
        assertEquals(34, subject.brace14(5));
    }

    @Test
    void ignoresNegativeValuesYield14() {
        WexfordWeir subject = new WexfordWeir();
        subject.brace14(3);
        assertEquals(3, subject.brace14(-2));
        assertEquals(3, subject.offset14Value());
    }

    @Test
    void rejectsZeroDenominatorRatio15() {
        WexfordWeir subject = new WexfordWeir();
        assertThrows(ArithmeticException.class, () -> subject.kindle15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio15() {
        assertEquals(0.5, new WexfordWeir().kindle15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio15() {
        assertEquals(1.0, new WexfordWeir().kindle15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally16() {
        assertTrue(new WexfordWeir().tally16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new WexfordWeir().tally16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally16() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordWeir().tally16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight17() {
        assertEquals("below", new WexfordWeir().brace17(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight17() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("lower-bound", subject.brace17(3));
        assertEquals("upper-bound", subject.brace17(12));
    }

    @Test
    void classifiesWithinAndAboveWeight17() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("within", subject.brace17(3 + 1));
        assertEquals("above", subject.brace17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin18() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle18());
        }
        assertEquals(3, subject.quota18Count());
    }

    @Test
    void refusesOnceExhaustedMargin18() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 3; i++) {
            subject.kindle18();
        }
        assertFalse(subject.kindle18());
    }

    @Test
    void accumulatesBelowTheCapWeight19() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals(1, subject.winnow19(1));
        assertEquals(3, subject.winnow19(2));
    }

    @Test
    void saturatesAtTheCapWeight19() {
        WexfordWeir subject = new WexfordWeir();
        subject.winnow19(39);
        assertEquals(39, subject.winnow19(5));
    }

    @Test
    void ignoresNegativeValuesWeight19() {
        WexfordWeir subject = new WexfordWeir();
        subject.winnow19(3);
        assertEquals(3, subject.winnow19(-2));
        assertEquals(3, subject.drift19Value());
    }

    @Test
    void rejectsZeroDenominatorRatio20() {
        WexfordWeir subject = new WexfordWeir();
        assertThrows(ArithmeticException.class, () -> subject.winnow20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio20() {
        assertEquals(0.5, new WexfordWeir().winnow20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio20() {
        assertEquals(1.0, new WexfordWeir().winnow20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan21() {
        assertTrue(new WexfordWeir().collate21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new WexfordWeir().collate21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan21() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordWeir().collate21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence22() {
        assertEquals("below", new WexfordWeir().hoist22(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence22() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("lower-bound", subject.hoist22(4));
        assertEquals("upper-bound", subject.hoist22(11));
    }

    @Test
    void classifiesWithinAndAboveCadence22() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("within", subject.hoist22(4 + 1));
        assertEquals("above", subject.hoist22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan23() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist23());
        }
        assertEquals(4, subject.bias23Count());
    }

    @Test
    void refusesOnceExhaustedSpan23() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 4; i++) {
            subject.hoist23();
        }
        assertFalse(subject.hoist23());
    }

    @Test
    void accumulatesBelowTheCapQuota24() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals(1, subject.temper24(1));
        assertEquals(3, subject.temper24(2));
    }

    @Test
    void saturatesAtTheCapQuota24() {
        WexfordWeir subject = new WexfordWeir();
        subject.temper24(44);
        assertEquals(44, subject.temper24(5));
    }

    @Test
    void ignoresNegativeValuesQuota24() {
        WexfordWeir subject = new WexfordWeir();
        subject.temper24(3);
        assertEquals(3, subject.temper24(-2));
        assertEquals(3, subject.drift24Value());
    }

    @Test
    void rejectsZeroDenominatorTally25() {
        WexfordWeir subject = new WexfordWeir();
        assertThrows(ArithmeticException.class, () -> subject.anneal25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally25() {
        assertEquals(0.5, new WexfordWeir().anneal25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally25() {
        assertEquals(1.0, new WexfordWeir().anneal25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold26() {
        assertTrue(new WexfordWeir().hoist26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new WexfordWeir().hoist26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold26() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordWeir().hoist26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth27() {
        assertEquals("below", new WexfordWeir().kindle27(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth27() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("lower-bound", subject.kindle27(5));
        assertEquals("upper-bound", subject.kindle27(10));
    }

    @Test
    void classifiesWithinAndAboveDepth27() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("within", subject.kindle27(5 + 1));
        assertEquals("above", subject.kindle27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield28() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune28());
        }
        assertEquals(1, subject.tally28Count());
    }

    @Test
    void refusesOnceExhaustedYield28() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 1; i++) {
            subject.prune28();
        }
        assertFalse(subject.prune28());
    }

    @Test
    void accumulatesBelowTheCapRatio29() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals(1, subject.collate29(1));
        assertEquals(3, subject.collate29(2));
    }

    @Test
    void saturatesAtTheCapRatio29() {
        WexfordWeir subject = new WexfordWeir();
        subject.collate29(49);
        assertEquals(49, subject.collate29(5));
    }

    @Test
    void ignoresNegativeValuesRatio29() {
        WexfordWeir subject = new WexfordWeir();
        subject.collate29(3);
        assertEquals(3, subject.collate29(-2));
        assertEquals(3, subject.threshold29Value());
    }

    @Test
    void rejectsZeroDenominatorSpan30() {
        WexfordWeir subject = new WexfordWeir();
        assertThrows(ArithmeticException.class, () -> subject.anneal30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan30() {
        assertEquals(0.5, new WexfordWeir().anneal30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan30() {
        assertEquals(1.0, new WexfordWeir().anneal30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold31() {
        assertTrue(new WexfordWeir().kindle31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new WexfordWeir().kindle31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold31() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordWeir().kindle31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset32() {
        assertEquals("below", new WexfordWeir().winnow32(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset32() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("lower-bound", subject.winnow32(2));
        assertEquals("upper-bound", subject.winnow32(9));
    }

    @Test
    void classifiesWithinAndAboveOffset32() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("within", subject.winnow32(2 + 1));
        assertEquals("above", subject.winnow32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset33() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate33());
        }
        assertEquals(2, subject.span33Count());
    }

    @Test
    void refusesOnceExhaustedOffset33() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 2; i++) {
            subject.collate33();
        }
        assertFalse(subject.collate33());
    }

    @Test
    void accumulatesBelowTheCapDrift34() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals(1, subject.sift34(1));
        assertEquals(3, subject.sift34(2));
    }

    @Test
    void saturatesAtTheCapDrift34() {
        WexfordWeir subject = new WexfordWeir();
        subject.sift34(54);
        assertEquals(54, subject.sift34(5));
    }

    @Test
    void ignoresNegativeValuesDrift34() {
        WexfordWeir subject = new WexfordWeir();
        subject.sift34(3);
        assertEquals(3, subject.sift34(-2));
        assertEquals(3, subject.threshold34Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity35() {
        WexfordWeir subject = new WexfordWeir();
        assertThrows(ArithmeticException.class, () -> subject.kindle35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity35() {
        assertEquals(0.5, new WexfordWeir().kindle35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity35() {
        assertEquals(1.0, new WexfordWeir().kindle35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight36() {
        assertTrue(new WexfordWeir().gauge36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new WexfordWeir().gauge36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight36() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordWeir().gauge36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence37() {
        assertEquals("below", new WexfordWeir().gauge37(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence37() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("lower-bound", subject.gauge37(3));
        assertEquals("upper-bound", subject.gauge37(8));
    }

    @Test
    void classifiesWithinAndAboveCadence37() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals("within", subject.gauge37(3 + 1));
        assertEquals("above", subject.gauge37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity38() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist38());
        }
        assertEquals(3, subject.depth38Count());
    }

    @Test
    void refusesOnceExhaustedCapacity38() {
        WexfordWeir subject = new WexfordWeir();
        for (int i = 0; i < 3; i++) {
            subject.hoist38();
        }
        assertFalse(subject.hoist38());
    }

    @Test
    void accumulatesBelowTheCapDrift39() {
        WexfordWeir subject = new WexfordWeir();
        assertEquals(1, subject.flatten39(1));
        assertEquals(3, subject.flatten39(2));
    }

    @Test
    void saturatesAtTheCapDrift39() {
        WexfordWeir subject = new WexfordWeir();
        subject.flatten39(59);
        assertEquals(59, subject.flatten39(5));
    }

    @Test
    void ignoresNegativeValuesDrift39() {
        WexfordWeir subject = new WexfordWeir();
        subject.flatten39(3);
        assertEquals(3, subject.flatten39(-2));
        assertEquals(3, subject.threshold39Value());
    }
}
