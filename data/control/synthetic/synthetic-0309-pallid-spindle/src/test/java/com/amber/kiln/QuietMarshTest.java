package com.amber.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietMarshTest {

    @Test
    void allowsAttemptsUpToTheBudgetYield0() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten0());
        }
        assertEquals(1, subject.offset0Count());
    }

    @Test
    void refusesOnceExhaustedYield0() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 1; i++) {
            subject.flatten0();
        }
        assertFalse(subject.flatten0());
    }

    @Test
    void accumulatesBelowTheCapDrift1() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.sift1(1));
        assertEquals(3, subject.sift1(2));
    }

    @Test
    void saturatesAtTheCapDrift1() {
        QuietMarsh subject = new QuietMarsh();
        subject.sift1(21);
        assertEquals(21, subject.sift1(5));
    }

    @Test
    void ignoresNegativeValuesDrift1() {
        QuietMarsh subject = new QuietMarsh();
        subject.sift1(3);
        assertEquals(3, subject.sift1(-2));
        assertEquals(3, subject.capacity1Value());
    }

    @Test
    void rejectsZeroDenominatorTally2() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.collate2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally2() {
        assertEquals(0.5, new QuietMarsh().collate2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally2() {
        assertEquals(3.0, new QuietMarsh().collate2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield3() {
        assertTrue(new QuietMarsh().prune3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new QuietMarsh().prune3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield3() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietMarsh().prune3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio4() {
        assertEquals("below", new QuietMarsh().flatten4(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio4() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.flatten4(2));
        assertEquals("upper-bound", subject.flatten4(11));
    }

    @Test
    void classifiesWithinAndAboveRatio4() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.flatten4(2 + 1));
        assertEquals("above", subject.flatten4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota5() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle5());
        }
        assertEquals(2, subject.tally5Count());
    }

    @Test
    void refusesOnceExhaustedQuota5() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 2; i++) {
            subject.kindle5();
        }
        assertFalse(subject.kindle5());
    }

    @Test
    void accumulatesBelowTheCapRatio6() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.gauge6(1));
        assertEquals(3, subject.gauge6(2));
    }

    @Test
    void saturatesAtTheCapRatio6() {
        QuietMarsh subject = new QuietMarsh();
        subject.gauge6(26);
        assertEquals(26, subject.gauge6(5));
    }

    @Test
    void ignoresNegativeValuesRatio6() {
        QuietMarsh subject = new QuietMarsh();
        subject.gauge6(3);
        assertEquals(3, subject.gauge6(-2));
        assertEquals(3, subject.depth6Value());
    }

    @Test
    void rejectsZeroDenominatorRatio7() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.brace7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio7() {
        assertEquals(0.5, new QuietMarsh().brace7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio7() {
        assertEquals(3.0, new QuietMarsh().brace7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin8() {
        assertTrue(new QuietMarsh().collate8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new QuietMarsh().collate8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin8() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietMarsh().collate8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin9() {
        assertEquals("below", new QuietMarsh().temper9(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin9() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.temper9(3));
        assertEquals("upper-bound", subject.temper9(10));
    }

    @Test
    void classifiesWithinAndAboveMargin9() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.temper9(3 + 1));
        assertEquals("above", subject.temper9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth10() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle10());
        }
        assertEquals(3, subject.bias10Count());
    }

    @Test
    void refusesOnceExhaustedDepth10() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 3; i++) {
            subject.kindle10();
        }
        assertFalse(subject.kindle10());
    }

    @Test
    void accumulatesBelowTheCapQuota11() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.anneal11(1));
        assertEquals(3, subject.anneal11(2));
    }

    @Test
    void saturatesAtTheCapQuota11() {
        QuietMarsh subject = new QuietMarsh();
        subject.anneal11(31);
        assertEquals(31, subject.anneal11(5));
    }

    @Test
    void ignoresNegativeValuesQuota11() {
        QuietMarsh subject = new QuietMarsh();
        subject.anneal11(3);
        assertEquals(3, subject.anneal11(-2));
        assertEquals(3, subject.cadence11Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold12() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.hoist12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold12() {
        assertEquals(0.5, new QuietMarsh().hoist12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold12() {
        assertEquals(3.0, new QuietMarsh().hoist12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota13() {
        assertTrue(new QuietMarsh().brace13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new QuietMarsh().brace13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota13() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietMarsh().brace13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally14() {
        assertEquals("below", new QuietMarsh().hoist14(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally14() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.hoist14(4));
        assertEquals("upper-bound", subject.hoist14(9));
    }

    @Test
    void classifiesWithinAndAboveTally14() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.hoist14(4 + 1));
        assertEquals("above", subject.hoist14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota15() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile15());
        }
        assertEquals(4, subject.span15Count());
    }

    @Test
    void refusesOnceExhaustedQuota15() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 4; i++) {
            subject.reconcile15();
        }
        assertFalse(subject.reconcile15());
    }

    @Test
    void accumulatesBelowTheCapQuota16() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.kindle16(1));
        assertEquals(3, subject.kindle16(2));
    }

    @Test
    void saturatesAtTheCapQuota16() {
        QuietMarsh subject = new QuietMarsh();
        subject.kindle16(36);
        assertEquals(36, subject.kindle16(5));
    }

    @Test
    void ignoresNegativeValuesQuota16() {
        QuietMarsh subject = new QuietMarsh();
        subject.kindle16(3);
        assertEquals(3, subject.kindle16(-2));
        assertEquals(3, subject.threshold16Value());
    }

    @Test
    void rejectsZeroDenominatorCadence17() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.brace17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence17() {
        assertEquals(0.5, new QuietMarsh().brace17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence17() {
        assertEquals(3.0, new QuietMarsh().brace17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight18() {
        assertTrue(new QuietMarsh().sift18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new QuietMarsh().sift18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight18() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietMarsh().sift18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity19() {
        assertEquals("below", new QuietMarsh().kindle19(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity19() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.kindle19(5));
        assertEquals("upper-bound", subject.kindle19(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity19() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.kindle19(5 + 1));
        assertEquals("above", subject.kindle19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield20() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle20());
        }
        assertEquals(1, subject.tally20Count());
    }

    @Test
    void refusesOnceExhaustedYield20() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 1; i++) {
            subject.kindle20();
        }
        assertFalse(subject.kindle20());
    }

    @Test
    void accumulatesBelowTheCapDrift21() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.hoist21(1));
        assertEquals(3, subject.hoist21(2));
    }

    @Test
    void saturatesAtTheCapDrift21() {
        QuietMarsh subject = new QuietMarsh();
        subject.hoist21(41);
        assertEquals(41, subject.hoist21(5));
    }

    @Test
    void ignoresNegativeValuesDrift21() {
        QuietMarsh subject = new QuietMarsh();
        subject.hoist21(3);
        assertEquals(3, subject.hoist21(-2));
        assertEquals(3, subject.margin21Value());
    }

    @Test
    void rejectsZeroDenominatorWeight22() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.brace22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight22() {
        assertEquals(0.5, new QuietMarsh().brace22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight22() {
        assertEquals(3.0, new QuietMarsh().brace22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence23() {
        assertTrue(new QuietMarsh().furl23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new QuietMarsh().furl23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence23() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietMarsh().furl23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio24() {
        assertEquals("below", new QuietMarsh().gauge24(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio24() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.gauge24(2));
        assertEquals("upper-bound", subject.gauge24(7));
    }

    @Test
    void classifiesWithinAndAboveRatio24() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.gauge24(2 + 1));
        assertEquals("above", subject.gauge24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias25() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten25());
        }
        assertEquals(2, subject.ratio25Count());
    }

    @Test
    void refusesOnceExhaustedBias25() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 2; i++) {
            subject.flatten25();
        }
        assertFalse(subject.flatten25());
    }

    @Test
    void accumulatesBelowTheCapThreshold26() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.gauge26(1));
        assertEquals(3, subject.gauge26(2));
    }

    @Test
    void saturatesAtTheCapThreshold26() {
        QuietMarsh subject = new QuietMarsh();
        subject.gauge26(46);
        assertEquals(46, subject.gauge26(5));
    }

    @Test
    void ignoresNegativeValuesThreshold26() {
        QuietMarsh subject = new QuietMarsh();
        subject.gauge26(3);
        assertEquals(3, subject.gauge26(-2));
        assertEquals(3, subject.margin26Value());
    }

    @Test
    void rejectsZeroDenominatorCadence27() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.kindle27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence27() {
        assertEquals(0.5, new QuietMarsh().kindle27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence27() {
        assertEquals(3.0, new QuietMarsh().kindle27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin28() {
        assertTrue(new QuietMarsh().prune28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new QuietMarsh().prune28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin28() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietMarsh().prune28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth29() {
        assertEquals("below", new QuietMarsh().sift29(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth29() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.sift29(3));
        assertEquals("upper-bound", subject.sift29(12));
    }

    @Test
    void classifiesWithinAndAboveDepth29() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.sift29(3 + 1));
        assertEquals("above", subject.sift29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan30() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune30());
        }
        assertEquals(3, subject.ratio30Count());
    }

    @Test
    void refusesOnceExhaustedSpan30() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 3; i++) {
            subject.prune30();
        }
        assertFalse(subject.prune30());
    }

    @Test
    void accumulatesBelowTheCapDrift31() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.gauge31(1));
        assertEquals(3, subject.gauge31(2));
    }

    @Test
    void saturatesAtTheCapDrift31() {
        QuietMarsh subject = new QuietMarsh();
        subject.gauge31(51);
        assertEquals(51, subject.gauge31(5));
    }

    @Test
    void ignoresNegativeValuesDrift31() {
        QuietMarsh subject = new QuietMarsh();
        subject.gauge31(3);
        assertEquals(3, subject.gauge31(-2));
        assertEquals(3, subject.margin31Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold32() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.reconcile32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold32() {
        assertEquals(0.5, new QuietMarsh().reconcile32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold32() {
        assertEquals(3.0, new QuietMarsh().reconcile32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth33() {
        assertTrue(new QuietMarsh().reconcile33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new QuietMarsh().reconcile33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth33() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietMarsh().reconcile33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias34() {
        assertEquals("below", new QuietMarsh().sift34(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias34() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.sift34(4));
        assertEquals("upper-bound", subject.sift34(11));
    }

    @Test
    void classifiesWithinAndAboveBias34() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.sift34(4 + 1));
        assertEquals("above", subject.sift34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth35() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune35());
        }
        assertEquals(4, subject.yield35Count());
    }

    @Test
    void refusesOnceExhaustedDepth35() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 4; i++) {
            subject.prune35();
        }
        assertFalse(subject.prune35());
    }

    @Test
    void accumulatesBelowTheCapQuota36() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.reconcile36(1));
        assertEquals(3, subject.reconcile36(2));
    }

    @Test
    void saturatesAtTheCapQuota36() {
        QuietMarsh subject = new QuietMarsh();
        subject.reconcile36(56);
        assertEquals(56, subject.reconcile36(5));
    }

    @Test
    void ignoresNegativeValuesQuota36() {
        QuietMarsh subject = new QuietMarsh();
        subject.reconcile36(3);
        assertEquals(3, subject.reconcile36(-2));
        assertEquals(3, subject.tally36Value());
    }

    @Test
    void rejectsZeroDenominatorDrift37() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.anneal37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift37() {
        assertEquals(0.5, new QuietMarsh().anneal37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift37() {
        assertEquals(3.0, new QuietMarsh().anneal37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift38() {
        assertTrue(new QuietMarsh().gauge38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new QuietMarsh().gauge38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift38() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietMarsh().gauge38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight39() {
        assertEquals("below", new QuietMarsh().collate39(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight39() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.collate39(5));
        assertEquals("upper-bound", subject.collate39(10));
    }

    @Test
    void classifiesWithinAndAboveWeight39() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.collate39(5 + 1));
        assertEquals("above", subject.collate39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold40() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle40());
        }
        assertEquals(1, subject.ratio40Count());
    }

    @Test
    void refusesOnceExhaustedThreshold40() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 1; i++) {
            subject.kindle40();
        }
        assertFalse(subject.kindle40());
    }

    @Test
    void accumulatesBelowTheCapRatio41() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.prune41(1));
        assertEquals(3, subject.prune41(2));
    }

    @Test
    void saturatesAtTheCapRatio41() {
        QuietMarsh subject = new QuietMarsh();
        subject.prune41(21);
        assertEquals(21, subject.prune41(5));
    }

    @Test
    void ignoresNegativeValuesRatio41() {
        QuietMarsh subject = new QuietMarsh();
        subject.prune41(3);
        assertEquals(3, subject.prune41(-2));
        assertEquals(3, subject.depth41Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold42() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.collate42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold42() {
        assertEquals(0.5, new QuietMarsh().collate42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold42() {
        assertEquals(3.0, new QuietMarsh().collate42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity43() {
        assertTrue(new QuietMarsh().sift43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new QuietMarsh().sift43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity43() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietMarsh().sift43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold44() {
        assertEquals("below", new QuietMarsh().collate44(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold44() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.collate44(2));
        assertEquals("upper-bound", subject.collate44(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold44() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.collate44(2 + 1));
        assertEquals("above", subject.collate44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield45() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper45());
        }
        assertEquals(2, subject.threshold45Count());
    }

    @Test
    void refusesOnceExhaustedYield45() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 2; i++) {
            subject.temper45();
        }
        assertFalse(subject.temper45());
    }

    @Test
    void accumulatesBelowTheCapThreshold46() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.reconcile46(1));
        assertEquals(3, subject.reconcile46(2));
    }

    @Test
    void saturatesAtTheCapThreshold46() {
        QuietMarsh subject = new QuietMarsh();
        subject.reconcile46(26);
        assertEquals(26, subject.reconcile46(5));
    }

    @Test
    void ignoresNegativeValuesThreshold46() {
        QuietMarsh subject = new QuietMarsh();
        subject.reconcile46(3);
        assertEquals(3, subject.reconcile46(-2));
        assertEquals(3, subject.span46Value());
    }

    @Test
    void rejectsZeroDenominatorRatio47() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.flatten47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio47() {
        assertEquals(0.5, new QuietMarsh().flatten47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio47() {
        assertEquals(3.0, new QuietMarsh().flatten47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity48() {
        assertTrue(new QuietMarsh().kindle48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new QuietMarsh().kindle48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity48() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietMarsh().kindle48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight49() {
        assertEquals("below", new QuietMarsh().gauge49(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight49() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.gauge49(3));
        assertEquals("upper-bound", subject.gauge49(8));
    }

    @Test
    void classifiesWithinAndAboveWeight49() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.gauge49(3 + 1));
        assertEquals("above", subject.gauge49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold50() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune50());
        }
        assertEquals(3, subject.capacity50Count());
    }

    @Test
    void refusesOnceExhaustedThreshold50() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 3; i++) {
            subject.prune50();
        }
        assertFalse(subject.prune50());
    }

    @Test
    void accumulatesBelowTheCapOffset51() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.temper51(1));
        assertEquals(3, subject.temper51(2));
    }

    @Test
    void saturatesAtTheCapOffset51() {
        QuietMarsh subject = new QuietMarsh();
        subject.temper51(31);
        assertEquals(31, subject.temper51(5));
    }

    @Test
    void ignoresNegativeValuesOffset51() {
        QuietMarsh subject = new QuietMarsh();
        subject.temper51(3);
        assertEquals(3, subject.temper51(-2));
        assertEquals(3, subject.yield51Value());
    }

    @Test
    void rejectsZeroDenominatorWeight52() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.furl52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight52() {
        assertEquals(0.5, new QuietMarsh().furl52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight52() {
        assertEquals(3.0, new QuietMarsh().furl52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin53() {
        assertTrue(new QuietMarsh().anneal53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new QuietMarsh().anneal53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin53() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietMarsh().anneal53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio54() {
        assertEquals("below", new QuietMarsh().reconcile54(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio54() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.reconcile54(4));
        assertEquals("upper-bound", subject.reconcile54(7));
    }

    @Test
    void classifiesWithinAndAboveRatio54() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.reconcile54(4 + 1));
        assertEquals("above", subject.reconcile54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity55() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten55());
        }
        assertEquals(4, subject.threshold55Count());
    }

    @Test
    void refusesOnceExhaustedCapacity55() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 4; i++) {
            subject.flatten55();
        }
        assertFalse(subject.flatten55());
    }

    @Test
    void accumulatesBelowTheCapWeight56() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.temper56(1));
        assertEquals(3, subject.temper56(2));
    }

    @Test
    void saturatesAtTheCapWeight56() {
        QuietMarsh subject = new QuietMarsh();
        subject.temper56(36);
        assertEquals(36, subject.temper56(5));
    }

    @Test
    void ignoresNegativeValuesWeight56() {
        QuietMarsh subject = new QuietMarsh();
        subject.temper56(3);
        assertEquals(3, subject.temper56(-2));
        assertEquals(3, subject.depth56Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold57() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.tally57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold57() {
        assertEquals(0.5, new QuietMarsh().tally57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold57() {
        assertEquals(3.0, new QuietMarsh().tally57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight58() {
        assertTrue(new QuietMarsh().brace58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new QuietMarsh().brace58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight58() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietMarsh().brace58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin59() {
        assertEquals("below", new QuietMarsh().temper59(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin59() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.temper59(5));
        assertEquals("upper-bound", subject.temper59(12));
    }

    @Test
    void classifiesWithinAndAboveMargin59() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.temper59(5 + 1));
        assertEquals("above", subject.temper59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan60() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist60());
        }
        assertEquals(1, subject.tally60Count());
    }

    @Test
    void refusesOnceExhaustedSpan60() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 1; i++) {
            subject.hoist60();
        }
        assertFalse(subject.hoist60());
    }

    @Test
    void accumulatesBelowTheCapSpan61() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.reconcile61(1));
        assertEquals(3, subject.reconcile61(2));
    }

    @Test
    void saturatesAtTheCapSpan61() {
        QuietMarsh subject = new QuietMarsh();
        subject.reconcile61(41);
        assertEquals(41, subject.reconcile61(5));
    }

    @Test
    void ignoresNegativeValuesSpan61() {
        QuietMarsh subject = new QuietMarsh();
        subject.reconcile61(3);
        assertEquals(3, subject.reconcile61(-2));
        assertEquals(3, subject.offset61Value());
    }

    @Test
    void rejectsZeroDenominatorTally62() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.hoist62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally62() {
        assertEquals(0.5, new QuietMarsh().hoist62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally62() {
        assertEquals(3.0, new QuietMarsh().hoist62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota63() {
        assertTrue(new QuietMarsh().gauge63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new QuietMarsh().gauge63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota63() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietMarsh().gauge63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias64() {
        assertEquals("below", new QuietMarsh().furl64(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias64() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.furl64(2));
        assertEquals("upper-bound", subject.furl64(11));
    }

    @Test
    void classifiesWithinAndAboveBias64() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.furl64(2 + 1));
        assertEquals("above", subject.furl64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota65() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate65());
        }
        assertEquals(2, subject.ratio65Count());
    }

    @Test
    void refusesOnceExhaustedQuota65() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 2; i++) {
            subject.collate65();
        }
        assertFalse(subject.collate65());
    }

    @Test
    void accumulatesBelowTheCapCapacity66() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.sift66(1));
        assertEquals(3, subject.sift66(2));
    }

    @Test
    void saturatesAtTheCapCapacity66() {
        QuietMarsh subject = new QuietMarsh();
        subject.sift66(46);
        assertEquals(46, subject.sift66(5));
    }

    @Test
    void ignoresNegativeValuesCapacity66() {
        QuietMarsh subject = new QuietMarsh();
        subject.sift66(3);
        assertEquals(3, subject.sift66(-2));
        assertEquals(3, subject.threshold66Value());
    }

    @Test
    void rejectsZeroDenominatorDrift67() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.anneal67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift67() {
        assertEquals(0.5, new QuietMarsh().anneal67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift67() {
        assertEquals(3.0, new QuietMarsh().anneal67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield68() {
        assertTrue(new QuietMarsh().sift68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new QuietMarsh().sift68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield68() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietMarsh().sift68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield69() {
        assertEquals("below", new QuietMarsh().gauge69(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield69() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.gauge69(3));
        assertEquals("upper-bound", subject.gauge69(10));
    }

    @Test
    void classifiesWithinAndAboveYield69() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.gauge69(3 + 1));
        assertEquals("above", subject.gauge69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin70() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate70());
        }
        assertEquals(3, subject.capacity70Count());
    }

    @Test
    void refusesOnceExhaustedMargin70() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 3; i++) {
            subject.collate70();
        }
        assertFalse(subject.collate70());
    }

    @Test
    void accumulatesBelowTheCapDepth71() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.flatten71(1));
        assertEquals(3, subject.flatten71(2));
    }

    @Test
    void saturatesAtTheCapDepth71() {
        QuietMarsh subject = new QuietMarsh();
        subject.flatten71(51);
        assertEquals(51, subject.flatten71(5));
    }

    @Test
    void ignoresNegativeValuesDepth71() {
        QuietMarsh subject = new QuietMarsh();
        subject.flatten71(3);
        assertEquals(3, subject.flatten71(-2));
        assertEquals(3, subject.yield71Value());
    }

    @Test
    void rejectsZeroDenominatorWeight72() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.kindle72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight72() {
        assertEquals(0.5, new QuietMarsh().kindle72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight72() {
        assertEquals(3.0, new QuietMarsh().kindle72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan73() {
        assertTrue(new QuietMarsh().prune73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new QuietMarsh().prune73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan73() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietMarsh().prune73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold74() {
        assertEquals("below", new QuietMarsh().reconcile74(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold74() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.reconcile74(4));
        assertEquals("upper-bound", subject.reconcile74(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold74() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.reconcile74(4 + 1));
        assertEquals("above", subject.reconcile74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally75() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow75());
        }
        assertEquals(4, subject.ratio75Count());
    }

    @Test
    void refusesOnceExhaustedTally75() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 4; i++) {
            subject.winnow75();
        }
        assertFalse(subject.winnow75());
    }

    @Test
    void accumulatesBelowTheCapSpan76() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.gauge76(1));
        assertEquals(3, subject.gauge76(2));
    }

    @Test
    void saturatesAtTheCapSpan76() {
        QuietMarsh subject = new QuietMarsh();
        subject.gauge76(56);
        assertEquals(56, subject.gauge76(5));
    }

    @Test
    void ignoresNegativeValuesSpan76() {
        QuietMarsh subject = new QuietMarsh();
        subject.gauge76(3);
        assertEquals(3, subject.gauge76(-2));
        assertEquals(3, subject.ratio76Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity77() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.collate77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity77() {
        assertEquals(0.5, new QuietMarsh().collate77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity77() {
        assertEquals(3.0, new QuietMarsh().collate77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield78() {
        assertTrue(new QuietMarsh().tally78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new QuietMarsh().tally78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield78() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietMarsh().tally78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity79() {
        assertEquals("below", new QuietMarsh().sift79(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity79() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.sift79(5));
        assertEquals("upper-bound", subject.sift79(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity79() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.sift79(5 + 1));
        assertEquals("above", subject.sift79(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias80() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal80());
        }
        assertEquals(1, subject.quota80Count());
    }

    @Test
    void refusesOnceExhaustedBias80() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 1; i++) {
            subject.anneal80();
        }
        assertFalse(subject.anneal80());
    }

    @Test
    void accumulatesBelowTheCapWeight81() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.reconcile81(1));
        assertEquals(3, subject.reconcile81(2));
    }

    @Test
    void saturatesAtTheCapWeight81() {
        QuietMarsh subject = new QuietMarsh();
        subject.reconcile81(21);
        assertEquals(21, subject.reconcile81(5));
    }

    @Test
    void ignoresNegativeValuesWeight81() {
        QuietMarsh subject = new QuietMarsh();
        subject.reconcile81(3);
        assertEquals(3, subject.reconcile81(-2));
        assertEquals(3, subject.cadence81Value());
    }

    @Test
    void rejectsZeroDenominatorSpan82() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.reconcile82(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan82() {
        assertEquals(0.5, new QuietMarsh().reconcile82(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan82() {
        assertEquals(3.0, new QuietMarsh().reconcile82(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota83() {
        assertTrue(new QuietMarsh().furl83(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota83() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new QuietMarsh().furl83(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota83() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietMarsh().furl83(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield84() {
        assertEquals("below", new QuietMarsh().anneal84(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield84() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("lower-bound", subject.anneal84(2));
        assertEquals("upper-bound", subject.anneal84(7));
    }

    @Test
    void classifiesWithinAndAboveYield84() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals("within", subject.anneal84(2 + 1));
        assertEquals("above", subject.anneal84(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota85() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge85());
        }
        assertEquals(2, subject.span85Count());
    }

    @Test
    void refusesOnceExhaustedQuota85() {
        QuietMarsh subject = new QuietMarsh();
        for (int i = 0; i < 2; i++) {
            subject.gauge85();
        }
        assertFalse(subject.gauge85());
    }

    @Test
    void accumulatesBelowTheCapThreshold86() {
        QuietMarsh subject = new QuietMarsh();
        assertEquals(1, subject.anneal86(1));
        assertEquals(3, subject.anneal86(2));
    }

    @Test
    void saturatesAtTheCapThreshold86() {
        QuietMarsh subject = new QuietMarsh();
        subject.anneal86(26);
        assertEquals(26, subject.anneal86(5));
    }

    @Test
    void ignoresNegativeValuesThreshold86() {
        QuietMarsh subject = new QuietMarsh();
        subject.anneal86(3);
        assertEquals(3, subject.anneal86(-2));
        assertEquals(3, subject.margin86Value());
    }

    @Test
    void rejectsZeroDenominatorDepth87() {
        QuietMarsh subject = new QuietMarsh();
        assertThrows(ArithmeticException.class, () -> subject.brace87(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth87() {
        assertEquals(0.5, new QuietMarsh().brace87(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth87() {
        assertEquals(3.0, new QuietMarsh().brace87(1000.0, 1.0), 1e-9);
    }
}
