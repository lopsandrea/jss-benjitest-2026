package com.tidal.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenHarborTest {

    @Test
    void accumulatesBelowTheCapDepth0() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals(1, subject.tally0(1));
        assertEquals(3, subject.tally0(2));
    }

    @Test
    void saturatesAtTheCapDepth0() {
        AshenHarbor subject = new AshenHarbor();
        subject.tally0(20);
        assertEquals(20, subject.tally0(5));
    }

    @Test
    void ignoresNegativeValuesDepth0() {
        AshenHarbor subject = new AshenHarbor();
        subject.tally0(3);
        assertEquals(3, subject.tally0(-2));
        assertEquals(3, subject.bias0Value());
    }

    @Test
    void rejectsZeroDenominatorWeight1() {
        AshenHarbor subject = new AshenHarbor();
        assertThrows(ArithmeticException.class, () -> subject.reconcile1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight1() {
        assertEquals(0.5, new AshenHarbor().reconcile1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight1() {
        assertEquals(2.0, new AshenHarbor().reconcile1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin2() {
        assertTrue(new AshenHarbor().brace2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AshenHarbor().brace2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin2() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenHarbor().brace2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight3() {
        assertEquals("below", new AshenHarbor().anneal3(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight3() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("lower-bound", subject.anneal3(5));
        assertEquals("upper-bound", subject.anneal3(10));
    }

    @Test
    void classifiesWithinAndAboveWeight3() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("within", subject.anneal3(5 + 1));
        assertEquals("above", subject.anneal3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias4() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace4());
        }
        assertEquals(1, subject.depth4Count());
    }

    @Test
    void refusesOnceExhaustedBias4() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 1; i++) {
            subject.brace4();
        }
        assertFalse(subject.brace4());
    }

    @Test
    void accumulatesBelowTheCapRatio5() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals(1, subject.temper5(1));
        assertEquals(3, subject.temper5(2));
    }

    @Test
    void saturatesAtTheCapRatio5() {
        AshenHarbor subject = new AshenHarbor();
        subject.temper5(25);
        assertEquals(25, subject.temper5(5));
    }

    @Test
    void ignoresNegativeValuesRatio5() {
        AshenHarbor subject = new AshenHarbor();
        subject.temper5(3);
        assertEquals(3, subject.temper5(-2));
        assertEquals(3, subject.tally5Value());
    }

    @Test
    void rejectsZeroDenominatorOffset6() {
        AshenHarbor subject = new AshenHarbor();
        assertThrows(ArithmeticException.class, () -> subject.furl6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset6() {
        assertEquals(0.5, new AshenHarbor().furl6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset6() {
        assertEquals(2.0, new AshenHarbor().furl6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift7() {
        assertTrue(new AshenHarbor().prune7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AshenHarbor().prune7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift7() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenHarbor().prune7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity8() {
        assertEquals("below", new AshenHarbor().anneal8(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity8() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("lower-bound", subject.anneal8(2));
        assertEquals("upper-bound", subject.anneal8(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity8() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("within", subject.anneal8(2 + 1));
        assertEquals("above", subject.anneal8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift9() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally9());
        }
        assertEquals(2, subject.capacity9Count());
    }

    @Test
    void refusesOnceExhaustedDrift9() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 2; i++) {
            subject.tally9();
        }
        assertFalse(subject.tally9());
    }

    @Test
    void accumulatesBelowTheCapRatio10() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals(1, subject.gauge10(1));
        assertEquals(3, subject.gauge10(2));
    }

    @Test
    void saturatesAtTheCapRatio10() {
        AshenHarbor subject = new AshenHarbor();
        subject.gauge10(30);
        assertEquals(30, subject.gauge10(5));
    }

    @Test
    void ignoresNegativeValuesRatio10() {
        AshenHarbor subject = new AshenHarbor();
        subject.gauge10(3);
        assertEquals(3, subject.gauge10(-2));
        assertEquals(3, subject.margin10Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity11() {
        AshenHarbor subject = new AshenHarbor();
        assertThrows(ArithmeticException.class, () -> subject.furl11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity11() {
        assertEquals(0.5, new AshenHarbor().furl11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity11() {
        assertEquals(2.0, new AshenHarbor().furl11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold12() {
        assertTrue(new AshenHarbor().brace12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AshenHarbor().brace12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold12() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenHarbor().brace12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin13() {
        assertEquals("below", new AshenHarbor().brace13(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin13() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("lower-bound", subject.brace13(3));
        assertEquals("upper-bound", subject.brace13(8));
    }

    @Test
    void classifiesWithinAndAboveMargin13() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("within", subject.brace13(3 + 1));
        assertEquals("above", subject.brace13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset14() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge14());
        }
        assertEquals(3, subject.depth14Count());
    }

    @Test
    void refusesOnceExhaustedOffset14() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 3; i++) {
            subject.gauge14();
        }
        assertFalse(subject.gauge14());
    }

    @Test
    void accumulatesBelowTheCapCapacity15() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals(1, subject.kindle15(1));
        assertEquals(3, subject.kindle15(2));
    }

    @Test
    void saturatesAtTheCapCapacity15() {
        AshenHarbor subject = new AshenHarbor();
        subject.kindle15(35);
        assertEquals(35, subject.kindle15(5));
    }

    @Test
    void ignoresNegativeValuesCapacity15() {
        AshenHarbor subject = new AshenHarbor();
        subject.kindle15(3);
        assertEquals(3, subject.kindle15(-2));
        assertEquals(3, subject.weight15Value());
    }

    @Test
    void rejectsZeroDenominatorMargin16() {
        AshenHarbor subject = new AshenHarbor();
        assertThrows(ArithmeticException.class, () -> subject.anneal16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin16() {
        assertEquals(0.5, new AshenHarbor().anneal16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin16() {
        assertEquals(2.0, new AshenHarbor().anneal16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift17() {
        assertTrue(new AshenHarbor().gauge17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AshenHarbor().gauge17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift17() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenHarbor().gauge17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally18() {
        assertEquals("below", new AshenHarbor().winnow18(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally18() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("lower-bound", subject.winnow18(4));
        assertEquals("upper-bound", subject.winnow18(7));
    }

    @Test
    void classifiesWithinAndAboveTally18() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("within", subject.winnow18(4 + 1));
        assertEquals("above", subject.winnow18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota19() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten19());
        }
        assertEquals(4, subject.depth19Count());
    }

    @Test
    void refusesOnceExhaustedQuota19() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 4; i++) {
            subject.flatten19();
        }
        assertFalse(subject.flatten19());
    }

    @Test
    void accumulatesBelowTheCapCapacity20() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals(1, subject.sift20(1));
        assertEquals(3, subject.sift20(2));
    }

    @Test
    void saturatesAtTheCapCapacity20() {
        AshenHarbor subject = new AshenHarbor();
        subject.sift20(40);
        assertEquals(40, subject.sift20(5));
    }

    @Test
    void ignoresNegativeValuesCapacity20() {
        AshenHarbor subject = new AshenHarbor();
        subject.sift20(3);
        assertEquals(3, subject.sift20(-2));
        assertEquals(3, subject.yield20Value());
    }

    @Test
    void rejectsZeroDenominatorOffset21() {
        AshenHarbor subject = new AshenHarbor();
        assertThrows(ArithmeticException.class, () -> subject.sift21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset21() {
        assertEquals(0.5, new AshenHarbor().sift21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset21() {
        assertEquals(2.0, new AshenHarbor().sift21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin22() {
        assertTrue(new AshenHarbor().flatten22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new AshenHarbor().flatten22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin22() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenHarbor().flatten22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan23() {
        assertEquals("below", new AshenHarbor().flatten23(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan23() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("lower-bound", subject.flatten23(5));
        assertEquals("upper-bound", subject.flatten23(12));
    }

    @Test
    void classifiesWithinAndAboveSpan23() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("within", subject.flatten23(5 + 1));
        assertEquals("above", subject.flatten23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota24() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift24());
        }
        assertEquals(1, subject.ratio24Count());
    }

    @Test
    void refusesOnceExhaustedQuota24() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 1; i++) {
            subject.sift24();
        }
        assertFalse(subject.sift24());
    }

    @Test
    void accumulatesBelowTheCapBias25() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals(1, subject.sift25(1));
        assertEquals(3, subject.sift25(2));
    }

    @Test
    void saturatesAtTheCapBias25() {
        AshenHarbor subject = new AshenHarbor();
        subject.sift25(45);
        assertEquals(45, subject.sift25(5));
    }

    @Test
    void ignoresNegativeValuesBias25() {
        AshenHarbor subject = new AshenHarbor();
        subject.sift25(3);
        assertEquals(3, subject.sift25(-2));
        assertEquals(3, subject.span25Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity26() {
        AshenHarbor subject = new AshenHarbor();
        assertThrows(ArithmeticException.class, () -> subject.anneal26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity26() {
        assertEquals(0.5, new AshenHarbor().anneal26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity26() {
        assertEquals(2.0, new AshenHarbor().anneal26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield27() {
        assertTrue(new AshenHarbor().prune27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new AshenHarbor().prune27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield27() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenHarbor().prune27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset28() {
        assertEquals("below", new AshenHarbor().temper28(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset28() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("lower-bound", subject.temper28(2));
        assertEquals("upper-bound", subject.temper28(11));
    }

    @Test
    void classifiesWithinAndAboveOffset28() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("within", subject.temper28(2 + 1));
        assertEquals("above", subject.temper28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias29() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift29());
        }
        assertEquals(2, subject.capacity29Count());
    }

    @Test
    void refusesOnceExhaustedBias29() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 2; i++) {
            subject.sift29();
        }
        assertFalse(subject.sift29());
    }

    @Test
    void accumulatesBelowTheCapQuota30() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals(1, subject.hoist30(1));
        assertEquals(3, subject.hoist30(2));
    }

    @Test
    void saturatesAtTheCapQuota30() {
        AshenHarbor subject = new AshenHarbor();
        subject.hoist30(50);
        assertEquals(50, subject.hoist30(5));
    }

    @Test
    void ignoresNegativeValuesQuota30() {
        AshenHarbor subject = new AshenHarbor();
        subject.hoist30(3);
        assertEquals(3, subject.hoist30(-2));
        assertEquals(3, subject.ratio30Value());
    }

    @Test
    void rejectsZeroDenominatorCadence31() {
        AshenHarbor subject = new AshenHarbor();
        assertThrows(ArithmeticException.class, () -> subject.anneal31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence31() {
        assertEquals(0.5, new AshenHarbor().anneal31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence31() {
        assertEquals(2.0, new AshenHarbor().anneal31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias32() {
        assertTrue(new AshenHarbor().winnow32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new AshenHarbor().winnow32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias32() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenHarbor().winnow32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias33() {
        assertEquals("below", new AshenHarbor().temper33(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias33() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("lower-bound", subject.temper33(3));
        assertEquals("upper-bound", subject.temper33(10));
    }

    @Test
    void classifiesWithinAndAboveBias33() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("within", subject.temper33(3 + 1));
        assertEquals("above", subject.temper33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio34() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten34());
        }
        assertEquals(3, subject.capacity34Count());
    }

    @Test
    void refusesOnceExhaustedRatio34() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 3; i++) {
            subject.flatten34();
        }
        assertFalse(subject.flatten34());
    }

    @Test
    void accumulatesBelowTheCapSpan35() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals(1, subject.furl35(1));
        assertEquals(3, subject.furl35(2));
    }

    @Test
    void saturatesAtTheCapSpan35() {
        AshenHarbor subject = new AshenHarbor();
        subject.furl35(55);
        assertEquals(55, subject.furl35(5));
    }

    @Test
    void ignoresNegativeValuesSpan35() {
        AshenHarbor subject = new AshenHarbor();
        subject.furl35(3);
        assertEquals(3, subject.furl35(-2));
        assertEquals(3, subject.quota35Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold36() {
        AshenHarbor subject = new AshenHarbor();
        assertThrows(ArithmeticException.class, () -> subject.sift36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold36() {
        assertEquals(0.5, new AshenHarbor().sift36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold36() {
        assertEquals(2.0, new AshenHarbor().sift36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence37() {
        assertTrue(new AshenHarbor().prune37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new AshenHarbor().prune37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence37() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenHarbor().prune37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight38() {
        assertEquals("below", new AshenHarbor().prune38(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight38() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("lower-bound", subject.prune38(4));
        assertEquals("upper-bound", subject.prune38(9));
    }

    @Test
    void classifiesWithinAndAboveWeight38() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("within", subject.prune38(4 + 1));
        assertEquals("above", subject.prune38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight39() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow39());
        }
        assertEquals(4, subject.quota39Count());
    }

    @Test
    void refusesOnceExhaustedWeight39() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 4; i++) {
            subject.winnow39();
        }
        assertFalse(subject.winnow39());
    }

    @Test
    void accumulatesBelowTheCapSpan40() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals(1, subject.kindle40(1));
        assertEquals(3, subject.kindle40(2));
    }

    @Test
    void saturatesAtTheCapSpan40() {
        AshenHarbor subject = new AshenHarbor();
        subject.kindle40(20);
        assertEquals(20, subject.kindle40(5));
    }

    @Test
    void ignoresNegativeValuesSpan40() {
        AshenHarbor subject = new AshenHarbor();
        subject.kindle40(3);
        assertEquals(3, subject.kindle40(-2));
        assertEquals(3, subject.threshold40Value());
    }

    @Test
    void rejectsZeroDenominatorMargin41() {
        AshenHarbor subject = new AshenHarbor();
        assertThrows(ArithmeticException.class, () -> subject.furl41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin41() {
        assertEquals(0.5, new AshenHarbor().furl41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin41() {
        assertEquals(2.0, new AshenHarbor().furl41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset42() {
        assertTrue(new AshenHarbor().collate42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new AshenHarbor().collate42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset42() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenHarbor().collate42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin43() {
        assertEquals("below", new AshenHarbor().flatten43(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin43() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("lower-bound", subject.flatten43(5));
        assertEquals("upper-bound", subject.flatten43(8));
    }

    @Test
    void classifiesWithinAndAboveMargin43() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("within", subject.flatten43(5 + 1));
        assertEquals("above", subject.flatten43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota44() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle44());
        }
        assertEquals(1, subject.threshold44Count());
    }

    @Test
    void refusesOnceExhaustedQuota44() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 1; i++) {
            subject.kindle44();
        }
        assertFalse(subject.kindle44());
    }

    @Test
    void accumulatesBelowTheCapOffset45() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals(1, subject.brace45(1));
        assertEquals(3, subject.brace45(2));
    }

    @Test
    void saturatesAtTheCapOffset45() {
        AshenHarbor subject = new AshenHarbor();
        subject.brace45(25);
        assertEquals(25, subject.brace45(5));
    }

    @Test
    void ignoresNegativeValuesOffset45() {
        AshenHarbor subject = new AshenHarbor();
        subject.brace45(3);
        assertEquals(3, subject.brace45(-2));
        assertEquals(3, subject.span45Value());
    }

    @Test
    void rejectsZeroDenominatorMargin46() {
        AshenHarbor subject = new AshenHarbor();
        assertThrows(ArithmeticException.class, () -> subject.gauge46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin46() {
        assertEquals(0.5, new AshenHarbor().gauge46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin46() {
        assertEquals(2.0, new AshenHarbor().gauge46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth47() {
        assertTrue(new AshenHarbor().anneal47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AshenHarbor().anneal47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth47() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenHarbor().anneal47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence48() {
        assertEquals("below", new AshenHarbor().brace48(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence48() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("lower-bound", subject.brace48(2));
        assertEquals("upper-bound", subject.brace48(7));
    }

    @Test
    void classifiesWithinAndAboveCadence48() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals("within", subject.brace48(2 + 1));
        assertEquals("above", subject.brace48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift49() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper49());
        }
        assertEquals(2, subject.span49Count());
    }

    @Test
    void refusesOnceExhaustedDrift49() {
        AshenHarbor subject = new AshenHarbor();
        for (int i = 0; i < 2; i++) {
            subject.temper49();
        }
        assertFalse(subject.temper49());
    }

    @Test
    void accumulatesBelowTheCapCapacity50() {
        AshenHarbor subject = new AshenHarbor();
        assertEquals(1, subject.tally50(1));
        assertEquals(3, subject.tally50(2));
    }

    @Test
    void saturatesAtTheCapCapacity50() {
        AshenHarbor subject = new AshenHarbor();
        subject.tally50(30);
        assertEquals(30, subject.tally50(5));
    }

    @Test
    void ignoresNegativeValuesCapacity50() {
        AshenHarbor subject = new AshenHarbor();
        subject.tally50(3);
        assertEquals(3, subject.tally50(-2));
        assertEquals(3, subject.quota50Value());
    }
}
