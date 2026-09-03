package com.bramble.lattice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleKilnIITest {

    @Test
    void returnsEmptyForNullDepth0() {
        assertTrue(new BrambleKilnII().sift0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleKilnII().sift0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth0() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleKilnII().sift0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota1() {
        assertEquals("below", new BrambleKilnII().flatten1(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota1() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.flatten1(3));
        assertEquals("upper-bound", subject.flatten1(8));
    }

    @Test
    void classifiesWithinAndAboveQuota1() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.flatten1(3 + 1));
        assertEquals("above", subject.flatten1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota2() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally2());
        }
        assertEquals(3, subject.bias2Count());
    }

    @Test
    void refusesOnceExhaustedQuota2() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            subject.tally2();
        }
        assertFalse(subject.tally2());
    }

    @Test
    void accumulatesBelowTheCapThreshold3() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.kindle3(1));
        assertEquals(3, subject.kindle3(2));
    }

    @Test
    void saturatesAtTheCapThreshold3() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.kindle3(23);
        assertEquals(23, subject.kindle3(5));
    }

    @Test
    void ignoresNegativeValuesThreshold3() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.kindle3(3);
        assertEquals(3, subject.kindle3(-2));
        assertEquals(3, subject.yield3Value());
    }

    @Test
    void rejectsZeroDenominatorYield4() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.brace4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield4() {
        assertEquals(0.5, new BrambleKilnII().brace4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield4() {
        assertEquals(5.0, new BrambleKilnII().brace4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota5() {
        assertTrue(new BrambleKilnII().temper5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new BrambleKilnII().temper5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota5() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleKilnII().temper5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold6() {
        assertEquals("below", new BrambleKilnII().tally6(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold6() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.tally6(4));
        assertEquals("upper-bound", subject.tally6(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold6() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.tally6(4 + 1));
        assertEquals("above", subject.tally6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift7() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally7());
        }
        assertEquals(4, subject.margin7Count());
    }

    @Test
    void refusesOnceExhaustedDrift7() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            subject.tally7();
        }
        assertFalse(subject.tally7());
    }

    @Test
    void accumulatesBelowTheCapBias8() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.gauge8(1));
        assertEquals(3, subject.gauge8(2));
    }

    @Test
    void saturatesAtTheCapBias8() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.gauge8(28);
        assertEquals(28, subject.gauge8(5));
    }

    @Test
    void ignoresNegativeValuesBias8() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.gauge8(3);
        assertEquals(3, subject.gauge8(-2));
        assertEquals(3, subject.span8Value());
    }

    @Test
    void rejectsZeroDenominatorRatio9() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.temper9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio9() {
        assertEquals(0.5, new BrambleKilnII().temper9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio9() {
        assertEquals(5.0, new BrambleKilnII().temper9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally10() {
        assertTrue(new BrambleKilnII().anneal10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new BrambleKilnII().anneal10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally10() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleKilnII().anneal10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity11() {
        assertEquals("below", new BrambleKilnII().temper11(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity11() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.temper11(5));
        assertEquals("upper-bound", subject.temper11(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity11() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.temper11(5 + 1));
        assertEquals("above", subject.temper11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift12() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal12());
        }
        assertEquals(1, subject.tally12Count());
    }

    @Test
    void refusesOnceExhaustedDrift12() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            subject.anneal12();
        }
        assertFalse(subject.anneal12());
    }

    @Test
    void accumulatesBelowTheCapThreshold13() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.winnow13(1));
        assertEquals(3, subject.winnow13(2));
    }

    @Test
    void saturatesAtTheCapThreshold13() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.winnow13(33);
        assertEquals(33, subject.winnow13(5));
    }

    @Test
    void ignoresNegativeValuesThreshold13() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.winnow13(3);
        assertEquals(3, subject.winnow13(-2));
        assertEquals(3, subject.depth13Value());
    }

    @Test
    void rejectsZeroDenominatorSpan14() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.temper14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan14() {
        assertEquals(0.5, new BrambleKilnII().temper14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan14() {
        assertEquals(5.0, new BrambleKilnII().temper14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias15() {
        assertTrue(new BrambleKilnII().gauge15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new BrambleKilnII().gauge15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias15() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleKilnII().gauge15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield16() {
        assertEquals("below", new BrambleKilnII().hoist16(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield16() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.hoist16(2));
        assertEquals("upper-bound", subject.hoist16(11));
    }

    @Test
    void classifiesWithinAndAboveYield16() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.hoist16(2 + 1));
        assertEquals("above", subject.hoist16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield17() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper17());
        }
        assertEquals(2, subject.threshold17Count());
    }

    @Test
    void refusesOnceExhaustedYield17() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            subject.temper17();
        }
        assertFalse(subject.temper17());
    }

    @Test
    void accumulatesBelowTheCapOffset18() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.gauge18(1));
        assertEquals(3, subject.gauge18(2));
    }

    @Test
    void saturatesAtTheCapOffset18() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.gauge18(38);
        assertEquals(38, subject.gauge18(5));
    }

    @Test
    void ignoresNegativeValuesOffset18() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.gauge18(3);
        assertEquals(3, subject.gauge18(-2));
        assertEquals(3, subject.tally18Value());
    }

    @Test
    void rejectsZeroDenominatorMargin19() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.anneal19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin19() {
        assertEquals(0.5, new BrambleKilnII().anneal19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin19() {
        assertEquals(5.0, new BrambleKilnII().anneal19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold20() {
        assertTrue(new BrambleKilnII().flatten20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new BrambleKilnII().flatten20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold20() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleKilnII().flatten20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio21() {
        assertEquals("below", new BrambleKilnII().prune21(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio21() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.prune21(3));
        assertEquals("upper-bound", subject.prune21(10));
    }

    @Test
    void classifiesWithinAndAboveRatio21() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.prune21(3 + 1));
        assertEquals("above", subject.prune21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias22() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift22());
        }
        assertEquals(3, subject.span22Count());
    }

    @Test
    void refusesOnceExhaustedBias22() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            subject.sift22();
        }
        assertFalse(subject.sift22());
    }

    @Test
    void accumulatesBelowTheCapDepth23() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.tally23(1));
        assertEquals(3, subject.tally23(2));
    }

    @Test
    void saturatesAtTheCapDepth23() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.tally23(43);
        assertEquals(43, subject.tally23(5));
    }

    @Test
    void ignoresNegativeValuesDepth23() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.tally23(3);
        assertEquals(3, subject.tally23(-2));
        assertEquals(3, subject.capacity23Value());
    }

    @Test
    void rejectsZeroDenominatorWeight24() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.kindle24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight24() {
        assertEquals(0.5, new BrambleKilnII().kindle24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight24() {
        assertEquals(5.0, new BrambleKilnII().kindle24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold25() {
        assertTrue(new BrambleKilnII().gauge25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new BrambleKilnII().gauge25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold25() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleKilnII().gauge25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift26() {
        assertEquals("below", new BrambleKilnII().collate26(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift26() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.collate26(4));
        assertEquals("upper-bound", subject.collate26(9));
    }

    @Test
    void classifiesWithinAndAboveDrift26() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.collate26(4 + 1));
        assertEquals("above", subject.collate26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias27() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace27());
        }
        assertEquals(4, subject.offset27Count());
    }

    @Test
    void refusesOnceExhaustedBias27() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            subject.brace27();
        }
        assertFalse(subject.brace27());
    }

    @Test
    void accumulatesBelowTheCapThreshold28() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.tally28(1));
        assertEquals(3, subject.tally28(2));
    }

    @Test
    void saturatesAtTheCapThreshold28() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.tally28(48);
        assertEquals(48, subject.tally28(5));
    }

    @Test
    void ignoresNegativeValuesThreshold28() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.tally28(3);
        assertEquals(3, subject.tally28(-2));
        assertEquals(3, subject.drift28Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold29() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.anneal29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold29() {
        assertEquals(0.5, new BrambleKilnII().anneal29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold29() {
        assertEquals(5.0, new BrambleKilnII().anneal29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset30() {
        assertTrue(new BrambleKilnII().kindle30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new BrambleKilnII().kindle30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset30() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleKilnII().kindle30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally31() {
        assertEquals("below", new BrambleKilnII().anneal31(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally31() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.anneal31(5));
        assertEquals("upper-bound", subject.anneal31(8));
    }

    @Test
    void classifiesWithinAndAboveTally31() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.anneal31(5 + 1));
        assertEquals("above", subject.anneal31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift32() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate32());
        }
        assertEquals(1, subject.tally32Count());
    }

    @Test
    void refusesOnceExhaustedDrift32() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            subject.collate32();
        }
        assertFalse(subject.collate32());
    }

    @Test
    void accumulatesBelowTheCapQuota33() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.kindle33(1));
        assertEquals(3, subject.kindle33(2));
    }

    @Test
    void saturatesAtTheCapQuota33() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.kindle33(53);
        assertEquals(53, subject.kindle33(5));
    }

    @Test
    void ignoresNegativeValuesQuota33() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.kindle33(3);
        assertEquals(3, subject.kindle33(-2));
        assertEquals(3, subject.bias33Value());
    }

    @Test
    void rejectsZeroDenominatorOffset34() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.kindle34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset34() {
        assertEquals(0.5, new BrambleKilnII().kindle34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset34() {
        assertEquals(5.0, new BrambleKilnII().kindle34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield35() {
        assertTrue(new BrambleKilnII().temper35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new BrambleKilnII().temper35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield35() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleKilnII().temper35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield36() {
        assertEquals("below", new BrambleKilnII().tally36(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield36() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.tally36(2));
        assertEquals("upper-bound", subject.tally36(7));
    }

    @Test
    void classifiesWithinAndAboveYield36() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.tally36(2 + 1));
        assertEquals("above", subject.tally36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio37() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal37());
        }
        assertEquals(2, subject.drift37Count());
    }

    @Test
    void refusesOnceExhaustedRatio37() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            subject.anneal37();
        }
        assertFalse(subject.anneal37());
    }

    @Test
    void accumulatesBelowTheCapQuota38() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.sift38(1));
        assertEquals(3, subject.sift38(2));
    }

    @Test
    void saturatesAtTheCapQuota38() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.sift38(58);
        assertEquals(58, subject.sift38(5));
    }

    @Test
    void ignoresNegativeValuesQuota38() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.sift38(3);
        assertEquals(3, subject.sift38(-2));
        assertEquals(3, subject.yield38Value());
    }

    @Test
    void rejectsZeroDenominatorDepth39() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.furl39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth39() {
        assertEquals(0.5, new BrambleKilnII().furl39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth39() {
        assertEquals(5.0, new BrambleKilnII().furl39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota40() {
        assertTrue(new BrambleKilnII().winnow40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new BrambleKilnII().winnow40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota40() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleKilnII().winnow40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota41() {
        assertEquals("below", new BrambleKilnII().gauge41(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota41() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.gauge41(3));
        assertEquals("upper-bound", subject.gauge41(12));
    }

    @Test
    void classifiesWithinAndAboveQuota41() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.gauge41(3 + 1));
        assertEquals("above", subject.gauge41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence42() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle42());
        }
        assertEquals(3, subject.capacity42Count());
    }

    @Test
    void refusesOnceExhaustedCadence42() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            subject.kindle42();
        }
        assertFalse(subject.kindle42());
    }

    @Test
    void accumulatesBelowTheCapYield43() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.brace43(1));
        assertEquals(3, subject.brace43(2));
    }

    @Test
    void saturatesAtTheCapYield43() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.brace43(23);
        assertEquals(23, subject.brace43(5));
    }

    @Test
    void ignoresNegativeValuesYield43() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.brace43(3);
        assertEquals(3, subject.brace43(-2));
        assertEquals(3, subject.weight43Value());
    }

    @Test
    void rejectsZeroDenominatorDepth44() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.gauge44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth44() {
        assertEquals(0.5, new BrambleKilnII().gauge44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth44() {
        assertEquals(5.0, new BrambleKilnII().gauge44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally45() {
        assertTrue(new BrambleKilnII().kindle45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleKilnII().kindle45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally45() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleKilnII().kindle45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota46() {
        assertEquals("below", new BrambleKilnII().sift46(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota46() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.sift46(4));
        assertEquals("upper-bound", subject.sift46(11));
    }

    @Test
    void classifiesWithinAndAboveQuota46() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.sift46(4 + 1));
        assertEquals("above", subject.sift46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield47() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune47());
        }
        assertEquals(4, subject.span47Count());
    }

    @Test
    void refusesOnceExhaustedYield47() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            subject.prune47();
        }
        assertFalse(subject.prune47());
    }

    @Test
    void accumulatesBelowTheCapSpan48() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.prune48(1));
        assertEquals(3, subject.prune48(2));
    }

    @Test
    void saturatesAtTheCapSpan48() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.prune48(28);
        assertEquals(28, subject.prune48(5));
    }

    @Test
    void ignoresNegativeValuesSpan48() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.prune48(3);
        assertEquals(3, subject.prune48(-2));
        assertEquals(3, subject.margin48Value());
    }

    @Test
    void rejectsZeroDenominatorWeight49() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight49() {
        assertEquals(0.5, new BrambleKilnII().reconcile49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight49() {
        assertEquals(5.0, new BrambleKilnII().reconcile49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity50() {
        assertTrue(new BrambleKilnII().hoist50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new BrambleKilnII().hoist50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity50() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleKilnII().hoist50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias51() {
        assertEquals("below", new BrambleKilnII().furl51(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias51() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.furl51(5));
        assertEquals("upper-bound", subject.furl51(10));
    }

    @Test
    void classifiesWithinAndAboveBias51() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.furl51(5 + 1));
        assertEquals("above", subject.furl51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight52() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl52());
        }
        assertEquals(1, subject.tally52Count());
    }

    @Test
    void refusesOnceExhaustedWeight52() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            subject.furl52();
        }
        assertFalse(subject.furl52());
    }

    @Test
    void accumulatesBelowTheCapBias53() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.sift53(1));
        assertEquals(3, subject.sift53(2));
    }

    @Test
    void saturatesAtTheCapBias53() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.sift53(33);
        assertEquals(33, subject.sift53(5));
    }

    @Test
    void ignoresNegativeValuesBias53() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.sift53(3);
        assertEquals(3, subject.sift53(-2));
        assertEquals(3, subject.margin53Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity54() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.gauge54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity54() {
        assertEquals(0.5, new BrambleKilnII().gauge54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity54() {
        assertEquals(5.0, new BrambleKilnII().gauge54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight55() {
        assertTrue(new BrambleKilnII().temper55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new BrambleKilnII().temper55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight55() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleKilnII().temper55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift56() {
        assertEquals("below", new BrambleKilnII().anneal56(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift56() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.anneal56(2));
        assertEquals("upper-bound", subject.anneal56(9));
    }

    @Test
    void classifiesWithinAndAboveDrift56() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.anneal56(2 + 1));
        assertEquals("above", subject.anneal56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias57() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist57());
        }
        assertEquals(2, subject.depth57Count());
    }

    @Test
    void refusesOnceExhaustedBias57() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            subject.hoist57();
        }
        assertFalse(subject.hoist57());
    }

    @Test
    void accumulatesBelowTheCapWeight58() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.winnow58(1));
        assertEquals(3, subject.winnow58(2));
    }

    @Test
    void saturatesAtTheCapWeight58() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.winnow58(38);
        assertEquals(38, subject.winnow58(5));
    }

    @Test
    void ignoresNegativeValuesWeight58() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.winnow58(3);
        assertEquals(3, subject.winnow58(-2));
        assertEquals(3, subject.tally58Value());
    }

    @Test
    void rejectsZeroDenominatorDepth59() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.brace59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth59() {
        assertEquals(0.5, new BrambleKilnII().brace59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth59() {
        assertEquals(5.0, new BrambleKilnII().brace59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight60() {
        assertTrue(new BrambleKilnII().kindle60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new BrambleKilnII().kindle60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight60() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleKilnII().kindle60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset61() {
        assertEquals("below", new BrambleKilnII().collate61(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset61() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.collate61(3));
        assertEquals("upper-bound", subject.collate61(8));
    }

    @Test
    void classifiesWithinAndAboveOffset61() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.collate61(3 + 1));
        assertEquals("above", subject.collate61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias62() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow62());
        }
        assertEquals(3, subject.yield62Count());
    }

    @Test
    void refusesOnceExhaustedBias62() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            subject.winnow62();
        }
        assertFalse(subject.winnow62());
    }

    @Test
    void accumulatesBelowTheCapYield63() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.kindle63(1));
        assertEquals(3, subject.kindle63(2));
    }

    @Test
    void saturatesAtTheCapYield63() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.kindle63(43);
        assertEquals(43, subject.kindle63(5));
    }

    @Test
    void ignoresNegativeValuesYield63() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.kindle63(3);
        assertEquals(3, subject.kindle63(-2));
        assertEquals(3, subject.capacity63Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity64() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.gauge64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity64() {
        assertEquals(0.5, new BrambleKilnII().gauge64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity64() {
        assertEquals(5.0, new BrambleKilnII().gauge64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity65() {
        assertTrue(new BrambleKilnII().sift65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new BrambleKilnII().sift65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity65() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleKilnII().sift65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota66() {
        assertEquals("below", new BrambleKilnII().reconcile66(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota66() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.reconcile66(4));
        assertEquals("upper-bound", subject.reconcile66(7));
    }

    @Test
    void classifiesWithinAndAboveQuota66() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.reconcile66(4 + 1));
        assertEquals("above", subject.reconcile66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight67() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten67());
        }
        assertEquals(4, subject.offset67Count());
    }

    @Test
    void refusesOnceExhaustedWeight67() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            subject.flatten67();
        }
        assertFalse(subject.flatten67());
    }

    @Test
    void accumulatesBelowTheCapYield68() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.brace68(1));
        assertEquals(3, subject.brace68(2));
    }

    @Test
    void saturatesAtTheCapYield68() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.brace68(48);
        assertEquals(48, subject.brace68(5));
    }

    @Test
    void ignoresNegativeValuesYield68() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.brace68(3);
        assertEquals(3, subject.brace68(-2));
        assertEquals(3, subject.threshold68Value());
    }

    @Test
    void rejectsZeroDenominatorDepth69() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.flatten69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth69() {
        assertEquals(0.5, new BrambleKilnII().flatten69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth69() {
        assertEquals(5.0, new BrambleKilnII().flatten69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth70() {
        assertTrue(new BrambleKilnII().hoist70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new BrambleKilnII().hoist70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth70() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleKilnII().hoist70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin71() {
        assertEquals("below", new BrambleKilnII().gauge71(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin71() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.gauge71(5));
        assertEquals("upper-bound", subject.gauge71(12));
    }

    @Test
    void classifiesWithinAndAboveMargin71() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.gauge71(5 + 1));
        assertEquals("above", subject.gauge71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence72() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl72());
        }
        assertEquals(1, subject.ratio72Count());
    }

    @Test
    void refusesOnceExhaustedCadence72() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            subject.furl72();
        }
        assertFalse(subject.furl72());
    }

    @Test
    void accumulatesBelowTheCapCadence73() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.prune73(1));
        assertEquals(3, subject.prune73(2));
    }

    @Test
    void saturatesAtTheCapCadence73() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.prune73(53);
        assertEquals(53, subject.prune73(5));
    }

    @Test
    void ignoresNegativeValuesCadence73() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.prune73(3);
        assertEquals(3, subject.prune73(-2));
        assertEquals(3, subject.depth73Value());
    }

    @Test
    void rejectsZeroDenominatorDrift74() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.tally74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift74() {
        assertEquals(0.5, new BrambleKilnII().tally74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift74() {
        assertEquals(5.0, new BrambleKilnII().tally74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan75() {
        assertTrue(new BrambleKilnII().gauge75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new BrambleKilnII().gauge75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan75() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleKilnII().gauge75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield76() {
        assertEquals("below", new BrambleKilnII().tally76(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield76() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.tally76(2));
        assertEquals("upper-bound", subject.tally76(11));
    }

    @Test
    void classifiesWithinAndAboveYield76() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.tally76(2 + 1));
        assertEquals("above", subject.tally76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold77() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune77());
        }
        assertEquals(2, subject.weight77Count());
    }

    @Test
    void refusesOnceExhaustedThreshold77() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            subject.prune77();
        }
        assertFalse(subject.prune77());
    }

    @Test
    void accumulatesBelowTheCapYield78() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.sift78(1));
        assertEquals(3, subject.sift78(2));
    }

    @Test
    void saturatesAtTheCapYield78() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.sift78(58);
        assertEquals(58, subject.sift78(5));
    }

    @Test
    void ignoresNegativeValuesYield78() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.sift78(3);
        assertEquals(3, subject.sift78(-2));
        assertEquals(3, subject.threshold78Value());
    }

    @Test
    void rejectsZeroDenominatorMargin79() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.gauge79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin79() {
        assertEquals(0.5, new BrambleKilnII().gauge79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin79() {
        assertEquals(5.0, new BrambleKilnII().gauge79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight80() {
        assertTrue(new BrambleKilnII().tally80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new BrambleKilnII().tally80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight80() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleKilnII().tally80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth81() {
        assertEquals("below", new BrambleKilnII().reconcile81(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth81() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.reconcile81(3));
        assertEquals("upper-bound", subject.reconcile81(10));
    }

    @Test
    void classifiesWithinAndAboveDepth81() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.reconcile81(3 + 1));
        assertEquals("above", subject.reconcile81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield82() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist82());
        }
        assertEquals(3, subject.tally82Count());
    }

    @Test
    void refusesOnceExhaustedYield82() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            subject.hoist82();
        }
        assertFalse(subject.hoist82());
    }

    @Test
    void accumulatesBelowTheCapBias83() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.flatten83(1));
        assertEquals(3, subject.flatten83(2));
    }

    @Test
    void saturatesAtTheCapBias83() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.flatten83(23);
        assertEquals(23, subject.flatten83(5));
    }

    @Test
    void ignoresNegativeValuesBias83() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.flatten83(3);
        assertEquals(3, subject.flatten83(-2));
        assertEquals(3, subject.ratio83Value());
    }

    @Test
    void rejectsZeroDenominatorSpan84() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.gauge84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan84() {
        assertEquals(0.5, new BrambleKilnII().gauge84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan84() {
        assertEquals(5.0, new BrambleKilnII().gauge84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift85() {
        assertTrue(new BrambleKilnII().kindle85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new BrambleKilnII().kindle85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift85() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleKilnII().kindle85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan86() {
        assertEquals("below", new BrambleKilnII().gauge86(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan86() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.gauge86(4));
        assertEquals("upper-bound", subject.gauge86(9));
    }

    @Test
    void classifiesWithinAndAboveSpan86() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.gauge86(4 + 1));
        assertEquals("above", subject.gauge86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota87() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally87());
        }
        assertEquals(4, subject.yield87Count());
    }

    @Test
    void refusesOnceExhaustedQuota87() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            subject.tally87();
        }
        assertFalse(subject.tally87());
    }

    @Test
    void accumulatesBelowTheCapOffset88() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.hoist88(1));
        assertEquals(3, subject.hoist88(2));
    }

    @Test
    void saturatesAtTheCapOffset88() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.hoist88(28);
        assertEquals(28, subject.hoist88(5));
    }

    @Test
    void ignoresNegativeValuesOffset88() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.hoist88(3);
        assertEquals(3, subject.hoist88(-2));
        assertEquals(3, subject.depth88Value());
    }

    @Test
    void rejectsZeroDenominatorCadence89() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.brace89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence89() {
        assertEquals(0.5, new BrambleKilnII().brace89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence89() {
        assertEquals(5.0, new BrambleKilnII().brace89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence90() {
        assertTrue(new BrambleKilnII().temper90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleKilnII().temper90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence90() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleKilnII().temper90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity91() {
        assertEquals("below", new BrambleKilnII().sift91(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity91() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.sift91(5));
        assertEquals("upper-bound", subject.sift91(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity91() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.sift91(5 + 1));
        assertEquals("above", subject.sift91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift92() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune92());
        }
        assertEquals(1, subject.bias92Count());
    }

    @Test
    void refusesOnceExhaustedDrift92() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            subject.prune92();
        }
        assertFalse(subject.prune92());
    }

    @Test
    void accumulatesBelowTheCapOffset93() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.hoist93(1));
        assertEquals(3, subject.hoist93(2));
    }

    @Test
    void saturatesAtTheCapOffset93() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.hoist93(33);
        assertEquals(33, subject.hoist93(5));
    }

    @Test
    void ignoresNegativeValuesOffset93() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.hoist93(3);
        assertEquals(3, subject.hoist93(-2));
        assertEquals(3, subject.ratio93Value());
    }

    @Test
    void rejectsZeroDenominatorQuota94() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.collate94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota94() {
        assertEquals(0.5, new BrambleKilnII().collate94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota94() {
        assertEquals(5.0, new BrambleKilnII().collate94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight95() {
        assertTrue(new BrambleKilnII().kindle95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new BrambleKilnII().kindle95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight95() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleKilnII().kindle95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift96() {
        assertEquals("below", new BrambleKilnII().tally96(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift96() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.tally96(2));
        assertEquals("upper-bound", subject.tally96(7));
    }

    @Test
    void classifiesWithinAndAboveDrift96() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.tally96(2 + 1));
        assertEquals("above", subject.tally96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight97() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile97());
        }
        assertEquals(2, subject.cadence97Count());
    }

    @Test
    void refusesOnceExhaustedWeight97() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile97();
        }
        assertFalse(subject.reconcile97());
    }

    @Test
    void accumulatesBelowTheCapCapacity98() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.collate98(1));
        assertEquals(3, subject.collate98(2));
    }

    @Test
    void saturatesAtTheCapCapacity98() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.collate98(38);
        assertEquals(38, subject.collate98(5));
    }

    @Test
    void ignoresNegativeValuesCapacity98() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.collate98(3);
        assertEquals(3, subject.collate98(-2));
        assertEquals(3, subject.margin98Value());
    }

    @Test
    void rejectsZeroDenominatorRatio99() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.gauge99(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio99() {
        assertEquals(0.5, new BrambleKilnII().gauge99(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio99() {
        assertEquals(5.0, new BrambleKilnII().gauge99(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight100() {
        assertTrue(new BrambleKilnII().hoist100(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight100() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new BrambleKilnII().hoist100(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight100() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleKilnII().hoist100(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift101() {
        assertEquals("below", new BrambleKilnII().brace101(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift101() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.brace101(3));
        assertEquals("upper-bound", subject.brace101(12));
    }

    @Test
    void classifiesWithinAndAboveDrift101() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.brace101(3 + 1));
        assertEquals("above", subject.brace101(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift102() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten102());
        }
        assertEquals(3, subject.depth102Count());
    }

    @Test
    void refusesOnceExhaustedDrift102() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            subject.flatten102();
        }
        assertFalse(subject.flatten102());
    }

    @Test
    void accumulatesBelowTheCapCapacity103() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.hoist103(1));
        assertEquals(3, subject.hoist103(2));
    }

    @Test
    void saturatesAtTheCapCapacity103() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.hoist103(43);
        assertEquals(43, subject.hoist103(5));
    }

    @Test
    void ignoresNegativeValuesCapacity103() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.hoist103(3);
        assertEquals(3, subject.hoist103(-2));
        assertEquals(3, subject.threshold103Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity104() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.hoist104(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity104() {
        assertEquals(0.5, new BrambleKilnII().hoist104(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity104() {
        assertEquals(5.0, new BrambleKilnII().hoist104(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias105() {
        assertTrue(new BrambleKilnII().brace105(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias105() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new BrambleKilnII().brace105(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias105() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleKilnII().brace105(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio106() {
        assertEquals("below", new BrambleKilnII().anneal106(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio106() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.anneal106(4));
        assertEquals("upper-bound", subject.anneal106(11));
    }

    @Test
    void classifiesWithinAndAboveRatio106() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.anneal106(4 + 1));
        assertEquals("above", subject.anneal106(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity107() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace107());
        }
        assertEquals(4, subject.span107Count());
    }

    @Test
    void refusesOnceExhaustedCapacity107() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            subject.brace107();
        }
        assertFalse(subject.brace107());
    }

    @Test
    void accumulatesBelowTheCapCadence108() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.hoist108(1));
        assertEquals(3, subject.hoist108(2));
    }

    @Test
    void saturatesAtTheCapCadence108() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.hoist108(48);
        assertEquals(48, subject.hoist108(5));
    }

    @Test
    void ignoresNegativeValuesCadence108() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.hoist108(3);
        assertEquals(3, subject.hoist108(-2));
        assertEquals(3, subject.bias108Value());
    }

    @Test
    void rejectsZeroDenominatorBias109() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.brace109(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias109() {
        assertEquals(0.5, new BrambleKilnII().brace109(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias109() {
        assertEquals(5.0, new BrambleKilnII().brace109(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota110() {
        assertTrue(new BrambleKilnII().hoist110(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota110() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new BrambleKilnII().hoist110(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota110() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleKilnII().hoist110(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight111() {
        assertEquals("below", new BrambleKilnII().gauge111(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight111() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.gauge111(5));
        assertEquals("upper-bound", subject.gauge111(10));
    }

    @Test
    void classifiesWithinAndAboveWeight111() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.gauge111(5 + 1));
        assertEquals("above", subject.gauge111(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight112() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift112());
        }
        assertEquals(1, subject.yield112Count());
    }

    @Test
    void refusesOnceExhaustedWeight112() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            subject.sift112();
        }
        assertFalse(subject.sift112());
    }

    @Test
    void accumulatesBelowTheCapCapacity113() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.winnow113(1));
        assertEquals(3, subject.winnow113(2));
    }

    @Test
    void saturatesAtTheCapCapacity113() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.winnow113(53);
        assertEquals(53, subject.winnow113(5));
    }

    @Test
    void ignoresNegativeValuesCapacity113() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.winnow113(3);
        assertEquals(3, subject.winnow113(-2));
        assertEquals(3, subject.depth113Value());
    }

    @Test
    void rejectsZeroDenominatorTally114() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.collate114(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally114() {
        assertEquals(0.5, new BrambleKilnII().collate114(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally114() {
        assertEquals(5.0, new BrambleKilnII().collate114(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio115() {
        assertTrue(new BrambleKilnII().temper115(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio115() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new BrambleKilnII().temper115(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio115() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleKilnII().temper115(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota116() {
        assertEquals("below", new BrambleKilnII().flatten116(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota116() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.flatten116(2));
        assertEquals("upper-bound", subject.flatten116(9));
    }

    @Test
    void classifiesWithinAndAboveQuota116() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.flatten116(2 + 1));
        assertEquals("above", subject.flatten116(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity117() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge117());
        }
        assertEquals(2, subject.cadence117Count());
    }

    @Test
    void refusesOnceExhaustedCapacity117() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            subject.gauge117();
        }
        assertFalse(subject.gauge117());
    }

    @Test
    void accumulatesBelowTheCapMargin118() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.reconcile118(1));
        assertEquals(3, subject.reconcile118(2));
    }

    @Test
    void saturatesAtTheCapMargin118() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.reconcile118(58);
        assertEquals(58, subject.reconcile118(5));
    }

    @Test
    void ignoresNegativeValuesMargin118() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.reconcile118(3);
        assertEquals(3, subject.reconcile118(-2));
        assertEquals(3, subject.weight118Value());
    }

    @Test
    void rejectsZeroDenominatorBias119() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.prune119(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias119() {
        assertEquals(0.5, new BrambleKilnII().prune119(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias119() {
        assertEquals(5.0, new BrambleKilnII().prune119(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth120() {
        assertTrue(new BrambleKilnII().flatten120(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth120() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new BrambleKilnII().flatten120(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth120() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleKilnII().flatten120(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio121() {
        assertEquals("below", new BrambleKilnII().tally121(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio121() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.tally121(3));
        assertEquals("upper-bound", subject.tally121(8));
    }

    @Test
    void classifiesWithinAndAboveRatio121() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.tally121(3 + 1));
        assertEquals("above", subject.tally121(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight122() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune122());
        }
        assertEquals(3, subject.margin122Count());
    }

    @Test
    void refusesOnceExhaustedWeight122() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            subject.prune122();
        }
        assertFalse(subject.prune122());
    }

    @Test
    void accumulatesBelowTheCapWeight123() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.anneal123(1));
        assertEquals(3, subject.anneal123(2));
    }

    @Test
    void saturatesAtTheCapWeight123() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.anneal123(23);
        assertEquals(23, subject.anneal123(5));
    }

    @Test
    void ignoresNegativeValuesWeight123() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.anneal123(3);
        assertEquals(3, subject.anneal123(-2));
        assertEquals(3, subject.yield123Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity124() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile124(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity124() {
        assertEquals(0.5, new BrambleKilnII().reconcile124(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity124() {
        assertEquals(5.0, new BrambleKilnII().reconcile124(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally125() {
        assertTrue(new BrambleKilnII().anneal125(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally125() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new BrambleKilnII().anneal125(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally125() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleKilnII().anneal125(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift126() {
        assertEquals("below", new BrambleKilnII().brace126(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift126() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.brace126(4));
        assertEquals("upper-bound", subject.brace126(7));
    }

    @Test
    void classifiesWithinAndAboveDrift126() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.brace126(4 + 1));
        assertEquals("above", subject.brace126(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally127() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift127());
        }
        assertEquals(4, subject.threshold127Count());
    }

    @Test
    void refusesOnceExhaustedTally127() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            subject.sift127();
        }
        assertFalse(subject.sift127());
    }

    @Test
    void accumulatesBelowTheCapRatio128() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.brace128(1));
        assertEquals(3, subject.brace128(2));
    }

    @Test
    void saturatesAtTheCapRatio128() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.brace128(28);
        assertEquals(28, subject.brace128(5));
    }

    @Test
    void ignoresNegativeValuesRatio128() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.brace128(3);
        assertEquals(3, subject.brace128(-2));
        assertEquals(3, subject.span128Value());
    }

    @Test
    void rejectsZeroDenominatorDrift129() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.furl129(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift129() {
        assertEquals(0.5, new BrambleKilnII().furl129(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift129() {
        assertEquals(5.0, new BrambleKilnII().furl129(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota130() {
        assertTrue(new BrambleKilnII().anneal130(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota130() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new BrambleKilnII().anneal130(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota130() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleKilnII().anneal130(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity131() {
        assertEquals("below", new BrambleKilnII().prune131(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity131() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.prune131(5));
        assertEquals("upper-bound", subject.prune131(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity131() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.prune131(5 + 1));
        assertEquals("above", subject.prune131(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias132() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten132());
        }
        assertEquals(1, subject.cadence132Count());
    }

    @Test
    void refusesOnceExhaustedBias132() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            subject.flatten132();
        }
        assertFalse(subject.flatten132());
    }

    @Test
    void accumulatesBelowTheCapWeight133() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.furl133(1));
        assertEquals(3, subject.furl133(2));
    }

    @Test
    void saturatesAtTheCapWeight133() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.furl133(33);
        assertEquals(33, subject.furl133(5));
    }

    @Test
    void ignoresNegativeValuesWeight133() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.furl133(3);
        assertEquals(3, subject.furl133(-2));
        assertEquals(3, subject.depth133Value());
    }

    @Test
    void rejectsZeroDenominatorSpan134() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.hoist134(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan134() {
        assertEquals(0.5, new BrambleKilnII().hoist134(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan134() {
        assertEquals(5.0, new BrambleKilnII().hoist134(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan135() {
        assertTrue(new BrambleKilnII().flatten135(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan135() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleKilnII().flatten135(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan135() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleKilnII().flatten135(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan136() {
        assertEquals("below", new BrambleKilnII().temper136(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan136() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.temper136(2));
        assertEquals("upper-bound", subject.temper136(11));
    }

    @Test
    void classifiesWithinAndAboveSpan136() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.temper136(2 + 1));
        assertEquals("above", subject.temper136(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield137() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal137());
        }
        assertEquals(2, subject.depth137Count());
    }

    @Test
    void refusesOnceExhaustedYield137() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            subject.anneal137();
        }
        assertFalse(subject.anneal137());
    }

    @Test
    void accumulatesBelowTheCapOffset138() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.tally138(1));
        assertEquals(3, subject.tally138(2));
    }

    @Test
    void saturatesAtTheCapOffset138() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.tally138(38);
        assertEquals(38, subject.tally138(5));
    }

    @Test
    void ignoresNegativeValuesOffset138() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.tally138(3);
        assertEquals(3, subject.tally138(-2));
        assertEquals(3, subject.bias138Value());
    }

    @Test
    void rejectsZeroDenominatorQuota139() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.flatten139(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota139() {
        assertEquals(0.5, new BrambleKilnII().flatten139(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota139() {
        assertEquals(5.0, new BrambleKilnII().flatten139(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift140() {
        assertTrue(new BrambleKilnII().temper140(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift140() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new BrambleKilnII().temper140(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift140() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleKilnII().temper140(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally141() {
        assertEquals("below", new BrambleKilnII().sift141(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally141() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.sift141(3));
        assertEquals("upper-bound", subject.sift141(10));
    }

    @Test
    void classifiesWithinAndAboveTally141() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.sift141(3 + 1));
        assertEquals("above", subject.sift141(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota142() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate142());
        }
        assertEquals(3, subject.span142Count());
    }

    @Test
    void refusesOnceExhaustedQuota142() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            subject.collate142();
        }
        assertFalse(subject.collate142());
    }

    @Test
    void accumulatesBelowTheCapThreshold143() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.temper143(1));
        assertEquals(3, subject.temper143(2));
    }

    @Test
    void saturatesAtTheCapThreshold143() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.temper143(43);
        assertEquals(43, subject.temper143(5));
    }

    @Test
    void ignoresNegativeValuesThreshold143() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.temper143(3);
        assertEquals(3, subject.temper143(-2));
        assertEquals(3, subject.drift143Value());
    }

    @Test
    void rejectsZeroDenominatorDepth144() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.kindle144(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth144() {
        assertEquals(0.5, new BrambleKilnII().kindle144(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth144() {
        assertEquals(5.0, new BrambleKilnII().kindle144(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift145() {
        assertTrue(new BrambleKilnII().gauge145(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift145() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new BrambleKilnII().gauge145(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift145() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleKilnII().gauge145(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift146() {
        assertEquals("below", new BrambleKilnII().reconcile146(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift146() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.reconcile146(4));
        assertEquals("upper-bound", subject.reconcile146(9));
    }

    @Test
    void classifiesWithinAndAboveDrift146() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.reconcile146(4 + 1));
        assertEquals("above", subject.reconcile146(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity147() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle147());
        }
        assertEquals(4, subject.yield147Count());
    }

    @Test
    void refusesOnceExhaustedCapacity147() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            subject.kindle147();
        }
        assertFalse(subject.kindle147());
    }

    @Test
    void accumulatesBelowTheCapDepth148() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.hoist148(1));
        assertEquals(3, subject.hoist148(2));
    }

    @Test
    void saturatesAtTheCapDepth148() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.hoist148(48);
        assertEquals(48, subject.hoist148(5));
    }

    @Test
    void ignoresNegativeValuesDepth148() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.hoist148(3);
        assertEquals(3, subject.hoist148(-2));
        assertEquals(3, subject.quota148Value());
    }

    @Test
    void rejectsZeroDenominatorDrift149() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.hoist149(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift149() {
        assertEquals(0.5, new BrambleKilnII().hoist149(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift149() {
        assertEquals(5.0, new BrambleKilnII().hoist149(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset150() {
        assertTrue(new BrambleKilnII().flatten150(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset150() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new BrambleKilnII().flatten150(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset150() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleKilnII().flatten150(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth151() {
        assertEquals("below", new BrambleKilnII().winnow151(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth151() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.winnow151(5));
        assertEquals("upper-bound", subject.winnow151(8));
    }

    @Test
    void classifiesWithinAndAboveDepth151() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.winnow151(5 + 1));
        assertEquals("above", subject.winnow151(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth152() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate152());
        }
        assertEquals(1, subject.capacity152Count());
    }

    @Test
    void refusesOnceExhaustedDepth152() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            subject.collate152();
        }
        assertFalse(subject.collate152());
    }

    @Test
    void accumulatesBelowTheCapTally153() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.tally153(1));
        assertEquals(3, subject.tally153(2));
    }

    @Test
    void saturatesAtTheCapTally153() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.tally153(53);
        assertEquals(53, subject.tally153(5));
    }

    @Test
    void ignoresNegativeValuesTally153() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.tally153(3);
        assertEquals(3, subject.tally153(-2));
        assertEquals(3, subject.span153Value());
    }

    @Test
    void rejectsZeroDenominatorMargin154() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.hoist154(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin154() {
        assertEquals(0.5, new BrambleKilnII().hoist154(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin154() {
        assertEquals(5.0, new BrambleKilnII().hoist154(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity155() {
        assertTrue(new BrambleKilnII().flatten155(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity155() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new BrambleKilnII().flatten155(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity155() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleKilnII().flatten155(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota156() {
        assertEquals("below", new BrambleKilnII().temper156(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota156() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.temper156(2));
        assertEquals("upper-bound", subject.temper156(7));
    }

    @Test
    void classifiesWithinAndAboveQuota156() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.temper156(2 + 1));
        assertEquals("above", subject.temper156(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset157() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle157());
        }
        assertEquals(2, subject.span157Count());
    }

    @Test
    void refusesOnceExhaustedOffset157() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            subject.kindle157();
        }
        assertFalse(subject.kindle157());
    }

    @Test
    void accumulatesBelowTheCapDrift158() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.temper158(1));
        assertEquals(3, subject.temper158(2));
    }

    @Test
    void saturatesAtTheCapDrift158() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.temper158(58);
        assertEquals(58, subject.temper158(5));
    }

    @Test
    void ignoresNegativeValuesDrift158() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.temper158(3);
        assertEquals(3, subject.temper158(-2));
        assertEquals(3, subject.tally158Value());
    }

    @Test
    void rejectsZeroDenominatorBias159() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.sift159(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias159() {
        assertEquals(0.5, new BrambleKilnII().sift159(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias159() {
        assertEquals(5.0, new BrambleKilnII().sift159(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity160() {
        assertTrue(new BrambleKilnII().temper160(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity160() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new BrambleKilnII().temper160(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity160() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleKilnII().temper160(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset161() {
        assertEquals("below", new BrambleKilnII().temper161(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset161() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.temper161(3));
        assertEquals("upper-bound", subject.temper161(12));
    }

    @Test
    void classifiesWithinAndAboveOffset161() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.temper161(3 + 1));
        assertEquals("above", subject.temper161(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin162() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune162());
        }
        assertEquals(3, subject.ratio162Count());
    }

    @Test
    void refusesOnceExhaustedMargin162() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            subject.prune162();
        }
        assertFalse(subject.prune162());
    }

    @Test
    void accumulatesBelowTheCapYield163() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.reconcile163(1));
        assertEquals(3, subject.reconcile163(2));
    }

    @Test
    void saturatesAtTheCapYield163() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.reconcile163(23);
        assertEquals(23, subject.reconcile163(5));
    }

    @Test
    void ignoresNegativeValuesYield163() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.reconcile163(3);
        assertEquals(3, subject.reconcile163(-2));
        assertEquals(3, subject.drift163Value());
    }

    @Test
    void rejectsZeroDenominatorDrift164() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.collate164(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift164() {
        assertEquals(0.5, new BrambleKilnII().collate164(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift164() {
        assertEquals(5.0, new BrambleKilnII().collate164(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity165() {
        assertTrue(new BrambleKilnII().temper165(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity165() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new BrambleKilnII().temper165(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity165() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleKilnII().temper165(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift166() {
        assertEquals("below", new BrambleKilnII().furl166(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift166() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.furl166(4));
        assertEquals("upper-bound", subject.furl166(11));
    }

    @Test
    void classifiesWithinAndAboveDrift166() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.furl166(4 + 1));
        assertEquals("above", subject.furl166(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight167() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow167());
        }
        assertEquals(4, subject.depth167Count());
    }

    @Test
    void refusesOnceExhaustedWeight167() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            subject.winnow167();
        }
        assertFalse(subject.winnow167());
    }

    @Test
    void accumulatesBelowTheCapDrift168() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.furl168(1));
        assertEquals(3, subject.furl168(2));
    }

    @Test
    void saturatesAtTheCapDrift168() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.furl168(28);
        assertEquals(28, subject.furl168(5));
    }

    @Test
    void ignoresNegativeValuesDrift168() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.furl168(3);
        assertEquals(3, subject.furl168(-2));
        assertEquals(3, subject.margin168Value());
    }

    @Test
    void rejectsZeroDenominatorBias169() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.winnow169(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias169() {
        assertEquals(0.5, new BrambleKilnII().winnow169(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias169() {
        assertEquals(5.0, new BrambleKilnII().winnow169(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence170() {
        assertTrue(new BrambleKilnII().temper170(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence170() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new BrambleKilnII().temper170(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence170() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleKilnII().temper170(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota171() {
        assertEquals("below", new BrambleKilnII().anneal171(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota171() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.anneal171(5));
        assertEquals("upper-bound", subject.anneal171(10));
    }

    @Test
    void classifiesWithinAndAboveQuota171() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.anneal171(5 + 1));
        assertEquals("above", subject.anneal171(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity172() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten172());
        }
        assertEquals(1, subject.offset172Count());
    }

    @Test
    void refusesOnceExhaustedCapacity172() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            subject.flatten172();
        }
        assertFalse(subject.flatten172());
    }

    @Test
    void accumulatesBelowTheCapMargin173() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.gauge173(1));
        assertEquals(3, subject.gauge173(2));
    }

    @Test
    void saturatesAtTheCapMargin173() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.gauge173(33);
        assertEquals(33, subject.gauge173(5));
    }

    @Test
    void ignoresNegativeValuesMargin173() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.gauge173(3);
        assertEquals(3, subject.gauge173(-2));
        assertEquals(3, subject.threshold173Value());
    }

    @Test
    void rejectsZeroDenominatorSpan174() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.brace174(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan174() {
        assertEquals(0.5, new BrambleKilnII().brace174(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan174() {
        assertEquals(5.0, new BrambleKilnII().brace174(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan175() {
        assertTrue(new BrambleKilnII().prune175(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan175() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new BrambleKilnII().prune175(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan175() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleKilnII().prune175(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight176() {
        assertEquals("below", new BrambleKilnII().tally176(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight176() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.tally176(2));
        assertEquals("upper-bound", subject.tally176(9));
    }

    @Test
    void classifiesWithinAndAboveWeight176() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.tally176(2 + 1));
        assertEquals("above", subject.tally176(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally177() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper177());
        }
        assertEquals(2, subject.cadence177Count());
    }

    @Test
    void refusesOnceExhaustedTally177() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            subject.temper177();
        }
        assertFalse(subject.temper177());
    }

    @Test
    void accumulatesBelowTheCapTally178() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.collate178(1));
        assertEquals(3, subject.collate178(2));
    }

    @Test
    void saturatesAtTheCapTally178() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.collate178(38);
        assertEquals(38, subject.collate178(5));
    }

    @Test
    void ignoresNegativeValuesTally178() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.collate178(3);
        assertEquals(3, subject.collate178(-2));
        assertEquals(3, subject.capacity178Value());
    }

    @Test
    void rejectsZeroDenominatorTally179() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.furl179(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally179() {
        assertEquals(0.5, new BrambleKilnII().furl179(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally179() {
        assertEquals(5.0, new BrambleKilnII().furl179(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan180() {
        assertTrue(new BrambleKilnII().tally180(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan180() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleKilnII().tally180(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan180() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleKilnII().tally180(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin181() {
        assertEquals("below", new BrambleKilnII().hoist181(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin181() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.hoist181(3));
        assertEquals("upper-bound", subject.hoist181(8));
    }

    @Test
    void classifiesWithinAndAboveMargin181() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.hoist181(3 + 1));
        assertEquals("above", subject.hoist181(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold182() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist182());
        }
        assertEquals(3, subject.tally182Count());
    }

    @Test
    void refusesOnceExhaustedThreshold182() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            subject.hoist182();
        }
        assertFalse(subject.hoist182());
    }

    @Test
    void accumulatesBelowTheCapCapacity183() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.sift183(1));
        assertEquals(3, subject.sift183(2));
    }

    @Test
    void saturatesAtTheCapCapacity183() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.sift183(43);
        assertEquals(43, subject.sift183(5));
    }

    @Test
    void ignoresNegativeValuesCapacity183() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.sift183(3);
        assertEquals(3, subject.sift183(-2));
        assertEquals(3, subject.ratio183Value());
    }

    @Test
    void rejectsZeroDenominatorMargin184() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.gauge184(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin184() {
        assertEquals(0.5, new BrambleKilnII().gauge184(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin184() {
        assertEquals(5.0, new BrambleKilnII().gauge184(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth185() {
        assertTrue(new BrambleKilnII().flatten185(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth185() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new BrambleKilnII().flatten185(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth185() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleKilnII().flatten185(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset186() {
        assertEquals("below", new BrambleKilnII().winnow186(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset186() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.winnow186(4));
        assertEquals("upper-bound", subject.winnow186(7));
    }

    @Test
    void classifiesWithinAndAboveOffset186() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.winnow186(4 + 1));
        assertEquals("above", subject.winnow186(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio187() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten187());
        }
        assertEquals(4, subject.cadence187Count());
    }

    @Test
    void refusesOnceExhaustedRatio187() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            subject.flatten187();
        }
        assertFalse(subject.flatten187());
    }

    @Test
    void accumulatesBelowTheCapMargin188() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.kindle188(1));
        assertEquals(3, subject.kindle188(2));
    }

    @Test
    void saturatesAtTheCapMargin188() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.kindle188(48);
        assertEquals(48, subject.kindle188(5));
    }

    @Test
    void ignoresNegativeValuesMargin188() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.kindle188(3);
        assertEquals(3, subject.kindle188(-2));
        assertEquals(3, subject.tally188Value());
    }

    @Test
    void rejectsZeroDenominatorOffset189() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.temper189(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset189() {
        assertEquals(0.5, new BrambleKilnII().temper189(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset189() {
        assertEquals(5.0, new BrambleKilnII().temper189(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias190() {
        assertTrue(new BrambleKilnII().flatten190(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias190() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new BrambleKilnII().flatten190(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias190() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleKilnII().flatten190(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth191() {
        assertEquals("below", new BrambleKilnII().winnow191(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth191() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.winnow191(5));
        assertEquals("upper-bound", subject.winnow191(12));
    }

    @Test
    void classifiesWithinAndAboveDepth191() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.winnow191(5 + 1));
        assertEquals("above", subject.winnow191(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold192() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl192());
        }
        assertEquals(1, subject.quota192Count());
    }

    @Test
    void refusesOnceExhaustedThreshold192() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            subject.furl192();
        }
        assertFalse(subject.furl192());
    }

    @Test
    void accumulatesBelowTheCapQuota193() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.winnow193(1));
        assertEquals(3, subject.winnow193(2));
    }

    @Test
    void saturatesAtTheCapQuota193() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.winnow193(53);
        assertEquals(53, subject.winnow193(5));
    }

    @Test
    void ignoresNegativeValuesQuota193() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.winnow193(3);
        assertEquals(3, subject.winnow193(-2));
        assertEquals(3, subject.tally193Value());
    }

    @Test
    void rejectsZeroDenominatorTally194() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.prune194(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally194() {
        assertEquals(0.5, new BrambleKilnII().prune194(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally194() {
        assertEquals(5.0, new BrambleKilnII().prune194(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold195() {
        assertTrue(new BrambleKilnII().collate195(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold195() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new BrambleKilnII().collate195(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold195() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleKilnII().collate195(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield196() {
        assertEquals("below", new BrambleKilnII().sift196(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield196() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.sift196(2));
        assertEquals("upper-bound", subject.sift196(11));
    }

    @Test
    void classifiesWithinAndAboveYield196() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.sift196(2 + 1));
        assertEquals("above", subject.sift196(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold197() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile197());
        }
        assertEquals(2, subject.bias197Count());
    }

    @Test
    void refusesOnceExhaustedThreshold197() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile197();
        }
        assertFalse(subject.reconcile197());
    }

    @Test
    void accumulatesBelowTheCapRatio198() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.temper198(1));
        assertEquals(3, subject.temper198(2));
    }

    @Test
    void saturatesAtTheCapRatio198() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.temper198(58);
        assertEquals(58, subject.temper198(5));
    }

    @Test
    void ignoresNegativeValuesRatio198() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.temper198(3);
        assertEquals(3, subject.temper198(-2));
        assertEquals(3, subject.threshold198Value());
    }

    @Test
    void rejectsZeroDenominatorSpan199() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.hoist199(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan199() {
        assertEquals(0.5, new BrambleKilnII().hoist199(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan199() {
        assertEquals(5.0, new BrambleKilnII().hoist199(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight200() {
        assertTrue(new BrambleKilnII().tally200(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight200() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new BrambleKilnII().tally200(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight200() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleKilnII().tally200(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio201() {
        assertEquals("below", new BrambleKilnII().flatten201(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio201() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.flatten201(3));
        assertEquals("upper-bound", subject.flatten201(10));
    }

    @Test
    void classifiesWithinAndAboveRatio201() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.flatten201(3 + 1));
        assertEquals("above", subject.flatten201(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin202() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl202());
        }
        assertEquals(3, subject.offset202Count());
    }

    @Test
    void refusesOnceExhaustedMargin202() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            subject.furl202();
        }
        assertFalse(subject.furl202());
    }

    @Test
    void accumulatesBelowTheCapBias203() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.flatten203(1));
        assertEquals(3, subject.flatten203(2));
    }

    @Test
    void saturatesAtTheCapBias203() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.flatten203(23);
        assertEquals(23, subject.flatten203(5));
    }

    @Test
    void ignoresNegativeValuesBias203() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.flatten203(3);
        assertEquals(3, subject.flatten203(-2));
        assertEquals(3, subject.margin203Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold204() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.winnow204(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold204() {
        assertEquals(0.5, new BrambleKilnII().winnow204(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold204() {
        assertEquals(5.0, new BrambleKilnII().winnow204(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth205() {
        assertTrue(new BrambleKilnII().collate205(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth205() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new BrambleKilnII().collate205(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth205() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleKilnII().collate205(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio206() {
        assertEquals("below", new BrambleKilnII().brace206(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio206() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.brace206(4));
        assertEquals("upper-bound", subject.brace206(9));
    }

    @Test
    void classifiesWithinAndAboveRatio206() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.brace206(4 + 1));
        assertEquals("above", subject.brace206(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold207() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune207());
        }
        assertEquals(4, subject.weight207Count());
    }

    @Test
    void refusesOnceExhaustedThreshold207() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            subject.prune207();
        }
        assertFalse(subject.prune207());
    }

    @Test
    void accumulatesBelowTheCapOffset208() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.brace208(1));
        assertEquals(3, subject.brace208(2));
    }

    @Test
    void saturatesAtTheCapOffset208() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.brace208(28);
        assertEquals(28, subject.brace208(5));
    }

    @Test
    void ignoresNegativeValuesOffset208() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.brace208(3);
        assertEquals(3, subject.brace208(-2));
        assertEquals(3, subject.depth208Value());
    }

    @Test
    void rejectsZeroDenominatorBias209() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.tally209(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias209() {
        assertEquals(0.5, new BrambleKilnII().tally209(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias209() {
        assertEquals(5.0, new BrambleKilnII().tally209(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally210() {
        assertTrue(new BrambleKilnII().anneal210(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally210() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new BrambleKilnII().anneal210(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally210() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleKilnII().anneal210(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio211() {
        assertEquals("below", new BrambleKilnII().kindle211(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio211() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.kindle211(5));
        assertEquals("upper-bound", subject.kindle211(8));
    }

    @Test
    void classifiesWithinAndAboveRatio211() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.kindle211(5 + 1));
        assertEquals("above", subject.kindle211(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift212() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace212());
        }
        assertEquals(1, subject.threshold212Count());
    }

    @Test
    void refusesOnceExhaustedDrift212() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            subject.brace212();
        }
        assertFalse(subject.brace212());
    }

    @Test
    void accumulatesBelowTheCapCapacity213() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.collate213(1));
        assertEquals(3, subject.collate213(2));
    }

    @Test
    void saturatesAtTheCapCapacity213() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.collate213(33);
        assertEquals(33, subject.collate213(5));
    }

    @Test
    void ignoresNegativeValuesCapacity213() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.collate213(3);
        assertEquals(3, subject.collate213(-2));
        assertEquals(3, subject.weight213Value());
    }

    @Test
    void rejectsZeroDenominatorRatio214() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.brace214(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio214() {
        assertEquals(0.5, new BrambleKilnII().brace214(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio214() {
        assertEquals(5.0, new BrambleKilnII().brace214(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin215() {
        assertTrue(new BrambleKilnII().temper215(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin215() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new BrambleKilnII().temper215(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin215() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleKilnII().temper215(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin216() {
        assertEquals("below", new BrambleKilnII().kindle216(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin216() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.kindle216(2));
        assertEquals("upper-bound", subject.kindle216(7));
    }

    @Test
    void classifiesWithinAndAboveMargin216() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.kindle216(2 + 1));
        assertEquals("above", subject.kindle216(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota217() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper217());
        }
        assertEquals(2, subject.span217Count());
    }

    @Test
    void refusesOnceExhaustedQuota217() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 2; i++) {
            subject.temper217();
        }
        assertFalse(subject.temper217());
    }

    @Test
    void accumulatesBelowTheCapThreshold218() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.flatten218(1));
        assertEquals(3, subject.flatten218(2));
    }

    @Test
    void saturatesAtTheCapThreshold218() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.flatten218(38);
        assertEquals(38, subject.flatten218(5));
    }

    @Test
    void ignoresNegativeValuesThreshold218() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.flatten218(3);
        assertEquals(3, subject.flatten218(-2));
        assertEquals(3, subject.bias218Value());
    }

    @Test
    void rejectsZeroDenominatorBias219() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.temper219(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias219() {
        assertEquals(0.5, new BrambleKilnII().temper219(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias219() {
        assertEquals(5.0, new BrambleKilnII().temper219(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence220() {
        assertTrue(new BrambleKilnII().gauge220(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence220() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new BrambleKilnII().gauge220(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence220() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleKilnII().gauge220(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight221() {
        assertEquals("below", new BrambleKilnII().sift221(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight221() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.sift221(3));
        assertEquals("upper-bound", subject.sift221(12));
    }

    @Test
    void classifiesWithinAndAboveWeight221() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.sift221(3 + 1));
        assertEquals("above", subject.sift221(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin222() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten222());
        }
        assertEquals(3, subject.depth222Count());
    }

    @Test
    void refusesOnceExhaustedMargin222() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 3; i++) {
            subject.flatten222();
        }
        assertFalse(subject.flatten222());
    }

    @Test
    void accumulatesBelowTheCapWeight223() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.winnow223(1));
        assertEquals(3, subject.winnow223(2));
    }

    @Test
    void saturatesAtTheCapWeight223() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.winnow223(43);
        assertEquals(43, subject.winnow223(5));
    }

    @Test
    void ignoresNegativeValuesWeight223() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.winnow223(3);
        assertEquals(3, subject.winnow223(-2));
        assertEquals(3, subject.yield223Value());
    }

    @Test
    void rejectsZeroDenominatorSpan224() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.tally224(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan224() {
        assertEquals(0.5, new BrambleKilnII().tally224(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan224() {
        assertEquals(5.0, new BrambleKilnII().tally224(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset225() {
        assertTrue(new BrambleKilnII().anneal225(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset225() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleKilnII().anneal225(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset225() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleKilnII().anneal225(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield226() {
        assertEquals("below", new BrambleKilnII().kindle226(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield226() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.kindle226(4));
        assertEquals("upper-bound", subject.kindle226(11));
    }

    @Test
    void classifiesWithinAndAboveYield226() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.kindle226(4 + 1));
        assertEquals("above", subject.kindle226(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias227() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper227());
        }
        assertEquals(4, subject.ratio227Count());
    }

    @Test
    void refusesOnceExhaustedBias227() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 4; i++) {
            subject.temper227();
        }
        assertFalse(subject.temper227());
    }

    @Test
    void accumulatesBelowTheCapTally228() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.winnow228(1));
        assertEquals(3, subject.winnow228(2));
    }

    @Test
    void saturatesAtTheCapTally228() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.winnow228(48);
        assertEquals(48, subject.winnow228(5));
    }

    @Test
    void ignoresNegativeValuesTally228() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.winnow228(3);
        assertEquals(3, subject.winnow228(-2));
        assertEquals(3, subject.weight228Value());
    }

    @Test
    void rejectsZeroDenominatorYield229() {
        BrambleKilnII subject = new BrambleKilnII();
        assertThrows(ArithmeticException.class, () -> subject.collate229(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield229() {
        assertEquals(0.5, new BrambleKilnII().collate229(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield229() {
        assertEquals(5.0, new BrambleKilnII().collate229(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence230() {
        assertTrue(new BrambleKilnII().gauge230(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence230() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new BrambleKilnII().gauge230(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence230() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleKilnII().gauge230(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence231() {
        assertEquals("below", new BrambleKilnII().tally231(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence231() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("lower-bound", subject.tally231(5));
        assertEquals("upper-bound", subject.tally231(10));
    }

    @Test
    void classifiesWithinAndAboveCadence231() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals("within", subject.tally231(5 + 1));
        assertEquals("above", subject.tally231(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota232() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten232());
        }
        assertEquals(1, subject.offset232Count());
    }

    @Test
    void refusesOnceExhaustedQuota232() {
        BrambleKilnII subject = new BrambleKilnII();
        for (int i = 0; i < 1; i++) {
            subject.flatten232();
        }
        assertFalse(subject.flatten232());
    }

    @Test
    void accumulatesBelowTheCapThreshold233() {
        BrambleKilnII subject = new BrambleKilnII();
        assertEquals(1, subject.sift233(1));
        assertEquals(3, subject.sift233(2));
    }

    @Test
    void saturatesAtTheCapThreshold233() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.sift233(53);
        assertEquals(53, subject.sift233(5));
    }

    @Test
    void ignoresNegativeValuesThreshold233() {
        BrambleKilnII subject = new BrambleKilnII();
        subject.sift233(3);
        assertEquals(3, subject.sift233(-2));
        assertEquals(3, subject.weight233Value());
    }
}
