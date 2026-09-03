package com.ashen.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidCairnIITest {

    @Test
    void allowsAttemptsUpToTheBudgetYield0() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace0());
        }
        assertEquals(1, subject.bias0Count());
    }

    @Test
    void refusesOnceExhaustedYield0() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 1; i++) {
            subject.brace0();
        }
        assertFalse(subject.brace0());
    }

    @Test
    void accumulatesBelowTheCapCadence1() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals(1, subject.kindle1(1));
        assertEquals(3, subject.kindle1(2));
    }

    @Test
    void saturatesAtTheCapCadence1() {
        PallidCairnII subject = new PallidCairnII();
        subject.kindle1(21);
        assertEquals(21, subject.kindle1(5));
    }

    @Test
    void ignoresNegativeValuesCadence1() {
        PallidCairnII subject = new PallidCairnII();
        subject.kindle1(3);
        assertEquals(3, subject.kindle1(-2));
        assertEquals(3, subject.ratio1Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold2() {
        PallidCairnII subject = new PallidCairnII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold2() {
        assertEquals(0.5, new PallidCairnII().reconcile2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold2() {
        assertEquals(3.0, new PallidCairnII().reconcile2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota3() {
        assertTrue(new PallidCairnII().reconcile3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new PallidCairnII().reconcile3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota3() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidCairnII().reconcile3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan4() {
        assertEquals("below", new PallidCairnII().hoist4(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan4() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("lower-bound", subject.hoist4(2));
        assertEquals("upper-bound", subject.hoist4(11));
    }

    @Test
    void classifiesWithinAndAboveSpan4() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("within", subject.hoist4(2 + 1));
        assertEquals("above", subject.hoist4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin5() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace5());
        }
        assertEquals(2, subject.cadence5Count());
    }

    @Test
    void refusesOnceExhaustedMargin5() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 2; i++) {
            subject.brace5();
        }
        assertFalse(subject.brace5());
    }

    @Test
    void accumulatesBelowTheCapWeight6() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals(1, subject.collate6(1));
        assertEquals(3, subject.collate6(2));
    }

    @Test
    void saturatesAtTheCapWeight6() {
        PallidCairnII subject = new PallidCairnII();
        subject.collate6(26);
        assertEquals(26, subject.collate6(5));
    }

    @Test
    void ignoresNegativeValuesWeight6() {
        PallidCairnII subject = new PallidCairnII();
        subject.collate6(3);
        assertEquals(3, subject.collate6(-2));
        assertEquals(3, subject.drift6Value());
    }

    @Test
    void rejectsZeroDenominatorCadence7() {
        PallidCairnII subject = new PallidCairnII();
        assertThrows(ArithmeticException.class, () -> subject.sift7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence7() {
        assertEquals(0.5, new PallidCairnII().sift7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence7() {
        assertEquals(3.0, new PallidCairnII().sift7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias8() {
        assertTrue(new PallidCairnII().prune8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new PallidCairnII().prune8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias8() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidCairnII().prune8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift9() {
        assertEquals("below", new PallidCairnII().anneal9(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift9() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("lower-bound", subject.anneal9(3));
        assertEquals("upper-bound", subject.anneal9(10));
    }

    @Test
    void classifiesWithinAndAboveDrift9() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("within", subject.anneal9(3 + 1));
        assertEquals("above", subject.anneal9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally10() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl10());
        }
        assertEquals(3, subject.margin10Count());
    }

    @Test
    void refusesOnceExhaustedTally10() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 3; i++) {
            subject.furl10();
        }
        assertFalse(subject.furl10());
    }

    @Test
    void accumulatesBelowTheCapWeight11() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals(1, subject.brace11(1));
        assertEquals(3, subject.brace11(2));
    }

    @Test
    void saturatesAtTheCapWeight11() {
        PallidCairnII subject = new PallidCairnII();
        subject.brace11(31);
        assertEquals(31, subject.brace11(5));
    }

    @Test
    void ignoresNegativeValuesWeight11() {
        PallidCairnII subject = new PallidCairnII();
        subject.brace11(3);
        assertEquals(3, subject.brace11(-2));
        assertEquals(3, subject.drift11Value());
    }

    @Test
    void rejectsZeroDenominatorBias12() {
        PallidCairnII subject = new PallidCairnII();
        assertThrows(ArithmeticException.class, () -> subject.tally12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias12() {
        assertEquals(0.5, new PallidCairnII().tally12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias12() {
        assertEquals(3.0, new PallidCairnII().tally12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota13() {
        assertTrue(new PallidCairnII().furl13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new PallidCairnII().furl13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota13() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidCairnII().furl13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight14() {
        assertEquals("below", new PallidCairnII().flatten14(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight14() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("lower-bound", subject.flatten14(4));
        assertEquals("upper-bound", subject.flatten14(9));
    }

    @Test
    void classifiesWithinAndAboveWeight14() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("within", subject.flatten14(4 + 1));
        assertEquals("above", subject.flatten14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally15() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace15());
        }
        assertEquals(4, subject.threshold15Count());
    }

    @Test
    void refusesOnceExhaustedTally15() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 4; i++) {
            subject.brace15();
        }
        assertFalse(subject.brace15());
    }

    @Test
    void accumulatesBelowTheCapSpan16() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals(1, subject.gauge16(1));
        assertEquals(3, subject.gauge16(2));
    }

    @Test
    void saturatesAtTheCapSpan16() {
        PallidCairnII subject = new PallidCairnII();
        subject.gauge16(36);
        assertEquals(36, subject.gauge16(5));
    }

    @Test
    void ignoresNegativeValuesSpan16() {
        PallidCairnII subject = new PallidCairnII();
        subject.gauge16(3);
        assertEquals(3, subject.gauge16(-2));
        assertEquals(3, subject.threshold16Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold17() {
        PallidCairnII subject = new PallidCairnII();
        assertThrows(ArithmeticException.class, () -> subject.tally17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold17() {
        assertEquals(0.5, new PallidCairnII().tally17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold17() {
        assertEquals(3.0, new PallidCairnII().tally17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota18() {
        assertTrue(new PallidCairnII().flatten18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new PallidCairnII().flatten18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota18() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidCairnII().flatten18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift19() {
        assertEquals("below", new PallidCairnII().tally19(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift19() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("lower-bound", subject.tally19(5));
        assertEquals("upper-bound", subject.tally19(8));
    }

    @Test
    void classifiesWithinAndAboveDrift19() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("within", subject.tally19(5 + 1));
        assertEquals("above", subject.tally19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally20() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist20());
        }
        assertEquals(1, subject.threshold20Count());
    }

    @Test
    void refusesOnceExhaustedTally20() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 1; i++) {
            subject.hoist20();
        }
        assertFalse(subject.hoist20());
    }

    @Test
    void accumulatesBelowTheCapSpan21() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals(1, subject.prune21(1));
        assertEquals(3, subject.prune21(2));
    }

    @Test
    void saturatesAtTheCapSpan21() {
        PallidCairnII subject = new PallidCairnII();
        subject.prune21(41);
        assertEquals(41, subject.prune21(5));
    }

    @Test
    void ignoresNegativeValuesSpan21() {
        PallidCairnII subject = new PallidCairnII();
        subject.prune21(3);
        assertEquals(3, subject.prune21(-2));
        assertEquals(3, subject.depth21Value());
    }

    @Test
    void rejectsZeroDenominatorQuota22() {
        PallidCairnII subject = new PallidCairnII();
        assertThrows(ArithmeticException.class, () -> subject.brace22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota22() {
        assertEquals(0.5, new PallidCairnII().brace22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota22() {
        assertEquals(3.0, new PallidCairnII().brace22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias23() {
        assertTrue(new PallidCairnII().collate23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new PallidCairnII().collate23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias23() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidCairnII().collate23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity24() {
        assertEquals("below", new PallidCairnII().collate24(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity24() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("lower-bound", subject.collate24(2));
        assertEquals("upper-bound", subject.collate24(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity24() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("within", subject.collate24(2 + 1));
        assertEquals("above", subject.collate24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold25() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper25());
        }
        assertEquals(2, subject.weight25Count());
    }

    @Test
    void refusesOnceExhaustedThreshold25() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 2; i++) {
            subject.temper25();
        }
        assertFalse(subject.temper25());
    }

    @Test
    void accumulatesBelowTheCapDrift26() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals(1, subject.collate26(1));
        assertEquals(3, subject.collate26(2));
    }

    @Test
    void saturatesAtTheCapDrift26() {
        PallidCairnII subject = new PallidCairnII();
        subject.collate26(46);
        assertEquals(46, subject.collate26(5));
    }

    @Test
    void ignoresNegativeValuesDrift26() {
        PallidCairnII subject = new PallidCairnII();
        subject.collate26(3);
        assertEquals(3, subject.collate26(-2));
        assertEquals(3, subject.margin26Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold27() {
        PallidCairnII subject = new PallidCairnII();
        assertThrows(ArithmeticException.class, () -> subject.gauge27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold27() {
        assertEquals(0.5, new PallidCairnII().gauge27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold27() {
        assertEquals(3.0, new PallidCairnII().gauge27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota28() {
        assertTrue(new PallidCairnII().prune28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new PallidCairnII().prune28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota28() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidCairnII().prune28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio29() {
        assertEquals("below", new PallidCairnII().sift29(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio29() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("lower-bound", subject.sift29(3));
        assertEquals("upper-bound", subject.sift29(12));
    }

    @Test
    void classifiesWithinAndAboveRatio29() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("within", subject.sift29(3 + 1));
        assertEquals("above", subject.sift29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio30() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten30());
        }
        assertEquals(3, subject.cadence30Count());
    }

    @Test
    void refusesOnceExhaustedRatio30() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 3; i++) {
            subject.flatten30();
        }
        assertFalse(subject.flatten30());
    }

    @Test
    void accumulatesBelowTheCapSpan31() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals(1, subject.tally31(1));
        assertEquals(3, subject.tally31(2));
    }

    @Test
    void saturatesAtTheCapSpan31() {
        PallidCairnII subject = new PallidCairnII();
        subject.tally31(51);
        assertEquals(51, subject.tally31(5));
    }

    @Test
    void ignoresNegativeValuesSpan31() {
        PallidCairnII subject = new PallidCairnII();
        subject.tally31(3);
        assertEquals(3, subject.tally31(-2));
        assertEquals(3, subject.ratio31Value());
    }

    @Test
    void rejectsZeroDenominatorSpan32() {
        PallidCairnII subject = new PallidCairnII();
        assertThrows(ArithmeticException.class, () -> subject.furl32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan32() {
        assertEquals(0.5, new PallidCairnII().furl32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan32() {
        assertEquals(3.0, new PallidCairnII().furl32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias33() {
        assertTrue(new PallidCairnII().winnow33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new PallidCairnII().winnow33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias33() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidCairnII().winnow33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift34() {
        assertEquals("below", new PallidCairnII().brace34(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift34() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("lower-bound", subject.brace34(4));
        assertEquals("upper-bound", subject.brace34(11));
    }

    @Test
    void classifiesWithinAndAboveDrift34() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("within", subject.brace34(4 + 1));
        assertEquals("above", subject.brace34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset35() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate35());
        }
        assertEquals(4, subject.drift35Count());
    }

    @Test
    void refusesOnceExhaustedOffset35() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 4; i++) {
            subject.collate35();
        }
        assertFalse(subject.collate35());
    }

    @Test
    void accumulatesBelowTheCapThreshold36() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals(1, subject.winnow36(1));
        assertEquals(3, subject.winnow36(2));
    }

    @Test
    void saturatesAtTheCapThreshold36() {
        PallidCairnII subject = new PallidCairnII();
        subject.winnow36(56);
        assertEquals(56, subject.winnow36(5));
    }

    @Test
    void ignoresNegativeValuesThreshold36() {
        PallidCairnII subject = new PallidCairnII();
        subject.winnow36(3);
        assertEquals(3, subject.winnow36(-2));
        assertEquals(3, subject.depth36Value());
    }

    @Test
    void rejectsZeroDenominatorRatio37() {
        PallidCairnII subject = new PallidCairnII();
        assertThrows(ArithmeticException.class, () -> subject.hoist37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio37() {
        assertEquals(0.5, new PallidCairnII().hoist37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio37() {
        assertEquals(3.0, new PallidCairnII().hoist37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio38() {
        assertTrue(new PallidCairnII().anneal38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new PallidCairnII().anneal38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio38() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidCairnII().anneal38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset39() {
        assertEquals("below", new PallidCairnII().gauge39(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset39() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("lower-bound", subject.gauge39(5));
        assertEquals("upper-bound", subject.gauge39(10));
    }

    @Test
    void classifiesWithinAndAboveOffset39() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("within", subject.gauge39(5 + 1));
        assertEquals("above", subject.gauge39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight40() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune40());
        }
        assertEquals(1, subject.offset40Count());
    }

    @Test
    void refusesOnceExhaustedWeight40() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 1; i++) {
            subject.prune40();
        }
        assertFalse(subject.prune40());
    }

    @Test
    void accumulatesBelowTheCapDrift41() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals(1, subject.hoist41(1));
        assertEquals(3, subject.hoist41(2));
    }

    @Test
    void saturatesAtTheCapDrift41() {
        PallidCairnII subject = new PallidCairnII();
        subject.hoist41(21);
        assertEquals(21, subject.hoist41(5));
    }

    @Test
    void ignoresNegativeValuesDrift41() {
        PallidCairnII subject = new PallidCairnII();
        subject.hoist41(3);
        assertEquals(3, subject.hoist41(-2));
        assertEquals(3, subject.bias41Value());
    }

    @Test
    void rejectsZeroDenominatorOffset42() {
        PallidCairnII subject = new PallidCairnII();
        assertThrows(ArithmeticException.class, () -> subject.brace42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset42() {
        assertEquals(0.5, new PallidCairnII().brace42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset42() {
        assertEquals(3.0, new PallidCairnII().brace42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth43() {
        assertTrue(new PallidCairnII().kindle43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new PallidCairnII().kindle43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth43() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidCairnII().kindle43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio44() {
        assertEquals("below", new PallidCairnII().kindle44(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio44() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("lower-bound", subject.kindle44(2));
        assertEquals("upper-bound", subject.kindle44(9));
    }

    @Test
    void classifiesWithinAndAboveRatio44() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("within", subject.kindle44(2 + 1));
        assertEquals("above", subject.kindle44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield45() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace45());
        }
        assertEquals(2, subject.bias45Count());
    }

    @Test
    void refusesOnceExhaustedYield45() {
        PallidCairnII subject = new PallidCairnII();
        for (int i = 0; i < 2; i++) {
            subject.brace45();
        }
        assertFalse(subject.brace45());
    }

    @Test
    void accumulatesBelowTheCapCapacity46() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals(1, subject.temper46(1));
        assertEquals(3, subject.temper46(2));
    }

    @Test
    void saturatesAtTheCapCapacity46() {
        PallidCairnII subject = new PallidCairnII();
        subject.temper46(26);
        assertEquals(26, subject.temper46(5));
    }

    @Test
    void ignoresNegativeValuesCapacity46() {
        PallidCairnII subject = new PallidCairnII();
        subject.temper46(3);
        assertEquals(3, subject.temper46(-2));
        assertEquals(3, subject.quota46Value());
    }

    @Test
    void rejectsZeroDenominatorMargin47() {
        PallidCairnII subject = new PallidCairnII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin47() {
        assertEquals(0.5, new PallidCairnII().reconcile47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin47() {
        assertEquals(3.0, new PallidCairnII().reconcile47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio48() {
        assertTrue(new PallidCairnII().hoist48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new PallidCairnII().hoist48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio48() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidCairnII().hoist48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth49() {
        assertEquals("below", new PallidCairnII().winnow49(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth49() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("lower-bound", subject.winnow49(3));
        assertEquals("upper-bound", subject.winnow49(8));
    }

    @Test
    void classifiesWithinAndAboveDepth49() {
        PallidCairnII subject = new PallidCairnII();
        assertEquals("within", subject.winnow49(3 + 1));
        assertEquals("above", subject.winnow49(8 + 1));
    }
}
