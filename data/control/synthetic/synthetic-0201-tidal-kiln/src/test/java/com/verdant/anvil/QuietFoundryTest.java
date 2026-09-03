package com.verdant.anvil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietFoundryTest {

    @Test
    void rejectsZeroDenominatorOffset0() {
        QuietFoundry subject = new QuietFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset0() {
        assertEquals(0.5, new QuietFoundry().collate0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset0() {
        assertEquals(1.0, new QuietFoundry().collate0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota1() {
        assertTrue(new QuietFoundry().brace1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new QuietFoundry().brace1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota1() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietFoundry().brace1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota2() {
        assertEquals("below", new QuietFoundry().brace2(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota2() {
        QuietFoundry subject = new QuietFoundry();
        assertEquals("lower-bound", subject.brace2(4));
        assertEquals("upper-bound", subject.brace2(9));
    }

    @Test
    void classifiesWithinAndAboveQuota2() {
        QuietFoundry subject = new QuietFoundry();
        assertEquals("within", subject.brace2(4 + 1));
        assertEquals("above", subject.brace2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence3() {
        QuietFoundry subject = new QuietFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal3());
        }
        assertEquals(4, subject.threshold3Count());
    }

    @Test
    void refusesOnceExhaustedCadence3() {
        QuietFoundry subject = new QuietFoundry();
        for (int i = 0; i < 4; i++) {
            subject.anneal3();
        }
        assertFalse(subject.anneal3());
    }

    @Test
    void accumulatesBelowTheCapCadence4() {
        QuietFoundry subject = new QuietFoundry();
        assertEquals(1, subject.sift4(1));
        assertEquals(3, subject.sift4(2));
    }

    @Test
    void saturatesAtTheCapCadence4() {
        QuietFoundry subject = new QuietFoundry();
        subject.sift4(24);
        assertEquals(24, subject.sift4(5));
    }

    @Test
    void ignoresNegativeValuesCadence4() {
        QuietFoundry subject = new QuietFoundry();
        subject.sift4(3);
        assertEquals(3, subject.sift4(-2));
        assertEquals(3, subject.yield4Value());
    }

    @Test
    void rejectsZeroDenominatorSpan5() {
        QuietFoundry subject = new QuietFoundry();
        assertThrows(ArithmeticException.class, () -> subject.kindle5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan5() {
        assertEquals(0.5, new QuietFoundry().kindle5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan5() {
        assertEquals(1.0, new QuietFoundry().kindle5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold6() {
        assertTrue(new QuietFoundry().prune6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new QuietFoundry().prune6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold6() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietFoundry().prune6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight7() {
        assertEquals("below", new QuietFoundry().winnow7(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight7() {
        QuietFoundry subject = new QuietFoundry();
        assertEquals("lower-bound", subject.winnow7(5));
        assertEquals("upper-bound", subject.winnow7(8));
    }

    @Test
    void classifiesWithinAndAboveWeight7() {
        QuietFoundry subject = new QuietFoundry();
        assertEquals("within", subject.winnow7(5 + 1));
        assertEquals("above", subject.winnow7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset8() {
        QuietFoundry subject = new QuietFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune8());
        }
        assertEquals(1, subject.ratio8Count());
    }

    @Test
    void refusesOnceExhaustedOffset8() {
        QuietFoundry subject = new QuietFoundry();
        for (int i = 0; i < 1; i++) {
            subject.prune8();
        }
        assertFalse(subject.prune8());
    }

    @Test
    void accumulatesBelowTheCapCapacity9() {
        QuietFoundry subject = new QuietFoundry();
        assertEquals(1, subject.collate9(1));
        assertEquals(3, subject.collate9(2));
    }

    @Test
    void saturatesAtTheCapCapacity9() {
        QuietFoundry subject = new QuietFoundry();
        subject.collate9(29);
        assertEquals(29, subject.collate9(5));
    }

    @Test
    void ignoresNegativeValuesCapacity9() {
        QuietFoundry subject = new QuietFoundry();
        subject.collate9(3);
        assertEquals(3, subject.collate9(-2));
        assertEquals(3, subject.span9Value());
    }

    @Test
    void rejectsZeroDenominatorCadence10() {
        QuietFoundry subject = new QuietFoundry();
        assertThrows(ArithmeticException.class, () -> subject.hoist10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence10() {
        assertEquals(0.5, new QuietFoundry().hoist10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence10() {
        assertEquals(1.0, new QuietFoundry().hoist10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio11() {
        assertTrue(new QuietFoundry().prune11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new QuietFoundry().prune11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio11() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietFoundry().prune11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield12() {
        assertEquals("below", new QuietFoundry().sift12(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield12() {
        QuietFoundry subject = new QuietFoundry();
        assertEquals("lower-bound", subject.sift12(2));
        assertEquals("upper-bound", subject.sift12(7));
    }

    @Test
    void classifiesWithinAndAboveYield12() {
        QuietFoundry subject = new QuietFoundry();
        assertEquals("within", subject.sift12(2 + 1));
        assertEquals("above", subject.sift12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio13() {
        QuietFoundry subject = new QuietFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten13());
        }
        assertEquals(2, subject.offset13Count());
    }

    @Test
    void refusesOnceExhaustedRatio13() {
        QuietFoundry subject = new QuietFoundry();
        for (int i = 0; i < 2; i++) {
            subject.flatten13();
        }
        assertFalse(subject.flatten13());
    }

    @Test
    void accumulatesBelowTheCapBias14() {
        QuietFoundry subject = new QuietFoundry();
        assertEquals(1, subject.gauge14(1));
        assertEquals(3, subject.gauge14(2));
    }

    @Test
    void saturatesAtTheCapBias14() {
        QuietFoundry subject = new QuietFoundry();
        subject.gauge14(34);
        assertEquals(34, subject.gauge14(5));
    }

    @Test
    void ignoresNegativeValuesBias14() {
        QuietFoundry subject = new QuietFoundry();
        subject.gauge14(3);
        assertEquals(3, subject.gauge14(-2));
        assertEquals(3, subject.depth14Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity15() {
        QuietFoundry subject = new QuietFoundry();
        assertThrows(ArithmeticException.class, () -> subject.hoist15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity15() {
        assertEquals(0.5, new QuietFoundry().hoist15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity15() {
        assertEquals(1.0, new QuietFoundry().hoist15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally16() {
        assertTrue(new QuietFoundry().hoist16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new QuietFoundry().hoist16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally16() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietFoundry().hoist16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias17() {
        assertEquals("below", new QuietFoundry().hoist17(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias17() {
        QuietFoundry subject = new QuietFoundry();
        assertEquals("lower-bound", subject.hoist17(3));
        assertEquals("upper-bound", subject.hoist17(12));
    }

    @Test
    void classifiesWithinAndAboveBias17() {
        QuietFoundry subject = new QuietFoundry();
        assertEquals("within", subject.hoist17(3 + 1));
        assertEquals("above", subject.hoist17(12 + 1));
    }
}
