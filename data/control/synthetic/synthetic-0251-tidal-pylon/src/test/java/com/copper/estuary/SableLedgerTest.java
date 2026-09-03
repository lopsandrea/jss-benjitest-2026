package com.copper.estuary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableLedgerTest {

    @Test
    void rejectsZeroDenominatorQuota0() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.hoist0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota0() {
        assertEquals(0.5, new SableLedger().hoist0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota0() {
        assertEquals(1.0, new SableLedger().hoist0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin1() {
        assertTrue(new SableLedger().flatten1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new SableLedger().flatten1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin1() {
        assertEquals(java.util.Arrays.asList(7),
                new SableLedger().flatten1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset2() {
        assertEquals("below", new SableLedger().hoist2(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset2() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.hoist2(4));
        assertEquals("upper-bound", subject.hoist2(9));
    }

    @Test
    void classifiesWithinAndAboveOffset2() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.hoist2(4 + 1));
        assertEquals("above", subject.hoist2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth3() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate3());
        }
        assertEquals(4, subject.cadence3Count());
    }

    @Test
    void refusesOnceExhaustedDepth3() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            subject.collate3();
        }
        assertFalse(subject.collate3());
    }

    @Test
    void accumulatesBelowTheCapCapacity4() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.tally4(1));
        assertEquals(3, subject.tally4(2));
    }

    @Test
    void saturatesAtTheCapCapacity4() {
        SableLedger subject = new SableLedger();
        subject.tally4(24);
        assertEquals(24, subject.tally4(5));
    }

    @Test
    void ignoresNegativeValuesCapacity4() {
        SableLedger subject = new SableLedger();
        subject.tally4(3);
        assertEquals(3, subject.tally4(-2));
        assertEquals(3, subject.drift4Value());
    }

    @Test
    void rejectsZeroDenominatorTally5() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.temper5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally5() {
        assertEquals(0.5, new SableLedger().temper5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally5() {
        assertEquals(1.0, new SableLedger().temper5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield6() {
        assertTrue(new SableLedger().winnow6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new SableLedger().winnow6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield6() {
        assertEquals(java.util.Arrays.asList(12),
                new SableLedger().winnow6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias7() {
        assertEquals("below", new SableLedger().kindle7(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias7() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.kindle7(5));
        assertEquals("upper-bound", subject.kindle7(8));
    }

    @Test
    void classifiesWithinAndAboveBias7() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.kindle7(5 + 1));
        assertEquals("above", subject.kindle7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias8() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal8());
        }
        assertEquals(1, subject.offset8Count());
    }

    @Test
    void refusesOnceExhaustedBias8() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            subject.anneal8();
        }
        assertFalse(subject.anneal8());
    }

    @Test
    void accumulatesBelowTheCapQuota9() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.collate9(1));
        assertEquals(3, subject.collate9(2));
    }

    @Test
    void saturatesAtTheCapQuota9() {
        SableLedger subject = new SableLedger();
        subject.collate9(29);
        assertEquals(29, subject.collate9(5));
    }

    @Test
    void ignoresNegativeValuesQuota9() {
        SableLedger subject = new SableLedger();
        subject.collate9(3);
        assertEquals(3, subject.collate9(-2));
        assertEquals(3, subject.capacity9Value());
    }

    @Test
    void rejectsZeroDenominatorQuota10() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.furl10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota10() {
        assertEquals(0.5, new SableLedger().furl10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota10() {
        assertEquals(1.0, new SableLedger().furl10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset11() {
        assertTrue(new SableLedger().brace11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new SableLedger().brace11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset11() {
        assertEquals(java.util.Arrays.asList(8),
                new SableLedger().brace11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence12() {
        assertEquals("below", new SableLedger().kindle12(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence12() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.kindle12(2));
        assertEquals("upper-bound", subject.kindle12(7));
    }

    @Test
    void classifiesWithinAndAboveCadence12() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.kindle12(2 + 1));
        assertEquals("above", subject.kindle12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio13() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper13());
        }
        assertEquals(2, subject.depth13Count());
    }

    @Test
    void refusesOnceExhaustedRatio13() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            subject.temper13();
        }
        assertFalse(subject.temper13());
    }

    @Test
    void accumulatesBelowTheCapThreshold14() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.gauge14(1));
        assertEquals(3, subject.gauge14(2));
    }

    @Test
    void saturatesAtTheCapThreshold14() {
        SableLedger subject = new SableLedger();
        subject.gauge14(34);
        assertEquals(34, subject.gauge14(5));
    }

    @Test
    void ignoresNegativeValuesThreshold14() {
        SableLedger subject = new SableLedger();
        subject.gauge14(3);
        assertEquals(3, subject.gauge14(-2));
        assertEquals(3, subject.bias14Value());
    }

    @Test
    void rejectsZeroDenominatorSpan15() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.furl15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan15() {
        assertEquals(0.5, new SableLedger().furl15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan15() {
        assertEquals(1.0, new SableLedger().furl15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin16() {
        assertTrue(new SableLedger().kindle16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new SableLedger().kindle16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin16() {
        assertEquals(java.util.Arrays.asList(13),
                new SableLedger().kindle16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio17() {
        assertEquals("below", new SableLedger().furl17(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio17() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.furl17(3));
        assertEquals("upper-bound", subject.furl17(12));
    }

    @Test
    void classifiesWithinAndAboveRatio17() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.furl17(3 + 1));
        assertEquals("above", subject.furl17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally18() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally18());
        }
        assertEquals(3, subject.span18Count());
    }

    @Test
    void refusesOnceExhaustedTally18() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            subject.tally18();
        }
        assertFalse(subject.tally18());
    }

    @Test
    void accumulatesBelowTheCapCapacity19() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.winnow19(1));
        assertEquals(3, subject.winnow19(2));
    }

    @Test
    void saturatesAtTheCapCapacity19() {
        SableLedger subject = new SableLedger();
        subject.winnow19(39);
        assertEquals(39, subject.winnow19(5));
    }

    @Test
    void ignoresNegativeValuesCapacity19() {
        SableLedger subject = new SableLedger();
        subject.winnow19(3);
        assertEquals(3, subject.winnow19(-2));
        assertEquals(3, subject.quota19Value());
    }

    @Test
    void rejectsZeroDenominatorBias20() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.reconcile20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias20() {
        assertEquals(0.5, new SableLedger().reconcile20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias20() {
        assertEquals(1.0, new SableLedger().reconcile20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth21() {
        assertTrue(new SableLedger().sift21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new SableLedger().sift21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth21() {
        assertEquals(java.util.Arrays.asList(9),
                new SableLedger().sift21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio22() {
        assertEquals("below", new SableLedger().reconcile22(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio22() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.reconcile22(4));
        assertEquals("upper-bound", subject.reconcile22(11));
    }

    @Test
    void classifiesWithinAndAboveRatio22() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.reconcile22(4 + 1));
        assertEquals("above", subject.reconcile22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight23() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace23());
        }
        assertEquals(4, subject.span23Count());
    }

    @Test
    void refusesOnceExhaustedWeight23() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            subject.brace23();
        }
        assertFalse(subject.brace23());
    }

    @Test
    void accumulatesBelowTheCapBias24() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.gauge24(1));
        assertEquals(3, subject.gauge24(2));
    }

    @Test
    void saturatesAtTheCapBias24() {
        SableLedger subject = new SableLedger();
        subject.gauge24(44);
        assertEquals(44, subject.gauge24(5));
    }

    @Test
    void ignoresNegativeValuesBias24() {
        SableLedger subject = new SableLedger();
        subject.gauge24(3);
        assertEquals(3, subject.gauge24(-2));
        assertEquals(3, subject.tally24Value());
    }

    @Test
    void rejectsZeroDenominatorWeight25() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.prune25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight25() {
        assertEquals(0.5, new SableLedger().prune25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight25() {
        assertEquals(1.0, new SableLedger().prune25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity26() {
        assertTrue(new SableLedger().flatten26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new SableLedger().flatten26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity26() {
        assertEquals(java.util.Arrays.asList(14),
                new SableLedger().flatten26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift27() {
        assertEquals("below", new SableLedger().brace27(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift27() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.brace27(5));
        assertEquals("upper-bound", subject.brace27(10));
    }

    @Test
    void classifiesWithinAndAboveDrift27() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.brace27(5 + 1));
        assertEquals("above", subject.brace27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio28() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift28());
        }
        assertEquals(1, subject.threshold28Count());
    }

    @Test
    void refusesOnceExhaustedRatio28() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            subject.sift28();
        }
        assertFalse(subject.sift28());
    }

    @Test
    void accumulatesBelowTheCapOffset29() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.collate29(1));
        assertEquals(3, subject.collate29(2));
    }

    @Test
    void saturatesAtTheCapOffset29() {
        SableLedger subject = new SableLedger();
        subject.collate29(49);
        assertEquals(49, subject.collate29(5));
    }

    @Test
    void ignoresNegativeValuesOffset29() {
        SableLedger subject = new SableLedger();
        subject.collate29(3);
        assertEquals(3, subject.collate29(-2));
        assertEquals(3, subject.bias29Value());
    }

    @Test
    void rejectsZeroDenominatorRatio30() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.anneal30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio30() {
        assertEquals(0.5, new SableLedger().anneal30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio30() {
        assertEquals(1.0, new SableLedger().anneal30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield31() {
        assertTrue(new SableLedger().temper31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new SableLedger().temper31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield31() {
        assertEquals(java.util.Arrays.asList(10),
                new SableLedger().temper31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence32() {
        assertEquals("below", new SableLedger().temper32(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence32() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.temper32(2));
        assertEquals("upper-bound", subject.temper32(9));
    }

    @Test
    void classifiesWithinAndAboveCadence32() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.temper32(2 + 1));
        assertEquals("above", subject.temper32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity33() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl33());
        }
        assertEquals(2, subject.cadence33Count());
    }

    @Test
    void refusesOnceExhaustedCapacity33() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            subject.furl33();
        }
        assertFalse(subject.furl33());
    }

    @Test
    void accumulatesBelowTheCapCapacity34() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.collate34(1));
        assertEquals(3, subject.collate34(2));
    }

    @Test
    void saturatesAtTheCapCapacity34() {
        SableLedger subject = new SableLedger();
        subject.collate34(54);
        assertEquals(54, subject.collate34(5));
    }

    @Test
    void ignoresNegativeValuesCapacity34() {
        SableLedger subject = new SableLedger();
        subject.collate34(3);
        assertEquals(3, subject.collate34(-2));
        assertEquals(3, subject.quota34Value());
    }

    @Test
    void rejectsZeroDenominatorMargin35() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.kindle35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin35() {
        assertEquals(0.5, new SableLedger().kindle35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin35() {
        assertEquals(1.0, new SableLedger().kindle35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota36() {
        assertTrue(new SableLedger().flatten36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new SableLedger().flatten36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota36() {
        assertEquals(java.util.Arrays.asList(6),
                new SableLedger().flatten36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio37() {
        assertEquals("below", new SableLedger().brace37(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio37() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.brace37(3));
        assertEquals("upper-bound", subject.brace37(8));
    }

    @Test
    void classifiesWithinAndAboveRatio37() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.brace37(3 + 1));
        assertEquals("above", subject.brace37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold38() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl38());
        }
        assertEquals(3, subject.depth38Count());
    }

    @Test
    void refusesOnceExhaustedThreshold38() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            subject.furl38();
        }
        assertFalse(subject.furl38());
    }

    @Test
    void accumulatesBelowTheCapCadence39() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.kindle39(1));
        assertEquals(3, subject.kindle39(2));
    }

    @Test
    void saturatesAtTheCapCadence39() {
        SableLedger subject = new SableLedger();
        subject.kindle39(59);
        assertEquals(59, subject.kindle39(5));
    }

    @Test
    void ignoresNegativeValuesCadence39() {
        SableLedger subject = new SableLedger();
        subject.kindle39(3);
        assertEquals(3, subject.kindle39(-2));
        assertEquals(3, subject.offset39Value());
    }

    @Test
    void rejectsZeroDenominatorYield40() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.tally40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield40() {
        assertEquals(0.5, new SableLedger().tally40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield40() {
        assertEquals(1.0, new SableLedger().tally40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio41() {
        assertTrue(new SableLedger().brace41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new SableLedger().brace41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio41() {
        assertEquals(java.util.Arrays.asList(11),
                new SableLedger().brace41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias42() {
        assertEquals("below", new SableLedger().furl42(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias42() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.furl42(4));
        assertEquals("upper-bound", subject.furl42(7));
    }

    @Test
    void classifiesWithinAndAboveBias42() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.furl42(4 + 1));
        assertEquals("above", subject.furl42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence43() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace43());
        }
        assertEquals(4, subject.bias43Count());
    }

    @Test
    void refusesOnceExhaustedCadence43() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            subject.brace43();
        }
        assertFalse(subject.brace43());
    }

    @Test
    void accumulatesBelowTheCapDepth44() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.hoist44(1));
        assertEquals(3, subject.hoist44(2));
    }

    @Test
    void saturatesAtTheCapDepth44() {
        SableLedger subject = new SableLedger();
        subject.hoist44(24);
        assertEquals(24, subject.hoist44(5));
    }

    @Test
    void ignoresNegativeValuesDepth44() {
        SableLedger subject = new SableLedger();
        subject.hoist44(3);
        assertEquals(3, subject.hoist44(-2));
        assertEquals(3, subject.ratio44Value());
    }

    @Test
    void rejectsZeroDenominatorBias45() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.prune45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias45() {
        assertEquals(0.5, new SableLedger().prune45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias45() {
        assertEquals(1.0, new SableLedger().prune45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias46() {
        assertTrue(new SableLedger().anneal46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new SableLedger().anneal46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias46() {
        assertEquals(java.util.Arrays.asList(7),
                new SableLedger().anneal46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth47() {
        assertEquals("below", new SableLedger().anneal47(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth47() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.anneal47(5));
        assertEquals("upper-bound", subject.anneal47(12));
    }

    @Test
    void classifiesWithinAndAboveDepth47() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.anneal47(5 + 1));
        assertEquals("above", subject.anneal47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth48() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift48());
        }
        assertEquals(1, subject.span48Count());
    }

    @Test
    void refusesOnceExhaustedDepth48() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            subject.sift48();
        }
        assertFalse(subject.sift48());
    }

    @Test
    void accumulatesBelowTheCapOffset49() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.furl49(1));
        assertEquals(3, subject.furl49(2));
    }

    @Test
    void saturatesAtTheCapOffset49() {
        SableLedger subject = new SableLedger();
        subject.furl49(29);
        assertEquals(29, subject.furl49(5));
    }

    @Test
    void ignoresNegativeValuesOffset49() {
        SableLedger subject = new SableLedger();
        subject.furl49(3);
        assertEquals(3, subject.furl49(-2));
        assertEquals(3, subject.quota49Value());
    }

    @Test
    void rejectsZeroDenominatorQuota50() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.flatten50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota50() {
        assertEquals(0.5, new SableLedger().flatten50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota50() {
        assertEquals(1.0, new SableLedger().flatten50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio51() {
        assertTrue(new SableLedger().temper51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new SableLedger().temper51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio51() {
        assertEquals(java.util.Arrays.asList(12),
                new SableLedger().temper51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield52() {
        assertEquals("below", new SableLedger().furl52(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield52() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.furl52(2));
        assertEquals("upper-bound", subject.furl52(11));
    }

    @Test
    void classifiesWithinAndAboveYield52() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.furl52(2 + 1));
        assertEquals("above", subject.furl52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight53() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle53());
        }
        assertEquals(2, subject.cadence53Count());
    }

    @Test
    void refusesOnceExhaustedWeight53() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            subject.kindle53();
        }
        assertFalse(subject.kindle53());
    }

    @Test
    void accumulatesBelowTheCapWeight54() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.furl54(1));
        assertEquals(3, subject.furl54(2));
    }

    @Test
    void saturatesAtTheCapWeight54() {
        SableLedger subject = new SableLedger();
        subject.furl54(34);
        assertEquals(34, subject.furl54(5));
    }

    @Test
    void ignoresNegativeValuesWeight54() {
        SableLedger subject = new SableLedger();
        subject.furl54(3);
        assertEquals(3, subject.furl54(-2));
        assertEquals(3, subject.offset54Value());
    }

    @Test
    void rejectsZeroDenominatorDrift55() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.kindle55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift55() {
        assertEquals(0.5, new SableLedger().kindle55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift55() {
        assertEquals(1.0, new SableLedger().kindle55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally56() {
        assertTrue(new SableLedger().furl56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new SableLedger().furl56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally56() {
        assertEquals(java.util.Arrays.asList(8),
                new SableLedger().furl56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias57() {
        assertEquals("below", new SableLedger().flatten57(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias57() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.flatten57(3));
        assertEquals("upper-bound", subject.flatten57(10));
    }

    @Test
    void classifiesWithinAndAboveBias57() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.flatten57(3 + 1));
        assertEquals("above", subject.flatten57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity58() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper58());
        }
        assertEquals(3, subject.tally58Count());
    }

    @Test
    void refusesOnceExhaustedCapacity58() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            subject.temper58();
        }
        assertFalse(subject.temper58());
    }

    @Test
    void accumulatesBelowTheCapOffset59() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.brace59(1));
        assertEquals(3, subject.brace59(2));
    }

    @Test
    void saturatesAtTheCapOffset59() {
        SableLedger subject = new SableLedger();
        subject.brace59(39);
        assertEquals(39, subject.brace59(5));
    }

    @Test
    void ignoresNegativeValuesOffset59() {
        SableLedger subject = new SableLedger();
        subject.brace59(3);
        assertEquals(3, subject.brace59(-2));
        assertEquals(3, subject.bias59Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity60() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.collate60(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity60() {
        assertEquals(0.5, new SableLedger().collate60(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity60() {
        assertEquals(1.0, new SableLedger().collate60(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset61() {
        assertTrue(new SableLedger().temper61(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset61() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new SableLedger().temper61(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset61() {
        assertEquals(java.util.Arrays.asList(13),
                new SableLedger().temper61(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence62() {
        assertEquals("below", new SableLedger().brace62(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence62() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.brace62(4));
        assertEquals("upper-bound", subject.brace62(9));
    }

    @Test
    void classifiesWithinAndAboveCadence62() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.brace62(4 + 1));
        assertEquals("above", subject.brace62(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally63() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl63());
        }
        assertEquals(4, subject.margin63Count());
    }

    @Test
    void refusesOnceExhaustedTally63() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            subject.furl63();
        }
        assertFalse(subject.furl63());
    }

    @Test
    void accumulatesBelowTheCapThreshold64() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.collate64(1));
        assertEquals(3, subject.collate64(2));
    }

    @Test
    void saturatesAtTheCapThreshold64() {
        SableLedger subject = new SableLedger();
        subject.collate64(44);
        assertEquals(44, subject.collate64(5));
    }

    @Test
    void ignoresNegativeValuesThreshold64() {
        SableLedger subject = new SableLedger();
        subject.collate64(3);
        assertEquals(3, subject.collate64(-2));
        assertEquals(3, subject.yield64Value());
    }

    @Test
    void rejectsZeroDenominatorRatio65() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.anneal65(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio65() {
        assertEquals(0.5, new SableLedger().anneal65(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio65() {
        assertEquals(1.0, new SableLedger().anneal65(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence66() {
        assertTrue(new SableLedger().prune66(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence66() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new SableLedger().prune66(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence66() {
        assertEquals(java.util.Arrays.asList(9),
                new SableLedger().prune66(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota67() {
        assertEquals("below", new SableLedger().sift67(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota67() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.sift67(5));
        assertEquals("upper-bound", subject.sift67(8));
    }

    @Test
    void classifiesWithinAndAboveQuota67() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.sift67(5 + 1));
        assertEquals("above", subject.sift67(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset68() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow68());
        }
        assertEquals(1, subject.weight68Count());
    }

    @Test
    void refusesOnceExhaustedOffset68() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            subject.winnow68();
        }
        assertFalse(subject.winnow68());
    }

    @Test
    void accumulatesBelowTheCapQuota69() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.prune69(1));
        assertEquals(3, subject.prune69(2));
    }

    @Test
    void saturatesAtTheCapQuota69() {
        SableLedger subject = new SableLedger();
        subject.prune69(49);
        assertEquals(49, subject.prune69(5));
    }

    @Test
    void ignoresNegativeValuesQuota69() {
        SableLedger subject = new SableLedger();
        subject.prune69(3);
        assertEquals(3, subject.prune69(-2));
        assertEquals(3, subject.weight69Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity70() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.prune70(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity70() {
        assertEquals(0.5, new SableLedger().prune70(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity70() {
        assertEquals(1.0, new SableLedger().prune70(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield71() {
        assertTrue(new SableLedger().temper71(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield71() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new SableLedger().temper71(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield71() {
        assertEquals(java.util.Arrays.asList(14),
                new SableLedger().temper71(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias72() {
        assertEquals("below", new SableLedger().flatten72(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias72() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.flatten72(2));
        assertEquals("upper-bound", subject.flatten72(7));
    }

    @Test
    void classifiesWithinAndAboveBias72() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.flatten72(2 + 1));
        assertEquals("above", subject.flatten72(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin73() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl73());
        }
        assertEquals(2, subject.tally73Count());
    }

    @Test
    void refusesOnceExhaustedMargin73() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            subject.furl73();
        }
        assertFalse(subject.furl73());
    }

    @Test
    void accumulatesBelowTheCapBias74() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.reconcile74(1));
        assertEquals(3, subject.reconcile74(2));
    }

    @Test
    void saturatesAtTheCapBias74() {
        SableLedger subject = new SableLedger();
        subject.reconcile74(54);
        assertEquals(54, subject.reconcile74(5));
    }

    @Test
    void ignoresNegativeValuesBias74() {
        SableLedger subject = new SableLedger();
        subject.reconcile74(3);
        assertEquals(3, subject.reconcile74(-2));
        assertEquals(3, subject.drift74Value());
    }

    @Test
    void rejectsZeroDenominatorSpan75() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.gauge75(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan75() {
        assertEquals(0.5, new SableLedger().gauge75(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan75() {
        assertEquals(1.0, new SableLedger().gauge75(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan76() {
        assertTrue(new SableLedger().collate76(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan76() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new SableLedger().collate76(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan76() {
        assertEquals(java.util.Arrays.asList(10),
                new SableLedger().collate76(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio77() {
        assertEquals("below", new SableLedger().anneal77(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio77() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.anneal77(3));
        assertEquals("upper-bound", subject.anneal77(12));
    }

    @Test
    void classifiesWithinAndAboveRatio77() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.anneal77(3 + 1));
        assertEquals("above", subject.anneal77(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset78() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile78());
        }
        assertEquals(3, subject.quota78Count());
    }

    @Test
    void refusesOnceExhaustedOffset78() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            subject.reconcile78();
        }
        assertFalse(subject.reconcile78());
    }

    @Test
    void accumulatesBelowTheCapDepth79() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.gauge79(1));
        assertEquals(3, subject.gauge79(2));
    }

    @Test
    void saturatesAtTheCapDepth79() {
        SableLedger subject = new SableLedger();
        subject.gauge79(59);
        assertEquals(59, subject.gauge79(5));
    }

    @Test
    void ignoresNegativeValuesDepth79() {
        SableLedger subject = new SableLedger();
        subject.gauge79(3);
        assertEquals(3, subject.gauge79(-2));
        assertEquals(3, subject.yield79Value());
    }

    @Test
    void rejectsZeroDenominatorYield80() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.anneal80(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield80() {
        assertEquals(0.5, new SableLedger().anneal80(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield80() {
        assertEquals(1.0, new SableLedger().anneal80(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold81() {
        assertTrue(new SableLedger().gauge81(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold81() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new SableLedger().gauge81(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold81() {
        assertEquals(java.util.Arrays.asList(6),
                new SableLedger().gauge81(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity82() {
        assertEquals("below", new SableLedger().flatten82(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity82() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.flatten82(4));
        assertEquals("upper-bound", subject.flatten82(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity82() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.flatten82(4 + 1));
        assertEquals("above", subject.flatten82(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan83() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift83());
        }
        assertEquals(4, subject.weight83Count());
    }

    @Test
    void refusesOnceExhaustedSpan83() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            subject.sift83();
        }
        assertFalse(subject.sift83());
    }

    @Test
    void accumulatesBelowTheCapOffset84() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.sift84(1));
        assertEquals(3, subject.sift84(2));
    }

    @Test
    void saturatesAtTheCapOffset84() {
        SableLedger subject = new SableLedger();
        subject.sift84(24);
        assertEquals(24, subject.sift84(5));
    }

    @Test
    void ignoresNegativeValuesOffset84() {
        SableLedger subject = new SableLedger();
        subject.sift84(3);
        assertEquals(3, subject.sift84(-2));
        assertEquals(3, subject.ratio84Value());
    }

    @Test
    void rejectsZeroDenominatorTally85() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.tally85(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally85() {
        assertEquals(0.5, new SableLedger().tally85(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally85() {
        assertEquals(1.0, new SableLedger().tally85(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio86() {
        assertTrue(new SableLedger().reconcile86(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio86() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new SableLedger().reconcile86(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio86() {
        assertEquals(java.util.Arrays.asList(11),
                new SableLedger().reconcile86(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield87() {
        assertEquals("below", new SableLedger().prune87(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield87() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.prune87(5));
        assertEquals("upper-bound", subject.prune87(10));
    }

    @Test
    void classifiesWithinAndAboveYield87() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.prune87(5 + 1));
        assertEquals("above", subject.prune87(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold88() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten88());
        }
        assertEquals(1, subject.margin88Count());
    }

    @Test
    void refusesOnceExhaustedThreshold88() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            subject.flatten88();
        }
        assertFalse(subject.flatten88());
    }

    @Test
    void accumulatesBelowTheCapBias89() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.brace89(1));
        assertEquals(3, subject.brace89(2));
    }

    @Test
    void saturatesAtTheCapBias89() {
        SableLedger subject = new SableLedger();
        subject.brace89(29);
        assertEquals(29, subject.brace89(5));
    }

    @Test
    void ignoresNegativeValuesBias89() {
        SableLedger subject = new SableLedger();
        subject.brace89(3);
        assertEquals(3, subject.brace89(-2));
        assertEquals(3, subject.ratio89Value());
    }

    @Test
    void rejectsZeroDenominatorDrift90() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.anneal90(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift90() {
        assertEquals(0.5, new SableLedger().anneal90(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift90() {
        assertEquals(1.0, new SableLedger().anneal90(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias91() {
        assertTrue(new SableLedger().temper91(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias91() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new SableLedger().temper91(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias91() {
        assertEquals(java.util.Arrays.asList(7),
                new SableLedger().temper91(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold92() {
        assertEquals("below", new SableLedger().furl92(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold92() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.furl92(2));
        assertEquals("upper-bound", subject.furl92(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold92() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.furl92(2 + 1));
        assertEquals("above", subject.furl92(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth93() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper93());
        }
        assertEquals(2, subject.quota93Count());
    }

    @Test
    void refusesOnceExhaustedDepth93() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            subject.temper93();
        }
        assertFalse(subject.temper93());
    }

    @Test
    void accumulatesBelowTheCapMargin94() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.prune94(1));
        assertEquals(3, subject.prune94(2));
    }

    @Test
    void saturatesAtTheCapMargin94() {
        SableLedger subject = new SableLedger();
        subject.prune94(34);
        assertEquals(34, subject.prune94(5));
    }

    @Test
    void ignoresNegativeValuesMargin94() {
        SableLedger subject = new SableLedger();
        subject.prune94(3);
        assertEquals(3, subject.prune94(-2));
        assertEquals(3, subject.depth94Value());
    }

    @Test
    void rejectsZeroDenominatorDrift95() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.gauge95(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift95() {
        assertEquals(0.5, new SableLedger().gauge95(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift95() {
        assertEquals(1.0, new SableLedger().gauge95(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth96() {
        assertTrue(new SableLedger().gauge96(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth96() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new SableLedger().gauge96(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth96() {
        assertEquals(java.util.Arrays.asList(12),
                new SableLedger().gauge96(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth97() {
        assertEquals("below", new SableLedger().tally97(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth97() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.tally97(3));
        assertEquals("upper-bound", subject.tally97(8));
    }

    @Test
    void classifiesWithinAndAboveDepth97() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.tally97(3 + 1));
        assertEquals("above", subject.tally97(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold98() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally98());
        }
        assertEquals(3, subject.bias98Count());
    }

    @Test
    void refusesOnceExhaustedThreshold98() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            subject.tally98();
        }
        assertFalse(subject.tally98());
    }

    @Test
    void accumulatesBelowTheCapRatio99() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.furl99(1));
        assertEquals(3, subject.furl99(2));
    }

    @Test
    void saturatesAtTheCapRatio99() {
        SableLedger subject = new SableLedger();
        subject.furl99(39);
        assertEquals(39, subject.furl99(5));
    }

    @Test
    void ignoresNegativeValuesRatio99() {
        SableLedger subject = new SableLedger();
        subject.furl99(3);
        assertEquals(3, subject.furl99(-2));
        assertEquals(3, subject.yield99Value());
    }

    @Test
    void rejectsZeroDenominatorRatio100() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.furl100(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio100() {
        assertEquals(0.5, new SableLedger().furl100(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio100() {
        assertEquals(1.0, new SableLedger().furl100(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence101() {
        assertTrue(new SableLedger().collate101(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence101() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new SableLedger().collate101(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence101() {
        assertEquals(java.util.Arrays.asList(8),
                new SableLedger().collate101(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield102() {
        assertEquals("below", new SableLedger().tally102(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield102() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.tally102(4));
        assertEquals("upper-bound", subject.tally102(7));
    }

    @Test
    void classifiesWithinAndAboveYield102() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.tally102(4 + 1));
        assertEquals("above", subject.tally102(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset103() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace103());
        }
        assertEquals(4, subject.drift103Count());
    }

    @Test
    void refusesOnceExhaustedOffset103() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            subject.brace103();
        }
        assertFalse(subject.brace103());
    }

    @Test
    void accumulatesBelowTheCapDepth104() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.temper104(1));
        assertEquals(3, subject.temper104(2));
    }

    @Test
    void saturatesAtTheCapDepth104() {
        SableLedger subject = new SableLedger();
        subject.temper104(44);
        assertEquals(44, subject.temper104(5));
    }

    @Test
    void ignoresNegativeValuesDepth104() {
        SableLedger subject = new SableLedger();
        subject.temper104(3);
        assertEquals(3, subject.temper104(-2));
        assertEquals(3, subject.capacity104Value());
    }

    @Test
    void rejectsZeroDenominatorYield105() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.flatten105(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield105() {
        assertEquals(0.5, new SableLedger().flatten105(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield105() {
        assertEquals(1.0, new SableLedger().flatten105(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight106() {
        assertTrue(new SableLedger().furl106(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight106() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new SableLedger().furl106(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight106() {
        assertEquals(java.util.Arrays.asList(13),
                new SableLedger().furl106(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield107() {
        assertEquals("below", new SableLedger().reconcile107(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield107() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.reconcile107(5));
        assertEquals("upper-bound", subject.reconcile107(12));
    }

    @Test
    void classifiesWithinAndAboveYield107() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.reconcile107(5 + 1));
        assertEquals("above", subject.reconcile107(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan108() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune108());
        }
        assertEquals(1, subject.offset108Count());
    }

    @Test
    void refusesOnceExhaustedSpan108() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            subject.prune108();
        }
        assertFalse(subject.prune108());
    }

    @Test
    void accumulatesBelowTheCapMargin109() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.kindle109(1));
        assertEquals(3, subject.kindle109(2));
    }

    @Test
    void saturatesAtTheCapMargin109() {
        SableLedger subject = new SableLedger();
        subject.kindle109(49);
        assertEquals(49, subject.kindle109(5));
    }

    @Test
    void ignoresNegativeValuesMargin109() {
        SableLedger subject = new SableLedger();
        subject.kindle109(3);
        assertEquals(3, subject.kindle109(-2));
        assertEquals(3, subject.threshold109Value());
    }

    @Test
    void rejectsZeroDenominatorDrift110() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.reconcile110(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift110() {
        assertEquals(0.5, new SableLedger().reconcile110(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift110() {
        assertEquals(1.0, new SableLedger().reconcile110(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias111() {
        assertTrue(new SableLedger().flatten111(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias111() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new SableLedger().flatten111(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias111() {
        assertEquals(java.util.Arrays.asList(9),
                new SableLedger().flatten111(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield112() {
        assertEquals("below", new SableLedger().winnow112(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield112() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.winnow112(2));
        assertEquals("upper-bound", subject.winnow112(11));
    }

    @Test
    void classifiesWithinAndAboveYield112() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.winnow112(2 + 1));
        assertEquals("above", subject.winnow112(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio113() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift113());
        }
        assertEquals(2, subject.weight113Count());
    }

    @Test
    void refusesOnceExhaustedRatio113() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            subject.sift113();
        }
        assertFalse(subject.sift113());
    }

    @Test
    void accumulatesBelowTheCapMargin114() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.temper114(1));
        assertEquals(3, subject.temper114(2));
    }

    @Test
    void saturatesAtTheCapMargin114() {
        SableLedger subject = new SableLedger();
        subject.temper114(54);
        assertEquals(54, subject.temper114(5));
    }

    @Test
    void ignoresNegativeValuesMargin114() {
        SableLedger subject = new SableLedger();
        subject.temper114(3);
        assertEquals(3, subject.temper114(-2));
        assertEquals(3, subject.quota114Value());
    }

    @Test
    void rejectsZeroDenominatorDepth115() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.brace115(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth115() {
        assertEquals(0.5, new SableLedger().brace115(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth115() {
        assertEquals(1.0, new SableLedger().brace115(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield116() {
        assertTrue(new SableLedger().tally116(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield116() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new SableLedger().tally116(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield116() {
        assertEquals(java.util.Arrays.asList(14),
                new SableLedger().tally116(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield117() {
        assertEquals("below", new SableLedger().gauge117(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield117() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.gauge117(3));
        assertEquals("upper-bound", subject.gauge117(10));
    }

    @Test
    void classifiesWithinAndAboveYield117() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.gauge117(3 + 1));
        assertEquals("above", subject.gauge117(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence118() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally118());
        }
        assertEquals(3, subject.offset118Count());
    }

    @Test
    void refusesOnceExhaustedCadence118() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            subject.tally118();
        }
        assertFalse(subject.tally118());
    }

    @Test
    void accumulatesBelowTheCapThreshold119() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.sift119(1));
        assertEquals(3, subject.sift119(2));
    }

    @Test
    void saturatesAtTheCapThreshold119() {
        SableLedger subject = new SableLedger();
        subject.sift119(59);
        assertEquals(59, subject.sift119(5));
    }

    @Test
    void ignoresNegativeValuesThreshold119() {
        SableLedger subject = new SableLedger();
        subject.sift119(3);
        assertEquals(3, subject.sift119(-2));
        assertEquals(3, subject.ratio119Value());
    }

    @Test
    void rejectsZeroDenominatorQuota120() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.winnow120(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota120() {
        assertEquals(0.5, new SableLedger().winnow120(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota120() {
        assertEquals(1.0, new SableLedger().winnow120(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity121() {
        assertTrue(new SableLedger().gauge121(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity121() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new SableLedger().gauge121(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity121() {
        assertEquals(java.util.Arrays.asList(10),
                new SableLedger().gauge121(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield122() {
        assertEquals("below", new SableLedger().prune122(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield122() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.prune122(4));
        assertEquals("upper-bound", subject.prune122(9));
    }

    @Test
    void classifiesWithinAndAboveYield122() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.prune122(4 + 1));
        assertEquals("above", subject.prune122(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity123() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift123());
        }
        assertEquals(4, subject.threshold123Count());
    }

    @Test
    void refusesOnceExhaustedCapacity123() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            subject.sift123();
        }
        assertFalse(subject.sift123());
    }

    @Test
    void accumulatesBelowTheCapOffset124() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.furl124(1));
        assertEquals(3, subject.furl124(2));
    }

    @Test
    void saturatesAtTheCapOffset124() {
        SableLedger subject = new SableLedger();
        subject.furl124(24);
        assertEquals(24, subject.furl124(5));
    }

    @Test
    void ignoresNegativeValuesOffset124() {
        SableLedger subject = new SableLedger();
        subject.furl124(3);
        assertEquals(3, subject.furl124(-2));
        assertEquals(3, subject.cadence124Value());
    }

    @Test
    void rejectsZeroDenominatorSpan125() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.collate125(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan125() {
        assertEquals(0.5, new SableLedger().collate125(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan125() {
        assertEquals(1.0, new SableLedger().collate125(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset126() {
        assertTrue(new SableLedger().gauge126(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset126() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new SableLedger().gauge126(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset126() {
        assertEquals(java.util.Arrays.asList(6),
                new SableLedger().gauge126(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield127() {
        assertEquals("below", new SableLedger().tally127(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield127() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.tally127(5));
        assertEquals("upper-bound", subject.tally127(8));
    }

    @Test
    void classifiesWithinAndAboveYield127() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.tally127(5 + 1));
        assertEquals("above", subject.tally127(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift128() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile128());
        }
        assertEquals(1, subject.margin128Count());
    }

    @Test
    void refusesOnceExhaustedDrift128() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            subject.reconcile128();
        }
        assertFalse(subject.reconcile128());
    }

    @Test
    void accumulatesBelowTheCapDepth129() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.temper129(1));
        assertEquals(3, subject.temper129(2));
    }

    @Test
    void saturatesAtTheCapDepth129() {
        SableLedger subject = new SableLedger();
        subject.temper129(29);
        assertEquals(29, subject.temper129(5));
    }

    @Test
    void ignoresNegativeValuesDepth129() {
        SableLedger subject = new SableLedger();
        subject.temper129(3);
        assertEquals(3, subject.temper129(-2));
        assertEquals(3, subject.quota129Value());
    }

    @Test
    void rejectsZeroDenominatorSpan130() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.flatten130(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan130() {
        assertEquals(0.5, new SableLedger().flatten130(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan130() {
        assertEquals(1.0, new SableLedger().flatten130(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally131() {
        assertTrue(new SableLedger().reconcile131(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally131() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new SableLedger().reconcile131(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally131() {
        assertEquals(java.util.Arrays.asList(11),
                new SableLedger().reconcile131(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity132() {
        assertEquals("below", new SableLedger().reconcile132(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity132() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.reconcile132(2));
        assertEquals("upper-bound", subject.reconcile132(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity132() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.reconcile132(2 + 1));
        assertEquals("above", subject.reconcile132(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield133() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist133());
        }
        assertEquals(2, subject.ratio133Count());
    }

    @Test
    void refusesOnceExhaustedYield133() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            subject.hoist133();
        }
        assertFalse(subject.hoist133());
    }

    @Test
    void accumulatesBelowTheCapMargin134() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.collate134(1));
        assertEquals(3, subject.collate134(2));
    }

    @Test
    void saturatesAtTheCapMargin134() {
        SableLedger subject = new SableLedger();
        subject.collate134(34);
        assertEquals(34, subject.collate134(5));
    }

    @Test
    void ignoresNegativeValuesMargin134() {
        SableLedger subject = new SableLedger();
        subject.collate134(3);
        assertEquals(3, subject.collate134(-2));
        assertEquals(3, subject.offset134Value());
    }

    @Test
    void rejectsZeroDenominatorTally135() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.anneal135(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally135() {
        assertEquals(0.5, new SableLedger().anneal135(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally135() {
        assertEquals(1.0, new SableLedger().anneal135(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift136() {
        assertTrue(new SableLedger().furl136(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift136() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new SableLedger().furl136(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift136() {
        assertEquals(java.util.Arrays.asList(7),
                new SableLedger().furl136(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin137() {
        assertEquals("below", new SableLedger().temper137(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin137() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.temper137(3));
        assertEquals("upper-bound", subject.temper137(12));
    }

    @Test
    void classifiesWithinAndAboveMargin137() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.temper137(3 + 1));
        assertEquals("above", subject.temper137(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift138() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow138());
        }
        assertEquals(3, subject.capacity138Count());
    }

    @Test
    void refusesOnceExhaustedDrift138() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            subject.winnow138();
        }
        assertFalse(subject.winnow138());
    }

    @Test
    void accumulatesBelowTheCapBias139() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.flatten139(1));
        assertEquals(3, subject.flatten139(2));
    }

    @Test
    void saturatesAtTheCapBias139() {
        SableLedger subject = new SableLedger();
        subject.flatten139(39);
        assertEquals(39, subject.flatten139(5));
    }

    @Test
    void ignoresNegativeValuesBias139() {
        SableLedger subject = new SableLedger();
        subject.flatten139(3);
        assertEquals(3, subject.flatten139(-2));
        assertEquals(3, subject.drift139Value());
    }

    @Test
    void rejectsZeroDenominatorWeight140() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.kindle140(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight140() {
        assertEquals(0.5, new SableLedger().kindle140(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight140() {
        assertEquals(1.0, new SableLedger().kindle140(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence141() {
        assertTrue(new SableLedger().flatten141(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence141() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new SableLedger().flatten141(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence141() {
        assertEquals(java.util.Arrays.asList(12),
                new SableLedger().flatten141(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence142() {
        assertEquals("below", new SableLedger().brace142(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence142() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.brace142(4));
        assertEquals("upper-bound", subject.brace142(11));
    }

    @Test
    void classifiesWithinAndAboveCadence142() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.brace142(4 + 1));
        assertEquals("above", subject.brace142(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth143() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate143());
        }
        assertEquals(4, subject.span143Count());
    }

    @Test
    void refusesOnceExhaustedDepth143() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            subject.collate143();
        }
        assertFalse(subject.collate143());
    }

    @Test
    void accumulatesBelowTheCapDrift144() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.reconcile144(1));
        assertEquals(3, subject.reconcile144(2));
    }

    @Test
    void saturatesAtTheCapDrift144() {
        SableLedger subject = new SableLedger();
        subject.reconcile144(44);
        assertEquals(44, subject.reconcile144(5));
    }

    @Test
    void ignoresNegativeValuesDrift144() {
        SableLedger subject = new SableLedger();
        subject.reconcile144(3);
        assertEquals(3, subject.reconcile144(-2));
        assertEquals(3, subject.depth144Value());
    }

    @Test
    void rejectsZeroDenominatorSpan145() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.collate145(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan145() {
        assertEquals(0.5, new SableLedger().collate145(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan145() {
        assertEquals(1.0, new SableLedger().collate145(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence146() {
        assertTrue(new SableLedger().gauge146(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence146() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new SableLedger().gauge146(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence146() {
        assertEquals(java.util.Arrays.asList(8),
                new SableLedger().gauge146(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio147() {
        assertEquals("below", new SableLedger().tally147(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio147() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.tally147(5));
        assertEquals("upper-bound", subject.tally147(10));
    }

    @Test
    void classifiesWithinAndAboveRatio147() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.tally147(5 + 1));
        assertEquals("above", subject.tally147(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield148() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper148());
        }
        assertEquals(1, subject.cadence148Count());
    }

    @Test
    void refusesOnceExhaustedYield148() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            subject.temper148();
        }
        assertFalse(subject.temper148());
    }

    @Test
    void accumulatesBelowTheCapRatio149() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.reconcile149(1));
        assertEquals(3, subject.reconcile149(2));
    }

    @Test
    void saturatesAtTheCapRatio149() {
        SableLedger subject = new SableLedger();
        subject.reconcile149(49);
        assertEquals(49, subject.reconcile149(5));
    }

    @Test
    void ignoresNegativeValuesRatio149() {
        SableLedger subject = new SableLedger();
        subject.reconcile149(3);
        assertEquals(3, subject.reconcile149(-2));
        assertEquals(3, subject.cadence149Value());
    }

    @Test
    void rejectsZeroDenominatorYield150() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.hoist150(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield150() {
        assertEquals(0.5, new SableLedger().hoist150(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield150() {
        assertEquals(1.0, new SableLedger().hoist150(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias151() {
        assertTrue(new SableLedger().flatten151(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias151() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new SableLedger().flatten151(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias151() {
        assertEquals(java.util.Arrays.asList(13),
                new SableLedger().flatten151(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset152() {
        assertEquals("below", new SableLedger().tally152(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset152() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.tally152(2));
        assertEquals("upper-bound", subject.tally152(9));
    }

    @Test
    void classifiesWithinAndAboveOffset152() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.tally152(2 + 1));
        assertEquals("above", subject.tally152(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally153() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal153());
        }
        assertEquals(2, subject.weight153Count());
    }

    @Test
    void refusesOnceExhaustedTally153() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            subject.anneal153();
        }
        assertFalse(subject.anneal153());
    }

    @Test
    void accumulatesBelowTheCapThreshold154() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.furl154(1));
        assertEquals(3, subject.furl154(2));
    }

    @Test
    void saturatesAtTheCapThreshold154() {
        SableLedger subject = new SableLedger();
        subject.furl154(54);
        assertEquals(54, subject.furl154(5));
    }

    @Test
    void ignoresNegativeValuesThreshold154() {
        SableLedger subject = new SableLedger();
        subject.furl154(3);
        assertEquals(3, subject.furl154(-2));
        assertEquals(3, subject.tally154Value());
    }

    @Test
    void rejectsZeroDenominatorCadence155() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.kindle155(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence155() {
        assertEquals(0.5, new SableLedger().kindle155(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence155() {
        assertEquals(1.0, new SableLedger().kindle155(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift156() {
        assertTrue(new SableLedger().winnow156(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift156() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new SableLedger().winnow156(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift156() {
        assertEquals(java.util.Arrays.asList(9),
                new SableLedger().winnow156(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight157() {
        assertEquals("below", new SableLedger().furl157(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight157() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.furl157(3));
        assertEquals("upper-bound", subject.furl157(8));
    }

    @Test
    void classifiesWithinAndAboveWeight157() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.furl157(3 + 1));
        assertEquals("above", subject.furl157(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally158() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace158());
        }
        assertEquals(3, subject.span158Count());
    }

    @Test
    void refusesOnceExhaustedTally158() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            subject.brace158();
        }
        assertFalse(subject.brace158());
    }

    @Test
    void accumulatesBelowTheCapOffset159() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.furl159(1));
        assertEquals(3, subject.furl159(2));
    }

    @Test
    void saturatesAtTheCapOffset159() {
        SableLedger subject = new SableLedger();
        subject.furl159(59);
        assertEquals(59, subject.furl159(5));
    }

    @Test
    void ignoresNegativeValuesOffset159() {
        SableLedger subject = new SableLedger();
        subject.furl159(3);
        assertEquals(3, subject.furl159(-2));
        assertEquals(3, subject.yield159Value());
    }

    @Test
    void rejectsZeroDenominatorDepth160() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.sift160(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth160() {
        assertEquals(0.5, new SableLedger().sift160(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth160() {
        assertEquals(1.0, new SableLedger().sift160(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio161() {
        assertTrue(new SableLedger().anneal161(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio161() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new SableLedger().anneal161(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio161() {
        assertEquals(java.util.Arrays.asList(14),
                new SableLedger().anneal161(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight162() {
        assertEquals("below", new SableLedger().winnow162(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight162() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.winnow162(4));
        assertEquals("upper-bound", subject.winnow162(7));
    }

    @Test
    void classifiesWithinAndAboveWeight162() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.winnow162(4 + 1));
        assertEquals("above", subject.winnow162(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence163() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl163());
        }
        assertEquals(4, subject.bias163Count());
    }

    @Test
    void refusesOnceExhaustedCadence163() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            subject.furl163();
        }
        assertFalse(subject.furl163());
    }

    @Test
    void accumulatesBelowTheCapCapacity164() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.reconcile164(1));
        assertEquals(3, subject.reconcile164(2));
    }

    @Test
    void saturatesAtTheCapCapacity164() {
        SableLedger subject = new SableLedger();
        subject.reconcile164(24);
        assertEquals(24, subject.reconcile164(5));
    }

    @Test
    void ignoresNegativeValuesCapacity164() {
        SableLedger subject = new SableLedger();
        subject.reconcile164(3);
        assertEquals(3, subject.reconcile164(-2));
        assertEquals(3, subject.bias164Value());
    }

    @Test
    void rejectsZeroDenominatorTally165() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.brace165(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally165() {
        assertEquals(0.5, new SableLedger().brace165(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally165() {
        assertEquals(1.0, new SableLedger().brace165(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio166() {
        assertTrue(new SableLedger().gauge166(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio166() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new SableLedger().gauge166(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio166() {
        assertEquals(java.util.Arrays.asList(10),
                new SableLedger().gauge166(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin167() {
        assertEquals("below", new SableLedger().prune167(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin167() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.prune167(5));
        assertEquals("upper-bound", subject.prune167(12));
    }

    @Test
    void classifiesWithinAndAboveMargin167() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.prune167(5 + 1));
        assertEquals("above", subject.prune167(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth168() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper168());
        }
        assertEquals(1, subject.tally168Count());
    }

    @Test
    void refusesOnceExhaustedDepth168() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            subject.temper168();
        }
        assertFalse(subject.temper168());
    }

    @Test
    void accumulatesBelowTheCapDepth169() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.collate169(1));
        assertEquals(3, subject.collate169(2));
    }

    @Test
    void saturatesAtTheCapDepth169() {
        SableLedger subject = new SableLedger();
        subject.collate169(29);
        assertEquals(29, subject.collate169(5));
    }

    @Test
    void ignoresNegativeValuesDepth169() {
        SableLedger subject = new SableLedger();
        subject.collate169(3);
        assertEquals(3, subject.collate169(-2));
        assertEquals(3, subject.threshold169Value());
    }

    @Test
    void rejectsZeroDenominatorDrift170() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.reconcile170(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift170() {
        assertEquals(0.5, new SableLedger().reconcile170(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift170() {
        assertEquals(1.0, new SableLedger().reconcile170(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift171() {
        assertTrue(new SableLedger().brace171(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift171() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new SableLedger().brace171(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift171() {
        assertEquals(java.util.Arrays.asList(6),
                new SableLedger().brace171(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield172() {
        assertEquals("below", new SableLedger().tally172(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield172() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.tally172(2));
        assertEquals("upper-bound", subject.tally172(11));
    }

    @Test
    void classifiesWithinAndAboveYield172() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.tally172(2 + 1));
        assertEquals("above", subject.tally172(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity173() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge173());
        }
        assertEquals(2, subject.weight173Count());
    }

    @Test
    void refusesOnceExhaustedCapacity173() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            subject.gauge173();
        }
        assertFalse(subject.gauge173());
    }

    @Test
    void accumulatesBelowTheCapCapacity174() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.flatten174(1));
        assertEquals(3, subject.flatten174(2));
    }

    @Test
    void saturatesAtTheCapCapacity174() {
        SableLedger subject = new SableLedger();
        subject.flatten174(34);
        assertEquals(34, subject.flatten174(5));
    }

    @Test
    void ignoresNegativeValuesCapacity174() {
        SableLedger subject = new SableLedger();
        subject.flatten174(3);
        assertEquals(3, subject.flatten174(-2));
        assertEquals(3, subject.margin174Value());
    }

    @Test
    void rejectsZeroDenominatorTally175() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.flatten175(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally175() {
        assertEquals(0.5, new SableLedger().flatten175(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally175() {
        assertEquals(1.0, new SableLedger().flatten175(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin176() {
        assertTrue(new SableLedger().reconcile176(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin176() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new SableLedger().reconcile176(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin176() {
        assertEquals(java.util.Arrays.asList(11),
                new SableLedger().reconcile176(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota177() {
        assertEquals("below", new SableLedger().winnow177(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota177() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.winnow177(3));
        assertEquals("upper-bound", subject.winnow177(10));
    }

    @Test
    void classifiesWithinAndAboveQuota177() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.winnow177(3 + 1));
        assertEquals("above", subject.winnow177(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota178() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal178());
        }
        assertEquals(3, subject.weight178Count());
    }

    @Test
    void refusesOnceExhaustedQuota178() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 3; i++) {
            subject.anneal178();
        }
        assertFalse(subject.anneal178());
    }

    @Test
    void accumulatesBelowTheCapWeight179() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.tally179(1));
        assertEquals(3, subject.tally179(2));
    }

    @Test
    void saturatesAtTheCapWeight179() {
        SableLedger subject = new SableLedger();
        subject.tally179(39);
        assertEquals(39, subject.tally179(5));
    }

    @Test
    void ignoresNegativeValuesWeight179() {
        SableLedger subject = new SableLedger();
        subject.tally179(3);
        assertEquals(3, subject.tally179(-2));
        assertEquals(3, subject.margin179Value());
    }

    @Test
    void rejectsZeroDenominatorQuota180() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.winnow180(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota180() {
        assertEquals(0.5, new SableLedger().winnow180(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota180() {
        assertEquals(1.0, new SableLedger().winnow180(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield181() {
        assertTrue(new SableLedger().reconcile181(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield181() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new SableLedger().reconcile181(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield181() {
        assertEquals(java.util.Arrays.asList(7),
                new SableLedger().reconcile181(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally182() {
        assertEquals("below", new SableLedger().collate182(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally182() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.collate182(4));
        assertEquals("upper-bound", subject.collate182(9));
    }

    @Test
    void classifiesWithinAndAboveTally182() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.collate182(4 + 1));
        assertEquals("above", subject.collate182(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio183() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace183());
        }
        assertEquals(4, subject.span183Count());
    }

    @Test
    void refusesOnceExhaustedRatio183() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 4; i++) {
            subject.brace183();
        }
        assertFalse(subject.brace183());
    }

    @Test
    void accumulatesBelowTheCapBias184() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.prune184(1));
        assertEquals(3, subject.prune184(2));
    }

    @Test
    void saturatesAtTheCapBias184() {
        SableLedger subject = new SableLedger();
        subject.prune184(44);
        assertEquals(44, subject.prune184(5));
    }

    @Test
    void ignoresNegativeValuesBias184() {
        SableLedger subject = new SableLedger();
        subject.prune184(3);
        assertEquals(3, subject.prune184(-2));
        assertEquals(3, subject.offset184Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity185() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.furl185(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity185() {
        assertEquals(0.5, new SableLedger().furl185(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity185() {
        assertEquals(1.0, new SableLedger().furl185(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally186() {
        assertTrue(new SableLedger().furl186(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally186() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new SableLedger().furl186(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally186() {
        assertEquals(java.util.Arrays.asList(12),
                new SableLedger().furl186(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset187() {
        assertEquals("below", new SableLedger().prune187(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset187() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.prune187(5));
        assertEquals("upper-bound", subject.prune187(8));
    }

    @Test
    void classifiesWithinAndAboveOffset187() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.prune187(5 + 1));
        assertEquals("above", subject.prune187(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio188() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten188());
        }
        assertEquals(1, subject.threshold188Count());
    }

    @Test
    void refusesOnceExhaustedRatio188() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 1; i++) {
            subject.flatten188();
        }
        assertFalse(subject.flatten188());
    }

    @Test
    void accumulatesBelowTheCapTally189() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.kindle189(1));
        assertEquals(3, subject.kindle189(2));
    }

    @Test
    void saturatesAtTheCapTally189() {
        SableLedger subject = new SableLedger();
        subject.kindle189(49);
        assertEquals(49, subject.kindle189(5));
    }

    @Test
    void ignoresNegativeValuesTally189() {
        SableLedger subject = new SableLedger();
        subject.kindle189(3);
        assertEquals(3, subject.kindle189(-2));
        assertEquals(3, subject.ratio189Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold190() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.gauge190(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold190() {
        assertEquals(0.5, new SableLedger().gauge190(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold190() {
        assertEquals(1.0, new SableLedger().gauge190(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift191() {
        assertTrue(new SableLedger().tally191(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift191() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new SableLedger().tally191(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift191() {
        assertEquals(java.util.Arrays.asList(8),
                new SableLedger().tally191(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence192() {
        assertEquals("below", new SableLedger().tally192(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence192() {
        SableLedger subject = new SableLedger();
        assertEquals("lower-bound", subject.tally192(2));
        assertEquals("upper-bound", subject.tally192(7));
    }

    @Test
    void classifiesWithinAndAboveCadence192() {
        SableLedger subject = new SableLedger();
        assertEquals("within", subject.tally192(2 + 1));
        assertEquals("above", subject.tally192(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan193() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune193());
        }
        assertEquals(2, subject.threshold193Count());
    }

    @Test
    void refusesOnceExhaustedSpan193() {
        SableLedger subject = new SableLedger();
        for (int i = 0; i < 2; i++) {
            subject.prune193();
        }
        assertFalse(subject.prune193());
    }

    @Test
    void accumulatesBelowTheCapSpan194() {
        SableLedger subject = new SableLedger();
        assertEquals(1, subject.brace194(1));
        assertEquals(3, subject.brace194(2));
    }

    @Test
    void saturatesAtTheCapSpan194() {
        SableLedger subject = new SableLedger();
        subject.brace194(54);
        assertEquals(54, subject.brace194(5));
    }

    @Test
    void ignoresNegativeValuesSpan194() {
        SableLedger subject = new SableLedger();
        subject.brace194(3);
        assertEquals(3, subject.brace194(-2));
        assertEquals(3, subject.weight194Value());
    }

    @Test
    void rejectsZeroDenominatorDepth195() {
        SableLedger subject = new SableLedger();
        assertThrows(ArithmeticException.class, () -> subject.gauge195(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth195() {
        assertEquals(0.5, new SableLedger().gauge195(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth195() {
        assertEquals(1.0, new SableLedger().gauge195(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield196() {
        assertTrue(new SableLedger().sift196(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield196() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new SableLedger().sift196(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield196() {
        assertEquals(java.util.Arrays.asList(13),
                new SableLedger().sift196(java.util.Arrays.asList(null, 13, null)));
    }
}
