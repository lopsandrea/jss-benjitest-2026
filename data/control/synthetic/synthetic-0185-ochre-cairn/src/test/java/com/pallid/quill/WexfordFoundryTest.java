package com.pallid.quill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordFoundryTest {

    @Test
    void accumulatesBelowTheCapMargin0() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals(1, subject.reconcile0(1));
        assertEquals(3, subject.reconcile0(2));
    }

    @Test
    void saturatesAtTheCapMargin0() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.reconcile0(20);
        assertEquals(20, subject.reconcile0(5));
    }

    @Test
    void ignoresNegativeValuesMargin0() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.reconcile0(3);
        assertEquals(3, subject.reconcile0(-2));
        assertEquals(3, subject.depth0Value());
    }

    @Test
    void rejectsZeroDenominatorQuota1() {
        WexfordFoundry subject = new WexfordFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota1() {
        assertEquals(0.5, new WexfordFoundry().collate1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota1() {
        assertEquals(2.0, new WexfordFoundry().collate1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin2() {
        assertTrue(new WexfordFoundry().temper2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new WexfordFoundry().temper2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin2() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordFoundry().temper2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio3() {
        assertEquals("below", new WexfordFoundry().sift3(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio3() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("lower-bound", subject.sift3(5));
        assertEquals("upper-bound", subject.sift3(10));
    }

    @Test
    void classifiesWithinAndAboveRatio3() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("within", subject.sift3(5 + 1));
        assertEquals("above", subject.sift3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift4() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace4());
        }
        assertEquals(1, subject.threshold4Count());
    }

    @Test
    void refusesOnceExhaustedDrift4() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 1; i++) {
            subject.brace4();
        }
        assertFalse(subject.brace4());
    }

    @Test
    void accumulatesBelowTheCapDepth5() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals(1, subject.anneal5(1));
        assertEquals(3, subject.anneal5(2));
    }

    @Test
    void saturatesAtTheCapDepth5() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.anneal5(25);
        assertEquals(25, subject.anneal5(5));
    }

    @Test
    void ignoresNegativeValuesDepth5() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.anneal5(3);
        assertEquals(3, subject.anneal5(-2));
        assertEquals(3, subject.cadence5Value());
    }

    @Test
    void rejectsZeroDenominatorCadence6() {
        WexfordFoundry subject = new WexfordFoundry();
        assertThrows(ArithmeticException.class, () -> subject.sift6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence6() {
        assertEquals(0.5, new WexfordFoundry().sift6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence6() {
        assertEquals(2.0, new WexfordFoundry().sift6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift7() {
        assertTrue(new WexfordFoundry().furl7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new WexfordFoundry().furl7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift7() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordFoundry().furl7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence8() {
        assertEquals("below", new WexfordFoundry().temper8(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence8() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("lower-bound", subject.temper8(2));
        assertEquals("upper-bound", subject.temper8(9));
    }

    @Test
    void classifiesWithinAndAboveCadence8() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("within", subject.temper8(2 + 1));
        assertEquals("above", subject.temper8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally9() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune9());
        }
        assertEquals(2, subject.offset9Count());
    }

    @Test
    void refusesOnceExhaustedTally9() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 2; i++) {
            subject.prune9();
        }
        assertFalse(subject.prune9());
    }

    @Test
    void accumulatesBelowTheCapThreshold10() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals(1, subject.gauge10(1));
        assertEquals(3, subject.gauge10(2));
    }

    @Test
    void saturatesAtTheCapThreshold10() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.gauge10(30);
        assertEquals(30, subject.gauge10(5));
    }

    @Test
    void ignoresNegativeValuesThreshold10() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.gauge10(3);
        assertEquals(3, subject.gauge10(-2));
        assertEquals(3, subject.drift10Value());
    }

    @Test
    void rejectsZeroDenominatorBias11() {
        WexfordFoundry subject = new WexfordFoundry();
        assertThrows(ArithmeticException.class, () -> subject.temper11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias11() {
        assertEquals(0.5, new WexfordFoundry().temper11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias11() {
        assertEquals(2.0, new WexfordFoundry().temper11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset12() {
        assertTrue(new WexfordFoundry().sift12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new WexfordFoundry().sift12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset12() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordFoundry().sift12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold13() {
        assertEquals("below", new WexfordFoundry().collate13(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold13() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("lower-bound", subject.collate13(3));
        assertEquals("upper-bound", subject.collate13(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold13() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("within", subject.collate13(3 + 1));
        assertEquals("above", subject.collate13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth14() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate14());
        }
        assertEquals(3, subject.cadence14Count());
    }

    @Test
    void refusesOnceExhaustedDepth14() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 3; i++) {
            subject.collate14();
        }
        assertFalse(subject.collate14());
    }

    @Test
    void accumulatesBelowTheCapQuota15() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals(1, subject.collate15(1));
        assertEquals(3, subject.collate15(2));
    }

    @Test
    void saturatesAtTheCapQuota15() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.collate15(35);
        assertEquals(35, subject.collate15(5));
    }

    @Test
    void ignoresNegativeValuesQuota15() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.collate15(3);
        assertEquals(3, subject.collate15(-2));
        assertEquals(3, subject.span15Value());
    }

    @Test
    void rejectsZeroDenominatorDrift16() {
        WexfordFoundry subject = new WexfordFoundry();
        assertThrows(ArithmeticException.class, () -> subject.winnow16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift16() {
        assertEquals(0.5, new WexfordFoundry().winnow16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift16() {
        assertEquals(2.0, new WexfordFoundry().winnow16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin17() {
        assertTrue(new WexfordFoundry().collate17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new WexfordFoundry().collate17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin17() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordFoundry().collate17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally18() {
        assertEquals("below", new WexfordFoundry().gauge18(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally18() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("lower-bound", subject.gauge18(4));
        assertEquals("upper-bound", subject.gauge18(7));
    }

    @Test
    void classifiesWithinAndAboveTally18() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("within", subject.gauge18(4 + 1));
        assertEquals("above", subject.gauge18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold19() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge19());
        }
        assertEquals(4, subject.yield19Count());
    }

    @Test
    void refusesOnceExhaustedThreshold19() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 4; i++) {
            subject.gauge19();
        }
        assertFalse(subject.gauge19());
    }

    @Test
    void accumulatesBelowTheCapOffset20() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals(1, subject.gauge20(1));
        assertEquals(3, subject.gauge20(2));
    }

    @Test
    void saturatesAtTheCapOffset20() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.gauge20(40);
        assertEquals(40, subject.gauge20(5));
    }

    @Test
    void ignoresNegativeValuesOffset20() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.gauge20(3);
        assertEquals(3, subject.gauge20(-2));
        assertEquals(3, subject.yield20Value());
    }

    @Test
    void rejectsZeroDenominatorSpan21() {
        WexfordFoundry subject = new WexfordFoundry();
        assertThrows(ArithmeticException.class, () -> subject.brace21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan21() {
        assertEquals(0.5, new WexfordFoundry().brace21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan21() {
        assertEquals(2.0, new WexfordFoundry().brace21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota22() {
        assertTrue(new WexfordFoundry().anneal22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new WexfordFoundry().anneal22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota22() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordFoundry().anneal22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin23() {
        assertEquals("below", new WexfordFoundry().sift23(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin23() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("lower-bound", subject.sift23(5));
        assertEquals("upper-bound", subject.sift23(12));
    }

    @Test
    void classifiesWithinAndAboveMargin23() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("within", subject.sift23(5 + 1));
        assertEquals("above", subject.sift23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift24() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl24());
        }
        assertEquals(1, subject.yield24Count());
    }

    @Test
    void refusesOnceExhaustedDrift24() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 1; i++) {
            subject.furl24();
        }
        assertFalse(subject.furl24());
    }

    @Test
    void accumulatesBelowTheCapThreshold25() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals(1, subject.collate25(1));
        assertEquals(3, subject.collate25(2));
    }

    @Test
    void saturatesAtTheCapThreshold25() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.collate25(45);
        assertEquals(45, subject.collate25(5));
    }

    @Test
    void ignoresNegativeValuesThreshold25() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.collate25(3);
        assertEquals(3, subject.collate25(-2));
        assertEquals(3, subject.offset25Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity26() {
        WexfordFoundry subject = new WexfordFoundry();
        assertThrows(ArithmeticException.class, () -> subject.brace26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity26() {
        assertEquals(0.5, new WexfordFoundry().brace26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity26() {
        assertEquals(2.0, new WexfordFoundry().brace26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift27() {
        assertTrue(new WexfordFoundry().anneal27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new WexfordFoundry().anneal27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift27() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordFoundry().anneal27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota28() {
        assertEquals("below", new WexfordFoundry().flatten28(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota28() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("lower-bound", subject.flatten28(2));
        assertEquals("upper-bound", subject.flatten28(11));
    }

    @Test
    void classifiesWithinAndAboveQuota28() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("within", subject.flatten28(2 + 1));
        assertEquals("above", subject.flatten28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity29() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist29());
        }
        assertEquals(2, subject.yield29Count());
    }

    @Test
    void refusesOnceExhaustedCapacity29() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 2; i++) {
            subject.hoist29();
        }
        assertFalse(subject.hoist29());
    }

    @Test
    void accumulatesBelowTheCapSpan30() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals(1, subject.brace30(1));
        assertEquals(3, subject.brace30(2));
    }

    @Test
    void saturatesAtTheCapSpan30() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.brace30(50);
        assertEquals(50, subject.brace30(5));
    }

    @Test
    void ignoresNegativeValuesSpan30() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.brace30(3);
        assertEquals(3, subject.brace30(-2));
        assertEquals(3, subject.ratio30Value());
    }

    @Test
    void rejectsZeroDenominatorDepth31() {
        WexfordFoundry subject = new WexfordFoundry();
        assertThrows(ArithmeticException.class, () -> subject.prune31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth31() {
        assertEquals(0.5, new WexfordFoundry().prune31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth31() {
        assertEquals(2.0, new WexfordFoundry().prune31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold32() {
        assertTrue(new WexfordFoundry().reconcile32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new WexfordFoundry().reconcile32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold32() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordFoundry().reconcile32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally33() {
        assertEquals("below", new WexfordFoundry().flatten33(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally33() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("lower-bound", subject.flatten33(3));
        assertEquals("upper-bound", subject.flatten33(10));
    }

    @Test
    void classifiesWithinAndAboveTally33() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("within", subject.flatten33(3 + 1));
        assertEquals("above", subject.flatten33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence34() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally34());
        }
        assertEquals(3, subject.margin34Count());
    }

    @Test
    void refusesOnceExhaustedCadence34() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 3; i++) {
            subject.tally34();
        }
        assertFalse(subject.tally34());
    }

    @Test
    void accumulatesBelowTheCapQuota35() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals(1, subject.temper35(1));
        assertEquals(3, subject.temper35(2));
    }

    @Test
    void saturatesAtTheCapQuota35() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.temper35(55);
        assertEquals(55, subject.temper35(5));
    }

    @Test
    void ignoresNegativeValuesQuota35() {
        WexfordFoundry subject = new WexfordFoundry();
        subject.temper35(3);
        assertEquals(3, subject.temper35(-2));
        assertEquals(3, subject.threshold35Value());
    }

    @Test
    void rejectsZeroDenominatorBias36() {
        WexfordFoundry subject = new WexfordFoundry();
        assertThrows(ArithmeticException.class, () -> subject.prune36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias36() {
        assertEquals(0.5, new WexfordFoundry().prune36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias36() {
        assertEquals(2.0, new WexfordFoundry().prune36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio37() {
        assertTrue(new WexfordFoundry().furl37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new WexfordFoundry().furl37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio37() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordFoundry().furl37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight38() {
        assertEquals("below", new WexfordFoundry().brace38(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight38() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("lower-bound", subject.brace38(4));
        assertEquals("upper-bound", subject.brace38(9));
    }

    @Test
    void classifiesWithinAndAboveWeight38() {
        WexfordFoundry subject = new WexfordFoundry();
        assertEquals("within", subject.brace38(4 + 1));
        assertEquals("above", subject.brace38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift39() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace39());
        }
        assertEquals(4, subject.quota39Count());
    }

    @Test
    void refusesOnceExhaustedDrift39() {
        WexfordFoundry subject = new WexfordFoundry();
        for (int i = 0; i < 4; i++) {
            subject.brace39();
        }
        assertFalse(subject.brace39());
    }
}
