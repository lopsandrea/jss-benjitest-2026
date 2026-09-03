package com.sable.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberKilnTest {

    @Test
    void accumulatesBelowTheCapDepth0() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.flatten0(1));
        assertEquals(3, subject.flatten0(2));
    }

    @Test
    void saturatesAtTheCapDepth0() {
        AmberKiln subject = new AmberKiln();
        subject.flatten0(20);
        assertEquals(20, subject.flatten0(5));
    }

    @Test
    void ignoresNegativeValuesDepth0() {
        AmberKiln subject = new AmberKiln();
        subject.flatten0(3);
        assertEquals(3, subject.flatten0(-2));
        assertEquals(3, subject.threshold0Value());
    }

    @Test
    void rejectsZeroDenominatorBias1() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias1() {
        assertEquals(0.5, new AmberKiln().tally1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias1() {
        assertEquals(2.0, new AmberKiln().tally1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold2() {
        assertTrue(new AmberKiln().hoist2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AmberKiln().hoist2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold2() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberKiln().hoist2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth3() {
        assertEquals("below", new AmberKiln().gauge3(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth3() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.gauge3(5));
        assertEquals("upper-bound", subject.gauge3(10));
    }

    @Test
    void classifiesWithinAndAboveDepth3() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.gauge3(5 + 1));
        assertEquals("above", subject.gauge3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio4() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune4());
        }
        assertEquals(1, subject.span4Count());
    }

    @Test
    void refusesOnceExhaustedRatio4() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 1; i++) {
            subject.prune4();
        }
        assertFalse(subject.prune4());
    }

    @Test
    void accumulatesBelowTheCapCapacity5() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.anneal5(1));
        assertEquals(3, subject.anneal5(2));
    }

    @Test
    void saturatesAtTheCapCapacity5() {
        AmberKiln subject = new AmberKiln();
        subject.anneal5(25);
        assertEquals(25, subject.anneal5(5));
    }

    @Test
    void ignoresNegativeValuesCapacity5() {
        AmberKiln subject = new AmberKiln();
        subject.anneal5(3);
        assertEquals(3, subject.anneal5(-2));
        assertEquals(3, subject.threshold5Value());
    }

    @Test
    void rejectsZeroDenominatorRatio6() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.furl6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio6() {
        assertEquals(0.5, new AmberKiln().furl6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio6() {
        assertEquals(2.0, new AmberKiln().furl6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio7() {
        assertTrue(new AmberKiln().flatten7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AmberKiln().flatten7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio7() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberKiln().flatten7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin8() {
        assertEquals("below", new AmberKiln().hoist8(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin8() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.hoist8(2));
        assertEquals("upper-bound", subject.hoist8(9));
    }

    @Test
    void classifiesWithinAndAboveMargin8() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.hoist8(2 + 1));
        assertEquals("above", subject.hoist8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally9() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile9());
        }
        assertEquals(2, subject.quota9Count());
    }

    @Test
    void refusesOnceExhaustedTally9() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 2; i++) {
            subject.reconcile9();
        }
        assertFalse(subject.reconcile9());
    }

    @Test
    void accumulatesBelowTheCapSpan10() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.tally10(1));
        assertEquals(3, subject.tally10(2));
    }

    @Test
    void saturatesAtTheCapSpan10() {
        AmberKiln subject = new AmberKiln();
        subject.tally10(30);
        assertEquals(30, subject.tally10(5));
    }

    @Test
    void ignoresNegativeValuesSpan10() {
        AmberKiln subject = new AmberKiln();
        subject.tally10(3);
        assertEquals(3, subject.tally10(-2));
        assertEquals(3, subject.depth10Value());
    }

    @Test
    void rejectsZeroDenominatorOffset11() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.temper11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset11() {
        assertEquals(0.5, new AmberKiln().temper11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset11() {
        assertEquals(2.0, new AmberKiln().temper11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold12() {
        assertTrue(new AmberKiln().reconcile12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AmberKiln().reconcile12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold12() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberKiln().reconcile12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight13() {
        assertEquals("below", new AmberKiln().reconcile13(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight13() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.reconcile13(3));
        assertEquals("upper-bound", subject.reconcile13(8));
    }

    @Test
    void classifiesWithinAndAboveWeight13() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.reconcile13(3 + 1));
        assertEquals("above", subject.reconcile13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity14() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift14());
        }
        assertEquals(3, subject.drift14Count());
    }

    @Test
    void refusesOnceExhaustedCapacity14() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 3; i++) {
            subject.sift14();
        }
        assertFalse(subject.sift14());
    }

    @Test
    void accumulatesBelowTheCapRatio15() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.furl15(1));
        assertEquals(3, subject.furl15(2));
    }

    @Test
    void saturatesAtTheCapRatio15() {
        AmberKiln subject = new AmberKiln();
        subject.furl15(35);
        assertEquals(35, subject.furl15(5));
    }

    @Test
    void ignoresNegativeValuesRatio15() {
        AmberKiln subject = new AmberKiln();
        subject.furl15(3);
        assertEquals(3, subject.furl15(-2));
        assertEquals(3, subject.cadence15Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold16() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold16() {
        assertEquals(0.5, new AmberKiln().sift16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold16() {
        assertEquals(2.0, new AmberKiln().sift16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence17() {
        assertTrue(new AmberKiln().hoist17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AmberKiln().hoist17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence17() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberKiln().hoist17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset18() {
        assertEquals("below", new AmberKiln().sift18(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset18() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.sift18(4));
        assertEquals("upper-bound", subject.sift18(7));
    }

    @Test
    void classifiesWithinAndAboveOffset18() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.sift18(4 + 1));
        assertEquals("above", subject.sift18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota19() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle19());
        }
        assertEquals(4, subject.weight19Count());
    }

    @Test
    void refusesOnceExhaustedQuota19() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 4; i++) {
            subject.kindle19();
        }
        assertFalse(subject.kindle19());
    }

    @Test
    void accumulatesBelowTheCapSpan20() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.flatten20(1));
        assertEquals(3, subject.flatten20(2));
    }

    @Test
    void saturatesAtTheCapSpan20() {
        AmberKiln subject = new AmberKiln();
        subject.flatten20(40);
        assertEquals(40, subject.flatten20(5));
    }

    @Test
    void ignoresNegativeValuesSpan20() {
        AmberKiln subject = new AmberKiln();
        subject.flatten20(3);
        assertEquals(3, subject.flatten20(-2));
        assertEquals(3, subject.yield20Value());
    }

    @Test
    void rejectsZeroDenominatorMargin21() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin21() {
        assertEquals(0.5, new AmberKiln().hoist21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin21() {
        assertEquals(2.0, new AmberKiln().hoist21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally22() {
        assertTrue(new AmberKiln().collate22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new AmberKiln().collate22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally22() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberKiln().collate22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence23() {
        assertEquals("below", new AmberKiln().furl23(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence23() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.furl23(5));
        assertEquals("upper-bound", subject.furl23(12));
    }

    @Test
    void classifiesWithinAndAboveCadence23() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.furl23(5 + 1));
        assertEquals("above", subject.furl23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield24() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten24());
        }
        assertEquals(1, subject.tally24Count());
    }

    @Test
    void refusesOnceExhaustedYield24() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 1; i++) {
            subject.flatten24();
        }
        assertFalse(subject.flatten24());
    }

    @Test
    void accumulatesBelowTheCapWeight25() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.sift25(1));
        assertEquals(3, subject.sift25(2));
    }

    @Test
    void saturatesAtTheCapWeight25() {
        AmberKiln subject = new AmberKiln();
        subject.sift25(45);
        assertEquals(45, subject.sift25(5));
    }

    @Test
    void ignoresNegativeValuesWeight25() {
        AmberKiln subject = new AmberKiln();
        subject.sift25(3);
        assertEquals(3, subject.sift25(-2));
        assertEquals(3, subject.quota25Value());
    }

    @Test
    void rejectsZeroDenominatorCadence26() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence26() {
        assertEquals(0.5, new AmberKiln().winnow26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence26() {
        assertEquals(2.0, new AmberKiln().winnow26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold27() {
        assertTrue(new AmberKiln().temper27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new AmberKiln().temper27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold27() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberKiln().temper27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth28() {
        assertEquals("below", new AmberKiln().brace28(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth28() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.brace28(2));
        assertEquals("upper-bound", subject.brace28(11));
    }

    @Test
    void classifiesWithinAndAboveDepth28() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.brace28(2 + 1));
        assertEquals("above", subject.brace28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth29() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl29());
        }
        assertEquals(2, subject.offset29Count());
    }

    @Test
    void refusesOnceExhaustedDepth29() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 2; i++) {
            subject.furl29();
        }
        assertFalse(subject.furl29());
    }

    @Test
    void accumulatesBelowTheCapCapacity30() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.sift30(1));
        assertEquals(3, subject.sift30(2));
    }

    @Test
    void saturatesAtTheCapCapacity30() {
        AmberKiln subject = new AmberKiln();
        subject.sift30(50);
        assertEquals(50, subject.sift30(5));
    }

    @Test
    void ignoresNegativeValuesCapacity30() {
        AmberKiln subject = new AmberKiln();
        subject.sift30(3);
        assertEquals(3, subject.sift30(-2));
        assertEquals(3, subject.offset30Value());
    }

    @Test
    void rejectsZeroDenominatorMargin31() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin31() {
        assertEquals(0.5, new AmberKiln().prune31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin31() {
        assertEquals(2.0, new AmberKiln().prune31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift32() {
        assertTrue(new AmberKiln().temper32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new AmberKiln().temper32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift32() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberKiln().temper32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset33() {
        assertEquals("below", new AmberKiln().reconcile33(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset33() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.reconcile33(3));
        assertEquals("upper-bound", subject.reconcile33(10));
    }

    @Test
    void classifiesWithinAndAboveOffset33() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.reconcile33(3 + 1));
        assertEquals("above", subject.reconcile33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold34() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge34());
        }
        assertEquals(3, subject.quota34Count());
    }

    @Test
    void refusesOnceExhaustedThreshold34() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 3; i++) {
            subject.gauge34();
        }
        assertFalse(subject.gauge34());
    }

    @Test
    void accumulatesBelowTheCapYield35() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.kindle35(1));
        assertEquals(3, subject.kindle35(2));
    }

    @Test
    void saturatesAtTheCapYield35() {
        AmberKiln subject = new AmberKiln();
        subject.kindle35(55);
        assertEquals(55, subject.kindle35(5));
    }

    @Test
    void ignoresNegativeValuesYield35() {
        AmberKiln subject = new AmberKiln();
        subject.kindle35(3);
        assertEquals(3, subject.kindle35(-2));
        assertEquals(3, subject.weight35Value());
    }

    @Test
    void rejectsZeroDenominatorOffset36() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset36() {
        assertEquals(0.5, new AmberKiln().anneal36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset36() {
        assertEquals(2.0, new AmberKiln().anneal36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio37() {
        assertTrue(new AmberKiln().gauge37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new AmberKiln().gauge37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio37() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberKiln().gauge37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan38() {
        assertEquals("below", new AmberKiln().gauge38(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan38() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.gauge38(4));
        assertEquals("upper-bound", subject.gauge38(9));
    }

    @Test
    void classifiesWithinAndAboveSpan38() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.gauge38(4 + 1));
        assertEquals("above", subject.gauge38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity39() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift39());
        }
        assertEquals(4, subject.yield39Count());
    }

    @Test
    void refusesOnceExhaustedCapacity39() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 4; i++) {
            subject.sift39();
        }
        assertFalse(subject.sift39());
    }

    @Test
    void accumulatesBelowTheCapCapacity40() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.winnow40(1));
        assertEquals(3, subject.winnow40(2));
    }

    @Test
    void saturatesAtTheCapCapacity40() {
        AmberKiln subject = new AmberKiln();
        subject.winnow40(20);
        assertEquals(20, subject.winnow40(5));
    }

    @Test
    void ignoresNegativeValuesCapacity40() {
        AmberKiln subject = new AmberKiln();
        subject.winnow40(3);
        assertEquals(3, subject.winnow40(-2));
        assertEquals(3, subject.depth40Value());
    }

    @Test
    void rejectsZeroDenominatorYield41() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield41() {
        assertEquals(0.5, new AmberKiln().anneal41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield41() {
        assertEquals(2.0, new AmberKiln().anneal41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan42() {
        assertTrue(new AmberKiln().reconcile42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new AmberKiln().reconcile42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan42() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberKiln().reconcile42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold43() {
        assertEquals("below", new AmberKiln().kindle43(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold43() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.kindle43(5));
        assertEquals("upper-bound", subject.kindle43(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold43() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.kindle43(5 + 1));
        assertEquals("above", subject.kindle43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota44() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper44());
        }
        assertEquals(1, subject.threshold44Count());
    }

    @Test
    void refusesOnceExhaustedQuota44() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 1; i++) {
            subject.temper44();
        }
        assertFalse(subject.temper44());
    }

    @Test
    void accumulatesBelowTheCapThreshold45() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.tally45(1));
        assertEquals(3, subject.tally45(2));
    }

    @Test
    void saturatesAtTheCapThreshold45() {
        AmberKiln subject = new AmberKiln();
        subject.tally45(25);
        assertEquals(25, subject.tally45(5));
    }

    @Test
    void ignoresNegativeValuesThreshold45() {
        AmberKiln subject = new AmberKiln();
        subject.tally45(3);
        assertEquals(3, subject.tally45(-2));
        assertEquals(3, subject.bias45Value());
    }

    @Test
    void rejectsZeroDenominatorQuota46() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota46() {
        assertEquals(0.5, new AmberKiln().tally46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota46() {
        assertEquals(2.0, new AmberKiln().tally46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth47() {
        assertTrue(new AmberKiln().furl47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AmberKiln().furl47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth47() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberKiln().furl47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity48() {
        assertEquals("below", new AmberKiln().brace48(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity48() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.brace48(2));
        assertEquals("upper-bound", subject.brace48(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity48() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.brace48(2 + 1));
        assertEquals("above", subject.brace48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold49() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal49());
        }
        assertEquals(2, subject.offset49Count());
    }

    @Test
    void refusesOnceExhaustedThreshold49() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 2; i++) {
            subject.anneal49();
        }
        assertFalse(subject.anneal49());
    }

    @Test
    void accumulatesBelowTheCapTally50() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.sift50(1));
        assertEquals(3, subject.sift50(2));
    }

    @Test
    void saturatesAtTheCapTally50() {
        AmberKiln subject = new AmberKiln();
        subject.sift50(30);
        assertEquals(30, subject.sift50(5));
    }

    @Test
    void ignoresNegativeValuesTally50() {
        AmberKiln subject = new AmberKiln();
        subject.sift50(3);
        assertEquals(3, subject.sift50(-2));
        assertEquals(3, subject.margin50Value());
    }

    @Test
    void rejectsZeroDenominatorRatio51() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio51() {
        assertEquals(0.5, new AmberKiln().winnow51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio51() {
        assertEquals(2.0, new AmberKiln().winnow51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold52() {
        assertTrue(new AmberKiln().tally52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AmberKiln().tally52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold52() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberKiln().tally52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset53() {
        assertEquals("below", new AmberKiln().tally53(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset53() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.tally53(3));
        assertEquals("upper-bound", subject.tally53(12));
    }

    @Test
    void classifiesWithinAndAboveOffset53() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.tally53(3 + 1));
        assertEquals("above", subject.tally53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight54() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal54());
        }
        assertEquals(3, subject.depth54Count());
    }

    @Test
    void refusesOnceExhaustedWeight54() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 3; i++) {
            subject.anneal54();
        }
        assertFalse(subject.anneal54());
    }

    @Test
    void accumulatesBelowTheCapCapacity55() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.gauge55(1));
        assertEquals(3, subject.gauge55(2));
    }

    @Test
    void saturatesAtTheCapCapacity55() {
        AmberKiln subject = new AmberKiln();
        subject.gauge55(35);
        assertEquals(35, subject.gauge55(5));
    }

    @Test
    void ignoresNegativeValuesCapacity55() {
        AmberKiln subject = new AmberKiln();
        subject.gauge55(3);
        assertEquals(3, subject.gauge55(-2));
        assertEquals(3, subject.cadence55Value());
    }

    @Test
    void rejectsZeroDenominatorRatio56() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.furl56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio56() {
        assertEquals(0.5, new AmberKiln().furl56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio56() {
        assertEquals(2.0, new AmberKiln().furl56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio57() {
        assertTrue(new AmberKiln().temper57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AmberKiln().temper57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio57() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberKiln().temper57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally58() {
        assertEquals("below", new AmberKiln().kindle58(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally58() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.kindle58(4));
        assertEquals("upper-bound", subject.kindle58(11));
    }

    @Test
    void classifiesWithinAndAboveTally58() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.kindle58(4 + 1));
        assertEquals("above", subject.kindle58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset59() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune59());
        }
        assertEquals(4, subject.cadence59Count());
    }

    @Test
    void refusesOnceExhaustedOffset59() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 4; i++) {
            subject.prune59();
        }
        assertFalse(subject.prune59());
    }

    @Test
    void accumulatesBelowTheCapYield60() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.tally60(1));
        assertEquals(3, subject.tally60(2));
    }

    @Test
    void saturatesAtTheCapYield60() {
        AmberKiln subject = new AmberKiln();
        subject.tally60(40);
        assertEquals(40, subject.tally60(5));
    }

    @Test
    void ignoresNegativeValuesYield60() {
        AmberKiln subject = new AmberKiln();
        subject.tally60(3);
        assertEquals(3, subject.tally60(-2));
        assertEquals(3, subject.tally60Value());
    }

    @Test
    void rejectsZeroDenominatorRatio61() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.reconcile61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio61() {
        assertEquals(0.5, new AmberKiln().reconcile61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio61() {
        assertEquals(2.0, new AmberKiln().reconcile61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan62() {
        assertTrue(new AmberKiln().tally62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AmberKiln().tally62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan62() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberKiln().tally62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold63() {
        assertEquals("below", new AmberKiln().tally63(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold63() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.tally63(5));
        assertEquals("upper-bound", subject.tally63(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold63() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.tally63(5 + 1));
        assertEquals("above", subject.tally63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias64() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper64());
        }
        assertEquals(1, subject.quota64Count());
    }

    @Test
    void refusesOnceExhaustedBias64() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 1; i++) {
            subject.temper64();
        }
        assertFalse(subject.temper64());
    }

    @Test
    void accumulatesBelowTheCapDrift65() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.collate65(1));
        assertEquals(3, subject.collate65(2));
    }

    @Test
    void saturatesAtTheCapDrift65() {
        AmberKiln subject = new AmberKiln();
        subject.collate65(45);
        assertEquals(45, subject.collate65(5));
    }

    @Test
    void ignoresNegativeValuesDrift65() {
        AmberKiln subject = new AmberKiln();
        subject.collate65(3);
        assertEquals(3, subject.collate65(-2));
        assertEquals(3, subject.weight65Value());
    }

    @Test
    void rejectsZeroDenominatorQuota66() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.reconcile66(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota66() {
        assertEquals(0.5, new AmberKiln().reconcile66(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota66() {
        assertEquals(2.0, new AmberKiln().reconcile66(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity67() {
        assertTrue(new AmberKiln().temper67(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity67() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new AmberKiln().temper67(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity67() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberKiln().temper67(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth68() {
        assertEquals("below", new AmberKiln().collate68(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth68() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.collate68(2));
        assertEquals("upper-bound", subject.collate68(9));
    }

    @Test
    void classifiesWithinAndAboveDepth68() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.collate68(2 + 1));
        assertEquals("above", subject.collate68(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold69() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper69());
        }
        assertEquals(2, subject.span69Count());
    }

    @Test
    void refusesOnceExhaustedThreshold69() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 2; i++) {
            subject.temper69();
        }
        assertFalse(subject.temper69());
    }

    @Test
    void accumulatesBelowTheCapBias70() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.gauge70(1));
        assertEquals(3, subject.gauge70(2));
    }

    @Test
    void saturatesAtTheCapBias70() {
        AmberKiln subject = new AmberKiln();
        subject.gauge70(50);
        assertEquals(50, subject.gauge70(5));
    }

    @Test
    void ignoresNegativeValuesBias70() {
        AmberKiln subject = new AmberKiln();
        subject.gauge70(3);
        assertEquals(3, subject.gauge70(-2));
        assertEquals(3, subject.threshold70Value());
    }

    @Test
    void rejectsZeroDenominatorYield71() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune71(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield71() {
        assertEquals(0.5, new AmberKiln().prune71(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield71() {
        assertEquals(2.0, new AmberKiln().prune71(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift72() {
        assertTrue(new AmberKiln().sift72(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift72() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new AmberKiln().sift72(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift72() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberKiln().sift72(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity73() {
        assertEquals("below", new AmberKiln().anneal73(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity73() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.anneal73(3));
        assertEquals("upper-bound", subject.anneal73(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity73() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.anneal73(3 + 1));
        assertEquals("above", subject.anneal73(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity74() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally74());
        }
        assertEquals(3, subject.weight74Count());
    }

    @Test
    void refusesOnceExhaustedCapacity74() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 3; i++) {
            subject.tally74();
        }
        assertFalse(subject.tally74());
    }

    @Test
    void accumulatesBelowTheCapQuota75() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.anneal75(1));
        assertEquals(3, subject.anneal75(2));
    }

    @Test
    void saturatesAtTheCapQuota75() {
        AmberKiln subject = new AmberKiln();
        subject.anneal75(55);
        assertEquals(55, subject.anneal75(5));
    }

    @Test
    void ignoresNegativeValuesQuota75() {
        AmberKiln subject = new AmberKiln();
        subject.anneal75(3);
        assertEquals(3, subject.anneal75(-2));
        assertEquals(3, subject.drift75Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity76() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally76(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity76() {
        assertEquals(0.5, new AmberKiln().tally76(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity76() {
        assertEquals(2.0, new AmberKiln().tally76(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally77() {
        assertTrue(new AmberKiln().flatten77(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally77() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new AmberKiln().flatten77(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally77() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberKiln().flatten77(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias78() {
        assertEquals("below", new AmberKiln().furl78(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias78() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.furl78(4));
        assertEquals("upper-bound", subject.furl78(7));
    }

    @Test
    void classifiesWithinAndAboveBias78() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.furl78(4 + 1));
        assertEquals("above", subject.furl78(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift79() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally79());
        }
        assertEquals(4, subject.ratio79Count());
    }

    @Test
    void refusesOnceExhaustedDrift79() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 4; i++) {
            subject.tally79();
        }
        assertFalse(subject.tally79());
    }

    @Test
    void accumulatesBelowTheCapThreshold80() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.collate80(1));
        assertEquals(3, subject.collate80(2));
    }

    @Test
    void saturatesAtTheCapThreshold80() {
        AmberKiln subject = new AmberKiln();
        subject.collate80(20);
        assertEquals(20, subject.collate80(5));
    }

    @Test
    void ignoresNegativeValuesThreshold80() {
        AmberKiln subject = new AmberKiln();
        subject.collate80(3);
        assertEquals(3, subject.collate80(-2));
        assertEquals(3, subject.ratio80Value());
    }

    @Test
    void rejectsZeroDenominatorBias81() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.flatten81(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias81() {
        assertEquals(0.5, new AmberKiln().flatten81(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias81() {
        assertEquals(2.0, new AmberKiln().flatten81(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset82() {
        assertTrue(new AmberKiln().anneal82(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset82() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new AmberKiln().anneal82(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset82() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberKiln().anneal82(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity83() {
        assertEquals("below", new AmberKiln().hoist83(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity83() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.hoist83(5));
        assertEquals("upper-bound", subject.hoist83(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity83() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.hoist83(5 + 1));
        assertEquals("above", subject.hoist83(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset84() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow84());
        }
        assertEquals(1, subject.margin84Count());
    }

    @Test
    void refusesOnceExhaustedOffset84() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 1; i++) {
            subject.winnow84();
        }
        assertFalse(subject.winnow84());
    }

    @Test
    void accumulatesBelowTheCapWeight85() {
        AmberKiln subject = new AmberKiln();
        assertEquals(1, subject.hoist85(1));
        assertEquals(3, subject.hoist85(2));
    }

    @Test
    void saturatesAtTheCapWeight85() {
        AmberKiln subject = new AmberKiln();
        subject.hoist85(25);
        assertEquals(25, subject.hoist85(5));
    }

    @Test
    void ignoresNegativeValuesWeight85() {
        AmberKiln subject = new AmberKiln();
        subject.hoist85(3);
        assertEquals(3, subject.hoist85(-2));
        assertEquals(3, subject.threshold85Value());
    }

    @Test
    void rejectsZeroDenominatorMargin86() {
        AmberKiln subject = new AmberKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal86(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin86() {
        assertEquals(0.5, new AmberKiln().anneal86(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin86() {
        assertEquals(2.0, new AmberKiln().anneal86(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence87() {
        assertTrue(new AmberKiln().hoist87(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence87() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new AmberKiln().hoist87(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence87() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberKiln().hoist87(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield88() {
        assertEquals("below", new AmberKiln().temper88(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield88() {
        AmberKiln subject = new AmberKiln();
        assertEquals("lower-bound", subject.temper88(2));
        assertEquals("upper-bound", subject.temper88(11));
    }

    @Test
    void classifiesWithinAndAboveYield88() {
        AmberKiln subject = new AmberKiln();
        assertEquals("within", subject.temper88(2 + 1));
        assertEquals("above", subject.temper88(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield89() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl89());
        }
        assertEquals(2, subject.quota89Count());
    }

    @Test
    void refusesOnceExhaustedYield89() {
        AmberKiln subject = new AmberKiln();
        for (int i = 0; i < 2; i++) {
            subject.furl89();
        }
        assertFalse(subject.furl89());
    }
}
