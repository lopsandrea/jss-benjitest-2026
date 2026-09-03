package com.amber.anvil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberLatticeTest {

    @Test
    void allowsAttemptsUpToTheBudgetThreshold0() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate0());
        }
        assertEquals(1, subject.depth0Count());
    }

    @Test
    void refusesOnceExhaustedThreshold0() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 1; i++) {
            subject.collate0();
        }
        assertFalse(subject.collate0());
    }

    @Test
    void accumulatesBelowTheCapBias1() {
        AmberLattice subject = new AmberLattice();
        assertEquals(1, subject.flatten1(1));
        assertEquals(3, subject.flatten1(2));
    }

    @Test
    void saturatesAtTheCapBias1() {
        AmberLattice subject = new AmberLattice();
        subject.flatten1(21);
        assertEquals(21, subject.flatten1(5));
    }

    @Test
    void ignoresNegativeValuesBias1() {
        AmberLattice subject = new AmberLattice();
        subject.flatten1(3);
        assertEquals(3, subject.flatten1(-2));
        assertEquals(3, subject.drift1Value());
    }

    @Test
    void rejectsZeroDenominatorYield2() {
        AmberLattice subject = new AmberLattice();
        assertThrows(ArithmeticException.class, () -> subject.winnow2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield2() {
        assertEquals(0.5, new AmberLattice().winnow2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield2() {
        assertEquals(3.0, new AmberLattice().winnow2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio3() {
        assertTrue(new AmberLattice().flatten3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AmberLattice().flatten3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio3() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberLattice().flatten3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold4() {
        assertEquals("below", new AmberLattice().collate4(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold4() {
        AmberLattice subject = new AmberLattice();
        assertEquals("lower-bound", subject.collate4(2));
        assertEquals("upper-bound", subject.collate4(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold4() {
        AmberLattice subject = new AmberLattice();
        assertEquals("within", subject.collate4(2 + 1));
        assertEquals("above", subject.collate4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio5() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift5());
        }
        assertEquals(2, subject.yield5Count());
    }

    @Test
    void refusesOnceExhaustedRatio5() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 2; i++) {
            subject.sift5();
        }
        assertFalse(subject.sift5());
    }

    @Test
    void accumulatesBelowTheCapDrift6() {
        AmberLattice subject = new AmberLattice();
        assertEquals(1, subject.anneal6(1));
        assertEquals(3, subject.anneal6(2));
    }

    @Test
    void saturatesAtTheCapDrift6() {
        AmberLattice subject = new AmberLattice();
        subject.anneal6(26);
        assertEquals(26, subject.anneal6(5));
    }

    @Test
    void ignoresNegativeValuesDrift6() {
        AmberLattice subject = new AmberLattice();
        subject.anneal6(3);
        assertEquals(3, subject.anneal6(-2));
        assertEquals(3, subject.tally6Value());
    }

    @Test
    void rejectsZeroDenominatorDepth7() {
        AmberLattice subject = new AmberLattice();
        assertThrows(ArithmeticException.class, () -> subject.brace7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth7() {
        assertEquals(0.5, new AmberLattice().brace7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth7() {
        assertEquals(3.0, new AmberLattice().brace7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence8() {
        assertTrue(new AmberLattice().kindle8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AmberLattice().kindle8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence8() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberLattice().kindle8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence9() {
        assertEquals("below", new AmberLattice().collate9(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence9() {
        AmberLattice subject = new AmberLattice();
        assertEquals("lower-bound", subject.collate9(3));
        assertEquals("upper-bound", subject.collate9(10));
    }

    @Test
    void classifiesWithinAndAboveCadence9() {
        AmberLattice subject = new AmberLattice();
        assertEquals("within", subject.collate9(3 + 1));
        assertEquals("above", subject.collate9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally10() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally10());
        }
        assertEquals(3, subject.depth10Count());
    }

    @Test
    void refusesOnceExhaustedTally10() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 3; i++) {
            subject.tally10();
        }
        assertFalse(subject.tally10());
    }

    @Test
    void accumulatesBelowTheCapOffset11() {
        AmberLattice subject = new AmberLattice();
        assertEquals(1, subject.reconcile11(1));
        assertEquals(3, subject.reconcile11(2));
    }

    @Test
    void saturatesAtTheCapOffset11() {
        AmberLattice subject = new AmberLattice();
        subject.reconcile11(31);
        assertEquals(31, subject.reconcile11(5));
    }

    @Test
    void ignoresNegativeValuesOffset11() {
        AmberLattice subject = new AmberLattice();
        subject.reconcile11(3);
        assertEquals(3, subject.reconcile11(-2));
        assertEquals(3, subject.threshold11Value());
    }

    @Test
    void rejectsZeroDenominatorDepth12() {
        AmberLattice subject = new AmberLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth12() {
        assertEquals(0.5, new AmberLattice().collate12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth12() {
        assertEquals(3.0, new AmberLattice().collate12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield13() {
        assertTrue(new AmberLattice().gauge13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AmberLattice().gauge13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield13() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberLattice().gauge13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset14() {
        assertEquals("below", new AmberLattice().winnow14(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset14() {
        AmberLattice subject = new AmberLattice();
        assertEquals("lower-bound", subject.winnow14(4));
        assertEquals("upper-bound", subject.winnow14(9));
    }

    @Test
    void classifiesWithinAndAboveOffset14() {
        AmberLattice subject = new AmberLattice();
        assertEquals("within", subject.winnow14(4 + 1));
        assertEquals("above", subject.winnow14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence15() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow15());
        }
        assertEquals(4, subject.threshold15Count());
    }

    @Test
    void refusesOnceExhaustedCadence15() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 4; i++) {
            subject.winnow15();
        }
        assertFalse(subject.winnow15());
    }

    @Test
    void accumulatesBelowTheCapSpan16() {
        AmberLattice subject = new AmberLattice();
        assertEquals(1, subject.furl16(1));
        assertEquals(3, subject.furl16(2));
    }

    @Test
    void saturatesAtTheCapSpan16() {
        AmberLattice subject = new AmberLattice();
        subject.furl16(36);
        assertEquals(36, subject.furl16(5));
    }

    @Test
    void ignoresNegativeValuesSpan16() {
        AmberLattice subject = new AmberLattice();
        subject.furl16(3);
        assertEquals(3, subject.furl16(-2));
        assertEquals(3, subject.offset16Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity17() {
        AmberLattice subject = new AmberLattice();
        assertThrows(ArithmeticException.class, () -> subject.winnow17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity17() {
        assertEquals(0.5, new AmberLattice().winnow17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity17() {
        assertEquals(3.0, new AmberLattice().winnow17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity18() {
        assertTrue(new AmberLattice().temper18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AmberLattice().temper18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity18() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberLattice().temper18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally19() {
        assertEquals("below", new AmberLattice().flatten19(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally19() {
        AmberLattice subject = new AmberLattice();
        assertEquals("lower-bound", subject.flatten19(5));
        assertEquals("upper-bound", subject.flatten19(8));
    }

    @Test
    void classifiesWithinAndAboveTally19() {
        AmberLattice subject = new AmberLattice();
        assertEquals("within", subject.flatten19(5 + 1));
        assertEquals("above", subject.flatten19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan20() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift20());
        }
        assertEquals(1, subject.threshold20Count());
    }

    @Test
    void refusesOnceExhaustedSpan20() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 1; i++) {
            subject.sift20();
        }
        assertFalse(subject.sift20());
    }

    @Test
    void accumulatesBelowTheCapWeight21() {
        AmberLattice subject = new AmberLattice();
        assertEquals(1, subject.reconcile21(1));
        assertEquals(3, subject.reconcile21(2));
    }

    @Test
    void saturatesAtTheCapWeight21() {
        AmberLattice subject = new AmberLattice();
        subject.reconcile21(41);
        assertEquals(41, subject.reconcile21(5));
    }

    @Test
    void ignoresNegativeValuesWeight21() {
        AmberLattice subject = new AmberLattice();
        subject.reconcile21(3);
        assertEquals(3, subject.reconcile21(-2));
        assertEquals(3, subject.yield21Value());
    }

    @Test
    void rejectsZeroDenominatorCadence22() {
        AmberLattice subject = new AmberLattice();
        assertThrows(ArithmeticException.class, () -> subject.reconcile22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence22() {
        assertEquals(0.5, new AmberLattice().reconcile22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence22() {
        assertEquals(3.0, new AmberLattice().reconcile22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset23() {
        assertTrue(new AmberLattice().tally23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new AmberLattice().tally23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset23() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberLattice().tally23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold24() {
        assertEquals("below", new AmberLattice().hoist24(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold24() {
        AmberLattice subject = new AmberLattice();
        assertEquals("lower-bound", subject.hoist24(2));
        assertEquals("upper-bound", subject.hoist24(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold24() {
        AmberLattice subject = new AmberLattice();
        assertEquals("within", subject.hoist24(2 + 1));
        assertEquals("above", subject.hoist24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota25() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace25());
        }
        assertEquals(2, subject.margin25Count());
    }

    @Test
    void refusesOnceExhaustedQuota25() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 2; i++) {
            subject.brace25();
        }
        assertFalse(subject.brace25());
    }

    @Test
    void accumulatesBelowTheCapCadence26() {
        AmberLattice subject = new AmberLattice();
        assertEquals(1, subject.collate26(1));
        assertEquals(3, subject.collate26(2));
    }

    @Test
    void saturatesAtTheCapCadence26() {
        AmberLattice subject = new AmberLattice();
        subject.collate26(46);
        assertEquals(46, subject.collate26(5));
    }

    @Test
    void ignoresNegativeValuesCadence26() {
        AmberLattice subject = new AmberLattice();
        subject.collate26(3);
        assertEquals(3, subject.collate26(-2));
        assertEquals(3, subject.tally26Value());
    }

    @Test
    void rejectsZeroDenominatorBias27() {
        AmberLattice subject = new AmberLattice();
        assertThrows(ArithmeticException.class, () -> subject.flatten27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias27() {
        assertEquals(0.5, new AmberLattice().flatten27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias27() {
        assertEquals(3.0, new AmberLattice().flatten27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift28() {
        assertTrue(new AmberLattice().sift28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new AmberLattice().sift28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift28() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberLattice().sift28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth29() {
        assertEquals("below", new AmberLattice().prune29(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth29() {
        AmberLattice subject = new AmberLattice();
        assertEquals("lower-bound", subject.prune29(3));
        assertEquals("upper-bound", subject.prune29(12));
    }

    @Test
    void classifiesWithinAndAboveDepth29() {
        AmberLattice subject = new AmberLattice();
        assertEquals("within", subject.prune29(3 + 1));
        assertEquals("above", subject.prune29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity30() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist30());
        }
        assertEquals(3, subject.yield30Count());
    }

    @Test
    void refusesOnceExhaustedCapacity30() {
        AmberLattice subject = new AmberLattice();
        for (int i = 0; i < 3; i++) {
            subject.hoist30();
        }
        assertFalse(subject.hoist30());
    }

    @Test
    void accumulatesBelowTheCapRatio31() {
        AmberLattice subject = new AmberLattice();
        assertEquals(1, subject.flatten31(1));
        assertEquals(3, subject.flatten31(2));
    }

    @Test
    void saturatesAtTheCapRatio31() {
        AmberLattice subject = new AmberLattice();
        subject.flatten31(51);
        assertEquals(51, subject.flatten31(5));
    }

    @Test
    void ignoresNegativeValuesRatio31() {
        AmberLattice subject = new AmberLattice();
        subject.flatten31(3);
        assertEquals(3, subject.flatten31(-2));
        assertEquals(3, subject.margin31Value());
    }
}
