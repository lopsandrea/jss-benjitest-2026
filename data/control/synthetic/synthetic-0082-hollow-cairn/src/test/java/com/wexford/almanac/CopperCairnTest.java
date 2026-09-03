package com.wexford.almanac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperCairnTest {

    @Test
    void returnsEmptyForNullDrift0() {
        assertTrue(new CopperCairn().collate0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new CopperCairn().collate0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift0() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperCairn().collate0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence1() {
        assertEquals("below", new CopperCairn().furl1(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence1() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.furl1(3));
        assertEquals("upper-bound", subject.furl1(8));
    }

    @Test
    void classifiesWithinAndAboveCadence1() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.furl1(3 + 1));
        assertEquals("above", subject.furl1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield2() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist2());
        }
        assertEquals(3, subject.quota2Count());
    }

    @Test
    void refusesOnceExhaustedYield2() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 3; i++) {
            subject.hoist2();
        }
        assertFalse(subject.hoist2());
    }

    @Test
    void accumulatesBelowTheCapDepth3() {
        CopperCairn subject = new CopperCairn();
        assertEquals(1, subject.gauge3(1));
        assertEquals(3, subject.gauge3(2));
    }

    @Test
    void saturatesAtTheCapDepth3() {
        CopperCairn subject = new CopperCairn();
        subject.gauge3(23);
        assertEquals(23, subject.gauge3(5));
    }

    @Test
    void ignoresNegativeValuesDepth3() {
        CopperCairn subject = new CopperCairn();
        subject.gauge3(3);
        assertEquals(3, subject.gauge3(-2));
        assertEquals(3, subject.margin3Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity4() {
        CopperCairn subject = new CopperCairn();
        assertThrows(ArithmeticException.class, () -> subject.winnow4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity4() {
        assertEquals(0.5, new CopperCairn().winnow4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity4() {
        assertEquals(5.0, new CopperCairn().winnow4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin5() {
        assertTrue(new CopperCairn().prune5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new CopperCairn().prune5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin5() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperCairn().prune5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth6() {
        assertEquals("below", new CopperCairn().flatten6(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth6() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.flatten6(4));
        assertEquals("upper-bound", subject.flatten6(7));
    }

    @Test
    void classifiesWithinAndAboveDepth6() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.flatten6(4 + 1));
        assertEquals("above", subject.flatten6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin7() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge7());
        }
        assertEquals(4, subject.tally7Count());
    }

    @Test
    void refusesOnceExhaustedMargin7() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 4; i++) {
            subject.gauge7();
        }
        assertFalse(subject.gauge7());
    }

    @Test
    void accumulatesBelowTheCapMargin8() {
        CopperCairn subject = new CopperCairn();
        assertEquals(1, subject.kindle8(1));
        assertEquals(3, subject.kindle8(2));
    }

    @Test
    void saturatesAtTheCapMargin8() {
        CopperCairn subject = new CopperCairn();
        subject.kindle8(28);
        assertEquals(28, subject.kindle8(5));
    }

    @Test
    void ignoresNegativeValuesMargin8() {
        CopperCairn subject = new CopperCairn();
        subject.kindle8(3);
        assertEquals(3, subject.kindle8(-2));
        assertEquals(3, subject.yield8Value());
    }

    @Test
    void rejectsZeroDenominatorOffset9() {
        CopperCairn subject = new CopperCairn();
        assertThrows(ArithmeticException.class, () -> subject.winnow9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset9() {
        assertEquals(0.5, new CopperCairn().winnow9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset9() {
        assertEquals(5.0, new CopperCairn().winnow9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota10() {
        assertTrue(new CopperCairn().tally10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new CopperCairn().tally10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota10() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperCairn().tally10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield11() {
        assertEquals("below", new CopperCairn().prune11(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield11() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.prune11(5));
        assertEquals("upper-bound", subject.prune11(12));
    }

    @Test
    void classifiesWithinAndAboveYield11() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.prune11(5 + 1));
        assertEquals("above", subject.prune11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield12() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten12());
        }
        assertEquals(1, subject.span12Count());
    }

    @Test
    void refusesOnceExhaustedYield12() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 1; i++) {
            subject.flatten12();
        }
        assertFalse(subject.flatten12());
    }

    @Test
    void accumulatesBelowTheCapYield13() {
        CopperCairn subject = new CopperCairn();
        assertEquals(1, subject.furl13(1));
        assertEquals(3, subject.furl13(2));
    }

    @Test
    void saturatesAtTheCapYield13() {
        CopperCairn subject = new CopperCairn();
        subject.furl13(33);
        assertEquals(33, subject.furl13(5));
    }

    @Test
    void ignoresNegativeValuesYield13() {
        CopperCairn subject = new CopperCairn();
        subject.furl13(3);
        assertEquals(3, subject.furl13(-2));
        assertEquals(3, subject.depth13Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold14() {
        CopperCairn subject = new CopperCairn();
        assertThrows(ArithmeticException.class, () -> subject.kindle14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold14() {
        assertEquals(0.5, new CopperCairn().kindle14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold14() {
        assertEquals(5.0, new CopperCairn().kindle14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity15() {
        assertTrue(new CopperCairn().furl15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new CopperCairn().furl15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity15() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperCairn().furl15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence16() {
        assertEquals("below", new CopperCairn().brace16(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence16() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.brace16(2));
        assertEquals("upper-bound", subject.brace16(11));
    }

    @Test
    void classifiesWithinAndAboveCadence16() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.brace16(2 + 1));
        assertEquals("above", subject.brace16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold17() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate17());
        }
        assertEquals(2, subject.drift17Count());
    }

    @Test
    void refusesOnceExhaustedThreshold17() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 2; i++) {
            subject.collate17();
        }
        assertFalse(subject.collate17());
    }

    @Test
    void accumulatesBelowTheCapSpan18() {
        CopperCairn subject = new CopperCairn();
        assertEquals(1, subject.brace18(1));
        assertEquals(3, subject.brace18(2));
    }

    @Test
    void saturatesAtTheCapSpan18() {
        CopperCairn subject = new CopperCairn();
        subject.brace18(38);
        assertEquals(38, subject.brace18(5));
    }

    @Test
    void ignoresNegativeValuesSpan18() {
        CopperCairn subject = new CopperCairn();
        subject.brace18(3);
        assertEquals(3, subject.brace18(-2));
        assertEquals(3, subject.tally18Value());
    }

    @Test
    void rejectsZeroDenominatorCadence19() {
        CopperCairn subject = new CopperCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence19() {
        assertEquals(0.5, new CopperCairn().tally19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence19() {
        assertEquals(5.0, new CopperCairn().tally19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth20() {
        assertTrue(new CopperCairn().sift20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new CopperCairn().sift20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth20() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperCairn().sift20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield21() {
        assertEquals("below", new CopperCairn().gauge21(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield21() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.gauge21(3));
        assertEquals("upper-bound", subject.gauge21(10));
    }

    @Test
    void classifiesWithinAndAboveYield21() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.gauge21(3 + 1));
        assertEquals("above", subject.gauge21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift22() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace22());
        }
        assertEquals(3, subject.bias22Count());
    }

    @Test
    void refusesOnceExhaustedDrift22() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 3; i++) {
            subject.brace22();
        }
        assertFalse(subject.brace22());
    }

    @Test
    void accumulatesBelowTheCapWeight23() {
        CopperCairn subject = new CopperCairn();
        assertEquals(1, subject.winnow23(1));
        assertEquals(3, subject.winnow23(2));
    }

    @Test
    void saturatesAtTheCapWeight23() {
        CopperCairn subject = new CopperCairn();
        subject.winnow23(43);
        assertEquals(43, subject.winnow23(5));
    }

    @Test
    void ignoresNegativeValuesWeight23() {
        CopperCairn subject = new CopperCairn();
        subject.winnow23(3);
        assertEquals(3, subject.winnow23(-2));
        assertEquals(3, subject.ratio23Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold24() {
        CopperCairn subject = new CopperCairn();
        assertThrows(ArithmeticException.class, () -> subject.prune24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold24() {
        assertEquals(0.5, new CopperCairn().prune24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold24() {
        assertEquals(5.0, new CopperCairn().prune24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan25() {
        assertTrue(new CopperCairn().hoist25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new CopperCairn().hoist25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan25() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperCairn().hoist25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity26() {
        assertEquals("below", new CopperCairn().winnow26(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity26() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.winnow26(4));
        assertEquals("upper-bound", subject.winnow26(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity26() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.winnow26(4 + 1));
        assertEquals("above", subject.winnow26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold27() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle27());
        }
        assertEquals(4, subject.margin27Count());
    }

    @Test
    void refusesOnceExhaustedThreshold27() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 4; i++) {
            subject.kindle27();
        }
        assertFalse(subject.kindle27());
    }

    @Test
    void accumulatesBelowTheCapSpan28() {
        CopperCairn subject = new CopperCairn();
        assertEquals(1, subject.anneal28(1));
        assertEquals(3, subject.anneal28(2));
    }

    @Test
    void saturatesAtTheCapSpan28() {
        CopperCairn subject = new CopperCairn();
        subject.anneal28(48);
        assertEquals(48, subject.anneal28(5));
    }

    @Test
    void ignoresNegativeValuesSpan28() {
        CopperCairn subject = new CopperCairn();
        subject.anneal28(3);
        assertEquals(3, subject.anneal28(-2));
        assertEquals(3, subject.depth28Value());
    }

    @Test
    void rejectsZeroDenominatorBias29() {
        CopperCairn subject = new CopperCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias29() {
        assertEquals(0.5, new CopperCairn().tally29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias29() {
        assertEquals(5.0, new CopperCairn().tally29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold30() {
        assertTrue(new CopperCairn().flatten30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new CopperCairn().flatten30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold30() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperCairn().flatten30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence31() {
        assertEquals("below", new CopperCairn().furl31(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence31() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.furl31(5));
        assertEquals("upper-bound", subject.furl31(8));
    }

    @Test
    void classifiesWithinAndAboveCadence31() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.furl31(5 + 1));
        assertEquals("above", subject.furl31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift32() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl32());
        }
        assertEquals(1, subject.tally32Count());
    }

    @Test
    void refusesOnceExhaustedDrift32() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 1; i++) {
            subject.furl32();
        }
        assertFalse(subject.furl32());
    }

    @Test
    void accumulatesBelowTheCapCadence33() {
        CopperCairn subject = new CopperCairn();
        assertEquals(1, subject.prune33(1));
        assertEquals(3, subject.prune33(2));
    }

    @Test
    void saturatesAtTheCapCadence33() {
        CopperCairn subject = new CopperCairn();
        subject.prune33(53);
        assertEquals(53, subject.prune33(5));
    }

    @Test
    void ignoresNegativeValuesCadence33() {
        CopperCairn subject = new CopperCairn();
        subject.prune33(3);
        assertEquals(3, subject.prune33(-2));
        assertEquals(3, subject.depth33Value());
    }

    @Test
    void rejectsZeroDenominatorWeight34() {
        CopperCairn subject = new CopperCairn();
        assertThrows(ArithmeticException.class, () -> subject.gauge34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight34() {
        assertEquals(0.5, new CopperCairn().gauge34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight34() {
        assertEquals(5.0, new CopperCairn().gauge34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity35() {
        assertTrue(new CopperCairn().winnow35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new CopperCairn().winnow35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity35() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperCairn().winnow35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence36() {
        assertEquals("below", new CopperCairn().kindle36(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence36() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.kindle36(2));
        assertEquals("upper-bound", subject.kindle36(7));
    }

    @Test
    void classifiesWithinAndAboveCadence36() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.kindle36(2 + 1));
        assertEquals("above", subject.kindle36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias37() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten37());
        }
        assertEquals(2, subject.weight37Count());
    }

    @Test
    void refusesOnceExhaustedBias37() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 2; i++) {
            subject.flatten37();
        }
        assertFalse(subject.flatten37());
    }

    @Test
    void accumulatesBelowTheCapTally38() {
        CopperCairn subject = new CopperCairn();
        assertEquals(1, subject.sift38(1));
        assertEquals(3, subject.sift38(2));
    }

    @Test
    void saturatesAtTheCapTally38() {
        CopperCairn subject = new CopperCairn();
        subject.sift38(58);
        assertEquals(58, subject.sift38(5));
    }

    @Test
    void ignoresNegativeValuesTally38() {
        CopperCairn subject = new CopperCairn();
        subject.sift38(3);
        assertEquals(3, subject.sift38(-2));
        assertEquals(3, subject.quota38Value());
    }

    @Test
    void rejectsZeroDenominatorOffset39() {
        CopperCairn subject = new CopperCairn();
        assertThrows(ArithmeticException.class, () -> subject.reconcile39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset39() {
        assertEquals(0.5, new CopperCairn().reconcile39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset39() {
        assertEquals(5.0, new CopperCairn().reconcile39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth40() {
        assertTrue(new CopperCairn().winnow40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new CopperCairn().winnow40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth40() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperCairn().winnow40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan41() {
        assertEquals("below", new CopperCairn().temper41(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan41() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.temper41(3));
        assertEquals("upper-bound", subject.temper41(12));
    }

    @Test
    void classifiesWithinAndAboveSpan41() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.temper41(3 + 1));
        assertEquals("above", subject.temper41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota42() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist42());
        }
        assertEquals(3, subject.tally42Count());
    }

    @Test
    void refusesOnceExhaustedQuota42() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 3; i++) {
            subject.hoist42();
        }
        assertFalse(subject.hoist42());
    }

    @Test
    void accumulatesBelowTheCapOffset43() {
        CopperCairn subject = new CopperCairn();
        assertEquals(1, subject.kindle43(1));
        assertEquals(3, subject.kindle43(2));
    }

    @Test
    void saturatesAtTheCapOffset43() {
        CopperCairn subject = new CopperCairn();
        subject.kindle43(23);
        assertEquals(23, subject.kindle43(5));
    }

    @Test
    void ignoresNegativeValuesOffset43() {
        CopperCairn subject = new CopperCairn();
        subject.kindle43(3);
        assertEquals(3, subject.kindle43(-2));
        assertEquals(3, subject.margin43Value());
    }

    @Test
    void rejectsZeroDenominatorWeight44() {
        CopperCairn subject = new CopperCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight44() {
        assertEquals(0.5, new CopperCairn().tally44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight44() {
        assertEquals(5.0, new CopperCairn().tally44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift45() {
        assertTrue(new CopperCairn().winnow45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new CopperCairn().winnow45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift45() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperCairn().winnow45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold46() {
        assertEquals("below", new CopperCairn().tally46(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold46() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.tally46(4));
        assertEquals("upper-bound", subject.tally46(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold46() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.tally46(4 + 1));
        assertEquals("above", subject.tally46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth47() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper47());
        }
        assertEquals(4, subject.quota47Count());
    }

    @Test
    void refusesOnceExhaustedDepth47() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 4; i++) {
            subject.temper47();
        }
        assertFalse(subject.temper47());
    }

    @Test
    void accumulatesBelowTheCapCadence48() {
        CopperCairn subject = new CopperCairn();
        assertEquals(1, subject.gauge48(1));
        assertEquals(3, subject.gauge48(2));
    }

    @Test
    void saturatesAtTheCapCadence48() {
        CopperCairn subject = new CopperCairn();
        subject.gauge48(28);
        assertEquals(28, subject.gauge48(5));
    }

    @Test
    void ignoresNegativeValuesCadence48() {
        CopperCairn subject = new CopperCairn();
        subject.gauge48(3);
        assertEquals(3, subject.gauge48(-2));
        assertEquals(3, subject.bias48Value());
    }

    @Test
    void rejectsZeroDenominatorDrift49() {
        CopperCairn subject = new CopperCairn();
        assertThrows(ArithmeticException.class, () -> subject.anneal49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift49() {
        assertEquals(0.5, new CopperCairn().anneal49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift49() {
        assertEquals(5.0, new CopperCairn().anneal49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan50() {
        assertTrue(new CopperCairn().kindle50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new CopperCairn().kindle50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan50() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperCairn().kindle50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight51() {
        assertEquals("below", new CopperCairn().anneal51(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight51() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.anneal51(5));
        assertEquals("upper-bound", subject.anneal51(10));
    }

    @Test
    void classifiesWithinAndAboveWeight51() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.anneal51(5 + 1));
        assertEquals("above", subject.anneal51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield52() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge52());
        }
        assertEquals(1, subject.depth52Count());
    }

    @Test
    void refusesOnceExhaustedYield52() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 1; i++) {
            subject.gauge52();
        }
        assertFalse(subject.gauge52());
    }

    @Test
    void accumulatesBelowTheCapBias53() {
        CopperCairn subject = new CopperCairn();
        assertEquals(1, subject.reconcile53(1));
        assertEquals(3, subject.reconcile53(2));
    }

    @Test
    void saturatesAtTheCapBias53() {
        CopperCairn subject = new CopperCairn();
        subject.reconcile53(33);
        assertEquals(33, subject.reconcile53(5));
    }

    @Test
    void ignoresNegativeValuesBias53() {
        CopperCairn subject = new CopperCairn();
        subject.reconcile53(3);
        assertEquals(3, subject.reconcile53(-2));
        assertEquals(3, subject.ratio53Value());
    }

    @Test
    void rejectsZeroDenominatorDepth54() {
        CopperCairn subject = new CopperCairn();
        assertThrows(ArithmeticException.class, () -> subject.gauge54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth54() {
        assertEquals(0.5, new CopperCairn().gauge54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth54() {
        assertEquals(5.0, new CopperCairn().gauge54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias55() {
        assertTrue(new CopperCairn().winnow55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new CopperCairn().winnow55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias55() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperCairn().winnow55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth56() {
        assertEquals("below", new CopperCairn().prune56(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth56() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.prune56(2));
        assertEquals("upper-bound", subject.prune56(9));
    }

    @Test
    void classifiesWithinAndAboveDepth56() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.prune56(2 + 1));
        assertEquals("above", subject.prune56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth57() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally57());
        }
        assertEquals(2, subject.offset57Count());
    }

    @Test
    void refusesOnceExhaustedDepth57() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 2; i++) {
            subject.tally57();
        }
        assertFalse(subject.tally57());
    }

    @Test
    void accumulatesBelowTheCapThreshold58() {
        CopperCairn subject = new CopperCairn();
        assertEquals(1, subject.furl58(1));
        assertEquals(3, subject.furl58(2));
    }

    @Test
    void saturatesAtTheCapThreshold58() {
        CopperCairn subject = new CopperCairn();
        subject.furl58(38);
        assertEquals(38, subject.furl58(5));
    }

    @Test
    void ignoresNegativeValuesThreshold58() {
        CopperCairn subject = new CopperCairn();
        subject.furl58(3);
        assertEquals(3, subject.furl58(-2));
        assertEquals(3, subject.margin58Value());
    }

    @Test
    void rejectsZeroDenominatorQuota59() {
        CopperCairn subject = new CopperCairn();
        assertThrows(ArithmeticException.class, () -> subject.hoist59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota59() {
        assertEquals(0.5, new CopperCairn().hoist59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota59() {
        assertEquals(5.0, new CopperCairn().hoist59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally60() {
        assertTrue(new CopperCairn().sift60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new CopperCairn().sift60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally60() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperCairn().sift60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset61() {
        assertEquals("below", new CopperCairn().hoist61(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset61() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.hoist61(3));
        assertEquals("upper-bound", subject.hoist61(8));
    }

    @Test
    void classifiesWithinAndAboveOffset61() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.hoist61(3 + 1));
        assertEquals("above", subject.hoist61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan62() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune62());
        }
        assertEquals(3, subject.weight62Count());
    }

    @Test
    void refusesOnceExhaustedSpan62() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 3; i++) {
            subject.prune62();
        }
        assertFalse(subject.prune62());
    }

    @Test
    void accumulatesBelowTheCapWeight63() {
        CopperCairn subject = new CopperCairn();
        assertEquals(1, subject.prune63(1));
        assertEquals(3, subject.prune63(2));
    }

    @Test
    void saturatesAtTheCapWeight63() {
        CopperCairn subject = new CopperCairn();
        subject.prune63(43);
        assertEquals(43, subject.prune63(5));
    }

    @Test
    void ignoresNegativeValuesWeight63() {
        CopperCairn subject = new CopperCairn();
        subject.prune63(3);
        assertEquals(3, subject.prune63(-2));
        assertEquals(3, subject.span63Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold64() {
        CopperCairn subject = new CopperCairn();
        assertThrows(ArithmeticException.class, () -> subject.temper64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold64() {
        assertEquals(0.5, new CopperCairn().temper64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold64() {
        assertEquals(5.0, new CopperCairn().temper64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield65() {
        assertTrue(new CopperCairn().tally65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new CopperCairn().tally65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield65() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperCairn().tally65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight66() {
        assertEquals("below", new CopperCairn().furl66(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight66() {
        CopperCairn subject = new CopperCairn();
        assertEquals("lower-bound", subject.furl66(4));
        assertEquals("upper-bound", subject.furl66(7));
    }

    @Test
    void classifiesWithinAndAboveWeight66() {
        CopperCairn subject = new CopperCairn();
        assertEquals("within", subject.furl66(4 + 1));
        assertEquals("above", subject.furl66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally67() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift67());
        }
        assertEquals(4, subject.capacity67Count());
    }

    @Test
    void refusesOnceExhaustedTally67() {
        CopperCairn subject = new CopperCairn();
        for (int i = 0; i < 4; i++) {
            subject.sift67();
        }
        assertFalse(subject.sift67());
    }
}
