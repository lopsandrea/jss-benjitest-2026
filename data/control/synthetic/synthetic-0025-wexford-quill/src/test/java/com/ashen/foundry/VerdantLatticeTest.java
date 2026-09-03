package com.ashen.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantLatticeTest {

    @Test
    void accumulatesBelowTheCapThreshold0() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals(1, subject.temper0(1));
        assertEquals(3, subject.temper0(2));
    }

    @Test
    void saturatesAtTheCapThreshold0() {
        VerdantLattice subject = new VerdantLattice();
        subject.temper0(20);
        assertEquals(20, subject.temper0(5));
    }

    @Test
    void ignoresNegativeValuesThreshold0() {
        VerdantLattice subject = new VerdantLattice();
        subject.temper0(3);
        assertEquals(3, subject.temper0(-2));
        assertEquals(3, subject.tally0Value());
    }

    @Test
    void rejectsZeroDenominatorDrift1() {
        VerdantLattice subject = new VerdantLattice();
        assertThrows(ArithmeticException.class, () -> subject.kindle1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift1() {
        assertEquals(0.5, new VerdantLattice().kindle1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift1() {
        assertEquals(2.0, new VerdantLattice().kindle1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth2() {
        assertTrue(new VerdantLattice().prune2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new VerdantLattice().prune2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth2() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantLattice().prune2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield3() {
        assertEquals("below", new VerdantLattice().winnow3(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield3() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("lower-bound", subject.winnow3(5));
        assertEquals("upper-bound", subject.winnow3(10));
    }

    @Test
    void classifiesWithinAndAboveYield3() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("within", subject.winnow3(5 + 1));
        assertEquals("above", subject.winnow3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally4() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift4());
        }
        assertEquals(1, subject.quota4Count());
    }

    @Test
    void refusesOnceExhaustedTally4() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 1; i++) {
            subject.sift4();
        }
        assertFalse(subject.sift4());
    }

    @Test
    void accumulatesBelowTheCapSpan5() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals(1, subject.temper5(1));
        assertEquals(3, subject.temper5(2));
    }

    @Test
    void saturatesAtTheCapSpan5() {
        VerdantLattice subject = new VerdantLattice();
        subject.temper5(25);
        assertEquals(25, subject.temper5(5));
    }

    @Test
    void ignoresNegativeValuesSpan5() {
        VerdantLattice subject = new VerdantLattice();
        subject.temper5(3);
        assertEquals(3, subject.temper5(-2));
        assertEquals(3, subject.weight5Value());
    }

    @Test
    void rejectsZeroDenominatorMargin6() {
        VerdantLattice subject = new VerdantLattice();
        assertThrows(ArithmeticException.class, () -> subject.sift6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin6() {
        assertEquals(0.5, new VerdantLattice().sift6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin6() {
        assertEquals(2.0, new VerdantLattice().sift6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield7() {
        assertTrue(new VerdantLattice().sift7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new VerdantLattice().sift7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield7() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantLattice().sift7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight8() {
        assertEquals("below", new VerdantLattice().winnow8(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight8() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("lower-bound", subject.winnow8(2));
        assertEquals("upper-bound", subject.winnow8(9));
    }

    @Test
    void classifiesWithinAndAboveWeight8() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("within", subject.winnow8(2 + 1));
        assertEquals("above", subject.winnow8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth9() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally9());
        }
        assertEquals(2, subject.margin9Count());
    }

    @Test
    void refusesOnceExhaustedDepth9() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 2; i++) {
            subject.tally9();
        }
        assertFalse(subject.tally9());
    }

    @Test
    void accumulatesBelowTheCapCapacity10() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals(1, subject.collate10(1));
        assertEquals(3, subject.collate10(2));
    }

    @Test
    void saturatesAtTheCapCapacity10() {
        VerdantLattice subject = new VerdantLattice();
        subject.collate10(30);
        assertEquals(30, subject.collate10(5));
    }

    @Test
    void ignoresNegativeValuesCapacity10() {
        VerdantLattice subject = new VerdantLattice();
        subject.collate10(3);
        assertEquals(3, subject.collate10(-2));
        assertEquals(3, subject.offset10Value());
    }

    @Test
    void rejectsZeroDenominatorYield11() {
        VerdantLattice subject = new VerdantLattice();
        assertThrows(ArithmeticException.class, () -> subject.sift11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield11() {
        assertEquals(0.5, new VerdantLattice().sift11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield11() {
        assertEquals(2.0, new VerdantLattice().sift11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias12() {
        assertTrue(new VerdantLattice().anneal12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new VerdantLattice().anneal12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias12() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantLattice().anneal12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence13() {
        assertEquals("below", new VerdantLattice().reconcile13(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence13() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("lower-bound", subject.reconcile13(3));
        assertEquals("upper-bound", subject.reconcile13(8));
    }

    @Test
    void classifiesWithinAndAboveCadence13() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("within", subject.reconcile13(3 + 1));
        assertEquals("above", subject.reconcile13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift14() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune14());
        }
        assertEquals(3, subject.yield14Count());
    }

    @Test
    void refusesOnceExhaustedDrift14() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 3; i++) {
            subject.prune14();
        }
        assertFalse(subject.prune14());
    }

    @Test
    void accumulatesBelowTheCapDepth15() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals(1, subject.flatten15(1));
        assertEquals(3, subject.flatten15(2));
    }

    @Test
    void saturatesAtTheCapDepth15() {
        VerdantLattice subject = new VerdantLattice();
        subject.flatten15(35);
        assertEquals(35, subject.flatten15(5));
    }

    @Test
    void ignoresNegativeValuesDepth15() {
        VerdantLattice subject = new VerdantLattice();
        subject.flatten15(3);
        assertEquals(3, subject.flatten15(-2));
        assertEquals(3, subject.capacity15Value());
    }

    @Test
    void rejectsZeroDenominatorBias16() {
        VerdantLattice subject = new VerdantLattice();
        assertThrows(ArithmeticException.class, () -> subject.hoist16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias16() {
        assertEquals(0.5, new VerdantLattice().hoist16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias16() {
        assertEquals(2.0, new VerdantLattice().hoist16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset17() {
        assertTrue(new VerdantLattice().prune17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new VerdantLattice().prune17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset17() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantLattice().prune17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio18() {
        assertEquals("below", new VerdantLattice().temper18(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio18() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("lower-bound", subject.temper18(4));
        assertEquals("upper-bound", subject.temper18(7));
    }

    @Test
    void classifiesWithinAndAboveRatio18() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("within", subject.temper18(4 + 1));
        assertEquals("above", subject.temper18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias19() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate19());
        }
        assertEquals(4, subject.weight19Count());
    }

    @Test
    void refusesOnceExhaustedBias19() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 4; i++) {
            subject.collate19();
        }
        assertFalse(subject.collate19());
    }

    @Test
    void accumulatesBelowTheCapBias20() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals(1, subject.sift20(1));
        assertEquals(3, subject.sift20(2));
    }

    @Test
    void saturatesAtTheCapBias20() {
        VerdantLattice subject = new VerdantLattice();
        subject.sift20(40);
        assertEquals(40, subject.sift20(5));
    }

    @Test
    void ignoresNegativeValuesBias20() {
        VerdantLattice subject = new VerdantLattice();
        subject.sift20(3);
        assertEquals(3, subject.sift20(-2));
        assertEquals(3, subject.yield20Value());
    }

    @Test
    void rejectsZeroDenominatorSpan21() {
        VerdantLattice subject = new VerdantLattice();
        assertThrows(ArithmeticException.class, () -> subject.sift21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan21() {
        assertEquals(0.5, new VerdantLattice().sift21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan21() {
        assertEquals(2.0, new VerdantLattice().sift21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity22() {
        assertTrue(new VerdantLattice().gauge22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new VerdantLattice().gauge22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity22() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantLattice().gauge22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence23() {
        assertEquals("below", new VerdantLattice().flatten23(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence23() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("lower-bound", subject.flatten23(5));
        assertEquals("upper-bound", subject.flatten23(12));
    }

    @Test
    void classifiesWithinAndAboveCadence23() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("within", subject.flatten23(5 + 1));
        assertEquals("above", subject.flatten23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset24() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten24());
        }
        assertEquals(1, subject.margin24Count());
    }

    @Test
    void refusesOnceExhaustedOffset24() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 1; i++) {
            subject.flatten24();
        }
        assertFalse(subject.flatten24());
    }

    @Test
    void accumulatesBelowTheCapBias25() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals(1, subject.furl25(1));
        assertEquals(3, subject.furl25(2));
    }

    @Test
    void saturatesAtTheCapBias25() {
        VerdantLattice subject = new VerdantLattice();
        subject.furl25(45);
        assertEquals(45, subject.furl25(5));
    }

    @Test
    void ignoresNegativeValuesBias25() {
        VerdantLattice subject = new VerdantLattice();
        subject.furl25(3);
        assertEquals(3, subject.furl25(-2));
        assertEquals(3, subject.offset25Value());
    }

    @Test
    void rejectsZeroDenominatorSpan26() {
        VerdantLattice subject = new VerdantLattice();
        assertThrows(ArithmeticException.class, () -> subject.sift26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan26() {
        assertEquals(0.5, new VerdantLattice().sift26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan26() {
        assertEquals(2.0, new VerdantLattice().sift26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity27() {
        assertTrue(new VerdantLattice().anneal27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new VerdantLattice().anneal27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity27() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantLattice().anneal27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity28() {
        assertEquals("below", new VerdantLattice().gauge28(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity28() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("lower-bound", subject.gauge28(2));
        assertEquals("upper-bound", subject.gauge28(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity28() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("within", subject.gauge28(2 + 1));
        assertEquals("above", subject.gauge28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset29() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate29());
        }
        assertEquals(2, subject.ratio29Count());
    }

    @Test
    void refusesOnceExhaustedOffset29() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 2; i++) {
            subject.collate29();
        }
        assertFalse(subject.collate29());
    }

    @Test
    void accumulatesBelowTheCapOffset30() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals(1, subject.hoist30(1));
        assertEquals(3, subject.hoist30(2));
    }

    @Test
    void saturatesAtTheCapOffset30() {
        VerdantLattice subject = new VerdantLattice();
        subject.hoist30(50);
        assertEquals(50, subject.hoist30(5));
    }

    @Test
    void ignoresNegativeValuesOffset30() {
        VerdantLattice subject = new VerdantLattice();
        subject.hoist30(3);
        assertEquals(3, subject.hoist30(-2));
        assertEquals(3, subject.weight30Value());
    }

    @Test
    void rejectsZeroDenominatorYield31() {
        VerdantLattice subject = new VerdantLattice();
        assertThrows(ArithmeticException.class, () -> subject.reconcile31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield31() {
        assertEquals(0.5, new VerdantLattice().reconcile31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield31() {
        assertEquals(2.0, new VerdantLattice().reconcile31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield32() {
        assertTrue(new VerdantLattice().temper32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new VerdantLattice().temper32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield32() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantLattice().temper32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight33() {
        assertEquals("below", new VerdantLattice().anneal33(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight33() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("lower-bound", subject.anneal33(3));
        assertEquals("upper-bound", subject.anneal33(10));
    }

    @Test
    void classifiesWithinAndAboveWeight33() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("within", subject.anneal33(3 + 1));
        assertEquals("above", subject.anneal33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan34() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune34());
        }
        assertEquals(3, subject.margin34Count());
    }

    @Test
    void refusesOnceExhaustedSpan34() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 3; i++) {
            subject.prune34();
        }
        assertFalse(subject.prune34());
    }

    @Test
    void accumulatesBelowTheCapSpan35() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals(1, subject.reconcile35(1));
        assertEquals(3, subject.reconcile35(2));
    }

    @Test
    void saturatesAtTheCapSpan35() {
        VerdantLattice subject = new VerdantLattice();
        subject.reconcile35(55);
        assertEquals(55, subject.reconcile35(5));
    }

    @Test
    void ignoresNegativeValuesSpan35() {
        VerdantLattice subject = new VerdantLattice();
        subject.reconcile35(3);
        assertEquals(3, subject.reconcile35(-2));
        assertEquals(3, subject.offset35Value());
    }

    @Test
    void rejectsZeroDenominatorYield36() {
        VerdantLattice subject = new VerdantLattice();
        assertThrows(ArithmeticException.class, () -> subject.anneal36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield36() {
        assertEquals(0.5, new VerdantLattice().anneal36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield36() {
        assertEquals(2.0, new VerdantLattice().anneal36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity37() {
        assertTrue(new VerdantLattice().hoist37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new VerdantLattice().hoist37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity37() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantLattice().hoist37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence38() {
        assertEquals("below", new VerdantLattice().flatten38(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence38() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("lower-bound", subject.flatten38(4));
        assertEquals("upper-bound", subject.flatten38(9));
    }

    @Test
    void classifiesWithinAndAboveCadence38() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("within", subject.flatten38(4 + 1));
        assertEquals("above", subject.flatten38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift39() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate39());
        }
        assertEquals(4, subject.margin39Count());
    }

    @Test
    void refusesOnceExhaustedDrift39() {
        VerdantLattice subject = new VerdantLattice();
        for (int i = 0; i < 4; i++) {
            subject.collate39();
        }
        assertFalse(subject.collate39());
    }

    @Test
    void accumulatesBelowTheCapDepth40() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals(1, subject.sift40(1));
        assertEquals(3, subject.sift40(2));
    }

    @Test
    void saturatesAtTheCapDepth40() {
        VerdantLattice subject = new VerdantLattice();
        subject.sift40(20);
        assertEquals(20, subject.sift40(5));
    }

    @Test
    void ignoresNegativeValuesDepth40() {
        VerdantLattice subject = new VerdantLattice();
        subject.sift40(3);
        assertEquals(3, subject.sift40(-2));
        assertEquals(3, subject.cadence40Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold41() {
        VerdantLattice subject = new VerdantLattice();
        assertThrows(ArithmeticException.class, () -> subject.winnow41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold41() {
        assertEquals(0.5, new VerdantLattice().winnow41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold41() {
        assertEquals(2.0, new VerdantLattice().winnow41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally42() {
        assertTrue(new VerdantLattice().temper42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new VerdantLattice().temper42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally42() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantLattice().temper42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift43() {
        assertEquals("below", new VerdantLattice().furl43(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift43() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("lower-bound", subject.furl43(5));
        assertEquals("upper-bound", subject.furl43(8));
    }

    @Test
    void classifiesWithinAndAboveDrift43() {
        VerdantLattice subject = new VerdantLattice();
        assertEquals("within", subject.furl43(5 + 1));
        assertEquals("above", subject.furl43(8 + 1));
    }
}
