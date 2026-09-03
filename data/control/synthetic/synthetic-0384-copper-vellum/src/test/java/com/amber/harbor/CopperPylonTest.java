package com.amber.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperPylonTest {

    @Test
    void allowsAttemptsUpToTheBudgetSpan0() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle0());
        }
        assertEquals(1, subject.quota0Count());
    }

    @Test
    void refusesOnceExhaustedSpan0() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 1; i++) {
            subject.kindle0();
        }
        assertFalse(subject.kindle0());
    }

    @Test
    void accumulatesBelowTheCapCapacity1() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.gauge1(1));
        assertEquals(3, subject.gauge1(2));
    }

    @Test
    void saturatesAtTheCapCapacity1() {
        CopperPylon subject = new CopperPylon();
        subject.gauge1(21);
        assertEquals(21, subject.gauge1(5));
    }

    @Test
    void ignoresNegativeValuesCapacity1() {
        CopperPylon subject = new CopperPylon();
        subject.gauge1(3);
        assertEquals(3, subject.gauge1(-2));
        assertEquals(3, subject.quota1Value());
    }

    @Test
    void rejectsZeroDenominatorRatio2() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.brace2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio2() {
        assertEquals(0.5, new CopperPylon().brace2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio2() {
        assertEquals(3.0, new CopperPylon().brace2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset3() {
        assertTrue(new CopperPylon().collate3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new CopperPylon().collate3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset3() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperPylon().collate3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset4() {
        assertEquals("below", new CopperPylon().reconcile4(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset4() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.reconcile4(2));
        assertEquals("upper-bound", subject.reconcile4(11));
    }

    @Test
    void classifiesWithinAndAboveOffset4() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.reconcile4(2 + 1));
        assertEquals("above", subject.reconcile4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias5() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper5());
        }
        assertEquals(2, subject.drift5Count());
    }

    @Test
    void refusesOnceExhaustedBias5() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 2; i++) {
            subject.temper5();
        }
        assertFalse(subject.temper5());
    }

    @Test
    void accumulatesBelowTheCapRatio6() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.tally6(1));
        assertEquals(3, subject.tally6(2));
    }

    @Test
    void saturatesAtTheCapRatio6() {
        CopperPylon subject = new CopperPylon();
        subject.tally6(26);
        assertEquals(26, subject.tally6(5));
    }

    @Test
    void ignoresNegativeValuesRatio6() {
        CopperPylon subject = new CopperPylon();
        subject.tally6(3);
        assertEquals(3, subject.tally6(-2));
        assertEquals(3, subject.offset6Value());
    }

    @Test
    void rejectsZeroDenominatorOffset7() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset7() {
        assertEquals(0.5, new CopperPylon().temper7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset7() {
        assertEquals(3.0, new CopperPylon().temper7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset8() {
        assertTrue(new CopperPylon().furl8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new CopperPylon().furl8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset8() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperPylon().furl8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift9() {
        assertEquals("below", new CopperPylon().collate9(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift9() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.collate9(3));
        assertEquals("upper-bound", subject.collate9(10));
    }

    @Test
    void classifiesWithinAndAboveDrift9() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.collate9(3 + 1));
        assertEquals("above", subject.collate9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio10() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally10());
        }
        assertEquals(3, subject.bias10Count());
    }

    @Test
    void refusesOnceExhaustedRatio10() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 3; i++) {
            subject.tally10();
        }
        assertFalse(subject.tally10());
    }

    @Test
    void accumulatesBelowTheCapRatio11() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.brace11(1));
        assertEquals(3, subject.brace11(2));
    }

    @Test
    void saturatesAtTheCapRatio11() {
        CopperPylon subject = new CopperPylon();
        subject.brace11(31);
        assertEquals(31, subject.brace11(5));
    }

    @Test
    void ignoresNegativeValuesRatio11() {
        CopperPylon subject = new CopperPylon();
        subject.brace11(3);
        assertEquals(3, subject.brace11(-2));
        assertEquals(3, subject.drift11Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity12() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity12() {
        assertEquals(0.5, new CopperPylon().hoist12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity12() {
        assertEquals(3.0, new CopperPylon().hoist12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift13() {
        assertTrue(new CopperPylon().temper13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new CopperPylon().temper13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift13() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperPylon().temper13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity14() {
        assertEquals("below", new CopperPylon().flatten14(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity14() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.flatten14(4));
        assertEquals("upper-bound", subject.flatten14(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity14() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.flatten14(4 + 1));
        assertEquals("above", subject.flatten14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset15() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl15());
        }
        assertEquals(4, subject.weight15Count());
    }

    @Test
    void refusesOnceExhaustedOffset15() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 4; i++) {
            subject.furl15();
        }
        assertFalse(subject.furl15());
    }

    @Test
    void accumulatesBelowTheCapCapacity16() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.temper16(1));
        assertEquals(3, subject.temper16(2));
    }

    @Test
    void saturatesAtTheCapCapacity16() {
        CopperPylon subject = new CopperPylon();
        subject.temper16(36);
        assertEquals(36, subject.temper16(5));
    }

    @Test
    void ignoresNegativeValuesCapacity16() {
        CopperPylon subject = new CopperPylon();
        subject.temper16(3);
        assertEquals(3, subject.temper16(-2));
        assertEquals(3, subject.drift16Value());
    }

    @Test
    void rejectsZeroDenominatorTally17() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally17() {
        assertEquals(0.5, new CopperPylon().sift17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally17() {
        assertEquals(3.0, new CopperPylon().sift17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio18() {
        assertTrue(new CopperPylon().temper18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new CopperPylon().temper18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio18() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperPylon().temper18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight19() {
        assertEquals("below", new CopperPylon().prune19(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight19() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.prune19(5));
        assertEquals("upper-bound", subject.prune19(8));
    }

    @Test
    void classifiesWithinAndAboveWeight19() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.prune19(5 + 1));
        assertEquals("above", subject.prune19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias20() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl20());
        }
        assertEquals(1, subject.threshold20Count());
    }

    @Test
    void refusesOnceExhaustedBias20() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 1; i++) {
            subject.furl20();
        }
        assertFalse(subject.furl20());
    }

    @Test
    void accumulatesBelowTheCapSpan21() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.prune21(1));
        assertEquals(3, subject.prune21(2));
    }

    @Test
    void saturatesAtTheCapSpan21() {
        CopperPylon subject = new CopperPylon();
        subject.prune21(41);
        assertEquals(41, subject.prune21(5));
    }

    @Test
    void ignoresNegativeValuesSpan21() {
        CopperPylon subject = new CopperPylon();
        subject.prune21(3);
        assertEquals(3, subject.prune21(-2));
        assertEquals(3, subject.bias21Value());
    }

    @Test
    void rejectsZeroDenominatorMargin22() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin22() {
        assertEquals(0.5, new CopperPylon().kindle22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin22() {
        assertEquals(3.0, new CopperPylon().kindle22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota23() {
        assertTrue(new CopperPylon().flatten23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new CopperPylon().flatten23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota23() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperPylon().flatten23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield24() {
        assertEquals("below", new CopperPylon().gauge24(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield24() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.gauge24(2));
        assertEquals("upper-bound", subject.gauge24(7));
    }

    @Test
    void classifiesWithinAndAboveYield24() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.gauge24(2 + 1));
        assertEquals("above", subject.gauge24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio25() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist25());
        }
        assertEquals(2, subject.span25Count());
    }

    @Test
    void refusesOnceExhaustedRatio25() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 2; i++) {
            subject.hoist25();
        }
        assertFalse(subject.hoist25());
    }

    @Test
    void accumulatesBelowTheCapBias26() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.sift26(1));
        assertEquals(3, subject.sift26(2));
    }

    @Test
    void saturatesAtTheCapBias26() {
        CopperPylon subject = new CopperPylon();
        subject.sift26(46);
        assertEquals(46, subject.sift26(5));
    }

    @Test
    void ignoresNegativeValuesBias26() {
        CopperPylon subject = new CopperPylon();
        subject.sift26(3);
        assertEquals(3, subject.sift26(-2));
        assertEquals(3, subject.span26Value());
    }

    @Test
    void rejectsZeroDenominatorTally27() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally27() {
        assertEquals(0.5, new CopperPylon().hoist27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally27() {
        assertEquals(3.0, new CopperPylon().hoist27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin28() {
        assertTrue(new CopperPylon().collate28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new CopperPylon().collate28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin28() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperPylon().collate28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan29() {
        assertEquals("below", new CopperPylon().hoist29(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan29() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.hoist29(3));
        assertEquals("upper-bound", subject.hoist29(12));
    }

    @Test
    void classifiesWithinAndAboveSpan29() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.hoist29(3 + 1));
        assertEquals("above", subject.hoist29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset30() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle30());
        }
        assertEquals(3, subject.ratio30Count());
    }

    @Test
    void refusesOnceExhaustedOffset30() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 3; i++) {
            subject.kindle30();
        }
        assertFalse(subject.kindle30());
    }

    @Test
    void accumulatesBelowTheCapCadence31() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.gauge31(1));
        assertEquals(3, subject.gauge31(2));
    }

    @Test
    void saturatesAtTheCapCadence31() {
        CopperPylon subject = new CopperPylon();
        subject.gauge31(51);
        assertEquals(51, subject.gauge31(5));
    }

    @Test
    void ignoresNegativeValuesCadence31() {
        CopperPylon subject = new CopperPylon();
        subject.gauge31(3);
        assertEquals(3, subject.gauge31(-2));
        assertEquals(3, subject.threshold31Value());
    }

    @Test
    void rejectsZeroDenominatorRatio32() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.collate32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio32() {
        assertEquals(0.5, new CopperPylon().collate32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio32() {
        assertEquals(3.0, new CopperPylon().collate32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio33() {
        assertTrue(new CopperPylon().prune33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new CopperPylon().prune33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio33() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperPylon().prune33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally34() {
        assertEquals("below", new CopperPylon().kindle34(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally34() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.kindle34(4));
        assertEquals("upper-bound", subject.kindle34(11));
    }

    @Test
    void classifiesWithinAndAboveTally34() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.kindle34(4 + 1));
        assertEquals("above", subject.kindle34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift35() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal35());
        }
        assertEquals(4, subject.tally35Count());
    }

    @Test
    void refusesOnceExhaustedDrift35() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 4; i++) {
            subject.anneal35();
        }
        assertFalse(subject.anneal35());
    }

    @Test
    void accumulatesBelowTheCapBias36() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.furl36(1));
        assertEquals(3, subject.furl36(2));
    }

    @Test
    void saturatesAtTheCapBias36() {
        CopperPylon subject = new CopperPylon();
        subject.furl36(56);
        assertEquals(56, subject.furl36(5));
    }

    @Test
    void ignoresNegativeValuesBias36() {
        CopperPylon subject = new CopperPylon();
        subject.furl36(3);
        assertEquals(3, subject.furl36(-2));
        assertEquals(3, subject.span36Value());
    }

    @Test
    void rejectsZeroDenominatorMargin37() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin37() {
        assertEquals(0.5, new CopperPylon().flatten37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin37() {
        assertEquals(3.0, new CopperPylon().flatten37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift38() {
        assertTrue(new CopperPylon().flatten38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new CopperPylon().flatten38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift38() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperPylon().flatten38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally39() {
        assertEquals("below", new CopperPylon().furl39(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally39() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.furl39(5));
        assertEquals("upper-bound", subject.furl39(10));
    }

    @Test
    void classifiesWithinAndAboveTally39() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.furl39(5 + 1));
        assertEquals("above", subject.furl39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence40() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal40());
        }
        assertEquals(1, subject.margin40Count());
    }

    @Test
    void refusesOnceExhaustedCadence40() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 1; i++) {
            subject.anneal40();
        }
        assertFalse(subject.anneal40());
    }

    @Test
    void accumulatesBelowTheCapQuota41() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.temper41(1));
        assertEquals(3, subject.temper41(2));
    }

    @Test
    void saturatesAtTheCapQuota41() {
        CopperPylon subject = new CopperPylon();
        subject.temper41(21);
        assertEquals(21, subject.temper41(5));
    }

    @Test
    void ignoresNegativeValuesQuota41() {
        CopperPylon subject = new CopperPylon();
        subject.temper41(3);
        assertEquals(3, subject.temper41(-2));
        assertEquals(3, subject.weight41Value());
    }

    @Test
    void rejectsZeroDenominatorSpan42() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.winnow42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan42() {
        assertEquals(0.5, new CopperPylon().winnow42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan42() {
        assertEquals(3.0, new CopperPylon().winnow42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth43() {
        assertTrue(new CopperPylon().temper43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new CopperPylon().temper43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth43() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperPylon().temper43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias44() {
        assertEquals("below", new CopperPylon().hoist44(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias44() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.hoist44(2));
        assertEquals("upper-bound", subject.hoist44(9));
    }

    @Test
    void classifiesWithinAndAboveBias44() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.hoist44(2 + 1));
        assertEquals("above", subject.hoist44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias45() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten45());
        }
        assertEquals(2, subject.threshold45Count());
    }

    @Test
    void refusesOnceExhaustedBias45() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 2; i++) {
            subject.flatten45();
        }
        assertFalse(subject.flatten45());
    }

    @Test
    void accumulatesBelowTheCapTally46() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.furl46(1));
        assertEquals(3, subject.furl46(2));
    }

    @Test
    void saturatesAtTheCapTally46() {
        CopperPylon subject = new CopperPylon();
        subject.furl46(26);
        assertEquals(26, subject.furl46(5));
    }

    @Test
    void ignoresNegativeValuesTally46() {
        CopperPylon subject = new CopperPylon();
        subject.furl46(3);
        assertEquals(3, subject.furl46(-2));
        assertEquals(3, subject.yield46Value());
    }

    @Test
    void rejectsZeroDenominatorQuota47() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.furl47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota47() {
        assertEquals(0.5, new CopperPylon().furl47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota47() {
        assertEquals(3.0, new CopperPylon().furl47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias48() {
        assertTrue(new CopperPylon().hoist48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new CopperPylon().hoist48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias48() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperPylon().hoist48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth49() {
        assertEquals("below", new CopperPylon().kindle49(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth49() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.kindle49(3));
        assertEquals("upper-bound", subject.kindle49(8));
    }

    @Test
    void classifiesWithinAndAboveDepth49() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.kindle49(3 + 1));
        assertEquals("above", subject.kindle49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity50() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally50());
        }
        assertEquals(3, subject.weight50Count());
    }

    @Test
    void refusesOnceExhaustedCapacity50() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 3; i++) {
            subject.tally50();
        }
        assertFalse(subject.tally50());
    }

    @Test
    void accumulatesBelowTheCapCadence51() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.temper51(1));
        assertEquals(3, subject.temper51(2));
    }

    @Test
    void saturatesAtTheCapCadence51() {
        CopperPylon subject = new CopperPylon();
        subject.temper51(31);
        assertEquals(31, subject.temper51(5));
    }

    @Test
    void ignoresNegativeValuesCadence51() {
        CopperPylon subject = new CopperPylon();
        subject.temper51(3);
        assertEquals(3, subject.temper51(-2));
        assertEquals(3, subject.weight51Value());
    }

    @Test
    void rejectsZeroDenominatorYield52() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield52() {
        assertEquals(0.5, new CopperPylon().flatten52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield52() {
        assertEquals(3.0, new CopperPylon().flatten52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight53() {
        assertTrue(new CopperPylon().tally53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new CopperPylon().tally53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight53() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperPylon().tally53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally54() {
        assertEquals("below", new CopperPylon().reconcile54(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally54() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.reconcile54(4));
        assertEquals("upper-bound", subject.reconcile54(7));
    }

    @Test
    void classifiesWithinAndAboveTally54() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.reconcile54(4 + 1));
        assertEquals("above", subject.reconcile54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias55() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist55());
        }
        assertEquals(4, subject.offset55Count());
    }

    @Test
    void refusesOnceExhaustedBias55() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 4; i++) {
            subject.hoist55();
        }
        assertFalse(subject.hoist55());
    }

    @Test
    void accumulatesBelowTheCapOffset56() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.sift56(1));
        assertEquals(3, subject.sift56(2));
    }

    @Test
    void saturatesAtTheCapOffset56() {
        CopperPylon subject = new CopperPylon();
        subject.sift56(36);
        assertEquals(36, subject.sift56(5));
    }

    @Test
    void ignoresNegativeValuesOffset56() {
        CopperPylon subject = new CopperPylon();
        subject.sift56(3);
        assertEquals(3, subject.sift56(-2));
        assertEquals(3, subject.bias56Value());
    }

    @Test
    void rejectsZeroDenominatorSpan57() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan57() {
        assertEquals(0.5, new CopperPylon().kindle57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan57() {
        assertEquals(3.0, new CopperPylon().kindle57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota58() {
        assertTrue(new CopperPylon().temper58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new CopperPylon().temper58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota58() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperPylon().temper58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth59() {
        assertEquals("below", new CopperPylon().anneal59(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth59() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.anneal59(5));
        assertEquals("upper-bound", subject.anneal59(12));
    }

    @Test
    void classifiesWithinAndAboveDepth59() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.anneal59(5 + 1));
        assertEquals("above", subject.anneal59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight60() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten60());
        }
        assertEquals(1, subject.cadence60Count());
    }

    @Test
    void refusesOnceExhaustedWeight60() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 1; i++) {
            subject.flatten60();
        }
        assertFalse(subject.flatten60());
    }

    @Test
    void accumulatesBelowTheCapTally61() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.prune61(1));
        assertEquals(3, subject.prune61(2));
    }

    @Test
    void saturatesAtTheCapTally61() {
        CopperPylon subject = new CopperPylon();
        subject.prune61(41);
        assertEquals(41, subject.prune61(5));
    }

    @Test
    void ignoresNegativeValuesTally61() {
        CopperPylon subject = new CopperPylon();
        subject.prune61(3);
        assertEquals(3, subject.prune61(-2));
        assertEquals(3, subject.ratio61Value());
    }

    @Test
    void rejectsZeroDenominatorBias62() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias62() {
        assertEquals(0.5, new CopperPylon().anneal62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias62() {
        assertEquals(3.0, new CopperPylon().anneal62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan63() {
        assertTrue(new CopperPylon().brace63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new CopperPylon().brace63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan63() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperPylon().brace63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally64() {
        assertEquals("below", new CopperPylon().brace64(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally64() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.brace64(2));
        assertEquals("upper-bound", subject.brace64(11));
    }

    @Test
    void classifiesWithinAndAboveTally64() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.brace64(2 + 1));
        assertEquals("above", subject.brace64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold65() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle65());
        }
        assertEquals(2, subject.bias65Count());
    }

    @Test
    void refusesOnceExhaustedThreshold65() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 2; i++) {
            subject.kindle65();
        }
        assertFalse(subject.kindle65());
    }

    @Test
    void accumulatesBelowTheCapDepth66() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.brace66(1));
        assertEquals(3, subject.brace66(2));
    }

    @Test
    void saturatesAtTheCapDepth66() {
        CopperPylon subject = new CopperPylon();
        subject.brace66(46);
        assertEquals(46, subject.brace66(5));
    }

    @Test
    void ignoresNegativeValuesDepth66() {
        CopperPylon subject = new CopperPylon();
        subject.brace66(3);
        assertEquals(3, subject.brace66(-2));
        assertEquals(3, subject.tally66Value());
    }

    @Test
    void rejectsZeroDenominatorTally67() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally67() {
        assertEquals(0.5, new CopperPylon().kindle67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally67() {
        assertEquals(3.0, new CopperPylon().kindle67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota68() {
        assertTrue(new CopperPylon().kindle68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new CopperPylon().kindle68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota68() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperPylon().kindle68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio69() {
        assertEquals("below", new CopperPylon().kindle69(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio69() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.kindle69(3));
        assertEquals("upper-bound", subject.kindle69(10));
    }

    @Test
    void classifiesWithinAndAboveRatio69() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.kindle69(3 + 1));
        assertEquals("above", subject.kindle69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold70() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift70());
        }
        assertEquals(3, subject.offset70Count());
    }

    @Test
    void refusesOnceExhaustedThreshold70() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 3; i++) {
            subject.sift70();
        }
        assertFalse(subject.sift70());
    }

    @Test
    void accumulatesBelowTheCapRatio71() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.winnow71(1));
        assertEquals(3, subject.winnow71(2));
    }

    @Test
    void saturatesAtTheCapRatio71() {
        CopperPylon subject = new CopperPylon();
        subject.winnow71(51);
        assertEquals(51, subject.winnow71(5));
    }

    @Test
    void ignoresNegativeValuesRatio71() {
        CopperPylon subject = new CopperPylon();
        subject.winnow71(3);
        assertEquals(3, subject.winnow71(-2));
        assertEquals(3, subject.margin71Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity72() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity72() {
        assertEquals(0.5, new CopperPylon().sift72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity72() {
        assertEquals(3.0, new CopperPylon().sift72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias73() {
        assertTrue(new CopperPylon().tally73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new CopperPylon().tally73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias73() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperPylon().tally73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan74() {
        assertEquals("below", new CopperPylon().tally74(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan74() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.tally74(4));
        assertEquals("upper-bound", subject.tally74(9));
    }

    @Test
    void classifiesWithinAndAboveSpan74() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.tally74(4 + 1));
        assertEquals("above", subject.tally74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold75() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper75());
        }
        assertEquals(4, subject.ratio75Count());
    }

    @Test
    void refusesOnceExhaustedThreshold75() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 4; i++) {
            subject.temper75();
        }
        assertFalse(subject.temper75());
    }

    @Test
    void accumulatesBelowTheCapWeight76() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.flatten76(1));
        assertEquals(3, subject.flatten76(2));
    }

    @Test
    void saturatesAtTheCapWeight76() {
        CopperPylon subject = new CopperPylon();
        subject.flatten76(56);
        assertEquals(56, subject.flatten76(5));
    }

    @Test
    void ignoresNegativeValuesWeight76() {
        CopperPylon subject = new CopperPylon();
        subject.flatten76(3);
        assertEquals(3, subject.flatten76(-2));
        assertEquals(3, subject.offset76Value());
    }

    @Test
    void rejectsZeroDenominatorDrift77() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift77() {
        assertEquals(0.5, new CopperPylon().flatten77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift77() {
        assertEquals(3.0, new CopperPylon().flatten77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence78() {
        assertTrue(new CopperPylon().kindle78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new CopperPylon().kindle78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence78() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperPylon().kindle78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight79() {
        assertEquals("below", new CopperPylon().brace79(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight79() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.brace79(5));
        assertEquals("upper-bound", subject.brace79(8));
    }

    @Test
    void classifiesWithinAndAboveWeight79() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.brace79(5 + 1));
        assertEquals("above", subject.brace79(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight80() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle80());
        }
        assertEquals(1, subject.bias80Count());
    }

    @Test
    void refusesOnceExhaustedWeight80() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 1; i++) {
            subject.kindle80();
        }
        assertFalse(subject.kindle80());
    }

    @Test
    void accumulatesBelowTheCapDepth81() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.anneal81(1));
        assertEquals(3, subject.anneal81(2));
    }

    @Test
    void saturatesAtTheCapDepth81() {
        CopperPylon subject = new CopperPylon();
        subject.anneal81(21);
        assertEquals(21, subject.anneal81(5));
    }

    @Test
    void ignoresNegativeValuesDepth81() {
        CopperPylon subject = new CopperPylon();
        subject.anneal81(3);
        assertEquals(3, subject.anneal81(-2));
        assertEquals(3, subject.span81Value());
    }

    @Test
    void rejectsZeroDenominatorDepth82() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile82(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth82() {
        assertEquals(0.5, new CopperPylon().reconcile82(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth82() {
        assertEquals(3.0, new CopperPylon().reconcile82(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin83() {
        assertTrue(new CopperPylon().sift83(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin83() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new CopperPylon().sift83(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin83() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperPylon().sift83(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan84() {
        assertEquals("below", new CopperPylon().kindle84(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan84() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.kindle84(2));
        assertEquals("upper-bound", subject.kindle84(7));
    }

    @Test
    void classifiesWithinAndAboveSpan84() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.kindle84(2 + 1));
        assertEquals("above", subject.kindle84(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin85() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten85());
        }
        assertEquals(2, subject.threshold85Count());
    }

    @Test
    void refusesOnceExhaustedMargin85() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 2; i++) {
            subject.flatten85();
        }
        assertFalse(subject.flatten85());
    }

    @Test
    void accumulatesBelowTheCapTally86() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.furl86(1));
        assertEquals(3, subject.furl86(2));
    }

    @Test
    void saturatesAtTheCapTally86() {
        CopperPylon subject = new CopperPylon();
        subject.furl86(26);
        assertEquals(26, subject.furl86(5));
    }

    @Test
    void ignoresNegativeValuesTally86() {
        CopperPylon subject = new CopperPylon();
        subject.furl86(3);
        assertEquals(3, subject.furl86(-2));
        assertEquals(3, subject.cadence86Value());
    }

    @Test
    void rejectsZeroDenominatorCadence87() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.gauge87(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence87() {
        assertEquals(0.5, new CopperPylon().gauge87(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence87() {
        assertEquals(3.0, new CopperPylon().gauge87(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota88() {
        assertTrue(new CopperPylon().hoist88(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota88() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new CopperPylon().hoist88(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota88() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperPylon().hoist88(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan89() {
        assertEquals("below", new CopperPylon().tally89(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan89() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.tally89(3));
        assertEquals("upper-bound", subject.tally89(12));
    }

    @Test
    void classifiesWithinAndAboveSpan89() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.tally89(3 + 1));
        assertEquals("above", subject.tally89(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight90() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow90());
        }
        assertEquals(3, subject.drift90Count());
    }

    @Test
    void refusesOnceExhaustedWeight90() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 3; i++) {
            subject.winnow90();
        }
        assertFalse(subject.winnow90());
    }

    @Test
    void accumulatesBelowTheCapMargin91() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.brace91(1));
        assertEquals(3, subject.brace91(2));
    }

    @Test
    void saturatesAtTheCapMargin91() {
        CopperPylon subject = new CopperPylon();
        subject.brace91(31);
        assertEquals(31, subject.brace91(5));
    }

    @Test
    void ignoresNegativeValuesMargin91() {
        CopperPylon subject = new CopperPylon();
        subject.brace91(3);
        assertEquals(3, subject.brace91(-2));
        assertEquals(3, subject.threshold91Value());
    }

    @Test
    void rejectsZeroDenominatorTally92() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.winnow92(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally92() {
        assertEquals(0.5, new CopperPylon().winnow92(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally92() {
        assertEquals(3.0, new CopperPylon().winnow92(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence93() {
        assertTrue(new CopperPylon().hoist93(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence93() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new CopperPylon().hoist93(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence93() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperPylon().hoist93(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset94() {
        assertEquals("below", new CopperPylon().temper94(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset94() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.temper94(4));
        assertEquals("upper-bound", subject.temper94(11));
    }

    @Test
    void classifiesWithinAndAboveOffset94() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.temper94(4 + 1));
        assertEquals("above", subject.temper94(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift95() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl95());
        }
        assertEquals(4, subject.offset95Count());
    }

    @Test
    void refusesOnceExhaustedDrift95() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 4; i++) {
            subject.furl95();
        }
        assertFalse(subject.furl95());
    }

    @Test
    void accumulatesBelowTheCapQuota96() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.brace96(1));
        assertEquals(3, subject.brace96(2));
    }

    @Test
    void saturatesAtTheCapQuota96() {
        CopperPylon subject = new CopperPylon();
        subject.brace96(36);
        assertEquals(36, subject.brace96(5));
    }

    @Test
    void ignoresNegativeValuesQuota96() {
        CopperPylon subject = new CopperPylon();
        subject.brace96(3);
        assertEquals(3, subject.brace96(-2));
        assertEquals(3, subject.span96Value());
    }

    @Test
    void rejectsZeroDenominatorOffset97() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist97(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset97() {
        assertEquals(0.5, new CopperPylon().hoist97(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset97() {
        assertEquals(3.0, new CopperPylon().hoist97(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold98() {
        assertTrue(new CopperPylon().temper98(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold98() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new CopperPylon().temper98(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold98() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperPylon().temper98(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence99() {
        assertEquals("below", new CopperPylon().sift99(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence99() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.sift99(5));
        assertEquals("upper-bound", subject.sift99(10));
    }

    @Test
    void classifiesWithinAndAboveCadence99() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.sift99(5 + 1));
        assertEquals("above", subject.sift99(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally100() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper100());
        }
        assertEquals(1, subject.margin100Count());
    }

    @Test
    void refusesOnceExhaustedTally100() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 1; i++) {
            subject.temper100();
        }
        assertFalse(subject.temper100());
    }

    @Test
    void accumulatesBelowTheCapMargin101() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.tally101(1));
        assertEquals(3, subject.tally101(2));
    }

    @Test
    void saturatesAtTheCapMargin101() {
        CopperPylon subject = new CopperPylon();
        subject.tally101(41);
        assertEquals(41, subject.tally101(5));
    }

    @Test
    void ignoresNegativeValuesMargin101() {
        CopperPylon subject = new CopperPylon();
        subject.tally101(3);
        assertEquals(3, subject.tally101(-2));
        assertEquals(3, subject.capacity101Value());
    }

    @Test
    void rejectsZeroDenominatorWeight102() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.winnow102(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight102() {
        assertEquals(0.5, new CopperPylon().winnow102(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight102() {
        assertEquals(3.0, new CopperPylon().winnow102(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth103() {
        assertTrue(new CopperPylon().temper103(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth103() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new CopperPylon().temper103(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth103() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperPylon().temper103(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota104() {
        assertEquals("below", new CopperPylon().kindle104(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota104() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.kindle104(2));
        assertEquals("upper-bound", subject.kindle104(9));
    }

    @Test
    void classifiesWithinAndAboveQuota104() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.kindle104(2 + 1));
        assertEquals("above", subject.kindle104(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift105() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow105());
        }
        assertEquals(2, subject.cadence105Count());
    }

    @Test
    void refusesOnceExhaustedDrift105() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 2; i++) {
            subject.winnow105();
        }
        assertFalse(subject.winnow105());
    }

    @Test
    void accumulatesBelowTheCapMargin106() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.kindle106(1));
        assertEquals(3, subject.kindle106(2));
    }

    @Test
    void saturatesAtTheCapMargin106() {
        CopperPylon subject = new CopperPylon();
        subject.kindle106(46);
        assertEquals(46, subject.kindle106(5));
    }

    @Test
    void ignoresNegativeValuesMargin106() {
        CopperPylon subject = new CopperPylon();
        subject.kindle106(3);
        assertEquals(3, subject.kindle106(-2));
        assertEquals(3, subject.threshold106Value());
    }

    @Test
    void rejectsZeroDenominatorYield107() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten107(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield107() {
        assertEquals(0.5, new CopperPylon().flatten107(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield107() {
        assertEquals(3.0, new CopperPylon().flatten107(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity108() {
        assertTrue(new CopperPylon().temper108(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity108() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new CopperPylon().temper108(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity108() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperPylon().temper108(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth109() {
        assertEquals("below", new CopperPylon().tally109(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth109() {
        CopperPylon subject = new CopperPylon();
        assertEquals("lower-bound", subject.tally109(3));
        assertEquals("upper-bound", subject.tally109(8));
    }

    @Test
    void classifiesWithinAndAboveDepth109() {
        CopperPylon subject = new CopperPylon();
        assertEquals("within", subject.tally109(3 + 1));
        assertEquals("above", subject.tally109(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold110() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune110());
        }
        assertEquals(3, subject.ratio110Count());
    }

    @Test
    void refusesOnceExhaustedThreshold110() {
        CopperPylon subject = new CopperPylon();
        for (int i = 0; i < 3; i++) {
            subject.prune110();
        }
        assertFalse(subject.prune110());
    }

    @Test
    void accumulatesBelowTheCapYield111() {
        CopperPylon subject = new CopperPylon();
        assertEquals(1, subject.winnow111(1));
        assertEquals(3, subject.winnow111(2));
    }

    @Test
    void saturatesAtTheCapYield111() {
        CopperPylon subject = new CopperPylon();
        subject.winnow111(51);
        assertEquals(51, subject.winnow111(5));
    }

    @Test
    void ignoresNegativeValuesYield111() {
        CopperPylon subject = new CopperPylon();
        subject.winnow111(3);
        assertEquals(3, subject.winnow111(-2));
        assertEquals(3, subject.span111Value());
    }

    @Test
    void rejectsZeroDenominatorMargin112() {
        CopperPylon subject = new CopperPylon();
        assertThrows(ArithmeticException.class, () -> subject.furl112(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin112() {
        assertEquals(0.5, new CopperPylon().furl112(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin112() {
        assertEquals(3.0, new CopperPylon().furl112(1000.0, 1.0), 1e-9);
    }
}
