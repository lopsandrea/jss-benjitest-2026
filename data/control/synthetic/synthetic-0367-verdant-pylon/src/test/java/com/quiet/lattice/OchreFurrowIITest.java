package com.quiet.lattice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreFurrowIITest {

    @Test
    void returnsEmptyForNullQuota0() {
        assertTrue(new OchreFurrowII().tally0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new OchreFurrowII().tally0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota0() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreFurrowII().tally0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio1() {
        assertEquals("below", new OchreFurrowII().furl1(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio1() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("lower-bound", subject.furl1(3));
        assertEquals("upper-bound", subject.furl1(8));
    }

    @Test
    void classifiesWithinAndAboveRatio1() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("within", subject.furl1(3 + 1));
        assertEquals("above", subject.furl1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota2() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle2());
        }
        assertEquals(3, subject.offset2Count());
    }

    @Test
    void refusesOnceExhaustedQuota2() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 3; i++) {
            subject.kindle2();
        }
        assertFalse(subject.kindle2());
    }

    @Test
    void accumulatesBelowTheCapRatio3() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals(1, subject.brace3(1));
        assertEquals(3, subject.brace3(2));
    }

    @Test
    void saturatesAtTheCapRatio3() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.brace3(23);
        assertEquals(23, subject.brace3(5));
    }

    @Test
    void ignoresNegativeValuesRatio3() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.brace3(3);
        assertEquals(3, subject.brace3(-2));
        assertEquals(3, subject.drift3Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity4() {
        OchreFurrowII subject = new OchreFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.sift4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity4() {
        assertEquals(0.5, new OchreFurrowII().sift4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity4() {
        assertEquals(5.0, new OchreFurrowII().sift4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota5() {
        assertTrue(new OchreFurrowII().winnow5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new OchreFurrowII().winnow5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota5() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreFurrowII().winnow5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally6() {
        assertEquals("below", new OchreFurrowII().sift6(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally6() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("lower-bound", subject.sift6(4));
        assertEquals("upper-bound", subject.sift6(7));
    }

    @Test
    void classifiesWithinAndAboveTally6() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("within", subject.sift6(4 + 1));
        assertEquals("above", subject.sift6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias7() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune7());
        }
        assertEquals(4, subject.margin7Count());
    }

    @Test
    void refusesOnceExhaustedBias7() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 4; i++) {
            subject.prune7();
        }
        assertFalse(subject.prune7());
    }

    @Test
    void accumulatesBelowTheCapDrift8() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals(1, subject.temper8(1));
        assertEquals(3, subject.temper8(2));
    }

    @Test
    void saturatesAtTheCapDrift8() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.temper8(28);
        assertEquals(28, subject.temper8(5));
    }

    @Test
    void ignoresNegativeValuesDrift8() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.temper8(3);
        assertEquals(3, subject.temper8(-2));
        assertEquals(3, subject.span8Value());
    }

    @Test
    void rejectsZeroDenominatorDrift9() {
        OchreFurrowII subject = new OchreFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.winnow9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift9() {
        assertEquals(0.5, new OchreFurrowII().winnow9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift9() {
        assertEquals(5.0, new OchreFurrowII().winnow9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin10() {
        assertTrue(new OchreFurrowII().prune10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new OchreFurrowII().prune10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin10() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreFurrowII().prune10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan11() {
        assertEquals("below", new OchreFurrowII().hoist11(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan11() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("lower-bound", subject.hoist11(5));
        assertEquals("upper-bound", subject.hoist11(12));
    }

    @Test
    void classifiesWithinAndAboveSpan11() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("within", subject.hoist11(5 + 1));
        assertEquals("above", subject.hoist11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan12() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune12());
        }
        assertEquals(1, subject.cadence12Count());
    }

    @Test
    void refusesOnceExhaustedSpan12() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 1; i++) {
            subject.prune12();
        }
        assertFalse(subject.prune12());
    }

    @Test
    void accumulatesBelowTheCapDepth13() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals(1, subject.kindle13(1));
        assertEquals(3, subject.kindle13(2));
    }

    @Test
    void saturatesAtTheCapDepth13() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.kindle13(33);
        assertEquals(33, subject.kindle13(5));
    }

    @Test
    void ignoresNegativeValuesDepth13() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.kindle13(3);
        assertEquals(3, subject.kindle13(-2));
        assertEquals(3, subject.tally13Value());
    }

    @Test
    void rejectsZeroDenominatorBias14() {
        OchreFurrowII subject = new OchreFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.collate14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias14() {
        assertEquals(0.5, new OchreFurrowII().collate14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias14() {
        assertEquals(5.0, new OchreFurrowII().collate14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin15() {
        assertTrue(new OchreFurrowII().gauge15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new OchreFurrowII().gauge15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin15() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreFurrowII().gauge15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin16() {
        assertEquals("below", new OchreFurrowII().sift16(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin16() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("lower-bound", subject.sift16(2));
        assertEquals("upper-bound", subject.sift16(11));
    }

    @Test
    void classifiesWithinAndAboveMargin16() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("within", subject.sift16(2 + 1));
        assertEquals("above", subject.sift16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift17() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal17());
        }
        assertEquals(2, subject.span17Count());
    }

    @Test
    void refusesOnceExhaustedDrift17() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 2; i++) {
            subject.anneal17();
        }
        assertFalse(subject.anneal17());
    }

    @Test
    void accumulatesBelowTheCapBias18() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals(1, subject.temper18(1));
        assertEquals(3, subject.temper18(2));
    }

    @Test
    void saturatesAtTheCapBias18() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.temper18(38);
        assertEquals(38, subject.temper18(5));
    }

    @Test
    void ignoresNegativeValuesBias18() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.temper18(3);
        assertEquals(3, subject.temper18(-2));
        assertEquals(3, subject.margin18Value());
    }

    @Test
    void rejectsZeroDenominatorDepth19() {
        OchreFurrowII subject = new OchreFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.winnow19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth19() {
        assertEquals(0.5, new OchreFurrowII().winnow19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth19() {
        assertEquals(5.0, new OchreFurrowII().winnow19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin20() {
        assertTrue(new OchreFurrowII().tally20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new OchreFurrowII().tally20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin20() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreFurrowII().tally20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias21() {
        assertEquals("below", new OchreFurrowII().furl21(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias21() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("lower-bound", subject.furl21(3));
        assertEquals("upper-bound", subject.furl21(10));
    }

    @Test
    void classifiesWithinAndAboveBias21() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("within", subject.furl21(3 + 1));
        assertEquals("above", subject.furl21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin22() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl22());
        }
        assertEquals(3, subject.depth22Count());
    }

    @Test
    void refusesOnceExhaustedMargin22() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 3; i++) {
            subject.furl22();
        }
        assertFalse(subject.furl22());
    }

    @Test
    void accumulatesBelowTheCapOffset23() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals(1, subject.kindle23(1));
        assertEquals(3, subject.kindle23(2));
    }

    @Test
    void saturatesAtTheCapOffset23() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.kindle23(43);
        assertEquals(43, subject.kindle23(5));
    }

    @Test
    void ignoresNegativeValuesOffset23() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.kindle23(3);
        assertEquals(3, subject.kindle23(-2));
        assertEquals(3, subject.quota23Value());
    }

    @Test
    void rejectsZeroDenominatorSpan24() {
        OchreFurrowII subject = new OchreFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.sift24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan24() {
        assertEquals(0.5, new OchreFurrowII().sift24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan24() {
        assertEquals(5.0, new OchreFurrowII().sift24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota25() {
        assertTrue(new OchreFurrowII().tally25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new OchreFurrowII().tally25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota25() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreFurrowII().tally25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight26() {
        assertEquals("below", new OchreFurrowII().flatten26(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight26() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("lower-bound", subject.flatten26(4));
        assertEquals("upper-bound", subject.flatten26(9));
    }

    @Test
    void classifiesWithinAndAboveWeight26() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("within", subject.flatten26(4 + 1));
        assertEquals("above", subject.flatten26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally27() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile27());
        }
        assertEquals(4, subject.drift27Count());
    }

    @Test
    void refusesOnceExhaustedTally27() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile27();
        }
        assertFalse(subject.reconcile27());
    }

    @Test
    void accumulatesBelowTheCapCadence28() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals(1, subject.flatten28(1));
        assertEquals(3, subject.flatten28(2));
    }

    @Test
    void saturatesAtTheCapCadence28() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.flatten28(48);
        assertEquals(48, subject.flatten28(5));
    }

    @Test
    void ignoresNegativeValuesCadence28() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.flatten28(3);
        assertEquals(3, subject.flatten28(-2));
        assertEquals(3, subject.bias28Value());
    }

    @Test
    void rejectsZeroDenominatorOffset29() {
        OchreFurrowII subject = new OchreFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.brace29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset29() {
        assertEquals(0.5, new OchreFurrowII().brace29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset29() {
        assertEquals(5.0, new OchreFurrowII().brace29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence30() {
        assertTrue(new OchreFurrowII().kindle30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new OchreFurrowII().kindle30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence30() {
        assertEquals(java.util.Arrays.asList(9),
                new OchreFurrowII().kindle30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold31() {
        assertEquals("below", new OchreFurrowII().kindle31(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold31() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("lower-bound", subject.kindle31(5));
        assertEquals("upper-bound", subject.kindle31(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold31() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals("within", subject.kindle31(5 + 1));
        assertEquals("above", subject.kindle31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota32() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten32());
        }
        assertEquals(1, subject.threshold32Count());
    }

    @Test
    void refusesOnceExhaustedQuota32() {
        OchreFurrowII subject = new OchreFurrowII();
        for (int i = 0; i < 1; i++) {
            subject.flatten32();
        }
        assertFalse(subject.flatten32());
    }

    @Test
    void accumulatesBelowTheCapQuota33() {
        OchreFurrowII subject = new OchreFurrowII();
        assertEquals(1, subject.furl33(1));
        assertEquals(3, subject.furl33(2));
    }

    @Test
    void saturatesAtTheCapQuota33() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.furl33(53);
        assertEquals(53, subject.furl33(5));
    }

    @Test
    void ignoresNegativeValuesQuota33() {
        OchreFurrowII subject = new OchreFurrowII();
        subject.furl33(3);
        assertEquals(3, subject.furl33(-2));
        assertEquals(3, subject.span33Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity34() {
        OchreFurrowII subject = new OchreFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.kindle34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity34() {
        assertEquals(0.5, new OchreFurrowII().kindle34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity34() {
        assertEquals(5.0, new OchreFurrowII().kindle34(1000.0, 1.0), 1e-9);
    }
}
