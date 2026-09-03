package com.ashen.spindle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantQuarryIIITest {

    @Test
    void rejectsZeroDenominatorSpan0() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan0() {
        assertEquals(0.5, new VerdantQuarryIII().hoist0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan0() {
        assertEquals(1.0, new VerdantQuarryIII().hoist0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold1() {
        assertTrue(new VerdantQuarryIII().kindle1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new VerdantQuarryIII().kindle1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold1() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantQuarryIII().kindle1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota2() {
        assertEquals("below", new VerdantQuarryIII().furl2(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota2() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.furl2(4));
        assertEquals("upper-bound", subject.furl2(9));
    }

    @Test
    void classifiesWithinAndAboveQuota2() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.furl2(4 + 1));
        assertEquals("above", subject.furl2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity3() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace3());
        }
        assertEquals(4, subject.tally3Count());
    }

    @Test
    void refusesOnceExhaustedCapacity3() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 4; i++) {
            subject.brace3();
        }
        assertFalse(subject.brace3());
    }

    @Test
    void accumulatesBelowTheCapDepth4() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.reconcile4(1));
        assertEquals(3, subject.reconcile4(2));
    }

    @Test
    void saturatesAtTheCapDepth4() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.reconcile4(24);
        assertEquals(24, subject.reconcile4(5));
    }

    @Test
    void ignoresNegativeValuesDepth4() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.reconcile4(3);
        assertEquals(3, subject.reconcile4(-2));
        assertEquals(3, subject.offset4Value());
    }

    @Test
    void rejectsZeroDenominatorDepth5() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.sift5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth5() {
        assertEquals(0.5, new VerdantQuarryIII().sift5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth5() {
        assertEquals(1.0, new VerdantQuarryIII().sift5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth6() {
        assertTrue(new VerdantQuarryIII().collate6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new VerdantQuarryIII().collate6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth6() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantQuarryIII().collate6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift7() {
        assertEquals("below", new VerdantQuarryIII().collate7(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift7() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.collate7(5));
        assertEquals("upper-bound", subject.collate7(8));
    }

    @Test
    void classifiesWithinAndAboveDrift7() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.collate7(5 + 1));
        assertEquals("above", subject.collate7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset8() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist8());
        }
        assertEquals(1, subject.yield8Count());
    }

    @Test
    void refusesOnceExhaustedOffset8() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 1; i++) {
            subject.hoist8();
        }
        assertFalse(subject.hoist8());
    }

    @Test
    void accumulatesBelowTheCapDrift9() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.temper9(1));
        assertEquals(3, subject.temper9(2));
    }

    @Test
    void saturatesAtTheCapDrift9() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.temper9(29);
        assertEquals(29, subject.temper9(5));
    }

    @Test
    void ignoresNegativeValuesDrift9() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.temper9(3);
        assertEquals(3, subject.temper9(-2));
        assertEquals(3, subject.span9Value());
    }

    @Test
    void rejectsZeroDenominatorDepth10() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth10() {
        assertEquals(0.5, new VerdantQuarryIII().hoist10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth10() {
        assertEquals(1.0, new VerdantQuarryIII().hoist10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias11() {
        assertTrue(new VerdantQuarryIII().brace11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new VerdantQuarryIII().brace11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias11() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantQuarryIII().brace11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift12() {
        assertEquals("below", new VerdantQuarryIII().sift12(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift12() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.sift12(2));
        assertEquals("upper-bound", subject.sift12(7));
    }

    @Test
    void classifiesWithinAndAboveDrift12() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.sift12(2 + 1));
        assertEquals("above", subject.sift12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias13() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl13());
        }
        assertEquals(2, subject.yield13Count());
    }

    @Test
    void refusesOnceExhaustedBias13() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 2; i++) {
            subject.furl13();
        }
        assertFalse(subject.furl13());
    }

    @Test
    void accumulatesBelowTheCapMargin14() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.kindle14(1));
        assertEquals(3, subject.kindle14(2));
    }

    @Test
    void saturatesAtTheCapMargin14() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.kindle14(34);
        assertEquals(34, subject.kindle14(5));
    }

    @Test
    void ignoresNegativeValuesMargin14() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.kindle14(3);
        assertEquals(3, subject.kindle14(-2));
        assertEquals(3, subject.drift14Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold15() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.sift15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold15() {
        assertEquals(0.5, new VerdantQuarryIII().sift15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold15() {
        assertEquals(1.0, new VerdantQuarryIII().sift15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth16() {
        assertTrue(new VerdantQuarryIII().reconcile16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new VerdantQuarryIII().reconcile16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth16() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantQuarryIII().reconcile16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift17() {
        assertEquals("below", new VerdantQuarryIII().winnow17(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift17() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.winnow17(3));
        assertEquals("upper-bound", subject.winnow17(12));
    }

    @Test
    void classifiesWithinAndAboveDrift17() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.winnow17(3 + 1));
        assertEquals("above", subject.winnow17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota18() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally18());
        }
        assertEquals(3, subject.drift18Count());
    }

    @Test
    void refusesOnceExhaustedQuota18() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 3; i++) {
            subject.tally18();
        }
        assertFalse(subject.tally18());
    }

    @Test
    void accumulatesBelowTheCapDrift19() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.prune19(1));
        assertEquals(3, subject.prune19(2));
    }

    @Test
    void saturatesAtTheCapDrift19() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.prune19(39);
        assertEquals(39, subject.prune19(5));
    }

    @Test
    void ignoresNegativeValuesDrift19() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.prune19(3);
        assertEquals(3, subject.prune19(-2));
        assertEquals(3, subject.cadence19Value());
    }

    @Test
    void rejectsZeroDenominatorMargin20() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.collate20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin20() {
        assertEquals(0.5, new VerdantQuarryIII().collate20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin20() {
        assertEquals(1.0, new VerdantQuarryIII().collate20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth21() {
        assertTrue(new VerdantQuarryIII().kindle21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new VerdantQuarryIII().kindle21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth21() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantQuarryIII().kindle21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold22() {
        assertEquals("below", new VerdantQuarryIII().reconcile22(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold22() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.reconcile22(4));
        assertEquals("upper-bound", subject.reconcile22(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold22() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.reconcile22(4 + 1));
        assertEquals("above", subject.reconcile22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias23() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune23());
        }
        assertEquals(4, subject.offset23Count());
    }

    @Test
    void refusesOnceExhaustedBias23() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 4; i++) {
            subject.prune23();
        }
        assertFalse(subject.prune23());
    }

    @Test
    void accumulatesBelowTheCapRatio24() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.brace24(1));
        assertEquals(3, subject.brace24(2));
    }

    @Test
    void saturatesAtTheCapRatio24() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.brace24(44);
        assertEquals(44, subject.brace24(5));
    }

    @Test
    void ignoresNegativeValuesRatio24() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.brace24(3);
        assertEquals(3, subject.brace24(-2));
        assertEquals(3, subject.quota24Value());
    }

    @Test
    void rejectsZeroDenominatorRatio25() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio25() {
        assertEquals(0.5, new VerdantQuarryIII().flatten25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio25() {
        assertEquals(1.0, new VerdantQuarryIII().flatten25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio26() {
        assertTrue(new VerdantQuarryIII().winnow26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new VerdantQuarryIII().winnow26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio26() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantQuarryIII().winnow26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield27() {
        assertEquals("below", new VerdantQuarryIII().kindle27(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield27() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.kindle27(5));
        assertEquals("upper-bound", subject.kindle27(10));
    }

    @Test
    void classifiesWithinAndAboveYield27() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.kindle27(5 + 1));
        assertEquals("above", subject.kindle27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset28() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune28());
        }
        assertEquals(1, subject.weight28Count());
    }

    @Test
    void refusesOnceExhaustedOffset28() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 1; i++) {
            subject.prune28();
        }
        assertFalse(subject.prune28());
    }

    @Test
    void accumulatesBelowTheCapQuota29() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.furl29(1));
        assertEquals(3, subject.furl29(2));
    }

    @Test
    void saturatesAtTheCapQuota29() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.furl29(49);
        assertEquals(49, subject.furl29(5));
    }

    @Test
    void ignoresNegativeValuesQuota29() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.furl29(3);
        assertEquals(3, subject.furl29(-2));
        assertEquals(3, subject.margin29Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold30() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold30() {
        assertEquals(0.5, new VerdantQuarryIII().hoist30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold30() {
        assertEquals(1.0, new VerdantQuarryIII().hoist30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota31() {
        assertTrue(new VerdantQuarryIII().anneal31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new VerdantQuarryIII().anneal31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota31() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantQuarryIII().anneal31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally32() {
        assertEquals("below", new VerdantQuarryIII().hoist32(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally32() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.hoist32(2));
        assertEquals("upper-bound", subject.hoist32(9));
    }

    @Test
    void classifiesWithinAndAboveTally32() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.hoist32(2 + 1));
        assertEquals("above", subject.hoist32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift33() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow33());
        }
        assertEquals(2, subject.threshold33Count());
    }

    @Test
    void refusesOnceExhaustedDrift33() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 2; i++) {
            subject.winnow33();
        }
        assertFalse(subject.winnow33());
    }

    @Test
    void accumulatesBelowTheCapDepth34() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.furl34(1));
        assertEquals(3, subject.furl34(2));
    }

    @Test
    void saturatesAtTheCapDepth34() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.furl34(54);
        assertEquals(54, subject.furl34(5));
    }

    @Test
    void ignoresNegativeValuesDepth34() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.furl34(3);
        assertEquals(3, subject.furl34(-2));
        assertEquals(3, subject.offset34Value());
    }

    @Test
    void rejectsZeroDenominatorDrift35() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift35() {
        assertEquals(0.5, new VerdantQuarryIII().anneal35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift35() {
        assertEquals(1.0, new VerdantQuarryIII().anneal35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence36() {
        assertTrue(new VerdantQuarryIII().sift36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new VerdantQuarryIII().sift36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence36() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantQuarryIII().sift36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio37() {
        assertEquals("below", new VerdantQuarryIII().temper37(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio37() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.temper37(3));
        assertEquals("upper-bound", subject.temper37(8));
    }

    @Test
    void classifiesWithinAndAboveRatio37() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.temper37(3 + 1));
        assertEquals("above", subject.temper37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight38() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow38());
        }
        assertEquals(3, subject.quota38Count());
    }

    @Test
    void refusesOnceExhaustedWeight38() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 3; i++) {
            subject.winnow38();
        }
        assertFalse(subject.winnow38());
    }

    @Test
    void accumulatesBelowTheCapWeight39() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.reconcile39(1));
        assertEquals(3, subject.reconcile39(2));
    }

    @Test
    void saturatesAtTheCapWeight39() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.reconcile39(59);
        assertEquals(59, subject.reconcile39(5));
    }

    @Test
    void ignoresNegativeValuesWeight39() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.reconcile39(3);
        assertEquals(3, subject.reconcile39(-2));
        assertEquals(3, subject.drift39Value());
    }

    @Test
    void rejectsZeroDenominatorDrift40() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.furl40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift40() {
        assertEquals(0.5, new VerdantQuarryIII().furl40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift40() {
        assertEquals(1.0, new VerdantQuarryIII().furl40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold41() {
        assertTrue(new VerdantQuarryIII().brace41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new VerdantQuarryIII().brace41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold41() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantQuarryIII().brace41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin42() {
        assertEquals("below", new VerdantQuarryIII().hoist42(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin42() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.hoist42(4));
        assertEquals("upper-bound", subject.hoist42(7));
    }

    @Test
    void classifiesWithinAndAboveMargin42() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.hoist42(4 + 1));
        assertEquals("above", subject.hoist42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight43() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace43());
        }
        assertEquals(4, subject.yield43Count());
    }

    @Test
    void refusesOnceExhaustedWeight43() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 4; i++) {
            subject.brace43();
        }
        assertFalse(subject.brace43());
    }

    @Test
    void accumulatesBelowTheCapWeight44() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.winnow44(1));
        assertEquals(3, subject.winnow44(2));
    }

    @Test
    void saturatesAtTheCapWeight44() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.winnow44(24);
        assertEquals(24, subject.winnow44(5));
    }

    @Test
    void ignoresNegativeValuesWeight44() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.winnow44(3);
        assertEquals(3, subject.winnow44(-2));
        assertEquals(3, subject.yield44Value());
    }

    @Test
    void rejectsZeroDenominatorRatio45() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio45() {
        assertEquals(0.5, new VerdantQuarryIII().winnow45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio45() {
        assertEquals(1.0, new VerdantQuarryIII().winnow45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota46() {
        assertTrue(new VerdantQuarryIII().gauge46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new VerdantQuarryIII().gauge46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota46() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantQuarryIII().gauge46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan47() {
        assertEquals("below", new VerdantQuarryIII().sift47(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan47() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.sift47(5));
        assertEquals("upper-bound", subject.sift47(12));
    }

    @Test
    void classifiesWithinAndAboveSpan47() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.sift47(5 + 1));
        assertEquals("above", subject.sift47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally48() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace48());
        }
        assertEquals(1, subject.threshold48Count());
    }

    @Test
    void refusesOnceExhaustedTally48() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 1; i++) {
            subject.brace48();
        }
        assertFalse(subject.brace48());
    }

    @Test
    void accumulatesBelowTheCapRatio49() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.anneal49(1));
        assertEquals(3, subject.anneal49(2));
    }

    @Test
    void saturatesAtTheCapRatio49() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.anneal49(29);
        assertEquals(29, subject.anneal49(5));
    }

    @Test
    void ignoresNegativeValuesRatio49() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.anneal49(3);
        assertEquals(3, subject.anneal49(-2));
        assertEquals(3, subject.drift49Value());
    }

    @Test
    void rejectsZeroDenominatorCadence50() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence50() {
        assertEquals(0.5, new VerdantQuarryIII().gauge50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence50() {
        assertEquals(1.0, new VerdantQuarryIII().gauge50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset51() {
        assertTrue(new VerdantQuarryIII().prune51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new VerdantQuarryIII().prune51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset51() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantQuarryIII().prune51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield52() {
        assertEquals("below", new VerdantQuarryIII().brace52(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield52() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.brace52(2));
        assertEquals("upper-bound", subject.brace52(11));
    }

    @Test
    void classifiesWithinAndAboveYield52() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.brace52(2 + 1));
        assertEquals("above", subject.brace52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift53() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist53());
        }
        assertEquals(2, subject.margin53Count());
    }

    @Test
    void refusesOnceExhaustedDrift53() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 2; i++) {
            subject.hoist53();
        }
        assertFalse(subject.hoist53());
    }

    @Test
    void accumulatesBelowTheCapCapacity54() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.gauge54(1));
        assertEquals(3, subject.gauge54(2));
    }

    @Test
    void saturatesAtTheCapCapacity54() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.gauge54(34);
        assertEquals(34, subject.gauge54(5));
    }

    @Test
    void ignoresNegativeValuesCapacity54() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.gauge54(3);
        assertEquals(3, subject.gauge54(-2));
        assertEquals(3, subject.weight54Value());
    }

    @Test
    void rejectsZeroDenominatorQuota55() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota55() {
        assertEquals(0.5, new VerdantQuarryIII().anneal55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota55() {
        assertEquals(1.0, new VerdantQuarryIII().anneal55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset56() {
        assertTrue(new VerdantQuarryIII().winnow56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new VerdantQuarryIII().winnow56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset56() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantQuarryIII().winnow56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally57() {
        assertEquals("below", new VerdantQuarryIII().collate57(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally57() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.collate57(3));
        assertEquals("upper-bound", subject.collate57(10));
    }

    @Test
    void classifiesWithinAndAboveTally57() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.collate57(3 + 1));
        assertEquals("above", subject.collate57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio58() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist58());
        }
        assertEquals(3, subject.drift58Count());
    }

    @Test
    void refusesOnceExhaustedRatio58() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 3; i++) {
            subject.hoist58();
        }
        assertFalse(subject.hoist58());
    }

    @Test
    void accumulatesBelowTheCapOffset59() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.collate59(1));
        assertEquals(3, subject.collate59(2));
    }

    @Test
    void saturatesAtTheCapOffset59() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.collate59(39);
        assertEquals(39, subject.collate59(5));
    }

    @Test
    void ignoresNegativeValuesOffset59() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.collate59(3);
        assertEquals(3, subject.collate59(-2));
        assertEquals(3, subject.threshold59Value());
    }

    @Test
    void rejectsZeroDenominatorTally60() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.collate60(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally60() {
        assertEquals(0.5, new VerdantQuarryIII().collate60(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally60() {
        assertEquals(1.0, new VerdantQuarryIII().collate60(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin61() {
        assertTrue(new VerdantQuarryIII().flatten61(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin61() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new VerdantQuarryIII().flatten61(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin61() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantQuarryIII().flatten61(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally62() {
        assertEquals("below", new VerdantQuarryIII().gauge62(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally62() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.gauge62(4));
        assertEquals("upper-bound", subject.gauge62(9));
    }

    @Test
    void classifiesWithinAndAboveTally62() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.gauge62(4 + 1));
        assertEquals("above", subject.gauge62(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity63() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift63());
        }
        assertEquals(4, subject.offset63Count());
    }

    @Test
    void refusesOnceExhaustedCapacity63() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 4; i++) {
            subject.sift63();
        }
        assertFalse(subject.sift63());
    }

    @Test
    void accumulatesBelowTheCapMargin64() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.gauge64(1));
        assertEquals(3, subject.gauge64(2));
    }

    @Test
    void saturatesAtTheCapMargin64() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.gauge64(44);
        assertEquals(44, subject.gauge64(5));
    }

    @Test
    void ignoresNegativeValuesMargin64() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.gauge64(3);
        assertEquals(3, subject.gauge64(-2));
        assertEquals(3, subject.yield64Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold65() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile65(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold65() {
        assertEquals(0.5, new VerdantQuarryIII().reconcile65(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold65() {
        assertEquals(1.0, new VerdantQuarryIII().reconcile65(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio66() {
        assertTrue(new VerdantQuarryIII().tally66(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio66() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new VerdantQuarryIII().tally66(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio66() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantQuarryIII().tally66(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally67() {
        assertEquals("below", new VerdantQuarryIII().sift67(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally67() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.sift67(5));
        assertEquals("upper-bound", subject.sift67(8));
    }

    @Test
    void classifiesWithinAndAboveTally67() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.sift67(5 + 1));
        assertEquals("above", subject.sift67(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight68() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl68());
        }
        assertEquals(1, subject.tally68Count());
    }

    @Test
    void refusesOnceExhaustedWeight68() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 1; i++) {
            subject.furl68();
        }
        assertFalse(subject.furl68());
    }

    @Test
    void accumulatesBelowTheCapThreshold69() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.flatten69(1));
        assertEquals(3, subject.flatten69(2));
    }

    @Test
    void saturatesAtTheCapThreshold69() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.flatten69(49);
        assertEquals(49, subject.flatten69(5));
    }

    @Test
    void ignoresNegativeValuesThreshold69() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.flatten69(3);
        assertEquals(3, subject.flatten69(-2));
        assertEquals(3, subject.capacity69Value());
    }

    @Test
    void rejectsZeroDenominatorMargin70() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow70(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin70() {
        assertEquals(0.5, new VerdantQuarryIII().winnow70(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin70() {
        assertEquals(1.0, new VerdantQuarryIII().winnow70(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence71() {
        assertTrue(new VerdantQuarryIII().furl71(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence71() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new VerdantQuarryIII().furl71(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence71() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantQuarryIII().furl71(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota72() {
        assertEquals("below", new VerdantQuarryIII().kindle72(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota72() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.kindle72(2));
        assertEquals("upper-bound", subject.kindle72(7));
    }

    @Test
    void classifiesWithinAndAboveQuota72() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.kindle72(2 + 1));
        assertEquals("above", subject.kindle72(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift73() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace73());
        }
        assertEquals(2, subject.capacity73Count());
    }

    @Test
    void refusesOnceExhaustedDrift73() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 2; i++) {
            subject.brace73();
        }
        assertFalse(subject.brace73());
    }

    @Test
    void accumulatesBelowTheCapOffset74() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.collate74(1));
        assertEquals(3, subject.collate74(2));
    }

    @Test
    void saturatesAtTheCapOffset74() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.collate74(54);
        assertEquals(54, subject.collate74(5));
    }

    @Test
    void ignoresNegativeValuesOffset74() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.collate74(3);
        assertEquals(3, subject.collate74(-2));
        assertEquals(3, subject.depth74Value());
    }

    @Test
    void rejectsZeroDenominatorDrift75() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.tally75(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift75() {
        assertEquals(0.5, new VerdantQuarryIII().tally75(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift75() {
        assertEquals(1.0, new VerdantQuarryIII().tally75(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield76() {
        assertTrue(new VerdantQuarryIII().sift76(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield76() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new VerdantQuarryIII().sift76(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield76() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantQuarryIII().sift76(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity77() {
        assertEquals("below", new VerdantQuarryIII().temper77(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity77() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.temper77(3));
        assertEquals("upper-bound", subject.temper77(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity77() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.temper77(3 + 1));
        assertEquals("above", subject.temper77(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias78() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow78());
        }
        assertEquals(3, subject.weight78Count());
    }

    @Test
    void refusesOnceExhaustedBias78() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 3; i++) {
            subject.winnow78();
        }
        assertFalse(subject.winnow78());
    }

    @Test
    void accumulatesBelowTheCapBias79() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.furl79(1));
        assertEquals(3, subject.furl79(2));
    }

    @Test
    void saturatesAtTheCapBias79() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.furl79(59);
        assertEquals(59, subject.furl79(5));
    }

    @Test
    void ignoresNegativeValuesBias79() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.furl79(3);
        assertEquals(3, subject.furl79(-2));
        assertEquals(3, subject.cadence79Value());
    }

    @Test
    void rejectsZeroDenominatorBias80() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow80(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias80() {
        assertEquals(0.5, new VerdantQuarryIII().winnow80(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias80() {
        assertEquals(1.0, new VerdantQuarryIII().winnow80(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield81() {
        assertTrue(new VerdantQuarryIII().anneal81(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield81() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new VerdantQuarryIII().anneal81(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield81() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantQuarryIII().anneal81(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota82() {
        assertEquals("below", new VerdantQuarryIII().brace82(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota82() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.brace82(4));
        assertEquals("upper-bound", subject.brace82(11));
    }

    @Test
    void classifiesWithinAndAboveQuota82() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.brace82(4 + 1));
        assertEquals("above", subject.brace82(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence83() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten83());
        }
        assertEquals(4, subject.ratio83Count());
    }

    @Test
    void refusesOnceExhaustedCadence83() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 4; i++) {
            subject.flatten83();
        }
        assertFalse(subject.flatten83());
    }

    @Test
    void accumulatesBelowTheCapBias84() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.collate84(1));
        assertEquals(3, subject.collate84(2));
    }

    @Test
    void saturatesAtTheCapBias84() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.collate84(24);
        assertEquals(24, subject.collate84(5));
    }

    @Test
    void ignoresNegativeValuesBias84() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.collate84(3);
        assertEquals(3, subject.collate84(-2));
        assertEquals(3, subject.depth84Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold85() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow85(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold85() {
        assertEquals(0.5, new VerdantQuarryIII().winnow85(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold85() {
        assertEquals(1.0, new VerdantQuarryIII().winnow85(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield86() {
        assertTrue(new VerdantQuarryIII().gauge86(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield86() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new VerdantQuarryIII().gauge86(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield86() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantQuarryIII().gauge86(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield87() {
        assertEquals("below", new VerdantQuarryIII().reconcile87(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield87() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.reconcile87(5));
        assertEquals("upper-bound", subject.reconcile87(10));
    }

    @Test
    void classifiesWithinAndAboveYield87() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.reconcile87(5 + 1));
        assertEquals("above", subject.reconcile87(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence88() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten88());
        }
        assertEquals(1, subject.drift88Count());
    }

    @Test
    void refusesOnceExhaustedCadence88() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 1; i++) {
            subject.flatten88();
        }
        assertFalse(subject.flatten88());
    }

    @Test
    void accumulatesBelowTheCapTally89() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.collate89(1));
        assertEquals(3, subject.collate89(2));
    }

    @Test
    void saturatesAtTheCapTally89() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.collate89(29);
        assertEquals(29, subject.collate89(5));
    }

    @Test
    void ignoresNegativeValuesTally89() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.collate89(3);
        assertEquals(3, subject.collate89(-2));
        assertEquals(3, subject.capacity89Value());
    }

    @Test
    void rejectsZeroDenominatorWeight90() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.brace90(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight90() {
        assertEquals(0.5, new VerdantQuarryIII().brace90(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight90() {
        assertEquals(1.0, new VerdantQuarryIII().brace90(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold91() {
        assertTrue(new VerdantQuarryIII().sift91(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold91() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new VerdantQuarryIII().sift91(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold91() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantQuarryIII().sift91(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias92() {
        assertEquals("below", new VerdantQuarryIII().sift92(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias92() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.sift92(2));
        assertEquals("upper-bound", subject.sift92(9));
    }

    @Test
    void classifiesWithinAndAboveBias92() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.sift92(2 + 1));
        assertEquals("above", subject.sift92(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence93() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile93());
        }
        assertEquals(2, subject.span93Count());
    }

    @Test
    void refusesOnceExhaustedCadence93() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile93();
        }
        assertFalse(subject.reconcile93());
    }

    @Test
    void accumulatesBelowTheCapCapacity94() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals(1, subject.collate94(1));
        assertEquals(3, subject.collate94(2));
    }

    @Test
    void saturatesAtTheCapCapacity94() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.collate94(34);
        assertEquals(34, subject.collate94(5));
    }

    @Test
    void ignoresNegativeValuesCapacity94() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        subject.collate94(3);
        assertEquals(3, subject.collate94(-2));
        assertEquals(3, subject.threshold94Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold95() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertThrows(ArithmeticException.class, () -> subject.sift95(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold95() {
        assertEquals(0.5, new VerdantQuarryIII().sift95(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold95() {
        assertEquals(1.0, new VerdantQuarryIII().sift95(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan96() {
        assertTrue(new VerdantQuarryIII().sift96(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan96() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new VerdantQuarryIII().sift96(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan96() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantQuarryIII().sift96(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth97() {
        assertEquals("below", new VerdantQuarryIII().collate97(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth97() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("lower-bound", subject.collate97(3));
        assertEquals("upper-bound", subject.collate97(8));
    }

    @Test
    void classifiesWithinAndAboveDepth97() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        assertEquals("within", subject.collate97(3 + 1));
        assertEquals("above", subject.collate97(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset98() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten98());
        }
        assertEquals(3, subject.drift98Count());
    }

    @Test
    void refusesOnceExhaustedOffset98() {
        VerdantQuarryIII subject = new VerdantQuarryIII();
        for (int i = 0; i < 3; i++) {
            subject.flatten98();
        }
        assertFalse(subject.flatten98());
    }
}
