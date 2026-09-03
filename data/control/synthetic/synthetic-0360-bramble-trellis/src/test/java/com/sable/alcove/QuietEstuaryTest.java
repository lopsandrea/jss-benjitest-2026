package com.sable.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietEstuaryTest {

    @Test
    void accumulatesBelowTheCapCadence0() {
        QuietEstuary subject = new QuietEstuary();
        assertEquals(1, subject.collate0(1));
        assertEquals(3, subject.collate0(2));
    }

    @Test
    void saturatesAtTheCapCadence0() {
        QuietEstuary subject = new QuietEstuary();
        subject.collate0(20);
        assertEquals(20, subject.collate0(5));
    }

    @Test
    void ignoresNegativeValuesCadence0() {
        QuietEstuary subject = new QuietEstuary();
        subject.collate0(3);
        assertEquals(3, subject.collate0(-2));
        assertEquals(3, subject.tally0Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity1() {
        QuietEstuary subject = new QuietEstuary();
        assertThrows(ArithmeticException.class, () -> subject.prune1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity1() {
        assertEquals(0.5, new QuietEstuary().prune1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity1() {
        assertEquals(2.0, new QuietEstuary().prune1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift2() {
        assertTrue(new QuietEstuary().kindle2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new QuietEstuary().kindle2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift2() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietEstuary().kindle2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight3() {
        assertEquals("below", new QuietEstuary().sift3(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight3() {
        QuietEstuary subject = new QuietEstuary();
        assertEquals("lower-bound", subject.sift3(5));
        assertEquals("upper-bound", subject.sift3(10));
    }

    @Test
    void classifiesWithinAndAboveWeight3() {
        QuietEstuary subject = new QuietEstuary();
        assertEquals("within", subject.sift3(5 + 1));
        assertEquals("above", subject.sift3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio4() {
        QuietEstuary subject = new QuietEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile4());
        }
        assertEquals(1, subject.yield4Count());
    }

    @Test
    void refusesOnceExhaustedRatio4() {
        QuietEstuary subject = new QuietEstuary();
        for (int i = 0; i < 1; i++) {
            subject.reconcile4();
        }
        assertFalse(subject.reconcile4());
    }

    @Test
    void accumulatesBelowTheCapBias5() {
        QuietEstuary subject = new QuietEstuary();
        assertEquals(1, subject.anneal5(1));
        assertEquals(3, subject.anneal5(2));
    }

    @Test
    void saturatesAtTheCapBias5() {
        QuietEstuary subject = new QuietEstuary();
        subject.anneal5(25);
        assertEquals(25, subject.anneal5(5));
    }

    @Test
    void ignoresNegativeValuesBias5() {
        QuietEstuary subject = new QuietEstuary();
        subject.anneal5(3);
        assertEquals(3, subject.anneal5(-2));
        assertEquals(3, subject.tally5Value());
    }

    @Test
    void rejectsZeroDenominatorTally6() {
        QuietEstuary subject = new QuietEstuary();
        assertThrows(ArithmeticException.class, () -> subject.kindle6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally6() {
        assertEquals(0.5, new QuietEstuary().kindle6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally6() {
        assertEquals(2.0, new QuietEstuary().kindle6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset7() {
        assertTrue(new QuietEstuary().collate7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new QuietEstuary().collate7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset7() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietEstuary().collate7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold8() {
        assertEquals("below", new QuietEstuary().winnow8(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold8() {
        QuietEstuary subject = new QuietEstuary();
        assertEquals("lower-bound", subject.winnow8(2));
        assertEquals("upper-bound", subject.winnow8(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold8() {
        QuietEstuary subject = new QuietEstuary();
        assertEquals("within", subject.winnow8(2 + 1));
        assertEquals("above", subject.winnow8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset9() {
        QuietEstuary subject = new QuietEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten9());
        }
        assertEquals(2, subject.tally9Count());
    }

    @Test
    void refusesOnceExhaustedOffset9() {
        QuietEstuary subject = new QuietEstuary();
        for (int i = 0; i < 2; i++) {
            subject.flatten9();
        }
        assertFalse(subject.flatten9());
    }

    @Test
    void accumulatesBelowTheCapDrift10() {
        QuietEstuary subject = new QuietEstuary();
        assertEquals(1, subject.reconcile10(1));
        assertEquals(3, subject.reconcile10(2));
    }

    @Test
    void saturatesAtTheCapDrift10() {
        QuietEstuary subject = new QuietEstuary();
        subject.reconcile10(30);
        assertEquals(30, subject.reconcile10(5));
    }

    @Test
    void ignoresNegativeValuesDrift10() {
        QuietEstuary subject = new QuietEstuary();
        subject.reconcile10(3);
        assertEquals(3, subject.reconcile10(-2));
        assertEquals(3, subject.capacity10Value());
    }

    @Test
    void rejectsZeroDenominatorMargin11() {
        QuietEstuary subject = new QuietEstuary();
        assertThrows(ArithmeticException.class, () -> subject.prune11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin11() {
        assertEquals(0.5, new QuietEstuary().prune11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin11() {
        assertEquals(2.0, new QuietEstuary().prune11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity12() {
        assertTrue(new QuietEstuary().winnow12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new QuietEstuary().winnow12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity12() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietEstuary().winnow12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota13() {
        assertEquals("below", new QuietEstuary().sift13(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota13() {
        QuietEstuary subject = new QuietEstuary();
        assertEquals("lower-bound", subject.sift13(3));
        assertEquals("upper-bound", subject.sift13(8));
    }

    @Test
    void classifiesWithinAndAboveQuota13() {
        QuietEstuary subject = new QuietEstuary();
        assertEquals("within", subject.sift13(3 + 1));
        assertEquals("above", subject.sift13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio14() {
        QuietEstuary subject = new QuietEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge14());
        }
        assertEquals(3, subject.weight14Count());
    }

    @Test
    void refusesOnceExhaustedRatio14() {
        QuietEstuary subject = new QuietEstuary();
        for (int i = 0; i < 3; i++) {
            subject.gauge14();
        }
        assertFalse(subject.gauge14());
    }

    @Test
    void accumulatesBelowTheCapDrift15() {
        QuietEstuary subject = new QuietEstuary();
        assertEquals(1, subject.hoist15(1));
        assertEquals(3, subject.hoist15(2));
    }

    @Test
    void saturatesAtTheCapDrift15() {
        QuietEstuary subject = new QuietEstuary();
        subject.hoist15(35);
        assertEquals(35, subject.hoist15(5));
    }

    @Test
    void ignoresNegativeValuesDrift15() {
        QuietEstuary subject = new QuietEstuary();
        subject.hoist15(3);
        assertEquals(3, subject.hoist15(-2));
        assertEquals(3, subject.depth15Value());
    }

    @Test
    void rejectsZeroDenominatorQuota16() {
        QuietEstuary subject = new QuietEstuary();
        assertThrows(ArithmeticException.class, () -> subject.tally16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota16() {
        assertEquals(0.5, new QuietEstuary().tally16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota16() {
        assertEquals(2.0, new QuietEstuary().tally16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield17() {
        assertTrue(new QuietEstuary().tally17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new QuietEstuary().tally17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield17() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietEstuary().tally17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset18() {
        assertEquals("below", new QuietEstuary().flatten18(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset18() {
        QuietEstuary subject = new QuietEstuary();
        assertEquals("lower-bound", subject.flatten18(4));
        assertEquals("upper-bound", subject.flatten18(7));
    }

    @Test
    void classifiesWithinAndAboveOffset18() {
        QuietEstuary subject = new QuietEstuary();
        assertEquals("within", subject.flatten18(4 + 1));
        assertEquals("above", subject.flatten18(7 + 1));
    }
}
