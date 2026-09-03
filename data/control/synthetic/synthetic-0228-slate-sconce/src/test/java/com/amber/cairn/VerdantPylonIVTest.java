package com.amber.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantPylonIVTest {

    @Test
    void classifiesBelowTheLowerBoundDepth0() {
        assertEquals("below", new VerdantPylonIV().winnow0(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth0() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("lower-bound", subject.winnow0(2));
        assertEquals("upper-bound", subject.winnow0(7));
    }

    @Test
    void classifiesWithinAndAboveDepth0() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("within", subject.winnow0(2 + 1));
        assertEquals("above", subject.winnow0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias1() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift1());
        }
        assertEquals(2, subject.ratio1Count());
    }

    @Test
    void refusesOnceExhaustedBias1() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 2; i++) {
            subject.sift1();
        }
        assertFalse(subject.sift1());
    }

    @Test
    void accumulatesBelowTheCapCapacity2() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals(1, subject.flatten2(1));
        assertEquals(3, subject.flatten2(2));
    }

    @Test
    void saturatesAtTheCapCapacity2() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.flatten2(22);
        assertEquals(22, subject.flatten2(5));
    }

    @Test
    void ignoresNegativeValuesCapacity2() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.flatten2(3);
        assertEquals(3, subject.flatten2(-2));
        assertEquals(3, subject.margin2Value());
    }

    @Test
    void rejectsZeroDenominatorSpan3() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertThrows(ArithmeticException.class, () -> subject.brace3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan3() {
        assertEquals(0.5, new VerdantPylonIV().brace3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan3() {
        assertEquals(4.0, new VerdantPylonIV().brace3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin4() {
        assertTrue(new VerdantPylonIV().collate4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new VerdantPylonIV().collate4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin4() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantPylonIV().collate4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold5() {
        assertEquals("below", new VerdantPylonIV().gauge5(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold5() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("lower-bound", subject.gauge5(3));
        assertEquals("upper-bound", subject.gauge5(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold5() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("within", subject.gauge5(3 + 1));
        assertEquals("above", subject.gauge5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift6() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle6());
        }
        assertEquals(3, subject.cadence6Count());
    }

    @Test
    void refusesOnceExhaustedDrift6() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 3; i++) {
            subject.kindle6();
        }
        assertFalse(subject.kindle6());
    }

    @Test
    void accumulatesBelowTheCapWeight7() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals(1, subject.hoist7(1));
        assertEquals(3, subject.hoist7(2));
    }

    @Test
    void saturatesAtTheCapWeight7() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.hoist7(27);
        assertEquals(27, subject.hoist7(5));
    }

    @Test
    void ignoresNegativeValuesWeight7() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.hoist7(3);
        assertEquals(3, subject.hoist7(-2));
        assertEquals(3, subject.cadence7Value());
    }

    @Test
    void rejectsZeroDenominatorDrift8() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertThrows(ArithmeticException.class, () -> subject.sift8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift8() {
        assertEquals(0.5, new VerdantPylonIV().sift8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift8() {
        assertEquals(4.0, new VerdantPylonIV().sift8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth9() {
        assertTrue(new VerdantPylonIV().collate9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new VerdantPylonIV().collate9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth9() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantPylonIV().collate9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence10() {
        assertEquals("below", new VerdantPylonIV().kindle10(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence10() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("lower-bound", subject.kindle10(4));
        assertEquals("upper-bound", subject.kindle10(11));
    }

    @Test
    void classifiesWithinAndAboveCadence10() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("within", subject.kindle10(4 + 1));
        assertEquals("above", subject.kindle10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence11() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist11());
        }
        assertEquals(4, subject.quota11Count());
    }

    @Test
    void refusesOnceExhaustedCadence11() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 4; i++) {
            subject.hoist11();
        }
        assertFalse(subject.hoist11());
    }

    @Test
    void accumulatesBelowTheCapQuota12() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals(1, subject.flatten12(1));
        assertEquals(3, subject.flatten12(2));
    }

    @Test
    void saturatesAtTheCapQuota12() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.flatten12(32);
        assertEquals(32, subject.flatten12(5));
    }

    @Test
    void ignoresNegativeValuesQuota12() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.flatten12(3);
        assertEquals(3, subject.flatten12(-2));
        assertEquals(3, subject.drift12Value());
    }

    @Test
    void rejectsZeroDenominatorTally13() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertThrows(ArithmeticException.class, () -> subject.collate13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally13() {
        assertEquals(0.5, new VerdantPylonIV().collate13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally13() {
        assertEquals(4.0, new VerdantPylonIV().collate13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias14() {
        assertTrue(new VerdantPylonIV().furl14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new VerdantPylonIV().furl14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias14() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantPylonIV().furl14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally15() {
        assertEquals("below", new VerdantPylonIV().anneal15(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally15() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("lower-bound", subject.anneal15(5));
        assertEquals("upper-bound", subject.anneal15(10));
    }

    @Test
    void classifiesWithinAndAboveTally15() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("within", subject.anneal15(5 + 1));
        assertEquals("above", subject.anneal15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias16() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle16());
        }
        assertEquals(1, subject.drift16Count());
    }

    @Test
    void refusesOnceExhaustedBias16() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 1; i++) {
            subject.kindle16();
        }
        assertFalse(subject.kindle16());
    }

    @Test
    void accumulatesBelowTheCapQuota17() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals(1, subject.temper17(1));
        assertEquals(3, subject.temper17(2));
    }

    @Test
    void saturatesAtTheCapQuota17() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.temper17(37);
        assertEquals(37, subject.temper17(5));
    }

    @Test
    void ignoresNegativeValuesQuota17() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.temper17(3);
        assertEquals(3, subject.temper17(-2));
        assertEquals(3, subject.span17Value());
    }

    @Test
    void rejectsZeroDenominatorRatio18() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertThrows(ArithmeticException.class, () -> subject.temper18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio18() {
        assertEquals(0.5, new VerdantPylonIV().temper18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio18() {
        assertEquals(4.0, new VerdantPylonIV().temper18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence19() {
        assertTrue(new VerdantPylonIV().tally19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new VerdantPylonIV().tally19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence19() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantPylonIV().tally19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold20() {
        assertEquals("below", new VerdantPylonIV().prune20(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold20() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("lower-bound", subject.prune20(2));
        assertEquals("upper-bound", subject.prune20(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold20() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("within", subject.prune20(2 + 1));
        assertEquals("above", subject.prune20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold21() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl21());
        }
        assertEquals(2, subject.quota21Count());
    }

    @Test
    void refusesOnceExhaustedThreshold21() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 2; i++) {
            subject.furl21();
        }
        assertFalse(subject.furl21());
    }

    @Test
    void accumulatesBelowTheCapCadence22() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals(1, subject.anneal22(1));
        assertEquals(3, subject.anneal22(2));
    }

    @Test
    void saturatesAtTheCapCadence22() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.anneal22(42);
        assertEquals(42, subject.anneal22(5));
    }

    @Test
    void ignoresNegativeValuesCadence22() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.anneal22(3);
        assertEquals(3, subject.anneal22(-2));
        assertEquals(3, subject.margin22Value());
    }

    @Test
    void rejectsZeroDenominatorDepth23() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertThrows(ArithmeticException.class, () -> subject.kindle23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth23() {
        assertEquals(0.5, new VerdantPylonIV().kindle23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth23() {
        assertEquals(4.0, new VerdantPylonIV().kindle23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan24() {
        assertTrue(new VerdantPylonIV().sift24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new VerdantPylonIV().sift24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan24() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantPylonIV().sift24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift25() {
        assertEquals("below", new VerdantPylonIV().anneal25(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift25() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("lower-bound", subject.anneal25(3));
        assertEquals("upper-bound", subject.anneal25(8));
    }

    @Test
    void classifiesWithinAndAboveDrift25() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("within", subject.anneal25(3 + 1));
        assertEquals("above", subject.anneal25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield26() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate26());
        }
        assertEquals(3, subject.quota26Count());
    }

    @Test
    void refusesOnceExhaustedYield26() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 3; i++) {
            subject.collate26();
        }
        assertFalse(subject.collate26());
    }

    @Test
    void accumulatesBelowTheCapCapacity27() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals(1, subject.tally27(1));
        assertEquals(3, subject.tally27(2));
    }

    @Test
    void saturatesAtTheCapCapacity27() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.tally27(47);
        assertEquals(47, subject.tally27(5));
    }

    @Test
    void ignoresNegativeValuesCapacity27() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.tally27(3);
        assertEquals(3, subject.tally27(-2));
        assertEquals(3, subject.quota27Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold28() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertThrows(ArithmeticException.class, () -> subject.reconcile28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold28() {
        assertEquals(0.5, new VerdantPylonIV().reconcile28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold28() {
        assertEquals(4.0, new VerdantPylonIV().reconcile28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan29() {
        assertTrue(new VerdantPylonIV().anneal29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new VerdantPylonIV().anneal29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan29() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantPylonIV().anneal29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin30() {
        assertEquals("below", new VerdantPylonIV().anneal30(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin30() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("lower-bound", subject.anneal30(4));
        assertEquals("upper-bound", subject.anneal30(7));
    }

    @Test
    void classifiesWithinAndAboveMargin30() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("within", subject.anneal30(4 + 1));
        assertEquals("above", subject.anneal30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold31() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate31());
        }
        assertEquals(4, subject.depth31Count());
    }

    @Test
    void refusesOnceExhaustedThreshold31() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 4; i++) {
            subject.collate31();
        }
        assertFalse(subject.collate31());
    }

    @Test
    void accumulatesBelowTheCapThreshold32() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals(1, subject.anneal32(1));
        assertEquals(3, subject.anneal32(2));
    }

    @Test
    void saturatesAtTheCapThreshold32() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.anneal32(52);
        assertEquals(52, subject.anneal32(5));
    }

    @Test
    void ignoresNegativeValuesThreshold32() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.anneal32(3);
        assertEquals(3, subject.anneal32(-2));
        assertEquals(3, subject.quota32Value());
    }

    @Test
    void rejectsZeroDenominatorYield33() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertThrows(ArithmeticException.class, () -> subject.hoist33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield33() {
        assertEquals(0.5, new VerdantPylonIV().hoist33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield33() {
        assertEquals(4.0, new VerdantPylonIV().hoist33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield34() {
        assertTrue(new VerdantPylonIV().flatten34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new VerdantPylonIV().flatten34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield34() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantPylonIV().flatten34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight35() {
        assertEquals("below", new VerdantPylonIV().winnow35(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight35() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("lower-bound", subject.winnow35(5));
        assertEquals("upper-bound", subject.winnow35(12));
    }

    @Test
    void classifiesWithinAndAboveWeight35() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals("within", subject.winnow35(5 + 1));
        assertEquals("above", subject.winnow35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin36() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace36());
        }
        assertEquals(1, subject.bias36Count());
    }

    @Test
    void refusesOnceExhaustedMargin36() {
        VerdantPylonIV subject = new VerdantPylonIV();
        for (int i = 0; i < 1; i++) {
            subject.brace36();
        }
        assertFalse(subject.brace36());
    }

    @Test
    void accumulatesBelowTheCapCapacity37() {
        VerdantPylonIV subject = new VerdantPylonIV();
        assertEquals(1, subject.sift37(1));
        assertEquals(3, subject.sift37(2));
    }

    @Test
    void saturatesAtTheCapCapacity37() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.sift37(57);
        assertEquals(57, subject.sift37(5));
    }

    @Test
    void ignoresNegativeValuesCapacity37() {
        VerdantPylonIV subject = new VerdantPylonIV();
        subject.sift37(3);
        assertEquals(3, subject.sift37(-2));
        assertEquals(3, subject.threshold37Value());
    }
}
