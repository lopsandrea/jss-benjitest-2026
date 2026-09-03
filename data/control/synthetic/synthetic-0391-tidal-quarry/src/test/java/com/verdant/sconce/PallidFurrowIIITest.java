package com.verdant.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidFurrowIIITest {

    @Test
    void rejectsZeroDenominatorDrift0() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.tally0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift0() {
        assertEquals(0.5, new PallidFurrowIII().tally0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift0() {
        assertEquals(1.0, new PallidFurrowIII().tally0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan1() {
        assertTrue(new PallidFurrowIII().furl1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new PallidFurrowIII().furl1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan1() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidFurrowIII().furl1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth2() {
        assertEquals("below", new PallidFurrowIII().hoist2(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth2() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("lower-bound", subject.hoist2(4));
        assertEquals("upper-bound", subject.hoist2(9));
    }

    @Test
    void classifiesWithinAndAboveDepth2() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("within", subject.hoist2(4 + 1));
        assertEquals("above", subject.hoist2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias3() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten3());
        }
        assertEquals(4, subject.tally3Count());
    }

    @Test
    void refusesOnceExhaustedBias3() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 4; i++) {
            subject.flatten3();
        }
        assertFalse(subject.flatten3());
    }

    @Test
    void accumulatesBelowTheCapOffset4() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals(1, subject.hoist4(1));
        assertEquals(3, subject.hoist4(2));
    }

    @Test
    void saturatesAtTheCapOffset4() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.hoist4(24);
        assertEquals(24, subject.hoist4(5));
    }

    @Test
    void ignoresNegativeValuesOffset4() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.hoist4(3);
        assertEquals(3, subject.hoist4(-2));
        assertEquals(3, subject.drift4Value());
    }

    @Test
    void rejectsZeroDenominatorSpan5() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.tally5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan5() {
        assertEquals(0.5, new PallidFurrowIII().tally5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan5() {
        assertEquals(1.0, new PallidFurrowIII().tally5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset6() {
        assertTrue(new PallidFurrowIII().winnow6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new PallidFurrowIII().winnow6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset6() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidFurrowIII().winnow6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence7() {
        assertEquals("below", new PallidFurrowIII().brace7(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence7() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("lower-bound", subject.brace7(5));
        assertEquals("upper-bound", subject.brace7(8));
    }

    @Test
    void classifiesWithinAndAboveCadence7() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("within", subject.brace7(5 + 1));
        assertEquals("above", subject.brace7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift8() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten8());
        }
        assertEquals(1, subject.span8Count());
    }

    @Test
    void refusesOnceExhaustedDrift8() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 1; i++) {
            subject.flatten8();
        }
        assertFalse(subject.flatten8());
    }

    @Test
    void accumulatesBelowTheCapTally9() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals(1, subject.sift9(1));
        assertEquals(3, subject.sift9(2));
    }

    @Test
    void saturatesAtTheCapTally9() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.sift9(29);
        assertEquals(29, subject.sift9(5));
    }

    @Test
    void ignoresNegativeValuesTally9() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.sift9(3);
        assertEquals(3, subject.sift9(-2));
        assertEquals(3, subject.cadence9Value());
    }

    @Test
    void rejectsZeroDenominatorTally10() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally10() {
        assertEquals(0.5, new PallidFurrowIII().gauge10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally10() {
        assertEquals(1.0, new PallidFurrowIII().gauge10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight11() {
        assertTrue(new PallidFurrowIII().kindle11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new PallidFurrowIII().kindle11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight11() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidFurrowIII().kindle11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset12() {
        assertEquals("below", new PallidFurrowIII().hoist12(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset12() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("lower-bound", subject.hoist12(2));
        assertEquals("upper-bound", subject.hoist12(7));
    }

    @Test
    void classifiesWithinAndAboveOffset12() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("within", subject.hoist12(2 + 1));
        assertEquals("above", subject.hoist12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth13() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten13());
        }
        assertEquals(2, subject.quota13Count());
    }

    @Test
    void refusesOnceExhaustedDepth13() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 2; i++) {
            subject.flatten13();
        }
        assertFalse(subject.flatten13());
    }

    @Test
    void accumulatesBelowTheCapTally14() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals(1, subject.winnow14(1));
        assertEquals(3, subject.winnow14(2));
    }

    @Test
    void saturatesAtTheCapTally14() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.winnow14(34);
        assertEquals(34, subject.winnow14(5));
    }

    @Test
    void ignoresNegativeValuesTally14() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.winnow14(3);
        assertEquals(3, subject.winnow14(-2));
        assertEquals(3, subject.quota14Value());
    }

    @Test
    void rejectsZeroDenominatorYield15() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield15() {
        assertEquals(0.5, new PallidFurrowIII().kindle15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield15() {
        assertEquals(1.0, new PallidFurrowIII().kindle15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence16() {
        assertTrue(new PallidFurrowIII().sift16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new PallidFurrowIII().sift16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence16() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidFurrowIII().sift16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin17() {
        assertEquals("below", new PallidFurrowIII().flatten17(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin17() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("lower-bound", subject.flatten17(3));
        assertEquals("upper-bound", subject.flatten17(12));
    }

    @Test
    void classifiesWithinAndAboveMargin17() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("within", subject.flatten17(3 + 1));
        assertEquals("above", subject.flatten17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset18() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally18());
        }
        assertEquals(3, subject.threshold18Count());
    }

    @Test
    void refusesOnceExhaustedOffset18() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 3; i++) {
            subject.tally18();
        }
        assertFalse(subject.tally18());
    }

    @Test
    void accumulatesBelowTheCapSpan19() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals(1, subject.temper19(1));
        assertEquals(3, subject.temper19(2));
    }

    @Test
    void saturatesAtTheCapSpan19() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.temper19(39);
        assertEquals(39, subject.temper19(5));
    }

    @Test
    void ignoresNegativeValuesSpan19() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.temper19(3);
        assertEquals(3, subject.temper19(-2));
        assertEquals(3, subject.ratio19Value());
    }

    @Test
    void rejectsZeroDenominatorDepth20() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth20() {
        assertEquals(0.5, new PallidFurrowIII().reconcile20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth20() {
        assertEquals(1.0, new PallidFurrowIII().reconcile20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity21() {
        assertTrue(new PallidFurrowIII().gauge21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new PallidFurrowIII().gauge21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity21() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidFurrowIII().gauge21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence22() {
        assertEquals("below", new PallidFurrowIII().collate22(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence22() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("lower-bound", subject.collate22(4));
        assertEquals("upper-bound", subject.collate22(11));
    }

    @Test
    void classifiesWithinAndAboveCadence22() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("within", subject.collate22(4 + 1));
        assertEquals("above", subject.collate22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold23() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle23());
        }
        assertEquals(4, subject.capacity23Count());
    }

    @Test
    void refusesOnceExhaustedThreshold23() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 4; i++) {
            subject.kindle23();
        }
        assertFalse(subject.kindle23());
    }

    @Test
    void accumulatesBelowTheCapRatio24() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals(1, subject.sift24(1));
        assertEquals(3, subject.sift24(2));
    }

    @Test
    void saturatesAtTheCapRatio24() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.sift24(44);
        assertEquals(44, subject.sift24(5));
    }

    @Test
    void ignoresNegativeValuesRatio24() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.sift24(3);
        assertEquals(3, subject.sift24(-2));
        assertEquals(3, subject.weight24Value());
    }

    @Test
    void rejectsZeroDenominatorSpan25() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.tally25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan25() {
        assertEquals(0.5, new PallidFurrowIII().tally25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan25() {
        assertEquals(1.0, new PallidFurrowIII().tally25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield26() {
        assertTrue(new PallidFurrowIII().temper26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new PallidFurrowIII().temper26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield26() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidFurrowIII().temper26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin27() {
        assertEquals("below", new PallidFurrowIII().anneal27(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin27() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("lower-bound", subject.anneal27(5));
        assertEquals("upper-bound", subject.anneal27(10));
    }

    @Test
    void classifiesWithinAndAboveMargin27() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("within", subject.anneal27(5 + 1));
        assertEquals("above", subject.anneal27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth28() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift28());
        }
        assertEquals(1, subject.drift28Count());
    }

    @Test
    void refusesOnceExhaustedDepth28() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 1; i++) {
            subject.sift28();
        }
        assertFalse(subject.sift28());
    }

    @Test
    void accumulatesBelowTheCapDrift29() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals(1, subject.furl29(1));
        assertEquals(3, subject.furl29(2));
    }

    @Test
    void saturatesAtTheCapDrift29() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.furl29(49);
        assertEquals(49, subject.furl29(5));
    }

    @Test
    void ignoresNegativeValuesDrift29() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.furl29(3);
        assertEquals(3, subject.furl29(-2));
        assertEquals(3, subject.margin29Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity30() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity30() {
        assertEquals(0.5, new PallidFurrowIII().flatten30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity30() {
        assertEquals(1.0, new PallidFurrowIII().flatten30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity31() {
        assertTrue(new PallidFurrowIII().tally31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new PallidFurrowIII().tally31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity31() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidFurrowIII().tally31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight32() {
        assertEquals("below", new PallidFurrowIII().hoist32(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight32() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("lower-bound", subject.hoist32(2));
        assertEquals("upper-bound", subject.hoist32(9));
    }

    @Test
    void classifiesWithinAndAboveWeight32() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("within", subject.hoist32(2 + 1));
        assertEquals("above", subject.hoist32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio33() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle33());
        }
        assertEquals(2, subject.threshold33Count());
    }

    @Test
    void refusesOnceExhaustedRatio33() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 2; i++) {
            subject.kindle33();
        }
        assertFalse(subject.kindle33());
    }

    @Test
    void accumulatesBelowTheCapOffset34() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals(1, subject.flatten34(1));
        assertEquals(3, subject.flatten34(2));
    }

    @Test
    void saturatesAtTheCapOffset34() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.flatten34(54);
        assertEquals(54, subject.flatten34(5));
    }

    @Test
    void ignoresNegativeValuesOffset34() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.flatten34(3);
        assertEquals(3, subject.flatten34(-2));
        assertEquals(3, subject.threshold34Value());
    }

    @Test
    void rejectsZeroDenominatorOffset35() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset35() {
        assertEquals(0.5, new PallidFurrowIII().flatten35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset35() {
        assertEquals(1.0, new PallidFurrowIII().flatten35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias36() {
        assertTrue(new PallidFurrowIII().collate36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new PallidFurrowIII().collate36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias36() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidFurrowIII().collate36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio37() {
        assertEquals("below", new PallidFurrowIII().tally37(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio37() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("lower-bound", subject.tally37(3));
        assertEquals("upper-bound", subject.tally37(8));
    }

    @Test
    void classifiesWithinAndAboveRatio37() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("within", subject.tally37(3 + 1));
        assertEquals("above", subject.tally37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield38() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow38());
        }
        assertEquals(3, subject.ratio38Count());
    }

    @Test
    void refusesOnceExhaustedYield38() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 3; i++) {
            subject.winnow38();
        }
        assertFalse(subject.winnow38());
    }

    @Test
    void accumulatesBelowTheCapRatio39() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals(1, subject.reconcile39(1));
        assertEquals(3, subject.reconcile39(2));
    }

    @Test
    void saturatesAtTheCapRatio39() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.reconcile39(59);
        assertEquals(59, subject.reconcile39(5));
    }

    @Test
    void ignoresNegativeValuesRatio39() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.reconcile39(3);
        assertEquals(3, subject.reconcile39(-2));
        assertEquals(3, subject.offset39Value());
    }

    @Test
    void rejectsZeroDenominatorBias40() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias40() {
        assertEquals(0.5, new PallidFurrowIII().flatten40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias40() {
        assertEquals(1.0, new PallidFurrowIII().flatten40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset41() {
        assertTrue(new PallidFurrowIII().prune41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new PallidFurrowIII().prune41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset41() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidFurrowIII().prune41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias42() {
        assertEquals("below", new PallidFurrowIII().furl42(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias42() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("lower-bound", subject.furl42(4));
        assertEquals("upper-bound", subject.furl42(7));
    }

    @Test
    void classifiesWithinAndAboveBias42() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("within", subject.furl42(4 + 1));
        assertEquals("above", subject.furl42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias43() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge43());
        }
        assertEquals(4, subject.tally43Count());
    }

    @Test
    void refusesOnceExhaustedBias43() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 4; i++) {
            subject.gauge43();
        }
        assertFalse(subject.gauge43());
    }

    @Test
    void accumulatesBelowTheCapTally44() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals(1, subject.hoist44(1));
        assertEquals(3, subject.hoist44(2));
    }

    @Test
    void saturatesAtTheCapTally44() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.hoist44(24);
        assertEquals(24, subject.hoist44(5));
    }

    @Test
    void ignoresNegativeValuesTally44() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.hoist44(3);
        assertEquals(3, subject.hoist44(-2));
        assertEquals(3, subject.weight44Value());
    }

    @Test
    void rejectsZeroDenominatorDrift45() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift45() {
        assertEquals(0.5, new PallidFurrowIII().hoist45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift45() {
        assertEquals(1.0, new PallidFurrowIII().hoist45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset46() {
        assertTrue(new PallidFurrowIII().prune46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new PallidFurrowIII().prune46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset46() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidFurrowIII().prune46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift47() {
        assertEquals("below", new PallidFurrowIII().furl47(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift47() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("lower-bound", subject.furl47(5));
        assertEquals("upper-bound", subject.furl47(12));
    }

    @Test
    void classifiesWithinAndAboveDrift47() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("within", subject.furl47(5 + 1));
        assertEquals("above", subject.furl47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally48() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle48());
        }
        assertEquals(1, subject.quota48Count());
    }

    @Test
    void refusesOnceExhaustedTally48() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 1; i++) {
            subject.kindle48();
        }
        assertFalse(subject.kindle48());
    }

    @Test
    void accumulatesBelowTheCapQuota49() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals(1, subject.winnow49(1));
        assertEquals(3, subject.winnow49(2));
    }

    @Test
    void saturatesAtTheCapQuota49() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.winnow49(29);
        assertEquals(29, subject.winnow49(5));
    }

    @Test
    void ignoresNegativeValuesQuota49() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.winnow49(3);
        assertEquals(3, subject.winnow49(-2));
        assertEquals(3, subject.drift49Value());
    }

    @Test
    void rejectsZeroDenominatorDrift50() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift50() {
        assertEquals(0.5, new PallidFurrowIII().winnow50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift50() {
        assertEquals(1.0, new PallidFurrowIII().winnow50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence51() {
        assertTrue(new PallidFurrowIII().winnow51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new PallidFurrowIII().winnow51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence51() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidFurrowIII().winnow51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift52() {
        assertEquals("below", new PallidFurrowIII().flatten52(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift52() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("lower-bound", subject.flatten52(2));
        assertEquals("upper-bound", subject.flatten52(11));
    }

    @Test
    void classifiesWithinAndAboveDrift52() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("within", subject.flatten52(2 + 1));
        assertEquals("above", subject.flatten52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield53() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist53());
        }
        assertEquals(2, subject.span53Count());
    }

    @Test
    void refusesOnceExhaustedYield53() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 2; i++) {
            subject.hoist53();
        }
        assertFalse(subject.hoist53());
    }

    @Test
    void accumulatesBelowTheCapDepth54() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals(1, subject.flatten54(1));
        assertEquals(3, subject.flatten54(2));
    }

    @Test
    void saturatesAtTheCapDepth54() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.flatten54(34);
        assertEquals(34, subject.flatten54(5));
    }

    @Test
    void ignoresNegativeValuesDepth54() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.flatten54(3);
        assertEquals(3, subject.flatten54(-2));
        assertEquals(3, subject.ratio54Value());
    }

    @Test
    void rejectsZeroDenominatorDrift55() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift55() {
        assertEquals(0.5, new PallidFurrowIII().flatten55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift55() {
        assertEquals(1.0, new PallidFurrowIII().flatten55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio56() {
        assertTrue(new PallidFurrowIII().winnow56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new PallidFurrowIII().winnow56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio56() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidFurrowIII().winnow56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield57() {
        assertEquals("below", new PallidFurrowIII().temper57(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield57() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("lower-bound", subject.temper57(3));
        assertEquals("upper-bound", subject.temper57(10));
    }

    @Test
    void classifiesWithinAndAboveYield57() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals("within", subject.temper57(3 + 1));
        assertEquals("above", subject.temper57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield58() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist58());
        }
        assertEquals(3, subject.span58Count());
    }

    @Test
    void refusesOnceExhaustedYield58() {
        PallidFurrowIII subject = new PallidFurrowIII();
        for (int i = 0; i < 3; i++) {
            subject.hoist58();
        }
        assertFalse(subject.hoist58());
    }

    @Test
    void accumulatesBelowTheCapWeight59() {
        PallidFurrowIII subject = new PallidFurrowIII();
        assertEquals(1, subject.gauge59(1));
        assertEquals(3, subject.gauge59(2));
    }

    @Test
    void saturatesAtTheCapWeight59() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.gauge59(39);
        assertEquals(39, subject.gauge59(5));
    }

    @Test
    void ignoresNegativeValuesWeight59() {
        PallidFurrowIII subject = new PallidFurrowIII();
        subject.gauge59(3);
        assertEquals(3, subject.gauge59(-2));
        assertEquals(3, subject.yield59Value());
    }
}
