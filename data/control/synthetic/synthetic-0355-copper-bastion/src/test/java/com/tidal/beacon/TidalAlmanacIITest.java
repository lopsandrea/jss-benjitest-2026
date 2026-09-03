package com.tidal.beacon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalAlmanacIITest {

    @Test
    void accumulatesBelowTheCapYield0() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals(1, subject.brace0(1));
        assertEquals(3, subject.brace0(2));
    }

    @Test
    void saturatesAtTheCapYield0() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.brace0(20);
        assertEquals(20, subject.brace0(5));
    }

    @Test
    void ignoresNegativeValuesYield0() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.brace0(3);
        assertEquals(3, subject.brace0(-2));
        assertEquals(3, subject.ratio0Value());
    }

    @Test
    void rejectsZeroDenominatorOffset1() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.temper1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset1() {
        assertEquals(0.5, new TidalAlmanacII().temper1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset1() {
        assertEquals(2.0, new TidalAlmanacII().temper1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth2() {
        assertTrue(new TidalAlmanacII().winnow2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new TidalAlmanacII().winnow2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth2() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalAlmanacII().winnow2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold3() {
        assertEquals("below", new TidalAlmanacII().collate3(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold3() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("lower-bound", subject.collate3(5));
        assertEquals("upper-bound", subject.collate3(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold3() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("within", subject.collate3(5 + 1));
        assertEquals("above", subject.collate3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias4() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge4());
        }
        assertEquals(1, subject.threshold4Count());
    }

    @Test
    void refusesOnceExhaustedBias4() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 1; i++) {
            subject.gauge4();
        }
        assertFalse(subject.gauge4());
    }

    @Test
    void accumulatesBelowTheCapCapacity5() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals(1, subject.hoist5(1));
        assertEquals(3, subject.hoist5(2));
    }

    @Test
    void saturatesAtTheCapCapacity5() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.hoist5(25);
        assertEquals(25, subject.hoist5(5));
    }

    @Test
    void ignoresNegativeValuesCapacity5() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.hoist5(3);
        assertEquals(3, subject.hoist5(-2));
        assertEquals(3, subject.quota5Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold6() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.gauge6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold6() {
        assertEquals(0.5, new TidalAlmanacII().gauge6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold6() {
        assertEquals(2.0, new TidalAlmanacII().gauge6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift7() {
        assertTrue(new TidalAlmanacII().temper7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new TidalAlmanacII().temper7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift7() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalAlmanacII().temper7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity8() {
        assertEquals("below", new TidalAlmanacII().flatten8(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity8() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("lower-bound", subject.flatten8(2));
        assertEquals("upper-bound", subject.flatten8(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity8() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("within", subject.flatten8(2 + 1));
        assertEquals("above", subject.flatten8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth9() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper9());
        }
        assertEquals(2, subject.quota9Count());
    }

    @Test
    void refusesOnceExhaustedDepth9() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 2; i++) {
            subject.temper9();
        }
        assertFalse(subject.temper9());
    }

    @Test
    void accumulatesBelowTheCapWeight10() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals(1, subject.prune10(1));
        assertEquals(3, subject.prune10(2));
    }

    @Test
    void saturatesAtTheCapWeight10() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.prune10(30);
        assertEquals(30, subject.prune10(5));
    }

    @Test
    void ignoresNegativeValuesWeight10() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.prune10(3);
        assertEquals(3, subject.prune10(-2));
        assertEquals(3, subject.threshold10Value());
    }

    @Test
    void rejectsZeroDenominatorTally11() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.gauge11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally11() {
        assertEquals(0.5, new TidalAlmanacII().gauge11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally11() {
        assertEquals(2.0, new TidalAlmanacII().gauge11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin12() {
        assertTrue(new TidalAlmanacII().furl12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new TidalAlmanacII().furl12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin12() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalAlmanacII().furl12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight13() {
        assertEquals("below", new TidalAlmanacII().furl13(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight13() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("lower-bound", subject.furl13(3));
        assertEquals("upper-bound", subject.furl13(8));
    }

    @Test
    void classifiesWithinAndAboveWeight13() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("within", subject.furl13(3 + 1));
        assertEquals("above", subject.furl13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally14() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune14());
        }
        assertEquals(3, subject.drift14Count());
    }

    @Test
    void refusesOnceExhaustedTally14() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 3; i++) {
            subject.prune14();
        }
        assertFalse(subject.prune14());
    }

    @Test
    void accumulatesBelowTheCapOffset15() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals(1, subject.anneal15(1));
        assertEquals(3, subject.anneal15(2));
    }

    @Test
    void saturatesAtTheCapOffset15() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.anneal15(35);
        assertEquals(35, subject.anneal15(5));
    }

    @Test
    void ignoresNegativeValuesOffset15() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.anneal15(3);
        assertEquals(3, subject.anneal15(-2));
        assertEquals(3, subject.span15Value());
    }

    @Test
    void rejectsZeroDenominatorRatio16() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.temper16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio16() {
        assertEquals(0.5, new TidalAlmanacII().temper16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio16() {
        assertEquals(2.0, new TidalAlmanacII().temper16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio17() {
        assertTrue(new TidalAlmanacII().kindle17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new TidalAlmanacII().kindle17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio17() {
        assertEquals(java.util.Arrays.asList(14),
                new TidalAlmanacII().kindle17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally18() {
        assertEquals("below", new TidalAlmanacII().sift18(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally18() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("lower-bound", subject.sift18(4));
        assertEquals("upper-bound", subject.sift18(7));
    }

    @Test
    void classifiesWithinAndAboveTally18() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("within", subject.sift18(4 + 1));
        assertEquals("above", subject.sift18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota19() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle19());
        }
        assertEquals(4, subject.margin19Count());
    }

    @Test
    void refusesOnceExhaustedQuota19() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 4; i++) {
            subject.kindle19();
        }
        assertFalse(subject.kindle19());
    }

    @Test
    void accumulatesBelowTheCapQuota20() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals(1, subject.temper20(1));
        assertEquals(3, subject.temper20(2));
    }

    @Test
    void saturatesAtTheCapQuota20() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.temper20(40);
        assertEquals(40, subject.temper20(5));
    }

    @Test
    void ignoresNegativeValuesQuota20() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.temper20(3);
        assertEquals(3, subject.temper20(-2));
        assertEquals(3, subject.capacity20Value());
    }

    @Test
    void rejectsZeroDenominatorRatio21() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.temper21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio21() {
        assertEquals(0.5, new TidalAlmanacII().temper21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio21() {
        assertEquals(2.0, new TidalAlmanacII().temper21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias22() {
        assertTrue(new TidalAlmanacII().furl22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new TidalAlmanacII().furl22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias22() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalAlmanacII().furl22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence23() {
        assertEquals("below", new TidalAlmanacII().temper23(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence23() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("lower-bound", subject.temper23(5));
        assertEquals("upper-bound", subject.temper23(12));
    }

    @Test
    void classifiesWithinAndAboveCadence23() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("within", subject.temper23(5 + 1));
        assertEquals("above", subject.temper23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin24() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle24());
        }
        assertEquals(1, subject.capacity24Count());
    }

    @Test
    void refusesOnceExhaustedMargin24() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 1; i++) {
            subject.kindle24();
        }
        assertFalse(subject.kindle24());
    }

    @Test
    void accumulatesBelowTheCapSpan25() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals(1, subject.hoist25(1));
        assertEquals(3, subject.hoist25(2));
    }

    @Test
    void saturatesAtTheCapSpan25() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.hoist25(45);
        assertEquals(45, subject.hoist25(5));
    }

    @Test
    void ignoresNegativeValuesSpan25() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.hoist25(3);
        assertEquals(3, subject.hoist25(-2));
        assertEquals(3, subject.depth25Value());
    }

    @Test
    void rejectsZeroDenominatorSpan26() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.tally26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan26() {
        assertEquals(0.5, new TidalAlmanacII().tally26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan26() {
        assertEquals(2.0, new TidalAlmanacII().tally26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth27() {
        assertTrue(new TidalAlmanacII().tally27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new TidalAlmanacII().tally27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth27() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalAlmanacII().tally27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias28() {
        assertEquals("below", new TidalAlmanacII().collate28(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias28() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("lower-bound", subject.collate28(2));
        assertEquals("upper-bound", subject.collate28(11));
    }

    @Test
    void classifiesWithinAndAboveBias28() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("within", subject.collate28(2 + 1));
        assertEquals("above", subject.collate28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield29() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl29());
        }
        assertEquals(2, subject.cadence29Count());
    }

    @Test
    void refusesOnceExhaustedYield29() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 2; i++) {
            subject.furl29();
        }
        assertFalse(subject.furl29());
    }

    @Test
    void accumulatesBelowTheCapYield30() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals(1, subject.collate30(1));
        assertEquals(3, subject.collate30(2));
    }

    @Test
    void saturatesAtTheCapYield30() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.collate30(50);
        assertEquals(50, subject.collate30(5));
    }

    @Test
    void ignoresNegativeValuesYield30() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.collate30(3);
        assertEquals(3, subject.collate30(-2));
        assertEquals(3, subject.quota30Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold31() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.furl31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold31() {
        assertEquals(0.5, new TidalAlmanacII().furl31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold31() {
        assertEquals(2.0, new TidalAlmanacII().furl31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota32() {
        assertTrue(new TidalAlmanacII().reconcile32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new TidalAlmanacII().reconcile32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota32() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalAlmanacII().reconcile32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity33() {
        assertEquals("below", new TidalAlmanacII().winnow33(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity33() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("lower-bound", subject.winnow33(3));
        assertEquals("upper-bound", subject.winnow33(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity33() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("within", subject.winnow33(3 + 1));
        assertEquals("above", subject.winnow33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset34() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace34());
        }
        assertEquals(3, subject.span34Count());
    }

    @Test
    void refusesOnceExhaustedOffset34() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 3; i++) {
            subject.brace34();
        }
        assertFalse(subject.brace34());
    }

    @Test
    void accumulatesBelowTheCapBias35() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals(1, subject.gauge35(1));
        assertEquals(3, subject.gauge35(2));
    }

    @Test
    void saturatesAtTheCapBias35() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.gauge35(55);
        assertEquals(55, subject.gauge35(5));
    }

    @Test
    void ignoresNegativeValuesBias35() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.gauge35(3);
        assertEquals(3, subject.gauge35(-2));
        assertEquals(3, subject.drift35Value());
    }

    @Test
    void rejectsZeroDenominatorBias36() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.sift36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias36() {
        assertEquals(0.5, new TidalAlmanacII().sift36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias36() {
        assertEquals(2.0, new TidalAlmanacII().sift36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield37() {
        assertTrue(new TidalAlmanacII().brace37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new TidalAlmanacII().brace37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield37() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalAlmanacII().brace37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight38() {
        assertEquals("below", new TidalAlmanacII().gauge38(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight38() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("lower-bound", subject.gauge38(4));
        assertEquals("upper-bound", subject.gauge38(9));
    }

    @Test
    void classifiesWithinAndAboveWeight38() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("within", subject.gauge38(4 + 1));
        assertEquals("above", subject.gauge38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold39() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper39());
        }
        assertEquals(4, subject.margin39Count());
    }

    @Test
    void refusesOnceExhaustedThreshold39() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 4; i++) {
            subject.temper39();
        }
        assertFalse(subject.temper39());
    }

    @Test
    void accumulatesBelowTheCapMargin40() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals(1, subject.brace40(1));
        assertEquals(3, subject.brace40(2));
    }

    @Test
    void saturatesAtTheCapMargin40() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.brace40(20);
        assertEquals(20, subject.brace40(5));
    }

    @Test
    void ignoresNegativeValuesMargin40() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.brace40(3);
        assertEquals(3, subject.brace40(-2));
        assertEquals(3, subject.weight40Value());
    }

    @Test
    void rejectsZeroDenominatorQuota41() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.winnow41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota41() {
        assertEquals(0.5, new TidalAlmanacII().winnow41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota41() {
        assertEquals(2.0, new TidalAlmanacII().winnow41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield42() {
        assertTrue(new TidalAlmanacII().winnow42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new TidalAlmanacII().winnow42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield42() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalAlmanacII().winnow42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence43() {
        assertEquals("below", new TidalAlmanacII().anneal43(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence43() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("lower-bound", subject.anneal43(5));
        assertEquals("upper-bound", subject.anneal43(8));
    }

    @Test
    void classifiesWithinAndAboveCadence43() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("within", subject.anneal43(5 + 1));
        assertEquals("above", subject.anneal43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset44() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl44());
        }
        assertEquals(1, subject.weight44Count());
    }

    @Test
    void refusesOnceExhaustedOffset44() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 1; i++) {
            subject.furl44();
        }
        assertFalse(subject.furl44());
    }

    @Test
    void accumulatesBelowTheCapSpan45() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals(1, subject.brace45(1));
        assertEquals(3, subject.brace45(2));
    }

    @Test
    void saturatesAtTheCapSpan45() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.brace45(25);
        assertEquals(25, subject.brace45(5));
    }

    @Test
    void ignoresNegativeValuesSpan45() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.brace45(3);
        assertEquals(3, subject.brace45(-2));
        assertEquals(3, subject.offset45Value());
    }

    @Test
    void rejectsZeroDenominatorBias46() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.sift46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias46() {
        assertEquals(0.5, new TidalAlmanacII().sift46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias46() {
        assertEquals(2.0, new TidalAlmanacII().sift46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift47() {
        assertTrue(new TidalAlmanacII().reconcile47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new TidalAlmanacII().reconcile47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift47() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalAlmanacII().reconcile47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset48() {
        assertEquals("below", new TidalAlmanacII().winnow48(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset48() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("lower-bound", subject.winnow48(2));
        assertEquals("upper-bound", subject.winnow48(7));
    }

    @Test
    void classifiesWithinAndAboveOffset48() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("within", subject.winnow48(2 + 1));
        assertEquals("above", subject.winnow48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota49() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift49());
        }
        assertEquals(2, subject.span49Count());
    }

    @Test
    void refusesOnceExhaustedQuota49() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 2; i++) {
            subject.sift49();
        }
        assertFalse(subject.sift49());
    }

    @Test
    void accumulatesBelowTheCapBias50() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals(1, subject.gauge50(1));
        assertEquals(3, subject.gauge50(2));
    }

    @Test
    void saturatesAtTheCapBias50() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.gauge50(30);
        assertEquals(30, subject.gauge50(5));
    }

    @Test
    void ignoresNegativeValuesBias50() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.gauge50(3);
        assertEquals(3, subject.gauge50(-2));
        assertEquals(3, subject.tally50Value());
    }

    @Test
    void rejectsZeroDenominatorQuota51() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.anneal51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota51() {
        assertEquals(0.5, new TidalAlmanacII().anneal51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota51() {
        assertEquals(2.0, new TidalAlmanacII().anneal51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio52() {
        assertTrue(new TidalAlmanacII().hoist52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new TidalAlmanacII().hoist52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio52() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalAlmanacII().hoist52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally53() {
        assertEquals("below", new TidalAlmanacII().brace53(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally53() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("lower-bound", subject.brace53(3));
        assertEquals("upper-bound", subject.brace53(12));
    }

    @Test
    void classifiesWithinAndAboveTally53() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals("within", subject.brace53(3 + 1));
        assertEquals("above", subject.brace53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth54() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal54());
        }
        assertEquals(3, subject.weight54Count());
    }

    @Test
    void refusesOnceExhaustedDepth54() {
        TidalAlmanacII subject = new TidalAlmanacII();
        for (int i = 0; i < 3; i++) {
            subject.anneal54();
        }
        assertFalse(subject.anneal54());
    }

    @Test
    void accumulatesBelowTheCapOffset55() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertEquals(1, subject.winnow55(1));
        assertEquals(3, subject.winnow55(2));
    }

    @Test
    void saturatesAtTheCapOffset55() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.winnow55(35);
        assertEquals(35, subject.winnow55(5));
    }

    @Test
    void ignoresNegativeValuesOffset55() {
        TidalAlmanacII subject = new TidalAlmanacII();
        subject.winnow55(3);
        assertEquals(3, subject.winnow55(-2));
        assertEquals(3, subject.capacity55Value());
    }

    @Test
    void rejectsZeroDenominatorRatio56() {
        TidalAlmanacII subject = new TidalAlmanacII();
        assertThrows(ArithmeticException.class, () -> subject.winnow56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio56() {
        assertEquals(0.5, new TidalAlmanacII().winnow56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio56() {
        assertEquals(2.0, new TidalAlmanacII().winnow56(1000.0, 1.0), 1e-9);
    }
}
