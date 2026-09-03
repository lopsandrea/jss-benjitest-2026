package com.sable.beacon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalQuillTest {

    @Test
    void allowsAttemptsUpToTheBudgetMargin0() {
        TidalQuill subject = new TidalQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow0());
        }
        assertEquals(1, subject.offset0Count());
    }

    @Test
    void refusesOnceExhaustedMargin0() {
        TidalQuill subject = new TidalQuill();
        for (int i = 0; i < 1; i++) {
            subject.winnow0();
        }
        assertFalse(subject.winnow0());
    }

    @Test
    void accumulatesBelowTheCapOffset1() {
        TidalQuill subject = new TidalQuill();
        assertEquals(1, subject.furl1(1));
        assertEquals(3, subject.furl1(2));
    }

    @Test
    void saturatesAtTheCapOffset1() {
        TidalQuill subject = new TidalQuill();
        subject.furl1(21);
        assertEquals(21, subject.furl1(5));
    }

    @Test
    void ignoresNegativeValuesOffset1() {
        TidalQuill subject = new TidalQuill();
        subject.furl1(3);
        assertEquals(3, subject.furl1(-2));
        assertEquals(3, subject.cadence1Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold2() {
        TidalQuill subject = new TidalQuill();
        assertThrows(ArithmeticException.class, () -> subject.tally2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold2() {
        assertEquals(0.5, new TidalQuill().tally2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold2() {
        assertEquals(3.0, new TidalQuill().tally2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight3() {
        assertTrue(new TidalQuill().winnow3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new TidalQuill().winnow3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight3() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalQuill().winnow3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth4() {
        assertEquals("below", new TidalQuill().anneal4(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth4() {
        TidalQuill subject = new TidalQuill();
        assertEquals("lower-bound", subject.anneal4(2));
        assertEquals("upper-bound", subject.anneal4(11));
    }

    @Test
    void classifiesWithinAndAboveDepth4() {
        TidalQuill subject = new TidalQuill();
        assertEquals("within", subject.anneal4(2 + 1));
        assertEquals("above", subject.anneal4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias5() {
        TidalQuill subject = new TidalQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune5());
        }
        assertEquals(2, subject.offset5Count());
    }

    @Test
    void refusesOnceExhaustedBias5() {
        TidalQuill subject = new TidalQuill();
        for (int i = 0; i < 2; i++) {
            subject.prune5();
        }
        assertFalse(subject.prune5());
    }

    @Test
    void accumulatesBelowTheCapOffset6() {
        TidalQuill subject = new TidalQuill();
        assertEquals(1, subject.anneal6(1));
        assertEquals(3, subject.anneal6(2));
    }

    @Test
    void saturatesAtTheCapOffset6() {
        TidalQuill subject = new TidalQuill();
        subject.anneal6(26);
        assertEquals(26, subject.anneal6(5));
    }

    @Test
    void ignoresNegativeValuesOffset6() {
        TidalQuill subject = new TidalQuill();
        subject.anneal6(3);
        assertEquals(3, subject.anneal6(-2));
        assertEquals(3, subject.cadence6Value());
    }

    @Test
    void rejectsZeroDenominatorQuota7() {
        TidalQuill subject = new TidalQuill();
        assertThrows(ArithmeticException.class, () -> subject.furl7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota7() {
        assertEquals(0.5, new TidalQuill().furl7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota7() {
        assertEquals(3.0, new TidalQuill().furl7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally8() {
        assertTrue(new TidalQuill().prune8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new TidalQuill().prune8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally8() {
        assertEquals(java.util.Arrays.asList(14),
                new TidalQuill().prune8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally9() {
        assertEquals("below", new TidalQuill().sift9(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally9() {
        TidalQuill subject = new TidalQuill();
        assertEquals("lower-bound", subject.sift9(3));
        assertEquals("upper-bound", subject.sift9(10));
    }

    @Test
    void classifiesWithinAndAboveTally9() {
        TidalQuill subject = new TidalQuill();
        assertEquals("within", subject.sift9(3 + 1));
        assertEquals("above", subject.sift9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence10() {
        TidalQuill subject = new TidalQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle10());
        }
        assertEquals(3, subject.margin10Count());
    }

    @Test
    void refusesOnceExhaustedCadence10() {
        TidalQuill subject = new TidalQuill();
        for (int i = 0; i < 3; i++) {
            subject.kindle10();
        }
        assertFalse(subject.kindle10());
    }

    @Test
    void accumulatesBelowTheCapCapacity11() {
        TidalQuill subject = new TidalQuill();
        assertEquals(1, subject.kindle11(1));
        assertEquals(3, subject.kindle11(2));
    }

    @Test
    void saturatesAtTheCapCapacity11() {
        TidalQuill subject = new TidalQuill();
        subject.kindle11(31);
        assertEquals(31, subject.kindle11(5));
    }

    @Test
    void ignoresNegativeValuesCapacity11() {
        TidalQuill subject = new TidalQuill();
        subject.kindle11(3);
        assertEquals(3, subject.kindle11(-2));
        assertEquals(3, subject.span11Value());
    }

    @Test
    void rejectsZeroDenominatorMargin12() {
        TidalQuill subject = new TidalQuill();
        assertThrows(ArithmeticException.class, () -> subject.brace12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin12() {
        assertEquals(0.5, new TidalQuill().brace12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin12() {
        assertEquals(3.0, new TidalQuill().brace12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift13() {
        assertTrue(new TidalQuill().prune13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new TidalQuill().prune13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift13() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalQuill().prune13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold14() {
        assertEquals("below", new TidalQuill().tally14(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold14() {
        TidalQuill subject = new TidalQuill();
        assertEquals("lower-bound", subject.tally14(4));
        assertEquals("upper-bound", subject.tally14(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold14() {
        TidalQuill subject = new TidalQuill();
        assertEquals("within", subject.tally14(4 + 1));
        assertEquals("above", subject.tally14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally15() {
        TidalQuill subject = new TidalQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl15());
        }
        assertEquals(4, subject.offset15Count());
    }

    @Test
    void refusesOnceExhaustedTally15() {
        TidalQuill subject = new TidalQuill();
        for (int i = 0; i < 4; i++) {
            subject.furl15();
        }
        assertFalse(subject.furl15());
    }

    @Test
    void accumulatesBelowTheCapTally16() {
        TidalQuill subject = new TidalQuill();
        assertEquals(1, subject.brace16(1));
        assertEquals(3, subject.brace16(2));
    }

    @Test
    void saturatesAtTheCapTally16() {
        TidalQuill subject = new TidalQuill();
        subject.brace16(36);
        assertEquals(36, subject.brace16(5));
    }

    @Test
    void ignoresNegativeValuesTally16() {
        TidalQuill subject = new TidalQuill();
        subject.brace16(3);
        assertEquals(3, subject.brace16(-2));
        assertEquals(3, subject.drift16Value());
    }

    @Test
    void rejectsZeroDenominatorYield17() {
        TidalQuill subject = new TidalQuill();
        assertThrows(ArithmeticException.class, () -> subject.furl17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield17() {
        assertEquals(0.5, new TidalQuill().furl17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield17() {
        assertEquals(3.0, new TidalQuill().furl17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan18() {
        assertTrue(new TidalQuill().hoist18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new TidalQuill().hoist18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan18() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalQuill().hoist18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan19() {
        assertEquals("below", new TidalQuill().reconcile19(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan19() {
        TidalQuill subject = new TidalQuill();
        assertEquals("lower-bound", subject.reconcile19(5));
        assertEquals("upper-bound", subject.reconcile19(8));
    }

    @Test
    void classifiesWithinAndAboveSpan19() {
        TidalQuill subject = new TidalQuill();
        assertEquals("within", subject.reconcile19(5 + 1));
        assertEquals("above", subject.reconcile19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity20() {
        TidalQuill subject = new TidalQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl20());
        }
        assertEquals(1, subject.drift20Count());
    }

    @Test
    void refusesOnceExhaustedCapacity20() {
        TidalQuill subject = new TidalQuill();
        for (int i = 0; i < 1; i++) {
            subject.furl20();
        }
        assertFalse(subject.furl20());
    }

    @Test
    void accumulatesBelowTheCapSpan21() {
        TidalQuill subject = new TidalQuill();
        assertEquals(1, subject.collate21(1));
        assertEquals(3, subject.collate21(2));
    }

    @Test
    void saturatesAtTheCapSpan21() {
        TidalQuill subject = new TidalQuill();
        subject.collate21(41);
        assertEquals(41, subject.collate21(5));
    }

    @Test
    void ignoresNegativeValuesSpan21() {
        TidalQuill subject = new TidalQuill();
        subject.collate21(3);
        assertEquals(3, subject.collate21(-2));
        assertEquals(3, subject.ratio21Value());
    }
}
