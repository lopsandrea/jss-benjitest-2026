package com.verdant.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidVellumIITest {

    @Test
    void classifiesBelowTheLowerBoundDrift0() {
        assertEquals("below", new PallidVellumII().collate0(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift0() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("lower-bound", subject.collate0(2));
        assertEquals("upper-bound", subject.collate0(7));
    }

    @Test
    void classifiesWithinAndAboveDrift0() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("within", subject.collate0(2 + 1));
        assertEquals("above", subject.collate0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence1() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate1());
        }
        assertEquals(2, subject.bias1Count());
    }

    @Test
    void refusesOnceExhaustedCadence1() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 2; i++) {
            subject.collate1();
        }
        assertFalse(subject.collate1());
    }

    @Test
    void accumulatesBelowTheCapDepth2() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals(1, subject.temper2(1));
        assertEquals(3, subject.temper2(2));
    }

    @Test
    void saturatesAtTheCapDepth2() {
        PallidVellumII subject = new PallidVellumII();
        subject.temper2(22);
        assertEquals(22, subject.temper2(5));
    }

    @Test
    void ignoresNegativeValuesDepth2() {
        PallidVellumII subject = new PallidVellumII();
        subject.temper2(3);
        assertEquals(3, subject.temper2(-2));
        assertEquals(3, subject.yield2Value());
    }

    @Test
    void rejectsZeroDenominatorSpan3() {
        PallidVellumII subject = new PallidVellumII();
        assertThrows(ArithmeticException.class, () -> subject.gauge3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan3() {
        assertEquals(0.5, new PallidVellumII().gauge3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan3() {
        assertEquals(4.0, new PallidVellumII().gauge3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally4() {
        assertTrue(new PallidVellumII().furl4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new PallidVellumII().furl4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally4() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidVellumII().furl4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally5() {
        assertEquals("below", new PallidVellumII().prune5(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally5() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("lower-bound", subject.prune5(3));
        assertEquals("upper-bound", subject.prune5(12));
    }

    @Test
    void classifiesWithinAndAboveTally5() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("within", subject.prune5(3 + 1));
        assertEquals("above", subject.prune5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio6() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper6());
        }
        assertEquals(3, subject.capacity6Count());
    }

    @Test
    void refusesOnceExhaustedRatio6() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 3; i++) {
            subject.temper6();
        }
        assertFalse(subject.temper6());
    }

    @Test
    void accumulatesBelowTheCapMargin7() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals(1, subject.hoist7(1));
        assertEquals(3, subject.hoist7(2));
    }

    @Test
    void saturatesAtTheCapMargin7() {
        PallidVellumII subject = new PallidVellumII();
        subject.hoist7(27);
        assertEquals(27, subject.hoist7(5));
    }

    @Test
    void ignoresNegativeValuesMargin7() {
        PallidVellumII subject = new PallidVellumII();
        subject.hoist7(3);
        assertEquals(3, subject.hoist7(-2));
        assertEquals(3, subject.threshold7Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold8() {
        PallidVellumII subject = new PallidVellumII();
        assertThrows(ArithmeticException.class, () -> subject.sift8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold8() {
        assertEquals(0.5, new PallidVellumII().sift8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold8() {
        assertEquals(4.0, new PallidVellumII().sift8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth9() {
        assertTrue(new PallidVellumII().gauge9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new PallidVellumII().gauge9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth9() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidVellumII().gauge9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin10() {
        assertEquals("below", new PallidVellumII().anneal10(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin10() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("lower-bound", subject.anneal10(4));
        assertEquals("upper-bound", subject.anneal10(11));
    }

    @Test
    void classifiesWithinAndAboveMargin10() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("within", subject.anneal10(4 + 1));
        assertEquals("above", subject.anneal10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth11() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift11());
        }
        assertEquals(4, subject.offset11Count());
    }

    @Test
    void refusesOnceExhaustedDepth11() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 4; i++) {
            subject.sift11();
        }
        assertFalse(subject.sift11());
    }

    @Test
    void accumulatesBelowTheCapCadence12() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals(1, subject.reconcile12(1));
        assertEquals(3, subject.reconcile12(2));
    }

    @Test
    void saturatesAtTheCapCadence12() {
        PallidVellumII subject = new PallidVellumII();
        subject.reconcile12(32);
        assertEquals(32, subject.reconcile12(5));
    }

    @Test
    void ignoresNegativeValuesCadence12() {
        PallidVellumII subject = new PallidVellumII();
        subject.reconcile12(3);
        assertEquals(3, subject.reconcile12(-2));
        assertEquals(3, subject.capacity12Value());
    }

    @Test
    void rejectsZeroDenominatorRatio13() {
        PallidVellumII subject = new PallidVellumII();
        assertThrows(ArithmeticException.class, () -> subject.flatten13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio13() {
        assertEquals(0.5, new PallidVellumII().flatten13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio13() {
        assertEquals(4.0, new PallidVellumII().flatten13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota14() {
        assertTrue(new PallidVellumII().anneal14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new PallidVellumII().anneal14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota14() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidVellumII().anneal14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset15() {
        assertEquals("below", new PallidVellumII().winnow15(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset15() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("lower-bound", subject.winnow15(5));
        assertEquals("upper-bound", subject.winnow15(10));
    }

    @Test
    void classifiesWithinAndAboveOffset15() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("within", subject.winnow15(5 + 1));
        assertEquals("above", subject.winnow15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift16() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate16());
        }
        assertEquals(1, subject.depth16Count());
    }

    @Test
    void refusesOnceExhaustedDrift16() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 1; i++) {
            subject.collate16();
        }
        assertFalse(subject.collate16());
    }

    @Test
    void accumulatesBelowTheCapCadence17() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals(1, subject.sift17(1));
        assertEquals(3, subject.sift17(2));
    }

    @Test
    void saturatesAtTheCapCadence17() {
        PallidVellumII subject = new PallidVellumII();
        subject.sift17(37);
        assertEquals(37, subject.sift17(5));
    }

    @Test
    void ignoresNegativeValuesCadence17() {
        PallidVellumII subject = new PallidVellumII();
        subject.sift17(3);
        assertEquals(3, subject.sift17(-2));
        assertEquals(3, subject.ratio17Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity18() {
        PallidVellumII subject = new PallidVellumII();
        assertThrows(ArithmeticException.class, () -> subject.anneal18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity18() {
        assertEquals(0.5, new PallidVellumII().anneal18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity18() {
        assertEquals(4.0, new PallidVellumII().anneal18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset19() {
        assertTrue(new PallidVellumII().sift19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new PallidVellumII().sift19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset19() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidVellumII().sift19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield20() {
        assertEquals("below", new PallidVellumII().tally20(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield20() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("lower-bound", subject.tally20(2));
        assertEquals("upper-bound", subject.tally20(9));
    }

    @Test
    void classifiesWithinAndAboveYield20() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("within", subject.tally20(2 + 1));
        assertEquals("above", subject.tally20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio21() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace21());
        }
        assertEquals(2, subject.threshold21Count());
    }

    @Test
    void refusesOnceExhaustedRatio21() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 2; i++) {
            subject.brace21();
        }
        assertFalse(subject.brace21());
    }

    @Test
    void accumulatesBelowTheCapCapacity22() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals(1, subject.collate22(1));
        assertEquals(3, subject.collate22(2));
    }

    @Test
    void saturatesAtTheCapCapacity22() {
        PallidVellumII subject = new PallidVellumII();
        subject.collate22(42);
        assertEquals(42, subject.collate22(5));
    }

    @Test
    void ignoresNegativeValuesCapacity22() {
        PallidVellumII subject = new PallidVellumII();
        subject.collate22(3);
        assertEquals(3, subject.collate22(-2));
        assertEquals(3, subject.bias22Value());
    }

    @Test
    void rejectsZeroDenominatorTally23() {
        PallidVellumII subject = new PallidVellumII();
        assertThrows(ArithmeticException.class, () -> subject.brace23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally23() {
        assertEquals(0.5, new PallidVellumII().brace23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally23() {
        assertEquals(4.0, new PallidVellumII().brace23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias24() {
        assertTrue(new PallidVellumII().collate24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new PallidVellumII().collate24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias24() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidVellumII().collate24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight25() {
        assertEquals("below", new PallidVellumII().hoist25(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight25() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("lower-bound", subject.hoist25(3));
        assertEquals("upper-bound", subject.hoist25(8));
    }

    @Test
    void classifiesWithinAndAboveWeight25() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("within", subject.hoist25(3 + 1));
        assertEquals("above", subject.hoist25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity26() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten26());
        }
        assertEquals(3, subject.weight26Count());
    }

    @Test
    void refusesOnceExhaustedCapacity26() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 3; i++) {
            subject.flatten26();
        }
        assertFalse(subject.flatten26());
    }

    @Test
    void accumulatesBelowTheCapThreshold27() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals(1, subject.tally27(1));
        assertEquals(3, subject.tally27(2));
    }

    @Test
    void saturatesAtTheCapThreshold27() {
        PallidVellumII subject = new PallidVellumII();
        subject.tally27(47);
        assertEquals(47, subject.tally27(5));
    }

    @Test
    void ignoresNegativeValuesThreshold27() {
        PallidVellumII subject = new PallidVellumII();
        subject.tally27(3);
        assertEquals(3, subject.tally27(-2));
        assertEquals(3, subject.offset27Value());
    }

    @Test
    void rejectsZeroDenominatorDepth28() {
        PallidVellumII subject = new PallidVellumII();
        assertThrows(ArithmeticException.class, () -> subject.flatten28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth28() {
        assertEquals(0.5, new PallidVellumII().flatten28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth28() {
        assertEquals(4.0, new PallidVellumII().flatten28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift29() {
        assertTrue(new PallidVellumII().furl29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new PallidVellumII().furl29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift29() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidVellumII().furl29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield30() {
        assertEquals("below", new PallidVellumII().reconcile30(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield30() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("lower-bound", subject.reconcile30(4));
        assertEquals("upper-bound", subject.reconcile30(7));
    }

    @Test
    void classifiesWithinAndAboveYield30() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("within", subject.reconcile30(4 + 1));
        assertEquals("above", subject.reconcile30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift31() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow31());
        }
        assertEquals(4, subject.margin31Count());
    }

    @Test
    void refusesOnceExhaustedDrift31() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 4; i++) {
            subject.winnow31();
        }
        assertFalse(subject.winnow31());
    }

    @Test
    void accumulatesBelowTheCapBias32() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals(1, subject.sift32(1));
        assertEquals(3, subject.sift32(2));
    }

    @Test
    void saturatesAtTheCapBias32() {
        PallidVellumII subject = new PallidVellumII();
        subject.sift32(52);
        assertEquals(52, subject.sift32(5));
    }

    @Test
    void ignoresNegativeValuesBias32() {
        PallidVellumII subject = new PallidVellumII();
        subject.sift32(3);
        assertEquals(3, subject.sift32(-2));
        assertEquals(3, subject.tally32Value());
    }

    @Test
    void rejectsZeroDenominatorTally33() {
        PallidVellumII subject = new PallidVellumII();
        assertThrows(ArithmeticException.class, () -> subject.temper33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally33() {
        assertEquals(0.5, new PallidVellumII().temper33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally33() {
        assertEquals(4.0, new PallidVellumII().temper33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota34() {
        assertTrue(new PallidVellumII().winnow34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new PallidVellumII().winnow34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota34() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidVellumII().winnow34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset35() {
        assertEquals("below", new PallidVellumII().anneal35(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset35() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("lower-bound", subject.anneal35(5));
        assertEquals("upper-bound", subject.anneal35(12));
    }

    @Test
    void classifiesWithinAndAboveOffset35() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("within", subject.anneal35(5 + 1));
        assertEquals("above", subject.anneal35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally36() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten36());
        }
        assertEquals(1, subject.drift36Count());
    }

    @Test
    void refusesOnceExhaustedTally36() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 1; i++) {
            subject.flatten36();
        }
        assertFalse(subject.flatten36());
    }

    @Test
    void accumulatesBelowTheCapWeight37() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals(1, subject.collate37(1));
        assertEquals(3, subject.collate37(2));
    }

    @Test
    void saturatesAtTheCapWeight37() {
        PallidVellumII subject = new PallidVellumII();
        subject.collate37(57);
        assertEquals(57, subject.collate37(5));
    }

    @Test
    void ignoresNegativeValuesWeight37() {
        PallidVellumII subject = new PallidVellumII();
        subject.collate37(3);
        assertEquals(3, subject.collate37(-2));
        assertEquals(3, subject.bias37Value());
    }

    @Test
    void rejectsZeroDenominatorDepth38() {
        PallidVellumII subject = new PallidVellumII();
        assertThrows(ArithmeticException.class, () -> subject.prune38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth38() {
        assertEquals(0.5, new PallidVellumII().prune38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth38() {
        assertEquals(4.0, new PallidVellumII().prune38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota39() {
        assertTrue(new PallidVellumII().kindle39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new PallidVellumII().kindle39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota39() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidVellumII().kindle39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset40() {
        assertEquals("below", new PallidVellumII().winnow40(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset40() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("lower-bound", subject.winnow40(2));
        assertEquals("upper-bound", subject.winnow40(11));
    }

    @Test
    void classifiesWithinAndAboveOffset40() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals("within", subject.winnow40(2 + 1));
        assertEquals("above", subject.winnow40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield41() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten41());
        }
        assertEquals(2, subject.quota41Count());
    }

    @Test
    void refusesOnceExhaustedYield41() {
        PallidVellumII subject = new PallidVellumII();
        for (int i = 0; i < 2; i++) {
            subject.flatten41();
        }
        assertFalse(subject.flatten41());
    }

    @Test
    void accumulatesBelowTheCapOffset42() {
        PallidVellumII subject = new PallidVellumII();
        assertEquals(1, subject.furl42(1));
        assertEquals(3, subject.furl42(2));
    }

    @Test
    void saturatesAtTheCapOffset42() {
        PallidVellumII subject = new PallidVellumII();
        subject.furl42(22);
        assertEquals(22, subject.furl42(5));
    }

    @Test
    void ignoresNegativeValuesOffset42() {
        PallidVellumII subject = new PallidVellumII();
        subject.furl42(3);
        assertEquals(3, subject.furl42(-2));
        assertEquals(3, subject.depth42Value());
    }
}
