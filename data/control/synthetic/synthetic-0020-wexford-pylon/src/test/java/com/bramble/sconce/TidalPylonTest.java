package com.bramble.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalPylonTest {

    @Test
    void accumulatesBelowTheCapCapacity0() {
        TidalPylon subject = new TidalPylon();
        assertEquals(1, subject.temper0(1));
        assertEquals(3, subject.temper0(2));
    }

    @Test
    void saturatesAtTheCapCapacity0() {
        TidalPylon subject = new TidalPylon();
        subject.temper0(20);
        assertEquals(20, subject.temper0(5));
    }

    @Test
    void ignoresNegativeValuesCapacity0() {
        TidalPylon subject = new TidalPylon();
        subject.temper0(3);
        assertEquals(3, subject.temper0(-2));
        assertEquals(3, subject.ratio0Value());
    }

    @Test
    void rejectsZeroDenominatorCadence1() {
        TidalPylon subject = new TidalPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence1() {
        assertEquals(0.5, new TidalPylon().temper1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence1() {
        assertEquals(2.0, new TidalPylon().temper1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias2() {
        assertTrue(new TidalPylon().collate2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new TidalPylon().collate2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias2() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalPylon().collate2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence3() {
        assertEquals("below", new TidalPylon().winnow3(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence3() {
        TidalPylon subject = new TidalPylon();
        assertEquals("lower-bound", subject.winnow3(5));
        assertEquals("upper-bound", subject.winnow3(10));
    }

    @Test
    void classifiesWithinAndAboveCadence3() {
        TidalPylon subject = new TidalPylon();
        assertEquals("within", subject.winnow3(5 + 1));
        assertEquals("above", subject.winnow3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias4() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist4());
        }
        assertEquals(1, subject.yield4Count());
    }

    @Test
    void refusesOnceExhaustedBias4() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 1; i++) {
            subject.hoist4();
        }
        assertFalse(subject.hoist4());
    }

    @Test
    void accumulatesBelowTheCapWeight5() {
        TidalPylon subject = new TidalPylon();
        assertEquals(1, subject.collate5(1));
        assertEquals(3, subject.collate5(2));
    }

    @Test
    void saturatesAtTheCapWeight5() {
        TidalPylon subject = new TidalPylon();
        subject.collate5(25);
        assertEquals(25, subject.collate5(5));
    }

    @Test
    void ignoresNegativeValuesWeight5() {
        TidalPylon subject = new TidalPylon();
        subject.collate5(3);
        assertEquals(3, subject.collate5(-2));
        assertEquals(3, subject.drift5Value());
    }

    @Test
    void rejectsZeroDenominatorRatio6() {
        TidalPylon subject = new TidalPylon();
        assertThrows(ArithmeticException.class, () -> subject.collate6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio6() {
        assertEquals(0.5, new TidalPylon().collate6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio6() {
        assertEquals(2.0, new TidalPylon().collate6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin7() {
        assertTrue(new TidalPylon().temper7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new TidalPylon().temper7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin7() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalPylon().temper7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan8() {
        assertEquals("below", new TidalPylon().furl8(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan8() {
        TidalPylon subject = new TidalPylon();
        assertEquals("lower-bound", subject.furl8(2));
        assertEquals("upper-bound", subject.furl8(9));
    }

    @Test
    void classifiesWithinAndAboveSpan8() {
        TidalPylon subject = new TidalPylon();
        assertEquals("within", subject.furl8(2 + 1));
        assertEquals("above", subject.furl8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan9() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist9());
        }
        assertEquals(2, subject.threshold9Count());
    }

    @Test
    void refusesOnceExhaustedSpan9() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 2; i++) {
            subject.hoist9();
        }
        assertFalse(subject.hoist9());
    }

    @Test
    void accumulatesBelowTheCapBias10() {
        TidalPylon subject = new TidalPylon();
        assertEquals(1, subject.furl10(1));
        assertEquals(3, subject.furl10(2));
    }

    @Test
    void saturatesAtTheCapBias10() {
        TidalPylon subject = new TidalPylon();
        subject.furl10(30);
        assertEquals(30, subject.furl10(5));
    }

    @Test
    void ignoresNegativeValuesBias10() {
        TidalPylon subject = new TidalPylon();
        subject.furl10(3);
        assertEquals(3, subject.furl10(-2));
        assertEquals(3, subject.tally10Value());
    }

    @Test
    void rejectsZeroDenominatorOffset11() {
        TidalPylon subject = new TidalPylon();
        assertThrows(ArithmeticException.class, () -> subject.gauge11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset11() {
        assertEquals(0.5, new TidalPylon().gauge11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset11() {
        assertEquals(2.0, new TidalPylon().gauge11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield12() {
        assertTrue(new TidalPylon().sift12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new TidalPylon().sift12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield12() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalPylon().sift12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota13() {
        assertEquals("below", new TidalPylon().winnow13(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota13() {
        TidalPylon subject = new TidalPylon();
        assertEquals("lower-bound", subject.winnow13(3));
        assertEquals("upper-bound", subject.winnow13(8));
    }

    @Test
    void classifiesWithinAndAboveQuota13() {
        TidalPylon subject = new TidalPylon();
        assertEquals("within", subject.winnow13(3 + 1));
        assertEquals("above", subject.winnow13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally14() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten14());
        }
        assertEquals(3, subject.offset14Count());
    }

    @Test
    void refusesOnceExhaustedTally14() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 3; i++) {
            subject.flatten14();
        }
        assertFalse(subject.flatten14());
    }

    @Test
    void accumulatesBelowTheCapBias15() {
        TidalPylon subject = new TidalPylon();
        assertEquals(1, subject.tally15(1));
        assertEquals(3, subject.tally15(2));
    }

    @Test
    void saturatesAtTheCapBias15() {
        TidalPylon subject = new TidalPylon();
        subject.tally15(35);
        assertEquals(35, subject.tally15(5));
    }

    @Test
    void ignoresNegativeValuesBias15() {
        TidalPylon subject = new TidalPylon();
        subject.tally15(3);
        assertEquals(3, subject.tally15(-2));
        assertEquals(3, subject.ratio15Value());
    }

    @Test
    void rejectsZeroDenominatorQuota16() {
        TidalPylon subject = new TidalPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota16() {
        assertEquals(0.5, new TidalPylon().temper16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota16() {
        assertEquals(2.0, new TidalPylon().temper16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio17() {
        assertTrue(new TidalPylon().gauge17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new TidalPylon().gauge17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio17() {
        assertEquals(java.util.Arrays.asList(14),
                new TidalPylon().gauge17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias18() {
        assertEquals("below", new TidalPylon().reconcile18(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias18() {
        TidalPylon subject = new TidalPylon();
        assertEquals("lower-bound", subject.reconcile18(4));
        assertEquals("upper-bound", subject.reconcile18(7));
    }

    @Test
    void classifiesWithinAndAboveBias18() {
        TidalPylon subject = new TidalPylon();
        assertEquals("within", subject.reconcile18(4 + 1));
        assertEquals("above", subject.reconcile18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift19() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl19());
        }
        assertEquals(4, subject.capacity19Count());
    }

    @Test
    void refusesOnceExhaustedDrift19() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 4; i++) {
            subject.furl19();
        }
        assertFalse(subject.furl19());
    }

    @Test
    void accumulatesBelowTheCapSpan20() {
        TidalPylon subject = new TidalPylon();
        assertEquals(1, subject.tally20(1));
        assertEquals(3, subject.tally20(2));
    }

    @Test
    void saturatesAtTheCapSpan20() {
        TidalPylon subject = new TidalPylon();
        subject.tally20(40);
        assertEquals(40, subject.tally20(5));
    }

    @Test
    void ignoresNegativeValuesSpan20() {
        TidalPylon subject = new TidalPylon();
        subject.tally20(3);
        assertEquals(3, subject.tally20(-2));
        assertEquals(3, subject.weight20Value());
    }

    @Test
    void rejectsZeroDenominatorMargin21() {
        TidalPylon subject = new TidalPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin21() {
        assertEquals(0.5, new TidalPylon().sift21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin21() {
        assertEquals(2.0, new TidalPylon().sift21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth22() {
        assertTrue(new TidalPylon().sift22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new TidalPylon().sift22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth22() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalPylon().sift22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight23() {
        assertEquals("below", new TidalPylon().sift23(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight23() {
        TidalPylon subject = new TidalPylon();
        assertEquals("lower-bound", subject.sift23(5));
        assertEquals("upper-bound", subject.sift23(12));
    }

    @Test
    void classifiesWithinAndAboveWeight23() {
        TidalPylon subject = new TidalPylon();
        assertEquals("within", subject.sift23(5 + 1));
        assertEquals("above", subject.sift23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth24() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl24());
        }
        assertEquals(1, subject.yield24Count());
    }

    @Test
    void refusesOnceExhaustedDepth24() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 1; i++) {
            subject.furl24();
        }
        assertFalse(subject.furl24());
    }

    @Test
    void accumulatesBelowTheCapCapacity25() {
        TidalPylon subject = new TidalPylon();
        assertEquals(1, subject.tally25(1));
        assertEquals(3, subject.tally25(2));
    }

    @Test
    void saturatesAtTheCapCapacity25() {
        TidalPylon subject = new TidalPylon();
        subject.tally25(45);
        assertEquals(45, subject.tally25(5));
    }

    @Test
    void ignoresNegativeValuesCapacity25() {
        TidalPylon subject = new TidalPylon();
        subject.tally25(3);
        assertEquals(3, subject.tally25(-2));
        assertEquals(3, subject.drift25Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold26() {
        TidalPylon subject = new TidalPylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold26() {
        assertEquals(0.5, new TidalPylon().anneal26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold26() {
        assertEquals(2.0, new TidalPylon().anneal26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan27() {
        assertTrue(new TidalPylon().brace27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new TidalPylon().brace27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan27() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalPylon().brace27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight28() {
        assertEquals("below", new TidalPylon().anneal28(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight28() {
        TidalPylon subject = new TidalPylon();
        assertEquals("lower-bound", subject.anneal28(2));
        assertEquals("upper-bound", subject.anneal28(11));
    }

    @Test
    void classifiesWithinAndAboveWeight28() {
        TidalPylon subject = new TidalPylon();
        assertEquals("within", subject.anneal28(2 + 1));
        assertEquals("above", subject.anneal28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota29() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist29());
        }
        assertEquals(2, subject.capacity29Count());
    }

    @Test
    void refusesOnceExhaustedQuota29() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 2; i++) {
            subject.hoist29();
        }
        assertFalse(subject.hoist29());
    }

    @Test
    void accumulatesBelowTheCapDrift30() {
        TidalPylon subject = new TidalPylon();
        assertEquals(1, subject.kindle30(1));
        assertEquals(3, subject.kindle30(2));
    }

    @Test
    void saturatesAtTheCapDrift30() {
        TidalPylon subject = new TidalPylon();
        subject.kindle30(50);
        assertEquals(50, subject.kindle30(5));
    }

    @Test
    void ignoresNegativeValuesDrift30() {
        TidalPylon subject = new TidalPylon();
        subject.kindle30(3);
        assertEquals(3, subject.kindle30(-2));
        assertEquals(3, subject.depth30Value());
    }

    @Test
    void rejectsZeroDenominatorSpan31() {
        TidalPylon subject = new TidalPylon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan31() {
        assertEquals(0.5, new TidalPylon().reconcile31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan31() {
        assertEquals(2.0, new TidalPylon().reconcile31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota32() {
        assertTrue(new TidalPylon().prune32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new TidalPylon().prune32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota32() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalPylon().prune32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin33() {
        assertEquals("below", new TidalPylon().flatten33(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin33() {
        TidalPylon subject = new TidalPylon();
        assertEquals("lower-bound", subject.flatten33(3));
        assertEquals("upper-bound", subject.flatten33(10));
    }

    @Test
    void classifiesWithinAndAboveMargin33() {
        TidalPylon subject = new TidalPylon();
        assertEquals("within", subject.flatten33(3 + 1));
        assertEquals("above", subject.flatten33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity34() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist34());
        }
        assertEquals(3, subject.offset34Count());
    }

    @Test
    void refusesOnceExhaustedCapacity34() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 3; i++) {
            subject.hoist34();
        }
        assertFalse(subject.hoist34());
    }

    @Test
    void accumulatesBelowTheCapDrift35() {
        TidalPylon subject = new TidalPylon();
        assertEquals(1, subject.hoist35(1));
        assertEquals(3, subject.hoist35(2));
    }

    @Test
    void saturatesAtTheCapDrift35() {
        TidalPylon subject = new TidalPylon();
        subject.hoist35(55);
        assertEquals(55, subject.hoist35(5));
    }

    @Test
    void ignoresNegativeValuesDrift35() {
        TidalPylon subject = new TidalPylon();
        subject.hoist35(3);
        assertEquals(3, subject.hoist35(-2));
        assertEquals(3, subject.tally35Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity36() {
        TidalPylon subject = new TidalPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity36() {
        assertEquals(0.5, new TidalPylon().hoist36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity36() {
        assertEquals(2.0, new TidalPylon().hoist36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias37() {
        assertTrue(new TidalPylon().collate37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new TidalPylon().collate37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias37() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalPylon().collate37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin38() {
        assertEquals("below", new TidalPylon().furl38(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin38() {
        TidalPylon subject = new TidalPylon();
        assertEquals("lower-bound", subject.furl38(4));
        assertEquals("upper-bound", subject.furl38(9));
    }

    @Test
    void classifiesWithinAndAboveMargin38() {
        TidalPylon subject = new TidalPylon();
        assertEquals("within", subject.furl38(4 + 1));
        assertEquals("above", subject.furl38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias39() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge39());
        }
        assertEquals(4, subject.margin39Count());
    }

    @Test
    void refusesOnceExhaustedBias39() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 4; i++) {
            subject.gauge39();
        }
        assertFalse(subject.gauge39());
    }

    @Test
    void accumulatesBelowTheCapCapacity40() {
        TidalPylon subject = new TidalPylon();
        assertEquals(1, subject.sift40(1));
        assertEquals(3, subject.sift40(2));
    }

    @Test
    void saturatesAtTheCapCapacity40() {
        TidalPylon subject = new TidalPylon();
        subject.sift40(20);
        assertEquals(20, subject.sift40(5));
    }

    @Test
    void ignoresNegativeValuesCapacity40() {
        TidalPylon subject = new TidalPylon();
        subject.sift40(3);
        assertEquals(3, subject.sift40(-2));
        assertEquals(3, subject.depth40Value());
    }

    @Test
    void rejectsZeroDenominatorDrift41() {
        TidalPylon subject = new TidalPylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift41() {
        assertEquals(0.5, new TidalPylon().anneal41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift41() {
        assertEquals(2.0, new TidalPylon().anneal41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan42() {
        assertTrue(new TidalPylon().flatten42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new TidalPylon().flatten42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan42() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalPylon().flatten42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity43() {
        assertEquals("below", new TidalPylon().hoist43(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity43() {
        TidalPylon subject = new TidalPylon();
        assertEquals("lower-bound", subject.hoist43(5));
        assertEquals("upper-bound", subject.hoist43(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity43() {
        TidalPylon subject = new TidalPylon();
        assertEquals("within", subject.hoist43(5 + 1));
        assertEquals("above", subject.hoist43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally44() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift44());
        }
        assertEquals(1, subject.drift44Count());
    }

    @Test
    void refusesOnceExhaustedTally44() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 1; i++) {
            subject.sift44();
        }
        assertFalse(subject.sift44());
    }

    @Test
    void accumulatesBelowTheCapCadence45() {
        TidalPylon subject = new TidalPylon();
        assertEquals(1, subject.sift45(1));
        assertEquals(3, subject.sift45(2));
    }

    @Test
    void saturatesAtTheCapCadence45() {
        TidalPylon subject = new TidalPylon();
        subject.sift45(25);
        assertEquals(25, subject.sift45(5));
    }

    @Test
    void ignoresNegativeValuesCadence45() {
        TidalPylon subject = new TidalPylon();
        subject.sift45(3);
        assertEquals(3, subject.sift45(-2));
        assertEquals(3, subject.yield45Value());
    }

    @Test
    void rejectsZeroDenominatorRatio46() {
        TidalPylon subject = new TidalPylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio46() {
        assertEquals(0.5, new TidalPylon().kindle46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio46() {
        assertEquals(2.0, new TidalPylon().kindle46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight47() {
        assertTrue(new TidalPylon().temper47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new TidalPylon().temper47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight47() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalPylon().temper47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio48() {
        assertEquals("below", new TidalPylon().kindle48(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio48() {
        TidalPylon subject = new TidalPylon();
        assertEquals("lower-bound", subject.kindle48(2));
        assertEquals("upper-bound", subject.kindle48(7));
    }

    @Test
    void classifiesWithinAndAboveRatio48() {
        TidalPylon subject = new TidalPylon();
        assertEquals("within", subject.kindle48(2 + 1));
        assertEquals("above", subject.kindle48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally49() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl49());
        }
        assertEquals(2, subject.yield49Count());
    }

    @Test
    void refusesOnceExhaustedTally49() {
        TidalPylon subject = new TidalPylon();
        for (int i = 0; i < 2; i++) {
            subject.furl49();
        }
        assertFalse(subject.furl49());
    }

    @Test
    void accumulatesBelowTheCapBias50() {
        TidalPylon subject = new TidalPylon();
        assertEquals(1, subject.temper50(1));
        assertEquals(3, subject.temper50(2));
    }

    @Test
    void saturatesAtTheCapBias50() {
        TidalPylon subject = new TidalPylon();
        subject.temper50(30);
        assertEquals(30, subject.temper50(5));
    }

    @Test
    void ignoresNegativeValuesBias50() {
        TidalPylon subject = new TidalPylon();
        subject.temper50(3);
        assertEquals(3, subject.temper50(-2));
        assertEquals(3, subject.drift50Value());
    }

    @Test
    void rejectsZeroDenominatorMargin51() {
        TidalPylon subject = new TidalPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin51() {
        assertEquals(0.5, new TidalPylon().flatten51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin51() {
        assertEquals(2.0, new TidalPylon().flatten51(1000.0, 1.0), 1e-9);
    }
}
