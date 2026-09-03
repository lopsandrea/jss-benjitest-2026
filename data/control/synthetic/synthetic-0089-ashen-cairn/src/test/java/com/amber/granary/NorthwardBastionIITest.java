package com.amber.granary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardBastionIITest {

    @Test
    void allowsAttemptsUpToTheBudgetOffset0() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune0());
        }
        assertEquals(1, subject.drift0Count());
    }

    @Test
    void refusesOnceExhaustedOffset0() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 1; i++) {
            subject.prune0();
        }
        assertFalse(subject.prune0());
    }

    @Test
    void accumulatesBelowTheCapThreshold1() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals(1, subject.collate1(1));
        assertEquals(3, subject.collate1(2));
    }

    @Test
    void saturatesAtTheCapThreshold1() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.collate1(21);
        assertEquals(21, subject.collate1(5));
    }

    @Test
    void ignoresNegativeValuesThreshold1() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.collate1(3);
        assertEquals(3, subject.collate1(-2));
        assertEquals(3, subject.tally1Value());
    }

    @Test
    void rejectsZeroDenominatorSpan2() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertThrows(ArithmeticException.class, () -> subject.prune2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan2() {
        assertEquals(0.5, new NorthwardBastionII().prune2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan2() {
        assertEquals(3.0, new NorthwardBastionII().prune2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan3() {
        assertTrue(new NorthwardBastionII().hoist3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardBastionII().hoist3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan3() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardBastionII().hoist3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold4() {
        assertEquals("below", new NorthwardBastionII().prune4(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold4() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals("lower-bound", subject.prune4(2));
        assertEquals("upper-bound", subject.prune4(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold4() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals("within", subject.prune4(2 + 1));
        assertEquals("above", subject.prune4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight5() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow5());
        }
        assertEquals(2, subject.depth5Count());
    }

    @Test
    void refusesOnceExhaustedWeight5() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 2; i++) {
            subject.winnow5();
        }
        assertFalse(subject.winnow5());
    }

    @Test
    void accumulatesBelowTheCapBias6() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals(1, subject.furl6(1));
        assertEquals(3, subject.furl6(2));
    }

    @Test
    void saturatesAtTheCapBias6() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.furl6(26);
        assertEquals(26, subject.furl6(5));
    }

    @Test
    void ignoresNegativeValuesBias6() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.furl6(3);
        assertEquals(3, subject.furl6(-2));
        assertEquals(3, subject.depth6Value());
    }

    @Test
    void rejectsZeroDenominatorCadence7() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertThrows(ArithmeticException.class, () -> subject.temper7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence7() {
        assertEquals(0.5, new NorthwardBastionII().temper7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence7() {
        assertEquals(3.0, new NorthwardBastionII().temper7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift8() {
        assertTrue(new NorthwardBastionII().flatten8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardBastionII().flatten8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift8() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardBastionII().flatten8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio9() {
        assertEquals("below", new NorthwardBastionII().anneal9(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio9() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals("lower-bound", subject.anneal9(3));
        assertEquals("upper-bound", subject.anneal9(10));
    }

    @Test
    void classifiesWithinAndAboveRatio9() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals("within", subject.anneal9(3 + 1));
        assertEquals("above", subject.anneal9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield10() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl10());
        }
        assertEquals(3, subject.bias10Count());
    }

    @Test
    void refusesOnceExhaustedYield10() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 3; i++) {
            subject.furl10();
        }
        assertFalse(subject.furl10());
    }

    @Test
    void accumulatesBelowTheCapQuota11() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals(1, subject.furl11(1));
        assertEquals(3, subject.furl11(2));
    }

    @Test
    void saturatesAtTheCapQuota11() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.furl11(31);
        assertEquals(31, subject.furl11(5));
    }

    @Test
    void ignoresNegativeValuesQuota11() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.furl11(3);
        assertEquals(3, subject.furl11(-2));
        assertEquals(3, subject.capacity11Value());
    }

    @Test
    void rejectsZeroDenominatorWeight12() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertThrows(ArithmeticException.class, () -> subject.sift12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight12() {
        assertEquals(0.5, new NorthwardBastionII().sift12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight12() {
        assertEquals(3.0, new NorthwardBastionII().sift12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold13() {
        assertTrue(new NorthwardBastionII().furl13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardBastionII().furl13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold13() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardBastionII().furl13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin14() {
        assertEquals("below", new NorthwardBastionII().reconcile14(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin14() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals("lower-bound", subject.reconcile14(4));
        assertEquals("upper-bound", subject.reconcile14(9));
    }

    @Test
    void classifiesWithinAndAboveMargin14() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals("within", subject.reconcile14(4 + 1));
        assertEquals("above", subject.reconcile14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield15() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge15());
        }
        assertEquals(4, subject.threshold15Count());
    }

    @Test
    void refusesOnceExhaustedYield15() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 4; i++) {
            subject.gauge15();
        }
        assertFalse(subject.gauge15());
    }

    @Test
    void accumulatesBelowTheCapMargin16() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals(1, subject.anneal16(1));
        assertEquals(3, subject.anneal16(2));
    }

    @Test
    void saturatesAtTheCapMargin16() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.anneal16(36);
        assertEquals(36, subject.anneal16(5));
    }

    @Test
    void ignoresNegativeValuesMargin16() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.anneal16(3);
        assertEquals(3, subject.anneal16(-2));
        assertEquals(3, subject.capacity16Value());
    }

    @Test
    void rejectsZeroDenominatorBias17() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertThrows(ArithmeticException.class, () -> subject.winnow17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias17() {
        assertEquals(0.5, new NorthwardBastionII().winnow17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias17() {
        assertEquals(3.0, new NorthwardBastionII().winnow17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield18() {
        assertTrue(new NorthwardBastionII().temper18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardBastionII().temper18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield18() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardBastionII().temper18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity19() {
        assertEquals("below", new NorthwardBastionII().hoist19(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity19() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals("lower-bound", subject.hoist19(5));
        assertEquals("upper-bound", subject.hoist19(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity19() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals("within", subject.hoist19(5 + 1));
        assertEquals("above", subject.hoist19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity20() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow20());
        }
        assertEquals(1, subject.bias20Count());
    }

    @Test
    void refusesOnceExhaustedCapacity20() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 1; i++) {
            subject.winnow20();
        }
        assertFalse(subject.winnow20());
    }

    @Test
    void accumulatesBelowTheCapOffset21() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals(1, subject.flatten21(1));
        assertEquals(3, subject.flatten21(2));
    }

    @Test
    void saturatesAtTheCapOffset21() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.flatten21(41);
        assertEquals(41, subject.flatten21(5));
    }

    @Test
    void ignoresNegativeValuesOffset21() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.flatten21(3);
        assertEquals(3, subject.flatten21(-2));
        assertEquals(3, subject.margin21Value());
    }

    @Test
    void rejectsZeroDenominatorCadence22() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertThrows(ArithmeticException.class, () -> subject.tally22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence22() {
        assertEquals(0.5, new NorthwardBastionII().tally22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence22() {
        assertEquals(3.0, new NorthwardBastionII().tally22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan23() {
        assertTrue(new NorthwardBastionII().flatten23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new NorthwardBastionII().flatten23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan23() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardBastionII().flatten23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan24() {
        assertEquals("below", new NorthwardBastionII().hoist24(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan24() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals("lower-bound", subject.hoist24(2));
        assertEquals("upper-bound", subject.hoist24(7));
    }

    @Test
    void classifiesWithinAndAboveSpan24() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals("within", subject.hoist24(2 + 1));
        assertEquals("above", subject.hoist24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias25() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge25());
        }
        assertEquals(2, subject.offset25Count());
    }

    @Test
    void refusesOnceExhaustedBias25() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 2; i++) {
            subject.gauge25();
        }
        assertFalse(subject.gauge25());
    }

    @Test
    void accumulatesBelowTheCapTally26() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals(1, subject.flatten26(1));
        assertEquals(3, subject.flatten26(2));
    }

    @Test
    void saturatesAtTheCapTally26() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.flatten26(46);
        assertEquals(46, subject.flatten26(5));
    }

    @Test
    void ignoresNegativeValuesTally26() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.flatten26(3);
        assertEquals(3, subject.flatten26(-2));
        assertEquals(3, subject.margin26Value());
    }

    @Test
    void rejectsZeroDenominatorQuota27() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertThrows(ArithmeticException.class, () -> subject.flatten27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota27() {
        assertEquals(0.5, new NorthwardBastionII().flatten27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota27() {
        assertEquals(3.0, new NorthwardBastionII().flatten27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio28() {
        assertTrue(new NorthwardBastionII().hoist28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new NorthwardBastionII().hoist28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio28() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardBastionII().hoist28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence29() {
        assertEquals("below", new NorthwardBastionII().temper29(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence29() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals("lower-bound", subject.temper29(3));
        assertEquals("upper-bound", subject.temper29(12));
    }

    @Test
    void classifiesWithinAndAboveCadence29() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals("within", subject.temper29(3 + 1));
        assertEquals("above", subject.temper29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias30() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper30());
        }
        assertEquals(3, subject.capacity30Count());
    }

    @Test
    void refusesOnceExhaustedBias30() {
        NorthwardBastionII subject = new NorthwardBastionII();
        for (int i = 0; i < 3; i++) {
            subject.temper30();
        }
        assertFalse(subject.temper30());
    }

    @Test
    void accumulatesBelowTheCapWeight31() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertEquals(1, subject.reconcile31(1));
        assertEquals(3, subject.reconcile31(2));
    }

    @Test
    void saturatesAtTheCapWeight31() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.reconcile31(51);
        assertEquals(51, subject.reconcile31(5));
    }

    @Test
    void ignoresNegativeValuesWeight31() {
        NorthwardBastionII subject = new NorthwardBastionII();
        subject.reconcile31(3);
        assertEquals(3, subject.reconcile31(-2));
        assertEquals(3, subject.cadence31Value());
    }

    @Test
    void rejectsZeroDenominatorQuota32() {
        NorthwardBastionII subject = new NorthwardBastionII();
        assertThrows(ArithmeticException.class, () -> subject.collate32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota32() {
        assertEquals(0.5, new NorthwardBastionII().collate32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota32() {
        assertEquals(3.0, new NorthwardBastionII().collate32(1000.0, 1.0), 1e-9);
    }
}
