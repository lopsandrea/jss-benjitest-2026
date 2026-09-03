package com.bramble.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenTrellisIITest {

    @Test
    void accumulatesBelowTheCapQuota0() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals(1, subject.furl0(1));
        assertEquals(3, subject.furl0(2));
    }

    @Test
    void saturatesAtTheCapQuota0() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.furl0(20);
        assertEquals(20, subject.furl0(5));
    }

    @Test
    void ignoresNegativeValuesQuota0() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.furl0(3);
        assertEquals(3, subject.furl0(-2));
        assertEquals(3, subject.bias0Value());
    }

    @Test
    void rejectsZeroDenominatorRatio1() {
        AshenTrellisII subject = new AshenTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.flatten1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio1() {
        assertEquals(0.5, new AshenTrellisII().flatten1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio1() {
        assertEquals(2.0, new AshenTrellisII().flatten1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan2() {
        assertTrue(new AshenTrellisII().hoist2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AshenTrellisII().hoist2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan2() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenTrellisII().hoist2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally3() {
        assertEquals("below", new AshenTrellisII().winnow3(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally3() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("lower-bound", subject.winnow3(5));
        assertEquals("upper-bound", subject.winnow3(10));
    }

    @Test
    void classifiesWithinAndAboveTally3() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("within", subject.winnow3(5 + 1));
        assertEquals("above", subject.winnow3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio4() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge4());
        }
        assertEquals(1, subject.margin4Count());
    }

    @Test
    void refusesOnceExhaustedRatio4() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 1; i++) {
            subject.gauge4();
        }
        assertFalse(subject.gauge4());
    }

    @Test
    void accumulatesBelowTheCapMargin5() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals(1, subject.gauge5(1));
        assertEquals(3, subject.gauge5(2));
    }

    @Test
    void saturatesAtTheCapMargin5() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.gauge5(25);
        assertEquals(25, subject.gauge5(5));
    }

    @Test
    void ignoresNegativeValuesMargin5() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.gauge5(3);
        assertEquals(3, subject.gauge5(-2));
        assertEquals(3, subject.depth5Value());
    }

    @Test
    void rejectsZeroDenominatorQuota6() {
        AshenTrellisII subject = new AshenTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.kindle6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota6() {
        assertEquals(0.5, new AshenTrellisII().kindle6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota6() {
        assertEquals(2.0, new AshenTrellisII().kindle6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias7() {
        assertTrue(new AshenTrellisII().flatten7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AshenTrellisII().flatten7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias7() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenTrellisII().flatten7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift8() {
        assertEquals("below", new AshenTrellisII().tally8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift8() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("lower-bound", subject.tally8(2));
        assertEquals("upper-bound", subject.tally8(9));
    }

    @Test
    void classifiesWithinAndAboveDrift8() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("within", subject.tally8(2 + 1));
        assertEquals("above", subject.tally8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence9() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile9());
        }
        assertEquals(2, subject.drift9Count());
    }

    @Test
    void refusesOnceExhaustedCadence9() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile9();
        }
        assertFalse(subject.reconcile9());
    }

    @Test
    void accumulatesBelowTheCapSpan10() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals(1, subject.tally10(1));
        assertEquals(3, subject.tally10(2));
    }

    @Test
    void saturatesAtTheCapSpan10() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.tally10(30);
        assertEquals(30, subject.tally10(5));
    }

    @Test
    void ignoresNegativeValuesSpan10() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.tally10(3);
        assertEquals(3, subject.tally10(-2));
        assertEquals(3, subject.offset10Value());
    }

    @Test
    void rejectsZeroDenominatorSpan11() {
        AshenTrellisII subject = new AshenTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.hoist11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan11() {
        assertEquals(0.5, new AshenTrellisII().hoist11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan11() {
        assertEquals(2.0, new AshenTrellisII().hoist11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio12() {
        assertTrue(new AshenTrellisII().temper12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AshenTrellisII().temper12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio12() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenTrellisII().temper12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight13() {
        assertEquals("below", new AshenTrellisII().temper13(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight13() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("lower-bound", subject.temper13(3));
        assertEquals("upper-bound", subject.temper13(8));
    }

    @Test
    void classifiesWithinAndAboveWeight13() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("within", subject.temper13(3 + 1));
        assertEquals("above", subject.temper13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally14() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge14());
        }
        assertEquals(3, subject.margin14Count());
    }

    @Test
    void refusesOnceExhaustedTally14() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 3; i++) {
            subject.gauge14();
        }
        assertFalse(subject.gauge14());
    }

    @Test
    void accumulatesBelowTheCapRatio15() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals(1, subject.furl15(1));
        assertEquals(3, subject.furl15(2));
    }

    @Test
    void saturatesAtTheCapRatio15() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.furl15(35);
        assertEquals(35, subject.furl15(5));
    }

    @Test
    void ignoresNegativeValuesRatio15() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.furl15(3);
        assertEquals(3, subject.furl15(-2));
        assertEquals(3, subject.tally15Value());
    }

    @Test
    void rejectsZeroDenominatorYield16() {
        AshenTrellisII subject = new AshenTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.temper16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield16() {
        assertEquals(0.5, new AshenTrellisII().temper16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield16() {
        assertEquals(2.0, new AshenTrellisII().temper16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity17() {
        assertTrue(new AshenTrellisII().kindle17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AshenTrellisII().kindle17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity17() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenTrellisII().kindle17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota18() {
        assertEquals("below", new AshenTrellisII().collate18(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota18() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("lower-bound", subject.collate18(4));
        assertEquals("upper-bound", subject.collate18(7));
    }

    @Test
    void classifiesWithinAndAboveQuota18() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("within", subject.collate18(4 + 1));
        assertEquals("above", subject.collate18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold19() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle19());
        }
        assertEquals(4, subject.bias19Count());
    }

    @Test
    void refusesOnceExhaustedThreshold19() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 4; i++) {
            subject.kindle19();
        }
        assertFalse(subject.kindle19());
    }

    @Test
    void accumulatesBelowTheCapWeight20() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals(1, subject.flatten20(1));
        assertEquals(3, subject.flatten20(2));
    }

    @Test
    void saturatesAtTheCapWeight20() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.flatten20(40);
        assertEquals(40, subject.flatten20(5));
    }

    @Test
    void ignoresNegativeValuesWeight20() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.flatten20(3);
        assertEquals(3, subject.flatten20(-2));
        assertEquals(3, subject.yield20Value());
    }

    @Test
    void rejectsZeroDenominatorYield21() {
        AshenTrellisII subject = new AshenTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.kindle21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield21() {
        assertEquals(0.5, new AshenTrellisII().kindle21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield21() {
        assertEquals(2.0, new AshenTrellisII().kindle21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias22() {
        assertTrue(new AshenTrellisII().anneal22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new AshenTrellisII().anneal22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias22() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenTrellisII().anneal22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth23() {
        assertEquals("below", new AshenTrellisII().flatten23(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth23() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("lower-bound", subject.flatten23(5));
        assertEquals("upper-bound", subject.flatten23(12));
    }

    @Test
    void classifiesWithinAndAboveDepth23() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("within", subject.flatten23(5 + 1));
        assertEquals("above", subject.flatten23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift24() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl24());
        }
        assertEquals(1, subject.tally24Count());
    }

    @Test
    void refusesOnceExhaustedDrift24() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 1; i++) {
            subject.furl24();
        }
        assertFalse(subject.furl24());
    }

    @Test
    void accumulatesBelowTheCapTally25() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals(1, subject.brace25(1));
        assertEquals(3, subject.brace25(2));
    }

    @Test
    void saturatesAtTheCapTally25() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.brace25(45);
        assertEquals(45, subject.brace25(5));
    }

    @Test
    void ignoresNegativeValuesTally25() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.brace25(3);
        assertEquals(3, subject.brace25(-2));
        assertEquals(3, subject.drift25Value());
    }

    @Test
    void rejectsZeroDenominatorSpan26() {
        AshenTrellisII subject = new AshenTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.brace26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan26() {
        assertEquals(0.5, new AshenTrellisII().brace26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan26() {
        assertEquals(2.0, new AshenTrellisII().brace26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity27() {
        assertTrue(new AshenTrellisII().winnow27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new AshenTrellisII().winnow27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity27() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenTrellisII().winnow27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth28() {
        assertEquals("below", new AshenTrellisII().flatten28(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth28() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("lower-bound", subject.flatten28(2));
        assertEquals("upper-bound", subject.flatten28(11));
    }

    @Test
    void classifiesWithinAndAboveDepth28() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("within", subject.flatten28(2 + 1));
        assertEquals("above", subject.flatten28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity29() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune29());
        }
        assertEquals(2, subject.weight29Count());
    }

    @Test
    void refusesOnceExhaustedCapacity29() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 2; i++) {
            subject.prune29();
        }
        assertFalse(subject.prune29());
    }

    @Test
    void accumulatesBelowTheCapOffset30() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals(1, subject.gauge30(1));
        assertEquals(3, subject.gauge30(2));
    }

    @Test
    void saturatesAtTheCapOffset30() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.gauge30(50);
        assertEquals(50, subject.gauge30(5));
    }

    @Test
    void ignoresNegativeValuesOffset30() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.gauge30(3);
        assertEquals(3, subject.gauge30(-2));
        assertEquals(3, subject.capacity30Value());
    }

    @Test
    void rejectsZeroDenominatorDepth31() {
        AshenTrellisII subject = new AshenTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.flatten31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth31() {
        assertEquals(0.5, new AshenTrellisII().flatten31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth31() {
        assertEquals(2.0, new AshenTrellisII().flatten31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift32() {
        assertTrue(new AshenTrellisII().tally32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new AshenTrellisII().tally32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift32() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenTrellisII().tally32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally33() {
        assertEquals("below", new AshenTrellisII().hoist33(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally33() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("lower-bound", subject.hoist33(3));
        assertEquals("upper-bound", subject.hoist33(10));
    }

    @Test
    void classifiesWithinAndAboveTally33() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("within", subject.hoist33(3 + 1));
        assertEquals("above", subject.hoist33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity34() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist34());
        }
        assertEquals(3, subject.drift34Count());
    }

    @Test
    void refusesOnceExhaustedCapacity34() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 3; i++) {
            subject.hoist34();
        }
        assertFalse(subject.hoist34());
    }

    @Test
    void accumulatesBelowTheCapRatio35() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals(1, subject.temper35(1));
        assertEquals(3, subject.temper35(2));
    }

    @Test
    void saturatesAtTheCapRatio35() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.temper35(55);
        assertEquals(55, subject.temper35(5));
    }

    @Test
    void ignoresNegativeValuesRatio35() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.temper35(3);
        assertEquals(3, subject.temper35(-2));
        assertEquals(3, subject.quota35Value());
    }

    @Test
    void rejectsZeroDenominatorWeight36() {
        AshenTrellisII subject = new AshenTrellisII();
        assertThrows(ArithmeticException.class, () -> subject.kindle36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight36() {
        assertEquals(0.5, new AshenTrellisII().kindle36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight36() {
        assertEquals(2.0, new AshenTrellisII().kindle36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity37() {
        assertTrue(new AshenTrellisII().reconcile37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new AshenTrellisII().reconcile37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity37() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenTrellisII().reconcile37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias38() {
        assertEquals("below", new AshenTrellisII().winnow38(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias38() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("lower-bound", subject.winnow38(4));
        assertEquals("upper-bound", subject.winnow38(9));
    }

    @Test
    void classifiesWithinAndAboveBias38() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals("within", subject.winnow38(4 + 1));
        assertEquals("above", subject.winnow38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally39() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge39());
        }
        assertEquals(4, subject.margin39Count());
    }

    @Test
    void refusesOnceExhaustedTally39() {
        AshenTrellisII subject = new AshenTrellisII();
        for (int i = 0; i < 4; i++) {
            subject.gauge39();
        }
        assertFalse(subject.gauge39());
    }

    @Test
    void accumulatesBelowTheCapBias40() {
        AshenTrellisII subject = new AshenTrellisII();
        assertEquals(1, subject.winnow40(1));
        assertEquals(3, subject.winnow40(2));
    }

    @Test
    void saturatesAtTheCapBias40() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.winnow40(20);
        assertEquals(20, subject.winnow40(5));
    }

    @Test
    void ignoresNegativeValuesBias40() {
        AshenTrellisII subject = new AshenTrellisII();
        subject.winnow40(3);
        assertEquals(3, subject.winnow40(-2));
        assertEquals(3, subject.tally40Value());
    }
}
