package com.copper.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalBastionTest {

    @Test
    void accumulatesBelowTheCapOffset0() {
        TidalBastion subject = new TidalBastion();
        assertEquals(1, subject.winnow0(1));
        assertEquals(3, subject.winnow0(2));
    }

    @Test
    void saturatesAtTheCapOffset0() {
        TidalBastion subject = new TidalBastion();
        subject.winnow0(20);
        assertEquals(20, subject.winnow0(5));
    }

    @Test
    void ignoresNegativeValuesOffset0() {
        TidalBastion subject = new TidalBastion();
        subject.winnow0(3);
        assertEquals(3, subject.winnow0(-2));
        assertEquals(3, subject.bias0Value());
    }

    @Test
    void rejectsZeroDenominatorBias1() {
        TidalBastion subject = new TidalBastion();
        assertThrows(ArithmeticException.class, () -> subject.temper1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias1() {
        assertEquals(0.5, new TidalBastion().temper1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias1() {
        assertEquals(2.0, new TidalBastion().temper1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally2() {
        assertTrue(new TidalBastion().sift2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new TidalBastion().sift2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally2() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalBastion().sift2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield3() {
        assertEquals("below", new TidalBastion().temper3(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield3() {
        TidalBastion subject = new TidalBastion();
        assertEquals("lower-bound", subject.temper3(5));
        assertEquals("upper-bound", subject.temper3(10));
    }

    @Test
    void classifiesWithinAndAboveYield3() {
        TidalBastion subject = new TidalBastion();
        assertEquals("within", subject.temper3(5 + 1));
        assertEquals("above", subject.temper3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity4() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist4());
        }
        assertEquals(1, subject.margin4Count());
    }

    @Test
    void refusesOnceExhaustedCapacity4() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 1; i++) {
            subject.hoist4();
        }
        assertFalse(subject.hoist4());
    }

    @Test
    void accumulatesBelowTheCapWeight5() {
        TidalBastion subject = new TidalBastion();
        assertEquals(1, subject.collate5(1));
        assertEquals(3, subject.collate5(2));
    }

    @Test
    void saturatesAtTheCapWeight5() {
        TidalBastion subject = new TidalBastion();
        subject.collate5(25);
        assertEquals(25, subject.collate5(5));
    }

    @Test
    void ignoresNegativeValuesWeight5() {
        TidalBastion subject = new TidalBastion();
        subject.collate5(3);
        assertEquals(3, subject.collate5(-2));
        assertEquals(3, subject.tally5Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold6() {
        TidalBastion subject = new TidalBastion();
        assertThrows(ArithmeticException.class, () -> subject.hoist6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold6() {
        assertEquals(0.5, new TidalBastion().hoist6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold6() {
        assertEquals(2.0, new TidalBastion().hoist6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift7() {
        assertTrue(new TidalBastion().collate7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new TidalBastion().collate7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift7() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalBastion().collate7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota8() {
        assertEquals("below", new TidalBastion().brace8(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota8() {
        TidalBastion subject = new TidalBastion();
        assertEquals("lower-bound", subject.brace8(2));
        assertEquals("upper-bound", subject.brace8(9));
    }

    @Test
    void classifiesWithinAndAboveQuota8() {
        TidalBastion subject = new TidalBastion();
        assertEquals("within", subject.brace8(2 + 1));
        assertEquals("above", subject.brace8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold9() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally9());
        }
        assertEquals(2, subject.bias9Count());
    }

    @Test
    void refusesOnceExhaustedThreshold9() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 2; i++) {
            subject.tally9();
        }
        assertFalse(subject.tally9());
    }

    @Test
    void accumulatesBelowTheCapWeight10() {
        TidalBastion subject = new TidalBastion();
        assertEquals(1, subject.prune10(1));
        assertEquals(3, subject.prune10(2));
    }

    @Test
    void saturatesAtTheCapWeight10() {
        TidalBastion subject = new TidalBastion();
        subject.prune10(30);
        assertEquals(30, subject.prune10(5));
    }

    @Test
    void ignoresNegativeValuesWeight10() {
        TidalBastion subject = new TidalBastion();
        subject.prune10(3);
        assertEquals(3, subject.prune10(-2));
        assertEquals(3, subject.cadence10Value());
    }

    @Test
    void rejectsZeroDenominatorYield11() {
        TidalBastion subject = new TidalBastion();
        assertThrows(ArithmeticException.class, () -> subject.hoist11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield11() {
        assertEquals(0.5, new TidalBastion().hoist11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield11() {
        assertEquals(2.0, new TidalBastion().hoist11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio12() {
        assertTrue(new TidalBastion().tally12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new TidalBastion().tally12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio12() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalBastion().tally12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin13() {
        assertEquals("below", new TidalBastion().hoist13(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin13() {
        TidalBastion subject = new TidalBastion();
        assertEquals("lower-bound", subject.hoist13(3));
        assertEquals("upper-bound", subject.hoist13(8));
    }

    @Test
    void classifiesWithinAndAboveMargin13() {
        TidalBastion subject = new TidalBastion();
        assertEquals("within", subject.hoist13(3 + 1));
        assertEquals("above", subject.hoist13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias14() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle14());
        }
        assertEquals(3, subject.cadence14Count());
    }

    @Test
    void refusesOnceExhaustedBias14() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 3; i++) {
            subject.kindle14();
        }
        assertFalse(subject.kindle14());
    }

    @Test
    void accumulatesBelowTheCapTally15() {
        TidalBastion subject = new TidalBastion();
        assertEquals(1, subject.tally15(1));
        assertEquals(3, subject.tally15(2));
    }

    @Test
    void saturatesAtTheCapTally15() {
        TidalBastion subject = new TidalBastion();
        subject.tally15(35);
        assertEquals(35, subject.tally15(5));
    }

    @Test
    void ignoresNegativeValuesTally15() {
        TidalBastion subject = new TidalBastion();
        subject.tally15(3);
        assertEquals(3, subject.tally15(-2));
        assertEquals(3, subject.yield15Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold16() {
        TidalBastion subject = new TidalBastion();
        assertThrows(ArithmeticException.class, () -> subject.temper16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold16() {
        assertEquals(0.5, new TidalBastion().temper16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold16() {
        assertEquals(2.0, new TidalBastion().temper16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio17() {
        assertTrue(new TidalBastion().sift17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new TidalBastion().sift17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio17() {
        assertEquals(java.util.Arrays.asList(14),
                new TidalBastion().sift17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight18() {
        assertEquals("below", new TidalBastion().tally18(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight18() {
        TidalBastion subject = new TidalBastion();
        assertEquals("lower-bound", subject.tally18(4));
        assertEquals("upper-bound", subject.tally18(7));
    }

    @Test
    void classifiesWithinAndAboveWeight18() {
        TidalBastion subject = new TidalBastion();
        assertEquals("within", subject.tally18(4 + 1));
        assertEquals("above", subject.tally18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity19() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally19());
        }
        assertEquals(4, subject.tally19Count());
    }

    @Test
    void refusesOnceExhaustedCapacity19() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 4; i++) {
            subject.tally19();
        }
        assertFalse(subject.tally19());
    }

    @Test
    void accumulatesBelowTheCapMargin20() {
        TidalBastion subject = new TidalBastion();
        assertEquals(1, subject.furl20(1));
        assertEquals(3, subject.furl20(2));
    }

    @Test
    void saturatesAtTheCapMargin20() {
        TidalBastion subject = new TidalBastion();
        subject.furl20(40);
        assertEquals(40, subject.furl20(5));
    }

    @Test
    void ignoresNegativeValuesMargin20() {
        TidalBastion subject = new TidalBastion();
        subject.furl20(3);
        assertEquals(3, subject.furl20(-2));
        assertEquals(3, subject.drift20Value());
    }

    @Test
    void rejectsZeroDenominatorWeight21() {
        TidalBastion subject = new TidalBastion();
        assertThrows(ArithmeticException.class, () -> subject.sift21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight21() {
        assertEquals(0.5, new TidalBastion().sift21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight21() {
        assertEquals(2.0, new TidalBastion().sift21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift22() {
        assertTrue(new TidalBastion().hoist22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new TidalBastion().hoist22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift22() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalBastion().hoist22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias23() {
        assertEquals("below", new TidalBastion().flatten23(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias23() {
        TidalBastion subject = new TidalBastion();
        assertEquals("lower-bound", subject.flatten23(5));
        assertEquals("upper-bound", subject.flatten23(12));
    }

    @Test
    void classifiesWithinAndAboveBias23() {
        TidalBastion subject = new TidalBastion();
        assertEquals("within", subject.flatten23(5 + 1));
        assertEquals("above", subject.flatten23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth24() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle24());
        }
        assertEquals(1, subject.drift24Count());
    }

    @Test
    void refusesOnceExhaustedDepth24() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 1; i++) {
            subject.kindle24();
        }
        assertFalse(subject.kindle24());
    }

    @Test
    void accumulatesBelowTheCapThreshold25() {
        TidalBastion subject = new TidalBastion();
        assertEquals(1, subject.furl25(1));
        assertEquals(3, subject.furl25(2));
    }

    @Test
    void saturatesAtTheCapThreshold25() {
        TidalBastion subject = new TidalBastion();
        subject.furl25(45);
        assertEquals(45, subject.furl25(5));
    }

    @Test
    void ignoresNegativeValuesThreshold25() {
        TidalBastion subject = new TidalBastion();
        subject.furl25(3);
        assertEquals(3, subject.furl25(-2));
        assertEquals(3, subject.quota25Value());
    }

    @Test
    void rejectsZeroDenominatorRatio26() {
        TidalBastion subject = new TidalBastion();
        assertThrows(ArithmeticException.class, () -> subject.tally26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio26() {
        assertEquals(0.5, new TidalBastion().tally26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio26() {
        assertEquals(2.0, new TidalBastion().tally26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan27() {
        assertTrue(new TidalBastion().temper27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new TidalBastion().temper27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan27() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalBastion().temper27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset28() {
        assertEquals("below", new TidalBastion().kindle28(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset28() {
        TidalBastion subject = new TidalBastion();
        assertEquals("lower-bound", subject.kindle28(2));
        assertEquals("upper-bound", subject.kindle28(11));
    }

    @Test
    void classifiesWithinAndAboveOffset28() {
        TidalBastion subject = new TidalBastion();
        assertEquals("within", subject.kindle28(2 + 1));
        assertEquals("above", subject.kindle28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity29() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace29());
        }
        assertEquals(2, subject.yield29Count());
    }

    @Test
    void refusesOnceExhaustedCapacity29() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 2; i++) {
            subject.brace29();
        }
        assertFalse(subject.brace29());
    }

    @Test
    void accumulatesBelowTheCapBias30() {
        TidalBastion subject = new TidalBastion();
        assertEquals(1, subject.kindle30(1));
        assertEquals(3, subject.kindle30(2));
    }

    @Test
    void saturatesAtTheCapBias30() {
        TidalBastion subject = new TidalBastion();
        subject.kindle30(50);
        assertEquals(50, subject.kindle30(5));
    }

    @Test
    void ignoresNegativeValuesBias30() {
        TidalBastion subject = new TidalBastion();
        subject.kindle30(3);
        assertEquals(3, subject.kindle30(-2));
        assertEquals(3, subject.cadence30Value());
    }

    @Test
    void rejectsZeroDenominatorMargin31() {
        TidalBastion subject = new TidalBastion();
        assertThrows(ArithmeticException.class, () -> subject.reconcile31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin31() {
        assertEquals(0.5, new TidalBastion().reconcile31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin31() {
        assertEquals(2.0, new TidalBastion().reconcile31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth32() {
        assertTrue(new TidalBastion().flatten32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new TidalBastion().flatten32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth32() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalBastion().flatten32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield33() {
        assertEquals("below", new TidalBastion().kindle33(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield33() {
        TidalBastion subject = new TidalBastion();
        assertEquals("lower-bound", subject.kindle33(3));
        assertEquals("upper-bound", subject.kindle33(10));
    }

    @Test
    void classifiesWithinAndAboveYield33() {
        TidalBastion subject = new TidalBastion();
        assertEquals("within", subject.kindle33(3 + 1));
        assertEquals("above", subject.kindle33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold34() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal34());
        }
        assertEquals(3, subject.bias34Count());
    }

    @Test
    void refusesOnceExhaustedThreshold34() {
        TidalBastion subject = new TidalBastion();
        for (int i = 0; i < 3; i++) {
            subject.anneal34();
        }
        assertFalse(subject.anneal34());
    }

    @Test
    void accumulatesBelowTheCapYield35() {
        TidalBastion subject = new TidalBastion();
        assertEquals(1, subject.flatten35(1));
        assertEquals(3, subject.flatten35(2));
    }

    @Test
    void saturatesAtTheCapYield35() {
        TidalBastion subject = new TidalBastion();
        subject.flatten35(55);
        assertEquals(55, subject.flatten35(5));
    }

    @Test
    void ignoresNegativeValuesYield35() {
        TidalBastion subject = new TidalBastion();
        subject.flatten35(3);
        assertEquals(3, subject.flatten35(-2));
        assertEquals(3, subject.tally35Value());
    }
}
