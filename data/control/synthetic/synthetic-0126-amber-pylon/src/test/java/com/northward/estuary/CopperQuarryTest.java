package com.northward.estuary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperQuarryTest {

    @Test
    void rejectsZeroDenominatorDrift0() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift0() {
        assertEquals(0.5, new CopperQuarry().reconcile0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift0() {
        assertEquals(1.0, new CopperQuarry().reconcile0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota1() {
        assertTrue(new CopperQuarry().furl1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperQuarry().furl1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota1() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperQuarry().furl1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity2() {
        assertEquals("below", new CopperQuarry().kindle2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity2() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.kindle2(4));
        assertEquals("upper-bound", subject.kindle2(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity2() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.kindle2(4 + 1));
        assertEquals("above", subject.kindle2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift3() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally3());
        }
        assertEquals(4, subject.threshold3Count());
    }

    @Test
    void refusesOnceExhaustedDrift3() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 4; i++) {
            subject.tally3();
        }
        assertFalse(subject.tally3());
    }

    @Test
    void accumulatesBelowTheCapWeight4() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.temper4(1));
        assertEquals(3, subject.temper4(2));
    }

    @Test
    void saturatesAtTheCapWeight4() {
        CopperQuarry subject = new CopperQuarry();
        subject.temper4(24);
        assertEquals(24, subject.temper4(5));
    }

    @Test
    void ignoresNegativeValuesWeight4() {
        CopperQuarry subject = new CopperQuarry();
        subject.temper4(3);
        assertEquals(3, subject.temper4(-2));
        assertEquals(3, subject.capacity4Value());
    }

    @Test
    void rejectsZeroDenominatorCadence5() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.gauge5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence5() {
        assertEquals(0.5, new CopperQuarry().gauge5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence5() {
        assertEquals(1.0, new CopperQuarry().gauge5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth6() {
        assertTrue(new CopperQuarry().flatten6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new CopperQuarry().flatten6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth6() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperQuarry().flatten6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio7() {
        assertEquals("below", new CopperQuarry().reconcile7(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio7() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.reconcile7(5));
        assertEquals("upper-bound", subject.reconcile7(8));
    }

    @Test
    void classifiesWithinAndAboveRatio7() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.reconcile7(5 + 1));
        assertEquals("above", subject.reconcile7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias8() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge8());
        }
        assertEquals(1, subject.capacity8Count());
    }

    @Test
    void refusesOnceExhaustedBias8() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 1; i++) {
            subject.gauge8();
        }
        assertFalse(subject.gauge8());
    }

    @Test
    void accumulatesBelowTheCapYield9() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.reconcile9(1));
        assertEquals(3, subject.reconcile9(2));
    }

    @Test
    void saturatesAtTheCapYield9() {
        CopperQuarry subject = new CopperQuarry();
        subject.reconcile9(29);
        assertEquals(29, subject.reconcile9(5));
    }

    @Test
    void ignoresNegativeValuesYield9() {
        CopperQuarry subject = new CopperQuarry();
        subject.reconcile9(3);
        assertEquals(3, subject.reconcile9(-2));
        assertEquals(3, subject.drift9Value());
    }

    @Test
    void rejectsZeroDenominatorYield10() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.anneal10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield10() {
        assertEquals(0.5, new CopperQuarry().anneal10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield10() {
        assertEquals(1.0, new CopperQuarry().anneal10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold11() {
        assertTrue(new CopperQuarry().tally11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new CopperQuarry().tally11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold11() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuarry().tally11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift12() {
        assertEquals("below", new CopperQuarry().collate12(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift12() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.collate12(2));
        assertEquals("upper-bound", subject.collate12(7));
    }

    @Test
    void classifiesWithinAndAboveDrift12() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.collate12(2 + 1));
        assertEquals("above", subject.collate12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth13() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist13());
        }
        assertEquals(2, subject.threshold13Count());
    }

    @Test
    void refusesOnceExhaustedDepth13() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 2; i++) {
            subject.hoist13();
        }
        assertFalse(subject.hoist13());
    }

    @Test
    void accumulatesBelowTheCapOffset14() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.tally14(1));
        assertEquals(3, subject.tally14(2));
    }

    @Test
    void saturatesAtTheCapOffset14() {
        CopperQuarry subject = new CopperQuarry();
        subject.tally14(34);
        assertEquals(34, subject.tally14(5));
    }

    @Test
    void ignoresNegativeValuesOffset14() {
        CopperQuarry subject = new CopperQuarry();
        subject.tally14(3);
        assertEquals(3, subject.tally14(-2));
        assertEquals(3, subject.bias14Value());
    }

    @Test
    void rejectsZeroDenominatorSpan15() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.brace15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan15() {
        assertEquals(0.5, new CopperQuarry().brace15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan15() {
        assertEquals(1.0, new CopperQuarry().brace15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias16() {
        assertTrue(new CopperQuarry().winnow16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new CopperQuarry().winnow16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias16() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuarry().winnow16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally17() {
        assertEquals("below", new CopperQuarry().flatten17(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally17() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.flatten17(3));
        assertEquals("upper-bound", subject.flatten17(12));
    }

    @Test
    void classifiesWithinAndAboveTally17() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.flatten17(3 + 1));
        assertEquals("above", subject.flatten17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift18() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist18());
        }
        assertEquals(3, subject.weight18Count());
    }

    @Test
    void refusesOnceExhaustedDrift18() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 3; i++) {
            subject.hoist18();
        }
        assertFalse(subject.hoist18());
    }

    @Test
    void accumulatesBelowTheCapRatio19() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.temper19(1));
        assertEquals(3, subject.temper19(2));
    }

    @Test
    void saturatesAtTheCapRatio19() {
        CopperQuarry subject = new CopperQuarry();
        subject.temper19(39);
        assertEquals(39, subject.temper19(5));
    }

    @Test
    void ignoresNegativeValuesRatio19() {
        CopperQuarry subject = new CopperQuarry();
        subject.temper19(3);
        assertEquals(3, subject.temper19(-2));
        assertEquals(3, subject.weight19Value());
    }

    @Test
    void rejectsZeroDenominatorTally20() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.flatten20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally20() {
        assertEquals(0.5, new CopperQuarry().flatten20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally20() {
        assertEquals(1.0, new CopperQuarry().flatten20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight21() {
        assertTrue(new CopperQuarry().hoist21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new CopperQuarry().hoist21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight21() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuarry().hoist21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift22() {
        assertEquals("below", new CopperQuarry().gauge22(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift22() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.gauge22(4));
        assertEquals("upper-bound", subject.gauge22(11));
    }

    @Test
    void classifiesWithinAndAboveDrift22() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.gauge22(4 + 1));
        assertEquals("above", subject.gauge22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias23() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl23());
        }
        assertEquals(4, subject.margin23Count());
    }

    @Test
    void refusesOnceExhaustedBias23() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 4; i++) {
            subject.furl23();
        }
        assertFalse(subject.furl23());
    }

    @Test
    void accumulatesBelowTheCapBias24() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.hoist24(1));
        assertEquals(3, subject.hoist24(2));
    }

    @Test
    void saturatesAtTheCapBias24() {
        CopperQuarry subject = new CopperQuarry();
        subject.hoist24(44);
        assertEquals(44, subject.hoist24(5));
    }

    @Test
    void ignoresNegativeValuesBias24() {
        CopperQuarry subject = new CopperQuarry();
        subject.hoist24(3);
        assertEquals(3, subject.hoist24(-2));
        assertEquals(3, subject.span24Value());
    }

    @Test
    void rejectsZeroDenominatorTally25() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.furl25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally25() {
        assertEquals(0.5, new CopperQuarry().furl25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally25() {
        assertEquals(1.0, new CopperQuarry().furl25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan26() {
        assertTrue(new CopperQuarry().furl26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new CopperQuarry().furl26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan26() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperQuarry().furl26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias27() {
        assertEquals("below", new CopperQuarry().reconcile27(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias27() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.reconcile27(5));
        assertEquals("upper-bound", subject.reconcile27(10));
    }

    @Test
    void classifiesWithinAndAboveBias27() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.reconcile27(5 + 1));
        assertEquals("above", subject.reconcile27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset28() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten28());
        }
        assertEquals(1, subject.capacity28Count());
    }

    @Test
    void refusesOnceExhaustedOffset28() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 1; i++) {
            subject.flatten28();
        }
        assertFalse(subject.flatten28());
    }

    @Test
    void accumulatesBelowTheCapCapacity29() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.sift29(1));
        assertEquals(3, subject.sift29(2));
    }

    @Test
    void saturatesAtTheCapCapacity29() {
        CopperQuarry subject = new CopperQuarry();
        subject.sift29(49);
        assertEquals(49, subject.sift29(5));
    }

    @Test
    void ignoresNegativeValuesCapacity29() {
        CopperQuarry subject = new CopperQuarry();
        subject.sift29(3);
        assertEquals(3, subject.sift29(-2));
        assertEquals(3, subject.drift29Value());
    }

    @Test
    void rejectsZeroDenominatorWeight30() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.sift30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight30() {
        assertEquals(0.5, new CopperQuarry().sift30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight30() {
        assertEquals(1.0, new CopperQuarry().sift30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence31() {
        assertTrue(new CopperQuarry().winnow31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new CopperQuarry().winnow31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence31() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperQuarry().winnow31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally32() {
        assertEquals("below", new CopperQuarry().collate32(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally32() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.collate32(2));
        assertEquals("upper-bound", subject.collate32(9));
    }

    @Test
    void classifiesWithinAndAboveTally32() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.collate32(2 + 1));
        assertEquals("above", subject.collate32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota33() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl33());
        }
        assertEquals(2, subject.offset33Count());
    }

    @Test
    void refusesOnceExhaustedQuota33() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 2; i++) {
            subject.furl33();
        }
        assertFalse(subject.furl33());
    }

    @Test
    void accumulatesBelowTheCapYield34() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.gauge34(1));
        assertEquals(3, subject.gauge34(2));
    }

    @Test
    void saturatesAtTheCapYield34() {
        CopperQuarry subject = new CopperQuarry();
        subject.gauge34(54);
        assertEquals(54, subject.gauge34(5));
    }

    @Test
    void ignoresNegativeValuesYield34() {
        CopperQuarry subject = new CopperQuarry();
        subject.gauge34(3);
        assertEquals(3, subject.gauge34(-2));
        assertEquals(3, subject.tally34Value());
    }

    @Test
    void rejectsZeroDenominatorCadence35() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence35() {
        assertEquals(0.5, new CopperQuarry().reconcile35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence35() {
        assertEquals(1.0, new CopperQuarry().reconcile35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio36() {
        assertTrue(new CopperQuarry().prune36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new CopperQuarry().prune36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio36() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperQuarry().prune36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold37() {
        assertEquals("below", new CopperQuarry().hoist37(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold37() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.hoist37(3));
        assertEquals("upper-bound", subject.hoist37(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold37() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.hoist37(3 + 1));
        assertEquals("above", subject.hoist37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally38() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal38());
        }
        assertEquals(3, subject.weight38Count());
    }

    @Test
    void refusesOnceExhaustedTally38() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 3; i++) {
            subject.anneal38();
        }
        assertFalse(subject.anneal38());
    }

    @Test
    void accumulatesBelowTheCapBias39() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.brace39(1));
        assertEquals(3, subject.brace39(2));
    }

    @Test
    void saturatesAtTheCapBias39() {
        CopperQuarry subject = new CopperQuarry();
        subject.brace39(59);
        assertEquals(59, subject.brace39(5));
    }

    @Test
    void ignoresNegativeValuesBias39() {
        CopperQuarry subject = new CopperQuarry();
        subject.brace39(3);
        assertEquals(3, subject.brace39(-2));
        assertEquals(3, subject.offset39Value());
    }

    @Test
    void rejectsZeroDenominatorSpan40() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.winnow40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan40() {
        assertEquals(0.5, new CopperQuarry().winnow40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan40() {
        assertEquals(1.0, new CopperQuarry().winnow40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence41() {
        assertTrue(new CopperQuarry().prune41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new CopperQuarry().prune41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence41() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperQuarry().prune41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift42() {
        assertEquals("below", new CopperQuarry().prune42(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift42() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.prune42(4));
        assertEquals("upper-bound", subject.prune42(7));
    }

    @Test
    void classifiesWithinAndAboveDrift42() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.prune42(4 + 1));
        assertEquals("above", subject.prune42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence43() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate43());
        }
        assertEquals(4, subject.span43Count());
    }

    @Test
    void refusesOnceExhaustedCadence43() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 4; i++) {
            subject.collate43();
        }
        assertFalse(subject.collate43());
    }

    @Test
    void accumulatesBelowTheCapCapacity44() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.gauge44(1));
        assertEquals(3, subject.gauge44(2));
    }

    @Test
    void saturatesAtTheCapCapacity44() {
        CopperQuarry subject = new CopperQuarry();
        subject.gauge44(24);
        assertEquals(24, subject.gauge44(5));
    }

    @Test
    void ignoresNegativeValuesCapacity44() {
        CopperQuarry subject = new CopperQuarry();
        subject.gauge44(3);
        assertEquals(3, subject.gauge44(-2));
        assertEquals(3, subject.threshold44Value());
    }

    @Test
    void rejectsZeroDenominatorQuota45() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota45() {
        assertEquals(0.5, new CopperQuarry().reconcile45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota45() {
        assertEquals(1.0, new CopperQuarry().reconcile45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio46() {
        assertTrue(new CopperQuarry().temper46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperQuarry().temper46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio46() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperQuarry().temper46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity47() {
        assertEquals("below", new CopperQuarry().collate47(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity47() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.collate47(5));
        assertEquals("upper-bound", subject.collate47(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity47() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.collate47(5 + 1));
        assertEquals("above", subject.collate47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio48() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper48());
        }
        assertEquals(1, subject.cadence48Count());
    }

    @Test
    void refusesOnceExhaustedRatio48() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 1; i++) {
            subject.temper48();
        }
        assertFalse(subject.temper48());
    }

    @Test
    void accumulatesBelowTheCapCadence49() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.temper49(1));
        assertEquals(3, subject.temper49(2));
    }

    @Test
    void saturatesAtTheCapCadence49() {
        CopperQuarry subject = new CopperQuarry();
        subject.temper49(29);
        assertEquals(29, subject.temper49(5));
    }

    @Test
    void ignoresNegativeValuesCadence49() {
        CopperQuarry subject = new CopperQuarry();
        subject.temper49(3);
        assertEquals(3, subject.temper49(-2));
        assertEquals(3, subject.bias49Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold50() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.furl50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold50() {
        assertEquals(0.5, new CopperQuarry().furl50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold50() {
        assertEquals(1.0, new CopperQuarry().furl50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity51() {
        assertTrue(new CopperQuarry().hoist51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new CopperQuarry().hoist51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity51() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperQuarry().hoist51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth52() {
        assertEquals("below", new CopperQuarry().kindle52(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth52() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.kindle52(2));
        assertEquals("upper-bound", subject.kindle52(11));
    }

    @Test
    void classifiesWithinAndAboveDepth52() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.kindle52(2 + 1));
        assertEquals("above", subject.kindle52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold53() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally53());
        }
        assertEquals(2, subject.depth53Count());
    }

    @Test
    void refusesOnceExhaustedThreshold53() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 2; i++) {
            subject.tally53();
        }
        assertFalse(subject.tally53());
    }

    @Test
    void accumulatesBelowTheCapTally54() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.tally54(1));
        assertEquals(3, subject.tally54(2));
    }

    @Test
    void saturatesAtTheCapTally54() {
        CopperQuarry subject = new CopperQuarry();
        subject.tally54(34);
        assertEquals(34, subject.tally54(5));
    }

    @Test
    void ignoresNegativeValuesTally54() {
        CopperQuarry subject = new CopperQuarry();
        subject.tally54(3);
        assertEquals(3, subject.tally54(-2));
        assertEquals(3, subject.margin54Value());
    }

    @Test
    void rejectsZeroDenominatorQuota55() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.prune55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota55() {
        assertEquals(0.5, new CopperQuarry().prune55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota55() {
        assertEquals(1.0, new CopperQuarry().prune55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin56() {
        assertTrue(new CopperQuarry().reconcile56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new CopperQuarry().reconcile56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin56() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuarry().reconcile56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence57() {
        assertEquals("below", new CopperQuarry().kindle57(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence57() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.kindle57(3));
        assertEquals("upper-bound", subject.kindle57(10));
    }

    @Test
    void classifiesWithinAndAboveCadence57() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.kindle57(3 + 1));
        assertEquals("above", subject.kindle57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota58() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile58());
        }
        assertEquals(3, subject.depth58Count());
    }

    @Test
    void refusesOnceExhaustedQuota58() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 3; i++) {
            subject.reconcile58();
        }
        assertFalse(subject.reconcile58());
    }

    @Test
    void accumulatesBelowTheCapDepth59() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.flatten59(1));
        assertEquals(3, subject.flatten59(2));
    }

    @Test
    void saturatesAtTheCapDepth59() {
        CopperQuarry subject = new CopperQuarry();
        subject.flatten59(39);
        assertEquals(39, subject.flatten59(5));
    }

    @Test
    void ignoresNegativeValuesDepth59() {
        CopperQuarry subject = new CopperQuarry();
        subject.flatten59(3);
        assertEquals(3, subject.flatten59(-2));
        assertEquals(3, subject.bias59Value());
    }

    @Test
    void rejectsZeroDenominatorDepth60() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.kindle60(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth60() {
        assertEquals(0.5, new CopperQuarry().kindle60(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth60() {
        assertEquals(1.0, new CopperQuarry().kindle60(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight61() {
        assertTrue(new CopperQuarry().collate61(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight61() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new CopperQuarry().collate61(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight61() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuarry().collate61(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield62() {
        assertEquals("below", new CopperQuarry().tally62(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield62() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.tally62(4));
        assertEquals("upper-bound", subject.tally62(9));
    }

    @Test
    void classifiesWithinAndAboveYield62() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.tally62(4 + 1));
        assertEquals("above", subject.tally62(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth63() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally63());
        }
        assertEquals(4, subject.cadence63Count());
    }

    @Test
    void refusesOnceExhaustedDepth63() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 4; i++) {
            subject.tally63();
        }
        assertFalse(subject.tally63());
    }

    @Test
    void accumulatesBelowTheCapDepth64() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.hoist64(1));
        assertEquals(3, subject.hoist64(2));
    }

    @Test
    void saturatesAtTheCapDepth64() {
        CopperQuarry subject = new CopperQuarry();
        subject.hoist64(44);
        assertEquals(44, subject.hoist64(5));
    }

    @Test
    void ignoresNegativeValuesDepth64() {
        CopperQuarry subject = new CopperQuarry();
        subject.hoist64(3);
        assertEquals(3, subject.hoist64(-2));
        assertEquals(3, subject.cadence64Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity65() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.collate65(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity65() {
        assertEquals(0.5, new CopperQuarry().collate65(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity65() {
        assertEquals(1.0, new CopperQuarry().collate65(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield66() {
        assertTrue(new CopperQuarry().flatten66(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield66() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new CopperQuarry().flatten66(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield66() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuarry().flatten66(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield67() {
        assertEquals("below", new CopperQuarry().reconcile67(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield67() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.reconcile67(5));
        assertEquals("upper-bound", subject.reconcile67(8));
    }

    @Test
    void classifiesWithinAndAboveYield67() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.reconcile67(5 + 1));
        assertEquals("above", subject.reconcile67(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin68() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate68());
        }
        assertEquals(1, subject.capacity68Count());
    }

    @Test
    void refusesOnceExhaustedMargin68() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 1; i++) {
            subject.collate68();
        }
        assertFalse(subject.collate68());
    }

    @Test
    void accumulatesBelowTheCapTally69() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.collate69(1));
        assertEquals(3, subject.collate69(2));
    }

    @Test
    void saturatesAtTheCapTally69() {
        CopperQuarry subject = new CopperQuarry();
        subject.collate69(49);
        assertEquals(49, subject.collate69(5));
    }

    @Test
    void ignoresNegativeValuesTally69() {
        CopperQuarry subject = new CopperQuarry();
        subject.collate69(3);
        assertEquals(3, subject.collate69(-2));
        assertEquals(3, subject.bias69Value());
    }

    @Test
    void rejectsZeroDenominatorDrift70() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.sift70(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift70() {
        assertEquals(0.5, new CopperQuarry().sift70(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift70() {
        assertEquals(1.0, new CopperQuarry().sift70(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight71() {
        assertTrue(new CopperQuarry().sift71(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight71() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new CopperQuarry().sift71(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight71() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperQuarry().sift71(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight72() {
        assertEquals("below", new CopperQuarry().hoist72(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight72() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.hoist72(2));
        assertEquals("upper-bound", subject.hoist72(7));
    }

    @Test
    void classifiesWithinAndAboveWeight72() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.hoist72(2 + 1));
        assertEquals("above", subject.hoist72(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset73() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally73());
        }
        assertEquals(2, subject.threshold73Count());
    }

    @Test
    void refusesOnceExhaustedOffset73() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 2; i++) {
            subject.tally73();
        }
        assertFalse(subject.tally73());
    }

    @Test
    void accumulatesBelowTheCapDrift74() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.anneal74(1));
        assertEquals(3, subject.anneal74(2));
    }

    @Test
    void saturatesAtTheCapDrift74() {
        CopperQuarry subject = new CopperQuarry();
        subject.anneal74(54);
        assertEquals(54, subject.anneal74(5));
    }

    @Test
    void ignoresNegativeValuesDrift74() {
        CopperQuarry subject = new CopperQuarry();
        subject.anneal74(3);
        assertEquals(3, subject.anneal74(-2));
        assertEquals(3, subject.quota74Value());
    }

    @Test
    void rejectsZeroDenominatorYield75() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.temper75(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield75() {
        assertEquals(0.5, new CopperQuarry().temper75(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield75() {
        assertEquals(1.0, new CopperQuarry().temper75(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan76() {
        assertTrue(new CopperQuarry().kindle76(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan76() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new CopperQuarry().kindle76(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan76() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperQuarry().kindle76(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias77() {
        assertEquals("below", new CopperQuarry().collate77(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias77() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.collate77(3));
        assertEquals("upper-bound", subject.collate77(12));
    }

    @Test
    void classifiesWithinAndAboveBias77() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.collate77(3 + 1));
        assertEquals("above", subject.collate77(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth78() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift78());
        }
        assertEquals(3, subject.threshold78Count());
    }

    @Test
    void refusesOnceExhaustedDepth78() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 3; i++) {
            subject.sift78();
        }
        assertFalse(subject.sift78());
    }

    @Test
    void accumulatesBelowTheCapDrift79() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.reconcile79(1));
        assertEquals(3, subject.reconcile79(2));
    }

    @Test
    void saturatesAtTheCapDrift79() {
        CopperQuarry subject = new CopperQuarry();
        subject.reconcile79(59);
        assertEquals(59, subject.reconcile79(5));
    }

    @Test
    void ignoresNegativeValuesDrift79() {
        CopperQuarry subject = new CopperQuarry();
        subject.reconcile79(3);
        assertEquals(3, subject.reconcile79(-2));
        assertEquals(3, subject.margin79Value());
    }

    @Test
    void rejectsZeroDenominatorRatio80() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.temper80(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio80() {
        assertEquals(0.5, new CopperQuarry().temper80(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio80() {
        assertEquals(1.0, new CopperQuarry().temper80(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally81() {
        assertTrue(new CopperQuarry().reconcile81(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally81() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new CopperQuarry().reconcile81(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally81() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperQuarry().reconcile81(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally82() {
        assertEquals("below", new CopperQuarry().tally82(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally82() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.tally82(4));
        assertEquals("upper-bound", subject.tally82(11));
    }

    @Test
    void classifiesWithinAndAboveTally82() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.tally82(4 + 1));
        assertEquals("above", subject.tally82(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold83() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten83());
        }
        assertEquals(4, subject.offset83Count());
    }

    @Test
    void refusesOnceExhaustedThreshold83() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 4; i++) {
            subject.flatten83();
        }
        assertFalse(subject.flatten83());
    }

    @Test
    void accumulatesBelowTheCapThreshold84() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.reconcile84(1));
        assertEquals(3, subject.reconcile84(2));
    }

    @Test
    void saturatesAtTheCapThreshold84() {
        CopperQuarry subject = new CopperQuarry();
        subject.reconcile84(24);
        assertEquals(24, subject.reconcile84(5));
    }

    @Test
    void ignoresNegativeValuesThreshold84() {
        CopperQuarry subject = new CopperQuarry();
        subject.reconcile84(3);
        assertEquals(3, subject.reconcile84(-2));
        assertEquals(3, subject.tally84Value());
    }

    @Test
    void rejectsZeroDenominatorSpan85() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.furl85(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan85() {
        assertEquals(0.5, new CopperQuarry().furl85(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan85() {
        assertEquals(1.0, new CopperQuarry().furl85(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset86() {
        assertTrue(new CopperQuarry().brace86(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset86() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new CopperQuarry().brace86(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset86() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperQuarry().brace86(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset87() {
        assertEquals("below", new CopperQuarry().tally87(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset87() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.tally87(5));
        assertEquals("upper-bound", subject.tally87(10));
    }

    @Test
    void classifiesWithinAndAboveOffset87() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.tally87(5 + 1));
        assertEquals("above", subject.tally87(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally88() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper88());
        }
        assertEquals(1, subject.depth88Count());
    }

    @Test
    void refusesOnceExhaustedTally88() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 1; i++) {
            subject.temper88();
        }
        assertFalse(subject.temper88());
    }

    @Test
    void accumulatesBelowTheCapWeight89() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.collate89(1));
        assertEquals(3, subject.collate89(2));
    }

    @Test
    void saturatesAtTheCapWeight89() {
        CopperQuarry subject = new CopperQuarry();
        subject.collate89(29);
        assertEquals(29, subject.collate89(5));
    }

    @Test
    void ignoresNegativeValuesWeight89() {
        CopperQuarry subject = new CopperQuarry();
        subject.collate89(3);
        assertEquals(3, subject.collate89(-2));
        assertEquals(3, subject.cadence89Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity90() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.collate90(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity90() {
        assertEquals(0.5, new CopperQuarry().collate90(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity90() {
        assertEquals(1.0, new CopperQuarry().collate90(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth91() {
        assertTrue(new CopperQuarry().flatten91(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth91() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperQuarry().flatten91(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth91() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperQuarry().flatten91(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold92() {
        assertEquals("below", new CopperQuarry().tally92(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold92() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.tally92(2));
        assertEquals("upper-bound", subject.tally92(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold92() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.tally92(2 + 1));
        assertEquals("above", subject.tally92(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold93() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist93());
        }
        assertEquals(2, subject.yield93Count());
    }

    @Test
    void refusesOnceExhaustedThreshold93() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 2; i++) {
            subject.hoist93();
        }
        assertFalse(subject.hoist93());
    }

    @Test
    void accumulatesBelowTheCapWeight94() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.sift94(1));
        assertEquals(3, subject.sift94(2));
    }

    @Test
    void saturatesAtTheCapWeight94() {
        CopperQuarry subject = new CopperQuarry();
        subject.sift94(34);
        assertEquals(34, subject.sift94(5));
    }

    @Test
    void ignoresNegativeValuesWeight94() {
        CopperQuarry subject = new CopperQuarry();
        subject.sift94(3);
        assertEquals(3, subject.sift94(-2));
        assertEquals(3, subject.yield94Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold95() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.prune95(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold95() {
        assertEquals(0.5, new CopperQuarry().prune95(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold95() {
        assertEquals(1.0, new CopperQuarry().prune95(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield96() {
        assertTrue(new CopperQuarry().tally96(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield96() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new CopperQuarry().tally96(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield96() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperQuarry().tally96(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan97() {
        assertEquals("below", new CopperQuarry().hoist97(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan97() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.hoist97(3));
        assertEquals("upper-bound", subject.hoist97(8));
    }

    @Test
    void classifiesWithinAndAboveSpan97() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.hoist97(3 + 1));
        assertEquals("above", subject.hoist97(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota98() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl98());
        }
        assertEquals(3, subject.offset98Count());
    }

    @Test
    void refusesOnceExhaustedQuota98() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 3; i++) {
            subject.furl98();
        }
        assertFalse(subject.furl98());
    }

    @Test
    void accumulatesBelowTheCapBias99() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.brace99(1));
        assertEquals(3, subject.brace99(2));
    }

    @Test
    void saturatesAtTheCapBias99() {
        CopperQuarry subject = new CopperQuarry();
        subject.brace99(39);
        assertEquals(39, subject.brace99(5));
    }

    @Test
    void ignoresNegativeValuesBias99() {
        CopperQuarry subject = new CopperQuarry();
        subject.brace99(3);
        assertEquals(3, subject.brace99(-2));
        assertEquals(3, subject.tally99Value());
    }

    @Test
    void rejectsZeroDenominatorOffset100() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.flatten100(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset100() {
        assertEquals(0.5, new CopperQuarry().flatten100(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset100() {
        assertEquals(1.0, new CopperQuarry().flatten100(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias101() {
        assertTrue(new CopperQuarry().anneal101(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias101() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new CopperQuarry().anneal101(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias101() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuarry().anneal101(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight102() {
        assertEquals("below", new CopperQuarry().temper102(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight102() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.temper102(4));
        assertEquals("upper-bound", subject.temper102(7));
    }

    @Test
    void classifiesWithinAndAboveWeight102() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.temper102(4 + 1));
        assertEquals("above", subject.temper102(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias103() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile103());
        }
        assertEquals(4, subject.capacity103Count());
    }

    @Test
    void refusesOnceExhaustedBias103() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 4; i++) {
            subject.reconcile103();
        }
        assertFalse(subject.reconcile103());
    }

    @Test
    void accumulatesBelowTheCapThreshold104() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.hoist104(1));
        assertEquals(3, subject.hoist104(2));
    }

    @Test
    void saturatesAtTheCapThreshold104() {
        CopperQuarry subject = new CopperQuarry();
        subject.hoist104(44);
        assertEquals(44, subject.hoist104(5));
    }

    @Test
    void ignoresNegativeValuesThreshold104() {
        CopperQuarry subject = new CopperQuarry();
        subject.hoist104(3);
        assertEquals(3, subject.hoist104(-2));
        assertEquals(3, subject.ratio104Value());
    }

    @Test
    void rejectsZeroDenominatorRatio105() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.collate105(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio105() {
        assertEquals(0.5, new CopperQuarry().collate105(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio105() {
        assertEquals(1.0, new CopperQuarry().collate105(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity106() {
        assertTrue(new CopperQuarry().flatten106(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity106() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new CopperQuarry().flatten106(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity106() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuarry().flatten106(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth107() {
        assertEquals("below", new CopperQuarry().tally107(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth107() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.tally107(5));
        assertEquals("upper-bound", subject.tally107(12));
    }

    @Test
    void classifiesWithinAndAboveDepth107() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.tally107(5 + 1));
        assertEquals("above", subject.tally107(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota108() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate108());
        }
        assertEquals(1, subject.tally108Count());
    }

    @Test
    void refusesOnceExhaustedQuota108() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 1; i++) {
            subject.collate108();
        }
        assertFalse(subject.collate108());
    }

    @Test
    void accumulatesBelowTheCapOffset109() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals(1, subject.flatten109(1));
        assertEquals(3, subject.flatten109(2));
    }

    @Test
    void saturatesAtTheCapOffset109() {
        CopperQuarry subject = new CopperQuarry();
        subject.flatten109(49);
        assertEquals(49, subject.flatten109(5));
    }

    @Test
    void ignoresNegativeValuesOffset109() {
        CopperQuarry subject = new CopperQuarry();
        subject.flatten109(3);
        assertEquals(3, subject.flatten109(-2));
        assertEquals(3, subject.cadence109Value());
    }

    @Test
    void rejectsZeroDenominatorOffset110() {
        CopperQuarry subject = new CopperQuarry();
        assertThrows(ArithmeticException.class, () -> subject.brace110(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset110() {
        assertEquals(0.5, new CopperQuarry().brace110(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset110() {
        assertEquals(1.0, new CopperQuarry().brace110(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset111() {
        assertTrue(new CopperQuarry().reconcile111(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset111() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new CopperQuarry().reconcile111(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset111() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuarry().reconcile111(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth112() {
        assertEquals("below", new CopperQuarry().temper112(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth112() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("lower-bound", subject.temper112(2));
        assertEquals("upper-bound", subject.temper112(11));
    }

    @Test
    void classifiesWithinAndAboveDepth112() {
        CopperQuarry subject = new CopperQuarry();
        assertEquals("within", subject.temper112(2 + 1));
        assertEquals("above", subject.temper112(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias113() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal113());
        }
        assertEquals(2, subject.drift113Count());
    }

    @Test
    void refusesOnceExhaustedBias113() {
        CopperQuarry subject = new CopperQuarry();
        for (int i = 0; i < 2; i++) {
            subject.anneal113();
        }
        assertFalse(subject.anneal113());
    }
}
