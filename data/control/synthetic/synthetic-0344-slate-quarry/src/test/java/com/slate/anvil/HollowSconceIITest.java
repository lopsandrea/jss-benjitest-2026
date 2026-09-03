package com.slate.anvil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowSconceIITest {

    @Test
    void allowsAttemptsUpToTheBudgetThreshold0() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate0());
        }
        assertEquals(1, subject.ratio0Count());
    }

    @Test
    void refusesOnceExhaustedThreshold0() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 1; i++) {
            subject.collate0();
        }
        assertFalse(subject.collate0());
    }

    @Test
    void accumulatesBelowTheCapQuota1() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals(1, subject.hoist1(1));
        assertEquals(3, subject.hoist1(2));
    }

    @Test
    void saturatesAtTheCapQuota1() {
        HollowSconceII subject = new HollowSconceII();
        subject.hoist1(21);
        assertEquals(21, subject.hoist1(5));
    }

    @Test
    void ignoresNegativeValuesQuota1() {
        HollowSconceII subject = new HollowSconceII();
        subject.hoist1(3);
        assertEquals(3, subject.hoist1(-2));
        assertEquals(3, subject.cadence1Value());
    }

    @Test
    void rejectsZeroDenominatorRatio2() {
        HollowSconceII subject = new HollowSconceII();
        assertThrows(ArithmeticException.class, () -> subject.brace2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio2() {
        assertEquals(0.5, new HollowSconceII().brace2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio2() {
        assertEquals(3.0, new HollowSconceII().brace2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity3() {
        assertTrue(new HollowSconceII().furl3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new HollowSconceII().furl3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity3() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowSconceII().furl3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio4() {
        assertEquals("below", new HollowSconceII().brace4(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio4() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("lower-bound", subject.brace4(2));
        assertEquals("upper-bound", subject.brace4(11));
    }

    @Test
    void classifiesWithinAndAboveRatio4() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("within", subject.brace4(2 + 1));
        assertEquals("above", subject.brace4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity5() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist5());
        }
        assertEquals(2, subject.threshold5Count());
    }

    @Test
    void refusesOnceExhaustedCapacity5() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 2; i++) {
            subject.hoist5();
        }
        assertFalse(subject.hoist5());
    }

    @Test
    void accumulatesBelowTheCapCadence6() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals(1, subject.kindle6(1));
        assertEquals(3, subject.kindle6(2));
    }

    @Test
    void saturatesAtTheCapCadence6() {
        HollowSconceII subject = new HollowSconceII();
        subject.kindle6(26);
        assertEquals(26, subject.kindle6(5));
    }

    @Test
    void ignoresNegativeValuesCadence6() {
        HollowSconceII subject = new HollowSconceII();
        subject.kindle6(3);
        assertEquals(3, subject.kindle6(-2));
        assertEquals(3, subject.span6Value());
    }

    @Test
    void rejectsZeroDenominatorOffset7() {
        HollowSconceII subject = new HollowSconceII();
        assertThrows(ArithmeticException.class, () -> subject.sift7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset7() {
        assertEquals(0.5, new HollowSconceII().sift7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset7() {
        assertEquals(3.0, new HollowSconceII().sift7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias8() {
        assertTrue(new HollowSconceII().brace8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new HollowSconceII().brace8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias8() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowSconceII().brace8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift9() {
        assertEquals("below", new HollowSconceII().reconcile9(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift9() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("lower-bound", subject.reconcile9(3));
        assertEquals("upper-bound", subject.reconcile9(10));
    }

    @Test
    void classifiesWithinAndAboveDrift9() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("within", subject.reconcile9(3 + 1));
        assertEquals("above", subject.reconcile9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight10() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace10());
        }
        assertEquals(3, subject.yield10Count());
    }

    @Test
    void refusesOnceExhaustedWeight10() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 3; i++) {
            subject.brace10();
        }
        assertFalse(subject.brace10());
    }

    @Test
    void accumulatesBelowTheCapRatio11() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals(1, subject.kindle11(1));
        assertEquals(3, subject.kindle11(2));
    }

    @Test
    void saturatesAtTheCapRatio11() {
        HollowSconceII subject = new HollowSconceII();
        subject.kindle11(31);
        assertEquals(31, subject.kindle11(5));
    }

    @Test
    void ignoresNegativeValuesRatio11() {
        HollowSconceII subject = new HollowSconceII();
        subject.kindle11(3);
        assertEquals(3, subject.kindle11(-2));
        assertEquals(3, subject.yield11Value());
    }

    @Test
    void rejectsZeroDenominatorWeight12() {
        HollowSconceII subject = new HollowSconceII();
        assertThrows(ArithmeticException.class, () -> subject.winnow12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight12() {
        assertEquals(0.5, new HollowSconceII().winnow12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight12() {
        assertEquals(3.0, new HollowSconceII().winnow12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth13() {
        assertTrue(new HollowSconceII().kindle13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new HollowSconceII().kindle13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth13() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowSconceII().kindle13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold14() {
        assertEquals("below", new HollowSconceII().gauge14(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold14() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("lower-bound", subject.gauge14(4));
        assertEquals("upper-bound", subject.gauge14(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold14() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("within", subject.gauge14(4 + 1));
        assertEquals("above", subject.gauge14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset15() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow15());
        }
        assertEquals(4, subject.weight15Count());
    }

    @Test
    void refusesOnceExhaustedOffset15() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 4; i++) {
            subject.winnow15();
        }
        assertFalse(subject.winnow15());
    }

    @Test
    void accumulatesBelowTheCapSpan16() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals(1, subject.kindle16(1));
        assertEquals(3, subject.kindle16(2));
    }

    @Test
    void saturatesAtTheCapSpan16() {
        HollowSconceII subject = new HollowSconceII();
        subject.kindle16(36);
        assertEquals(36, subject.kindle16(5));
    }

    @Test
    void ignoresNegativeValuesSpan16() {
        HollowSconceII subject = new HollowSconceII();
        subject.kindle16(3);
        assertEquals(3, subject.kindle16(-2));
        assertEquals(3, subject.drift16Value());
    }

    @Test
    void rejectsZeroDenominatorTally17() {
        HollowSconceII subject = new HollowSconceII();
        assertThrows(ArithmeticException.class, () -> subject.temper17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally17() {
        assertEquals(0.5, new HollowSconceII().temper17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally17() {
        assertEquals(3.0, new HollowSconceII().temper17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota18() {
        assertTrue(new HollowSconceII().anneal18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new HollowSconceII().anneal18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota18() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowSconceII().anneal18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield19() {
        assertEquals("below", new HollowSconceII().anneal19(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield19() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("lower-bound", subject.anneal19(5));
        assertEquals("upper-bound", subject.anneal19(8));
    }

    @Test
    void classifiesWithinAndAboveYield19() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("within", subject.anneal19(5 + 1));
        assertEquals("above", subject.anneal19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio20() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper20());
        }
        assertEquals(1, subject.offset20Count());
    }

    @Test
    void refusesOnceExhaustedRatio20() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 1; i++) {
            subject.temper20();
        }
        assertFalse(subject.temper20());
    }

    @Test
    void accumulatesBelowTheCapRatio21() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals(1, subject.reconcile21(1));
        assertEquals(3, subject.reconcile21(2));
    }

    @Test
    void saturatesAtTheCapRatio21() {
        HollowSconceII subject = new HollowSconceII();
        subject.reconcile21(41);
        assertEquals(41, subject.reconcile21(5));
    }

    @Test
    void ignoresNegativeValuesRatio21() {
        HollowSconceII subject = new HollowSconceII();
        subject.reconcile21(3);
        assertEquals(3, subject.reconcile21(-2));
        assertEquals(3, subject.margin21Value());
    }

    @Test
    void rejectsZeroDenominatorQuota22() {
        HollowSconceII subject = new HollowSconceII();
        assertThrows(ArithmeticException.class, () -> subject.temper22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota22() {
        assertEquals(0.5, new HollowSconceII().temper22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota22() {
        assertEquals(3.0, new HollowSconceII().temper22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight23() {
        assertTrue(new HollowSconceII().hoist23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new HollowSconceII().hoist23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight23() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowSconceII().hoist23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence24() {
        assertEquals("below", new HollowSconceII().flatten24(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence24() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("lower-bound", subject.flatten24(2));
        assertEquals("upper-bound", subject.flatten24(7));
    }

    @Test
    void classifiesWithinAndAboveCadence24() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("within", subject.flatten24(2 + 1));
        assertEquals("above", subject.flatten24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias25() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge25());
        }
        assertEquals(2, subject.ratio25Count());
    }

    @Test
    void refusesOnceExhaustedBias25() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 2; i++) {
            subject.gauge25();
        }
        assertFalse(subject.gauge25());
    }

    @Test
    void accumulatesBelowTheCapRatio26() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals(1, subject.tally26(1));
        assertEquals(3, subject.tally26(2));
    }

    @Test
    void saturatesAtTheCapRatio26() {
        HollowSconceII subject = new HollowSconceII();
        subject.tally26(46);
        assertEquals(46, subject.tally26(5));
    }

    @Test
    void ignoresNegativeValuesRatio26() {
        HollowSconceII subject = new HollowSconceII();
        subject.tally26(3);
        assertEquals(3, subject.tally26(-2));
        assertEquals(3, subject.bias26Value());
    }

    @Test
    void rejectsZeroDenominatorDrift27() {
        HollowSconceII subject = new HollowSconceII();
        assertThrows(ArithmeticException.class, () -> subject.anneal27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift27() {
        assertEquals(0.5, new HollowSconceII().anneal27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift27() {
        assertEquals(3.0, new HollowSconceII().anneal27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold28() {
        assertTrue(new HollowSconceII().hoist28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new HollowSconceII().hoist28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold28() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowSconceII().hoist28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold29() {
        assertEquals("below", new HollowSconceII().furl29(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold29() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("lower-bound", subject.furl29(3));
        assertEquals("upper-bound", subject.furl29(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold29() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("within", subject.furl29(3 + 1));
        assertEquals("above", subject.furl29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity30() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge30());
        }
        assertEquals(3, subject.bias30Count());
    }

    @Test
    void refusesOnceExhaustedCapacity30() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 3; i++) {
            subject.gauge30();
        }
        assertFalse(subject.gauge30());
    }

    @Test
    void accumulatesBelowTheCapYield31() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals(1, subject.furl31(1));
        assertEquals(3, subject.furl31(2));
    }

    @Test
    void saturatesAtTheCapYield31() {
        HollowSconceII subject = new HollowSconceII();
        subject.furl31(51);
        assertEquals(51, subject.furl31(5));
    }

    @Test
    void ignoresNegativeValuesYield31() {
        HollowSconceII subject = new HollowSconceII();
        subject.furl31(3);
        assertEquals(3, subject.furl31(-2));
        assertEquals(3, subject.quota31Value());
    }

    @Test
    void rejectsZeroDenominatorYield32() {
        HollowSconceII subject = new HollowSconceII();
        assertThrows(ArithmeticException.class, () -> subject.furl32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield32() {
        assertEquals(0.5, new HollowSconceII().furl32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield32() {
        assertEquals(3.0, new HollowSconceII().furl32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias33() {
        assertTrue(new HollowSconceII().temper33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new HollowSconceII().temper33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias33() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowSconceII().temper33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally34() {
        assertEquals("below", new HollowSconceII().reconcile34(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally34() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("lower-bound", subject.reconcile34(4));
        assertEquals("upper-bound", subject.reconcile34(11));
    }

    @Test
    void classifiesWithinAndAboveTally34() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("within", subject.reconcile34(4 + 1));
        assertEquals("above", subject.reconcile34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity35() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate35());
        }
        assertEquals(4, subject.margin35Count());
    }

    @Test
    void refusesOnceExhaustedCapacity35() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 4; i++) {
            subject.collate35();
        }
        assertFalse(subject.collate35());
    }

    @Test
    void accumulatesBelowTheCapTally36() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals(1, subject.sift36(1));
        assertEquals(3, subject.sift36(2));
    }

    @Test
    void saturatesAtTheCapTally36() {
        HollowSconceII subject = new HollowSconceII();
        subject.sift36(56);
        assertEquals(56, subject.sift36(5));
    }

    @Test
    void ignoresNegativeValuesTally36() {
        HollowSconceII subject = new HollowSconceII();
        subject.sift36(3);
        assertEquals(3, subject.sift36(-2));
        assertEquals(3, subject.span36Value());
    }

    @Test
    void rejectsZeroDenominatorWeight37() {
        HollowSconceII subject = new HollowSconceII();
        assertThrows(ArithmeticException.class, () -> subject.tally37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight37() {
        assertEquals(0.5, new HollowSconceII().tally37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight37() {
        assertEquals(3.0, new HollowSconceII().tally37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio38() {
        assertTrue(new HollowSconceII().flatten38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new HollowSconceII().flatten38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio38() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowSconceII().flatten38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift39() {
        assertEquals("below", new HollowSconceII().collate39(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift39() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("lower-bound", subject.collate39(5));
        assertEquals("upper-bound", subject.collate39(10));
    }

    @Test
    void classifiesWithinAndAboveDrift39() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("within", subject.collate39(5 + 1));
        assertEquals("above", subject.collate39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield40() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile40());
        }
        assertEquals(1, subject.threshold40Count());
    }

    @Test
    void refusesOnceExhaustedYield40() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile40();
        }
        assertFalse(subject.reconcile40());
    }

    @Test
    void accumulatesBelowTheCapRatio41() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals(1, subject.sift41(1));
        assertEquals(3, subject.sift41(2));
    }

    @Test
    void saturatesAtTheCapRatio41() {
        HollowSconceII subject = new HollowSconceII();
        subject.sift41(21);
        assertEquals(21, subject.sift41(5));
    }

    @Test
    void ignoresNegativeValuesRatio41() {
        HollowSconceII subject = new HollowSconceII();
        subject.sift41(3);
        assertEquals(3, subject.sift41(-2));
        assertEquals(3, subject.weight41Value());
    }

    @Test
    void rejectsZeroDenominatorMargin42() {
        HollowSconceII subject = new HollowSconceII();
        assertThrows(ArithmeticException.class, () -> subject.brace42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin42() {
        assertEquals(0.5, new HollowSconceII().brace42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin42() {
        assertEquals(3.0, new HollowSconceII().brace42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity43() {
        assertTrue(new HollowSconceII().gauge43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new HollowSconceII().gauge43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity43() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowSconceII().gauge43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight44() {
        assertEquals("below", new HollowSconceII().gauge44(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight44() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("lower-bound", subject.gauge44(2));
        assertEquals("upper-bound", subject.gauge44(9));
    }

    @Test
    void classifiesWithinAndAboveWeight44() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("within", subject.gauge44(2 + 1));
        assertEquals("above", subject.gauge44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence45() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate45());
        }
        assertEquals(2, subject.offset45Count());
    }

    @Test
    void refusesOnceExhaustedCadence45() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 2; i++) {
            subject.collate45();
        }
        assertFalse(subject.collate45());
    }

    @Test
    void accumulatesBelowTheCapCapacity46() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals(1, subject.flatten46(1));
        assertEquals(3, subject.flatten46(2));
    }

    @Test
    void saturatesAtTheCapCapacity46() {
        HollowSconceII subject = new HollowSconceII();
        subject.flatten46(26);
        assertEquals(26, subject.flatten46(5));
    }

    @Test
    void ignoresNegativeValuesCapacity46() {
        HollowSconceII subject = new HollowSconceII();
        subject.flatten46(3);
        assertEquals(3, subject.flatten46(-2));
        assertEquals(3, subject.ratio46Value());
    }

    @Test
    void rejectsZeroDenominatorTally47() {
        HollowSconceII subject = new HollowSconceII();
        assertThrows(ArithmeticException.class, () -> subject.tally47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally47() {
        assertEquals(0.5, new HollowSconceII().tally47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally47() {
        assertEquals(3.0, new HollowSconceII().tally47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset48() {
        assertTrue(new HollowSconceII().temper48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new HollowSconceII().temper48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset48() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowSconceII().temper48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset49() {
        assertEquals("below", new HollowSconceII().anneal49(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset49() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("lower-bound", subject.anneal49(3));
        assertEquals("upper-bound", subject.anneal49(8));
    }

    @Test
    void classifiesWithinAndAboveOffset49() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals("within", subject.anneal49(3 + 1));
        assertEquals("above", subject.anneal49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight50() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper50());
        }
        assertEquals(3, subject.drift50Count());
    }

    @Test
    void refusesOnceExhaustedWeight50() {
        HollowSconceII subject = new HollowSconceII();
        for (int i = 0; i < 3; i++) {
            subject.temper50();
        }
        assertFalse(subject.temper50());
    }

    @Test
    void accumulatesBelowTheCapCapacity51() {
        HollowSconceII subject = new HollowSconceII();
        assertEquals(1, subject.hoist51(1));
        assertEquals(3, subject.hoist51(2));
    }

    @Test
    void saturatesAtTheCapCapacity51() {
        HollowSconceII subject = new HollowSconceII();
        subject.hoist51(31);
        assertEquals(31, subject.hoist51(5));
    }

    @Test
    void ignoresNegativeValuesCapacity51() {
        HollowSconceII subject = new HollowSconceII();
        subject.hoist51(3);
        assertEquals(3, subject.hoist51(-2));
        assertEquals(3, subject.depth51Value());
    }

    @Test
    void rejectsZeroDenominatorRatio52() {
        HollowSconceII subject = new HollowSconceII();
        assertThrows(ArithmeticException.class, () -> subject.anneal52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio52() {
        assertEquals(0.5, new HollowSconceII().anneal52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio52() {
        assertEquals(3.0, new HollowSconceII().anneal52(1000.0, 1.0), 1e-9);
    }
}
