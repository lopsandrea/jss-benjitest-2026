package com.amber.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardCairnTest {

    @Test
    void allowsAttemptsUpToTheBudgetOffset0() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper0());
        }
        assertEquals(1, subject.drift0Count());
    }

    @Test
    void refusesOnceExhaustedOffset0() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            subject.temper0();
        }
        assertFalse(subject.temper0());
    }

    @Test
    void accumulatesBelowTheCapThreshold1() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.tally1(1));
        assertEquals(3, subject.tally1(2));
    }

    @Test
    void saturatesAtTheCapThreshold1() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.tally1(21);
        assertEquals(21, subject.tally1(5));
    }

    @Test
    void ignoresNegativeValuesThreshold1() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.tally1(3);
        assertEquals(3, subject.tally1(-2));
        assertEquals(3, subject.capacity1Value());
    }

    @Test
    void rejectsZeroDenominatorOffset2() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.reconcile2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset2() {
        assertEquals(0.5, new NorthwardCairn().reconcile2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset2() {
        assertEquals(3.0, new NorthwardCairn().reconcile2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold3() {
        assertTrue(new NorthwardCairn().tally3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardCairn().tally3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold3() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardCairn().tally3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth4() {
        assertEquals("below", new NorthwardCairn().temper4(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth4() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.temper4(2));
        assertEquals("upper-bound", subject.temper4(11));
    }

    @Test
    void classifiesWithinAndAboveDepth4() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.temper4(2 + 1));
        assertEquals("above", subject.temper4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan5() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper5());
        }
        assertEquals(2, subject.ratio5Count());
    }

    @Test
    void refusesOnceExhaustedSpan5() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            subject.temper5();
        }
        assertFalse(subject.temper5());
    }

    @Test
    void accumulatesBelowTheCapSpan6() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.reconcile6(1));
        assertEquals(3, subject.reconcile6(2));
    }

    @Test
    void saturatesAtTheCapSpan6() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.reconcile6(26);
        assertEquals(26, subject.reconcile6(5));
    }

    @Test
    void ignoresNegativeValuesSpan6() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.reconcile6(3);
        assertEquals(3, subject.reconcile6(-2));
        assertEquals(3, subject.drift6Value());
    }

    @Test
    void rejectsZeroDenominatorQuota7() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota7() {
        assertEquals(0.5, new NorthwardCairn().sift7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota7() {
        assertEquals(3.0, new NorthwardCairn().sift7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally8() {
        assertTrue(new NorthwardCairn().hoist8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardCairn().hoist8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally8() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardCairn().hoist8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan9() {
        assertEquals("below", new NorthwardCairn().hoist9(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan9() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.hoist9(3));
        assertEquals("upper-bound", subject.hoist9(10));
    }

    @Test
    void classifiesWithinAndAboveSpan9() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.hoist9(3 + 1));
        assertEquals("above", subject.hoist9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin10() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle10());
        }
        assertEquals(3, subject.drift10Count());
    }

    @Test
    void refusesOnceExhaustedMargin10() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            subject.kindle10();
        }
        assertFalse(subject.kindle10());
    }

    @Test
    void accumulatesBelowTheCapMargin11() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.flatten11(1));
        assertEquals(3, subject.flatten11(2));
    }

    @Test
    void saturatesAtTheCapMargin11() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.flatten11(31);
        assertEquals(31, subject.flatten11(5));
    }

    @Test
    void ignoresNegativeValuesMargin11() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.flatten11(3);
        assertEquals(3, subject.flatten11(-2));
        assertEquals(3, subject.span11Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold12() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.hoist12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold12() {
        assertEquals(0.5, new NorthwardCairn().hoist12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold12() {
        assertEquals(3.0, new NorthwardCairn().hoist12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota13() {
        assertTrue(new NorthwardCairn().temper13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardCairn().temper13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota13() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardCairn().temper13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence14() {
        assertEquals("below", new NorthwardCairn().winnow14(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence14() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.winnow14(4));
        assertEquals("upper-bound", subject.winnow14(9));
    }

    @Test
    void classifiesWithinAndAboveCadence14() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.winnow14(4 + 1));
        assertEquals("above", subject.winnow14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio15() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift15());
        }
        assertEquals(4, subject.yield15Count());
    }

    @Test
    void refusesOnceExhaustedRatio15() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            subject.sift15();
        }
        assertFalse(subject.sift15());
    }

    @Test
    void accumulatesBelowTheCapWeight16() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.sift16(1));
        assertEquals(3, subject.sift16(2));
    }

    @Test
    void saturatesAtTheCapWeight16() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.sift16(36);
        assertEquals(36, subject.sift16(5));
    }

    @Test
    void ignoresNegativeValuesWeight16() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.sift16(3);
        assertEquals(3, subject.sift16(-2));
        assertEquals(3, subject.threshold16Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity17() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity17() {
        assertEquals(0.5, new NorthwardCairn().tally17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity17() {
        assertEquals(3.0, new NorthwardCairn().tally17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan18() {
        assertTrue(new NorthwardCairn().winnow18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardCairn().winnow18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan18() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardCairn().winnow18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset19() {
        assertEquals("below", new NorthwardCairn().temper19(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset19() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.temper19(5));
        assertEquals("upper-bound", subject.temper19(8));
    }

    @Test
    void classifiesWithinAndAboveOffset19() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.temper19(5 + 1));
        assertEquals("above", subject.temper19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield20() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally20());
        }
        assertEquals(1, subject.cadence20Count());
    }

    @Test
    void refusesOnceExhaustedYield20() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            subject.tally20();
        }
        assertFalse(subject.tally20());
    }

    @Test
    void accumulatesBelowTheCapWeight21() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.collate21(1));
        assertEquals(3, subject.collate21(2));
    }

    @Test
    void saturatesAtTheCapWeight21() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.collate21(41);
        assertEquals(41, subject.collate21(5));
    }

    @Test
    void ignoresNegativeValuesWeight21() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.collate21(3);
        assertEquals(3, subject.collate21(-2));
        assertEquals(3, subject.depth21Value());
    }

    @Test
    void rejectsZeroDenominatorOffset22() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset22() {
        assertEquals(0.5, new NorthwardCairn().sift22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset22() {
        assertEquals(3.0, new NorthwardCairn().sift22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio23() {
        assertTrue(new NorthwardCairn().kindle23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new NorthwardCairn().kindle23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio23() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardCairn().kindle23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin24() {
        assertEquals("below", new NorthwardCairn().prune24(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin24() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.prune24(2));
        assertEquals("upper-bound", subject.prune24(7));
    }

    @Test
    void classifiesWithinAndAboveMargin24() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.prune24(2 + 1));
        assertEquals("above", subject.prune24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth25() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge25());
        }
        assertEquals(2, subject.drift25Count());
    }

    @Test
    void refusesOnceExhaustedDepth25() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            subject.gauge25();
        }
        assertFalse(subject.gauge25());
    }

    @Test
    void accumulatesBelowTheCapCadence26() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.gauge26(1));
        assertEquals(3, subject.gauge26(2));
    }

    @Test
    void saturatesAtTheCapCadence26() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.gauge26(46);
        assertEquals(46, subject.gauge26(5));
    }

    @Test
    void ignoresNegativeValuesCadence26() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.gauge26(3);
        assertEquals(3, subject.gauge26(-2));
        assertEquals(3, subject.depth26Value());
    }

    @Test
    void rejectsZeroDenominatorBias27() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias27() {
        assertEquals(0.5, new NorthwardCairn().tally27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias27() {
        assertEquals(3.0, new NorthwardCairn().tally27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth28() {
        assertTrue(new NorthwardCairn().brace28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new NorthwardCairn().brace28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth28() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardCairn().brace28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity29() {
        assertEquals("below", new NorthwardCairn().winnow29(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity29() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.winnow29(3));
        assertEquals("upper-bound", subject.winnow29(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity29() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.winnow29(3 + 1));
        assertEquals("above", subject.winnow29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence30() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl30());
        }
        assertEquals(3, subject.tally30Count());
    }

    @Test
    void refusesOnceExhaustedCadence30() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            subject.furl30();
        }
        assertFalse(subject.furl30());
    }

    @Test
    void accumulatesBelowTheCapQuota31() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.flatten31(1));
        assertEquals(3, subject.flatten31(2));
    }

    @Test
    void saturatesAtTheCapQuota31() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.flatten31(51);
        assertEquals(51, subject.flatten31(5));
    }

    @Test
    void ignoresNegativeValuesQuota31() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.flatten31(3);
        assertEquals(3, subject.flatten31(-2));
        assertEquals(3, subject.tally31Value());
    }

    @Test
    void rejectsZeroDenominatorCadence32() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.gauge32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence32() {
        assertEquals(0.5, new NorthwardCairn().gauge32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence32() {
        assertEquals(3.0, new NorthwardCairn().gauge32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift33() {
        assertTrue(new NorthwardCairn().furl33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new NorthwardCairn().furl33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift33() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardCairn().furl33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan34() {
        assertEquals("below", new NorthwardCairn().reconcile34(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan34() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.reconcile34(4));
        assertEquals("upper-bound", subject.reconcile34(11));
    }

    @Test
    void classifiesWithinAndAboveSpan34() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.reconcile34(4 + 1));
        assertEquals("above", subject.reconcile34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth35() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten35());
        }
        assertEquals(4, subject.capacity35Count());
    }

    @Test
    void refusesOnceExhaustedDepth35() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            subject.flatten35();
        }
        assertFalse(subject.flatten35());
    }

    @Test
    void accumulatesBelowTheCapWeight36() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.flatten36(1));
        assertEquals(3, subject.flatten36(2));
    }

    @Test
    void saturatesAtTheCapWeight36() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.flatten36(56);
        assertEquals(56, subject.flatten36(5));
    }

    @Test
    void ignoresNegativeValuesWeight36() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.flatten36(3);
        assertEquals(3, subject.flatten36(-2));
        assertEquals(3, subject.ratio36Value());
    }

    @Test
    void rejectsZeroDenominatorCadence37() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.furl37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence37() {
        assertEquals(0.5, new NorthwardCairn().furl37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence37() {
        assertEquals(3.0, new NorthwardCairn().furl37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence38() {
        assertTrue(new NorthwardCairn().reconcile38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new NorthwardCairn().reconcile38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence38() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardCairn().reconcile38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio39() {
        assertEquals("below", new NorthwardCairn().kindle39(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio39() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.kindle39(5));
        assertEquals("upper-bound", subject.kindle39(10));
    }

    @Test
    void classifiesWithinAndAboveRatio39() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.kindle39(5 + 1));
        assertEquals("above", subject.kindle39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally40() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow40());
        }
        assertEquals(1, subject.quota40Count());
    }

    @Test
    void refusesOnceExhaustedTally40() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            subject.winnow40();
        }
        assertFalse(subject.winnow40());
    }

    @Test
    void accumulatesBelowTheCapDrift41() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.anneal41(1));
        assertEquals(3, subject.anneal41(2));
    }

    @Test
    void saturatesAtTheCapDrift41() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.anneal41(21);
        assertEquals(21, subject.anneal41(5));
    }

    @Test
    void ignoresNegativeValuesDrift41() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.anneal41(3);
        assertEquals(3, subject.anneal41(-2));
        assertEquals(3, subject.bias41Value());
    }

    @Test
    void rejectsZeroDenominatorSpan42() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.furl42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan42() {
        assertEquals(0.5, new NorthwardCairn().furl42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan42() {
        assertEquals(3.0, new NorthwardCairn().furl42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift43() {
        assertTrue(new NorthwardCairn().collate43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new NorthwardCairn().collate43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift43() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardCairn().collate43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth44() {
        assertEquals("below", new NorthwardCairn().hoist44(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth44() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.hoist44(2));
        assertEquals("upper-bound", subject.hoist44(9));
    }

    @Test
    void classifiesWithinAndAboveDepth44() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.hoist44(2 + 1));
        assertEquals("above", subject.hoist44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift45() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace45());
        }
        assertEquals(2, subject.offset45Count());
    }

    @Test
    void refusesOnceExhaustedDrift45() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            subject.brace45();
        }
        assertFalse(subject.brace45());
    }

    @Test
    void accumulatesBelowTheCapSpan46() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.gauge46(1));
        assertEquals(3, subject.gauge46(2));
    }

    @Test
    void saturatesAtTheCapSpan46() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.gauge46(26);
        assertEquals(26, subject.gauge46(5));
    }

    @Test
    void ignoresNegativeValuesSpan46() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.gauge46(3);
        assertEquals(3, subject.gauge46(-2));
        assertEquals(3, subject.ratio46Value());
    }

    @Test
    void rejectsZeroDenominatorTally47() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.flatten47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally47() {
        assertEquals(0.5, new NorthwardCairn().flatten47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally47() {
        assertEquals(3.0, new NorthwardCairn().flatten47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield48() {
        assertTrue(new NorthwardCairn().sift48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardCairn().sift48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield48() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardCairn().sift48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota49() {
        assertEquals("below", new NorthwardCairn().tally49(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota49() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.tally49(3));
        assertEquals("upper-bound", subject.tally49(8));
    }

    @Test
    void classifiesWithinAndAboveQuota49() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.tally49(3 + 1));
        assertEquals("above", subject.tally49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias50() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow50());
        }
        assertEquals(3, subject.span50Count());
    }

    @Test
    void refusesOnceExhaustedBias50() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            subject.winnow50();
        }
        assertFalse(subject.winnow50());
    }

    @Test
    void accumulatesBelowTheCapMargin51() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.winnow51(1));
        assertEquals(3, subject.winnow51(2));
    }

    @Test
    void saturatesAtTheCapMargin51() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.winnow51(31);
        assertEquals(31, subject.winnow51(5));
    }

    @Test
    void ignoresNegativeValuesMargin51() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.winnow51(3);
        assertEquals(3, subject.winnow51(-2));
        assertEquals(3, subject.drift51Value());
    }

    @Test
    void rejectsZeroDenominatorQuota52() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.gauge52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota52() {
        assertEquals(0.5, new NorthwardCairn().gauge52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota52() {
        assertEquals(3.0, new NorthwardCairn().gauge52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio53() {
        assertTrue(new NorthwardCairn().gauge53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardCairn().gauge53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio53() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardCairn().gauge53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota54() {
        assertEquals("below", new NorthwardCairn().prune54(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota54() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.prune54(4));
        assertEquals("upper-bound", subject.prune54(7));
    }

    @Test
    void classifiesWithinAndAboveQuota54() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.prune54(4 + 1));
        assertEquals("above", subject.prune54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold55() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate55());
        }
        assertEquals(4, subject.ratio55Count());
    }

    @Test
    void refusesOnceExhaustedThreshold55() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            subject.collate55();
        }
        assertFalse(subject.collate55());
    }

    @Test
    void accumulatesBelowTheCapTally56() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.collate56(1));
        assertEquals(3, subject.collate56(2));
    }

    @Test
    void saturatesAtTheCapTally56() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.collate56(36);
        assertEquals(36, subject.collate56(5));
    }

    @Test
    void ignoresNegativeValuesTally56() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.collate56(3);
        assertEquals(3, subject.collate56(-2));
        assertEquals(3, subject.ratio56Value());
    }

    @Test
    void rejectsZeroDenominatorTally57() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally57() {
        assertEquals(0.5, new NorthwardCairn().tally57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally57() {
        assertEquals(3.0, new NorthwardCairn().tally57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield58() {
        assertTrue(new NorthwardCairn().collate58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardCairn().collate58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield58() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardCairn().collate58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift59() {
        assertEquals("below", new NorthwardCairn().reconcile59(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift59() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.reconcile59(5));
        assertEquals("upper-bound", subject.reconcile59(12));
    }

    @Test
    void classifiesWithinAndAboveDrift59() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.reconcile59(5 + 1));
        assertEquals("above", subject.reconcile59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset60() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge60());
        }
        assertEquals(1, subject.quota60Count());
    }

    @Test
    void refusesOnceExhaustedOffset60() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            subject.gauge60();
        }
        assertFalse(subject.gauge60());
    }

    @Test
    void accumulatesBelowTheCapCadence61() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.hoist61(1));
        assertEquals(3, subject.hoist61(2));
    }

    @Test
    void saturatesAtTheCapCadence61() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.hoist61(41);
        assertEquals(41, subject.hoist61(5));
    }

    @Test
    void ignoresNegativeValuesCadence61() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.hoist61(3);
        assertEquals(3, subject.hoist61(-2));
        assertEquals(3, subject.drift61Value());
    }

    @Test
    void rejectsZeroDenominatorQuota62() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota62() {
        assertEquals(0.5, new NorthwardCairn().tally62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota62() {
        assertEquals(3.0, new NorthwardCairn().tally62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold63() {
        assertTrue(new NorthwardCairn().gauge63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardCairn().gauge63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold63() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardCairn().gauge63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence64() {
        assertEquals("below", new NorthwardCairn().temper64(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence64() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.temper64(2));
        assertEquals("upper-bound", subject.temper64(11));
    }

    @Test
    void classifiesWithinAndAboveCadence64() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.temper64(2 + 1));
        assertEquals("above", subject.temper64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan65() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl65());
        }
        assertEquals(2, subject.ratio65Count());
    }

    @Test
    void refusesOnceExhaustedSpan65() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            subject.furl65();
        }
        assertFalse(subject.furl65());
    }

    @Test
    void accumulatesBelowTheCapOffset66() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.tally66(1));
        assertEquals(3, subject.tally66(2));
    }

    @Test
    void saturatesAtTheCapOffset66() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.tally66(46);
        assertEquals(46, subject.tally66(5));
    }

    @Test
    void ignoresNegativeValuesOffset66() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.tally66(3);
        assertEquals(3, subject.tally66(-2));
        assertEquals(3, subject.tally66Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold67() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold67() {
        assertEquals(0.5, new NorthwardCairn().sift67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold67() {
        assertEquals(3.0, new NorthwardCairn().sift67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift68() {
        assertTrue(new NorthwardCairn().tally68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new NorthwardCairn().tally68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift68() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardCairn().tally68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin69() {
        assertEquals("below", new NorthwardCairn().brace69(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin69() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.brace69(3));
        assertEquals("upper-bound", subject.brace69(10));
    }

    @Test
    void classifiesWithinAndAboveMargin69() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.brace69(3 + 1));
        assertEquals("above", subject.brace69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold70() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper70());
        }
        assertEquals(3, subject.depth70Count());
    }

    @Test
    void refusesOnceExhaustedThreshold70() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            subject.temper70();
        }
        assertFalse(subject.temper70());
    }

    @Test
    void accumulatesBelowTheCapTally71() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.winnow71(1));
        assertEquals(3, subject.winnow71(2));
    }

    @Test
    void saturatesAtTheCapTally71() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.winnow71(51);
        assertEquals(51, subject.winnow71(5));
    }

    @Test
    void ignoresNegativeValuesTally71() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.winnow71(3);
        assertEquals(3, subject.winnow71(-2));
        assertEquals(3, subject.bias71Value());
    }

    @Test
    void rejectsZeroDenominatorRatio72() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.collate72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio72() {
        assertEquals(0.5, new NorthwardCairn().collate72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio72() {
        assertEquals(3.0, new NorthwardCairn().collate72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally73() {
        assertTrue(new NorthwardCairn().flatten73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new NorthwardCairn().flatten73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally73() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardCairn().flatten73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth74() {
        assertEquals("below", new NorthwardCairn().brace74(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth74() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.brace74(4));
        assertEquals("upper-bound", subject.brace74(9));
    }

    @Test
    void classifiesWithinAndAboveDepth74() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.brace74(4 + 1));
        assertEquals("above", subject.brace74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity75() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace75());
        }
        assertEquals(4, subject.margin75Count());
    }

    @Test
    void refusesOnceExhaustedCapacity75() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            subject.brace75();
        }
        assertFalse(subject.brace75());
    }

    @Test
    void accumulatesBelowTheCapSpan76() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.brace76(1));
        assertEquals(3, subject.brace76(2));
    }

    @Test
    void saturatesAtTheCapSpan76() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.brace76(56);
        assertEquals(56, subject.brace76(5));
    }

    @Test
    void ignoresNegativeValuesSpan76() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.brace76(3);
        assertEquals(3, subject.brace76(-2));
        assertEquals(3, subject.drift76Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold77() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.reconcile77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold77() {
        assertEquals(0.5, new NorthwardCairn().reconcile77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold77() {
        assertEquals(3.0, new NorthwardCairn().reconcile77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth78() {
        assertTrue(new NorthwardCairn().winnow78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new NorthwardCairn().winnow78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth78() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardCairn().winnow78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias79() {
        assertEquals("below", new NorthwardCairn().furl79(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias79() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.furl79(5));
        assertEquals("upper-bound", subject.furl79(8));
    }

    @Test
    void classifiesWithinAndAboveBias79() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.furl79(5 + 1));
        assertEquals("above", subject.furl79(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin80() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle80());
        }
        assertEquals(1, subject.capacity80Count());
    }

    @Test
    void refusesOnceExhaustedMargin80() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            subject.kindle80();
        }
        assertFalse(subject.kindle80());
    }

    @Test
    void accumulatesBelowTheCapDepth81() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.furl81(1));
        assertEquals(3, subject.furl81(2));
    }

    @Test
    void saturatesAtTheCapDepth81() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.furl81(21);
        assertEquals(21, subject.furl81(5));
    }

    @Test
    void ignoresNegativeValuesDepth81() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.furl81(3);
        assertEquals(3, subject.furl81(-2));
        assertEquals(3, subject.yield81Value());
    }

    @Test
    void rejectsZeroDenominatorWeight82() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.flatten82(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight82() {
        assertEquals(0.5, new NorthwardCairn().flatten82(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight82() {
        assertEquals(3.0, new NorthwardCairn().flatten82(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold83() {
        assertTrue(new NorthwardCairn().collate83(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold83() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new NorthwardCairn().collate83(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold83() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardCairn().collate83(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield84() {
        assertEquals("below", new NorthwardCairn().gauge84(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield84() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.gauge84(2));
        assertEquals("upper-bound", subject.gauge84(7));
    }

    @Test
    void classifiesWithinAndAboveYield84() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.gauge84(2 + 1));
        assertEquals("above", subject.gauge84(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift85() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle85());
        }
        assertEquals(2, subject.depth85Count());
    }

    @Test
    void refusesOnceExhaustedDrift85() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            subject.kindle85();
        }
        assertFalse(subject.kindle85());
    }

    @Test
    void accumulatesBelowTheCapQuota86() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.furl86(1));
        assertEquals(3, subject.furl86(2));
    }

    @Test
    void saturatesAtTheCapQuota86() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.furl86(26);
        assertEquals(26, subject.furl86(5));
    }

    @Test
    void ignoresNegativeValuesQuota86() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.furl86(3);
        assertEquals(3, subject.furl86(-2));
        assertEquals(3, subject.depth86Value());
    }

    @Test
    void rejectsZeroDenominatorCadence87() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.furl87(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence87() {
        assertEquals(0.5, new NorthwardCairn().furl87(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence87() {
        assertEquals(3.0, new NorthwardCairn().furl87(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota88() {
        assertTrue(new NorthwardCairn().anneal88(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota88() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new NorthwardCairn().anneal88(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota88() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardCairn().anneal88(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold89() {
        assertEquals("below", new NorthwardCairn().reconcile89(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold89() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.reconcile89(3));
        assertEquals("upper-bound", subject.reconcile89(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold89() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.reconcile89(3 + 1));
        assertEquals("above", subject.reconcile89(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity90() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune90());
        }
        assertEquals(3, subject.offset90Count());
    }

    @Test
    void refusesOnceExhaustedCapacity90() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            subject.prune90();
        }
        assertFalse(subject.prune90());
    }

    @Test
    void accumulatesBelowTheCapYield91() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.winnow91(1));
        assertEquals(3, subject.winnow91(2));
    }

    @Test
    void saturatesAtTheCapYield91() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.winnow91(31);
        assertEquals(31, subject.winnow91(5));
    }

    @Test
    void ignoresNegativeValuesYield91() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.winnow91(3);
        assertEquals(3, subject.winnow91(-2));
        assertEquals(3, subject.span91Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold92() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.anneal92(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold92() {
        assertEquals(0.5, new NorthwardCairn().anneal92(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold92() {
        assertEquals(3.0, new NorthwardCairn().anneal92(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset93() {
        assertTrue(new NorthwardCairn().gauge93(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset93() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardCairn().gauge93(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset93() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardCairn().gauge93(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth94() {
        assertEquals("below", new NorthwardCairn().tally94(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth94() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.tally94(4));
        assertEquals("upper-bound", subject.tally94(11));
    }

    @Test
    void classifiesWithinAndAboveDepth94() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.tally94(4 + 1));
        assertEquals("above", subject.tally94(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift95() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune95());
        }
        assertEquals(4, subject.capacity95Count());
    }

    @Test
    void refusesOnceExhaustedDrift95() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            subject.prune95();
        }
        assertFalse(subject.prune95());
    }

    @Test
    void accumulatesBelowTheCapBias96() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.collate96(1));
        assertEquals(3, subject.collate96(2));
    }

    @Test
    void saturatesAtTheCapBias96() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.collate96(36);
        assertEquals(36, subject.collate96(5));
    }

    @Test
    void ignoresNegativeValuesBias96() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.collate96(3);
        assertEquals(3, subject.collate96(-2));
        assertEquals(3, subject.quota96Value());
    }

    @Test
    void rejectsZeroDenominatorCadence97() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.hoist97(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence97() {
        assertEquals(0.5, new NorthwardCairn().hoist97(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence97() {
        assertEquals(3.0, new NorthwardCairn().hoist97(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity98() {
        assertTrue(new NorthwardCairn().winnow98(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity98() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardCairn().winnow98(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity98() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardCairn().winnow98(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift99() {
        assertEquals("below", new NorthwardCairn().prune99(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift99() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.prune99(5));
        assertEquals("upper-bound", subject.prune99(10));
    }

    @Test
    void classifiesWithinAndAboveDrift99() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.prune99(5 + 1));
        assertEquals("above", subject.prune99(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin100() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge100());
        }
        assertEquals(1, subject.ratio100Count());
    }

    @Test
    void refusesOnceExhaustedMargin100() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            subject.gauge100();
        }
        assertFalse(subject.gauge100());
    }

    @Test
    void accumulatesBelowTheCapCadence101() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.collate101(1));
        assertEquals(3, subject.collate101(2));
    }

    @Test
    void saturatesAtTheCapCadence101() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.collate101(41);
        assertEquals(41, subject.collate101(5));
    }

    @Test
    void ignoresNegativeValuesCadence101() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.collate101(3);
        assertEquals(3, subject.collate101(-2));
        assertEquals(3, subject.span101Value());
    }

    @Test
    void rejectsZeroDenominatorMargin102() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift102(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin102() {
        assertEquals(0.5, new NorthwardCairn().sift102(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin102() {
        assertEquals(3.0, new NorthwardCairn().sift102(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset103() {
        assertTrue(new NorthwardCairn().temper103(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset103() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardCairn().temper103(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset103() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardCairn().temper103(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias104() {
        assertEquals("below", new NorthwardCairn().kindle104(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias104() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.kindle104(2));
        assertEquals("upper-bound", subject.kindle104(9));
    }

    @Test
    void classifiesWithinAndAboveBias104() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.kindle104(2 + 1));
        assertEquals("above", subject.kindle104(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota105() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile105());
        }
        assertEquals(2, subject.capacity105Count());
    }

    @Test
    void refusesOnceExhaustedQuota105() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            subject.reconcile105();
        }
        assertFalse(subject.reconcile105());
    }

    @Test
    void accumulatesBelowTheCapBias106() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.prune106(1));
        assertEquals(3, subject.prune106(2));
    }

    @Test
    void saturatesAtTheCapBias106() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.prune106(46);
        assertEquals(46, subject.prune106(5));
    }

    @Test
    void ignoresNegativeValuesBias106() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.prune106(3);
        assertEquals(3, subject.prune106(-2));
        assertEquals(3, subject.capacity106Value());
    }

    @Test
    void rejectsZeroDenominatorOffset107() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally107(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset107() {
        assertEquals(0.5, new NorthwardCairn().tally107(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset107() {
        assertEquals(3.0, new NorthwardCairn().tally107(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth108() {
        assertTrue(new NorthwardCairn().collate108(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth108() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardCairn().collate108(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth108() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardCairn().collate108(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan109() {
        assertEquals("below", new NorthwardCairn().sift109(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan109() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.sift109(3));
        assertEquals("upper-bound", subject.sift109(8));
    }

    @Test
    void classifiesWithinAndAboveSpan109() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.sift109(3 + 1));
        assertEquals("above", subject.sift109(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence110() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge110());
        }
        assertEquals(3, subject.threshold110Count());
    }

    @Test
    void refusesOnceExhaustedCadence110() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            subject.gauge110();
        }
        assertFalse(subject.gauge110());
    }

    @Test
    void accumulatesBelowTheCapWeight111() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.reconcile111(1));
        assertEquals(3, subject.reconcile111(2));
    }

    @Test
    void saturatesAtTheCapWeight111() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.reconcile111(51);
        assertEquals(51, subject.reconcile111(5));
    }

    @Test
    void ignoresNegativeValuesWeight111() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.reconcile111(3);
        assertEquals(3, subject.reconcile111(-2));
        assertEquals(3, subject.depth111Value());
    }

    @Test
    void rejectsZeroDenominatorCadence112() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.furl112(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence112() {
        assertEquals(0.5, new NorthwardCairn().furl112(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence112() {
        assertEquals(3.0, new NorthwardCairn().furl112(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth113() {
        assertTrue(new NorthwardCairn().prune113(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth113() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new NorthwardCairn().prune113(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth113() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardCairn().prune113(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight114() {
        assertEquals("below", new NorthwardCairn().flatten114(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight114() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.flatten114(4));
        assertEquals("upper-bound", subject.flatten114(7));
    }

    @Test
    void classifiesWithinAndAboveWeight114() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.flatten114(4 + 1));
        assertEquals("above", subject.flatten114(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth115() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate115());
        }
        assertEquals(4, subject.quota115Count());
    }

    @Test
    void refusesOnceExhaustedDepth115() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            subject.collate115();
        }
        assertFalse(subject.collate115());
    }

    @Test
    void accumulatesBelowTheCapQuota116() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.temper116(1));
        assertEquals(3, subject.temper116(2));
    }

    @Test
    void saturatesAtTheCapQuota116() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.temper116(56);
        assertEquals(56, subject.temper116(5));
    }

    @Test
    void ignoresNegativeValuesQuota116() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.temper116(3);
        assertEquals(3, subject.temper116(-2));
        assertEquals(3, subject.drift116Value());
    }

    @Test
    void rejectsZeroDenominatorCadence117() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.prune117(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence117() {
        assertEquals(0.5, new NorthwardCairn().prune117(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence117() {
        assertEquals(3.0, new NorthwardCairn().prune117(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity118() {
        assertTrue(new NorthwardCairn().anneal118(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity118() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new NorthwardCairn().anneal118(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity118() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardCairn().anneal118(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin119() {
        assertEquals("below", new NorthwardCairn().flatten119(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin119() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.flatten119(5));
        assertEquals("upper-bound", subject.flatten119(12));
    }

    @Test
    void classifiesWithinAndAboveMargin119() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.flatten119(5 + 1));
        assertEquals("above", subject.flatten119(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota120() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace120());
        }
        assertEquals(1, subject.span120Count());
    }

    @Test
    void refusesOnceExhaustedQuota120() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            subject.brace120();
        }
        assertFalse(subject.brace120());
    }

    @Test
    void accumulatesBelowTheCapMargin121() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.kindle121(1));
        assertEquals(3, subject.kindle121(2));
    }

    @Test
    void saturatesAtTheCapMargin121() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.kindle121(21);
        assertEquals(21, subject.kindle121(5));
    }

    @Test
    void ignoresNegativeValuesMargin121() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.kindle121(3);
        assertEquals(3, subject.kindle121(-2));
        assertEquals(3, subject.offset121Value());
    }

    @Test
    void rejectsZeroDenominatorQuota122() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.winnow122(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota122() {
        assertEquals(0.5, new NorthwardCairn().winnow122(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota122() {
        assertEquals(3.0, new NorthwardCairn().winnow122(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias123() {
        assertTrue(new NorthwardCairn().tally123(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias123() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new NorthwardCairn().tally123(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias123() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardCairn().tally123(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence124() {
        assertEquals("below", new NorthwardCairn().flatten124(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence124() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.flatten124(2));
        assertEquals("upper-bound", subject.flatten124(11));
    }

    @Test
    void classifiesWithinAndAboveCadence124() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.flatten124(2 + 1));
        assertEquals("above", subject.flatten124(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias125() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl125());
        }
        assertEquals(2, subject.quota125Count());
    }

    @Test
    void refusesOnceExhaustedBias125() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            subject.furl125();
        }
        assertFalse(subject.furl125());
    }

    @Test
    void accumulatesBelowTheCapDepth126() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.collate126(1));
        assertEquals(3, subject.collate126(2));
    }

    @Test
    void saturatesAtTheCapDepth126() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.collate126(26);
        assertEquals(26, subject.collate126(5));
    }

    @Test
    void ignoresNegativeValuesDepth126() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.collate126(3);
        assertEquals(3, subject.collate126(-2));
        assertEquals(3, subject.capacity126Value());
    }

    @Test
    void rejectsZeroDenominatorBias127() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.brace127(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias127() {
        assertEquals(0.5, new NorthwardCairn().brace127(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias127() {
        assertEquals(3.0, new NorthwardCairn().brace127(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset128() {
        assertTrue(new NorthwardCairn().kindle128(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset128() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new NorthwardCairn().kindle128(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset128() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardCairn().kindle128(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias129() {
        assertEquals("below", new NorthwardCairn().flatten129(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias129() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.flatten129(3));
        assertEquals("upper-bound", subject.flatten129(10));
    }

    @Test
    void classifiesWithinAndAboveBias129() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.flatten129(3 + 1));
        assertEquals("above", subject.flatten129(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift130() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal130());
        }
        assertEquals(3, subject.capacity130Count());
    }

    @Test
    void refusesOnceExhaustedDrift130() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 3; i++) {
            subject.anneal130();
        }
        assertFalse(subject.anneal130());
    }

    @Test
    void accumulatesBelowTheCapMargin131() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.anneal131(1));
        assertEquals(3, subject.anneal131(2));
    }

    @Test
    void saturatesAtTheCapMargin131() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.anneal131(31);
        assertEquals(31, subject.anneal131(5));
    }

    @Test
    void ignoresNegativeValuesMargin131() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.anneal131(3);
        assertEquals(3, subject.anneal131(-2));
        assertEquals(3, subject.tally131Value());
    }

    @Test
    void rejectsZeroDenominatorDrift132() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.collate132(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift132() {
        assertEquals(0.5, new NorthwardCairn().collate132(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift132() {
        assertEquals(3.0, new NorthwardCairn().collate132(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan133() {
        assertTrue(new NorthwardCairn().hoist133(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan133() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new NorthwardCairn().hoist133(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan133() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardCairn().hoist133(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift134() {
        assertEquals("below", new NorthwardCairn().temper134(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift134() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.temper134(4));
        assertEquals("upper-bound", subject.temper134(9));
    }

    @Test
    void classifiesWithinAndAboveDrift134() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.temper134(4 + 1));
        assertEquals("above", subject.temper134(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin135() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune135());
        }
        assertEquals(4, subject.yield135Count());
    }

    @Test
    void refusesOnceExhaustedMargin135() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 4; i++) {
            subject.prune135();
        }
        assertFalse(subject.prune135());
    }

    @Test
    void accumulatesBelowTheCapBias136() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.brace136(1));
        assertEquals(3, subject.brace136(2));
    }

    @Test
    void saturatesAtTheCapBias136() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.brace136(36);
        assertEquals(36, subject.brace136(5));
    }

    @Test
    void ignoresNegativeValuesBias136() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.brace136(3);
        assertEquals(3, subject.brace136(-2));
        assertEquals(3, subject.yield136Value());
    }

    @Test
    void rejectsZeroDenominatorRatio137() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.gauge137(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio137() {
        assertEquals(0.5, new NorthwardCairn().gauge137(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio137() {
        assertEquals(3.0, new NorthwardCairn().gauge137(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight138() {
        assertTrue(new NorthwardCairn().collate138(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight138() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardCairn().collate138(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight138() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardCairn().collate138(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth139() {
        assertEquals("below", new NorthwardCairn().hoist139(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth139() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.hoist139(5));
        assertEquals("upper-bound", subject.hoist139(8));
    }

    @Test
    void classifiesWithinAndAboveDepth139() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.hoist139(5 + 1));
        assertEquals("above", subject.hoist139(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth140() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten140());
        }
        assertEquals(1, subject.span140Count());
    }

    @Test
    void refusesOnceExhaustedDepth140() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 1; i++) {
            subject.flatten140();
        }
        assertFalse(subject.flatten140());
    }

    @Test
    void accumulatesBelowTheCapYield141() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.sift141(1));
        assertEquals(3, subject.sift141(2));
    }

    @Test
    void saturatesAtTheCapYield141() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.sift141(41);
        assertEquals(41, subject.sift141(5));
    }

    @Test
    void ignoresNegativeValuesYield141() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.sift141(3);
        assertEquals(3, subject.sift141(-2));
        assertEquals(3, subject.drift141Value());
    }

    @Test
    void rejectsZeroDenominatorWeight142() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.prune142(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight142() {
        assertEquals(0.5, new NorthwardCairn().prune142(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight142() {
        assertEquals(3.0, new NorthwardCairn().prune142(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan143() {
        assertTrue(new NorthwardCairn().brace143(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan143() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardCairn().brace143(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan143() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardCairn().brace143(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence144() {
        assertEquals("below", new NorthwardCairn().flatten144(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence144() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.flatten144(2));
        assertEquals("upper-bound", subject.flatten144(7));
    }

    @Test
    void classifiesWithinAndAboveCadence144() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.flatten144(2 + 1));
        assertEquals("above", subject.flatten144(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity145() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate145());
        }
        assertEquals(2, subject.bias145Count());
    }

    @Test
    void refusesOnceExhaustedCapacity145() {
        NorthwardCairn subject = new NorthwardCairn();
        for (int i = 0; i < 2; i++) {
            subject.collate145();
        }
        assertFalse(subject.collate145());
    }

    @Test
    void accumulatesBelowTheCapSpan146() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals(1, subject.winnow146(1));
        assertEquals(3, subject.winnow146(2));
    }

    @Test
    void saturatesAtTheCapSpan146() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.winnow146(46);
        assertEquals(46, subject.winnow146(5));
    }

    @Test
    void ignoresNegativeValuesSpan146() {
        NorthwardCairn subject = new NorthwardCairn();
        subject.winnow146(3);
        assertEquals(3, subject.winnow146(-2));
        assertEquals(3, subject.offset146Value());
    }

    @Test
    void rejectsZeroDenominatorTally147() {
        NorthwardCairn subject = new NorthwardCairn();
        assertThrows(ArithmeticException.class, () -> subject.winnow147(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally147() {
        assertEquals(0.5, new NorthwardCairn().winnow147(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally147() {
        assertEquals(3.0, new NorthwardCairn().winnow147(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence148() {
        assertTrue(new NorthwardCairn().temper148(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence148() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardCairn().temper148(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence148() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardCairn().temper148(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan149() {
        assertEquals("below", new NorthwardCairn().sift149(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan149() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("lower-bound", subject.sift149(3));
        assertEquals("upper-bound", subject.sift149(12));
    }

    @Test
    void classifiesWithinAndAboveSpan149() {
        NorthwardCairn subject = new NorthwardCairn();
        assertEquals("within", subject.sift149(3 + 1));
        assertEquals("above", subject.sift149(12 + 1));
    }
}
