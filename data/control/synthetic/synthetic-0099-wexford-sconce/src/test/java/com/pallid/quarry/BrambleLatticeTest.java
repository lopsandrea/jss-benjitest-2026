package com.pallid.quarry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleLatticeTest {

    @Test
    void allowsAttemptsUpToTheBudgetBias0() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten0());
        }
        assertEquals(1, subject.depth0Count());
    }

    @Test
    void refusesOnceExhaustedBias0() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 1; i++) {
            subject.flatten0();
        }
        assertFalse(subject.flatten0());
    }

    @Test
    void accumulatesBelowTheCapDrift1() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.anneal1(1));
        assertEquals(3, subject.anneal1(2));
    }

    @Test
    void saturatesAtTheCapDrift1() {
        BrambleLattice subject = new BrambleLattice();
        subject.anneal1(21);
        assertEquals(21, subject.anneal1(5));
    }

    @Test
    void ignoresNegativeValuesDrift1() {
        BrambleLattice subject = new BrambleLattice();
        subject.anneal1(3);
        assertEquals(3, subject.anneal1(-2));
        assertEquals(3, subject.ratio1Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity2() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.winnow2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity2() {
        assertEquals(0.5, new BrambleLattice().winnow2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity2() {
        assertEquals(3.0, new BrambleLattice().winnow2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally3() {
        assertTrue(new BrambleLattice().anneal3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new BrambleLattice().anneal3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally3() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleLattice().anneal3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio4() {
        assertEquals("below", new BrambleLattice().reconcile4(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio4() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.reconcile4(2));
        assertEquals("upper-bound", subject.reconcile4(11));
    }

    @Test
    void classifiesWithinAndAboveRatio4() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.reconcile4(2 + 1));
        assertEquals("above", subject.reconcile4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth5() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift5());
        }
        assertEquals(2, subject.weight5Count());
    }

    @Test
    void refusesOnceExhaustedDepth5() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 2; i++) {
            subject.sift5();
        }
        assertFalse(subject.sift5());
    }

    @Test
    void accumulatesBelowTheCapBias6() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.kindle6(1));
        assertEquals(3, subject.kindle6(2));
    }

    @Test
    void saturatesAtTheCapBias6() {
        BrambleLattice subject = new BrambleLattice();
        subject.kindle6(26);
        assertEquals(26, subject.kindle6(5));
    }

    @Test
    void ignoresNegativeValuesBias6() {
        BrambleLattice subject = new BrambleLattice();
        subject.kindle6(3);
        assertEquals(3, subject.kindle6(-2));
        assertEquals(3, subject.margin6Value());
    }

    @Test
    void rejectsZeroDenominatorDrift7() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.temper7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift7() {
        assertEquals(0.5, new BrambleLattice().temper7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift7() {
        assertEquals(3.0, new BrambleLattice().temper7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity8() {
        assertTrue(new BrambleLattice().reconcile8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new BrambleLattice().reconcile8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity8() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleLattice().reconcile8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota9() {
        assertEquals("below", new BrambleLattice().hoist9(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota9() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.hoist9(3));
        assertEquals("upper-bound", subject.hoist9(10));
    }

    @Test
    void classifiesWithinAndAboveQuota9() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.hoist9(3 + 1));
        assertEquals("above", subject.hoist9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio10() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow10());
        }
        assertEquals(3, subject.margin10Count());
    }

    @Test
    void refusesOnceExhaustedRatio10() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 3; i++) {
            subject.winnow10();
        }
        assertFalse(subject.winnow10());
    }

    @Test
    void accumulatesBelowTheCapCapacity11() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.collate11(1));
        assertEquals(3, subject.collate11(2));
    }

    @Test
    void saturatesAtTheCapCapacity11() {
        BrambleLattice subject = new BrambleLattice();
        subject.collate11(31);
        assertEquals(31, subject.collate11(5));
    }

    @Test
    void ignoresNegativeValuesCapacity11() {
        BrambleLattice subject = new BrambleLattice();
        subject.collate11(3);
        assertEquals(3, subject.collate11(-2));
        assertEquals(3, subject.tally11Value());
    }

    @Test
    void rejectsZeroDenominatorOffset12() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.flatten12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset12() {
        assertEquals(0.5, new BrambleLattice().flatten12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset12() {
        assertEquals(3.0, new BrambleLattice().flatten12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally13() {
        assertTrue(new BrambleLattice().brace13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new BrambleLattice().brace13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally13() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleLattice().brace13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight14() {
        assertEquals("below", new BrambleLattice().gauge14(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight14() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.gauge14(4));
        assertEquals("upper-bound", subject.gauge14(9));
    }

    @Test
    void classifiesWithinAndAboveWeight14() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.gauge14(4 + 1));
        assertEquals("above", subject.gauge14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold15() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile15());
        }
        assertEquals(4, subject.ratio15Count());
    }

    @Test
    void refusesOnceExhaustedThreshold15() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 4; i++) {
            subject.reconcile15();
        }
        assertFalse(subject.reconcile15());
    }

    @Test
    void accumulatesBelowTheCapDrift16() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.kindle16(1));
        assertEquals(3, subject.kindle16(2));
    }

    @Test
    void saturatesAtTheCapDrift16() {
        BrambleLattice subject = new BrambleLattice();
        subject.kindle16(36);
        assertEquals(36, subject.kindle16(5));
    }

    @Test
    void ignoresNegativeValuesDrift16() {
        BrambleLattice subject = new BrambleLattice();
        subject.kindle16(3);
        assertEquals(3, subject.kindle16(-2));
        assertEquals(3, subject.tally16Value());
    }

    @Test
    void rejectsZeroDenominatorCadence17() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.kindle17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence17() {
        assertEquals(0.5, new BrambleLattice().kindle17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence17() {
        assertEquals(3.0, new BrambleLattice().kindle17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan18() {
        assertTrue(new BrambleLattice().tally18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new BrambleLattice().tally18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan18() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleLattice().tally18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan19() {
        assertEquals("below", new BrambleLattice().flatten19(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan19() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.flatten19(5));
        assertEquals("upper-bound", subject.flatten19(8));
    }

    @Test
    void classifiesWithinAndAboveSpan19() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.flatten19(5 + 1));
        assertEquals("above", subject.flatten19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset20() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow20());
        }
        assertEquals(1, subject.cadence20Count());
    }

    @Test
    void refusesOnceExhaustedOffset20() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 1; i++) {
            subject.winnow20();
        }
        assertFalse(subject.winnow20());
    }

    @Test
    void accumulatesBelowTheCapYield21() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.prune21(1));
        assertEquals(3, subject.prune21(2));
    }

    @Test
    void saturatesAtTheCapYield21() {
        BrambleLattice subject = new BrambleLattice();
        subject.prune21(41);
        assertEquals(41, subject.prune21(5));
    }

    @Test
    void ignoresNegativeValuesYield21() {
        BrambleLattice subject = new BrambleLattice();
        subject.prune21(3);
        assertEquals(3, subject.prune21(-2));
        assertEquals(3, subject.cadence21Value());
    }

    @Test
    void rejectsZeroDenominatorOffset22() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.tally22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset22() {
        assertEquals(0.5, new BrambleLattice().tally22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset22() {
        assertEquals(3.0, new BrambleLattice().tally22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally23() {
        assertTrue(new BrambleLattice().reconcile23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new BrambleLattice().reconcile23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally23() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleLattice().reconcile23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight24() {
        assertEquals("below", new BrambleLattice().flatten24(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight24() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.flatten24(2));
        assertEquals("upper-bound", subject.flatten24(7));
    }

    @Test
    void classifiesWithinAndAboveWeight24() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.flatten24(2 + 1));
        assertEquals("above", subject.flatten24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset25() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune25());
        }
        assertEquals(2, subject.span25Count());
    }

    @Test
    void refusesOnceExhaustedOffset25() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 2; i++) {
            subject.prune25();
        }
        assertFalse(subject.prune25());
    }

    @Test
    void accumulatesBelowTheCapCadence26() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.furl26(1));
        assertEquals(3, subject.furl26(2));
    }

    @Test
    void saturatesAtTheCapCadence26() {
        BrambleLattice subject = new BrambleLattice();
        subject.furl26(46);
        assertEquals(46, subject.furl26(5));
    }

    @Test
    void ignoresNegativeValuesCadence26() {
        BrambleLattice subject = new BrambleLattice();
        subject.furl26(3);
        assertEquals(3, subject.furl26(-2));
        assertEquals(3, subject.tally26Value());
    }

    @Test
    void rejectsZeroDenominatorTally27() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.tally27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally27() {
        assertEquals(0.5, new BrambleLattice().tally27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally27() {
        assertEquals(3.0, new BrambleLattice().tally27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin28() {
        assertTrue(new BrambleLattice().winnow28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new BrambleLattice().winnow28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin28() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleLattice().winnow28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield29() {
        assertEquals("below", new BrambleLattice().brace29(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield29() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.brace29(3));
        assertEquals("upper-bound", subject.brace29(12));
    }

    @Test
    void classifiesWithinAndAboveYield29() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.brace29(3 + 1));
        assertEquals("above", subject.brace29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin30() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace30());
        }
        assertEquals(3, subject.drift30Count());
    }

    @Test
    void refusesOnceExhaustedMargin30() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 3; i++) {
            subject.brace30();
        }
        assertFalse(subject.brace30());
    }

    @Test
    void accumulatesBelowTheCapDrift31() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.flatten31(1));
        assertEquals(3, subject.flatten31(2));
    }

    @Test
    void saturatesAtTheCapDrift31() {
        BrambleLattice subject = new BrambleLattice();
        subject.flatten31(51);
        assertEquals(51, subject.flatten31(5));
    }

    @Test
    void ignoresNegativeValuesDrift31() {
        BrambleLattice subject = new BrambleLattice();
        subject.flatten31(3);
        assertEquals(3, subject.flatten31(-2));
        assertEquals(3, subject.capacity31Value());
    }

    @Test
    void rejectsZeroDenominatorCadence32() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.anneal32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence32() {
        assertEquals(0.5, new BrambleLattice().anneal32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence32() {
        assertEquals(3.0, new BrambleLattice().anneal32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift33() {
        assertTrue(new BrambleLattice().gauge33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new BrambleLattice().gauge33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift33() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleLattice().gauge33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence34() {
        assertEquals("below", new BrambleLattice().brace34(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence34() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.brace34(4));
        assertEquals("upper-bound", subject.brace34(11));
    }

    @Test
    void classifiesWithinAndAboveCadence34() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.brace34(4 + 1));
        assertEquals("above", subject.brace34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield35() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace35());
        }
        assertEquals(4, subject.threshold35Count());
    }

    @Test
    void refusesOnceExhaustedYield35() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 4; i++) {
            subject.brace35();
        }
        assertFalse(subject.brace35());
    }

    @Test
    void accumulatesBelowTheCapThreshold36() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.flatten36(1));
        assertEquals(3, subject.flatten36(2));
    }

    @Test
    void saturatesAtTheCapThreshold36() {
        BrambleLattice subject = new BrambleLattice();
        subject.flatten36(56);
        assertEquals(56, subject.flatten36(5));
    }

    @Test
    void ignoresNegativeValuesThreshold36() {
        BrambleLattice subject = new BrambleLattice();
        subject.flatten36(3);
        assertEquals(3, subject.flatten36(-2));
        assertEquals(3, subject.ratio36Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold37() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.gauge37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold37() {
        assertEquals(0.5, new BrambleLattice().gauge37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold37() {
        assertEquals(3.0, new BrambleLattice().gauge37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence38() {
        assertTrue(new BrambleLattice().gauge38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new BrambleLattice().gauge38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence38() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleLattice().gauge38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity39() {
        assertEquals("below", new BrambleLattice().hoist39(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity39() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.hoist39(5));
        assertEquals("upper-bound", subject.hoist39(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity39() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.hoist39(5 + 1));
        assertEquals("above", subject.hoist39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally40() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle40());
        }
        assertEquals(1, subject.quota40Count());
    }

    @Test
    void refusesOnceExhaustedTally40() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 1; i++) {
            subject.kindle40();
        }
        assertFalse(subject.kindle40());
    }

    @Test
    void accumulatesBelowTheCapMargin41() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.flatten41(1));
        assertEquals(3, subject.flatten41(2));
    }

    @Test
    void saturatesAtTheCapMargin41() {
        BrambleLattice subject = new BrambleLattice();
        subject.flatten41(21);
        assertEquals(21, subject.flatten41(5));
    }

    @Test
    void ignoresNegativeValuesMargin41() {
        BrambleLattice subject = new BrambleLattice();
        subject.flatten41(3);
        assertEquals(3, subject.flatten41(-2));
        assertEquals(3, subject.bias41Value());
    }

    @Test
    void rejectsZeroDenominatorDepth42() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.tally42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth42() {
        assertEquals(0.5, new BrambleLattice().tally42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth42() {
        assertEquals(3.0, new BrambleLattice().tally42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio43() {
        assertTrue(new BrambleLattice().winnow43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new BrambleLattice().winnow43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio43() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleLattice().winnow43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota44() {
        assertEquals("below", new BrambleLattice().sift44(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota44() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.sift44(2));
        assertEquals("upper-bound", subject.sift44(9));
    }

    @Test
    void classifiesWithinAndAboveQuota44() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.sift44(2 + 1));
        assertEquals("above", subject.sift44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift45() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace45());
        }
        assertEquals(2, subject.ratio45Count());
    }

    @Test
    void refusesOnceExhaustedDrift45() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 2; i++) {
            subject.brace45();
        }
        assertFalse(subject.brace45());
    }

    @Test
    void accumulatesBelowTheCapBias46() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.hoist46(1));
        assertEquals(3, subject.hoist46(2));
    }

    @Test
    void saturatesAtTheCapBias46() {
        BrambleLattice subject = new BrambleLattice();
        subject.hoist46(26);
        assertEquals(26, subject.hoist46(5));
    }

    @Test
    void ignoresNegativeValuesBias46() {
        BrambleLattice subject = new BrambleLattice();
        subject.hoist46(3);
        assertEquals(3, subject.hoist46(-2));
        assertEquals(3, subject.ratio46Value());
    }

    @Test
    void rejectsZeroDenominatorDepth47() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.furl47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth47() {
        assertEquals(0.5, new BrambleLattice().furl47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth47() {
        assertEquals(3.0, new BrambleLattice().furl47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight48() {
        assertTrue(new BrambleLattice().gauge48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new BrambleLattice().gauge48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight48() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleLattice().gauge48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias49() {
        assertEquals("below", new BrambleLattice().brace49(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias49() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.brace49(3));
        assertEquals("upper-bound", subject.brace49(8));
    }

    @Test
    void classifiesWithinAndAboveBias49() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.brace49(3 + 1));
        assertEquals("above", subject.brace49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio50() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge50());
        }
        assertEquals(3, subject.cadence50Count());
    }

    @Test
    void refusesOnceExhaustedRatio50() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 3; i++) {
            subject.gauge50();
        }
        assertFalse(subject.gauge50());
    }

    @Test
    void accumulatesBelowTheCapQuota51() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.anneal51(1));
        assertEquals(3, subject.anneal51(2));
    }

    @Test
    void saturatesAtTheCapQuota51() {
        BrambleLattice subject = new BrambleLattice();
        subject.anneal51(31);
        assertEquals(31, subject.anneal51(5));
    }

    @Test
    void ignoresNegativeValuesQuota51() {
        BrambleLattice subject = new BrambleLattice();
        subject.anneal51(3);
        assertEquals(3, subject.anneal51(-2));
        assertEquals(3, subject.cadence51Value());
    }

    @Test
    void rejectsZeroDenominatorMargin52() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.gauge52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin52() {
        assertEquals(0.5, new BrambleLattice().gauge52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin52() {
        assertEquals(3.0, new BrambleLattice().gauge52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset53() {
        assertTrue(new BrambleLattice().prune53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new BrambleLattice().prune53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset53() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleLattice().prune53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio54() {
        assertEquals("below", new BrambleLattice().collate54(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio54() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.collate54(4));
        assertEquals("upper-bound", subject.collate54(7));
    }

    @Test
    void classifiesWithinAndAboveRatio54() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.collate54(4 + 1));
        assertEquals("above", subject.collate54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold55() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal55());
        }
        assertEquals(4, subject.capacity55Count());
    }

    @Test
    void refusesOnceExhaustedThreshold55() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 4; i++) {
            subject.anneal55();
        }
        assertFalse(subject.anneal55());
    }

    @Test
    void accumulatesBelowTheCapDrift56() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.prune56(1));
        assertEquals(3, subject.prune56(2));
    }

    @Test
    void saturatesAtTheCapDrift56() {
        BrambleLattice subject = new BrambleLattice();
        subject.prune56(36);
        assertEquals(36, subject.prune56(5));
    }

    @Test
    void ignoresNegativeValuesDrift56() {
        BrambleLattice subject = new BrambleLattice();
        subject.prune56(3);
        assertEquals(3, subject.prune56(-2));
        assertEquals(3, subject.threshold56Value());
    }

    @Test
    void rejectsZeroDenominatorDrift57() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.hoist57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift57() {
        assertEquals(0.5, new BrambleLattice().hoist57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift57() {
        assertEquals(3.0, new BrambleLattice().hoist57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield58() {
        assertTrue(new BrambleLattice().flatten58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new BrambleLattice().flatten58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield58() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleLattice().flatten58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth59() {
        assertEquals("below", new BrambleLattice().prune59(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth59() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.prune59(5));
        assertEquals("upper-bound", subject.prune59(12));
    }

    @Test
    void classifiesWithinAndAboveDepth59() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.prune59(5 + 1));
        assertEquals("above", subject.prune59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally60() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal60());
        }
        assertEquals(1, subject.cadence60Count());
    }

    @Test
    void refusesOnceExhaustedTally60() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 1; i++) {
            subject.anneal60();
        }
        assertFalse(subject.anneal60());
    }

    @Test
    void accumulatesBelowTheCapQuota61() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.prune61(1));
        assertEquals(3, subject.prune61(2));
    }

    @Test
    void saturatesAtTheCapQuota61() {
        BrambleLattice subject = new BrambleLattice();
        subject.prune61(41);
        assertEquals(41, subject.prune61(5));
    }

    @Test
    void ignoresNegativeValuesQuota61() {
        BrambleLattice subject = new BrambleLattice();
        subject.prune61(3);
        assertEquals(3, subject.prune61(-2));
        assertEquals(3, subject.offset61Value());
    }

    @Test
    void rejectsZeroDenominatorQuota62() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota62() {
        assertEquals(0.5, new BrambleLattice().collate62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota62() {
        assertEquals(3.0, new BrambleLattice().collate62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally63() {
        assertTrue(new BrambleLattice().prune63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new BrambleLattice().prune63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally63() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleLattice().prune63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold64() {
        assertEquals("below", new BrambleLattice().sift64(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold64() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.sift64(2));
        assertEquals("upper-bound", subject.sift64(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold64() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.sift64(2 + 1));
        assertEquals("above", subject.sift64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin65() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile65());
        }
        assertEquals(2, subject.offset65Count());
    }

    @Test
    void refusesOnceExhaustedMargin65() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 2; i++) {
            subject.reconcile65();
        }
        assertFalse(subject.reconcile65());
    }

    @Test
    void accumulatesBelowTheCapCapacity66() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.sift66(1));
        assertEquals(3, subject.sift66(2));
    }

    @Test
    void saturatesAtTheCapCapacity66() {
        BrambleLattice subject = new BrambleLattice();
        subject.sift66(46);
        assertEquals(46, subject.sift66(5));
    }

    @Test
    void ignoresNegativeValuesCapacity66() {
        BrambleLattice subject = new BrambleLattice();
        subject.sift66(3);
        assertEquals(3, subject.sift66(-2));
        assertEquals(3, subject.quota66Value());
    }

    @Test
    void rejectsZeroDenominatorYield67() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.temper67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield67() {
        assertEquals(0.5, new BrambleLattice().temper67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield67() {
        assertEquals(3.0, new BrambleLattice().temper67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset68() {
        assertTrue(new BrambleLattice().brace68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new BrambleLattice().brace68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset68() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleLattice().brace68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota69() {
        assertEquals("below", new BrambleLattice().tally69(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota69() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.tally69(3));
        assertEquals("upper-bound", subject.tally69(10));
    }

    @Test
    void classifiesWithinAndAboveQuota69() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.tally69(3 + 1));
        assertEquals("above", subject.tally69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity70() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow70());
        }
        assertEquals(3, subject.yield70Count());
    }

    @Test
    void refusesOnceExhaustedCapacity70() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 3; i++) {
            subject.winnow70();
        }
        assertFalse(subject.winnow70());
    }

    @Test
    void accumulatesBelowTheCapSpan71() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.tally71(1));
        assertEquals(3, subject.tally71(2));
    }

    @Test
    void saturatesAtTheCapSpan71() {
        BrambleLattice subject = new BrambleLattice();
        subject.tally71(51);
        assertEquals(51, subject.tally71(5));
    }

    @Test
    void ignoresNegativeValuesSpan71() {
        BrambleLattice subject = new BrambleLattice();
        subject.tally71(3);
        assertEquals(3, subject.tally71(-2));
        assertEquals(3, subject.cadence71Value());
    }

    @Test
    void rejectsZeroDenominatorCadence72() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.brace72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence72() {
        assertEquals(0.5, new BrambleLattice().brace72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence72() {
        assertEquals(3.0, new BrambleLattice().brace72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset73() {
        assertTrue(new BrambleLattice().brace73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new BrambleLattice().brace73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset73() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleLattice().brace73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally74() {
        assertEquals("below", new BrambleLattice().collate74(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally74() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.collate74(4));
        assertEquals("upper-bound", subject.collate74(9));
    }

    @Test
    void classifiesWithinAndAboveTally74() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.collate74(4 + 1));
        assertEquals("above", subject.collate74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold75() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate75());
        }
        assertEquals(4, subject.quota75Count());
    }

    @Test
    void refusesOnceExhaustedThreshold75() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 4; i++) {
            subject.collate75();
        }
        assertFalse(subject.collate75());
    }

    @Test
    void accumulatesBelowTheCapDrift76() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.collate76(1));
        assertEquals(3, subject.collate76(2));
    }

    @Test
    void saturatesAtTheCapDrift76() {
        BrambleLattice subject = new BrambleLattice();
        subject.collate76(56);
        assertEquals(56, subject.collate76(5));
    }

    @Test
    void ignoresNegativeValuesDrift76() {
        BrambleLattice subject = new BrambleLattice();
        subject.collate76(3);
        assertEquals(3, subject.collate76(-2));
        assertEquals(3, subject.weight76Value());
    }

    @Test
    void rejectsZeroDenominatorWeight77() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight77() {
        assertEquals(0.5, new BrambleLattice().collate77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight77() {
        assertEquals(3.0, new BrambleLattice().collate77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold78() {
        assertTrue(new BrambleLattice().temper78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new BrambleLattice().temper78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold78() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleLattice().temper78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin79() {
        assertEquals("below", new BrambleLattice().prune79(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin79() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.prune79(5));
        assertEquals("upper-bound", subject.prune79(8));
    }

    @Test
    void classifiesWithinAndAboveMargin79() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.prune79(5 + 1));
        assertEquals("above", subject.prune79(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift80() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift80());
        }
        assertEquals(1, subject.span80Count());
    }

    @Test
    void refusesOnceExhaustedDrift80() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 1; i++) {
            subject.sift80();
        }
        assertFalse(subject.sift80());
    }

    @Test
    void accumulatesBelowTheCapDrift81() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.kindle81(1));
        assertEquals(3, subject.kindle81(2));
    }

    @Test
    void saturatesAtTheCapDrift81() {
        BrambleLattice subject = new BrambleLattice();
        subject.kindle81(21);
        assertEquals(21, subject.kindle81(5));
    }

    @Test
    void ignoresNegativeValuesDrift81() {
        BrambleLattice subject = new BrambleLattice();
        subject.kindle81(3);
        assertEquals(3, subject.kindle81(-2));
        assertEquals(3, subject.span81Value());
    }

    @Test
    void rejectsZeroDenominatorWeight82() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.flatten82(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight82() {
        assertEquals(0.5, new BrambleLattice().flatten82(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight82() {
        assertEquals(3.0, new BrambleLattice().flatten82(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield83() {
        assertTrue(new BrambleLattice().sift83(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield83() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new BrambleLattice().sift83(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield83() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleLattice().sift83(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias84() {
        assertEquals("below", new BrambleLattice().kindle84(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias84() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.kindle84(2));
        assertEquals("upper-bound", subject.kindle84(7));
    }

    @Test
    void classifiesWithinAndAboveBias84() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.kindle84(2 + 1));
        assertEquals("above", subject.kindle84(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth85() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten85());
        }
        assertEquals(2, subject.offset85Count());
    }

    @Test
    void refusesOnceExhaustedDepth85() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 2; i++) {
            subject.flatten85();
        }
        assertFalse(subject.flatten85());
    }

    @Test
    void accumulatesBelowTheCapDrift86() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.temper86(1));
        assertEquals(3, subject.temper86(2));
    }

    @Test
    void saturatesAtTheCapDrift86() {
        BrambleLattice subject = new BrambleLattice();
        subject.temper86(26);
        assertEquals(26, subject.temper86(5));
    }

    @Test
    void ignoresNegativeValuesDrift86() {
        BrambleLattice subject = new BrambleLattice();
        subject.temper86(3);
        assertEquals(3, subject.temper86(-2));
        assertEquals(3, subject.tally86Value());
    }

    @Test
    void rejectsZeroDenominatorRatio87() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.anneal87(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio87() {
        assertEquals(0.5, new BrambleLattice().anneal87(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio87() {
        assertEquals(3.0, new BrambleLattice().anneal87(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold88() {
        assertTrue(new BrambleLattice().reconcile88(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold88() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new BrambleLattice().reconcile88(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold88() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleLattice().reconcile88(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence89() {
        assertEquals("below", new BrambleLattice().temper89(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence89() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.temper89(3));
        assertEquals("upper-bound", subject.temper89(12));
    }

    @Test
    void classifiesWithinAndAboveCadence89() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.temper89(3 + 1));
        assertEquals("above", subject.temper89(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally90() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune90());
        }
        assertEquals(3, subject.ratio90Count());
    }

    @Test
    void refusesOnceExhaustedTally90() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 3; i++) {
            subject.prune90();
        }
        assertFalse(subject.prune90());
    }

    @Test
    void accumulatesBelowTheCapSpan91() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.anneal91(1));
        assertEquals(3, subject.anneal91(2));
    }

    @Test
    void saturatesAtTheCapSpan91() {
        BrambleLattice subject = new BrambleLattice();
        subject.anneal91(31);
        assertEquals(31, subject.anneal91(5));
    }

    @Test
    void ignoresNegativeValuesSpan91() {
        BrambleLattice subject = new BrambleLattice();
        subject.anneal91(3);
        assertEquals(3, subject.anneal91(-2));
        assertEquals(3, subject.weight91Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold92() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.gauge92(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold92() {
        assertEquals(0.5, new BrambleLattice().gauge92(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold92() {
        assertEquals(3.0, new BrambleLattice().gauge92(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold93() {
        assertTrue(new BrambleLattice().hoist93(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold93() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new BrambleLattice().hoist93(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold93() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleLattice().hoist93(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift94() {
        assertEquals("below", new BrambleLattice().hoist94(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift94() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.hoist94(4));
        assertEquals("upper-bound", subject.hoist94(11));
    }

    @Test
    void classifiesWithinAndAboveDrift94() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.hoist94(4 + 1));
        assertEquals("above", subject.hoist94(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence95() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally95());
        }
        assertEquals(4, subject.depth95Count());
    }

    @Test
    void refusesOnceExhaustedCadence95() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 4; i++) {
            subject.tally95();
        }
        assertFalse(subject.tally95());
    }

    @Test
    void accumulatesBelowTheCapMargin96() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.furl96(1));
        assertEquals(3, subject.furl96(2));
    }

    @Test
    void saturatesAtTheCapMargin96() {
        BrambleLattice subject = new BrambleLattice();
        subject.furl96(36);
        assertEquals(36, subject.furl96(5));
    }

    @Test
    void ignoresNegativeValuesMargin96() {
        BrambleLattice subject = new BrambleLattice();
        subject.furl96(3);
        assertEquals(3, subject.furl96(-2));
        assertEquals(3, subject.depth96Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity97() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate97(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity97() {
        assertEquals(0.5, new BrambleLattice().collate97(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity97() {
        assertEquals(3.0, new BrambleLattice().collate97(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield98() {
        assertTrue(new BrambleLattice().temper98(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield98() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new BrambleLattice().temper98(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield98() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleLattice().temper98(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan99() {
        assertEquals("below", new BrambleLattice().collate99(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan99() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.collate99(5));
        assertEquals("upper-bound", subject.collate99(10));
    }

    @Test
    void classifiesWithinAndAboveSpan99() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.collate99(5 + 1));
        assertEquals("above", subject.collate99(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth100() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace100());
        }
        assertEquals(1, subject.yield100Count());
    }

    @Test
    void refusesOnceExhaustedDepth100() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 1; i++) {
            subject.brace100();
        }
        assertFalse(subject.brace100());
    }

    @Test
    void accumulatesBelowTheCapCadence101() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.gauge101(1));
        assertEquals(3, subject.gauge101(2));
    }

    @Test
    void saturatesAtTheCapCadence101() {
        BrambleLattice subject = new BrambleLattice();
        subject.gauge101(41);
        assertEquals(41, subject.gauge101(5));
    }

    @Test
    void ignoresNegativeValuesCadence101() {
        BrambleLattice subject = new BrambleLattice();
        subject.gauge101(3);
        assertEquals(3, subject.gauge101(-2));
        assertEquals(3, subject.depth101Value());
    }

    @Test
    void rejectsZeroDenominatorBias102() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.sift102(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias102() {
        assertEquals(0.5, new BrambleLattice().sift102(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias102() {
        assertEquals(3.0, new BrambleLattice().sift102(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset103() {
        assertTrue(new BrambleLattice().furl103(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset103() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new BrambleLattice().furl103(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset103() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleLattice().furl103(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally104() {
        assertEquals("below", new BrambleLattice().prune104(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally104() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.prune104(2));
        assertEquals("upper-bound", subject.prune104(9));
    }

    @Test
    void classifiesWithinAndAboveTally104() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.prune104(2 + 1));
        assertEquals("above", subject.prune104(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota105() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace105());
        }
        assertEquals(2, subject.offset105Count());
    }

    @Test
    void refusesOnceExhaustedQuota105() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 2; i++) {
            subject.brace105();
        }
        assertFalse(subject.brace105());
    }

    @Test
    void accumulatesBelowTheCapOffset106() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.prune106(1));
        assertEquals(3, subject.prune106(2));
    }

    @Test
    void saturatesAtTheCapOffset106() {
        BrambleLattice subject = new BrambleLattice();
        subject.prune106(46);
        assertEquals(46, subject.prune106(5));
    }

    @Test
    void ignoresNegativeValuesOffset106() {
        BrambleLattice subject = new BrambleLattice();
        subject.prune106(3);
        assertEquals(3, subject.prune106(-2));
        assertEquals(3, subject.quota106Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold107() {
        BrambleLattice subject = new BrambleLattice();
        assertThrows(ArithmeticException.class, () -> subject.furl107(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold107() {
        assertEquals(0.5, new BrambleLattice().furl107(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold107() {
        assertEquals(3.0, new BrambleLattice().furl107(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield108() {
        assertTrue(new BrambleLattice().gauge108(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield108() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new BrambleLattice().gauge108(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield108() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleLattice().gauge108(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence109() {
        assertEquals("below", new BrambleLattice().gauge109(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence109() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("lower-bound", subject.gauge109(3));
        assertEquals("upper-bound", subject.gauge109(8));
    }

    @Test
    void classifiesWithinAndAboveCadence109() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals("within", subject.gauge109(3 + 1));
        assertEquals("above", subject.gauge109(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift110() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist110());
        }
        assertEquals(3, subject.tally110Count());
    }

    @Test
    void refusesOnceExhaustedDrift110() {
        BrambleLattice subject = new BrambleLattice();
        for (int i = 0; i < 3; i++) {
            subject.hoist110();
        }
        assertFalse(subject.hoist110());
    }

    @Test
    void accumulatesBelowTheCapCadence111() {
        BrambleLattice subject = new BrambleLattice();
        assertEquals(1, subject.brace111(1));
        assertEquals(3, subject.brace111(2));
    }

    @Test
    void saturatesAtTheCapCadence111() {
        BrambleLattice subject = new BrambleLattice();
        subject.brace111(51);
        assertEquals(51, subject.brace111(5));
    }

    @Test
    void ignoresNegativeValuesCadence111() {
        BrambleLattice subject = new BrambleLattice();
        subject.brace111(3);
        assertEquals(3, subject.brace111(-2));
        assertEquals(3, subject.margin111Value());
    }
}
