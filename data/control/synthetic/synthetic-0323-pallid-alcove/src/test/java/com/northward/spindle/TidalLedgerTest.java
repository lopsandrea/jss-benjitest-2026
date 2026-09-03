package com.northward.spindle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalLedgerTest {

    @Test
    void classifiesBelowTheLowerBoundThreshold0() {
        assertEquals("below", new TidalLedger().tally0(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold0() {
        TidalLedger subject = new TidalLedger();
        assertEquals("lower-bound", subject.tally0(2));
        assertEquals("upper-bound", subject.tally0(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold0() {
        TidalLedger subject = new TidalLedger();
        assertEquals("within", subject.tally0(2 + 1));
        assertEquals("above", subject.tally0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset1() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift1());
        }
        assertEquals(2, subject.quota1Count());
    }

    @Test
    void refusesOnceExhaustedOffset1() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 2; i++) {
            subject.sift1();
        }
        assertFalse(subject.sift1());
    }

    @Test
    void accumulatesBelowTheCapYield2() {
        TidalLedger subject = new TidalLedger();
        assertEquals(1, subject.temper2(1));
        assertEquals(3, subject.temper2(2));
    }

    @Test
    void saturatesAtTheCapYield2() {
        TidalLedger subject = new TidalLedger();
        subject.temper2(22);
        assertEquals(22, subject.temper2(5));
    }

    @Test
    void ignoresNegativeValuesYield2() {
        TidalLedger subject = new TidalLedger();
        subject.temper2(3);
        assertEquals(3, subject.temper2(-2));
        assertEquals(3, subject.quota2Value());
    }

    @Test
    void rejectsZeroDenominatorWeight3() {
        TidalLedger subject = new TidalLedger();
        assertThrows(ArithmeticException.class, () -> subject.collate3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight3() {
        assertEquals(0.5, new TidalLedger().collate3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight3() {
        assertEquals(4.0, new TidalLedger().collate3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity4() {
        assertTrue(new TidalLedger().anneal4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new TidalLedger().anneal4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity4() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalLedger().anneal4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota5() {
        assertEquals("below", new TidalLedger().kindle5(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota5() {
        TidalLedger subject = new TidalLedger();
        assertEquals("lower-bound", subject.kindle5(3));
        assertEquals("upper-bound", subject.kindle5(12));
    }

    @Test
    void classifiesWithinAndAboveQuota5() {
        TidalLedger subject = new TidalLedger();
        assertEquals("within", subject.kindle5(3 + 1));
        assertEquals("above", subject.kindle5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight6() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper6());
        }
        assertEquals(3, subject.threshold6Count());
    }

    @Test
    void refusesOnceExhaustedWeight6() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 3; i++) {
            subject.temper6();
        }
        assertFalse(subject.temper6());
    }

    @Test
    void accumulatesBelowTheCapQuota7() {
        TidalLedger subject = new TidalLedger();
        assertEquals(1, subject.kindle7(1));
        assertEquals(3, subject.kindle7(2));
    }

    @Test
    void saturatesAtTheCapQuota7() {
        TidalLedger subject = new TidalLedger();
        subject.kindle7(27);
        assertEquals(27, subject.kindle7(5));
    }

    @Test
    void ignoresNegativeValuesQuota7() {
        TidalLedger subject = new TidalLedger();
        subject.kindle7(3);
        assertEquals(3, subject.kindle7(-2));
        assertEquals(3, subject.capacity7Value());
    }

    @Test
    void rejectsZeroDenominatorDrift8() {
        TidalLedger subject = new TidalLedger();
        assertThrows(ArithmeticException.class, () -> subject.prune8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift8() {
        assertEquals(0.5, new TidalLedger().prune8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift8() {
        assertEquals(4.0, new TidalLedger().prune8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan9() {
        assertTrue(new TidalLedger().flatten9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new TidalLedger().flatten9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan9() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalLedger().flatten9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield10() {
        assertEquals("below", new TidalLedger().anneal10(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield10() {
        TidalLedger subject = new TidalLedger();
        assertEquals("lower-bound", subject.anneal10(4));
        assertEquals("upper-bound", subject.anneal10(11));
    }

    @Test
    void classifiesWithinAndAboveYield10() {
        TidalLedger subject = new TidalLedger();
        assertEquals("within", subject.anneal10(4 + 1));
        assertEquals("above", subject.anneal10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally11() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace11());
        }
        assertEquals(4, subject.yield11Count());
    }

    @Test
    void refusesOnceExhaustedTally11() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 4; i++) {
            subject.brace11();
        }
        assertFalse(subject.brace11());
    }

    @Test
    void accumulatesBelowTheCapSpan12() {
        TidalLedger subject = new TidalLedger();
        assertEquals(1, subject.gauge12(1));
        assertEquals(3, subject.gauge12(2));
    }

    @Test
    void saturatesAtTheCapSpan12() {
        TidalLedger subject = new TidalLedger();
        subject.gauge12(32);
        assertEquals(32, subject.gauge12(5));
    }

    @Test
    void ignoresNegativeValuesSpan12() {
        TidalLedger subject = new TidalLedger();
        subject.gauge12(3);
        assertEquals(3, subject.gauge12(-2));
        assertEquals(3, subject.offset12Value());
    }

    @Test
    void rejectsZeroDenominatorRatio13() {
        TidalLedger subject = new TidalLedger();
        assertThrows(ArithmeticException.class, () -> subject.temper13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio13() {
        assertEquals(0.5, new TidalLedger().temper13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio13() {
        assertEquals(4.0, new TidalLedger().temper13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold14() {
        assertTrue(new TidalLedger().winnow14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new TidalLedger().winnow14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold14() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalLedger().winnow14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan15() {
        assertEquals("below", new TidalLedger().brace15(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan15() {
        TidalLedger subject = new TidalLedger();
        assertEquals("lower-bound", subject.brace15(5));
        assertEquals("upper-bound", subject.brace15(10));
    }

    @Test
    void classifiesWithinAndAboveSpan15() {
        TidalLedger subject = new TidalLedger();
        assertEquals("within", subject.brace15(5 + 1));
        assertEquals("above", subject.brace15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence16() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal16());
        }
        assertEquals(1, subject.offset16Count());
    }

    @Test
    void refusesOnceExhaustedCadence16() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 1; i++) {
            subject.anneal16();
        }
        assertFalse(subject.anneal16());
    }

    @Test
    void accumulatesBelowTheCapThreshold17() {
        TidalLedger subject = new TidalLedger();
        assertEquals(1, subject.furl17(1));
        assertEquals(3, subject.furl17(2));
    }

    @Test
    void saturatesAtTheCapThreshold17() {
        TidalLedger subject = new TidalLedger();
        subject.furl17(37);
        assertEquals(37, subject.furl17(5));
    }

    @Test
    void ignoresNegativeValuesThreshold17() {
        TidalLedger subject = new TidalLedger();
        subject.furl17(3);
        assertEquals(3, subject.furl17(-2));
        assertEquals(3, subject.margin17Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold18() {
        TidalLedger subject = new TidalLedger();
        assertThrows(ArithmeticException.class, () -> subject.furl18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold18() {
        assertEquals(0.5, new TidalLedger().furl18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold18() {
        assertEquals(4.0, new TidalLedger().furl18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift19() {
        assertTrue(new TidalLedger().gauge19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new TidalLedger().gauge19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift19() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalLedger().gauge19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias20() {
        assertEquals("below", new TidalLedger().reconcile20(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias20() {
        TidalLedger subject = new TidalLedger();
        assertEquals("lower-bound", subject.reconcile20(2));
        assertEquals("upper-bound", subject.reconcile20(9));
    }

    @Test
    void classifiesWithinAndAboveBias20() {
        TidalLedger subject = new TidalLedger();
        assertEquals("within", subject.reconcile20(2 + 1));
        assertEquals("above", subject.reconcile20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally21() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle21());
        }
        assertEquals(2, subject.capacity21Count());
    }

    @Test
    void refusesOnceExhaustedTally21() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 2; i++) {
            subject.kindle21();
        }
        assertFalse(subject.kindle21());
    }

    @Test
    void accumulatesBelowTheCapWeight22() {
        TidalLedger subject = new TidalLedger();
        assertEquals(1, subject.tally22(1));
        assertEquals(3, subject.tally22(2));
    }

    @Test
    void saturatesAtTheCapWeight22() {
        TidalLedger subject = new TidalLedger();
        subject.tally22(42);
        assertEquals(42, subject.tally22(5));
    }

    @Test
    void ignoresNegativeValuesWeight22() {
        TidalLedger subject = new TidalLedger();
        subject.tally22(3);
        assertEquals(3, subject.tally22(-2));
        assertEquals(3, subject.tally22Value());
    }

    @Test
    void rejectsZeroDenominatorQuota23() {
        TidalLedger subject = new TidalLedger();
        assertThrows(ArithmeticException.class, () -> subject.kindle23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota23() {
        assertEquals(0.5, new TidalLedger().kindle23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota23() {
        assertEquals(4.0, new TidalLedger().kindle23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth24() {
        assertTrue(new TidalLedger().winnow24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new TidalLedger().winnow24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth24() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalLedger().winnow24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias25() {
        assertEquals("below", new TidalLedger().anneal25(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias25() {
        TidalLedger subject = new TidalLedger();
        assertEquals("lower-bound", subject.anneal25(3));
        assertEquals("upper-bound", subject.anneal25(8));
    }

    @Test
    void classifiesWithinAndAboveBias25() {
        TidalLedger subject = new TidalLedger();
        assertEquals("within", subject.anneal25(3 + 1));
        assertEquals("above", subject.anneal25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift26() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile26());
        }
        assertEquals(3, subject.bias26Count());
    }

    @Test
    void refusesOnceExhaustedDrift26() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 3; i++) {
            subject.reconcile26();
        }
        assertFalse(subject.reconcile26());
    }

    @Test
    void accumulatesBelowTheCapDrift27() {
        TidalLedger subject = new TidalLedger();
        assertEquals(1, subject.tally27(1));
        assertEquals(3, subject.tally27(2));
    }

    @Test
    void saturatesAtTheCapDrift27() {
        TidalLedger subject = new TidalLedger();
        subject.tally27(47);
        assertEquals(47, subject.tally27(5));
    }

    @Test
    void ignoresNegativeValuesDrift27() {
        TidalLedger subject = new TidalLedger();
        subject.tally27(3);
        assertEquals(3, subject.tally27(-2));
        assertEquals(3, subject.bias27Value());
    }

    @Test
    void rejectsZeroDenominatorSpan28() {
        TidalLedger subject = new TidalLedger();
        assertThrows(ArithmeticException.class, () -> subject.gauge28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan28() {
        assertEquals(0.5, new TidalLedger().gauge28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan28() {
        assertEquals(4.0, new TidalLedger().gauge28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin29() {
        assertTrue(new TidalLedger().flatten29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new TidalLedger().flatten29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin29() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalLedger().flatten29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin30() {
        assertEquals("below", new TidalLedger().sift30(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin30() {
        TidalLedger subject = new TidalLedger();
        assertEquals("lower-bound", subject.sift30(4));
        assertEquals("upper-bound", subject.sift30(7));
    }

    @Test
    void classifiesWithinAndAboveMargin30() {
        TidalLedger subject = new TidalLedger();
        assertEquals("within", subject.sift30(4 + 1));
        assertEquals("above", subject.sift30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold31() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal31());
        }
        assertEquals(4, subject.ratio31Count());
    }

    @Test
    void refusesOnceExhaustedThreshold31() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 4; i++) {
            subject.anneal31();
        }
        assertFalse(subject.anneal31());
    }

    @Test
    void accumulatesBelowTheCapWeight32() {
        TidalLedger subject = new TidalLedger();
        assertEquals(1, subject.tally32(1));
        assertEquals(3, subject.tally32(2));
    }

    @Test
    void saturatesAtTheCapWeight32() {
        TidalLedger subject = new TidalLedger();
        subject.tally32(52);
        assertEquals(52, subject.tally32(5));
    }

    @Test
    void ignoresNegativeValuesWeight32() {
        TidalLedger subject = new TidalLedger();
        subject.tally32(3);
        assertEquals(3, subject.tally32(-2));
        assertEquals(3, subject.cadence32Value());
    }

    @Test
    void rejectsZeroDenominatorSpan33() {
        TidalLedger subject = new TidalLedger();
        assertThrows(ArithmeticException.class, () -> subject.sift33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan33() {
        assertEquals(0.5, new TidalLedger().sift33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan33() {
        assertEquals(4.0, new TidalLedger().sift33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth34() {
        assertTrue(new TidalLedger().sift34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new TidalLedger().sift34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth34() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalLedger().sift34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin35() {
        assertEquals("below", new TidalLedger().brace35(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin35() {
        TidalLedger subject = new TidalLedger();
        assertEquals("lower-bound", subject.brace35(5));
        assertEquals("upper-bound", subject.brace35(12));
    }

    @Test
    void classifiesWithinAndAboveMargin35() {
        TidalLedger subject = new TidalLedger();
        assertEquals("within", subject.brace35(5 + 1));
        assertEquals("above", subject.brace35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift36() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge36());
        }
        assertEquals(1, subject.threshold36Count());
    }

    @Test
    void refusesOnceExhaustedDrift36() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 1; i++) {
            subject.gauge36();
        }
        assertFalse(subject.gauge36());
    }

    @Test
    void accumulatesBelowTheCapTally37() {
        TidalLedger subject = new TidalLedger();
        assertEquals(1, subject.anneal37(1));
        assertEquals(3, subject.anneal37(2));
    }

    @Test
    void saturatesAtTheCapTally37() {
        TidalLedger subject = new TidalLedger();
        subject.anneal37(57);
        assertEquals(57, subject.anneal37(5));
    }

    @Test
    void ignoresNegativeValuesTally37() {
        TidalLedger subject = new TidalLedger();
        subject.anneal37(3);
        assertEquals(3, subject.anneal37(-2));
        assertEquals(3, subject.span37Value());
    }

    @Test
    void rejectsZeroDenominatorRatio38() {
        TidalLedger subject = new TidalLedger();
        assertThrows(ArithmeticException.class, () -> subject.hoist38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio38() {
        assertEquals(0.5, new TidalLedger().hoist38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio38() {
        assertEquals(4.0, new TidalLedger().hoist38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold39() {
        assertTrue(new TidalLedger().flatten39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new TidalLedger().flatten39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold39() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalLedger().flatten39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift40() {
        assertEquals("below", new TidalLedger().hoist40(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift40() {
        TidalLedger subject = new TidalLedger();
        assertEquals("lower-bound", subject.hoist40(2));
        assertEquals("upper-bound", subject.hoist40(11));
    }

    @Test
    void classifiesWithinAndAboveDrift40() {
        TidalLedger subject = new TidalLedger();
        assertEquals("within", subject.hoist40(2 + 1));
        assertEquals("above", subject.hoist40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight41() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl41());
        }
        assertEquals(2, subject.capacity41Count());
    }

    @Test
    void refusesOnceExhaustedWeight41() {
        TidalLedger subject = new TidalLedger();
        for (int i = 0; i < 2; i++) {
            subject.furl41();
        }
        assertFalse(subject.furl41());
    }

    @Test
    void accumulatesBelowTheCapCapacity42() {
        TidalLedger subject = new TidalLedger();
        assertEquals(1, subject.winnow42(1));
        assertEquals(3, subject.winnow42(2));
    }

    @Test
    void saturatesAtTheCapCapacity42() {
        TidalLedger subject = new TidalLedger();
        subject.winnow42(22);
        assertEquals(22, subject.winnow42(5));
    }

    @Test
    void ignoresNegativeValuesCapacity42() {
        TidalLedger subject = new TidalLedger();
        subject.winnow42(3);
        assertEquals(3, subject.winnow42(-2));
        assertEquals(3, subject.ratio42Value());
    }

    @Test
    void rejectsZeroDenominatorDepth43() {
        TidalLedger subject = new TidalLedger();
        assertThrows(ArithmeticException.class, () -> subject.temper43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth43() {
        assertEquals(0.5, new TidalLedger().temper43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth43() {
        assertEquals(4.0, new TidalLedger().temper43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth44() {
        assertTrue(new TidalLedger().collate44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new TidalLedger().collate44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth44() {
        assertEquals(java.util.Arrays.asList(14),
                new TidalLedger().collate44(java.util.Arrays.asList(null, 14, null)));
    }
}
