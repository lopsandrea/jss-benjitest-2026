package com.northward.vellum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardBastionTest {

    @Test
    void accumulatesBelowTheCapDepth0() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.prune0(1));
        assertEquals(3, subject.prune0(2));
    }

    @Test
    void saturatesAtTheCapDepth0() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.prune0(20);
        assertEquals(20, subject.prune0(5));
    }

    @Test
    void ignoresNegativeValuesDepth0() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.prune0(3);
        assertEquals(3, subject.prune0(-2));
        assertEquals(3, subject.threshold0Value());
    }

    @Test
    void rejectsZeroDenominatorDepth1() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.hoist1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth1() {
        assertEquals(0.5, new NorthwardBastion().hoist1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth1() {
        assertEquals(2.0, new NorthwardBastion().hoist1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity2() {
        assertTrue(new NorthwardBastion().kindle2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new NorthwardBastion().kindle2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity2() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardBastion().kindle2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth3() {
        assertEquals("below", new NorthwardBastion().anneal3(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth3() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.anneal3(5));
        assertEquals("upper-bound", subject.anneal3(10));
    }

    @Test
    void classifiesWithinAndAboveDepth3() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.anneal3(5 + 1));
        assertEquals("above", subject.anneal3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin4() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge4());
        }
        assertEquals(1, subject.threshold4Count());
    }

    @Test
    void refusesOnceExhaustedMargin4() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 1; i++) {
            subject.gauge4();
        }
        assertFalse(subject.gauge4());
    }

    @Test
    void accumulatesBelowTheCapSpan5() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.prune5(1));
        assertEquals(3, subject.prune5(2));
    }

    @Test
    void saturatesAtTheCapSpan5() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.prune5(25);
        assertEquals(25, subject.prune5(5));
    }

    @Test
    void ignoresNegativeValuesSpan5() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.prune5(3);
        assertEquals(3, subject.prune5(-2));
        assertEquals(3, subject.depth5Value());
    }

    @Test
    void rejectsZeroDenominatorWeight6() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.sift6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight6() {
        assertEquals(0.5, new NorthwardBastion().sift6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight6() {
        assertEquals(2.0, new NorthwardBastion().sift6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift7() {
        assertTrue(new NorthwardBastion().temper7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new NorthwardBastion().temper7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift7() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardBastion().temper7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth8() {
        assertEquals("below", new NorthwardBastion().gauge8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth8() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.gauge8(2));
        assertEquals("upper-bound", subject.gauge8(9));
    }

    @Test
    void classifiesWithinAndAboveDepth8() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.gauge8(2 + 1));
        assertEquals("above", subject.gauge8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan9() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow9());
        }
        assertEquals(2, subject.quota9Count());
    }

    @Test
    void refusesOnceExhaustedSpan9() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 2; i++) {
            subject.winnow9();
        }
        assertFalse(subject.winnow9());
    }

    @Test
    void accumulatesBelowTheCapWeight10() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.flatten10(1));
        assertEquals(3, subject.flatten10(2));
    }

    @Test
    void saturatesAtTheCapWeight10() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.flatten10(30);
        assertEquals(30, subject.flatten10(5));
    }

    @Test
    void ignoresNegativeValuesWeight10() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.flatten10(3);
        assertEquals(3, subject.flatten10(-2));
        assertEquals(3, subject.cadence10Value());
    }

    @Test
    void rejectsZeroDenominatorDrift11() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.hoist11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift11() {
        assertEquals(0.5, new NorthwardBastion().hoist11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift11() {
        assertEquals(2.0, new NorthwardBastion().hoist11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity12() {
        assertTrue(new NorthwardBastion().flatten12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new NorthwardBastion().flatten12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity12() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardBastion().flatten12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity13() {
        assertEquals("below", new NorthwardBastion().flatten13(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity13() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.flatten13(3));
        assertEquals("upper-bound", subject.flatten13(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity13() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.flatten13(3 + 1));
        assertEquals("above", subject.flatten13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight14() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace14());
        }
        assertEquals(3, subject.cadence14Count());
    }

    @Test
    void refusesOnceExhaustedWeight14() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 3; i++) {
            subject.brace14();
        }
        assertFalse(subject.brace14());
    }

    @Test
    void accumulatesBelowTheCapOffset15() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.gauge15(1));
        assertEquals(3, subject.gauge15(2));
    }

    @Test
    void saturatesAtTheCapOffset15() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.gauge15(35);
        assertEquals(35, subject.gauge15(5));
    }

    @Test
    void ignoresNegativeValuesOffset15() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.gauge15(3);
        assertEquals(3, subject.gauge15(-2));
        assertEquals(3, subject.cadence15Value());
    }

    @Test
    void rejectsZeroDenominatorBias16() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.furl16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias16() {
        assertEquals(0.5, new NorthwardBastion().furl16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias16() {
        assertEquals(2.0, new NorthwardBastion().furl16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence17() {
        assertTrue(new NorthwardBastion().tally17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new NorthwardBastion().tally17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence17() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardBastion().tally17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold18() {
        assertEquals("below", new NorthwardBastion().flatten18(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold18() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.flatten18(4));
        assertEquals("upper-bound", subject.flatten18(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold18() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.flatten18(4 + 1));
        assertEquals("above", subject.flatten18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota19() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten19());
        }
        assertEquals(4, subject.offset19Count());
    }

    @Test
    void refusesOnceExhaustedQuota19() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 4; i++) {
            subject.flatten19();
        }
        assertFalse(subject.flatten19());
    }

    @Test
    void accumulatesBelowTheCapTally20() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.reconcile20(1));
        assertEquals(3, subject.reconcile20(2));
    }

    @Test
    void saturatesAtTheCapTally20() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.reconcile20(40);
        assertEquals(40, subject.reconcile20(5));
    }

    @Test
    void ignoresNegativeValuesTally20() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.reconcile20(3);
        assertEquals(3, subject.reconcile20(-2));
        assertEquals(3, subject.span20Value());
    }

    @Test
    void rejectsZeroDenominatorDepth21() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.flatten21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth21() {
        assertEquals(0.5, new NorthwardBastion().flatten21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth21() {
        assertEquals(2.0, new NorthwardBastion().flatten21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity22() {
        assertTrue(new NorthwardBastion().flatten22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new NorthwardBastion().flatten22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity22() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardBastion().flatten22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan23() {
        assertEquals("below", new NorthwardBastion().reconcile23(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan23() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.reconcile23(5));
        assertEquals("upper-bound", subject.reconcile23(12));
    }

    @Test
    void classifiesWithinAndAboveSpan23() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.reconcile23(5 + 1));
        assertEquals("above", subject.reconcile23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio24() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist24());
        }
        assertEquals(1, subject.quota24Count());
    }

    @Test
    void refusesOnceExhaustedRatio24() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 1; i++) {
            subject.hoist24();
        }
        assertFalse(subject.hoist24());
    }

    @Test
    void accumulatesBelowTheCapCapacity25() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.kindle25(1));
        assertEquals(3, subject.kindle25(2));
    }

    @Test
    void saturatesAtTheCapCapacity25() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.kindle25(45);
        assertEquals(45, subject.kindle25(5));
    }

    @Test
    void ignoresNegativeValuesCapacity25() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.kindle25(3);
        assertEquals(3, subject.kindle25(-2));
        assertEquals(3, subject.cadence25Value());
    }

    @Test
    void rejectsZeroDenominatorSpan26() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.sift26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan26() {
        assertEquals(0.5, new NorthwardBastion().sift26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan26() {
        assertEquals(2.0, new NorthwardBastion().sift26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias27() {
        assertTrue(new NorthwardBastion().winnow27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new NorthwardBastion().winnow27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias27() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardBastion().winnow27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift28() {
        assertEquals("below", new NorthwardBastion().flatten28(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift28() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.flatten28(2));
        assertEquals("upper-bound", subject.flatten28(11));
    }

    @Test
    void classifiesWithinAndAboveDrift28() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.flatten28(2 + 1));
        assertEquals("above", subject.flatten28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift29() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist29());
        }
        assertEquals(2, subject.weight29Count());
    }

    @Test
    void refusesOnceExhaustedDrift29() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 2; i++) {
            subject.hoist29();
        }
        assertFalse(subject.hoist29());
    }

    @Test
    void accumulatesBelowTheCapCapacity30() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.kindle30(1));
        assertEquals(3, subject.kindle30(2));
    }

    @Test
    void saturatesAtTheCapCapacity30() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.kindle30(50);
        assertEquals(50, subject.kindle30(5));
    }

    @Test
    void ignoresNegativeValuesCapacity30() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.kindle30(3);
        assertEquals(3, subject.kindle30(-2));
        assertEquals(3, subject.bias30Value());
    }

    @Test
    void rejectsZeroDenominatorQuota31() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.sift31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota31() {
        assertEquals(0.5, new NorthwardBastion().sift31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota31() {
        assertEquals(2.0, new NorthwardBastion().sift31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan32() {
        assertTrue(new NorthwardBastion().reconcile32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new NorthwardBastion().reconcile32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan32() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardBastion().reconcile32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio33() {
        assertEquals("below", new NorthwardBastion().hoist33(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio33() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.hoist33(3));
        assertEquals("upper-bound", subject.hoist33(10));
    }

    @Test
    void classifiesWithinAndAboveRatio33() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.hoist33(3 + 1));
        assertEquals("above", subject.hoist33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity34() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile34());
        }
        assertEquals(3, subject.margin34Count());
    }

    @Test
    void refusesOnceExhaustedCapacity34() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 3; i++) {
            subject.reconcile34();
        }
        assertFalse(subject.reconcile34());
    }

    @Test
    void accumulatesBelowTheCapWeight35() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.temper35(1));
        assertEquals(3, subject.temper35(2));
    }

    @Test
    void saturatesAtTheCapWeight35() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.temper35(55);
        assertEquals(55, subject.temper35(5));
    }

    @Test
    void ignoresNegativeValuesWeight35() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.temper35(3);
        assertEquals(3, subject.temper35(-2));
        assertEquals(3, subject.depth35Value());
    }

    @Test
    void rejectsZeroDenominatorSpan36() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.anneal36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan36() {
        assertEquals(0.5, new NorthwardBastion().anneal36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan36() {
        assertEquals(2.0, new NorthwardBastion().anneal36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold37() {
        assertTrue(new NorthwardBastion().gauge37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new NorthwardBastion().gauge37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold37() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardBastion().gauge37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota38() {
        assertEquals("below", new NorthwardBastion().tally38(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota38() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.tally38(4));
        assertEquals("upper-bound", subject.tally38(9));
    }

    @Test
    void classifiesWithinAndAboveQuota38() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.tally38(4 + 1));
        assertEquals("above", subject.tally38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan39() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist39());
        }
        assertEquals(4, subject.ratio39Count());
    }

    @Test
    void refusesOnceExhaustedSpan39() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 4; i++) {
            subject.hoist39();
        }
        assertFalse(subject.hoist39());
    }

    @Test
    void accumulatesBelowTheCapCapacity40() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.brace40(1));
        assertEquals(3, subject.brace40(2));
    }

    @Test
    void saturatesAtTheCapCapacity40() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.brace40(20);
        assertEquals(20, subject.brace40(5));
    }

    @Test
    void ignoresNegativeValuesCapacity40() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.brace40(3);
        assertEquals(3, subject.brace40(-2));
        assertEquals(3, subject.weight40Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold41() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.prune41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold41() {
        assertEquals(0.5, new NorthwardBastion().prune41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold41() {
        assertEquals(2.0, new NorthwardBastion().prune41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence42() {
        assertTrue(new NorthwardBastion().collate42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new NorthwardBastion().collate42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence42() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardBastion().collate42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio43() {
        assertEquals("below", new NorthwardBastion().winnow43(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio43() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.winnow43(5));
        assertEquals("upper-bound", subject.winnow43(8));
    }

    @Test
    void classifiesWithinAndAboveRatio43() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.winnow43(5 + 1));
        assertEquals("above", subject.winnow43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity44() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist44());
        }
        assertEquals(1, subject.yield44Count());
    }

    @Test
    void refusesOnceExhaustedCapacity44() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 1; i++) {
            subject.hoist44();
        }
        assertFalse(subject.hoist44());
    }

    @Test
    void accumulatesBelowTheCapYield45() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.anneal45(1));
        assertEquals(3, subject.anneal45(2));
    }

    @Test
    void saturatesAtTheCapYield45() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.anneal45(25);
        assertEquals(25, subject.anneal45(5));
    }

    @Test
    void ignoresNegativeValuesYield45() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.anneal45(3);
        assertEquals(3, subject.anneal45(-2));
        assertEquals(3, subject.span45Value());
    }

    @Test
    void rejectsZeroDenominatorBias46() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.prune46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias46() {
        assertEquals(0.5, new NorthwardBastion().prune46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias46() {
        assertEquals(2.0, new NorthwardBastion().prune46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift47() {
        assertTrue(new NorthwardBastion().flatten47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new NorthwardBastion().flatten47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift47() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardBastion().flatten47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift48() {
        assertEquals("below", new NorthwardBastion().kindle48(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift48() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.kindle48(2));
        assertEquals("upper-bound", subject.kindle48(7));
    }

    @Test
    void classifiesWithinAndAboveDrift48() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.kindle48(2 + 1));
        assertEquals("above", subject.kindle48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio49() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper49());
        }
        assertEquals(2, subject.cadence49Count());
    }

    @Test
    void refusesOnceExhaustedRatio49() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 2; i++) {
            subject.temper49();
        }
        assertFalse(subject.temper49());
    }

    @Test
    void accumulatesBelowTheCapMargin50() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.winnow50(1));
        assertEquals(3, subject.winnow50(2));
    }

    @Test
    void saturatesAtTheCapMargin50() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.winnow50(30);
        assertEquals(30, subject.winnow50(5));
    }

    @Test
    void ignoresNegativeValuesMargin50() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.winnow50(3);
        assertEquals(3, subject.winnow50(-2));
        assertEquals(3, subject.cadence50Value());
    }

    @Test
    void rejectsZeroDenominatorQuota51() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.tally51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota51() {
        assertEquals(0.5, new NorthwardBastion().tally51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota51() {
        assertEquals(2.0, new NorthwardBastion().tally51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight52() {
        assertTrue(new NorthwardBastion().tally52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new NorthwardBastion().tally52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight52() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardBastion().tally52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold53() {
        assertEquals("below", new NorthwardBastion().winnow53(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold53() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.winnow53(3));
        assertEquals("upper-bound", subject.winnow53(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold53() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.winnow53(3 + 1));
        assertEquals("above", subject.winnow53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio54() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist54());
        }
        assertEquals(3, subject.cadence54Count());
    }

    @Test
    void refusesOnceExhaustedRatio54() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 3; i++) {
            subject.hoist54();
        }
        assertFalse(subject.hoist54());
    }

    @Test
    void accumulatesBelowTheCapBias55() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.anneal55(1));
        assertEquals(3, subject.anneal55(2));
    }

    @Test
    void saturatesAtTheCapBias55() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.anneal55(35);
        assertEquals(35, subject.anneal55(5));
    }

    @Test
    void ignoresNegativeValuesBias55() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.anneal55(3);
        assertEquals(3, subject.anneal55(-2));
        assertEquals(3, subject.weight55Value());
    }

    @Test
    void rejectsZeroDenominatorCadence56() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.brace56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence56() {
        assertEquals(0.5, new NorthwardBastion().brace56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence56() {
        assertEquals(2.0, new NorthwardBastion().brace56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota57() {
        assertTrue(new NorthwardBastion().gauge57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new NorthwardBastion().gauge57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota57() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardBastion().gauge57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight58() {
        assertEquals("below", new NorthwardBastion().brace58(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight58() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.brace58(4));
        assertEquals("upper-bound", subject.brace58(11));
    }

    @Test
    void classifiesWithinAndAboveWeight58() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.brace58(4 + 1));
        assertEquals("above", subject.brace58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias59() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile59());
        }
        assertEquals(4, subject.quota59Count());
    }

    @Test
    void refusesOnceExhaustedBias59() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 4; i++) {
            subject.reconcile59();
        }
        assertFalse(subject.reconcile59());
    }

    @Test
    void accumulatesBelowTheCapDrift60() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.winnow60(1));
        assertEquals(3, subject.winnow60(2));
    }

    @Test
    void saturatesAtTheCapDrift60() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.winnow60(40);
        assertEquals(40, subject.winnow60(5));
    }

    @Test
    void ignoresNegativeValuesDrift60() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.winnow60(3);
        assertEquals(3, subject.winnow60(-2));
        assertEquals(3, subject.threshold60Value());
    }

    @Test
    void rejectsZeroDenominatorOffset61() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.hoist61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset61() {
        assertEquals(0.5, new NorthwardBastion().hoist61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset61() {
        assertEquals(2.0, new NorthwardBastion().hoist61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin62() {
        assertTrue(new NorthwardBastion().winnow62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new NorthwardBastion().winnow62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin62() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardBastion().winnow62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio63() {
        assertEquals("below", new NorthwardBastion().kindle63(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio63() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.kindle63(5));
        assertEquals("upper-bound", subject.kindle63(10));
    }

    @Test
    void classifiesWithinAndAboveRatio63() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.kindle63(5 + 1));
        assertEquals("above", subject.kindle63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth64() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally64());
        }
        assertEquals(1, subject.tally64Count());
    }

    @Test
    void refusesOnceExhaustedDepth64() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 1; i++) {
            subject.tally64();
        }
        assertFalse(subject.tally64());
    }

    @Test
    void accumulatesBelowTheCapDrift65() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.tally65(1));
        assertEquals(3, subject.tally65(2));
    }

    @Test
    void saturatesAtTheCapDrift65() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.tally65(45);
        assertEquals(45, subject.tally65(5));
    }

    @Test
    void ignoresNegativeValuesDrift65() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.tally65(3);
        assertEquals(3, subject.tally65(-2));
        assertEquals(3, subject.offset65Value());
    }

    @Test
    void rejectsZeroDenominatorWeight66() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.temper66(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight66() {
        assertEquals(0.5, new NorthwardBastion().temper66(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight66() {
        assertEquals(2.0, new NorthwardBastion().temper66(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota67() {
        assertTrue(new NorthwardBastion().gauge67(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota67() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new NorthwardBastion().gauge67(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota67() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardBastion().gauge67(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset68() {
        assertEquals("below", new NorthwardBastion().hoist68(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset68() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.hoist68(2));
        assertEquals("upper-bound", subject.hoist68(9));
    }

    @Test
    void classifiesWithinAndAboveOffset68() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.hoist68(2 + 1));
        assertEquals("above", subject.hoist68(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias69() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace69());
        }
        assertEquals(2, subject.margin69Count());
    }

    @Test
    void refusesOnceExhaustedBias69() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 2; i++) {
            subject.brace69();
        }
        assertFalse(subject.brace69());
    }

    @Test
    void accumulatesBelowTheCapBias70() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.gauge70(1));
        assertEquals(3, subject.gauge70(2));
    }

    @Test
    void saturatesAtTheCapBias70() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.gauge70(50);
        assertEquals(50, subject.gauge70(5));
    }

    @Test
    void ignoresNegativeValuesBias70() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.gauge70(3);
        assertEquals(3, subject.gauge70(-2));
        assertEquals(3, subject.weight70Value());
    }

    @Test
    void rejectsZeroDenominatorOffset71() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.reconcile71(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset71() {
        assertEquals(0.5, new NorthwardBastion().reconcile71(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset71() {
        assertEquals(2.0, new NorthwardBastion().reconcile71(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence72() {
        assertTrue(new NorthwardBastion().kindle72(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence72() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new NorthwardBastion().kindle72(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence72() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardBastion().kindle72(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence73() {
        assertEquals("below", new NorthwardBastion().reconcile73(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence73() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.reconcile73(3));
        assertEquals("upper-bound", subject.reconcile73(8));
    }

    @Test
    void classifiesWithinAndAboveCadence73() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.reconcile73(3 + 1));
        assertEquals("above", subject.reconcile73(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset74() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift74());
        }
        assertEquals(3, subject.capacity74Count());
    }

    @Test
    void refusesOnceExhaustedOffset74() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 3; i++) {
            subject.sift74();
        }
        assertFalse(subject.sift74());
    }

    @Test
    void accumulatesBelowTheCapCapacity75() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.winnow75(1));
        assertEquals(3, subject.winnow75(2));
    }

    @Test
    void saturatesAtTheCapCapacity75() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.winnow75(55);
        assertEquals(55, subject.winnow75(5));
    }

    @Test
    void ignoresNegativeValuesCapacity75() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.winnow75(3);
        assertEquals(3, subject.winnow75(-2));
        assertEquals(3, subject.threshold75Value());
    }

    @Test
    void rejectsZeroDenominatorSpan76() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.brace76(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan76() {
        assertEquals(0.5, new NorthwardBastion().brace76(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan76() {
        assertEquals(2.0, new NorthwardBastion().brace76(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally77() {
        assertTrue(new NorthwardBastion().flatten77(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally77() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new NorthwardBastion().flatten77(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally77() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardBastion().flatten77(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift78() {
        assertEquals("below", new NorthwardBastion().furl78(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift78() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.furl78(4));
        assertEquals("upper-bound", subject.furl78(7));
    }

    @Test
    void classifiesWithinAndAboveDrift78() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.furl78(4 + 1));
        assertEquals("above", subject.furl78(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence79() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge79());
        }
        assertEquals(4, subject.span79Count());
    }

    @Test
    void refusesOnceExhaustedCadence79() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 4; i++) {
            subject.gauge79();
        }
        assertFalse(subject.gauge79());
    }

    @Test
    void accumulatesBelowTheCapCapacity80() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.winnow80(1));
        assertEquals(3, subject.winnow80(2));
    }

    @Test
    void saturatesAtTheCapCapacity80() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.winnow80(20);
        assertEquals(20, subject.winnow80(5));
    }

    @Test
    void ignoresNegativeValuesCapacity80() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.winnow80(3);
        assertEquals(3, subject.winnow80(-2));
        assertEquals(3, subject.depth80Value());
    }

    @Test
    void rejectsZeroDenominatorDepth81() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.collate81(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth81() {
        assertEquals(0.5, new NorthwardBastion().collate81(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth81() {
        assertEquals(2.0, new NorthwardBastion().collate81(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin82() {
        assertTrue(new NorthwardBastion().collate82(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin82() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new NorthwardBastion().collate82(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin82() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardBastion().collate82(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield83() {
        assertEquals("below", new NorthwardBastion().flatten83(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield83() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.flatten83(5));
        assertEquals("upper-bound", subject.flatten83(12));
    }

    @Test
    void classifiesWithinAndAboveYield83() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.flatten83(5 + 1));
        assertEquals("above", subject.flatten83(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan84() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl84());
        }
        assertEquals(1, subject.offset84Count());
    }

    @Test
    void refusesOnceExhaustedSpan84() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 1; i++) {
            subject.furl84();
        }
        assertFalse(subject.furl84());
    }

    @Test
    void accumulatesBelowTheCapQuota85() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.flatten85(1));
        assertEquals(3, subject.flatten85(2));
    }

    @Test
    void saturatesAtTheCapQuota85() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.flatten85(25);
        assertEquals(25, subject.flatten85(5));
    }

    @Test
    void ignoresNegativeValuesQuota85() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.flatten85(3);
        assertEquals(3, subject.flatten85(-2));
        assertEquals(3, subject.ratio85Value());
    }

    @Test
    void rejectsZeroDenominatorMargin86() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.brace86(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin86() {
        assertEquals(0.5, new NorthwardBastion().brace86(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin86() {
        assertEquals(2.0, new NorthwardBastion().brace86(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally87() {
        assertTrue(new NorthwardBastion().temper87(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally87() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new NorthwardBastion().temper87(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally87() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardBastion().temper87(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias88() {
        assertEquals("below", new NorthwardBastion().kindle88(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias88() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.kindle88(2));
        assertEquals("upper-bound", subject.kindle88(11));
    }

    @Test
    void classifiesWithinAndAboveBias88() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.kindle88(2 + 1));
        assertEquals("above", subject.kindle88(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan89() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune89());
        }
        assertEquals(2, subject.bias89Count());
    }

    @Test
    void refusesOnceExhaustedSpan89() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 2; i++) {
            subject.prune89();
        }
        assertFalse(subject.prune89());
    }

    @Test
    void accumulatesBelowTheCapQuota90() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.gauge90(1));
        assertEquals(3, subject.gauge90(2));
    }

    @Test
    void saturatesAtTheCapQuota90() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.gauge90(30);
        assertEquals(30, subject.gauge90(5));
    }

    @Test
    void ignoresNegativeValuesQuota90() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.gauge90(3);
        assertEquals(3, subject.gauge90(-2));
        assertEquals(3, subject.margin90Value());
    }

    @Test
    void rejectsZeroDenominatorCadence91() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.collate91(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence91() {
        assertEquals(0.5, new NorthwardBastion().collate91(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence91() {
        assertEquals(2.0, new NorthwardBastion().collate91(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset92() {
        assertTrue(new NorthwardBastion().flatten92(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset92() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new NorthwardBastion().flatten92(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset92() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardBastion().flatten92(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield93() {
        assertEquals("below", new NorthwardBastion().brace93(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield93() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("lower-bound", subject.brace93(3));
        assertEquals("upper-bound", subject.brace93(10));
    }

    @Test
    void classifiesWithinAndAboveYield93() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals("within", subject.brace93(3 + 1));
        assertEquals("above", subject.brace93(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift94() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle94());
        }
        assertEquals(3, subject.capacity94Count());
    }

    @Test
    void refusesOnceExhaustedDrift94() {
        NorthwardBastion subject = new NorthwardBastion();
        for (int i = 0; i < 3; i++) {
            subject.kindle94();
        }
        assertFalse(subject.kindle94());
    }

    @Test
    void accumulatesBelowTheCapOffset95() {
        NorthwardBastion subject = new NorthwardBastion();
        assertEquals(1, subject.gauge95(1));
        assertEquals(3, subject.gauge95(2));
    }

    @Test
    void saturatesAtTheCapOffset95() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.gauge95(35);
        assertEquals(35, subject.gauge95(5));
    }

    @Test
    void ignoresNegativeValuesOffset95() {
        NorthwardBastion subject = new NorthwardBastion();
        subject.gauge95(3);
        assertEquals(3, subject.gauge95(-2));
        assertEquals(3, subject.threshold95Value());
    }

    @Test
    void rejectsZeroDenominatorMargin96() {
        NorthwardBastion subject = new NorthwardBastion();
        assertThrows(ArithmeticException.class, () -> subject.gauge96(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin96() {
        assertEquals(0.5, new NorthwardBastion().gauge96(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin96() {
        assertEquals(2.0, new NorthwardBastion().gauge96(1000.0, 1.0), 1e-9);
    }
}
