package com.tidal.meridian;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenPylonTest {

    @Test
    void allowsAttemptsUpToTheBudgetDepth0() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge0());
        }
        assertEquals(1, subject.quota0Count());
    }

    @Test
    void refusesOnceExhaustedDepth0() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            subject.gauge0();
        }
        assertFalse(subject.gauge0());
    }

    @Test
    void accumulatesBelowTheCapThreshold1() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.sift1(1));
        assertEquals(3, subject.sift1(2));
    }

    @Test
    void saturatesAtTheCapThreshold1() {
        AshenPylon subject = new AshenPylon();
        subject.sift1(21);
        assertEquals(21, subject.sift1(5));
    }

    @Test
    void ignoresNegativeValuesThreshold1() {
        AshenPylon subject = new AshenPylon();
        subject.sift1(3);
        assertEquals(3, subject.sift1(-2));
        assertEquals(3, subject.margin1Value());
    }

    @Test
    void rejectsZeroDenominatorBias2() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.collate2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias2() {
        assertEquals(0.5, new AshenPylon().collate2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias2() {
        assertEquals(3.0, new AshenPylon().collate2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias3() {
        assertTrue(new AshenPylon().sift3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AshenPylon().sift3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias3() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenPylon().sift3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota4() {
        assertEquals("below", new AshenPylon().furl4(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota4() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.furl4(2));
        assertEquals("upper-bound", subject.furl4(11));
    }

    @Test
    void classifiesWithinAndAboveQuota4() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.furl4(2 + 1));
        assertEquals("above", subject.furl4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin5() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl5());
        }
        assertEquals(2, subject.capacity5Count());
    }

    @Test
    void refusesOnceExhaustedMargin5() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            subject.furl5();
        }
        assertFalse(subject.furl5());
    }

    @Test
    void accumulatesBelowTheCapMargin6() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.prune6(1));
        assertEquals(3, subject.prune6(2));
    }

    @Test
    void saturatesAtTheCapMargin6() {
        AshenPylon subject = new AshenPylon();
        subject.prune6(26);
        assertEquals(26, subject.prune6(5));
    }

    @Test
    void ignoresNegativeValuesMargin6() {
        AshenPylon subject = new AshenPylon();
        subject.prune6(3);
        assertEquals(3, subject.prune6(-2));
        assertEquals(3, subject.weight6Value());
    }

    @Test
    void rejectsZeroDenominatorBias7() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias7() {
        assertEquals(0.5, new AshenPylon().kindle7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias7() {
        assertEquals(3.0, new AshenPylon().kindle7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally8() {
        assertTrue(new AshenPylon().reconcile8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AshenPylon().reconcile8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally8() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenPylon().reconcile8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth9() {
        assertEquals("below", new AshenPylon().hoist9(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth9() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.hoist9(3));
        assertEquals("upper-bound", subject.hoist9(10));
    }

    @Test
    void classifiesWithinAndAboveDepth9() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.hoist9(3 + 1));
        assertEquals("above", subject.hoist9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence10() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper10());
        }
        assertEquals(3, subject.capacity10Count());
    }

    @Test
    void refusesOnceExhaustedCadence10() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            subject.temper10();
        }
        assertFalse(subject.temper10());
    }

    @Test
    void accumulatesBelowTheCapRatio11() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.tally11(1));
        assertEquals(3, subject.tally11(2));
    }

    @Test
    void saturatesAtTheCapRatio11() {
        AshenPylon subject = new AshenPylon();
        subject.tally11(31);
        assertEquals(31, subject.tally11(5));
    }

    @Test
    void ignoresNegativeValuesRatio11() {
        AshenPylon subject = new AshenPylon();
        subject.tally11(3);
        assertEquals(3, subject.tally11(-2));
        assertEquals(3, subject.margin11Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity12() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity12() {
        assertEquals(0.5, new AshenPylon().temper12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity12() {
        assertEquals(3.0, new AshenPylon().temper12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias13() {
        assertTrue(new AshenPylon().sift13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AshenPylon().sift13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias13() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenPylon().sift13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth14() {
        assertEquals("below", new AshenPylon().furl14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth14() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.furl14(4));
        assertEquals("upper-bound", subject.furl14(9));
    }

    @Test
    void classifiesWithinAndAboveDepth14() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.furl14(4 + 1));
        assertEquals("above", subject.furl14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift15() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally15());
        }
        assertEquals(4, subject.span15Count());
    }

    @Test
    void refusesOnceExhaustedDrift15() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            subject.tally15();
        }
        assertFalse(subject.tally15());
    }

    @Test
    void accumulatesBelowTheCapRatio16() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.gauge16(1));
        assertEquals(3, subject.gauge16(2));
    }

    @Test
    void saturatesAtTheCapRatio16() {
        AshenPylon subject = new AshenPylon();
        subject.gauge16(36);
        assertEquals(36, subject.gauge16(5));
    }

    @Test
    void ignoresNegativeValuesRatio16() {
        AshenPylon subject = new AshenPylon();
        subject.gauge16(3);
        assertEquals(3, subject.gauge16(-2));
        assertEquals(3, subject.cadence16Value());
    }

    @Test
    void rejectsZeroDenominatorWeight17() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.prune17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight17() {
        assertEquals(0.5, new AshenPylon().prune17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight17() {
        assertEquals(3.0, new AshenPylon().prune17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence18() {
        assertTrue(new AshenPylon().furl18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AshenPylon().furl18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence18() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenPylon().furl18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan19() {
        assertEquals("below", new AshenPylon().kindle19(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan19() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.kindle19(5));
        assertEquals("upper-bound", subject.kindle19(8));
    }

    @Test
    void classifiesWithinAndAboveSpan19() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.kindle19(5 + 1));
        assertEquals("above", subject.kindle19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias20() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune20());
        }
        assertEquals(1, subject.yield20Count());
    }

    @Test
    void refusesOnceExhaustedBias20() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            subject.prune20();
        }
        assertFalse(subject.prune20());
    }

    @Test
    void accumulatesBelowTheCapThreshold21() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.reconcile21(1));
        assertEquals(3, subject.reconcile21(2));
    }

    @Test
    void saturatesAtTheCapThreshold21() {
        AshenPylon subject = new AshenPylon();
        subject.reconcile21(41);
        assertEquals(41, subject.reconcile21(5));
    }

    @Test
    void ignoresNegativeValuesThreshold21() {
        AshenPylon subject = new AshenPylon();
        subject.reconcile21(3);
        assertEquals(3, subject.reconcile21(-2));
        assertEquals(3, subject.depth21Value());
    }

    @Test
    void rejectsZeroDenominatorWeight22() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.collate22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight22() {
        assertEquals(0.5, new AshenPylon().collate22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight22() {
        assertEquals(3.0, new AshenPylon().collate22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin23() {
        assertTrue(new AshenPylon().anneal23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new AshenPylon().anneal23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin23() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenPylon().anneal23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset24() {
        assertEquals("below", new AshenPylon().gauge24(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset24() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.gauge24(2));
        assertEquals("upper-bound", subject.gauge24(7));
    }

    @Test
    void classifiesWithinAndAboveOffset24() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.gauge24(2 + 1));
        assertEquals("above", subject.gauge24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight25() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal25());
        }
        assertEquals(2, subject.tally25Count());
    }

    @Test
    void refusesOnceExhaustedWeight25() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            subject.anneal25();
        }
        assertFalse(subject.anneal25());
    }

    @Test
    void accumulatesBelowTheCapCapacity26() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.reconcile26(1));
        assertEquals(3, subject.reconcile26(2));
    }

    @Test
    void saturatesAtTheCapCapacity26() {
        AshenPylon subject = new AshenPylon();
        subject.reconcile26(46);
        assertEquals(46, subject.reconcile26(5));
    }

    @Test
    void ignoresNegativeValuesCapacity26() {
        AshenPylon subject = new AshenPylon();
        subject.reconcile26(3);
        assertEquals(3, subject.reconcile26(-2));
        assertEquals(3, subject.ratio26Value());
    }

    @Test
    void rejectsZeroDenominatorBias27() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias27() {
        assertEquals(0.5, new AshenPylon().hoist27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias27() {
        assertEquals(3.0, new AshenPylon().hoist27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight28() {
        assertTrue(new AshenPylon().winnow28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new AshenPylon().winnow28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight28() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenPylon().winnow28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota29() {
        assertEquals("below", new AshenPylon().kindle29(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota29() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.kindle29(3));
        assertEquals("upper-bound", subject.kindle29(12));
    }

    @Test
    void classifiesWithinAndAboveQuota29() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.kindle29(3 + 1));
        assertEquals("above", subject.kindle29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset30() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune30());
        }
        assertEquals(3, subject.margin30Count());
    }

    @Test
    void refusesOnceExhaustedOffset30() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            subject.prune30();
        }
        assertFalse(subject.prune30());
    }

    @Test
    void accumulatesBelowTheCapQuota31() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.tally31(1));
        assertEquals(3, subject.tally31(2));
    }

    @Test
    void saturatesAtTheCapQuota31() {
        AshenPylon subject = new AshenPylon();
        subject.tally31(51);
        assertEquals(51, subject.tally31(5));
    }

    @Test
    void ignoresNegativeValuesQuota31() {
        AshenPylon subject = new AshenPylon();
        subject.tally31(3);
        assertEquals(3, subject.tally31(-2));
        assertEquals(3, subject.ratio31Value());
    }

    @Test
    void rejectsZeroDenominatorDrift32() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift32() {
        assertEquals(0.5, new AshenPylon().kindle32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift32() {
        assertEquals(3.0, new AshenPylon().kindle32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset33() {
        assertTrue(new AshenPylon().temper33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new AshenPylon().temper33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset33() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenPylon().temper33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio34() {
        assertEquals("below", new AshenPylon().winnow34(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio34() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.winnow34(4));
        assertEquals("upper-bound", subject.winnow34(11));
    }

    @Test
    void classifiesWithinAndAboveRatio34() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.winnow34(4 + 1));
        assertEquals("above", subject.winnow34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence35() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal35());
        }
        assertEquals(4, subject.weight35Count());
    }

    @Test
    void refusesOnceExhaustedCadence35() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            subject.anneal35();
        }
        assertFalse(subject.anneal35());
    }

    @Test
    void accumulatesBelowTheCapCadence36() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.anneal36(1));
        assertEquals(3, subject.anneal36(2));
    }

    @Test
    void saturatesAtTheCapCadence36() {
        AshenPylon subject = new AshenPylon();
        subject.anneal36(56);
        assertEquals(56, subject.anneal36(5));
    }

    @Test
    void ignoresNegativeValuesCadence36() {
        AshenPylon subject = new AshenPylon();
        subject.anneal36(3);
        assertEquals(3, subject.anneal36(-2));
        assertEquals(3, subject.ratio36Value());
    }

    @Test
    void rejectsZeroDenominatorBias37() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias37() {
        assertEquals(0.5, new AshenPylon().hoist37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias37() {
        assertEquals(3.0, new AshenPylon().hoist37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold38() {
        assertTrue(new AshenPylon().sift38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new AshenPylon().sift38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold38() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenPylon().sift38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence39() {
        assertEquals("below", new AshenPylon().tally39(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence39() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.tally39(5));
        assertEquals("upper-bound", subject.tally39(10));
    }

    @Test
    void classifiesWithinAndAboveCadence39() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.tally39(5 + 1));
        assertEquals("above", subject.tally39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio40() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace40());
        }
        assertEquals(1, subject.depth40Count());
    }

    @Test
    void refusesOnceExhaustedRatio40() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            subject.brace40();
        }
        assertFalse(subject.brace40());
    }

    @Test
    void accumulatesBelowTheCapBias41() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.brace41(1));
        assertEquals(3, subject.brace41(2));
    }

    @Test
    void saturatesAtTheCapBias41() {
        AshenPylon subject = new AshenPylon();
        subject.brace41(21);
        assertEquals(21, subject.brace41(5));
    }

    @Test
    void ignoresNegativeValuesBias41() {
        AshenPylon subject = new AshenPylon();
        subject.brace41(3);
        assertEquals(3, subject.brace41(-2));
        assertEquals(3, subject.weight41Value());
    }

    @Test
    void rejectsZeroDenominatorOffset42() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.brace42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset42() {
        assertEquals(0.5, new AshenPylon().brace42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset42() {
        assertEquals(3.0, new AshenPylon().brace42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift43() {
        assertTrue(new AshenPylon().flatten43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new AshenPylon().flatten43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift43() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenPylon().flatten43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota44() {
        assertEquals("below", new AshenPylon().anneal44(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota44() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.anneal44(2));
        assertEquals("upper-bound", subject.anneal44(9));
    }

    @Test
    void classifiesWithinAndAboveQuota44() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.anneal44(2 + 1));
        assertEquals("above", subject.anneal44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin45() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace45());
        }
        assertEquals(2, subject.cadence45Count());
    }

    @Test
    void refusesOnceExhaustedMargin45() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            subject.brace45();
        }
        assertFalse(subject.brace45());
    }

    @Test
    void accumulatesBelowTheCapMargin46() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.furl46(1));
        assertEquals(3, subject.furl46(2));
    }

    @Test
    void saturatesAtTheCapMargin46() {
        AshenPylon subject = new AshenPylon();
        subject.furl46(26);
        assertEquals(26, subject.furl46(5));
    }

    @Test
    void ignoresNegativeValuesMargin46() {
        AshenPylon subject = new AshenPylon();
        subject.furl46(3);
        assertEquals(3, subject.furl46(-2));
        assertEquals(3, subject.cadence46Value());
    }

    @Test
    void rejectsZeroDenominatorYield47() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.prune47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield47() {
        assertEquals(0.5, new AshenPylon().prune47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield47() {
        assertEquals(3.0, new AshenPylon().prune47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio48() {
        assertTrue(new AshenPylon().reconcile48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AshenPylon().reconcile48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio48() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenPylon().reconcile48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset49() {
        assertEquals("below", new AshenPylon().temper49(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset49() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.temper49(3));
        assertEquals("upper-bound", subject.temper49(8));
    }

    @Test
    void classifiesWithinAndAboveOffset49() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.temper49(3 + 1));
        assertEquals("above", subject.temper49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota50() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow50());
        }
        assertEquals(3, subject.bias50Count());
    }

    @Test
    void refusesOnceExhaustedQuota50() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            subject.winnow50();
        }
        assertFalse(subject.winnow50());
    }

    @Test
    void accumulatesBelowTheCapQuota51() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.kindle51(1));
        assertEquals(3, subject.kindle51(2));
    }

    @Test
    void saturatesAtTheCapQuota51() {
        AshenPylon subject = new AshenPylon();
        subject.kindle51(31);
        assertEquals(31, subject.kindle51(5));
    }

    @Test
    void ignoresNegativeValuesQuota51() {
        AshenPylon subject = new AshenPylon();
        subject.kindle51(3);
        assertEquals(3, subject.kindle51(-2));
        assertEquals(3, subject.ratio51Value());
    }

    @Test
    void rejectsZeroDenominatorCadence52() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.winnow52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence52() {
        assertEquals(0.5, new AshenPylon().winnow52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence52() {
        assertEquals(3.0, new AshenPylon().winnow52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio53() {
        assertTrue(new AshenPylon().brace53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AshenPylon().brace53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio53() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenPylon().brace53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift54() {
        assertEquals("below", new AshenPylon().prune54(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift54() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.prune54(4));
        assertEquals("upper-bound", subject.prune54(7));
    }

    @Test
    void classifiesWithinAndAboveDrift54() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.prune54(4 + 1));
        assertEquals("above", subject.prune54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight55() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist55());
        }
        assertEquals(4, subject.cadence55Count());
    }

    @Test
    void refusesOnceExhaustedWeight55() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            subject.hoist55();
        }
        assertFalse(subject.hoist55());
    }

    @Test
    void accumulatesBelowTheCapCapacity56() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.tally56(1));
        assertEquals(3, subject.tally56(2));
    }

    @Test
    void saturatesAtTheCapCapacity56() {
        AshenPylon subject = new AshenPylon();
        subject.tally56(36);
        assertEquals(36, subject.tally56(5));
    }

    @Test
    void ignoresNegativeValuesCapacity56() {
        AshenPylon subject = new AshenPylon();
        subject.tally56(3);
        assertEquals(3, subject.tally56(-2));
        assertEquals(3, subject.margin56Value());
    }

    @Test
    void rejectsZeroDenominatorTally57() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally57() {
        assertEquals(0.5, new AshenPylon().sift57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally57() {
        assertEquals(3.0, new AshenPylon().sift57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence58() {
        assertTrue(new AshenPylon().winnow58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AshenPylon().winnow58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence58() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenPylon().winnow58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity59() {
        assertEquals("below", new AshenPylon().hoist59(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity59() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.hoist59(5));
        assertEquals("upper-bound", subject.hoist59(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity59() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.hoist59(5 + 1));
        assertEquals("above", subject.hoist59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold60() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge60());
        }
        assertEquals(1, subject.bias60Count());
    }

    @Test
    void refusesOnceExhaustedThreshold60() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            subject.gauge60();
        }
        assertFalse(subject.gauge60());
    }

    @Test
    void accumulatesBelowTheCapCapacity61() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.reconcile61(1));
        assertEquals(3, subject.reconcile61(2));
    }

    @Test
    void saturatesAtTheCapCapacity61() {
        AshenPylon subject = new AshenPylon();
        subject.reconcile61(41);
        assertEquals(41, subject.reconcile61(5));
    }

    @Test
    void ignoresNegativeValuesCapacity61() {
        AshenPylon subject = new AshenPylon();
        subject.reconcile61(3);
        assertEquals(3, subject.reconcile61(-2));
        assertEquals(3, subject.threshold61Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity62() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.winnow62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity62() {
        assertEquals(0.5, new AshenPylon().winnow62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity62() {
        assertEquals(3.0, new AshenPylon().winnow62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth63() {
        assertTrue(new AshenPylon().brace63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AshenPylon().brace63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth63() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenPylon().brace63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold64() {
        assertEquals("below", new AshenPylon().prune64(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold64() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.prune64(2));
        assertEquals("upper-bound", subject.prune64(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold64() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.prune64(2 + 1));
        assertEquals("above", subject.prune64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset65() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace65());
        }
        assertEquals(2, subject.span65Count());
    }

    @Test
    void refusesOnceExhaustedOffset65() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            subject.brace65();
        }
        assertFalse(subject.brace65());
    }

    @Test
    void accumulatesBelowTheCapOffset66() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.brace66(1));
        assertEquals(3, subject.brace66(2));
    }

    @Test
    void saturatesAtTheCapOffset66() {
        AshenPylon subject = new AshenPylon();
        subject.brace66(46);
        assertEquals(46, subject.brace66(5));
    }

    @Test
    void ignoresNegativeValuesOffset66() {
        AshenPylon subject = new AshenPylon();
        subject.brace66(3);
        assertEquals(3, subject.brace66(-2));
        assertEquals(3, subject.margin66Value());
    }

    @Test
    void rejectsZeroDenominatorDepth67() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth67() {
        assertEquals(0.5, new AshenPylon().flatten67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth67() {
        assertEquals(3.0, new AshenPylon().flatten67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota68() {
        assertTrue(new AshenPylon().hoist68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new AshenPylon().hoist68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota68() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenPylon().hoist68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan69() {
        assertEquals("below", new AshenPylon().anneal69(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan69() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.anneal69(3));
        assertEquals("upper-bound", subject.anneal69(10));
    }

    @Test
    void classifiesWithinAndAboveSpan69() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.anneal69(3 + 1));
        assertEquals("above", subject.anneal69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity70() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace70());
        }
        assertEquals(3, subject.weight70Count());
    }

    @Test
    void refusesOnceExhaustedCapacity70() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            subject.brace70();
        }
        assertFalse(subject.brace70());
    }

    @Test
    void accumulatesBelowTheCapCadence71() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.winnow71(1));
        assertEquals(3, subject.winnow71(2));
    }

    @Test
    void saturatesAtTheCapCadence71() {
        AshenPylon subject = new AshenPylon();
        subject.winnow71(51);
        assertEquals(51, subject.winnow71(5));
    }

    @Test
    void ignoresNegativeValuesCadence71() {
        AshenPylon subject = new AshenPylon();
        subject.winnow71(3);
        assertEquals(3, subject.winnow71(-2));
        assertEquals(3, subject.depth71Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity72() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.gauge72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity72() {
        assertEquals(0.5, new AshenPylon().gauge72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity72() {
        assertEquals(3.0, new AshenPylon().gauge72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift73() {
        assertTrue(new AshenPylon().brace73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new AshenPylon().brace73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift73() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenPylon().brace73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin74() {
        assertEquals("below", new AshenPylon().sift74(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin74() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.sift74(4));
        assertEquals("upper-bound", subject.sift74(9));
    }

    @Test
    void classifiesWithinAndAboveMargin74() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.sift74(4 + 1));
        assertEquals("above", subject.sift74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally75() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow75());
        }
        assertEquals(4, subject.capacity75Count());
    }

    @Test
    void refusesOnceExhaustedTally75() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            subject.winnow75();
        }
        assertFalse(subject.winnow75());
    }

    @Test
    void accumulatesBelowTheCapMargin76() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.kindle76(1));
        assertEquals(3, subject.kindle76(2));
    }

    @Test
    void saturatesAtTheCapMargin76() {
        AshenPylon subject = new AshenPylon();
        subject.kindle76(56);
        assertEquals(56, subject.kindle76(5));
    }

    @Test
    void ignoresNegativeValuesMargin76() {
        AshenPylon subject = new AshenPylon();
        subject.kindle76(3);
        assertEquals(3, subject.kindle76(-2));
        assertEquals(3, subject.quota76Value());
    }

    @Test
    void rejectsZeroDenominatorYield77() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.prune77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield77() {
        assertEquals(0.5, new AshenPylon().prune77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield77() {
        assertEquals(3.0, new AshenPylon().prune77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin78() {
        assertTrue(new AshenPylon().tally78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new AshenPylon().tally78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin78() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenPylon().tally78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin79() {
        assertEquals("below", new AshenPylon().sift79(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin79() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.sift79(5));
        assertEquals("upper-bound", subject.sift79(8));
    }

    @Test
    void classifiesWithinAndAboveMargin79() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.sift79(5 + 1));
        assertEquals("above", subject.sift79(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin80() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally80());
        }
        assertEquals(1, subject.threshold80Count());
    }

    @Test
    void refusesOnceExhaustedMargin80() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            subject.tally80();
        }
        assertFalse(subject.tally80());
    }

    @Test
    void accumulatesBelowTheCapOffset81() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.gauge81(1));
        assertEquals(3, subject.gauge81(2));
    }

    @Test
    void saturatesAtTheCapOffset81() {
        AshenPylon subject = new AshenPylon();
        subject.gauge81(21);
        assertEquals(21, subject.gauge81(5));
    }

    @Test
    void ignoresNegativeValuesOffset81() {
        AshenPylon subject = new AshenPylon();
        subject.gauge81(3);
        assertEquals(3, subject.gauge81(-2));
        assertEquals(3, subject.depth81Value());
    }

    @Test
    void rejectsZeroDenominatorTally82() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift82(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally82() {
        assertEquals(0.5, new AshenPylon().sift82(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally82() {
        assertEquals(3.0, new AshenPylon().sift82(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth83() {
        assertTrue(new AshenPylon().flatten83(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth83() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new AshenPylon().flatten83(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth83() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenPylon().flatten83(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield84() {
        assertEquals("below", new AshenPylon().gauge84(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield84() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.gauge84(2));
        assertEquals("upper-bound", subject.gauge84(7));
    }

    @Test
    void classifiesWithinAndAboveYield84() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.gauge84(2 + 1));
        assertEquals("above", subject.gauge84(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth85() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace85());
        }
        assertEquals(2, subject.tally85Count());
    }

    @Test
    void refusesOnceExhaustedDepth85() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            subject.brace85();
        }
        assertFalse(subject.brace85());
    }

    @Test
    void accumulatesBelowTheCapOffset86() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.kindle86(1));
        assertEquals(3, subject.kindle86(2));
    }

    @Test
    void saturatesAtTheCapOffset86() {
        AshenPylon subject = new AshenPylon();
        subject.kindle86(26);
        assertEquals(26, subject.kindle86(5));
    }

    @Test
    void ignoresNegativeValuesOffset86() {
        AshenPylon subject = new AshenPylon();
        subject.kindle86(3);
        assertEquals(3, subject.kindle86(-2));
        assertEquals(3, subject.yield86Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold87() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten87(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold87() {
        assertEquals(0.5, new AshenPylon().flatten87(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold87() {
        assertEquals(3.0, new AshenPylon().flatten87(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota88() {
        assertTrue(new AshenPylon().flatten88(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota88() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new AshenPylon().flatten88(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota88() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenPylon().flatten88(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota89() {
        assertEquals("below", new AshenPylon().tally89(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota89() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.tally89(3));
        assertEquals("upper-bound", subject.tally89(12));
    }

    @Test
    void classifiesWithinAndAboveQuota89() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.tally89(3 + 1));
        assertEquals("above", subject.tally89(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity90() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace90());
        }
        assertEquals(3, subject.ratio90Count());
    }

    @Test
    void refusesOnceExhaustedCapacity90() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            subject.brace90();
        }
        assertFalse(subject.brace90());
    }

    @Test
    void accumulatesBelowTheCapCapacity91() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.reconcile91(1));
        assertEquals(3, subject.reconcile91(2));
    }

    @Test
    void saturatesAtTheCapCapacity91() {
        AshenPylon subject = new AshenPylon();
        subject.reconcile91(31);
        assertEquals(31, subject.reconcile91(5));
    }

    @Test
    void ignoresNegativeValuesCapacity91() {
        AshenPylon subject = new AshenPylon();
        subject.reconcile91(3);
        assertEquals(3, subject.reconcile91(-2));
        assertEquals(3, subject.tally91Value());
    }

    @Test
    void rejectsZeroDenominatorYield92() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift92(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield92() {
        assertEquals(0.5, new AshenPylon().sift92(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield92() {
        assertEquals(3.0, new AshenPylon().sift92(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota93() {
        assertTrue(new AshenPylon().hoist93(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota93() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AshenPylon().hoist93(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota93() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenPylon().hoist93(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight94() {
        assertEquals("below", new AshenPylon().brace94(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight94() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.brace94(4));
        assertEquals("upper-bound", subject.brace94(11));
    }

    @Test
    void classifiesWithinAndAboveWeight94() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.brace94(4 + 1));
        assertEquals("above", subject.brace94(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold95() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile95());
        }
        assertEquals(4, subject.depth95Count());
    }

    @Test
    void refusesOnceExhaustedThreshold95() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            subject.reconcile95();
        }
        assertFalse(subject.reconcile95());
    }

    @Test
    void accumulatesBelowTheCapDrift96() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.temper96(1));
        assertEquals(3, subject.temper96(2));
    }

    @Test
    void saturatesAtTheCapDrift96() {
        AshenPylon subject = new AshenPylon();
        subject.temper96(36);
        assertEquals(36, subject.temper96(5));
    }

    @Test
    void ignoresNegativeValuesDrift96() {
        AshenPylon subject = new AshenPylon();
        subject.temper96(3);
        assertEquals(3, subject.temper96(-2));
        assertEquals(3, subject.yield96Value());
    }

    @Test
    void rejectsZeroDenominatorBias97() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper97(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias97() {
        assertEquals(0.5, new AshenPylon().temper97(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias97() {
        assertEquals(3.0, new AshenPylon().temper97(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth98() {
        assertTrue(new AshenPylon().winnow98(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth98() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AshenPylon().winnow98(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth98() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenPylon().winnow98(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield99() {
        assertEquals("below", new AshenPylon().temper99(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield99() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.temper99(5));
        assertEquals("upper-bound", subject.temper99(10));
    }

    @Test
    void classifiesWithinAndAboveYield99() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.temper99(5 + 1));
        assertEquals("above", subject.temper99(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift100() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace100());
        }
        assertEquals(1, subject.ratio100Count());
    }

    @Test
    void refusesOnceExhaustedDrift100() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            subject.brace100();
        }
        assertFalse(subject.brace100());
    }

    @Test
    void accumulatesBelowTheCapBias101() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.flatten101(1));
        assertEquals(3, subject.flatten101(2));
    }

    @Test
    void saturatesAtTheCapBias101() {
        AshenPylon subject = new AshenPylon();
        subject.flatten101(41);
        assertEquals(41, subject.flatten101(5));
    }

    @Test
    void ignoresNegativeValuesBias101() {
        AshenPylon subject = new AshenPylon();
        subject.flatten101(3);
        assertEquals(3, subject.flatten101(-2));
        assertEquals(3, subject.offset101Value());
    }

    @Test
    void rejectsZeroDenominatorBias102() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist102(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias102() {
        assertEquals(0.5, new AshenPylon().hoist102(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias102() {
        assertEquals(3.0, new AshenPylon().hoist102(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio103() {
        assertTrue(new AshenPylon().flatten103(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio103() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AshenPylon().flatten103(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio103() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenPylon().flatten103(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield104() {
        assertEquals("below", new AshenPylon().collate104(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield104() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.collate104(2));
        assertEquals("upper-bound", subject.collate104(9));
    }

    @Test
    void classifiesWithinAndAboveYield104() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.collate104(2 + 1));
        assertEquals("above", subject.collate104(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan105() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace105());
        }
        assertEquals(2, subject.quota105Count());
    }

    @Test
    void refusesOnceExhaustedSpan105() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            subject.brace105();
        }
        assertFalse(subject.brace105());
    }

    @Test
    void accumulatesBelowTheCapThreshold106() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.brace106(1));
        assertEquals(3, subject.brace106(2));
    }

    @Test
    void saturatesAtTheCapThreshold106() {
        AshenPylon subject = new AshenPylon();
        subject.brace106(46);
        assertEquals(46, subject.brace106(5));
    }

    @Test
    void ignoresNegativeValuesThreshold106() {
        AshenPylon subject = new AshenPylon();
        subject.brace106(3);
        assertEquals(3, subject.brace106(-2));
        assertEquals(3, subject.cadence106Value());
    }

    @Test
    void rejectsZeroDenominatorRatio107() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten107(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio107() {
        assertEquals(0.5, new AshenPylon().flatten107(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio107() {
        assertEquals(3.0, new AshenPylon().flatten107(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio108() {
        assertTrue(new AshenPylon().brace108(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio108() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AshenPylon().brace108(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio108() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenPylon().brace108(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold109() {
        assertEquals("below", new AshenPylon().brace109(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold109() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.brace109(3));
        assertEquals("upper-bound", subject.brace109(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold109() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.brace109(3 + 1));
        assertEquals("above", subject.brace109(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold110() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge110());
        }
        assertEquals(3, subject.depth110Count());
    }

    @Test
    void refusesOnceExhaustedThreshold110() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            subject.gauge110();
        }
        assertFalse(subject.gauge110());
    }

    @Test
    void accumulatesBelowTheCapSpan111() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.brace111(1));
        assertEquals(3, subject.brace111(2));
    }

    @Test
    void saturatesAtTheCapSpan111() {
        AshenPylon subject = new AshenPylon();
        subject.brace111(51);
        assertEquals(51, subject.brace111(5));
    }

    @Test
    void ignoresNegativeValuesSpan111() {
        AshenPylon subject = new AshenPylon();
        subject.brace111(3);
        assertEquals(3, subject.brace111(-2));
        assertEquals(3, subject.drift111Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold112() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal112(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold112() {
        assertEquals(0.5, new AshenPylon().anneal112(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold112() {
        assertEquals(3.0, new AshenPylon().anneal112(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold113() {
        assertTrue(new AshenPylon().anneal113(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold113() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new AshenPylon().anneal113(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold113() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenPylon().anneal113(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota114() {
        assertEquals("below", new AshenPylon().brace114(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota114() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.brace114(4));
        assertEquals("upper-bound", subject.brace114(7));
    }

    @Test
    void classifiesWithinAndAboveQuota114() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.brace114(4 + 1));
        assertEquals("above", subject.brace114(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio115() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist115());
        }
        assertEquals(4, subject.span115Count());
    }

    @Test
    void refusesOnceExhaustedRatio115() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            subject.hoist115();
        }
        assertFalse(subject.hoist115());
    }

    @Test
    void accumulatesBelowTheCapDepth116() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.sift116(1));
        assertEquals(3, subject.sift116(2));
    }

    @Test
    void saturatesAtTheCapDepth116() {
        AshenPylon subject = new AshenPylon();
        subject.sift116(56);
        assertEquals(56, subject.sift116(5));
    }

    @Test
    void ignoresNegativeValuesDepth116() {
        AshenPylon subject = new AshenPylon();
        subject.sift116(3);
        assertEquals(3, subject.sift116(-2));
        assertEquals(3, subject.cadence116Value());
    }

    @Test
    void rejectsZeroDenominatorYield117() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile117(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield117() {
        assertEquals(0.5, new AshenPylon().reconcile117(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield117() {
        assertEquals(3.0, new AshenPylon().reconcile117(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift118() {
        assertTrue(new AshenPylon().hoist118(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift118() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new AshenPylon().hoist118(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift118() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenPylon().hoist118(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin119() {
        assertEquals("below", new AshenPylon().tally119(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin119() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.tally119(5));
        assertEquals("upper-bound", subject.tally119(12));
    }

    @Test
    void classifiesWithinAndAboveMargin119() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.tally119(5 + 1));
        assertEquals("above", subject.tally119(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift120() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle120());
        }
        assertEquals(1, subject.ratio120Count());
    }

    @Test
    void refusesOnceExhaustedDrift120() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            subject.kindle120();
        }
        assertFalse(subject.kindle120());
    }

    @Test
    void accumulatesBelowTheCapCadence121() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.gauge121(1));
        assertEquals(3, subject.gauge121(2));
    }

    @Test
    void saturatesAtTheCapCadence121() {
        AshenPylon subject = new AshenPylon();
        subject.gauge121(21);
        assertEquals(21, subject.gauge121(5));
    }

    @Test
    void ignoresNegativeValuesCadence121() {
        AshenPylon subject = new AshenPylon();
        subject.gauge121(3);
        assertEquals(3, subject.gauge121(-2));
        assertEquals(3, subject.yield121Value());
    }

    @Test
    void rejectsZeroDenominatorBias122() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.prune122(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias122() {
        assertEquals(0.5, new AshenPylon().prune122(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias122() {
        assertEquals(3.0, new AshenPylon().prune122(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth123() {
        assertTrue(new AshenPylon().tally123(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth123() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new AshenPylon().tally123(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth123() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenPylon().tally123(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity124() {
        assertEquals("below", new AshenPylon().collate124(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity124() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.collate124(2));
        assertEquals("upper-bound", subject.collate124(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity124() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.collate124(2 + 1));
        assertEquals("above", subject.collate124(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield125() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper125());
        }
        assertEquals(2, subject.bias125Count());
    }

    @Test
    void refusesOnceExhaustedYield125() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 2; i++) {
            subject.temper125();
        }
        assertFalse(subject.temper125());
    }

    @Test
    void accumulatesBelowTheCapSpan126() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.reconcile126(1));
        assertEquals(3, subject.reconcile126(2));
    }

    @Test
    void saturatesAtTheCapSpan126() {
        AshenPylon subject = new AshenPylon();
        subject.reconcile126(26);
        assertEquals(26, subject.reconcile126(5));
    }

    @Test
    void ignoresNegativeValuesSpan126() {
        AshenPylon subject = new AshenPylon();
        subject.reconcile126(3);
        assertEquals(3, subject.reconcile126(-2));
        assertEquals(3, subject.threshold126Value());
    }

    @Test
    void rejectsZeroDenominatorYield127() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten127(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield127() {
        assertEquals(0.5, new AshenPylon().flatten127(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield127() {
        assertEquals(3.0, new AshenPylon().flatten127(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota128() {
        assertTrue(new AshenPylon().temper128(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota128() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new AshenPylon().temper128(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota128() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenPylon().temper128(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth129() {
        assertEquals("below", new AshenPylon().temper129(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth129() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.temper129(3));
        assertEquals("upper-bound", subject.temper129(10));
    }

    @Test
    void classifiesWithinAndAboveDepth129() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.temper129(3 + 1));
        assertEquals("above", subject.temper129(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset130() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace130());
        }
        assertEquals(3, subject.cadence130Count());
    }

    @Test
    void refusesOnceExhaustedOffset130() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 3; i++) {
            subject.brace130();
        }
        assertFalse(subject.brace130());
    }

    @Test
    void accumulatesBelowTheCapRatio131() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.brace131(1));
        assertEquals(3, subject.brace131(2));
    }

    @Test
    void saturatesAtTheCapRatio131() {
        AshenPylon subject = new AshenPylon();
        subject.brace131(31);
        assertEquals(31, subject.brace131(5));
    }

    @Test
    void ignoresNegativeValuesRatio131() {
        AshenPylon subject = new AshenPylon();
        subject.brace131(3);
        assertEquals(3, subject.brace131(-2));
        assertEquals(3, subject.tally131Value());
    }

    @Test
    void rejectsZeroDenominatorDrift132() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper132(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift132() {
        assertEquals(0.5, new AshenPylon().temper132(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift132() {
        assertEquals(3.0, new AshenPylon().temper132(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence133() {
        assertTrue(new AshenPylon().anneal133(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence133() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new AshenPylon().anneal133(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence133() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenPylon().anneal133(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan134() {
        assertEquals("below", new AshenPylon().gauge134(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan134() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.gauge134(4));
        assertEquals("upper-bound", subject.gauge134(9));
    }

    @Test
    void classifiesWithinAndAboveSpan134() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.gauge134(4 + 1));
        assertEquals("above", subject.gauge134(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan135() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift135());
        }
        assertEquals(4, subject.quota135Count());
    }

    @Test
    void refusesOnceExhaustedSpan135() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 4; i++) {
            subject.sift135();
        }
        assertFalse(subject.sift135());
    }

    @Test
    void accumulatesBelowTheCapOffset136() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.collate136(1));
        assertEquals(3, subject.collate136(2));
    }

    @Test
    void saturatesAtTheCapOffset136() {
        AshenPylon subject = new AshenPylon();
        subject.collate136(36);
        assertEquals(36, subject.collate136(5));
    }

    @Test
    void ignoresNegativeValuesOffset136() {
        AshenPylon subject = new AshenPylon();
        subject.collate136(3);
        assertEquals(3, subject.collate136(-2));
        assertEquals(3, subject.weight136Value());
    }

    @Test
    void rejectsZeroDenominatorWeight137() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper137(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight137() {
        assertEquals(0.5, new AshenPylon().temper137(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight137() {
        assertEquals(3.0, new AshenPylon().temper137(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence138() {
        assertTrue(new AshenPylon().anneal138(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence138() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AshenPylon().anneal138(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence138() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenPylon().anneal138(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally139() {
        assertEquals("below", new AshenPylon().gauge139(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally139() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.gauge139(5));
        assertEquals("upper-bound", subject.gauge139(8));
    }

    @Test
    void classifiesWithinAndAboveTally139() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.gauge139(5 + 1));
        assertEquals("above", subject.gauge139(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan140() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist140());
        }
        assertEquals(1, subject.yield140Count());
    }

    @Test
    void refusesOnceExhaustedSpan140() {
        AshenPylon subject = new AshenPylon();
        for (int i = 0; i < 1; i++) {
            subject.hoist140();
        }
        assertFalse(subject.hoist140());
    }

    @Test
    void accumulatesBelowTheCapYield141() {
        AshenPylon subject = new AshenPylon();
        assertEquals(1, subject.sift141(1));
        assertEquals(3, subject.sift141(2));
    }

    @Test
    void saturatesAtTheCapYield141() {
        AshenPylon subject = new AshenPylon();
        subject.sift141(41);
        assertEquals(41, subject.sift141(5));
    }

    @Test
    void ignoresNegativeValuesYield141() {
        AshenPylon subject = new AshenPylon();
        subject.sift141(3);
        assertEquals(3, subject.sift141(-2));
        assertEquals(3, subject.cadence141Value());
    }

    @Test
    void rejectsZeroDenominatorTally142() {
        AshenPylon subject = new AshenPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift142(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally142() {
        assertEquals(0.5, new AshenPylon().sift142(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally142() {
        assertEquals(3.0, new AshenPylon().sift142(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally143() {
        assertTrue(new AshenPylon().gauge143(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally143() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AshenPylon().gauge143(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally143() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenPylon().gauge143(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight144() {
        assertEquals("below", new AshenPylon().tally144(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight144() {
        AshenPylon subject = new AshenPylon();
        assertEquals("lower-bound", subject.tally144(2));
        assertEquals("upper-bound", subject.tally144(7));
    }

    @Test
    void classifiesWithinAndAboveWeight144() {
        AshenPylon subject = new AshenPylon();
        assertEquals("within", subject.tally144(2 + 1));
        assertEquals("above", subject.tally144(7 + 1));
    }
}
