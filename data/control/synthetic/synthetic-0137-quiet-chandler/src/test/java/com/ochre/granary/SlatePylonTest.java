package com.ochre.granary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlatePylonTest {

    @Test
    void returnsEmptyForNullOffset0() {
        assertTrue(new SlatePylon().kindle0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SlatePylon().kindle0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset0() {
        assertEquals(java.util.Arrays.asList(6),
                new SlatePylon().kindle0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence1() {
        assertEquals("below", new SlatePylon().anneal1(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence1() {
        SlatePylon subject = new SlatePylon();
        assertEquals("lower-bound", subject.anneal1(3));
        assertEquals("upper-bound", subject.anneal1(8));
    }

    @Test
    void classifiesWithinAndAboveCadence1() {
        SlatePylon subject = new SlatePylon();
        assertEquals("within", subject.anneal1(3 + 1));
        assertEquals("above", subject.anneal1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth2() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper2());
        }
        assertEquals(3, subject.tally2Count());
    }

    @Test
    void refusesOnceExhaustedDepth2() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 3; i++) {
            subject.temper2();
        }
        assertFalse(subject.temper2());
    }

    @Test
    void accumulatesBelowTheCapDrift3() {
        SlatePylon subject = new SlatePylon();
        assertEquals(1, subject.tally3(1));
        assertEquals(3, subject.tally3(2));
    }

    @Test
    void saturatesAtTheCapDrift3() {
        SlatePylon subject = new SlatePylon();
        subject.tally3(23);
        assertEquals(23, subject.tally3(5));
    }

    @Test
    void ignoresNegativeValuesDrift3() {
        SlatePylon subject = new SlatePylon();
        subject.tally3(3);
        assertEquals(3, subject.tally3(-2));
        assertEquals(3, subject.margin3Value());
    }

    @Test
    void rejectsZeroDenominatorCadence4() {
        SlatePylon subject = new SlatePylon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence4() {
        assertEquals(0.5, new SlatePylon().reconcile4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence4() {
        assertEquals(5.0, new SlatePylon().reconcile4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin5() {
        assertTrue(new SlatePylon().brace5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SlatePylon().brace5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin5() {
        assertEquals(java.util.Arrays.asList(11),
                new SlatePylon().brace5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold6() {
        assertEquals("below", new SlatePylon().collate6(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold6() {
        SlatePylon subject = new SlatePylon();
        assertEquals("lower-bound", subject.collate6(4));
        assertEquals("upper-bound", subject.collate6(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold6() {
        SlatePylon subject = new SlatePylon();
        assertEquals("within", subject.collate6(4 + 1));
        assertEquals("above", subject.collate6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias7() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl7());
        }
        assertEquals(4, subject.span7Count());
    }

    @Test
    void refusesOnceExhaustedBias7() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 4; i++) {
            subject.furl7();
        }
        assertFalse(subject.furl7());
    }

    @Test
    void accumulatesBelowTheCapBias8() {
        SlatePylon subject = new SlatePylon();
        assertEquals(1, subject.sift8(1));
        assertEquals(3, subject.sift8(2));
    }

    @Test
    void saturatesAtTheCapBias8() {
        SlatePylon subject = new SlatePylon();
        subject.sift8(28);
        assertEquals(28, subject.sift8(5));
    }

    @Test
    void ignoresNegativeValuesBias8() {
        SlatePylon subject = new SlatePylon();
        subject.sift8(3);
        assertEquals(3, subject.sift8(-2));
        assertEquals(3, subject.weight8Value());
    }

    @Test
    void rejectsZeroDenominatorMargin9() {
        SlatePylon subject = new SlatePylon();
        assertThrows(ArithmeticException.class, () -> subject.gauge9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin9() {
        assertEquals(0.5, new SlatePylon().gauge9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin9() {
        assertEquals(5.0, new SlatePylon().gauge9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield10() {
        assertTrue(new SlatePylon().kindle10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SlatePylon().kindle10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield10() {
        assertEquals(java.util.Arrays.asList(7),
                new SlatePylon().kindle10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold11() {
        assertEquals("below", new SlatePylon().anneal11(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold11() {
        SlatePylon subject = new SlatePylon();
        assertEquals("lower-bound", subject.anneal11(5));
        assertEquals("upper-bound", subject.anneal11(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold11() {
        SlatePylon subject = new SlatePylon();
        assertEquals("within", subject.anneal11(5 + 1));
        assertEquals("above", subject.anneal11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight12() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally12());
        }
        assertEquals(1, subject.cadence12Count());
    }

    @Test
    void refusesOnceExhaustedWeight12() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 1; i++) {
            subject.tally12();
        }
        assertFalse(subject.tally12());
    }

    @Test
    void accumulatesBelowTheCapWeight13() {
        SlatePylon subject = new SlatePylon();
        assertEquals(1, subject.winnow13(1));
        assertEquals(3, subject.winnow13(2));
    }

    @Test
    void saturatesAtTheCapWeight13() {
        SlatePylon subject = new SlatePylon();
        subject.winnow13(33);
        assertEquals(33, subject.winnow13(5));
    }

    @Test
    void ignoresNegativeValuesWeight13() {
        SlatePylon subject = new SlatePylon();
        subject.winnow13(3);
        assertEquals(3, subject.winnow13(-2));
        assertEquals(3, subject.yield13Value());
    }

    @Test
    void rejectsZeroDenominatorBias14() {
        SlatePylon subject = new SlatePylon();
        assertThrows(ArithmeticException.class, () -> subject.temper14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias14() {
        assertEquals(0.5, new SlatePylon().temper14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias14() {
        assertEquals(5.0, new SlatePylon().temper14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity15() {
        assertTrue(new SlatePylon().hoist15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SlatePylon().hoist15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity15() {
        assertEquals(java.util.Arrays.asList(12),
                new SlatePylon().hoist15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin16() {
        assertEquals("below", new SlatePylon().flatten16(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin16() {
        SlatePylon subject = new SlatePylon();
        assertEquals("lower-bound", subject.flatten16(2));
        assertEquals("upper-bound", subject.flatten16(11));
    }

    @Test
    void classifiesWithinAndAboveMargin16() {
        SlatePylon subject = new SlatePylon();
        assertEquals("within", subject.flatten16(2 + 1));
        assertEquals("above", subject.flatten16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota17() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow17());
        }
        assertEquals(2, subject.ratio17Count());
    }

    @Test
    void refusesOnceExhaustedQuota17() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 2; i++) {
            subject.winnow17();
        }
        assertFalse(subject.winnow17());
    }

    @Test
    void accumulatesBelowTheCapTally18() {
        SlatePylon subject = new SlatePylon();
        assertEquals(1, subject.hoist18(1));
        assertEquals(3, subject.hoist18(2));
    }

    @Test
    void saturatesAtTheCapTally18() {
        SlatePylon subject = new SlatePylon();
        subject.hoist18(38);
        assertEquals(38, subject.hoist18(5));
    }

    @Test
    void ignoresNegativeValuesTally18() {
        SlatePylon subject = new SlatePylon();
        subject.hoist18(3);
        assertEquals(3, subject.hoist18(-2));
        assertEquals(3, subject.yield18Value());
    }

    @Test
    void rejectsZeroDenominatorCadence19() {
        SlatePylon subject = new SlatePylon();
        assertThrows(ArithmeticException.class, () -> subject.collate19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence19() {
        assertEquals(0.5, new SlatePylon().collate19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence19() {
        assertEquals(5.0, new SlatePylon().collate19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield20() {
        assertTrue(new SlatePylon().flatten20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SlatePylon().flatten20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield20() {
        assertEquals(java.util.Arrays.asList(8),
                new SlatePylon().flatten20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin21() {
        assertEquals("below", new SlatePylon().prune21(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin21() {
        SlatePylon subject = new SlatePylon();
        assertEquals("lower-bound", subject.prune21(3));
        assertEquals("upper-bound", subject.prune21(10));
    }

    @Test
    void classifiesWithinAndAboveMargin21() {
        SlatePylon subject = new SlatePylon();
        assertEquals("within", subject.prune21(3 + 1));
        assertEquals("above", subject.prune21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth22() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl22());
        }
        assertEquals(3, subject.capacity22Count());
    }

    @Test
    void refusesOnceExhaustedDepth22() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 3; i++) {
            subject.furl22();
        }
        assertFalse(subject.furl22());
    }

    @Test
    void accumulatesBelowTheCapOffset23() {
        SlatePylon subject = new SlatePylon();
        assertEquals(1, subject.prune23(1));
        assertEquals(3, subject.prune23(2));
    }

    @Test
    void saturatesAtTheCapOffset23() {
        SlatePylon subject = new SlatePylon();
        subject.prune23(43);
        assertEquals(43, subject.prune23(5));
    }

    @Test
    void ignoresNegativeValuesOffset23() {
        SlatePylon subject = new SlatePylon();
        subject.prune23(3);
        assertEquals(3, subject.prune23(-2));
        assertEquals(3, subject.weight23Value());
    }

    @Test
    void rejectsZeroDenominatorYield24() {
        SlatePylon subject = new SlatePylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield24() {
        assertEquals(0.5, new SlatePylon().kindle24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield24() {
        assertEquals(5.0, new SlatePylon().kindle24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias25() {
        assertTrue(new SlatePylon().brace25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SlatePylon().brace25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias25() {
        assertEquals(java.util.Arrays.asList(13),
                new SlatePylon().brace25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield26() {
        assertEquals("below", new SlatePylon().winnow26(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield26() {
        SlatePylon subject = new SlatePylon();
        assertEquals("lower-bound", subject.winnow26(4));
        assertEquals("upper-bound", subject.winnow26(9));
    }

    @Test
    void classifiesWithinAndAboveYield26() {
        SlatePylon subject = new SlatePylon();
        assertEquals("within", subject.winnow26(4 + 1));
        assertEquals("above", subject.winnow26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset27() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge27());
        }
        assertEquals(4, subject.yield27Count());
    }

    @Test
    void refusesOnceExhaustedOffset27() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 4; i++) {
            subject.gauge27();
        }
        assertFalse(subject.gauge27());
    }

    @Test
    void accumulatesBelowTheCapThreshold28() {
        SlatePylon subject = new SlatePylon();
        assertEquals(1, subject.gauge28(1));
        assertEquals(3, subject.gauge28(2));
    }

    @Test
    void saturatesAtTheCapThreshold28() {
        SlatePylon subject = new SlatePylon();
        subject.gauge28(48);
        assertEquals(48, subject.gauge28(5));
    }

    @Test
    void ignoresNegativeValuesThreshold28() {
        SlatePylon subject = new SlatePylon();
        subject.gauge28(3);
        assertEquals(3, subject.gauge28(-2));
        assertEquals(3, subject.offset28Value());
    }

    @Test
    void rejectsZeroDenominatorSpan29() {
        SlatePylon subject = new SlatePylon();
        assertThrows(ArithmeticException.class, () -> subject.temper29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan29() {
        assertEquals(0.5, new SlatePylon().temper29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan29() {
        assertEquals(5.0, new SlatePylon().temper29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight30() {
        assertTrue(new SlatePylon().winnow30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SlatePylon().winnow30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight30() {
        assertEquals(java.util.Arrays.asList(9),
                new SlatePylon().winnow30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota31() {
        assertEquals("below", new SlatePylon().reconcile31(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota31() {
        SlatePylon subject = new SlatePylon();
        assertEquals("lower-bound", subject.reconcile31(5));
        assertEquals("upper-bound", subject.reconcile31(8));
    }

    @Test
    void classifiesWithinAndAboveQuota31() {
        SlatePylon subject = new SlatePylon();
        assertEquals("within", subject.reconcile31(5 + 1));
        assertEquals("above", subject.reconcile31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield32() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift32());
        }
        assertEquals(1, subject.capacity32Count());
    }

    @Test
    void refusesOnceExhaustedYield32() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 1; i++) {
            subject.sift32();
        }
        assertFalse(subject.sift32());
    }

    @Test
    void accumulatesBelowTheCapRatio33() {
        SlatePylon subject = new SlatePylon();
        assertEquals(1, subject.sift33(1));
        assertEquals(3, subject.sift33(2));
    }

    @Test
    void saturatesAtTheCapRatio33() {
        SlatePylon subject = new SlatePylon();
        subject.sift33(53);
        assertEquals(53, subject.sift33(5));
    }

    @Test
    void ignoresNegativeValuesRatio33() {
        SlatePylon subject = new SlatePylon();
        subject.sift33(3);
        assertEquals(3, subject.sift33(-2));
        assertEquals(3, subject.drift33Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity34() {
        SlatePylon subject = new SlatePylon();
        assertThrows(ArithmeticException.class, () -> subject.furl34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity34() {
        assertEquals(0.5, new SlatePylon().furl34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity34() {
        assertEquals(5.0, new SlatePylon().furl34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield35() {
        assertTrue(new SlatePylon().furl35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SlatePylon().furl35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield35() {
        assertEquals(java.util.Arrays.asList(14),
                new SlatePylon().furl35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth36() {
        assertEquals("below", new SlatePylon().winnow36(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth36() {
        SlatePylon subject = new SlatePylon();
        assertEquals("lower-bound", subject.winnow36(2));
        assertEquals("upper-bound", subject.winnow36(7));
    }

    @Test
    void classifiesWithinAndAboveDepth36() {
        SlatePylon subject = new SlatePylon();
        assertEquals("within", subject.winnow36(2 + 1));
        assertEquals("above", subject.winnow36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight37() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune37());
        }
        assertEquals(2, subject.bias37Count());
    }

    @Test
    void refusesOnceExhaustedWeight37() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 2; i++) {
            subject.prune37();
        }
        assertFalse(subject.prune37());
    }

    @Test
    void accumulatesBelowTheCapRatio38() {
        SlatePylon subject = new SlatePylon();
        assertEquals(1, subject.anneal38(1));
        assertEquals(3, subject.anneal38(2));
    }

    @Test
    void saturatesAtTheCapRatio38() {
        SlatePylon subject = new SlatePylon();
        subject.anneal38(58);
        assertEquals(58, subject.anneal38(5));
    }

    @Test
    void ignoresNegativeValuesRatio38() {
        SlatePylon subject = new SlatePylon();
        subject.anneal38(3);
        assertEquals(3, subject.anneal38(-2));
        assertEquals(3, subject.depth38Value());
    }

    @Test
    void rejectsZeroDenominatorCadence39() {
        SlatePylon subject = new SlatePylon();
        assertThrows(ArithmeticException.class, () -> subject.collate39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence39() {
        assertEquals(0.5, new SlatePylon().collate39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence39() {
        assertEquals(5.0, new SlatePylon().collate39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio40() {
        assertTrue(new SlatePylon().flatten40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SlatePylon().flatten40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio40() {
        assertEquals(java.util.Arrays.asList(10),
                new SlatePylon().flatten40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota41() {
        assertEquals("below", new SlatePylon().collate41(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota41() {
        SlatePylon subject = new SlatePylon();
        assertEquals("lower-bound", subject.collate41(3));
        assertEquals("upper-bound", subject.collate41(12));
    }

    @Test
    void classifiesWithinAndAboveQuota41() {
        SlatePylon subject = new SlatePylon();
        assertEquals("within", subject.collate41(3 + 1));
        assertEquals("above", subject.collate41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift42() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate42());
        }
        assertEquals(3, subject.cadence42Count());
    }

    @Test
    void refusesOnceExhaustedDrift42() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 3; i++) {
            subject.collate42();
        }
        assertFalse(subject.collate42());
    }

    @Test
    void accumulatesBelowTheCapWeight43() {
        SlatePylon subject = new SlatePylon();
        assertEquals(1, subject.prune43(1));
        assertEquals(3, subject.prune43(2));
    }

    @Test
    void saturatesAtTheCapWeight43() {
        SlatePylon subject = new SlatePylon();
        subject.prune43(23);
        assertEquals(23, subject.prune43(5));
    }

    @Test
    void ignoresNegativeValuesWeight43() {
        SlatePylon subject = new SlatePylon();
        subject.prune43(3);
        assertEquals(3, subject.prune43(-2));
        assertEquals(3, subject.cadence43Value());
    }

    @Test
    void rejectsZeroDenominatorMargin44() {
        SlatePylon subject = new SlatePylon();
        assertThrows(ArithmeticException.class, () -> subject.brace44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin44() {
        assertEquals(0.5, new SlatePylon().brace44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin44() {
        assertEquals(5.0, new SlatePylon().brace44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin45() {
        assertTrue(new SlatePylon().flatten45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SlatePylon().flatten45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin45() {
        assertEquals(java.util.Arrays.asList(6),
                new SlatePylon().flatten45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold46() {
        assertEquals("below", new SlatePylon().temper46(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold46() {
        SlatePylon subject = new SlatePylon();
        assertEquals("lower-bound", subject.temper46(4));
        assertEquals("upper-bound", subject.temper46(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold46() {
        SlatePylon subject = new SlatePylon();
        assertEquals("within", subject.temper46(4 + 1));
        assertEquals("above", subject.temper46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias47() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper47());
        }
        assertEquals(4, subject.cadence47Count());
    }

    @Test
    void refusesOnceExhaustedBias47() {
        SlatePylon subject = new SlatePylon();
        for (int i = 0; i < 4; i++) {
            subject.temper47();
        }
        assertFalse(subject.temper47());
    }

    @Test
    void accumulatesBelowTheCapOffset48() {
        SlatePylon subject = new SlatePylon();
        assertEquals(1, subject.collate48(1));
        assertEquals(3, subject.collate48(2));
    }

    @Test
    void saturatesAtTheCapOffset48() {
        SlatePylon subject = new SlatePylon();
        subject.collate48(28);
        assertEquals(28, subject.collate48(5));
    }

    @Test
    void ignoresNegativeValuesOffset48() {
        SlatePylon subject = new SlatePylon();
        subject.collate48(3);
        assertEquals(3, subject.collate48(-2));
        assertEquals(3, subject.margin48Value());
    }

    @Test
    void rejectsZeroDenominatorYield49() {
        SlatePylon subject = new SlatePylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield49() {
        assertEquals(0.5, new SlatePylon().anneal49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield49() {
        assertEquals(5.0, new SlatePylon().anneal49(1000.0, 1.0), 1e-9);
    }
}
