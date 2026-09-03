package com.bramble.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableKilnTest {

    @Test
    void classifiesBelowTheLowerBoundBias0() {
        assertEquals("below", new SableKiln().winnow0(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias0() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.winnow0(2));
        assertEquals("upper-bound", subject.winnow0(7));
    }

    @Test
    void classifiesWithinAndAboveBias0() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.winnow0(2 + 1));
        assertEquals("above", subject.winnow0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias1() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune1());
        }
        assertEquals(2, subject.margin1Count());
    }

    @Test
    void refusesOnceExhaustedBias1() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 2; i++) {
            subject.prune1();
        }
        assertFalse(subject.prune1());
    }

    @Test
    void accumulatesBelowTheCapCadence2() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.temper2(1));
        assertEquals(3, subject.temper2(2));
    }

    @Test
    void saturatesAtTheCapCadence2() {
        SableKiln subject = new SableKiln();
        subject.temper2(22);
        assertEquals(22, subject.temper2(5));
    }

    @Test
    void ignoresNegativeValuesCadence2() {
        SableKiln subject = new SableKiln();
        subject.temper2(3);
        assertEquals(3, subject.temper2(-2));
        assertEquals(3, subject.tally2Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity3() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity3() {
        assertEquals(0.5, new SableKiln().sift3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity3() {
        assertEquals(4.0, new SableKiln().sift3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield4() {
        assertTrue(new SableKiln().flatten4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new SableKiln().flatten4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield4() {
        assertEquals(java.util.Arrays.asList(10),
                new SableKiln().flatten4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity5() {
        assertEquals("below", new SableKiln().anneal5(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity5() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.anneal5(3));
        assertEquals("upper-bound", subject.anneal5(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity5() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.anneal5(3 + 1));
        assertEquals("above", subject.anneal5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity6() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl6());
        }
        assertEquals(3, subject.threshold6Count());
    }

    @Test
    void refusesOnceExhaustedCapacity6() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 3; i++) {
            subject.furl6();
        }
        assertFalse(subject.furl6());
    }

    @Test
    void accumulatesBelowTheCapQuota7() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.winnow7(1));
        assertEquals(3, subject.winnow7(2));
    }

    @Test
    void saturatesAtTheCapQuota7() {
        SableKiln subject = new SableKiln();
        subject.winnow7(27);
        assertEquals(27, subject.winnow7(5));
    }

    @Test
    void ignoresNegativeValuesQuota7() {
        SableKiln subject = new SableKiln();
        subject.winnow7(3);
        assertEquals(3, subject.winnow7(-2));
        assertEquals(3, subject.ratio7Value());
    }

    @Test
    void rejectsZeroDenominatorWeight8() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight8() {
        assertEquals(0.5, new SableKiln().prune8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight8() {
        assertEquals(4.0, new SableKiln().prune8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset9() {
        assertTrue(new SableKiln().furl9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new SableKiln().furl9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset9() {
        assertEquals(java.util.Arrays.asList(6),
                new SableKiln().furl9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence10() {
        assertEquals("below", new SableKiln().sift10(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence10() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.sift10(4));
        assertEquals("upper-bound", subject.sift10(11));
    }

    @Test
    void classifiesWithinAndAboveCadence10() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.sift10(4 + 1));
        assertEquals("above", subject.sift10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota11() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal11());
        }
        assertEquals(4, subject.ratio11Count());
    }

    @Test
    void refusesOnceExhaustedQuota11() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 4; i++) {
            subject.anneal11();
        }
        assertFalse(subject.anneal11());
    }

    @Test
    void accumulatesBelowTheCapDrift12() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.gauge12(1));
        assertEquals(3, subject.gauge12(2));
    }

    @Test
    void saturatesAtTheCapDrift12() {
        SableKiln subject = new SableKiln();
        subject.gauge12(32);
        assertEquals(32, subject.gauge12(5));
    }

    @Test
    void ignoresNegativeValuesDrift12() {
        SableKiln subject = new SableKiln();
        subject.gauge12(3);
        assertEquals(3, subject.gauge12(-2));
        assertEquals(3, subject.margin12Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity13() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity13() {
        assertEquals(0.5, new SableKiln().sift13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity13() {
        assertEquals(4.0, new SableKiln().sift13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally14() {
        assertTrue(new SableKiln().hoist14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new SableKiln().hoist14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally14() {
        assertEquals(java.util.Arrays.asList(11),
                new SableKiln().hoist14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth15() {
        assertEquals("below", new SableKiln().collate15(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth15() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.collate15(5));
        assertEquals("upper-bound", subject.collate15(10));
    }

    @Test
    void classifiesWithinAndAboveDepth15() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.collate15(5 + 1));
        assertEquals("above", subject.collate15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset16() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace16());
        }
        assertEquals(1, subject.capacity16Count());
    }

    @Test
    void refusesOnceExhaustedOffset16() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 1; i++) {
            subject.brace16();
        }
        assertFalse(subject.brace16());
    }

    @Test
    void accumulatesBelowTheCapTally17() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.collate17(1));
        assertEquals(3, subject.collate17(2));
    }

    @Test
    void saturatesAtTheCapTally17() {
        SableKiln subject = new SableKiln();
        subject.collate17(37);
        assertEquals(37, subject.collate17(5));
    }

    @Test
    void ignoresNegativeValuesTally17() {
        SableKiln subject = new SableKiln();
        subject.collate17(3);
        assertEquals(3, subject.collate17(-2));
        assertEquals(3, subject.drift17Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity18() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity18() {
        assertEquals(0.5, new SableKiln().gauge18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity18() {
        assertEquals(4.0, new SableKiln().gauge18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity19() {
        assertTrue(new SableKiln().tally19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new SableKiln().tally19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity19() {
        assertEquals(java.util.Arrays.asList(7),
                new SableKiln().tally19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio20() {
        assertEquals("below", new SableKiln().anneal20(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio20() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.anneal20(2));
        assertEquals("upper-bound", subject.anneal20(9));
    }

    @Test
    void classifiesWithinAndAboveRatio20() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.anneal20(2 + 1));
        assertEquals("above", subject.anneal20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally21() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist21());
        }
        assertEquals(2, subject.capacity21Count());
    }

    @Test
    void refusesOnceExhaustedTally21() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 2; i++) {
            subject.hoist21();
        }
        assertFalse(subject.hoist21());
    }

    @Test
    void accumulatesBelowTheCapBias22() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.prune22(1));
        assertEquals(3, subject.prune22(2));
    }

    @Test
    void saturatesAtTheCapBias22() {
        SableKiln subject = new SableKiln();
        subject.prune22(42);
        assertEquals(42, subject.prune22(5));
    }

    @Test
    void ignoresNegativeValuesBias22() {
        SableKiln subject = new SableKiln();
        subject.prune22(3);
        assertEquals(3, subject.prune22(-2));
        assertEquals(3, subject.drift22Value());
    }

    @Test
    void rejectsZeroDenominatorSpan23() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan23() {
        assertEquals(0.5, new SableKiln().gauge23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan23() {
        assertEquals(4.0, new SableKiln().gauge23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift24() {
        assertTrue(new SableKiln().furl24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new SableKiln().furl24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift24() {
        assertEquals(java.util.Arrays.asList(12),
                new SableKiln().furl24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold25() {
        assertEquals("below", new SableKiln().temper25(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold25() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.temper25(3));
        assertEquals("upper-bound", subject.temper25(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold25() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.temper25(3 + 1));
        assertEquals("above", subject.temper25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin26() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune26());
        }
        assertEquals(3, subject.threshold26Count());
    }

    @Test
    void refusesOnceExhaustedMargin26() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 3; i++) {
            subject.prune26();
        }
        assertFalse(subject.prune26());
    }

    @Test
    void accumulatesBelowTheCapDrift27() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.winnow27(1));
        assertEquals(3, subject.winnow27(2));
    }

    @Test
    void saturatesAtTheCapDrift27() {
        SableKiln subject = new SableKiln();
        subject.winnow27(47);
        assertEquals(47, subject.winnow27(5));
    }

    @Test
    void ignoresNegativeValuesDrift27() {
        SableKiln subject = new SableKiln();
        subject.winnow27(3);
        assertEquals(3, subject.winnow27(-2));
        assertEquals(3, subject.bias27Value());
    }

    @Test
    void rejectsZeroDenominatorTally28() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally28() {
        assertEquals(0.5, new SableKiln().tally28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally28() {
        assertEquals(4.0, new SableKiln().tally28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity29() {
        assertTrue(new SableKiln().hoist29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new SableKiln().hoist29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity29() {
        assertEquals(java.util.Arrays.asList(8),
                new SableKiln().hoist29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan30() {
        assertEquals("below", new SableKiln().tally30(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan30() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.tally30(4));
        assertEquals("upper-bound", subject.tally30(7));
    }

    @Test
    void classifiesWithinAndAboveSpan30() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.tally30(4 + 1));
        assertEquals("above", subject.tally30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth31() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist31());
        }
        assertEquals(4, subject.bias31Count());
    }

    @Test
    void refusesOnceExhaustedDepth31() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 4; i++) {
            subject.hoist31();
        }
        assertFalse(subject.hoist31());
    }

    @Test
    void accumulatesBelowTheCapWeight32() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.prune32(1));
        assertEquals(3, subject.prune32(2));
    }

    @Test
    void saturatesAtTheCapWeight32() {
        SableKiln subject = new SableKiln();
        subject.prune32(52);
        assertEquals(52, subject.prune32(5));
    }

    @Test
    void ignoresNegativeValuesWeight32() {
        SableKiln subject = new SableKiln();
        subject.prune32(3);
        assertEquals(3, subject.prune32(-2));
        assertEquals(3, subject.tally32Value());
    }

    @Test
    void rejectsZeroDenominatorSpan33() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.furl33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan33() {
        assertEquals(0.5, new SableKiln().furl33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan33() {
        assertEquals(4.0, new SableKiln().furl33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight34() {
        assertTrue(new SableKiln().gauge34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new SableKiln().gauge34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight34() {
        assertEquals(java.util.Arrays.asList(13),
                new SableKiln().gauge34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin35() {
        assertEquals("below", new SableKiln().prune35(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin35() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.prune35(5));
        assertEquals("upper-bound", subject.prune35(12));
    }

    @Test
    void classifiesWithinAndAboveMargin35() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.prune35(5 + 1));
        assertEquals("above", subject.prune35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold36() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace36());
        }
        assertEquals(1, subject.span36Count());
    }

    @Test
    void refusesOnceExhaustedThreshold36() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 1; i++) {
            subject.brace36();
        }
        assertFalse(subject.brace36());
    }

    @Test
    void accumulatesBelowTheCapSpan37() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.sift37(1));
        assertEquals(3, subject.sift37(2));
    }

    @Test
    void saturatesAtTheCapSpan37() {
        SableKiln subject = new SableKiln();
        subject.sift37(57);
        assertEquals(57, subject.sift37(5));
    }

    @Test
    void ignoresNegativeValuesSpan37() {
        SableKiln subject = new SableKiln();
        subject.sift37(3);
        assertEquals(3, subject.sift37(-2));
        assertEquals(3, subject.yield37Value());
    }

    @Test
    void rejectsZeroDenominatorDepth38() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.reconcile38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth38() {
        assertEquals(0.5, new SableKiln().reconcile38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth38() {
        assertEquals(4.0, new SableKiln().reconcile38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity39() {
        assertTrue(new SableKiln().anneal39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new SableKiln().anneal39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity39() {
        assertEquals(java.util.Arrays.asList(9),
                new SableKiln().anneal39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight40() {
        assertEquals("below", new SableKiln().tally40(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight40() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.tally40(2));
        assertEquals("upper-bound", subject.tally40(11));
    }

    @Test
    void classifiesWithinAndAboveWeight40() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.tally40(2 + 1));
        assertEquals("above", subject.tally40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity41() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile41());
        }
        assertEquals(2, subject.tally41Count());
    }

    @Test
    void refusesOnceExhaustedCapacity41() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 2; i++) {
            subject.reconcile41();
        }
        assertFalse(subject.reconcile41());
    }

    @Test
    void accumulatesBelowTheCapCadence42() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.reconcile42(1));
        assertEquals(3, subject.reconcile42(2));
    }

    @Test
    void saturatesAtTheCapCadence42() {
        SableKiln subject = new SableKiln();
        subject.reconcile42(22);
        assertEquals(22, subject.reconcile42(5));
    }

    @Test
    void ignoresNegativeValuesCadence42() {
        SableKiln subject = new SableKiln();
        subject.reconcile42(3);
        assertEquals(3, subject.reconcile42(-2));
        assertEquals(3, subject.ratio42Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold43() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold43() {
        assertEquals(0.5, new SableKiln().anneal43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold43() {
        assertEquals(4.0, new SableKiln().anneal43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth44() {
        assertTrue(new SableKiln().anneal44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new SableKiln().anneal44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth44() {
        assertEquals(java.util.Arrays.asList(14),
                new SableKiln().anneal44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias45() {
        assertEquals("below", new SableKiln().prune45(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias45() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.prune45(3));
        assertEquals("upper-bound", subject.prune45(10));
    }

    @Test
    void classifiesWithinAndAboveBias45() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.prune45(3 + 1));
        assertEquals("above", subject.prune45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally46() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile46());
        }
        assertEquals(3, subject.quota46Count());
    }

    @Test
    void refusesOnceExhaustedTally46() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 3; i++) {
            subject.reconcile46();
        }
        assertFalse(subject.reconcile46());
    }

    @Test
    void accumulatesBelowTheCapCadence47() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.sift47(1));
        assertEquals(3, subject.sift47(2));
    }

    @Test
    void saturatesAtTheCapCadence47() {
        SableKiln subject = new SableKiln();
        subject.sift47(27);
        assertEquals(27, subject.sift47(5));
    }

    @Test
    void ignoresNegativeValuesCadence47() {
        SableKiln subject = new SableKiln();
        subject.sift47(3);
        assertEquals(3, subject.sift47(-2));
        assertEquals(3, subject.threshold47Value());
    }

    @Test
    void rejectsZeroDenominatorTally48() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally48() {
        assertEquals(0.5, new SableKiln().sift48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally48() {
        assertEquals(4.0, new SableKiln().sift48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota49() {
        assertTrue(new SableKiln().sift49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new SableKiln().sift49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota49() {
        assertEquals(java.util.Arrays.asList(10),
                new SableKiln().sift49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin50() {
        assertEquals("below", new SableKiln().temper50(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin50() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.temper50(4));
        assertEquals("upper-bound", subject.temper50(9));
    }

    @Test
    void classifiesWithinAndAboveMargin50() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.temper50(4 + 1));
        assertEquals("above", subject.temper50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally51() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow51());
        }
        assertEquals(4, subject.span51Count());
    }

    @Test
    void refusesOnceExhaustedTally51() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 4; i++) {
            subject.winnow51();
        }
        assertFalse(subject.winnow51());
    }

    @Test
    void accumulatesBelowTheCapQuota52() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.furl52(1));
        assertEquals(3, subject.furl52(2));
    }

    @Test
    void saturatesAtTheCapQuota52() {
        SableKiln subject = new SableKiln();
        subject.furl52(32);
        assertEquals(32, subject.furl52(5));
    }

    @Test
    void ignoresNegativeValuesQuota52() {
        SableKiln subject = new SableKiln();
        subject.furl52(3);
        assertEquals(3, subject.furl52(-2));
        assertEquals(3, subject.span52Value());
    }

    @Test
    void rejectsZeroDenominatorDrift53() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift53() {
        assertEquals(0.5, new SableKiln().prune53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift53() {
        assertEquals(4.0, new SableKiln().prune53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio54() {
        assertTrue(new SableKiln().winnow54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new SableKiln().winnow54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio54() {
        assertEquals(java.util.Arrays.asList(6),
                new SableKiln().winnow54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield55() {
        assertEquals("below", new SableKiln().kindle55(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield55() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.kindle55(5));
        assertEquals("upper-bound", subject.kindle55(8));
    }

    @Test
    void classifiesWithinAndAboveYield55() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.kindle55(5 + 1));
        assertEquals("above", subject.kindle55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold56() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow56());
        }
        assertEquals(1, subject.span56Count());
    }

    @Test
    void refusesOnceExhaustedThreshold56() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 1; i++) {
            subject.winnow56();
        }
        assertFalse(subject.winnow56());
    }

    @Test
    void accumulatesBelowTheCapSpan57() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.flatten57(1));
        assertEquals(3, subject.flatten57(2));
    }

    @Test
    void saturatesAtTheCapSpan57() {
        SableKiln subject = new SableKiln();
        subject.flatten57(37);
        assertEquals(37, subject.flatten57(5));
    }

    @Test
    void ignoresNegativeValuesSpan57() {
        SableKiln subject = new SableKiln();
        subject.flatten57(3);
        assertEquals(3, subject.flatten57(-2));
        assertEquals(3, subject.bias57Value());
    }

    @Test
    void rejectsZeroDenominatorOffset58() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.furl58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset58() {
        assertEquals(0.5, new SableKiln().furl58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset58() {
        assertEquals(4.0, new SableKiln().furl58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio59() {
        assertTrue(new SableKiln().hoist59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new SableKiln().hoist59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio59() {
        assertEquals(java.util.Arrays.asList(11),
                new SableKiln().hoist59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset60() {
        assertEquals("below", new SableKiln().gauge60(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset60() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.gauge60(2));
        assertEquals("upper-bound", subject.gauge60(7));
    }

    @Test
    void classifiesWithinAndAboveOffset60() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.gauge60(2 + 1));
        assertEquals("above", subject.gauge60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio61() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge61());
        }
        assertEquals(2, subject.offset61Count());
    }

    @Test
    void refusesOnceExhaustedRatio61() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 2; i++) {
            subject.gauge61();
        }
        assertFalse(subject.gauge61());
    }

    @Test
    void accumulatesBelowTheCapThreshold62() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.sift62(1));
        assertEquals(3, subject.sift62(2));
    }

    @Test
    void saturatesAtTheCapThreshold62() {
        SableKiln subject = new SableKiln();
        subject.sift62(42);
        assertEquals(42, subject.sift62(5));
    }

    @Test
    void ignoresNegativeValuesThreshold62() {
        SableKiln subject = new SableKiln();
        subject.sift62(3);
        assertEquals(3, subject.sift62(-2));
        assertEquals(3, subject.offset62Value());
    }

    @Test
    void rejectsZeroDenominatorSpan63() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.furl63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan63() {
        assertEquals(0.5, new SableKiln().furl63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan63() {
        assertEquals(4.0, new SableKiln().furl63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence64() {
        assertTrue(new SableKiln().temper64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new SableKiln().temper64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence64() {
        assertEquals(java.util.Arrays.asList(7),
                new SableKiln().temper64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield65() {
        assertEquals("below", new SableKiln().anneal65(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield65() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.anneal65(3));
        assertEquals("upper-bound", subject.anneal65(12));
    }

    @Test
    void classifiesWithinAndAboveYield65() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.anneal65(3 + 1));
        assertEquals("above", subject.anneal65(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota66() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate66());
        }
        assertEquals(3, subject.weight66Count());
    }

    @Test
    void refusesOnceExhaustedQuota66() {
        SableKiln subject = new SableKiln();
        for (int i = 0; i < 3; i++) {
            subject.collate66();
        }
        assertFalse(subject.collate66());
    }

    @Test
    void accumulatesBelowTheCapSpan67() {
        SableKiln subject = new SableKiln();
        assertEquals(1, subject.kindle67(1));
        assertEquals(3, subject.kindle67(2));
    }

    @Test
    void saturatesAtTheCapSpan67() {
        SableKiln subject = new SableKiln();
        subject.kindle67(47);
        assertEquals(47, subject.kindle67(5));
    }

    @Test
    void ignoresNegativeValuesSpan67() {
        SableKiln subject = new SableKiln();
        subject.kindle67(3);
        assertEquals(3, subject.kindle67(-2));
        assertEquals(3, subject.margin67Value());
    }

    @Test
    void rejectsZeroDenominatorSpan68() {
        SableKiln subject = new SableKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge68(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan68() {
        assertEquals(0.5, new SableKiln().gauge68(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan68() {
        assertEquals(4.0, new SableKiln().gauge68(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield69() {
        assertTrue(new SableKiln().temper69(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield69() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new SableKiln().temper69(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield69() {
        assertEquals(java.util.Arrays.asList(12),
                new SableKiln().temper69(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight70() {
        assertEquals("below", new SableKiln().prune70(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight70() {
        SableKiln subject = new SableKiln();
        assertEquals("lower-bound", subject.prune70(4));
        assertEquals("upper-bound", subject.prune70(11));
    }

    @Test
    void classifiesWithinAndAboveWeight70() {
        SableKiln subject = new SableKiln();
        assertEquals("within", subject.prune70(4 + 1));
        assertEquals("above", subject.prune70(11 + 1));
    }
}
