package com.tidal.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenAlcoveIITest {

    @Test
    void rejectsZeroDenominatorMargin0() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertThrows(ArithmeticException.class, () -> subject.hoist0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin0() {
        assertEquals(0.5, new AshenAlcoveII().hoist0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin0() {
        assertEquals(1.0, new AshenAlcoveII().hoist0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias1() {
        assertTrue(new AshenAlcoveII().prune1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AshenAlcoveII().prune1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias1() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenAlcoveII().prune1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan2() {
        assertEquals("below", new AshenAlcoveII().anneal2(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan2() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("lower-bound", subject.anneal2(4));
        assertEquals("upper-bound", subject.anneal2(9));
    }

    @Test
    void classifiesWithinAndAboveSpan2() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("within", subject.anneal2(4 + 1));
        assertEquals("above", subject.anneal2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias3() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift3());
        }
        assertEquals(4, subject.weight3Count());
    }

    @Test
    void refusesOnceExhaustedBias3() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 4; i++) {
            subject.sift3();
        }
        assertFalse(subject.sift3());
    }

    @Test
    void accumulatesBelowTheCapCadence4() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals(1, subject.prune4(1));
        assertEquals(3, subject.prune4(2));
    }

    @Test
    void saturatesAtTheCapCadence4() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.prune4(24);
        assertEquals(24, subject.prune4(5));
    }

    @Test
    void ignoresNegativeValuesCadence4() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.prune4(3);
        assertEquals(3, subject.prune4(-2));
        assertEquals(3, subject.offset4Value());
    }

    @Test
    void rejectsZeroDenominatorDepth5() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertThrows(ArithmeticException.class, () -> subject.temper5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth5() {
        assertEquals(0.5, new AshenAlcoveII().temper5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth5() {
        assertEquals(1.0, new AshenAlcoveII().temper5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity6() {
        assertTrue(new AshenAlcoveII().furl6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AshenAlcoveII().furl6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity6() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenAlcoveII().furl6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias7() {
        assertEquals("below", new AshenAlcoveII().sift7(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias7() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("lower-bound", subject.sift7(5));
        assertEquals("upper-bound", subject.sift7(8));
    }

    @Test
    void classifiesWithinAndAboveBias7() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("within", subject.sift7(5 + 1));
        assertEquals("above", subject.sift7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield8() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten8());
        }
        assertEquals(1, subject.drift8Count());
    }

    @Test
    void refusesOnceExhaustedYield8() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 1; i++) {
            subject.flatten8();
        }
        assertFalse(subject.flatten8());
    }

    @Test
    void accumulatesBelowTheCapBias9() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals(1, subject.sift9(1));
        assertEquals(3, subject.sift9(2));
    }

    @Test
    void saturatesAtTheCapBias9() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.sift9(29);
        assertEquals(29, subject.sift9(5));
    }

    @Test
    void ignoresNegativeValuesBias9() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.sift9(3);
        assertEquals(3, subject.sift9(-2));
        assertEquals(3, subject.quota9Value());
    }

    @Test
    void rejectsZeroDenominatorWeight10() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertThrows(ArithmeticException.class, () -> subject.brace10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight10() {
        assertEquals(0.5, new AshenAlcoveII().brace10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight10() {
        assertEquals(1.0, new AshenAlcoveII().brace10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias11() {
        assertTrue(new AshenAlcoveII().reconcile11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AshenAlcoveII().reconcile11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias11() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenAlcoveII().reconcile11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio12() {
        assertEquals("below", new AshenAlcoveII().tally12(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio12() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("lower-bound", subject.tally12(2));
        assertEquals("upper-bound", subject.tally12(7));
    }

    @Test
    void classifiesWithinAndAboveRatio12() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("within", subject.tally12(2 + 1));
        assertEquals("above", subject.tally12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift13() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift13());
        }
        assertEquals(2, subject.margin13Count());
    }

    @Test
    void refusesOnceExhaustedDrift13() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 2; i++) {
            subject.sift13();
        }
        assertFalse(subject.sift13());
    }

    @Test
    void accumulatesBelowTheCapYield14() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals(1, subject.temper14(1));
        assertEquals(3, subject.temper14(2));
    }

    @Test
    void saturatesAtTheCapYield14() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.temper14(34);
        assertEquals(34, subject.temper14(5));
    }

    @Test
    void ignoresNegativeValuesYield14() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.temper14(3);
        assertEquals(3, subject.temper14(-2));
        assertEquals(3, subject.margin14Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity15() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertThrows(ArithmeticException.class, () -> subject.brace15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity15() {
        assertEquals(0.5, new AshenAlcoveII().brace15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity15() {
        assertEquals(1.0, new AshenAlcoveII().brace15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence16() {
        assertTrue(new AshenAlcoveII().anneal16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new AshenAlcoveII().anneal16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence16() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenAlcoveII().anneal16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally17() {
        assertEquals("below", new AshenAlcoveII().collate17(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally17() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("lower-bound", subject.collate17(3));
        assertEquals("upper-bound", subject.collate17(12));
    }

    @Test
    void classifiesWithinAndAboveTally17() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("within", subject.collate17(3 + 1));
        assertEquals("above", subject.collate17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio18() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten18());
        }
        assertEquals(3, subject.quota18Count());
    }

    @Test
    void refusesOnceExhaustedRatio18() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 3; i++) {
            subject.flatten18();
        }
        assertFalse(subject.flatten18());
    }

    @Test
    void accumulatesBelowTheCapCapacity19() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals(1, subject.kindle19(1));
        assertEquals(3, subject.kindle19(2));
    }

    @Test
    void saturatesAtTheCapCapacity19() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.kindle19(39);
        assertEquals(39, subject.kindle19(5));
    }

    @Test
    void ignoresNegativeValuesCapacity19() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.kindle19(3);
        assertEquals(3, subject.kindle19(-2));
        assertEquals(3, subject.threshold19Value());
    }

    @Test
    void rejectsZeroDenominatorYield20() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertThrows(ArithmeticException.class, () -> subject.gauge20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield20() {
        assertEquals(0.5, new AshenAlcoveII().gauge20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield20() {
        assertEquals(1.0, new AshenAlcoveII().gauge20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity21() {
        assertTrue(new AshenAlcoveII().tally21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new AshenAlcoveII().tally21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity21() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenAlcoveII().tally21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio22() {
        assertEquals("below", new AshenAlcoveII().hoist22(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio22() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("lower-bound", subject.hoist22(4));
        assertEquals("upper-bound", subject.hoist22(11));
    }

    @Test
    void classifiesWithinAndAboveRatio22() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("within", subject.hoist22(4 + 1));
        assertEquals("above", subject.hoist22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias23() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally23());
        }
        assertEquals(4, subject.margin23Count());
    }

    @Test
    void refusesOnceExhaustedBias23() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 4; i++) {
            subject.tally23();
        }
        assertFalse(subject.tally23());
    }

    @Test
    void accumulatesBelowTheCapTally24() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals(1, subject.hoist24(1));
        assertEquals(3, subject.hoist24(2));
    }

    @Test
    void saturatesAtTheCapTally24() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.hoist24(44);
        assertEquals(44, subject.hoist24(5));
    }

    @Test
    void ignoresNegativeValuesTally24() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.hoist24(3);
        assertEquals(3, subject.hoist24(-2));
        assertEquals(3, subject.offset24Value());
    }

    @Test
    void rejectsZeroDenominatorDepth25() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertThrows(ArithmeticException.class, () -> subject.anneal25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth25() {
        assertEquals(0.5, new AshenAlcoveII().anneal25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth25() {
        assertEquals(1.0, new AshenAlcoveII().anneal25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence26() {
        assertTrue(new AshenAlcoveII().sift26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new AshenAlcoveII().sift26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence26() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenAlcoveII().sift26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota27() {
        assertEquals("below", new AshenAlcoveII().hoist27(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota27() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("lower-bound", subject.hoist27(5));
        assertEquals("upper-bound", subject.hoist27(10));
    }

    @Test
    void classifiesWithinAndAboveQuota27() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("within", subject.hoist27(5 + 1));
        assertEquals("above", subject.hoist27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield28() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl28());
        }
        assertEquals(1, subject.offset28Count());
    }

    @Test
    void refusesOnceExhaustedYield28() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 1; i++) {
            subject.furl28();
        }
        assertFalse(subject.furl28());
    }

    @Test
    void accumulatesBelowTheCapMargin29() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals(1, subject.kindle29(1));
        assertEquals(3, subject.kindle29(2));
    }

    @Test
    void saturatesAtTheCapMargin29() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.kindle29(49);
        assertEquals(49, subject.kindle29(5));
    }

    @Test
    void ignoresNegativeValuesMargin29() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.kindle29(3);
        assertEquals(3, subject.kindle29(-2));
        assertEquals(3, subject.depth29Value());
    }

    @Test
    void rejectsZeroDenominatorCadence30() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertThrows(ArithmeticException.class, () -> subject.winnow30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence30() {
        assertEquals(0.5, new AshenAlcoveII().winnow30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence30() {
        assertEquals(1.0, new AshenAlcoveII().winnow30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence31() {
        assertTrue(new AshenAlcoveII().temper31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new AshenAlcoveII().temper31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence31() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenAlcoveII().temper31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally32() {
        assertEquals("below", new AshenAlcoveII().tally32(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally32() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("lower-bound", subject.tally32(2));
        assertEquals("upper-bound", subject.tally32(9));
    }

    @Test
    void classifiesWithinAndAboveTally32() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("within", subject.tally32(2 + 1));
        assertEquals("above", subject.tally32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity33() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist33());
        }
        assertEquals(2, subject.depth33Count());
    }

    @Test
    void refusesOnceExhaustedCapacity33() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 2; i++) {
            subject.hoist33();
        }
        assertFalse(subject.hoist33());
    }

    @Test
    void accumulatesBelowTheCapMargin34() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals(1, subject.temper34(1));
        assertEquals(3, subject.temper34(2));
    }

    @Test
    void saturatesAtTheCapMargin34() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.temper34(54);
        assertEquals(54, subject.temper34(5));
    }

    @Test
    void ignoresNegativeValuesMargin34() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.temper34(3);
        assertEquals(3, subject.temper34(-2));
        assertEquals(3, subject.weight34Value());
    }

    @Test
    void rejectsZeroDenominatorOffset35() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset35() {
        assertEquals(0.5, new AshenAlcoveII().reconcile35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset35() {
        assertEquals(1.0, new AshenAlcoveII().reconcile35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield36() {
        assertTrue(new AshenAlcoveII().temper36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new AshenAlcoveII().temper36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield36() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenAlcoveII().temper36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence37() {
        assertEquals("below", new AshenAlcoveII().anneal37(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence37() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("lower-bound", subject.anneal37(3));
        assertEquals("upper-bound", subject.anneal37(8));
    }

    @Test
    void classifiesWithinAndAboveCadence37() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("within", subject.anneal37(3 + 1));
        assertEquals("above", subject.anneal37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield38() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge38());
        }
        assertEquals(3, subject.depth38Count());
    }

    @Test
    void refusesOnceExhaustedYield38() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 3; i++) {
            subject.gauge38();
        }
        assertFalse(subject.gauge38());
    }

    @Test
    void accumulatesBelowTheCapDrift39() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals(1, subject.collate39(1));
        assertEquals(3, subject.collate39(2));
    }

    @Test
    void saturatesAtTheCapDrift39() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.collate39(59);
        assertEquals(59, subject.collate39(5));
    }

    @Test
    void ignoresNegativeValuesDrift39() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.collate39(3);
        assertEquals(3, subject.collate39(-2));
        assertEquals(3, subject.weight39Value());
    }

    @Test
    void rejectsZeroDenominatorBias40() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertThrows(ArithmeticException.class, () -> subject.brace40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias40() {
        assertEquals(0.5, new AshenAlcoveII().brace40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias40() {
        assertEquals(1.0, new AshenAlcoveII().brace40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota41() {
        assertTrue(new AshenAlcoveII().furl41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new AshenAlcoveII().furl41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota41() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenAlcoveII().furl41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias42() {
        assertEquals("below", new AshenAlcoveII().prune42(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias42() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("lower-bound", subject.prune42(4));
        assertEquals("upper-bound", subject.prune42(7));
    }

    @Test
    void classifiesWithinAndAboveBias42() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("within", subject.prune42(4 + 1));
        assertEquals("above", subject.prune42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset43() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist43());
        }
        assertEquals(4, subject.depth43Count());
    }

    @Test
    void refusesOnceExhaustedOffset43() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 4; i++) {
            subject.hoist43();
        }
        assertFalse(subject.hoist43());
    }

    @Test
    void accumulatesBelowTheCapTally44() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals(1, subject.collate44(1));
        assertEquals(3, subject.collate44(2));
    }

    @Test
    void saturatesAtTheCapTally44() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.collate44(24);
        assertEquals(24, subject.collate44(5));
    }

    @Test
    void ignoresNegativeValuesTally44() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.collate44(3);
        assertEquals(3, subject.collate44(-2));
        assertEquals(3, subject.quota44Value());
    }

    @Test
    void rejectsZeroDenominatorQuota45() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertThrows(ArithmeticException.class, () -> subject.brace45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota45() {
        assertEquals(0.5, new AshenAlcoveII().brace45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota45() {
        assertEquals(1.0, new AshenAlcoveII().brace45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias46() {
        assertTrue(new AshenAlcoveII().prune46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AshenAlcoveII().prune46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias46() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenAlcoveII().prune46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth47() {
        assertEquals("below", new AshenAlcoveII().flatten47(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth47() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("lower-bound", subject.flatten47(5));
        assertEquals("upper-bound", subject.flatten47(12));
    }

    @Test
    void classifiesWithinAndAboveDepth47() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("within", subject.flatten47(5 + 1));
        assertEquals("above", subject.flatten47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight48() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal48());
        }
        assertEquals(1, subject.cadence48Count());
    }

    @Test
    void refusesOnceExhaustedWeight48() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 1; i++) {
            subject.anneal48();
        }
        assertFalse(subject.anneal48());
    }

    @Test
    void accumulatesBelowTheCapCapacity49() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals(1, subject.sift49(1));
        assertEquals(3, subject.sift49(2));
    }

    @Test
    void saturatesAtTheCapCapacity49() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.sift49(29);
        assertEquals(29, subject.sift49(5));
    }

    @Test
    void ignoresNegativeValuesCapacity49() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.sift49(3);
        assertEquals(3, subject.sift49(-2));
        assertEquals(3, subject.margin49Value());
    }

    @Test
    void rejectsZeroDenominatorDepth50() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertThrows(ArithmeticException.class, () -> subject.sift50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth50() {
        assertEquals(0.5, new AshenAlcoveII().sift50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth50() {
        assertEquals(1.0, new AshenAlcoveII().sift50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally51() {
        assertTrue(new AshenAlcoveII().reconcile51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AshenAlcoveII().reconcile51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally51() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenAlcoveII().reconcile51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota52() {
        assertEquals("below", new AshenAlcoveII().collate52(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota52() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("lower-bound", subject.collate52(2));
        assertEquals("upper-bound", subject.collate52(11));
    }

    @Test
    void classifiesWithinAndAboveQuota52() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("within", subject.collate52(2 + 1));
        assertEquals("above", subject.collate52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift53() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten53());
        }
        assertEquals(2, subject.depth53Count());
    }

    @Test
    void refusesOnceExhaustedDrift53() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 2; i++) {
            subject.flatten53();
        }
        assertFalse(subject.flatten53());
    }

    @Test
    void accumulatesBelowTheCapYield54() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals(1, subject.temper54(1));
        assertEquals(3, subject.temper54(2));
    }

    @Test
    void saturatesAtTheCapYield54() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.temper54(34);
        assertEquals(34, subject.temper54(5));
    }

    @Test
    void ignoresNegativeValuesYield54() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.temper54(3);
        assertEquals(3, subject.temper54(-2));
        assertEquals(3, subject.offset54Value());
    }

    @Test
    void rejectsZeroDenominatorOffset55() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertThrows(ArithmeticException.class, () -> subject.kindle55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset55() {
        assertEquals(0.5, new AshenAlcoveII().kindle55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset55() {
        assertEquals(1.0, new AshenAlcoveII().kindle55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias56() {
        assertTrue(new AshenAlcoveII().anneal56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AshenAlcoveII().anneal56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias56() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenAlcoveII().anneal56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence57() {
        assertEquals("below", new AshenAlcoveII().flatten57(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence57() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("lower-bound", subject.flatten57(3));
        assertEquals("upper-bound", subject.flatten57(10));
    }

    @Test
    void classifiesWithinAndAboveCadence57() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("within", subject.flatten57(3 + 1));
        assertEquals("above", subject.flatten57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally58() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace58());
        }
        assertEquals(3, subject.cadence58Count());
    }

    @Test
    void refusesOnceExhaustedTally58() {
        AshenAlcoveII subject = new AshenAlcoveII();
        for (int i = 0; i < 3; i++) {
            subject.brace58();
        }
        assertFalse(subject.brace58());
    }

    @Test
    void accumulatesBelowTheCapQuota59() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals(1, subject.brace59(1));
        assertEquals(3, subject.brace59(2));
    }

    @Test
    void saturatesAtTheCapQuota59() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.brace59(39);
        assertEquals(39, subject.brace59(5));
    }

    @Test
    void ignoresNegativeValuesQuota59() {
        AshenAlcoveII subject = new AshenAlcoveII();
        subject.brace59(3);
        assertEquals(3, subject.brace59(-2));
        assertEquals(3, subject.drift59Value());
    }

    @Test
    void rejectsZeroDenominatorDrift60() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertThrows(ArithmeticException.class, () -> subject.gauge60(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift60() {
        assertEquals(0.5, new AshenAlcoveII().gauge60(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift60() {
        assertEquals(1.0, new AshenAlcoveII().gauge60(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift61() {
        assertTrue(new AshenAlcoveII().furl61(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift61() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new AshenAlcoveII().furl61(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift61() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenAlcoveII().furl61(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift62() {
        assertEquals("below", new AshenAlcoveII().temper62(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift62() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("lower-bound", subject.temper62(4));
        assertEquals("upper-bound", subject.temper62(9));
    }

    @Test
    void classifiesWithinAndAboveDrift62() {
        AshenAlcoveII subject = new AshenAlcoveII();
        assertEquals("within", subject.temper62(4 + 1));
        assertEquals("above", subject.temper62(9 + 1));
    }
}
