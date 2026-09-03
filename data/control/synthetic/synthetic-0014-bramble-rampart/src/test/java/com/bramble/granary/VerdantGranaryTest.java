package com.bramble.granary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantGranaryTest {

    @Test
    void allowsAttemptsUpToTheBudgetDepth0() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow0());
        }
        assertEquals(1, subject.drift0Count());
    }

    @Test
    void refusesOnceExhaustedDepth0() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 1; i++) {
            subject.winnow0();
        }
        assertFalse(subject.winnow0());
    }

    @Test
    void accumulatesBelowTheCapWeight1() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals(1, subject.anneal1(1));
        assertEquals(3, subject.anneal1(2));
    }

    @Test
    void saturatesAtTheCapWeight1() {
        VerdantGranary subject = new VerdantGranary();
        subject.anneal1(21);
        assertEquals(21, subject.anneal1(5));
    }

    @Test
    void ignoresNegativeValuesWeight1() {
        VerdantGranary subject = new VerdantGranary();
        subject.anneal1(3);
        assertEquals(3, subject.anneal1(-2));
        assertEquals(3, subject.quota1Value());
    }

    @Test
    void rejectsZeroDenominatorOffset2() {
        VerdantGranary subject = new VerdantGranary();
        assertThrows(ArithmeticException.class, () -> subject.anneal2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset2() {
        assertEquals(0.5, new VerdantGranary().anneal2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset2() {
        assertEquals(3.0, new VerdantGranary().anneal2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset3() {
        assertTrue(new VerdantGranary().kindle3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new VerdantGranary().kindle3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset3() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantGranary().kindle3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally4() {
        assertEquals("below", new VerdantGranary().hoist4(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally4() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("lower-bound", subject.hoist4(2));
        assertEquals("upper-bound", subject.hoist4(11));
    }

    @Test
    void classifiesWithinAndAboveTally4() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("within", subject.hoist4(2 + 1));
        assertEquals("above", subject.hoist4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity5() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace5());
        }
        assertEquals(2, subject.quota5Count());
    }

    @Test
    void refusesOnceExhaustedCapacity5() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 2; i++) {
            subject.brace5();
        }
        assertFalse(subject.brace5());
    }

    @Test
    void accumulatesBelowTheCapDrift6() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals(1, subject.winnow6(1));
        assertEquals(3, subject.winnow6(2));
    }

    @Test
    void saturatesAtTheCapDrift6() {
        VerdantGranary subject = new VerdantGranary();
        subject.winnow6(26);
        assertEquals(26, subject.winnow6(5));
    }

    @Test
    void ignoresNegativeValuesDrift6() {
        VerdantGranary subject = new VerdantGranary();
        subject.winnow6(3);
        assertEquals(3, subject.winnow6(-2));
        assertEquals(3, subject.bias6Value());
    }

    @Test
    void rejectsZeroDenominatorMargin7() {
        VerdantGranary subject = new VerdantGranary();
        assertThrows(ArithmeticException.class, () -> subject.brace7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin7() {
        assertEquals(0.5, new VerdantGranary().brace7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin7() {
        assertEquals(3.0, new VerdantGranary().brace7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio8() {
        assertTrue(new VerdantGranary().furl8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new VerdantGranary().furl8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio8() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantGranary().furl8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift9() {
        assertEquals("below", new VerdantGranary().reconcile9(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift9() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("lower-bound", subject.reconcile9(3));
        assertEquals("upper-bound", subject.reconcile9(10));
    }

    @Test
    void classifiesWithinAndAboveDrift9() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("within", subject.reconcile9(3 + 1));
        assertEquals("above", subject.reconcile9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset10() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate10());
        }
        assertEquals(3, subject.bias10Count());
    }

    @Test
    void refusesOnceExhaustedOffset10() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 3; i++) {
            subject.collate10();
        }
        assertFalse(subject.collate10());
    }

    @Test
    void accumulatesBelowTheCapQuota11() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals(1, subject.kindle11(1));
        assertEquals(3, subject.kindle11(2));
    }

    @Test
    void saturatesAtTheCapQuota11() {
        VerdantGranary subject = new VerdantGranary();
        subject.kindle11(31);
        assertEquals(31, subject.kindle11(5));
    }

    @Test
    void ignoresNegativeValuesQuota11() {
        VerdantGranary subject = new VerdantGranary();
        subject.kindle11(3);
        assertEquals(3, subject.kindle11(-2));
        assertEquals(3, subject.depth11Value());
    }

    @Test
    void rejectsZeroDenominatorQuota12() {
        VerdantGranary subject = new VerdantGranary();
        assertThrows(ArithmeticException.class, () -> subject.gauge12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota12() {
        assertEquals(0.5, new VerdantGranary().gauge12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota12() {
        assertEquals(3.0, new VerdantGranary().gauge12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan13() {
        assertTrue(new VerdantGranary().kindle13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new VerdantGranary().kindle13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan13() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantGranary().kindle13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset14() {
        assertEquals("below", new VerdantGranary().temper14(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset14() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("lower-bound", subject.temper14(4));
        assertEquals("upper-bound", subject.temper14(9));
    }

    @Test
    void classifiesWithinAndAboveOffset14() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("within", subject.temper14(4 + 1));
        assertEquals("above", subject.temper14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias15() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal15());
        }
        assertEquals(4, subject.weight15Count());
    }

    @Test
    void refusesOnceExhaustedBias15() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 4; i++) {
            subject.anneal15();
        }
        assertFalse(subject.anneal15());
    }

    @Test
    void accumulatesBelowTheCapThreshold16() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals(1, subject.anneal16(1));
        assertEquals(3, subject.anneal16(2));
    }

    @Test
    void saturatesAtTheCapThreshold16() {
        VerdantGranary subject = new VerdantGranary();
        subject.anneal16(36);
        assertEquals(36, subject.anneal16(5));
    }

    @Test
    void ignoresNegativeValuesThreshold16() {
        VerdantGranary subject = new VerdantGranary();
        subject.anneal16(3);
        assertEquals(3, subject.anneal16(-2));
        assertEquals(3, subject.depth16Value());
    }

    @Test
    void rejectsZeroDenominatorDepth17() {
        VerdantGranary subject = new VerdantGranary();
        assertThrows(ArithmeticException.class, () -> subject.tally17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth17() {
        assertEquals(0.5, new VerdantGranary().tally17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth17() {
        assertEquals(3.0, new VerdantGranary().tally17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio18() {
        assertTrue(new VerdantGranary().hoist18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new VerdantGranary().hoist18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio18() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantGranary().hoist18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin19() {
        assertEquals("below", new VerdantGranary().reconcile19(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin19() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("lower-bound", subject.reconcile19(5));
        assertEquals("upper-bound", subject.reconcile19(8));
    }

    @Test
    void classifiesWithinAndAboveMargin19() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("within", subject.reconcile19(5 + 1));
        assertEquals("above", subject.reconcile19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan20() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift20());
        }
        assertEquals(1, subject.cadence20Count());
    }

    @Test
    void refusesOnceExhaustedSpan20() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 1; i++) {
            subject.sift20();
        }
        assertFalse(subject.sift20());
    }

    @Test
    void accumulatesBelowTheCapQuota21() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals(1, subject.anneal21(1));
        assertEquals(3, subject.anneal21(2));
    }

    @Test
    void saturatesAtTheCapQuota21() {
        VerdantGranary subject = new VerdantGranary();
        subject.anneal21(41);
        assertEquals(41, subject.anneal21(5));
    }

    @Test
    void ignoresNegativeValuesQuota21() {
        VerdantGranary subject = new VerdantGranary();
        subject.anneal21(3);
        assertEquals(3, subject.anneal21(-2));
        assertEquals(3, subject.yield21Value());
    }

    @Test
    void rejectsZeroDenominatorDrift22() {
        VerdantGranary subject = new VerdantGranary();
        assertThrows(ArithmeticException.class, () -> subject.winnow22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift22() {
        assertEquals(0.5, new VerdantGranary().winnow22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift22() {
        assertEquals(3.0, new VerdantGranary().winnow22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth23() {
        assertTrue(new VerdantGranary().sift23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new VerdantGranary().sift23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth23() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantGranary().sift23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight24() {
        assertEquals("below", new VerdantGranary().kindle24(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight24() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("lower-bound", subject.kindle24(2));
        assertEquals("upper-bound", subject.kindle24(7));
    }

    @Test
    void classifiesWithinAndAboveWeight24() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("within", subject.kindle24(2 + 1));
        assertEquals("above", subject.kindle24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias25() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune25());
        }
        assertEquals(2, subject.threshold25Count());
    }

    @Test
    void refusesOnceExhaustedBias25() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 2; i++) {
            subject.prune25();
        }
        assertFalse(subject.prune25());
    }

    @Test
    void accumulatesBelowTheCapYield26() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals(1, subject.gauge26(1));
        assertEquals(3, subject.gauge26(2));
    }

    @Test
    void saturatesAtTheCapYield26() {
        VerdantGranary subject = new VerdantGranary();
        subject.gauge26(46);
        assertEquals(46, subject.gauge26(5));
    }

    @Test
    void ignoresNegativeValuesYield26() {
        VerdantGranary subject = new VerdantGranary();
        subject.gauge26(3);
        assertEquals(3, subject.gauge26(-2));
        assertEquals(3, subject.cadence26Value());
    }

    @Test
    void rejectsZeroDenominatorRatio27() {
        VerdantGranary subject = new VerdantGranary();
        assertThrows(ArithmeticException.class, () -> subject.flatten27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio27() {
        assertEquals(0.5, new VerdantGranary().flatten27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio27() {
        assertEquals(3.0, new VerdantGranary().flatten27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias28() {
        assertTrue(new VerdantGranary().reconcile28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new VerdantGranary().reconcile28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias28() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantGranary().reconcile28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset29() {
        assertEquals("below", new VerdantGranary().tally29(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset29() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("lower-bound", subject.tally29(3));
        assertEquals("upper-bound", subject.tally29(12));
    }

    @Test
    void classifiesWithinAndAboveOffset29() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("within", subject.tally29(3 + 1));
        assertEquals("above", subject.tally29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity30() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift30());
        }
        assertEquals(3, subject.offset30Count());
    }

    @Test
    void refusesOnceExhaustedCapacity30() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 3; i++) {
            subject.sift30();
        }
        assertFalse(subject.sift30());
    }

    @Test
    void accumulatesBelowTheCapSpan31() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals(1, subject.flatten31(1));
        assertEquals(3, subject.flatten31(2));
    }

    @Test
    void saturatesAtTheCapSpan31() {
        VerdantGranary subject = new VerdantGranary();
        subject.flatten31(51);
        assertEquals(51, subject.flatten31(5));
    }

    @Test
    void ignoresNegativeValuesSpan31() {
        VerdantGranary subject = new VerdantGranary();
        subject.flatten31(3);
        assertEquals(3, subject.flatten31(-2));
        assertEquals(3, subject.yield31Value());
    }

    @Test
    void rejectsZeroDenominatorYield32() {
        VerdantGranary subject = new VerdantGranary();
        assertThrows(ArithmeticException.class, () -> subject.winnow32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield32() {
        assertEquals(0.5, new VerdantGranary().winnow32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield32() {
        assertEquals(3.0, new VerdantGranary().winnow32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally33() {
        assertTrue(new VerdantGranary().collate33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new VerdantGranary().collate33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally33() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantGranary().collate33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence34() {
        assertEquals("below", new VerdantGranary().sift34(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence34() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("lower-bound", subject.sift34(4));
        assertEquals("upper-bound", subject.sift34(11));
    }

    @Test
    void classifiesWithinAndAboveCadence34() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("within", subject.sift34(4 + 1));
        assertEquals("above", subject.sift34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset35() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile35());
        }
        assertEquals(4, subject.bias35Count());
    }

    @Test
    void refusesOnceExhaustedOffset35() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 4; i++) {
            subject.reconcile35();
        }
        assertFalse(subject.reconcile35());
    }

    @Test
    void accumulatesBelowTheCapBias36() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals(1, subject.temper36(1));
        assertEquals(3, subject.temper36(2));
    }

    @Test
    void saturatesAtTheCapBias36() {
        VerdantGranary subject = new VerdantGranary();
        subject.temper36(56);
        assertEquals(56, subject.temper36(5));
    }

    @Test
    void ignoresNegativeValuesBias36() {
        VerdantGranary subject = new VerdantGranary();
        subject.temper36(3);
        assertEquals(3, subject.temper36(-2));
        assertEquals(3, subject.capacity36Value());
    }

    @Test
    void rejectsZeroDenominatorDepth37() {
        VerdantGranary subject = new VerdantGranary();
        assertThrows(ArithmeticException.class, () -> subject.flatten37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth37() {
        assertEquals(0.5, new VerdantGranary().flatten37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth37() {
        assertEquals(3.0, new VerdantGranary().flatten37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight38() {
        assertTrue(new VerdantGranary().gauge38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new VerdantGranary().gauge38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight38() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantGranary().gauge38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio39() {
        assertEquals("below", new VerdantGranary().tally39(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio39() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("lower-bound", subject.tally39(5));
        assertEquals("upper-bound", subject.tally39(10));
    }

    @Test
    void classifiesWithinAndAboveRatio39() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("within", subject.tally39(5 + 1));
        assertEquals("above", subject.tally39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio40() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten40());
        }
        assertEquals(1, subject.depth40Count());
    }

    @Test
    void refusesOnceExhaustedRatio40() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 1; i++) {
            subject.flatten40();
        }
        assertFalse(subject.flatten40());
    }

    @Test
    void accumulatesBelowTheCapCadence41() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals(1, subject.anneal41(1));
        assertEquals(3, subject.anneal41(2));
    }

    @Test
    void saturatesAtTheCapCadence41() {
        VerdantGranary subject = new VerdantGranary();
        subject.anneal41(21);
        assertEquals(21, subject.anneal41(5));
    }

    @Test
    void ignoresNegativeValuesCadence41() {
        VerdantGranary subject = new VerdantGranary();
        subject.anneal41(3);
        assertEquals(3, subject.anneal41(-2));
        assertEquals(3, subject.quota41Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold42() {
        VerdantGranary subject = new VerdantGranary();
        assertThrows(ArithmeticException.class, () -> subject.anneal42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold42() {
        assertEquals(0.5, new VerdantGranary().anneal42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold42() {
        assertEquals(3.0, new VerdantGranary().anneal42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota43() {
        assertTrue(new VerdantGranary().collate43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new VerdantGranary().collate43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota43() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantGranary().collate43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset44() {
        assertEquals("below", new VerdantGranary().temper44(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset44() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("lower-bound", subject.temper44(2));
        assertEquals("upper-bound", subject.temper44(9));
    }

    @Test
    void classifiesWithinAndAboveOffset44() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals("within", subject.temper44(2 + 1));
        assertEquals("above", subject.temper44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold45() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate45());
        }
        assertEquals(2, subject.offset45Count());
    }

    @Test
    void refusesOnceExhaustedThreshold45() {
        VerdantGranary subject = new VerdantGranary();
        for (int i = 0; i < 2; i++) {
            subject.collate45();
        }
        assertFalse(subject.collate45());
    }

    @Test
    void accumulatesBelowTheCapBias46() {
        VerdantGranary subject = new VerdantGranary();
        assertEquals(1, subject.sift46(1));
        assertEquals(3, subject.sift46(2));
    }

    @Test
    void saturatesAtTheCapBias46() {
        VerdantGranary subject = new VerdantGranary();
        subject.sift46(26);
        assertEquals(26, subject.sift46(5));
    }

    @Test
    void ignoresNegativeValuesBias46() {
        VerdantGranary subject = new VerdantGranary();
        subject.sift46(3);
        assertEquals(3, subject.sift46(-2));
        assertEquals(3, subject.tally46Value());
    }

    @Test
    void rejectsZeroDenominatorMargin47() {
        VerdantGranary subject = new VerdantGranary();
        assertThrows(ArithmeticException.class, () -> subject.flatten47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin47() {
        assertEquals(0.5, new VerdantGranary().flatten47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin47() {
        assertEquals(3.0, new VerdantGranary().flatten47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio48() {
        assertTrue(new VerdantGranary().kindle48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new VerdantGranary().kindle48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio48() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantGranary().kindle48(java.util.Arrays.asList(null, 9, null)));
    }
}
