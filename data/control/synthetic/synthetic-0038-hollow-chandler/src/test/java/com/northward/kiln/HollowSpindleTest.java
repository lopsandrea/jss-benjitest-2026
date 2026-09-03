package com.northward.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowSpindleTest {

    @Test
    void classifiesBelowTheLowerBoundBias0() {
        assertEquals("below", new HollowSpindle().furl0(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias0() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("lower-bound", subject.furl0(2));
        assertEquals("upper-bound", subject.furl0(7));
    }

    @Test
    void classifiesWithinAndAboveBias0() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("within", subject.furl0(2 + 1));
        assertEquals("above", subject.furl0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight1() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally1());
        }
        assertEquals(2, subject.yield1Count());
    }

    @Test
    void refusesOnceExhaustedWeight1() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 2; i++) {
            subject.tally1();
        }
        assertFalse(subject.tally1());
    }

    @Test
    void accumulatesBelowTheCapTally2() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals(1, subject.furl2(1));
        assertEquals(3, subject.furl2(2));
    }

    @Test
    void saturatesAtTheCapTally2() {
        HollowSpindle subject = new HollowSpindle();
        subject.furl2(22);
        assertEquals(22, subject.furl2(5));
    }

    @Test
    void ignoresNegativeValuesTally2() {
        HollowSpindle subject = new HollowSpindle();
        subject.furl2(3);
        assertEquals(3, subject.furl2(-2));
        assertEquals(3, subject.ratio2Value());
    }

    @Test
    void rejectsZeroDenominatorRatio3() {
        HollowSpindle subject = new HollowSpindle();
        assertThrows(ArithmeticException.class, () -> subject.collate3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio3() {
        assertEquals(0.5, new HollowSpindle().collate3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio3() {
        assertEquals(4.0, new HollowSpindle().collate3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin4() {
        assertTrue(new HollowSpindle().kindle4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new HollowSpindle().kindle4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin4() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowSpindle().kindle4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold5() {
        assertEquals("below", new HollowSpindle().winnow5(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold5() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("lower-bound", subject.winnow5(3));
        assertEquals("upper-bound", subject.winnow5(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold5() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("within", subject.winnow5(3 + 1));
        assertEquals("above", subject.winnow5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin6() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune6());
        }
        assertEquals(3, subject.ratio6Count());
    }

    @Test
    void refusesOnceExhaustedMargin6() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 3; i++) {
            subject.prune6();
        }
        assertFalse(subject.prune6());
    }

    @Test
    void accumulatesBelowTheCapDrift7() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals(1, subject.furl7(1));
        assertEquals(3, subject.furl7(2));
    }

    @Test
    void saturatesAtTheCapDrift7() {
        HollowSpindle subject = new HollowSpindle();
        subject.furl7(27);
        assertEquals(27, subject.furl7(5));
    }

    @Test
    void ignoresNegativeValuesDrift7() {
        HollowSpindle subject = new HollowSpindle();
        subject.furl7(3);
        assertEquals(3, subject.furl7(-2));
        assertEquals(3, subject.bias7Value());
    }

    @Test
    void rejectsZeroDenominatorCadence8() {
        HollowSpindle subject = new HollowSpindle();
        assertThrows(ArithmeticException.class, () -> subject.anneal8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence8() {
        assertEquals(0.5, new HollowSpindle().anneal8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence8() {
        assertEquals(4.0, new HollowSpindle().anneal8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota9() {
        assertTrue(new HollowSpindle().temper9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new HollowSpindle().temper9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota9() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowSpindle().temper9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally10() {
        assertEquals("below", new HollowSpindle().kindle10(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally10() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("lower-bound", subject.kindle10(4));
        assertEquals("upper-bound", subject.kindle10(11));
    }

    @Test
    void classifiesWithinAndAboveTally10() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("within", subject.kindle10(4 + 1));
        assertEquals("above", subject.kindle10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan11() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally11());
        }
        assertEquals(4, subject.tally11Count());
    }

    @Test
    void refusesOnceExhaustedSpan11() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 4; i++) {
            subject.tally11();
        }
        assertFalse(subject.tally11());
    }

    @Test
    void accumulatesBelowTheCapOffset12() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals(1, subject.collate12(1));
        assertEquals(3, subject.collate12(2));
    }

    @Test
    void saturatesAtTheCapOffset12() {
        HollowSpindle subject = new HollowSpindle();
        subject.collate12(32);
        assertEquals(32, subject.collate12(5));
    }

    @Test
    void ignoresNegativeValuesOffset12() {
        HollowSpindle subject = new HollowSpindle();
        subject.collate12(3);
        assertEquals(3, subject.collate12(-2));
        assertEquals(3, subject.drift12Value());
    }

    @Test
    void rejectsZeroDenominatorDepth13() {
        HollowSpindle subject = new HollowSpindle();
        assertThrows(ArithmeticException.class, () -> subject.tally13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth13() {
        assertEquals(0.5, new HollowSpindle().tally13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth13() {
        assertEquals(4.0, new HollowSpindle().tally13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth14() {
        assertTrue(new HollowSpindle().collate14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new HollowSpindle().collate14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth14() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowSpindle().collate14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity15() {
        assertEquals("below", new HollowSpindle().collate15(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity15() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("lower-bound", subject.collate15(5));
        assertEquals("upper-bound", subject.collate15(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity15() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("within", subject.collate15(5 + 1));
        assertEquals("above", subject.collate15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight16() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl16());
        }
        assertEquals(1, subject.depth16Count());
    }

    @Test
    void refusesOnceExhaustedWeight16() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 1; i++) {
            subject.furl16();
        }
        assertFalse(subject.furl16());
    }

    @Test
    void accumulatesBelowTheCapOffset17() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals(1, subject.temper17(1));
        assertEquals(3, subject.temper17(2));
    }

    @Test
    void saturatesAtTheCapOffset17() {
        HollowSpindle subject = new HollowSpindle();
        subject.temper17(37);
        assertEquals(37, subject.temper17(5));
    }

    @Test
    void ignoresNegativeValuesOffset17() {
        HollowSpindle subject = new HollowSpindle();
        subject.temper17(3);
        assertEquals(3, subject.temper17(-2));
        assertEquals(3, subject.cadence17Value());
    }

    @Test
    void rejectsZeroDenominatorYield18() {
        HollowSpindle subject = new HollowSpindle();
        assertThrows(ArithmeticException.class, () -> subject.temper18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield18() {
        assertEquals(0.5, new HollowSpindle().temper18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield18() {
        assertEquals(4.0, new HollowSpindle().temper18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence19() {
        assertTrue(new HollowSpindle().gauge19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new HollowSpindle().gauge19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence19() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowSpindle().gauge19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally20() {
        assertEquals("below", new HollowSpindle().collate20(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally20() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("lower-bound", subject.collate20(2));
        assertEquals("upper-bound", subject.collate20(9));
    }

    @Test
    void classifiesWithinAndAboveTally20() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("within", subject.collate20(2 + 1));
        assertEquals("above", subject.collate20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence21() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge21());
        }
        assertEquals(2, subject.drift21Count());
    }

    @Test
    void refusesOnceExhaustedCadence21() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 2; i++) {
            subject.gauge21();
        }
        assertFalse(subject.gauge21());
    }

    @Test
    void accumulatesBelowTheCapMargin22() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals(1, subject.reconcile22(1));
        assertEquals(3, subject.reconcile22(2));
    }

    @Test
    void saturatesAtTheCapMargin22() {
        HollowSpindle subject = new HollowSpindle();
        subject.reconcile22(42);
        assertEquals(42, subject.reconcile22(5));
    }

    @Test
    void ignoresNegativeValuesMargin22() {
        HollowSpindle subject = new HollowSpindle();
        subject.reconcile22(3);
        assertEquals(3, subject.reconcile22(-2));
        assertEquals(3, subject.yield22Value());
    }

    @Test
    void rejectsZeroDenominatorTally23() {
        HollowSpindle subject = new HollowSpindle();
        assertThrows(ArithmeticException.class, () -> subject.gauge23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally23() {
        assertEquals(0.5, new HollowSpindle().gauge23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally23() {
        assertEquals(4.0, new HollowSpindle().gauge23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield24() {
        assertTrue(new HollowSpindle().collate24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new HollowSpindle().collate24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield24() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowSpindle().collate24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias25() {
        assertEquals("below", new HollowSpindle().winnow25(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias25() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("lower-bound", subject.winnow25(3));
        assertEquals("upper-bound", subject.winnow25(8));
    }

    @Test
    void classifiesWithinAndAboveBias25() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("within", subject.winnow25(3 + 1));
        assertEquals("above", subject.winnow25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota26() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate26());
        }
        assertEquals(3, subject.yield26Count());
    }

    @Test
    void refusesOnceExhaustedQuota26() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 3; i++) {
            subject.collate26();
        }
        assertFalse(subject.collate26());
    }

    @Test
    void accumulatesBelowTheCapTally27() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals(1, subject.anneal27(1));
        assertEquals(3, subject.anneal27(2));
    }

    @Test
    void saturatesAtTheCapTally27() {
        HollowSpindle subject = new HollowSpindle();
        subject.anneal27(47);
        assertEquals(47, subject.anneal27(5));
    }

    @Test
    void ignoresNegativeValuesTally27() {
        HollowSpindle subject = new HollowSpindle();
        subject.anneal27(3);
        assertEquals(3, subject.anneal27(-2));
        assertEquals(3, subject.bias27Value());
    }

    @Test
    void rejectsZeroDenominatorTally28() {
        HollowSpindle subject = new HollowSpindle();
        assertThrows(ArithmeticException.class, () -> subject.furl28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally28() {
        assertEquals(0.5, new HollowSpindle().furl28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally28() {
        assertEquals(4.0, new HollowSpindle().furl28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset29() {
        assertTrue(new HollowSpindle().temper29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new HollowSpindle().temper29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset29() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowSpindle().temper29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias30() {
        assertEquals("below", new HollowSpindle().kindle30(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias30() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("lower-bound", subject.kindle30(4));
        assertEquals("upper-bound", subject.kindle30(7));
    }

    @Test
    void classifiesWithinAndAboveBias30() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("within", subject.kindle30(4 + 1));
        assertEquals("above", subject.kindle30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth31() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper31());
        }
        assertEquals(4, subject.threshold31Count());
    }

    @Test
    void refusesOnceExhaustedDepth31() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 4; i++) {
            subject.temper31();
        }
        assertFalse(subject.temper31());
    }

    @Test
    void accumulatesBelowTheCapDepth32() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals(1, subject.winnow32(1));
        assertEquals(3, subject.winnow32(2));
    }

    @Test
    void saturatesAtTheCapDepth32() {
        HollowSpindle subject = new HollowSpindle();
        subject.winnow32(52);
        assertEquals(52, subject.winnow32(5));
    }

    @Test
    void ignoresNegativeValuesDepth32() {
        HollowSpindle subject = new HollowSpindle();
        subject.winnow32(3);
        assertEquals(3, subject.winnow32(-2));
        assertEquals(3, subject.span32Value());
    }

    @Test
    void rejectsZeroDenominatorCadence33() {
        HollowSpindle subject = new HollowSpindle();
        assertThrows(ArithmeticException.class, () -> subject.anneal33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence33() {
        assertEquals(0.5, new HollowSpindle().anneal33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence33() {
        assertEquals(4.0, new HollowSpindle().anneal33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift34() {
        assertTrue(new HollowSpindle().winnow34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new HollowSpindle().winnow34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift34() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowSpindle().winnow34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold35() {
        assertEquals("below", new HollowSpindle().reconcile35(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold35() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("lower-bound", subject.reconcile35(5));
        assertEquals("upper-bound", subject.reconcile35(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold35() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("within", subject.reconcile35(5 + 1));
        assertEquals("above", subject.reconcile35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin36() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow36());
        }
        assertEquals(1, subject.ratio36Count());
    }

    @Test
    void refusesOnceExhaustedMargin36() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 1; i++) {
            subject.winnow36();
        }
        assertFalse(subject.winnow36());
    }

    @Test
    void accumulatesBelowTheCapDepth37() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals(1, subject.gauge37(1));
        assertEquals(3, subject.gauge37(2));
    }

    @Test
    void saturatesAtTheCapDepth37() {
        HollowSpindle subject = new HollowSpindle();
        subject.gauge37(57);
        assertEquals(57, subject.gauge37(5));
    }

    @Test
    void ignoresNegativeValuesDepth37() {
        HollowSpindle subject = new HollowSpindle();
        subject.gauge37(3);
        assertEquals(3, subject.gauge37(-2));
        assertEquals(3, subject.yield37Value());
    }

    @Test
    void rejectsZeroDenominatorMargin38() {
        HollowSpindle subject = new HollowSpindle();
        assertThrows(ArithmeticException.class, () -> subject.gauge38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin38() {
        assertEquals(0.5, new HollowSpindle().gauge38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin38() {
        assertEquals(4.0, new HollowSpindle().gauge38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth39() {
        assertTrue(new HollowSpindle().prune39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new HollowSpindle().prune39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth39() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowSpindle().prune39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan40() {
        assertEquals("below", new HollowSpindle().collate40(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan40() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("lower-bound", subject.collate40(2));
        assertEquals("upper-bound", subject.collate40(11));
    }

    @Test
    void classifiesWithinAndAboveSpan40() {
        HollowSpindle subject = new HollowSpindle();
        assertEquals("within", subject.collate40(2 + 1));
        assertEquals("above", subject.collate40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota41() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally41());
        }
        assertEquals(2, subject.weight41Count());
    }

    @Test
    void refusesOnceExhaustedQuota41() {
        HollowSpindle subject = new HollowSpindle();
        for (int i = 0; i < 2; i++) {
            subject.tally41();
        }
        assertFalse(subject.tally41());
    }
}
