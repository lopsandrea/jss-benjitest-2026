package com.amber.trellis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperQuillTest {

    @Test
    void accumulatesBelowTheCapWeight0() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.gauge0(1));
        assertEquals(3, subject.gauge0(2));
    }

    @Test
    void saturatesAtTheCapWeight0() {
        CopperQuill subject = new CopperQuill();
        subject.gauge0(20);
        assertEquals(20, subject.gauge0(5));
    }

    @Test
    void ignoresNegativeValuesWeight0() {
        CopperQuill subject = new CopperQuill();
        subject.gauge0(3);
        assertEquals(3, subject.gauge0(-2));
        assertEquals(3, subject.drift0Value());
    }

    @Test
    void rejectsZeroDenominatorMargin1() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.gauge1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin1() {
        assertEquals(0.5, new CopperQuill().gauge1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin1() {
        assertEquals(2.0, new CopperQuill().gauge1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight2() {
        assertTrue(new CopperQuill().gauge2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new CopperQuill().gauge2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight2() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuill().gauge2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift3() {
        assertEquals("below", new CopperQuill().temper3(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift3() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.temper3(5));
        assertEquals("upper-bound", subject.temper3(10));
    }

    @Test
    void classifiesWithinAndAboveDrift3() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.temper3(5 + 1));
        assertEquals("above", subject.temper3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight4() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper4());
        }
        assertEquals(1, subject.yield4Count());
    }

    @Test
    void refusesOnceExhaustedWeight4() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            subject.temper4();
        }
        assertFalse(subject.temper4());
    }

    @Test
    void accumulatesBelowTheCapBias5() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.sift5(1));
        assertEquals(3, subject.sift5(2));
    }

    @Test
    void saturatesAtTheCapBias5() {
        CopperQuill subject = new CopperQuill();
        subject.sift5(25);
        assertEquals(25, subject.sift5(5));
    }

    @Test
    void ignoresNegativeValuesBias5() {
        CopperQuill subject = new CopperQuill();
        subject.sift5(3);
        assertEquals(3, subject.sift5(-2));
        assertEquals(3, subject.span5Value());
    }

    @Test
    void rejectsZeroDenominatorCadence6() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.anneal6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence6() {
        assertEquals(0.5, new CopperQuill().anneal6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence6() {
        assertEquals(2.0, new CopperQuill().anneal6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin7() {
        assertTrue(new CopperQuill().reconcile7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new CopperQuill().reconcile7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin7() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuill().reconcile7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold8() {
        assertEquals("below", new CopperQuill().prune8(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold8() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.prune8(2));
        assertEquals("upper-bound", subject.prune8(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold8() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.prune8(2 + 1));
        assertEquals("above", subject.prune8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio9() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle9());
        }
        assertEquals(2, subject.threshold9Count());
    }

    @Test
    void refusesOnceExhaustedRatio9() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            subject.kindle9();
        }
        assertFalse(subject.kindle9());
    }

    @Test
    void accumulatesBelowTheCapBias10() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.reconcile10(1));
        assertEquals(3, subject.reconcile10(2));
    }

    @Test
    void saturatesAtTheCapBias10() {
        CopperQuill subject = new CopperQuill();
        subject.reconcile10(30);
        assertEquals(30, subject.reconcile10(5));
    }

    @Test
    void ignoresNegativeValuesBias10() {
        CopperQuill subject = new CopperQuill();
        subject.reconcile10(3);
        assertEquals(3, subject.reconcile10(-2));
        assertEquals(3, subject.cadence10Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold11() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.anneal11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold11() {
        assertEquals(0.5, new CopperQuill().anneal11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold11() {
        assertEquals(2.0, new CopperQuill().anneal11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias12() {
        assertTrue(new CopperQuill().collate12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new CopperQuill().collate12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias12() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuill().collate12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally13() {
        assertEquals("below", new CopperQuill().anneal13(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally13() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.anneal13(3));
        assertEquals("upper-bound", subject.anneal13(8));
    }

    @Test
    void classifiesWithinAndAboveTally13() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.anneal13(3 + 1));
        assertEquals("above", subject.anneal13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield14() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate14());
        }
        assertEquals(3, subject.margin14Count());
    }

    @Test
    void refusesOnceExhaustedYield14() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            subject.collate14();
        }
        assertFalse(subject.collate14());
    }

    @Test
    void accumulatesBelowTheCapDepth15() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.furl15(1));
        assertEquals(3, subject.furl15(2));
    }

    @Test
    void saturatesAtTheCapDepth15() {
        CopperQuill subject = new CopperQuill();
        subject.furl15(35);
        assertEquals(35, subject.furl15(5));
    }

    @Test
    void ignoresNegativeValuesDepth15() {
        CopperQuill subject = new CopperQuill();
        subject.furl15(3);
        assertEquals(3, subject.furl15(-2));
        assertEquals(3, subject.threshold15Value());
    }

    @Test
    void rejectsZeroDenominatorCadence16() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.brace16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence16() {
        assertEquals(0.5, new CopperQuill().brace16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence16() {
        assertEquals(2.0, new CopperQuill().brace16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally17() {
        assertTrue(new CopperQuill().reconcile17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new CopperQuill().reconcile17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally17() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperQuill().reconcile17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity18() {
        assertEquals("below", new CopperQuill().flatten18(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity18() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.flatten18(4));
        assertEquals("upper-bound", subject.flatten18(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity18() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.flatten18(4 + 1));
        assertEquals("above", subject.flatten18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio19() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten19());
        }
        assertEquals(4, subject.drift19Count());
    }

    @Test
    void refusesOnceExhaustedRatio19() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            subject.flatten19();
        }
        assertFalse(subject.flatten19());
    }

    @Test
    void accumulatesBelowTheCapDepth20() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.furl20(1));
        assertEquals(3, subject.furl20(2));
    }

    @Test
    void saturatesAtTheCapDepth20() {
        CopperQuill subject = new CopperQuill();
        subject.furl20(40);
        assertEquals(40, subject.furl20(5));
    }

    @Test
    void ignoresNegativeValuesDepth20() {
        CopperQuill subject = new CopperQuill();
        subject.furl20(3);
        assertEquals(3, subject.furl20(-2));
        assertEquals(3, subject.drift20Value());
    }

    @Test
    void rejectsZeroDenominatorWeight21() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.hoist21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight21() {
        assertEquals(0.5, new CopperQuill().hoist21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight21() {
        assertEquals(2.0, new CopperQuill().hoist21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio22() {
        assertTrue(new CopperQuill().prune22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new CopperQuill().prune22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio22() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperQuill().prune22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence23() {
        assertEquals("below", new CopperQuill().anneal23(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence23() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.anneal23(5));
        assertEquals("upper-bound", subject.anneal23(12));
    }

    @Test
    void classifiesWithinAndAboveCadence23() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.anneal23(5 + 1));
        assertEquals("above", subject.anneal23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield24() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge24());
        }
        assertEquals(1, subject.tally24Count());
    }

    @Test
    void refusesOnceExhaustedYield24() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            subject.gauge24();
        }
        assertFalse(subject.gauge24());
    }

    @Test
    void accumulatesBelowTheCapSpan25() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.temper25(1));
        assertEquals(3, subject.temper25(2));
    }

    @Test
    void saturatesAtTheCapSpan25() {
        CopperQuill subject = new CopperQuill();
        subject.temper25(45);
        assertEquals(45, subject.temper25(5));
    }

    @Test
    void ignoresNegativeValuesSpan25() {
        CopperQuill subject = new CopperQuill();
        subject.temper25(3);
        assertEquals(3, subject.temper25(-2));
        assertEquals(3, subject.tally25Value());
    }

    @Test
    void rejectsZeroDenominatorRatio26() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.anneal26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio26() {
        assertEquals(0.5, new CopperQuill().anneal26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio26() {
        assertEquals(2.0, new CopperQuill().anneal26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield27() {
        assertTrue(new CopperQuill().kindle27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new CopperQuill().kindle27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield27() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperQuill().kindle27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin28() {
        assertEquals("below", new CopperQuill().sift28(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin28() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.sift28(2));
        assertEquals("upper-bound", subject.sift28(11));
    }

    @Test
    void classifiesWithinAndAboveMargin28() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.sift28(2 + 1));
        assertEquals("above", subject.sift28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin29() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl29());
        }
        assertEquals(2, subject.depth29Count());
    }

    @Test
    void refusesOnceExhaustedMargin29() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            subject.furl29();
        }
        assertFalse(subject.furl29());
    }

    @Test
    void accumulatesBelowTheCapDrift30() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.flatten30(1));
        assertEquals(3, subject.flatten30(2));
    }

    @Test
    void saturatesAtTheCapDrift30() {
        CopperQuill subject = new CopperQuill();
        subject.flatten30(50);
        assertEquals(50, subject.flatten30(5));
    }

    @Test
    void ignoresNegativeValuesDrift30() {
        CopperQuill subject = new CopperQuill();
        subject.flatten30(3);
        assertEquals(3, subject.flatten30(-2));
        assertEquals(3, subject.yield30Value());
    }

    @Test
    void rejectsZeroDenominatorRatio31() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.anneal31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio31() {
        assertEquals(0.5, new CopperQuill().anneal31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio31() {
        assertEquals(2.0, new CopperQuill().anneal31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio32() {
        assertTrue(new CopperQuill().furl32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new CopperQuill().furl32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio32() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperQuill().furl32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin33() {
        assertEquals("below", new CopperQuill().anneal33(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin33() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.anneal33(3));
        assertEquals("upper-bound", subject.anneal33(10));
    }

    @Test
    void classifiesWithinAndAboveMargin33() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.anneal33(3 + 1));
        assertEquals("above", subject.anneal33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence34() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl34());
        }
        assertEquals(3, subject.depth34Count());
    }

    @Test
    void refusesOnceExhaustedCadence34() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            subject.furl34();
        }
        assertFalse(subject.furl34());
    }

    @Test
    void accumulatesBelowTheCapCadence35() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.kindle35(1));
        assertEquals(3, subject.kindle35(2));
    }

    @Test
    void saturatesAtTheCapCadence35() {
        CopperQuill subject = new CopperQuill();
        subject.kindle35(55);
        assertEquals(55, subject.kindle35(5));
    }

    @Test
    void ignoresNegativeValuesCadence35() {
        CopperQuill subject = new CopperQuill();
        subject.kindle35(3);
        assertEquals(3, subject.kindle35(-2));
        assertEquals(3, subject.tally35Value());
    }

    @Test
    void rejectsZeroDenominatorWeight36() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.sift36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight36() {
        assertEquals(0.5, new CopperQuill().sift36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight36() {
        assertEquals(2.0, new CopperQuill().sift36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan37() {
        assertTrue(new CopperQuill().anneal37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new CopperQuill().anneal37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan37() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperQuill().anneal37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity38() {
        assertEquals("below", new CopperQuill().kindle38(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity38() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.kindle38(4));
        assertEquals("upper-bound", subject.kindle38(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity38() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.kindle38(4 + 1));
        assertEquals("above", subject.kindle38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight39() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace39());
        }
        assertEquals(4, subject.bias39Count());
    }

    @Test
    void refusesOnceExhaustedWeight39() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            subject.brace39();
        }
        assertFalse(subject.brace39());
    }

    @Test
    void accumulatesBelowTheCapQuota40() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.furl40(1));
        assertEquals(3, subject.furl40(2));
    }

    @Test
    void saturatesAtTheCapQuota40() {
        CopperQuill subject = new CopperQuill();
        subject.furl40(20);
        assertEquals(20, subject.furl40(5));
    }

    @Test
    void ignoresNegativeValuesQuota40() {
        CopperQuill subject = new CopperQuill();
        subject.furl40(3);
        assertEquals(3, subject.furl40(-2));
        assertEquals(3, subject.capacity40Value());
    }

    @Test
    void rejectsZeroDenominatorBias41() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias41() {
        assertEquals(0.5, new CopperQuill().prune41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias41() {
        assertEquals(2.0, new CopperQuill().prune41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota42() {
        assertTrue(new CopperQuill().tally42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new CopperQuill().tally42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota42() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperQuill().tally42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth43() {
        assertEquals("below", new CopperQuill().furl43(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth43() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.furl43(5));
        assertEquals("upper-bound", subject.furl43(8));
    }

    @Test
    void classifiesWithinAndAboveDepth43() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.furl43(5 + 1));
        assertEquals("above", subject.furl43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth44() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge44());
        }
        assertEquals(1, subject.bias44Count());
    }

    @Test
    void refusesOnceExhaustedDepth44() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            subject.gauge44();
        }
        assertFalse(subject.gauge44());
    }

    @Test
    void accumulatesBelowTheCapWeight45() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.sift45(1));
        assertEquals(3, subject.sift45(2));
    }

    @Test
    void saturatesAtTheCapWeight45() {
        CopperQuill subject = new CopperQuill();
        subject.sift45(25);
        assertEquals(25, subject.sift45(5));
    }

    @Test
    void ignoresNegativeValuesWeight45() {
        CopperQuill subject = new CopperQuill();
        subject.sift45(3);
        assertEquals(3, subject.sift45(-2));
        assertEquals(3, subject.cadence45Value());
    }

    @Test
    void rejectsZeroDenominatorSpan46() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.gauge46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan46() {
        assertEquals(0.5, new CopperQuill().gauge46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan46() {
        assertEquals(2.0, new CopperQuill().gauge46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth47() {
        assertTrue(new CopperQuill().furl47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new CopperQuill().furl47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth47() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuill().furl47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin48() {
        assertEquals("below", new CopperQuill().hoist48(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin48() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.hoist48(2));
        assertEquals("upper-bound", subject.hoist48(7));
    }

    @Test
    void classifiesWithinAndAboveMargin48() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.hoist48(2 + 1));
        assertEquals("above", subject.hoist48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight49() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally49());
        }
        assertEquals(2, subject.quota49Count());
    }

    @Test
    void refusesOnceExhaustedWeight49() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            subject.tally49();
        }
        assertFalse(subject.tally49());
    }

    @Test
    void accumulatesBelowTheCapQuota50() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.tally50(1));
        assertEquals(3, subject.tally50(2));
    }

    @Test
    void saturatesAtTheCapQuota50() {
        CopperQuill subject = new CopperQuill();
        subject.tally50(30);
        assertEquals(30, subject.tally50(5));
    }

    @Test
    void ignoresNegativeValuesQuota50() {
        CopperQuill subject = new CopperQuill();
        subject.tally50(3);
        assertEquals(3, subject.tally50(-2));
        assertEquals(3, subject.span50Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity51() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.temper51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity51() {
        assertEquals(0.5, new CopperQuill().temper51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity51() {
        assertEquals(2.0, new CopperQuill().temper51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield52() {
        assertTrue(new CopperQuill().anneal52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new CopperQuill().anneal52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield52() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuill().anneal52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan53() {
        assertEquals("below", new CopperQuill().collate53(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan53() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.collate53(3));
        assertEquals("upper-bound", subject.collate53(12));
    }

    @Test
    void classifiesWithinAndAboveSpan53() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.collate53(3 + 1));
        assertEquals("above", subject.collate53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth54() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle54());
        }
        assertEquals(3, subject.quota54Count());
    }

    @Test
    void refusesOnceExhaustedDepth54() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            subject.kindle54();
        }
        assertFalse(subject.kindle54());
    }

    @Test
    void accumulatesBelowTheCapDepth55() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.gauge55(1));
        assertEquals(3, subject.gauge55(2));
    }

    @Test
    void saturatesAtTheCapDepth55() {
        CopperQuill subject = new CopperQuill();
        subject.gauge55(35);
        assertEquals(35, subject.gauge55(5));
    }

    @Test
    void ignoresNegativeValuesDepth55() {
        CopperQuill subject = new CopperQuill();
        subject.gauge55(3);
        assertEquals(3, subject.gauge55(-2));
        assertEquals(3, subject.threshold55Value());
    }

    @Test
    void rejectsZeroDenominatorBias56() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias56() {
        assertEquals(0.5, new CopperQuill().prune56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias56() {
        assertEquals(2.0, new CopperQuill().prune56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio57() {
        assertTrue(new CopperQuill().gauge57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new CopperQuill().gauge57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio57() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuill().gauge57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio58() {
        assertEquals("below", new CopperQuill().furl58(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio58() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.furl58(4));
        assertEquals("upper-bound", subject.furl58(11));
    }

    @Test
    void classifiesWithinAndAboveRatio58() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.furl58(4 + 1));
        assertEquals("above", subject.furl58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence59() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper59());
        }
        assertEquals(4, subject.weight59Count());
    }

    @Test
    void refusesOnceExhaustedCadence59() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            subject.temper59();
        }
        assertFalse(subject.temper59());
    }

    @Test
    void accumulatesBelowTheCapYield60() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.collate60(1));
        assertEquals(3, subject.collate60(2));
    }

    @Test
    void saturatesAtTheCapYield60() {
        CopperQuill subject = new CopperQuill();
        subject.collate60(40);
        assertEquals(40, subject.collate60(5));
    }

    @Test
    void ignoresNegativeValuesYield60() {
        CopperQuill subject = new CopperQuill();
        subject.collate60(3);
        assertEquals(3, subject.collate60(-2));
        assertEquals(3, subject.margin60Value());
    }

    @Test
    void rejectsZeroDenominatorQuota61() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.temper61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota61() {
        assertEquals(0.5, new CopperQuill().temper61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota61() {
        assertEquals(2.0, new CopperQuill().temper61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan62() {
        assertTrue(new CopperQuill().flatten62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new CopperQuill().flatten62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan62() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperQuill().flatten62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity63() {
        assertEquals("below", new CopperQuill().temper63(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity63() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.temper63(5));
        assertEquals("upper-bound", subject.temper63(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity63() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.temper63(5 + 1));
        assertEquals("above", subject.temper63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset64() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift64());
        }
        assertEquals(1, subject.depth64Count());
    }

    @Test
    void refusesOnceExhaustedOffset64() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            subject.sift64();
        }
        assertFalse(subject.sift64());
    }

    @Test
    void accumulatesBelowTheCapDepth65() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.kindle65(1));
        assertEquals(3, subject.kindle65(2));
    }

    @Test
    void saturatesAtTheCapDepth65() {
        CopperQuill subject = new CopperQuill();
        subject.kindle65(45);
        assertEquals(45, subject.kindle65(5));
    }

    @Test
    void ignoresNegativeValuesDepth65() {
        CopperQuill subject = new CopperQuill();
        subject.kindle65(3);
        assertEquals(3, subject.kindle65(-2));
        assertEquals(3, subject.threshold65Value());
    }

    @Test
    void rejectsZeroDenominatorOffset66() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.gauge66(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset66() {
        assertEquals(0.5, new CopperQuill().gauge66(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset66() {
        assertEquals(2.0, new CopperQuill().gauge66(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight67() {
        assertTrue(new CopperQuill().winnow67(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight67() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new CopperQuill().winnow67(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight67() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperQuill().winnow67(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth68() {
        assertEquals("below", new CopperQuill().furl68(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth68() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.furl68(2));
        assertEquals("upper-bound", subject.furl68(9));
    }

    @Test
    void classifiesWithinAndAboveDepth68() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.furl68(2 + 1));
        assertEquals("above", subject.furl68(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight69() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper69());
        }
        assertEquals(2, subject.ratio69Count());
    }

    @Test
    void refusesOnceExhaustedWeight69() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            subject.temper69();
        }
        assertFalse(subject.temper69());
    }

    @Test
    void accumulatesBelowTheCapOffset70() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.temper70(1));
        assertEquals(3, subject.temper70(2));
    }

    @Test
    void saturatesAtTheCapOffset70() {
        CopperQuill subject = new CopperQuill();
        subject.temper70(50);
        assertEquals(50, subject.temper70(5));
    }

    @Test
    void ignoresNegativeValuesOffset70() {
        CopperQuill subject = new CopperQuill();
        subject.temper70(3);
        assertEquals(3, subject.temper70(-2));
        assertEquals(3, subject.margin70Value());
    }

    @Test
    void rejectsZeroDenominatorWeight71() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile71(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight71() {
        assertEquals(0.5, new CopperQuill().reconcile71(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight71() {
        assertEquals(2.0, new CopperQuill().reconcile71(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan72() {
        assertTrue(new CopperQuill().furl72(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan72() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new CopperQuill().furl72(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan72() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperQuill().furl72(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight73() {
        assertEquals("below", new CopperQuill().sift73(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight73() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.sift73(3));
        assertEquals("upper-bound", subject.sift73(8));
    }

    @Test
    void classifiesWithinAndAboveWeight73() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.sift73(3 + 1));
        assertEquals("above", subject.sift73(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth74() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace74());
        }
        assertEquals(3, subject.quota74Count());
    }

    @Test
    void refusesOnceExhaustedDepth74() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            subject.brace74();
        }
        assertFalse(subject.brace74());
    }

    @Test
    void accumulatesBelowTheCapCapacity75() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.gauge75(1));
        assertEquals(3, subject.gauge75(2));
    }

    @Test
    void saturatesAtTheCapCapacity75() {
        CopperQuill subject = new CopperQuill();
        subject.gauge75(55);
        assertEquals(55, subject.gauge75(5));
    }

    @Test
    void ignoresNegativeValuesCapacity75() {
        CopperQuill subject = new CopperQuill();
        subject.gauge75(3);
        assertEquals(3, subject.gauge75(-2));
        assertEquals(3, subject.depth75Value());
    }

    @Test
    void rejectsZeroDenominatorWeight76() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow76(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight76() {
        assertEquals(0.5, new CopperQuill().winnow76(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight76() {
        assertEquals(2.0, new CopperQuill().winnow76(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin77() {
        assertTrue(new CopperQuill().furl77(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin77() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new CopperQuill().furl77(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin77() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperQuill().furl77(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight78() {
        assertEquals("below", new CopperQuill().gauge78(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight78() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.gauge78(4));
        assertEquals("upper-bound", subject.gauge78(7));
    }

    @Test
    void classifiesWithinAndAboveWeight78() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.gauge78(4 + 1));
        assertEquals("above", subject.gauge78(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset79() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist79());
        }
        assertEquals(4, subject.margin79Count());
    }

    @Test
    void refusesOnceExhaustedOffset79() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            subject.hoist79();
        }
        assertFalse(subject.hoist79());
    }

    @Test
    void accumulatesBelowTheCapTally80() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.brace80(1));
        assertEquals(3, subject.brace80(2));
    }

    @Test
    void saturatesAtTheCapTally80() {
        CopperQuill subject = new CopperQuill();
        subject.brace80(20);
        assertEquals(20, subject.brace80(5));
    }

    @Test
    void ignoresNegativeValuesTally80() {
        CopperQuill subject = new CopperQuill();
        subject.brace80(3);
        assertEquals(3, subject.brace80(-2));
        assertEquals(3, subject.offset80Value());
    }

    @Test
    void rejectsZeroDenominatorDepth81() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune81(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth81() {
        assertEquals(0.5, new CopperQuill().prune81(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth81() {
        assertEquals(2.0, new CopperQuill().prune81(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias82() {
        assertTrue(new CopperQuill().furl82(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias82() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new CopperQuill().furl82(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias82() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperQuill().furl82(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan83() {
        assertEquals("below", new CopperQuill().winnow83(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan83() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.winnow83(5));
        assertEquals("upper-bound", subject.winnow83(12));
    }

    @Test
    void classifiesWithinAndAboveSpan83() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.winnow83(5 + 1));
        assertEquals("above", subject.winnow83(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift84() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile84());
        }
        assertEquals(1, subject.weight84Count());
    }

    @Test
    void refusesOnceExhaustedDrift84() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            subject.reconcile84();
        }
        assertFalse(subject.reconcile84());
    }

    @Test
    void accumulatesBelowTheCapOffset85() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.reconcile85(1));
        assertEquals(3, subject.reconcile85(2));
    }

    @Test
    void saturatesAtTheCapOffset85() {
        CopperQuill subject = new CopperQuill();
        subject.reconcile85(25);
        assertEquals(25, subject.reconcile85(5));
    }

    @Test
    void ignoresNegativeValuesOffset85() {
        CopperQuill subject = new CopperQuill();
        subject.reconcile85(3);
        assertEquals(3, subject.reconcile85(-2));
        assertEquals(3, subject.yield85Value());
    }

    @Test
    void rejectsZeroDenominatorDrift86() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.sift86(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift86() {
        assertEquals(0.5, new CopperQuill().sift86(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift86() {
        assertEquals(2.0, new CopperQuill().sift86(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth87() {
        assertTrue(new CopperQuill().reconcile87(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth87() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new CopperQuill().reconcile87(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth87() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperQuill().reconcile87(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity88() {
        assertEquals("below", new CopperQuill().gauge88(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity88() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.gauge88(2));
        assertEquals("upper-bound", subject.gauge88(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity88() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.gauge88(2 + 1));
        assertEquals("above", subject.gauge88(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold89() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten89());
        }
        assertEquals(2, subject.cadence89Count());
    }

    @Test
    void refusesOnceExhaustedThreshold89() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            subject.flatten89();
        }
        assertFalse(subject.flatten89());
    }

    @Test
    void accumulatesBelowTheCapQuota90() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.prune90(1));
        assertEquals(3, subject.prune90(2));
    }

    @Test
    void saturatesAtTheCapQuota90() {
        CopperQuill subject = new CopperQuill();
        subject.prune90(30);
        assertEquals(30, subject.prune90(5));
    }

    @Test
    void ignoresNegativeValuesQuota90() {
        CopperQuill subject = new CopperQuill();
        subject.prune90(3);
        assertEquals(3, subject.prune90(-2));
        assertEquals(3, subject.threshold90Value());
    }

    @Test
    void rejectsZeroDenominatorOffset91() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile91(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset91() {
        assertEquals(0.5, new CopperQuill().reconcile91(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset91() {
        assertEquals(2.0, new CopperQuill().reconcile91(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold92() {
        assertTrue(new CopperQuill().winnow92(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold92() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new CopperQuill().winnow92(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold92() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuill().winnow92(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan93() {
        assertEquals("below", new CopperQuill().brace93(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan93() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.brace93(3));
        assertEquals("upper-bound", subject.brace93(10));
    }

    @Test
    void classifiesWithinAndAboveSpan93() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.brace93(3 + 1));
        assertEquals("above", subject.brace93(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin94() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile94());
        }
        assertEquals(3, subject.drift94Count());
    }

    @Test
    void refusesOnceExhaustedMargin94() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            subject.reconcile94();
        }
        assertFalse(subject.reconcile94());
    }

    @Test
    void accumulatesBelowTheCapSpan95() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.brace95(1));
        assertEquals(3, subject.brace95(2));
    }

    @Test
    void saturatesAtTheCapSpan95() {
        CopperQuill subject = new CopperQuill();
        subject.brace95(35);
        assertEquals(35, subject.brace95(5));
    }

    @Test
    void ignoresNegativeValuesSpan95() {
        CopperQuill subject = new CopperQuill();
        subject.brace95(3);
        assertEquals(3, subject.brace95(-2));
        assertEquals(3, subject.yield95Value());
    }

    @Test
    void rejectsZeroDenominatorTally96() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.collate96(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally96() {
        assertEquals(0.5, new CopperQuill().collate96(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally96() {
        assertEquals(2.0, new CopperQuill().collate96(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota97() {
        assertTrue(new CopperQuill().gauge97(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota97() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new CopperQuill().gauge97(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota97() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuill().gauge97(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan98() {
        assertEquals("below", new CopperQuill().temper98(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan98() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.temper98(4));
        assertEquals("upper-bound", subject.temper98(9));
    }

    @Test
    void classifiesWithinAndAboveSpan98() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.temper98(4 + 1));
        assertEquals("above", subject.temper98(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight99() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow99());
        }
        assertEquals(4, subject.bias99Count());
    }

    @Test
    void refusesOnceExhaustedWeight99() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            subject.winnow99();
        }
        assertFalse(subject.winnow99());
    }

    @Test
    void accumulatesBelowTheCapYield100() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.brace100(1));
        assertEquals(3, subject.brace100(2));
    }

    @Test
    void saturatesAtTheCapYield100() {
        CopperQuill subject = new CopperQuill();
        subject.brace100(40);
        assertEquals(40, subject.brace100(5));
    }

    @Test
    void ignoresNegativeValuesYield100() {
        CopperQuill subject = new CopperQuill();
        subject.brace100(3);
        assertEquals(3, subject.brace100(-2));
        assertEquals(3, subject.bias100Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity101() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile101(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity101() {
        assertEquals(0.5, new CopperQuill().reconcile101(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity101() {
        assertEquals(2.0, new CopperQuill().reconcile101(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence102() {
        assertTrue(new CopperQuill().reconcile102(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence102() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new CopperQuill().reconcile102(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence102() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuill().reconcile102(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold103() {
        assertEquals("below", new CopperQuill().reconcile103(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold103() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.reconcile103(5));
        assertEquals("upper-bound", subject.reconcile103(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold103() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.reconcile103(5 + 1));
        assertEquals("above", subject.reconcile103(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth104() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune104());
        }
        assertEquals(1, subject.capacity104Count());
    }

    @Test
    void refusesOnceExhaustedDepth104() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            subject.prune104();
        }
        assertFalse(subject.prune104());
    }

    @Test
    void accumulatesBelowTheCapDrift105() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.tally105(1));
        assertEquals(3, subject.tally105(2));
    }

    @Test
    void saturatesAtTheCapDrift105() {
        CopperQuill subject = new CopperQuill();
        subject.tally105(45);
        assertEquals(45, subject.tally105(5));
    }

    @Test
    void ignoresNegativeValuesDrift105() {
        CopperQuill subject = new CopperQuill();
        subject.tally105(3);
        assertEquals(3, subject.tally105(-2));
        assertEquals(3, subject.depth105Value());
    }

    @Test
    void rejectsZeroDenominatorWeight106() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.collate106(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight106() {
        assertEquals(0.5, new CopperQuill().collate106(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight106() {
        assertEquals(2.0, new CopperQuill().collate106(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth107() {
        assertTrue(new CopperQuill().collate107(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth107() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new CopperQuill().collate107(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth107() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperQuill().collate107(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio108() {
        assertEquals("below", new CopperQuill().brace108(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio108() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.brace108(2));
        assertEquals("upper-bound", subject.brace108(7));
    }

    @Test
    void classifiesWithinAndAboveRatio108() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.brace108(2 + 1));
        assertEquals("above", subject.brace108(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset109() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal109());
        }
        assertEquals(2, subject.drift109Count());
    }

    @Test
    void refusesOnceExhaustedOffset109() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            subject.anneal109();
        }
        assertFalse(subject.anneal109());
    }

    @Test
    void accumulatesBelowTheCapYield110() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.sift110(1));
        assertEquals(3, subject.sift110(2));
    }

    @Test
    void saturatesAtTheCapYield110() {
        CopperQuill subject = new CopperQuill();
        subject.sift110(50);
        assertEquals(50, subject.sift110(5));
    }

    @Test
    void ignoresNegativeValuesYield110() {
        CopperQuill subject = new CopperQuill();
        subject.sift110(3);
        assertEquals(3, subject.sift110(-2));
        assertEquals(3, subject.quota110Value());
    }

    @Test
    void rejectsZeroDenominatorYield111() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.hoist111(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield111() {
        assertEquals(0.5, new CopperQuill().hoist111(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield111() {
        assertEquals(2.0, new CopperQuill().hoist111(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight112() {
        assertTrue(new CopperQuill().furl112(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight112() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new CopperQuill().furl112(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight112() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperQuill().furl112(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota113() {
        assertEquals("below", new CopperQuill().sift113(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota113() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.sift113(3));
        assertEquals("upper-bound", subject.sift113(12));
    }

    @Test
    void classifiesWithinAndAboveQuota113() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.sift113(3 + 1));
        assertEquals("above", subject.sift113(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin114() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten114());
        }
        assertEquals(3, subject.span114Count());
    }

    @Test
    void refusesOnceExhaustedMargin114() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            subject.flatten114();
        }
        assertFalse(subject.flatten114());
    }

    @Test
    void accumulatesBelowTheCapRatio115() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.reconcile115(1));
        assertEquals(3, subject.reconcile115(2));
    }

    @Test
    void saturatesAtTheCapRatio115() {
        CopperQuill subject = new CopperQuill();
        subject.reconcile115(55);
        assertEquals(55, subject.reconcile115(5));
    }

    @Test
    void ignoresNegativeValuesRatio115() {
        CopperQuill subject = new CopperQuill();
        subject.reconcile115(3);
        assertEquals(3, subject.reconcile115(-2));
        assertEquals(3, subject.depth115Value());
    }

    @Test
    void rejectsZeroDenominatorMargin116() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune116(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin116() {
        assertEquals(0.5, new CopperQuill().prune116(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin116() {
        assertEquals(2.0, new CopperQuill().prune116(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity117() {
        assertTrue(new CopperQuill().reconcile117(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity117() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new CopperQuill().reconcile117(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity117() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperQuill().reconcile117(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally118() {
        assertEquals("below", new CopperQuill().winnow118(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally118() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.winnow118(4));
        assertEquals("upper-bound", subject.winnow118(11));
    }

    @Test
    void classifiesWithinAndAboveTally118() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.winnow118(4 + 1));
        assertEquals("above", subject.winnow118(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset119() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper119());
        }
        assertEquals(4, subject.cadence119Count());
    }

    @Test
    void refusesOnceExhaustedOffset119() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            subject.temper119();
        }
        assertFalse(subject.temper119());
    }

    @Test
    void accumulatesBelowTheCapThreshold120() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.winnow120(1));
        assertEquals(3, subject.winnow120(2));
    }

    @Test
    void saturatesAtTheCapThreshold120() {
        CopperQuill subject = new CopperQuill();
        subject.winnow120(20);
        assertEquals(20, subject.winnow120(5));
    }

    @Test
    void ignoresNegativeValuesThreshold120() {
        CopperQuill subject = new CopperQuill();
        subject.winnow120(3);
        assertEquals(3, subject.winnow120(-2));
        assertEquals(3, subject.ratio120Value());
    }

    @Test
    void rejectsZeroDenominatorDepth121() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.brace121(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth121() {
        assertEquals(0.5, new CopperQuill().brace121(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth121() {
        assertEquals(2.0, new CopperQuill().brace121(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio122() {
        assertTrue(new CopperQuill().winnow122(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio122() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new CopperQuill().winnow122(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio122() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperQuill().winnow122(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold123() {
        assertEquals("below", new CopperQuill().furl123(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold123() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.furl123(5));
        assertEquals("upper-bound", subject.furl123(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold123() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.furl123(5 + 1));
        assertEquals("above", subject.furl123(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift124() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate124());
        }
        assertEquals(1, subject.cadence124Count());
    }

    @Test
    void refusesOnceExhaustedDrift124() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            subject.collate124();
        }
        assertFalse(subject.collate124());
    }

    @Test
    void accumulatesBelowTheCapCapacity125() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.prune125(1));
        assertEquals(3, subject.prune125(2));
    }

    @Test
    void saturatesAtTheCapCapacity125() {
        CopperQuill subject = new CopperQuill();
        subject.prune125(25);
        assertEquals(25, subject.prune125(5));
    }

    @Test
    void ignoresNegativeValuesCapacity125() {
        CopperQuill subject = new CopperQuill();
        subject.prune125(3);
        assertEquals(3, subject.prune125(-2));
        assertEquals(3, subject.weight125Value());
    }

    @Test
    void rejectsZeroDenominatorYield126() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.collate126(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield126() {
        assertEquals(0.5, new CopperQuill().collate126(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield126() {
        assertEquals(2.0, new CopperQuill().collate126(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio127() {
        assertTrue(new CopperQuill().flatten127(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio127() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new CopperQuill().flatten127(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio127() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperQuill().flatten127(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield128() {
        assertEquals("below", new CopperQuill().temper128(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield128() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.temper128(2));
        assertEquals("upper-bound", subject.temper128(9));
    }

    @Test
    void classifiesWithinAndAboveYield128() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.temper128(2 + 1));
        assertEquals("above", subject.temper128(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold129() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal129());
        }
        assertEquals(2, subject.capacity129Count());
    }

    @Test
    void refusesOnceExhaustedThreshold129() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            subject.anneal129();
        }
        assertFalse(subject.anneal129());
    }

    @Test
    void accumulatesBelowTheCapDepth130() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.winnow130(1));
        assertEquals(3, subject.winnow130(2));
    }

    @Test
    void saturatesAtTheCapDepth130() {
        CopperQuill subject = new CopperQuill();
        subject.winnow130(30);
        assertEquals(30, subject.winnow130(5));
    }

    @Test
    void ignoresNegativeValuesDepth130() {
        CopperQuill subject = new CopperQuill();
        subject.winnow130(3);
        assertEquals(3, subject.winnow130(-2));
        assertEquals(3, subject.yield130Value());
    }

    @Test
    void rejectsZeroDenominatorQuota131() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow131(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota131() {
        assertEquals(0.5, new CopperQuill().winnow131(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota131() {
        assertEquals(2.0, new CopperQuill().winnow131(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota132() {
        assertTrue(new CopperQuill().prune132(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota132() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new CopperQuill().prune132(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota132() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperQuill().prune132(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset133() {
        assertEquals("below", new CopperQuill().sift133(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset133() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.sift133(3));
        assertEquals("upper-bound", subject.sift133(8));
    }

    @Test
    void classifiesWithinAndAboveOffset133() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.sift133(3 + 1));
        assertEquals("above", subject.sift133(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift134() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper134());
        }
        assertEquals(3, subject.capacity134Count());
    }

    @Test
    void refusesOnceExhaustedDrift134() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            subject.temper134();
        }
        assertFalse(subject.temper134());
    }

    @Test
    void accumulatesBelowTheCapTally135() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.collate135(1));
        assertEquals(3, subject.collate135(2));
    }

    @Test
    void saturatesAtTheCapTally135() {
        CopperQuill subject = new CopperQuill();
        subject.collate135(35);
        assertEquals(35, subject.collate135(5));
    }

    @Test
    void ignoresNegativeValuesTally135() {
        CopperQuill subject = new CopperQuill();
        subject.collate135(3);
        assertEquals(3, subject.collate135(-2));
        assertEquals(3, subject.weight135Value());
    }

    @Test
    void rejectsZeroDenominatorCadence136() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.brace136(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence136() {
        assertEquals(0.5, new CopperQuill().brace136(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence136() {
        assertEquals(2.0, new CopperQuill().brace136(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally137() {
        assertTrue(new CopperQuill().hoist137(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally137() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new CopperQuill().hoist137(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally137() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuill().hoist137(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield138() {
        assertEquals("below", new CopperQuill().winnow138(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield138() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.winnow138(4));
        assertEquals("upper-bound", subject.winnow138(7));
    }

    @Test
    void classifiesWithinAndAboveYield138() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.winnow138(4 + 1));
        assertEquals("above", subject.winnow138(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity139() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal139());
        }
        assertEquals(4, subject.bias139Count());
    }

    @Test
    void refusesOnceExhaustedCapacity139() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            subject.anneal139();
        }
        assertFalse(subject.anneal139());
    }

    @Test
    void accumulatesBelowTheCapMargin140() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.gauge140(1));
        assertEquals(3, subject.gauge140(2));
    }

    @Test
    void saturatesAtTheCapMargin140() {
        CopperQuill subject = new CopperQuill();
        subject.gauge140(40);
        assertEquals(40, subject.gauge140(5));
    }

    @Test
    void ignoresNegativeValuesMargin140() {
        CopperQuill subject = new CopperQuill();
        subject.gauge140(3);
        assertEquals(3, subject.gauge140(-2));
        assertEquals(3, subject.cadence140Value());
    }

    @Test
    void rejectsZeroDenominatorYield141() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile141(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield141() {
        assertEquals(0.5, new CopperQuill().reconcile141(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield141() {
        assertEquals(2.0, new CopperQuill().reconcile141(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias142() {
        assertTrue(new CopperQuill().flatten142(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias142() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new CopperQuill().flatten142(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias142() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuill().flatten142(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth143() {
        assertEquals("below", new CopperQuill().gauge143(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth143() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.gauge143(5));
        assertEquals("upper-bound", subject.gauge143(12));
    }

    @Test
    void classifiesWithinAndAboveDepth143() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.gauge143(5 + 1));
        assertEquals("above", subject.gauge143(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin144() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal144());
        }
        assertEquals(1, subject.bias144Count());
    }

    @Test
    void refusesOnceExhaustedMargin144() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            subject.anneal144();
        }
        assertFalse(subject.anneal144());
    }

    @Test
    void accumulatesBelowTheCapDrift145() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.sift145(1));
        assertEquals(3, subject.sift145(2));
    }

    @Test
    void saturatesAtTheCapDrift145() {
        CopperQuill subject = new CopperQuill();
        subject.sift145(45);
        assertEquals(45, subject.sift145(5));
    }

    @Test
    void ignoresNegativeValuesDrift145() {
        CopperQuill subject = new CopperQuill();
        subject.sift145(3);
        assertEquals(3, subject.sift145(-2));
        assertEquals(3, subject.depth145Value());
    }

    @Test
    void rejectsZeroDenominatorQuota146() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune146(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota146() {
        assertEquals(0.5, new CopperQuill().prune146(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota146() {
        assertEquals(2.0, new CopperQuill().prune146(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift147() {
        assertTrue(new CopperQuill().sift147(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift147() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new CopperQuill().sift147(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift147() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuill().sift147(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan148() {
        assertEquals("below", new CopperQuill().temper148(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan148() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.temper148(2));
        assertEquals("upper-bound", subject.temper148(11));
    }

    @Test
    void classifiesWithinAndAboveSpan148() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.temper148(2 + 1));
        assertEquals("above", subject.temper148(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity149() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle149());
        }
        assertEquals(2, subject.span149Count());
    }

    @Test
    void refusesOnceExhaustedCapacity149() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            subject.kindle149();
        }
        assertFalse(subject.kindle149());
    }

    @Test
    void accumulatesBelowTheCapDepth150() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.collate150(1));
        assertEquals(3, subject.collate150(2));
    }

    @Test
    void saturatesAtTheCapDepth150() {
        CopperQuill subject = new CopperQuill();
        subject.collate150(50);
        assertEquals(50, subject.collate150(5));
    }

    @Test
    void ignoresNegativeValuesDepth150() {
        CopperQuill subject = new CopperQuill();
        subject.collate150(3);
        assertEquals(3, subject.collate150(-2));
        assertEquals(3, subject.capacity150Value());
    }

    @Test
    void rejectsZeroDenominatorCadence151() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.sift151(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence151() {
        assertEquals(0.5, new CopperQuill().sift151(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence151() {
        assertEquals(2.0, new CopperQuill().sift151(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset152() {
        assertTrue(new CopperQuill().gauge152(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset152() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new CopperQuill().gauge152(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset152() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperQuill().gauge152(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity153() {
        assertEquals("below", new CopperQuill().gauge153(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity153() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.gauge153(3));
        assertEquals("upper-bound", subject.gauge153(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity153() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.gauge153(3 + 1));
        assertEquals("above", subject.gauge153(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity154() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally154());
        }
        assertEquals(3, subject.margin154Count());
    }

    @Test
    void refusesOnceExhaustedCapacity154() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            subject.tally154();
        }
        assertFalse(subject.tally154());
    }

    @Test
    void accumulatesBelowTheCapSpan155() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.collate155(1));
        assertEquals(3, subject.collate155(2));
    }

    @Test
    void saturatesAtTheCapSpan155() {
        CopperQuill subject = new CopperQuill();
        subject.collate155(55);
        assertEquals(55, subject.collate155(5));
    }

    @Test
    void ignoresNegativeValuesSpan155() {
        CopperQuill subject = new CopperQuill();
        subject.collate155(3);
        assertEquals(3, subject.collate155(-2));
        assertEquals(3, subject.capacity155Value());
    }

    @Test
    void rejectsZeroDenominatorWeight156() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.tally156(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight156() {
        assertEquals(0.5, new CopperQuill().tally156(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight156() {
        assertEquals(2.0, new CopperQuill().tally156(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold157() {
        assertTrue(new CopperQuill().brace157(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold157() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new CopperQuill().brace157(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold157() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperQuill().brace157(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield158() {
        assertEquals("below", new CopperQuill().collate158(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield158() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.collate158(4));
        assertEquals("upper-bound", subject.collate158(9));
    }

    @Test
    void classifiesWithinAndAboveYield158() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.collate158(4 + 1));
        assertEquals("above", subject.collate158(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset159() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow159());
        }
        assertEquals(4, subject.weight159Count());
    }

    @Test
    void refusesOnceExhaustedOffset159() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            subject.winnow159();
        }
        assertFalse(subject.winnow159());
    }

    @Test
    void accumulatesBelowTheCapQuota160() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.winnow160(1));
        assertEquals(3, subject.winnow160(2));
    }

    @Test
    void saturatesAtTheCapQuota160() {
        CopperQuill subject = new CopperQuill();
        subject.winnow160(20);
        assertEquals(20, subject.winnow160(5));
    }

    @Test
    void ignoresNegativeValuesQuota160() {
        CopperQuill subject = new CopperQuill();
        subject.winnow160(3);
        assertEquals(3, subject.winnow160(-2));
        assertEquals(3, subject.yield160Value());
    }

    @Test
    void rejectsZeroDenominatorQuota161() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.sift161(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota161() {
        assertEquals(0.5, new CopperQuill().sift161(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota161() {
        assertEquals(2.0, new CopperQuill().sift161(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally162() {
        assertTrue(new CopperQuill().winnow162(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally162() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new CopperQuill().winnow162(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally162() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperQuill().winnow162(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota163() {
        assertEquals("below", new CopperQuill().kindle163(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota163() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.kindle163(5));
        assertEquals("upper-bound", subject.kindle163(8));
    }

    @Test
    void classifiesWithinAndAboveQuota163() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.kindle163(5 + 1));
        assertEquals("above", subject.kindle163(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield164() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally164());
        }
        assertEquals(1, subject.bias164Count());
    }

    @Test
    void refusesOnceExhaustedYield164() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            subject.tally164();
        }
        assertFalse(subject.tally164());
    }

    @Test
    void accumulatesBelowTheCapYield165() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.tally165(1));
        assertEquals(3, subject.tally165(2));
    }

    @Test
    void saturatesAtTheCapYield165() {
        CopperQuill subject = new CopperQuill();
        subject.tally165(25);
        assertEquals(25, subject.tally165(5));
    }

    @Test
    void ignoresNegativeValuesYield165() {
        CopperQuill subject = new CopperQuill();
        subject.tally165(3);
        assertEquals(3, subject.tally165(-2));
        assertEquals(3, subject.drift165Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity166() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.kindle166(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity166() {
        assertEquals(0.5, new CopperQuill().kindle166(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity166() {
        assertEquals(2.0, new CopperQuill().kindle166(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift167() {
        assertTrue(new CopperQuill().anneal167(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift167() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new CopperQuill().anneal167(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift167() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperQuill().anneal167(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset168() {
        assertEquals("below", new CopperQuill().anneal168(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset168() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.anneal168(2));
        assertEquals("upper-bound", subject.anneal168(7));
    }

    @Test
    void classifiesWithinAndAboveOffset168() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.anneal168(2 + 1));
        assertEquals("above", subject.anneal168(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold169() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist169());
        }
        assertEquals(2, subject.capacity169Count());
    }

    @Test
    void refusesOnceExhaustedThreshold169() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            subject.hoist169();
        }
        assertFalse(subject.hoist169());
    }

    @Test
    void accumulatesBelowTheCapSpan170() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.anneal170(1));
        assertEquals(3, subject.anneal170(2));
    }

    @Test
    void saturatesAtTheCapSpan170() {
        CopperQuill subject = new CopperQuill();
        subject.anneal170(30);
        assertEquals(30, subject.anneal170(5));
    }

    @Test
    void ignoresNegativeValuesSpan170() {
        CopperQuill subject = new CopperQuill();
        subject.anneal170(3);
        assertEquals(3, subject.anneal170(-2));
        assertEquals(3, subject.yield170Value());
    }

    @Test
    void rejectsZeroDenominatorTally171() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.anneal171(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally171() {
        assertEquals(0.5, new CopperQuill().anneal171(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally171() {
        assertEquals(2.0, new CopperQuill().anneal171(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio172() {
        assertTrue(new CopperQuill().kindle172(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio172() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new CopperQuill().kindle172(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio172() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperQuill().kindle172(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally173() {
        assertEquals("below", new CopperQuill().brace173(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally173() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.brace173(3));
        assertEquals("upper-bound", subject.brace173(12));
    }

    @Test
    void classifiesWithinAndAboveTally173() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.brace173(3 + 1));
        assertEquals("above", subject.brace173(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight174() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile174());
        }
        assertEquals(3, subject.cadence174Count());
    }

    @Test
    void refusesOnceExhaustedWeight174() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            subject.reconcile174();
        }
        assertFalse(subject.reconcile174());
    }

    @Test
    void accumulatesBelowTheCapSpan175() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.brace175(1));
        assertEquals(3, subject.brace175(2));
    }

    @Test
    void saturatesAtTheCapSpan175() {
        CopperQuill subject = new CopperQuill();
        subject.brace175(35);
        assertEquals(35, subject.brace175(5));
    }

    @Test
    void ignoresNegativeValuesSpan175() {
        CopperQuill subject = new CopperQuill();
        subject.brace175(3);
        assertEquals(3, subject.brace175(-2));
        assertEquals(3, subject.quota175Value());
    }

    @Test
    void rejectsZeroDenominatorCadence176() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.tally176(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence176() {
        assertEquals(0.5, new CopperQuill().tally176(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence176() {
        assertEquals(2.0, new CopperQuill().tally176(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity177() {
        assertTrue(new CopperQuill().hoist177(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity177() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new CopperQuill().hoist177(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity177() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperQuill().hoist177(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan178() {
        assertEquals("below", new CopperQuill().reconcile178(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan178() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.reconcile178(4));
        assertEquals("upper-bound", subject.reconcile178(11));
    }

    @Test
    void classifiesWithinAndAboveSpan178() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.reconcile178(4 + 1));
        assertEquals("above", subject.reconcile178(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset179() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten179());
        }
        assertEquals(4, subject.span179Count());
    }

    @Test
    void refusesOnceExhaustedOffset179() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            subject.flatten179();
        }
        assertFalse(subject.flatten179());
    }

    @Test
    void accumulatesBelowTheCapCapacity180() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.collate180(1));
        assertEquals(3, subject.collate180(2));
    }

    @Test
    void saturatesAtTheCapCapacity180() {
        CopperQuill subject = new CopperQuill();
        subject.collate180(40);
        assertEquals(40, subject.collate180(5));
    }

    @Test
    void ignoresNegativeValuesCapacity180() {
        CopperQuill subject = new CopperQuill();
        subject.collate180(3);
        assertEquals(3, subject.collate180(-2));
        assertEquals(3, subject.depth180Value());
    }

    @Test
    void rejectsZeroDenominatorCadence181() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.kindle181(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence181() {
        assertEquals(0.5, new CopperQuill().kindle181(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence181() {
        assertEquals(2.0, new CopperQuill().kindle181(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset182() {
        assertTrue(new CopperQuill().gauge182(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset182() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new CopperQuill().gauge182(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset182() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuill().gauge182(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth183() {
        assertEquals("below", new CopperQuill().kindle183(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth183() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.kindle183(5));
        assertEquals("upper-bound", subject.kindle183(10));
    }

    @Test
    void classifiesWithinAndAboveDepth183() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.kindle183(5 + 1));
        assertEquals("above", subject.kindle183(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally184() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile184());
        }
        assertEquals(1, subject.quota184Count());
    }

    @Test
    void refusesOnceExhaustedTally184() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            subject.reconcile184();
        }
        assertFalse(subject.reconcile184());
    }

    @Test
    void accumulatesBelowTheCapMargin185() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.gauge185(1));
        assertEquals(3, subject.gauge185(2));
    }

    @Test
    void saturatesAtTheCapMargin185() {
        CopperQuill subject = new CopperQuill();
        subject.gauge185(45);
        assertEquals(45, subject.gauge185(5));
    }

    @Test
    void ignoresNegativeValuesMargin185() {
        CopperQuill subject = new CopperQuill();
        subject.gauge185(3);
        assertEquals(3, subject.gauge185(-2));
        assertEquals(3, subject.span185Value());
    }

    @Test
    void rejectsZeroDenominatorMargin186() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.sift186(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin186() {
        assertEquals(0.5, new CopperQuill().sift186(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin186() {
        assertEquals(2.0, new CopperQuill().sift186(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota187() {
        assertTrue(new CopperQuill().winnow187(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota187() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new CopperQuill().winnow187(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota187() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuill().winnow187(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield188() {
        assertEquals("below", new CopperQuill().tally188(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield188() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.tally188(2));
        assertEquals("upper-bound", subject.tally188(9));
    }

    @Test
    void classifiesWithinAndAboveYield188() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.tally188(2 + 1));
        assertEquals("above", subject.tally188(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias189() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle189());
        }
        assertEquals(2, subject.quota189Count());
    }

    @Test
    void refusesOnceExhaustedBias189() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            subject.kindle189();
        }
        assertFalse(subject.kindle189());
    }

    @Test
    void accumulatesBelowTheCapRatio190() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.furl190(1));
        assertEquals(3, subject.furl190(2));
    }

    @Test
    void saturatesAtTheCapRatio190() {
        CopperQuill subject = new CopperQuill();
        subject.furl190(50);
        assertEquals(50, subject.furl190(5));
    }

    @Test
    void ignoresNegativeValuesRatio190() {
        CopperQuill subject = new CopperQuill();
        subject.furl190(3);
        assertEquals(3, subject.furl190(-2));
        assertEquals(3, subject.cadence190Value());
    }

    @Test
    void rejectsZeroDenominatorRatio191() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow191(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio191() {
        assertEquals(0.5, new CopperQuill().winnow191(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio191() {
        assertEquals(2.0, new CopperQuill().winnow191(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally192() {
        assertTrue(new CopperQuill().flatten192(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally192() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new CopperQuill().flatten192(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally192() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuill().flatten192(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight193() {
        assertEquals("below", new CopperQuill().winnow193(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight193() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.winnow193(3));
        assertEquals("upper-bound", subject.winnow193(8));
    }

    @Test
    void classifiesWithinAndAboveWeight193() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.winnow193(3 + 1));
        assertEquals("above", subject.winnow193(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio194() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow194());
        }
        assertEquals(3, subject.depth194Count());
    }

    @Test
    void refusesOnceExhaustedRatio194() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            subject.winnow194();
        }
        assertFalse(subject.winnow194());
    }

    @Test
    void accumulatesBelowTheCapCapacity195() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.temper195(1));
        assertEquals(3, subject.temper195(2));
    }

    @Test
    void saturatesAtTheCapCapacity195() {
        CopperQuill subject = new CopperQuill();
        subject.temper195(55);
        assertEquals(55, subject.temper195(5));
    }

    @Test
    void ignoresNegativeValuesCapacity195() {
        CopperQuill subject = new CopperQuill();
        subject.temper195(3);
        assertEquals(3, subject.temper195(-2));
        assertEquals(3, subject.threshold195Value());
    }

    @Test
    void rejectsZeroDenominatorWeight196() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.kindle196(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight196() {
        assertEquals(0.5, new CopperQuill().kindle196(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight196() {
        assertEquals(2.0, new CopperQuill().kindle196(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold197() {
        assertTrue(new CopperQuill().brace197(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold197() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new CopperQuill().brace197(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold197() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperQuill().brace197(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight198() {
        assertEquals("below", new CopperQuill().hoist198(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight198() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.hoist198(4));
        assertEquals("upper-bound", subject.hoist198(7));
    }

    @Test
    void classifiesWithinAndAboveWeight198() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.hoist198(4 + 1));
        assertEquals("above", subject.hoist198(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally199() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace199());
        }
        assertEquals(4, subject.weight199Count());
    }

    @Test
    void refusesOnceExhaustedTally199() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            subject.brace199();
        }
        assertFalse(subject.brace199());
    }

    @Test
    void accumulatesBelowTheCapTally200() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.collate200(1));
        assertEquals(3, subject.collate200(2));
    }

    @Test
    void saturatesAtTheCapTally200() {
        CopperQuill subject = new CopperQuill();
        subject.collate200(20);
        assertEquals(20, subject.collate200(5));
    }

    @Test
    void ignoresNegativeValuesTally200() {
        CopperQuill subject = new CopperQuill();
        subject.collate200(3);
        assertEquals(3, subject.collate200(-2));
        assertEquals(3, subject.depth200Value());
    }

    @Test
    void rejectsZeroDenominatorCadence201() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.tally201(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence201() {
        assertEquals(0.5, new CopperQuill().tally201(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence201() {
        assertEquals(2.0, new CopperQuill().tally201(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan202() {
        assertTrue(new CopperQuill().sift202(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan202() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new CopperQuill().sift202(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan202() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperQuill().sift202(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan203() {
        assertEquals("below", new CopperQuill().flatten203(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan203() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.flatten203(5));
        assertEquals("upper-bound", subject.flatten203(12));
    }

    @Test
    void classifiesWithinAndAboveSpan203() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.flatten203(5 + 1));
        assertEquals("above", subject.flatten203(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth204() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow204());
        }
        assertEquals(1, subject.offset204Count());
    }

    @Test
    void refusesOnceExhaustedDepth204() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            subject.winnow204();
        }
        assertFalse(subject.winnow204());
    }

    @Test
    void accumulatesBelowTheCapBias205() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.winnow205(1));
        assertEquals(3, subject.winnow205(2));
    }

    @Test
    void saturatesAtTheCapBias205() {
        CopperQuill subject = new CopperQuill();
        subject.winnow205(25);
        assertEquals(25, subject.winnow205(5));
    }

    @Test
    void ignoresNegativeValuesBias205() {
        CopperQuill subject = new CopperQuill();
        subject.winnow205(3);
        assertEquals(3, subject.winnow205(-2));
        assertEquals(3, subject.span205Value());
    }

    @Test
    void rejectsZeroDenominatorWeight206() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.temper206(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight206() {
        assertEquals(0.5, new CopperQuill().temper206(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight206() {
        assertEquals(2.0, new CopperQuill().temper206(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias207() {
        assertTrue(new CopperQuill().collate207(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias207() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new CopperQuill().collate207(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias207() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperQuill().collate207(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota208() {
        assertEquals("below", new CopperQuill().collate208(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota208() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.collate208(2));
        assertEquals("upper-bound", subject.collate208(11));
    }

    @Test
    void classifiesWithinAndAboveQuota208() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.collate208(2 + 1));
        assertEquals("above", subject.collate208(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield209() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate209());
        }
        assertEquals(2, subject.drift209Count());
    }

    @Test
    void refusesOnceExhaustedYield209() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            subject.collate209();
        }
        assertFalse(subject.collate209());
    }

    @Test
    void accumulatesBelowTheCapDepth210() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.collate210(1));
        assertEquals(3, subject.collate210(2));
    }

    @Test
    void saturatesAtTheCapDepth210() {
        CopperQuill subject = new CopperQuill();
        subject.collate210(30);
        assertEquals(30, subject.collate210(5));
    }

    @Test
    void ignoresNegativeValuesDepth210() {
        CopperQuill subject = new CopperQuill();
        subject.collate210(3);
        assertEquals(3, subject.collate210(-2));
        assertEquals(3, subject.bias210Value());
    }

    @Test
    void rejectsZeroDenominatorDrift211() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.brace211(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift211() {
        assertEquals(0.5, new CopperQuill().brace211(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift211() {
        assertEquals(2.0, new CopperQuill().brace211(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias212() {
        assertTrue(new CopperQuill().reconcile212(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias212() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new CopperQuill().reconcile212(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias212() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperQuill().reconcile212(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence213() {
        assertEquals("below", new CopperQuill().hoist213(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence213() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.hoist213(3));
        assertEquals("upper-bound", subject.hoist213(10));
    }

    @Test
    void classifiesWithinAndAboveCadence213() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.hoist213(3 + 1));
        assertEquals("above", subject.hoist213(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias214() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle214());
        }
        assertEquals(3, subject.weight214Count());
    }

    @Test
    void refusesOnceExhaustedBias214() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            subject.kindle214();
        }
        assertFalse(subject.kindle214());
    }

    @Test
    void accumulatesBelowTheCapSpan215() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.sift215(1));
        assertEquals(3, subject.sift215(2));
    }

    @Test
    void saturatesAtTheCapSpan215() {
        CopperQuill subject = new CopperQuill();
        subject.sift215(35);
        assertEquals(35, subject.sift215(5));
    }

    @Test
    void ignoresNegativeValuesSpan215() {
        CopperQuill subject = new CopperQuill();
        subject.sift215(3);
        assertEquals(3, subject.sift215(-2));
        assertEquals(3, subject.weight215Value());
    }

    @Test
    void rejectsZeroDenominatorYield216() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.gauge216(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield216() {
        assertEquals(0.5, new CopperQuill().gauge216(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield216() {
        assertEquals(2.0, new CopperQuill().gauge216(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence217() {
        assertTrue(new CopperQuill().brace217(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence217() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new CopperQuill().brace217(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence217() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperQuill().brace217(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally218() {
        assertEquals("below", new CopperQuill().gauge218(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally218() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.gauge218(4));
        assertEquals("upper-bound", subject.gauge218(9));
    }

    @Test
    void classifiesWithinAndAboveTally218() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.gauge218(4 + 1));
        assertEquals("above", subject.gauge218(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota219() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile219());
        }
        assertEquals(4, subject.margin219Count());
    }

    @Test
    void refusesOnceExhaustedQuota219() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            subject.reconcile219();
        }
        assertFalse(subject.reconcile219());
    }

    @Test
    void accumulatesBelowTheCapCapacity220() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.brace220(1));
        assertEquals(3, subject.brace220(2));
    }

    @Test
    void saturatesAtTheCapCapacity220() {
        CopperQuill subject = new CopperQuill();
        subject.brace220(40);
        assertEquals(40, subject.brace220(5));
    }

    @Test
    void ignoresNegativeValuesCapacity220() {
        CopperQuill subject = new CopperQuill();
        subject.brace220(3);
        assertEquals(3, subject.brace220(-2));
        assertEquals(3, subject.drift220Value());
    }

    @Test
    void rejectsZeroDenominatorOffset221() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.furl221(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset221() {
        assertEquals(0.5, new CopperQuill().furl221(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset221() {
        assertEquals(2.0, new CopperQuill().furl221(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin222() {
        assertTrue(new CopperQuill().furl222(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin222() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new CopperQuill().furl222(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin222() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperQuill().furl222(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally223() {
        assertEquals("below", new CopperQuill().furl223(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally223() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.furl223(5));
        assertEquals("upper-bound", subject.furl223(8));
    }

    @Test
    void classifiesWithinAndAboveTally223() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.furl223(5 + 1));
        assertEquals("above", subject.furl223(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield224() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune224());
        }
        assertEquals(1, subject.cadence224Count());
    }

    @Test
    void refusesOnceExhaustedYield224() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            subject.prune224();
        }
        assertFalse(subject.prune224());
    }

    @Test
    void accumulatesBelowTheCapSpan225() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.flatten225(1));
        assertEquals(3, subject.flatten225(2));
    }

    @Test
    void saturatesAtTheCapSpan225() {
        CopperQuill subject = new CopperQuill();
        subject.flatten225(45);
        assertEquals(45, subject.flatten225(5));
    }

    @Test
    void ignoresNegativeValuesSpan225() {
        CopperQuill subject = new CopperQuill();
        subject.flatten225(3);
        assertEquals(3, subject.flatten225(-2));
        assertEquals(3, subject.margin225Value());
    }

    @Test
    void rejectsZeroDenominatorBias226() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile226(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias226() {
        assertEquals(0.5, new CopperQuill().reconcile226(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias226() {
        assertEquals(2.0, new CopperQuill().reconcile226(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally227() {
        assertTrue(new CopperQuill().collate227(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally227() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new CopperQuill().collate227(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally227() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuill().collate227(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift228() {
        assertEquals("below", new CopperQuill().tally228(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift228() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.tally228(2));
        assertEquals("upper-bound", subject.tally228(7));
    }

    @Test
    void classifiesWithinAndAboveDrift228() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.tally228(2 + 1));
        assertEquals("above", subject.tally228(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift229() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal229());
        }
        assertEquals(2, subject.margin229Count());
    }

    @Test
    void refusesOnceExhaustedDrift229() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            subject.anneal229();
        }
        assertFalse(subject.anneal229());
    }

    @Test
    void accumulatesBelowTheCapWeight230() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.tally230(1));
        assertEquals(3, subject.tally230(2));
    }

    @Test
    void saturatesAtTheCapWeight230() {
        CopperQuill subject = new CopperQuill();
        subject.tally230(50);
        assertEquals(50, subject.tally230(5));
    }

    @Test
    void ignoresNegativeValuesWeight230() {
        CopperQuill subject = new CopperQuill();
        subject.tally230(3);
        assertEquals(3, subject.tally230(-2));
        assertEquals(3, subject.quota230Value());
    }

    @Test
    void rejectsZeroDenominatorOffset231() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile231(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset231() {
        assertEquals(0.5, new CopperQuill().reconcile231(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset231() {
        assertEquals(2.0, new CopperQuill().reconcile231(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield232() {
        assertTrue(new CopperQuill().furl232(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield232() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new CopperQuill().furl232(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield232() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuill().furl232(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight233() {
        assertEquals("below", new CopperQuill().temper233(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight233() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.temper233(3));
        assertEquals("upper-bound", subject.temper233(12));
    }

    @Test
    void classifiesWithinAndAboveWeight233() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.temper233(3 + 1));
        assertEquals("above", subject.temper233(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth234() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist234());
        }
        assertEquals(3, subject.cadence234Count());
    }

    @Test
    void refusesOnceExhaustedDepth234() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 3; i++) {
            subject.hoist234();
        }
        assertFalse(subject.hoist234());
    }

    @Test
    void accumulatesBelowTheCapQuota235() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.collate235(1));
        assertEquals(3, subject.collate235(2));
    }

    @Test
    void saturatesAtTheCapQuota235() {
        CopperQuill subject = new CopperQuill();
        subject.collate235(55);
        assertEquals(55, subject.collate235(5));
    }

    @Test
    void ignoresNegativeValuesQuota235() {
        CopperQuill subject = new CopperQuill();
        subject.collate235(3);
        assertEquals(3, subject.collate235(-2));
        assertEquals(3, subject.weight235Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity236() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.gauge236(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity236() {
        assertEquals(0.5, new CopperQuill().gauge236(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity236() {
        assertEquals(2.0, new CopperQuill().gauge236(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio237() {
        assertTrue(new CopperQuill().anneal237(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio237() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new CopperQuill().anneal237(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio237() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuill().anneal237(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally238() {
        assertEquals("below", new CopperQuill().tally238(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally238() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.tally238(4));
        assertEquals("upper-bound", subject.tally238(11));
    }

    @Test
    void classifiesWithinAndAboveTally238() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.tally238(4 + 1));
        assertEquals("above", subject.tally238(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth239() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle239());
        }
        assertEquals(4, subject.yield239Count());
    }

    @Test
    void refusesOnceExhaustedDepth239() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 4; i++) {
            subject.kindle239();
        }
        assertFalse(subject.kindle239());
    }

    @Test
    void accumulatesBelowTheCapSpan240() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.furl240(1));
        assertEquals(3, subject.furl240(2));
    }

    @Test
    void saturatesAtTheCapSpan240() {
        CopperQuill subject = new CopperQuill();
        subject.furl240(20);
        assertEquals(20, subject.furl240(5));
    }

    @Test
    void ignoresNegativeValuesSpan240() {
        CopperQuill subject = new CopperQuill();
        subject.furl240(3);
        assertEquals(3, subject.furl240(-2));
        assertEquals(3, subject.yield240Value());
    }

    @Test
    void rejectsZeroDenominatorBias241() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile241(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias241() {
        assertEquals(0.5, new CopperQuill().reconcile241(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias241() {
        assertEquals(2.0, new CopperQuill().reconcile241(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift242() {
        assertTrue(new CopperQuill().anneal242(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift242() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new CopperQuill().anneal242(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift242() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperQuill().anneal242(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence243() {
        assertEquals("below", new CopperQuill().reconcile243(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence243() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.reconcile243(5));
        assertEquals("upper-bound", subject.reconcile243(10));
    }

    @Test
    void classifiesWithinAndAboveCadence243() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.reconcile243(5 + 1));
        assertEquals("above", subject.reconcile243(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias244() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally244());
        }
        assertEquals(1, subject.yield244Count());
    }

    @Test
    void refusesOnceExhaustedBias244() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 1; i++) {
            subject.tally244();
        }
        assertFalse(subject.tally244());
    }

    @Test
    void accumulatesBelowTheCapWeight245() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.tally245(1));
        assertEquals(3, subject.tally245(2));
    }

    @Test
    void saturatesAtTheCapWeight245() {
        CopperQuill subject = new CopperQuill();
        subject.tally245(25);
        assertEquals(25, subject.tally245(5));
    }

    @Test
    void ignoresNegativeValuesWeight245() {
        CopperQuill subject = new CopperQuill();
        subject.tally245(3);
        assertEquals(3, subject.tally245(-2));
        assertEquals(3, subject.tally245Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold246() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.flatten246(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold246() {
        assertEquals(0.5, new CopperQuill().flatten246(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold246() {
        assertEquals(2.0, new CopperQuill().flatten246(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield247() {
        assertTrue(new CopperQuill().winnow247(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield247() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new CopperQuill().winnow247(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield247() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperQuill().winnow247(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence248() {
        assertEquals("below", new CopperQuill().collate248(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence248() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.collate248(2));
        assertEquals("upper-bound", subject.collate248(9));
    }

    @Test
    void classifiesWithinAndAboveCadence248() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.collate248(2 + 1));
        assertEquals("above", subject.collate248(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin249() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune249());
        }
        assertEquals(2, subject.tally249Count());
    }

    @Test
    void refusesOnceExhaustedMargin249() {
        CopperQuill subject = new CopperQuill();
        for (int i = 0; i < 2; i++) {
            subject.prune249();
        }
        assertFalse(subject.prune249());
    }

    @Test
    void accumulatesBelowTheCapThreshold250() {
        CopperQuill subject = new CopperQuill();
        assertEquals(1, subject.kindle250(1));
        assertEquals(3, subject.kindle250(2));
    }

    @Test
    void saturatesAtTheCapThreshold250() {
        CopperQuill subject = new CopperQuill();
        subject.kindle250(30);
        assertEquals(30, subject.kindle250(5));
    }

    @Test
    void ignoresNegativeValuesThreshold250() {
        CopperQuill subject = new CopperQuill();
        subject.kindle250(3);
        assertEquals(3, subject.kindle250(-2));
        assertEquals(3, subject.weight250Value());
    }

    @Test
    void rejectsZeroDenominatorSpan251() {
        CopperQuill subject = new CopperQuill();
        assertThrows(ArithmeticException.class, () -> subject.furl251(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan251() {
        assertEquals(0.5, new CopperQuill().furl251(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan251() {
        assertEquals(2.0, new CopperQuill().furl251(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin252() {
        assertTrue(new CopperQuill().tally252(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin252() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new CopperQuill().tally252(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin252() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperQuill().tally252(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold253() {
        assertEquals("below", new CopperQuill().reconcile253(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold253() {
        CopperQuill subject = new CopperQuill();
        assertEquals("lower-bound", subject.reconcile253(3));
        assertEquals("upper-bound", subject.reconcile253(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold253() {
        CopperQuill subject = new CopperQuill();
        assertEquals("within", subject.reconcile253(3 + 1));
        assertEquals("above", subject.reconcile253(8 + 1));
    }
}
