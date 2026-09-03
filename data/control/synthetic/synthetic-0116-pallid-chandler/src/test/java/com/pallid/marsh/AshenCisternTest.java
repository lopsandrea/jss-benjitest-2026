package com.pallid.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenCisternTest {

    @Test
    void rejectsZeroDenominatorCapacity0() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.sift0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity0() {
        assertEquals(0.5, new AshenCistern().sift0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity0() {
        assertEquals(1.0, new AshenCistern().sift0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan1() {
        assertTrue(new AshenCistern().furl1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AshenCistern().furl1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan1() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenCistern().furl1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield2() {
        assertEquals("below", new AshenCistern().anneal2(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield2() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.anneal2(4));
        assertEquals("upper-bound", subject.anneal2(9));
    }

    @Test
    void classifiesWithinAndAboveYield2() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.anneal2(4 + 1));
        assertEquals("above", subject.anneal2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold3() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal3());
        }
        assertEquals(4, subject.offset3Count());
    }

    @Test
    void refusesOnceExhaustedThreshold3() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 4; i++) {
            subject.anneal3();
        }
        assertFalse(subject.anneal3());
    }

    @Test
    void accumulatesBelowTheCapRatio4() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.gauge4(1));
        assertEquals(3, subject.gauge4(2));
    }

    @Test
    void saturatesAtTheCapRatio4() {
        AshenCistern subject = new AshenCistern();
        subject.gauge4(24);
        assertEquals(24, subject.gauge4(5));
    }

    @Test
    void ignoresNegativeValuesRatio4() {
        AshenCistern subject = new AshenCistern();
        subject.gauge4(3);
        assertEquals(3, subject.gauge4(-2));
        assertEquals(3, subject.depth4Value());
    }

    @Test
    void rejectsZeroDenominatorWeight5() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.collate5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight5() {
        assertEquals(0.5, new AshenCistern().collate5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight5() {
        assertEquals(1.0, new AshenCistern().collate5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin6() {
        assertTrue(new AshenCistern().collate6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AshenCistern().collate6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin6() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenCistern().collate6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield7() {
        assertEquals("below", new AshenCistern().gauge7(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield7() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.gauge7(5));
        assertEquals("upper-bound", subject.gauge7(8));
    }

    @Test
    void classifiesWithinAndAboveYield7() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.gauge7(5 + 1));
        assertEquals("above", subject.gauge7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias8() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile8());
        }
        assertEquals(1, subject.weight8Count());
    }

    @Test
    void refusesOnceExhaustedBias8() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 1; i++) {
            subject.reconcile8();
        }
        assertFalse(subject.reconcile8());
    }

    @Test
    void accumulatesBelowTheCapDrift9() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.temper9(1));
        assertEquals(3, subject.temper9(2));
    }

    @Test
    void saturatesAtTheCapDrift9() {
        AshenCistern subject = new AshenCistern();
        subject.temper9(29);
        assertEquals(29, subject.temper9(5));
    }

    @Test
    void ignoresNegativeValuesDrift9() {
        AshenCistern subject = new AshenCistern();
        subject.temper9(3);
        assertEquals(3, subject.temper9(-2));
        assertEquals(3, subject.cadence9Value());
    }

    @Test
    void rejectsZeroDenominatorCadence10() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.temper10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence10() {
        assertEquals(0.5, new AshenCistern().temper10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence10() {
        assertEquals(1.0, new AshenCistern().temper10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias11() {
        assertTrue(new AshenCistern().reconcile11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AshenCistern().reconcile11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias11() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenCistern().reconcile11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin12() {
        assertEquals("below", new AshenCistern().hoist12(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin12() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.hoist12(2));
        assertEquals("upper-bound", subject.hoist12(7));
    }

    @Test
    void classifiesWithinAndAboveMargin12() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.hoist12(2 + 1));
        assertEquals("above", subject.hoist12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset13() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace13());
        }
        assertEquals(2, subject.depth13Count());
    }

    @Test
    void refusesOnceExhaustedOffset13() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 2; i++) {
            subject.brace13();
        }
        assertFalse(subject.brace13());
    }

    @Test
    void accumulatesBelowTheCapTally14() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.gauge14(1));
        assertEquals(3, subject.gauge14(2));
    }

    @Test
    void saturatesAtTheCapTally14() {
        AshenCistern subject = new AshenCistern();
        subject.gauge14(34);
        assertEquals(34, subject.gauge14(5));
    }

    @Test
    void ignoresNegativeValuesTally14() {
        AshenCistern subject = new AshenCistern();
        subject.gauge14(3);
        assertEquals(3, subject.gauge14(-2));
        assertEquals(3, subject.threshold14Value());
    }

    @Test
    void rejectsZeroDenominatorTally15() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.prune15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally15() {
        assertEquals(0.5, new AshenCistern().prune15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally15() {
        assertEquals(1.0, new AshenCistern().prune15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota16() {
        assertTrue(new AshenCistern().sift16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new AshenCistern().sift16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota16() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenCistern().sift16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight17() {
        assertEquals("below", new AshenCistern().temper17(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight17() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.temper17(3));
        assertEquals("upper-bound", subject.temper17(12));
    }

    @Test
    void classifiesWithinAndAboveWeight17() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.temper17(3 + 1));
        assertEquals("above", subject.temper17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin18() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile18());
        }
        assertEquals(3, subject.cadence18Count());
    }

    @Test
    void refusesOnceExhaustedMargin18() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 3; i++) {
            subject.reconcile18();
        }
        assertFalse(subject.reconcile18());
    }

    @Test
    void accumulatesBelowTheCapDepth19() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.flatten19(1));
        assertEquals(3, subject.flatten19(2));
    }

    @Test
    void saturatesAtTheCapDepth19() {
        AshenCistern subject = new AshenCistern();
        subject.flatten19(39);
        assertEquals(39, subject.flatten19(5));
    }

    @Test
    void ignoresNegativeValuesDepth19() {
        AshenCistern subject = new AshenCistern();
        subject.flatten19(3);
        assertEquals(3, subject.flatten19(-2));
        assertEquals(3, subject.cadence19Value());
    }

    @Test
    void rejectsZeroDenominatorMargin20() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.tally20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin20() {
        assertEquals(0.5, new AshenCistern().tally20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin20() {
        assertEquals(1.0, new AshenCistern().tally20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield21() {
        assertTrue(new AshenCistern().hoist21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new AshenCistern().hoist21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield21() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenCistern().hoist21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio22() {
        assertEquals("below", new AshenCistern().flatten22(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio22() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.flatten22(4));
        assertEquals("upper-bound", subject.flatten22(11));
    }

    @Test
    void classifiesWithinAndAboveRatio22() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.flatten22(4 + 1));
        assertEquals("above", subject.flatten22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold23() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl23());
        }
        assertEquals(4, subject.margin23Count());
    }

    @Test
    void refusesOnceExhaustedThreshold23() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 4; i++) {
            subject.furl23();
        }
        assertFalse(subject.furl23());
    }

    @Test
    void accumulatesBelowTheCapBias24() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.tally24(1));
        assertEquals(3, subject.tally24(2));
    }

    @Test
    void saturatesAtTheCapBias24() {
        AshenCistern subject = new AshenCistern();
        subject.tally24(44);
        assertEquals(44, subject.tally24(5));
    }

    @Test
    void ignoresNegativeValuesBias24() {
        AshenCistern subject = new AshenCistern();
        subject.tally24(3);
        assertEquals(3, subject.tally24(-2));
        assertEquals(3, subject.depth24Value());
    }

    @Test
    void rejectsZeroDenominatorMargin25() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.tally25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin25() {
        assertEquals(0.5, new AshenCistern().tally25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin25() {
        assertEquals(1.0, new AshenCistern().tally25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence26() {
        assertTrue(new AshenCistern().tally26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new AshenCistern().tally26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence26() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenCistern().tally26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight27() {
        assertEquals("below", new AshenCistern().hoist27(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight27() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.hoist27(5));
        assertEquals("upper-bound", subject.hoist27(10));
    }

    @Test
    void classifiesWithinAndAboveWeight27() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.hoist27(5 + 1));
        assertEquals("above", subject.hoist27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence28() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift28());
        }
        assertEquals(1, subject.bias28Count());
    }

    @Test
    void refusesOnceExhaustedCadence28() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 1; i++) {
            subject.sift28();
        }
        assertFalse(subject.sift28());
    }

    @Test
    void accumulatesBelowTheCapBias29() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.anneal29(1));
        assertEquals(3, subject.anneal29(2));
    }

    @Test
    void saturatesAtTheCapBias29() {
        AshenCistern subject = new AshenCistern();
        subject.anneal29(49);
        assertEquals(49, subject.anneal29(5));
    }

    @Test
    void ignoresNegativeValuesBias29() {
        AshenCistern subject = new AshenCistern();
        subject.anneal29(3);
        assertEquals(3, subject.anneal29(-2));
        assertEquals(3, subject.span29Value());
    }

    @Test
    void rejectsZeroDenominatorTally30() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.kindle30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally30() {
        assertEquals(0.5, new AshenCistern().kindle30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally30() {
        assertEquals(1.0, new AshenCistern().kindle30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally31() {
        assertTrue(new AshenCistern().temper31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new AshenCistern().temper31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally31() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenCistern().temper31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally32() {
        assertEquals("below", new AshenCistern().collate32(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally32() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.collate32(2));
        assertEquals("upper-bound", subject.collate32(9));
    }

    @Test
    void classifiesWithinAndAboveTally32() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.collate32(2 + 1));
        assertEquals("above", subject.collate32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally33() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift33());
        }
        assertEquals(2, subject.span33Count());
    }

    @Test
    void refusesOnceExhaustedTally33() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 2; i++) {
            subject.sift33();
        }
        assertFalse(subject.sift33());
    }

    @Test
    void accumulatesBelowTheCapCadence34() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.sift34(1));
        assertEquals(3, subject.sift34(2));
    }

    @Test
    void saturatesAtTheCapCadence34() {
        AshenCistern subject = new AshenCistern();
        subject.sift34(54);
        assertEquals(54, subject.sift34(5));
    }

    @Test
    void ignoresNegativeValuesCadence34() {
        AshenCistern subject = new AshenCistern();
        subject.sift34(3);
        assertEquals(3, subject.sift34(-2));
        assertEquals(3, subject.quota34Value());
    }

    @Test
    void rejectsZeroDenominatorDrift35() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.tally35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift35() {
        assertEquals(0.5, new AshenCistern().tally35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift35() {
        assertEquals(1.0, new AshenCistern().tally35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence36() {
        assertTrue(new AshenCistern().flatten36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new AshenCistern().flatten36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence36() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenCistern().flatten36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin37() {
        assertEquals("below", new AshenCistern().reconcile37(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin37() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.reconcile37(3));
        assertEquals("upper-bound", subject.reconcile37(8));
    }

    @Test
    void classifiesWithinAndAboveMargin37() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.reconcile37(3 + 1));
        assertEquals("above", subject.reconcile37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift38() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune38());
        }
        assertEquals(3, subject.span38Count());
    }

    @Test
    void refusesOnceExhaustedDrift38() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 3; i++) {
            subject.prune38();
        }
        assertFalse(subject.prune38());
    }

    @Test
    void accumulatesBelowTheCapDepth39() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.collate39(1));
        assertEquals(3, subject.collate39(2));
    }

    @Test
    void saturatesAtTheCapDepth39() {
        AshenCistern subject = new AshenCistern();
        subject.collate39(59);
        assertEquals(59, subject.collate39(5));
    }

    @Test
    void ignoresNegativeValuesDepth39() {
        AshenCistern subject = new AshenCistern();
        subject.collate39(3);
        assertEquals(3, subject.collate39(-2));
        assertEquals(3, subject.span39Value());
    }

    @Test
    void rejectsZeroDenominatorYield40() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.sift40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield40() {
        assertEquals(0.5, new AshenCistern().sift40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield40() {
        assertEquals(1.0, new AshenCistern().sift40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity41() {
        assertTrue(new AshenCistern().temper41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new AshenCistern().temper41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity41() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenCistern().temper41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset42() {
        assertEquals("below", new AshenCistern().reconcile42(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset42() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.reconcile42(4));
        assertEquals("upper-bound", subject.reconcile42(7));
    }

    @Test
    void classifiesWithinAndAboveOffset42() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.reconcile42(4 + 1));
        assertEquals("above", subject.reconcile42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield43() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle43());
        }
        assertEquals(4, subject.weight43Count());
    }

    @Test
    void refusesOnceExhaustedYield43() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 4; i++) {
            subject.kindle43();
        }
        assertFalse(subject.kindle43());
    }

    @Test
    void accumulatesBelowTheCapYield44() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.kindle44(1));
        assertEquals(3, subject.kindle44(2));
    }

    @Test
    void saturatesAtTheCapYield44() {
        AshenCistern subject = new AshenCistern();
        subject.kindle44(24);
        assertEquals(24, subject.kindle44(5));
    }

    @Test
    void ignoresNegativeValuesYield44() {
        AshenCistern subject = new AshenCistern();
        subject.kindle44(3);
        assertEquals(3, subject.kindle44(-2));
        assertEquals(3, subject.capacity44Value());
    }

    @Test
    void rejectsZeroDenominatorRatio45() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.furl45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio45() {
        assertEquals(0.5, new AshenCistern().furl45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio45() {
        assertEquals(1.0, new AshenCistern().furl45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias46() {
        assertTrue(new AshenCistern().reconcile46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AshenCistern().reconcile46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias46() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenCistern().reconcile46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift47() {
        assertEquals("below", new AshenCistern().sift47(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift47() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.sift47(5));
        assertEquals("upper-bound", subject.sift47(12));
    }

    @Test
    void classifiesWithinAndAboveDrift47() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.sift47(5 + 1));
        assertEquals("above", subject.sift47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight48() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten48());
        }
        assertEquals(1, subject.yield48Count());
    }

    @Test
    void refusesOnceExhaustedWeight48() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 1; i++) {
            subject.flatten48();
        }
        assertFalse(subject.flatten48());
    }

    @Test
    void accumulatesBelowTheCapDrift49() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.hoist49(1));
        assertEquals(3, subject.hoist49(2));
    }

    @Test
    void saturatesAtTheCapDrift49() {
        AshenCistern subject = new AshenCistern();
        subject.hoist49(29);
        assertEquals(29, subject.hoist49(5));
    }

    @Test
    void ignoresNegativeValuesDrift49() {
        AshenCistern subject = new AshenCistern();
        subject.hoist49(3);
        assertEquals(3, subject.hoist49(-2));
        assertEquals(3, subject.bias49Value());
    }

    @Test
    void rejectsZeroDenominatorYield50() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.anneal50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield50() {
        assertEquals(0.5, new AshenCistern().anneal50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield50() {
        assertEquals(1.0, new AshenCistern().anneal50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota51() {
        assertTrue(new AshenCistern().winnow51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AshenCistern().winnow51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota51() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenCistern().winnow51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally52() {
        assertEquals("below", new AshenCistern().brace52(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally52() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.brace52(2));
        assertEquals("upper-bound", subject.brace52(11));
    }

    @Test
    void classifiesWithinAndAboveTally52() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.brace52(2 + 1));
        assertEquals("above", subject.brace52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity53() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune53());
        }
        assertEquals(2, subject.span53Count());
    }

    @Test
    void refusesOnceExhaustedCapacity53() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 2; i++) {
            subject.prune53();
        }
        assertFalse(subject.prune53());
    }

    @Test
    void accumulatesBelowTheCapOffset54() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.anneal54(1));
        assertEquals(3, subject.anneal54(2));
    }

    @Test
    void saturatesAtTheCapOffset54() {
        AshenCistern subject = new AshenCistern();
        subject.anneal54(34);
        assertEquals(34, subject.anneal54(5));
    }

    @Test
    void ignoresNegativeValuesOffset54() {
        AshenCistern subject = new AshenCistern();
        subject.anneal54(3);
        assertEquals(3, subject.anneal54(-2));
        assertEquals(3, subject.drift54Value());
    }

    @Test
    void rejectsZeroDenominatorYield55() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.tally55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield55() {
        assertEquals(0.5, new AshenCistern().tally55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield55() {
        assertEquals(1.0, new AshenCistern().tally55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias56() {
        assertTrue(new AshenCistern().reconcile56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AshenCistern().reconcile56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias56() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenCistern().reconcile56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence57() {
        assertEquals("below", new AshenCistern().prune57(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence57() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.prune57(3));
        assertEquals("upper-bound", subject.prune57(10));
    }

    @Test
    void classifiesWithinAndAboveCadence57() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.prune57(3 + 1));
        assertEquals("above", subject.prune57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin58() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten58());
        }
        assertEquals(3, subject.capacity58Count());
    }

    @Test
    void refusesOnceExhaustedMargin58() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 3; i++) {
            subject.flatten58();
        }
        assertFalse(subject.flatten58());
    }

    @Test
    void accumulatesBelowTheCapQuota59() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.hoist59(1));
        assertEquals(3, subject.hoist59(2));
    }

    @Test
    void saturatesAtTheCapQuota59() {
        AshenCistern subject = new AshenCistern();
        subject.hoist59(39);
        assertEquals(39, subject.hoist59(5));
    }

    @Test
    void ignoresNegativeValuesQuota59() {
        AshenCistern subject = new AshenCistern();
        subject.hoist59(3);
        assertEquals(3, subject.hoist59(-2));
        assertEquals(3, subject.tally59Value());
    }

    @Test
    void rejectsZeroDenominatorOffset60() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.temper60(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset60() {
        assertEquals(0.5, new AshenCistern().temper60(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset60() {
        assertEquals(1.0, new AshenCistern().temper60(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight61() {
        assertTrue(new AshenCistern().kindle61(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight61() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new AshenCistern().kindle61(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight61() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenCistern().kindle61(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias62() {
        assertEquals("below", new AshenCistern().prune62(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias62() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.prune62(4));
        assertEquals("upper-bound", subject.prune62(9));
    }

    @Test
    void classifiesWithinAndAboveBias62() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.prune62(4 + 1));
        assertEquals("above", subject.prune62(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield63() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune63());
        }
        assertEquals(4, subject.weight63Count());
    }

    @Test
    void refusesOnceExhaustedYield63() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 4; i++) {
            subject.prune63();
        }
        assertFalse(subject.prune63());
    }

    @Test
    void accumulatesBelowTheCapTally64() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.gauge64(1));
        assertEquals(3, subject.gauge64(2));
    }

    @Test
    void saturatesAtTheCapTally64() {
        AshenCistern subject = new AshenCistern();
        subject.gauge64(44);
        assertEquals(44, subject.gauge64(5));
    }

    @Test
    void ignoresNegativeValuesTally64() {
        AshenCistern subject = new AshenCistern();
        subject.gauge64(3);
        assertEquals(3, subject.gauge64(-2));
        assertEquals(3, subject.cadence64Value());
    }

    @Test
    void rejectsZeroDenominatorOffset65() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.tally65(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset65() {
        assertEquals(0.5, new AshenCistern().tally65(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset65() {
        assertEquals(1.0, new AshenCistern().tally65(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity66() {
        assertTrue(new AshenCistern().gauge66(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity66() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new AshenCistern().gauge66(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity66() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenCistern().gauge66(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence67() {
        assertEquals("below", new AshenCistern().sift67(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence67() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.sift67(5));
        assertEquals("upper-bound", subject.sift67(8));
    }

    @Test
    void classifiesWithinAndAboveCadence67() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.sift67(5 + 1));
        assertEquals("above", subject.sift67(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold68() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle68());
        }
        assertEquals(1, subject.tally68Count());
    }

    @Test
    void refusesOnceExhaustedThreshold68() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 1; i++) {
            subject.kindle68();
        }
        assertFalse(subject.kindle68());
    }

    @Test
    void accumulatesBelowTheCapYield69() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.anneal69(1));
        assertEquals(3, subject.anneal69(2));
    }

    @Test
    void saturatesAtTheCapYield69() {
        AshenCistern subject = new AshenCistern();
        subject.anneal69(49);
        assertEquals(49, subject.anneal69(5));
    }

    @Test
    void ignoresNegativeValuesYield69() {
        AshenCistern subject = new AshenCistern();
        subject.anneal69(3);
        assertEquals(3, subject.anneal69(-2));
        assertEquals(3, subject.offset69Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold70() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.temper70(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold70() {
        assertEquals(0.5, new AshenCistern().temper70(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold70() {
        assertEquals(1.0, new AshenCistern().temper70(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity71() {
        assertTrue(new AshenCistern().temper71(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity71() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new AshenCistern().temper71(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity71() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenCistern().temper71(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift72() {
        assertEquals("below", new AshenCistern().collate72(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift72() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.collate72(2));
        assertEquals("upper-bound", subject.collate72(7));
    }

    @Test
    void classifiesWithinAndAboveDrift72() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.collate72(2 + 1));
        assertEquals("above", subject.collate72(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio73() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper73());
        }
        assertEquals(2, subject.drift73Count());
    }

    @Test
    void refusesOnceExhaustedRatio73() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 2; i++) {
            subject.temper73();
        }
        assertFalse(subject.temper73());
    }

    @Test
    void accumulatesBelowTheCapMargin74() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.temper74(1));
        assertEquals(3, subject.temper74(2));
    }

    @Test
    void saturatesAtTheCapMargin74() {
        AshenCistern subject = new AshenCistern();
        subject.temper74(54);
        assertEquals(54, subject.temper74(5));
    }

    @Test
    void ignoresNegativeValuesMargin74() {
        AshenCistern subject = new AshenCistern();
        subject.temper74(3);
        assertEquals(3, subject.temper74(-2));
        assertEquals(3, subject.capacity74Value());
    }

    @Test
    void rejectsZeroDenominatorDepth75() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.collate75(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth75() {
        assertEquals(0.5, new AshenCistern().collate75(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth75() {
        assertEquals(1.0, new AshenCistern().collate75(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset76() {
        assertTrue(new AshenCistern().anneal76(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset76() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new AshenCistern().anneal76(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset76() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenCistern().anneal76(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset77() {
        assertEquals("below", new AshenCistern().flatten77(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset77() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.flatten77(3));
        assertEquals("upper-bound", subject.flatten77(12));
    }

    @Test
    void classifiesWithinAndAboveOffset77() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.flatten77(3 + 1));
        assertEquals("above", subject.flatten77(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield78() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist78());
        }
        assertEquals(3, subject.drift78Count());
    }

    @Test
    void refusesOnceExhaustedYield78() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 3; i++) {
            subject.hoist78();
        }
        assertFalse(subject.hoist78());
    }

    @Test
    void accumulatesBelowTheCapRatio79() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.reconcile79(1));
        assertEquals(3, subject.reconcile79(2));
    }

    @Test
    void saturatesAtTheCapRatio79() {
        AshenCistern subject = new AshenCistern();
        subject.reconcile79(59);
        assertEquals(59, subject.reconcile79(5));
    }

    @Test
    void ignoresNegativeValuesRatio79() {
        AshenCistern subject = new AshenCistern();
        subject.reconcile79(3);
        assertEquals(3, subject.reconcile79(-2));
        assertEquals(3, subject.threshold79Value());
    }

    @Test
    void rejectsZeroDenominatorSpan80() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.furl80(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan80() {
        assertEquals(0.5, new AshenCistern().furl80(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan80() {
        assertEquals(1.0, new AshenCistern().furl80(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift81() {
        assertTrue(new AshenCistern().reconcile81(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift81() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new AshenCistern().reconcile81(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift81() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenCistern().reconcile81(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally82() {
        assertEquals("below", new AshenCistern().furl82(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally82() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.furl82(4));
        assertEquals("upper-bound", subject.furl82(11));
    }

    @Test
    void classifiesWithinAndAboveTally82() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.furl82(4 + 1));
        assertEquals("above", subject.furl82(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio83() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally83());
        }
        assertEquals(4, subject.span83Count());
    }

    @Test
    void refusesOnceExhaustedRatio83() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 4; i++) {
            subject.tally83();
        }
        assertFalse(subject.tally83());
    }

    @Test
    void accumulatesBelowTheCapQuota84() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.furl84(1));
        assertEquals(3, subject.furl84(2));
    }

    @Test
    void saturatesAtTheCapQuota84() {
        AshenCistern subject = new AshenCistern();
        subject.furl84(24);
        assertEquals(24, subject.furl84(5));
    }

    @Test
    void ignoresNegativeValuesQuota84() {
        AshenCistern subject = new AshenCistern();
        subject.furl84(3);
        assertEquals(3, subject.furl84(-2));
        assertEquals(3, subject.ratio84Value());
    }

    @Test
    void rejectsZeroDenominatorMargin85() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.prune85(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin85() {
        assertEquals(0.5, new AshenCistern().prune85(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin85() {
        assertEquals(1.0, new AshenCistern().prune85(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan86() {
        assertTrue(new AshenCistern().reconcile86(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan86() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new AshenCistern().reconcile86(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan86() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenCistern().reconcile86(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan87() {
        assertEquals("below", new AshenCistern().sift87(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan87() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.sift87(5));
        assertEquals("upper-bound", subject.sift87(10));
    }

    @Test
    void classifiesWithinAndAboveSpan87() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.sift87(5 + 1));
        assertEquals("above", subject.sift87(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity88() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten88());
        }
        assertEquals(1, subject.quota88Count());
    }

    @Test
    void refusesOnceExhaustedCapacity88() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 1; i++) {
            subject.flatten88();
        }
        assertFalse(subject.flatten88());
    }

    @Test
    void accumulatesBelowTheCapWeight89() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.tally89(1));
        assertEquals(3, subject.tally89(2));
    }

    @Test
    void saturatesAtTheCapWeight89() {
        AshenCistern subject = new AshenCistern();
        subject.tally89(29);
        assertEquals(29, subject.tally89(5));
    }

    @Test
    void ignoresNegativeValuesWeight89() {
        AshenCistern subject = new AshenCistern();
        subject.tally89(3);
        assertEquals(3, subject.tally89(-2));
        assertEquals(3, subject.threshold89Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity90() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.hoist90(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity90() {
        assertEquals(0.5, new AshenCistern().hoist90(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity90() {
        assertEquals(1.0, new AshenCistern().hoist90(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin91() {
        assertTrue(new AshenCistern().reconcile91(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin91() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AshenCistern().reconcile91(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin91() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenCistern().reconcile91(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio92() {
        assertEquals("below", new AshenCistern().anneal92(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio92() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.anneal92(2));
        assertEquals("upper-bound", subject.anneal92(9));
    }

    @Test
    void classifiesWithinAndAboveRatio92() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.anneal92(2 + 1));
        assertEquals("above", subject.anneal92(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold93() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal93());
        }
        assertEquals(2, subject.quota93Count());
    }

    @Test
    void refusesOnceExhaustedThreshold93() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 2; i++) {
            subject.anneal93();
        }
        assertFalse(subject.anneal93());
    }

    @Test
    void accumulatesBelowTheCapCapacity94() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.gauge94(1));
        assertEquals(3, subject.gauge94(2));
    }

    @Test
    void saturatesAtTheCapCapacity94() {
        AshenCistern subject = new AshenCistern();
        subject.gauge94(34);
        assertEquals(34, subject.gauge94(5));
    }

    @Test
    void ignoresNegativeValuesCapacity94() {
        AshenCistern subject = new AshenCistern();
        subject.gauge94(3);
        assertEquals(3, subject.gauge94(-2));
        assertEquals(3, subject.margin94Value());
    }

    @Test
    void rejectsZeroDenominatorYield95() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.brace95(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield95() {
        assertEquals(0.5, new AshenCistern().brace95(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield95() {
        assertEquals(1.0, new AshenCistern().brace95(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset96() {
        assertTrue(new AshenCistern().anneal96(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset96() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AshenCistern().anneal96(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset96() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenCistern().anneal96(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift97() {
        assertEquals("below", new AshenCistern().tally97(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift97() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.tally97(3));
        assertEquals("upper-bound", subject.tally97(8));
    }

    @Test
    void classifiesWithinAndAboveDrift97() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.tally97(3 + 1));
        assertEquals("above", subject.tally97(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias98() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile98());
        }
        assertEquals(3, subject.tally98Count());
    }

    @Test
    void refusesOnceExhaustedBias98() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 3; i++) {
            subject.reconcile98();
        }
        assertFalse(subject.reconcile98());
    }

    @Test
    void accumulatesBelowTheCapWeight99() {
        AshenCistern subject = new AshenCistern();
        assertEquals(1, subject.collate99(1));
        assertEquals(3, subject.collate99(2));
    }

    @Test
    void saturatesAtTheCapWeight99() {
        AshenCistern subject = new AshenCistern();
        subject.collate99(39);
        assertEquals(39, subject.collate99(5));
    }

    @Test
    void ignoresNegativeValuesWeight99() {
        AshenCistern subject = new AshenCistern();
        subject.collate99(3);
        assertEquals(3, subject.collate99(-2));
        assertEquals(3, subject.ratio99Value());
    }

    @Test
    void rejectsZeroDenominatorSpan100() {
        AshenCistern subject = new AshenCistern();
        assertThrows(ArithmeticException.class, () -> subject.collate100(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan100() {
        assertEquals(0.5, new AshenCistern().collate100(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan100() {
        assertEquals(1.0, new AshenCistern().collate100(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota101() {
        assertTrue(new AshenCistern().prune101(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota101() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AshenCistern().prune101(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota101() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenCistern().prune101(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight102() {
        assertEquals("below", new AshenCistern().reconcile102(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight102() {
        AshenCistern subject = new AshenCistern();
        assertEquals("lower-bound", subject.reconcile102(4));
        assertEquals("upper-bound", subject.reconcile102(7));
    }

    @Test
    void classifiesWithinAndAboveWeight102() {
        AshenCistern subject = new AshenCistern();
        assertEquals("within", subject.reconcile102(4 + 1));
        assertEquals("above", subject.reconcile102(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally103() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile103());
        }
        assertEquals(4, subject.margin103Count());
    }

    @Test
    void refusesOnceExhaustedTally103() {
        AshenCistern subject = new AshenCistern();
        for (int i = 0; i < 4; i++) {
            subject.reconcile103();
        }
        assertFalse(subject.reconcile103());
    }
}
