package com.bramble.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowPylonIITest {

    @Test
    void rejectsZeroDenominatorCadence0() {
        HollowPylonII subject = new HollowPylonII();
        assertThrows(ArithmeticException.class, () -> subject.prune0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence0() {
        assertEquals(0.5, new HollowPylonII().prune0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence0() {
        assertEquals(1.0, new HollowPylonII().prune0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan1() {
        assertTrue(new HollowPylonII().collate1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new HollowPylonII().collate1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan1() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowPylonII().collate1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity2() {
        assertEquals("below", new HollowPylonII().gauge2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity2() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("lower-bound", subject.gauge2(4));
        assertEquals("upper-bound", subject.gauge2(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity2() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("within", subject.gauge2(4 + 1));
        assertEquals("above", subject.gauge2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift3() {
        HollowPylonII subject = new HollowPylonII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten3());
        }
        assertEquals(4, subject.offset3Count());
    }

    @Test
    void refusesOnceExhaustedDrift3() {
        HollowPylonII subject = new HollowPylonII();
        for (int i = 0; i < 4; i++) {
            subject.flatten3();
        }
        assertFalse(subject.flatten3());
    }

    @Test
    void accumulatesBelowTheCapWeight4() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals(1, subject.hoist4(1));
        assertEquals(3, subject.hoist4(2));
    }

    @Test
    void saturatesAtTheCapWeight4() {
        HollowPylonII subject = new HollowPylonII();
        subject.hoist4(24);
        assertEquals(24, subject.hoist4(5));
    }

    @Test
    void ignoresNegativeValuesWeight4() {
        HollowPylonII subject = new HollowPylonII();
        subject.hoist4(3);
        assertEquals(3, subject.hoist4(-2));
        assertEquals(3, subject.cadence4Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity5() {
        HollowPylonII subject = new HollowPylonII();
        assertThrows(ArithmeticException.class, () -> subject.temper5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity5() {
        assertEquals(0.5, new HollowPylonII().temper5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity5() {
        assertEquals(1.0, new HollowPylonII().temper5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally6() {
        assertTrue(new HollowPylonII().flatten6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new HollowPylonII().flatten6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally6() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowPylonII().flatten6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias7() {
        assertEquals("below", new HollowPylonII().winnow7(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias7() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("lower-bound", subject.winnow7(5));
        assertEquals("upper-bound", subject.winnow7(8));
    }

    @Test
    void classifiesWithinAndAboveBias7() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("within", subject.winnow7(5 + 1));
        assertEquals("above", subject.winnow7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight8() {
        HollowPylonII subject = new HollowPylonII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge8());
        }
        assertEquals(1, subject.offset8Count());
    }

    @Test
    void refusesOnceExhaustedWeight8() {
        HollowPylonII subject = new HollowPylonII();
        for (int i = 0; i < 1; i++) {
            subject.gauge8();
        }
        assertFalse(subject.gauge8());
    }

    @Test
    void accumulatesBelowTheCapCadence9() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals(1, subject.tally9(1));
        assertEquals(3, subject.tally9(2));
    }

    @Test
    void saturatesAtTheCapCadence9() {
        HollowPylonII subject = new HollowPylonII();
        subject.tally9(29);
        assertEquals(29, subject.tally9(5));
    }

    @Test
    void ignoresNegativeValuesCadence9() {
        HollowPylonII subject = new HollowPylonII();
        subject.tally9(3);
        assertEquals(3, subject.tally9(-2));
        assertEquals(3, subject.drift9Value());
    }

    @Test
    void rejectsZeroDenominatorRatio10() {
        HollowPylonII subject = new HollowPylonII();
        assertThrows(ArithmeticException.class, () -> subject.temper10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio10() {
        assertEquals(0.5, new HollowPylonII().temper10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio10() {
        assertEquals(1.0, new HollowPylonII().temper10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity11() {
        assertTrue(new HollowPylonII().brace11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new HollowPylonII().brace11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity11() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowPylonII().brace11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift12() {
        assertEquals("below", new HollowPylonII().temper12(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift12() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("lower-bound", subject.temper12(2));
        assertEquals("upper-bound", subject.temper12(7));
    }

    @Test
    void classifiesWithinAndAboveDrift12() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("within", subject.temper12(2 + 1));
        assertEquals("above", subject.temper12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan13() {
        HollowPylonII subject = new HollowPylonII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle13());
        }
        assertEquals(2, subject.quota13Count());
    }

    @Test
    void refusesOnceExhaustedSpan13() {
        HollowPylonII subject = new HollowPylonII();
        for (int i = 0; i < 2; i++) {
            subject.kindle13();
        }
        assertFalse(subject.kindle13());
    }

    @Test
    void accumulatesBelowTheCapOffset14() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals(1, subject.reconcile14(1));
        assertEquals(3, subject.reconcile14(2));
    }

    @Test
    void saturatesAtTheCapOffset14() {
        HollowPylonII subject = new HollowPylonII();
        subject.reconcile14(34);
        assertEquals(34, subject.reconcile14(5));
    }

    @Test
    void ignoresNegativeValuesOffset14() {
        HollowPylonII subject = new HollowPylonII();
        subject.reconcile14(3);
        assertEquals(3, subject.reconcile14(-2));
        assertEquals(3, subject.cadence14Value());
    }

    @Test
    void rejectsZeroDenominatorBias15() {
        HollowPylonII subject = new HollowPylonII();
        assertThrows(ArithmeticException.class, () -> subject.sift15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias15() {
        assertEquals(0.5, new HollowPylonII().sift15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias15() {
        assertEquals(1.0, new HollowPylonII().sift15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity16() {
        assertTrue(new HollowPylonII().hoist16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new HollowPylonII().hoist16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity16() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowPylonII().hoist16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight17() {
        assertEquals("below", new HollowPylonII().flatten17(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight17() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("lower-bound", subject.flatten17(3));
        assertEquals("upper-bound", subject.flatten17(12));
    }

    @Test
    void classifiesWithinAndAboveWeight17() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("within", subject.flatten17(3 + 1));
        assertEquals("above", subject.flatten17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset18() {
        HollowPylonII subject = new HollowPylonII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper18());
        }
        assertEquals(3, subject.threshold18Count());
    }

    @Test
    void refusesOnceExhaustedOffset18() {
        HollowPylonII subject = new HollowPylonII();
        for (int i = 0; i < 3; i++) {
            subject.temper18();
        }
        assertFalse(subject.temper18());
    }

    @Test
    void accumulatesBelowTheCapTally19() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals(1, subject.kindle19(1));
        assertEquals(3, subject.kindle19(2));
    }

    @Test
    void saturatesAtTheCapTally19() {
        HollowPylonII subject = new HollowPylonII();
        subject.kindle19(39);
        assertEquals(39, subject.kindle19(5));
    }

    @Test
    void ignoresNegativeValuesTally19() {
        HollowPylonII subject = new HollowPylonII();
        subject.kindle19(3);
        assertEquals(3, subject.kindle19(-2));
        assertEquals(3, subject.span19Value());
    }

    @Test
    void rejectsZeroDenominatorTally20() {
        HollowPylonII subject = new HollowPylonII();
        assertThrows(ArithmeticException.class, () -> subject.furl20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally20() {
        assertEquals(0.5, new HollowPylonII().furl20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally20() {
        assertEquals(1.0, new HollowPylonII().furl20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally21() {
        assertTrue(new HollowPylonII().collate21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new HollowPylonII().collate21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally21() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowPylonII().collate21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth22() {
        assertEquals("below", new HollowPylonII().anneal22(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth22() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("lower-bound", subject.anneal22(4));
        assertEquals("upper-bound", subject.anneal22(11));
    }

    @Test
    void classifiesWithinAndAboveDepth22() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("within", subject.anneal22(4 + 1));
        assertEquals("above", subject.anneal22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias23() {
        HollowPylonII subject = new HollowPylonII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift23());
        }
        assertEquals(4, subject.quota23Count());
    }

    @Test
    void refusesOnceExhaustedBias23() {
        HollowPylonII subject = new HollowPylonII();
        for (int i = 0; i < 4; i++) {
            subject.sift23();
        }
        assertFalse(subject.sift23());
    }

    @Test
    void accumulatesBelowTheCapOffset24() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals(1, subject.sift24(1));
        assertEquals(3, subject.sift24(2));
    }

    @Test
    void saturatesAtTheCapOffset24() {
        HollowPylonII subject = new HollowPylonII();
        subject.sift24(44);
        assertEquals(44, subject.sift24(5));
    }

    @Test
    void ignoresNegativeValuesOffset24() {
        HollowPylonII subject = new HollowPylonII();
        subject.sift24(3);
        assertEquals(3, subject.sift24(-2));
        assertEquals(3, subject.quota24Value());
    }

    @Test
    void rejectsZeroDenominatorRatio25() {
        HollowPylonII subject = new HollowPylonII();
        assertThrows(ArithmeticException.class, () -> subject.gauge25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio25() {
        assertEquals(0.5, new HollowPylonII().gauge25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio25() {
        assertEquals(1.0, new HollowPylonII().gauge25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift26() {
        assertTrue(new HollowPylonII().collate26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new HollowPylonII().collate26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift26() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowPylonII().collate26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan27() {
        assertEquals("below", new HollowPylonII().flatten27(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan27() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("lower-bound", subject.flatten27(5));
        assertEquals("upper-bound", subject.flatten27(10));
    }

    @Test
    void classifiesWithinAndAboveSpan27() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("within", subject.flatten27(5 + 1));
        assertEquals("above", subject.flatten27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota28() {
        HollowPylonII subject = new HollowPylonII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate28());
        }
        assertEquals(1, subject.drift28Count());
    }

    @Test
    void refusesOnceExhaustedQuota28() {
        HollowPylonII subject = new HollowPylonII();
        for (int i = 0; i < 1; i++) {
            subject.collate28();
        }
        assertFalse(subject.collate28());
    }

    @Test
    void accumulatesBelowTheCapOffset29() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals(1, subject.furl29(1));
        assertEquals(3, subject.furl29(2));
    }

    @Test
    void saturatesAtTheCapOffset29() {
        HollowPylonII subject = new HollowPylonII();
        subject.furl29(49);
        assertEquals(49, subject.furl29(5));
    }

    @Test
    void ignoresNegativeValuesOffset29() {
        HollowPylonII subject = new HollowPylonII();
        subject.furl29(3);
        assertEquals(3, subject.furl29(-2));
        assertEquals(3, subject.drift29Value());
    }

    @Test
    void rejectsZeroDenominatorRatio30() {
        HollowPylonII subject = new HollowPylonII();
        assertThrows(ArithmeticException.class, () -> subject.tally30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio30() {
        assertEquals(0.5, new HollowPylonII().tally30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio30() {
        assertEquals(1.0, new HollowPylonII().tally30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity31() {
        assertTrue(new HollowPylonII().brace31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new HollowPylonII().brace31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity31() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowPylonII().brace31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight32() {
        assertEquals("below", new HollowPylonII().sift32(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight32() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("lower-bound", subject.sift32(2));
        assertEquals("upper-bound", subject.sift32(9));
    }

    @Test
    void classifiesWithinAndAboveWeight32() {
        HollowPylonII subject = new HollowPylonII();
        assertEquals("within", subject.sift32(2 + 1));
        assertEquals("above", subject.sift32(9 + 1));
    }
}
