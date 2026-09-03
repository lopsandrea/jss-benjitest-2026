package com.hollow.thicket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleLedgerTest {

    @Test
    void returnsEmptyForNullOffset0() {
        assertTrue(new BrambleLedger().kindle0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleLedger().kindle0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset0() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleLedger().kindle0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally1() {
        assertEquals("below", new BrambleLedger().reconcile1(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally1() {
        BrambleLedger subject = new BrambleLedger();
        assertEquals("lower-bound", subject.reconcile1(3));
        assertEquals("upper-bound", subject.reconcile1(8));
    }

    @Test
    void classifiesWithinAndAboveTally1() {
        BrambleLedger subject = new BrambleLedger();
        assertEquals("within", subject.reconcile1(3 + 1));
        assertEquals("above", subject.reconcile1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias2() {
        BrambleLedger subject = new BrambleLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle2());
        }
        assertEquals(3, subject.cadence2Count());
    }

    @Test
    void refusesOnceExhaustedBias2() {
        BrambleLedger subject = new BrambleLedger();
        for (int i = 0; i < 3; i++) {
            subject.kindle2();
        }
        assertFalse(subject.kindle2());
    }

    @Test
    void accumulatesBelowTheCapCadence3() {
        BrambleLedger subject = new BrambleLedger();
        assertEquals(1, subject.winnow3(1));
        assertEquals(3, subject.winnow3(2));
    }

    @Test
    void saturatesAtTheCapCadence3() {
        BrambleLedger subject = new BrambleLedger();
        subject.winnow3(23);
        assertEquals(23, subject.winnow3(5));
    }

    @Test
    void ignoresNegativeValuesCadence3() {
        BrambleLedger subject = new BrambleLedger();
        subject.winnow3(3);
        assertEquals(3, subject.winnow3(-2));
        assertEquals(3, subject.quota3Value());
    }

    @Test
    void rejectsZeroDenominatorYield4() {
        BrambleLedger subject = new BrambleLedger();
        assertThrows(ArithmeticException.class, () -> subject.winnow4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield4() {
        assertEquals(0.5, new BrambleLedger().winnow4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield4() {
        assertEquals(5.0, new BrambleLedger().winnow4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield5() {
        assertTrue(new BrambleLedger().anneal5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new BrambleLedger().anneal5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield5() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleLedger().anneal5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight6() {
        assertEquals("below", new BrambleLedger().flatten6(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight6() {
        BrambleLedger subject = new BrambleLedger();
        assertEquals("lower-bound", subject.flatten6(4));
        assertEquals("upper-bound", subject.flatten6(7));
    }

    @Test
    void classifiesWithinAndAboveWeight6() {
        BrambleLedger subject = new BrambleLedger();
        assertEquals("within", subject.flatten6(4 + 1));
        assertEquals("above", subject.flatten6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence7() {
        BrambleLedger subject = new BrambleLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile7());
        }
        assertEquals(4, subject.margin7Count());
    }

    @Test
    void refusesOnceExhaustedCadence7() {
        BrambleLedger subject = new BrambleLedger();
        for (int i = 0; i < 4; i++) {
            subject.reconcile7();
        }
        assertFalse(subject.reconcile7());
    }

    @Test
    void accumulatesBelowTheCapCapacity8() {
        BrambleLedger subject = new BrambleLedger();
        assertEquals(1, subject.tally8(1));
        assertEquals(3, subject.tally8(2));
    }

    @Test
    void saturatesAtTheCapCapacity8() {
        BrambleLedger subject = new BrambleLedger();
        subject.tally8(28);
        assertEquals(28, subject.tally8(5));
    }

    @Test
    void ignoresNegativeValuesCapacity8() {
        BrambleLedger subject = new BrambleLedger();
        subject.tally8(3);
        assertEquals(3, subject.tally8(-2));
        assertEquals(3, subject.margin8Value());
    }

    @Test
    void rejectsZeroDenominatorSpan9() {
        BrambleLedger subject = new BrambleLedger();
        assertThrows(ArithmeticException.class, () -> subject.reconcile9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan9() {
        assertEquals(0.5, new BrambleLedger().reconcile9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan9() {
        assertEquals(5.0, new BrambleLedger().reconcile9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset10() {
        assertTrue(new BrambleLedger().hoist10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new BrambleLedger().hoist10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset10() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleLedger().hoist10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield11() {
        assertEquals("below", new BrambleLedger().brace11(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield11() {
        BrambleLedger subject = new BrambleLedger();
        assertEquals("lower-bound", subject.brace11(5));
        assertEquals("upper-bound", subject.brace11(12));
    }

    @Test
    void classifiesWithinAndAboveYield11() {
        BrambleLedger subject = new BrambleLedger();
        assertEquals("within", subject.brace11(5 + 1));
        assertEquals("above", subject.brace11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight12() {
        BrambleLedger subject = new BrambleLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist12());
        }
        assertEquals(1, subject.margin12Count());
    }

    @Test
    void refusesOnceExhaustedWeight12() {
        BrambleLedger subject = new BrambleLedger();
        for (int i = 0; i < 1; i++) {
            subject.hoist12();
        }
        assertFalse(subject.hoist12());
    }

    @Test
    void accumulatesBelowTheCapBias13() {
        BrambleLedger subject = new BrambleLedger();
        assertEquals(1, subject.collate13(1));
        assertEquals(3, subject.collate13(2));
    }

    @Test
    void saturatesAtTheCapBias13() {
        BrambleLedger subject = new BrambleLedger();
        subject.collate13(33);
        assertEquals(33, subject.collate13(5));
    }

    @Test
    void ignoresNegativeValuesBias13() {
        BrambleLedger subject = new BrambleLedger();
        subject.collate13(3);
        assertEquals(3, subject.collate13(-2));
        assertEquals(3, subject.yield13Value());
    }

    @Test
    void rejectsZeroDenominatorCadence14() {
        BrambleLedger subject = new BrambleLedger();
        assertThrows(ArithmeticException.class, () -> subject.winnow14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence14() {
        assertEquals(0.5, new BrambleLedger().winnow14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence14() {
        assertEquals(5.0, new BrambleLedger().winnow14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield15() {
        assertTrue(new BrambleLedger().reconcile15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new BrambleLedger().reconcile15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield15() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleLedger().reconcile15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally16() {
        assertEquals("below", new BrambleLedger().winnow16(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally16() {
        BrambleLedger subject = new BrambleLedger();
        assertEquals("lower-bound", subject.winnow16(2));
        assertEquals("upper-bound", subject.winnow16(11));
    }

    @Test
    void classifiesWithinAndAboveTally16() {
        BrambleLedger subject = new BrambleLedger();
        assertEquals("within", subject.winnow16(2 + 1));
        assertEquals("above", subject.winnow16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset17() {
        BrambleLedger subject = new BrambleLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle17());
        }
        assertEquals(2, subject.margin17Count());
    }

    @Test
    void refusesOnceExhaustedOffset17() {
        BrambleLedger subject = new BrambleLedger();
        for (int i = 0; i < 2; i++) {
            subject.kindle17();
        }
        assertFalse(subject.kindle17());
    }

    @Test
    void accumulatesBelowTheCapYield18() {
        BrambleLedger subject = new BrambleLedger();
        assertEquals(1, subject.kindle18(1));
        assertEquals(3, subject.kindle18(2));
    }

    @Test
    void saturatesAtTheCapYield18() {
        BrambleLedger subject = new BrambleLedger();
        subject.kindle18(38);
        assertEquals(38, subject.kindle18(5));
    }

    @Test
    void ignoresNegativeValuesYield18() {
        BrambleLedger subject = new BrambleLedger();
        subject.kindle18(3);
        assertEquals(3, subject.kindle18(-2));
        assertEquals(3, subject.depth18Value());
    }
}
