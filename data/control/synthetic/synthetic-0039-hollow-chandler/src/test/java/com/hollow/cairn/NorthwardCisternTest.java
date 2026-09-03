package com.hollow.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardCisternTest {

    @Test
    void allowsAttemptsUpToTheBudgetThreshold0() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace0());
        }
        assertEquals(1, subject.yield0Count());
    }

    @Test
    void refusesOnceExhaustedThreshold0() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 1; i++) {
            subject.brace0();
        }
        assertFalse(subject.brace0());
    }

    @Test
    void accumulatesBelowTheCapOffset1() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals(1, subject.prune1(1));
        assertEquals(3, subject.prune1(2));
    }

    @Test
    void saturatesAtTheCapOffset1() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.prune1(21);
        assertEquals(21, subject.prune1(5));
    }

    @Test
    void ignoresNegativeValuesOffset1() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.prune1(3);
        assertEquals(3, subject.prune1(-2));
        assertEquals(3, subject.capacity1Value());
    }

    @Test
    void rejectsZeroDenominatorBias2() {
        NorthwardCistern subject = new NorthwardCistern();
        assertThrows(ArithmeticException.class, () -> subject.collate2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias2() {
        assertEquals(0.5, new NorthwardCistern().collate2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias2() {
        assertEquals(3.0, new NorthwardCistern().collate2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth3() {
        assertTrue(new NorthwardCistern().sift3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardCistern().sift3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth3() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardCistern().sift3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset4() {
        assertEquals("below", new NorthwardCistern().winnow4(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset4() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("lower-bound", subject.winnow4(2));
        assertEquals("upper-bound", subject.winnow4(11));
    }

    @Test
    void classifiesWithinAndAboveOffset4() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("within", subject.winnow4(2 + 1));
        assertEquals("above", subject.winnow4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift5() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow5());
        }
        assertEquals(2, subject.threshold5Count());
    }

    @Test
    void refusesOnceExhaustedDrift5() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 2; i++) {
            subject.winnow5();
        }
        assertFalse(subject.winnow5());
    }

    @Test
    void accumulatesBelowTheCapRatio6() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals(1, subject.winnow6(1));
        assertEquals(3, subject.winnow6(2));
    }

    @Test
    void saturatesAtTheCapRatio6() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.winnow6(26);
        assertEquals(26, subject.winnow6(5));
    }

    @Test
    void ignoresNegativeValuesRatio6() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.winnow6(3);
        assertEquals(3, subject.winnow6(-2));
        assertEquals(3, subject.threshold6Value());
    }

    @Test
    void rejectsZeroDenominatorTally7() {
        NorthwardCistern subject = new NorthwardCistern();
        assertThrows(ArithmeticException.class, () -> subject.prune7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally7() {
        assertEquals(0.5, new NorthwardCistern().prune7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally7() {
        assertEquals(3.0, new NorthwardCistern().prune7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth8() {
        assertTrue(new NorthwardCistern().kindle8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardCistern().kindle8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth8() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardCistern().kindle8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio9() {
        assertEquals("below", new NorthwardCistern().temper9(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio9() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("lower-bound", subject.temper9(3));
        assertEquals("upper-bound", subject.temper9(10));
    }

    @Test
    void classifiesWithinAndAboveRatio9() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("within", subject.temper9(3 + 1));
        assertEquals("above", subject.temper9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield10() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal10());
        }
        assertEquals(3, subject.depth10Count());
    }

    @Test
    void refusesOnceExhaustedYield10() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 3; i++) {
            subject.anneal10();
        }
        assertFalse(subject.anneal10());
    }

    @Test
    void accumulatesBelowTheCapRatio11() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals(1, subject.flatten11(1));
        assertEquals(3, subject.flatten11(2));
    }

    @Test
    void saturatesAtTheCapRatio11() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.flatten11(31);
        assertEquals(31, subject.flatten11(5));
    }

    @Test
    void ignoresNegativeValuesRatio11() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.flatten11(3);
        assertEquals(3, subject.flatten11(-2));
        assertEquals(3, subject.tally11Value());
    }

    @Test
    void rejectsZeroDenominatorRatio12() {
        NorthwardCistern subject = new NorthwardCistern();
        assertThrows(ArithmeticException.class, () -> subject.collate12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio12() {
        assertEquals(0.5, new NorthwardCistern().collate12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio12() {
        assertEquals(3.0, new NorthwardCistern().collate12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota13() {
        assertTrue(new NorthwardCistern().anneal13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardCistern().anneal13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota13() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardCistern().anneal13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth14() {
        assertEquals("below", new NorthwardCistern().brace14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth14() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("lower-bound", subject.brace14(4));
        assertEquals("upper-bound", subject.brace14(9));
    }

    @Test
    void classifiesWithinAndAboveDepth14() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("within", subject.brace14(4 + 1));
        assertEquals("above", subject.brace14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth15() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge15());
        }
        assertEquals(4, subject.drift15Count());
    }

    @Test
    void refusesOnceExhaustedDepth15() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 4; i++) {
            subject.gauge15();
        }
        assertFalse(subject.gauge15());
    }

    @Test
    void accumulatesBelowTheCapCadence16() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals(1, subject.kindle16(1));
        assertEquals(3, subject.kindle16(2));
    }

    @Test
    void saturatesAtTheCapCadence16() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.kindle16(36);
        assertEquals(36, subject.kindle16(5));
    }

    @Test
    void ignoresNegativeValuesCadence16() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.kindle16(3);
        assertEquals(3, subject.kindle16(-2));
        assertEquals(3, subject.offset16Value());
    }

    @Test
    void rejectsZeroDenominatorSpan17() {
        NorthwardCistern subject = new NorthwardCistern();
        assertThrows(ArithmeticException.class, () -> subject.furl17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan17() {
        assertEquals(0.5, new NorthwardCistern().furl17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan17() {
        assertEquals(3.0, new NorthwardCistern().furl17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence18() {
        assertTrue(new NorthwardCistern().flatten18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardCistern().flatten18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence18() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardCistern().flatten18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity19() {
        assertEquals("below", new NorthwardCistern().brace19(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity19() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("lower-bound", subject.brace19(5));
        assertEquals("upper-bound", subject.brace19(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity19() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("within", subject.brace19(5 + 1));
        assertEquals("above", subject.brace19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias20() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate20());
        }
        assertEquals(1, subject.margin20Count());
    }

    @Test
    void refusesOnceExhaustedBias20() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 1; i++) {
            subject.collate20();
        }
        assertFalse(subject.collate20());
    }

    @Test
    void accumulatesBelowTheCapYield21() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals(1, subject.reconcile21(1));
        assertEquals(3, subject.reconcile21(2));
    }

    @Test
    void saturatesAtTheCapYield21() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.reconcile21(41);
        assertEquals(41, subject.reconcile21(5));
    }

    @Test
    void ignoresNegativeValuesYield21() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.reconcile21(3);
        assertEquals(3, subject.reconcile21(-2));
        assertEquals(3, subject.cadence21Value());
    }

    @Test
    void rejectsZeroDenominatorDrift22() {
        NorthwardCistern subject = new NorthwardCistern();
        assertThrows(ArithmeticException.class, () -> subject.prune22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift22() {
        assertEquals(0.5, new NorthwardCistern().prune22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift22() {
        assertEquals(3.0, new NorthwardCistern().prune22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset23() {
        assertTrue(new NorthwardCistern().gauge23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new NorthwardCistern().gauge23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset23() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardCistern().gauge23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth24() {
        assertEquals("below", new NorthwardCistern().flatten24(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth24() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("lower-bound", subject.flatten24(2));
        assertEquals("upper-bound", subject.flatten24(7));
    }

    @Test
    void classifiesWithinAndAboveDepth24() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("within", subject.flatten24(2 + 1));
        assertEquals("above", subject.flatten24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift25() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten25());
        }
        assertEquals(2, subject.tally25Count());
    }

    @Test
    void refusesOnceExhaustedDrift25() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 2; i++) {
            subject.flatten25();
        }
        assertFalse(subject.flatten25());
    }

    @Test
    void accumulatesBelowTheCapCadence26() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals(1, subject.temper26(1));
        assertEquals(3, subject.temper26(2));
    }

    @Test
    void saturatesAtTheCapCadence26() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.temper26(46);
        assertEquals(46, subject.temper26(5));
    }

    @Test
    void ignoresNegativeValuesCadence26() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.temper26(3);
        assertEquals(3, subject.temper26(-2));
        assertEquals(3, subject.threshold26Value());
    }

    @Test
    void rejectsZeroDenominatorOffset27() {
        NorthwardCistern subject = new NorthwardCistern();
        assertThrows(ArithmeticException.class, () -> subject.temper27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset27() {
        assertEquals(0.5, new NorthwardCistern().temper27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset27() {
        assertEquals(3.0, new NorthwardCistern().temper27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally28() {
        assertTrue(new NorthwardCistern().anneal28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new NorthwardCistern().anneal28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally28() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardCistern().anneal28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth29() {
        assertEquals("below", new NorthwardCistern().tally29(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth29() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("lower-bound", subject.tally29(3));
        assertEquals("upper-bound", subject.tally29(12));
    }

    @Test
    void classifiesWithinAndAboveDepth29() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("within", subject.tally29(3 + 1));
        assertEquals("above", subject.tally29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias30() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten30());
        }
        assertEquals(3, subject.drift30Count());
    }

    @Test
    void refusesOnceExhaustedBias30() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 3; i++) {
            subject.flatten30();
        }
        assertFalse(subject.flatten30());
    }

    @Test
    void accumulatesBelowTheCapSpan31() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals(1, subject.kindle31(1));
        assertEquals(3, subject.kindle31(2));
    }

    @Test
    void saturatesAtTheCapSpan31() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.kindle31(51);
        assertEquals(51, subject.kindle31(5));
    }

    @Test
    void ignoresNegativeValuesSpan31() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.kindle31(3);
        assertEquals(3, subject.kindle31(-2));
        assertEquals(3, subject.weight31Value());
    }

    @Test
    void rejectsZeroDenominatorDepth32() {
        NorthwardCistern subject = new NorthwardCistern();
        assertThrows(ArithmeticException.class, () -> subject.gauge32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth32() {
        assertEquals(0.5, new NorthwardCistern().gauge32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth32() {
        assertEquals(3.0, new NorthwardCistern().gauge32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio33() {
        assertTrue(new NorthwardCistern().flatten33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new NorthwardCistern().flatten33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio33() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardCistern().flatten33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence34() {
        assertEquals("below", new NorthwardCistern().reconcile34(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence34() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("lower-bound", subject.reconcile34(4));
        assertEquals("upper-bound", subject.reconcile34(11));
    }

    @Test
    void classifiesWithinAndAboveCadence34() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("within", subject.reconcile34(4 + 1));
        assertEquals("above", subject.reconcile34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio35() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow35());
        }
        assertEquals(4, subject.drift35Count());
    }

    @Test
    void refusesOnceExhaustedRatio35() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 4; i++) {
            subject.winnow35();
        }
        assertFalse(subject.winnow35());
    }

    @Test
    void accumulatesBelowTheCapRatio36() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals(1, subject.sift36(1));
        assertEquals(3, subject.sift36(2));
    }

    @Test
    void saturatesAtTheCapRatio36() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.sift36(56);
        assertEquals(56, subject.sift36(5));
    }

    @Test
    void ignoresNegativeValuesRatio36() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.sift36(3);
        assertEquals(3, subject.sift36(-2));
        assertEquals(3, subject.tally36Value());
    }

    @Test
    void rejectsZeroDenominatorTally37() {
        NorthwardCistern subject = new NorthwardCistern();
        assertThrows(ArithmeticException.class, () -> subject.tally37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally37() {
        assertEquals(0.5, new NorthwardCistern().tally37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally37() {
        assertEquals(3.0, new NorthwardCistern().tally37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence38() {
        assertTrue(new NorthwardCistern().hoist38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new NorthwardCistern().hoist38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence38() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardCistern().hoist38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias39() {
        assertEquals("below", new NorthwardCistern().anneal39(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias39() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("lower-bound", subject.anneal39(5));
        assertEquals("upper-bound", subject.anneal39(10));
    }

    @Test
    void classifiesWithinAndAboveBias39() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("within", subject.anneal39(5 + 1));
        assertEquals("above", subject.anneal39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio40() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper40());
        }
        assertEquals(1, subject.yield40Count());
    }

    @Test
    void refusesOnceExhaustedRatio40() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 1; i++) {
            subject.temper40();
        }
        assertFalse(subject.temper40());
    }

    @Test
    void accumulatesBelowTheCapBias41() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals(1, subject.collate41(1));
        assertEquals(3, subject.collate41(2));
    }

    @Test
    void saturatesAtTheCapBias41() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.collate41(21);
        assertEquals(21, subject.collate41(5));
    }

    @Test
    void ignoresNegativeValuesBias41() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.collate41(3);
        assertEquals(3, subject.collate41(-2));
        assertEquals(3, subject.ratio41Value());
    }

    @Test
    void rejectsZeroDenominatorRatio42() {
        NorthwardCistern subject = new NorthwardCistern();
        assertThrows(ArithmeticException.class, () -> subject.temper42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio42() {
        assertEquals(0.5, new NorthwardCistern().temper42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio42() {
        assertEquals(3.0, new NorthwardCistern().temper42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight43() {
        assertTrue(new NorthwardCistern().sift43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new NorthwardCistern().sift43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight43() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardCistern().sift43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias44() {
        assertEquals("below", new NorthwardCistern().brace44(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias44() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("lower-bound", subject.brace44(2));
        assertEquals("upper-bound", subject.brace44(9));
    }

    @Test
    void classifiesWithinAndAboveBias44() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("within", subject.brace44(2 + 1));
        assertEquals("above", subject.brace44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin45() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge45());
        }
        assertEquals(2, subject.quota45Count());
    }

    @Test
    void refusesOnceExhaustedMargin45() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 2; i++) {
            subject.gauge45();
        }
        assertFalse(subject.gauge45());
    }

    @Test
    void accumulatesBelowTheCapThreshold46() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals(1, subject.brace46(1));
        assertEquals(3, subject.brace46(2));
    }

    @Test
    void saturatesAtTheCapThreshold46() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.brace46(26);
        assertEquals(26, subject.brace46(5));
    }

    @Test
    void ignoresNegativeValuesThreshold46() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.brace46(3);
        assertEquals(3, subject.brace46(-2));
        assertEquals(3, subject.tally46Value());
    }

    @Test
    void rejectsZeroDenominatorRatio47() {
        NorthwardCistern subject = new NorthwardCistern();
        assertThrows(ArithmeticException.class, () -> subject.brace47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio47() {
        assertEquals(0.5, new NorthwardCistern().brace47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio47() {
        assertEquals(3.0, new NorthwardCistern().brace47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio48() {
        assertTrue(new NorthwardCistern().reconcile48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardCistern().reconcile48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio48() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardCistern().reconcile48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally49() {
        assertEquals("below", new NorthwardCistern().prune49(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally49() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("lower-bound", subject.prune49(3));
        assertEquals("upper-bound", subject.prune49(8));
    }

    @Test
    void classifiesWithinAndAboveTally49() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals("within", subject.prune49(3 + 1));
        assertEquals("above", subject.prune49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset50() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist50());
        }
        assertEquals(3, subject.drift50Count());
    }

    @Test
    void refusesOnceExhaustedOffset50() {
        NorthwardCistern subject = new NorthwardCistern();
        for (int i = 0; i < 3; i++) {
            subject.hoist50();
        }
        assertFalse(subject.hoist50());
    }

    @Test
    void accumulatesBelowTheCapCadence51() {
        NorthwardCistern subject = new NorthwardCistern();
        assertEquals(1, subject.temper51(1));
        assertEquals(3, subject.temper51(2));
    }

    @Test
    void saturatesAtTheCapCadence51() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.temper51(31);
        assertEquals(31, subject.temper51(5));
    }

    @Test
    void ignoresNegativeValuesCadence51() {
        NorthwardCistern subject = new NorthwardCistern();
        subject.temper51(3);
        assertEquals(3, subject.temper51(-2));
        assertEquals(3, subject.ratio51Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold52() {
        NorthwardCistern subject = new NorthwardCistern();
        assertThrows(ArithmeticException.class, () -> subject.flatten52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold52() {
        assertEquals(0.5, new NorthwardCistern().flatten52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold52() {
        assertEquals(3.0, new NorthwardCistern().flatten52(1000.0, 1.0), 1e-9);
    }
}
