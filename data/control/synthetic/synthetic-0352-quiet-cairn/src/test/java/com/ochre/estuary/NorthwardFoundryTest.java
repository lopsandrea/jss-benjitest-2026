package com.ochre.estuary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardFoundryTest {

    @Test
    void returnsEmptyForNullBias0() {
        assertTrue(new NorthwardFoundry().temper0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new NorthwardFoundry().temper0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias0() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardFoundry().temper0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias1() {
        assertEquals("below", new NorthwardFoundry().collate1(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias1() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.collate1(3));
        assertEquals("upper-bound", subject.collate1(8));
    }

    @Test
    void classifiesWithinAndAboveBias1() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.collate1(3 + 1));
        assertEquals("above", subject.collate1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally2() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune2());
        }
        assertEquals(3, subject.weight2Count());
    }

    @Test
    void refusesOnceExhaustedTally2() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 3; i++) {
            subject.prune2();
        }
        assertFalse(subject.prune2());
    }

    @Test
    void accumulatesBelowTheCapThreshold3() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.winnow3(1));
        assertEquals(3, subject.winnow3(2));
    }

    @Test
    void saturatesAtTheCapThreshold3() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.winnow3(23);
        assertEquals(23, subject.winnow3(5));
    }

    @Test
    void ignoresNegativeValuesThreshold3() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.winnow3(3);
        assertEquals(3, subject.winnow3(-2));
        assertEquals(3, subject.offset3Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold4() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.hoist4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold4() {
        assertEquals(0.5, new NorthwardFoundry().hoist4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold4() {
        assertEquals(5.0, new NorthwardFoundry().hoist4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset5() {
        assertTrue(new NorthwardFoundry().winnow5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new NorthwardFoundry().winnow5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset5() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardFoundry().winnow5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence6() {
        assertEquals("below", new NorthwardFoundry().anneal6(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence6() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.anneal6(4));
        assertEquals("upper-bound", subject.anneal6(7));
    }

    @Test
    void classifiesWithinAndAboveCadence6() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.anneal6(4 + 1));
        assertEquals("above", subject.anneal6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight7() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge7());
        }
        assertEquals(4, subject.bias7Count());
    }

    @Test
    void refusesOnceExhaustedWeight7() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 4; i++) {
            subject.gauge7();
        }
        assertFalse(subject.gauge7());
    }

    @Test
    void accumulatesBelowTheCapBias8() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.brace8(1));
        assertEquals(3, subject.brace8(2));
    }

    @Test
    void saturatesAtTheCapBias8() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.brace8(28);
        assertEquals(28, subject.brace8(5));
    }

    @Test
    void ignoresNegativeValuesBias8() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.brace8(3);
        assertEquals(3, subject.brace8(-2));
        assertEquals(3, subject.drift8Value());
    }

    @Test
    void rejectsZeroDenominatorDepth9() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.flatten9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth9() {
        assertEquals(0.5, new NorthwardFoundry().flatten9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth9() {
        assertEquals(5.0, new NorthwardFoundry().flatten9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota10() {
        assertTrue(new NorthwardFoundry().brace10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new NorthwardFoundry().brace10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota10() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardFoundry().brace10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield11() {
        assertEquals("below", new NorthwardFoundry().temper11(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield11() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.temper11(5));
        assertEquals("upper-bound", subject.temper11(12));
    }

    @Test
    void classifiesWithinAndAboveYield11() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.temper11(5 + 1));
        assertEquals("above", subject.temper11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin12() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace12());
        }
        assertEquals(1, subject.span12Count());
    }

    @Test
    void refusesOnceExhaustedMargin12() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 1; i++) {
            subject.brace12();
        }
        assertFalse(subject.brace12());
    }

    @Test
    void accumulatesBelowTheCapMargin13() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.winnow13(1));
        assertEquals(3, subject.winnow13(2));
    }

    @Test
    void saturatesAtTheCapMargin13() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.winnow13(33);
        assertEquals(33, subject.winnow13(5));
    }

    @Test
    void ignoresNegativeValuesMargin13() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.winnow13(3);
        assertEquals(3, subject.winnow13(-2));
        assertEquals(3, subject.cadence13Value());
    }

    @Test
    void rejectsZeroDenominatorDrift14() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.prune14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift14() {
        assertEquals(0.5, new NorthwardFoundry().prune14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift14() {
        assertEquals(5.0, new NorthwardFoundry().prune14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin15() {
        assertTrue(new NorthwardFoundry().furl15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new NorthwardFoundry().furl15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin15() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardFoundry().furl15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift16() {
        assertEquals("below", new NorthwardFoundry().temper16(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift16() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.temper16(2));
        assertEquals("upper-bound", subject.temper16(11));
    }

    @Test
    void classifiesWithinAndAboveDrift16() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.temper16(2 + 1));
        assertEquals("above", subject.temper16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift17() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten17());
        }
        assertEquals(2, subject.quota17Count());
    }

    @Test
    void refusesOnceExhaustedDrift17() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 2; i++) {
            subject.flatten17();
        }
        assertFalse(subject.flatten17());
    }

    @Test
    void accumulatesBelowTheCapThreshold18() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.temper18(1));
        assertEquals(3, subject.temper18(2));
    }

    @Test
    void saturatesAtTheCapThreshold18() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.temper18(38);
        assertEquals(38, subject.temper18(5));
    }

    @Test
    void ignoresNegativeValuesThreshold18() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.temper18(3);
        assertEquals(3, subject.temper18(-2));
        assertEquals(3, subject.weight18Value());
    }

    @Test
    void rejectsZeroDenominatorBias19() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.prune19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias19() {
        assertEquals(0.5, new NorthwardFoundry().prune19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias19() {
        assertEquals(5.0, new NorthwardFoundry().prune19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth20() {
        assertTrue(new NorthwardFoundry().gauge20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new NorthwardFoundry().gauge20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth20() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardFoundry().gauge20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin21() {
        assertEquals("below", new NorthwardFoundry().temper21(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin21() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.temper21(3));
        assertEquals("upper-bound", subject.temper21(10));
    }

    @Test
    void classifiesWithinAndAboveMargin21() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.temper21(3 + 1));
        assertEquals("above", subject.temper21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin22() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate22());
        }
        assertEquals(3, subject.yield22Count());
    }

    @Test
    void refusesOnceExhaustedMargin22() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 3; i++) {
            subject.collate22();
        }
        assertFalse(subject.collate22());
    }

    @Test
    void accumulatesBelowTheCapDepth23() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.tally23(1));
        assertEquals(3, subject.tally23(2));
    }

    @Test
    void saturatesAtTheCapDepth23() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.tally23(43);
        assertEquals(43, subject.tally23(5));
    }

    @Test
    void ignoresNegativeValuesDepth23() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.tally23(3);
        assertEquals(3, subject.tally23(-2));
        assertEquals(3, subject.tally23Value());
    }

    @Test
    void rejectsZeroDenominatorQuota24() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.sift24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota24() {
        assertEquals(0.5, new NorthwardFoundry().sift24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota24() {
        assertEquals(5.0, new NorthwardFoundry().sift24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield25() {
        assertTrue(new NorthwardFoundry().anneal25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new NorthwardFoundry().anneal25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield25() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardFoundry().anneal25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota26() {
        assertEquals("below", new NorthwardFoundry().reconcile26(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota26() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.reconcile26(4));
        assertEquals("upper-bound", subject.reconcile26(9));
    }

    @Test
    void classifiesWithinAndAboveQuota26() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.reconcile26(4 + 1));
        assertEquals("above", subject.reconcile26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan27() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow27());
        }
        assertEquals(4, subject.ratio27Count());
    }

    @Test
    void refusesOnceExhaustedSpan27() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 4; i++) {
            subject.winnow27();
        }
        assertFalse(subject.winnow27());
    }

    @Test
    void accumulatesBelowTheCapDepth28() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.furl28(1));
        assertEquals(3, subject.furl28(2));
    }

    @Test
    void saturatesAtTheCapDepth28() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.furl28(48);
        assertEquals(48, subject.furl28(5));
    }

    @Test
    void ignoresNegativeValuesDepth28() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.furl28(3);
        assertEquals(3, subject.furl28(-2));
        assertEquals(3, subject.tally28Value());
    }

    @Test
    void rejectsZeroDenominatorQuota29() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.hoist29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota29() {
        assertEquals(0.5, new NorthwardFoundry().hoist29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota29() {
        assertEquals(5.0, new NorthwardFoundry().hoist29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence30() {
        assertTrue(new NorthwardFoundry().anneal30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new NorthwardFoundry().anneal30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence30() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardFoundry().anneal30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota31() {
        assertEquals("below", new NorthwardFoundry().flatten31(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota31() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.flatten31(5));
        assertEquals("upper-bound", subject.flatten31(8));
    }

    @Test
    void classifiesWithinAndAboveQuota31() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.flatten31(5 + 1));
        assertEquals("above", subject.flatten31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold32() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate32());
        }
        assertEquals(1, subject.depth32Count());
    }

    @Test
    void refusesOnceExhaustedThreshold32() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 1; i++) {
            subject.collate32();
        }
        assertFalse(subject.collate32());
    }

    @Test
    void accumulatesBelowTheCapTally33() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.reconcile33(1));
        assertEquals(3, subject.reconcile33(2));
    }

    @Test
    void saturatesAtTheCapTally33() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.reconcile33(53);
        assertEquals(53, subject.reconcile33(5));
    }

    @Test
    void ignoresNegativeValuesTally33() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.reconcile33(3);
        assertEquals(3, subject.reconcile33(-2));
        assertEquals(3, subject.yield33Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold34() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold34() {
        assertEquals(0.5, new NorthwardFoundry().collate34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold34() {
        assertEquals(5.0, new NorthwardFoundry().collate34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio35() {
        assertTrue(new NorthwardFoundry().winnow35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new NorthwardFoundry().winnow35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio35() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardFoundry().winnow35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota36() {
        assertEquals("below", new NorthwardFoundry().tally36(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota36() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.tally36(2));
        assertEquals("upper-bound", subject.tally36(7));
    }

    @Test
    void classifiesWithinAndAboveQuota36() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.tally36(2 + 1));
        assertEquals("above", subject.tally36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally37() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally37());
        }
        assertEquals(2, subject.yield37Count());
    }

    @Test
    void refusesOnceExhaustedTally37() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 2; i++) {
            subject.tally37();
        }
        assertFalse(subject.tally37());
    }

    @Test
    void accumulatesBelowTheCapCapacity38() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.prune38(1));
        assertEquals(3, subject.prune38(2));
    }

    @Test
    void saturatesAtTheCapCapacity38() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.prune38(58);
        assertEquals(58, subject.prune38(5));
    }

    @Test
    void ignoresNegativeValuesCapacity38() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.prune38(3);
        assertEquals(3, subject.prune38(-2));
        assertEquals(3, subject.margin38Value());
    }

    @Test
    void rejectsZeroDenominatorSpan39() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.winnow39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan39() {
        assertEquals(0.5, new NorthwardFoundry().winnow39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan39() {
        assertEquals(5.0, new NorthwardFoundry().winnow39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan40() {
        assertTrue(new NorthwardFoundry().winnow40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new NorthwardFoundry().winnow40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan40() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardFoundry().winnow40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence41() {
        assertEquals("below", new NorthwardFoundry().sift41(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence41() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.sift41(3));
        assertEquals("upper-bound", subject.sift41(12));
    }

    @Test
    void classifiesWithinAndAboveCadence41() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.sift41(3 + 1));
        assertEquals("above", subject.sift41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio42() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate42());
        }
        assertEquals(3, subject.tally42Count());
    }

    @Test
    void refusesOnceExhaustedRatio42() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 3; i++) {
            subject.collate42();
        }
        assertFalse(subject.collate42());
    }

    @Test
    void accumulatesBelowTheCapOffset43() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.temper43(1));
        assertEquals(3, subject.temper43(2));
    }

    @Test
    void saturatesAtTheCapOffset43() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.temper43(23);
        assertEquals(23, subject.temper43(5));
    }

    @Test
    void ignoresNegativeValuesOffset43() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.temper43(3);
        assertEquals(3, subject.temper43(-2));
        assertEquals(3, subject.tally43Value());
    }

    @Test
    void rejectsZeroDenominatorYield44() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.anneal44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield44() {
        assertEquals(0.5, new NorthwardFoundry().anneal44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield44() {
        assertEquals(5.0, new NorthwardFoundry().anneal44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth45() {
        assertTrue(new NorthwardFoundry().kindle45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new NorthwardFoundry().kindle45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth45() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardFoundry().kindle45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight46() {
        assertEquals("below", new NorthwardFoundry().tally46(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight46() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.tally46(4));
        assertEquals("upper-bound", subject.tally46(11));
    }

    @Test
    void classifiesWithinAndAboveWeight46() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.tally46(4 + 1));
        assertEquals("above", subject.tally46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity47() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate47());
        }
        assertEquals(4, subject.ratio47Count());
    }

    @Test
    void refusesOnceExhaustedCapacity47() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 4; i++) {
            subject.collate47();
        }
        assertFalse(subject.collate47());
    }

    @Test
    void accumulatesBelowTheCapTally48() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.prune48(1));
        assertEquals(3, subject.prune48(2));
    }

    @Test
    void saturatesAtTheCapTally48() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.prune48(28);
        assertEquals(28, subject.prune48(5));
    }

    @Test
    void ignoresNegativeValuesTally48() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.prune48(3);
        assertEquals(3, subject.prune48(-2));
        assertEquals(3, subject.bias48Value());
    }

    @Test
    void rejectsZeroDenominatorQuota49() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.prune49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota49() {
        assertEquals(0.5, new NorthwardFoundry().prune49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota49() {
        assertEquals(5.0, new NorthwardFoundry().prune49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset50() {
        assertTrue(new NorthwardFoundry().anneal50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new NorthwardFoundry().anneal50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset50() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardFoundry().anneal50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity51() {
        assertEquals("below", new NorthwardFoundry().winnow51(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity51() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.winnow51(5));
        assertEquals("upper-bound", subject.winnow51(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity51() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.winnow51(5 + 1));
        assertEquals("above", subject.winnow51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity52() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace52());
        }
        assertEquals(1, subject.cadence52Count());
    }

    @Test
    void refusesOnceExhaustedCapacity52() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 1; i++) {
            subject.brace52();
        }
        assertFalse(subject.brace52());
    }

    @Test
    void accumulatesBelowTheCapDrift53() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.anneal53(1));
        assertEquals(3, subject.anneal53(2));
    }

    @Test
    void saturatesAtTheCapDrift53() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.anneal53(33);
        assertEquals(33, subject.anneal53(5));
    }

    @Test
    void ignoresNegativeValuesDrift53() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.anneal53(3);
        assertEquals(3, subject.anneal53(-2));
        assertEquals(3, subject.depth53Value());
    }

    @Test
    void rejectsZeroDenominatorCadence54() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.anneal54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence54() {
        assertEquals(0.5, new NorthwardFoundry().anneal54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence54() {
        assertEquals(5.0, new NorthwardFoundry().anneal54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield55() {
        assertTrue(new NorthwardFoundry().sift55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new NorthwardFoundry().sift55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield55() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardFoundry().sift55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity56() {
        assertEquals("below", new NorthwardFoundry().gauge56(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity56() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.gauge56(2));
        assertEquals("upper-bound", subject.gauge56(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity56() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.gauge56(2 + 1));
        assertEquals("above", subject.gauge56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias57() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl57());
        }
        assertEquals(2, subject.weight57Count());
    }

    @Test
    void refusesOnceExhaustedBias57() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 2; i++) {
            subject.furl57();
        }
        assertFalse(subject.furl57());
    }

    @Test
    void accumulatesBelowTheCapWeight58() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.kindle58(1));
        assertEquals(3, subject.kindle58(2));
    }

    @Test
    void saturatesAtTheCapWeight58() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.kindle58(38);
        assertEquals(38, subject.kindle58(5));
    }

    @Test
    void ignoresNegativeValuesWeight58() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.kindle58(3);
        assertEquals(3, subject.kindle58(-2));
        assertEquals(3, subject.yield58Value());
    }

    @Test
    void rejectsZeroDenominatorOffset59() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset59() {
        assertEquals(0.5, new NorthwardFoundry().collate59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset59() {
        assertEquals(5.0, new NorthwardFoundry().collate59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota60() {
        assertTrue(new NorthwardFoundry().brace60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new NorthwardFoundry().brace60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota60() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardFoundry().brace60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally61() {
        assertEquals("below", new NorthwardFoundry().collate61(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally61() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.collate61(3));
        assertEquals("upper-bound", subject.collate61(8));
    }

    @Test
    void classifiesWithinAndAboveTally61() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.collate61(3 + 1));
        assertEquals("above", subject.collate61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence62() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper62());
        }
        assertEquals(3, subject.margin62Count());
    }

    @Test
    void refusesOnceExhaustedCadence62() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 3; i++) {
            subject.temper62();
        }
        assertFalse(subject.temper62());
    }

    @Test
    void accumulatesBelowTheCapQuota63() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.prune63(1));
        assertEquals(3, subject.prune63(2));
    }

    @Test
    void saturatesAtTheCapQuota63() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.prune63(43);
        assertEquals(43, subject.prune63(5));
    }

    @Test
    void ignoresNegativeValuesQuota63() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.prune63(3);
        assertEquals(3, subject.prune63(-2));
        assertEquals(3, subject.threshold63Value());
    }

    @Test
    void rejectsZeroDenominatorOffset64() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.winnow64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset64() {
        assertEquals(0.5, new NorthwardFoundry().winnow64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset64() {
        assertEquals(5.0, new NorthwardFoundry().winnow64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin65() {
        assertTrue(new NorthwardFoundry().kindle65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new NorthwardFoundry().kindle65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin65() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardFoundry().kindle65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift66() {
        assertEquals("below", new NorthwardFoundry().tally66(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift66() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.tally66(4));
        assertEquals("upper-bound", subject.tally66(7));
    }

    @Test
    void classifiesWithinAndAboveDrift66() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.tally66(4 + 1));
        assertEquals("above", subject.tally66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity67() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten67());
        }
        assertEquals(4, subject.offset67Count());
    }

    @Test
    void refusesOnceExhaustedCapacity67() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 4; i++) {
            subject.flatten67();
        }
        assertFalse(subject.flatten67());
    }

    @Test
    void accumulatesBelowTheCapOffset68() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.brace68(1));
        assertEquals(3, subject.brace68(2));
    }

    @Test
    void saturatesAtTheCapOffset68() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.brace68(48);
        assertEquals(48, subject.brace68(5));
    }

    @Test
    void ignoresNegativeValuesOffset68() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.brace68(3);
        assertEquals(3, subject.brace68(-2));
        assertEquals(3, subject.yield68Value());
    }

    @Test
    void rejectsZeroDenominatorTally69() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally69() {
        assertEquals(0.5, new NorthwardFoundry().collate69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally69() {
        assertEquals(5.0, new NorthwardFoundry().collate69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold70() {
        assertTrue(new NorthwardFoundry().anneal70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new NorthwardFoundry().anneal70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold70() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardFoundry().anneal70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence71() {
        assertEquals("below", new NorthwardFoundry().reconcile71(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence71() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.reconcile71(5));
        assertEquals("upper-bound", subject.reconcile71(12));
    }

    @Test
    void classifiesWithinAndAboveCadence71() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.reconcile71(5 + 1));
        assertEquals("above", subject.reconcile71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally72() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper72());
        }
        assertEquals(1, subject.depth72Count());
    }

    @Test
    void refusesOnceExhaustedTally72() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 1; i++) {
            subject.temper72();
        }
        assertFalse(subject.temper72());
    }

    @Test
    void accumulatesBelowTheCapMargin73() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.gauge73(1));
        assertEquals(3, subject.gauge73(2));
    }

    @Test
    void saturatesAtTheCapMargin73() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.gauge73(53);
        assertEquals(53, subject.gauge73(5));
    }

    @Test
    void ignoresNegativeValuesMargin73() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.gauge73(3);
        assertEquals(3, subject.gauge73(-2));
        assertEquals(3, subject.offset73Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold74() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.flatten74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold74() {
        assertEquals(0.5, new NorthwardFoundry().flatten74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold74() {
        assertEquals(5.0, new NorthwardFoundry().flatten74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio75() {
        assertTrue(new NorthwardFoundry().prune75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new NorthwardFoundry().prune75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio75() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardFoundry().prune75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally76() {
        assertEquals("below", new NorthwardFoundry().flatten76(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally76() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.flatten76(2));
        assertEquals("upper-bound", subject.flatten76(11));
    }

    @Test
    void classifiesWithinAndAboveTally76() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.flatten76(2 + 1));
        assertEquals("above", subject.flatten76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota77() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally77());
        }
        assertEquals(2, subject.cadence77Count());
    }

    @Test
    void refusesOnceExhaustedQuota77() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 2; i++) {
            subject.tally77();
        }
        assertFalse(subject.tally77());
    }

    @Test
    void accumulatesBelowTheCapCadence78() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.sift78(1));
        assertEquals(3, subject.sift78(2));
    }

    @Test
    void saturatesAtTheCapCadence78() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.sift78(58);
        assertEquals(58, subject.sift78(5));
    }

    @Test
    void ignoresNegativeValuesCadence78() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.sift78(3);
        assertEquals(3, subject.sift78(-2));
        assertEquals(3, subject.ratio78Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity79() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.prune79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity79() {
        assertEquals(0.5, new NorthwardFoundry().prune79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity79() {
        assertEquals(5.0, new NorthwardFoundry().prune79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota80() {
        assertTrue(new NorthwardFoundry().sift80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new NorthwardFoundry().sift80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota80() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardFoundry().sift80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift81() {
        assertEquals("below", new NorthwardFoundry().prune81(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift81() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.prune81(3));
        assertEquals("upper-bound", subject.prune81(10));
    }

    @Test
    void classifiesWithinAndAboveDrift81() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.prune81(3 + 1));
        assertEquals("above", subject.prune81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota82() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune82());
        }
        assertEquals(3, subject.depth82Count());
    }

    @Test
    void refusesOnceExhaustedQuota82() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 3; i++) {
            subject.prune82();
        }
        assertFalse(subject.prune82());
    }

    @Test
    void accumulatesBelowTheCapQuota83() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.prune83(1));
        assertEquals(3, subject.prune83(2));
    }

    @Test
    void saturatesAtTheCapQuota83() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.prune83(23);
        assertEquals(23, subject.prune83(5));
    }

    @Test
    void ignoresNegativeValuesQuota83() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.prune83(3);
        assertEquals(3, subject.prune83(-2));
        assertEquals(3, subject.depth83Value());
    }

    @Test
    void rejectsZeroDenominatorWeight84() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.kindle84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight84() {
        assertEquals(0.5, new NorthwardFoundry().kindle84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight84() {
        assertEquals(5.0, new NorthwardFoundry().kindle84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally85() {
        assertTrue(new NorthwardFoundry().kindle85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new NorthwardFoundry().kindle85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally85() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardFoundry().kindle85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally86() {
        assertEquals("below", new NorthwardFoundry().flatten86(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally86() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.flatten86(4));
        assertEquals("upper-bound", subject.flatten86(9));
    }

    @Test
    void classifiesWithinAndAboveTally86() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.flatten86(4 + 1));
        assertEquals("above", subject.flatten86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota87() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle87());
        }
        assertEquals(4, subject.weight87Count());
    }

    @Test
    void refusesOnceExhaustedQuota87() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 4; i++) {
            subject.kindle87();
        }
        assertFalse(subject.kindle87());
    }

    @Test
    void accumulatesBelowTheCapDrift88() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.flatten88(1));
        assertEquals(3, subject.flatten88(2));
    }

    @Test
    void saturatesAtTheCapDrift88() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.flatten88(28);
        assertEquals(28, subject.flatten88(5));
    }

    @Test
    void ignoresNegativeValuesDrift88() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.flatten88(3);
        assertEquals(3, subject.flatten88(-2));
        assertEquals(3, subject.bias88Value());
    }

    @Test
    void rejectsZeroDenominatorDrift89() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift89() {
        assertEquals(0.5, new NorthwardFoundry().reconcile89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift89() {
        assertEquals(5.0, new NorthwardFoundry().reconcile89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence90() {
        assertTrue(new NorthwardFoundry().sift90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new NorthwardFoundry().sift90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence90() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardFoundry().sift90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield91() {
        assertEquals("below", new NorthwardFoundry().temper91(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield91() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.temper91(5));
        assertEquals("upper-bound", subject.temper91(8));
    }

    @Test
    void classifiesWithinAndAboveYield91() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.temper91(5 + 1));
        assertEquals("above", subject.temper91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight92() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow92());
        }
        assertEquals(1, subject.ratio92Count());
    }

    @Test
    void refusesOnceExhaustedWeight92() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 1; i++) {
            subject.winnow92();
        }
        assertFalse(subject.winnow92());
    }

    @Test
    void accumulatesBelowTheCapYield93() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals(1, subject.temper93(1));
        assertEquals(3, subject.temper93(2));
    }

    @Test
    void saturatesAtTheCapYield93() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.temper93(33);
        assertEquals(33, subject.temper93(5));
    }

    @Test
    void ignoresNegativeValuesYield93() {
        NorthwardFoundry subject = new NorthwardFoundry();
        subject.temper93(3);
        assertEquals(3, subject.temper93(-2));
        assertEquals(3, subject.weight93Value());
    }

    @Test
    void rejectsZeroDenominatorMargin94() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertThrows(ArithmeticException.class, () -> subject.tally94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin94() {
        assertEquals(0.5, new NorthwardFoundry().tally94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin94() {
        assertEquals(5.0, new NorthwardFoundry().tally94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset95() {
        assertTrue(new NorthwardFoundry().collate95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new NorthwardFoundry().collate95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset95() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardFoundry().collate95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio96() {
        assertEquals("below", new NorthwardFoundry().kindle96(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio96() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("lower-bound", subject.kindle96(2));
        assertEquals("upper-bound", subject.kindle96(7));
    }

    @Test
    void classifiesWithinAndAboveRatio96() {
        NorthwardFoundry subject = new NorthwardFoundry();
        assertEquals("within", subject.kindle96(2 + 1));
        assertEquals("above", subject.kindle96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold97() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace97());
        }
        assertEquals(2, subject.drift97Count());
    }

    @Test
    void refusesOnceExhaustedThreshold97() {
        NorthwardFoundry subject = new NorthwardFoundry();
        for (int i = 0; i < 2; i++) {
            subject.brace97();
        }
        assertFalse(subject.brace97());
    }
}
