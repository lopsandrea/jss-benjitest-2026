package com.ochre.almanac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableAnvilIITest {

    @Test
    void allowsAttemptsUpToTheBudgetMargin0() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift0());
        }
        assertEquals(1, subject.tally0Count());
    }

    @Test
    void refusesOnceExhaustedMargin0() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.sift0();
        }
        assertFalse(subject.sift0());
    }

    @Test
    void accumulatesBelowTheCapBias1() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.tally1(1));
        assertEquals(3, subject.tally1(2));
    }

    @Test
    void saturatesAtTheCapBias1() {
        SableAnvilII subject = new SableAnvilII();
        subject.tally1(21);
        assertEquals(21, subject.tally1(5));
    }

    @Test
    void ignoresNegativeValuesBias1() {
        SableAnvilII subject = new SableAnvilII();
        subject.tally1(3);
        assertEquals(3, subject.tally1(-2));
        assertEquals(3, subject.depth1Value());
    }

    @Test
    void rejectsZeroDenominatorDepth2() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.furl2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth2() {
        assertEquals(0.5, new SableAnvilII().furl2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth2() {
        assertEquals(3.0, new SableAnvilII().furl2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight3() {
        assertTrue(new SableAnvilII().reconcile3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableAnvilII().reconcile3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight3() {
        assertEquals(java.util.Arrays.asList(9),
                new SableAnvilII().reconcile3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity4() {
        assertEquals("below", new SableAnvilII().hoist4(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity4() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.hoist4(2));
        assertEquals("upper-bound", subject.hoist4(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity4() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.hoist4(2 + 1));
        assertEquals("above", subject.hoist4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota5() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper5());
        }
        assertEquals(2, subject.span5Count());
    }

    @Test
    void refusesOnceExhaustedQuota5() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.temper5();
        }
        assertFalse(subject.temper5());
    }

    @Test
    void accumulatesBelowTheCapBias6() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.collate6(1));
        assertEquals(3, subject.collate6(2));
    }

    @Test
    void saturatesAtTheCapBias6() {
        SableAnvilII subject = new SableAnvilII();
        subject.collate6(26);
        assertEquals(26, subject.collate6(5));
    }

    @Test
    void ignoresNegativeValuesBias6() {
        SableAnvilII subject = new SableAnvilII();
        subject.collate6(3);
        assertEquals(3, subject.collate6(-2));
        assertEquals(3, subject.capacity6Value());
    }

    @Test
    void rejectsZeroDenominatorDrift7() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.flatten7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift7() {
        assertEquals(0.5, new SableAnvilII().flatten7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift7() {
        assertEquals(3.0, new SableAnvilII().flatten7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold8() {
        assertTrue(new SableAnvilII().kindle8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SableAnvilII().kindle8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold8() {
        assertEquals(java.util.Arrays.asList(14),
                new SableAnvilII().kindle8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset9() {
        assertEquals("below", new SableAnvilII().winnow9(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset9() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.winnow9(3));
        assertEquals("upper-bound", subject.winnow9(10));
    }

    @Test
    void classifiesWithinAndAboveOffset9() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.winnow9(3 + 1));
        assertEquals("above", subject.winnow9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold10() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper10());
        }
        assertEquals(3, subject.depth10Count());
    }

    @Test
    void refusesOnceExhaustedThreshold10() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.temper10();
        }
        assertFalse(subject.temper10());
    }

    @Test
    void accumulatesBelowTheCapCadence11() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.sift11(1));
        assertEquals(3, subject.sift11(2));
    }

    @Test
    void saturatesAtTheCapCadence11() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift11(31);
        assertEquals(31, subject.sift11(5));
    }

    @Test
    void ignoresNegativeValuesCadence11() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift11(3);
        assertEquals(3, subject.sift11(-2));
        assertEquals(3, subject.weight11Value());
    }

    @Test
    void rejectsZeroDenominatorOffset12() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.temper12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset12() {
        assertEquals(0.5, new SableAnvilII().temper12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset12() {
        assertEquals(3.0, new SableAnvilII().temper12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold13() {
        assertTrue(new SableAnvilII().tally13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SableAnvilII().tally13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold13() {
        assertEquals(java.util.Arrays.asList(10),
                new SableAnvilII().tally13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence14() {
        assertEquals("below", new SableAnvilII().gauge14(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence14() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.gauge14(4));
        assertEquals("upper-bound", subject.gauge14(9));
    }

    @Test
    void classifiesWithinAndAboveCadence14() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.gauge14(4 + 1));
        assertEquals("above", subject.gauge14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift15() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten15());
        }
        assertEquals(4, subject.offset15Count());
    }

    @Test
    void refusesOnceExhaustedDrift15() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.flatten15();
        }
        assertFalse(subject.flatten15());
    }

    @Test
    void accumulatesBelowTheCapWeight16() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.gauge16(1));
        assertEquals(3, subject.gauge16(2));
    }

    @Test
    void saturatesAtTheCapWeight16() {
        SableAnvilII subject = new SableAnvilII();
        subject.gauge16(36);
        assertEquals(36, subject.gauge16(5));
    }

    @Test
    void ignoresNegativeValuesWeight16() {
        SableAnvilII subject = new SableAnvilII();
        subject.gauge16(3);
        assertEquals(3, subject.gauge16(-2));
        assertEquals(3, subject.offset16Value());
    }

    @Test
    void rejectsZeroDenominatorOffset17() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.tally17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset17() {
        assertEquals(0.5, new SableAnvilII().tally17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset17() {
        assertEquals(3.0, new SableAnvilII().tally17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight18() {
        assertTrue(new SableAnvilII().kindle18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SableAnvilII().kindle18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight18() {
        assertEquals(java.util.Arrays.asList(6),
                new SableAnvilII().kindle18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence19() {
        assertEquals("below", new SableAnvilII().collate19(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence19() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.collate19(5));
        assertEquals("upper-bound", subject.collate19(8));
    }

    @Test
    void classifiesWithinAndAboveCadence19() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.collate19(5 + 1));
        assertEquals("above", subject.collate19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift20() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl20());
        }
        assertEquals(1, subject.cadence20Count());
    }

    @Test
    void refusesOnceExhaustedDrift20() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.furl20();
        }
        assertFalse(subject.furl20());
    }

    @Test
    void accumulatesBelowTheCapBias21() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.flatten21(1));
        assertEquals(3, subject.flatten21(2));
    }

    @Test
    void saturatesAtTheCapBias21() {
        SableAnvilII subject = new SableAnvilII();
        subject.flatten21(41);
        assertEquals(41, subject.flatten21(5));
    }

    @Test
    void ignoresNegativeValuesBias21() {
        SableAnvilII subject = new SableAnvilII();
        subject.flatten21(3);
        assertEquals(3, subject.flatten21(-2));
        assertEquals(3, subject.tally21Value());
    }

    @Test
    void rejectsZeroDenominatorDrift22() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.collate22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift22() {
        assertEquals(0.5, new SableAnvilII().collate22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift22() {
        assertEquals(3.0, new SableAnvilII().collate22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin23() {
        assertTrue(new SableAnvilII().gauge23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new SableAnvilII().gauge23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin23() {
        assertEquals(java.util.Arrays.asList(11),
                new SableAnvilII().gauge23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence24() {
        assertEquals("below", new SableAnvilII().furl24(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence24() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.furl24(2));
        assertEquals("upper-bound", subject.furl24(7));
    }

    @Test
    void classifiesWithinAndAboveCadence24() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.furl24(2 + 1));
        assertEquals("above", subject.furl24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio25() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist25());
        }
        assertEquals(2, subject.tally25Count());
    }

    @Test
    void refusesOnceExhaustedRatio25() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.hoist25();
        }
        assertFalse(subject.hoist25());
    }

    @Test
    void accumulatesBelowTheCapBias26() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.anneal26(1));
        assertEquals(3, subject.anneal26(2));
    }

    @Test
    void saturatesAtTheCapBias26() {
        SableAnvilII subject = new SableAnvilII();
        subject.anneal26(46);
        assertEquals(46, subject.anneal26(5));
    }

    @Test
    void ignoresNegativeValuesBias26() {
        SableAnvilII subject = new SableAnvilII();
        subject.anneal26(3);
        assertEquals(3, subject.anneal26(-2));
        assertEquals(3, subject.depth26Value());
    }

    @Test
    void rejectsZeroDenominatorWeight27() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight27() {
        assertEquals(0.5, new SableAnvilII().reconcile27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight27() {
        assertEquals(3.0, new SableAnvilII().reconcile27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth28() {
        assertTrue(new SableAnvilII().reconcile28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new SableAnvilII().reconcile28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth28() {
        assertEquals(java.util.Arrays.asList(7),
                new SableAnvilII().reconcile28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence29() {
        assertEquals("below", new SableAnvilII().hoist29(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence29() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.hoist29(3));
        assertEquals("upper-bound", subject.hoist29(12));
    }

    @Test
    void classifiesWithinAndAboveCadence29() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.hoist29(3 + 1));
        assertEquals("above", subject.hoist29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset30() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl30());
        }
        assertEquals(3, subject.quota30Count());
    }

    @Test
    void refusesOnceExhaustedOffset30() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.furl30();
        }
        assertFalse(subject.furl30());
    }

    @Test
    void accumulatesBelowTheCapSpan31() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.sift31(1));
        assertEquals(3, subject.sift31(2));
    }

    @Test
    void saturatesAtTheCapSpan31() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift31(51);
        assertEquals(51, subject.sift31(5));
    }

    @Test
    void ignoresNegativeValuesSpan31() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift31(3);
        assertEquals(3, subject.sift31(-2));
        assertEquals(3, subject.tally31Value());
    }

    @Test
    void rejectsZeroDenominatorBias32() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.winnow32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias32() {
        assertEquals(0.5, new SableAnvilII().winnow32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias32() {
        assertEquals(3.0, new SableAnvilII().winnow32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence33() {
        assertTrue(new SableAnvilII().reconcile33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new SableAnvilII().reconcile33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence33() {
        assertEquals(java.util.Arrays.asList(12),
                new SableAnvilII().reconcile33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset34() {
        assertEquals("below", new SableAnvilII().prune34(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset34() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.prune34(4));
        assertEquals("upper-bound", subject.prune34(11));
    }

    @Test
    void classifiesWithinAndAboveOffset34() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.prune34(4 + 1));
        assertEquals("above", subject.prune34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth35() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift35());
        }
        assertEquals(4, subject.capacity35Count());
    }

    @Test
    void refusesOnceExhaustedDepth35() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.sift35();
        }
        assertFalse(subject.sift35());
    }

    @Test
    void accumulatesBelowTheCapThreshold36() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.sift36(1));
        assertEquals(3, subject.sift36(2));
    }

    @Test
    void saturatesAtTheCapThreshold36() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift36(56);
        assertEquals(56, subject.sift36(5));
    }

    @Test
    void ignoresNegativeValuesThreshold36() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift36(3);
        assertEquals(3, subject.sift36(-2));
        assertEquals(3, subject.margin36Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity37() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.sift37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity37() {
        assertEquals(0.5, new SableAnvilII().sift37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity37() {
        assertEquals(3.0, new SableAnvilII().sift37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield38() {
        assertTrue(new SableAnvilII().winnow38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new SableAnvilII().winnow38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield38() {
        assertEquals(java.util.Arrays.asList(8),
                new SableAnvilII().winnow38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset39() {
        assertEquals("below", new SableAnvilII().winnow39(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset39() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.winnow39(5));
        assertEquals("upper-bound", subject.winnow39(10));
    }

    @Test
    void classifiesWithinAndAboveOffset39() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.winnow39(5 + 1));
        assertEquals("above", subject.winnow39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth40() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist40());
        }
        assertEquals(1, subject.weight40Count());
    }

    @Test
    void refusesOnceExhaustedDepth40() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.hoist40();
        }
        assertFalse(subject.hoist40());
    }

    @Test
    void accumulatesBelowTheCapDrift41() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.anneal41(1));
        assertEquals(3, subject.anneal41(2));
    }

    @Test
    void saturatesAtTheCapDrift41() {
        SableAnvilII subject = new SableAnvilII();
        subject.anneal41(21);
        assertEquals(21, subject.anneal41(5));
    }

    @Test
    void ignoresNegativeValuesDrift41() {
        SableAnvilII subject = new SableAnvilII();
        subject.anneal41(3);
        assertEquals(3, subject.anneal41(-2));
        assertEquals(3, subject.depth41Value());
    }

    @Test
    void rejectsZeroDenominatorBias42() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.furl42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias42() {
        assertEquals(0.5, new SableAnvilII().furl42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias42() {
        assertEquals(3.0, new SableAnvilII().furl42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally43() {
        assertTrue(new SableAnvilII().sift43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new SableAnvilII().sift43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally43() {
        assertEquals(java.util.Arrays.asList(13),
                new SableAnvilII().sift43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias44() {
        assertEquals("below", new SableAnvilII().brace44(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias44() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.brace44(2));
        assertEquals("upper-bound", subject.brace44(9));
    }

    @Test
    void classifiesWithinAndAboveBias44() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.brace44(2 + 1));
        assertEquals("above", subject.brace44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold45() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge45());
        }
        assertEquals(2, subject.depth45Count());
    }

    @Test
    void refusesOnceExhaustedThreshold45() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.gauge45();
        }
        assertFalse(subject.gauge45());
    }

    @Test
    void accumulatesBelowTheCapMargin46() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.tally46(1));
        assertEquals(3, subject.tally46(2));
    }

    @Test
    void saturatesAtTheCapMargin46() {
        SableAnvilII subject = new SableAnvilII();
        subject.tally46(26);
        assertEquals(26, subject.tally46(5));
    }

    @Test
    void ignoresNegativeValuesMargin46() {
        SableAnvilII subject = new SableAnvilII();
        subject.tally46(3);
        assertEquals(3, subject.tally46(-2));
        assertEquals(3, subject.threshold46Value());
    }

    @Test
    void rejectsZeroDenominatorSpan47() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.hoist47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan47() {
        assertEquals(0.5, new SableAnvilII().hoist47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan47() {
        assertEquals(3.0, new SableAnvilII().hoist47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity48() {
        assertTrue(new SableAnvilII().winnow48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableAnvilII().winnow48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity48() {
        assertEquals(java.util.Arrays.asList(9),
                new SableAnvilII().winnow48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset49() {
        assertEquals("below", new SableAnvilII().reconcile49(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset49() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.reconcile49(3));
        assertEquals("upper-bound", subject.reconcile49(8));
    }

    @Test
    void classifiesWithinAndAboveOffset49() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.reconcile49(3 + 1));
        assertEquals("above", subject.reconcile49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight50() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper50());
        }
        assertEquals(3, subject.margin50Count());
    }

    @Test
    void refusesOnceExhaustedWeight50() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.temper50();
        }
        assertFalse(subject.temper50());
    }

    @Test
    void accumulatesBelowTheCapDepth51() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.sift51(1));
        assertEquals(3, subject.sift51(2));
    }

    @Test
    void saturatesAtTheCapDepth51() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift51(31);
        assertEquals(31, subject.sift51(5));
    }

    @Test
    void ignoresNegativeValuesDepth51() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift51(3);
        assertEquals(3, subject.sift51(-2));
        assertEquals(3, subject.tally51Value());
    }

    @Test
    void rejectsZeroDenominatorMargin52() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.tally52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin52() {
        assertEquals(0.5, new SableAnvilII().tally52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin52() {
        assertEquals(3.0, new SableAnvilII().tally52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield53() {
        assertTrue(new SableAnvilII().prune53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SableAnvilII().prune53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield53() {
        assertEquals(java.util.Arrays.asList(14),
                new SableAnvilII().prune53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth54() {
        assertEquals("below", new SableAnvilII().temper54(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth54() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.temper54(4));
        assertEquals("upper-bound", subject.temper54(7));
    }

    @Test
    void classifiesWithinAndAboveDepth54() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.temper54(4 + 1));
        assertEquals("above", subject.temper54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift55() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle55());
        }
        assertEquals(4, subject.cadence55Count());
    }

    @Test
    void refusesOnceExhaustedDrift55() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.kindle55();
        }
        assertFalse(subject.kindle55());
    }

    @Test
    void accumulatesBelowTheCapCadence56() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.hoist56(1));
        assertEquals(3, subject.hoist56(2));
    }

    @Test
    void saturatesAtTheCapCadence56() {
        SableAnvilII subject = new SableAnvilII();
        subject.hoist56(36);
        assertEquals(36, subject.hoist56(5));
    }

    @Test
    void ignoresNegativeValuesCadence56() {
        SableAnvilII subject = new SableAnvilII();
        subject.hoist56(3);
        assertEquals(3, subject.hoist56(-2));
        assertEquals(3, subject.offset56Value());
    }

    @Test
    void rejectsZeroDenominatorDepth57() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.hoist57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth57() {
        assertEquals(0.5, new SableAnvilII().hoist57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth57() {
        assertEquals(3.0, new SableAnvilII().hoist57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset58() {
        assertTrue(new SableAnvilII().kindle58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SableAnvilII().kindle58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset58() {
        assertEquals(java.util.Arrays.asList(10),
                new SableAnvilII().kindle58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth59() {
        assertEquals("below", new SableAnvilII().winnow59(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth59() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.winnow59(5));
        assertEquals("upper-bound", subject.winnow59(12));
    }

    @Test
    void classifiesWithinAndAboveDepth59() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.winnow59(5 + 1));
        assertEquals("above", subject.winnow59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence60() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow60());
        }
        assertEquals(1, subject.drift60Count());
    }

    @Test
    void refusesOnceExhaustedCadence60() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.winnow60();
        }
        assertFalse(subject.winnow60());
    }

    @Test
    void accumulatesBelowTheCapDrift61() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.prune61(1));
        assertEquals(3, subject.prune61(2));
    }

    @Test
    void saturatesAtTheCapDrift61() {
        SableAnvilII subject = new SableAnvilII();
        subject.prune61(41);
        assertEquals(41, subject.prune61(5));
    }

    @Test
    void ignoresNegativeValuesDrift61() {
        SableAnvilII subject = new SableAnvilII();
        subject.prune61(3);
        assertEquals(3, subject.prune61(-2));
        assertEquals(3, subject.threshold61Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity62() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.gauge62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity62() {
        assertEquals(0.5, new SableAnvilII().gauge62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity62() {
        assertEquals(3.0, new SableAnvilII().gauge62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset63() {
        assertTrue(new SableAnvilII().tally63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SableAnvilII().tally63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset63() {
        assertEquals(java.util.Arrays.asList(6),
                new SableAnvilII().tally63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota64() {
        assertEquals("below", new SableAnvilII().prune64(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota64() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.prune64(2));
        assertEquals("upper-bound", subject.prune64(11));
    }

    @Test
    void classifiesWithinAndAboveQuota64() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.prune64(2 + 1));
        assertEquals("above", subject.prune64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence65() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally65());
        }
        assertEquals(2, subject.depth65Count());
    }

    @Test
    void refusesOnceExhaustedCadence65() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.tally65();
        }
        assertFalse(subject.tally65());
    }

    @Test
    void accumulatesBelowTheCapCadence66() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.anneal66(1));
        assertEquals(3, subject.anneal66(2));
    }

    @Test
    void saturatesAtTheCapCadence66() {
        SableAnvilII subject = new SableAnvilII();
        subject.anneal66(46);
        assertEquals(46, subject.anneal66(5));
    }

    @Test
    void ignoresNegativeValuesCadence66() {
        SableAnvilII subject = new SableAnvilII();
        subject.anneal66(3);
        assertEquals(3, subject.anneal66(-2));
        assertEquals(3, subject.span66Value());
    }

    @Test
    void rejectsZeroDenominatorWeight67() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.hoist67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight67() {
        assertEquals(0.5, new SableAnvilII().hoist67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight67() {
        assertEquals(3.0, new SableAnvilII().hoist67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias68() {
        assertTrue(new SableAnvilII().reconcile68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new SableAnvilII().reconcile68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias68() {
        assertEquals(java.util.Arrays.asList(11),
                new SableAnvilII().reconcile68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin69() {
        assertEquals("below", new SableAnvilII().kindle69(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin69() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.kindle69(3));
        assertEquals("upper-bound", subject.kindle69(10));
    }

    @Test
    void classifiesWithinAndAboveMargin69() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.kindle69(3 + 1));
        assertEquals("above", subject.kindle69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset70() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile70());
        }
        assertEquals(3, subject.drift70Count());
    }

    @Test
    void refusesOnceExhaustedOffset70() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile70();
        }
        assertFalse(subject.reconcile70());
    }

    @Test
    void accumulatesBelowTheCapQuota71() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.sift71(1));
        assertEquals(3, subject.sift71(2));
    }

    @Test
    void saturatesAtTheCapQuota71() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift71(51);
        assertEquals(51, subject.sift71(5));
    }

    @Test
    void ignoresNegativeValuesQuota71() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift71(3);
        assertEquals(3, subject.sift71(-2));
        assertEquals(3, subject.cadence71Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold72() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.prune72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold72() {
        assertEquals(0.5, new SableAnvilII().prune72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold72() {
        assertEquals(3.0, new SableAnvilII().prune72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset73() {
        assertTrue(new SableAnvilII().collate73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new SableAnvilII().collate73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset73() {
        assertEquals(java.util.Arrays.asList(7),
                new SableAnvilII().collate73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio74() {
        assertEquals("below", new SableAnvilII().brace74(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio74() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.brace74(4));
        assertEquals("upper-bound", subject.brace74(9));
    }

    @Test
    void classifiesWithinAndAboveRatio74() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.brace74(4 + 1));
        assertEquals("above", subject.brace74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias75() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist75());
        }
        assertEquals(4, subject.drift75Count());
    }

    @Test
    void refusesOnceExhaustedBias75() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.hoist75();
        }
        assertFalse(subject.hoist75());
    }

    @Test
    void accumulatesBelowTheCapRatio76() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.furl76(1));
        assertEquals(3, subject.furl76(2));
    }

    @Test
    void saturatesAtTheCapRatio76() {
        SableAnvilII subject = new SableAnvilII();
        subject.furl76(56);
        assertEquals(56, subject.furl76(5));
    }

    @Test
    void ignoresNegativeValuesRatio76() {
        SableAnvilII subject = new SableAnvilII();
        subject.furl76(3);
        assertEquals(3, subject.furl76(-2));
        assertEquals(3, subject.yield76Value());
    }

    @Test
    void rejectsZeroDenominatorDrift77() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.brace77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift77() {
        assertEquals(0.5, new SableAnvilII().brace77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift77() {
        assertEquals(3.0, new SableAnvilII().brace77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally78() {
        assertTrue(new SableAnvilII().kindle78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new SableAnvilII().kindle78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally78() {
        assertEquals(java.util.Arrays.asList(12),
                new SableAnvilII().kindle78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield79() {
        assertEquals("below", new SableAnvilII().tally79(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield79() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.tally79(5));
        assertEquals("upper-bound", subject.tally79(8));
    }

    @Test
    void classifiesWithinAndAboveYield79() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.tally79(5 + 1));
        assertEquals("above", subject.tally79(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight80() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate80());
        }
        assertEquals(1, subject.span80Count());
    }

    @Test
    void refusesOnceExhaustedWeight80() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.collate80();
        }
        assertFalse(subject.collate80());
    }

    @Test
    void accumulatesBelowTheCapDepth81() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.reconcile81(1));
        assertEquals(3, subject.reconcile81(2));
    }

    @Test
    void saturatesAtTheCapDepth81() {
        SableAnvilII subject = new SableAnvilII();
        subject.reconcile81(21);
        assertEquals(21, subject.reconcile81(5));
    }

    @Test
    void ignoresNegativeValuesDepth81() {
        SableAnvilII subject = new SableAnvilII();
        subject.reconcile81(3);
        assertEquals(3, subject.reconcile81(-2));
        assertEquals(3, subject.offset81Value());
    }

    @Test
    void rejectsZeroDenominatorDepth82() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.collate82(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth82() {
        assertEquals(0.5, new SableAnvilII().collate82(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth82() {
        assertEquals(3.0, new SableAnvilII().collate82(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan83() {
        assertTrue(new SableAnvilII().gauge83(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan83() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new SableAnvilII().gauge83(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan83() {
        assertEquals(java.util.Arrays.asList(8),
                new SableAnvilII().gauge83(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota84() {
        assertEquals("below", new SableAnvilII().sift84(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota84() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.sift84(2));
        assertEquals("upper-bound", subject.sift84(7));
    }

    @Test
    void classifiesWithinAndAboveQuota84() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.sift84(2 + 1));
        assertEquals("above", subject.sift84(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally85() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile85());
        }
        assertEquals(2, subject.cadence85Count());
    }

    @Test
    void refusesOnceExhaustedTally85() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile85();
        }
        assertFalse(subject.reconcile85());
    }

    @Test
    void accumulatesBelowTheCapRatio86() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.winnow86(1));
        assertEquals(3, subject.winnow86(2));
    }

    @Test
    void saturatesAtTheCapRatio86() {
        SableAnvilII subject = new SableAnvilII();
        subject.winnow86(26);
        assertEquals(26, subject.winnow86(5));
    }

    @Test
    void ignoresNegativeValuesRatio86() {
        SableAnvilII subject = new SableAnvilII();
        subject.winnow86(3);
        assertEquals(3, subject.winnow86(-2));
        assertEquals(3, subject.depth86Value());
    }

    @Test
    void rejectsZeroDenominatorBias87() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.sift87(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias87() {
        assertEquals(0.5, new SableAnvilII().sift87(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias87() {
        assertEquals(3.0, new SableAnvilII().sift87(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias88() {
        assertTrue(new SableAnvilII().tally88(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias88() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new SableAnvilII().tally88(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias88() {
        assertEquals(java.util.Arrays.asList(13),
                new SableAnvilII().tally88(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth89() {
        assertEquals("below", new SableAnvilII().anneal89(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth89() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.anneal89(3));
        assertEquals("upper-bound", subject.anneal89(12));
    }

    @Test
    void classifiesWithinAndAboveDepth89() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.anneal89(3 + 1));
        assertEquals("above", subject.anneal89(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence90() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile90());
        }
        assertEquals(3, subject.threshold90Count());
    }

    @Test
    void refusesOnceExhaustedCadence90() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile90();
        }
        assertFalse(subject.reconcile90());
    }

    @Test
    void accumulatesBelowTheCapBias91() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.hoist91(1));
        assertEquals(3, subject.hoist91(2));
    }

    @Test
    void saturatesAtTheCapBias91() {
        SableAnvilII subject = new SableAnvilII();
        subject.hoist91(31);
        assertEquals(31, subject.hoist91(5));
    }

    @Test
    void ignoresNegativeValuesBias91() {
        SableAnvilII subject = new SableAnvilII();
        subject.hoist91(3);
        assertEquals(3, subject.hoist91(-2));
        assertEquals(3, subject.weight91Value());
    }

    @Test
    void rejectsZeroDenominatorRatio92() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.sift92(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio92() {
        assertEquals(0.5, new SableAnvilII().sift92(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio92() {
        assertEquals(3.0, new SableAnvilII().sift92(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset93() {
        assertTrue(new SableAnvilII().gauge93(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset93() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableAnvilII().gauge93(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset93() {
        assertEquals(java.util.Arrays.asList(9),
                new SableAnvilII().gauge93(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift94() {
        assertEquals("below", new SableAnvilII().reconcile94(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift94() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.reconcile94(4));
        assertEquals("upper-bound", subject.reconcile94(11));
    }

    @Test
    void classifiesWithinAndAboveDrift94() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.reconcile94(4 + 1));
        assertEquals("above", subject.reconcile94(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity95() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl95());
        }
        assertEquals(4, subject.threshold95Count());
    }

    @Test
    void refusesOnceExhaustedCapacity95() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.furl95();
        }
        assertFalse(subject.furl95());
    }

    @Test
    void accumulatesBelowTheCapBias96() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.tally96(1));
        assertEquals(3, subject.tally96(2));
    }

    @Test
    void saturatesAtTheCapBias96() {
        SableAnvilII subject = new SableAnvilII();
        subject.tally96(36);
        assertEquals(36, subject.tally96(5));
    }

    @Test
    void ignoresNegativeValuesBias96() {
        SableAnvilII subject = new SableAnvilII();
        subject.tally96(3);
        assertEquals(3, subject.tally96(-2));
        assertEquals(3, subject.threshold96Value());
    }

    @Test
    void rejectsZeroDenominatorTally97() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.sift97(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally97() {
        assertEquals(0.5, new SableAnvilII().sift97(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally97() {
        assertEquals(3.0, new SableAnvilII().sift97(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan98() {
        assertTrue(new SableAnvilII().gauge98(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan98() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SableAnvilII().gauge98(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan98() {
        assertEquals(java.util.Arrays.asList(14),
                new SableAnvilII().gauge98(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield99() {
        assertEquals("below", new SableAnvilII().kindle99(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield99() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.kindle99(5));
        assertEquals("upper-bound", subject.kindle99(10));
    }

    @Test
    void classifiesWithinAndAboveYield99() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.kindle99(5 + 1));
        assertEquals("above", subject.kindle99(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight100() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile100());
        }
        assertEquals(1, subject.tally100Count());
    }

    @Test
    void refusesOnceExhaustedWeight100() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile100();
        }
        assertFalse(subject.reconcile100());
    }

    @Test
    void accumulatesBelowTheCapBias101() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.sift101(1));
        assertEquals(3, subject.sift101(2));
    }

    @Test
    void saturatesAtTheCapBias101() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift101(41);
        assertEquals(41, subject.sift101(5));
    }

    @Test
    void ignoresNegativeValuesBias101() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift101(3);
        assertEquals(3, subject.sift101(-2));
        assertEquals(3, subject.cadence101Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold102() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile102(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold102() {
        assertEquals(0.5, new SableAnvilII().reconcile102(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold102() {
        assertEquals(3.0, new SableAnvilII().reconcile102(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally103() {
        assertTrue(new SableAnvilII().flatten103(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally103() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SableAnvilII().flatten103(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally103() {
        assertEquals(java.util.Arrays.asList(10),
                new SableAnvilII().flatten103(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold104() {
        assertEquals("below", new SableAnvilII().reconcile104(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold104() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.reconcile104(2));
        assertEquals("upper-bound", subject.reconcile104(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold104() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.reconcile104(2 + 1));
        assertEquals("above", subject.reconcile104(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset105() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist105());
        }
        assertEquals(2, subject.drift105Count());
    }

    @Test
    void refusesOnceExhaustedOffset105() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.hoist105();
        }
        assertFalse(subject.hoist105());
    }

    @Test
    void accumulatesBelowTheCapWeight106() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.tally106(1));
        assertEquals(3, subject.tally106(2));
    }

    @Test
    void saturatesAtTheCapWeight106() {
        SableAnvilII subject = new SableAnvilII();
        subject.tally106(46);
        assertEquals(46, subject.tally106(5));
    }

    @Test
    void ignoresNegativeValuesWeight106() {
        SableAnvilII subject = new SableAnvilII();
        subject.tally106(3);
        assertEquals(3, subject.tally106(-2));
        assertEquals(3, subject.cadence106Value());
    }

    @Test
    void rejectsZeroDenominatorYield107() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.hoist107(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield107() {
        assertEquals(0.5, new SableAnvilII().hoist107(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield107() {
        assertEquals(3.0, new SableAnvilII().hoist107(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight108() {
        assertTrue(new SableAnvilII().anneal108(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight108() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SableAnvilII().anneal108(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight108() {
        assertEquals(java.util.Arrays.asList(6),
                new SableAnvilII().anneal108(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin109() {
        assertEquals("below", new SableAnvilII().prune109(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin109() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.prune109(3));
        assertEquals("upper-bound", subject.prune109(8));
    }

    @Test
    void classifiesWithinAndAboveMargin109() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.prune109(3 + 1));
        assertEquals("above", subject.prune109(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity110() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift110());
        }
        assertEquals(3, subject.drift110Count());
    }

    @Test
    void refusesOnceExhaustedCapacity110() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.sift110();
        }
        assertFalse(subject.sift110());
    }

    @Test
    void accumulatesBelowTheCapRatio111() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.sift111(1));
        assertEquals(3, subject.sift111(2));
    }

    @Test
    void saturatesAtTheCapRatio111() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift111(51);
        assertEquals(51, subject.sift111(5));
    }

    @Test
    void ignoresNegativeValuesRatio111() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift111(3);
        assertEquals(3, subject.sift111(-2));
        assertEquals(3, subject.capacity111Value());
    }

    @Test
    void rejectsZeroDenominatorWeight112() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.collate112(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight112() {
        assertEquals(0.5, new SableAnvilII().collate112(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight112() {
        assertEquals(3.0, new SableAnvilII().collate112(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield113() {
        assertTrue(new SableAnvilII().furl113(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield113() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new SableAnvilII().furl113(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield113() {
        assertEquals(java.util.Arrays.asList(11),
                new SableAnvilII().furl113(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold114() {
        assertEquals("below", new SableAnvilII().collate114(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold114() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.collate114(4));
        assertEquals("upper-bound", subject.collate114(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold114() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.collate114(4 + 1));
        assertEquals("above", subject.collate114(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin115() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten115());
        }
        assertEquals(4, subject.yield115Count());
    }

    @Test
    void refusesOnceExhaustedMargin115() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.flatten115();
        }
        assertFalse(subject.flatten115());
    }

    @Test
    void accumulatesBelowTheCapDrift116() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.kindle116(1));
        assertEquals(3, subject.kindle116(2));
    }

    @Test
    void saturatesAtTheCapDrift116() {
        SableAnvilII subject = new SableAnvilII();
        subject.kindle116(56);
        assertEquals(56, subject.kindle116(5));
    }

    @Test
    void ignoresNegativeValuesDrift116() {
        SableAnvilII subject = new SableAnvilII();
        subject.kindle116(3);
        assertEquals(3, subject.kindle116(-2));
        assertEquals(3, subject.ratio116Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity117() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.hoist117(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity117() {
        assertEquals(0.5, new SableAnvilII().hoist117(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity117() {
        assertEquals(3.0, new SableAnvilII().hoist117(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally118() {
        assertTrue(new SableAnvilII().flatten118(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally118() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new SableAnvilII().flatten118(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally118() {
        assertEquals(java.util.Arrays.asList(7),
                new SableAnvilII().flatten118(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin119() {
        assertEquals("below", new SableAnvilII().temper119(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin119() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.temper119(5));
        assertEquals("upper-bound", subject.temper119(12));
    }

    @Test
    void classifiesWithinAndAboveMargin119() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.temper119(5 + 1));
        assertEquals("above", subject.temper119(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio120() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile120());
        }
        assertEquals(1, subject.drift120Count());
    }

    @Test
    void refusesOnceExhaustedRatio120() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile120();
        }
        assertFalse(subject.reconcile120());
    }

    @Test
    void accumulatesBelowTheCapQuota121() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.reconcile121(1));
        assertEquals(3, subject.reconcile121(2));
    }

    @Test
    void saturatesAtTheCapQuota121() {
        SableAnvilII subject = new SableAnvilII();
        subject.reconcile121(21);
        assertEquals(21, subject.reconcile121(5));
    }

    @Test
    void ignoresNegativeValuesQuota121() {
        SableAnvilII subject = new SableAnvilII();
        subject.reconcile121(3);
        assertEquals(3, subject.reconcile121(-2));
        assertEquals(3, subject.margin121Value());
    }

    @Test
    void rejectsZeroDenominatorCadence122() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.sift122(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence122() {
        assertEquals(0.5, new SableAnvilII().sift122(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence122() {
        assertEquals(3.0, new SableAnvilII().sift122(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight123() {
        assertTrue(new SableAnvilII().kindle123(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight123() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new SableAnvilII().kindle123(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight123() {
        assertEquals(java.util.Arrays.asList(12),
                new SableAnvilII().kindle123(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift124() {
        assertEquals("below", new SableAnvilII().kindle124(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift124() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.kindle124(2));
        assertEquals("upper-bound", subject.kindle124(11));
    }

    @Test
    void classifiesWithinAndAboveDrift124() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.kindle124(2 + 1));
        assertEquals("above", subject.kindle124(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence125() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift125());
        }
        assertEquals(2, subject.tally125Count());
    }

    @Test
    void refusesOnceExhaustedCadence125() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.sift125();
        }
        assertFalse(subject.sift125());
    }

    @Test
    void accumulatesBelowTheCapOffset126() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.prune126(1));
        assertEquals(3, subject.prune126(2));
    }

    @Test
    void saturatesAtTheCapOffset126() {
        SableAnvilII subject = new SableAnvilII();
        subject.prune126(26);
        assertEquals(26, subject.prune126(5));
    }

    @Test
    void ignoresNegativeValuesOffset126() {
        SableAnvilII subject = new SableAnvilII();
        subject.prune126(3);
        assertEquals(3, subject.prune126(-2));
        assertEquals(3, subject.span126Value());
    }

    @Test
    void rejectsZeroDenominatorTally127() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.kindle127(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally127() {
        assertEquals(0.5, new SableAnvilII().kindle127(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally127() {
        assertEquals(3.0, new SableAnvilII().kindle127(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold128() {
        assertTrue(new SableAnvilII().kindle128(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold128() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new SableAnvilII().kindle128(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold128() {
        assertEquals(java.util.Arrays.asList(8),
                new SableAnvilII().kindle128(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota129() {
        assertEquals("below", new SableAnvilII().sift129(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota129() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.sift129(3));
        assertEquals("upper-bound", subject.sift129(10));
    }

    @Test
    void classifiesWithinAndAboveQuota129() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.sift129(3 + 1));
        assertEquals("above", subject.sift129(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield130() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate130());
        }
        assertEquals(3, subject.drift130Count());
    }

    @Test
    void refusesOnceExhaustedYield130() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.collate130();
        }
        assertFalse(subject.collate130());
    }

    @Test
    void accumulatesBelowTheCapRatio131() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.anneal131(1));
        assertEquals(3, subject.anneal131(2));
    }

    @Test
    void saturatesAtTheCapRatio131() {
        SableAnvilII subject = new SableAnvilII();
        subject.anneal131(31);
        assertEquals(31, subject.anneal131(5));
    }

    @Test
    void ignoresNegativeValuesRatio131() {
        SableAnvilII subject = new SableAnvilII();
        subject.anneal131(3);
        assertEquals(3, subject.anneal131(-2));
        assertEquals(3, subject.threshold131Value());
    }

    @Test
    void rejectsZeroDenominatorTally132() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.tally132(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally132() {
        assertEquals(0.5, new SableAnvilII().tally132(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally132() {
        assertEquals(3.0, new SableAnvilII().tally132(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight133() {
        assertTrue(new SableAnvilII().brace133(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight133() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new SableAnvilII().brace133(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight133() {
        assertEquals(java.util.Arrays.asList(13),
                new SableAnvilII().brace133(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally134() {
        assertEquals("below", new SableAnvilII().sift134(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally134() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.sift134(4));
        assertEquals("upper-bound", subject.sift134(9));
    }

    @Test
    void classifiesWithinAndAboveTally134() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.sift134(4 + 1));
        assertEquals("above", subject.sift134(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally135() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal135());
        }
        assertEquals(4, subject.offset135Count());
    }

    @Test
    void refusesOnceExhaustedTally135() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.anneal135();
        }
        assertFalse(subject.anneal135());
    }

    @Test
    void accumulatesBelowTheCapMargin136() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.sift136(1));
        assertEquals(3, subject.sift136(2));
    }

    @Test
    void saturatesAtTheCapMargin136() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift136(36);
        assertEquals(36, subject.sift136(5));
    }

    @Test
    void ignoresNegativeValuesMargin136() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift136(3);
        assertEquals(3, subject.sift136(-2));
        assertEquals(3, subject.drift136Value());
    }

    @Test
    void rejectsZeroDenominatorYield137() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.flatten137(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield137() {
        assertEquals(0.5, new SableAnvilII().flatten137(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield137() {
        assertEquals(3.0, new SableAnvilII().flatten137(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence138() {
        assertTrue(new SableAnvilII().reconcile138(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence138() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableAnvilII().reconcile138(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence138() {
        assertEquals(java.util.Arrays.asList(9),
                new SableAnvilII().reconcile138(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth139() {
        assertEquals("below", new SableAnvilII().anneal139(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth139() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.anneal139(5));
        assertEquals("upper-bound", subject.anneal139(8));
    }

    @Test
    void classifiesWithinAndAboveDepth139() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.anneal139(5 + 1));
        assertEquals("above", subject.anneal139(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio140() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper140());
        }
        assertEquals(1, subject.offset140Count());
    }

    @Test
    void refusesOnceExhaustedRatio140() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.temper140();
        }
        assertFalse(subject.temper140());
    }

    @Test
    void accumulatesBelowTheCapDrift141() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.reconcile141(1));
        assertEquals(3, subject.reconcile141(2));
    }

    @Test
    void saturatesAtTheCapDrift141() {
        SableAnvilII subject = new SableAnvilII();
        subject.reconcile141(41);
        assertEquals(41, subject.reconcile141(5));
    }

    @Test
    void ignoresNegativeValuesDrift141() {
        SableAnvilII subject = new SableAnvilII();
        subject.reconcile141(3);
        assertEquals(3, subject.reconcile141(-2));
        assertEquals(3, subject.yield141Value());
    }

    @Test
    void rejectsZeroDenominatorMargin142() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.brace142(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin142() {
        assertEquals(0.5, new SableAnvilII().brace142(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin142() {
        assertEquals(3.0, new SableAnvilII().brace142(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence143() {
        assertTrue(new SableAnvilII().hoist143(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence143() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SableAnvilII().hoist143(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence143() {
        assertEquals(java.util.Arrays.asList(14),
                new SableAnvilII().hoist143(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan144() {
        assertEquals("below", new SableAnvilII().anneal144(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan144() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.anneal144(2));
        assertEquals("upper-bound", subject.anneal144(7));
    }

    @Test
    void classifiesWithinAndAboveSpan144() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.anneal144(2 + 1));
        assertEquals("above", subject.anneal144(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias145() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper145());
        }
        assertEquals(2, subject.quota145Count());
    }

    @Test
    void refusesOnceExhaustedBias145() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.temper145();
        }
        assertFalse(subject.temper145());
    }

    @Test
    void accumulatesBelowTheCapCapacity146() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.kindle146(1));
        assertEquals(3, subject.kindle146(2));
    }

    @Test
    void saturatesAtTheCapCapacity146() {
        SableAnvilII subject = new SableAnvilII();
        subject.kindle146(46);
        assertEquals(46, subject.kindle146(5));
    }

    @Test
    void ignoresNegativeValuesCapacity146() {
        SableAnvilII subject = new SableAnvilII();
        subject.kindle146(3);
        assertEquals(3, subject.kindle146(-2));
        assertEquals(3, subject.ratio146Value());
    }

    @Test
    void rejectsZeroDenominatorDepth147() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.furl147(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth147() {
        assertEquals(0.5, new SableAnvilII().furl147(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth147() {
        assertEquals(3.0, new SableAnvilII().furl147(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin148() {
        assertTrue(new SableAnvilII().tally148(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin148() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SableAnvilII().tally148(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin148() {
        assertEquals(java.util.Arrays.asList(10),
                new SableAnvilII().tally148(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally149() {
        assertEquals("below", new SableAnvilII().gauge149(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally149() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.gauge149(3));
        assertEquals("upper-bound", subject.gauge149(12));
    }

    @Test
    void classifiesWithinAndAboveTally149() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.gauge149(3 + 1));
        assertEquals("above", subject.gauge149(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally150() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally150());
        }
        assertEquals(3, subject.ratio150Count());
    }

    @Test
    void refusesOnceExhaustedTally150() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.tally150();
        }
        assertFalse(subject.tally150());
    }

    @Test
    void accumulatesBelowTheCapQuota151() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.reconcile151(1));
        assertEquals(3, subject.reconcile151(2));
    }

    @Test
    void saturatesAtTheCapQuota151() {
        SableAnvilII subject = new SableAnvilII();
        subject.reconcile151(51);
        assertEquals(51, subject.reconcile151(5));
    }

    @Test
    void ignoresNegativeValuesQuota151() {
        SableAnvilII subject = new SableAnvilII();
        subject.reconcile151(3);
        assertEquals(3, subject.reconcile151(-2));
        assertEquals(3, subject.weight151Value());
    }

    @Test
    void rejectsZeroDenominatorRatio152() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.temper152(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio152() {
        assertEquals(0.5, new SableAnvilII().temper152(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio152() {
        assertEquals(3.0, new SableAnvilII().temper152(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota153() {
        assertTrue(new SableAnvilII().collate153(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota153() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SableAnvilII().collate153(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota153() {
        assertEquals(java.util.Arrays.asList(6),
                new SableAnvilII().collate153(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence154() {
        assertEquals("below", new SableAnvilII().anneal154(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence154() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.anneal154(4));
        assertEquals("upper-bound", subject.anneal154(11));
    }

    @Test
    void classifiesWithinAndAboveCadence154() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.anneal154(4 + 1));
        assertEquals("above", subject.anneal154(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth155() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal155());
        }
        assertEquals(4, subject.capacity155Count());
    }

    @Test
    void refusesOnceExhaustedDepth155() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.anneal155();
        }
        assertFalse(subject.anneal155());
    }

    @Test
    void accumulatesBelowTheCapCapacity156() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.kindle156(1));
        assertEquals(3, subject.kindle156(2));
    }

    @Test
    void saturatesAtTheCapCapacity156() {
        SableAnvilII subject = new SableAnvilII();
        subject.kindle156(56);
        assertEquals(56, subject.kindle156(5));
    }

    @Test
    void ignoresNegativeValuesCapacity156() {
        SableAnvilII subject = new SableAnvilII();
        subject.kindle156(3);
        assertEquals(3, subject.kindle156(-2));
        assertEquals(3, subject.cadence156Value());
    }

    @Test
    void rejectsZeroDenominatorWeight157() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.flatten157(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight157() {
        assertEquals(0.5, new SableAnvilII().flatten157(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight157() {
        assertEquals(3.0, new SableAnvilII().flatten157(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin158() {
        assertTrue(new SableAnvilII().prune158(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin158() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new SableAnvilII().prune158(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin158() {
        assertEquals(java.util.Arrays.asList(11),
                new SableAnvilII().prune158(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence159() {
        assertEquals("below", new SableAnvilII().anneal159(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence159() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.anneal159(5));
        assertEquals("upper-bound", subject.anneal159(10));
    }

    @Test
    void classifiesWithinAndAboveCadence159() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.anneal159(5 + 1));
        assertEquals("above", subject.anneal159(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset160() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl160());
        }
        assertEquals(1, subject.weight160Count());
    }

    @Test
    void refusesOnceExhaustedOffset160() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.furl160();
        }
        assertFalse(subject.furl160());
    }

    @Test
    void accumulatesBelowTheCapDrift161() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.flatten161(1));
        assertEquals(3, subject.flatten161(2));
    }

    @Test
    void saturatesAtTheCapDrift161() {
        SableAnvilII subject = new SableAnvilII();
        subject.flatten161(21);
        assertEquals(21, subject.flatten161(5));
    }

    @Test
    void ignoresNegativeValuesDrift161() {
        SableAnvilII subject = new SableAnvilII();
        subject.flatten161(3);
        assertEquals(3, subject.flatten161(-2));
        assertEquals(3, subject.depth161Value());
    }

    @Test
    void rejectsZeroDenominatorWeight162() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.tally162(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight162() {
        assertEquals(0.5, new SableAnvilII().tally162(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight162() {
        assertEquals(3.0, new SableAnvilII().tally162(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio163() {
        assertTrue(new SableAnvilII().gauge163(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio163() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new SableAnvilII().gauge163(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio163() {
        assertEquals(java.util.Arrays.asList(7),
                new SableAnvilII().gauge163(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally164() {
        assertEquals("below", new SableAnvilII().gauge164(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally164() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.gauge164(2));
        assertEquals("upper-bound", subject.gauge164(9));
    }

    @Test
    void classifiesWithinAndAboveTally164() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.gauge164(2 + 1));
        assertEquals("above", subject.gauge164(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota165() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle165());
        }
        assertEquals(2, subject.offset165Count());
    }

    @Test
    void refusesOnceExhaustedQuota165() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.kindle165();
        }
        assertFalse(subject.kindle165());
    }

    @Test
    void accumulatesBelowTheCapRatio166() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.anneal166(1));
        assertEquals(3, subject.anneal166(2));
    }

    @Test
    void saturatesAtTheCapRatio166() {
        SableAnvilII subject = new SableAnvilII();
        subject.anneal166(26);
        assertEquals(26, subject.anneal166(5));
    }

    @Test
    void ignoresNegativeValuesRatio166() {
        SableAnvilII subject = new SableAnvilII();
        subject.anneal166(3);
        assertEquals(3, subject.anneal166(-2));
        assertEquals(3, subject.bias166Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity167() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.anneal167(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity167() {
        assertEquals(0.5, new SableAnvilII().anneal167(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity167() {
        assertEquals(3.0, new SableAnvilII().anneal167(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight168() {
        assertTrue(new SableAnvilII().reconcile168(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight168() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new SableAnvilII().reconcile168(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight168() {
        assertEquals(java.util.Arrays.asList(12),
                new SableAnvilII().reconcile168(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio169() {
        assertEquals("below", new SableAnvilII().hoist169(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio169() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.hoist169(3));
        assertEquals("upper-bound", subject.hoist169(8));
    }

    @Test
    void classifiesWithinAndAboveRatio169() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.hoist169(3 + 1));
        assertEquals("above", subject.hoist169(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias170() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile170());
        }
        assertEquals(3, subject.drift170Count());
    }

    @Test
    void refusesOnceExhaustedBias170() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile170();
        }
        assertFalse(subject.reconcile170());
    }

    @Test
    void accumulatesBelowTheCapRatio171() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.hoist171(1));
        assertEquals(3, subject.hoist171(2));
    }

    @Test
    void saturatesAtTheCapRatio171() {
        SableAnvilII subject = new SableAnvilII();
        subject.hoist171(31);
        assertEquals(31, subject.hoist171(5));
    }

    @Test
    void ignoresNegativeValuesRatio171() {
        SableAnvilII subject = new SableAnvilII();
        subject.hoist171(3);
        assertEquals(3, subject.hoist171(-2));
        assertEquals(3, subject.span171Value());
    }

    @Test
    void rejectsZeroDenominatorDrift172() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.gauge172(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift172() {
        assertEquals(0.5, new SableAnvilII().gauge172(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift172() {
        assertEquals(3.0, new SableAnvilII().gauge172(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin173() {
        assertTrue(new SableAnvilII().anneal173(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin173() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new SableAnvilII().anneal173(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin173() {
        assertEquals(java.util.Arrays.asList(8),
                new SableAnvilII().anneal173(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin174() {
        assertEquals("below", new SableAnvilII().kindle174(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin174() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.kindle174(4));
        assertEquals("upper-bound", subject.kindle174(7));
    }

    @Test
    void classifiesWithinAndAboveMargin174() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.kindle174(4 + 1));
        assertEquals("above", subject.kindle174(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias175() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten175());
        }
        assertEquals(4, subject.ratio175Count());
    }

    @Test
    void refusesOnceExhaustedBias175() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.flatten175();
        }
        assertFalse(subject.flatten175());
    }

    @Test
    void accumulatesBelowTheCapCapacity176() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.sift176(1));
        assertEquals(3, subject.sift176(2));
    }

    @Test
    void saturatesAtTheCapCapacity176() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift176(36);
        assertEquals(36, subject.sift176(5));
    }

    @Test
    void ignoresNegativeValuesCapacity176() {
        SableAnvilII subject = new SableAnvilII();
        subject.sift176(3);
        assertEquals(3, subject.sift176(-2));
        assertEquals(3, subject.offset176Value());
    }

    @Test
    void rejectsZeroDenominatorMargin177() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.sift177(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin177() {
        assertEquals(0.5, new SableAnvilII().sift177(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin177() {
        assertEquals(3.0, new SableAnvilII().sift177(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset178() {
        assertTrue(new SableAnvilII().hoist178(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset178() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new SableAnvilII().hoist178(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset178() {
        assertEquals(java.util.Arrays.asList(13),
                new SableAnvilII().hoist178(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield179() {
        assertEquals("below", new SableAnvilII().temper179(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield179() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.temper179(5));
        assertEquals("upper-bound", subject.temper179(12));
    }

    @Test
    void classifiesWithinAndAboveYield179() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.temper179(5 + 1));
        assertEquals("above", subject.temper179(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold180() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl180());
        }
        assertEquals(1, subject.quota180Count());
    }

    @Test
    void refusesOnceExhaustedThreshold180() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.furl180();
        }
        assertFalse(subject.furl180());
    }

    @Test
    void accumulatesBelowTheCapCadence181() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.flatten181(1));
        assertEquals(3, subject.flatten181(2));
    }

    @Test
    void saturatesAtTheCapCadence181() {
        SableAnvilII subject = new SableAnvilII();
        subject.flatten181(41);
        assertEquals(41, subject.flatten181(5));
    }

    @Test
    void ignoresNegativeValuesCadence181() {
        SableAnvilII subject = new SableAnvilII();
        subject.flatten181(3);
        assertEquals(3, subject.flatten181(-2));
        assertEquals(3, subject.bias181Value());
    }

    @Test
    void rejectsZeroDenominatorDrift182() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.hoist182(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift182() {
        assertEquals(0.5, new SableAnvilII().hoist182(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift182() {
        assertEquals(3.0, new SableAnvilII().hoist182(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias183() {
        assertTrue(new SableAnvilII().gauge183(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias183() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableAnvilII().gauge183(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias183() {
        assertEquals(java.util.Arrays.asList(9),
                new SableAnvilII().gauge183(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth184() {
        assertEquals("below", new SableAnvilII().kindle184(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth184() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.kindle184(2));
        assertEquals("upper-bound", subject.kindle184(11));
    }

    @Test
    void classifiesWithinAndAboveDepth184() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.kindle184(2 + 1));
        assertEquals("above", subject.kindle184(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity185() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow185());
        }
        assertEquals(2, subject.span185Count());
    }

    @Test
    void refusesOnceExhaustedCapacity185() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.winnow185();
        }
        assertFalse(subject.winnow185());
    }

    @Test
    void accumulatesBelowTheCapRatio186() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.kindle186(1));
        assertEquals(3, subject.kindle186(2));
    }

    @Test
    void saturatesAtTheCapRatio186() {
        SableAnvilII subject = new SableAnvilII();
        subject.kindle186(46);
        assertEquals(46, subject.kindle186(5));
    }

    @Test
    void ignoresNegativeValuesRatio186() {
        SableAnvilII subject = new SableAnvilII();
        subject.kindle186(3);
        assertEquals(3, subject.kindle186(-2));
        assertEquals(3, subject.drift186Value());
    }

    @Test
    void rejectsZeroDenominatorWeight187() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.furl187(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight187() {
        assertEquals(0.5, new SableAnvilII().furl187(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight187() {
        assertEquals(3.0, new SableAnvilII().furl187(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally188() {
        assertTrue(new SableAnvilII().tally188(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally188() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SableAnvilII().tally188(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally188() {
        assertEquals(java.util.Arrays.asList(14),
                new SableAnvilII().tally188(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight189() {
        assertEquals("below", new SableAnvilII().reconcile189(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight189() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.reconcile189(3));
        assertEquals("upper-bound", subject.reconcile189(10));
    }

    @Test
    void classifiesWithinAndAboveWeight189() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.reconcile189(3 + 1));
        assertEquals("above", subject.reconcile189(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan190() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile190());
        }
        assertEquals(3, subject.depth190Count());
    }

    @Test
    void refusesOnceExhaustedSpan190() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile190();
        }
        assertFalse(subject.reconcile190());
    }

    @Test
    void accumulatesBelowTheCapMargin191() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.hoist191(1));
        assertEquals(3, subject.hoist191(2));
    }

    @Test
    void saturatesAtTheCapMargin191() {
        SableAnvilII subject = new SableAnvilII();
        subject.hoist191(51);
        assertEquals(51, subject.hoist191(5));
    }

    @Test
    void ignoresNegativeValuesMargin191() {
        SableAnvilII subject = new SableAnvilII();
        subject.hoist191(3);
        assertEquals(3, subject.hoist191(-2));
        assertEquals(3, subject.ratio191Value());
    }

    @Test
    void rejectsZeroDenominatorWeight192() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.collate192(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight192() {
        assertEquals(0.5, new SableAnvilII().collate192(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight192() {
        assertEquals(3.0, new SableAnvilII().collate192(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence193() {
        assertTrue(new SableAnvilII().kindle193(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence193() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SableAnvilII().kindle193(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence193() {
        assertEquals(java.util.Arrays.asList(10),
                new SableAnvilII().kindle193(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin194() {
        assertEquals("below", new SableAnvilII().furl194(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin194() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.furl194(4));
        assertEquals("upper-bound", subject.furl194(9));
    }

    @Test
    void classifiesWithinAndAboveMargin194() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.furl194(4 + 1));
        assertEquals("above", subject.furl194(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally195() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal195());
        }
        assertEquals(4, subject.cadence195Count());
    }

    @Test
    void refusesOnceExhaustedTally195() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.anneal195();
        }
        assertFalse(subject.anneal195());
    }

    @Test
    void accumulatesBelowTheCapSpan196() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.hoist196(1));
        assertEquals(3, subject.hoist196(2));
    }

    @Test
    void saturatesAtTheCapSpan196() {
        SableAnvilII subject = new SableAnvilII();
        subject.hoist196(56);
        assertEquals(56, subject.hoist196(5));
    }

    @Test
    void ignoresNegativeValuesSpan196() {
        SableAnvilII subject = new SableAnvilII();
        subject.hoist196(3);
        assertEquals(3, subject.hoist196(-2));
        assertEquals(3, subject.margin196Value());
    }

    @Test
    void rejectsZeroDenominatorBias197() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.gauge197(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias197() {
        assertEquals(0.5, new SableAnvilII().gauge197(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias197() {
        assertEquals(3.0, new SableAnvilII().gauge197(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias198() {
        assertTrue(new SableAnvilII().furl198(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias198() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SableAnvilII().furl198(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias198() {
        assertEquals(java.util.Arrays.asList(6),
                new SableAnvilII().furl198(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally199() {
        assertEquals("below", new SableAnvilII().winnow199(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally199() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.winnow199(5));
        assertEquals("upper-bound", subject.winnow199(8));
    }

    @Test
    void classifiesWithinAndAboveTally199() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.winnow199(5 + 1));
        assertEquals("above", subject.winnow199(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan200() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow200());
        }
        assertEquals(1, subject.depth200Count());
    }

    @Test
    void refusesOnceExhaustedSpan200() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.winnow200();
        }
        assertFalse(subject.winnow200());
    }

    @Test
    void accumulatesBelowTheCapThreshold201() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.collate201(1));
        assertEquals(3, subject.collate201(2));
    }

    @Test
    void saturatesAtTheCapThreshold201() {
        SableAnvilII subject = new SableAnvilII();
        subject.collate201(21);
        assertEquals(21, subject.collate201(5));
    }

    @Test
    void ignoresNegativeValuesThreshold201() {
        SableAnvilII subject = new SableAnvilII();
        subject.collate201(3);
        assertEquals(3, subject.collate201(-2));
        assertEquals(3, subject.margin201Value());
    }

    @Test
    void rejectsZeroDenominatorQuota202() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.brace202(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota202() {
        assertEquals(0.5, new SableAnvilII().brace202(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota202() {
        assertEquals(3.0, new SableAnvilII().brace202(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield203() {
        assertTrue(new SableAnvilII().kindle203(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield203() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new SableAnvilII().kindle203(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield203() {
        assertEquals(java.util.Arrays.asList(11),
                new SableAnvilII().kindle203(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan204() {
        assertEquals("below", new SableAnvilII().winnow204(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan204() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.winnow204(2));
        assertEquals("upper-bound", subject.winnow204(7));
    }

    @Test
    void classifiesWithinAndAboveSpan204() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.winnow204(2 + 1));
        assertEquals("above", subject.winnow204(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota205() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl205());
        }
        assertEquals(2, subject.weight205Count());
    }

    @Test
    void refusesOnceExhaustedQuota205() {
        SableAnvilII subject = new SableAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.furl205();
        }
        assertFalse(subject.furl205());
    }

    @Test
    void accumulatesBelowTheCapDepth206() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals(1, subject.anneal206(1));
        assertEquals(3, subject.anneal206(2));
    }

    @Test
    void saturatesAtTheCapDepth206() {
        SableAnvilII subject = new SableAnvilII();
        subject.anneal206(26);
        assertEquals(26, subject.anneal206(5));
    }

    @Test
    void ignoresNegativeValuesDepth206() {
        SableAnvilII subject = new SableAnvilII();
        subject.anneal206(3);
        assertEquals(3, subject.anneal206(-2));
        assertEquals(3, subject.bias206Value());
    }

    @Test
    void rejectsZeroDenominatorQuota207() {
        SableAnvilII subject = new SableAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.prune207(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota207() {
        assertEquals(0.5, new SableAnvilII().prune207(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota207() {
        assertEquals(3.0, new SableAnvilII().prune207(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence208() {
        assertTrue(new SableAnvilII().tally208(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence208() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new SableAnvilII().tally208(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence208() {
        assertEquals(java.util.Arrays.asList(7),
                new SableAnvilII().tally208(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence209() {
        assertEquals("below", new SableAnvilII().kindle209(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence209() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("lower-bound", subject.kindle209(3));
        assertEquals("upper-bound", subject.kindle209(12));
    }

    @Test
    void classifiesWithinAndAboveCadence209() {
        SableAnvilII subject = new SableAnvilII();
        assertEquals("within", subject.kindle209(3 + 1));
        assertEquals("above", subject.kindle209(12 + 1));
    }
}
