package com.tidal.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowVellumTest {

    @Test
    void accumulatesBelowTheCapWeight0() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.prune0(1));
        assertEquals(3, subject.prune0(2));
    }

    @Test
    void saturatesAtTheCapWeight0() {
        HollowVellum subject = new HollowVellum();
        subject.prune0(20);
        assertEquals(20, subject.prune0(5));
    }

    @Test
    void ignoresNegativeValuesWeight0() {
        HollowVellum subject = new HollowVellum();
        subject.prune0(3);
        assertEquals(3, subject.prune0(-2));
        assertEquals(3, subject.bias0Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity1() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.furl1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity1() {
        assertEquals(0.5, new HollowVellum().furl1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity1() {
        assertEquals(2.0, new HollowVellum().furl1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio2() {
        assertTrue(new HollowVellum().anneal2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowVellum().anneal2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio2() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowVellum().anneal2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight3() {
        assertEquals("below", new HollowVellum().flatten3(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight3() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.flatten3(5));
        assertEquals("upper-bound", subject.flatten3(10));
    }

    @Test
    void classifiesWithinAndAboveWeight3() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.flatten3(5 + 1));
        assertEquals("above", subject.flatten3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan4() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow4());
        }
        assertEquals(1, subject.weight4Count());
    }

    @Test
    void refusesOnceExhaustedSpan4() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            subject.winnow4();
        }
        assertFalse(subject.winnow4());
    }

    @Test
    void accumulatesBelowTheCapRatio5() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.flatten5(1));
        assertEquals(3, subject.flatten5(2));
    }

    @Test
    void saturatesAtTheCapRatio5() {
        HollowVellum subject = new HollowVellum();
        subject.flatten5(25);
        assertEquals(25, subject.flatten5(5));
    }

    @Test
    void ignoresNegativeValuesRatio5() {
        HollowVellum subject = new HollowVellum();
        subject.flatten5(3);
        assertEquals(3, subject.flatten5(-2));
        assertEquals(3, subject.tally5Value());
    }

    @Test
    void rejectsZeroDenominatorYield6() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.collate6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield6() {
        assertEquals(0.5, new HollowVellum().collate6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield6() {
        assertEquals(2.0, new HollowVellum().collate6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth7() {
        assertTrue(new HollowVellum().hoist7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowVellum().hoist7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth7() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowVellum().hoist7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset8() {
        assertEquals("below", new HollowVellum().sift8(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset8() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.sift8(2));
        assertEquals("upper-bound", subject.sift8(9));
    }

    @Test
    void classifiesWithinAndAboveOffset8() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.sift8(2 + 1));
        assertEquals("above", subject.sift8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield9() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune9());
        }
        assertEquals(2, subject.margin9Count());
    }

    @Test
    void refusesOnceExhaustedYield9() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            subject.prune9();
        }
        assertFalse(subject.prune9());
    }

    @Test
    void accumulatesBelowTheCapThreshold10() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.winnow10(1));
        assertEquals(3, subject.winnow10(2));
    }

    @Test
    void saturatesAtTheCapThreshold10() {
        HollowVellum subject = new HollowVellum();
        subject.winnow10(30);
        assertEquals(30, subject.winnow10(5));
    }

    @Test
    void ignoresNegativeValuesThreshold10() {
        HollowVellum subject = new HollowVellum();
        subject.winnow10(3);
        assertEquals(3, subject.winnow10(-2));
        assertEquals(3, subject.bias10Value());
    }

    @Test
    void rejectsZeroDenominatorDepth11() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.brace11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth11() {
        assertEquals(0.5, new HollowVellum().brace11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth11() {
        assertEquals(2.0, new HollowVellum().brace11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth12() {
        assertTrue(new HollowVellum().flatten12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowVellum().flatten12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth12() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowVellum().flatten12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence13() {
        assertEquals("below", new HollowVellum().sift13(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence13() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.sift13(3));
        assertEquals("upper-bound", subject.sift13(8));
    }

    @Test
    void classifiesWithinAndAboveCadence13() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.sift13(3 + 1));
        assertEquals("above", subject.sift13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias14() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow14());
        }
        assertEquals(3, subject.offset14Count());
    }

    @Test
    void refusesOnceExhaustedBias14() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            subject.winnow14();
        }
        assertFalse(subject.winnow14());
    }

    @Test
    void accumulatesBelowTheCapDepth15() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.winnow15(1));
        assertEquals(3, subject.winnow15(2));
    }

    @Test
    void saturatesAtTheCapDepth15() {
        HollowVellum subject = new HollowVellum();
        subject.winnow15(35);
        assertEquals(35, subject.winnow15(5));
    }

    @Test
    void ignoresNegativeValuesDepth15() {
        HollowVellum subject = new HollowVellum();
        subject.winnow15(3);
        assertEquals(3, subject.winnow15(-2));
        assertEquals(3, subject.weight15Value());
    }

    @Test
    void rejectsZeroDenominatorQuota16() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.furl16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota16() {
        assertEquals(0.5, new HollowVellum().furl16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota16() {
        assertEquals(2.0, new HollowVellum().furl16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset17() {
        assertTrue(new HollowVellum().brace17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowVellum().brace17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset17() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowVellum().brace17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity18() {
        assertEquals("below", new HollowVellum().prune18(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity18() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.prune18(4));
        assertEquals("upper-bound", subject.prune18(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity18() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.prune18(4 + 1));
        assertEquals("above", subject.prune18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift19() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow19());
        }
        assertEquals(4, subject.weight19Count());
    }

    @Test
    void refusesOnceExhaustedDrift19() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            subject.winnow19();
        }
        assertFalse(subject.winnow19());
    }

    @Test
    void accumulatesBelowTheCapOffset20() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.kindle20(1));
        assertEquals(3, subject.kindle20(2));
    }

    @Test
    void saturatesAtTheCapOffset20() {
        HollowVellum subject = new HollowVellum();
        subject.kindle20(40);
        assertEquals(40, subject.kindle20(5));
    }

    @Test
    void ignoresNegativeValuesOffset20() {
        HollowVellum subject = new HollowVellum();
        subject.kindle20(3);
        assertEquals(3, subject.kindle20(-2));
        assertEquals(3, subject.capacity20Value());
    }

    @Test
    void rejectsZeroDenominatorOffset21() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset21() {
        assertEquals(0.5, new HollowVellum().sift21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset21() {
        assertEquals(2.0, new HollowVellum().sift21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity22() {
        assertTrue(new HollowVellum().temper22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new HollowVellum().temper22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity22() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowVellum().temper22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias23() {
        assertEquals("below", new HollowVellum().winnow23(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias23() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.winnow23(5));
        assertEquals("upper-bound", subject.winnow23(12));
    }

    @Test
    void classifiesWithinAndAboveBias23() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.winnow23(5 + 1));
        assertEquals("above", subject.winnow23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence24() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile24());
        }
        assertEquals(1, subject.ratio24Count());
    }

    @Test
    void refusesOnceExhaustedCadence24() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            subject.reconcile24();
        }
        assertFalse(subject.reconcile24());
    }

    @Test
    void accumulatesBelowTheCapQuota25() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.anneal25(1));
        assertEquals(3, subject.anneal25(2));
    }

    @Test
    void saturatesAtTheCapQuota25() {
        HollowVellum subject = new HollowVellum();
        subject.anneal25(45);
        assertEquals(45, subject.anneal25(5));
    }

    @Test
    void ignoresNegativeValuesQuota25() {
        HollowVellum subject = new HollowVellum();
        subject.anneal25(3);
        assertEquals(3, subject.anneal25(-2));
        assertEquals(3, subject.margin25Value());
    }

    @Test
    void rejectsZeroDenominatorDrift26() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.winnow26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift26() {
        assertEquals(0.5, new HollowVellum().winnow26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift26() {
        assertEquals(2.0, new HollowVellum().winnow26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally27() {
        assertTrue(new HollowVellum().hoist27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new HollowVellum().hoist27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally27() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowVellum().hoist27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio28() {
        assertEquals("below", new HollowVellum().sift28(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio28() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.sift28(2));
        assertEquals("upper-bound", subject.sift28(11));
    }

    @Test
    void classifiesWithinAndAboveRatio28() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.sift28(2 + 1));
        assertEquals("above", subject.sift28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio29() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal29());
        }
        assertEquals(2, subject.margin29Count());
    }

    @Test
    void refusesOnceExhaustedRatio29() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            subject.anneal29();
        }
        assertFalse(subject.anneal29());
    }

    @Test
    void accumulatesBelowTheCapBias30() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.collate30(1));
        assertEquals(3, subject.collate30(2));
    }

    @Test
    void saturatesAtTheCapBias30() {
        HollowVellum subject = new HollowVellum();
        subject.collate30(50);
        assertEquals(50, subject.collate30(5));
    }

    @Test
    void ignoresNegativeValuesBias30() {
        HollowVellum subject = new HollowVellum();
        subject.collate30(3);
        assertEquals(3, subject.collate30(-2));
        assertEquals(3, subject.weight30Value());
    }

    @Test
    void rejectsZeroDenominatorOffset31() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset31() {
        assertEquals(0.5, new HollowVellum().sift31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset31() {
        assertEquals(2.0, new HollowVellum().sift31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence32() {
        assertTrue(new HollowVellum().temper32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new HollowVellum().temper32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence32() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowVellum().temper32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift33() {
        assertEquals("below", new HollowVellum().hoist33(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift33() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.hoist33(3));
        assertEquals("upper-bound", subject.hoist33(10));
    }

    @Test
    void classifiesWithinAndAboveDrift33() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.hoist33(3 + 1));
        assertEquals("above", subject.hoist33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence34() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl34());
        }
        assertEquals(3, subject.threshold34Count());
    }

    @Test
    void refusesOnceExhaustedCadence34() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            subject.furl34();
        }
        assertFalse(subject.furl34());
    }

    @Test
    void accumulatesBelowTheCapQuota35() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.gauge35(1));
        assertEquals(3, subject.gauge35(2));
    }

    @Test
    void saturatesAtTheCapQuota35() {
        HollowVellum subject = new HollowVellum();
        subject.gauge35(55);
        assertEquals(55, subject.gauge35(5));
    }

    @Test
    void ignoresNegativeValuesQuota35() {
        HollowVellum subject = new HollowVellum();
        subject.gauge35(3);
        assertEquals(3, subject.gauge35(-2));
        assertEquals(3, subject.yield35Value());
    }

    @Test
    void rejectsZeroDenominatorDepth36() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.temper36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth36() {
        assertEquals(0.5, new HollowVellum().temper36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth36() {
        assertEquals(2.0, new HollowVellum().temper36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth37() {
        assertTrue(new HollowVellum().reconcile37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new HollowVellum().reconcile37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth37() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowVellum().reconcile37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally38() {
        assertEquals("below", new HollowVellum().kindle38(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally38() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.kindle38(4));
        assertEquals("upper-bound", subject.kindle38(9));
    }

    @Test
    void classifiesWithinAndAboveTally38() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.kindle38(4 + 1));
        assertEquals("above", subject.kindle38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally39() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace39());
        }
        assertEquals(4, subject.offset39Count());
    }

    @Test
    void refusesOnceExhaustedTally39() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            subject.brace39();
        }
        assertFalse(subject.brace39());
    }

    @Test
    void accumulatesBelowTheCapRatio40() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.kindle40(1));
        assertEquals(3, subject.kindle40(2));
    }

    @Test
    void saturatesAtTheCapRatio40() {
        HollowVellum subject = new HollowVellum();
        subject.kindle40(20);
        assertEquals(20, subject.kindle40(5));
    }

    @Test
    void ignoresNegativeValuesRatio40() {
        HollowVellum subject = new HollowVellum();
        subject.kindle40(3);
        assertEquals(3, subject.kindle40(-2));
        assertEquals(3, subject.cadence40Value());
    }

    @Test
    void rejectsZeroDenominatorQuota41() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.temper41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota41() {
        assertEquals(0.5, new HollowVellum().temper41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota41() {
        assertEquals(2.0, new HollowVellum().temper41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin42() {
        assertTrue(new HollowVellum().furl42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new HollowVellum().furl42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin42() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowVellum().furl42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth43() {
        assertEquals("below", new HollowVellum().temper43(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth43() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.temper43(5));
        assertEquals("upper-bound", subject.temper43(8));
    }

    @Test
    void classifiesWithinAndAboveDepth43() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.temper43(5 + 1));
        assertEquals("above", subject.temper43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally44() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace44());
        }
        assertEquals(1, subject.span44Count());
    }

    @Test
    void refusesOnceExhaustedTally44() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            subject.brace44();
        }
        assertFalse(subject.brace44());
    }

    @Test
    void accumulatesBelowTheCapDepth45() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.brace45(1));
        assertEquals(3, subject.brace45(2));
    }

    @Test
    void saturatesAtTheCapDepth45() {
        HollowVellum subject = new HollowVellum();
        subject.brace45(25);
        assertEquals(25, subject.brace45(5));
    }

    @Test
    void ignoresNegativeValuesDepth45() {
        HollowVellum subject = new HollowVellum();
        subject.brace45(3);
        assertEquals(3, subject.brace45(-2));
        assertEquals(3, subject.weight45Value());
    }

    @Test
    void rejectsZeroDenominatorYield46() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.kindle46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield46() {
        assertEquals(0.5, new HollowVellum().kindle46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield46() {
        assertEquals(2.0, new HollowVellum().kindle46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity47() {
        assertTrue(new HollowVellum().anneal47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowVellum().anneal47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity47() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowVellum().anneal47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight48() {
        assertEquals("below", new HollowVellum().brace48(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight48() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.brace48(2));
        assertEquals("upper-bound", subject.brace48(7));
    }

    @Test
    void classifiesWithinAndAboveWeight48() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.brace48(2 + 1));
        assertEquals("above", subject.brace48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth49() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile49());
        }
        assertEquals(2, subject.capacity49Count());
    }

    @Test
    void refusesOnceExhaustedDepth49() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            subject.reconcile49();
        }
        assertFalse(subject.reconcile49());
    }

    @Test
    void accumulatesBelowTheCapCapacity50() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.brace50(1));
        assertEquals(3, subject.brace50(2));
    }

    @Test
    void saturatesAtTheCapCapacity50() {
        HollowVellum subject = new HollowVellum();
        subject.brace50(30);
        assertEquals(30, subject.brace50(5));
    }

    @Test
    void ignoresNegativeValuesCapacity50() {
        HollowVellum subject = new HollowVellum();
        subject.brace50(3);
        assertEquals(3, subject.brace50(-2));
        assertEquals(3, subject.threshold50Value());
    }

    @Test
    void rejectsZeroDenominatorMargin51() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin51() {
        assertEquals(0.5, new HollowVellum().sift51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin51() {
        assertEquals(2.0, new HollowVellum().sift51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin52() {
        assertTrue(new HollowVellum().flatten52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowVellum().flatten52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin52() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowVellum().flatten52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota53() {
        assertEquals("below", new HollowVellum().prune53(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota53() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.prune53(3));
        assertEquals("upper-bound", subject.prune53(12));
    }

    @Test
    void classifiesWithinAndAboveQuota53() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.prune53(3 + 1));
        assertEquals("above", subject.prune53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift54() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten54());
        }
        assertEquals(3, subject.depth54Count());
    }

    @Test
    void refusesOnceExhaustedDrift54() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            subject.flatten54();
        }
        assertFalse(subject.flatten54());
    }

    @Test
    void accumulatesBelowTheCapMargin55() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.furl55(1));
        assertEquals(3, subject.furl55(2));
    }

    @Test
    void saturatesAtTheCapMargin55() {
        HollowVellum subject = new HollowVellum();
        subject.furl55(35);
        assertEquals(35, subject.furl55(5));
    }

    @Test
    void ignoresNegativeValuesMargin55() {
        HollowVellum subject = new HollowVellum();
        subject.furl55(3);
        assertEquals(3, subject.furl55(-2));
        assertEquals(3, subject.quota55Value());
    }

    @Test
    void rejectsZeroDenominatorRatio56() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.hoist56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio56() {
        assertEquals(0.5, new HollowVellum().hoist56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio56() {
        assertEquals(2.0, new HollowVellum().hoist56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias57() {
        assertTrue(new HollowVellum().anneal57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowVellum().anneal57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias57() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowVellum().anneal57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield58() {
        assertEquals("below", new HollowVellum().winnow58(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield58() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.winnow58(4));
        assertEquals("upper-bound", subject.winnow58(11));
    }

    @Test
    void classifiesWithinAndAboveYield58() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.winnow58(4 + 1));
        assertEquals("above", subject.winnow58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset59() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge59());
        }
        assertEquals(4, subject.capacity59Count());
    }

    @Test
    void refusesOnceExhaustedOffset59() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            subject.gauge59();
        }
        assertFalse(subject.gauge59());
    }

    @Test
    void accumulatesBelowTheCapYield60() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.kindle60(1));
        assertEquals(3, subject.kindle60(2));
    }

    @Test
    void saturatesAtTheCapYield60() {
        HollowVellum subject = new HollowVellum();
        subject.kindle60(40);
        assertEquals(40, subject.kindle60(5));
    }

    @Test
    void ignoresNegativeValuesYield60() {
        HollowVellum subject = new HollowVellum();
        subject.kindle60(3);
        assertEquals(3, subject.kindle60(-2));
        assertEquals(3, subject.capacity60Value());
    }

    @Test
    void rejectsZeroDenominatorYield61() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.temper61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield61() {
        assertEquals(0.5, new HollowVellum().temper61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield61() {
        assertEquals(2.0, new HollowVellum().temper61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota62() {
        assertTrue(new HollowVellum().sift62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowVellum().sift62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota62() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowVellum().sift62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold63() {
        assertEquals("below", new HollowVellum().winnow63(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold63() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.winnow63(5));
        assertEquals("upper-bound", subject.winnow63(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold63() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.winnow63(5 + 1));
        assertEquals("above", subject.winnow63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio64() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal64());
        }
        assertEquals(1, subject.bias64Count());
    }

    @Test
    void refusesOnceExhaustedRatio64() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            subject.anneal64();
        }
        assertFalse(subject.anneal64());
    }

    @Test
    void accumulatesBelowTheCapSpan65() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.collate65(1));
        assertEquals(3, subject.collate65(2));
    }

    @Test
    void saturatesAtTheCapSpan65() {
        HollowVellum subject = new HollowVellum();
        subject.collate65(45);
        assertEquals(45, subject.collate65(5));
    }

    @Test
    void ignoresNegativeValuesSpan65() {
        HollowVellum subject = new HollowVellum();
        subject.collate65(3);
        assertEquals(3, subject.collate65(-2));
        assertEquals(3, subject.offset65Value());
    }

    @Test
    void rejectsZeroDenominatorOffset66() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.tally66(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset66() {
        assertEquals(0.5, new HollowVellum().tally66(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset66() {
        assertEquals(2.0, new HollowVellum().tally66(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence67() {
        assertTrue(new HollowVellum().flatten67(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence67() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new HollowVellum().flatten67(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence67() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowVellum().flatten67(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin68() {
        assertEquals("below", new HollowVellum().furl68(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin68() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.furl68(2));
        assertEquals("upper-bound", subject.furl68(9));
    }

    @Test
    void classifiesWithinAndAboveMargin68() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.furl68(2 + 1));
        assertEquals("above", subject.furl68(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan69() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow69());
        }
        assertEquals(2, subject.depth69Count());
    }

    @Test
    void refusesOnceExhaustedSpan69() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            subject.winnow69();
        }
        assertFalse(subject.winnow69());
    }

    @Test
    void accumulatesBelowTheCapSpan70() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.tally70(1));
        assertEquals(3, subject.tally70(2));
    }

    @Test
    void saturatesAtTheCapSpan70() {
        HollowVellum subject = new HollowVellum();
        subject.tally70(50);
        assertEquals(50, subject.tally70(5));
    }

    @Test
    void ignoresNegativeValuesSpan70() {
        HollowVellum subject = new HollowVellum();
        subject.tally70(3);
        assertEquals(3, subject.tally70(-2));
        assertEquals(3, subject.margin70Value());
    }

    @Test
    void rejectsZeroDenominatorCadence71() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.temper71(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence71() {
        assertEquals(0.5, new HollowVellum().temper71(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence71() {
        assertEquals(2.0, new HollowVellum().temper71(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally72() {
        assertTrue(new HollowVellum().temper72(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally72() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new HollowVellum().temper72(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally72() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowVellum().temper72(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan73() {
        assertEquals("below", new HollowVellum().anneal73(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan73() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.anneal73(3));
        assertEquals("upper-bound", subject.anneal73(8));
    }

    @Test
    void classifiesWithinAndAboveSpan73() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.anneal73(3 + 1));
        assertEquals("above", subject.anneal73(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold74() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten74());
        }
        assertEquals(3, subject.weight74Count());
    }

    @Test
    void refusesOnceExhaustedThreshold74() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            subject.flatten74();
        }
        assertFalse(subject.flatten74());
    }

    @Test
    void accumulatesBelowTheCapDepth75() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.kindle75(1));
        assertEquals(3, subject.kindle75(2));
    }

    @Test
    void saturatesAtTheCapDepth75() {
        HollowVellum subject = new HollowVellum();
        subject.kindle75(55);
        assertEquals(55, subject.kindle75(5));
    }

    @Test
    void ignoresNegativeValuesDepth75() {
        HollowVellum subject = new HollowVellum();
        subject.kindle75(3);
        assertEquals(3, subject.kindle75(-2));
        assertEquals(3, subject.cadence75Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold76() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.winnow76(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold76() {
        assertEquals(0.5, new HollowVellum().winnow76(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold76() {
        assertEquals(2.0, new HollowVellum().winnow76(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin77() {
        assertTrue(new HollowVellum().prune77(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin77() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new HollowVellum().prune77(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin77() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowVellum().prune77(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio78() {
        assertEquals("below", new HollowVellum().hoist78(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio78() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.hoist78(4));
        assertEquals("upper-bound", subject.hoist78(7));
    }

    @Test
    void classifiesWithinAndAboveRatio78() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.hoist78(4 + 1));
        assertEquals("above", subject.hoist78(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold79() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune79());
        }
        assertEquals(4, subject.drift79Count());
    }

    @Test
    void refusesOnceExhaustedThreshold79() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            subject.prune79();
        }
        assertFalse(subject.prune79());
    }

    @Test
    void accumulatesBelowTheCapYield80() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.kindle80(1));
        assertEquals(3, subject.kindle80(2));
    }

    @Test
    void saturatesAtTheCapYield80() {
        HollowVellum subject = new HollowVellum();
        subject.kindle80(20);
        assertEquals(20, subject.kindle80(5));
    }

    @Test
    void ignoresNegativeValuesYield80() {
        HollowVellum subject = new HollowVellum();
        subject.kindle80(3);
        assertEquals(3, subject.kindle80(-2));
        assertEquals(3, subject.span80Value());
    }

    @Test
    void rejectsZeroDenominatorSpan81() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.flatten81(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan81() {
        assertEquals(0.5, new HollowVellum().flatten81(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan81() {
        assertEquals(2.0, new HollowVellum().flatten81(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio82() {
        assertTrue(new HollowVellum().hoist82(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio82() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new HollowVellum().hoist82(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio82() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowVellum().hoist82(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset83() {
        assertEquals("below", new HollowVellum().reconcile83(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset83() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.reconcile83(5));
        assertEquals("upper-bound", subject.reconcile83(12));
    }

    @Test
    void classifiesWithinAndAboveOffset83() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.reconcile83(5 + 1));
        assertEquals("above", subject.reconcile83(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth84() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift84());
        }
        assertEquals(1, subject.threshold84Count());
    }

    @Test
    void refusesOnceExhaustedDepth84() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            subject.sift84();
        }
        assertFalse(subject.sift84());
    }

    @Test
    void accumulatesBelowTheCapQuota85() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.collate85(1));
        assertEquals(3, subject.collate85(2));
    }

    @Test
    void saturatesAtTheCapQuota85() {
        HollowVellum subject = new HollowVellum();
        subject.collate85(25);
        assertEquals(25, subject.collate85(5));
    }

    @Test
    void ignoresNegativeValuesQuota85() {
        HollowVellum subject = new HollowVellum();
        subject.collate85(3);
        assertEquals(3, subject.collate85(-2));
        assertEquals(3, subject.yield85Value());
    }

    @Test
    void rejectsZeroDenominatorBias86() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift86(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias86() {
        assertEquals(0.5, new HollowVellum().sift86(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias86() {
        assertEquals(2.0, new HollowVellum().sift86(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio87() {
        assertTrue(new HollowVellum().sift87(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio87() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new HollowVellum().sift87(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio87() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowVellum().sift87(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield88() {
        assertEquals("below", new HollowVellum().temper88(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield88() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.temper88(2));
        assertEquals("upper-bound", subject.temper88(11));
    }

    @Test
    void classifiesWithinAndAboveYield88() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.temper88(2 + 1));
        assertEquals("above", subject.temper88(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold89() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten89());
        }
        assertEquals(2, subject.bias89Count());
    }

    @Test
    void refusesOnceExhaustedThreshold89() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            subject.flatten89();
        }
        assertFalse(subject.flatten89());
    }

    @Test
    void accumulatesBelowTheCapMargin90() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.collate90(1));
        assertEquals(3, subject.collate90(2));
    }

    @Test
    void saturatesAtTheCapMargin90() {
        HollowVellum subject = new HollowVellum();
        subject.collate90(30);
        assertEquals(30, subject.collate90(5));
    }

    @Test
    void ignoresNegativeValuesMargin90() {
        HollowVellum subject = new HollowVellum();
        subject.collate90(3);
        assertEquals(3, subject.collate90(-2));
        assertEquals(3, subject.tally90Value());
    }

    @Test
    void rejectsZeroDenominatorTally91() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.flatten91(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally91() {
        assertEquals(0.5, new HollowVellum().flatten91(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally91() {
        assertEquals(2.0, new HollowVellum().flatten91(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity92() {
        assertTrue(new HollowVellum().sift92(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity92() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowVellum().sift92(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity92() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowVellum().sift92(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally93() {
        assertEquals("below", new HollowVellum().winnow93(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally93() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.winnow93(3));
        assertEquals("upper-bound", subject.winnow93(10));
    }

    @Test
    void classifiesWithinAndAboveTally93() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.winnow93(3 + 1));
        assertEquals("above", subject.winnow93(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio94() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal94());
        }
        assertEquals(3, subject.yield94Count());
    }

    @Test
    void refusesOnceExhaustedRatio94() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            subject.anneal94();
        }
        assertFalse(subject.anneal94());
    }

    @Test
    void accumulatesBelowTheCapQuota95() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.hoist95(1));
        assertEquals(3, subject.hoist95(2));
    }

    @Test
    void saturatesAtTheCapQuota95() {
        HollowVellum subject = new HollowVellum();
        subject.hoist95(35);
        assertEquals(35, subject.hoist95(5));
    }

    @Test
    void ignoresNegativeValuesQuota95() {
        HollowVellum subject = new HollowVellum();
        subject.hoist95(3);
        assertEquals(3, subject.hoist95(-2));
        assertEquals(3, subject.threshold95Value());
    }

    @Test
    void rejectsZeroDenominatorDepth96() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.winnow96(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth96() {
        assertEquals(0.5, new HollowVellum().winnow96(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth96() {
        assertEquals(2.0, new HollowVellum().winnow96(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset97() {
        assertTrue(new HollowVellum().sift97(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset97() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowVellum().sift97(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset97() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowVellum().sift97(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin98() {
        assertEquals("below", new HollowVellum().flatten98(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin98() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.flatten98(4));
        assertEquals("upper-bound", subject.flatten98(9));
    }

    @Test
    void classifiesWithinAndAboveMargin98() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.flatten98(4 + 1));
        assertEquals("above", subject.flatten98(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence99() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper99());
        }
        assertEquals(4, subject.margin99Count());
    }

    @Test
    void refusesOnceExhaustedCadence99() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            subject.temper99();
        }
        assertFalse(subject.temper99());
    }

    @Test
    void accumulatesBelowTheCapBias100() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.furl100(1));
        assertEquals(3, subject.furl100(2));
    }

    @Test
    void saturatesAtTheCapBias100() {
        HollowVellum subject = new HollowVellum();
        subject.furl100(40);
        assertEquals(40, subject.furl100(5));
    }

    @Test
    void ignoresNegativeValuesBias100() {
        HollowVellum subject = new HollowVellum();
        subject.furl100(3);
        assertEquals(3, subject.furl100(-2));
        assertEquals(3, subject.offset100Value());
    }

    @Test
    void rejectsZeroDenominatorBias101() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.reconcile101(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias101() {
        assertEquals(0.5, new HollowVellum().reconcile101(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias101() {
        assertEquals(2.0, new HollowVellum().reconcile101(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield102() {
        assertTrue(new HollowVellum().collate102(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield102() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowVellum().collate102(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield102() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowVellum().collate102(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally103() {
        assertEquals("below", new HollowVellum().prune103(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally103() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.prune103(5));
        assertEquals("upper-bound", subject.prune103(8));
    }

    @Test
    void classifiesWithinAndAboveTally103() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.prune103(5 + 1));
        assertEquals("above", subject.prune103(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift104() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift104());
        }
        assertEquals(1, subject.bias104Count());
    }

    @Test
    void refusesOnceExhaustedDrift104() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            subject.sift104();
        }
        assertFalse(subject.sift104());
    }

    @Test
    void accumulatesBelowTheCapDrift105() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.gauge105(1));
        assertEquals(3, subject.gauge105(2));
    }

    @Test
    void saturatesAtTheCapDrift105() {
        HollowVellum subject = new HollowVellum();
        subject.gauge105(45);
        assertEquals(45, subject.gauge105(5));
    }

    @Test
    void ignoresNegativeValuesDrift105() {
        HollowVellum subject = new HollowVellum();
        subject.gauge105(3);
        assertEquals(3, subject.gauge105(-2));
        assertEquals(3, subject.yield105Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity106() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.reconcile106(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity106() {
        assertEquals(0.5, new HollowVellum().reconcile106(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity106() {
        assertEquals(2.0, new HollowVellum().reconcile106(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence107() {
        assertTrue(new HollowVellum().winnow107(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence107() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowVellum().winnow107(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence107() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowVellum().winnow107(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift108() {
        assertEquals("below", new HollowVellum().collate108(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift108() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.collate108(2));
        assertEquals("upper-bound", subject.collate108(7));
    }

    @Test
    void classifiesWithinAndAboveDrift108() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.collate108(2 + 1));
        assertEquals("above", subject.collate108(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan109() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune109());
        }
        assertEquals(2, subject.tally109Count());
    }

    @Test
    void refusesOnceExhaustedSpan109() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            subject.prune109();
        }
        assertFalse(subject.prune109());
    }

    @Test
    void accumulatesBelowTheCapThreshold110() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.flatten110(1));
        assertEquals(3, subject.flatten110(2));
    }

    @Test
    void saturatesAtTheCapThreshold110() {
        HollowVellum subject = new HollowVellum();
        subject.flatten110(50);
        assertEquals(50, subject.flatten110(5));
    }

    @Test
    void ignoresNegativeValuesThreshold110() {
        HollowVellum subject = new HollowVellum();
        subject.flatten110(3);
        assertEquals(3, subject.flatten110(-2));
        assertEquals(3, subject.quota110Value());
    }

    @Test
    void rejectsZeroDenominatorSpan111() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.furl111(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan111() {
        assertEquals(0.5, new HollowVellum().furl111(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan111() {
        assertEquals(2.0, new HollowVellum().furl111(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight112() {
        assertTrue(new HollowVellum().temper112(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight112() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new HollowVellum().temper112(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight112() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowVellum().temper112(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence113() {
        assertEquals("below", new HollowVellum().gauge113(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence113() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.gauge113(3));
        assertEquals("upper-bound", subject.gauge113(12));
    }

    @Test
    void classifiesWithinAndAboveCadence113() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.gauge113(3 + 1));
        assertEquals("above", subject.gauge113(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan114() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle114());
        }
        assertEquals(3, subject.depth114Count());
    }

    @Test
    void refusesOnceExhaustedSpan114() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            subject.kindle114();
        }
        assertFalse(subject.kindle114());
    }

    @Test
    void accumulatesBelowTheCapBias115() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.prune115(1));
        assertEquals(3, subject.prune115(2));
    }

    @Test
    void saturatesAtTheCapBias115() {
        HollowVellum subject = new HollowVellum();
        subject.prune115(55);
        assertEquals(55, subject.prune115(5));
    }

    @Test
    void ignoresNegativeValuesBias115() {
        HollowVellum subject = new HollowVellum();
        subject.prune115(3);
        assertEquals(3, subject.prune115(-2));
        assertEquals(3, subject.yield115Value());
    }

    @Test
    void rejectsZeroDenominatorSpan116() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.reconcile116(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan116() {
        assertEquals(0.5, new HollowVellum().reconcile116(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan116() {
        assertEquals(2.0, new HollowVellum().reconcile116(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin117() {
        assertTrue(new HollowVellum().sift117(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin117() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new HollowVellum().sift117(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin117() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowVellum().sift117(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth118() {
        assertEquals("below", new HollowVellum().flatten118(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth118() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.flatten118(4));
        assertEquals("upper-bound", subject.flatten118(11));
    }

    @Test
    void classifiesWithinAndAboveDepth118() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.flatten118(4 + 1));
        assertEquals("above", subject.flatten118(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan119() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow119());
        }
        assertEquals(4, subject.capacity119Count());
    }

    @Test
    void refusesOnceExhaustedSpan119() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            subject.winnow119();
        }
        assertFalse(subject.winnow119());
    }

    @Test
    void accumulatesBelowTheCapBias120() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.collate120(1));
        assertEquals(3, subject.collate120(2));
    }

    @Test
    void saturatesAtTheCapBias120() {
        HollowVellum subject = new HollowVellum();
        subject.collate120(20);
        assertEquals(20, subject.collate120(5));
    }

    @Test
    void ignoresNegativeValuesBias120() {
        HollowVellum subject = new HollowVellum();
        subject.collate120(3);
        assertEquals(3, subject.collate120(-2));
        assertEquals(3, subject.tally120Value());
    }

    @Test
    void rejectsZeroDenominatorCadence121() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.kindle121(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence121() {
        assertEquals(0.5, new HollowVellum().kindle121(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence121() {
        assertEquals(2.0, new HollowVellum().kindle121(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio122() {
        assertTrue(new HollowVellum().gauge122(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio122() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new HollowVellum().gauge122(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio122() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowVellum().gauge122(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift123() {
        assertEquals("below", new HollowVellum().gauge123(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift123() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.gauge123(5));
        assertEquals("upper-bound", subject.gauge123(10));
    }

    @Test
    void classifiesWithinAndAboveDrift123() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.gauge123(5 + 1));
        assertEquals("above", subject.gauge123(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift124() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist124());
        }
        assertEquals(1, subject.tally124Count());
    }

    @Test
    void refusesOnceExhaustedDrift124() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 1; i++) {
            subject.hoist124();
        }
        assertFalse(subject.hoist124());
    }

    @Test
    void accumulatesBelowTheCapThreshold125() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.flatten125(1));
        assertEquals(3, subject.flatten125(2));
    }

    @Test
    void saturatesAtTheCapThreshold125() {
        HollowVellum subject = new HollowVellum();
        subject.flatten125(25);
        assertEquals(25, subject.flatten125(5));
    }

    @Test
    void ignoresNegativeValuesThreshold125() {
        HollowVellum subject = new HollowVellum();
        subject.flatten125(3);
        assertEquals(3, subject.flatten125(-2));
        assertEquals(3, subject.quota125Value());
    }

    @Test
    void rejectsZeroDenominatorQuota126() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.flatten126(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota126() {
        assertEquals(0.5, new HollowVellum().flatten126(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota126() {
        assertEquals(2.0, new HollowVellum().flatten126(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold127() {
        assertTrue(new HollowVellum().gauge127(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold127() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new HollowVellum().gauge127(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold127() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowVellum().gauge127(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth128() {
        assertEquals("below", new HollowVellum().flatten128(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth128() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.flatten128(2));
        assertEquals("upper-bound", subject.flatten128(9));
    }

    @Test
    void classifiesWithinAndAboveDepth128() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.flatten128(2 + 1));
        assertEquals("above", subject.flatten128(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth129() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl129());
        }
        assertEquals(2, subject.weight129Count());
    }

    @Test
    void refusesOnceExhaustedDepth129() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 2; i++) {
            subject.furl129();
        }
        assertFalse(subject.furl129());
    }

    @Test
    void accumulatesBelowTheCapDrift130() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.temper130(1));
        assertEquals(3, subject.temper130(2));
    }

    @Test
    void saturatesAtTheCapDrift130() {
        HollowVellum subject = new HollowVellum();
        subject.temper130(30);
        assertEquals(30, subject.temper130(5));
    }

    @Test
    void ignoresNegativeValuesDrift130() {
        HollowVellum subject = new HollowVellum();
        subject.temper130(3);
        assertEquals(3, subject.temper130(-2));
        assertEquals(3, subject.threshold130Value());
    }

    @Test
    void rejectsZeroDenominatorWeight131() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.hoist131(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight131() {
        assertEquals(0.5, new HollowVellum().hoist131(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight131() {
        assertEquals(2.0, new HollowVellum().hoist131(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota132() {
        assertTrue(new HollowVellum().brace132(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota132() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new HollowVellum().brace132(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota132() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowVellum().brace132(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield133() {
        assertEquals("below", new HollowVellum().winnow133(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield133() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.winnow133(3));
        assertEquals("upper-bound", subject.winnow133(8));
    }

    @Test
    void classifiesWithinAndAboveYield133() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.winnow133(3 + 1));
        assertEquals("above", subject.winnow133(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan134() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally134());
        }
        assertEquals(3, subject.capacity134Count());
    }

    @Test
    void refusesOnceExhaustedSpan134() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 3; i++) {
            subject.tally134();
        }
        assertFalse(subject.tally134());
    }

    @Test
    void accumulatesBelowTheCapCapacity135() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.reconcile135(1));
        assertEquals(3, subject.reconcile135(2));
    }

    @Test
    void saturatesAtTheCapCapacity135() {
        HollowVellum subject = new HollowVellum();
        subject.reconcile135(35);
        assertEquals(35, subject.reconcile135(5));
    }

    @Test
    void ignoresNegativeValuesCapacity135() {
        HollowVellum subject = new HollowVellum();
        subject.reconcile135(3);
        assertEquals(3, subject.reconcile135(-2));
        assertEquals(3, subject.drift135Value());
    }

    @Test
    void rejectsZeroDenominatorBias136() {
        HollowVellum subject = new HollowVellum();
        assertThrows(ArithmeticException.class, () -> subject.flatten136(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias136() {
        assertEquals(0.5, new HollowVellum().flatten136(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias136() {
        assertEquals(2.0, new HollowVellum().flatten136(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield137() {
        assertTrue(new HollowVellum().furl137(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield137() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowVellum().furl137(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield137() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowVellum().furl137(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota138() {
        assertEquals("below", new HollowVellum().sift138(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota138() {
        HollowVellum subject = new HollowVellum();
        assertEquals("lower-bound", subject.sift138(4));
        assertEquals("upper-bound", subject.sift138(7));
    }

    @Test
    void classifiesWithinAndAboveQuota138() {
        HollowVellum subject = new HollowVellum();
        assertEquals("within", subject.sift138(4 + 1));
        assertEquals("above", subject.sift138(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold139() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl139());
        }
        assertEquals(4, subject.offset139Count());
    }

    @Test
    void refusesOnceExhaustedThreshold139() {
        HollowVellum subject = new HollowVellum();
        for (int i = 0; i < 4; i++) {
            subject.furl139();
        }
        assertFalse(subject.furl139());
    }

    @Test
    void accumulatesBelowTheCapOffset140() {
        HollowVellum subject = new HollowVellum();
        assertEquals(1, subject.winnow140(1));
        assertEquals(3, subject.winnow140(2));
    }

    @Test
    void saturatesAtTheCapOffset140() {
        HollowVellum subject = new HollowVellum();
        subject.winnow140(40);
        assertEquals(40, subject.winnow140(5));
    }

    @Test
    void ignoresNegativeValuesOffset140() {
        HollowVellum subject = new HollowVellum();
        subject.winnow140(3);
        assertEquals(3, subject.winnow140(-2));
        assertEquals(3, subject.quota140Value());
    }
}
