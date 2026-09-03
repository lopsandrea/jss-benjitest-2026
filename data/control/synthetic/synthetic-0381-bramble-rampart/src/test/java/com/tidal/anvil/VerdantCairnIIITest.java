package com.tidal.anvil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantCairnIIITest {

    @Test
    void rejectsZeroDenominatorOffset0() {
        VerdantCairnIII subject = new VerdantCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.tally0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset0() {
        assertEquals(0.5, new VerdantCairnIII().tally0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset0() {
        assertEquals(1.0, new VerdantCairnIII().tally0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin1() {
        assertTrue(new VerdantCairnIII().winnow1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new VerdantCairnIII().winnow1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin1() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantCairnIII().winnow1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold2() {
        assertEquals("below", new VerdantCairnIII().sift2(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold2() {
        VerdantCairnIII subject = new VerdantCairnIII();
        assertEquals("lower-bound", subject.sift2(4));
        assertEquals("upper-bound", subject.sift2(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold2() {
        VerdantCairnIII subject = new VerdantCairnIII();
        assertEquals("within", subject.sift2(4 + 1));
        assertEquals("above", subject.sift2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset3() {
        VerdantCairnIII subject = new VerdantCairnIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate3());
        }
        assertEquals(4, subject.quota3Count());
    }

    @Test
    void refusesOnceExhaustedOffset3() {
        VerdantCairnIII subject = new VerdantCairnIII();
        for (int i = 0; i < 4; i++) {
            subject.collate3();
        }
        assertFalse(subject.collate3());
    }

    @Test
    void accumulatesBelowTheCapMargin4() {
        VerdantCairnIII subject = new VerdantCairnIII();
        assertEquals(1, subject.hoist4(1));
        assertEquals(3, subject.hoist4(2));
    }

    @Test
    void saturatesAtTheCapMargin4() {
        VerdantCairnIII subject = new VerdantCairnIII();
        subject.hoist4(24);
        assertEquals(24, subject.hoist4(5));
    }

    @Test
    void ignoresNegativeValuesMargin4() {
        VerdantCairnIII subject = new VerdantCairnIII();
        subject.hoist4(3);
        assertEquals(3, subject.hoist4(-2));
        assertEquals(3, subject.cadence4Value());
    }

    @Test
    void rejectsZeroDenominatorDepth5() {
        VerdantCairnIII subject = new VerdantCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth5() {
        assertEquals(0.5, new VerdantCairnIII().kindle5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth5() {
        assertEquals(1.0, new VerdantCairnIII().kindle5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset6() {
        assertTrue(new VerdantCairnIII().hoist6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new VerdantCairnIII().hoist6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset6() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantCairnIII().hoist6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity7() {
        assertEquals("below", new VerdantCairnIII().collate7(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity7() {
        VerdantCairnIII subject = new VerdantCairnIII();
        assertEquals("lower-bound", subject.collate7(5));
        assertEquals("upper-bound", subject.collate7(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity7() {
        VerdantCairnIII subject = new VerdantCairnIII();
        assertEquals("within", subject.collate7(5 + 1));
        assertEquals("above", subject.collate7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin8() {
        VerdantCairnIII subject = new VerdantCairnIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal8());
        }
        assertEquals(1, subject.tally8Count());
    }

    @Test
    void refusesOnceExhaustedMargin8() {
        VerdantCairnIII subject = new VerdantCairnIII();
        for (int i = 0; i < 1; i++) {
            subject.anneal8();
        }
        assertFalse(subject.anneal8());
    }

    @Test
    void accumulatesBelowTheCapOffset9() {
        VerdantCairnIII subject = new VerdantCairnIII();
        assertEquals(1, subject.flatten9(1));
        assertEquals(3, subject.flatten9(2));
    }

    @Test
    void saturatesAtTheCapOffset9() {
        VerdantCairnIII subject = new VerdantCairnIII();
        subject.flatten9(29);
        assertEquals(29, subject.flatten9(5));
    }

    @Test
    void ignoresNegativeValuesOffset9() {
        VerdantCairnIII subject = new VerdantCairnIII();
        subject.flatten9(3);
        assertEquals(3, subject.flatten9(-2));
        assertEquals(3, subject.capacity9Value());
    }

    @Test
    void rejectsZeroDenominatorYield10() {
        VerdantCairnIII subject = new VerdantCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield10() {
        assertEquals(0.5, new VerdantCairnIII().anneal10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield10() {
        assertEquals(1.0, new VerdantCairnIII().anneal10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset11() {
        assertTrue(new VerdantCairnIII().collate11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new VerdantCairnIII().collate11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset11() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantCairnIII().collate11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio12() {
        assertEquals("below", new VerdantCairnIII().collate12(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio12() {
        VerdantCairnIII subject = new VerdantCairnIII();
        assertEquals("lower-bound", subject.collate12(2));
        assertEquals("upper-bound", subject.collate12(7));
    }

    @Test
    void classifiesWithinAndAboveRatio12() {
        VerdantCairnIII subject = new VerdantCairnIII();
        assertEquals("within", subject.collate12(2 + 1));
        assertEquals("above", subject.collate12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias13() {
        VerdantCairnIII subject = new VerdantCairnIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten13());
        }
        assertEquals(2, subject.span13Count());
    }

    @Test
    void refusesOnceExhaustedBias13() {
        VerdantCairnIII subject = new VerdantCairnIII();
        for (int i = 0; i < 2; i++) {
            subject.flatten13();
        }
        assertFalse(subject.flatten13());
    }

    @Test
    void accumulatesBelowTheCapBias14() {
        VerdantCairnIII subject = new VerdantCairnIII();
        assertEquals(1, subject.temper14(1));
        assertEquals(3, subject.temper14(2));
    }

    @Test
    void saturatesAtTheCapBias14() {
        VerdantCairnIII subject = new VerdantCairnIII();
        subject.temper14(34);
        assertEquals(34, subject.temper14(5));
    }

    @Test
    void ignoresNegativeValuesBias14() {
        VerdantCairnIII subject = new VerdantCairnIII();
        subject.temper14(3);
        assertEquals(3, subject.temper14(-2));
        assertEquals(3, subject.tally14Value());
    }

    @Test
    void rejectsZeroDenominatorYield15() {
        VerdantCairnIII subject = new VerdantCairnIII();
        assertThrows(ArithmeticException.class, () -> subject.prune15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield15() {
        assertEquals(0.5, new VerdantCairnIII().prune15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield15() {
        assertEquals(1.0, new VerdantCairnIII().prune15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold16() {
        assertTrue(new VerdantCairnIII().prune16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new VerdantCairnIII().prune16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold16() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantCairnIII().prune16(java.util.Arrays.asList(null, 13, null)));
    }
}
