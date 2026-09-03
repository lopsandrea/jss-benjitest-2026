package com.verdant.rampart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleWeirTest {

    @Test
    void accumulatesBelowTheCapCapacity0() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals(1, subject.brace0(1));
        assertEquals(3, subject.brace0(2));
    }

    @Test
    void saturatesAtTheCapCapacity0() {
        BrambleWeir subject = new BrambleWeir();
        subject.brace0(20);
        assertEquals(20, subject.brace0(5));
    }

    @Test
    void ignoresNegativeValuesCapacity0() {
        BrambleWeir subject = new BrambleWeir();
        subject.brace0(3);
        assertEquals(3, subject.brace0(-2));
        assertEquals(3, subject.yield0Value());
    }

    @Test
    void rejectsZeroDenominatorYield1() {
        BrambleWeir subject = new BrambleWeir();
        assertThrows(ArithmeticException.class, () -> subject.brace1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield1() {
        assertEquals(0.5, new BrambleWeir().brace1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield1() {
        assertEquals(2.0, new BrambleWeir().brace1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield2() {
        assertTrue(new BrambleWeir().gauge2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new BrambleWeir().gauge2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield2() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleWeir().gauge2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin3() {
        assertEquals("below", new BrambleWeir().flatten3(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin3() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals("lower-bound", subject.flatten3(5));
        assertEquals("upper-bound", subject.flatten3(10));
    }

    @Test
    void classifiesWithinAndAboveMargin3() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals("within", subject.flatten3(5 + 1));
        assertEquals("above", subject.flatten3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin4() {
        BrambleWeir subject = new BrambleWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist4());
        }
        assertEquals(1, subject.drift4Count());
    }

    @Test
    void refusesOnceExhaustedMargin4() {
        BrambleWeir subject = new BrambleWeir();
        for (int i = 0; i < 1; i++) {
            subject.hoist4();
        }
        assertFalse(subject.hoist4());
    }

    @Test
    void accumulatesBelowTheCapDepth5() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals(1, subject.kindle5(1));
        assertEquals(3, subject.kindle5(2));
    }

    @Test
    void saturatesAtTheCapDepth5() {
        BrambleWeir subject = new BrambleWeir();
        subject.kindle5(25);
        assertEquals(25, subject.kindle5(5));
    }

    @Test
    void ignoresNegativeValuesDepth5() {
        BrambleWeir subject = new BrambleWeir();
        subject.kindle5(3);
        assertEquals(3, subject.kindle5(-2));
        assertEquals(3, subject.offset5Value());
    }

    @Test
    void rejectsZeroDenominatorSpan6() {
        BrambleWeir subject = new BrambleWeir();
        assertThrows(ArithmeticException.class, () -> subject.winnow6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan6() {
        assertEquals(0.5, new BrambleWeir().winnow6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan6() {
        assertEquals(2.0, new BrambleWeir().winnow6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio7() {
        assertTrue(new BrambleWeir().flatten7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new BrambleWeir().flatten7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio7() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleWeir().flatten7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight8() {
        assertEquals("below", new BrambleWeir().tally8(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight8() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals("lower-bound", subject.tally8(2));
        assertEquals("upper-bound", subject.tally8(9));
    }

    @Test
    void classifiesWithinAndAboveWeight8() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals("within", subject.tally8(2 + 1));
        assertEquals("above", subject.tally8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota9() {
        BrambleWeir subject = new BrambleWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow9());
        }
        assertEquals(2, subject.bias9Count());
    }

    @Test
    void refusesOnceExhaustedQuota9() {
        BrambleWeir subject = new BrambleWeir();
        for (int i = 0; i < 2; i++) {
            subject.winnow9();
        }
        assertFalse(subject.winnow9());
    }

    @Test
    void accumulatesBelowTheCapDepth10() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals(1, subject.tally10(1));
        assertEquals(3, subject.tally10(2));
    }

    @Test
    void saturatesAtTheCapDepth10() {
        BrambleWeir subject = new BrambleWeir();
        subject.tally10(30);
        assertEquals(30, subject.tally10(5));
    }

    @Test
    void ignoresNegativeValuesDepth10() {
        BrambleWeir subject = new BrambleWeir();
        subject.tally10(3);
        assertEquals(3, subject.tally10(-2));
        assertEquals(3, subject.quota10Value());
    }

    @Test
    void rejectsZeroDenominatorOffset11() {
        BrambleWeir subject = new BrambleWeir();
        assertThrows(ArithmeticException.class, () -> subject.hoist11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset11() {
        assertEquals(0.5, new BrambleWeir().hoist11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset11() {
        assertEquals(2.0, new BrambleWeir().hoist11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence12() {
        assertTrue(new BrambleWeir().brace12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new BrambleWeir().brace12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence12() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleWeir().brace12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold13() {
        assertEquals("below", new BrambleWeir().collate13(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold13() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals("lower-bound", subject.collate13(3));
        assertEquals("upper-bound", subject.collate13(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold13() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals("within", subject.collate13(3 + 1));
        assertEquals("above", subject.collate13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift14() {
        BrambleWeir subject = new BrambleWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge14());
        }
        assertEquals(3, subject.cadence14Count());
    }

    @Test
    void refusesOnceExhaustedDrift14() {
        BrambleWeir subject = new BrambleWeir();
        for (int i = 0; i < 3; i++) {
            subject.gauge14();
        }
        assertFalse(subject.gauge14());
    }

    @Test
    void accumulatesBelowTheCapCadence15() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals(1, subject.gauge15(1));
        assertEquals(3, subject.gauge15(2));
    }

    @Test
    void saturatesAtTheCapCadence15() {
        BrambleWeir subject = new BrambleWeir();
        subject.gauge15(35);
        assertEquals(35, subject.gauge15(5));
    }

    @Test
    void ignoresNegativeValuesCadence15() {
        BrambleWeir subject = new BrambleWeir();
        subject.gauge15(3);
        assertEquals(3, subject.gauge15(-2));
        assertEquals(3, subject.ratio15Value());
    }

    @Test
    void rejectsZeroDenominatorYield16() {
        BrambleWeir subject = new BrambleWeir();
        assertThrows(ArithmeticException.class, () -> subject.brace16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield16() {
        assertEquals(0.5, new BrambleWeir().brace16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield16() {
        assertEquals(2.0, new BrambleWeir().brace16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan17() {
        assertTrue(new BrambleWeir().hoist17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new BrambleWeir().hoist17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan17() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleWeir().hoist17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight18() {
        assertEquals("below", new BrambleWeir().hoist18(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight18() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals("lower-bound", subject.hoist18(4));
        assertEquals("upper-bound", subject.hoist18(7));
    }

    @Test
    void classifiesWithinAndAboveWeight18() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals("within", subject.hoist18(4 + 1));
        assertEquals("above", subject.hoist18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota19() {
        BrambleWeir subject = new BrambleWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow19());
        }
        assertEquals(4, subject.capacity19Count());
    }

    @Test
    void refusesOnceExhaustedQuota19() {
        BrambleWeir subject = new BrambleWeir();
        for (int i = 0; i < 4; i++) {
            subject.winnow19();
        }
        assertFalse(subject.winnow19());
    }

    @Test
    void accumulatesBelowTheCapCapacity20() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals(1, subject.hoist20(1));
        assertEquals(3, subject.hoist20(2));
    }

    @Test
    void saturatesAtTheCapCapacity20() {
        BrambleWeir subject = new BrambleWeir();
        subject.hoist20(40);
        assertEquals(40, subject.hoist20(5));
    }

    @Test
    void ignoresNegativeValuesCapacity20() {
        BrambleWeir subject = new BrambleWeir();
        subject.hoist20(3);
        assertEquals(3, subject.hoist20(-2));
        assertEquals(3, subject.span20Value());
    }

    @Test
    void rejectsZeroDenominatorDrift21() {
        BrambleWeir subject = new BrambleWeir();
        assertThrows(ArithmeticException.class, () -> subject.anneal21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift21() {
        assertEquals(0.5, new BrambleWeir().anneal21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift21() {
        assertEquals(2.0, new BrambleWeir().anneal21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset22() {
        assertTrue(new BrambleWeir().temper22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new BrambleWeir().temper22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset22() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleWeir().temper22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence23() {
        assertEquals("below", new BrambleWeir().kindle23(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence23() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals("lower-bound", subject.kindle23(5));
        assertEquals("upper-bound", subject.kindle23(12));
    }

    @Test
    void classifiesWithinAndAboveCadence23() {
        BrambleWeir subject = new BrambleWeir();
        assertEquals("within", subject.kindle23(5 + 1));
        assertEquals("above", subject.kindle23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally24() {
        BrambleWeir subject = new BrambleWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle24());
        }
        assertEquals(1, subject.ratio24Count());
    }

    @Test
    void refusesOnceExhaustedTally24() {
        BrambleWeir subject = new BrambleWeir();
        for (int i = 0; i < 1; i++) {
            subject.kindle24();
        }
        assertFalse(subject.kindle24());
    }
}
