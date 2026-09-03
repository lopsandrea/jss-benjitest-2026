package com.copper.beacon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateLedgerTest {

    @Test
    void rejectsZeroDenominatorQuota0() {
        SlateLedger subject = new SlateLedger();
        assertThrows(ArithmeticException.class, () -> subject.hoist0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota0() {
        assertEquals(0.5, new SlateLedger().hoist0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota0() {
        assertEquals(1.0, new SlateLedger().hoist0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift1() {
        assertTrue(new SlateLedger().winnow1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new SlateLedger().winnow1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift1() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateLedger().winnow1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence2() {
        assertEquals("below", new SlateLedger().gauge2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence2() {
        SlateLedger subject = new SlateLedger();
        assertEquals("lower-bound", subject.gauge2(4));
        assertEquals("upper-bound", subject.gauge2(9));
    }

    @Test
    void classifiesWithinAndAboveCadence2() {
        SlateLedger subject = new SlateLedger();
        assertEquals("within", subject.gauge2(4 + 1));
        assertEquals("above", subject.gauge2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence3() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace3());
        }
        assertEquals(4, subject.quota3Count());
    }

    @Test
    void refusesOnceExhaustedCadence3() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 4; i++) {
            subject.brace3();
        }
        assertFalse(subject.brace3());
    }

    @Test
    void accumulatesBelowTheCapSpan4() {
        SlateLedger subject = new SlateLedger();
        assertEquals(1, subject.gauge4(1));
        assertEquals(3, subject.gauge4(2));
    }

    @Test
    void saturatesAtTheCapSpan4() {
        SlateLedger subject = new SlateLedger();
        subject.gauge4(24);
        assertEquals(24, subject.gauge4(5));
    }

    @Test
    void ignoresNegativeValuesSpan4() {
        SlateLedger subject = new SlateLedger();
        subject.gauge4(3);
        assertEquals(3, subject.gauge4(-2));
        assertEquals(3, subject.yield4Value());
    }

    @Test
    void rejectsZeroDenominatorMargin5() {
        SlateLedger subject = new SlateLedger();
        assertThrows(ArithmeticException.class, () -> subject.temper5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin5() {
        assertEquals(0.5, new SlateLedger().temper5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin5() {
        assertEquals(1.0, new SlateLedger().temper5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift6() {
        assertTrue(new SlateLedger().prune6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new SlateLedger().prune6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift6() {
        assertEquals(java.util.Arrays.asList(12),
                new SlateLedger().prune6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally7() {
        assertEquals("below", new SlateLedger().tally7(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally7() {
        SlateLedger subject = new SlateLedger();
        assertEquals("lower-bound", subject.tally7(5));
        assertEquals("upper-bound", subject.tally7(8));
    }

    @Test
    void classifiesWithinAndAboveTally7() {
        SlateLedger subject = new SlateLedger();
        assertEquals("within", subject.tally7(5 + 1));
        assertEquals("above", subject.tally7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio8() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge8());
        }
        assertEquals(1, subject.capacity8Count());
    }

    @Test
    void refusesOnceExhaustedRatio8() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 1; i++) {
            subject.gauge8();
        }
        assertFalse(subject.gauge8());
    }

    @Test
    void accumulatesBelowTheCapQuota9() {
        SlateLedger subject = new SlateLedger();
        assertEquals(1, subject.tally9(1));
        assertEquals(3, subject.tally9(2));
    }

    @Test
    void saturatesAtTheCapQuota9() {
        SlateLedger subject = new SlateLedger();
        subject.tally9(29);
        assertEquals(29, subject.tally9(5));
    }

    @Test
    void ignoresNegativeValuesQuota9() {
        SlateLedger subject = new SlateLedger();
        subject.tally9(3);
        assertEquals(3, subject.tally9(-2));
        assertEquals(3, subject.cadence9Value());
    }

    @Test
    void rejectsZeroDenominatorSpan10() {
        SlateLedger subject = new SlateLedger();
        assertThrows(ArithmeticException.class, () -> subject.reconcile10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan10() {
        assertEquals(0.5, new SlateLedger().reconcile10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan10() {
        assertEquals(1.0, new SlateLedger().reconcile10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight11() {
        assertTrue(new SlateLedger().tally11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new SlateLedger().tally11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight11() {
        assertEquals(java.util.Arrays.asList(8),
                new SlateLedger().tally11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold12() {
        assertEquals("below", new SlateLedger().hoist12(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold12() {
        SlateLedger subject = new SlateLedger();
        assertEquals("lower-bound", subject.hoist12(2));
        assertEquals("upper-bound", subject.hoist12(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold12() {
        SlateLedger subject = new SlateLedger();
        assertEquals("within", subject.hoist12(2 + 1));
        assertEquals("above", subject.hoist12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight13() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl13());
        }
        assertEquals(2, subject.depth13Count());
    }

    @Test
    void refusesOnceExhaustedWeight13() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 2; i++) {
            subject.furl13();
        }
        assertFalse(subject.furl13());
    }

    @Test
    void accumulatesBelowTheCapCapacity14() {
        SlateLedger subject = new SlateLedger();
        assertEquals(1, subject.prune14(1));
        assertEquals(3, subject.prune14(2));
    }

    @Test
    void saturatesAtTheCapCapacity14() {
        SlateLedger subject = new SlateLedger();
        subject.prune14(34);
        assertEquals(34, subject.prune14(5));
    }

    @Test
    void ignoresNegativeValuesCapacity14() {
        SlateLedger subject = new SlateLedger();
        subject.prune14(3);
        assertEquals(3, subject.prune14(-2));
        assertEquals(3, subject.margin14Value());
    }

    @Test
    void rejectsZeroDenominatorYield15() {
        SlateLedger subject = new SlateLedger();
        assertThrows(ArithmeticException.class, () -> subject.flatten15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield15() {
        assertEquals(0.5, new SlateLedger().flatten15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield15() {
        assertEquals(1.0, new SlateLedger().flatten15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally16() {
        assertTrue(new SlateLedger().reconcile16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new SlateLedger().reconcile16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally16() {
        assertEquals(java.util.Arrays.asList(13),
                new SlateLedger().reconcile16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin17() {
        assertEquals("below", new SlateLedger().hoist17(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin17() {
        SlateLedger subject = new SlateLedger();
        assertEquals("lower-bound", subject.hoist17(3));
        assertEquals("upper-bound", subject.hoist17(12));
    }

    @Test
    void classifiesWithinAndAboveMargin17() {
        SlateLedger subject = new SlateLedger();
        assertEquals("within", subject.hoist17(3 + 1));
        assertEquals("above", subject.hoist17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold18() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge18());
        }
        assertEquals(3, subject.cadence18Count());
    }

    @Test
    void refusesOnceExhaustedThreshold18() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 3; i++) {
            subject.gauge18();
        }
        assertFalse(subject.gauge18());
    }

    @Test
    void accumulatesBelowTheCapWeight19() {
        SlateLedger subject = new SlateLedger();
        assertEquals(1, subject.gauge19(1));
        assertEquals(3, subject.gauge19(2));
    }

    @Test
    void saturatesAtTheCapWeight19() {
        SlateLedger subject = new SlateLedger();
        subject.gauge19(39);
        assertEquals(39, subject.gauge19(5));
    }

    @Test
    void ignoresNegativeValuesWeight19() {
        SlateLedger subject = new SlateLedger();
        subject.gauge19(3);
        assertEquals(3, subject.gauge19(-2));
        assertEquals(3, subject.depth19Value());
    }

    @Test
    void rejectsZeroDenominatorMargin20() {
        SlateLedger subject = new SlateLedger();
        assertThrows(ArithmeticException.class, () -> subject.reconcile20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin20() {
        assertEquals(0.5, new SlateLedger().reconcile20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin20() {
        assertEquals(1.0, new SlateLedger().reconcile20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin21() {
        assertTrue(new SlateLedger().prune21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new SlateLedger().prune21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin21() {
        assertEquals(java.util.Arrays.asList(9),
                new SlateLedger().prune21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight22() {
        assertEquals("below", new SlateLedger().gauge22(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight22() {
        SlateLedger subject = new SlateLedger();
        assertEquals("lower-bound", subject.gauge22(4));
        assertEquals("upper-bound", subject.gauge22(11));
    }

    @Test
    void classifiesWithinAndAboveWeight22() {
        SlateLedger subject = new SlateLedger();
        assertEquals("within", subject.gauge22(4 + 1));
        assertEquals("above", subject.gauge22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias23() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile23());
        }
        assertEquals(4, subject.tally23Count());
    }

    @Test
    void refusesOnceExhaustedBias23() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 4; i++) {
            subject.reconcile23();
        }
        assertFalse(subject.reconcile23());
    }

    @Test
    void accumulatesBelowTheCapQuota24() {
        SlateLedger subject = new SlateLedger();
        assertEquals(1, subject.hoist24(1));
        assertEquals(3, subject.hoist24(2));
    }

    @Test
    void saturatesAtTheCapQuota24() {
        SlateLedger subject = new SlateLedger();
        subject.hoist24(44);
        assertEquals(44, subject.hoist24(5));
    }

    @Test
    void ignoresNegativeValuesQuota24() {
        SlateLedger subject = new SlateLedger();
        subject.hoist24(3);
        assertEquals(3, subject.hoist24(-2));
        assertEquals(3, subject.yield24Value());
    }

    @Test
    void rejectsZeroDenominatorCadence25() {
        SlateLedger subject = new SlateLedger();
        assertThrows(ArithmeticException.class, () -> subject.kindle25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence25() {
        assertEquals(0.5, new SlateLedger().kindle25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence25() {
        assertEquals(1.0, new SlateLedger().kindle25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset26() {
        assertTrue(new SlateLedger().kindle26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new SlateLedger().kindle26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset26() {
        assertEquals(java.util.Arrays.asList(14),
                new SlateLedger().kindle26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias27() {
        assertEquals("below", new SlateLedger().reconcile27(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias27() {
        SlateLedger subject = new SlateLedger();
        assertEquals("lower-bound", subject.reconcile27(5));
        assertEquals("upper-bound", subject.reconcile27(10));
    }

    @Test
    void classifiesWithinAndAboveBias27() {
        SlateLedger subject = new SlateLedger();
        assertEquals("within", subject.reconcile27(5 + 1));
        assertEquals("above", subject.reconcile27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio28() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle28());
        }
        assertEquals(1, subject.bias28Count());
    }

    @Test
    void refusesOnceExhaustedRatio28() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 1; i++) {
            subject.kindle28();
        }
        assertFalse(subject.kindle28());
    }

    @Test
    void accumulatesBelowTheCapDepth29() {
        SlateLedger subject = new SlateLedger();
        assertEquals(1, subject.anneal29(1));
        assertEquals(3, subject.anneal29(2));
    }

    @Test
    void saturatesAtTheCapDepth29() {
        SlateLedger subject = new SlateLedger();
        subject.anneal29(49);
        assertEquals(49, subject.anneal29(5));
    }

    @Test
    void ignoresNegativeValuesDepth29() {
        SlateLedger subject = new SlateLedger();
        subject.anneal29(3);
        assertEquals(3, subject.anneal29(-2));
        assertEquals(3, subject.capacity29Value());
    }

    @Test
    void rejectsZeroDenominatorTally30() {
        SlateLedger subject = new SlateLedger();
        assertThrows(ArithmeticException.class, () -> subject.tally30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally30() {
        assertEquals(0.5, new SlateLedger().tally30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally30() {
        assertEquals(1.0, new SlateLedger().tally30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio31() {
        assertTrue(new SlateLedger().prune31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new SlateLedger().prune31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio31() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateLedger().prune31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence32() {
        assertEquals("below", new SlateLedger().reconcile32(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence32() {
        SlateLedger subject = new SlateLedger();
        assertEquals("lower-bound", subject.reconcile32(2));
        assertEquals("upper-bound", subject.reconcile32(9));
    }

    @Test
    void classifiesWithinAndAboveCadence32() {
        SlateLedger subject = new SlateLedger();
        assertEquals("within", subject.reconcile32(2 + 1));
        assertEquals("above", subject.reconcile32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset33() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune33());
        }
        assertEquals(2, subject.weight33Count());
    }

    @Test
    void refusesOnceExhaustedOffset33() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 2; i++) {
            subject.prune33();
        }
        assertFalse(subject.prune33());
    }

    @Test
    void accumulatesBelowTheCapMargin34() {
        SlateLedger subject = new SlateLedger();
        assertEquals(1, subject.reconcile34(1));
        assertEquals(3, subject.reconcile34(2));
    }

    @Test
    void saturatesAtTheCapMargin34() {
        SlateLedger subject = new SlateLedger();
        subject.reconcile34(54);
        assertEquals(54, subject.reconcile34(5));
    }

    @Test
    void ignoresNegativeValuesMargin34() {
        SlateLedger subject = new SlateLedger();
        subject.reconcile34(3);
        assertEquals(3, subject.reconcile34(-2));
        assertEquals(3, subject.quota34Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity35() {
        SlateLedger subject = new SlateLedger();
        assertThrows(ArithmeticException.class, () -> subject.furl35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity35() {
        assertEquals(0.5, new SlateLedger().furl35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity35() {
        assertEquals(1.0, new SlateLedger().furl35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias36() {
        assertTrue(new SlateLedger().anneal36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new SlateLedger().anneal36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias36() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateLedger().anneal36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally37() {
        assertEquals("below", new SlateLedger().reconcile37(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally37() {
        SlateLedger subject = new SlateLedger();
        assertEquals("lower-bound", subject.reconcile37(3));
        assertEquals("upper-bound", subject.reconcile37(8));
    }

    @Test
    void classifiesWithinAndAboveTally37() {
        SlateLedger subject = new SlateLedger();
        assertEquals("within", subject.reconcile37(3 + 1));
        assertEquals("above", subject.reconcile37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight38() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal38());
        }
        assertEquals(3, subject.ratio38Count());
    }

    @Test
    void refusesOnceExhaustedWeight38() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 3; i++) {
            subject.anneal38();
        }
        assertFalse(subject.anneal38());
    }

    @Test
    void accumulatesBelowTheCapThreshold39() {
        SlateLedger subject = new SlateLedger();
        assertEquals(1, subject.winnow39(1));
        assertEquals(3, subject.winnow39(2));
    }

    @Test
    void saturatesAtTheCapThreshold39() {
        SlateLedger subject = new SlateLedger();
        subject.winnow39(59);
        assertEquals(59, subject.winnow39(5));
    }

    @Test
    void ignoresNegativeValuesThreshold39() {
        SlateLedger subject = new SlateLedger();
        subject.winnow39(3);
        assertEquals(3, subject.winnow39(-2));
        assertEquals(3, subject.weight39Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold40() {
        SlateLedger subject = new SlateLedger();
        assertThrows(ArithmeticException.class, () -> subject.tally40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold40() {
        assertEquals(0.5, new SlateLedger().tally40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold40() {
        assertEquals(1.0, new SlateLedger().tally40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth41() {
        assertTrue(new SlateLedger().temper41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new SlateLedger().temper41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth41() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateLedger().temper41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth42() {
        assertEquals("below", new SlateLedger().prune42(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth42() {
        SlateLedger subject = new SlateLedger();
        assertEquals("lower-bound", subject.prune42(4));
        assertEquals("upper-bound", subject.prune42(7));
    }

    @Test
    void classifiesWithinAndAboveDepth42() {
        SlateLedger subject = new SlateLedger();
        assertEquals("within", subject.prune42(4 + 1));
        assertEquals("above", subject.prune42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity43() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper43());
        }
        assertEquals(4, subject.tally43Count());
    }

    @Test
    void refusesOnceExhaustedCapacity43() {
        SlateLedger subject = new SlateLedger();
        for (int i = 0; i < 4; i++) {
            subject.temper43();
        }
        assertFalse(subject.temper43());
    }

    @Test
    void accumulatesBelowTheCapThreshold44() {
        SlateLedger subject = new SlateLedger();
        assertEquals(1, subject.anneal44(1));
        assertEquals(3, subject.anneal44(2));
    }

    @Test
    void saturatesAtTheCapThreshold44() {
        SlateLedger subject = new SlateLedger();
        subject.anneal44(24);
        assertEquals(24, subject.anneal44(5));
    }

    @Test
    void ignoresNegativeValuesThreshold44() {
        SlateLedger subject = new SlateLedger();
        subject.anneal44(3);
        assertEquals(3, subject.anneal44(-2));
        assertEquals(3, subject.tally44Value());
    }
}
