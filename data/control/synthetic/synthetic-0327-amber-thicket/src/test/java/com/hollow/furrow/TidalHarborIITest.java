package com.hollow.furrow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalHarborIITest {

    @Test
    void returnsEmptyForNullDrift0() {
        assertTrue(new TidalHarborII().gauge0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new TidalHarborII().gauge0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift0() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalHarborII().gauge0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias1() {
        assertEquals("below", new TidalHarborII().tally1(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias1() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals("lower-bound", subject.tally1(3));
        assertEquals("upper-bound", subject.tally1(8));
    }

    @Test
    void classifiesWithinAndAboveBias1() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals("within", subject.tally1(3 + 1));
        assertEquals("above", subject.tally1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias2() {
        TidalHarborII subject = new TidalHarborII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl2());
        }
        assertEquals(3, subject.tally2Count());
    }

    @Test
    void refusesOnceExhaustedBias2() {
        TidalHarborII subject = new TidalHarborII();
        for (int i = 0; i < 3; i++) {
            subject.furl2();
        }
        assertFalse(subject.furl2());
    }

    @Test
    void accumulatesBelowTheCapQuota3() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals(1, subject.sift3(1));
        assertEquals(3, subject.sift3(2));
    }

    @Test
    void saturatesAtTheCapQuota3() {
        TidalHarborII subject = new TidalHarborII();
        subject.sift3(23);
        assertEquals(23, subject.sift3(5));
    }

    @Test
    void ignoresNegativeValuesQuota3() {
        TidalHarborII subject = new TidalHarborII();
        subject.sift3(3);
        assertEquals(3, subject.sift3(-2));
        assertEquals(3, subject.weight3Value());
    }

    @Test
    void rejectsZeroDenominatorCadence4() {
        TidalHarborII subject = new TidalHarborII();
        assertThrows(ArithmeticException.class, () -> subject.tally4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence4() {
        assertEquals(0.5, new TidalHarborII().tally4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence4() {
        assertEquals(5.0, new TidalHarborII().tally4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset5() {
        assertTrue(new TidalHarborII().winnow5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new TidalHarborII().winnow5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset5() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalHarborII().winnow5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin6() {
        assertEquals("below", new TidalHarborII().reconcile6(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin6() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals("lower-bound", subject.reconcile6(4));
        assertEquals("upper-bound", subject.reconcile6(7));
    }

    @Test
    void classifiesWithinAndAboveMargin6() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals("within", subject.reconcile6(4 + 1));
        assertEquals("above", subject.reconcile6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth7() {
        TidalHarborII subject = new TidalHarborII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten7());
        }
        assertEquals(4, subject.quota7Count());
    }

    @Test
    void refusesOnceExhaustedDepth7() {
        TidalHarborII subject = new TidalHarborII();
        for (int i = 0; i < 4; i++) {
            subject.flatten7();
        }
        assertFalse(subject.flatten7());
    }

    @Test
    void accumulatesBelowTheCapQuota8() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals(1, subject.furl8(1));
        assertEquals(3, subject.furl8(2));
    }

    @Test
    void saturatesAtTheCapQuota8() {
        TidalHarborII subject = new TidalHarborII();
        subject.furl8(28);
        assertEquals(28, subject.furl8(5));
    }

    @Test
    void ignoresNegativeValuesQuota8() {
        TidalHarborII subject = new TidalHarborII();
        subject.furl8(3);
        assertEquals(3, subject.furl8(-2));
        assertEquals(3, subject.span8Value());
    }

    @Test
    void rejectsZeroDenominatorWeight9() {
        TidalHarborII subject = new TidalHarborII();
        assertThrows(ArithmeticException.class, () -> subject.anneal9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight9() {
        assertEquals(0.5, new TidalHarborII().anneal9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight9() {
        assertEquals(5.0, new TidalHarborII().anneal9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias10() {
        assertTrue(new TidalHarborII().furl10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new TidalHarborII().furl10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias10() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalHarborII().furl10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield11() {
        assertEquals("below", new TidalHarborII().reconcile11(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield11() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals("lower-bound", subject.reconcile11(5));
        assertEquals("upper-bound", subject.reconcile11(12));
    }

    @Test
    void classifiesWithinAndAboveYield11() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals("within", subject.reconcile11(5 + 1));
        assertEquals("above", subject.reconcile11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield12() {
        TidalHarborII subject = new TidalHarborII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally12());
        }
        assertEquals(1, subject.span12Count());
    }

    @Test
    void refusesOnceExhaustedYield12() {
        TidalHarborII subject = new TidalHarborII();
        for (int i = 0; i < 1; i++) {
            subject.tally12();
        }
        assertFalse(subject.tally12());
    }

    @Test
    void accumulatesBelowTheCapTally13() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals(1, subject.flatten13(1));
        assertEquals(3, subject.flatten13(2));
    }

    @Test
    void saturatesAtTheCapTally13() {
        TidalHarborII subject = new TidalHarborII();
        subject.flatten13(33);
        assertEquals(33, subject.flatten13(5));
    }

    @Test
    void ignoresNegativeValuesTally13() {
        TidalHarborII subject = new TidalHarborII();
        subject.flatten13(3);
        assertEquals(3, subject.flatten13(-2));
        assertEquals(3, subject.depth13Value());
    }

    @Test
    void rejectsZeroDenominatorBias14() {
        TidalHarborII subject = new TidalHarborII();
        assertThrows(ArithmeticException.class, () -> subject.flatten14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias14() {
        assertEquals(0.5, new TidalHarborII().flatten14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias14() {
        assertEquals(5.0, new TidalHarborII().flatten14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence15() {
        assertTrue(new TidalHarborII().winnow15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new TidalHarborII().winnow15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence15() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalHarborII().winnow15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan16() {
        assertEquals("below", new TidalHarborII().gauge16(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan16() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals("lower-bound", subject.gauge16(2));
        assertEquals("upper-bound", subject.gauge16(11));
    }

    @Test
    void classifiesWithinAndAboveSpan16() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals("within", subject.gauge16(2 + 1));
        assertEquals("above", subject.gauge16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias17() {
        TidalHarborII subject = new TidalHarborII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally17());
        }
        assertEquals(2, subject.tally17Count());
    }

    @Test
    void refusesOnceExhaustedBias17() {
        TidalHarborII subject = new TidalHarborII();
        for (int i = 0; i < 2; i++) {
            subject.tally17();
        }
        assertFalse(subject.tally17());
    }

    @Test
    void accumulatesBelowTheCapWeight18() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals(1, subject.furl18(1));
        assertEquals(3, subject.furl18(2));
    }

    @Test
    void saturatesAtTheCapWeight18() {
        TidalHarborII subject = new TidalHarborII();
        subject.furl18(38);
        assertEquals(38, subject.furl18(5));
    }

    @Test
    void ignoresNegativeValuesWeight18() {
        TidalHarborII subject = new TidalHarborII();
        subject.furl18(3);
        assertEquals(3, subject.furl18(-2));
        assertEquals(3, subject.quota18Value());
    }

    @Test
    void rejectsZeroDenominatorDrift19() {
        TidalHarborII subject = new TidalHarborII();
        assertThrows(ArithmeticException.class, () -> subject.prune19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift19() {
        assertEquals(0.5, new TidalHarborII().prune19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift19() {
        assertEquals(5.0, new TidalHarborII().prune19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset20() {
        assertTrue(new TidalHarborII().hoist20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new TidalHarborII().hoist20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset20() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalHarborII().hoist20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin21() {
        assertEquals("below", new TidalHarborII().furl21(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin21() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals("lower-bound", subject.furl21(3));
        assertEquals("upper-bound", subject.furl21(10));
    }

    @Test
    void classifiesWithinAndAboveMargin21() {
        TidalHarborII subject = new TidalHarborII();
        assertEquals("within", subject.furl21(3 + 1));
        assertEquals("above", subject.furl21(10 + 1));
    }
}
