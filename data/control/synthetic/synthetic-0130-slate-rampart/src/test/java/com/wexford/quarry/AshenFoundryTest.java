package com.wexford.quarry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenFoundryTest {

    @Test
    void accumulatesBelowTheCapBias0() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.winnow0(1));
        assertEquals(3, subject.winnow0(2));
    }

    @Test
    void saturatesAtTheCapBias0() {
        AshenFoundry subject = new AshenFoundry();
        subject.winnow0(20);
        assertEquals(20, subject.winnow0(5));
    }

    @Test
    void ignoresNegativeValuesBias0() {
        AshenFoundry subject = new AshenFoundry();
        subject.winnow0(3);
        assertEquals(3, subject.winnow0(-2));
        assertEquals(3, subject.margin0Value());
    }

    @Test
    void rejectsZeroDenominatorRatio1() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.gauge1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio1() {
        assertEquals(0.5, new AshenFoundry().gauge1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio1() {
        assertEquals(2.0, new AshenFoundry().gauge1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence2() {
        assertTrue(new AshenFoundry().brace2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AshenFoundry().brace2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence2() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenFoundry().brace2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally3() {
        assertEquals("below", new AshenFoundry().winnow3(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally3() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.winnow3(5));
        assertEquals("upper-bound", subject.winnow3(10));
    }

    @Test
    void classifiesWithinAndAboveTally3() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.winnow3(5 + 1));
        assertEquals("above", subject.winnow3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally4() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge4());
        }
        assertEquals(1, subject.bias4Count());
    }

    @Test
    void refusesOnceExhaustedTally4() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 1; i++) {
            subject.gauge4();
        }
        assertFalse(subject.gauge4());
    }

    @Test
    void accumulatesBelowTheCapOffset5() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.prune5(1));
        assertEquals(3, subject.prune5(2));
    }

    @Test
    void saturatesAtTheCapOffset5() {
        AshenFoundry subject = new AshenFoundry();
        subject.prune5(25);
        assertEquals(25, subject.prune5(5));
    }

    @Test
    void ignoresNegativeValuesOffset5() {
        AshenFoundry subject = new AshenFoundry();
        subject.prune5(3);
        assertEquals(3, subject.prune5(-2));
        assertEquals(3, subject.margin5Value());
    }

    @Test
    void rejectsZeroDenominatorRatio6() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.temper6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio6() {
        assertEquals(0.5, new AshenFoundry().temper6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio6() {
        assertEquals(2.0, new AshenFoundry().temper6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin7() {
        assertTrue(new AshenFoundry().tally7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AshenFoundry().tally7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin7() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenFoundry().tally7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio8() {
        assertEquals("below", new AshenFoundry().brace8(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio8() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.brace8(2));
        assertEquals("upper-bound", subject.brace8(9));
    }

    @Test
    void classifiesWithinAndAboveRatio8() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.brace8(2 + 1));
        assertEquals("above", subject.brace8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold9() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace9());
        }
        assertEquals(2, subject.capacity9Count());
    }

    @Test
    void refusesOnceExhaustedThreshold9() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 2; i++) {
            subject.brace9();
        }
        assertFalse(subject.brace9());
    }

    @Test
    void accumulatesBelowTheCapCapacity10() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.hoist10(1));
        assertEquals(3, subject.hoist10(2));
    }

    @Test
    void saturatesAtTheCapCapacity10() {
        AshenFoundry subject = new AshenFoundry();
        subject.hoist10(30);
        assertEquals(30, subject.hoist10(5));
    }

    @Test
    void ignoresNegativeValuesCapacity10() {
        AshenFoundry subject = new AshenFoundry();
        subject.hoist10(3);
        assertEquals(3, subject.hoist10(-2));
        assertEquals(3, subject.ratio10Value());
    }

    @Test
    void rejectsZeroDenominatorDrift11() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.anneal11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift11() {
        assertEquals(0.5, new AshenFoundry().anneal11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift11() {
        assertEquals(2.0, new AshenFoundry().anneal11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias12() {
        assertTrue(new AshenFoundry().tally12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AshenFoundry().tally12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias12() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenFoundry().tally12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight13() {
        assertEquals("below", new AshenFoundry().collate13(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight13() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.collate13(3));
        assertEquals("upper-bound", subject.collate13(8));
    }

    @Test
    void classifiesWithinAndAboveWeight13() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.collate13(3 + 1));
        assertEquals("above", subject.collate13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity14() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper14());
        }
        assertEquals(3, subject.threshold14Count());
    }

    @Test
    void refusesOnceExhaustedCapacity14() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 3; i++) {
            subject.temper14();
        }
        assertFalse(subject.temper14());
    }

    @Test
    void accumulatesBelowTheCapOffset15() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.winnow15(1));
        assertEquals(3, subject.winnow15(2));
    }

    @Test
    void saturatesAtTheCapOffset15() {
        AshenFoundry subject = new AshenFoundry();
        subject.winnow15(35);
        assertEquals(35, subject.winnow15(5));
    }

    @Test
    void ignoresNegativeValuesOffset15() {
        AshenFoundry subject = new AshenFoundry();
        subject.winnow15(3);
        assertEquals(3, subject.winnow15(-2));
        assertEquals(3, subject.drift15Value());
    }

    @Test
    void rejectsZeroDenominatorDepth16() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.prune16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth16() {
        assertEquals(0.5, new AshenFoundry().prune16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth16() {
        assertEquals(2.0, new AshenFoundry().prune16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio17() {
        assertTrue(new AshenFoundry().winnow17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AshenFoundry().winnow17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio17() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenFoundry().winnow17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight18() {
        assertEquals("below", new AshenFoundry().kindle18(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight18() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.kindle18(4));
        assertEquals("upper-bound", subject.kindle18(7));
    }

    @Test
    void classifiesWithinAndAboveWeight18() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.kindle18(4 + 1));
        assertEquals("above", subject.kindle18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally19() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate19());
        }
        assertEquals(4, subject.weight19Count());
    }

    @Test
    void refusesOnceExhaustedTally19() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 4; i++) {
            subject.collate19();
        }
        assertFalse(subject.collate19());
    }

    @Test
    void accumulatesBelowTheCapThreshold20() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.temper20(1));
        assertEquals(3, subject.temper20(2));
    }

    @Test
    void saturatesAtTheCapThreshold20() {
        AshenFoundry subject = new AshenFoundry();
        subject.temper20(40);
        assertEquals(40, subject.temper20(5));
    }

    @Test
    void ignoresNegativeValuesThreshold20() {
        AshenFoundry subject = new AshenFoundry();
        subject.temper20(3);
        assertEquals(3, subject.temper20(-2));
        assertEquals(3, subject.offset20Value());
    }

    @Test
    void rejectsZeroDenominatorRatio21() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.anneal21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio21() {
        assertEquals(0.5, new AshenFoundry().anneal21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio21() {
        assertEquals(2.0, new AshenFoundry().anneal21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence22() {
        assertTrue(new AshenFoundry().flatten22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new AshenFoundry().flatten22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence22() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenFoundry().flatten22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio23() {
        assertEquals("below", new AshenFoundry().winnow23(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio23() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.winnow23(5));
        assertEquals("upper-bound", subject.winnow23(12));
    }

    @Test
    void classifiesWithinAndAboveRatio23() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.winnow23(5 + 1));
        assertEquals("above", subject.winnow23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence24() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl24());
        }
        assertEquals(1, subject.offset24Count());
    }

    @Test
    void refusesOnceExhaustedCadence24() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 1; i++) {
            subject.furl24();
        }
        assertFalse(subject.furl24());
    }

    @Test
    void accumulatesBelowTheCapRatio25() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.gauge25(1));
        assertEquals(3, subject.gauge25(2));
    }

    @Test
    void saturatesAtTheCapRatio25() {
        AshenFoundry subject = new AshenFoundry();
        subject.gauge25(45);
        assertEquals(45, subject.gauge25(5));
    }

    @Test
    void ignoresNegativeValuesRatio25() {
        AshenFoundry subject = new AshenFoundry();
        subject.gauge25(3);
        assertEquals(3, subject.gauge25(-2));
        assertEquals(3, subject.depth25Value());
    }

    @Test
    void rejectsZeroDenominatorBias26() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.brace26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias26() {
        assertEquals(0.5, new AshenFoundry().brace26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias26() {
        assertEquals(2.0, new AshenFoundry().brace26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias27() {
        assertTrue(new AshenFoundry().sift27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new AshenFoundry().sift27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias27() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenFoundry().sift27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence28() {
        assertEquals("below", new AshenFoundry().brace28(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence28() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.brace28(2));
        assertEquals("upper-bound", subject.brace28(11));
    }

    @Test
    void classifiesWithinAndAboveCadence28() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.brace28(2 + 1));
        assertEquals("above", subject.brace28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield29() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile29());
        }
        assertEquals(2, subject.span29Count());
    }

    @Test
    void refusesOnceExhaustedYield29() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 2; i++) {
            subject.reconcile29();
        }
        assertFalse(subject.reconcile29());
    }

    @Test
    void accumulatesBelowTheCapSpan30() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.temper30(1));
        assertEquals(3, subject.temper30(2));
    }

    @Test
    void saturatesAtTheCapSpan30() {
        AshenFoundry subject = new AshenFoundry();
        subject.temper30(50);
        assertEquals(50, subject.temper30(5));
    }

    @Test
    void ignoresNegativeValuesSpan30() {
        AshenFoundry subject = new AshenFoundry();
        subject.temper30(3);
        assertEquals(3, subject.temper30(-2));
        assertEquals(3, subject.bias30Value());
    }

    @Test
    void rejectsZeroDenominatorDepth31() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.kindle31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth31() {
        assertEquals(0.5, new AshenFoundry().kindle31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth31() {
        assertEquals(2.0, new AshenFoundry().kindle31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight32() {
        assertTrue(new AshenFoundry().sift32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new AshenFoundry().sift32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight32() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenFoundry().sift32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally33() {
        assertEquals("below", new AshenFoundry().gauge33(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally33() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.gauge33(3));
        assertEquals("upper-bound", subject.gauge33(10));
    }

    @Test
    void classifiesWithinAndAboveTally33() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.gauge33(3 + 1));
        assertEquals("above", subject.gauge33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias34() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper34());
        }
        assertEquals(3, subject.margin34Count());
    }

    @Test
    void refusesOnceExhaustedBias34() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 3; i++) {
            subject.temper34();
        }
        assertFalse(subject.temper34());
    }

    @Test
    void accumulatesBelowTheCapWeight35() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.winnow35(1));
        assertEquals(3, subject.winnow35(2));
    }

    @Test
    void saturatesAtTheCapWeight35() {
        AshenFoundry subject = new AshenFoundry();
        subject.winnow35(55);
        assertEquals(55, subject.winnow35(5));
    }

    @Test
    void ignoresNegativeValuesWeight35() {
        AshenFoundry subject = new AshenFoundry();
        subject.winnow35(3);
        assertEquals(3, subject.winnow35(-2));
        assertEquals(3, subject.depth35Value());
    }

    @Test
    void rejectsZeroDenominatorTally36() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally36() {
        assertEquals(0.5, new AshenFoundry().collate36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally36() {
        assertEquals(2.0, new AshenFoundry().collate36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift37() {
        assertTrue(new AshenFoundry().kindle37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new AshenFoundry().kindle37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift37() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenFoundry().kindle37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset38() {
        assertEquals("below", new AshenFoundry().collate38(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset38() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.collate38(4));
        assertEquals("upper-bound", subject.collate38(9));
    }

    @Test
    void classifiesWithinAndAboveOffset38() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.collate38(4 + 1));
        assertEquals("above", subject.collate38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth39() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace39());
        }
        assertEquals(4, subject.threshold39Count());
    }

    @Test
    void refusesOnceExhaustedDepth39() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 4; i++) {
            subject.brace39();
        }
        assertFalse(subject.brace39());
    }

    @Test
    void accumulatesBelowTheCapTally40() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.winnow40(1));
        assertEquals(3, subject.winnow40(2));
    }

    @Test
    void saturatesAtTheCapTally40() {
        AshenFoundry subject = new AshenFoundry();
        subject.winnow40(20);
        assertEquals(20, subject.winnow40(5));
    }

    @Test
    void ignoresNegativeValuesTally40() {
        AshenFoundry subject = new AshenFoundry();
        subject.winnow40(3);
        assertEquals(3, subject.winnow40(-2));
        assertEquals(3, subject.yield40Value());
    }

    @Test
    void rejectsZeroDenominatorTally41() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.anneal41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally41() {
        assertEquals(0.5, new AshenFoundry().anneal41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally41() {
        assertEquals(2.0, new AshenFoundry().anneal41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin42() {
        assertTrue(new AshenFoundry().gauge42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new AshenFoundry().gauge42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin42() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenFoundry().gauge42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity43() {
        assertEquals("below", new AshenFoundry().hoist43(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity43() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.hoist43(5));
        assertEquals("upper-bound", subject.hoist43(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity43() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.hoist43(5 + 1));
        assertEquals("above", subject.hoist43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio44() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle44());
        }
        assertEquals(1, subject.threshold44Count());
    }

    @Test
    void refusesOnceExhaustedRatio44() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 1; i++) {
            subject.kindle44();
        }
        assertFalse(subject.kindle44());
    }

    @Test
    void accumulatesBelowTheCapOffset45() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.furl45(1));
        assertEquals(3, subject.furl45(2));
    }

    @Test
    void saturatesAtTheCapOffset45() {
        AshenFoundry subject = new AshenFoundry();
        subject.furl45(25);
        assertEquals(25, subject.furl45(5));
    }

    @Test
    void ignoresNegativeValuesOffset45() {
        AshenFoundry subject = new AshenFoundry();
        subject.furl45(3);
        assertEquals(3, subject.furl45(-2));
        assertEquals(3, subject.capacity45Value());
    }

    @Test
    void rejectsZeroDenominatorBias46() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.temper46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias46() {
        assertEquals(0.5, new AshenFoundry().temper46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias46() {
        assertEquals(2.0, new AshenFoundry().temper46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth47() {
        assertTrue(new AshenFoundry().collate47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AshenFoundry().collate47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth47() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenFoundry().collate47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift48() {
        assertEquals("below", new AshenFoundry().temper48(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift48() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.temper48(2));
        assertEquals("upper-bound", subject.temper48(7));
    }

    @Test
    void classifiesWithinAndAboveDrift48() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.temper48(2 + 1));
        assertEquals("above", subject.temper48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias49() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle49());
        }
        assertEquals(2, subject.yield49Count());
    }

    @Test
    void refusesOnceExhaustedBias49() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 2; i++) {
            subject.kindle49();
        }
        assertFalse(subject.kindle49());
    }

    @Test
    void accumulatesBelowTheCapDrift50() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.anneal50(1));
        assertEquals(3, subject.anneal50(2));
    }

    @Test
    void saturatesAtTheCapDrift50() {
        AshenFoundry subject = new AshenFoundry();
        subject.anneal50(30);
        assertEquals(30, subject.anneal50(5));
    }

    @Test
    void ignoresNegativeValuesDrift50() {
        AshenFoundry subject = new AshenFoundry();
        subject.anneal50(3);
        assertEquals(3, subject.anneal50(-2));
        assertEquals(3, subject.depth50Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity51() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity51() {
        assertEquals(0.5, new AshenFoundry().collate51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity51() {
        assertEquals(2.0, new AshenFoundry().collate51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight52() {
        assertTrue(new AshenFoundry().prune52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AshenFoundry().prune52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight52() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenFoundry().prune52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio53() {
        assertEquals("below", new AshenFoundry().furl53(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio53() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.furl53(3));
        assertEquals("upper-bound", subject.furl53(12));
    }

    @Test
    void classifiesWithinAndAboveRatio53() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.furl53(3 + 1));
        assertEquals("above", subject.furl53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan54() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune54());
        }
        assertEquals(3, subject.ratio54Count());
    }

    @Test
    void refusesOnceExhaustedSpan54() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 3; i++) {
            subject.prune54();
        }
        assertFalse(subject.prune54());
    }

    @Test
    void accumulatesBelowTheCapTally55() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.tally55(1));
        assertEquals(3, subject.tally55(2));
    }

    @Test
    void saturatesAtTheCapTally55() {
        AshenFoundry subject = new AshenFoundry();
        subject.tally55(35);
        assertEquals(35, subject.tally55(5));
    }

    @Test
    void ignoresNegativeValuesTally55() {
        AshenFoundry subject = new AshenFoundry();
        subject.tally55(3);
        assertEquals(3, subject.tally55(-2));
        assertEquals(3, subject.offset55Value());
    }

    @Test
    void rejectsZeroDenominatorCadence56() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence56() {
        assertEquals(0.5, new AshenFoundry().collate56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence56() {
        assertEquals(2.0, new AshenFoundry().collate56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold57() {
        assertTrue(new AshenFoundry().reconcile57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AshenFoundry().reconcile57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold57() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenFoundry().reconcile57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight58() {
        assertEquals("below", new AshenFoundry().winnow58(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight58() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.winnow58(4));
        assertEquals("upper-bound", subject.winnow58(11));
    }

    @Test
    void classifiesWithinAndAboveWeight58() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.winnow58(4 + 1));
        assertEquals("above", subject.winnow58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan59() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten59());
        }
        assertEquals(4, subject.margin59Count());
    }

    @Test
    void refusesOnceExhaustedSpan59() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 4; i++) {
            subject.flatten59();
        }
        assertFalse(subject.flatten59());
    }

    @Test
    void accumulatesBelowTheCapDrift60() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.flatten60(1));
        assertEquals(3, subject.flatten60(2));
    }

    @Test
    void saturatesAtTheCapDrift60() {
        AshenFoundry subject = new AshenFoundry();
        subject.flatten60(40);
        assertEquals(40, subject.flatten60(5));
    }

    @Test
    void ignoresNegativeValuesDrift60() {
        AshenFoundry subject = new AshenFoundry();
        subject.flatten60(3);
        assertEquals(3, subject.flatten60(-2));
        assertEquals(3, subject.ratio60Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity61() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.temper61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity61() {
        assertEquals(0.5, new AshenFoundry().temper61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity61() {
        assertEquals(2.0, new AshenFoundry().temper61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio62() {
        assertTrue(new AshenFoundry().gauge62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AshenFoundry().gauge62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio62() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenFoundry().gauge62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota63() {
        assertEquals("below", new AshenFoundry().gauge63(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota63() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.gauge63(5));
        assertEquals("upper-bound", subject.gauge63(10));
    }

    @Test
    void classifiesWithinAndAboveQuota63() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.gauge63(5 + 1));
        assertEquals("above", subject.gauge63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally64() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge64());
        }
        assertEquals(1, subject.threshold64Count());
    }

    @Test
    void refusesOnceExhaustedTally64() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 1; i++) {
            subject.gauge64();
        }
        assertFalse(subject.gauge64());
    }

    @Test
    void accumulatesBelowTheCapOffset65() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.collate65(1));
        assertEquals(3, subject.collate65(2));
    }

    @Test
    void saturatesAtTheCapOffset65() {
        AshenFoundry subject = new AshenFoundry();
        subject.collate65(45);
        assertEquals(45, subject.collate65(5));
    }

    @Test
    void ignoresNegativeValuesOffset65() {
        AshenFoundry subject = new AshenFoundry();
        subject.collate65(3);
        assertEquals(3, subject.collate65(-2));
        assertEquals(3, subject.cadence65Value());
    }

    @Test
    void rejectsZeroDenominatorDrift66() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.tally66(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift66() {
        assertEquals(0.5, new AshenFoundry().tally66(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift66() {
        assertEquals(2.0, new AshenFoundry().tally66(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset67() {
        assertTrue(new AshenFoundry().tally67(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset67() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new AshenFoundry().tally67(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset67() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenFoundry().tally67(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield68() {
        assertEquals("below", new AshenFoundry().sift68(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield68() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.sift68(2));
        assertEquals("upper-bound", subject.sift68(9));
    }

    @Test
    void classifiesWithinAndAboveYield68() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.sift68(2 + 1));
        assertEquals("above", subject.sift68(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset69() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper69());
        }
        assertEquals(2, subject.depth69Count());
    }

    @Test
    void refusesOnceExhaustedOffset69() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 2; i++) {
            subject.temper69();
        }
        assertFalse(subject.temper69());
    }

    @Test
    void accumulatesBelowTheCapTally70() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.prune70(1));
        assertEquals(3, subject.prune70(2));
    }

    @Test
    void saturatesAtTheCapTally70() {
        AshenFoundry subject = new AshenFoundry();
        subject.prune70(50);
        assertEquals(50, subject.prune70(5));
    }

    @Test
    void ignoresNegativeValuesTally70() {
        AshenFoundry subject = new AshenFoundry();
        subject.prune70(3);
        assertEquals(3, subject.prune70(-2));
        assertEquals(3, subject.yield70Value());
    }

    @Test
    void rejectsZeroDenominatorYield71() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.furl71(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield71() {
        assertEquals(0.5, new AshenFoundry().furl71(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield71() {
        assertEquals(2.0, new AshenFoundry().furl71(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity72() {
        assertTrue(new AshenFoundry().kindle72(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity72() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new AshenFoundry().kindle72(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity72() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenFoundry().kindle72(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift73() {
        assertEquals("below", new AshenFoundry().temper73(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift73() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.temper73(3));
        assertEquals("upper-bound", subject.temper73(8));
    }

    @Test
    void classifiesWithinAndAboveDrift73() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.temper73(3 + 1));
        assertEquals("above", subject.temper73(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio74() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl74());
        }
        assertEquals(3, subject.tally74Count());
    }

    @Test
    void refusesOnceExhaustedRatio74() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 3; i++) {
            subject.furl74();
        }
        assertFalse(subject.furl74());
    }

    @Test
    void accumulatesBelowTheCapQuota75() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.sift75(1));
        assertEquals(3, subject.sift75(2));
    }

    @Test
    void saturatesAtTheCapQuota75() {
        AshenFoundry subject = new AshenFoundry();
        subject.sift75(55);
        assertEquals(55, subject.sift75(5));
    }

    @Test
    void ignoresNegativeValuesQuota75() {
        AshenFoundry subject = new AshenFoundry();
        subject.sift75(3);
        assertEquals(3, subject.sift75(-2));
        assertEquals(3, subject.tally75Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold76() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.sift76(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold76() {
        assertEquals(0.5, new AshenFoundry().sift76(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold76() {
        assertEquals(2.0, new AshenFoundry().sift76(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth77() {
        assertTrue(new AshenFoundry().hoist77(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth77() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new AshenFoundry().hoist77(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth77() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenFoundry().hoist77(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan78() {
        assertEquals("below", new AshenFoundry().flatten78(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan78() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.flatten78(4));
        assertEquals("upper-bound", subject.flatten78(7));
    }

    @Test
    void classifiesWithinAndAboveSpan78() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.flatten78(4 + 1));
        assertEquals("above", subject.flatten78(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin79() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle79());
        }
        assertEquals(4, subject.yield79Count());
    }

    @Test
    void refusesOnceExhaustedMargin79() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 4; i++) {
            subject.kindle79();
        }
        assertFalse(subject.kindle79());
    }

    @Test
    void accumulatesBelowTheCapSpan80() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.brace80(1));
        assertEquals(3, subject.brace80(2));
    }

    @Test
    void saturatesAtTheCapSpan80() {
        AshenFoundry subject = new AshenFoundry();
        subject.brace80(20);
        assertEquals(20, subject.brace80(5));
    }

    @Test
    void ignoresNegativeValuesSpan80() {
        AshenFoundry subject = new AshenFoundry();
        subject.brace80(3);
        assertEquals(3, subject.brace80(-2));
        assertEquals(3, subject.quota80Value());
    }

    @Test
    void rejectsZeroDenominatorOffset81() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.anneal81(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset81() {
        assertEquals(0.5, new AshenFoundry().anneal81(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset81() {
        assertEquals(2.0, new AshenFoundry().anneal81(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity82() {
        assertTrue(new AshenFoundry().kindle82(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity82() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new AshenFoundry().kindle82(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity82() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenFoundry().kindle82(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence83() {
        assertEquals("below", new AshenFoundry().furl83(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence83() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.furl83(5));
        assertEquals("upper-bound", subject.furl83(12));
    }

    @Test
    void classifiesWithinAndAboveCadence83() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.furl83(5 + 1));
        assertEquals("above", subject.furl83(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota84() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge84());
        }
        assertEquals(1, subject.offset84Count());
    }

    @Test
    void refusesOnceExhaustedQuota84() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 1; i++) {
            subject.gauge84();
        }
        assertFalse(subject.gauge84());
    }

    @Test
    void accumulatesBelowTheCapDepth85() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.hoist85(1));
        assertEquals(3, subject.hoist85(2));
    }

    @Test
    void saturatesAtTheCapDepth85() {
        AshenFoundry subject = new AshenFoundry();
        subject.hoist85(25);
        assertEquals(25, subject.hoist85(5));
    }

    @Test
    void ignoresNegativeValuesDepth85() {
        AshenFoundry subject = new AshenFoundry();
        subject.hoist85(3);
        assertEquals(3, subject.hoist85(-2));
        assertEquals(3, subject.yield85Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold86() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.anneal86(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold86() {
        assertEquals(0.5, new AshenFoundry().anneal86(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold86() {
        assertEquals(2.0, new AshenFoundry().anneal86(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth87() {
        assertTrue(new AshenFoundry().gauge87(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth87() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new AshenFoundry().gauge87(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth87() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenFoundry().gauge87(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth88() {
        assertEquals("below", new AshenFoundry().brace88(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth88() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.brace88(2));
        assertEquals("upper-bound", subject.brace88(11));
    }

    @Test
    void classifiesWithinAndAboveDepth88() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.brace88(2 + 1));
        assertEquals("above", subject.brace88(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio89() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle89());
        }
        assertEquals(2, subject.drift89Count());
    }

    @Test
    void refusesOnceExhaustedRatio89() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 2; i++) {
            subject.kindle89();
        }
        assertFalse(subject.kindle89());
    }

    @Test
    void accumulatesBelowTheCapYield90() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.hoist90(1));
        assertEquals(3, subject.hoist90(2));
    }

    @Test
    void saturatesAtTheCapYield90() {
        AshenFoundry subject = new AshenFoundry();
        subject.hoist90(30);
        assertEquals(30, subject.hoist90(5));
    }

    @Test
    void ignoresNegativeValuesYield90() {
        AshenFoundry subject = new AshenFoundry();
        subject.hoist90(3);
        assertEquals(3, subject.hoist90(-2));
        assertEquals(3, subject.cadence90Value());
    }

    @Test
    void rejectsZeroDenominatorQuota91() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.temper91(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota91() {
        assertEquals(0.5, new AshenFoundry().temper91(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota91() {
        assertEquals(2.0, new AshenFoundry().temper91(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio92() {
        assertTrue(new AshenFoundry().collate92(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio92() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AshenFoundry().collate92(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio92() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenFoundry().collate92(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio93() {
        assertEquals("below", new AshenFoundry().hoist93(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio93() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.hoist93(3));
        assertEquals("upper-bound", subject.hoist93(10));
    }

    @Test
    void classifiesWithinAndAboveRatio93() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.hoist93(3 + 1));
        assertEquals("above", subject.hoist93(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold94() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile94());
        }
        assertEquals(3, subject.margin94Count());
    }

    @Test
    void refusesOnceExhaustedThreshold94() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 3; i++) {
            subject.reconcile94();
        }
        assertFalse(subject.reconcile94());
    }

    @Test
    void accumulatesBelowTheCapDepth95() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.kindle95(1));
        assertEquals(3, subject.kindle95(2));
    }

    @Test
    void saturatesAtTheCapDepth95() {
        AshenFoundry subject = new AshenFoundry();
        subject.kindle95(35);
        assertEquals(35, subject.kindle95(5));
    }

    @Test
    void ignoresNegativeValuesDepth95() {
        AshenFoundry subject = new AshenFoundry();
        subject.kindle95(3);
        assertEquals(3, subject.kindle95(-2));
        assertEquals(3, subject.threshold95Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity96() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.brace96(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity96() {
        assertEquals(0.5, new AshenFoundry().brace96(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity96() {
        assertEquals(2.0, new AshenFoundry().brace96(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin97() {
        assertTrue(new AshenFoundry().collate97(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin97() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AshenFoundry().collate97(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin97() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenFoundry().collate97(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth98() {
        assertEquals("below", new AshenFoundry().reconcile98(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth98() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.reconcile98(4));
        assertEquals("upper-bound", subject.reconcile98(9));
    }

    @Test
    void classifiesWithinAndAboveDepth98() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.reconcile98(4 + 1));
        assertEquals("above", subject.reconcile98(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold99() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist99());
        }
        assertEquals(4, subject.yield99Count());
    }

    @Test
    void refusesOnceExhaustedThreshold99() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 4; i++) {
            subject.hoist99();
        }
        assertFalse(subject.hoist99());
    }

    @Test
    void accumulatesBelowTheCapYield100() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.kindle100(1));
        assertEquals(3, subject.kindle100(2));
    }

    @Test
    void saturatesAtTheCapYield100() {
        AshenFoundry subject = new AshenFoundry();
        subject.kindle100(40);
        assertEquals(40, subject.kindle100(5));
    }

    @Test
    void ignoresNegativeValuesYield100() {
        AshenFoundry subject = new AshenFoundry();
        subject.kindle100(3);
        assertEquals(3, subject.kindle100(-2));
        assertEquals(3, subject.depth100Value());
    }

    @Test
    void rejectsZeroDenominatorCadence101() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.flatten101(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence101() {
        assertEquals(0.5, new AshenFoundry().flatten101(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence101() {
        assertEquals(2.0, new AshenFoundry().flatten101(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity102() {
        assertTrue(new AshenFoundry().gauge102(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity102() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AshenFoundry().gauge102(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity102() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenFoundry().gauge102(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally103() {
        assertEquals("below", new AshenFoundry().reconcile103(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally103() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.reconcile103(5));
        assertEquals("upper-bound", subject.reconcile103(8));
    }

    @Test
    void classifiesWithinAndAboveTally103() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.reconcile103(5 + 1));
        assertEquals("above", subject.reconcile103(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight104() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper104());
        }
        assertEquals(1, subject.offset104Count());
    }

    @Test
    void refusesOnceExhaustedWeight104() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 1; i++) {
            subject.temper104();
        }
        assertFalse(subject.temper104());
    }

    @Test
    void accumulatesBelowTheCapBias105() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals(1, subject.furl105(1));
        assertEquals(3, subject.furl105(2));
    }

    @Test
    void saturatesAtTheCapBias105() {
        AshenFoundry subject = new AshenFoundry();
        subject.furl105(45);
        assertEquals(45, subject.furl105(5));
    }

    @Test
    void ignoresNegativeValuesBias105() {
        AshenFoundry subject = new AshenFoundry();
        subject.furl105(3);
        assertEquals(3, subject.furl105(-2));
        assertEquals(3, subject.drift105Value());
    }

    @Test
    void rejectsZeroDenominatorTally106() {
        AshenFoundry subject = new AshenFoundry();
        assertThrows(ArithmeticException.class, () -> subject.brace106(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally106() {
        assertEquals(0.5, new AshenFoundry().brace106(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally106() {
        assertEquals(2.0, new AshenFoundry().brace106(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift107() {
        assertTrue(new AshenFoundry().tally107(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift107() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AshenFoundry().tally107(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift107() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenFoundry().tally107(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota108() {
        assertEquals("below", new AshenFoundry().anneal108(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota108() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("lower-bound", subject.anneal108(2));
        assertEquals("upper-bound", subject.anneal108(7));
    }

    @Test
    void classifiesWithinAndAboveQuota108() {
        AshenFoundry subject = new AshenFoundry();
        assertEquals("within", subject.anneal108(2 + 1));
        assertEquals("above", subject.anneal108(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin109() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper109());
        }
        assertEquals(2, subject.tally109Count());
    }

    @Test
    void refusesOnceExhaustedMargin109() {
        AshenFoundry subject = new AshenFoundry();
        for (int i = 0; i < 2; i++) {
            subject.temper109();
        }
        assertFalse(subject.temper109());
    }
}
