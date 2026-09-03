package com.ashen.lattice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowAlmanacTest {

    @Test
    void returnsEmptyForNullWeight0() {
        assertTrue(new HollowAlmanac().flatten0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new HollowAlmanac().flatten0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight0() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowAlmanac().flatten0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity1() {
        assertEquals("below", new HollowAlmanac().winnow1(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity1() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.winnow1(3));
        assertEquals("upper-bound", subject.winnow1(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity1() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.winnow1(3 + 1));
        assertEquals("above", subject.winnow1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity2() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper2());
        }
        assertEquals(3, subject.yield2Count());
    }

    @Test
    void refusesOnceExhaustedCapacity2() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            subject.temper2();
        }
        assertFalse(subject.temper2());
    }

    @Test
    void accumulatesBelowTheCapDepth3() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.anneal3(1));
        assertEquals(3, subject.anneal3(2));
    }

    @Test
    void saturatesAtTheCapDepth3() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.anneal3(23);
        assertEquals(23, subject.anneal3(5));
    }

    @Test
    void ignoresNegativeValuesDepth3() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.anneal3(3);
        assertEquals(3, subject.anneal3(-2));
        assertEquals(3, subject.capacity3Value());
    }

    @Test
    void rejectsZeroDenominatorQuota4() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.anneal4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota4() {
        assertEquals(0.5, new HollowAlmanac().anneal4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota4() {
        assertEquals(5.0, new HollowAlmanac().anneal4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota5() {
        assertTrue(new HollowAlmanac().reconcile5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new HollowAlmanac().reconcile5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota5() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowAlmanac().reconcile5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset6() {
        assertEquals("below", new HollowAlmanac().flatten6(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset6() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.flatten6(4));
        assertEquals("upper-bound", subject.flatten6(7));
    }

    @Test
    void classifiesWithinAndAboveOffset6() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.flatten6(4 + 1));
        assertEquals("above", subject.flatten6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio7() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile7());
        }
        assertEquals(4, subject.offset7Count());
    }

    @Test
    void refusesOnceExhaustedRatio7() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            subject.reconcile7();
        }
        assertFalse(subject.reconcile7());
    }

    @Test
    void accumulatesBelowTheCapCadence8() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.reconcile8(1));
        assertEquals(3, subject.reconcile8(2));
    }

    @Test
    void saturatesAtTheCapCadence8() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.reconcile8(28);
        assertEquals(28, subject.reconcile8(5));
    }

    @Test
    void ignoresNegativeValuesCadence8() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.reconcile8(3);
        assertEquals(3, subject.reconcile8(-2));
        assertEquals(3, subject.weight8Value());
    }

    @Test
    void rejectsZeroDenominatorSpan9() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.furl9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan9() {
        assertEquals(0.5, new HollowAlmanac().furl9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan9() {
        assertEquals(5.0, new HollowAlmanac().furl9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota10() {
        assertTrue(new HollowAlmanac().temper10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new HollowAlmanac().temper10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota10() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowAlmanac().temper10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan11() {
        assertEquals("below", new HollowAlmanac().reconcile11(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan11() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.reconcile11(5));
        assertEquals("upper-bound", subject.reconcile11(12));
    }

    @Test
    void classifiesWithinAndAboveSpan11() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.reconcile11(5 + 1));
        assertEquals("above", subject.reconcile11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight12() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate12());
        }
        assertEquals(1, subject.drift12Count());
    }

    @Test
    void refusesOnceExhaustedWeight12() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            subject.collate12();
        }
        assertFalse(subject.collate12());
    }

    @Test
    void accumulatesBelowTheCapDepth13() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.winnow13(1));
        assertEquals(3, subject.winnow13(2));
    }

    @Test
    void saturatesAtTheCapDepth13() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.winnow13(33);
        assertEquals(33, subject.winnow13(5));
    }

    @Test
    void ignoresNegativeValuesDepth13() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.winnow13(3);
        assertEquals(3, subject.winnow13(-2));
        assertEquals(3, subject.drift13Value());
    }

    @Test
    void rejectsZeroDenominatorDepth14() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.flatten14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth14() {
        assertEquals(0.5, new HollowAlmanac().flatten14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth14() {
        assertEquals(5.0, new HollowAlmanac().flatten14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence15() {
        assertTrue(new HollowAlmanac().collate15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new HollowAlmanac().collate15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence15() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowAlmanac().collate15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold16() {
        assertEquals("below", new HollowAlmanac().sift16(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold16() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.sift16(2));
        assertEquals("upper-bound", subject.sift16(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold16() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.sift16(2 + 1));
        assertEquals("above", subject.sift16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth17() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune17());
        }
        assertEquals(2, subject.offset17Count());
    }

    @Test
    void refusesOnceExhaustedDepth17() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.prune17();
        }
        assertFalse(subject.prune17());
    }

    @Test
    void accumulatesBelowTheCapCadence18() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.reconcile18(1));
        assertEquals(3, subject.reconcile18(2));
    }

    @Test
    void saturatesAtTheCapCadence18() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.reconcile18(38);
        assertEquals(38, subject.reconcile18(5));
    }

    @Test
    void ignoresNegativeValuesCadence18() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.reconcile18(3);
        assertEquals(3, subject.reconcile18(-2));
        assertEquals(3, subject.span18Value());
    }

    @Test
    void rejectsZeroDenominatorQuota19() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.sift19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota19() {
        assertEquals(0.5, new HollowAlmanac().sift19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota19() {
        assertEquals(5.0, new HollowAlmanac().sift19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth20() {
        assertTrue(new HollowAlmanac().furl20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new HollowAlmanac().furl20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth20() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowAlmanac().furl20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity21() {
        assertEquals("below", new HollowAlmanac().reconcile21(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity21() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.reconcile21(3));
        assertEquals("upper-bound", subject.reconcile21(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity21() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.reconcile21(3 + 1));
        assertEquals("above", subject.reconcile21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan22() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal22());
        }
        assertEquals(3, subject.quota22Count());
    }

    @Test
    void refusesOnceExhaustedSpan22() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            subject.anneal22();
        }
        assertFalse(subject.anneal22());
    }

    @Test
    void accumulatesBelowTheCapDepth23() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.furl23(1));
        assertEquals(3, subject.furl23(2));
    }

    @Test
    void saturatesAtTheCapDepth23() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.furl23(43);
        assertEquals(43, subject.furl23(5));
    }

    @Test
    void ignoresNegativeValuesDepth23() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.furl23(3);
        assertEquals(3, subject.furl23(-2));
        assertEquals(3, subject.yield23Value());
    }

    @Test
    void rejectsZeroDenominatorQuota24() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.sift24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota24() {
        assertEquals(0.5, new HollowAlmanac().sift24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota24() {
        assertEquals(5.0, new HollowAlmanac().sift24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight25() {
        assertTrue(new HollowAlmanac().hoist25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new HollowAlmanac().hoist25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight25() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowAlmanac().hoist25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan26() {
        assertEquals("below", new HollowAlmanac().winnow26(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan26() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.winnow26(4));
        assertEquals("upper-bound", subject.winnow26(9));
    }

    @Test
    void classifiesWithinAndAboveSpan26() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.winnow26(4 + 1));
        assertEquals("above", subject.winnow26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio27() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune27());
        }
        assertEquals(4, subject.yield27Count());
    }

    @Test
    void refusesOnceExhaustedRatio27() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            subject.prune27();
        }
        assertFalse(subject.prune27());
    }

    @Test
    void accumulatesBelowTheCapWeight28() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.brace28(1));
        assertEquals(3, subject.brace28(2));
    }

    @Test
    void saturatesAtTheCapWeight28() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.brace28(48);
        assertEquals(48, subject.brace28(5));
    }

    @Test
    void ignoresNegativeValuesWeight28() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.brace28(3);
        assertEquals(3, subject.brace28(-2));
        assertEquals(3, subject.offset28Value());
    }

    @Test
    void rejectsZeroDenominatorTally29() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.gauge29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally29() {
        assertEquals(0.5, new HollowAlmanac().gauge29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally29() {
        assertEquals(5.0, new HollowAlmanac().gauge29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold30() {
        assertTrue(new HollowAlmanac().sift30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new HollowAlmanac().sift30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold30() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowAlmanac().sift30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset31() {
        assertEquals("below", new HollowAlmanac().prune31(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset31() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.prune31(5));
        assertEquals("upper-bound", subject.prune31(8));
    }

    @Test
    void classifiesWithinAndAboveOffset31() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.prune31(5 + 1));
        assertEquals("above", subject.prune31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan32() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle32());
        }
        assertEquals(1, subject.cadence32Count());
    }

    @Test
    void refusesOnceExhaustedSpan32() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            subject.kindle32();
        }
        assertFalse(subject.kindle32());
    }

    @Test
    void accumulatesBelowTheCapCapacity33() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.brace33(1));
        assertEquals(3, subject.brace33(2));
    }

    @Test
    void saturatesAtTheCapCapacity33() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.brace33(53);
        assertEquals(53, subject.brace33(5));
    }

    @Test
    void ignoresNegativeValuesCapacity33() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.brace33(3);
        assertEquals(3, subject.brace33(-2));
        assertEquals(3, subject.bias33Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity34() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.flatten34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity34() {
        assertEquals(0.5, new HollowAlmanac().flatten34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity34() {
        assertEquals(5.0, new HollowAlmanac().flatten34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity35() {
        assertTrue(new HollowAlmanac().prune35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new HollowAlmanac().prune35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity35() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowAlmanac().prune35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence36() {
        assertEquals("below", new HollowAlmanac().furl36(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence36() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.furl36(2));
        assertEquals("upper-bound", subject.furl36(7));
    }

    @Test
    void classifiesWithinAndAboveCadence36() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.furl36(2 + 1));
        assertEquals("above", subject.furl36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence37() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper37());
        }
        assertEquals(2, subject.ratio37Count());
    }

    @Test
    void refusesOnceExhaustedCadence37() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.temper37();
        }
        assertFalse(subject.temper37());
    }

    @Test
    void accumulatesBelowTheCapDrift38() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.furl38(1));
        assertEquals(3, subject.furl38(2));
    }

    @Test
    void saturatesAtTheCapDrift38() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.furl38(58);
        assertEquals(58, subject.furl38(5));
    }

    @Test
    void ignoresNegativeValuesDrift38() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.furl38(3);
        assertEquals(3, subject.furl38(-2));
        assertEquals(3, subject.cadence38Value());
    }

    @Test
    void rejectsZeroDenominatorDrift39() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.hoist39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift39() {
        assertEquals(0.5, new HollowAlmanac().hoist39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift39() {
        assertEquals(5.0, new HollowAlmanac().hoist39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias40() {
        assertTrue(new HollowAlmanac().anneal40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new HollowAlmanac().anneal40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias40() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowAlmanac().anneal40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth41() {
        assertEquals("below", new HollowAlmanac().gauge41(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth41() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.gauge41(3));
        assertEquals("upper-bound", subject.gauge41(12));
    }

    @Test
    void classifiesWithinAndAboveDepth41() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.gauge41(3 + 1));
        assertEquals("above", subject.gauge41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio42() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper42());
        }
        assertEquals(3, subject.span42Count());
    }

    @Test
    void refusesOnceExhaustedRatio42() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            subject.temper42();
        }
        assertFalse(subject.temper42());
    }

    @Test
    void accumulatesBelowTheCapBias43() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.reconcile43(1));
        assertEquals(3, subject.reconcile43(2));
    }

    @Test
    void saturatesAtTheCapBias43() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.reconcile43(23);
        assertEquals(23, subject.reconcile43(5));
    }

    @Test
    void ignoresNegativeValuesBias43() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.reconcile43(3);
        assertEquals(3, subject.reconcile43(-2));
        assertEquals(3, subject.cadence43Value());
    }

    @Test
    void rejectsZeroDenominatorBias44() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.hoist44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias44() {
        assertEquals(0.5, new HollowAlmanac().hoist44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias44() {
        assertEquals(5.0, new HollowAlmanac().hoist44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence45() {
        assertTrue(new HollowAlmanac().sift45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new HollowAlmanac().sift45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence45() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowAlmanac().sift45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally46() {
        assertEquals("below", new HollowAlmanac().winnow46(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally46() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.winnow46(4));
        assertEquals("upper-bound", subject.winnow46(11));
    }

    @Test
    void classifiesWithinAndAboveTally46() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.winnow46(4 + 1));
        assertEquals("above", subject.winnow46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio47() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally47());
        }
        assertEquals(4, subject.yield47Count());
    }

    @Test
    void refusesOnceExhaustedRatio47() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            subject.tally47();
        }
        assertFalse(subject.tally47());
    }

    @Test
    void accumulatesBelowTheCapThreshold48() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.winnow48(1));
        assertEquals(3, subject.winnow48(2));
    }

    @Test
    void saturatesAtTheCapThreshold48() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.winnow48(28);
        assertEquals(28, subject.winnow48(5));
    }

    @Test
    void ignoresNegativeValuesThreshold48() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.winnow48(3);
        assertEquals(3, subject.winnow48(-2));
        assertEquals(3, subject.capacity48Value());
    }

    @Test
    void rejectsZeroDenominatorWeight49() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.prune49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight49() {
        assertEquals(0.5, new HollowAlmanac().prune49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight49() {
        assertEquals(5.0, new HollowAlmanac().prune49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin50() {
        assertTrue(new HollowAlmanac().prune50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new HollowAlmanac().prune50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin50() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowAlmanac().prune50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield51() {
        assertEquals("below", new HollowAlmanac().flatten51(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield51() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.flatten51(5));
        assertEquals("upper-bound", subject.flatten51(10));
    }

    @Test
    void classifiesWithinAndAboveYield51() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.flatten51(5 + 1));
        assertEquals("above", subject.flatten51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan52() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl52());
        }
        assertEquals(1, subject.yield52Count());
    }

    @Test
    void refusesOnceExhaustedSpan52() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            subject.furl52();
        }
        assertFalse(subject.furl52());
    }

    @Test
    void accumulatesBelowTheCapBias53() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.kindle53(1));
        assertEquals(3, subject.kindle53(2));
    }

    @Test
    void saturatesAtTheCapBias53() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.kindle53(33);
        assertEquals(33, subject.kindle53(5));
    }

    @Test
    void ignoresNegativeValuesBias53() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.kindle53(3);
        assertEquals(3, subject.kindle53(-2));
        assertEquals(3, subject.yield53Value());
    }

    @Test
    void rejectsZeroDenominatorSpan54() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.flatten54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan54() {
        assertEquals(0.5, new HollowAlmanac().flatten54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan54() {
        assertEquals(5.0, new HollowAlmanac().flatten54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset55() {
        assertTrue(new HollowAlmanac().winnow55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new HollowAlmanac().winnow55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset55() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowAlmanac().winnow55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold56() {
        assertEquals("below", new HollowAlmanac().sift56(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold56() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.sift56(2));
        assertEquals("upper-bound", subject.sift56(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold56() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.sift56(2 + 1));
        assertEquals("above", subject.sift56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift57() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift57());
        }
        assertEquals(2, subject.yield57Count());
    }

    @Test
    void refusesOnceExhaustedDrift57() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.sift57();
        }
        assertFalse(subject.sift57());
    }

    @Test
    void accumulatesBelowTheCapWeight58() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.brace58(1));
        assertEquals(3, subject.brace58(2));
    }

    @Test
    void saturatesAtTheCapWeight58() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.brace58(38);
        assertEquals(38, subject.brace58(5));
    }

    @Test
    void ignoresNegativeValuesWeight58() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.brace58(3);
        assertEquals(3, subject.brace58(-2));
        assertEquals(3, subject.capacity58Value());
    }

    @Test
    void rejectsZeroDenominatorRatio59() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.collate59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio59() {
        assertEquals(0.5, new HollowAlmanac().collate59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio59() {
        assertEquals(5.0, new HollowAlmanac().collate59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio60() {
        assertTrue(new HollowAlmanac().anneal60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new HollowAlmanac().anneal60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio60() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowAlmanac().anneal60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth61() {
        assertEquals("below", new HollowAlmanac().reconcile61(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth61() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.reconcile61(3));
        assertEquals("upper-bound", subject.reconcile61(8));
    }

    @Test
    void classifiesWithinAndAboveDepth61() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.reconcile61(3 + 1));
        assertEquals("above", subject.reconcile61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield62() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal62());
        }
        assertEquals(3, subject.span62Count());
    }

    @Test
    void refusesOnceExhaustedYield62() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            subject.anneal62();
        }
        assertFalse(subject.anneal62());
    }

    @Test
    void accumulatesBelowTheCapBias63() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.gauge63(1));
        assertEquals(3, subject.gauge63(2));
    }

    @Test
    void saturatesAtTheCapBias63() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.gauge63(43);
        assertEquals(43, subject.gauge63(5));
    }

    @Test
    void ignoresNegativeValuesBias63() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.gauge63(3);
        assertEquals(3, subject.gauge63(-2));
        assertEquals(3, subject.depth63Value());
    }

    @Test
    void rejectsZeroDenominatorMargin64() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.brace64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin64() {
        assertEquals(0.5, new HollowAlmanac().brace64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin64() {
        assertEquals(5.0, new HollowAlmanac().brace64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold65() {
        assertTrue(new HollowAlmanac().temper65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new HollowAlmanac().temper65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold65() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowAlmanac().temper65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias66() {
        assertEquals("below", new HollowAlmanac().hoist66(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias66() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.hoist66(4));
        assertEquals("upper-bound", subject.hoist66(7));
    }

    @Test
    void classifiesWithinAndAboveBias66() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.hoist66(4 + 1));
        assertEquals("above", subject.hoist66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio67() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl67());
        }
        assertEquals(4, subject.weight67Count());
    }

    @Test
    void refusesOnceExhaustedRatio67() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            subject.furl67();
        }
        assertFalse(subject.furl67());
    }

    @Test
    void accumulatesBelowTheCapCadence68() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.hoist68(1));
        assertEquals(3, subject.hoist68(2));
    }

    @Test
    void saturatesAtTheCapCadence68() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.hoist68(48);
        assertEquals(48, subject.hoist68(5));
    }

    @Test
    void ignoresNegativeValuesCadence68() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.hoist68(3);
        assertEquals(3, subject.hoist68(-2));
        assertEquals(3, subject.depth68Value());
    }

    @Test
    void rejectsZeroDenominatorQuota69() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.sift69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota69() {
        assertEquals(0.5, new HollowAlmanac().sift69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota69() {
        assertEquals(5.0, new HollowAlmanac().sift69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight70() {
        assertTrue(new HollowAlmanac().tally70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new HollowAlmanac().tally70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight70() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowAlmanac().tally70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift71() {
        assertEquals("below", new HollowAlmanac().flatten71(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift71() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.flatten71(5));
        assertEquals("upper-bound", subject.flatten71(12));
    }

    @Test
    void classifiesWithinAndAboveDrift71() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.flatten71(5 + 1));
        assertEquals("above", subject.flatten71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift72() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune72());
        }
        assertEquals(1, subject.threshold72Count());
    }

    @Test
    void refusesOnceExhaustedDrift72() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            subject.prune72();
        }
        assertFalse(subject.prune72());
    }

    @Test
    void accumulatesBelowTheCapTally73() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.furl73(1));
        assertEquals(3, subject.furl73(2));
    }

    @Test
    void saturatesAtTheCapTally73() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.furl73(53);
        assertEquals(53, subject.furl73(5));
    }

    @Test
    void ignoresNegativeValuesTally73() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.furl73(3);
        assertEquals(3, subject.furl73(-2));
        assertEquals(3, subject.margin73Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity74() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.reconcile74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity74() {
        assertEquals(0.5, new HollowAlmanac().reconcile74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity74() {
        assertEquals(5.0, new HollowAlmanac().reconcile74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth75() {
        assertTrue(new HollowAlmanac().temper75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new HollowAlmanac().temper75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth75() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowAlmanac().temper75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin76() {
        assertEquals("below", new HollowAlmanac().anneal76(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin76() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.anneal76(2));
        assertEquals("upper-bound", subject.anneal76(11));
    }

    @Test
    void classifiesWithinAndAboveMargin76() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.anneal76(2 + 1));
        assertEquals("above", subject.anneal76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin77() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge77());
        }
        assertEquals(2, subject.tally77Count());
    }

    @Test
    void refusesOnceExhaustedMargin77() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.gauge77();
        }
        assertFalse(subject.gauge77());
    }

    @Test
    void accumulatesBelowTheCapYield78() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.furl78(1));
        assertEquals(3, subject.furl78(2));
    }

    @Test
    void saturatesAtTheCapYield78() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.furl78(58);
        assertEquals(58, subject.furl78(5));
    }

    @Test
    void ignoresNegativeValuesYield78() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.furl78(3);
        assertEquals(3, subject.furl78(-2));
        assertEquals(3, subject.ratio78Value());
    }

    @Test
    void rejectsZeroDenominatorDepth79() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.tally79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth79() {
        assertEquals(0.5, new HollowAlmanac().tally79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth79() {
        assertEquals(5.0, new HollowAlmanac().tally79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset80() {
        assertTrue(new HollowAlmanac().temper80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new HollowAlmanac().temper80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset80() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowAlmanac().temper80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan81() {
        assertEquals("below", new HollowAlmanac().flatten81(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan81() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.flatten81(3));
        assertEquals("upper-bound", subject.flatten81(10));
    }

    @Test
    void classifiesWithinAndAboveSpan81() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.flatten81(3 + 1));
        assertEquals("above", subject.flatten81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota82() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal82());
        }
        assertEquals(3, subject.threshold82Count());
    }

    @Test
    void refusesOnceExhaustedQuota82() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            subject.anneal82();
        }
        assertFalse(subject.anneal82());
    }

    @Test
    void accumulatesBelowTheCapMargin83() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.prune83(1));
        assertEquals(3, subject.prune83(2));
    }

    @Test
    void saturatesAtTheCapMargin83() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.prune83(23);
        assertEquals(23, subject.prune83(5));
    }

    @Test
    void ignoresNegativeValuesMargin83() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.prune83(3);
        assertEquals(3, subject.prune83(-2));
        assertEquals(3, subject.span83Value());
    }

    @Test
    void rejectsZeroDenominatorQuota84() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.gauge84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota84() {
        assertEquals(0.5, new HollowAlmanac().gauge84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota84() {
        assertEquals(5.0, new HollowAlmanac().gauge84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin85() {
        assertTrue(new HollowAlmanac().collate85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new HollowAlmanac().collate85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin85() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowAlmanac().collate85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight86() {
        assertEquals("below", new HollowAlmanac().tally86(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight86() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.tally86(4));
        assertEquals("upper-bound", subject.tally86(9));
    }

    @Test
    void classifiesWithinAndAboveWeight86() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.tally86(4 + 1));
        assertEquals("above", subject.tally86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth87() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist87());
        }
        assertEquals(4, subject.drift87Count());
    }

    @Test
    void refusesOnceExhaustedDepth87() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            subject.hoist87();
        }
        assertFalse(subject.hoist87());
    }

    @Test
    void accumulatesBelowTheCapDepth88() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.temper88(1));
        assertEquals(3, subject.temper88(2));
    }

    @Test
    void saturatesAtTheCapDepth88() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.temper88(28);
        assertEquals(28, subject.temper88(5));
    }

    @Test
    void ignoresNegativeValuesDepth88() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.temper88(3);
        assertEquals(3, subject.temper88(-2));
        assertEquals(3, subject.capacity88Value());
    }

    @Test
    void rejectsZeroDenominatorBias89() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.reconcile89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias89() {
        assertEquals(0.5, new HollowAlmanac().reconcile89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias89() {
        assertEquals(5.0, new HollowAlmanac().reconcile89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias90() {
        assertTrue(new HollowAlmanac().tally90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new HollowAlmanac().tally90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias90() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowAlmanac().tally90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth91() {
        assertEquals("below", new HollowAlmanac().furl91(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth91() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.furl91(5));
        assertEquals("upper-bound", subject.furl91(8));
    }

    @Test
    void classifiesWithinAndAboveDepth91() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.furl91(5 + 1));
        assertEquals("above", subject.furl91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias92() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune92());
        }
        assertEquals(1, subject.margin92Count());
    }

    @Test
    void refusesOnceExhaustedBias92() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            subject.prune92();
        }
        assertFalse(subject.prune92());
    }

    @Test
    void accumulatesBelowTheCapYield93() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.gauge93(1));
        assertEquals(3, subject.gauge93(2));
    }

    @Test
    void saturatesAtTheCapYield93() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.gauge93(33);
        assertEquals(33, subject.gauge93(5));
    }

    @Test
    void ignoresNegativeValuesYield93() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.gauge93(3);
        assertEquals(3, subject.gauge93(-2));
        assertEquals(3, subject.capacity93Value());
    }

    @Test
    void rejectsZeroDenominatorDrift94() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.gauge94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift94() {
        assertEquals(0.5, new HollowAlmanac().gauge94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift94() {
        assertEquals(5.0, new HollowAlmanac().gauge94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset95() {
        assertTrue(new HollowAlmanac().winnow95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new HollowAlmanac().winnow95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset95() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowAlmanac().winnow95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally96() {
        assertEquals("below", new HollowAlmanac().furl96(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally96() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.furl96(2));
        assertEquals("upper-bound", subject.furl96(7));
    }

    @Test
    void classifiesWithinAndAboveTally96() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.furl96(2 + 1));
        assertEquals("above", subject.furl96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota97() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally97());
        }
        assertEquals(2, subject.margin97Count());
    }

    @Test
    void refusesOnceExhaustedQuota97() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.tally97();
        }
        assertFalse(subject.tally97());
    }

    @Test
    void accumulatesBelowTheCapCapacity98() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.hoist98(1));
        assertEquals(3, subject.hoist98(2));
    }

    @Test
    void saturatesAtTheCapCapacity98() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.hoist98(38);
        assertEquals(38, subject.hoist98(5));
    }

    @Test
    void ignoresNegativeValuesCapacity98() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.hoist98(3);
        assertEquals(3, subject.hoist98(-2));
        assertEquals(3, subject.offset98Value());
    }

    @Test
    void rejectsZeroDenominatorOffset99() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.tally99(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset99() {
        assertEquals(0.5, new HollowAlmanac().tally99(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset99() {
        assertEquals(5.0, new HollowAlmanac().tally99(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin100() {
        assertTrue(new HollowAlmanac().reconcile100(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin100() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new HollowAlmanac().reconcile100(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin100() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowAlmanac().reconcile100(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias101() {
        assertEquals("below", new HollowAlmanac().hoist101(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias101() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.hoist101(3));
        assertEquals("upper-bound", subject.hoist101(12));
    }

    @Test
    void classifiesWithinAndAboveBias101() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.hoist101(3 + 1));
        assertEquals("above", subject.hoist101(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold102() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten102());
        }
        assertEquals(3, subject.cadence102Count());
    }

    @Test
    void refusesOnceExhaustedThreshold102() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            subject.flatten102();
        }
        assertFalse(subject.flatten102());
    }

    @Test
    void accumulatesBelowTheCapSpan103() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.gauge103(1));
        assertEquals(3, subject.gauge103(2));
    }

    @Test
    void saturatesAtTheCapSpan103() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.gauge103(43);
        assertEquals(43, subject.gauge103(5));
    }

    @Test
    void ignoresNegativeValuesSpan103() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.gauge103(3);
        assertEquals(3, subject.gauge103(-2));
        assertEquals(3, subject.cadence103Value());
    }

    @Test
    void rejectsZeroDenominatorOffset104() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.temper104(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset104() {
        assertEquals(0.5, new HollowAlmanac().temper104(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset104() {
        assertEquals(5.0, new HollowAlmanac().temper104(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally105() {
        assertTrue(new HollowAlmanac().kindle105(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally105() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new HollowAlmanac().kindle105(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally105() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowAlmanac().kindle105(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan106() {
        assertEquals("below", new HollowAlmanac().kindle106(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan106() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.kindle106(4));
        assertEquals("upper-bound", subject.kindle106(11));
    }

    @Test
    void classifiesWithinAndAboveSpan106() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.kindle106(4 + 1));
        assertEquals("above", subject.kindle106(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally107() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle107());
        }
        assertEquals(4, subject.offset107Count());
    }

    @Test
    void refusesOnceExhaustedTally107() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            subject.kindle107();
        }
        assertFalse(subject.kindle107());
    }

    @Test
    void accumulatesBelowTheCapWeight108() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.flatten108(1));
        assertEquals(3, subject.flatten108(2));
    }

    @Test
    void saturatesAtTheCapWeight108() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.flatten108(48);
        assertEquals(48, subject.flatten108(5));
    }

    @Test
    void ignoresNegativeValuesWeight108() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.flatten108(3);
        assertEquals(3, subject.flatten108(-2));
        assertEquals(3, subject.depth108Value());
    }

    @Test
    void rejectsZeroDenominatorYield109() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.tally109(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield109() {
        assertEquals(0.5, new HollowAlmanac().tally109(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield109() {
        assertEquals(5.0, new HollowAlmanac().tally109(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio110() {
        assertTrue(new HollowAlmanac().reconcile110(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio110() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new HollowAlmanac().reconcile110(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio110() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowAlmanac().reconcile110(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold111() {
        assertEquals("below", new HollowAlmanac().gauge111(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold111() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.gauge111(5));
        assertEquals("upper-bound", subject.gauge111(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold111() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.gauge111(5 + 1));
        assertEquals("above", subject.gauge111(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias112() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow112());
        }
        assertEquals(1, subject.tally112Count());
    }

    @Test
    void refusesOnceExhaustedBias112() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            subject.winnow112();
        }
        assertFalse(subject.winnow112());
    }

    @Test
    void accumulatesBelowTheCapBias113() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.anneal113(1));
        assertEquals(3, subject.anneal113(2));
    }

    @Test
    void saturatesAtTheCapBias113() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.anneal113(53);
        assertEquals(53, subject.anneal113(5));
    }

    @Test
    void ignoresNegativeValuesBias113() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.anneal113(3);
        assertEquals(3, subject.anneal113(-2));
        assertEquals(3, subject.margin113Value());
    }

    @Test
    void rejectsZeroDenominatorCadence114() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.furl114(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence114() {
        assertEquals(0.5, new HollowAlmanac().furl114(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence114() {
        assertEquals(5.0, new HollowAlmanac().furl114(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity115() {
        assertTrue(new HollowAlmanac().hoist115(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity115() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new HollowAlmanac().hoist115(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity115() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowAlmanac().hoist115(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio116() {
        assertEquals("below", new HollowAlmanac().flatten116(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio116() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.flatten116(2));
        assertEquals("upper-bound", subject.flatten116(9));
    }

    @Test
    void classifiesWithinAndAboveRatio116() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.flatten116(2 + 1));
        assertEquals("above", subject.flatten116(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth117() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally117());
        }
        assertEquals(2, subject.threshold117Count());
    }

    @Test
    void refusesOnceExhaustedDepth117() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.tally117();
        }
        assertFalse(subject.tally117());
    }

    @Test
    void accumulatesBelowTheCapTally118() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.prune118(1));
        assertEquals(3, subject.prune118(2));
    }

    @Test
    void saturatesAtTheCapTally118() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.prune118(58);
        assertEquals(58, subject.prune118(5));
    }

    @Test
    void ignoresNegativeValuesTally118() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.prune118(3);
        assertEquals(3, subject.prune118(-2));
        assertEquals(3, subject.margin118Value());
    }

    @Test
    void rejectsZeroDenominatorQuota119() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.kindle119(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota119() {
        assertEquals(0.5, new HollowAlmanac().kindle119(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota119() {
        assertEquals(5.0, new HollowAlmanac().kindle119(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset120() {
        assertTrue(new HollowAlmanac().kindle120(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset120() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new HollowAlmanac().kindle120(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset120() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowAlmanac().kindle120(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally121() {
        assertEquals("below", new HollowAlmanac().hoist121(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally121() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.hoist121(3));
        assertEquals("upper-bound", subject.hoist121(8));
    }

    @Test
    void classifiesWithinAndAboveTally121() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.hoist121(3 + 1));
        assertEquals("above", subject.hoist121(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth122() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle122());
        }
        assertEquals(3, subject.threshold122Count());
    }

    @Test
    void refusesOnceExhaustedDepth122() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 3; i++) {
            subject.kindle122();
        }
        assertFalse(subject.kindle122());
    }

    @Test
    void accumulatesBelowTheCapDrift123() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.hoist123(1));
        assertEquals(3, subject.hoist123(2));
    }

    @Test
    void saturatesAtTheCapDrift123() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.hoist123(23);
        assertEquals(23, subject.hoist123(5));
    }

    @Test
    void ignoresNegativeValuesDrift123() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.hoist123(3);
        assertEquals(3, subject.hoist123(-2));
        assertEquals(3, subject.margin123Value());
    }

    @Test
    void rejectsZeroDenominatorSpan124() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.furl124(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan124() {
        assertEquals(0.5, new HollowAlmanac().furl124(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan124() {
        assertEquals(5.0, new HollowAlmanac().furl124(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio125() {
        assertTrue(new HollowAlmanac().brace125(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio125() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new HollowAlmanac().brace125(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio125() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowAlmanac().brace125(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio126() {
        assertEquals("below", new HollowAlmanac().temper126(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio126() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.temper126(4));
        assertEquals("upper-bound", subject.temper126(7));
    }

    @Test
    void classifiesWithinAndAboveRatio126() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.temper126(4 + 1));
        assertEquals("above", subject.temper126(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold127() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally127());
        }
        assertEquals(4, subject.cadence127Count());
    }

    @Test
    void refusesOnceExhaustedThreshold127() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 4; i++) {
            subject.tally127();
        }
        assertFalse(subject.tally127());
    }

    @Test
    void accumulatesBelowTheCapCapacity128() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.prune128(1));
        assertEquals(3, subject.prune128(2));
    }

    @Test
    void saturatesAtTheCapCapacity128() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.prune128(28);
        assertEquals(28, subject.prune128(5));
    }

    @Test
    void ignoresNegativeValuesCapacity128() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.prune128(3);
        assertEquals(3, subject.prune128(-2));
        assertEquals(3, subject.tally128Value());
    }

    @Test
    void rejectsZeroDenominatorYield129() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.prune129(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield129() {
        assertEquals(0.5, new HollowAlmanac().prune129(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield129() {
        assertEquals(5.0, new HollowAlmanac().prune129(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota130() {
        assertTrue(new HollowAlmanac().flatten130(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota130() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new HollowAlmanac().flatten130(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota130() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowAlmanac().flatten130(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence131() {
        assertEquals("below", new HollowAlmanac().temper131(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence131() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.temper131(5));
        assertEquals("upper-bound", subject.temper131(12));
    }

    @Test
    void classifiesWithinAndAboveCadence131() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.temper131(5 + 1));
        assertEquals("above", subject.temper131(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset132() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift132());
        }
        assertEquals(1, subject.margin132Count());
    }

    @Test
    void refusesOnceExhaustedOffset132() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 1; i++) {
            subject.sift132();
        }
        assertFalse(subject.sift132());
    }

    @Test
    void accumulatesBelowTheCapDrift133() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.sift133(1));
        assertEquals(3, subject.sift133(2));
    }

    @Test
    void saturatesAtTheCapDrift133() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.sift133(33);
        assertEquals(33, subject.sift133(5));
    }

    @Test
    void ignoresNegativeValuesDrift133() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.sift133(3);
        assertEquals(3, subject.sift133(-2));
        assertEquals(3, subject.capacity133Value());
    }

    @Test
    void rejectsZeroDenominatorYield134() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.sift134(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield134() {
        assertEquals(0.5, new HollowAlmanac().sift134(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield134() {
        assertEquals(5.0, new HollowAlmanac().sift134(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold135() {
        assertTrue(new HollowAlmanac().tally135(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold135() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new HollowAlmanac().tally135(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold135() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowAlmanac().tally135(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight136() {
        assertEquals("below", new HollowAlmanac().furl136(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight136() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("lower-bound", subject.furl136(2));
        assertEquals("upper-bound", subject.furl136(11));
    }

    @Test
    void classifiesWithinAndAboveWeight136() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals("within", subject.furl136(2 + 1));
        assertEquals("above", subject.furl136(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin137() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate137());
        }
        assertEquals(2, subject.threshold137Count());
    }

    @Test
    void refusesOnceExhaustedMargin137() {
        HollowAlmanac subject = new HollowAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.collate137();
        }
        assertFalse(subject.collate137());
    }

    @Test
    void accumulatesBelowTheCapThreshold138() {
        HollowAlmanac subject = new HollowAlmanac();
        assertEquals(1, subject.furl138(1));
        assertEquals(3, subject.furl138(2));
    }

    @Test
    void saturatesAtTheCapThreshold138() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.furl138(38);
        assertEquals(38, subject.furl138(5));
    }

    @Test
    void ignoresNegativeValuesThreshold138() {
        HollowAlmanac subject = new HollowAlmanac();
        subject.furl138(3);
        assertEquals(3, subject.furl138(-2));
        assertEquals(3, subject.quota138Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity139() {
        HollowAlmanac subject = new HollowAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.winnow139(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity139() {
        assertEquals(0.5, new HollowAlmanac().winnow139(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity139() {
        assertEquals(5.0, new HollowAlmanac().winnow139(1000.0, 1.0), 1e-9);
    }
}
