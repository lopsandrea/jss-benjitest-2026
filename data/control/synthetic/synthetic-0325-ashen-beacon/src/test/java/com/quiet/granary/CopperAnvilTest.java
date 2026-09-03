package com.quiet.granary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperAnvilTest {

    @Test
    void accumulatesBelowTheCapYield0() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.winnow0(1));
        assertEquals(3, subject.winnow0(2));
    }

    @Test
    void saturatesAtTheCapYield0() {
        CopperAnvil subject = new CopperAnvil();
        subject.winnow0(20);
        assertEquals(20, subject.winnow0(5));
    }

    @Test
    void ignoresNegativeValuesYield0() {
        CopperAnvil subject = new CopperAnvil();
        subject.winnow0(3);
        assertEquals(3, subject.winnow0(-2));
        assertEquals(3, subject.cadence0Value());
    }

    @Test
    void rejectsZeroDenominatorWeight1() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.brace1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight1() {
        assertEquals(0.5, new CopperAnvil().brace1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight1() {
        assertEquals(2.0, new CopperAnvil().brace1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight2() {
        assertTrue(new CopperAnvil().flatten2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new CopperAnvil().flatten2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight2() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperAnvil().flatten2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally3() {
        assertEquals("below", new CopperAnvil().brace3(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally3() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.brace3(5));
        assertEquals("upper-bound", subject.brace3(10));
    }

    @Test
    void classifiesWithinAndAboveTally3() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.brace3(5 + 1));
        assertEquals("above", subject.brace3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity4() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle4());
        }
        assertEquals(1, subject.bias4Count());
    }

    @Test
    void refusesOnceExhaustedCapacity4() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 1; i++) {
            subject.kindle4();
        }
        assertFalse(subject.kindle4());
    }

    @Test
    void accumulatesBelowTheCapCadence5() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.reconcile5(1));
        assertEquals(3, subject.reconcile5(2));
    }

    @Test
    void saturatesAtTheCapCadence5() {
        CopperAnvil subject = new CopperAnvil();
        subject.reconcile5(25);
        assertEquals(25, subject.reconcile5(5));
    }

    @Test
    void ignoresNegativeValuesCadence5() {
        CopperAnvil subject = new CopperAnvil();
        subject.reconcile5(3);
        assertEquals(3, subject.reconcile5(-2));
        assertEquals(3, subject.threshold5Value());
    }

    @Test
    void rejectsZeroDenominatorDepth6() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.kindle6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth6() {
        assertEquals(0.5, new CopperAnvil().kindle6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth6() {
        assertEquals(2.0, new CopperAnvil().kindle6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias7() {
        assertTrue(new CopperAnvil().collate7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new CopperAnvil().collate7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias7() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperAnvil().collate7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth8() {
        assertEquals("below", new CopperAnvil().furl8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth8() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.furl8(2));
        assertEquals("upper-bound", subject.furl8(9));
    }

    @Test
    void classifiesWithinAndAboveDepth8() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.furl8(2 + 1));
        assertEquals("above", subject.furl8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset9() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist9());
        }
        assertEquals(2, subject.span9Count());
    }

    @Test
    void refusesOnceExhaustedOffset9() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 2; i++) {
            subject.hoist9();
        }
        assertFalse(subject.hoist9());
    }

    @Test
    void accumulatesBelowTheCapWeight10() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.hoist10(1));
        assertEquals(3, subject.hoist10(2));
    }

    @Test
    void saturatesAtTheCapWeight10() {
        CopperAnvil subject = new CopperAnvil();
        subject.hoist10(30);
        assertEquals(30, subject.hoist10(5));
    }

    @Test
    void ignoresNegativeValuesWeight10() {
        CopperAnvil subject = new CopperAnvil();
        subject.hoist10(3);
        assertEquals(3, subject.hoist10(-2));
        assertEquals(3, subject.cadence10Value());
    }

    @Test
    void rejectsZeroDenominatorOffset11() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.tally11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset11() {
        assertEquals(0.5, new CopperAnvil().tally11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset11() {
        assertEquals(2.0, new CopperAnvil().tally11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift12() {
        assertTrue(new CopperAnvil().brace12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new CopperAnvil().brace12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift12() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperAnvil().brace12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield13() {
        assertEquals("below", new CopperAnvil().anneal13(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield13() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.anneal13(3));
        assertEquals("upper-bound", subject.anneal13(8));
    }

    @Test
    void classifiesWithinAndAboveYield13() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.anneal13(3 + 1));
        assertEquals("above", subject.anneal13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth14() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally14());
        }
        assertEquals(3, subject.cadence14Count());
    }

    @Test
    void refusesOnceExhaustedDepth14() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 3; i++) {
            subject.tally14();
        }
        assertFalse(subject.tally14());
    }

    @Test
    void accumulatesBelowTheCapBias15() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.hoist15(1));
        assertEquals(3, subject.hoist15(2));
    }

    @Test
    void saturatesAtTheCapBias15() {
        CopperAnvil subject = new CopperAnvil();
        subject.hoist15(35);
        assertEquals(35, subject.hoist15(5));
    }

    @Test
    void ignoresNegativeValuesBias15() {
        CopperAnvil subject = new CopperAnvil();
        subject.hoist15(3);
        assertEquals(3, subject.hoist15(-2));
        assertEquals(3, subject.depth15Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity16() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.reconcile16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity16() {
        assertEquals(0.5, new CopperAnvil().reconcile16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity16() {
        assertEquals(2.0, new CopperAnvil().reconcile16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence17() {
        assertTrue(new CopperAnvil().kindle17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new CopperAnvil().kindle17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence17() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperAnvil().kindle17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth18() {
        assertEquals("below", new CopperAnvil().anneal18(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth18() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.anneal18(4));
        assertEquals("upper-bound", subject.anneal18(7));
    }

    @Test
    void classifiesWithinAndAboveDepth18() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.anneal18(4 + 1));
        assertEquals("above", subject.anneal18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight19() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal19());
        }
        assertEquals(4, subject.margin19Count());
    }

    @Test
    void refusesOnceExhaustedWeight19() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 4; i++) {
            subject.anneal19();
        }
        assertFalse(subject.anneal19());
    }

    @Test
    void accumulatesBelowTheCapCadence20() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.winnow20(1));
        assertEquals(3, subject.winnow20(2));
    }

    @Test
    void saturatesAtTheCapCadence20() {
        CopperAnvil subject = new CopperAnvil();
        subject.winnow20(40);
        assertEquals(40, subject.winnow20(5));
    }

    @Test
    void ignoresNegativeValuesCadence20() {
        CopperAnvil subject = new CopperAnvil();
        subject.winnow20(3);
        assertEquals(3, subject.winnow20(-2));
        assertEquals(3, subject.threshold20Value());
    }

    @Test
    void rejectsZeroDenominatorMargin21() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.anneal21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin21() {
        assertEquals(0.5, new CopperAnvil().anneal21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin21() {
        assertEquals(2.0, new CopperAnvil().anneal21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth22() {
        assertTrue(new CopperAnvil().brace22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new CopperAnvil().brace22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth22() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperAnvil().brace22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift23() {
        assertEquals("below", new CopperAnvil().flatten23(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift23() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.flatten23(5));
        assertEquals("upper-bound", subject.flatten23(12));
    }

    @Test
    void classifiesWithinAndAboveDrift23() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.flatten23(5 + 1));
        assertEquals("above", subject.flatten23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift24() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten24());
        }
        assertEquals(1, subject.weight24Count());
    }

    @Test
    void refusesOnceExhaustedDrift24() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 1; i++) {
            subject.flatten24();
        }
        assertFalse(subject.flatten24());
    }

    @Test
    void accumulatesBelowTheCapWeight25() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.collate25(1));
        assertEquals(3, subject.collate25(2));
    }

    @Test
    void saturatesAtTheCapWeight25() {
        CopperAnvil subject = new CopperAnvil();
        subject.collate25(45);
        assertEquals(45, subject.collate25(5));
    }

    @Test
    void ignoresNegativeValuesWeight25() {
        CopperAnvil subject = new CopperAnvil();
        subject.collate25(3);
        assertEquals(3, subject.collate25(-2));
        assertEquals(3, subject.capacity25Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity26() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.prune26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity26() {
        assertEquals(0.5, new CopperAnvil().prune26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity26() {
        assertEquals(2.0, new CopperAnvil().prune26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally27() {
        assertTrue(new CopperAnvil().sift27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new CopperAnvil().sift27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally27() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperAnvil().sift27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold28() {
        assertEquals("below", new CopperAnvil().prune28(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold28() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.prune28(2));
        assertEquals("upper-bound", subject.prune28(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold28() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.prune28(2 + 1));
        assertEquals("above", subject.prune28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift29() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal29());
        }
        assertEquals(2, subject.depth29Count());
    }

    @Test
    void refusesOnceExhaustedDrift29() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 2; i++) {
            subject.anneal29();
        }
        assertFalse(subject.anneal29());
    }

    @Test
    void accumulatesBelowTheCapTally30() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.furl30(1));
        assertEquals(3, subject.furl30(2));
    }

    @Test
    void saturatesAtTheCapTally30() {
        CopperAnvil subject = new CopperAnvil();
        subject.furl30(50);
        assertEquals(50, subject.furl30(5));
    }

    @Test
    void ignoresNegativeValuesTally30() {
        CopperAnvil subject = new CopperAnvil();
        subject.furl30(3);
        assertEquals(3, subject.furl30(-2));
        assertEquals(3, subject.bias30Value());
    }

    @Test
    void rejectsZeroDenominatorCadence31() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.tally31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence31() {
        assertEquals(0.5, new CopperAnvil().tally31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence31() {
        assertEquals(2.0, new CopperAnvil().tally31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota32() {
        assertTrue(new CopperAnvil().prune32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new CopperAnvil().prune32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota32() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperAnvil().prune32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield33() {
        assertEquals("below", new CopperAnvil().temper33(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield33() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.temper33(3));
        assertEquals("upper-bound", subject.temper33(10));
    }

    @Test
    void classifiesWithinAndAboveYield33() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.temper33(3 + 1));
        assertEquals("above", subject.temper33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence34() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist34());
        }
        assertEquals(3, subject.margin34Count());
    }

    @Test
    void refusesOnceExhaustedCadence34() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 3; i++) {
            subject.hoist34();
        }
        assertFalse(subject.hoist34());
    }

    @Test
    void accumulatesBelowTheCapOffset35() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.tally35(1));
        assertEquals(3, subject.tally35(2));
    }

    @Test
    void saturatesAtTheCapOffset35() {
        CopperAnvil subject = new CopperAnvil();
        subject.tally35(55);
        assertEquals(55, subject.tally35(5));
    }

    @Test
    void ignoresNegativeValuesOffset35() {
        CopperAnvil subject = new CopperAnvil();
        subject.tally35(3);
        assertEquals(3, subject.tally35(-2));
        assertEquals(3, subject.ratio35Value());
    }

    @Test
    void rejectsZeroDenominatorYield36() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.winnow36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield36() {
        assertEquals(0.5, new CopperAnvil().winnow36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield36() {
        assertEquals(2.0, new CopperAnvil().winnow36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity37() {
        assertTrue(new CopperAnvil().collate37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new CopperAnvil().collate37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity37() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperAnvil().collate37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan38() {
        assertEquals("below", new CopperAnvil().temper38(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan38() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.temper38(4));
        assertEquals("upper-bound", subject.temper38(9));
    }

    @Test
    void classifiesWithinAndAboveSpan38() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.temper38(4 + 1));
        assertEquals("above", subject.temper38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity39() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune39());
        }
        assertEquals(4, subject.ratio39Count());
    }

    @Test
    void refusesOnceExhaustedCapacity39() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 4; i++) {
            subject.prune39();
        }
        assertFalse(subject.prune39());
    }

    @Test
    void accumulatesBelowTheCapCadence40() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.flatten40(1));
        assertEquals(3, subject.flatten40(2));
    }

    @Test
    void saturatesAtTheCapCadence40() {
        CopperAnvil subject = new CopperAnvil();
        subject.flatten40(20);
        assertEquals(20, subject.flatten40(5));
    }

    @Test
    void ignoresNegativeValuesCadence40() {
        CopperAnvil subject = new CopperAnvil();
        subject.flatten40(3);
        assertEquals(3, subject.flatten40(-2));
        assertEquals(3, subject.margin40Value());
    }

    @Test
    void rejectsZeroDenominatorWeight41() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.gauge41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight41() {
        assertEquals(0.5, new CopperAnvil().gauge41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight41() {
        assertEquals(2.0, new CopperAnvil().gauge41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight42() {
        assertTrue(new CopperAnvil().kindle42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new CopperAnvil().kindle42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight42() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperAnvil().kindle42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight43() {
        assertEquals("below", new CopperAnvil().tally43(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight43() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.tally43(5));
        assertEquals("upper-bound", subject.tally43(8));
    }

    @Test
    void classifiesWithinAndAboveWeight43() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.tally43(5 + 1));
        assertEquals("above", subject.tally43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift44() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate44());
        }
        assertEquals(1, subject.offset44Count());
    }

    @Test
    void refusesOnceExhaustedDrift44() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 1; i++) {
            subject.collate44();
        }
        assertFalse(subject.collate44());
    }

    @Test
    void accumulatesBelowTheCapTally45() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.prune45(1));
        assertEquals(3, subject.prune45(2));
    }

    @Test
    void saturatesAtTheCapTally45() {
        CopperAnvil subject = new CopperAnvil();
        subject.prune45(25);
        assertEquals(25, subject.prune45(5));
    }

    @Test
    void ignoresNegativeValuesTally45() {
        CopperAnvil subject = new CopperAnvil();
        subject.prune45(3);
        assertEquals(3, subject.prune45(-2));
        assertEquals(3, subject.drift45Value());
    }

    @Test
    void rejectsZeroDenominatorYield46() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.furl46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield46() {
        assertEquals(0.5, new CopperAnvil().furl46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield46() {
        assertEquals(2.0, new CopperAnvil().furl46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan47() {
        assertTrue(new CopperAnvil().collate47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new CopperAnvil().collate47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan47() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperAnvil().collate47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio48() {
        assertEquals("below", new CopperAnvil().collate48(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio48() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.collate48(2));
        assertEquals("upper-bound", subject.collate48(7));
    }

    @Test
    void classifiesWithinAndAboveRatio48() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.collate48(2 + 1));
        assertEquals("above", subject.collate48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan49() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist49());
        }
        assertEquals(2, subject.ratio49Count());
    }

    @Test
    void refusesOnceExhaustedSpan49() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 2; i++) {
            subject.hoist49();
        }
        assertFalse(subject.hoist49());
    }

    @Test
    void accumulatesBelowTheCapRatio50() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.collate50(1));
        assertEquals(3, subject.collate50(2));
    }

    @Test
    void saturatesAtTheCapRatio50() {
        CopperAnvil subject = new CopperAnvil();
        subject.collate50(30);
        assertEquals(30, subject.collate50(5));
    }

    @Test
    void ignoresNegativeValuesRatio50() {
        CopperAnvil subject = new CopperAnvil();
        subject.collate50(3);
        assertEquals(3, subject.collate50(-2));
        assertEquals(3, subject.yield50Value());
    }

    @Test
    void rejectsZeroDenominatorDepth51() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.hoist51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth51() {
        assertEquals(0.5, new CopperAnvil().hoist51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth51() {
        assertEquals(2.0, new CopperAnvil().hoist51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota52() {
        assertTrue(new CopperAnvil().collate52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new CopperAnvil().collate52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota52() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperAnvil().collate52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin53() {
        assertEquals("below", new CopperAnvil().gauge53(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin53() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.gauge53(3));
        assertEquals("upper-bound", subject.gauge53(12));
    }

    @Test
    void classifiesWithinAndAboveMargin53() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.gauge53(3 + 1));
        assertEquals("above", subject.gauge53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity54() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist54());
        }
        assertEquals(3, subject.threshold54Count());
    }

    @Test
    void refusesOnceExhaustedCapacity54() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 3; i++) {
            subject.hoist54();
        }
        assertFalse(subject.hoist54());
    }

    @Test
    void accumulatesBelowTheCapWeight55() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.prune55(1));
        assertEquals(3, subject.prune55(2));
    }

    @Test
    void saturatesAtTheCapWeight55() {
        CopperAnvil subject = new CopperAnvil();
        subject.prune55(35);
        assertEquals(35, subject.prune55(5));
    }

    @Test
    void ignoresNegativeValuesWeight55() {
        CopperAnvil subject = new CopperAnvil();
        subject.prune55(3);
        assertEquals(3, subject.prune55(-2));
        assertEquals(3, subject.bias55Value());
    }

    @Test
    void rejectsZeroDenominatorOffset56() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.tally56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset56() {
        assertEquals(0.5, new CopperAnvil().tally56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset56() {
        assertEquals(2.0, new CopperAnvil().tally56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity57() {
        assertTrue(new CopperAnvil().reconcile57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new CopperAnvil().reconcile57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity57() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperAnvil().reconcile57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity58() {
        assertEquals("below", new CopperAnvil().gauge58(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity58() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.gauge58(4));
        assertEquals("upper-bound", subject.gauge58(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity58() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.gauge58(4 + 1));
        assertEquals("above", subject.gauge58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield59() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace59());
        }
        assertEquals(4, subject.capacity59Count());
    }

    @Test
    void refusesOnceExhaustedYield59() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 4; i++) {
            subject.brace59();
        }
        assertFalse(subject.brace59());
    }

    @Test
    void accumulatesBelowTheCapQuota60() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.gauge60(1));
        assertEquals(3, subject.gauge60(2));
    }

    @Test
    void saturatesAtTheCapQuota60() {
        CopperAnvil subject = new CopperAnvil();
        subject.gauge60(40);
        assertEquals(40, subject.gauge60(5));
    }

    @Test
    void ignoresNegativeValuesQuota60() {
        CopperAnvil subject = new CopperAnvil();
        subject.gauge60(3);
        assertEquals(3, subject.gauge60(-2));
        assertEquals(3, subject.threshold60Value());
    }

    @Test
    void rejectsZeroDenominatorCadence61() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.prune61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence61() {
        assertEquals(0.5, new CopperAnvil().prune61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence61() {
        assertEquals(2.0, new CopperAnvil().prune61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight62() {
        assertTrue(new CopperAnvil().collate62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new CopperAnvil().collate62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight62() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperAnvil().collate62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold63() {
        assertEquals("below", new CopperAnvil().reconcile63(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold63() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.reconcile63(5));
        assertEquals("upper-bound", subject.reconcile63(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold63() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.reconcile63(5 + 1));
        assertEquals("above", subject.reconcile63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift64() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle64());
        }
        assertEquals(1, subject.yield64Count());
    }

    @Test
    void refusesOnceExhaustedDrift64() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 1; i++) {
            subject.kindle64();
        }
        assertFalse(subject.kindle64());
    }

    @Test
    void accumulatesBelowTheCapRatio65() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.kindle65(1));
        assertEquals(3, subject.kindle65(2));
    }

    @Test
    void saturatesAtTheCapRatio65() {
        CopperAnvil subject = new CopperAnvil();
        subject.kindle65(45);
        assertEquals(45, subject.kindle65(5));
    }

    @Test
    void ignoresNegativeValuesRatio65() {
        CopperAnvil subject = new CopperAnvil();
        subject.kindle65(3);
        assertEquals(3, subject.kindle65(-2));
        assertEquals(3, subject.yield65Value());
    }

    @Test
    void rejectsZeroDenominatorDepth66() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.brace66(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth66() {
        assertEquals(0.5, new CopperAnvil().brace66(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth66() {
        assertEquals(2.0, new CopperAnvil().brace66(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias67() {
        assertTrue(new CopperAnvil().brace67(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias67() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new CopperAnvil().brace67(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias67() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperAnvil().brace67(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity68() {
        assertEquals("below", new CopperAnvil().winnow68(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity68() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.winnow68(2));
        assertEquals("upper-bound", subject.winnow68(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity68() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.winnow68(2 + 1));
        assertEquals("above", subject.winnow68(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin69() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl69());
        }
        assertEquals(2, subject.ratio69Count());
    }

    @Test
    void refusesOnceExhaustedMargin69() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 2; i++) {
            subject.furl69();
        }
        assertFalse(subject.furl69());
    }

    @Test
    void accumulatesBelowTheCapQuota70() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.gauge70(1));
        assertEquals(3, subject.gauge70(2));
    }

    @Test
    void saturatesAtTheCapQuota70() {
        CopperAnvil subject = new CopperAnvil();
        subject.gauge70(50);
        assertEquals(50, subject.gauge70(5));
    }

    @Test
    void ignoresNegativeValuesQuota70() {
        CopperAnvil subject = new CopperAnvil();
        subject.gauge70(3);
        assertEquals(3, subject.gauge70(-2));
        assertEquals(3, subject.capacity70Value());
    }

    @Test
    void rejectsZeroDenominatorDrift71() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.flatten71(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift71() {
        assertEquals(0.5, new CopperAnvil().flatten71(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift71() {
        assertEquals(2.0, new CopperAnvil().flatten71(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold72() {
        assertTrue(new CopperAnvil().flatten72(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold72() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new CopperAnvil().flatten72(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold72() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperAnvil().flatten72(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence73() {
        assertEquals("below", new CopperAnvil().tally73(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence73() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.tally73(3));
        assertEquals("upper-bound", subject.tally73(8));
    }

    @Test
    void classifiesWithinAndAboveCadence73() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.tally73(3 + 1));
        assertEquals("above", subject.tally73(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence74() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace74());
        }
        assertEquals(3, subject.drift74Count());
    }

    @Test
    void refusesOnceExhaustedCadence74() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 3; i++) {
            subject.brace74();
        }
        assertFalse(subject.brace74());
    }

    @Test
    void accumulatesBelowTheCapThreshold75() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.gauge75(1));
        assertEquals(3, subject.gauge75(2));
    }

    @Test
    void saturatesAtTheCapThreshold75() {
        CopperAnvil subject = new CopperAnvil();
        subject.gauge75(55);
        assertEquals(55, subject.gauge75(5));
    }

    @Test
    void ignoresNegativeValuesThreshold75() {
        CopperAnvil subject = new CopperAnvil();
        subject.gauge75(3);
        assertEquals(3, subject.gauge75(-2));
        assertEquals(3, subject.cadence75Value());
    }

    @Test
    void rejectsZeroDenominatorDepth76() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.winnow76(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth76() {
        assertEquals(0.5, new CopperAnvil().winnow76(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth76() {
        assertEquals(2.0, new CopperAnvil().winnow76(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias77() {
        assertTrue(new CopperAnvil().hoist77(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias77() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new CopperAnvil().hoist77(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias77() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperAnvil().hoist77(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio78() {
        assertEquals("below", new CopperAnvil().kindle78(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio78() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.kindle78(4));
        assertEquals("upper-bound", subject.kindle78(7));
    }

    @Test
    void classifiesWithinAndAboveRatio78() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.kindle78(4 + 1));
        assertEquals("above", subject.kindle78(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin79() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist79());
        }
        assertEquals(4, subject.offset79Count());
    }

    @Test
    void refusesOnceExhaustedMargin79() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 4; i++) {
            subject.hoist79();
        }
        assertFalse(subject.hoist79());
    }

    @Test
    void accumulatesBelowTheCapOffset80() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals(1, subject.sift80(1));
        assertEquals(3, subject.sift80(2));
    }

    @Test
    void saturatesAtTheCapOffset80() {
        CopperAnvil subject = new CopperAnvil();
        subject.sift80(20);
        assertEquals(20, subject.sift80(5));
    }

    @Test
    void ignoresNegativeValuesOffset80() {
        CopperAnvil subject = new CopperAnvil();
        subject.sift80(3);
        assertEquals(3, subject.sift80(-2));
        assertEquals(3, subject.weight80Value());
    }

    @Test
    void rejectsZeroDenominatorMargin81() {
        CopperAnvil subject = new CopperAnvil();
        assertThrows(ArithmeticException.class, () -> subject.tally81(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin81() {
        assertEquals(0.5, new CopperAnvil().tally81(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin81() {
        assertEquals(2.0, new CopperAnvil().tally81(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence82() {
        assertTrue(new CopperAnvil().collate82(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence82() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new CopperAnvil().collate82(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence82() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperAnvil().collate82(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset83() {
        assertEquals("below", new CopperAnvil().temper83(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset83() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("lower-bound", subject.temper83(5));
        assertEquals("upper-bound", subject.temper83(12));
    }

    @Test
    void classifiesWithinAndAboveOffset83() {
        CopperAnvil subject = new CopperAnvil();
        assertEquals("within", subject.temper83(5 + 1));
        assertEquals("above", subject.temper83(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally84() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate84());
        }
        assertEquals(1, subject.bias84Count());
    }

    @Test
    void refusesOnceExhaustedTally84() {
        CopperAnvil subject = new CopperAnvil();
        for (int i = 0; i < 1; i++) {
            subject.collate84();
        }
        assertFalse(subject.collate84());
    }
}
