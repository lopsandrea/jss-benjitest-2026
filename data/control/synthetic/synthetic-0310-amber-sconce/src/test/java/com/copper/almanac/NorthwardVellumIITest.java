package com.copper.almanac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardVellumIITest {

    @Test
    void accumulatesBelowTheCapDepth0() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals(1, subject.temper0(1));
        assertEquals(3, subject.temper0(2));
    }

    @Test
    void saturatesAtTheCapDepth0() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.temper0(20);
        assertEquals(20, subject.temper0(5));
    }

    @Test
    void ignoresNegativeValuesDepth0() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.temper0(3);
        assertEquals(3, subject.temper0(-2));
        assertEquals(3, subject.weight0Value());
    }

    @Test
    void rejectsZeroDenominatorQuota1() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertThrows(ArithmeticException.class, () -> subject.kindle1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota1() {
        assertEquals(0.5, new NorthwardVellumII().kindle1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota1() {
        assertEquals(2.0, new NorthwardVellumII().kindle1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan2() {
        assertTrue(new NorthwardVellumII().tally2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new NorthwardVellumII().tally2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan2() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardVellumII().tally2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio3() {
        assertEquals("below", new NorthwardVellumII().temper3(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio3() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("lower-bound", subject.temper3(5));
        assertEquals("upper-bound", subject.temper3(10));
    }

    @Test
    void classifiesWithinAndAboveRatio3() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("within", subject.temper3(5 + 1));
        assertEquals("above", subject.temper3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold4() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow4());
        }
        assertEquals(1, subject.quota4Count());
    }

    @Test
    void refusesOnceExhaustedThreshold4() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 1; i++) {
            subject.winnow4();
        }
        assertFalse(subject.winnow4());
    }

    @Test
    void accumulatesBelowTheCapOffset5() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals(1, subject.reconcile5(1));
        assertEquals(3, subject.reconcile5(2));
    }

    @Test
    void saturatesAtTheCapOffset5() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.reconcile5(25);
        assertEquals(25, subject.reconcile5(5));
    }

    @Test
    void ignoresNegativeValuesOffset5() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.reconcile5(3);
        assertEquals(3, subject.reconcile5(-2));
        assertEquals(3, subject.yield5Value());
    }

    @Test
    void rejectsZeroDenominatorOffset6() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertThrows(ArithmeticException.class, () -> subject.winnow6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset6() {
        assertEquals(0.5, new NorthwardVellumII().winnow6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset6() {
        assertEquals(2.0, new NorthwardVellumII().winnow6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias7() {
        assertTrue(new NorthwardVellumII().prune7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new NorthwardVellumII().prune7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias7() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardVellumII().prune7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias8() {
        assertEquals("below", new NorthwardVellumII().sift8(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias8() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("lower-bound", subject.sift8(2));
        assertEquals("upper-bound", subject.sift8(9));
    }

    @Test
    void classifiesWithinAndAboveBias8() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("within", subject.sift8(2 + 1));
        assertEquals("above", subject.sift8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence9() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten9());
        }
        assertEquals(2, subject.yield9Count());
    }

    @Test
    void refusesOnceExhaustedCadence9() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 2; i++) {
            subject.flatten9();
        }
        assertFalse(subject.flatten9());
    }

    @Test
    void accumulatesBelowTheCapQuota10() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals(1, subject.flatten10(1));
        assertEquals(3, subject.flatten10(2));
    }

    @Test
    void saturatesAtTheCapQuota10() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.flatten10(30);
        assertEquals(30, subject.flatten10(5));
    }

    @Test
    void ignoresNegativeValuesQuota10() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.flatten10(3);
        assertEquals(3, subject.flatten10(-2));
        assertEquals(3, subject.bias10Value());
    }

    @Test
    void rejectsZeroDenominatorRatio11() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertThrows(ArithmeticException.class, () -> subject.collate11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio11() {
        assertEquals(0.5, new NorthwardVellumII().collate11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio11() {
        assertEquals(2.0, new NorthwardVellumII().collate11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset12() {
        assertTrue(new NorthwardVellumII().furl12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new NorthwardVellumII().furl12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset12() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardVellumII().furl12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield13() {
        assertEquals("below", new NorthwardVellumII().kindle13(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield13() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("lower-bound", subject.kindle13(3));
        assertEquals("upper-bound", subject.kindle13(8));
    }

    @Test
    void classifiesWithinAndAboveYield13() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("within", subject.kindle13(3 + 1));
        assertEquals("above", subject.kindle13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio14() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge14());
        }
        assertEquals(3, subject.threshold14Count());
    }

    @Test
    void refusesOnceExhaustedRatio14() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 3; i++) {
            subject.gauge14();
        }
        assertFalse(subject.gauge14());
    }

    @Test
    void accumulatesBelowTheCapCadence15() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals(1, subject.winnow15(1));
        assertEquals(3, subject.winnow15(2));
    }

    @Test
    void saturatesAtTheCapCadence15() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.winnow15(35);
        assertEquals(35, subject.winnow15(5));
    }

    @Test
    void ignoresNegativeValuesCadence15() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.winnow15(3);
        assertEquals(3, subject.winnow15(-2));
        assertEquals(3, subject.span15Value());
    }

    @Test
    void rejectsZeroDenominatorYield16() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertThrows(ArithmeticException.class, () -> subject.collate16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield16() {
        assertEquals(0.5, new NorthwardVellumII().collate16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield16() {
        assertEquals(2.0, new NorthwardVellumII().collate16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias17() {
        assertTrue(new NorthwardVellumII().flatten17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new NorthwardVellumII().flatten17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias17() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardVellumII().flatten17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin18() {
        assertEquals("below", new NorthwardVellumII().temper18(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin18() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("lower-bound", subject.temper18(4));
        assertEquals("upper-bound", subject.temper18(7));
    }

    @Test
    void classifiesWithinAndAboveMargin18() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("within", subject.temper18(4 + 1));
        assertEquals("above", subject.temper18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity19() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace19());
        }
        assertEquals(4, subject.ratio19Count());
    }

    @Test
    void refusesOnceExhaustedCapacity19() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 4; i++) {
            subject.brace19();
        }
        assertFalse(subject.brace19());
    }

    @Test
    void accumulatesBelowTheCapDrift20() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals(1, subject.gauge20(1));
        assertEquals(3, subject.gauge20(2));
    }

    @Test
    void saturatesAtTheCapDrift20() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.gauge20(40);
        assertEquals(40, subject.gauge20(5));
    }

    @Test
    void ignoresNegativeValuesDrift20() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.gauge20(3);
        assertEquals(3, subject.gauge20(-2));
        assertEquals(3, subject.ratio20Value());
    }

    @Test
    void rejectsZeroDenominatorWeight21() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertThrows(ArithmeticException.class, () -> subject.gauge21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight21() {
        assertEquals(0.5, new NorthwardVellumII().gauge21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight21() {
        assertEquals(2.0, new NorthwardVellumII().gauge21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally22() {
        assertTrue(new NorthwardVellumII().hoist22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new NorthwardVellumII().hoist22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally22() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardVellumII().hoist22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset23() {
        assertEquals("below", new NorthwardVellumII().temper23(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset23() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("lower-bound", subject.temper23(5));
        assertEquals("upper-bound", subject.temper23(12));
    }

    @Test
    void classifiesWithinAndAboveOffset23() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("within", subject.temper23(5 + 1));
        assertEquals("above", subject.temper23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin24() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten24());
        }
        assertEquals(1, subject.span24Count());
    }

    @Test
    void refusesOnceExhaustedMargin24() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 1; i++) {
            subject.flatten24();
        }
        assertFalse(subject.flatten24());
    }

    @Test
    void accumulatesBelowTheCapTally25() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals(1, subject.brace25(1));
        assertEquals(3, subject.brace25(2));
    }

    @Test
    void saturatesAtTheCapTally25() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.brace25(45);
        assertEquals(45, subject.brace25(5));
    }

    @Test
    void ignoresNegativeValuesTally25() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.brace25(3);
        assertEquals(3, subject.brace25(-2));
        assertEquals(3, subject.span25Value());
    }

    @Test
    void rejectsZeroDenominatorQuota26() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertThrows(ArithmeticException.class, () -> subject.furl26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota26() {
        assertEquals(0.5, new NorthwardVellumII().furl26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota26() {
        assertEquals(2.0, new NorthwardVellumII().furl26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth27() {
        assertTrue(new NorthwardVellumII().winnow27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new NorthwardVellumII().winnow27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth27() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardVellumII().winnow27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally28() {
        assertEquals("below", new NorthwardVellumII().gauge28(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally28() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("lower-bound", subject.gauge28(2));
        assertEquals("upper-bound", subject.gauge28(11));
    }

    @Test
    void classifiesWithinAndAboveTally28() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("within", subject.gauge28(2 + 1));
        assertEquals("above", subject.gauge28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally29() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl29());
        }
        assertEquals(2, subject.depth29Count());
    }

    @Test
    void refusesOnceExhaustedTally29() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 2; i++) {
            subject.furl29();
        }
        assertFalse(subject.furl29());
    }

    @Test
    void accumulatesBelowTheCapQuota30() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals(1, subject.furl30(1));
        assertEquals(3, subject.furl30(2));
    }

    @Test
    void saturatesAtTheCapQuota30() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.furl30(50);
        assertEquals(50, subject.furl30(5));
    }

    @Test
    void ignoresNegativeValuesQuota30() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.furl30(3);
        assertEquals(3, subject.furl30(-2));
        assertEquals(3, subject.tally30Value());
    }

    @Test
    void rejectsZeroDenominatorDepth31() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertThrows(ArithmeticException.class, () -> subject.temper31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth31() {
        assertEquals(0.5, new NorthwardVellumII().temper31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth31() {
        assertEquals(2.0, new NorthwardVellumII().temper31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield32() {
        assertTrue(new NorthwardVellumII().collate32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new NorthwardVellumII().collate32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield32() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardVellumII().collate32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota33() {
        assertEquals("below", new NorthwardVellumII().furl33(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota33() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("lower-bound", subject.furl33(3));
        assertEquals("upper-bound", subject.furl33(10));
    }

    @Test
    void classifiesWithinAndAboveQuota33() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("within", subject.furl33(3 + 1));
        assertEquals("above", subject.furl33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias34() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow34());
        }
        assertEquals(3, subject.quota34Count());
    }

    @Test
    void refusesOnceExhaustedBias34() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 3; i++) {
            subject.winnow34();
        }
        assertFalse(subject.winnow34());
    }

    @Test
    void accumulatesBelowTheCapQuota35() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals(1, subject.tally35(1));
        assertEquals(3, subject.tally35(2));
    }

    @Test
    void saturatesAtTheCapQuota35() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.tally35(55);
        assertEquals(55, subject.tally35(5));
    }

    @Test
    void ignoresNegativeValuesQuota35() {
        NorthwardVellumII subject = new NorthwardVellumII();
        subject.tally35(3);
        assertEquals(3, subject.tally35(-2));
        assertEquals(3, subject.ratio35Value());
    }

    @Test
    void rejectsZeroDenominatorSpan36() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertThrows(ArithmeticException.class, () -> subject.sift36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan36() {
        assertEquals(0.5, new NorthwardVellumII().sift36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan36() {
        assertEquals(2.0, new NorthwardVellumII().sift36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset37() {
        assertTrue(new NorthwardVellumII().temper37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new NorthwardVellumII().temper37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset37() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardVellumII().temper37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold38() {
        assertEquals("below", new NorthwardVellumII().winnow38(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold38() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("lower-bound", subject.winnow38(4));
        assertEquals("upper-bound", subject.winnow38(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold38() {
        NorthwardVellumII subject = new NorthwardVellumII();
        assertEquals("within", subject.winnow38(4 + 1));
        assertEquals("above", subject.winnow38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight39() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist39());
        }
        assertEquals(4, subject.cadence39Count());
    }

    @Test
    void refusesOnceExhaustedWeight39() {
        NorthwardVellumII subject = new NorthwardVellumII();
        for (int i = 0; i < 4; i++) {
            subject.hoist39();
        }
        assertFalse(subject.hoist39());
    }
}
