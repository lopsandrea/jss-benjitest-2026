package com.copper.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateBastionTest {

    @Test
    void allowsAttemptsUpToTheBudgetSpan0() {
        SlateBastion subject = new SlateBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal0());
        }
        assertEquals(1, subject.tally0Count());
    }

    @Test
    void refusesOnceExhaustedSpan0() {
        SlateBastion subject = new SlateBastion();
        for (int i = 0; i < 1; i++) {
            subject.anneal0();
        }
        assertFalse(subject.anneal0());
    }

    @Test
    void accumulatesBelowTheCapSpan1() {
        SlateBastion subject = new SlateBastion();
        assertEquals(1, subject.reconcile1(1));
        assertEquals(3, subject.reconcile1(2));
    }

    @Test
    void saturatesAtTheCapSpan1() {
        SlateBastion subject = new SlateBastion();
        subject.reconcile1(21);
        assertEquals(21, subject.reconcile1(5));
    }

    @Test
    void ignoresNegativeValuesSpan1() {
        SlateBastion subject = new SlateBastion();
        subject.reconcile1(3);
        assertEquals(3, subject.reconcile1(-2));
        assertEquals(3, subject.yield1Value());
    }

    @Test
    void rejectsZeroDenominatorMargin2() {
        SlateBastion subject = new SlateBastion();
        assertThrows(ArithmeticException.class, () -> subject.sift2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin2() {
        assertEquals(0.5, new SlateBastion().sift2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin2() {
        assertEquals(3.0, new SlateBastion().sift2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota3() {
        assertTrue(new SlateBastion().temper3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SlateBastion().temper3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota3() {
        assertEquals(java.util.Arrays.asList(9),
                new SlateBastion().temper3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence4() {
        assertEquals("below", new SlateBastion().gauge4(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence4() {
        SlateBastion subject = new SlateBastion();
        assertEquals("lower-bound", subject.gauge4(2));
        assertEquals("upper-bound", subject.gauge4(11));
    }

    @Test
    void classifiesWithinAndAboveCadence4() {
        SlateBastion subject = new SlateBastion();
        assertEquals("within", subject.gauge4(2 + 1));
        assertEquals("above", subject.gauge4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin5() {
        SlateBastion subject = new SlateBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally5());
        }
        assertEquals(2, subject.weight5Count());
    }

    @Test
    void refusesOnceExhaustedMargin5() {
        SlateBastion subject = new SlateBastion();
        for (int i = 0; i < 2; i++) {
            subject.tally5();
        }
        assertFalse(subject.tally5());
    }

    @Test
    void accumulatesBelowTheCapBias6() {
        SlateBastion subject = new SlateBastion();
        assertEquals(1, subject.reconcile6(1));
        assertEquals(3, subject.reconcile6(2));
    }

    @Test
    void saturatesAtTheCapBias6() {
        SlateBastion subject = new SlateBastion();
        subject.reconcile6(26);
        assertEquals(26, subject.reconcile6(5));
    }

    @Test
    void ignoresNegativeValuesBias6() {
        SlateBastion subject = new SlateBastion();
        subject.reconcile6(3);
        assertEquals(3, subject.reconcile6(-2));
        assertEquals(3, subject.threshold6Value());
    }

    @Test
    void rejectsZeroDenominatorYield7() {
        SlateBastion subject = new SlateBastion();
        assertThrows(ArithmeticException.class, () -> subject.temper7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield7() {
        assertEquals(0.5, new SlateBastion().temper7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield7() {
        assertEquals(3.0, new SlateBastion().temper7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota8() {
        assertTrue(new SlateBastion().collate8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SlateBastion().collate8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota8() {
        assertEquals(java.util.Arrays.asList(14),
                new SlateBastion().collate8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota9() {
        assertEquals("below", new SlateBastion().collate9(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota9() {
        SlateBastion subject = new SlateBastion();
        assertEquals("lower-bound", subject.collate9(3));
        assertEquals("upper-bound", subject.collate9(10));
    }

    @Test
    void classifiesWithinAndAboveQuota9() {
        SlateBastion subject = new SlateBastion();
        assertEquals("within", subject.collate9(3 + 1));
        assertEquals("above", subject.collate9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias10() {
        SlateBastion subject = new SlateBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge10());
        }
        assertEquals(3, subject.offset10Count());
    }

    @Test
    void refusesOnceExhaustedBias10() {
        SlateBastion subject = new SlateBastion();
        for (int i = 0; i < 3; i++) {
            subject.gauge10();
        }
        assertFalse(subject.gauge10());
    }

    @Test
    void accumulatesBelowTheCapRatio11() {
        SlateBastion subject = new SlateBastion();
        assertEquals(1, subject.winnow11(1));
        assertEquals(3, subject.winnow11(2));
    }

    @Test
    void saturatesAtTheCapRatio11() {
        SlateBastion subject = new SlateBastion();
        subject.winnow11(31);
        assertEquals(31, subject.winnow11(5));
    }

    @Test
    void ignoresNegativeValuesRatio11() {
        SlateBastion subject = new SlateBastion();
        subject.winnow11(3);
        assertEquals(3, subject.winnow11(-2));
        assertEquals(3, subject.weight11Value());
    }

    @Test
    void rejectsZeroDenominatorTally12() {
        SlateBastion subject = new SlateBastion();
        assertThrows(ArithmeticException.class, () -> subject.furl12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally12() {
        assertEquals(0.5, new SlateBastion().furl12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally12() {
        assertEquals(3.0, new SlateBastion().furl12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio13() {
        assertTrue(new SlateBastion().brace13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SlateBastion().brace13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio13() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateBastion().brace13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth14() {
        assertEquals("below", new SlateBastion().tally14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth14() {
        SlateBastion subject = new SlateBastion();
        assertEquals("lower-bound", subject.tally14(4));
        assertEquals("upper-bound", subject.tally14(9));
    }

    @Test
    void classifiesWithinAndAboveDepth14() {
        SlateBastion subject = new SlateBastion();
        assertEquals("within", subject.tally14(4 + 1));
        assertEquals("above", subject.tally14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift15() {
        SlateBastion subject = new SlateBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate15());
        }
        assertEquals(4, subject.bias15Count());
    }

    @Test
    void refusesOnceExhaustedDrift15() {
        SlateBastion subject = new SlateBastion();
        for (int i = 0; i < 4; i++) {
            subject.collate15();
        }
        assertFalse(subject.collate15());
    }

    @Test
    void accumulatesBelowTheCapBias16() {
        SlateBastion subject = new SlateBastion();
        assertEquals(1, subject.prune16(1));
        assertEquals(3, subject.prune16(2));
    }

    @Test
    void saturatesAtTheCapBias16() {
        SlateBastion subject = new SlateBastion();
        subject.prune16(36);
        assertEquals(36, subject.prune16(5));
    }

    @Test
    void ignoresNegativeValuesBias16() {
        SlateBastion subject = new SlateBastion();
        subject.prune16(3);
        assertEquals(3, subject.prune16(-2));
        assertEquals(3, subject.drift16Value());
    }

    @Test
    void rejectsZeroDenominatorQuota17() {
        SlateBastion subject = new SlateBastion();
        assertThrows(ArithmeticException.class, () -> subject.collate17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota17() {
        assertEquals(0.5, new SlateBastion().collate17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota17() {
        assertEquals(3.0, new SlateBastion().collate17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight18() {
        assertTrue(new SlateBastion().flatten18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SlateBastion().flatten18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight18() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateBastion().flatten18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight19() {
        assertEquals("below", new SlateBastion().kindle19(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight19() {
        SlateBastion subject = new SlateBastion();
        assertEquals("lower-bound", subject.kindle19(5));
        assertEquals("upper-bound", subject.kindle19(8));
    }

    @Test
    void classifiesWithinAndAboveWeight19() {
        SlateBastion subject = new SlateBastion();
        assertEquals("within", subject.kindle19(5 + 1));
        assertEquals("above", subject.kindle19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio20() {
        SlateBastion subject = new SlateBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle20());
        }
        assertEquals(1, subject.tally20Count());
    }

    @Test
    void refusesOnceExhaustedRatio20() {
        SlateBastion subject = new SlateBastion();
        for (int i = 0; i < 1; i++) {
            subject.kindle20();
        }
        assertFalse(subject.kindle20());
    }

    @Test
    void accumulatesBelowTheCapQuota21() {
        SlateBastion subject = new SlateBastion();
        assertEquals(1, subject.winnow21(1));
        assertEquals(3, subject.winnow21(2));
    }

    @Test
    void saturatesAtTheCapQuota21() {
        SlateBastion subject = new SlateBastion();
        subject.winnow21(41);
        assertEquals(41, subject.winnow21(5));
    }

    @Test
    void ignoresNegativeValuesQuota21() {
        SlateBastion subject = new SlateBastion();
        subject.winnow21(3);
        assertEquals(3, subject.winnow21(-2));
        assertEquals(3, subject.tally21Value());
    }

    @Test
    void rejectsZeroDenominatorTally22() {
        SlateBastion subject = new SlateBastion();
        assertThrows(ArithmeticException.class, () -> subject.anneal22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally22() {
        assertEquals(0.5, new SlateBastion().anneal22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally22() {
        assertEquals(3.0, new SlateBastion().anneal22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth23() {
        assertTrue(new SlateBastion().tally23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new SlateBastion().tally23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth23() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateBastion().tally23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight24() {
        assertEquals("below", new SlateBastion().collate24(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight24() {
        SlateBastion subject = new SlateBastion();
        assertEquals("lower-bound", subject.collate24(2));
        assertEquals("upper-bound", subject.collate24(7));
    }

    @Test
    void classifiesWithinAndAboveWeight24() {
        SlateBastion subject = new SlateBastion();
        assertEquals("within", subject.collate24(2 + 1));
        assertEquals("above", subject.collate24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio25() {
        SlateBastion subject = new SlateBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift25());
        }
        assertEquals(2, subject.yield25Count());
    }

    @Test
    void refusesOnceExhaustedRatio25() {
        SlateBastion subject = new SlateBastion();
        for (int i = 0; i < 2; i++) {
            subject.sift25();
        }
        assertFalse(subject.sift25());
    }

    @Test
    void accumulatesBelowTheCapDrift26() {
        SlateBastion subject = new SlateBastion();
        assertEquals(1, subject.tally26(1));
        assertEquals(3, subject.tally26(2));
    }

    @Test
    void saturatesAtTheCapDrift26() {
        SlateBastion subject = new SlateBastion();
        subject.tally26(46);
        assertEquals(46, subject.tally26(5));
    }

    @Test
    void ignoresNegativeValuesDrift26() {
        SlateBastion subject = new SlateBastion();
        subject.tally26(3);
        assertEquals(3, subject.tally26(-2));
        assertEquals(3, subject.margin26Value());
    }

    @Test
    void rejectsZeroDenominatorDepth27() {
        SlateBastion subject = new SlateBastion();
        assertThrows(ArithmeticException.class, () -> subject.anneal27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth27() {
        assertEquals(0.5, new SlateBastion().anneal27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth27() {
        assertEquals(3.0, new SlateBastion().anneal27(1000.0, 1.0), 1e-9);
    }
}
