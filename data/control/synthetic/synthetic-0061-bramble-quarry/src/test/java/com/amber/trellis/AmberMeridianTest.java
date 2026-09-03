package com.amber.trellis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberMeridianTest {

    @Test
    void rejectsZeroDenominatorWeight0() {
        AmberMeridian subject = new AmberMeridian();
        assertThrows(ArithmeticException.class, () -> subject.collate0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight0() {
        assertEquals(0.5, new AmberMeridian().collate0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight0() {
        assertEquals(1.0, new AmberMeridian().collate0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin1() {
        assertTrue(new AmberMeridian().flatten1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AmberMeridian().flatten1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin1() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberMeridian().flatten1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence2() {
        assertEquals("below", new AmberMeridian().collate2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence2() {
        AmberMeridian subject = new AmberMeridian();
        assertEquals("lower-bound", subject.collate2(4));
        assertEquals("upper-bound", subject.collate2(9));
    }

    @Test
    void classifiesWithinAndAboveCadence2() {
        AmberMeridian subject = new AmberMeridian();
        assertEquals("within", subject.collate2(4 + 1));
        assertEquals("above", subject.collate2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight3() {
        AmberMeridian subject = new AmberMeridian();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune3());
        }
        assertEquals(4, subject.cadence3Count());
    }

    @Test
    void refusesOnceExhaustedWeight3() {
        AmberMeridian subject = new AmberMeridian();
        for (int i = 0; i < 4; i++) {
            subject.prune3();
        }
        assertFalse(subject.prune3());
    }

    @Test
    void accumulatesBelowTheCapCadence4() {
        AmberMeridian subject = new AmberMeridian();
        assertEquals(1, subject.winnow4(1));
        assertEquals(3, subject.winnow4(2));
    }

    @Test
    void saturatesAtTheCapCadence4() {
        AmberMeridian subject = new AmberMeridian();
        subject.winnow4(24);
        assertEquals(24, subject.winnow4(5));
    }

    @Test
    void ignoresNegativeValuesCadence4() {
        AmberMeridian subject = new AmberMeridian();
        subject.winnow4(3);
        assertEquals(3, subject.winnow4(-2));
        assertEquals(3, subject.depth4Value());
    }

    @Test
    void rejectsZeroDenominatorWeight5() {
        AmberMeridian subject = new AmberMeridian();
        assertThrows(ArithmeticException.class, () -> subject.tally5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight5() {
        assertEquals(0.5, new AmberMeridian().tally5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight5() {
        assertEquals(1.0, new AmberMeridian().tally5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset6() {
        assertTrue(new AmberMeridian().collate6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AmberMeridian().collate6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset6() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberMeridian().collate6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset7() {
        assertEquals("below", new AmberMeridian().furl7(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset7() {
        AmberMeridian subject = new AmberMeridian();
        assertEquals("lower-bound", subject.furl7(5));
        assertEquals("upper-bound", subject.furl7(8));
    }

    @Test
    void classifiesWithinAndAboveOffset7() {
        AmberMeridian subject = new AmberMeridian();
        assertEquals("within", subject.furl7(5 + 1));
        assertEquals("above", subject.furl7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin8() {
        AmberMeridian subject = new AmberMeridian();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge8());
        }
        assertEquals(1, subject.drift8Count());
    }

    @Test
    void refusesOnceExhaustedMargin8() {
        AmberMeridian subject = new AmberMeridian();
        for (int i = 0; i < 1; i++) {
            subject.gauge8();
        }
        assertFalse(subject.gauge8());
    }

    @Test
    void accumulatesBelowTheCapCadence9() {
        AmberMeridian subject = new AmberMeridian();
        assertEquals(1, subject.flatten9(1));
        assertEquals(3, subject.flatten9(2));
    }

    @Test
    void saturatesAtTheCapCadence9() {
        AmberMeridian subject = new AmberMeridian();
        subject.flatten9(29);
        assertEquals(29, subject.flatten9(5));
    }

    @Test
    void ignoresNegativeValuesCadence9() {
        AmberMeridian subject = new AmberMeridian();
        subject.flatten9(3);
        assertEquals(3, subject.flatten9(-2));
        assertEquals(3, subject.drift9Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity10() {
        AmberMeridian subject = new AmberMeridian();
        assertThrows(ArithmeticException.class, () -> subject.hoist10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity10() {
        assertEquals(0.5, new AmberMeridian().hoist10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity10() {
        assertEquals(1.0, new AmberMeridian().hoist10(1000.0, 1.0), 1e-9);
    }
}
