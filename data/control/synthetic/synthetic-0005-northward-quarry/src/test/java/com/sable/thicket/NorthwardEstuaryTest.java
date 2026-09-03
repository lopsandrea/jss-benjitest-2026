package com.sable.thicket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardEstuaryTest {

    @Test
    void accumulatesBelowTheCapQuota0() {
        NorthwardEstuary subject = new NorthwardEstuary();
        assertEquals(1, subject.collate0(1));
        assertEquals(3, subject.collate0(2));
    }

    @Test
    void saturatesAtTheCapQuota0() {
        NorthwardEstuary subject = new NorthwardEstuary();
        subject.collate0(20);
        assertEquals(20, subject.collate0(5));
    }

    @Test
    void ignoresNegativeValuesQuota0() {
        NorthwardEstuary subject = new NorthwardEstuary();
        subject.collate0(3);
        assertEquals(3, subject.collate0(-2));
        assertEquals(3, subject.drift0Value());
    }

    @Test
    void rejectsZeroDenominatorWeight1() {
        NorthwardEstuary subject = new NorthwardEstuary();
        assertThrows(ArithmeticException.class, () -> subject.sift1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight1() {
        assertEquals(0.5, new NorthwardEstuary().sift1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight1() {
        assertEquals(2.0, new NorthwardEstuary().sift1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin2() {
        assertTrue(new NorthwardEstuary().gauge2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new NorthwardEstuary().gauge2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin2() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardEstuary().gauge2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan3() {
        assertEquals("below", new NorthwardEstuary().sift3(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan3() {
        NorthwardEstuary subject = new NorthwardEstuary();
        assertEquals("lower-bound", subject.sift3(5));
        assertEquals("upper-bound", subject.sift3(10));
    }

    @Test
    void classifiesWithinAndAboveSpan3() {
        NorthwardEstuary subject = new NorthwardEstuary();
        assertEquals("within", subject.sift3(5 + 1));
        assertEquals("above", subject.sift3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias4() {
        NorthwardEstuary subject = new NorthwardEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge4());
        }
        assertEquals(1, subject.drift4Count());
    }

    @Test
    void refusesOnceExhaustedBias4() {
        NorthwardEstuary subject = new NorthwardEstuary();
        for (int i = 0; i < 1; i++) {
            subject.gauge4();
        }
        assertFalse(subject.gauge4());
    }

    @Test
    void accumulatesBelowTheCapSpan5() {
        NorthwardEstuary subject = new NorthwardEstuary();
        assertEquals(1, subject.tally5(1));
        assertEquals(3, subject.tally5(2));
    }

    @Test
    void saturatesAtTheCapSpan5() {
        NorthwardEstuary subject = new NorthwardEstuary();
        subject.tally5(25);
        assertEquals(25, subject.tally5(5));
    }

    @Test
    void ignoresNegativeValuesSpan5() {
        NorthwardEstuary subject = new NorthwardEstuary();
        subject.tally5(3);
        assertEquals(3, subject.tally5(-2));
        assertEquals(3, subject.threshold5Value());
    }

    @Test
    void rejectsZeroDenominatorTally6() {
        NorthwardEstuary subject = new NorthwardEstuary();
        assertThrows(ArithmeticException.class, () -> subject.winnow6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally6() {
        assertEquals(0.5, new NorthwardEstuary().winnow6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally6() {
        assertEquals(2.0, new NorthwardEstuary().winnow6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally7() {
        assertTrue(new NorthwardEstuary().prune7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new NorthwardEstuary().prune7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally7() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardEstuary().prune7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin8() {
        assertEquals("below", new NorthwardEstuary().kindle8(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin8() {
        NorthwardEstuary subject = new NorthwardEstuary();
        assertEquals("lower-bound", subject.kindle8(2));
        assertEquals("upper-bound", subject.kindle8(9));
    }

    @Test
    void classifiesWithinAndAboveMargin8() {
        NorthwardEstuary subject = new NorthwardEstuary();
        assertEquals("within", subject.kindle8(2 + 1));
        assertEquals("above", subject.kindle8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield9() {
        NorthwardEstuary subject = new NorthwardEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten9());
        }
        assertEquals(2, subject.margin9Count());
    }

    @Test
    void refusesOnceExhaustedYield9() {
        NorthwardEstuary subject = new NorthwardEstuary();
        for (int i = 0; i < 2; i++) {
            subject.flatten9();
        }
        assertFalse(subject.flatten9());
    }

    @Test
    void accumulatesBelowTheCapBias10() {
        NorthwardEstuary subject = new NorthwardEstuary();
        assertEquals(1, subject.reconcile10(1));
        assertEquals(3, subject.reconcile10(2));
    }

    @Test
    void saturatesAtTheCapBias10() {
        NorthwardEstuary subject = new NorthwardEstuary();
        subject.reconcile10(30);
        assertEquals(30, subject.reconcile10(5));
    }

    @Test
    void ignoresNegativeValuesBias10() {
        NorthwardEstuary subject = new NorthwardEstuary();
        subject.reconcile10(3);
        assertEquals(3, subject.reconcile10(-2));
        assertEquals(3, subject.offset10Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity11() {
        NorthwardEstuary subject = new NorthwardEstuary();
        assertThrows(ArithmeticException.class, () -> subject.winnow11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity11() {
        assertEquals(0.5, new NorthwardEstuary().winnow11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity11() {
        assertEquals(2.0, new NorthwardEstuary().winnow11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity12() {
        assertTrue(new NorthwardEstuary().flatten12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new NorthwardEstuary().flatten12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity12() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardEstuary().flatten12(java.util.Arrays.asList(null, 9, null)));
    }
}
