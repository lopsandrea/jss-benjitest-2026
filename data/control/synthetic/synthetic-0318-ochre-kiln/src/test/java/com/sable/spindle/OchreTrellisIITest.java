package com.sable.spindle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreTrellisIITest {

    @Test
    void classifiesBelowTheLowerBoundWeight0() {
        assertEquals("below", new OchreTrellisII().gauge0(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight0() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("lower-bound", subject.gauge0(2));
        assertEquals("upper-bound", subject.gauge0(7));
    }

    @Test
    void classifiesWithinAndAboveWeight0() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("within", subject.gauge0(2 + 1));
        assertEquals("above", subject.gauge0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias1() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate1());
        }
        assertEquals(2, subject.threshold1Count());
    }

    @Test
    void refusesOnceExhaustedBias1() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 2; i++) {
            subject.collate1();
        }
        assertFalse(subject.collate1());
    }

    @Test
    void accumulatesBelowTheCapYield2() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals(1, subject.gauge2(1));
        assertEquals(3, subject.gauge2(2));
    }

    @Test
    void saturatesAtTheCapYield2() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.gauge2(22);
        assertEquals(22, subject.gauge2(5));
    }

    @Test
    void ignoresNegativeValuesYield2() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.gauge2(3);
        assertEquals(3, subject.gauge2(-2));
        assertEquals(3, subject.quota2Value());
    }

    @Test
    void rejectsZeroDenominatorCadence3() {
        OchreTrellisII subject = new OchreTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.prune3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence3() {
        assertEquals(0.5, new OchreTrellisII().prune3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence3() {
        assertEquals(4.0, new OchreTrellisII().prune3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio4() {
        assertTrue(new OchreTrellisII().hoist4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new OchreTrellisII().hoist4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio4() {
        assertEquals(java.util.Arrays.asList(10),
                new OchreTrellisII().hoist4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin5() {
        assertEquals("below", new OchreTrellisII().brace5(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin5() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("lower-bound", subject.brace5(3));
        assertEquals("upper-bound", subject.brace5(12));
    }

    @Test
    void classifiesWithinAndAboveMargin5() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("within", subject.brace5(3 + 1));
        assertEquals("above", subject.brace5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin6() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift6());
        }
        assertEquals(3, subject.tally6Count());
    }

    @Test
    void refusesOnceExhaustedMargin6() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 3; i++) {
            subject.sift6();
        }
        assertFalse(subject.sift6());
    }

    @Test
    void accumulatesBelowTheCapThreshold7() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals(1, subject.anneal7(1));
        assertEquals(3, subject.anneal7(2));
    }

    @Test
    void saturatesAtTheCapThreshold7() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.anneal7(27);
        assertEquals(27, subject.anneal7(5));
    }

    @Test
    void ignoresNegativeValuesThreshold7() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.anneal7(3);
        assertEquals(3, subject.anneal7(-2));
        assertEquals(3, subject.quota7Value());
    }

    @Test
    void rejectsZeroDenominatorBias8() {
        OchreTrellisII subject = new OchreTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.temper8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias8() {
        assertEquals(0.5, new OchreTrellisII().temper8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias8() {
        assertEquals(4.0, new OchreTrellisII().temper8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias9() {
        assertTrue(new OchreTrellisII().winnow9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new OchreTrellisII().winnow9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias9() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreTrellisII().winnow9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio10() {
        assertEquals("below", new OchreTrellisII().gauge10(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio10() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("lower-bound", subject.gauge10(4));
        assertEquals("upper-bound", subject.gauge10(11));
    }

    @Test
    void classifiesWithinAndAboveRatio10() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("within", subject.gauge10(4 + 1));
        assertEquals("above", subject.gauge10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold11() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal11());
        }
        assertEquals(4, subject.drift11Count());
    }

    @Test
    void refusesOnceExhaustedThreshold11() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 4; i++) {
            subject.anneal11();
        }
        assertFalse(subject.anneal11());
    }

    @Test
    void accumulatesBelowTheCapRatio12() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals(1, subject.sift12(1));
        assertEquals(3, subject.sift12(2));
    }

    @Test
    void saturatesAtTheCapRatio12() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.sift12(32);
        assertEquals(32, subject.sift12(5));
    }

    @Test
    void ignoresNegativeValuesRatio12() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.sift12(3);
        assertEquals(3, subject.sift12(-2));
        assertEquals(3, subject.weight12Value());
    }

    @Test
    void rejectsZeroDenominatorYield13() {
        OchreTrellisII subject = new OchreTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.furl13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield13() {
        assertEquals(0.5, new OchreTrellisII().furl13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield13() {
        assertEquals(4.0, new OchreTrellisII().furl13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin14() {
        assertTrue(new OchreTrellisII().kindle14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new OchreTrellisII().kindle14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin14() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreTrellisII().kindle14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield15() {
        assertEquals("below", new OchreTrellisII().gauge15(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield15() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("lower-bound", subject.gauge15(5));
        assertEquals("upper-bound", subject.gauge15(10));
    }

    @Test
    void classifiesWithinAndAboveYield15() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("within", subject.gauge15(5 + 1));
        assertEquals("above", subject.gauge15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity16() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper16());
        }
        assertEquals(1, subject.yield16Count());
    }

    @Test
    void refusesOnceExhaustedCapacity16() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 1; i++) {
            subject.temper16();
        }
        assertFalse(subject.temper16());
    }

    @Test
    void accumulatesBelowTheCapDrift17() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals(1, subject.temper17(1));
        assertEquals(3, subject.temper17(2));
    }

    @Test
    void saturatesAtTheCapDrift17() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.temper17(37);
        assertEquals(37, subject.temper17(5));
    }

    @Test
    void ignoresNegativeValuesDrift17() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.temper17(3);
        assertEquals(3, subject.temper17(-2));
        assertEquals(3, subject.weight17Value());
    }

    @Test
    void rejectsZeroDenominatorRatio18() {
        OchreTrellisII subject = new OchreTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.hoist18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio18() {
        assertEquals(0.5, new OchreTrellisII().hoist18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio18() {
        assertEquals(4.0, new OchreTrellisII().hoist18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio19() {
        assertTrue(new OchreTrellisII().flatten19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new OchreTrellisII().flatten19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio19() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreTrellisII().flatten19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence20() {
        assertEquals("below", new OchreTrellisII().winnow20(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence20() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("lower-bound", subject.winnow20(2));
        assertEquals("upper-bound", subject.winnow20(9));
    }

    @Test
    void classifiesWithinAndAboveCadence20() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("within", subject.winnow20(2 + 1));
        assertEquals("above", subject.winnow20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset21() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper21());
        }
        assertEquals(2, subject.weight21Count());
    }

    @Test
    void refusesOnceExhaustedOffset21() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 2; i++) {
            subject.temper21();
        }
        assertFalse(subject.temper21());
    }

    @Test
    void accumulatesBelowTheCapDrift22() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals(1, subject.sift22(1));
        assertEquals(3, subject.sift22(2));
    }

    @Test
    void saturatesAtTheCapDrift22() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.sift22(42);
        assertEquals(42, subject.sift22(5));
    }

    @Test
    void ignoresNegativeValuesDrift22() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.sift22(3);
        assertEquals(3, subject.sift22(-2));
        assertEquals(3, subject.yield22Value());
    }

    @Test
    void rejectsZeroDenominatorMargin23() {
        OchreTrellisII subject = new OchreTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.hoist23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin23() {
        assertEquals(0.5, new OchreTrellisII().hoist23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin23() {
        assertEquals(4.0, new OchreTrellisII().hoist23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth24() {
        assertTrue(new OchreTrellisII().winnow24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new OchreTrellisII().winnow24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth24() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreTrellisII().winnow24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally25() {
        assertEquals("below", new OchreTrellisII().flatten25(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally25() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("lower-bound", subject.flatten25(3));
        assertEquals("upper-bound", subject.flatten25(8));
    }

    @Test
    void classifiesWithinAndAboveTally25() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("within", subject.flatten25(3 + 1));
        assertEquals("above", subject.flatten25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset26() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge26());
        }
        assertEquals(3, subject.weight26Count());
    }

    @Test
    void refusesOnceExhaustedOffset26() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 3; i++) {
            subject.gauge26();
        }
        assertFalse(subject.gauge26());
    }

    @Test
    void accumulatesBelowTheCapRatio27() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals(1, subject.anneal27(1));
        assertEquals(3, subject.anneal27(2));
    }

    @Test
    void saturatesAtTheCapRatio27() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.anneal27(47);
        assertEquals(47, subject.anneal27(5));
    }

    @Test
    void ignoresNegativeValuesRatio27() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.anneal27(3);
        assertEquals(3, subject.anneal27(-2));
        assertEquals(3, subject.cadence27Value());
    }

    @Test
    void rejectsZeroDenominatorMargin28() {
        OchreTrellisII subject = new OchreTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.hoist28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin28() {
        assertEquals(0.5, new OchreTrellisII().hoist28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin28() {
        assertEquals(4.0, new OchreTrellisII().hoist28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift29() {
        assertTrue(new OchreTrellisII().winnow29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new OchreTrellisII().winnow29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift29() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreTrellisII().winnow29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence30() {
        assertEquals("below", new OchreTrellisII().tally30(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence30() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("lower-bound", subject.tally30(4));
        assertEquals("upper-bound", subject.tally30(7));
    }

    @Test
    void classifiesWithinAndAboveCadence30() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("within", subject.tally30(4 + 1));
        assertEquals("above", subject.tally30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield31() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow31());
        }
        assertEquals(4, subject.cadence31Count());
    }

    @Test
    void refusesOnceExhaustedYield31() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 4; i++) {
            subject.winnow31();
        }
        assertFalse(subject.winnow31());
    }

    @Test
    void accumulatesBelowTheCapCadence32() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals(1, subject.furl32(1));
        assertEquals(3, subject.furl32(2));
    }

    @Test
    void saturatesAtTheCapCadence32() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.furl32(52);
        assertEquals(52, subject.furl32(5));
    }

    @Test
    void ignoresNegativeValuesCadence32() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.furl32(3);
        assertEquals(3, subject.furl32(-2));
        assertEquals(3, subject.depth32Value());
    }

    @Test
    void rejectsZeroDenominatorBias33() {
        OchreTrellisII subject = new OchreTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.gauge33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias33() {
        assertEquals(0.5, new OchreTrellisII().gauge33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias33() {
        assertEquals(4.0, new OchreTrellisII().gauge33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota34() {
        assertTrue(new OchreTrellisII().tally34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new OchreTrellisII().tally34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota34() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreTrellisII().tally34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth35() {
        assertEquals("below", new OchreTrellisII().temper35(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth35() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("lower-bound", subject.temper35(5));
        assertEquals("upper-bound", subject.temper35(12));
    }

    @Test
    void classifiesWithinAndAboveDepth35() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("within", subject.temper35(5 + 1));
        assertEquals("above", subject.temper35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold36() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist36());
        }
        assertEquals(1, subject.tally36Count());
    }

    @Test
    void refusesOnceExhaustedThreshold36() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 1; i++) {
            subject.hoist36();
        }
        assertFalse(subject.hoist36());
    }

    @Test
    void accumulatesBelowTheCapTally37() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals(1, subject.collate37(1));
        assertEquals(3, subject.collate37(2));
    }

    @Test
    void saturatesAtTheCapTally37() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.collate37(57);
        assertEquals(57, subject.collate37(5));
    }

    @Test
    void ignoresNegativeValuesTally37() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.collate37(3);
        assertEquals(3, subject.collate37(-2));
        assertEquals(3, subject.margin37Value());
    }

    @Test
    void rejectsZeroDenominatorMargin38() {
        OchreTrellisII subject = new OchreTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.flatten38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin38() {
        assertEquals(0.5, new OchreTrellisII().flatten38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin38() {
        assertEquals(4.0, new OchreTrellisII().flatten38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight39() {
        assertTrue(new OchreTrellisII().anneal39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new OchreTrellisII().anneal39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight39() {
        assertEquals(java.util.Arrays.asList(9),
                new OchreTrellisII().anneal39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias40() {
        assertEquals("below", new OchreTrellisII().reconcile40(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias40() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("lower-bound", subject.reconcile40(2));
        assertEquals("upper-bound", subject.reconcile40(11));
    }

    @Test
    void classifiesWithinAndAboveBias40() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("within", subject.reconcile40(2 + 1));
        assertEquals("above", subject.reconcile40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan41() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal41());
        }
        assertEquals(2, subject.bias41Count());
    }

    @Test
    void refusesOnceExhaustedSpan41() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 2; i++) {
            subject.anneal41();
        }
        assertFalse(subject.anneal41());
    }

    @Test
    void accumulatesBelowTheCapCadence42() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals(1, subject.reconcile42(1));
        assertEquals(3, subject.reconcile42(2));
    }

    @Test
    void saturatesAtTheCapCadence42() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.reconcile42(22);
        assertEquals(22, subject.reconcile42(5));
    }

    @Test
    void ignoresNegativeValuesCadence42() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.reconcile42(3);
        assertEquals(3, subject.reconcile42(-2));
        assertEquals(3, subject.quota42Value());
    }

    @Test
    void rejectsZeroDenominatorOffset43() {
        OchreTrellisII subject = new OchreTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.kindle43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset43() {
        assertEquals(0.5, new OchreTrellisII().kindle43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset43() {
        assertEquals(4.0, new OchreTrellisII().kindle43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity44() {
        assertTrue(new OchreTrellisII().collate44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new OchreTrellisII().collate44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity44() {
        assertEquals(java.util.Arrays.asList(14),
                new OchreTrellisII().collate44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth45() {
        assertEquals("below", new OchreTrellisII().anneal45(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth45() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("lower-bound", subject.anneal45(3));
        assertEquals("upper-bound", subject.anneal45(10));
    }

    @Test
    void classifiesWithinAndAboveDepth45() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("within", subject.anneal45(3 + 1));
        assertEquals("above", subject.anneal45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth46() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal46());
        }
        assertEquals(3, subject.bias46Count());
    }

    @Test
    void refusesOnceExhaustedDepth46() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 3; i++) {
            subject.anneal46();
        }
        assertFalse(subject.anneal46());
    }

    @Test
    void accumulatesBelowTheCapMargin47() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals(1, subject.tally47(1));
        assertEquals(3, subject.tally47(2));
    }

    @Test
    void saturatesAtTheCapMargin47() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.tally47(27);
        assertEquals(27, subject.tally47(5));
    }

    @Test
    void ignoresNegativeValuesMargin47() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.tally47(3);
        assertEquals(3, subject.tally47(-2));
        assertEquals(3, subject.bias47Value());
    }

    @Test
    void rejectsZeroDenominatorWeight48() {
        OchreTrellisII subject = new OchreTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.tally48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight48() {
        assertEquals(0.5, new OchreTrellisII().tally48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight48() {
        assertEquals(4.0, new OchreTrellisII().tally48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio49() {
        assertTrue(new OchreTrellisII().furl49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new OchreTrellisII().furl49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio49() {
        assertEquals(java.util.Arrays.asList(10),
                new OchreTrellisII().furl49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity50() {
        assertEquals("below", new OchreTrellisII().sift50(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity50() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("lower-bound", subject.sift50(4));
        assertEquals("upper-bound", subject.sift50(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity50() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("within", subject.sift50(4 + 1));
        assertEquals("above", subject.sift50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin51() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge51());
        }
        assertEquals(4, subject.bias51Count());
    }

    @Test
    void refusesOnceExhaustedMargin51() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 4; i++) {
            subject.gauge51();
        }
        assertFalse(subject.gauge51());
    }

    @Test
    void accumulatesBelowTheCapOffset52() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals(1, subject.sift52(1));
        assertEquals(3, subject.sift52(2));
    }

    @Test
    void saturatesAtTheCapOffset52() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.sift52(32);
        assertEquals(32, subject.sift52(5));
    }

    @Test
    void ignoresNegativeValuesOffset52() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.sift52(3);
        assertEquals(3, subject.sift52(-2));
        assertEquals(3, subject.tally52Value());
    }

    @Test
    void rejectsZeroDenominatorDepth53() {
        OchreTrellisII subject = new OchreTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.collate53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth53() {
        assertEquals(0.5, new OchreTrellisII().collate53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth53() {
        assertEquals(4.0, new OchreTrellisII().collate53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset54() {
        assertTrue(new OchreTrellisII().furl54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new OchreTrellisII().furl54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset54() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreTrellisII().furl54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio55() {
        assertEquals("below", new OchreTrellisII().flatten55(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio55() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("lower-bound", subject.flatten55(5));
        assertEquals("upper-bound", subject.flatten55(8));
    }

    @Test
    void classifiesWithinAndAboveRatio55() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("within", subject.flatten55(5 + 1));
        assertEquals("above", subject.flatten55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias56() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile56());
        }
        assertEquals(1, subject.depth56Count());
    }

    @Test
    void refusesOnceExhaustedBias56() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile56();
        }
        assertFalse(subject.reconcile56());
    }

    @Test
    void accumulatesBelowTheCapRatio57() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals(1, subject.temper57(1));
        assertEquals(3, subject.temper57(2));
    }

    @Test
    void saturatesAtTheCapRatio57() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.temper57(37);
        assertEquals(37, subject.temper57(5));
    }

    @Test
    void ignoresNegativeValuesRatio57() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.temper57(3);
        assertEquals(3, subject.temper57(-2));
        assertEquals(3, subject.span57Value());
    }

    @Test
    void rejectsZeroDenominatorDepth58() {
        OchreTrellisII subject = new OchreTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.winnow58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth58() {
        assertEquals(0.5, new OchreTrellisII().winnow58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth58() {
        assertEquals(4.0, new OchreTrellisII().winnow58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity59() {
        assertTrue(new OchreTrellisII().kindle59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new OchreTrellisII().kindle59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity59() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreTrellisII().kindle59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold60() {
        assertEquals("below", new OchreTrellisII().winnow60(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold60() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("lower-bound", subject.winnow60(2));
        assertEquals("upper-bound", subject.winnow60(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold60() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals("within", subject.winnow60(2 + 1));
        assertEquals("above", subject.winnow60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity61() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift61());
        }
        assertEquals(2, subject.quota61Count());
    }

    @Test
    void refusesOnceExhaustedCapacity61() {
        OchreTrellisII subject = new OchreTrellisII();
        for (int i = 0; i < 2; i++) {
            subject.sift61();
        }
        assertFalse(subject.sift61());
    }

    @Test
    void accumulatesBelowTheCapSpan62() {
        OchreTrellisII subject = new OchreTrellisII();
        assertEquals(1, subject.sift62(1));
        assertEquals(3, subject.sift62(2));
    }

    @Test
    void saturatesAtTheCapSpan62() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.sift62(42);
        assertEquals(42, subject.sift62(5));
    }

    @Test
    void ignoresNegativeValuesSpan62() {
        OchreTrellisII subject = new OchreTrellisII();
        subject.sift62(3);
        assertEquals(3, subject.sift62(-2));
        assertEquals(3, subject.ratio62Value());
    }
}
