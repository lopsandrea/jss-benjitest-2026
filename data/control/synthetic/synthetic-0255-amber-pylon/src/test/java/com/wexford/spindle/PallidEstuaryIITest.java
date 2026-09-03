package com.wexford.spindle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidEstuaryIITest {

    @Test
    void accumulatesBelowTheCapCapacity0() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.flatten0(1));
        assertEquals(3, subject.flatten0(2));
    }

    @Test
    void saturatesAtTheCapCapacity0() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.flatten0(20);
        assertEquals(20, subject.flatten0(5));
    }

    @Test
    void ignoresNegativeValuesCapacity0() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.flatten0(3);
        assertEquals(3, subject.flatten0(-2));
        assertEquals(3, subject.span0Value());
    }

    @Test
    void rejectsZeroDenominatorTally1() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally1() {
        assertEquals(0.5, new PallidEstuaryII().winnow1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally1() {
        assertEquals(2.0, new PallidEstuaryII().winnow1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift2() {
        assertTrue(new PallidEstuaryII().reconcile2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidEstuaryII().reconcile2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift2() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidEstuaryII().reconcile2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset3() {
        assertEquals("below", new PallidEstuaryII().hoist3(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset3() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.hoist3(5));
        assertEquals("upper-bound", subject.hoist3(10));
    }

    @Test
    void classifiesWithinAndAboveOffset3() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.hoist3(5 + 1));
        assertEquals("above", subject.hoist3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan4() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist4());
        }
        assertEquals(1, subject.bias4Count());
    }

    @Test
    void refusesOnceExhaustedSpan4() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 1; i++) {
            subject.hoist4();
        }
        assertFalse(subject.hoist4());
    }

    @Test
    void accumulatesBelowTheCapMargin5() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.collate5(1));
        assertEquals(3, subject.collate5(2));
    }

    @Test
    void saturatesAtTheCapMargin5() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.collate5(25);
        assertEquals(25, subject.collate5(5));
    }

    @Test
    void ignoresNegativeValuesMargin5() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.collate5(3);
        assertEquals(3, subject.collate5(-2));
        assertEquals(3, subject.cadence5Value());
    }

    @Test
    void rejectsZeroDenominatorDrift6() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.flatten6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift6() {
        assertEquals(0.5, new PallidEstuaryII().flatten6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift6() {
        assertEquals(2.0, new PallidEstuaryII().flatten6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan7() {
        assertTrue(new PallidEstuaryII().flatten7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidEstuaryII().flatten7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan7() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidEstuaryII().flatten7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield8() {
        assertEquals("below", new PallidEstuaryII().gauge8(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield8() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.gauge8(2));
        assertEquals("upper-bound", subject.gauge8(9));
    }

    @Test
    void classifiesWithinAndAboveYield8() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.gauge8(2 + 1));
        assertEquals("above", subject.gauge8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin9() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl9());
        }
        assertEquals(2, subject.cadence9Count());
    }

    @Test
    void refusesOnceExhaustedMargin9() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 2; i++) {
            subject.furl9();
        }
        assertFalse(subject.furl9());
    }

    @Test
    void accumulatesBelowTheCapSpan10() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.gauge10(1));
        assertEquals(3, subject.gauge10(2));
    }

    @Test
    void saturatesAtTheCapSpan10() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.gauge10(30);
        assertEquals(30, subject.gauge10(5));
    }

    @Test
    void ignoresNegativeValuesSpan10() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.gauge10(3);
        assertEquals(3, subject.gauge10(-2));
        assertEquals(3, subject.weight10Value());
    }

    @Test
    void rejectsZeroDenominatorSpan11() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.sift11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan11() {
        assertEquals(0.5, new PallidEstuaryII().sift11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan11() {
        assertEquals(2.0, new PallidEstuaryII().sift11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence12() {
        assertTrue(new PallidEstuaryII().sift12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new PallidEstuaryII().sift12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence12() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidEstuaryII().sift12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight13() {
        assertEquals("below", new PallidEstuaryII().prune13(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight13() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.prune13(3));
        assertEquals("upper-bound", subject.prune13(8));
    }

    @Test
    void classifiesWithinAndAboveWeight13() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.prune13(3 + 1));
        assertEquals("above", subject.prune13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold14() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow14());
        }
        assertEquals(3, subject.depth14Count());
    }

    @Test
    void refusesOnceExhaustedThreshold14() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 3; i++) {
            subject.winnow14();
        }
        assertFalse(subject.winnow14());
    }

    @Test
    void accumulatesBelowTheCapMargin15() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.collate15(1));
        assertEquals(3, subject.collate15(2));
    }

    @Test
    void saturatesAtTheCapMargin15() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.collate15(35);
        assertEquals(35, subject.collate15(5));
    }

    @Test
    void ignoresNegativeValuesMargin15() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.collate15(3);
        assertEquals(3, subject.collate15(-2));
        assertEquals(3, subject.bias15Value());
    }

    @Test
    void rejectsZeroDenominatorDepth16() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.collate16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth16() {
        assertEquals(0.5, new PallidEstuaryII().collate16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth16() {
        assertEquals(2.0, new PallidEstuaryII().collate16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally17() {
        assertTrue(new PallidEstuaryII().anneal17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new PallidEstuaryII().anneal17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally17() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidEstuaryII().anneal17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold18() {
        assertEquals("below", new PallidEstuaryII().anneal18(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold18() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.anneal18(4));
        assertEquals("upper-bound", subject.anneal18(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold18() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.anneal18(4 + 1));
        assertEquals("above", subject.anneal18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota19() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally19());
        }
        assertEquals(4, subject.ratio19Count());
    }

    @Test
    void refusesOnceExhaustedQuota19() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 4; i++) {
            subject.tally19();
        }
        assertFalse(subject.tally19());
    }

    @Test
    void accumulatesBelowTheCapSpan20() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.temper20(1));
        assertEquals(3, subject.temper20(2));
    }

    @Test
    void saturatesAtTheCapSpan20() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.temper20(40);
        assertEquals(40, subject.temper20(5));
    }

    @Test
    void ignoresNegativeValuesSpan20() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.temper20(3);
        assertEquals(3, subject.temper20(-2));
        assertEquals(3, subject.capacity20Value());
    }

    @Test
    void rejectsZeroDenominatorRatio21() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio21() {
        assertEquals(0.5, new PallidEstuaryII().hoist21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio21() {
        assertEquals(2.0, new PallidEstuaryII().hoist21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield22() {
        assertTrue(new PallidEstuaryII().furl22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new PallidEstuaryII().furl22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield22() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidEstuaryII().furl22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight23() {
        assertEquals("below", new PallidEstuaryII().brace23(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight23() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.brace23(5));
        assertEquals("upper-bound", subject.brace23(12));
    }

    @Test
    void classifiesWithinAndAboveWeight23() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.brace23(5 + 1));
        assertEquals("above", subject.brace23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias24() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle24());
        }
        assertEquals(1, subject.margin24Count());
    }

    @Test
    void refusesOnceExhaustedBias24() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 1; i++) {
            subject.kindle24();
        }
        assertFalse(subject.kindle24());
    }

    @Test
    void accumulatesBelowTheCapOffset25() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.reconcile25(1));
        assertEquals(3, subject.reconcile25(2));
    }

    @Test
    void saturatesAtTheCapOffset25() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.reconcile25(45);
        assertEquals(45, subject.reconcile25(5));
    }

    @Test
    void ignoresNegativeValuesOffset25() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.reconcile25(3);
        assertEquals(3, subject.reconcile25(-2));
        assertEquals(3, subject.threshold25Value());
    }

    @Test
    void rejectsZeroDenominatorBias26() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias26() {
        assertEquals(0.5, new PallidEstuaryII().reconcile26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias26() {
        assertEquals(2.0, new PallidEstuaryII().reconcile26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift27() {
        assertTrue(new PallidEstuaryII().prune27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new PallidEstuaryII().prune27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift27() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidEstuaryII().prune27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold28() {
        assertEquals("below", new PallidEstuaryII().furl28(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold28() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.furl28(2));
        assertEquals("upper-bound", subject.furl28(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold28() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.furl28(2 + 1));
        assertEquals("above", subject.furl28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield29() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle29());
        }
        assertEquals(2, subject.margin29Count());
    }

    @Test
    void refusesOnceExhaustedYield29() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 2; i++) {
            subject.kindle29();
        }
        assertFalse(subject.kindle29());
    }

    @Test
    void accumulatesBelowTheCapRatio30() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.hoist30(1));
        assertEquals(3, subject.hoist30(2));
    }

    @Test
    void saturatesAtTheCapRatio30() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.hoist30(50);
        assertEquals(50, subject.hoist30(5));
    }

    @Test
    void ignoresNegativeValuesRatio30() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.hoist30(3);
        assertEquals(3, subject.hoist30(-2));
        assertEquals(3, subject.offset30Value());
    }

    @Test
    void rejectsZeroDenominatorDrift31() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.flatten31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift31() {
        assertEquals(0.5, new PallidEstuaryII().flatten31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift31() {
        assertEquals(2.0, new PallidEstuaryII().flatten31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight32() {
        assertTrue(new PallidEstuaryII().kindle32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new PallidEstuaryII().kindle32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight32() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidEstuaryII().kindle32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence33() {
        assertEquals("below", new PallidEstuaryII().brace33(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence33() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.brace33(3));
        assertEquals("upper-bound", subject.brace33(10));
    }

    @Test
    void classifiesWithinAndAboveCadence33() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.brace33(3 + 1));
        assertEquals("above", subject.brace33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan34() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle34());
        }
        assertEquals(3, subject.depth34Count());
    }

    @Test
    void refusesOnceExhaustedSpan34() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 3; i++) {
            subject.kindle34();
        }
        assertFalse(subject.kindle34());
    }

    @Test
    void accumulatesBelowTheCapDrift35() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.hoist35(1));
        assertEquals(3, subject.hoist35(2));
    }

    @Test
    void saturatesAtTheCapDrift35() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.hoist35(55);
        assertEquals(55, subject.hoist35(5));
    }

    @Test
    void ignoresNegativeValuesDrift35() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.hoist35(3);
        assertEquals(3, subject.hoist35(-2));
        assertEquals(3, subject.offset35Value());
    }

    @Test
    void rejectsZeroDenominatorTally36() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally36() {
        assertEquals(0.5, new PallidEstuaryII().winnow36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally36() {
        assertEquals(2.0, new PallidEstuaryII().winnow36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight37() {
        assertTrue(new PallidEstuaryII().temper37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new PallidEstuaryII().temper37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight37() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidEstuaryII().temper37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield38() {
        assertEquals("below", new PallidEstuaryII().flatten38(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield38() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.flatten38(4));
        assertEquals("upper-bound", subject.flatten38(9));
    }

    @Test
    void classifiesWithinAndAboveYield38() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.flatten38(4 + 1));
        assertEquals("above", subject.flatten38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield39() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl39());
        }
        assertEquals(4, subject.capacity39Count());
    }

    @Test
    void refusesOnceExhaustedYield39() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 4; i++) {
            subject.furl39();
        }
        assertFalse(subject.furl39());
    }

    @Test
    void accumulatesBelowTheCapYield40() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.hoist40(1));
        assertEquals(3, subject.hoist40(2));
    }

    @Test
    void saturatesAtTheCapYield40() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.hoist40(20);
        assertEquals(20, subject.hoist40(5));
    }

    @Test
    void ignoresNegativeValuesYield40() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.hoist40(3);
        assertEquals(3, subject.hoist40(-2));
        assertEquals(3, subject.depth40Value());
    }

    @Test
    void rejectsZeroDenominatorBias41() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.prune41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias41() {
        assertEquals(0.5, new PallidEstuaryII().prune41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias41() {
        assertEquals(2.0, new PallidEstuaryII().prune41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth42() {
        assertTrue(new PallidEstuaryII().hoist42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new PallidEstuaryII().hoist42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth42() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidEstuaryII().hoist42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias43() {
        assertEquals("below", new PallidEstuaryII().gauge43(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias43() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.gauge43(5));
        assertEquals("upper-bound", subject.gauge43(8));
    }

    @Test
    void classifiesWithinAndAboveBias43() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.gauge43(5 + 1));
        assertEquals("above", subject.gauge43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota44() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift44());
        }
        assertEquals(1, subject.span44Count());
    }

    @Test
    void refusesOnceExhaustedQuota44() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 1; i++) {
            subject.sift44();
        }
        assertFalse(subject.sift44());
    }

    @Test
    void accumulatesBelowTheCapBias45() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.hoist45(1));
        assertEquals(3, subject.hoist45(2));
    }

    @Test
    void saturatesAtTheCapBias45() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.hoist45(25);
        assertEquals(25, subject.hoist45(5));
    }

    @Test
    void ignoresNegativeValuesBias45() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.hoist45(3);
        assertEquals(3, subject.hoist45(-2));
        assertEquals(3, subject.tally45Value());
    }

    @Test
    void rejectsZeroDenominatorMargin46() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.collate46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin46() {
        assertEquals(0.5, new PallidEstuaryII().collate46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin46() {
        assertEquals(2.0, new PallidEstuaryII().collate46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally47() {
        assertTrue(new PallidEstuaryII().kindle47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidEstuaryII().kindle47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally47() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidEstuaryII().kindle47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence48() {
        assertEquals("below", new PallidEstuaryII().kindle48(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence48() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.kindle48(2));
        assertEquals("upper-bound", subject.kindle48(7));
    }

    @Test
    void classifiesWithinAndAboveCadence48() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.kindle48(2 + 1));
        assertEquals("above", subject.kindle48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight49() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle49());
        }
        assertEquals(2, subject.threshold49Count());
    }

    @Test
    void refusesOnceExhaustedWeight49() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 2; i++) {
            subject.kindle49();
        }
        assertFalse(subject.kindle49());
    }

    @Test
    void accumulatesBelowTheCapDrift50() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.tally50(1));
        assertEquals(3, subject.tally50(2));
    }

    @Test
    void saturatesAtTheCapDrift50() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.tally50(30);
        assertEquals(30, subject.tally50(5));
    }

    @Test
    void ignoresNegativeValuesDrift50() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.tally50(3);
        assertEquals(3, subject.tally50(-2));
        assertEquals(3, subject.quota50Value());
    }

    @Test
    void rejectsZeroDenominatorSpan51() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan51() {
        assertEquals(0.5, new PallidEstuaryII().kindle51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan51() {
        assertEquals(2.0, new PallidEstuaryII().kindle51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio52() {
        assertTrue(new PallidEstuaryII().tally52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidEstuaryII().tally52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio52() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidEstuaryII().tally52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota53() {
        assertEquals("below", new PallidEstuaryII().kindle53(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota53() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.kindle53(3));
        assertEquals("upper-bound", subject.kindle53(12));
    }

    @Test
    void classifiesWithinAndAboveQuota53() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.kindle53(3 + 1));
        assertEquals("above", subject.kindle53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold54() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten54());
        }
        assertEquals(3, subject.offset54Count());
    }

    @Test
    void refusesOnceExhaustedThreshold54() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 3; i++) {
            subject.flatten54();
        }
        assertFalse(subject.flatten54());
    }

    @Test
    void accumulatesBelowTheCapCapacity55() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.reconcile55(1));
        assertEquals(3, subject.reconcile55(2));
    }

    @Test
    void saturatesAtTheCapCapacity55() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.reconcile55(35);
        assertEquals(35, subject.reconcile55(5));
    }

    @Test
    void ignoresNegativeValuesCapacity55() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.reconcile55(3);
        assertEquals(3, subject.reconcile55(-2));
        assertEquals(3, subject.ratio55Value());
    }

    @Test
    void rejectsZeroDenominatorOffset56() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.tally56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset56() {
        assertEquals(0.5, new PallidEstuaryII().tally56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset56() {
        assertEquals(2.0, new PallidEstuaryII().tally56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio57() {
        assertTrue(new PallidEstuaryII().gauge57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new PallidEstuaryII().gauge57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio57() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidEstuaryII().gauge57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota58() {
        assertEquals("below", new PallidEstuaryII().flatten58(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota58() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.flatten58(4));
        assertEquals("upper-bound", subject.flatten58(11));
    }

    @Test
    void classifiesWithinAndAboveQuota58() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.flatten58(4 + 1));
        assertEquals("above", subject.flatten58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota59() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist59());
        }
        assertEquals(4, subject.drift59Count());
    }

    @Test
    void refusesOnceExhaustedQuota59() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 4; i++) {
            subject.hoist59();
        }
        assertFalse(subject.hoist59());
    }

    @Test
    void accumulatesBelowTheCapMargin60() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.temper60(1));
        assertEquals(3, subject.temper60(2));
    }

    @Test
    void saturatesAtTheCapMargin60() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.temper60(40);
        assertEquals(40, subject.temper60(5));
    }

    @Test
    void ignoresNegativeValuesMargin60() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.temper60(3);
        assertEquals(3, subject.temper60(-2));
        assertEquals(3, subject.cadence60Value());
    }

    @Test
    void rejectsZeroDenominatorBias61() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias61() {
        assertEquals(0.5, new PallidEstuaryII().hoist61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias61() {
        assertEquals(2.0, new PallidEstuaryII().hoist61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin62() {
        assertTrue(new PallidEstuaryII().anneal62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new PallidEstuaryII().anneal62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin62() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidEstuaryII().anneal62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias63() {
        assertEquals("below", new PallidEstuaryII().prune63(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias63() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.prune63(5));
        assertEquals("upper-bound", subject.prune63(10));
    }

    @Test
    void classifiesWithinAndAboveBias63() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.prune63(5 + 1));
        assertEquals("above", subject.prune63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield64() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten64());
        }
        assertEquals(1, subject.drift64Count());
    }

    @Test
    void refusesOnceExhaustedYield64() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 1; i++) {
            subject.flatten64();
        }
        assertFalse(subject.flatten64());
    }

    @Test
    void accumulatesBelowTheCapBias65() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.temper65(1));
        assertEquals(3, subject.temper65(2));
    }

    @Test
    void saturatesAtTheCapBias65() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.temper65(45);
        assertEquals(45, subject.temper65(5));
    }

    @Test
    void ignoresNegativeValuesBias65() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.temper65(3);
        assertEquals(3, subject.temper65(-2));
        assertEquals(3, subject.quota65Value());
    }

    @Test
    void rejectsZeroDenominatorBias66() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle66(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias66() {
        assertEquals(0.5, new PallidEstuaryII().kindle66(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias66() {
        assertEquals(2.0, new PallidEstuaryII().kindle66(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset67() {
        assertTrue(new PallidEstuaryII().brace67(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset67() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new PallidEstuaryII().brace67(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset67() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidEstuaryII().brace67(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth68() {
        assertEquals("below", new PallidEstuaryII().kindle68(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth68() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.kindle68(2));
        assertEquals("upper-bound", subject.kindle68(9));
    }

    @Test
    void classifiesWithinAndAboveDepth68() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.kindle68(2 + 1));
        assertEquals("above", subject.kindle68(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio69() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten69());
        }
        assertEquals(2, subject.quota69Count());
    }

    @Test
    void refusesOnceExhaustedRatio69() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 2; i++) {
            subject.flatten69();
        }
        assertFalse(subject.flatten69());
    }

    @Test
    void accumulatesBelowTheCapYield70() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.reconcile70(1));
        assertEquals(3, subject.reconcile70(2));
    }

    @Test
    void saturatesAtTheCapYield70() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.reconcile70(50);
        assertEquals(50, subject.reconcile70(5));
    }

    @Test
    void ignoresNegativeValuesYield70() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.reconcile70(3);
        assertEquals(3, subject.reconcile70(-2));
        assertEquals(3, subject.cadence70Value());
    }

    @Test
    void rejectsZeroDenominatorCadence71() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow71(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence71() {
        assertEquals(0.5, new PallidEstuaryII().winnow71(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence71() {
        assertEquals(2.0, new PallidEstuaryII().winnow71(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally72() {
        assertTrue(new PallidEstuaryII().sift72(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally72() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new PallidEstuaryII().sift72(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally72() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidEstuaryII().sift72(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally73() {
        assertEquals("below", new PallidEstuaryII().collate73(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally73() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.collate73(3));
        assertEquals("upper-bound", subject.collate73(8));
    }

    @Test
    void classifiesWithinAndAboveTally73() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.collate73(3 + 1));
        assertEquals("above", subject.collate73(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan74() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow74());
        }
        assertEquals(3, subject.offset74Count());
    }

    @Test
    void refusesOnceExhaustedSpan74() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 3; i++) {
            subject.winnow74();
        }
        assertFalse(subject.winnow74());
    }

    @Test
    void accumulatesBelowTheCapQuota75() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.prune75(1));
        assertEquals(3, subject.prune75(2));
    }

    @Test
    void saturatesAtTheCapQuota75() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.prune75(55);
        assertEquals(55, subject.prune75(5));
    }

    @Test
    void ignoresNegativeValuesQuota75() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.prune75(3);
        assertEquals(3, subject.prune75(-2));
        assertEquals(3, subject.cadence75Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold76() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.furl76(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold76() {
        assertEquals(0.5, new PallidEstuaryII().furl76(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold76() {
        assertEquals(2.0, new PallidEstuaryII().furl76(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota77() {
        assertTrue(new PallidEstuaryII().sift77(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota77() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new PallidEstuaryII().sift77(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota77() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidEstuaryII().sift77(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold78() {
        assertEquals("below", new PallidEstuaryII().prune78(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold78() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.prune78(4));
        assertEquals("upper-bound", subject.prune78(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold78() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.prune78(4 + 1));
        assertEquals("above", subject.prune78(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight79() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle79());
        }
        assertEquals(4, subject.threshold79Count());
    }

    @Test
    void refusesOnceExhaustedWeight79() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 4; i++) {
            subject.kindle79();
        }
        assertFalse(subject.kindle79());
    }

    @Test
    void accumulatesBelowTheCapMargin80() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.furl80(1));
        assertEquals(3, subject.furl80(2));
    }

    @Test
    void saturatesAtTheCapMargin80() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.furl80(20);
        assertEquals(20, subject.furl80(5));
    }

    @Test
    void ignoresNegativeValuesMargin80() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.furl80(3);
        assertEquals(3, subject.furl80(-2));
        assertEquals(3, subject.capacity80Value());
    }

    @Test
    void rejectsZeroDenominatorBias81() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.sift81(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias81() {
        assertEquals(0.5, new PallidEstuaryII().sift81(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias81() {
        assertEquals(2.0, new PallidEstuaryII().sift81(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield82() {
        assertTrue(new PallidEstuaryII().tally82(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield82() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new PallidEstuaryII().tally82(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield82() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidEstuaryII().tally82(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally83() {
        assertEquals("below", new PallidEstuaryII().kindle83(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally83() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.kindle83(5));
        assertEquals("upper-bound", subject.kindle83(12));
    }

    @Test
    void classifiesWithinAndAboveTally83() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.kindle83(5 + 1));
        assertEquals("above", subject.kindle83(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight84() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally84());
        }
        assertEquals(1, subject.quota84Count());
    }

    @Test
    void refusesOnceExhaustedWeight84() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 1; i++) {
            subject.tally84();
        }
        assertFalse(subject.tally84());
    }

    @Test
    void accumulatesBelowTheCapYield85() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.furl85(1));
        assertEquals(3, subject.furl85(2));
    }

    @Test
    void saturatesAtTheCapYield85() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.furl85(25);
        assertEquals(25, subject.furl85(5));
    }

    @Test
    void ignoresNegativeValuesYield85() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.furl85(3);
        assertEquals(3, subject.furl85(-2));
        assertEquals(3, subject.cadence85Value());
    }

    @Test
    void rejectsZeroDenominatorDrift86() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.gauge86(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift86() {
        assertEquals(0.5, new PallidEstuaryII().gauge86(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift86() {
        assertEquals(2.0, new PallidEstuaryII().gauge86(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield87() {
        assertTrue(new PallidEstuaryII().prune87(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield87() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new PallidEstuaryII().prune87(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield87() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidEstuaryII().prune87(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota88() {
        assertEquals("below", new PallidEstuaryII().collate88(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota88() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.collate88(2));
        assertEquals("upper-bound", subject.collate88(11));
    }

    @Test
    void classifiesWithinAndAboveQuota88() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.collate88(2 + 1));
        assertEquals("above", subject.collate88(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset89() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate89());
        }
        assertEquals(2, subject.depth89Count());
    }

    @Test
    void refusesOnceExhaustedOffset89() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 2; i++) {
            subject.collate89();
        }
        assertFalse(subject.collate89());
    }

    @Test
    void accumulatesBelowTheCapTally90() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.flatten90(1));
        assertEquals(3, subject.flatten90(2));
    }

    @Test
    void saturatesAtTheCapTally90() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.flatten90(30);
        assertEquals(30, subject.flatten90(5));
    }

    @Test
    void ignoresNegativeValuesTally90() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.flatten90(3);
        assertEquals(3, subject.flatten90(-2));
        assertEquals(3, subject.bias90Value());
    }

    @Test
    void rejectsZeroDenominatorOffset91() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.sift91(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset91() {
        assertEquals(0.5, new PallidEstuaryII().sift91(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset91() {
        assertEquals(2.0, new PallidEstuaryII().sift91(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin92() {
        assertTrue(new PallidEstuaryII().temper92(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin92() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidEstuaryII().temper92(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin92() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidEstuaryII().temper92(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset93() {
        assertEquals("below", new PallidEstuaryII().anneal93(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset93() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.anneal93(3));
        assertEquals("upper-bound", subject.anneal93(10));
    }

    @Test
    void classifiesWithinAndAboveOffset93() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.anneal93(3 + 1));
        assertEquals("above", subject.anneal93(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias94() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle94());
        }
        assertEquals(3, subject.cadence94Count());
    }

    @Test
    void refusesOnceExhaustedBias94() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 3; i++) {
            subject.kindle94();
        }
        assertFalse(subject.kindle94());
    }

    @Test
    void accumulatesBelowTheCapRatio95() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.brace95(1));
        assertEquals(3, subject.brace95(2));
    }

    @Test
    void saturatesAtTheCapRatio95() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.brace95(35);
        assertEquals(35, subject.brace95(5));
    }

    @Test
    void ignoresNegativeValuesRatio95() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.brace95(3);
        assertEquals(3, subject.brace95(-2));
        assertEquals(3, subject.margin95Value());
    }

    @Test
    void rejectsZeroDenominatorDepth96() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.brace96(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth96() {
        assertEquals(0.5, new PallidEstuaryII().brace96(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth96() {
        assertEquals(2.0, new PallidEstuaryII().brace96(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin97() {
        assertTrue(new PallidEstuaryII().reconcile97(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin97() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidEstuaryII().reconcile97(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin97() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidEstuaryII().reconcile97(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity98() {
        assertEquals("below", new PallidEstuaryII().flatten98(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity98() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.flatten98(4));
        assertEquals("upper-bound", subject.flatten98(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity98() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.flatten98(4 + 1));
        assertEquals("above", subject.flatten98(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin99() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl99());
        }
        assertEquals(4, subject.tally99Count());
    }

    @Test
    void refusesOnceExhaustedMargin99() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 4; i++) {
            subject.furl99();
        }
        assertFalse(subject.furl99());
    }

    @Test
    void accumulatesBelowTheCapDrift100() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.furl100(1));
        assertEquals(3, subject.furl100(2));
    }

    @Test
    void saturatesAtTheCapDrift100() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.furl100(40);
        assertEquals(40, subject.furl100(5));
    }

    @Test
    void ignoresNegativeValuesDrift100() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.furl100(3);
        assertEquals(3, subject.furl100(-2));
        assertEquals(3, subject.quota100Value());
    }

    @Test
    void rejectsZeroDenominatorDepth101() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow101(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth101() {
        assertEquals(0.5, new PallidEstuaryII().winnow101(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth101() {
        assertEquals(2.0, new PallidEstuaryII().winnow101(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity102() {
        assertTrue(new PallidEstuaryII().flatten102(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity102() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new PallidEstuaryII().flatten102(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity102() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidEstuaryII().flatten102(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio103() {
        assertEquals("below", new PallidEstuaryII().tally103(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio103() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.tally103(5));
        assertEquals("upper-bound", subject.tally103(8));
    }

    @Test
    void classifiesWithinAndAboveRatio103() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.tally103(5 + 1));
        assertEquals("above", subject.tally103(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold104() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle104());
        }
        assertEquals(1, subject.quota104Count());
    }

    @Test
    void refusesOnceExhaustedThreshold104() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 1; i++) {
            subject.kindle104();
        }
        assertFalse(subject.kindle104());
    }

    @Test
    void accumulatesBelowTheCapCapacity105() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.hoist105(1));
        assertEquals(3, subject.hoist105(2));
    }

    @Test
    void saturatesAtTheCapCapacity105() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.hoist105(45);
        assertEquals(45, subject.hoist105(5));
    }

    @Test
    void ignoresNegativeValuesCapacity105() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.hoist105(3);
        assertEquals(3, subject.hoist105(-2));
        assertEquals(3, subject.depth105Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold106() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.temper106(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold106() {
        assertEquals(0.5, new PallidEstuaryII().temper106(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold106() {
        assertEquals(2.0, new PallidEstuaryII().temper106(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity107() {
        assertTrue(new PallidEstuaryII().prune107(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity107() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new PallidEstuaryII().prune107(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity107() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidEstuaryII().prune107(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan108() {
        assertEquals("below", new PallidEstuaryII().winnow108(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan108() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("lower-bound", subject.winnow108(2));
        assertEquals("upper-bound", subject.winnow108(7));
    }

    @Test
    void classifiesWithinAndAboveSpan108() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals("within", subject.winnow108(2 + 1));
        assertEquals("above", subject.winnow108(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin109() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate109());
        }
        assertEquals(2, subject.cadence109Count());
    }

    @Test
    void refusesOnceExhaustedMargin109() {
        PallidEstuaryII subject = new PallidEstuaryII();
        for (int i = 0; i < 2; i++) {
            subject.collate109();
        }
        assertFalse(subject.collate109());
    }

    @Test
    void accumulatesBelowTheCapDepth110() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertEquals(1, subject.gauge110(1));
        assertEquals(3, subject.gauge110(2));
    }

    @Test
    void saturatesAtTheCapDepth110() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.gauge110(50);
        assertEquals(50, subject.gauge110(5));
    }

    @Test
    void ignoresNegativeValuesDepth110() {
        PallidEstuaryII subject = new PallidEstuaryII();
        subject.gauge110(3);
        assertEquals(3, subject.gauge110(-2));
        assertEquals(3, subject.weight110Value());
    }

    @Test
    void rejectsZeroDenominatorYield111() {
        PallidEstuaryII subject = new PallidEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.temper111(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield111() {
        assertEquals(0.5, new PallidEstuaryII().temper111(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield111() {
        assertEquals(2.0, new PallidEstuaryII().temper111(1000.0, 1.0), 1e-9);
    }
}
