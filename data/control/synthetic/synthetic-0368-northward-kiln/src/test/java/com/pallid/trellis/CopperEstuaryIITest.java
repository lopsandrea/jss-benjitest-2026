package com.pallid.trellis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperEstuaryIITest {

    @Test
    void classifiesBelowTheLowerBoundDepth0() {
        assertEquals("below", new CopperEstuaryII().flatten0(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth0() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("lower-bound", subject.flatten0(2));
        assertEquals("upper-bound", subject.flatten0(7));
    }

    @Test
    void classifiesWithinAndAboveDepth0() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("within", subject.flatten0(2 + 1));
        assertEquals("above", subject.flatten0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio1() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift1());
        }
        assertEquals(2, subject.weight1Count());
    }

    @Test
    void refusesOnceExhaustedRatio1() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 2; i++) {
            subject.sift1();
        }
        assertFalse(subject.sift1());
    }

    @Test
    void accumulatesBelowTheCapCapacity2() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals(1, subject.winnow2(1));
        assertEquals(3, subject.winnow2(2));
    }

    @Test
    void saturatesAtTheCapCapacity2() {
        CopperEstuaryII subject = new CopperEstuaryII();
        subject.winnow2(22);
        assertEquals(22, subject.winnow2(5));
    }

    @Test
    void ignoresNegativeValuesCapacity2() {
        CopperEstuaryII subject = new CopperEstuaryII();
        subject.winnow2(3);
        assertEquals(3, subject.winnow2(-2));
        assertEquals(3, subject.drift2Value());
    }

    @Test
    void rejectsZeroDenominatorRatio3() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.temper3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio3() {
        assertEquals(0.5, new CopperEstuaryII().temper3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio3() {
        assertEquals(4.0, new CopperEstuaryII().temper3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth4() {
        assertTrue(new CopperEstuaryII().hoist4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new CopperEstuaryII().hoist4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth4() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperEstuaryII().hoist4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift5() {
        assertEquals("below", new CopperEstuaryII().temper5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift5() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("lower-bound", subject.temper5(3));
        assertEquals("upper-bound", subject.temper5(12));
    }

    @Test
    void classifiesWithinAndAboveDrift5() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("within", subject.temper5(3 + 1));
        assertEquals("above", subject.temper5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota6() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl6());
        }
        assertEquals(3, subject.cadence6Count());
    }

    @Test
    void refusesOnceExhaustedQuota6() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 3; i++) {
            subject.furl6();
        }
        assertFalse(subject.furl6());
    }

    @Test
    void accumulatesBelowTheCapDrift7() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals(1, subject.kindle7(1));
        assertEquals(3, subject.kindle7(2));
    }

    @Test
    void saturatesAtTheCapDrift7() {
        CopperEstuaryII subject = new CopperEstuaryII();
        subject.kindle7(27);
        assertEquals(27, subject.kindle7(5));
    }

    @Test
    void ignoresNegativeValuesDrift7() {
        CopperEstuaryII subject = new CopperEstuaryII();
        subject.kindle7(3);
        assertEquals(3, subject.kindle7(-2));
        assertEquals(3, subject.yield7Value());
    }

    @Test
    void rejectsZeroDenominatorMargin8() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.sift8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin8() {
        assertEquals(0.5, new CopperEstuaryII().sift8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin8() {
        assertEquals(4.0, new CopperEstuaryII().sift8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota9() {
        assertTrue(new CopperEstuaryII().prune9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new CopperEstuaryII().prune9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota9() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperEstuaryII().prune9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias10() {
        assertEquals("below", new CopperEstuaryII().gauge10(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias10() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("lower-bound", subject.gauge10(4));
        assertEquals("upper-bound", subject.gauge10(11));
    }

    @Test
    void classifiesWithinAndAboveBias10() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("within", subject.gauge10(4 + 1));
        assertEquals("above", subject.gauge10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset11() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow11());
        }
        assertEquals(4, subject.drift11Count());
    }

    @Test
    void refusesOnceExhaustedOffset11() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 4; i++) {
            subject.winnow11();
        }
        assertFalse(subject.winnow11());
    }

    @Test
    void accumulatesBelowTheCapCapacity12() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals(1, subject.hoist12(1));
        assertEquals(3, subject.hoist12(2));
    }

    @Test
    void saturatesAtTheCapCapacity12() {
        CopperEstuaryII subject = new CopperEstuaryII();
        subject.hoist12(32);
        assertEquals(32, subject.hoist12(5));
    }

    @Test
    void ignoresNegativeValuesCapacity12() {
        CopperEstuaryII subject = new CopperEstuaryII();
        subject.hoist12(3);
        assertEquals(3, subject.hoist12(-2));
        assertEquals(3, subject.tally12Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity13() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.flatten13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity13() {
        assertEquals(0.5, new CopperEstuaryII().flatten13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity13() {
        assertEquals(4.0, new CopperEstuaryII().flatten13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight14() {
        assertTrue(new CopperEstuaryII().kindle14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new CopperEstuaryII().kindle14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight14() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperEstuaryII().kindle14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally15() {
        assertEquals("below", new CopperEstuaryII().collate15(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally15() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("lower-bound", subject.collate15(5));
        assertEquals("upper-bound", subject.collate15(10));
    }

    @Test
    void classifiesWithinAndAboveTally15() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("within", subject.collate15(5 + 1));
        assertEquals("above", subject.collate15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio16() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace16());
        }
        assertEquals(1, subject.bias16Count());
    }

    @Test
    void refusesOnceExhaustedRatio16() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 1; i++) {
            subject.brace16();
        }
        assertFalse(subject.brace16());
    }

    @Test
    void accumulatesBelowTheCapThreshold17() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals(1, subject.winnow17(1));
        assertEquals(3, subject.winnow17(2));
    }

    @Test
    void saturatesAtTheCapThreshold17() {
        CopperEstuaryII subject = new CopperEstuaryII();
        subject.winnow17(37);
        assertEquals(37, subject.winnow17(5));
    }

    @Test
    void ignoresNegativeValuesThreshold17() {
        CopperEstuaryII subject = new CopperEstuaryII();
        subject.winnow17(3);
        assertEquals(3, subject.winnow17(-2));
        assertEquals(3, subject.cadence17Value());
    }

    @Test
    void rejectsZeroDenominatorOffset18() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset18() {
        assertEquals(0.5, new CopperEstuaryII().hoist18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset18() {
        assertEquals(4.0, new CopperEstuaryII().hoist18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan19() {
        assertTrue(new CopperEstuaryII().kindle19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new CopperEstuaryII().kindle19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan19() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperEstuaryII().kindle19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence20() {
        assertEquals("below", new CopperEstuaryII().brace20(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence20() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("lower-bound", subject.brace20(2));
        assertEquals("upper-bound", subject.brace20(9));
    }

    @Test
    void classifiesWithinAndAboveCadence20() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("within", subject.brace20(2 + 1));
        assertEquals("above", subject.brace20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias21() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow21());
        }
        assertEquals(2, subject.offset21Count());
    }

    @Test
    void refusesOnceExhaustedBias21() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 2; i++) {
            subject.winnow21();
        }
        assertFalse(subject.winnow21());
    }

    @Test
    void accumulatesBelowTheCapMargin22() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals(1, subject.winnow22(1));
        assertEquals(3, subject.winnow22(2));
    }

    @Test
    void saturatesAtTheCapMargin22() {
        CopperEstuaryII subject = new CopperEstuaryII();
        subject.winnow22(42);
        assertEquals(42, subject.winnow22(5));
    }

    @Test
    void ignoresNegativeValuesMargin22() {
        CopperEstuaryII subject = new CopperEstuaryII();
        subject.winnow22(3);
        assertEquals(3, subject.winnow22(-2));
        assertEquals(3, subject.depth22Value());
    }

    @Test
    void rejectsZeroDenominatorDrift23() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift23() {
        assertEquals(0.5, new CopperEstuaryII().reconcile23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift23() {
        assertEquals(4.0, new CopperEstuaryII().reconcile23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset24() {
        assertTrue(new CopperEstuaryII().collate24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new CopperEstuaryII().collate24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset24() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperEstuaryII().collate24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin25() {
        assertEquals("below", new CopperEstuaryII().hoist25(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin25() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("lower-bound", subject.hoist25(3));
        assertEquals("upper-bound", subject.hoist25(8));
    }

    @Test
    void classifiesWithinAndAboveMargin25() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("within", subject.hoist25(3 + 1));
        assertEquals("above", subject.hoist25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth26() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune26());
        }
        assertEquals(3, subject.weight26Count());
    }

    @Test
    void refusesOnceExhaustedDepth26() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 3; i++) {
            subject.prune26();
        }
        assertFalse(subject.prune26());
    }

    @Test
    void accumulatesBelowTheCapDepth27() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals(1, subject.reconcile27(1));
        assertEquals(3, subject.reconcile27(2));
    }

    @Test
    void saturatesAtTheCapDepth27() {
        CopperEstuaryII subject = new CopperEstuaryII();
        subject.reconcile27(47);
        assertEquals(47, subject.reconcile27(5));
    }

    @Test
    void ignoresNegativeValuesDepth27() {
        CopperEstuaryII subject = new CopperEstuaryII();
        subject.reconcile27(3);
        assertEquals(3, subject.reconcile27(-2));
        assertEquals(3, subject.threshold27Value());
    }

    @Test
    void rejectsZeroDenominatorSpan28() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan28() {
        assertEquals(0.5, new CopperEstuaryII().anneal28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan28() {
        assertEquals(4.0, new CopperEstuaryII().anneal28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth29() {
        assertTrue(new CopperEstuaryII().reconcile29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new CopperEstuaryII().reconcile29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth29() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperEstuaryII().reconcile29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth30() {
        assertEquals("below", new CopperEstuaryII().sift30(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth30() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("lower-bound", subject.sift30(4));
        assertEquals("upper-bound", subject.sift30(7));
    }

    @Test
    void classifiesWithinAndAboveDepth30() {
        CopperEstuaryII subject = new CopperEstuaryII();
        assertEquals("within", subject.sift30(4 + 1));
        assertEquals("above", subject.sift30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth31() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist31());
        }
        assertEquals(4, subject.cadence31Count());
    }

    @Test
    void refusesOnceExhaustedDepth31() {
        CopperEstuaryII subject = new CopperEstuaryII();
        for (int i = 0; i < 4; i++) {
            subject.hoist31();
        }
        assertFalse(subject.hoist31());
    }
}
