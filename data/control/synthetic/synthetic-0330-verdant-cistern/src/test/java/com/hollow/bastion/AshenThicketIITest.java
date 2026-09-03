package com.hollow.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenThicketIITest {

    @Test
    void accumulatesBelowTheCapMargin0() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals(1, subject.collate0(1));
        assertEquals(3, subject.collate0(2));
    }

    @Test
    void saturatesAtTheCapMargin0() {
        AshenThicketII subject = new AshenThicketII();
        subject.collate0(20);
        assertEquals(20, subject.collate0(5));
    }

    @Test
    void ignoresNegativeValuesMargin0() {
        AshenThicketII subject = new AshenThicketII();
        subject.collate0(3);
        assertEquals(3, subject.collate0(-2));
        assertEquals(3, subject.threshold0Value());
    }

    @Test
    void rejectsZeroDenominatorSpan1() {
        AshenThicketII subject = new AshenThicketII();
        assertThrows(ArithmeticException.class, () -> subject.hoist1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan1() {
        assertEquals(0.5, new AshenThicketII().hoist1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan1() {
        assertEquals(2.0, new AshenThicketII().hoist1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity2() {
        assertTrue(new AshenThicketII().brace2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AshenThicketII().brace2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity2() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenThicketII().brace2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift3() {
        assertEquals("below", new AshenThicketII().prune3(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift3() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("lower-bound", subject.prune3(5));
        assertEquals("upper-bound", subject.prune3(10));
    }

    @Test
    void classifiesWithinAndAboveDrift3() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("within", subject.prune3(5 + 1));
        assertEquals("above", subject.prune3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally4() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace4());
        }
        assertEquals(1, subject.cadence4Count());
    }

    @Test
    void refusesOnceExhaustedTally4() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 1; i++) {
            subject.brace4();
        }
        assertFalse(subject.brace4());
    }

    @Test
    void accumulatesBelowTheCapWeight5() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals(1, subject.tally5(1));
        assertEquals(3, subject.tally5(2));
    }

    @Test
    void saturatesAtTheCapWeight5() {
        AshenThicketII subject = new AshenThicketII();
        subject.tally5(25);
        assertEquals(25, subject.tally5(5));
    }

    @Test
    void ignoresNegativeValuesWeight5() {
        AshenThicketII subject = new AshenThicketII();
        subject.tally5(3);
        assertEquals(3, subject.tally5(-2));
        assertEquals(3, subject.offset5Value());
    }

    @Test
    void rejectsZeroDenominatorBias6() {
        AshenThicketII subject = new AshenThicketII();
        assertThrows(ArithmeticException.class, () -> subject.brace6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias6() {
        assertEquals(0.5, new AshenThicketII().brace6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias6() {
        assertEquals(2.0, new AshenThicketII().brace6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity7() {
        assertTrue(new AshenThicketII().temper7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AshenThicketII().temper7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity7() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenThicketII().temper7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias8() {
        assertEquals("below", new AshenThicketII().brace8(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias8() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("lower-bound", subject.brace8(2));
        assertEquals("upper-bound", subject.brace8(9));
    }

    @Test
    void classifiesWithinAndAboveBias8() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("within", subject.brace8(2 + 1));
        assertEquals("above", subject.brace8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias9() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace9());
        }
        assertEquals(2, subject.depth9Count());
    }

    @Test
    void refusesOnceExhaustedBias9() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 2; i++) {
            subject.brace9();
        }
        assertFalse(subject.brace9());
    }

    @Test
    void accumulatesBelowTheCapMargin10() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals(1, subject.temper10(1));
        assertEquals(3, subject.temper10(2));
    }

    @Test
    void saturatesAtTheCapMargin10() {
        AshenThicketII subject = new AshenThicketII();
        subject.temper10(30);
        assertEquals(30, subject.temper10(5));
    }

    @Test
    void ignoresNegativeValuesMargin10() {
        AshenThicketII subject = new AshenThicketII();
        subject.temper10(3);
        assertEquals(3, subject.temper10(-2));
        assertEquals(3, subject.yield10Value());
    }

    @Test
    void rejectsZeroDenominatorOffset11() {
        AshenThicketII subject = new AshenThicketII();
        assertThrows(ArithmeticException.class, () -> subject.tally11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset11() {
        assertEquals(0.5, new AshenThicketII().tally11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset11() {
        assertEquals(2.0, new AshenThicketII().tally11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota12() {
        assertTrue(new AshenThicketII().anneal12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AshenThicketII().anneal12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota12() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenThicketII().anneal12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset13() {
        assertEquals("below", new AshenThicketII().reconcile13(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset13() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("lower-bound", subject.reconcile13(3));
        assertEquals("upper-bound", subject.reconcile13(8));
    }

    @Test
    void classifiesWithinAndAboveOffset13() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("within", subject.reconcile13(3 + 1));
        assertEquals("above", subject.reconcile13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio14() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal14());
        }
        assertEquals(3, subject.offset14Count());
    }

    @Test
    void refusesOnceExhaustedRatio14() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 3; i++) {
            subject.anneal14();
        }
        assertFalse(subject.anneal14());
    }

    @Test
    void accumulatesBelowTheCapDepth15() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals(1, subject.sift15(1));
        assertEquals(3, subject.sift15(2));
    }

    @Test
    void saturatesAtTheCapDepth15() {
        AshenThicketII subject = new AshenThicketII();
        subject.sift15(35);
        assertEquals(35, subject.sift15(5));
    }

    @Test
    void ignoresNegativeValuesDepth15() {
        AshenThicketII subject = new AshenThicketII();
        subject.sift15(3);
        assertEquals(3, subject.sift15(-2));
        assertEquals(3, subject.weight15Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity16() {
        AshenThicketII subject = new AshenThicketII();
        assertThrows(ArithmeticException.class, () -> subject.furl16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity16() {
        assertEquals(0.5, new AshenThicketII().furl16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity16() {
        assertEquals(2.0, new AshenThicketII().furl16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset17() {
        assertTrue(new AshenThicketII().winnow17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AshenThicketII().winnow17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset17() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenThicketII().winnow17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight18() {
        assertEquals("below", new AshenThicketII().kindle18(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight18() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("lower-bound", subject.kindle18(4));
        assertEquals("upper-bound", subject.kindle18(7));
    }

    @Test
    void classifiesWithinAndAboveWeight18() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("within", subject.kindle18(4 + 1));
        assertEquals("above", subject.kindle18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin19() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist19());
        }
        assertEquals(4, subject.drift19Count());
    }

    @Test
    void refusesOnceExhaustedMargin19() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 4; i++) {
            subject.hoist19();
        }
        assertFalse(subject.hoist19());
    }

    @Test
    void accumulatesBelowTheCapCadence20() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals(1, subject.winnow20(1));
        assertEquals(3, subject.winnow20(2));
    }

    @Test
    void saturatesAtTheCapCadence20() {
        AshenThicketII subject = new AshenThicketII();
        subject.winnow20(40);
        assertEquals(40, subject.winnow20(5));
    }

    @Test
    void ignoresNegativeValuesCadence20() {
        AshenThicketII subject = new AshenThicketII();
        subject.winnow20(3);
        assertEquals(3, subject.winnow20(-2));
        assertEquals(3, subject.depth20Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold21() {
        AshenThicketII subject = new AshenThicketII();
        assertThrows(ArithmeticException.class, () -> subject.anneal21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold21() {
        assertEquals(0.5, new AshenThicketII().anneal21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold21() {
        assertEquals(2.0, new AshenThicketII().anneal21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence22() {
        assertTrue(new AshenThicketII().winnow22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new AshenThicketII().winnow22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence22() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenThicketII().winnow22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift23() {
        assertEquals("below", new AshenThicketII().furl23(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift23() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("lower-bound", subject.furl23(5));
        assertEquals("upper-bound", subject.furl23(12));
    }

    @Test
    void classifiesWithinAndAboveDrift23() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("within", subject.furl23(5 + 1));
        assertEquals("above", subject.furl23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield24() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper24());
        }
        assertEquals(1, subject.threshold24Count());
    }

    @Test
    void refusesOnceExhaustedYield24() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 1; i++) {
            subject.temper24();
        }
        assertFalse(subject.temper24());
    }

    @Test
    void accumulatesBelowTheCapDepth25() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals(1, subject.kindle25(1));
        assertEquals(3, subject.kindle25(2));
    }

    @Test
    void saturatesAtTheCapDepth25() {
        AshenThicketII subject = new AshenThicketII();
        subject.kindle25(45);
        assertEquals(45, subject.kindle25(5));
    }

    @Test
    void ignoresNegativeValuesDepth25() {
        AshenThicketII subject = new AshenThicketII();
        subject.kindle25(3);
        assertEquals(3, subject.kindle25(-2));
        assertEquals(3, subject.margin25Value());
    }

    @Test
    void rejectsZeroDenominatorDrift26() {
        AshenThicketII subject = new AshenThicketII();
        assertThrows(ArithmeticException.class, () -> subject.tally26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift26() {
        assertEquals(0.5, new AshenThicketII().tally26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift26() {
        assertEquals(2.0, new AshenThicketII().tally26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio27() {
        assertTrue(new AshenThicketII().flatten27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new AshenThicketII().flatten27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio27() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenThicketII().flatten27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset28() {
        assertEquals("below", new AshenThicketII().reconcile28(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset28() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("lower-bound", subject.reconcile28(2));
        assertEquals("upper-bound", subject.reconcile28(11));
    }

    @Test
    void classifiesWithinAndAboveOffset28() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("within", subject.reconcile28(2 + 1));
        assertEquals("above", subject.reconcile28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth29() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl29());
        }
        assertEquals(2, subject.span29Count());
    }

    @Test
    void refusesOnceExhaustedDepth29() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 2; i++) {
            subject.furl29();
        }
        assertFalse(subject.furl29());
    }

    @Test
    void accumulatesBelowTheCapDepth30() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals(1, subject.winnow30(1));
        assertEquals(3, subject.winnow30(2));
    }

    @Test
    void saturatesAtTheCapDepth30() {
        AshenThicketII subject = new AshenThicketII();
        subject.winnow30(50);
        assertEquals(50, subject.winnow30(5));
    }

    @Test
    void ignoresNegativeValuesDepth30() {
        AshenThicketII subject = new AshenThicketII();
        subject.winnow30(3);
        assertEquals(3, subject.winnow30(-2));
        assertEquals(3, subject.quota30Value());
    }

    @Test
    void rejectsZeroDenominatorOffset31() {
        AshenThicketII subject = new AshenThicketII();
        assertThrows(ArithmeticException.class, () -> subject.anneal31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset31() {
        assertEquals(0.5, new AshenThicketII().anneal31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset31() {
        assertEquals(2.0, new AshenThicketII().anneal31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield32() {
        assertTrue(new AshenThicketII().reconcile32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new AshenThicketII().reconcile32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield32() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenThicketII().reconcile32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota33() {
        assertEquals("below", new AshenThicketII().tally33(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota33() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("lower-bound", subject.tally33(3));
        assertEquals("upper-bound", subject.tally33(10));
    }

    @Test
    void classifiesWithinAndAboveQuota33() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("within", subject.tally33(3 + 1));
        assertEquals("above", subject.tally33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence34() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper34());
        }
        assertEquals(3, subject.capacity34Count());
    }

    @Test
    void refusesOnceExhaustedCadence34() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 3; i++) {
            subject.temper34();
        }
        assertFalse(subject.temper34());
    }

    @Test
    void accumulatesBelowTheCapDrift35() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals(1, subject.prune35(1));
        assertEquals(3, subject.prune35(2));
    }

    @Test
    void saturatesAtTheCapDrift35() {
        AshenThicketII subject = new AshenThicketII();
        subject.prune35(55);
        assertEquals(55, subject.prune35(5));
    }

    @Test
    void ignoresNegativeValuesDrift35() {
        AshenThicketII subject = new AshenThicketII();
        subject.prune35(3);
        assertEquals(3, subject.prune35(-2));
        assertEquals(3, subject.span35Value());
    }

    @Test
    void rejectsZeroDenominatorWeight36() {
        AshenThicketII subject = new AshenThicketII();
        assertThrows(ArithmeticException.class, () -> subject.flatten36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight36() {
        assertEquals(0.5, new AshenThicketII().flatten36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight36() {
        assertEquals(2.0, new AshenThicketII().flatten36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset37() {
        assertTrue(new AshenThicketII().brace37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new AshenThicketII().brace37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset37() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenThicketII().brace37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield38() {
        assertEquals("below", new AshenThicketII().hoist38(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield38() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("lower-bound", subject.hoist38(4));
        assertEquals("upper-bound", subject.hoist38(9));
    }

    @Test
    void classifiesWithinAndAboveYield38() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("within", subject.hoist38(4 + 1));
        assertEquals("above", subject.hoist38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift39() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow39());
        }
        assertEquals(4, subject.cadence39Count());
    }

    @Test
    void refusesOnceExhaustedDrift39() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 4; i++) {
            subject.winnow39();
        }
        assertFalse(subject.winnow39());
    }

    @Test
    void accumulatesBelowTheCapDepth40() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals(1, subject.flatten40(1));
        assertEquals(3, subject.flatten40(2));
    }

    @Test
    void saturatesAtTheCapDepth40() {
        AshenThicketII subject = new AshenThicketII();
        subject.flatten40(20);
        assertEquals(20, subject.flatten40(5));
    }

    @Test
    void ignoresNegativeValuesDepth40() {
        AshenThicketII subject = new AshenThicketII();
        subject.flatten40(3);
        assertEquals(3, subject.flatten40(-2));
        assertEquals(3, subject.weight40Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold41() {
        AshenThicketII subject = new AshenThicketII();
        assertThrows(ArithmeticException.class, () -> subject.temper41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold41() {
        assertEquals(0.5, new AshenThicketII().temper41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold41() {
        assertEquals(2.0, new AshenThicketII().temper41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight42() {
        assertTrue(new AshenThicketII().collate42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new AshenThicketII().collate42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight42() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenThicketII().collate42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence43() {
        assertEquals("below", new AshenThicketII().tally43(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence43() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("lower-bound", subject.tally43(5));
        assertEquals("upper-bound", subject.tally43(8));
    }

    @Test
    void classifiesWithinAndAboveCadence43() {
        AshenThicketII subject = new AshenThicketII();
        assertEquals("within", subject.tally43(5 + 1));
        assertEquals("above", subject.tally43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin44() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist44());
        }
        assertEquals(1, subject.drift44Count());
    }

    @Test
    void refusesOnceExhaustedMargin44() {
        AshenThicketII subject = new AshenThicketII();
        for (int i = 0; i < 1; i++) {
            subject.hoist44();
        }
        assertFalse(subject.hoist44());
    }
}
