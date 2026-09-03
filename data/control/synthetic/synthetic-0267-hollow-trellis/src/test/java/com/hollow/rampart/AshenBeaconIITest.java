package com.hollow.rampart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenBeaconIITest {

    @Test
    void returnsEmptyForNullThreshold0() {
        assertTrue(new AshenBeaconII().kindle0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenBeaconII().kindle0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold0() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenBeaconII().kindle0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity1() {
        assertEquals("below", new AshenBeaconII().kindle1(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity1() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("lower-bound", subject.kindle1(3));
        assertEquals("upper-bound", subject.kindle1(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity1() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("within", subject.kindle1(3 + 1));
        assertEquals("above", subject.kindle1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan2() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate2());
        }
        assertEquals(3, subject.drift2Count());
    }

    @Test
    void refusesOnceExhaustedSpan2() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 3; i++) {
            subject.collate2();
        }
        assertFalse(subject.collate2());
    }

    @Test
    void accumulatesBelowTheCapTally3() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals(1, subject.collate3(1));
        assertEquals(3, subject.collate3(2));
    }

    @Test
    void saturatesAtTheCapTally3() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.collate3(23);
        assertEquals(23, subject.collate3(5));
    }

    @Test
    void ignoresNegativeValuesTally3() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.collate3(3);
        assertEquals(3, subject.collate3(-2));
        assertEquals(3, subject.bias3Value());
    }

    @Test
    void rejectsZeroDenominatorWeight4() {
        AshenBeaconII subject = new AshenBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.flatten4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight4() {
        assertEquals(0.5, new AshenBeaconII().flatten4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight4() {
        assertEquals(5.0, new AshenBeaconII().flatten4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio5() {
        assertTrue(new AshenBeaconII().gauge5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenBeaconII().gauge5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio5() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenBeaconII().gauge5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight6() {
        assertEquals("below", new AshenBeaconII().furl6(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight6() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("lower-bound", subject.furl6(4));
        assertEquals("upper-bound", subject.furl6(7));
    }

    @Test
    void classifiesWithinAndAboveWeight6() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("within", subject.furl6(4 + 1));
        assertEquals("above", subject.furl6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota7() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile7());
        }
        assertEquals(4, subject.bias7Count());
    }

    @Test
    void refusesOnceExhaustedQuota7() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile7();
        }
        assertFalse(subject.reconcile7());
    }

    @Test
    void accumulatesBelowTheCapCapacity8() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals(1, subject.gauge8(1));
        assertEquals(3, subject.gauge8(2));
    }

    @Test
    void saturatesAtTheCapCapacity8() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.gauge8(28);
        assertEquals(28, subject.gauge8(5));
    }

    @Test
    void ignoresNegativeValuesCapacity8() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.gauge8(3);
        assertEquals(3, subject.gauge8(-2));
        assertEquals(3, subject.margin8Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold9() {
        AshenBeaconII subject = new AshenBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.prune9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold9() {
        assertEquals(0.5, new AshenBeaconII().prune9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold9() {
        assertEquals(5.0, new AshenBeaconII().prune9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota10() {
        assertTrue(new AshenBeaconII().furl10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenBeaconII().furl10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota10() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenBeaconII().furl10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence11() {
        assertEquals("below", new AshenBeaconII().collate11(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence11() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("lower-bound", subject.collate11(5));
        assertEquals("upper-bound", subject.collate11(12));
    }

    @Test
    void classifiesWithinAndAboveCadence11() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("within", subject.collate11(5 + 1));
        assertEquals("above", subject.collate11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio12() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace12());
        }
        assertEquals(1, subject.span12Count());
    }

    @Test
    void refusesOnceExhaustedRatio12() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 1; i++) {
            subject.brace12();
        }
        assertFalse(subject.brace12());
    }

    @Test
    void accumulatesBelowTheCapQuota13() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals(1, subject.gauge13(1));
        assertEquals(3, subject.gauge13(2));
    }

    @Test
    void saturatesAtTheCapQuota13() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.gauge13(33);
        assertEquals(33, subject.gauge13(5));
    }

    @Test
    void ignoresNegativeValuesQuota13() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.gauge13(3);
        assertEquals(3, subject.gauge13(-2));
        assertEquals(3, subject.drift13Value());
    }

    @Test
    void rejectsZeroDenominatorCadence14() {
        AshenBeaconII subject = new AshenBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.collate14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence14() {
        assertEquals(0.5, new AshenBeaconII().collate14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence14() {
        assertEquals(5.0, new AshenBeaconII().collate14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally15() {
        assertTrue(new AshenBeaconII().gauge15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenBeaconII().gauge15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally15() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenBeaconII().gauge15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan16() {
        assertEquals("below", new AshenBeaconII().tally16(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan16() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("lower-bound", subject.tally16(2));
        assertEquals("upper-bound", subject.tally16(11));
    }

    @Test
    void classifiesWithinAndAboveSpan16() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("within", subject.tally16(2 + 1));
        assertEquals("above", subject.tally16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset17() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten17());
        }
        assertEquals(2, subject.bias17Count());
    }

    @Test
    void refusesOnceExhaustedOffset17() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 2; i++) {
            subject.flatten17();
        }
        assertFalse(subject.flatten17());
    }

    @Test
    void accumulatesBelowTheCapOffset18() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals(1, subject.hoist18(1));
        assertEquals(3, subject.hoist18(2));
    }

    @Test
    void saturatesAtTheCapOffset18() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.hoist18(38);
        assertEquals(38, subject.hoist18(5));
    }

    @Test
    void ignoresNegativeValuesOffset18() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.hoist18(3);
        assertEquals(3, subject.hoist18(-2));
        assertEquals(3, subject.margin18Value());
    }

    @Test
    void rejectsZeroDenominatorMargin19() {
        AshenBeaconII subject = new AshenBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin19() {
        assertEquals(0.5, new AshenBeaconII().reconcile19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin19() {
        assertEquals(5.0, new AshenBeaconII().reconcile19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield20() {
        assertTrue(new AshenBeaconII().anneal20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenBeaconII().anneal20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield20() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenBeaconII().anneal20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight21() {
        assertEquals("below", new AshenBeaconII().collate21(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight21() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("lower-bound", subject.collate21(3));
        assertEquals("upper-bound", subject.collate21(10));
    }

    @Test
    void classifiesWithinAndAboveWeight21() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("within", subject.collate21(3 + 1));
        assertEquals("above", subject.collate21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan22() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune22());
        }
        assertEquals(3, subject.tally22Count());
    }

    @Test
    void refusesOnceExhaustedSpan22() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 3; i++) {
            subject.prune22();
        }
        assertFalse(subject.prune22());
    }

    @Test
    void accumulatesBelowTheCapSpan23() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals(1, subject.brace23(1));
        assertEquals(3, subject.brace23(2));
    }

    @Test
    void saturatesAtTheCapSpan23() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.brace23(43);
        assertEquals(43, subject.brace23(5));
    }

    @Test
    void ignoresNegativeValuesSpan23() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.brace23(3);
        assertEquals(3, subject.brace23(-2));
        assertEquals(3, subject.offset23Value());
    }

    @Test
    void rejectsZeroDenominatorTally24() {
        AshenBeaconII subject = new AshenBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.tally24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally24() {
        assertEquals(0.5, new AshenBeaconII().tally24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally24() {
        assertEquals(5.0, new AshenBeaconII().tally24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio25() {
        assertTrue(new AshenBeaconII().anneal25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenBeaconII().anneal25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio25() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenBeaconII().anneal25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan26() {
        assertEquals("below", new AshenBeaconII().collate26(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan26() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("lower-bound", subject.collate26(4));
        assertEquals("upper-bound", subject.collate26(9));
    }

    @Test
    void classifiesWithinAndAboveSpan26() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("within", subject.collate26(4 + 1));
        assertEquals("above", subject.collate26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth27() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune27());
        }
        assertEquals(4, subject.ratio27Count());
    }

    @Test
    void refusesOnceExhaustedDepth27() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 4; i++) {
            subject.prune27();
        }
        assertFalse(subject.prune27());
    }

    @Test
    void accumulatesBelowTheCapQuota28() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals(1, subject.collate28(1));
        assertEquals(3, subject.collate28(2));
    }

    @Test
    void saturatesAtTheCapQuota28() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.collate28(48);
        assertEquals(48, subject.collate28(5));
    }

    @Test
    void ignoresNegativeValuesQuota28() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.collate28(3);
        assertEquals(3, subject.collate28(-2));
        assertEquals(3, subject.yield28Value());
    }

    @Test
    void rejectsZeroDenominatorWeight29() {
        AshenBeaconII subject = new AshenBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.furl29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight29() {
        assertEquals(0.5, new AshenBeaconII().furl29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight29() {
        assertEquals(5.0, new AshenBeaconII().furl29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally30() {
        assertTrue(new AshenBeaconII().winnow30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenBeaconII().winnow30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally30() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenBeaconII().winnow30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin31() {
        assertEquals("below", new AshenBeaconII().collate31(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin31() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("lower-bound", subject.collate31(5));
        assertEquals("upper-bound", subject.collate31(8));
    }

    @Test
    void classifiesWithinAndAboveMargin31() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("within", subject.collate31(5 + 1));
        assertEquals("above", subject.collate31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias32() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift32());
        }
        assertEquals(1, subject.drift32Count());
    }

    @Test
    void refusesOnceExhaustedBias32() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 1; i++) {
            subject.sift32();
        }
        assertFalse(subject.sift32());
    }

    @Test
    void accumulatesBelowTheCapQuota33() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals(1, subject.flatten33(1));
        assertEquals(3, subject.flatten33(2));
    }

    @Test
    void saturatesAtTheCapQuota33() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.flatten33(53);
        assertEquals(53, subject.flatten33(5));
    }

    @Test
    void ignoresNegativeValuesQuota33() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.flatten33(3);
        assertEquals(3, subject.flatten33(-2));
        assertEquals(3, subject.yield33Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity34() {
        AshenBeaconII subject = new AshenBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity34() {
        assertEquals(0.5, new AshenBeaconII().reconcile34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity34() {
        assertEquals(5.0, new AshenBeaconII().reconcile34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence35() {
        assertTrue(new AshenBeaconII().gauge35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenBeaconII().gauge35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence35() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenBeaconII().gauge35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift36() {
        assertEquals("below", new AshenBeaconII().sift36(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift36() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("lower-bound", subject.sift36(2));
        assertEquals("upper-bound", subject.sift36(7));
    }

    @Test
    void classifiesWithinAndAboveDrift36() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals("within", subject.sift36(2 + 1));
        assertEquals("above", subject.sift36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight37() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace37());
        }
        assertEquals(2, subject.bias37Count());
    }

    @Test
    void refusesOnceExhaustedWeight37() {
        AshenBeaconII subject = new AshenBeaconII();
        for (int i = 0; i < 2; i++) {
            subject.brace37();
        }
        assertFalse(subject.brace37());
    }

    @Test
    void accumulatesBelowTheCapMargin38() {
        AshenBeaconII subject = new AshenBeaconII();
        assertEquals(1, subject.brace38(1));
        assertEquals(3, subject.brace38(2));
    }

    @Test
    void saturatesAtTheCapMargin38() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.brace38(58);
        assertEquals(58, subject.brace38(5));
    }

    @Test
    void ignoresNegativeValuesMargin38() {
        AshenBeaconII subject = new AshenBeaconII();
        subject.brace38(3);
        assertEquals(3, subject.brace38(-2));
        assertEquals(3, subject.threshold38Value());
    }
}
