package com.copper.pylon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardGranaryIITest {

    @Test
    void allowsAttemptsUpToTheBudgetDrift0() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist0());
        }
        assertEquals(1, subject.ratio0Count());
    }

    @Test
    void refusesOnceExhaustedDrift0() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 1; i++) {
            subject.hoist0();
        }
        assertFalse(subject.hoist0());
    }

    @Test
    void accumulatesBelowTheCapQuota1() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.temper1(1));
        assertEquals(3, subject.temper1(2));
    }

    @Test
    void saturatesAtTheCapQuota1() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.temper1(21);
        assertEquals(21, subject.temper1(5));
    }

    @Test
    void ignoresNegativeValuesQuota1() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.temper1(3);
        assertEquals(3, subject.temper1(-2));
        assertEquals(3, subject.threshold1Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold2() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.sift2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold2() {
        assertEquals(0.5, new NorthwardGranaryII().sift2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold2() {
        assertEquals(3.0, new NorthwardGranaryII().sift2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota3() {
        assertTrue(new NorthwardGranaryII().brace3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardGranaryII().brace3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota3() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardGranaryII().brace3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally4() {
        assertEquals("below", new NorthwardGranaryII().prune4(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally4() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.prune4(2));
        assertEquals("upper-bound", subject.prune4(11));
    }

    @Test
    void classifiesWithinAndAboveTally4() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.prune4(2 + 1));
        assertEquals("above", subject.prune4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence5() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate5());
        }
        assertEquals(2, subject.bias5Count());
    }

    @Test
    void refusesOnceExhaustedCadence5() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 2; i++) {
            subject.collate5();
        }
        assertFalse(subject.collate5());
    }

    @Test
    void accumulatesBelowTheCapThreshold6() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.sift6(1));
        assertEquals(3, subject.sift6(2));
    }

    @Test
    void saturatesAtTheCapThreshold6() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.sift6(26);
        assertEquals(26, subject.sift6(5));
    }

    @Test
    void ignoresNegativeValuesThreshold6() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.sift6(3);
        assertEquals(3, subject.sift6(-2));
        assertEquals(3, subject.quota6Value());
    }

    @Test
    void rejectsZeroDenominatorQuota7() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.sift7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota7() {
        assertEquals(0.5, new NorthwardGranaryII().sift7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota7() {
        assertEquals(3.0, new NorthwardGranaryII().sift7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio8() {
        assertTrue(new NorthwardGranaryII().hoist8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardGranaryII().hoist8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio8() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardGranaryII().hoist8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence9() {
        assertEquals("below", new NorthwardGranaryII().brace9(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence9() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.brace9(3));
        assertEquals("upper-bound", subject.brace9(10));
    }

    @Test
    void classifiesWithinAndAboveCadence9() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.brace9(3 + 1));
        assertEquals("above", subject.brace9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan10() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace10());
        }
        assertEquals(3, subject.yield10Count());
    }

    @Test
    void refusesOnceExhaustedSpan10() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 3; i++) {
            subject.brace10();
        }
        assertFalse(subject.brace10());
    }

    @Test
    void accumulatesBelowTheCapThreshold11() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.tally11(1));
        assertEquals(3, subject.tally11(2));
    }

    @Test
    void saturatesAtTheCapThreshold11() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.tally11(31);
        assertEquals(31, subject.tally11(5));
    }

    @Test
    void ignoresNegativeValuesThreshold11() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.tally11(3);
        assertEquals(3, subject.tally11(-2));
        assertEquals(3, subject.depth11Value());
    }

    @Test
    void rejectsZeroDenominatorSpan12() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan12() {
        assertEquals(0.5, new NorthwardGranaryII().anneal12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan12() {
        assertEquals(3.0, new NorthwardGranaryII().anneal12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold13() {
        assertTrue(new NorthwardGranaryII().flatten13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardGranaryII().flatten13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold13() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardGranaryII().flatten13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio14() {
        assertEquals("below", new NorthwardGranaryII().collate14(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio14() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.collate14(4));
        assertEquals("upper-bound", subject.collate14(9));
    }

    @Test
    void classifiesWithinAndAboveRatio14() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.collate14(4 + 1));
        assertEquals("above", subject.collate14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift15() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper15());
        }
        assertEquals(4, subject.ratio15Count());
    }

    @Test
    void refusesOnceExhaustedDrift15() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 4; i++) {
            subject.temper15();
        }
        assertFalse(subject.temper15());
    }

    @Test
    void accumulatesBelowTheCapRatio16() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.tally16(1));
        assertEquals(3, subject.tally16(2));
    }

    @Test
    void saturatesAtTheCapRatio16() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.tally16(36);
        assertEquals(36, subject.tally16(5));
    }

    @Test
    void ignoresNegativeValuesRatio16() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.tally16(3);
        assertEquals(3, subject.tally16(-2));
        assertEquals(3, subject.quota16Value());
    }

    @Test
    void rejectsZeroDenominatorWeight17() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.prune17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight17() {
        assertEquals(0.5, new NorthwardGranaryII().prune17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight17() {
        assertEquals(3.0, new NorthwardGranaryII().prune17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold18() {
        assertTrue(new NorthwardGranaryII().sift18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardGranaryII().sift18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold18() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardGranaryII().sift18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift19() {
        assertEquals("below", new NorthwardGranaryII().sift19(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift19() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.sift19(5));
        assertEquals("upper-bound", subject.sift19(8));
    }

    @Test
    void classifiesWithinAndAboveDrift19() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.sift19(5 + 1));
        assertEquals("above", subject.sift19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold20() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl20());
        }
        assertEquals(1, subject.ratio20Count());
    }

    @Test
    void refusesOnceExhaustedThreshold20() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 1; i++) {
            subject.furl20();
        }
        assertFalse(subject.furl20());
    }

    @Test
    void accumulatesBelowTheCapDrift21() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.temper21(1));
        assertEquals(3, subject.temper21(2));
    }

    @Test
    void saturatesAtTheCapDrift21() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.temper21(41);
        assertEquals(41, subject.temper21(5));
    }

    @Test
    void ignoresNegativeValuesDrift21() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.temper21(3);
        assertEquals(3, subject.temper21(-2));
        assertEquals(3, subject.weight21Value());
    }

    @Test
    void rejectsZeroDenominatorBias22() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.sift22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias22() {
        assertEquals(0.5, new NorthwardGranaryII().sift22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias22() {
        assertEquals(3.0, new NorthwardGranaryII().sift22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold23() {
        assertTrue(new NorthwardGranaryII().flatten23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new NorthwardGranaryII().flatten23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold23() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardGranaryII().flatten23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity24() {
        assertEquals("below", new NorthwardGranaryII().kindle24(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity24() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.kindle24(2));
        assertEquals("upper-bound", subject.kindle24(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity24() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.kindle24(2 + 1));
        assertEquals("above", subject.kindle24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight25() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile25());
        }
        assertEquals(2, subject.quota25Count());
    }

    @Test
    void refusesOnceExhaustedWeight25() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile25();
        }
        assertFalse(subject.reconcile25());
    }

    @Test
    void accumulatesBelowTheCapMargin26() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.kindle26(1));
        assertEquals(3, subject.kindle26(2));
    }

    @Test
    void saturatesAtTheCapMargin26() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.kindle26(46);
        assertEquals(46, subject.kindle26(5));
    }

    @Test
    void ignoresNegativeValuesMargin26() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.kindle26(3);
        assertEquals(3, subject.kindle26(-2));
        assertEquals(3, subject.span26Value());
    }

    @Test
    void rejectsZeroDenominatorYield27() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.temper27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield27() {
        assertEquals(0.5, new NorthwardGranaryII().temper27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield27() {
        assertEquals(3.0, new NorthwardGranaryII().temper27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin28() {
        assertTrue(new NorthwardGranaryII().brace28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new NorthwardGranaryII().brace28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin28() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardGranaryII().brace28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence29() {
        assertEquals("below", new NorthwardGranaryII().hoist29(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence29() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.hoist29(3));
        assertEquals("upper-bound", subject.hoist29(12));
    }

    @Test
    void classifiesWithinAndAboveCadence29() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.hoist29(3 + 1));
        assertEquals("above", subject.hoist29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold30() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten30());
        }
        assertEquals(3, subject.quota30Count());
    }

    @Test
    void refusesOnceExhaustedThreshold30() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 3; i++) {
            subject.flatten30();
        }
        assertFalse(subject.flatten30());
    }

    @Test
    void accumulatesBelowTheCapMargin31() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.tally31(1));
        assertEquals(3, subject.tally31(2));
    }

    @Test
    void saturatesAtTheCapMargin31() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.tally31(51);
        assertEquals(51, subject.tally31(5));
    }

    @Test
    void ignoresNegativeValuesMargin31() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.tally31(3);
        assertEquals(3, subject.tally31(-2));
        assertEquals(3, subject.capacity31Value());
    }

    @Test
    void rejectsZeroDenominatorWeight32() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.prune32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight32() {
        assertEquals(0.5, new NorthwardGranaryII().prune32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight32() {
        assertEquals(3.0, new NorthwardGranaryII().prune32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias33() {
        assertTrue(new NorthwardGranaryII().flatten33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new NorthwardGranaryII().flatten33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias33() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardGranaryII().flatten33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio34() {
        assertEquals("below", new NorthwardGranaryII().flatten34(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio34() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.flatten34(4));
        assertEquals("upper-bound", subject.flatten34(11));
    }

    @Test
    void classifiesWithinAndAboveRatio34() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.flatten34(4 + 1));
        assertEquals("above", subject.flatten34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence35() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper35());
        }
        assertEquals(4, subject.margin35Count());
    }

    @Test
    void refusesOnceExhaustedCadence35() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 4; i++) {
            subject.temper35();
        }
        assertFalse(subject.temper35());
    }

    @Test
    void accumulatesBelowTheCapBias36() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.brace36(1));
        assertEquals(3, subject.brace36(2));
    }

    @Test
    void saturatesAtTheCapBias36() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.brace36(56);
        assertEquals(56, subject.brace36(5));
    }

    @Test
    void ignoresNegativeValuesBias36() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.brace36(3);
        assertEquals(3, subject.brace36(-2));
        assertEquals(3, subject.drift36Value());
    }

    @Test
    void rejectsZeroDenominatorBias37() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.collate37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias37() {
        assertEquals(0.5, new NorthwardGranaryII().collate37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias37() {
        assertEquals(3.0, new NorthwardGranaryII().collate37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift38() {
        assertTrue(new NorthwardGranaryII().reconcile38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new NorthwardGranaryII().reconcile38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift38() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardGranaryII().reconcile38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence39() {
        assertEquals("below", new NorthwardGranaryII().anneal39(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence39() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.anneal39(5));
        assertEquals("upper-bound", subject.anneal39(10));
    }

    @Test
    void classifiesWithinAndAboveCadence39() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.anneal39(5 + 1));
        assertEquals("above", subject.anneal39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift40() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal40());
        }
        assertEquals(1, subject.capacity40Count());
    }

    @Test
    void refusesOnceExhaustedDrift40() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 1; i++) {
            subject.anneal40();
        }
        assertFalse(subject.anneal40());
    }

    @Test
    void accumulatesBelowTheCapDrift41() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.anneal41(1));
        assertEquals(3, subject.anneal41(2));
    }

    @Test
    void saturatesAtTheCapDrift41() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.anneal41(21);
        assertEquals(21, subject.anneal41(5));
    }

    @Test
    void ignoresNegativeValuesDrift41() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.anneal41(3);
        assertEquals(3, subject.anneal41(-2));
        assertEquals(3, subject.span41Value());
    }

    @Test
    void rejectsZeroDenominatorDepth42() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.tally42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth42() {
        assertEquals(0.5, new NorthwardGranaryII().tally42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth42() {
        assertEquals(3.0, new NorthwardGranaryII().tally42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold43() {
        assertTrue(new NorthwardGranaryII().hoist43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new NorthwardGranaryII().hoist43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold43() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardGranaryII().hoist43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally44() {
        assertEquals("below", new NorthwardGranaryII().gauge44(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally44() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.gauge44(2));
        assertEquals("upper-bound", subject.gauge44(9));
    }

    @Test
    void classifiesWithinAndAboveTally44() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.gauge44(2 + 1));
        assertEquals("above", subject.gauge44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin45() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate45());
        }
        assertEquals(2, subject.quota45Count());
    }

    @Test
    void refusesOnceExhaustedMargin45() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 2; i++) {
            subject.collate45();
        }
        assertFalse(subject.collate45());
    }

    @Test
    void accumulatesBelowTheCapOffset46() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.anneal46(1));
        assertEquals(3, subject.anneal46(2));
    }

    @Test
    void saturatesAtTheCapOffset46() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.anneal46(26);
        assertEquals(26, subject.anneal46(5));
    }

    @Test
    void ignoresNegativeValuesOffset46() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.anneal46(3);
        assertEquals(3, subject.anneal46(-2));
        assertEquals(3, subject.ratio46Value());
    }

    @Test
    void rejectsZeroDenominatorDrift47() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.collate47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift47() {
        assertEquals(0.5, new NorthwardGranaryII().collate47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift47() {
        assertEquals(3.0, new NorthwardGranaryII().collate47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin48() {
        assertTrue(new NorthwardGranaryII().kindle48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardGranaryII().kindle48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin48() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardGranaryII().kindle48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin49() {
        assertEquals("below", new NorthwardGranaryII().furl49(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin49() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.furl49(3));
        assertEquals("upper-bound", subject.furl49(8));
    }

    @Test
    void classifiesWithinAndAboveMargin49() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.furl49(3 + 1));
        assertEquals("above", subject.furl49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift50() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace50());
        }
        assertEquals(3, subject.margin50Count());
    }

    @Test
    void refusesOnceExhaustedDrift50() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 3; i++) {
            subject.brace50();
        }
        assertFalse(subject.brace50());
    }

    @Test
    void accumulatesBelowTheCapTally51() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.temper51(1));
        assertEquals(3, subject.temper51(2));
    }

    @Test
    void saturatesAtTheCapTally51() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.temper51(31);
        assertEquals(31, subject.temper51(5));
    }

    @Test
    void ignoresNegativeValuesTally51() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.temper51(3);
        assertEquals(3, subject.temper51(-2));
        assertEquals(3, subject.yield51Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity52() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.sift52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity52() {
        assertEquals(0.5, new NorthwardGranaryII().sift52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity52() {
        assertEquals(3.0, new NorthwardGranaryII().sift52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight53() {
        assertTrue(new NorthwardGranaryII().temper53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardGranaryII().temper53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight53() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardGranaryII().temper53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight54() {
        assertEquals("below", new NorthwardGranaryII().collate54(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight54() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.collate54(4));
        assertEquals("upper-bound", subject.collate54(7));
    }

    @Test
    void classifiesWithinAndAboveWeight54() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.collate54(4 + 1));
        assertEquals("above", subject.collate54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift55() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist55());
        }
        assertEquals(4, subject.yield55Count());
    }

    @Test
    void refusesOnceExhaustedDrift55() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 4; i++) {
            subject.hoist55();
        }
        assertFalse(subject.hoist55());
    }

    @Test
    void accumulatesBelowTheCapMargin56() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.tally56(1));
        assertEquals(3, subject.tally56(2));
    }

    @Test
    void saturatesAtTheCapMargin56() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.tally56(36);
        assertEquals(36, subject.tally56(5));
    }

    @Test
    void ignoresNegativeValuesMargin56() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.tally56(3);
        assertEquals(3, subject.tally56(-2));
        assertEquals(3, subject.quota56Value());
    }

    @Test
    void rejectsZeroDenominatorYield57() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield57() {
        assertEquals(0.5, new NorthwardGranaryII().reconcile57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield57() {
        assertEquals(3.0, new NorthwardGranaryII().reconcile57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally58() {
        assertTrue(new NorthwardGranaryII().prune58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardGranaryII().prune58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally58() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardGranaryII().prune58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan59() {
        assertEquals("below", new NorthwardGranaryII().temper59(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan59() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.temper59(5));
        assertEquals("upper-bound", subject.temper59(12));
    }

    @Test
    void classifiesWithinAndAboveSpan59() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.temper59(5 + 1));
        assertEquals("above", subject.temper59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset60() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow60());
        }
        assertEquals(1, subject.margin60Count());
    }

    @Test
    void refusesOnceExhaustedOffset60() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 1; i++) {
            subject.winnow60();
        }
        assertFalse(subject.winnow60());
    }

    @Test
    void accumulatesBelowTheCapBias61() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.collate61(1));
        assertEquals(3, subject.collate61(2));
    }

    @Test
    void saturatesAtTheCapBias61() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.collate61(41);
        assertEquals(41, subject.collate61(5));
    }

    @Test
    void ignoresNegativeValuesBias61() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.collate61(3);
        assertEquals(3, subject.collate61(-2));
        assertEquals(3, subject.ratio61Value());
    }

    @Test
    void rejectsZeroDenominatorMargin62() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.brace62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin62() {
        assertEquals(0.5, new NorthwardGranaryII().brace62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin62() {
        assertEquals(3.0, new NorthwardGranaryII().brace62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift63() {
        assertTrue(new NorthwardGranaryII().sift63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardGranaryII().sift63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift63() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardGranaryII().sift63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan64() {
        assertEquals("below", new NorthwardGranaryII().anneal64(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan64() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.anneal64(2));
        assertEquals("upper-bound", subject.anneal64(11));
    }

    @Test
    void classifiesWithinAndAboveSpan64() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.anneal64(2 + 1));
        assertEquals("above", subject.anneal64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally65() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace65());
        }
        assertEquals(2, subject.quota65Count());
    }

    @Test
    void refusesOnceExhaustedTally65() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 2; i++) {
            subject.brace65();
        }
        assertFalse(subject.brace65());
    }

    @Test
    void accumulatesBelowTheCapOffset66() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.hoist66(1));
        assertEquals(3, subject.hoist66(2));
    }

    @Test
    void saturatesAtTheCapOffset66() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.hoist66(46);
        assertEquals(46, subject.hoist66(5));
    }

    @Test
    void ignoresNegativeValuesOffset66() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.hoist66(3);
        assertEquals(3, subject.hoist66(-2));
        assertEquals(3, subject.margin66Value());
    }

    @Test
    void rejectsZeroDenominatorDrift67() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift67() {
        assertEquals(0.5, new NorthwardGranaryII().hoist67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift67() {
        assertEquals(3.0, new NorthwardGranaryII().hoist67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield68() {
        assertTrue(new NorthwardGranaryII().gauge68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new NorthwardGranaryII().gauge68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield68() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardGranaryII().gauge68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold69() {
        assertEquals("below", new NorthwardGranaryII().winnow69(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold69() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.winnow69(3));
        assertEquals("upper-bound", subject.winnow69(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold69() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.winnow69(3 + 1));
        assertEquals("above", subject.winnow69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally70() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift70());
        }
        assertEquals(3, subject.offset70Count());
    }

    @Test
    void refusesOnceExhaustedTally70() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 3; i++) {
            subject.sift70();
        }
        assertFalse(subject.sift70());
    }

    @Test
    void accumulatesBelowTheCapYield71() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.furl71(1));
        assertEquals(3, subject.furl71(2));
    }

    @Test
    void saturatesAtTheCapYield71() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.furl71(51);
        assertEquals(51, subject.furl71(5));
    }

    @Test
    void ignoresNegativeValuesYield71() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.furl71(3);
        assertEquals(3, subject.furl71(-2));
        assertEquals(3, subject.bias71Value());
    }

    @Test
    void rejectsZeroDenominatorBias72() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.sift72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias72() {
        assertEquals(0.5, new NorthwardGranaryII().sift72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias72() {
        assertEquals(3.0, new NorthwardGranaryII().sift72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth73() {
        assertTrue(new NorthwardGranaryII().sift73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new NorthwardGranaryII().sift73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth73() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardGranaryII().sift73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift74() {
        assertEquals("below", new NorthwardGranaryII().reconcile74(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift74() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.reconcile74(4));
        assertEquals("upper-bound", subject.reconcile74(9));
    }

    @Test
    void classifiesWithinAndAboveDrift74() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.reconcile74(4 + 1));
        assertEquals("above", subject.reconcile74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally75() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow75());
        }
        assertEquals(4, subject.yield75Count());
    }

    @Test
    void refusesOnceExhaustedTally75() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 4; i++) {
            subject.winnow75();
        }
        assertFalse(subject.winnow75());
    }

    @Test
    void accumulatesBelowTheCapWeight76() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.kindle76(1));
        assertEquals(3, subject.kindle76(2));
    }

    @Test
    void saturatesAtTheCapWeight76() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.kindle76(56);
        assertEquals(56, subject.kindle76(5));
    }

    @Test
    void ignoresNegativeValuesWeight76() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.kindle76(3);
        assertEquals(3, subject.kindle76(-2));
        assertEquals(3, subject.drift76Value());
    }

    @Test
    void rejectsZeroDenominatorYield77() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield77() {
        assertEquals(0.5, new NorthwardGranaryII().hoist77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield77() {
        assertEquals(3.0, new NorthwardGranaryII().hoist77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity78() {
        assertTrue(new NorthwardGranaryII().winnow78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new NorthwardGranaryII().winnow78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity78() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardGranaryII().winnow78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield79() {
        assertEquals("below", new NorthwardGranaryII().furl79(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield79() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.furl79(5));
        assertEquals("upper-bound", subject.furl79(8));
    }

    @Test
    void classifiesWithinAndAboveYield79() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.furl79(5 + 1));
        assertEquals("above", subject.furl79(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold80() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow80());
        }
        assertEquals(1, subject.offset80Count());
    }

    @Test
    void refusesOnceExhaustedThreshold80() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 1; i++) {
            subject.winnow80();
        }
        assertFalse(subject.winnow80());
    }

    @Test
    void accumulatesBelowTheCapSpan81() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.winnow81(1));
        assertEquals(3, subject.winnow81(2));
    }

    @Test
    void saturatesAtTheCapSpan81() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.winnow81(21);
        assertEquals(21, subject.winnow81(5));
    }

    @Test
    void ignoresNegativeValuesSpan81() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.winnow81(3);
        assertEquals(3, subject.winnow81(-2));
        assertEquals(3, subject.threshold81Value());
    }

    @Test
    void rejectsZeroDenominatorBias82() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.furl82(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias82() {
        assertEquals(0.5, new NorthwardGranaryII().furl82(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias82() {
        assertEquals(3.0, new NorthwardGranaryII().furl82(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally83() {
        assertTrue(new NorthwardGranaryII().tally83(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally83() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new NorthwardGranaryII().tally83(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally83() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardGranaryII().tally83(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity84() {
        assertEquals("below", new NorthwardGranaryII().gauge84(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity84() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.gauge84(2));
        assertEquals("upper-bound", subject.gauge84(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity84() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.gauge84(2 + 1));
        assertEquals("above", subject.gauge84(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity85() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist85());
        }
        assertEquals(2, subject.offset85Count());
    }

    @Test
    void refusesOnceExhaustedCapacity85() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 2; i++) {
            subject.hoist85();
        }
        assertFalse(subject.hoist85());
    }

    @Test
    void accumulatesBelowTheCapThreshold86() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.furl86(1));
        assertEquals(3, subject.furl86(2));
    }

    @Test
    void saturatesAtTheCapThreshold86() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.furl86(26);
        assertEquals(26, subject.furl86(5));
    }

    @Test
    void ignoresNegativeValuesThreshold86() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.furl86(3);
        assertEquals(3, subject.furl86(-2));
        assertEquals(3, subject.quota86Value());
    }

    @Test
    void rejectsZeroDenominatorYield87() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.gauge87(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield87() {
        assertEquals(0.5, new NorthwardGranaryII().gauge87(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield87() {
        assertEquals(3.0, new NorthwardGranaryII().gauge87(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight88() {
        assertTrue(new NorthwardGranaryII().furl88(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight88() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new NorthwardGranaryII().furl88(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight88() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardGranaryII().furl88(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota89() {
        assertEquals("below", new NorthwardGranaryII().tally89(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota89() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.tally89(3));
        assertEquals("upper-bound", subject.tally89(12));
    }

    @Test
    void classifiesWithinAndAboveQuota89() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.tally89(3 + 1));
        assertEquals("above", subject.tally89(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin90() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper90());
        }
        assertEquals(3, subject.threshold90Count());
    }

    @Test
    void refusesOnceExhaustedMargin90() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 3; i++) {
            subject.temper90();
        }
        assertFalse(subject.temper90());
    }

    @Test
    void accumulatesBelowTheCapQuota91() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.hoist91(1));
        assertEquals(3, subject.hoist91(2));
    }

    @Test
    void saturatesAtTheCapQuota91() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.hoist91(31);
        assertEquals(31, subject.hoist91(5));
    }

    @Test
    void ignoresNegativeValuesQuota91() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.hoist91(3);
        assertEquals(3, subject.hoist91(-2));
        assertEquals(3, subject.ratio91Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity92() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle92(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity92() {
        assertEquals(0.5, new NorthwardGranaryII().kindle92(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity92() {
        assertEquals(3.0, new NorthwardGranaryII().kindle92(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity93() {
        assertTrue(new NorthwardGranaryII().hoist93(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity93() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardGranaryII().hoist93(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity93() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardGranaryII().hoist93(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence94() {
        assertEquals("below", new NorthwardGranaryII().furl94(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence94() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.furl94(4));
        assertEquals("upper-bound", subject.furl94(11));
    }

    @Test
    void classifiesWithinAndAboveCadence94() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.furl94(4 + 1));
        assertEquals("above", subject.furl94(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota95() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune95());
        }
        assertEquals(4, subject.cadence95Count());
    }

    @Test
    void refusesOnceExhaustedQuota95() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 4; i++) {
            subject.prune95();
        }
        assertFalse(subject.prune95());
    }

    @Test
    void accumulatesBelowTheCapDepth96() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.winnow96(1));
        assertEquals(3, subject.winnow96(2));
    }

    @Test
    void saturatesAtTheCapDepth96() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.winnow96(36);
        assertEquals(36, subject.winnow96(5));
    }

    @Test
    void ignoresNegativeValuesDepth96() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.winnow96(3);
        assertEquals(3, subject.winnow96(-2));
        assertEquals(3, subject.weight96Value());
    }

    @Test
    void rejectsZeroDenominatorSpan97() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.sift97(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan97() {
        assertEquals(0.5, new NorthwardGranaryII().sift97(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan97() {
        assertEquals(3.0, new NorthwardGranaryII().sift97(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold98() {
        assertTrue(new NorthwardGranaryII().temper98(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold98() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardGranaryII().temper98(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold98() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardGranaryII().temper98(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold99() {
        assertEquals("below", new NorthwardGranaryII().winnow99(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold99() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.winnow99(5));
        assertEquals("upper-bound", subject.winnow99(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold99() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.winnow99(5 + 1));
        assertEquals("above", subject.winnow99(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth100() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge100());
        }
        assertEquals(1, subject.ratio100Count());
    }

    @Test
    void refusesOnceExhaustedDepth100() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 1; i++) {
            subject.gauge100();
        }
        assertFalse(subject.gauge100());
    }

    @Test
    void accumulatesBelowTheCapCapacity101() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.reconcile101(1));
        assertEquals(3, subject.reconcile101(2));
    }

    @Test
    void saturatesAtTheCapCapacity101() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.reconcile101(41);
        assertEquals(41, subject.reconcile101(5));
    }

    @Test
    void ignoresNegativeValuesCapacity101() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.reconcile101(3);
        assertEquals(3, subject.reconcile101(-2));
        assertEquals(3, subject.bias101Value());
    }

    @Test
    void rejectsZeroDenominatorYield102() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle102(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield102() {
        assertEquals(0.5, new NorthwardGranaryII().kindle102(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield102() {
        assertEquals(3.0, new NorthwardGranaryII().kindle102(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight103() {
        assertTrue(new NorthwardGranaryII().flatten103(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight103() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardGranaryII().flatten103(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight103() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardGranaryII().flatten103(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield104() {
        assertEquals("below", new NorthwardGranaryII().gauge104(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield104() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.gauge104(2));
        assertEquals("upper-bound", subject.gauge104(9));
    }

    @Test
    void classifiesWithinAndAboveYield104() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.gauge104(2 + 1));
        assertEquals("above", subject.gauge104(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio105() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace105());
        }
        assertEquals(2, subject.margin105Count());
    }

    @Test
    void refusesOnceExhaustedRatio105() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 2; i++) {
            subject.brace105();
        }
        assertFalse(subject.brace105());
    }

    @Test
    void accumulatesBelowTheCapCadence106() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.hoist106(1));
        assertEquals(3, subject.hoist106(2));
    }

    @Test
    void saturatesAtTheCapCadence106() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.hoist106(46);
        assertEquals(46, subject.hoist106(5));
    }

    @Test
    void ignoresNegativeValuesCadence106() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.hoist106(3);
        assertEquals(3, subject.hoist106(-2));
        assertEquals(3, subject.ratio106Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold107() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist107(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold107() {
        assertEquals(0.5, new NorthwardGranaryII().hoist107(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold107() {
        assertEquals(3.0, new NorthwardGranaryII().hoist107(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota108() {
        assertTrue(new NorthwardGranaryII().collate108(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota108() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardGranaryII().collate108(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota108() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardGranaryII().collate108(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota109() {
        assertEquals("below", new NorthwardGranaryII().anneal109(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota109() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("lower-bound", subject.anneal109(3));
        assertEquals("upper-bound", subject.anneal109(8));
    }

    @Test
    void classifiesWithinAndAboveQuota109() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals("within", subject.anneal109(3 + 1));
        assertEquals("above", subject.anneal109(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight110() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten110());
        }
        assertEquals(3, subject.yield110Count());
    }

    @Test
    void refusesOnceExhaustedWeight110() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        for (int i = 0; i < 3; i++) {
            subject.flatten110();
        }
        assertFalse(subject.flatten110());
    }

    @Test
    void accumulatesBelowTheCapRatio111() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        assertEquals(1, subject.hoist111(1));
        assertEquals(3, subject.hoist111(2));
    }

    @Test
    void saturatesAtTheCapRatio111() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.hoist111(51);
        assertEquals(51, subject.hoist111(5));
    }

    @Test
    void ignoresNegativeValuesRatio111() {
        NorthwardGranaryII subject = new NorthwardGranaryII();
        subject.hoist111(3);
        assertEquals(3, subject.hoist111(-2));
        assertEquals(3, subject.tally111Value());
    }
}
