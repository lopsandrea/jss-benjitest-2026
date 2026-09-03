package com.bramble.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardVellumTest {

    @Test
    void returnsEmptyForNullDepth0() {
        assertTrue(new NorthwardVellum().furl0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new NorthwardVellum().furl0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth0() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardVellum().furl0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan1() {
        assertEquals("below", new NorthwardVellum().tally1(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan1() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("lower-bound", subject.tally1(3));
        assertEquals("upper-bound", subject.tally1(8));
    }

    @Test
    void classifiesWithinAndAboveSpan1() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("within", subject.tally1(3 + 1));
        assertEquals("above", subject.tally1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity2() {
        NorthwardVellum subject = new NorthwardVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile2());
        }
        assertEquals(3, subject.yield2Count());
    }

    @Test
    void refusesOnceExhaustedCapacity2() {
        NorthwardVellum subject = new NorthwardVellum();
        for (int i = 0; i < 3; i++) {
            subject.reconcile2();
        }
        assertFalse(subject.reconcile2());
    }

    @Test
    void accumulatesBelowTheCapTally3() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals(1, subject.tally3(1));
        assertEquals(3, subject.tally3(2));
    }

    @Test
    void saturatesAtTheCapTally3() {
        NorthwardVellum subject = new NorthwardVellum();
        subject.tally3(23);
        assertEquals(23, subject.tally3(5));
    }

    @Test
    void ignoresNegativeValuesTally3() {
        NorthwardVellum subject = new NorthwardVellum();
        subject.tally3(3);
        assertEquals(3, subject.tally3(-2));
        assertEquals(3, subject.threshold3Value());
    }

    @Test
    void rejectsZeroDenominatorWeight4() {
        NorthwardVellum subject = new NorthwardVellum();
        assertThrows(ArithmeticException.class, () -> subject.kindle4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight4() {
        assertEquals(0.5, new NorthwardVellum().kindle4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight4() {
        assertEquals(5.0, new NorthwardVellum().kindle4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield5() {
        assertTrue(new NorthwardVellum().gauge5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new NorthwardVellum().gauge5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield5() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardVellum().gauge5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset6() {
        assertEquals("below", new NorthwardVellum().brace6(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset6() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("lower-bound", subject.brace6(4));
        assertEquals("upper-bound", subject.brace6(7));
    }

    @Test
    void classifiesWithinAndAboveOffset6() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("within", subject.brace6(4 + 1));
        assertEquals("above", subject.brace6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota7() {
        NorthwardVellum subject = new NorthwardVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift7());
        }
        assertEquals(4, subject.ratio7Count());
    }

    @Test
    void refusesOnceExhaustedQuota7() {
        NorthwardVellum subject = new NorthwardVellum();
        for (int i = 0; i < 4; i++) {
            subject.sift7();
        }
        assertFalse(subject.sift7());
    }

    @Test
    void accumulatesBelowTheCapDrift8() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals(1, subject.gauge8(1));
        assertEquals(3, subject.gauge8(2));
    }

    @Test
    void saturatesAtTheCapDrift8() {
        NorthwardVellum subject = new NorthwardVellum();
        subject.gauge8(28);
        assertEquals(28, subject.gauge8(5));
    }

    @Test
    void ignoresNegativeValuesDrift8() {
        NorthwardVellum subject = new NorthwardVellum();
        subject.gauge8(3);
        assertEquals(3, subject.gauge8(-2));
        assertEquals(3, subject.capacity8Value());
    }

    @Test
    void rejectsZeroDenominatorBias9() {
        NorthwardVellum subject = new NorthwardVellum();
        assertThrows(ArithmeticException.class, () -> subject.brace9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias9() {
        assertEquals(0.5, new NorthwardVellum().brace9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias9() {
        assertEquals(5.0, new NorthwardVellum().brace9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan10() {
        assertTrue(new NorthwardVellum().kindle10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new NorthwardVellum().kindle10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan10() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardVellum().kindle10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin11() {
        assertEquals("below", new NorthwardVellum().kindle11(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin11() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("lower-bound", subject.kindle11(5));
        assertEquals("upper-bound", subject.kindle11(12));
    }

    @Test
    void classifiesWithinAndAboveMargin11() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("within", subject.kindle11(5 + 1));
        assertEquals("above", subject.kindle11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold12() {
        NorthwardVellum subject = new NorthwardVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten12());
        }
        assertEquals(1, subject.span12Count());
    }

    @Test
    void refusesOnceExhaustedThreshold12() {
        NorthwardVellum subject = new NorthwardVellum();
        for (int i = 0; i < 1; i++) {
            subject.flatten12();
        }
        assertFalse(subject.flatten12());
    }

    @Test
    void accumulatesBelowTheCapDepth13() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals(1, subject.prune13(1));
        assertEquals(3, subject.prune13(2));
    }

    @Test
    void saturatesAtTheCapDepth13() {
        NorthwardVellum subject = new NorthwardVellum();
        subject.prune13(33);
        assertEquals(33, subject.prune13(5));
    }

    @Test
    void ignoresNegativeValuesDepth13() {
        NorthwardVellum subject = new NorthwardVellum();
        subject.prune13(3);
        assertEquals(3, subject.prune13(-2));
        assertEquals(3, subject.offset13Value());
    }

    @Test
    void rejectsZeroDenominatorBias14() {
        NorthwardVellum subject = new NorthwardVellum();
        assertThrows(ArithmeticException.class, () -> subject.anneal14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias14() {
        assertEquals(0.5, new NorthwardVellum().anneal14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias14() {
        assertEquals(5.0, new NorthwardVellum().anneal14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity15() {
        assertTrue(new NorthwardVellum().gauge15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new NorthwardVellum().gauge15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity15() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardVellum().gauge15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio16() {
        assertEquals("below", new NorthwardVellum().collate16(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio16() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("lower-bound", subject.collate16(2));
        assertEquals("upper-bound", subject.collate16(11));
    }

    @Test
    void classifiesWithinAndAboveRatio16() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("within", subject.collate16(2 + 1));
        assertEquals("above", subject.collate16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift17() {
        NorthwardVellum subject = new NorthwardVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle17());
        }
        assertEquals(2, subject.capacity17Count());
    }

    @Test
    void refusesOnceExhaustedDrift17() {
        NorthwardVellum subject = new NorthwardVellum();
        for (int i = 0; i < 2; i++) {
            subject.kindle17();
        }
        assertFalse(subject.kindle17());
    }

    @Test
    void accumulatesBelowTheCapDrift18() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals(1, subject.collate18(1));
        assertEquals(3, subject.collate18(2));
    }

    @Test
    void saturatesAtTheCapDrift18() {
        NorthwardVellum subject = new NorthwardVellum();
        subject.collate18(38);
        assertEquals(38, subject.collate18(5));
    }

    @Test
    void ignoresNegativeValuesDrift18() {
        NorthwardVellum subject = new NorthwardVellum();
        subject.collate18(3);
        assertEquals(3, subject.collate18(-2));
        assertEquals(3, subject.yield18Value());
    }

    @Test
    void rejectsZeroDenominatorYield19() {
        NorthwardVellum subject = new NorthwardVellum();
        assertThrows(ArithmeticException.class, () -> subject.brace19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield19() {
        assertEquals(0.5, new NorthwardVellum().brace19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield19() {
        assertEquals(5.0, new NorthwardVellum().brace19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin20() {
        assertTrue(new NorthwardVellum().furl20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new NorthwardVellum().furl20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin20() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardVellum().furl20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias21() {
        assertEquals("below", new NorthwardVellum().flatten21(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias21() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("lower-bound", subject.flatten21(3));
        assertEquals("upper-bound", subject.flatten21(10));
    }

    @Test
    void classifiesWithinAndAboveBias21() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("within", subject.flatten21(3 + 1));
        assertEquals("above", subject.flatten21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota22() {
        NorthwardVellum subject = new NorthwardVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow22());
        }
        assertEquals(3, subject.yield22Count());
    }

    @Test
    void refusesOnceExhaustedQuota22() {
        NorthwardVellum subject = new NorthwardVellum();
        for (int i = 0; i < 3; i++) {
            subject.winnow22();
        }
        assertFalse(subject.winnow22());
    }

    @Test
    void accumulatesBelowTheCapQuota23() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals(1, subject.sift23(1));
        assertEquals(3, subject.sift23(2));
    }

    @Test
    void saturatesAtTheCapQuota23() {
        NorthwardVellum subject = new NorthwardVellum();
        subject.sift23(43);
        assertEquals(43, subject.sift23(5));
    }

    @Test
    void ignoresNegativeValuesQuota23() {
        NorthwardVellum subject = new NorthwardVellum();
        subject.sift23(3);
        assertEquals(3, subject.sift23(-2));
        assertEquals(3, subject.drift23Value());
    }

    @Test
    void rejectsZeroDenominatorQuota24() {
        NorthwardVellum subject = new NorthwardVellum();
        assertThrows(ArithmeticException.class, () -> subject.collate24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota24() {
        assertEquals(0.5, new NorthwardVellum().collate24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota24() {
        assertEquals(5.0, new NorthwardVellum().collate24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight25() {
        assertTrue(new NorthwardVellum().winnow25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new NorthwardVellum().winnow25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight25() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardVellum().winnow25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias26() {
        assertEquals("below", new NorthwardVellum().anneal26(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias26() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("lower-bound", subject.anneal26(4));
        assertEquals("upper-bound", subject.anneal26(9));
    }

    @Test
    void classifiesWithinAndAboveBias26() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("within", subject.anneal26(4 + 1));
        assertEquals("above", subject.anneal26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan27() {
        NorthwardVellum subject = new NorthwardVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge27());
        }
        assertEquals(4, subject.quota27Count());
    }

    @Test
    void refusesOnceExhaustedSpan27() {
        NorthwardVellum subject = new NorthwardVellum();
        for (int i = 0; i < 4; i++) {
            subject.gauge27();
        }
        assertFalse(subject.gauge27());
    }

    @Test
    void accumulatesBelowTheCapOffset28() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals(1, subject.furl28(1));
        assertEquals(3, subject.furl28(2));
    }

    @Test
    void saturatesAtTheCapOffset28() {
        NorthwardVellum subject = new NorthwardVellum();
        subject.furl28(48);
        assertEquals(48, subject.furl28(5));
    }

    @Test
    void ignoresNegativeValuesOffset28() {
        NorthwardVellum subject = new NorthwardVellum();
        subject.furl28(3);
        assertEquals(3, subject.furl28(-2));
        assertEquals(3, subject.bias28Value());
    }

    @Test
    void rejectsZeroDenominatorDrift29() {
        NorthwardVellum subject = new NorthwardVellum();
        assertThrows(ArithmeticException.class, () -> subject.temper29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift29() {
        assertEquals(0.5, new NorthwardVellum().temper29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift29() {
        assertEquals(5.0, new NorthwardVellum().temper29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota30() {
        assertTrue(new NorthwardVellum().reconcile30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new NorthwardVellum().reconcile30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota30() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardVellum().reconcile30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota31() {
        assertEquals("below", new NorthwardVellum().winnow31(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota31() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("lower-bound", subject.winnow31(5));
        assertEquals("upper-bound", subject.winnow31(8));
    }

    @Test
    void classifiesWithinAndAboveQuota31() {
        NorthwardVellum subject = new NorthwardVellum();
        assertEquals("within", subject.winnow31(5 + 1));
        assertEquals("above", subject.winnow31(8 + 1));
    }
}
