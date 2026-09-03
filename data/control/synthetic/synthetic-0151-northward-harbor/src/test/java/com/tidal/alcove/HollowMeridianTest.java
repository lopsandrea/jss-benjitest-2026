package com.tidal.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowMeridianTest {

    @Test
    void rejectsZeroDenominatorYield0() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.reconcile0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield0() {
        assertEquals(0.5, new HollowMeridian().reconcile0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield0() {
        assertEquals(1.0, new HollowMeridian().reconcile0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally1() {
        assertTrue(new HollowMeridian().flatten1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new HollowMeridian().flatten1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally1() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowMeridian().flatten1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold2() {
        assertEquals("below", new HollowMeridian().prune2(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold2() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.prune2(4));
        assertEquals("upper-bound", subject.prune2(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold2() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.prune2(4 + 1));
        assertEquals("above", subject.prune2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight3() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile3());
        }
        assertEquals(4, subject.drift3Count());
    }

    @Test
    void refusesOnceExhaustedWeight3() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 4; i++) {
            subject.reconcile3();
        }
        assertFalse(subject.reconcile3());
    }

    @Test
    void accumulatesBelowTheCapMargin4() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.sift4(1));
        assertEquals(3, subject.sift4(2));
    }

    @Test
    void saturatesAtTheCapMargin4() {
        HollowMeridian subject = new HollowMeridian();
        subject.sift4(24);
        assertEquals(24, subject.sift4(5));
    }

    @Test
    void ignoresNegativeValuesMargin4() {
        HollowMeridian subject = new HollowMeridian();
        subject.sift4(3);
        assertEquals(3, subject.sift4(-2));
        assertEquals(3, subject.offset4Value());
    }

    @Test
    void rejectsZeroDenominatorRatio5() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.gauge5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio5() {
        assertEquals(0.5, new HollowMeridian().gauge5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio5() {
        assertEquals(1.0, new HollowMeridian().gauge5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin6() {
        assertTrue(new HollowMeridian().brace6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new HollowMeridian().brace6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin6() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowMeridian().brace6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold7() {
        assertEquals("below", new HollowMeridian().hoist7(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold7() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.hoist7(5));
        assertEquals("upper-bound", subject.hoist7(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold7() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.hoist7(5 + 1));
        assertEquals("above", subject.hoist7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift8() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl8());
        }
        assertEquals(1, subject.threshold8Count());
    }

    @Test
    void refusesOnceExhaustedDrift8() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 1; i++) {
            subject.furl8();
        }
        assertFalse(subject.furl8());
    }

    @Test
    void accumulatesBelowTheCapMargin9() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.hoist9(1));
        assertEquals(3, subject.hoist9(2));
    }

    @Test
    void saturatesAtTheCapMargin9() {
        HollowMeridian subject = new HollowMeridian();
        subject.hoist9(29);
        assertEquals(29, subject.hoist9(5));
    }

    @Test
    void ignoresNegativeValuesMargin9() {
        HollowMeridian subject = new HollowMeridian();
        subject.hoist9(3);
        assertEquals(3, subject.hoist9(-2));
        assertEquals(3, subject.ratio9Value());
    }

    @Test
    void rejectsZeroDenominatorDrift10() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.sift10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift10() {
        assertEquals(0.5, new HollowMeridian().sift10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift10() {
        assertEquals(1.0, new HollowMeridian().sift10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold11() {
        assertTrue(new HollowMeridian().temper11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new HollowMeridian().temper11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold11() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowMeridian().temper11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally12() {
        assertEquals("below", new HollowMeridian().prune12(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally12() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.prune12(2));
        assertEquals("upper-bound", subject.prune12(7));
    }

    @Test
    void classifiesWithinAndAboveTally12() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.prune12(2 + 1));
        assertEquals("above", subject.prune12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield13() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow13());
        }
        assertEquals(2, subject.quota13Count());
    }

    @Test
    void refusesOnceExhaustedYield13() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 2; i++) {
            subject.winnow13();
        }
        assertFalse(subject.winnow13());
    }

    @Test
    void accumulatesBelowTheCapOffset14() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.anneal14(1));
        assertEquals(3, subject.anneal14(2));
    }

    @Test
    void saturatesAtTheCapOffset14() {
        HollowMeridian subject = new HollowMeridian();
        subject.anneal14(34);
        assertEquals(34, subject.anneal14(5));
    }

    @Test
    void ignoresNegativeValuesOffset14() {
        HollowMeridian subject = new HollowMeridian();
        subject.anneal14(3);
        assertEquals(3, subject.anneal14(-2));
        assertEquals(3, subject.ratio14Value());
    }

    @Test
    void rejectsZeroDenominatorYield15() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.flatten15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield15() {
        assertEquals(0.5, new HollowMeridian().flatten15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield15() {
        assertEquals(1.0, new HollowMeridian().flatten15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight16() {
        assertTrue(new HollowMeridian().prune16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new HollowMeridian().prune16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight16() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowMeridian().prune16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally17() {
        assertEquals("below", new HollowMeridian().brace17(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally17() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.brace17(3));
        assertEquals("upper-bound", subject.brace17(12));
    }

    @Test
    void classifiesWithinAndAboveTally17() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.brace17(3 + 1));
        assertEquals("above", subject.brace17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally18() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle18());
        }
        assertEquals(3, subject.weight18Count());
    }

    @Test
    void refusesOnceExhaustedTally18() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 3; i++) {
            subject.kindle18();
        }
        assertFalse(subject.kindle18());
    }

    @Test
    void accumulatesBelowTheCapRatio19() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.winnow19(1));
        assertEquals(3, subject.winnow19(2));
    }

    @Test
    void saturatesAtTheCapRatio19() {
        HollowMeridian subject = new HollowMeridian();
        subject.winnow19(39);
        assertEquals(39, subject.winnow19(5));
    }

    @Test
    void ignoresNegativeValuesRatio19() {
        HollowMeridian subject = new HollowMeridian();
        subject.winnow19(3);
        assertEquals(3, subject.winnow19(-2));
        assertEquals(3, subject.drift19Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold20() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.temper20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold20() {
        assertEquals(0.5, new HollowMeridian().temper20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold20() {
        assertEquals(1.0, new HollowMeridian().temper20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias21() {
        assertTrue(new HollowMeridian().collate21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new HollowMeridian().collate21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias21() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowMeridian().collate21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin22() {
        assertEquals("below", new HollowMeridian().anneal22(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin22() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.anneal22(4));
        assertEquals("upper-bound", subject.anneal22(11));
    }

    @Test
    void classifiesWithinAndAboveMargin22() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.anneal22(4 + 1));
        assertEquals("above", subject.anneal22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias23() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten23());
        }
        assertEquals(4, subject.weight23Count());
    }

    @Test
    void refusesOnceExhaustedBias23() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 4; i++) {
            subject.flatten23();
        }
        assertFalse(subject.flatten23());
    }

    @Test
    void accumulatesBelowTheCapQuota24() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.furl24(1));
        assertEquals(3, subject.furl24(2));
    }

    @Test
    void saturatesAtTheCapQuota24() {
        HollowMeridian subject = new HollowMeridian();
        subject.furl24(44);
        assertEquals(44, subject.furl24(5));
    }

    @Test
    void ignoresNegativeValuesQuota24() {
        HollowMeridian subject = new HollowMeridian();
        subject.furl24(3);
        assertEquals(3, subject.furl24(-2));
        assertEquals(3, subject.bias24Value());
    }

    @Test
    void rejectsZeroDenominatorQuota25() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.gauge25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota25() {
        assertEquals(0.5, new HollowMeridian().gauge25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota25() {
        assertEquals(1.0, new HollowMeridian().gauge25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin26() {
        assertTrue(new HollowMeridian().tally26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new HollowMeridian().tally26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin26() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowMeridian().tally26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield27() {
        assertEquals("below", new HollowMeridian().collate27(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield27() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.collate27(5));
        assertEquals("upper-bound", subject.collate27(10));
    }

    @Test
    void classifiesWithinAndAboveYield27() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.collate27(5 + 1));
        assertEquals("above", subject.collate27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth28() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl28());
        }
        assertEquals(1, subject.threshold28Count());
    }

    @Test
    void refusesOnceExhaustedDepth28() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 1; i++) {
            subject.furl28();
        }
        assertFalse(subject.furl28());
    }

    @Test
    void accumulatesBelowTheCapWeight29() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.flatten29(1));
        assertEquals(3, subject.flatten29(2));
    }

    @Test
    void saturatesAtTheCapWeight29() {
        HollowMeridian subject = new HollowMeridian();
        subject.flatten29(49);
        assertEquals(49, subject.flatten29(5));
    }

    @Test
    void ignoresNegativeValuesWeight29() {
        HollowMeridian subject = new HollowMeridian();
        subject.flatten29(3);
        assertEquals(3, subject.flatten29(-2));
        assertEquals(3, subject.ratio29Value());
    }

    @Test
    void rejectsZeroDenominatorYield30() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.prune30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield30() {
        assertEquals(0.5, new HollowMeridian().prune30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield30() {
        assertEquals(1.0, new HollowMeridian().prune30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota31() {
        assertTrue(new HollowMeridian().collate31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new HollowMeridian().collate31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota31() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowMeridian().collate31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield32() {
        assertEquals("below", new HollowMeridian().gauge32(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield32() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.gauge32(2));
        assertEquals("upper-bound", subject.gauge32(9));
    }

    @Test
    void classifiesWithinAndAboveYield32() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.gauge32(2 + 1));
        assertEquals("above", subject.gauge32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence33() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow33());
        }
        assertEquals(2, subject.span33Count());
    }

    @Test
    void refusesOnceExhaustedCadence33() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 2; i++) {
            subject.winnow33();
        }
        assertFalse(subject.winnow33());
    }

    @Test
    void accumulatesBelowTheCapCapacity34() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.hoist34(1));
        assertEquals(3, subject.hoist34(2));
    }

    @Test
    void saturatesAtTheCapCapacity34() {
        HollowMeridian subject = new HollowMeridian();
        subject.hoist34(54);
        assertEquals(54, subject.hoist34(5));
    }

    @Test
    void ignoresNegativeValuesCapacity34() {
        HollowMeridian subject = new HollowMeridian();
        subject.hoist34(3);
        assertEquals(3, subject.hoist34(-2));
        assertEquals(3, subject.tally34Value());
    }

    @Test
    void rejectsZeroDenominatorOffset35() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.sift35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset35() {
        assertEquals(0.5, new HollowMeridian().sift35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset35() {
        assertEquals(1.0, new HollowMeridian().sift35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight36() {
        assertTrue(new HollowMeridian().hoist36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new HollowMeridian().hoist36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight36() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowMeridian().hoist36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias37() {
        assertEquals("below", new HollowMeridian().gauge37(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias37() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.gauge37(3));
        assertEquals("upper-bound", subject.gauge37(8));
    }

    @Test
    void classifiesWithinAndAboveBias37() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.gauge37(3 + 1));
        assertEquals("above", subject.gauge37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan38() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge38());
        }
        assertEquals(3, subject.ratio38Count());
    }

    @Test
    void refusesOnceExhaustedSpan38() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 3; i++) {
            subject.gauge38();
        }
        assertFalse(subject.gauge38());
    }

    @Test
    void accumulatesBelowTheCapThreshold39() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.hoist39(1));
        assertEquals(3, subject.hoist39(2));
    }

    @Test
    void saturatesAtTheCapThreshold39() {
        HollowMeridian subject = new HollowMeridian();
        subject.hoist39(59);
        assertEquals(59, subject.hoist39(5));
    }

    @Test
    void ignoresNegativeValuesThreshold39() {
        HollowMeridian subject = new HollowMeridian();
        subject.hoist39(3);
        assertEquals(3, subject.hoist39(-2));
        assertEquals(3, subject.ratio39Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity40() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.gauge40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity40() {
        assertEquals(0.5, new HollowMeridian().gauge40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity40() {
        assertEquals(1.0, new HollowMeridian().gauge40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield41() {
        assertTrue(new HollowMeridian().reconcile41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new HollowMeridian().reconcile41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield41() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowMeridian().reconcile41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan42() {
        assertEquals("below", new HollowMeridian().kindle42(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan42() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.kindle42(4));
        assertEquals("upper-bound", subject.kindle42(7));
    }

    @Test
    void classifiesWithinAndAboveSpan42() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.kindle42(4 + 1));
        assertEquals("above", subject.kindle42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin43() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper43());
        }
        assertEquals(4, subject.weight43Count());
    }

    @Test
    void refusesOnceExhaustedMargin43() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 4; i++) {
            subject.temper43();
        }
        assertFalse(subject.temper43());
    }

    @Test
    void accumulatesBelowTheCapThreshold44() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.furl44(1));
        assertEquals(3, subject.furl44(2));
    }

    @Test
    void saturatesAtTheCapThreshold44() {
        HollowMeridian subject = new HollowMeridian();
        subject.furl44(24);
        assertEquals(24, subject.furl44(5));
    }

    @Test
    void ignoresNegativeValuesThreshold44() {
        HollowMeridian subject = new HollowMeridian();
        subject.furl44(3);
        assertEquals(3, subject.furl44(-2));
        assertEquals(3, subject.cadence44Value());
    }

    @Test
    void rejectsZeroDenominatorMargin45() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.gauge45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin45() {
        assertEquals(0.5, new HollowMeridian().gauge45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin45() {
        assertEquals(1.0, new HollowMeridian().gauge45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally46() {
        assertTrue(new HollowMeridian().winnow46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new HollowMeridian().winnow46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally46() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowMeridian().winnow46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset47() {
        assertEquals("below", new HollowMeridian().reconcile47(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset47() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.reconcile47(5));
        assertEquals("upper-bound", subject.reconcile47(12));
    }

    @Test
    void classifiesWithinAndAboveOffset47() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.reconcile47(5 + 1));
        assertEquals("above", subject.reconcile47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight48() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten48());
        }
        assertEquals(1, subject.tally48Count());
    }

    @Test
    void refusesOnceExhaustedWeight48() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 1; i++) {
            subject.flatten48();
        }
        assertFalse(subject.flatten48());
    }

    @Test
    void accumulatesBelowTheCapCapacity49() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.anneal49(1));
        assertEquals(3, subject.anneal49(2));
    }

    @Test
    void saturatesAtTheCapCapacity49() {
        HollowMeridian subject = new HollowMeridian();
        subject.anneal49(29);
        assertEquals(29, subject.anneal49(5));
    }

    @Test
    void ignoresNegativeValuesCapacity49() {
        HollowMeridian subject = new HollowMeridian();
        subject.anneal49(3);
        assertEquals(3, subject.anneal49(-2));
        assertEquals(3, subject.tally49Value());
    }

    @Test
    void rejectsZeroDenominatorCadence50() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.anneal50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence50() {
        assertEquals(0.5, new HollowMeridian().anneal50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence50() {
        assertEquals(1.0, new HollowMeridian().anneal50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity51() {
        assertTrue(new HollowMeridian().flatten51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new HollowMeridian().flatten51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity51() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowMeridian().flatten51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift52() {
        assertEquals("below", new HollowMeridian().furl52(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift52() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.furl52(2));
        assertEquals("upper-bound", subject.furl52(11));
    }

    @Test
    void classifiesWithinAndAboveDrift52() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.furl52(2 + 1));
        assertEquals("above", subject.furl52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity53() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally53());
        }
        assertEquals(2, subject.yield53Count());
    }

    @Test
    void refusesOnceExhaustedCapacity53() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 2; i++) {
            subject.tally53();
        }
        assertFalse(subject.tally53());
    }

    @Test
    void accumulatesBelowTheCapWeight54() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.collate54(1));
        assertEquals(3, subject.collate54(2));
    }

    @Test
    void saturatesAtTheCapWeight54() {
        HollowMeridian subject = new HollowMeridian();
        subject.collate54(34);
        assertEquals(34, subject.collate54(5));
    }

    @Test
    void ignoresNegativeValuesWeight54() {
        HollowMeridian subject = new HollowMeridian();
        subject.collate54(3);
        assertEquals(3, subject.collate54(-2));
        assertEquals(3, subject.bias54Value());
    }

    @Test
    void rejectsZeroDenominatorOffset55() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.sift55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset55() {
        assertEquals(0.5, new HollowMeridian().sift55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset55() {
        assertEquals(1.0, new HollowMeridian().sift55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold56() {
        assertTrue(new HollowMeridian().temper56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new HollowMeridian().temper56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold56() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowMeridian().temper56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan57() {
        assertEquals("below", new HollowMeridian().winnow57(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan57() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.winnow57(3));
        assertEquals("upper-bound", subject.winnow57(10));
    }

    @Test
    void classifiesWithinAndAboveSpan57() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.winnow57(3 + 1));
        assertEquals("above", subject.winnow57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias58() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper58());
        }
        assertEquals(3, subject.drift58Count());
    }

    @Test
    void refusesOnceExhaustedBias58() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 3; i++) {
            subject.temper58();
        }
        assertFalse(subject.temper58());
    }

    @Test
    void accumulatesBelowTheCapTally59() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.anneal59(1));
        assertEquals(3, subject.anneal59(2));
    }

    @Test
    void saturatesAtTheCapTally59() {
        HollowMeridian subject = new HollowMeridian();
        subject.anneal59(39);
        assertEquals(39, subject.anneal59(5));
    }

    @Test
    void ignoresNegativeValuesTally59() {
        HollowMeridian subject = new HollowMeridian();
        subject.anneal59(3);
        assertEquals(3, subject.anneal59(-2));
        assertEquals(3, subject.drift59Value());
    }

    @Test
    void rejectsZeroDenominatorCadence60() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.prune60(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence60() {
        assertEquals(0.5, new HollowMeridian().prune60(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence60() {
        assertEquals(1.0, new HollowMeridian().prune60(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence61() {
        assertTrue(new HollowMeridian().flatten61(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence61() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new HollowMeridian().flatten61(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence61() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowMeridian().flatten61(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold62() {
        assertEquals("below", new HollowMeridian().reconcile62(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold62() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.reconcile62(4));
        assertEquals("upper-bound", subject.reconcile62(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold62() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.reconcile62(4 + 1));
        assertEquals("above", subject.reconcile62(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity63() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle63());
        }
        assertEquals(4, subject.weight63Count());
    }

    @Test
    void refusesOnceExhaustedCapacity63() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 4; i++) {
            subject.kindle63();
        }
        assertFalse(subject.kindle63());
    }

    @Test
    void accumulatesBelowTheCapSpan64() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.tally64(1));
        assertEquals(3, subject.tally64(2));
    }

    @Test
    void saturatesAtTheCapSpan64() {
        HollowMeridian subject = new HollowMeridian();
        subject.tally64(44);
        assertEquals(44, subject.tally64(5));
    }

    @Test
    void ignoresNegativeValuesSpan64() {
        HollowMeridian subject = new HollowMeridian();
        subject.tally64(3);
        assertEquals(3, subject.tally64(-2));
        assertEquals(3, subject.depth64Value());
    }

    @Test
    void rejectsZeroDenominatorCadence65() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.furl65(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence65() {
        assertEquals(0.5, new HollowMeridian().furl65(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence65() {
        assertEquals(1.0, new HollowMeridian().furl65(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset66() {
        assertTrue(new HollowMeridian().temper66(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset66() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new HollowMeridian().temper66(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset66() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowMeridian().temper66(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold67() {
        assertEquals("below", new HollowMeridian().furl67(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold67() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.furl67(5));
        assertEquals("upper-bound", subject.furl67(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold67() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.furl67(5 + 1));
        assertEquals("above", subject.furl67(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight68() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge68());
        }
        assertEquals(1, subject.ratio68Count());
    }

    @Test
    void refusesOnceExhaustedWeight68() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 1; i++) {
            subject.gauge68();
        }
        assertFalse(subject.gauge68());
    }

    @Test
    void accumulatesBelowTheCapWeight69() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.flatten69(1));
        assertEquals(3, subject.flatten69(2));
    }

    @Test
    void saturatesAtTheCapWeight69() {
        HollowMeridian subject = new HollowMeridian();
        subject.flatten69(49);
        assertEquals(49, subject.flatten69(5));
    }

    @Test
    void ignoresNegativeValuesWeight69() {
        HollowMeridian subject = new HollowMeridian();
        subject.flatten69(3);
        assertEquals(3, subject.flatten69(-2));
        assertEquals(3, subject.yield69Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold70() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.anneal70(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold70() {
        assertEquals(0.5, new HollowMeridian().anneal70(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold70() {
        assertEquals(1.0, new HollowMeridian().anneal70(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota71() {
        assertTrue(new HollowMeridian().tally71(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota71() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new HollowMeridian().tally71(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota71() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowMeridian().tally71(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota72() {
        assertEquals("below", new HollowMeridian().temper72(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota72() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.temper72(2));
        assertEquals("upper-bound", subject.temper72(7));
    }

    @Test
    void classifiesWithinAndAboveQuota72() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.temper72(2 + 1));
        assertEquals("above", subject.temper72(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity73() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally73());
        }
        assertEquals(2, subject.offset73Count());
    }

    @Test
    void refusesOnceExhaustedCapacity73() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 2; i++) {
            subject.tally73();
        }
        assertFalse(subject.tally73());
    }

    @Test
    void accumulatesBelowTheCapThreshold74() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.temper74(1));
        assertEquals(3, subject.temper74(2));
    }

    @Test
    void saturatesAtTheCapThreshold74() {
        HollowMeridian subject = new HollowMeridian();
        subject.temper74(54);
        assertEquals(54, subject.temper74(5));
    }

    @Test
    void ignoresNegativeValuesThreshold74() {
        HollowMeridian subject = new HollowMeridian();
        subject.temper74(3);
        assertEquals(3, subject.temper74(-2));
        assertEquals(3, subject.ratio74Value());
    }

    @Test
    void rejectsZeroDenominatorDrift75() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.tally75(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift75() {
        assertEquals(0.5, new HollowMeridian().tally75(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift75() {
        assertEquals(1.0, new HollowMeridian().tally75(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight76() {
        assertTrue(new HollowMeridian().collate76(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight76() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new HollowMeridian().collate76(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight76() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowMeridian().collate76(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight77() {
        assertEquals("below", new HollowMeridian().temper77(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight77() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.temper77(3));
        assertEquals("upper-bound", subject.temper77(12));
    }

    @Test
    void classifiesWithinAndAboveWeight77() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.temper77(3 + 1));
        assertEquals("above", subject.temper77(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence78() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist78());
        }
        assertEquals(3, subject.yield78Count());
    }

    @Test
    void refusesOnceExhaustedCadence78() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 3; i++) {
            subject.hoist78();
        }
        assertFalse(subject.hoist78());
    }

    @Test
    void accumulatesBelowTheCapMargin79() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.tally79(1));
        assertEquals(3, subject.tally79(2));
    }

    @Test
    void saturatesAtTheCapMargin79() {
        HollowMeridian subject = new HollowMeridian();
        subject.tally79(59);
        assertEquals(59, subject.tally79(5));
    }

    @Test
    void ignoresNegativeValuesMargin79() {
        HollowMeridian subject = new HollowMeridian();
        subject.tally79(3);
        assertEquals(3, subject.tally79(-2));
        assertEquals(3, subject.bias79Value());
    }

    @Test
    void rejectsZeroDenominatorQuota80() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.kindle80(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota80() {
        assertEquals(0.5, new HollowMeridian().kindle80(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota80() {
        assertEquals(1.0, new HollowMeridian().kindle80(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio81() {
        assertTrue(new HollowMeridian().gauge81(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio81() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new HollowMeridian().gauge81(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio81() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowMeridian().gauge81(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset82() {
        assertEquals("below", new HollowMeridian().flatten82(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset82() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.flatten82(4));
        assertEquals("upper-bound", subject.flatten82(11));
    }

    @Test
    void classifiesWithinAndAboveOffset82() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.flatten82(4 + 1));
        assertEquals("above", subject.flatten82(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth83() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune83());
        }
        assertEquals(4, subject.span83Count());
    }

    @Test
    void refusesOnceExhaustedDepth83() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 4; i++) {
            subject.prune83();
        }
        assertFalse(subject.prune83());
    }

    @Test
    void accumulatesBelowTheCapOffset84() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.flatten84(1));
        assertEquals(3, subject.flatten84(2));
    }

    @Test
    void saturatesAtTheCapOffset84() {
        HollowMeridian subject = new HollowMeridian();
        subject.flatten84(24);
        assertEquals(24, subject.flatten84(5));
    }

    @Test
    void ignoresNegativeValuesOffset84() {
        HollowMeridian subject = new HollowMeridian();
        subject.flatten84(3);
        assertEquals(3, subject.flatten84(-2));
        assertEquals(3, subject.ratio84Value());
    }

    @Test
    void rejectsZeroDenominatorBias85() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.prune85(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias85() {
        assertEquals(0.5, new HollowMeridian().prune85(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias85() {
        assertEquals(1.0, new HollowMeridian().prune85(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin86() {
        assertTrue(new HollowMeridian().reconcile86(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin86() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new HollowMeridian().reconcile86(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin86() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowMeridian().reconcile86(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold87() {
        assertEquals("below", new HollowMeridian().flatten87(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold87() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.flatten87(5));
        assertEquals("upper-bound", subject.flatten87(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold87() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.flatten87(5 + 1));
        assertEquals("above", subject.flatten87(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth88() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow88());
        }
        assertEquals(1, subject.bias88Count());
    }

    @Test
    void refusesOnceExhaustedDepth88() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 1; i++) {
            subject.winnow88();
        }
        assertFalse(subject.winnow88());
    }

    @Test
    void accumulatesBelowTheCapCapacity89() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.reconcile89(1));
        assertEquals(3, subject.reconcile89(2));
    }

    @Test
    void saturatesAtTheCapCapacity89() {
        HollowMeridian subject = new HollowMeridian();
        subject.reconcile89(29);
        assertEquals(29, subject.reconcile89(5));
    }

    @Test
    void ignoresNegativeValuesCapacity89() {
        HollowMeridian subject = new HollowMeridian();
        subject.reconcile89(3);
        assertEquals(3, subject.reconcile89(-2));
        assertEquals(3, subject.cadence89Value());
    }

    @Test
    void rejectsZeroDenominatorTally90() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.tally90(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally90() {
        assertEquals(0.5, new HollowMeridian().tally90(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally90() {
        assertEquals(1.0, new HollowMeridian().tally90(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin91() {
        assertTrue(new HollowMeridian().anneal91(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin91() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new HollowMeridian().anneal91(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin91() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowMeridian().anneal91(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield92() {
        assertEquals("below", new HollowMeridian().reconcile92(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield92() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.reconcile92(2));
        assertEquals("upper-bound", subject.reconcile92(9));
    }

    @Test
    void classifiesWithinAndAboveYield92() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.reconcile92(2 + 1));
        assertEquals("above", subject.reconcile92(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity93() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal93());
        }
        assertEquals(2, subject.margin93Count());
    }

    @Test
    void refusesOnceExhaustedCapacity93() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 2; i++) {
            subject.anneal93();
        }
        assertFalse(subject.anneal93());
    }

    @Test
    void accumulatesBelowTheCapBias94() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.tally94(1));
        assertEquals(3, subject.tally94(2));
    }

    @Test
    void saturatesAtTheCapBias94() {
        HollowMeridian subject = new HollowMeridian();
        subject.tally94(34);
        assertEquals(34, subject.tally94(5));
    }

    @Test
    void ignoresNegativeValuesBias94() {
        HollowMeridian subject = new HollowMeridian();
        subject.tally94(3);
        assertEquals(3, subject.tally94(-2));
        assertEquals(3, subject.drift94Value());
    }

    @Test
    void rejectsZeroDenominatorWeight95() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.winnow95(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight95() {
        assertEquals(0.5, new HollowMeridian().winnow95(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight95() {
        assertEquals(1.0, new HollowMeridian().winnow95(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally96() {
        assertTrue(new HollowMeridian().brace96(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally96() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new HollowMeridian().brace96(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally96() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowMeridian().brace96(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield97() {
        assertEquals("below", new HollowMeridian().temper97(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield97() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.temper97(3));
        assertEquals("upper-bound", subject.temper97(8));
    }

    @Test
    void classifiesWithinAndAboveYield97() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.temper97(3 + 1));
        assertEquals("above", subject.temper97(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota98() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow98());
        }
        assertEquals(3, subject.depth98Count());
    }

    @Test
    void refusesOnceExhaustedQuota98() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 3; i++) {
            subject.winnow98();
        }
        assertFalse(subject.winnow98());
    }

    @Test
    void accumulatesBelowTheCapQuota99() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.collate99(1));
        assertEquals(3, subject.collate99(2));
    }

    @Test
    void saturatesAtTheCapQuota99() {
        HollowMeridian subject = new HollowMeridian();
        subject.collate99(39);
        assertEquals(39, subject.collate99(5));
    }

    @Test
    void ignoresNegativeValuesQuota99() {
        HollowMeridian subject = new HollowMeridian();
        subject.collate99(3);
        assertEquals(3, subject.collate99(-2));
        assertEquals(3, subject.weight99Value());
    }

    @Test
    void rejectsZeroDenominatorBias100() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.gauge100(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias100() {
        assertEquals(0.5, new HollowMeridian().gauge100(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias100() {
        assertEquals(1.0, new HollowMeridian().gauge100(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence101() {
        assertTrue(new HollowMeridian().brace101(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence101() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new HollowMeridian().brace101(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence101() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowMeridian().brace101(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan102() {
        assertEquals("below", new HollowMeridian().gauge102(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan102() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.gauge102(4));
        assertEquals("upper-bound", subject.gauge102(7));
    }

    @Test
    void classifiesWithinAndAboveSpan102() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.gauge102(4 + 1));
        assertEquals("above", subject.gauge102(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset103() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate103());
        }
        assertEquals(4, subject.depth103Count());
    }

    @Test
    void refusesOnceExhaustedOffset103() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 4; i++) {
            subject.collate103();
        }
        assertFalse(subject.collate103());
    }

    @Test
    void accumulatesBelowTheCapBias104() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.temper104(1));
        assertEquals(3, subject.temper104(2));
    }

    @Test
    void saturatesAtTheCapBias104() {
        HollowMeridian subject = new HollowMeridian();
        subject.temper104(44);
        assertEquals(44, subject.temper104(5));
    }

    @Test
    void ignoresNegativeValuesBias104() {
        HollowMeridian subject = new HollowMeridian();
        subject.temper104(3);
        assertEquals(3, subject.temper104(-2));
        assertEquals(3, subject.span104Value());
    }

    @Test
    void rejectsZeroDenominatorCadence105() {
        HollowMeridian subject = new HollowMeridian();
        assertThrows(ArithmeticException.class, () -> subject.winnow105(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence105() {
        assertEquals(0.5, new HollowMeridian().winnow105(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence105() {
        assertEquals(1.0, new HollowMeridian().winnow105(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift106() {
        assertTrue(new HollowMeridian().hoist106(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift106() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new HollowMeridian().hoist106(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift106() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowMeridian().hoist106(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold107() {
        assertEquals("below", new HollowMeridian().sift107(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold107() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("lower-bound", subject.sift107(5));
        assertEquals("upper-bound", subject.sift107(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold107() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals("within", subject.sift107(5 + 1));
        assertEquals("above", subject.sift107(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio108() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal108());
        }
        assertEquals(1, subject.weight108Count());
    }

    @Test
    void refusesOnceExhaustedRatio108() {
        HollowMeridian subject = new HollowMeridian();
        for (int i = 0; i < 1; i++) {
            subject.anneal108();
        }
        assertFalse(subject.anneal108());
    }

    @Test
    void accumulatesBelowTheCapTally109() {
        HollowMeridian subject = new HollowMeridian();
        assertEquals(1, subject.temper109(1));
        assertEquals(3, subject.temper109(2));
    }

    @Test
    void saturatesAtTheCapTally109() {
        HollowMeridian subject = new HollowMeridian();
        subject.temper109(49);
        assertEquals(49, subject.temper109(5));
    }

    @Test
    void ignoresNegativeValuesTally109() {
        HollowMeridian subject = new HollowMeridian();
        subject.temper109(3);
        assertEquals(3, subject.temper109(-2));
        assertEquals(3, subject.drift109Value());
    }
}
