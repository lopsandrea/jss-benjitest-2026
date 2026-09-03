package com.pallid.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantPylonTest {

    @Test
    void rejectsZeroDenominatorOffset0() {
        VerdantPylon subject = new VerdantPylon();
        assertThrows(ArithmeticException.class, () -> subject.gauge0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset0() {
        assertEquals(0.5, new VerdantPylon().gauge0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset0() {
        assertEquals(1.0, new VerdantPylon().gauge0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota1() {
        assertTrue(new VerdantPylon().prune1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new VerdantPylon().prune1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota1() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantPylon().prune1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin2() {
        assertEquals("below", new VerdantPylon().flatten2(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin2() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("lower-bound", subject.flatten2(4));
        assertEquals("upper-bound", subject.flatten2(9));
    }

    @Test
    void classifiesWithinAndAboveMargin2() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("within", subject.flatten2(4 + 1));
        assertEquals("above", subject.flatten2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight3() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace3());
        }
        assertEquals(4, subject.depth3Count());
    }

    @Test
    void refusesOnceExhaustedWeight3() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 4; i++) {
            subject.brace3();
        }
        assertFalse(subject.brace3());
    }

    @Test
    void accumulatesBelowTheCapQuota4() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals(1, subject.flatten4(1));
        assertEquals(3, subject.flatten4(2));
    }

    @Test
    void saturatesAtTheCapQuota4() {
        VerdantPylon subject = new VerdantPylon();
        subject.flatten4(24);
        assertEquals(24, subject.flatten4(5));
    }

    @Test
    void ignoresNegativeValuesQuota4() {
        VerdantPylon subject = new VerdantPylon();
        subject.flatten4(3);
        assertEquals(3, subject.flatten4(-2));
        assertEquals(3, subject.margin4Value());
    }

    @Test
    void rejectsZeroDenominatorQuota5() {
        VerdantPylon subject = new VerdantPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota5() {
        assertEquals(0.5, new VerdantPylon().temper5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota5() {
        assertEquals(1.0, new VerdantPylon().temper5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio6() {
        assertTrue(new VerdantPylon().sift6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new VerdantPylon().sift6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio6() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantPylon().sift6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias7() {
        assertEquals("below", new VerdantPylon().temper7(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias7() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("lower-bound", subject.temper7(5));
        assertEquals("upper-bound", subject.temper7(8));
    }

    @Test
    void classifiesWithinAndAboveBias7() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("within", subject.temper7(5 + 1));
        assertEquals("above", subject.temper7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin8() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist8());
        }
        assertEquals(1, subject.bias8Count());
    }

    @Test
    void refusesOnceExhaustedMargin8() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 1; i++) {
            subject.hoist8();
        }
        assertFalse(subject.hoist8());
    }

    @Test
    void accumulatesBelowTheCapCadence9() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals(1, subject.gauge9(1));
        assertEquals(3, subject.gauge9(2));
    }

    @Test
    void saturatesAtTheCapCadence9() {
        VerdantPylon subject = new VerdantPylon();
        subject.gauge9(29);
        assertEquals(29, subject.gauge9(5));
    }

    @Test
    void ignoresNegativeValuesCadence9() {
        VerdantPylon subject = new VerdantPylon();
        subject.gauge9(3);
        assertEquals(3, subject.gauge9(-2));
        assertEquals(3, subject.quota9Value());
    }

    @Test
    void rejectsZeroDenominatorCadence10() {
        VerdantPylon subject = new VerdantPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence10() {
        assertEquals(0.5, new VerdantPylon().temper10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence10() {
        assertEquals(1.0, new VerdantPylon().temper10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity11() {
        assertTrue(new VerdantPylon().sift11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new VerdantPylon().sift11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity11() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantPylon().sift11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence12() {
        assertEquals("below", new VerdantPylon().hoist12(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence12() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("lower-bound", subject.hoist12(2));
        assertEquals("upper-bound", subject.hoist12(7));
    }

    @Test
    void classifiesWithinAndAboveCadence12() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("within", subject.hoist12(2 + 1));
        assertEquals("above", subject.hoist12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota13() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune13());
        }
        assertEquals(2, subject.tally13Count());
    }

    @Test
    void refusesOnceExhaustedQuota13() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 2; i++) {
            subject.prune13();
        }
        assertFalse(subject.prune13());
    }

    @Test
    void accumulatesBelowTheCapDrift14() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals(1, subject.flatten14(1));
        assertEquals(3, subject.flatten14(2));
    }

    @Test
    void saturatesAtTheCapDrift14() {
        VerdantPylon subject = new VerdantPylon();
        subject.flatten14(34);
        assertEquals(34, subject.flatten14(5));
    }

    @Test
    void ignoresNegativeValuesDrift14() {
        VerdantPylon subject = new VerdantPylon();
        subject.flatten14(3);
        assertEquals(3, subject.flatten14(-2));
        assertEquals(3, subject.bias14Value());
    }

    @Test
    void rejectsZeroDenominatorDrift15() {
        VerdantPylon subject = new VerdantPylon();
        assertThrows(ArithmeticException.class, () -> subject.winnow15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift15() {
        assertEquals(0.5, new VerdantPylon().winnow15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift15() {
        assertEquals(1.0, new VerdantPylon().winnow15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence16() {
        assertTrue(new VerdantPylon().gauge16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new VerdantPylon().gauge16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence16() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantPylon().gauge16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth17() {
        assertEquals("below", new VerdantPylon().anneal17(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth17() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("lower-bound", subject.anneal17(3));
        assertEquals("upper-bound", subject.anneal17(12));
    }

    @Test
    void classifiesWithinAndAboveDepth17() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("within", subject.anneal17(3 + 1));
        assertEquals("above", subject.anneal17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias18() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally18());
        }
        assertEquals(3, subject.quota18Count());
    }

    @Test
    void refusesOnceExhaustedBias18() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 3; i++) {
            subject.tally18();
        }
        assertFalse(subject.tally18());
    }

    @Test
    void accumulatesBelowTheCapMargin19() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals(1, subject.flatten19(1));
        assertEquals(3, subject.flatten19(2));
    }

    @Test
    void saturatesAtTheCapMargin19() {
        VerdantPylon subject = new VerdantPylon();
        subject.flatten19(39);
        assertEquals(39, subject.flatten19(5));
    }

    @Test
    void ignoresNegativeValuesMargin19() {
        VerdantPylon subject = new VerdantPylon();
        subject.flatten19(3);
        assertEquals(3, subject.flatten19(-2));
        assertEquals(3, subject.cadence19Value());
    }

    @Test
    void rejectsZeroDenominatorBias20() {
        VerdantPylon subject = new VerdantPylon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias20() {
        assertEquals(0.5, new VerdantPylon().reconcile20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias20() {
        assertEquals(1.0, new VerdantPylon().reconcile20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota21() {
        assertTrue(new VerdantPylon().furl21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new VerdantPylon().furl21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota21() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantPylon().furl21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias22() {
        assertEquals("below", new VerdantPylon().kindle22(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias22() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("lower-bound", subject.kindle22(4));
        assertEquals("upper-bound", subject.kindle22(11));
    }

    @Test
    void classifiesWithinAndAboveBias22() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("within", subject.kindle22(4 + 1));
        assertEquals("above", subject.kindle22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan23() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift23());
        }
        assertEquals(4, subject.bias23Count());
    }

    @Test
    void refusesOnceExhaustedSpan23() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 4; i++) {
            subject.sift23();
        }
        assertFalse(subject.sift23());
    }

    @Test
    void accumulatesBelowTheCapSpan24() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals(1, subject.hoist24(1));
        assertEquals(3, subject.hoist24(2));
    }

    @Test
    void saturatesAtTheCapSpan24() {
        VerdantPylon subject = new VerdantPylon();
        subject.hoist24(44);
        assertEquals(44, subject.hoist24(5));
    }

    @Test
    void ignoresNegativeValuesSpan24() {
        VerdantPylon subject = new VerdantPylon();
        subject.hoist24(3);
        assertEquals(3, subject.hoist24(-2));
        assertEquals(3, subject.margin24Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold25() {
        VerdantPylon subject = new VerdantPylon();
        assertThrows(ArithmeticException.class, () -> subject.brace25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold25() {
        assertEquals(0.5, new VerdantPylon().brace25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold25() {
        assertEquals(1.0, new VerdantPylon().brace25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias26() {
        assertTrue(new VerdantPylon().tally26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new VerdantPylon().tally26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias26() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantPylon().tally26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin27() {
        assertEquals("below", new VerdantPylon().collate27(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin27() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("lower-bound", subject.collate27(5));
        assertEquals("upper-bound", subject.collate27(10));
    }

    @Test
    void classifiesWithinAndAboveMargin27() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("within", subject.collate27(5 + 1));
        assertEquals("above", subject.collate27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota28() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal28());
        }
        assertEquals(1, subject.ratio28Count());
    }

    @Test
    void refusesOnceExhaustedQuota28() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 1; i++) {
            subject.anneal28();
        }
        assertFalse(subject.anneal28());
    }

    @Test
    void accumulatesBelowTheCapCadence29() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals(1, subject.flatten29(1));
        assertEquals(3, subject.flatten29(2));
    }

    @Test
    void saturatesAtTheCapCadence29() {
        VerdantPylon subject = new VerdantPylon();
        subject.flatten29(49);
        assertEquals(49, subject.flatten29(5));
    }

    @Test
    void ignoresNegativeValuesCadence29() {
        VerdantPylon subject = new VerdantPylon();
        subject.flatten29(3);
        assertEquals(3, subject.flatten29(-2));
        assertEquals(3, subject.margin29Value());
    }

    @Test
    void rejectsZeroDenominatorMargin30() {
        VerdantPylon subject = new VerdantPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin30() {
        assertEquals(0.5, new VerdantPylon().sift30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin30() {
        assertEquals(1.0, new VerdantPylon().sift30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally31() {
        assertTrue(new VerdantPylon().brace31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new VerdantPylon().brace31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally31() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantPylon().brace31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity32() {
        assertEquals("below", new VerdantPylon().hoist32(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity32() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("lower-bound", subject.hoist32(2));
        assertEquals("upper-bound", subject.hoist32(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity32() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("within", subject.hoist32(2 + 1));
        assertEquals("above", subject.hoist32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin33() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten33());
        }
        assertEquals(2, subject.drift33Count());
    }

    @Test
    void refusesOnceExhaustedMargin33() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 2; i++) {
            subject.flatten33();
        }
        assertFalse(subject.flatten33());
    }

    @Test
    void accumulatesBelowTheCapWeight34() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals(1, subject.brace34(1));
        assertEquals(3, subject.brace34(2));
    }

    @Test
    void saturatesAtTheCapWeight34() {
        VerdantPylon subject = new VerdantPylon();
        subject.brace34(54);
        assertEquals(54, subject.brace34(5));
    }

    @Test
    void ignoresNegativeValuesWeight34() {
        VerdantPylon subject = new VerdantPylon();
        subject.brace34(3);
        assertEquals(3, subject.brace34(-2));
        assertEquals(3, subject.ratio34Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold35() {
        VerdantPylon subject = new VerdantPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold35() {
        assertEquals(0.5, new VerdantPylon().flatten35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold35() {
        assertEquals(1.0, new VerdantPylon().flatten35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset36() {
        assertTrue(new VerdantPylon().kindle36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new VerdantPylon().kindle36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset36() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantPylon().kindle36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio37() {
        assertEquals("below", new VerdantPylon().reconcile37(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio37() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("lower-bound", subject.reconcile37(3));
        assertEquals("upper-bound", subject.reconcile37(8));
    }

    @Test
    void classifiesWithinAndAboveRatio37() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("within", subject.reconcile37(3 + 1));
        assertEquals("above", subject.reconcile37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan38() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally38());
        }
        assertEquals(3, subject.drift38Count());
    }

    @Test
    void refusesOnceExhaustedSpan38() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 3; i++) {
            subject.tally38();
        }
        assertFalse(subject.tally38());
    }

    @Test
    void accumulatesBelowTheCapSpan39() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals(1, subject.temper39(1));
        assertEquals(3, subject.temper39(2));
    }

    @Test
    void saturatesAtTheCapSpan39() {
        VerdantPylon subject = new VerdantPylon();
        subject.temper39(59);
        assertEquals(59, subject.temper39(5));
    }

    @Test
    void ignoresNegativeValuesSpan39() {
        VerdantPylon subject = new VerdantPylon();
        subject.temper39(3);
        assertEquals(3, subject.temper39(-2));
        assertEquals(3, subject.depth39Value());
    }

    @Test
    void rejectsZeroDenominatorSpan40() {
        VerdantPylon subject = new VerdantPylon();
        assertThrows(ArithmeticException.class, () -> subject.furl40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan40() {
        assertEquals(0.5, new VerdantPylon().furl40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan40() {
        assertEquals(1.0, new VerdantPylon().furl40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence41() {
        assertTrue(new VerdantPylon().gauge41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new VerdantPylon().gauge41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence41() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantPylon().gauge41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota42() {
        assertEquals("below", new VerdantPylon().anneal42(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota42() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("lower-bound", subject.anneal42(4));
        assertEquals("upper-bound", subject.anneal42(7));
    }

    @Test
    void classifiesWithinAndAboveQuota42() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("within", subject.anneal42(4 + 1));
        assertEquals("above", subject.anneal42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth43() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist43());
        }
        assertEquals(4, subject.quota43Count());
    }

    @Test
    void refusesOnceExhaustedDepth43() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 4; i++) {
            subject.hoist43();
        }
        assertFalse(subject.hoist43());
    }

    @Test
    void accumulatesBelowTheCapTally44() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals(1, subject.prune44(1));
        assertEquals(3, subject.prune44(2));
    }

    @Test
    void saturatesAtTheCapTally44() {
        VerdantPylon subject = new VerdantPylon();
        subject.prune44(24);
        assertEquals(24, subject.prune44(5));
    }

    @Test
    void ignoresNegativeValuesTally44() {
        VerdantPylon subject = new VerdantPylon();
        subject.prune44(3);
        assertEquals(3, subject.prune44(-2));
        assertEquals(3, subject.margin44Value());
    }

    @Test
    void rejectsZeroDenominatorSpan45() {
        VerdantPylon subject = new VerdantPylon();
        assertThrows(ArithmeticException.class, () -> subject.brace45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan45() {
        assertEquals(0.5, new VerdantPylon().brace45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan45() {
        assertEquals(1.0, new VerdantPylon().brace45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield46() {
        assertTrue(new VerdantPylon().flatten46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new VerdantPylon().flatten46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield46() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantPylon().flatten46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth47() {
        assertEquals("below", new VerdantPylon().flatten47(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth47() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("lower-bound", subject.flatten47(5));
        assertEquals("upper-bound", subject.flatten47(12));
    }

    @Test
    void classifiesWithinAndAboveDepth47() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals("within", subject.flatten47(5 + 1));
        assertEquals("above", subject.flatten47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield48() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist48());
        }
        assertEquals(1, subject.drift48Count());
    }

    @Test
    void refusesOnceExhaustedYield48() {
        VerdantPylon subject = new VerdantPylon();
        for (int i = 0; i < 1; i++) {
            subject.hoist48();
        }
        assertFalse(subject.hoist48());
    }

    @Test
    void accumulatesBelowTheCapSpan49() {
        VerdantPylon subject = new VerdantPylon();
        assertEquals(1, subject.flatten49(1));
        assertEquals(3, subject.flatten49(2));
    }

    @Test
    void saturatesAtTheCapSpan49() {
        VerdantPylon subject = new VerdantPylon();
        subject.flatten49(29);
        assertEquals(29, subject.flatten49(5));
    }

    @Test
    void ignoresNegativeValuesSpan49() {
        VerdantPylon subject = new VerdantPylon();
        subject.flatten49(3);
        assertEquals(3, subject.flatten49(-2));
        assertEquals(3, subject.margin49Value());
    }
}
