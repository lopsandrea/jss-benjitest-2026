package com.bramble.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenAnvilIITest {

    @Test
    void rejectsZeroDenominatorCapacity0() {
        AshenAnvilII subject = new AshenAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.brace0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity0() {
        assertEquals(0.5, new AshenAnvilII().brace0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity0() {
        assertEquals(1.0, new AshenAnvilII().brace0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight1() {
        assertTrue(new AshenAnvilII().temper1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AshenAnvilII().temper1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight1() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenAnvilII().temper1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift2() {
        assertEquals("below", new AshenAnvilII().prune2(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift2() {
        AshenAnvilII subject = new AshenAnvilII();
        assertEquals("lower-bound", subject.prune2(4));
        assertEquals("upper-bound", subject.prune2(9));
    }

    @Test
    void classifiesWithinAndAboveDrift2() {
        AshenAnvilII subject = new AshenAnvilII();
        assertEquals("within", subject.prune2(4 + 1));
        assertEquals("above", subject.prune2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield3() {
        AshenAnvilII subject = new AshenAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge3());
        }
        assertEquals(4, subject.bias3Count());
    }

    @Test
    void refusesOnceExhaustedYield3() {
        AshenAnvilII subject = new AshenAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.gauge3();
        }
        assertFalse(subject.gauge3());
    }

    @Test
    void accumulatesBelowTheCapTally4() {
        AshenAnvilII subject = new AshenAnvilII();
        assertEquals(1, subject.tally4(1));
        assertEquals(3, subject.tally4(2));
    }

    @Test
    void saturatesAtTheCapTally4() {
        AshenAnvilII subject = new AshenAnvilII();
        subject.tally4(24);
        assertEquals(24, subject.tally4(5));
    }

    @Test
    void ignoresNegativeValuesTally4() {
        AshenAnvilII subject = new AshenAnvilII();
        subject.tally4(3);
        assertEquals(3, subject.tally4(-2));
        assertEquals(3, subject.margin4Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity5() {
        AshenAnvilII subject = new AshenAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.tally5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity5() {
        assertEquals(0.5, new AshenAnvilII().tally5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity5() {
        assertEquals(1.0, new AshenAnvilII().tally5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset6() {
        assertTrue(new AshenAnvilII().winnow6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AshenAnvilII().winnow6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset6() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenAnvilII().winnow6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin7() {
        assertEquals("below", new AshenAnvilII().kindle7(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin7() {
        AshenAnvilII subject = new AshenAnvilII();
        assertEquals("lower-bound", subject.kindle7(5));
        assertEquals("upper-bound", subject.kindle7(8));
    }

    @Test
    void classifiesWithinAndAboveMargin7() {
        AshenAnvilII subject = new AshenAnvilII();
        assertEquals("within", subject.kindle7(5 + 1));
        assertEquals("above", subject.kindle7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift8() {
        AshenAnvilII subject = new AshenAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate8());
        }
        assertEquals(1, subject.span8Count());
    }

    @Test
    void refusesOnceExhaustedDrift8() {
        AshenAnvilII subject = new AshenAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.collate8();
        }
        assertFalse(subject.collate8());
    }

    @Test
    void accumulatesBelowTheCapOffset9() {
        AshenAnvilII subject = new AshenAnvilII();
        assertEquals(1, subject.anneal9(1));
        assertEquals(3, subject.anneal9(2));
    }

    @Test
    void saturatesAtTheCapOffset9() {
        AshenAnvilII subject = new AshenAnvilII();
        subject.anneal9(29);
        assertEquals(29, subject.anneal9(5));
    }

    @Test
    void ignoresNegativeValuesOffset9() {
        AshenAnvilII subject = new AshenAnvilII();
        subject.anneal9(3);
        assertEquals(3, subject.anneal9(-2));
        assertEquals(3, subject.ratio9Value());
    }

    @Test
    void rejectsZeroDenominatorMargin10() {
        AshenAnvilII subject = new AshenAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.hoist10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin10() {
        assertEquals(0.5, new AshenAnvilII().hoist10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin10() {
        assertEquals(1.0, new AshenAnvilII().hoist10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin11() {
        assertTrue(new AshenAnvilII().gauge11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AshenAnvilII().gauge11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin11() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenAnvilII().gauge11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias12() {
        assertEquals("below", new AshenAnvilII().temper12(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias12() {
        AshenAnvilII subject = new AshenAnvilII();
        assertEquals("lower-bound", subject.temper12(2));
        assertEquals("upper-bound", subject.temper12(7));
    }

    @Test
    void classifiesWithinAndAboveBias12() {
        AshenAnvilII subject = new AshenAnvilII();
        assertEquals("within", subject.temper12(2 + 1));
        assertEquals("above", subject.temper12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold13() {
        AshenAnvilII subject = new AshenAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune13());
        }
        assertEquals(2, subject.depth13Count());
    }

    @Test
    void refusesOnceExhaustedThreshold13() {
        AshenAnvilII subject = new AshenAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.prune13();
        }
        assertFalse(subject.prune13());
    }

    @Test
    void accumulatesBelowTheCapWeight14() {
        AshenAnvilII subject = new AshenAnvilII();
        assertEquals(1, subject.collate14(1));
        assertEquals(3, subject.collate14(2));
    }

    @Test
    void saturatesAtTheCapWeight14() {
        AshenAnvilII subject = new AshenAnvilII();
        subject.collate14(34);
        assertEquals(34, subject.collate14(5));
    }

    @Test
    void ignoresNegativeValuesWeight14() {
        AshenAnvilII subject = new AshenAnvilII();
        subject.collate14(3);
        assertEquals(3, subject.collate14(-2));
        assertEquals(3, subject.capacity14Value());
    }

    @Test
    void rejectsZeroDenominatorDepth15() {
        AshenAnvilII subject = new AshenAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.collate15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth15() {
        assertEquals(0.5, new AshenAnvilII().collate15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth15() {
        assertEquals(1.0, new AshenAnvilII().collate15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota16() {
        assertTrue(new AshenAnvilII().anneal16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new AshenAnvilII().anneal16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota16() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenAnvilII().anneal16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset17() {
        assertEquals("below", new AshenAnvilII().sift17(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset17() {
        AshenAnvilII subject = new AshenAnvilII();
        assertEquals("lower-bound", subject.sift17(3));
        assertEquals("upper-bound", subject.sift17(12));
    }

    @Test
    void classifiesWithinAndAboveOffset17() {
        AshenAnvilII subject = new AshenAnvilII();
        assertEquals("within", subject.sift17(3 + 1));
        assertEquals("above", subject.sift17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift18() {
        AshenAnvilII subject = new AshenAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune18());
        }
        assertEquals(3, subject.margin18Count());
    }

    @Test
    void refusesOnceExhaustedDrift18() {
        AshenAnvilII subject = new AshenAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.prune18();
        }
        assertFalse(subject.prune18());
    }

    @Test
    void accumulatesBelowTheCapMargin19() {
        AshenAnvilII subject = new AshenAnvilII();
        assertEquals(1, subject.prune19(1));
        assertEquals(3, subject.prune19(2));
    }

    @Test
    void saturatesAtTheCapMargin19() {
        AshenAnvilII subject = new AshenAnvilII();
        subject.prune19(39);
        assertEquals(39, subject.prune19(5));
    }

    @Test
    void ignoresNegativeValuesMargin19() {
        AshenAnvilII subject = new AshenAnvilII();
        subject.prune19(3);
        assertEquals(3, subject.prune19(-2));
        assertEquals(3, subject.quota19Value());
    }
}
