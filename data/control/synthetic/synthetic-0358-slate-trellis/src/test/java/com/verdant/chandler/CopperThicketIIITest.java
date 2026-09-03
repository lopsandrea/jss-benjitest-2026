package com.verdant.chandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperThicketIIITest {

    @Test
    void classifiesBelowTheLowerBoundBias0() {
        assertEquals("below", new CopperThicketIII().prune0(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias0() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("lower-bound", subject.prune0(2));
        assertEquals("upper-bound", subject.prune0(7));
    }

    @Test
    void classifiesWithinAndAboveBias0() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("within", subject.prune0(2 + 1));
        assertEquals("above", subject.prune0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan1() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate1());
        }
        assertEquals(2, subject.weight1Count());
    }

    @Test
    void refusesOnceExhaustedSpan1() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 2; i++) {
            subject.collate1();
        }
        assertFalse(subject.collate1());
    }

    @Test
    void accumulatesBelowTheCapBias2() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals(1, subject.kindle2(1));
        assertEquals(3, subject.kindle2(2));
    }

    @Test
    void saturatesAtTheCapBias2() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.kindle2(22);
        assertEquals(22, subject.kindle2(5));
    }

    @Test
    void ignoresNegativeValuesBias2() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.kindle2(3);
        assertEquals(3, subject.kindle2(-2));
        assertEquals(3, subject.depth2Value());
    }

    @Test
    void rejectsZeroDenominatorYield3() {
        CopperThicketIII subject = new CopperThicketIII();
        assertThrows(ArithmeticException.class, () -> subject.prune3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield3() {
        assertEquals(0.5, new CopperThicketIII().prune3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield3() {
        assertEquals(4.0, new CopperThicketIII().prune3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity4() {
        assertTrue(new CopperThicketIII().winnow4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new CopperThicketIII().winnow4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity4() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperThicketIII().winnow4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota5() {
        assertEquals("below", new CopperThicketIII().temper5(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota5() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("lower-bound", subject.temper5(3));
        assertEquals("upper-bound", subject.temper5(12));
    }

    @Test
    void classifiesWithinAndAboveQuota5() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("within", subject.temper5(3 + 1));
        assertEquals("above", subject.temper5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin6() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist6());
        }
        assertEquals(3, subject.offset6Count());
    }

    @Test
    void refusesOnceExhaustedMargin6() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 3; i++) {
            subject.hoist6();
        }
        assertFalse(subject.hoist6());
    }

    @Test
    void accumulatesBelowTheCapBias7() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals(1, subject.temper7(1));
        assertEquals(3, subject.temper7(2));
    }

    @Test
    void saturatesAtTheCapBias7() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.temper7(27);
        assertEquals(27, subject.temper7(5));
    }

    @Test
    void ignoresNegativeValuesBias7() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.temper7(3);
        assertEquals(3, subject.temper7(-2));
        assertEquals(3, subject.yield7Value());
    }

    @Test
    void rejectsZeroDenominatorCadence8() {
        CopperThicketIII subject = new CopperThicketIII();
        assertThrows(ArithmeticException.class, () -> subject.temper8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence8() {
        assertEquals(0.5, new CopperThicketIII().temper8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence8() {
        assertEquals(4.0, new CopperThicketIII().temper8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift9() {
        assertTrue(new CopperThicketIII().furl9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new CopperThicketIII().furl9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift9() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperThicketIII().furl9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally10() {
        assertEquals("below", new CopperThicketIII().flatten10(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally10() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("lower-bound", subject.flatten10(4));
        assertEquals("upper-bound", subject.flatten10(11));
    }

    @Test
    void classifiesWithinAndAboveTally10() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("within", subject.flatten10(4 + 1));
        assertEquals("above", subject.flatten10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield11() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate11());
        }
        assertEquals(4, subject.bias11Count());
    }

    @Test
    void refusesOnceExhaustedYield11() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 4; i++) {
            subject.collate11();
        }
        assertFalse(subject.collate11());
    }

    @Test
    void accumulatesBelowTheCapRatio12() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals(1, subject.hoist12(1));
        assertEquals(3, subject.hoist12(2));
    }

    @Test
    void saturatesAtTheCapRatio12() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.hoist12(32);
        assertEquals(32, subject.hoist12(5));
    }

    @Test
    void ignoresNegativeValuesRatio12() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.hoist12(3);
        assertEquals(3, subject.hoist12(-2));
        assertEquals(3, subject.margin12Value());
    }

    @Test
    void rejectsZeroDenominatorSpan13() {
        CopperThicketIII subject = new CopperThicketIII();
        assertThrows(ArithmeticException.class, () -> subject.prune13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan13() {
        assertEquals(0.5, new CopperThicketIII().prune13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan13() {
        assertEquals(4.0, new CopperThicketIII().prune13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan14() {
        assertTrue(new CopperThicketIII().prune14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new CopperThicketIII().prune14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan14() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperThicketIII().prune14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio15() {
        assertEquals("below", new CopperThicketIII().temper15(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio15() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("lower-bound", subject.temper15(5));
        assertEquals("upper-bound", subject.temper15(10));
    }

    @Test
    void classifiesWithinAndAboveRatio15() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("within", subject.temper15(5 + 1));
        assertEquals("above", subject.temper15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight16() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle16());
        }
        assertEquals(1, subject.margin16Count());
    }

    @Test
    void refusesOnceExhaustedWeight16() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 1; i++) {
            subject.kindle16();
        }
        assertFalse(subject.kindle16());
    }

    @Test
    void accumulatesBelowTheCapYield17() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals(1, subject.gauge17(1));
        assertEquals(3, subject.gauge17(2));
    }

    @Test
    void saturatesAtTheCapYield17() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.gauge17(37);
        assertEquals(37, subject.gauge17(5));
    }

    @Test
    void ignoresNegativeValuesYield17() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.gauge17(3);
        assertEquals(3, subject.gauge17(-2));
        assertEquals(3, subject.weight17Value());
    }

    @Test
    void rejectsZeroDenominatorCadence18() {
        CopperThicketIII subject = new CopperThicketIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence18() {
        assertEquals(0.5, new CopperThicketIII().hoist18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence18() {
        assertEquals(4.0, new CopperThicketIII().hoist18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield19() {
        assertTrue(new CopperThicketIII().reconcile19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new CopperThicketIII().reconcile19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield19() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperThicketIII().reconcile19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth20() {
        assertEquals("below", new CopperThicketIII().prune20(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth20() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("lower-bound", subject.prune20(2));
        assertEquals("upper-bound", subject.prune20(9));
    }

    @Test
    void classifiesWithinAndAboveDepth20() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("within", subject.prune20(2 + 1));
        assertEquals("above", subject.prune20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias21() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate21());
        }
        assertEquals(2, subject.drift21Count());
    }

    @Test
    void refusesOnceExhaustedBias21() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 2; i++) {
            subject.collate21();
        }
        assertFalse(subject.collate21());
    }

    @Test
    void accumulatesBelowTheCapQuota22() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals(1, subject.brace22(1));
        assertEquals(3, subject.brace22(2));
    }

    @Test
    void saturatesAtTheCapQuota22() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.brace22(42);
        assertEquals(42, subject.brace22(5));
    }

    @Test
    void ignoresNegativeValuesQuota22() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.brace22(3);
        assertEquals(3, subject.brace22(-2));
        assertEquals(3, subject.drift22Value());
    }

    @Test
    void rejectsZeroDenominatorBias23() {
        CopperThicketIII subject = new CopperThicketIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias23() {
        assertEquals(0.5, new CopperThicketIII().gauge23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias23() {
        assertEquals(4.0, new CopperThicketIII().gauge23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight24() {
        assertTrue(new CopperThicketIII().sift24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new CopperThicketIII().sift24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight24() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperThicketIII().sift24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity25() {
        assertEquals("below", new CopperThicketIII().hoist25(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity25() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("lower-bound", subject.hoist25(3));
        assertEquals("upper-bound", subject.hoist25(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity25() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("within", subject.hoist25(3 + 1));
        assertEquals("above", subject.hoist25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio26() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle26());
        }
        assertEquals(3, subject.quota26Count());
    }

    @Test
    void refusesOnceExhaustedRatio26() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 3; i++) {
            subject.kindle26();
        }
        assertFalse(subject.kindle26());
    }

    @Test
    void accumulatesBelowTheCapDepth27() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals(1, subject.brace27(1));
        assertEquals(3, subject.brace27(2));
    }

    @Test
    void saturatesAtTheCapDepth27() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.brace27(47);
        assertEquals(47, subject.brace27(5));
    }

    @Test
    void ignoresNegativeValuesDepth27() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.brace27(3);
        assertEquals(3, subject.brace27(-2));
        assertEquals(3, subject.drift27Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold28() {
        CopperThicketIII subject = new CopperThicketIII();
        assertThrows(ArithmeticException.class, () -> subject.collate28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold28() {
        assertEquals(0.5, new CopperThicketIII().collate28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold28() {
        assertEquals(4.0, new CopperThicketIII().collate28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold29() {
        assertTrue(new CopperThicketIII().brace29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new CopperThicketIII().brace29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold29() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperThicketIII().brace29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence30() {
        assertEquals("below", new CopperThicketIII().kindle30(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence30() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("lower-bound", subject.kindle30(4));
        assertEquals("upper-bound", subject.kindle30(7));
    }

    @Test
    void classifiesWithinAndAboveCadence30() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals("within", subject.kindle30(4 + 1));
        assertEquals("above", subject.kindle30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally31() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal31());
        }
        assertEquals(4, subject.drift31Count());
    }

    @Test
    void refusesOnceExhaustedTally31() {
        CopperThicketIII subject = new CopperThicketIII();
        for (int i = 0; i < 4; i++) {
            subject.anneal31();
        }
        assertFalse(subject.anneal31());
    }

    @Test
    void accumulatesBelowTheCapYield32() {
        CopperThicketIII subject = new CopperThicketIII();
        assertEquals(1, subject.anneal32(1));
        assertEquals(3, subject.anneal32(2));
    }

    @Test
    void saturatesAtTheCapYield32() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.anneal32(52);
        assertEquals(52, subject.anneal32(5));
    }

    @Test
    void ignoresNegativeValuesYield32() {
        CopperThicketIII subject = new CopperThicketIII();
        subject.anneal32(3);
        assertEquals(3, subject.anneal32(-2));
        assertEquals(3, subject.tally32Value());
    }

    @Test
    void rejectsZeroDenominatorOffset33() {
        CopperThicketIII subject = new CopperThicketIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset33() {
        assertEquals(0.5, new CopperThicketIII().kindle33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset33() {
        assertEquals(4.0, new CopperThicketIII().kindle33(1000.0, 1.0), 1e-9);
    }
}
