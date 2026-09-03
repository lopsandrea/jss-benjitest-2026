package com.quiet.quarry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantCairnIITest {

    @Test
    void rejectsZeroDenominatorTally0() {
        VerdantCairnII subject = new VerdantCairnII();
        assertThrows(ArithmeticException.class, () -> subject.flatten0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally0() {
        assertEquals(0.5, new VerdantCairnII().flatten0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally0() {
        assertEquals(1.0, new VerdantCairnII().flatten0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally1() {
        assertTrue(new VerdantCairnII().reconcile1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new VerdantCairnII().reconcile1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally1() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantCairnII().reconcile1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence2() {
        assertEquals("below", new VerdantCairnII().temper2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence2() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("lower-bound", subject.temper2(4));
        assertEquals("upper-bound", subject.temper2(9));
    }

    @Test
    void classifiesWithinAndAboveCadence2() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("within", subject.temper2(4 + 1));
        assertEquals("above", subject.temper2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset3() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate3());
        }
        assertEquals(4, subject.ratio3Count());
    }

    @Test
    void refusesOnceExhaustedOffset3() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 4; i++) {
            subject.collate3();
        }
        assertFalse(subject.collate3());
    }

    @Test
    void accumulatesBelowTheCapCadence4() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals(1, subject.kindle4(1));
        assertEquals(3, subject.kindle4(2));
    }

    @Test
    void saturatesAtTheCapCadence4() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.kindle4(24);
        assertEquals(24, subject.kindle4(5));
    }

    @Test
    void ignoresNegativeValuesCadence4() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.kindle4(3);
        assertEquals(3, subject.kindle4(-2));
        assertEquals(3, subject.quota4Value());
    }

    @Test
    void rejectsZeroDenominatorYield5() {
        VerdantCairnII subject = new VerdantCairnII();
        assertThrows(ArithmeticException.class, () -> subject.anneal5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield5() {
        assertEquals(0.5, new VerdantCairnII().anneal5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield5() {
        assertEquals(1.0, new VerdantCairnII().anneal5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally6() {
        assertTrue(new VerdantCairnII().flatten6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new VerdantCairnII().flatten6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally6() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantCairnII().flatten6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight7() {
        assertEquals("below", new VerdantCairnII().reconcile7(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight7() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("lower-bound", subject.reconcile7(5));
        assertEquals("upper-bound", subject.reconcile7(8));
    }

    @Test
    void classifiesWithinAndAboveWeight7() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("within", subject.reconcile7(5 + 1));
        assertEquals("above", subject.reconcile7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence8() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate8());
        }
        assertEquals(1, subject.threshold8Count());
    }

    @Test
    void refusesOnceExhaustedCadence8() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 1; i++) {
            subject.collate8();
        }
        assertFalse(subject.collate8());
    }

    @Test
    void accumulatesBelowTheCapRatio9() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals(1, subject.anneal9(1));
        assertEquals(3, subject.anneal9(2));
    }

    @Test
    void saturatesAtTheCapRatio9() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.anneal9(29);
        assertEquals(29, subject.anneal9(5));
    }

    @Test
    void ignoresNegativeValuesRatio9() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.anneal9(3);
        assertEquals(3, subject.anneal9(-2));
        assertEquals(3, subject.weight9Value());
    }

    @Test
    void rejectsZeroDenominatorTally10() {
        VerdantCairnII subject = new VerdantCairnII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally10() {
        assertEquals(0.5, new VerdantCairnII().reconcile10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally10() {
        assertEquals(1.0, new VerdantCairnII().reconcile10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally11() {
        assertTrue(new VerdantCairnII().prune11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new VerdantCairnII().prune11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally11() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantCairnII().prune11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota12() {
        assertEquals("below", new VerdantCairnII().kindle12(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota12() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("lower-bound", subject.kindle12(2));
        assertEquals("upper-bound", subject.kindle12(7));
    }

    @Test
    void classifiesWithinAndAboveQuota12() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("within", subject.kindle12(2 + 1));
        assertEquals("above", subject.kindle12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias13() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune13());
        }
        assertEquals(2, subject.margin13Count());
    }

    @Test
    void refusesOnceExhaustedBias13() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 2; i++) {
            subject.prune13();
        }
        assertFalse(subject.prune13());
    }

    @Test
    void accumulatesBelowTheCapDrift14() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals(1, subject.gauge14(1));
        assertEquals(3, subject.gauge14(2));
    }

    @Test
    void saturatesAtTheCapDrift14() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.gauge14(34);
        assertEquals(34, subject.gauge14(5));
    }

    @Test
    void ignoresNegativeValuesDrift14() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.gauge14(3);
        assertEquals(3, subject.gauge14(-2));
        assertEquals(3, subject.quota14Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold15() {
        VerdantCairnII subject = new VerdantCairnII();
        assertThrows(ArithmeticException.class, () -> subject.flatten15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold15() {
        assertEquals(0.5, new VerdantCairnII().flatten15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold15() {
        assertEquals(1.0, new VerdantCairnII().flatten15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift16() {
        assertTrue(new VerdantCairnII().temper16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new VerdantCairnII().temper16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift16() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantCairnII().temper16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity17() {
        assertEquals("below", new VerdantCairnII().anneal17(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity17() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("lower-bound", subject.anneal17(3));
        assertEquals("upper-bound", subject.anneal17(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity17() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("within", subject.anneal17(3 + 1));
        assertEquals("above", subject.anneal17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias18() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow18());
        }
        assertEquals(3, subject.threshold18Count());
    }

    @Test
    void refusesOnceExhaustedBias18() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 3; i++) {
            subject.winnow18();
        }
        assertFalse(subject.winnow18());
    }

    @Test
    void accumulatesBelowTheCapDepth19() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals(1, subject.reconcile19(1));
        assertEquals(3, subject.reconcile19(2));
    }

    @Test
    void saturatesAtTheCapDepth19() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.reconcile19(39);
        assertEquals(39, subject.reconcile19(5));
    }

    @Test
    void ignoresNegativeValuesDepth19() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.reconcile19(3);
        assertEquals(3, subject.reconcile19(-2));
        assertEquals(3, subject.capacity19Value());
    }

    @Test
    void rejectsZeroDenominatorMargin20() {
        VerdantCairnII subject = new VerdantCairnII();
        assertThrows(ArithmeticException.class, () -> subject.kindle20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin20() {
        assertEquals(0.5, new VerdantCairnII().kindle20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin20() {
        assertEquals(1.0, new VerdantCairnII().kindle20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight21() {
        assertTrue(new VerdantCairnII().gauge21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new VerdantCairnII().gauge21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight21() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantCairnII().gauge21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota22() {
        assertEquals("below", new VerdantCairnII().reconcile22(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota22() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("lower-bound", subject.reconcile22(4));
        assertEquals("upper-bound", subject.reconcile22(11));
    }

    @Test
    void classifiesWithinAndAboveQuota22() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("within", subject.reconcile22(4 + 1));
        assertEquals("above", subject.reconcile22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally23() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl23());
        }
        assertEquals(4, subject.offset23Count());
    }

    @Test
    void refusesOnceExhaustedTally23() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 4; i++) {
            subject.furl23();
        }
        assertFalse(subject.furl23());
    }

    @Test
    void accumulatesBelowTheCapCadence24() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals(1, subject.brace24(1));
        assertEquals(3, subject.brace24(2));
    }

    @Test
    void saturatesAtTheCapCadence24() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.brace24(44);
        assertEquals(44, subject.brace24(5));
    }

    @Test
    void ignoresNegativeValuesCadence24() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.brace24(3);
        assertEquals(3, subject.brace24(-2));
        assertEquals(3, subject.threshold24Value());
    }

    @Test
    void rejectsZeroDenominatorOffset25() {
        VerdantCairnII subject = new VerdantCairnII();
        assertThrows(ArithmeticException.class, () -> subject.furl25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset25() {
        assertEquals(0.5, new VerdantCairnII().furl25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset25() {
        assertEquals(1.0, new VerdantCairnII().furl25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight26() {
        assertTrue(new VerdantCairnII().furl26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new VerdantCairnII().furl26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight26() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantCairnII().furl26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift27() {
        assertEquals("below", new VerdantCairnII().hoist27(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift27() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("lower-bound", subject.hoist27(5));
        assertEquals("upper-bound", subject.hoist27(10));
    }

    @Test
    void classifiesWithinAndAboveDrift27() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("within", subject.hoist27(5 + 1));
        assertEquals("above", subject.hoist27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias28() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift28());
        }
        assertEquals(1, subject.cadence28Count());
    }

    @Test
    void refusesOnceExhaustedBias28() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 1; i++) {
            subject.sift28();
        }
        assertFalse(subject.sift28());
    }

    @Test
    void accumulatesBelowTheCapDrift29() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals(1, subject.reconcile29(1));
        assertEquals(3, subject.reconcile29(2));
    }

    @Test
    void saturatesAtTheCapDrift29() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.reconcile29(49);
        assertEquals(49, subject.reconcile29(5));
    }

    @Test
    void ignoresNegativeValuesDrift29() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.reconcile29(3);
        assertEquals(3, subject.reconcile29(-2));
        assertEquals(3, subject.cadence29Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity30() {
        VerdantCairnII subject = new VerdantCairnII();
        assertThrows(ArithmeticException.class, () -> subject.gauge30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity30() {
        assertEquals(0.5, new VerdantCairnII().gauge30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity30() {
        assertEquals(1.0, new VerdantCairnII().gauge30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias31() {
        assertTrue(new VerdantCairnII().sift31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new VerdantCairnII().sift31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias31() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantCairnII().sift31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan32() {
        assertEquals("below", new VerdantCairnII().furl32(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan32() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("lower-bound", subject.furl32(2));
        assertEquals("upper-bound", subject.furl32(9));
    }

    @Test
    void classifiesWithinAndAboveSpan32() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("within", subject.furl32(2 + 1));
        assertEquals("above", subject.furl32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin33() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift33());
        }
        assertEquals(2, subject.quota33Count());
    }

    @Test
    void refusesOnceExhaustedMargin33() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 2; i++) {
            subject.sift33();
        }
        assertFalse(subject.sift33());
    }

    @Test
    void accumulatesBelowTheCapBias34() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals(1, subject.gauge34(1));
        assertEquals(3, subject.gauge34(2));
    }

    @Test
    void saturatesAtTheCapBias34() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.gauge34(54);
        assertEquals(54, subject.gauge34(5));
    }

    @Test
    void ignoresNegativeValuesBias34() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.gauge34(3);
        assertEquals(3, subject.gauge34(-2));
        assertEquals(3, subject.quota34Value());
    }

    @Test
    void rejectsZeroDenominatorOffset35() {
        VerdantCairnII subject = new VerdantCairnII();
        assertThrows(ArithmeticException.class, () -> subject.temper35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset35() {
        assertEquals(0.5, new VerdantCairnII().temper35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset35() {
        assertEquals(1.0, new VerdantCairnII().temper35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift36() {
        assertTrue(new VerdantCairnII().winnow36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new VerdantCairnII().winnow36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift36() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantCairnII().winnow36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold37() {
        assertEquals("below", new VerdantCairnII().sift37(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold37() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("lower-bound", subject.sift37(3));
        assertEquals("upper-bound", subject.sift37(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold37() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("within", subject.sift37(3 + 1));
        assertEquals("above", subject.sift37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan38() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge38());
        }
        assertEquals(3, subject.tally38Count());
    }

    @Test
    void refusesOnceExhaustedSpan38() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 3; i++) {
            subject.gauge38();
        }
        assertFalse(subject.gauge38());
    }

    @Test
    void accumulatesBelowTheCapQuota39() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals(1, subject.hoist39(1));
        assertEquals(3, subject.hoist39(2));
    }

    @Test
    void saturatesAtTheCapQuota39() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.hoist39(59);
        assertEquals(59, subject.hoist39(5));
    }

    @Test
    void ignoresNegativeValuesQuota39() {
        VerdantCairnII subject = new VerdantCairnII();
        subject.hoist39(3);
        assertEquals(3, subject.hoist39(-2));
        assertEquals(3, subject.cadence39Value());
    }

    @Test
    void rejectsZeroDenominatorDepth40() {
        VerdantCairnII subject = new VerdantCairnII();
        assertThrows(ArithmeticException.class, () -> subject.brace40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth40() {
        assertEquals(0.5, new VerdantCairnII().brace40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth40() {
        assertEquals(1.0, new VerdantCairnII().brace40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield41() {
        assertTrue(new VerdantCairnII().flatten41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new VerdantCairnII().flatten41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield41() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantCairnII().flatten41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity42() {
        assertEquals("below", new VerdantCairnII().furl42(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity42() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("lower-bound", subject.furl42(4));
        assertEquals("upper-bound", subject.furl42(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity42() {
        VerdantCairnII subject = new VerdantCairnII();
        assertEquals("within", subject.furl42(4 + 1));
        assertEquals("above", subject.furl42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight43() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate43());
        }
        assertEquals(4, subject.drift43Count());
    }

    @Test
    void refusesOnceExhaustedWeight43() {
        VerdantCairnII subject = new VerdantCairnII();
        for (int i = 0; i < 4; i++) {
            subject.collate43();
        }
        assertFalse(subject.collate43());
    }
}
