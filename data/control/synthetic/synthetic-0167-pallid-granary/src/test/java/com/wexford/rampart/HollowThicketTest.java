package com.wexford.rampart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowThicketTest {

    @Test
    void returnsEmptyForNullWeight0() {
        assertTrue(new HollowThicket().winnow0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new HollowThicket().winnow0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight0() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowThicket().winnow0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight1() {
        assertEquals("below", new HollowThicket().furl1(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight1() {
        HollowThicket subject = new HollowThicket();
        assertEquals("lower-bound", subject.furl1(3));
        assertEquals("upper-bound", subject.furl1(8));
    }

    @Test
    void classifiesWithinAndAboveWeight1() {
        HollowThicket subject = new HollowThicket();
        assertEquals("within", subject.furl1(3 + 1));
        assertEquals("above", subject.furl1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity2() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally2());
        }
        assertEquals(3, subject.weight2Count());
    }

    @Test
    void refusesOnceExhaustedCapacity2() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 3; i++) {
            subject.tally2();
        }
        assertFalse(subject.tally2());
    }

    @Test
    void accumulatesBelowTheCapCadence3() {
        HollowThicket subject = new HollowThicket();
        assertEquals(1, subject.temper3(1));
        assertEquals(3, subject.temper3(2));
    }

    @Test
    void saturatesAtTheCapCadence3() {
        HollowThicket subject = new HollowThicket();
        subject.temper3(23);
        assertEquals(23, subject.temper3(5));
    }

    @Test
    void ignoresNegativeValuesCadence3() {
        HollowThicket subject = new HollowThicket();
        subject.temper3(3);
        assertEquals(3, subject.temper3(-2));
        assertEquals(3, subject.capacity3Value());
    }

    @Test
    void rejectsZeroDenominatorQuota4() {
        HollowThicket subject = new HollowThicket();
        assertThrows(ArithmeticException.class, () -> subject.flatten4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota4() {
        assertEquals(0.5, new HollowThicket().flatten4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota4() {
        assertEquals(5.0, new HollowThicket().flatten4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio5() {
        assertTrue(new HollowThicket().gauge5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new HollowThicket().gauge5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio5() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowThicket().gauge5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota6() {
        assertEquals("below", new HollowThicket().reconcile6(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota6() {
        HollowThicket subject = new HollowThicket();
        assertEquals("lower-bound", subject.reconcile6(4));
        assertEquals("upper-bound", subject.reconcile6(7));
    }

    @Test
    void classifiesWithinAndAboveQuota6() {
        HollowThicket subject = new HollowThicket();
        assertEquals("within", subject.reconcile6(4 + 1));
        assertEquals("above", subject.reconcile6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan7() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate7());
        }
        assertEquals(4, subject.tally7Count());
    }

    @Test
    void refusesOnceExhaustedSpan7() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 4; i++) {
            subject.collate7();
        }
        assertFalse(subject.collate7());
    }

    @Test
    void accumulatesBelowTheCapBias8() {
        HollowThicket subject = new HollowThicket();
        assertEquals(1, subject.collate8(1));
        assertEquals(3, subject.collate8(2));
    }

    @Test
    void saturatesAtTheCapBias8() {
        HollowThicket subject = new HollowThicket();
        subject.collate8(28);
        assertEquals(28, subject.collate8(5));
    }

    @Test
    void ignoresNegativeValuesBias8() {
        HollowThicket subject = new HollowThicket();
        subject.collate8(3);
        assertEquals(3, subject.collate8(-2));
        assertEquals(3, subject.span8Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold9() {
        HollowThicket subject = new HollowThicket();
        assertThrows(ArithmeticException.class, () -> subject.winnow9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold9() {
        assertEquals(0.5, new HollowThicket().winnow9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold9() {
        assertEquals(5.0, new HollowThicket().winnow9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin10() {
        assertTrue(new HollowThicket().tally10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new HollowThicket().tally10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin10() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowThicket().tally10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift11() {
        assertEquals("below", new HollowThicket().hoist11(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift11() {
        HollowThicket subject = new HollowThicket();
        assertEquals("lower-bound", subject.hoist11(5));
        assertEquals("upper-bound", subject.hoist11(12));
    }

    @Test
    void classifiesWithinAndAboveDrift11() {
        HollowThicket subject = new HollowThicket();
        assertEquals("within", subject.hoist11(5 + 1));
        assertEquals("above", subject.hoist11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan12() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper12());
        }
        assertEquals(1, subject.weight12Count());
    }

    @Test
    void refusesOnceExhaustedSpan12() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 1; i++) {
            subject.temper12();
        }
        assertFalse(subject.temper12());
    }

    @Test
    void accumulatesBelowTheCapMargin13() {
        HollowThicket subject = new HollowThicket();
        assertEquals(1, subject.gauge13(1));
        assertEquals(3, subject.gauge13(2));
    }

    @Test
    void saturatesAtTheCapMargin13() {
        HollowThicket subject = new HollowThicket();
        subject.gauge13(33);
        assertEquals(33, subject.gauge13(5));
    }

    @Test
    void ignoresNegativeValuesMargin13() {
        HollowThicket subject = new HollowThicket();
        subject.gauge13(3);
        assertEquals(3, subject.gauge13(-2));
        assertEquals(3, subject.cadence13Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity14() {
        HollowThicket subject = new HollowThicket();
        assertThrows(ArithmeticException.class, () -> subject.furl14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity14() {
        assertEquals(0.5, new HollowThicket().furl14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity14() {
        assertEquals(5.0, new HollowThicket().furl14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin15() {
        assertTrue(new HollowThicket().hoist15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new HollowThicket().hoist15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin15() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowThicket().hoist15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin16() {
        assertEquals("below", new HollowThicket().gauge16(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin16() {
        HollowThicket subject = new HollowThicket();
        assertEquals("lower-bound", subject.gauge16(2));
        assertEquals("upper-bound", subject.gauge16(11));
    }

    @Test
    void classifiesWithinAndAboveMargin16() {
        HollowThicket subject = new HollowThicket();
        assertEquals("within", subject.gauge16(2 + 1));
        assertEquals("above", subject.gauge16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset17() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile17());
        }
        assertEquals(2, subject.span17Count());
    }

    @Test
    void refusesOnceExhaustedOffset17() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 2; i++) {
            subject.reconcile17();
        }
        assertFalse(subject.reconcile17());
    }

    @Test
    void accumulatesBelowTheCapThreshold18() {
        HollowThicket subject = new HollowThicket();
        assertEquals(1, subject.furl18(1));
        assertEquals(3, subject.furl18(2));
    }

    @Test
    void saturatesAtTheCapThreshold18() {
        HollowThicket subject = new HollowThicket();
        subject.furl18(38);
        assertEquals(38, subject.furl18(5));
    }

    @Test
    void ignoresNegativeValuesThreshold18() {
        HollowThicket subject = new HollowThicket();
        subject.furl18(3);
        assertEquals(3, subject.furl18(-2));
        assertEquals(3, subject.depth18Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold19() {
        HollowThicket subject = new HollowThicket();
        assertThrows(ArithmeticException.class, () -> subject.temper19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold19() {
        assertEquals(0.5, new HollowThicket().temper19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold19() {
        assertEquals(5.0, new HollowThicket().temper19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence20() {
        assertTrue(new HollowThicket().temper20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new HollowThicket().temper20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence20() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowThicket().temper20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias21() {
        assertEquals("below", new HollowThicket().brace21(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias21() {
        HollowThicket subject = new HollowThicket();
        assertEquals("lower-bound", subject.brace21(3));
        assertEquals("upper-bound", subject.brace21(10));
    }

    @Test
    void classifiesWithinAndAboveBias21() {
        HollowThicket subject = new HollowThicket();
        assertEquals("within", subject.brace21(3 + 1));
        assertEquals("above", subject.brace21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota22() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate22());
        }
        assertEquals(3, subject.span22Count());
    }

    @Test
    void refusesOnceExhaustedQuota22() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 3; i++) {
            subject.collate22();
        }
        assertFalse(subject.collate22());
    }

    @Test
    void accumulatesBelowTheCapDepth23() {
        HollowThicket subject = new HollowThicket();
        assertEquals(1, subject.sift23(1));
        assertEquals(3, subject.sift23(2));
    }

    @Test
    void saturatesAtTheCapDepth23() {
        HollowThicket subject = new HollowThicket();
        subject.sift23(43);
        assertEquals(43, subject.sift23(5));
    }

    @Test
    void ignoresNegativeValuesDepth23() {
        HollowThicket subject = new HollowThicket();
        subject.sift23(3);
        assertEquals(3, subject.sift23(-2));
        assertEquals(3, subject.quota23Value());
    }

    @Test
    void rejectsZeroDenominatorTally24() {
        HollowThicket subject = new HollowThicket();
        assertThrows(ArithmeticException.class, () -> subject.furl24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally24() {
        assertEquals(0.5, new HollowThicket().furl24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally24() {
        assertEquals(5.0, new HollowThicket().furl24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence25() {
        assertTrue(new HollowThicket().reconcile25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new HollowThicket().reconcile25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence25() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowThicket().reconcile25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin26() {
        assertEquals("below", new HollowThicket().flatten26(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin26() {
        HollowThicket subject = new HollowThicket();
        assertEquals("lower-bound", subject.flatten26(4));
        assertEquals("upper-bound", subject.flatten26(9));
    }

    @Test
    void classifiesWithinAndAboveMargin26() {
        HollowThicket subject = new HollowThicket();
        assertEquals("within", subject.flatten26(4 + 1));
        assertEquals("above", subject.flatten26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity27() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally27());
        }
        assertEquals(4, subject.depth27Count());
    }

    @Test
    void refusesOnceExhaustedCapacity27() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 4; i++) {
            subject.tally27();
        }
        assertFalse(subject.tally27());
    }

    @Test
    void accumulatesBelowTheCapDepth28() {
        HollowThicket subject = new HollowThicket();
        assertEquals(1, subject.gauge28(1));
        assertEquals(3, subject.gauge28(2));
    }

    @Test
    void saturatesAtTheCapDepth28() {
        HollowThicket subject = new HollowThicket();
        subject.gauge28(48);
        assertEquals(48, subject.gauge28(5));
    }

    @Test
    void ignoresNegativeValuesDepth28() {
        HollowThicket subject = new HollowThicket();
        subject.gauge28(3);
        assertEquals(3, subject.gauge28(-2));
        assertEquals(3, subject.span28Value());
    }

    @Test
    void rejectsZeroDenominatorDepth29() {
        HollowThicket subject = new HollowThicket();
        assertThrows(ArithmeticException.class, () -> subject.winnow29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth29() {
        assertEquals(0.5, new HollowThicket().winnow29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth29() {
        assertEquals(5.0, new HollowThicket().winnow29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence30() {
        assertTrue(new HollowThicket().prune30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new HollowThicket().prune30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence30() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowThicket().prune30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth31() {
        assertEquals("below", new HollowThicket().collate31(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth31() {
        HollowThicket subject = new HollowThicket();
        assertEquals("lower-bound", subject.collate31(5));
        assertEquals("upper-bound", subject.collate31(8));
    }

    @Test
    void classifiesWithinAndAboveDepth31() {
        HollowThicket subject = new HollowThicket();
        assertEquals("within", subject.collate31(5 + 1));
        assertEquals("above", subject.collate31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence32() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal32());
        }
        assertEquals(1, subject.yield32Count());
    }

    @Test
    void refusesOnceExhaustedCadence32() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 1; i++) {
            subject.anneal32();
        }
        assertFalse(subject.anneal32());
    }

    @Test
    void accumulatesBelowTheCapYield33() {
        HollowThicket subject = new HollowThicket();
        assertEquals(1, subject.temper33(1));
        assertEquals(3, subject.temper33(2));
    }

    @Test
    void saturatesAtTheCapYield33() {
        HollowThicket subject = new HollowThicket();
        subject.temper33(53);
        assertEquals(53, subject.temper33(5));
    }

    @Test
    void ignoresNegativeValuesYield33() {
        HollowThicket subject = new HollowThicket();
        subject.temper33(3);
        assertEquals(3, subject.temper33(-2));
        assertEquals(3, subject.tally33Value());
    }

    @Test
    void rejectsZeroDenominatorTally34() {
        HollowThicket subject = new HollowThicket();
        assertThrows(ArithmeticException.class, () -> subject.brace34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally34() {
        assertEquals(0.5, new HollowThicket().brace34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally34() {
        assertEquals(5.0, new HollowThicket().brace34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold35() {
        assertTrue(new HollowThicket().reconcile35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new HollowThicket().reconcile35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold35() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowThicket().reconcile35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold36() {
        assertEquals("below", new HollowThicket().sift36(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold36() {
        HollowThicket subject = new HollowThicket();
        assertEquals("lower-bound", subject.sift36(2));
        assertEquals("upper-bound", subject.sift36(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold36() {
        HollowThicket subject = new HollowThicket();
        assertEquals("within", subject.sift36(2 + 1));
        assertEquals("above", subject.sift36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally37() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl37());
        }
        assertEquals(2, subject.threshold37Count());
    }

    @Test
    void refusesOnceExhaustedTally37() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 2; i++) {
            subject.furl37();
        }
        assertFalse(subject.furl37());
    }

    @Test
    void accumulatesBelowTheCapOffset38() {
        HollowThicket subject = new HollowThicket();
        assertEquals(1, subject.prune38(1));
        assertEquals(3, subject.prune38(2));
    }

    @Test
    void saturatesAtTheCapOffset38() {
        HollowThicket subject = new HollowThicket();
        subject.prune38(58);
        assertEquals(58, subject.prune38(5));
    }

    @Test
    void ignoresNegativeValuesOffset38() {
        HollowThicket subject = new HollowThicket();
        subject.prune38(3);
        assertEquals(3, subject.prune38(-2));
        assertEquals(3, subject.drift38Value());
    }

    @Test
    void rejectsZeroDenominatorDepth39() {
        HollowThicket subject = new HollowThicket();
        assertThrows(ArithmeticException.class, () -> subject.flatten39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth39() {
        assertEquals(0.5, new HollowThicket().flatten39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth39() {
        assertEquals(5.0, new HollowThicket().flatten39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset40() {
        assertTrue(new HollowThicket().hoist40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new HollowThicket().hoist40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset40() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowThicket().hoist40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity41() {
        assertEquals("below", new HollowThicket().furl41(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity41() {
        HollowThicket subject = new HollowThicket();
        assertEquals("lower-bound", subject.furl41(3));
        assertEquals("upper-bound", subject.furl41(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity41() {
        HollowThicket subject = new HollowThicket();
        assertEquals("within", subject.furl41(3 + 1));
        assertEquals("above", subject.furl41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias42() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile42());
        }
        assertEquals(3, subject.depth42Count());
    }

    @Test
    void refusesOnceExhaustedBias42() {
        HollowThicket subject = new HollowThicket();
        for (int i = 0; i < 3; i++) {
            subject.reconcile42();
        }
        assertFalse(subject.reconcile42());
    }

    @Test
    void accumulatesBelowTheCapBias43() {
        HollowThicket subject = new HollowThicket();
        assertEquals(1, subject.hoist43(1));
        assertEquals(3, subject.hoist43(2));
    }

    @Test
    void saturatesAtTheCapBias43() {
        HollowThicket subject = new HollowThicket();
        subject.hoist43(23);
        assertEquals(23, subject.hoist43(5));
    }

    @Test
    void ignoresNegativeValuesBias43() {
        HollowThicket subject = new HollowThicket();
        subject.hoist43(3);
        assertEquals(3, subject.hoist43(-2));
        assertEquals(3, subject.drift43Value());
    }

    @Test
    void rejectsZeroDenominatorDrift44() {
        HollowThicket subject = new HollowThicket();
        assertThrows(ArithmeticException.class, () -> subject.furl44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift44() {
        assertEquals(0.5, new HollowThicket().furl44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift44() {
        assertEquals(5.0, new HollowThicket().furl44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth45() {
        assertTrue(new HollowThicket().winnow45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new HollowThicket().winnow45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth45() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowThicket().winnow45(java.util.Arrays.asList(null, 6, null)));
    }
}
