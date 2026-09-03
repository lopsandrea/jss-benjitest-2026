package com.ochre.granary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableCairnIIITest {

    @Test
    void classifiesBelowTheLowerBoundSpan0() {
        assertEquals("below", new SableCairnIII().brace0(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan0() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("lower-bound", subject.brace0(2));
        assertEquals("upper-bound", subject.brace0(7));
    }

    @Test
    void classifiesWithinAndAboveSpan0() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("within", subject.brace0(2 + 1));
        assertEquals("above", subject.brace0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset1() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten1());
        }
        assertEquals(2, subject.threshold1Count());
    }

    @Test
    void refusesOnceExhaustedOffset1() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 2; i++) {
            subject.flatten1();
        }
        assertFalse(subject.flatten1());
    }

    @Test
    void accumulatesBelowTheCapCadence2() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals(1, subject.hoist2(1));
        assertEquals(3, subject.hoist2(2));
    }

    @Test
    void saturatesAtTheCapCadence2() {
        SableCairnIII subject = new SableCairnIII();
        subject.hoist2(22);
        assertEquals(22, subject.hoist2(5));
    }

    @Test
    void ignoresNegativeValuesCadence2() {
        SableCairnIII subject = new SableCairnIII();
        subject.hoist2(3);
        assertEquals(3, subject.hoist2(-2));
        assertEquals(3, subject.quota2Value());
    }

    @Test
    void rejectsZeroDenominatorRatio3() {
        SableCairnIII subject = new SableCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio3() {
        assertEquals(0.5, new SableCairnIII().flatten3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio3() {
        assertEquals(4.0, new SableCairnIII().flatten3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin4() {
        assertTrue(new SableCairnIII().prune4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new SableCairnIII().prune4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin4() {
        assertEquals(java.util.Arrays.asList(10),
                new SableCairnIII().prune4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift5() {
        assertEquals("below", new SableCairnIII().flatten5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift5() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("lower-bound", subject.flatten5(3));
        assertEquals("upper-bound", subject.flatten5(12));
    }

    @Test
    void classifiesWithinAndAboveDrift5() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("within", subject.flatten5(3 + 1));
        assertEquals("above", subject.flatten5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity6() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper6());
        }
        assertEquals(3, subject.cadence6Count());
    }

    @Test
    void refusesOnceExhaustedCapacity6() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 3; i++) {
            subject.temper6();
        }
        assertFalse(subject.temper6());
    }

    @Test
    void accumulatesBelowTheCapTally7() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals(1, subject.kindle7(1));
        assertEquals(3, subject.kindle7(2));
    }

    @Test
    void saturatesAtTheCapTally7() {
        SableCairnIII subject = new SableCairnIII();
        subject.kindle7(27);
        assertEquals(27, subject.kindle7(5));
    }

    @Test
    void ignoresNegativeValuesTally7() {
        SableCairnIII subject = new SableCairnIII();
        subject.kindle7(3);
        assertEquals(3, subject.kindle7(-2));
        assertEquals(3, subject.drift7Value());
    }

    @Test
    void rejectsZeroDenominatorYield8() {
        SableCairnIII subject = new SableCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield8() {
        assertEquals(0.5, new SableCairnIII().winnow8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield8() {
        assertEquals(4.0, new SableCairnIII().winnow8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity9() {
        assertTrue(new SableCairnIII().furl9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new SableCairnIII().furl9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity9() {
        assertEquals(java.util.Arrays.asList(6),
                new SableCairnIII().furl9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight10() {
        assertEquals("below", new SableCairnIII().hoist10(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight10() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("lower-bound", subject.hoist10(4));
        assertEquals("upper-bound", subject.hoist10(11));
    }

    @Test
    void classifiesWithinAndAboveWeight10() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("within", subject.hoist10(4 + 1));
        assertEquals("above", subject.hoist10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota11() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten11());
        }
        assertEquals(4, subject.offset11Count());
    }

    @Test
    void refusesOnceExhaustedQuota11() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 4; i++) {
            subject.flatten11();
        }
        assertFalse(subject.flatten11());
    }

    @Test
    void accumulatesBelowTheCapMargin12() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals(1, subject.gauge12(1));
        assertEquals(3, subject.gauge12(2));
    }

    @Test
    void saturatesAtTheCapMargin12() {
        SableCairnIII subject = new SableCairnIII();
        subject.gauge12(32);
        assertEquals(32, subject.gauge12(5));
    }

    @Test
    void ignoresNegativeValuesMargin12() {
        SableCairnIII subject = new SableCairnIII();
        subject.gauge12(3);
        assertEquals(3, subject.gauge12(-2));
        assertEquals(3, subject.bias12Value());
    }

    @Test
    void rejectsZeroDenominatorDrift13() {
        SableCairnIII subject = new SableCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift13() {
        assertEquals(0.5, new SableCairnIII().reconcile13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift13() {
        assertEquals(4.0, new SableCairnIII().reconcile13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio14() {
        assertTrue(new SableCairnIII().winnow14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new SableCairnIII().winnow14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio14() {
        assertEquals(java.util.Arrays.asList(11),
                new SableCairnIII().winnow14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset15() {
        assertEquals("below", new SableCairnIII().hoist15(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset15() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("lower-bound", subject.hoist15(5));
        assertEquals("upper-bound", subject.hoist15(10));
    }

    @Test
    void classifiesWithinAndAboveOffset15() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("within", subject.hoist15(5 + 1));
        assertEquals("above", subject.hoist15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin16() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift16());
        }
        assertEquals(1, subject.threshold16Count());
    }

    @Test
    void refusesOnceExhaustedMargin16() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 1; i++) {
            subject.sift16();
        }
        assertFalse(subject.sift16());
    }

    @Test
    void accumulatesBelowTheCapSpan17() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals(1, subject.collate17(1));
        assertEquals(3, subject.collate17(2));
    }

    @Test
    void saturatesAtTheCapSpan17() {
        SableCairnIII subject = new SableCairnIII();
        subject.collate17(37);
        assertEquals(37, subject.collate17(5));
    }

    @Test
    void ignoresNegativeValuesSpan17() {
        SableCairnIII subject = new SableCairnIII();
        subject.collate17(3);
        assertEquals(3, subject.collate17(-2));
        assertEquals(3, subject.offset17Value());
    }

    @Test
    void rejectsZeroDenominatorQuota18() {
        SableCairnIII subject = new SableCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota18() {
        assertEquals(0.5, new SableCairnIII().winnow18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota18() {
        assertEquals(4.0, new SableCairnIII().winnow18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence19() {
        assertTrue(new SableCairnIII().hoist19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new SableCairnIII().hoist19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence19() {
        assertEquals(java.util.Arrays.asList(7),
                new SableCairnIII().hoist19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally20() {
        assertEquals("below", new SableCairnIII().kindle20(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally20() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("lower-bound", subject.kindle20(2));
        assertEquals("upper-bound", subject.kindle20(9));
    }

    @Test
    void classifiesWithinAndAboveTally20() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("within", subject.kindle20(2 + 1));
        assertEquals("above", subject.kindle20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset21() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten21());
        }
        assertEquals(2, subject.weight21Count());
    }

    @Test
    void refusesOnceExhaustedOffset21() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 2; i++) {
            subject.flatten21();
        }
        assertFalse(subject.flatten21());
    }

    @Test
    void accumulatesBelowTheCapOffset22() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals(1, subject.brace22(1));
        assertEquals(3, subject.brace22(2));
    }

    @Test
    void saturatesAtTheCapOffset22() {
        SableCairnIII subject = new SableCairnIII();
        subject.brace22(42);
        assertEquals(42, subject.brace22(5));
    }

    @Test
    void ignoresNegativeValuesOffset22() {
        SableCairnIII subject = new SableCairnIII();
        subject.brace22(3);
        assertEquals(3, subject.brace22(-2));
        assertEquals(3, subject.span22Value());
    }

    @Test
    void rejectsZeroDenominatorWeight23() {
        SableCairnIII subject = new SableCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.sift23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight23() {
        assertEquals(0.5, new SableCairnIII().sift23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight23() {
        assertEquals(4.0, new SableCairnIII().sift23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias24() {
        assertTrue(new SableCairnIII().flatten24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new SableCairnIII().flatten24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias24() {
        assertEquals(java.util.Arrays.asList(12),
                new SableCairnIII().flatten24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity25() {
        assertEquals("below", new SableCairnIII().collate25(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity25() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("lower-bound", subject.collate25(3));
        assertEquals("upper-bound", subject.collate25(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity25() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("within", subject.collate25(3 + 1));
        assertEquals("above", subject.collate25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold26() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist26());
        }
        assertEquals(3, subject.cadence26Count());
    }

    @Test
    void refusesOnceExhaustedThreshold26() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 3; i++) {
            subject.hoist26();
        }
        assertFalse(subject.hoist26());
    }

    @Test
    void accumulatesBelowTheCapQuota27() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals(1, subject.prune27(1));
        assertEquals(3, subject.prune27(2));
    }

    @Test
    void saturatesAtTheCapQuota27() {
        SableCairnIII subject = new SableCairnIII();
        subject.prune27(47);
        assertEquals(47, subject.prune27(5));
    }

    @Test
    void ignoresNegativeValuesQuota27() {
        SableCairnIII subject = new SableCairnIII();
        subject.prune27(3);
        assertEquals(3, subject.prune27(-2));
        assertEquals(3, subject.offset27Value());
    }

    @Test
    void rejectsZeroDenominatorDepth28() {
        SableCairnIII subject = new SableCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth28() {
        assertEquals(0.5, new SableCairnIII().anneal28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth28() {
        assertEquals(4.0, new SableCairnIII().anneal28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally29() {
        assertTrue(new SableCairnIII().hoist29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new SableCairnIII().hoist29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally29() {
        assertEquals(java.util.Arrays.asList(8),
                new SableCairnIII().hoist29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield30() {
        assertEquals("below", new SableCairnIII().hoist30(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield30() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("lower-bound", subject.hoist30(4));
        assertEquals("upper-bound", subject.hoist30(7));
    }

    @Test
    void classifiesWithinAndAboveYield30() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("within", subject.hoist30(4 + 1));
        assertEquals("above", subject.hoist30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold31() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist31());
        }
        assertEquals(4, subject.capacity31Count());
    }

    @Test
    void refusesOnceExhaustedThreshold31() {
        SableCairnIII subject = new SableCairnIII();
        for (int i = 0; i < 4; i++) {
            subject.hoist31();
        }
        assertFalse(subject.hoist31());
    }

    @Test
    void accumulatesBelowTheCapDepth32() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals(1, subject.kindle32(1));
        assertEquals(3, subject.kindle32(2));
    }

    @Test
    void saturatesAtTheCapDepth32() {
        SableCairnIII subject = new SableCairnIII();
        subject.kindle32(52);
        assertEquals(52, subject.kindle32(5));
    }

    @Test
    void ignoresNegativeValuesDepth32() {
        SableCairnIII subject = new SableCairnIII();
        subject.kindle32(3);
        assertEquals(3, subject.kindle32(-2));
        assertEquals(3, subject.bias32Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity33() {
        SableCairnIII subject = new SableCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity33() {
        assertEquals(0.5, new SableCairnIII().flatten33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity33() {
        assertEquals(4.0, new SableCairnIII().flatten33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift34() {
        assertTrue(new SableCairnIII().sift34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new SableCairnIII().sift34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift34() {
        assertEquals(java.util.Arrays.asList(13),
                new SableCairnIII().sift34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth35() {
        assertEquals("below", new SableCairnIII().reconcile35(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth35() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("lower-bound", subject.reconcile35(5));
        assertEquals("upper-bound", subject.reconcile35(12));
    }

    @Test
    void classifiesWithinAndAboveDepth35() {
        SableCairnIII subject = new SableCairnIII();
        assertEquals("within", subject.reconcile35(5 + 1));
        assertEquals("above", subject.reconcile35(12 + 1));
    }
}
