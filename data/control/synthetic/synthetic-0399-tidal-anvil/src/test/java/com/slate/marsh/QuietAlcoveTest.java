package com.slate.marsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietAlcoveTest {

    @Test
    void allowsAttemptsUpToTheBudgetCapacity0() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten0());
        }
        assertEquals(1, subject.margin0Count());
    }

    @Test
    void refusesOnceExhaustedCapacity0() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 1; i++) {
            subject.flatten0();
        }
        assertFalse(subject.flatten0());
    }

    @Test
    void accumulatesBelowTheCapThreshold1() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals(1, subject.reconcile1(1));
        assertEquals(3, subject.reconcile1(2));
    }

    @Test
    void saturatesAtTheCapThreshold1() {
        QuietAlcove subject = new QuietAlcove();
        subject.reconcile1(21);
        assertEquals(21, subject.reconcile1(5));
    }

    @Test
    void ignoresNegativeValuesThreshold1() {
        QuietAlcove subject = new QuietAlcove();
        subject.reconcile1(3);
        assertEquals(3, subject.reconcile1(-2));
        assertEquals(3, subject.span1Value());
    }

    @Test
    void rejectsZeroDenominatorSpan2() {
        QuietAlcove subject = new QuietAlcove();
        assertThrows(ArithmeticException.class, () -> subject.furl2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan2() {
        assertEquals(0.5, new QuietAlcove().furl2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan2() {
        assertEquals(3.0, new QuietAlcove().furl2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota3() {
        assertTrue(new QuietAlcove().brace3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new QuietAlcove().brace3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota3() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietAlcove().brace3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota4() {
        assertEquals("below", new QuietAlcove().collate4(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota4() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("lower-bound", subject.collate4(2));
        assertEquals("upper-bound", subject.collate4(11));
    }

    @Test
    void classifiesWithinAndAboveQuota4() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("within", subject.collate4(2 + 1));
        assertEquals("above", subject.collate4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally5() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow5());
        }
        assertEquals(2, subject.span5Count());
    }

    @Test
    void refusesOnceExhaustedTally5() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 2; i++) {
            subject.winnow5();
        }
        assertFalse(subject.winnow5());
    }

    @Test
    void accumulatesBelowTheCapQuota6() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals(1, subject.winnow6(1));
        assertEquals(3, subject.winnow6(2));
    }

    @Test
    void saturatesAtTheCapQuota6() {
        QuietAlcove subject = new QuietAlcove();
        subject.winnow6(26);
        assertEquals(26, subject.winnow6(5));
    }

    @Test
    void ignoresNegativeValuesQuota6() {
        QuietAlcove subject = new QuietAlcove();
        subject.winnow6(3);
        assertEquals(3, subject.winnow6(-2));
        assertEquals(3, subject.tally6Value());
    }

    @Test
    void rejectsZeroDenominatorCadence7() {
        QuietAlcove subject = new QuietAlcove();
        assertThrows(ArithmeticException.class, () -> subject.collate7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence7() {
        assertEquals(0.5, new QuietAlcove().collate7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence7() {
        assertEquals(3.0, new QuietAlcove().collate7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota8() {
        assertTrue(new QuietAlcove().anneal8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new QuietAlcove().anneal8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota8() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietAlcove().anneal8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio9() {
        assertEquals("below", new QuietAlcove().furl9(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio9() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("lower-bound", subject.furl9(3));
        assertEquals("upper-bound", subject.furl9(10));
    }

    @Test
    void classifiesWithinAndAboveRatio9() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("within", subject.furl9(3 + 1));
        assertEquals("above", subject.furl9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity10() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate10());
        }
        assertEquals(3, subject.weight10Count());
    }

    @Test
    void refusesOnceExhaustedCapacity10() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 3; i++) {
            subject.collate10();
        }
        assertFalse(subject.collate10());
    }

    @Test
    void accumulatesBelowTheCapQuota11() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals(1, subject.kindle11(1));
        assertEquals(3, subject.kindle11(2));
    }

    @Test
    void saturatesAtTheCapQuota11() {
        QuietAlcove subject = new QuietAlcove();
        subject.kindle11(31);
        assertEquals(31, subject.kindle11(5));
    }

    @Test
    void ignoresNegativeValuesQuota11() {
        QuietAlcove subject = new QuietAlcove();
        subject.kindle11(3);
        assertEquals(3, subject.kindle11(-2));
        assertEquals(3, subject.threshold11Value());
    }

    @Test
    void rejectsZeroDenominatorCadence12() {
        QuietAlcove subject = new QuietAlcove();
        assertThrows(ArithmeticException.class, () -> subject.gauge12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence12() {
        assertEquals(0.5, new QuietAlcove().gauge12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence12() {
        assertEquals(3.0, new QuietAlcove().gauge12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth13() {
        assertTrue(new QuietAlcove().flatten13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new QuietAlcove().flatten13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth13() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietAlcove().flatten13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight14() {
        assertEquals("below", new QuietAlcove().winnow14(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight14() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("lower-bound", subject.winnow14(4));
        assertEquals("upper-bound", subject.winnow14(9));
    }

    @Test
    void classifiesWithinAndAboveWeight14() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("within", subject.winnow14(4 + 1));
        assertEquals("above", subject.winnow14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias15() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper15());
        }
        assertEquals(4, subject.ratio15Count());
    }

    @Test
    void refusesOnceExhaustedBias15() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 4; i++) {
            subject.temper15();
        }
        assertFalse(subject.temper15());
    }

    @Test
    void accumulatesBelowTheCapBias16() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals(1, subject.furl16(1));
        assertEquals(3, subject.furl16(2));
    }

    @Test
    void saturatesAtTheCapBias16() {
        QuietAlcove subject = new QuietAlcove();
        subject.furl16(36);
        assertEquals(36, subject.furl16(5));
    }

    @Test
    void ignoresNegativeValuesBias16() {
        QuietAlcove subject = new QuietAlcove();
        subject.furl16(3);
        assertEquals(3, subject.furl16(-2));
        assertEquals(3, subject.weight16Value());
    }

    @Test
    void rejectsZeroDenominatorDrift17() {
        QuietAlcove subject = new QuietAlcove();
        assertThrows(ArithmeticException.class, () -> subject.kindle17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift17() {
        assertEquals(0.5, new QuietAlcove().kindle17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift17() {
        assertEquals(3.0, new QuietAlcove().kindle17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota18() {
        assertTrue(new QuietAlcove().sift18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new QuietAlcove().sift18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota18() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietAlcove().sift18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally19() {
        assertEquals("below", new QuietAlcove().flatten19(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally19() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("lower-bound", subject.flatten19(5));
        assertEquals("upper-bound", subject.flatten19(8));
    }

    @Test
    void classifiesWithinAndAboveTally19() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("within", subject.flatten19(5 + 1));
        assertEquals("above", subject.flatten19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias20() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally20());
        }
        assertEquals(1, subject.ratio20Count());
    }

    @Test
    void refusesOnceExhaustedBias20() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 1; i++) {
            subject.tally20();
        }
        assertFalse(subject.tally20());
    }

    @Test
    void accumulatesBelowTheCapRatio21() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals(1, subject.prune21(1));
        assertEquals(3, subject.prune21(2));
    }

    @Test
    void saturatesAtTheCapRatio21() {
        QuietAlcove subject = new QuietAlcove();
        subject.prune21(41);
        assertEquals(41, subject.prune21(5));
    }

    @Test
    void ignoresNegativeValuesRatio21() {
        QuietAlcove subject = new QuietAlcove();
        subject.prune21(3);
        assertEquals(3, subject.prune21(-2));
        assertEquals(3, subject.quota21Value());
    }

    @Test
    void rejectsZeroDenominatorBias22() {
        QuietAlcove subject = new QuietAlcove();
        assertThrows(ArithmeticException.class, () -> subject.gauge22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias22() {
        assertEquals(0.5, new QuietAlcove().gauge22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias22() {
        assertEquals(3.0, new QuietAlcove().gauge22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota23() {
        assertTrue(new QuietAlcove().flatten23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new QuietAlcove().flatten23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota23() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietAlcove().flatten23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias24() {
        assertEquals("below", new QuietAlcove().reconcile24(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias24() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("lower-bound", subject.reconcile24(2));
        assertEquals("upper-bound", subject.reconcile24(7));
    }

    @Test
    void classifiesWithinAndAboveBias24() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("within", subject.reconcile24(2 + 1));
        assertEquals("above", subject.reconcile24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift25() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten25());
        }
        assertEquals(2, subject.cadence25Count());
    }

    @Test
    void refusesOnceExhaustedDrift25() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 2; i++) {
            subject.flatten25();
        }
        assertFalse(subject.flatten25());
    }

    @Test
    void accumulatesBelowTheCapMargin26() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals(1, subject.anneal26(1));
        assertEquals(3, subject.anneal26(2));
    }

    @Test
    void saturatesAtTheCapMargin26() {
        QuietAlcove subject = new QuietAlcove();
        subject.anneal26(46);
        assertEquals(46, subject.anneal26(5));
    }

    @Test
    void ignoresNegativeValuesMargin26() {
        QuietAlcove subject = new QuietAlcove();
        subject.anneal26(3);
        assertEquals(3, subject.anneal26(-2));
        assertEquals(3, subject.threshold26Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold27() {
        QuietAlcove subject = new QuietAlcove();
        assertThrows(ArithmeticException.class, () -> subject.gauge27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold27() {
        assertEquals(0.5, new QuietAlcove().gauge27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold27() {
        assertEquals(3.0, new QuietAlcove().gauge27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence28() {
        assertTrue(new QuietAlcove().tally28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new QuietAlcove().tally28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence28() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietAlcove().tally28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset29() {
        assertEquals("below", new QuietAlcove().sift29(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset29() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("lower-bound", subject.sift29(3));
        assertEquals("upper-bound", subject.sift29(12));
    }

    @Test
    void classifiesWithinAndAboveOffset29() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("within", subject.sift29(3 + 1));
        assertEquals("above", subject.sift29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin30() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace30());
        }
        assertEquals(3, subject.weight30Count());
    }

    @Test
    void refusesOnceExhaustedMargin30() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 3; i++) {
            subject.brace30();
        }
        assertFalse(subject.brace30());
    }

    @Test
    void accumulatesBelowTheCapDrift31() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals(1, subject.furl31(1));
        assertEquals(3, subject.furl31(2));
    }

    @Test
    void saturatesAtTheCapDrift31() {
        QuietAlcove subject = new QuietAlcove();
        subject.furl31(51);
        assertEquals(51, subject.furl31(5));
    }

    @Test
    void ignoresNegativeValuesDrift31() {
        QuietAlcove subject = new QuietAlcove();
        subject.furl31(3);
        assertEquals(3, subject.furl31(-2));
        assertEquals(3, subject.offset31Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity32() {
        QuietAlcove subject = new QuietAlcove();
        assertThrows(ArithmeticException.class, () -> subject.tally32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity32() {
        assertEquals(0.5, new QuietAlcove().tally32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity32() {
        assertEquals(3.0, new QuietAlcove().tally32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth33() {
        assertTrue(new QuietAlcove().brace33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new QuietAlcove().brace33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth33() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietAlcove().brace33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight34() {
        assertEquals("below", new QuietAlcove().reconcile34(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight34() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("lower-bound", subject.reconcile34(4));
        assertEquals("upper-bound", subject.reconcile34(11));
    }

    @Test
    void classifiesWithinAndAboveWeight34() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("within", subject.reconcile34(4 + 1));
        assertEquals("above", subject.reconcile34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota35() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal35());
        }
        assertEquals(4, subject.tally35Count());
    }

    @Test
    void refusesOnceExhaustedQuota35() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 4; i++) {
            subject.anneal35();
        }
        assertFalse(subject.anneal35());
    }

    @Test
    void accumulatesBelowTheCapWeight36() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals(1, subject.temper36(1));
        assertEquals(3, subject.temper36(2));
    }

    @Test
    void saturatesAtTheCapWeight36() {
        QuietAlcove subject = new QuietAlcove();
        subject.temper36(56);
        assertEquals(56, subject.temper36(5));
    }

    @Test
    void ignoresNegativeValuesWeight36() {
        QuietAlcove subject = new QuietAlcove();
        subject.temper36(3);
        assertEquals(3, subject.temper36(-2));
        assertEquals(3, subject.quota36Value());
    }

    @Test
    void rejectsZeroDenominatorSpan37() {
        QuietAlcove subject = new QuietAlcove();
        assertThrows(ArithmeticException.class, () -> subject.gauge37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan37() {
        assertEquals(0.5, new QuietAlcove().gauge37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan37() {
        assertEquals(3.0, new QuietAlcove().gauge37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence38() {
        assertTrue(new QuietAlcove().hoist38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new QuietAlcove().hoist38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence38() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietAlcove().hoist38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin39() {
        assertEquals("below", new QuietAlcove().reconcile39(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin39() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("lower-bound", subject.reconcile39(5));
        assertEquals("upper-bound", subject.reconcile39(10));
    }

    @Test
    void classifiesWithinAndAboveMargin39() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("within", subject.reconcile39(5 + 1));
        assertEquals("above", subject.reconcile39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset40() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace40());
        }
        assertEquals(1, subject.cadence40Count());
    }

    @Test
    void refusesOnceExhaustedOffset40() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 1; i++) {
            subject.brace40();
        }
        assertFalse(subject.brace40());
    }

    @Test
    void accumulatesBelowTheCapQuota41() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals(1, subject.brace41(1));
        assertEquals(3, subject.brace41(2));
    }

    @Test
    void saturatesAtTheCapQuota41() {
        QuietAlcove subject = new QuietAlcove();
        subject.brace41(21);
        assertEquals(21, subject.brace41(5));
    }

    @Test
    void ignoresNegativeValuesQuota41() {
        QuietAlcove subject = new QuietAlcove();
        subject.brace41(3);
        assertEquals(3, subject.brace41(-2));
        assertEquals(3, subject.depth41Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold42() {
        QuietAlcove subject = new QuietAlcove();
        assertThrows(ArithmeticException.class, () -> subject.reconcile42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold42() {
        assertEquals(0.5, new QuietAlcove().reconcile42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold42() {
        assertEquals(3.0, new QuietAlcove().reconcile42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold43() {
        assertTrue(new QuietAlcove().gauge43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new QuietAlcove().gauge43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold43() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietAlcove().gauge43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth44() {
        assertEquals("below", new QuietAlcove().temper44(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth44() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("lower-bound", subject.temper44(2));
        assertEquals("upper-bound", subject.temper44(9));
    }

    @Test
    void classifiesWithinAndAboveDepth44() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("within", subject.temper44(2 + 1));
        assertEquals("above", subject.temper44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio45() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle45());
        }
        assertEquals(2, subject.offset45Count());
    }

    @Test
    void refusesOnceExhaustedRatio45() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 2; i++) {
            subject.kindle45();
        }
        assertFalse(subject.kindle45());
    }

    @Test
    void accumulatesBelowTheCapQuota46() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals(1, subject.reconcile46(1));
        assertEquals(3, subject.reconcile46(2));
    }

    @Test
    void saturatesAtTheCapQuota46() {
        QuietAlcove subject = new QuietAlcove();
        subject.reconcile46(26);
        assertEquals(26, subject.reconcile46(5));
    }

    @Test
    void ignoresNegativeValuesQuota46() {
        QuietAlcove subject = new QuietAlcove();
        subject.reconcile46(3);
        assertEquals(3, subject.reconcile46(-2));
        assertEquals(3, subject.yield46Value());
    }

    @Test
    void rejectsZeroDenominatorWeight47() {
        QuietAlcove subject = new QuietAlcove();
        assertThrows(ArithmeticException.class, () -> subject.furl47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight47() {
        assertEquals(0.5, new QuietAlcove().furl47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight47() {
        assertEquals(3.0, new QuietAlcove().furl47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity48() {
        assertTrue(new QuietAlcove().anneal48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new QuietAlcove().anneal48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity48() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietAlcove().anneal48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield49() {
        assertEquals("below", new QuietAlcove().temper49(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield49() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("lower-bound", subject.temper49(3));
        assertEquals("upper-bound", subject.temper49(8));
    }

    @Test
    void classifiesWithinAndAboveYield49() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("within", subject.temper49(3 + 1));
        assertEquals("above", subject.temper49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin50() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate50());
        }
        assertEquals(3, subject.tally50Count());
    }

    @Test
    void refusesOnceExhaustedMargin50() {
        QuietAlcove subject = new QuietAlcove();
        for (int i = 0; i < 3; i++) {
            subject.collate50();
        }
        assertFalse(subject.collate50());
    }

    @Test
    void accumulatesBelowTheCapYield51() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals(1, subject.anneal51(1));
        assertEquals(3, subject.anneal51(2));
    }

    @Test
    void saturatesAtTheCapYield51() {
        QuietAlcove subject = new QuietAlcove();
        subject.anneal51(31);
        assertEquals(31, subject.anneal51(5));
    }

    @Test
    void ignoresNegativeValuesYield51() {
        QuietAlcove subject = new QuietAlcove();
        subject.anneal51(3);
        assertEquals(3, subject.anneal51(-2));
        assertEquals(3, subject.offset51Value());
    }

    @Test
    void rejectsZeroDenominatorMargin52() {
        QuietAlcove subject = new QuietAlcove();
        assertThrows(ArithmeticException.class, () -> subject.sift52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin52() {
        assertEquals(0.5, new QuietAlcove().sift52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin52() {
        assertEquals(3.0, new QuietAlcove().sift52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth53() {
        assertTrue(new QuietAlcove().brace53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new QuietAlcove().brace53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth53() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietAlcove().brace53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth54() {
        assertEquals("below", new QuietAlcove().furl54(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth54() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("lower-bound", subject.furl54(4));
        assertEquals("upper-bound", subject.furl54(7));
    }

    @Test
    void classifiesWithinAndAboveDepth54() {
        QuietAlcove subject = new QuietAlcove();
        assertEquals("within", subject.furl54(4 + 1));
        assertEquals("above", subject.furl54(7 + 1));
    }
}
