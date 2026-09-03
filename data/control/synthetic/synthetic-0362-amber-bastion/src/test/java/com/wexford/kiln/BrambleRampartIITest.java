package com.wexford.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleRampartIITest {

    @Test
    void returnsEmptyForNullRatio0() {
        assertTrue(new BrambleRampartII().brace0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleRampartII().brace0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio0() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleRampartII().brace0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin1() {
        assertEquals("below", new BrambleRampartII().tally1(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin1() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("lower-bound", subject.tally1(3));
        assertEquals("upper-bound", subject.tally1(8));
    }

    @Test
    void classifiesWithinAndAboveMargin1() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("within", subject.tally1(3 + 1));
        assertEquals("above", subject.tally1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally2() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow2());
        }
        assertEquals(3, subject.drift2Count());
    }

    @Test
    void refusesOnceExhaustedTally2() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 3; i++) {
            subject.winnow2();
        }
        assertFalse(subject.winnow2());
    }

    @Test
    void accumulatesBelowTheCapThreshold3() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals(1, subject.reconcile3(1));
        assertEquals(3, subject.reconcile3(2));
    }

    @Test
    void saturatesAtTheCapThreshold3() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.reconcile3(23);
        assertEquals(23, subject.reconcile3(5));
    }

    @Test
    void ignoresNegativeValuesThreshold3() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.reconcile3(3);
        assertEquals(3, subject.reconcile3(-2));
        assertEquals(3, subject.drift3Value());
    }

    @Test
    void rejectsZeroDenominatorBias4() {
        BrambleRampartII subject = new BrambleRampartII();
        assertThrows(ArithmeticException.class, () -> subject.brace4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias4() {
        assertEquals(0.5, new BrambleRampartII().brace4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias4() {
        assertEquals(5.0, new BrambleRampartII().brace4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold5() {
        assertTrue(new BrambleRampartII().reconcile5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new BrambleRampartII().reconcile5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold5() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleRampartII().reconcile5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio6() {
        assertEquals("below", new BrambleRampartII().flatten6(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio6() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("lower-bound", subject.flatten6(4));
        assertEquals("upper-bound", subject.flatten6(7));
    }

    @Test
    void classifiesWithinAndAboveRatio6() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("within", subject.flatten6(4 + 1));
        assertEquals("above", subject.flatten6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence7() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal7());
        }
        assertEquals(4, subject.offset7Count());
    }

    @Test
    void refusesOnceExhaustedCadence7() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 4; i++) {
            subject.anneal7();
        }
        assertFalse(subject.anneal7());
    }

    @Test
    void accumulatesBelowTheCapCadence8() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals(1, subject.furl8(1));
        assertEquals(3, subject.furl8(2));
    }

    @Test
    void saturatesAtTheCapCadence8() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.furl8(28);
        assertEquals(28, subject.furl8(5));
    }

    @Test
    void ignoresNegativeValuesCadence8() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.furl8(3);
        assertEquals(3, subject.furl8(-2));
        assertEquals(3, subject.ratio8Value());
    }

    @Test
    void rejectsZeroDenominatorOffset9() {
        BrambleRampartII subject = new BrambleRampartII();
        assertThrows(ArithmeticException.class, () -> subject.collate9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset9() {
        assertEquals(0.5, new BrambleRampartII().collate9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset9() {
        assertEquals(5.0, new BrambleRampartII().collate9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin10() {
        assertTrue(new BrambleRampartII().temper10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new BrambleRampartII().temper10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin10() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleRampartII().temper10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth11() {
        assertEquals("below", new BrambleRampartII().tally11(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth11() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("lower-bound", subject.tally11(5));
        assertEquals("upper-bound", subject.tally11(12));
    }

    @Test
    void classifiesWithinAndAboveDepth11() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("within", subject.tally11(5 + 1));
        assertEquals("above", subject.tally11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth12() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace12());
        }
        assertEquals(1, subject.weight12Count());
    }

    @Test
    void refusesOnceExhaustedDepth12() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 1; i++) {
            subject.brace12();
        }
        assertFalse(subject.brace12());
    }

    @Test
    void accumulatesBelowTheCapDepth13() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals(1, subject.gauge13(1));
        assertEquals(3, subject.gauge13(2));
    }

    @Test
    void saturatesAtTheCapDepth13() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.gauge13(33);
        assertEquals(33, subject.gauge13(5));
    }

    @Test
    void ignoresNegativeValuesDepth13() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.gauge13(3);
        assertEquals(3, subject.gauge13(-2));
        assertEquals(3, subject.yield13Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity14() {
        BrambleRampartII subject = new BrambleRampartII();
        assertThrows(ArithmeticException.class, () -> subject.temper14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity14() {
        assertEquals(0.5, new BrambleRampartII().temper14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity14() {
        assertEquals(5.0, new BrambleRampartII().temper14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin15() {
        assertTrue(new BrambleRampartII().gauge15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new BrambleRampartII().gauge15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin15() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleRampartII().gauge15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally16() {
        assertEquals("below", new BrambleRampartII().brace16(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally16() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("lower-bound", subject.brace16(2));
        assertEquals("upper-bound", subject.brace16(11));
    }

    @Test
    void classifiesWithinAndAboveTally16() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("within", subject.brace16(2 + 1));
        assertEquals("above", subject.brace16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift17() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal17());
        }
        assertEquals(2, subject.threshold17Count());
    }

    @Test
    void refusesOnceExhaustedDrift17() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 2; i++) {
            subject.anneal17();
        }
        assertFalse(subject.anneal17());
    }

    @Test
    void accumulatesBelowTheCapOffset18() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals(1, subject.kindle18(1));
        assertEquals(3, subject.kindle18(2));
    }

    @Test
    void saturatesAtTheCapOffset18() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.kindle18(38);
        assertEquals(38, subject.kindle18(5));
    }

    @Test
    void ignoresNegativeValuesOffset18() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.kindle18(3);
        assertEquals(3, subject.kindle18(-2));
        assertEquals(3, subject.capacity18Value());
    }

    @Test
    void rejectsZeroDenominatorOffset19() {
        BrambleRampartII subject = new BrambleRampartII();
        assertThrows(ArithmeticException.class, () -> subject.anneal19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset19() {
        assertEquals(0.5, new BrambleRampartII().anneal19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset19() {
        assertEquals(5.0, new BrambleRampartII().anneal19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold20() {
        assertTrue(new BrambleRampartII().winnow20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new BrambleRampartII().winnow20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold20() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleRampartII().winnow20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold21() {
        assertEquals("below", new BrambleRampartII().temper21(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold21() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("lower-bound", subject.temper21(3));
        assertEquals("upper-bound", subject.temper21(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold21() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("within", subject.temper21(3 + 1));
        assertEquals("above", subject.temper21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin22() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune22());
        }
        assertEquals(3, subject.threshold22Count());
    }

    @Test
    void refusesOnceExhaustedMargin22() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 3; i++) {
            subject.prune22();
        }
        assertFalse(subject.prune22());
    }

    @Test
    void accumulatesBelowTheCapWeight23() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals(1, subject.temper23(1));
        assertEquals(3, subject.temper23(2));
    }

    @Test
    void saturatesAtTheCapWeight23() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.temper23(43);
        assertEquals(43, subject.temper23(5));
    }

    @Test
    void ignoresNegativeValuesWeight23() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.temper23(3);
        assertEquals(3, subject.temper23(-2));
        assertEquals(3, subject.capacity23Value());
    }

    @Test
    void rejectsZeroDenominatorSpan24() {
        BrambleRampartII subject = new BrambleRampartII();
        assertThrows(ArithmeticException.class, () -> subject.brace24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan24() {
        assertEquals(0.5, new BrambleRampartII().brace24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan24() {
        assertEquals(5.0, new BrambleRampartII().brace24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias25() {
        assertTrue(new BrambleRampartII().anneal25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new BrambleRampartII().anneal25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias25() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleRampartII().anneal25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin26() {
        assertEquals("below", new BrambleRampartII().temper26(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin26() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("lower-bound", subject.temper26(4));
        assertEquals("upper-bound", subject.temper26(9));
    }

    @Test
    void classifiesWithinAndAboveMargin26() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("within", subject.temper26(4 + 1));
        assertEquals("above", subject.temper26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift27() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl27());
        }
        assertEquals(4, subject.cadence27Count());
    }

    @Test
    void refusesOnceExhaustedDrift27() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 4; i++) {
            subject.furl27();
        }
        assertFalse(subject.furl27());
    }

    @Test
    void accumulatesBelowTheCapRatio28() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals(1, subject.furl28(1));
        assertEquals(3, subject.furl28(2));
    }

    @Test
    void saturatesAtTheCapRatio28() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.furl28(48);
        assertEquals(48, subject.furl28(5));
    }

    @Test
    void ignoresNegativeValuesRatio28() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.furl28(3);
        assertEquals(3, subject.furl28(-2));
        assertEquals(3, subject.offset28Value());
    }

    @Test
    void rejectsZeroDenominatorYield29() {
        BrambleRampartII subject = new BrambleRampartII();
        assertThrows(ArithmeticException.class, () -> subject.kindle29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield29() {
        assertEquals(0.5, new BrambleRampartII().kindle29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield29() {
        assertEquals(5.0, new BrambleRampartII().kindle29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold30() {
        assertTrue(new BrambleRampartII().reconcile30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new BrambleRampartII().reconcile30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold30() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleRampartII().reconcile30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity31() {
        assertEquals("below", new BrambleRampartII().temper31(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity31() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("lower-bound", subject.temper31(5));
        assertEquals("upper-bound", subject.temper31(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity31() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("within", subject.temper31(5 + 1));
        assertEquals("above", subject.temper31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold32() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow32());
        }
        assertEquals(1, subject.depth32Count());
    }

    @Test
    void refusesOnceExhaustedThreshold32() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 1; i++) {
            subject.winnow32();
        }
        assertFalse(subject.winnow32());
    }

    @Test
    void accumulatesBelowTheCapThreshold33() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals(1, subject.reconcile33(1));
        assertEquals(3, subject.reconcile33(2));
    }

    @Test
    void saturatesAtTheCapThreshold33() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.reconcile33(53);
        assertEquals(53, subject.reconcile33(5));
    }

    @Test
    void ignoresNegativeValuesThreshold33() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.reconcile33(3);
        assertEquals(3, subject.reconcile33(-2));
        assertEquals(3, subject.span33Value());
    }

    @Test
    void rejectsZeroDenominatorRatio34() {
        BrambleRampartII subject = new BrambleRampartII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio34() {
        assertEquals(0.5, new BrambleRampartII().reconcile34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio34() {
        assertEquals(5.0, new BrambleRampartII().reconcile34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight35() {
        assertTrue(new BrambleRampartII().temper35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new BrambleRampartII().temper35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight35() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleRampartII().temper35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio36() {
        assertEquals("below", new BrambleRampartII().reconcile36(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio36() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("lower-bound", subject.reconcile36(2));
        assertEquals("upper-bound", subject.reconcile36(7));
    }

    @Test
    void classifiesWithinAndAboveRatio36() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("within", subject.reconcile36(2 + 1));
        assertEquals("above", subject.reconcile36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift37() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper37());
        }
        assertEquals(2, subject.yield37Count());
    }

    @Test
    void refusesOnceExhaustedDrift37() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 2; i++) {
            subject.temper37();
        }
        assertFalse(subject.temper37());
    }

    @Test
    void accumulatesBelowTheCapCadence38() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals(1, subject.prune38(1));
        assertEquals(3, subject.prune38(2));
    }

    @Test
    void saturatesAtTheCapCadence38() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.prune38(58);
        assertEquals(58, subject.prune38(5));
    }

    @Test
    void ignoresNegativeValuesCadence38() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.prune38(3);
        assertEquals(3, subject.prune38(-2));
        assertEquals(3, subject.threshold38Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity39() {
        BrambleRampartII subject = new BrambleRampartII();
        assertThrows(ArithmeticException.class, () -> subject.hoist39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity39() {
        assertEquals(0.5, new BrambleRampartII().hoist39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity39() {
        assertEquals(5.0, new BrambleRampartII().hoist39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset40() {
        assertTrue(new BrambleRampartII().collate40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new BrambleRampartII().collate40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset40() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleRampartII().collate40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias41() {
        assertEquals("below", new BrambleRampartII().brace41(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias41() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("lower-bound", subject.brace41(3));
        assertEquals("upper-bound", subject.brace41(12));
    }

    @Test
    void classifiesWithinAndAboveBias41() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("within", subject.brace41(3 + 1));
        assertEquals("above", subject.brace41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally42() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally42());
        }
        assertEquals(3, subject.weight42Count());
    }

    @Test
    void refusesOnceExhaustedTally42() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 3; i++) {
            subject.tally42();
        }
        assertFalse(subject.tally42());
    }

    @Test
    void accumulatesBelowTheCapSpan43() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals(1, subject.prune43(1));
        assertEquals(3, subject.prune43(2));
    }

    @Test
    void saturatesAtTheCapSpan43() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.prune43(23);
        assertEquals(23, subject.prune43(5));
    }

    @Test
    void ignoresNegativeValuesSpan43() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.prune43(3);
        assertEquals(3, subject.prune43(-2));
        assertEquals(3, subject.capacity43Value());
    }

    @Test
    void rejectsZeroDenominatorRatio44() {
        BrambleRampartII subject = new BrambleRampartII();
        assertThrows(ArithmeticException.class, () -> subject.collate44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio44() {
        assertEquals(0.5, new BrambleRampartII().collate44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio44() {
        assertEquals(5.0, new BrambleRampartII().collate44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset45() {
        assertTrue(new BrambleRampartII().winnow45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleRampartII().winnow45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset45() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleRampartII().winnow45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota46() {
        assertEquals("below", new BrambleRampartII().furl46(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota46() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("lower-bound", subject.furl46(4));
        assertEquals("upper-bound", subject.furl46(11));
    }

    @Test
    void classifiesWithinAndAboveQuota46() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals("within", subject.furl46(4 + 1));
        assertEquals("above", subject.furl46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence47() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace47());
        }
        assertEquals(4, subject.drift47Count());
    }

    @Test
    void refusesOnceExhaustedCadence47() {
        BrambleRampartII subject = new BrambleRampartII();
        for (int i = 0; i < 4; i++) {
            subject.brace47();
        }
        assertFalse(subject.brace47());
    }

    @Test
    void accumulatesBelowTheCapSpan48() {
        BrambleRampartII subject = new BrambleRampartII();
        assertEquals(1, subject.tally48(1));
        assertEquals(3, subject.tally48(2));
    }

    @Test
    void saturatesAtTheCapSpan48() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.tally48(28);
        assertEquals(28, subject.tally48(5));
    }

    @Test
    void ignoresNegativeValuesSpan48() {
        BrambleRampartII subject = new BrambleRampartII();
        subject.tally48(3);
        assertEquals(3, subject.tally48(-2));
        assertEquals(3, subject.yield48Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold49() {
        BrambleRampartII subject = new BrambleRampartII();
        assertThrows(ArithmeticException.class, () -> subject.furl49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold49() {
        assertEquals(0.5, new BrambleRampartII().furl49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold49() {
        assertEquals(5.0, new BrambleRampartII().furl49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth50() {
        assertTrue(new BrambleRampartII().gauge50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new BrambleRampartII().gauge50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth50() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleRampartII().gauge50(java.util.Arrays.asList(null, 11, null)));
    }
}
