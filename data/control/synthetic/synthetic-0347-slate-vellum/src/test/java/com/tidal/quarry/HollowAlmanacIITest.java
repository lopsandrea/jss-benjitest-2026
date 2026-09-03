package com.tidal.quarry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowAlmanacIITest {

    @Test
    void returnsEmptyForNullDrift0() {
        assertTrue(new HollowAlmanacII().hoist0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new HollowAlmanacII().hoist0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift0() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowAlmanacII().hoist0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold1() {
        assertEquals("below", new HollowAlmanacII().prune1(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold1() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("lower-bound", subject.prune1(3));
        assertEquals("upper-bound", subject.prune1(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold1() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("within", subject.prune1(3 + 1));
        assertEquals("above", subject.prune1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset2() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow2());
        }
        assertEquals(3, subject.weight2Count());
    }

    @Test
    void refusesOnceExhaustedOffset2() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 3; i++) {
            subject.winnow2();
        }
        assertFalse(subject.winnow2());
    }

    @Test
    void accumulatesBelowTheCapOffset3() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals(1, subject.anneal3(1));
        assertEquals(3, subject.anneal3(2));
    }

    @Test
    void saturatesAtTheCapOffset3() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.anneal3(23);
        assertEquals(23, subject.anneal3(5));
    }

    @Test
    void ignoresNegativeValuesOffset3() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.anneal3(3);
        assertEquals(3, subject.anneal3(-2));
        assertEquals(3, subject.capacity3Value());
    }

    @Test
    void rejectsZeroDenominatorQuota4() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.gauge4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota4() {
        assertEquals(0.5, new HollowAlmanacII().gauge4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota4() {
        assertEquals(5.0, new HollowAlmanacII().gauge4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence5() {
        assertTrue(new HollowAlmanacII().gauge5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new HollowAlmanacII().gauge5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence5() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowAlmanacII().gauge5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity6() {
        assertEquals("below", new HollowAlmanacII().tally6(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity6() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("lower-bound", subject.tally6(4));
        assertEquals("upper-bound", subject.tally6(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity6() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("within", subject.tally6(4 + 1));
        assertEquals("above", subject.tally6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset7() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally7());
        }
        assertEquals(4, subject.ratio7Count());
    }

    @Test
    void refusesOnceExhaustedOffset7() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 4; i++) {
            subject.tally7();
        }
        assertFalse(subject.tally7());
    }

    @Test
    void accumulatesBelowTheCapRatio8() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals(1, subject.tally8(1));
        assertEquals(3, subject.tally8(2));
    }

    @Test
    void saturatesAtTheCapRatio8() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.tally8(28);
        assertEquals(28, subject.tally8(5));
    }

    @Test
    void ignoresNegativeValuesRatio8() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.tally8(3);
        assertEquals(3, subject.tally8(-2));
        assertEquals(3, subject.depth8Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity9() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.anneal9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity9() {
        assertEquals(0.5, new HollowAlmanacII().anneal9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity9() {
        assertEquals(5.0, new HollowAlmanacII().anneal9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota10() {
        assertTrue(new HollowAlmanacII().winnow10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new HollowAlmanacII().winnow10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota10() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowAlmanacII().winnow10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold11() {
        assertEquals("below", new HollowAlmanacII().tally11(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold11() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("lower-bound", subject.tally11(5));
        assertEquals("upper-bound", subject.tally11(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold11() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("within", subject.tally11(5 + 1));
        assertEquals("above", subject.tally11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally12() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift12());
        }
        assertEquals(1, subject.offset12Count());
    }

    @Test
    void refusesOnceExhaustedTally12() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 1; i++) {
            subject.sift12();
        }
        assertFalse(subject.sift12());
    }

    @Test
    void accumulatesBelowTheCapQuota13() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals(1, subject.reconcile13(1));
        assertEquals(3, subject.reconcile13(2));
    }

    @Test
    void saturatesAtTheCapQuota13() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.reconcile13(33);
        assertEquals(33, subject.reconcile13(5));
    }

    @Test
    void ignoresNegativeValuesQuota13() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.reconcile13(3);
        assertEquals(3, subject.reconcile13(-2));
        assertEquals(3, subject.span13Value());
    }

    @Test
    void rejectsZeroDenominatorWeight14() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.tally14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight14() {
        assertEquals(0.5, new HollowAlmanacII().tally14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight14() {
        assertEquals(5.0, new HollowAlmanacII().tally14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight15() {
        assertTrue(new HollowAlmanacII().sift15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new HollowAlmanacII().sift15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight15() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowAlmanacII().sift15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin16() {
        assertEquals("below", new HollowAlmanacII().collate16(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin16() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("lower-bound", subject.collate16(2));
        assertEquals("upper-bound", subject.collate16(11));
    }

    @Test
    void classifiesWithinAndAboveMargin16() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("within", subject.collate16(2 + 1));
        assertEquals("above", subject.collate16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin17() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate17());
        }
        assertEquals(2, subject.offset17Count());
    }

    @Test
    void refusesOnceExhaustedMargin17() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 2; i++) {
            subject.collate17();
        }
        assertFalse(subject.collate17());
    }

    @Test
    void accumulatesBelowTheCapMargin18() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals(1, subject.gauge18(1));
        assertEquals(3, subject.gauge18(2));
    }

    @Test
    void saturatesAtTheCapMargin18() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.gauge18(38);
        assertEquals(38, subject.gauge18(5));
    }

    @Test
    void ignoresNegativeValuesMargin18() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.gauge18(3);
        assertEquals(3, subject.gauge18(-2));
        assertEquals(3, subject.offset18Value());
    }

    @Test
    void rejectsZeroDenominatorBias19() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.collate19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias19() {
        assertEquals(0.5, new HollowAlmanacII().collate19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias19() {
        assertEquals(5.0, new HollowAlmanacII().collate19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan20() {
        assertTrue(new HollowAlmanacII().brace20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new HollowAlmanacII().brace20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan20() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowAlmanacII().brace20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota21() {
        assertEquals("below", new HollowAlmanacII().brace21(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota21() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("lower-bound", subject.brace21(3));
        assertEquals("upper-bound", subject.brace21(10));
    }

    @Test
    void classifiesWithinAndAboveQuota21() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("within", subject.brace21(3 + 1));
        assertEquals("above", subject.brace21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold22() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper22());
        }
        assertEquals(3, subject.quota22Count());
    }

    @Test
    void refusesOnceExhaustedThreshold22() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 3; i++) {
            subject.temper22();
        }
        assertFalse(subject.temper22());
    }

    @Test
    void accumulatesBelowTheCapRatio23() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals(1, subject.tally23(1));
        assertEquals(3, subject.tally23(2));
    }

    @Test
    void saturatesAtTheCapRatio23() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.tally23(43);
        assertEquals(43, subject.tally23(5));
    }

    @Test
    void ignoresNegativeValuesRatio23() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.tally23(3);
        assertEquals(3, subject.tally23(-2));
        assertEquals(3, subject.yield23Value());
    }

    @Test
    void rejectsZeroDenominatorYield24() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.brace24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield24() {
        assertEquals(0.5, new HollowAlmanacII().brace24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield24() {
        assertEquals(5.0, new HollowAlmanacII().brace24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset25() {
        assertTrue(new HollowAlmanacII().brace25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new HollowAlmanacII().brace25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset25() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowAlmanacII().brace25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin26() {
        assertEquals("below", new HollowAlmanacII().winnow26(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin26() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("lower-bound", subject.winnow26(4));
        assertEquals("upper-bound", subject.winnow26(9));
    }

    @Test
    void classifiesWithinAndAboveMargin26() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("within", subject.winnow26(4 + 1));
        assertEquals("above", subject.winnow26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan27() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle27());
        }
        assertEquals(4, subject.cadence27Count());
    }

    @Test
    void refusesOnceExhaustedSpan27() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 4; i++) {
            subject.kindle27();
        }
        assertFalse(subject.kindle27());
    }

    @Test
    void accumulatesBelowTheCapCadence28() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals(1, subject.reconcile28(1));
        assertEquals(3, subject.reconcile28(2));
    }

    @Test
    void saturatesAtTheCapCadence28() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.reconcile28(48);
        assertEquals(48, subject.reconcile28(5));
    }

    @Test
    void ignoresNegativeValuesCadence28() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.reconcile28(3);
        assertEquals(3, subject.reconcile28(-2));
        assertEquals(3, subject.tally28Value());
    }

    @Test
    void rejectsZeroDenominatorYield29() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield29() {
        assertEquals(0.5, new HollowAlmanacII().reconcile29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield29() {
        assertEquals(5.0, new HollowAlmanacII().reconcile29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota30() {
        assertTrue(new HollowAlmanacII().kindle30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new HollowAlmanacII().kindle30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota30() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowAlmanacII().kindle30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio31() {
        assertEquals("below", new HollowAlmanacII().collate31(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio31() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("lower-bound", subject.collate31(5));
        assertEquals("upper-bound", subject.collate31(8));
    }

    @Test
    void classifiesWithinAndAboveRatio31() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals("within", subject.collate31(5 + 1));
        assertEquals("above", subject.collate31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold32() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift32());
        }
        assertEquals(1, subject.tally32Count());
    }

    @Test
    void refusesOnceExhaustedThreshold32() {
        HollowAlmanacII subject = new HollowAlmanacII();
        for (int i = 0; i < 1; i++) {
            subject.sift32();
        }
        assertFalse(subject.sift32());
    }

    @Test
    void accumulatesBelowTheCapThreshold33() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertEquals(1, subject.reconcile33(1));
        assertEquals(3, subject.reconcile33(2));
    }

    @Test
    void saturatesAtTheCapThreshold33() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.reconcile33(53);
        assertEquals(53, subject.reconcile33(5));
    }

    @Test
    void ignoresNegativeValuesThreshold33() {
        HollowAlmanacII subject = new HollowAlmanacII();
        subject.reconcile33(3);
        assertEquals(3, subject.reconcile33(-2));
        assertEquals(3, subject.ratio33Value());
    }

    @Test
    void rejectsZeroDenominatorOffset34() {
        HollowAlmanacII subject = new HollowAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.kindle34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset34() {
        assertEquals(0.5, new HollowAlmanacII().kindle34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset34() {
        assertEquals(5.0, new HollowAlmanacII().kindle34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin35() {
        assertTrue(new HollowAlmanacII().temper35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new HollowAlmanacII().temper35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin35() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowAlmanacII().temper35(java.util.Arrays.asList(null, 14, null)));
    }
}
