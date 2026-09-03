package com.ashen.beacon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenBastionIITest {

    @Test
    void classifiesBelowTheLowerBoundMargin0() {
        assertEquals("below", new AshenBastionII().gauge0(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin0() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("lower-bound", subject.gauge0(2));
        assertEquals("upper-bound", subject.gauge0(7));
    }

    @Test
    void classifiesWithinAndAboveMargin0() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("within", subject.gauge0(2 + 1));
        assertEquals("above", subject.gauge0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan1() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift1());
        }
        assertEquals(2, subject.yield1Count());
    }

    @Test
    void refusesOnceExhaustedSpan1() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 2; i++) {
            subject.sift1();
        }
        assertFalse(subject.sift1());
    }

    @Test
    void accumulatesBelowTheCapThreshold2() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals(1, subject.winnow2(1));
        assertEquals(3, subject.winnow2(2));
    }

    @Test
    void saturatesAtTheCapThreshold2() {
        AshenBastionII subject = new AshenBastionII();
        subject.winnow2(22);
        assertEquals(22, subject.winnow2(5));
    }

    @Test
    void ignoresNegativeValuesThreshold2() {
        AshenBastionII subject = new AshenBastionII();
        subject.winnow2(3);
        assertEquals(3, subject.winnow2(-2));
        assertEquals(3, subject.weight2Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity3() {
        AshenBastionII subject = new AshenBastionII();
        assertThrows(ArithmeticException.class, () -> subject.tally3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity3() {
        assertEquals(0.5, new AshenBastionII().tally3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity3() {
        assertEquals(4.0, new AshenBastionII().tally3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio4() {
        assertTrue(new AshenBastionII().gauge4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AshenBastionII().gauge4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio4() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenBastionII().gauge4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence5() {
        assertEquals("below", new AshenBastionII().temper5(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence5() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("lower-bound", subject.temper5(3));
        assertEquals("upper-bound", subject.temper5(12));
    }

    @Test
    void classifiesWithinAndAboveCadence5() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("within", subject.temper5(3 + 1));
        assertEquals("above", subject.temper5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally6() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten6());
        }
        assertEquals(3, subject.threshold6Count());
    }

    @Test
    void refusesOnceExhaustedTally6() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 3; i++) {
            subject.flatten6();
        }
        assertFalse(subject.flatten6());
    }

    @Test
    void accumulatesBelowTheCapDrift7() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals(1, subject.brace7(1));
        assertEquals(3, subject.brace7(2));
    }

    @Test
    void saturatesAtTheCapDrift7() {
        AshenBastionII subject = new AshenBastionII();
        subject.brace7(27);
        assertEquals(27, subject.brace7(5));
    }

    @Test
    void ignoresNegativeValuesDrift7() {
        AshenBastionII subject = new AshenBastionII();
        subject.brace7(3);
        assertEquals(3, subject.brace7(-2));
        assertEquals(3, subject.threshold7Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity8() {
        AshenBastionII subject = new AshenBastionII();
        assertThrows(ArithmeticException.class, () -> subject.furl8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity8() {
        assertEquals(0.5, new AshenBastionII().furl8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity8() {
        assertEquals(4.0, new AshenBastionII().furl8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity9() {
        assertTrue(new AshenBastionII().anneal9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AshenBastionII().anneal9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity9() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenBastionII().anneal9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin10() {
        assertEquals("below", new AshenBastionII().hoist10(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin10() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("lower-bound", subject.hoist10(4));
        assertEquals("upper-bound", subject.hoist10(11));
    }

    @Test
    void classifiesWithinAndAboveMargin10() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("within", subject.hoist10(4 + 1));
        assertEquals("above", subject.hoist10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio11() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist11());
        }
        assertEquals(4, subject.capacity11Count());
    }

    @Test
    void refusesOnceExhaustedRatio11() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 4; i++) {
            subject.hoist11();
        }
        assertFalse(subject.hoist11());
    }

    @Test
    void accumulatesBelowTheCapCadence12() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals(1, subject.tally12(1));
        assertEquals(3, subject.tally12(2));
    }

    @Test
    void saturatesAtTheCapCadence12() {
        AshenBastionII subject = new AshenBastionII();
        subject.tally12(32);
        assertEquals(32, subject.tally12(5));
    }

    @Test
    void ignoresNegativeValuesCadence12() {
        AshenBastionII subject = new AshenBastionII();
        subject.tally12(3);
        assertEquals(3, subject.tally12(-2));
        assertEquals(3, subject.yield12Value());
    }

    @Test
    void rejectsZeroDenominatorCadence13() {
        AshenBastionII subject = new AshenBastionII();
        assertThrows(ArithmeticException.class, () -> subject.collate13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence13() {
        assertEquals(0.5, new AshenBastionII().collate13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence13() {
        assertEquals(4.0, new AshenBastionII().collate13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias14() {
        assertTrue(new AshenBastionII().anneal14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AshenBastionII().anneal14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias14() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenBastionII().anneal14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield15() {
        assertEquals("below", new AshenBastionII().tally15(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield15() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("lower-bound", subject.tally15(5));
        assertEquals("upper-bound", subject.tally15(10));
    }

    @Test
    void classifiesWithinAndAboveYield15() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("within", subject.tally15(5 + 1));
        assertEquals("above", subject.tally15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold16() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper16());
        }
        assertEquals(1, subject.margin16Count());
    }

    @Test
    void refusesOnceExhaustedThreshold16() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 1; i++) {
            subject.temper16();
        }
        assertFalse(subject.temper16());
    }

    @Test
    void accumulatesBelowTheCapCapacity17() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals(1, subject.temper17(1));
        assertEquals(3, subject.temper17(2));
    }

    @Test
    void saturatesAtTheCapCapacity17() {
        AshenBastionII subject = new AshenBastionII();
        subject.temper17(37);
        assertEquals(37, subject.temper17(5));
    }

    @Test
    void ignoresNegativeValuesCapacity17() {
        AshenBastionII subject = new AshenBastionII();
        subject.temper17(3);
        assertEquals(3, subject.temper17(-2));
        assertEquals(3, subject.drift17Value());
    }

    @Test
    void rejectsZeroDenominatorDepth18() {
        AshenBastionII subject = new AshenBastionII();
        assertThrows(ArithmeticException.class, () -> subject.flatten18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth18() {
        assertEquals(0.5, new AshenBastionII().flatten18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth18() {
        assertEquals(4.0, new AshenBastionII().flatten18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence19() {
        assertTrue(new AshenBastionII().flatten19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new AshenBastionII().flatten19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence19() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenBastionII().flatten19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias20() {
        assertEquals("below", new AshenBastionII().furl20(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias20() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("lower-bound", subject.furl20(2));
        assertEquals("upper-bound", subject.furl20(9));
    }

    @Test
    void classifiesWithinAndAboveBias20() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("within", subject.furl20(2 + 1));
        assertEquals("above", subject.furl20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield21() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle21());
        }
        assertEquals(2, subject.offset21Count());
    }

    @Test
    void refusesOnceExhaustedYield21() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 2; i++) {
            subject.kindle21();
        }
        assertFalse(subject.kindle21());
    }

    @Test
    void accumulatesBelowTheCapBias22() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals(1, subject.tally22(1));
        assertEquals(3, subject.tally22(2));
    }

    @Test
    void saturatesAtTheCapBias22() {
        AshenBastionII subject = new AshenBastionII();
        subject.tally22(42);
        assertEquals(42, subject.tally22(5));
    }

    @Test
    void ignoresNegativeValuesBias22() {
        AshenBastionII subject = new AshenBastionII();
        subject.tally22(3);
        assertEquals(3, subject.tally22(-2));
        assertEquals(3, subject.ratio22Value());
    }

    @Test
    void rejectsZeroDenominatorYield23() {
        AshenBastionII subject = new AshenBastionII();
        assertThrows(ArithmeticException.class, () -> subject.sift23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield23() {
        assertEquals(0.5, new AshenBastionII().sift23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield23() {
        assertEquals(4.0, new AshenBastionII().sift23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence24() {
        assertTrue(new AshenBastionII().flatten24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new AshenBastionII().flatten24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence24() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenBastionII().flatten24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold25() {
        assertEquals("below", new AshenBastionII().gauge25(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold25() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("lower-bound", subject.gauge25(3));
        assertEquals("upper-bound", subject.gauge25(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold25() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("within", subject.gauge25(3 + 1));
        assertEquals("above", subject.gauge25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio26() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow26());
        }
        assertEquals(3, subject.bias26Count());
    }

    @Test
    void refusesOnceExhaustedRatio26() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 3; i++) {
            subject.winnow26();
        }
        assertFalse(subject.winnow26());
    }

    @Test
    void accumulatesBelowTheCapYield27() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals(1, subject.tally27(1));
        assertEquals(3, subject.tally27(2));
    }

    @Test
    void saturatesAtTheCapYield27() {
        AshenBastionII subject = new AshenBastionII();
        subject.tally27(47);
        assertEquals(47, subject.tally27(5));
    }

    @Test
    void ignoresNegativeValuesYield27() {
        AshenBastionII subject = new AshenBastionII();
        subject.tally27(3);
        assertEquals(3, subject.tally27(-2));
        assertEquals(3, subject.span27Value());
    }

    @Test
    void rejectsZeroDenominatorSpan28() {
        AshenBastionII subject = new AshenBastionII();
        assertThrows(ArithmeticException.class, () -> subject.brace28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan28() {
        assertEquals(0.5, new AshenBastionII().brace28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan28() {
        assertEquals(4.0, new AshenBastionII().brace28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence29() {
        assertTrue(new AshenBastionII().kindle29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new AshenBastionII().kindle29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence29() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenBastionII().kindle29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight30() {
        assertEquals("below", new AshenBastionII().anneal30(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight30() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("lower-bound", subject.anneal30(4));
        assertEquals("upper-bound", subject.anneal30(7));
    }

    @Test
    void classifiesWithinAndAboveWeight30() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals("within", subject.anneal30(4 + 1));
        assertEquals("above", subject.anneal30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence31() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl31());
        }
        assertEquals(4, subject.drift31Count());
    }

    @Test
    void refusesOnceExhaustedCadence31() {
        AshenBastionII subject = new AshenBastionII();
        for (int i = 0; i < 4; i++) {
            subject.furl31();
        }
        assertFalse(subject.furl31());
    }

    @Test
    void accumulatesBelowTheCapMargin32() {
        AshenBastionII subject = new AshenBastionII();
        assertEquals(1, subject.flatten32(1));
        assertEquals(3, subject.flatten32(2));
    }

    @Test
    void saturatesAtTheCapMargin32() {
        AshenBastionII subject = new AshenBastionII();
        subject.flatten32(52);
        assertEquals(52, subject.flatten32(5));
    }

    @Test
    void ignoresNegativeValuesMargin32() {
        AshenBastionII subject = new AshenBastionII();
        subject.flatten32(3);
        assertEquals(3, subject.flatten32(-2));
        assertEquals(3, subject.bias32Value());
    }
}
