package com.northward.rampart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleTrellisTest {

    @Test
    void accumulatesBelowTheCapCadence0() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals(1, subject.tally0(1));
        assertEquals(3, subject.tally0(2));
    }

    @Test
    void saturatesAtTheCapCadence0() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.tally0(20);
        assertEquals(20, subject.tally0(5));
    }

    @Test
    void ignoresNegativeValuesCadence0() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.tally0(3);
        assertEquals(3, subject.tally0(-2));
        assertEquals(3, subject.capacity0Value());
    }

    @Test
    void rejectsZeroDenominatorMargin1() {
        BrambleTrellis subject = new BrambleTrellis();
        assertThrows(ArithmeticException.class, () -> subject.sift1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin1() {
        assertEquals(0.5, new BrambleTrellis().sift1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin1() {
        assertEquals(2.0, new BrambleTrellis().sift1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold2() {
        assertTrue(new BrambleTrellis().temper2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new BrambleTrellis().temper2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold2() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleTrellis().temper2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset3() {
        assertEquals("below", new BrambleTrellis().temper3(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset3() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("lower-bound", subject.temper3(5));
        assertEquals("upper-bound", subject.temper3(10));
    }

    @Test
    void classifiesWithinAndAboveOffset3() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("within", subject.temper3(5 + 1));
        assertEquals("above", subject.temper3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset4() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper4());
        }
        assertEquals(1, subject.cadence4Count());
    }

    @Test
    void refusesOnceExhaustedOffset4() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 1; i++) {
            subject.temper4();
        }
        assertFalse(subject.temper4());
    }

    @Test
    void accumulatesBelowTheCapOffset5() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals(1, subject.collate5(1));
        assertEquals(3, subject.collate5(2));
    }

    @Test
    void saturatesAtTheCapOffset5() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.collate5(25);
        assertEquals(25, subject.collate5(5));
    }

    @Test
    void ignoresNegativeValuesOffset5() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.collate5(3);
        assertEquals(3, subject.collate5(-2));
        assertEquals(3, subject.margin5Value());
    }

    @Test
    void rejectsZeroDenominatorWeight6() {
        BrambleTrellis subject = new BrambleTrellis();
        assertThrows(ArithmeticException.class, () -> subject.temper6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight6() {
        assertEquals(0.5, new BrambleTrellis().temper6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight6() {
        assertEquals(2.0, new BrambleTrellis().temper6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias7() {
        assertTrue(new BrambleTrellis().kindle7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new BrambleTrellis().kindle7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias7() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleTrellis().kindle7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth8() {
        assertEquals("below", new BrambleTrellis().anneal8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth8() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("lower-bound", subject.anneal8(2));
        assertEquals("upper-bound", subject.anneal8(9));
    }

    @Test
    void classifiesWithinAndAboveDepth8() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("within", subject.anneal8(2 + 1));
        assertEquals("above", subject.anneal8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan9() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist9());
        }
        assertEquals(2, subject.yield9Count());
    }

    @Test
    void refusesOnceExhaustedSpan9() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 2; i++) {
            subject.hoist9();
        }
        assertFalse(subject.hoist9());
    }

    @Test
    void accumulatesBelowTheCapDepth10() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals(1, subject.prune10(1));
        assertEquals(3, subject.prune10(2));
    }

    @Test
    void saturatesAtTheCapDepth10() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.prune10(30);
        assertEquals(30, subject.prune10(5));
    }

    @Test
    void ignoresNegativeValuesDepth10() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.prune10(3);
        assertEquals(3, subject.prune10(-2));
        assertEquals(3, subject.ratio10Value());
    }

    @Test
    void rejectsZeroDenominatorYield11() {
        BrambleTrellis subject = new BrambleTrellis();
        assertThrows(ArithmeticException.class, () -> subject.sift11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield11() {
        assertEquals(0.5, new BrambleTrellis().sift11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield11() {
        assertEquals(2.0, new BrambleTrellis().sift11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio12() {
        assertTrue(new BrambleTrellis().brace12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new BrambleTrellis().brace12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio12() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleTrellis().brace12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight13() {
        assertEquals("below", new BrambleTrellis().anneal13(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight13() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("lower-bound", subject.anneal13(3));
        assertEquals("upper-bound", subject.anneal13(8));
    }

    @Test
    void classifiesWithinAndAboveWeight13() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("within", subject.anneal13(3 + 1));
        assertEquals("above", subject.anneal13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift14() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift14());
        }
        assertEquals(3, subject.offset14Count());
    }

    @Test
    void refusesOnceExhaustedDrift14() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 3; i++) {
            subject.sift14();
        }
        assertFalse(subject.sift14());
    }

    @Test
    void accumulatesBelowTheCapTally15() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals(1, subject.gauge15(1));
        assertEquals(3, subject.gauge15(2));
    }

    @Test
    void saturatesAtTheCapTally15() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.gauge15(35);
        assertEquals(35, subject.gauge15(5));
    }

    @Test
    void ignoresNegativeValuesTally15() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.gauge15(3);
        assertEquals(3, subject.gauge15(-2));
        assertEquals(3, subject.weight15Value());
    }

    @Test
    void rejectsZeroDenominatorQuota16() {
        BrambleTrellis subject = new BrambleTrellis();
        assertThrows(ArithmeticException.class, () -> subject.brace16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota16() {
        assertEquals(0.5, new BrambleTrellis().brace16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota16() {
        assertEquals(2.0, new BrambleTrellis().brace16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota17() {
        assertTrue(new BrambleTrellis().sift17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new BrambleTrellis().sift17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota17() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleTrellis().sift17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias18() {
        assertEquals("below", new BrambleTrellis().reconcile18(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias18() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("lower-bound", subject.reconcile18(4));
        assertEquals("upper-bound", subject.reconcile18(7));
    }

    @Test
    void classifiesWithinAndAboveBias18() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("within", subject.reconcile18(4 + 1));
        assertEquals("above", subject.reconcile18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan19() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal19());
        }
        assertEquals(4, subject.margin19Count());
    }

    @Test
    void refusesOnceExhaustedSpan19() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 4; i++) {
            subject.anneal19();
        }
        assertFalse(subject.anneal19());
    }

    @Test
    void accumulatesBelowTheCapRatio20() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals(1, subject.kindle20(1));
        assertEquals(3, subject.kindle20(2));
    }

    @Test
    void saturatesAtTheCapRatio20() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.kindle20(40);
        assertEquals(40, subject.kindle20(5));
    }

    @Test
    void ignoresNegativeValuesRatio20() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.kindle20(3);
        assertEquals(3, subject.kindle20(-2));
        assertEquals(3, subject.tally20Value());
    }

    @Test
    void rejectsZeroDenominatorDrift21() {
        BrambleTrellis subject = new BrambleTrellis();
        assertThrows(ArithmeticException.class, () -> subject.anneal21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift21() {
        assertEquals(0.5, new BrambleTrellis().anneal21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift21() {
        assertEquals(2.0, new BrambleTrellis().anneal21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth22() {
        assertTrue(new BrambleTrellis().gauge22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new BrambleTrellis().gauge22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth22() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleTrellis().gauge22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota23() {
        assertEquals("below", new BrambleTrellis().flatten23(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota23() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("lower-bound", subject.flatten23(5));
        assertEquals("upper-bound", subject.flatten23(12));
    }

    @Test
    void classifiesWithinAndAboveQuota23() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("within", subject.flatten23(5 + 1));
        assertEquals("above", subject.flatten23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio24() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal24());
        }
        assertEquals(1, subject.drift24Count());
    }

    @Test
    void refusesOnceExhaustedRatio24() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 1; i++) {
            subject.anneal24();
        }
        assertFalse(subject.anneal24());
    }

    @Test
    void accumulatesBelowTheCapSpan25() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals(1, subject.hoist25(1));
        assertEquals(3, subject.hoist25(2));
    }

    @Test
    void saturatesAtTheCapSpan25() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.hoist25(45);
        assertEquals(45, subject.hoist25(5));
    }

    @Test
    void ignoresNegativeValuesSpan25() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.hoist25(3);
        assertEquals(3, subject.hoist25(-2));
        assertEquals(3, subject.cadence25Value());
    }

    @Test
    void rejectsZeroDenominatorMargin26() {
        BrambleTrellis subject = new BrambleTrellis();
        assertThrows(ArithmeticException.class, () -> subject.brace26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin26() {
        assertEquals(0.5, new BrambleTrellis().brace26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin26() {
        assertEquals(2.0, new BrambleTrellis().brace26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin27() {
        assertTrue(new BrambleTrellis().tally27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new BrambleTrellis().tally27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin27() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleTrellis().tally27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally28() {
        assertEquals("below", new BrambleTrellis().tally28(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally28() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("lower-bound", subject.tally28(2));
        assertEquals("upper-bound", subject.tally28(11));
    }

    @Test
    void classifiesWithinAndAboveTally28() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("within", subject.tally28(2 + 1));
        assertEquals("above", subject.tally28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield29() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune29());
        }
        assertEquals(2, subject.quota29Count());
    }

    @Test
    void refusesOnceExhaustedYield29() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 2; i++) {
            subject.prune29();
        }
        assertFalse(subject.prune29());
    }

    @Test
    void accumulatesBelowTheCapThreshold30() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals(1, subject.gauge30(1));
        assertEquals(3, subject.gauge30(2));
    }

    @Test
    void saturatesAtTheCapThreshold30() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.gauge30(50);
        assertEquals(50, subject.gauge30(5));
    }

    @Test
    void ignoresNegativeValuesThreshold30() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.gauge30(3);
        assertEquals(3, subject.gauge30(-2));
        assertEquals(3, subject.capacity30Value());
    }

    @Test
    void rejectsZeroDenominatorQuota31() {
        BrambleTrellis subject = new BrambleTrellis();
        assertThrows(ArithmeticException.class, () -> subject.hoist31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota31() {
        assertEquals(0.5, new BrambleTrellis().hoist31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota31() {
        assertEquals(2.0, new BrambleTrellis().hoist31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin32() {
        assertTrue(new BrambleTrellis().kindle32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new BrambleTrellis().kindle32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin32() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleTrellis().kindle32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift33() {
        assertEquals("below", new BrambleTrellis().brace33(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift33() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("lower-bound", subject.brace33(3));
        assertEquals("upper-bound", subject.brace33(10));
    }

    @Test
    void classifiesWithinAndAboveDrift33() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("within", subject.brace33(3 + 1));
        assertEquals("above", subject.brace33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight34() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge34());
        }
        assertEquals(3, subject.cadence34Count());
    }

    @Test
    void refusesOnceExhaustedWeight34() {
        BrambleTrellis subject = new BrambleTrellis();
        for (int i = 0; i < 3; i++) {
            subject.gauge34();
        }
        assertFalse(subject.gauge34());
    }

    @Test
    void accumulatesBelowTheCapTally35() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals(1, subject.brace35(1));
        assertEquals(3, subject.brace35(2));
    }

    @Test
    void saturatesAtTheCapTally35() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.brace35(55);
        assertEquals(55, subject.brace35(5));
    }

    @Test
    void ignoresNegativeValuesTally35() {
        BrambleTrellis subject = new BrambleTrellis();
        subject.brace35(3);
        assertEquals(3, subject.brace35(-2));
        assertEquals(3, subject.threshold35Value());
    }

    @Test
    void rejectsZeroDenominatorQuota36() {
        BrambleTrellis subject = new BrambleTrellis();
        assertThrows(ArithmeticException.class, () -> subject.winnow36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota36() {
        assertEquals(0.5, new BrambleTrellis().winnow36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota36() {
        assertEquals(2.0, new BrambleTrellis().winnow36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold37() {
        assertTrue(new BrambleTrellis().temper37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new BrambleTrellis().temper37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold37() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleTrellis().temper37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift38() {
        assertEquals("below", new BrambleTrellis().sift38(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift38() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("lower-bound", subject.sift38(4));
        assertEquals("upper-bound", subject.sift38(9));
    }

    @Test
    void classifiesWithinAndAboveDrift38() {
        BrambleTrellis subject = new BrambleTrellis();
        assertEquals("within", subject.sift38(4 + 1));
        assertEquals("above", subject.sift38(9 + 1));
    }
}
