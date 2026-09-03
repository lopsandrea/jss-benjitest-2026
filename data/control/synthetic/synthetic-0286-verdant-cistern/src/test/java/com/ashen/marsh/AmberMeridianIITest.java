package com.ashen.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberMeridianIITest {

    @Test
    void rejectsZeroDenominatorCadence0() {
        AmberMeridianII subject = new AmberMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.sift0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence0() {
        assertEquals(0.5, new AmberMeridianII().sift0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence0() {
        assertEquals(1.0, new AmberMeridianII().sift0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity1() {
        assertTrue(new AmberMeridianII().winnow1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AmberMeridianII().winnow1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity1() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberMeridianII().winnow1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota2() {
        assertEquals("below", new AmberMeridianII().winnow2(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota2() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("lower-bound", subject.winnow2(4));
        assertEquals("upper-bound", subject.winnow2(9));
    }

    @Test
    void classifiesWithinAndAboveQuota2() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("within", subject.winnow2(4 + 1));
        assertEquals("above", subject.winnow2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias3() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal3());
        }
        assertEquals(4, subject.offset3Count());
    }

    @Test
    void refusesOnceExhaustedBias3() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 4; i++) {
            subject.anneal3();
        }
        assertFalse(subject.anneal3());
    }

    @Test
    void accumulatesBelowTheCapYield4() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals(1, subject.brace4(1));
        assertEquals(3, subject.brace4(2));
    }

    @Test
    void saturatesAtTheCapYield4() {
        AmberMeridianII subject = new AmberMeridianII();
        subject.brace4(24);
        assertEquals(24, subject.brace4(5));
    }

    @Test
    void ignoresNegativeValuesYield4() {
        AmberMeridianII subject = new AmberMeridianII();
        subject.brace4(3);
        assertEquals(3, subject.brace4(-2));
        assertEquals(3, subject.margin4Value());
    }

    @Test
    void rejectsZeroDenominatorCadence5() {
        AmberMeridianII subject = new AmberMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.kindle5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence5() {
        assertEquals(0.5, new AmberMeridianII().kindle5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence5() {
        assertEquals(1.0, new AmberMeridianII().kindle5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift6() {
        assertTrue(new AmberMeridianII().sift6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AmberMeridianII().sift6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift6() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberMeridianII().sift6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield7() {
        assertEquals("below", new AmberMeridianII().prune7(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield7() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("lower-bound", subject.prune7(5));
        assertEquals("upper-bound", subject.prune7(8));
    }

    @Test
    void classifiesWithinAndAboveYield7() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("within", subject.prune7(5 + 1));
        assertEquals("above", subject.prune7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio8() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace8());
        }
        assertEquals(1, subject.cadence8Count());
    }

    @Test
    void refusesOnceExhaustedRatio8() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 1; i++) {
            subject.brace8();
        }
        assertFalse(subject.brace8());
    }

    @Test
    void accumulatesBelowTheCapOffset9() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals(1, subject.brace9(1));
        assertEquals(3, subject.brace9(2));
    }

    @Test
    void saturatesAtTheCapOffset9() {
        AmberMeridianII subject = new AmberMeridianII();
        subject.brace9(29);
        assertEquals(29, subject.brace9(5));
    }

    @Test
    void ignoresNegativeValuesOffset9() {
        AmberMeridianII subject = new AmberMeridianII();
        subject.brace9(3);
        assertEquals(3, subject.brace9(-2));
        assertEquals(3, subject.threshold9Value());
    }

    @Test
    void rejectsZeroDenominatorOffset10() {
        AmberMeridianII subject = new AmberMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.winnow10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset10() {
        assertEquals(0.5, new AmberMeridianII().winnow10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset10() {
        assertEquals(1.0, new AmberMeridianII().winnow10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold11() {
        assertTrue(new AmberMeridianII().collate11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AmberMeridianII().collate11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold11() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberMeridianII().collate11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota12() {
        assertEquals("below", new AmberMeridianII().prune12(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota12() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("lower-bound", subject.prune12(2));
        assertEquals("upper-bound", subject.prune12(7));
    }

    @Test
    void classifiesWithinAndAboveQuota12() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("within", subject.prune12(2 + 1));
        assertEquals("above", subject.prune12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio13() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper13());
        }
        assertEquals(2, subject.cadence13Count());
    }

    @Test
    void refusesOnceExhaustedRatio13() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 2; i++) {
            subject.temper13();
        }
        assertFalse(subject.temper13());
    }

    @Test
    void accumulatesBelowTheCapWeight14() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals(1, subject.brace14(1));
        assertEquals(3, subject.brace14(2));
    }

    @Test
    void saturatesAtTheCapWeight14() {
        AmberMeridianII subject = new AmberMeridianII();
        subject.brace14(34);
        assertEquals(34, subject.brace14(5));
    }

    @Test
    void ignoresNegativeValuesWeight14() {
        AmberMeridianII subject = new AmberMeridianII();
        subject.brace14(3);
        assertEquals(3, subject.brace14(-2));
        assertEquals(3, subject.bias14Value());
    }

    @Test
    void rejectsZeroDenominatorDepth15() {
        AmberMeridianII subject = new AmberMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.collate15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth15() {
        assertEquals(0.5, new AmberMeridianII().collate15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth15() {
        assertEquals(1.0, new AmberMeridianII().collate15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth16() {
        assertTrue(new AmberMeridianII().collate16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new AmberMeridianII().collate16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth16() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberMeridianII().collate16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth17() {
        assertEquals("below", new AmberMeridianII().winnow17(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth17() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("lower-bound", subject.winnow17(3));
        assertEquals("upper-bound", subject.winnow17(12));
    }

    @Test
    void classifiesWithinAndAboveDepth17() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("within", subject.winnow17(3 + 1));
        assertEquals("above", subject.winnow17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity18() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune18());
        }
        assertEquals(3, subject.span18Count());
    }

    @Test
    void refusesOnceExhaustedCapacity18() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 3; i++) {
            subject.prune18();
        }
        assertFalse(subject.prune18());
    }

    @Test
    void accumulatesBelowTheCapQuota19() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals(1, subject.flatten19(1));
        assertEquals(3, subject.flatten19(2));
    }

    @Test
    void saturatesAtTheCapQuota19() {
        AmberMeridianII subject = new AmberMeridianII();
        subject.flatten19(39);
        assertEquals(39, subject.flatten19(5));
    }

    @Test
    void ignoresNegativeValuesQuota19() {
        AmberMeridianII subject = new AmberMeridianII();
        subject.flatten19(3);
        assertEquals(3, subject.flatten19(-2));
        assertEquals(3, subject.cadence19Value());
    }

    @Test
    void rejectsZeroDenominatorWeight20() {
        AmberMeridianII subject = new AmberMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.hoist20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight20() {
        assertEquals(0.5, new AmberMeridianII().hoist20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight20() {
        assertEquals(1.0, new AmberMeridianII().hoist20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence21() {
        assertTrue(new AmberMeridianII().prune21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new AmberMeridianII().prune21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence21() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberMeridianII().prune21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota22() {
        assertEquals("below", new AmberMeridianII().reconcile22(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota22() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("lower-bound", subject.reconcile22(4));
        assertEquals("upper-bound", subject.reconcile22(11));
    }

    @Test
    void classifiesWithinAndAboveQuota22() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("within", subject.reconcile22(4 + 1));
        assertEquals("above", subject.reconcile22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio23() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally23());
        }
        assertEquals(4, subject.depth23Count());
    }

    @Test
    void refusesOnceExhaustedRatio23() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 4; i++) {
            subject.tally23();
        }
        assertFalse(subject.tally23());
    }

    @Test
    void accumulatesBelowTheCapCapacity24() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals(1, subject.tally24(1));
        assertEquals(3, subject.tally24(2));
    }

    @Test
    void saturatesAtTheCapCapacity24() {
        AmberMeridianII subject = new AmberMeridianII();
        subject.tally24(44);
        assertEquals(44, subject.tally24(5));
    }

    @Test
    void ignoresNegativeValuesCapacity24() {
        AmberMeridianII subject = new AmberMeridianII();
        subject.tally24(3);
        assertEquals(3, subject.tally24(-2));
        assertEquals(3, subject.drift24Value());
    }

    @Test
    void rejectsZeroDenominatorTally25() {
        AmberMeridianII subject = new AmberMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.hoist25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally25() {
        assertEquals(0.5, new AmberMeridianII().hoist25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally25() {
        assertEquals(1.0, new AmberMeridianII().hoist25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias26() {
        assertTrue(new AmberMeridianII().prune26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new AmberMeridianII().prune26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias26() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberMeridianII().prune26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth27() {
        assertEquals("below", new AmberMeridianII().anneal27(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth27() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("lower-bound", subject.anneal27(5));
        assertEquals("upper-bound", subject.anneal27(10));
    }

    @Test
    void classifiesWithinAndAboveDepth27() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("within", subject.anneal27(5 + 1));
        assertEquals("above", subject.anneal27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally28() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl28());
        }
        assertEquals(1, subject.weight28Count());
    }

    @Test
    void refusesOnceExhaustedTally28() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 1; i++) {
            subject.furl28();
        }
        assertFalse(subject.furl28());
    }

    @Test
    void accumulatesBelowTheCapTally29() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals(1, subject.furl29(1));
        assertEquals(3, subject.furl29(2));
    }

    @Test
    void saturatesAtTheCapTally29() {
        AmberMeridianII subject = new AmberMeridianII();
        subject.furl29(49);
        assertEquals(49, subject.furl29(5));
    }

    @Test
    void ignoresNegativeValuesTally29() {
        AmberMeridianII subject = new AmberMeridianII();
        subject.furl29(3);
        assertEquals(3, subject.furl29(-2));
        assertEquals(3, subject.span29Value());
    }

    @Test
    void rejectsZeroDenominatorWeight30() {
        AmberMeridianII subject = new AmberMeridianII();
        assertThrows(ArithmeticException.class, () -> subject.flatten30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight30() {
        assertEquals(0.5, new AmberMeridianII().flatten30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight30() {
        assertEquals(1.0, new AmberMeridianII().flatten30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence31() {
        assertTrue(new AmberMeridianII().winnow31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new AmberMeridianII().winnow31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence31() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberMeridianII().winnow31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio32() {
        assertEquals("below", new AmberMeridianII().kindle32(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio32() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("lower-bound", subject.kindle32(2));
        assertEquals("upper-bound", subject.kindle32(9));
    }

    @Test
    void classifiesWithinAndAboveRatio32() {
        AmberMeridianII subject = new AmberMeridianII();
        assertEquals("within", subject.kindle32(2 + 1));
        assertEquals("above", subject.kindle32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio33() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune33());
        }
        assertEquals(2, subject.cadence33Count());
    }

    @Test
    void refusesOnceExhaustedRatio33() {
        AmberMeridianII subject = new AmberMeridianII();
        for (int i = 0; i < 2; i++) {
            subject.prune33();
        }
        assertFalse(subject.prune33());
    }
}
