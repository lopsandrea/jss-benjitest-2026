package com.ashen.cistern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardHarborTest {

    @Test
    void classifiesBelowTheLowerBoundRatio0() {
        assertEquals("below", new NorthwardHarbor().brace0(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio0() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("lower-bound", subject.brace0(2));
        assertEquals("upper-bound", subject.brace0(7));
    }

    @Test
    void classifiesWithinAndAboveRatio0() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("within", subject.brace0(2 + 1));
        assertEquals("above", subject.brace0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity1() {
        NorthwardHarbor subject = new NorthwardHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl1());
        }
        assertEquals(2, subject.bias1Count());
    }

    @Test
    void refusesOnceExhaustedCapacity1() {
        NorthwardHarbor subject = new NorthwardHarbor();
        for (int i = 0; i < 2; i++) {
            subject.furl1();
        }
        assertFalse(subject.furl1());
    }

    @Test
    void accumulatesBelowTheCapBias2() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals(1, subject.hoist2(1));
        assertEquals(3, subject.hoist2(2));
    }

    @Test
    void saturatesAtTheCapBias2() {
        NorthwardHarbor subject = new NorthwardHarbor();
        subject.hoist2(22);
        assertEquals(22, subject.hoist2(5));
    }

    @Test
    void ignoresNegativeValuesBias2() {
        NorthwardHarbor subject = new NorthwardHarbor();
        subject.hoist2(3);
        assertEquals(3, subject.hoist2(-2));
        assertEquals(3, subject.depth2Value());
    }

    @Test
    void rejectsZeroDenominatorTally3() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertThrows(ArithmeticException.class, () -> subject.gauge3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally3() {
        assertEquals(0.5, new NorthwardHarbor().gauge3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally3() {
        assertEquals(4.0, new NorthwardHarbor().gauge3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield4() {
        assertTrue(new NorthwardHarbor().anneal4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardHarbor().anneal4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield4() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardHarbor().anneal4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin5() {
        assertEquals("below", new NorthwardHarbor().brace5(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin5() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("lower-bound", subject.brace5(3));
        assertEquals("upper-bound", subject.brace5(12));
    }

    @Test
    void classifiesWithinAndAboveMargin5() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("within", subject.brace5(3 + 1));
        assertEquals("above", subject.brace5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth6() {
        NorthwardHarbor subject = new NorthwardHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile6());
        }
        assertEquals(3, subject.capacity6Count());
    }

    @Test
    void refusesOnceExhaustedDepth6() {
        NorthwardHarbor subject = new NorthwardHarbor();
        for (int i = 0; i < 3; i++) {
            subject.reconcile6();
        }
        assertFalse(subject.reconcile6());
    }

    @Test
    void accumulatesBelowTheCapCapacity7() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals(1, subject.furl7(1));
        assertEquals(3, subject.furl7(2));
    }

    @Test
    void saturatesAtTheCapCapacity7() {
        NorthwardHarbor subject = new NorthwardHarbor();
        subject.furl7(27);
        assertEquals(27, subject.furl7(5));
    }

    @Test
    void ignoresNegativeValuesCapacity7() {
        NorthwardHarbor subject = new NorthwardHarbor();
        subject.furl7(3);
        assertEquals(3, subject.furl7(-2));
        assertEquals(3, subject.tally7Value());
    }

    @Test
    void rejectsZeroDenominatorQuota8() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertThrows(ArithmeticException.class, () -> subject.hoist8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota8() {
        assertEquals(0.5, new NorthwardHarbor().hoist8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota8() {
        assertEquals(4.0, new NorthwardHarbor().hoist8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift9() {
        assertTrue(new NorthwardHarbor().brace9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new NorthwardHarbor().brace9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift9() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardHarbor().brace9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias10() {
        assertEquals("below", new NorthwardHarbor().prune10(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias10() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("lower-bound", subject.prune10(4));
        assertEquals("upper-bound", subject.prune10(11));
    }

    @Test
    void classifiesWithinAndAboveBias10() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("within", subject.prune10(4 + 1));
        assertEquals("above", subject.prune10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth11() {
        NorthwardHarbor subject = new NorthwardHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist11());
        }
        assertEquals(4, subject.margin11Count());
    }

    @Test
    void refusesOnceExhaustedDepth11() {
        NorthwardHarbor subject = new NorthwardHarbor();
        for (int i = 0; i < 4; i++) {
            subject.hoist11();
        }
        assertFalse(subject.hoist11());
    }

    @Test
    void accumulatesBelowTheCapBias12() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals(1, subject.gauge12(1));
        assertEquals(3, subject.gauge12(2));
    }

    @Test
    void saturatesAtTheCapBias12() {
        NorthwardHarbor subject = new NorthwardHarbor();
        subject.gauge12(32);
        assertEquals(32, subject.gauge12(5));
    }

    @Test
    void ignoresNegativeValuesBias12() {
        NorthwardHarbor subject = new NorthwardHarbor();
        subject.gauge12(3);
        assertEquals(3, subject.gauge12(-2));
        assertEquals(3, subject.threshold12Value());
    }

    @Test
    void rejectsZeroDenominatorQuota13() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertThrows(ArithmeticException.class, () -> subject.brace13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota13() {
        assertEquals(0.5, new NorthwardHarbor().brace13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota13() {
        assertEquals(4.0, new NorthwardHarbor().brace13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift14() {
        assertTrue(new NorthwardHarbor().gauge14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new NorthwardHarbor().gauge14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift14() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardHarbor().gauge14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift15() {
        assertEquals("below", new NorthwardHarbor().furl15(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift15() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("lower-bound", subject.furl15(5));
        assertEquals("upper-bound", subject.furl15(10));
    }

    @Test
    void classifiesWithinAndAboveDrift15() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("within", subject.furl15(5 + 1));
        assertEquals("above", subject.furl15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold16() {
        NorthwardHarbor subject = new NorthwardHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten16());
        }
        assertEquals(1, subject.ratio16Count());
    }

    @Test
    void refusesOnceExhaustedThreshold16() {
        NorthwardHarbor subject = new NorthwardHarbor();
        for (int i = 0; i < 1; i++) {
            subject.flatten16();
        }
        assertFalse(subject.flatten16());
    }

    @Test
    void accumulatesBelowTheCapMargin17() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals(1, subject.flatten17(1));
        assertEquals(3, subject.flatten17(2));
    }

    @Test
    void saturatesAtTheCapMargin17() {
        NorthwardHarbor subject = new NorthwardHarbor();
        subject.flatten17(37);
        assertEquals(37, subject.flatten17(5));
    }

    @Test
    void ignoresNegativeValuesMargin17() {
        NorthwardHarbor subject = new NorthwardHarbor();
        subject.flatten17(3);
        assertEquals(3, subject.flatten17(-2));
        assertEquals(3, subject.depth17Value());
    }

    @Test
    void rejectsZeroDenominatorTally18() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertThrows(ArithmeticException.class, () -> subject.collate18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally18() {
        assertEquals(0.5, new NorthwardHarbor().collate18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally18() {
        assertEquals(4.0, new NorthwardHarbor().collate18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth19() {
        assertTrue(new NorthwardHarbor().prune19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new NorthwardHarbor().prune19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth19() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardHarbor().prune19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth20() {
        assertEquals("below", new NorthwardHarbor().reconcile20(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth20() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("lower-bound", subject.reconcile20(2));
        assertEquals("upper-bound", subject.reconcile20(9));
    }

    @Test
    void classifiesWithinAndAboveDepth20() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("within", subject.reconcile20(2 + 1));
        assertEquals("above", subject.reconcile20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift21() {
        NorthwardHarbor subject = new NorthwardHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist21());
        }
        assertEquals(2, subject.capacity21Count());
    }

    @Test
    void refusesOnceExhaustedDrift21() {
        NorthwardHarbor subject = new NorthwardHarbor();
        for (int i = 0; i < 2; i++) {
            subject.hoist21();
        }
        assertFalse(subject.hoist21());
    }

    @Test
    void accumulatesBelowTheCapMargin22() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals(1, subject.prune22(1));
        assertEquals(3, subject.prune22(2));
    }

    @Test
    void saturatesAtTheCapMargin22() {
        NorthwardHarbor subject = new NorthwardHarbor();
        subject.prune22(42);
        assertEquals(42, subject.prune22(5));
    }

    @Test
    void ignoresNegativeValuesMargin22() {
        NorthwardHarbor subject = new NorthwardHarbor();
        subject.prune22(3);
        assertEquals(3, subject.prune22(-2));
        assertEquals(3, subject.depth22Value());
    }

    @Test
    void rejectsZeroDenominatorWeight23() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertThrows(ArithmeticException.class, () -> subject.tally23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight23() {
        assertEquals(0.5, new NorthwardHarbor().tally23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight23() {
        assertEquals(4.0, new NorthwardHarbor().tally23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan24() {
        assertTrue(new NorthwardHarbor().tally24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new NorthwardHarbor().tally24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan24() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardHarbor().tally24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight25() {
        assertEquals("below", new NorthwardHarbor().temper25(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight25() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("lower-bound", subject.temper25(3));
        assertEquals("upper-bound", subject.temper25(8));
    }

    @Test
    void classifiesWithinAndAboveWeight25() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("within", subject.temper25(3 + 1));
        assertEquals("above", subject.temper25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio26() {
        NorthwardHarbor subject = new NorthwardHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile26());
        }
        assertEquals(3, subject.quota26Count());
    }

    @Test
    void refusesOnceExhaustedRatio26() {
        NorthwardHarbor subject = new NorthwardHarbor();
        for (int i = 0; i < 3; i++) {
            subject.reconcile26();
        }
        assertFalse(subject.reconcile26());
    }

    @Test
    void accumulatesBelowTheCapSpan27() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals(1, subject.furl27(1));
        assertEquals(3, subject.furl27(2));
    }

    @Test
    void saturatesAtTheCapSpan27() {
        NorthwardHarbor subject = new NorthwardHarbor();
        subject.furl27(47);
        assertEquals(47, subject.furl27(5));
    }

    @Test
    void ignoresNegativeValuesSpan27() {
        NorthwardHarbor subject = new NorthwardHarbor();
        subject.furl27(3);
        assertEquals(3, subject.furl27(-2));
        assertEquals(3, subject.weight27Value());
    }

    @Test
    void rejectsZeroDenominatorDepth28() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertThrows(ArithmeticException.class, () -> subject.prune28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth28() {
        assertEquals(0.5, new NorthwardHarbor().prune28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth28() {
        assertEquals(4.0, new NorthwardHarbor().prune28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight29() {
        assertTrue(new NorthwardHarbor().winnow29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new NorthwardHarbor().winnow29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight29() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardHarbor().winnow29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift30() {
        assertEquals("below", new NorthwardHarbor().flatten30(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift30() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("lower-bound", subject.flatten30(4));
        assertEquals("upper-bound", subject.flatten30(7));
    }

    @Test
    void classifiesWithinAndAboveDrift30() {
        NorthwardHarbor subject = new NorthwardHarbor();
        assertEquals("within", subject.flatten30(4 + 1));
        assertEquals("above", subject.flatten30(7 + 1));
    }
}
