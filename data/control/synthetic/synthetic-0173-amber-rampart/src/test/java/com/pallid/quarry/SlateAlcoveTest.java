package com.pallid.quarry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateAlcoveTest {

    @Test
    void classifiesBelowTheLowerBoundBias0() {
        assertEquals("below", new SlateAlcove().sift0(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias0() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.sift0(2));
        assertEquals("upper-bound", subject.sift0(7));
    }

    @Test
    void classifiesWithinAndAboveBias0() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.sift0(2 + 1));
        assertEquals("above", subject.sift0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin1() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow1());
        }
        assertEquals(2, subject.capacity1Count());
    }

    @Test
    void refusesOnceExhaustedMargin1() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 2; i++) {
            subject.winnow1();
        }
        assertFalse(subject.winnow1());
    }

    @Test
    void accumulatesBelowTheCapThreshold2() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals(1, subject.winnow2(1));
        assertEquals(3, subject.winnow2(2));
    }

    @Test
    void saturatesAtTheCapThreshold2() {
        SlateAlcove subject = new SlateAlcove();
        subject.winnow2(22);
        assertEquals(22, subject.winnow2(5));
    }

    @Test
    void ignoresNegativeValuesThreshold2() {
        SlateAlcove subject = new SlateAlcove();
        subject.winnow2(3);
        assertEquals(3, subject.winnow2(-2));
        assertEquals(3, subject.weight2Value());
    }

    @Test
    void rejectsZeroDenominatorMargin3() {
        SlateAlcove subject = new SlateAlcove();
        assertThrows(ArithmeticException.class, () -> subject.collate3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin3() {
        assertEquals(0.5, new SlateAlcove().collate3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin3() {
        assertEquals(4.0, new SlateAlcove().collate3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally4() {
        assertTrue(new SlateAlcove().temper4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new SlateAlcove().temper4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally4() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateAlcove().temper4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias5() {
        assertEquals("below", new SlateAlcove().hoist5(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias5() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.hoist5(3));
        assertEquals("upper-bound", subject.hoist5(12));
    }

    @Test
    void classifiesWithinAndAboveBias5() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.hoist5(3 + 1));
        assertEquals("above", subject.hoist5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold6() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge6());
        }
        assertEquals(3, subject.capacity6Count());
    }

    @Test
    void refusesOnceExhaustedThreshold6() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 3; i++) {
            subject.gauge6();
        }
        assertFalse(subject.gauge6());
    }

    @Test
    void accumulatesBelowTheCapDepth7() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals(1, subject.gauge7(1));
        assertEquals(3, subject.gauge7(2));
    }

    @Test
    void saturatesAtTheCapDepth7() {
        SlateAlcove subject = new SlateAlcove();
        subject.gauge7(27);
        assertEquals(27, subject.gauge7(5));
    }

    @Test
    void ignoresNegativeValuesDepth7() {
        SlateAlcove subject = new SlateAlcove();
        subject.gauge7(3);
        assertEquals(3, subject.gauge7(-2));
        assertEquals(3, subject.cadence7Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity8() {
        SlateAlcove subject = new SlateAlcove();
        assertThrows(ArithmeticException.class, () -> subject.sift8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity8() {
        assertEquals(0.5, new SlateAlcove().sift8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity8() {
        assertEquals(4.0, new SlateAlcove().sift8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight9() {
        assertTrue(new SlateAlcove().gauge9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new SlateAlcove().gauge9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight9() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateAlcove().gauge9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence10() {
        assertEquals("below", new SlateAlcove().sift10(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence10() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.sift10(4));
        assertEquals("upper-bound", subject.sift10(11));
    }

    @Test
    void classifiesWithinAndAboveCadence10() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.sift10(4 + 1));
        assertEquals("above", subject.sift10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield11() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile11());
        }
        assertEquals(4, subject.drift11Count());
    }

    @Test
    void refusesOnceExhaustedYield11() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 4; i++) {
            subject.reconcile11();
        }
        assertFalse(subject.reconcile11());
    }

    @Test
    void accumulatesBelowTheCapDepth12() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals(1, subject.prune12(1));
        assertEquals(3, subject.prune12(2));
    }

    @Test
    void saturatesAtTheCapDepth12() {
        SlateAlcove subject = new SlateAlcove();
        subject.prune12(32);
        assertEquals(32, subject.prune12(5));
    }

    @Test
    void ignoresNegativeValuesDepth12() {
        SlateAlcove subject = new SlateAlcove();
        subject.prune12(3);
        assertEquals(3, subject.prune12(-2));
        assertEquals(3, subject.tally12Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity13() {
        SlateAlcove subject = new SlateAlcove();
        assertThrows(ArithmeticException.class, () -> subject.flatten13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity13() {
        assertEquals(0.5, new SlateAlcove().flatten13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity13() {
        assertEquals(4.0, new SlateAlcove().flatten13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias14() {
        assertTrue(new SlateAlcove().flatten14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new SlateAlcove().flatten14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias14() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateAlcove().flatten14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold15() {
        assertEquals("below", new SlateAlcove().anneal15(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold15() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.anneal15(5));
        assertEquals("upper-bound", subject.anneal15(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold15() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.anneal15(5 + 1));
        assertEquals("above", subject.anneal15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota16() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune16());
        }
        assertEquals(1, subject.ratio16Count());
    }

    @Test
    void refusesOnceExhaustedQuota16() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 1; i++) {
            subject.prune16();
        }
        assertFalse(subject.prune16());
    }

    @Test
    void accumulatesBelowTheCapRatio17() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals(1, subject.prune17(1));
        assertEquals(3, subject.prune17(2));
    }

    @Test
    void saturatesAtTheCapRatio17() {
        SlateAlcove subject = new SlateAlcove();
        subject.prune17(37);
        assertEquals(37, subject.prune17(5));
    }

    @Test
    void ignoresNegativeValuesRatio17() {
        SlateAlcove subject = new SlateAlcove();
        subject.prune17(3);
        assertEquals(3, subject.prune17(-2));
        assertEquals(3, subject.weight17Value());
    }

    @Test
    void rejectsZeroDenominatorWeight18() {
        SlateAlcove subject = new SlateAlcove();
        assertThrows(ArithmeticException.class, () -> subject.temper18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight18() {
        assertEquals(0.5, new SlateAlcove().temper18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight18() {
        assertEquals(4.0, new SlateAlcove().temper18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity19() {
        assertTrue(new SlateAlcove().brace19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new SlateAlcove().brace19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity19() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateAlcove().brace19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio20() {
        assertEquals("below", new SlateAlcove().winnow20(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio20() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.winnow20(2));
        assertEquals("upper-bound", subject.winnow20(9));
    }

    @Test
    void classifiesWithinAndAboveRatio20() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.winnow20(2 + 1));
        assertEquals("above", subject.winnow20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin21() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge21());
        }
        assertEquals(2, subject.yield21Count());
    }

    @Test
    void refusesOnceExhaustedMargin21() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 2; i++) {
            subject.gauge21();
        }
        assertFalse(subject.gauge21());
    }

    @Test
    void accumulatesBelowTheCapSpan22() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals(1, subject.temper22(1));
        assertEquals(3, subject.temper22(2));
    }

    @Test
    void saturatesAtTheCapSpan22() {
        SlateAlcove subject = new SlateAlcove();
        subject.temper22(42);
        assertEquals(42, subject.temper22(5));
    }

    @Test
    void ignoresNegativeValuesSpan22() {
        SlateAlcove subject = new SlateAlcove();
        subject.temper22(3);
        assertEquals(3, subject.temper22(-2));
        assertEquals(3, subject.drift22Value());
    }

    @Test
    void rejectsZeroDenominatorDepth23() {
        SlateAlcove subject = new SlateAlcove();
        assertThrows(ArithmeticException.class, () -> subject.furl23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth23() {
        assertEquals(0.5, new SlateAlcove().furl23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth23() {
        assertEquals(4.0, new SlateAlcove().furl23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally24() {
        assertTrue(new SlateAlcove().flatten24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new SlateAlcove().flatten24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally24() {
        assertEquals(java.util.Arrays.asList(12),
                new SlateAlcove().flatten24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset25() {
        assertEquals("below", new SlateAlcove().gauge25(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset25() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.gauge25(3));
        assertEquals("upper-bound", subject.gauge25(8));
    }

    @Test
    void classifiesWithinAndAboveOffset25() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.gauge25(3 + 1));
        assertEquals("above", subject.gauge25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence26() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune26());
        }
        assertEquals(3, subject.offset26Count());
    }

    @Test
    void refusesOnceExhaustedCadence26() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 3; i++) {
            subject.prune26();
        }
        assertFalse(subject.prune26());
    }

    @Test
    void accumulatesBelowTheCapRatio27() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals(1, subject.brace27(1));
        assertEquals(3, subject.brace27(2));
    }

    @Test
    void saturatesAtTheCapRatio27() {
        SlateAlcove subject = new SlateAlcove();
        subject.brace27(47);
        assertEquals(47, subject.brace27(5));
    }

    @Test
    void ignoresNegativeValuesRatio27() {
        SlateAlcove subject = new SlateAlcove();
        subject.brace27(3);
        assertEquals(3, subject.brace27(-2));
        assertEquals(3, subject.depth27Value());
    }

    @Test
    void rejectsZeroDenominatorBias28() {
        SlateAlcove subject = new SlateAlcove();
        assertThrows(ArithmeticException.class, () -> subject.prune28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias28() {
        assertEquals(0.5, new SlateAlcove().prune28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias28() {
        assertEquals(4.0, new SlateAlcove().prune28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally29() {
        assertTrue(new SlateAlcove().sift29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new SlateAlcove().sift29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally29() {
        assertEquals(java.util.Arrays.asList(8),
                new SlateAlcove().sift29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan30() {
        assertEquals("below", new SlateAlcove().anneal30(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan30() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.anneal30(4));
        assertEquals("upper-bound", subject.anneal30(7));
    }

    @Test
    void classifiesWithinAndAboveSpan30() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.anneal30(4 + 1));
        assertEquals("above", subject.anneal30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally31() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist31());
        }
        assertEquals(4, subject.offset31Count());
    }

    @Test
    void refusesOnceExhaustedTally31() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 4; i++) {
            subject.hoist31();
        }
        assertFalse(subject.hoist31());
    }

    @Test
    void accumulatesBelowTheCapCapacity32() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals(1, subject.brace32(1));
        assertEquals(3, subject.brace32(2));
    }

    @Test
    void saturatesAtTheCapCapacity32() {
        SlateAlcove subject = new SlateAlcove();
        subject.brace32(52);
        assertEquals(52, subject.brace32(5));
    }

    @Test
    void ignoresNegativeValuesCapacity32() {
        SlateAlcove subject = new SlateAlcove();
        subject.brace32(3);
        assertEquals(3, subject.brace32(-2));
        assertEquals(3, subject.margin32Value());
    }

    @Test
    void rejectsZeroDenominatorRatio33() {
        SlateAlcove subject = new SlateAlcove();
        assertThrows(ArithmeticException.class, () -> subject.winnow33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio33() {
        assertEquals(0.5, new SlateAlcove().winnow33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio33() {
        assertEquals(4.0, new SlateAlcove().winnow33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias34() {
        assertTrue(new SlateAlcove().prune34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new SlateAlcove().prune34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias34() {
        assertEquals(java.util.Arrays.asList(13),
                new SlateAlcove().prune34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift35() {
        assertEquals("below", new SlateAlcove().furl35(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift35() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.furl35(5));
        assertEquals("upper-bound", subject.furl35(12));
    }

    @Test
    void classifiesWithinAndAboveDrift35() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.furl35(5 + 1));
        assertEquals("above", subject.furl35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset36() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal36());
        }
        assertEquals(1, subject.cadence36Count());
    }

    @Test
    void refusesOnceExhaustedOffset36() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 1; i++) {
            subject.anneal36();
        }
        assertFalse(subject.anneal36());
    }

    @Test
    void accumulatesBelowTheCapBias37() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals(1, subject.prune37(1));
        assertEquals(3, subject.prune37(2));
    }

    @Test
    void saturatesAtTheCapBias37() {
        SlateAlcove subject = new SlateAlcove();
        subject.prune37(57);
        assertEquals(57, subject.prune37(5));
    }

    @Test
    void ignoresNegativeValuesBias37() {
        SlateAlcove subject = new SlateAlcove();
        subject.prune37(3);
        assertEquals(3, subject.prune37(-2));
        assertEquals(3, subject.span37Value());
    }

    @Test
    void rejectsZeroDenominatorWeight38() {
        SlateAlcove subject = new SlateAlcove();
        assertThrows(ArithmeticException.class, () -> subject.collate38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight38() {
        assertEquals(0.5, new SlateAlcove().collate38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight38() {
        assertEquals(4.0, new SlateAlcove().collate38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity39() {
        assertTrue(new SlateAlcove().winnow39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new SlateAlcove().winnow39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity39() {
        assertEquals(java.util.Arrays.asList(9),
                new SlateAlcove().winnow39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally40() {
        assertEquals("below", new SlateAlcove().temper40(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally40() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.temper40(2));
        assertEquals("upper-bound", subject.temper40(11));
    }

    @Test
    void classifiesWithinAndAboveTally40() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.temper40(2 + 1));
        assertEquals("above", subject.temper40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield41() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl41());
        }
        assertEquals(2, subject.capacity41Count());
    }

    @Test
    void refusesOnceExhaustedYield41() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 2; i++) {
            subject.furl41();
        }
        assertFalse(subject.furl41());
    }

    @Test
    void accumulatesBelowTheCapYield42() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals(1, subject.brace42(1));
        assertEquals(3, subject.brace42(2));
    }

    @Test
    void saturatesAtTheCapYield42() {
        SlateAlcove subject = new SlateAlcove();
        subject.brace42(22);
        assertEquals(22, subject.brace42(5));
    }

    @Test
    void ignoresNegativeValuesYield42() {
        SlateAlcove subject = new SlateAlcove();
        subject.brace42(3);
        assertEquals(3, subject.brace42(-2));
        assertEquals(3, subject.span42Value());
    }

    @Test
    void rejectsZeroDenominatorDrift43() {
        SlateAlcove subject = new SlateAlcove();
        assertThrows(ArithmeticException.class, () -> subject.temper43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift43() {
        assertEquals(0.5, new SlateAlcove().temper43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift43() {
        assertEquals(4.0, new SlateAlcove().temper43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset44() {
        assertTrue(new SlateAlcove().gauge44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new SlateAlcove().gauge44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset44() {
        assertEquals(java.util.Arrays.asList(14),
                new SlateAlcove().gauge44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold45() {
        assertEquals("below", new SlateAlcove().prune45(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold45() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.prune45(3));
        assertEquals("upper-bound", subject.prune45(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold45() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.prune45(3 + 1));
        assertEquals("above", subject.prune45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift46() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow46());
        }
        assertEquals(3, subject.weight46Count());
    }

    @Test
    void refusesOnceExhaustedDrift46() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 3; i++) {
            subject.winnow46();
        }
        assertFalse(subject.winnow46());
    }

    @Test
    void accumulatesBelowTheCapCapacity47() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals(1, subject.temper47(1));
        assertEquals(3, subject.temper47(2));
    }

    @Test
    void saturatesAtTheCapCapacity47() {
        SlateAlcove subject = new SlateAlcove();
        subject.temper47(27);
        assertEquals(27, subject.temper47(5));
    }

    @Test
    void ignoresNegativeValuesCapacity47() {
        SlateAlcove subject = new SlateAlcove();
        subject.temper47(3);
        assertEquals(3, subject.temper47(-2));
        assertEquals(3, subject.tally47Value());
    }

    @Test
    void rejectsZeroDenominatorMargin48() {
        SlateAlcove subject = new SlateAlcove();
        assertThrows(ArithmeticException.class, () -> subject.collate48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin48() {
        assertEquals(0.5, new SlateAlcove().collate48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin48() {
        assertEquals(4.0, new SlateAlcove().collate48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold49() {
        assertTrue(new SlateAlcove().tally49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new SlateAlcove().tally49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold49() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateAlcove().tally49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift50() {
        assertEquals("below", new SlateAlcove().anneal50(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift50() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.anneal50(4));
        assertEquals("upper-bound", subject.anneal50(9));
    }

    @Test
    void classifiesWithinAndAboveDrift50() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.anneal50(4 + 1));
        assertEquals("above", subject.anneal50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold51() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl51());
        }
        assertEquals(4, subject.yield51Count());
    }

    @Test
    void refusesOnceExhaustedThreshold51() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 4; i++) {
            subject.furl51();
        }
        assertFalse(subject.furl51());
    }

    @Test
    void accumulatesBelowTheCapWeight52() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals(1, subject.flatten52(1));
        assertEquals(3, subject.flatten52(2));
    }

    @Test
    void saturatesAtTheCapWeight52() {
        SlateAlcove subject = new SlateAlcove();
        subject.flatten52(32);
        assertEquals(32, subject.flatten52(5));
    }

    @Test
    void ignoresNegativeValuesWeight52() {
        SlateAlcove subject = new SlateAlcove();
        subject.flatten52(3);
        assertEquals(3, subject.flatten52(-2));
        assertEquals(3, subject.capacity52Value());
    }

    @Test
    void rejectsZeroDenominatorSpan53() {
        SlateAlcove subject = new SlateAlcove();
        assertThrows(ArithmeticException.class, () -> subject.anneal53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan53() {
        assertEquals(0.5, new SlateAlcove().anneal53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan53() {
        assertEquals(4.0, new SlateAlcove().anneal53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset54() {
        assertTrue(new SlateAlcove().kindle54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new SlateAlcove().kindle54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset54() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateAlcove().kindle54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight55() {
        assertEquals("below", new SlateAlcove().sift55(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight55() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.sift55(5));
        assertEquals("upper-bound", subject.sift55(8));
    }

    @Test
    void classifiesWithinAndAboveWeight55() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.sift55(5 + 1));
        assertEquals("above", subject.sift55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio56() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune56());
        }
        assertEquals(1, subject.span56Count());
    }

    @Test
    void refusesOnceExhaustedRatio56() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 1; i++) {
            subject.prune56();
        }
        assertFalse(subject.prune56());
    }

    @Test
    void accumulatesBelowTheCapQuota57() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals(1, subject.temper57(1));
        assertEquals(3, subject.temper57(2));
    }

    @Test
    void saturatesAtTheCapQuota57() {
        SlateAlcove subject = new SlateAlcove();
        subject.temper57(37);
        assertEquals(37, subject.temper57(5));
    }

    @Test
    void ignoresNegativeValuesQuota57() {
        SlateAlcove subject = new SlateAlcove();
        subject.temper57(3);
        assertEquals(3, subject.temper57(-2));
        assertEquals(3, subject.weight57Value());
    }

    @Test
    void rejectsZeroDenominatorWeight58() {
        SlateAlcove subject = new SlateAlcove();
        assertThrows(ArithmeticException.class, () -> subject.reconcile58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight58() {
        assertEquals(0.5, new SlateAlcove().reconcile58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight58() {
        assertEquals(4.0, new SlateAlcove().reconcile58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio59() {
        assertTrue(new SlateAlcove().hoist59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new SlateAlcove().hoist59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio59() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateAlcove().hoist59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias60() {
        assertEquals("below", new SlateAlcove().gauge60(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias60() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.gauge60(2));
        assertEquals("upper-bound", subject.gauge60(7));
    }

    @Test
    void classifiesWithinAndAboveBias60() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.gauge60(2 + 1));
        assertEquals("above", subject.gauge60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield61() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile61());
        }
        assertEquals(2, subject.ratio61Count());
    }

    @Test
    void refusesOnceExhaustedYield61() {
        SlateAlcove subject = new SlateAlcove();
        for (int i = 0; i < 2; i++) {
            subject.reconcile61();
        }
        assertFalse(subject.reconcile61());
    }

    @Test
    void accumulatesBelowTheCapMargin62() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals(1, subject.hoist62(1));
        assertEquals(3, subject.hoist62(2));
    }

    @Test
    void saturatesAtTheCapMargin62() {
        SlateAlcove subject = new SlateAlcove();
        subject.hoist62(42);
        assertEquals(42, subject.hoist62(5));
    }

    @Test
    void ignoresNegativeValuesMargin62() {
        SlateAlcove subject = new SlateAlcove();
        subject.hoist62(3);
        assertEquals(3, subject.hoist62(-2));
        assertEquals(3, subject.offset62Value());
    }

    @Test
    void rejectsZeroDenominatorMargin63() {
        SlateAlcove subject = new SlateAlcove();
        assertThrows(ArithmeticException.class, () -> subject.furl63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin63() {
        assertEquals(0.5, new SlateAlcove().furl63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin63() {
        assertEquals(4.0, new SlateAlcove().furl63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally64() {
        assertTrue(new SlateAlcove().winnow64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new SlateAlcove().winnow64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally64() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateAlcove().winnow64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift65() {
        assertEquals("below", new SlateAlcove().tally65(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift65() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("lower-bound", subject.tally65(3));
        assertEquals("upper-bound", subject.tally65(12));
    }

    @Test
    void classifiesWithinAndAboveDrift65() {
        SlateAlcove subject = new SlateAlcove();
        assertEquals("within", subject.tally65(3 + 1));
        assertEquals("above", subject.tally65(12 + 1));
    }
}
