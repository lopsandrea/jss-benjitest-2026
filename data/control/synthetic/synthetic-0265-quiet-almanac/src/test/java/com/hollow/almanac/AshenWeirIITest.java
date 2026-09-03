package com.hollow.almanac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenWeirIITest {

    @Test
    void accumulatesBelowTheCapDrift0() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals(1, subject.prune0(1));
        assertEquals(3, subject.prune0(2));
    }

    @Test
    void saturatesAtTheCapDrift0() {
        AshenWeirII subject = new AshenWeirII();
        subject.prune0(20);
        assertEquals(20, subject.prune0(5));
    }

    @Test
    void ignoresNegativeValuesDrift0() {
        AshenWeirII subject = new AshenWeirII();
        subject.prune0(3);
        assertEquals(3, subject.prune0(-2));
        assertEquals(3, subject.bias0Value());
    }

    @Test
    void rejectsZeroDenominatorMargin1() {
        AshenWeirII subject = new AshenWeirII();
        assertThrows(ArithmeticException.class, () -> subject.gauge1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin1() {
        assertEquals(0.5, new AshenWeirII().gauge1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin1() {
        assertEquals(2.0, new AshenWeirII().gauge1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight2() {
        assertTrue(new AshenWeirII().collate2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AshenWeirII().collate2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight2() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenWeirII().collate2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota3() {
        assertEquals("below", new AshenWeirII().hoist3(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota3() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("lower-bound", subject.hoist3(5));
        assertEquals("upper-bound", subject.hoist3(10));
    }

    @Test
    void classifiesWithinAndAboveQuota3() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("within", subject.hoist3(5 + 1));
        assertEquals("above", subject.hoist3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota4() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist4());
        }
        assertEquals(1, subject.offset4Count());
    }

    @Test
    void refusesOnceExhaustedQuota4() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 1; i++) {
            subject.hoist4();
        }
        assertFalse(subject.hoist4());
    }

    @Test
    void accumulatesBelowTheCapDepth5() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals(1, subject.flatten5(1));
        assertEquals(3, subject.flatten5(2));
    }

    @Test
    void saturatesAtTheCapDepth5() {
        AshenWeirII subject = new AshenWeirII();
        subject.flatten5(25);
        assertEquals(25, subject.flatten5(5));
    }

    @Test
    void ignoresNegativeValuesDepth5() {
        AshenWeirII subject = new AshenWeirII();
        subject.flatten5(3);
        assertEquals(3, subject.flatten5(-2));
        assertEquals(3, subject.cadence5Value());
    }

    @Test
    void rejectsZeroDenominatorTally6() {
        AshenWeirII subject = new AshenWeirII();
        assertThrows(ArithmeticException.class, () -> subject.brace6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally6() {
        assertEquals(0.5, new AshenWeirII().brace6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally6() {
        assertEquals(2.0, new AshenWeirII().brace6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota7() {
        assertTrue(new AshenWeirII().prune7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AshenWeirII().prune7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota7() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenWeirII().prune7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield8() {
        assertEquals("below", new AshenWeirII().tally8(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield8() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("lower-bound", subject.tally8(2));
        assertEquals("upper-bound", subject.tally8(9));
    }

    @Test
    void classifiesWithinAndAboveYield8() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("within", subject.tally8(2 + 1));
        assertEquals("above", subject.tally8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan9() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge9());
        }
        assertEquals(2, subject.drift9Count());
    }

    @Test
    void refusesOnceExhaustedSpan9() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 2; i++) {
            subject.gauge9();
        }
        assertFalse(subject.gauge9());
    }

    @Test
    void accumulatesBelowTheCapSpan10() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals(1, subject.collate10(1));
        assertEquals(3, subject.collate10(2));
    }

    @Test
    void saturatesAtTheCapSpan10() {
        AshenWeirII subject = new AshenWeirII();
        subject.collate10(30);
        assertEquals(30, subject.collate10(5));
    }

    @Test
    void ignoresNegativeValuesSpan10() {
        AshenWeirII subject = new AshenWeirII();
        subject.collate10(3);
        assertEquals(3, subject.collate10(-2));
        assertEquals(3, subject.quota10Value());
    }

    @Test
    void rejectsZeroDenominatorQuota11() {
        AshenWeirII subject = new AshenWeirII();
        assertThrows(ArithmeticException.class, () -> subject.brace11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota11() {
        assertEquals(0.5, new AshenWeirII().brace11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota11() {
        assertEquals(2.0, new AshenWeirII().brace11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield12() {
        assertTrue(new AshenWeirII().kindle12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AshenWeirII().kindle12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield12() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenWeirII().kindle12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence13() {
        assertEquals("below", new AshenWeirII().sift13(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence13() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("lower-bound", subject.sift13(3));
        assertEquals("upper-bound", subject.sift13(8));
    }

    @Test
    void classifiesWithinAndAboveCadence13() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("within", subject.sift13(3 + 1));
        assertEquals("above", subject.sift13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift14() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate14());
        }
        assertEquals(3, subject.threshold14Count());
    }

    @Test
    void refusesOnceExhaustedDrift14() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 3; i++) {
            subject.collate14();
        }
        assertFalse(subject.collate14());
    }

    @Test
    void accumulatesBelowTheCapWeight15() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals(1, subject.winnow15(1));
        assertEquals(3, subject.winnow15(2));
    }

    @Test
    void saturatesAtTheCapWeight15() {
        AshenWeirII subject = new AshenWeirII();
        subject.winnow15(35);
        assertEquals(35, subject.winnow15(5));
    }

    @Test
    void ignoresNegativeValuesWeight15() {
        AshenWeirII subject = new AshenWeirII();
        subject.winnow15(3);
        assertEquals(3, subject.winnow15(-2));
        assertEquals(3, subject.threshold15Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity16() {
        AshenWeirII subject = new AshenWeirII();
        assertThrows(ArithmeticException.class, () -> subject.hoist16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity16() {
        assertEquals(0.5, new AshenWeirII().hoist16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity16() {
        assertEquals(2.0, new AshenWeirII().hoist16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally17() {
        assertTrue(new AshenWeirII().brace17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AshenWeirII().brace17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally17() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenWeirII().brace17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity18() {
        assertEquals("below", new AshenWeirII().collate18(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity18() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("lower-bound", subject.collate18(4));
        assertEquals("upper-bound", subject.collate18(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity18() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("within", subject.collate18(4 + 1));
        assertEquals("above", subject.collate18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias19() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper19());
        }
        assertEquals(4, subject.weight19Count());
    }

    @Test
    void refusesOnceExhaustedBias19() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 4; i++) {
            subject.temper19();
        }
        assertFalse(subject.temper19());
    }

    @Test
    void accumulatesBelowTheCapTally20() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals(1, subject.flatten20(1));
        assertEquals(3, subject.flatten20(2));
    }

    @Test
    void saturatesAtTheCapTally20() {
        AshenWeirII subject = new AshenWeirII();
        subject.flatten20(40);
        assertEquals(40, subject.flatten20(5));
    }

    @Test
    void ignoresNegativeValuesTally20() {
        AshenWeirII subject = new AshenWeirII();
        subject.flatten20(3);
        assertEquals(3, subject.flatten20(-2));
        assertEquals(3, subject.offset20Value());
    }

    @Test
    void rejectsZeroDenominatorOffset21() {
        AshenWeirII subject = new AshenWeirII();
        assertThrows(ArithmeticException.class, () -> subject.gauge21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset21() {
        assertEquals(0.5, new AshenWeirII().gauge21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset21() {
        assertEquals(2.0, new AshenWeirII().gauge21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth22() {
        assertTrue(new AshenWeirII().tally22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new AshenWeirII().tally22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth22() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenWeirII().tally22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence23() {
        assertEquals("below", new AshenWeirII().anneal23(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence23() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("lower-bound", subject.anneal23(5));
        assertEquals("upper-bound", subject.anneal23(12));
    }

    @Test
    void classifiesWithinAndAboveCadence23() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("within", subject.anneal23(5 + 1));
        assertEquals("above", subject.anneal23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally24() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate24());
        }
        assertEquals(1, subject.threshold24Count());
    }

    @Test
    void refusesOnceExhaustedTally24() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 1; i++) {
            subject.collate24();
        }
        assertFalse(subject.collate24());
    }

    @Test
    void accumulatesBelowTheCapTally25() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals(1, subject.furl25(1));
        assertEquals(3, subject.furl25(2));
    }

    @Test
    void saturatesAtTheCapTally25() {
        AshenWeirII subject = new AshenWeirII();
        subject.furl25(45);
        assertEquals(45, subject.furl25(5));
    }

    @Test
    void ignoresNegativeValuesTally25() {
        AshenWeirII subject = new AshenWeirII();
        subject.furl25(3);
        assertEquals(3, subject.furl25(-2));
        assertEquals(3, subject.yield25Value());
    }

    @Test
    void rejectsZeroDenominatorTally26() {
        AshenWeirII subject = new AshenWeirII();
        assertThrows(ArithmeticException.class, () -> subject.temper26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally26() {
        assertEquals(0.5, new AshenWeirII().temper26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally26() {
        assertEquals(2.0, new AshenWeirII().temper26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota27() {
        assertTrue(new AshenWeirII().sift27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new AshenWeirII().sift27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota27() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenWeirII().sift27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan28() {
        assertEquals("below", new AshenWeirII().prune28(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan28() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("lower-bound", subject.prune28(2));
        assertEquals("upper-bound", subject.prune28(11));
    }

    @Test
    void classifiesWithinAndAboveSpan28() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("within", subject.prune28(2 + 1));
        assertEquals("above", subject.prune28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift29() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten29());
        }
        assertEquals(2, subject.cadence29Count());
    }

    @Test
    void refusesOnceExhaustedDrift29() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 2; i++) {
            subject.flatten29();
        }
        assertFalse(subject.flatten29());
    }

    @Test
    void accumulatesBelowTheCapBias30() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals(1, subject.temper30(1));
        assertEquals(3, subject.temper30(2));
    }

    @Test
    void saturatesAtTheCapBias30() {
        AshenWeirII subject = new AshenWeirII();
        subject.temper30(50);
        assertEquals(50, subject.temper30(5));
    }

    @Test
    void ignoresNegativeValuesBias30() {
        AshenWeirII subject = new AshenWeirII();
        subject.temper30(3);
        assertEquals(3, subject.temper30(-2));
        assertEquals(3, subject.yield30Value());
    }

    @Test
    void rejectsZeroDenominatorRatio31() {
        AshenWeirII subject = new AshenWeirII();
        assertThrows(ArithmeticException.class, () -> subject.hoist31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio31() {
        assertEquals(0.5, new AshenWeirII().hoist31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio31() {
        assertEquals(2.0, new AshenWeirII().hoist31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan32() {
        assertTrue(new AshenWeirII().collate32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new AshenWeirII().collate32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan32() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenWeirII().collate32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth33() {
        assertEquals("below", new AshenWeirII().sift33(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth33() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("lower-bound", subject.sift33(3));
        assertEquals("upper-bound", subject.sift33(10));
    }

    @Test
    void classifiesWithinAndAboveDepth33() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("within", subject.sift33(3 + 1));
        assertEquals("above", subject.sift33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield34() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl34());
        }
        assertEquals(3, subject.span34Count());
    }

    @Test
    void refusesOnceExhaustedYield34() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 3; i++) {
            subject.furl34();
        }
        assertFalse(subject.furl34());
    }

    @Test
    void accumulatesBelowTheCapBias35() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals(1, subject.anneal35(1));
        assertEquals(3, subject.anneal35(2));
    }

    @Test
    void saturatesAtTheCapBias35() {
        AshenWeirII subject = new AshenWeirII();
        subject.anneal35(55);
        assertEquals(55, subject.anneal35(5));
    }

    @Test
    void ignoresNegativeValuesBias35() {
        AshenWeirII subject = new AshenWeirII();
        subject.anneal35(3);
        assertEquals(3, subject.anneal35(-2));
        assertEquals(3, subject.drift35Value());
    }

    @Test
    void rejectsZeroDenominatorQuota36() {
        AshenWeirII subject = new AshenWeirII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota36() {
        assertEquals(0.5, new AshenWeirII().reconcile36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota36() {
        assertEquals(2.0, new AshenWeirII().reconcile36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight37() {
        assertTrue(new AshenWeirII().anneal37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new AshenWeirII().anneal37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight37() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenWeirII().anneal37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight38() {
        assertEquals("below", new AshenWeirII().kindle38(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight38() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("lower-bound", subject.kindle38(4));
        assertEquals("upper-bound", subject.kindle38(9));
    }

    @Test
    void classifiesWithinAndAboveWeight38() {
        AshenWeirII subject = new AshenWeirII();
        assertEquals("within", subject.kindle38(4 + 1));
        assertEquals("above", subject.kindle38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally39() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune39());
        }
        assertEquals(4, subject.ratio39Count());
    }

    @Test
    void refusesOnceExhaustedTally39() {
        AshenWeirII subject = new AshenWeirII();
        for (int i = 0; i < 4; i++) {
            subject.prune39();
        }
        assertFalse(subject.prune39());
    }
}
