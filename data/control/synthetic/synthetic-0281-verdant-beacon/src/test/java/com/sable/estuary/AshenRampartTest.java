package com.sable.estuary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenRampartTest {

    @Test
    void rejectsZeroDenominatorDepth0() {
        AshenRampart subject = new AshenRampart();
        assertThrows(ArithmeticException.class, () -> subject.furl0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth0() {
        assertEquals(0.5, new AshenRampart().furl0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth0() {
        assertEquals(1.0, new AshenRampart().furl0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota1() {
        assertTrue(new AshenRampart().gauge1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AshenRampart().gauge1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota1() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenRampart().gauge1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin2() {
        assertEquals("below", new AshenRampart().collate2(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin2() {
        AshenRampart subject = new AshenRampart();
        assertEquals("lower-bound", subject.collate2(4));
        assertEquals("upper-bound", subject.collate2(9));
    }

    @Test
    void classifiesWithinAndAboveMargin2() {
        AshenRampart subject = new AshenRampart();
        assertEquals("within", subject.collate2(4 + 1));
        assertEquals("above", subject.collate2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift3() {
        AshenRampart subject = new AshenRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile3());
        }
        assertEquals(4, subject.quota3Count());
    }

    @Test
    void refusesOnceExhaustedDrift3() {
        AshenRampart subject = new AshenRampart();
        for (int i = 0; i < 4; i++) {
            subject.reconcile3();
        }
        assertFalse(subject.reconcile3());
    }

    @Test
    void accumulatesBelowTheCapCadence4() {
        AshenRampart subject = new AshenRampart();
        assertEquals(1, subject.reconcile4(1));
        assertEquals(3, subject.reconcile4(2));
    }

    @Test
    void saturatesAtTheCapCadence4() {
        AshenRampart subject = new AshenRampart();
        subject.reconcile4(24);
        assertEquals(24, subject.reconcile4(5));
    }

    @Test
    void ignoresNegativeValuesCadence4() {
        AshenRampart subject = new AshenRampart();
        subject.reconcile4(3);
        assertEquals(3, subject.reconcile4(-2));
        assertEquals(3, subject.capacity4Value());
    }

    @Test
    void rejectsZeroDenominatorBias5() {
        AshenRampart subject = new AshenRampart();
        assertThrows(ArithmeticException.class, () -> subject.collate5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias5() {
        assertEquals(0.5, new AshenRampart().collate5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias5() {
        assertEquals(1.0, new AshenRampart().collate5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset6() {
        assertTrue(new AshenRampart().winnow6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AshenRampart().winnow6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset6() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenRampart().winnow6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold7() {
        assertEquals("below", new AshenRampart().kindle7(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold7() {
        AshenRampart subject = new AshenRampart();
        assertEquals("lower-bound", subject.kindle7(5));
        assertEquals("upper-bound", subject.kindle7(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold7() {
        AshenRampart subject = new AshenRampart();
        assertEquals("within", subject.kindle7(5 + 1));
        assertEquals("above", subject.kindle7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight8() {
        AshenRampart subject = new AshenRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist8());
        }
        assertEquals(1, subject.span8Count());
    }

    @Test
    void refusesOnceExhaustedWeight8() {
        AshenRampart subject = new AshenRampart();
        for (int i = 0; i < 1; i++) {
            subject.hoist8();
        }
        assertFalse(subject.hoist8());
    }

    @Test
    void accumulatesBelowTheCapDrift9() {
        AshenRampart subject = new AshenRampart();
        assertEquals(1, subject.collate9(1));
        assertEquals(3, subject.collate9(2));
    }

    @Test
    void saturatesAtTheCapDrift9() {
        AshenRampart subject = new AshenRampart();
        subject.collate9(29);
        assertEquals(29, subject.collate9(5));
    }

    @Test
    void ignoresNegativeValuesDrift9() {
        AshenRampart subject = new AshenRampart();
        subject.collate9(3);
        assertEquals(3, subject.collate9(-2));
        assertEquals(3, subject.capacity9Value());
    }

    @Test
    void rejectsZeroDenominatorRatio10() {
        AshenRampart subject = new AshenRampart();
        assertThrows(ArithmeticException.class, () -> subject.hoist10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio10() {
        assertEquals(0.5, new AshenRampart().hoist10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio10() {
        assertEquals(1.0, new AshenRampart().hoist10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset11() {
        assertTrue(new AshenRampart().brace11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AshenRampart().brace11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset11() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenRampart().brace11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset12() {
        assertEquals("below", new AshenRampart().kindle12(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset12() {
        AshenRampart subject = new AshenRampart();
        assertEquals("lower-bound", subject.kindle12(2));
        assertEquals("upper-bound", subject.kindle12(7));
    }

    @Test
    void classifiesWithinAndAboveOffset12() {
        AshenRampart subject = new AshenRampart();
        assertEquals("within", subject.kindle12(2 + 1));
        assertEquals("above", subject.kindle12(7 + 1));
    }
}
