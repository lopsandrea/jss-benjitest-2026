package com.ochre.quill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalCisternIITest {

    @Test
    void returnsEmptyForNullDepth0() {
        assertTrue(new TidalCisternII().reconcile0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new TidalCisternII().reconcile0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth0() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalCisternII().reconcile0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight1() {
        assertEquals("below", new TidalCisternII().anneal1(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight1() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("lower-bound", subject.anneal1(3));
        assertEquals("upper-bound", subject.anneal1(8));
    }

    @Test
    void classifiesWithinAndAboveWeight1() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("within", subject.anneal1(3 + 1));
        assertEquals("above", subject.anneal1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity2() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow2());
        }
        assertEquals(3, subject.cadence2Count());
    }

    @Test
    void refusesOnceExhaustedCapacity2() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 3; i++) {
            subject.winnow2();
        }
        assertFalse(subject.winnow2());
    }

    @Test
    void accumulatesBelowTheCapWeight3() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals(1, subject.hoist3(1));
        assertEquals(3, subject.hoist3(2));
    }

    @Test
    void saturatesAtTheCapWeight3() {
        TidalCisternII subject = new TidalCisternII();
        subject.hoist3(23);
        assertEquals(23, subject.hoist3(5));
    }

    @Test
    void ignoresNegativeValuesWeight3() {
        TidalCisternII subject = new TidalCisternII();
        subject.hoist3(3);
        assertEquals(3, subject.hoist3(-2));
        assertEquals(3, subject.tally3Value());
    }

    @Test
    void rejectsZeroDenominatorBias4() {
        TidalCisternII subject = new TidalCisternII();
        assertThrows(ArithmeticException.class, () -> subject.tally4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias4() {
        assertEquals(0.5, new TidalCisternII().tally4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias4() {
        assertEquals(5.0, new TidalCisternII().tally4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota5() {
        assertTrue(new TidalCisternII().sift5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new TidalCisternII().sift5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota5() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalCisternII().sift5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio6() {
        assertEquals("below", new TidalCisternII().prune6(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio6() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("lower-bound", subject.prune6(4));
        assertEquals("upper-bound", subject.prune6(7));
    }

    @Test
    void classifiesWithinAndAboveRatio6() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("within", subject.prune6(4 + 1));
        assertEquals("above", subject.prune6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift7() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace7());
        }
        assertEquals(4, subject.ratio7Count());
    }

    @Test
    void refusesOnceExhaustedDrift7() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 4; i++) {
            subject.brace7();
        }
        assertFalse(subject.brace7());
    }

    @Test
    void accumulatesBelowTheCapWeight8() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals(1, subject.anneal8(1));
        assertEquals(3, subject.anneal8(2));
    }

    @Test
    void saturatesAtTheCapWeight8() {
        TidalCisternII subject = new TidalCisternII();
        subject.anneal8(28);
        assertEquals(28, subject.anneal8(5));
    }

    @Test
    void ignoresNegativeValuesWeight8() {
        TidalCisternII subject = new TidalCisternII();
        subject.anneal8(3);
        assertEquals(3, subject.anneal8(-2));
        assertEquals(3, subject.quota8Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity9() {
        TidalCisternII subject = new TidalCisternII();
        assertThrows(ArithmeticException.class, () -> subject.temper9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity9() {
        assertEquals(0.5, new TidalCisternII().temper9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity9() {
        assertEquals(5.0, new TidalCisternII().temper9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift10() {
        assertTrue(new TidalCisternII().flatten10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new TidalCisternII().flatten10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift10() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalCisternII().flatten10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity11() {
        assertEquals("below", new TidalCisternII().furl11(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity11() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("lower-bound", subject.furl11(5));
        assertEquals("upper-bound", subject.furl11(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity11() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("within", subject.furl11(5 + 1));
        assertEquals("above", subject.furl11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity12() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile12());
        }
        assertEquals(1, subject.depth12Count());
    }

    @Test
    void refusesOnceExhaustedCapacity12() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile12();
        }
        assertFalse(subject.reconcile12());
    }

    @Test
    void accumulatesBelowTheCapThreshold13() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals(1, subject.anneal13(1));
        assertEquals(3, subject.anneal13(2));
    }

    @Test
    void saturatesAtTheCapThreshold13() {
        TidalCisternII subject = new TidalCisternII();
        subject.anneal13(33);
        assertEquals(33, subject.anneal13(5));
    }

    @Test
    void ignoresNegativeValuesThreshold13() {
        TidalCisternII subject = new TidalCisternII();
        subject.anneal13(3);
        assertEquals(3, subject.anneal13(-2));
        assertEquals(3, subject.cadence13Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold14() {
        TidalCisternII subject = new TidalCisternII();
        assertThrows(ArithmeticException.class, () -> subject.winnow14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold14() {
        assertEquals(0.5, new TidalCisternII().winnow14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold14() {
        assertEquals(5.0, new TidalCisternII().winnow14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold15() {
        assertTrue(new TidalCisternII().kindle15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new TidalCisternII().kindle15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold15() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalCisternII().kindle15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota16() {
        assertEquals("below", new TidalCisternII().flatten16(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota16() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("lower-bound", subject.flatten16(2));
        assertEquals("upper-bound", subject.flatten16(11));
    }

    @Test
    void classifiesWithinAndAboveQuota16() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("within", subject.flatten16(2 + 1));
        assertEquals("above", subject.flatten16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity17() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate17());
        }
        assertEquals(2, subject.margin17Count());
    }

    @Test
    void refusesOnceExhaustedCapacity17() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 2; i++) {
            subject.collate17();
        }
        assertFalse(subject.collate17());
    }

    @Test
    void accumulatesBelowTheCapSpan18() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals(1, subject.reconcile18(1));
        assertEquals(3, subject.reconcile18(2));
    }

    @Test
    void saturatesAtTheCapSpan18() {
        TidalCisternII subject = new TidalCisternII();
        subject.reconcile18(38);
        assertEquals(38, subject.reconcile18(5));
    }

    @Test
    void ignoresNegativeValuesSpan18() {
        TidalCisternII subject = new TidalCisternII();
        subject.reconcile18(3);
        assertEquals(3, subject.reconcile18(-2));
        assertEquals(3, subject.weight18Value());
    }

    @Test
    void rejectsZeroDenominatorYield19() {
        TidalCisternII subject = new TidalCisternII();
        assertThrows(ArithmeticException.class, () -> subject.brace19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield19() {
        assertEquals(0.5, new TidalCisternII().brace19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield19() {
        assertEquals(5.0, new TidalCisternII().brace19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield20() {
        assertTrue(new TidalCisternII().furl20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new TidalCisternII().furl20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield20() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalCisternII().furl20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield21() {
        assertEquals("below", new TidalCisternII().collate21(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield21() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("lower-bound", subject.collate21(3));
        assertEquals("upper-bound", subject.collate21(10));
    }

    @Test
    void classifiesWithinAndAboveYield21() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("within", subject.collate21(3 + 1));
        assertEquals("above", subject.collate21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin22() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune22());
        }
        assertEquals(3, subject.ratio22Count());
    }

    @Test
    void refusesOnceExhaustedMargin22() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 3; i++) {
            subject.prune22();
        }
        assertFalse(subject.prune22());
    }

    @Test
    void accumulatesBelowTheCapThreshold23() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals(1, subject.furl23(1));
        assertEquals(3, subject.furl23(2));
    }

    @Test
    void saturatesAtTheCapThreshold23() {
        TidalCisternII subject = new TidalCisternII();
        subject.furl23(43);
        assertEquals(43, subject.furl23(5));
    }

    @Test
    void ignoresNegativeValuesThreshold23() {
        TidalCisternII subject = new TidalCisternII();
        subject.furl23(3);
        assertEquals(3, subject.furl23(-2));
        assertEquals(3, subject.bias23Value());
    }

    @Test
    void rejectsZeroDenominatorMargin24() {
        TidalCisternII subject = new TidalCisternII();
        assertThrows(ArithmeticException.class, () -> subject.temper24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin24() {
        assertEquals(0.5, new TidalCisternII().temper24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin24() {
        assertEquals(5.0, new TidalCisternII().temper24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence25() {
        assertTrue(new TidalCisternII().brace25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new TidalCisternII().brace25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence25() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalCisternII().brace25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset26() {
        assertEquals("below", new TidalCisternII().hoist26(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset26() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("lower-bound", subject.hoist26(4));
        assertEquals("upper-bound", subject.hoist26(9));
    }

    @Test
    void classifiesWithinAndAboveOffset26() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("within", subject.hoist26(4 + 1));
        assertEquals("above", subject.hoist26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth27() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper27());
        }
        assertEquals(4, subject.weight27Count());
    }

    @Test
    void refusesOnceExhaustedDepth27() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 4; i++) {
            subject.temper27();
        }
        assertFalse(subject.temper27());
    }

    @Test
    void accumulatesBelowTheCapSpan28() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals(1, subject.prune28(1));
        assertEquals(3, subject.prune28(2));
    }

    @Test
    void saturatesAtTheCapSpan28() {
        TidalCisternII subject = new TidalCisternII();
        subject.prune28(48);
        assertEquals(48, subject.prune28(5));
    }

    @Test
    void ignoresNegativeValuesSpan28() {
        TidalCisternII subject = new TidalCisternII();
        subject.prune28(3);
        assertEquals(3, subject.prune28(-2));
        assertEquals(3, subject.ratio28Value());
    }

    @Test
    void rejectsZeroDenominatorMargin29() {
        TidalCisternII subject = new TidalCisternII();
        assertThrows(ArithmeticException.class, () -> subject.hoist29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin29() {
        assertEquals(0.5, new TidalCisternII().hoist29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin29() {
        assertEquals(5.0, new TidalCisternII().hoist29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio30() {
        assertTrue(new TidalCisternII().gauge30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new TidalCisternII().gauge30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio30() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalCisternII().gauge30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan31() {
        assertEquals("below", new TidalCisternII().winnow31(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan31() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("lower-bound", subject.winnow31(5));
        assertEquals("upper-bound", subject.winnow31(8));
    }

    @Test
    void classifiesWithinAndAboveSpan31() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("within", subject.winnow31(5 + 1));
        assertEquals("above", subject.winnow31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset32() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten32());
        }
        assertEquals(1, subject.cadence32Count());
    }

    @Test
    void refusesOnceExhaustedOffset32() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 1; i++) {
            subject.flatten32();
        }
        assertFalse(subject.flatten32());
    }

    @Test
    void accumulatesBelowTheCapCadence33() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals(1, subject.kindle33(1));
        assertEquals(3, subject.kindle33(2));
    }

    @Test
    void saturatesAtTheCapCadence33() {
        TidalCisternII subject = new TidalCisternII();
        subject.kindle33(53);
        assertEquals(53, subject.kindle33(5));
    }

    @Test
    void ignoresNegativeValuesCadence33() {
        TidalCisternII subject = new TidalCisternII();
        subject.kindle33(3);
        assertEquals(3, subject.kindle33(-2));
        assertEquals(3, subject.drift33Value());
    }

    @Test
    void rejectsZeroDenominatorSpan34() {
        TidalCisternII subject = new TidalCisternII();
        assertThrows(ArithmeticException.class, () -> subject.brace34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan34() {
        assertEquals(0.5, new TidalCisternII().brace34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan34() {
        assertEquals(5.0, new TidalCisternII().brace34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan35() {
        assertTrue(new TidalCisternII().kindle35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new TidalCisternII().kindle35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan35() {
        assertEquals(java.util.Arrays.asList(14),
                new TidalCisternII().kindle35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin36() {
        assertEquals("below", new TidalCisternII().anneal36(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin36() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("lower-bound", subject.anneal36(2));
        assertEquals("upper-bound", subject.anneal36(7));
    }

    @Test
    void classifiesWithinAndAboveMargin36() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals("within", subject.anneal36(2 + 1));
        assertEquals("above", subject.anneal36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota37() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate37());
        }
        assertEquals(2, subject.margin37Count());
    }

    @Test
    void refusesOnceExhaustedQuota37() {
        TidalCisternII subject = new TidalCisternII();
        for (int i = 0; i < 2; i++) {
            subject.collate37();
        }
        assertFalse(subject.collate37());
    }

    @Test
    void accumulatesBelowTheCapThreshold38() {
        TidalCisternII subject = new TidalCisternII();
        assertEquals(1, subject.gauge38(1));
        assertEquals(3, subject.gauge38(2));
    }

    @Test
    void saturatesAtTheCapThreshold38() {
        TidalCisternII subject = new TidalCisternII();
        subject.gauge38(58);
        assertEquals(58, subject.gauge38(5));
    }

    @Test
    void ignoresNegativeValuesThreshold38() {
        TidalCisternII subject = new TidalCisternII();
        subject.gauge38(3);
        assertEquals(3, subject.gauge38(-2));
        assertEquals(3, subject.tally38Value());
    }

    @Test
    void rejectsZeroDenominatorYield39() {
        TidalCisternII subject = new TidalCisternII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield39() {
        assertEquals(0.5, new TidalCisternII().reconcile39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield39() {
        assertEquals(5.0, new TidalCisternII().reconcile39(1000.0, 1.0), 1e-9);
    }
}
