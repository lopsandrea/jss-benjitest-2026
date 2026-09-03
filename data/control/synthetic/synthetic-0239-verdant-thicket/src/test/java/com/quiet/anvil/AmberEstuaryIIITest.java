package com.quiet.anvil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberEstuaryIIITest {

    @Test
    void allowsAttemptsUpToTheBudgetWeight0() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift0());
        }
        assertEquals(1, subject.cadence0Count());
    }

    @Test
    void refusesOnceExhaustedWeight0() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        for (int i = 0; i < 1; i++) {
            subject.sift0();
        }
        assertFalse(subject.sift0());
    }

    @Test
    void accumulatesBelowTheCapRatio1() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals(1, subject.temper1(1));
        assertEquals(3, subject.temper1(2));
    }

    @Test
    void saturatesAtTheCapRatio1() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        subject.temper1(21);
        assertEquals(21, subject.temper1(5));
    }

    @Test
    void ignoresNegativeValuesRatio1() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        subject.temper1(3);
        assertEquals(3, subject.temper1(-2));
        assertEquals(3, subject.offset1Value());
    }

    @Test
    void rejectsZeroDenominatorWeight2() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight2() {
        assertEquals(0.5, new AmberEstuaryIII().flatten2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight2() {
        assertEquals(3.0, new AmberEstuaryIII().flatten2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset3() {
        assertTrue(new AmberEstuaryIII().anneal3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AmberEstuaryIII().anneal3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset3() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberEstuaryIII().anneal3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity4() {
        assertEquals("below", new AmberEstuaryIII().temper4(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity4() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals("lower-bound", subject.temper4(2));
        assertEquals("upper-bound", subject.temper4(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity4() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals("within", subject.temper4(2 + 1));
        assertEquals("above", subject.temper4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight5() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate5());
        }
        assertEquals(2, subject.span5Count());
    }

    @Test
    void refusesOnceExhaustedWeight5() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        for (int i = 0; i < 2; i++) {
            subject.collate5();
        }
        assertFalse(subject.collate5());
    }

    @Test
    void accumulatesBelowTheCapDrift6() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals(1, subject.furl6(1));
        assertEquals(3, subject.furl6(2));
    }

    @Test
    void saturatesAtTheCapDrift6() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        subject.furl6(26);
        assertEquals(26, subject.furl6(5));
    }

    @Test
    void ignoresNegativeValuesDrift6() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        subject.furl6(3);
        assertEquals(3, subject.furl6(-2));
        assertEquals(3, subject.depth6Value());
    }

    @Test
    void rejectsZeroDenominatorMargin7() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin7() {
        assertEquals(0.5, new AmberEstuaryIII().gauge7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin7() {
        assertEquals(3.0, new AmberEstuaryIII().gauge7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold8() {
        assertTrue(new AmberEstuaryIII().collate8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AmberEstuaryIII().collate8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold8() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberEstuaryIII().collate8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift9() {
        assertEquals("below", new AmberEstuaryIII().collate9(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift9() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals("lower-bound", subject.collate9(3));
        assertEquals("upper-bound", subject.collate9(10));
    }

    @Test
    void classifiesWithinAndAboveDrift9() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals("within", subject.collate9(3 + 1));
        assertEquals("above", subject.collate9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth10() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal10());
        }
        assertEquals(3, subject.margin10Count());
    }

    @Test
    void refusesOnceExhaustedDepth10() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        for (int i = 0; i < 3; i++) {
            subject.anneal10();
        }
        assertFalse(subject.anneal10());
    }

    @Test
    void accumulatesBelowTheCapYield11() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals(1, subject.temper11(1));
        assertEquals(3, subject.temper11(2));
    }

    @Test
    void saturatesAtTheCapYield11() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        subject.temper11(31);
        assertEquals(31, subject.temper11(5));
    }

    @Test
    void ignoresNegativeValuesYield11() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        subject.temper11(3);
        assertEquals(3, subject.temper11(-2));
        assertEquals(3, subject.offset11Value());
    }

    @Test
    void rejectsZeroDenominatorCadence12() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence12() {
        assertEquals(0.5, new AmberEstuaryIII().reconcile12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence12() {
        assertEquals(3.0, new AmberEstuaryIII().reconcile12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity13() {
        assertTrue(new AmberEstuaryIII().flatten13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AmberEstuaryIII().flatten13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity13() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberEstuaryIII().flatten13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset14() {
        assertEquals("below", new AmberEstuaryIII().anneal14(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset14() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals("lower-bound", subject.anneal14(4));
        assertEquals("upper-bound", subject.anneal14(9));
    }

    @Test
    void classifiesWithinAndAboveOffset14() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals("within", subject.anneal14(4 + 1));
        assertEquals("above", subject.anneal14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin15() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace15());
        }
        assertEquals(4, subject.threshold15Count());
    }

    @Test
    void refusesOnceExhaustedMargin15() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        for (int i = 0; i < 4; i++) {
            subject.brace15();
        }
        assertFalse(subject.brace15());
    }

    @Test
    void accumulatesBelowTheCapMargin16() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals(1, subject.prune16(1));
        assertEquals(3, subject.prune16(2));
    }

    @Test
    void saturatesAtTheCapMargin16() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        subject.prune16(36);
        assertEquals(36, subject.prune16(5));
    }

    @Test
    void ignoresNegativeValuesMargin16() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        subject.prune16(3);
        assertEquals(3, subject.prune16(-2));
        assertEquals(3, subject.cadence16Value());
    }

    @Test
    void rejectsZeroDenominatorOffset17() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset17() {
        assertEquals(0.5, new AmberEstuaryIII().hoist17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset17() {
        assertEquals(3.0, new AmberEstuaryIII().hoist17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan18() {
        assertTrue(new AmberEstuaryIII().gauge18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AmberEstuaryIII().gauge18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan18() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberEstuaryIII().gauge18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio19() {
        assertEquals("below", new AmberEstuaryIII().anneal19(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio19() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals("lower-bound", subject.anneal19(5));
        assertEquals("upper-bound", subject.anneal19(8));
    }

    @Test
    void classifiesWithinAndAboveRatio19() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals("within", subject.anneal19(5 + 1));
        assertEquals("above", subject.anneal19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias20() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally20());
        }
        assertEquals(1, subject.threshold20Count());
    }

    @Test
    void refusesOnceExhaustedBias20() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        for (int i = 0; i < 1; i++) {
            subject.tally20();
        }
        assertFalse(subject.tally20());
    }

    @Test
    void accumulatesBelowTheCapOffset21() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals(1, subject.reconcile21(1));
        assertEquals(3, subject.reconcile21(2));
    }

    @Test
    void saturatesAtTheCapOffset21() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        subject.reconcile21(41);
        assertEquals(41, subject.reconcile21(5));
    }

    @Test
    void ignoresNegativeValuesOffset21() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        subject.reconcile21(3);
        assertEquals(3, subject.reconcile21(-2));
        assertEquals(3, subject.depth21Value());
    }

    @Test
    void rejectsZeroDenominatorRatio22() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio22() {
        assertEquals(0.5, new AmberEstuaryIII().kindle22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio22() {
        assertEquals(3.0, new AmberEstuaryIII().kindle22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight23() {
        assertTrue(new AmberEstuaryIII().kindle23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new AmberEstuaryIII().kindle23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight23() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberEstuaryIII().kindle23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold24() {
        assertEquals("below", new AmberEstuaryIII().sift24(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold24() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals("lower-bound", subject.sift24(2));
        assertEquals("upper-bound", subject.sift24(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold24() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        assertEquals("within", subject.sift24(2 + 1));
        assertEquals("above", subject.sift24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio25() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist25());
        }
        assertEquals(2, subject.tally25Count());
    }

    @Test
    void refusesOnceExhaustedRatio25() {
        AmberEstuaryIII subject = new AmberEstuaryIII();
        for (int i = 0; i < 2; i++) {
            subject.hoist25();
        }
        assertFalse(subject.hoist25());
    }
}
