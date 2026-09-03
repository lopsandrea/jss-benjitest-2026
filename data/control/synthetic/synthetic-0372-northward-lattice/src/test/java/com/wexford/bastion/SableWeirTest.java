package com.wexford.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableWeirTest {

    @Test
    void returnsEmptyForNullQuota0() {
        assertTrue(new SableWeir().sift0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableWeir().sift0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota0() {
        assertEquals(java.util.Arrays.asList(6),
                new SableWeir().sift0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias1() {
        assertEquals("below", new SableWeir().flatten1(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias1() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.flatten1(3));
        assertEquals("upper-bound", subject.flatten1(8));
    }

    @Test
    void classifiesWithinAndAboveBias1() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.flatten1(3 + 1));
        assertEquals("above", subject.flatten1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence2() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal2());
        }
        assertEquals(3, subject.capacity2Count());
    }

    @Test
    void refusesOnceExhaustedCadence2() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            subject.anneal2();
        }
        assertFalse(subject.anneal2());
    }

    @Test
    void accumulatesBelowTheCapBias3() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.sift3(1));
        assertEquals(3, subject.sift3(2));
    }

    @Test
    void saturatesAtTheCapBias3() {
        SableWeir subject = new SableWeir();
        subject.sift3(23);
        assertEquals(23, subject.sift3(5));
    }

    @Test
    void ignoresNegativeValuesBias3() {
        SableWeir subject = new SableWeir();
        subject.sift3(3);
        assertEquals(3, subject.sift3(-2));
        assertEquals(3, subject.drift3Value());
    }

    @Test
    void rejectsZeroDenominatorCadence4() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.hoist4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence4() {
        assertEquals(0.5, new SableWeir().hoist4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence4() {
        assertEquals(5.0, new SableWeir().hoist4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence5() {
        assertTrue(new SableWeir().winnow5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableWeir().winnow5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence5() {
        assertEquals(java.util.Arrays.asList(11),
                new SableWeir().winnow5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth6() {
        assertEquals("below", new SableWeir().furl6(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth6() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.furl6(4));
        assertEquals("upper-bound", subject.furl6(7));
    }

    @Test
    void classifiesWithinAndAboveDepth6() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.furl6(4 + 1));
        assertEquals("above", subject.furl6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity7() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile7());
        }
        assertEquals(4, subject.yield7Count());
    }

    @Test
    void refusesOnceExhaustedCapacity7() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            subject.reconcile7();
        }
        assertFalse(subject.reconcile7());
    }

    @Test
    void accumulatesBelowTheCapTally8() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.hoist8(1));
        assertEquals(3, subject.hoist8(2));
    }

    @Test
    void saturatesAtTheCapTally8() {
        SableWeir subject = new SableWeir();
        subject.hoist8(28);
        assertEquals(28, subject.hoist8(5));
    }

    @Test
    void ignoresNegativeValuesTally8() {
        SableWeir subject = new SableWeir();
        subject.hoist8(3);
        assertEquals(3, subject.hoist8(-2));
        assertEquals(3, subject.depth8Value());
    }

    @Test
    void rejectsZeroDenominatorWeight9() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.flatten9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight9() {
        assertEquals(0.5, new SableWeir().flatten9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight9() {
        assertEquals(5.0, new SableWeir().flatten9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity10() {
        assertTrue(new SableWeir().hoist10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableWeir().hoist10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity10() {
        assertEquals(java.util.Arrays.asList(7),
                new SableWeir().hoist10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota11() {
        assertEquals("below", new SableWeir().temper11(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota11() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.temper11(5));
        assertEquals("upper-bound", subject.temper11(12));
    }

    @Test
    void classifiesWithinAndAboveQuota11() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.temper11(5 + 1));
        assertEquals("above", subject.temper11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio12() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist12());
        }
        assertEquals(1, subject.quota12Count());
    }

    @Test
    void refusesOnceExhaustedRatio12() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            subject.hoist12();
        }
        assertFalse(subject.hoist12());
    }

    @Test
    void accumulatesBelowTheCapSpan13() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.reconcile13(1));
        assertEquals(3, subject.reconcile13(2));
    }

    @Test
    void saturatesAtTheCapSpan13() {
        SableWeir subject = new SableWeir();
        subject.reconcile13(33);
        assertEquals(33, subject.reconcile13(5));
    }

    @Test
    void ignoresNegativeValuesSpan13() {
        SableWeir subject = new SableWeir();
        subject.reconcile13(3);
        assertEquals(3, subject.reconcile13(-2));
        assertEquals(3, subject.tally13Value());
    }

    @Test
    void rejectsZeroDenominatorQuota14() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.prune14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota14() {
        assertEquals(0.5, new SableWeir().prune14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota14() {
        assertEquals(5.0, new SableWeir().prune14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally15() {
        assertTrue(new SableWeir().prune15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableWeir().prune15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally15() {
        assertEquals(java.util.Arrays.asList(12),
                new SableWeir().prune15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio16() {
        assertEquals("below", new SableWeir().furl16(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio16() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.furl16(2));
        assertEquals("upper-bound", subject.furl16(11));
    }

    @Test
    void classifiesWithinAndAboveRatio16() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.furl16(2 + 1));
        assertEquals("above", subject.furl16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota17() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile17());
        }
        assertEquals(2, subject.weight17Count());
    }

    @Test
    void refusesOnceExhaustedQuota17() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 2; i++) {
            subject.reconcile17();
        }
        assertFalse(subject.reconcile17());
    }

    @Test
    void accumulatesBelowTheCapWeight18() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.gauge18(1));
        assertEquals(3, subject.gauge18(2));
    }

    @Test
    void saturatesAtTheCapWeight18() {
        SableWeir subject = new SableWeir();
        subject.gauge18(38);
        assertEquals(38, subject.gauge18(5));
    }

    @Test
    void ignoresNegativeValuesWeight18() {
        SableWeir subject = new SableWeir();
        subject.gauge18(3);
        assertEquals(3, subject.gauge18(-2));
        assertEquals(3, subject.bias18Value());
    }

    @Test
    void rejectsZeroDenominatorYield19() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.anneal19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield19() {
        assertEquals(0.5, new SableWeir().anneal19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield19() {
        assertEquals(5.0, new SableWeir().anneal19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota20() {
        assertTrue(new SableWeir().flatten20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableWeir().flatten20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota20() {
        assertEquals(java.util.Arrays.asList(8),
                new SableWeir().flatten20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight21() {
        assertEquals("below", new SableWeir().hoist21(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight21() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.hoist21(3));
        assertEquals("upper-bound", subject.hoist21(10));
    }

    @Test
    void classifiesWithinAndAboveWeight21() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.hoist21(3 + 1));
        assertEquals("above", subject.hoist21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio22() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile22());
        }
        assertEquals(3, subject.offset22Count());
    }

    @Test
    void refusesOnceExhaustedRatio22() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            subject.reconcile22();
        }
        assertFalse(subject.reconcile22());
    }

    @Test
    void accumulatesBelowTheCapTally23() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.winnow23(1));
        assertEquals(3, subject.winnow23(2));
    }

    @Test
    void saturatesAtTheCapTally23() {
        SableWeir subject = new SableWeir();
        subject.winnow23(43);
        assertEquals(43, subject.winnow23(5));
    }

    @Test
    void ignoresNegativeValuesTally23() {
        SableWeir subject = new SableWeir();
        subject.winnow23(3);
        assertEquals(3, subject.winnow23(-2));
        assertEquals(3, subject.ratio23Value());
    }

    @Test
    void rejectsZeroDenominatorDepth24() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.winnow24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth24() {
        assertEquals(0.5, new SableWeir().winnow24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth24() {
        assertEquals(5.0, new SableWeir().winnow24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset25() {
        assertTrue(new SableWeir().kindle25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableWeir().kindle25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset25() {
        assertEquals(java.util.Arrays.asList(13),
                new SableWeir().kindle25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence26() {
        assertEquals("below", new SableWeir().temper26(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence26() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.temper26(4));
        assertEquals("upper-bound", subject.temper26(9));
    }

    @Test
    void classifiesWithinAndAboveCadence26() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.temper26(4 + 1));
        assertEquals("above", subject.temper26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity27() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile27());
        }
        assertEquals(4, subject.ratio27Count());
    }

    @Test
    void refusesOnceExhaustedCapacity27() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            subject.reconcile27();
        }
        assertFalse(subject.reconcile27());
    }

    @Test
    void accumulatesBelowTheCapDepth28() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.brace28(1));
        assertEquals(3, subject.brace28(2));
    }

    @Test
    void saturatesAtTheCapDepth28() {
        SableWeir subject = new SableWeir();
        subject.brace28(48);
        assertEquals(48, subject.brace28(5));
    }

    @Test
    void ignoresNegativeValuesDepth28() {
        SableWeir subject = new SableWeir();
        subject.brace28(3);
        assertEquals(3, subject.brace28(-2));
        assertEquals(3, subject.capacity28Value());
    }

    @Test
    void rejectsZeroDenominatorOffset29() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.tally29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset29() {
        assertEquals(0.5, new SableWeir().tally29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset29() {
        assertEquals(5.0, new SableWeir().tally29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth30() {
        assertTrue(new SableWeir().flatten30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SableWeir().flatten30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth30() {
        assertEquals(java.util.Arrays.asList(9),
                new SableWeir().flatten30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift31() {
        assertEquals("below", new SableWeir().anneal31(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift31() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.anneal31(5));
        assertEquals("upper-bound", subject.anneal31(8));
    }

    @Test
    void classifiesWithinAndAboveDrift31() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.anneal31(5 + 1));
        assertEquals("above", subject.anneal31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield32() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune32());
        }
        assertEquals(1, subject.capacity32Count());
    }

    @Test
    void refusesOnceExhaustedYield32() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            subject.prune32();
        }
        assertFalse(subject.prune32());
    }

    @Test
    void accumulatesBelowTheCapThreshold33() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.flatten33(1));
        assertEquals(3, subject.flatten33(2));
    }

    @Test
    void saturatesAtTheCapThreshold33() {
        SableWeir subject = new SableWeir();
        subject.flatten33(53);
        assertEquals(53, subject.flatten33(5));
    }

    @Test
    void ignoresNegativeValuesThreshold33() {
        SableWeir subject = new SableWeir();
        subject.flatten33(3);
        assertEquals(3, subject.flatten33(-2));
        assertEquals(3, subject.bias33Value());
    }

    @Test
    void rejectsZeroDenominatorYield34() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.collate34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield34() {
        assertEquals(0.5, new SableWeir().collate34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield34() {
        assertEquals(5.0, new SableWeir().collate34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin35() {
        assertTrue(new SableWeir().hoist35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SableWeir().hoist35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin35() {
        assertEquals(java.util.Arrays.asList(14),
                new SableWeir().hoist35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift36() {
        assertEquals("below", new SableWeir().sift36(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift36() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.sift36(2));
        assertEquals("upper-bound", subject.sift36(7));
    }

    @Test
    void classifiesWithinAndAboveDrift36() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.sift36(2 + 1));
        assertEquals("above", subject.sift36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio37() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper37());
        }
        assertEquals(2, subject.tally37Count());
    }

    @Test
    void refusesOnceExhaustedRatio37() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 2; i++) {
            subject.temper37();
        }
        assertFalse(subject.temper37());
    }

    @Test
    void accumulatesBelowTheCapTally38() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.reconcile38(1));
        assertEquals(3, subject.reconcile38(2));
    }

    @Test
    void saturatesAtTheCapTally38() {
        SableWeir subject = new SableWeir();
        subject.reconcile38(58);
        assertEquals(58, subject.reconcile38(5));
    }

    @Test
    void ignoresNegativeValuesTally38() {
        SableWeir subject = new SableWeir();
        subject.reconcile38(3);
        assertEquals(3, subject.reconcile38(-2));
        assertEquals(3, subject.span38Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity39() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.prune39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity39() {
        assertEquals(0.5, new SableWeir().prune39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity39() {
        assertEquals(5.0, new SableWeir().prune39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold40() {
        assertTrue(new SableWeir().sift40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SableWeir().sift40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold40() {
        assertEquals(java.util.Arrays.asList(10),
                new SableWeir().sift40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift41() {
        assertEquals("below", new SableWeir().collate41(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift41() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.collate41(3));
        assertEquals("upper-bound", subject.collate41(12));
    }

    @Test
    void classifiesWithinAndAboveDrift41() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.collate41(3 + 1));
        assertEquals("above", subject.collate41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth42() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist42());
        }
        assertEquals(3, subject.bias42Count());
    }

    @Test
    void refusesOnceExhaustedDepth42() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            subject.hoist42();
        }
        assertFalse(subject.hoist42());
    }

    @Test
    void accumulatesBelowTheCapCapacity43() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.tally43(1));
        assertEquals(3, subject.tally43(2));
    }

    @Test
    void saturatesAtTheCapCapacity43() {
        SableWeir subject = new SableWeir();
        subject.tally43(23);
        assertEquals(23, subject.tally43(5));
    }

    @Test
    void ignoresNegativeValuesCapacity43() {
        SableWeir subject = new SableWeir();
        subject.tally43(3);
        assertEquals(3, subject.tally43(-2));
        assertEquals(3, subject.weight43Value());
    }

    @Test
    void rejectsZeroDenominatorQuota44() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.gauge44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota44() {
        assertEquals(0.5, new SableWeir().gauge44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota44() {
        assertEquals(5.0, new SableWeir().gauge44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin45() {
        assertTrue(new SableWeir().sift45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableWeir().sift45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin45() {
        assertEquals(java.util.Arrays.asList(6),
                new SableWeir().sift45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield46() {
        assertEquals("below", new SableWeir().prune46(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield46() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.prune46(4));
        assertEquals("upper-bound", subject.prune46(11));
    }

    @Test
    void classifiesWithinAndAboveYield46() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.prune46(4 + 1));
        assertEquals("above", subject.prune46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally47() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl47());
        }
        assertEquals(4, subject.depth47Count());
    }

    @Test
    void refusesOnceExhaustedTally47() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            subject.furl47();
        }
        assertFalse(subject.furl47());
    }

    @Test
    void accumulatesBelowTheCapOffset48() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.temper48(1));
        assertEquals(3, subject.temper48(2));
    }

    @Test
    void saturatesAtTheCapOffset48() {
        SableWeir subject = new SableWeir();
        subject.temper48(28);
        assertEquals(28, subject.temper48(5));
    }

    @Test
    void ignoresNegativeValuesOffset48() {
        SableWeir subject = new SableWeir();
        subject.temper48(3);
        assertEquals(3, subject.temper48(-2));
        assertEquals(3, subject.quota48Value());
    }

    @Test
    void rejectsZeroDenominatorRatio49() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.prune49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio49() {
        assertEquals(0.5, new SableWeir().prune49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio49() {
        assertEquals(5.0, new SableWeir().prune49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity50() {
        assertTrue(new SableWeir().brace50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableWeir().brace50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity50() {
        assertEquals(java.util.Arrays.asList(11),
                new SableWeir().brace50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias51() {
        assertEquals("below", new SableWeir().hoist51(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias51() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.hoist51(5));
        assertEquals("upper-bound", subject.hoist51(10));
    }

    @Test
    void classifiesWithinAndAboveBias51() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.hoist51(5 + 1));
        assertEquals("above", subject.hoist51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity52() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge52());
        }
        assertEquals(1, subject.yield52Count());
    }

    @Test
    void refusesOnceExhaustedCapacity52() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            subject.gauge52();
        }
        assertFalse(subject.gauge52());
    }

    @Test
    void accumulatesBelowTheCapCapacity53() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.temper53(1));
        assertEquals(3, subject.temper53(2));
    }

    @Test
    void saturatesAtTheCapCapacity53() {
        SableWeir subject = new SableWeir();
        subject.temper53(33);
        assertEquals(33, subject.temper53(5));
    }

    @Test
    void ignoresNegativeValuesCapacity53() {
        SableWeir subject = new SableWeir();
        subject.temper53(3);
        assertEquals(3, subject.temper53(-2));
        assertEquals(3, subject.tally53Value());
    }

    @Test
    void rejectsZeroDenominatorWeight54() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.brace54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight54() {
        assertEquals(0.5, new SableWeir().brace54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight54() {
        assertEquals(5.0, new SableWeir().brace54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan55() {
        assertTrue(new SableWeir().kindle55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableWeir().kindle55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan55() {
        assertEquals(java.util.Arrays.asList(7),
                new SableWeir().kindle55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio56() {
        assertEquals("below", new SableWeir().reconcile56(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio56() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.reconcile56(2));
        assertEquals("upper-bound", subject.reconcile56(9));
    }

    @Test
    void classifiesWithinAndAboveRatio56() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.reconcile56(2 + 1));
        assertEquals("above", subject.reconcile56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight57() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally57());
        }
        assertEquals(2, subject.ratio57Count());
    }

    @Test
    void refusesOnceExhaustedWeight57() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 2; i++) {
            subject.tally57();
        }
        assertFalse(subject.tally57());
    }

    @Test
    void accumulatesBelowTheCapMargin58() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.furl58(1));
        assertEquals(3, subject.furl58(2));
    }

    @Test
    void saturatesAtTheCapMargin58() {
        SableWeir subject = new SableWeir();
        subject.furl58(38);
        assertEquals(38, subject.furl58(5));
    }

    @Test
    void ignoresNegativeValuesMargin58() {
        SableWeir subject = new SableWeir();
        subject.furl58(3);
        assertEquals(3, subject.furl58(-2));
        assertEquals(3, subject.weight58Value());
    }

    @Test
    void rejectsZeroDenominatorSpan59() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.winnow59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan59() {
        assertEquals(0.5, new SableWeir().winnow59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan59() {
        assertEquals(5.0, new SableWeir().winnow59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth60() {
        assertTrue(new SableWeir().hoist60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableWeir().hoist60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth60() {
        assertEquals(java.util.Arrays.asList(12),
                new SableWeir().hoist60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally61() {
        assertEquals("below", new SableWeir().tally61(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally61() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.tally61(3));
        assertEquals("upper-bound", subject.tally61(8));
    }

    @Test
    void classifiesWithinAndAboveTally61() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.tally61(3 + 1));
        assertEquals("above", subject.tally61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota62() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace62());
        }
        assertEquals(3, subject.depth62Count());
    }

    @Test
    void refusesOnceExhaustedQuota62() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            subject.brace62();
        }
        assertFalse(subject.brace62());
    }

    @Test
    void accumulatesBelowTheCapDrift63() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.collate63(1));
        assertEquals(3, subject.collate63(2));
    }

    @Test
    void saturatesAtTheCapDrift63() {
        SableWeir subject = new SableWeir();
        subject.collate63(43);
        assertEquals(43, subject.collate63(5));
    }

    @Test
    void ignoresNegativeValuesDrift63() {
        SableWeir subject = new SableWeir();
        subject.collate63(3);
        assertEquals(3, subject.collate63(-2));
        assertEquals(3, subject.capacity63Value());
    }

    @Test
    void rejectsZeroDenominatorQuota64() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.sift64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota64() {
        assertEquals(0.5, new SableWeir().sift64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota64() {
        assertEquals(5.0, new SableWeir().sift64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota65() {
        assertTrue(new SableWeir().reconcile65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableWeir().reconcile65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota65() {
        assertEquals(java.util.Arrays.asList(8),
                new SableWeir().reconcile65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan66() {
        assertEquals("below", new SableWeir().furl66(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan66() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.furl66(4));
        assertEquals("upper-bound", subject.furl66(7));
    }

    @Test
    void classifiesWithinAndAboveSpan66() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.furl66(4 + 1));
        assertEquals("above", subject.furl66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity67() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace67());
        }
        assertEquals(4, subject.bias67Count());
    }

    @Test
    void refusesOnceExhaustedCapacity67() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            subject.brace67();
        }
        assertFalse(subject.brace67());
    }

    @Test
    void accumulatesBelowTheCapBias68() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.anneal68(1));
        assertEquals(3, subject.anneal68(2));
    }

    @Test
    void saturatesAtTheCapBias68() {
        SableWeir subject = new SableWeir();
        subject.anneal68(48);
        assertEquals(48, subject.anneal68(5));
    }

    @Test
    void ignoresNegativeValuesBias68() {
        SableWeir subject = new SableWeir();
        subject.anneal68(3);
        assertEquals(3, subject.anneal68(-2));
        assertEquals(3, subject.span68Value());
    }

    @Test
    void rejectsZeroDenominatorOffset69() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.gauge69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset69() {
        assertEquals(0.5, new SableWeir().gauge69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset69() {
        assertEquals(5.0, new SableWeir().gauge69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio70() {
        assertTrue(new SableWeir().anneal70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableWeir().anneal70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio70() {
        assertEquals(java.util.Arrays.asList(13),
                new SableWeir().anneal70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence71() {
        assertEquals("below", new SableWeir().collate71(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence71() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.collate71(5));
        assertEquals("upper-bound", subject.collate71(12));
    }

    @Test
    void classifiesWithinAndAboveCadence71() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.collate71(5 + 1));
        assertEquals("above", subject.collate71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset72() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle72());
        }
        assertEquals(1, subject.margin72Count());
    }

    @Test
    void refusesOnceExhaustedOffset72() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            subject.kindle72();
        }
        assertFalse(subject.kindle72());
    }

    @Test
    void accumulatesBelowTheCapYield73() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.collate73(1));
        assertEquals(3, subject.collate73(2));
    }

    @Test
    void saturatesAtTheCapYield73() {
        SableWeir subject = new SableWeir();
        subject.collate73(53);
        assertEquals(53, subject.collate73(5));
    }

    @Test
    void ignoresNegativeValuesYield73() {
        SableWeir subject = new SableWeir();
        subject.collate73(3);
        assertEquals(3, subject.collate73(-2));
        assertEquals(3, subject.capacity73Value());
    }

    @Test
    void rejectsZeroDenominatorCadence74() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.reconcile74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence74() {
        assertEquals(0.5, new SableWeir().reconcile74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence74() {
        assertEquals(5.0, new SableWeir().reconcile74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin75() {
        assertTrue(new SableWeir().gauge75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SableWeir().gauge75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin75() {
        assertEquals(java.util.Arrays.asList(9),
                new SableWeir().gauge75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio76() {
        assertEquals("below", new SableWeir().prune76(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio76() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.prune76(2));
        assertEquals("upper-bound", subject.prune76(11));
    }

    @Test
    void classifiesWithinAndAboveRatio76() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.prune76(2 + 1));
        assertEquals("above", subject.prune76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift77() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace77());
        }
        assertEquals(2, subject.weight77Count());
    }

    @Test
    void refusesOnceExhaustedDrift77() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 2; i++) {
            subject.brace77();
        }
        assertFalse(subject.brace77());
    }

    @Test
    void accumulatesBelowTheCapMargin78() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.gauge78(1));
        assertEquals(3, subject.gauge78(2));
    }

    @Test
    void saturatesAtTheCapMargin78() {
        SableWeir subject = new SableWeir();
        subject.gauge78(58);
        assertEquals(58, subject.gauge78(5));
    }

    @Test
    void ignoresNegativeValuesMargin78() {
        SableWeir subject = new SableWeir();
        subject.gauge78(3);
        assertEquals(3, subject.gauge78(-2));
        assertEquals(3, subject.span78Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity79() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.furl79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity79() {
        assertEquals(0.5, new SableWeir().furl79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity79() {
        assertEquals(5.0, new SableWeir().furl79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight80() {
        assertTrue(new SableWeir().reconcile80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SableWeir().reconcile80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight80() {
        assertEquals(java.util.Arrays.asList(14),
                new SableWeir().reconcile80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan81() {
        assertEquals("below", new SableWeir().prune81(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan81() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.prune81(3));
        assertEquals("upper-bound", subject.prune81(10));
    }

    @Test
    void classifiesWithinAndAboveSpan81() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.prune81(3 + 1));
        assertEquals("above", subject.prune81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally82() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle82());
        }
        assertEquals(3, subject.margin82Count());
    }

    @Test
    void refusesOnceExhaustedTally82() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            subject.kindle82();
        }
        assertFalse(subject.kindle82());
    }

    @Test
    void accumulatesBelowTheCapDrift83() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.kindle83(1));
        assertEquals(3, subject.kindle83(2));
    }

    @Test
    void saturatesAtTheCapDrift83() {
        SableWeir subject = new SableWeir();
        subject.kindle83(23);
        assertEquals(23, subject.kindle83(5));
    }

    @Test
    void ignoresNegativeValuesDrift83() {
        SableWeir subject = new SableWeir();
        subject.kindle83(3);
        assertEquals(3, subject.kindle83(-2));
        assertEquals(3, subject.yield83Value());
    }

    @Test
    void rejectsZeroDenominatorRatio84() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.sift84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio84() {
        assertEquals(0.5, new SableWeir().sift84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio84() {
        assertEquals(5.0, new SableWeir().sift84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio85() {
        assertTrue(new SableWeir().temper85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SableWeir().temper85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio85() {
        assertEquals(java.util.Arrays.asList(10),
                new SableWeir().temper85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift86() {
        assertEquals("below", new SableWeir().anneal86(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift86() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.anneal86(4));
        assertEquals("upper-bound", subject.anneal86(9));
    }

    @Test
    void classifiesWithinAndAboveDrift86() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.anneal86(4 + 1));
        assertEquals("above", subject.anneal86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota87() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle87());
        }
        assertEquals(4, subject.capacity87Count());
    }

    @Test
    void refusesOnceExhaustedQuota87() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            subject.kindle87();
        }
        assertFalse(subject.kindle87());
    }

    @Test
    void accumulatesBelowTheCapYield88() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.brace88(1));
        assertEquals(3, subject.brace88(2));
    }

    @Test
    void saturatesAtTheCapYield88() {
        SableWeir subject = new SableWeir();
        subject.brace88(28);
        assertEquals(28, subject.brace88(5));
    }

    @Test
    void ignoresNegativeValuesYield88() {
        SableWeir subject = new SableWeir();
        subject.brace88(3);
        assertEquals(3, subject.brace88(-2));
        assertEquals(3, subject.span88Value());
    }

    @Test
    void rejectsZeroDenominatorSpan89() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.furl89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan89() {
        assertEquals(0.5, new SableWeir().furl89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan89() {
        assertEquals(5.0, new SableWeir().furl89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally90() {
        assertTrue(new SableWeir().tally90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableWeir().tally90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally90() {
        assertEquals(java.util.Arrays.asList(6),
                new SableWeir().tally90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset91() {
        assertEquals("below", new SableWeir().sift91(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset91() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.sift91(5));
        assertEquals("upper-bound", subject.sift91(8));
    }

    @Test
    void classifiesWithinAndAboveOffset91() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.sift91(5 + 1));
        assertEquals("above", subject.sift91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence92() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace92());
        }
        assertEquals(1, subject.capacity92Count());
    }

    @Test
    void refusesOnceExhaustedCadence92() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            subject.brace92();
        }
        assertFalse(subject.brace92());
    }

    @Test
    void accumulatesBelowTheCapCapacity93() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.flatten93(1));
        assertEquals(3, subject.flatten93(2));
    }

    @Test
    void saturatesAtTheCapCapacity93() {
        SableWeir subject = new SableWeir();
        subject.flatten93(33);
        assertEquals(33, subject.flatten93(5));
    }

    @Test
    void ignoresNegativeValuesCapacity93() {
        SableWeir subject = new SableWeir();
        subject.flatten93(3);
        assertEquals(3, subject.flatten93(-2));
        assertEquals(3, subject.weight93Value());
    }

    @Test
    void rejectsZeroDenominatorSpan94() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.flatten94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan94() {
        assertEquals(0.5, new SableWeir().flatten94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan94() {
        assertEquals(5.0, new SableWeir().flatten94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias95() {
        assertTrue(new SableWeir().prune95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableWeir().prune95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias95() {
        assertEquals(java.util.Arrays.asList(11),
                new SableWeir().prune95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio96() {
        assertEquals("below", new SableWeir().winnow96(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio96() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.winnow96(2));
        assertEquals("upper-bound", subject.winnow96(7));
    }

    @Test
    void classifiesWithinAndAboveRatio96() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.winnow96(2 + 1));
        assertEquals("above", subject.winnow96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota97() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle97());
        }
        assertEquals(2, subject.weight97Count());
    }

    @Test
    void refusesOnceExhaustedQuota97() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 2; i++) {
            subject.kindle97();
        }
        assertFalse(subject.kindle97());
    }

    @Test
    void accumulatesBelowTheCapDrift98() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.temper98(1));
        assertEquals(3, subject.temper98(2));
    }

    @Test
    void saturatesAtTheCapDrift98() {
        SableWeir subject = new SableWeir();
        subject.temper98(38);
        assertEquals(38, subject.temper98(5));
    }

    @Test
    void ignoresNegativeValuesDrift98() {
        SableWeir subject = new SableWeir();
        subject.temper98(3);
        assertEquals(3, subject.temper98(-2));
        assertEquals(3, subject.margin98Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold99() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.gauge99(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold99() {
        assertEquals(0.5, new SableWeir().gauge99(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold99() {
        assertEquals(5.0, new SableWeir().gauge99(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan100() {
        assertTrue(new SableWeir().reconcile100(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan100() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableWeir().reconcile100(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan100() {
        assertEquals(java.util.Arrays.asList(7),
                new SableWeir().reconcile100(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold101() {
        assertEquals("below", new SableWeir().kindle101(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold101() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.kindle101(3));
        assertEquals("upper-bound", subject.kindle101(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold101() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.kindle101(3 + 1));
        assertEquals("above", subject.kindle101(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio102() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge102());
        }
        assertEquals(3, subject.yield102Count());
    }

    @Test
    void refusesOnceExhaustedRatio102() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            subject.gauge102();
        }
        assertFalse(subject.gauge102());
    }

    @Test
    void accumulatesBelowTheCapMargin103() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.reconcile103(1));
        assertEquals(3, subject.reconcile103(2));
    }

    @Test
    void saturatesAtTheCapMargin103() {
        SableWeir subject = new SableWeir();
        subject.reconcile103(43);
        assertEquals(43, subject.reconcile103(5));
    }

    @Test
    void ignoresNegativeValuesMargin103() {
        SableWeir subject = new SableWeir();
        subject.reconcile103(3);
        assertEquals(3, subject.reconcile103(-2));
        assertEquals(3, subject.quota103Value());
    }

    @Test
    void rejectsZeroDenominatorSpan104() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.gauge104(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan104() {
        assertEquals(0.5, new SableWeir().gauge104(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan104() {
        assertEquals(5.0, new SableWeir().gauge104(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio105() {
        assertTrue(new SableWeir().winnow105(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio105() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableWeir().winnow105(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio105() {
        assertEquals(java.util.Arrays.asList(12),
                new SableWeir().winnow105(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias106() {
        assertEquals("below", new SableWeir().temper106(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias106() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.temper106(4));
        assertEquals("upper-bound", subject.temper106(11));
    }

    @Test
    void classifiesWithinAndAboveBias106() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.temper106(4 + 1));
        assertEquals("above", subject.temper106(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin107() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist107());
        }
        assertEquals(4, subject.ratio107Count());
    }

    @Test
    void refusesOnceExhaustedMargin107() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            subject.hoist107();
        }
        assertFalse(subject.hoist107());
    }

    @Test
    void accumulatesBelowTheCapBias108() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.collate108(1));
        assertEquals(3, subject.collate108(2));
    }

    @Test
    void saturatesAtTheCapBias108() {
        SableWeir subject = new SableWeir();
        subject.collate108(48);
        assertEquals(48, subject.collate108(5));
    }

    @Test
    void ignoresNegativeValuesBias108() {
        SableWeir subject = new SableWeir();
        subject.collate108(3);
        assertEquals(3, subject.collate108(-2));
        assertEquals(3, subject.quota108Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold109() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.temper109(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold109() {
        assertEquals(0.5, new SableWeir().temper109(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold109() {
        assertEquals(5.0, new SableWeir().temper109(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift110() {
        assertTrue(new SableWeir().collate110(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift110() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableWeir().collate110(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift110() {
        assertEquals(java.util.Arrays.asList(8),
                new SableWeir().collate110(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold111() {
        assertEquals("below", new SableWeir().flatten111(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold111() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.flatten111(5));
        assertEquals("upper-bound", subject.flatten111(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold111() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.flatten111(5 + 1));
        assertEquals("above", subject.flatten111(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence112() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate112());
        }
        assertEquals(1, subject.weight112Count());
    }

    @Test
    void refusesOnceExhaustedCadence112() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            subject.collate112();
        }
        assertFalse(subject.collate112());
    }

    @Test
    void accumulatesBelowTheCapTally113() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.hoist113(1));
        assertEquals(3, subject.hoist113(2));
    }

    @Test
    void saturatesAtTheCapTally113() {
        SableWeir subject = new SableWeir();
        subject.hoist113(53);
        assertEquals(53, subject.hoist113(5));
    }

    @Test
    void ignoresNegativeValuesTally113() {
        SableWeir subject = new SableWeir();
        subject.hoist113(3);
        assertEquals(3, subject.hoist113(-2));
        assertEquals(3, subject.capacity113Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity114() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.hoist114(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity114() {
        assertEquals(0.5, new SableWeir().hoist114(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity114() {
        assertEquals(5.0, new SableWeir().hoist114(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin115() {
        assertTrue(new SableWeir().gauge115(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin115() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableWeir().gauge115(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin115() {
        assertEquals(java.util.Arrays.asList(13),
                new SableWeir().gauge115(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio116() {
        assertEquals("below", new SableWeir().tally116(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio116() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.tally116(2));
        assertEquals("upper-bound", subject.tally116(9));
    }

    @Test
    void classifiesWithinAndAboveRatio116() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.tally116(2 + 1));
        assertEquals("above", subject.tally116(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio117() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten117());
        }
        assertEquals(2, subject.cadence117Count());
    }

    @Test
    void refusesOnceExhaustedRatio117() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 2; i++) {
            subject.flatten117();
        }
        assertFalse(subject.flatten117());
    }

    @Test
    void accumulatesBelowTheCapWeight118() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.anneal118(1));
        assertEquals(3, subject.anneal118(2));
    }

    @Test
    void saturatesAtTheCapWeight118() {
        SableWeir subject = new SableWeir();
        subject.anneal118(58);
        assertEquals(58, subject.anneal118(5));
    }

    @Test
    void ignoresNegativeValuesWeight118() {
        SableWeir subject = new SableWeir();
        subject.anneal118(3);
        assertEquals(3, subject.anneal118(-2));
        assertEquals(3, subject.drift118Value());
    }

    @Test
    void rejectsZeroDenominatorSpan119() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.gauge119(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan119() {
        assertEquals(0.5, new SableWeir().gauge119(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan119() {
        assertEquals(5.0, new SableWeir().gauge119(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth120() {
        assertTrue(new SableWeir().sift120(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth120() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SableWeir().sift120(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth120() {
        assertEquals(java.util.Arrays.asList(9),
                new SableWeir().sift120(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold121() {
        assertEquals("below", new SableWeir().hoist121(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold121() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.hoist121(3));
        assertEquals("upper-bound", subject.hoist121(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold121() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.hoist121(3 + 1));
        assertEquals("above", subject.hoist121(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift122() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune122());
        }
        assertEquals(3, subject.offset122Count());
    }

    @Test
    void refusesOnceExhaustedDrift122() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 3; i++) {
            subject.prune122();
        }
        assertFalse(subject.prune122());
    }

    @Test
    void accumulatesBelowTheCapThreshold123() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.winnow123(1));
        assertEquals(3, subject.winnow123(2));
    }

    @Test
    void saturatesAtTheCapThreshold123() {
        SableWeir subject = new SableWeir();
        subject.winnow123(23);
        assertEquals(23, subject.winnow123(5));
    }

    @Test
    void ignoresNegativeValuesThreshold123() {
        SableWeir subject = new SableWeir();
        subject.winnow123(3);
        assertEquals(3, subject.winnow123(-2));
        assertEquals(3, subject.span123Value());
    }

    @Test
    void rejectsZeroDenominatorSpan124() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.temper124(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan124() {
        assertEquals(0.5, new SableWeir().temper124(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan124() {
        assertEquals(5.0, new SableWeir().temper124(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin125() {
        assertTrue(new SableWeir().collate125(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin125() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SableWeir().collate125(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin125() {
        assertEquals(java.util.Arrays.asList(14),
                new SableWeir().collate125(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold126() {
        assertEquals("below", new SableWeir().furl126(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold126() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.furl126(4));
        assertEquals("upper-bound", subject.furl126(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold126() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.furl126(4 + 1));
        assertEquals("above", subject.furl126(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield127() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten127());
        }
        assertEquals(4, subject.tally127Count());
    }

    @Test
    void refusesOnceExhaustedYield127() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 4; i++) {
            subject.flatten127();
        }
        assertFalse(subject.flatten127());
    }

    @Test
    void accumulatesBelowTheCapTally128() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.gauge128(1));
        assertEquals(3, subject.gauge128(2));
    }

    @Test
    void saturatesAtTheCapTally128() {
        SableWeir subject = new SableWeir();
        subject.gauge128(28);
        assertEquals(28, subject.gauge128(5));
    }

    @Test
    void ignoresNegativeValuesTally128() {
        SableWeir subject = new SableWeir();
        subject.gauge128(3);
        assertEquals(3, subject.gauge128(-2));
        assertEquals(3, subject.yield128Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity129() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.winnow129(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity129() {
        assertEquals(0.5, new SableWeir().winnow129(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity129() {
        assertEquals(5.0, new SableWeir().winnow129(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight130() {
        assertTrue(new SableWeir().flatten130(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight130() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SableWeir().flatten130(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight130() {
        assertEquals(java.util.Arrays.asList(10),
                new SableWeir().flatten130(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin131() {
        assertEquals("below", new SableWeir().tally131(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin131() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.tally131(5));
        assertEquals("upper-bound", subject.tally131(12));
    }

    @Test
    void classifiesWithinAndAboveMargin131() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.tally131(5 + 1));
        assertEquals("above", subject.tally131(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth132() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal132());
        }
        assertEquals(1, subject.threshold132Count());
    }

    @Test
    void refusesOnceExhaustedDepth132() {
        SableWeir subject = new SableWeir();
        for (int i = 0; i < 1; i++) {
            subject.anneal132();
        }
        assertFalse(subject.anneal132());
    }

    @Test
    void accumulatesBelowTheCapQuota133() {
        SableWeir subject = new SableWeir();
        assertEquals(1, subject.winnow133(1));
        assertEquals(3, subject.winnow133(2));
    }

    @Test
    void saturatesAtTheCapQuota133() {
        SableWeir subject = new SableWeir();
        subject.winnow133(33);
        assertEquals(33, subject.winnow133(5));
    }

    @Test
    void ignoresNegativeValuesQuota133() {
        SableWeir subject = new SableWeir();
        subject.winnow133(3);
        assertEquals(3, subject.winnow133(-2));
        assertEquals(3, subject.capacity133Value());
    }

    @Test
    void rejectsZeroDenominatorMargin134() {
        SableWeir subject = new SableWeir();
        assertThrows(ArithmeticException.class, () -> subject.brace134(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin134() {
        assertEquals(0.5, new SableWeir().brace134(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin134() {
        assertEquals(5.0, new SableWeir().brace134(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias135() {
        assertTrue(new SableWeir().kindle135(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias135() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableWeir().kindle135(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias135() {
        assertEquals(java.util.Arrays.asList(6),
                new SableWeir().kindle135(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio136() {
        assertEquals("below", new SableWeir().temper136(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio136() {
        SableWeir subject = new SableWeir();
        assertEquals("lower-bound", subject.temper136(2));
        assertEquals("upper-bound", subject.temper136(11));
    }

    @Test
    void classifiesWithinAndAboveRatio136() {
        SableWeir subject = new SableWeir();
        assertEquals("within", subject.temper136(2 + 1));
        assertEquals("above", subject.temper136(11 + 1));
    }
}
