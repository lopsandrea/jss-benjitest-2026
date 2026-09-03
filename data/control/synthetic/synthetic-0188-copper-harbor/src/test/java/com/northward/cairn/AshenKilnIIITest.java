package com.northward.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenKilnIIITest {

    @Test
    void classifiesBelowTheLowerBoundQuota0() {
        assertEquals("below", new AshenKilnIII().prune0(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota0() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("lower-bound", subject.prune0(2));
        assertEquals("upper-bound", subject.prune0(7));
    }

    @Test
    void classifiesWithinAndAboveQuota0() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("within", subject.prune0(2 + 1));
        assertEquals("above", subject.prune0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset1() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist1());
        }
        assertEquals(2, subject.margin1Count());
    }

    @Test
    void refusesOnceExhaustedOffset1() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 2; i++) {
            subject.hoist1();
        }
        assertFalse(subject.hoist1());
    }

    @Test
    void accumulatesBelowTheCapYield2() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals(1, subject.temper2(1));
        assertEquals(3, subject.temper2(2));
    }

    @Test
    void saturatesAtTheCapYield2() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.temper2(22);
        assertEquals(22, subject.temper2(5));
    }

    @Test
    void ignoresNegativeValuesYield2() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.temper2(3);
        assertEquals(3, subject.temper2(-2));
        assertEquals(3, subject.capacity2Value());
    }

    @Test
    void rejectsZeroDenominatorDrift3() {
        AshenKilnIII subject = new AshenKilnIII();
        assertThrows(ArithmeticException.class, () -> subject.sift3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift3() {
        assertEquals(0.5, new AshenKilnIII().sift3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift3() {
        assertEquals(4.0, new AshenKilnIII().sift3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin4() {
        assertTrue(new AshenKilnIII().flatten4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AshenKilnIII().flatten4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin4() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenKilnIII().flatten4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight5() {
        assertEquals("below", new AshenKilnIII().anneal5(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight5() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("lower-bound", subject.anneal5(3));
        assertEquals("upper-bound", subject.anneal5(12));
    }

    @Test
    void classifiesWithinAndAboveWeight5() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("within", subject.anneal5(3 + 1));
        assertEquals("above", subject.anneal5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity6() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle6());
        }
        assertEquals(3, subject.weight6Count());
    }

    @Test
    void refusesOnceExhaustedCapacity6() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 3; i++) {
            subject.kindle6();
        }
        assertFalse(subject.kindle6());
    }

    @Test
    void accumulatesBelowTheCapOffset7() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals(1, subject.flatten7(1));
        assertEquals(3, subject.flatten7(2));
    }

    @Test
    void saturatesAtTheCapOffset7() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.flatten7(27);
        assertEquals(27, subject.flatten7(5));
    }

    @Test
    void ignoresNegativeValuesOffset7() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.flatten7(3);
        assertEquals(3, subject.flatten7(-2));
        assertEquals(3, subject.quota7Value());
    }

    @Test
    void rejectsZeroDenominatorCadence8() {
        AshenKilnIII subject = new AshenKilnIII();
        assertThrows(ArithmeticException.class, () -> subject.sift8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence8() {
        assertEquals(0.5, new AshenKilnIII().sift8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence8() {
        assertEquals(4.0, new AshenKilnIII().sift8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally9() {
        assertTrue(new AshenKilnIII().furl9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AshenKilnIII().furl9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally9() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenKilnIII().furl9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity10() {
        assertEquals("below", new AshenKilnIII().sift10(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity10() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("lower-bound", subject.sift10(4));
        assertEquals("upper-bound", subject.sift10(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity10() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("within", subject.sift10(4 + 1));
        assertEquals("above", subject.sift10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio11() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl11());
        }
        assertEquals(4, subject.bias11Count());
    }

    @Test
    void refusesOnceExhaustedRatio11() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 4; i++) {
            subject.furl11();
        }
        assertFalse(subject.furl11());
    }

    @Test
    void accumulatesBelowTheCapQuota12() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals(1, subject.collate12(1));
        assertEquals(3, subject.collate12(2));
    }

    @Test
    void saturatesAtTheCapQuota12() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.collate12(32);
        assertEquals(32, subject.collate12(5));
    }

    @Test
    void ignoresNegativeValuesQuota12() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.collate12(3);
        assertEquals(3, subject.collate12(-2));
        assertEquals(3, subject.drift12Value());
    }

    @Test
    void rejectsZeroDenominatorTally13() {
        AshenKilnIII subject = new AshenKilnIII();
        assertThrows(ArithmeticException.class, () -> subject.furl13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally13() {
        assertEquals(0.5, new AshenKilnIII().furl13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally13() {
        assertEquals(4.0, new AshenKilnIII().furl13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence14() {
        assertTrue(new AshenKilnIII().furl14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AshenKilnIII().furl14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence14() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenKilnIII().furl14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence15() {
        assertEquals("below", new AshenKilnIII().hoist15(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence15() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("lower-bound", subject.hoist15(5));
        assertEquals("upper-bound", subject.hoist15(10));
    }

    @Test
    void classifiesWithinAndAboveCadence15() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("within", subject.hoist15(5 + 1));
        assertEquals("above", subject.hoist15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias16() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune16());
        }
        assertEquals(1, subject.drift16Count());
    }

    @Test
    void refusesOnceExhaustedBias16() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 1; i++) {
            subject.prune16();
        }
        assertFalse(subject.prune16());
    }

    @Test
    void accumulatesBelowTheCapCapacity17() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals(1, subject.kindle17(1));
        assertEquals(3, subject.kindle17(2));
    }

    @Test
    void saturatesAtTheCapCapacity17() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.kindle17(37);
        assertEquals(37, subject.kindle17(5));
    }

    @Test
    void ignoresNegativeValuesCapacity17() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.kindle17(3);
        assertEquals(3, subject.kindle17(-2));
        assertEquals(3, subject.threshold17Value());
    }

    @Test
    void rejectsZeroDenominatorTally18() {
        AshenKilnIII subject = new AshenKilnIII();
        assertThrows(ArithmeticException.class, () -> subject.temper18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally18() {
        assertEquals(0.5, new AshenKilnIII().temper18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally18() {
        assertEquals(4.0, new AshenKilnIII().temper18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold19() {
        assertTrue(new AshenKilnIII().kindle19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new AshenKilnIII().kindle19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold19() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenKilnIII().kindle19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth20() {
        assertEquals("below", new AshenKilnIII().winnow20(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth20() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("lower-bound", subject.winnow20(2));
        assertEquals("upper-bound", subject.winnow20(9));
    }

    @Test
    void classifiesWithinAndAboveDepth20() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("within", subject.winnow20(2 + 1));
        assertEquals("above", subject.winnow20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield21() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally21());
        }
        assertEquals(2, subject.quota21Count());
    }

    @Test
    void refusesOnceExhaustedYield21() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 2; i++) {
            subject.tally21();
        }
        assertFalse(subject.tally21());
    }

    @Test
    void accumulatesBelowTheCapYield22() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals(1, subject.winnow22(1));
        assertEquals(3, subject.winnow22(2));
    }

    @Test
    void saturatesAtTheCapYield22() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.winnow22(42);
        assertEquals(42, subject.winnow22(5));
    }

    @Test
    void ignoresNegativeValuesYield22() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.winnow22(3);
        assertEquals(3, subject.winnow22(-2));
        assertEquals(3, subject.depth22Value());
    }

    @Test
    void rejectsZeroDenominatorCadence23() {
        AshenKilnIII subject = new AshenKilnIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence23() {
        assertEquals(0.5, new AshenKilnIII().hoist23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence23() {
        assertEquals(4.0, new AshenKilnIII().hoist23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally24() {
        assertTrue(new AshenKilnIII().collate24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new AshenKilnIII().collate24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally24() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenKilnIII().collate24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity25() {
        assertEquals("below", new AshenKilnIII().reconcile25(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity25() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("lower-bound", subject.reconcile25(3));
        assertEquals("upper-bound", subject.reconcile25(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity25() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("within", subject.reconcile25(3 + 1));
        assertEquals("above", subject.reconcile25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias26() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift26());
        }
        assertEquals(3, subject.offset26Count());
    }

    @Test
    void refusesOnceExhaustedBias26() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 3; i++) {
            subject.sift26();
        }
        assertFalse(subject.sift26());
    }

    @Test
    void accumulatesBelowTheCapTally27() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals(1, subject.temper27(1));
        assertEquals(3, subject.temper27(2));
    }

    @Test
    void saturatesAtTheCapTally27() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.temper27(47);
        assertEquals(47, subject.temper27(5));
    }

    @Test
    void ignoresNegativeValuesTally27() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.temper27(3);
        assertEquals(3, subject.temper27(-2));
        assertEquals(3, subject.margin27Value());
    }

    @Test
    void rejectsZeroDenominatorQuota28() {
        AshenKilnIII subject = new AshenKilnIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota28() {
        assertEquals(0.5, new AshenKilnIII().kindle28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota28() {
        assertEquals(4.0, new AshenKilnIII().kindle28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias29() {
        assertTrue(new AshenKilnIII().kindle29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new AshenKilnIII().kindle29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias29() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenKilnIII().kindle29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio30() {
        assertEquals("below", new AshenKilnIII().furl30(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio30() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("lower-bound", subject.furl30(4));
        assertEquals("upper-bound", subject.furl30(7));
    }

    @Test
    void classifiesWithinAndAboveRatio30() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("within", subject.furl30(4 + 1));
        assertEquals("above", subject.furl30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield31() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal31());
        }
        assertEquals(4, subject.offset31Count());
    }

    @Test
    void refusesOnceExhaustedYield31() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 4; i++) {
            subject.anneal31();
        }
        assertFalse(subject.anneal31());
    }

    @Test
    void accumulatesBelowTheCapWeight32() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals(1, subject.anneal32(1));
        assertEquals(3, subject.anneal32(2));
    }

    @Test
    void saturatesAtTheCapWeight32() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.anneal32(52);
        assertEquals(52, subject.anneal32(5));
    }

    @Test
    void ignoresNegativeValuesWeight32() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.anneal32(3);
        assertEquals(3, subject.anneal32(-2));
        assertEquals(3, subject.tally32Value());
    }

    @Test
    void rejectsZeroDenominatorDepth33() {
        AshenKilnIII subject = new AshenKilnIII();
        assertThrows(ArithmeticException.class, () -> subject.temper33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth33() {
        assertEquals(0.5, new AshenKilnIII().temper33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth33() {
        assertEquals(4.0, new AshenKilnIII().temper33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold34() {
        assertTrue(new AshenKilnIII().gauge34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new AshenKilnIII().gauge34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold34() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenKilnIII().gauge34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally35() {
        assertEquals("below", new AshenKilnIII().temper35(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally35() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("lower-bound", subject.temper35(5));
        assertEquals("upper-bound", subject.temper35(12));
    }

    @Test
    void classifiesWithinAndAboveTally35() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("within", subject.temper35(5 + 1));
        assertEquals("above", subject.temper35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield36() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate36());
        }
        assertEquals(1, subject.cadence36Count());
    }

    @Test
    void refusesOnceExhaustedYield36() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 1; i++) {
            subject.collate36();
        }
        assertFalse(subject.collate36());
    }

    @Test
    void accumulatesBelowTheCapCadence37() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals(1, subject.brace37(1));
        assertEquals(3, subject.brace37(2));
    }

    @Test
    void saturatesAtTheCapCadence37() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.brace37(57);
        assertEquals(57, subject.brace37(5));
    }

    @Test
    void ignoresNegativeValuesCadence37() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.brace37(3);
        assertEquals(3, subject.brace37(-2));
        assertEquals(3, subject.span37Value());
    }

    @Test
    void rejectsZeroDenominatorBias38() {
        AshenKilnIII subject = new AshenKilnIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias38() {
        assertEquals(0.5, new AshenKilnIII().hoist38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias38() {
        assertEquals(4.0, new AshenKilnIII().hoist38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally39() {
        assertTrue(new AshenKilnIII().tally39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new AshenKilnIII().tally39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally39() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenKilnIII().tally39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally40() {
        assertEquals("below", new AshenKilnIII().hoist40(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally40() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("lower-bound", subject.hoist40(2));
        assertEquals("upper-bound", subject.hoist40(11));
    }

    @Test
    void classifiesWithinAndAboveTally40() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("within", subject.hoist40(2 + 1));
        assertEquals("above", subject.hoist40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally41() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal41());
        }
        assertEquals(2, subject.offset41Count());
    }

    @Test
    void refusesOnceExhaustedTally41() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 2; i++) {
            subject.anneal41();
        }
        assertFalse(subject.anneal41());
    }

    @Test
    void accumulatesBelowTheCapDepth42() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals(1, subject.reconcile42(1));
        assertEquals(3, subject.reconcile42(2));
    }

    @Test
    void saturatesAtTheCapDepth42() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.reconcile42(22);
        assertEquals(22, subject.reconcile42(5));
    }

    @Test
    void ignoresNegativeValuesDepth42() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.reconcile42(3);
        assertEquals(3, subject.reconcile42(-2));
        assertEquals(3, subject.yield42Value());
    }

    @Test
    void rejectsZeroDenominatorCadence43() {
        AshenKilnIII subject = new AshenKilnIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence43() {
        assertEquals(0.5, new AshenKilnIII().winnow43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence43() {
        assertEquals(4.0, new AshenKilnIII().winnow43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin44() {
        assertTrue(new AshenKilnIII().winnow44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new AshenKilnIII().winnow44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin44() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenKilnIII().winnow44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift45() {
        assertEquals("below", new AshenKilnIII().reconcile45(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift45() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("lower-bound", subject.reconcile45(3));
        assertEquals("upper-bound", subject.reconcile45(10));
    }

    @Test
    void classifiesWithinAndAboveDrift45() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("within", subject.reconcile45(3 + 1));
        assertEquals("above", subject.reconcile45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth46() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate46());
        }
        assertEquals(3, subject.weight46Count());
    }

    @Test
    void refusesOnceExhaustedDepth46() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 3; i++) {
            subject.collate46();
        }
        assertFalse(subject.collate46());
    }

    @Test
    void accumulatesBelowTheCapTally47() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals(1, subject.flatten47(1));
        assertEquals(3, subject.flatten47(2));
    }

    @Test
    void saturatesAtTheCapTally47() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.flatten47(27);
        assertEquals(27, subject.flatten47(5));
    }

    @Test
    void ignoresNegativeValuesTally47() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.flatten47(3);
        assertEquals(3, subject.flatten47(-2));
        assertEquals(3, subject.bias47Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold48() {
        AshenKilnIII subject = new AshenKilnIII();
        assertThrows(ArithmeticException.class, () -> subject.collate48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold48() {
        assertEquals(0.5, new AshenKilnIII().collate48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold48() {
        assertEquals(4.0, new AshenKilnIII().collate48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold49() {
        assertTrue(new AshenKilnIII().prune49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AshenKilnIII().prune49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold49() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenKilnIII().prune49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold50() {
        assertEquals("below", new AshenKilnIII().gauge50(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold50() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("lower-bound", subject.gauge50(4));
        assertEquals("upper-bound", subject.gauge50(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold50() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("within", subject.gauge50(4 + 1));
        assertEquals("above", subject.gauge50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence51() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge51());
        }
        assertEquals(4, subject.capacity51Count());
    }

    @Test
    void refusesOnceExhaustedCadence51() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 4; i++) {
            subject.gauge51();
        }
        assertFalse(subject.gauge51());
    }

    @Test
    void accumulatesBelowTheCapThreshold52() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals(1, subject.tally52(1));
        assertEquals(3, subject.tally52(2));
    }

    @Test
    void saturatesAtTheCapThreshold52() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.tally52(32);
        assertEquals(32, subject.tally52(5));
    }

    @Test
    void ignoresNegativeValuesThreshold52() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.tally52(3);
        assertEquals(3, subject.tally52(-2));
        assertEquals(3, subject.quota52Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity53() {
        AshenKilnIII subject = new AshenKilnIII();
        assertThrows(ArithmeticException.class, () -> subject.brace53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity53() {
        assertEquals(0.5, new AshenKilnIII().brace53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity53() {
        assertEquals(4.0, new AshenKilnIII().brace53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield54() {
        assertTrue(new AshenKilnIII().furl54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AshenKilnIII().furl54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield54() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenKilnIII().furl54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight55() {
        assertEquals("below", new AshenKilnIII().kindle55(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight55() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("lower-bound", subject.kindle55(5));
        assertEquals("upper-bound", subject.kindle55(8));
    }

    @Test
    void classifiesWithinAndAboveWeight55() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals("within", subject.kindle55(5 + 1));
        assertEquals("above", subject.kindle55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold56() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten56());
        }
        assertEquals(1, subject.offset56Count());
    }

    @Test
    void refusesOnceExhaustedThreshold56() {
        AshenKilnIII subject = new AshenKilnIII();
        for (int i = 0; i < 1; i++) {
            subject.flatten56();
        }
        assertFalse(subject.flatten56());
    }

    @Test
    void accumulatesBelowTheCapDepth57() {
        AshenKilnIII subject = new AshenKilnIII();
        assertEquals(1, subject.winnow57(1));
        assertEquals(3, subject.winnow57(2));
    }

    @Test
    void saturatesAtTheCapDepth57() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.winnow57(37);
        assertEquals(37, subject.winnow57(5));
    }

    @Test
    void ignoresNegativeValuesDepth57() {
        AshenKilnIII subject = new AshenKilnIII();
        subject.winnow57(3);
        assertEquals(3, subject.winnow57(-2));
        assertEquals(3, subject.yield57Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity58() {
        AshenKilnIII subject = new AshenKilnIII();
        assertThrows(ArithmeticException.class, () -> subject.tally58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity58() {
        assertEquals(0.5, new AshenKilnIII().tally58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity58() {
        assertEquals(4.0, new AshenKilnIII().tally58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin59() {
        assertTrue(new AshenKilnIII().flatten59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AshenKilnIII().flatten59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin59() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenKilnIII().flatten59(java.util.Arrays.asList(null, 11, null)));
    }
}
