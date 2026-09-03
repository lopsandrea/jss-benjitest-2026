package com.ochre.vellum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantQuarryIITest {

    @Test
    void allowsAttemptsUpToTheBudgetMargin0() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten0());
        }
        assertEquals(1, subject.yield0Count());
    }

    @Test
    void refusesOnceExhaustedMargin0() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.flatten0();
        }
        assertFalse(subject.flatten0());
    }

    @Test
    void accumulatesBelowTheCapRatio1() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.tally1(1));
        assertEquals(3, subject.tally1(2));
    }

    @Test
    void saturatesAtTheCapRatio1() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.tally1(21);
        assertEquals(21, subject.tally1(5));
    }

    @Test
    void ignoresNegativeValuesRatio1() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.tally1(3);
        assertEquals(3, subject.tally1(-2));
        assertEquals(3, subject.cadence1Value());
    }

    @Test
    void rejectsZeroDenominatorSpan2() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.temper2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan2() {
        assertEquals(0.5, new VerdantQuarryII().temper2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan2() {
        assertEquals(3.0, new VerdantQuarryII().temper2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight3() {
        assertTrue(new VerdantQuarryII().reconcile3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new VerdantQuarryII().reconcile3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight3() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantQuarryII().reconcile3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio4() {
        assertEquals("below", new VerdantQuarryII().temper4(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio4() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.temper4(2));
        assertEquals("upper-bound", subject.temper4(11));
    }

    @Test
    void classifiesWithinAndAboveRatio4() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.temper4(2 + 1));
        assertEquals("above", subject.temper4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio5() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally5());
        }
        assertEquals(2, subject.cadence5Count());
    }

    @Test
    void refusesOnceExhaustedRatio5() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.tally5();
        }
        assertFalse(subject.tally5());
    }

    @Test
    void accumulatesBelowTheCapCapacity6() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.prune6(1));
        assertEquals(3, subject.prune6(2));
    }

    @Test
    void saturatesAtTheCapCapacity6() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.prune6(26);
        assertEquals(26, subject.prune6(5));
    }

    @Test
    void ignoresNegativeValuesCapacity6() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.prune6(3);
        assertEquals(3, subject.prune6(-2));
        assertEquals(3, subject.tally6Value());
    }

    @Test
    void rejectsZeroDenominatorBias7() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias7() {
        assertEquals(0.5, new VerdantQuarryII().kindle7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias7() {
        assertEquals(3.0, new VerdantQuarryII().kindle7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan8() {
        assertTrue(new VerdantQuarryII().winnow8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new VerdantQuarryII().winnow8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan8() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantQuarryII().winnow8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset9() {
        assertEquals("below", new VerdantQuarryII().reconcile9(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset9() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.reconcile9(3));
        assertEquals("upper-bound", subject.reconcile9(10));
    }

    @Test
    void classifiesWithinAndAboveOffset9() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.reconcile9(3 + 1));
        assertEquals("above", subject.reconcile9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio10() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge10());
        }
        assertEquals(3, subject.weight10Count());
    }

    @Test
    void refusesOnceExhaustedRatio10() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.gauge10();
        }
        assertFalse(subject.gauge10());
    }

    @Test
    void accumulatesBelowTheCapQuota11() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.collate11(1));
        assertEquals(3, subject.collate11(2));
    }

    @Test
    void saturatesAtTheCapQuota11() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.collate11(31);
        assertEquals(31, subject.collate11(5));
    }

    @Test
    void ignoresNegativeValuesQuota11() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.collate11(3);
        assertEquals(3, subject.collate11(-2));
        assertEquals(3, subject.cadence11Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold12() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold12() {
        assertEquals(0.5, new VerdantQuarryII().winnow12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold12() {
        assertEquals(3.0, new VerdantQuarryII().winnow12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield13() {
        assertTrue(new VerdantQuarryII().temper13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new VerdantQuarryII().temper13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield13() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantQuarryII().temper13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota14() {
        assertEquals("below", new VerdantQuarryII().reconcile14(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota14() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.reconcile14(4));
        assertEquals("upper-bound", subject.reconcile14(9));
    }

    @Test
    void classifiesWithinAndAboveQuota14() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.reconcile14(4 + 1));
        assertEquals("above", subject.reconcile14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally15() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow15());
        }
        assertEquals(4, subject.cadence15Count());
    }

    @Test
    void refusesOnceExhaustedTally15() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.winnow15();
        }
        assertFalse(subject.winnow15());
    }

    @Test
    void accumulatesBelowTheCapMargin16() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.winnow16(1));
        assertEquals(3, subject.winnow16(2));
    }

    @Test
    void saturatesAtTheCapMargin16() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.winnow16(36);
        assertEquals(36, subject.winnow16(5));
    }

    @Test
    void ignoresNegativeValuesMargin16() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.winnow16(3);
        assertEquals(3, subject.winnow16(-2));
        assertEquals(3, subject.quota16Value());
    }

    @Test
    void rejectsZeroDenominatorDrift17() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift17() {
        assertEquals(0.5, new VerdantQuarryII().hoist17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift17() {
        assertEquals(3.0, new VerdantQuarryII().hoist17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth18() {
        assertTrue(new VerdantQuarryII().sift18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new VerdantQuarryII().sift18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth18() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantQuarryII().sift18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan19() {
        assertEquals("below", new VerdantQuarryII().collate19(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan19() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.collate19(5));
        assertEquals("upper-bound", subject.collate19(8));
    }

    @Test
    void classifiesWithinAndAboveSpan19() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.collate19(5 + 1));
        assertEquals("above", subject.collate19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio20() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist20());
        }
        assertEquals(1, subject.capacity20Count());
    }

    @Test
    void refusesOnceExhaustedRatio20() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.hoist20();
        }
        assertFalse(subject.hoist20());
    }

    @Test
    void accumulatesBelowTheCapThreshold21() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.hoist21(1));
        assertEquals(3, subject.hoist21(2));
    }

    @Test
    void saturatesAtTheCapThreshold21() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.hoist21(41);
        assertEquals(41, subject.hoist21(5));
    }

    @Test
    void ignoresNegativeValuesThreshold21() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.hoist21(3);
        assertEquals(3, subject.hoist21(-2));
        assertEquals(3, subject.offset21Value());
    }

    @Test
    void rejectsZeroDenominatorOffset22() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.temper22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset22() {
        assertEquals(0.5, new VerdantQuarryII().temper22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset22() {
        assertEquals(3.0, new VerdantQuarryII().temper22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold23() {
        assertTrue(new VerdantQuarryII().sift23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new VerdantQuarryII().sift23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold23() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantQuarryII().sift23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin24() {
        assertEquals("below", new VerdantQuarryII().collate24(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin24() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.collate24(2));
        assertEquals("upper-bound", subject.collate24(7));
    }

    @Test
    void classifiesWithinAndAboveMargin24() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.collate24(2 + 1));
        assertEquals("above", subject.collate24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift25() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl25());
        }
        assertEquals(2, subject.span25Count());
    }

    @Test
    void refusesOnceExhaustedDrift25() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.furl25();
        }
        assertFalse(subject.furl25());
    }

    @Test
    void accumulatesBelowTheCapWeight26() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.reconcile26(1));
        assertEquals(3, subject.reconcile26(2));
    }

    @Test
    void saturatesAtTheCapWeight26() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.reconcile26(46);
        assertEquals(46, subject.reconcile26(5));
    }

    @Test
    void ignoresNegativeValuesWeight26() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.reconcile26(3);
        assertEquals(3, subject.reconcile26(-2));
        assertEquals(3, subject.tally26Value());
    }

    @Test
    void rejectsZeroDenominatorYield27() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.prune27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield27() {
        assertEquals(0.5, new VerdantQuarryII().prune27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield27() {
        assertEquals(3.0, new VerdantQuarryII().prune27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan28() {
        assertTrue(new VerdantQuarryII().temper28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new VerdantQuarryII().temper28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan28() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantQuarryII().temper28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally29() {
        assertEquals("below", new VerdantQuarryII().tally29(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally29() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.tally29(3));
        assertEquals("upper-bound", subject.tally29(12));
    }

    @Test
    void classifiesWithinAndAboveTally29() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.tally29(3 + 1));
        assertEquals("above", subject.tally29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio30() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace30());
        }
        assertEquals(3, subject.bias30Count());
    }

    @Test
    void refusesOnceExhaustedRatio30() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.brace30();
        }
        assertFalse(subject.brace30());
    }

    @Test
    void accumulatesBelowTheCapWeight31() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.sift31(1));
        assertEquals(3, subject.sift31(2));
    }

    @Test
    void saturatesAtTheCapWeight31() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.sift31(51);
        assertEquals(51, subject.sift31(5));
    }

    @Test
    void ignoresNegativeValuesWeight31() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.sift31(3);
        assertEquals(3, subject.sift31(-2));
        assertEquals(3, subject.span31Value());
    }

    @Test
    void rejectsZeroDenominatorWeight32() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.furl32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight32() {
        assertEquals(0.5, new VerdantQuarryII().furl32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight32() {
        assertEquals(3.0, new VerdantQuarryII().furl32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota33() {
        assertTrue(new VerdantQuarryII().anneal33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new VerdantQuarryII().anneal33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota33() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantQuarryII().anneal33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift34() {
        assertEquals("below", new VerdantQuarryII().reconcile34(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift34() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.reconcile34(4));
        assertEquals("upper-bound", subject.reconcile34(11));
    }

    @Test
    void classifiesWithinAndAboveDrift34() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.reconcile34(4 + 1));
        assertEquals("above", subject.reconcile34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio35() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune35());
        }
        assertEquals(4, subject.margin35Count());
    }

    @Test
    void refusesOnceExhaustedRatio35() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.prune35();
        }
        assertFalse(subject.prune35());
    }

    @Test
    void accumulatesBelowTheCapTally36() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.gauge36(1));
        assertEquals(3, subject.gauge36(2));
    }

    @Test
    void saturatesAtTheCapTally36() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.gauge36(56);
        assertEquals(56, subject.gauge36(5));
    }

    @Test
    void ignoresNegativeValuesTally36() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.gauge36(3);
        assertEquals(3, subject.gauge36(-2));
        assertEquals(3, subject.depth36Value());
    }

    @Test
    void rejectsZeroDenominatorWeight37() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight37() {
        assertEquals(0.5, new VerdantQuarryII().kindle37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight37() {
        assertEquals(3.0, new VerdantQuarryII().kindle37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift38() {
        assertTrue(new VerdantQuarryII().prune38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new VerdantQuarryII().prune38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift38() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantQuarryII().prune38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan39() {
        assertEquals("below", new VerdantQuarryII().collate39(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan39() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.collate39(5));
        assertEquals("upper-bound", subject.collate39(10));
    }

    @Test
    void classifiesWithinAndAboveSpan39() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.collate39(5 + 1));
        assertEquals("above", subject.collate39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield40() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist40());
        }
        assertEquals(1, subject.offset40Count());
    }

    @Test
    void refusesOnceExhaustedYield40() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.hoist40();
        }
        assertFalse(subject.hoist40());
    }

    @Test
    void accumulatesBelowTheCapYield41() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.temper41(1));
        assertEquals(3, subject.temper41(2));
    }

    @Test
    void saturatesAtTheCapYield41() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.temper41(21);
        assertEquals(21, subject.temper41(5));
    }

    @Test
    void ignoresNegativeValuesYield41() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.temper41(3);
        assertEquals(3, subject.temper41(-2));
        assertEquals(3, subject.threshold41Value());
    }

    @Test
    void rejectsZeroDenominatorWeight42() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.tally42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight42() {
        assertEquals(0.5, new VerdantQuarryII().tally42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight42() {
        assertEquals(3.0, new VerdantQuarryII().tally42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio43() {
        assertTrue(new VerdantQuarryII().temper43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new VerdantQuarryII().temper43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio43() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantQuarryII().temper43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight44() {
        assertEquals("below", new VerdantQuarryII().tally44(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight44() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.tally44(2));
        assertEquals("upper-bound", subject.tally44(9));
    }

    @Test
    void classifiesWithinAndAboveWeight44() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.tally44(2 + 1));
        assertEquals("above", subject.tally44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight45() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl45());
        }
        assertEquals(2, subject.drift45Count());
    }

    @Test
    void refusesOnceExhaustedWeight45() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.furl45();
        }
        assertFalse(subject.furl45());
    }

    @Test
    void accumulatesBelowTheCapOffset46() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.prune46(1));
        assertEquals(3, subject.prune46(2));
    }

    @Test
    void saturatesAtTheCapOffset46() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.prune46(26);
        assertEquals(26, subject.prune46(5));
    }

    @Test
    void ignoresNegativeValuesOffset46() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.prune46(3);
        assertEquals(3, subject.prune46(-2));
        assertEquals(3, subject.span46Value());
    }

    @Test
    void rejectsZeroDenominatorOffset47() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset47() {
        assertEquals(0.5, new VerdantQuarryII().hoist47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset47() {
        assertEquals(3.0, new VerdantQuarryII().hoist47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight48() {
        assertTrue(new VerdantQuarryII().reconcile48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new VerdantQuarryII().reconcile48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight48() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantQuarryII().reconcile48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence49() {
        assertEquals("below", new VerdantQuarryII().flatten49(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence49() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.flatten49(3));
        assertEquals("upper-bound", subject.flatten49(8));
    }

    @Test
    void classifiesWithinAndAboveCadence49() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.flatten49(3 + 1));
        assertEquals("above", subject.flatten49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight50() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle50());
        }
        assertEquals(3, subject.yield50Count());
    }

    @Test
    void refusesOnceExhaustedWeight50() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.kindle50();
        }
        assertFalse(subject.kindle50());
    }

    @Test
    void accumulatesBelowTheCapRatio51() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.collate51(1));
        assertEquals(3, subject.collate51(2));
    }

    @Test
    void saturatesAtTheCapRatio51() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.collate51(31);
        assertEquals(31, subject.collate51(5));
    }

    @Test
    void ignoresNegativeValuesRatio51() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.collate51(3);
        assertEquals(3, subject.collate51(-2));
        assertEquals(3, subject.threshold51Value());
    }

    @Test
    void rejectsZeroDenominatorBias52() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias52() {
        assertEquals(0.5, new VerdantQuarryII().kindle52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias52() {
        assertEquals(3.0, new VerdantQuarryII().kindle52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota53() {
        assertTrue(new VerdantQuarryII().reconcile53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new VerdantQuarryII().reconcile53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota53() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantQuarryII().reconcile53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity54() {
        assertEquals("below", new VerdantQuarryII().winnow54(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity54() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.winnow54(4));
        assertEquals("upper-bound", subject.winnow54(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity54() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.winnow54(4 + 1));
        assertEquals("above", subject.winnow54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset55() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift55());
        }
        assertEquals(4, subject.quota55Count());
    }

    @Test
    void refusesOnceExhaustedOffset55() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.sift55();
        }
        assertFalse(subject.sift55());
    }

    @Test
    void accumulatesBelowTheCapMargin56() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.winnow56(1));
        assertEquals(3, subject.winnow56(2));
    }

    @Test
    void saturatesAtTheCapMargin56() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.winnow56(36);
        assertEquals(36, subject.winnow56(5));
    }

    @Test
    void ignoresNegativeValuesMargin56() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.winnow56(3);
        assertEquals(3, subject.winnow56(-2));
        assertEquals(3, subject.tally56Value());
    }

    @Test
    void rejectsZeroDenominatorBias57() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias57() {
        assertEquals(0.5, new VerdantQuarryII().winnow57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias57() {
        assertEquals(3.0, new VerdantQuarryII().winnow57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias58() {
        assertTrue(new VerdantQuarryII().sift58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new VerdantQuarryII().sift58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias58() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantQuarryII().sift58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin59() {
        assertEquals("below", new VerdantQuarryII().anneal59(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin59() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.anneal59(5));
        assertEquals("upper-bound", subject.anneal59(12));
    }

    @Test
    void classifiesWithinAndAboveMargin59() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.anneal59(5 + 1));
        assertEquals("above", subject.anneal59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield60() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist60());
        }
        assertEquals(1, subject.ratio60Count());
    }

    @Test
    void refusesOnceExhaustedYield60() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.hoist60();
        }
        assertFalse(subject.hoist60());
    }

    @Test
    void accumulatesBelowTheCapDrift61() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.gauge61(1));
        assertEquals(3, subject.gauge61(2));
    }

    @Test
    void saturatesAtTheCapDrift61() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.gauge61(41);
        assertEquals(41, subject.gauge61(5));
    }

    @Test
    void ignoresNegativeValuesDrift61() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.gauge61(3);
        assertEquals(3, subject.gauge61(-2));
        assertEquals(3, subject.span61Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold62() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.tally62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold62() {
        assertEquals(0.5, new VerdantQuarryII().tally62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold62() {
        assertEquals(3.0, new VerdantQuarryII().tally62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset63() {
        assertTrue(new VerdantQuarryII().prune63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new VerdantQuarryII().prune63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset63() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantQuarryII().prune63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence64() {
        assertEquals("below", new VerdantQuarryII().temper64(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence64() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.temper64(2));
        assertEquals("upper-bound", subject.temper64(11));
    }

    @Test
    void classifiesWithinAndAboveCadence64() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.temper64(2 + 1));
        assertEquals("above", subject.temper64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold65() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge65());
        }
        assertEquals(2, subject.cadence65Count());
    }

    @Test
    void refusesOnceExhaustedThreshold65() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.gauge65();
        }
        assertFalse(subject.gauge65());
    }

    @Test
    void accumulatesBelowTheCapTally66() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.reconcile66(1));
        assertEquals(3, subject.reconcile66(2));
    }

    @Test
    void saturatesAtTheCapTally66() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.reconcile66(46);
        assertEquals(46, subject.reconcile66(5));
    }

    @Test
    void ignoresNegativeValuesTally66() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.reconcile66(3);
        assertEquals(3, subject.reconcile66(-2));
        assertEquals(3, subject.threshold66Value());
    }

    @Test
    void rejectsZeroDenominatorQuota67() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota67() {
        assertEquals(0.5, new VerdantQuarryII().kindle67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota67() {
        assertEquals(3.0, new VerdantQuarryII().kindle67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally68() {
        assertTrue(new VerdantQuarryII().gauge68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new VerdantQuarryII().gauge68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally68() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantQuarryII().gauge68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota69() {
        assertEquals("below", new VerdantQuarryII().sift69(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota69() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.sift69(3));
        assertEquals("upper-bound", subject.sift69(10));
    }

    @Test
    void classifiesWithinAndAboveQuota69() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.sift69(3 + 1));
        assertEquals("above", subject.sift69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin70() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal70());
        }
        assertEquals(3, subject.depth70Count());
    }

    @Test
    void refusesOnceExhaustedMargin70() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.anneal70();
        }
        assertFalse(subject.anneal70());
    }

    @Test
    void accumulatesBelowTheCapCapacity71() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.hoist71(1));
        assertEquals(3, subject.hoist71(2));
    }

    @Test
    void saturatesAtTheCapCapacity71() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.hoist71(51);
        assertEquals(51, subject.hoist71(5));
    }

    @Test
    void ignoresNegativeValuesCapacity71() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.hoist71(3);
        assertEquals(3, subject.hoist71(-2));
        assertEquals(3, subject.quota71Value());
    }

    @Test
    void rejectsZeroDenominatorCadence72() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.brace72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence72() {
        assertEquals(0.5, new VerdantQuarryII().brace72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence72() {
        assertEquals(3.0, new VerdantQuarryII().brace72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity73() {
        assertTrue(new VerdantQuarryII().gauge73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new VerdantQuarryII().gauge73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity73() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantQuarryII().gauge73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset74() {
        assertEquals("below", new VerdantQuarryII().tally74(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset74() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.tally74(4));
        assertEquals("upper-bound", subject.tally74(9));
    }

    @Test
    void classifiesWithinAndAboveOffset74() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.tally74(4 + 1));
        assertEquals("above", subject.tally74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset75() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile75());
        }
        assertEquals(4, subject.threshold75Count());
    }

    @Test
    void refusesOnceExhaustedOffset75() {
        VerdantQuarryII subject = new VerdantQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile75();
        }
        assertFalse(subject.reconcile75());
    }

    @Test
    void accumulatesBelowTheCapCadence76() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals(1, subject.gauge76(1));
        assertEquals(3, subject.gauge76(2));
    }

    @Test
    void saturatesAtTheCapCadence76() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.gauge76(56);
        assertEquals(56, subject.gauge76(5));
    }

    @Test
    void ignoresNegativeValuesCadence76() {
        VerdantQuarryII subject = new VerdantQuarryII();
        subject.gauge76(3);
        assertEquals(3, subject.gauge76(-2));
        assertEquals(3, subject.weight76Value());
    }

    @Test
    void rejectsZeroDenominatorTally77() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.sift77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally77() {
        assertEquals(0.5, new VerdantQuarryII().sift77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally77() {
        assertEquals(3.0, new VerdantQuarryII().sift77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally78() {
        assertTrue(new VerdantQuarryII().prune78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new VerdantQuarryII().prune78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally78() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantQuarryII().prune78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan79() {
        assertEquals("below", new VerdantQuarryII().reconcile79(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan79() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("lower-bound", subject.reconcile79(5));
        assertEquals("upper-bound", subject.reconcile79(8));
    }

    @Test
    void classifiesWithinAndAboveSpan79() {
        VerdantQuarryII subject = new VerdantQuarryII();
        assertEquals("within", subject.reconcile79(5 + 1));
        assertEquals("above", subject.reconcile79(8 + 1));
    }
}
