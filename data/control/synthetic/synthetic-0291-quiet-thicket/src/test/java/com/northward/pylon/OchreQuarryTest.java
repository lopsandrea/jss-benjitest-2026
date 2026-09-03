package com.northward.pylon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreQuarryTest {

    @Test
    void rejectsZeroDenominatorCadence0() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.brace0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence0() {
        assertEquals(0.5, new OchreQuarry().brace0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence0() {
        assertEquals(1.0, new OchreQuarry().brace0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin1() {
        assertTrue(new OchreQuarry().winnow1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new OchreQuarry().winnow1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin1() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreQuarry().winnow1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift2() {
        assertEquals("below", new OchreQuarry().brace2(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift2() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.brace2(4));
        assertEquals("upper-bound", subject.brace2(9));
    }

    @Test
    void classifiesWithinAndAboveDrift2() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.brace2(4 + 1));
        assertEquals("above", subject.brace2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight3() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift3());
        }
        assertEquals(4, subject.tally3Count());
    }

    @Test
    void refusesOnceExhaustedWeight3() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 4; i++) {
            subject.sift3();
        }
        assertFalse(subject.sift3());
    }

    @Test
    void accumulatesBelowTheCapQuota4() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.reconcile4(1));
        assertEquals(3, subject.reconcile4(2));
    }

    @Test
    void saturatesAtTheCapQuota4() {
        OchreQuarry subject = new OchreQuarry();
        subject.reconcile4(24);
        assertEquals(24, subject.reconcile4(5));
    }

    @Test
    void ignoresNegativeValuesQuota4() {
        OchreQuarry subject = new OchreQuarry();
        subject.reconcile4(3);
        assertEquals(3, subject.reconcile4(-2));
        assertEquals(3, subject.threshold4Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity5() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity5() {
        assertEquals(0.5, new OchreQuarry().reconcile5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity5() {
        assertEquals(1.0, new OchreQuarry().reconcile5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight6() {
        assertTrue(new OchreQuarry().kindle6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new OchreQuarry().kindle6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight6() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreQuarry().kindle6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold7() {
        assertEquals("below", new OchreQuarry().flatten7(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold7() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.flatten7(5));
        assertEquals("upper-bound", subject.flatten7(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold7() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.flatten7(5 + 1));
        assertEquals("above", subject.flatten7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio8() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten8());
        }
        assertEquals(1, subject.depth8Count());
    }

    @Test
    void refusesOnceExhaustedRatio8() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 1; i++) {
            subject.flatten8();
        }
        assertFalse(subject.flatten8());
    }

    @Test
    void accumulatesBelowTheCapQuota9() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.winnow9(1));
        assertEquals(3, subject.winnow9(2));
    }

    @Test
    void saturatesAtTheCapQuota9() {
        OchreQuarry subject = new OchreQuarry();
        subject.winnow9(29);
        assertEquals(29, subject.winnow9(5));
    }

    @Test
    void ignoresNegativeValuesQuota9() {
        OchreQuarry subject = new OchreQuarry();
        subject.winnow9(3);
        assertEquals(3, subject.winnow9(-2));
        assertEquals(3, subject.ratio9Value());
    }

    @Test
    void rejectsZeroDenominatorBias10() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.flatten10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias10() {
        assertEquals(0.5, new OchreQuarry().flatten10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias10() {
        assertEquals(1.0, new OchreQuarry().flatten10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio11() {
        assertTrue(new OchreQuarry().flatten11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new OchreQuarry().flatten11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio11() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreQuarry().flatten11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold12() {
        assertEquals("below", new OchreQuarry().temper12(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold12() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.temper12(2));
        assertEquals("upper-bound", subject.temper12(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold12() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.temper12(2 + 1));
        assertEquals("above", subject.temper12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan13() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle13());
        }
        assertEquals(2, subject.threshold13Count());
    }

    @Test
    void refusesOnceExhaustedSpan13() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 2; i++) {
            subject.kindle13();
        }
        assertFalse(subject.kindle13());
    }

    @Test
    void accumulatesBelowTheCapQuota14() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.brace14(1));
        assertEquals(3, subject.brace14(2));
    }

    @Test
    void saturatesAtTheCapQuota14() {
        OchreQuarry subject = new OchreQuarry();
        subject.brace14(34);
        assertEquals(34, subject.brace14(5));
    }

    @Test
    void ignoresNegativeValuesQuota14() {
        OchreQuarry subject = new OchreQuarry();
        subject.brace14(3);
        assertEquals(3, subject.brace14(-2));
        assertEquals(3, subject.threshold14Value());
    }

    @Test
    void rejectsZeroDenominatorWeight15() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.gauge15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight15() {
        assertEquals(0.5, new OchreQuarry().gauge15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight15() {
        assertEquals(1.0, new OchreQuarry().gauge15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth16() {
        assertTrue(new OchreQuarry().temper16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new OchreQuarry().temper16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth16() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreQuarry().temper16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan17() {
        assertEquals("below", new OchreQuarry().sift17(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan17() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.sift17(3));
        assertEquals("upper-bound", subject.sift17(12));
    }

    @Test
    void classifiesWithinAndAboveSpan17() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.sift17(3 + 1));
        assertEquals("above", subject.sift17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity18() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift18());
        }
        assertEquals(3, subject.cadence18Count());
    }

    @Test
    void refusesOnceExhaustedCapacity18() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 3; i++) {
            subject.sift18();
        }
        assertFalse(subject.sift18());
    }

    @Test
    void accumulatesBelowTheCapTally19() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.temper19(1));
        assertEquals(3, subject.temper19(2));
    }

    @Test
    void saturatesAtTheCapTally19() {
        OchreQuarry subject = new OchreQuarry();
        subject.temper19(39);
        assertEquals(39, subject.temper19(5));
    }

    @Test
    void ignoresNegativeValuesTally19() {
        OchreQuarry subject = new OchreQuarry();
        subject.temper19(3);
        assertEquals(3, subject.temper19(-2));
        assertEquals(3, subject.weight19Value());
    }

    @Test
    void rejectsZeroDenominatorRatio20() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.temper20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio20() {
        assertEquals(0.5, new OchreQuarry().temper20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio20() {
        assertEquals(1.0, new OchreQuarry().temper20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift21() {
        assertTrue(new OchreQuarry().winnow21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new OchreQuarry().winnow21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift21() {
        assertEquals(java.util.Arrays.asList(9),
                new OchreQuarry().winnow21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity22() {
        assertEquals("below", new OchreQuarry().tally22(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity22() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.tally22(4));
        assertEquals("upper-bound", subject.tally22(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity22() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.tally22(4 + 1));
        assertEquals("above", subject.tally22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield23() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace23());
        }
        assertEquals(4, subject.depth23Count());
    }

    @Test
    void refusesOnceExhaustedYield23() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 4; i++) {
            subject.brace23();
        }
        assertFalse(subject.brace23());
    }

    @Test
    void accumulatesBelowTheCapDepth24() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.collate24(1));
        assertEquals(3, subject.collate24(2));
    }

    @Test
    void saturatesAtTheCapDepth24() {
        OchreQuarry subject = new OchreQuarry();
        subject.collate24(44);
        assertEquals(44, subject.collate24(5));
    }

    @Test
    void ignoresNegativeValuesDepth24() {
        OchreQuarry subject = new OchreQuarry();
        subject.collate24(3);
        assertEquals(3, subject.collate24(-2));
        assertEquals(3, subject.tally24Value());
    }

    @Test
    void rejectsZeroDenominatorQuota25() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.flatten25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota25() {
        assertEquals(0.5, new OchreQuarry().flatten25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota25() {
        assertEquals(1.0, new OchreQuarry().flatten25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan26() {
        assertTrue(new OchreQuarry().furl26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new OchreQuarry().furl26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan26() {
        assertEquals(java.util.Arrays.asList(14),
                new OchreQuarry().furl26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence27() {
        assertEquals("below", new OchreQuarry().reconcile27(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence27() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.reconcile27(5));
        assertEquals("upper-bound", subject.reconcile27(10));
    }

    @Test
    void classifiesWithinAndAboveCadence27() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.reconcile27(5 + 1));
        assertEquals("above", subject.reconcile27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin28() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally28());
        }
        assertEquals(1, subject.ratio28Count());
    }

    @Test
    void refusesOnceExhaustedMargin28() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 1; i++) {
            subject.tally28();
        }
        assertFalse(subject.tally28());
    }

    @Test
    void accumulatesBelowTheCapCapacity29() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.temper29(1));
        assertEquals(3, subject.temper29(2));
    }

    @Test
    void saturatesAtTheCapCapacity29() {
        OchreQuarry subject = new OchreQuarry();
        subject.temper29(49);
        assertEquals(49, subject.temper29(5));
    }

    @Test
    void ignoresNegativeValuesCapacity29() {
        OchreQuarry subject = new OchreQuarry();
        subject.temper29(3);
        assertEquals(3, subject.temper29(-2));
        assertEquals(3, subject.weight29Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity30() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.winnow30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity30() {
        assertEquals(0.5, new OchreQuarry().winnow30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity30() {
        assertEquals(1.0, new OchreQuarry().winnow30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota31() {
        assertTrue(new OchreQuarry().gauge31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new OchreQuarry().gauge31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota31() {
        assertEquals(java.util.Arrays.asList(10),
                new OchreQuarry().gauge31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias32() {
        assertEquals("below", new OchreQuarry().collate32(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias32() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.collate32(2));
        assertEquals("upper-bound", subject.collate32(9));
    }

    @Test
    void classifiesWithinAndAboveBias32() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.collate32(2 + 1));
        assertEquals("above", subject.collate32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth33() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal33());
        }
        assertEquals(2, subject.capacity33Count());
    }

    @Test
    void refusesOnceExhaustedDepth33() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 2; i++) {
            subject.anneal33();
        }
        assertFalse(subject.anneal33());
    }

    @Test
    void accumulatesBelowTheCapTally34() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.sift34(1));
        assertEquals(3, subject.sift34(2));
    }

    @Test
    void saturatesAtTheCapTally34() {
        OchreQuarry subject = new OchreQuarry();
        subject.sift34(54);
        assertEquals(54, subject.sift34(5));
    }

    @Test
    void ignoresNegativeValuesTally34() {
        OchreQuarry subject = new OchreQuarry();
        subject.sift34(3);
        assertEquals(3, subject.sift34(-2));
        assertEquals(3, subject.yield34Value());
    }

    @Test
    void rejectsZeroDenominatorQuota35() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.tally35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota35() {
        assertEquals(0.5, new OchreQuarry().tally35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota35() {
        assertEquals(1.0, new OchreQuarry().tally35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift36() {
        assertTrue(new OchreQuarry().sift36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new OchreQuarry().sift36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift36() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreQuarry().sift36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset37() {
        assertEquals("below", new OchreQuarry().prune37(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset37() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.prune37(3));
        assertEquals("upper-bound", subject.prune37(8));
    }

    @Test
    void classifiesWithinAndAboveOffset37() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.prune37(3 + 1));
        assertEquals("above", subject.prune37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin38() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle38());
        }
        assertEquals(3, subject.weight38Count());
    }

    @Test
    void refusesOnceExhaustedMargin38() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 3; i++) {
            subject.kindle38();
        }
        assertFalse(subject.kindle38());
    }

    @Test
    void accumulatesBelowTheCapMargin39() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.collate39(1));
        assertEquals(3, subject.collate39(2));
    }

    @Test
    void saturatesAtTheCapMargin39() {
        OchreQuarry subject = new OchreQuarry();
        subject.collate39(59);
        assertEquals(59, subject.collate39(5));
    }

    @Test
    void ignoresNegativeValuesMargin39() {
        OchreQuarry subject = new OchreQuarry();
        subject.collate39(3);
        assertEquals(3, subject.collate39(-2));
        assertEquals(3, subject.quota39Value());
    }

    @Test
    void rejectsZeroDenominatorDepth40() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.tally40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth40() {
        assertEquals(0.5, new OchreQuarry().tally40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth40() {
        assertEquals(1.0, new OchreQuarry().tally40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift41() {
        assertTrue(new OchreQuarry().furl41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new OchreQuarry().furl41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift41() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreQuarry().furl41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold42() {
        assertEquals("below", new OchreQuarry().brace42(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold42() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.brace42(4));
        assertEquals("upper-bound", subject.brace42(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold42() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.brace42(4 + 1));
        assertEquals("above", subject.brace42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio43() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper43());
        }
        assertEquals(4, subject.offset43Count());
    }

    @Test
    void refusesOnceExhaustedRatio43() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 4; i++) {
            subject.temper43();
        }
        assertFalse(subject.temper43());
    }

    @Test
    void accumulatesBelowTheCapDrift44() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.gauge44(1));
        assertEquals(3, subject.gauge44(2));
    }

    @Test
    void saturatesAtTheCapDrift44() {
        OchreQuarry subject = new OchreQuarry();
        subject.gauge44(24);
        assertEquals(24, subject.gauge44(5));
    }

    @Test
    void ignoresNegativeValuesDrift44() {
        OchreQuarry subject = new OchreQuarry();
        subject.gauge44(3);
        assertEquals(3, subject.gauge44(-2));
        assertEquals(3, subject.weight44Value());
    }

    @Test
    void rejectsZeroDenominatorYield45() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.furl45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield45() {
        assertEquals(0.5, new OchreQuarry().furl45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield45() {
        assertEquals(1.0, new OchreQuarry().furl45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield46() {
        assertTrue(new OchreQuarry().furl46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new OchreQuarry().furl46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield46() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreQuarry().furl46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold47() {
        assertEquals("below", new OchreQuarry().sift47(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold47() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.sift47(5));
        assertEquals("upper-bound", subject.sift47(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold47() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.sift47(5 + 1));
        assertEquals("above", subject.sift47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence48() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace48());
        }
        assertEquals(1, subject.capacity48Count());
    }

    @Test
    void refusesOnceExhaustedCadence48() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 1; i++) {
            subject.brace48();
        }
        assertFalse(subject.brace48());
    }

    @Test
    void accumulatesBelowTheCapDepth49() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.furl49(1));
        assertEquals(3, subject.furl49(2));
    }

    @Test
    void saturatesAtTheCapDepth49() {
        OchreQuarry subject = new OchreQuarry();
        subject.furl49(29);
        assertEquals(29, subject.furl49(5));
    }

    @Test
    void ignoresNegativeValuesDepth49() {
        OchreQuarry subject = new OchreQuarry();
        subject.furl49(3);
        assertEquals(3, subject.furl49(-2));
        assertEquals(3, subject.threshold49Value());
    }

    @Test
    void rejectsZeroDenominatorRatio50() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.temper50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio50() {
        assertEquals(0.5, new OchreQuarry().temper50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio50() {
        assertEquals(1.0, new OchreQuarry().temper50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias51() {
        assertTrue(new OchreQuarry().anneal51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new OchreQuarry().anneal51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias51() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreQuarry().anneal51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota52() {
        assertEquals("below", new OchreQuarry().anneal52(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota52() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.anneal52(2));
        assertEquals("upper-bound", subject.anneal52(11));
    }

    @Test
    void classifiesWithinAndAboveQuota52() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.anneal52(2 + 1));
        assertEquals("above", subject.anneal52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence53() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist53());
        }
        assertEquals(2, subject.bias53Count());
    }

    @Test
    void refusesOnceExhaustedCadence53() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 2; i++) {
            subject.hoist53();
        }
        assertFalse(subject.hoist53());
    }

    @Test
    void accumulatesBelowTheCapDepth54() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.flatten54(1));
        assertEquals(3, subject.flatten54(2));
    }

    @Test
    void saturatesAtTheCapDepth54() {
        OchreQuarry subject = new OchreQuarry();
        subject.flatten54(34);
        assertEquals(34, subject.flatten54(5));
    }

    @Test
    void ignoresNegativeValuesDepth54() {
        OchreQuarry subject = new OchreQuarry();
        subject.flatten54(3);
        assertEquals(3, subject.flatten54(-2));
        assertEquals(3, subject.weight54Value());
    }

    @Test
    void rejectsZeroDenominatorBias55() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.sift55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias55() {
        assertEquals(0.5, new OchreQuarry().sift55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias55() {
        assertEquals(1.0, new OchreQuarry().sift55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield56() {
        assertTrue(new OchreQuarry().furl56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new OchreQuarry().furl56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield56() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreQuarry().furl56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence57() {
        assertEquals("below", new OchreQuarry().brace57(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence57() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.brace57(3));
        assertEquals("upper-bound", subject.brace57(10));
    }

    @Test
    void classifiesWithinAndAboveCadence57() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.brace57(3 + 1));
        assertEquals("above", subject.brace57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth58() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate58());
        }
        assertEquals(3, subject.weight58Count());
    }

    @Test
    void refusesOnceExhaustedDepth58() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 3; i++) {
            subject.collate58();
        }
        assertFalse(subject.collate58());
    }

    @Test
    void accumulatesBelowTheCapTally59() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.kindle59(1));
        assertEquals(3, subject.kindle59(2));
    }

    @Test
    void saturatesAtTheCapTally59() {
        OchreQuarry subject = new OchreQuarry();
        subject.kindle59(39);
        assertEquals(39, subject.kindle59(5));
    }

    @Test
    void ignoresNegativeValuesTally59() {
        OchreQuarry subject = new OchreQuarry();
        subject.kindle59(3);
        assertEquals(3, subject.kindle59(-2));
        assertEquals(3, subject.margin59Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity60() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.winnow60(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity60() {
        assertEquals(0.5, new OchreQuarry().winnow60(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity60() {
        assertEquals(1.0, new OchreQuarry().winnow60(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift61() {
        assertTrue(new OchreQuarry().brace61(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift61() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new OchreQuarry().brace61(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift61() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreQuarry().brace61(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota62() {
        assertEquals("below", new OchreQuarry().reconcile62(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota62() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.reconcile62(4));
        assertEquals("upper-bound", subject.reconcile62(9));
    }

    @Test
    void classifiesWithinAndAboveQuota62() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.reconcile62(4 + 1));
        assertEquals("above", subject.reconcile62(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota63() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper63());
        }
        assertEquals(4, subject.capacity63Count());
    }

    @Test
    void refusesOnceExhaustedQuota63() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 4; i++) {
            subject.temper63();
        }
        assertFalse(subject.temper63());
    }

    @Test
    void accumulatesBelowTheCapTally64() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.winnow64(1));
        assertEquals(3, subject.winnow64(2));
    }

    @Test
    void saturatesAtTheCapTally64() {
        OchreQuarry subject = new OchreQuarry();
        subject.winnow64(44);
        assertEquals(44, subject.winnow64(5));
    }

    @Test
    void ignoresNegativeValuesTally64() {
        OchreQuarry subject = new OchreQuarry();
        subject.winnow64(3);
        assertEquals(3, subject.winnow64(-2));
        assertEquals(3, subject.bias64Value());
    }

    @Test
    void rejectsZeroDenominatorYield65() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.winnow65(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield65() {
        assertEquals(0.5, new OchreQuarry().winnow65(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield65() {
        assertEquals(1.0, new OchreQuarry().winnow65(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth66() {
        assertTrue(new OchreQuarry().furl66(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth66() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new OchreQuarry().furl66(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth66() {
        assertEquals(java.util.Arrays.asList(9),
                new OchreQuarry().furl66(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift67() {
        assertEquals("below", new OchreQuarry().temper67(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift67() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.temper67(5));
        assertEquals("upper-bound", subject.temper67(8));
    }

    @Test
    void classifiesWithinAndAboveDrift67() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.temper67(5 + 1));
        assertEquals("above", subject.temper67(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias68() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift68());
        }
        assertEquals(1, subject.weight68Count());
    }

    @Test
    void refusesOnceExhaustedBias68() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 1; i++) {
            subject.sift68();
        }
        assertFalse(subject.sift68());
    }

    @Test
    void accumulatesBelowTheCapOffset69() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.temper69(1));
        assertEquals(3, subject.temper69(2));
    }

    @Test
    void saturatesAtTheCapOffset69() {
        OchreQuarry subject = new OchreQuarry();
        subject.temper69(49);
        assertEquals(49, subject.temper69(5));
    }

    @Test
    void ignoresNegativeValuesOffset69() {
        OchreQuarry subject = new OchreQuarry();
        subject.temper69(3);
        assertEquals(3, subject.temper69(-2));
        assertEquals(3, subject.capacity69Value());
    }

    @Test
    void rejectsZeroDenominatorDrift70() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.prune70(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift70() {
        assertEquals(0.5, new OchreQuarry().prune70(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift70() {
        assertEquals(1.0, new OchreQuarry().prune70(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence71() {
        assertTrue(new OchreQuarry().sift71(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence71() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new OchreQuarry().sift71(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence71() {
        assertEquals(java.util.Arrays.asList(14),
                new OchreQuarry().sift71(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally72() {
        assertEquals("below", new OchreQuarry().reconcile72(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally72() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.reconcile72(2));
        assertEquals("upper-bound", subject.reconcile72(7));
    }

    @Test
    void classifiesWithinAndAboveTally72() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.reconcile72(2 + 1));
        assertEquals("above", subject.reconcile72(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight73() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl73());
        }
        assertEquals(2, subject.bias73Count());
    }

    @Test
    void refusesOnceExhaustedWeight73() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 2; i++) {
            subject.furl73();
        }
        assertFalse(subject.furl73());
    }

    @Test
    void accumulatesBelowTheCapQuota74() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.tally74(1));
        assertEquals(3, subject.tally74(2));
    }

    @Test
    void saturatesAtTheCapQuota74() {
        OchreQuarry subject = new OchreQuarry();
        subject.tally74(54);
        assertEquals(54, subject.tally74(5));
    }

    @Test
    void ignoresNegativeValuesQuota74() {
        OchreQuarry subject = new OchreQuarry();
        subject.tally74(3);
        assertEquals(3, subject.tally74(-2));
        assertEquals(3, subject.yield74Value());
    }

    @Test
    void rejectsZeroDenominatorYield75() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.gauge75(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield75() {
        assertEquals(0.5, new OchreQuarry().gauge75(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield75() {
        assertEquals(1.0, new OchreQuarry().gauge75(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally76() {
        assertTrue(new OchreQuarry().prune76(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally76() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new OchreQuarry().prune76(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally76() {
        assertEquals(java.util.Arrays.asList(10),
                new OchreQuarry().prune76(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan77() {
        assertEquals("below", new OchreQuarry().sift77(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan77() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.sift77(3));
        assertEquals("upper-bound", subject.sift77(12));
    }

    @Test
    void classifiesWithinAndAboveSpan77() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.sift77(3 + 1));
        assertEquals("above", subject.sift77(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota78() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift78());
        }
        assertEquals(3, subject.threshold78Count());
    }

    @Test
    void refusesOnceExhaustedQuota78() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 3; i++) {
            subject.sift78();
        }
        assertFalse(subject.sift78());
    }

    @Test
    void accumulatesBelowTheCapMargin79() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.collate79(1));
        assertEquals(3, subject.collate79(2));
    }

    @Test
    void saturatesAtTheCapMargin79() {
        OchreQuarry subject = new OchreQuarry();
        subject.collate79(59);
        assertEquals(59, subject.collate79(5));
    }

    @Test
    void ignoresNegativeValuesMargin79() {
        OchreQuarry subject = new OchreQuarry();
        subject.collate79(3);
        assertEquals(3, subject.collate79(-2));
        assertEquals(3, subject.span79Value());
    }

    @Test
    void rejectsZeroDenominatorMargin80() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.furl80(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin80() {
        assertEquals(0.5, new OchreQuarry().furl80(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin80() {
        assertEquals(1.0, new OchreQuarry().furl80(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold81() {
        assertTrue(new OchreQuarry().sift81(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold81() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new OchreQuarry().sift81(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold81() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreQuarry().sift81(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan82() {
        assertEquals("below", new OchreQuarry().flatten82(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan82() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.flatten82(4));
        assertEquals("upper-bound", subject.flatten82(11));
    }

    @Test
    void classifiesWithinAndAboveSpan82() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.flatten82(4 + 1));
        assertEquals("above", subject.flatten82(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold83() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper83());
        }
        assertEquals(4, subject.quota83Count());
    }

    @Test
    void refusesOnceExhaustedThreshold83() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 4; i++) {
            subject.temper83();
        }
        assertFalse(subject.temper83());
    }

    @Test
    void accumulatesBelowTheCapMargin84() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.gauge84(1));
        assertEquals(3, subject.gauge84(2));
    }

    @Test
    void saturatesAtTheCapMargin84() {
        OchreQuarry subject = new OchreQuarry();
        subject.gauge84(24);
        assertEquals(24, subject.gauge84(5));
    }

    @Test
    void ignoresNegativeValuesMargin84() {
        OchreQuarry subject = new OchreQuarry();
        subject.gauge84(3);
        assertEquals(3, subject.gauge84(-2));
        assertEquals(3, subject.offset84Value());
    }

    @Test
    void rejectsZeroDenominatorBias85() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.prune85(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias85() {
        assertEquals(0.5, new OchreQuarry().prune85(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias85() {
        assertEquals(1.0, new OchreQuarry().prune85(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin86() {
        assertTrue(new OchreQuarry().furl86(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin86() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new OchreQuarry().furl86(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin86() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreQuarry().furl86(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio87() {
        assertEquals("below", new OchreQuarry().sift87(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio87() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.sift87(5));
        assertEquals("upper-bound", subject.sift87(10));
    }

    @Test
    void classifiesWithinAndAboveRatio87() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.sift87(5 + 1));
        assertEquals("above", subject.sift87(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio88() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally88());
        }
        assertEquals(1, subject.drift88Count());
    }

    @Test
    void refusesOnceExhaustedRatio88() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 1; i++) {
            subject.tally88();
        }
        assertFalse(subject.tally88());
    }

    @Test
    void accumulatesBelowTheCapBias89() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.kindle89(1));
        assertEquals(3, subject.kindle89(2));
    }

    @Test
    void saturatesAtTheCapBias89() {
        OchreQuarry subject = new OchreQuarry();
        subject.kindle89(29);
        assertEquals(29, subject.kindle89(5));
    }

    @Test
    void ignoresNegativeValuesBias89() {
        OchreQuarry subject = new OchreQuarry();
        subject.kindle89(3);
        assertEquals(3, subject.kindle89(-2));
        assertEquals(3, subject.capacity89Value());
    }

    @Test
    void rejectsZeroDenominatorOffset90() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile90(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset90() {
        assertEquals(0.5, new OchreQuarry().reconcile90(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset90() {
        assertEquals(1.0, new OchreQuarry().reconcile90(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift91() {
        assertTrue(new OchreQuarry().flatten91(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift91() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new OchreQuarry().flatten91(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift91() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreQuarry().flatten91(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio92() {
        assertEquals("below", new OchreQuarry().collate92(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio92() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.collate92(2));
        assertEquals("upper-bound", subject.collate92(9));
    }

    @Test
    void classifiesWithinAndAboveRatio92() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.collate92(2 + 1));
        assertEquals("above", subject.collate92(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota93() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow93());
        }
        assertEquals(2, subject.ratio93Count());
    }

    @Test
    void refusesOnceExhaustedQuota93() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 2; i++) {
            subject.winnow93();
        }
        assertFalse(subject.winnow93());
    }

    @Test
    void accumulatesBelowTheCapQuota94() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.gauge94(1));
        assertEquals(3, subject.gauge94(2));
    }

    @Test
    void saturatesAtTheCapQuota94() {
        OchreQuarry subject = new OchreQuarry();
        subject.gauge94(34);
        assertEquals(34, subject.gauge94(5));
    }

    @Test
    void ignoresNegativeValuesQuota94() {
        OchreQuarry subject = new OchreQuarry();
        subject.gauge94(3);
        assertEquals(3, subject.gauge94(-2));
        assertEquals(3, subject.capacity94Value());
    }

    @Test
    void rejectsZeroDenominatorDepth95() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.collate95(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth95() {
        assertEquals(0.5, new OchreQuarry().collate95(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth95() {
        assertEquals(1.0, new OchreQuarry().collate95(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias96() {
        assertTrue(new OchreQuarry().kindle96(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias96() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new OchreQuarry().kindle96(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias96() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreQuarry().kindle96(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence97() {
        assertEquals("below", new OchreQuarry().hoist97(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence97() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.hoist97(3));
        assertEquals("upper-bound", subject.hoist97(8));
    }

    @Test
    void classifiesWithinAndAboveCadence97() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.hoist97(3 + 1));
        assertEquals("above", subject.hoist97(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota98() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl98());
        }
        assertEquals(3, subject.offset98Count());
    }

    @Test
    void refusesOnceExhaustedQuota98() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 3; i++) {
            subject.furl98();
        }
        assertFalse(subject.furl98());
    }

    @Test
    void accumulatesBelowTheCapThreshold99() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.prune99(1));
        assertEquals(3, subject.prune99(2));
    }

    @Test
    void saturatesAtTheCapThreshold99() {
        OchreQuarry subject = new OchreQuarry();
        subject.prune99(39);
        assertEquals(39, subject.prune99(5));
    }

    @Test
    void ignoresNegativeValuesThreshold99() {
        OchreQuarry subject = new OchreQuarry();
        subject.prune99(3);
        assertEquals(3, subject.prune99(-2));
        assertEquals(3, subject.capacity99Value());
    }

    @Test
    void rejectsZeroDenominatorSpan100() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile100(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan100() {
        assertEquals(0.5, new OchreQuarry().reconcile100(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan100() {
        assertEquals(1.0, new OchreQuarry().reconcile100(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift101() {
        assertTrue(new OchreQuarry().flatten101(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift101() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new OchreQuarry().flatten101(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift101() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreQuarry().flatten101(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally102() {
        assertEquals("below", new OchreQuarry().temper102(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally102() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.temper102(4));
        assertEquals("upper-bound", subject.temper102(7));
    }

    @Test
    void classifiesWithinAndAboveTally102() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.temper102(4 + 1));
        assertEquals("above", subject.temper102(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift103() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl103());
        }
        assertEquals(4, subject.offset103Count());
    }

    @Test
    void refusesOnceExhaustedDrift103() {
        OchreQuarry subject = new OchreQuarry();
        for (int i = 0; i < 4; i++) {
            subject.furl103();
        }
        assertFalse(subject.furl103());
    }

    @Test
    void accumulatesBelowTheCapBias104() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals(1, subject.winnow104(1));
        assertEquals(3, subject.winnow104(2));
    }

    @Test
    void saturatesAtTheCapBias104() {
        OchreQuarry subject = new OchreQuarry();
        subject.winnow104(44);
        assertEquals(44, subject.winnow104(5));
    }

    @Test
    void ignoresNegativeValuesBias104() {
        OchreQuarry subject = new OchreQuarry();
        subject.winnow104(3);
        assertEquals(3, subject.winnow104(-2));
        assertEquals(3, subject.cadence104Value());
    }

    @Test
    void rejectsZeroDenominatorBias105() {
        OchreQuarry subject = new OchreQuarry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile105(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias105() {
        assertEquals(0.5, new OchreQuarry().reconcile105(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias105() {
        assertEquals(1.0, new OchreQuarry().reconcile105(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield106() {
        assertTrue(new OchreQuarry().gauge106(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield106() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new OchreQuarry().gauge106(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield106() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreQuarry().gauge106(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio107() {
        assertEquals("below", new OchreQuarry().gauge107(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio107() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("lower-bound", subject.gauge107(5));
        assertEquals("upper-bound", subject.gauge107(12));
    }

    @Test
    void classifiesWithinAndAboveRatio107() {
        OchreQuarry subject = new OchreQuarry();
        assertEquals("within", subject.gauge107(5 + 1));
        assertEquals("above", subject.gauge107(12 + 1));
    }
}
