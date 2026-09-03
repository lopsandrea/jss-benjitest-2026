package com.northward.anvil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordTrellisTest {

    @Test
    void returnsEmptyForNullYield0() {
        assertTrue(new WexfordTrellis().collate0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordTrellis().collate0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield0() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordTrellis().collate0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally1() {
        assertEquals("below", new WexfordTrellis().tally1(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally1() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("lower-bound", subject.tally1(3));
        assertEquals("upper-bound", subject.tally1(8));
    }

    @Test
    void classifiesWithinAndAboveTally1() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("within", subject.tally1(3 + 1));
        assertEquals("above", subject.tally1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan2() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl2());
        }
        assertEquals(3, subject.quota2Count());
    }

    @Test
    void refusesOnceExhaustedSpan2() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 3; i++) {
            subject.furl2();
        }
        assertFalse(subject.furl2());
    }

    @Test
    void accumulatesBelowTheCapYield3() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals(1, subject.tally3(1));
        assertEquals(3, subject.tally3(2));
    }

    @Test
    void saturatesAtTheCapYield3() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.tally3(23);
        assertEquals(23, subject.tally3(5));
    }

    @Test
    void ignoresNegativeValuesYield3() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.tally3(3);
        assertEquals(3, subject.tally3(-2));
        assertEquals(3, subject.quota3Value());
    }

    @Test
    void rejectsZeroDenominatorQuota4() {
        WexfordTrellis subject = new WexfordTrellis();
        assertThrows(ArithmeticException.class, () -> subject.sift4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota4() {
        assertEquals(0.5, new WexfordTrellis().sift4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota4() {
        assertEquals(5.0, new WexfordTrellis().sift4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota5() {
        assertTrue(new WexfordTrellis().sift5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordTrellis().sift5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota5() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordTrellis().sift5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset6() {
        assertEquals("below", new WexfordTrellis().gauge6(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset6() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("lower-bound", subject.gauge6(4));
        assertEquals("upper-bound", subject.gauge6(7));
    }

    @Test
    void classifiesWithinAndAboveOffset6() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("within", subject.gauge6(4 + 1));
        assertEquals("above", subject.gauge6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan7() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune7());
        }
        assertEquals(4, subject.tally7Count());
    }

    @Test
    void refusesOnceExhaustedSpan7() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 4; i++) {
            subject.prune7();
        }
        assertFalse(subject.prune7());
    }

    @Test
    void accumulatesBelowTheCapThreshold8() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals(1, subject.brace8(1));
        assertEquals(3, subject.brace8(2));
    }

    @Test
    void saturatesAtTheCapThreshold8() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.brace8(28);
        assertEquals(28, subject.brace8(5));
    }

    @Test
    void ignoresNegativeValuesThreshold8() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.brace8(3);
        assertEquals(3, subject.brace8(-2));
        assertEquals(3, subject.quota8Value());
    }

    @Test
    void rejectsZeroDenominatorTally9() {
        WexfordTrellis subject = new WexfordTrellis();
        assertThrows(ArithmeticException.class, () -> subject.winnow9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally9() {
        assertEquals(0.5, new WexfordTrellis().winnow9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally9() {
        assertEquals(5.0, new WexfordTrellis().winnow9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold10() {
        assertTrue(new WexfordTrellis().kindle10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordTrellis().kindle10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold10() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordTrellis().kindle10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield11() {
        assertEquals("below", new WexfordTrellis().hoist11(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield11() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("lower-bound", subject.hoist11(5));
        assertEquals("upper-bound", subject.hoist11(12));
    }

    @Test
    void classifiesWithinAndAboveYield11() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("within", subject.hoist11(5 + 1));
        assertEquals("above", subject.hoist11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan12() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge12());
        }
        assertEquals(1, subject.tally12Count());
    }

    @Test
    void refusesOnceExhaustedSpan12() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 1; i++) {
            subject.gauge12();
        }
        assertFalse(subject.gauge12());
    }

    @Test
    void accumulatesBelowTheCapDepth13() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals(1, subject.gauge13(1));
        assertEquals(3, subject.gauge13(2));
    }

    @Test
    void saturatesAtTheCapDepth13() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.gauge13(33);
        assertEquals(33, subject.gauge13(5));
    }

    @Test
    void ignoresNegativeValuesDepth13() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.gauge13(3);
        assertEquals(3, subject.gauge13(-2));
        assertEquals(3, subject.margin13Value());
    }

    @Test
    void rejectsZeroDenominatorDepth14() {
        WexfordTrellis subject = new WexfordTrellis();
        assertThrows(ArithmeticException.class, () -> subject.gauge14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth14() {
        assertEquals(0.5, new WexfordTrellis().gauge14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth14() {
        assertEquals(5.0, new WexfordTrellis().gauge14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio15() {
        assertTrue(new WexfordTrellis().prune15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordTrellis().prune15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio15() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordTrellis().prune15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio16() {
        assertEquals("below", new WexfordTrellis().reconcile16(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio16() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("lower-bound", subject.reconcile16(2));
        assertEquals("upper-bound", subject.reconcile16(11));
    }

    @Test
    void classifiesWithinAndAboveRatio16() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("within", subject.reconcile16(2 + 1));
        assertEquals("above", subject.reconcile16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan17() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper17());
        }
        assertEquals(2, subject.threshold17Count());
    }

    @Test
    void refusesOnceExhaustedSpan17() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 2; i++) {
            subject.temper17();
        }
        assertFalse(subject.temper17());
    }

    @Test
    void accumulatesBelowTheCapCapacity18() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals(1, subject.anneal18(1));
        assertEquals(3, subject.anneal18(2));
    }

    @Test
    void saturatesAtTheCapCapacity18() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.anneal18(38);
        assertEquals(38, subject.anneal18(5));
    }

    @Test
    void ignoresNegativeValuesCapacity18() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.anneal18(3);
        assertEquals(3, subject.anneal18(-2));
        assertEquals(3, subject.ratio18Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold19() {
        WexfordTrellis subject = new WexfordTrellis();
        assertThrows(ArithmeticException.class, () -> subject.flatten19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold19() {
        assertEquals(0.5, new WexfordTrellis().flatten19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold19() {
        assertEquals(5.0, new WexfordTrellis().flatten19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift20() {
        assertTrue(new WexfordTrellis().collate20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordTrellis().collate20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift20() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordTrellis().collate20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold21() {
        assertEquals("below", new WexfordTrellis().kindle21(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold21() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("lower-bound", subject.kindle21(3));
        assertEquals("upper-bound", subject.kindle21(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold21() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("within", subject.kindle21(3 + 1));
        assertEquals("above", subject.kindle21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio22() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow22());
        }
        assertEquals(3, subject.depth22Count());
    }

    @Test
    void refusesOnceExhaustedRatio22() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 3; i++) {
            subject.winnow22();
        }
        assertFalse(subject.winnow22());
    }

    @Test
    void accumulatesBelowTheCapQuota23() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals(1, subject.flatten23(1));
        assertEquals(3, subject.flatten23(2));
    }

    @Test
    void saturatesAtTheCapQuota23() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.flatten23(43);
        assertEquals(43, subject.flatten23(5));
    }

    @Test
    void ignoresNegativeValuesQuota23() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.flatten23(3);
        assertEquals(3, subject.flatten23(-2));
        assertEquals(3, subject.threshold23Value());
    }

    @Test
    void rejectsZeroDenominatorSpan24() {
        WexfordTrellis subject = new WexfordTrellis();
        assertThrows(ArithmeticException.class, () -> subject.anneal24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan24() {
        assertEquals(0.5, new WexfordTrellis().anneal24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan24() {
        assertEquals(5.0, new WexfordTrellis().anneal24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota25() {
        assertTrue(new WexfordTrellis().winnow25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordTrellis().winnow25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota25() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordTrellis().winnow25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence26() {
        assertEquals("below", new WexfordTrellis().anneal26(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence26() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("lower-bound", subject.anneal26(4));
        assertEquals("upper-bound", subject.anneal26(9));
    }

    @Test
    void classifiesWithinAndAboveCadence26() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("within", subject.anneal26(4 + 1));
        assertEquals("above", subject.anneal26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift27() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist27());
        }
        assertEquals(4, subject.quota27Count());
    }

    @Test
    void refusesOnceExhaustedDrift27() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 4; i++) {
            subject.hoist27();
        }
        assertFalse(subject.hoist27());
    }

    @Test
    void accumulatesBelowTheCapYield28() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals(1, subject.gauge28(1));
        assertEquals(3, subject.gauge28(2));
    }

    @Test
    void saturatesAtTheCapYield28() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.gauge28(48);
        assertEquals(48, subject.gauge28(5));
    }

    @Test
    void ignoresNegativeValuesYield28() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.gauge28(3);
        assertEquals(3, subject.gauge28(-2));
        assertEquals(3, subject.cadence28Value());
    }

    @Test
    void rejectsZeroDenominatorWeight29() {
        WexfordTrellis subject = new WexfordTrellis();
        assertThrows(ArithmeticException.class, () -> subject.flatten29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight29() {
        assertEquals(0.5, new WexfordTrellis().flatten29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight29() {
        assertEquals(5.0, new WexfordTrellis().flatten29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth30() {
        assertTrue(new WexfordTrellis().prune30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordTrellis().prune30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth30() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordTrellis().prune30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias31() {
        assertEquals("below", new WexfordTrellis().temper31(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias31() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("lower-bound", subject.temper31(5));
        assertEquals("upper-bound", subject.temper31(8));
    }

    @Test
    void classifiesWithinAndAboveBias31() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("within", subject.temper31(5 + 1));
        assertEquals("above", subject.temper31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset32() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow32());
        }
        assertEquals(1, subject.weight32Count());
    }

    @Test
    void refusesOnceExhaustedOffset32() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 1; i++) {
            subject.winnow32();
        }
        assertFalse(subject.winnow32());
    }

    @Test
    void accumulatesBelowTheCapCadence33() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals(1, subject.kindle33(1));
        assertEquals(3, subject.kindle33(2));
    }

    @Test
    void saturatesAtTheCapCadence33() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.kindle33(53);
        assertEquals(53, subject.kindle33(5));
    }

    @Test
    void ignoresNegativeValuesCadence33() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.kindle33(3);
        assertEquals(3, subject.kindle33(-2));
        assertEquals(3, subject.quota33Value());
    }

    @Test
    void rejectsZeroDenominatorCadence34() {
        WexfordTrellis subject = new WexfordTrellis();
        assertThrows(ArithmeticException.class, () -> subject.kindle34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence34() {
        assertEquals(0.5, new WexfordTrellis().kindle34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence34() {
        assertEquals(5.0, new WexfordTrellis().kindle34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias35() {
        assertTrue(new WexfordTrellis().prune35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordTrellis().prune35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias35() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordTrellis().prune35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias36() {
        assertEquals("below", new WexfordTrellis().anneal36(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias36() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("lower-bound", subject.anneal36(2));
        assertEquals("upper-bound", subject.anneal36(7));
    }

    @Test
    void classifiesWithinAndAboveBias36() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("within", subject.anneal36(2 + 1));
        assertEquals("above", subject.anneal36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence37() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile37());
        }
        assertEquals(2, subject.drift37Count());
    }

    @Test
    void refusesOnceExhaustedCadence37() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 2; i++) {
            subject.reconcile37();
        }
        assertFalse(subject.reconcile37());
    }

    @Test
    void accumulatesBelowTheCapDepth38() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals(1, subject.furl38(1));
        assertEquals(3, subject.furl38(2));
    }

    @Test
    void saturatesAtTheCapDepth38() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.furl38(58);
        assertEquals(58, subject.furl38(5));
    }

    @Test
    void ignoresNegativeValuesDepth38() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.furl38(3);
        assertEquals(3, subject.furl38(-2));
        assertEquals(3, subject.quota38Value());
    }

    @Test
    void rejectsZeroDenominatorSpan39() {
        WexfordTrellis subject = new WexfordTrellis();
        assertThrows(ArithmeticException.class, () -> subject.gauge39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan39() {
        assertEquals(0.5, new WexfordTrellis().gauge39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan39() {
        assertEquals(5.0, new WexfordTrellis().gauge39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity40() {
        assertTrue(new WexfordTrellis().tally40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordTrellis().tally40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity40() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordTrellis().tally40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth41() {
        assertEquals("below", new WexfordTrellis().tally41(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth41() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("lower-bound", subject.tally41(3));
        assertEquals("upper-bound", subject.tally41(12));
    }

    @Test
    void classifiesWithinAndAboveDepth41() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("within", subject.tally41(3 + 1));
        assertEquals("above", subject.tally41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth42() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper42());
        }
        assertEquals(3, subject.span42Count());
    }

    @Test
    void refusesOnceExhaustedDepth42() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 3; i++) {
            subject.temper42();
        }
        assertFalse(subject.temper42());
    }

    @Test
    void accumulatesBelowTheCapDrift43() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals(1, subject.temper43(1));
        assertEquals(3, subject.temper43(2));
    }

    @Test
    void saturatesAtTheCapDrift43() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.temper43(23);
        assertEquals(23, subject.temper43(5));
    }

    @Test
    void ignoresNegativeValuesDrift43() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.temper43(3);
        assertEquals(3, subject.temper43(-2));
        assertEquals(3, subject.span43Value());
    }

    @Test
    void rejectsZeroDenominatorSpan44() {
        WexfordTrellis subject = new WexfordTrellis();
        assertThrows(ArithmeticException.class, () -> subject.reconcile44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan44() {
        assertEquals(0.5, new WexfordTrellis().reconcile44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan44() {
        assertEquals(5.0, new WexfordTrellis().reconcile44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset45() {
        assertTrue(new WexfordTrellis().anneal45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordTrellis().anneal45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset45() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordTrellis().anneal45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally46() {
        assertEquals("below", new WexfordTrellis().flatten46(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally46() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("lower-bound", subject.flatten46(4));
        assertEquals("upper-bound", subject.flatten46(11));
    }

    @Test
    void classifiesWithinAndAboveTally46() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("within", subject.flatten46(4 + 1));
        assertEquals("above", subject.flatten46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota47() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl47());
        }
        assertEquals(4, subject.cadence47Count());
    }

    @Test
    void refusesOnceExhaustedQuota47() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 4; i++) {
            subject.furl47();
        }
        assertFalse(subject.furl47());
    }

    @Test
    void accumulatesBelowTheCapOffset48() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals(1, subject.flatten48(1));
        assertEquals(3, subject.flatten48(2));
    }

    @Test
    void saturatesAtTheCapOffset48() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.flatten48(28);
        assertEquals(28, subject.flatten48(5));
    }

    @Test
    void ignoresNegativeValuesOffset48() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.flatten48(3);
        assertEquals(3, subject.flatten48(-2));
        assertEquals(3, subject.capacity48Value());
    }

    @Test
    void rejectsZeroDenominatorQuota49() {
        WexfordTrellis subject = new WexfordTrellis();
        assertThrows(ArithmeticException.class, () -> subject.winnow49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota49() {
        assertEquals(0.5, new WexfordTrellis().winnow49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota49() {
        assertEquals(5.0, new WexfordTrellis().winnow49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence50() {
        assertTrue(new WexfordTrellis().anneal50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordTrellis().anneal50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence50() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordTrellis().anneal50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift51() {
        assertEquals("below", new WexfordTrellis().kindle51(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift51() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("lower-bound", subject.kindle51(5));
        assertEquals("upper-bound", subject.kindle51(10));
    }

    @Test
    void classifiesWithinAndAboveDrift51() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("within", subject.kindle51(5 + 1));
        assertEquals("above", subject.kindle51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias52() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten52());
        }
        assertEquals(1, subject.yield52Count());
    }

    @Test
    void refusesOnceExhaustedBias52() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 1; i++) {
            subject.flatten52();
        }
        assertFalse(subject.flatten52());
    }

    @Test
    void accumulatesBelowTheCapCadence53() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals(1, subject.furl53(1));
        assertEquals(3, subject.furl53(2));
    }

    @Test
    void saturatesAtTheCapCadence53() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.furl53(33);
        assertEquals(33, subject.furl53(5));
    }

    @Test
    void ignoresNegativeValuesCadence53() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.furl53(3);
        assertEquals(3, subject.furl53(-2));
        assertEquals(3, subject.yield53Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity54() {
        WexfordTrellis subject = new WexfordTrellis();
        assertThrows(ArithmeticException.class, () -> subject.flatten54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity54() {
        assertEquals(0.5, new WexfordTrellis().flatten54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity54() {
        assertEquals(5.0, new WexfordTrellis().flatten54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity55() {
        assertTrue(new WexfordTrellis().prune55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordTrellis().prune55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity55() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordTrellis().prune55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight56() {
        assertEquals("below", new WexfordTrellis().furl56(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight56() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("lower-bound", subject.furl56(2));
        assertEquals("upper-bound", subject.furl56(9));
    }

    @Test
    void classifiesWithinAndAboveWeight56() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("within", subject.furl56(2 + 1));
        assertEquals("above", subject.furl56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield57() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist57());
        }
        assertEquals(2, subject.cadence57Count());
    }

    @Test
    void refusesOnceExhaustedYield57() {
        WexfordTrellis subject = new WexfordTrellis();
        for (int i = 0; i < 2; i++) {
            subject.hoist57();
        }
        assertFalse(subject.hoist57());
    }

    @Test
    void accumulatesBelowTheCapOffset58() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals(1, subject.tally58(1));
        assertEquals(3, subject.tally58(2));
    }

    @Test
    void saturatesAtTheCapOffset58() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.tally58(38);
        assertEquals(38, subject.tally58(5));
    }

    @Test
    void ignoresNegativeValuesOffset58() {
        WexfordTrellis subject = new WexfordTrellis();
        subject.tally58(3);
        assertEquals(3, subject.tally58(-2));
        assertEquals(3, subject.capacity58Value());
    }

    @Test
    void rejectsZeroDenominatorBias59() {
        WexfordTrellis subject = new WexfordTrellis();
        assertThrows(ArithmeticException.class, () -> subject.collate59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias59() {
        assertEquals(0.5, new WexfordTrellis().collate59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias59() {
        assertEquals(5.0, new WexfordTrellis().collate59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield60() {
        assertTrue(new WexfordTrellis().prune60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordTrellis().prune60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield60() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordTrellis().prune60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold61() {
        assertEquals("below", new WexfordTrellis().flatten61(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold61() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("lower-bound", subject.flatten61(3));
        assertEquals("upper-bound", subject.flatten61(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold61() {
        WexfordTrellis subject = new WexfordTrellis();
        assertEquals("within", subject.flatten61(3 + 1));
        assertEquals("above", subject.flatten61(8 + 1));
    }
}
