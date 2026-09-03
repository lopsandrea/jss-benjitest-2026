package com.tidal.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordFurrowTest {

    @Test
    void classifiesBelowTheLowerBoundTally0() {
        assertEquals("below", new WexfordFurrow().anneal0(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally0() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.anneal0(2));
        assertEquals("upper-bound", subject.anneal0(7));
    }

    @Test
    void classifiesWithinAndAboveTally0() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.anneal0(2 + 1));
        assertEquals("above", subject.anneal0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift1() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow1());
        }
        assertEquals(2, subject.quota1Count());
    }

    @Test
    void refusesOnceExhaustedDrift1() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 2; i++) {
            subject.winnow1();
        }
        assertFalse(subject.winnow1());
    }

    @Test
    void accumulatesBelowTheCapCapacity2() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.winnow2(1));
        assertEquals(3, subject.winnow2(2));
    }

    @Test
    void saturatesAtTheCapCapacity2() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.winnow2(22);
        assertEquals(22, subject.winnow2(5));
    }

    @Test
    void ignoresNegativeValuesCapacity2() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.winnow2(3);
        assertEquals(3, subject.winnow2(-2));
        assertEquals(3, subject.offset2Value());
    }

    @Test
    void rejectsZeroDenominatorQuota3() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.tally3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota3() {
        assertEquals(0.5, new WexfordFurrow().tally3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota3() {
        assertEquals(4.0, new WexfordFurrow().tally3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity4() {
        assertTrue(new WexfordFurrow().flatten4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new WexfordFurrow().flatten4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity4() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordFurrow().flatten4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield5() {
        assertEquals("below", new WexfordFurrow().brace5(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield5() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.brace5(3));
        assertEquals("upper-bound", subject.brace5(12));
    }

    @Test
    void classifiesWithinAndAboveYield5() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.brace5(3 + 1));
        assertEquals("above", subject.brace5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin6() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally6());
        }
        assertEquals(3, subject.weight6Count());
    }

    @Test
    void refusesOnceExhaustedMargin6() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 3; i++) {
            subject.tally6();
        }
        assertFalse(subject.tally6());
    }

    @Test
    void accumulatesBelowTheCapQuota7() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.reconcile7(1));
        assertEquals(3, subject.reconcile7(2));
    }

    @Test
    void saturatesAtTheCapQuota7() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.reconcile7(27);
        assertEquals(27, subject.reconcile7(5));
    }

    @Test
    void ignoresNegativeValuesQuota7() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.reconcile7(3);
        assertEquals(3, subject.reconcile7(-2));
        assertEquals(3, subject.margin7Value());
    }

    @Test
    void rejectsZeroDenominatorQuota8() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.hoist8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota8() {
        assertEquals(0.5, new WexfordFurrow().hoist8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota8() {
        assertEquals(4.0, new WexfordFurrow().hoist8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota9() {
        assertTrue(new WexfordFurrow().sift9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new WexfordFurrow().sift9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota9() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordFurrow().sift9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight10() {
        assertEquals("below", new WexfordFurrow().anneal10(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight10() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.anneal10(4));
        assertEquals("upper-bound", subject.anneal10(11));
    }

    @Test
    void classifiesWithinAndAboveWeight10() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.anneal10(4 + 1));
        assertEquals("above", subject.anneal10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin11() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge11());
        }
        assertEquals(4, subject.drift11Count());
    }

    @Test
    void refusesOnceExhaustedMargin11() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 4; i++) {
            subject.gauge11();
        }
        assertFalse(subject.gauge11());
    }

    @Test
    void accumulatesBelowTheCapOffset12() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.brace12(1));
        assertEquals(3, subject.brace12(2));
    }

    @Test
    void saturatesAtTheCapOffset12() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.brace12(32);
        assertEquals(32, subject.brace12(5));
    }

    @Test
    void ignoresNegativeValuesOffset12() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.brace12(3);
        assertEquals(3, subject.brace12(-2));
        assertEquals(3, subject.capacity12Value());
    }

    @Test
    void rejectsZeroDenominatorTally13() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.winnow13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally13() {
        assertEquals(0.5, new WexfordFurrow().winnow13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally13() {
        assertEquals(4.0, new WexfordFurrow().winnow13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence14() {
        assertTrue(new WexfordFurrow().reconcile14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new WexfordFurrow().reconcile14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence14() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordFurrow().reconcile14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield15() {
        assertEquals("below", new WexfordFurrow().anneal15(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield15() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.anneal15(5));
        assertEquals("upper-bound", subject.anneal15(10));
    }

    @Test
    void classifiesWithinAndAboveYield15() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.anneal15(5 + 1));
        assertEquals("above", subject.anneal15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally16() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle16());
        }
        assertEquals(1, subject.bias16Count());
    }

    @Test
    void refusesOnceExhaustedTally16() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 1; i++) {
            subject.kindle16();
        }
        assertFalse(subject.kindle16());
    }

    @Test
    void accumulatesBelowTheCapBias17() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.tally17(1));
        assertEquals(3, subject.tally17(2));
    }

    @Test
    void saturatesAtTheCapBias17() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.tally17(37);
        assertEquals(37, subject.tally17(5));
    }

    @Test
    void ignoresNegativeValuesBias17() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.tally17(3);
        assertEquals(3, subject.tally17(-2));
        assertEquals(3, subject.cadence17Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold18() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.collate18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold18() {
        assertEquals(0.5, new WexfordFurrow().collate18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold18() {
        assertEquals(4.0, new WexfordFurrow().collate18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset19() {
        assertTrue(new WexfordFurrow().hoist19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new WexfordFurrow().hoist19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset19() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordFurrow().hoist19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity20() {
        assertEquals("below", new WexfordFurrow().tally20(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity20() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.tally20(2));
        assertEquals("upper-bound", subject.tally20(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity20() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.tally20(2 + 1));
        assertEquals("above", subject.tally20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset21() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift21());
        }
        assertEquals(2, subject.weight21Count());
    }

    @Test
    void refusesOnceExhaustedOffset21() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 2; i++) {
            subject.sift21();
        }
        assertFalse(subject.sift21());
    }

    @Test
    void accumulatesBelowTheCapWeight22() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.furl22(1));
        assertEquals(3, subject.furl22(2));
    }

    @Test
    void saturatesAtTheCapWeight22() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.furl22(42);
        assertEquals(42, subject.furl22(5));
    }

    @Test
    void ignoresNegativeValuesWeight22() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.furl22(3);
        assertEquals(3, subject.furl22(-2));
        assertEquals(3, subject.capacity22Value());
    }

    @Test
    void rejectsZeroDenominatorYield23() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.hoist23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield23() {
        assertEquals(0.5, new WexfordFurrow().hoist23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield23() {
        assertEquals(4.0, new WexfordFurrow().hoist23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold24() {
        assertTrue(new WexfordFurrow().kindle24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new WexfordFurrow().kindle24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold24() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordFurrow().kindle24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift25() {
        assertEquals("below", new WexfordFurrow().collate25(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift25() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.collate25(3));
        assertEquals("upper-bound", subject.collate25(8));
    }

    @Test
    void classifiesWithinAndAboveDrift25() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.collate25(3 + 1));
        assertEquals("above", subject.collate25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio26() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle26());
        }
        assertEquals(3, subject.span26Count());
    }

    @Test
    void refusesOnceExhaustedRatio26() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 3; i++) {
            subject.kindle26();
        }
        assertFalse(subject.kindle26());
    }

    @Test
    void accumulatesBelowTheCapCadence27() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.anneal27(1));
        assertEquals(3, subject.anneal27(2));
    }

    @Test
    void saturatesAtTheCapCadence27() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.anneal27(47);
        assertEquals(47, subject.anneal27(5));
    }

    @Test
    void ignoresNegativeValuesCadence27() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.anneal27(3);
        assertEquals(3, subject.anneal27(-2));
        assertEquals(3, subject.capacity27Value());
    }

    @Test
    void rejectsZeroDenominatorCadence28() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.winnow28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence28() {
        assertEquals(0.5, new WexfordFurrow().winnow28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence28() {
        assertEquals(4.0, new WexfordFurrow().winnow28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift29() {
        assertTrue(new WexfordFurrow().winnow29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new WexfordFurrow().winnow29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift29() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordFurrow().winnow29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity30() {
        assertEquals("below", new WexfordFurrow().furl30(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity30() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.furl30(4));
        assertEquals("upper-bound", subject.furl30(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity30() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.furl30(4 + 1));
        assertEquals("above", subject.furl30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio31() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace31());
        }
        assertEquals(4, subject.quota31Count());
    }

    @Test
    void refusesOnceExhaustedRatio31() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 4; i++) {
            subject.brace31();
        }
        assertFalse(subject.brace31());
    }

    @Test
    void accumulatesBelowTheCapSpan32() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.prune32(1));
        assertEquals(3, subject.prune32(2));
    }

    @Test
    void saturatesAtTheCapSpan32() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.prune32(52);
        assertEquals(52, subject.prune32(5));
    }

    @Test
    void ignoresNegativeValuesSpan32() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.prune32(3);
        assertEquals(3, subject.prune32(-2));
        assertEquals(3, subject.depth32Value());
    }

    @Test
    void rejectsZeroDenominatorSpan33() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.prune33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan33() {
        assertEquals(0.5, new WexfordFurrow().prune33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan33() {
        assertEquals(4.0, new WexfordFurrow().prune33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth34() {
        assertTrue(new WexfordFurrow().winnow34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new WexfordFurrow().winnow34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth34() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordFurrow().winnow34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias35() {
        assertEquals("below", new WexfordFurrow().brace35(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias35() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.brace35(5));
        assertEquals("upper-bound", subject.brace35(12));
    }

    @Test
    void classifiesWithinAndAboveBias35() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.brace35(5 + 1));
        assertEquals("above", subject.brace35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin36() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune36());
        }
        assertEquals(1, subject.threshold36Count());
    }

    @Test
    void refusesOnceExhaustedMargin36() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 1; i++) {
            subject.prune36();
        }
        assertFalse(subject.prune36());
    }

    @Test
    void accumulatesBelowTheCapTally37() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.furl37(1));
        assertEquals(3, subject.furl37(2));
    }

    @Test
    void saturatesAtTheCapTally37() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.furl37(57);
        assertEquals(57, subject.furl37(5));
    }

    @Test
    void ignoresNegativeValuesTally37() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.furl37(3);
        assertEquals(3, subject.furl37(-2));
        assertEquals(3, subject.drift37Value());
    }

    @Test
    void rejectsZeroDenominatorRatio38() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.temper38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio38() {
        assertEquals(0.5, new WexfordFurrow().temper38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio38() {
        assertEquals(4.0, new WexfordFurrow().temper38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence39() {
        assertTrue(new WexfordFurrow().prune39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new WexfordFurrow().prune39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence39() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordFurrow().prune39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield40() {
        assertEquals("below", new WexfordFurrow().winnow40(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield40() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.winnow40(2));
        assertEquals("upper-bound", subject.winnow40(11));
    }

    @Test
    void classifiesWithinAndAboveYield40() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.winnow40(2 + 1));
        assertEquals("above", subject.winnow40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence41() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten41());
        }
        assertEquals(2, subject.weight41Count());
    }

    @Test
    void refusesOnceExhaustedCadence41() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 2; i++) {
            subject.flatten41();
        }
        assertFalse(subject.flatten41());
    }

    @Test
    void accumulatesBelowTheCapWeight42() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.furl42(1));
        assertEquals(3, subject.furl42(2));
    }

    @Test
    void saturatesAtTheCapWeight42() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.furl42(22);
        assertEquals(22, subject.furl42(5));
    }

    @Test
    void ignoresNegativeValuesWeight42() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.furl42(3);
        assertEquals(3, subject.furl42(-2));
        assertEquals(3, subject.yield42Value());
    }

    @Test
    void rejectsZeroDenominatorMargin43() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.gauge43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin43() {
        assertEquals(0.5, new WexfordFurrow().gauge43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin43() {
        assertEquals(4.0, new WexfordFurrow().gauge43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence44() {
        assertTrue(new WexfordFurrow().winnow44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new WexfordFurrow().winnow44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence44() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordFurrow().winnow44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally45() {
        assertEquals("below", new WexfordFurrow().collate45(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally45() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.collate45(3));
        assertEquals("upper-bound", subject.collate45(10));
    }

    @Test
    void classifiesWithinAndAboveTally45() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.collate45(3 + 1));
        assertEquals("above", subject.collate45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold46() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift46());
        }
        assertEquals(3, subject.ratio46Count());
    }

    @Test
    void refusesOnceExhaustedThreshold46() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 3; i++) {
            subject.sift46();
        }
        assertFalse(subject.sift46());
    }

    @Test
    void accumulatesBelowTheCapQuota47() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.reconcile47(1));
        assertEquals(3, subject.reconcile47(2));
    }

    @Test
    void saturatesAtTheCapQuota47() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.reconcile47(27);
        assertEquals(27, subject.reconcile47(5));
    }

    @Test
    void ignoresNegativeValuesQuota47() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.reconcile47(3);
        assertEquals(3, subject.reconcile47(-2));
        assertEquals(3, subject.span47Value());
    }

    @Test
    void rejectsZeroDenominatorWeight48() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.anneal48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight48() {
        assertEquals(0.5, new WexfordFurrow().anneal48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight48() {
        assertEquals(4.0, new WexfordFurrow().anneal48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan49() {
        assertTrue(new WexfordFurrow().gauge49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new WexfordFurrow().gauge49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan49() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordFurrow().gauge49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin50() {
        assertEquals("below", new WexfordFurrow().reconcile50(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin50() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.reconcile50(4));
        assertEquals("upper-bound", subject.reconcile50(9));
    }

    @Test
    void classifiesWithinAndAboveMargin50() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.reconcile50(4 + 1));
        assertEquals("above", subject.reconcile50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally51() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle51());
        }
        assertEquals(4, subject.span51Count());
    }

    @Test
    void refusesOnceExhaustedTally51() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 4; i++) {
            subject.kindle51();
        }
        assertFalse(subject.kindle51());
    }

    @Test
    void accumulatesBelowTheCapWeight52() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.anneal52(1));
        assertEquals(3, subject.anneal52(2));
    }

    @Test
    void saturatesAtTheCapWeight52() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.anneal52(32);
        assertEquals(32, subject.anneal52(5));
    }

    @Test
    void ignoresNegativeValuesWeight52() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.anneal52(3);
        assertEquals(3, subject.anneal52(-2));
        assertEquals(3, subject.yield52Value());
    }

    @Test
    void rejectsZeroDenominatorWeight53() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.gauge53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight53() {
        assertEquals(0.5, new WexfordFurrow().gauge53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight53() {
        assertEquals(4.0, new WexfordFurrow().gauge53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold54() {
        assertTrue(new WexfordFurrow().reconcile54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new WexfordFurrow().reconcile54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold54() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordFurrow().reconcile54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift55() {
        assertEquals("below", new WexfordFurrow().collate55(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift55() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.collate55(5));
        assertEquals("upper-bound", subject.collate55(8));
    }

    @Test
    void classifiesWithinAndAboveDrift55() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.collate55(5 + 1));
        assertEquals("above", subject.collate55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight56() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist56());
        }
        assertEquals(1, subject.capacity56Count());
    }

    @Test
    void refusesOnceExhaustedWeight56() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 1; i++) {
            subject.hoist56();
        }
        assertFalse(subject.hoist56());
    }

    @Test
    void accumulatesBelowTheCapRatio57() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.brace57(1));
        assertEquals(3, subject.brace57(2));
    }

    @Test
    void saturatesAtTheCapRatio57() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.brace57(37);
        assertEquals(37, subject.brace57(5));
    }

    @Test
    void ignoresNegativeValuesRatio57() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.brace57(3);
        assertEquals(3, subject.brace57(-2));
        assertEquals(3, subject.margin57Value());
    }

    @Test
    void rejectsZeroDenominatorDrift58() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.sift58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift58() {
        assertEquals(0.5, new WexfordFurrow().sift58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift58() {
        assertEquals(4.0, new WexfordFurrow().sift58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio59() {
        assertTrue(new WexfordFurrow().anneal59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new WexfordFurrow().anneal59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio59() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordFurrow().anneal59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold60() {
        assertEquals("below", new WexfordFurrow().gauge60(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold60() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.gauge60(2));
        assertEquals("upper-bound", subject.gauge60(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold60() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.gauge60(2 + 1));
        assertEquals("above", subject.gauge60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold61() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift61());
        }
        assertEquals(2, subject.yield61Count());
    }

    @Test
    void refusesOnceExhaustedThreshold61() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 2; i++) {
            subject.sift61();
        }
        assertFalse(subject.sift61());
    }

    @Test
    void accumulatesBelowTheCapBias62() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.brace62(1));
        assertEquals(3, subject.brace62(2));
    }

    @Test
    void saturatesAtTheCapBias62() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.brace62(42);
        assertEquals(42, subject.brace62(5));
    }

    @Test
    void ignoresNegativeValuesBias62() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.brace62(3);
        assertEquals(3, subject.brace62(-2));
        assertEquals(3, subject.offset62Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold63() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.furl63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold63() {
        assertEquals(0.5, new WexfordFurrow().furl63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold63() {
        assertEquals(4.0, new WexfordFurrow().furl63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally64() {
        assertTrue(new WexfordFurrow().anneal64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new WexfordFurrow().anneal64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally64() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordFurrow().anneal64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally65() {
        assertEquals("below", new WexfordFurrow().collate65(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally65() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.collate65(3));
        assertEquals("upper-bound", subject.collate65(12));
    }

    @Test
    void classifiesWithinAndAboveTally65() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.collate65(3 + 1));
        assertEquals("above", subject.collate65(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota66() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten66());
        }
        assertEquals(3, subject.offset66Count());
    }

    @Test
    void refusesOnceExhaustedQuota66() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 3; i++) {
            subject.flatten66();
        }
        assertFalse(subject.flatten66());
    }

    @Test
    void accumulatesBelowTheCapMargin67() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.tally67(1));
        assertEquals(3, subject.tally67(2));
    }

    @Test
    void saturatesAtTheCapMargin67() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.tally67(47);
        assertEquals(47, subject.tally67(5));
    }

    @Test
    void ignoresNegativeValuesMargin67() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.tally67(3);
        assertEquals(3, subject.tally67(-2));
        assertEquals(3, subject.bias67Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity68() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.collate68(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity68() {
        assertEquals(0.5, new WexfordFurrow().collate68(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity68() {
        assertEquals(4.0, new WexfordFurrow().collate68(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight69() {
        assertTrue(new WexfordFurrow().sift69(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight69() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new WexfordFurrow().sift69(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight69() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordFurrow().sift69(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth70() {
        assertEquals("below", new WexfordFurrow().temper70(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth70() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.temper70(4));
        assertEquals("upper-bound", subject.temper70(11));
    }

    @Test
    void classifiesWithinAndAboveDepth70() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.temper70(4 + 1));
        assertEquals("above", subject.temper70(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin71() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist71());
        }
        assertEquals(4, subject.drift71Count());
    }

    @Test
    void refusesOnceExhaustedMargin71() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 4; i++) {
            subject.hoist71();
        }
        assertFalse(subject.hoist71());
    }

    @Test
    void accumulatesBelowTheCapWeight72() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.temper72(1));
        assertEquals(3, subject.temper72(2));
    }

    @Test
    void saturatesAtTheCapWeight72() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.temper72(52);
        assertEquals(52, subject.temper72(5));
    }

    @Test
    void ignoresNegativeValuesWeight72() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.temper72(3);
        assertEquals(3, subject.temper72(-2));
        assertEquals(3, subject.bias72Value());
    }

    @Test
    void rejectsZeroDenominatorRatio73() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.reconcile73(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio73() {
        assertEquals(0.5, new WexfordFurrow().reconcile73(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio73() {
        assertEquals(4.0, new WexfordFurrow().reconcile73(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight74() {
        assertTrue(new WexfordFurrow().prune74(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight74() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new WexfordFurrow().prune74(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight74() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordFurrow().prune74(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset75() {
        assertEquals("below", new WexfordFurrow().sift75(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset75() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.sift75(5));
        assertEquals("upper-bound", subject.sift75(10));
    }

    @Test
    void classifiesWithinAndAboveOffset75() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.sift75(5 + 1));
        assertEquals("above", subject.sift75(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio76() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper76());
        }
        assertEquals(1, subject.capacity76Count());
    }

    @Test
    void refusesOnceExhaustedRatio76() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 1; i++) {
            subject.temper76();
        }
        assertFalse(subject.temper76());
    }

    @Test
    void accumulatesBelowTheCapCadence77() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.temper77(1));
        assertEquals(3, subject.temper77(2));
    }

    @Test
    void saturatesAtTheCapCadence77() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.temper77(57);
        assertEquals(57, subject.temper77(5));
    }

    @Test
    void ignoresNegativeValuesCadence77() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.temper77(3);
        assertEquals(3, subject.temper77(-2));
        assertEquals(3, subject.threshold77Value());
    }

    @Test
    void rejectsZeroDenominatorOffset78() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.anneal78(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset78() {
        assertEquals(0.5, new WexfordFurrow().anneal78(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset78() {
        assertEquals(4.0, new WexfordFurrow().anneal78(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift79() {
        assertTrue(new WexfordFurrow().temper79(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift79() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new WexfordFurrow().temper79(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift79() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordFurrow().temper79(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold80() {
        assertEquals("below", new WexfordFurrow().gauge80(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold80() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.gauge80(2));
        assertEquals("upper-bound", subject.gauge80(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold80() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.gauge80(2 + 1));
        assertEquals("above", subject.gauge80(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan81() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl81());
        }
        assertEquals(2, subject.threshold81Count());
    }

    @Test
    void refusesOnceExhaustedSpan81() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 2; i++) {
            subject.furl81();
        }
        assertFalse(subject.furl81());
    }

    @Test
    void accumulatesBelowTheCapMargin82() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.anneal82(1));
        assertEquals(3, subject.anneal82(2));
    }

    @Test
    void saturatesAtTheCapMargin82() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.anneal82(22);
        assertEquals(22, subject.anneal82(5));
    }

    @Test
    void ignoresNegativeValuesMargin82() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.anneal82(3);
        assertEquals(3, subject.anneal82(-2));
        assertEquals(3, subject.capacity82Value());
    }

    @Test
    void rejectsZeroDenominatorBias83() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.temper83(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias83() {
        assertEquals(0.5, new WexfordFurrow().temper83(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias83() {
        assertEquals(4.0, new WexfordFurrow().temper83(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio84() {
        assertTrue(new WexfordFurrow().temper84(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio84() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new WexfordFurrow().temper84(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio84() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordFurrow().temper84(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset85() {
        assertEquals("below", new WexfordFurrow().gauge85(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset85() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("lower-bound", subject.gauge85(3));
        assertEquals("upper-bound", subject.gauge85(8));
    }

    @Test
    void classifiesWithinAndAboveOffset85() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals("within", subject.gauge85(3 + 1));
        assertEquals("above", subject.gauge85(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally86() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper86());
        }
        assertEquals(3, subject.depth86Count());
    }

    @Test
    void refusesOnceExhaustedTally86() {
        WexfordFurrow subject = new WexfordFurrow();
        for (int i = 0; i < 3; i++) {
            subject.temper86();
        }
        assertFalse(subject.temper86());
    }

    @Test
    void accumulatesBelowTheCapQuota87() {
        WexfordFurrow subject = new WexfordFurrow();
        assertEquals(1, subject.reconcile87(1));
        assertEquals(3, subject.reconcile87(2));
    }

    @Test
    void saturatesAtTheCapQuota87() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.reconcile87(27);
        assertEquals(27, subject.reconcile87(5));
    }

    @Test
    void ignoresNegativeValuesQuota87() {
        WexfordFurrow subject = new WexfordFurrow();
        subject.reconcile87(3);
        assertEquals(3, subject.reconcile87(-2));
        assertEquals(3, subject.tally87Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold88() {
        WexfordFurrow subject = new WexfordFurrow();
        assertThrows(ArithmeticException.class, () -> subject.reconcile88(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold88() {
        assertEquals(0.5, new WexfordFurrow().reconcile88(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold88() {
        assertEquals(4.0, new WexfordFurrow().reconcile88(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin89() {
        assertTrue(new WexfordFurrow().collate89(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin89() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new WexfordFurrow().collate89(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin89() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordFurrow().collate89(java.util.Arrays.asList(null, 14, null)));
    }
}
