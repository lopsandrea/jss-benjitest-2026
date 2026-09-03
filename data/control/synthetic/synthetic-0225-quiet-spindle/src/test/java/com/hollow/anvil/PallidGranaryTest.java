package com.hollow.anvil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidGranaryTest {

    @Test
    void accumulatesBelowTheCapOffset0() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.temper0(1));
        assertEquals(3, subject.temper0(2));
    }

    @Test
    void saturatesAtTheCapOffset0() {
        PallidGranary subject = new PallidGranary();
        subject.temper0(20);
        assertEquals(20, subject.temper0(5));
    }

    @Test
    void ignoresNegativeValuesOffset0() {
        PallidGranary subject = new PallidGranary();
        subject.temper0(3);
        assertEquals(3, subject.temper0(-2));
        assertEquals(3, subject.depth0Value());
    }

    @Test
    void rejectsZeroDenominatorWeight1() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.anneal1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight1() {
        assertEquals(0.5, new PallidGranary().anneal1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight1() {
        assertEquals(2.0, new PallidGranary().anneal1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift2() {
        assertTrue(new PallidGranary().prune2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidGranary().prune2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift2() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidGranary().prune2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan3() {
        assertEquals("below", new PallidGranary().prune3(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan3() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.prune3(5));
        assertEquals("upper-bound", subject.prune3(10));
    }

    @Test
    void classifiesWithinAndAboveSpan3() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.prune3(5 + 1));
        assertEquals("above", subject.prune3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence4() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal4());
        }
        assertEquals(1, subject.drift4Count());
    }

    @Test
    void refusesOnceExhaustedCadence4() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 1; i++) {
            subject.anneal4();
        }
        assertFalse(subject.anneal4());
    }

    @Test
    void accumulatesBelowTheCapSpan5() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.temper5(1));
        assertEquals(3, subject.temper5(2));
    }

    @Test
    void saturatesAtTheCapSpan5() {
        PallidGranary subject = new PallidGranary();
        subject.temper5(25);
        assertEquals(25, subject.temper5(5));
    }

    @Test
    void ignoresNegativeValuesSpan5() {
        PallidGranary subject = new PallidGranary();
        subject.temper5(3);
        assertEquals(3, subject.temper5(-2));
        assertEquals(3, subject.threshold5Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity6() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.furl6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity6() {
        assertEquals(0.5, new PallidGranary().furl6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity6() {
        assertEquals(2.0, new PallidGranary().furl6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield7() {
        assertTrue(new PallidGranary().winnow7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidGranary().winnow7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield7() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidGranary().winnow7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias8() {
        assertEquals("below", new PallidGranary().kindle8(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias8() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.kindle8(2));
        assertEquals("upper-bound", subject.kindle8(9));
    }

    @Test
    void classifiesWithinAndAboveBias8() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.kindle8(2 + 1));
        assertEquals("above", subject.kindle8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence9() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper9());
        }
        assertEquals(2, subject.yield9Count());
    }

    @Test
    void refusesOnceExhaustedCadence9() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 2; i++) {
            subject.temper9();
        }
        assertFalse(subject.temper9());
    }

    @Test
    void accumulatesBelowTheCapCapacity10() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.anneal10(1));
        assertEquals(3, subject.anneal10(2));
    }

    @Test
    void saturatesAtTheCapCapacity10() {
        PallidGranary subject = new PallidGranary();
        subject.anneal10(30);
        assertEquals(30, subject.anneal10(5));
    }

    @Test
    void ignoresNegativeValuesCapacity10() {
        PallidGranary subject = new PallidGranary();
        subject.anneal10(3);
        assertEquals(3, subject.anneal10(-2));
        assertEquals(3, subject.yield10Value());
    }

    @Test
    void rejectsZeroDenominatorYield11() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.reconcile11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield11() {
        assertEquals(0.5, new PallidGranary().reconcile11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield11() {
        assertEquals(2.0, new PallidGranary().reconcile11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias12() {
        assertTrue(new PallidGranary().tally12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new PallidGranary().tally12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias12() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidGranary().tally12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity13() {
        assertEquals("below", new PallidGranary().temper13(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity13() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.temper13(3));
        assertEquals("upper-bound", subject.temper13(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity13() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.temper13(3 + 1));
        assertEquals("above", subject.temper13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio14() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle14());
        }
        assertEquals(3, subject.tally14Count());
    }

    @Test
    void refusesOnceExhaustedRatio14() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 3; i++) {
            subject.kindle14();
        }
        assertFalse(subject.kindle14());
    }

    @Test
    void accumulatesBelowTheCapCapacity15() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.kindle15(1));
        assertEquals(3, subject.kindle15(2));
    }

    @Test
    void saturatesAtTheCapCapacity15() {
        PallidGranary subject = new PallidGranary();
        subject.kindle15(35);
        assertEquals(35, subject.kindle15(5));
    }

    @Test
    void ignoresNegativeValuesCapacity15() {
        PallidGranary subject = new PallidGranary();
        subject.kindle15(3);
        assertEquals(3, subject.kindle15(-2));
        assertEquals(3, subject.margin15Value());
    }

    @Test
    void rejectsZeroDenominatorMargin16() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.prune16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin16() {
        assertEquals(0.5, new PallidGranary().prune16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin16() {
        assertEquals(2.0, new PallidGranary().prune16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota17() {
        assertTrue(new PallidGranary().tally17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new PallidGranary().tally17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota17() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidGranary().tally17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth18() {
        assertEquals("below", new PallidGranary().anneal18(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth18() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.anneal18(4));
        assertEquals("upper-bound", subject.anneal18(7));
    }

    @Test
    void classifiesWithinAndAboveDepth18() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.anneal18(4 + 1));
        assertEquals("above", subject.anneal18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio19() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle19());
        }
        assertEquals(4, subject.drift19Count());
    }

    @Test
    void refusesOnceExhaustedRatio19() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 4; i++) {
            subject.kindle19();
        }
        assertFalse(subject.kindle19());
    }

    @Test
    void accumulatesBelowTheCapWeight20() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.kindle20(1));
        assertEquals(3, subject.kindle20(2));
    }

    @Test
    void saturatesAtTheCapWeight20() {
        PallidGranary subject = new PallidGranary();
        subject.kindle20(40);
        assertEquals(40, subject.kindle20(5));
    }

    @Test
    void ignoresNegativeValuesWeight20() {
        PallidGranary subject = new PallidGranary();
        subject.kindle20(3);
        assertEquals(3, subject.kindle20(-2));
        assertEquals(3, subject.threshold20Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold21() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.hoist21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold21() {
        assertEquals(0.5, new PallidGranary().hoist21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold21() {
        assertEquals(2.0, new PallidGranary().hoist21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally22() {
        assertTrue(new PallidGranary().flatten22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new PallidGranary().flatten22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally22() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidGranary().flatten22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally23() {
        assertEquals("below", new PallidGranary().prune23(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally23() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.prune23(5));
        assertEquals("upper-bound", subject.prune23(12));
    }

    @Test
    void classifiesWithinAndAboveTally23() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.prune23(5 + 1));
        assertEquals("above", subject.prune23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield24() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge24());
        }
        assertEquals(1, subject.bias24Count());
    }

    @Test
    void refusesOnceExhaustedYield24() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 1; i++) {
            subject.gauge24();
        }
        assertFalse(subject.gauge24());
    }

    @Test
    void accumulatesBelowTheCapSpan25() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.gauge25(1));
        assertEquals(3, subject.gauge25(2));
    }

    @Test
    void saturatesAtTheCapSpan25() {
        PallidGranary subject = new PallidGranary();
        subject.gauge25(45);
        assertEquals(45, subject.gauge25(5));
    }

    @Test
    void ignoresNegativeValuesSpan25() {
        PallidGranary subject = new PallidGranary();
        subject.gauge25(3);
        assertEquals(3, subject.gauge25(-2));
        assertEquals(3, subject.drift25Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold26() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.gauge26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold26() {
        assertEquals(0.5, new PallidGranary().gauge26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold26() {
        assertEquals(2.0, new PallidGranary().gauge26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth27() {
        assertTrue(new PallidGranary().sift27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new PallidGranary().sift27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth27() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidGranary().sift27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield28() {
        assertEquals("below", new PallidGranary().flatten28(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield28() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.flatten28(2));
        assertEquals("upper-bound", subject.flatten28(11));
    }

    @Test
    void classifiesWithinAndAboveYield28() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.flatten28(2 + 1));
        assertEquals("above", subject.flatten28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan29() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally29());
        }
        assertEquals(2, subject.margin29Count());
    }

    @Test
    void refusesOnceExhaustedSpan29() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 2; i++) {
            subject.tally29();
        }
        assertFalse(subject.tally29());
    }

    @Test
    void accumulatesBelowTheCapDrift30() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.sift30(1));
        assertEquals(3, subject.sift30(2));
    }

    @Test
    void saturatesAtTheCapDrift30() {
        PallidGranary subject = new PallidGranary();
        subject.sift30(50);
        assertEquals(50, subject.sift30(5));
    }

    @Test
    void ignoresNegativeValuesDrift30() {
        PallidGranary subject = new PallidGranary();
        subject.sift30(3);
        assertEquals(3, subject.sift30(-2));
        assertEquals(3, subject.span30Value());
    }

    @Test
    void rejectsZeroDenominatorBias31() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.collate31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias31() {
        assertEquals(0.5, new PallidGranary().collate31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias31() {
        assertEquals(2.0, new PallidGranary().collate31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield32() {
        assertTrue(new PallidGranary().hoist32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new PallidGranary().hoist32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield32() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidGranary().hoist32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias33() {
        assertEquals("below", new PallidGranary().collate33(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias33() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.collate33(3));
        assertEquals("upper-bound", subject.collate33(10));
    }

    @Test
    void classifiesWithinAndAboveBias33() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.collate33(3 + 1));
        assertEquals("above", subject.collate33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence34() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten34());
        }
        assertEquals(3, subject.margin34Count());
    }

    @Test
    void refusesOnceExhaustedCadence34() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 3; i++) {
            subject.flatten34();
        }
        assertFalse(subject.flatten34());
    }

    @Test
    void accumulatesBelowTheCapQuota35() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.temper35(1));
        assertEquals(3, subject.temper35(2));
    }

    @Test
    void saturatesAtTheCapQuota35() {
        PallidGranary subject = new PallidGranary();
        subject.temper35(55);
        assertEquals(55, subject.temper35(5));
    }

    @Test
    void ignoresNegativeValuesQuota35() {
        PallidGranary subject = new PallidGranary();
        subject.temper35(3);
        assertEquals(3, subject.temper35(-2));
        assertEquals(3, subject.bias35Value());
    }

    @Test
    void rejectsZeroDenominatorRatio36() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.gauge36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio36() {
        assertEquals(0.5, new PallidGranary().gauge36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio36() {
        assertEquals(2.0, new PallidGranary().gauge36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally37() {
        assertTrue(new PallidGranary().winnow37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new PallidGranary().winnow37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally37() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidGranary().winnow37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight38() {
        assertEquals("below", new PallidGranary().tally38(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight38() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.tally38(4));
        assertEquals("upper-bound", subject.tally38(9));
    }

    @Test
    void classifiesWithinAndAboveWeight38() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.tally38(4 + 1));
        assertEquals("above", subject.tally38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold39() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune39());
        }
        assertEquals(4, subject.span39Count());
    }

    @Test
    void refusesOnceExhaustedThreshold39() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 4; i++) {
            subject.prune39();
        }
        assertFalse(subject.prune39());
    }

    @Test
    void accumulatesBelowTheCapCadence40() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.gauge40(1));
        assertEquals(3, subject.gauge40(2));
    }

    @Test
    void saturatesAtTheCapCadence40() {
        PallidGranary subject = new PallidGranary();
        subject.gauge40(20);
        assertEquals(20, subject.gauge40(5));
    }

    @Test
    void ignoresNegativeValuesCadence40() {
        PallidGranary subject = new PallidGranary();
        subject.gauge40(3);
        assertEquals(3, subject.gauge40(-2));
        assertEquals(3, subject.tally40Value());
    }

    @Test
    void rejectsZeroDenominatorRatio41() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.furl41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio41() {
        assertEquals(0.5, new PallidGranary().furl41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio41() {
        assertEquals(2.0, new PallidGranary().furl41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight42() {
        assertTrue(new PallidGranary().gauge42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new PallidGranary().gauge42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight42() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidGranary().gauge42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold43() {
        assertEquals("below", new PallidGranary().gauge43(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold43() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.gauge43(5));
        assertEquals("upper-bound", subject.gauge43(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold43() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.gauge43(5 + 1));
        assertEquals("above", subject.gauge43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan44() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl44());
        }
        assertEquals(1, subject.margin44Count());
    }

    @Test
    void refusesOnceExhaustedSpan44() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 1; i++) {
            subject.furl44();
        }
        assertFalse(subject.furl44());
    }

    @Test
    void accumulatesBelowTheCapThreshold45() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.prune45(1));
        assertEquals(3, subject.prune45(2));
    }

    @Test
    void saturatesAtTheCapThreshold45() {
        PallidGranary subject = new PallidGranary();
        subject.prune45(25);
        assertEquals(25, subject.prune45(5));
    }

    @Test
    void ignoresNegativeValuesThreshold45() {
        PallidGranary subject = new PallidGranary();
        subject.prune45(3);
        assertEquals(3, subject.prune45(-2));
        assertEquals(3, subject.tally45Value());
    }

    @Test
    void rejectsZeroDenominatorOffset46() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.kindle46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset46() {
        assertEquals(0.5, new PallidGranary().kindle46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset46() {
        assertEquals(2.0, new PallidGranary().kindle46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin47() {
        assertTrue(new PallidGranary().reconcile47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidGranary().reconcile47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin47() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidGranary().reconcile47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence48() {
        assertEquals("below", new PallidGranary().flatten48(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence48() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.flatten48(2));
        assertEquals("upper-bound", subject.flatten48(7));
    }

    @Test
    void classifiesWithinAndAboveCadence48() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.flatten48(2 + 1));
        assertEquals("above", subject.flatten48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset49() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow49());
        }
        assertEquals(2, subject.margin49Count());
    }

    @Test
    void refusesOnceExhaustedOffset49() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 2; i++) {
            subject.winnow49();
        }
        assertFalse(subject.winnow49());
    }

    @Test
    void accumulatesBelowTheCapThreshold50() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.hoist50(1));
        assertEquals(3, subject.hoist50(2));
    }

    @Test
    void saturatesAtTheCapThreshold50() {
        PallidGranary subject = new PallidGranary();
        subject.hoist50(30);
        assertEquals(30, subject.hoist50(5));
    }

    @Test
    void ignoresNegativeValuesThreshold50() {
        PallidGranary subject = new PallidGranary();
        subject.hoist50(3);
        assertEquals(3, subject.hoist50(-2));
        assertEquals(3, subject.span50Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold51() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.winnow51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold51() {
        assertEquals(0.5, new PallidGranary().winnow51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold51() {
        assertEquals(2.0, new PallidGranary().winnow51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio52() {
        assertTrue(new PallidGranary().sift52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidGranary().sift52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio52() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidGranary().sift52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan53() {
        assertEquals("below", new PallidGranary().hoist53(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan53() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.hoist53(3));
        assertEquals("upper-bound", subject.hoist53(12));
    }

    @Test
    void classifiesWithinAndAboveSpan53() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.hoist53(3 + 1));
        assertEquals("above", subject.hoist53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth54() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal54());
        }
        assertEquals(3, subject.drift54Count());
    }

    @Test
    void refusesOnceExhaustedDepth54() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 3; i++) {
            subject.anneal54();
        }
        assertFalse(subject.anneal54());
    }

    @Test
    void accumulatesBelowTheCapCadence55() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.winnow55(1));
        assertEquals(3, subject.winnow55(2));
    }

    @Test
    void saturatesAtTheCapCadence55() {
        PallidGranary subject = new PallidGranary();
        subject.winnow55(35);
        assertEquals(35, subject.winnow55(5));
    }

    @Test
    void ignoresNegativeValuesCadence55() {
        PallidGranary subject = new PallidGranary();
        subject.winnow55(3);
        assertEquals(3, subject.winnow55(-2));
        assertEquals(3, subject.drift55Value());
    }

    @Test
    void rejectsZeroDenominatorWeight56() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.hoist56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight56() {
        assertEquals(0.5, new PallidGranary().hoist56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight56() {
        assertEquals(2.0, new PallidGranary().hoist56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield57() {
        assertTrue(new PallidGranary().sift57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new PallidGranary().sift57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield57() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidGranary().sift57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence58() {
        assertEquals("below", new PallidGranary().anneal58(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence58() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.anneal58(4));
        assertEquals("upper-bound", subject.anneal58(11));
    }

    @Test
    void classifiesWithinAndAboveCadence58() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.anneal58(4 + 1));
        assertEquals("above", subject.anneal58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth59() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist59());
        }
        assertEquals(4, subject.offset59Count());
    }

    @Test
    void refusesOnceExhaustedDepth59() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 4; i++) {
            subject.hoist59();
        }
        assertFalse(subject.hoist59());
    }

    @Test
    void accumulatesBelowTheCapOffset60() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.anneal60(1));
        assertEquals(3, subject.anneal60(2));
    }

    @Test
    void saturatesAtTheCapOffset60() {
        PallidGranary subject = new PallidGranary();
        subject.anneal60(40);
        assertEquals(40, subject.anneal60(5));
    }

    @Test
    void ignoresNegativeValuesOffset60() {
        PallidGranary subject = new PallidGranary();
        subject.anneal60(3);
        assertEquals(3, subject.anneal60(-2));
        assertEquals(3, subject.tally60Value());
    }

    @Test
    void rejectsZeroDenominatorOffset61() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.tally61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset61() {
        assertEquals(0.5, new PallidGranary().tally61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset61() {
        assertEquals(2.0, new PallidGranary().tally61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold62() {
        assertTrue(new PallidGranary().tally62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new PallidGranary().tally62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold62() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidGranary().tally62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield63() {
        assertEquals("below", new PallidGranary().winnow63(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield63() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.winnow63(5));
        assertEquals("upper-bound", subject.winnow63(10));
    }

    @Test
    void classifiesWithinAndAboveYield63() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.winnow63(5 + 1));
        assertEquals("above", subject.winnow63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield64() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally64());
        }
        assertEquals(1, subject.ratio64Count());
    }

    @Test
    void refusesOnceExhaustedYield64() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 1; i++) {
            subject.tally64();
        }
        assertFalse(subject.tally64());
    }

    @Test
    void accumulatesBelowTheCapThreshold65() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.tally65(1));
        assertEquals(3, subject.tally65(2));
    }

    @Test
    void saturatesAtTheCapThreshold65() {
        PallidGranary subject = new PallidGranary();
        subject.tally65(45);
        assertEquals(45, subject.tally65(5));
    }

    @Test
    void ignoresNegativeValuesThreshold65() {
        PallidGranary subject = new PallidGranary();
        subject.tally65(3);
        assertEquals(3, subject.tally65(-2));
        assertEquals(3, subject.depth65Value());
    }

    @Test
    void rejectsZeroDenominatorTally66() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.collate66(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally66() {
        assertEquals(0.5, new PallidGranary().collate66(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally66() {
        assertEquals(2.0, new PallidGranary().collate66(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity67() {
        assertTrue(new PallidGranary().hoist67(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity67() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new PallidGranary().hoist67(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity67() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidGranary().hoist67(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight68() {
        assertEquals("below", new PallidGranary().reconcile68(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight68() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.reconcile68(2));
        assertEquals("upper-bound", subject.reconcile68(9));
    }

    @Test
    void classifiesWithinAndAboveWeight68() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.reconcile68(2 + 1));
        assertEquals("above", subject.reconcile68(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias69() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift69());
        }
        assertEquals(2, subject.quota69Count());
    }

    @Test
    void refusesOnceExhaustedBias69() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 2; i++) {
            subject.sift69();
        }
        assertFalse(subject.sift69());
    }

    @Test
    void accumulatesBelowTheCapDepth70() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.anneal70(1));
        assertEquals(3, subject.anneal70(2));
    }

    @Test
    void saturatesAtTheCapDepth70() {
        PallidGranary subject = new PallidGranary();
        subject.anneal70(50);
        assertEquals(50, subject.anneal70(5));
    }

    @Test
    void ignoresNegativeValuesDepth70() {
        PallidGranary subject = new PallidGranary();
        subject.anneal70(3);
        assertEquals(3, subject.anneal70(-2));
        assertEquals(3, subject.cadence70Value());
    }

    @Test
    void rejectsZeroDenominatorWeight71() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.furl71(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight71() {
        assertEquals(0.5, new PallidGranary().furl71(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight71() {
        assertEquals(2.0, new PallidGranary().furl71(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield72() {
        assertTrue(new PallidGranary().flatten72(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield72() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new PallidGranary().flatten72(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield72() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidGranary().flatten72(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth73() {
        assertEquals("below", new PallidGranary().prune73(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth73() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.prune73(3));
        assertEquals("upper-bound", subject.prune73(8));
    }

    @Test
    void classifiesWithinAndAboveDepth73() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.prune73(3 + 1));
        assertEquals("above", subject.prune73(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift74() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle74());
        }
        assertEquals(3, subject.yield74Count());
    }

    @Test
    void refusesOnceExhaustedDrift74() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 3; i++) {
            subject.kindle74();
        }
        assertFalse(subject.kindle74());
    }

    @Test
    void accumulatesBelowTheCapSpan75() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.furl75(1));
        assertEquals(3, subject.furl75(2));
    }

    @Test
    void saturatesAtTheCapSpan75() {
        PallidGranary subject = new PallidGranary();
        subject.furl75(55);
        assertEquals(55, subject.furl75(5));
    }

    @Test
    void ignoresNegativeValuesSpan75() {
        PallidGranary subject = new PallidGranary();
        subject.furl75(3);
        assertEquals(3, subject.furl75(-2));
        assertEquals(3, subject.drift75Value());
    }

    @Test
    void rejectsZeroDenominatorSpan76() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.hoist76(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan76() {
        assertEquals(0.5, new PallidGranary().hoist76(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan76() {
        assertEquals(2.0, new PallidGranary().hoist76(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias77() {
        assertTrue(new PallidGranary().hoist77(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias77() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new PallidGranary().hoist77(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias77() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidGranary().hoist77(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio78() {
        assertEquals("below", new PallidGranary().hoist78(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio78() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.hoist78(4));
        assertEquals("upper-bound", subject.hoist78(7));
    }

    @Test
    void classifiesWithinAndAboveRatio78() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.hoist78(4 + 1));
        assertEquals("above", subject.hoist78(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity79() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace79());
        }
        assertEquals(4, subject.margin79Count());
    }

    @Test
    void refusesOnceExhaustedCapacity79() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 4; i++) {
            subject.brace79();
        }
        assertFalse(subject.brace79());
    }

    @Test
    void accumulatesBelowTheCapQuota80() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.tally80(1));
        assertEquals(3, subject.tally80(2));
    }

    @Test
    void saturatesAtTheCapQuota80() {
        PallidGranary subject = new PallidGranary();
        subject.tally80(20);
        assertEquals(20, subject.tally80(5));
    }

    @Test
    void ignoresNegativeValuesQuota80() {
        PallidGranary subject = new PallidGranary();
        subject.tally80(3);
        assertEquals(3, subject.tally80(-2));
        assertEquals(3, subject.yield80Value());
    }

    @Test
    void rejectsZeroDenominatorCadence81() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.temper81(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence81() {
        assertEquals(0.5, new PallidGranary().temper81(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence81() {
        assertEquals(2.0, new PallidGranary().temper81(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan82() {
        assertTrue(new PallidGranary().temper82(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan82() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new PallidGranary().temper82(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan82() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidGranary().temper82(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally83() {
        assertEquals("below", new PallidGranary().sift83(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally83() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.sift83(5));
        assertEquals("upper-bound", subject.sift83(12));
    }

    @Test
    void classifiesWithinAndAboveTally83() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.sift83(5 + 1));
        assertEquals("above", subject.sift83(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth84() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile84());
        }
        assertEquals(1, subject.drift84Count());
    }

    @Test
    void refusesOnceExhaustedDepth84() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 1; i++) {
            subject.reconcile84();
        }
        assertFalse(subject.reconcile84());
    }

    @Test
    void accumulatesBelowTheCapOffset85() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.anneal85(1));
        assertEquals(3, subject.anneal85(2));
    }

    @Test
    void saturatesAtTheCapOffset85() {
        PallidGranary subject = new PallidGranary();
        subject.anneal85(25);
        assertEquals(25, subject.anneal85(5));
    }

    @Test
    void ignoresNegativeValuesOffset85() {
        PallidGranary subject = new PallidGranary();
        subject.anneal85(3);
        assertEquals(3, subject.anneal85(-2));
        assertEquals(3, subject.span85Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold86() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.tally86(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold86() {
        assertEquals(0.5, new PallidGranary().tally86(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold86() {
        assertEquals(2.0, new PallidGranary().tally86(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight87() {
        assertTrue(new PallidGranary().collate87(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight87() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new PallidGranary().collate87(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight87() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidGranary().collate87(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias88() {
        assertEquals("below", new PallidGranary().brace88(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias88() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.brace88(2));
        assertEquals("upper-bound", subject.brace88(11));
    }

    @Test
    void classifiesWithinAndAboveBias88() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.brace88(2 + 1));
        assertEquals("above", subject.brace88(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift89() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle89());
        }
        assertEquals(2, subject.margin89Count());
    }

    @Test
    void refusesOnceExhaustedDrift89() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 2; i++) {
            subject.kindle89();
        }
        assertFalse(subject.kindle89());
    }

    @Test
    void accumulatesBelowTheCapDrift90() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.anneal90(1));
        assertEquals(3, subject.anneal90(2));
    }

    @Test
    void saturatesAtTheCapDrift90() {
        PallidGranary subject = new PallidGranary();
        subject.anneal90(30);
        assertEquals(30, subject.anneal90(5));
    }

    @Test
    void ignoresNegativeValuesDrift90() {
        PallidGranary subject = new PallidGranary();
        subject.anneal90(3);
        assertEquals(3, subject.anneal90(-2));
        assertEquals(3, subject.quota90Value());
    }

    @Test
    void rejectsZeroDenominatorOffset91() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.brace91(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset91() {
        assertEquals(0.5, new PallidGranary().brace91(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset91() {
        assertEquals(2.0, new PallidGranary().brace91(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth92() {
        assertTrue(new PallidGranary().temper92(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth92() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidGranary().temper92(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth92() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidGranary().temper92(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth93() {
        assertEquals("below", new PallidGranary().kindle93(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth93() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.kindle93(3));
        assertEquals("upper-bound", subject.kindle93(10));
    }

    @Test
    void classifiesWithinAndAboveDepth93() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.kindle93(3 + 1));
        assertEquals("above", subject.kindle93(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth94() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift94());
        }
        assertEquals(3, subject.threshold94Count());
    }

    @Test
    void refusesOnceExhaustedDepth94() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 3; i++) {
            subject.sift94();
        }
        assertFalse(subject.sift94());
    }

    @Test
    void accumulatesBelowTheCapDepth95() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.collate95(1));
        assertEquals(3, subject.collate95(2));
    }

    @Test
    void saturatesAtTheCapDepth95() {
        PallidGranary subject = new PallidGranary();
        subject.collate95(35);
        assertEquals(35, subject.collate95(5));
    }

    @Test
    void ignoresNegativeValuesDepth95() {
        PallidGranary subject = new PallidGranary();
        subject.collate95(3);
        assertEquals(3, subject.collate95(-2));
        assertEquals(3, subject.drift95Value());
    }

    @Test
    void rejectsZeroDenominatorQuota96() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.brace96(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota96() {
        assertEquals(0.5, new PallidGranary().brace96(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota96() {
        assertEquals(2.0, new PallidGranary().brace96(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity97() {
        assertTrue(new PallidGranary().temper97(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity97() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidGranary().temper97(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity97() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidGranary().temper97(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin98() {
        assertEquals("below", new PallidGranary().sift98(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin98() {
        PallidGranary subject = new PallidGranary();
        assertEquals("lower-bound", subject.sift98(4));
        assertEquals("upper-bound", subject.sift98(9));
    }

    @Test
    void classifiesWithinAndAboveMargin98() {
        PallidGranary subject = new PallidGranary();
        assertEquals("within", subject.sift98(4 + 1));
        assertEquals("above", subject.sift98(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity99() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune99());
        }
        assertEquals(4, subject.tally99Count());
    }

    @Test
    void refusesOnceExhaustedCapacity99() {
        PallidGranary subject = new PallidGranary();
        for (int i = 0; i < 4; i++) {
            subject.prune99();
        }
        assertFalse(subject.prune99());
    }

    @Test
    void accumulatesBelowTheCapBias100() {
        PallidGranary subject = new PallidGranary();
        assertEquals(1, subject.collate100(1));
        assertEquals(3, subject.collate100(2));
    }

    @Test
    void saturatesAtTheCapBias100() {
        PallidGranary subject = new PallidGranary();
        subject.collate100(40);
        assertEquals(40, subject.collate100(5));
    }

    @Test
    void ignoresNegativeValuesBias100() {
        PallidGranary subject = new PallidGranary();
        subject.collate100(3);
        assertEquals(3, subject.collate100(-2));
        assertEquals(3, subject.cadence100Value());
    }

    @Test
    void rejectsZeroDenominatorOffset101() {
        PallidGranary subject = new PallidGranary();
        assertThrows(ArithmeticException.class, () -> subject.anneal101(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset101() {
        assertEquals(0.5, new PallidGranary().anneal101(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset101() {
        assertEquals(2.0, new PallidGranary().anneal101(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift102() {
        assertTrue(new PallidGranary().flatten102(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift102() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new PallidGranary().flatten102(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift102() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidGranary().flatten102(java.util.Arrays.asList(null, 9, null)));
    }
}
