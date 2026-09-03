package com.ochre.pylon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidFoundryTest {

    @Test
    void accumulatesBelowTheCapOffset0() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals(1, subject.sift0(1));
        assertEquals(3, subject.sift0(2));
    }

    @Test
    void saturatesAtTheCapOffset0() {
        PallidFoundry subject = new PallidFoundry();
        subject.sift0(20);
        assertEquals(20, subject.sift0(5));
    }

    @Test
    void ignoresNegativeValuesOffset0() {
        PallidFoundry subject = new PallidFoundry();
        subject.sift0(3);
        assertEquals(3, subject.sift0(-2));
        assertEquals(3, subject.span0Value());
    }

    @Test
    void rejectsZeroDenominatorRatio1() {
        PallidFoundry subject = new PallidFoundry();
        assertThrows(ArithmeticException.class, () -> subject.brace1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio1() {
        assertEquals(0.5, new PallidFoundry().brace1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio1() {
        assertEquals(2.0, new PallidFoundry().brace1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth2() {
        assertTrue(new PallidFoundry().anneal2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidFoundry().anneal2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth2() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidFoundry().anneal2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift3() {
        assertEquals("below", new PallidFoundry().gauge3(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift3() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("lower-bound", subject.gauge3(5));
        assertEquals("upper-bound", subject.gauge3(10));
    }

    @Test
    void classifiesWithinAndAboveDrift3() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("within", subject.gauge3(5 + 1));
        assertEquals("above", subject.gauge3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan4() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune4());
        }
        assertEquals(1, subject.threshold4Count());
    }

    @Test
    void refusesOnceExhaustedSpan4() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 1; i++) {
            subject.prune4();
        }
        assertFalse(subject.prune4());
    }

    @Test
    void accumulatesBelowTheCapTally5() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals(1, subject.collate5(1));
        assertEquals(3, subject.collate5(2));
    }

    @Test
    void saturatesAtTheCapTally5() {
        PallidFoundry subject = new PallidFoundry();
        subject.collate5(25);
        assertEquals(25, subject.collate5(5));
    }

    @Test
    void ignoresNegativeValuesTally5() {
        PallidFoundry subject = new PallidFoundry();
        subject.collate5(3);
        assertEquals(3, subject.collate5(-2));
        assertEquals(3, subject.capacity5Value());
    }

    @Test
    void rejectsZeroDenominatorTally6() {
        PallidFoundry subject = new PallidFoundry();
        assertThrows(ArithmeticException.class, () -> subject.gauge6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally6() {
        assertEquals(0.5, new PallidFoundry().gauge6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally6() {
        assertEquals(2.0, new PallidFoundry().gauge6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin7() {
        assertTrue(new PallidFoundry().gauge7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidFoundry().gauge7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin7() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidFoundry().gauge7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift8() {
        assertEquals("below", new PallidFoundry().brace8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift8() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("lower-bound", subject.brace8(2));
        assertEquals("upper-bound", subject.brace8(9));
    }

    @Test
    void classifiesWithinAndAboveDrift8() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("within", subject.brace8(2 + 1));
        assertEquals("above", subject.brace8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight9() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate9());
        }
        assertEquals(2, subject.ratio9Count());
    }

    @Test
    void refusesOnceExhaustedWeight9() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 2; i++) {
            subject.collate9();
        }
        assertFalse(subject.collate9());
    }

    @Test
    void accumulatesBelowTheCapMargin10() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals(1, subject.sift10(1));
        assertEquals(3, subject.sift10(2));
    }

    @Test
    void saturatesAtTheCapMargin10() {
        PallidFoundry subject = new PallidFoundry();
        subject.sift10(30);
        assertEquals(30, subject.sift10(5));
    }

    @Test
    void ignoresNegativeValuesMargin10() {
        PallidFoundry subject = new PallidFoundry();
        subject.sift10(3);
        assertEquals(3, subject.sift10(-2));
        assertEquals(3, subject.drift10Value());
    }

    @Test
    void rejectsZeroDenominatorTally11() {
        PallidFoundry subject = new PallidFoundry();
        assertThrows(ArithmeticException.class, () -> subject.sift11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally11() {
        assertEquals(0.5, new PallidFoundry().sift11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally11() {
        assertEquals(2.0, new PallidFoundry().sift11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan12() {
        assertTrue(new PallidFoundry().gauge12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new PallidFoundry().gauge12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan12() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidFoundry().gauge12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias13() {
        assertEquals("below", new PallidFoundry().collate13(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias13() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("lower-bound", subject.collate13(3));
        assertEquals("upper-bound", subject.collate13(8));
    }

    @Test
    void classifiesWithinAndAboveBias13() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("within", subject.collate13(3 + 1));
        assertEquals("above", subject.collate13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan14() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile14());
        }
        assertEquals(3, subject.ratio14Count());
    }

    @Test
    void refusesOnceExhaustedSpan14() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 3; i++) {
            subject.reconcile14();
        }
        assertFalse(subject.reconcile14());
    }

    @Test
    void accumulatesBelowTheCapTally15() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals(1, subject.prune15(1));
        assertEquals(3, subject.prune15(2));
    }

    @Test
    void saturatesAtTheCapTally15() {
        PallidFoundry subject = new PallidFoundry();
        subject.prune15(35);
        assertEquals(35, subject.prune15(5));
    }

    @Test
    void ignoresNegativeValuesTally15() {
        PallidFoundry subject = new PallidFoundry();
        subject.prune15(3);
        assertEquals(3, subject.prune15(-2));
        assertEquals(3, subject.ratio15Value());
    }

    @Test
    void rejectsZeroDenominatorCadence16() {
        PallidFoundry subject = new PallidFoundry();
        assertThrows(ArithmeticException.class, () -> subject.kindle16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence16() {
        assertEquals(0.5, new PallidFoundry().kindle16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence16() {
        assertEquals(2.0, new PallidFoundry().kindle16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio17() {
        assertTrue(new PallidFoundry().winnow17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new PallidFoundry().winnow17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio17() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidFoundry().winnow17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth18() {
        assertEquals("below", new PallidFoundry().sift18(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth18() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("lower-bound", subject.sift18(4));
        assertEquals("upper-bound", subject.sift18(7));
    }

    @Test
    void classifiesWithinAndAboveDepth18() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("within", subject.sift18(4 + 1));
        assertEquals("above", subject.sift18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight19() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace19());
        }
        assertEquals(4, subject.offset19Count());
    }

    @Test
    void refusesOnceExhaustedWeight19() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 4; i++) {
            subject.brace19();
        }
        assertFalse(subject.brace19());
    }

    @Test
    void accumulatesBelowTheCapDrift20() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals(1, subject.kindle20(1));
        assertEquals(3, subject.kindle20(2));
    }

    @Test
    void saturatesAtTheCapDrift20() {
        PallidFoundry subject = new PallidFoundry();
        subject.kindle20(40);
        assertEquals(40, subject.kindle20(5));
    }

    @Test
    void ignoresNegativeValuesDrift20() {
        PallidFoundry subject = new PallidFoundry();
        subject.kindle20(3);
        assertEquals(3, subject.kindle20(-2));
        assertEquals(3, subject.weight20Value());
    }

    @Test
    void rejectsZeroDenominatorBias21() {
        PallidFoundry subject = new PallidFoundry();
        assertThrows(ArithmeticException.class, () -> subject.anneal21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias21() {
        assertEquals(0.5, new PallidFoundry().anneal21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias21() {
        assertEquals(2.0, new PallidFoundry().anneal21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin22() {
        assertTrue(new PallidFoundry().sift22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new PallidFoundry().sift22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin22() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidFoundry().sift22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence23() {
        assertEquals("below", new PallidFoundry().collate23(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence23() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("lower-bound", subject.collate23(5));
        assertEquals("upper-bound", subject.collate23(12));
    }

    @Test
    void classifiesWithinAndAboveCadence23() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("within", subject.collate23(5 + 1));
        assertEquals("above", subject.collate23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota24() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally24());
        }
        assertEquals(1, subject.depth24Count());
    }

    @Test
    void refusesOnceExhaustedQuota24() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 1; i++) {
            subject.tally24();
        }
        assertFalse(subject.tally24());
    }

    @Test
    void accumulatesBelowTheCapQuota25() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals(1, subject.reconcile25(1));
        assertEquals(3, subject.reconcile25(2));
    }

    @Test
    void saturatesAtTheCapQuota25() {
        PallidFoundry subject = new PallidFoundry();
        subject.reconcile25(45);
        assertEquals(45, subject.reconcile25(5));
    }

    @Test
    void ignoresNegativeValuesQuota25() {
        PallidFoundry subject = new PallidFoundry();
        subject.reconcile25(3);
        assertEquals(3, subject.reconcile25(-2));
        assertEquals(3, subject.bias25Value());
    }

    @Test
    void rejectsZeroDenominatorQuota26() {
        PallidFoundry subject = new PallidFoundry();
        assertThrows(ArithmeticException.class, () -> subject.hoist26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota26() {
        assertEquals(0.5, new PallidFoundry().hoist26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota26() {
        assertEquals(2.0, new PallidFoundry().hoist26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset27() {
        assertTrue(new PallidFoundry().hoist27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new PallidFoundry().hoist27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset27() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidFoundry().hoist27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota28() {
        assertEquals("below", new PallidFoundry().sift28(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota28() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("lower-bound", subject.sift28(2));
        assertEquals("upper-bound", subject.sift28(11));
    }

    @Test
    void classifiesWithinAndAboveQuota28() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("within", subject.sift28(2 + 1));
        assertEquals("above", subject.sift28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio29() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal29());
        }
        assertEquals(2, subject.cadence29Count());
    }

    @Test
    void refusesOnceExhaustedRatio29() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 2; i++) {
            subject.anneal29();
        }
        assertFalse(subject.anneal29());
    }

    @Test
    void accumulatesBelowTheCapRatio30() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals(1, subject.collate30(1));
        assertEquals(3, subject.collate30(2));
    }

    @Test
    void saturatesAtTheCapRatio30() {
        PallidFoundry subject = new PallidFoundry();
        subject.collate30(50);
        assertEquals(50, subject.collate30(5));
    }

    @Test
    void ignoresNegativeValuesRatio30() {
        PallidFoundry subject = new PallidFoundry();
        subject.collate30(3);
        assertEquals(3, subject.collate30(-2));
        assertEquals(3, subject.quota30Value());
    }

    @Test
    void rejectsZeroDenominatorBias31() {
        PallidFoundry subject = new PallidFoundry();
        assertThrows(ArithmeticException.class, () -> subject.temper31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias31() {
        assertEquals(0.5, new PallidFoundry().temper31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias31() {
        assertEquals(2.0, new PallidFoundry().temper31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan32() {
        assertTrue(new PallidFoundry().gauge32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new PallidFoundry().gauge32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan32() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidFoundry().gauge32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota33() {
        assertEquals("below", new PallidFoundry().furl33(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota33() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("lower-bound", subject.furl33(3));
        assertEquals("upper-bound", subject.furl33(10));
    }

    @Test
    void classifiesWithinAndAboveQuota33() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("within", subject.furl33(3 + 1));
        assertEquals("above", subject.furl33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield34() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow34());
        }
        assertEquals(3, subject.capacity34Count());
    }

    @Test
    void refusesOnceExhaustedYield34() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 3; i++) {
            subject.winnow34();
        }
        assertFalse(subject.winnow34());
    }

    @Test
    void accumulatesBelowTheCapDepth35() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals(1, subject.anneal35(1));
        assertEquals(3, subject.anneal35(2));
    }

    @Test
    void saturatesAtTheCapDepth35() {
        PallidFoundry subject = new PallidFoundry();
        subject.anneal35(55);
        assertEquals(55, subject.anneal35(5));
    }

    @Test
    void ignoresNegativeValuesDepth35() {
        PallidFoundry subject = new PallidFoundry();
        subject.anneal35(3);
        assertEquals(3, subject.anneal35(-2));
        assertEquals(3, subject.offset35Value());
    }

    @Test
    void rejectsZeroDenominatorOffset36() {
        PallidFoundry subject = new PallidFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset36() {
        assertEquals(0.5, new PallidFoundry().collate36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset36() {
        assertEquals(2.0, new PallidFoundry().collate36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence37() {
        assertTrue(new PallidFoundry().gauge37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new PallidFoundry().gauge37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence37() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidFoundry().gauge37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally38() {
        assertEquals("below", new PallidFoundry().hoist38(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally38() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("lower-bound", subject.hoist38(4));
        assertEquals("upper-bound", subject.hoist38(9));
    }

    @Test
    void classifiesWithinAndAboveTally38() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("within", subject.hoist38(4 + 1));
        assertEquals("above", subject.hoist38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift39() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl39());
        }
        assertEquals(4, subject.offset39Count());
    }

    @Test
    void refusesOnceExhaustedDrift39() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 4; i++) {
            subject.furl39();
        }
        assertFalse(subject.furl39());
    }

    @Test
    void accumulatesBelowTheCapDrift40() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals(1, subject.prune40(1));
        assertEquals(3, subject.prune40(2));
    }

    @Test
    void saturatesAtTheCapDrift40() {
        PallidFoundry subject = new PallidFoundry();
        subject.prune40(20);
        assertEquals(20, subject.prune40(5));
    }

    @Test
    void ignoresNegativeValuesDrift40() {
        PallidFoundry subject = new PallidFoundry();
        subject.prune40(3);
        assertEquals(3, subject.prune40(-2));
        assertEquals(3, subject.tally40Value());
    }

    @Test
    void rejectsZeroDenominatorQuota41() {
        PallidFoundry subject = new PallidFoundry();
        assertThrows(ArithmeticException.class, () -> subject.hoist41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota41() {
        assertEquals(0.5, new PallidFoundry().hoist41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota41() {
        assertEquals(2.0, new PallidFoundry().hoist41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset42() {
        assertTrue(new PallidFoundry().gauge42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new PallidFoundry().gauge42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset42() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidFoundry().gauge42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence43() {
        assertEquals("below", new PallidFoundry().prune43(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence43() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("lower-bound", subject.prune43(5));
        assertEquals("upper-bound", subject.prune43(8));
    }

    @Test
    void classifiesWithinAndAboveCadence43() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("within", subject.prune43(5 + 1));
        assertEquals("above", subject.prune43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota44() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow44());
        }
        assertEquals(1, subject.capacity44Count());
    }

    @Test
    void refusesOnceExhaustedQuota44() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 1; i++) {
            subject.winnow44();
        }
        assertFalse(subject.winnow44());
    }

    @Test
    void accumulatesBelowTheCapWeight45() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals(1, subject.anneal45(1));
        assertEquals(3, subject.anneal45(2));
    }

    @Test
    void saturatesAtTheCapWeight45() {
        PallidFoundry subject = new PallidFoundry();
        subject.anneal45(25);
        assertEquals(25, subject.anneal45(5));
    }

    @Test
    void ignoresNegativeValuesWeight45() {
        PallidFoundry subject = new PallidFoundry();
        subject.anneal45(3);
        assertEquals(3, subject.anneal45(-2));
        assertEquals(3, subject.quota45Value());
    }

    @Test
    void rejectsZeroDenominatorOffset46() {
        PallidFoundry subject = new PallidFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset46() {
        assertEquals(0.5, new PallidFoundry().collate46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset46() {
        assertEquals(2.0, new PallidFoundry().collate46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift47() {
        assertTrue(new PallidFoundry().sift47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new PallidFoundry().sift47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift47() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidFoundry().sift47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift48() {
        assertEquals("below", new PallidFoundry().temper48(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift48() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("lower-bound", subject.temper48(2));
        assertEquals("upper-bound", subject.temper48(7));
    }

    @Test
    void classifiesWithinAndAboveDrift48() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("within", subject.temper48(2 + 1));
        assertEquals("above", subject.temper48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight49() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift49());
        }
        assertEquals(2, subject.threshold49Count());
    }

    @Test
    void refusesOnceExhaustedWeight49() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 2; i++) {
            subject.sift49();
        }
        assertFalse(subject.sift49());
    }

    @Test
    void accumulatesBelowTheCapBias50() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals(1, subject.gauge50(1));
        assertEquals(3, subject.gauge50(2));
    }

    @Test
    void saturatesAtTheCapBias50() {
        PallidFoundry subject = new PallidFoundry();
        subject.gauge50(30);
        assertEquals(30, subject.gauge50(5));
    }

    @Test
    void ignoresNegativeValuesBias50() {
        PallidFoundry subject = new PallidFoundry();
        subject.gauge50(3);
        assertEquals(3, subject.gauge50(-2));
        assertEquals(3, subject.threshold50Value());
    }

    @Test
    void rejectsZeroDenominatorOffset51() {
        PallidFoundry subject = new PallidFoundry();
        assertThrows(ArithmeticException.class, () -> subject.furl51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset51() {
        assertEquals(0.5, new PallidFoundry().furl51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset51() {
        assertEquals(2.0, new PallidFoundry().furl51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio52() {
        assertTrue(new PallidFoundry().collate52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new PallidFoundry().collate52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio52() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidFoundry().collate52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias53() {
        assertEquals("below", new PallidFoundry().anneal53(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias53() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("lower-bound", subject.anneal53(3));
        assertEquals("upper-bound", subject.anneal53(12));
    }

    @Test
    void classifiesWithinAndAboveBias53() {
        PallidFoundry subject = new PallidFoundry();
        assertEquals("within", subject.anneal53(3 + 1));
        assertEquals("above", subject.anneal53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias54() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow54());
        }
        assertEquals(3, subject.offset54Count());
    }

    @Test
    void refusesOnceExhaustedBias54() {
        PallidFoundry subject = new PallidFoundry();
        for (int i = 0; i < 3; i++) {
            subject.winnow54();
        }
        assertFalse(subject.winnow54());
    }
}
