package com.tidal.almanac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableCisternTest {

    @Test
    void returnsEmptyForNullCadence0() {
        assertTrue(new SableCistern().furl0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableCistern().furl0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence0() {
        assertEquals(java.util.Arrays.asList(6),
                new SableCistern().furl0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth1() {
        assertEquals("below", new SableCistern().furl1(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth1() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.furl1(3));
        assertEquals("upper-bound", subject.furl1(8));
    }

    @Test
    void classifiesWithinAndAboveDepth1() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.furl1(3 + 1));
        assertEquals("above", subject.furl1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan2() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist2());
        }
        assertEquals(3, subject.tally2Count());
    }

    @Test
    void refusesOnceExhaustedSpan2() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            subject.hoist2();
        }
        assertFalse(subject.hoist2());
    }

    @Test
    void accumulatesBelowTheCapSpan3() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.anneal3(1));
        assertEquals(3, subject.anneal3(2));
    }

    @Test
    void saturatesAtTheCapSpan3() {
        SableCistern subject = new SableCistern();
        subject.anneal3(23);
        assertEquals(23, subject.anneal3(5));
    }

    @Test
    void ignoresNegativeValuesSpan3() {
        SableCistern subject = new SableCistern();
        subject.anneal3(3);
        assertEquals(3, subject.anneal3(-2));
        assertEquals(3, subject.weight3Value());
    }

    @Test
    void rejectsZeroDenominatorBias4() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.collate4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias4() {
        assertEquals(0.5, new SableCistern().collate4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias4() {
        assertEquals(5.0, new SableCistern().collate4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold5() {
        assertTrue(new SableCistern().collate5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableCistern().collate5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold5() {
        assertEquals(java.util.Arrays.asList(11),
                new SableCistern().collate5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan6() {
        assertEquals("below", new SableCistern().furl6(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan6() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.furl6(4));
        assertEquals("upper-bound", subject.furl6(7));
    }

    @Test
    void classifiesWithinAndAboveSpan6() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.furl6(4 + 1));
        assertEquals("above", subject.furl6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio7() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift7());
        }
        assertEquals(4, subject.threshold7Count());
    }

    @Test
    void refusesOnceExhaustedRatio7() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            subject.sift7();
        }
        assertFalse(subject.sift7());
    }

    @Test
    void accumulatesBelowTheCapDrift8() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.reconcile8(1));
        assertEquals(3, subject.reconcile8(2));
    }

    @Test
    void saturatesAtTheCapDrift8() {
        SableCistern subject = new SableCistern();
        subject.reconcile8(28);
        assertEquals(28, subject.reconcile8(5));
    }

    @Test
    void ignoresNegativeValuesDrift8() {
        SableCistern subject = new SableCistern();
        subject.reconcile8(3);
        assertEquals(3, subject.reconcile8(-2));
        assertEquals(3, subject.threshold8Value());
    }

    @Test
    void rejectsZeroDenominatorWeight9() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.furl9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight9() {
        assertEquals(0.5, new SableCistern().furl9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight9() {
        assertEquals(5.0, new SableCistern().furl9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally10() {
        assertTrue(new SableCistern().sift10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableCistern().sift10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally10() {
        assertEquals(java.util.Arrays.asList(7),
                new SableCistern().sift10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias11() {
        assertEquals("below", new SableCistern().collate11(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias11() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.collate11(5));
        assertEquals("upper-bound", subject.collate11(12));
    }

    @Test
    void classifiesWithinAndAboveBias11() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.collate11(5 + 1));
        assertEquals("above", subject.collate11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset12() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace12());
        }
        assertEquals(1, subject.depth12Count());
    }

    @Test
    void refusesOnceExhaustedOffset12() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            subject.brace12();
        }
        assertFalse(subject.brace12());
    }

    @Test
    void accumulatesBelowTheCapBias13() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.anneal13(1));
        assertEquals(3, subject.anneal13(2));
    }

    @Test
    void saturatesAtTheCapBias13() {
        SableCistern subject = new SableCistern();
        subject.anneal13(33);
        assertEquals(33, subject.anneal13(5));
    }

    @Test
    void ignoresNegativeValuesBias13() {
        SableCistern subject = new SableCistern();
        subject.anneal13(3);
        assertEquals(3, subject.anneal13(-2));
        assertEquals(3, subject.yield13Value());
    }

    @Test
    void rejectsZeroDenominatorDrift14() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.brace14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift14() {
        assertEquals(0.5, new SableCistern().brace14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift14() {
        assertEquals(5.0, new SableCistern().brace14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin15() {
        assertTrue(new SableCistern().anneal15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableCistern().anneal15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin15() {
        assertEquals(java.util.Arrays.asList(12),
                new SableCistern().anneal15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield16() {
        assertEquals("below", new SableCistern().flatten16(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield16() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.flatten16(2));
        assertEquals("upper-bound", subject.flatten16(11));
    }

    @Test
    void classifiesWithinAndAboveYield16() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.flatten16(2 + 1));
        assertEquals("above", subject.flatten16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota17() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile17());
        }
        assertEquals(2, subject.cadence17Count());
    }

    @Test
    void refusesOnceExhaustedQuota17() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            subject.reconcile17();
        }
        assertFalse(subject.reconcile17());
    }

    @Test
    void accumulatesBelowTheCapYield18() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.tally18(1));
        assertEquals(3, subject.tally18(2));
    }

    @Test
    void saturatesAtTheCapYield18() {
        SableCistern subject = new SableCistern();
        subject.tally18(38);
        assertEquals(38, subject.tally18(5));
    }

    @Test
    void ignoresNegativeValuesYield18() {
        SableCistern subject = new SableCistern();
        subject.tally18(3);
        assertEquals(3, subject.tally18(-2));
        assertEquals(3, subject.drift18Value());
    }

    @Test
    void rejectsZeroDenominatorTally19() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.prune19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally19() {
        assertEquals(0.5, new SableCistern().prune19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally19() {
        assertEquals(5.0, new SableCistern().prune19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold20() {
        assertTrue(new SableCistern().winnow20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableCistern().winnow20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold20() {
        assertEquals(java.util.Arrays.asList(8),
                new SableCistern().winnow20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence21() {
        assertEquals("below", new SableCistern().tally21(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence21() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.tally21(3));
        assertEquals("upper-bound", subject.tally21(10));
    }

    @Test
    void classifiesWithinAndAboveCadence21() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.tally21(3 + 1));
        assertEquals("above", subject.tally21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally22() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace22());
        }
        assertEquals(3, subject.span22Count());
    }

    @Test
    void refusesOnceExhaustedTally22() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            subject.brace22();
        }
        assertFalse(subject.brace22());
    }

    @Test
    void accumulatesBelowTheCapCadence23() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.flatten23(1));
        assertEquals(3, subject.flatten23(2));
    }

    @Test
    void saturatesAtTheCapCadence23() {
        SableCistern subject = new SableCistern();
        subject.flatten23(43);
        assertEquals(43, subject.flatten23(5));
    }

    @Test
    void ignoresNegativeValuesCadence23() {
        SableCistern subject = new SableCistern();
        subject.flatten23(3);
        assertEquals(3, subject.flatten23(-2));
        assertEquals(3, subject.capacity23Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold24() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.kindle24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold24() {
        assertEquals(0.5, new SableCistern().kindle24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold24() {
        assertEquals(5.0, new SableCistern().kindle24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally25() {
        assertTrue(new SableCistern().tally25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableCistern().tally25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally25() {
        assertEquals(java.util.Arrays.asList(13),
                new SableCistern().tally25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift26() {
        assertEquals("below", new SableCistern().brace26(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift26() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.brace26(4));
        assertEquals("upper-bound", subject.brace26(9));
    }

    @Test
    void classifiesWithinAndAboveDrift26() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.brace26(4 + 1));
        assertEquals("above", subject.brace26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin27() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune27());
        }
        assertEquals(4, subject.bias27Count());
    }

    @Test
    void refusesOnceExhaustedMargin27() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            subject.prune27();
        }
        assertFalse(subject.prune27());
    }

    @Test
    void accumulatesBelowTheCapTally28() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.anneal28(1));
        assertEquals(3, subject.anneal28(2));
    }

    @Test
    void saturatesAtTheCapTally28() {
        SableCistern subject = new SableCistern();
        subject.anneal28(48);
        assertEquals(48, subject.anneal28(5));
    }

    @Test
    void ignoresNegativeValuesTally28() {
        SableCistern subject = new SableCistern();
        subject.anneal28(3);
        assertEquals(3, subject.anneal28(-2));
        assertEquals(3, subject.ratio28Value());
    }

    @Test
    void rejectsZeroDenominatorSpan29() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.sift29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan29() {
        assertEquals(0.5, new SableCistern().sift29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan29() {
        assertEquals(5.0, new SableCistern().sift29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth30() {
        assertTrue(new SableCistern().kindle30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SableCistern().kindle30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth30() {
        assertEquals(java.util.Arrays.asList(9),
                new SableCistern().kindle30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota31() {
        assertEquals("below", new SableCistern().prune31(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota31() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.prune31(5));
        assertEquals("upper-bound", subject.prune31(8));
    }

    @Test
    void classifiesWithinAndAboveQuota31() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.prune31(5 + 1));
        assertEquals("above", subject.prune31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight32() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle32());
        }
        assertEquals(1, subject.threshold32Count());
    }

    @Test
    void refusesOnceExhaustedWeight32() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            subject.kindle32();
        }
        assertFalse(subject.kindle32());
    }

    @Test
    void accumulatesBelowTheCapSpan33() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.winnow33(1));
        assertEquals(3, subject.winnow33(2));
    }

    @Test
    void saturatesAtTheCapSpan33() {
        SableCistern subject = new SableCistern();
        subject.winnow33(53);
        assertEquals(53, subject.winnow33(5));
    }

    @Test
    void ignoresNegativeValuesSpan33() {
        SableCistern subject = new SableCistern();
        subject.winnow33(3);
        assertEquals(3, subject.winnow33(-2));
        assertEquals(3, subject.weight33Value());
    }

    @Test
    void rejectsZeroDenominatorDepth34() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.hoist34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth34() {
        assertEquals(0.5, new SableCistern().hoist34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth34() {
        assertEquals(5.0, new SableCistern().hoist34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence35() {
        assertTrue(new SableCistern().reconcile35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SableCistern().reconcile35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence35() {
        assertEquals(java.util.Arrays.asList(14),
                new SableCistern().reconcile35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity36() {
        assertEquals("below", new SableCistern().winnow36(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity36() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.winnow36(2));
        assertEquals("upper-bound", subject.winnow36(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity36() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.winnow36(2 + 1));
        assertEquals("above", subject.winnow36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias37() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl37());
        }
        assertEquals(2, subject.yield37Count());
    }

    @Test
    void refusesOnceExhaustedBias37() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            subject.furl37();
        }
        assertFalse(subject.furl37());
    }

    @Test
    void accumulatesBelowTheCapThreshold38() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.hoist38(1));
        assertEquals(3, subject.hoist38(2));
    }

    @Test
    void saturatesAtTheCapThreshold38() {
        SableCistern subject = new SableCistern();
        subject.hoist38(58);
        assertEquals(58, subject.hoist38(5));
    }

    @Test
    void ignoresNegativeValuesThreshold38() {
        SableCistern subject = new SableCistern();
        subject.hoist38(3);
        assertEquals(3, subject.hoist38(-2));
        assertEquals(3, subject.quota38Value());
    }

    @Test
    void rejectsZeroDenominatorMargin39() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.winnow39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin39() {
        assertEquals(0.5, new SableCistern().winnow39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin39() {
        assertEquals(5.0, new SableCistern().winnow39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan40() {
        assertTrue(new SableCistern().furl40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SableCistern().furl40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan40() {
        assertEquals(java.util.Arrays.asList(10),
                new SableCistern().furl40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth41() {
        assertEquals("below", new SableCistern().gauge41(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth41() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.gauge41(3));
        assertEquals("upper-bound", subject.gauge41(12));
    }

    @Test
    void classifiesWithinAndAboveDepth41() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.gauge41(3 + 1));
        assertEquals("above", subject.gauge41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight42() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten42());
        }
        assertEquals(3, subject.capacity42Count());
    }

    @Test
    void refusesOnceExhaustedWeight42() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            subject.flatten42();
        }
        assertFalse(subject.flatten42());
    }

    @Test
    void accumulatesBelowTheCapTally43() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.brace43(1));
        assertEquals(3, subject.brace43(2));
    }

    @Test
    void saturatesAtTheCapTally43() {
        SableCistern subject = new SableCistern();
        subject.brace43(23);
        assertEquals(23, subject.brace43(5));
    }

    @Test
    void ignoresNegativeValuesTally43() {
        SableCistern subject = new SableCistern();
        subject.brace43(3);
        assertEquals(3, subject.brace43(-2));
        assertEquals(3, subject.quota43Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity44() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.furl44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity44() {
        assertEquals(0.5, new SableCistern().furl44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity44() {
        assertEquals(5.0, new SableCistern().furl44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight45() {
        assertTrue(new SableCistern().temper45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableCistern().temper45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight45() {
        assertEquals(java.util.Arrays.asList(6),
                new SableCistern().temper45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset46() {
        assertEquals("below", new SableCistern().winnow46(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset46() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.winnow46(4));
        assertEquals("upper-bound", subject.winnow46(11));
    }

    @Test
    void classifiesWithinAndAboveOffset46() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.winnow46(4 + 1));
        assertEquals("above", subject.winnow46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity47() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune47());
        }
        assertEquals(4, subject.offset47Count());
    }

    @Test
    void refusesOnceExhaustedCapacity47() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            subject.prune47();
        }
        assertFalse(subject.prune47());
    }

    @Test
    void accumulatesBelowTheCapWeight48() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.temper48(1));
        assertEquals(3, subject.temper48(2));
    }

    @Test
    void saturatesAtTheCapWeight48() {
        SableCistern subject = new SableCistern();
        subject.temper48(28);
        assertEquals(28, subject.temper48(5));
    }

    @Test
    void ignoresNegativeValuesWeight48() {
        SableCistern subject = new SableCistern();
        subject.temper48(3);
        assertEquals(3, subject.temper48(-2));
        assertEquals(3, subject.quota48Value());
    }

    @Test
    void rejectsZeroDenominatorRatio49() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.prune49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio49() {
        assertEquals(0.5, new SableCistern().prune49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio49() {
        assertEquals(5.0, new SableCistern().prune49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield50() {
        assertTrue(new SableCistern().flatten50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableCistern().flatten50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield50() {
        assertEquals(java.util.Arrays.asList(11),
                new SableCistern().flatten50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota51() {
        assertEquals("below", new SableCistern().tally51(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota51() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.tally51(5));
        assertEquals("upper-bound", subject.tally51(10));
    }

    @Test
    void classifiesWithinAndAboveQuota51() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.tally51(5 + 1));
        assertEquals("above", subject.tally51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally52() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle52());
        }
        assertEquals(1, subject.quota52Count());
    }

    @Test
    void refusesOnceExhaustedTally52() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            subject.kindle52();
        }
        assertFalse(subject.kindle52());
    }

    @Test
    void accumulatesBelowTheCapDepth53() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.kindle53(1));
        assertEquals(3, subject.kindle53(2));
    }

    @Test
    void saturatesAtTheCapDepth53() {
        SableCistern subject = new SableCistern();
        subject.kindle53(33);
        assertEquals(33, subject.kindle53(5));
    }

    @Test
    void ignoresNegativeValuesDepth53() {
        SableCistern subject = new SableCistern();
        subject.kindle53(3);
        assertEquals(3, subject.kindle53(-2));
        assertEquals(3, subject.drift53Value());
    }

    @Test
    void rejectsZeroDenominatorDrift54() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.brace54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift54() {
        assertEquals(0.5, new SableCistern().brace54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift54() {
        assertEquals(5.0, new SableCistern().brace54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio55() {
        assertTrue(new SableCistern().gauge55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableCistern().gauge55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio55() {
        assertEquals(java.util.Arrays.asList(7),
                new SableCistern().gauge55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio56() {
        assertEquals("below", new SableCistern().collate56(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio56() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.collate56(2));
        assertEquals("upper-bound", subject.collate56(9));
    }

    @Test
    void classifiesWithinAndAboveRatio56() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.collate56(2 + 1));
        assertEquals("above", subject.collate56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio57() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle57());
        }
        assertEquals(2, subject.margin57Count());
    }

    @Test
    void refusesOnceExhaustedRatio57() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            subject.kindle57();
        }
        assertFalse(subject.kindle57());
    }

    @Test
    void accumulatesBelowTheCapRatio58() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.furl58(1));
        assertEquals(3, subject.furl58(2));
    }

    @Test
    void saturatesAtTheCapRatio58() {
        SableCistern subject = new SableCistern();
        subject.furl58(38);
        assertEquals(38, subject.furl58(5));
    }

    @Test
    void ignoresNegativeValuesRatio58() {
        SableCistern subject = new SableCistern();
        subject.furl58(3);
        assertEquals(3, subject.furl58(-2));
        assertEquals(3, subject.drift58Value());
    }

    @Test
    void rejectsZeroDenominatorQuota59() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.reconcile59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota59() {
        assertEquals(0.5, new SableCistern().reconcile59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota59() {
        assertEquals(5.0, new SableCistern().reconcile59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity60() {
        assertTrue(new SableCistern().anneal60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableCistern().anneal60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity60() {
        assertEquals(java.util.Arrays.asList(12),
                new SableCistern().anneal60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota61() {
        assertEquals("below", new SableCistern().brace61(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota61() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.brace61(3));
        assertEquals("upper-bound", subject.brace61(8));
    }

    @Test
    void classifiesWithinAndAboveQuota61() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.brace61(3 + 1));
        assertEquals("above", subject.brace61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield62() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle62());
        }
        assertEquals(3, subject.span62Count());
    }

    @Test
    void refusesOnceExhaustedYield62() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            subject.kindle62();
        }
        assertFalse(subject.kindle62());
    }

    @Test
    void accumulatesBelowTheCapOffset63() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.kindle63(1));
        assertEquals(3, subject.kindle63(2));
    }

    @Test
    void saturatesAtTheCapOffset63() {
        SableCistern subject = new SableCistern();
        subject.kindle63(43);
        assertEquals(43, subject.kindle63(5));
    }

    @Test
    void ignoresNegativeValuesOffset63() {
        SableCistern subject = new SableCistern();
        subject.kindle63(3);
        assertEquals(3, subject.kindle63(-2));
        assertEquals(3, subject.threshold63Value());
    }

    @Test
    void rejectsZeroDenominatorCadence64() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.sift64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence64() {
        assertEquals(0.5, new SableCistern().sift64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence64() {
        assertEquals(5.0, new SableCistern().sift64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias65() {
        assertTrue(new SableCistern().sift65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableCistern().sift65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias65() {
        assertEquals(java.util.Arrays.asList(8),
                new SableCistern().sift65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio66() {
        assertEquals("below", new SableCistern().winnow66(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio66() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.winnow66(4));
        assertEquals("upper-bound", subject.winnow66(7));
    }

    @Test
    void classifiesWithinAndAboveRatio66() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.winnow66(4 + 1));
        assertEquals("above", subject.winnow66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift67() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten67());
        }
        assertEquals(4, subject.ratio67Count());
    }

    @Test
    void refusesOnceExhaustedDrift67() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            subject.flatten67();
        }
        assertFalse(subject.flatten67());
    }

    @Test
    void accumulatesBelowTheCapQuota68() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.kindle68(1));
        assertEquals(3, subject.kindle68(2));
    }

    @Test
    void saturatesAtTheCapQuota68() {
        SableCistern subject = new SableCistern();
        subject.kindle68(48);
        assertEquals(48, subject.kindle68(5));
    }

    @Test
    void ignoresNegativeValuesQuota68() {
        SableCistern subject = new SableCistern();
        subject.kindle68(3);
        assertEquals(3, subject.kindle68(-2));
        assertEquals(3, subject.ratio68Value());
    }

    @Test
    void rejectsZeroDenominatorTally69() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.sift69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally69() {
        assertEquals(0.5, new SableCistern().sift69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally69() {
        assertEquals(5.0, new SableCistern().sift69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin70() {
        assertTrue(new SableCistern().prune70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableCistern().prune70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin70() {
        assertEquals(java.util.Arrays.asList(13),
                new SableCistern().prune70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift71() {
        assertEquals("below", new SableCistern().winnow71(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift71() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.winnow71(5));
        assertEquals("upper-bound", subject.winnow71(12));
    }

    @Test
    void classifiesWithinAndAboveDrift71() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.winnow71(5 + 1));
        assertEquals("above", subject.winnow71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence72() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally72());
        }
        assertEquals(1, subject.depth72Count());
    }

    @Test
    void refusesOnceExhaustedCadence72() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            subject.tally72();
        }
        assertFalse(subject.tally72());
    }

    @Test
    void accumulatesBelowTheCapCapacity73() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.brace73(1));
        assertEquals(3, subject.brace73(2));
    }

    @Test
    void saturatesAtTheCapCapacity73() {
        SableCistern subject = new SableCistern();
        subject.brace73(53);
        assertEquals(53, subject.brace73(5));
    }

    @Test
    void ignoresNegativeValuesCapacity73() {
        SableCistern subject = new SableCistern();
        subject.brace73(3);
        assertEquals(3, subject.brace73(-2));
        assertEquals(3, subject.cadence73Value());
    }

    @Test
    void rejectsZeroDenominatorTally74() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.prune74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally74() {
        assertEquals(0.5, new SableCistern().prune74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally74() {
        assertEquals(5.0, new SableCistern().prune74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan75() {
        assertTrue(new SableCistern().anneal75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SableCistern().anneal75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan75() {
        assertEquals(java.util.Arrays.asList(9),
                new SableCistern().anneal75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio76() {
        assertEquals("below", new SableCistern().reconcile76(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio76() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.reconcile76(2));
        assertEquals("upper-bound", subject.reconcile76(11));
    }

    @Test
    void classifiesWithinAndAboveRatio76() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.reconcile76(2 + 1));
        assertEquals("above", subject.reconcile76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield77() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate77());
        }
        assertEquals(2, subject.offset77Count());
    }

    @Test
    void refusesOnceExhaustedYield77() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            subject.collate77();
        }
        assertFalse(subject.collate77());
    }

    @Test
    void accumulatesBelowTheCapRatio78() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.prune78(1));
        assertEquals(3, subject.prune78(2));
    }

    @Test
    void saturatesAtTheCapRatio78() {
        SableCistern subject = new SableCistern();
        subject.prune78(58);
        assertEquals(58, subject.prune78(5));
    }

    @Test
    void ignoresNegativeValuesRatio78() {
        SableCistern subject = new SableCistern();
        subject.prune78(3);
        assertEquals(3, subject.prune78(-2));
        assertEquals(3, subject.span78Value());
    }

    @Test
    void rejectsZeroDenominatorWeight79() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.reconcile79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight79() {
        assertEquals(0.5, new SableCistern().reconcile79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight79() {
        assertEquals(5.0, new SableCistern().reconcile79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally80() {
        assertTrue(new SableCistern().brace80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SableCistern().brace80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally80() {
        assertEquals(java.util.Arrays.asList(14),
                new SableCistern().brace80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift81() {
        assertEquals("below", new SableCistern().reconcile81(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift81() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.reconcile81(3));
        assertEquals("upper-bound", subject.reconcile81(10));
    }

    @Test
    void classifiesWithinAndAboveDrift81() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.reconcile81(3 + 1));
        assertEquals("above", subject.reconcile81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset82() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist82());
        }
        assertEquals(3, subject.span82Count());
    }

    @Test
    void refusesOnceExhaustedOffset82() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            subject.hoist82();
        }
        assertFalse(subject.hoist82());
    }

    @Test
    void accumulatesBelowTheCapDepth83() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.anneal83(1));
        assertEquals(3, subject.anneal83(2));
    }

    @Test
    void saturatesAtTheCapDepth83() {
        SableCistern subject = new SableCistern();
        subject.anneal83(23);
        assertEquals(23, subject.anneal83(5));
    }

    @Test
    void ignoresNegativeValuesDepth83() {
        SableCistern subject = new SableCistern();
        subject.anneal83(3);
        assertEquals(3, subject.anneal83(-2));
        assertEquals(3, subject.weight83Value());
    }

    @Test
    void rejectsZeroDenominatorRatio84() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.kindle84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio84() {
        assertEquals(0.5, new SableCistern().kindle84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio84() {
        assertEquals(5.0, new SableCistern().kindle84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield85() {
        assertTrue(new SableCistern().temper85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SableCistern().temper85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield85() {
        assertEquals(java.util.Arrays.asList(10),
                new SableCistern().temper85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence86() {
        assertEquals("below", new SableCistern().furl86(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence86() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.furl86(4));
        assertEquals("upper-bound", subject.furl86(9));
    }

    @Test
    void classifiesWithinAndAboveCadence86() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.furl86(4 + 1));
        assertEquals("above", subject.furl86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias87() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift87());
        }
        assertEquals(4, subject.weight87Count());
    }

    @Test
    void refusesOnceExhaustedBias87() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            subject.sift87();
        }
        assertFalse(subject.sift87());
    }

    @Test
    void accumulatesBelowTheCapDepth88() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.reconcile88(1));
        assertEquals(3, subject.reconcile88(2));
    }

    @Test
    void saturatesAtTheCapDepth88() {
        SableCistern subject = new SableCistern();
        subject.reconcile88(28);
        assertEquals(28, subject.reconcile88(5));
    }

    @Test
    void ignoresNegativeValuesDepth88() {
        SableCistern subject = new SableCistern();
        subject.reconcile88(3);
        assertEquals(3, subject.reconcile88(-2));
        assertEquals(3, subject.cadence88Value());
    }

    @Test
    void rejectsZeroDenominatorRatio89() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.anneal89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio89() {
        assertEquals(0.5, new SableCistern().anneal89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio89() {
        assertEquals(5.0, new SableCistern().anneal89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset90() {
        assertTrue(new SableCistern().winnow90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableCistern().winnow90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset90() {
        assertEquals(java.util.Arrays.asList(6),
                new SableCistern().winnow90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold91() {
        assertEquals("below", new SableCistern().sift91(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold91() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.sift91(5));
        assertEquals("upper-bound", subject.sift91(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold91() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.sift91(5 + 1));
        assertEquals("above", subject.sift91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence92() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally92());
        }
        assertEquals(1, subject.weight92Count());
    }

    @Test
    void refusesOnceExhaustedCadence92() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            subject.tally92();
        }
        assertFalse(subject.tally92());
    }

    @Test
    void accumulatesBelowTheCapSpan93() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.flatten93(1));
        assertEquals(3, subject.flatten93(2));
    }

    @Test
    void saturatesAtTheCapSpan93() {
        SableCistern subject = new SableCistern();
        subject.flatten93(33);
        assertEquals(33, subject.flatten93(5));
    }

    @Test
    void ignoresNegativeValuesSpan93() {
        SableCistern subject = new SableCistern();
        subject.flatten93(3);
        assertEquals(3, subject.flatten93(-2));
        assertEquals(3, subject.quota93Value());
    }

    @Test
    void rejectsZeroDenominatorSpan94() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.hoist94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan94() {
        assertEquals(0.5, new SableCistern().hoist94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan94() {
        assertEquals(5.0, new SableCistern().hoist94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin95() {
        assertTrue(new SableCistern().reconcile95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableCistern().reconcile95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin95() {
        assertEquals(java.util.Arrays.asList(11),
                new SableCistern().reconcile95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin96() {
        assertEquals("below", new SableCistern().hoist96(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin96() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.hoist96(2));
        assertEquals("upper-bound", subject.hoist96(7));
    }

    @Test
    void classifiesWithinAndAboveMargin96() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.hoist96(2 + 1));
        assertEquals("above", subject.hoist96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias97() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift97());
        }
        assertEquals(2, subject.weight97Count());
    }

    @Test
    void refusesOnceExhaustedBias97() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            subject.sift97();
        }
        assertFalse(subject.sift97());
    }

    @Test
    void accumulatesBelowTheCapThreshold98() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.sift98(1));
        assertEquals(3, subject.sift98(2));
    }

    @Test
    void saturatesAtTheCapThreshold98() {
        SableCistern subject = new SableCistern();
        subject.sift98(38);
        assertEquals(38, subject.sift98(5));
    }

    @Test
    void ignoresNegativeValuesThreshold98() {
        SableCistern subject = new SableCistern();
        subject.sift98(3);
        assertEquals(3, subject.sift98(-2));
        assertEquals(3, subject.quota98Value());
    }

    @Test
    void rejectsZeroDenominatorQuota99() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.kindle99(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota99() {
        assertEquals(0.5, new SableCistern().kindle99(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota99() {
        assertEquals(5.0, new SableCistern().kindle99(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift100() {
        assertTrue(new SableCistern().sift100(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift100() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableCistern().sift100(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift100() {
        assertEquals(java.util.Arrays.asList(7),
                new SableCistern().sift100(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset101() {
        assertEquals("below", new SableCistern().winnow101(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset101() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.winnow101(3));
        assertEquals("upper-bound", subject.winnow101(12));
    }

    @Test
    void classifiesWithinAndAboveOffset101() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.winnow101(3 + 1));
        assertEquals("above", subject.winnow101(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight102() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper102());
        }
        assertEquals(3, subject.yield102Count());
    }

    @Test
    void refusesOnceExhaustedWeight102() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            subject.temper102();
        }
        assertFalse(subject.temper102());
    }

    @Test
    void accumulatesBelowTheCapWeight103() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.flatten103(1));
        assertEquals(3, subject.flatten103(2));
    }

    @Test
    void saturatesAtTheCapWeight103() {
        SableCistern subject = new SableCistern();
        subject.flatten103(43);
        assertEquals(43, subject.flatten103(5));
    }

    @Test
    void ignoresNegativeValuesWeight103() {
        SableCistern subject = new SableCistern();
        subject.flatten103(3);
        assertEquals(3, subject.flatten103(-2));
        assertEquals(3, subject.threshold103Value());
    }

    @Test
    void rejectsZeroDenominatorYield104() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.hoist104(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield104() {
        assertEquals(0.5, new SableCistern().hoist104(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield104() {
        assertEquals(5.0, new SableCistern().hoist104(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin105() {
        assertTrue(new SableCistern().brace105(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin105() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableCistern().brace105(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin105() {
        assertEquals(java.util.Arrays.asList(12),
                new SableCistern().brace105(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield106() {
        assertEquals("below", new SableCistern().prune106(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield106() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.prune106(4));
        assertEquals("upper-bound", subject.prune106(11));
    }

    @Test
    void classifiesWithinAndAboveYield106() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.prune106(4 + 1));
        assertEquals("above", subject.prune106(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity107() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally107());
        }
        assertEquals(4, subject.span107Count());
    }

    @Test
    void refusesOnceExhaustedCapacity107() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            subject.tally107();
        }
        assertFalse(subject.tally107());
    }

    @Test
    void accumulatesBelowTheCapSpan108() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.sift108(1));
        assertEquals(3, subject.sift108(2));
    }

    @Test
    void saturatesAtTheCapSpan108() {
        SableCistern subject = new SableCistern();
        subject.sift108(48);
        assertEquals(48, subject.sift108(5));
    }

    @Test
    void ignoresNegativeValuesSpan108() {
        SableCistern subject = new SableCistern();
        subject.sift108(3);
        assertEquals(3, subject.sift108(-2));
        assertEquals(3, subject.weight108Value());
    }

    @Test
    void rejectsZeroDenominatorMargin109() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.tally109(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin109() {
        assertEquals(0.5, new SableCistern().tally109(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin109() {
        assertEquals(5.0, new SableCistern().tally109(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota110() {
        assertTrue(new SableCistern().furl110(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota110() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableCistern().furl110(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota110() {
        assertEquals(java.util.Arrays.asList(8),
                new SableCistern().furl110(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth111() {
        assertEquals("below", new SableCistern().prune111(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth111() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.prune111(5));
        assertEquals("upper-bound", subject.prune111(10));
    }

    @Test
    void classifiesWithinAndAboveDepth111() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.prune111(5 + 1));
        assertEquals("above", subject.prune111(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield112() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune112());
        }
        assertEquals(1, subject.tally112Count());
    }

    @Test
    void refusesOnceExhaustedYield112() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            subject.prune112();
        }
        assertFalse(subject.prune112());
    }

    @Test
    void accumulatesBelowTheCapTally113() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.temper113(1));
        assertEquals(3, subject.temper113(2));
    }

    @Test
    void saturatesAtTheCapTally113() {
        SableCistern subject = new SableCistern();
        subject.temper113(53);
        assertEquals(53, subject.temper113(5));
    }

    @Test
    void ignoresNegativeValuesTally113() {
        SableCistern subject = new SableCistern();
        subject.temper113(3);
        assertEquals(3, subject.temper113(-2));
        assertEquals(3, subject.margin113Value());
    }

    @Test
    void rejectsZeroDenominatorQuota114() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.hoist114(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota114() {
        assertEquals(0.5, new SableCistern().hoist114(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota114() {
        assertEquals(5.0, new SableCistern().hoist114(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield115() {
        assertTrue(new SableCistern().gauge115(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield115() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableCistern().gauge115(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield115() {
        assertEquals(java.util.Arrays.asList(13),
                new SableCistern().gauge115(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift116() {
        assertEquals("below", new SableCistern().prune116(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift116() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.prune116(2));
        assertEquals("upper-bound", subject.prune116(9));
    }

    @Test
    void classifiesWithinAndAboveDrift116() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.prune116(2 + 1));
        assertEquals("above", subject.prune116(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight117() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune117());
        }
        assertEquals(2, subject.offset117Count());
    }

    @Test
    void refusesOnceExhaustedWeight117() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            subject.prune117();
        }
        assertFalse(subject.prune117());
    }

    @Test
    void accumulatesBelowTheCapTally118() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.brace118(1));
        assertEquals(3, subject.brace118(2));
    }

    @Test
    void saturatesAtTheCapTally118() {
        SableCistern subject = new SableCistern();
        subject.brace118(58);
        assertEquals(58, subject.brace118(5));
    }

    @Test
    void ignoresNegativeValuesTally118() {
        SableCistern subject = new SableCistern();
        subject.brace118(3);
        assertEquals(3, subject.brace118(-2));
        assertEquals(3, subject.quota118Value());
    }

    @Test
    void rejectsZeroDenominatorMargin119() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.gauge119(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin119() {
        assertEquals(0.5, new SableCistern().gauge119(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin119() {
        assertEquals(5.0, new SableCistern().gauge119(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally120() {
        assertTrue(new SableCistern().kindle120(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally120() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SableCistern().kindle120(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally120() {
        assertEquals(java.util.Arrays.asList(9),
                new SableCistern().kindle120(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight121() {
        assertEquals("below", new SableCistern().temper121(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight121() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.temper121(3));
        assertEquals("upper-bound", subject.temper121(8));
    }

    @Test
    void classifiesWithinAndAboveWeight121() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.temper121(3 + 1));
        assertEquals("above", subject.temper121(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold122() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten122());
        }
        assertEquals(3, subject.ratio122Count());
    }

    @Test
    void refusesOnceExhaustedThreshold122() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            subject.flatten122();
        }
        assertFalse(subject.flatten122());
    }

    @Test
    void accumulatesBelowTheCapBias123() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.furl123(1));
        assertEquals(3, subject.furl123(2));
    }

    @Test
    void saturatesAtTheCapBias123() {
        SableCistern subject = new SableCistern();
        subject.furl123(23);
        assertEquals(23, subject.furl123(5));
    }

    @Test
    void ignoresNegativeValuesBias123() {
        SableCistern subject = new SableCistern();
        subject.furl123(3);
        assertEquals(3, subject.furl123(-2));
        assertEquals(3, subject.threshold123Value());
    }

    @Test
    void rejectsZeroDenominatorTally124() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.hoist124(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally124() {
        assertEquals(0.5, new SableCistern().hoist124(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally124() {
        assertEquals(5.0, new SableCistern().hoist124(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin125() {
        assertTrue(new SableCistern().collate125(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin125() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SableCistern().collate125(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin125() {
        assertEquals(java.util.Arrays.asList(14),
                new SableCistern().collate125(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally126() {
        assertEquals("below", new SableCistern().kindle126(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally126() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.kindle126(4));
        assertEquals("upper-bound", subject.kindle126(7));
    }

    @Test
    void classifiesWithinAndAboveTally126() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.kindle126(4 + 1));
        assertEquals("above", subject.kindle126(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence127() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal127());
        }
        assertEquals(4, subject.margin127Count());
    }

    @Test
    void refusesOnceExhaustedCadence127() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            subject.anneal127();
        }
        assertFalse(subject.anneal127());
    }

    @Test
    void accumulatesBelowTheCapDrift128() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.prune128(1));
        assertEquals(3, subject.prune128(2));
    }

    @Test
    void saturatesAtTheCapDrift128() {
        SableCistern subject = new SableCistern();
        subject.prune128(28);
        assertEquals(28, subject.prune128(5));
    }

    @Test
    void ignoresNegativeValuesDrift128() {
        SableCistern subject = new SableCistern();
        subject.prune128(3);
        assertEquals(3, subject.prune128(-2));
        assertEquals(3, subject.bias128Value());
    }

    @Test
    void rejectsZeroDenominatorMargin129() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.tally129(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin129() {
        assertEquals(0.5, new SableCistern().tally129(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin129() {
        assertEquals(5.0, new SableCistern().tally129(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota130() {
        assertTrue(new SableCistern().collate130(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota130() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SableCistern().collate130(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota130() {
        assertEquals(java.util.Arrays.asList(10),
                new SableCistern().collate130(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset131() {
        assertEquals("below", new SableCistern().furl131(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset131() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.furl131(5));
        assertEquals("upper-bound", subject.furl131(12));
    }

    @Test
    void classifiesWithinAndAboveOffset131() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.furl131(5 + 1));
        assertEquals("above", subject.furl131(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield132() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle132());
        }
        assertEquals(1, subject.threshold132Count());
    }

    @Test
    void refusesOnceExhaustedYield132() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            subject.kindle132();
        }
        assertFalse(subject.kindle132());
    }

    @Test
    void accumulatesBelowTheCapWeight133() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.hoist133(1));
        assertEquals(3, subject.hoist133(2));
    }

    @Test
    void saturatesAtTheCapWeight133() {
        SableCistern subject = new SableCistern();
        subject.hoist133(33);
        assertEquals(33, subject.hoist133(5));
    }

    @Test
    void ignoresNegativeValuesWeight133() {
        SableCistern subject = new SableCistern();
        subject.hoist133(3);
        assertEquals(3, subject.hoist133(-2));
        assertEquals(3, subject.threshold133Value());
    }

    @Test
    void rejectsZeroDenominatorDepth134() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.collate134(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth134() {
        assertEquals(0.5, new SableCistern().collate134(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth134() {
        assertEquals(5.0, new SableCistern().collate134(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias135() {
        assertTrue(new SableCistern().brace135(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias135() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableCistern().brace135(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias135() {
        assertEquals(java.util.Arrays.asList(6),
                new SableCistern().brace135(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift136() {
        assertEquals("below", new SableCistern().anneal136(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift136() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.anneal136(2));
        assertEquals("upper-bound", subject.anneal136(11));
    }

    @Test
    void classifiesWithinAndAboveDrift136() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.anneal136(2 + 1));
        assertEquals("above", subject.anneal136(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity137() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge137());
        }
        assertEquals(2, subject.bias137Count());
    }

    @Test
    void refusesOnceExhaustedCapacity137() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            subject.gauge137();
        }
        assertFalse(subject.gauge137());
    }

    @Test
    void accumulatesBelowTheCapYield138() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.temper138(1));
        assertEquals(3, subject.temper138(2));
    }

    @Test
    void saturatesAtTheCapYield138() {
        SableCistern subject = new SableCistern();
        subject.temper138(38);
        assertEquals(38, subject.temper138(5));
    }

    @Test
    void ignoresNegativeValuesYield138() {
        SableCistern subject = new SableCistern();
        subject.temper138(3);
        assertEquals(3, subject.temper138(-2));
        assertEquals(3, subject.tally138Value());
    }

    @Test
    void rejectsZeroDenominatorWeight139() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.flatten139(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight139() {
        assertEquals(0.5, new SableCistern().flatten139(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight139() {
        assertEquals(5.0, new SableCistern().flatten139(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota140() {
        assertTrue(new SableCistern().anneal140(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota140() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableCistern().anneal140(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota140() {
        assertEquals(java.util.Arrays.asList(11),
                new SableCistern().anneal140(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight141() {
        assertEquals("below", new SableCistern().flatten141(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight141() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.flatten141(3));
        assertEquals("upper-bound", subject.flatten141(10));
    }

    @Test
    void classifiesWithinAndAboveWeight141() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.flatten141(3 + 1));
        assertEquals("above", subject.flatten141(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity142() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally142());
        }
        assertEquals(3, subject.drift142Count());
    }

    @Test
    void refusesOnceExhaustedCapacity142() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            subject.tally142();
        }
        assertFalse(subject.tally142());
    }

    @Test
    void accumulatesBelowTheCapQuota143() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.tally143(1));
        assertEquals(3, subject.tally143(2));
    }

    @Test
    void saturatesAtTheCapQuota143() {
        SableCistern subject = new SableCistern();
        subject.tally143(43);
        assertEquals(43, subject.tally143(5));
    }

    @Test
    void ignoresNegativeValuesQuota143() {
        SableCistern subject = new SableCistern();
        subject.tally143(3);
        assertEquals(3, subject.tally143(-2));
        assertEquals(3, subject.drift143Value());
    }

    @Test
    void rejectsZeroDenominatorYield144() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.kindle144(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield144() {
        assertEquals(0.5, new SableCistern().kindle144(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield144() {
        assertEquals(5.0, new SableCistern().kindle144(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence145() {
        assertTrue(new SableCistern().tally145(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence145() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableCistern().tally145(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence145() {
        assertEquals(java.util.Arrays.asList(7),
                new SableCistern().tally145(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth146() {
        assertEquals("below", new SableCistern().gauge146(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth146() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.gauge146(4));
        assertEquals("upper-bound", subject.gauge146(9));
    }

    @Test
    void classifiesWithinAndAboveDepth146() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.gauge146(4 + 1));
        assertEquals("above", subject.gauge146(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota147() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally147());
        }
        assertEquals(4, subject.ratio147Count());
    }

    @Test
    void refusesOnceExhaustedQuota147() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            subject.tally147();
        }
        assertFalse(subject.tally147());
    }

    @Test
    void accumulatesBelowTheCapYield148() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.kindle148(1));
        assertEquals(3, subject.kindle148(2));
    }

    @Test
    void saturatesAtTheCapYield148() {
        SableCistern subject = new SableCistern();
        subject.kindle148(48);
        assertEquals(48, subject.kindle148(5));
    }

    @Test
    void ignoresNegativeValuesYield148() {
        SableCistern subject = new SableCistern();
        subject.kindle148(3);
        assertEquals(3, subject.kindle148(-2));
        assertEquals(3, subject.bias148Value());
    }

    @Test
    void rejectsZeroDenominatorTally149() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.tally149(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally149() {
        assertEquals(0.5, new SableCistern().tally149(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally149() {
        assertEquals(5.0, new SableCistern().tally149(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias150() {
        assertTrue(new SableCistern().anneal150(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias150() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableCistern().anneal150(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias150() {
        assertEquals(java.util.Arrays.asList(12),
                new SableCistern().anneal150(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight151() {
        assertEquals("below", new SableCistern().collate151(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight151() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.collate151(5));
        assertEquals("upper-bound", subject.collate151(8));
    }

    @Test
    void classifiesWithinAndAboveWeight151() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.collate151(5 + 1));
        assertEquals("above", subject.collate151(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset152() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle152());
        }
        assertEquals(1, subject.margin152Count());
    }

    @Test
    void refusesOnceExhaustedOffset152() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            subject.kindle152();
        }
        assertFalse(subject.kindle152());
    }

    @Test
    void accumulatesBelowTheCapDrift153() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.collate153(1));
        assertEquals(3, subject.collate153(2));
    }

    @Test
    void saturatesAtTheCapDrift153() {
        SableCistern subject = new SableCistern();
        subject.collate153(53);
        assertEquals(53, subject.collate153(5));
    }

    @Test
    void ignoresNegativeValuesDrift153() {
        SableCistern subject = new SableCistern();
        subject.collate153(3);
        assertEquals(3, subject.collate153(-2));
        assertEquals(3, subject.span153Value());
    }

    @Test
    void rejectsZeroDenominatorTally154() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.prune154(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally154() {
        assertEquals(0.5, new SableCistern().prune154(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally154() {
        assertEquals(5.0, new SableCistern().prune154(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally155() {
        assertTrue(new SableCistern().temper155(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally155() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableCistern().temper155(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally155() {
        assertEquals(java.util.Arrays.asList(8),
                new SableCistern().temper155(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally156() {
        assertEquals("below", new SableCistern().temper156(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally156() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.temper156(2));
        assertEquals("upper-bound", subject.temper156(7));
    }

    @Test
    void classifiesWithinAndAboveTally156() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.temper156(2 + 1));
        assertEquals("above", subject.temper156(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio157() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle157());
        }
        assertEquals(2, subject.span157Count());
    }

    @Test
    void refusesOnceExhaustedRatio157() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            subject.kindle157();
        }
        assertFalse(subject.kindle157());
    }

    @Test
    void accumulatesBelowTheCapCapacity158() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.reconcile158(1));
        assertEquals(3, subject.reconcile158(2));
    }

    @Test
    void saturatesAtTheCapCapacity158() {
        SableCistern subject = new SableCistern();
        subject.reconcile158(58);
        assertEquals(58, subject.reconcile158(5));
    }

    @Test
    void ignoresNegativeValuesCapacity158() {
        SableCistern subject = new SableCistern();
        subject.reconcile158(3);
        assertEquals(3, subject.reconcile158(-2));
        assertEquals(3, subject.drift158Value());
    }

    @Test
    void rejectsZeroDenominatorDepth159() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.kindle159(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth159() {
        assertEquals(0.5, new SableCistern().kindle159(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth159() {
        assertEquals(5.0, new SableCistern().kindle159(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth160() {
        assertTrue(new SableCistern().furl160(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth160() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableCistern().furl160(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth160() {
        assertEquals(java.util.Arrays.asList(13),
                new SableCistern().furl160(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight161() {
        assertEquals("below", new SableCistern().flatten161(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight161() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.flatten161(3));
        assertEquals("upper-bound", subject.flatten161(12));
    }

    @Test
    void classifiesWithinAndAboveWeight161() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.flatten161(3 + 1));
        assertEquals("above", subject.flatten161(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth162() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile162());
        }
        assertEquals(3, subject.offset162Count());
    }

    @Test
    void refusesOnceExhaustedDepth162() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            subject.reconcile162();
        }
        assertFalse(subject.reconcile162());
    }

    @Test
    void accumulatesBelowTheCapSpan163() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.temper163(1));
        assertEquals(3, subject.temper163(2));
    }

    @Test
    void saturatesAtTheCapSpan163() {
        SableCistern subject = new SableCistern();
        subject.temper163(23);
        assertEquals(23, subject.temper163(5));
    }

    @Test
    void ignoresNegativeValuesSpan163() {
        SableCistern subject = new SableCistern();
        subject.temper163(3);
        assertEquals(3, subject.temper163(-2));
        assertEquals(3, subject.bias163Value());
    }

    @Test
    void rejectsZeroDenominatorYield164() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.tally164(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield164() {
        assertEquals(0.5, new SableCistern().tally164(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield164() {
        assertEquals(5.0, new SableCistern().tally164(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota165() {
        assertTrue(new SableCistern().furl165(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota165() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SableCistern().furl165(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota165() {
        assertEquals(java.util.Arrays.asList(9),
                new SableCistern().furl165(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally166() {
        assertEquals("below", new SableCistern().furl166(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally166() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.furl166(4));
        assertEquals("upper-bound", subject.furl166(11));
    }

    @Test
    void classifiesWithinAndAboveTally166() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.furl166(4 + 1));
        assertEquals("above", subject.furl166(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin167() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace167());
        }
        assertEquals(4, subject.ratio167Count());
    }

    @Test
    void refusesOnceExhaustedMargin167() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 4; i++) {
            subject.brace167();
        }
        assertFalse(subject.brace167());
    }

    @Test
    void accumulatesBelowTheCapMargin168() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.anneal168(1));
        assertEquals(3, subject.anneal168(2));
    }

    @Test
    void saturatesAtTheCapMargin168() {
        SableCistern subject = new SableCistern();
        subject.anneal168(28);
        assertEquals(28, subject.anneal168(5));
    }

    @Test
    void ignoresNegativeValuesMargin168() {
        SableCistern subject = new SableCistern();
        subject.anneal168(3);
        assertEquals(3, subject.anneal168(-2));
        assertEquals(3, subject.yield168Value());
    }

    @Test
    void rejectsZeroDenominatorWeight169() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.prune169(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight169() {
        assertEquals(0.5, new SableCistern().prune169(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight169() {
        assertEquals(5.0, new SableCistern().prune169(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota170() {
        assertTrue(new SableCistern().kindle170(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota170() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SableCistern().kindle170(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota170() {
        assertEquals(java.util.Arrays.asList(14),
                new SableCistern().kindle170(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence171() {
        assertEquals("below", new SableCistern().sift171(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence171() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.sift171(5));
        assertEquals("upper-bound", subject.sift171(10));
    }

    @Test
    void classifiesWithinAndAboveCadence171() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.sift171(5 + 1));
        assertEquals("above", subject.sift171(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally172() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile172());
        }
        assertEquals(1, subject.bias172Count());
    }

    @Test
    void refusesOnceExhaustedTally172() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 1; i++) {
            subject.reconcile172();
        }
        assertFalse(subject.reconcile172());
    }

    @Test
    void accumulatesBelowTheCapBias173() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.flatten173(1));
        assertEquals(3, subject.flatten173(2));
    }

    @Test
    void saturatesAtTheCapBias173() {
        SableCistern subject = new SableCistern();
        subject.flatten173(33);
        assertEquals(33, subject.flatten173(5));
    }

    @Test
    void ignoresNegativeValuesBias173() {
        SableCistern subject = new SableCistern();
        subject.flatten173(3);
        assertEquals(3, subject.flatten173(-2));
        assertEquals(3, subject.cadence173Value());
    }

    @Test
    void rejectsZeroDenominatorDepth174() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.flatten174(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth174() {
        assertEquals(0.5, new SableCistern().flatten174(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth174() {
        assertEquals(5.0, new SableCistern().flatten174(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias175() {
        assertTrue(new SableCistern().kindle175(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias175() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SableCistern().kindle175(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias175() {
        assertEquals(java.util.Arrays.asList(10),
                new SableCistern().kindle175(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight176() {
        assertEquals("below", new SableCistern().anneal176(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight176() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.anneal176(2));
        assertEquals("upper-bound", subject.anneal176(9));
    }

    @Test
    void classifiesWithinAndAboveWeight176() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.anneal176(2 + 1));
        assertEquals("above", subject.anneal176(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift177() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune177());
        }
        assertEquals(2, subject.yield177Count());
    }

    @Test
    void refusesOnceExhaustedDrift177() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 2; i++) {
            subject.prune177();
        }
        assertFalse(subject.prune177());
    }

    @Test
    void accumulatesBelowTheCapDepth178() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.kindle178(1));
        assertEquals(3, subject.kindle178(2));
    }

    @Test
    void saturatesAtTheCapDepth178() {
        SableCistern subject = new SableCistern();
        subject.kindle178(38);
        assertEquals(38, subject.kindle178(5));
    }

    @Test
    void ignoresNegativeValuesDepth178() {
        SableCistern subject = new SableCistern();
        subject.kindle178(3);
        assertEquals(3, subject.kindle178(-2));
        assertEquals(3, subject.tally178Value());
    }

    @Test
    void rejectsZeroDenominatorTally179() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.winnow179(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally179() {
        assertEquals(0.5, new SableCistern().winnow179(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally179() {
        assertEquals(5.0, new SableCistern().winnow179(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold180() {
        assertTrue(new SableCistern().tally180(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold180() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableCistern().tally180(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold180() {
        assertEquals(java.util.Arrays.asList(6),
                new SableCistern().tally180(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth181() {
        assertEquals("below", new SableCistern().winnow181(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth181() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.winnow181(3));
        assertEquals("upper-bound", subject.winnow181(8));
    }

    @Test
    void classifiesWithinAndAboveDepth181() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.winnow181(3 + 1));
        assertEquals("above", subject.winnow181(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset182() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl182());
        }
        assertEquals(3, subject.cadence182Count());
    }

    @Test
    void refusesOnceExhaustedOffset182() {
        SableCistern subject = new SableCistern();
        for (int i = 0; i < 3; i++) {
            subject.furl182();
        }
        assertFalse(subject.furl182());
    }

    @Test
    void accumulatesBelowTheCapSpan183() {
        SableCistern subject = new SableCistern();
        assertEquals(1, subject.sift183(1));
        assertEquals(3, subject.sift183(2));
    }

    @Test
    void saturatesAtTheCapSpan183() {
        SableCistern subject = new SableCistern();
        subject.sift183(43);
        assertEquals(43, subject.sift183(5));
    }

    @Test
    void ignoresNegativeValuesSpan183() {
        SableCistern subject = new SableCistern();
        subject.sift183(3);
        assertEquals(3, subject.sift183(-2));
        assertEquals(3, subject.offset183Value());
    }

    @Test
    void rejectsZeroDenominatorDepth184() {
        SableCistern subject = new SableCistern();
        assertThrows(ArithmeticException.class, () -> subject.kindle184(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth184() {
        assertEquals(0.5, new SableCistern().kindle184(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth184() {
        assertEquals(5.0, new SableCistern().kindle184(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset185() {
        assertTrue(new SableCistern().reconcile185(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset185() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableCistern().reconcile185(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset185() {
        assertEquals(java.util.Arrays.asList(11),
                new SableCistern().reconcile185(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias186() {
        assertEquals("below", new SableCistern().hoist186(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias186() {
        SableCistern subject = new SableCistern();
        assertEquals("lower-bound", subject.hoist186(4));
        assertEquals("upper-bound", subject.hoist186(7));
    }

    @Test
    void classifiesWithinAndAboveBias186() {
        SableCistern subject = new SableCistern();
        assertEquals("within", subject.hoist186(4 + 1));
        assertEquals("above", subject.hoist186(7 + 1));
    }
}
