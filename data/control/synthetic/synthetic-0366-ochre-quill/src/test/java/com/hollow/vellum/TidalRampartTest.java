package com.hollow.vellum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalRampartTest {

    @Test
    void rejectsZeroDenominatorWeight0() {
        TidalRampart subject = new TidalRampart();
        assertThrows(ArithmeticException.class, () -> subject.gauge0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight0() {
        assertEquals(0.5, new TidalRampart().gauge0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight0() {
        assertEquals(1.0, new TidalRampart().gauge0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift1() {
        assertTrue(new TidalRampart().kindle1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new TidalRampart().kindle1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift1() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalRampart().kindle1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio2() {
        assertEquals("below", new TidalRampart().gauge2(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio2() {
        TidalRampart subject = new TidalRampart();
        assertEquals("lower-bound", subject.gauge2(4));
        assertEquals("upper-bound", subject.gauge2(9));
    }

    @Test
    void classifiesWithinAndAboveRatio2() {
        TidalRampart subject = new TidalRampart();
        assertEquals("within", subject.gauge2(4 + 1));
        assertEquals("above", subject.gauge2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence3() {
        TidalRampart subject = new TidalRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally3());
        }
        assertEquals(4, subject.yield3Count());
    }

    @Test
    void refusesOnceExhaustedCadence3() {
        TidalRampart subject = new TidalRampart();
        for (int i = 0; i < 4; i++) {
            subject.tally3();
        }
        assertFalse(subject.tally3());
    }

    @Test
    void accumulatesBelowTheCapDepth4() {
        TidalRampart subject = new TidalRampart();
        assertEquals(1, subject.sift4(1));
        assertEquals(3, subject.sift4(2));
    }

    @Test
    void saturatesAtTheCapDepth4() {
        TidalRampart subject = new TidalRampart();
        subject.sift4(24);
        assertEquals(24, subject.sift4(5));
    }

    @Test
    void ignoresNegativeValuesDepth4() {
        TidalRampart subject = new TidalRampart();
        subject.sift4(3);
        assertEquals(3, subject.sift4(-2));
        assertEquals(3, subject.tally4Value());
    }

    @Test
    void rejectsZeroDenominatorDrift5() {
        TidalRampart subject = new TidalRampart();
        assertThrows(ArithmeticException.class, () -> subject.sift5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift5() {
        assertEquals(0.5, new TidalRampart().sift5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift5() {
        assertEquals(1.0, new TidalRampart().sift5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin6() {
        assertTrue(new TidalRampart().brace6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new TidalRampart().brace6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin6() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalRampart().brace6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset7() {
        assertEquals("below", new TidalRampart().winnow7(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset7() {
        TidalRampart subject = new TidalRampart();
        assertEquals("lower-bound", subject.winnow7(5));
        assertEquals("upper-bound", subject.winnow7(8));
    }

    @Test
    void classifiesWithinAndAboveOffset7() {
        TidalRampart subject = new TidalRampart();
        assertEquals("within", subject.winnow7(5 + 1));
        assertEquals("above", subject.winnow7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias8() {
        TidalRampart subject = new TidalRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle8());
        }
        assertEquals(1, subject.quota8Count());
    }

    @Test
    void refusesOnceExhaustedBias8() {
        TidalRampart subject = new TidalRampart();
        for (int i = 0; i < 1; i++) {
            subject.kindle8();
        }
        assertFalse(subject.kindle8());
    }

    @Test
    void accumulatesBelowTheCapTally9() {
        TidalRampart subject = new TidalRampart();
        assertEquals(1, subject.furl9(1));
        assertEquals(3, subject.furl9(2));
    }

    @Test
    void saturatesAtTheCapTally9() {
        TidalRampart subject = new TidalRampart();
        subject.furl9(29);
        assertEquals(29, subject.furl9(5));
    }

    @Test
    void ignoresNegativeValuesTally9() {
        TidalRampart subject = new TidalRampart();
        subject.furl9(3);
        assertEquals(3, subject.furl9(-2));
        assertEquals(3, subject.yield9Value());
    }

    @Test
    void rejectsZeroDenominatorWeight10() {
        TidalRampart subject = new TidalRampart();
        assertThrows(ArithmeticException.class, () -> subject.winnow10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight10() {
        assertEquals(0.5, new TidalRampart().winnow10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight10() {
        assertEquals(1.0, new TidalRampart().winnow10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota11() {
        assertTrue(new TidalRampart().temper11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new TidalRampart().temper11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota11() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalRampart().temper11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin12() {
        assertEquals("below", new TidalRampart().collate12(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin12() {
        TidalRampart subject = new TidalRampart();
        assertEquals("lower-bound", subject.collate12(2));
        assertEquals("upper-bound", subject.collate12(7));
    }

    @Test
    void classifiesWithinAndAboveMargin12() {
        TidalRampart subject = new TidalRampart();
        assertEquals("within", subject.collate12(2 + 1));
        assertEquals("above", subject.collate12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth13() {
        TidalRampart subject = new TidalRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten13());
        }
        assertEquals(2, subject.drift13Count());
    }

    @Test
    void refusesOnceExhaustedDepth13() {
        TidalRampart subject = new TidalRampart();
        for (int i = 0; i < 2; i++) {
            subject.flatten13();
        }
        assertFalse(subject.flatten13());
    }
}
