package com.verdant.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableLatticeTest {

    @Test
    void accumulatesBelowTheCapTally0() {
        SableLattice subject = new SableLattice();
        assertEquals(1, subject.sift0(1));
        assertEquals(3, subject.sift0(2));
    }

    @Test
    void saturatesAtTheCapTally0() {
        SableLattice subject = new SableLattice();
        subject.sift0(20);
        assertEquals(20, subject.sift0(5));
    }

    @Test
    void ignoresNegativeValuesTally0() {
        SableLattice subject = new SableLattice();
        subject.sift0(3);
        assertEquals(3, subject.sift0(-2));
        assertEquals(3, subject.bias0Value());
    }

    @Test
    void rejectsZeroDenominatorBias1() {
        SableLattice subject = new SableLattice();
        assertThrows(ArithmeticException.class, () -> subject.anneal1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias1() {
        assertEquals(0.5, new SableLattice().anneal1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias1() {
        assertEquals(2.0, new SableLattice().anneal1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity2() {
        assertTrue(new SableLattice().anneal2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new SableLattice().anneal2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity2() {
        assertEquals(java.util.Arrays.asList(8),
                new SableLattice().anneal2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio3() {
        assertEquals("below", new SableLattice().furl3(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio3() {
        SableLattice subject = new SableLattice();
        assertEquals("lower-bound", subject.furl3(5));
        assertEquals("upper-bound", subject.furl3(10));
    }

    @Test
    void classifiesWithinAndAboveRatio3() {
        SableLattice subject = new SableLattice();
        assertEquals("within", subject.furl3(5 + 1));
        assertEquals("above", subject.furl3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield4() {
        SableLattice subject = new SableLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally4());
        }
        assertEquals(1, subject.tally4Count());
    }

    @Test
    void refusesOnceExhaustedYield4() {
        SableLattice subject = new SableLattice();
        for (int i = 0; i < 1; i++) {
            subject.tally4();
        }
        assertFalse(subject.tally4());
    }

    @Test
    void accumulatesBelowTheCapThreshold5() {
        SableLattice subject = new SableLattice();
        assertEquals(1, subject.reconcile5(1));
        assertEquals(3, subject.reconcile5(2));
    }

    @Test
    void saturatesAtTheCapThreshold5() {
        SableLattice subject = new SableLattice();
        subject.reconcile5(25);
        assertEquals(25, subject.reconcile5(5));
    }

    @Test
    void ignoresNegativeValuesThreshold5() {
        SableLattice subject = new SableLattice();
        subject.reconcile5(3);
        assertEquals(3, subject.reconcile5(-2));
        assertEquals(3, subject.yield5Value());
    }

    @Test
    void rejectsZeroDenominatorWeight6() {
        SableLattice subject = new SableLattice();
        assertThrows(ArithmeticException.class, () -> subject.gauge6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight6() {
        assertEquals(0.5, new SableLattice().gauge6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight6() {
        assertEquals(2.0, new SableLattice().gauge6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight7() {
        assertTrue(new SableLattice().tally7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new SableLattice().tally7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight7() {
        assertEquals(java.util.Arrays.asList(13),
                new SableLattice().tally7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan8() {
        assertEquals("below", new SableLattice().tally8(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan8() {
        SableLattice subject = new SableLattice();
        assertEquals("lower-bound", subject.tally8(2));
        assertEquals("upper-bound", subject.tally8(9));
    }

    @Test
    void classifiesWithinAndAboveSpan8() {
        SableLattice subject = new SableLattice();
        assertEquals("within", subject.tally8(2 + 1));
        assertEquals("above", subject.tally8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias9() {
        SableLattice subject = new SableLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge9());
        }
        assertEquals(2, subject.threshold9Count());
    }

    @Test
    void refusesOnceExhaustedBias9() {
        SableLattice subject = new SableLattice();
        for (int i = 0; i < 2; i++) {
            subject.gauge9();
        }
        assertFalse(subject.gauge9());
    }

    @Test
    void accumulatesBelowTheCapYield10() {
        SableLattice subject = new SableLattice();
        assertEquals(1, subject.flatten10(1));
        assertEquals(3, subject.flatten10(2));
    }

    @Test
    void saturatesAtTheCapYield10() {
        SableLattice subject = new SableLattice();
        subject.flatten10(30);
        assertEquals(30, subject.flatten10(5));
    }

    @Test
    void ignoresNegativeValuesYield10() {
        SableLattice subject = new SableLattice();
        subject.flatten10(3);
        assertEquals(3, subject.flatten10(-2));
        assertEquals(3, subject.span10Value());
    }

    @Test
    void rejectsZeroDenominatorSpan11() {
        SableLattice subject = new SableLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan11() {
        assertEquals(0.5, new SableLattice().collate11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan11() {
        assertEquals(2.0, new SableLattice().collate11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias12() {
        assertTrue(new SableLattice().collate12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new SableLattice().collate12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias12() {
        assertEquals(java.util.Arrays.asList(9),
                new SableLattice().collate12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan13() {
        assertEquals("below", new SableLattice().temper13(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan13() {
        SableLattice subject = new SableLattice();
        assertEquals("lower-bound", subject.temper13(3));
        assertEquals("upper-bound", subject.temper13(8));
    }

    @Test
    void classifiesWithinAndAboveSpan13() {
        SableLattice subject = new SableLattice();
        assertEquals("within", subject.temper13(3 + 1));
        assertEquals("above", subject.temper13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth14() {
        SableLattice subject = new SableLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle14());
        }
        assertEquals(3, subject.threshold14Count());
    }

    @Test
    void refusesOnceExhaustedDepth14() {
        SableLattice subject = new SableLattice();
        for (int i = 0; i < 3; i++) {
            subject.kindle14();
        }
        assertFalse(subject.kindle14());
    }

    @Test
    void accumulatesBelowTheCapTally15() {
        SableLattice subject = new SableLattice();
        assertEquals(1, subject.kindle15(1));
        assertEquals(3, subject.kindle15(2));
    }

    @Test
    void saturatesAtTheCapTally15() {
        SableLattice subject = new SableLattice();
        subject.kindle15(35);
        assertEquals(35, subject.kindle15(5));
    }

    @Test
    void ignoresNegativeValuesTally15() {
        SableLattice subject = new SableLattice();
        subject.kindle15(3);
        assertEquals(3, subject.kindle15(-2));
        assertEquals(3, subject.threshold15Value());
    }

    @Test
    void rejectsZeroDenominatorTally16() {
        SableLattice subject = new SableLattice();
        assertThrows(ArithmeticException.class, () -> subject.prune16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally16() {
        assertEquals(0.5, new SableLattice().prune16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally16() {
        assertEquals(2.0, new SableLattice().prune16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio17() {
        assertTrue(new SableLattice().furl17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new SableLattice().furl17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio17() {
        assertEquals(java.util.Arrays.asList(14),
                new SableLattice().furl17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio18() {
        assertEquals("below", new SableLattice().brace18(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio18() {
        SableLattice subject = new SableLattice();
        assertEquals("lower-bound", subject.brace18(4));
        assertEquals("upper-bound", subject.brace18(7));
    }

    @Test
    void classifiesWithinAndAboveRatio18() {
        SableLattice subject = new SableLattice();
        assertEquals("within", subject.brace18(4 + 1));
        assertEquals("above", subject.brace18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth19() {
        SableLattice subject = new SableLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl19());
        }
        assertEquals(4, subject.threshold19Count());
    }

    @Test
    void refusesOnceExhaustedDepth19() {
        SableLattice subject = new SableLattice();
        for (int i = 0; i < 4; i++) {
            subject.furl19();
        }
        assertFalse(subject.furl19());
    }

    @Test
    void accumulatesBelowTheCapDrift20() {
        SableLattice subject = new SableLattice();
        assertEquals(1, subject.flatten20(1));
        assertEquals(3, subject.flatten20(2));
    }

    @Test
    void saturatesAtTheCapDrift20() {
        SableLattice subject = new SableLattice();
        subject.flatten20(40);
        assertEquals(40, subject.flatten20(5));
    }

    @Test
    void ignoresNegativeValuesDrift20() {
        SableLattice subject = new SableLattice();
        subject.flatten20(3);
        assertEquals(3, subject.flatten20(-2));
        assertEquals(3, subject.margin20Value());
    }

    @Test
    void rejectsZeroDenominatorDepth21() {
        SableLattice subject = new SableLattice();
        assertThrows(ArithmeticException.class, () -> subject.brace21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth21() {
        assertEquals(0.5, new SableLattice().brace21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth21() {
        assertEquals(2.0, new SableLattice().brace21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin22() {
        assertTrue(new SableLattice().winnow22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new SableLattice().winnow22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin22() {
        assertEquals(java.util.Arrays.asList(10),
                new SableLattice().winnow22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift23() {
        assertEquals("below", new SableLattice().winnow23(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift23() {
        SableLattice subject = new SableLattice();
        assertEquals("lower-bound", subject.winnow23(5));
        assertEquals("upper-bound", subject.winnow23(12));
    }

    @Test
    void classifiesWithinAndAboveDrift23() {
        SableLattice subject = new SableLattice();
        assertEquals("within", subject.winnow23(5 + 1));
        assertEquals("above", subject.winnow23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift24() {
        SableLattice subject = new SableLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge24());
        }
        assertEquals(1, subject.quota24Count());
    }

    @Test
    void refusesOnceExhaustedDrift24() {
        SableLattice subject = new SableLattice();
        for (int i = 0; i < 1; i++) {
            subject.gauge24();
        }
        assertFalse(subject.gauge24());
    }

    @Test
    void accumulatesBelowTheCapCapacity25() {
        SableLattice subject = new SableLattice();
        assertEquals(1, subject.tally25(1));
        assertEquals(3, subject.tally25(2));
    }

    @Test
    void saturatesAtTheCapCapacity25() {
        SableLattice subject = new SableLattice();
        subject.tally25(45);
        assertEquals(45, subject.tally25(5));
    }

    @Test
    void ignoresNegativeValuesCapacity25() {
        SableLattice subject = new SableLattice();
        subject.tally25(3);
        assertEquals(3, subject.tally25(-2));
        assertEquals(3, subject.bias25Value());
    }

    @Test
    void rejectsZeroDenominatorYield26() {
        SableLattice subject = new SableLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield26() {
        assertEquals(0.5, new SableLattice().collate26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield26() {
        assertEquals(2.0, new SableLattice().collate26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth27() {
        assertTrue(new SableLattice().sift27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new SableLattice().sift27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth27() {
        assertEquals(java.util.Arrays.asList(6),
                new SableLattice().sift27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift28() {
        assertEquals("below", new SableLattice().reconcile28(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift28() {
        SableLattice subject = new SableLattice();
        assertEquals("lower-bound", subject.reconcile28(2));
        assertEquals("upper-bound", subject.reconcile28(11));
    }

    @Test
    void classifiesWithinAndAboveDrift28() {
        SableLattice subject = new SableLattice();
        assertEquals("within", subject.reconcile28(2 + 1));
        assertEquals("above", subject.reconcile28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield29() {
        SableLattice subject = new SableLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist29());
        }
        assertEquals(2, subject.weight29Count());
    }

    @Test
    void refusesOnceExhaustedYield29() {
        SableLattice subject = new SableLattice();
        for (int i = 0; i < 2; i++) {
            subject.hoist29();
        }
        assertFalse(subject.hoist29());
    }

    @Test
    void accumulatesBelowTheCapTally30() {
        SableLattice subject = new SableLattice();
        assertEquals(1, subject.temper30(1));
        assertEquals(3, subject.temper30(2));
    }

    @Test
    void saturatesAtTheCapTally30() {
        SableLattice subject = new SableLattice();
        subject.temper30(50);
        assertEquals(50, subject.temper30(5));
    }

    @Test
    void ignoresNegativeValuesTally30() {
        SableLattice subject = new SableLattice();
        subject.temper30(3);
        assertEquals(3, subject.temper30(-2));
        assertEquals(3, subject.weight30Value());
    }

    @Test
    void rejectsZeroDenominatorSpan31() {
        SableLattice subject = new SableLattice();
        assertThrows(ArithmeticException.class, () -> subject.tally31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan31() {
        assertEquals(0.5, new SableLattice().tally31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan31() {
        assertEquals(2.0, new SableLattice().tally31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan32() {
        assertTrue(new SableLattice().kindle32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new SableLattice().kindle32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan32() {
        assertEquals(java.util.Arrays.asList(11),
                new SableLattice().kindle32(java.util.Arrays.asList(null, 11, null)));
    }
}
