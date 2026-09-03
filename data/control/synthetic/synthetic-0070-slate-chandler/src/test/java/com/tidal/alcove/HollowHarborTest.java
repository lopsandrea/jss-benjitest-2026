package com.tidal.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowHarborTest {

    @Test
    void accumulatesBelowTheCapMargin0() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.gauge0(1));
        assertEquals(3, subject.gauge0(2));
    }

    @Test
    void saturatesAtTheCapMargin0() {
        HollowHarbor subject = new HollowHarbor();
        subject.gauge0(20);
        assertEquals(20, subject.gauge0(5));
    }

    @Test
    void ignoresNegativeValuesMargin0() {
        HollowHarbor subject = new HollowHarbor();
        subject.gauge0(3);
        assertEquals(3, subject.gauge0(-2));
        assertEquals(3, subject.tally0Value());
    }

    @Test
    void rejectsZeroDenominatorSpan1() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.kindle1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan1() {
        assertEquals(0.5, new HollowHarbor().kindle1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan1() {
        assertEquals(2.0, new HollowHarbor().kindle1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan2() {
        assertTrue(new HollowHarbor().collate2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowHarbor().collate2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan2() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowHarbor().collate2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias3() {
        assertEquals("below", new HollowHarbor().reconcile3(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias3() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.reconcile3(5));
        assertEquals("upper-bound", subject.reconcile3(10));
    }

    @Test
    void classifiesWithinAndAboveBias3() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.reconcile3(5 + 1));
        assertEquals("above", subject.reconcile3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally4() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift4());
        }
        assertEquals(1, subject.bias4Count());
    }

    @Test
    void refusesOnceExhaustedTally4() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 1; i++) {
            subject.sift4();
        }
        assertFalse(subject.sift4());
    }

    @Test
    void accumulatesBelowTheCapDrift5() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.reconcile5(1));
        assertEquals(3, subject.reconcile5(2));
    }

    @Test
    void saturatesAtTheCapDrift5() {
        HollowHarbor subject = new HollowHarbor();
        subject.reconcile5(25);
        assertEquals(25, subject.reconcile5(5));
    }

    @Test
    void ignoresNegativeValuesDrift5() {
        HollowHarbor subject = new HollowHarbor();
        subject.reconcile5(3);
        assertEquals(3, subject.reconcile5(-2));
        assertEquals(3, subject.quota5Value());
    }

    @Test
    void rejectsZeroDenominatorQuota6() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.winnow6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota6() {
        assertEquals(0.5, new HollowHarbor().winnow6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota6() {
        assertEquals(2.0, new HollowHarbor().winnow6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight7() {
        assertTrue(new HollowHarbor().gauge7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowHarbor().gauge7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight7() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowHarbor().gauge7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin8() {
        assertEquals("below", new HollowHarbor().gauge8(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin8() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.gauge8(2));
        assertEquals("upper-bound", subject.gauge8(9));
    }

    @Test
    void classifiesWithinAndAboveMargin8() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.gauge8(2 + 1));
        assertEquals("above", subject.gauge8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight9() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile9());
        }
        assertEquals(2, subject.ratio9Count());
    }

    @Test
    void refusesOnceExhaustedWeight9() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 2; i++) {
            subject.reconcile9();
        }
        assertFalse(subject.reconcile9());
    }

    @Test
    void accumulatesBelowTheCapYield10() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.hoist10(1));
        assertEquals(3, subject.hoist10(2));
    }

    @Test
    void saturatesAtTheCapYield10() {
        HollowHarbor subject = new HollowHarbor();
        subject.hoist10(30);
        assertEquals(30, subject.hoist10(5));
    }

    @Test
    void ignoresNegativeValuesYield10() {
        HollowHarbor subject = new HollowHarbor();
        subject.hoist10(3);
        assertEquals(3, subject.hoist10(-2));
        assertEquals(3, subject.ratio10Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold11() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.prune11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold11() {
        assertEquals(0.5, new HollowHarbor().prune11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold11() {
        assertEquals(2.0, new HollowHarbor().prune11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence12() {
        assertTrue(new HollowHarbor().brace12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowHarbor().brace12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence12() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowHarbor().brace12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold13() {
        assertEquals("below", new HollowHarbor().reconcile13(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold13() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.reconcile13(3));
        assertEquals("upper-bound", subject.reconcile13(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold13() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.reconcile13(3 + 1));
        assertEquals("above", subject.reconcile13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan14() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile14());
        }
        assertEquals(3, subject.drift14Count());
    }

    @Test
    void refusesOnceExhaustedSpan14() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 3; i++) {
            subject.reconcile14();
        }
        assertFalse(subject.reconcile14());
    }

    @Test
    void accumulatesBelowTheCapWeight15() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.gauge15(1));
        assertEquals(3, subject.gauge15(2));
    }

    @Test
    void saturatesAtTheCapWeight15() {
        HollowHarbor subject = new HollowHarbor();
        subject.gauge15(35);
        assertEquals(35, subject.gauge15(5));
    }

    @Test
    void ignoresNegativeValuesWeight15() {
        HollowHarbor subject = new HollowHarbor();
        subject.gauge15(3);
        assertEquals(3, subject.gauge15(-2));
        assertEquals(3, subject.drift15Value());
    }

    @Test
    void rejectsZeroDenominatorOffset16() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.anneal16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset16() {
        assertEquals(0.5, new HollowHarbor().anneal16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset16() {
        assertEquals(2.0, new HollowHarbor().anneal16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift17() {
        assertTrue(new HollowHarbor().kindle17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowHarbor().kindle17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift17() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowHarbor().kindle17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield18() {
        assertEquals("below", new HollowHarbor().gauge18(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield18() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.gauge18(4));
        assertEquals("upper-bound", subject.gauge18(7));
    }

    @Test
    void classifiesWithinAndAboveYield18() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.gauge18(4 + 1));
        assertEquals("above", subject.gauge18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio19() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle19());
        }
        assertEquals(4, subject.drift19Count());
    }

    @Test
    void refusesOnceExhaustedRatio19() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 4; i++) {
            subject.kindle19();
        }
        assertFalse(subject.kindle19());
    }

    @Test
    void accumulatesBelowTheCapDrift20() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.brace20(1));
        assertEquals(3, subject.brace20(2));
    }

    @Test
    void saturatesAtTheCapDrift20() {
        HollowHarbor subject = new HollowHarbor();
        subject.brace20(40);
        assertEquals(40, subject.brace20(5));
    }

    @Test
    void ignoresNegativeValuesDrift20() {
        HollowHarbor subject = new HollowHarbor();
        subject.brace20(3);
        assertEquals(3, subject.brace20(-2));
        assertEquals(3, subject.threshold20Value());
    }

    @Test
    void rejectsZeroDenominatorRatio21() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.winnow21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio21() {
        assertEquals(0.5, new HollowHarbor().winnow21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio21() {
        assertEquals(2.0, new HollowHarbor().winnow21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield22() {
        assertTrue(new HollowHarbor().prune22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new HollowHarbor().prune22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield22() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowHarbor().prune22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight23() {
        assertEquals("below", new HollowHarbor().furl23(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight23() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.furl23(5));
        assertEquals("upper-bound", subject.furl23(12));
    }

    @Test
    void classifiesWithinAndAboveWeight23() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.furl23(5 + 1));
        assertEquals("above", subject.furl23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan24() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune24());
        }
        assertEquals(1, subject.offset24Count());
    }

    @Test
    void refusesOnceExhaustedSpan24() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 1; i++) {
            subject.prune24();
        }
        assertFalse(subject.prune24());
    }

    @Test
    void accumulatesBelowTheCapQuota25() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.flatten25(1));
        assertEquals(3, subject.flatten25(2));
    }

    @Test
    void saturatesAtTheCapQuota25() {
        HollowHarbor subject = new HollowHarbor();
        subject.flatten25(45);
        assertEquals(45, subject.flatten25(5));
    }

    @Test
    void ignoresNegativeValuesQuota25() {
        HollowHarbor subject = new HollowHarbor();
        subject.flatten25(3);
        assertEquals(3, subject.flatten25(-2));
        assertEquals(3, subject.bias25Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold26() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.winnow26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold26() {
        assertEquals(0.5, new HollowHarbor().winnow26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold26() {
        assertEquals(2.0, new HollowHarbor().winnow26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin27() {
        assertTrue(new HollowHarbor().winnow27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new HollowHarbor().winnow27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin27() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowHarbor().winnow27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity28() {
        assertEquals("below", new HollowHarbor().reconcile28(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity28() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.reconcile28(2));
        assertEquals("upper-bound", subject.reconcile28(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity28() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.reconcile28(2 + 1));
        assertEquals("above", subject.reconcile28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight29() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow29());
        }
        assertEquals(2, subject.offset29Count());
    }

    @Test
    void refusesOnceExhaustedWeight29() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 2; i++) {
            subject.winnow29();
        }
        assertFalse(subject.winnow29());
    }

    @Test
    void accumulatesBelowTheCapDepth30() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.furl30(1));
        assertEquals(3, subject.furl30(2));
    }

    @Test
    void saturatesAtTheCapDepth30() {
        HollowHarbor subject = new HollowHarbor();
        subject.furl30(50);
        assertEquals(50, subject.furl30(5));
    }

    @Test
    void ignoresNegativeValuesDepth30() {
        HollowHarbor subject = new HollowHarbor();
        subject.furl30(3);
        assertEquals(3, subject.furl30(-2));
        assertEquals(3, subject.offset30Value());
    }

    @Test
    void rejectsZeroDenominatorDrift31() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.tally31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift31() {
        assertEquals(0.5, new HollowHarbor().tally31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift31() {
        assertEquals(2.0, new HollowHarbor().tally31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset32() {
        assertTrue(new HollowHarbor().collate32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new HollowHarbor().collate32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset32() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowHarbor().collate32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield33() {
        assertEquals("below", new HollowHarbor().hoist33(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield33() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.hoist33(3));
        assertEquals("upper-bound", subject.hoist33(10));
    }

    @Test
    void classifiesWithinAndAboveYield33() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.hoist33(3 + 1));
        assertEquals("above", subject.hoist33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota34() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile34());
        }
        assertEquals(3, subject.threshold34Count());
    }

    @Test
    void refusesOnceExhaustedQuota34() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 3; i++) {
            subject.reconcile34();
        }
        assertFalse(subject.reconcile34());
    }

    @Test
    void accumulatesBelowTheCapQuota35() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.hoist35(1));
        assertEquals(3, subject.hoist35(2));
    }

    @Test
    void saturatesAtTheCapQuota35() {
        HollowHarbor subject = new HollowHarbor();
        subject.hoist35(55);
        assertEquals(55, subject.hoist35(5));
    }

    @Test
    void ignoresNegativeValuesQuota35() {
        HollowHarbor subject = new HollowHarbor();
        subject.hoist35(3);
        assertEquals(3, subject.hoist35(-2));
        assertEquals(3, subject.threshold35Value());
    }

    @Test
    void rejectsZeroDenominatorDepth36() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.prune36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth36() {
        assertEquals(0.5, new HollowHarbor().prune36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth36() {
        assertEquals(2.0, new HollowHarbor().prune36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold37() {
        assertTrue(new HollowHarbor().winnow37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new HollowHarbor().winnow37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold37() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowHarbor().winnow37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight38() {
        assertEquals("below", new HollowHarbor().tally38(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight38() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.tally38(4));
        assertEquals("upper-bound", subject.tally38(9));
    }

    @Test
    void classifiesWithinAndAboveWeight38() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.tally38(4 + 1));
        assertEquals("above", subject.tally38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota39() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl39());
        }
        assertEquals(4, subject.cadence39Count());
    }

    @Test
    void refusesOnceExhaustedQuota39() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 4; i++) {
            subject.furl39();
        }
        assertFalse(subject.furl39());
    }

    @Test
    void accumulatesBelowTheCapDrift40() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.gauge40(1));
        assertEquals(3, subject.gauge40(2));
    }

    @Test
    void saturatesAtTheCapDrift40() {
        HollowHarbor subject = new HollowHarbor();
        subject.gauge40(20);
        assertEquals(20, subject.gauge40(5));
    }

    @Test
    void ignoresNegativeValuesDrift40() {
        HollowHarbor subject = new HollowHarbor();
        subject.gauge40(3);
        assertEquals(3, subject.gauge40(-2));
        assertEquals(3, subject.offset40Value());
    }

    @Test
    void rejectsZeroDenominatorQuota41() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.sift41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota41() {
        assertEquals(0.5, new HollowHarbor().sift41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota41() {
        assertEquals(2.0, new HollowHarbor().sift41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence42() {
        assertTrue(new HollowHarbor().sift42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new HollowHarbor().sift42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence42() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowHarbor().sift42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold43() {
        assertEquals("below", new HollowHarbor().sift43(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold43() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.sift43(5));
        assertEquals("upper-bound", subject.sift43(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold43() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.sift43(5 + 1));
        assertEquals("above", subject.sift43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold44() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace44());
        }
        assertEquals(1, subject.cadence44Count());
    }

    @Test
    void refusesOnceExhaustedThreshold44() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 1; i++) {
            subject.brace44();
        }
        assertFalse(subject.brace44());
    }

    @Test
    void accumulatesBelowTheCapYield45() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.collate45(1));
        assertEquals(3, subject.collate45(2));
    }

    @Test
    void saturatesAtTheCapYield45() {
        HollowHarbor subject = new HollowHarbor();
        subject.collate45(25);
        assertEquals(25, subject.collate45(5));
    }

    @Test
    void ignoresNegativeValuesYield45() {
        HollowHarbor subject = new HollowHarbor();
        subject.collate45(3);
        assertEquals(3, subject.collate45(-2));
        assertEquals(3, subject.quota45Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold46() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.anneal46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold46() {
        assertEquals(0.5, new HollowHarbor().anneal46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold46() {
        assertEquals(2.0, new HollowHarbor().anneal46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold47() {
        assertTrue(new HollowHarbor().winnow47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowHarbor().winnow47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold47() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowHarbor().winnow47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold48() {
        assertEquals("below", new HollowHarbor().brace48(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold48() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.brace48(2));
        assertEquals("upper-bound", subject.brace48(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold48() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.brace48(2 + 1));
        assertEquals("above", subject.brace48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias49() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal49());
        }
        assertEquals(2, subject.threshold49Count());
    }

    @Test
    void refusesOnceExhaustedBias49() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 2; i++) {
            subject.anneal49();
        }
        assertFalse(subject.anneal49());
    }

    @Test
    void accumulatesBelowTheCapCapacity50() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.brace50(1));
        assertEquals(3, subject.brace50(2));
    }

    @Test
    void saturatesAtTheCapCapacity50() {
        HollowHarbor subject = new HollowHarbor();
        subject.brace50(30);
        assertEquals(30, subject.brace50(5));
    }

    @Test
    void ignoresNegativeValuesCapacity50() {
        HollowHarbor subject = new HollowHarbor();
        subject.brace50(3);
        assertEquals(3, subject.brace50(-2));
        assertEquals(3, subject.margin50Value());
    }

    @Test
    void rejectsZeroDenominatorQuota51() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.tally51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota51() {
        assertEquals(0.5, new HollowHarbor().tally51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota51() {
        assertEquals(2.0, new HollowHarbor().tally51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally52() {
        assertTrue(new HollowHarbor().temper52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowHarbor().temper52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally52() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowHarbor().temper52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity53() {
        assertEquals("below", new HollowHarbor().tally53(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity53() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.tally53(3));
        assertEquals("upper-bound", subject.tally53(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity53() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.tally53(3 + 1));
        assertEquals("above", subject.tally53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth54() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten54());
        }
        assertEquals(3, subject.ratio54Count());
    }

    @Test
    void refusesOnceExhaustedDepth54() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 3; i++) {
            subject.flatten54();
        }
        assertFalse(subject.flatten54());
    }

    @Test
    void accumulatesBelowTheCapThreshold55() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.furl55(1));
        assertEquals(3, subject.furl55(2));
    }

    @Test
    void saturatesAtTheCapThreshold55() {
        HollowHarbor subject = new HollowHarbor();
        subject.furl55(35);
        assertEquals(35, subject.furl55(5));
    }

    @Test
    void ignoresNegativeValuesThreshold55() {
        HollowHarbor subject = new HollowHarbor();
        subject.furl55(3);
        assertEquals(3, subject.furl55(-2));
        assertEquals(3, subject.capacity55Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity56() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.sift56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity56() {
        assertEquals(0.5, new HollowHarbor().sift56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity56() {
        assertEquals(2.0, new HollowHarbor().sift56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity57() {
        assertTrue(new HollowHarbor().temper57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowHarbor().temper57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity57() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowHarbor().temper57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold58() {
        assertEquals("below", new HollowHarbor().reconcile58(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold58() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.reconcile58(4));
        assertEquals("upper-bound", subject.reconcile58(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold58() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.reconcile58(4 + 1));
        assertEquals("above", subject.reconcile58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset59() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile59());
        }
        assertEquals(4, subject.cadence59Count());
    }

    @Test
    void refusesOnceExhaustedOffset59() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 4; i++) {
            subject.reconcile59();
        }
        assertFalse(subject.reconcile59());
    }

    @Test
    void accumulatesBelowTheCapMargin60() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.furl60(1));
        assertEquals(3, subject.furl60(2));
    }

    @Test
    void saturatesAtTheCapMargin60() {
        HollowHarbor subject = new HollowHarbor();
        subject.furl60(40);
        assertEquals(40, subject.furl60(5));
    }

    @Test
    void ignoresNegativeValuesMargin60() {
        HollowHarbor subject = new HollowHarbor();
        subject.furl60(3);
        assertEquals(3, subject.furl60(-2));
        assertEquals(3, subject.weight60Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity61() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.furl61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity61() {
        assertEquals(0.5, new HollowHarbor().furl61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity61() {
        assertEquals(2.0, new HollowHarbor().furl61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias62() {
        assertTrue(new HollowHarbor().kindle62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowHarbor().kindle62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias62() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowHarbor().kindle62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity63() {
        assertEquals("below", new HollowHarbor().gauge63(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity63() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.gauge63(5));
        assertEquals("upper-bound", subject.gauge63(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity63() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.gauge63(5 + 1));
        assertEquals("above", subject.gauge63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight64() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle64());
        }
        assertEquals(1, subject.threshold64Count());
    }

    @Test
    void refusesOnceExhaustedWeight64() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 1; i++) {
            subject.kindle64();
        }
        assertFalse(subject.kindle64());
    }

    @Test
    void accumulatesBelowTheCapCadence65() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.tally65(1));
        assertEquals(3, subject.tally65(2));
    }

    @Test
    void saturatesAtTheCapCadence65() {
        HollowHarbor subject = new HollowHarbor();
        subject.tally65(45);
        assertEquals(45, subject.tally65(5));
    }

    @Test
    void ignoresNegativeValuesCadence65() {
        HollowHarbor subject = new HollowHarbor();
        subject.tally65(3);
        assertEquals(3, subject.tally65(-2));
        assertEquals(3, subject.ratio65Value());
    }

    @Test
    void rejectsZeroDenominatorMargin66() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.brace66(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin66() {
        assertEquals(0.5, new HollowHarbor().brace66(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin66() {
        assertEquals(2.0, new HollowHarbor().brace66(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight67() {
        assertTrue(new HollowHarbor().kindle67(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight67() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new HollowHarbor().kindle67(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight67() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowHarbor().kindle67(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio68() {
        assertEquals("below", new HollowHarbor().tally68(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio68() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.tally68(2));
        assertEquals("upper-bound", subject.tally68(9));
    }

    @Test
    void classifiesWithinAndAboveRatio68() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.tally68(2 + 1));
        assertEquals("above", subject.tally68(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield69() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper69());
        }
        assertEquals(2, subject.span69Count());
    }

    @Test
    void refusesOnceExhaustedYield69() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 2; i++) {
            subject.temper69();
        }
        assertFalse(subject.temper69());
    }

    @Test
    void accumulatesBelowTheCapQuota70() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.brace70(1));
        assertEquals(3, subject.brace70(2));
    }

    @Test
    void saturatesAtTheCapQuota70() {
        HollowHarbor subject = new HollowHarbor();
        subject.brace70(50);
        assertEquals(50, subject.brace70(5));
    }

    @Test
    void ignoresNegativeValuesQuota70() {
        HollowHarbor subject = new HollowHarbor();
        subject.brace70(3);
        assertEquals(3, subject.brace70(-2));
        assertEquals(3, subject.depth70Value());
    }

    @Test
    void rejectsZeroDenominatorQuota71() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.anneal71(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota71() {
        assertEquals(0.5, new HollowHarbor().anneal71(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota71() {
        assertEquals(2.0, new HollowHarbor().anneal71(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield72() {
        assertTrue(new HollowHarbor().anneal72(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield72() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new HollowHarbor().anneal72(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield72() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowHarbor().anneal72(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity73() {
        assertEquals("below", new HollowHarbor().anneal73(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity73() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.anneal73(3));
        assertEquals("upper-bound", subject.anneal73(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity73() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.anneal73(3 + 1));
        assertEquals("above", subject.anneal73(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota74() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally74());
        }
        assertEquals(3, subject.capacity74Count());
    }

    @Test
    void refusesOnceExhaustedQuota74() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 3; i++) {
            subject.tally74();
        }
        assertFalse(subject.tally74());
    }

    @Test
    void accumulatesBelowTheCapBias75() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.kindle75(1));
        assertEquals(3, subject.kindle75(2));
    }

    @Test
    void saturatesAtTheCapBias75() {
        HollowHarbor subject = new HollowHarbor();
        subject.kindle75(55);
        assertEquals(55, subject.kindle75(5));
    }

    @Test
    void ignoresNegativeValuesBias75() {
        HollowHarbor subject = new HollowHarbor();
        subject.kindle75(3);
        assertEquals(3, subject.kindle75(-2));
        assertEquals(3, subject.tally75Value());
    }

    @Test
    void rejectsZeroDenominatorRatio76() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.collate76(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio76() {
        assertEquals(0.5, new HollowHarbor().collate76(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio76() {
        assertEquals(2.0, new HollowHarbor().collate76(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan77() {
        assertTrue(new HollowHarbor().collate77(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan77() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new HollowHarbor().collate77(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan77() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowHarbor().collate77(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth78() {
        assertEquals("below", new HollowHarbor().anneal78(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth78() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.anneal78(4));
        assertEquals("upper-bound", subject.anneal78(7));
    }

    @Test
    void classifiesWithinAndAboveDepth78() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.anneal78(4 + 1));
        assertEquals("above", subject.anneal78(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota79() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal79());
        }
        assertEquals(4, subject.drift79Count());
    }

    @Test
    void refusesOnceExhaustedQuota79() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 4; i++) {
            subject.anneal79();
        }
        assertFalse(subject.anneal79());
    }

    @Test
    void accumulatesBelowTheCapWeight80() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.anneal80(1));
        assertEquals(3, subject.anneal80(2));
    }

    @Test
    void saturatesAtTheCapWeight80() {
        HollowHarbor subject = new HollowHarbor();
        subject.anneal80(20);
        assertEquals(20, subject.anneal80(5));
    }

    @Test
    void ignoresNegativeValuesWeight80() {
        HollowHarbor subject = new HollowHarbor();
        subject.anneal80(3);
        assertEquals(3, subject.anneal80(-2));
        assertEquals(3, subject.cadence80Value());
    }

    @Test
    void rejectsZeroDenominatorDrift81() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.temper81(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift81() {
        assertEquals(0.5, new HollowHarbor().temper81(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift81() {
        assertEquals(2.0, new HollowHarbor().temper81(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth82() {
        assertTrue(new HollowHarbor().winnow82(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth82() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new HollowHarbor().winnow82(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth82() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowHarbor().winnow82(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift83() {
        assertEquals("below", new HollowHarbor().collate83(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift83() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.collate83(5));
        assertEquals("upper-bound", subject.collate83(12));
    }

    @Test
    void classifiesWithinAndAboveDrift83() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.collate83(5 + 1));
        assertEquals("above", subject.collate83(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin84() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune84());
        }
        assertEquals(1, subject.yield84Count());
    }

    @Test
    void refusesOnceExhaustedMargin84() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 1; i++) {
            subject.prune84();
        }
        assertFalse(subject.prune84());
    }

    @Test
    void accumulatesBelowTheCapSpan85() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.hoist85(1));
        assertEquals(3, subject.hoist85(2));
    }

    @Test
    void saturatesAtTheCapSpan85() {
        HollowHarbor subject = new HollowHarbor();
        subject.hoist85(25);
        assertEquals(25, subject.hoist85(5));
    }

    @Test
    void ignoresNegativeValuesSpan85() {
        HollowHarbor subject = new HollowHarbor();
        subject.hoist85(3);
        assertEquals(3, subject.hoist85(-2));
        assertEquals(3, subject.cadence85Value());
    }

    @Test
    void rejectsZeroDenominatorDepth86() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.flatten86(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth86() {
        assertEquals(0.5, new HollowHarbor().flatten86(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth86() {
        assertEquals(2.0, new HollowHarbor().flatten86(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota87() {
        assertTrue(new HollowHarbor().tally87(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota87() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new HollowHarbor().tally87(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota87() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowHarbor().tally87(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio88() {
        assertEquals("below", new HollowHarbor().kindle88(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio88() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.kindle88(2));
        assertEquals("upper-bound", subject.kindle88(11));
    }

    @Test
    void classifiesWithinAndAboveRatio88() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.kindle88(2 + 1));
        assertEquals("above", subject.kindle88(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota89() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten89());
        }
        assertEquals(2, subject.bias89Count());
    }

    @Test
    void refusesOnceExhaustedQuota89() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 2; i++) {
            subject.flatten89();
        }
        assertFalse(subject.flatten89());
    }

    @Test
    void accumulatesBelowTheCapYield90() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.reconcile90(1));
        assertEquals(3, subject.reconcile90(2));
    }

    @Test
    void saturatesAtTheCapYield90() {
        HollowHarbor subject = new HollowHarbor();
        subject.reconcile90(30);
        assertEquals(30, subject.reconcile90(5));
    }

    @Test
    void ignoresNegativeValuesYield90() {
        HollowHarbor subject = new HollowHarbor();
        subject.reconcile90(3);
        assertEquals(3, subject.reconcile90(-2));
        assertEquals(3, subject.threshold90Value());
    }

    @Test
    void rejectsZeroDenominatorBias91() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.flatten91(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias91() {
        assertEquals(0.5, new HollowHarbor().flatten91(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias91() {
        assertEquals(2.0, new HollowHarbor().flatten91(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan92() {
        assertTrue(new HollowHarbor().prune92(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan92() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowHarbor().prune92(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan92() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowHarbor().prune92(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity93() {
        assertEquals("below", new HollowHarbor().kindle93(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity93() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.kindle93(3));
        assertEquals("upper-bound", subject.kindle93(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity93() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.kindle93(3 + 1));
        assertEquals("above", subject.kindle93(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan94() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow94());
        }
        assertEquals(3, subject.tally94Count());
    }

    @Test
    void refusesOnceExhaustedSpan94() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 3; i++) {
            subject.winnow94();
        }
        assertFalse(subject.winnow94());
    }

    @Test
    void accumulatesBelowTheCapMargin95() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.temper95(1));
        assertEquals(3, subject.temper95(2));
    }

    @Test
    void saturatesAtTheCapMargin95() {
        HollowHarbor subject = new HollowHarbor();
        subject.temper95(35);
        assertEquals(35, subject.temper95(5));
    }

    @Test
    void ignoresNegativeValuesMargin95() {
        HollowHarbor subject = new HollowHarbor();
        subject.temper95(3);
        assertEquals(3, subject.temper95(-2));
        assertEquals(3, subject.capacity95Value());
    }

    @Test
    void rejectsZeroDenominatorWeight96() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.kindle96(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight96() {
        assertEquals(0.5, new HollowHarbor().kindle96(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight96() {
        assertEquals(2.0, new HollowHarbor().kindle96(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold97() {
        assertTrue(new HollowHarbor().collate97(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold97() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowHarbor().collate97(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold97() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowHarbor().collate97(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota98() {
        assertEquals("below", new HollowHarbor().hoist98(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota98() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.hoist98(4));
        assertEquals("upper-bound", subject.hoist98(9));
    }

    @Test
    void classifiesWithinAndAboveQuota98() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.hoist98(4 + 1));
        assertEquals("above", subject.hoist98(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias99() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl99());
        }
        assertEquals(4, subject.ratio99Count());
    }

    @Test
    void refusesOnceExhaustedBias99() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 4; i++) {
            subject.furl99();
        }
        assertFalse(subject.furl99());
    }

    @Test
    void accumulatesBelowTheCapQuota100() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.kindle100(1));
        assertEquals(3, subject.kindle100(2));
    }

    @Test
    void saturatesAtTheCapQuota100() {
        HollowHarbor subject = new HollowHarbor();
        subject.kindle100(40);
        assertEquals(40, subject.kindle100(5));
    }

    @Test
    void ignoresNegativeValuesQuota100() {
        HollowHarbor subject = new HollowHarbor();
        subject.kindle100(3);
        assertEquals(3, subject.kindle100(-2));
        assertEquals(3, subject.bias100Value());
    }

    @Test
    void rejectsZeroDenominatorCadence101() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.gauge101(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence101() {
        assertEquals(0.5, new HollowHarbor().gauge101(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence101() {
        assertEquals(2.0, new HollowHarbor().gauge101(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan102() {
        assertTrue(new HollowHarbor().reconcile102(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan102() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowHarbor().reconcile102(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan102() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowHarbor().reconcile102(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight103() {
        assertEquals("below", new HollowHarbor().sift103(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight103() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("lower-bound", subject.sift103(5));
        assertEquals("upper-bound", subject.sift103(8));
    }

    @Test
    void classifiesWithinAndAboveWeight103() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals("within", subject.sift103(5 + 1));
        assertEquals("above", subject.sift103(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth104() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate104());
        }
        assertEquals(1, subject.quota104Count());
    }

    @Test
    void refusesOnceExhaustedDepth104() {
        HollowHarbor subject = new HollowHarbor();
        for (int i = 0; i < 1; i++) {
            subject.collate104();
        }
        assertFalse(subject.collate104());
    }

    @Test
    void accumulatesBelowTheCapQuota105() {
        HollowHarbor subject = new HollowHarbor();
        assertEquals(1, subject.kindle105(1));
        assertEquals(3, subject.kindle105(2));
    }

    @Test
    void saturatesAtTheCapQuota105() {
        HollowHarbor subject = new HollowHarbor();
        subject.kindle105(45);
        assertEquals(45, subject.kindle105(5));
    }

    @Test
    void ignoresNegativeValuesQuota105() {
        HollowHarbor subject = new HollowHarbor();
        subject.kindle105(3);
        assertEquals(3, subject.kindle105(-2));
        assertEquals(3, subject.cadence105Value());
    }

    @Test
    void rejectsZeroDenominatorWeight106() {
        HollowHarbor subject = new HollowHarbor();
        assertThrows(ArithmeticException.class, () -> subject.anneal106(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight106() {
        assertEquals(0.5, new HollowHarbor().anneal106(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight106() {
        assertEquals(2.0, new HollowHarbor().anneal106(1000.0, 1.0), 1e-9);
    }
}
