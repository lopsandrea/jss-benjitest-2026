package com.pallid.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardPylonIIITest {

    @Test
    void returnsEmptyForNullSpan0() {
        assertTrue(new NorthwardPylonIII().kindle0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new NorthwardPylonIII().kindle0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan0() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardPylonIII().kindle0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias1() {
        assertEquals("below", new NorthwardPylonIII().kindle1(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias1() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("lower-bound", subject.kindle1(3));
        assertEquals("upper-bound", subject.kindle1(8));
    }

    @Test
    void classifiesWithinAndAboveBias1() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("within", subject.kindle1(3 + 1));
        assertEquals("above", subject.kindle1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally2() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal2());
        }
        assertEquals(3, subject.drift2Count());
    }

    @Test
    void refusesOnceExhaustedTally2() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 3; i++) {
            subject.anneal2();
        }
        assertFalse(subject.anneal2());
    }

    @Test
    void accumulatesBelowTheCapCadence3() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals(1, subject.collate3(1));
        assertEquals(3, subject.collate3(2));
    }

    @Test
    void saturatesAtTheCapCadence3() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.collate3(23);
        assertEquals(23, subject.collate3(5));
    }

    @Test
    void ignoresNegativeValuesCadence3() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.collate3(3);
        assertEquals(3, subject.collate3(-2));
        assertEquals(3, subject.tally3Value());
    }

    @Test
    void rejectsZeroDenominatorBias4() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertThrows(ArithmeticException.class, () -> subject.collate4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias4() {
        assertEquals(0.5, new NorthwardPylonIII().collate4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias4() {
        assertEquals(5.0, new NorthwardPylonIII().collate4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield5() {
        assertTrue(new NorthwardPylonIII().temper5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new NorthwardPylonIII().temper5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield5() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardPylonIII().temper5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth6() {
        assertEquals("below", new NorthwardPylonIII().gauge6(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth6() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("lower-bound", subject.gauge6(4));
        assertEquals("upper-bound", subject.gauge6(7));
    }

    @Test
    void classifiesWithinAndAboveDepth6() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("within", subject.gauge6(4 + 1));
        assertEquals("above", subject.gauge6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity7() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal7());
        }
        assertEquals(4, subject.ratio7Count());
    }

    @Test
    void refusesOnceExhaustedCapacity7() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 4; i++) {
            subject.anneal7();
        }
        assertFalse(subject.anneal7());
    }

    @Test
    void accumulatesBelowTheCapBias8() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals(1, subject.kindle8(1));
        assertEquals(3, subject.kindle8(2));
    }

    @Test
    void saturatesAtTheCapBias8() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.kindle8(28);
        assertEquals(28, subject.kindle8(5));
    }

    @Test
    void ignoresNegativeValuesBias8() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.kindle8(3);
        assertEquals(3, subject.kindle8(-2));
        assertEquals(3, subject.threshold8Value());
    }

    @Test
    void rejectsZeroDenominatorDrift9() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertThrows(ArithmeticException.class, () -> subject.brace9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift9() {
        assertEquals(0.5, new NorthwardPylonIII().brace9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift9() {
        assertEquals(5.0, new NorthwardPylonIII().brace9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota10() {
        assertTrue(new NorthwardPylonIII().sift10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new NorthwardPylonIII().sift10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota10() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardPylonIII().sift10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset11() {
        assertEquals("below", new NorthwardPylonIII().sift11(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset11() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("lower-bound", subject.sift11(5));
        assertEquals("upper-bound", subject.sift11(12));
    }

    @Test
    void classifiesWithinAndAboveOffset11() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("within", subject.sift11(5 + 1));
        assertEquals("above", subject.sift11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity12() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge12());
        }
        assertEquals(1, subject.offset12Count());
    }

    @Test
    void refusesOnceExhaustedCapacity12() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 1; i++) {
            subject.gauge12();
        }
        assertFalse(subject.gauge12());
    }

    @Test
    void accumulatesBelowTheCapTally13() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals(1, subject.hoist13(1));
        assertEquals(3, subject.hoist13(2));
    }

    @Test
    void saturatesAtTheCapTally13() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.hoist13(33);
        assertEquals(33, subject.hoist13(5));
    }

    @Test
    void ignoresNegativeValuesTally13() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.hoist13(3);
        assertEquals(3, subject.hoist13(-2));
        assertEquals(3, subject.threshold13Value());
    }

    @Test
    void rejectsZeroDenominatorDepth14() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth14() {
        assertEquals(0.5, new NorthwardPylonIII().gauge14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth14() {
        assertEquals(5.0, new NorthwardPylonIII().gauge14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth15() {
        assertTrue(new NorthwardPylonIII().kindle15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new NorthwardPylonIII().kindle15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth15() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardPylonIII().kindle15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota16() {
        assertEquals("below", new NorthwardPylonIII().tally16(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota16() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("lower-bound", subject.tally16(2));
        assertEquals("upper-bound", subject.tally16(11));
    }

    @Test
    void classifiesWithinAndAboveQuota16() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("within", subject.tally16(2 + 1));
        assertEquals("above", subject.tally16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth17() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge17());
        }
        assertEquals(2, subject.offset17Count());
    }

    @Test
    void refusesOnceExhaustedDepth17() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 2; i++) {
            subject.gauge17();
        }
        assertFalse(subject.gauge17());
    }

    @Test
    void accumulatesBelowTheCapYield18() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals(1, subject.gauge18(1));
        assertEquals(3, subject.gauge18(2));
    }

    @Test
    void saturatesAtTheCapYield18() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.gauge18(38);
        assertEquals(38, subject.gauge18(5));
    }

    @Test
    void ignoresNegativeValuesYield18() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.gauge18(3);
        assertEquals(3, subject.gauge18(-2));
        assertEquals(3, subject.bias18Value());
    }

    @Test
    void rejectsZeroDenominatorMargin19() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertThrows(ArithmeticException.class, () -> subject.tally19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin19() {
        assertEquals(0.5, new NorthwardPylonIII().tally19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin19() {
        assertEquals(5.0, new NorthwardPylonIII().tally19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio20() {
        assertTrue(new NorthwardPylonIII().furl20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new NorthwardPylonIII().furl20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio20() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardPylonIII().furl20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence21() {
        assertEquals("below", new NorthwardPylonIII().gauge21(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence21() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("lower-bound", subject.gauge21(3));
        assertEquals("upper-bound", subject.gauge21(10));
    }

    @Test
    void classifiesWithinAndAboveCadence21() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("within", subject.gauge21(3 + 1));
        assertEquals("above", subject.gauge21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift22() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune22());
        }
        assertEquals(3, subject.tally22Count());
    }

    @Test
    void refusesOnceExhaustedDrift22() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 3; i++) {
            subject.prune22();
        }
        assertFalse(subject.prune22());
    }

    @Test
    void accumulatesBelowTheCapTally23() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals(1, subject.hoist23(1));
        assertEquals(3, subject.hoist23(2));
    }

    @Test
    void saturatesAtTheCapTally23() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.hoist23(43);
        assertEquals(43, subject.hoist23(5));
    }

    @Test
    void ignoresNegativeValuesTally23() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.hoist23(3);
        assertEquals(3, subject.hoist23(-2));
        assertEquals(3, subject.threshold23Value());
    }

    @Test
    void rejectsZeroDenominatorBias24() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias24() {
        assertEquals(0.5, new NorthwardPylonIII().kindle24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias24() {
        assertEquals(5.0, new NorthwardPylonIII().kindle24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan25() {
        assertTrue(new NorthwardPylonIII().gauge25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new NorthwardPylonIII().gauge25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan25() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardPylonIII().gauge25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold26() {
        assertEquals("below", new NorthwardPylonIII().flatten26(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold26() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("lower-bound", subject.flatten26(4));
        assertEquals("upper-bound", subject.flatten26(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold26() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("within", subject.flatten26(4 + 1));
        assertEquals("above", subject.flatten26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield27() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist27());
        }
        assertEquals(4, subject.capacity27Count());
    }

    @Test
    void refusesOnceExhaustedYield27() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 4; i++) {
            subject.hoist27();
        }
        assertFalse(subject.hoist27());
    }

    @Test
    void accumulatesBelowTheCapBias28() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals(1, subject.prune28(1));
        assertEquals(3, subject.prune28(2));
    }

    @Test
    void saturatesAtTheCapBias28() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.prune28(48);
        assertEquals(48, subject.prune28(5));
    }

    @Test
    void ignoresNegativeValuesBias28() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.prune28(3);
        assertEquals(3, subject.prune28(-2));
        assertEquals(3, subject.ratio28Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold29() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertThrows(ArithmeticException.class, () -> subject.sift29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold29() {
        assertEquals(0.5, new NorthwardPylonIII().sift29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold29() {
        assertEquals(5.0, new NorthwardPylonIII().sift29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth30() {
        assertTrue(new NorthwardPylonIII().brace30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new NorthwardPylonIII().brace30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth30() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardPylonIII().brace30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity31() {
        assertEquals("below", new NorthwardPylonIII().prune31(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity31() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("lower-bound", subject.prune31(5));
        assertEquals("upper-bound", subject.prune31(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity31() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("within", subject.prune31(5 + 1));
        assertEquals("above", subject.prune31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin32() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace32());
        }
        assertEquals(1, subject.threshold32Count());
    }

    @Test
    void refusesOnceExhaustedMargin32() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 1; i++) {
            subject.brace32();
        }
        assertFalse(subject.brace32());
    }

    @Test
    void accumulatesBelowTheCapWeight33() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals(1, subject.collate33(1));
        assertEquals(3, subject.collate33(2));
    }

    @Test
    void saturatesAtTheCapWeight33() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.collate33(53);
        assertEquals(53, subject.collate33(5));
    }

    @Test
    void ignoresNegativeValuesWeight33() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.collate33(3);
        assertEquals(3, subject.collate33(-2));
        assertEquals(3, subject.ratio33Value());
    }

    @Test
    void rejectsZeroDenominatorYield34() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield34() {
        assertEquals(0.5, new NorthwardPylonIII().flatten34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield34() {
        assertEquals(5.0, new NorthwardPylonIII().flatten34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio35() {
        assertTrue(new NorthwardPylonIII().hoist35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new NorthwardPylonIII().hoist35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio35() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardPylonIII().hoist35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset36() {
        assertEquals("below", new NorthwardPylonIII().kindle36(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset36() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("lower-bound", subject.kindle36(2));
        assertEquals("upper-bound", subject.kindle36(7));
    }

    @Test
    void classifiesWithinAndAboveOffset36() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("within", subject.kindle36(2 + 1));
        assertEquals("above", subject.kindle36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset37() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift37());
        }
        assertEquals(2, subject.margin37Count());
    }

    @Test
    void refusesOnceExhaustedOffset37() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 2; i++) {
            subject.sift37();
        }
        assertFalse(subject.sift37());
    }

    @Test
    void accumulatesBelowTheCapOffset38() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals(1, subject.furl38(1));
        assertEquals(3, subject.furl38(2));
    }

    @Test
    void saturatesAtTheCapOffset38() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.furl38(58);
        assertEquals(58, subject.furl38(5));
    }

    @Test
    void ignoresNegativeValuesOffset38() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.furl38(3);
        assertEquals(3, subject.furl38(-2));
        assertEquals(3, subject.threshold38Value());
    }

    @Test
    void rejectsZeroDenominatorYield39() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertThrows(ArithmeticException.class, () -> subject.temper39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield39() {
        assertEquals(0.5, new NorthwardPylonIII().temper39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield39() {
        assertEquals(5.0, new NorthwardPylonIII().temper39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio40() {
        assertTrue(new NorthwardPylonIII().brace40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new NorthwardPylonIII().brace40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio40() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardPylonIII().brace40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield41() {
        assertEquals("below", new NorthwardPylonIII().temper41(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield41() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("lower-bound", subject.temper41(3));
        assertEquals("upper-bound", subject.temper41(12));
    }

    @Test
    void classifiesWithinAndAboveYield41() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("within", subject.temper41(3 + 1));
        assertEquals("above", subject.temper41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift42() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile42());
        }
        assertEquals(3, subject.yield42Count());
    }

    @Test
    void refusesOnceExhaustedDrift42() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile42();
        }
        assertFalse(subject.reconcile42());
    }

    @Test
    void accumulatesBelowTheCapThreshold43() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals(1, subject.brace43(1));
        assertEquals(3, subject.brace43(2));
    }

    @Test
    void saturatesAtTheCapThreshold43() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.brace43(23);
        assertEquals(23, subject.brace43(5));
    }

    @Test
    void ignoresNegativeValuesThreshold43() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.brace43(3);
        assertEquals(3, subject.brace43(-2));
        assertEquals(3, subject.yield43Value());
    }

    @Test
    void rejectsZeroDenominatorDepth44() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth44() {
        assertEquals(0.5, new NorthwardPylonIII().reconcile44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth44() {
        assertEquals(5.0, new NorthwardPylonIII().reconcile44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan45() {
        assertTrue(new NorthwardPylonIII().prune45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new NorthwardPylonIII().prune45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan45() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardPylonIII().prune45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth46() {
        assertEquals("below", new NorthwardPylonIII().brace46(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth46() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("lower-bound", subject.brace46(4));
        assertEquals("upper-bound", subject.brace46(11));
    }

    @Test
    void classifiesWithinAndAboveDepth46() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("within", subject.brace46(4 + 1));
        assertEquals("above", subject.brace46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin47() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle47());
        }
        assertEquals(4, subject.weight47Count());
    }

    @Test
    void refusesOnceExhaustedMargin47() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 4; i++) {
            subject.kindle47();
        }
        assertFalse(subject.kindle47());
    }

    @Test
    void accumulatesBelowTheCapDepth48() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals(1, subject.sift48(1));
        assertEquals(3, subject.sift48(2));
    }

    @Test
    void saturatesAtTheCapDepth48() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.sift48(28);
        assertEquals(28, subject.sift48(5));
    }

    @Test
    void ignoresNegativeValuesDepth48() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.sift48(3);
        assertEquals(3, subject.sift48(-2));
        assertEquals(3, subject.weight48Value());
    }

    @Test
    void rejectsZeroDenominatorCadence49() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertThrows(ArithmeticException.class, () -> subject.temper49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence49() {
        assertEquals(0.5, new NorthwardPylonIII().temper49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence49() {
        assertEquals(5.0, new NorthwardPylonIII().temper49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin50() {
        assertTrue(new NorthwardPylonIII().temper50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new NorthwardPylonIII().temper50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin50() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardPylonIII().temper50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift51() {
        assertEquals("below", new NorthwardPylonIII().gauge51(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift51() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("lower-bound", subject.gauge51(5));
        assertEquals("upper-bound", subject.gauge51(10));
    }

    @Test
    void classifiesWithinAndAboveDrift51() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals("within", subject.gauge51(5 + 1));
        assertEquals("above", subject.gauge51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield52() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace52());
        }
        assertEquals(1, subject.margin52Count());
    }

    @Test
    void refusesOnceExhaustedYield52() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        for (int i = 0; i < 1; i++) {
            subject.brace52();
        }
        assertFalse(subject.brace52());
    }

    @Test
    void accumulatesBelowTheCapQuota53() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertEquals(1, subject.tally53(1));
        assertEquals(3, subject.tally53(2));
    }

    @Test
    void saturatesAtTheCapQuota53() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.tally53(33);
        assertEquals(33, subject.tally53(5));
    }

    @Test
    void ignoresNegativeValuesQuota53() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        subject.tally53(3);
        assertEquals(3, subject.tally53(-2));
        assertEquals(3, subject.weight53Value());
    }

    @Test
    void rejectsZeroDenominatorRatio54() {
        NorthwardPylonIII subject = new NorthwardPylonIII();
        assertThrows(ArithmeticException.class, () -> subject.tally54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio54() {
        assertEquals(0.5, new NorthwardPylonIII().tally54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio54() {
        assertEquals(5.0, new NorthwardPylonIII().tally54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield55() {
        assertTrue(new NorthwardPylonIII().hoist55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new NorthwardPylonIII().hoist55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield55() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardPylonIII().hoist55(java.util.Arrays.asList(null, 7, null)));
    }
}
