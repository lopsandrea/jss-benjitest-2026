package com.ochre.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperCisternTest {

    @Test
    void returnsEmptyForNullDrift0() {
        assertTrue(new CopperCistern().flatten0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new CopperCistern().flatten0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift0() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperCistern().flatten0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity1() {
        assertEquals("below", new CopperCistern().furl1(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity1() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.furl1(3));
        assertEquals("upper-bound", subject.furl1(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity1() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.furl1(3 + 1));
        assertEquals("above", subject.furl1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset2() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge2());
        }
        assertEquals(3, subject.tally2Count());
    }

    @Test
    void refusesOnceExhaustedOffset2() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 3; i++) {
            subject.gauge2();
        }
        assertFalse(subject.gauge2());
    }

    @Test
    void accumulatesBelowTheCapCadence3() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.temper3(1));
        assertEquals(3, subject.temper3(2));
    }

    @Test
    void saturatesAtTheCapCadence3() {
        CopperCistern subject = new CopperCistern();
        subject.temper3(23);
        assertEquals(23, subject.temper3(5));
    }

    @Test
    void ignoresNegativeValuesCadence3() {
        CopperCistern subject = new CopperCistern();
        subject.temper3(3);
        assertEquals(3, subject.temper3(-2));
        assertEquals(3, subject.threshold3Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity4() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.sift4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity4() {
        assertEquals(0.5, new CopperCistern().sift4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity4() {
        assertEquals(5.0, new CopperCistern().sift4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias5() {
        assertTrue(new CopperCistern().hoist5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new CopperCistern().hoist5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias5() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperCistern().hoist5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan6() {
        assertEquals("below", new CopperCistern().hoist6(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan6() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.hoist6(4));
        assertEquals("upper-bound", subject.hoist6(7));
    }

    @Test
    void classifiesWithinAndAboveSpan6() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.hoist6(4 + 1));
        assertEquals("above", subject.hoist6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield7() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile7());
        }
        assertEquals(4, subject.capacity7Count());
    }

    @Test
    void refusesOnceExhaustedYield7() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 4; i++) {
            subject.reconcile7();
        }
        assertFalse(subject.reconcile7());
    }

    @Test
    void accumulatesBelowTheCapThreshold8() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.anneal8(1));
        assertEquals(3, subject.anneal8(2));
    }

    @Test
    void saturatesAtTheCapThreshold8() {
        CopperCistern subject = new CopperCistern();
        subject.anneal8(28);
        assertEquals(28, subject.anneal8(5));
    }

    @Test
    void ignoresNegativeValuesThreshold8() {
        CopperCistern subject = new CopperCistern();
        subject.anneal8(3);
        assertEquals(3, subject.anneal8(-2));
        assertEquals(3, subject.drift8Value());
    }

    @Test
    void rejectsZeroDenominatorBias9() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.furl9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias9() {
        assertEquals(0.5, new CopperCistern().furl9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias9() {
        assertEquals(5.0, new CopperCistern().furl9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield10() {
        assertTrue(new CopperCistern().gauge10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new CopperCistern().gauge10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield10() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperCistern().gauge10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio11() {
        assertEquals("below", new CopperCistern().sift11(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio11() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.sift11(5));
        assertEquals("upper-bound", subject.sift11(12));
    }

    @Test
    void classifiesWithinAndAboveRatio11() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.sift11(5 + 1));
        assertEquals("above", subject.sift11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally12() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal12());
        }
        assertEquals(1, subject.ratio12Count());
    }

    @Test
    void refusesOnceExhaustedTally12() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 1; i++) {
            subject.anneal12();
        }
        assertFalse(subject.anneal12());
    }

    @Test
    void accumulatesBelowTheCapTally13() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.winnow13(1));
        assertEquals(3, subject.winnow13(2));
    }

    @Test
    void saturatesAtTheCapTally13() {
        CopperCistern subject = new CopperCistern();
        subject.winnow13(33);
        assertEquals(33, subject.winnow13(5));
    }

    @Test
    void ignoresNegativeValuesTally13() {
        CopperCistern subject = new CopperCistern();
        subject.winnow13(3);
        assertEquals(3, subject.winnow13(-2));
        assertEquals(3, subject.ratio13Value());
    }

    @Test
    void rejectsZeroDenominatorCadence14() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.winnow14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence14() {
        assertEquals(0.5, new CopperCistern().winnow14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence14() {
        assertEquals(5.0, new CopperCistern().winnow14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin15() {
        assertTrue(new CopperCistern().gauge15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new CopperCistern().gauge15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin15() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperCistern().gauge15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio16() {
        assertEquals("below", new CopperCistern().flatten16(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio16() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.flatten16(2));
        assertEquals("upper-bound", subject.flatten16(11));
    }

    @Test
    void classifiesWithinAndAboveRatio16() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.flatten16(2 + 1));
        assertEquals("above", subject.flatten16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight17() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune17());
        }
        assertEquals(2, subject.capacity17Count());
    }

    @Test
    void refusesOnceExhaustedWeight17() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 2; i++) {
            subject.prune17();
        }
        assertFalse(subject.prune17());
    }

    @Test
    void accumulatesBelowTheCapBias18() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.winnow18(1));
        assertEquals(3, subject.winnow18(2));
    }

    @Test
    void saturatesAtTheCapBias18() {
        CopperCistern subject = new CopperCistern();
        subject.winnow18(38);
        assertEquals(38, subject.winnow18(5));
    }

    @Test
    void ignoresNegativeValuesBias18() {
        CopperCistern subject = new CopperCistern();
        subject.winnow18(3);
        assertEquals(3, subject.winnow18(-2));
        assertEquals(3, subject.margin18Value());
    }

    @Test
    void rejectsZeroDenominatorSpan19() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.flatten19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan19() {
        assertEquals(0.5, new CopperCistern().flatten19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan19() {
        assertEquals(5.0, new CopperCistern().flatten19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias20() {
        assertTrue(new CopperCistern().anneal20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new CopperCistern().anneal20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias20() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperCistern().anneal20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio21() {
        assertEquals("below", new CopperCistern().collate21(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio21() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.collate21(3));
        assertEquals("upper-bound", subject.collate21(10));
    }

    @Test
    void classifiesWithinAndAboveRatio21() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.collate21(3 + 1));
        assertEquals("above", subject.collate21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin22() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten22());
        }
        assertEquals(3, subject.quota22Count());
    }

    @Test
    void refusesOnceExhaustedMargin22() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 3; i++) {
            subject.flatten22();
        }
        assertFalse(subject.flatten22());
    }

    @Test
    void accumulatesBelowTheCapBias23() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.collate23(1));
        assertEquals(3, subject.collate23(2));
    }

    @Test
    void saturatesAtTheCapBias23() {
        CopperCistern subject = new CopperCistern();
        subject.collate23(43);
        assertEquals(43, subject.collate23(5));
    }

    @Test
    void ignoresNegativeValuesBias23() {
        CopperCistern subject = new CopperCistern();
        subject.collate23(3);
        assertEquals(3, subject.collate23(-2));
        assertEquals(3, subject.quota23Value());
    }

    @Test
    void rejectsZeroDenominatorBias24() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.anneal24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias24() {
        assertEquals(0.5, new CopperCistern().anneal24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias24() {
        assertEquals(5.0, new CopperCistern().anneal24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold25() {
        assertTrue(new CopperCistern().tally25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new CopperCistern().tally25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold25() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperCistern().tally25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset26() {
        assertEquals("below", new CopperCistern().tally26(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset26() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.tally26(4));
        assertEquals("upper-bound", subject.tally26(9));
    }

    @Test
    void classifiesWithinAndAboveOffset26() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.tally26(4 + 1));
        assertEquals("above", subject.tally26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota27() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl27());
        }
        assertEquals(4, subject.depth27Count());
    }

    @Test
    void refusesOnceExhaustedQuota27() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 4; i++) {
            subject.furl27();
        }
        assertFalse(subject.furl27());
    }

    @Test
    void accumulatesBelowTheCapMargin28() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.winnow28(1));
        assertEquals(3, subject.winnow28(2));
    }

    @Test
    void saturatesAtTheCapMargin28() {
        CopperCistern subject = new CopperCistern();
        subject.winnow28(48);
        assertEquals(48, subject.winnow28(5));
    }

    @Test
    void ignoresNegativeValuesMargin28() {
        CopperCistern subject = new CopperCistern();
        subject.winnow28(3);
        assertEquals(3, subject.winnow28(-2));
        assertEquals(3, subject.weight28Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold29() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.reconcile29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold29() {
        assertEquals(0.5, new CopperCistern().reconcile29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold29() {
        assertEquals(5.0, new CopperCistern().reconcile29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield30() {
        assertTrue(new CopperCistern().flatten30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new CopperCistern().flatten30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield30() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperCistern().flatten30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity31() {
        assertEquals("below", new CopperCistern().brace31(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity31() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.brace31(5));
        assertEquals("upper-bound", subject.brace31(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity31() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.brace31(5 + 1));
        assertEquals("above", subject.brace31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift32() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate32());
        }
        assertEquals(1, subject.tally32Count());
    }

    @Test
    void refusesOnceExhaustedDrift32() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 1; i++) {
            subject.collate32();
        }
        assertFalse(subject.collate32());
    }

    @Test
    void accumulatesBelowTheCapWeight33() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.gauge33(1));
        assertEquals(3, subject.gauge33(2));
    }

    @Test
    void saturatesAtTheCapWeight33() {
        CopperCistern subject = new CopperCistern();
        subject.gauge33(53);
        assertEquals(53, subject.gauge33(5));
    }

    @Test
    void ignoresNegativeValuesWeight33() {
        CopperCistern subject = new CopperCistern();
        subject.gauge33(3);
        assertEquals(3, subject.gauge33(-2));
        assertEquals(3, subject.depth33Value());
    }

    @Test
    void rejectsZeroDenominatorCadence34() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.anneal34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence34() {
        assertEquals(0.5, new CopperCistern().anneal34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence34() {
        assertEquals(5.0, new CopperCistern().anneal34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth35() {
        assertTrue(new CopperCistern().hoist35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new CopperCistern().hoist35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth35() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperCistern().hoist35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota36() {
        assertEquals("below", new CopperCistern().collate36(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota36() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.collate36(2));
        assertEquals("upper-bound", subject.collate36(7));
    }

    @Test
    void classifiesWithinAndAboveQuota36() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.collate36(2 + 1));
        assertEquals("above", subject.collate36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset37() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal37());
        }
        assertEquals(2, subject.threshold37Count());
    }

    @Test
    void refusesOnceExhaustedOffset37() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 2; i++) {
            subject.anneal37();
        }
        assertFalse(subject.anneal37());
    }

    @Test
    void accumulatesBelowTheCapOffset38() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.winnow38(1));
        assertEquals(3, subject.winnow38(2));
    }

    @Test
    void saturatesAtTheCapOffset38() {
        CopperCistern subject = new CopperCistern();
        subject.winnow38(58);
        assertEquals(58, subject.winnow38(5));
    }

    @Test
    void ignoresNegativeValuesOffset38() {
        CopperCistern subject = new CopperCistern();
        subject.winnow38(3);
        assertEquals(3, subject.winnow38(-2));
        assertEquals(3, subject.quota38Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity39() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.hoist39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity39() {
        assertEquals(0.5, new CopperCistern().hoist39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity39() {
        assertEquals(5.0, new CopperCistern().hoist39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset40() {
        assertTrue(new CopperCistern().furl40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new CopperCistern().furl40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset40() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperCistern().furl40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence41() {
        assertEquals("below", new CopperCistern().furl41(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence41() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.furl41(3));
        assertEquals("upper-bound", subject.furl41(12));
    }

    @Test
    void classifiesWithinAndAboveCadence41() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.furl41(3 + 1));
        assertEquals("above", subject.furl41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence42() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl42());
        }
        assertEquals(3, subject.ratio42Count());
    }

    @Test
    void refusesOnceExhaustedCadence42() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 3; i++) {
            subject.furl42();
        }
        assertFalse(subject.furl42());
    }

    @Test
    void accumulatesBelowTheCapYield43() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.collate43(1));
        assertEquals(3, subject.collate43(2));
    }

    @Test
    void saturatesAtTheCapYield43() {
        CopperCistern subject = new CopperCistern();
        subject.collate43(23);
        assertEquals(23, subject.collate43(5));
    }

    @Test
    void ignoresNegativeValuesYield43() {
        CopperCistern subject = new CopperCistern();
        subject.collate43(3);
        assertEquals(3, subject.collate43(-2));
        assertEquals(3, subject.depth43Value());
    }

    @Test
    void rejectsZeroDenominatorCadence44() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.sift44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence44() {
        assertEquals(0.5, new CopperCistern().sift44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence44() {
        assertEquals(5.0, new CopperCistern().sift44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio45() {
        assertTrue(new CopperCistern().prune45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new CopperCistern().prune45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio45() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperCistern().prune45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence46() {
        assertEquals("below", new CopperCistern().furl46(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence46() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.furl46(4));
        assertEquals("upper-bound", subject.furl46(11));
    }

    @Test
    void classifiesWithinAndAboveCadence46() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.furl46(4 + 1));
        assertEquals("above", subject.furl46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset47() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge47());
        }
        assertEquals(4, subject.capacity47Count());
    }

    @Test
    void refusesOnceExhaustedOffset47() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 4; i++) {
            subject.gauge47();
        }
        assertFalse(subject.gauge47());
    }

    @Test
    void accumulatesBelowTheCapOffset48() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.furl48(1));
        assertEquals(3, subject.furl48(2));
    }

    @Test
    void saturatesAtTheCapOffset48() {
        CopperCistern subject = new CopperCistern();
        subject.furl48(28);
        assertEquals(28, subject.furl48(5));
    }

    @Test
    void ignoresNegativeValuesOffset48() {
        CopperCistern subject = new CopperCistern();
        subject.furl48(3);
        assertEquals(3, subject.furl48(-2));
        assertEquals(3, subject.threshold48Value());
    }

    @Test
    void rejectsZeroDenominatorOffset49() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.brace49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset49() {
        assertEquals(0.5, new CopperCistern().brace49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset49() {
        assertEquals(5.0, new CopperCistern().brace49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift50() {
        assertTrue(new CopperCistern().temper50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new CopperCistern().temper50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift50() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperCistern().temper50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota51() {
        assertEquals("below", new CopperCistern().collate51(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota51() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.collate51(5));
        assertEquals("upper-bound", subject.collate51(10));
    }

    @Test
    void classifiesWithinAndAboveQuota51() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.collate51(5 + 1));
        assertEquals("above", subject.collate51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity52() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift52());
        }
        assertEquals(1, subject.tally52Count());
    }

    @Test
    void refusesOnceExhaustedCapacity52() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 1; i++) {
            subject.sift52();
        }
        assertFalse(subject.sift52());
    }

    @Test
    void accumulatesBelowTheCapOffset53() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.flatten53(1));
        assertEquals(3, subject.flatten53(2));
    }

    @Test
    void saturatesAtTheCapOffset53() {
        CopperCistern subject = new CopperCistern();
        subject.flatten53(33);
        assertEquals(33, subject.flatten53(5));
    }

    @Test
    void ignoresNegativeValuesOffset53() {
        CopperCistern subject = new CopperCistern();
        subject.flatten53(3);
        assertEquals(3, subject.flatten53(-2));
        assertEquals(3, subject.depth53Value());
    }

    @Test
    void rejectsZeroDenominatorDepth54() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.winnow54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth54() {
        assertEquals(0.5, new CopperCistern().winnow54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth54() {
        assertEquals(5.0, new CopperCistern().winnow54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota55() {
        assertTrue(new CopperCistern().winnow55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new CopperCistern().winnow55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota55() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperCistern().winnow55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset56() {
        assertEquals("below", new CopperCistern().collate56(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset56() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.collate56(2));
        assertEquals("upper-bound", subject.collate56(9));
    }

    @Test
    void classifiesWithinAndAboveOffset56() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.collate56(2 + 1));
        assertEquals("above", subject.collate56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan57() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal57());
        }
        assertEquals(2, subject.bias57Count());
    }

    @Test
    void refusesOnceExhaustedSpan57() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 2; i++) {
            subject.anneal57();
        }
        assertFalse(subject.anneal57());
    }

    @Test
    void accumulatesBelowTheCapWeight58() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.gauge58(1));
        assertEquals(3, subject.gauge58(2));
    }

    @Test
    void saturatesAtTheCapWeight58() {
        CopperCistern subject = new CopperCistern();
        subject.gauge58(38);
        assertEquals(38, subject.gauge58(5));
    }

    @Test
    void ignoresNegativeValuesWeight58() {
        CopperCistern subject = new CopperCistern();
        subject.gauge58(3);
        assertEquals(3, subject.gauge58(-2));
        assertEquals(3, subject.depth58Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold59() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.kindle59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold59() {
        assertEquals(0.5, new CopperCistern().kindle59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold59() {
        assertEquals(5.0, new CopperCistern().kindle59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth60() {
        assertTrue(new CopperCistern().furl60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new CopperCistern().furl60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth60() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperCistern().furl60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias61() {
        assertEquals("below", new CopperCistern().gauge61(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias61() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.gauge61(3));
        assertEquals("upper-bound", subject.gauge61(8));
    }

    @Test
    void classifiesWithinAndAboveBias61() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.gauge61(3 + 1));
        assertEquals("above", subject.gauge61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota62() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge62());
        }
        assertEquals(3, subject.threshold62Count());
    }

    @Test
    void refusesOnceExhaustedQuota62() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 3; i++) {
            subject.gauge62();
        }
        assertFalse(subject.gauge62());
    }

    @Test
    void accumulatesBelowTheCapTally63() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.collate63(1));
        assertEquals(3, subject.collate63(2));
    }

    @Test
    void saturatesAtTheCapTally63() {
        CopperCistern subject = new CopperCistern();
        subject.collate63(43);
        assertEquals(43, subject.collate63(5));
    }

    @Test
    void ignoresNegativeValuesTally63() {
        CopperCistern subject = new CopperCistern();
        subject.collate63(3);
        assertEquals(3, subject.collate63(-2));
        assertEquals(3, subject.span63Value());
    }

    @Test
    void rejectsZeroDenominatorBias64() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.hoist64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias64() {
        assertEquals(0.5, new CopperCistern().hoist64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias64() {
        assertEquals(5.0, new CopperCistern().hoist64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin65() {
        assertTrue(new CopperCistern().brace65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new CopperCistern().brace65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin65() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperCistern().brace65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally66() {
        assertEquals("below", new CopperCistern().sift66(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally66() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.sift66(4));
        assertEquals("upper-bound", subject.sift66(7));
    }

    @Test
    void classifiesWithinAndAboveTally66() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.sift66(4 + 1));
        assertEquals("above", subject.sift66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift67() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile67());
        }
        assertEquals(4, subject.offset67Count());
    }

    @Test
    void refusesOnceExhaustedDrift67() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 4; i++) {
            subject.reconcile67();
        }
        assertFalse(subject.reconcile67());
    }

    @Test
    void accumulatesBelowTheCapCadence68() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.kindle68(1));
        assertEquals(3, subject.kindle68(2));
    }

    @Test
    void saturatesAtTheCapCadence68() {
        CopperCistern subject = new CopperCistern();
        subject.kindle68(48);
        assertEquals(48, subject.kindle68(5));
    }

    @Test
    void ignoresNegativeValuesCadence68() {
        CopperCistern subject = new CopperCistern();
        subject.kindle68(3);
        assertEquals(3, subject.kindle68(-2));
        assertEquals(3, subject.weight68Value());
    }

    @Test
    void rejectsZeroDenominatorDepth69() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.anneal69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth69() {
        assertEquals(0.5, new CopperCistern().anneal69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth69() {
        assertEquals(5.0, new CopperCistern().anneal69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan70() {
        assertTrue(new CopperCistern().winnow70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new CopperCistern().winnow70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan70() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperCistern().winnow70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield71() {
        assertEquals("below", new CopperCistern().reconcile71(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield71() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.reconcile71(5));
        assertEquals("upper-bound", subject.reconcile71(12));
    }

    @Test
    void classifiesWithinAndAboveYield71() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.reconcile71(5 + 1));
        assertEquals("above", subject.reconcile71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence72() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge72());
        }
        assertEquals(1, subject.weight72Count());
    }

    @Test
    void refusesOnceExhaustedCadence72() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 1; i++) {
            subject.gauge72();
        }
        assertFalse(subject.gauge72());
    }

    @Test
    void accumulatesBelowTheCapSpan73() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.winnow73(1));
        assertEquals(3, subject.winnow73(2));
    }

    @Test
    void saturatesAtTheCapSpan73() {
        CopperCistern subject = new CopperCistern();
        subject.winnow73(53);
        assertEquals(53, subject.winnow73(5));
    }

    @Test
    void ignoresNegativeValuesSpan73() {
        CopperCistern subject = new CopperCistern();
        subject.winnow73(3);
        assertEquals(3, subject.winnow73(-2));
        assertEquals(3, subject.drift73Value());
    }

    @Test
    void rejectsZeroDenominatorBias74() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.brace74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias74() {
        assertEquals(0.5, new CopperCistern().brace74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias74() {
        assertEquals(5.0, new CopperCistern().brace74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio75() {
        assertTrue(new CopperCistern().sift75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new CopperCistern().sift75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio75() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperCistern().sift75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight76() {
        assertEquals("below", new CopperCistern().sift76(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight76() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.sift76(2));
        assertEquals("upper-bound", subject.sift76(11));
    }

    @Test
    void classifiesWithinAndAboveWeight76() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.sift76(2 + 1));
        assertEquals("above", subject.sift76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight77() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle77());
        }
        assertEquals(2, subject.threshold77Count());
    }

    @Test
    void refusesOnceExhaustedWeight77() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 2; i++) {
            subject.kindle77();
        }
        assertFalse(subject.kindle77());
    }

    @Test
    void accumulatesBelowTheCapQuota78() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.gauge78(1));
        assertEquals(3, subject.gauge78(2));
    }

    @Test
    void saturatesAtTheCapQuota78() {
        CopperCistern subject = new CopperCistern();
        subject.gauge78(58);
        assertEquals(58, subject.gauge78(5));
    }

    @Test
    void ignoresNegativeValuesQuota78() {
        CopperCistern subject = new CopperCistern();
        subject.gauge78(3);
        assertEquals(3, subject.gauge78(-2));
        assertEquals(3, subject.ratio78Value());
    }

    @Test
    void rejectsZeroDenominatorOffset79() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.hoist79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset79() {
        assertEquals(0.5, new CopperCistern().hoist79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset79() {
        assertEquals(5.0, new CopperCistern().hoist79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence80() {
        assertTrue(new CopperCistern().furl80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new CopperCistern().furl80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence80() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperCistern().furl80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota81() {
        assertEquals("below", new CopperCistern().collate81(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota81() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.collate81(3));
        assertEquals("upper-bound", subject.collate81(10));
    }

    @Test
    void classifiesWithinAndAboveQuota81() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.collate81(3 + 1));
        assertEquals("above", subject.collate81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota82() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal82());
        }
        assertEquals(3, subject.span82Count());
    }

    @Test
    void refusesOnceExhaustedQuota82() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 3; i++) {
            subject.anneal82();
        }
        assertFalse(subject.anneal82());
    }

    @Test
    void accumulatesBelowTheCapQuota83() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.tally83(1));
        assertEquals(3, subject.tally83(2));
    }

    @Test
    void saturatesAtTheCapQuota83() {
        CopperCistern subject = new CopperCistern();
        subject.tally83(23);
        assertEquals(23, subject.tally83(5));
    }

    @Test
    void ignoresNegativeValuesQuota83() {
        CopperCistern subject = new CopperCistern();
        subject.tally83(3);
        assertEquals(3, subject.tally83(-2));
        assertEquals(3, subject.drift83Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity84() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.gauge84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity84() {
        assertEquals(0.5, new CopperCistern().gauge84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity84() {
        assertEquals(5.0, new CopperCistern().gauge84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio85() {
        assertTrue(new CopperCistern().kindle85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new CopperCistern().kindle85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio85() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperCistern().kindle85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota86() {
        assertEquals("below", new CopperCistern().hoist86(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota86() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.hoist86(4));
        assertEquals("upper-bound", subject.hoist86(9));
    }

    @Test
    void classifiesWithinAndAboveQuota86() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.hoist86(4 + 1));
        assertEquals("above", subject.hoist86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield87() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle87());
        }
        assertEquals(4, subject.margin87Count());
    }

    @Test
    void refusesOnceExhaustedYield87() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 4; i++) {
            subject.kindle87();
        }
        assertFalse(subject.kindle87());
    }

    @Test
    void accumulatesBelowTheCapSpan88() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.anneal88(1));
        assertEquals(3, subject.anneal88(2));
    }

    @Test
    void saturatesAtTheCapSpan88() {
        CopperCistern subject = new CopperCistern();
        subject.anneal88(28);
        assertEquals(28, subject.anneal88(5));
    }

    @Test
    void ignoresNegativeValuesSpan88() {
        CopperCistern subject = new CopperCistern();
        subject.anneal88(3);
        assertEquals(3, subject.anneal88(-2));
        assertEquals(3, subject.bias88Value());
    }

    @Test
    void rejectsZeroDenominatorMargin89() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.kindle89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin89() {
        assertEquals(0.5, new CopperCistern().kindle89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin89() {
        assertEquals(5.0, new CopperCistern().kindle89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth90() {
        assertTrue(new CopperCistern().temper90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new CopperCistern().temper90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth90() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperCistern().temper90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias91() {
        assertEquals("below", new CopperCistern().prune91(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias91() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.prune91(5));
        assertEquals("upper-bound", subject.prune91(8));
    }

    @Test
    void classifiesWithinAndAboveBias91() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.prune91(5 + 1));
        assertEquals("above", subject.prune91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio92() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally92());
        }
        assertEquals(1, subject.drift92Count());
    }

    @Test
    void refusesOnceExhaustedRatio92() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 1; i++) {
            subject.tally92();
        }
        assertFalse(subject.tally92());
    }

    @Test
    void accumulatesBelowTheCapRatio93() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.kindle93(1));
        assertEquals(3, subject.kindle93(2));
    }

    @Test
    void saturatesAtTheCapRatio93() {
        CopperCistern subject = new CopperCistern();
        subject.kindle93(33);
        assertEquals(33, subject.kindle93(5));
    }

    @Test
    void ignoresNegativeValuesRatio93() {
        CopperCistern subject = new CopperCistern();
        subject.kindle93(3);
        assertEquals(3, subject.kindle93(-2));
        assertEquals(3, subject.cadence93Value());
    }

    @Test
    void rejectsZeroDenominatorDepth94() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.temper94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth94() {
        assertEquals(0.5, new CopperCistern().temper94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth94() {
        assertEquals(5.0, new CopperCistern().temper94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias95() {
        assertTrue(new CopperCistern().kindle95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new CopperCistern().kindle95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias95() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperCistern().kindle95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight96() {
        assertEquals("below", new CopperCistern().prune96(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight96() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.prune96(2));
        assertEquals("upper-bound", subject.prune96(7));
    }

    @Test
    void classifiesWithinAndAboveWeight96() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.prune96(2 + 1));
        assertEquals("above", subject.prune96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota97() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle97());
        }
        assertEquals(2, subject.ratio97Count());
    }

    @Test
    void refusesOnceExhaustedQuota97() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 2; i++) {
            subject.kindle97();
        }
        assertFalse(subject.kindle97());
    }

    @Test
    void accumulatesBelowTheCapMargin98() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.flatten98(1));
        assertEquals(3, subject.flatten98(2));
    }

    @Test
    void saturatesAtTheCapMargin98() {
        CopperCistern subject = new CopperCistern();
        subject.flatten98(38);
        assertEquals(38, subject.flatten98(5));
    }

    @Test
    void ignoresNegativeValuesMargin98() {
        CopperCistern subject = new CopperCistern();
        subject.flatten98(3);
        assertEquals(3, subject.flatten98(-2));
        assertEquals(3, subject.span98Value());
    }

    @Test
    void rejectsZeroDenominatorOffset99() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.sift99(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset99() {
        assertEquals(0.5, new CopperCistern().sift99(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset99() {
        assertEquals(5.0, new CopperCistern().sift99(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth100() {
        assertTrue(new CopperCistern().winnow100(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth100() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new CopperCistern().winnow100(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth100() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperCistern().winnow100(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota101() {
        assertEquals("below", new CopperCistern().brace101(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota101() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.brace101(3));
        assertEquals("upper-bound", subject.brace101(12));
    }

    @Test
    void classifiesWithinAndAboveQuota101() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.brace101(3 + 1));
        assertEquals("above", subject.brace101(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio102() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift102());
        }
        assertEquals(3, subject.quota102Count());
    }

    @Test
    void refusesOnceExhaustedRatio102() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 3; i++) {
            subject.sift102();
        }
        assertFalse(subject.sift102());
    }

    @Test
    void accumulatesBelowTheCapQuota103() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.gauge103(1));
        assertEquals(3, subject.gauge103(2));
    }

    @Test
    void saturatesAtTheCapQuota103() {
        CopperCistern subject = new CopperCistern();
        subject.gauge103(43);
        assertEquals(43, subject.gauge103(5));
    }

    @Test
    void ignoresNegativeValuesQuota103() {
        CopperCistern subject = new CopperCistern();
        subject.gauge103(3);
        assertEquals(3, subject.gauge103(-2));
        assertEquals(3, subject.margin103Value());
    }

    @Test
    void rejectsZeroDenominatorQuota104() {
        CopperCistern subject = new CopperCistern();
        assertThrows(ArithmeticException.class, () -> subject.winnow104(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota104() {
        assertEquals(0.5, new CopperCistern().winnow104(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota104() {
        assertEquals(5.0, new CopperCistern().winnow104(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan105() {
        assertTrue(new CopperCistern().collate105(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan105() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new CopperCistern().collate105(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan105() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperCistern().collate105(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota106() {
        assertEquals("below", new CopperCistern().collate106(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota106() {
        CopperCistern subject = new CopperCistern();
        assertEquals("lower-bound", subject.collate106(4));
        assertEquals("upper-bound", subject.collate106(11));
    }

    @Test
    void classifiesWithinAndAboveQuota106() {
        CopperCistern subject = new CopperCistern();
        assertEquals("within", subject.collate106(4 + 1));
        assertEquals("above", subject.collate106(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota107() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle107());
        }
        assertEquals(4, subject.span107Count());
    }

    @Test
    void refusesOnceExhaustedQuota107() {
        CopperCistern subject = new CopperCistern();
        for (int i = 0; i < 4; i++) {
            subject.kindle107();
        }
        assertFalse(subject.kindle107());
    }

    @Test
    void accumulatesBelowTheCapCadence108() {
        CopperCistern subject = new CopperCistern();
        assertEquals(1, subject.flatten108(1));
        assertEquals(3, subject.flatten108(2));
    }

    @Test
    void saturatesAtTheCapCadence108() {
        CopperCistern subject = new CopperCistern();
        subject.flatten108(48);
        assertEquals(48, subject.flatten108(5));
    }

    @Test
    void ignoresNegativeValuesCadence108() {
        CopperCistern subject = new CopperCistern();
        subject.flatten108(3);
        assertEquals(3, subject.flatten108(-2));
        assertEquals(3, subject.tally108Value());
    }
}
