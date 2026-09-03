package com.northward.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableQuillTest {

    @Test
    void allowsAttemptsUpToTheBudgetCadence0() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal0());
        }
        assertEquals(1, subject.capacity0Count());
    }

    @Test
    void refusesOnceExhaustedCadence0() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 1; i++) {
            subject.anneal0();
        }
        assertFalse(subject.anneal0());
    }

    @Test
    void accumulatesBelowTheCapWeight1() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.flatten1(1));
        assertEquals(3, subject.flatten1(2));
    }

    @Test
    void saturatesAtTheCapWeight1() {
        SableQuill subject = new SableQuill();
        subject.flatten1(21);
        assertEquals(21, subject.flatten1(5));
    }

    @Test
    void ignoresNegativeValuesWeight1() {
        SableQuill subject = new SableQuill();
        subject.flatten1(3);
        assertEquals(3, subject.flatten1(-2));
        assertEquals(3, subject.offset1Value());
    }

    @Test
    void rejectsZeroDenominatorBias2() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias2() {
        assertEquals(0.5, new SableQuill().reconcile2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias2() {
        assertEquals(3.0, new SableQuill().reconcile2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight3() {
        assertTrue(new SableQuill().kindle3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableQuill().kindle3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight3() {
        assertEquals(java.util.Arrays.asList(9),
                new SableQuill().kindle3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield4() {
        assertEquals("below", new SableQuill().flatten4(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield4() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.flatten4(2));
        assertEquals("upper-bound", subject.flatten4(11));
    }

    @Test
    void classifiesWithinAndAboveYield4() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.flatten4(2 + 1));
        assertEquals("above", subject.flatten4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio5() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal5());
        }
        assertEquals(2, subject.weight5Count());
    }

    @Test
    void refusesOnceExhaustedRatio5() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 2; i++) {
            subject.anneal5();
        }
        assertFalse(subject.anneal5());
    }

    @Test
    void accumulatesBelowTheCapDepth6() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.sift6(1));
        assertEquals(3, subject.sift6(2));
    }

    @Test
    void saturatesAtTheCapDepth6() {
        SableQuill subject = new SableQuill();
        subject.sift6(26);
        assertEquals(26, subject.sift6(5));
    }

    @Test
    void ignoresNegativeValuesDepth6() {
        SableQuill subject = new SableQuill();
        subject.sift6(3);
        assertEquals(3, subject.sift6(-2));
        assertEquals(3, subject.cadence6Value());
    }

    @Test
    void rejectsZeroDenominatorDepth7() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.tally7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth7() {
        assertEquals(0.5, new SableQuill().tally7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth7() {
        assertEquals(3.0, new SableQuill().tally7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally8() {
        assertTrue(new SableQuill().prune8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SableQuill().prune8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally8() {
        assertEquals(java.util.Arrays.asList(14),
                new SableQuill().prune8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin9() {
        assertEquals("below", new SableQuill().temper9(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin9() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.temper9(3));
        assertEquals("upper-bound", subject.temper9(10));
    }

    @Test
    void classifiesWithinAndAboveMargin9() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.temper9(3 + 1));
        assertEquals("above", subject.temper9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield10() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace10());
        }
        assertEquals(3, subject.offset10Count());
    }

    @Test
    void refusesOnceExhaustedYield10() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 3; i++) {
            subject.brace10();
        }
        assertFalse(subject.brace10());
    }

    @Test
    void accumulatesBelowTheCapThreshold11() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.winnow11(1));
        assertEquals(3, subject.winnow11(2));
    }

    @Test
    void saturatesAtTheCapThreshold11() {
        SableQuill subject = new SableQuill();
        subject.winnow11(31);
        assertEquals(31, subject.winnow11(5));
    }

    @Test
    void ignoresNegativeValuesThreshold11() {
        SableQuill subject = new SableQuill();
        subject.winnow11(3);
        assertEquals(3, subject.winnow11(-2));
        assertEquals(3, subject.depth11Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity12() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.temper12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity12() {
        assertEquals(0.5, new SableQuill().temper12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity12() {
        assertEquals(3.0, new SableQuill().temper12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan13() {
        assertTrue(new SableQuill().prune13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SableQuill().prune13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan13() {
        assertEquals(java.util.Arrays.asList(10),
                new SableQuill().prune13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold14() {
        assertEquals("below", new SableQuill().tally14(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold14() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.tally14(4));
        assertEquals("upper-bound", subject.tally14(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold14() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.tally14(4 + 1));
        assertEquals("above", subject.tally14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight15() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate15());
        }
        assertEquals(4, subject.depth15Count());
    }

    @Test
    void refusesOnceExhaustedWeight15() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 4; i++) {
            subject.collate15();
        }
        assertFalse(subject.collate15());
    }

    @Test
    void accumulatesBelowTheCapSpan16() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.flatten16(1));
        assertEquals(3, subject.flatten16(2));
    }

    @Test
    void saturatesAtTheCapSpan16() {
        SableQuill subject = new SableQuill();
        subject.flatten16(36);
        assertEquals(36, subject.flatten16(5));
    }

    @Test
    void ignoresNegativeValuesSpan16() {
        SableQuill subject = new SableQuill();
        subject.flatten16(3);
        assertEquals(3, subject.flatten16(-2));
        assertEquals(3, subject.weight16Value());
    }

    @Test
    void rejectsZeroDenominatorDrift17() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift17() {
        assertEquals(0.5, new SableQuill().prune17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift17() {
        assertEquals(3.0, new SableQuill().prune17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift18() {
        assertTrue(new SableQuill().kindle18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SableQuill().kindle18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift18() {
        assertEquals(java.util.Arrays.asList(6),
                new SableQuill().kindle18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight19() {
        assertEquals("below", new SableQuill().prune19(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight19() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.prune19(5));
        assertEquals("upper-bound", subject.prune19(8));
    }

    @Test
    void classifiesWithinAndAboveWeight19() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.prune19(5 + 1));
        assertEquals("above", subject.prune19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset20() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune20());
        }
        assertEquals(1, subject.quota20Count());
    }

    @Test
    void refusesOnceExhaustedOffset20() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 1; i++) {
            subject.prune20();
        }
        assertFalse(subject.prune20());
    }

    @Test
    void accumulatesBelowTheCapDrift21() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.prune21(1));
        assertEquals(3, subject.prune21(2));
    }

    @Test
    void saturatesAtTheCapDrift21() {
        SableQuill subject = new SableQuill();
        subject.prune21(41);
        assertEquals(41, subject.prune21(5));
    }

    @Test
    void ignoresNegativeValuesDrift21() {
        SableQuill subject = new SableQuill();
        subject.prune21(3);
        assertEquals(3, subject.prune21(-2));
        assertEquals(3, subject.span21Value());
    }

    @Test
    void rejectsZeroDenominatorCadence22() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence22() {
        assertEquals(0.5, new SableQuill().prune22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence22() {
        assertEquals(3.0, new SableQuill().prune22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold23() {
        assertTrue(new SableQuill().brace23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new SableQuill().brace23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold23() {
        assertEquals(java.util.Arrays.asList(11),
                new SableQuill().brace23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset24() {
        assertEquals("below", new SableQuill().winnow24(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset24() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.winnow24(2));
        assertEquals("upper-bound", subject.winnow24(7));
    }

    @Test
    void classifiesWithinAndAboveOffset24() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.winnow24(2 + 1));
        assertEquals("above", subject.winnow24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold25() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal25());
        }
        assertEquals(2, subject.span25Count());
    }

    @Test
    void refusesOnceExhaustedThreshold25() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 2; i++) {
            subject.anneal25();
        }
        assertFalse(subject.anneal25());
    }

    @Test
    void accumulatesBelowTheCapQuota26() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.tally26(1));
        assertEquals(3, subject.tally26(2));
    }

    @Test
    void saturatesAtTheCapQuota26() {
        SableQuill subject = new SableQuill();
        subject.tally26(46);
        assertEquals(46, subject.tally26(5));
    }

    @Test
    void ignoresNegativeValuesQuota26() {
        SableQuill subject = new SableQuill();
        subject.tally26(3);
        assertEquals(3, subject.tally26(-2));
        assertEquals(3, subject.depth26Value());
    }

    @Test
    void rejectsZeroDenominatorWeight27() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight27() {
        assertEquals(0.5, new SableQuill().reconcile27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight27() {
        assertEquals(3.0, new SableQuill().reconcile27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota28() {
        assertTrue(new SableQuill().gauge28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new SableQuill().gauge28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota28() {
        assertEquals(java.util.Arrays.asList(7),
                new SableQuill().gauge28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight29() {
        assertEquals("below", new SableQuill().prune29(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight29() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.prune29(3));
        assertEquals("upper-bound", subject.prune29(12));
    }

    @Test
    void classifiesWithinAndAboveWeight29() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.prune29(3 + 1));
        assertEquals("above", subject.prune29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset30() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune30());
        }
        assertEquals(3, subject.threshold30Count());
    }

    @Test
    void refusesOnceExhaustedOffset30() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 3; i++) {
            subject.prune30();
        }
        assertFalse(subject.prune30());
    }

    @Test
    void accumulatesBelowTheCapWeight31() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.furl31(1));
        assertEquals(3, subject.furl31(2));
    }

    @Test
    void saturatesAtTheCapWeight31() {
        SableQuill subject = new SableQuill();
        subject.furl31(51);
        assertEquals(51, subject.furl31(5));
    }

    @Test
    void ignoresNegativeValuesWeight31() {
        SableQuill subject = new SableQuill();
        subject.furl31(3);
        assertEquals(3, subject.furl31(-2));
        assertEquals(3, subject.bias31Value());
    }

    @Test
    void rejectsZeroDenominatorSpan32() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan32() {
        assertEquals(0.5, new SableQuill().prune32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan32() {
        assertEquals(3.0, new SableQuill().prune32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight33() {
        assertTrue(new SableQuill().flatten33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new SableQuill().flatten33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight33() {
        assertEquals(java.util.Arrays.asList(12),
                new SableQuill().flatten33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield34() {
        assertEquals("below", new SableQuill().anneal34(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield34() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.anneal34(4));
        assertEquals("upper-bound", subject.anneal34(11));
    }

    @Test
    void classifiesWithinAndAboveYield34() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.anneal34(4 + 1));
        assertEquals("above", subject.anneal34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset35() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace35());
        }
        assertEquals(4, subject.span35Count());
    }

    @Test
    void refusesOnceExhaustedOffset35() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 4; i++) {
            subject.brace35();
        }
        assertFalse(subject.brace35());
    }

    @Test
    void accumulatesBelowTheCapRatio36() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.reconcile36(1));
        assertEquals(3, subject.reconcile36(2));
    }

    @Test
    void saturatesAtTheCapRatio36() {
        SableQuill subject = new SableQuill();
        subject.reconcile36(56);
        assertEquals(56, subject.reconcile36(5));
    }

    @Test
    void ignoresNegativeValuesRatio36() {
        SableQuill subject = new SableQuill();
        subject.reconcile36(3);
        assertEquals(3, subject.reconcile36(-2));
        assertEquals(3, subject.offset36Value());
    }

    @Test
    void rejectsZeroDenominatorSpan37() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.anneal37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan37() {
        assertEquals(0.5, new SableQuill().anneal37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan37() {
        assertEquals(3.0, new SableQuill().anneal37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight38() {
        assertTrue(new SableQuill().collate38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new SableQuill().collate38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight38() {
        assertEquals(java.util.Arrays.asList(8),
                new SableQuill().collate38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset39() {
        assertEquals("below", new SableQuill().flatten39(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset39() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.flatten39(5));
        assertEquals("upper-bound", subject.flatten39(10));
    }

    @Test
    void classifiesWithinAndAboveOffset39() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.flatten39(5 + 1));
        assertEquals("above", subject.flatten39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias40() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally40());
        }
        assertEquals(1, subject.threshold40Count());
    }

    @Test
    void refusesOnceExhaustedBias40() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 1; i++) {
            subject.tally40();
        }
        assertFalse(subject.tally40());
    }

    @Test
    void accumulatesBelowTheCapCadence41() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.kindle41(1));
        assertEquals(3, subject.kindle41(2));
    }

    @Test
    void saturatesAtTheCapCadence41() {
        SableQuill subject = new SableQuill();
        subject.kindle41(21);
        assertEquals(21, subject.kindle41(5));
    }

    @Test
    void ignoresNegativeValuesCadence41() {
        SableQuill subject = new SableQuill();
        subject.kindle41(3);
        assertEquals(3, subject.kindle41(-2));
        assertEquals(3, subject.tally41Value());
    }

    @Test
    void rejectsZeroDenominatorQuota42() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.flatten42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota42() {
        assertEquals(0.5, new SableQuill().flatten42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota42() {
        assertEquals(3.0, new SableQuill().flatten42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield43() {
        assertTrue(new SableQuill().collate43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new SableQuill().collate43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield43() {
        assertEquals(java.util.Arrays.asList(13),
                new SableQuill().collate43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold44() {
        assertEquals("below", new SableQuill().reconcile44(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold44() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.reconcile44(2));
        assertEquals("upper-bound", subject.reconcile44(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold44() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.reconcile44(2 + 1));
        assertEquals("above", subject.reconcile44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold45() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace45());
        }
        assertEquals(2, subject.yield45Count());
    }

    @Test
    void refusesOnceExhaustedThreshold45() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 2; i++) {
            subject.brace45();
        }
        assertFalse(subject.brace45());
    }

    @Test
    void accumulatesBelowTheCapSpan46() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.furl46(1));
        assertEquals(3, subject.furl46(2));
    }

    @Test
    void saturatesAtTheCapSpan46() {
        SableQuill subject = new SableQuill();
        subject.furl46(26);
        assertEquals(26, subject.furl46(5));
    }

    @Test
    void ignoresNegativeValuesSpan46() {
        SableQuill subject = new SableQuill();
        subject.furl46(3);
        assertEquals(3, subject.furl46(-2));
        assertEquals(3, subject.ratio46Value());
    }

    @Test
    void rejectsZeroDenominatorOffset47() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset47() {
        assertEquals(0.5, new SableQuill().prune47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset47() {
        assertEquals(3.0, new SableQuill().prune47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota48() {
        assertTrue(new SableQuill().tally48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableQuill().tally48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota48() {
        assertEquals(java.util.Arrays.asList(9),
                new SableQuill().tally48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight49() {
        assertEquals("below", new SableQuill().brace49(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight49() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.brace49(3));
        assertEquals("upper-bound", subject.brace49(8));
    }

    @Test
    void classifiesWithinAndAboveWeight49() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.brace49(3 + 1));
        assertEquals("above", subject.brace49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan50() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally50());
        }
        assertEquals(3, subject.weight50Count());
    }

    @Test
    void refusesOnceExhaustedSpan50() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 3; i++) {
            subject.tally50();
        }
        assertFalse(subject.tally50());
    }

    @Test
    void accumulatesBelowTheCapMargin51() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.prune51(1));
        assertEquals(3, subject.prune51(2));
    }

    @Test
    void saturatesAtTheCapMargin51() {
        SableQuill subject = new SableQuill();
        subject.prune51(31);
        assertEquals(31, subject.prune51(5));
    }

    @Test
    void ignoresNegativeValuesMargin51() {
        SableQuill subject = new SableQuill();
        subject.prune51(3);
        assertEquals(3, subject.prune51(-2));
        assertEquals(3, subject.offset51Value());
    }

    @Test
    void rejectsZeroDenominatorDrift52() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.temper52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift52() {
        assertEquals(0.5, new SableQuill().temper52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift52() {
        assertEquals(3.0, new SableQuill().temper52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield53() {
        assertTrue(new SableQuill().temper53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SableQuill().temper53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield53() {
        assertEquals(java.util.Arrays.asList(14),
                new SableQuill().temper53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift54() {
        assertEquals("below", new SableQuill().flatten54(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift54() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.flatten54(4));
        assertEquals("upper-bound", subject.flatten54(7));
    }

    @Test
    void classifiesWithinAndAboveDrift54() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.flatten54(4 + 1));
        assertEquals("above", subject.flatten54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield55() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift55());
        }
        assertEquals(4, subject.tally55Count());
    }

    @Test
    void refusesOnceExhaustedYield55() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 4; i++) {
            subject.sift55();
        }
        assertFalse(subject.sift55());
    }

    @Test
    void accumulatesBelowTheCapQuota56() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.kindle56(1));
        assertEquals(3, subject.kindle56(2));
    }

    @Test
    void saturatesAtTheCapQuota56() {
        SableQuill subject = new SableQuill();
        subject.kindle56(36);
        assertEquals(36, subject.kindle56(5));
    }

    @Test
    void ignoresNegativeValuesQuota56() {
        SableQuill subject = new SableQuill();
        subject.kindle56(3);
        assertEquals(3, subject.kindle56(-2));
        assertEquals(3, subject.tally56Value());
    }

    @Test
    void rejectsZeroDenominatorYield57() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.brace57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield57() {
        assertEquals(0.5, new SableQuill().brace57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield57() {
        assertEquals(3.0, new SableQuill().brace57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift58() {
        assertTrue(new SableQuill().hoist58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SableQuill().hoist58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift58() {
        assertEquals(java.util.Arrays.asList(10),
                new SableQuill().hoist58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias59() {
        assertEquals("below", new SableQuill().reconcile59(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias59() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.reconcile59(5));
        assertEquals("upper-bound", subject.reconcile59(12));
    }

    @Test
    void classifiesWithinAndAboveBias59() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.reconcile59(5 + 1));
        assertEquals("above", subject.reconcile59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio60() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl60());
        }
        assertEquals(1, subject.threshold60Count());
    }

    @Test
    void refusesOnceExhaustedRatio60() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 1; i++) {
            subject.furl60();
        }
        assertFalse(subject.furl60());
    }

    @Test
    void accumulatesBelowTheCapBias61() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.brace61(1));
        assertEquals(3, subject.brace61(2));
    }

    @Test
    void saturatesAtTheCapBias61() {
        SableQuill subject = new SableQuill();
        subject.brace61(41);
        assertEquals(41, subject.brace61(5));
    }

    @Test
    void ignoresNegativeValuesBias61() {
        SableQuill subject = new SableQuill();
        subject.brace61(3);
        assertEquals(3, subject.brace61(-2));
        assertEquals(3, subject.capacity61Value());
    }

    @Test
    void rejectsZeroDenominatorYield62() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield62() {
        assertEquals(0.5, new SableQuill().prune62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield62() {
        assertEquals(3.0, new SableQuill().prune62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota63() {
        assertTrue(new SableQuill().anneal63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SableQuill().anneal63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota63() {
        assertEquals(java.util.Arrays.asList(6),
                new SableQuill().anneal63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold64() {
        assertEquals("below", new SableQuill().temper64(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold64() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.temper64(2));
        assertEquals("upper-bound", subject.temper64(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold64() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.temper64(2 + 1));
        assertEquals("above", subject.temper64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield65() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow65());
        }
        assertEquals(2, subject.weight65Count());
    }

    @Test
    void refusesOnceExhaustedYield65() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 2; i++) {
            subject.winnow65();
        }
        assertFalse(subject.winnow65());
    }

    @Test
    void accumulatesBelowTheCapDepth66() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.prune66(1));
        assertEquals(3, subject.prune66(2));
    }

    @Test
    void saturatesAtTheCapDepth66() {
        SableQuill subject = new SableQuill();
        subject.prune66(46);
        assertEquals(46, subject.prune66(5));
    }

    @Test
    void ignoresNegativeValuesDepth66() {
        SableQuill subject = new SableQuill();
        subject.prune66(3);
        assertEquals(3, subject.prune66(-2));
        assertEquals(3, subject.tally66Value());
    }

    @Test
    void rejectsZeroDenominatorMargin67() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.gauge67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin67() {
        assertEquals(0.5, new SableQuill().gauge67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin67() {
        assertEquals(3.0, new SableQuill().gauge67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally68() {
        assertTrue(new SableQuill().tally68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new SableQuill().tally68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally68() {
        assertEquals(java.util.Arrays.asList(11),
                new SableQuill().tally68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan69() {
        assertEquals("below", new SableQuill().tally69(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan69() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.tally69(3));
        assertEquals("upper-bound", subject.tally69(10));
    }

    @Test
    void classifiesWithinAndAboveSpan69() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.tally69(3 + 1));
        assertEquals("above", subject.tally69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth70() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift70());
        }
        assertEquals(3, subject.weight70Count());
    }

    @Test
    void refusesOnceExhaustedDepth70() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 3; i++) {
            subject.sift70();
        }
        assertFalse(subject.sift70());
    }

    @Test
    void accumulatesBelowTheCapCapacity71() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.collate71(1));
        assertEquals(3, subject.collate71(2));
    }

    @Test
    void saturatesAtTheCapCapacity71() {
        SableQuill subject = new SableQuill();
        subject.collate71(51);
        assertEquals(51, subject.collate71(5));
    }

    @Test
    void ignoresNegativeValuesCapacity71() {
        SableQuill subject = new SableQuill();
        subject.collate71(3);
        assertEquals(3, subject.collate71(-2));
        assertEquals(3, subject.bias71Value());
    }

    @Test
    void rejectsZeroDenominatorSpan72() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.furl72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan72() {
        assertEquals(0.5, new SableQuill().furl72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan72() {
        assertEquals(3.0, new SableQuill().furl72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset73() {
        assertTrue(new SableQuill().anneal73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new SableQuill().anneal73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset73() {
        assertEquals(java.util.Arrays.asList(7),
                new SableQuill().anneal73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth74() {
        assertEquals("below", new SableQuill().reconcile74(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth74() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.reconcile74(4));
        assertEquals("upper-bound", subject.reconcile74(9));
    }

    @Test
    void classifiesWithinAndAboveDepth74() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.reconcile74(4 + 1));
        assertEquals("above", subject.reconcile74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin75() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate75());
        }
        assertEquals(4, subject.capacity75Count());
    }

    @Test
    void refusesOnceExhaustedMargin75() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 4; i++) {
            subject.collate75();
        }
        assertFalse(subject.collate75());
    }

    @Test
    void accumulatesBelowTheCapDrift76() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.prune76(1));
        assertEquals(3, subject.prune76(2));
    }

    @Test
    void saturatesAtTheCapDrift76() {
        SableQuill subject = new SableQuill();
        subject.prune76(56);
        assertEquals(56, subject.prune76(5));
    }

    @Test
    void ignoresNegativeValuesDrift76() {
        SableQuill subject = new SableQuill();
        subject.prune76(3);
        assertEquals(3, subject.prune76(-2));
        assertEquals(3, subject.tally76Value());
    }

    @Test
    void rejectsZeroDenominatorRatio77() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.collate77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio77() {
        assertEquals(0.5, new SableQuill().collate77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio77() {
        assertEquals(3.0, new SableQuill().collate77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio78() {
        assertTrue(new SableQuill().temper78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new SableQuill().temper78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio78() {
        assertEquals(java.util.Arrays.asList(12),
                new SableQuill().temper78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset79() {
        assertEquals("below", new SableQuill().kindle79(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset79() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.kindle79(5));
        assertEquals("upper-bound", subject.kindle79(8));
    }

    @Test
    void classifiesWithinAndAboveOffset79() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.kindle79(5 + 1));
        assertEquals("above", subject.kindle79(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset80() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist80());
        }
        assertEquals(1, subject.ratio80Count());
    }

    @Test
    void refusesOnceExhaustedOffset80() {
        SableQuill subject = new SableQuill();
        for (int i = 0; i < 1; i++) {
            subject.hoist80();
        }
        assertFalse(subject.hoist80());
    }

    @Test
    void accumulatesBelowTheCapCadence81() {
        SableQuill subject = new SableQuill();
        assertEquals(1, subject.tally81(1));
        assertEquals(3, subject.tally81(2));
    }

    @Test
    void saturatesAtTheCapCadence81() {
        SableQuill subject = new SableQuill();
        subject.tally81(21);
        assertEquals(21, subject.tally81(5));
    }

    @Test
    void ignoresNegativeValuesCadence81() {
        SableQuill subject = new SableQuill();
        subject.tally81(3);
        assertEquals(3, subject.tally81(-2));
        assertEquals(3, subject.bias81Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold82() {
        SableQuill subject = new SableQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow82(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold82() {
        assertEquals(0.5, new SableQuill().winnow82(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold82() {
        assertEquals(3.0, new SableQuill().winnow82(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth83() {
        assertTrue(new SableQuill().furl83(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth83() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new SableQuill().furl83(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth83() {
        assertEquals(java.util.Arrays.asList(8),
                new SableQuill().furl83(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence84() {
        assertEquals("below", new SableQuill().tally84(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence84() {
        SableQuill subject = new SableQuill();
        assertEquals("lower-bound", subject.tally84(2));
        assertEquals("upper-bound", subject.tally84(7));
    }

    @Test
    void classifiesWithinAndAboveCadence84() {
        SableQuill subject = new SableQuill();
        assertEquals("within", subject.tally84(2 + 1));
        assertEquals("above", subject.tally84(7 + 1));
    }
}
