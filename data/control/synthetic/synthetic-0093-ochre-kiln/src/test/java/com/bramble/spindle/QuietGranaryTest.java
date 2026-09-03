package com.bramble.spindle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietGranaryTest {

    @Test
    void classifiesBelowTheLowerBoundBias0() {
        assertEquals("below", new QuietGranary().collate0(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias0() {
        QuietGranary subject = new QuietGranary();
        assertEquals("lower-bound", subject.collate0(2));
        assertEquals("upper-bound", subject.collate0(7));
    }

    @Test
    void classifiesWithinAndAboveBias0() {
        QuietGranary subject = new QuietGranary();
        assertEquals("within", subject.collate0(2 + 1));
        assertEquals("above", subject.collate0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift1() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal1());
        }
        assertEquals(2, subject.depth1Count());
    }

    @Test
    void refusesOnceExhaustedDrift1() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 2; i++) {
            subject.anneal1();
        }
        assertFalse(subject.anneal1());
    }

    @Test
    void accumulatesBelowTheCapBias2() {
        QuietGranary subject = new QuietGranary();
        assertEquals(1, subject.anneal2(1));
        assertEquals(3, subject.anneal2(2));
    }

    @Test
    void saturatesAtTheCapBias2() {
        QuietGranary subject = new QuietGranary();
        subject.anneal2(22);
        assertEquals(22, subject.anneal2(5));
    }

    @Test
    void ignoresNegativeValuesBias2() {
        QuietGranary subject = new QuietGranary();
        subject.anneal2(3);
        assertEquals(3, subject.anneal2(-2));
        assertEquals(3, subject.weight2Value());
    }

    @Test
    void rejectsZeroDenominatorYield3() {
        QuietGranary subject = new QuietGranary();
        assertThrows(ArithmeticException.class, () -> subject.temper3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield3() {
        assertEquals(0.5, new QuietGranary().temper3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield3() {
        assertEquals(4.0, new QuietGranary().temper3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota4() {
        assertTrue(new QuietGranary().brace4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new QuietGranary().brace4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota4() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietGranary().brace4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin5() {
        assertEquals("below", new QuietGranary().temper5(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin5() {
        QuietGranary subject = new QuietGranary();
        assertEquals("lower-bound", subject.temper5(3));
        assertEquals("upper-bound", subject.temper5(12));
    }

    @Test
    void classifiesWithinAndAboveMargin5() {
        QuietGranary subject = new QuietGranary();
        assertEquals("within", subject.temper5(3 + 1));
        assertEquals("above", subject.temper5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity6() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist6());
        }
        assertEquals(3, subject.margin6Count());
    }

    @Test
    void refusesOnceExhaustedCapacity6() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 3; i++) {
            subject.hoist6();
        }
        assertFalse(subject.hoist6());
    }

    @Test
    void accumulatesBelowTheCapQuota7() {
        QuietGranary subject = new QuietGranary();
        assertEquals(1, subject.winnow7(1));
        assertEquals(3, subject.winnow7(2));
    }

    @Test
    void saturatesAtTheCapQuota7() {
        QuietGranary subject = new QuietGranary();
        subject.winnow7(27);
        assertEquals(27, subject.winnow7(5));
    }

    @Test
    void ignoresNegativeValuesQuota7() {
        QuietGranary subject = new QuietGranary();
        subject.winnow7(3);
        assertEquals(3, subject.winnow7(-2));
        assertEquals(3, subject.weight7Value());
    }

    @Test
    void rejectsZeroDenominatorMargin8() {
        QuietGranary subject = new QuietGranary();
        assertThrows(ArithmeticException.class, () -> subject.furl8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin8() {
        assertEquals(0.5, new QuietGranary().furl8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin8() {
        assertEquals(4.0, new QuietGranary().furl8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally9() {
        assertTrue(new QuietGranary().kindle9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new QuietGranary().kindle9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally9() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietGranary().kindle9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence10() {
        assertEquals("below", new QuietGranary().hoist10(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence10() {
        QuietGranary subject = new QuietGranary();
        assertEquals("lower-bound", subject.hoist10(4));
        assertEquals("upper-bound", subject.hoist10(11));
    }

    @Test
    void classifiesWithinAndAboveCadence10() {
        QuietGranary subject = new QuietGranary();
        assertEquals("within", subject.hoist10(4 + 1));
        assertEquals("above", subject.hoist10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally11() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile11());
        }
        assertEquals(4, subject.yield11Count());
    }

    @Test
    void refusesOnceExhaustedTally11() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 4; i++) {
            subject.reconcile11();
        }
        assertFalse(subject.reconcile11());
    }

    @Test
    void accumulatesBelowTheCapCapacity12() {
        QuietGranary subject = new QuietGranary();
        assertEquals(1, subject.hoist12(1));
        assertEquals(3, subject.hoist12(2));
    }

    @Test
    void saturatesAtTheCapCapacity12() {
        QuietGranary subject = new QuietGranary();
        subject.hoist12(32);
        assertEquals(32, subject.hoist12(5));
    }

    @Test
    void ignoresNegativeValuesCapacity12() {
        QuietGranary subject = new QuietGranary();
        subject.hoist12(3);
        assertEquals(3, subject.hoist12(-2));
        assertEquals(3, subject.yield12Value());
    }

    @Test
    void rejectsZeroDenominatorSpan13() {
        QuietGranary subject = new QuietGranary();
        assertThrows(ArithmeticException.class, () -> subject.collate13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan13() {
        assertEquals(0.5, new QuietGranary().collate13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan13() {
        assertEquals(4.0, new QuietGranary().collate13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota14() {
        assertTrue(new QuietGranary().brace14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new QuietGranary().brace14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota14() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietGranary().brace14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally15() {
        assertEquals("below", new QuietGranary().anneal15(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally15() {
        QuietGranary subject = new QuietGranary();
        assertEquals("lower-bound", subject.anneal15(5));
        assertEquals("upper-bound", subject.anneal15(10));
    }

    @Test
    void classifiesWithinAndAboveTally15() {
        QuietGranary subject = new QuietGranary();
        assertEquals("within", subject.anneal15(5 + 1));
        assertEquals("above", subject.anneal15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight16() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow16());
        }
        assertEquals(1, subject.yield16Count());
    }

    @Test
    void refusesOnceExhaustedWeight16() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 1; i++) {
            subject.winnow16();
        }
        assertFalse(subject.winnow16());
    }

    @Test
    void accumulatesBelowTheCapBias17() {
        QuietGranary subject = new QuietGranary();
        assertEquals(1, subject.anneal17(1));
        assertEquals(3, subject.anneal17(2));
    }

    @Test
    void saturatesAtTheCapBias17() {
        QuietGranary subject = new QuietGranary();
        subject.anneal17(37);
        assertEquals(37, subject.anneal17(5));
    }

    @Test
    void ignoresNegativeValuesBias17() {
        QuietGranary subject = new QuietGranary();
        subject.anneal17(3);
        assertEquals(3, subject.anneal17(-2));
        assertEquals(3, subject.threshold17Value());
    }

    @Test
    void rejectsZeroDenominatorSpan18() {
        QuietGranary subject = new QuietGranary();
        assertThrows(ArithmeticException.class, () -> subject.winnow18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan18() {
        assertEquals(0.5, new QuietGranary().winnow18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan18() {
        assertEquals(4.0, new QuietGranary().winnow18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally19() {
        assertTrue(new QuietGranary().prune19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new QuietGranary().prune19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally19() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietGranary().prune19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias20() {
        assertEquals("below", new QuietGranary().winnow20(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias20() {
        QuietGranary subject = new QuietGranary();
        assertEquals("lower-bound", subject.winnow20(2));
        assertEquals("upper-bound", subject.winnow20(9));
    }

    @Test
    void classifiesWithinAndAboveBias20() {
        QuietGranary subject = new QuietGranary();
        assertEquals("within", subject.winnow20(2 + 1));
        assertEquals("above", subject.winnow20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally21() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile21());
        }
        assertEquals(2, subject.cadence21Count());
    }

    @Test
    void refusesOnceExhaustedTally21() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 2; i++) {
            subject.reconcile21();
        }
        assertFalse(subject.reconcile21());
    }

    @Test
    void accumulatesBelowTheCapThreshold22() {
        QuietGranary subject = new QuietGranary();
        assertEquals(1, subject.furl22(1));
        assertEquals(3, subject.furl22(2));
    }

    @Test
    void saturatesAtTheCapThreshold22() {
        QuietGranary subject = new QuietGranary();
        subject.furl22(42);
        assertEquals(42, subject.furl22(5));
    }

    @Test
    void ignoresNegativeValuesThreshold22() {
        QuietGranary subject = new QuietGranary();
        subject.furl22(3);
        assertEquals(3, subject.furl22(-2));
        assertEquals(3, subject.depth22Value());
    }

    @Test
    void rejectsZeroDenominatorRatio23() {
        QuietGranary subject = new QuietGranary();
        assertThrows(ArithmeticException.class, () -> subject.hoist23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio23() {
        assertEquals(0.5, new QuietGranary().hoist23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio23() {
        assertEquals(4.0, new QuietGranary().hoist23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift24() {
        assertTrue(new QuietGranary().sift24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new QuietGranary().sift24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift24() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietGranary().sift24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio25() {
        assertEquals("below", new QuietGranary().temper25(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio25() {
        QuietGranary subject = new QuietGranary();
        assertEquals("lower-bound", subject.temper25(3));
        assertEquals("upper-bound", subject.temper25(8));
    }

    @Test
    void classifiesWithinAndAboveRatio25() {
        QuietGranary subject = new QuietGranary();
        assertEquals("within", subject.temper25(3 + 1));
        assertEquals("above", subject.temper25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota26() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally26());
        }
        assertEquals(3, subject.drift26Count());
    }

    @Test
    void refusesOnceExhaustedQuota26() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 3; i++) {
            subject.tally26();
        }
        assertFalse(subject.tally26());
    }

    @Test
    void accumulatesBelowTheCapOffset27() {
        QuietGranary subject = new QuietGranary();
        assertEquals(1, subject.anneal27(1));
        assertEquals(3, subject.anneal27(2));
    }

    @Test
    void saturatesAtTheCapOffset27() {
        QuietGranary subject = new QuietGranary();
        subject.anneal27(47);
        assertEquals(47, subject.anneal27(5));
    }

    @Test
    void ignoresNegativeValuesOffset27() {
        QuietGranary subject = new QuietGranary();
        subject.anneal27(3);
        assertEquals(3, subject.anneal27(-2));
        assertEquals(3, subject.quota27Value());
    }

    @Test
    void rejectsZeroDenominatorBias28() {
        QuietGranary subject = new QuietGranary();
        assertThrows(ArithmeticException.class, () -> subject.winnow28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias28() {
        assertEquals(0.5, new QuietGranary().winnow28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias28() {
        assertEquals(4.0, new QuietGranary().winnow28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence29() {
        assertTrue(new QuietGranary().collate29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new QuietGranary().collate29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence29() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietGranary().collate29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold30() {
        assertEquals("below", new QuietGranary().gauge30(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold30() {
        QuietGranary subject = new QuietGranary();
        assertEquals("lower-bound", subject.gauge30(4));
        assertEquals("upper-bound", subject.gauge30(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold30() {
        QuietGranary subject = new QuietGranary();
        assertEquals("within", subject.gauge30(4 + 1));
        assertEquals("above", subject.gauge30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity31() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate31());
        }
        assertEquals(4, subject.span31Count());
    }

    @Test
    void refusesOnceExhaustedCapacity31() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 4; i++) {
            subject.collate31();
        }
        assertFalse(subject.collate31());
    }

    @Test
    void accumulatesBelowTheCapCadence32() {
        QuietGranary subject = new QuietGranary();
        assertEquals(1, subject.prune32(1));
        assertEquals(3, subject.prune32(2));
    }

    @Test
    void saturatesAtTheCapCadence32() {
        QuietGranary subject = new QuietGranary();
        subject.prune32(52);
        assertEquals(52, subject.prune32(5));
    }

    @Test
    void ignoresNegativeValuesCadence32() {
        QuietGranary subject = new QuietGranary();
        subject.prune32(3);
        assertEquals(3, subject.prune32(-2));
        assertEquals(3, subject.capacity32Value());
    }

    @Test
    void rejectsZeroDenominatorSpan33() {
        QuietGranary subject = new QuietGranary();
        assertThrows(ArithmeticException.class, () -> subject.prune33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan33() {
        assertEquals(0.5, new QuietGranary().prune33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan33() {
        assertEquals(4.0, new QuietGranary().prune33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth34() {
        assertTrue(new QuietGranary().flatten34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new QuietGranary().flatten34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth34() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietGranary().flatten34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity35() {
        assertEquals("below", new QuietGranary().sift35(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity35() {
        QuietGranary subject = new QuietGranary();
        assertEquals("lower-bound", subject.sift35(5));
        assertEquals("upper-bound", subject.sift35(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity35() {
        QuietGranary subject = new QuietGranary();
        assertEquals("within", subject.sift35(5 + 1));
        assertEquals("above", subject.sift35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset36() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl36());
        }
        assertEquals(1, subject.capacity36Count());
    }

    @Test
    void refusesOnceExhaustedOffset36() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 1; i++) {
            subject.furl36();
        }
        assertFalse(subject.furl36());
    }

    @Test
    void accumulatesBelowTheCapWeight37() {
        QuietGranary subject = new QuietGranary();
        assertEquals(1, subject.reconcile37(1));
        assertEquals(3, subject.reconcile37(2));
    }

    @Test
    void saturatesAtTheCapWeight37() {
        QuietGranary subject = new QuietGranary();
        subject.reconcile37(57);
        assertEquals(57, subject.reconcile37(5));
    }

    @Test
    void ignoresNegativeValuesWeight37() {
        QuietGranary subject = new QuietGranary();
        subject.reconcile37(3);
        assertEquals(3, subject.reconcile37(-2));
        assertEquals(3, subject.threshold37Value());
    }

    @Test
    void rejectsZeroDenominatorBias38() {
        QuietGranary subject = new QuietGranary();
        assertThrows(ArithmeticException.class, () -> subject.flatten38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias38() {
        assertEquals(0.5, new QuietGranary().flatten38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias38() {
        assertEquals(4.0, new QuietGranary().flatten38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota39() {
        assertTrue(new QuietGranary().flatten39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new QuietGranary().flatten39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota39() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietGranary().flatten39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence40() {
        assertEquals("below", new QuietGranary().flatten40(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence40() {
        QuietGranary subject = new QuietGranary();
        assertEquals("lower-bound", subject.flatten40(2));
        assertEquals("upper-bound", subject.flatten40(11));
    }

    @Test
    void classifiesWithinAndAboveCadence40() {
        QuietGranary subject = new QuietGranary();
        assertEquals("within", subject.flatten40(2 + 1));
        assertEquals("above", subject.flatten40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias41() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl41());
        }
        assertEquals(2, subject.tally41Count());
    }

    @Test
    void refusesOnceExhaustedBias41() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 2; i++) {
            subject.furl41();
        }
        assertFalse(subject.furl41());
    }

    @Test
    void accumulatesBelowTheCapCapacity42() {
        QuietGranary subject = new QuietGranary();
        assertEquals(1, subject.tally42(1));
        assertEquals(3, subject.tally42(2));
    }

    @Test
    void saturatesAtTheCapCapacity42() {
        QuietGranary subject = new QuietGranary();
        subject.tally42(22);
        assertEquals(22, subject.tally42(5));
    }

    @Test
    void ignoresNegativeValuesCapacity42() {
        QuietGranary subject = new QuietGranary();
        subject.tally42(3);
        assertEquals(3, subject.tally42(-2));
        assertEquals(3, subject.yield42Value());
    }

    @Test
    void rejectsZeroDenominatorRatio43() {
        QuietGranary subject = new QuietGranary();
        assertThrows(ArithmeticException.class, () -> subject.hoist43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio43() {
        assertEquals(0.5, new QuietGranary().hoist43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio43() {
        assertEquals(4.0, new QuietGranary().hoist43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio44() {
        assertTrue(new QuietGranary().brace44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new QuietGranary().brace44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio44() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietGranary().brace44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio45() {
        assertEquals("below", new QuietGranary().kindle45(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio45() {
        QuietGranary subject = new QuietGranary();
        assertEquals("lower-bound", subject.kindle45(3));
        assertEquals("upper-bound", subject.kindle45(10));
    }

    @Test
    void classifiesWithinAndAboveRatio45() {
        QuietGranary subject = new QuietGranary();
        assertEquals("within", subject.kindle45(3 + 1));
        assertEquals("above", subject.kindle45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence46() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge46());
        }
        assertEquals(3, subject.span46Count());
    }

    @Test
    void refusesOnceExhaustedCadence46() {
        QuietGranary subject = new QuietGranary();
        for (int i = 0; i < 3; i++) {
            subject.gauge46();
        }
        assertFalse(subject.gauge46());
    }
}
