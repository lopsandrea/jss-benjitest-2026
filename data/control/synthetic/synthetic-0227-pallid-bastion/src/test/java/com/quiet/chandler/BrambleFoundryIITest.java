package com.quiet.chandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleFoundryIITest {

    @Test
    void returnsEmptyForNullQuota0() {
        assertTrue(new BrambleFoundryII().winnow0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleFoundryII().winnow0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota0() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleFoundryII().winnow0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset1() {
        assertEquals("below", new BrambleFoundryII().temper1(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset1() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("lower-bound", subject.temper1(3));
        assertEquals("upper-bound", subject.temper1(8));
    }

    @Test
    void classifiesWithinAndAboveOffset1() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("within", subject.temper1(3 + 1));
        assertEquals("above", subject.temper1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio2() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal2());
        }
        assertEquals(3, subject.offset2Count());
    }

    @Test
    void refusesOnceExhaustedRatio2() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 3; i++) {
            subject.anneal2();
        }
        assertFalse(subject.anneal2());
    }

    @Test
    void accumulatesBelowTheCapThreshold3() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals(1, subject.winnow3(1));
        assertEquals(3, subject.winnow3(2));
    }

    @Test
    void saturatesAtTheCapThreshold3() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.winnow3(23);
        assertEquals(23, subject.winnow3(5));
    }

    @Test
    void ignoresNegativeValuesThreshold3() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.winnow3(3);
        assertEquals(3, subject.winnow3(-2));
        assertEquals(3, subject.offset3Value());
    }

    @Test
    void rejectsZeroDenominatorDrift4() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.prune4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift4() {
        assertEquals(0.5, new BrambleFoundryII().prune4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift4() {
        assertEquals(5.0, new BrambleFoundryII().prune4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold5() {
        assertTrue(new BrambleFoundryII().brace5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new BrambleFoundryII().brace5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold5() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleFoundryII().brace5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield6() {
        assertEquals("below", new BrambleFoundryII().prune6(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield6() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("lower-bound", subject.prune6(4));
        assertEquals("upper-bound", subject.prune6(7));
    }

    @Test
    void classifiesWithinAndAboveYield6() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("within", subject.prune6(4 + 1));
        assertEquals("above", subject.prune6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset7() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten7());
        }
        assertEquals(4, subject.span7Count());
    }

    @Test
    void refusesOnceExhaustedOffset7() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 4; i++) {
            subject.flatten7();
        }
        assertFalse(subject.flatten7());
    }

    @Test
    void accumulatesBelowTheCapBias8() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals(1, subject.collate8(1));
        assertEquals(3, subject.collate8(2));
    }

    @Test
    void saturatesAtTheCapBias8() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.collate8(28);
        assertEquals(28, subject.collate8(5));
    }

    @Test
    void ignoresNegativeValuesBias8() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.collate8(3);
        assertEquals(3, subject.collate8(-2));
        assertEquals(3, subject.depth8Value());
    }

    @Test
    void rejectsZeroDenominatorDrift9() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift9() {
        assertEquals(0.5, new BrambleFoundryII().hoist9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift9() {
        assertEquals(5.0, new BrambleFoundryII().hoist9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota10() {
        assertTrue(new BrambleFoundryII().furl10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new BrambleFoundryII().furl10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota10() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleFoundryII().furl10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield11() {
        assertEquals("below", new BrambleFoundryII().sift11(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield11() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("lower-bound", subject.sift11(5));
        assertEquals("upper-bound", subject.sift11(12));
    }

    @Test
    void classifiesWithinAndAboveYield11() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("within", subject.sift11(5 + 1));
        assertEquals("above", subject.sift11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield12() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl12());
        }
        assertEquals(1, subject.offset12Count());
    }

    @Test
    void refusesOnceExhaustedYield12() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 1; i++) {
            subject.furl12();
        }
        assertFalse(subject.furl12());
    }

    @Test
    void accumulatesBelowTheCapRatio13() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals(1, subject.tally13(1));
        assertEquals(3, subject.tally13(2));
    }

    @Test
    void saturatesAtTheCapRatio13() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.tally13(33);
        assertEquals(33, subject.tally13(5));
    }

    @Test
    void ignoresNegativeValuesRatio13() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.tally13(3);
        assertEquals(3, subject.tally13(-2));
        assertEquals(3, subject.threshold13Value());
    }

    @Test
    void rejectsZeroDenominatorCadence14() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.gauge14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence14() {
        assertEquals(0.5, new BrambleFoundryII().gauge14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence14() {
        assertEquals(5.0, new BrambleFoundryII().gauge14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset15() {
        assertTrue(new BrambleFoundryII().flatten15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new BrambleFoundryII().flatten15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset15() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleFoundryII().flatten15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield16() {
        assertEquals("below", new BrambleFoundryII().furl16(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield16() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("lower-bound", subject.furl16(2));
        assertEquals("upper-bound", subject.furl16(11));
    }

    @Test
    void classifiesWithinAndAboveYield16() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("within", subject.furl16(2 + 1));
        assertEquals("above", subject.furl16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity17() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper17());
        }
        assertEquals(2, subject.bias17Count());
    }

    @Test
    void refusesOnceExhaustedCapacity17() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 2; i++) {
            subject.temper17();
        }
        assertFalse(subject.temper17());
    }

    @Test
    void accumulatesBelowTheCapRatio18() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals(1, subject.furl18(1));
        assertEquals(3, subject.furl18(2));
    }

    @Test
    void saturatesAtTheCapRatio18() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.furl18(38);
        assertEquals(38, subject.furl18(5));
    }

    @Test
    void ignoresNegativeValuesRatio18() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.furl18(3);
        assertEquals(3, subject.furl18(-2));
        assertEquals(3, subject.threshold18Value());
    }

    @Test
    void rejectsZeroDenominatorRatio19() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.gauge19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio19() {
        assertEquals(0.5, new BrambleFoundryII().gauge19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio19() {
        assertEquals(5.0, new BrambleFoundryII().gauge19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight20() {
        assertTrue(new BrambleFoundryII().gauge20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new BrambleFoundryII().gauge20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight20() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleFoundryII().gauge20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth21() {
        assertEquals("below", new BrambleFoundryII().hoist21(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth21() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("lower-bound", subject.hoist21(3));
        assertEquals("upper-bound", subject.hoist21(10));
    }

    @Test
    void classifiesWithinAndAboveDepth21() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("within", subject.hoist21(3 + 1));
        assertEquals("above", subject.hoist21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold22() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten22());
        }
        assertEquals(3, subject.quota22Count());
    }

    @Test
    void refusesOnceExhaustedThreshold22() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 3; i++) {
            subject.flatten22();
        }
        assertFalse(subject.flatten22());
    }

    @Test
    void accumulatesBelowTheCapRatio23() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals(1, subject.sift23(1));
        assertEquals(3, subject.sift23(2));
    }

    @Test
    void saturatesAtTheCapRatio23() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.sift23(43);
        assertEquals(43, subject.sift23(5));
    }

    @Test
    void ignoresNegativeValuesRatio23() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.sift23(3);
        assertEquals(3, subject.sift23(-2));
        assertEquals(3, subject.cadence23Value());
    }

    @Test
    void rejectsZeroDenominatorDrift24() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift24() {
        assertEquals(0.5, new BrambleFoundryII().hoist24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift24() {
        assertEquals(5.0, new BrambleFoundryII().hoist24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset25() {
        assertTrue(new BrambleFoundryII().sift25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new BrambleFoundryII().sift25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset25() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleFoundryII().sift25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio26() {
        assertEquals("below", new BrambleFoundryII().anneal26(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio26() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("lower-bound", subject.anneal26(4));
        assertEquals("upper-bound", subject.anneal26(9));
    }

    @Test
    void classifiesWithinAndAboveRatio26() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("within", subject.anneal26(4 + 1));
        assertEquals("above", subject.anneal26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence27() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift27());
        }
        assertEquals(4, subject.capacity27Count());
    }

    @Test
    void refusesOnceExhaustedCadence27() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 4; i++) {
            subject.sift27();
        }
        assertFalse(subject.sift27());
    }

    @Test
    void accumulatesBelowTheCapYield28() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals(1, subject.sift28(1));
        assertEquals(3, subject.sift28(2));
    }

    @Test
    void saturatesAtTheCapYield28() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.sift28(48);
        assertEquals(48, subject.sift28(5));
    }

    @Test
    void ignoresNegativeValuesYield28() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.sift28(3);
        assertEquals(3, subject.sift28(-2));
        assertEquals(3, subject.tally28Value());
    }

    @Test
    void rejectsZeroDenominatorBias29() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias29() {
        assertEquals(0.5, new BrambleFoundryII().winnow29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias29() {
        assertEquals(5.0, new BrambleFoundryII().winnow29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally30() {
        assertTrue(new BrambleFoundryII().temper30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new BrambleFoundryII().temper30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally30() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleFoundryII().temper30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan31() {
        assertEquals("below", new BrambleFoundryII().winnow31(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan31() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("lower-bound", subject.winnow31(5));
        assertEquals("upper-bound", subject.winnow31(8));
    }

    @Test
    void classifiesWithinAndAboveSpan31() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("within", subject.winnow31(5 + 1));
        assertEquals("above", subject.winnow31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence32() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper32());
        }
        assertEquals(1, subject.quota32Count());
    }

    @Test
    void refusesOnceExhaustedCadence32() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 1; i++) {
            subject.temper32();
        }
        assertFalse(subject.temper32());
    }

    @Test
    void accumulatesBelowTheCapCapacity33() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals(1, subject.anneal33(1));
        assertEquals(3, subject.anneal33(2));
    }

    @Test
    void saturatesAtTheCapCapacity33() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.anneal33(53);
        assertEquals(53, subject.anneal33(5));
    }

    @Test
    void ignoresNegativeValuesCapacity33() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.anneal33(3);
        assertEquals(3, subject.anneal33(-2));
        assertEquals(3, subject.cadence33Value());
    }

    @Test
    void rejectsZeroDenominatorRatio34() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.temper34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio34() {
        assertEquals(0.5, new BrambleFoundryII().temper34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio34() {
        assertEquals(5.0, new BrambleFoundryII().temper34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset35() {
        assertTrue(new BrambleFoundryII().kindle35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new BrambleFoundryII().kindle35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset35() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleFoundryII().kindle35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset36() {
        assertEquals("below", new BrambleFoundryII().temper36(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset36() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("lower-bound", subject.temper36(2));
        assertEquals("upper-bound", subject.temper36(7));
    }

    @Test
    void classifiesWithinAndAboveOffset36() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("within", subject.temper36(2 + 1));
        assertEquals("above", subject.temper36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias37() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle37());
        }
        assertEquals(2, subject.yield37Count());
    }

    @Test
    void refusesOnceExhaustedBias37() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 2; i++) {
            subject.kindle37();
        }
        assertFalse(subject.kindle37());
    }

    @Test
    void accumulatesBelowTheCapWeight38() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals(1, subject.kindle38(1));
        assertEquals(3, subject.kindle38(2));
    }

    @Test
    void saturatesAtTheCapWeight38() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.kindle38(58);
        assertEquals(58, subject.kindle38(5));
    }

    @Test
    void ignoresNegativeValuesWeight38() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.kindle38(3);
        assertEquals(3, subject.kindle38(-2));
        assertEquals(3, subject.capacity38Value());
    }

    @Test
    void rejectsZeroDenominatorSpan39() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan39() {
        assertEquals(0.5, new BrambleFoundryII().hoist39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan39() {
        assertEquals(5.0, new BrambleFoundryII().hoist39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias40() {
        assertTrue(new BrambleFoundryII().tally40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new BrambleFoundryII().tally40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias40() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleFoundryII().tally40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota41() {
        assertEquals("below", new BrambleFoundryII().sift41(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota41() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("lower-bound", subject.sift41(3));
        assertEquals("upper-bound", subject.sift41(12));
    }

    @Test
    void classifiesWithinAndAboveQuota41() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("within", subject.sift41(3 + 1));
        assertEquals("above", subject.sift41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias42() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist42());
        }
        assertEquals(3, subject.depth42Count());
    }

    @Test
    void refusesOnceExhaustedBias42() {
        BrambleFoundryII subject = new BrambleFoundryII();
        for (int i = 0; i < 3; i++) {
            subject.hoist42();
        }
        assertFalse(subject.hoist42());
    }

    @Test
    void accumulatesBelowTheCapBias43() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals(1, subject.anneal43(1));
        assertEquals(3, subject.anneal43(2));
    }

    @Test
    void saturatesAtTheCapBias43() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.anneal43(23);
        assertEquals(23, subject.anneal43(5));
    }

    @Test
    void ignoresNegativeValuesBias43() {
        BrambleFoundryII subject = new BrambleFoundryII();
        subject.anneal43(3);
        assertEquals(3, subject.anneal43(-2));
        assertEquals(3, subject.margin43Value());
    }

    @Test
    void rejectsZeroDenominatorCadence44() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence44() {
        assertEquals(0.5, new BrambleFoundryII().winnow44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence44() {
        assertEquals(5.0, new BrambleFoundryII().winnow44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold45() {
        assertTrue(new BrambleFoundryII().temper45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleFoundryII().temper45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold45() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleFoundryII().temper45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally46() {
        assertEquals("below", new BrambleFoundryII().flatten46(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally46() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("lower-bound", subject.flatten46(4));
        assertEquals("upper-bound", subject.flatten46(11));
    }

    @Test
    void classifiesWithinAndAboveTally46() {
        BrambleFoundryII subject = new BrambleFoundryII();
        assertEquals("within", subject.flatten46(4 + 1));
        assertEquals("above", subject.flatten46(11 + 1));
    }
}
