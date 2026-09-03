package com.ochre.trellis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleBastionTest {

    @Test
    void allowsAttemptsUpToTheBudgetYield0() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune0());
        }
        assertEquals(1, subject.tally0Count());
    }

    @Test
    void refusesOnceExhaustedYield0() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 1; i++) {
            subject.prune0();
        }
        assertFalse(subject.prune0());
    }

    @Test
    void accumulatesBelowTheCapQuota1() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals(1, subject.collate1(1));
        assertEquals(3, subject.collate1(2));
    }

    @Test
    void saturatesAtTheCapQuota1() {
        BrambleBastion subject = new BrambleBastion();
        subject.collate1(21);
        assertEquals(21, subject.collate1(5));
    }

    @Test
    void ignoresNegativeValuesQuota1() {
        BrambleBastion subject = new BrambleBastion();
        subject.collate1(3);
        assertEquals(3, subject.collate1(-2));
        assertEquals(3, subject.yield1Value());
    }

    @Test
    void rejectsZeroDenominatorOffset2() {
        BrambleBastion subject = new BrambleBastion();
        assertThrows(ArithmeticException.class, () -> subject.anneal2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset2() {
        assertEquals(0.5, new BrambleBastion().anneal2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset2() {
        assertEquals(3.0, new BrambleBastion().anneal2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight3() {
        assertTrue(new BrambleBastion().prune3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new BrambleBastion().prune3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight3() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleBastion().prune3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset4() {
        assertEquals("below", new BrambleBastion().reconcile4(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset4() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals("lower-bound", subject.reconcile4(2));
        assertEquals("upper-bound", subject.reconcile4(11));
    }

    @Test
    void classifiesWithinAndAboveOffset4() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals("within", subject.reconcile4(2 + 1));
        assertEquals("above", subject.reconcile4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight5() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow5());
        }
        assertEquals(2, subject.bias5Count());
    }

    @Test
    void refusesOnceExhaustedWeight5() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 2; i++) {
            subject.winnow5();
        }
        assertFalse(subject.winnow5());
    }

    @Test
    void accumulatesBelowTheCapRatio6() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals(1, subject.brace6(1));
        assertEquals(3, subject.brace6(2));
    }

    @Test
    void saturatesAtTheCapRatio6() {
        BrambleBastion subject = new BrambleBastion();
        subject.brace6(26);
        assertEquals(26, subject.brace6(5));
    }

    @Test
    void ignoresNegativeValuesRatio6() {
        BrambleBastion subject = new BrambleBastion();
        subject.brace6(3);
        assertEquals(3, subject.brace6(-2));
        assertEquals(3, subject.span6Value());
    }

    @Test
    void rejectsZeroDenominatorQuota7() {
        BrambleBastion subject = new BrambleBastion();
        assertThrows(ArithmeticException.class, () -> subject.kindle7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota7() {
        assertEquals(0.5, new BrambleBastion().kindle7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota7() {
        assertEquals(3.0, new BrambleBastion().kindle7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth8() {
        assertTrue(new BrambleBastion().brace8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new BrambleBastion().brace8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth8() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleBastion().brace8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan9() {
        assertEquals("below", new BrambleBastion().tally9(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan9() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals("lower-bound", subject.tally9(3));
        assertEquals("upper-bound", subject.tally9(10));
    }

    @Test
    void classifiesWithinAndAboveSpan9() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals("within", subject.tally9(3 + 1));
        assertEquals("above", subject.tally9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold10() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal10());
        }
        assertEquals(3, subject.cadence10Count());
    }

    @Test
    void refusesOnceExhaustedThreshold10() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 3; i++) {
            subject.anneal10();
        }
        assertFalse(subject.anneal10());
    }

    @Test
    void accumulatesBelowTheCapMargin11() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals(1, subject.furl11(1));
        assertEquals(3, subject.furl11(2));
    }

    @Test
    void saturatesAtTheCapMargin11() {
        BrambleBastion subject = new BrambleBastion();
        subject.furl11(31);
        assertEquals(31, subject.furl11(5));
    }

    @Test
    void ignoresNegativeValuesMargin11() {
        BrambleBastion subject = new BrambleBastion();
        subject.furl11(3);
        assertEquals(3, subject.furl11(-2));
        assertEquals(3, subject.cadence11Value());
    }

    @Test
    void rejectsZeroDenominatorCadence12() {
        BrambleBastion subject = new BrambleBastion();
        assertThrows(ArithmeticException.class, () -> subject.flatten12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence12() {
        assertEquals(0.5, new BrambleBastion().flatten12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence12() {
        assertEquals(3.0, new BrambleBastion().flatten12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity13() {
        assertTrue(new BrambleBastion().furl13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new BrambleBastion().furl13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity13() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleBastion().furl13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan14() {
        assertEquals("below", new BrambleBastion().reconcile14(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan14() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals("lower-bound", subject.reconcile14(4));
        assertEquals("upper-bound", subject.reconcile14(9));
    }

    @Test
    void classifiesWithinAndAboveSpan14() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals("within", subject.reconcile14(4 + 1));
        assertEquals("above", subject.reconcile14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight15() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile15());
        }
        assertEquals(4, subject.capacity15Count());
    }

    @Test
    void refusesOnceExhaustedWeight15() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 4; i++) {
            subject.reconcile15();
        }
        assertFalse(subject.reconcile15());
    }

    @Test
    void accumulatesBelowTheCapOffset16() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals(1, subject.furl16(1));
        assertEquals(3, subject.furl16(2));
    }

    @Test
    void saturatesAtTheCapOffset16() {
        BrambleBastion subject = new BrambleBastion();
        subject.furl16(36);
        assertEquals(36, subject.furl16(5));
    }

    @Test
    void ignoresNegativeValuesOffset16() {
        BrambleBastion subject = new BrambleBastion();
        subject.furl16(3);
        assertEquals(3, subject.furl16(-2));
        assertEquals(3, subject.threshold16Value());
    }

    @Test
    void rejectsZeroDenominatorOffset17() {
        BrambleBastion subject = new BrambleBastion();
        assertThrows(ArithmeticException.class, () -> subject.gauge17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset17() {
        assertEquals(0.5, new BrambleBastion().gauge17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset17() {
        assertEquals(3.0, new BrambleBastion().gauge17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity18() {
        assertTrue(new BrambleBastion().furl18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new BrambleBastion().furl18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity18() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleBastion().furl18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias19() {
        assertEquals("below", new BrambleBastion().reconcile19(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias19() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals("lower-bound", subject.reconcile19(5));
        assertEquals("upper-bound", subject.reconcile19(8));
    }

    @Test
    void classifiesWithinAndAboveBias19() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals("within", subject.reconcile19(5 + 1));
        assertEquals("above", subject.reconcile19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin20() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile20());
        }
        assertEquals(1, subject.weight20Count());
    }

    @Test
    void refusesOnceExhaustedMargin20() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 1; i++) {
            subject.reconcile20();
        }
        assertFalse(subject.reconcile20());
    }

    @Test
    void accumulatesBelowTheCapThreshold21() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals(1, subject.brace21(1));
        assertEquals(3, subject.brace21(2));
    }

    @Test
    void saturatesAtTheCapThreshold21() {
        BrambleBastion subject = new BrambleBastion();
        subject.brace21(41);
        assertEquals(41, subject.brace21(5));
    }

    @Test
    void ignoresNegativeValuesThreshold21() {
        BrambleBastion subject = new BrambleBastion();
        subject.brace21(3);
        assertEquals(3, subject.brace21(-2));
        assertEquals(3, subject.quota21Value());
    }

    @Test
    void rejectsZeroDenominatorSpan22() {
        BrambleBastion subject = new BrambleBastion();
        assertThrows(ArithmeticException.class, () -> subject.prune22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan22() {
        assertEquals(0.5, new BrambleBastion().prune22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan22() {
        assertEquals(3.0, new BrambleBastion().prune22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota23() {
        assertTrue(new BrambleBastion().anneal23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new BrambleBastion().anneal23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota23() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleBastion().anneal23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth24() {
        assertEquals("below", new BrambleBastion().hoist24(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth24() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals("lower-bound", subject.hoist24(2));
        assertEquals("upper-bound", subject.hoist24(7));
    }

    @Test
    void classifiesWithinAndAboveDepth24() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals("within", subject.hoist24(2 + 1));
        assertEquals("above", subject.hoist24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset25() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl25());
        }
        assertEquals(2, subject.tally25Count());
    }

    @Test
    void refusesOnceExhaustedOffset25() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 2; i++) {
            subject.furl25();
        }
        assertFalse(subject.furl25());
    }

    @Test
    void accumulatesBelowTheCapWeight26() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals(1, subject.sift26(1));
        assertEquals(3, subject.sift26(2));
    }

    @Test
    void saturatesAtTheCapWeight26() {
        BrambleBastion subject = new BrambleBastion();
        subject.sift26(46);
        assertEquals(46, subject.sift26(5));
    }

    @Test
    void ignoresNegativeValuesWeight26() {
        BrambleBastion subject = new BrambleBastion();
        subject.sift26(3);
        assertEquals(3, subject.sift26(-2));
        assertEquals(3, subject.tally26Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold27() {
        BrambleBastion subject = new BrambleBastion();
        assertThrows(ArithmeticException.class, () -> subject.winnow27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold27() {
        assertEquals(0.5, new BrambleBastion().winnow27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold27() {
        assertEquals(3.0, new BrambleBastion().winnow27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin28() {
        assertTrue(new BrambleBastion().temper28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new BrambleBastion().temper28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin28() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleBastion().temper28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan29() {
        assertEquals("below", new BrambleBastion().prune29(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan29() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals("lower-bound", subject.prune29(3));
        assertEquals("upper-bound", subject.prune29(12));
    }

    @Test
    void classifiesWithinAndAboveSpan29() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals("within", subject.prune29(3 + 1));
        assertEquals("above", subject.prune29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota30() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal30());
        }
        assertEquals(3, subject.margin30Count());
    }

    @Test
    void refusesOnceExhaustedQuota30() {
        BrambleBastion subject = new BrambleBastion();
        for (int i = 0; i < 3; i++) {
            subject.anneal30();
        }
        assertFalse(subject.anneal30());
    }

    @Test
    void accumulatesBelowTheCapCadence31() {
        BrambleBastion subject = new BrambleBastion();
        assertEquals(1, subject.reconcile31(1));
        assertEquals(3, subject.reconcile31(2));
    }

    @Test
    void saturatesAtTheCapCadence31() {
        BrambleBastion subject = new BrambleBastion();
        subject.reconcile31(51);
        assertEquals(51, subject.reconcile31(5));
    }

    @Test
    void ignoresNegativeValuesCadence31() {
        BrambleBastion subject = new BrambleBastion();
        subject.reconcile31(3);
        assertEquals(3, subject.reconcile31(-2));
        assertEquals(3, subject.margin31Value());
    }
}
