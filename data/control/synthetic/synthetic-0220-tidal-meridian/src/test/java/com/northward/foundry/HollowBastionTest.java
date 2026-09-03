package com.northward.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowBastionTest {

    @Test
    void accumulatesBelowTheCapBias0() {
        HollowBastion subject = new HollowBastion();
        assertEquals(1, subject.reconcile0(1));
        assertEquals(3, subject.reconcile0(2));
    }

    @Test
    void saturatesAtTheCapBias0() {
        HollowBastion subject = new HollowBastion();
        subject.reconcile0(20);
        assertEquals(20, subject.reconcile0(5));
    }

    @Test
    void ignoresNegativeValuesBias0() {
        HollowBastion subject = new HollowBastion();
        subject.reconcile0(3);
        assertEquals(3, subject.reconcile0(-2));
        assertEquals(3, subject.span0Value());
    }

    @Test
    void rejectsZeroDenominatorRatio1() {
        HollowBastion subject = new HollowBastion();
        assertThrows(ArithmeticException.class, () -> subject.tally1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio1() {
        assertEquals(0.5, new HollowBastion().tally1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio1() {
        assertEquals(2.0, new HollowBastion().tally1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally2() {
        assertTrue(new HollowBastion().hoist2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new HollowBastion().hoist2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally2() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowBastion().hoist2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset3() {
        assertEquals("below", new HollowBastion().collate3(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset3() {
        HollowBastion subject = new HollowBastion();
        assertEquals("lower-bound", subject.collate3(5));
        assertEquals("upper-bound", subject.collate3(10));
    }

    @Test
    void classifiesWithinAndAboveOffset3() {
        HollowBastion subject = new HollowBastion();
        assertEquals("within", subject.collate3(5 + 1));
        assertEquals("above", subject.collate3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota4() {
        HollowBastion subject = new HollowBastion();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile4());
        }
        assertEquals(1, subject.span4Count());
    }

    @Test
    void refusesOnceExhaustedQuota4() {
        HollowBastion subject = new HollowBastion();
        for (int i = 0; i < 1; i++) {
            subject.reconcile4();
        }
        assertFalse(subject.reconcile4());
    }

    @Test
    void accumulatesBelowTheCapOffset5() {
        HollowBastion subject = new HollowBastion();
        assertEquals(1, subject.collate5(1));
        assertEquals(3, subject.collate5(2));
    }

    @Test
    void saturatesAtTheCapOffset5() {
        HollowBastion subject = new HollowBastion();
        subject.collate5(25);
        assertEquals(25, subject.collate5(5));
    }

    @Test
    void ignoresNegativeValuesOffset5() {
        HollowBastion subject = new HollowBastion();
        subject.collate5(3);
        assertEquals(3, subject.collate5(-2));
        assertEquals(3, subject.drift5Value());
    }

    @Test
    void rejectsZeroDenominatorWeight6() {
        HollowBastion subject = new HollowBastion();
        assertThrows(ArithmeticException.class, () -> subject.furl6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight6() {
        assertEquals(0.5, new HollowBastion().furl6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight6() {
        assertEquals(2.0, new HollowBastion().furl6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity7() {
        assertTrue(new HollowBastion().sift7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new HollowBastion().sift7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity7() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowBastion().sift7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio8() {
        assertEquals("below", new HollowBastion().furl8(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio8() {
        HollowBastion subject = new HollowBastion();
        assertEquals("lower-bound", subject.furl8(2));
        assertEquals("upper-bound", subject.furl8(9));
    }

    @Test
    void classifiesWithinAndAboveRatio8() {
        HollowBastion subject = new HollowBastion();
        assertEquals("within", subject.furl8(2 + 1));
        assertEquals("above", subject.furl8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity9() {
        HollowBastion subject = new HollowBastion();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace9());
        }
        assertEquals(2, subject.drift9Count());
    }

    @Test
    void refusesOnceExhaustedCapacity9() {
        HollowBastion subject = new HollowBastion();
        for (int i = 0; i < 2; i++) {
            subject.brace9();
        }
        assertFalse(subject.brace9());
    }

    @Test
    void accumulatesBelowTheCapRatio10() {
        HollowBastion subject = new HollowBastion();
        assertEquals(1, subject.reconcile10(1));
        assertEquals(3, subject.reconcile10(2));
    }

    @Test
    void saturatesAtTheCapRatio10() {
        HollowBastion subject = new HollowBastion();
        subject.reconcile10(30);
        assertEquals(30, subject.reconcile10(5));
    }

    @Test
    void ignoresNegativeValuesRatio10() {
        HollowBastion subject = new HollowBastion();
        subject.reconcile10(3);
        assertEquals(3, subject.reconcile10(-2));
        assertEquals(3, subject.span10Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold11() {
        HollowBastion subject = new HollowBastion();
        assertThrows(ArithmeticException.class, () -> subject.tally11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold11() {
        assertEquals(0.5, new HollowBastion().tally11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold11() {
        assertEquals(2.0, new HollowBastion().tally11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield12() {
        assertTrue(new HollowBastion().prune12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new HollowBastion().prune12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield12() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowBastion().prune12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth13() {
        assertEquals("below", new HollowBastion().sift13(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth13() {
        HollowBastion subject = new HollowBastion();
        assertEquals("lower-bound", subject.sift13(3));
        assertEquals("upper-bound", subject.sift13(8));
    }

    @Test
    void classifiesWithinAndAboveDepth13() {
        HollowBastion subject = new HollowBastion();
        assertEquals("within", subject.sift13(3 + 1));
        assertEquals("above", subject.sift13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio14() {
        HollowBastion subject = new HollowBastion();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow14());
        }
        assertEquals(3, subject.offset14Count());
    }

    @Test
    void refusesOnceExhaustedRatio14() {
        HollowBastion subject = new HollowBastion();
        for (int i = 0; i < 3; i++) {
            subject.winnow14();
        }
        assertFalse(subject.winnow14());
    }

    @Test
    void accumulatesBelowTheCapWeight15() {
        HollowBastion subject = new HollowBastion();
        assertEquals(1, subject.prune15(1));
        assertEquals(3, subject.prune15(2));
    }

    @Test
    void saturatesAtTheCapWeight15() {
        HollowBastion subject = new HollowBastion();
        subject.prune15(35);
        assertEquals(35, subject.prune15(5));
    }

    @Test
    void ignoresNegativeValuesWeight15() {
        HollowBastion subject = new HollowBastion();
        subject.prune15(3);
        assertEquals(3, subject.prune15(-2));
        assertEquals(3, subject.offset15Value());
    }

    @Test
    void rejectsZeroDenominatorTally16() {
        HollowBastion subject = new HollowBastion();
        assertThrows(ArithmeticException.class, () -> subject.reconcile16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally16() {
        assertEquals(0.5, new HollowBastion().reconcile16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally16() {
        assertEquals(2.0, new HollowBastion().reconcile16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity17() {
        assertTrue(new HollowBastion().winnow17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new HollowBastion().winnow17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity17() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowBastion().winnow17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio18() {
        assertEquals("below", new HollowBastion().winnow18(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio18() {
        HollowBastion subject = new HollowBastion();
        assertEquals("lower-bound", subject.winnow18(4));
        assertEquals("upper-bound", subject.winnow18(7));
    }

    @Test
    void classifiesWithinAndAboveRatio18() {
        HollowBastion subject = new HollowBastion();
        assertEquals("within", subject.winnow18(4 + 1));
        assertEquals("above", subject.winnow18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift19() {
        HollowBastion subject = new HollowBastion();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile19());
        }
        assertEquals(4, subject.offset19Count());
    }

    @Test
    void refusesOnceExhaustedDrift19() {
        HollowBastion subject = new HollowBastion();
        for (int i = 0; i < 4; i++) {
            subject.reconcile19();
        }
        assertFalse(subject.reconcile19());
    }

    @Test
    void accumulatesBelowTheCapThreshold20() {
        HollowBastion subject = new HollowBastion();
        assertEquals(1, subject.tally20(1));
        assertEquals(3, subject.tally20(2));
    }

    @Test
    void saturatesAtTheCapThreshold20() {
        HollowBastion subject = new HollowBastion();
        subject.tally20(40);
        assertEquals(40, subject.tally20(5));
    }

    @Test
    void ignoresNegativeValuesThreshold20() {
        HollowBastion subject = new HollowBastion();
        subject.tally20(3);
        assertEquals(3, subject.tally20(-2));
        assertEquals(3, subject.offset20Value());
    }
}
