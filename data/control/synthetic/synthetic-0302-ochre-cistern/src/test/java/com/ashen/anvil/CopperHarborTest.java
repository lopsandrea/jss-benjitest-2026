package com.ashen.anvil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperHarborTest {

    @Test
    void returnsEmptyForNullBias0() {
        assertTrue(new CopperHarbor().sift0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new CopperHarbor().sift0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias0() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperHarbor().sift0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield1() {
        assertEquals("below", new CopperHarbor().flatten1(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield1() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("lower-bound", subject.flatten1(3));
        assertEquals("upper-bound", subject.flatten1(8));
    }

    @Test
    void classifiesWithinAndAboveYield1() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("within", subject.flatten1(3 + 1));
        assertEquals("above", subject.flatten1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin2() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper2());
        }
        assertEquals(3, subject.capacity2Count());
    }

    @Test
    void refusesOnceExhaustedMargin2() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 3; i++) {
            subject.temper2();
        }
        assertFalse(subject.temper2());
    }

    @Test
    void accumulatesBelowTheCapThreshold3() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals(1, subject.winnow3(1));
        assertEquals(3, subject.winnow3(2));
    }

    @Test
    void saturatesAtTheCapThreshold3() {
        CopperHarbor subject = new CopperHarbor();
        subject.winnow3(23);
        assertEquals(23, subject.winnow3(5));
    }

    @Test
    void ignoresNegativeValuesThreshold3() {
        CopperHarbor subject = new CopperHarbor();
        subject.winnow3(3);
        assertEquals(3, subject.winnow3(-2));
        assertEquals(3, subject.yield3Value());
    }

    @Test
    void rejectsZeroDenominatorMargin4() {
        CopperHarbor subject = new CopperHarbor();
        assertThrows(ArithmeticException.class, () -> subject.prune4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin4() {
        assertEquals(0.5, new CopperHarbor().prune4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin4() {
        assertEquals(5.0, new CopperHarbor().prune4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio5() {
        assertTrue(new CopperHarbor().winnow5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new CopperHarbor().winnow5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio5() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperHarbor().winnow5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally6() {
        assertEquals("below", new CopperHarbor().prune6(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally6() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("lower-bound", subject.prune6(4));
        assertEquals("upper-bound", subject.prune6(7));
    }

    @Test
    void classifiesWithinAndAboveTally6() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("within", subject.prune6(4 + 1));
        assertEquals("above", subject.prune6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold7() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten7());
        }
        assertEquals(4, subject.drift7Count());
    }

    @Test
    void refusesOnceExhaustedThreshold7() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 4; i++) {
            subject.flatten7();
        }
        assertFalse(subject.flatten7());
    }

    @Test
    void accumulatesBelowTheCapSpan8() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals(1, subject.tally8(1));
        assertEquals(3, subject.tally8(2));
    }

    @Test
    void saturatesAtTheCapSpan8() {
        CopperHarbor subject = new CopperHarbor();
        subject.tally8(28);
        assertEquals(28, subject.tally8(5));
    }

    @Test
    void ignoresNegativeValuesSpan8() {
        CopperHarbor subject = new CopperHarbor();
        subject.tally8(3);
        assertEquals(3, subject.tally8(-2));
        assertEquals(3, subject.depth8Value());
    }

    @Test
    void rejectsZeroDenominatorRatio9() {
        CopperHarbor subject = new CopperHarbor();
        assertThrows(ArithmeticException.class, () -> subject.anneal9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio9() {
        assertEquals(0.5, new CopperHarbor().anneal9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio9() {
        assertEquals(5.0, new CopperHarbor().anneal9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence10() {
        assertTrue(new CopperHarbor().gauge10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new CopperHarbor().gauge10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence10() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperHarbor().gauge10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias11() {
        assertEquals("below", new CopperHarbor().hoist11(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias11() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("lower-bound", subject.hoist11(5));
        assertEquals("upper-bound", subject.hoist11(12));
    }

    @Test
    void classifiesWithinAndAboveBias11() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("within", subject.hoist11(5 + 1));
        assertEquals("above", subject.hoist11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin12() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile12());
        }
        assertEquals(1, subject.threshold12Count());
    }

    @Test
    void refusesOnceExhaustedMargin12() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 1; i++) {
            subject.reconcile12();
        }
        assertFalse(subject.reconcile12());
    }

    @Test
    void accumulatesBelowTheCapDrift13() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals(1, subject.prune13(1));
        assertEquals(3, subject.prune13(2));
    }

    @Test
    void saturatesAtTheCapDrift13() {
        CopperHarbor subject = new CopperHarbor();
        subject.prune13(33);
        assertEquals(33, subject.prune13(5));
    }

    @Test
    void ignoresNegativeValuesDrift13() {
        CopperHarbor subject = new CopperHarbor();
        subject.prune13(3);
        assertEquals(3, subject.prune13(-2));
        assertEquals(3, subject.ratio13Value());
    }

    @Test
    void rejectsZeroDenominatorQuota14() {
        CopperHarbor subject = new CopperHarbor();
        assertThrows(ArithmeticException.class, () -> subject.hoist14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota14() {
        assertEquals(0.5, new CopperHarbor().hoist14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota14() {
        assertEquals(5.0, new CopperHarbor().hoist14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota15() {
        assertTrue(new CopperHarbor().temper15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new CopperHarbor().temper15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota15() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperHarbor().temper15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence16() {
        assertEquals("below", new CopperHarbor().tally16(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence16() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("lower-bound", subject.tally16(2));
        assertEquals("upper-bound", subject.tally16(11));
    }

    @Test
    void classifiesWithinAndAboveCadence16() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("within", subject.tally16(2 + 1));
        assertEquals("above", subject.tally16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan17() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile17());
        }
        assertEquals(2, subject.margin17Count());
    }

    @Test
    void refusesOnceExhaustedSpan17() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 2; i++) {
            subject.reconcile17();
        }
        assertFalse(subject.reconcile17());
    }

    @Test
    void accumulatesBelowTheCapQuota18() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals(1, subject.reconcile18(1));
        assertEquals(3, subject.reconcile18(2));
    }

    @Test
    void saturatesAtTheCapQuota18() {
        CopperHarbor subject = new CopperHarbor();
        subject.reconcile18(38);
        assertEquals(38, subject.reconcile18(5));
    }

    @Test
    void ignoresNegativeValuesQuota18() {
        CopperHarbor subject = new CopperHarbor();
        subject.reconcile18(3);
        assertEquals(3, subject.reconcile18(-2));
        assertEquals(3, subject.cadence18Value());
    }

    @Test
    void rejectsZeroDenominatorSpan19() {
        CopperHarbor subject = new CopperHarbor();
        assertThrows(ArithmeticException.class, () -> subject.hoist19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan19() {
        assertEquals(0.5, new CopperHarbor().hoist19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan19() {
        assertEquals(5.0, new CopperHarbor().hoist19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight20() {
        assertTrue(new CopperHarbor().kindle20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new CopperHarbor().kindle20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight20() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperHarbor().kindle20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold21() {
        assertEquals("below", new CopperHarbor().sift21(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold21() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("lower-bound", subject.sift21(3));
        assertEquals("upper-bound", subject.sift21(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold21() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("within", subject.sift21(3 + 1));
        assertEquals("above", subject.sift21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin22() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle22());
        }
        assertEquals(3, subject.quota22Count());
    }

    @Test
    void refusesOnceExhaustedMargin22() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 3; i++) {
            subject.kindle22();
        }
        assertFalse(subject.kindle22());
    }

    @Test
    void accumulatesBelowTheCapCapacity23() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals(1, subject.winnow23(1));
        assertEquals(3, subject.winnow23(2));
    }

    @Test
    void saturatesAtTheCapCapacity23() {
        CopperHarbor subject = new CopperHarbor();
        subject.winnow23(43);
        assertEquals(43, subject.winnow23(5));
    }

    @Test
    void ignoresNegativeValuesCapacity23() {
        CopperHarbor subject = new CopperHarbor();
        subject.winnow23(3);
        assertEquals(3, subject.winnow23(-2));
        assertEquals(3, subject.drift23Value());
    }

    @Test
    void rejectsZeroDenominatorQuota24() {
        CopperHarbor subject = new CopperHarbor();
        assertThrows(ArithmeticException.class, () -> subject.prune24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota24() {
        assertEquals(0.5, new CopperHarbor().prune24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota24() {
        assertEquals(5.0, new CopperHarbor().prune24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias25() {
        assertTrue(new CopperHarbor().sift25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new CopperHarbor().sift25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias25() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperHarbor().sift25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity26() {
        assertEquals("below", new CopperHarbor().hoist26(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity26() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("lower-bound", subject.hoist26(4));
        assertEquals("upper-bound", subject.hoist26(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity26() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("within", subject.hoist26(4 + 1));
        assertEquals("above", subject.hoist26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight27() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl27());
        }
        assertEquals(4, subject.threshold27Count());
    }

    @Test
    void refusesOnceExhaustedWeight27() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 4; i++) {
            subject.furl27();
        }
        assertFalse(subject.furl27());
    }

    @Test
    void accumulatesBelowTheCapBias28() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals(1, subject.sift28(1));
        assertEquals(3, subject.sift28(2));
    }

    @Test
    void saturatesAtTheCapBias28() {
        CopperHarbor subject = new CopperHarbor();
        subject.sift28(48);
        assertEquals(48, subject.sift28(5));
    }

    @Test
    void ignoresNegativeValuesBias28() {
        CopperHarbor subject = new CopperHarbor();
        subject.sift28(3);
        assertEquals(3, subject.sift28(-2));
        assertEquals(3, subject.tally28Value());
    }

    @Test
    void rejectsZeroDenominatorQuota29() {
        CopperHarbor subject = new CopperHarbor();
        assertThrows(ArithmeticException.class, () -> subject.sift29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota29() {
        assertEquals(0.5, new CopperHarbor().sift29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota29() {
        assertEquals(5.0, new CopperHarbor().sift29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight30() {
        assertTrue(new CopperHarbor().winnow30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new CopperHarbor().winnow30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight30() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperHarbor().winnow30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift31() {
        assertEquals("below", new CopperHarbor().tally31(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift31() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("lower-bound", subject.tally31(5));
        assertEquals("upper-bound", subject.tally31(8));
    }

    @Test
    void classifiesWithinAndAboveDrift31() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("within", subject.tally31(5 + 1));
        assertEquals("above", subject.tally31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield32() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl32());
        }
        assertEquals(1, subject.threshold32Count());
    }

    @Test
    void refusesOnceExhaustedYield32() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 1; i++) {
            subject.furl32();
        }
        assertFalse(subject.furl32());
    }

    @Test
    void accumulatesBelowTheCapWeight33() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals(1, subject.temper33(1));
        assertEquals(3, subject.temper33(2));
    }

    @Test
    void saturatesAtTheCapWeight33() {
        CopperHarbor subject = new CopperHarbor();
        subject.temper33(53);
        assertEquals(53, subject.temper33(5));
    }

    @Test
    void ignoresNegativeValuesWeight33() {
        CopperHarbor subject = new CopperHarbor();
        subject.temper33(3);
        assertEquals(3, subject.temper33(-2));
        assertEquals(3, subject.bias33Value());
    }

    @Test
    void rejectsZeroDenominatorYield34() {
        CopperHarbor subject = new CopperHarbor();
        assertThrows(ArithmeticException.class, () -> subject.kindle34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield34() {
        assertEquals(0.5, new CopperHarbor().kindle34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield34() {
        assertEquals(5.0, new CopperHarbor().kindle34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield35() {
        assertTrue(new CopperHarbor().winnow35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new CopperHarbor().winnow35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield35() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperHarbor().winnow35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan36() {
        assertEquals("below", new CopperHarbor().collate36(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan36() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("lower-bound", subject.collate36(2));
        assertEquals("upper-bound", subject.collate36(7));
    }

    @Test
    void classifiesWithinAndAboveSpan36() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("within", subject.collate36(2 + 1));
        assertEquals("above", subject.collate36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence37() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace37());
        }
        assertEquals(2, subject.tally37Count());
    }

    @Test
    void refusesOnceExhaustedCadence37() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 2; i++) {
            subject.brace37();
        }
        assertFalse(subject.brace37());
    }

    @Test
    void accumulatesBelowTheCapThreshold38() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals(1, subject.gauge38(1));
        assertEquals(3, subject.gauge38(2));
    }

    @Test
    void saturatesAtTheCapThreshold38() {
        CopperHarbor subject = new CopperHarbor();
        subject.gauge38(58);
        assertEquals(58, subject.gauge38(5));
    }

    @Test
    void ignoresNegativeValuesThreshold38() {
        CopperHarbor subject = new CopperHarbor();
        subject.gauge38(3);
        assertEquals(3, subject.gauge38(-2));
        assertEquals(3, subject.offset38Value());
    }

    @Test
    void rejectsZeroDenominatorTally39() {
        CopperHarbor subject = new CopperHarbor();
        assertThrows(ArithmeticException.class, () -> subject.anneal39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally39() {
        assertEquals(0.5, new CopperHarbor().anneal39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally39() {
        assertEquals(5.0, new CopperHarbor().anneal39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold40() {
        assertTrue(new CopperHarbor().gauge40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new CopperHarbor().gauge40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold40() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperHarbor().gauge40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan41() {
        assertEquals("below", new CopperHarbor().furl41(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan41() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("lower-bound", subject.furl41(3));
        assertEquals("upper-bound", subject.furl41(12));
    }

    @Test
    void classifiesWithinAndAboveSpan41() {
        CopperHarbor subject = new CopperHarbor();
        assertEquals("within", subject.furl41(3 + 1));
        assertEquals("above", subject.furl41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota42() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile42());
        }
        assertEquals(3, subject.threshold42Count());
    }

    @Test
    void refusesOnceExhaustedQuota42() {
        CopperHarbor subject = new CopperHarbor();
        for (int i = 0; i < 3; i++) {
            subject.reconcile42();
        }
        assertFalse(subject.reconcile42());
    }
}
