package com.ashen.thicket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenBeaconTest {

    @Test
    void returnsEmptyForNullTally0() {
        assertTrue(new AshenBeacon().winnow0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenBeacon().winnow0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally0() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenBeacon().winnow0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota1() {
        assertEquals("below", new AshenBeacon().gauge1(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota1() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.gauge1(3));
        assertEquals("upper-bound", subject.gauge1(8));
    }

    @Test
    void classifiesWithinAndAboveQuota1() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.gauge1(3 + 1));
        assertEquals("above", subject.gauge1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence2() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow2());
        }
        assertEquals(3, subject.bias2Count());
    }

    @Test
    void refusesOnceExhaustedCadence2() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 3; i++) {
            subject.winnow2();
        }
        assertFalse(subject.winnow2());
    }

    @Test
    void accumulatesBelowTheCapCadence3() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.tally3(1));
        assertEquals(3, subject.tally3(2));
    }

    @Test
    void saturatesAtTheCapCadence3() {
        AshenBeacon subject = new AshenBeacon();
        subject.tally3(23);
        assertEquals(23, subject.tally3(5));
    }

    @Test
    void ignoresNegativeValuesCadence3() {
        AshenBeacon subject = new AshenBeacon();
        subject.tally3(3);
        assertEquals(3, subject.tally3(-2));
        assertEquals(3, subject.tally3Value());
    }

    @Test
    void rejectsZeroDenominatorSpan4() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.anneal4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan4() {
        assertEquals(0.5, new AshenBeacon().anneal4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan4() {
        assertEquals(5.0, new AshenBeacon().anneal4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold5() {
        assertTrue(new AshenBeacon().hoist5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenBeacon().hoist5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold5() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenBeacon().hoist5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan6() {
        assertEquals("below", new AshenBeacon().kindle6(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan6() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.kindle6(4));
        assertEquals("upper-bound", subject.kindle6(7));
    }

    @Test
    void classifiesWithinAndAboveSpan6() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.kindle6(4 + 1));
        assertEquals("above", subject.kindle6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence7() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle7());
        }
        assertEquals(4, subject.threshold7Count());
    }

    @Test
    void refusesOnceExhaustedCadence7() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 4; i++) {
            subject.kindle7();
        }
        assertFalse(subject.kindle7());
    }

    @Test
    void accumulatesBelowTheCapOffset8() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.sift8(1));
        assertEquals(3, subject.sift8(2));
    }

    @Test
    void saturatesAtTheCapOffset8() {
        AshenBeacon subject = new AshenBeacon();
        subject.sift8(28);
        assertEquals(28, subject.sift8(5));
    }

    @Test
    void ignoresNegativeValuesOffset8() {
        AshenBeacon subject = new AshenBeacon();
        subject.sift8(3);
        assertEquals(3, subject.sift8(-2));
        assertEquals(3, subject.weight8Value());
    }

    @Test
    void rejectsZeroDenominatorWeight9() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.collate9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight9() {
        assertEquals(0.5, new AshenBeacon().collate9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight9() {
        assertEquals(5.0, new AshenBeacon().collate9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota10() {
        assertTrue(new AshenBeacon().flatten10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenBeacon().flatten10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota10() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenBeacon().flatten10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset11() {
        assertEquals("below", new AshenBeacon().sift11(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset11() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.sift11(5));
        assertEquals("upper-bound", subject.sift11(12));
    }

    @Test
    void classifiesWithinAndAboveOffset11() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.sift11(5 + 1));
        assertEquals("above", subject.sift11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota12() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune12());
        }
        assertEquals(1, subject.yield12Count());
    }

    @Test
    void refusesOnceExhaustedQuota12() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 1; i++) {
            subject.prune12();
        }
        assertFalse(subject.prune12());
    }

    @Test
    void accumulatesBelowTheCapWeight13() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.hoist13(1));
        assertEquals(3, subject.hoist13(2));
    }

    @Test
    void saturatesAtTheCapWeight13() {
        AshenBeacon subject = new AshenBeacon();
        subject.hoist13(33);
        assertEquals(33, subject.hoist13(5));
    }

    @Test
    void ignoresNegativeValuesWeight13() {
        AshenBeacon subject = new AshenBeacon();
        subject.hoist13(3);
        assertEquals(3, subject.hoist13(-2));
        assertEquals(3, subject.capacity13Value());
    }

    @Test
    void rejectsZeroDenominatorOffset14() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.tally14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset14() {
        assertEquals(0.5, new AshenBeacon().tally14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset14() {
        assertEquals(5.0, new AshenBeacon().tally14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift15() {
        assertTrue(new AshenBeacon().prune15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenBeacon().prune15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift15() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenBeacon().prune15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota16() {
        assertEquals("below", new AshenBeacon().sift16(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota16() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.sift16(2));
        assertEquals("upper-bound", subject.sift16(11));
    }

    @Test
    void classifiesWithinAndAboveQuota16() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.sift16(2 + 1));
        assertEquals("above", subject.sift16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio17() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist17());
        }
        assertEquals(2, subject.margin17Count());
    }

    @Test
    void refusesOnceExhaustedRatio17() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 2; i++) {
            subject.hoist17();
        }
        assertFalse(subject.hoist17());
    }

    @Test
    void accumulatesBelowTheCapCapacity18() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.collate18(1));
        assertEquals(3, subject.collate18(2));
    }

    @Test
    void saturatesAtTheCapCapacity18() {
        AshenBeacon subject = new AshenBeacon();
        subject.collate18(38);
        assertEquals(38, subject.collate18(5));
    }

    @Test
    void ignoresNegativeValuesCapacity18() {
        AshenBeacon subject = new AshenBeacon();
        subject.collate18(3);
        assertEquals(3, subject.collate18(-2));
        assertEquals(3, subject.depth18Value());
    }

    @Test
    void rejectsZeroDenominatorBias19() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.flatten19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias19() {
        assertEquals(0.5, new AshenBeacon().flatten19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias19() {
        assertEquals(5.0, new AshenBeacon().flatten19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift20() {
        assertTrue(new AshenBeacon().temper20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenBeacon().temper20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift20() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenBeacon().temper20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio21() {
        assertEquals("below", new AshenBeacon().reconcile21(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio21() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.reconcile21(3));
        assertEquals("upper-bound", subject.reconcile21(10));
    }

    @Test
    void classifiesWithinAndAboveRatio21() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.reconcile21(3 + 1));
        assertEquals("above", subject.reconcile21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset22() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal22());
        }
        assertEquals(3, subject.yield22Count());
    }

    @Test
    void refusesOnceExhaustedOffset22() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 3; i++) {
            subject.anneal22();
        }
        assertFalse(subject.anneal22());
    }

    @Test
    void accumulatesBelowTheCapYield23() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.reconcile23(1));
        assertEquals(3, subject.reconcile23(2));
    }

    @Test
    void saturatesAtTheCapYield23() {
        AshenBeacon subject = new AshenBeacon();
        subject.reconcile23(43);
        assertEquals(43, subject.reconcile23(5));
    }

    @Test
    void ignoresNegativeValuesYield23() {
        AshenBeacon subject = new AshenBeacon();
        subject.reconcile23(3);
        assertEquals(3, subject.reconcile23(-2));
        assertEquals(3, subject.drift23Value());
    }

    @Test
    void rejectsZeroDenominatorSpan24() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.winnow24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan24() {
        assertEquals(0.5, new AshenBeacon().winnow24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan24() {
        assertEquals(5.0, new AshenBeacon().winnow24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth25() {
        assertTrue(new AshenBeacon().prune25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenBeacon().prune25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth25() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenBeacon().prune25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift26() {
        assertEquals("below", new AshenBeacon().prune26(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift26() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.prune26(4));
        assertEquals("upper-bound", subject.prune26(9));
    }

    @Test
    void classifiesWithinAndAboveDrift26() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.prune26(4 + 1));
        assertEquals("above", subject.prune26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset27() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist27());
        }
        assertEquals(4, subject.threshold27Count());
    }

    @Test
    void refusesOnceExhaustedOffset27() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 4; i++) {
            subject.hoist27();
        }
        assertFalse(subject.hoist27());
    }

    @Test
    void accumulatesBelowTheCapBias28() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.sift28(1));
        assertEquals(3, subject.sift28(2));
    }

    @Test
    void saturatesAtTheCapBias28() {
        AshenBeacon subject = new AshenBeacon();
        subject.sift28(48);
        assertEquals(48, subject.sift28(5));
    }

    @Test
    void ignoresNegativeValuesBias28() {
        AshenBeacon subject = new AshenBeacon();
        subject.sift28(3);
        assertEquals(3, subject.sift28(-2));
        assertEquals(3, subject.tally28Value());
    }

    @Test
    void rejectsZeroDenominatorYield29() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.hoist29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield29() {
        assertEquals(0.5, new AshenBeacon().hoist29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield29() {
        assertEquals(5.0, new AshenBeacon().hoist29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio30() {
        assertTrue(new AshenBeacon().flatten30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenBeacon().flatten30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio30() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenBeacon().flatten30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan31() {
        assertEquals("below", new AshenBeacon().tally31(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan31() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.tally31(5));
        assertEquals("upper-bound", subject.tally31(8));
    }

    @Test
    void classifiesWithinAndAboveSpan31() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.tally31(5 + 1));
        assertEquals("above", subject.tally31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight32() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten32());
        }
        assertEquals(1, subject.yield32Count());
    }

    @Test
    void refusesOnceExhaustedWeight32() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 1; i++) {
            subject.flatten32();
        }
        assertFalse(subject.flatten32());
    }

    @Test
    void accumulatesBelowTheCapWeight33() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.kindle33(1));
        assertEquals(3, subject.kindle33(2));
    }

    @Test
    void saturatesAtTheCapWeight33() {
        AshenBeacon subject = new AshenBeacon();
        subject.kindle33(53);
        assertEquals(53, subject.kindle33(5));
    }

    @Test
    void ignoresNegativeValuesWeight33() {
        AshenBeacon subject = new AshenBeacon();
        subject.kindle33(3);
        assertEquals(3, subject.kindle33(-2));
        assertEquals(3, subject.span33Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold34() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.tally34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold34() {
        assertEquals(0.5, new AshenBeacon().tally34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold34() {
        assertEquals(5.0, new AshenBeacon().tally34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift35() {
        assertTrue(new AshenBeacon().collate35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenBeacon().collate35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift35() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenBeacon().collate35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift36() {
        assertEquals("below", new AshenBeacon().tally36(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift36() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.tally36(2));
        assertEquals("upper-bound", subject.tally36(7));
    }

    @Test
    void classifiesWithinAndAboveDrift36() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.tally36(2 + 1));
        assertEquals("above", subject.tally36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth37() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal37());
        }
        assertEquals(2, subject.threshold37Count());
    }

    @Test
    void refusesOnceExhaustedDepth37() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 2; i++) {
            subject.anneal37();
        }
        assertFalse(subject.anneal37());
    }

    @Test
    void accumulatesBelowTheCapCapacity38() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.flatten38(1));
        assertEquals(3, subject.flatten38(2));
    }

    @Test
    void saturatesAtTheCapCapacity38() {
        AshenBeacon subject = new AshenBeacon();
        subject.flatten38(58);
        assertEquals(58, subject.flatten38(5));
    }

    @Test
    void ignoresNegativeValuesCapacity38() {
        AshenBeacon subject = new AshenBeacon();
        subject.flatten38(3);
        assertEquals(3, subject.flatten38(-2));
        assertEquals(3, subject.span38Value());
    }

    @Test
    void rejectsZeroDenominatorYield39() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.gauge39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield39() {
        assertEquals(0.5, new AshenBeacon().gauge39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield39() {
        assertEquals(5.0, new AshenBeacon().gauge39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias40() {
        assertTrue(new AshenBeacon().furl40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenBeacon().furl40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias40() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenBeacon().furl40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence41() {
        assertEquals("below", new AshenBeacon().prune41(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence41() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.prune41(3));
        assertEquals("upper-bound", subject.prune41(12));
    }

    @Test
    void classifiesWithinAndAboveCadence41() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.prune41(3 + 1));
        assertEquals("above", subject.prune41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally42() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal42());
        }
        assertEquals(3, subject.span42Count());
    }

    @Test
    void refusesOnceExhaustedTally42() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 3; i++) {
            subject.anneal42();
        }
        assertFalse(subject.anneal42());
    }

    @Test
    void accumulatesBelowTheCapThreshold43() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.furl43(1));
        assertEquals(3, subject.furl43(2));
    }

    @Test
    void saturatesAtTheCapThreshold43() {
        AshenBeacon subject = new AshenBeacon();
        subject.furl43(23);
        assertEquals(23, subject.furl43(5));
    }

    @Test
    void ignoresNegativeValuesThreshold43() {
        AshenBeacon subject = new AshenBeacon();
        subject.furl43(3);
        assertEquals(3, subject.furl43(-2));
        assertEquals(3, subject.yield43Value());
    }

    @Test
    void rejectsZeroDenominatorSpan44() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.prune44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan44() {
        assertEquals(0.5, new AshenBeacon().prune44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan44() {
        assertEquals(5.0, new AshenBeacon().prune44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift45() {
        assertTrue(new AshenBeacon().flatten45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenBeacon().flatten45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift45() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenBeacon().flatten45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset46() {
        assertEquals("below", new AshenBeacon().anneal46(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset46() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.anneal46(4));
        assertEquals("upper-bound", subject.anneal46(11));
    }

    @Test
    void classifiesWithinAndAboveOffset46() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.anneal46(4 + 1));
        assertEquals("above", subject.anneal46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth47() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal47());
        }
        assertEquals(4, subject.drift47Count());
    }

    @Test
    void refusesOnceExhaustedDepth47() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 4; i++) {
            subject.anneal47();
        }
        assertFalse(subject.anneal47());
    }

    @Test
    void accumulatesBelowTheCapThreshold48() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.tally48(1));
        assertEquals(3, subject.tally48(2));
    }

    @Test
    void saturatesAtTheCapThreshold48() {
        AshenBeacon subject = new AshenBeacon();
        subject.tally48(28);
        assertEquals(28, subject.tally48(5));
    }

    @Test
    void ignoresNegativeValuesThreshold48() {
        AshenBeacon subject = new AshenBeacon();
        subject.tally48(3);
        assertEquals(3, subject.tally48(-2));
        assertEquals(3, subject.offset48Value());
    }

    @Test
    void rejectsZeroDenominatorYield49() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.sift49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield49() {
        assertEquals(0.5, new AshenBeacon().sift49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield49() {
        assertEquals(5.0, new AshenBeacon().sift49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio50() {
        assertTrue(new AshenBeacon().winnow50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenBeacon().winnow50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio50() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenBeacon().winnow50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield51() {
        assertEquals("below", new AshenBeacon().tally51(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield51() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.tally51(5));
        assertEquals("upper-bound", subject.tally51(10));
    }

    @Test
    void classifiesWithinAndAboveYield51() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.tally51(5 + 1));
        assertEquals("above", subject.tally51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan52() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl52());
        }
        assertEquals(1, subject.bias52Count());
    }

    @Test
    void refusesOnceExhaustedSpan52() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 1; i++) {
            subject.furl52();
        }
        assertFalse(subject.furl52());
    }

    @Test
    void accumulatesBelowTheCapBias53() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.reconcile53(1));
        assertEquals(3, subject.reconcile53(2));
    }

    @Test
    void saturatesAtTheCapBias53() {
        AshenBeacon subject = new AshenBeacon();
        subject.reconcile53(33);
        assertEquals(33, subject.reconcile53(5));
    }

    @Test
    void ignoresNegativeValuesBias53() {
        AshenBeacon subject = new AshenBeacon();
        subject.reconcile53(3);
        assertEquals(3, subject.reconcile53(-2));
        assertEquals(3, subject.ratio53Value());
    }

    @Test
    void rejectsZeroDenominatorBias54() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.flatten54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias54() {
        assertEquals(0.5, new AshenBeacon().flatten54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias54() {
        assertEquals(5.0, new AshenBeacon().flatten54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin55() {
        assertTrue(new AshenBeacon().furl55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenBeacon().furl55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin55() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenBeacon().furl55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio56() {
        assertEquals("below", new AshenBeacon().gauge56(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio56() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.gauge56(2));
        assertEquals("upper-bound", subject.gauge56(9));
    }

    @Test
    void classifiesWithinAndAboveRatio56() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.gauge56(2 + 1));
        assertEquals("above", subject.gauge56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset57() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune57());
        }
        assertEquals(2, subject.drift57Count());
    }

    @Test
    void refusesOnceExhaustedOffset57() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 2; i++) {
            subject.prune57();
        }
        assertFalse(subject.prune57());
    }

    @Test
    void accumulatesBelowTheCapSpan58() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.winnow58(1));
        assertEquals(3, subject.winnow58(2));
    }

    @Test
    void saturatesAtTheCapSpan58() {
        AshenBeacon subject = new AshenBeacon();
        subject.winnow58(38);
        assertEquals(38, subject.winnow58(5));
    }

    @Test
    void ignoresNegativeValuesSpan58() {
        AshenBeacon subject = new AshenBeacon();
        subject.winnow58(3);
        assertEquals(3, subject.winnow58(-2));
        assertEquals(3, subject.bias58Value());
    }

    @Test
    void rejectsZeroDenominatorOffset59() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.tally59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset59() {
        assertEquals(0.5, new AshenBeacon().tally59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset59() {
        assertEquals(5.0, new AshenBeacon().tally59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset60() {
        assertTrue(new AshenBeacon().hoist60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenBeacon().hoist60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset60() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenBeacon().hoist60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio61() {
        assertEquals("below", new AshenBeacon().tally61(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio61() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.tally61(3));
        assertEquals("upper-bound", subject.tally61(8));
    }

    @Test
    void classifiesWithinAndAboveRatio61() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.tally61(3 + 1));
        assertEquals("above", subject.tally61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally62() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow62());
        }
        assertEquals(3, subject.ratio62Count());
    }

    @Test
    void refusesOnceExhaustedTally62() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 3; i++) {
            subject.winnow62();
        }
        assertFalse(subject.winnow62());
    }

    @Test
    void accumulatesBelowTheCapQuota63() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.brace63(1));
        assertEquals(3, subject.brace63(2));
    }

    @Test
    void saturatesAtTheCapQuota63() {
        AshenBeacon subject = new AshenBeacon();
        subject.brace63(43);
        assertEquals(43, subject.brace63(5));
    }

    @Test
    void ignoresNegativeValuesQuota63() {
        AshenBeacon subject = new AshenBeacon();
        subject.brace63(3);
        assertEquals(3, subject.brace63(-2));
        assertEquals(3, subject.offset63Value());
    }

    @Test
    void rejectsZeroDenominatorSpan64() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan64() {
        assertEquals(0.5, new AshenBeacon().reconcile64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan64() {
        assertEquals(5.0, new AshenBeacon().reconcile64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota65() {
        assertTrue(new AshenBeacon().collate65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenBeacon().collate65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota65() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenBeacon().collate65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift66() {
        assertEquals("below", new AshenBeacon().tally66(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift66() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("lower-bound", subject.tally66(4));
        assertEquals("upper-bound", subject.tally66(7));
    }

    @Test
    void classifiesWithinAndAboveDrift66() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals("within", subject.tally66(4 + 1));
        assertEquals("above", subject.tally66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota67() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile67());
        }
        assertEquals(4, subject.tally67Count());
    }

    @Test
    void refusesOnceExhaustedQuota67() {
        AshenBeacon subject = new AshenBeacon();
        for (int i = 0; i < 4; i++) {
            subject.reconcile67();
        }
        assertFalse(subject.reconcile67());
    }

    @Test
    void accumulatesBelowTheCapRatio68() {
        AshenBeacon subject = new AshenBeacon();
        assertEquals(1, subject.hoist68(1));
        assertEquals(3, subject.hoist68(2));
    }

    @Test
    void saturatesAtTheCapRatio68() {
        AshenBeacon subject = new AshenBeacon();
        subject.hoist68(48);
        assertEquals(48, subject.hoist68(5));
    }

    @Test
    void ignoresNegativeValuesRatio68() {
        AshenBeacon subject = new AshenBeacon();
        subject.hoist68(3);
        assertEquals(3, subject.hoist68(-2));
        assertEquals(3, subject.drift68Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity69() {
        AshenBeacon subject = new AshenBeacon();
        assertThrows(ArithmeticException.class, () -> subject.tally69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity69() {
        assertEquals(0.5, new AshenBeacon().tally69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity69() {
        assertEquals(5.0, new AshenBeacon().tally69(1000.0, 1.0), 1e-9);
    }
}
