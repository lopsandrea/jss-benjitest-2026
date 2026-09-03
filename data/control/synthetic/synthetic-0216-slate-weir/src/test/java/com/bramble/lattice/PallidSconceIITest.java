package com.bramble.lattice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidSconceIITest {

    @Test
    void rejectsZeroDenominatorBias0() {
        PallidSconceII subject = new PallidSconceII();
        assertThrows(ArithmeticException.class, () -> subject.anneal0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias0() {
        assertEquals(0.5, new PallidSconceII().anneal0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias0() {
        assertEquals(1.0, new PallidSconceII().anneal0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield1() {
        assertTrue(new PallidSconceII().flatten1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new PallidSconceII().flatten1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield1() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidSconceII().flatten1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight2() {
        assertEquals("below", new PallidSconceII().temper2(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight2() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("lower-bound", subject.temper2(4));
        assertEquals("upper-bound", subject.temper2(9));
    }

    @Test
    void classifiesWithinAndAboveWeight2() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("within", subject.temper2(4 + 1));
        assertEquals("above", subject.temper2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio3() {
        PallidSconceII subject = new PallidSconceII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal3());
        }
        assertEquals(4, subject.yield3Count());
    }

    @Test
    void refusesOnceExhaustedRatio3() {
        PallidSconceII subject = new PallidSconceII();
        for (int i = 0; i < 4; i++) {
            subject.anneal3();
        }
        assertFalse(subject.anneal3());
    }

    @Test
    void accumulatesBelowTheCapThreshold4() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals(1, subject.anneal4(1));
        assertEquals(3, subject.anneal4(2));
    }

    @Test
    void saturatesAtTheCapThreshold4() {
        PallidSconceII subject = new PallidSconceII();
        subject.anneal4(24);
        assertEquals(24, subject.anneal4(5));
    }

    @Test
    void ignoresNegativeValuesThreshold4() {
        PallidSconceII subject = new PallidSconceII();
        subject.anneal4(3);
        assertEquals(3, subject.anneal4(-2));
        assertEquals(3, subject.weight4Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity5() {
        PallidSconceII subject = new PallidSconceII();
        assertThrows(ArithmeticException.class, () -> subject.winnow5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity5() {
        assertEquals(0.5, new PallidSconceII().winnow5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity5() {
        assertEquals(1.0, new PallidSconceII().winnow5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold6() {
        assertTrue(new PallidSconceII().hoist6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new PallidSconceII().hoist6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold6() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidSconceII().hoist6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight7() {
        assertEquals("below", new PallidSconceII().tally7(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight7() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("lower-bound", subject.tally7(5));
        assertEquals("upper-bound", subject.tally7(8));
    }

    @Test
    void classifiesWithinAndAboveWeight7() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("within", subject.tally7(5 + 1));
        assertEquals("above", subject.tally7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift8() {
        PallidSconceII subject = new PallidSconceII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl8());
        }
        assertEquals(1, subject.capacity8Count());
    }

    @Test
    void refusesOnceExhaustedDrift8() {
        PallidSconceII subject = new PallidSconceII();
        for (int i = 0; i < 1; i++) {
            subject.furl8();
        }
        assertFalse(subject.furl8());
    }

    @Test
    void accumulatesBelowTheCapDrift9() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals(1, subject.sift9(1));
        assertEquals(3, subject.sift9(2));
    }

    @Test
    void saturatesAtTheCapDrift9() {
        PallidSconceII subject = new PallidSconceII();
        subject.sift9(29);
        assertEquals(29, subject.sift9(5));
    }

    @Test
    void ignoresNegativeValuesDrift9() {
        PallidSconceII subject = new PallidSconceII();
        subject.sift9(3);
        assertEquals(3, subject.sift9(-2));
        assertEquals(3, subject.threshold9Value());
    }

    @Test
    void rejectsZeroDenominatorQuota10() {
        PallidSconceII subject = new PallidSconceII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota10() {
        assertEquals(0.5, new PallidSconceII().reconcile10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota10() {
        assertEquals(1.0, new PallidSconceII().reconcile10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin11() {
        assertTrue(new PallidSconceII().temper11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new PallidSconceII().temper11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin11() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidSconceII().temper11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity12() {
        assertEquals("below", new PallidSconceII().brace12(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity12() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("lower-bound", subject.brace12(2));
        assertEquals("upper-bound", subject.brace12(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity12() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("within", subject.brace12(2 + 1));
        assertEquals("above", subject.brace12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity13() {
        PallidSconceII subject = new PallidSconceII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow13());
        }
        assertEquals(2, subject.threshold13Count());
    }

    @Test
    void refusesOnceExhaustedCapacity13() {
        PallidSconceII subject = new PallidSconceII();
        for (int i = 0; i < 2; i++) {
            subject.winnow13();
        }
        assertFalse(subject.winnow13());
    }

    @Test
    void accumulatesBelowTheCapCadence14() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals(1, subject.sift14(1));
        assertEquals(3, subject.sift14(2));
    }

    @Test
    void saturatesAtTheCapCadence14() {
        PallidSconceII subject = new PallidSconceII();
        subject.sift14(34);
        assertEquals(34, subject.sift14(5));
    }

    @Test
    void ignoresNegativeValuesCadence14() {
        PallidSconceII subject = new PallidSconceII();
        subject.sift14(3);
        assertEquals(3, subject.sift14(-2));
        assertEquals(3, subject.tally14Value());
    }

    @Test
    void rejectsZeroDenominatorSpan15() {
        PallidSconceII subject = new PallidSconceII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan15() {
        assertEquals(0.5, new PallidSconceII().reconcile15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan15() {
        assertEquals(1.0, new PallidSconceII().reconcile15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift16() {
        assertTrue(new PallidSconceII().brace16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new PallidSconceII().brace16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift16() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidSconceII().brace16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence17() {
        assertEquals("below", new PallidSconceII().winnow17(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence17() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("lower-bound", subject.winnow17(3));
        assertEquals("upper-bound", subject.winnow17(12));
    }

    @Test
    void classifiesWithinAndAboveCadence17() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("within", subject.winnow17(3 + 1));
        assertEquals("above", subject.winnow17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan18() {
        PallidSconceII subject = new PallidSconceII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile18());
        }
        assertEquals(3, subject.margin18Count());
    }

    @Test
    void refusesOnceExhaustedSpan18() {
        PallidSconceII subject = new PallidSconceII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile18();
        }
        assertFalse(subject.reconcile18());
    }

    @Test
    void accumulatesBelowTheCapWeight19() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals(1, subject.collate19(1));
        assertEquals(3, subject.collate19(2));
    }

    @Test
    void saturatesAtTheCapWeight19() {
        PallidSconceII subject = new PallidSconceII();
        subject.collate19(39);
        assertEquals(39, subject.collate19(5));
    }

    @Test
    void ignoresNegativeValuesWeight19() {
        PallidSconceII subject = new PallidSconceII();
        subject.collate19(3);
        assertEquals(3, subject.collate19(-2));
        assertEquals(3, subject.tally19Value());
    }

    @Test
    void rejectsZeroDenominatorOffset20() {
        PallidSconceII subject = new PallidSconceII();
        assertThrows(ArithmeticException.class, () -> subject.kindle20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset20() {
        assertEquals(0.5, new PallidSconceII().kindle20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset20() {
        assertEquals(1.0, new PallidSconceII().kindle20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota21() {
        assertTrue(new PallidSconceII().collate21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new PallidSconceII().collate21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota21() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidSconceII().collate21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota22() {
        assertEquals("below", new PallidSconceII().temper22(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota22() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("lower-bound", subject.temper22(4));
        assertEquals("upper-bound", subject.temper22(11));
    }

    @Test
    void classifiesWithinAndAboveQuota22() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("within", subject.temper22(4 + 1));
        assertEquals("above", subject.temper22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota23() {
        PallidSconceII subject = new PallidSconceII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl23());
        }
        assertEquals(4, subject.tally23Count());
    }

    @Test
    void refusesOnceExhaustedQuota23() {
        PallidSconceII subject = new PallidSconceII();
        for (int i = 0; i < 4; i++) {
            subject.furl23();
        }
        assertFalse(subject.furl23());
    }

    @Test
    void accumulatesBelowTheCapSpan24() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals(1, subject.winnow24(1));
        assertEquals(3, subject.winnow24(2));
    }

    @Test
    void saturatesAtTheCapSpan24() {
        PallidSconceII subject = new PallidSconceII();
        subject.winnow24(44);
        assertEquals(44, subject.winnow24(5));
    }

    @Test
    void ignoresNegativeValuesSpan24() {
        PallidSconceII subject = new PallidSconceII();
        subject.winnow24(3);
        assertEquals(3, subject.winnow24(-2));
        assertEquals(3, subject.bias24Value());
    }

    @Test
    void rejectsZeroDenominatorYield25() {
        PallidSconceII subject = new PallidSconceII();
        assertThrows(ArithmeticException.class, () -> subject.sift25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield25() {
        assertEquals(0.5, new PallidSconceII().sift25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield25() {
        assertEquals(1.0, new PallidSconceII().sift25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth26() {
        assertTrue(new PallidSconceII().brace26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new PallidSconceII().brace26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth26() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidSconceII().brace26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield27() {
        assertEquals("below", new PallidSconceII().gauge27(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield27() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("lower-bound", subject.gauge27(5));
        assertEquals("upper-bound", subject.gauge27(10));
    }

    @Test
    void classifiesWithinAndAboveYield27() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("within", subject.gauge27(5 + 1));
        assertEquals("above", subject.gauge27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin28() {
        PallidSconceII subject = new PallidSconceII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist28());
        }
        assertEquals(1, subject.span28Count());
    }

    @Test
    void refusesOnceExhaustedMargin28() {
        PallidSconceII subject = new PallidSconceII();
        for (int i = 0; i < 1; i++) {
            subject.hoist28();
        }
        assertFalse(subject.hoist28());
    }

    @Test
    void accumulatesBelowTheCapCadence29() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals(1, subject.furl29(1));
        assertEquals(3, subject.furl29(2));
    }

    @Test
    void saturatesAtTheCapCadence29() {
        PallidSconceII subject = new PallidSconceII();
        subject.furl29(49);
        assertEquals(49, subject.furl29(5));
    }

    @Test
    void ignoresNegativeValuesCadence29() {
        PallidSconceII subject = new PallidSconceII();
        subject.furl29(3);
        assertEquals(3, subject.furl29(-2));
        assertEquals(3, subject.depth29Value());
    }

    @Test
    void rejectsZeroDenominatorSpan30() {
        PallidSconceII subject = new PallidSconceII();
        assertThrows(ArithmeticException.class, () -> subject.winnow30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan30() {
        assertEquals(0.5, new PallidSconceII().winnow30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan30() {
        assertEquals(1.0, new PallidSconceII().winnow30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield31() {
        assertTrue(new PallidSconceII().collate31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new PallidSconceII().collate31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield31() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidSconceII().collate31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield32() {
        assertEquals("below", new PallidSconceII().collate32(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield32() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("lower-bound", subject.collate32(2));
        assertEquals("upper-bound", subject.collate32(9));
    }

    @Test
    void classifiesWithinAndAboveYield32() {
        PallidSconceII subject = new PallidSconceII();
        assertEquals("within", subject.collate32(2 + 1));
        assertEquals("above", subject.collate32(9 + 1));
    }
}
