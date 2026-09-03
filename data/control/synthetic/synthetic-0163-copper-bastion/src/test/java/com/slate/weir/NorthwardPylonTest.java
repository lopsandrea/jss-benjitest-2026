package com.slate.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardPylonTest {

    @Test
    void classifiesBelowTheLowerBoundYield0() {
        assertEquals("below", new NorthwardPylon().anneal0(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield0() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.anneal0(2));
        assertEquals("upper-bound", subject.anneal0(7));
    }

    @Test
    void classifiesWithinAndAboveYield0() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.anneal0(2 + 1));
        assertEquals("above", subject.anneal0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence1() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal1());
        }
        assertEquals(2, subject.capacity1Count());
    }

    @Test
    void refusesOnceExhaustedCadence1() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            subject.anneal1();
        }
        assertFalse(subject.anneal1());
    }

    @Test
    void accumulatesBelowTheCapMargin2() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.flatten2(1));
        assertEquals(3, subject.flatten2(2));
    }

    @Test
    void saturatesAtTheCapMargin2() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.flatten2(22);
        assertEquals(22, subject.flatten2(5));
    }

    @Test
    void ignoresNegativeValuesMargin2() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.flatten2(3);
        assertEquals(3, subject.flatten2(-2));
        assertEquals(3, subject.tally2Value());
    }

    @Test
    void rejectsZeroDenominatorSpan3() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.brace3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan3() {
        assertEquals(0.5, new NorthwardPylon().brace3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan3() {
        assertEquals(4.0, new NorthwardPylon().brace3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift4() {
        assertTrue(new NorthwardPylon().flatten4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardPylon().flatten4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift4() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardPylon().flatten4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence5() {
        assertEquals("below", new NorthwardPylon().tally5(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence5() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.tally5(3));
        assertEquals("upper-bound", subject.tally5(12));
    }

    @Test
    void classifiesWithinAndAboveCadence5() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.tally5(3 + 1));
        assertEquals("above", subject.tally5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth6() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally6());
        }
        assertEquals(3, subject.weight6Count());
    }

    @Test
    void refusesOnceExhaustedDepth6() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            subject.tally6();
        }
        assertFalse(subject.tally6());
    }

    @Test
    void accumulatesBelowTheCapWeight7() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.anneal7(1));
        assertEquals(3, subject.anneal7(2));
    }

    @Test
    void saturatesAtTheCapWeight7() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.anneal7(27);
        assertEquals(27, subject.anneal7(5));
    }

    @Test
    void ignoresNegativeValuesWeight7() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.anneal7(3);
        assertEquals(3, subject.anneal7(-2));
        assertEquals(3, subject.tally7Value());
    }

    @Test
    void rejectsZeroDenominatorTally8() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally8() {
        assertEquals(0.5, new NorthwardPylon().anneal8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally8() {
        assertEquals(4.0, new NorthwardPylon().anneal8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota9() {
        assertTrue(new NorthwardPylon().tally9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new NorthwardPylon().tally9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota9() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardPylon().tally9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight10() {
        assertEquals("below", new NorthwardPylon().reconcile10(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight10() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.reconcile10(4));
        assertEquals("upper-bound", subject.reconcile10(11));
    }

    @Test
    void classifiesWithinAndAboveWeight10() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.reconcile10(4 + 1));
        assertEquals("above", subject.reconcile10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth11() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle11());
        }
        assertEquals(4, subject.threshold11Count());
    }

    @Test
    void refusesOnceExhaustedDepth11() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            subject.kindle11();
        }
        assertFalse(subject.kindle11());
    }

    @Test
    void accumulatesBelowTheCapWeight12() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.prune12(1));
        assertEquals(3, subject.prune12(2));
    }

    @Test
    void saturatesAtTheCapWeight12() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.prune12(32);
        assertEquals(32, subject.prune12(5));
    }

    @Test
    void ignoresNegativeValuesWeight12() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.prune12(3);
        assertEquals(3, subject.prune12(-2));
        assertEquals(3, subject.depth12Value());
    }

    @Test
    void rejectsZeroDenominatorMargin13() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin13() {
        assertEquals(0.5, new NorthwardPylon().flatten13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin13() {
        assertEquals(4.0, new NorthwardPylon().flatten13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield14() {
        assertTrue(new NorthwardPylon().kindle14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new NorthwardPylon().kindle14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield14() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardPylon().kindle14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias15() {
        assertEquals("below", new NorthwardPylon().kindle15(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias15() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.kindle15(5));
        assertEquals("upper-bound", subject.kindle15(10));
    }

    @Test
    void classifiesWithinAndAboveBias15() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.kindle15(5 + 1));
        assertEquals("above", subject.kindle15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota16() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle16());
        }
        assertEquals(1, subject.margin16Count());
    }

    @Test
    void refusesOnceExhaustedQuota16() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            subject.kindle16();
        }
        assertFalse(subject.kindle16());
    }

    @Test
    void accumulatesBelowTheCapCapacity17() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.winnow17(1));
        assertEquals(3, subject.winnow17(2));
    }

    @Test
    void saturatesAtTheCapCapacity17() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.winnow17(37);
        assertEquals(37, subject.winnow17(5));
    }

    @Test
    void ignoresNegativeValuesCapacity17() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.winnow17(3);
        assertEquals(3, subject.winnow17(-2));
        assertEquals(3, subject.yield17Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold18() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold18() {
        assertEquals(0.5, new NorthwardPylon().temper18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold18() {
        assertEquals(4.0, new NorthwardPylon().temper18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight19() {
        assertTrue(new NorthwardPylon().anneal19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new NorthwardPylon().anneal19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight19() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardPylon().anneal19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold20() {
        assertEquals("below", new NorthwardPylon().kindle20(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold20() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.kindle20(2));
        assertEquals("upper-bound", subject.kindle20(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold20() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.kindle20(2 + 1));
        assertEquals("above", subject.kindle20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift21() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle21());
        }
        assertEquals(2, subject.tally21Count());
    }

    @Test
    void refusesOnceExhaustedDrift21() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            subject.kindle21();
        }
        assertFalse(subject.kindle21());
    }

    @Test
    void accumulatesBelowTheCapTally22() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.sift22(1));
        assertEquals(3, subject.sift22(2));
    }

    @Test
    void saturatesAtTheCapTally22() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift22(42);
        assertEquals(42, subject.sift22(5));
    }

    @Test
    void ignoresNegativeValuesTally22() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift22(3);
        assertEquals(3, subject.sift22(-2));
        assertEquals(3, subject.margin22Value());
    }

    @Test
    void rejectsZeroDenominatorDepth23() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.furl23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth23() {
        assertEquals(0.5, new NorthwardPylon().furl23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth23() {
        assertEquals(4.0, new NorthwardPylon().furl23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan24() {
        assertTrue(new NorthwardPylon().winnow24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new NorthwardPylon().winnow24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan24() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardPylon().winnow24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity25() {
        assertEquals("below", new NorthwardPylon().hoist25(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity25() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.hoist25(3));
        assertEquals("upper-bound", subject.hoist25(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity25() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.hoist25(3 + 1));
        assertEquals("above", subject.hoist25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias26() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist26());
        }
        assertEquals(3, subject.offset26Count());
    }

    @Test
    void refusesOnceExhaustedBias26() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            subject.hoist26();
        }
        assertFalse(subject.hoist26());
    }

    @Test
    void accumulatesBelowTheCapThreshold27() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.tally27(1));
        assertEquals(3, subject.tally27(2));
    }

    @Test
    void saturatesAtTheCapThreshold27() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.tally27(47);
        assertEquals(47, subject.tally27(5));
    }

    @Test
    void ignoresNegativeValuesThreshold27() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.tally27(3);
        assertEquals(3, subject.tally27(-2));
        assertEquals(3, subject.drift27Value());
    }

    @Test
    void rejectsZeroDenominatorWeight28() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight28() {
        assertEquals(0.5, new NorthwardPylon().anneal28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight28() {
        assertEquals(4.0, new NorthwardPylon().anneal28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth29() {
        assertTrue(new NorthwardPylon().tally29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new NorthwardPylon().tally29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth29() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardPylon().tally29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin30() {
        assertEquals("below", new NorthwardPylon().hoist30(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin30() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.hoist30(4));
        assertEquals("upper-bound", subject.hoist30(7));
    }

    @Test
    void classifiesWithinAndAboveMargin30() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.hoist30(4 + 1));
        assertEquals("above", subject.hoist30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio31() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune31());
        }
        assertEquals(4, subject.yield31Count());
    }

    @Test
    void refusesOnceExhaustedRatio31() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            subject.prune31();
        }
        assertFalse(subject.prune31());
    }

    @Test
    void accumulatesBelowTheCapCapacity32() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.flatten32(1));
        assertEquals(3, subject.flatten32(2));
    }

    @Test
    void saturatesAtTheCapCapacity32() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.flatten32(52);
        assertEquals(52, subject.flatten32(5));
    }

    @Test
    void ignoresNegativeValuesCapacity32() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.flatten32(3);
        assertEquals(3, subject.flatten32(-2));
        assertEquals(3, subject.threshold32Value());
    }

    @Test
    void rejectsZeroDenominatorDepth33() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.furl33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth33() {
        assertEquals(0.5, new NorthwardPylon().furl33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth33() {
        assertEquals(4.0, new NorthwardPylon().furl33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio34() {
        assertTrue(new NorthwardPylon().reconcile34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new NorthwardPylon().reconcile34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio34() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardPylon().reconcile34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift35() {
        assertEquals("below", new NorthwardPylon().brace35(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift35() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.brace35(5));
        assertEquals("upper-bound", subject.brace35(12));
    }

    @Test
    void classifiesWithinAndAboveDrift35() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.brace35(5 + 1));
        assertEquals("above", subject.brace35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin36() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate36());
        }
        assertEquals(1, subject.bias36Count());
    }

    @Test
    void refusesOnceExhaustedMargin36() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            subject.collate36();
        }
        assertFalse(subject.collate36());
    }

    @Test
    void accumulatesBelowTheCapQuota37() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.prune37(1));
        assertEquals(3, subject.prune37(2));
    }

    @Test
    void saturatesAtTheCapQuota37() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.prune37(57);
        assertEquals(57, subject.prune37(5));
    }

    @Test
    void ignoresNegativeValuesQuota37() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.prune37(3);
        assertEquals(3, subject.prune37(-2));
        assertEquals(3, subject.span37Value());
    }

    @Test
    void rejectsZeroDenominatorDepth38() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth38() {
        assertEquals(0.5, new NorthwardPylon().temper38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth38() {
        assertEquals(4.0, new NorthwardPylon().temper38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold39() {
        assertTrue(new NorthwardPylon().anneal39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new NorthwardPylon().anneal39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold39() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardPylon().anneal39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin40() {
        assertEquals("below", new NorthwardPylon().prune40(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin40() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.prune40(2));
        assertEquals("upper-bound", subject.prune40(11));
    }

    @Test
    void classifiesWithinAndAboveMargin40() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.prune40(2 + 1));
        assertEquals("above", subject.prune40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota41() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift41());
        }
        assertEquals(2, subject.depth41Count());
    }

    @Test
    void refusesOnceExhaustedQuota41() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            subject.sift41();
        }
        assertFalse(subject.sift41());
    }

    @Test
    void accumulatesBelowTheCapQuota42() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.sift42(1));
        assertEquals(3, subject.sift42(2));
    }

    @Test
    void saturatesAtTheCapQuota42() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift42(22);
        assertEquals(22, subject.sift42(5));
    }

    @Test
    void ignoresNegativeValuesQuota42() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift42(3);
        assertEquals(3, subject.sift42(-2));
        assertEquals(3, subject.threshold42Value());
    }

    @Test
    void rejectsZeroDenominatorYield43() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.prune43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield43() {
        assertEquals(0.5, new NorthwardPylon().prune43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield43() {
        assertEquals(4.0, new NorthwardPylon().prune43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally44() {
        assertTrue(new NorthwardPylon().flatten44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new NorthwardPylon().flatten44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally44() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardPylon().flatten44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence45() {
        assertEquals("below", new NorthwardPylon().hoist45(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence45() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.hoist45(3));
        assertEquals("upper-bound", subject.hoist45(10));
    }

    @Test
    void classifiesWithinAndAboveCadence45() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.hoist45(3 + 1));
        assertEquals("above", subject.hoist45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin46() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper46());
        }
        assertEquals(3, subject.span46Count());
    }

    @Test
    void refusesOnceExhaustedMargin46() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            subject.temper46();
        }
        assertFalse(subject.temper46());
    }

    @Test
    void accumulatesBelowTheCapCadence47() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.prune47(1));
        assertEquals(3, subject.prune47(2));
    }

    @Test
    void saturatesAtTheCapCadence47() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.prune47(27);
        assertEquals(27, subject.prune47(5));
    }

    @Test
    void ignoresNegativeValuesCadence47() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.prune47(3);
        assertEquals(3, subject.prune47(-2));
        assertEquals(3, subject.margin47Value());
    }

    @Test
    void rejectsZeroDenominatorYield48() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield48() {
        assertEquals(0.5, new NorthwardPylon().kindle48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield48() {
        assertEquals(4.0, new NorthwardPylon().kindle48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset49() {
        assertTrue(new NorthwardPylon().collate49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardPylon().collate49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset49() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardPylon().collate49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio50() {
        assertEquals("below", new NorthwardPylon().tally50(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio50() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.tally50(4));
        assertEquals("upper-bound", subject.tally50(9));
    }

    @Test
    void classifiesWithinAndAboveRatio50() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.tally50(4 + 1));
        assertEquals("above", subject.tally50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin51() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper51());
        }
        assertEquals(4, subject.offset51Count());
    }

    @Test
    void refusesOnceExhaustedMargin51() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            subject.temper51();
        }
        assertFalse(subject.temper51());
    }

    @Test
    void accumulatesBelowTheCapOffset52() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.reconcile52(1));
        assertEquals(3, subject.reconcile52(2));
    }

    @Test
    void saturatesAtTheCapOffset52() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.reconcile52(32);
        assertEquals(32, subject.reconcile52(5));
    }

    @Test
    void ignoresNegativeValuesOffset52() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.reconcile52(3);
        assertEquals(3, subject.reconcile52(-2));
        assertEquals(3, subject.tally52Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold53() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold53() {
        assertEquals(0.5, new NorthwardPylon().hoist53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold53() {
        assertEquals(4.0, new NorthwardPylon().hoist53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield54() {
        assertTrue(new NorthwardPylon().temper54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new NorthwardPylon().temper54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield54() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardPylon().temper54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift55() {
        assertEquals("below", new NorthwardPylon().kindle55(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift55() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.kindle55(5));
        assertEquals("upper-bound", subject.kindle55(8));
    }

    @Test
    void classifiesWithinAndAboveDrift55() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.kindle55(5 + 1));
        assertEquals("above", subject.kindle55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence56() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle56());
        }
        assertEquals(1, subject.tally56Count());
    }

    @Test
    void refusesOnceExhaustedCadence56() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            subject.kindle56();
        }
        assertFalse(subject.kindle56());
    }

    @Test
    void accumulatesBelowTheCapMargin57() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.winnow57(1));
        assertEquals(3, subject.winnow57(2));
    }

    @Test
    void saturatesAtTheCapMargin57() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.winnow57(37);
        assertEquals(37, subject.winnow57(5));
    }

    @Test
    void ignoresNegativeValuesMargin57() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.winnow57(3);
        assertEquals(3, subject.winnow57(-2));
        assertEquals(3, subject.tally57Value());
    }

    @Test
    void rejectsZeroDenominatorRatio58() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio58() {
        assertEquals(0.5, new NorthwardPylon().sift58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio58() {
        assertEquals(4.0, new NorthwardPylon().sift58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth59() {
        assertTrue(new NorthwardPylon().prune59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new NorthwardPylon().prune59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth59() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardPylon().prune59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight60() {
        assertEquals("below", new NorthwardPylon().hoist60(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight60() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.hoist60(2));
        assertEquals("upper-bound", subject.hoist60(7));
    }

    @Test
    void classifiesWithinAndAboveWeight60() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.hoist60(2 + 1));
        assertEquals("above", subject.hoist60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift61() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow61());
        }
        assertEquals(2, subject.span61Count());
    }

    @Test
    void refusesOnceExhaustedDrift61() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            subject.winnow61();
        }
        assertFalse(subject.winnow61());
    }

    @Test
    void accumulatesBelowTheCapMargin62() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.brace62(1));
        assertEquals(3, subject.brace62(2));
    }

    @Test
    void saturatesAtTheCapMargin62() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.brace62(42);
        assertEquals(42, subject.brace62(5));
    }

    @Test
    void ignoresNegativeValuesMargin62() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.brace62(3);
        assertEquals(3, subject.brace62(-2));
        assertEquals(3, subject.quota62Value());
    }

    @Test
    void rejectsZeroDenominatorTally63() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally63() {
        assertEquals(0.5, new NorthwardPylon().hoist63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally63() {
        assertEquals(4.0, new NorthwardPylon().hoist63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio64() {
        assertTrue(new NorthwardPylon().tally64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new NorthwardPylon().tally64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio64() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardPylon().tally64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity65() {
        assertEquals("below", new NorthwardPylon().flatten65(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity65() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.flatten65(3));
        assertEquals("upper-bound", subject.flatten65(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity65() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.flatten65(3 + 1));
        assertEquals("above", subject.flatten65(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold66() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl66());
        }
        assertEquals(3, subject.margin66Count());
    }

    @Test
    void refusesOnceExhaustedThreshold66() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            subject.furl66();
        }
        assertFalse(subject.furl66());
    }

    @Test
    void accumulatesBelowTheCapOffset67() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.gauge67(1));
        assertEquals(3, subject.gauge67(2));
    }

    @Test
    void saturatesAtTheCapOffset67() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.gauge67(47);
        assertEquals(47, subject.gauge67(5));
    }

    @Test
    void ignoresNegativeValuesOffset67() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.gauge67(3);
        assertEquals(3, subject.gauge67(-2));
        assertEquals(3, subject.depth67Value());
    }

    @Test
    void rejectsZeroDenominatorRatio68() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten68(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio68() {
        assertEquals(0.5, new NorthwardPylon().flatten68(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio68() {
        assertEquals(4.0, new NorthwardPylon().flatten68(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias69() {
        assertTrue(new NorthwardPylon().winnow69(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias69() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new NorthwardPylon().winnow69(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias69() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardPylon().winnow69(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence70() {
        assertEquals("below", new NorthwardPylon().gauge70(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence70() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.gauge70(4));
        assertEquals("upper-bound", subject.gauge70(11));
    }

    @Test
    void classifiesWithinAndAboveCadence70() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.gauge70(4 + 1));
        assertEquals("above", subject.gauge70(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift71() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally71());
        }
        assertEquals(4, subject.tally71Count());
    }

    @Test
    void refusesOnceExhaustedDrift71() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            subject.tally71();
        }
        assertFalse(subject.tally71());
    }

    @Test
    void accumulatesBelowTheCapDrift72() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.flatten72(1));
        assertEquals(3, subject.flatten72(2));
    }

    @Test
    void saturatesAtTheCapDrift72() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.flatten72(52);
        assertEquals(52, subject.flatten72(5));
    }

    @Test
    void ignoresNegativeValuesDrift72() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.flatten72(3);
        assertEquals(3, subject.flatten72(-2));
        assertEquals(3, subject.cadence72Value());
    }

    @Test
    void rejectsZeroDenominatorOffset73() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal73(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset73() {
        assertEquals(0.5, new NorthwardPylon().anneal73(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset73() {
        assertEquals(4.0, new NorthwardPylon().anneal73(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift74() {
        assertTrue(new NorthwardPylon().gauge74(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift74() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new NorthwardPylon().gauge74(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift74() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardPylon().gauge74(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity75() {
        assertEquals("below", new NorthwardPylon().collate75(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity75() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.collate75(5));
        assertEquals("upper-bound", subject.collate75(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity75() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.collate75(5 + 1));
        assertEquals("above", subject.collate75(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift76() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist76());
        }
        assertEquals(1, subject.ratio76Count());
    }

    @Test
    void refusesOnceExhaustedDrift76() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            subject.hoist76();
        }
        assertFalse(subject.hoist76());
    }

    @Test
    void accumulatesBelowTheCapRatio77() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.hoist77(1));
        assertEquals(3, subject.hoist77(2));
    }

    @Test
    void saturatesAtTheCapRatio77() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.hoist77(57);
        assertEquals(57, subject.hoist77(5));
    }

    @Test
    void ignoresNegativeValuesRatio77() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.hoist77(3);
        assertEquals(3, subject.hoist77(-2));
        assertEquals(3, subject.offset77Value());
    }

    @Test
    void rejectsZeroDenominatorSpan78() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.prune78(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan78() {
        assertEquals(0.5, new NorthwardPylon().prune78(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan78() {
        assertEquals(4.0, new NorthwardPylon().prune78(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence79() {
        assertTrue(new NorthwardPylon().gauge79(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence79() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new NorthwardPylon().gauge79(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence79() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardPylon().gauge79(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift80() {
        assertEquals("below", new NorthwardPylon().kindle80(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift80() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.kindle80(2));
        assertEquals("upper-bound", subject.kindle80(9));
    }

    @Test
    void classifiesWithinAndAboveDrift80() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.kindle80(2 + 1));
        assertEquals("above", subject.kindle80(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity81() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow81());
        }
        assertEquals(2, subject.margin81Count());
    }

    @Test
    void refusesOnceExhaustedCapacity81() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            subject.winnow81();
        }
        assertFalse(subject.winnow81());
    }

    @Test
    void accumulatesBelowTheCapRatio82() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.collate82(1));
        assertEquals(3, subject.collate82(2));
    }

    @Test
    void saturatesAtTheCapRatio82() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.collate82(22);
        assertEquals(22, subject.collate82(5));
    }

    @Test
    void ignoresNegativeValuesRatio82() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.collate82(3);
        assertEquals(3, subject.collate82(-2));
        assertEquals(3, subject.depth82Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold83() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten83(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold83() {
        assertEquals(0.5, new NorthwardPylon().flatten83(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold83() {
        assertEquals(4.0, new NorthwardPylon().flatten83(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight84() {
        assertTrue(new NorthwardPylon().prune84(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight84() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new NorthwardPylon().prune84(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight84() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardPylon().prune84(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan85() {
        assertEquals("below", new NorthwardPylon().flatten85(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan85() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.flatten85(3));
        assertEquals("upper-bound", subject.flatten85(8));
    }

    @Test
    void classifiesWithinAndAboveSpan85() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.flatten85(3 + 1));
        assertEquals("above", subject.flatten85(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield86() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge86());
        }
        assertEquals(3, subject.depth86Count());
    }

    @Test
    void refusesOnceExhaustedYield86() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            subject.gauge86();
        }
        assertFalse(subject.gauge86());
    }

    @Test
    void accumulatesBelowTheCapRatio87() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.furl87(1));
        assertEquals(3, subject.furl87(2));
    }

    @Test
    void saturatesAtTheCapRatio87() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.furl87(27);
        assertEquals(27, subject.furl87(5));
    }

    @Test
    void ignoresNegativeValuesRatio87() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.furl87(3);
        assertEquals(3, subject.furl87(-2));
        assertEquals(3, subject.drift87Value());
    }

    @Test
    void rejectsZeroDenominatorQuota88() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist88(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota88() {
        assertEquals(0.5, new NorthwardPylon().hoist88(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota88() {
        assertEquals(4.0, new NorthwardPylon().hoist88(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence89() {
        assertTrue(new NorthwardPylon().kindle89(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence89() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new NorthwardPylon().kindle89(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence89() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardPylon().kindle89(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity90() {
        assertEquals("below", new NorthwardPylon().temper90(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity90() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.temper90(4));
        assertEquals("upper-bound", subject.temper90(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity90() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.temper90(4 + 1));
        assertEquals("above", subject.temper90(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota91() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow91());
        }
        assertEquals(4, subject.weight91Count());
    }

    @Test
    void refusesOnceExhaustedQuota91() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            subject.winnow91();
        }
        assertFalse(subject.winnow91());
    }

    @Test
    void accumulatesBelowTheCapDepth92() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.tally92(1));
        assertEquals(3, subject.tally92(2));
    }

    @Test
    void saturatesAtTheCapDepth92() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.tally92(32);
        assertEquals(32, subject.tally92(5));
    }

    @Test
    void ignoresNegativeValuesDepth92() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.tally92(3);
        assertEquals(3, subject.tally92(-2));
        assertEquals(3, subject.offset92Value());
    }

    @Test
    void rejectsZeroDenominatorCadence93() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.winnow93(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence93() {
        assertEquals(0.5, new NorthwardPylon().winnow93(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence93() {
        assertEquals(4.0, new NorthwardPylon().winnow93(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio94() {
        assertTrue(new NorthwardPylon().collate94(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio94() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardPylon().collate94(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio94() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardPylon().collate94(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold95() {
        assertEquals("below", new NorthwardPylon().furl95(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold95() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.furl95(5));
        assertEquals("upper-bound", subject.furl95(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold95() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.furl95(5 + 1));
        assertEquals("above", subject.furl95(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally96() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist96());
        }
        assertEquals(1, subject.offset96Count());
    }

    @Test
    void refusesOnceExhaustedTally96() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            subject.hoist96();
        }
        assertFalse(subject.hoist96());
    }

    @Test
    void accumulatesBelowTheCapSpan97() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.sift97(1));
        assertEquals(3, subject.sift97(2));
    }

    @Test
    void saturatesAtTheCapSpan97() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift97(37);
        assertEquals(37, subject.sift97(5));
    }

    @Test
    void ignoresNegativeValuesSpan97() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift97(3);
        assertEquals(3, subject.sift97(-2));
        assertEquals(3, subject.bias97Value());
    }

    @Test
    void rejectsZeroDenominatorBias98() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.winnow98(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias98() {
        assertEquals(0.5, new NorthwardPylon().winnow98(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias98() {
        assertEquals(4.0, new NorthwardPylon().winnow98(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity99() {
        assertTrue(new NorthwardPylon().temper99(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity99() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new NorthwardPylon().temper99(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity99() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardPylon().temper99(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota100() {
        assertEquals("below", new NorthwardPylon().tally100(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota100() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.tally100(2));
        assertEquals("upper-bound", subject.tally100(11));
    }

    @Test
    void classifiesWithinAndAboveQuota100() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.tally100(2 + 1));
        assertEquals("above", subject.tally100(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield101() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle101());
        }
        assertEquals(2, subject.span101Count());
    }

    @Test
    void refusesOnceExhaustedYield101() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            subject.kindle101();
        }
        assertFalse(subject.kindle101());
    }

    @Test
    void accumulatesBelowTheCapDepth102() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.reconcile102(1));
        assertEquals(3, subject.reconcile102(2));
    }

    @Test
    void saturatesAtTheCapDepth102() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.reconcile102(42);
        assertEquals(42, subject.reconcile102(5));
    }

    @Test
    void ignoresNegativeValuesDepth102() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.reconcile102(3);
        assertEquals(3, subject.reconcile102(-2));
        assertEquals(3, subject.threshold102Value());
    }

    @Test
    void rejectsZeroDenominatorTally103() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper103(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally103() {
        assertEquals(0.5, new NorthwardPylon().temper103(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally103() {
        assertEquals(4.0, new NorthwardPylon().temper103(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan104() {
        assertTrue(new NorthwardPylon().winnow104(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan104() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new NorthwardPylon().winnow104(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan104() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardPylon().winnow104(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota105() {
        assertEquals("below", new NorthwardPylon().gauge105(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota105() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.gauge105(3));
        assertEquals("upper-bound", subject.gauge105(10));
    }

    @Test
    void classifiesWithinAndAboveQuota105() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.gauge105(3 + 1));
        assertEquals("above", subject.gauge105(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence106() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal106());
        }
        assertEquals(3, subject.drift106Count());
    }

    @Test
    void refusesOnceExhaustedCadence106() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            subject.anneal106();
        }
        assertFalse(subject.anneal106());
    }

    @Test
    void accumulatesBelowTheCapQuota107() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.flatten107(1));
        assertEquals(3, subject.flatten107(2));
    }

    @Test
    void saturatesAtTheCapQuota107() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.flatten107(47);
        assertEquals(47, subject.flatten107(5));
    }

    @Test
    void ignoresNegativeValuesQuota107() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.flatten107(3);
        assertEquals(3, subject.flatten107(-2));
        assertEquals(3, subject.depth107Value());
    }

    @Test
    void rejectsZeroDenominatorBias108() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle108(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias108() {
        assertEquals(0.5, new NorthwardPylon().kindle108(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias108() {
        assertEquals(4.0, new NorthwardPylon().kindle108(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias109() {
        assertTrue(new NorthwardPylon().tally109(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias109() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new NorthwardPylon().tally109(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias109() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardPylon().tally109(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias110() {
        assertEquals("below", new NorthwardPylon().prune110(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias110() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.prune110(4));
        assertEquals("upper-bound", subject.prune110(9));
    }

    @Test
    void classifiesWithinAndAboveBias110() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.prune110(4 + 1));
        assertEquals("above", subject.prune110(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift111() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile111());
        }
        assertEquals(4, subject.bias111Count());
    }

    @Test
    void refusesOnceExhaustedDrift111() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            subject.reconcile111();
        }
        assertFalse(subject.reconcile111());
    }

    @Test
    void accumulatesBelowTheCapRatio112() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.sift112(1));
        assertEquals(3, subject.sift112(2));
    }

    @Test
    void saturatesAtTheCapRatio112() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift112(52);
        assertEquals(52, subject.sift112(5));
    }

    @Test
    void ignoresNegativeValuesRatio112() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift112(3);
        assertEquals(3, subject.sift112(-2));
        assertEquals(3, subject.tally112Value());
    }

    @Test
    void rejectsZeroDenominatorTally113() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.gauge113(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally113() {
        assertEquals(0.5, new NorthwardPylon().gauge113(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally113() {
        assertEquals(4.0, new NorthwardPylon().gauge113(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield114() {
        assertTrue(new NorthwardPylon().prune114(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield114() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new NorthwardPylon().prune114(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield114() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardPylon().prune114(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally115() {
        assertEquals("below", new NorthwardPylon().tally115(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally115() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.tally115(5));
        assertEquals("upper-bound", subject.tally115(8));
    }

    @Test
    void classifiesWithinAndAboveTally115() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.tally115(5 + 1));
        assertEquals("above", subject.tally115(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence116() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile116());
        }
        assertEquals(1, subject.drift116Count());
    }

    @Test
    void refusesOnceExhaustedCadence116() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            subject.reconcile116();
        }
        assertFalse(subject.reconcile116());
    }

    @Test
    void accumulatesBelowTheCapYield117() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.sift117(1));
        assertEquals(3, subject.sift117(2));
    }

    @Test
    void saturatesAtTheCapYield117() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift117(57);
        assertEquals(57, subject.sift117(5));
    }

    @Test
    void ignoresNegativeValuesYield117() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift117(3);
        assertEquals(3, subject.sift117(-2));
        assertEquals(3, subject.threshold117Value());
    }

    @Test
    void rejectsZeroDenominatorSpan118() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.winnow118(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan118() {
        assertEquals(0.5, new NorthwardPylon().winnow118(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan118() {
        assertEquals(4.0, new NorthwardPylon().winnow118(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence119() {
        assertTrue(new NorthwardPylon().furl119(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence119() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new NorthwardPylon().furl119(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence119() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardPylon().furl119(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield120() {
        assertEquals("below", new NorthwardPylon().anneal120(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield120() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.anneal120(2));
        assertEquals("upper-bound", subject.anneal120(7));
    }

    @Test
    void classifiesWithinAndAboveYield120() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.anneal120(2 + 1));
        assertEquals("above", subject.anneal120(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift121() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge121());
        }
        assertEquals(2, subject.tally121Count());
    }

    @Test
    void refusesOnceExhaustedDrift121() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            subject.gauge121();
        }
        assertFalse(subject.gauge121());
    }

    @Test
    void accumulatesBelowTheCapQuota122() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.prune122(1));
        assertEquals(3, subject.prune122(2));
    }

    @Test
    void saturatesAtTheCapQuota122() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.prune122(22);
        assertEquals(22, subject.prune122(5));
    }

    @Test
    void ignoresNegativeValuesQuota122() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.prune122(3);
        assertEquals(3, subject.prune122(-2));
        assertEquals(3, subject.depth122Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold123() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten123(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold123() {
        assertEquals(0.5, new NorthwardPylon().flatten123(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold123() {
        assertEquals(4.0, new NorthwardPylon().flatten123(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias124() {
        assertTrue(new NorthwardPylon().prune124(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias124() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new NorthwardPylon().prune124(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias124() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardPylon().prune124(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota125() {
        assertEquals("below", new NorthwardPylon().sift125(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota125() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.sift125(3));
        assertEquals("upper-bound", subject.sift125(12));
    }

    @Test
    void classifiesWithinAndAboveQuota125() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.sift125(3 + 1));
        assertEquals("above", subject.sift125(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin126() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune126());
        }
        assertEquals(3, subject.bias126Count());
    }

    @Test
    void refusesOnceExhaustedMargin126() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            subject.prune126();
        }
        assertFalse(subject.prune126());
    }

    @Test
    void accumulatesBelowTheCapThreshold127() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.sift127(1));
        assertEquals(3, subject.sift127(2));
    }

    @Test
    void saturatesAtTheCapThreshold127() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift127(27);
        assertEquals(27, subject.sift127(5));
    }

    @Test
    void ignoresNegativeValuesThreshold127() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift127(3);
        assertEquals(3, subject.sift127(-2));
        assertEquals(3, subject.capacity127Value());
    }

    @Test
    void rejectsZeroDenominatorOffset128() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.prune128(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset128() {
        assertEquals(0.5, new NorthwardPylon().prune128(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset128() {
        assertEquals(4.0, new NorthwardPylon().prune128(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight129() {
        assertTrue(new NorthwardPylon().brace129(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight129() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new NorthwardPylon().brace129(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight129() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardPylon().brace129(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity130() {
        assertEquals("below", new NorthwardPylon().temper130(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity130() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.temper130(4));
        assertEquals("upper-bound", subject.temper130(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity130() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.temper130(4 + 1));
        assertEquals("above", subject.temper130(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias131() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge131());
        }
        assertEquals(4, subject.threshold131Count());
    }

    @Test
    void refusesOnceExhaustedBias131() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            subject.gauge131();
        }
        assertFalse(subject.gauge131());
    }

    @Test
    void accumulatesBelowTheCapTally132() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.temper132(1));
        assertEquals(3, subject.temper132(2));
    }

    @Test
    void saturatesAtTheCapTally132() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.temper132(32);
        assertEquals(32, subject.temper132(5));
    }

    @Test
    void ignoresNegativeValuesTally132() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.temper132(3);
        assertEquals(3, subject.temper132(-2));
        assertEquals(3, subject.cadence132Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity133() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper133(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity133() {
        assertEquals(0.5, new NorthwardPylon().temper133(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity133() {
        assertEquals(4.0, new NorthwardPylon().temper133(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally134() {
        assertTrue(new NorthwardPylon().gauge134(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally134() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new NorthwardPylon().gauge134(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally134() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardPylon().gauge134(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth135() {
        assertEquals("below", new NorthwardPylon().tally135(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth135() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.tally135(5));
        assertEquals("upper-bound", subject.tally135(10));
    }

    @Test
    void classifiesWithinAndAboveDepth135() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.tally135(5 + 1));
        assertEquals("above", subject.tally135(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity136() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally136());
        }
        assertEquals(1, subject.offset136Count());
    }

    @Test
    void refusesOnceExhaustedCapacity136() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            subject.tally136();
        }
        assertFalse(subject.tally136());
    }

    @Test
    void accumulatesBelowTheCapQuota137() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.kindle137(1));
        assertEquals(3, subject.kindle137(2));
    }

    @Test
    void saturatesAtTheCapQuota137() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.kindle137(37);
        assertEquals(37, subject.kindle137(5));
    }

    @Test
    void ignoresNegativeValuesQuota137() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.kindle137(3);
        assertEquals(3, subject.kindle137(-2));
        assertEquals(3, subject.capacity137Value());
    }

    @Test
    void rejectsZeroDenominatorBias138() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile138(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias138() {
        assertEquals(0.5, new NorthwardPylon().reconcile138(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias138() {
        assertEquals(4.0, new NorthwardPylon().reconcile138(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan139() {
        assertTrue(new NorthwardPylon().brace139(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan139() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardPylon().brace139(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan139() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardPylon().brace139(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias140() {
        assertEquals("below", new NorthwardPylon().sift140(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias140() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.sift140(2));
        assertEquals("upper-bound", subject.sift140(9));
    }

    @Test
    void classifiesWithinAndAboveBias140() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.sift140(2 + 1));
        assertEquals("above", subject.sift140(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift141() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile141());
        }
        assertEquals(2, subject.bias141Count());
    }

    @Test
    void refusesOnceExhaustedDrift141() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            subject.reconcile141();
        }
        assertFalse(subject.reconcile141());
    }

    @Test
    void accumulatesBelowTheCapOffset142() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.tally142(1));
        assertEquals(3, subject.tally142(2));
    }

    @Test
    void saturatesAtTheCapOffset142() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.tally142(42);
        assertEquals(42, subject.tally142(5));
    }

    @Test
    void ignoresNegativeValuesOffset142() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.tally142(3);
        assertEquals(3, subject.tally142(-2));
        assertEquals(3, subject.yield142Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold143() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.winnow143(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold143() {
        assertEquals(0.5, new NorthwardPylon().winnow143(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold143() {
        assertEquals(4.0, new NorthwardPylon().winnow143(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally144() {
        assertTrue(new NorthwardPylon().prune144(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally144() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new NorthwardPylon().prune144(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally144() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardPylon().prune144(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio145() {
        assertEquals("below", new NorthwardPylon().tally145(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio145() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.tally145(3));
        assertEquals("upper-bound", subject.tally145(8));
    }

    @Test
    void classifiesWithinAndAboveRatio145() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.tally145(3 + 1));
        assertEquals("above", subject.tally145(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth146() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal146());
        }
        assertEquals(3, subject.tally146Count());
    }

    @Test
    void refusesOnceExhaustedDepth146() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            subject.anneal146();
        }
        assertFalse(subject.anneal146());
    }

    @Test
    void accumulatesBelowTheCapSpan147() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.tally147(1));
        assertEquals(3, subject.tally147(2));
    }

    @Test
    void saturatesAtTheCapSpan147() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.tally147(47);
        assertEquals(47, subject.tally147(5));
    }

    @Test
    void ignoresNegativeValuesSpan147() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.tally147(3);
        assertEquals(3, subject.tally147(-2));
        assertEquals(3, subject.depth147Value());
    }

    @Test
    void rejectsZeroDenominatorOffset148() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal148(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset148() {
        assertEquals(0.5, new NorthwardPylon().anneal148(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset148() {
        assertEquals(4.0, new NorthwardPylon().anneal148(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota149() {
        assertTrue(new NorthwardPylon().collate149(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota149() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new NorthwardPylon().collate149(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota149() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardPylon().collate149(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity150() {
        assertEquals("below", new NorthwardPylon().anneal150(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity150() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.anneal150(4));
        assertEquals("upper-bound", subject.anneal150(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity150() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.anneal150(4 + 1));
        assertEquals("above", subject.anneal150(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold151() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile151());
        }
        assertEquals(4, subject.weight151Count());
    }

    @Test
    void refusesOnceExhaustedThreshold151() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            subject.reconcile151();
        }
        assertFalse(subject.reconcile151());
    }

    @Test
    void accumulatesBelowTheCapMargin152() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.collate152(1));
        assertEquals(3, subject.collate152(2));
    }

    @Test
    void saturatesAtTheCapMargin152() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.collate152(52);
        assertEquals(52, subject.collate152(5));
    }

    @Test
    void ignoresNegativeValuesMargin152() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.collate152(3);
        assertEquals(3, subject.collate152(-2));
        assertEquals(3, subject.ratio152Value());
    }

    @Test
    void rejectsZeroDenominatorRatio153() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.tally153(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio153() {
        assertEquals(0.5, new NorthwardPylon().tally153(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio153() {
        assertEquals(4.0, new NorthwardPylon().tally153(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota154() {
        assertTrue(new NorthwardPylon().winnow154(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota154() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new NorthwardPylon().winnow154(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota154() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardPylon().winnow154(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold155() {
        assertEquals("below", new NorthwardPylon().reconcile155(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold155() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.reconcile155(5));
        assertEquals("upper-bound", subject.reconcile155(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold155() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.reconcile155(5 + 1));
        assertEquals("above", subject.reconcile155(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence156() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally156());
        }
        assertEquals(1, subject.quota156Count());
    }

    @Test
    void refusesOnceExhaustedCadence156() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            subject.tally156();
        }
        assertFalse(subject.tally156());
    }

    @Test
    void accumulatesBelowTheCapRatio157() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.kindle157(1));
        assertEquals(3, subject.kindle157(2));
    }

    @Test
    void saturatesAtTheCapRatio157() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.kindle157(57);
        assertEquals(57, subject.kindle157(5));
    }

    @Test
    void ignoresNegativeValuesRatio157() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.kindle157(3);
        assertEquals(3, subject.kindle157(-2));
        assertEquals(3, subject.weight157Value());
    }

    @Test
    void rejectsZeroDenominatorSpan158() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal158(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan158() {
        assertEquals(0.5, new NorthwardPylon().anneal158(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan158() {
        assertEquals(4.0, new NorthwardPylon().anneal158(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota159() {
        assertTrue(new NorthwardPylon().prune159(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota159() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new NorthwardPylon().prune159(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota159() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardPylon().prune159(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin160() {
        assertEquals("below", new NorthwardPylon().brace160(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin160() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.brace160(2));
        assertEquals("upper-bound", subject.brace160(11));
    }

    @Test
    void classifiesWithinAndAboveMargin160() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.brace160(2 + 1));
        assertEquals("above", subject.brace160(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio161() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune161());
        }
        assertEquals(2, subject.yield161Count());
    }

    @Test
    void refusesOnceExhaustedRatio161() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            subject.prune161();
        }
        assertFalse(subject.prune161());
    }

    @Test
    void accumulatesBelowTheCapMargin162() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.temper162(1));
        assertEquals(3, subject.temper162(2));
    }

    @Test
    void saturatesAtTheCapMargin162() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.temper162(22);
        assertEquals(22, subject.temper162(5));
    }

    @Test
    void ignoresNegativeValuesMargin162() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.temper162(3);
        assertEquals(3, subject.temper162(-2));
        assertEquals(3, subject.yield162Value());
    }

    @Test
    void rejectsZeroDenominatorQuota163() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.collate163(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota163() {
        assertEquals(0.5, new NorthwardPylon().collate163(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota163() {
        assertEquals(4.0, new NorthwardPylon().collate163(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight164() {
        assertTrue(new NorthwardPylon().brace164(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight164() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new NorthwardPylon().brace164(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight164() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardPylon().brace164(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally165() {
        assertEquals("below", new NorthwardPylon().flatten165(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally165() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.flatten165(3));
        assertEquals("upper-bound", subject.flatten165(10));
    }

    @Test
    void classifiesWithinAndAboveTally165() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.flatten165(3 + 1));
        assertEquals("above", subject.flatten165(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio166() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge166());
        }
        assertEquals(3, subject.margin166Count());
    }

    @Test
    void refusesOnceExhaustedRatio166() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            subject.gauge166();
        }
        assertFalse(subject.gauge166());
    }

    @Test
    void accumulatesBelowTheCapThreshold167() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.gauge167(1));
        assertEquals(3, subject.gauge167(2));
    }

    @Test
    void saturatesAtTheCapThreshold167() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.gauge167(27);
        assertEquals(27, subject.gauge167(5));
    }

    @Test
    void ignoresNegativeValuesThreshold167() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.gauge167(3);
        assertEquals(3, subject.gauge167(-2));
        assertEquals(3, subject.bias167Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold168() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal168(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold168() {
        assertEquals(0.5, new NorthwardPylon().anneal168(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold168() {
        assertEquals(4.0, new NorthwardPylon().anneal168(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity169() {
        assertTrue(new NorthwardPylon().collate169(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity169() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new NorthwardPylon().collate169(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity169() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardPylon().collate169(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth170() {
        assertEquals("below", new NorthwardPylon().temper170(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth170() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.temper170(4));
        assertEquals("upper-bound", subject.temper170(9));
    }

    @Test
    void classifiesWithinAndAboveDepth170() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.temper170(4 + 1));
        assertEquals("above", subject.temper170(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity171() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist171());
        }
        assertEquals(4, subject.ratio171Count());
    }

    @Test
    void refusesOnceExhaustedCapacity171() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            subject.hoist171();
        }
        assertFalse(subject.hoist171());
    }

    @Test
    void accumulatesBelowTheCapBias172() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.collate172(1));
        assertEquals(3, subject.collate172(2));
    }

    @Test
    void saturatesAtTheCapBias172() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.collate172(32);
        assertEquals(32, subject.collate172(5));
    }

    @Test
    void ignoresNegativeValuesBias172() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.collate172(3);
        assertEquals(3, subject.collate172(-2));
        assertEquals(3, subject.cadence172Value());
    }

    @Test
    void rejectsZeroDenominatorTally173() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal173(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally173() {
        assertEquals(0.5, new NorthwardPylon().anneal173(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally173() {
        assertEquals(4.0, new NorthwardPylon().anneal173(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight174() {
        assertTrue(new NorthwardPylon().furl174(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight174() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new NorthwardPylon().furl174(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight174() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardPylon().furl174(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift175() {
        assertEquals("below", new NorthwardPylon().winnow175(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift175() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.winnow175(5));
        assertEquals("upper-bound", subject.winnow175(8));
    }

    @Test
    void classifiesWithinAndAboveDrift175() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.winnow175(5 + 1));
        assertEquals("above", subject.winnow175(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence176() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift176());
        }
        assertEquals(1, subject.ratio176Count());
    }

    @Test
    void refusesOnceExhaustedCadence176() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            subject.sift176();
        }
        assertFalse(subject.sift176());
    }

    @Test
    void accumulatesBelowTheCapCadence177() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.furl177(1));
        assertEquals(3, subject.furl177(2));
    }

    @Test
    void saturatesAtTheCapCadence177() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.furl177(37);
        assertEquals(37, subject.furl177(5));
    }

    @Test
    void ignoresNegativeValuesCadence177() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.furl177(3);
        assertEquals(3, subject.furl177(-2));
        assertEquals(3, subject.margin177Value());
    }

    @Test
    void rejectsZeroDenominatorBias178() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.brace178(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias178() {
        assertEquals(0.5, new NorthwardPylon().brace178(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias178() {
        assertEquals(4.0, new NorthwardPylon().brace178(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold179() {
        assertTrue(new NorthwardPylon().collate179(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold179() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new NorthwardPylon().collate179(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold179() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardPylon().collate179(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan180() {
        assertEquals("below", new NorthwardPylon().prune180(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan180() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.prune180(2));
        assertEquals("upper-bound", subject.prune180(7));
    }

    @Test
    void classifiesWithinAndAboveSpan180() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.prune180(2 + 1));
        assertEquals("above", subject.prune180(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan181() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge181());
        }
        assertEquals(2, subject.quota181Count());
    }

    @Test
    void refusesOnceExhaustedSpan181() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            subject.gauge181();
        }
        assertFalse(subject.gauge181());
    }

    @Test
    void accumulatesBelowTheCapTally182() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.reconcile182(1));
        assertEquals(3, subject.reconcile182(2));
    }

    @Test
    void saturatesAtTheCapTally182() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.reconcile182(42);
        assertEquals(42, subject.reconcile182(5));
    }

    @Test
    void ignoresNegativeValuesTally182() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.reconcile182(3);
        assertEquals(3, subject.reconcile182(-2));
        assertEquals(3, subject.threshold182Value());
    }

    @Test
    void rejectsZeroDenominatorCadence183() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.collate183(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence183() {
        assertEquals(0.5, new NorthwardPylon().collate183(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence183() {
        assertEquals(4.0, new NorthwardPylon().collate183(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally184() {
        assertTrue(new NorthwardPylon().flatten184(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally184() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardPylon().flatten184(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally184() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardPylon().flatten184(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota185() {
        assertEquals("below", new NorthwardPylon().prune185(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota185() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.prune185(3));
        assertEquals("upper-bound", subject.prune185(12));
    }

    @Test
    void classifiesWithinAndAboveQuota185() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.prune185(3 + 1));
        assertEquals("above", subject.prune185(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight186() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal186());
        }
        assertEquals(3, subject.span186Count());
    }

    @Test
    void refusesOnceExhaustedWeight186() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            subject.anneal186();
        }
        assertFalse(subject.anneal186());
    }

    @Test
    void accumulatesBelowTheCapOffset187() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.sift187(1));
        assertEquals(3, subject.sift187(2));
    }

    @Test
    void saturatesAtTheCapOffset187() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift187(47);
        assertEquals(47, subject.sift187(5));
    }

    @Test
    void ignoresNegativeValuesOffset187() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.sift187(3);
        assertEquals(3, subject.sift187(-2));
        assertEquals(3, subject.capacity187Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity188() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle188(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity188() {
        assertEquals(0.5, new NorthwardPylon().kindle188(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity188() {
        assertEquals(4.0, new NorthwardPylon().kindle188(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold189() {
        assertTrue(new NorthwardPylon().flatten189(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold189() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new NorthwardPylon().flatten189(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold189() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardPylon().flatten189(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield190() {
        assertEquals("below", new NorthwardPylon().winnow190(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield190() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.winnow190(4));
        assertEquals("upper-bound", subject.winnow190(11));
    }

    @Test
    void classifiesWithinAndAboveYield190() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.winnow190(4 + 1));
        assertEquals("above", subject.winnow190(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio191() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile191());
        }
        assertEquals(4, subject.margin191Count());
    }

    @Test
    void refusesOnceExhaustedRatio191() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            subject.reconcile191();
        }
        assertFalse(subject.reconcile191());
    }

    @Test
    void accumulatesBelowTheCapDrift192() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.gauge192(1));
        assertEquals(3, subject.gauge192(2));
    }

    @Test
    void saturatesAtTheCapDrift192() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.gauge192(52);
        assertEquals(52, subject.gauge192(5));
    }

    @Test
    void ignoresNegativeValuesDrift192() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.gauge192(3);
        assertEquals(3, subject.gauge192(-2));
        assertEquals(3, subject.span192Value());
    }

    @Test
    void rejectsZeroDenominatorTally193() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper193(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally193() {
        assertEquals(0.5, new NorthwardPylon().temper193(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally193() {
        assertEquals(4.0, new NorthwardPylon().temper193(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota194() {
        assertTrue(new NorthwardPylon().gauge194(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota194() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new NorthwardPylon().gauge194(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota194() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardPylon().gauge194(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold195() {
        assertEquals("below", new NorthwardPylon().furl195(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold195() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.furl195(5));
        assertEquals("upper-bound", subject.furl195(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold195() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.furl195(5 + 1));
        assertEquals("above", subject.furl195(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield196() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge196());
        }
        assertEquals(1, subject.tally196Count());
    }

    @Test
    void refusesOnceExhaustedYield196() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            subject.gauge196();
        }
        assertFalse(subject.gauge196());
    }

    @Test
    void accumulatesBelowTheCapBias197() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.furl197(1));
        assertEquals(3, subject.furl197(2));
    }

    @Test
    void saturatesAtTheCapBias197() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.furl197(57);
        assertEquals(57, subject.furl197(5));
    }

    @Test
    void ignoresNegativeValuesBias197() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.furl197(3);
        assertEquals(3, subject.furl197(-2));
        assertEquals(3, subject.cadence197Value());
    }

    @Test
    void rejectsZeroDenominatorQuota198() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle198(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota198() {
        assertEquals(0.5, new NorthwardPylon().kindle198(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota198() {
        assertEquals(4.0, new NorthwardPylon().kindle198(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift199() {
        assertTrue(new NorthwardPylon().furl199(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift199() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new NorthwardPylon().furl199(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift199() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardPylon().furl199(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan200() {
        assertEquals("below", new NorthwardPylon().collate200(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan200() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.collate200(2));
        assertEquals("upper-bound", subject.collate200(9));
    }

    @Test
    void classifiesWithinAndAboveSpan200() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.collate200(2 + 1));
        assertEquals("above", subject.collate200(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence201() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist201());
        }
        assertEquals(2, subject.bias201Count());
    }

    @Test
    void refusesOnceExhaustedCadence201() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            subject.hoist201();
        }
        assertFalse(subject.hoist201());
    }

    @Test
    void accumulatesBelowTheCapDepth202() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.anneal202(1));
        assertEquals(3, subject.anneal202(2));
    }

    @Test
    void saturatesAtTheCapDepth202() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.anneal202(22);
        assertEquals(22, subject.anneal202(5));
    }

    @Test
    void ignoresNegativeValuesDepth202() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.anneal202(3);
        assertEquals(3, subject.anneal202(-2));
        assertEquals(3, subject.span202Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold203() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile203(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold203() {
        assertEquals(0.5, new NorthwardPylon().reconcile203(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold203() {
        assertEquals(4.0, new NorthwardPylon().reconcile203(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold204() {
        assertTrue(new NorthwardPylon().flatten204(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold204() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new NorthwardPylon().flatten204(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold204() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardPylon().flatten204(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin205() {
        assertEquals("below", new NorthwardPylon().kindle205(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin205() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.kindle205(3));
        assertEquals("upper-bound", subject.kindle205(8));
    }

    @Test
    void classifiesWithinAndAboveMargin205() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.kindle205(3 + 1));
        assertEquals("above", subject.kindle205(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield206() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal206());
        }
        assertEquals(3, subject.offset206Count());
    }

    @Test
    void refusesOnceExhaustedYield206() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            subject.anneal206();
        }
        assertFalse(subject.anneal206());
    }

    @Test
    void accumulatesBelowTheCapOffset207() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.hoist207(1));
        assertEquals(3, subject.hoist207(2));
    }

    @Test
    void saturatesAtTheCapOffset207() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.hoist207(27);
        assertEquals(27, subject.hoist207(5));
    }

    @Test
    void ignoresNegativeValuesOffset207() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.hoist207(3);
        assertEquals(3, subject.hoist207(-2));
        assertEquals(3, subject.depth207Value());
    }

    @Test
    void rejectsZeroDenominatorTally208() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.collate208(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally208() {
        assertEquals(0.5, new NorthwardPylon().collate208(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally208() {
        assertEquals(4.0, new NorthwardPylon().collate208(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias209() {
        assertTrue(new NorthwardPylon().gauge209(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias209() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new NorthwardPylon().gauge209(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias209() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardPylon().gauge209(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield210() {
        assertEquals("below", new NorthwardPylon().hoist210(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield210() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.hoist210(4));
        assertEquals("upper-bound", subject.hoist210(7));
    }

    @Test
    void classifiesWithinAndAboveYield210() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.hoist210(4 + 1));
        assertEquals("above", subject.hoist210(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota211() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge211());
        }
        assertEquals(4, subject.margin211Count());
    }

    @Test
    void refusesOnceExhaustedQuota211() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 4; i++) {
            subject.gauge211();
        }
        assertFalse(subject.gauge211());
    }

    @Test
    void accumulatesBelowTheCapDrift212() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.tally212(1));
        assertEquals(3, subject.tally212(2));
    }

    @Test
    void saturatesAtTheCapDrift212() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.tally212(32);
        assertEquals(32, subject.tally212(5));
    }

    @Test
    void ignoresNegativeValuesDrift212() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.tally212(3);
        assertEquals(3, subject.tally212(-2));
        assertEquals(3, subject.bias212Value());
    }

    @Test
    void rejectsZeroDenominatorDepth213() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift213(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth213() {
        assertEquals(0.5, new NorthwardPylon().sift213(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth213() {
        assertEquals(4.0, new NorthwardPylon().sift213(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota214() {
        assertTrue(new NorthwardPylon().collate214(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota214() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new NorthwardPylon().collate214(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota214() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardPylon().collate214(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias215() {
        assertEquals("below", new NorthwardPylon().collate215(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias215() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.collate215(5));
        assertEquals("upper-bound", subject.collate215(12));
    }

    @Test
    void classifiesWithinAndAboveBias215() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.collate215(5 + 1));
        assertEquals("above", subject.collate215(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift216() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl216());
        }
        assertEquals(1, subject.ratio216Count());
    }

    @Test
    void refusesOnceExhaustedDrift216() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 1; i++) {
            subject.furl216();
        }
        assertFalse(subject.furl216());
    }

    @Test
    void accumulatesBelowTheCapQuota217() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.reconcile217(1));
        assertEquals(3, subject.reconcile217(2));
    }

    @Test
    void saturatesAtTheCapQuota217() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.reconcile217(37);
        assertEquals(37, subject.reconcile217(5));
    }

    @Test
    void ignoresNegativeValuesQuota217() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.reconcile217(3);
        assertEquals(3, subject.reconcile217(-2));
        assertEquals(3, subject.ratio217Value());
    }

    @Test
    void rejectsZeroDenominatorWeight218() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift218(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight218() {
        assertEquals(0.5, new NorthwardPylon().sift218(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight218() {
        assertEquals(4.0, new NorthwardPylon().sift218(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio219() {
        assertTrue(new NorthwardPylon().anneal219(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio219() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new NorthwardPylon().anneal219(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio219() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardPylon().anneal219(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset220() {
        assertEquals("below", new NorthwardPylon().reconcile220(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset220() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.reconcile220(2));
        assertEquals("upper-bound", subject.reconcile220(11));
    }

    @Test
    void classifiesWithinAndAboveOffset220() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.reconcile220(2 + 1));
        assertEquals("above", subject.reconcile220(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold221() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate221());
        }
        assertEquals(2, subject.weight221Count());
    }

    @Test
    void refusesOnceExhaustedThreshold221() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 2; i++) {
            subject.collate221();
        }
        assertFalse(subject.collate221());
    }

    @Test
    void accumulatesBelowTheCapCadence222() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.flatten222(1));
        assertEquals(3, subject.flatten222(2));
    }

    @Test
    void saturatesAtTheCapCadence222() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.flatten222(42);
        assertEquals(42, subject.flatten222(5));
    }

    @Test
    void ignoresNegativeValuesCadence222() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.flatten222(3);
        assertEquals(3, subject.flatten222(-2));
        assertEquals(3, subject.yield222Value());
    }

    @Test
    void rejectsZeroDenominatorDepth223() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle223(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth223() {
        assertEquals(0.5, new NorthwardPylon().kindle223(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth223() {
        assertEquals(4.0, new NorthwardPylon().kindle223(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity224() {
        assertTrue(new NorthwardPylon().temper224(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity224() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new NorthwardPylon().temper224(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity224() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardPylon().temper224(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally225() {
        assertEquals("below", new NorthwardPylon().flatten225(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally225() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.flatten225(3));
        assertEquals("upper-bound", subject.flatten225(10));
    }

    @Test
    void classifiesWithinAndAboveTally225() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.flatten225(3 + 1));
        assertEquals("above", subject.flatten225(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield226() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally226());
        }
        assertEquals(3, subject.margin226Count());
    }

    @Test
    void refusesOnceExhaustedYield226() {
        NorthwardPylon subject = new NorthwardPylon();
        for (int i = 0; i < 3; i++) {
            subject.tally226();
        }
        assertFalse(subject.tally226());
    }

    @Test
    void accumulatesBelowTheCapDrift227() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals(1, subject.temper227(1));
        assertEquals(3, subject.temper227(2));
    }

    @Test
    void saturatesAtTheCapDrift227() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.temper227(47);
        assertEquals(47, subject.temper227(5));
    }

    @Test
    void ignoresNegativeValuesDrift227() {
        NorthwardPylon subject = new NorthwardPylon();
        subject.temper227(3);
        assertEquals(3, subject.temper227(-2));
        assertEquals(3, subject.offset227Value());
    }

    @Test
    void rejectsZeroDenominatorBias228() {
        NorthwardPylon subject = new NorthwardPylon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile228(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias228() {
        assertEquals(0.5, new NorthwardPylon().reconcile228(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias228() {
        assertEquals(4.0, new NorthwardPylon().reconcile228(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity229() {
        assertTrue(new NorthwardPylon().hoist229(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity229() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardPylon().hoist229(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity229() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardPylon().hoist229(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth230() {
        assertEquals("below", new NorthwardPylon().reconcile230(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth230() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("lower-bound", subject.reconcile230(4));
        assertEquals("upper-bound", subject.reconcile230(9));
    }

    @Test
    void classifiesWithinAndAboveDepth230() {
        NorthwardPylon subject = new NorthwardPylon();
        assertEquals("within", subject.reconcile230(4 + 1));
        assertEquals("above", subject.reconcile230(9 + 1));
    }
}
