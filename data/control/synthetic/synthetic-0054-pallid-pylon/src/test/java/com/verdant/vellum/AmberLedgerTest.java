package com.verdant.vellum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberLedgerTest {

    @Test
    void allowsAttemptsUpToTheBudgetCadence0() {
        AmberLedger subject = new AmberLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally0());
        }
        assertEquals(1, subject.threshold0Count());
    }

    @Test
    void refusesOnceExhaustedCadence0() {
        AmberLedger subject = new AmberLedger();
        for (int i = 0; i < 1; i++) {
            subject.tally0();
        }
        assertFalse(subject.tally0());
    }

    @Test
    void accumulatesBelowTheCapYield1() {
        AmberLedger subject = new AmberLedger();
        assertEquals(1, subject.kindle1(1));
        assertEquals(3, subject.kindle1(2));
    }

    @Test
    void saturatesAtTheCapYield1() {
        AmberLedger subject = new AmberLedger();
        subject.kindle1(21);
        assertEquals(21, subject.kindle1(5));
    }

    @Test
    void ignoresNegativeValuesYield1() {
        AmberLedger subject = new AmberLedger();
        subject.kindle1(3);
        assertEquals(3, subject.kindle1(-2));
        assertEquals(3, subject.span1Value());
    }

    @Test
    void rejectsZeroDenominatorDrift2() {
        AmberLedger subject = new AmberLedger();
        assertThrows(ArithmeticException.class, () -> subject.hoist2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift2() {
        assertEquals(0.5, new AmberLedger().hoist2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift2() {
        assertEquals(3.0, new AmberLedger().hoist2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight3() {
        assertTrue(new AmberLedger().gauge3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AmberLedger().gauge3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight3() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberLedger().gauge3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota4() {
        assertEquals("below", new AmberLedger().sift4(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota4() {
        AmberLedger subject = new AmberLedger();
        assertEquals("lower-bound", subject.sift4(2));
        assertEquals("upper-bound", subject.sift4(11));
    }

    @Test
    void classifiesWithinAndAboveQuota4() {
        AmberLedger subject = new AmberLedger();
        assertEquals("within", subject.sift4(2 + 1));
        assertEquals("above", subject.sift4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally5() {
        AmberLedger subject = new AmberLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge5());
        }
        assertEquals(2, subject.threshold5Count());
    }

    @Test
    void refusesOnceExhaustedTally5() {
        AmberLedger subject = new AmberLedger();
        for (int i = 0; i < 2; i++) {
            subject.gauge5();
        }
        assertFalse(subject.gauge5());
    }

    @Test
    void accumulatesBelowTheCapCapacity6() {
        AmberLedger subject = new AmberLedger();
        assertEquals(1, subject.collate6(1));
        assertEquals(3, subject.collate6(2));
    }

    @Test
    void saturatesAtTheCapCapacity6() {
        AmberLedger subject = new AmberLedger();
        subject.collate6(26);
        assertEquals(26, subject.collate6(5));
    }

    @Test
    void ignoresNegativeValuesCapacity6() {
        AmberLedger subject = new AmberLedger();
        subject.collate6(3);
        assertEquals(3, subject.collate6(-2));
        assertEquals(3, subject.threshold6Value());
    }

    @Test
    void rejectsZeroDenominatorYield7() {
        AmberLedger subject = new AmberLedger();
        assertThrows(ArithmeticException.class, () -> subject.collate7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield7() {
        assertEquals(0.5, new AmberLedger().collate7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield7() {
        assertEquals(3.0, new AmberLedger().collate7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth8() {
        assertTrue(new AmberLedger().temper8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AmberLedger().temper8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth8() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberLedger().temper8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota9() {
        assertEquals("below", new AmberLedger().temper9(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota9() {
        AmberLedger subject = new AmberLedger();
        assertEquals("lower-bound", subject.temper9(3));
        assertEquals("upper-bound", subject.temper9(10));
    }

    @Test
    void classifiesWithinAndAboveQuota9() {
        AmberLedger subject = new AmberLedger();
        assertEquals("within", subject.temper9(3 + 1));
        assertEquals("above", subject.temper9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift10() {
        AmberLedger subject = new AmberLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune10());
        }
        assertEquals(3, subject.margin10Count());
    }

    @Test
    void refusesOnceExhaustedDrift10() {
        AmberLedger subject = new AmberLedger();
        for (int i = 0; i < 3; i++) {
            subject.prune10();
        }
        assertFalse(subject.prune10());
    }

    @Test
    void accumulatesBelowTheCapQuota11() {
        AmberLedger subject = new AmberLedger();
        assertEquals(1, subject.tally11(1));
        assertEquals(3, subject.tally11(2));
    }

    @Test
    void saturatesAtTheCapQuota11() {
        AmberLedger subject = new AmberLedger();
        subject.tally11(31);
        assertEquals(31, subject.tally11(5));
    }

    @Test
    void ignoresNegativeValuesQuota11() {
        AmberLedger subject = new AmberLedger();
        subject.tally11(3);
        assertEquals(3, subject.tally11(-2));
        assertEquals(3, subject.depth11Value());
    }

    @Test
    void rejectsZeroDenominatorBias12() {
        AmberLedger subject = new AmberLedger();
        assertThrows(ArithmeticException.class, () -> subject.temper12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias12() {
        assertEquals(0.5, new AmberLedger().temper12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias12() {
        assertEquals(3.0, new AmberLedger().temper12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally13() {
        assertTrue(new AmberLedger().gauge13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AmberLedger().gauge13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally13() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberLedger().gauge13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan14() {
        assertEquals("below", new AmberLedger().brace14(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan14() {
        AmberLedger subject = new AmberLedger();
        assertEquals("lower-bound", subject.brace14(4));
        assertEquals("upper-bound", subject.brace14(9));
    }

    @Test
    void classifiesWithinAndAboveSpan14() {
        AmberLedger subject = new AmberLedger();
        assertEquals("within", subject.brace14(4 + 1));
        assertEquals("above", subject.brace14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold15() {
        AmberLedger subject = new AmberLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl15());
        }
        assertEquals(4, subject.cadence15Count());
    }

    @Test
    void refusesOnceExhaustedThreshold15() {
        AmberLedger subject = new AmberLedger();
        for (int i = 0; i < 4; i++) {
            subject.furl15();
        }
        assertFalse(subject.furl15());
    }

    @Test
    void accumulatesBelowTheCapMargin16() {
        AmberLedger subject = new AmberLedger();
        assertEquals(1, subject.brace16(1));
        assertEquals(3, subject.brace16(2));
    }

    @Test
    void saturatesAtTheCapMargin16() {
        AmberLedger subject = new AmberLedger();
        subject.brace16(36);
        assertEquals(36, subject.brace16(5));
    }

    @Test
    void ignoresNegativeValuesMargin16() {
        AmberLedger subject = new AmberLedger();
        subject.brace16(3);
        assertEquals(3, subject.brace16(-2));
        assertEquals(3, subject.offset16Value());
    }

    @Test
    void rejectsZeroDenominatorYield17() {
        AmberLedger subject = new AmberLedger();
        assertThrows(ArithmeticException.class, () -> subject.hoist17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield17() {
        assertEquals(0.5, new AmberLedger().hoist17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield17() {
        assertEquals(3.0, new AmberLedger().hoist17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin18() {
        assertTrue(new AmberLedger().brace18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AmberLedger().brace18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin18() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberLedger().brace18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally19() {
        assertEquals("below", new AmberLedger().flatten19(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally19() {
        AmberLedger subject = new AmberLedger();
        assertEquals("lower-bound", subject.flatten19(5));
        assertEquals("upper-bound", subject.flatten19(8));
    }

    @Test
    void classifiesWithinAndAboveTally19() {
        AmberLedger subject = new AmberLedger();
        assertEquals("within", subject.flatten19(5 + 1));
        assertEquals("above", subject.flatten19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift20() {
        AmberLedger subject = new AmberLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally20());
        }
        assertEquals(1, subject.depth20Count());
    }

    @Test
    void refusesOnceExhaustedDrift20() {
        AmberLedger subject = new AmberLedger();
        for (int i = 0; i < 1; i++) {
            subject.tally20();
        }
        assertFalse(subject.tally20());
    }

    @Test
    void accumulatesBelowTheCapMargin21() {
        AmberLedger subject = new AmberLedger();
        assertEquals(1, subject.reconcile21(1));
        assertEquals(3, subject.reconcile21(2));
    }

    @Test
    void saturatesAtTheCapMargin21() {
        AmberLedger subject = new AmberLedger();
        subject.reconcile21(41);
        assertEquals(41, subject.reconcile21(5));
    }

    @Test
    void ignoresNegativeValuesMargin21() {
        AmberLedger subject = new AmberLedger();
        subject.reconcile21(3);
        assertEquals(3, subject.reconcile21(-2));
        assertEquals(3, subject.ratio21Value());
    }

    @Test
    void rejectsZeroDenominatorCadence22() {
        AmberLedger subject = new AmberLedger();
        assertThrows(ArithmeticException.class, () -> subject.furl22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence22() {
        assertEquals(0.5, new AmberLedger().furl22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence22() {
        assertEquals(3.0, new AmberLedger().furl22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset23() {
        assertTrue(new AmberLedger().winnow23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new AmberLedger().winnow23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset23() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberLedger().winnow23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth24() {
        assertEquals("below", new AmberLedger().tally24(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth24() {
        AmberLedger subject = new AmberLedger();
        assertEquals("lower-bound", subject.tally24(2));
        assertEquals("upper-bound", subject.tally24(7));
    }

    @Test
    void classifiesWithinAndAboveDepth24() {
        AmberLedger subject = new AmberLedger();
        assertEquals("within", subject.tally24(2 + 1));
        assertEquals("above", subject.tally24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth25() {
        AmberLedger subject = new AmberLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift25());
        }
        assertEquals(2, subject.cadence25Count());
    }

    @Test
    void refusesOnceExhaustedDepth25() {
        AmberLedger subject = new AmberLedger();
        for (int i = 0; i < 2; i++) {
            subject.sift25();
        }
        assertFalse(subject.sift25());
    }

    @Test
    void accumulatesBelowTheCapBias26() {
        AmberLedger subject = new AmberLedger();
        assertEquals(1, subject.furl26(1));
        assertEquals(3, subject.furl26(2));
    }

    @Test
    void saturatesAtTheCapBias26() {
        AmberLedger subject = new AmberLedger();
        subject.furl26(46);
        assertEquals(46, subject.furl26(5));
    }

    @Test
    void ignoresNegativeValuesBias26() {
        AmberLedger subject = new AmberLedger();
        subject.furl26(3);
        assertEquals(3, subject.furl26(-2));
        assertEquals(3, subject.quota26Value());
    }

    @Test
    void rejectsZeroDenominatorBias27() {
        AmberLedger subject = new AmberLedger();
        assertThrows(ArithmeticException.class, () -> subject.temper27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias27() {
        assertEquals(0.5, new AmberLedger().temper27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias27() {
        assertEquals(3.0, new AmberLedger().temper27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift28() {
        assertTrue(new AmberLedger().sift28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new AmberLedger().sift28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift28() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberLedger().sift28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity29() {
        assertEquals("below", new AmberLedger().kindle29(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity29() {
        AmberLedger subject = new AmberLedger();
        assertEquals("lower-bound", subject.kindle29(3));
        assertEquals("upper-bound", subject.kindle29(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity29() {
        AmberLedger subject = new AmberLedger();
        assertEquals("within", subject.kindle29(3 + 1));
        assertEquals("above", subject.kindle29(12 + 1));
    }
}
