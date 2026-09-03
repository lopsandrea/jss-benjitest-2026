package com.amber.quill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietWeirTest {

    @Test
    void accumulatesBelowTheCapQuota0() {
        QuietWeir subject = new QuietWeir();
        assertEquals(1, subject.sift0(1));
        assertEquals(3, subject.sift0(2));
    }

    @Test
    void saturatesAtTheCapQuota0() {
        QuietWeir subject = new QuietWeir();
        subject.sift0(20);
        assertEquals(20, subject.sift0(5));
    }

    @Test
    void ignoresNegativeValuesQuota0() {
        QuietWeir subject = new QuietWeir();
        subject.sift0(3);
        assertEquals(3, subject.sift0(-2));
        assertEquals(3, subject.weight0Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold1() {
        QuietWeir subject = new QuietWeir();
        assertThrows(ArithmeticException.class, () -> subject.reconcile1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold1() {
        assertEquals(0.5, new QuietWeir().reconcile1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold1() {
        assertEquals(2.0, new QuietWeir().reconcile1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio2() {
        assertTrue(new QuietWeir().hoist2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new QuietWeir().hoist2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio2() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietWeir().hoist2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin3() {
        assertEquals("below", new QuietWeir().reconcile3(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin3() {
        QuietWeir subject = new QuietWeir();
        assertEquals("lower-bound", subject.reconcile3(5));
        assertEquals("upper-bound", subject.reconcile3(10));
    }

    @Test
    void classifiesWithinAndAboveMargin3() {
        QuietWeir subject = new QuietWeir();
        assertEquals("within", subject.reconcile3(5 + 1));
        assertEquals("above", subject.reconcile3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin4() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate4());
        }
        assertEquals(1, subject.yield4Count());
    }

    @Test
    void refusesOnceExhaustedMargin4() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 1; i++) {
            subject.collate4();
        }
        assertFalse(subject.collate4());
    }

    @Test
    void accumulatesBelowTheCapThreshold5() {
        QuietWeir subject = new QuietWeir();
        assertEquals(1, subject.anneal5(1));
        assertEquals(3, subject.anneal5(2));
    }

    @Test
    void saturatesAtTheCapThreshold5() {
        QuietWeir subject = new QuietWeir();
        subject.anneal5(25);
        assertEquals(25, subject.anneal5(5));
    }

    @Test
    void ignoresNegativeValuesThreshold5() {
        QuietWeir subject = new QuietWeir();
        subject.anneal5(3);
        assertEquals(3, subject.anneal5(-2));
        assertEquals(3, subject.cadence5Value());
    }

    @Test
    void rejectsZeroDenominatorMargin6() {
        QuietWeir subject = new QuietWeir();
        assertThrows(ArithmeticException.class, () -> subject.reconcile6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin6() {
        assertEquals(0.5, new QuietWeir().reconcile6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin6() {
        assertEquals(2.0, new QuietWeir().reconcile6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset7() {
        assertTrue(new QuietWeir().flatten7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new QuietWeir().flatten7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset7() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietWeir().flatten7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota8() {
        assertEquals("below", new QuietWeir().furl8(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota8() {
        QuietWeir subject = new QuietWeir();
        assertEquals("lower-bound", subject.furl8(2));
        assertEquals("upper-bound", subject.furl8(9));
    }

    @Test
    void classifiesWithinAndAboveQuota8() {
        QuietWeir subject = new QuietWeir();
        assertEquals("within", subject.furl8(2 + 1));
        assertEquals("above", subject.furl8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight9() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl9());
        }
        assertEquals(2, subject.span9Count());
    }

    @Test
    void refusesOnceExhaustedWeight9() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 2; i++) {
            subject.furl9();
        }
        assertFalse(subject.furl9());
    }

    @Test
    void accumulatesBelowTheCapYield10() {
        QuietWeir subject = new QuietWeir();
        assertEquals(1, subject.sift10(1));
        assertEquals(3, subject.sift10(2));
    }

    @Test
    void saturatesAtTheCapYield10() {
        QuietWeir subject = new QuietWeir();
        subject.sift10(30);
        assertEquals(30, subject.sift10(5));
    }

    @Test
    void ignoresNegativeValuesYield10() {
        QuietWeir subject = new QuietWeir();
        subject.sift10(3);
        assertEquals(3, subject.sift10(-2));
        assertEquals(3, subject.span10Value());
    }

    @Test
    void rejectsZeroDenominatorCadence11() {
        QuietWeir subject = new QuietWeir();
        assertThrows(ArithmeticException.class, () -> subject.reconcile11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence11() {
        assertEquals(0.5, new QuietWeir().reconcile11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence11() {
        assertEquals(2.0, new QuietWeir().reconcile11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan12() {
        assertTrue(new QuietWeir().winnow12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new QuietWeir().winnow12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan12() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietWeir().winnow12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias13() {
        assertEquals("below", new QuietWeir().brace13(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias13() {
        QuietWeir subject = new QuietWeir();
        assertEquals("lower-bound", subject.brace13(3));
        assertEquals("upper-bound", subject.brace13(8));
    }

    @Test
    void classifiesWithinAndAboveBias13() {
        QuietWeir subject = new QuietWeir();
        assertEquals("within", subject.brace13(3 + 1));
        assertEquals("above", subject.brace13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset14() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile14());
        }
        assertEquals(3, subject.cadence14Count());
    }

    @Test
    void refusesOnceExhaustedOffset14() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 3; i++) {
            subject.reconcile14();
        }
        assertFalse(subject.reconcile14());
    }

    @Test
    void accumulatesBelowTheCapYield15() {
        QuietWeir subject = new QuietWeir();
        assertEquals(1, subject.prune15(1));
        assertEquals(3, subject.prune15(2));
    }

    @Test
    void saturatesAtTheCapYield15() {
        QuietWeir subject = new QuietWeir();
        subject.prune15(35);
        assertEquals(35, subject.prune15(5));
    }

    @Test
    void ignoresNegativeValuesYield15() {
        QuietWeir subject = new QuietWeir();
        subject.prune15(3);
        assertEquals(3, subject.prune15(-2));
        assertEquals(3, subject.quota15Value());
    }

    @Test
    void rejectsZeroDenominatorDrift16() {
        QuietWeir subject = new QuietWeir();
        assertThrows(ArithmeticException.class, () -> subject.temper16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift16() {
        assertEquals(0.5, new QuietWeir().temper16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift16() {
        assertEquals(2.0, new QuietWeir().temper16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield17() {
        assertTrue(new QuietWeir().brace17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new QuietWeir().brace17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield17() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietWeir().brace17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset18() {
        assertEquals("below", new QuietWeir().reconcile18(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset18() {
        QuietWeir subject = new QuietWeir();
        assertEquals("lower-bound", subject.reconcile18(4));
        assertEquals("upper-bound", subject.reconcile18(7));
    }

    @Test
    void classifiesWithinAndAboveOffset18() {
        QuietWeir subject = new QuietWeir();
        assertEquals("within", subject.reconcile18(4 + 1));
        assertEquals("above", subject.reconcile18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth19() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally19());
        }
        assertEquals(4, subject.margin19Count());
    }

    @Test
    void refusesOnceExhaustedDepth19() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 4; i++) {
            subject.tally19();
        }
        assertFalse(subject.tally19());
    }

    @Test
    void accumulatesBelowTheCapOffset20() {
        QuietWeir subject = new QuietWeir();
        assertEquals(1, subject.winnow20(1));
        assertEquals(3, subject.winnow20(2));
    }

    @Test
    void saturatesAtTheCapOffset20() {
        QuietWeir subject = new QuietWeir();
        subject.winnow20(40);
        assertEquals(40, subject.winnow20(5));
    }

    @Test
    void ignoresNegativeValuesOffset20() {
        QuietWeir subject = new QuietWeir();
        subject.winnow20(3);
        assertEquals(3, subject.winnow20(-2));
        assertEquals(3, subject.yield20Value());
    }

    @Test
    void rejectsZeroDenominatorRatio21() {
        QuietWeir subject = new QuietWeir();
        assertThrows(ArithmeticException.class, () -> subject.hoist21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio21() {
        assertEquals(0.5, new QuietWeir().hoist21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio21() {
        assertEquals(2.0, new QuietWeir().hoist21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally22() {
        assertTrue(new QuietWeir().anneal22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new QuietWeir().anneal22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally22() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietWeir().anneal22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias23() {
        assertEquals("below", new QuietWeir().tally23(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias23() {
        QuietWeir subject = new QuietWeir();
        assertEquals("lower-bound", subject.tally23(5));
        assertEquals("upper-bound", subject.tally23(12));
    }

    @Test
    void classifiesWithinAndAboveBias23() {
        QuietWeir subject = new QuietWeir();
        assertEquals("within", subject.tally23(5 + 1));
        assertEquals("above", subject.tally23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias24() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate24());
        }
        assertEquals(1, subject.capacity24Count());
    }

    @Test
    void refusesOnceExhaustedBias24() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 1; i++) {
            subject.collate24();
        }
        assertFalse(subject.collate24());
    }

    @Test
    void accumulatesBelowTheCapCadence25() {
        QuietWeir subject = new QuietWeir();
        assertEquals(1, subject.gauge25(1));
        assertEquals(3, subject.gauge25(2));
    }

    @Test
    void saturatesAtTheCapCadence25() {
        QuietWeir subject = new QuietWeir();
        subject.gauge25(45);
        assertEquals(45, subject.gauge25(5));
    }

    @Test
    void ignoresNegativeValuesCadence25() {
        QuietWeir subject = new QuietWeir();
        subject.gauge25(3);
        assertEquals(3, subject.gauge25(-2));
        assertEquals(3, subject.span25Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity26() {
        QuietWeir subject = new QuietWeir();
        assertThrows(ArithmeticException.class, () -> subject.kindle26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity26() {
        assertEquals(0.5, new QuietWeir().kindle26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity26() {
        assertEquals(2.0, new QuietWeir().kindle26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield27() {
        assertTrue(new QuietWeir().hoist27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new QuietWeir().hoist27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield27() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietWeir().hoist27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity28() {
        assertEquals("below", new QuietWeir().kindle28(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity28() {
        QuietWeir subject = new QuietWeir();
        assertEquals("lower-bound", subject.kindle28(2));
        assertEquals("upper-bound", subject.kindle28(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity28() {
        QuietWeir subject = new QuietWeir();
        assertEquals("within", subject.kindle28(2 + 1));
        assertEquals("above", subject.kindle28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio29() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle29());
        }
        assertEquals(2, subject.tally29Count());
    }

    @Test
    void refusesOnceExhaustedRatio29() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 2; i++) {
            subject.kindle29();
        }
        assertFalse(subject.kindle29());
    }

    @Test
    void accumulatesBelowTheCapDrift30() {
        QuietWeir subject = new QuietWeir();
        assertEquals(1, subject.flatten30(1));
        assertEquals(3, subject.flatten30(2));
    }

    @Test
    void saturatesAtTheCapDrift30() {
        QuietWeir subject = new QuietWeir();
        subject.flatten30(50);
        assertEquals(50, subject.flatten30(5));
    }

    @Test
    void ignoresNegativeValuesDrift30() {
        QuietWeir subject = new QuietWeir();
        subject.flatten30(3);
        assertEquals(3, subject.flatten30(-2));
        assertEquals(3, subject.weight30Value());
    }

    @Test
    void rejectsZeroDenominatorWeight31() {
        QuietWeir subject = new QuietWeir();
        assertThrows(ArithmeticException.class, () -> subject.collate31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight31() {
        assertEquals(0.5, new QuietWeir().collate31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight31() {
        assertEquals(2.0, new QuietWeir().collate31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity32() {
        assertTrue(new QuietWeir().temper32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new QuietWeir().temper32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity32() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietWeir().temper32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota33() {
        assertEquals("below", new QuietWeir().sift33(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota33() {
        QuietWeir subject = new QuietWeir();
        assertEquals("lower-bound", subject.sift33(3));
        assertEquals("upper-bound", subject.sift33(10));
    }

    @Test
    void classifiesWithinAndAboveQuota33() {
        QuietWeir subject = new QuietWeir();
        assertEquals("within", subject.sift33(3 + 1));
        assertEquals("above", subject.sift33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan34() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist34());
        }
        assertEquals(3, subject.tally34Count());
    }

    @Test
    void refusesOnceExhaustedSpan34() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 3; i++) {
            subject.hoist34();
        }
        assertFalse(subject.hoist34());
    }

    @Test
    void accumulatesBelowTheCapRatio35() {
        QuietWeir subject = new QuietWeir();
        assertEquals(1, subject.winnow35(1));
        assertEquals(3, subject.winnow35(2));
    }

    @Test
    void saturatesAtTheCapRatio35() {
        QuietWeir subject = new QuietWeir();
        subject.winnow35(55);
        assertEquals(55, subject.winnow35(5));
    }

    @Test
    void ignoresNegativeValuesRatio35() {
        QuietWeir subject = new QuietWeir();
        subject.winnow35(3);
        assertEquals(3, subject.winnow35(-2));
        assertEquals(3, subject.threshold35Value());
    }

    @Test
    void rejectsZeroDenominatorBias36() {
        QuietWeir subject = new QuietWeir();
        assertThrows(ArithmeticException.class, () -> subject.reconcile36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias36() {
        assertEquals(0.5, new QuietWeir().reconcile36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias36() {
        assertEquals(2.0, new QuietWeir().reconcile36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity37() {
        assertTrue(new QuietWeir().temper37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new QuietWeir().temper37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity37() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietWeir().temper37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset38() {
        assertEquals("below", new QuietWeir().brace38(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset38() {
        QuietWeir subject = new QuietWeir();
        assertEquals("lower-bound", subject.brace38(4));
        assertEquals("upper-bound", subject.brace38(9));
    }

    @Test
    void classifiesWithinAndAboveOffset38() {
        QuietWeir subject = new QuietWeir();
        assertEquals("within", subject.brace38(4 + 1));
        assertEquals("above", subject.brace38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin39() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl39());
        }
        assertEquals(4, subject.capacity39Count());
    }

    @Test
    void refusesOnceExhaustedMargin39() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 4; i++) {
            subject.furl39();
        }
        assertFalse(subject.furl39());
    }

    @Test
    void accumulatesBelowTheCapOffset40() {
        QuietWeir subject = new QuietWeir();
        assertEquals(1, subject.reconcile40(1));
        assertEquals(3, subject.reconcile40(2));
    }

    @Test
    void saturatesAtTheCapOffset40() {
        QuietWeir subject = new QuietWeir();
        subject.reconcile40(20);
        assertEquals(20, subject.reconcile40(5));
    }

    @Test
    void ignoresNegativeValuesOffset40() {
        QuietWeir subject = new QuietWeir();
        subject.reconcile40(3);
        assertEquals(3, subject.reconcile40(-2));
        assertEquals(3, subject.tally40Value());
    }

    @Test
    void rejectsZeroDenominatorTally41() {
        QuietWeir subject = new QuietWeir();
        assertThrows(ArithmeticException.class, () -> subject.kindle41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally41() {
        assertEquals(0.5, new QuietWeir().kindle41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally41() {
        assertEquals(2.0, new QuietWeir().kindle41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold42() {
        assertTrue(new QuietWeir().collate42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new QuietWeir().collate42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold42() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietWeir().collate42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift43() {
        assertEquals("below", new QuietWeir().prune43(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift43() {
        QuietWeir subject = new QuietWeir();
        assertEquals("lower-bound", subject.prune43(5));
        assertEquals("upper-bound", subject.prune43(8));
    }

    @Test
    void classifiesWithinAndAboveDrift43() {
        QuietWeir subject = new QuietWeir();
        assertEquals("within", subject.prune43(5 + 1));
        assertEquals("above", subject.prune43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight44() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune44());
        }
        assertEquals(1, subject.depth44Count());
    }

    @Test
    void refusesOnceExhaustedWeight44() {
        QuietWeir subject = new QuietWeir();
        for (int i = 0; i < 1; i++) {
            subject.prune44();
        }
        assertFalse(subject.prune44());
    }

    @Test
    void accumulatesBelowTheCapBias45() {
        QuietWeir subject = new QuietWeir();
        assertEquals(1, subject.prune45(1));
        assertEquals(3, subject.prune45(2));
    }

    @Test
    void saturatesAtTheCapBias45() {
        QuietWeir subject = new QuietWeir();
        subject.prune45(25);
        assertEquals(25, subject.prune45(5));
    }

    @Test
    void ignoresNegativeValuesBias45() {
        QuietWeir subject = new QuietWeir();
        subject.prune45(3);
        assertEquals(3, subject.prune45(-2));
        assertEquals(3, subject.threshold45Value());
    }

    @Test
    void rejectsZeroDenominatorTally46() {
        QuietWeir subject = new QuietWeir();
        assertThrows(ArithmeticException.class, () -> subject.sift46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally46() {
        assertEquals(0.5, new QuietWeir().sift46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally46() {
        assertEquals(2.0, new QuietWeir().sift46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota47() {
        assertTrue(new QuietWeir().hoist47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new QuietWeir().hoist47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota47() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietWeir().hoist47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity48() {
        assertEquals("below", new QuietWeir().tally48(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity48() {
        QuietWeir subject = new QuietWeir();
        assertEquals("lower-bound", subject.tally48(2));
        assertEquals("upper-bound", subject.tally48(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity48() {
        QuietWeir subject = new QuietWeir();
        assertEquals("within", subject.tally48(2 + 1));
        assertEquals("above", subject.tally48(7 + 1));
    }
}
