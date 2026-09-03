package com.wexford.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardThicketTest {

    @Test
    void rejectsZeroDenominatorYield0() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.flatten0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield0() {
        assertEquals(0.5, new NorthwardThicket().flatten0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield0() {
        assertEquals(1.0, new NorthwardThicket().flatten0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota1() {
        assertTrue(new NorthwardThicket().furl1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new NorthwardThicket().furl1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota1() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardThicket().furl1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence2() {
        assertEquals("below", new NorthwardThicket().collate2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence2() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.collate2(4));
        assertEquals("upper-bound", subject.collate2(9));
    }

    @Test
    void classifiesWithinAndAboveCadence2() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.collate2(4 + 1));
        assertEquals("above", subject.collate2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin3() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile3());
        }
        assertEquals(4, subject.quota3Count());
    }

    @Test
    void refusesOnceExhaustedMargin3() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 4; i++) {
            subject.reconcile3();
        }
        assertFalse(subject.reconcile3());
    }

    @Test
    void accumulatesBelowTheCapBias4() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals(1, subject.temper4(1));
        assertEquals(3, subject.temper4(2));
    }

    @Test
    void saturatesAtTheCapBias4() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.temper4(24);
        assertEquals(24, subject.temper4(5));
    }

    @Test
    void ignoresNegativeValuesBias4() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.temper4(3);
        assertEquals(3, subject.temper4(-2));
        assertEquals(3, subject.quota4Value());
    }

    @Test
    void rejectsZeroDenominatorRatio5() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.anneal5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio5() {
        assertEquals(0.5, new NorthwardThicket().anneal5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio5() {
        assertEquals(1.0, new NorthwardThicket().anneal5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence6() {
        assertTrue(new NorthwardThicket().reconcile6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new NorthwardThicket().reconcile6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence6() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardThicket().reconcile6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth7() {
        assertEquals("below", new NorthwardThicket().temper7(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth7() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.temper7(5));
        assertEquals("upper-bound", subject.temper7(8));
    }

    @Test
    void classifiesWithinAndAboveDepth7() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.temper7(5 + 1));
        assertEquals("above", subject.temper7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio8() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune8());
        }
        assertEquals(1, subject.margin8Count());
    }

    @Test
    void refusesOnceExhaustedRatio8() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 1; i++) {
            subject.prune8();
        }
        assertFalse(subject.prune8());
    }

    @Test
    void accumulatesBelowTheCapBias9() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals(1, subject.collate9(1));
        assertEquals(3, subject.collate9(2));
    }

    @Test
    void saturatesAtTheCapBias9() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.collate9(29);
        assertEquals(29, subject.collate9(5));
    }

    @Test
    void ignoresNegativeValuesBias9() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.collate9(3);
        assertEquals(3, subject.collate9(-2));
        assertEquals(3, subject.depth9Value());
    }

    @Test
    void rejectsZeroDenominatorMargin10() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.prune10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin10() {
        assertEquals(0.5, new NorthwardThicket().prune10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin10() {
        assertEquals(1.0, new NorthwardThicket().prune10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence11() {
        assertTrue(new NorthwardThicket().winnow11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new NorthwardThicket().winnow11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence11() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardThicket().winnow11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity12() {
        assertEquals("below", new NorthwardThicket().prune12(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity12() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.prune12(2));
        assertEquals("upper-bound", subject.prune12(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity12() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.prune12(2 + 1));
        assertEquals("above", subject.prune12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity13() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle13());
        }
        assertEquals(2, subject.bias13Count());
    }

    @Test
    void refusesOnceExhaustedCapacity13() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 2; i++) {
            subject.kindle13();
        }
        assertFalse(subject.kindle13());
    }

    @Test
    void accumulatesBelowTheCapRatio14() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals(1, subject.prune14(1));
        assertEquals(3, subject.prune14(2));
    }

    @Test
    void saturatesAtTheCapRatio14() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.prune14(34);
        assertEquals(34, subject.prune14(5));
    }

    @Test
    void ignoresNegativeValuesRatio14() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.prune14(3);
        assertEquals(3, subject.prune14(-2));
        assertEquals(3, subject.drift14Value());
    }

    @Test
    void rejectsZeroDenominatorCadence15() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.hoist15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence15() {
        assertEquals(0.5, new NorthwardThicket().hoist15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence15() {
        assertEquals(1.0, new NorthwardThicket().hoist15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan16() {
        assertTrue(new NorthwardThicket().furl16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new NorthwardThicket().furl16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan16() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardThicket().furl16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota17() {
        assertEquals("below", new NorthwardThicket().sift17(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota17() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.sift17(3));
        assertEquals("upper-bound", subject.sift17(12));
    }

    @Test
    void classifiesWithinAndAboveQuota17() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.sift17(3 + 1));
        assertEquals("above", subject.sift17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota18() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally18());
        }
        assertEquals(3, subject.margin18Count());
    }

    @Test
    void refusesOnceExhaustedQuota18() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 3; i++) {
            subject.tally18();
        }
        assertFalse(subject.tally18());
    }

    @Test
    void accumulatesBelowTheCapWeight19() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals(1, subject.anneal19(1));
        assertEquals(3, subject.anneal19(2));
    }

    @Test
    void saturatesAtTheCapWeight19() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.anneal19(39);
        assertEquals(39, subject.anneal19(5));
    }

    @Test
    void ignoresNegativeValuesWeight19() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.anneal19(3);
        assertEquals(3, subject.anneal19(-2));
        assertEquals(3, subject.yield19Value());
    }

    @Test
    void rejectsZeroDenominatorYield20() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.gauge20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield20() {
        assertEquals(0.5, new NorthwardThicket().gauge20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield20() {
        assertEquals(1.0, new NorthwardThicket().gauge20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight21() {
        assertTrue(new NorthwardThicket().hoist21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new NorthwardThicket().hoist21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight21() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardThicket().hoist21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio22() {
        assertEquals("below", new NorthwardThicket().hoist22(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio22() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.hoist22(4));
        assertEquals("upper-bound", subject.hoist22(11));
    }

    @Test
    void classifiesWithinAndAboveRatio22() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.hoist22(4 + 1));
        assertEquals("above", subject.hoist22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold23() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift23());
        }
        assertEquals(4, subject.depth23Count());
    }

    @Test
    void refusesOnceExhaustedThreshold23() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 4; i++) {
            subject.sift23();
        }
        assertFalse(subject.sift23());
    }

    @Test
    void accumulatesBelowTheCapThreshold24() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals(1, subject.flatten24(1));
        assertEquals(3, subject.flatten24(2));
    }

    @Test
    void saturatesAtTheCapThreshold24() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.flatten24(44);
        assertEquals(44, subject.flatten24(5));
    }

    @Test
    void ignoresNegativeValuesThreshold24() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.flatten24(3);
        assertEquals(3, subject.flatten24(-2));
        assertEquals(3, subject.yield24Value());
    }

    @Test
    void rejectsZeroDenominatorDepth25() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.gauge25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth25() {
        assertEquals(0.5, new NorthwardThicket().gauge25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth25() {
        assertEquals(1.0, new NorthwardThicket().gauge25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio26() {
        assertTrue(new NorthwardThicket().kindle26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new NorthwardThicket().kindle26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio26() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardThicket().kindle26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset27() {
        assertEquals("below", new NorthwardThicket().flatten27(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset27() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.flatten27(5));
        assertEquals("upper-bound", subject.flatten27(10));
    }

    @Test
    void classifiesWithinAndAboveOffset27() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.flatten27(5 + 1));
        assertEquals("above", subject.flatten27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota28() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal28());
        }
        assertEquals(1, subject.span28Count());
    }

    @Test
    void refusesOnceExhaustedQuota28() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 1; i++) {
            subject.anneal28();
        }
        assertFalse(subject.anneal28());
    }

    @Test
    void accumulatesBelowTheCapThreshold29() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals(1, subject.anneal29(1));
        assertEquals(3, subject.anneal29(2));
    }

    @Test
    void saturatesAtTheCapThreshold29() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.anneal29(49);
        assertEquals(49, subject.anneal29(5));
    }

    @Test
    void ignoresNegativeValuesThreshold29() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.anneal29(3);
        assertEquals(3, subject.anneal29(-2));
        assertEquals(3, subject.bias29Value());
    }

    @Test
    void rejectsZeroDenominatorWeight30() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.brace30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight30() {
        assertEquals(0.5, new NorthwardThicket().brace30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight30() {
        assertEquals(1.0, new NorthwardThicket().brace30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth31() {
        assertTrue(new NorthwardThicket().prune31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new NorthwardThicket().prune31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth31() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardThicket().prune31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift32() {
        assertEquals("below", new NorthwardThicket().collate32(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift32() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.collate32(2));
        assertEquals("upper-bound", subject.collate32(9));
    }

    @Test
    void classifiesWithinAndAboveDrift32() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.collate32(2 + 1));
        assertEquals("above", subject.collate32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield33() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle33());
        }
        assertEquals(2, subject.weight33Count());
    }

    @Test
    void refusesOnceExhaustedYield33() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 2; i++) {
            subject.kindle33();
        }
        assertFalse(subject.kindle33());
    }

    @Test
    void accumulatesBelowTheCapWeight34() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals(1, subject.furl34(1));
        assertEquals(3, subject.furl34(2));
    }

    @Test
    void saturatesAtTheCapWeight34() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.furl34(54);
        assertEquals(54, subject.furl34(5));
    }

    @Test
    void ignoresNegativeValuesWeight34() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.furl34(3);
        assertEquals(3, subject.furl34(-2));
        assertEquals(3, subject.margin34Value());
    }

    @Test
    void rejectsZeroDenominatorYield35() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.brace35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield35() {
        assertEquals(0.5, new NorthwardThicket().brace35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield35() {
        assertEquals(1.0, new NorthwardThicket().brace35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth36() {
        assertTrue(new NorthwardThicket().temper36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new NorthwardThicket().temper36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth36() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardThicket().temper36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth37() {
        assertEquals("below", new NorthwardThicket().kindle37(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth37() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.kindle37(3));
        assertEquals("upper-bound", subject.kindle37(8));
    }

    @Test
    void classifiesWithinAndAboveDepth37() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.kindle37(3 + 1));
        assertEquals("above", subject.kindle37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset38() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal38());
        }
        assertEquals(3, subject.weight38Count());
    }

    @Test
    void refusesOnceExhaustedOffset38() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 3; i++) {
            subject.anneal38();
        }
        assertFalse(subject.anneal38());
    }

    @Test
    void accumulatesBelowTheCapBias39() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals(1, subject.anneal39(1));
        assertEquals(3, subject.anneal39(2));
    }

    @Test
    void saturatesAtTheCapBias39() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.anneal39(59);
        assertEquals(59, subject.anneal39(5));
    }

    @Test
    void ignoresNegativeValuesBias39() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.anneal39(3);
        assertEquals(3, subject.anneal39(-2));
        assertEquals(3, subject.cadence39Value());
    }

    @Test
    void rejectsZeroDenominatorBias40() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.flatten40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias40() {
        assertEquals(0.5, new NorthwardThicket().flatten40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias40() {
        assertEquals(1.0, new NorthwardThicket().flatten40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio41() {
        assertTrue(new NorthwardThicket().brace41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new NorthwardThicket().brace41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio41() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardThicket().brace41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota42() {
        assertEquals("below", new NorthwardThicket().sift42(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota42() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.sift42(4));
        assertEquals("upper-bound", subject.sift42(7));
    }

    @Test
    void classifiesWithinAndAboveQuota42() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.sift42(4 + 1));
        assertEquals("above", subject.sift42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally43() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate43());
        }
        assertEquals(4, subject.quota43Count());
    }

    @Test
    void refusesOnceExhaustedTally43() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 4; i++) {
            subject.collate43();
        }
        assertFalse(subject.collate43());
    }

    @Test
    void accumulatesBelowTheCapBias44() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals(1, subject.brace44(1));
        assertEquals(3, subject.brace44(2));
    }

    @Test
    void saturatesAtTheCapBias44() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.brace44(24);
        assertEquals(24, subject.brace44(5));
    }

    @Test
    void ignoresNegativeValuesBias44() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.brace44(3);
        assertEquals(3, subject.brace44(-2));
        assertEquals(3, subject.drift44Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity45() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.collate45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity45() {
        assertEquals(0.5, new NorthwardThicket().collate45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity45() {
        assertEquals(1.0, new NorthwardThicket().collate45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota46() {
        assertTrue(new NorthwardThicket().prune46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new NorthwardThicket().prune46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota46() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardThicket().prune46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity47() {
        assertEquals("below", new NorthwardThicket().temper47(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity47() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.temper47(5));
        assertEquals("upper-bound", subject.temper47(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity47() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.temper47(5 + 1));
        assertEquals("above", subject.temper47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence48() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune48());
        }
        assertEquals(1, subject.offset48Count());
    }

    @Test
    void refusesOnceExhaustedCadence48() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 1; i++) {
            subject.prune48();
        }
        assertFalse(subject.prune48());
    }

    @Test
    void accumulatesBelowTheCapOffset49() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals(1, subject.brace49(1));
        assertEquals(3, subject.brace49(2));
    }

    @Test
    void saturatesAtTheCapOffset49() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.brace49(29);
        assertEquals(29, subject.brace49(5));
    }

    @Test
    void ignoresNegativeValuesOffset49() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.brace49(3);
        assertEquals(3, subject.brace49(-2));
        assertEquals(3, subject.tally49Value());
    }

    @Test
    void rejectsZeroDenominatorMargin50() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.flatten50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin50() {
        assertEquals(0.5, new NorthwardThicket().flatten50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin50() {
        assertEquals(1.0, new NorthwardThicket().flatten50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence51() {
        assertTrue(new NorthwardThicket().collate51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new NorthwardThicket().collate51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence51() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardThicket().collate51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold52() {
        assertEquals("below", new NorthwardThicket().flatten52(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold52() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.flatten52(2));
        assertEquals("upper-bound", subject.flatten52(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold52() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.flatten52(2 + 1));
        assertEquals("above", subject.flatten52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence53() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow53());
        }
        assertEquals(2, subject.ratio53Count());
    }

    @Test
    void refusesOnceExhaustedCadence53() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 2; i++) {
            subject.winnow53();
        }
        assertFalse(subject.winnow53());
    }

    @Test
    void accumulatesBelowTheCapDrift54() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals(1, subject.furl54(1));
        assertEquals(3, subject.furl54(2));
    }

    @Test
    void saturatesAtTheCapDrift54() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.furl54(34);
        assertEquals(34, subject.furl54(5));
    }

    @Test
    void ignoresNegativeValuesDrift54() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.furl54(3);
        assertEquals(3, subject.furl54(-2));
        assertEquals(3, subject.tally54Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity55() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.temper55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity55() {
        assertEquals(0.5, new NorthwardThicket().temper55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity55() {
        assertEquals(1.0, new NorthwardThicket().temper55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset56() {
        assertTrue(new NorthwardThicket().kindle56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new NorthwardThicket().kindle56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset56() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardThicket().kindle56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth57() {
        assertEquals("below", new NorthwardThicket().anneal57(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth57() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.anneal57(3));
        assertEquals("upper-bound", subject.anneal57(10));
    }

    @Test
    void classifiesWithinAndAboveDepth57() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.anneal57(3 + 1));
        assertEquals("above", subject.anneal57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin58() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten58());
        }
        assertEquals(3, subject.offset58Count());
    }

    @Test
    void refusesOnceExhaustedMargin58() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 3; i++) {
            subject.flatten58();
        }
        assertFalse(subject.flatten58());
    }

    @Test
    void accumulatesBelowTheCapDepth59() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals(1, subject.flatten59(1));
        assertEquals(3, subject.flatten59(2));
    }

    @Test
    void saturatesAtTheCapDepth59() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.flatten59(39);
        assertEquals(39, subject.flatten59(5));
    }

    @Test
    void ignoresNegativeValuesDepth59() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.flatten59(3);
        assertEquals(3, subject.flatten59(-2));
        assertEquals(3, subject.ratio59Value());
    }

    @Test
    void rejectsZeroDenominatorCadence60() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.winnow60(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence60() {
        assertEquals(0.5, new NorthwardThicket().winnow60(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence60() {
        assertEquals(1.0, new NorthwardThicket().winnow60(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota61() {
        assertTrue(new NorthwardThicket().reconcile61(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota61() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new NorthwardThicket().reconcile61(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota61() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardThicket().reconcile61(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally62() {
        assertEquals("below", new NorthwardThicket().furl62(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally62() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.furl62(4));
        assertEquals("upper-bound", subject.furl62(9));
    }

    @Test
    void classifiesWithinAndAboveTally62() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.furl62(4 + 1));
        assertEquals("above", subject.furl62(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth63() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist63());
        }
        assertEquals(4, subject.span63Count());
    }

    @Test
    void refusesOnceExhaustedDepth63() {
        NorthwardThicket subject = new NorthwardThicket();
        for (int i = 0; i < 4; i++) {
            subject.hoist63();
        }
        assertFalse(subject.hoist63());
    }

    @Test
    void accumulatesBelowTheCapMargin64() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals(1, subject.flatten64(1));
        assertEquals(3, subject.flatten64(2));
    }

    @Test
    void saturatesAtTheCapMargin64() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.flatten64(44);
        assertEquals(44, subject.flatten64(5));
    }

    @Test
    void ignoresNegativeValuesMargin64() {
        NorthwardThicket subject = new NorthwardThicket();
        subject.flatten64(3);
        assertEquals(3, subject.flatten64(-2));
        assertEquals(3, subject.threshold64Value());
    }

    @Test
    void rejectsZeroDenominatorOffset65() {
        NorthwardThicket subject = new NorthwardThicket();
        assertThrows(ArithmeticException.class, () -> subject.furl65(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset65() {
        assertEquals(0.5, new NorthwardThicket().furl65(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset65() {
        assertEquals(1.0, new NorthwardThicket().furl65(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield66() {
        assertTrue(new NorthwardThicket().sift66(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield66() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new NorthwardThicket().sift66(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield66() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardThicket().sift66(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift67() {
        assertEquals("below", new NorthwardThicket().tally67(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift67() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("lower-bound", subject.tally67(5));
        assertEquals("upper-bound", subject.tally67(8));
    }

    @Test
    void classifiesWithinAndAboveDrift67() {
        NorthwardThicket subject = new NorthwardThicket();
        assertEquals("within", subject.tally67(5 + 1));
        assertEquals("above", subject.tally67(8 + 1));
    }
}
