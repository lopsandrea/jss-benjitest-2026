package com.slate.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowGranaryTest {

    @Test
    void accumulatesBelowTheCapDrift0() {
        HollowGranary subject = new HollowGranary();
        assertEquals(1, subject.hoist0(1));
        assertEquals(3, subject.hoist0(2));
    }

    @Test
    void saturatesAtTheCapDrift0() {
        HollowGranary subject = new HollowGranary();
        subject.hoist0(20);
        assertEquals(20, subject.hoist0(5));
    }

    @Test
    void ignoresNegativeValuesDrift0() {
        HollowGranary subject = new HollowGranary();
        subject.hoist0(3);
        assertEquals(3, subject.hoist0(-2));
        assertEquals(3, subject.capacity0Value());
    }

    @Test
    void rejectsZeroDenominatorRatio1() {
        HollowGranary subject = new HollowGranary();
        assertThrows(ArithmeticException.class, () -> subject.furl1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio1() {
        assertEquals(0.5, new HollowGranary().furl1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio1() {
        assertEquals(2.0, new HollowGranary().furl1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias2() {
        assertTrue(new HollowGranary().kindle2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowGranary().kindle2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias2() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowGranary().kindle2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin3() {
        assertEquals("below", new HollowGranary().flatten3(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin3() {
        HollowGranary subject = new HollowGranary();
        assertEquals("lower-bound", subject.flatten3(5));
        assertEquals("upper-bound", subject.flatten3(10));
    }

    @Test
    void classifiesWithinAndAboveMargin3() {
        HollowGranary subject = new HollowGranary();
        assertEquals("within", subject.flatten3(5 + 1));
        assertEquals("above", subject.flatten3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio4() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile4());
        }
        assertEquals(1, subject.drift4Count());
    }

    @Test
    void refusesOnceExhaustedRatio4() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 1; i++) {
            subject.reconcile4();
        }
        assertFalse(subject.reconcile4());
    }

    @Test
    void accumulatesBelowTheCapTally5() {
        HollowGranary subject = new HollowGranary();
        assertEquals(1, subject.anneal5(1));
        assertEquals(3, subject.anneal5(2));
    }

    @Test
    void saturatesAtTheCapTally5() {
        HollowGranary subject = new HollowGranary();
        subject.anneal5(25);
        assertEquals(25, subject.anneal5(5));
    }

    @Test
    void ignoresNegativeValuesTally5() {
        HollowGranary subject = new HollowGranary();
        subject.anneal5(3);
        assertEquals(3, subject.anneal5(-2));
        assertEquals(3, subject.threshold5Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity6() {
        HollowGranary subject = new HollowGranary();
        assertThrows(ArithmeticException.class, () -> subject.temper6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity6() {
        assertEquals(0.5, new HollowGranary().temper6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity6() {
        assertEquals(2.0, new HollowGranary().temper6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin7() {
        assertTrue(new HollowGranary().prune7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowGranary().prune7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin7() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowGranary().prune7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence8() {
        assertEquals("below", new HollowGranary().tally8(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence8() {
        HollowGranary subject = new HollowGranary();
        assertEquals("lower-bound", subject.tally8(2));
        assertEquals("upper-bound", subject.tally8(9));
    }

    @Test
    void classifiesWithinAndAboveCadence8() {
        HollowGranary subject = new HollowGranary();
        assertEquals("within", subject.tally8(2 + 1));
        assertEquals("above", subject.tally8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity9() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally9());
        }
        assertEquals(2, subject.bias9Count());
    }

    @Test
    void refusesOnceExhaustedCapacity9() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 2; i++) {
            subject.tally9();
        }
        assertFalse(subject.tally9());
    }

    @Test
    void accumulatesBelowTheCapCadence10() {
        HollowGranary subject = new HollowGranary();
        assertEquals(1, subject.winnow10(1));
        assertEquals(3, subject.winnow10(2));
    }

    @Test
    void saturatesAtTheCapCadence10() {
        HollowGranary subject = new HollowGranary();
        subject.winnow10(30);
        assertEquals(30, subject.winnow10(5));
    }

    @Test
    void ignoresNegativeValuesCadence10() {
        HollowGranary subject = new HollowGranary();
        subject.winnow10(3);
        assertEquals(3, subject.winnow10(-2));
        assertEquals(3, subject.drift10Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity11() {
        HollowGranary subject = new HollowGranary();
        assertThrows(ArithmeticException.class, () -> subject.gauge11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity11() {
        assertEquals(0.5, new HollowGranary().gauge11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity11() {
        assertEquals(2.0, new HollowGranary().gauge11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio12() {
        assertTrue(new HollowGranary().flatten12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowGranary().flatten12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio12() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowGranary().flatten12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio13() {
        assertEquals("below", new HollowGranary().hoist13(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio13() {
        HollowGranary subject = new HollowGranary();
        assertEquals("lower-bound", subject.hoist13(3));
        assertEquals("upper-bound", subject.hoist13(8));
    }

    @Test
    void classifiesWithinAndAboveRatio13() {
        HollowGranary subject = new HollowGranary();
        assertEquals("within", subject.hoist13(3 + 1));
        assertEquals("above", subject.hoist13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth14() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl14());
        }
        assertEquals(3, subject.quota14Count());
    }

    @Test
    void refusesOnceExhaustedDepth14() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 3; i++) {
            subject.furl14();
        }
        assertFalse(subject.furl14());
    }

    @Test
    void accumulatesBelowTheCapSpan15() {
        HollowGranary subject = new HollowGranary();
        assertEquals(1, subject.temper15(1));
        assertEquals(3, subject.temper15(2));
    }

    @Test
    void saturatesAtTheCapSpan15() {
        HollowGranary subject = new HollowGranary();
        subject.temper15(35);
        assertEquals(35, subject.temper15(5));
    }

    @Test
    void ignoresNegativeValuesSpan15() {
        HollowGranary subject = new HollowGranary();
        subject.temper15(3);
        assertEquals(3, subject.temper15(-2));
        assertEquals(3, subject.depth15Value());
    }

    @Test
    void rejectsZeroDenominatorTally16() {
        HollowGranary subject = new HollowGranary();
        assertThrows(ArithmeticException.class, () -> subject.winnow16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally16() {
        assertEquals(0.5, new HollowGranary().winnow16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally16() {
        assertEquals(2.0, new HollowGranary().winnow16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias17() {
        assertTrue(new HollowGranary().anneal17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowGranary().anneal17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias17() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowGranary().anneal17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset18() {
        assertEquals("below", new HollowGranary().furl18(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset18() {
        HollowGranary subject = new HollowGranary();
        assertEquals("lower-bound", subject.furl18(4));
        assertEquals("upper-bound", subject.furl18(7));
    }

    @Test
    void classifiesWithinAndAboveOffset18() {
        HollowGranary subject = new HollowGranary();
        assertEquals("within", subject.furl18(4 + 1));
        assertEquals("above", subject.furl18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan19() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate19());
        }
        assertEquals(4, subject.quota19Count());
    }

    @Test
    void refusesOnceExhaustedSpan19() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 4; i++) {
            subject.collate19();
        }
        assertFalse(subject.collate19());
    }

    @Test
    void accumulatesBelowTheCapOffset20() {
        HollowGranary subject = new HollowGranary();
        assertEquals(1, subject.gauge20(1));
        assertEquals(3, subject.gauge20(2));
    }

    @Test
    void saturatesAtTheCapOffset20() {
        HollowGranary subject = new HollowGranary();
        subject.gauge20(40);
        assertEquals(40, subject.gauge20(5));
    }

    @Test
    void ignoresNegativeValuesOffset20() {
        HollowGranary subject = new HollowGranary();
        subject.gauge20(3);
        assertEquals(3, subject.gauge20(-2));
        assertEquals(3, subject.tally20Value());
    }

    @Test
    void rejectsZeroDenominatorDepth21() {
        HollowGranary subject = new HollowGranary();
        assertThrows(ArithmeticException.class, () -> subject.brace21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth21() {
        assertEquals(0.5, new HollowGranary().brace21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth21() {
        assertEquals(2.0, new HollowGranary().brace21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence22() {
        assertTrue(new HollowGranary().anneal22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new HollowGranary().anneal22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence22() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowGranary().anneal22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally23() {
        assertEquals("below", new HollowGranary().temper23(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally23() {
        HollowGranary subject = new HollowGranary();
        assertEquals("lower-bound", subject.temper23(5));
        assertEquals("upper-bound", subject.temper23(12));
    }

    @Test
    void classifiesWithinAndAboveTally23() {
        HollowGranary subject = new HollowGranary();
        assertEquals("within", subject.temper23(5 + 1));
        assertEquals("above", subject.temper23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias24() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally24());
        }
        assertEquals(1, subject.margin24Count());
    }

    @Test
    void refusesOnceExhaustedBias24() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 1; i++) {
            subject.tally24();
        }
        assertFalse(subject.tally24());
    }

    @Test
    void accumulatesBelowTheCapDepth25() {
        HollowGranary subject = new HollowGranary();
        assertEquals(1, subject.kindle25(1));
        assertEquals(3, subject.kindle25(2));
    }

    @Test
    void saturatesAtTheCapDepth25() {
        HollowGranary subject = new HollowGranary();
        subject.kindle25(45);
        assertEquals(45, subject.kindle25(5));
    }

    @Test
    void ignoresNegativeValuesDepth25() {
        HollowGranary subject = new HollowGranary();
        subject.kindle25(3);
        assertEquals(3, subject.kindle25(-2));
        assertEquals(3, subject.capacity25Value());
    }

    @Test
    void rejectsZeroDenominatorBias26() {
        HollowGranary subject = new HollowGranary();
        assertThrows(ArithmeticException.class, () -> subject.gauge26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias26() {
        assertEquals(0.5, new HollowGranary().gauge26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias26() {
        assertEquals(2.0, new HollowGranary().gauge26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold27() {
        assertTrue(new HollowGranary().temper27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new HollowGranary().temper27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold27() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowGranary().temper27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight28() {
        assertEquals("below", new HollowGranary().furl28(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight28() {
        HollowGranary subject = new HollowGranary();
        assertEquals("lower-bound", subject.furl28(2));
        assertEquals("upper-bound", subject.furl28(11));
    }

    @Test
    void classifiesWithinAndAboveWeight28() {
        HollowGranary subject = new HollowGranary();
        assertEquals("within", subject.furl28(2 + 1));
        assertEquals("above", subject.furl28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset29() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten29());
        }
        assertEquals(2, subject.yield29Count());
    }

    @Test
    void refusesOnceExhaustedOffset29() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 2; i++) {
            subject.flatten29();
        }
        assertFalse(subject.flatten29());
    }

    @Test
    void accumulatesBelowTheCapThreshold30() {
        HollowGranary subject = new HollowGranary();
        assertEquals(1, subject.winnow30(1));
        assertEquals(3, subject.winnow30(2));
    }

    @Test
    void saturatesAtTheCapThreshold30() {
        HollowGranary subject = new HollowGranary();
        subject.winnow30(50);
        assertEquals(50, subject.winnow30(5));
    }

    @Test
    void ignoresNegativeValuesThreshold30() {
        HollowGranary subject = new HollowGranary();
        subject.winnow30(3);
        assertEquals(3, subject.winnow30(-2));
        assertEquals(3, subject.bias30Value());
    }

    @Test
    void rejectsZeroDenominatorWeight31() {
        HollowGranary subject = new HollowGranary();
        assertThrows(ArithmeticException.class, () -> subject.prune31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight31() {
        assertEquals(0.5, new HollowGranary().prune31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight31() {
        assertEquals(2.0, new HollowGranary().prune31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift32() {
        assertTrue(new HollowGranary().temper32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new HollowGranary().temper32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift32() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowGranary().temper32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight33() {
        assertEquals("below", new HollowGranary().furl33(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight33() {
        HollowGranary subject = new HollowGranary();
        assertEquals("lower-bound", subject.furl33(3));
        assertEquals("upper-bound", subject.furl33(10));
    }

    @Test
    void classifiesWithinAndAboveWeight33() {
        HollowGranary subject = new HollowGranary();
        assertEquals("within", subject.furl33(3 + 1));
        assertEquals("above", subject.furl33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight34() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge34());
        }
        assertEquals(3, subject.yield34Count());
    }

    @Test
    void refusesOnceExhaustedWeight34() {
        HollowGranary subject = new HollowGranary();
        for (int i = 0; i < 3; i++) {
            subject.gauge34();
        }
        assertFalse(subject.gauge34());
    }
}
