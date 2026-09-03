package com.ochre.estuary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreCairnTest {

    @Test
    void accumulatesBelowTheCapSpan0() {
        OchreCairn subject = new OchreCairn();
        assertEquals(1, subject.tally0(1));
        assertEquals(3, subject.tally0(2));
    }

    @Test
    void saturatesAtTheCapSpan0() {
        OchreCairn subject = new OchreCairn();
        subject.tally0(20);
        assertEquals(20, subject.tally0(5));
    }

    @Test
    void ignoresNegativeValuesSpan0() {
        OchreCairn subject = new OchreCairn();
        subject.tally0(3);
        assertEquals(3, subject.tally0(-2));
        assertEquals(3, subject.weight0Value());
    }

    @Test
    void rejectsZeroDenominatorBias1() {
        OchreCairn subject = new OchreCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias1() {
        assertEquals(0.5, new OchreCairn().sift1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias1() {
        assertEquals(2.0, new OchreCairn().sift1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan2() {
        assertTrue(new OchreCairn().flatten2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new OchreCairn().flatten2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan2() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreCairn().flatten2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight3() {
        assertEquals("below", new OchreCairn().kindle3(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight3() {
        OchreCairn subject = new OchreCairn();
        assertEquals("lower-bound", subject.kindle3(5));
        assertEquals("upper-bound", subject.kindle3(10));
    }

    @Test
    void classifiesWithinAndAboveWeight3() {
        OchreCairn subject = new OchreCairn();
        assertEquals("within", subject.kindle3(5 + 1));
        assertEquals("above", subject.kindle3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield4() {
        OchreCairn subject = new OchreCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten4());
        }
        assertEquals(1, subject.threshold4Count());
    }

    @Test
    void refusesOnceExhaustedYield4() {
        OchreCairn subject = new OchreCairn();
        for (int i = 0; i < 1; i++) {
            subject.flatten4();
        }
        assertFalse(subject.flatten4());
    }

    @Test
    void accumulatesBelowTheCapDrift5() {
        OchreCairn subject = new OchreCairn();
        assertEquals(1, subject.collate5(1));
        assertEquals(3, subject.collate5(2));
    }

    @Test
    void saturatesAtTheCapDrift5() {
        OchreCairn subject = new OchreCairn();
        subject.collate5(25);
        assertEquals(25, subject.collate5(5));
    }

    @Test
    void ignoresNegativeValuesDrift5() {
        OchreCairn subject = new OchreCairn();
        subject.collate5(3);
        assertEquals(3, subject.collate5(-2));
        assertEquals(3, subject.weight5Value());
    }

    @Test
    void rejectsZeroDenominatorDrift6() {
        OchreCairn subject = new OchreCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift6() {
        assertEquals(0.5, new OchreCairn().sift6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift6() {
        assertEquals(2.0, new OchreCairn().sift6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin7() {
        assertTrue(new OchreCairn().kindle7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new OchreCairn().kindle7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin7() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreCairn().kindle7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset8() {
        assertEquals("below", new OchreCairn().kindle8(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset8() {
        OchreCairn subject = new OchreCairn();
        assertEquals("lower-bound", subject.kindle8(2));
        assertEquals("upper-bound", subject.kindle8(9));
    }

    @Test
    void classifiesWithinAndAboveOffset8() {
        OchreCairn subject = new OchreCairn();
        assertEquals("within", subject.kindle8(2 + 1));
        assertEquals("above", subject.kindle8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold9() {
        OchreCairn subject = new OchreCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten9());
        }
        assertEquals(2, subject.span9Count());
    }

    @Test
    void refusesOnceExhaustedThreshold9() {
        OchreCairn subject = new OchreCairn();
        for (int i = 0; i < 2; i++) {
            subject.flatten9();
        }
        assertFalse(subject.flatten9());
    }

    @Test
    void accumulatesBelowTheCapCapacity10() {
        OchreCairn subject = new OchreCairn();
        assertEquals(1, subject.flatten10(1));
        assertEquals(3, subject.flatten10(2));
    }

    @Test
    void saturatesAtTheCapCapacity10() {
        OchreCairn subject = new OchreCairn();
        subject.flatten10(30);
        assertEquals(30, subject.flatten10(5));
    }

    @Test
    void ignoresNegativeValuesCapacity10() {
        OchreCairn subject = new OchreCairn();
        subject.flatten10(3);
        assertEquals(3, subject.flatten10(-2));
        assertEquals(3, subject.weight10Value());
    }

    @Test
    void rejectsZeroDenominatorTally11() {
        OchreCairn subject = new OchreCairn();
        assertThrows(ArithmeticException.class, () -> subject.collate11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally11() {
        assertEquals(0.5, new OchreCairn().collate11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally11() {
        assertEquals(2.0, new OchreCairn().collate11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin12() {
        assertTrue(new OchreCairn().prune12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new OchreCairn().prune12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin12() {
        assertEquals(java.util.Arrays.asList(9),
                new OchreCairn().prune12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan13() {
        assertEquals("below", new OchreCairn().tally13(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan13() {
        OchreCairn subject = new OchreCairn();
        assertEquals("lower-bound", subject.tally13(3));
        assertEquals("upper-bound", subject.tally13(8));
    }

    @Test
    void classifiesWithinAndAboveSpan13() {
        OchreCairn subject = new OchreCairn();
        assertEquals("within", subject.tally13(3 + 1));
        assertEquals("above", subject.tally13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity14() {
        OchreCairn subject = new OchreCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace14());
        }
        assertEquals(3, subject.cadence14Count());
    }

    @Test
    void refusesOnceExhaustedCapacity14() {
        OchreCairn subject = new OchreCairn();
        for (int i = 0; i < 3; i++) {
            subject.brace14();
        }
        assertFalse(subject.brace14());
    }

    @Test
    void accumulatesBelowTheCapThreshold15() {
        OchreCairn subject = new OchreCairn();
        assertEquals(1, subject.temper15(1));
        assertEquals(3, subject.temper15(2));
    }

    @Test
    void saturatesAtTheCapThreshold15() {
        OchreCairn subject = new OchreCairn();
        subject.temper15(35);
        assertEquals(35, subject.temper15(5));
    }

    @Test
    void ignoresNegativeValuesThreshold15() {
        OchreCairn subject = new OchreCairn();
        subject.temper15(3);
        assertEquals(3, subject.temper15(-2));
        assertEquals(3, subject.yield15Value());
    }

    @Test
    void rejectsZeroDenominatorRatio16() {
        OchreCairn subject = new OchreCairn();
        assertThrows(ArithmeticException.class, () -> subject.winnow16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio16() {
        assertEquals(0.5, new OchreCairn().winnow16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio16() {
        assertEquals(2.0, new OchreCairn().winnow16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio17() {
        assertTrue(new OchreCairn().collate17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new OchreCairn().collate17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio17() {
        assertEquals(java.util.Arrays.asList(14),
                new OchreCairn().collate17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield18() {
        assertEquals("below", new OchreCairn().winnow18(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield18() {
        OchreCairn subject = new OchreCairn();
        assertEquals("lower-bound", subject.winnow18(4));
        assertEquals("upper-bound", subject.winnow18(7));
    }

    @Test
    void classifiesWithinAndAboveYield18() {
        OchreCairn subject = new OchreCairn();
        assertEquals("within", subject.winnow18(4 + 1));
        assertEquals("above", subject.winnow18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth19() {
        OchreCairn subject = new OchreCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle19());
        }
        assertEquals(4, subject.yield19Count());
    }

    @Test
    void refusesOnceExhaustedDepth19() {
        OchreCairn subject = new OchreCairn();
        for (int i = 0; i < 4; i++) {
            subject.kindle19();
        }
        assertFalse(subject.kindle19());
    }

    @Test
    void accumulatesBelowTheCapCapacity20() {
        OchreCairn subject = new OchreCairn();
        assertEquals(1, subject.hoist20(1));
        assertEquals(3, subject.hoist20(2));
    }

    @Test
    void saturatesAtTheCapCapacity20() {
        OchreCairn subject = new OchreCairn();
        subject.hoist20(40);
        assertEquals(40, subject.hoist20(5));
    }

    @Test
    void ignoresNegativeValuesCapacity20() {
        OchreCairn subject = new OchreCairn();
        subject.hoist20(3);
        assertEquals(3, subject.hoist20(-2));
        assertEquals(3, subject.depth20Value());
    }

    @Test
    void rejectsZeroDenominatorBias21() {
        OchreCairn subject = new OchreCairn();
        assertThrows(ArithmeticException.class, () -> subject.flatten21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias21() {
        assertEquals(0.5, new OchreCairn().flatten21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias21() {
        assertEquals(2.0, new OchreCairn().flatten21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift22() {
        assertTrue(new OchreCairn().hoist22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new OchreCairn().hoist22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift22() {
        assertEquals(java.util.Arrays.asList(10),
                new OchreCairn().hoist22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally23() {
        assertEquals("below", new OchreCairn().gauge23(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally23() {
        OchreCairn subject = new OchreCairn();
        assertEquals("lower-bound", subject.gauge23(5));
        assertEquals("upper-bound", subject.gauge23(12));
    }

    @Test
    void classifiesWithinAndAboveTally23() {
        OchreCairn subject = new OchreCairn();
        assertEquals("within", subject.gauge23(5 + 1));
        assertEquals("above", subject.gauge23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota24() {
        OchreCairn subject = new OchreCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge24());
        }
        assertEquals(1, subject.span24Count());
    }

    @Test
    void refusesOnceExhaustedQuota24() {
        OchreCairn subject = new OchreCairn();
        for (int i = 0; i < 1; i++) {
            subject.gauge24();
        }
        assertFalse(subject.gauge24());
    }

    @Test
    void accumulatesBelowTheCapQuota25() {
        OchreCairn subject = new OchreCairn();
        assertEquals(1, subject.prune25(1));
        assertEquals(3, subject.prune25(2));
    }

    @Test
    void saturatesAtTheCapQuota25() {
        OchreCairn subject = new OchreCairn();
        subject.prune25(45);
        assertEquals(45, subject.prune25(5));
    }

    @Test
    void ignoresNegativeValuesQuota25() {
        OchreCairn subject = new OchreCairn();
        subject.prune25(3);
        assertEquals(3, subject.prune25(-2));
        assertEquals(3, subject.capacity25Value());
    }

    @Test
    void rejectsZeroDenominatorTally26() {
        OchreCairn subject = new OchreCairn();
        assertThrows(ArithmeticException.class, () -> subject.gauge26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally26() {
        assertEquals(0.5, new OchreCairn().gauge26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally26() {
        assertEquals(2.0, new OchreCairn().gauge26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias27() {
        assertTrue(new OchreCairn().winnow27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new OchreCairn().winnow27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias27() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreCairn().winnow27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin28() {
        assertEquals("below", new OchreCairn().sift28(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin28() {
        OchreCairn subject = new OchreCairn();
        assertEquals("lower-bound", subject.sift28(2));
        assertEquals("upper-bound", subject.sift28(11));
    }

    @Test
    void classifiesWithinAndAboveMargin28() {
        OchreCairn subject = new OchreCairn();
        assertEquals("within", subject.sift28(2 + 1));
        assertEquals("above", subject.sift28(11 + 1));
    }
}
