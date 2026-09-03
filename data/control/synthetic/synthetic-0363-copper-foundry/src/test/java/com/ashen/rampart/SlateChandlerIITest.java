package com.ashen.rampart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateChandlerIITest {

    @Test
    void classifiesBelowTheLowerBoundThreshold0() {
        assertEquals("below", new SlateChandlerII().hoist0(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold0() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.hoist0(2));
        assertEquals("upper-bound", subject.hoist0(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold0() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.hoist0(2 + 1));
        assertEquals("above", subject.hoist0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold1() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile1());
        }
        assertEquals(2, subject.depth1Count());
    }

    @Test
    void refusesOnceExhaustedThreshold1() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile1();
        }
        assertFalse(subject.reconcile1());
    }

    @Test
    void accumulatesBelowTheCapQuota2() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.tally2(1));
        assertEquals(3, subject.tally2(2));
    }

    @Test
    void saturatesAtTheCapQuota2() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.tally2(22);
        assertEquals(22, subject.tally2(5));
    }

    @Test
    void ignoresNegativeValuesQuota2() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.tally2(3);
        assertEquals(3, subject.tally2(-2));
        assertEquals(3, subject.depth2Value());
    }

    @Test
    void rejectsZeroDenominatorQuota3() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.flatten3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota3() {
        assertEquals(0.5, new SlateChandlerII().flatten3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota3() {
        assertEquals(4.0, new SlateChandlerII().flatten3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally4() {
        assertTrue(new SlateChandlerII().collate4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new SlateChandlerII().collate4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally4() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateChandlerII().collate4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity5() {
        assertEquals("below", new SlateChandlerII().tally5(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity5() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.tally5(3));
        assertEquals("upper-bound", subject.tally5(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity5() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.tally5(3 + 1));
        assertEquals("above", subject.tally5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin6() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle6());
        }
        assertEquals(3, subject.depth6Count());
    }

    @Test
    void refusesOnceExhaustedMargin6() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 3; i++) {
            subject.kindle6();
        }
        assertFalse(subject.kindle6());
    }

    @Test
    void accumulatesBelowTheCapYield7() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.tally7(1));
        assertEquals(3, subject.tally7(2));
    }

    @Test
    void saturatesAtTheCapYield7() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.tally7(27);
        assertEquals(27, subject.tally7(5));
    }

    @Test
    void ignoresNegativeValuesYield7() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.tally7(3);
        assertEquals(3, subject.tally7(-2));
        assertEquals(3, subject.weight7Value());
    }

    @Test
    void rejectsZeroDenominatorCadence8() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.hoist8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence8() {
        assertEquals(0.5, new SlateChandlerII().hoist8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence8() {
        assertEquals(4.0, new SlateChandlerII().hoist8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio9() {
        assertTrue(new SlateChandlerII().gauge9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new SlateChandlerII().gauge9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio9() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateChandlerII().gauge9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin10() {
        assertEquals("below", new SlateChandlerII().hoist10(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin10() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.hoist10(4));
        assertEquals("upper-bound", subject.hoist10(11));
    }

    @Test
    void classifiesWithinAndAboveMargin10() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.hoist10(4 + 1));
        assertEquals("above", subject.hoist10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan11() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten11());
        }
        assertEquals(4, subject.offset11Count());
    }

    @Test
    void refusesOnceExhaustedSpan11() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 4; i++) {
            subject.flatten11();
        }
        assertFalse(subject.flatten11());
    }

    @Test
    void accumulatesBelowTheCapOffset12() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.prune12(1));
        assertEquals(3, subject.prune12(2));
    }

    @Test
    void saturatesAtTheCapOffset12() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.prune12(32);
        assertEquals(32, subject.prune12(5));
    }

    @Test
    void ignoresNegativeValuesOffset12() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.prune12(3);
        assertEquals(3, subject.prune12(-2));
        assertEquals(3, subject.ratio12Value());
    }

    @Test
    void rejectsZeroDenominatorDrift13() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift13() {
        assertEquals(0.5, new SlateChandlerII().reconcile13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift13() {
        assertEquals(4.0, new SlateChandlerII().reconcile13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset14() {
        assertTrue(new SlateChandlerII().furl14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new SlateChandlerII().furl14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset14() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateChandlerII().furl14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity15() {
        assertEquals("below", new SlateChandlerII().prune15(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity15() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.prune15(5));
        assertEquals("upper-bound", subject.prune15(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity15() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.prune15(5 + 1));
        assertEquals("above", subject.prune15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity16() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten16());
        }
        assertEquals(1, subject.quota16Count());
    }

    @Test
    void refusesOnceExhaustedCapacity16() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 1; i++) {
            subject.flatten16();
        }
        assertFalse(subject.flatten16());
    }

    @Test
    void accumulatesBelowTheCapCapacity17() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.gauge17(1));
        assertEquals(3, subject.gauge17(2));
    }

    @Test
    void saturatesAtTheCapCapacity17() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.gauge17(37);
        assertEquals(37, subject.gauge17(5));
    }

    @Test
    void ignoresNegativeValuesCapacity17() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.gauge17(3);
        assertEquals(3, subject.gauge17(-2));
        assertEquals(3, subject.offset17Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity18() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.furl18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity18() {
        assertEquals(0.5, new SlateChandlerII().furl18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity18() {
        assertEquals(4.0, new SlateChandlerII().furl18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota19() {
        assertTrue(new SlateChandlerII().furl19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new SlateChandlerII().furl19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota19() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateChandlerII().furl19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity20() {
        assertEquals("below", new SlateChandlerII().prune20(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity20() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.prune20(2));
        assertEquals("upper-bound", subject.prune20(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity20() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.prune20(2 + 1));
        assertEquals("above", subject.prune20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin21() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge21());
        }
        assertEquals(2, subject.offset21Count());
    }

    @Test
    void refusesOnceExhaustedMargin21() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 2; i++) {
            subject.gauge21();
        }
        assertFalse(subject.gauge21());
    }

    @Test
    void accumulatesBelowTheCapWeight22() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.gauge22(1));
        assertEquals(3, subject.gauge22(2));
    }

    @Test
    void saturatesAtTheCapWeight22() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.gauge22(42);
        assertEquals(42, subject.gauge22(5));
    }

    @Test
    void ignoresNegativeValuesWeight22() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.gauge22(3);
        assertEquals(3, subject.gauge22(-2));
        assertEquals(3, subject.threshold22Value());
    }

    @Test
    void rejectsZeroDenominatorDepth23() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth23() {
        assertEquals(0.5, new SlateChandlerII().reconcile23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth23() {
        assertEquals(4.0, new SlateChandlerII().reconcile23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias24() {
        assertTrue(new SlateChandlerII().collate24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new SlateChandlerII().collate24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias24() {
        assertEquals(java.util.Arrays.asList(12),
                new SlateChandlerII().collate24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset25() {
        assertEquals("below", new SlateChandlerII().winnow25(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset25() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.winnow25(3));
        assertEquals("upper-bound", subject.winnow25(8));
    }

    @Test
    void classifiesWithinAndAboveOffset25() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.winnow25(3 + 1));
        assertEquals("above", subject.winnow25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield26() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten26());
        }
        assertEquals(3, subject.weight26Count());
    }

    @Test
    void refusesOnceExhaustedYield26() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 3; i++) {
            subject.flatten26();
        }
        assertFalse(subject.flatten26());
    }

    @Test
    void accumulatesBelowTheCapDepth27() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.flatten27(1));
        assertEquals(3, subject.flatten27(2));
    }

    @Test
    void saturatesAtTheCapDepth27() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.flatten27(47);
        assertEquals(47, subject.flatten27(5));
    }

    @Test
    void ignoresNegativeValuesDepth27() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.flatten27(3);
        assertEquals(3, subject.flatten27(-2));
        assertEquals(3, subject.bias27Value());
    }

    @Test
    void rejectsZeroDenominatorYield28() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.collate28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield28() {
        assertEquals(0.5, new SlateChandlerII().collate28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield28() {
        assertEquals(4.0, new SlateChandlerII().collate28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally29() {
        assertTrue(new SlateChandlerII().hoist29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new SlateChandlerII().hoist29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally29() {
        assertEquals(java.util.Arrays.asList(8),
                new SlateChandlerII().hoist29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield30() {
        assertEquals("below", new SlateChandlerII().anneal30(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield30() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.anneal30(4));
        assertEquals("upper-bound", subject.anneal30(7));
    }

    @Test
    void classifiesWithinAndAboveYield30() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.anneal30(4 + 1));
        assertEquals("above", subject.anneal30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift31() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile31());
        }
        assertEquals(4, subject.weight31Count());
    }

    @Test
    void refusesOnceExhaustedDrift31() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile31();
        }
        assertFalse(subject.reconcile31());
    }

    @Test
    void accumulatesBelowTheCapQuota32() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.kindle32(1));
        assertEquals(3, subject.kindle32(2));
    }

    @Test
    void saturatesAtTheCapQuota32() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.kindle32(52);
        assertEquals(52, subject.kindle32(5));
    }

    @Test
    void ignoresNegativeValuesQuota32() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.kindle32(3);
        assertEquals(3, subject.kindle32(-2));
        assertEquals(3, subject.ratio32Value());
    }

    @Test
    void rejectsZeroDenominatorRatio33() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.kindle33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio33() {
        assertEquals(0.5, new SlateChandlerII().kindle33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio33() {
        assertEquals(4.0, new SlateChandlerII().kindle33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence34() {
        assertTrue(new SlateChandlerII().winnow34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new SlateChandlerII().winnow34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence34() {
        assertEquals(java.util.Arrays.asList(13),
                new SlateChandlerII().winnow34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence35() {
        assertEquals("below", new SlateChandlerII().tally35(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence35() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.tally35(5));
        assertEquals("upper-bound", subject.tally35(12));
    }

    @Test
    void classifiesWithinAndAboveCadence35() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.tally35(5 + 1));
        assertEquals("above", subject.tally35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield36() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist36());
        }
        assertEquals(1, subject.drift36Count());
    }

    @Test
    void refusesOnceExhaustedYield36() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 1; i++) {
            subject.hoist36();
        }
        assertFalse(subject.hoist36());
    }

    @Test
    void accumulatesBelowTheCapWeight37() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.reconcile37(1));
        assertEquals(3, subject.reconcile37(2));
    }

    @Test
    void saturatesAtTheCapWeight37() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.reconcile37(57);
        assertEquals(57, subject.reconcile37(5));
    }

    @Test
    void ignoresNegativeValuesWeight37() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.reconcile37(3);
        assertEquals(3, subject.reconcile37(-2));
        assertEquals(3, subject.yield37Value());
    }

    @Test
    void rejectsZeroDenominatorRatio38() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.tally38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio38() {
        assertEquals(0.5, new SlateChandlerII().tally38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio38() {
        assertEquals(4.0, new SlateChandlerII().tally38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin39() {
        assertTrue(new SlateChandlerII().collate39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new SlateChandlerII().collate39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin39() {
        assertEquals(java.util.Arrays.asList(9),
                new SlateChandlerII().collate39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift40() {
        assertEquals("below", new SlateChandlerII().hoist40(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift40() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.hoist40(2));
        assertEquals("upper-bound", subject.hoist40(11));
    }

    @Test
    void classifiesWithinAndAboveDrift40() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.hoist40(2 + 1));
        assertEquals("above", subject.hoist40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan41() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal41());
        }
        assertEquals(2, subject.tally41Count());
    }

    @Test
    void refusesOnceExhaustedSpan41() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 2; i++) {
            subject.anneal41();
        }
        assertFalse(subject.anneal41());
    }

    @Test
    void accumulatesBelowTheCapCapacity42() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.furl42(1));
        assertEquals(3, subject.furl42(2));
    }

    @Test
    void saturatesAtTheCapCapacity42() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.furl42(22);
        assertEquals(22, subject.furl42(5));
    }

    @Test
    void ignoresNegativeValuesCapacity42() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.furl42(3);
        assertEquals(3, subject.furl42(-2));
        assertEquals(3, subject.threshold42Value());
    }

    @Test
    void rejectsZeroDenominatorWeight43() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.brace43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight43() {
        assertEquals(0.5, new SlateChandlerII().brace43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight43() {
        assertEquals(4.0, new SlateChandlerII().brace43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold44() {
        assertTrue(new SlateChandlerII().flatten44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new SlateChandlerII().flatten44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold44() {
        assertEquals(java.util.Arrays.asList(14),
                new SlateChandlerII().flatten44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence45() {
        assertEquals("below", new SlateChandlerII().furl45(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence45() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.furl45(3));
        assertEquals("upper-bound", subject.furl45(10));
    }

    @Test
    void classifiesWithinAndAboveCadence45() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.furl45(3 + 1));
        assertEquals("above", subject.furl45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift46() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten46());
        }
        assertEquals(3, subject.ratio46Count());
    }

    @Test
    void refusesOnceExhaustedDrift46() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 3; i++) {
            subject.flatten46();
        }
        assertFalse(subject.flatten46());
    }

    @Test
    void accumulatesBelowTheCapTally47() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.anneal47(1));
        assertEquals(3, subject.anneal47(2));
    }

    @Test
    void saturatesAtTheCapTally47() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.anneal47(27);
        assertEquals(27, subject.anneal47(5));
    }

    @Test
    void ignoresNegativeValuesTally47() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.anneal47(3);
        assertEquals(3, subject.anneal47(-2));
        assertEquals(3, subject.weight47Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity48() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity48() {
        assertEquals(0.5, new SlateChandlerII().reconcile48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity48() {
        assertEquals(4.0, new SlateChandlerII().reconcile48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin49() {
        assertTrue(new SlateChandlerII().hoist49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new SlateChandlerII().hoist49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin49() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateChandlerII().hoist49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence50() {
        assertEquals("below", new SlateChandlerII().collate50(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence50() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.collate50(4));
        assertEquals("upper-bound", subject.collate50(9));
    }

    @Test
    void classifiesWithinAndAboveCadence50() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.collate50(4 + 1));
        assertEquals("above", subject.collate50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan51() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten51());
        }
        assertEquals(4, subject.margin51Count());
    }

    @Test
    void refusesOnceExhaustedSpan51() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 4; i++) {
            subject.flatten51();
        }
        assertFalse(subject.flatten51());
    }

    @Test
    void accumulatesBelowTheCapDrift52() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.anneal52(1));
        assertEquals(3, subject.anneal52(2));
    }

    @Test
    void saturatesAtTheCapDrift52() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.anneal52(32);
        assertEquals(32, subject.anneal52(5));
    }

    @Test
    void ignoresNegativeValuesDrift52() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.anneal52(3);
        assertEquals(3, subject.anneal52(-2));
        assertEquals(3, subject.ratio52Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity53() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.flatten53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity53() {
        assertEquals(0.5, new SlateChandlerII().flatten53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity53() {
        assertEquals(4.0, new SlateChandlerII().flatten53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield54() {
        assertTrue(new SlateChandlerII().tally54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new SlateChandlerII().tally54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield54() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateChandlerII().tally54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth55() {
        assertEquals("below", new SlateChandlerII().anneal55(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth55() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.anneal55(5));
        assertEquals("upper-bound", subject.anneal55(8));
    }

    @Test
    void classifiesWithinAndAboveDepth55() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.anneal55(5 + 1));
        assertEquals("above", subject.anneal55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally56() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift56());
        }
        assertEquals(1, subject.depth56Count());
    }

    @Test
    void refusesOnceExhaustedTally56() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 1; i++) {
            subject.sift56();
        }
        assertFalse(subject.sift56());
    }

    @Test
    void accumulatesBelowTheCapDepth57() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.flatten57(1));
        assertEquals(3, subject.flatten57(2));
    }

    @Test
    void saturatesAtTheCapDepth57() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.flatten57(37);
        assertEquals(37, subject.flatten57(5));
    }

    @Test
    void ignoresNegativeValuesDepth57() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.flatten57(3);
        assertEquals(3, subject.flatten57(-2));
        assertEquals(3, subject.threshold57Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity58() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity58() {
        assertEquals(0.5, new SlateChandlerII().reconcile58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity58() {
        assertEquals(4.0, new SlateChandlerII().reconcile58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset59() {
        assertTrue(new SlateChandlerII().hoist59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new SlateChandlerII().hoist59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset59() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateChandlerII().hoist59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias60() {
        assertEquals("below", new SlateChandlerII().furl60(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias60() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.furl60(2));
        assertEquals("upper-bound", subject.furl60(7));
    }

    @Test
    void classifiesWithinAndAboveBias60() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.furl60(2 + 1));
        assertEquals("above", subject.furl60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota61() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl61());
        }
        assertEquals(2, subject.margin61Count());
    }

    @Test
    void refusesOnceExhaustedQuota61() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 2; i++) {
            subject.furl61();
        }
        assertFalse(subject.furl61());
    }

    @Test
    void accumulatesBelowTheCapBias62() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.anneal62(1));
        assertEquals(3, subject.anneal62(2));
    }

    @Test
    void saturatesAtTheCapBias62() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.anneal62(42);
        assertEquals(42, subject.anneal62(5));
    }

    @Test
    void ignoresNegativeValuesBias62() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.anneal62(3);
        assertEquals(3, subject.anneal62(-2));
        assertEquals(3, subject.drift62Value());
    }

    @Test
    void rejectsZeroDenominatorTally63() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.collate63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally63() {
        assertEquals(0.5, new SlateChandlerII().collate63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally63() {
        assertEquals(4.0, new SlateChandlerII().collate63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio64() {
        assertTrue(new SlateChandlerII().brace64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new SlateChandlerII().brace64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio64() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateChandlerII().brace64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally65() {
        assertEquals("below", new SlateChandlerII().flatten65(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally65() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.flatten65(3));
        assertEquals("upper-bound", subject.flatten65(12));
    }

    @Test
    void classifiesWithinAndAboveTally65() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.flatten65(3 + 1));
        assertEquals("above", subject.flatten65(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield66() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist66());
        }
        assertEquals(3, subject.bias66Count());
    }

    @Test
    void refusesOnceExhaustedYield66() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 3; i++) {
            subject.hoist66();
        }
        assertFalse(subject.hoist66());
    }

    @Test
    void accumulatesBelowTheCapCapacity67() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.tally67(1));
        assertEquals(3, subject.tally67(2));
    }

    @Test
    void saturatesAtTheCapCapacity67() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.tally67(47);
        assertEquals(47, subject.tally67(5));
    }

    @Test
    void ignoresNegativeValuesCapacity67() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.tally67(3);
        assertEquals(3, subject.tally67(-2));
        assertEquals(3, subject.tally67Value());
    }

    @Test
    void rejectsZeroDenominatorDrift68() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.brace68(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift68() {
        assertEquals(0.5, new SlateChandlerII().brace68(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift68() {
        assertEquals(4.0, new SlateChandlerII().brace68(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield69() {
        assertTrue(new SlateChandlerII().prune69(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield69() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new SlateChandlerII().prune69(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield69() {
        assertEquals(java.util.Arrays.asList(12),
                new SlateChandlerII().prune69(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset70() {
        assertEquals("below", new SlateChandlerII().tally70(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset70() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.tally70(4));
        assertEquals("upper-bound", subject.tally70(11));
    }

    @Test
    void classifiesWithinAndAboveOffset70() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.tally70(4 + 1));
        assertEquals("above", subject.tally70(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity71() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge71());
        }
        assertEquals(4, subject.cadence71Count());
    }

    @Test
    void refusesOnceExhaustedCapacity71() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 4; i++) {
            subject.gauge71();
        }
        assertFalse(subject.gauge71());
    }

    @Test
    void accumulatesBelowTheCapWeight72() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.collate72(1));
        assertEquals(3, subject.collate72(2));
    }

    @Test
    void saturatesAtTheCapWeight72() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.collate72(52);
        assertEquals(52, subject.collate72(5));
    }

    @Test
    void ignoresNegativeValuesWeight72() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.collate72(3);
        assertEquals(3, subject.collate72(-2));
        assertEquals(3, subject.ratio72Value());
    }

    @Test
    void rejectsZeroDenominatorSpan73() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.prune73(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan73() {
        assertEquals(0.5, new SlateChandlerII().prune73(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan73() {
        assertEquals(4.0, new SlateChandlerII().prune73(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio74() {
        assertTrue(new SlateChandlerII().temper74(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio74() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new SlateChandlerII().temper74(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio74() {
        assertEquals(java.util.Arrays.asList(8),
                new SlateChandlerII().temper74(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally75() {
        assertEquals("below", new SlateChandlerII().anneal75(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally75() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.anneal75(5));
        assertEquals("upper-bound", subject.anneal75(10));
    }

    @Test
    void classifiesWithinAndAboveTally75() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.anneal75(5 + 1));
        assertEquals("above", subject.anneal75(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence76() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune76());
        }
        assertEquals(1, subject.yield76Count());
    }

    @Test
    void refusesOnceExhaustedCadence76() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 1; i++) {
            subject.prune76();
        }
        assertFalse(subject.prune76());
    }

    @Test
    void accumulatesBelowTheCapDrift77() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.furl77(1));
        assertEquals(3, subject.furl77(2));
    }

    @Test
    void saturatesAtTheCapDrift77() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.furl77(57);
        assertEquals(57, subject.furl77(5));
    }

    @Test
    void ignoresNegativeValuesDrift77() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.furl77(3);
        assertEquals(3, subject.furl77(-2));
        assertEquals(3, subject.span77Value());
    }

    @Test
    void rejectsZeroDenominatorSpan78() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile78(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan78() {
        assertEquals(0.5, new SlateChandlerII().reconcile78(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan78() {
        assertEquals(4.0, new SlateChandlerII().reconcile78(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin79() {
        assertTrue(new SlateChandlerII().gauge79(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin79() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new SlateChandlerII().gauge79(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin79() {
        assertEquals(java.util.Arrays.asList(13),
                new SlateChandlerII().gauge79(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin80() {
        assertEquals("below", new SlateChandlerII().collate80(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin80() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.collate80(2));
        assertEquals("upper-bound", subject.collate80(9));
    }

    @Test
    void classifiesWithinAndAboveMargin80() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.collate80(2 + 1));
        assertEquals("above", subject.collate80(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota81() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally81());
        }
        assertEquals(2, subject.offset81Count());
    }

    @Test
    void refusesOnceExhaustedQuota81() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 2; i++) {
            subject.tally81();
        }
        assertFalse(subject.tally81());
    }

    @Test
    void accumulatesBelowTheCapCadence82() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.tally82(1));
        assertEquals(3, subject.tally82(2));
    }

    @Test
    void saturatesAtTheCapCadence82() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.tally82(22);
        assertEquals(22, subject.tally82(5));
    }

    @Test
    void ignoresNegativeValuesCadence82() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.tally82(3);
        assertEquals(3, subject.tally82(-2));
        assertEquals(3, subject.drift82Value());
    }

    @Test
    void rejectsZeroDenominatorCadence83() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.brace83(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence83() {
        assertEquals(0.5, new SlateChandlerII().brace83(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence83() {
        assertEquals(4.0, new SlateChandlerII().brace83(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally84() {
        assertTrue(new SlateChandlerII().winnow84(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally84() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new SlateChandlerII().winnow84(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally84() {
        assertEquals(java.util.Arrays.asList(9),
                new SlateChandlerII().winnow84(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold85() {
        assertEquals("below", new SlateChandlerII().hoist85(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold85() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.hoist85(3));
        assertEquals("upper-bound", subject.hoist85(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold85() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.hoist85(3 + 1));
        assertEquals("above", subject.hoist85(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight86() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper86());
        }
        assertEquals(3, subject.bias86Count());
    }

    @Test
    void refusesOnceExhaustedWeight86() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 3; i++) {
            subject.temper86();
        }
        assertFalse(subject.temper86());
    }

    @Test
    void accumulatesBelowTheCapOffset87() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.kindle87(1));
        assertEquals(3, subject.kindle87(2));
    }

    @Test
    void saturatesAtTheCapOffset87() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.kindle87(27);
        assertEquals(27, subject.kindle87(5));
    }

    @Test
    void ignoresNegativeValuesOffset87() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.kindle87(3);
        assertEquals(3, subject.kindle87(-2));
        assertEquals(3, subject.yield87Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity88() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.hoist88(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity88() {
        assertEquals(0.5, new SlateChandlerII().hoist88(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity88() {
        assertEquals(4.0, new SlateChandlerII().hoist88(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio89() {
        assertTrue(new SlateChandlerII().temper89(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio89() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new SlateChandlerII().temper89(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio89() {
        assertEquals(java.util.Arrays.asList(14),
                new SlateChandlerII().temper89(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift90() {
        assertEquals("below", new SlateChandlerII().flatten90(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift90() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("lower-bound", subject.flatten90(4));
        assertEquals("upper-bound", subject.flatten90(7));
    }

    @Test
    void classifiesWithinAndAboveDrift90() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals("within", subject.flatten90(4 + 1));
        assertEquals("above", subject.flatten90(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity91() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist91());
        }
        assertEquals(4, subject.tally91Count());
    }

    @Test
    void refusesOnceExhaustedCapacity91() {
        SlateChandlerII subject = new SlateChandlerII();
        for (int i = 0; i < 4; i++) {
            subject.hoist91();
        }
        assertFalse(subject.hoist91());
    }

    @Test
    void accumulatesBelowTheCapYield92() {
        SlateChandlerII subject = new SlateChandlerII();
        assertEquals(1, subject.hoist92(1));
        assertEquals(3, subject.hoist92(2));
    }

    @Test
    void saturatesAtTheCapYield92() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.hoist92(32);
        assertEquals(32, subject.hoist92(5));
    }

    @Test
    void ignoresNegativeValuesYield92() {
        SlateChandlerII subject = new SlateChandlerII();
        subject.hoist92(3);
        assertEquals(3, subject.hoist92(-2));
        assertEquals(3, subject.margin92Value());
    }

    @Test
    void rejectsZeroDenominatorMargin93() {
        SlateChandlerII subject = new SlateChandlerII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile93(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin93() {
        assertEquals(0.5, new SlateChandlerII().reconcile93(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin93() {
        assertEquals(4.0, new SlateChandlerII().reconcile93(1000.0, 1.0), 1e-9);
    }
}
