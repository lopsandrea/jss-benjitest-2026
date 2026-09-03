package com.tidal.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordQuarryTest {

    @Test
    void rejectsZeroDenominatorTally0() {
        WexfordQuarry subject = new WexfordQuarry();
        assertThrows(ArithmeticException.class, () -> subject.prune0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally0() {
        assertEquals(0.5, new WexfordQuarry().prune0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally0() {
        assertEquals(1.0, new WexfordQuarry().prune0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield1() {
        assertTrue(new WexfordQuarry().winnow1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new WexfordQuarry().winnow1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield1() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordQuarry().winnow1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight2() {
        assertEquals("below", new WexfordQuarry().gauge2(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight2() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals("lower-bound", subject.gauge2(4));
        assertEquals("upper-bound", subject.gauge2(9));
    }

    @Test
    void classifiesWithinAndAboveWeight2() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals("within", subject.gauge2(4 + 1));
        assertEquals("above", subject.gauge2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan3() {
        WexfordQuarry subject = new WexfordQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow3());
        }
        assertEquals(4, subject.margin3Count());
    }

    @Test
    void refusesOnceExhaustedSpan3() {
        WexfordQuarry subject = new WexfordQuarry();
        for (int i = 0; i < 4; i++) {
            subject.winnow3();
        }
        assertFalse(subject.winnow3());
    }

    @Test
    void accumulatesBelowTheCapCadence4() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals(1, subject.temper4(1));
        assertEquals(3, subject.temper4(2));
    }

    @Test
    void saturatesAtTheCapCadence4() {
        WexfordQuarry subject = new WexfordQuarry();
        subject.temper4(24);
        assertEquals(24, subject.temper4(5));
    }

    @Test
    void ignoresNegativeValuesCadence4() {
        WexfordQuarry subject = new WexfordQuarry();
        subject.temper4(3);
        assertEquals(3, subject.temper4(-2));
        assertEquals(3, subject.margin4Value());
    }

    @Test
    void rejectsZeroDenominatorYield5() {
        WexfordQuarry subject = new WexfordQuarry();
        assertThrows(ArithmeticException.class, () -> subject.sift5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield5() {
        assertEquals(0.5, new WexfordQuarry().sift5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield5() {
        assertEquals(1.0, new WexfordQuarry().sift5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift6() {
        assertTrue(new WexfordQuarry().tally6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new WexfordQuarry().tally6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift6() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordQuarry().tally6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota7() {
        assertEquals("below", new WexfordQuarry().kindle7(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota7() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals("lower-bound", subject.kindle7(5));
        assertEquals("upper-bound", subject.kindle7(8));
    }

    @Test
    void classifiesWithinAndAboveQuota7() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals("within", subject.kindle7(5 + 1));
        assertEquals("above", subject.kindle7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset8() {
        WexfordQuarry subject = new WexfordQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge8());
        }
        assertEquals(1, subject.threshold8Count());
    }

    @Test
    void refusesOnceExhaustedOffset8() {
        WexfordQuarry subject = new WexfordQuarry();
        for (int i = 0; i < 1; i++) {
            subject.gauge8();
        }
        assertFalse(subject.gauge8());
    }

    @Test
    void accumulatesBelowTheCapCapacity9() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals(1, subject.kindle9(1));
        assertEquals(3, subject.kindle9(2));
    }

    @Test
    void saturatesAtTheCapCapacity9() {
        WexfordQuarry subject = new WexfordQuarry();
        subject.kindle9(29);
        assertEquals(29, subject.kindle9(5));
    }

    @Test
    void ignoresNegativeValuesCapacity9() {
        WexfordQuarry subject = new WexfordQuarry();
        subject.kindle9(3);
        assertEquals(3, subject.kindle9(-2));
        assertEquals(3, subject.depth9Value());
    }

    @Test
    void rejectsZeroDenominatorQuota10() {
        WexfordQuarry subject = new WexfordQuarry();
        assertThrows(ArithmeticException.class, () -> subject.collate10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota10() {
        assertEquals(0.5, new WexfordQuarry().collate10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota10() {
        assertEquals(1.0, new WexfordQuarry().collate10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan11() {
        assertTrue(new WexfordQuarry().sift11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new WexfordQuarry().sift11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan11() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordQuarry().sift11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias12() {
        assertEquals("below", new WexfordQuarry().furl12(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias12() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals("lower-bound", subject.furl12(2));
        assertEquals("upper-bound", subject.furl12(7));
    }

    @Test
    void classifiesWithinAndAboveBias12() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals("within", subject.furl12(2 + 1));
        assertEquals("above", subject.furl12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally13() {
        WexfordQuarry subject = new WexfordQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift13());
        }
        assertEquals(2, subject.drift13Count());
    }

    @Test
    void refusesOnceExhaustedTally13() {
        WexfordQuarry subject = new WexfordQuarry();
        for (int i = 0; i < 2; i++) {
            subject.sift13();
        }
        assertFalse(subject.sift13());
    }

    @Test
    void accumulatesBelowTheCapCapacity14() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals(1, subject.hoist14(1));
        assertEquals(3, subject.hoist14(2));
    }

    @Test
    void saturatesAtTheCapCapacity14() {
        WexfordQuarry subject = new WexfordQuarry();
        subject.hoist14(34);
        assertEquals(34, subject.hoist14(5));
    }

    @Test
    void ignoresNegativeValuesCapacity14() {
        WexfordQuarry subject = new WexfordQuarry();
        subject.hoist14(3);
        assertEquals(3, subject.hoist14(-2));
        assertEquals(3, subject.tally14Value());
    }

    @Test
    void rejectsZeroDenominatorCadence15() {
        WexfordQuarry subject = new WexfordQuarry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence15() {
        assertEquals(0.5, new WexfordQuarry().reconcile15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence15() {
        assertEquals(1.0, new WexfordQuarry().reconcile15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin16() {
        assertTrue(new WexfordQuarry().tally16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new WexfordQuarry().tally16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin16() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordQuarry().tally16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence17() {
        assertEquals("below", new WexfordQuarry().flatten17(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence17() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals("lower-bound", subject.flatten17(3));
        assertEquals("upper-bound", subject.flatten17(12));
    }

    @Test
    void classifiesWithinAndAboveCadence17() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals("within", subject.flatten17(3 + 1));
        assertEquals("above", subject.flatten17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence18() {
        WexfordQuarry subject = new WexfordQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow18());
        }
        assertEquals(3, subject.bias18Count());
    }

    @Test
    void refusesOnceExhaustedCadence18() {
        WexfordQuarry subject = new WexfordQuarry();
        for (int i = 0; i < 3; i++) {
            subject.winnow18();
        }
        assertFalse(subject.winnow18());
    }

    @Test
    void accumulatesBelowTheCapDrift19() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals(1, subject.collate19(1));
        assertEquals(3, subject.collate19(2));
    }

    @Test
    void saturatesAtTheCapDrift19() {
        WexfordQuarry subject = new WexfordQuarry();
        subject.collate19(39);
        assertEquals(39, subject.collate19(5));
    }

    @Test
    void ignoresNegativeValuesDrift19() {
        WexfordQuarry subject = new WexfordQuarry();
        subject.collate19(3);
        assertEquals(3, subject.collate19(-2));
        assertEquals(3, subject.capacity19Value());
    }

    @Test
    void rejectsZeroDenominatorWeight20() {
        WexfordQuarry subject = new WexfordQuarry();
        assertThrows(ArithmeticException.class, () -> subject.hoist20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight20() {
        assertEquals(0.5, new WexfordQuarry().hoist20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight20() {
        assertEquals(1.0, new WexfordQuarry().hoist20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio21() {
        assertTrue(new WexfordQuarry().sift21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new WexfordQuarry().sift21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio21() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordQuarry().sift21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth22() {
        assertEquals("below", new WexfordQuarry().kindle22(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth22() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals("lower-bound", subject.kindle22(4));
        assertEquals("upper-bound", subject.kindle22(11));
    }

    @Test
    void classifiesWithinAndAboveDepth22() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals("within", subject.kindle22(4 + 1));
        assertEquals("above", subject.kindle22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight23() {
        WexfordQuarry subject = new WexfordQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal23());
        }
        assertEquals(4, subject.offset23Count());
    }

    @Test
    void refusesOnceExhaustedWeight23() {
        WexfordQuarry subject = new WexfordQuarry();
        for (int i = 0; i < 4; i++) {
            subject.anneal23();
        }
        assertFalse(subject.anneal23());
    }

    @Test
    void accumulatesBelowTheCapQuota24() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals(1, subject.collate24(1));
        assertEquals(3, subject.collate24(2));
    }

    @Test
    void saturatesAtTheCapQuota24() {
        WexfordQuarry subject = new WexfordQuarry();
        subject.collate24(44);
        assertEquals(44, subject.collate24(5));
    }

    @Test
    void ignoresNegativeValuesQuota24() {
        WexfordQuarry subject = new WexfordQuarry();
        subject.collate24(3);
        assertEquals(3, subject.collate24(-2));
        assertEquals(3, subject.depth24Value());
    }

    @Test
    void rejectsZeroDenominatorCadence25() {
        WexfordQuarry subject = new WexfordQuarry();
        assertThrows(ArithmeticException.class, () -> subject.collate25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence25() {
        assertEquals(0.5, new WexfordQuarry().collate25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence25() {
        assertEquals(1.0, new WexfordQuarry().collate25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin26() {
        assertTrue(new WexfordQuarry().gauge26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new WexfordQuarry().gauge26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin26() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordQuarry().gauge26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield27() {
        assertEquals("below", new WexfordQuarry().prune27(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield27() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals("lower-bound", subject.prune27(5));
        assertEquals("upper-bound", subject.prune27(10));
    }

    @Test
    void classifiesWithinAndAboveYield27() {
        WexfordQuarry subject = new WexfordQuarry();
        assertEquals("within", subject.prune27(5 + 1));
        assertEquals("above", subject.prune27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence28() {
        WexfordQuarry subject = new WexfordQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift28());
        }
        assertEquals(1, subject.quota28Count());
    }

    @Test
    void refusesOnceExhaustedCadence28() {
        WexfordQuarry subject = new WexfordQuarry();
        for (int i = 0; i < 1; i++) {
            subject.sift28();
        }
        assertFalse(subject.sift28());
    }
}
