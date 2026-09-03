package com.slate.spindle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperFurrowTest {

    @Test
    void rejectsZeroDenominatorWeight0() {
        CopperFurrow subject = new CopperFurrow();
        assertThrows(ArithmeticException.class, () -> subject.sift0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight0() {
        assertEquals(0.5, new CopperFurrow().sift0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight0() {
        assertEquals(1.0, new CopperFurrow().sift0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally1() {
        assertTrue(new CopperFurrow().flatten1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperFurrow().flatten1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally1() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperFurrow().flatten1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally2() {
        assertEquals("below", new CopperFurrow().winnow2(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally2() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("lower-bound", subject.winnow2(4));
        assertEquals("upper-bound", subject.winnow2(9));
    }

    @Test
    void classifiesWithinAndAboveTally2() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("within", subject.winnow2(4 + 1));
        assertEquals("above", subject.winnow2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota3() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile3());
        }
        assertEquals(4, subject.offset3Count());
    }

    @Test
    void refusesOnceExhaustedQuota3() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 4; i++) {
            subject.reconcile3();
        }
        assertFalse(subject.reconcile3());
    }

    @Test
    void accumulatesBelowTheCapDrift4() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals(1, subject.sift4(1));
        assertEquals(3, subject.sift4(2));
    }

    @Test
    void saturatesAtTheCapDrift4() {
        CopperFurrow subject = new CopperFurrow();
        subject.sift4(24);
        assertEquals(24, subject.sift4(5));
    }

    @Test
    void ignoresNegativeValuesDrift4() {
        CopperFurrow subject = new CopperFurrow();
        subject.sift4(3);
        assertEquals(3, subject.sift4(-2));
        assertEquals(3, subject.quota4Value());
    }

    @Test
    void rejectsZeroDenominatorSpan5() {
        CopperFurrow subject = new CopperFurrow();
        assertThrows(ArithmeticException.class, () -> subject.hoist5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan5() {
        assertEquals(0.5, new CopperFurrow().hoist5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan5() {
        assertEquals(1.0, new CopperFurrow().hoist5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity6() {
        assertTrue(new CopperFurrow().sift6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new CopperFurrow().sift6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity6() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperFurrow().sift6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio7() {
        assertEquals("below", new CopperFurrow().hoist7(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio7() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("lower-bound", subject.hoist7(5));
        assertEquals("upper-bound", subject.hoist7(8));
    }

    @Test
    void classifiesWithinAndAboveRatio7() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("within", subject.hoist7(5 + 1));
        assertEquals("above", subject.hoist7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield8() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune8());
        }
        assertEquals(1, subject.offset8Count());
    }

    @Test
    void refusesOnceExhaustedYield8() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 1; i++) {
            subject.prune8();
        }
        assertFalse(subject.prune8());
    }

    @Test
    void accumulatesBelowTheCapYield9() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals(1, subject.anneal9(1));
        assertEquals(3, subject.anneal9(2));
    }

    @Test
    void saturatesAtTheCapYield9() {
        CopperFurrow subject = new CopperFurrow();
        subject.anneal9(29);
        assertEquals(29, subject.anneal9(5));
    }

    @Test
    void ignoresNegativeValuesYield9() {
        CopperFurrow subject = new CopperFurrow();
        subject.anneal9(3);
        assertEquals(3, subject.anneal9(-2));
        assertEquals(3, subject.quota9Value());
    }

    @Test
    void rejectsZeroDenominatorRatio10() {
        CopperFurrow subject = new CopperFurrow();
        assertThrows(ArithmeticException.class, () -> subject.temper10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio10() {
        assertEquals(0.5, new CopperFurrow().temper10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio10() {
        assertEquals(1.0, new CopperFurrow().temper10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset11() {
        assertTrue(new CopperFurrow().reconcile11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new CopperFurrow().reconcile11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset11() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperFurrow().reconcile11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield12() {
        assertEquals("below", new CopperFurrow().winnow12(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield12() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("lower-bound", subject.winnow12(2));
        assertEquals("upper-bound", subject.winnow12(7));
    }

    @Test
    void classifiesWithinAndAboveYield12() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("within", subject.winnow12(2 + 1));
        assertEquals("above", subject.winnow12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold13() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl13());
        }
        assertEquals(2, subject.weight13Count());
    }

    @Test
    void refusesOnceExhaustedThreshold13() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 2; i++) {
            subject.furl13();
        }
        assertFalse(subject.furl13());
    }

    @Test
    void accumulatesBelowTheCapBias14() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals(1, subject.kindle14(1));
        assertEquals(3, subject.kindle14(2));
    }

    @Test
    void saturatesAtTheCapBias14() {
        CopperFurrow subject = new CopperFurrow();
        subject.kindle14(34);
        assertEquals(34, subject.kindle14(5));
    }

    @Test
    void ignoresNegativeValuesBias14() {
        CopperFurrow subject = new CopperFurrow();
        subject.kindle14(3);
        assertEquals(3, subject.kindle14(-2));
        assertEquals(3, subject.threshold14Value());
    }

    @Test
    void rejectsZeroDenominatorQuota15() {
        CopperFurrow subject = new CopperFurrow();
        assertThrows(ArithmeticException.class, () -> subject.temper15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota15() {
        assertEquals(0.5, new CopperFurrow().temper15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota15() {
        assertEquals(1.0, new CopperFurrow().temper15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift16() {
        assertTrue(new CopperFurrow().sift16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new CopperFurrow().sift16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift16() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperFurrow().sift16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally17() {
        assertEquals("below", new CopperFurrow().sift17(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally17() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("lower-bound", subject.sift17(3));
        assertEquals("upper-bound", subject.sift17(12));
    }

    @Test
    void classifiesWithinAndAboveTally17() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("within", subject.sift17(3 + 1));
        assertEquals("above", subject.sift17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift18() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift18());
        }
        assertEquals(3, subject.bias18Count());
    }

    @Test
    void refusesOnceExhaustedDrift18() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 3; i++) {
            subject.sift18();
        }
        assertFalse(subject.sift18());
    }

    @Test
    void accumulatesBelowTheCapYield19() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals(1, subject.tally19(1));
        assertEquals(3, subject.tally19(2));
    }

    @Test
    void saturatesAtTheCapYield19() {
        CopperFurrow subject = new CopperFurrow();
        subject.tally19(39);
        assertEquals(39, subject.tally19(5));
    }

    @Test
    void ignoresNegativeValuesYield19() {
        CopperFurrow subject = new CopperFurrow();
        subject.tally19(3);
        assertEquals(3, subject.tally19(-2));
        assertEquals(3, subject.cadence19Value());
    }

    @Test
    void rejectsZeroDenominatorDepth20() {
        CopperFurrow subject = new CopperFurrow();
        assertThrows(ArithmeticException.class, () -> subject.winnow20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth20() {
        assertEquals(0.5, new CopperFurrow().winnow20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth20() {
        assertEquals(1.0, new CopperFurrow().winnow20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift21() {
        assertTrue(new CopperFurrow().temper21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new CopperFurrow().temper21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift21() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperFurrow().temper21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity22() {
        assertEquals("below", new CopperFurrow().tally22(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity22() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("lower-bound", subject.tally22(4));
        assertEquals("upper-bound", subject.tally22(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity22() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("within", subject.tally22(4 + 1));
        assertEquals("above", subject.tally22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset23() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune23());
        }
        assertEquals(4, subject.capacity23Count());
    }

    @Test
    void refusesOnceExhaustedOffset23() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 4; i++) {
            subject.prune23();
        }
        assertFalse(subject.prune23());
    }

    @Test
    void accumulatesBelowTheCapCadence24() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals(1, subject.furl24(1));
        assertEquals(3, subject.furl24(2));
    }

    @Test
    void saturatesAtTheCapCadence24() {
        CopperFurrow subject = new CopperFurrow();
        subject.furl24(44);
        assertEquals(44, subject.furl24(5));
    }

    @Test
    void ignoresNegativeValuesCadence24() {
        CopperFurrow subject = new CopperFurrow();
        subject.furl24(3);
        assertEquals(3, subject.furl24(-2));
        assertEquals(3, subject.tally24Value());
    }

    @Test
    void rejectsZeroDenominatorSpan25() {
        CopperFurrow subject = new CopperFurrow();
        assertThrows(ArithmeticException.class, () -> subject.brace25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan25() {
        assertEquals(0.5, new CopperFurrow().brace25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan25() {
        assertEquals(1.0, new CopperFurrow().brace25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset26() {
        assertTrue(new CopperFurrow().gauge26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new CopperFurrow().gauge26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset26() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperFurrow().gauge26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota27() {
        assertEquals("below", new CopperFurrow().kindle27(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota27() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("lower-bound", subject.kindle27(5));
        assertEquals("upper-bound", subject.kindle27(10));
    }

    @Test
    void classifiesWithinAndAboveQuota27() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("within", subject.kindle27(5 + 1));
        assertEquals("above", subject.kindle27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield28() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist28());
        }
        assertEquals(1, subject.capacity28Count());
    }

    @Test
    void refusesOnceExhaustedYield28() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 1; i++) {
            subject.hoist28();
        }
        assertFalse(subject.hoist28());
    }

    @Test
    void accumulatesBelowTheCapMargin29() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals(1, subject.gauge29(1));
        assertEquals(3, subject.gauge29(2));
    }

    @Test
    void saturatesAtTheCapMargin29() {
        CopperFurrow subject = new CopperFurrow();
        subject.gauge29(49);
        assertEquals(49, subject.gauge29(5));
    }

    @Test
    void ignoresNegativeValuesMargin29() {
        CopperFurrow subject = new CopperFurrow();
        subject.gauge29(3);
        assertEquals(3, subject.gauge29(-2));
        assertEquals(3, subject.cadence29Value());
    }

    @Test
    void rejectsZeroDenominatorDepth30() {
        CopperFurrow subject = new CopperFurrow();
        assertThrows(ArithmeticException.class, () -> subject.prune30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth30() {
        assertEquals(0.5, new CopperFurrow().prune30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth30() {
        assertEquals(1.0, new CopperFurrow().prune30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield31() {
        assertTrue(new CopperFurrow().collate31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new CopperFurrow().collate31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield31() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperFurrow().collate31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin32() {
        assertEquals("below", new CopperFurrow().reconcile32(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin32() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("lower-bound", subject.reconcile32(2));
        assertEquals("upper-bound", subject.reconcile32(9));
    }

    @Test
    void classifiesWithinAndAboveMargin32() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("within", subject.reconcile32(2 + 1));
        assertEquals("above", subject.reconcile32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset33() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist33());
        }
        assertEquals(2, subject.span33Count());
    }

    @Test
    void refusesOnceExhaustedOffset33() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 2; i++) {
            subject.hoist33();
        }
        assertFalse(subject.hoist33());
    }

    @Test
    void accumulatesBelowTheCapCapacity34() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals(1, subject.sift34(1));
        assertEquals(3, subject.sift34(2));
    }

    @Test
    void saturatesAtTheCapCapacity34() {
        CopperFurrow subject = new CopperFurrow();
        subject.sift34(54);
        assertEquals(54, subject.sift34(5));
    }

    @Test
    void ignoresNegativeValuesCapacity34() {
        CopperFurrow subject = new CopperFurrow();
        subject.sift34(3);
        assertEquals(3, subject.sift34(-2));
        assertEquals(3, subject.depth34Value());
    }

    @Test
    void rejectsZeroDenominatorOffset35() {
        CopperFurrow subject = new CopperFurrow();
        assertThrows(ArithmeticException.class, () -> subject.gauge35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset35() {
        assertEquals(0.5, new CopperFurrow().gauge35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset35() {
        assertEquals(1.0, new CopperFurrow().gauge35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth36() {
        assertTrue(new CopperFurrow().sift36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new CopperFurrow().sift36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth36() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperFurrow().sift36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally37() {
        assertEquals("below", new CopperFurrow().temper37(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally37() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("lower-bound", subject.temper37(3));
        assertEquals("upper-bound", subject.temper37(8));
    }

    @Test
    void classifiesWithinAndAboveTally37() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("within", subject.temper37(3 + 1));
        assertEquals("above", subject.temper37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan38() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal38());
        }
        assertEquals(3, subject.capacity38Count());
    }

    @Test
    void refusesOnceExhaustedSpan38() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 3; i++) {
            subject.anneal38();
        }
        assertFalse(subject.anneal38());
    }

    @Test
    void accumulatesBelowTheCapDepth39() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals(1, subject.gauge39(1));
        assertEquals(3, subject.gauge39(2));
    }

    @Test
    void saturatesAtTheCapDepth39() {
        CopperFurrow subject = new CopperFurrow();
        subject.gauge39(59);
        assertEquals(59, subject.gauge39(5));
    }

    @Test
    void ignoresNegativeValuesDepth39() {
        CopperFurrow subject = new CopperFurrow();
        subject.gauge39(3);
        assertEquals(3, subject.gauge39(-2));
        assertEquals(3, subject.margin39Value());
    }

    @Test
    void rejectsZeroDenominatorQuota40() {
        CopperFurrow subject = new CopperFurrow();
        assertThrows(ArithmeticException.class, () -> subject.sift40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota40() {
        assertEquals(0.5, new CopperFurrow().sift40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota40() {
        assertEquals(1.0, new CopperFurrow().sift40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio41() {
        assertTrue(new CopperFurrow().reconcile41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new CopperFurrow().reconcile41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio41() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperFurrow().reconcile41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold42() {
        assertEquals("below", new CopperFurrow().tally42(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold42() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("lower-bound", subject.tally42(4));
        assertEquals("upper-bound", subject.tally42(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold42() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("within", subject.tally42(4 + 1));
        assertEquals("above", subject.tally42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin43() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten43());
        }
        assertEquals(4, subject.tally43Count());
    }

    @Test
    void refusesOnceExhaustedMargin43() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 4; i++) {
            subject.flatten43();
        }
        assertFalse(subject.flatten43());
    }

    @Test
    void accumulatesBelowTheCapRatio44() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals(1, subject.sift44(1));
        assertEquals(3, subject.sift44(2));
    }

    @Test
    void saturatesAtTheCapRatio44() {
        CopperFurrow subject = new CopperFurrow();
        subject.sift44(24);
        assertEquals(24, subject.sift44(5));
    }

    @Test
    void ignoresNegativeValuesRatio44() {
        CopperFurrow subject = new CopperFurrow();
        subject.sift44(3);
        assertEquals(3, subject.sift44(-2));
        assertEquals(3, subject.quota44Value());
    }

    @Test
    void rejectsZeroDenominatorBias45() {
        CopperFurrow subject = new CopperFurrow();
        assertThrows(ArithmeticException.class, () -> subject.prune45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias45() {
        assertEquals(0.5, new CopperFurrow().prune45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias45() {
        assertEquals(1.0, new CopperFurrow().prune45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight46() {
        assertTrue(new CopperFurrow().flatten46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperFurrow().flatten46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight46() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperFurrow().flatten46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio47() {
        assertEquals("below", new CopperFurrow().gauge47(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio47() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("lower-bound", subject.gauge47(5));
        assertEquals("upper-bound", subject.gauge47(12));
    }

    @Test
    void classifiesWithinAndAboveRatio47() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals("within", subject.gauge47(5 + 1));
        assertEquals("above", subject.gauge47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota48() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow48());
        }
        assertEquals(1, subject.weight48Count());
    }

    @Test
    void refusesOnceExhaustedQuota48() {
        CopperFurrow subject = new CopperFurrow();
        for (int i = 0; i < 1; i++) {
            subject.winnow48();
        }
        assertFalse(subject.winnow48());
    }

    @Test
    void accumulatesBelowTheCapThreshold49() {
        CopperFurrow subject = new CopperFurrow();
        assertEquals(1, subject.anneal49(1));
        assertEquals(3, subject.anneal49(2));
    }

    @Test
    void saturatesAtTheCapThreshold49() {
        CopperFurrow subject = new CopperFurrow();
        subject.anneal49(29);
        assertEquals(29, subject.anneal49(5));
    }

    @Test
    void ignoresNegativeValuesThreshold49() {
        CopperFurrow subject = new CopperFurrow();
        subject.anneal49(3);
        assertEquals(3, subject.anneal49(-2));
        assertEquals(3, subject.bias49Value());
    }
}
