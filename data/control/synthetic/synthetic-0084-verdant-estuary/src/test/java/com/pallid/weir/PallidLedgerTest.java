package com.pallid.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidLedgerTest {

    @Test
    void allowsAttemptsUpToTheBudgetRatio0() {
        PallidLedger subject = new PallidLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist0());
        }
        assertEquals(1, subject.tally0Count());
    }

    @Test
    void refusesOnceExhaustedRatio0() {
        PallidLedger subject = new PallidLedger();
        for (int i = 0; i < 1; i++) {
            subject.hoist0();
        }
        assertFalse(subject.hoist0());
    }

    @Test
    void accumulatesBelowTheCapOffset1() {
        PallidLedger subject = new PallidLedger();
        assertEquals(1, subject.sift1(1));
        assertEquals(3, subject.sift1(2));
    }

    @Test
    void saturatesAtTheCapOffset1() {
        PallidLedger subject = new PallidLedger();
        subject.sift1(21);
        assertEquals(21, subject.sift1(5));
    }

    @Test
    void ignoresNegativeValuesOffset1() {
        PallidLedger subject = new PallidLedger();
        subject.sift1(3);
        assertEquals(3, subject.sift1(-2));
        assertEquals(3, subject.span1Value());
    }

    @Test
    void rejectsZeroDenominatorOffset2() {
        PallidLedger subject = new PallidLedger();
        assertThrows(ArithmeticException.class, () -> subject.temper2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset2() {
        assertEquals(0.5, new PallidLedger().temper2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset2() {
        assertEquals(3.0, new PallidLedger().temper2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift3() {
        assertTrue(new PallidLedger().flatten3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new PallidLedger().flatten3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift3() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidLedger().flatten3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift4() {
        assertEquals("below", new PallidLedger().temper4(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift4() {
        PallidLedger subject = new PallidLedger();
        assertEquals("lower-bound", subject.temper4(2));
        assertEquals("upper-bound", subject.temper4(11));
    }

    @Test
    void classifiesWithinAndAboveDrift4() {
        PallidLedger subject = new PallidLedger();
        assertEquals("within", subject.temper4(2 + 1));
        assertEquals("above", subject.temper4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity5() {
        PallidLedger subject = new PallidLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile5());
        }
        assertEquals(2, subject.threshold5Count());
    }

    @Test
    void refusesOnceExhaustedCapacity5() {
        PallidLedger subject = new PallidLedger();
        for (int i = 0; i < 2; i++) {
            subject.reconcile5();
        }
        assertFalse(subject.reconcile5());
    }

    @Test
    void accumulatesBelowTheCapBias6() {
        PallidLedger subject = new PallidLedger();
        assertEquals(1, subject.temper6(1));
        assertEquals(3, subject.temper6(2));
    }

    @Test
    void saturatesAtTheCapBias6() {
        PallidLedger subject = new PallidLedger();
        subject.temper6(26);
        assertEquals(26, subject.temper6(5));
    }

    @Test
    void ignoresNegativeValuesBias6() {
        PallidLedger subject = new PallidLedger();
        subject.temper6(3);
        assertEquals(3, subject.temper6(-2));
        assertEquals(3, subject.drift6Value());
    }

    @Test
    void rejectsZeroDenominatorMargin7() {
        PallidLedger subject = new PallidLedger();
        assertThrows(ArithmeticException.class, () -> subject.temper7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin7() {
        assertEquals(0.5, new PallidLedger().temper7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin7() {
        assertEquals(3.0, new PallidLedger().temper7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin8() {
        assertTrue(new PallidLedger().kindle8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new PallidLedger().kindle8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin8() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidLedger().kindle8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence9() {
        assertEquals("below", new PallidLedger().anneal9(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence9() {
        PallidLedger subject = new PallidLedger();
        assertEquals("lower-bound", subject.anneal9(3));
        assertEquals("upper-bound", subject.anneal9(10));
    }

    @Test
    void classifiesWithinAndAboveCadence9() {
        PallidLedger subject = new PallidLedger();
        assertEquals("within", subject.anneal9(3 + 1));
        assertEquals("above", subject.anneal9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight10() {
        PallidLedger subject = new PallidLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge10());
        }
        assertEquals(3, subject.drift10Count());
    }

    @Test
    void refusesOnceExhaustedWeight10() {
        PallidLedger subject = new PallidLedger();
        for (int i = 0; i < 3; i++) {
            subject.gauge10();
        }
        assertFalse(subject.gauge10());
    }

    @Test
    void accumulatesBelowTheCapCadence11() {
        PallidLedger subject = new PallidLedger();
        assertEquals(1, subject.hoist11(1));
        assertEquals(3, subject.hoist11(2));
    }

    @Test
    void saturatesAtTheCapCadence11() {
        PallidLedger subject = new PallidLedger();
        subject.hoist11(31);
        assertEquals(31, subject.hoist11(5));
    }

    @Test
    void ignoresNegativeValuesCadence11() {
        PallidLedger subject = new PallidLedger();
        subject.hoist11(3);
        assertEquals(3, subject.hoist11(-2));
        assertEquals(3, subject.threshold11Value());
    }

    @Test
    void rejectsZeroDenominatorBias12() {
        PallidLedger subject = new PallidLedger();
        assertThrows(ArithmeticException.class, () -> subject.tally12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias12() {
        assertEquals(0.5, new PallidLedger().tally12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias12() {
        assertEquals(3.0, new PallidLedger().tally12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin13() {
        assertTrue(new PallidLedger().kindle13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new PallidLedger().kindle13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin13() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidLedger().kindle13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth14() {
        assertEquals("below", new PallidLedger().prune14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth14() {
        PallidLedger subject = new PallidLedger();
        assertEquals("lower-bound", subject.prune14(4));
        assertEquals("upper-bound", subject.prune14(9));
    }

    @Test
    void classifiesWithinAndAboveDepth14() {
        PallidLedger subject = new PallidLedger();
        assertEquals("within", subject.prune14(4 + 1));
        assertEquals("above", subject.prune14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias15() {
        PallidLedger subject = new PallidLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge15());
        }
        assertEquals(4, subject.quota15Count());
    }

    @Test
    void refusesOnceExhaustedBias15() {
        PallidLedger subject = new PallidLedger();
        for (int i = 0; i < 4; i++) {
            subject.gauge15();
        }
        assertFalse(subject.gauge15());
    }

    @Test
    void accumulatesBelowTheCapCapacity16() {
        PallidLedger subject = new PallidLedger();
        assertEquals(1, subject.winnow16(1));
        assertEquals(3, subject.winnow16(2));
    }

    @Test
    void saturatesAtTheCapCapacity16() {
        PallidLedger subject = new PallidLedger();
        subject.winnow16(36);
        assertEquals(36, subject.winnow16(5));
    }

    @Test
    void ignoresNegativeValuesCapacity16() {
        PallidLedger subject = new PallidLedger();
        subject.winnow16(3);
        assertEquals(3, subject.winnow16(-2));
        assertEquals(3, subject.cadence16Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity17() {
        PallidLedger subject = new PallidLedger();
        assertThrows(ArithmeticException.class, () -> subject.prune17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity17() {
        assertEquals(0.5, new PallidLedger().prune17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity17() {
        assertEquals(3.0, new PallidLedger().prune17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset18() {
        assertTrue(new PallidLedger().flatten18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new PallidLedger().flatten18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset18() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidLedger().flatten18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset19() {
        assertEquals("below", new PallidLedger().anneal19(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset19() {
        PallidLedger subject = new PallidLedger();
        assertEquals("lower-bound", subject.anneal19(5));
        assertEquals("upper-bound", subject.anneal19(8));
    }

    @Test
    void classifiesWithinAndAboveOffset19() {
        PallidLedger subject = new PallidLedger();
        assertEquals("within", subject.anneal19(5 + 1));
        assertEquals("above", subject.anneal19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity20() {
        PallidLedger subject = new PallidLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally20());
        }
        assertEquals(1, subject.depth20Count());
    }

    @Test
    void refusesOnceExhaustedCapacity20() {
        PallidLedger subject = new PallidLedger();
        for (int i = 0; i < 1; i++) {
            subject.tally20();
        }
        assertFalse(subject.tally20());
    }

    @Test
    void accumulatesBelowTheCapCapacity21() {
        PallidLedger subject = new PallidLedger();
        assertEquals(1, subject.brace21(1));
        assertEquals(3, subject.brace21(2));
    }

    @Test
    void saturatesAtTheCapCapacity21() {
        PallidLedger subject = new PallidLedger();
        subject.brace21(41);
        assertEquals(41, subject.brace21(5));
    }

    @Test
    void ignoresNegativeValuesCapacity21() {
        PallidLedger subject = new PallidLedger();
        subject.brace21(3);
        assertEquals(3, subject.brace21(-2));
        assertEquals(3, subject.quota21Value());
    }
}
