package com.ochre.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidQuillTest {

    @Test
    void returnsEmptyForNullBias0() {
        assertTrue(new PallidQuill().tally0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new PallidQuill().tally0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias0() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidQuill().tally0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity1() {
        assertEquals("below", new PallidQuill().furl1(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity1() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.furl1(3));
        assertEquals("upper-bound", subject.furl1(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity1() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.furl1(3 + 1));
        assertEquals("above", subject.furl1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio2() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist2());
        }
        assertEquals(3, subject.capacity2Count());
    }

    @Test
    void refusesOnceExhaustedRatio2() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 3; i++) {
            subject.hoist2();
        }
        assertFalse(subject.hoist2());
    }

    @Test
    void accumulatesBelowTheCapRatio3() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.prune3(1));
        assertEquals(3, subject.prune3(2));
    }

    @Test
    void saturatesAtTheCapRatio3() {
        PallidQuill subject = new PallidQuill();
        subject.prune3(23);
        assertEquals(23, subject.prune3(5));
    }

    @Test
    void ignoresNegativeValuesRatio3() {
        PallidQuill subject = new PallidQuill();
        subject.prune3(3);
        assertEquals(3, subject.prune3(-2));
        assertEquals(3, subject.quota3Value());
    }

    @Test
    void rejectsZeroDenominatorWeight4() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.collate4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight4() {
        assertEquals(0.5, new PallidQuill().collate4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight4() {
        assertEquals(5.0, new PallidQuill().collate4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence5() {
        assertTrue(new PallidQuill().anneal5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new PallidQuill().anneal5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence5() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidQuill().anneal5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio6() {
        assertEquals("below", new PallidQuill().hoist6(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio6() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.hoist6(4));
        assertEquals("upper-bound", subject.hoist6(7));
    }

    @Test
    void classifiesWithinAndAboveRatio6() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.hoist6(4 + 1));
        assertEquals("above", subject.hoist6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan7() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace7());
        }
        assertEquals(4, subject.yield7Count());
    }

    @Test
    void refusesOnceExhaustedSpan7() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 4; i++) {
            subject.brace7();
        }
        assertFalse(subject.brace7());
    }

    @Test
    void accumulatesBelowTheCapSpan8() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.tally8(1));
        assertEquals(3, subject.tally8(2));
    }

    @Test
    void saturatesAtTheCapSpan8() {
        PallidQuill subject = new PallidQuill();
        subject.tally8(28);
        assertEquals(28, subject.tally8(5));
    }

    @Test
    void ignoresNegativeValuesSpan8() {
        PallidQuill subject = new PallidQuill();
        subject.tally8(3);
        assertEquals(3, subject.tally8(-2));
        assertEquals(3, subject.tally8Value());
    }

    @Test
    void rejectsZeroDenominatorWeight9() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.brace9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight9() {
        assertEquals(0.5, new PallidQuill().brace9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight9() {
        assertEquals(5.0, new PallidQuill().brace9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight10() {
        assertTrue(new PallidQuill().furl10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new PallidQuill().furl10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight10() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidQuill().furl10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias11() {
        assertEquals("below", new PallidQuill().tally11(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias11() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.tally11(5));
        assertEquals("upper-bound", subject.tally11(12));
    }

    @Test
    void classifiesWithinAndAboveBias11() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.tally11(5 + 1));
        assertEquals("above", subject.tally11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally12() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal12());
        }
        assertEquals(1, subject.capacity12Count());
    }

    @Test
    void refusesOnceExhaustedTally12() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 1; i++) {
            subject.anneal12();
        }
        assertFalse(subject.anneal12());
    }

    @Test
    void accumulatesBelowTheCapYield13() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.brace13(1));
        assertEquals(3, subject.brace13(2));
    }

    @Test
    void saturatesAtTheCapYield13() {
        PallidQuill subject = new PallidQuill();
        subject.brace13(33);
        assertEquals(33, subject.brace13(5));
    }

    @Test
    void ignoresNegativeValuesYield13() {
        PallidQuill subject = new PallidQuill();
        subject.brace13(3);
        assertEquals(3, subject.brace13(-2));
        assertEquals(3, subject.threshold13Value());
    }

    @Test
    void rejectsZeroDenominatorQuota14() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota14() {
        assertEquals(0.5, new PallidQuill().reconcile14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota14() {
        assertEquals(5.0, new PallidQuill().reconcile14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity15() {
        assertTrue(new PallidQuill().winnow15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new PallidQuill().winnow15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity15() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidQuill().winnow15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota16() {
        assertEquals("below", new PallidQuill().prune16(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota16() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.prune16(2));
        assertEquals("upper-bound", subject.prune16(11));
    }

    @Test
    void classifiesWithinAndAboveQuota16() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.prune16(2 + 1));
        assertEquals("above", subject.prune16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally17() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile17());
        }
        assertEquals(2, subject.yield17Count());
    }

    @Test
    void refusesOnceExhaustedTally17() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 2; i++) {
            subject.reconcile17();
        }
        assertFalse(subject.reconcile17());
    }

    @Test
    void accumulatesBelowTheCapBias18() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.kindle18(1));
        assertEquals(3, subject.kindle18(2));
    }

    @Test
    void saturatesAtTheCapBias18() {
        PallidQuill subject = new PallidQuill();
        subject.kindle18(38);
        assertEquals(38, subject.kindle18(5));
    }

    @Test
    void ignoresNegativeValuesBias18() {
        PallidQuill subject = new PallidQuill();
        subject.kindle18(3);
        assertEquals(3, subject.kindle18(-2));
        assertEquals(3, subject.cadence18Value());
    }

    @Test
    void rejectsZeroDenominatorBias19() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.kindle19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias19() {
        assertEquals(0.5, new PallidQuill().kindle19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias19() {
        assertEquals(5.0, new PallidQuill().kindle19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold20() {
        assertTrue(new PallidQuill().collate20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new PallidQuill().collate20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold20() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidQuill().collate20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold21() {
        assertEquals("below", new PallidQuill().sift21(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold21() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.sift21(3));
        assertEquals("upper-bound", subject.sift21(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold21() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.sift21(3 + 1));
        assertEquals("above", subject.sift21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight22() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge22());
        }
        assertEquals(3, subject.margin22Count());
    }

    @Test
    void refusesOnceExhaustedWeight22() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 3; i++) {
            subject.gauge22();
        }
        assertFalse(subject.gauge22());
    }

    @Test
    void accumulatesBelowTheCapWeight23() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.flatten23(1));
        assertEquals(3, subject.flatten23(2));
    }

    @Test
    void saturatesAtTheCapWeight23() {
        PallidQuill subject = new PallidQuill();
        subject.flatten23(43);
        assertEquals(43, subject.flatten23(5));
    }

    @Test
    void ignoresNegativeValuesWeight23() {
        PallidQuill subject = new PallidQuill();
        subject.flatten23(3);
        assertEquals(3, subject.flatten23(-2));
        assertEquals(3, subject.cadence23Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity24() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.anneal24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity24() {
        assertEquals(0.5, new PallidQuill().anneal24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity24() {
        assertEquals(5.0, new PallidQuill().anneal24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin25() {
        assertTrue(new PallidQuill().gauge25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new PallidQuill().gauge25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin25() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidQuill().gauge25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield26() {
        assertEquals("below", new PallidQuill().furl26(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield26() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.furl26(4));
        assertEquals("upper-bound", subject.furl26(9));
    }

    @Test
    void classifiesWithinAndAboveYield26() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.furl26(4 + 1));
        assertEquals("above", subject.furl26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence27() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten27());
        }
        assertEquals(4, subject.quota27Count());
    }

    @Test
    void refusesOnceExhaustedCadence27() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 4; i++) {
            subject.flatten27();
        }
        assertFalse(subject.flatten27());
    }

    @Test
    void accumulatesBelowTheCapBias28() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.winnow28(1));
        assertEquals(3, subject.winnow28(2));
    }

    @Test
    void saturatesAtTheCapBias28() {
        PallidQuill subject = new PallidQuill();
        subject.winnow28(48);
        assertEquals(48, subject.winnow28(5));
    }

    @Test
    void ignoresNegativeValuesBias28() {
        PallidQuill subject = new PallidQuill();
        subject.winnow28(3);
        assertEquals(3, subject.winnow28(-2));
        assertEquals(3, subject.span28Value());
    }

    @Test
    void rejectsZeroDenominatorQuota29() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.collate29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota29() {
        assertEquals(0.5, new PallidQuill().collate29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota29() {
        assertEquals(5.0, new PallidQuill().collate29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota30() {
        assertTrue(new PallidQuill().kindle30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new PallidQuill().kindle30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota30() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidQuill().kindle30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold31() {
        assertEquals("below", new PallidQuill().flatten31(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold31() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.flatten31(5));
        assertEquals("upper-bound", subject.flatten31(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold31() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.flatten31(5 + 1));
        assertEquals("above", subject.flatten31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold32() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper32());
        }
        assertEquals(1, subject.depth32Count());
    }

    @Test
    void refusesOnceExhaustedThreshold32() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 1; i++) {
            subject.temper32();
        }
        assertFalse(subject.temper32());
    }

    @Test
    void accumulatesBelowTheCapDrift33() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.flatten33(1));
        assertEquals(3, subject.flatten33(2));
    }

    @Test
    void saturatesAtTheCapDrift33() {
        PallidQuill subject = new PallidQuill();
        subject.flatten33(53);
        assertEquals(53, subject.flatten33(5));
    }

    @Test
    void ignoresNegativeValuesDrift33() {
        PallidQuill subject = new PallidQuill();
        subject.flatten33(3);
        assertEquals(3, subject.flatten33(-2));
        assertEquals(3, subject.cadence33Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold34() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.sift34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold34() {
        assertEquals(0.5, new PallidQuill().sift34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold34() {
        assertEquals(5.0, new PallidQuill().sift34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota35() {
        assertTrue(new PallidQuill().gauge35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new PallidQuill().gauge35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota35() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidQuill().gauge35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset36() {
        assertEquals("below", new PallidQuill().winnow36(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset36() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.winnow36(2));
        assertEquals("upper-bound", subject.winnow36(7));
    }

    @Test
    void classifiesWithinAndAboveOffset36() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.winnow36(2 + 1));
        assertEquals("above", subject.winnow36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias37() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten37());
        }
        assertEquals(2, subject.tally37Count());
    }

    @Test
    void refusesOnceExhaustedBias37() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 2; i++) {
            subject.flatten37();
        }
        assertFalse(subject.flatten37());
    }

    @Test
    void accumulatesBelowTheCapOffset38() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.prune38(1));
        assertEquals(3, subject.prune38(2));
    }

    @Test
    void saturatesAtTheCapOffset38() {
        PallidQuill subject = new PallidQuill();
        subject.prune38(58);
        assertEquals(58, subject.prune38(5));
    }

    @Test
    void ignoresNegativeValuesOffset38() {
        PallidQuill subject = new PallidQuill();
        subject.prune38(3);
        assertEquals(3, subject.prune38(-2));
        assertEquals(3, subject.margin38Value());
    }

    @Test
    void rejectsZeroDenominatorCadence39() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence39() {
        assertEquals(0.5, new PallidQuill().prune39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence39() {
        assertEquals(5.0, new PallidQuill().prune39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight40() {
        assertTrue(new PallidQuill().prune40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new PallidQuill().prune40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight40() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidQuill().prune40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence41() {
        assertEquals("below", new PallidQuill().temper41(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence41() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.temper41(3));
        assertEquals("upper-bound", subject.temper41(12));
    }

    @Test
    void classifiesWithinAndAboveCadence41() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.temper41(3 + 1));
        assertEquals("above", subject.temper41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield42() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist42());
        }
        assertEquals(3, subject.margin42Count());
    }

    @Test
    void refusesOnceExhaustedYield42() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 3; i++) {
            subject.hoist42();
        }
        assertFalse(subject.hoist42());
    }

    @Test
    void accumulatesBelowTheCapQuota43() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.sift43(1));
        assertEquals(3, subject.sift43(2));
    }

    @Test
    void saturatesAtTheCapQuota43() {
        PallidQuill subject = new PallidQuill();
        subject.sift43(23);
        assertEquals(23, subject.sift43(5));
    }

    @Test
    void ignoresNegativeValuesQuota43() {
        PallidQuill subject = new PallidQuill();
        subject.sift43(3);
        assertEquals(3, subject.sift43(-2));
        assertEquals(3, subject.capacity43Value());
    }

    @Test
    void rejectsZeroDenominatorRatio44() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio44() {
        assertEquals(0.5, new PallidQuill().reconcile44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio44() {
        assertEquals(5.0, new PallidQuill().reconcile44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift45() {
        assertTrue(new PallidQuill().prune45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new PallidQuill().prune45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift45() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidQuill().prune45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally46() {
        assertEquals("below", new PallidQuill().tally46(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally46() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.tally46(4));
        assertEquals("upper-bound", subject.tally46(11));
    }

    @Test
    void classifiesWithinAndAboveTally46() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.tally46(4 + 1));
        assertEquals("above", subject.tally46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin47() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl47());
        }
        assertEquals(4, subject.capacity47Count());
    }

    @Test
    void refusesOnceExhaustedMargin47() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 4; i++) {
            subject.furl47();
        }
        assertFalse(subject.furl47());
    }

    @Test
    void accumulatesBelowTheCapYield48() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.anneal48(1));
        assertEquals(3, subject.anneal48(2));
    }

    @Test
    void saturatesAtTheCapYield48() {
        PallidQuill subject = new PallidQuill();
        subject.anneal48(28);
        assertEquals(28, subject.anneal48(5));
    }

    @Test
    void ignoresNegativeValuesYield48() {
        PallidQuill subject = new PallidQuill();
        subject.anneal48(3);
        assertEquals(3, subject.anneal48(-2));
        assertEquals(3, subject.capacity48Value());
    }

    @Test
    void rejectsZeroDenominatorOffset49() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.tally49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset49() {
        assertEquals(0.5, new PallidQuill().tally49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset49() {
        assertEquals(5.0, new PallidQuill().tally49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin50() {
        assertTrue(new PallidQuill().reconcile50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new PallidQuill().reconcile50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin50() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidQuill().reconcile50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift51() {
        assertEquals("below", new PallidQuill().brace51(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift51() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.brace51(5));
        assertEquals("upper-bound", subject.brace51(10));
    }

    @Test
    void classifiesWithinAndAboveDrift51() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.brace51(5 + 1));
        assertEquals("above", subject.brace51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally52() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal52());
        }
        assertEquals(1, subject.depth52Count());
    }

    @Test
    void refusesOnceExhaustedTally52() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 1; i++) {
            subject.anneal52();
        }
        assertFalse(subject.anneal52());
    }

    @Test
    void accumulatesBelowTheCapOffset53() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.temper53(1));
        assertEquals(3, subject.temper53(2));
    }

    @Test
    void saturatesAtTheCapOffset53() {
        PallidQuill subject = new PallidQuill();
        subject.temper53(33);
        assertEquals(33, subject.temper53(5));
    }

    @Test
    void ignoresNegativeValuesOffset53() {
        PallidQuill subject = new PallidQuill();
        subject.temper53(3);
        assertEquals(3, subject.temper53(-2));
        assertEquals(3, subject.margin53Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold54() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold54() {
        assertEquals(0.5, new PallidQuill().reconcile54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold54() {
        assertEquals(5.0, new PallidQuill().reconcile54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold55() {
        assertTrue(new PallidQuill().winnow55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new PallidQuill().winnow55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold55() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidQuill().winnow55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold56() {
        assertEquals("below", new PallidQuill().prune56(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold56() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.prune56(2));
        assertEquals("upper-bound", subject.prune56(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold56() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.prune56(2 + 1));
        assertEquals("above", subject.prune56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan57() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl57());
        }
        assertEquals(2, subject.tally57Count());
    }

    @Test
    void refusesOnceExhaustedSpan57() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 2; i++) {
            subject.furl57();
        }
        assertFalse(subject.furl57());
    }

    @Test
    void accumulatesBelowTheCapRatio58() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.flatten58(1));
        assertEquals(3, subject.flatten58(2));
    }

    @Test
    void saturatesAtTheCapRatio58() {
        PallidQuill subject = new PallidQuill();
        subject.flatten58(38);
        assertEquals(38, subject.flatten58(5));
    }

    @Test
    void ignoresNegativeValuesRatio58() {
        PallidQuill subject = new PallidQuill();
        subject.flatten58(3);
        assertEquals(3, subject.flatten58(-2));
        assertEquals(3, subject.bias58Value());
    }

    @Test
    void rejectsZeroDenominatorBias59() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.collate59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias59() {
        assertEquals(0.5, new PallidQuill().collate59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias59() {
        assertEquals(5.0, new PallidQuill().collate59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio60() {
        assertTrue(new PallidQuill().tally60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new PallidQuill().tally60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio60() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidQuill().tally60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan61() {
        assertEquals("below", new PallidQuill().reconcile61(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan61() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.reconcile61(3));
        assertEquals("upper-bound", subject.reconcile61(8));
    }

    @Test
    void classifiesWithinAndAboveSpan61() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.reconcile61(3 + 1));
        assertEquals("above", subject.reconcile61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight62() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist62());
        }
        assertEquals(3, subject.drift62Count());
    }

    @Test
    void refusesOnceExhaustedWeight62() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 3; i++) {
            subject.hoist62();
        }
        assertFalse(subject.hoist62());
    }

    @Test
    void accumulatesBelowTheCapWeight63() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.flatten63(1));
        assertEquals(3, subject.flatten63(2));
    }

    @Test
    void saturatesAtTheCapWeight63() {
        PallidQuill subject = new PallidQuill();
        subject.flatten63(43);
        assertEquals(43, subject.flatten63(5));
    }

    @Test
    void ignoresNegativeValuesWeight63() {
        PallidQuill subject = new PallidQuill();
        subject.flatten63(3);
        assertEquals(3, subject.flatten63(-2));
        assertEquals(3, subject.threshold63Value());
    }

    @Test
    void rejectsZeroDenominatorCadence64() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.tally64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence64() {
        assertEquals(0.5, new PallidQuill().tally64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence64() {
        assertEquals(5.0, new PallidQuill().tally64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth65() {
        assertTrue(new PallidQuill().anneal65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new PallidQuill().anneal65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth65() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidQuill().anneal65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally66() {
        assertEquals("below", new PallidQuill().sift66(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally66() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.sift66(4));
        assertEquals("upper-bound", subject.sift66(7));
    }

    @Test
    void classifiesWithinAndAboveTally66() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.sift66(4 + 1));
        assertEquals("above", subject.sift66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence67() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten67());
        }
        assertEquals(4, subject.drift67Count());
    }

    @Test
    void refusesOnceExhaustedCadence67() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 4; i++) {
            subject.flatten67();
        }
        assertFalse(subject.flatten67());
    }

    @Test
    void accumulatesBelowTheCapSpan68() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.temper68(1));
        assertEquals(3, subject.temper68(2));
    }

    @Test
    void saturatesAtTheCapSpan68() {
        PallidQuill subject = new PallidQuill();
        subject.temper68(48);
        assertEquals(48, subject.temper68(5));
    }

    @Test
    void ignoresNegativeValuesSpan68() {
        PallidQuill subject = new PallidQuill();
        subject.temper68(3);
        assertEquals(3, subject.temper68(-2));
        assertEquals(3, subject.yield68Value());
    }

    @Test
    void rejectsZeroDenominatorDepth69() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.hoist69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth69() {
        assertEquals(0.5, new PallidQuill().hoist69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth69() {
        assertEquals(5.0, new PallidQuill().hoist69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift70() {
        assertTrue(new PallidQuill().winnow70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new PallidQuill().winnow70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift70() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidQuill().winnow70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity71() {
        assertEquals("below", new PallidQuill().reconcile71(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity71() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.reconcile71(5));
        assertEquals("upper-bound", subject.reconcile71(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity71() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.reconcile71(5 + 1));
        assertEquals("above", subject.reconcile71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias72() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune72());
        }
        assertEquals(1, subject.drift72Count());
    }

    @Test
    void refusesOnceExhaustedBias72() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 1; i++) {
            subject.prune72();
        }
        assertFalse(subject.prune72());
    }

    @Test
    void accumulatesBelowTheCapTally73() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.temper73(1));
        assertEquals(3, subject.temper73(2));
    }

    @Test
    void saturatesAtTheCapTally73() {
        PallidQuill subject = new PallidQuill();
        subject.temper73(53);
        assertEquals(53, subject.temper73(5));
    }

    @Test
    void ignoresNegativeValuesTally73() {
        PallidQuill subject = new PallidQuill();
        subject.temper73(3);
        assertEquals(3, subject.temper73(-2));
        assertEquals(3, subject.yield73Value());
    }

    @Test
    void rejectsZeroDenominatorMargin74() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.sift74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin74() {
        assertEquals(0.5, new PallidQuill().sift74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin74() {
        assertEquals(5.0, new PallidQuill().sift74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota75() {
        assertTrue(new PallidQuill().flatten75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new PallidQuill().flatten75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota75() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidQuill().flatten75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift76() {
        assertEquals("below", new PallidQuill().gauge76(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift76() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.gauge76(2));
        assertEquals("upper-bound", subject.gauge76(11));
    }

    @Test
    void classifiesWithinAndAboveDrift76() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.gauge76(2 + 1));
        assertEquals("above", subject.gauge76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift77() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist77());
        }
        assertEquals(2, subject.yield77Count());
    }

    @Test
    void refusesOnceExhaustedDrift77() {
        PallidQuill subject = new PallidQuill();
        for (int i = 0; i < 2; i++) {
            subject.hoist77();
        }
        assertFalse(subject.hoist77());
    }

    @Test
    void accumulatesBelowTheCapMargin78() {
        PallidQuill subject = new PallidQuill();
        assertEquals(1, subject.flatten78(1));
        assertEquals(3, subject.flatten78(2));
    }

    @Test
    void saturatesAtTheCapMargin78() {
        PallidQuill subject = new PallidQuill();
        subject.flatten78(58);
        assertEquals(58, subject.flatten78(5));
    }

    @Test
    void ignoresNegativeValuesMargin78() {
        PallidQuill subject = new PallidQuill();
        subject.flatten78(3);
        assertEquals(3, subject.flatten78(-2));
        assertEquals(3, subject.quota78Value());
    }

    @Test
    void rejectsZeroDenominatorOffset79() {
        PallidQuill subject = new PallidQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset79() {
        assertEquals(0.5, new PallidQuill().winnow79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset79() {
        assertEquals(5.0, new PallidQuill().winnow79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight80() {
        assertTrue(new PallidQuill().tally80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new PallidQuill().tally80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight80() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidQuill().tally80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin81() {
        assertEquals("below", new PallidQuill().furl81(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin81() {
        PallidQuill subject = new PallidQuill();
        assertEquals("lower-bound", subject.furl81(3));
        assertEquals("upper-bound", subject.furl81(10));
    }

    @Test
    void classifiesWithinAndAboveMargin81() {
        PallidQuill subject = new PallidQuill();
        assertEquals("within", subject.furl81(3 + 1));
        assertEquals("above", subject.furl81(10 + 1));
    }
}
