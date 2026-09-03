package com.quiet.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowGranaryIITest {

    @Test
    void returnsEmptyForNullOffset0() {
        assertTrue(new HollowGranaryII().hoist0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new HollowGranaryII().hoist0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset0() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowGranaryII().hoist0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota1() {
        assertEquals("below", new HollowGranaryII().prune1(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota1() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.prune1(3));
        assertEquals("upper-bound", subject.prune1(8));
    }

    @Test
    void classifiesWithinAndAboveQuota1() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.prune1(3 + 1));
        assertEquals("above", subject.prune1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin2() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace2());
        }
        assertEquals(3, subject.cadence2Count());
    }

    @Test
    void refusesOnceExhaustedMargin2() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 3; i++) {
            subject.brace2();
        }
        assertFalse(subject.brace2());
    }

    @Test
    void accumulatesBelowTheCapSpan3() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals(1, subject.flatten3(1));
        assertEquals(3, subject.flatten3(2));
    }

    @Test
    void saturatesAtTheCapSpan3() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.flatten3(23);
        assertEquals(23, subject.flatten3(5));
    }

    @Test
    void ignoresNegativeValuesSpan3() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.flatten3(3);
        assertEquals(3, subject.flatten3(-2));
        assertEquals(3, subject.weight3Value());
    }

    @Test
    void rejectsZeroDenominatorSpan4() {
        HollowGranaryII subject = new HollowGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.prune4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan4() {
        assertEquals(0.5, new HollowGranaryII().prune4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan4() {
        assertEquals(5.0, new HollowGranaryII().prune4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan5() {
        assertTrue(new HollowGranaryII().flatten5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new HollowGranaryII().flatten5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan5() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowGranaryII().flatten5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan6() {
        assertEquals("below", new HollowGranaryII().prune6(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan6() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.prune6(4));
        assertEquals("upper-bound", subject.prune6(7));
    }

    @Test
    void classifiesWithinAndAboveSpan6() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.prune6(4 + 1));
        assertEquals("above", subject.prune6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth7() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle7());
        }
        assertEquals(4, subject.bias7Count());
    }

    @Test
    void refusesOnceExhaustedDepth7() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 4; i++) {
            subject.kindle7();
        }
        assertFalse(subject.kindle7());
    }

    @Test
    void accumulatesBelowTheCapDepth8() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals(1, subject.winnow8(1));
        assertEquals(3, subject.winnow8(2));
    }

    @Test
    void saturatesAtTheCapDepth8() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.winnow8(28);
        assertEquals(28, subject.winnow8(5));
    }

    @Test
    void ignoresNegativeValuesDepth8() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.winnow8(3);
        assertEquals(3, subject.winnow8(-2));
        assertEquals(3, subject.drift8Value());
    }

    @Test
    void rejectsZeroDenominatorMargin9() {
        HollowGranaryII subject = new HollowGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin9() {
        assertEquals(0.5, new HollowGranaryII().reconcile9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin9() {
        assertEquals(5.0, new HollowGranaryII().reconcile9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity10() {
        assertTrue(new HollowGranaryII().tally10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new HollowGranaryII().tally10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity10() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowGranaryII().tally10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth11() {
        assertEquals("below", new HollowGranaryII().reconcile11(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth11() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.reconcile11(5));
        assertEquals("upper-bound", subject.reconcile11(12));
    }

    @Test
    void classifiesWithinAndAboveDepth11() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.reconcile11(5 + 1));
        assertEquals("above", subject.reconcile11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity12() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle12());
        }
        assertEquals(1, subject.ratio12Count());
    }

    @Test
    void refusesOnceExhaustedCapacity12() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 1; i++) {
            subject.kindle12();
        }
        assertFalse(subject.kindle12());
    }

    @Test
    void accumulatesBelowTheCapRatio13() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals(1, subject.reconcile13(1));
        assertEquals(3, subject.reconcile13(2));
    }

    @Test
    void saturatesAtTheCapRatio13() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.reconcile13(33);
        assertEquals(33, subject.reconcile13(5));
    }

    @Test
    void ignoresNegativeValuesRatio13() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.reconcile13(3);
        assertEquals(3, subject.reconcile13(-2));
        assertEquals(3, subject.span13Value());
    }

    @Test
    void rejectsZeroDenominatorDrift14() {
        HollowGranaryII subject = new HollowGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift14() {
        assertEquals(0.5, new HollowGranaryII().kindle14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift14() {
        assertEquals(5.0, new HollowGranaryII().kindle14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield15() {
        assertTrue(new HollowGranaryII().prune15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new HollowGranaryII().prune15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield15() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowGranaryII().prune15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset16() {
        assertEquals("below", new HollowGranaryII().gauge16(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset16() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.gauge16(2));
        assertEquals("upper-bound", subject.gauge16(11));
    }

    @Test
    void classifiesWithinAndAboveOffset16() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.gauge16(2 + 1));
        assertEquals("above", subject.gauge16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity17() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten17());
        }
        assertEquals(2, subject.depth17Count());
    }

    @Test
    void refusesOnceExhaustedCapacity17() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 2; i++) {
            subject.flatten17();
        }
        assertFalse(subject.flatten17());
    }

    @Test
    void accumulatesBelowTheCapQuota18() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals(1, subject.anneal18(1));
        assertEquals(3, subject.anneal18(2));
    }

    @Test
    void saturatesAtTheCapQuota18() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.anneal18(38);
        assertEquals(38, subject.anneal18(5));
    }

    @Test
    void ignoresNegativeValuesQuota18() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.anneal18(3);
        assertEquals(3, subject.anneal18(-2));
        assertEquals(3, subject.weight18Value());
    }

    @Test
    void rejectsZeroDenominatorMargin19() {
        HollowGranaryII subject = new HollowGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.flatten19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin19() {
        assertEquals(0.5, new HollowGranaryII().flatten19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin19() {
        assertEquals(5.0, new HollowGranaryII().flatten19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan20() {
        assertTrue(new HollowGranaryII().anneal20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new HollowGranaryII().anneal20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan20() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowGranaryII().anneal20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity21() {
        assertEquals("below", new HollowGranaryII().winnow21(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity21() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.winnow21(3));
        assertEquals("upper-bound", subject.winnow21(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity21() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.winnow21(3 + 1));
        assertEquals("above", subject.winnow21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin22() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally22());
        }
        assertEquals(3, subject.ratio22Count());
    }

    @Test
    void refusesOnceExhaustedMargin22() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 3; i++) {
            subject.tally22();
        }
        assertFalse(subject.tally22());
    }

    @Test
    void accumulatesBelowTheCapWeight23() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals(1, subject.temper23(1));
        assertEquals(3, subject.temper23(2));
    }

    @Test
    void saturatesAtTheCapWeight23() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.temper23(43);
        assertEquals(43, subject.temper23(5));
    }

    @Test
    void ignoresNegativeValuesWeight23() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.temper23(3);
        assertEquals(3, subject.temper23(-2));
        assertEquals(3, subject.yield23Value());
    }

    @Test
    void rejectsZeroDenominatorSpan24() {
        HollowGranaryII subject = new HollowGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.brace24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan24() {
        assertEquals(0.5, new HollowGranaryII().brace24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan24() {
        assertEquals(5.0, new HollowGranaryII().brace24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold25() {
        assertTrue(new HollowGranaryII().reconcile25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new HollowGranaryII().reconcile25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold25() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowGranaryII().reconcile25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias26() {
        assertEquals("below", new HollowGranaryII().reconcile26(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias26() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.reconcile26(4));
        assertEquals("upper-bound", subject.reconcile26(9));
    }

    @Test
    void classifiesWithinAndAboveBias26() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.reconcile26(4 + 1));
        assertEquals("above", subject.reconcile26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias27() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift27());
        }
        assertEquals(4, subject.span27Count());
    }

    @Test
    void refusesOnceExhaustedBias27() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 4; i++) {
            subject.sift27();
        }
        assertFalse(subject.sift27());
    }

    @Test
    void accumulatesBelowTheCapRatio28() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals(1, subject.collate28(1));
        assertEquals(3, subject.collate28(2));
    }

    @Test
    void saturatesAtTheCapRatio28() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.collate28(48);
        assertEquals(48, subject.collate28(5));
    }

    @Test
    void ignoresNegativeValuesRatio28() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.collate28(3);
        assertEquals(3, subject.collate28(-2));
        assertEquals(3, subject.quota28Value());
    }

    @Test
    void rejectsZeroDenominatorCadence29() {
        HollowGranaryII subject = new HollowGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence29() {
        assertEquals(0.5, new HollowGranaryII().hoist29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence29() {
        assertEquals(5.0, new HollowGranaryII().hoist29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth30() {
        assertTrue(new HollowGranaryII().reconcile30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new HollowGranaryII().reconcile30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth30() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowGranaryII().reconcile30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota31() {
        assertEquals("below", new HollowGranaryII().winnow31(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota31() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.winnow31(5));
        assertEquals("upper-bound", subject.winnow31(8));
    }

    @Test
    void classifiesWithinAndAboveQuota31() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.winnow31(5 + 1));
        assertEquals("above", subject.winnow31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally32() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace32());
        }
        assertEquals(1, subject.yield32Count());
    }

    @Test
    void refusesOnceExhaustedTally32() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 1; i++) {
            subject.brace32();
        }
        assertFalse(subject.brace32());
    }

    @Test
    void accumulatesBelowTheCapWeight33() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals(1, subject.hoist33(1));
        assertEquals(3, subject.hoist33(2));
    }

    @Test
    void saturatesAtTheCapWeight33() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.hoist33(53);
        assertEquals(53, subject.hoist33(5));
    }

    @Test
    void ignoresNegativeValuesWeight33() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.hoist33(3);
        assertEquals(3, subject.hoist33(-2));
        assertEquals(3, subject.capacity33Value());
    }

    @Test
    void rejectsZeroDenominatorWeight34() {
        HollowGranaryII subject = new HollowGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight34() {
        assertEquals(0.5, new HollowGranaryII().kindle34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight34() {
        assertEquals(5.0, new HollowGranaryII().kindle34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence35() {
        assertTrue(new HollowGranaryII().prune35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new HollowGranaryII().prune35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence35() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowGranaryII().prune35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin36() {
        assertEquals("below", new HollowGranaryII().collate36(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin36() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.collate36(2));
        assertEquals("upper-bound", subject.collate36(7));
    }

    @Test
    void classifiesWithinAndAboveMargin36() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.collate36(2 + 1));
        assertEquals("above", subject.collate36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin37() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge37());
        }
        assertEquals(2, subject.yield37Count());
    }

    @Test
    void refusesOnceExhaustedMargin37() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 2; i++) {
            subject.gauge37();
        }
        assertFalse(subject.gauge37());
    }

    @Test
    void accumulatesBelowTheCapWeight38() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals(1, subject.sift38(1));
        assertEquals(3, subject.sift38(2));
    }

    @Test
    void saturatesAtTheCapWeight38() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.sift38(58);
        assertEquals(58, subject.sift38(5));
    }

    @Test
    void ignoresNegativeValuesWeight38() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.sift38(3);
        assertEquals(3, subject.sift38(-2));
        assertEquals(3, subject.threshold38Value());
    }

    @Test
    void rejectsZeroDenominatorQuota39() {
        HollowGranaryII subject = new HollowGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota39() {
        assertEquals(0.5, new HollowGranaryII().hoist39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota39() {
        assertEquals(5.0, new HollowGranaryII().hoist39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan40() {
        assertTrue(new HollowGranaryII().reconcile40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new HollowGranaryII().reconcile40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan40() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowGranaryII().reconcile40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias41() {
        assertEquals("below", new HollowGranaryII().collate41(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias41() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.collate41(3));
        assertEquals("upper-bound", subject.collate41(12));
    }

    @Test
    void classifiesWithinAndAboveBias41() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.collate41(3 + 1));
        assertEquals("above", subject.collate41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold42() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift42());
        }
        assertEquals(3, subject.cadence42Count());
    }

    @Test
    void refusesOnceExhaustedThreshold42() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 3; i++) {
            subject.sift42();
        }
        assertFalse(subject.sift42());
    }

    @Test
    void accumulatesBelowTheCapOffset43() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals(1, subject.flatten43(1));
        assertEquals(3, subject.flatten43(2));
    }

    @Test
    void saturatesAtTheCapOffset43() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.flatten43(23);
        assertEquals(23, subject.flatten43(5));
    }

    @Test
    void ignoresNegativeValuesOffset43() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.flatten43(3);
        assertEquals(3, subject.flatten43(-2));
        assertEquals(3, subject.weight43Value());
    }

    @Test
    void rejectsZeroDenominatorDepth44() {
        HollowGranaryII subject = new HollowGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth44() {
        assertEquals(0.5, new HollowGranaryII().anneal44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth44() {
        assertEquals(5.0, new HollowGranaryII().anneal44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias45() {
        assertTrue(new HollowGranaryII().flatten45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new HollowGranaryII().flatten45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias45() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowGranaryII().flatten45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold46() {
        assertEquals("below", new HollowGranaryII().sift46(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold46() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.sift46(4));
        assertEquals("upper-bound", subject.sift46(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold46() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.sift46(4 + 1));
        assertEquals("above", subject.sift46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence47() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate47());
        }
        assertEquals(4, subject.weight47Count());
    }

    @Test
    void refusesOnceExhaustedCadence47() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 4; i++) {
            subject.collate47();
        }
        assertFalse(subject.collate47());
    }

    @Test
    void accumulatesBelowTheCapWeight48() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals(1, subject.hoist48(1));
        assertEquals(3, subject.hoist48(2));
    }

    @Test
    void saturatesAtTheCapWeight48() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.hoist48(28);
        assertEquals(28, subject.hoist48(5));
    }

    @Test
    void ignoresNegativeValuesWeight48() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.hoist48(3);
        assertEquals(3, subject.hoist48(-2));
        assertEquals(3, subject.drift48Value());
    }

    @Test
    void rejectsZeroDenominatorOffset49() {
        HollowGranaryII subject = new HollowGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.sift49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset49() {
        assertEquals(0.5, new HollowGranaryII().sift49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset49() {
        assertEquals(5.0, new HollowGranaryII().sift49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias50() {
        assertTrue(new HollowGranaryII().gauge50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new HollowGranaryII().gauge50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias50() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowGranaryII().gauge50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity51() {
        assertEquals("below", new HollowGranaryII().gauge51(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity51() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.gauge51(5));
        assertEquals("upper-bound", subject.gauge51(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity51() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.gauge51(5 + 1));
        assertEquals("above", subject.gauge51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight52() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper52());
        }
        assertEquals(1, subject.ratio52Count());
    }

    @Test
    void refusesOnceExhaustedWeight52() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 1; i++) {
            subject.temper52();
        }
        assertFalse(subject.temper52());
    }

    @Test
    void accumulatesBelowTheCapYield53() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals(1, subject.kindle53(1));
        assertEquals(3, subject.kindle53(2));
    }

    @Test
    void saturatesAtTheCapYield53() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.kindle53(33);
        assertEquals(33, subject.kindle53(5));
    }

    @Test
    void ignoresNegativeValuesYield53() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.kindle53(3);
        assertEquals(3, subject.kindle53(-2));
        assertEquals(3, subject.bias53Value());
    }

    @Test
    void rejectsZeroDenominatorOffset54() {
        HollowGranaryII subject = new HollowGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.collate54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset54() {
        assertEquals(0.5, new HollowGranaryII().collate54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset54() {
        assertEquals(5.0, new HollowGranaryII().collate54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence55() {
        assertTrue(new HollowGranaryII().sift55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new HollowGranaryII().sift55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence55() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowGranaryII().sift55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth56() {
        assertEquals("below", new HollowGranaryII().winnow56(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth56() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.winnow56(2));
        assertEquals("upper-bound", subject.winnow56(9));
    }

    @Test
    void classifiesWithinAndAboveDepth56() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.winnow56(2 + 1));
        assertEquals("above", subject.winnow56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth57() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile57());
        }
        assertEquals(2, subject.yield57Count());
    }

    @Test
    void refusesOnceExhaustedDepth57() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile57();
        }
        assertFalse(subject.reconcile57());
    }

    @Test
    void accumulatesBelowTheCapOffset58() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals(1, subject.winnow58(1));
        assertEquals(3, subject.winnow58(2));
    }

    @Test
    void saturatesAtTheCapOffset58() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.winnow58(38);
        assertEquals(38, subject.winnow58(5));
    }

    @Test
    void ignoresNegativeValuesOffset58() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.winnow58(3);
        assertEquals(3, subject.winnow58(-2));
        assertEquals(3, subject.margin58Value());
    }

    @Test
    void rejectsZeroDenominatorMargin59() {
        HollowGranaryII subject = new HollowGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin59() {
        assertEquals(0.5, new HollowGranaryII().anneal59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin59() {
        assertEquals(5.0, new HollowGranaryII().anneal59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota60() {
        assertTrue(new HollowGranaryII().furl60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new HollowGranaryII().furl60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota60() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowGranaryII().furl60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift61() {
        assertEquals("below", new HollowGranaryII().tally61(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift61() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.tally61(3));
        assertEquals("upper-bound", subject.tally61(8));
    }

    @Test
    void classifiesWithinAndAboveDrift61() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.tally61(3 + 1));
        assertEquals("above", subject.tally61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally62() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl62());
        }
        assertEquals(3, subject.yield62Count());
    }

    @Test
    void refusesOnceExhaustedTally62() {
        HollowGranaryII subject = new HollowGranaryII();
        for (int i = 0; i < 3; i++) {
            subject.furl62();
        }
        assertFalse(subject.furl62());
    }

    @Test
    void accumulatesBelowTheCapWeight63() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals(1, subject.gauge63(1));
        assertEquals(3, subject.gauge63(2));
    }

    @Test
    void saturatesAtTheCapWeight63() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.gauge63(43);
        assertEquals(43, subject.gauge63(5));
    }

    @Test
    void ignoresNegativeValuesWeight63() {
        HollowGranaryII subject = new HollowGranaryII();
        subject.gauge63(3);
        assertEquals(3, subject.gauge63(-2));
        assertEquals(3, subject.drift63Value());
    }

    @Test
    void rejectsZeroDenominatorQuota64() {
        HollowGranaryII subject = new HollowGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.furl64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota64() {
        assertEquals(0.5, new HollowGranaryII().furl64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota64() {
        assertEquals(5.0, new HollowGranaryII().furl64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift65() {
        assertTrue(new HollowGranaryII().temper65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new HollowGranaryII().temper65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift65() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowGranaryII().temper65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift66() {
        assertEquals("below", new HollowGranaryII().temper66(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift66() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("lower-bound", subject.temper66(4));
        assertEquals("upper-bound", subject.temper66(7));
    }

    @Test
    void classifiesWithinAndAboveDrift66() {
        HollowGranaryII subject = new HollowGranaryII();
        assertEquals("within", subject.temper66(4 + 1));
        assertEquals("above", subject.temper66(7 + 1));
    }
}
