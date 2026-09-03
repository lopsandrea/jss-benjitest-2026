package com.slate.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietCairnTest {

    @Test
    void accumulatesBelowTheCapMargin0() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.anneal0(1));
        assertEquals(3, subject.anneal0(2));
    }

    @Test
    void saturatesAtTheCapMargin0() {
        QuietCairn subject = new QuietCairn();
        subject.anneal0(20);
        assertEquals(20, subject.anneal0(5));
    }

    @Test
    void ignoresNegativeValuesMargin0() {
        QuietCairn subject = new QuietCairn();
        subject.anneal0(3);
        assertEquals(3, subject.anneal0(-2));
        assertEquals(3, subject.threshold0Value());
    }

    @Test
    void rejectsZeroDenominatorDepth1() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.kindle1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth1() {
        assertEquals(0.5, new QuietCairn().kindle1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth1() {
        assertEquals(2.0, new QuietCairn().kindle1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity2() {
        assertTrue(new QuietCairn().prune2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new QuietCairn().prune2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity2() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietCairn().prune2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth3() {
        assertEquals("below", new QuietCairn().furl3(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth3() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.furl3(5));
        assertEquals("upper-bound", subject.furl3(10));
    }

    @Test
    void classifiesWithinAndAboveDepth3() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.furl3(5 + 1));
        assertEquals("above", subject.furl3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold4() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten4());
        }
        assertEquals(1, subject.margin4Count());
    }

    @Test
    void refusesOnceExhaustedThreshold4() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 1; i++) {
            subject.flatten4();
        }
        assertFalse(subject.flatten4());
    }

    @Test
    void accumulatesBelowTheCapOffset5() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.tally5(1));
        assertEquals(3, subject.tally5(2));
    }

    @Test
    void saturatesAtTheCapOffset5() {
        QuietCairn subject = new QuietCairn();
        subject.tally5(25);
        assertEquals(25, subject.tally5(5));
    }

    @Test
    void ignoresNegativeValuesOffset5() {
        QuietCairn subject = new QuietCairn();
        subject.tally5(3);
        assertEquals(3, subject.tally5(-2));
        assertEquals(3, subject.quota5Value());
    }

    @Test
    void rejectsZeroDenominatorDepth6() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.furl6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth6() {
        assertEquals(0.5, new QuietCairn().furl6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth6() {
        assertEquals(2.0, new QuietCairn().furl6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold7() {
        assertTrue(new QuietCairn().reconcile7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new QuietCairn().reconcile7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold7() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietCairn().reconcile7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin8() {
        assertEquals("below", new QuietCairn().anneal8(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin8() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.anneal8(2));
        assertEquals("upper-bound", subject.anneal8(9));
    }

    @Test
    void classifiesWithinAndAboveMargin8() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.anneal8(2 + 1));
        assertEquals("above", subject.anneal8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota9() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace9());
        }
        assertEquals(2, subject.weight9Count());
    }

    @Test
    void refusesOnceExhaustedQuota9() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 2; i++) {
            subject.brace9();
        }
        assertFalse(subject.brace9());
    }

    @Test
    void accumulatesBelowTheCapOffset10() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.kindle10(1));
        assertEquals(3, subject.kindle10(2));
    }

    @Test
    void saturatesAtTheCapOffset10() {
        QuietCairn subject = new QuietCairn();
        subject.kindle10(30);
        assertEquals(30, subject.kindle10(5));
    }

    @Test
    void ignoresNegativeValuesOffset10() {
        QuietCairn subject = new QuietCairn();
        subject.kindle10(3);
        assertEquals(3, subject.kindle10(-2));
        assertEquals(3, subject.yield10Value());
    }

    @Test
    void rejectsZeroDenominatorWeight11() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.kindle11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight11() {
        assertEquals(0.5, new QuietCairn().kindle11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight11() {
        assertEquals(2.0, new QuietCairn().kindle11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias12() {
        assertTrue(new QuietCairn().tally12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new QuietCairn().tally12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias12() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietCairn().tally12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio13() {
        assertEquals("below", new QuietCairn().reconcile13(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio13() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.reconcile13(3));
        assertEquals("upper-bound", subject.reconcile13(8));
    }

    @Test
    void classifiesWithinAndAboveRatio13() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.reconcile13(3 + 1));
        assertEquals("above", subject.reconcile13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold14() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge14());
        }
        assertEquals(3, subject.quota14Count());
    }

    @Test
    void refusesOnceExhaustedThreshold14() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 3; i++) {
            subject.gauge14();
        }
        assertFalse(subject.gauge14());
    }

    @Test
    void accumulatesBelowTheCapQuota15() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.reconcile15(1));
        assertEquals(3, subject.reconcile15(2));
    }

    @Test
    void saturatesAtTheCapQuota15() {
        QuietCairn subject = new QuietCairn();
        subject.reconcile15(35);
        assertEquals(35, subject.reconcile15(5));
    }

    @Test
    void ignoresNegativeValuesQuota15() {
        QuietCairn subject = new QuietCairn();
        subject.reconcile15(3);
        assertEquals(3, subject.reconcile15(-2));
        assertEquals(3, subject.ratio15Value());
    }

    @Test
    void rejectsZeroDenominatorWeight16() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight16() {
        assertEquals(0.5, new QuietCairn().tally16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight16() {
        assertEquals(2.0, new QuietCairn().tally16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift17() {
        assertTrue(new QuietCairn().winnow17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new QuietCairn().winnow17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift17() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietCairn().winnow17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias18() {
        assertEquals("below", new QuietCairn().furl18(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias18() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.furl18(4));
        assertEquals("upper-bound", subject.furl18(7));
    }

    @Test
    void classifiesWithinAndAboveBias18() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.furl18(4 + 1));
        assertEquals("above", subject.furl18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset19() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow19());
        }
        assertEquals(4, subject.threshold19Count());
    }

    @Test
    void refusesOnceExhaustedOffset19() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 4; i++) {
            subject.winnow19();
        }
        assertFalse(subject.winnow19());
    }

    @Test
    void accumulatesBelowTheCapYield20() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.kindle20(1));
        assertEquals(3, subject.kindle20(2));
    }

    @Test
    void saturatesAtTheCapYield20() {
        QuietCairn subject = new QuietCairn();
        subject.kindle20(40);
        assertEquals(40, subject.kindle20(5));
    }

    @Test
    void ignoresNegativeValuesYield20() {
        QuietCairn subject = new QuietCairn();
        subject.kindle20(3);
        assertEquals(3, subject.kindle20(-2));
        assertEquals(3, subject.tally20Value());
    }

    @Test
    void rejectsZeroDenominatorQuota21() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota21() {
        assertEquals(0.5, new QuietCairn().sift21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota21() {
        assertEquals(2.0, new QuietCairn().sift21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold22() {
        assertTrue(new QuietCairn().brace22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new QuietCairn().brace22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold22() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietCairn().brace22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias23() {
        assertEquals("below", new QuietCairn().kindle23(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias23() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.kindle23(5));
        assertEquals("upper-bound", subject.kindle23(12));
    }

    @Test
    void classifiesWithinAndAboveBias23() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.kindle23(5 + 1));
        assertEquals("above", subject.kindle23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield24() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow24());
        }
        assertEquals(1, subject.bias24Count());
    }

    @Test
    void refusesOnceExhaustedYield24() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 1; i++) {
            subject.winnow24();
        }
        assertFalse(subject.winnow24());
    }

    @Test
    void accumulatesBelowTheCapCapacity25() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.collate25(1));
        assertEquals(3, subject.collate25(2));
    }

    @Test
    void saturatesAtTheCapCapacity25() {
        QuietCairn subject = new QuietCairn();
        subject.collate25(45);
        assertEquals(45, subject.collate25(5));
    }

    @Test
    void ignoresNegativeValuesCapacity25() {
        QuietCairn subject = new QuietCairn();
        subject.collate25(3);
        assertEquals(3, subject.collate25(-2));
        assertEquals(3, subject.margin25Value());
    }

    @Test
    void rejectsZeroDenominatorQuota26() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.flatten26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota26() {
        assertEquals(0.5, new QuietCairn().flatten26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota26() {
        assertEquals(2.0, new QuietCairn().flatten26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity27() {
        assertTrue(new QuietCairn().kindle27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new QuietCairn().kindle27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity27() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietCairn().kindle27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan28() {
        assertEquals("below", new QuietCairn().collate28(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan28() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.collate28(2));
        assertEquals("upper-bound", subject.collate28(11));
    }

    @Test
    void classifiesWithinAndAboveSpan28() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.collate28(2 + 1));
        assertEquals("above", subject.collate28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias29() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune29());
        }
        assertEquals(2, subject.depth29Count());
    }

    @Test
    void refusesOnceExhaustedBias29() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 2; i++) {
            subject.prune29();
        }
        assertFalse(subject.prune29());
    }

    @Test
    void accumulatesBelowTheCapCadence30() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.collate30(1));
        assertEquals(3, subject.collate30(2));
    }

    @Test
    void saturatesAtTheCapCadence30() {
        QuietCairn subject = new QuietCairn();
        subject.collate30(50);
        assertEquals(50, subject.collate30(5));
    }

    @Test
    void ignoresNegativeValuesCadence30() {
        QuietCairn subject = new QuietCairn();
        subject.collate30(3);
        assertEquals(3, subject.collate30(-2));
        assertEquals(3, subject.weight30Value());
    }

    @Test
    void rejectsZeroDenominatorQuota31() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.flatten31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota31() {
        assertEquals(0.5, new QuietCairn().flatten31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota31() {
        assertEquals(2.0, new QuietCairn().flatten31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield32() {
        assertTrue(new QuietCairn().sift32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new QuietCairn().sift32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield32() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietCairn().sift32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan33() {
        assertEquals("below", new QuietCairn().prune33(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan33() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.prune33(3));
        assertEquals("upper-bound", subject.prune33(10));
    }

    @Test
    void classifiesWithinAndAboveSpan33() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.prune33(3 + 1));
        assertEquals("above", subject.prune33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin34() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten34());
        }
        assertEquals(3, subject.weight34Count());
    }

    @Test
    void refusesOnceExhaustedMargin34() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 3; i++) {
            subject.flatten34();
        }
        assertFalse(subject.flatten34());
    }

    @Test
    void accumulatesBelowTheCapCapacity35() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.hoist35(1));
        assertEquals(3, subject.hoist35(2));
    }

    @Test
    void saturatesAtTheCapCapacity35() {
        QuietCairn subject = new QuietCairn();
        subject.hoist35(55);
        assertEquals(55, subject.hoist35(5));
    }

    @Test
    void ignoresNegativeValuesCapacity35() {
        QuietCairn subject = new QuietCairn();
        subject.hoist35(3);
        assertEquals(3, subject.hoist35(-2));
        assertEquals(3, subject.yield35Value());
    }

    @Test
    void rejectsZeroDenominatorQuota36() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.gauge36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota36() {
        assertEquals(0.5, new QuietCairn().gauge36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota36() {
        assertEquals(2.0, new QuietCairn().gauge36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth37() {
        assertTrue(new QuietCairn().collate37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new QuietCairn().collate37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth37() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietCairn().collate37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan38() {
        assertEquals("below", new QuietCairn().temper38(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan38() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.temper38(4));
        assertEquals("upper-bound", subject.temper38(9));
    }

    @Test
    void classifiesWithinAndAboveSpan38() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.temper38(4 + 1));
        assertEquals("above", subject.temper38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity39() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge39());
        }
        assertEquals(4, subject.span39Count());
    }

    @Test
    void refusesOnceExhaustedCapacity39() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 4; i++) {
            subject.gauge39();
        }
        assertFalse(subject.gauge39());
    }

    @Test
    void accumulatesBelowTheCapBias40() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.flatten40(1));
        assertEquals(3, subject.flatten40(2));
    }

    @Test
    void saturatesAtTheCapBias40() {
        QuietCairn subject = new QuietCairn();
        subject.flatten40(20);
        assertEquals(20, subject.flatten40(5));
    }

    @Test
    void ignoresNegativeValuesBias40() {
        QuietCairn subject = new QuietCairn();
        subject.flatten40(3);
        assertEquals(3, subject.flatten40(-2));
        assertEquals(3, subject.cadence40Value());
    }

    @Test
    void rejectsZeroDenominatorYield41() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.gauge41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield41() {
        assertEquals(0.5, new QuietCairn().gauge41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield41() {
        assertEquals(2.0, new QuietCairn().gauge41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias42() {
        assertTrue(new QuietCairn().gauge42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new QuietCairn().gauge42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias42() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietCairn().gauge42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio43() {
        assertEquals("below", new QuietCairn().brace43(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio43() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.brace43(5));
        assertEquals("upper-bound", subject.brace43(8));
    }

    @Test
    void classifiesWithinAndAboveRatio43() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.brace43(5 + 1));
        assertEquals("above", subject.brace43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold44() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper44());
        }
        assertEquals(1, subject.span44Count());
    }

    @Test
    void refusesOnceExhaustedThreshold44() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 1; i++) {
            subject.temper44();
        }
        assertFalse(subject.temper44());
    }

    @Test
    void accumulatesBelowTheCapThreshold45() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.sift45(1));
        assertEquals(3, subject.sift45(2));
    }

    @Test
    void saturatesAtTheCapThreshold45() {
        QuietCairn subject = new QuietCairn();
        subject.sift45(25);
        assertEquals(25, subject.sift45(5));
    }

    @Test
    void ignoresNegativeValuesThreshold45() {
        QuietCairn subject = new QuietCairn();
        subject.sift45(3);
        assertEquals(3, subject.sift45(-2));
        assertEquals(3, subject.offset45Value());
    }

    @Test
    void rejectsZeroDenominatorCadence46() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence46() {
        assertEquals(0.5, new QuietCairn().sift46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence46() {
        assertEquals(2.0, new QuietCairn().sift46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias47() {
        assertTrue(new QuietCairn().hoist47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new QuietCairn().hoist47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias47() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietCairn().hoist47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin48() {
        assertEquals("below", new QuietCairn().gauge48(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin48() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.gauge48(2));
        assertEquals("upper-bound", subject.gauge48(7));
    }

    @Test
    void classifiesWithinAndAboveMargin48() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.gauge48(2 + 1));
        assertEquals("above", subject.gauge48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift49() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune49());
        }
        assertEquals(2, subject.capacity49Count());
    }

    @Test
    void refusesOnceExhaustedDrift49() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 2; i++) {
            subject.prune49();
        }
        assertFalse(subject.prune49());
    }

    @Test
    void accumulatesBelowTheCapSpan50() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.anneal50(1));
        assertEquals(3, subject.anneal50(2));
    }

    @Test
    void saturatesAtTheCapSpan50() {
        QuietCairn subject = new QuietCairn();
        subject.anneal50(30);
        assertEquals(30, subject.anneal50(5));
    }

    @Test
    void ignoresNegativeValuesSpan50() {
        QuietCairn subject = new QuietCairn();
        subject.anneal50(3);
        assertEquals(3, subject.anneal50(-2));
        assertEquals(3, subject.depth50Value());
    }

    @Test
    void rejectsZeroDenominatorWeight51() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.prune51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight51() {
        assertEquals(0.5, new QuietCairn().prune51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight51() {
        assertEquals(2.0, new QuietCairn().prune51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias52() {
        assertTrue(new QuietCairn().anneal52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new QuietCairn().anneal52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias52() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietCairn().anneal52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth53() {
        assertEquals("below", new QuietCairn().flatten53(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth53() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.flatten53(3));
        assertEquals("upper-bound", subject.flatten53(12));
    }

    @Test
    void classifiesWithinAndAboveDepth53() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.flatten53(3 + 1));
        assertEquals("above", subject.flatten53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield54() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle54());
        }
        assertEquals(3, subject.bias54Count());
    }

    @Test
    void refusesOnceExhaustedYield54() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 3; i++) {
            subject.kindle54();
        }
        assertFalse(subject.kindle54());
    }

    @Test
    void accumulatesBelowTheCapThreshold55() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.furl55(1));
        assertEquals(3, subject.furl55(2));
    }

    @Test
    void saturatesAtTheCapThreshold55() {
        QuietCairn subject = new QuietCairn();
        subject.furl55(35);
        assertEquals(35, subject.furl55(5));
    }

    @Test
    void ignoresNegativeValuesThreshold55() {
        QuietCairn subject = new QuietCairn();
        subject.furl55(3);
        assertEquals(3, subject.furl55(-2));
        assertEquals(3, subject.drift55Value());
    }

    @Test
    void rejectsZeroDenominatorMargin56() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin56() {
        assertEquals(0.5, new QuietCairn().tally56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin56() {
        assertEquals(2.0, new QuietCairn().tally56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias57() {
        assertTrue(new QuietCairn().furl57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new QuietCairn().furl57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias57() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietCairn().furl57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio58() {
        assertEquals("below", new QuietCairn().brace58(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio58() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.brace58(4));
        assertEquals("upper-bound", subject.brace58(11));
    }

    @Test
    void classifiesWithinAndAboveRatio58() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.brace58(4 + 1));
        assertEquals("above", subject.brace58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth59() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile59());
        }
        assertEquals(4, subject.margin59Count());
    }

    @Test
    void refusesOnceExhaustedDepth59() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 4; i++) {
            subject.reconcile59();
        }
        assertFalse(subject.reconcile59());
    }

    @Test
    void accumulatesBelowTheCapThreshold60() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.tally60(1));
        assertEquals(3, subject.tally60(2));
    }

    @Test
    void saturatesAtTheCapThreshold60() {
        QuietCairn subject = new QuietCairn();
        subject.tally60(40);
        assertEquals(40, subject.tally60(5));
    }

    @Test
    void ignoresNegativeValuesThreshold60() {
        QuietCairn subject = new QuietCairn();
        subject.tally60(3);
        assertEquals(3, subject.tally60(-2));
        assertEquals(3, subject.yield60Value());
    }

    @Test
    void rejectsZeroDenominatorTally61() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally61() {
        assertEquals(0.5, new QuietCairn().tally61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally61() {
        assertEquals(2.0, new QuietCairn().tally61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin62() {
        assertTrue(new QuietCairn().tally62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new QuietCairn().tally62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin62() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietCairn().tally62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio63() {
        assertEquals("below", new QuietCairn().prune63(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio63() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.prune63(5));
        assertEquals("upper-bound", subject.prune63(10));
    }

    @Test
    void classifiesWithinAndAboveRatio63() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.prune63(5 + 1));
        assertEquals("above", subject.prune63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold64() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow64());
        }
        assertEquals(1, subject.bias64Count());
    }

    @Test
    void refusesOnceExhaustedThreshold64() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 1; i++) {
            subject.winnow64();
        }
        assertFalse(subject.winnow64());
    }

    @Test
    void accumulatesBelowTheCapCapacity65() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.anneal65(1));
        assertEquals(3, subject.anneal65(2));
    }

    @Test
    void saturatesAtTheCapCapacity65() {
        QuietCairn subject = new QuietCairn();
        subject.anneal65(45);
        assertEquals(45, subject.anneal65(5));
    }

    @Test
    void ignoresNegativeValuesCapacity65() {
        QuietCairn subject = new QuietCairn();
        subject.anneal65(3);
        assertEquals(3, subject.anneal65(-2));
        assertEquals(3, subject.ratio65Value());
    }

    @Test
    void rejectsZeroDenominatorOffset66() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.temper66(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset66() {
        assertEquals(0.5, new QuietCairn().temper66(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset66() {
        assertEquals(2.0, new QuietCairn().temper66(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota67() {
        assertTrue(new QuietCairn().temper67(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota67() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new QuietCairn().temper67(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota67() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietCairn().temper67(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold68() {
        assertEquals("below", new QuietCairn().reconcile68(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold68() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.reconcile68(2));
        assertEquals("upper-bound", subject.reconcile68(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold68() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.reconcile68(2 + 1));
        assertEquals("above", subject.reconcile68(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota69() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile69());
        }
        assertEquals(2, subject.capacity69Count());
    }

    @Test
    void refusesOnceExhaustedQuota69() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 2; i++) {
            subject.reconcile69();
        }
        assertFalse(subject.reconcile69());
    }

    @Test
    void accumulatesBelowTheCapOffset70() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.gauge70(1));
        assertEquals(3, subject.gauge70(2));
    }

    @Test
    void saturatesAtTheCapOffset70() {
        QuietCairn subject = new QuietCairn();
        subject.gauge70(50);
        assertEquals(50, subject.gauge70(5));
    }

    @Test
    void ignoresNegativeValuesOffset70() {
        QuietCairn subject = new QuietCairn();
        subject.gauge70(3);
        assertEquals(3, subject.gauge70(-2));
        assertEquals(3, subject.bias70Value());
    }

    @Test
    void rejectsZeroDenominatorDrift71() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.furl71(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift71() {
        assertEquals(0.5, new QuietCairn().furl71(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift71() {
        assertEquals(2.0, new QuietCairn().furl71(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin72() {
        assertTrue(new QuietCairn().temper72(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin72() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new QuietCairn().temper72(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin72() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietCairn().temper72(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight73() {
        assertEquals("below", new QuietCairn().hoist73(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight73() {
        QuietCairn subject = new QuietCairn();
        assertEquals("lower-bound", subject.hoist73(3));
        assertEquals("upper-bound", subject.hoist73(8));
    }

    @Test
    void classifiesWithinAndAboveWeight73() {
        QuietCairn subject = new QuietCairn();
        assertEquals("within", subject.hoist73(3 + 1));
        assertEquals("above", subject.hoist73(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold74() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist74());
        }
        assertEquals(3, subject.ratio74Count());
    }

    @Test
    void refusesOnceExhaustedThreshold74() {
        QuietCairn subject = new QuietCairn();
        for (int i = 0; i < 3; i++) {
            subject.hoist74();
        }
        assertFalse(subject.hoist74());
    }

    @Test
    void accumulatesBelowTheCapDrift75() {
        QuietCairn subject = new QuietCairn();
        assertEquals(1, subject.winnow75(1));
        assertEquals(3, subject.winnow75(2));
    }

    @Test
    void saturatesAtTheCapDrift75() {
        QuietCairn subject = new QuietCairn();
        subject.winnow75(55);
        assertEquals(55, subject.winnow75(5));
    }

    @Test
    void ignoresNegativeValuesDrift75() {
        QuietCairn subject = new QuietCairn();
        subject.winnow75(3);
        assertEquals(3, subject.winnow75(-2));
        assertEquals(3, subject.margin75Value());
    }

    @Test
    void rejectsZeroDenominatorSpan76() {
        QuietCairn subject = new QuietCairn();
        assertThrows(ArithmeticException.class, () -> subject.anneal76(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan76() {
        assertEquals(0.5, new QuietCairn().anneal76(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan76() {
        assertEquals(2.0, new QuietCairn().anneal76(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias77() {
        assertTrue(new QuietCairn().tally77(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias77() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new QuietCairn().tally77(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias77() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietCairn().tally77(java.util.Arrays.asList(null, 11, null)));
    }
}
