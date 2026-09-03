package com.wexford.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperSconceIITest {

    @Test
    void returnsEmptyForNullMargin0() {
        assertTrue(new CopperSconceII().reconcile0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new CopperSconceII().reconcile0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin0() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperSconceII().reconcile0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight1() {
        assertEquals("below", new CopperSconceII().tally1(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight1() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("lower-bound", subject.tally1(3));
        assertEquals("upper-bound", subject.tally1(8));
    }

    @Test
    void classifiesWithinAndAboveWeight1() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("within", subject.tally1(3 + 1));
        assertEquals("above", subject.tally1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset2() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally2());
        }
        assertEquals(3, subject.depth2Count());
    }

    @Test
    void refusesOnceExhaustedOffset2() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 3; i++) {
            subject.tally2();
        }
        assertFalse(subject.tally2());
    }

    @Test
    void accumulatesBelowTheCapYield3() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals(1, subject.reconcile3(1));
        assertEquals(3, subject.reconcile3(2));
    }

    @Test
    void saturatesAtTheCapYield3() {
        CopperSconceII subject = new CopperSconceII();
        subject.reconcile3(23);
        assertEquals(23, subject.reconcile3(5));
    }

    @Test
    void ignoresNegativeValuesYield3() {
        CopperSconceII subject = new CopperSconceII();
        subject.reconcile3(3);
        assertEquals(3, subject.reconcile3(-2));
        assertEquals(3, subject.bias3Value());
    }

    @Test
    void rejectsZeroDenominatorQuota4() {
        CopperSconceII subject = new CopperSconceII();
        assertThrows(ArithmeticException.class, () -> subject.gauge4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota4() {
        assertEquals(0.5, new CopperSconceII().gauge4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota4() {
        assertEquals(5.0, new CopperSconceII().gauge4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth5() {
        assertTrue(new CopperSconceII().gauge5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new CopperSconceII().gauge5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth5() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperSconceII().gauge5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight6() {
        assertEquals("below", new CopperSconceII().prune6(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight6() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("lower-bound", subject.prune6(4));
        assertEquals("upper-bound", subject.prune6(7));
    }

    @Test
    void classifiesWithinAndAboveWeight6() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("within", subject.prune6(4 + 1));
        assertEquals("above", subject.prune6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth7() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle7());
        }
        assertEquals(4, subject.cadence7Count());
    }

    @Test
    void refusesOnceExhaustedDepth7() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 4; i++) {
            subject.kindle7();
        }
        assertFalse(subject.kindle7());
    }

    @Test
    void accumulatesBelowTheCapCapacity8() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals(1, subject.winnow8(1));
        assertEquals(3, subject.winnow8(2));
    }

    @Test
    void saturatesAtTheCapCapacity8() {
        CopperSconceII subject = new CopperSconceII();
        subject.winnow8(28);
        assertEquals(28, subject.winnow8(5));
    }

    @Test
    void ignoresNegativeValuesCapacity8() {
        CopperSconceII subject = new CopperSconceII();
        subject.winnow8(3);
        assertEquals(3, subject.winnow8(-2));
        assertEquals(3, subject.tally8Value());
    }

    @Test
    void rejectsZeroDenominatorOffset9() {
        CopperSconceII subject = new CopperSconceII();
        assertThrows(ArithmeticException.class, () -> subject.hoist9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset9() {
        assertEquals(0.5, new CopperSconceII().hoist9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset9() {
        assertEquals(5.0, new CopperSconceII().hoist9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota10() {
        assertTrue(new CopperSconceII().prune10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new CopperSconceII().prune10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota10() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperSconceII().prune10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence11() {
        assertEquals("below", new CopperSconceII().hoist11(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence11() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("lower-bound", subject.hoist11(5));
        assertEquals("upper-bound", subject.hoist11(12));
    }

    @Test
    void classifiesWithinAndAboveCadence11() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("within", subject.hoist11(5 + 1));
        assertEquals("above", subject.hoist11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence12() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl12());
        }
        assertEquals(1, subject.bias12Count());
    }

    @Test
    void refusesOnceExhaustedCadence12() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 1; i++) {
            subject.furl12();
        }
        assertFalse(subject.furl12());
    }

    @Test
    void accumulatesBelowTheCapYield13() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals(1, subject.flatten13(1));
        assertEquals(3, subject.flatten13(2));
    }

    @Test
    void saturatesAtTheCapYield13() {
        CopperSconceII subject = new CopperSconceII();
        subject.flatten13(33);
        assertEquals(33, subject.flatten13(5));
    }

    @Test
    void ignoresNegativeValuesYield13() {
        CopperSconceII subject = new CopperSconceII();
        subject.flatten13(3);
        assertEquals(3, subject.flatten13(-2));
        assertEquals(3, subject.ratio13Value());
    }

    @Test
    void rejectsZeroDenominatorWeight14() {
        CopperSconceII subject = new CopperSconceII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight14() {
        assertEquals(0.5, new CopperSconceII().reconcile14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight14() {
        assertEquals(5.0, new CopperSconceII().reconcile14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan15() {
        assertTrue(new CopperSconceII().kindle15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new CopperSconceII().kindle15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan15() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperSconceII().kindle15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield16() {
        assertEquals("below", new CopperSconceII().sift16(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield16() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("lower-bound", subject.sift16(2));
        assertEquals("upper-bound", subject.sift16(11));
    }

    @Test
    void classifiesWithinAndAboveYield16() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("within", subject.sift16(2 + 1));
        assertEquals("above", subject.sift16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield17() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile17());
        }
        assertEquals(2, subject.quota17Count());
    }

    @Test
    void refusesOnceExhaustedYield17() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile17();
        }
        assertFalse(subject.reconcile17());
    }

    @Test
    void accumulatesBelowTheCapCadence18() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals(1, subject.temper18(1));
        assertEquals(3, subject.temper18(2));
    }

    @Test
    void saturatesAtTheCapCadence18() {
        CopperSconceII subject = new CopperSconceII();
        subject.temper18(38);
        assertEquals(38, subject.temper18(5));
    }

    @Test
    void ignoresNegativeValuesCadence18() {
        CopperSconceII subject = new CopperSconceII();
        subject.temper18(3);
        assertEquals(3, subject.temper18(-2));
        assertEquals(3, subject.weight18Value());
    }

    @Test
    void rejectsZeroDenominatorMargin19() {
        CopperSconceII subject = new CopperSconceII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin19() {
        assertEquals(0.5, new CopperSconceII().reconcile19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin19() {
        assertEquals(5.0, new CopperSconceII().reconcile19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio20() {
        assertTrue(new CopperSconceII().brace20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new CopperSconceII().brace20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio20() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperSconceII().brace20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset21() {
        assertEquals("below", new CopperSconceII().anneal21(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset21() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("lower-bound", subject.anneal21(3));
        assertEquals("upper-bound", subject.anneal21(10));
    }

    @Test
    void classifiesWithinAndAboveOffset21() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("within", subject.anneal21(3 + 1));
        assertEquals("above", subject.anneal21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally22() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally22());
        }
        assertEquals(3, subject.quota22Count());
    }

    @Test
    void refusesOnceExhaustedTally22() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 3; i++) {
            subject.tally22();
        }
        assertFalse(subject.tally22());
    }

    @Test
    void accumulatesBelowTheCapCadence23() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals(1, subject.kindle23(1));
        assertEquals(3, subject.kindle23(2));
    }

    @Test
    void saturatesAtTheCapCadence23() {
        CopperSconceII subject = new CopperSconceII();
        subject.kindle23(43);
        assertEquals(43, subject.kindle23(5));
    }

    @Test
    void ignoresNegativeValuesCadence23() {
        CopperSconceII subject = new CopperSconceII();
        subject.kindle23(3);
        assertEquals(3, subject.kindle23(-2));
        assertEquals(3, subject.capacity23Value());
    }

    @Test
    void rejectsZeroDenominatorCadence24() {
        CopperSconceII subject = new CopperSconceII();
        assertThrows(ArithmeticException.class, () -> subject.prune24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence24() {
        assertEquals(0.5, new CopperSconceII().prune24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence24() {
        assertEquals(5.0, new CopperSconceII().prune24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin25() {
        assertTrue(new CopperSconceII().tally25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new CopperSconceII().tally25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin25() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperSconceII().tally25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota26() {
        assertEquals("below", new CopperSconceII().gauge26(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota26() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("lower-bound", subject.gauge26(4));
        assertEquals("upper-bound", subject.gauge26(9));
    }

    @Test
    void classifiesWithinAndAboveQuota26() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("within", subject.gauge26(4 + 1));
        assertEquals("above", subject.gauge26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence27() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally27());
        }
        assertEquals(4, subject.depth27Count());
    }

    @Test
    void refusesOnceExhaustedCadence27() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 4; i++) {
            subject.tally27();
        }
        assertFalse(subject.tally27());
    }

    @Test
    void accumulatesBelowTheCapWeight28() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals(1, subject.prune28(1));
        assertEquals(3, subject.prune28(2));
    }

    @Test
    void saturatesAtTheCapWeight28() {
        CopperSconceII subject = new CopperSconceII();
        subject.prune28(48);
        assertEquals(48, subject.prune28(5));
    }

    @Test
    void ignoresNegativeValuesWeight28() {
        CopperSconceII subject = new CopperSconceII();
        subject.prune28(3);
        assertEquals(3, subject.prune28(-2));
        assertEquals(3, subject.cadence28Value());
    }

    @Test
    void rejectsZeroDenominatorMargin29() {
        CopperSconceII subject = new CopperSconceII();
        assertThrows(ArithmeticException.class, () -> subject.anneal29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin29() {
        assertEquals(0.5, new CopperSconceII().anneal29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin29() {
        assertEquals(5.0, new CopperSconceII().anneal29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield30() {
        assertTrue(new CopperSconceII().collate30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new CopperSconceII().collate30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield30() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperSconceII().collate30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence31() {
        assertEquals("below", new CopperSconceII().brace31(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence31() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("lower-bound", subject.brace31(5));
        assertEquals("upper-bound", subject.brace31(8));
    }

    @Test
    void classifiesWithinAndAboveCadence31() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("within", subject.brace31(5 + 1));
        assertEquals("above", subject.brace31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight32() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally32());
        }
        assertEquals(1, subject.capacity32Count());
    }

    @Test
    void refusesOnceExhaustedWeight32() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 1; i++) {
            subject.tally32();
        }
        assertFalse(subject.tally32());
    }

    @Test
    void accumulatesBelowTheCapTally33() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals(1, subject.tally33(1));
        assertEquals(3, subject.tally33(2));
    }

    @Test
    void saturatesAtTheCapTally33() {
        CopperSconceII subject = new CopperSconceII();
        subject.tally33(53);
        assertEquals(53, subject.tally33(5));
    }

    @Test
    void ignoresNegativeValuesTally33() {
        CopperSconceII subject = new CopperSconceII();
        subject.tally33(3);
        assertEquals(3, subject.tally33(-2));
        assertEquals(3, subject.yield33Value());
    }

    @Test
    void rejectsZeroDenominatorDepth34() {
        CopperSconceII subject = new CopperSconceII();
        assertThrows(ArithmeticException.class, () -> subject.winnow34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth34() {
        assertEquals(0.5, new CopperSconceII().winnow34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth34() {
        assertEquals(5.0, new CopperSconceII().winnow34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset35() {
        assertTrue(new CopperSconceII().kindle35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new CopperSconceII().kindle35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset35() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperSconceII().kindle35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence36() {
        assertEquals("below", new CopperSconceII().reconcile36(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence36() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("lower-bound", subject.reconcile36(2));
        assertEquals("upper-bound", subject.reconcile36(7));
    }

    @Test
    void classifiesWithinAndAboveCadence36() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("within", subject.reconcile36(2 + 1));
        assertEquals("above", subject.reconcile36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence37() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace37());
        }
        assertEquals(2, subject.ratio37Count());
    }

    @Test
    void refusesOnceExhaustedCadence37() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 2; i++) {
            subject.brace37();
        }
        assertFalse(subject.brace37());
    }

    @Test
    void accumulatesBelowTheCapThreshold38() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals(1, subject.winnow38(1));
        assertEquals(3, subject.winnow38(2));
    }

    @Test
    void saturatesAtTheCapThreshold38() {
        CopperSconceII subject = new CopperSconceII();
        subject.winnow38(58);
        assertEquals(58, subject.winnow38(5));
    }

    @Test
    void ignoresNegativeValuesThreshold38() {
        CopperSconceII subject = new CopperSconceII();
        subject.winnow38(3);
        assertEquals(3, subject.winnow38(-2));
        assertEquals(3, subject.margin38Value());
    }

    @Test
    void rejectsZeroDenominatorOffset39() {
        CopperSconceII subject = new CopperSconceII();
        assertThrows(ArithmeticException.class, () -> subject.hoist39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset39() {
        assertEquals(0.5, new CopperSconceII().hoist39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset39() {
        assertEquals(5.0, new CopperSconceII().hoist39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally40() {
        assertTrue(new CopperSconceII().gauge40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new CopperSconceII().gauge40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally40() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperSconceII().gauge40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin41() {
        assertEquals("below", new CopperSconceII().brace41(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin41() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("lower-bound", subject.brace41(3));
        assertEquals("upper-bound", subject.brace41(12));
    }

    @Test
    void classifiesWithinAndAboveMargin41() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("within", subject.brace41(3 + 1));
        assertEquals("above", subject.brace41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin42() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle42());
        }
        assertEquals(3, subject.cadence42Count());
    }

    @Test
    void refusesOnceExhaustedMargin42() {
        CopperSconceII subject = new CopperSconceII();
        for (int i = 0; i < 3; i++) {
            subject.kindle42();
        }
        assertFalse(subject.kindle42());
    }

    @Test
    void accumulatesBelowTheCapDrift43() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals(1, subject.brace43(1));
        assertEquals(3, subject.brace43(2));
    }

    @Test
    void saturatesAtTheCapDrift43() {
        CopperSconceII subject = new CopperSconceII();
        subject.brace43(23);
        assertEquals(23, subject.brace43(5));
    }

    @Test
    void ignoresNegativeValuesDrift43() {
        CopperSconceII subject = new CopperSconceII();
        subject.brace43(3);
        assertEquals(3, subject.brace43(-2));
        assertEquals(3, subject.quota43Value());
    }

    @Test
    void rejectsZeroDenominatorCadence44() {
        CopperSconceII subject = new CopperSconceII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence44() {
        assertEquals(0.5, new CopperSconceII().reconcile44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence44() {
        assertEquals(5.0, new CopperSconceII().reconcile44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield45() {
        assertTrue(new CopperSconceII().tally45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new CopperSconceII().tally45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield45() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperSconceII().tally45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota46() {
        assertEquals("below", new CopperSconceII().gauge46(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota46() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("lower-bound", subject.gauge46(4));
        assertEquals("upper-bound", subject.gauge46(11));
    }

    @Test
    void classifiesWithinAndAboveQuota46() {
        CopperSconceII subject = new CopperSconceII();
        assertEquals("within", subject.gauge46(4 + 1));
        assertEquals("above", subject.gauge46(11 + 1));
    }
}
