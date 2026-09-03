package com.copper.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalVellumIIITest {

    @Test
    void allowsAttemptsUpToTheBudgetCapacity0() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally0());
        }
        assertEquals(1, subject.threshold0Count());
    }

    @Test
    void refusesOnceExhaustedCapacity0() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 1; i++) {
            subject.tally0();
        }
        assertFalse(subject.tally0());
    }

    @Test
    void accumulatesBelowTheCapWeight1() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.brace1(1));
        assertEquals(3, subject.brace1(2));
    }

    @Test
    void saturatesAtTheCapWeight1() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.brace1(21);
        assertEquals(21, subject.brace1(5));
    }

    @Test
    void ignoresNegativeValuesWeight1() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.brace1(3);
        assertEquals(3, subject.brace1(-2));
        assertEquals(3, subject.yield1Value());
    }

    @Test
    void rejectsZeroDenominatorYield2() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield2() {
        assertEquals(0.5, new TidalVellumIII().winnow2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield2() {
        assertEquals(3.0, new TidalVellumIII().winnow2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset3() {
        assertTrue(new TidalVellumIII().collate3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new TidalVellumIII().collate3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset3() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalVellumIII().collate3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias4() {
        assertEquals("below", new TidalVellumIII().kindle4(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias4() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.kindle4(2));
        assertEquals("upper-bound", subject.kindle4(11));
    }

    @Test
    void classifiesWithinAndAboveBias4() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.kindle4(2 + 1));
        assertEquals("above", subject.kindle4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias5() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge5());
        }
        assertEquals(2, subject.span5Count());
    }

    @Test
    void refusesOnceExhaustedBias5() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 2; i++) {
            subject.gauge5();
        }
        assertFalse(subject.gauge5());
    }

    @Test
    void accumulatesBelowTheCapBias6() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.winnow6(1));
        assertEquals(3, subject.winnow6(2));
    }

    @Test
    void saturatesAtTheCapBias6() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.winnow6(26);
        assertEquals(26, subject.winnow6(5));
    }

    @Test
    void ignoresNegativeValuesBias6() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.winnow6(3);
        assertEquals(3, subject.winnow6(-2));
        assertEquals(3, subject.quota6Value());
    }

    @Test
    void rejectsZeroDenominatorCadence7() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence7() {
        assertEquals(0.5, new TidalVellumIII().winnow7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence7() {
        assertEquals(3.0, new TidalVellumIII().winnow7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold8() {
        assertTrue(new TidalVellumIII().tally8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new TidalVellumIII().tally8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold8() {
        assertEquals(java.util.Arrays.asList(14),
                new TidalVellumIII().tally8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity9() {
        assertEquals("below", new TidalVellumIII().collate9(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity9() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.collate9(3));
        assertEquals("upper-bound", subject.collate9(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity9() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.collate9(3 + 1));
        assertEquals("above", subject.collate9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio10() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile10());
        }
        assertEquals(3, subject.quota10Count());
    }

    @Test
    void refusesOnceExhaustedRatio10() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile10();
        }
        assertFalse(subject.reconcile10());
    }

    @Test
    void accumulatesBelowTheCapWeight11() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.reconcile11(1));
        assertEquals(3, subject.reconcile11(2));
    }

    @Test
    void saturatesAtTheCapWeight11() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.reconcile11(31);
        assertEquals(31, subject.reconcile11(5));
    }

    @Test
    void ignoresNegativeValuesWeight11() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.reconcile11(3);
        assertEquals(3, subject.reconcile11(-2));
        assertEquals(3, subject.drift11Value());
    }

    @Test
    void rejectsZeroDenominatorMargin12() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.sift12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin12() {
        assertEquals(0.5, new TidalVellumIII().sift12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin12() {
        assertEquals(3.0, new TidalVellumIII().sift12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota13() {
        assertTrue(new TidalVellumIII().temper13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new TidalVellumIII().temper13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota13() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalVellumIII().temper13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias14() {
        assertEquals("below", new TidalVellumIII().anneal14(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias14() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.anneal14(4));
        assertEquals("upper-bound", subject.anneal14(9));
    }

    @Test
    void classifiesWithinAndAboveBias14() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.anneal14(4 + 1));
        assertEquals("above", subject.anneal14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold15() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal15());
        }
        assertEquals(4, subject.yield15Count());
    }

    @Test
    void refusesOnceExhaustedThreshold15() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 4; i++) {
            subject.anneal15();
        }
        assertFalse(subject.anneal15());
    }

    @Test
    void accumulatesBelowTheCapOffset16() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.winnow16(1));
        assertEquals(3, subject.winnow16(2));
    }

    @Test
    void saturatesAtTheCapOffset16() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.winnow16(36);
        assertEquals(36, subject.winnow16(5));
    }

    @Test
    void ignoresNegativeValuesOffset16() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.winnow16(3);
        assertEquals(3, subject.winnow16(-2));
        assertEquals(3, subject.depth16Value());
    }

    @Test
    void rejectsZeroDenominatorYield17() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield17() {
        assertEquals(0.5, new TidalVellumIII().kindle17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield17() {
        assertEquals(3.0, new TidalVellumIII().kindle17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth18() {
        assertTrue(new TidalVellumIII().prune18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new TidalVellumIII().prune18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth18() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalVellumIII().prune18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth19() {
        assertEquals("below", new TidalVellumIII().temper19(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth19() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.temper19(5));
        assertEquals("upper-bound", subject.temper19(8));
    }

    @Test
    void classifiesWithinAndAboveDepth19() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.temper19(5 + 1));
        assertEquals("above", subject.temper19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin20() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune20());
        }
        assertEquals(1, subject.offset20Count());
    }

    @Test
    void refusesOnceExhaustedMargin20() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 1; i++) {
            subject.prune20();
        }
        assertFalse(subject.prune20());
    }

    @Test
    void accumulatesBelowTheCapCapacity21() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.winnow21(1));
        assertEquals(3, subject.winnow21(2));
    }

    @Test
    void saturatesAtTheCapCapacity21() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.winnow21(41);
        assertEquals(41, subject.winnow21(5));
    }

    @Test
    void ignoresNegativeValuesCapacity21() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.winnow21(3);
        assertEquals(3, subject.winnow21(-2));
        assertEquals(3, subject.offset21Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold22() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold22() {
        assertEquals(0.5, new TidalVellumIII().reconcile22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold22() {
        assertEquals(3.0, new TidalVellumIII().reconcile22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset23() {
        assertTrue(new TidalVellumIII().winnow23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new TidalVellumIII().winnow23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset23() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalVellumIII().winnow23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias24() {
        assertEquals("below", new TidalVellumIII().gauge24(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias24() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.gauge24(2));
        assertEquals("upper-bound", subject.gauge24(7));
    }

    @Test
    void classifiesWithinAndAboveBias24() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.gauge24(2 + 1));
        assertEquals("above", subject.gauge24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity25() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist25());
        }
        assertEquals(2, subject.offset25Count());
    }

    @Test
    void refusesOnceExhaustedCapacity25() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 2; i++) {
            subject.hoist25();
        }
        assertFalse(subject.hoist25());
    }

    @Test
    void accumulatesBelowTheCapRatio26() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.winnow26(1));
        assertEquals(3, subject.winnow26(2));
    }

    @Test
    void saturatesAtTheCapRatio26() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.winnow26(46);
        assertEquals(46, subject.winnow26(5));
    }

    @Test
    void ignoresNegativeValuesRatio26() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.winnow26(3);
        assertEquals(3, subject.winnow26(-2));
        assertEquals(3, subject.span26Value());
    }

    @Test
    void rejectsZeroDenominatorBias27() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.collate27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias27() {
        assertEquals(0.5, new TidalVellumIII().collate27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias27() {
        assertEquals(3.0, new TidalVellumIII().collate27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence28() {
        assertTrue(new TidalVellumIII().reconcile28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new TidalVellumIII().reconcile28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence28() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalVellumIII().reconcile28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset29() {
        assertEquals("below", new TidalVellumIII().temper29(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset29() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.temper29(3));
        assertEquals("upper-bound", subject.temper29(12));
    }

    @Test
    void classifiesWithinAndAboveOffset29() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.temper29(3 + 1));
        assertEquals("above", subject.temper29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence30() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune30());
        }
        assertEquals(3, subject.offset30Count());
    }

    @Test
    void refusesOnceExhaustedCadence30() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 3; i++) {
            subject.prune30();
        }
        assertFalse(subject.prune30());
    }

    @Test
    void accumulatesBelowTheCapCadence31() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.prune31(1));
        assertEquals(3, subject.prune31(2));
    }

    @Test
    void saturatesAtTheCapCadence31() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.prune31(51);
        assertEquals(51, subject.prune31(5));
    }

    @Test
    void ignoresNegativeValuesCadence31() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.prune31(3);
        assertEquals(3, subject.prune31(-2));
        assertEquals(3, subject.capacity31Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold32() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.brace32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold32() {
        assertEquals(0.5, new TidalVellumIII().brace32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold32() {
        assertEquals(3.0, new TidalVellumIII().brace32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold33() {
        assertTrue(new TidalVellumIII().temper33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new TidalVellumIII().temper33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold33() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalVellumIII().temper33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity34() {
        assertEquals("below", new TidalVellumIII().tally34(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity34() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.tally34(4));
        assertEquals("upper-bound", subject.tally34(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity34() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.tally34(4 + 1));
        assertEquals("above", subject.tally34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan35() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift35());
        }
        assertEquals(4, subject.margin35Count());
    }

    @Test
    void refusesOnceExhaustedSpan35() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 4; i++) {
            subject.sift35();
        }
        assertFalse(subject.sift35());
    }

    @Test
    void accumulatesBelowTheCapMargin36() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.collate36(1));
        assertEquals(3, subject.collate36(2));
    }

    @Test
    void saturatesAtTheCapMargin36() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.collate36(56);
        assertEquals(56, subject.collate36(5));
    }

    @Test
    void ignoresNegativeValuesMargin36() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.collate36(3);
        assertEquals(3, subject.collate36(-2));
        assertEquals(3, subject.drift36Value());
    }

    @Test
    void rejectsZeroDenominatorCadence37() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.collate37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence37() {
        assertEquals(0.5, new TidalVellumIII().collate37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence37() {
        assertEquals(3.0, new TidalVellumIII().collate37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold38() {
        assertTrue(new TidalVellumIII().tally38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new TidalVellumIII().tally38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold38() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalVellumIII().tally38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity39() {
        assertEquals("below", new TidalVellumIII().temper39(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity39() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.temper39(5));
        assertEquals("upper-bound", subject.temper39(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity39() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.temper39(5 + 1));
        assertEquals("above", subject.temper39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold40() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally40());
        }
        assertEquals(1, subject.offset40Count());
    }

    @Test
    void refusesOnceExhaustedThreshold40() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 1; i++) {
            subject.tally40();
        }
        assertFalse(subject.tally40());
    }

    @Test
    void accumulatesBelowTheCapCapacity41() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.gauge41(1));
        assertEquals(3, subject.gauge41(2));
    }

    @Test
    void saturatesAtTheCapCapacity41() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.gauge41(21);
        assertEquals(21, subject.gauge41(5));
    }

    @Test
    void ignoresNegativeValuesCapacity41() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.gauge41(3);
        assertEquals(3, subject.gauge41(-2));
        assertEquals(3, subject.threshold41Value());
    }

    @Test
    void rejectsZeroDenominatorYield42() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield42() {
        assertEquals(0.5, new TidalVellumIII().winnow42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield42() {
        assertEquals(3.0, new TidalVellumIII().winnow42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin43() {
        assertTrue(new TidalVellumIII().sift43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new TidalVellumIII().sift43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin43() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalVellumIII().sift43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset44() {
        assertEquals("below", new TidalVellumIII().gauge44(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset44() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.gauge44(2));
        assertEquals("upper-bound", subject.gauge44(9));
    }

    @Test
    void classifiesWithinAndAboveOffset44() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.gauge44(2 + 1));
        assertEquals("above", subject.gauge44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift45() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune45());
        }
        assertEquals(2, subject.bias45Count());
    }

    @Test
    void refusesOnceExhaustedDrift45() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 2; i++) {
            subject.prune45();
        }
        assertFalse(subject.prune45());
    }

    @Test
    void accumulatesBelowTheCapTally46() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.sift46(1));
        assertEquals(3, subject.sift46(2));
    }

    @Test
    void saturatesAtTheCapTally46() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.sift46(26);
        assertEquals(26, subject.sift46(5));
    }

    @Test
    void ignoresNegativeValuesTally46() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.sift46(3);
        assertEquals(3, subject.sift46(-2));
        assertEquals(3, subject.drift46Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold47() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.furl47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold47() {
        assertEquals(0.5, new TidalVellumIII().furl47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold47() {
        assertEquals(3.0, new TidalVellumIII().furl47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield48() {
        assertTrue(new TidalVellumIII().anneal48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new TidalVellumIII().anneal48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield48() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalVellumIII().anneal48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin49() {
        assertEquals("below", new TidalVellumIII().prune49(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin49() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.prune49(3));
        assertEquals("upper-bound", subject.prune49(8));
    }

    @Test
    void classifiesWithinAndAboveMargin49() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.prune49(3 + 1));
        assertEquals("above", subject.prune49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota50() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate50());
        }
        assertEquals(3, subject.threshold50Count());
    }

    @Test
    void refusesOnceExhaustedQuota50() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 3; i++) {
            subject.collate50();
        }
        assertFalse(subject.collate50());
    }

    @Test
    void accumulatesBelowTheCapOffset51() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.prune51(1));
        assertEquals(3, subject.prune51(2));
    }

    @Test
    void saturatesAtTheCapOffset51() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.prune51(31);
        assertEquals(31, subject.prune51(5));
    }

    @Test
    void ignoresNegativeValuesOffset51() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.prune51(3);
        assertEquals(3, subject.prune51(-2));
        assertEquals(3, subject.ratio51Value());
    }

    @Test
    void rejectsZeroDenominatorSpan52() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan52() {
        assertEquals(0.5, new TidalVellumIII().winnow52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan52() {
        assertEquals(3.0, new TidalVellumIII().winnow52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio53() {
        assertTrue(new TidalVellumIII().winnow53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new TidalVellumIII().winnow53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio53() {
        assertEquals(java.util.Arrays.asList(14),
                new TidalVellumIII().winnow53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity54() {
        assertEquals("below", new TidalVellumIII().brace54(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity54() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.brace54(4));
        assertEquals("upper-bound", subject.brace54(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity54() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.brace54(4 + 1));
        assertEquals("above", subject.brace54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight55() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow55());
        }
        assertEquals(4, subject.drift55Count());
    }

    @Test
    void refusesOnceExhaustedWeight55() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 4; i++) {
            subject.winnow55();
        }
        assertFalse(subject.winnow55());
    }

    @Test
    void accumulatesBelowTheCapDepth56() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.sift56(1));
        assertEquals(3, subject.sift56(2));
    }

    @Test
    void saturatesAtTheCapDepth56() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.sift56(36);
        assertEquals(36, subject.sift56(5));
    }

    @Test
    void ignoresNegativeValuesDepth56() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.sift56(3);
        assertEquals(3, subject.sift56(-2));
        assertEquals(3, subject.offset56Value());
    }

    @Test
    void rejectsZeroDenominatorSpan57() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.brace57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan57() {
        assertEquals(0.5, new TidalVellumIII().brace57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan57() {
        assertEquals(3.0, new TidalVellumIII().brace57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift58() {
        assertTrue(new TidalVellumIII().gauge58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new TidalVellumIII().gauge58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift58() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalVellumIII().gauge58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift59() {
        assertEquals("below", new TidalVellumIII().gauge59(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift59() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.gauge59(5));
        assertEquals("upper-bound", subject.gauge59(12));
    }

    @Test
    void classifiesWithinAndAboveDrift59() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.gauge59(5 + 1));
        assertEquals("above", subject.gauge59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota60() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow60());
        }
        assertEquals(1, subject.depth60Count());
    }

    @Test
    void refusesOnceExhaustedQuota60() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 1; i++) {
            subject.winnow60();
        }
        assertFalse(subject.winnow60());
    }

    @Test
    void accumulatesBelowTheCapBias61() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.winnow61(1));
        assertEquals(3, subject.winnow61(2));
    }

    @Test
    void saturatesAtTheCapBias61() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.winnow61(41);
        assertEquals(41, subject.winnow61(5));
    }

    @Test
    void ignoresNegativeValuesBias61() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.winnow61(3);
        assertEquals(3, subject.winnow61(-2));
        assertEquals(3, subject.depth61Value());
    }

    @Test
    void rejectsZeroDenominatorDrift62() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.temper62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift62() {
        assertEquals(0.5, new TidalVellumIII().temper62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift62() {
        assertEquals(3.0, new TidalVellumIII().temper62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield63() {
        assertTrue(new TidalVellumIII().furl63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new TidalVellumIII().furl63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield63() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalVellumIII().furl63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight64() {
        assertEquals("below", new TidalVellumIII().kindle64(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight64() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.kindle64(2));
        assertEquals("upper-bound", subject.kindle64(11));
    }

    @Test
    void classifiesWithinAndAboveWeight64() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.kindle64(2 + 1));
        assertEquals("above", subject.kindle64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity65() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle65());
        }
        assertEquals(2, subject.weight65Count());
    }

    @Test
    void refusesOnceExhaustedCapacity65() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 2; i++) {
            subject.kindle65();
        }
        assertFalse(subject.kindle65());
    }

    @Test
    void accumulatesBelowTheCapYield66() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.brace66(1));
        assertEquals(3, subject.brace66(2));
    }

    @Test
    void saturatesAtTheCapYield66() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.brace66(46);
        assertEquals(46, subject.brace66(5));
    }

    @Test
    void ignoresNegativeValuesYield66() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.brace66(3);
        assertEquals(3, subject.brace66(-2));
        assertEquals(3, subject.offset66Value());
    }

    @Test
    void rejectsZeroDenominatorWeight67() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight67() {
        assertEquals(0.5, new TidalVellumIII().reconcile67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight67() {
        assertEquals(3.0, new TidalVellumIII().reconcile67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight68() {
        assertTrue(new TidalVellumIII().prune68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new TidalVellumIII().prune68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight68() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalVellumIII().prune68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity69() {
        assertEquals("below", new TidalVellumIII().winnow69(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity69() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.winnow69(3));
        assertEquals("upper-bound", subject.winnow69(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity69() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.winnow69(3 + 1));
        assertEquals("above", subject.winnow69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio70() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten70());
        }
        assertEquals(3, subject.tally70Count());
    }

    @Test
    void refusesOnceExhaustedRatio70() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 3; i++) {
            subject.flatten70();
        }
        assertFalse(subject.flatten70());
    }

    @Test
    void accumulatesBelowTheCapDepth71() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.brace71(1));
        assertEquals(3, subject.brace71(2));
    }

    @Test
    void saturatesAtTheCapDepth71() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.brace71(51);
        assertEquals(51, subject.brace71(5));
    }

    @Test
    void ignoresNegativeValuesDepth71() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.brace71(3);
        assertEquals(3, subject.brace71(-2));
        assertEquals(3, subject.bias71Value());
    }

    @Test
    void rejectsZeroDenominatorBias72() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias72() {
        assertEquals(0.5, new TidalVellumIII().hoist72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias72() {
        assertEquals(3.0, new TidalVellumIII().hoist72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan73() {
        assertTrue(new TidalVellumIII().hoist73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new TidalVellumIII().hoist73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan73() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalVellumIII().hoist73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift74() {
        assertEquals("below", new TidalVellumIII().prune74(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift74() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.prune74(4));
        assertEquals("upper-bound", subject.prune74(9));
    }

    @Test
    void classifiesWithinAndAboveDrift74() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.prune74(4 + 1));
        assertEquals("above", subject.prune74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth75() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl75());
        }
        assertEquals(4, subject.yield75Count());
    }

    @Test
    void refusesOnceExhaustedDepth75() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 4; i++) {
            subject.furl75();
        }
        assertFalse(subject.furl75());
    }

    @Test
    void accumulatesBelowTheCapQuota76() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.gauge76(1));
        assertEquals(3, subject.gauge76(2));
    }

    @Test
    void saturatesAtTheCapQuota76() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.gauge76(56);
        assertEquals(56, subject.gauge76(5));
    }

    @Test
    void ignoresNegativeValuesQuota76() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.gauge76(3);
        assertEquals(3, subject.gauge76(-2));
        assertEquals(3, subject.ratio76Value());
    }

    @Test
    void rejectsZeroDenominatorWeight77() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight77() {
        assertEquals(0.5, new TidalVellumIII().hoist77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight77() {
        assertEquals(3.0, new TidalVellumIII().hoist77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan78() {
        assertTrue(new TidalVellumIII().anneal78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new TidalVellumIII().anneal78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan78() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalVellumIII().anneal78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset79() {
        assertEquals("below", new TidalVellumIII().tally79(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset79() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.tally79(5));
        assertEquals("upper-bound", subject.tally79(8));
    }

    @Test
    void classifiesWithinAndAboveOffset79() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.tally79(5 + 1));
        assertEquals("above", subject.tally79(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight80() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist80());
        }
        assertEquals(1, subject.margin80Count());
    }

    @Test
    void refusesOnceExhaustedWeight80() {
        TidalVellumIII subject = new TidalVellumIII();
        for (int i = 0; i < 1; i++) {
            subject.hoist80();
        }
        assertFalse(subject.hoist80());
    }

    @Test
    void accumulatesBelowTheCapMargin81() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals(1, subject.gauge81(1));
        assertEquals(3, subject.gauge81(2));
    }

    @Test
    void saturatesAtTheCapMargin81() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.gauge81(21);
        assertEquals(21, subject.gauge81(5));
    }

    @Test
    void ignoresNegativeValuesMargin81() {
        TidalVellumIII subject = new TidalVellumIII();
        subject.gauge81(3);
        assertEquals(3, subject.gauge81(-2));
        assertEquals(3, subject.ratio81Value());
    }

    @Test
    void rejectsZeroDenominatorSpan82() {
        TidalVellumIII subject = new TidalVellumIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow82(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan82() {
        assertEquals(0.5, new TidalVellumIII().winnow82(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan82() {
        assertEquals(3.0, new TidalVellumIII().winnow82(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota83() {
        assertTrue(new TidalVellumIII().prune83(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota83() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new TidalVellumIII().prune83(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota83() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalVellumIII().prune83(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio84() {
        assertEquals("below", new TidalVellumIII().furl84(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio84() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("lower-bound", subject.furl84(2));
        assertEquals("upper-bound", subject.furl84(7));
    }

    @Test
    void classifiesWithinAndAboveRatio84() {
        TidalVellumIII subject = new TidalVellumIII();
        assertEquals("within", subject.furl84(2 + 1));
        assertEquals("above", subject.furl84(7 + 1));
    }
}
