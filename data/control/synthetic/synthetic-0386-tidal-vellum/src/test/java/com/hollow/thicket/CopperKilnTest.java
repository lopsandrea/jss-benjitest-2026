package com.hollow.thicket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperKilnTest {

    @Test
    void rejectsZeroDenominatorThreshold0() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold0() {
        assertEquals(0.5, new CopperKiln().kindle0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold0() {
        assertEquals(1.0, new CopperKiln().kindle0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota1() {
        assertTrue(new CopperKiln().flatten1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperKiln().flatten1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota1() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperKiln().flatten1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally2() {
        assertEquals("below", new CopperKiln().brace2(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally2() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.brace2(4));
        assertEquals("upper-bound", subject.brace2(9));
    }

    @Test
    void classifiesWithinAndAboveTally2() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.brace2(4 + 1));
        assertEquals("above", subject.brace2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence3() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl3());
        }
        assertEquals(4, subject.tally3Count());
    }

    @Test
    void refusesOnceExhaustedCadence3() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 4; i++) {
            subject.furl3();
        }
        assertFalse(subject.furl3());
    }

    @Test
    void accumulatesBelowTheCapYield4() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.flatten4(1));
        assertEquals(3, subject.flatten4(2));
    }

    @Test
    void saturatesAtTheCapYield4() {
        CopperKiln subject = new CopperKiln();
        subject.flatten4(24);
        assertEquals(24, subject.flatten4(5));
    }

    @Test
    void ignoresNegativeValuesYield4() {
        CopperKiln subject = new CopperKiln();
        subject.flatten4(3);
        assertEquals(3, subject.flatten4(-2));
        assertEquals(3, subject.threshold4Value());
    }

    @Test
    void rejectsZeroDenominatorQuota5() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota5() {
        assertEquals(0.5, new CopperKiln().tally5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota5() {
        assertEquals(1.0, new CopperKiln().tally5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias6() {
        assertTrue(new CopperKiln().hoist6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new CopperKiln().hoist6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias6() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperKiln().hoist6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold7() {
        assertEquals("below", new CopperKiln().anneal7(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold7() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.anneal7(5));
        assertEquals("upper-bound", subject.anneal7(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold7() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.anneal7(5 + 1));
        assertEquals("above", subject.anneal7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence8() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge8());
        }
        assertEquals(1, subject.span8Count());
    }

    @Test
    void refusesOnceExhaustedCadence8() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 1; i++) {
            subject.gauge8();
        }
        assertFalse(subject.gauge8());
    }

    @Test
    void accumulatesBelowTheCapThreshold9() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.prune9(1));
        assertEquals(3, subject.prune9(2));
    }

    @Test
    void saturatesAtTheCapThreshold9() {
        CopperKiln subject = new CopperKiln();
        subject.prune9(29);
        assertEquals(29, subject.prune9(5));
    }

    @Test
    void ignoresNegativeValuesThreshold9() {
        CopperKiln subject = new CopperKiln();
        subject.prune9(3);
        assertEquals(3, subject.prune9(-2));
        assertEquals(3, subject.offset9Value());
    }

    @Test
    void rejectsZeroDenominatorMargin10() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.collate10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin10() {
        assertEquals(0.5, new CopperKiln().collate10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin10() {
        assertEquals(1.0, new CopperKiln().collate10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield11() {
        assertTrue(new CopperKiln().furl11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new CopperKiln().furl11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield11() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperKiln().furl11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias12() {
        assertEquals("below", new CopperKiln().tally12(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias12() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.tally12(2));
        assertEquals("upper-bound", subject.tally12(7));
    }

    @Test
    void classifiesWithinAndAboveBias12() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.tally12(2 + 1));
        assertEquals("above", subject.tally12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias13() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle13());
        }
        assertEquals(2, subject.drift13Count());
    }

    @Test
    void refusesOnceExhaustedBias13() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 2; i++) {
            subject.kindle13();
        }
        assertFalse(subject.kindle13());
    }

    @Test
    void accumulatesBelowTheCapSpan14() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.gauge14(1));
        assertEquals(3, subject.gauge14(2));
    }

    @Test
    void saturatesAtTheCapSpan14() {
        CopperKiln subject = new CopperKiln();
        subject.gauge14(34);
        assertEquals(34, subject.gauge14(5));
    }

    @Test
    void ignoresNegativeValuesSpan14() {
        CopperKiln subject = new CopperKiln();
        subject.gauge14(3);
        assertEquals(3, subject.gauge14(-2));
        assertEquals(3, subject.weight14Value());
    }

    @Test
    void rejectsZeroDenominatorOffset15() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.collate15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset15() {
        assertEquals(0.5, new CopperKiln().collate15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset15() {
        assertEquals(1.0, new CopperKiln().collate15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota16() {
        assertTrue(new CopperKiln().sift16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new CopperKiln().sift16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota16() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperKiln().sift16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio17() {
        assertEquals("below", new CopperKiln().kindle17(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio17() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.kindle17(3));
        assertEquals("upper-bound", subject.kindle17(12));
    }

    @Test
    void classifiesWithinAndAboveRatio17() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.kindle17(3 + 1));
        assertEquals("above", subject.kindle17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally18() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile18());
        }
        assertEquals(3, subject.yield18Count());
    }

    @Test
    void refusesOnceExhaustedTally18() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 3; i++) {
            subject.reconcile18();
        }
        assertFalse(subject.reconcile18());
    }

    @Test
    void accumulatesBelowTheCapOffset19() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.reconcile19(1));
        assertEquals(3, subject.reconcile19(2));
    }

    @Test
    void saturatesAtTheCapOffset19() {
        CopperKiln subject = new CopperKiln();
        subject.reconcile19(39);
        assertEquals(39, subject.reconcile19(5));
    }

    @Test
    void ignoresNegativeValuesOffset19() {
        CopperKiln subject = new CopperKiln();
        subject.reconcile19(3);
        assertEquals(3, subject.reconcile19(-2));
        assertEquals(3, subject.threshold19Value());
    }

    @Test
    void rejectsZeroDenominatorDepth20() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.collate20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth20() {
        assertEquals(0.5, new CopperKiln().collate20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth20() {
        assertEquals(1.0, new CopperKiln().collate20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan21() {
        assertTrue(new CopperKiln().brace21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new CopperKiln().brace21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan21() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperKiln().brace21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin22() {
        assertEquals("below", new CopperKiln().brace22(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin22() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.brace22(4));
        assertEquals("upper-bound", subject.brace22(11));
    }

    @Test
    void classifiesWithinAndAboveMargin22() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.brace22(4 + 1));
        assertEquals("above", subject.brace22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity23() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile23());
        }
        assertEquals(4, subject.tally23Count());
    }

    @Test
    void refusesOnceExhaustedCapacity23() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 4; i++) {
            subject.reconcile23();
        }
        assertFalse(subject.reconcile23());
    }

    @Test
    void accumulatesBelowTheCapYield24() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.temper24(1));
        assertEquals(3, subject.temper24(2));
    }

    @Test
    void saturatesAtTheCapYield24() {
        CopperKiln subject = new CopperKiln();
        subject.temper24(44);
        assertEquals(44, subject.temper24(5));
    }

    @Test
    void ignoresNegativeValuesYield24() {
        CopperKiln subject = new CopperKiln();
        subject.temper24(3);
        assertEquals(3, subject.temper24(-2));
        assertEquals(3, subject.ratio24Value());
    }

    @Test
    void rejectsZeroDenominatorCadence25() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence25() {
        assertEquals(0.5, new CopperKiln().sift25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence25() {
        assertEquals(1.0, new CopperKiln().sift25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold26() {
        assertTrue(new CopperKiln().temper26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new CopperKiln().temper26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold26() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperKiln().temper26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift27() {
        assertEquals("below", new CopperKiln().temper27(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift27() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.temper27(5));
        assertEquals("upper-bound", subject.temper27(10));
    }

    @Test
    void classifiesWithinAndAboveDrift27() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.temper27(5 + 1));
        assertEquals("above", subject.temper27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin28() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge28());
        }
        assertEquals(1, subject.weight28Count());
    }

    @Test
    void refusesOnceExhaustedMargin28() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 1; i++) {
            subject.gauge28();
        }
        assertFalse(subject.gauge28());
    }

    @Test
    void accumulatesBelowTheCapDrift29() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.hoist29(1));
        assertEquals(3, subject.hoist29(2));
    }

    @Test
    void saturatesAtTheCapDrift29() {
        CopperKiln subject = new CopperKiln();
        subject.hoist29(49);
        assertEquals(49, subject.hoist29(5));
    }

    @Test
    void ignoresNegativeValuesDrift29() {
        CopperKiln subject = new CopperKiln();
        subject.hoist29(3);
        assertEquals(3, subject.hoist29(-2));
        assertEquals(3, subject.offset29Value());
    }

    @Test
    void rejectsZeroDenominatorTally30() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally30() {
        assertEquals(0.5, new CopperKiln().tally30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally30() {
        assertEquals(1.0, new CopperKiln().tally30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence31() {
        assertTrue(new CopperKiln().kindle31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new CopperKiln().kindle31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence31() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperKiln().kindle31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan32() {
        assertEquals("below", new CopperKiln().gauge32(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan32() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.gauge32(2));
        assertEquals("upper-bound", subject.gauge32(9));
    }

    @Test
    void classifiesWithinAndAboveSpan32() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.gauge32(2 + 1));
        assertEquals("above", subject.gauge32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield33() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune33());
        }
        assertEquals(2, subject.capacity33Count());
    }

    @Test
    void refusesOnceExhaustedYield33() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 2; i++) {
            subject.prune33();
        }
        assertFalse(subject.prune33());
    }

    @Test
    void accumulatesBelowTheCapDrift34() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.gauge34(1));
        assertEquals(3, subject.gauge34(2));
    }

    @Test
    void saturatesAtTheCapDrift34() {
        CopperKiln subject = new CopperKiln();
        subject.gauge34(54);
        assertEquals(54, subject.gauge34(5));
    }

    @Test
    void ignoresNegativeValuesDrift34() {
        CopperKiln subject = new CopperKiln();
        subject.gauge34(3);
        assertEquals(3, subject.gauge34(-2));
        assertEquals(3, subject.span34Value());
    }

    @Test
    void rejectsZeroDenominatorDepth35() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.flatten35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth35() {
        assertEquals(0.5, new CopperKiln().flatten35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth35() {
        assertEquals(1.0, new CopperKiln().flatten35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold36() {
        assertTrue(new CopperKiln().reconcile36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new CopperKiln().reconcile36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold36() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperKiln().reconcile36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity37() {
        assertEquals("below", new CopperKiln().kindle37(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity37() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.kindle37(3));
        assertEquals("upper-bound", subject.kindle37(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity37() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.kindle37(3 + 1));
        assertEquals("above", subject.kindle37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset38() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge38());
        }
        assertEquals(3, subject.drift38Count());
    }

    @Test
    void refusesOnceExhaustedOffset38() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 3; i++) {
            subject.gauge38();
        }
        assertFalse(subject.gauge38());
    }

    @Test
    void accumulatesBelowTheCapDepth39() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.kindle39(1));
        assertEquals(3, subject.kindle39(2));
    }

    @Test
    void saturatesAtTheCapDepth39() {
        CopperKiln subject = new CopperKiln();
        subject.kindle39(59);
        assertEquals(59, subject.kindle39(5));
    }

    @Test
    void ignoresNegativeValuesDepth39() {
        CopperKiln subject = new CopperKiln();
        subject.kindle39(3);
        assertEquals(3, subject.kindle39(-2));
        assertEquals(3, subject.yield39Value());
    }

    @Test
    void rejectsZeroDenominatorCadence40() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.collate40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence40() {
        assertEquals(0.5, new CopperKiln().collate40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence40() {
        assertEquals(1.0, new CopperKiln().collate40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin41() {
        assertTrue(new CopperKiln().furl41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new CopperKiln().furl41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin41() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperKiln().furl41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias42() {
        assertEquals("below", new CopperKiln().collate42(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias42() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.collate42(4));
        assertEquals("upper-bound", subject.collate42(7));
    }

    @Test
    void classifiesWithinAndAboveBias42() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.collate42(4 + 1));
        assertEquals("above", subject.collate42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin43() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift43());
        }
        assertEquals(4, subject.span43Count());
    }

    @Test
    void refusesOnceExhaustedMargin43() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 4; i++) {
            subject.sift43();
        }
        assertFalse(subject.sift43());
    }

    @Test
    void accumulatesBelowTheCapCapacity44() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.winnow44(1));
        assertEquals(3, subject.winnow44(2));
    }

    @Test
    void saturatesAtTheCapCapacity44() {
        CopperKiln subject = new CopperKiln();
        subject.winnow44(24);
        assertEquals(24, subject.winnow44(5));
    }

    @Test
    void ignoresNegativeValuesCapacity44() {
        CopperKiln subject = new CopperKiln();
        subject.winnow44(3);
        assertEquals(3, subject.winnow44(-2));
        assertEquals(3, subject.weight44Value());
    }

    @Test
    void rejectsZeroDenominatorRatio45() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.flatten45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio45() {
        assertEquals(0.5, new CopperKiln().flatten45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio45() {
        assertEquals(1.0, new CopperKiln().flatten45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold46() {
        assertTrue(new CopperKiln().winnow46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperKiln().winnow46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold46() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperKiln().winnow46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold47() {
        assertEquals("below", new CopperKiln().temper47(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold47() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.temper47(5));
        assertEquals("upper-bound", subject.temper47(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold47() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.temper47(5 + 1));
        assertEquals("above", subject.temper47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan48() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile48());
        }
        assertEquals(1, subject.tally48Count());
    }

    @Test
    void refusesOnceExhaustedSpan48() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 1; i++) {
            subject.reconcile48();
        }
        assertFalse(subject.reconcile48());
    }

    @Test
    void accumulatesBelowTheCapThreshold49() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.furl49(1));
        assertEquals(3, subject.furl49(2));
    }

    @Test
    void saturatesAtTheCapThreshold49() {
        CopperKiln subject = new CopperKiln();
        subject.furl49(29);
        assertEquals(29, subject.furl49(5));
    }

    @Test
    void ignoresNegativeValuesThreshold49() {
        CopperKiln subject = new CopperKiln();
        subject.furl49(3);
        assertEquals(3, subject.furl49(-2));
        assertEquals(3, subject.quota49Value());
    }

    @Test
    void rejectsZeroDenominatorMargin50() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin50() {
        assertEquals(0.5, new CopperKiln().sift50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin50() {
        assertEquals(1.0, new CopperKiln().sift50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio51() {
        assertTrue(new CopperKiln().tally51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new CopperKiln().tally51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio51() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperKiln().tally51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias52() {
        assertEquals("below", new CopperKiln().kindle52(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias52() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.kindle52(2));
        assertEquals("upper-bound", subject.kindle52(11));
    }

    @Test
    void classifiesWithinAndAboveBias52() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.kindle52(2 + 1));
        assertEquals("above", subject.kindle52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift53() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl53());
        }
        assertEquals(2, subject.bias53Count());
    }

    @Test
    void refusesOnceExhaustedDrift53() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 2; i++) {
            subject.furl53();
        }
        assertFalse(subject.furl53());
    }

    @Test
    void accumulatesBelowTheCapMargin54() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.winnow54(1));
        assertEquals(3, subject.winnow54(2));
    }

    @Test
    void saturatesAtTheCapMargin54() {
        CopperKiln subject = new CopperKiln();
        subject.winnow54(34);
        assertEquals(34, subject.winnow54(5));
    }

    @Test
    void ignoresNegativeValuesMargin54() {
        CopperKiln subject = new CopperKiln();
        subject.winnow54(3);
        assertEquals(3, subject.winnow54(-2));
        assertEquals(3, subject.quota54Value());
    }

    @Test
    void rejectsZeroDenominatorYield55() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.temper55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield55() {
        assertEquals(0.5, new CopperKiln().temper55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield55() {
        assertEquals(1.0, new CopperKiln().temper55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio56() {
        assertTrue(new CopperKiln().tally56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new CopperKiln().tally56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio56() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperKiln().tally56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity57() {
        assertEquals("below", new CopperKiln().sift57(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity57() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.sift57(3));
        assertEquals("upper-bound", subject.sift57(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity57() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.sift57(3 + 1));
        assertEquals("above", subject.sift57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift58() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl58());
        }
        assertEquals(3, subject.tally58Count());
    }

    @Test
    void refusesOnceExhaustedDrift58() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 3; i++) {
            subject.furl58();
        }
        assertFalse(subject.furl58());
    }

    @Test
    void accumulatesBelowTheCapQuota59() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.tally59(1));
        assertEquals(3, subject.tally59(2));
    }

    @Test
    void saturatesAtTheCapQuota59() {
        CopperKiln subject = new CopperKiln();
        subject.tally59(39);
        assertEquals(39, subject.tally59(5));
    }

    @Test
    void ignoresNegativeValuesQuota59() {
        CopperKiln subject = new CopperKiln();
        subject.tally59(3);
        assertEquals(3, subject.tally59(-2));
        assertEquals(3, subject.capacity59Value());
    }

    @Test
    void rejectsZeroDenominatorQuota60() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge60(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota60() {
        assertEquals(0.5, new CopperKiln().gauge60(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota60() {
        assertEquals(1.0, new CopperKiln().gauge60(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield61() {
        assertTrue(new CopperKiln().tally61(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield61() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new CopperKiln().tally61(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield61() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperKiln().tally61(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift62() {
        assertEquals("below", new CopperKiln().flatten62(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift62() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.flatten62(4));
        assertEquals("upper-bound", subject.flatten62(9));
    }

    @Test
    void classifiesWithinAndAboveDrift62() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.flatten62(4 + 1));
        assertEquals("above", subject.flatten62(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset63() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift63());
        }
        assertEquals(4, subject.threshold63Count());
    }

    @Test
    void refusesOnceExhaustedOffset63() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 4; i++) {
            subject.sift63();
        }
        assertFalse(subject.sift63());
    }

    @Test
    void accumulatesBelowTheCapThreshold64() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.collate64(1));
        assertEquals(3, subject.collate64(2));
    }

    @Test
    void saturatesAtTheCapThreshold64() {
        CopperKiln subject = new CopperKiln();
        subject.collate64(44);
        assertEquals(44, subject.collate64(5));
    }

    @Test
    void ignoresNegativeValuesThreshold64() {
        CopperKiln subject = new CopperKiln();
        subject.collate64(3);
        assertEquals(3, subject.collate64(-2));
        assertEquals(3, subject.yield64Value());
    }

    @Test
    void rejectsZeroDenominatorWeight65() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge65(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight65() {
        assertEquals(0.5, new CopperKiln().gauge65(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight65() {
        assertEquals(1.0, new CopperKiln().gauge65(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias66() {
        assertTrue(new CopperKiln().tally66(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias66() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new CopperKiln().tally66(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias66() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperKiln().tally66(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan67() {
        assertEquals("below", new CopperKiln().reconcile67(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan67() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.reconcile67(5));
        assertEquals("upper-bound", subject.reconcile67(8));
    }

    @Test
    void classifiesWithinAndAboveSpan67() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.reconcile67(5 + 1));
        assertEquals("above", subject.reconcile67(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth68() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten68());
        }
        assertEquals(1, subject.threshold68Count());
    }

    @Test
    void refusesOnceExhaustedDepth68() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 1; i++) {
            subject.flatten68();
        }
        assertFalse(subject.flatten68());
    }

    @Test
    void accumulatesBelowTheCapSpan69() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.winnow69(1));
        assertEquals(3, subject.winnow69(2));
    }

    @Test
    void saturatesAtTheCapSpan69() {
        CopperKiln subject = new CopperKiln();
        subject.winnow69(49);
        assertEquals(49, subject.winnow69(5));
    }

    @Test
    void ignoresNegativeValuesSpan69() {
        CopperKiln subject = new CopperKiln();
        subject.winnow69(3);
        assertEquals(3, subject.winnow69(-2));
        assertEquals(3, subject.quota69Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold70() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.temper70(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold70() {
        assertEquals(0.5, new CopperKiln().temper70(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold70() {
        assertEquals(1.0, new CopperKiln().temper70(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota71() {
        assertTrue(new CopperKiln().hoist71(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota71() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new CopperKiln().hoist71(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota71() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperKiln().hoist71(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias72() {
        assertEquals("below", new CopperKiln().winnow72(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias72() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.winnow72(2));
        assertEquals("upper-bound", subject.winnow72(7));
    }

    @Test
    void classifiesWithinAndAboveBias72() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.winnow72(2 + 1));
        assertEquals("above", subject.winnow72(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield73() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate73());
        }
        assertEquals(2, subject.cadence73Count());
    }

    @Test
    void refusesOnceExhaustedYield73() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 2; i++) {
            subject.collate73();
        }
        assertFalse(subject.collate73());
    }

    @Test
    void accumulatesBelowTheCapMargin74() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.sift74(1));
        assertEquals(3, subject.sift74(2));
    }

    @Test
    void saturatesAtTheCapMargin74() {
        CopperKiln subject = new CopperKiln();
        subject.sift74(54);
        assertEquals(54, subject.sift74(5));
    }

    @Test
    void ignoresNegativeValuesMargin74() {
        CopperKiln subject = new CopperKiln();
        subject.sift74(3);
        assertEquals(3, subject.sift74(-2));
        assertEquals(3, subject.depth74Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold75() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.furl75(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold75() {
        assertEquals(0.5, new CopperKiln().furl75(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold75() {
        assertEquals(1.0, new CopperKiln().furl75(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio76() {
        assertTrue(new CopperKiln().tally76(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio76() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new CopperKiln().tally76(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio76() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperKiln().tally76(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth77() {
        assertEquals("below", new CopperKiln().flatten77(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth77() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.flatten77(3));
        assertEquals("upper-bound", subject.flatten77(12));
    }

    @Test
    void classifiesWithinAndAboveDepth77() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.flatten77(3 + 1));
        assertEquals("above", subject.flatten77(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield78() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace78());
        }
        assertEquals(3, subject.span78Count());
    }

    @Test
    void refusesOnceExhaustedYield78() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 3; i++) {
            subject.brace78();
        }
        assertFalse(subject.brace78());
    }

    @Test
    void accumulatesBelowTheCapOffset79() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.kindle79(1));
        assertEquals(3, subject.kindle79(2));
    }

    @Test
    void saturatesAtTheCapOffset79() {
        CopperKiln subject = new CopperKiln();
        subject.kindle79(59);
        assertEquals(59, subject.kindle79(5));
    }

    @Test
    void ignoresNegativeValuesOffset79() {
        CopperKiln subject = new CopperKiln();
        subject.kindle79(3);
        assertEquals(3, subject.kindle79(-2));
        assertEquals(3, subject.margin79Value());
    }

    @Test
    void rejectsZeroDenominatorTally80() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow80(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally80() {
        assertEquals(0.5, new CopperKiln().winnow80(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally80() {
        assertEquals(1.0, new CopperKiln().winnow80(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota81() {
        assertTrue(new CopperKiln().temper81(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota81() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new CopperKiln().temper81(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota81() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperKiln().temper81(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence82() {
        assertEquals("below", new CopperKiln().temper82(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence82() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.temper82(4));
        assertEquals("upper-bound", subject.temper82(11));
    }

    @Test
    void classifiesWithinAndAboveCadence82() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.temper82(4 + 1));
        assertEquals("above", subject.temper82(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio83() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge83());
        }
        assertEquals(4, subject.weight83Count());
    }

    @Test
    void refusesOnceExhaustedRatio83() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 4; i++) {
            subject.gauge83();
        }
        assertFalse(subject.gauge83());
    }

    @Test
    void accumulatesBelowTheCapTally84() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.gauge84(1));
        assertEquals(3, subject.gauge84(2));
    }

    @Test
    void saturatesAtTheCapTally84() {
        CopperKiln subject = new CopperKiln();
        subject.gauge84(24);
        assertEquals(24, subject.gauge84(5));
    }

    @Test
    void ignoresNegativeValuesTally84() {
        CopperKiln subject = new CopperKiln();
        subject.gauge84(3);
        assertEquals(3, subject.gauge84(-2));
        assertEquals(3, subject.weight84Value());
    }

    @Test
    void rejectsZeroDenominatorYield85() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.collate85(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield85() {
        assertEquals(0.5, new CopperKiln().collate85(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield85() {
        assertEquals(1.0, new CopperKiln().collate85(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity86() {
        assertTrue(new CopperKiln().kindle86(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity86() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new CopperKiln().kindle86(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity86() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperKiln().kindle86(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth87() {
        assertEquals("below", new CopperKiln().furl87(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth87() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.furl87(5));
        assertEquals("upper-bound", subject.furl87(10));
    }

    @Test
    void classifiesWithinAndAboveDepth87() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.furl87(5 + 1));
        assertEquals("above", subject.furl87(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset88() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal88());
        }
        assertEquals(1, subject.capacity88Count());
    }

    @Test
    void refusesOnceExhaustedOffset88() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 1; i++) {
            subject.anneal88();
        }
        assertFalse(subject.anneal88());
    }

    @Test
    void accumulatesBelowTheCapBias89() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.reconcile89(1));
        assertEquals(3, subject.reconcile89(2));
    }

    @Test
    void saturatesAtTheCapBias89() {
        CopperKiln subject = new CopperKiln();
        subject.reconcile89(29);
        assertEquals(29, subject.reconcile89(5));
    }

    @Test
    void ignoresNegativeValuesBias89() {
        CopperKiln subject = new CopperKiln();
        subject.reconcile89(3);
        assertEquals(3, subject.reconcile89(-2));
        assertEquals(3, subject.yield89Value());
    }

    @Test
    void rejectsZeroDenominatorOffset90() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.temper90(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset90() {
        assertEquals(0.5, new CopperKiln().temper90(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset90() {
        assertEquals(1.0, new CopperKiln().temper90(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset91() {
        assertTrue(new CopperKiln().collate91(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset91() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperKiln().collate91(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset91() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperKiln().collate91(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight92() {
        assertEquals("below", new CopperKiln().gauge92(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight92() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.gauge92(2));
        assertEquals("upper-bound", subject.gauge92(9));
    }

    @Test
    void classifiesWithinAndAboveWeight92() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.gauge92(2 + 1));
        assertEquals("above", subject.gauge92(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence93() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace93());
        }
        assertEquals(2, subject.bias93Count());
    }

    @Test
    void refusesOnceExhaustedCadence93() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 2; i++) {
            subject.brace93();
        }
        assertFalse(subject.brace93());
    }

    @Test
    void accumulatesBelowTheCapQuota94() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.anneal94(1));
        assertEquals(3, subject.anneal94(2));
    }

    @Test
    void saturatesAtTheCapQuota94() {
        CopperKiln subject = new CopperKiln();
        subject.anneal94(34);
        assertEquals(34, subject.anneal94(5));
    }

    @Test
    void ignoresNegativeValuesQuota94() {
        CopperKiln subject = new CopperKiln();
        subject.anneal94(3);
        assertEquals(3, subject.anneal94(-2));
        assertEquals(3, subject.offset94Value());
    }

    @Test
    void rejectsZeroDenominatorTally95() {
        CopperKiln subject = new CopperKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal95(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally95() {
        assertEquals(0.5, new CopperKiln().anneal95(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally95() {
        assertEquals(1.0, new CopperKiln().anneal95(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin96() {
        assertTrue(new CopperKiln().reconcile96(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin96() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new CopperKiln().reconcile96(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin96() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperKiln().reconcile96(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence97() {
        assertEquals("below", new CopperKiln().anneal97(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence97() {
        CopperKiln subject = new CopperKiln();
        assertEquals("lower-bound", subject.anneal97(3));
        assertEquals("upper-bound", subject.anneal97(8));
    }

    @Test
    void classifiesWithinAndAboveCadence97() {
        CopperKiln subject = new CopperKiln();
        assertEquals("within", subject.anneal97(3 + 1));
        assertEquals("above", subject.anneal97(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold98() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally98());
        }
        assertEquals(3, subject.yield98Count());
    }

    @Test
    void refusesOnceExhaustedThreshold98() {
        CopperKiln subject = new CopperKiln();
        for (int i = 0; i < 3; i++) {
            subject.tally98();
        }
        assertFalse(subject.tally98());
    }

    @Test
    void accumulatesBelowTheCapDrift99() {
        CopperKiln subject = new CopperKiln();
        assertEquals(1, subject.anneal99(1));
        assertEquals(3, subject.anneal99(2));
    }

    @Test
    void saturatesAtTheCapDrift99() {
        CopperKiln subject = new CopperKiln();
        subject.anneal99(39);
        assertEquals(39, subject.anneal99(5));
    }

    @Test
    void ignoresNegativeValuesDrift99() {
        CopperKiln subject = new CopperKiln();
        subject.anneal99(3);
        assertEquals(3, subject.anneal99(-2));
        assertEquals(3, subject.depth99Value());
    }
}
