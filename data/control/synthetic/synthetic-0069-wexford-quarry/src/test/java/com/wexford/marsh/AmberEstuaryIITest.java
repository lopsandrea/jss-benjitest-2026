package com.wexford.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberEstuaryIITest {

    @Test
    void allowsAttemptsUpToTheBudgetSpan0() {
        AmberEstuaryII subject = new AmberEstuaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow0());
        }
        assertEquals(1, subject.quota0Count());
    }

    @Test
    void refusesOnceExhaustedSpan0() {
        AmberEstuaryII subject = new AmberEstuaryII();
        for (int i = 0; i < 1; i++) {
            subject.winnow0();
        }
        assertFalse(subject.winnow0());
    }

    @Test
    void accumulatesBelowTheCapBias1() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals(1, subject.reconcile1(1));
        assertEquals(3, subject.reconcile1(2));
    }

    @Test
    void saturatesAtTheCapBias1() {
        AmberEstuaryII subject = new AmberEstuaryII();
        subject.reconcile1(21);
        assertEquals(21, subject.reconcile1(5));
    }

    @Test
    void ignoresNegativeValuesBias1() {
        AmberEstuaryII subject = new AmberEstuaryII();
        subject.reconcile1(3);
        assertEquals(3, subject.reconcile1(-2));
        assertEquals(3, subject.threshold1Value());
    }

    @Test
    void rejectsZeroDenominatorQuota2() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.sift2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota2() {
        assertEquals(0.5, new AmberEstuaryII().sift2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota2() {
        assertEquals(3.0, new AmberEstuaryII().sift2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity3() {
        assertTrue(new AmberEstuaryII().winnow3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AmberEstuaryII().winnow3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity3() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberEstuaryII().winnow3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift4() {
        assertEquals("below", new AmberEstuaryII().reconcile4(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift4() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals("lower-bound", subject.reconcile4(2));
        assertEquals("upper-bound", subject.reconcile4(11));
    }

    @Test
    void classifiesWithinAndAboveDrift4() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals("within", subject.reconcile4(2 + 1));
        assertEquals("above", subject.reconcile4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold5() {
        AmberEstuaryII subject = new AmberEstuaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace5());
        }
        assertEquals(2, subject.drift5Count());
    }

    @Test
    void refusesOnceExhaustedThreshold5() {
        AmberEstuaryII subject = new AmberEstuaryII();
        for (int i = 0; i < 2; i++) {
            subject.brace5();
        }
        assertFalse(subject.brace5());
    }

    @Test
    void accumulatesBelowTheCapWeight6() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals(1, subject.sift6(1));
        assertEquals(3, subject.sift6(2));
    }

    @Test
    void saturatesAtTheCapWeight6() {
        AmberEstuaryII subject = new AmberEstuaryII();
        subject.sift6(26);
        assertEquals(26, subject.sift6(5));
    }

    @Test
    void ignoresNegativeValuesWeight6() {
        AmberEstuaryII subject = new AmberEstuaryII();
        subject.sift6(3);
        assertEquals(3, subject.sift6(-2));
        assertEquals(3, subject.ratio6Value());
    }

    @Test
    void rejectsZeroDenominatorBias7() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias7() {
        assertEquals(0.5, new AmberEstuaryII().hoist7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias7() {
        assertEquals(3.0, new AmberEstuaryII().hoist7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold8() {
        assertTrue(new AmberEstuaryII().kindle8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AmberEstuaryII().kindle8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold8() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberEstuaryII().kindle8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence9() {
        assertEquals("below", new AmberEstuaryII().prune9(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence9() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals("lower-bound", subject.prune9(3));
        assertEquals("upper-bound", subject.prune9(10));
    }

    @Test
    void classifiesWithinAndAboveCadence9() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals("within", subject.prune9(3 + 1));
        assertEquals("above", subject.prune9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan10() {
        AmberEstuaryII subject = new AmberEstuaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist10());
        }
        assertEquals(3, subject.cadence10Count());
    }

    @Test
    void refusesOnceExhaustedSpan10() {
        AmberEstuaryII subject = new AmberEstuaryII();
        for (int i = 0; i < 3; i++) {
            subject.hoist10();
        }
        assertFalse(subject.hoist10());
    }

    @Test
    void accumulatesBelowTheCapMargin11() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals(1, subject.collate11(1));
        assertEquals(3, subject.collate11(2));
    }

    @Test
    void saturatesAtTheCapMargin11() {
        AmberEstuaryII subject = new AmberEstuaryII();
        subject.collate11(31);
        assertEquals(31, subject.collate11(5));
    }

    @Test
    void ignoresNegativeValuesMargin11() {
        AmberEstuaryII subject = new AmberEstuaryII();
        subject.collate11(3);
        assertEquals(3, subject.collate11(-2));
        assertEquals(3, subject.weight11Value());
    }

    @Test
    void rejectsZeroDenominatorTally12() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally12() {
        assertEquals(0.5, new AmberEstuaryII().reconcile12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally12() {
        assertEquals(3.0, new AmberEstuaryII().reconcile12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally13() {
        assertTrue(new AmberEstuaryII().temper13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AmberEstuaryII().temper13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally13() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberEstuaryII().temper13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold14() {
        assertEquals("below", new AmberEstuaryII().kindle14(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold14() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals("lower-bound", subject.kindle14(4));
        assertEquals("upper-bound", subject.kindle14(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold14() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals("within", subject.kindle14(4 + 1));
        assertEquals("above", subject.kindle14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift15() {
        AmberEstuaryII subject = new AmberEstuaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper15());
        }
        assertEquals(4, subject.yield15Count());
    }

    @Test
    void refusesOnceExhaustedDrift15() {
        AmberEstuaryII subject = new AmberEstuaryII();
        for (int i = 0; i < 4; i++) {
            subject.temper15();
        }
        assertFalse(subject.temper15());
    }

    @Test
    void accumulatesBelowTheCapThreshold16() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals(1, subject.gauge16(1));
        assertEquals(3, subject.gauge16(2));
    }

    @Test
    void saturatesAtTheCapThreshold16() {
        AmberEstuaryII subject = new AmberEstuaryII();
        subject.gauge16(36);
        assertEquals(36, subject.gauge16(5));
    }

    @Test
    void ignoresNegativeValuesThreshold16() {
        AmberEstuaryII subject = new AmberEstuaryII();
        subject.gauge16(3);
        assertEquals(3, subject.gauge16(-2));
        assertEquals(3, subject.drift16Value());
    }

    @Test
    void rejectsZeroDenominatorBias17() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.tally17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias17() {
        assertEquals(0.5, new AmberEstuaryII().tally17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias17() {
        assertEquals(3.0, new AmberEstuaryII().tally17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold18() {
        assertTrue(new AmberEstuaryII().flatten18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AmberEstuaryII().flatten18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold18() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberEstuaryII().flatten18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset19() {
        assertEquals("below", new AmberEstuaryII().collate19(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset19() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals("lower-bound", subject.collate19(5));
        assertEquals("upper-bound", subject.collate19(8));
    }

    @Test
    void classifiesWithinAndAboveOffset19() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals("within", subject.collate19(5 + 1));
        assertEquals("above", subject.collate19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight20() {
        AmberEstuaryII subject = new AmberEstuaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow20());
        }
        assertEquals(1, subject.depth20Count());
    }

    @Test
    void refusesOnceExhaustedWeight20() {
        AmberEstuaryII subject = new AmberEstuaryII();
        for (int i = 0; i < 1; i++) {
            subject.winnow20();
        }
        assertFalse(subject.winnow20());
    }

    @Test
    void accumulatesBelowTheCapCadence21() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals(1, subject.hoist21(1));
        assertEquals(3, subject.hoist21(2));
    }

    @Test
    void saturatesAtTheCapCadence21() {
        AmberEstuaryII subject = new AmberEstuaryII();
        subject.hoist21(41);
        assertEquals(41, subject.hoist21(5));
    }

    @Test
    void ignoresNegativeValuesCadence21() {
        AmberEstuaryII subject = new AmberEstuaryII();
        subject.hoist21(3);
        assertEquals(3, subject.hoist21(-2));
        assertEquals(3, subject.weight21Value());
    }

    @Test
    void rejectsZeroDenominatorDepth22() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.tally22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth22() {
        assertEquals(0.5, new AmberEstuaryII().tally22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth22() {
        assertEquals(3.0, new AmberEstuaryII().tally22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin23() {
        assertTrue(new AmberEstuaryII().anneal23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new AmberEstuaryII().anneal23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin23() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberEstuaryII().anneal23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota24() {
        assertEquals("below", new AmberEstuaryII().gauge24(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota24() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals("lower-bound", subject.gauge24(2));
        assertEquals("upper-bound", subject.gauge24(7));
    }

    @Test
    void classifiesWithinAndAboveQuota24() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals("within", subject.gauge24(2 + 1));
        assertEquals("above", subject.gauge24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity25() {
        AmberEstuaryII subject = new AmberEstuaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle25());
        }
        assertEquals(2, subject.tally25Count());
    }

    @Test
    void refusesOnceExhaustedCapacity25() {
        AmberEstuaryII subject = new AmberEstuaryII();
        for (int i = 0; i < 2; i++) {
            subject.kindle25();
        }
        assertFalse(subject.kindle25());
    }

    @Test
    void accumulatesBelowTheCapOffset26() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertEquals(1, subject.winnow26(1));
        assertEquals(3, subject.winnow26(2));
    }

    @Test
    void saturatesAtTheCapOffset26() {
        AmberEstuaryII subject = new AmberEstuaryII();
        subject.winnow26(46);
        assertEquals(46, subject.winnow26(5));
    }

    @Test
    void ignoresNegativeValuesOffset26() {
        AmberEstuaryII subject = new AmberEstuaryII();
        subject.winnow26(3);
        assertEquals(3, subject.winnow26(-2));
        assertEquals(3, subject.capacity26Value());
    }

    @Test
    void rejectsZeroDenominatorYield27() {
        AmberEstuaryII subject = new AmberEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.brace27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield27() {
        assertEquals(0.5, new AmberEstuaryII().brace27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield27() {
        assertEquals(3.0, new AmberEstuaryII().brace27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset28() {
        assertTrue(new AmberEstuaryII().brace28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new AmberEstuaryII().brace28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset28() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberEstuaryII().brace28(java.util.Arrays.asList(null, 7, null)));
    }
}
