package com.verdant.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableCairnTest {

    @Test
    void returnsEmptyForNullOffset0() {
        assertTrue(new SableCairn().anneal0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableCairn().anneal0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset0() {
        assertEquals(java.util.Arrays.asList(6),
                new SableCairn().anneal0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan1() {
        assertEquals("below", new SableCairn().furl1(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan1() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.furl1(3));
        assertEquals("upper-bound", subject.furl1(8));
    }

    @Test
    void classifiesWithinAndAboveSpan1() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.furl1(3 + 1));
        assertEquals("above", subject.furl1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota2() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl2());
        }
        assertEquals(3, subject.weight2Count());
    }

    @Test
    void refusesOnceExhaustedQuota2() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            subject.furl2();
        }
        assertFalse(subject.furl2());
    }

    @Test
    void accumulatesBelowTheCapDrift3() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.brace3(1));
        assertEquals(3, subject.brace3(2));
    }

    @Test
    void saturatesAtTheCapDrift3() {
        SableCairn subject = new SableCairn();
        subject.brace3(23);
        assertEquals(23, subject.brace3(5));
    }

    @Test
    void ignoresNegativeValuesDrift3() {
        SableCairn subject = new SableCairn();
        subject.brace3(3);
        assertEquals(3, subject.brace3(-2));
        assertEquals(3, subject.quota3Value());
    }

    @Test
    void rejectsZeroDenominatorMargin4() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.winnow4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin4() {
        assertEquals(0.5, new SableCairn().winnow4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin4() {
        assertEquals(5.0, new SableCairn().winnow4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift5() {
        assertTrue(new SableCairn().brace5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableCairn().brace5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift5() {
        assertEquals(java.util.Arrays.asList(11),
                new SableCairn().brace5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield6() {
        assertEquals("below", new SableCairn().furl6(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield6() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.furl6(4));
        assertEquals("upper-bound", subject.furl6(7));
    }

    @Test
    void classifiesWithinAndAboveYield6() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.furl6(4 + 1));
        assertEquals("above", subject.furl6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias7() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal7());
        }
        assertEquals(4, subject.quota7Count());
    }

    @Test
    void refusesOnceExhaustedBias7() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            subject.anneal7();
        }
        assertFalse(subject.anneal7());
    }

    @Test
    void accumulatesBelowTheCapRatio8() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.gauge8(1));
        assertEquals(3, subject.gauge8(2));
    }

    @Test
    void saturatesAtTheCapRatio8() {
        SableCairn subject = new SableCairn();
        subject.gauge8(28);
        assertEquals(28, subject.gauge8(5));
    }

    @Test
    void ignoresNegativeValuesRatio8() {
        SableCairn subject = new SableCairn();
        subject.gauge8(3);
        assertEquals(3, subject.gauge8(-2));
        assertEquals(3, subject.margin8Value());
    }

    @Test
    void rejectsZeroDenominatorDepth9() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.winnow9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth9() {
        assertEquals(0.5, new SableCairn().winnow9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth9() {
        assertEquals(5.0, new SableCairn().winnow9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield10() {
        assertTrue(new SableCairn().winnow10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableCairn().winnow10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield10() {
        assertEquals(java.util.Arrays.asList(7),
                new SableCairn().winnow10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity11() {
        assertEquals("below", new SableCairn().gauge11(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity11() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.gauge11(5));
        assertEquals("upper-bound", subject.gauge11(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity11() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.gauge11(5 + 1));
        assertEquals("above", subject.gauge11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin12() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal12());
        }
        assertEquals(1, subject.drift12Count());
    }

    @Test
    void refusesOnceExhaustedMargin12() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            subject.anneal12();
        }
        assertFalse(subject.anneal12());
    }

    @Test
    void accumulatesBelowTheCapDrift13() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.kindle13(1));
        assertEquals(3, subject.kindle13(2));
    }

    @Test
    void saturatesAtTheCapDrift13() {
        SableCairn subject = new SableCairn();
        subject.kindle13(33);
        assertEquals(33, subject.kindle13(5));
    }

    @Test
    void ignoresNegativeValuesDrift13() {
        SableCairn subject = new SableCairn();
        subject.kindle13(3);
        assertEquals(3, subject.kindle13(-2));
        assertEquals(3, subject.bias13Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity14() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity14() {
        assertEquals(0.5, new SableCairn().sift14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity14() {
        assertEquals(5.0, new SableCairn().sift14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio15() {
        assertTrue(new SableCairn().flatten15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableCairn().flatten15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio15() {
        assertEquals(java.util.Arrays.asList(12),
                new SableCairn().flatten15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift16() {
        assertEquals("below", new SableCairn().furl16(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift16() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.furl16(2));
        assertEquals("upper-bound", subject.furl16(11));
    }

    @Test
    void classifiesWithinAndAboveDrift16() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.furl16(2 + 1));
        assertEquals("above", subject.furl16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold17() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace17());
        }
        assertEquals(2, subject.weight17Count());
    }

    @Test
    void refusesOnceExhaustedThreshold17() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            subject.brace17();
        }
        assertFalse(subject.brace17());
    }

    @Test
    void accumulatesBelowTheCapOffset18() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.flatten18(1));
        assertEquals(3, subject.flatten18(2));
    }

    @Test
    void saturatesAtTheCapOffset18() {
        SableCairn subject = new SableCairn();
        subject.flatten18(38);
        assertEquals(38, subject.flatten18(5));
    }

    @Test
    void ignoresNegativeValuesOffset18() {
        SableCairn subject = new SableCairn();
        subject.flatten18(3);
        assertEquals(3, subject.flatten18(-2));
        assertEquals(3, subject.weight18Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity19() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.winnow19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity19() {
        assertEquals(0.5, new SableCairn().winnow19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity19() {
        assertEquals(5.0, new SableCairn().winnow19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight20() {
        assertTrue(new SableCairn().sift20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableCairn().sift20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight20() {
        assertEquals(java.util.Arrays.asList(8),
                new SableCairn().sift20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield21() {
        assertEquals("below", new SableCairn().furl21(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield21() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.furl21(3));
        assertEquals("upper-bound", subject.furl21(10));
    }

    @Test
    void classifiesWithinAndAboveYield21() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.furl21(3 + 1));
        assertEquals("above", subject.furl21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift22() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow22());
        }
        assertEquals(3, subject.ratio22Count());
    }

    @Test
    void refusesOnceExhaustedDrift22() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            subject.winnow22();
        }
        assertFalse(subject.winnow22());
    }

    @Test
    void accumulatesBelowTheCapYield23() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.kindle23(1));
        assertEquals(3, subject.kindle23(2));
    }

    @Test
    void saturatesAtTheCapYield23() {
        SableCairn subject = new SableCairn();
        subject.kindle23(43);
        assertEquals(43, subject.kindle23(5));
    }

    @Test
    void ignoresNegativeValuesYield23() {
        SableCairn subject = new SableCairn();
        subject.kindle23(3);
        assertEquals(3, subject.kindle23(-2));
        assertEquals(3, subject.depth23Value());
    }

    @Test
    void rejectsZeroDenominatorYield24() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.flatten24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield24() {
        assertEquals(0.5, new SableCairn().flatten24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield24() {
        assertEquals(5.0, new SableCairn().flatten24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias25() {
        assertTrue(new SableCairn().furl25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableCairn().furl25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias25() {
        assertEquals(java.util.Arrays.asList(13),
                new SableCairn().furl25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield26() {
        assertEquals("below", new SableCairn().hoist26(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield26() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.hoist26(4));
        assertEquals("upper-bound", subject.hoist26(9));
    }

    @Test
    void classifiesWithinAndAboveYield26() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.hoist26(4 + 1));
        assertEquals("above", subject.hoist26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence27() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow27());
        }
        assertEquals(4, subject.weight27Count());
    }

    @Test
    void refusesOnceExhaustedCadence27() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            subject.winnow27();
        }
        assertFalse(subject.winnow27());
    }

    @Test
    void accumulatesBelowTheCapDepth28() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.hoist28(1));
        assertEquals(3, subject.hoist28(2));
    }

    @Test
    void saturatesAtTheCapDepth28() {
        SableCairn subject = new SableCairn();
        subject.hoist28(48);
        assertEquals(48, subject.hoist28(5));
    }

    @Test
    void ignoresNegativeValuesDepth28() {
        SableCairn subject = new SableCairn();
        subject.hoist28(3);
        assertEquals(3, subject.hoist28(-2));
        assertEquals(3, subject.ratio28Value());
    }

    @Test
    void rejectsZeroDenominatorMargin29() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.prune29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin29() {
        assertEquals(0.5, new SableCairn().prune29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin29() {
        assertEquals(5.0, new SableCairn().prune29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan30() {
        assertTrue(new SableCairn().kindle30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SableCairn().kindle30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan30() {
        assertEquals(java.util.Arrays.asList(9),
                new SableCairn().kindle30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity31() {
        assertEquals("below", new SableCairn().collate31(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity31() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.collate31(5));
        assertEquals("upper-bound", subject.collate31(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity31() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.collate31(5 + 1));
        assertEquals("above", subject.collate31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight32() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally32());
        }
        assertEquals(1, subject.threshold32Count());
    }

    @Test
    void refusesOnceExhaustedWeight32() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            subject.tally32();
        }
        assertFalse(subject.tally32());
    }

    @Test
    void accumulatesBelowTheCapBias33() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.sift33(1));
        assertEquals(3, subject.sift33(2));
    }

    @Test
    void saturatesAtTheCapBias33() {
        SableCairn subject = new SableCairn();
        subject.sift33(53);
        assertEquals(53, subject.sift33(5));
    }

    @Test
    void ignoresNegativeValuesBias33() {
        SableCairn subject = new SableCairn();
        subject.sift33(3);
        assertEquals(3, subject.sift33(-2));
        assertEquals(3, subject.quota33Value());
    }

    @Test
    void rejectsZeroDenominatorBias34() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.furl34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias34() {
        assertEquals(0.5, new SableCairn().furl34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias34() {
        assertEquals(5.0, new SableCairn().furl34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan35() {
        assertTrue(new SableCairn().prune35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SableCairn().prune35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan35() {
        assertEquals(java.util.Arrays.asList(14),
                new SableCairn().prune35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield36() {
        assertEquals("below", new SableCairn().winnow36(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield36() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.winnow36(2));
        assertEquals("upper-bound", subject.winnow36(7));
    }

    @Test
    void classifiesWithinAndAboveYield36() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.winnow36(2 + 1));
        assertEquals("above", subject.winnow36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity37() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace37());
        }
        assertEquals(2, subject.offset37Count());
    }

    @Test
    void refusesOnceExhaustedCapacity37() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            subject.brace37();
        }
        assertFalse(subject.brace37());
    }

    @Test
    void accumulatesBelowTheCapWeight38() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.gauge38(1));
        assertEquals(3, subject.gauge38(2));
    }

    @Test
    void saturatesAtTheCapWeight38() {
        SableCairn subject = new SableCairn();
        subject.gauge38(58);
        assertEquals(58, subject.gauge38(5));
    }

    @Test
    void ignoresNegativeValuesWeight38() {
        SableCairn subject = new SableCairn();
        subject.gauge38(3);
        assertEquals(3, subject.gauge38(-2));
        assertEquals(3, subject.cadence38Value());
    }

    @Test
    void rejectsZeroDenominatorQuota39() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota39() {
        assertEquals(0.5, new SableCairn().sift39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota39() {
        assertEquals(5.0, new SableCairn().sift39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift40() {
        assertTrue(new SableCairn().tally40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SableCairn().tally40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift40() {
        assertEquals(java.util.Arrays.asList(10),
                new SableCairn().tally40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth41() {
        assertEquals("below", new SableCairn().reconcile41(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth41() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.reconcile41(3));
        assertEquals("upper-bound", subject.reconcile41(12));
    }

    @Test
    void classifiesWithinAndAboveDepth41() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.reconcile41(3 + 1));
        assertEquals("above", subject.reconcile41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin42() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist42());
        }
        assertEquals(3, subject.cadence42Count());
    }

    @Test
    void refusesOnceExhaustedMargin42() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            subject.hoist42();
        }
        assertFalse(subject.hoist42());
    }

    @Test
    void accumulatesBelowTheCapThreshold43() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.kindle43(1));
        assertEquals(3, subject.kindle43(2));
    }

    @Test
    void saturatesAtTheCapThreshold43() {
        SableCairn subject = new SableCairn();
        subject.kindle43(23);
        assertEquals(23, subject.kindle43(5));
    }

    @Test
    void ignoresNegativeValuesThreshold43() {
        SableCairn subject = new SableCairn();
        subject.kindle43(3);
        assertEquals(3, subject.kindle43(-2));
        assertEquals(3, subject.ratio43Value());
    }

    @Test
    void rejectsZeroDenominatorCadence44() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.flatten44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence44() {
        assertEquals(0.5, new SableCairn().flatten44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence44() {
        assertEquals(5.0, new SableCairn().flatten44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield45() {
        assertTrue(new SableCairn().sift45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableCairn().sift45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield45() {
        assertEquals(java.util.Arrays.asList(6),
                new SableCairn().sift45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity46() {
        assertEquals("below", new SableCairn().collate46(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity46() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.collate46(4));
        assertEquals("upper-bound", subject.collate46(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity46() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.collate46(4 + 1));
        assertEquals("above", subject.collate46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth47() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile47());
        }
        assertEquals(4, subject.yield47Count());
    }

    @Test
    void refusesOnceExhaustedDepth47() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            subject.reconcile47();
        }
        assertFalse(subject.reconcile47());
    }

    @Test
    void accumulatesBelowTheCapRatio48() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.kindle48(1));
        assertEquals(3, subject.kindle48(2));
    }

    @Test
    void saturatesAtTheCapRatio48() {
        SableCairn subject = new SableCairn();
        subject.kindle48(28);
        assertEquals(28, subject.kindle48(5));
    }

    @Test
    void ignoresNegativeValuesRatio48() {
        SableCairn subject = new SableCairn();
        subject.kindle48(3);
        assertEquals(3, subject.kindle48(-2));
        assertEquals(3, subject.depth48Value());
    }

    @Test
    void rejectsZeroDenominatorBias49() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.prune49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias49() {
        assertEquals(0.5, new SableCairn().prune49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias49() {
        assertEquals(5.0, new SableCairn().prune49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth50() {
        assertTrue(new SableCairn().tally50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableCairn().tally50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth50() {
        assertEquals(java.util.Arrays.asList(11),
                new SableCairn().tally50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold51() {
        assertEquals("below", new SableCairn().tally51(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold51() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.tally51(5));
        assertEquals("upper-bound", subject.tally51(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold51() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.tally51(5 + 1));
        assertEquals("above", subject.tally51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence52() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace52());
        }
        assertEquals(1, subject.weight52Count());
    }

    @Test
    void refusesOnceExhaustedCadence52() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            subject.brace52();
        }
        assertFalse(subject.brace52());
    }

    @Test
    void accumulatesBelowTheCapDepth53() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.reconcile53(1));
        assertEquals(3, subject.reconcile53(2));
    }

    @Test
    void saturatesAtTheCapDepth53() {
        SableCairn subject = new SableCairn();
        subject.reconcile53(33);
        assertEquals(33, subject.reconcile53(5));
    }

    @Test
    void ignoresNegativeValuesDepth53() {
        SableCairn subject = new SableCairn();
        subject.reconcile53(3);
        assertEquals(3, subject.reconcile53(-2));
        assertEquals(3, subject.quota53Value());
    }

    @Test
    void rejectsZeroDenominatorBias54() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.gauge54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias54() {
        assertEquals(0.5, new SableCairn().gauge54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias54() {
        assertEquals(5.0, new SableCairn().gauge54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio55() {
        assertTrue(new SableCairn().hoist55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableCairn().hoist55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio55() {
        assertEquals(java.util.Arrays.asList(7),
                new SableCairn().hoist55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin56() {
        assertEquals("below", new SableCairn().tally56(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin56() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.tally56(2));
        assertEquals("upper-bound", subject.tally56(9));
    }

    @Test
    void classifiesWithinAndAboveMargin56() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.tally56(2 + 1));
        assertEquals("above", subject.tally56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias57() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally57());
        }
        assertEquals(2, subject.drift57Count());
    }

    @Test
    void refusesOnceExhaustedBias57() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            subject.tally57();
        }
        assertFalse(subject.tally57());
    }

    @Test
    void accumulatesBelowTheCapCapacity58() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.flatten58(1));
        assertEquals(3, subject.flatten58(2));
    }

    @Test
    void saturatesAtTheCapCapacity58() {
        SableCairn subject = new SableCairn();
        subject.flatten58(38);
        assertEquals(38, subject.flatten58(5));
    }

    @Test
    void ignoresNegativeValuesCapacity58() {
        SableCairn subject = new SableCairn();
        subject.flatten58(3);
        assertEquals(3, subject.flatten58(-2));
        assertEquals(3, subject.yield58Value());
    }

    @Test
    void rejectsZeroDenominatorRatio59() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio59() {
        assertEquals(0.5, new SableCairn().sift59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio59() {
        assertEquals(5.0, new SableCairn().sift59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth60() {
        assertTrue(new SableCairn().brace60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableCairn().brace60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth60() {
        assertEquals(java.util.Arrays.asList(12),
                new SableCairn().brace60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight61() {
        assertEquals("below", new SableCairn().sift61(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight61() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.sift61(3));
        assertEquals("upper-bound", subject.sift61(8));
    }

    @Test
    void classifiesWithinAndAboveWeight61() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.sift61(3 + 1));
        assertEquals("above", subject.sift61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence62() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle62());
        }
        assertEquals(3, subject.quota62Count());
    }

    @Test
    void refusesOnceExhaustedCadence62() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            subject.kindle62();
        }
        assertFalse(subject.kindle62());
    }

    @Test
    void accumulatesBelowTheCapTally63() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.flatten63(1));
        assertEquals(3, subject.flatten63(2));
    }

    @Test
    void saturatesAtTheCapTally63() {
        SableCairn subject = new SableCairn();
        subject.flatten63(43);
        assertEquals(43, subject.flatten63(5));
    }

    @Test
    void ignoresNegativeValuesTally63() {
        SableCairn subject = new SableCairn();
        subject.flatten63(3);
        assertEquals(3, subject.flatten63(-2));
        assertEquals(3, subject.depth63Value());
    }

    @Test
    void rejectsZeroDenominatorRatio64() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.hoist64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio64() {
        assertEquals(0.5, new SableCairn().hoist64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio64() {
        assertEquals(5.0, new SableCairn().hoist64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield65() {
        assertTrue(new SableCairn().tally65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableCairn().tally65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield65() {
        assertEquals(java.util.Arrays.asList(8),
                new SableCairn().tally65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence66() {
        assertEquals("below", new SableCairn().temper66(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence66() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.temper66(4));
        assertEquals("upper-bound", subject.temper66(7));
    }

    @Test
    void classifiesWithinAndAboveCadence66() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.temper66(4 + 1));
        assertEquals("above", subject.temper66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias67() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune67());
        }
        assertEquals(4, subject.ratio67Count());
    }

    @Test
    void refusesOnceExhaustedBias67() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            subject.prune67();
        }
        assertFalse(subject.prune67());
    }

    @Test
    void accumulatesBelowTheCapCapacity68() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.anneal68(1));
        assertEquals(3, subject.anneal68(2));
    }

    @Test
    void saturatesAtTheCapCapacity68() {
        SableCairn subject = new SableCairn();
        subject.anneal68(48);
        assertEquals(48, subject.anneal68(5));
    }

    @Test
    void ignoresNegativeValuesCapacity68() {
        SableCairn subject = new SableCairn();
        subject.anneal68(3);
        assertEquals(3, subject.anneal68(-2));
        assertEquals(3, subject.drift68Value());
    }

    @Test
    void rejectsZeroDenominatorOffset69() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.anneal69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset69() {
        assertEquals(0.5, new SableCairn().anneal69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset69() {
        assertEquals(5.0, new SableCairn().anneal69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan70() {
        assertTrue(new SableCairn().kindle70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableCairn().kindle70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan70() {
        assertEquals(java.util.Arrays.asList(13),
                new SableCairn().kindle70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight71() {
        assertEquals("below", new SableCairn().reconcile71(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight71() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.reconcile71(5));
        assertEquals("upper-bound", subject.reconcile71(12));
    }

    @Test
    void classifiesWithinAndAboveWeight71() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.reconcile71(5 + 1));
        assertEquals("above", subject.reconcile71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield72() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal72());
        }
        assertEquals(1, subject.depth72Count());
    }

    @Test
    void refusesOnceExhaustedYield72() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            subject.anneal72();
        }
        assertFalse(subject.anneal72());
    }

    @Test
    void accumulatesBelowTheCapSpan73() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.anneal73(1));
        assertEquals(3, subject.anneal73(2));
    }

    @Test
    void saturatesAtTheCapSpan73() {
        SableCairn subject = new SableCairn();
        subject.anneal73(53);
        assertEquals(53, subject.anneal73(5));
    }

    @Test
    void ignoresNegativeValuesSpan73() {
        SableCairn subject = new SableCairn();
        subject.anneal73(3);
        assertEquals(3, subject.anneal73(-2));
        assertEquals(3, subject.weight73Value());
    }

    @Test
    void rejectsZeroDenominatorBias74() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias74() {
        assertEquals(0.5, new SableCairn().sift74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias74() {
        assertEquals(5.0, new SableCairn().sift74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold75() {
        assertTrue(new SableCairn().hoist75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SableCairn().hoist75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold75() {
        assertEquals(java.util.Arrays.asList(9),
                new SableCairn().hoist75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio76() {
        assertEquals("below", new SableCairn().hoist76(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio76() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.hoist76(2));
        assertEquals("upper-bound", subject.hoist76(11));
    }

    @Test
    void classifiesWithinAndAboveRatio76() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.hoist76(2 + 1));
        assertEquals("above", subject.hoist76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth77() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace77());
        }
        assertEquals(2, subject.weight77Count());
    }

    @Test
    void refusesOnceExhaustedDepth77() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            subject.brace77();
        }
        assertFalse(subject.brace77());
    }

    @Test
    void accumulatesBelowTheCapThreshold78() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.flatten78(1));
        assertEquals(3, subject.flatten78(2));
    }

    @Test
    void saturatesAtTheCapThreshold78() {
        SableCairn subject = new SableCairn();
        subject.flatten78(58);
        assertEquals(58, subject.flatten78(5));
    }

    @Test
    void ignoresNegativeValuesThreshold78() {
        SableCairn subject = new SableCairn();
        subject.flatten78(3);
        assertEquals(3, subject.flatten78(-2));
        assertEquals(3, subject.capacity78Value());
    }

    @Test
    void rejectsZeroDenominatorRatio79() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.collate79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio79() {
        assertEquals(0.5, new SableCairn().collate79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio79() {
        assertEquals(5.0, new SableCairn().collate79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan80() {
        assertTrue(new SableCairn().furl80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SableCairn().furl80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan80() {
        assertEquals(java.util.Arrays.asList(14),
                new SableCairn().furl80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota81() {
        assertEquals("below", new SableCairn().reconcile81(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota81() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.reconcile81(3));
        assertEquals("upper-bound", subject.reconcile81(10));
    }

    @Test
    void classifiesWithinAndAboveQuota81() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.reconcile81(3 + 1));
        assertEquals("above", subject.reconcile81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight82() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow82());
        }
        assertEquals(3, subject.margin82Count());
    }

    @Test
    void refusesOnceExhaustedWeight82() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            subject.winnow82();
        }
        assertFalse(subject.winnow82());
    }

    @Test
    void accumulatesBelowTheCapTally83() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.furl83(1));
        assertEquals(3, subject.furl83(2));
    }

    @Test
    void saturatesAtTheCapTally83() {
        SableCairn subject = new SableCairn();
        subject.furl83(23);
        assertEquals(23, subject.furl83(5));
    }

    @Test
    void ignoresNegativeValuesTally83() {
        SableCairn subject = new SableCairn();
        subject.furl83(3);
        assertEquals(3, subject.furl83(-2));
        assertEquals(3, subject.threshold83Value());
    }

    @Test
    void rejectsZeroDenominatorRatio84() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.sift84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio84() {
        assertEquals(0.5, new SableCairn().sift84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio84() {
        assertEquals(5.0, new SableCairn().sift84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias85() {
        assertTrue(new SableCairn().prune85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SableCairn().prune85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias85() {
        assertEquals(java.util.Arrays.asList(10),
                new SableCairn().prune85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias86() {
        assertEquals("below", new SableCairn().sift86(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias86() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.sift86(4));
        assertEquals("upper-bound", subject.sift86(9));
    }

    @Test
    void classifiesWithinAndAboveBias86() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.sift86(4 + 1));
        assertEquals("above", subject.sift86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan87() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten87());
        }
        assertEquals(4, subject.yield87Count());
    }

    @Test
    void refusesOnceExhaustedSpan87() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            subject.flatten87();
        }
        assertFalse(subject.flatten87());
    }

    @Test
    void accumulatesBelowTheCapOffset88() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.tally88(1));
        assertEquals(3, subject.tally88(2));
    }

    @Test
    void saturatesAtTheCapOffset88() {
        SableCairn subject = new SableCairn();
        subject.tally88(28);
        assertEquals(28, subject.tally88(5));
    }

    @Test
    void ignoresNegativeValuesOffset88() {
        SableCairn subject = new SableCairn();
        subject.tally88(3);
        assertEquals(3, subject.tally88(-2));
        assertEquals(3, subject.margin88Value());
    }

    @Test
    void rejectsZeroDenominatorSpan89() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.brace89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan89() {
        assertEquals(0.5, new SableCairn().brace89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan89() {
        assertEquals(5.0, new SableCairn().brace89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity90() {
        assertTrue(new SableCairn().sift90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableCairn().sift90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity90() {
        assertEquals(java.util.Arrays.asList(6),
                new SableCairn().sift90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift91() {
        assertEquals("below", new SableCairn().sift91(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift91() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.sift91(5));
        assertEquals("upper-bound", subject.sift91(8));
    }

    @Test
    void classifiesWithinAndAboveDrift91() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.sift91(5 + 1));
        assertEquals("above", subject.sift91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin92() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune92());
        }
        assertEquals(1, subject.offset92Count());
    }

    @Test
    void refusesOnceExhaustedMargin92() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            subject.prune92();
        }
        assertFalse(subject.prune92());
    }

    @Test
    void accumulatesBelowTheCapBias93() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.anneal93(1));
        assertEquals(3, subject.anneal93(2));
    }

    @Test
    void saturatesAtTheCapBias93() {
        SableCairn subject = new SableCairn();
        subject.anneal93(33);
        assertEquals(33, subject.anneal93(5));
    }

    @Test
    void ignoresNegativeValuesBias93() {
        SableCairn subject = new SableCairn();
        subject.anneal93(3);
        assertEquals(3, subject.anneal93(-2));
        assertEquals(3, subject.tally93Value());
    }

    @Test
    void rejectsZeroDenominatorMargin94() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.hoist94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin94() {
        assertEquals(0.5, new SableCairn().hoist94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin94() {
        assertEquals(5.0, new SableCairn().hoist94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight95() {
        assertTrue(new SableCairn().winnow95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableCairn().winnow95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight95() {
        assertEquals(java.util.Arrays.asList(11),
                new SableCairn().winnow95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth96() {
        assertEquals("below", new SableCairn().kindle96(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth96() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.kindle96(2));
        assertEquals("upper-bound", subject.kindle96(7));
    }

    @Test
    void classifiesWithinAndAboveDepth96() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.kindle96(2 + 1));
        assertEquals("above", subject.kindle96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence97() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle97());
        }
        assertEquals(2, subject.margin97Count());
    }

    @Test
    void refusesOnceExhaustedCadence97() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            subject.kindle97();
        }
        assertFalse(subject.kindle97());
    }

    @Test
    void accumulatesBelowTheCapCadence98() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.flatten98(1));
        assertEquals(3, subject.flatten98(2));
    }

    @Test
    void saturatesAtTheCapCadence98() {
        SableCairn subject = new SableCairn();
        subject.flatten98(38);
        assertEquals(38, subject.flatten98(5));
    }

    @Test
    void ignoresNegativeValuesCadence98() {
        SableCairn subject = new SableCairn();
        subject.flatten98(3);
        assertEquals(3, subject.flatten98(-2));
        assertEquals(3, subject.bias98Value());
    }

    @Test
    void rejectsZeroDenominatorQuota99() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.brace99(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota99() {
        assertEquals(0.5, new SableCairn().brace99(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota99() {
        assertEquals(5.0, new SableCairn().brace99(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift100() {
        assertTrue(new SableCairn().flatten100(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift100() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableCairn().flatten100(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift100() {
        assertEquals(java.util.Arrays.asList(7),
                new SableCairn().flatten100(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity101() {
        assertEquals("below", new SableCairn().furl101(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity101() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.furl101(3));
        assertEquals("upper-bound", subject.furl101(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity101() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.furl101(3 + 1));
        assertEquals("above", subject.furl101(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield102() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally102());
        }
        assertEquals(3, subject.offset102Count());
    }

    @Test
    void refusesOnceExhaustedYield102() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            subject.tally102();
        }
        assertFalse(subject.tally102());
    }

    @Test
    void accumulatesBelowTheCapDrift103() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.furl103(1));
        assertEquals(3, subject.furl103(2));
    }

    @Test
    void saturatesAtTheCapDrift103() {
        SableCairn subject = new SableCairn();
        subject.furl103(43);
        assertEquals(43, subject.furl103(5));
    }

    @Test
    void ignoresNegativeValuesDrift103() {
        SableCairn subject = new SableCairn();
        subject.furl103(3);
        assertEquals(3, subject.furl103(-2));
        assertEquals(3, subject.threshold103Value());
    }

    @Test
    void rejectsZeroDenominatorRatio104() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally104(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio104() {
        assertEquals(0.5, new SableCairn().tally104(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio104() {
        assertEquals(5.0, new SableCairn().tally104(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset105() {
        assertTrue(new SableCairn().sift105(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset105() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableCairn().sift105(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset105() {
        assertEquals(java.util.Arrays.asList(12),
                new SableCairn().sift105(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin106() {
        assertEquals("below", new SableCairn().brace106(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin106() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.brace106(4));
        assertEquals("upper-bound", subject.brace106(11));
    }

    @Test
    void classifiesWithinAndAboveMargin106() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.brace106(4 + 1));
        assertEquals("above", subject.brace106(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity107() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge107());
        }
        assertEquals(4, subject.threshold107Count());
    }

    @Test
    void refusesOnceExhaustedCapacity107() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            subject.gauge107();
        }
        assertFalse(subject.gauge107());
    }

    @Test
    void accumulatesBelowTheCapWeight108() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.flatten108(1));
        assertEquals(3, subject.flatten108(2));
    }

    @Test
    void saturatesAtTheCapWeight108() {
        SableCairn subject = new SableCairn();
        subject.flatten108(48);
        assertEquals(48, subject.flatten108(5));
    }

    @Test
    void ignoresNegativeValuesWeight108() {
        SableCairn subject = new SableCairn();
        subject.flatten108(3);
        assertEquals(3, subject.flatten108(-2));
        assertEquals(3, subject.cadence108Value());
    }

    @Test
    void rejectsZeroDenominatorOffset109() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.temper109(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset109() {
        assertEquals(0.5, new SableCairn().temper109(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset109() {
        assertEquals(5.0, new SableCairn().temper109(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth110() {
        assertTrue(new SableCairn().anneal110(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth110() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableCairn().anneal110(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth110() {
        assertEquals(java.util.Arrays.asList(8),
                new SableCairn().anneal110(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias111() {
        assertEquals("below", new SableCairn().reconcile111(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias111() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.reconcile111(5));
        assertEquals("upper-bound", subject.reconcile111(10));
    }

    @Test
    void classifiesWithinAndAboveBias111() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.reconcile111(5 + 1));
        assertEquals("above", subject.reconcile111(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield112() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile112());
        }
        assertEquals(1, subject.threshold112Count());
    }

    @Test
    void refusesOnceExhaustedYield112() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            subject.reconcile112();
        }
        assertFalse(subject.reconcile112());
    }

    @Test
    void accumulatesBelowTheCapQuota113() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.flatten113(1));
        assertEquals(3, subject.flatten113(2));
    }

    @Test
    void saturatesAtTheCapQuota113() {
        SableCairn subject = new SableCairn();
        subject.flatten113(53);
        assertEquals(53, subject.flatten113(5));
    }

    @Test
    void ignoresNegativeValuesQuota113() {
        SableCairn subject = new SableCairn();
        subject.flatten113(3);
        assertEquals(3, subject.flatten113(-2));
        assertEquals(3, subject.capacity113Value());
    }

    @Test
    void rejectsZeroDenominatorCadence114() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.furl114(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence114() {
        assertEquals(0.5, new SableCairn().furl114(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence114() {
        assertEquals(5.0, new SableCairn().furl114(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias115() {
        assertTrue(new SableCairn().prune115(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias115() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableCairn().prune115(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias115() {
        assertEquals(java.util.Arrays.asList(13),
                new SableCairn().prune115(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally116() {
        assertEquals("below", new SableCairn().prune116(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally116() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.prune116(2));
        assertEquals("upper-bound", subject.prune116(9));
    }

    @Test
    void classifiesWithinAndAboveTally116() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.prune116(2 + 1));
        assertEquals("above", subject.prune116(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias117() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge117());
        }
        assertEquals(2, subject.capacity117Count());
    }

    @Test
    void refusesOnceExhaustedBias117() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            subject.gauge117();
        }
        assertFalse(subject.gauge117());
    }

    @Test
    void accumulatesBelowTheCapMargin118() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.tally118(1));
        assertEquals(3, subject.tally118(2));
    }

    @Test
    void saturatesAtTheCapMargin118() {
        SableCairn subject = new SableCairn();
        subject.tally118(58);
        assertEquals(58, subject.tally118(5));
    }

    @Test
    void ignoresNegativeValuesMargin118() {
        SableCairn subject = new SableCairn();
        subject.tally118(3);
        assertEquals(3, subject.tally118(-2));
        assertEquals(3, subject.weight118Value());
    }

    @Test
    void rejectsZeroDenominatorSpan119() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.flatten119(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan119() {
        assertEquals(0.5, new SableCairn().flatten119(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan119() {
        assertEquals(5.0, new SableCairn().flatten119(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally120() {
        assertTrue(new SableCairn().reconcile120(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally120() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SableCairn().reconcile120(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally120() {
        assertEquals(java.util.Arrays.asList(9),
                new SableCairn().reconcile120(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio121() {
        assertEquals("below", new SableCairn().gauge121(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio121() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.gauge121(3));
        assertEquals("upper-bound", subject.gauge121(8));
    }

    @Test
    void classifiesWithinAndAboveRatio121() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.gauge121(3 + 1));
        assertEquals("above", subject.gauge121(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset122() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate122());
        }
        assertEquals(3, subject.drift122Count());
    }

    @Test
    void refusesOnceExhaustedOffset122() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            subject.collate122();
        }
        assertFalse(subject.collate122());
    }

    @Test
    void accumulatesBelowTheCapMargin123() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.reconcile123(1));
        assertEquals(3, subject.reconcile123(2));
    }

    @Test
    void saturatesAtTheCapMargin123() {
        SableCairn subject = new SableCairn();
        subject.reconcile123(23);
        assertEquals(23, subject.reconcile123(5));
    }

    @Test
    void ignoresNegativeValuesMargin123() {
        SableCairn subject = new SableCairn();
        subject.reconcile123(3);
        assertEquals(3, subject.reconcile123(-2));
        assertEquals(3, subject.span123Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity124() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.temper124(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity124() {
        assertEquals(0.5, new SableCairn().temper124(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity124() {
        assertEquals(5.0, new SableCairn().temper124(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift125() {
        assertTrue(new SableCairn().temper125(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift125() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SableCairn().temper125(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift125() {
        assertEquals(java.util.Arrays.asList(14),
                new SableCairn().temper125(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally126() {
        assertEquals("below", new SableCairn().temper126(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally126() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.temper126(4));
        assertEquals("upper-bound", subject.temper126(7));
    }

    @Test
    void classifiesWithinAndAboveTally126() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.temper126(4 + 1));
        assertEquals("above", subject.temper126(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota127() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle127());
        }
        assertEquals(4, subject.drift127Count());
    }

    @Test
    void refusesOnceExhaustedQuota127() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            subject.kindle127();
        }
        assertFalse(subject.kindle127());
    }

    @Test
    void accumulatesBelowTheCapSpan128() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.flatten128(1));
        assertEquals(3, subject.flatten128(2));
    }

    @Test
    void saturatesAtTheCapSpan128() {
        SableCairn subject = new SableCairn();
        subject.flatten128(28);
        assertEquals(28, subject.flatten128(5));
    }

    @Test
    void ignoresNegativeValuesSpan128() {
        SableCairn subject = new SableCairn();
        subject.flatten128(3);
        assertEquals(3, subject.flatten128(-2));
        assertEquals(3, subject.drift128Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold129() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.anneal129(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold129() {
        assertEquals(0.5, new SableCairn().anneal129(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold129() {
        assertEquals(5.0, new SableCairn().anneal129(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan130() {
        assertTrue(new SableCairn().gauge130(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan130() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SableCairn().gauge130(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan130() {
        assertEquals(java.util.Arrays.asList(10),
                new SableCairn().gauge130(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias131() {
        assertEquals("below", new SableCairn().reconcile131(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias131() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.reconcile131(5));
        assertEquals("upper-bound", subject.reconcile131(12));
    }

    @Test
    void classifiesWithinAndAboveBias131() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.reconcile131(5 + 1));
        assertEquals("above", subject.reconcile131(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift132() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge132());
        }
        assertEquals(1, subject.depth132Count());
    }

    @Test
    void refusesOnceExhaustedDrift132() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            subject.gauge132();
        }
        assertFalse(subject.gauge132());
    }

    @Test
    void accumulatesBelowTheCapBias133() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.tally133(1));
        assertEquals(3, subject.tally133(2));
    }

    @Test
    void saturatesAtTheCapBias133() {
        SableCairn subject = new SableCairn();
        subject.tally133(33);
        assertEquals(33, subject.tally133(5));
    }

    @Test
    void ignoresNegativeValuesBias133() {
        SableCairn subject = new SableCairn();
        subject.tally133(3);
        assertEquals(3, subject.tally133(-2));
        assertEquals(3, subject.yield133Value());
    }

    @Test
    void rejectsZeroDenominatorTally134() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.prune134(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally134() {
        assertEquals(0.5, new SableCairn().prune134(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally134() {
        assertEquals(5.0, new SableCairn().prune134(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota135() {
        assertTrue(new SableCairn().kindle135(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota135() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableCairn().kindle135(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota135() {
        assertEquals(java.util.Arrays.asList(6),
                new SableCairn().kindle135(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset136() {
        assertEquals("below", new SableCairn().anneal136(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset136() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.anneal136(2));
        assertEquals("upper-bound", subject.anneal136(11));
    }

    @Test
    void classifiesWithinAndAboveOffset136() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.anneal136(2 + 1));
        assertEquals("above", subject.anneal136(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield137() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle137());
        }
        assertEquals(2, subject.span137Count());
    }

    @Test
    void refusesOnceExhaustedYield137() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            subject.kindle137();
        }
        assertFalse(subject.kindle137());
    }

    @Test
    void accumulatesBelowTheCapCapacity138() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.tally138(1));
        assertEquals(3, subject.tally138(2));
    }

    @Test
    void saturatesAtTheCapCapacity138() {
        SableCairn subject = new SableCairn();
        subject.tally138(38);
        assertEquals(38, subject.tally138(5));
    }

    @Test
    void ignoresNegativeValuesCapacity138() {
        SableCairn subject = new SableCairn();
        subject.tally138(3);
        assertEquals(3, subject.tally138(-2));
        assertEquals(3, subject.quota138Value());
    }

    @Test
    void rejectsZeroDenominatorWeight139() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.flatten139(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight139() {
        assertEquals(0.5, new SableCairn().flatten139(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight139() {
        assertEquals(5.0, new SableCairn().flatten139(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth140() {
        assertTrue(new SableCairn().temper140(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth140() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableCairn().temper140(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth140() {
        assertEquals(java.util.Arrays.asList(11),
                new SableCairn().temper140(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight141() {
        assertEquals("below", new SableCairn().sift141(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight141() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.sift141(3));
        assertEquals("upper-bound", subject.sift141(10));
    }

    @Test
    void classifiesWithinAndAboveWeight141() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.sift141(3 + 1));
        assertEquals("above", subject.sift141(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence142() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow142());
        }
        assertEquals(3, subject.tally142Count());
    }

    @Test
    void refusesOnceExhaustedCadence142() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            subject.winnow142();
        }
        assertFalse(subject.winnow142());
    }

    @Test
    void accumulatesBelowTheCapYield143() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.kindle143(1));
        assertEquals(3, subject.kindle143(2));
    }

    @Test
    void saturatesAtTheCapYield143() {
        SableCairn subject = new SableCairn();
        subject.kindle143(43);
        assertEquals(43, subject.kindle143(5));
    }

    @Test
    void ignoresNegativeValuesYield143() {
        SableCairn subject = new SableCairn();
        subject.kindle143(3);
        assertEquals(3, subject.kindle143(-2));
        assertEquals(3, subject.capacity143Value());
    }

    @Test
    void rejectsZeroDenominatorYield144() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.collate144(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield144() {
        assertEquals(0.5, new SableCairn().collate144(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield144() {
        assertEquals(5.0, new SableCairn().collate144(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota145() {
        assertTrue(new SableCairn().tally145(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota145() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableCairn().tally145(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota145() {
        assertEquals(java.util.Arrays.asList(7),
                new SableCairn().tally145(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally146() {
        assertEquals("below", new SableCairn().tally146(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally146() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.tally146(4));
        assertEquals("upper-bound", subject.tally146(9));
    }

    @Test
    void classifiesWithinAndAboveTally146() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.tally146(4 + 1));
        assertEquals("above", subject.tally146(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence147() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist147());
        }
        assertEquals(4, subject.margin147Count());
    }

    @Test
    void refusesOnceExhaustedCadence147() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            subject.hoist147();
        }
        assertFalse(subject.hoist147());
    }

    @Test
    void accumulatesBelowTheCapQuota148() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.tally148(1));
        assertEquals(3, subject.tally148(2));
    }

    @Test
    void saturatesAtTheCapQuota148() {
        SableCairn subject = new SableCairn();
        subject.tally148(48);
        assertEquals(48, subject.tally148(5));
    }

    @Test
    void ignoresNegativeValuesQuota148() {
        SableCairn subject = new SableCairn();
        subject.tally148(3);
        assertEquals(3, subject.tally148(-2));
        assertEquals(3, subject.capacity148Value());
    }

    @Test
    void rejectsZeroDenominatorSpan149() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.hoist149(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan149() {
        assertEquals(0.5, new SableCairn().hoist149(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan149() {
        assertEquals(5.0, new SableCairn().hoist149(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset150() {
        assertTrue(new SableCairn().gauge150(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset150() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableCairn().gauge150(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset150() {
        assertEquals(java.util.Arrays.asList(12),
                new SableCairn().gauge150(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin151() {
        assertEquals("below", new SableCairn().furl151(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin151() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.furl151(5));
        assertEquals("upper-bound", subject.furl151(8));
    }

    @Test
    void classifiesWithinAndAboveMargin151() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.furl151(5 + 1));
        assertEquals("above", subject.furl151(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth152() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle152());
        }
        assertEquals(1, subject.offset152Count());
    }

    @Test
    void refusesOnceExhaustedDepth152() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            subject.kindle152();
        }
        assertFalse(subject.kindle152());
    }

    @Test
    void accumulatesBelowTheCapWeight153() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.gauge153(1));
        assertEquals(3, subject.gauge153(2));
    }

    @Test
    void saturatesAtTheCapWeight153() {
        SableCairn subject = new SableCairn();
        subject.gauge153(53);
        assertEquals(53, subject.gauge153(5));
    }

    @Test
    void ignoresNegativeValuesWeight153() {
        SableCairn subject = new SableCairn();
        subject.gauge153(3);
        assertEquals(3, subject.gauge153(-2));
        assertEquals(3, subject.threshold153Value());
    }

    @Test
    void rejectsZeroDenominatorYield154() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.tally154(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield154() {
        assertEquals(0.5, new SableCairn().tally154(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield154() {
        assertEquals(5.0, new SableCairn().tally154(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias155() {
        assertTrue(new SableCairn().prune155(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias155() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableCairn().prune155(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias155() {
        assertEquals(java.util.Arrays.asList(8),
                new SableCairn().prune155(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan156() {
        assertEquals("below", new SableCairn().winnow156(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan156() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.winnow156(2));
        assertEquals("upper-bound", subject.winnow156(7));
    }

    @Test
    void classifiesWithinAndAboveSpan156() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.winnow156(2 + 1));
        assertEquals("above", subject.winnow156(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset157() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune157());
        }
        assertEquals(2, subject.cadence157Count());
    }

    @Test
    void refusesOnceExhaustedOffset157() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 2; i++) {
            subject.prune157();
        }
        assertFalse(subject.prune157());
    }

    @Test
    void accumulatesBelowTheCapYield158() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.kindle158(1));
        assertEquals(3, subject.kindle158(2));
    }

    @Test
    void saturatesAtTheCapYield158() {
        SableCairn subject = new SableCairn();
        subject.kindle158(58);
        assertEquals(58, subject.kindle158(5));
    }

    @Test
    void ignoresNegativeValuesYield158() {
        SableCairn subject = new SableCairn();
        subject.kindle158(3);
        assertEquals(3, subject.kindle158(-2));
        assertEquals(3, subject.quota158Value());
    }

    @Test
    void rejectsZeroDenominatorSpan159() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.hoist159(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan159() {
        assertEquals(0.5, new SableCairn().hoist159(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan159() {
        assertEquals(5.0, new SableCairn().hoist159(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin160() {
        assertTrue(new SableCairn().tally160(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin160() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableCairn().tally160(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin160() {
        assertEquals(java.util.Arrays.asList(13),
                new SableCairn().tally160(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold161() {
        assertEquals("below", new SableCairn().flatten161(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold161() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.flatten161(3));
        assertEquals("upper-bound", subject.flatten161(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold161() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.flatten161(3 + 1));
        assertEquals("above", subject.flatten161(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally162() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift162());
        }
        assertEquals(3, subject.ratio162Count());
    }

    @Test
    void refusesOnceExhaustedTally162() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 3; i++) {
            subject.sift162();
        }
        assertFalse(subject.sift162());
    }

    @Test
    void accumulatesBelowTheCapDepth163() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.temper163(1));
        assertEquals(3, subject.temper163(2));
    }

    @Test
    void saturatesAtTheCapDepth163() {
        SableCairn subject = new SableCairn();
        subject.temper163(23);
        assertEquals(23, subject.temper163(5));
    }

    @Test
    void ignoresNegativeValuesDepth163() {
        SableCairn subject = new SableCairn();
        subject.temper163(3);
        assertEquals(3, subject.temper163(-2));
        assertEquals(3, subject.yield163Value());
    }

    @Test
    void rejectsZeroDenominatorWeight164() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.reconcile164(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight164() {
        assertEquals(0.5, new SableCairn().reconcile164(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight164() {
        assertEquals(5.0, new SableCairn().reconcile164(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin165() {
        assertTrue(new SableCairn().hoist165(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin165() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SableCairn().hoist165(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin165() {
        assertEquals(java.util.Arrays.asList(9),
                new SableCairn().hoist165(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift166() {
        assertEquals("below", new SableCairn().gauge166(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift166() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.gauge166(4));
        assertEquals("upper-bound", subject.gauge166(11));
    }

    @Test
    void classifiesWithinAndAboveDrift166() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.gauge166(4 + 1));
        assertEquals("above", subject.gauge166(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield167() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally167());
        }
        assertEquals(4, subject.drift167Count());
    }

    @Test
    void refusesOnceExhaustedYield167() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 4; i++) {
            subject.tally167();
        }
        assertFalse(subject.tally167());
    }

    @Test
    void accumulatesBelowTheCapThreshold168() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.flatten168(1));
        assertEquals(3, subject.flatten168(2));
    }

    @Test
    void saturatesAtTheCapThreshold168() {
        SableCairn subject = new SableCairn();
        subject.flatten168(28);
        assertEquals(28, subject.flatten168(5));
    }

    @Test
    void ignoresNegativeValuesThreshold168() {
        SableCairn subject = new SableCairn();
        subject.flatten168(3);
        assertEquals(3, subject.flatten168(-2));
        assertEquals(3, subject.quota168Value());
    }

    @Test
    void rejectsZeroDenominatorWeight169() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.prune169(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight169() {
        assertEquals(0.5, new SableCairn().prune169(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight169() {
        assertEquals(5.0, new SableCairn().prune169(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota170() {
        assertTrue(new SableCairn().sift170(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota170() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SableCairn().sift170(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota170() {
        assertEquals(java.util.Arrays.asList(14),
                new SableCairn().sift170(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio171() {
        assertEquals("below", new SableCairn().anneal171(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio171() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.anneal171(5));
        assertEquals("upper-bound", subject.anneal171(10));
    }

    @Test
    void classifiesWithinAndAboveRatio171() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.anneal171(5 + 1));
        assertEquals("above", subject.anneal171(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence172() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist172());
        }
        assertEquals(1, subject.offset172Count());
    }

    @Test
    void refusesOnceExhaustedCadence172() {
        SableCairn subject = new SableCairn();
        for (int i = 0; i < 1; i++) {
            subject.hoist172();
        }
        assertFalse(subject.hoist172());
    }

    @Test
    void accumulatesBelowTheCapCadence173() {
        SableCairn subject = new SableCairn();
        assertEquals(1, subject.temper173(1));
        assertEquals(3, subject.temper173(2));
    }

    @Test
    void saturatesAtTheCapCadence173() {
        SableCairn subject = new SableCairn();
        subject.temper173(33);
        assertEquals(33, subject.temper173(5));
    }

    @Test
    void ignoresNegativeValuesCadence173() {
        SableCairn subject = new SableCairn();
        subject.temper173(3);
        assertEquals(3, subject.temper173(-2));
        assertEquals(3, subject.threshold173Value());
    }

    @Test
    void rejectsZeroDenominatorWeight174() {
        SableCairn subject = new SableCairn();
        assertThrows(ArithmeticException.class, () -> subject.winnow174(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight174() {
        assertEquals(0.5, new SableCairn().winnow174(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight174() {
        assertEquals(5.0, new SableCairn().winnow174(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota175() {
        assertTrue(new SableCairn().hoist175(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota175() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SableCairn().hoist175(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota175() {
        assertEquals(java.util.Arrays.asList(10),
                new SableCairn().hoist175(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold176() {
        assertEquals("below", new SableCairn().prune176(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold176() {
        SableCairn subject = new SableCairn();
        assertEquals("lower-bound", subject.prune176(2));
        assertEquals("upper-bound", subject.prune176(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold176() {
        SableCairn subject = new SableCairn();
        assertEquals("within", subject.prune176(2 + 1));
        assertEquals("above", subject.prune176(9 + 1));
    }
}
