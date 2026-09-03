package com.ochre.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenFurrowIITest {

    @Test
    void accumulatesBelowTheCapRatio0() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals(1, subject.kindle0(1));
        assertEquals(3, subject.kindle0(2));
    }

    @Test
    void saturatesAtTheCapRatio0() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.kindle0(20);
        assertEquals(20, subject.kindle0(5));
    }

    @Test
    void ignoresNegativeValuesRatio0() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.kindle0(3);
        assertEquals(3, subject.kindle0(-2));
        assertEquals(3, subject.weight0Value());
    }

    @Test
    void rejectsZeroDenominatorYield1() {
        AshenFurrowII subject = new AshenFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.temper1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield1() {
        assertEquals(0.5, new AshenFurrowII().temper1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield1() {
        assertEquals(2.0, new AshenFurrowII().temper1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence2() {
        assertTrue(new AshenFurrowII().anneal2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AshenFurrowII().anneal2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence2() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenFurrowII().anneal2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence3() {
        assertEquals("below", new AshenFurrowII().reconcile3(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence3() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("lower-bound", subject.reconcile3(5));
        assertEquals("upper-bound", subject.reconcile3(10));
    }

    @Test
    void classifiesWithinAndAboveCadence3() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("within", subject.reconcile3(5 + 1));
        assertEquals("above", subject.reconcile3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence4() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune4());
        }
        assertEquals(1, subject.capacity4Count());
    }

    @Test
    void refusesOnceExhaustedCadence4() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 1; i++) {
            subject.prune4();
        }
        assertFalse(subject.prune4());
    }

    @Test
    void accumulatesBelowTheCapMargin5() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals(1, subject.sift5(1));
        assertEquals(3, subject.sift5(2));
    }

    @Test
    void saturatesAtTheCapMargin5() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.sift5(25);
        assertEquals(25, subject.sift5(5));
    }

    @Test
    void ignoresNegativeValuesMargin5() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.sift5(3);
        assertEquals(3, subject.sift5(-2));
        assertEquals(3, subject.ratio5Value());
    }

    @Test
    void rejectsZeroDenominatorBias6() {
        AshenFurrowII subject = new AshenFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.temper6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias6() {
        assertEquals(0.5, new AshenFurrowII().temper6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias6() {
        assertEquals(2.0, new AshenFurrowII().temper6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset7() {
        assertTrue(new AshenFurrowII().hoist7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AshenFurrowII().hoist7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset7() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenFurrowII().hoist7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth8() {
        assertEquals("below", new AshenFurrowII().sift8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth8() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("lower-bound", subject.sift8(2));
        assertEquals("upper-bound", subject.sift8(9));
    }

    @Test
    void classifiesWithinAndAboveDepth8() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("within", subject.sift8(2 + 1));
        assertEquals("above", subject.sift8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift9() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl9());
        }
        assertEquals(2, subject.margin9Count());
    }

    @Test
    void refusesOnceExhaustedDrift9() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 2; i++) {
            subject.furl9();
        }
        assertFalse(subject.furl9());
    }

    @Test
    void accumulatesBelowTheCapWeight10() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals(1, subject.anneal10(1));
        assertEquals(3, subject.anneal10(2));
    }

    @Test
    void saturatesAtTheCapWeight10() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.anneal10(30);
        assertEquals(30, subject.anneal10(5));
    }

    @Test
    void ignoresNegativeValuesWeight10() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.anneal10(3);
        assertEquals(3, subject.anneal10(-2));
        assertEquals(3, subject.span10Value());
    }

    @Test
    void rejectsZeroDenominatorBias11() {
        AshenFurrowII subject = new AshenFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.tally11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias11() {
        assertEquals(0.5, new AshenFurrowII().tally11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias11() {
        assertEquals(2.0, new AshenFurrowII().tally11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield12() {
        assertTrue(new AshenFurrowII().collate12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AshenFurrowII().collate12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield12() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenFurrowII().collate12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight13() {
        assertEquals("below", new AshenFurrowII().furl13(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight13() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("lower-bound", subject.furl13(3));
        assertEquals("upper-bound", subject.furl13(8));
    }

    @Test
    void classifiesWithinAndAboveWeight13() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("within", subject.furl13(3 + 1));
        assertEquals("above", subject.furl13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth14() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten14());
        }
        assertEquals(3, subject.capacity14Count());
    }

    @Test
    void refusesOnceExhaustedDepth14() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 3; i++) {
            subject.flatten14();
        }
        assertFalse(subject.flatten14());
    }

    @Test
    void accumulatesBelowTheCapBias15() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals(1, subject.kindle15(1));
        assertEquals(3, subject.kindle15(2));
    }

    @Test
    void saturatesAtTheCapBias15() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.kindle15(35);
        assertEquals(35, subject.kindle15(5));
    }

    @Test
    void ignoresNegativeValuesBias15() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.kindle15(3);
        assertEquals(3, subject.kindle15(-2));
        assertEquals(3, subject.margin15Value());
    }

    @Test
    void rejectsZeroDenominatorSpan16() {
        AshenFurrowII subject = new AshenFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.hoist16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan16() {
        assertEquals(0.5, new AshenFurrowII().hoist16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan16() {
        assertEquals(2.0, new AshenFurrowII().hoist16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence17() {
        assertTrue(new AshenFurrowII().collate17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AshenFurrowII().collate17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence17() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenFurrowII().collate17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth18() {
        assertEquals("below", new AshenFurrowII().temper18(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth18() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("lower-bound", subject.temper18(4));
        assertEquals("upper-bound", subject.temper18(7));
    }

    @Test
    void classifiesWithinAndAboveDepth18() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("within", subject.temper18(4 + 1));
        assertEquals("above", subject.temper18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset19() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist19());
        }
        assertEquals(4, subject.quota19Count());
    }

    @Test
    void refusesOnceExhaustedOffset19() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 4; i++) {
            subject.hoist19();
        }
        assertFalse(subject.hoist19());
    }

    @Test
    void accumulatesBelowTheCapQuota20() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals(1, subject.flatten20(1));
        assertEquals(3, subject.flatten20(2));
    }

    @Test
    void saturatesAtTheCapQuota20() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.flatten20(40);
        assertEquals(40, subject.flatten20(5));
    }

    @Test
    void ignoresNegativeValuesQuota20() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.flatten20(3);
        assertEquals(3, subject.flatten20(-2));
        assertEquals(3, subject.weight20Value());
    }

    @Test
    void rejectsZeroDenominatorRatio21() {
        AshenFurrowII subject = new AshenFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.brace21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio21() {
        assertEquals(0.5, new AshenFurrowII().brace21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio21() {
        assertEquals(2.0, new AshenFurrowII().brace21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift22() {
        assertTrue(new AshenFurrowII().gauge22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new AshenFurrowII().gauge22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift22() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenFurrowII().gauge22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity23() {
        assertEquals("below", new AshenFurrowII().temper23(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity23() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("lower-bound", subject.temper23(5));
        assertEquals("upper-bound", subject.temper23(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity23() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("within", subject.temper23(5 + 1));
        assertEquals("above", subject.temper23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota24() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper24());
        }
        assertEquals(1, subject.depth24Count());
    }

    @Test
    void refusesOnceExhaustedQuota24() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 1; i++) {
            subject.temper24();
        }
        assertFalse(subject.temper24());
    }

    @Test
    void accumulatesBelowTheCapMargin25() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals(1, subject.brace25(1));
        assertEquals(3, subject.brace25(2));
    }

    @Test
    void saturatesAtTheCapMargin25() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.brace25(45);
        assertEquals(45, subject.brace25(5));
    }

    @Test
    void ignoresNegativeValuesMargin25() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.brace25(3);
        assertEquals(3, subject.brace25(-2));
        assertEquals(3, subject.bias25Value());
    }

    @Test
    void rejectsZeroDenominatorDepth26() {
        AshenFurrowII subject = new AshenFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.furl26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth26() {
        assertEquals(0.5, new AshenFurrowII().furl26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth26() {
        assertEquals(2.0, new AshenFurrowII().furl26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield27() {
        assertTrue(new AshenFurrowII().reconcile27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new AshenFurrowII().reconcile27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield27() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenFurrowII().reconcile27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold28() {
        assertEquals("below", new AshenFurrowII().sift28(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold28() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("lower-bound", subject.sift28(2));
        assertEquals("upper-bound", subject.sift28(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold28() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("within", subject.sift28(2 + 1));
        assertEquals("above", subject.sift28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin29() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally29());
        }
        assertEquals(2, subject.threshold29Count());
    }

    @Test
    void refusesOnceExhaustedMargin29() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 2; i++) {
            subject.tally29();
        }
        assertFalse(subject.tally29());
    }

    @Test
    void accumulatesBelowTheCapBias30() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals(1, subject.brace30(1));
        assertEquals(3, subject.brace30(2));
    }

    @Test
    void saturatesAtTheCapBias30() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.brace30(50);
        assertEquals(50, subject.brace30(5));
    }

    @Test
    void ignoresNegativeValuesBias30() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.brace30(3);
        assertEquals(3, subject.brace30(-2));
        assertEquals(3, subject.offset30Value());
    }

    @Test
    void rejectsZeroDenominatorYield31() {
        AshenFurrowII subject = new AshenFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.prune31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield31() {
        assertEquals(0.5, new AshenFurrowII().prune31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield31() {
        assertEquals(2.0, new AshenFurrowII().prune31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight32() {
        assertTrue(new AshenFurrowII().flatten32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new AshenFurrowII().flatten32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight32() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenFurrowII().flatten32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity33() {
        assertEquals("below", new AshenFurrowII().hoist33(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity33() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("lower-bound", subject.hoist33(3));
        assertEquals("upper-bound", subject.hoist33(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity33() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("within", subject.hoist33(3 + 1));
        assertEquals("above", subject.hoist33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity34() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally34());
        }
        assertEquals(3, subject.weight34Count());
    }

    @Test
    void refusesOnceExhaustedCapacity34() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 3; i++) {
            subject.tally34();
        }
        assertFalse(subject.tally34());
    }

    @Test
    void accumulatesBelowTheCapOffset35() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals(1, subject.temper35(1));
        assertEquals(3, subject.temper35(2));
    }

    @Test
    void saturatesAtTheCapOffset35() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.temper35(55);
        assertEquals(55, subject.temper35(5));
    }

    @Test
    void ignoresNegativeValuesOffset35() {
        AshenFurrowII subject = new AshenFurrowII();
        subject.temper35(3);
        assertEquals(3, subject.temper35(-2));
        assertEquals(3, subject.weight35Value());
    }

    @Test
    void rejectsZeroDenominatorBias36() {
        AshenFurrowII subject = new AshenFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.tally36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias36() {
        assertEquals(0.5, new AshenFurrowII().tally36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias36() {
        assertEquals(2.0, new AshenFurrowII().tally36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth37() {
        assertTrue(new AshenFurrowII().furl37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new AshenFurrowII().furl37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth37() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenFurrowII().furl37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold38() {
        assertEquals("below", new AshenFurrowII().reconcile38(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold38() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("lower-bound", subject.reconcile38(4));
        assertEquals("upper-bound", subject.reconcile38(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold38() {
        AshenFurrowII subject = new AshenFurrowII();
        assertEquals("within", subject.reconcile38(4 + 1));
        assertEquals("above", subject.reconcile38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold39() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift39());
        }
        assertEquals(4, subject.bias39Count());
    }

    @Test
    void refusesOnceExhaustedThreshold39() {
        AshenFurrowII subject = new AshenFurrowII();
        for (int i = 0; i < 4; i++) {
            subject.sift39();
        }
        assertFalse(subject.sift39());
    }
}
