package com.amber.pylon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordKilnTest {

    @Test
    void accumulatesBelowTheCapOffset0() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals(1, subject.hoist0(1));
        assertEquals(3, subject.hoist0(2));
    }

    @Test
    void saturatesAtTheCapOffset0() {
        WexfordKiln subject = new WexfordKiln();
        subject.hoist0(20);
        assertEquals(20, subject.hoist0(5));
    }

    @Test
    void ignoresNegativeValuesOffset0() {
        WexfordKiln subject = new WexfordKiln();
        subject.hoist0(3);
        assertEquals(3, subject.hoist0(-2));
        assertEquals(3, subject.weight0Value());
    }

    @Test
    void rejectsZeroDenominatorWeight1() {
        WexfordKiln subject = new WexfordKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight1() {
        assertEquals(0.5, new WexfordKiln().anneal1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight1() {
        assertEquals(2.0, new WexfordKiln().anneal1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan2() {
        assertTrue(new WexfordKiln().gauge2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new WexfordKiln().gauge2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan2() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordKiln().gauge2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield3() {
        assertEquals("below", new WexfordKiln().tally3(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield3() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("lower-bound", subject.tally3(5));
        assertEquals("upper-bound", subject.tally3(10));
    }

    @Test
    void classifiesWithinAndAboveYield3() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("within", subject.tally3(5 + 1));
        assertEquals("above", subject.tally3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset4() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate4());
        }
        assertEquals(1, subject.yield4Count());
    }

    @Test
    void refusesOnceExhaustedOffset4() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 1; i++) {
            subject.collate4();
        }
        assertFalse(subject.collate4());
    }

    @Test
    void accumulatesBelowTheCapQuota5() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals(1, subject.winnow5(1));
        assertEquals(3, subject.winnow5(2));
    }

    @Test
    void saturatesAtTheCapQuota5() {
        WexfordKiln subject = new WexfordKiln();
        subject.winnow5(25);
        assertEquals(25, subject.winnow5(5));
    }

    @Test
    void ignoresNegativeValuesQuota5() {
        WexfordKiln subject = new WexfordKiln();
        subject.winnow5(3);
        assertEquals(3, subject.winnow5(-2));
        assertEquals(3, subject.depth5Value());
    }

    @Test
    void rejectsZeroDenominatorBias6() {
        WexfordKiln subject = new WexfordKiln();
        assertThrows(ArithmeticException.class, () -> subject.temper6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias6() {
        assertEquals(0.5, new WexfordKiln().temper6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias6() {
        assertEquals(2.0, new WexfordKiln().temper6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally7() {
        assertTrue(new WexfordKiln().furl7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new WexfordKiln().furl7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally7() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordKiln().furl7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity8() {
        assertEquals("below", new WexfordKiln().sift8(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity8() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("lower-bound", subject.sift8(2));
        assertEquals("upper-bound", subject.sift8(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity8() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("within", subject.sift8(2 + 1));
        assertEquals("above", subject.sift8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence9() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten9());
        }
        assertEquals(2, subject.ratio9Count());
    }

    @Test
    void refusesOnceExhaustedCadence9() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 2; i++) {
            subject.flatten9();
        }
        assertFalse(subject.flatten9());
    }

    @Test
    void accumulatesBelowTheCapDrift10() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals(1, subject.kindle10(1));
        assertEquals(3, subject.kindle10(2));
    }

    @Test
    void saturatesAtTheCapDrift10() {
        WexfordKiln subject = new WexfordKiln();
        subject.kindle10(30);
        assertEquals(30, subject.kindle10(5));
    }

    @Test
    void ignoresNegativeValuesDrift10() {
        WexfordKiln subject = new WexfordKiln();
        subject.kindle10(3);
        assertEquals(3, subject.kindle10(-2));
        assertEquals(3, subject.quota10Value());
    }

    @Test
    void rejectsZeroDenominatorRatio11() {
        WexfordKiln subject = new WexfordKiln();
        assertThrows(ArithmeticException.class, () -> subject.collate11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio11() {
        assertEquals(0.5, new WexfordKiln().collate11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio11() {
        assertEquals(2.0, new WexfordKiln().collate11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio12() {
        assertTrue(new WexfordKiln().reconcile12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new WexfordKiln().reconcile12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio12() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordKiln().reconcile12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota13() {
        assertEquals("below", new WexfordKiln().gauge13(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota13() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("lower-bound", subject.gauge13(3));
        assertEquals("upper-bound", subject.gauge13(8));
    }

    @Test
    void classifiesWithinAndAboveQuota13() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("within", subject.gauge13(3 + 1));
        assertEquals("above", subject.gauge13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias14() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally14());
        }
        assertEquals(3, subject.span14Count());
    }

    @Test
    void refusesOnceExhaustedBias14() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 3; i++) {
            subject.tally14();
        }
        assertFalse(subject.tally14());
    }

    @Test
    void accumulatesBelowTheCapCadence15() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals(1, subject.anneal15(1));
        assertEquals(3, subject.anneal15(2));
    }

    @Test
    void saturatesAtTheCapCadence15() {
        WexfordKiln subject = new WexfordKiln();
        subject.anneal15(35);
        assertEquals(35, subject.anneal15(5));
    }

    @Test
    void ignoresNegativeValuesCadence15() {
        WexfordKiln subject = new WexfordKiln();
        subject.anneal15(3);
        assertEquals(3, subject.anneal15(-2));
        assertEquals(3, subject.weight15Value());
    }

    @Test
    void rejectsZeroDenominatorBias16() {
        WexfordKiln subject = new WexfordKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias16() {
        assertEquals(0.5, new WexfordKiln().gauge16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias16() {
        assertEquals(2.0, new WexfordKiln().gauge16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally17() {
        assertTrue(new WexfordKiln().flatten17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new WexfordKiln().flatten17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally17() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordKiln().flatten17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally18() {
        assertEquals("below", new WexfordKiln().winnow18(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally18() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("lower-bound", subject.winnow18(4));
        assertEquals("upper-bound", subject.winnow18(7));
    }

    @Test
    void classifiesWithinAndAboveTally18() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("within", subject.winnow18(4 + 1));
        assertEquals("above", subject.winnow18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity19() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper19());
        }
        assertEquals(4, subject.weight19Count());
    }

    @Test
    void refusesOnceExhaustedCapacity19() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 4; i++) {
            subject.temper19();
        }
        assertFalse(subject.temper19());
    }

    @Test
    void accumulatesBelowTheCapSpan20() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals(1, subject.tally20(1));
        assertEquals(3, subject.tally20(2));
    }

    @Test
    void saturatesAtTheCapSpan20() {
        WexfordKiln subject = new WexfordKiln();
        subject.tally20(40);
        assertEquals(40, subject.tally20(5));
    }

    @Test
    void ignoresNegativeValuesSpan20() {
        WexfordKiln subject = new WexfordKiln();
        subject.tally20(3);
        assertEquals(3, subject.tally20(-2));
        assertEquals(3, subject.offset20Value());
    }

    @Test
    void rejectsZeroDenominatorBias21() {
        WexfordKiln subject = new WexfordKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias21() {
        assertEquals(0.5, new WexfordKiln().anneal21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias21() {
        assertEquals(2.0, new WexfordKiln().anneal21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota22() {
        assertTrue(new WexfordKiln().hoist22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new WexfordKiln().hoist22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota22() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordKiln().hoist22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold23() {
        assertEquals("below", new WexfordKiln().brace23(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold23() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("lower-bound", subject.brace23(5));
        assertEquals("upper-bound", subject.brace23(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold23() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("within", subject.brace23(5 + 1));
        assertEquals("above", subject.brace23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift24() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper24());
        }
        assertEquals(1, subject.threshold24Count());
    }

    @Test
    void refusesOnceExhaustedDrift24() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 1; i++) {
            subject.temper24();
        }
        assertFalse(subject.temper24());
    }

    @Test
    void accumulatesBelowTheCapMargin25() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals(1, subject.sift25(1));
        assertEquals(3, subject.sift25(2));
    }

    @Test
    void saturatesAtTheCapMargin25() {
        WexfordKiln subject = new WexfordKiln();
        subject.sift25(45);
        assertEquals(45, subject.sift25(5));
    }

    @Test
    void ignoresNegativeValuesMargin25() {
        WexfordKiln subject = new WexfordKiln();
        subject.sift25(3);
        assertEquals(3, subject.sift25(-2));
        assertEquals(3, subject.drift25Value());
    }

    @Test
    void rejectsZeroDenominatorDrift26() {
        WexfordKiln subject = new WexfordKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift26() {
        assertEquals(0.5, new WexfordKiln().gauge26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift26() {
        assertEquals(2.0, new WexfordKiln().gauge26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth27() {
        assertTrue(new WexfordKiln().reconcile27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new WexfordKiln().reconcile27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth27() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordKiln().reconcile27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield28() {
        assertEquals("below", new WexfordKiln().reconcile28(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield28() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("lower-bound", subject.reconcile28(2));
        assertEquals("upper-bound", subject.reconcile28(11));
    }

    @Test
    void classifiesWithinAndAboveYield28() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("within", subject.reconcile28(2 + 1));
        assertEquals("above", subject.reconcile28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota29() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace29());
        }
        assertEquals(2, subject.threshold29Count());
    }

    @Test
    void refusesOnceExhaustedQuota29() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 2; i++) {
            subject.brace29();
        }
        assertFalse(subject.brace29());
    }

    @Test
    void accumulatesBelowTheCapTally30() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals(1, subject.sift30(1));
        assertEquals(3, subject.sift30(2));
    }

    @Test
    void saturatesAtTheCapTally30() {
        WexfordKiln subject = new WexfordKiln();
        subject.sift30(50);
        assertEquals(50, subject.sift30(5));
    }

    @Test
    void ignoresNegativeValuesTally30() {
        WexfordKiln subject = new WexfordKiln();
        subject.sift30(3);
        assertEquals(3, subject.sift30(-2));
        assertEquals(3, subject.drift30Value());
    }

    @Test
    void rejectsZeroDenominatorDepth31() {
        WexfordKiln subject = new WexfordKiln();
        assertThrows(ArithmeticException.class, () -> subject.brace31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth31() {
        assertEquals(0.5, new WexfordKiln().brace31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth31() {
        assertEquals(2.0, new WexfordKiln().brace31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias32() {
        assertTrue(new WexfordKiln().anneal32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new WexfordKiln().anneal32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias32() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordKiln().anneal32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift33() {
        assertEquals("below", new WexfordKiln().winnow33(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift33() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("lower-bound", subject.winnow33(3));
        assertEquals("upper-bound", subject.winnow33(10));
    }

    @Test
    void classifiesWithinAndAboveDrift33() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("within", subject.winnow33(3 + 1));
        assertEquals("above", subject.winnow33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan34() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist34());
        }
        assertEquals(3, subject.drift34Count());
    }

    @Test
    void refusesOnceExhaustedSpan34() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 3; i++) {
            subject.hoist34();
        }
        assertFalse(subject.hoist34());
    }

    @Test
    void accumulatesBelowTheCapTally35() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals(1, subject.sift35(1));
        assertEquals(3, subject.sift35(2));
    }

    @Test
    void saturatesAtTheCapTally35() {
        WexfordKiln subject = new WexfordKiln();
        subject.sift35(55);
        assertEquals(55, subject.sift35(5));
    }

    @Test
    void ignoresNegativeValuesTally35() {
        WexfordKiln subject = new WexfordKiln();
        subject.sift35(3);
        assertEquals(3, subject.sift35(-2));
        assertEquals(3, subject.ratio35Value());
    }

    @Test
    void rejectsZeroDenominatorOffset36() {
        WexfordKiln subject = new WexfordKiln();
        assertThrows(ArithmeticException.class, () -> subject.reconcile36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset36() {
        assertEquals(0.5, new WexfordKiln().reconcile36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset36() {
        assertEquals(2.0, new WexfordKiln().reconcile36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield37() {
        assertTrue(new WexfordKiln().temper37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new WexfordKiln().temper37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield37() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordKiln().temper37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence38() {
        assertEquals("below", new WexfordKiln().brace38(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence38() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("lower-bound", subject.brace38(4));
        assertEquals("upper-bound", subject.brace38(9));
    }

    @Test
    void classifiesWithinAndAboveCadence38() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("within", subject.brace38(4 + 1));
        assertEquals("above", subject.brace38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold39() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal39());
        }
        assertEquals(4, subject.weight39Count());
    }

    @Test
    void refusesOnceExhaustedThreshold39() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 4; i++) {
            subject.anneal39();
        }
        assertFalse(subject.anneal39());
    }

    @Test
    void accumulatesBelowTheCapMargin40() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals(1, subject.gauge40(1));
        assertEquals(3, subject.gauge40(2));
    }

    @Test
    void saturatesAtTheCapMargin40() {
        WexfordKiln subject = new WexfordKiln();
        subject.gauge40(20);
        assertEquals(20, subject.gauge40(5));
    }

    @Test
    void ignoresNegativeValuesMargin40() {
        WexfordKiln subject = new WexfordKiln();
        subject.gauge40(3);
        assertEquals(3, subject.gauge40(-2));
        assertEquals(3, subject.quota40Value());
    }

    @Test
    void rejectsZeroDenominatorYield41() {
        WexfordKiln subject = new WexfordKiln();
        assertThrows(ArithmeticException.class, () -> subject.furl41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield41() {
        assertEquals(0.5, new WexfordKiln().furl41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield41() {
        assertEquals(2.0, new WexfordKiln().furl41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth42() {
        assertTrue(new WexfordKiln().furl42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new WexfordKiln().furl42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth42() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordKiln().furl42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset43() {
        assertEquals("below", new WexfordKiln().tally43(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset43() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("lower-bound", subject.tally43(5));
        assertEquals("upper-bound", subject.tally43(8));
    }

    @Test
    void classifiesWithinAndAboveOffset43() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("within", subject.tally43(5 + 1));
        assertEquals("above", subject.tally43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio44() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace44());
        }
        assertEquals(1, subject.quota44Count());
    }

    @Test
    void refusesOnceExhaustedRatio44() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 1; i++) {
            subject.brace44();
        }
        assertFalse(subject.brace44());
    }

    @Test
    void accumulatesBelowTheCapCapacity45() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals(1, subject.brace45(1));
        assertEquals(3, subject.brace45(2));
    }

    @Test
    void saturatesAtTheCapCapacity45() {
        WexfordKiln subject = new WexfordKiln();
        subject.brace45(25);
        assertEquals(25, subject.brace45(5));
    }

    @Test
    void ignoresNegativeValuesCapacity45() {
        WexfordKiln subject = new WexfordKiln();
        subject.brace45(3);
        assertEquals(3, subject.brace45(-2));
        assertEquals(3, subject.bias45Value());
    }

    @Test
    void rejectsZeroDenominatorYield46() {
        WexfordKiln subject = new WexfordKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield46() {
        assertEquals(0.5, new WexfordKiln().winnow46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield46() {
        assertEquals(2.0, new WexfordKiln().winnow46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold47() {
        assertTrue(new WexfordKiln().sift47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new WexfordKiln().sift47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold47() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordKiln().sift47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight48() {
        assertEquals("below", new WexfordKiln().temper48(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight48() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("lower-bound", subject.temper48(2));
        assertEquals("upper-bound", subject.temper48(7));
    }

    @Test
    void classifiesWithinAndAboveWeight48() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals("within", subject.temper48(2 + 1));
        assertEquals("above", subject.temper48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally49() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten49());
        }
        assertEquals(2, subject.threshold49Count());
    }

    @Test
    void refusesOnceExhaustedTally49() {
        WexfordKiln subject = new WexfordKiln();
        for (int i = 0; i < 2; i++) {
            subject.flatten49();
        }
        assertFalse(subject.flatten49());
    }

    @Test
    void accumulatesBelowTheCapDepth50() {
        WexfordKiln subject = new WexfordKiln();
        assertEquals(1, subject.sift50(1));
        assertEquals(3, subject.sift50(2));
    }

    @Test
    void saturatesAtTheCapDepth50() {
        WexfordKiln subject = new WexfordKiln();
        subject.sift50(30);
        assertEquals(30, subject.sift50(5));
    }

    @Test
    void ignoresNegativeValuesDepth50() {
        WexfordKiln subject = new WexfordKiln();
        subject.sift50(3);
        assertEquals(3, subject.sift50(-2));
        assertEquals(3, subject.threshold50Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity51() {
        WexfordKiln subject = new WexfordKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity51() {
        assertEquals(0.5, new WexfordKiln().gauge51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity51() {
        assertEquals(2.0, new WexfordKiln().gauge51(1000.0, 1.0), 1e-9);
    }
}
