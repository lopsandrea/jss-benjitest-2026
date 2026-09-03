package com.tidal.thicket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleHarborTest {

    @Test
    void rejectsZeroDenominatorTally0() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.temper0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally0() {
        assertEquals(0.5, new BrambleHarbor().temper0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally0() {
        assertEquals(1.0, new BrambleHarbor().temper0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset1() {
        assertTrue(new BrambleHarbor().hoist1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new BrambleHarbor().hoist1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset1() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleHarbor().hoist1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan2() {
        assertEquals("below", new BrambleHarbor().sift2(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan2() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.sift2(4));
        assertEquals("upper-bound", subject.sift2(9));
    }

    @Test
    void classifiesWithinAndAboveSpan2() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.sift2(4 + 1));
        assertEquals("above", subject.sift2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold3() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally3());
        }
        assertEquals(4, subject.depth3Count());
    }

    @Test
    void refusesOnceExhaustedThreshold3() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 4; i++) {
            subject.tally3();
        }
        assertFalse(subject.tally3());
    }

    @Test
    void accumulatesBelowTheCapTally4() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals(1, subject.reconcile4(1));
        assertEquals(3, subject.reconcile4(2));
    }

    @Test
    void saturatesAtTheCapTally4() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.reconcile4(24);
        assertEquals(24, subject.reconcile4(5));
    }

    @Test
    void ignoresNegativeValuesTally4() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.reconcile4(3);
        assertEquals(3, subject.reconcile4(-2));
        assertEquals(3, subject.margin4Value());
    }

    @Test
    void rejectsZeroDenominatorWeight5() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.tally5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight5() {
        assertEquals(0.5, new BrambleHarbor().tally5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight5() {
        assertEquals(1.0, new BrambleHarbor().tally5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan6() {
        assertTrue(new BrambleHarbor().anneal6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new BrambleHarbor().anneal6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan6() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleHarbor().anneal6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight7() {
        assertEquals("below", new BrambleHarbor().prune7(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight7() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.prune7(5));
        assertEquals("upper-bound", subject.prune7(8));
    }

    @Test
    void classifiesWithinAndAboveWeight7() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.prune7(5 + 1));
        assertEquals("above", subject.prune7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio8() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal8());
        }
        assertEquals(1, subject.yield8Count());
    }

    @Test
    void refusesOnceExhaustedRatio8() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 1; i++) {
            subject.anneal8();
        }
        assertFalse(subject.anneal8());
    }

    @Test
    void accumulatesBelowTheCapBias9() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals(1, subject.hoist9(1));
        assertEquals(3, subject.hoist9(2));
    }

    @Test
    void saturatesAtTheCapBias9() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.hoist9(29);
        assertEquals(29, subject.hoist9(5));
    }

    @Test
    void ignoresNegativeValuesBias9() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.hoist9(3);
        assertEquals(3, subject.hoist9(-2));
        assertEquals(3, subject.yield9Value());
    }

    @Test
    void rejectsZeroDenominatorTally10() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.collate10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally10() {
        assertEquals(0.5, new BrambleHarbor().collate10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally10() {
        assertEquals(1.0, new BrambleHarbor().collate10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth11() {
        assertTrue(new BrambleHarbor().temper11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new BrambleHarbor().temper11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth11() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleHarbor().temper11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset12() {
        assertEquals("below", new BrambleHarbor().tally12(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset12() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.tally12(2));
        assertEquals("upper-bound", subject.tally12(7));
    }

    @Test
    void classifiesWithinAndAboveOffset12() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.tally12(2 + 1));
        assertEquals("above", subject.tally12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence13() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper13());
        }
        assertEquals(2, subject.span13Count());
    }

    @Test
    void refusesOnceExhaustedCadence13() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 2; i++) {
            subject.temper13();
        }
        assertFalse(subject.temper13());
    }

    @Test
    void accumulatesBelowTheCapQuota14() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals(1, subject.gauge14(1));
        assertEquals(3, subject.gauge14(2));
    }

    @Test
    void saturatesAtTheCapQuota14() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.gauge14(34);
        assertEquals(34, subject.gauge14(5));
    }

    @Test
    void ignoresNegativeValuesQuota14() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.gauge14(3);
        assertEquals(3, subject.gauge14(-2));
        assertEquals(3, subject.bias14Value());
    }

    @Test
    void rejectsZeroDenominatorBias15() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.collate15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias15() {
        assertEquals(0.5, new BrambleHarbor().collate15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias15() {
        assertEquals(1.0, new BrambleHarbor().collate15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth16() {
        assertTrue(new BrambleHarbor().flatten16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new BrambleHarbor().flatten16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth16() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleHarbor().flatten16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity17() {
        assertEquals("below", new BrambleHarbor().reconcile17(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity17() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.reconcile17(3));
        assertEquals("upper-bound", subject.reconcile17(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity17() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.reconcile17(3 + 1));
        assertEquals("above", subject.reconcile17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth18() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate18());
        }
        assertEquals(3, subject.quota18Count());
    }

    @Test
    void refusesOnceExhaustedDepth18() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 3; i++) {
            subject.collate18();
        }
        assertFalse(subject.collate18());
    }

    @Test
    void accumulatesBelowTheCapThreshold19() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals(1, subject.tally19(1));
        assertEquals(3, subject.tally19(2));
    }

    @Test
    void saturatesAtTheCapThreshold19() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.tally19(39);
        assertEquals(39, subject.tally19(5));
    }

    @Test
    void ignoresNegativeValuesThreshold19() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.tally19(3);
        assertEquals(3, subject.tally19(-2));
        assertEquals(3, subject.cadence19Value());
    }

    @Test
    void rejectsZeroDenominatorCadence20() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.temper20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence20() {
        assertEquals(0.5, new BrambleHarbor().temper20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence20() {
        assertEquals(1.0, new BrambleHarbor().temper20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity21() {
        assertTrue(new BrambleHarbor().reconcile21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new BrambleHarbor().reconcile21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity21() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleHarbor().reconcile21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota22() {
        assertEquals("below", new BrambleHarbor().tally22(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota22() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.tally22(4));
        assertEquals("upper-bound", subject.tally22(11));
    }

    @Test
    void classifiesWithinAndAboveQuota22() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.tally22(4 + 1));
        assertEquals("above", subject.tally22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold23() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift23());
        }
        assertEquals(4, subject.yield23Count());
    }

    @Test
    void refusesOnceExhaustedThreshold23() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 4; i++) {
            subject.sift23();
        }
        assertFalse(subject.sift23());
    }

    @Test
    void accumulatesBelowTheCapOffset24() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals(1, subject.brace24(1));
        assertEquals(3, subject.brace24(2));
    }

    @Test
    void saturatesAtTheCapOffset24() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.brace24(44);
        assertEquals(44, subject.brace24(5));
    }

    @Test
    void ignoresNegativeValuesOffset24() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.brace24(3);
        assertEquals(3, subject.brace24(-2));
        assertEquals(3, subject.tally24Value());
    }

    @Test
    void rejectsZeroDenominatorCadence25() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.furl25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence25() {
        assertEquals(0.5, new BrambleHarbor().furl25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence25() {
        assertEquals(1.0, new BrambleHarbor().furl25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin26() {
        assertTrue(new BrambleHarbor().furl26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new BrambleHarbor().furl26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin26() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleHarbor().furl26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias27() {
        assertEquals("below", new BrambleHarbor().hoist27(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias27() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.hoist27(5));
        assertEquals("upper-bound", subject.hoist27(10));
    }

    @Test
    void classifiesWithinAndAboveBias27() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.hoist27(5 + 1));
        assertEquals("above", subject.hoist27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias28() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow28());
        }
        assertEquals(1, subject.capacity28Count());
    }

    @Test
    void refusesOnceExhaustedBias28() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 1; i++) {
            subject.winnow28();
        }
        assertFalse(subject.winnow28());
    }

    @Test
    void accumulatesBelowTheCapDepth29() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals(1, subject.collate29(1));
        assertEquals(3, subject.collate29(2));
    }

    @Test
    void saturatesAtTheCapDepth29() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.collate29(49);
        assertEquals(49, subject.collate29(5));
    }

    @Test
    void ignoresNegativeValuesDepth29() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.collate29(3);
        assertEquals(3, subject.collate29(-2));
        assertEquals(3, subject.quota29Value());
    }

    @Test
    void rejectsZeroDenominatorQuota30() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.winnow30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota30() {
        assertEquals(0.5, new BrambleHarbor().winnow30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota30() {
        assertEquals(1.0, new BrambleHarbor().winnow30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias31() {
        assertTrue(new BrambleHarbor().furl31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new BrambleHarbor().furl31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias31() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleHarbor().furl31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth32() {
        assertEquals("below", new BrambleHarbor().tally32(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth32() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.tally32(2));
        assertEquals("upper-bound", subject.tally32(9));
    }

    @Test
    void classifiesWithinAndAboveDepth32() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.tally32(2 + 1));
        assertEquals("above", subject.tally32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset33() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle33());
        }
        assertEquals(2, subject.depth33Count());
    }

    @Test
    void refusesOnceExhaustedOffset33() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 2; i++) {
            subject.kindle33();
        }
        assertFalse(subject.kindle33());
    }

    @Test
    void accumulatesBelowTheCapDepth34() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals(1, subject.prune34(1));
        assertEquals(3, subject.prune34(2));
    }

    @Test
    void saturatesAtTheCapDepth34() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.prune34(54);
        assertEquals(54, subject.prune34(5));
    }

    @Test
    void ignoresNegativeValuesDepth34() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.prune34(3);
        assertEquals(3, subject.prune34(-2));
        assertEquals(3, subject.threshold34Value());
    }

    @Test
    void rejectsZeroDenominatorYield35() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.flatten35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield35() {
        assertEquals(0.5, new BrambleHarbor().flatten35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield35() {
        assertEquals(1.0, new BrambleHarbor().flatten35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity36() {
        assertTrue(new BrambleHarbor().anneal36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new BrambleHarbor().anneal36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity36() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleHarbor().anneal36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight37() {
        assertEquals("below", new BrambleHarbor().prune37(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight37() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.prune37(3));
        assertEquals("upper-bound", subject.prune37(8));
    }

    @Test
    void classifiesWithinAndAboveWeight37() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.prune37(3 + 1));
        assertEquals("above", subject.prune37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity38() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally38());
        }
        assertEquals(3, subject.tally38Count());
    }

    @Test
    void refusesOnceExhaustedCapacity38() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 3; i++) {
            subject.tally38();
        }
        assertFalse(subject.tally38());
    }

    @Test
    void accumulatesBelowTheCapTally39() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals(1, subject.tally39(1));
        assertEquals(3, subject.tally39(2));
    }

    @Test
    void saturatesAtTheCapTally39() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.tally39(59);
        assertEquals(59, subject.tally39(5));
    }

    @Test
    void ignoresNegativeValuesTally39() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.tally39(3);
        assertEquals(3, subject.tally39(-2));
        assertEquals(3, subject.ratio39Value());
    }

    @Test
    void rejectsZeroDenominatorOffset40() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.brace40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset40() {
        assertEquals(0.5, new BrambleHarbor().brace40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset40() {
        assertEquals(1.0, new BrambleHarbor().brace40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota41() {
        assertTrue(new BrambleHarbor().winnow41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new BrambleHarbor().winnow41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota41() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleHarbor().winnow41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth42() {
        assertEquals("below", new BrambleHarbor().prune42(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth42() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.prune42(4));
        assertEquals("upper-bound", subject.prune42(7));
    }

    @Test
    void classifiesWithinAndAboveDepth42() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.prune42(4 + 1));
        assertEquals("above", subject.prune42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight43() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow43());
        }
        assertEquals(4, subject.ratio43Count());
    }

    @Test
    void refusesOnceExhaustedWeight43() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 4; i++) {
            subject.winnow43();
        }
        assertFalse(subject.winnow43());
    }

    @Test
    void accumulatesBelowTheCapTally44() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals(1, subject.brace44(1));
        assertEquals(3, subject.brace44(2));
    }

    @Test
    void saturatesAtTheCapTally44() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.brace44(24);
        assertEquals(24, subject.brace44(5));
    }

    @Test
    void ignoresNegativeValuesTally44() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.brace44(3);
        assertEquals(3, subject.brace44(-2));
        assertEquals(3, subject.threshold44Value());
    }

    @Test
    void rejectsZeroDenominatorBias45() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.tally45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias45() {
        assertEquals(0.5, new BrambleHarbor().tally45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias45() {
        assertEquals(1.0, new BrambleHarbor().tally45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio46() {
        assertTrue(new BrambleHarbor().temper46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new BrambleHarbor().temper46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio46() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleHarbor().temper46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift47() {
        assertEquals("below", new BrambleHarbor().winnow47(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift47() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.winnow47(5));
        assertEquals("upper-bound", subject.winnow47(12));
    }

    @Test
    void classifiesWithinAndAboveDrift47() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.winnow47(5 + 1));
        assertEquals("above", subject.winnow47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin48() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift48());
        }
        assertEquals(1, subject.threshold48Count());
    }

    @Test
    void refusesOnceExhaustedMargin48() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 1; i++) {
            subject.sift48();
        }
        assertFalse(subject.sift48());
    }

    @Test
    void accumulatesBelowTheCapCadence49() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals(1, subject.flatten49(1));
        assertEquals(3, subject.flatten49(2));
    }

    @Test
    void saturatesAtTheCapCadence49() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.flatten49(29);
        assertEquals(29, subject.flatten49(5));
    }

    @Test
    void ignoresNegativeValuesCadence49() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.flatten49(3);
        assertEquals(3, subject.flatten49(-2));
        assertEquals(3, subject.quota49Value());
    }

    @Test
    void rejectsZeroDenominatorSpan50() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.brace50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan50() {
        assertEquals(0.5, new BrambleHarbor().brace50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan50() {
        assertEquals(1.0, new BrambleHarbor().brace50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth51() {
        assertTrue(new BrambleHarbor().hoist51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new BrambleHarbor().hoist51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth51() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleHarbor().hoist51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset52() {
        assertEquals("below", new BrambleHarbor().reconcile52(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset52() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.reconcile52(2));
        assertEquals("upper-bound", subject.reconcile52(11));
    }

    @Test
    void classifiesWithinAndAboveOffset52() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.reconcile52(2 + 1));
        assertEquals("above", subject.reconcile52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota53() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow53());
        }
        assertEquals(2, subject.threshold53Count());
    }

    @Test
    void refusesOnceExhaustedQuota53() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 2; i++) {
            subject.winnow53();
        }
        assertFalse(subject.winnow53());
    }

    @Test
    void accumulatesBelowTheCapYield54() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals(1, subject.reconcile54(1));
        assertEquals(3, subject.reconcile54(2));
    }

    @Test
    void saturatesAtTheCapYield54() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.reconcile54(34);
        assertEquals(34, subject.reconcile54(5));
    }

    @Test
    void ignoresNegativeValuesYield54() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.reconcile54(3);
        assertEquals(3, subject.reconcile54(-2));
        assertEquals(3, subject.weight54Value());
    }

    @Test
    void rejectsZeroDenominatorQuota55() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.prune55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota55() {
        assertEquals(0.5, new BrambleHarbor().prune55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota55() {
        assertEquals(1.0, new BrambleHarbor().prune55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity56() {
        assertTrue(new BrambleHarbor().reconcile56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new BrambleHarbor().reconcile56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity56() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleHarbor().reconcile56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset57() {
        assertEquals("below", new BrambleHarbor().winnow57(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset57() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.winnow57(3));
        assertEquals("upper-bound", subject.winnow57(10));
    }

    @Test
    void classifiesWithinAndAboveOffset57() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.winnow57(3 + 1));
        assertEquals("above", subject.winnow57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift58() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl58());
        }
        assertEquals(3, subject.span58Count());
    }

    @Test
    void refusesOnceExhaustedDrift58() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 3; i++) {
            subject.furl58();
        }
        assertFalse(subject.furl58());
    }

    @Test
    void accumulatesBelowTheCapSpan59() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals(1, subject.kindle59(1));
        assertEquals(3, subject.kindle59(2));
    }

    @Test
    void saturatesAtTheCapSpan59() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.kindle59(39);
        assertEquals(39, subject.kindle59(5));
    }

    @Test
    void ignoresNegativeValuesSpan59() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.kindle59(3);
        assertEquals(3, subject.kindle59(-2));
        assertEquals(3, subject.cadence59Value());
    }

    @Test
    void rejectsZeroDenominatorOffset60() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.anneal60(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset60() {
        assertEquals(0.5, new BrambleHarbor().anneal60(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset60() {
        assertEquals(1.0, new BrambleHarbor().anneal60(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio61() {
        assertTrue(new BrambleHarbor().winnow61(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio61() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new BrambleHarbor().winnow61(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio61() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleHarbor().winnow61(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally62() {
        assertEquals("below", new BrambleHarbor().collate62(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally62() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.collate62(4));
        assertEquals("upper-bound", subject.collate62(9));
    }

    @Test
    void classifiesWithinAndAboveTally62() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.collate62(4 + 1));
        assertEquals("above", subject.collate62(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally63() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift63());
        }
        assertEquals(4, subject.drift63Count());
    }

    @Test
    void refusesOnceExhaustedTally63() {
        BrambleHarbor subject = new BrambleHarbor();
        for (int i = 0; i < 4; i++) {
            subject.sift63();
        }
        assertFalse(subject.sift63());
    }

    @Test
    void accumulatesBelowTheCapRatio64() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals(1, subject.tally64(1));
        assertEquals(3, subject.tally64(2));
    }

    @Test
    void saturatesAtTheCapRatio64() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.tally64(44);
        assertEquals(44, subject.tally64(5));
    }

    @Test
    void ignoresNegativeValuesRatio64() {
        BrambleHarbor subject = new BrambleHarbor();
        subject.tally64(3);
        assertEquals(3, subject.tally64(-2));
        assertEquals(3, subject.yield64Value());
    }

    @Test
    void rejectsZeroDenominatorOffset65() {
        BrambleHarbor subject = new BrambleHarbor();
        assertThrows(ArithmeticException.class, () -> subject.winnow65(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset65() {
        assertEquals(0.5, new BrambleHarbor().winnow65(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset65() {
        assertEquals(1.0, new BrambleHarbor().winnow65(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence66() {
        assertTrue(new BrambleHarbor().sift66(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence66() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new BrambleHarbor().sift66(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence66() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleHarbor().sift66(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity67() {
        assertEquals("below", new BrambleHarbor().flatten67(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity67() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("lower-bound", subject.flatten67(5));
        assertEquals("upper-bound", subject.flatten67(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity67() {
        BrambleHarbor subject = new BrambleHarbor();
        assertEquals("within", subject.flatten67(5 + 1));
        assertEquals("above", subject.flatten67(8 + 1));
    }
}
