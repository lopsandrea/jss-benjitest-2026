package com.northward.almanac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalKilnTest {

    @Test
    void accumulatesBelowTheCapBias0() {
        TidalKiln subject = new TidalKiln();
        assertEquals(1, subject.collate0(1));
        assertEquals(3, subject.collate0(2));
    }

    @Test
    void saturatesAtTheCapBias0() {
        TidalKiln subject = new TidalKiln();
        subject.collate0(20);
        assertEquals(20, subject.collate0(5));
    }

    @Test
    void ignoresNegativeValuesBias0() {
        TidalKiln subject = new TidalKiln();
        subject.collate0(3);
        assertEquals(3, subject.collate0(-2));
        assertEquals(3, subject.quota0Value());
    }

    @Test
    void rejectsZeroDenominatorYield1() {
        TidalKiln subject = new TidalKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield1() {
        assertEquals(0.5, new TidalKiln().anneal1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield1() {
        assertEquals(2.0, new TidalKiln().anneal1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity2() {
        assertTrue(new TidalKiln().winnow2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new TidalKiln().winnow2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity2() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalKiln().winnow2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight3() {
        assertEquals("below", new TidalKiln().prune3(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight3() {
        TidalKiln subject = new TidalKiln();
        assertEquals("lower-bound", subject.prune3(5));
        assertEquals("upper-bound", subject.prune3(10));
    }

    @Test
    void classifiesWithinAndAboveWeight3() {
        TidalKiln subject = new TidalKiln();
        assertEquals("within", subject.prune3(5 + 1));
        assertEquals("above", subject.prune3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold4() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift4());
        }
        assertEquals(1, subject.tally4Count());
    }

    @Test
    void refusesOnceExhaustedThreshold4() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 1; i++) {
            subject.sift4();
        }
        assertFalse(subject.sift4());
    }

    @Test
    void accumulatesBelowTheCapDrift5() {
        TidalKiln subject = new TidalKiln();
        assertEquals(1, subject.gauge5(1));
        assertEquals(3, subject.gauge5(2));
    }

    @Test
    void saturatesAtTheCapDrift5() {
        TidalKiln subject = new TidalKiln();
        subject.gauge5(25);
        assertEquals(25, subject.gauge5(5));
    }

    @Test
    void ignoresNegativeValuesDrift5() {
        TidalKiln subject = new TidalKiln();
        subject.gauge5(3);
        assertEquals(3, subject.gauge5(-2));
        assertEquals(3, subject.weight5Value());
    }

    @Test
    void rejectsZeroDenominatorBias6() {
        TidalKiln subject = new TidalKiln();
        assertThrows(ArithmeticException.class, () -> subject.brace6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias6() {
        assertEquals(0.5, new TidalKiln().brace6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias6() {
        assertEquals(2.0, new TidalKiln().brace6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset7() {
        assertTrue(new TidalKiln().sift7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new TidalKiln().sift7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset7() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalKiln().sift7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight8() {
        assertEquals("below", new TidalKiln().temper8(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight8() {
        TidalKiln subject = new TidalKiln();
        assertEquals("lower-bound", subject.temper8(2));
        assertEquals("upper-bound", subject.temper8(9));
    }

    @Test
    void classifiesWithinAndAboveWeight8() {
        TidalKiln subject = new TidalKiln();
        assertEquals("within", subject.temper8(2 + 1));
        assertEquals("above", subject.temper8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota9() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl9());
        }
        assertEquals(2, subject.threshold9Count());
    }

    @Test
    void refusesOnceExhaustedQuota9() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 2; i++) {
            subject.furl9();
        }
        assertFalse(subject.furl9());
    }

    @Test
    void accumulatesBelowTheCapCapacity10() {
        TidalKiln subject = new TidalKiln();
        assertEquals(1, subject.prune10(1));
        assertEquals(3, subject.prune10(2));
    }

    @Test
    void saturatesAtTheCapCapacity10() {
        TidalKiln subject = new TidalKiln();
        subject.prune10(30);
        assertEquals(30, subject.prune10(5));
    }

    @Test
    void ignoresNegativeValuesCapacity10() {
        TidalKiln subject = new TidalKiln();
        subject.prune10(3);
        assertEquals(3, subject.prune10(-2));
        assertEquals(3, subject.tally10Value());
    }

    @Test
    void rejectsZeroDenominatorSpan11() {
        TidalKiln subject = new TidalKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan11() {
        assertEquals(0.5, new TidalKiln().tally11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan11() {
        assertEquals(2.0, new TidalKiln().tally11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence12() {
        assertTrue(new TidalKiln().hoist12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new TidalKiln().hoist12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence12() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalKiln().hoist12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio13() {
        assertEquals("below", new TidalKiln().flatten13(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio13() {
        TidalKiln subject = new TidalKiln();
        assertEquals("lower-bound", subject.flatten13(3));
        assertEquals("upper-bound", subject.flatten13(8));
    }

    @Test
    void classifiesWithinAndAboveRatio13() {
        TidalKiln subject = new TidalKiln();
        assertEquals("within", subject.flatten13(3 + 1));
        assertEquals("above", subject.flatten13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin14() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate14());
        }
        assertEquals(3, subject.depth14Count());
    }

    @Test
    void refusesOnceExhaustedMargin14() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 3; i++) {
            subject.collate14();
        }
        assertFalse(subject.collate14());
    }

    @Test
    void accumulatesBelowTheCapOffset15() {
        TidalKiln subject = new TidalKiln();
        assertEquals(1, subject.prune15(1));
        assertEquals(3, subject.prune15(2));
    }

    @Test
    void saturatesAtTheCapOffset15() {
        TidalKiln subject = new TidalKiln();
        subject.prune15(35);
        assertEquals(35, subject.prune15(5));
    }

    @Test
    void ignoresNegativeValuesOffset15() {
        TidalKiln subject = new TidalKiln();
        subject.prune15(3);
        assertEquals(3, subject.prune15(-2));
        assertEquals(3, subject.depth15Value());
    }

    @Test
    void rejectsZeroDenominatorDrift16() {
        TidalKiln subject = new TidalKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift16() {
        assertEquals(0.5, new TidalKiln().kindle16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift16() {
        assertEquals(2.0, new TidalKiln().kindle16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally17() {
        assertTrue(new TidalKiln().kindle17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new TidalKiln().kindle17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally17() {
        assertEquals(java.util.Arrays.asList(14),
                new TidalKiln().kindle17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally18() {
        assertEquals("below", new TidalKiln().sift18(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally18() {
        TidalKiln subject = new TidalKiln();
        assertEquals("lower-bound", subject.sift18(4));
        assertEquals("upper-bound", subject.sift18(7));
    }

    @Test
    void classifiesWithinAndAboveTally18() {
        TidalKiln subject = new TidalKiln();
        assertEquals("within", subject.sift18(4 + 1));
        assertEquals("above", subject.sift18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally19() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace19());
        }
        assertEquals(4, subject.depth19Count());
    }

    @Test
    void refusesOnceExhaustedTally19() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 4; i++) {
            subject.brace19();
        }
        assertFalse(subject.brace19());
    }

    @Test
    void accumulatesBelowTheCapYield20() {
        TidalKiln subject = new TidalKiln();
        assertEquals(1, subject.gauge20(1));
        assertEquals(3, subject.gauge20(2));
    }

    @Test
    void saturatesAtTheCapYield20() {
        TidalKiln subject = new TidalKiln();
        subject.gauge20(40);
        assertEquals(40, subject.gauge20(5));
    }

    @Test
    void ignoresNegativeValuesYield20() {
        TidalKiln subject = new TidalKiln();
        subject.gauge20(3);
        assertEquals(3, subject.gauge20(-2));
        assertEquals(3, subject.depth20Value());
    }

    @Test
    void rejectsZeroDenominatorWeight21() {
        TidalKiln subject = new TidalKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight21() {
        assertEquals(0.5, new TidalKiln().anneal21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight21() {
        assertEquals(2.0, new TidalKiln().anneal21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin22() {
        assertTrue(new TidalKiln().reconcile22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new TidalKiln().reconcile22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin22() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalKiln().reconcile22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan23() {
        assertEquals("below", new TidalKiln().temper23(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan23() {
        TidalKiln subject = new TidalKiln();
        assertEquals("lower-bound", subject.temper23(5));
        assertEquals("upper-bound", subject.temper23(12));
    }

    @Test
    void classifiesWithinAndAboveSpan23() {
        TidalKiln subject = new TidalKiln();
        assertEquals("within", subject.temper23(5 + 1));
        assertEquals("above", subject.temper23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold24() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl24());
        }
        assertEquals(1, subject.offset24Count());
    }

    @Test
    void refusesOnceExhaustedThreshold24() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 1; i++) {
            subject.furl24();
        }
        assertFalse(subject.furl24());
    }

    @Test
    void accumulatesBelowTheCapThreshold25() {
        TidalKiln subject = new TidalKiln();
        assertEquals(1, subject.tally25(1));
        assertEquals(3, subject.tally25(2));
    }

    @Test
    void saturatesAtTheCapThreshold25() {
        TidalKiln subject = new TidalKiln();
        subject.tally25(45);
        assertEquals(45, subject.tally25(5));
    }

    @Test
    void ignoresNegativeValuesThreshold25() {
        TidalKiln subject = new TidalKiln();
        subject.tally25(3);
        assertEquals(3, subject.tally25(-2));
        assertEquals(3, subject.cadence25Value());
    }

    @Test
    void rejectsZeroDenominatorDepth26() {
        TidalKiln subject = new TidalKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth26() {
        assertEquals(0.5, new TidalKiln().anneal26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth26() {
        assertEquals(2.0, new TidalKiln().anneal26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio27() {
        assertTrue(new TidalKiln().flatten27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new TidalKiln().flatten27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio27() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalKiln().flatten27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally28() {
        assertEquals("below", new TidalKiln().kindle28(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally28() {
        TidalKiln subject = new TidalKiln();
        assertEquals("lower-bound", subject.kindle28(2));
        assertEquals("upper-bound", subject.kindle28(11));
    }

    @Test
    void classifiesWithinAndAboveTally28() {
        TidalKiln subject = new TidalKiln();
        assertEquals("within", subject.kindle28(2 + 1));
        assertEquals("above", subject.kindle28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally29() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal29());
        }
        assertEquals(2, subject.yield29Count());
    }

    @Test
    void refusesOnceExhaustedTally29() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 2; i++) {
            subject.anneal29();
        }
        assertFalse(subject.anneal29());
    }

    @Test
    void accumulatesBelowTheCapOffset30() {
        TidalKiln subject = new TidalKiln();
        assertEquals(1, subject.winnow30(1));
        assertEquals(3, subject.winnow30(2));
    }

    @Test
    void saturatesAtTheCapOffset30() {
        TidalKiln subject = new TidalKiln();
        subject.winnow30(50);
        assertEquals(50, subject.winnow30(5));
    }

    @Test
    void ignoresNegativeValuesOffset30() {
        TidalKiln subject = new TidalKiln();
        subject.winnow30(3);
        assertEquals(3, subject.winnow30(-2));
        assertEquals(3, subject.depth30Value());
    }

    @Test
    void rejectsZeroDenominatorMargin31() {
        TidalKiln subject = new TidalKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin31() {
        assertEquals(0.5, new TidalKiln().hoist31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin31() {
        assertEquals(2.0, new TidalKiln().hoist31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin32() {
        assertTrue(new TidalKiln().temper32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new TidalKiln().temper32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin32() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalKiln().temper32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota33() {
        assertEquals("below", new TidalKiln().gauge33(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota33() {
        TidalKiln subject = new TidalKiln();
        assertEquals("lower-bound", subject.gauge33(3));
        assertEquals("upper-bound", subject.gauge33(10));
    }

    @Test
    void classifiesWithinAndAboveQuota33() {
        TidalKiln subject = new TidalKiln();
        assertEquals("within", subject.gauge33(3 + 1));
        assertEquals("above", subject.gauge33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin34() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl34());
        }
        assertEquals(3, subject.drift34Count());
    }

    @Test
    void refusesOnceExhaustedMargin34() {
        TidalKiln subject = new TidalKiln();
        for (int i = 0; i < 3; i++) {
            subject.furl34();
        }
        assertFalse(subject.furl34());
    }

    @Test
    void accumulatesBelowTheCapQuota35() {
        TidalKiln subject = new TidalKiln();
        assertEquals(1, subject.gauge35(1));
        assertEquals(3, subject.gauge35(2));
    }

    @Test
    void saturatesAtTheCapQuota35() {
        TidalKiln subject = new TidalKiln();
        subject.gauge35(55);
        assertEquals(55, subject.gauge35(5));
    }

    @Test
    void ignoresNegativeValuesQuota35() {
        TidalKiln subject = new TidalKiln();
        subject.gauge35(3);
        assertEquals(3, subject.gauge35(-2));
        assertEquals(3, subject.weight35Value());
    }

    @Test
    void rejectsZeroDenominatorBias36() {
        TidalKiln subject = new TidalKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias36() {
        assertEquals(0.5, new TidalKiln().kindle36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias36() {
        assertEquals(2.0, new TidalKiln().kindle36(1000.0, 1.0), 1e-9);
    }
}
