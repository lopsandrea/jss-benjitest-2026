package com.ashen.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantLatticeIITest {

    @Test
    void returnsEmptyForNullYield0() {
        assertTrue(new VerdantLatticeII().reconcile0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new VerdantLatticeII().reconcile0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield0() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantLatticeII().reconcile0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield1() {
        assertEquals("below", new VerdantLatticeII().temper1(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield1() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.temper1(3));
        assertEquals("upper-bound", subject.temper1(8));
    }

    @Test
    void classifiesWithinAndAboveYield1() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.temper1(3 + 1));
        assertEquals("above", subject.temper1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias2() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace2());
        }
        assertEquals(3, subject.depth2Count());
    }

    @Test
    void refusesOnceExhaustedBias2() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 3; i++) {
            subject.brace2();
        }
        assertFalse(subject.brace2());
    }

    @Test
    void accumulatesBelowTheCapSpan3() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.temper3(1));
        assertEquals(3, subject.temper3(2));
    }

    @Test
    void saturatesAtTheCapSpan3() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.temper3(23);
        assertEquals(23, subject.temper3(5));
    }

    @Test
    void ignoresNegativeValuesSpan3() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.temper3(3);
        assertEquals(3, subject.temper3(-2));
        assertEquals(3, subject.threshold3Value());
    }

    @Test
    void rejectsZeroDenominatorDepth4() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.tally4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth4() {
        assertEquals(0.5, new VerdantLatticeII().tally4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth4() {
        assertEquals(5.0, new VerdantLatticeII().tally4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence5() {
        assertTrue(new VerdantLatticeII().collate5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new VerdantLatticeII().collate5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence5() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantLatticeII().collate5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio6() {
        assertEquals("below", new VerdantLatticeII().gauge6(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio6() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.gauge6(4));
        assertEquals("upper-bound", subject.gauge6(7));
    }

    @Test
    void classifiesWithinAndAboveRatio6() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.gauge6(4 + 1));
        assertEquals("above", subject.gauge6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence7() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune7());
        }
        assertEquals(4, subject.weight7Count());
    }

    @Test
    void refusesOnceExhaustedCadence7() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 4; i++) {
            subject.prune7();
        }
        assertFalse(subject.prune7());
    }

    @Test
    void accumulatesBelowTheCapCadence8() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.gauge8(1));
        assertEquals(3, subject.gauge8(2));
    }

    @Test
    void saturatesAtTheCapCadence8() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.gauge8(28);
        assertEquals(28, subject.gauge8(5));
    }

    @Test
    void ignoresNegativeValuesCadence8() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.gauge8(3);
        assertEquals(3, subject.gauge8(-2));
        assertEquals(3, subject.weight8Value());
    }

    @Test
    void rejectsZeroDenominatorDrift9() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.kindle9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift9() {
        assertEquals(0.5, new VerdantLatticeII().kindle9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift9() {
        assertEquals(5.0, new VerdantLatticeII().kindle9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield10() {
        assertTrue(new VerdantLatticeII().reconcile10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new VerdantLatticeII().reconcile10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield10() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantLatticeII().reconcile10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset11() {
        assertEquals("below", new VerdantLatticeII().hoist11(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset11() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.hoist11(5));
        assertEquals("upper-bound", subject.hoist11(12));
    }

    @Test
    void classifiesWithinAndAboveOffset11() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.hoist11(5 + 1));
        assertEquals("above", subject.hoist11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally12() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge12());
        }
        assertEquals(1, subject.capacity12Count());
    }

    @Test
    void refusesOnceExhaustedTally12() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 1; i++) {
            subject.gauge12();
        }
        assertFalse(subject.gauge12());
    }

    @Test
    void accumulatesBelowTheCapOffset13() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.winnow13(1));
        assertEquals(3, subject.winnow13(2));
    }

    @Test
    void saturatesAtTheCapOffset13() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.winnow13(33);
        assertEquals(33, subject.winnow13(5));
    }

    @Test
    void ignoresNegativeValuesOffset13() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.winnow13(3);
        assertEquals(3, subject.winnow13(-2));
        assertEquals(3, subject.tally13Value());
    }

    @Test
    void rejectsZeroDenominatorCadence14() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.furl14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence14() {
        assertEquals(0.5, new VerdantLatticeII().furl14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence14() {
        assertEquals(5.0, new VerdantLatticeII().furl14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold15() {
        assertTrue(new VerdantLatticeII().tally15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new VerdantLatticeII().tally15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold15() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantLatticeII().tally15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota16() {
        assertEquals("below", new VerdantLatticeII().furl16(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota16() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.furl16(2));
        assertEquals("upper-bound", subject.furl16(11));
    }

    @Test
    void classifiesWithinAndAboveQuota16() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.furl16(2 + 1));
        assertEquals("above", subject.furl16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota17() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal17());
        }
        assertEquals(2, subject.span17Count());
    }

    @Test
    void refusesOnceExhaustedQuota17() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 2; i++) {
            subject.anneal17();
        }
        assertFalse(subject.anneal17());
    }

    @Test
    void accumulatesBelowTheCapCapacity18() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.gauge18(1));
        assertEquals(3, subject.gauge18(2));
    }

    @Test
    void saturatesAtTheCapCapacity18() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.gauge18(38);
        assertEquals(38, subject.gauge18(5));
    }

    @Test
    void ignoresNegativeValuesCapacity18() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.gauge18(3);
        assertEquals(3, subject.gauge18(-2));
        assertEquals(3, subject.quota18Value());
    }

    @Test
    void rejectsZeroDenominatorSpan19() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.flatten19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan19() {
        assertEquals(0.5, new VerdantLatticeII().flatten19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan19() {
        assertEquals(5.0, new VerdantLatticeII().flatten19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift20() {
        assertTrue(new VerdantLatticeII().sift20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new VerdantLatticeII().sift20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift20() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantLatticeII().sift20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence21() {
        assertEquals("below", new VerdantLatticeII().reconcile21(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence21() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.reconcile21(3));
        assertEquals("upper-bound", subject.reconcile21(10));
    }

    @Test
    void classifiesWithinAndAboveCadence21() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.reconcile21(3 + 1));
        assertEquals("above", subject.reconcile21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota22() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge22());
        }
        assertEquals(3, subject.ratio22Count());
    }

    @Test
    void refusesOnceExhaustedQuota22() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 3; i++) {
            subject.gauge22();
        }
        assertFalse(subject.gauge22());
    }

    @Test
    void accumulatesBelowTheCapSpan23() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.winnow23(1));
        assertEquals(3, subject.winnow23(2));
    }

    @Test
    void saturatesAtTheCapSpan23() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.winnow23(43);
        assertEquals(43, subject.winnow23(5));
    }

    @Test
    void ignoresNegativeValuesSpan23() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.winnow23(3);
        assertEquals(3, subject.winnow23(-2));
        assertEquals(3, subject.margin23Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold24() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.gauge24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold24() {
        assertEquals(0.5, new VerdantLatticeII().gauge24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold24() {
        assertEquals(5.0, new VerdantLatticeII().gauge24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin25() {
        assertTrue(new VerdantLatticeII().reconcile25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new VerdantLatticeII().reconcile25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin25() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantLatticeII().reconcile25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin26() {
        assertEquals("below", new VerdantLatticeII().kindle26(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin26() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.kindle26(4));
        assertEquals("upper-bound", subject.kindle26(9));
    }

    @Test
    void classifiesWithinAndAboveMargin26() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.kindle26(4 + 1));
        assertEquals("above", subject.kindle26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset27() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl27());
        }
        assertEquals(4, subject.threshold27Count());
    }

    @Test
    void refusesOnceExhaustedOffset27() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 4; i++) {
            subject.furl27();
        }
        assertFalse(subject.furl27());
    }

    @Test
    void accumulatesBelowTheCapOffset28() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.collate28(1));
        assertEquals(3, subject.collate28(2));
    }

    @Test
    void saturatesAtTheCapOffset28() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.collate28(48);
        assertEquals(48, subject.collate28(5));
    }

    @Test
    void ignoresNegativeValuesOffset28() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.collate28(3);
        assertEquals(3, subject.collate28(-2));
        assertEquals(3, subject.depth28Value());
    }

    @Test
    void rejectsZeroDenominatorTally29() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.winnow29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally29() {
        assertEquals(0.5, new VerdantLatticeII().winnow29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally29() {
        assertEquals(5.0, new VerdantLatticeII().winnow29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan30() {
        assertTrue(new VerdantLatticeII().sift30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new VerdantLatticeII().sift30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan30() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantLatticeII().sift30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin31() {
        assertEquals("below", new VerdantLatticeII().flatten31(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin31() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.flatten31(5));
        assertEquals("upper-bound", subject.flatten31(8));
    }

    @Test
    void classifiesWithinAndAboveMargin31() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.flatten31(5 + 1));
        assertEquals("above", subject.flatten31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset32() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper32());
        }
        assertEquals(1, subject.margin32Count());
    }

    @Test
    void refusesOnceExhaustedOffset32() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 1; i++) {
            subject.temper32();
        }
        assertFalse(subject.temper32());
    }

    @Test
    void accumulatesBelowTheCapSpan33() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.anneal33(1));
        assertEquals(3, subject.anneal33(2));
    }

    @Test
    void saturatesAtTheCapSpan33() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.anneal33(53);
        assertEquals(53, subject.anneal33(5));
    }

    @Test
    void ignoresNegativeValuesSpan33() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.anneal33(3);
        assertEquals(3, subject.anneal33(-2));
        assertEquals(3, subject.yield33Value());
    }

    @Test
    void rejectsZeroDenominatorSpan34() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.collate34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan34() {
        assertEquals(0.5, new VerdantLatticeII().collate34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan34() {
        assertEquals(5.0, new VerdantLatticeII().collate34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset35() {
        assertTrue(new VerdantLatticeII().furl35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new VerdantLatticeII().furl35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset35() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantLatticeII().furl35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset36() {
        assertEquals("below", new VerdantLatticeII().flatten36(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset36() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.flatten36(2));
        assertEquals("upper-bound", subject.flatten36(7));
    }

    @Test
    void classifiesWithinAndAboveOffset36() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.flatten36(2 + 1));
        assertEquals("above", subject.flatten36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin37() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate37());
        }
        assertEquals(2, subject.offset37Count());
    }

    @Test
    void refusesOnceExhaustedMargin37() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 2; i++) {
            subject.collate37();
        }
        assertFalse(subject.collate37());
    }

    @Test
    void accumulatesBelowTheCapSpan38() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.flatten38(1));
        assertEquals(3, subject.flatten38(2));
    }

    @Test
    void saturatesAtTheCapSpan38() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.flatten38(58);
        assertEquals(58, subject.flatten38(5));
    }

    @Test
    void ignoresNegativeValuesSpan38() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.flatten38(3);
        assertEquals(3, subject.flatten38(-2));
        assertEquals(3, subject.quota38Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold39() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold39() {
        assertEquals(0.5, new VerdantLatticeII().reconcile39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold39() {
        assertEquals(5.0, new VerdantLatticeII().reconcile39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin40() {
        assertTrue(new VerdantLatticeII().tally40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new VerdantLatticeII().tally40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin40() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantLatticeII().tally40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio41() {
        assertEquals("below", new VerdantLatticeII().kindle41(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio41() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.kindle41(3));
        assertEquals("upper-bound", subject.kindle41(12));
    }

    @Test
    void classifiesWithinAndAboveRatio41() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.kindle41(3 + 1));
        assertEquals("above", subject.kindle41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight42() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge42());
        }
        assertEquals(3, subject.yield42Count());
    }

    @Test
    void refusesOnceExhaustedWeight42() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 3; i++) {
            subject.gauge42();
        }
        assertFalse(subject.gauge42());
    }

    @Test
    void accumulatesBelowTheCapBias43() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.temper43(1));
        assertEquals(3, subject.temper43(2));
    }

    @Test
    void saturatesAtTheCapBias43() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.temper43(23);
        assertEquals(23, subject.temper43(5));
    }

    @Test
    void ignoresNegativeValuesBias43() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.temper43(3);
        assertEquals(3, subject.temper43(-2));
        assertEquals(3, subject.yield43Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity44() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.gauge44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity44() {
        assertEquals(0.5, new VerdantLatticeII().gauge44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity44() {
        assertEquals(5.0, new VerdantLatticeII().gauge44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally45() {
        assertTrue(new VerdantLatticeII().furl45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new VerdantLatticeII().furl45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally45() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantLatticeII().furl45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan46() {
        assertEquals("below", new VerdantLatticeII().temper46(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan46() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.temper46(4));
        assertEquals("upper-bound", subject.temper46(11));
    }

    @Test
    void classifiesWithinAndAboveSpan46() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.temper46(4 + 1));
        assertEquals("above", subject.temper46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence47() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist47());
        }
        assertEquals(4, subject.margin47Count());
    }

    @Test
    void refusesOnceExhaustedCadence47() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 4; i++) {
            subject.hoist47();
        }
        assertFalse(subject.hoist47());
    }

    @Test
    void accumulatesBelowTheCapMargin48() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.sift48(1));
        assertEquals(3, subject.sift48(2));
    }

    @Test
    void saturatesAtTheCapMargin48() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.sift48(28);
        assertEquals(28, subject.sift48(5));
    }

    @Test
    void ignoresNegativeValuesMargin48() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.sift48(3);
        assertEquals(3, subject.sift48(-2));
        assertEquals(3, subject.quota48Value());
    }

    @Test
    void rejectsZeroDenominatorDepth49() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.hoist49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth49() {
        assertEquals(0.5, new VerdantLatticeII().hoist49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth49() {
        assertEquals(5.0, new VerdantLatticeII().hoist49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally50() {
        assertTrue(new VerdantLatticeII().gauge50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new VerdantLatticeII().gauge50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally50() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantLatticeII().gauge50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight51() {
        assertEquals("below", new VerdantLatticeII().prune51(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight51() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.prune51(5));
        assertEquals("upper-bound", subject.prune51(10));
    }

    @Test
    void classifiesWithinAndAboveWeight51() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.prune51(5 + 1));
        assertEquals("above", subject.prune51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence52() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate52());
        }
        assertEquals(1, subject.bias52Count());
    }

    @Test
    void refusesOnceExhaustedCadence52() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 1; i++) {
            subject.collate52();
        }
        assertFalse(subject.collate52());
    }

    @Test
    void accumulatesBelowTheCapDrift53() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.hoist53(1));
        assertEquals(3, subject.hoist53(2));
    }

    @Test
    void saturatesAtTheCapDrift53() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.hoist53(33);
        assertEquals(33, subject.hoist53(5));
    }

    @Test
    void ignoresNegativeValuesDrift53() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.hoist53(3);
        assertEquals(3, subject.hoist53(-2));
        assertEquals(3, subject.capacity53Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold54() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.tally54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold54() {
        assertEquals(0.5, new VerdantLatticeII().tally54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold54() {
        assertEquals(5.0, new VerdantLatticeII().tally54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity55() {
        assertTrue(new VerdantLatticeII().gauge55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new VerdantLatticeII().gauge55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity55() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantLatticeII().gauge55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence56() {
        assertEquals("below", new VerdantLatticeII().temper56(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence56() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.temper56(2));
        assertEquals("upper-bound", subject.temper56(9));
    }

    @Test
    void classifiesWithinAndAboveCadence56() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.temper56(2 + 1));
        assertEquals("above", subject.temper56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight57() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally57());
        }
        assertEquals(2, subject.cadence57Count());
    }

    @Test
    void refusesOnceExhaustedWeight57() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 2; i++) {
            subject.tally57();
        }
        assertFalse(subject.tally57());
    }

    @Test
    void accumulatesBelowTheCapRatio58() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.collate58(1));
        assertEquals(3, subject.collate58(2));
    }

    @Test
    void saturatesAtTheCapRatio58() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.collate58(38);
        assertEquals(38, subject.collate58(5));
    }

    @Test
    void ignoresNegativeValuesRatio58() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.collate58(3);
        assertEquals(3, subject.collate58(-2));
        assertEquals(3, subject.bias58Value());
    }

    @Test
    void rejectsZeroDenominatorSpan59() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.furl59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan59() {
        assertEquals(0.5, new VerdantLatticeII().furl59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan59() {
        assertEquals(5.0, new VerdantLatticeII().furl59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset60() {
        assertTrue(new VerdantLatticeII().prune60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new VerdantLatticeII().prune60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset60() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantLatticeII().prune60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight61() {
        assertEquals("below", new VerdantLatticeII().temper61(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight61() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.temper61(3));
        assertEquals("upper-bound", subject.temper61(8));
    }

    @Test
    void classifiesWithinAndAboveWeight61() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.temper61(3 + 1));
        assertEquals("above", subject.temper61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally62() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist62());
        }
        assertEquals(3, subject.span62Count());
    }

    @Test
    void refusesOnceExhaustedTally62() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 3; i++) {
            subject.hoist62();
        }
        assertFalse(subject.hoist62());
    }

    @Test
    void accumulatesBelowTheCapRatio63() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.anneal63(1));
        assertEquals(3, subject.anneal63(2));
    }

    @Test
    void saturatesAtTheCapRatio63() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.anneal63(43);
        assertEquals(43, subject.anneal63(5));
    }

    @Test
    void ignoresNegativeValuesRatio63() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.anneal63(3);
        assertEquals(3, subject.anneal63(-2));
        assertEquals(3, subject.margin63Value());
    }

    @Test
    void rejectsZeroDenominatorYield64() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.prune64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield64() {
        assertEquals(0.5, new VerdantLatticeII().prune64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield64() {
        assertEquals(5.0, new VerdantLatticeII().prune64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift65() {
        assertTrue(new VerdantLatticeII().furl65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new VerdantLatticeII().furl65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift65() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantLatticeII().furl65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity66() {
        assertEquals("below", new VerdantLatticeII().anneal66(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity66() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.anneal66(4));
        assertEquals("upper-bound", subject.anneal66(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity66() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.anneal66(4 + 1));
        assertEquals("above", subject.anneal66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence67() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally67());
        }
        assertEquals(4, subject.depth67Count());
    }

    @Test
    void refusesOnceExhaustedCadence67() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 4; i++) {
            subject.tally67();
        }
        assertFalse(subject.tally67());
    }

    @Test
    void accumulatesBelowTheCapBias68() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.gauge68(1));
        assertEquals(3, subject.gauge68(2));
    }

    @Test
    void saturatesAtTheCapBias68() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.gauge68(48);
        assertEquals(48, subject.gauge68(5));
    }

    @Test
    void ignoresNegativeValuesBias68() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.gauge68(3);
        assertEquals(3, subject.gauge68(-2));
        assertEquals(3, subject.yield68Value());
    }

    @Test
    void rejectsZeroDenominatorQuota69() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.temper69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota69() {
        assertEquals(0.5, new VerdantLatticeII().temper69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota69() {
        assertEquals(5.0, new VerdantLatticeII().temper69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota70() {
        assertTrue(new VerdantLatticeII().tally70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new VerdantLatticeII().tally70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota70() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantLatticeII().tally70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield71() {
        assertEquals("below", new VerdantLatticeII().winnow71(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield71() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.winnow71(5));
        assertEquals("upper-bound", subject.winnow71(12));
    }

    @Test
    void classifiesWithinAndAboveYield71() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.winnow71(5 + 1));
        assertEquals("above", subject.winnow71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio72() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally72());
        }
        assertEquals(1, subject.margin72Count());
    }

    @Test
    void refusesOnceExhaustedRatio72() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 1; i++) {
            subject.tally72();
        }
        assertFalse(subject.tally72());
    }

    @Test
    void accumulatesBelowTheCapDepth73() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.collate73(1));
        assertEquals(3, subject.collate73(2));
    }

    @Test
    void saturatesAtTheCapDepth73() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.collate73(53);
        assertEquals(53, subject.collate73(5));
    }

    @Test
    void ignoresNegativeValuesDepth73() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.collate73(3);
        assertEquals(3, subject.collate73(-2));
        assertEquals(3, subject.weight73Value());
    }

    @Test
    void rejectsZeroDenominatorQuota74() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota74() {
        assertEquals(0.5, new VerdantLatticeII().reconcile74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota74() {
        assertEquals(5.0, new VerdantLatticeII().reconcile74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin75() {
        assertTrue(new VerdantLatticeII().temper75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new VerdantLatticeII().temper75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin75() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantLatticeII().temper75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift76() {
        assertEquals("below", new VerdantLatticeII().furl76(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift76() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.furl76(2));
        assertEquals("upper-bound", subject.furl76(11));
    }

    @Test
    void classifiesWithinAndAboveDrift76() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.furl76(2 + 1));
        assertEquals("above", subject.furl76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence77() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist77());
        }
        assertEquals(2, subject.depth77Count());
    }

    @Test
    void refusesOnceExhaustedCadence77() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 2; i++) {
            subject.hoist77();
        }
        assertFalse(subject.hoist77());
    }

    @Test
    void accumulatesBelowTheCapSpan78() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.temper78(1));
        assertEquals(3, subject.temper78(2));
    }

    @Test
    void saturatesAtTheCapSpan78() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.temper78(58);
        assertEquals(58, subject.temper78(5));
    }

    @Test
    void ignoresNegativeValuesSpan78() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.temper78(3);
        assertEquals(3, subject.temper78(-2));
        assertEquals(3, subject.offset78Value());
    }

    @Test
    void rejectsZeroDenominatorWeight79() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.anneal79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight79() {
        assertEquals(0.5, new VerdantLatticeII().anneal79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight79() {
        assertEquals(5.0, new VerdantLatticeII().anneal79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth80() {
        assertTrue(new VerdantLatticeII().temper80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new VerdantLatticeII().temper80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth80() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantLatticeII().temper80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift81() {
        assertEquals("below", new VerdantLatticeII().prune81(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift81() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.prune81(3));
        assertEquals("upper-bound", subject.prune81(10));
    }

    @Test
    void classifiesWithinAndAboveDrift81() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.prune81(3 + 1));
        assertEquals("above", subject.prune81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias82() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper82());
        }
        assertEquals(3, subject.capacity82Count());
    }

    @Test
    void refusesOnceExhaustedBias82() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 3; i++) {
            subject.temper82();
        }
        assertFalse(subject.temper82());
    }

    @Test
    void accumulatesBelowTheCapThreshold83() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals(1, subject.prune83(1));
        assertEquals(3, subject.prune83(2));
    }

    @Test
    void saturatesAtTheCapThreshold83() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.prune83(23);
        assertEquals(23, subject.prune83(5));
    }

    @Test
    void ignoresNegativeValuesThreshold83() {
        VerdantLatticeII subject = new VerdantLatticeII();
        subject.prune83(3);
        assertEquals(3, subject.prune83(-2));
        assertEquals(3, subject.weight83Value());
    }

    @Test
    void rejectsZeroDenominatorYield84() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield84() {
        assertEquals(0.5, new VerdantLatticeII().reconcile84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield84() {
        assertEquals(5.0, new VerdantLatticeII().reconcile84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity85() {
        assertTrue(new VerdantLatticeII().reconcile85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new VerdantLatticeII().reconcile85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity85() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantLatticeII().reconcile85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias86() {
        assertEquals("below", new VerdantLatticeII().tally86(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias86() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("lower-bound", subject.tally86(4));
        assertEquals("upper-bound", subject.tally86(9));
    }

    @Test
    void classifiesWithinAndAboveBias86() {
        VerdantLatticeII subject = new VerdantLatticeII();
        assertEquals("within", subject.tally86(4 + 1));
        assertEquals("above", subject.tally86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield87() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal87());
        }
        assertEquals(4, subject.offset87Count());
    }

    @Test
    void refusesOnceExhaustedYield87() {
        VerdantLatticeII subject = new VerdantLatticeII();
        for (int i = 0; i < 4; i++) {
            subject.anneal87();
        }
        assertFalse(subject.anneal87());
    }
}
