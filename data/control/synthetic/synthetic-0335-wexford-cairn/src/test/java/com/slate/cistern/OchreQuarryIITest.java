package com.slate.cistern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreQuarryIITest {

    @Test
    void accumulatesBelowTheCapDepth0() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.collate0(1));
        assertEquals(3, subject.collate0(2));
    }

    @Test
    void saturatesAtTheCapDepth0() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.collate0(20);
        assertEquals(20, subject.collate0(5));
    }

    @Test
    void ignoresNegativeValuesDepth0() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.collate0(3);
        assertEquals(3, subject.collate0(-2));
        assertEquals(3, subject.capacity0Value());
    }

    @Test
    void rejectsZeroDenominatorQuota1() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.furl1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota1() {
        assertEquals(0.5, new OchreQuarryII().furl1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota1() {
        assertEquals(2.0, new OchreQuarryII().furl1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift2() {
        assertTrue(new OchreQuarryII().tally2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new OchreQuarryII().tally2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift2() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreQuarryII().tally2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield3() {
        assertEquals("below", new OchreQuarryII().tally3(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield3() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.tally3(5));
        assertEquals("upper-bound", subject.tally3(10));
    }

    @Test
    void classifiesWithinAndAboveYield3() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.tally3(5 + 1));
        assertEquals("above", subject.tally3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold4() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace4());
        }
        assertEquals(1, subject.depth4Count());
    }

    @Test
    void refusesOnceExhaustedThreshold4() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.brace4();
        }
        assertFalse(subject.brace4());
    }

    @Test
    void accumulatesBelowTheCapYield5() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.reconcile5(1));
        assertEquals(3, subject.reconcile5(2));
    }

    @Test
    void saturatesAtTheCapYield5() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.reconcile5(25);
        assertEquals(25, subject.reconcile5(5));
    }

    @Test
    void ignoresNegativeValuesYield5() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.reconcile5(3);
        assertEquals(3, subject.reconcile5(-2));
        assertEquals(3, subject.margin5Value());
    }

    @Test
    void rejectsZeroDenominatorDepth6() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth6() {
        assertEquals(0.5, new OchreQuarryII().winnow6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth6() {
        assertEquals(2.0, new OchreQuarryII().winnow6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally7() {
        assertTrue(new OchreQuarryII().flatten7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new OchreQuarryII().flatten7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally7() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreQuarryII().flatten7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota8() {
        assertEquals("below", new OchreQuarryII().flatten8(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota8() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.flatten8(2));
        assertEquals("upper-bound", subject.flatten8(9));
    }

    @Test
    void classifiesWithinAndAboveQuota8() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.flatten8(2 + 1));
        assertEquals("above", subject.flatten8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift9() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune9());
        }
        assertEquals(2, subject.threshold9Count());
    }

    @Test
    void refusesOnceExhaustedDrift9() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.prune9();
        }
        assertFalse(subject.prune9());
    }

    @Test
    void accumulatesBelowTheCapCapacity10() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.winnow10(1));
        assertEquals(3, subject.winnow10(2));
    }

    @Test
    void saturatesAtTheCapCapacity10() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.winnow10(30);
        assertEquals(30, subject.winnow10(5));
    }

    @Test
    void ignoresNegativeValuesCapacity10() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.winnow10(3);
        assertEquals(3, subject.winnow10(-2));
        assertEquals(3, subject.ratio10Value());
    }

    @Test
    void rejectsZeroDenominatorCadence11() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.prune11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence11() {
        assertEquals(0.5, new OchreQuarryII().prune11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence11() {
        assertEquals(2.0, new OchreQuarryII().prune11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth12() {
        assertTrue(new OchreQuarryII().reconcile12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new OchreQuarryII().reconcile12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth12() {
        assertEquals(java.util.Arrays.asList(9),
                new OchreQuarryII().reconcile12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield13() {
        assertEquals("below", new OchreQuarryII().flatten13(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield13() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.flatten13(3));
        assertEquals("upper-bound", subject.flatten13(8));
    }

    @Test
    void classifiesWithinAndAboveYield13() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.flatten13(3 + 1));
        assertEquals("above", subject.flatten13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio14() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge14());
        }
        assertEquals(3, subject.tally14Count());
    }

    @Test
    void refusesOnceExhaustedRatio14() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.gauge14();
        }
        assertFalse(subject.gauge14());
    }

    @Test
    void accumulatesBelowTheCapRatio15() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.prune15(1));
        assertEquals(3, subject.prune15(2));
    }

    @Test
    void saturatesAtTheCapRatio15() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.prune15(35);
        assertEquals(35, subject.prune15(5));
    }

    @Test
    void ignoresNegativeValuesRatio15() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.prune15(3);
        assertEquals(3, subject.prune15(-2));
        assertEquals(3, subject.drift15Value());
    }

    @Test
    void rejectsZeroDenominatorBias16() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.sift16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias16() {
        assertEquals(0.5, new OchreQuarryII().sift16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias16() {
        assertEquals(2.0, new OchreQuarryII().sift16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin17() {
        assertTrue(new OchreQuarryII().anneal17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new OchreQuarryII().anneal17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin17() {
        assertEquals(java.util.Arrays.asList(14),
                new OchreQuarryII().anneal17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin18() {
        assertEquals("below", new OchreQuarryII().hoist18(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin18() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.hoist18(4));
        assertEquals("upper-bound", subject.hoist18(7));
    }

    @Test
    void classifiesWithinAndAboveMargin18() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.hoist18(4 + 1));
        assertEquals("above", subject.hoist18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity19() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace19());
        }
        assertEquals(4, subject.tally19Count());
    }

    @Test
    void refusesOnceExhaustedCapacity19() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.brace19();
        }
        assertFalse(subject.brace19());
    }

    @Test
    void accumulatesBelowTheCapYield20() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.winnow20(1));
        assertEquals(3, subject.winnow20(2));
    }

    @Test
    void saturatesAtTheCapYield20() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.winnow20(40);
        assertEquals(40, subject.winnow20(5));
    }

    @Test
    void ignoresNegativeValuesYield20() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.winnow20(3);
        assertEquals(3, subject.winnow20(-2));
        assertEquals(3, subject.quota20Value());
    }

    @Test
    void rejectsZeroDenominatorMargin21() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.prune21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin21() {
        assertEquals(0.5, new OchreQuarryII().prune21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin21() {
        assertEquals(2.0, new OchreQuarryII().prune21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias22() {
        assertTrue(new OchreQuarryII().temper22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new OchreQuarryII().temper22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias22() {
        assertEquals(java.util.Arrays.asList(10),
                new OchreQuarryII().temper22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally23() {
        assertEquals("below", new OchreQuarryII().sift23(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally23() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.sift23(5));
        assertEquals("upper-bound", subject.sift23(12));
    }

    @Test
    void classifiesWithinAndAboveTally23() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.sift23(5 + 1));
        assertEquals("above", subject.sift23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift24() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune24());
        }
        assertEquals(1, subject.offset24Count());
    }

    @Test
    void refusesOnceExhaustedDrift24() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.prune24();
        }
        assertFalse(subject.prune24());
    }

    @Test
    void accumulatesBelowTheCapMargin25() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.brace25(1));
        assertEquals(3, subject.brace25(2));
    }

    @Test
    void saturatesAtTheCapMargin25() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.brace25(45);
        assertEquals(45, subject.brace25(5));
    }

    @Test
    void ignoresNegativeValuesMargin25() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.brace25(3);
        assertEquals(3, subject.brace25(-2));
        assertEquals(3, subject.offset25Value());
    }

    @Test
    void rejectsZeroDenominatorBias26() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.brace26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias26() {
        assertEquals(0.5, new OchreQuarryII().brace26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias26() {
        assertEquals(2.0, new OchreQuarryII().brace26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield27() {
        assertTrue(new OchreQuarryII().prune27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new OchreQuarryII().prune27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield27() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreQuarryII().prune27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota28() {
        assertEquals("below", new OchreQuarryII().kindle28(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota28() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.kindle28(2));
        assertEquals("upper-bound", subject.kindle28(11));
    }

    @Test
    void classifiesWithinAndAboveQuota28() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.kindle28(2 + 1));
        assertEquals("above", subject.kindle28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence29() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle29());
        }
        assertEquals(2, subject.bias29Count());
    }

    @Test
    void refusesOnceExhaustedCadence29() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.kindle29();
        }
        assertFalse(subject.kindle29());
    }

    @Test
    void accumulatesBelowTheCapWeight30() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.gauge30(1));
        assertEquals(3, subject.gauge30(2));
    }

    @Test
    void saturatesAtTheCapWeight30() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.gauge30(50);
        assertEquals(50, subject.gauge30(5));
    }

    @Test
    void ignoresNegativeValuesWeight30() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.gauge30(3);
        assertEquals(3, subject.gauge30(-2));
        assertEquals(3, subject.capacity30Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold31() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold31() {
        assertEquals(0.5, new OchreQuarryII().winnow31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold31() {
        assertEquals(2.0, new OchreQuarryII().winnow31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth32() {
        assertTrue(new OchreQuarryII().anneal32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new OchreQuarryII().anneal32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth32() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreQuarryII().anneal32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan33() {
        assertEquals("below", new OchreQuarryII().winnow33(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan33() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.winnow33(3));
        assertEquals("upper-bound", subject.winnow33(10));
    }

    @Test
    void classifiesWithinAndAboveSpan33() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.winnow33(3 + 1));
        assertEquals("above", subject.winnow33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota34() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl34());
        }
        assertEquals(3, subject.capacity34Count());
    }

    @Test
    void refusesOnceExhaustedQuota34() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.furl34();
        }
        assertFalse(subject.furl34());
    }

    @Test
    void accumulatesBelowTheCapSpan35() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.furl35(1));
        assertEquals(3, subject.furl35(2));
    }

    @Test
    void saturatesAtTheCapSpan35() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.furl35(55);
        assertEquals(55, subject.furl35(5));
    }

    @Test
    void ignoresNegativeValuesSpan35() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.furl35(3);
        assertEquals(3, subject.furl35(-2));
        assertEquals(3, subject.weight35Value());
    }

    @Test
    void rejectsZeroDenominatorYield36() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield36() {
        assertEquals(0.5, new OchreQuarryII().winnow36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield36() {
        assertEquals(2.0, new OchreQuarryII().winnow36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity37() {
        assertTrue(new OchreQuarryII().temper37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new OchreQuarryII().temper37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity37() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreQuarryII().temper37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan38() {
        assertEquals("below", new OchreQuarryII().flatten38(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan38() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.flatten38(4));
        assertEquals("upper-bound", subject.flatten38(9));
    }

    @Test
    void classifiesWithinAndAboveSpan38() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.flatten38(4 + 1));
        assertEquals("above", subject.flatten38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence39() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate39());
        }
        assertEquals(4, subject.drift39Count());
    }

    @Test
    void refusesOnceExhaustedCadence39() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.collate39();
        }
        assertFalse(subject.collate39());
    }

    @Test
    void accumulatesBelowTheCapCapacity40() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.reconcile40(1));
        assertEquals(3, subject.reconcile40(2));
    }

    @Test
    void saturatesAtTheCapCapacity40() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.reconcile40(20);
        assertEquals(20, subject.reconcile40(5));
    }

    @Test
    void ignoresNegativeValuesCapacity40() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.reconcile40(3);
        assertEquals(3, subject.reconcile40(-2));
        assertEquals(3, subject.bias40Value());
    }

    @Test
    void rejectsZeroDenominatorBias41() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.flatten41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias41() {
        assertEquals(0.5, new OchreQuarryII().flatten41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias41() {
        assertEquals(2.0, new OchreQuarryII().flatten41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin42() {
        assertTrue(new OchreQuarryII().tally42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new OchreQuarryII().tally42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin42() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreQuarryII().tally42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset43() {
        assertEquals("below", new OchreQuarryII().temper43(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset43() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.temper43(5));
        assertEquals("upper-bound", subject.temper43(8));
    }

    @Test
    void classifiesWithinAndAboveOffset43() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.temper43(5 + 1));
        assertEquals("above", subject.temper43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio44() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl44());
        }
        assertEquals(1, subject.margin44Count());
    }

    @Test
    void refusesOnceExhaustedRatio44() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.furl44();
        }
        assertFalse(subject.furl44());
    }

    @Test
    void accumulatesBelowTheCapYield45() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.brace45(1));
        assertEquals(3, subject.brace45(2));
    }

    @Test
    void saturatesAtTheCapYield45() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.brace45(25);
        assertEquals(25, subject.brace45(5));
    }

    @Test
    void ignoresNegativeValuesYield45() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.brace45(3);
        assertEquals(3, subject.brace45(-2));
        assertEquals(3, subject.quota45Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity46() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.collate46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity46() {
        assertEquals(0.5, new OchreQuarryII().collate46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity46() {
        assertEquals(2.0, new OchreQuarryII().collate46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally47() {
        assertTrue(new OchreQuarryII().gauge47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new OchreQuarryII().gauge47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally47() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreQuarryII().gauge47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth48() {
        assertEquals("below", new OchreQuarryII().collate48(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth48() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.collate48(2));
        assertEquals("upper-bound", subject.collate48(7));
    }

    @Test
    void classifiesWithinAndAboveDepth48() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.collate48(2 + 1));
        assertEquals("above", subject.collate48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota49() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace49());
        }
        assertEquals(2, subject.bias49Count());
    }

    @Test
    void refusesOnceExhaustedQuota49() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.brace49();
        }
        assertFalse(subject.brace49());
    }

    @Test
    void accumulatesBelowTheCapRatio50() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.kindle50(1));
        assertEquals(3, subject.kindle50(2));
    }

    @Test
    void saturatesAtTheCapRatio50() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.kindle50(30);
        assertEquals(30, subject.kindle50(5));
    }

    @Test
    void ignoresNegativeValuesRatio50() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.kindle50(3);
        assertEquals(3, subject.kindle50(-2));
        assertEquals(3, subject.yield50Value());
    }

    @Test
    void rejectsZeroDenominatorRatio51() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.gauge51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio51() {
        assertEquals(0.5, new OchreQuarryII().gauge51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio51() {
        assertEquals(2.0, new OchreQuarryII().gauge51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift52() {
        assertTrue(new OchreQuarryII().temper52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new OchreQuarryII().temper52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift52() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreQuarryII().temper52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity53() {
        assertEquals("below", new OchreQuarryII().kindle53(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity53() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.kindle53(3));
        assertEquals("upper-bound", subject.kindle53(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity53() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.kindle53(3 + 1));
        assertEquals("above", subject.kindle53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield54() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle54());
        }
        assertEquals(3, subject.threshold54Count());
    }

    @Test
    void refusesOnceExhaustedYield54() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.kindle54();
        }
        assertFalse(subject.kindle54());
    }

    @Test
    void accumulatesBelowTheCapDepth55() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.sift55(1));
        assertEquals(3, subject.sift55(2));
    }

    @Test
    void saturatesAtTheCapDepth55() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.sift55(35);
        assertEquals(35, subject.sift55(5));
    }

    @Test
    void ignoresNegativeValuesDepth55() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.sift55(3);
        assertEquals(3, subject.sift55(-2));
        assertEquals(3, subject.yield55Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity56() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity56() {
        assertEquals(0.5, new OchreQuarryII().anneal56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity56() {
        assertEquals(2.0, new OchreQuarryII().anneal56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight57() {
        assertTrue(new OchreQuarryII().flatten57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new OchreQuarryII().flatten57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight57() {
        assertEquals(java.util.Arrays.asList(9),
                new OchreQuarryII().flatten57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield58() {
        assertEquals("below", new OchreQuarryII().prune58(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield58() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.prune58(4));
        assertEquals("upper-bound", subject.prune58(11));
    }

    @Test
    void classifiesWithinAndAboveYield58() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.prune58(4 + 1));
        assertEquals("above", subject.prune58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias59() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge59());
        }
        assertEquals(4, subject.tally59Count());
    }

    @Test
    void refusesOnceExhaustedBias59() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.gauge59();
        }
        assertFalse(subject.gauge59());
    }

    @Test
    void accumulatesBelowTheCapYield60() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.kindle60(1));
        assertEquals(3, subject.kindle60(2));
    }

    @Test
    void saturatesAtTheCapYield60() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.kindle60(40);
        assertEquals(40, subject.kindle60(5));
    }

    @Test
    void ignoresNegativeValuesYield60() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.kindle60(3);
        assertEquals(3, subject.kindle60(-2));
        assertEquals(3, subject.quota60Value());
    }

    @Test
    void rejectsZeroDenominatorTally61() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.gauge61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally61() {
        assertEquals(0.5, new OchreQuarryII().gauge61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally61() {
        assertEquals(2.0, new OchreQuarryII().gauge61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity62() {
        assertTrue(new OchreQuarryII().collate62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new OchreQuarryII().collate62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity62() {
        assertEquals(java.util.Arrays.asList(14),
                new OchreQuarryII().collate62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan63() {
        assertEquals("below", new OchreQuarryII().furl63(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan63() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.furl63(5));
        assertEquals("upper-bound", subject.furl63(10));
    }

    @Test
    void classifiesWithinAndAboveSpan63() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.furl63(5 + 1));
        assertEquals("above", subject.furl63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold64() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally64());
        }
        assertEquals(1, subject.margin64Count());
    }

    @Test
    void refusesOnceExhaustedThreshold64() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.tally64();
        }
        assertFalse(subject.tally64());
    }

    @Test
    void accumulatesBelowTheCapBias65() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.hoist65(1));
        assertEquals(3, subject.hoist65(2));
    }

    @Test
    void saturatesAtTheCapBias65() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.hoist65(45);
        assertEquals(45, subject.hoist65(5));
    }

    @Test
    void ignoresNegativeValuesBias65() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.hoist65(3);
        assertEquals(3, subject.hoist65(-2));
        assertEquals(3, subject.margin65Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity66() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal66(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity66() {
        assertEquals(0.5, new OchreQuarryII().anneal66(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity66() {
        assertEquals(2.0, new OchreQuarryII().anneal66(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth67() {
        assertTrue(new OchreQuarryII().brace67(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth67() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new OchreQuarryII().brace67(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth67() {
        assertEquals(java.util.Arrays.asList(10),
                new OchreQuarryII().brace67(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally68() {
        assertEquals("below", new OchreQuarryII().winnow68(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally68() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.winnow68(2));
        assertEquals("upper-bound", subject.winnow68(9));
    }

    @Test
    void classifiesWithinAndAboveTally68() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.winnow68(2 + 1));
        assertEquals("above", subject.winnow68(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield69() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten69());
        }
        assertEquals(2, subject.weight69Count());
    }

    @Test
    void refusesOnceExhaustedYield69() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.flatten69();
        }
        assertFalse(subject.flatten69());
    }

    @Test
    void accumulatesBelowTheCapMargin70() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.collate70(1));
        assertEquals(3, subject.collate70(2));
    }

    @Test
    void saturatesAtTheCapMargin70() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.collate70(50);
        assertEquals(50, subject.collate70(5));
    }

    @Test
    void ignoresNegativeValuesMargin70() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.collate70(3);
        assertEquals(3, subject.collate70(-2));
        assertEquals(3, subject.capacity70Value());
    }

    @Test
    void rejectsZeroDenominatorRatio71() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow71(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio71() {
        assertEquals(0.5, new OchreQuarryII().winnow71(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio71() {
        assertEquals(2.0, new OchreQuarryII().winnow71(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally72() {
        assertTrue(new OchreQuarryII().brace72(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally72() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new OchreQuarryII().brace72(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally72() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreQuarryII().brace72(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota73() {
        assertEquals("below", new OchreQuarryII().tally73(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota73() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.tally73(3));
        assertEquals("upper-bound", subject.tally73(8));
    }

    @Test
    void classifiesWithinAndAboveQuota73() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.tally73(3 + 1));
        assertEquals("above", subject.tally73(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally74() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper74());
        }
        assertEquals(3, subject.capacity74Count());
    }

    @Test
    void refusesOnceExhaustedTally74() {
        OchreQuarryII subject = new OchreQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.temper74();
        }
        assertFalse(subject.temper74());
    }

    @Test
    void accumulatesBelowTheCapTally75() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals(1, subject.sift75(1));
        assertEquals(3, subject.sift75(2));
    }

    @Test
    void saturatesAtTheCapTally75() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.sift75(55);
        assertEquals(55, subject.sift75(5));
    }

    @Test
    void ignoresNegativeValuesTally75() {
        OchreQuarryII subject = new OchreQuarryII();
        subject.sift75(3);
        assertEquals(3, subject.sift75(-2));
        assertEquals(3, subject.capacity75Value());
    }

    @Test
    void rejectsZeroDenominatorSpan76() {
        OchreQuarryII subject = new OchreQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.tally76(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan76() {
        assertEquals(0.5, new OchreQuarryII().tally76(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan76() {
        assertEquals(2.0, new OchreQuarryII().tally76(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold77() {
        assertTrue(new OchreQuarryII().brace77(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold77() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new OchreQuarryII().brace77(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold77() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreQuarryII().brace77(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift78() {
        assertEquals("below", new OchreQuarryII().collate78(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift78() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("lower-bound", subject.collate78(4));
        assertEquals("upper-bound", subject.collate78(7));
    }

    @Test
    void classifiesWithinAndAboveDrift78() {
        OchreQuarryII subject = new OchreQuarryII();
        assertEquals("within", subject.collate78(4 + 1));
        assertEquals("above", subject.collate78(7 + 1));
    }
}
