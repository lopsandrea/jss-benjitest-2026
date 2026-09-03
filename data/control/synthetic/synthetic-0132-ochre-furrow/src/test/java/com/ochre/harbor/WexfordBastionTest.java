package com.ochre.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordBastionTest {

    @Test
    void returnsEmptyForNullTally0() {
        assertTrue(new WexfordBastion().tally0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordBastion().tally0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally0() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordBastion().tally0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold1() {
        assertEquals("below", new WexfordBastion().flatten1(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold1() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.flatten1(3));
        assertEquals("upper-bound", subject.flatten1(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold1() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.flatten1(3 + 1));
        assertEquals("above", subject.flatten1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio2() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift2());
        }
        assertEquals(3, subject.margin2Count());
    }

    @Test
    void refusesOnceExhaustedRatio2() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 3; i++) {
            subject.sift2();
        }
        assertFalse(subject.sift2());
    }

    @Test
    void accumulatesBelowTheCapYield3() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.brace3(1));
        assertEquals(3, subject.brace3(2));
    }

    @Test
    void saturatesAtTheCapYield3() {
        WexfordBastion subject = new WexfordBastion();
        subject.brace3(23);
        assertEquals(23, subject.brace3(5));
    }

    @Test
    void ignoresNegativeValuesYield3() {
        WexfordBastion subject = new WexfordBastion();
        subject.brace3(3);
        assertEquals(3, subject.brace3(-2));
        assertEquals(3, subject.span3Value());
    }

    @Test
    void rejectsZeroDenominatorDepth4() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.flatten4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth4() {
        assertEquals(0.5, new WexfordBastion().flatten4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth4() {
        assertEquals(5.0, new WexfordBastion().flatten4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias5() {
        assertTrue(new WexfordBastion().sift5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordBastion().sift5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias5() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordBastion().sift5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift6() {
        assertEquals("below", new WexfordBastion().kindle6(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift6() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.kindle6(4));
        assertEquals("upper-bound", subject.kindle6(7));
    }

    @Test
    void classifiesWithinAndAboveDrift6() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.kindle6(4 + 1));
        assertEquals("above", subject.kindle6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift7() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge7());
        }
        assertEquals(4, subject.offset7Count());
    }

    @Test
    void refusesOnceExhaustedDrift7() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 4; i++) {
            subject.gauge7();
        }
        assertFalse(subject.gauge7());
    }

    @Test
    void accumulatesBelowTheCapOffset8() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.hoist8(1));
        assertEquals(3, subject.hoist8(2));
    }

    @Test
    void saturatesAtTheCapOffset8() {
        WexfordBastion subject = new WexfordBastion();
        subject.hoist8(28);
        assertEquals(28, subject.hoist8(5));
    }

    @Test
    void ignoresNegativeValuesOffset8() {
        WexfordBastion subject = new WexfordBastion();
        subject.hoist8(3);
        assertEquals(3, subject.hoist8(-2));
        assertEquals(3, subject.drift8Value());
    }

    @Test
    void rejectsZeroDenominatorTally9() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.furl9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally9() {
        assertEquals(0.5, new WexfordBastion().furl9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally9() {
        assertEquals(5.0, new WexfordBastion().furl9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset10() {
        assertTrue(new WexfordBastion().anneal10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordBastion().anneal10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset10() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordBastion().anneal10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally11() {
        assertEquals("below", new WexfordBastion().flatten11(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally11() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.flatten11(5));
        assertEquals("upper-bound", subject.flatten11(12));
    }

    @Test
    void classifiesWithinAndAboveTally11() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.flatten11(5 + 1));
        assertEquals("above", subject.flatten11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence12() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile12());
        }
        assertEquals(1, subject.bias12Count());
    }

    @Test
    void refusesOnceExhaustedCadence12() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 1; i++) {
            subject.reconcile12();
        }
        assertFalse(subject.reconcile12());
    }

    @Test
    void accumulatesBelowTheCapDepth13() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.winnow13(1));
        assertEquals(3, subject.winnow13(2));
    }

    @Test
    void saturatesAtTheCapDepth13() {
        WexfordBastion subject = new WexfordBastion();
        subject.winnow13(33);
        assertEquals(33, subject.winnow13(5));
    }

    @Test
    void ignoresNegativeValuesDepth13() {
        WexfordBastion subject = new WexfordBastion();
        subject.winnow13(3);
        assertEquals(3, subject.winnow13(-2));
        assertEquals(3, subject.margin13Value());
    }

    @Test
    void rejectsZeroDenominatorOffset14() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.brace14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset14() {
        assertEquals(0.5, new WexfordBastion().brace14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset14() {
        assertEquals(5.0, new WexfordBastion().brace14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth15() {
        assertTrue(new WexfordBastion().flatten15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordBastion().flatten15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth15() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordBastion().flatten15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias16() {
        assertEquals("below", new WexfordBastion().sift16(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias16() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.sift16(2));
        assertEquals("upper-bound", subject.sift16(11));
    }

    @Test
    void classifiesWithinAndAboveBias16() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.sift16(2 + 1));
        assertEquals("above", subject.sift16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield17() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle17());
        }
        assertEquals(2, subject.cadence17Count());
    }

    @Test
    void refusesOnceExhaustedYield17() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 2; i++) {
            subject.kindle17();
        }
        assertFalse(subject.kindle17());
    }

    @Test
    void accumulatesBelowTheCapCapacity18() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.prune18(1));
        assertEquals(3, subject.prune18(2));
    }

    @Test
    void saturatesAtTheCapCapacity18() {
        WexfordBastion subject = new WexfordBastion();
        subject.prune18(38);
        assertEquals(38, subject.prune18(5));
    }

    @Test
    void ignoresNegativeValuesCapacity18() {
        WexfordBastion subject = new WexfordBastion();
        subject.prune18(3);
        assertEquals(3, subject.prune18(-2));
        assertEquals(3, subject.ratio18Value());
    }

    @Test
    void rejectsZeroDenominatorCadence19() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.anneal19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence19() {
        assertEquals(0.5, new WexfordBastion().anneal19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence19() {
        assertEquals(5.0, new WexfordBastion().anneal19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity20() {
        assertTrue(new WexfordBastion().prune20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordBastion().prune20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity20() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordBastion().prune20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally21() {
        assertEquals("below", new WexfordBastion().hoist21(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally21() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.hoist21(3));
        assertEquals("upper-bound", subject.hoist21(10));
    }

    @Test
    void classifiesWithinAndAboveTally21() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.hoist21(3 + 1));
        assertEquals("above", subject.hoist21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield22() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally22());
        }
        assertEquals(3, subject.drift22Count());
    }

    @Test
    void refusesOnceExhaustedYield22() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 3; i++) {
            subject.tally22();
        }
        assertFalse(subject.tally22());
    }

    @Test
    void accumulatesBelowTheCapYield23() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.brace23(1));
        assertEquals(3, subject.brace23(2));
    }

    @Test
    void saturatesAtTheCapYield23() {
        WexfordBastion subject = new WexfordBastion();
        subject.brace23(43);
        assertEquals(43, subject.brace23(5));
    }

    @Test
    void ignoresNegativeValuesYield23() {
        WexfordBastion subject = new WexfordBastion();
        subject.brace23(3);
        assertEquals(3, subject.brace23(-2));
        assertEquals(3, subject.depth23Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold24() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.sift24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold24() {
        assertEquals(0.5, new WexfordBastion().sift24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold24() {
        assertEquals(5.0, new WexfordBastion().sift24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift25() {
        assertTrue(new WexfordBastion().tally25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordBastion().tally25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift25() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordBastion().tally25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield26() {
        assertEquals("below", new WexfordBastion().hoist26(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield26() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.hoist26(4));
        assertEquals("upper-bound", subject.hoist26(9));
    }

    @Test
    void classifiesWithinAndAboveYield26() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.hoist26(4 + 1));
        assertEquals("above", subject.hoist26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth27() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge27());
        }
        assertEquals(4, subject.capacity27Count());
    }

    @Test
    void refusesOnceExhaustedDepth27() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 4; i++) {
            subject.gauge27();
        }
        assertFalse(subject.gauge27());
    }

    @Test
    void accumulatesBelowTheCapSpan28() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.sift28(1));
        assertEquals(3, subject.sift28(2));
    }

    @Test
    void saturatesAtTheCapSpan28() {
        WexfordBastion subject = new WexfordBastion();
        subject.sift28(48);
        assertEquals(48, subject.sift28(5));
    }

    @Test
    void ignoresNegativeValuesSpan28() {
        WexfordBastion subject = new WexfordBastion();
        subject.sift28(3);
        assertEquals(3, subject.sift28(-2));
        assertEquals(3, subject.offset28Value());
    }

    @Test
    void rejectsZeroDenominatorSpan29() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.reconcile29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan29() {
        assertEquals(0.5, new WexfordBastion().reconcile29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan29() {
        assertEquals(5.0, new WexfordBastion().reconcile29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth30() {
        assertTrue(new WexfordBastion().furl30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordBastion().furl30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth30() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordBastion().furl30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio31() {
        assertEquals("below", new WexfordBastion().sift31(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio31() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.sift31(5));
        assertEquals("upper-bound", subject.sift31(8));
    }

    @Test
    void classifiesWithinAndAboveRatio31() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.sift31(5 + 1));
        assertEquals("above", subject.sift31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold32() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift32());
        }
        assertEquals(1, subject.span32Count());
    }

    @Test
    void refusesOnceExhaustedThreshold32() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 1; i++) {
            subject.sift32();
        }
        assertFalse(subject.sift32());
    }

    @Test
    void accumulatesBelowTheCapRatio33() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.gauge33(1));
        assertEquals(3, subject.gauge33(2));
    }

    @Test
    void saturatesAtTheCapRatio33() {
        WexfordBastion subject = new WexfordBastion();
        subject.gauge33(53);
        assertEquals(53, subject.gauge33(5));
    }

    @Test
    void ignoresNegativeValuesRatio33() {
        WexfordBastion subject = new WexfordBastion();
        subject.gauge33(3);
        assertEquals(3, subject.gauge33(-2));
        assertEquals(3, subject.tally33Value());
    }

    @Test
    void rejectsZeroDenominatorBias34() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.collate34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias34() {
        assertEquals(0.5, new WexfordBastion().collate34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias34() {
        assertEquals(5.0, new WexfordBastion().collate34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio35() {
        assertTrue(new WexfordBastion().kindle35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordBastion().kindle35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio35() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordBastion().kindle35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset36() {
        assertEquals("below", new WexfordBastion().reconcile36(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset36() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.reconcile36(2));
        assertEquals("upper-bound", subject.reconcile36(7));
    }

    @Test
    void classifiesWithinAndAboveOffset36() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.reconcile36(2 + 1));
        assertEquals("above", subject.reconcile36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity37() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper37());
        }
        assertEquals(2, subject.yield37Count());
    }

    @Test
    void refusesOnceExhaustedCapacity37() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 2; i++) {
            subject.temper37();
        }
        assertFalse(subject.temper37());
    }

    @Test
    void accumulatesBelowTheCapMargin38() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.sift38(1));
        assertEquals(3, subject.sift38(2));
    }

    @Test
    void saturatesAtTheCapMargin38() {
        WexfordBastion subject = new WexfordBastion();
        subject.sift38(58);
        assertEquals(58, subject.sift38(5));
    }

    @Test
    void ignoresNegativeValuesMargin38() {
        WexfordBastion subject = new WexfordBastion();
        subject.sift38(3);
        assertEquals(3, subject.sift38(-2));
        assertEquals(3, subject.drift38Value());
    }

    @Test
    void rejectsZeroDenominatorDepth39() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.tally39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth39() {
        assertEquals(0.5, new WexfordBastion().tally39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth39() {
        assertEquals(5.0, new WexfordBastion().tally39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio40() {
        assertTrue(new WexfordBastion().tally40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordBastion().tally40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio40() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordBastion().tally40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin41() {
        assertEquals("below", new WexfordBastion().collate41(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin41() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.collate41(3));
        assertEquals("upper-bound", subject.collate41(12));
    }

    @Test
    void classifiesWithinAndAboveMargin41() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.collate41(3 + 1));
        assertEquals("above", subject.collate41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity42() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile42());
        }
        assertEquals(3, subject.ratio42Count());
    }

    @Test
    void refusesOnceExhaustedCapacity42() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 3; i++) {
            subject.reconcile42();
        }
        assertFalse(subject.reconcile42());
    }

    @Test
    void accumulatesBelowTheCapWeight43() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.temper43(1));
        assertEquals(3, subject.temper43(2));
    }

    @Test
    void saturatesAtTheCapWeight43() {
        WexfordBastion subject = new WexfordBastion();
        subject.temper43(23);
        assertEquals(23, subject.temper43(5));
    }

    @Test
    void ignoresNegativeValuesWeight43() {
        WexfordBastion subject = new WexfordBastion();
        subject.temper43(3);
        assertEquals(3, subject.temper43(-2));
        assertEquals(3, subject.depth43Value());
    }

    @Test
    void rejectsZeroDenominatorBias44() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.anneal44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias44() {
        assertEquals(0.5, new WexfordBastion().anneal44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias44() {
        assertEquals(5.0, new WexfordBastion().anneal44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight45() {
        assertTrue(new WexfordBastion().brace45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordBastion().brace45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight45() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordBastion().brace45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota46() {
        assertEquals("below", new WexfordBastion().reconcile46(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota46() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.reconcile46(4));
        assertEquals("upper-bound", subject.reconcile46(11));
    }

    @Test
    void classifiesWithinAndAboveQuota46() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.reconcile46(4 + 1));
        assertEquals("above", subject.reconcile46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota47() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl47());
        }
        assertEquals(4, subject.drift47Count());
    }

    @Test
    void refusesOnceExhaustedQuota47() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 4; i++) {
            subject.furl47();
        }
        assertFalse(subject.furl47());
    }

    @Test
    void accumulatesBelowTheCapCadence48() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.flatten48(1));
        assertEquals(3, subject.flatten48(2));
    }

    @Test
    void saturatesAtTheCapCadence48() {
        WexfordBastion subject = new WexfordBastion();
        subject.flatten48(28);
        assertEquals(28, subject.flatten48(5));
    }

    @Test
    void ignoresNegativeValuesCadence48() {
        WexfordBastion subject = new WexfordBastion();
        subject.flatten48(3);
        assertEquals(3, subject.flatten48(-2));
        assertEquals(3, subject.threshold48Value());
    }

    @Test
    void rejectsZeroDenominatorRatio49() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.reconcile49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio49() {
        assertEquals(0.5, new WexfordBastion().reconcile49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio49() {
        assertEquals(5.0, new WexfordBastion().reconcile49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin50() {
        assertTrue(new WexfordBastion().hoist50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordBastion().hoist50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin50() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordBastion().hoist50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin51() {
        assertEquals("below", new WexfordBastion().sift51(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin51() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.sift51(5));
        assertEquals("upper-bound", subject.sift51(10));
    }

    @Test
    void classifiesWithinAndAboveMargin51() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.sift51(5 + 1));
        assertEquals("above", subject.sift51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin52() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally52());
        }
        assertEquals(1, subject.cadence52Count());
    }

    @Test
    void refusesOnceExhaustedMargin52() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 1; i++) {
            subject.tally52();
        }
        assertFalse(subject.tally52());
    }

    @Test
    void accumulatesBelowTheCapTally53() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.furl53(1));
        assertEquals(3, subject.furl53(2));
    }

    @Test
    void saturatesAtTheCapTally53() {
        WexfordBastion subject = new WexfordBastion();
        subject.furl53(33);
        assertEquals(33, subject.furl53(5));
    }

    @Test
    void ignoresNegativeValuesTally53() {
        WexfordBastion subject = new WexfordBastion();
        subject.furl53(3);
        assertEquals(3, subject.furl53(-2));
        assertEquals(3, subject.weight53Value());
    }

    @Test
    void rejectsZeroDenominatorBias54() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.prune54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias54() {
        assertEquals(0.5, new WexfordBastion().prune54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias54() {
        assertEquals(5.0, new WexfordBastion().prune54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota55() {
        assertTrue(new WexfordBastion().sift55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordBastion().sift55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota55() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordBastion().sift55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota56() {
        assertEquals("below", new WexfordBastion().temper56(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota56() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.temper56(2));
        assertEquals("upper-bound", subject.temper56(9));
    }

    @Test
    void classifiesWithinAndAboveQuota56() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.temper56(2 + 1));
        assertEquals("above", subject.temper56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan57() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally57());
        }
        assertEquals(2, subject.quota57Count());
    }

    @Test
    void refusesOnceExhaustedSpan57() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 2; i++) {
            subject.tally57();
        }
        assertFalse(subject.tally57());
    }

    @Test
    void accumulatesBelowTheCapCadence58() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.hoist58(1));
        assertEquals(3, subject.hoist58(2));
    }

    @Test
    void saturatesAtTheCapCadence58() {
        WexfordBastion subject = new WexfordBastion();
        subject.hoist58(38);
        assertEquals(38, subject.hoist58(5));
    }

    @Test
    void ignoresNegativeValuesCadence58() {
        WexfordBastion subject = new WexfordBastion();
        subject.hoist58(3);
        assertEquals(3, subject.hoist58(-2));
        assertEquals(3, subject.ratio58Value());
    }

    @Test
    void rejectsZeroDenominatorTally59() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.furl59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally59() {
        assertEquals(0.5, new WexfordBastion().furl59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally59() {
        assertEquals(5.0, new WexfordBastion().furl59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence60() {
        assertTrue(new WexfordBastion().sift60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordBastion().sift60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence60() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordBastion().sift60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio61() {
        assertEquals("below", new WexfordBastion().hoist61(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio61() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.hoist61(3));
        assertEquals("upper-bound", subject.hoist61(8));
    }

    @Test
    void classifiesWithinAndAboveRatio61() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.hoist61(3 + 1));
        assertEquals("above", subject.hoist61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity62() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace62());
        }
        assertEquals(3, subject.bias62Count());
    }

    @Test
    void refusesOnceExhaustedCapacity62() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 3; i++) {
            subject.brace62();
        }
        assertFalse(subject.brace62());
    }

    @Test
    void accumulatesBelowTheCapSpan63() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.sift63(1));
        assertEquals(3, subject.sift63(2));
    }

    @Test
    void saturatesAtTheCapSpan63() {
        WexfordBastion subject = new WexfordBastion();
        subject.sift63(43);
        assertEquals(43, subject.sift63(5));
    }

    @Test
    void ignoresNegativeValuesSpan63() {
        WexfordBastion subject = new WexfordBastion();
        subject.sift63(3);
        assertEquals(3, subject.sift63(-2));
        assertEquals(3, subject.weight63Value());
    }

    @Test
    void rejectsZeroDenominatorSpan64() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.anneal64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan64() {
        assertEquals(0.5, new WexfordBastion().anneal64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan64() {
        assertEquals(5.0, new WexfordBastion().anneal64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield65() {
        assertTrue(new WexfordBastion().sift65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordBastion().sift65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield65() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordBastion().sift65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth66() {
        assertEquals("below", new WexfordBastion().kindle66(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth66() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.kindle66(4));
        assertEquals("upper-bound", subject.kindle66(7));
    }

    @Test
    void classifiesWithinAndAboveDepth66() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.kindle66(4 + 1));
        assertEquals("above", subject.kindle66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset67() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper67());
        }
        assertEquals(4, subject.tally67Count());
    }

    @Test
    void refusesOnceExhaustedOffset67() {
        WexfordBastion subject = new WexfordBastion();
        for (int i = 0; i < 4; i++) {
            subject.temper67();
        }
        assertFalse(subject.temper67());
    }

    @Test
    void accumulatesBelowTheCapMargin68() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals(1, subject.collate68(1));
        assertEquals(3, subject.collate68(2));
    }

    @Test
    void saturatesAtTheCapMargin68() {
        WexfordBastion subject = new WexfordBastion();
        subject.collate68(48);
        assertEquals(48, subject.collate68(5));
    }

    @Test
    void ignoresNegativeValuesMargin68() {
        WexfordBastion subject = new WexfordBastion();
        subject.collate68(3);
        assertEquals(3, subject.collate68(-2));
        assertEquals(3, subject.depth68Value());
    }

    @Test
    void rejectsZeroDenominatorOffset69() {
        WexfordBastion subject = new WexfordBastion();
        assertThrows(ArithmeticException.class, () -> subject.brace69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset69() {
        assertEquals(0.5, new WexfordBastion().brace69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset69() {
        assertEquals(5.0, new WexfordBastion().brace69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth70() {
        assertTrue(new WexfordBastion().sift70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordBastion().sift70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth70() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordBastion().sift70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity71() {
        assertEquals("below", new WexfordBastion().tally71(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity71() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("lower-bound", subject.tally71(5));
        assertEquals("upper-bound", subject.tally71(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity71() {
        WexfordBastion subject = new WexfordBastion();
        assertEquals("within", subject.tally71(5 + 1));
        assertEquals("above", subject.tally71(12 + 1));
    }
}
