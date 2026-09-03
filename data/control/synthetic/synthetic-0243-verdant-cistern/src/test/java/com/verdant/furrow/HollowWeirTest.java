package com.verdant.furrow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowWeirTest {

    @Test
    void classifiesBelowTheLowerBoundQuota0() {
        assertEquals("below", new HollowWeir().flatten0(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota0() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.flatten0(2));
        assertEquals("upper-bound", subject.flatten0(7));
    }

    @Test
    void classifiesWithinAndAboveQuota0() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.flatten0(2 + 1));
        assertEquals("above", subject.flatten0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth1() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper1());
        }
        assertEquals(2, subject.ratio1Count());
    }

    @Test
    void refusesOnceExhaustedDepth1() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 2; i++) {
            subject.temper1();
        }
        assertFalse(subject.temper1());
    }

    @Test
    void accumulatesBelowTheCapYield2() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.anneal2(1));
        assertEquals(3, subject.anneal2(2));
    }

    @Test
    void saturatesAtTheCapYield2() {
        HollowWeir subject = new HollowWeir();
        subject.anneal2(22);
        assertEquals(22, subject.anneal2(5));
    }

    @Test
    void ignoresNegativeValuesYield2() {
        HollowWeir subject = new HollowWeir();
        subject.anneal2(3);
        assertEquals(3, subject.anneal2(-2));
        assertEquals(3, subject.tally2Value());
    }

    @Test
    void rejectsZeroDenominatorBias3() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.winnow3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias3() {
        assertEquals(0.5, new HollowWeir().winnow3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias3() {
        assertEquals(4.0, new HollowWeir().winnow3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin4() {
        assertTrue(new HollowWeir().tally4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new HollowWeir().tally4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin4() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowWeir().tally4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota5() {
        assertEquals("below", new HollowWeir().reconcile5(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota5() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.reconcile5(3));
        assertEquals("upper-bound", subject.reconcile5(12));
    }

    @Test
    void classifiesWithinAndAboveQuota5() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.reconcile5(3 + 1));
        assertEquals("above", subject.reconcile5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally6() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl6());
        }
        assertEquals(3, subject.yield6Count());
    }

    @Test
    void refusesOnceExhaustedTally6() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 3; i++) {
            subject.furl6();
        }
        assertFalse(subject.furl6());
    }

    @Test
    void accumulatesBelowTheCapDepth7() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.brace7(1));
        assertEquals(3, subject.brace7(2));
    }

    @Test
    void saturatesAtTheCapDepth7() {
        HollowWeir subject = new HollowWeir();
        subject.brace7(27);
        assertEquals(27, subject.brace7(5));
    }

    @Test
    void ignoresNegativeValuesDepth7() {
        HollowWeir subject = new HollowWeir();
        subject.brace7(3);
        assertEquals(3, subject.brace7(-2));
        assertEquals(3, subject.tally7Value());
    }

    @Test
    void rejectsZeroDenominatorYield8() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.winnow8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield8() {
        assertEquals(0.5, new HollowWeir().winnow8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield8() {
        assertEquals(4.0, new HollowWeir().winnow8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin9() {
        assertTrue(new HollowWeir().winnow9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new HollowWeir().winnow9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin9() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowWeir().winnow9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally10() {
        assertEquals("below", new HollowWeir().furl10(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally10() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.furl10(4));
        assertEquals("upper-bound", subject.furl10(11));
    }

    @Test
    void classifiesWithinAndAboveTally10() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.furl10(4 + 1));
        assertEquals("above", subject.furl10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield11() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift11());
        }
        assertEquals(4, subject.ratio11Count());
    }

    @Test
    void refusesOnceExhaustedYield11() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 4; i++) {
            subject.sift11();
        }
        assertFalse(subject.sift11());
    }

    @Test
    void accumulatesBelowTheCapCadence12() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.sift12(1));
        assertEquals(3, subject.sift12(2));
    }

    @Test
    void saturatesAtTheCapCadence12() {
        HollowWeir subject = new HollowWeir();
        subject.sift12(32);
        assertEquals(32, subject.sift12(5));
    }

    @Test
    void ignoresNegativeValuesCadence12() {
        HollowWeir subject = new HollowWeir();
        subject.sift12(3);
        assertEquals(3, subject.sift12(-2));
        assertEquals(3, subject.depth12Value());
    }

    @Test
    void rejectsZeroDenominatorWeight13() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.anneal13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight13() {
        assertEquals(0.5, new HollowWeir().anneal13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight13() {
        assertEquals(4.0, new HollowWeir().anneal13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota14() {
        assertTrue(new HollowWeir().reconcile14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new HollowWeir().reconcile14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota14() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowWeir().reconcile14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias15() {
        assertEquals("below", new HollowWeir().tally15(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias15() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.tally15(5));
        assertEquals("upper-bound", subject.tally15(10));
    }

    @Test
    void classifiesWithinAndAboveBias15() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.tally15(5 + 1));
        assertEquals("above", subject.tally15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold16() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune16());
        }
        assertEquals(1, subject.weight16Count());
    }

    @Test
    void refusesOnceExhaustedThreshold16() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 1; i++) {
            subject.prune16();
        }
        assertFalse(subject.prune16());
    }

    @Test
    void accumulatesBelowTheCapQuota17() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.prune17(1));
        assertEquals(3, subject.prune17(2));
    }

    @Test
    void saturatesAtTheCapQuota17() {
        HollowWeir subject = new HollowWeir();
        subject.prune17(37);
        assertEquals(37, subject.prune17(5));
    }

    @Test
    void ignoresNegativeValuesQuota17() {
        HollowWeir subject = new HollowWeir();
        subject.prune17(3);
        assertEquals(3, subject.prune17(-2));
        assertEquals(3, subject.bias17Value());
    }

    @Test
    void rejectsZeroDenominatorQuota18() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.hoist18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota18() {
        assertEquals(0.5, new HollowWeir().hoist18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota18() {
        assertEquals(4.0, new HollowWeir().hoist18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally19() {
        assertTrue(new HollowWeir().furl19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new HollowWeir().furl19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally19() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowWeir().furl19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota20() {
        assertEquals("below", new HollowWeir().collate20(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota20() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.collate20(2));
        assertEquals("upper-bound", subject.collate20(9));
    }

    @Test
    void classifiesWithinAndAboveQuota20() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.collate20(2 + 1));
        assertEquals("above", subject.collate20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity21() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper21());
        }
        assertEquals(2, subject.offset21Count());
    }

    @Test
    void refusesOnceExhaustedCapacity21() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 2; i++) {
            subject.temper21();
        }
        assertFalse(subject.temper21());
    }

    @Test
    void accumulatesBelowTheCapThreshold22() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.brace22(1));
        assertEquals(3, subject.brace22(2));
    }

    @Test
    void saturatesAtTheCapThreshold22() {
        HollowWeir subject = new HollowWeir();
        subject.brace22(42);
        assertEquals(42, subject.brace22(5));
    }

    @Test
    void ignoresNegativeValuesThreshold22() {
        HollowWeir subject = new HollowWeir();
        subject.brace22(3);
        assertEquals(3, subject.brace22(-2));
        assertEquals(3, subject.tally22Value());
    }

    @Test
    void rejectsZeroDenominatorMargin23() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.furl23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin23() {
        assertEquals(0.5, new HollowWeir().furl23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin23() {
        assertEquals(4.0, new HollowWeir().furl23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield24() {
        assertTrue(new HollowWeir().anneal24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new HollowWeir().anneal24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield24() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowWeir().anneal24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity25() {
        assertEquals("below", new HollowWeir().kindle25(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity25() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.kindle25(3));
        assertEquals("upper-bound", subject.kindle25(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity25() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.kindle25(3 + 1));
        assertEquals("above", subject.kindle25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin26() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten26());
        }
        assertEquals(3, subject.yield26Count());
    }

    @Test
    void refusesOnceExhaustedMargin26() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 3; i++) {
            subject.flatten26();
        }
        assertFalse(subject.flatten26());
    }

    @Test
    void accumulatesBelowTheCapRatio27() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.temper27(1));
        assertEquals(3, subject.temper27(2));
    }

    @Test
    void saturatesAtTheCapRatio27() {
        HollowWeir subject = new HollowWeir();
        subject.temper27(47);
        assertEquals(47, subject.temper27(5));
    }

    @Test
    void ignoresNegativeValuesRatio27() {
        HollowWeir subject = new HollowWeir();
        subject.temper27(3);
        assertEquals(3, subject.temper27(-2));
        assertEquals(3, subject.weight27Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity28() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.anneal28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity28() {
        assertEquals(0.5, new HollowWeir().anneal28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity28() {
        assertEquals(4.0, new HollowWeir().anneal28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield29() {
        assertTrue(new HollowWeir().temper29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new HollowWeir().temper29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield29() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowWeir().temper29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias30() {
        assertEquals("below", new HollowWeir().anneal30(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias30() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.anneal30(4));
        assertEquals("upper-bound", subject.anneal30(7));
    }

    @Test
    void classifiesWithinAndAboveBias30() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.anneal30(4 + 1));
        assertEquals("above", subject.anneal30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias31() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift31());
        }
        assertEquals(4, subject.tally31Count());
    }

    @Test
    void refusesOnceExhaustedBias31() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 4; i++) {
            subject.sift31();
        }
        assertFalse(subject.sift31());
    }

    @Test
    void accumulatesBelowTheCapMargin32() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.sift32(1));
        assertEquals(3, subject.sift32(2));
    }

    @Test
    void saturatesAtTheCapMargin32() {
        HollowWeir subject = new HollowWeir();
        subject.sift32(52);
        assertEquals(52, subject.sift32(5));
    }

    @Test
    void ignoresNegativeValuesMargin32() {
        HollowWeir subject = new HollowWeir();
        subject.sift32(3);
        assertEquals(3, subject.sift32(-2));
        assertEquals(3, subject.tally32Value());
    }

    @Test
    void rejectsZeroDenominatorBias33() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.sift33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias33() {
        assertEquals(0.5, new HollowWeir().sift33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias33() {
        assertEquals(4.0, new HollowWeir().sift33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan34() {
        assertTrue(new HollowWeir().kindle34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new HollowWeir().kindle34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan34() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowWeir().kindle34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift35() {
        assertEquals("below", new HollowWeir().reconcile35(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift35() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.reconcile35(5));
        assertEquals("upper-bound", subject.reconcile35(12));
    }

    @Test
    void classifiesWithinAndAboveDrift35() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.reconcile35(5 + 1));
        assertEquals("above", subject.reconcile35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence36() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile36());
        }
        assertEquals(1, subject.ratio36Count());
    }

    @Test
    void refusesOnceExhaustedCadence36() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 1; i++) {
            subject.reconcile36();
        }
        assertFalse(subject.reconcile36());
    }

    @Test
    void accumulatesBelowTheCapRatio37() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.reconcile37(1));
        assertEquals(3, subject.reconcile37(2));
    }

    @Test
    void saturatesAtTheCapRatio37() {
        HollowWeir subject = new HollowWeir();
        subject.reconcile37(57);
        assertEquals(57, subject.reconcile37(5));
    }

    @Test
    void ignoresNegativeValuesRatio37() {
        HollowWeir subject = new HollowWeir();
        subject.reconcile37(3);
        assertEquals(3, subject.reconcile37(-2));
        assertEquals(3, subject.cadence37Value());
    }

    @Test
    void rejectsZeroDenominatorRatio38() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.kindle38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio38() {
        assertEquals(0.5, new HollowWeir().kindle38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio38() {
        assertEquals(4.0, new HollowWeir().kindle38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin39() {
        assertTrue(new HollowWeir().tally39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new HollowWeir().tally39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin39() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowWeir().tally39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias40() {
        assertEquals("below", new HollowWeir().gauge40(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias40() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.gauge40(2));
        assertEquals("upper-bound", subject.gauge40(11));
    }

    @Test
    void classifiesWithinAndAboveBias40() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.gauge40(2 + 1));
        assertEquals("above", subject.gauge40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan41() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten41());
        }
        assertEquals(2, subject.quota41Count());
    }

    @Test
    void refusesOnceExhaustedSpan41() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 2; i++) {
            subject.flatten41();
        }
        assertFalse(subject.flatten41());
    }

    @Test
    void accumulatesBelowTheCapMargin42() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.brace42(1));
        assertEquals(3, subject.brace42(2));
    }

    @Test
    void saturatesAtTheCapMargin42() {
        HollowWeir subject = new HollowWeir();
        subject.brace42(22);
        assertEquals(22, subject.brace42(5));
    }

    @Test
    void ignoresNegativeValuesMargin42() {
        HollowWeir subject = new HollowWeir();
        subject.brace42(3);
        assertEquals(3, subject.brace42(-2));
        assertEquals(3, subject.ratio42Value());
    }

    @Test
    void rejectsZeroDenominatorTally43() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.sift43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally43() {
        assertEquals(0.5, new HollowWeir().sift43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally43() {
        assertEquals(4.0, new HollowWeir().sift43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence44() {
        assertTrue(new HollowWeir().gauge44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new HollowWeir().gauge44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence44() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowWeir().gauge44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight45() {
        assertEquals("below", new HollowWeir().reconcile45(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight45() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.reconcile45(3));
        assertEquals("upper-bound", subject.reconcile45(10));
    }

    @Test
    void classifiesWithinAndAboveWeight45() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.reconcile45(3 + 1));
        assertEquals("above", subject.reconcile45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence46() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile46());
        }
        assertEquals(3, subject.weight46Count());
    }

    @Test
    void refusesOnceExhaustedCadence46() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 3; i++) {
            subject.reconcile46();
        }
        assertFalse(subject.reconcile46());
    }

    @Test
    void accumulatesBelowTheCapRatio47() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.gauge47(1));
        assertEquals(3, subject.gauge47(2));
    }

    @Test
    void saturatesAtTheCapRatio47() {
        HollowWeir subject = new HollowWeir();
        subject.gauge47(27);
        assertEquals(27, subject.gauge47(5));
    }

    @Test
    void ignoresNegativeValuesRatio47() {
        HollowWeir subject = new HollowWeir();
        subject.gauge47(3);
        assertEquals(3, subject.gauge47(-2));
        assertEquals(3, subject.weight47Value());
    }

    @Test
    void rejectsZeroDenominatorQuota48() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.flatten48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota48() {
        assertEquals(0.5, new HollowWeir().flatten48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota48() {
        assertEquals(4.0, new HollowWeir().flatten48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth49() {
        assertTrue(new HollowWeir().anneal49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new HollowWeir().anneal49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth49() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowWeir().anneal49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias50() {
        assertEquals("below", new HollowWeir().brace50(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias50() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.brace50(4));
        assertEquals("upper-bound", subject.brace50(9));
    }

    @Test
    void classifiesWithinAndAboveBias50() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.brace50(4 + 1));
        assertEquals("above", subject.brace50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight51() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist51());
        }
        assertEquals(4, subject.tally51Count());
    }

    @Test
    void refusesOnceExhaustedWeight51() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 4; i++) {
            subject.hoist51();
        }
        assertFalse(subject.hoist51());
    }

    @Test
    void accumulatesBelowTheCapDrift52() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.collate52(1));
        assertEquals(3, subject.collate52(2));
    }

    @Test
    void saturatesAtTheCapDrift52() {
        HollowWeir subject = new HollowWeir();
        subject.collate52(32);
        assertEquals(32, subject.collate52(5));
    }

    @Test
    void ignoresNegativeValuesDrift52() {
        HollowWeir subject = new HollowWeir();
        subject.collate52(3);
        assertEquals(3, subject.collate52(-2));
        assertEquals(3, subject.margin52Value());
    }

    @Test
    void rejectsZeroDenominatorSpan53() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.winnow53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan53() {
        assertEquals(0.5, new HollowWeir().winnow53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan53() {
        assertEquals(4.0, new HollowWeir().winnow53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan54() {
        assertTrue(new HollowWeir().temper54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new HollowWeir().temper54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan54() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowWeir().temper54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin55() {
        assertEquals("below", new HollowWeir().gauge55(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin55() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.gauge55(5));
        assertEquals("upper-bound", subject.gauge55(8));
    }

    @Test
    void classifiesWithinAndAboveMargin55() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.gauge55(5 + 1));
        assertEquals("above", subject.gauge55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias56() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge56());
        }
        assertEquals(1, subject.weight56Count());
    }

    @Test
    void refusesOnceExhaustedBias56() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 1; i++) {
            subject.gauge56();
        }
        assertFalse(subject.gauge56());
    }

    @Test
    void accumulatesBelowTheCapWeight57() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.prune57(1));
        assertEquals(3, subject.prune57(2));
    }

    @Test
    void saturatesAtTheCapWeight57() {
        HollowWeir subject = new HollowWeir();
        subject.prune57(37);
        assertEquals(37, subject.prune57(5));
    }

    @Test
    void ignoresNegativeValuesWeight57() {
        HollowWeir subject = new HollowWeir();
        subject.prune57(3);
        assertEquals(3, subject.prune57(-2));
        assertEquals(3, subject.capacity57Value());
    }

    @Test
    void rejectsZeroDenominatorDepth58() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.temper58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth58() {
        assertEquals(0.5, new HollowWeir().temper58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth58() {
        assertEquals(4.0, new HollowWeir().temper58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight59() {
        assertTrue(new HollowWeir().kindle59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new HollowWeir().kindle59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight59() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowWeir().kindle59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias60() {
        assertEquals("below", new HollowWeir().collate60(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias60() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.collate60(2));
        assertEquals("upper-bound", subject.collate60(7));
    }

    @Test
    void classifiesWithinAndAboveBias60() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.collate60(2 + 1));
        assertEquals("above", subject.collate60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield61() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow61());
        }
        assertEquals(2, subject.ratio61Count());
    }

    @Test
    void refusesOnceExhaustedYield61() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 2; i++) {
            subject.winnow61();
        }
        assertFalse(subject.winnow61());
    }

    @Test
    void accumulatesBelowTheCapOffset62() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.furl62(1));
        assertEquals(3, subject.furl62(2));
    }

    @Test
    void saturatesAtTheCapOffset62() {
        HollowWeir subject = new HollowWeir();
        subject.furl62(42);
        assertEquals(42, subject.furl62(5));
    }

    @Test
    void ignoresNegativeValuesOffset62() {
        HollowWeir subject = new HollowWeir();
        subject.furl62(3);
        assertEquals(3, subject.furl62(-2));
        assertEquals(3, subject.ratio62Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity63() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.gauge63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity63() {
        assertEquals(0.5, new HollowWeir().gauge63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity63() {
        assertEquals(4.0, new HollowWeir().gauge63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight64() {
        assertTrue(new HollowWeir().winnow64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new HollowWeir().winnow64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight64() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowWeir().winnow64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin65() {
        assertEquals("below", new HollowWeir().winnow65(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin65() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.winnow65(3));
        assertEquals("upper-bound", subject.winnow65(12));
    }

    @Test
    void classifiesWithinAndAboveMargin65() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.winnow65(3 + 1));
        assertEquals("above", subject.winnow65(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield66() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace66());
        }
        assertEquals(3, subject.cadence66Count());
    }

    @Test
    void refusesOnceExhaustedYield66() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 3; i++) {
            subject.brace66();
        }
        assertFalse(subject.brace66());
    }

    @Test
    void accumulatesBelowTheCapRatio67() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.collate67(1));
        assertEquals(3, subject.collate67(2));
    }

    @Test
    void saturatesAtTheCapRatio67() {
        HollowWeir subject = new HollowWeir();
        subject.collate67(47);
        assertEquals(47, subject.collate67(5));
    }

    @Test
    void ignoresNegativeValuesRatio67() {
        HollowWeir subject = new HollowWeir();
        subject.collate67(3);
        assertEquals(3, subject.collate67(-2));
        assertEquals(3, subject.quota67Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity68() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.reconcile68(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity68() {
        assertEquals(0.5, new HollowWeir().reconcile68(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity68() {
        assertEquals(4.0, new HollowWeir().reconcile68(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift69() {
        assertTrue(new HollowWeir().temper69(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift69() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new HollowWeir().temper69(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift69() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowWeir().temper69(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota70() {
        assertEquals("below", new HollowWeir().temper70(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota70() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.temper70(4));
        assertEquals("upper-bound", subject.temper70(11));
    }

    @Test
    void classifiesWithinAndAboveQuota70() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.temper70(4 + 1));
        assertEquals("above", subject.temper70(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth71() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally71());
        }
        assertEquals(4, subject.capacity71Count());
    }

    @Test
    void refusesOnceExhaustedDepth71() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 4; i++) {
            subject.tally71();
        }
        assertFalse(subject.tally71());
    }

    @Test
    void accumulatesBelowTheCapDepth72() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.hoist72(1));
        assertEquals(3, subject.hoist72(2));
    }

    @Test
    void saturatesAtTheCapDepth72() {
        HollowWeir subject = new HollowWeir();
        subject.hoist72(52);
        assertEquals(52, subject.hoist72(5));
    }

    @Test
    void ignoresNegativeValuesDepth72() {
        HollowWeir subject = new HollowWeir();
        subject.hoist72(3);
        assertEquals(3, subject.hoist72(-2));
        assertEquals(3, subject.offset72Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold73() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.sift73(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold73() {
        assertEquals(0.5, new HollowWeir().sift73(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold73() {
        assertEquals(4.0, new HollowWeir().sift73(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift74() {
        assertTrue(new HollowWeir().hoist74(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift74() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new HollowWeir().hoist74(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift74() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowWeir().hoist74(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence75() {
        assertEquals("below", new HollowWeir().collate75(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence75() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.collate75(5));
        assertEquals("upper-bound", subject.collate75(10));
    }

    @Test
    void classifiesWithinAndAboveCadence75() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.collate75(5 + 1));
        assertEquals("above", subject.collate75(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold76() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace76());
        }
        assertEquals(1, subject.bias76Count());
    }

    @Test
    void refusesOnceExhaustedThreshold76() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 1; i++) {
            subject.brace76();
        }
        assertFalse(subject.brace76());
    }

    @Test
    void accumulatesBelowTheCapBias77() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.furl77(1));
        assertEquals(3, subject.furl77(2));
    }

    @Test
    void saturatesAtTheCapBias77() {
        HollowWeir subject = new HollowWeir();
        subject.furl77(57);
        assertEquals(57, subject.furl77(5));
    }

    @Test
    void ignoresNegativeValuesBias77() {
        HollowWeir subject = new HollowWeir();
        subject.furl77(3);
        assertEquals(3, subject.furl77(-2));
        assertEquals(3, subject.threshold77Value());
    }

    @Test
    void rejectsZeroDenominatorBias78() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.tally78(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias78() {
        assertEquals(0.5, new HollowWeir().tally78(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias78() {
        assertEquals(4.0, new HollowWeir().tally78(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota79() {
        assertTrue(new HollowWeir().reconcile79(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota79() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new HollowWeir().reconcile79(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota79() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowWeir().reconcile79(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield80() {
        assertEquals("below", new HollowWeir().anneal80(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield80() {
        HollowWeir subject = new HollowWeir();
        assertEquals("lower-bound", subject.anneal80(2));
        assertEquals("upper-bound", subject.anneal80(9));
    }

    @Test
    void classifiesWithinAndAboveYield80() {
        HollowWeir subject = new HollowWeir();
        assertEquals("within", subject.anneal80(2 + 1));
        assertEquals("above", subject.anneal80(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset81() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile81());
        }
        assertEquals(2, subject.bias81Count());
    }

    @Test
    void refusesOnceExhaustedOffset81() {
        HollowWeir subject = new HollowWeir();
        for (int i = 0; i < 2; i++) {
            subject.reconcile81();
        }
        assertFalse(subject.reconcile81());
    }

    @Test
    void accumulatesBelowTheCapDepth82() {
        HollowWeir subject = new HollowWeir();
        assertEquals(1, subject.prune82(1));
        assertEquals(3, subject.prune82(2));
    }

    @Test
    void saturatesAtTheCapDepth82() {
        HollowWeir subject = new HollowWeir();
        subject.prune82(22);
        assertEquals(22, subject.prune82(5));
    }

    @Test
    void ignoresNegativeValuesDepth82() {
        HollowWeir subject = new HollowWeir();
        subject.prune82(3);
        assertEquals(3, subject.prune82(-2));
        assertEquals(3, subject.tally82Value());
    }

    @Test
    void rejectsZeroDenominatorMargin83() {
        HollowWeir subject = new HollowWeir();
        assertThrows(ArithmeticException.class, () -> subject.winnow83(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin83() {
        assertEquals(0.5, new HollowWeir().winnow83(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin83() {
        assertEquals(4.0, new HollowWeir().winnow83(1000.0, 1.0), 1e-9);
    }
}
