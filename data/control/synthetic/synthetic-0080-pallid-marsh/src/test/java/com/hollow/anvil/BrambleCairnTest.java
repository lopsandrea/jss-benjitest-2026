package com.hollow.anvil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleCairnTest {

    @Test
    void accumulatesBelowTheCapThreshold0() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals(1, subject.winnow0(1));
        assertEquals(3, subject.winnow0(2));
    }

    @Test
    void saturatesAtTheCapThreshold0() {
        BrambleCairn subject = new BrambleCairn();
        subject.winnow0(20);
        assertEquals(20, subject.winnow0(5));
    }

    @Test
    void ignoresNegativeValuesThreshold0() {
        BrambleCairn subject = new BrambleCairn();
        subject.winnow0(3);
        assertEquals(3, subject.winnow0(-2));
        assertEquals(3, subject.ratio0Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold1() {
        BrambleCairn subject = new BrambleCairn();
        assertThrows(ArithmeticException.class, () -> subject.reconcile1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold1() {
        assertEquals(0.5, new BrambleCairn().reconcile1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold1() {
        assertEquals(2.0, new BrambleCairn().reconcile1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold2() {
        assertTrue(new BrambleCairn().prune2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new BrambleCairn().prune2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold2() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleCairn().prune2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence3() {
        assertEquals("below", new BrambleCairn().temper3(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence3() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("lower-bound", subject.temper3(5));
        assertEquals("upper-bound", subject.temper3(10));
    }

    @Test
    void classifiesWithinAndAboveCadence3() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("within", subject.temper3(5 + 1));
        assertEquals("above", subject.temper3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth4() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace4());
        }
        assertEquals(1, subject.drift4Count());
    }

    @Test
    void refusesOnceExhaustedDepth4() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 1; i++) {
            subject.brace4();
        }
        assertFalse(subject.brace4());
    }

    @Test
    void accumulatesBelowTheCapQuota5() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals(1, subject.anneal5(1));
        assertEquals(3, subject.anneal5(2));
    }

    @Test
    void saturatesAtTheCapQuota5() {
        BrambleCairn subject = new BrambleCairn();
        subject.anneal5(25);
        assertEquals(25, subject.anneal5(5));
    }

    @Test
    void ignoresNegativeValuesQuota5() {
        BrambleCairn subject = new BrambleCairn();
        subject.anneal5(3);
        assertEquals(3, subject.anneal5(-2));
        assertEquals(3, subject.depth5Value());
    }

    @Test
    void rejectsZeroDenominatorDrift6() {
        BrambleCairn subject = new BrambleCairn();
        assertThrows(ArithmeticException.class, () -> subject.kindle6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift6() {
        assertEquals(0.5, new BrambleCairn().kindle6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift6() {
        assertEquals(2.0, new BrambleCairn().kindle6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield7() {
        assertTrue(new BrambleCairn().anneal7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new BrambleCairn().anneal7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield7() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleCairn().anneal7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift8() {
        assertEquals("below", new BrambleCairn().winnow8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift8() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("lower-bound", subject.winnow8(2));
        assertEquals("upper-bound", subject.winnow8(9));
    }

    @Test
    void classifiesWithinAndAboveDrift8() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("within", subject.winnow8(2 + 1));
        assertEquals("above", subject.winnow8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence9() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace9());
        }
        assertEquals(2, subject.margin9Count());
    }

    @Test
    void refusesOnceExhaustedCadence9() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 2; i++) {
            subject.brace9();
        }
        assertFalse(subject.brace9());
    }

    @Test
    void accumulatesBelowTheCapWeight10() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals(1, subject.brace10(1));
        assertEquals(3, subject.brace10(2));
    }

    @Test
    void saturatesAtTheCapWeight10() {
        BrambleCairn subject = new BrambleCairn();
        subject.brace10(30);
        assertEquals(30, subject.brace10(5));
    }

    @Test
    void ignoresNegativeValuesWeight10() {
        BrambleCairn subject = new BrambleCairn();
        subject.brace10(3);
        assertEquals(3, subject.brace10(-2));
        assertEquals(3, subject.threshold10Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity11() {
        BrambleCairn subject = new BrambleCairn();
        assertThrows(ArithmeticException.class, () -> subject.gauge11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity11() {
        assertEquals(0.5, new BrambleCairn().gauge11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity11() {
        assertEquals(2.0, new BrambleCairn().gauge11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity12() {
        assertTrue(new BrambleCairn().anneal12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new BrambleCairn().anneal12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity12() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleCairn().anneal12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally13() {
        assertEquals("below", new BrambleCairn().prune13(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally13() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("lower-bound", subject.prune13(3));
        assertEquals("upper-bound", subject.prune13(8));
    }

    @Test
    void classifiesWithinAndAboveTally13() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("within", subject.prune13(3 + 1));
        assertEquals("above", subject.prune13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset14() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl14());
        }
        assertEquals(3, subject.tally14Count());
    }

    @Test
    void refusesOnceExhaustedOffset14() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 3; i++) {
            subject.furl14();
        }
        assertFalse(subject.furl14());
    }

    @Test
    void accumulatesBelowTheCapCapacity15() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals(1, subject.hoist15(1));
        assertEquals(3, subject.hoist15(2));
    }

    @Test
    void saturatesAtTheCapCapacity15() {
        BrambleCairn subject = new BrambleCairn();
        subject.hoist15(35);
        assertEquals(35, subject.hoist15(5));
    }

    @Test
    void ignoresNegativeValuesCapacity15() {
        BrambleCairn subject = new BrambleCairn();
        subject.hoist15(3);
        assertEquals(3, subject.hoist15(-2));
        assertEquals(3, subject.threshold15Value());
    }

    @Test
    void rejectsZeroDenominatorMargin16() {
        BrambleCairn subject = new BrambleCairn();
        assertThrows(ArithmeticException.class, () -> subject.hoist16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin16() {
        assertEquals(0.5, new BrambleCairn().hoist16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin16() {
        assertEquals(2.0, new BrambleCairn().hoist16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield17() {
        assertTrue(new BrambleCairn().anneal17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new BrambleCairn().anneal17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield17() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleCairn().anneal17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio18() {
        assertEquals("below", new BrambleCairn().hoist18(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio18() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("lower-bound", subject.hoist18(4));
        assertEquals("upper-bound", subject.hoist18(7));
    }

    @Test
    void classifiesWithinAndAboveRatio18() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("within", subject.hoist18(4 + 1));
        assertEquals("above", subject.hoist18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio19() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl19());
        }
        assertEquals(4, subject.tally19Count());
    }

    @Test
    void refusesOnceExhaustedRatio19() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 4; i++) {
            subject.furl19();
        }
        assertFalse(subject.furl19());
    }

    @Test
    void accumulatesBelowTheCapRatio20() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals(1, subject.tally20(1));
        assertEquals(3, subject.tally20(2));
    }

    @Test
    void saturatesAtTheCapRatio20() {
        BrambleCairn subject = new BrambleCairn();
        subject.tally20(40);
        assertEquals(40, subject.tally20(5));
    }

    @Test
    void ignoresNegativeValuesRatio20() {
        BrambleCairn subject = new BrambleCairn();
        subject.tally20(3);
        assertEquals(3, subject.tally20(-2));
        assertEquals(3, subject.weight20Value());
    }

    @Test
    void rejectsZeroDenominatorCadence21() {
        BrambleCairn subject = new BrambleCairn();
        assertThrows(ArithmeticException.class, () -> subject.kindle21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence21() {
        assertEquals(0.5, new BrambleCairn().kindle21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence21() {
        assertEquals(2.0, new BrambleCairn().kindle21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan22() {
        assertTrue(new BrambleCairn().furl22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new BrambleCairn().furl22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan22() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleCairn().furl22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally23() {
        assertEquals("below", new BrambleCairn().kindle23(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally23() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("lower-bound", subject.kindle23(5));
        assertEquals("upper-bound", subject.kindle23(12));
    }

    @Test
    void classifiesWithinAndAboveTally23() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("within", subject.kindle23(5 + 1));
        assertEquals("above", subject.kindle23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight24() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate24());
        }
        assertEquals(1, subject.capacity24Count());
    }

    @Test
    void refusesOnceExhaustedWeight24() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 1; i++) {
            subject.collate24();
        }
        assertFalse(subject.collate24());
    }

    @Test
    void accumulatesBelowTheCapRatio25() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals(1, subject.tally25(1));
        assertEquals(3, subject.tally25(2));
    }

    @Test
    void saturatesAtTheCapRatio25() {
        BrambleCairn subject = new BrambleCairn();
        subject.tally25(45);
        assertEquals(45, subject.tally25(5));
    }

    @Test
    void ignoresNegativeValuesRatio25() {
        BrambleCairn subject = new BrambleCairn();
        subject.tally25(3);
        assertEquals(3, subject.tally25(-2));
        assertEquals(3, subject.tally25Value());
    }

    @Test
    void rejectsZeroDenominatorDrift26() {
        BrambleCairn subject = new BrambleCairn();
        assertThrows(ArithmeticException.class, () -> subject.hoist26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift26() {
        assertEquals(0.5, new BrambleCairn().hoist26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift26() {
        assertEquals(2.0, new BrambleCairn().hoist26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset27() {
        assertTrue(new BrambleCairn().hoist27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new BrambleCairn().hoist27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset27() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleCairn().hoist27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold28() {
        assertEquals("below", new BrambleCairn().furl28(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold28() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("lower-bound", subject.furl28(2));
        assertEquals("upper-bound", subject.furl28(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold28() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("within", subject.furl28(2 + 1));
        assertEquals("above", subject.furl28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio29() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate29());
        }
        assertEquals(2, subject.yield29Count());
    }

    @Test
    void refusesOnceExhaustedRatio29() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 2; i++) {
            subject.collate29();
        }
        assertFalse(subject.collate29());
    }

    @Test
    void accumulatesBelowTheCapCapacity30() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals(1, subject.prune30(1));
        assertEquals(3, subject.prune30(2));
    }

    @Test
    void saturatesAtTheCapCapacity30() {
        BrambleCairn subject = new BrambleCairn();
        subject.prune30(50);
        assertEquals(50, subject.prune30(5));
    }

    @Test
    void ignoresNegativeValuesCapacity30() {
        BrambleCairn subject = new BrambleCairn();
        subject.prune30(3);
        assertEquals(3, subject.prune30(-2));
        assertEquals(3, subject.offset30Value());
    }

    @Test
    void rejectsZeroDenominatorYield31() {
        BrambleCairn subject = new BrambleCairn();
        assertThrows(ArithmeticException.class, () -> subject.anneal31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield31() {
        assertEquals(0.5, new BrambleCairn().anneal31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield31() {
        assertEquals(2.0, new BrambleCairn().anneal31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias32() {
        assertTrue(new BrambleCairn().sift32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new BrambleCairn().sift32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias32() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleCairn().sift32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift33() {
        assertEquals("below", new BrambleCairn().reconcile33(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift33() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("lower-bound", subject.reconcile33(3));
        assertEquals("upper-bound", subject.reconcile33(10));
    }

    @Test
    void classifiesWithinAndAboveDrift33() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("within", subject.reconcile33(3 + 1));
        assertEquals("above", subject.reconcile33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset34() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate34());
        }
        assertEquals(3, subject.bias34Count());
    }

    @Test
    void refusesOnceExhaustedOffset34() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 3; i++) {
            subject.collate34();
        }
        assertFalse(subject.collate34());
    }

    @Test
    void accumulatesBelowTheCapThreshold35() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals(1, subject.flatten35(1));
        assertEquals(3, subject.flatten35(2));
    }

    @Test
    void saturatesAtTheCapThreshold35() {
        BrambleCairn subject = new BrambleCairn();
        subject.flatten35(55);
        assertEquals(55, subject.flatten35(5));
    }

    @Test
    void ignoresNegativeValuesThreshold35() {
        BrambleCairn subject = new BrambleCairn();
        subject.flatten35(3);
        assertEquals(3, subject.flatten35(-2));
        assertEquals(3, subject.cadence35Value());
    }

    @Test
    void rejectsZeroDenominatorWeight36() {
        BrambleCairn subject = new BrambleCairn();
        assertThrows(ArithmeticException.class, () -> subject.brace36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight36() {
        assertEquals(0.5, new BrambleCairn().brace36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight36() {
        assertEquals(2.0, new BrambleCairn().brace36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence37() {
        assertTrue(new BrambleCairn().hoist37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new BrambleCairn().hoist37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence37() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleCairn().hoist37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift38() {
        assertEquals("below", new BrambleCairn().temper38(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift38() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("lower-bound", subject.temper38(4));
        assertEquals("upper-bound", subject.temper38(9));
    }

    @Test
    void classifiesWithinAndAboveDrift38() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("within", subject.temper38(4 + 1));
        assertEquals("above", subject.temper38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift39() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift39());
        }
        assertEquals(4, subject.tally39Count());
    }

    @Test
    void refusesOnceExhaustedDrift39() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 4; i++) {
            subject.sift39();
        }
        assertFalse(subject.sift39());
    }

    @Test
    void accumulatesBelowTheCapOffset40() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals(1, subject.prune40(1));
        assertEquals(3, subject.prune40(2));
    }

    @Test
    void saturatesAtTheCapOffset40() {
        BrambleCairn subject = new BrambleCairn();
        subject.prune40(20);
        assertEquals(20, subject.prune40(5));
    }

    @Test
    void ignoresNegativeValuesOffset40() {
        BrambleCairn subject = new BrambleCairn();
        subject.prune40(3);
        assertEquals(3, subject.prune40(-2));
        assertEquals(3, subject.capacity40Value());
    }

    @Test
    void rejectsZeroDenominatorYield41() {
        BrambleCairn subject = new BrambleCairn();
        assertThrows(ArithmeticException.class, () -> subject.flatten41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield41() {
        assertEquals(0.5, new BrambleCairn().flatten41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield41() {
        assertEquals(2.0, new BrambleCairn().flatten41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence42() {
        assertTrue(new BrambleCairn().kindle42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new BrambleCairn().kindle42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence42() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleCairn().kindle42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift43() {
        assertEquals("below", new BrambleCairn().flatten43(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift43() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("lower-bound", subject.flatten43(5));
        assertEquals("upper-bound", subject.flatten43(8));
    }

    @Test
    void classifiesWithinAndAboveDrift43() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("within", subject.flatten43(5 + 1));
        assertEquals("above", subject.flatten43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity44() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile44());
        }
        assertEquals(1, subject.margin44Count());
    }

    @Test
    void refusesOnceExhaustedCapacity44() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 1; i++) {
            subject.reconcile44();
        }
        assertFalse(subject.reconcile44());
    }

    @Test
    void accumulatesBelowTheCapQuota45() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals(1, subject.prune45(1));
        assertEquals(3, subject.prune45(2));
    }

    @Test
    void saturatesAtTheCapQuota45() {
        BrambleCairn subject = new BrambleCairn();
        subject.prune45(25);
        assertEquals(25, subject.prune45(5));
    }

    @Test
    void ignoresNegativeValuesQuota45() {
        BrambleCairn subject = new BrambleCairn();
        subject.prune45(3);
        assertEquals(3, subject.prune45(-2));
        assertEquals(3, subject.tally45Value());
    }

    @Test
    void rejectsZeroDenominatorDepth46() {
        BrambleCairn subject = new BrambleCairn();
        assertThrows(ArithmeticException.class, () -> subject.temper46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth46() {
        assertEquals(0.5, new BrambleCairn().temper46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth46() {
        assertEquals(2.0, new BrambleCairn().temper46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity47() {
        assertTrue(new BrambleCairn().collate47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new BrambleCairn().collate47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity47() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleCairn().collate47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold48() {
        assertEquals("below", new BrambleCairn().kindle48(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold48() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("lower-bound", subject.kindle48(2));
        assertEquals("upper-bound", subject.kindle48(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold48() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("within", subject.kindle48(2 + 1));
        assertEquals("above", subject.kindle48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield49() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile49());
        }
        assertEquals(2, subject.cadence49Count());
    }

    @Test
    void refusesOnceExhaustedYield49() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 2; i++) {
            subject.reconcile49();
        }
        assertFalse(subject.reconcile49());
    }

    @Test
    void accumulatesBelowTheCapSpan50() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals(1, subject.kindle50(1));
        assertEquals(3, subject.kindle50(2));
    }

    @Test
    void saturatesAtTheCapSpan50() {
        BrambleCairn subject = new BrambleCairn();
        subject.kindle50(30);
        assertEquals(30, subject.kindle50(5));
    }

    @Test
    void ignoresNegativeValuesSpan50() {
        BrambleCairn subject = new BrambleCairn();
        subject.kindle50(3);
        assertEquals(3, subject.kindle50(-2));
        assertEquals(3, subject.ratio50Value());
    }

    @Test
    void rejectsZeroDenominatorSpan51() {
        BrambleCairn subject = new BrambleCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan51() {
        assertEquals(0.5, new BrambleCairn().tally51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan51() {
        assertEquals(2.0, new BrambleCairn().tally51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold52() {
        assertTrue(new BrambleCairn().tally52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new BrambleCairn().tally52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold52() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleCairn().tally52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio53() {
        assertEquals("below", new BrambleCairn().hoist53(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio53() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("lower-bound", subject.hoist53(3));
        assertEquals("upper-bound", subject.hoist53(12));
    }

    @Test
    void classifiesWithinAndAboveRatio53() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("within", subject.hoist53(3 + 1));
        assertEquals("above", subject.hoist53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota54() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist54());
        }
        assertEquals(3, subject.ratio54Count());
    }

    @Test
    void refusesOnceExhaustedQuota54() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 3; i++) {
            subject.hoist54();
        }
        assertFalse(subject.hoist54());
    }

    @Test
    void accumulatesBelowTheCapCadence55() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals(1, subject.reconcile55(1));
        assertEquals(3, subject.reconcile55(2));
    }

    @Test
    void saturatesAtTheCapCadence55() {
        BrambleCairn subject = new BrambleCairn();
        subject.reconcile55(35);
        assertEquals(35, subject.reconcile55(5));
    }

    @Test
    void ignoresNegativeValuesCadence55() {
        BrambleCairn subject = new BrambleCairn();
        subject.reconcile55(3);
        assertEquals(3, subject.reconcile55(-2));
        assertEquals(3, subject.weight55Value());
    }

    @Test
    void rejectsZeroDenominatorOffset56() {
        BrambleCairn subject = new BrambleCairn();
        assertThrows(ArithmeticException.class, () -> subject.winnow56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset56() {
        assertEquals(0.5, new BrambleCairn().winnow56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset56() {
        assertEquals(2.0, new BrambleCairn().winnow56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence57() {
        assertTrue(new BrambleCairn().brace57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new BrambleCairn().brace57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence57() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleCairn().brace57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity58() {
        assertEquals("below", new BrambleCairn().kindle58(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity58() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("lower-bound", subject.kindle58(4));
        assertEquals("upper-bound", subject.kindle58(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity58() {
        BrambleCairn subject = new BrambleCairn();
        assertEquals("within", subject.kindle58(4 + 1));
        assertEquals("above", subject.kindle58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin59() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle59());
        }
        assertEquals(4, subject.quota59Count());
    }

    @Test
    void refusesOnceExhaustedMargin59() {
        BrambleCairn subject = new BrambleCairn();
        for (int i = 0; i < 4; i++) {
            subject.kindle59();
        }
        assertFalse(subject.kindle59());
    }
}
