package com.quiet.granary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietVellumTest {

    @Test
    void rejectsZeroDenominatorDrift0() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift0() {
        assertEquals(0.5, new QuietVellum().sift0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift0() {
        assertEquals(1.0, new QuietVellum().sift0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield1() {
        assertTrue(new QuietVellum().collate1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new QuietVellum().collate1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield1() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietVellum().collate1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold2() {
        assertEquals("below", new QuietVellum().sift2(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold2() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.sift2(4));
        assertEquals("upper-bound", subject.sift2(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold2() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.sift2(4 + 1));
        assertEquals("above", subject.sift2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset3() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle3());
        }
        assertEquals(4, subject.tally3Count());
    }

    @Test
    void refusesOnceExhaustedOffset3() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            subject.kindle3();
        }
        assertFalse(subject.kindle3());
    }

    @Test
    void accumulatesBelowTheCapDrift4() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.winnow4(1));
        assertEquals(3, subject.winnow4(2));
    }

    @Test
    void saturatesAtTheCapDrift4() {
        QuietVellum subject = new QuietVellum();
        subject.winnow4(24);
        assertEquals(24, subject.winnow4(5));
    }

    @Test
    void ignoresNegativeValuesDrift4() {
        QuietVellum subject = new QuietVellum();
        subject.winnow4(3);
        assertEquals(3, subject.winnow4(-2));
        assertEquals(3, subject.margin4Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold5() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.temper5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold5() {
        assertEquals(0.5, new QuietVellum().temper5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold5() {
        assertEquals(1.0, new QuietVellum().temper5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence6() {
        assertTrue(new QuietVellum().winnow6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new QuietVellum().winnow6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence6() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietVellum().winnow6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth7() {
        assertEquals("below", new QuietVellum().collate7(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth7() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.collate7(5));
        assertEquals("upper-bound", subject.collate7(8));
    }

    @Test
    void classifiesWithinAndAboveDepth7() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.collate7(5 + 1));
        assertEquals("above", subject.collate7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin8() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten8());
        }
        assertEquals(1, subject.drift8Count());
    }

    @Test
    void refusesOnceExhaustedMargin8() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            subject.flatten8();
        }
        assertFalse(subject.flatten8());
    }

    @Test
    void accumulatesBelowTheCapQuota9() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.reconcile9(1));
        assertEquals(3, subject.reconcile9(2));
    }

    @Test
    void saturatesAtTheCapQuota9() {
        QuietVellum subject = new QuietVellum();
        subject.reconcile9(29);
        assertEquals(29, subject.reconcile9(5));
    }

    @Test
    void ignoresNegativeValuesQuota9() {
        QuietVellum subject = new QuietVellum();
        subject.reconcile9(3);
        assertEquals(3, subject.reconcile9(-2));
        assertEquals(3, subject.margin9Value());
    }

    @Test
    void rejectsZeroDenominatorOffset10() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.temper10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset10() {
        assertEquals(0.5, new QuietVellum().temper10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset10() {
        assertEquals(1.0, new QuietVellum().temper10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin11() {
        assertTrue(new QuietVellum().furl11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new QuietVellum().furl11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin11() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietVellum().furl11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift12() {
        assertEquals("below", new QuietVellum().brace12(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift12() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.brace12(2));
        assertEquals("upper-bound", subject.brace12(7));
    }

    @Test
    void classifiesWithinAndAboveDrift12() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.brace12(2 + 1));
        assertEquals("above", subject.brace12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset13() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle13());
        }
        assertEquals(2, subject.drift13Count());
    }

    @Test
    void refusesOnceExhaustedOffset13() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            subject.kindle13();
        }
        assertFalse(subject.kindle13());
    }

    @Test
    void accumulatesBelowTheCapThreshold14() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.brace14(1));
        assertEquals(3, subject.brace14(2));
    }

    @Test
    void saturatesAtTheCapThreshold14() {
        QuietVellum subject = new QuietVellum();
        subject.brace14(34);
        assertEquals(34, subject.brace14(5));
    }

    @Test
    void ignoresNegativeValuesThreshold14() {
        QuietVellum subject = new QuietVellum();
        subject.brace14(3);
        assertEquals(3, subject.brace14(-2));
        assertEquals(3, subject.bias14Value());
    }

    @Test
    void rejectsZeroDenominatorMargin15() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin15() {
        assertEquals(0.5, new QuietVellum().sift15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin15() {
        assertEquals(1.0, new QuietVellum().sift15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold16() {
        assertTrue(new QuietVellum().temper16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new QuietVellum().temper16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold16() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietVellum().temper16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin17() {
        assertEquals("below", new QuietVellum().anneal17(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin17() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.anneal17(3));
        assertEquals("upper-bound", subject.anneal17(12));
    }

    @Test
    void classifiesWithinAndAboveMargin17() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.anneal17(3 + 1));
        assertEquals("above", subject.anneal17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight18() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten18());
        }
        assertEquals(3, subject.depth18Count());
    }

    @Test
    void refusesOnceExhaustedWeight18() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            subject.flatten18();
        }
        assertFalse(subject.flatten18());
    }

    @Test
    void accumulatesBelowTheCapDepth19() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.flatten19(1));
        assertEquals(3, subject.flatten19(2));
    }

    @Test
    void saturatesAtTheCapDepth19() {
        QuietVellum subject = new QuietVellum();
        subject.flatten19(39);
        assertEquals(39, subject.flatten19(5));
    }

    @Test
    void ignoresNegativeValuesDepth19() {
        QuietVellum subject = new QuietVellum();
        subject.flatten19(3);
        assertEquals(3, subject.flatten19(-2));
        assertEquals(3, subject.tally19Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity20() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.flatten20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity20() {
        assertEquals(0.5, new QuietVellum().flatten20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity20() {
        assertEquals(1.0, new QuietVellum().flatten20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield21() {
        assertTrue(new QuietVellum().collate21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new QuietVellum().collate21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield21() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietVellum().collate21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota22() {
        assertEquals("below", new QuietVellum().tally22(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota22() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.tally22(4));
        assertEquals("upper-bound", subject.tally22(11));
    }

    @Test
    void classifiesWithinAndAboveQuota22() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.tally22(4 + 1));
        assertEquals("above", subject.tally22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias23() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle23());
        }
        assertEquals(4, subject.weight23Count());
    }

    @Test
    void refusesOnceExhaustedBias23() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            subject.kindle23();
        }
        assertFalse(subject.kindle23());
    }

    @Test
    void accumulatesBelowTheCapOffset24() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.tally24(1));
        assertEquals(3, subject.tally24(2));
    }

    @Test
    void saturatesAtTheCapOffset24() {
        QuietVellum subject = new QuietVellum();
        subject.tally24(44);
        assertEquals(44, subject.tally24(5));
    }

    @Test
    void ignoresNegativeValuesOffset24() {
        QuietVellum subject = new QuietVellum();
        subject.tally24(3);
        assertEquals(3, subject.tally24(-2));
        assertEquals(3, subject.weight24Value());
    }

    @Test
    void rejectsZeroDenominatorCadence25() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.furl25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence25() {
        assertEquals(0.5, new QuietVellum().furl25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence25() {
        assertEquals(1.0, new QuietVellum().furl25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally26() {
        assertTrue(new QuietVellum().prune26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new QuietVellum().prune26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally26() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietVellum().prune26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence27() {
        assertEquals("below", new QuietVellum().tally27(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence27() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.tally27(5));
        assertEquals("upper-bound", subject.tally27(10));
    }

    @Test
    void classifiesWithinAndAboveCadence27() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.tally27(5 + 1));
        assertEquals("above", subject.tally27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan28() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper28());
        }
        assertEquals(1, subject.tally28Count());
    }

    @Test
    void refusesOnceExhaustedSpan28() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            subject.temper28();
        }
        assertFalse(subject.temper28());
    }

    @Test
    void accumulatesBelowTheCapCadence29() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.tally29(1));
        assertEquals(3, subject.tally29(2));
    }

    @Test
    void saturatesAtTheCapCadence29() {
        QuietVellum subject = new QuietVellum();
        subject.tally29(49);
        assertEquals(49, subject.tally29(5));
    }

    @Test
    void ignoresNegativeValuesCadence29() {
        QuietVellum subject = new QuietVellum();
        subject.tally29(3);
        assertEquals(3, subject.tally29(-2));
        assertEquals(3, subject.offset29Value());
    }

    @Test
    void rejectsZeroDenominatorRatio30() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.tally30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio30() {
        assertEquals(0.5, new QuietVellum().tally30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio30() {
        assertEquals(1.0, new QuietVellum().tally30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota31() {
        assertTrue(new QuietVellum().tally31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new QuietVellum().tally31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota31() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietVellum().tally31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth32() {
        assertEquals("below", new QuietVellum().prune32(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth32() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.prune32(2));
        assertEquals("upper-bound", subject.prune32(9));
    }

    @Test
    void classifiesWithinAndAboveDepth32() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.prune32(2 + 1));
        assertEquals("above", subject.prune32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold33() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl33());
        }
        assertEquals(2, subject.quota33Count());
    }

    @Test
    void refusesOnceExhaustedThreshold33() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            subject.furl33();
        }
        assertFalse(subject.furl33());
    }

    @Test
    void accumulatesBelowTheCapMargin34() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.flatten34(1));
        assertEquals(3, subject.flatten34(2));
    }

    @Test
    void saturatesAtTheCapMargin34() {
        QuietVellum subject = new QuietVellum();
        subject.flatten34(54);
        assertEquals(54, subject.flatten34(5));
    }

    @Test
    void ignoresNegativeValuesMargin34() {
        QuietVellum subject = new QuietVellum();
        subject.flatten34(3);
        assertEquals(3, subject.flatten34(-2));
        assertEquals(3, subject.yield34Value());
    }

    @Test
    void rejectsZeroDenominatorWeight35() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.anneal35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight35() {
        assertEquals(0.5, new QuietVellum().anneal35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight35() {
        assertEquals(1.0, new QuietVellum().anneal35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias36() {
        assertTrue(new QuietVellum().tally36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new QuietVellum().tally36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias36() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietVellum().tally36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally37() {
        assertEquals("below", new QuietVellum().collate37(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally37() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.collate37(3));
        assertEquals("upper-bound", subject.collate37(8));
    }

    @Test
    void classifiesWithinAndAboveTally37() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.collate37(3 + 1));
        assertEquals("above", subject.collate37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally38() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal38());
        }
        assertEquals(3, subject.margin38Count());
    }

    @Test
    void refusesOnceExhaustedTally38() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            subject.anneal38();
        }
        assertFalse(subject.anneal38());
    }

    @Test
    void accumulatesBelowTheCapCapacity39() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.kindle39(1));
        assertEquals(3, subject.kindle39(2));
    }

    @Test
    void saturatesAtTheCapCapacity39() {
        QuietVellum subject = new QuietVellum();
        subject.kindle39(59);
        assertEquals(59, subject.kindle39(5));
    }

    @Test
    void ignoresNegativeValuesCapacity39() {
        QuietVellum subject = new QuietVellum();
        subject.kindle39(3);
        assertEquals(3, subject.kindle39(-2));
        assertEquals(3, subject.ratio39Value());
    }

    @Test
    void rejectsZeroDenominatorDrift40() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.kindle40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift40() {
        assertEquals(0.5, new QuietVellum().kindle40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift40() {
        assertEquals(1.0, new QuietVellum().kindle40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence41() {
        assertTrue(new QuietVellum().collate41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new QuietVellum().collate41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence41() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietVellum().collate41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias42() {
        assertEquals("below", new QuietVellum().furl42(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias42() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.furl42(4));
        assertEquals("upper-bound", subject.furl42(7));
    }

    @Test
    void classifiesWithinAndAboveBias42() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.furl42(4 + 1));
        assertEquals("above", subject.furl42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset43() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile43());
        }
        assertEquals(4, subject.bias43Count());
    }

    @Test
    void refusesOnceExhaustedOffset43() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            subject.reconcile43();
        }
        assertFalse(subject.reconcile43());
    }

    @Test
    void accumulatesBelowTheCapWeight44() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.winnow44(1));
        assertEquals(3, subject.winnow44(2));
    }

    @Test
    void saturatesAtTheCapWeight44() {
        QuietVellum subject = new QuietVellum();
        subject.winnow44(24);
        assertEquals(24, subject.winnow44(5));
    }

    @Test
    void ignoresNegativeValuesWeight44() {
        QuietVellum subject = new QuietVellum();
        subject.winnow44(3);
        assertEquals(3, subject.winnow44(-2));
        assertEquals(3, subject.offset44Value());
    }

    @Test
    void rejectsZeroDenominatorDrift45() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.hoist45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift45() {
        assertEquals(0.5, new QuietVellum().hoist45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift45() {
        assertEquals(1.0, new QuietVellum().hoist45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin46() {
        assertTrue(new QuietVellum().brace46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new QuietVellum().brace46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin46() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietVellum().brace46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence47() {
        assertEquals("below", new QuietVellum().temper47(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence47() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.temper47(5));
        assertEquals("upper-bound", subject.temper47(12));
    }

    @Test
    void classifiesWithinAndAboveCadence47() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.temper47(5 + 1));
        assertEquals("above", subject.temper47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan48() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace48());
        }
        assertEquals(1, subject.cadence48Count());
    }

    @Test
    void refusesOnceExhaustedSpan48() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            subject.brace48();
        }
        assertFalse(subject.brace48());
    }

    @Test
    void accumulatesBelowTheCapDepth49() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.winnow49(1));
        assertEquals(3, subject.winnow49(2));
    }

    @Test
    void saturatesAtTheCapDepth49() {
        QuietVellum subject = new QuietVellum();
        subject.winnow49(29);
        assertEquals(29, subject.winnow49(5));
    }

    @Test
    void ignoresNegativeValuesDepth49() {
        QuietVellum subject = new QuietVellum();
        subject.winnow49(3);
        assertEquals(3, subject.winnow49(-2));
        assertEquals(3, subject.cadence49Value());
    }

    @Test
    void rejectsZeroDenominatorRatio50() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.gauge50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio50() {
        assertEquals(0.5, new QuietVellum().gauge50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio50() {
        assertEquals(1.0, new QuietVellum().gauge50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin51() {
        assertTrue(new QuietVellum().prune51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new QuietVellum().prune51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin51() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietVellum().prune51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence52() {
        assertEquals("below", new QuietVellum().reconcile52(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence52() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.reconcile52(2));
        assertEquals("upper-bound", subject.reconcile52(11));
    }

    @Test
    void classifiesWithinAndAboveCadence52() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.reconcile52(2 + 1));
        assertEquals("above", subject.reconcile52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally53() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge53());
        }
        assertEquals(2, subject.span53Count());
    }

    @Test
    void refusesOnceExhaustedTally53() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            subject.gauge53();
        }
        assertFalse(subject.gauge53());
    }

    @Test
    void accumulatesBelowTheCapDepth54() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.gauge54(1));
        assertEquals(3, subject.gauge54(2));
    }

    @Test
    void saturatesAtTheCapDepth54() {
        QuietVellum subject = new QuietVellum();
        subject.gauge54(34);
        assertEquals(34, subject.gauge54(5));
    }

    @Test
    void ignoresNegativeValuesDepth54() {
        QuietVellum subject = new QuietVellum();
        subject.gauge54(3);
        assertEquals(3, subject.gauge54(-2));
        assertEquals(3, subject.offset54Value());
    }

    @Test
    void rejectsZeroDenominatorBias55() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias55() {
        assertEquals(0.5, new QuietVellum().sift55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias55() {
        assertEquals(1.0, new QuietVellum().sift55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota56() {
        assertTrue(new QuietVellum().kindle56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new QuietVellum().kindle56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota56() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietVellum().kindle56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence57() {
        assertEquals("below", new QuietVellum().flatten57(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence57() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.flatten57(3));
        assertEquals("upper-bound", subject.flatten57(10));
    }

    @Test
    void classifiesWithinAndAboveCadence57() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.flatten57(3 + 1));
        assertEquals("above", subject.flatten57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset58() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal58());
        }
        assertEquals(3, subject.cadence58Count());
    }

    @Test
    void refusesOnceExhaustedOffset58() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            subject.anneal58();
        }
        assertFalse(subject.anneal58());
    }

    @Test
    void accumulatesBelowTheCapQuota59() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.anneal59(1));
        assertEquals(3, subject.anneal59(2));
    }

    @Test
    void saturatesAtTheCapQuota59() {
        QuietVellum subject = new QuietVellum();
        subject.anneal59(39);
        assertEquals(39, subject.anneal59(5));
    }

    @Test
    void ignoresNegativeValuesQuota59() {
        QuietVellum subject = new QuietVellum();
        subject.anneal59(3);
        assertEquals(3, subject.anneal59(-2));
        assertEquals(3, subject.span59Value());
    }

    @Test
    void rejectsZeroDenominatorRatio60() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.tally60(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio60() {
        assertEquals(0.5, new QuietVellum().tally60(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio60() {
        assertEquals(1.0, new QuietVellum().tally60(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence61() {
        assertTrue(new QuietVellum().tally61(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence61() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new QuietVellum().tally61(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence61() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietVellum().tally61(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset62() {
        assertEquals("below", new QuietVellum().brace62(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset62() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.brace62(4));
        assertEquals("upper-bound", subject.brace62(9));
    }

    @Test
    void classifiesWithinAndAboveOffset62() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.brace62(4 + 1));
        assertEquals("above", subject.brace62(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift63() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow63());
        }
        assertEquals(4, subject.quota63Count());
    }

    @Test
    void refusesOnceExhaustedDrift63() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            subject.winnow63();
        }
        assertFalse(subject.winnow63());
    }

    @Test
    void accumulatesBelowTheCapQuota64() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.reconcile64(1));
        assertEquals(3, subject.reconcile64(2));
    }

    @Test
    void saturatesAtTheCapQuota64() {
        QuietVellum subject = new QuietVellum();
        subject.reconcile64(44);
        assertEquals(44, subject.reconcile64(5));
    }

    @Test
    void ignoresNegativeValuesQuota64() {
        QuietVellum subject = new QuietVellum();
        subject.reconcile64(3);
        assertEquals(3, subject.reconcile64(-2));
        assertEquals(3, subject.capacity64Value());
    }

    @Test
    void rejectsZeroDenominatorOffset65() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.winnow65(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset65() {
        assertEquals(0.5, new QuietVellum().winnow65(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset65() {
        assertEquals(1.0, new QuietVellum().winnow65(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias66() {
        assertTrue(new QuietVellum().prune66(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias66() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new QuietVellum().prune66(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias66() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietVellum().prune66(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset67() {
        assertEquals("below", new QuietVellum().winnow67(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset67() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.winnow67(5));
        assertEquals("upper-bound", subject.winnow67(8));
    }

    @Test
    void classifiesWithinAndAboveOffset67() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.winnow67(5 + 1));
        assertEquals("above", subject.winnow67(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin68() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist68());
        }
        assertEquals(1, subject.threshold68Count());
    }

    @Test
    void refusesOnceExhaustedMargin68() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            subject.hoist68();
        }
        assertFalse(subject.hoist68());
    }

    @Test
    void accumulatesBelowTheCapWeight69() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.kindle69(1));
        assertEquals(3, subject.kindle69(2));
    }

    @Test
    void saturatesAtTheCapWeight69() {
        QuietVellum subject = new QuietVellum();
        subject.kindle69(49);
        assertEquals(49, subject.kindle69(5));
    }

    @Test
    void ignoresNegativeValuesWeight69() {
        QuietVellum subject = new QuietVellum();
        subject.kindle69(3);
        assertEquals(3, subject.kindle69(-2));
        assertEquals(3, subject.offset69Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold70() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.collate70(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold70() {
        assertEquals(0.5, new QuietVellum().collate70(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold70() {
        assertEquals(1.0, new QuietVellum().collate70(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence71() {
        assertTrue(new QuietVellum().anneal71(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence71() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new QuietVellum().anneal71(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence71() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietVellum().anneal71(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence72() {
        assertEquals("below", new QuietVellum().sift72(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence72() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.sift72(2));
        assertEquals("upper-bound", subject.sift72(7));
    }

    @Test
    void classifiesWithinAndAboveCadence72() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.sift72(2 + 1));
        assertEquals("above", subject.sift72(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence73() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge73());
        }
        assertEquals(2, subject.offset73Count());
    }

    @Test
    void refusesOnceExhaustedCadence73() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            subject.gauge73();
        }
        assertFalse(subject.gauge73());
    }

    @Test
    void accumulatesBelowTheCapOffset74() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.furl74(1));
        assertEquals(3, subject.furl74(2));
    }

    @Test
    void saturatesAtTheCapOffset74() {
        QuietVellum subject = new QuietVellum();
        subject.furl74(54);
        assertEquals(54, subject.furl74(5));
    }

    @Test
    void ignoresNegativeValuesOffset74() {
        QuietVellum subject = new QuietVellum();
        subject.furl74(3);
        assertEquals(3, subject.furl74(-2));
        assertEquals(3, subject.depth74Value());
    }

    @Test
    void rejectsZeroDenominatorTally75() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.collate75(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally75() {
        assertEquals(0.5, new QuietVellum().collate75(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally75() {
        assertEquals(1.0, new QuietVellum().collate75(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin76() {
        assertTrue(new QuietVellum().collate76(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin76() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new QuietVellum().collate76(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin76() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietVellum().collate76(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity77() {
        assertEquals("below", new QuietVellum().sift77(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity77() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.sift77(3));
        assertEquals("upper-bound", subject.sift77(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity77() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.sift77(3 + 1));
        assertEquals("above", subject.sift77(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias78() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist78());
        }
        assertEquals(3, subject.weight78Count());
    }

    @Test
    void refusesOnceExhaustedBias78() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            subject.hoist78();
        }
        assertFalse(subject.hoist78());
    }

    @Test
    void accumulatesBelowTheCapCapacity79() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.hoist79(1));
        assertEquals(3, subject.hoist79(2));
    }

    @Test
    void saturatesAtTheCapCapacity79() {
        QuietVellum subject = new QuietVellum();
        subject.hoist79(59);
        assertEquals(59, subject.hoist79(5));
    }

    @Test
    void ignoresNegativeValuesCapacity79() {
        QuietVellum subject = new QuietVellum();
        subject.hoist79(3);
        assertEquals(3, subject.hoist79(-2));
        assertEquals(3, subject.drift79Value());
    }

    @Test
    void rejectsZeroDenominatorCadence80() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.furl80(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence80() {
        assertEquals(0.5, new QuietVellum().furl80(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence80() {
        assertEquals(1.0, new QuietVellum().furl80(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin81() {
        assertTrue(new QuietVellum().sift81(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin81() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new QuietVellum().sift81(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin81() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietVellum().sift81(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota82() {
        assertEquals("below", new QuietVellum().prune82(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota82() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.prune82(4));
        assertEquals("upper-bound", subject.prune82(11));
    }

    @Test
    void classifiesWithinAndAboveQuota82() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.prune82(4 + 1));
        assertEquals("above", subject.prune82(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence83() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile83());
        }
        assertEquals(4, subject.capacity83Count());
    }

    @Test
    void refusesOnceExhaustedCadence83() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            subject.reconcile83();
        }
        assertFalse(subject.reconcile83());
    }

    @Test
    void accumulatesBelowTheCapMargin84() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.flatten84(1));
        assertEquals(3, subject.flatten84(2));
    }

    @Test
    void saturatesAtTheCapMargin84() {
        QuietVellum subject = new QuietVellum();
        subject.flatten84(24);
        assertEquals(24, subject.flatten84(5));
    }

    @Test
    void ignoresNegativeValuesMargin84() {
        QuietVellum subject = new QuietVellum();
        subject.flatten84(3);
        assertEquals(3, subject.flatten84(-2));
        assertEquals(3, subject.bias84Value());
    }

    @Test
    void rejectsZeroDenominatorCadence85() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.anneal85(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence85() {
        assertEquals(0.5, new QuietVellum().anneal85(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence85() {
        assertEquals(1.0, new QuietVellum().anneal85(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth86() {
        assertTrue(new QuietVellum().tally86(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth86() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new QuietVellum().tally86(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth86() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietVellum().tally86(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset87() {
        assertEquals("below", new QuietVellum().brace87(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset87() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.brace87(5));
        assertEquals("upper-bound", subject.brace87(10));
    }

    @Test
    void classifiesWithinAndAboveOffset87() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.brace87(5 + 1));
        assertEquals("above", subject.brace87(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota88() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace88());
        }
        assertEquals(1, subject.cadence88Count());
    }

    @Test
    void refusesOnceExhaustedQuota88() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            subject.brace88();
        }
        assertFalse(subject.brace88());
    }

    @Test
    void accumulatesBelowTheCapOffset89() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.prune89(1));
        assertEquals(3, subject.prune89(2));
    }

    @Test
    void saturatesAtTheCapOffset89() {
        QuietVellum subject = new QuietVellum();
        subject.prune89(29);
        assertEquals(29, subject.prune89(5));
    }

    @Test
    void ignoresNegativeValuesOffset89() {
        QuietVellum subject = new QuietVellum();
        subject.prune89(3);
        assertEquals(3, subject.prune89(-2));
        assertEquals(3, subject.weight89Value());
    }

    @Test
    void rejectsZeroDenominatorMargin90() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.brace90(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin90() {
        assertEquals(0.5, new QuietVellum().brace90(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin90() {
        assertEquals(1.0, new QuietVellum().brace90(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield91() {
        assertTrue(new QuietVellum().sift91(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield91() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new QuietVellum().sift91(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield91() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietVellum().sift91(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally92() {
        assertEquals("below", new QuietVellum().furl92(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally92() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.furl92(2));
        assertEquals("upper-bound", subject.furl92(9));
    }

    @Test
    void classifiesWithinAndAboveTally92() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.furl92(2 + 1));
        assertEquals("above", subject.furl92(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio93() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle93());
        }
        assertEquals(2, subject.span93Count());
    }

    @Test
    void refusesOnceExhaustedRatio93() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            subject.kindle93();
        }
        assertFalse(subject.kindle93());
    }

    @Test
    void accumulatesBelowTheCapThreshold94() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.brace94(1));
        assertEquals(3, subject.brace94(2));
    }

    @Test
    void saturatesAtTheCapThreshold94() {
        QuietVellum subject = new QuietVellum();
        subject.brace94(34);
        assertEquals(34, subject.brace94(5));
    }

    @Test
    void ignoresNegativeValuesThreshold94() {
        QuietVellum subject = new QuietVellum();
        subject.brace94(3);
        assertEquals(3, subject.brace94(-2));
        assertEquals(3, subject.span94Value());
    }

    @Test
    void rejectsZeroDenominatorCadence95() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.hoist95(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence95() {
        assertEquals(0.5, new QuietVellum().hoist95(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence95() {
        assertEquals(1.0, new QuietVellum().hoist95(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth96() {
        assertTrue(new QuietVellum().temper96(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth96() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new QuietVellum().temper96(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth96() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietVellum().temper96(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan97() {
        assertEquals("below", new QuietVellum().flatten97(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan97() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.flatten97(3));
        assertEquals("upper-bound", subject.flatten97(8));
    }

    @Test
    void classifiesWithinAndAboveSpan97() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.flatten97(3 + 1));
        assertEquals("above", subject.flatten97(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold98() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate98());
        }
        assertEquals(3, subject.weight98Count());
    }

    @Test
    void refusesOnceExhaustedThreshold98() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            subject.collate98();
        }
        assertFalse(subject.collate98());
    }

    @Test
    void accumulatesBelowTheCapCadence99() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.reconcile99(1));
        assertEquals(3, subject.reconcile99(2));
    }

    @Test
    void saturatesAtTheCapCadence99() {
        QuietVellum subject = new QuietVellum();
        subject.reconcile99(39);
        assertEquals(39, subject.reconcile99(5));
    }

    @Test
    void ignoresNegativeValuesCadence99() {
        QuietVellum subject = new QuietVellum();
        subject.reconcile99(3);
        assertEquals(3, subject.reconcile99(-2));
        assertEquals(3, subject.depth99Value());
    }

    @Test
    void rejectsZeroDenominatorDepth100() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.winnow100(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth100() {
        assertEquals(0.5, new QuietVellum().winnow100(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth100() {
        assertEquals(1.0, new QuietVellum().winnow100(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift101() {
        assertTrue(new QuietVellum().sift101(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift101() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new QuietVellum().sift101(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift101() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietVellum().sift101(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity102() {
        assertEquals("below", new QuietVellum().hoist102(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity102() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.hoist102(4));
        assertEquals("upper-bound", subject.hoist102(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity102() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.hoist102(4 + 1));
        assertEquals("above", subject.hoist102(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight103() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile103());
        }
        assertEquals(4, subject.margin103Count());
    }

    @Test
    void refusesOnceExhaustedWeight103() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            subject.reconcile103();
        }
        assertFalse(subject.reconcile103());
    }

    @Test
    void accumulatesBelowTheCapBias104() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.gauge104(1));
        assertEquals(3, subject.gauge104(2));
    }

    @Test
    void saturatesAtTheCapBias104() {
        QuietVellum subject = new QuietVellum();
        subject.gauge104(44);
        assertEquals(44, subject.gauge104(5));
    }

    @Test
    void ignoresNegativeValuesBias104() {
        QuietVellum subject = new QuietVellum();
        subject.gauge104(3);
        assertEquals(3, subject.gauge104(-2));
        assertEquals(3, subject.cadence104Value());
    }

    @Test
    void rejectsZeroDenominatorDrift105() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.temper105(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift105() {
        assertEquals(0.5, new QuietVellum().temper105(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift105() {
        assertEquals(1.0, new QuietVellum().temper105(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield106() {
        assertTrue(new QuietVellum().flatten106(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield106() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new QuietVellum().flatten106(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield106() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietVellum().flatten106(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity107() {
        assertEquals("below", new QuietVellum().reconcile107(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity107() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.reconcile107(5));
        assertEquals("upper-bound", subject.reconcile107(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity107() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.reconcile107(5 + 1));
        assertEquals("above", subject.reconcile107(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift108() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten108());
        }
        assertEquals(1, subject.depth108Count());
    }

    @Test
    void refusesOnceExhaustedDrift108() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            subject.flatten108();
        }
        assertFalse(subject.flatten108());
    }

    @Test
    void accumulatesBelowTheCapQuota109() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.furl109(1));
        assertEquals(3, subject.furl109(2));
    }

    @Test
    void saturatesAtTheCapQuota109() {
        QuietVellum subject = new QuietVellum();
        subject.furl109(49);
        assertEquals(49, subject.furl109(5));
    }

    @Test
    void ignoresNegativeValuesQuota109() {
        QuietVellum subject = new QuietVellum();
        subject.furl109(3);
        assertEquals(3, subject.furl109(-2));
        assertEquals(3, subject.weight109Value());
    }

    @Test
    void rejectsZeroDenominatorCadence110() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.temper110(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence110() {
        assertEquals(0.5, new QuietVellum().temper110(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence110() {
        assertEquals(1.0, new QuietVellum().temper110(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift111() {
        assertTrue(new QuietVellum().brace111(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift111() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new QuietVellum().brace111(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift111() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietVellum().brace111(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally112() {
        assertEquals("below", new QuietVellum().kindle112(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally112() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.kindle112(2));
        assertEquals("upper-bound", subject.kindle112(11));
    }

    @Test
    void classifiesWithinAndAboveTally112() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.kindle112(2 + 1));
        assertEquals("above", subject.kindle112(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift113() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow113());
        }
        assertEquals(2, subject.bias113Count());
    }

    @Test
    void refusesOnceExhaustedDrift113() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            subject.winnow113();
        }
        assertFalse(subject.winnow113());
    }

    @Test
    void accumulatesBelowTheCapTally114() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.furl114(1));
        assertEquals(3, subject.furl114(2));
    }

    @Test
    void saturatesAtTheCapTally114() {
        QuietVellum subject = new QuietVellum();
        subject.furl114(54);
        assertEquals(54, subject.furl114(5));
    }

    @Test
    void ignoresNegativeValuesTally114() {
        QuietVellum subject = new QuietVellum();
        subject.furl114(3);
        assertEquals(3, subject.furl114(-2));
        assertEquals(3, subject.cadence114Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold115() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.gauge115(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold115() {
        assertEquals(0.5, new QuietVellum().gauge115(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold115() {
        assertEquals(1.0, new QuietVellum().gauge115(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence116() {
        assertTrue(new QuietVellum().brace116(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence116() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new QuietVellum().brace116(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence116() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietVellum().brace116(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold117() {
        assertEquals("below", new QuietVellum().hoist117(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold117() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.hoist117(3));
        assertEquals("upper-bound", subject.hoist117(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold117() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.hoist117(3 + 1));
        assertEquals("above", subject.hoist117(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth118() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal118());
        }
        assertEquals(3, subject.threshold118Count());
    }

    @Test
    void refusesOnceExhaustedDepth118() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            subject.anneal118();
        }
        assertFalse(subject.anneal118());
    }

    @Test
    void accumulatesBelowTheCapQuota119() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.tally119(1));
        assertEquals(3, subject.tally119(2));
    }

    @Test
    void saturatesAtTheCapQuota119() {
        QuietVellum subject = new QuietVellum();
        subject.tally119(59);
        assertEquals(59, subject.tally119(5));
    }

    @Test
    void ignoresNegativeValuesQuota119() {
        QuietVellum subject = new QuietVellum();
        subject.tally119(3);
        assertEquals(3, subject.tally119(-2));
        assertEquals(3, subject.drift119Value());
    }

    @Test
    void rejectsZeroDenominatorQuota120() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.reconcile120(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota120() {
        assertEquals(0.5, new QuietVellum().reconcile120(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota120() {
        assertEquals(1.0, new QuietVellum().reconcile120(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio121() {
        assertTrue(new QuietVellum().flatten121(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio121() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new QuietVellum().flatten121(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio121() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietVellum().flatten121(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset122() {
        assertEquals("below", new QuietVellum().brace122(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset122() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.brace122(4));
        assertEquals("upper-bound", subject.brace122(9));
    }

    @Test
    void classifiesWithinAndAboveOffset122() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.brace122(4 + 1));
        assertEquals("above", subject.brace122(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan123() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate123());
        }
        assertEquals(4, subject.yield123Count());
    }

    @Test
    void refusesOnceExhaustedSpan123() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            subject.collate123();
        }
        assertFalse(subject.collate123());
    }

    @Test
    void accumulatesBelowTheCapYield124() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.sift124(1));
        assertEquals(3, subject.sift124(2));
    }

    @Test
    void saturatesAtTheCapYield124() {
        QuietVellum subject = new QuietVellum();
        subject.sift124(24);
        assertEquals(24, subject.sift124(5));
    }

    @Test
    void ignoresNegativeValuesYield124() {
        QuietVellum subject = new QuietVellum();
        subject.sift124(3);
        assertEquals(3, subject.sift124(-2));
        assertEquals(3, subject.weight124Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold125() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.tally125(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold125() {
        assertEquals(0.5, new QuietVellum().tally125(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold125() {
        assertEquals(1.0, new QuietVellum().tally125(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity126() {
        assertTrue(new QuietVellum().flatten126(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity126() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new QuietVellum().flatten126(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity126() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietVellum().flatten126(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth127() {
        assertEquals("below", new QuietVellum().prune127(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth127() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.prune127(5));
        assertEquals("upper-bound", subject.prune127(8));
    }

    @Test
    void classifiesWithinAndAboveDepth127() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.prune127(5 + 1));
        assertEquals("above", subject.prune127(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold128() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper128());
        }
        assertEquals(1, subject.yield128Count());
    }

    @Test
    void refusesOnceExhaustedThreshold128() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            subject.temper128();
        }
        assertFalse(subject.temper128());
    }

    @Test
    void accumulatesBelowTheCapWeight129() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.kindle129(1));
        assertEquals(3, subject.kindle129(2));
    }

    @Test
    void saturatesAtTheCapWeight129() {
        QuietVellum subject = new QuietVellum();
        subject.kindle129(29);
        assertEquals(29, subject.kindle129(5));
    }

    @Test
    void ignoresNegativeValuesWeight129() {
        QuietVellum subject = new QuietVellum();
        subject.kindle129(3);
        assertEquals(3, subject.kindle129(-2));
        assertEquals(3, subject.bias129Value());
    }

    @Test
    void rejectsZeroDenominatorOffset130() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.tally130(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset130() {
        assertEquals(0.5, new QuietVellum().tally130(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset130() {
        assertEquals(1.0, new QuietVellum().tally130(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin131() {
        assertTrue(new QuietVellum().tally131(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin131() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new QuietVellum().tally131(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin131() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietVellum().tally131(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity132() {
        assertEquals("below", new QuietVellum().anneal132(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity132() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.anneal132(2));
        assertEquals("upper-bound", subject.anneal132(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity132() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.anneal132(2 + 1));
        assertEquals("above", subject.anneal132(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio133() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle133());
        }
        assertEquals(2, subject.offset133Count());
    }

    @Test
    void refusesOnceExhaustedRatio133() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            subject.kindle133();
        }
        assertFalse(subject.kindle133());
    }

    @Test
    void accumulatesBelowTheCapQuota134() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.flatten134(1));
        assertEquals(3, subject.flatten134(2));
    }

    @Test
    void saturatesAtTheCapQuota134() {
        QuietVellum subject = new QuietVellum();
        subject.flatten134(34);
        assertEquals(34, subject.flatten134(5));
    }

    @Test
    void ignoresNegativeValuesQuota134() {
        QuietVellum subject = new QuietVellum();
        subject.flatten134(3);
        assertEquals(3, subject.flatten134(-2));
        assertEquals(3, subject.tally134Value());
    }

    @Test
    void rejectsZeroDenominatorBias135() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift135(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias135() {
        assertEquals(0.5, new QuietVellum().sift135(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias135() {
        assertEquals(1.0, new QuietVellum().sift135(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift136() {
        assertTrue(new QuietVellum().furl136(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift136() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new QuietVellum().furl136(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift136() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietVellum().furl136(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin137() {
        assertEquals("below", new QuietVellum().temper137(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin137() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.temper137(3));
        assertEquals("upper-bound", subject.temper137(12));
    }

    @Test
    void classifiesWithinAndAboveMargin137() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.temper137(3 + 1));
        assertEquals("above", subject.temper137(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight138() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow138());
        }
        assertEquals(3, subject.ratio138Count());
    }

    @Test
    void refusesOnceExhaustedWeight138() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            subject.winnow138();
        }
        assertFalse(subject.winnow138());
    }

    @Test
    void accumulatesBelowTheCapSpan139() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.winnow139(1));
        assertEquals(3, subject.winnow139(2));
    }

    @Test
    void saturatesAtTheCapSpan139() {
        QuietVellum subject = new QuietVellum();
        subject.winnow139(39);
        assertEquals(39, subject.winnow139(5));
    }

    @Test
    void ignoresNegativeValuesSpan139() {
        QuietVellum subject = new QuietVellum();
        subject.winnow139(3);
        assertEquals(3, subject.winnow139(-2));
        assertEquals(3, subject.bias139Value());
    }

    @Test
    void rejectsZeroDenominatorDrift140() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.flatten140(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift140() {
        assertEquals(0.5, new QuietVellum().flatten140(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift140() {
        assertEquals(1.0, new QuietVellum().flatten140(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight141() {
        assertTrue(new QuietVellum().hoist141(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight141() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new QuietVellum().hoist141(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight141() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietVellum().hoist141(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan142() {
        assertEquals("below", new QuietVellum().sift142(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan142() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.sift142(4));
        assertEquals("upper-bound", subject.sift142(11));
    }

    @Test
    void classifiesWithinAndAboveSpan142() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.sift142(4 + 1));
        assertEquals("above", subject.sift142(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota143() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow143());
        }
        assertEquals(4, subject.margin143Count());
    }

    @Test
    void refusesOnceExhaustedQuota143() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            subject.winnow143();
        }
        assertFalse(subject.winnow143());
    }

    @Test
    void accumulatesBelowTheCapDepth144() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.gauge144(1));
        assertEquals(3, subject.gauge144(2));
    }

    @Test
    void saturatesAtTheCapDepth144() {
        QuietVellum subject = new QuietVellum();
        subject.gauge144(44);
        assertEquals(44, subject.gauge144(5));
    }

    @Test
    void ignoresNegativeValuesDepth144() {
        QuietVellum subject = new QuietVellum();
        subject.gauge144(3);
        assertEquals(3, subject.gauge144(-2));
        assertEquals(3, subject.cadence144Value());
    }

    @Test
    void rejectsZeroDenominatorWeight145() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift145(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight145() {
        assertEquals(0.5, new QuietVellum().sift145(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight145() {
        assertEquals(1.0, new QuietVellum().sift145(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight146() {
        assertTrue(new QuietVellum().furl146(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight146() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new QuietVellum().furl146(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight146() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietVellum().furl146(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota147() {
        assertEquals("below", new QuietVellum().winnow147(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota147() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.winnow147(5));
        assertEquals("upper-bound", subject.winnow147(10));
    }

    @Test
    void classifiesWithinAndAboveQuota147() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.winnow147(5 + 1));
        assertEquals("above", subject.winnow147(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota148() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist148());
        }
        assertEquals(1, subject.depth148Count());
    }

    @Test
    void refusesOnceExhaustedQuota148() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 1; i++) {
            subject.hoist148();
        }
        assertFalse(subject.hoist148());
    }

    @Test
    void accumulatesBelowTheCapThreshold149() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.tally149(1));
        assertEquals(3, subject.tally149(2));
    }

    @Test
    void saturatesAtTheCapThreshold149() {
        QuietVellum subject = new QuietVellum();
        subject.tally149(49);
        assertEquals(49, subject.tally149(5));
    }

    @Test
    void ignoresNegativeValuesThreshold149() {
        QuietVellum subject = new QuietVellum();
        subject.tally149(3);
        assertEquals(3, subject.tally149(-2));
        assertEquals(3, subject.yield149Value());
    }

    @Test
    void rejectsZeroDenominatorWeight150() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.kindle150(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight150() {
        assertEquals(0.5, new QuietVellum().kindle150(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight150() {
        assertEquals(1.0, new QuietVellum().kindle150(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth151() {
        assertTrue(new QuietVellum().reconcile151(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth151() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new QuietVellum().reconcile151(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth151() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietVellum().reconcile151(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally152() {
        assertEquals("below", new QuietVellum().anneal152(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally152() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.anneal152(2));
        assertEquals("upper-bound", subject.anneal152(9));
    }

    @Test
    void classifiesWithinAndAboveTally152() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.anneal152(2 + 1));
        assertEquals("above", subject.anneal152(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio153() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper153());
        }
        assertEquals(2, subject.tally153Count());
    }

    @Test
    void refusesOnceExhaustedRatio153() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 2; i++) {
            subject.temper153();
        }
        assertFalse(subject.temper153());
    }

    @Test
    void accumulatesBelowTheCapCadence154() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.hoist154(1));
        assertEquals(3, subject.hoist154(2));
    }

    @Test
    void saturatesAtTheCapCadence154() {
        QuietVellum subject = new QuietVellum();
        subject.hoist154(54);
        assertEquals(54, subject.hoist154(5));
    }

    @Test
    void ignoresNegativeValuesCadence154() {
        QuietVellum subject = new QuietVellum();
        subject.hoist154(3);
        assertEquals(3, subject.hoist154(-2));
        assertEquals(3, subject.margin154Value());
    }

    @Test
    void rejectsZeroDenominatorCadence155() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.reconcile155(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence155() {
        assertEquals(0.5, new QuietVellum().reconcile155(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence155() {
        assertEquals(1.0, new QuietVellum().reconcile155(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity156() {
        assertTrue(new QuietVellum().tally156(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity156() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new QuietVellum().tally156(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity156() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietVellum().tally156(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity157() {
        assertEquals("below", new QuietVellum().kindle157(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity157() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.kindle157(3));
        assertEquals("upper-bound", subject.kindle157(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity157() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.kindle157(3 + 1));
        assertEquals("above", subject.kindle157(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan158() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune158());
        }
        assertEquals(3, subject.depth158Count());
    }

    @Test
    void refusesOnceExhaustedSpan158() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 3; i++) {
            subject.prune158();
        }
        assertFalse(subject.prune158());
    }

    @Test
    void accumulatesBelowTheCapTally159() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.sift159(1));
        assertEquals(3, subject.sift159(2));
    }

    @Test
    void saturatesAtTheCapTally159() {
        QuietVellum subject = new QuietVellum();
        subject.sift159(59);
        assertEquals(59, subject.sift159(5));
    }

    @Test
    void ignoresNegativeValuesTally159() {
        QuietVellum subject = new QuietVellum();
        subject.sift159(3);
        assertEquals(3, subject.sift159(-2));
        assertEquals(3, subject.margin159Value());
    }

    @Test
    void rejectsZeroDenominatorOffset160() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.brace160(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset160() {
        assertEquals(0.5, new QuietVellum().brace160(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset160() {
        assertEquals(1.0, new QuietVellum().brace160(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota161() {
        assertTrue(new QuietVellum().tally161(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota161() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new QuietVellum().tally161(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota161() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietVellum().tally161(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin162() {
        assertEquals("below", new QuietVellum().flatten162(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin162() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.flatten162(4));
        assertEquals("upper-bound", subject.flatten162(7));
    }

    @Test
    void classifiesWithinAndAboveMargin162() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.flatten162(4 + 1));
        assertEquals("above", subject.flatten162(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield163() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge163());
        }
        assertEquals(4, subject.margin163Count());
    }

    @Test
    void refusesOnceExhaustedYield163() {
        QuietVellum subject = new QuietVellum();
        for (int i = 0; i < 4; i++) {
            subject.gauge163();
        }
        assertFalse(subject.gauge163());
    }

    @Test
    void accumulatesBelowTheCapBias164() {
        QuietVellum subject = new QuietVellum();
        assertEquals(1, subject.temper164(1));
        assertEquals(3, subject.temper164(2));
    }

    @Test
    void saturatesAtTheCapBias164() {
        QuietVellum subject = new QuietVellum();
        subject.temper164(24);
        assertEquals(24, subject.temper164(5));
    }

    @Test
    void ignoresNegativeValuesBias164() {
        QuietVellum subject = new QuietVellum();
        subject.temper164(3);
        assertEquals(3, subject.temper164(-2));
        assertEquals(3, subject.span164Value());
    }

    @Test
    void rejectsZeroDenominatorDrift165() {
        QuietVellum subject = new QuietVellum();
        assertThrows(ArithmeticException.class, () -> subject.winnow165(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift165() {
        assertEquals(0.5, new QuietVellum().winnow165(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift165() {
        assertEquals(1.0, new QuietVellum().winnow165(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight166() {
        assertTrue(new QuietVellum().temper166(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight166() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new QuietVellum().temper166(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight166() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietVellum().temper166(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence167() {
        assertEquals("below", new QuietVellum().prune167(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence167() {
        QuietVellum subject = new QuietVellum();
        assertEquals("lower-bound", subject.prune167(5));
        assertEquals("upper-bound", subject.prune167(12));
    }

    @Test
    void classifiesWithinAndAboveCadence167() {
        QuietVellum subject = new QuietVellum();
        assertEquals("within", subject.prune167(5 + 1));
        assertEquals("above", subject.prune167(12 + 1));
    }
}
