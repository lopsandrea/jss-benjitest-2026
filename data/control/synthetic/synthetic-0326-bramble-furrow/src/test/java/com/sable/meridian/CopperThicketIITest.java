package com.sable.meridian;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperThicketIITest {

    @Test
    void rejectsZeroDenominatorWeight0() {
        CopperThicketII subject = new CopperThicketII();
        assertThrows(ArithmeticException.class, () -> subject.sift0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight0() {
        assertEquals(0.5, new CopperThicketII().sift0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight0() {
        assertEquals(1.0, new CopperThicketII().sift0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight1() {
        assertTrue(new CopperThicketII().prune1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperThicketII().prune1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight1() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperThicketII().prune1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight2() {
        assertEquals("below", new CopperThicketII().collate2(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight2() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("lower-bound", subject.collate2(4));
        assertEquals("upper-bound", subject.collate2(9));
    }

    @Test
    void classifiesWithinAndAboveWeight2() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("within", subject.collate2(4 + 1));
        assertEquals("above", subject.collate2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift3() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper3());
        }
        assertEquals(4, subject.depth3Count());
    }

    @Test
    void refusesOnceExhaustedDrift3() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 4; i++) {
            subject.temper3();
        }
        assertFalse(subject.temper3());
    }

    @Test
    void accumulatesBelowTheCapBias4() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals(1, subject.flatten4(1));
        assertEquals(3, subject.flatten4(2));
    }

    @Test
    void saturatesAtTheCapBias4() {
        CopperThicketII subject = new CopperThicketII();
        subject.flatten4(24);
        assertEquals(24, subject.flatten4(5));
    }

    @Test
    void ignoresNegativeValuesBias4() {
        CopperThicketII subject = new CopperThicketII();
        subject.flatten4(3);
        assertEquals(3, subject.flatten4(-2));
        assertEquals(3, subject.capacity4Value());
    }

    @Test
    void rejectsZeroDenominatorSpan5() {
        CopperThicketII subject = new CopperThicketII();
        assertThrows(ArithmeticException.class, () -> subject.sift5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan5() {
        assertEquals(0.5, new CopperThicketII().sift5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan5() {
        assertEquals(1.0, new CopperThicketII().sift5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth6() {
        assertTrue(new CopperThicketII().flatten6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new CopperThicketII().flatten6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth6() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperThicketII().flatten6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold7() {
        assertEquals("below", new CopperThicketII().reconcile7(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold7() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("lower-bound", subject.reconcile7(5));
        assertEquals("upper-bound", subject.reconcile7(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold7() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("within", subject.reconcile7(5 + 1));
        assertEquals("above", subject.reconcile7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin8() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist8());
        }
        assertEquals(1, subject.span8Count());
    }

    @Test
    void refusesOnceExhaustedMargin8() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 1; i++) {
            subject.hoist8();
        }
        assertFalse(subject.hoist8());
    }

    @Test
    void accumulatesBelowTheCapDepth9() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals(1, subject.hoist9(1));
        assertEquals(3, subject.hoist9(2));
    }

    @Test
    void saturatesAtTheCapDepth9() {
        CopperThicketII subject = new CopperThicketII();
        subject.hoist9(29);
        assertEquals(29, subject.hoist9(5));
    }

    @Test
    void ignoresNegativeValuesDepth9() {
        CopperThicketII subject = new CopperThicketII();
        subject.hoist9(3);
        assertEquals(3, subject.hoist9(-2));
        assertEquals(3, subject.offset9Value());
    }

    @Test
    void rejectsZeroDenominatorTally10() {
        CopperThicketII subject = new CopperThicketII();
        assertThrows(ArithmeticException.class, () -> subject.tally10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally10() {
        assertEquals(0.5, new CopperThicketII().tally10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally10() {
        assertEquals(1.0, new CopperThicketII().tally10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin11() {
        assertTrue(new CopperThicketII().prune11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new CopperThicketII().prune11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin11() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperThicketII().prune11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally12() {
        assertEquals("below", new CopperThicketII().gauge12(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally12() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("lower-bound", subject.gauge12(2));
        assertEquals("upper-bound", subject.gauge12(7));
    }

    @Test
    void classifiesWithinAndAboveTally12() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("within", subject.gauge12(2 + 1));
        assertEquals("above", subject.gauge12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold13() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper13());
        }
        assertEquals(2, subject.weight13Count());
    }

    @Test
    void refusesOnceExhaustedThreshold13() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 2; i++) {
            subject.temper13();
        }
        assertFalse(subject.temper13());
    }

    @Test
    void accumulatesBelowTheCapBias14() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals(1, subject.collate14(1));
        assertEquals(3, subject.collate14(2));
    }

    @Test
    void saturatesAtTheCapBias14() {
        CopperThicketII subject = new CopperThicketII();
        subject.collate14(34);
        assertEquals(34, subject.collate14(5));
    }

    @Test
    void ignoresNegativeValuesBias14() {
        CopperThicketII subject = new CopperThicketII();
        subject.collate14(3);
        assertEquals(3, subject.collate14(-2));
        assertEquals(3, subject.margin14Value());
    }

    @Test
    void rejectsZeroDenominatorDepth15() {
        CopperThicketII subject = new CopperThicketII();
        assertThrows(ArithmeticException.class, () -> subject.sift15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth15() {
        assertEquals(0.5, new CopperThicketII().sift15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth15() {
        assertEquals(1.0, new CopperThicketII().sift15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift16() {
        assertTrue(new CopperThicketII().furl16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new CopperThicketII().furl16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift16() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperThicketII().furl16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio17() {
        assertEquals("below", new CopperThicketII().temper17(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio17() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("lower-bound", subject.temper17(3));
        assertEquals("upper-bound", subject.temper17(12));
    }

    @Test
    void classifiesWithinAndAboveRatio17() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("within", subject.temper17(3 + 1));
        assertEquals("above", subject.temper17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth18() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow18());
        }
        assertEquals(3, subject.quota18Count());
    }

    @Test
    void refusesOnceExhaustedDepth18() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 3; i++) {
            subject.winnow18();
        }
        assertFalse(subject.winnow18());
    }

    @Test
    void accumulatesBelowTheCapThreshold19() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals(1, subject.collate19(1));
        assertEquals(3, subject.collate19(2));
    }

    @Test
    void saturatesAtTheCapThreshold19() {
        CopperThicketII subject = new CopperThicketII();
        subject.collate19(39);
        assertEquals(39, subject.collate19(5));
    }

    @Test
    void ignoresNegativeValuesThreshold19() {
        CopperThicketII subject = new CopperThicketII();
        subject.collate19(3);
        assertEquals(3, subject.collate19(-2));
        assertEquals(3, subject.yield19Value());
    }

    @Test
    void rejectsZeroDenominatorWeight20() {
        CopperThicketII subject = new CopperThicketII();
        assertThrows(ArithmeticException.class, () -> subject.furl20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight20() {
        assertEquals(0.5, new CopperThicketII().furl20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight20() {
        assertEquals(1.0, new CopperThicketII().furl20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan21() {
        assertTrue(new CopperThicketII().sift21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new CopperThicketII().sift21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan21() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperThicketII().sift21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset22() {
        assertEquals("below", new CopperThicketII().kindle22(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset22() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("lower-bound", subject.kindle22(4));
        assertEquals("upper-bound", subject.kindle22(11));
    }

    @Test
    void classifiesWithinAndAboveOffset22() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("within", subject.kindle22(4 + 1));
        assertEquals("above", subject.kindle22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset23() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile23());
        }
        assertEquals(4, subject.cadence23Count());
    }

    @Test
    void refusesOnceExhaustedOffset23() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile23();
        }
        assertFalse(subject.reconcile23());
    }

    @Test
    void accumulatesBelowTheCapBias24() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals(1, subject.reconcile24(1));
        assertEquals(3, subject.reconcile24(2));
    }

    @Test
    void saturatesAtTheCapBias24() {
        CopperThicketII subject = new CopperThicketII();
        subject.reconcile24(44);
        assertEquals(44, subject.reconcile24(5));
    }

    @Test
    void ignoresNegativeValuesBias24() {
        CopperThicketII subject = new CopperThicketII();
        subject.reconcile24(3);
        assertEquals(3, subject.reconcile24(-2));
        assertEquals(3, subject.offset24Value());
    }

    @Test
    void rejectsZeroDenominatorDepth25() {
        CopperThicketII subject = new CopperThicketII();
        assertThrows(ArithmeticException.class, () -> subject.gauge25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth25() {
        assertEquals(0.5, new CopperThicketII().gauge25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth25() {
        assertEquals(1.0, new CopperThicketII().gauge25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin26() {
        assertTrue(new CopperThicketII().brace26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new CopperThicketII().brace26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin26() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperThicketII().brace26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth27() {
        assertEquals("below", new CopperThicketII().winnow27(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth27() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("lower-bound", subject.winnow27(5));
        assertEquals("upper-bound", subject.winnow27(10));
    }

    @Test
    void classifiesWithinAndAboveDepth27() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("within", subject.winnow27(5 + 1));
        assertEquals("above", subject.winnow27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight28() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace28());
        }
        assertEquals(1, subject.threshold28Count());
    }

    @Test
    void refusesOnceExhaustedWeight28() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 1; i++) {
            subject.brace28();
        }
        assertFalse(subject.brace28());
    }

    @Test
    void accumulatesBelowTheCapQuota29() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals(1, subject.collate29(1));
        assertEquals(3, subject.collate29(2));
    }

    @Test
    void saturatesAtTheCapQuota29() {
        CopperThicketII subject = new CopperThicketII();
        subject.collate29(49);
        assertEquals(49, subject.collate29(5));
    }

    @Test
    void ignoresNegativeValuesQuota29() {
        CopperThicketII subject = new CopperThicketII();
        subject.collate29(3);
        assertEquals(3, subject.collate29(-2));
        assertEquals(3, subject.cadence29Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold30() {
        CopperThicketII subject = new CopperThicketII();
        assertThrows(ArithmeticException.class, () -> subject.winnow30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold30() {
        assertEquals(0.5, new CopperThicketII().winnow30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold30() {
        assertEquals(1.0, new CopperThicketII().winnow30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin31() {
        assertTrue(new CopperThicketII().temper31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new CopperThicketII().temper31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin31() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperThicketII().temper31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold32() {
        assertEquals("below", new CopperThicketII().hoist32(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold32() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("lower-bound", subject.hoist32(2));
        assertEquals("upper-bound", subject.hoist32(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold32() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("within", subject.hoist32(2 + 1));
        assertEquals("above", subject.hoist32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity33() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile33());
        }
        assertEquals(2, subject.quota33Count());
    }

    @Test
    void refusesOnceExhaustedCapacity33() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile33();
        }
        assertFalse(subject.reconcile33());
    }

    @Test
    void accumulatesBelowTheCapYield34() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals(1, subject.prune34(1));
        assertEquals(3, subject.prune34(2));
    }

    @Test
    void saturatesAtTheCapYield34() {
        CopperThicketII subject = new CopperThicketII();
        subject.prune34(54);
        assertEquals(54, subject.prune34(5));
    }

    @Test
    void ignoresNegativeValuesYield34() {
        CopperThicketII subject = new CopperThicketII();
        subject.prune34(3);
        assertEquals(3, subject.prune34(-2));
        assertEquals(3, subject.quota34Value());
    }

    @Test
    void rejectsZeroDenominatorDepth35() {
        CopperThicketII subject = new CopperThicketII();
        assertThrows(ArithmeticException.class, () -> subject.prune35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth35() {
        assertEquals(0.5, new CopperThicketII().prune35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth35() {
        assertEquals(1.0, new CopperThicketII().prune35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin36() {
        assertTrue(new CopperThicketII().temper36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new CopperThicketII().temper36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin36() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperThicketII().temper36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset37() {
        assertEquals("below", new CopperThicketII().furl37(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset37() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("lower-bound", subject.furl37(3));
        assertEquals("upper-bound", subject.furl37(8));
    }

    @Test
    void classifiesWithinAndAboveOffset37() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("within", subject.furl37(3 + 1));
        assertEquals("above", subject.furl37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity38() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge38());
        }
        assertEquals(3, subject.margin38Count());
    }

    @Test
    void refusesOnceExhaustedCapacity38() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 3; i++) {
            subject.gauge38();
        }
        assertFalse(subject.gauge38());
    }

    @Test
    void accumulatesBelowTheCapSpan39() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals(1, subject.anneal39(1));
        assertEquals(3, subject.anneal39(2));
    }

    @Test
    void saturatesAtTheCapSpan39() {
        CopperThicketII subject = new CopperThicketII();
        subject.anneal39(59);
        assertEquals(59, subject.anneal39(5));
    }

    @Test
    void ignoresNegativeValuesSpan39() {
        CopperThicketII subject = new CopperThicketII();
        subject.anneal39(3);
        assertEquals(3, subject.anneal39(-2));
        assertEquals(3, subject.offset39Value());
    }

    @Test
    void rejectsZeroDenominatorRatio40() {
        CopperThicketII subject = new CopperThicketII();
        assertThrows(ArithmeticException.class, () -> subject.furl40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio40() {
        assertEquals(0.5, new CopperThicketII().furl40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio40() {
        assertEquals(1.0, new CopperThicketII().furl40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift41() {
        assertTrue(new CopperThicketII().gauge41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new CopperThicketII().gauge41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift41() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperThicketII().gauge41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity42() {
        assertEquals("below", new CopperThicketII().hoist42(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity42() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("lower-bound", subject.hoist42(4));
        assertEquals("upper-bound", subject.hoist42(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity42() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("within", subject.hoist42(4 + 1));
        assertEquals("above", subject.hoist42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota43() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle43());
        }
        assertEquals(4, subject.bias43Count());
    }

    @Test
    void refusesOnceExhaustedQuota43() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 4; i++) {
            subject.kindle43();
        }
        assertFalse(subject.kindle43());
    }

    @Test
    void accumulatesBelowTheCapRatio44() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals(1, subject.gauge44(1));
        assertEquals(3, subject.gauge44(2));
    }

    @Test
    void saturatesAtTheCapRatio44() {
        CopperThicketII subject = new CopperThicketII();
        subject.gauge44(24);
        assertEquals(24, subject.gauge44(5));
    }

    @Test
    void ignoresNegativeValuesRatio44() {
        CopperThicketII subject = new CopperThicketII();
        subject.gauge44(3);
        assertEquals(3, subject.gauge44(-2));
        assertEquals(3, subject.weight44Value());
    }

    @Test
    void rejectsZeroDenominatorCadence45() {
        CopperThicketII subject = new CopperThicketII();
        assertThrows(ArithmeticException.class, () -> subject.temper45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence45() {
        assertEquals(0.5, new CopperThicketII().temper45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence45() {
        assertEquals(1.0, new CopperThicketII().temper45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield46() {
        assertTrue(new CopperThicketII().gauge46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperThicketII().gauge46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield46() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperThicketII().gauge46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity47() {
        assertEquals("below", new CopperThicketII().sift47(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity47() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("lower-bound", subject.sift47(5));
        assertEquals("upper-bound", subject.sift47(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity47() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("within", subject.sift47(5 + 1));
        assertEquals("above", subject.sift47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth48() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile48());
        }
        assertEquals(1, subject.offset48Count());
    }

    @Test
    void refusesOnceExhaustedDepth48() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile48();
        }
        assertFalse(subject.reconcile48());
    }

    @Test
    void accumulatesBelowTheCapRatio49() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals(1, subject.sift49(1));
        assertEquals(3, subject.sift49(2));
    }

    @Test
    void saturatesAtTheCapRatio49() {
        CopperThicketII subject = new CopperThicketII();
        subject.sift49(29);
        assertEquals(29, subject.sift49(5));
    }

    @Test
    void ignoresNegativeValuesRatio49() {
        CopperThicketII subject = new CopperThicketII();
        subject.sift49(3);
        assertEquals(3, subject.sift49(-2));
        assertEquals(3, subject.threshold49Value());
    }

    @Test
    void rejectsZeroDenominatorCadence50() {
        CopperThicketII subject = new CopperThicketII();
        assertThrows(ArithmeticException.class, () -> subject.tally50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence50() {
        assertEquals(0.5, new CopperThicketII().tally50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence50() {
        assertEquals(1.0, new CopperThicketII().tally50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold51() {
        assertTrue(new CopperThicketII().kindle51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new CopperThicketII().kindle51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold51() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperThicketII().kindle51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally52() {
        assertEquals("below", new CopperThicketII().sift52(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally52() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("lower-bound", subject.sift52(2));
        assertEquals("upper-bound", subject.sift52(11));
    }

    @Test
    void classifiesWithinAndAboveTally52() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("within", subject.sift52(2 + 1));
        assertEquals("above", subject.sift52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence53() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl53());
        }
        assertEquals(2, subject.threshold53Count());
    }

    @Test
    void refusesOnceExhaustedCadence53() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 2; i++) {
            subject.furl53();
        }
        assertFalse(subject.furl53());
    }

    @Test
    void accumulatesBelowTheCapYield54() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals(1, subject.temper54(1));
        assertEquals(3, subject.temper54(2));
    }

    @Test
    void saturatesAtTheCapYield54() {
        CopperThicketII subject = new CopperThicketII();
        subject.temper54(34);
        assertEquals(34, subject.temper54(5));
    }

    @Test
    void ignoresNegativeValuesYield54() {
        CopperThicketII subject = new CopperThicketII();
        subject.temper54(3);
        assertEquals(3, subject.temper54(-2));
        assertEquals(3, subject.offset54Value());
    }

    @Test
    void rejectsZeroDenominatorBias55() {
        CopperThicketII subject = new CopperThicketII();
        assertThrows(ArithmeticException.class, () -> subject.temper55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias55() {
        assertEquals(0.5, new CopperThicketII().temper55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias55() {
        assertEquals(1.0, new CopperThicketII().temper55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin56() {
        assertTrue(new CopperThicketII().anneal56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new CopperThicketII().anneal56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin56() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperThicketII().anneal56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias57() {
        assertEquals("below", new CopperThicketII().winnow57(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias57() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("lower-bound", subject.winnow57(3));
        assertEquals("upper-bound", subject.winnow57(10));
    }

    @Test
    void classifiesWithinAndAboveBias57() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("within", subject.winnow57(3 + 1));
        assertEquals("above", subject.winnow57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally58() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift58());
        }
        assertEquals(3, subject.span58Count());
    }

    @Test
    void refusesOnceExhaustedTally58() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 3; i++) {
            subject.sift58();
        }
        assertFalse(subject.sift58());
    }

    @Test
    void accumulatesBelowTheCapDepth59() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals(1, subject.anneal59(1));
        assertEquals(3, subject.anneal59(2));
    }

    @Test
    void saturatesAtTheCapDepth59() {
        CopperThicketII subject = new CopperThicketII();
        subject.anneal59(39);
        assertEquals(39, subject.anneal59(5));
    }

    @Test
    void ignoresNegativeValuesDepth59() {
        CopperThicketII subject = new CopperThicketII();
        subject.anneal59(3);
        assertEquals(3, subject.anneal59(-2));
        assertEquals(3, subject.ratio59Value());
    }

    @Test
    void rejectsZeroDenominatorQuota60() {
        CopperThicketII subject = new CopperThicketII();
        assertThrows(ArithmeticException.class, () -> subject.gauge60(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota60() {
        assertEquals(0.5, new CopperThicketII().gauge60(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota60() {
        assertEquals(1.0, new CopperThicketII().gauge60(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan61() {
        assertTrue(new CopperThicketII().winnow61(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan61() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new CopperThicketII().winnow61(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan61() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperThicketII().winnow61(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight62() {
        assertEquals("below", new CopperThicketII().anneal62(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight62() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("lower-bound", subject.anneal62(4));
        assertEquals("upper-bound", subject.anneal62(9));
    }

    @Test
    void classifiesWithinAndAboveWeight62() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals("within", subject.anneal62(4 + 1));
        assertEquals("above", subject.anneal62(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias63() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist63());
        }
        assertEquals(4, subject.span63Count());
    }

    @Test
    void refusesOnceExhaustedBias63() {
        CopperThicketII subject = new CopperThicketII();
        for (int i = 0; i < 4; i++) {
            subject.hoist63();
        }
        assertFalse(subject.hoist63());
    }

    @Test
    void accumulatesBelowTheCapBias64() {
        CopperThicketII subject = new CopperThicketII();
        assertEquals(1, subject.gauge64(1));
        assertEquals(3, subject.gauge64(2));
    }

    @Test
    void saturatesAtTheCapBias64() {
        CopperThicketII subject = new CopperThicketII();
        subject.gauge64(44);
        assertEquals(44, subject.gauge64(5));
    }

    @Test
    void ignoresNegativeValuesBias64() {
        CopperThicketII subject = new CopperThicketII();
        subject.gauge64(3);
        assertEquals(3, subject.gauge64(-2));
        assertEquals(3, subject.span64Value());
    }
}
