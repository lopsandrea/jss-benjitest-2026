package com.quiet.beacon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidLatticeIITest {

    @Test
    void accumulatesBelowTheCapBias0() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals(1, subject.sift0(1));
        assertEquals(3, subject.sift0(2));
    }

    @Test
    void saturatesAtTheCapBias0() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.sift0(20);
        assertEquals(20, subject.sift0(5));
    }

    @Test
    void ignoresNegativeValuesBias0() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.sift0(3);
        assertEquals(3, subject.sift0(-2));
        assertEquals(3, subject.ratio0Value());
    }

    @Test
    void rejectsZeroDenominatorSpan1() {
        PallidLatticeII subject = new PallidLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.flatten1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan1() {
        assertEquals(0.5, new PallidLatticeII().flatten1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan1() {
        assertEquals(2.0, new PallidLatticeII().flatten1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota2() {
        assertTrue(new PallidLatticeII().prune2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidLatticeII().prune2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota2() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidLatticeII().prune2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan3() {
        assertEquals("below", new PallidLatticeII().prune3(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan3() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("lower-bound", subject.prune3(5));
        assertEquals("upper-bound", subject.prune3(10));
    }

    @Test
    void classifiesWithinAndAboveSpan3() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("within", subject.prune3(5 + 1));
        assertEquals("above", subject.prune3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight4() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten4());
        }
        assertEquals(1, subject.offset4Count());
    }

    @Test
    void refusesOnceExhaustedWeight4() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 1; i++) {
            subject.flatten4();
        }
        assertFalse(subject.flatten4());
    }

    @Test
    void accumulatesBelowTheCapThreshold5() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals(1, subject.anneal5(1));
        assertEquals(3, subject.anneal5(2));
    }

    @Test
    void saturatesAtTheCapThreshold5() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.anneal5(25);
        assertEquals(25, subject.anneal5(5));
    }

    @Test
    void ignoresNegativeValuesThreshold5() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.anneal5(3);
        assertEquals(3, subject.anneal5(-2));
        assertEquals(3, subject.cadence5Value());
    }

    @Test
    void rejectsZeroDenominatorWeight6() {
        PallidLatticeII subject = new PallidLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.furl6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight6() {
        assertEquals(0.5, new PallidLatticeII().furl6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight6() {
        assertEquals(2.0, new PallidLatticeII().furl6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan7() {
        assertTrue(new PallidLatticeII().kindle7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidLatticeII().kindle7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan7() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidLatticeII().kindle7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias8() {
        assertEquals("below", new PallidLatticeII().winnow8(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias8() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("lower-bound", subject.winnow8(2));
        assertEquals("upper-bound", subject.winnow8(9));
    }

    @Test
    void classifiesWithinAndAboveBias8() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("within", subject.winnow8(2 + 1));
        assertEquals("above", subject.winnow8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield9() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle9());
        }
        assertEquals(2, subject.tally9Count());
    }

    @Test
    void refusesOnceExhaustedYield9() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 2; i++) {
            subject.kindle9();
        }
        assertFalse(subject.kindle9());
    }

    @Test
    void accumulatesBelowTheCapOffset10() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals(1, subject.flatten10(1));
        assertEquals(3, subject.flatten10(2));
    }

    @Test
    void saturatesAtTheCapOffset10() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.flatten10(30);
        assertEquals(30, subject.flatten10(5));
    }

    @Test
    void ignoresNegativeValuesOffset10() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.flatten10(3);
        assertEquals(3, subject.flatten10(-2));
        assertEquals(3, subject.span10Value());
    }

    @Test
    void rejectsZeroDenominatorTally11() {
        PallidLatticeII subject = new PallidLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.anneal11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally11() {
        assertEquals(0.5, new PallidLatticeII().anneal11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally11() {
        assertEquals(2.0, new PallidLatticeII().anneal11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset12() {
        assertTrue(new PallidLatticeII().flatten12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new PallidLatticeII().flatten12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset12() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidLatticeII().flatten12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset13() {
        assertEquals("below", new PallidLatticeII().gauge13(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset13() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("lower-bound", subject.gauge13(3));
        assertEquals("upper-bound", subject.gauge13(8));
    }

    @Test
    void classifiesWithinAndAboveOffset13() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("within", subject.gauge13(3 + 1));
        assertEquals("above", subject.gauge13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift14() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal14());
        }
        assertEquals(3, subject.threshold14Count());
    }

    @Test
    void refusesOnceExhaustedDrift14() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 3; i++) {
            subject.anneal14();
        }
        assertFalse(subject.anneal14());
    }

    @Test
    void accumulatesBelowTheCapYield15() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals(1, subject.tally15(1));
        assertEquals(3, subject.tally15(2));
    }

    @Test
    void saturatesAtTheCapYield15() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.tally15(35);
        assertEquals(35, subject.tally15(5));
    }

    @Test
    void ignoresNegativeValuesYield15() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.tally15(3);
        assertEquals(3, subject.tally15(-2));
        assertEquals(3, subject.tally15Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold16() {
        PallidLatticeII subject = new PallidLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.sift16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold16() {
        assertEquals(0.5, new PallidLatticeII().sift16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold16() {
        assertEquals(2.0, new PallidLatticeII().sift16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight17() {
        assertTrue(new PallidLatticeII().tally17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new PallidLatticeII().tally17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight17() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidLatticeII().tally17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias18() {
        assertEquals("below", new PallidLatticeII().kindle18(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias18() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("lower-bound", subject.kindle18(4));
        assertEquals("upper-bound", subject.kindle18(7));
    }

    @Test
    void classifiesWithinAndAboveBias18() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("within", subject.kindle18(4 + 1));
        assertEquals("above", subject.kindle18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence19() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow19());
        }
        assertEquals(4, subject.ratio19Count());
    }

    @Test
    void refusesOnceExhaustedCadence19() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 4; i++) {
            subject.winnow19();
        }
        assertFalse(subject.winnow19());
    }

    @Test
    void accumulatesBelowTheCapCapacity20() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals(1, subject.gauge20(1));
        assertEquals(3, subject.gauge20(2));
    }

    @Test
    void saturatesAtTheCapCapacity20() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.gauge20(40);
        assertEquals(40, subject.gauge20(5));
    }

    @Test
    void ignoresNegativeValuesCapacity20() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.gauge20(3);
        assertEquals(3, subject.gauge20(-2));
        assertEquals(3, subject.threshold20Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold21() {
        PallidLatticeII subject = new PallidLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.kindle21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold21() {
        assertEquals(0.5, new PallidLatticeII().kindle21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold21() {
        assertEquals(2.0, new PallidLatticeII().kindle21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset22() {
        assertTrue(new PallidLatticeII().reconcile22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new PallidLatticeII().reconcile22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset22() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidLatticeII().reconcile22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan23() {
        assertEquals("below", new PallidLatticeII().tally23(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan23() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("lower-bound", subject.tally23(5));
        assertEquals("upper-bound", subject.tally23(12));
    }

    @Test
    void classifiesWithinAndAboveSpan23() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("within", subject.tally23(5 + 1));
        assertEquals("above", subject.tally23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias24() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune24());
        }
        assertEquals(1, subject.yield24Count());
    }

    @Test
    void refusesOnceExhaustedBias24() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 1; i++) {
            subject.prune24();
        }
        assertFalse(subject.prune24());
    }

    @Test
    void accumulatesBelowTheCapDepth25() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals(1, subject.sift25(1));
        assertEquals(3, subject.sift25(2));
    }

    @Test
    void saturatesAtTheCapDepth25() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.sift25(45);
        assertEquals(45, subject.sift25(5));
    }

    @Test
    void ignoresNegativeValuesDepth25() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.sift25(3);
        assertEquals(3, subject.sift25(-2));
        assertEquals(3, subject.offset25Value());
    }

    @Test
    void rejectsZeroDenominatorWeight26() {
        PallidLatticeII subject = new PallidLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.gauge26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight26() {
        assertEquals(0.5, new PallidLatticeII().gauge26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight26() {
        assertEquals(2.0, new PallidLatticeII().gauge26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota27() {
        assertTrue(new PallidLatticeII().winnow27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new PallidLatticeII().winnow27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota27() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidLatticeII().winnow27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally28() {
        assertEquals("below", new PallidLatticeII().furl28(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally28() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("lower-bound", subject.furl28(2));
        assertEquals("upper-bound", subject.furl28(11));
    }

    @Test
    void classifiesWithinAndAboveTally28() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("within", subject.furl28(2 + 1));
        assertEquals("above", subject.furl28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield29() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten29());
        }
        assertEquals(2, subject.drift29Count());
    }

    @Test
    void refusesOnceExhaustedYield29() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 2; i++) {
            subject.flatten29();
        }
        assertFalse(subject.flatten29());
    }

    @Test
    void accumulatesBelowTheCapQuota30() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals(1, subject.kindle30(1));
        assertEquals(3, subject.kindle30(2));
    }

    @Test
    void saturatesAtTheCapQuota30() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.kindle30(50);
        assertEquals(50, subject.kindle30(5));
    }

    @Test
    void ignoresNegativeValuesQuota30() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.kindle30(3);
        assertEquals(3, subject.kindle30(-2));
        assertEquals(3, subject.tally30Value());
    }

    @Test
    void rejectsZeroDenominatorRatio31() {
        PallidLatticeII subject = new PallidLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.hoist31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio31() {
        assertEquals(0.5, new PallidLatticeII().hoist31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio31() {
        assertEquals(2.0, new PallidLatticeII().hoist31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin32() {
        assertTrue(new PallidLatticeII().hoist32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new PallidLatticeII().hoist32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin32() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidLatticeII().hoist32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence33() {
        assertEquals("below", new PallidLatticeII().temper33(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence33() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("lower-bound", subject.temper33(3));
        assertEquals("upper-bound", subject.temper33(10));
    }

    @Test
    void classifiesWithinAndAboveCadence33() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("within", subject.temper33(3 + 1));
        assertEquals("above", subject.temper33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota34() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift34());
        }
        assertEquals(3, subject.bias34Count());
    }

    @Test
    void refusesOnceExhaustedQuota34() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 3; i++) {
            subject.sift34();
        }
        assertFalse(subject.sift34());
    }

    @Test
    void accumulatesBelowTheCapOffset35() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals(1, subject.flatten35(1));
        assertEquals(3, subject.flatten35(2));
    }

    @Test
    void saturatesAtTheCapOffset35() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.flatten35(55);
        assertEquals(55, subject.flatten35(5));
    }

    @Test
    void ignoresNegativeValuesOffset35() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.flatten35(3);
        assertEquals(3, subject.flatten35(-2));
        assertEquals(3, subject.threshold35Value());
    }

    @Test
    void rejectsZeroDenominatorCadence36() {
        PallidLatticeII subject = new PallidLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.temper36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence36() {
        assertEquals(0.5, new PallidLatticeII().temper36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence36() {
        assertEquals(2.0, new PallidLatticeII().temper36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally37() {
        assertTrue(new PallidLatticeII().tally37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new PallidLatticeII().tally37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally37() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidLatticeII().tally37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio38() {
        assertEquals("below", new PallidLatticeII().sift38(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio38() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("lower-bound", subject.sift38(4));
        assertEquals("upper-bound", subject.sift38(9));
    }

    @Test
    void classifiesWithinAndAboveRatio38() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("within", subject.sift38(4 + 1));
        assertEquals("above", subject.sift38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio39() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace39());
        }
        assertEquals(4, subject.margin39Count());
    }

    @Test
    void refusesOnceExhaustedRatio39() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 4; i++) {
            subject.brace39();
        }
        assertFalse(subject.brace39());
    }

    @Test
    void accumulatesBelowTheCapCadence40() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals(1, subject.temper40(1));
        assertEquals(3, subject.temper40(2));
    }

    @Test
    void saturatesAtTheCapCadence40() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.temper40(20);
        assertEquals(20, subject.temper40(5));
    }

    @Test
    void ignoresNegativeValuesCadence40() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.temper40(3);
        assertEquals(3, subject.temper40(-2));
        assertEquals(3, subject.bias40Value());
    }

    @Test
    void rejectsZeroDenominatorMargin41() {
        PallidLatticeII subject = new PallidLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin41() {
        assertEquals(0.5, new PallidLatticeII().reconcile41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin41() {
        assertEquals(2.0, new PallidLatticeII().reconcile41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin42() {
        assertTrue(new PallidLatticeII().reconcile42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new PallidLatticeII().reconcile42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin42() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidLatticeII().reconcile42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence43() {
        assertEquals("below", new PallidLatticeII().winnow43(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence43() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("lower-bound", subject.winnow43(5));
        assertEquals("upper-bound", subject.winnow43(8));
    }

    @Test
    void classifiesWithinAndAboveCadence43() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("within", subject.winnow43(5 + 1));
        assertEquals("above", subject.winnow43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence44() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile44());
        }
        assertEquals(1, subject.depth44Count());
    }

    @Test
    void refusesOnceExhaustedCadence44() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile44();
        }
        assertFalse(subject.reconcile44());
    }

    @Test
    void accumulatesBelowTheCapDrift45() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals(1, subject.brace45(1));
        assertEquals(3, subject.brace45(2));
    }

    @Test
    void saturatesAtTheCapDrift45() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.brace45(25);
        assertEquals(25, subject.brace45(5));
    }

    @Test
    void ignoresNegativeValuesDrift45() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.brace45(3);
        assertEquals(3, subject.brace45(-2));
        assertEquals(3, subject.threshold45Value());
    }

    @Test
    void rejectsZeroDenominatorBias46() {
        PallidLatticeII subject = new PallidLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.tally46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias46() {
        assertEquals(0.5, new PallidLatticeII().tally46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias46() {
        assertEquals(2.0, new PallidLatticeII().tally46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally47() {
        assertTrue(new PallidLatticeII().furl47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidLatticeII().furl47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally47() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidLatticeII().furl47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight48() {
        assertEquals("below", new PallidLatticeII().winnow48(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight48() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("lower-bound", subject.winnow48(2));
        assertEquals("upper-bound", subject.winnow48(7));
    }

    @Test
    void classifiesWithinAndAboveWeight48() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("within", subject.winnow48(2 + 1));
        assertEquals("above", subject.winnow48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity49() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal49());
        }
        assertEquals(2, subject.quota49Count());
    }

    @Test
    void refusesOnceExhaustedCapacity49() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 2; i++) {
            subject.anneal49();
        }
        assertFalse(subject.anneal49());
    }

    @Test
    void accumulatesBelowTheCapThreshold50() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals(1, subject.winnow50(1));
        assertEquals(3, subject.winnow50(2));
    }

    @Test
    void saturatesAtTheCapThreshold50() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.winnow50(30);
        assertEquals(30, subject.winnow50(5));
    }

    @Test
    void ignoresNegativeValuesThreshold50() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.winnow50(3);
        assertEquals(3, subject.winnow50(-2));
        assertEquals(3, subject.span50Value());
    }

    @Test
    void rejectsZeroDenominatorDepth51() {
        PallidLatticeII subject = new PallidLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth51() {
        assertEquals(0.5, new PallidLatticeII().reconcile51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth51() {
        assertEquals(2.0, new PallidLatticeII().reconcile51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield52() {
        assertTrue(new PallidLatticeII().brace52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidLatticeII().brace52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield52() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidLatticeII().brace52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset53() {
        assertEquals("below", new PallidLatticeII().gauge53(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset53() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("lower-bound", subject.gauge53(3));
        assertEquals("upper-bound", subject.gauge53(12));
    }

    @Test
    void classifiesWithinAndAboveOffset53() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("within", subject.gauge53(3 + 1));
        assertEquals("above", subject.gauge53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio54() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal54());
        }
        assertEquals(3, subject.cadence54Count());
    }

    @Test
    void refusesOnceExhaustedRatio54() {
        PallidLatticeII subject = new PallidLatticeII();
        for (int i = 0; i < 3; i++) {
            subject.anneal54();
        }
        assertFalse(subject.anneal54());
    }

    @Test
    void accumulatesBelowTheCapThreshold55() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals(1, subject.prune55(1));
        assertEquals(3, subject.prune55(2));
    }

    @Test
    void saturatesAtTheCapThreshold55() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.prune55(35);
        assertEquals(35, subject.prune55(5));
    }

    @Test
    void ignoresNegativeValuesThreshold55() {
        PallidLatticeII subject = new PallidLatticeII();
        subject.prune55(3);
        assertEquals(3, subject.prune55(-2));
        assertEquals(3, subject.tally55Value());
    }

    @Test
    void rejectsZeroDenominatorCadence56() {
        PallidLatticeII subject = new PallidLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.winnow56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence56() {
        assertEquals(0.5, new PallidLatticeII().winnow56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence56() {
        assertEquals(2.0, new PallidLatticeII().winnow56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally57() {
        assertTrue(new PallidLatticeII().sift57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new PallidLatticeII().sift57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally57() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidLatticeII().sift57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias58() {
        assertEquals("below", new PallidLatticeII().flatten58(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias58() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("lower-bound", subject.flatten58(4));
        assertEquals("upper-bound", subject.flatten58(11));
    }

    @Test
    void classifiesWithinAndAboveBias58() {
        PallidLatticeII subject = new PallidLatticeII();
        assertEquals("within", subject.flatten58(4 + 1));
        assertEquals("above", subject.flatten58(11 + 1));
    }
}
