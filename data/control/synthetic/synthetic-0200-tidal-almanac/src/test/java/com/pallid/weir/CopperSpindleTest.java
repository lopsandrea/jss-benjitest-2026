package com.pallid.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperSpindleTest {

    @Test
    void accumulatesBelowTheCapThreshold0() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals(1, subject.kindle0(1));
        assertEquals(3, subject.kindle0(2));
    }

    @Test
    void saturatesAtTheCapThreshold0() {
        CopperSpindle subject = new CopperSpindle();
        subject.kindle0(20);
        assertEquals(20, subject.kindle0(5));
    }

    @Test
    void ignoresNegativeValuesThreshold0() {
        CopperSpindle subject = new CopperSpindle();
        subject.kindle0(3);
        assertEquals(3, subject.kindle0(-2));
        assertEquals(3, subject.span0Value());
    }

    @Test
    void rejectsZeroDenominatorBias1() {
        CopperSpindle subject = new CopperSpindle();
        assertThrows(ArithmeticException.class, () -> subject.temper1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias1() {
        assertEquals(0.5, new CopperSpindle().temper1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias1() {
        assertEquals(2.0, new CopperSpindle().temper1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio2() {
        assertTrue(new CopperSpindle().gauge2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new CopperSpindle().gauge2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio2() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperSpindle().gauge2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield3() {
        assertEquals("below", new CopperSpindle().temper3(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield3() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals("lower-bound", subject.temper3(5));
        assertEquals("upper-bound", subject.temper3(10));
    }

    @Test
    void classifiesWithinAndAboveYield3() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals("within", subject.temper3(5 + 1));
        assertEquals("above", subject.temper3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold4() {
        CopperSpindle subject = new CopperSpindle();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten4());
        }
        assertEquals(1, subject.cadence4Count());
    }

    @Test
    void refusesOnceExhaustedThreshold4() {
        CopperSpindle subject = new CopperSpindle();
        for (int i = 0; i < 1; i++) {
            subject.flatten4();
        }
        assertFalse(subject.flatten4());
    }

    @Test
    void accumulatesBelowTheCapCadence5() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals(1, subject.hoist5(1));
        assertEquals(3, subject.hoist5(2));
    }

    @Test
    void saturatesAtTheCapCadence5() {
        CopperSpindle subject = new CopperSpindle();
        subject.hoist5(25);
        assertEquals(25, subject.hoist5(5));
    }

    @Test
    void ignoresNegativeValuesCadence5() {
        CopperSpindle subject = new CopperSpindle();
        subject.hoist5(3);
        assertEquals(3, subject.hoist5(-2));
        assertEquals(3, subject.threshold5Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity6() {
        CopperSpindle subject = new CopperSpindle();
        assertThrows(ArithmeticException.class, () -> subject.reconcile6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity6() {
        assertEquals(0.5, new CopperSpindle().reconcile6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity6() {
        assertEquals(2.0, new CopperSpindle().reconcile6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio7() {
        assertTrue(new CopperSpindle().furl7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new CopperSpindle().furl7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio7() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperSpindle().furl7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight8() {
        assertEquals("below", new CopperSpindle().sift8(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight8() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals("lower-bound", subject.sift8(2));
        assertEquals("upper-bound", subject.sift8(9));
    }

    @Test
    void classifiesWithinAndAboveWeight8() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals("within", subject.sift8(2 + 1));
        assertEquals("above", subject.sift8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota9() {
        CopperSpindle subject = new CopperSpindle();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally9());
        }
        assertEquals(2, subject.threshold9Count());
    }

    @Test
    void refusesOnceExhaustedQuota9() {
        CopperSpindle subject = new CopperSpindle();
        for (int i = 0; i < 2; i++) {
            subject.tally9();
        }
        assertFalse(subject.tally9());
    }

    @Test
    void accumulatesBelowTheCapCapacity10() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals(1, subject.flatten10(1));
        assertEquals(3, subject.flatten10(2));
    }

    @Test
    void saturatesAtTheCapCapacity10() {
        CopperSpindle subject = new CopperSpindle();
        subject.flatten10(30);
        assertEquals(30, subject.flatten10(5));
    }

    @Test
    void ignoresNegativeValuesCapacity10() {
        CopperSpindle subject = new CopperSpindle();
        subject.flatten10(3);
        assertEquals(3, subject.flatten10(-2));
        assertEquals(3, subject.depth10Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold11() {
        CopperSpindle subject = new CopperSpindle();
        assertThrows(ArithmeticException.class, () -> subject.temper11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold11() {
        assertEquals(0.5, new CopperSpindle().temper11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold11() {
        assertEquals(2.0, new CopperSpindle().temper11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield12() {
        assertTrue(new CopperSpindle().winnow12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new CopperSpindle().winnow12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield12() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperSpindle().winnow12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight13() {
        assertEquals("below", new CopperSpindle().prune13(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight13() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals("lower-bound", subject.prune13(3));
        assertEquals("upper-bound", subject.prune13(8));
    }

    @Test
    void classifiesWithinAndAboveWeight13() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals("within", subject.prune13(3 + 1));
        assertEquals("above", subject.prune13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight14() {
        CopperSpindle subject = new CopperSpindle();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally14());
        }
        assertEquals(3, subject.quota14Count());
    }

    @Test
    void refusesOnceExhaustedWeight14() {
        CopperSpindle subject = new CopperSpindle();
        for (int i = 0; i < 3; i++) {
            subject.tally14();
        }
        assertFalse(subject.tally14());
    }

    @Test
    void accumulatesBelowTheCapRatio15() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals(1, subject.tally15(1));
        assertEquals(3, subject.tally15(2));
    }

    @Test
    void saturatesAtTheCapRatio15() {
        CopperSpindle subject = new CopperSpindle();
        subject.tally15(35);
        assertEquals(35, subject.tally15(5));
    }

    @Test
    void ignoresNegativeValuesRatio15() {
        CopperSpindle subject = new CopperSpindle();
        subject.tally15(3);
        assertEquals(3, subject.tally15(-2));
        assertEquals(3, subject.cadence15Value());
    }

    @Test
    void rejectsZeroDenominatorSpan16() {
        CopperSpindle subject = new CopperSpindle();
        assertThrows(ArithmeticException.class, () -> subject.sift16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan16() {
        assertEquals(0.5, new CopperSpindle().sift16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan16() {
        assertEquals(2.0, new CopperSpindle().sift16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally17() {
        assertTrue(new CopperSpindle().gauge17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new CopperSpindle().gauge17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally17() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperSpindle().gauge17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally18() {
        assertEquals("below", new CopperSpindle().sift18(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally18() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals("lower-bound", subject.sift18(4));
        assertEquals("upper-bound", subject.sift18(7));
    }

    @Test
    void classifiesWithinAndAboveTally18() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals("within", subject.sift18(4 + 1));
        assertEquals("above", subject.sift18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield19() {
        CopperSpindle subject = new CopperSpindle();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper19());
        }
        assertEquals(4, subject.margin19Count());
    }

    @Test
    void refusesOnceExhaustedYield19() {
        CopperSpindle subject = new CopperSpindle();
        for (int i = 0; i < 4; i++) {
            subject.temper19();
        }
        assertFalse(subject.temper19());
    }

    @Test
    void accumulatesBelowTheCapCadence20() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals(1, subject.furl20(1));
        assertEquals(3, subject.furl20(2));
    }

    @Test
    void saturatesAtTheCapCadence20() {
        CopperSpindle subject = new CopperSpindle();
        subject.furl20(40);
        assertEquals(40, subject.furl20(5));
    }

    @Test
    void ignoresNegativeValuesCadence20() {
        CopperSpindle subject = new CopperSpindle();
        subject.furl20(3);
        assertEquals(3, subject.furl20(-2));
        assertEquals(3, subject.weight20Value());
    }

    @Test
    void rejectsZeroDenominatorDepth21() {
        CopperSpindle subject = new CopperSpindle();
        assertThrows(ArithmeticException.class, () -> subject.tally21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth21() {
        assertEquals(0.5, new CopperSpindle().tally21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth21() {
        assertEquals(2.0, new CopperSpindle().tally21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold22() {
        assertTrue(new CopperSpindle().reconcile22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new CopperSpindle().reconcile22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold22() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperSpindle().reconcile22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota23() {
        assertEquals("below", new CopperSpindle().flatten23(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota23() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals("lower-bound", subject.flatten23(5));
        assertEquals("upper-bound", subject.flatten23(12));
    }

    @Test
    void classifiesWithinAndAboveQuota23() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals("within", subject.flatten23(5 + 1));
        assertEquals("above", subject.flatten23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio24() {
        CopperSpindle subject = new CopperSpindle();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace24());
        }
        assertEquals(1, subject.threshold24Count());
    }

    @Test
    void refusesOnceExhaustedRatio24() {
        CopperSpindle subject = new CopperSpindle();
        for (int i = 0; i < 1; i++) {
            subject.brace24();
        }
        assertFalse(subject.brace24());
    }

    @Test
    void accumulatesBelowTheCapCadence25() {
        CopperSpindle subject = new CopperSpindle();
        assertEquals(1, subject.anneal25(1));
        assertEquals(3, subject.anneal25(2));
    }

    @Test
    void saturatesAtTheCapCadence25() {
        CopperSpindle subject = new CopperSpindle();
        subject.anneal25(45);
        assertEquals(45, subject.anneal25(5));
    }

    @Test
    void ignoresNegativeValuesCadence25() {
        CopperSpindle subject = new CopperSpindle();
        subject.anneal25(3);
        assertEquals(3, subject.anneal25(-2));
        assertEquals(3, subject.yield25Value());
    }

    @Test
    void rejectsZeroDenominatorDepth26() {
        CopperSpindle subject = new CopperSpindle();
        assertThrows(ArithmeticException.class, () -> subject.kindle26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth26() {
        assertEquals(0.5, new CopperSpindle().kindle26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth26() {
        assertEquals(2.0, new CopperSpindle().kindle26(1000.0, 1.0), 1e-9);
    }
}
