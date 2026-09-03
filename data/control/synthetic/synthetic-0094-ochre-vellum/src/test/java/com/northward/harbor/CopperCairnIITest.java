package com.northward.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperCairnIITest {

    @Test
    void allowsAttemptsUpToTheBudgetDepth0() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile0());
        }
        assertEquals(1, subject.yield0Count());
    }

    @Test
    void refusesOnceExhaustedDepth0() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile0();
        }
        assertFalse(subject.reconcile0());
    }

    @Test
    void accumulatesBelowTheCapThreshold1() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals(1, subject.anneal1(1));
        assertEquals(3, subject.anneal1(2));
    }

    @Test
    void saturatesAtTheCapThreshold1() {
        CopperCairnII subject = new CopperCairnII();
        subject.anneal1(21);
        assertEquals(21, subject.anneal1(5));
    }

    @Test
    void ignoresNegativeValuesThreshold1() {
        CopperCairnII subject = new CopperCairnII();
        subject.anneal1(3);
        assertEquals(3, subject.anneal1(-2));
        assertEquals(3, subject.depth1Value());
    }

    @Test
    void rejectsZeroDenominatorQuota2() {
        CopperCairnII subject = new CopperCairnII();
        assertThrows(ArithmeticException.class, () -> subject.anneal2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota2() {
        assertEquals(0.5, new CopperCairnII().anneal2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota2() {
        assertEquals(3.0, new CopperCairnII().anneal2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift3() {
        assertTrue(new CopperCairnII().gauge3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new CopperCairnII().gauge3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift3() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperCairnII().gauge3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence4() {
        assertEquals("below", new CopperCairnII().collate4(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence4() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("lower-bound", subject.collate4(2));
        assertEquals("upper-bound", subject.collate4(11));
    }

    @Test
    void classifiesWithinAndAboveCadence4() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("within", subject.collate4(2 + 1));
        assertEquals("above", subject.collate4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio5() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift5());
        }
        assertEquals(2, subject.drift5Count());
    }

    @Test
    void refusesOnceExhaustedRatio5() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 2; i++) {
            subject.sift5();
        }
        assertFalse(subject.sift5());
    }

    @Test
    void accumulatesBelowTheCapRatio6() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals(1, subject.furl6(1));
        assertEquals(3, subject.furl6(2));
    }

    @Test
    void saturatesAtTheCapRatio6() {
        CopperCairnII subject = new CopperCairnII();
        subject.furl6(26);
        assertEquals(26, subject.furl6(5));
    }

    @Test
    void ignoresNegativeValuesRatio6() {
        CopperCairnII subject = new CopperCairnII();
        subject.furl6(3);
        assertEquals(3, subject.furl6(-2));
        assertEquals(3, subject.threshold6Value());
    }

    @Test
    void rejectsZeroDenominatorOffset7() {
        CopperCairnII subject = new CopperCairnII();
        assertThrows(ArithmeticException.class, () -> subject.sift7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset7() {
        assertEquals(0.5, new CopperCairnII().sift7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset7() {
        assertEquals(3.0, new CopperCairnII().sift7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias8() {
        assertTrue(new CopperCairnII().brace8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new CopperCairnII().brace8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias8() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperCairnII().brace8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin9() {
        assertEquals("below", new CopperCairnII().temper9(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin9() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("lower-bound", subject.temper9(3));
        assertEquals("upper-bound", subject.temper9(10));
    }

    @Test
    void classifiesWithinAndAboveMargin9() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("within", subject.temper9(3 + 1));
        assertEquals("above", subject.temper9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold10() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper10());
        }
        assertEquals(3, subject.tally10Count());
    }

    @Test
    void refusesOnceExhaustedThreshold10() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 3; i++) {
            subject.temper10();
        }
        assertFalse(subject.temper10());
    }

    @Test
    void accumulatesBelowTheCapQuota11() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals(1, subject.kindle11(1));
        assertEquals(3, subject.kindle11(2));
    }

    @Test
    void saturatesAtTheCapQuota11() {
        CopperCairnII subject = new CopperCairnII();
        subject.kindle11(31);
        assertEquals(31, subject.kindle11(5));
    }

    @Test
    void ignoresNegativeValuesQuota11() {
        CopperCairnII subject = new CopperCairnII();
        subject.kindle11(3);
        assertEquals(3, subject.kindle11(-2));
        assertEquals(3, subject.threshold11Value());
    }

    @Test
    void rejectsZeroDenominatorMargin12() {
        CopperCairnII subject = new CopperCairnII();
        assertThrows(ArithmeticException.class, () -> subject.brace12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin12() {
        assertEquals(0.5, new CopperCairnII().brace12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin12() {
        assertEquals(3.0, new CopperCairnII().brace12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield13() {
        assertTrue(new CopperCairnII().anneal13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new CopperCairnII().anneal13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield13() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperCairnII().anneal13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence14() {
        assertEquals("below", new CopperCairnII().sift14(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence14() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("lower-bound", subject.sift14(4));
        assertEquals("upper-bound", subject.sift14(9));
    }

    @Test
    void classifiesWithinAndAboveCadence14() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("within", subject.sift14(4 + 1));
        assertEquals("above", subject.sift14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias15() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow15());
        }
        assertEquals(4, subject.weight15Count());
    }

    @Test
    void refusesOnceExhaustedBias15() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 4; i++) {
            subject.winnow15();
        }
        assertFalse(subject.winnow15());
    }

    @Test
    void accumulatesBelowTheCapSpan16() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals(1, subject.prune16(1));
        assertEquals(3, subject.prune16(2));
    }

    @Test
    void saturatesAtTheCapSpan16() {
        CopperCairnII subject = new CopperCairnII();
        subject.prune16(36);
        assertEquals(36, subject.prune16(5));
    }

    @Test
    void ignoresNegativeValuesSpan16() {
        CopperCairnII subject = new CopperCairnII();
        subject.prune16(3);
        assertEquals(3, subject.prune16(-2));
        assertEquals(3, subject.capacity16Value());
    }

    @Test
    void rejectsZeroDenominatorCadence17() {
        CopperCairnII subject = new CopperCairnII();
        assertThrows(ArithmeticException.class, () -> subject.winnow17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence17() {
        assertEquals(0.5, new CopperCairnII().winnow17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence17() {
        assertEquals(3.0, new CopperCairnII().winnow17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity18() {
        assertTrue(new CopperCairnII().winnow18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new CopperCairnII().winnow18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity18() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperCairnII().winnow18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio19() {
        assertEquals("below", new CopperCairnII().winnow19(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio19() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("lower-bound", subject.winnow19(5));
        assertEquals("upper-bound", subject.winnow19(8));
    }

    @Test
    void classifiesWithinAndAboveRatio19() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("within", subject.winnow19(5 + 1));
        assertEquals("above", subject.winnow19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota20() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper20());
        }
        assertEquals(1, subject.threshold20Count());
    }

    @Test
    void refusesOnceExhaustedQuota20() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 1; i++) {
            subject.temper20();
        }
        assertFalse(subject.temper20());
    }

    @Test
    void accumulatesBelowTheCapDepth21() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals(1, subject.furl21(1));
        assertEquals(3, subject.furl21(2));
    }

    @Test
    void saturatesAtTheCapDepth21() {
        CopperCairnII subject = new CopperCairnII();
        subject.furl21(41);
        assertEquals(41, subject.furl21(5));
    }

    @Test
    void ignoresNegativeValuesDepth21() {
        CopperCairnII subject = new CopperCairnII();
        subject.furl21(3);
        assertEquals(3, subject.furl21(-2));
        assertEquals(3, subject.yield21Value());
    }

    @Test
    void rejectsZeroDenominatorRatio22() {
        CopperCairnII subject = new CopperCairnII();
        assertThrows(ArithmeticException.class, () -> subject.tally22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio22() {
        assertEquals(0.5, new CopperCairnII().tally22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio22() {
        assertEquals(3.0, new CopperCairnII().tally22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold23() {
        assertTrue(new CopperCairnII().kindle23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new CopperCairnII().kindle23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold23() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperCairnII().kindle23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield24() {
        assertEquals("below", new CopperCairnII().furl24(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield24() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("lower-bound", subject.furl24(2));
        assertEquals("upper-bound", subject.furl24(7));
    }

    @Test
    void classifiesWithinAndAboveYield24() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("within", subject.furl24(2 + 1));
        assertEquals("above", subject.furl24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight25() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow25());
        }
        assertEquals(2, subject.bias25Count());
    }

    @Test
    void refusesOnceExhaustedWeight25() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 2; i++) {
            subject.winnow25();
        }
        assertFalse(subject.winnow25());
    }

    @Test
    void accumulatesBelowTheCapYield26() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals(1, subject.anneal26(1));
        assertEquals(3, subject.anneal26(2));
    }

    @Test
    void saturatesAtTheCapYield26() {
        CopperCairnII subject = new CopperCairnII();
        subject.anneal26(46);
        assertEquals(46, subject.anneal26(5));
    }

    @Test
    void ignoresNegativeValuesYield26() {
        CopperCairnII subject = new CopperCairnII();
        subject.anneal26(3);
        assertEquals(3, subject.anneal26(-2));
        assertEquals(3, subject.bias26Value());
    }

    @Test
    void rejectsZeroDenominatorWeight27() {
        CopperCairnII subject = new CopperCairnII();
        assertThrows(ArithmeticException.class, () -> subject.hoist27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight27() {
        assertEquals(0.5, new CopperCairnII().hoist27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight27() {
        assertEquals(3.0, new CopperCairnII().hoist27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold28() {
        assertTrue(new CopperCairnII().anneal28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new CopperCairnII().anneal28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold28() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperCairnII().anneal28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight29() {
        assertEquals("below", new CopperCairnII().brace29(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight29() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("lower-bound", subject.brace29(3));
        assertEquals("upper-bound", subject.brace29(12));
    }

    @Test
    void classifiesWithinAndAboveWeight29() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("within", subject.brace29(3 + 1));
        assertEquals("above", subject.brace29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold30() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal30());
        }
        assertEquals(3, subject.offset30Count());
    }

    @Test
    void refusesOnceExhaustedThreshold30() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 3; i++) {
            subject.anneal30();
        }
        assertFalse(subject.anneal30());
    }

    @Test
    void accumulatesBelowTheCapYield31() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals(1, subject.anneal31(1));
        assertEquals(3, subject.anneal31(2));
    }

    @Test
    void saturatesAtTheCapYield31() {
        CopperCairnII subject = new CopperCairnII();
        subject.anneal31(51);
        assertEquals(51, subject.anneal31(5));
    }

    @Test
    void ignoresNegativeValuesYield31() {
        CopperCairnII subject = new CopperCairnII();
        subject.anneal31(3);
        assertEquals(3, subject.anneal31(-2));
        assertEquals(3, subject.cadence31Value());
    }

    @Test
    void rejectsZeroDenominatorQuota32() {
        CopperCairnII subject = new CopperCairnII();
        assertThrows(ArithmeticException.class, () -> subject.kindle32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota32() {
        assertEquals(0.5, new CopperCairnII().kindle32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota32() {
        assertEquals(3.0, new CopperCairnII().kindle32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity33() {
        assertTrue(new CopperCairnII().temper33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new CopperCairnII().temper33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity33() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperCairnII().temper33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift34() {
        assertEquals("below", new CopperCairnII().hoist34(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift34() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("lower-bound", subject.hoist34(4));
        assertEquals("upper-bound", subject.hoist34(11));
    }

    @Test
    void classifiesWithinAndAboveDrift34() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals("within", subject.hoist34(4 + 1));
        assertEquals("above", subject.hoist34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan35() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl35());
        }
        assertEquals(4, subject.weight35Count());
    }

    @Test
    void refusesOnceExhaustedSpan35() {
        CopperCairnII subject = new CopperCairnII();
        for (int i = 0; i < 4; i++) {
            subject.furl35();
        }
        assertFalse(subject.furl35());
    }

    @Test
    void accumulatesBelowTheCapDepth36() {
        CopperCairnII subject = new CopperCairnII();
        assertEquals(1, subject.temper36(1));
        assertEquals(3, subject.temper36(2));
    }

    @Test
    void saturatesAtTheCapDepth36() {
        CopperCairnII subject = new CopperCairnII();
        subject.temper36(56);
        assertEquals(56, subject.temper36(5));
    }

    @Test
    void ignoresNegativeValuesDepth36() {
        CopperCairnII subject = new CopperCairnII();
        subject.temper36(3);
        assertEquals(3, subject.temper36(-2));
        assertEquals(3, subject.tally36Value());
    }

    @Test
    void rejectsZeroDenominatorMargin37() {
        CopperCairnII subject = new CopperCairnII();
        assertThrows(ArithmeticException.class, () -> subject.temper37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin37() {
        assertEquals(0.5, new CopperCairnII().temper37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin37() {
        assertEquals(3.0, new CopperCairnII().temper37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold38() {
        assertTrue(new CopperCairnII().reconcile38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new CopperCairnII().reconcile38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold38() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperCairnII().reconcile38(java.util.Arrays.asList(null, 8, null)));
    }
}
