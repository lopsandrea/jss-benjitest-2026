package com.amber.cistern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowFoundryTest {

    @Test
    void allowsAttemptsUpToTheBudgetSpan0() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift0());
        }
        assertEquals(1, subject.cadence0Count());
    }

    @Test
    void refusesOnceExhaustedSpan0() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 1; i++) {
            subject.sift0();
        }
        assertFalse(subject.sift0());
    }

    @Test
    void accumulatesBelowTheCapYield1() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.winnow1(1));
        assertEquals(3, subject.winnow1(2));
    }

    @Test
    void saturatesAtTheCapYield1() {
        HollowFoundry subject = new HollowFoundry();
        subject.winnow1(21);
        assertEquals(21, subject.winnow1(5));
    }

    @Test
    void ignoresNegativeValuesYield1() {
        HollowFoundry subject = new HollowFoundry();
        subject.winnow1(3);
        assertEquals(3, subject.winnow1(-2));
        assertEquals(3, subject.margin1Value());
    }

    @Test
    void rejectsZeroDenominatorBias2() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.winnow2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias2() {
        assertEquals(0.5, new HollowFoundry().winnow2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias2() {
        assertEquals(3.0, new HollowFoundry().winnow2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift3() {
        assertTrue(new HollowFoundry().prune3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new HollowFoundry().prune3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift3() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowFoundry().prune3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight4() {
        assertEquals("below", new HollowFoundry().sift4(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight4() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.sift4(2));
        assertEquals("upper-bound", subject.sift4(11));
    }

    @Test
    void classifiesWithinAndAboveWeight4() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.sift4(2 + 1));
        assertEquals("above", subject.sift4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight5() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl5());
        }
        assertEquals(2, subject.offset5Count());
    }

    @Test
    void refusesOnceExhaustedWeight5() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 2; i++) {
            subject.furl5();
        }
        assertFalse(subject.furl5());
    }

    @Test
    void accumulatesBelowTheCapCapacity6() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.anneal6(1));
        assertEquals(3, subject.anneal6(2));
    }

    @Test
    void saturatesAtTheCapCapacity6() {
        HollowFoundry subject = new HollowFoundry();
        subject.anneal6(26);
        assertEquals(26, subject.anneal6(5));
    }

    @Test
    void ignoresNegativeValuesCapacity6() {
        HollowFoundry subject = new HollowFoundry();
        subject.anneal6(3);
        assertEquals(3, subject.anneal6(-2));
        assertEquals(3, subject.weight6Value());
    }

    @Test
    void rejectsZeroDenominatorOffset7() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.furl7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset7() {
        assertEquals(0.5, new HollowFoundry().furl7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset7() {
        assertEquals(3.0, new HollowFoundry().furl7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold8() {
        assertTrue(new HollowFoundry().hoist8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new HollowFoundry().hoist8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold8() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowFoundry().hoist8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio9() {
        assertEquals("below", new HollowFoundry().kindle9(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio9() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.kindle9(3));
        assertEquals("upper-bound", subject.kindle9(10));
    }

    @Test
    void classifiesWithinAndAboveRatio9() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.kindle9(3 + 1));
        assertEquals("above", subject.kindle9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight10() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow10());
        }
        assertEquals(3, subject.tally10Count());
    }

    @Test
    void refusesOnceExhaustedWeight10() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 3; i++) {
            subject.winnow10();
        }
        assertFalse(subject.winnow10());
    }

    @Test
    void accumulatesBelowTheCapCapacity11() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.winnow11(1));
        assertEquals(3, subject.winnow11(2));
    }

    @Test
    void saturatesAtTheCapCapacity11() {
        HollowFoundry subject = new HollowFoundry();
        subject.winnow11(31);
        assertEquals(31, subject.winnow11(5));
    }

    @Test
    void ignoresNegativeValuesCapacity11() {
        HollowFoundry subject = new HollowFoundry();
        subject.winnow11(3);
        assertEquals(3, subject.winnow11(-2));
        assertEquals(3, subject.threshold11Value());
    }

    @Test
    void rejectsZeroDenominatorMargin12() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.tally12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin12() {
        assertEquals(0.5, new HollowFoundry().tally12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin12() {
        assertEquals(3.0, new HollowFoundry().tally12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth13() {
        assertTrue(new HollowFoundry().sift13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new HollowFoundry().sift13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth13() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowFoundry().sift13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold14() {
        assertEquals("below", new HollowFoundry().hoist14(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold14() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.hoist14(4));
        assertEquals("upper-bound", subject.hoist14(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold14() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.hoist14(4 + 1));
        assertEquals("above", subject.hoist14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift15() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally15());
        }
        assertEquals(4, subject.ratio15Count());
    }

    @Test
    void refusesOnceExhaustedDrift15() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 4; i++) {
            subject.tally15();
        }
        assertFalse(subject.tally15());
    }

    @Test
    void accumulatesBelowTheCapQuota16() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.kindle16(1));
        assertEquals(3, subject.kindle16(2));
    }

    @Test
    void saturatesAtTheCapQuota16() {
        HollowFoundry subject = new HollowFoundry();
        subject.kindle16(36);
        assertEquals(36, subject.kindle16(5));
    }

    @Test
    void ignoresNegativeValuesQuota16() {
        HollowFoundry subject = new HollowFoundry();
        subject.kindle16(3);
        assertEquals(3, subject.kindle16(-2));
        assertEquals(3, subject.threshold16Value());
    }

    @Test
    void rejectsZeroDenominatorMargin17() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.kindle17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin17() {
        assertEquals(0.5, new HollowFoundry().kindle17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin17() {
        assertEquals(3.0, new HollowFoundry().kindle17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio18() {
        assertTrue(new HollowFoundry().winnow18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new HollowFoundry().winnow18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio18() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowFoundry().winnow18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield19() {
        assertEquals("below", new HollowFoundry().furl19(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield19() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.furl19(5));
        assertEquals("upper-bound", subject.furl19(8));
    }

    @Test
    void classifiesWithinAndAboveYield19() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.furl19(5 + 1));
        assertEquals("above", subject.furl19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias20() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten20());
        }
        assertEquals(1, subject.span20Count());
    }

    @Test
    void refusesOnceExhaustedBias20() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 1; i++) {
            subject.flatten20();
        }
        assertFalse(subject.flatten20());
    }

    @Test
    void accumulatesBelowTheCapDrift21() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.temper21(1));
        assertEquals(3, subject.temper21(2));
    }

    @Test
    void saturatesAtTheCapDrift21() {
        HollowFoundry subject = new HollowFoundry();
        subject.temper21(41);
        assertEquals(41, subject.temper21(5));
    }

    @Test
    void ignoresNegativeValuesDrift21() {
        HollowFoundry subject = new HollowFoundry();
        subject.temper21(3);
        assertEquals(3, subject.temper21(-2));
        assertEquals(3, subject.depth21Value());
    }

    @Test
    void rejectsZeroDenominatorSpan22() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.brace22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan22() {
        assertEquals(0.5, new HollowFoundry().brace22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan22() {
        assertEquals(3.0, new HollowFoundry().brace22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset23() {
        assertTrue(new HollowFoundry().gauge23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new HollowFoundry().gauge23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset23() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowFoundry().gauge23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin24() {
        assertEquals("below", new HollowFoundry().brace24(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin24() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.brace24(2));
        assertEquals("upper-bound", subject.brace24(7));
    }

    @Test
    void classifiesWithinAndAboveMargin24() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.brace24(2 + 1));
        assertEquals("above", subject.brace24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio25() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper25());
        }
        assertEquals(2, subject.weight25Count());
    }

    @Test
    void refusesOnceExhaustedRatio25() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 2; i++) {
            subject.temper25();
        }
        assertFalse(subject.temper25());
    }

    @Test
    void accumulatesBelowTheCapCadence26() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.winnow26(1));
        assertEquals(3, subject.winnow26(2));
    }

    @Test
    void saturatesAtTheCapCadence26() {
        HollowFoundry subject = new HollowFoundry();
        subject.winnow26(46);
        assertEquals(46, subject.winnow26(5));
    }

    @Test
    void ignoresNegativeValuesCadence26() {
        HollowFoundry subject = new HollowFoundry();
        subject.winnow26(3);
        assertEquals(3, subject.winnow26(-2));
        assertEquals(3, subject.tally26Value());
    }

    @Test
    void rejectsZeroDenominatorOffset27() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset27() {
        assertEquals(0.5, new HollowFoundry().collate27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset27() {
        assertEquals(3.0, new HollowFoundry().collate27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota28() {
        assertTrue(new HollowFoundry().hoist28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new HollowFoundry().hoist28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota28() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowFoundry().hoist28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift29() {
        assertEquals("below", new HollowFoundry().tally29(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift29() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.tally29(3));
        assertEquals("upper-bound", subject.tally29(12));
    }

    @Test
    void classifiesWithinAndAboveDrift29() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.tally29(3 + 1));
        assertEquals("above", subject.tally29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift30() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune30());
        }
        assertEquals(3, subject.tally30Count());
    }

    @Test
    void refusesOnceExhaustedDrift30() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 3; i++) {
            subject.prune30();
        }
        assertFalse(subject.prune30());
    }

    @Test
    void accumulatesBelowTheCapYield31() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.prune31(1));
        assertEquals(3, subject.prune31(2));
    }

    @Test
    void saturatesAtTheCapYield31() {
        HollowFoundry subject = new HollowFoundry();
        subject.prune31(51);
        assertEquals(51, subject.prune31(5));
    }

    @Test
    void ignoresNegativeValuesYield31() {
        HollowFoundry subject = new HollowFoundry();
        subject.prune31(3);
        assertEquals(3, subject.prune31(-2));
        assertEquals(3, subject.tally31Value());
    }

    @Test
    void rejectsZeroDenominatorCadence32() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.temper32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence32() {
        assertEquals(0.5, new HollowFoundry().temper32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence32() {
        assertEquals(3.0, new HollowFoundry().temper32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin33() {
        assertTrue(new HollowFoundry().sift33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new HollowFoundry().sift33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin33() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowFoundry().sift33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset34() {
        assertEquals("below", new HollowFoundry().winnow34(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset34() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.winnow34(4));
        assertEquals("upper-bound", subject.winnow34(11));
    }

    @Test
    void classifiesWithinAndAboveOffset34() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.winnow34(4 + 1));
        assertEquals("above", subject.winnow34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin35() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle35());
        }
        assertEquals(4, subject.quota35Count());
    }

    @Test
    void refusesOnceExhaustedMargin35() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 4; i++) {
            subject.kindle35();
        }
        assertFalse(subject.kindle35());
    }

    @Test
    void accumulatesBelowTheCapCadence36() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.temper36(1));
        assertEquals(3, subject.temper36(2));
    }

    @Test
    void saturatesAtTheCapCadence36() {
        HollowFoundry subject = new HollowFoundry();
        subject.temper36(56);
        assertEquals(56, subject.temper36(5));
    }

    @Test
    void ignoresNegativeValuesCadence36() {
        HollowFoundry subject = new HollowFoundry();
        subject.temper36(3);
        assertEquals(3, subject.temper36(-2));
        assertEquals(3, subject.tally36Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold37() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold37() {
        assertEquals(0.5, new HollowFoundry().reconcile37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold37() {
        assertEquals(3.0, new HollowFoundry().reconcile37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias38() {
        assertTrue(new HollowFoundry().prune38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new HollowFoundry().prune38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias38() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowFoundry().prune38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield39() {
        assertEquals("below", new HollowFoundry().anneal39(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield39() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.anneal39(5));
        assertEquals("upper-bound", subject.anneal39(10));
    }

    @Test
    void classifiesWithinAndAboveYield39() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.anneal39(5 + 1));
        assertEquals("above", subject.anneal39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield40() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally40());
        }
        assertEquals(1, subject.quota40Count());
    }

    @Test
    void refusesOnceExhaustedYield40() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 1; i++) {
            subject.tally40();
        }
        assertFalse(subject.tally40());
    }

    @Test
    void accumulatesBelowTheCapBias41() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.furl41(1));
        assertEquals(3, subject.furl41(2));
    }

    @Test
    void saturatesAtTheCapBias41() {
        HollowFoundry subject = new HollowFoundry();
        subject.furl41(21);
        assertEquals(21, subject.furl41(5));
    }

    @Test
    void ignoresNegativeValuesBias41() {
        HollowFoundry subject = new HollowFoundry();
        subject.furl41(3);
        assertEquals(3, subject.furl41(-2));
        assertEquals(3, subject.span41Value());
    }

    @Test
    void rejectsZeroDenominatorSpan42() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.gauge42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan42() {
        assertEquals(0.5, new HollowFoundry().gauge42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan42() {
        assertEquals(3.0, new HollowFoundry().gauge42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity43() {
        assertTrue(new HollowFoundry().kindle43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new HollowFoundry().kindle43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity43() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowFoundry().kindle43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias44() {
        assertEquals("below", new HollowFoundry().reconcile44(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias44() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.reconcile44(2));
        assertEquals("upper-bound", subject.reconcile44(9));
    }

    @Test
    void classifiesWithinAndAboveBias44() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.reconcile44(2 + 1));
        assertEquals("above", subject.reconcile44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift45() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist45());
        }
        assertEquals(2, subject.yield45Count());
    }

    @Test
    void refusesOnceExhaustedDrift45() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 2; i++) {
            subject.hoist45();
        }
        assertFalse(subject.hoist45());
    }

    @Test
    void accumulatesBelowTheCapThreshold46() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.kindle46(1));
        assertEquals(3, subject.kindle46(2));
    }

    @Test
    void saturatesAtTheCapThreshold46() {
        HollowFoundry subject = new HollowFoundry();
        subject.kindle46(26);
        assertEquals(26, subject.kindle46(5));
    }

    @Test
    void ignoresNegativeValuesThreshold46() {
        HollowFoundry subject = new HollowFoundry();
        subject.kindle46(3);
        assertEquals(3, subject.kindle46(-2));
        assertEquals(3, subject.drift46Value());
    }

    @Test
    void rejectsZeroDenominatorQuota47() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.gauge47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota47() {
        assertEquals(0.5, new HollowFoundry().gauge47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota47() {
        assertEquals(3.0, new HollowFoundry().gauge47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio48() {
        assertTrue(new HollowFoundry().collate48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new HollowFoundry().collate48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio48() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowFoundry().collate48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio49() {
        assertEquals("below", new HollowFoundry().tally49(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio49() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.tally49(3));
        assertEquals("upper-bound", subject.tally49(8));
    }

    @Test
    void classifiesWithinAndAboveRatio49() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.tally49(3 + 1));
        assertEquals("above", subject.tally49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth50() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune50());
        }
        assertEquals(3, subject.ratio50Count());
    }

    @Test
    void refusesOnceExhaustedDepth50() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 3; i++) {
            subject.prune50();
        }
        assertFalse(subject.prune50());
    }

    @Test
    void accumulatesBelowTheCapRatio51() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.tally51(1));
        assertEquals(3, subject.tally51(2));
    }

    @Test
    void saturatesAtTheCapRatio51() {
        HollowFoundry subject = new HollowFoundry();
        subject.tally51(31);
        assertEquals(31, subject.tally51(5));
    }

    @Test
    void ignoresNegativeValuesRatio51() {
        HollowFoundry subject = new HollowFoundry();
        subject.tally51(3);
        assertEquals(3, subject.tally51(-2));
        assertEquals(3, subject.yield51Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity52() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.tally52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity52() {
        assertEquals(0.5, new HollowFoundry().tally52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity52() {
        assertEquals(3.0, new HollowFoundry().tally52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield53() {
        assertTrue(new HollowFoundry().reconcile53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new HollowFoundry().reconcile53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield53() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowFoundry().reconcile53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota54() {
        assertEquals("below", new HollowFoundry().brace54(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota54() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.brace54(4));
        assertEquals("upper-bound", subject.brace54(7));
    }

    @Test
    void classifiesWithinAndAboveQuota54() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.brace54(4 + 1));
        assertEquals("above", subject.brace54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias55() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle55());
        }
        assertEquals(4, subject.depth55Count());
    }

    @Test
    void refusesOnceExhaustedBias55() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 4; i++) {
            subject.kindle55();
        }
        assertFalse(subject.kindle55());
    }

    @Test
    void accumulatesBelowTheCapCapacity56() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.furl56(1));
        assertEquals(3, subject.furl56(2));
    }

    @Test
    void saturatesAtTheCapCapacity56() {
        HollowFoundry subject = new HollowFoundry();
        subject.furl56(36);
        assertEquals(36, subject.furl56(5));
    }

    @Test
    void ignoresNegativeValuesCapacity56() {
        HollowFoundry subject = new HollowFoundry();
        subject.furl56(3);
        assertEquals(3, subject.furl56(-2));
        assertEquals(3, subject.depth56Value());
    }

    @Test
    void rejectsZeroDenominatorWeight57() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.temper57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight57() {
        assertEquals(0.5, new HollowFoundry().temper57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight57() {
        assertEquals(3.0, new HollowFoundry().temper57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio58() {
        assertTrue(new HollowFoundry().temper58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new HollowFoundry().temper58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio58() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowFoundry().temper58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift59() {
        assertEquals("below", new HollowFoundry().flatten59(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift59() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.flatten59(5));
        assertEquals("upper-bound", subject.flatten59(12));
    }

    @Test
    void classifiesWithinAndAboveDrift59() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.flatten59(5 + 1));
        assertEquals("above", subject.flatten59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity60() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten60());
        }
        assertEquals(1, subject.bias60Count());
    }

    @Test
    void refusesOnceExhaustedCapacity60() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 1; i++) {
            subject.flatten60();
        }
        assertFalse(subject.flatten60());
    }

    @Test
    void accumulatesBelowTheCapCapacity61() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.tally61(1));
        assertEquals(3, subject.tally61(2));
    }

    @Test
    void saturatesAtTheCapCapacity61() {
        HollowFoundry subject = new HollowFoundry();
        subject.tally61(41);
        assertEquals(41, subject.tally61(5));
    }

    @Test
    void ignoresNegativeValuesCapacity61() {
        HollowFoundry subject = new HollowFoundry();
        subject.tally61(3);
        assertEquals(3, subject.tally61(-2));
        assertEquals(3, subject.quota61Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity62() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.kindle62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity62() {
        assertEquals(0.5, new HollowFoundry().kindle62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity62() {
        assertEquals(3.0, new HollowFoundry().kindle62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield63() {
        assertTrue(new HollowFoundry().collate63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new HollowFoundry().collate63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield63() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowFoundry().collate63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield64() {
        assertEquals("below", new HollowFoundry().brace64(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield64() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.brace64(2));
        assertEquals("upper-bound", subject.brace64(11));
    }

    @Test
    void classifiesWithinAndAboveYield64() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.brace64(2 + 1));
        assertEquals("above", subject.brace64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth65() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile65());
        }
        assertEquals(2, subject.offset65Count());
    }

    @Test
    void refusesOnceExhaustedDepth65() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 2; i++) {
            subject.reconcile65();
        }
        assertFalse(subject.reconcile65());
    }

    @Test
    void accumulatesBelowTheCapYield66() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.tally66(1));
        assertEquals(3, subject.tally66(2));
    }

    @Test
    void saturatesAtTheCapYield66() {
        HollowFoundry subject = new HollowFoundry();
        subject.tally66(46);
        assertEquals(46, subject.tally66(5));
    }

    @Test
    void ignoresNegativeValuesYield66() {
        HollowFoundry subject = new HollowFoundry();
        subject.tally66(3);
        assertEquals(3, subject.tally66(-2));
        assertEquals(3, subject.span66Value());
    }

    @Test
    void rejectsZeroDenominatorSpan67() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.furl67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan67() {
        assertEquals(0.5, new HollowFoundry().furl67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan67() {
        assertEquals(3.0, new HollowFoundry().furl67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth68() {
        assertTrue(new HollowFoundry().brace68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new HollowFoundry().brace68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth68() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowFoundry().brace68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias69() {
        assertEquals("below", new HollowFoundry().gauge69(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias69() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.gauge69(3));
        assertEquals("upper-bound", subject.gauge69(10));
    }

    @Test
    void classifiesWithinAndAboveBias69() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.gauge69(3 + 1));
        assertEquals("above", subject.gauge69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset70() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten70());
        }
        assertEquals(3, subject.tally70Count());
    }

    @Test
    void refusesOnceExhaustedOffset70() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 3; i++) {
            subject.flatten70();
        }
        assertFalse(subject.flatten70());
    }

    @Test
    void accumulatesBelowTheCapCadence71() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.gauge71(1));
        assertEquals(3, subject.gauge71(2));
    }

    @Test
    void saturatesAtTheCapCadence71() {
        HollowFoundry subject = new HollowFoundry();
        subject.gauge71(51);
        assertEquals(51, subject.gauge71(5));
    }

    @Test
    void ignoresNegativeValuesCadence71() {
        HollowFoundry subject = new HollowFoundry();
        subject.gauge71(3);
        assertEquals(3, subject.gauge71(-2));
        assertEquals(3, subject.weight71Value());
    }

    @Test
    void rejectsZeroDenominatorDepth72() {
        HollowFoundry subject = new HollowFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth72() {
        assertEquals(0.5, new HollowFoundry().collate72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth72() {
        assertEquals(3.0, new HollowFoundry().collate72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally73() {
        assertTrue(new HollowFoundry().kindle73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new HollowFoundry().kindle73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally73() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowFoundry().kindle73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias74() {
        assertEquals("below", new HollowFoundry().kindle74(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias74() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("lower-bound", subject.kindle74(4));
        assertEquals("upper-bound", subject.kindle74(9));
    }

    @Test
    void classifiesWithinAndAboveBias74() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals("within", subject.kindle74(4 + 1));
        assertEquals("above", subject.kindle74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally75() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace75());
        }
        assertEquals(4, subject.yield75Count());
    }

    @Test
    void refusesOnceExhaustedTally75() {
        HollowFoundry subject = new HollowFoundry();
        for (int i = 0; i < 4; i++) {
            subject.brace75();
        }
        assertFalse(subject.brace75());
    }

    @Test
    void accumulatesBelowTheCapWeight76() {
        HollowFoundry subject = new HollowFoundry();
        assertEquals(1, subject.temper76(1));
        assertEquals(3, subject.temper76(2));
    }

    @Test
    void saturatesAtTheCapWeight76() {
        HollowFoundry subject = new HollowFoundry();
        subject.temper76(56);
        assertEquals(56, subject.temper76(5));
    }

    @Test
    void ignoresNegativeValuesWeight76() {
        HollowFoundry subject = new HollowFoundry();
        subject.temper76(3);
        assertEquals(3, subject.temper76(-2));
        assertEquals(3, subject.tally76Value());
    }
}
