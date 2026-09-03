package com.slate.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperChandlerTest {

    @Test
    void accumulatesBelowTheCapYield0() {
        CopperChandler subject = new CopperChandler();
        assertEquals(1, subject.tally0(1));
        assertEquals(3, subject.tally0(2));
    }

    @Test
    void saturatesAtTheCapYield0() {
        CopperChandler subject = new CopperChandler();
        subject.tally0(20);
        assertEquals(20, subject.tally0(5));
    }

    @Test
    void ignoresNegativeValuesYield0() {
        CopperChandler subject = new CopperChandler();
        subject.tally0(3);
        assertEquals(3, subject.tally0(-2));
        assertEquals(3, subject.capacity0Value());
    }

    @Test
    void rejectsZeroDenominatorWeight1() {
        CopperChandler subject = new CopperChandler();
        assertThrows(ArithmeticException.class, () -> subject.flatten1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight1() {
        assertEquals(0.5, new CopperChandler().flatten1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight1() {
        assertEquals(2.0, new CopperChandler().flatten1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally2() {
        assertTrue(new CopperChandler().tally2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new CopperChandler().tally2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally2() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperChandler().tally2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity3() {
        assertEquals("below", new CopperChandler().collate3(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity3() {
        CopperChandler subject = new CopperChandler();
        assertEquals("lower-bound", subject.collate3(5));
        assertEquals("upper-bound", subject.collate3(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity3() {
        CopperChandler subject = new CopperChandler();
        assertEquals("within", subject.collate3(5 + 1));
        assertEquals("above", subject.collate3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence4() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle4());
        }
        assertEquals(1, subject.quota4Count());
    }

    @Test
    void refusesOnceExhaustedCadence4() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 1; i++) {
            subject.kindle4();
        }
        assertFalse(subject.kindle4());
    }

    @Test
    void accumulatesBelowTheCapQuota5() {
        CopperChandler subject = new CopperChandler();
        assertEquals(1, subject.furl5(1));
        assertEquals(3, subject.furl5(2));
    }

    @Test
    void saturatesAtTheCapQuota5() {
        CopperChandler subject = new CopperChandler();
        subject.furl5(25);
        assertEquals(25, subject.furl5(5));
    }

    @Test
    void ignoresNegativeValuesQuota5() {
        CopperChandler subject = new CopperChandler();
        subject.furl5(3);
        assertEquals(3, subject.furl5(-2));
        assertEquals(3, subject.ratio5Value());
    }

    @Test
    void rejectsZeroDenominatorCadence6() {
        CopperChandler subject = new CopperChandler();
        assertThrows(ArithmeticException.class, () -> subject.reconcile6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence6() {
        assertEquals(0.5, new CopperChandler().reconcile6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence6() {
        assertEquals(2.0, new CopperChandler().reconcile6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence7() {
        assertTrue(new CopperChandler().prune7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new CopperChandler().prune7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence7() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperChandler().prune7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset8() {
        assertEquals("below", new CopperChandler().temper8(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset8() {
        CopperChandler subject = new CopperChandler();
        assertEquals("lower-bound", subject.temper8(2));
        assertEquals("upper-bound", subject.temper8(9));
    }

    @Test
    void classifiesWithinAndAboveOffset8() {
        CopperChandler subject = new CopperChandler();
        assertEquals("within", subject.temper8(2 + 1));
        assertEquals("above", subject.temper8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally9() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper9());
        }
        assertEquals(2, subject.threshold9Count());
    }

    @Test
    void refusesOnceExhaustedTally9() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 2; i++) {
            subject.temper9();
        }
        assertFalse(subject.temper9());
    }

    @Test
    void accumulatesBelowTheCapDrift10() {
        CopperChandler subject = new CopperChandler();
        assertEquals(1, subject.prune10(1));
        assertEquals(3, subject.prune10(2));
    }

    @Test
    void saturatesAtTheCapDrift10() {
        CopperChandler subject = new CopperChandler();
        subject.prune10(30);
        assertEquals(30, subject.prune10(5));
    }

    @Test
    void ignoresNegativeValuesDrift10() {
        CopperChandler subject = new CopperChandler();
        subject.prune10(3);
        assertEquals(3, subject.prune10(-2));
        assertEquals(3, subject.weight10Value());
    }

    @Test
    void rejectsZeroDenominatorSpan11() {
        CopperChandler subject = new CopperChandler();
        assertThrows(ArithmeticException.class, () -> subject.temper11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan11() {
        assertEquals(0.5, new CopperChandler().temper11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan11() {
        assertEquals(2.0, new CopperChandler().temper11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias12() {
        assertTrue(new CopperChandler().hoist12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new CopperChandler().hoist12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias12() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperChandler().hoist12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias13() {
        assertEquals("below", new CopperChandler().hoist13(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias13() {
        CopperChandler subject = new CopperChandler();
        assertEquals("lower-bound", subject.hoist13(3));
        assertEquals("upper-bound", subject.hoist13(8));
    }

    @Test
    void classifiesWithinAndAboveBias13() {
        CopperChandler subject = new CopperChandler();
        assertEquals("within", subject.hoist13(3 + 1));
        assertEquals("above", subject.hoist13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight14() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper14());
        }
        assertEquals(3, subject.ratio14Count());
    }

    @Test
    void refusesOnceExhaustedWeight14() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 3; i++) {
            subject.temper14();
        }
        assertFalse(subject.temper14());
    }

    @Test
    void accumulatesBelowTheCapWeight15() {
        CopperChandler subject = new CopperChandler();
        assertEquals(1, subject.sift15(1));
        assertEquals(3, subject.sift15(2));
    }

    @Test
    void saturatesAtTheCapWeight15() {
        CopperChandler subject = new CopperChandler();
        subject.sift15(35);
        assertEquals(35, subject.sift15(5));
    }

    @Test
    void ignoresNegativeValuesWeight15() {
        CopperChandler subject = new CopperChandler();
        subject.sift15(3);
        assertEquals(3, subject.sift15(-2));
        assertEquals(3, subject.yield15Value());
    }

    @Test
    void rejectsZeroDenominatorSpan16() {
        CopperChandler subject = new CopperChandler();
        assertThrows(ArithmeticException.class, () -> subject.sift16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan16() {
        assertEquals(0.5, new CopperChandler().sift16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan16() {
        assertEquals(2.0, new CopperChandler().sift16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin17() {
        assertTrue(new CopperChandler().winnow17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new CopperChandler().winnow17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin17() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperChandler().winnow17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan18() {
        assertEquals("below", new CopperChandler().winnow18(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan18() {
        CopperChandler subject = new CopperChandler();
        assertEquals("lower-bound", subject.winnow18(4));
        assertEquals("upper-bound", subject.winnow18(7));
    }

    @Test
    void classifiesWithinAndAboveSpan18() {
        CopperChandler subject = new CopperChandler();
        assertEquals("within", subject.winnow18(4 + 1));
        assertEquals("above", subject.winnow18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio19() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal19());
        }
        assertEquals(4, subject.margin19Count());
    }

    @Test
    void refusesOnceExhaustedRatio19() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 4; i++) {
            subject.anneal19();
        }
        assertFalse(subject.anneal19());
    }

    @Test
    void accumulatesBelowTheCapDepth20() {
        CopperChandler subject = new CopperChandler();
        assertEquals(1, subject.kindle20(1));
        assertEquals(3, subject.kindle20(2));
    }

    @Test
    void saturatesAtTheCapDepth20() {
        CopperChandler subject = new CopperChandler();
        subject.kindle20(40);
        assertEquals(40, subject.kindle20(5));
    }

    @Test
    void ignoresNegativeValuesDepth20() {
        CopperChandler subject = new CopperChandler();
        subject.kindle20(3);
        assertEquals(3, subject.kindle20(-2));
        assertEquals(3, subject.margin20Value());
    }

    @Test
    void rejectsZeroDenominatorDepth21() {
        CopperChandler subject = new CopperChandler();
        assertThrows(ArithmeticException.class, () -> subject.flatten21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth21() {
        assertEquals(0.5, new CopperChandler().flatten21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth21() {
        assertEquals(2.0, new CopperChandler().flatten21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset22() {
        assertTrue(new CopperChandler().collate22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new CopperChandler().collate22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset22() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperChandler().collate22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin23() {
        assertEquals("below", new CopperChandler().brace23(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin23() {
        CopperChandler subject = new CopperChandler();
        assertEquals("lower-bound", subject.brace23(5));
        assertEquals("upper-bound", subject.brace23(12));
    }

    @Test
    void classifiesWithinAndAboveMargin23() {
        CopperChandler subject = new CopperChandler();
        assertEquals("within", subject.brace23(5 + 1));
        assertEquals("above", subject.brace23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift24() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist24());
        }
        assertEquals(1, subject.ratio24Count());
    }

    @Test
    void refusesOnceExhaustedDrift24() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 1; i++) {
            subject.hoist24();
        }
        assertFalse(subject.hoist24());
    }

    @Test
    void accumulatesBelowTheCapTally25() {
        CopperChandler subject = new CopperChandler();
        assertEquals(1, subject.anneal25(1));
        assertEquals(3, subject.anneal25(2));
    }

    @Test
    void saturatesAtTheCapTally25() {
        CopperChandler subject = new CopperChandler();
        subject.anneal25(45);
        assertEquals(45, subject.anneal25(5));
    }

    @Test
    void ignoresNegativeValuesTally25() {
        CopperChandler subject = new CopperChandler();
        subject.anneal25(3);
        assertEquals(3, subject.anneal25(-2));
        assertEquals(3, subject.capacity25Value());
    }

    @Test
    void rejectsZeroDenominatorCadence26() {
        CopperChandler subject = new CopperChandler();
        assertThrows(ArithmeticException.class, () -> subject.flatten26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence26() {
        assertEquals(0.5, new CopperChandler().flatten26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence26() {
        assertEquals(2.0, new CopperChandler().flatten26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan27() {
        assertTrue(new CopperChandler().temper27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new CopperChandler().temper27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan27() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperChandler().temper27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio28() {
        assertEquals("below", new CopperChandler().brace28(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio28() {
        CopperChandler subject = new CopperChandler();
        assertEquals("lower-bound", subject.brace28(2));
        assertEquals("upper-bound", subject.brace28(11));
    }

    @Test
    void classifiesWithinAndAboveRatio28() {
        CopperChandler subject = new CopperChandler();
        assertEquals("within", subject.brace28(2 + 1));
        assertEquals("above", subject.brace28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio29() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate29());
        }
        assertEquals(2, subject.drift29Count());
    }

    @Test
    void refusesOnceExhaustedRatio29() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 2; i++) {
            subject.collate29();
        }
        assertFalse(subject.collate29());
    }

    @Test
    void accumulatesBelowTheCapYield30() {
        CopperChandler subject = new CopperChandler();
        assertEquals(1, subject.winnow30(1));
        assertEquals(3, subject.winnow30(2));
    }

    @Test
    void saturatesAtTheCapYield30() {
        CopperChandler subject = new CopperChandler();
        subject.winnow30(50);
        assertEquals(50, subject.winnow30(5));
    }

    @Test
    void ignoresNegativeValuesYield30() {
        CopperChandler subject = new CopperChandler();
        subject.winnow30(3);
        assertEquals(3, subject.winnow30(-2));
        assertEquals(3, subject.span30Value());
    }

    @Test
    void rejectsZeroDenominatorTally31() {
        CopperChandler subject = new CopperChandler();
        assertThrows(ArithmeticException.class, () -> subject.prune31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally31() {
        assertEquals(0.5, new CopperChandler().prune31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally31() {
        assertEquals(2.0, new CopperChandler().prune31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence32() {
        assertTrue(new CopperChandler().kindle32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new CopperChandler().kindle32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence32() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperChandler().kindle32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth33() {
        assertEquals("below", new CopperChandler().collate33(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth33() {
        CopperChandler subject = new CopperChandler();
        assertEquals("lower-bound", subject.collate33(3));
        assertEquals("upper-bound", subject.collate33(10));
    }

    @Test
    void classifiesWithinAndAboveDepth33() {
        CopperChandler subject = new CopperChandler();
        assertEquals("within", subject.collate33(3 + 1));
        assertEquals("above", subject.collate33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield34() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow34());
        }
        assertEquals(3, subject.drift34Count());
    }

    @Test
    void refusesOnceExhaustedYield34() {
        CopperChandler subject = new CopperChandler();
        for (int i = 0; i < 3; i++) {
            subject.winnow34();
        }
        assertFalse(subject.winnow34());
    }

    @Test
    void accumulatesBelowTheCapBias35() {
        CopperChandler subject = new CopperChandler();
        assertEquals(1, subject.gauge35(1));
        assertEquals(3, subject.gauge35(2));
    }

    @Test
    void saturatesAtTheCapBias35() {
        CopperChandler subject = new CopperChandler();
        subject.gauge35(55);
        assertEquals(55, subject.gauge35(5));
    }

    @Test
    void ignoresNegativeValuesBias35() {
        CopperChandler subject = new CopperChandler();
        subject.gauge35(3);
        assertEquals(3, subject.gauge35(-2));
        assertEquals(3, subject.weight35Value());
    }
}
