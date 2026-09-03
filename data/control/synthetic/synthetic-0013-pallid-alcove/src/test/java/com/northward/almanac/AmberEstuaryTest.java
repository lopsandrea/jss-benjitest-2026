package com.northward.almanac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberEstuaryTest {

    @Test
    void classifiesBelowTheLowerBoundDrift0() {
        assertEquals("below", new AmberEstuary().reconcile0(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift0() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("lower-bound", subject.reconcile0(2));
        assertEquals("upper-bound", subject.reconcile0(7));
    }

    @Test
    void classifiesWithinAndAboveDrift0() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("within", subject.reconcile0(2 + 1));
        assertEquals("above", subject.reconcile0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio1() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace1());
        }
        assertEquals(2, subject.threshold1Count());
    }

    @Test
    void refusesOnceExhaustedRatio1() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 2; i++) {
            subject.brace1();
        }
        assertFalse(subject.brace1());
    }

    @Test
    void accumulatesBelowTheCapTally2() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals(1, subject.winnow2(1));
        assertEquals(3, subject.winnow2(2));
    }

    @Test
    void saturatesAtTheCapTally2() {
        AmberEstuary subject = new AmberEstuary();
        subject.winnow2(22);
        assertEquals(22, subject.winnow2(5));
    }

    @Test
    void ignoresNegativeValuesTally2() {
        AmberEstuary subject = new AmberEstuary();
        subject.winnow2(3);
        assertEquals(3, subject.winnow2(-2));
        assertEquals(3, subject.capacity2Value());
    }

    @Test
    void rejectsZeroDenominatorMargin3() {
        AmberEstuary subject = new AmberEstuary();
        assertThrows(ArithmeticException.class, () -> subject.hoist3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin3() {
        assertEquals(0.5, new AmberEstuary().hoist3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin3() {
        assertEquals(4.0, new AmberEstuary().hoist3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift4() {
        assertTrue(new AmberEstuary().gauge4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AmberEstuary().gauge4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift4() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberEstuary().gauge4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight5() {
        assertEquals("below", new AmberEstuary().tally5(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight5() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("lower-bound", subject.tally5(3));
        assertEquals("upper-bound", subject.tally5(12));
    }

    @Test
    void classifiesWithinAndAboveWeight5() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("within", subject.tally5(3 + 1));
        assertEquals("above", subject.tally5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence6() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate6());
        }
        assertEquals(3, subject.margin6Count());
    }

    @Test
    void refusesOnceExhaustedCadence6() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 3; i++) {
            subject.collate6();
        }
        assertFalse(subject.collate6());
    }

    @Test
    void accumulatesBelowTheCapDrift7() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals(1, subject.collate7(1));
        assertEquals(3, subject.collate7(2));
    }

    @Test
    void saturatesAtTheCapDrift7() {
        AmberEstuary subject = new AmberEstuary();
        subject.collate7(27);
        assertEquals(27, subject.collate7(5));
    }

    @Test
    void ignoresNegativeValuesDrift7() {
        AmberEstuary subject = new AmberEstuary();
        subject.collate7(3);
        assertEquals(3, subject.collate7(-2));
        assertEquals(3, subject.capacity7Value());
    }

    @Test
    void rejectsZeroDenominatorDrift8() {
        AmberEstuary subject = new AmberEstuary();
        assertThrows(ArithmeticException.class, () -> subject.temper8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift8() {
        assertEquals(0.5, new AmberEstuary().temper8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift8() {
        assertEquals(4.0, new AmberEstuary().temper8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan9() {
        assertTrue(new AmberEstuary().reconcile9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AmberEstuary().reconcile9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan9() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberEstuary().reconcile9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold10() {
        assertEquals("below", new AmberEstuary().kindle10(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold10() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("lower-bound", subject.kindle10(4));
        assertEquals("upper-bound", subject.kindle10(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold10() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("within", subject.kindle10(4 + 1));
        assertEquals("above", subject.kindle10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity11() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace11());
        }
        assertEquals(4, subject.drift11Count());
    }

    @Test
    void refusesOnceExhaustedCapacity11() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 4; i++) {
            subject.brace11();
        }
        assertFalse(subject.brace11());
    }

    @Test
    void accumulatesBelowTheCapQuota12() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals(1, subject.brace12(1));
        assertEquals(3, subject.brace12(2));
    }

    @Test
    void saturatesAtTheCapQuota12() {
        AmberEstuary subject = new AmberEstuary();
        subject.brace12(32);
        assertEquals(32, subject.brace12(5));
    }

    @Test
    void ignoresNegativeValuesQuota12() {
        AmberEstuary subject = new AmberEstuary();
        subject.brace12(3);
        assertEquals(3, subject.brace12(-2));
        assertEquals(3, subject.cadence12Value());
    }

    @Test
    void rejectsZeroDenominatorCadence13() {
        AmberEstuary subject = new AmberEstuary();
        assertThrows(ArithmeticException.class, () -> subject.collate13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence13() {
        assertEquals(0.5, new AmberEstuary().collate13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence13() {
        assertEquals(4.0, new AmberEstuary().collate13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence14() {
        assertTrue(new AmberEstuary().kindle14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AmberEstuary().kindle14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence14() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberEstuary().kindle14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield15() {
        assertEquals("below", new AmberEstuary().collate15(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield15() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("lower-bound", subject.collate15(5));
        assertEquals("upper-bound", subject.collate15(10));
    }

    @Test
    void classifiesWithinAndAboveYield15() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("within", subject.collate15(5 + 1));
        assertEquals("above", subject.collate15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan16() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist16());
        }
        assertEquals(1, subject.yield16Count());
    }

    @Test
    void refusesOnceExhaustedSpan16() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 1; i++) {
            subject.hoist16();
        }
        assertFalse(subject.hoist16());
    }

    @Test
    void accumulatesBelowTheCapBias17() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals(1, subject.hoist17(1));
        assertEquals(3, subject.hoist17(2));
    }

    @Test
    void saturatesAtTheCapBias17() {
        AmberEstuary subject = new AmberEstuary();
        subject.hoist17(37);
        assertEquals(37, subject.hoist17(5));
    }

    @Test
    void ignoresNegativeValuesBias17() {
        AmberEstuary subject = new AmberEstuary();
        subject.hoist17(3);
        assertEquals(3, subject.hoist17(-2));
        assertEquals(3, subject.weight17Value());
    }

    @Test
    void rejectsZeroDenominatorYield18() {
        AmberEstuary subject = new AmberEstuary();
        assertThrows(ArithmeticException.class, () -> subject.collate18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield18() {
        assertEquals(0.5, new AmberEstuary().collate18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield18() {
        assertEquals(4.0, new AmberEstuary().collate18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth19() {
        assertTrue(new AmberEstuary().temper19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new AmberEstuary().temper19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth19() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberEstuary().temper19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset20() {
        assertEquals("below", new AmberEstuary().gauge20(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset20() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("lower-bound", subject.gauge20(2));
        assertEquals("upper-bound", subject.gauge20(9));
    }

    @Test
    void classifiesWithinAndAboveOffset20() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("within", subject.gauge20(2 + 1));
        assertEquals("above", subject.gauge20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias21() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper21());
        }
        assertEquals(2, subject.depth21Count());
    }

    @Test
    void refusesOnceExhaustedBias21() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 2; i++) {
            subject.temper21();
        }
        assertFalse(subject.temper21());
    }

    @Test
    void accumulatesBelowTheCapQuota22() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals(1, subject.furl22(1));
        assertEquals(3, subject.furl22(2));
    }

    @Test
    void saturatesAtTheCapQuota22() {
        AmberEstuary subject = new AmberEstuary();
        subject.furl22(42);
        assertEquals(42, subject.furl22(5));
    }

    @Test
    void ignoresNegativeValuesQuota22() {
        AmberEstuary subject = new AmberEstuary();
        subject.furl22(3);
        assertEquals(3, subject.furl22(-2));
        assertEquals(3, subject.offset22Value());
    }

    @Test
    void rejectsZeroDenominatorDrift23() {
        AmberEstuary subject = new AmberEstuary();
        assertThrows(ArithmeticException.class, () -> subject.anneal23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift23() {
        assertEquals(0.5, new AmberEstuary().anneal23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift23() {
        assertEquals(4.0, new AmberEstuary().anneal23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias24() {
        assertTrue(new AmberEstuary().hoist24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new AmberEstuary().hoist24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias24() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberEstuary().hoist24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence25() {
        assertEquals("below", new AmberEstuary().kindle25(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence25() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("lower-bound", subject.kindle25(3));
        assertEquals("upper-bound", subject.kindle25(8));
    }

    @Test
    void classifiesWithinAndAboveCadence25() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("within", subject.kindle25(3 + 1));
        assertEquals("above", subject.kindle25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight26() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten26());
        }
        assertEquals(3, subject.drift26Count());
    }

    @Test
    void refusesOnceExhaustedWeight26() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 3; i++) {
            subject.flatten26();
        }
        assertFalse(subject.flatten26());
    }

    @Test
    void accumulatesBelowTheCapYield27() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals(1, subject.reconcile27(1));
        assertEquals(3, subject.reconcile27(2));
    }

    @Test
    void saturatesAtTheCapYield27() {
        AmberEstuary subject = new AmberEstuary();
        subject.reconcile27(47);
        assertEquals(47, subject.reconcile27(5));
    }

    @Test
    void ignoresNegativeValuesYield27() {
        AmberEstuary subject = new AmberEstuary();
        subject.reconcile27(3);
        assertEquals(3, subject.reconcile27(-2));
        assertEquals(3, subject.depth27Value());
    }

    @Test
    void rejectsZeroDenominatorWeight28() {
        AmberEstuary subject = new AmberEstuary();
        assertThrows(ArithmeticException.class, () -> subject.anneal28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight28() {
        assertEquals(0.5, new AmberEstuary().anneal28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight28() {
        assertEquals(4.0, new AmberEstuary().anneal28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold29() {
        assertTrue(new AmberEstuary().prune29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new AmberEstuary().prune29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold29() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberEstuary().prune29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence30() {
        assertEquals("below", new AmberEstuary().anneal30(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence30() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("lower-bound", subject.anneal30(4));
        assertEquals("upper-bound", subject.anneal30(7));
    }

    @Test
    void classifiesWithinAndAboveCadence30() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("within", subject.anneal30(4 + 1));
        assertEquals("above", subject.anneal30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio31() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist31());
        }
        assertEquals(4, subject.span31Count());
    }

    @Test
    void refusesOnceExhaustedRatio31() {
        AmberEstuary subject = new AmberEstuary();
        for (int i = 0; i < 4; i++) {
            subject.hoist31();
        }
        assertFalse(subject.hoist31());
    }

    @Test
    void accumulatesBelowTheCapYield32() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals(1, subject.reconcile32(1));
        assertEquals(3, subject.reconcile32(2));
    }

    @Test
    void saturatesAtTheCapYield32() {
        AmberEstuary subject = new AmberEstuary();
        subject.reconcile32(52);
        assertEquals(52, subject.reconcile32(5));
    }

    @Test
    void ignoresNegativeValuesYield32() {
        AmberEstuary subject = new AmberEstuary();
        subject.reconcile32(3);
        assertEquals(3, subject.reconcile32(-2));
        assertEquals(3, subject.bias32Value());
    }

    @Test
    void rejectsZeroDenominatorBias33() {
        AmberEstuary subject = new AmberEstuary();
        assertThrows(ArithmeticException.class, () -> subject.anneal33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias33() {
        assertEquals(0.5, new AmberEstuary().anneal33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias33() {
        assertEquals(4.0, new AmberEstuary().anneal33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan34() {
        assertTrue(new AmberEstuary().hoist34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new AmberEstuary().hoist34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan34() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberEstuary().hoist34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan35() {
        assertEquals("below", new AmberEstuary().flatten35(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan35() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("lower-bound", subject.flatten35(5));
        assertEquals("upper-bound", subject.flatten35(12));
    }

    @Test
    void classifiesWithinAndAboveSpan35() {
        AmberEstuary subject = new AmberEstuary();
        assertEquals("within", subject.flatten35(5 + 1));
        assertEquals("above", subject.flatten35(12 + 1));
    }
}
