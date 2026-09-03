package com.hollow.quill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleMeridianIITest {

    @Test
    void rejectsZeroDenominatorCapacity0() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.gauge0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity0() {
        assertEquals(0.5, new BrambleMeridianII().gauge0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity0() {
        assertEquals(1.0, new BrambleMeridianII().gauge0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth1() {
        assertTrue(new BrambleMeridianII().prune1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new BrambleMeridianII().prune1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth1() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleMeridianII().prune1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold2() {
        assertEquals("below", new BrambleMeridianII().sift2(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold2() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals("lower-bound", subject.sift2(4));
        assertEquals("upper-bound", subject.sift2(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold2() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals("within", subject.sift2(4 + 1));
        assertEquals("above", subject.sift2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift3() {
        BrambleMeridianII subject = new BrambleMeridianII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow3());
        }
        assertEquals(4, subject.threshold3Count());
    }

    @Test
    void refusesOnceExhaustedDrift3() {
        BrambleMeridianII subject = new BrambleMeridianII();
        for (int i = 0; i < 4; i++) {
            subject.winnow3();
        }
        assertFalse(subject.winnow3());
    }

    @Test
    void accumulatesBelowTheCapQuota4() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals(1, subject.kindle4(1));
        assertEquals(3, subject.kindle4(2));
    }

    @Test
    void saturatesAtTheCapQuota4() {
        BrambleMeridianII subject = new BrambleMeridianII();
        subject.kindle4(24);
        assertEquals(24, subject.kindle4(5));
    }

    @Test
    void ignoresNegativeValuesQuota4() {
        BrambleMeridianII subject = new BrambleMeridianII();
        subject.kindle4(3);
        assertEquals(3, subject.kindle4(-2));
        assertEquals(3, subject.threshold4Value());
    }

    @Test
    void rejectsZeroDenominatorMargin5() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.kindle5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin5() {
        assertEquals(0.5, new BrambleMeridianII().kindle5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin5() {
        assertEquals(1.0, new BrambleMeridianII().kindle5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally6() {
        assertTrue(new BrambleMeridianII().furl6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new BrambleMeridianII().furl6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally6() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleMeridianII().furl6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth7() {
        assertEquals("below", new BrambleMeridianII().tally7(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth7() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals("lower-bound", subject.tally7(5));
        assertEquals("upper-bound", subject.tally7(8));
    }

    @Test
    void classifiesWithinAndAboveDepth7() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals("within", subject.tally7(5 + 1));
        assertEquals("above", subject.tally7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin8() {
        BrambleMeridianII subject = new BrambleMeridianII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl8());
        }
        assertEquals(1, subject.weight8Count());
    }

    @Test
    void refusesOnceExhaustedMargin8() {
        BrambleMeridianII subject = new BrambleMeridianII();
        for (int i = 0; i < 1; i++) {
            subject.furl8();
        }
        assertFalse(subject.furl8());
    }

    @Test
    void accumulatesBelowTheCapWeight9() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals(1, subject.temper9(1));
        assertEquals(3, subject.temper9(2));
    }

    @Test
    void saturatesAtTheCapWeight9() {
        BrambleMeridianII subject = new BrambleMeridianII();
        subject.temper9(29);
        assertEquals(29, subject.temper9(5));
    }

    @Test
    void ignoresNegativeValuesWeight9() {
        BrambleMeridianII subject = new BrambleMeridianII();
        subject.temper9(3);
        assertEquals(3, subject.temper9(-2));
        assertEquals(3, subject.span9Value());
    }

    @Test
    void rejectsZeroDenominatorBias10() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.tally10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias10() {
        assertEquals(0.5, new BrambleMeridianII().tally10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias10() {
        assertEquals(1.0, new BrambleMeridianII().tally10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin11() {
        assertTrue(new BrambleMeridianII().sift11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new BrambleMeridianII().sift11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin11() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleMeridianII().sift11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity12() {
        assertEquals("below", new BrambleMeridianII().kindle12(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity12() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals("lower-bound", subject.kindle12(2));
        assertEquals("upper-bound", subject.kindle12(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity12() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals("within", subject.kindle12(2 + 1));
        assertEquals("above", subject.kindle12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota13() {
        BrambleMeridianII subject = new BrambleMeridianII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune13());
        }
        assertEquals(2, subject.drift13Count());
    }

    @Test
    void refusesOnceExhaustedQuota13() {
        BrambleMeridianII subject = new BrambleMeridianII();
        for (int i = 0; i < 2; i++) {
            subject.prune13();
        }
        assertFalse(subject.prune13());
    }

    @Test
    void accumulatesBelowTheCapRatio14() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals(1, subject.kindle14(1));
        assertEquals(3, subject.kindle14(2));
    }

    @Test
    void saturatesAtTheCapRatio14() {
        BrambleMeridianII subject = new BrambleMeridianII();
        subject.kindle14(34);
        assertEquals(34, subject.kindle14(5));
    }

    @Test
    void ignoresNegativeValuesRatio14() {
        BrambleMeridianII subject = new BrambleMeridianII();
        subject.kindle14(3);
        assertEquals(3, subject.kindle14(-2));
        assertEquals(3, subject.margin14Value());
    }

    @Test
    void rejectsZeroDenominatorOffset15() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.prune15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset15() {
        assertEquals(0.5, new BrambleMeridianII().prune15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset15() {
        assertEquals(1.0, new BrambleMeridianII().prune15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin16() {
        assertTrue(new BrambleMeridianII().furl16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new BrambleMeridianII().furl16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin16() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleMeridianII().furl16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth17() {
        assertEquals("below", new BrambleMeridianII().hoist17(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth17() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals("lower-bound", subject.hoist17(3));
        assertEquals("upper-bound", subject.hoist17(12));
    }

    @Test
    void classifiesWithinAndAboveDepth17() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals("within", subject.hoist17(3 + 1));
        assertEquals("above", subject.hoist17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth18() {
        BrambleMeridianII subject = new BrambleMeridianII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle18());
        }
        assertEquals(3, subject.threshold18Count());
    }

    @Test
    void refusesOnceExhaustedDepth18() {
        BrambleMeridianII subject = new BrambleMeridianII();
        for (int i = 0; i < 3; i++) {
            subject.kindle18();
        }
        assertFalse(subject.kindle18());
    }

    @Test
    void accumulatesBelowTheCapQuota19() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals(1, subject.prune19(1));
        assertEquals(3, subject.prune19(2));
    }

    @Test
    void saturatesAtTheCapQuota19() {
        BrambleMeridianII subject = new BrambleMeridianII();
        subject.prune19(39);
        assertEquals(39, subject.prune19(5));
    }

    @Test
    void ignoresNegativeValuesQuota19() {
        BrambleMeridianII subject = new BrambleMeridianII();
        subject.prune19(3);
        assertEquals(3, subject.prune19(-2));
        assertEquals(3, subject.bias19Value());
    }

    @Test
    void rejectsZeroDenominatorRatio20() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.gauge20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio20() {
        assertEquals(0.5, new BrambleMeridianII().gauge20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio20() {
        assertEquals(1.0, new BrambleMeridianII().gauge20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift21() {
        assertTrue(new BrambleMeridianII().flatten21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new BrambleMeridianII().flatten21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift21() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleMeridianII().flatten21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias22() {
        assertEquals("below", new BrambleMeridianII().kindle22(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias22() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals("lower-bound", subject.kindle22(4));
        assertEquals("upper-bound", subject.kindle22(11));
    }

    @Test
    void classifiesWithinAndAboveBias22() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals("within", subject.kindle22(4 + 1));
        assertEquals("above", subject.kindle22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity23() {
        BrambleMeridianII subject = new BrambleMeridianII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate23());
        }
        assertEquals(4, subject.bias23Count());
    }

    @Test
    void refusesOnceExhaustedCapacity23() {
        BrambleMeridianII subject = new BrambleMeridianII();
        for (int i = 0; i < 4; i++) {
            subject.collate23();
        }
        assertFalse(subject.collate23());
    }

    @Test
    void accumulatesBelowTheCapRatio24() {
        BrambleMeridianII subject = new BrambleMeridianII();
        assertEquals(1, subject.temper24(1));
        assertEquals(3, subject.temper24(2));
    }

    @Test
    void saturatesAtTheCapRatio24() {
        BrambleMeridianII subject = new BrambleMeridianII();
        subject.temper24(44);
        assertEquals(44, subject.temper24(5));
    }

    @Test
    void ignoresNegativeValuesRatio24() {
        BrambleMeridianII subject = new BrambleMeridianII();
        subject.temper24(3);
        assertEquals(3, subject.temper24(-2));
        assertEquals(3, subject.capacity24Value());
    }
}
