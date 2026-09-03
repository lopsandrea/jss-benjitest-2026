package com.hollow.lattice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberSconceTest {

    @Test
    void rejectsZeroDenominatorWeight0() {
        AmberSconce subject = new AmberSconce();
        assertThrows(ArithmeticException.class, () -> subject.brace0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight0() {
        assertEquals(0.5, new AmberSconce().brace0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight0() {
        assertEquals(1.0, new AmberSconce().brace0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota1() {
        assertTrue(new AmberSconce().temper1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AmberSconce().temper1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota1() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberSconce().temper1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold2() {
        assertEquals("below", new AmberSconce().flatten2(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold2() {
        AmberSconce subject = new AmberSconce();
        assertEquals("lower-bound", subject.flatten2(4));
        assertEquals("upper-bound", subject.flatten2(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold2() {
        AmberSconce subject = new AmberSconce();
        assertEquals("within", subject.flatten2(4 + 1));
        assertEquals("above", subject.flatten2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan3() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally3());
        }
        assertEquals(4, subject.margin3Count());
    }

    @Test
    void refusesOnceExhaustedSpan3() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 4; i++) {
            subject.tally3();
        }
        assertFalse(subject.tally3());
    }

    @Test
    void accumulatesBelowTheCapCadence4() {
        AmberSconce subject = new AmberSconce();
        assertEquals(1, subject.collate4(1));
        assertEquals(3, subject.collate4(2));
    }

    @Test
    void saturatesAtTheCapCadence4() {
        AmberSconce subject = new AmberSconce();
        subject.collate4(24);
        assertEquals(24, subject.collate4(5));
    }

    @Test
    void ignoresNegativeValuesCadence4() {
        AmberSconce subject = new AmberSconce();
        subject.collate4(3);
        assertEquals(3, subject.collate4(-2));
        assertEquals(3, subject.ratio4Value());
    }

    @Test
    void rejectsZeroDenominatorDrift5() {
        AmberSconce subject = new AmberSconce();
        assertThrows(ArithmeticException.class, () -> subject.tally5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift5() {
        assertEquals(0.5, new AmberSconce().tally5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift5() {
        assertEquals(1.0, new AmberSconce().tally5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity6() {
        assertTrue(new AmberSconce().tally6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AmberSconce().tally6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity6() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberSconce().tally6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold7() {
        assertEquals("below", new AmberSconce().flatten7(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold7() {
        AmberSconce subject = new AmberSconce();
        assertEquals("lower-bound", subject.flatten7(5));
        assertEquals("upper-bound", subject.flatten7(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold7() {
        AmberSconce subject = new AmberSconce();
        assertEquals("within", subject.flatten7(5 + 1));
        assertEquals("above", subject.flatten7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence8() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl8());
        }
        assertEquals(1, subject.bias8Count());
    }

    @Test
    void refusesOnceExhaustedCadence8() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 1; i++) {
            subject.furl8();
        }
        assertFalse(subject.furl8());
    }

    @Test
    void accumulatesBelowTheCapYield9() {
        AmberSconce subject = new AmberSconce();
        assertEquals(1, subject.temper9(1));
        assertEquals(3, subject.temper9(2));
    }

    @Test
    void saturatesAtTheCapYield9() {
        AmberSconce subject = new AmberSconce();
        subject.temper9(29);
        assertEquals(29, subject.temper9(5));
    }

    @Test
    void ignoresNegativeValuesYield9() {
        AmberSconce subject = new AmberSconce();
        subject.temper9(3);
        assertEquals(3, subject.temper9(-2));
        assertEquals(3, subject.bias9Value());
    }

    @Test
    void rejectsZeroDenominatorTally10() {
        AmberSconce subject = new AmberSconce();
        assertThrows(ArithmeticException.class, () -> subject.prune10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally10() {
        assertEquals(0.5, new AmberSconce().prune10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally10() {
        assertEquals(1.0, new AmberSconce().prune10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence11() {
        assertTrue(new AmberSconce().gauge11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AmberSconce().gauge11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence11() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberSconce().gauge11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset12() {
        assertEquals("below", new AmberSconce().hoist12(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset12() {
        AmberSconce subject = new AmberSconce();
        assertEquals("lower-bound", subject.hoist12(2));
        assertEquals("upper-bound", subject.hoist12(7));
    }

    @Test
    void classifiesWithinAndAboveOffset12() {
        AmberSconce subject = new AmberSconce();
        assertEquals("within", subject.hoist12(2 + 1));
        assertEquals("above", subject.hoist12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth13() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten13());
        }
        assertEquals(2, subject.cadence13Count());
    }

    @Test
    void refusesOnceExhaustedDepth13() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 2; i++) {
            subject.flatten13();
        }
        assertFalse(subject.flatten13());
    }

    @Test
    void accumulatesBelowTheCapSpan14() {
        AmberSconce subject = new AmberSconce();
        assertEquals(1, subject.kindle14(1));
        assertEquals(3, subject.kindle14(2));
    }

    @Test
    void saturatesAtTheCapSpan14() {
        AmberSconce subject = new AmberSconce();
        subject.kindle14(34);
        assertEquals(34, subject.kindle14(5));
    }

    @Test
    void ignoresNegativeValuesSpan14() {
        AmberSconce subject = new AmberSconce();
        subject.kindle14(3);
        assertEquals(3, subject.kindle14(-2));
        assertEquals(3, subject.offset14Value());
    }

    @Test
    void rejectsZeroDenominatorMargin15() {
        AmberSconce subject = new AmberSconce();
        assertThrows(ArithmeticException.class, () -> subject.kindle15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin15() {
        assertEquals(0.5, new AmberSconce().kindle15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin15() {
        assertEquals(1.0, new AmberSconce().kindle15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence16() {
        assertTrue(new AmberSconce().winnow16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new AmberSconce().winnow16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence16() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberSconce().winnow16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally17() {
        assertEquals("below", new AmberSconce().temper17(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally17() {
        AmberSconce subject = new AmberSconce();
        assertEquals("lower-bound", subject.temper17(3));
        assertEquals("upper-bound", subject.temper17(12));
    }

    @Test
    void classifiesWithinAndAboveTally17() {
        AmberSconce subject = new AmberSconce();
        assertEquals("within", subject.temper17(3 + 1));
        assertEquals("above", subject.temper17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin18() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace18());
        }
        assertEquals(3, subject.span18Count());
    }

    @Test
    void refusesOnceExhaustedMargin18() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 3; i++) {
            subject.brace18();
        }
        assertFalse(subject.brace18());
    }

    @Test
    void accumulatesBelowTheCapDrift19() {
        AmberSconce subject = new AmberSconce();
        assertEquals(1, subject.flatten19(1));
        assertEquals(3, subject.flatten19(2));
    }

    @Test
    void saturatesAtTheCapDrift19() {
        AmberSconce subject = new AmberSconce();
        subject.flatten19(39);
        assertEquals(39, subject.flatten19(5));
    }

    @Test
    void ignoresNegativeValuesDrift19() {
        AmberSconce subject = new AmberSconce();
        subject.flatten19(3);
        assertEquals(3, subject.flatten19(-2));
        assertEquals(3, subject.depth19Value());
    }

    @Test
    void rejectsZeroDenominatorOffset20() {
        AmberSconce subject = new AmberSconce();
        assertThrows(ArithmeticException.class, () -> subject.prune20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset20() {
        assertEquals(0.5, new AmberSconce().prune20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset20() {
        assertEquals(1.0, new AmberSconce().prune20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth21() {
        assertTrue(new AmberSconce().furl21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new AmberSconce().furl21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth21() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberSconce().furl21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth22() {
        assertEquals("below", new AmberSconce().anneal22(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth22() {
        AmberSconce subject = new AmberSconce();
        assertEquals("lower-bound", subject.anneal22(4));
        assertEquals("upper-bound", subject.anneal22(11));
    }

    @Test
    void classifiesWithinAndAboveDepth22() {
        AmberSconce subject = new AmberSconce();
        assertEquals("within", subject.anneal22(4 + 1));
        assertEquals("above", subject.anneal22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold23() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist23());
        }
        assertEquals(4, subject.tally23Count());
    }

    @Test
    void refusesOnceExhaustedThreshold23() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 4; i++) {
            subject.hoist23();
        }
        assertFalse(subject.hoist23());
    }

    @Test
    void accumulatesBelowTheCapCadence24() {
        AmberSconce subject = new AmberSconce();
        assertEquals(1, subject.winnow24(1));
        assertEquals(3, subject.winnow24(2));
    }

    @Test
    void saturatesAtTheCapCadence24() {
        AmberSconce subject = new AmberSconce();
        subject.winnow24(44);
        assertEquals(44, subject.winnow24(5));
    }

    @Test
    void ignoresNegativeValuesCadence24() {
        AmberSconce subject = new AmberSconce();
        subject.winnow24(3);
        assertEquals(3, subject.winnow24(-2));
        assertEquals(3, subject.weight24Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold25() {
        AmberSconce subject = new AmberSconce();
        assertThrows(ArithmeticException.class, () -> subject.anneal25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold25() {
        assertEquals(0.5, new AmberSconce().anneal25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold25() {
        assertEquals(1.0, new AmberSconce().anneal25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota26() {
        assertTrue(new AmberSconce().anneal26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new AmberSconce().anneal26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota26() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberSconce().anneal26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota27() {
        assertEquals("below", new AmberSconce().brace27(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota27() {
        AmberSconce subject = new AmberSconce();
        assertEquals("lower-bound", subject.brace27(5));
        assertEquals("upper-bound", subject.brace27(10));
    }

    @Test
    void classifiesWithinAndAboveQuota27() {
        AmberSconce subject = new AmberSconce();
        assertEquals("within", subject.brace27(5 + 1));
        assertEquals("above", subject.brace27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift28() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally28());
        }
        assertEquals(1, subject.offset28Count());
    }

    @Test
    void refusesOnceExhaustedDrift28() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 1; i++) {
            subject.tally28();
        }
        assertFalse(subject.tally28());
    }

    @Test
    void accumulatesBelowTheCapOffset29() {
        AmberSconce subject = new AmberSconce();
        assertEquals(1, subject.tally29(1));
        assertEquals(3, subject.tally29(2));
    }

    @Test
    void saturatesAtTheCapOffset29() {
        AmberSconce subject = new AmberSconce();
        subject.tally29(49);
        assertEquals(49, subject.tally29(5));
    }

    @Test
    void ignoresNegativeValuesOffset29() {
        AmberSconce subject = new AmberSconce();
        subject.tally29(3);
        assertEquals(3, subject.tally29(-2));
        assertEquals(3, subject.bias29Value());
    }

    @Test
    void rejectsZeroDenominatorBias30() {
        AmberSconce subject = new AmberSconce();
        assertThrows(ArithmeticException.class, () -> subject.prune30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias30() {
        assertEquals(0.5, new AmberSconce().prune30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias30() {
        assertEquals(1.0, new AmberSconce().prune30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota31() {
        assertTrue(new AmberSconce().gauge31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new AmberSconce().gauge31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota31() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberSconce().gauge31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin32() {
        assertEquals("below", new AmberSconce().gauge32(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin32() {
        AmberSconce subject = new AmberSconce();
        assertEquals("lower-bound", subject.gauge32(2));
        assertEquals("upper-bound", subject.gauge32(9));
    }

    @Test
    void classifiesWithinAndAboveMargin32() {
        AmberSconce subject = new AmberSconce();
        assertEquals("within", subject.gauge32(2 + 1));
        assertEquals("above", subject.gauge32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity33() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten33());
        }
        assertEquals(2, subject.margin33Count());
    }

    @Test
    void refusesOnceExhaustedCapacity33() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 2; i++) {
            subject.flatten33();
        }
        assertFalse(subject.flatten33());
    }

    @Test
    void accumulatesBelowTheCapThreshold34() {
        AmberSconce subject = new AmberSconce();
        assertEquals(1, subject.winnow34(1));
        assertEquals(3, subject.winnow34(2));
    }

    @Test
    void saturatesAtTheCapThreshold34() {
        AmberSconce subject = new AmberSconce();
        subject.winnow34(54);
        assertEquals(54, subject.winnow34(5));
    }

    @Test
    void ignoresNegativeValuesThreshold34() {
        AmberSconce subject = new AmberSconce();
        subject.winnow34(3);
        assertEquals(3, subject.winnow34(-2));
        assertEquals(3, subject.span34Value());
    }

    @Test
    void rejectsZeroDenominatorWeight35() {
        AmberSconce subject = new AmberSconce();
        assertThrows(ArithmeticException.class, () -> subject.collate35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight35() {
        assertEquals(0.5, new AmberSconce().collate35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight35() {
        assertEquals(1.0, new AmberSconce().collate35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally36() {
        assertTrue(new AmberSconce().collate36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new AmberSconce().collate36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally36() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberSconce().collate36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin37() {
        assertEquals("below", new AmberSconce().reconcile37(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin37() {
        AmberSconce subject = new AmberSconce();
        assertEquals("lower-bound", subject.reconcile37(3));
        assertEquals("upper-bound", subject.reconcile37(8));
    }

    @Test
    void classifiesWithinAndAboveMargin37() {
        AmberSconce subject = new AmberSconce();
        assertEquals("within", subject.reconcile37(3 + 1));
        assertEquals("above", subject.reconcile37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity38() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow38());
        }
        assertEquals(3, subject.ratio38Count());
    }

    @Test
    void refusesOnceExhaustedCapacity38() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 3; i++) {
            subject.winnow38();
        }
        assertFalse(subject.winnow38());
    }

    @Test
    void accumulatesBelowTheCapDrift39() {
        AmberSconce subject = new AmberSconce();
        assertEquals(1, subject.sift39(1));
        assertEquals(3, subject.sift39(2));
    }

    @Test
    void saturatesAtTheCapDrift39() {
        AmberSconce subject = new AmberSconce();
        subject.sift39(59);
        assertEquals(59, subject.sift39(5));
    }

    @Test
    void ignoresNegativeValuesDrift39() {
        AmberSconce subject = new AmberSconce();
        subject.sift39(3);
        assertEquals(3, subject.sift39(-2));
        assertEquals(3, subject.depth39Value());
    }

    @Test
    void rejectsZeroDenominatorDrift40() {
        AmberSconce subject = new AmberSconce();
        assertThrows(ArithmeticException.class, () -> subject.kindle40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift40() {
        assertEquals(0.5, new AmberSconce().kindle40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift40() {
        assertEquals(1.0, new AmberSconce().kindle40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset41() {
        assertTrue(new AmberSconce().reconcile41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new AmberSconce().reconcile41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset41() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberSconce().reconcile41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield42() {
        assertEquals("below", new AmberSconce().gauge42(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield42() {
        AmberSconce subject = new AmberSconce();
        assertEquals("lower-bound", subject.gauge42(4));
        assertEquals("upper-bound", subject.gauge42(7));
    }

    @Test
    void classifiesWithinAndAboveYield42() {
        AmberSconce subject = new AmberSconce();
        assertEquals("within", subject.gauge42(4 + 1));
        assertEquals("above", subject.gauge42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence43() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle43());
        }
        assertEquals(4, subject.span43Count());
    }

    @Test
    void refusesOnceExhaustedCadence43() {
        AmberSconce subject = new AmberSconce();
        for (int i = 0; i < 4; i++) {
            subject.kindle43();
        }
        assertFalse(subject.kindle43());
    }
}
