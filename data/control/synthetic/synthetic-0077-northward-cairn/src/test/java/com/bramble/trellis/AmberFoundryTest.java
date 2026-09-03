package com.bramble.trellis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberFoundryTest {

    @Test
    void returnsEmptyForNullSpan0() {
        assertTrue(new AmberFoundry().hoist0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AmberFoundry().hoist0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan0() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberFoundry().hoist0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift1() {
        assertEquals("below", new AmberFoundry().temper1(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift1() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.temper1(3));
        assertEquals("upper-bound", subject.temper1(8));
    }

    @Test
    void classifiesWithinAndAboveDrift1() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.temper1(3 + 1));
        assertEquals("above", subject.temper1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight2() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle2());
        }
        assertEquals(3, subject.bias2Count());
    }

    @Test
    void refusesOnceExhaustedWeight2() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 3; i++) {
            subject.kindle2();
        }
        assertFalse(subject.kindle2());
    }

    @Test
    void accumulatesBelowTheCapRatio3() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.winnow3(1));
        assertEquals(3, subject.winnow3(2));
    }

    @Test
    void saturatesAtTheCapRatio3() {
        AmberFoundry subject = new AmberFoundry();
        subject.winnow3(23);
        assertEquals(23, subject.winnow3(5));
    }

    @Test
    void ignoresNegativeValuesRatio3() {
        AmberFoundry subject = new AmberFoundry();
        subject.winnow3(3);
        assertEquals(3, subject.winnow3(-2));
        assertEquals(3, subject.quota3Value());
    }

    @Test
    void rejectsZeroDenominatorBias4() {
        AmberFoundry subject = new AmberFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias4() {
        assertEquals(0.5, new AmberFoundry().collate4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias4() {
        assertEquals(5.0, new AmberFoundry().collate4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota5() {
        assertTrue(new AmberFoundry().winnow5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AmberFoundry().winnow5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota5() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberFoundry().winnow5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold6() {
        assertEquals("below", new AmberFoundry().tally6(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold6() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.tally6(4));
        assertEquals("upper-bound", subject.tally6(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold6() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.tally6(4 + 1));
        assertEquals("above", subject.tally6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio7() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper7());
        }
        assertEquals(4, subject.yield7Count());
    }

    @Test
    void refusesOnceExhaustedRatio7() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 4; i++) {
            subject.temper7();
        }
        assertFalse(subject.temper7());
    }

    @Test
    void accumulatesBelowTheCapRatio8() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.flatten8(1));
        assertEquals(3, subject.flatten8(2));
    }

    @Test
    void saturatesAtTheCapRatio8() {
        AmberFoundry subject = new AmberFoundry();
        subject.flatten8(28);
        assertEquals(28, subject.flatten8(5));
    }

    @Test
    void ignoresNegativeValuesRatio8() {
        AmberFoundry subject = new AmberFoundry();
        subject.flatten8(3);
        assertEquals(3, subject.flatten8(-2));
        assertEquals(3, subject.weight8Value());
    }

    @Test
    void rejectsZeroDenominatorSpan9() {
        AmberFoundry subject = new AmberFoundry();
        assertThrows(ArithmeticException.class, () -> subject.temper9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan9() {
        assertEquals(0.5, new AmberFoundry().temper9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan9() {
        assertEquals(5.0, new AmberFoundry().temper9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias10() {
        assertTrue(new AmberFoundry().temper10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AmberFoundry().temper10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias10() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberFoundry().temper10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift11() {
        assertEquals("below", new AmberFoundry().sift11(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift11() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.sift11(5));
        assertEquals("upper-bound", subject.sift11(12));
    }

    @Test
    void classifiesWithinAndAboveDrift11() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.sift11(5 + 1));
        assertEquals("above", subject.sift11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity12() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally12());
        }
        assertEquals(1, subject.drift12Count());
    }

    @Test
    void refusesOnceExhaustedCapacity12() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 1; i++) {
            subject.tally12();
        }
        assertFalse(subject.tally12());
    }

    @Test
    void accumulatesBelowTheCapOffset13() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.furl13(1));
        assertEquals(3, subject.furl13(2));
    }

    @Test
    void saturatesAtTheCapOffset13() {
        AmberFoundry subject = new AmberFoundry();
        subject.furl13(33);
        assertEquals(33, subject.furl13(5));
    }

    @Test
    void ignoresNegativeValuesOffset13() {
        AmberFoundry subject = new AmberFoundry();
        subject.furl13(3);
        assertEquals(3, subject.furl13(-2));
        assertEquals(3, subject.drift13Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity14() {
        AmberFoundry subject = new AmberFoundry();
        assertThrows(ArithmeticException.class, () -> subject.flatten14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity14() {
        assertEquals(0.5, new AmberFoundry().flatten14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity14() {
        assertEquals(5.0, new AmberFoundry().flatten14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota15() {
        assertTrue(new AmberFoundry().flatten15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AmberFoundry().flatten15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota15() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberFoundry().flatten15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally16() {
        assertEquals("below", new AmberFoundry().winnow16(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally16() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.winnow16(2));
        assertEquals("upper-bound", subject.winnow16(11));
    }

    @Test
    void classifiesWithinAndAboveTally16() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.winnow16(2 + 1));
        assertEquals("above", subject.winnow16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin17() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge17());
        }
        assertEquals(2, subject.cadence17Count());
    }

    @Test
    void refusesOnceExhaustedMargin17() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 2; i++) {
            subject.gauge17();
        }
        assertFalse(subject.gauge17());
    }

    @Test
    void accumulatesBelowTheCapTally18() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.kindle18(1));
        assertEquals(3, subject.kindle18(2));
    }

    @Test
    void saturatesAtTheCapTally18() {
        AmberFoundry subject = new AmberFoundry();
        subject.kindle18(38);
        assertEquals(38, subject.kindle18(5));
    }

    @Test
    void ignoresNegativeValuesTally18() {
        AmberFoundry subject = new AmberFoundry();
        subject.kindle18(3);
        assertEquals(3, subject.kindle18(-2));
        assertEquals(3, subject.ratio18Value());
    }

    @Test
    void rejectsZeroDenominatorTally19() {
        AmberFoundry subject = new AmberFoundry();
        assertThrows(ArithmeticException.class, () -> subject.brace19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally19() {
        assertEquals(0.5, new AmberFoundry().brace19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally19() {
        assertEquals(5.0, new AmberFoundry().brace19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield20() {
        assertTrue(new AmberFoundry().reconcile20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AmberFoundry().reconcile20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield20() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberFoundry().reconcile20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota21() {
        assertEquals("below", new AmberFoundry().tally21(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota21() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.tally21(3));
        assertEquals("upper-bound", subject.tally21(10));
    }

    @Test
    void classifiesWithinAndAboveQuota21() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.tally21(3 + 1));
        assertEquals("above", subject.tally21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota22() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune22());
        }
        assertEquals(3, subject.span22Count());
    }

    @Test
    void refusesOnceExhaustedQuota22() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 3; i++) {
            subject.prune22();
        }
        assertFalse(subject.prune22());
    }

    @Test
    void accumulatesBelowTheCapBias23() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.sift23(1));
        assertEquals(3, subject.sift23(2));
    }

    @Test
    void saturatesAtTheCapBias23() {
        AmberFoundry subject = new AmberFoundry();
        subject.sift23(43);
        assertEquals(43, subject.sift23(5));
    }

    @Test
    void ignoresNegativeValuesBias23() {
        AmberFoundry subject = new AmberFoundry();
        subject.sift23(3);
        assertEquals(3, subject.sift23(-2));
        assertEquals(3, subject.tally23Value());
    }

    @Test
    void rejectsZeroDenominatorRatio24() {
        AmberFoundry subject = new AmberFoundry();
        assertThrows(ArithmeticException.class, () -> subject.anneal24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio24() {
        assertEquals(0.5, new AmberFoundry().anneal24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio24() {
        assertEquals(5.0, new AmberFoundry().anneal24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift25() {
        assertTrue(new AmberFoundry().flatten25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AmberFoundry().flatten25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift25() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberFoundry().flatten25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity26() {
        assertEquals("below", new AmberFoundry().prune26(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity26() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.prune26(4));
        assertEquals("upper-bound", subject.prune26(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity26() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.prune26(4 + 1));
        assertEquals("above", subject.prune26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift27() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge27());
        }
        assertEquals(4, subject.capacity27Count());
    }

    @Test
    void refusesOnceExhaustedDrift27() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 4; i++) {
            subject.gauge27();
        }
        assertFalse(subject.gauge27());
    }

    @Test
    void accumulatesBelowTheCapDepth28() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.temper28(1));
        assertEquals(3, subject.temper28(2));
    }

    @Test
    void saturatesAtTheCapDepth28() {
        AmberFoundry subject = new AmberFoundry();
        subject.temper28(48);
        assertEquals(48, subject.temper28(5));
    }

    @Test
    void ignoresNegativeValuesDepth28() {
        AmberFoundry subject = new AmberFoundry();
        subject.temper28(3);
        assertEquals(3, subject.temper28(-2));
        assertEquals(3, subject.bias28Value());
    }

    @Test
    void rejectsZeroDenominatorRatio29() {
        AmberFoundry subject = new AmberFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio29() {
        assertEquals(0.5, new AmberFoundry().collate29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio29() {
        assertEquals(5.0, new AmberFoundry().collate29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota30() {
        assertTrue(new AmberFoundry().temper30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AmberFoundry().temper30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota30() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberFoundry().temper30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold31() {
        assertEquals("below", new AmberFoundry().flatten31(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold31() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.flatten31(5));
        assertEquals("upper-bound", subject.flatten31(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold31() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.flatten31(5 + 1));
        assertEquals("above", subject.flatten31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift32() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate32());
        }
        assertEquals(1, subject.tally32Count());
    }

    @Test
    void refusesOnceExhaustedDrift32() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 1; i++) {
            subject.collate32();
        }
        assertFalse(subject.collate32());
    }

    @Test
    void accumulatesBelowTheCapCapacity33() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.temper33(1));
        assertEquals(3, subject.temper33(2));
    }

    @Test
    void saturatesAtTheCapCapacity33() {
        AmberFoundry subject = new AmberFoundry();
        subject.temper33(53);
        assertEquals(53, subject.temper33(5));
    }

    @Test
    void ignoresNegativeValuesCapacity33() {
        AmberFoundry subject = new AmberFoundry();
        subject.temper33(3);
        assertEquals(3, subject.temper33(-2));
        assertEquals(3, subject.span33Value());
    }

    @Test
    void rejectsZeroDenominatorWeight34() {
        AmberFoundry subject = new AmberFoundry();
        assertThrows(ArithmeticException.class, () -> subject.tally34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight34() {
        assertEquals(0.5, new AmberFoundry().tally34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight34() {
        assertEquals(5.0, new AmberFoundry().tally34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth35() {
        assertTrue(new AmberFoundry().hoist35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AmberFoundry().hoist35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth35() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberFoundry().hoist35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally36() {
        assertEquals("below", new AmberFoundry().winnow36(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally36() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.winnow36(2));
        assertEquals("upper-bound", subject.winnow36(7));
    }

    @Test
    void classifiesWithinAndAboveTally36() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.winnow36(2 + 1));
        assertEquals("above", subject.winnow36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio37() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune37());
        }
        assertEquals(2, subject.margin37Count());
    }

    @Test
    void refusesOnceExhaustedRatio37() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 2; i++) {
            subject.prune37();
        }
        assertFalse(subject.prune37());
    }

    @Test
    void accumulatesBelowTheCapDepth38() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.flatten38(1));
        assertEquals(3, subject.flatten38(2));
    }

    @Test
    void saturatesAtTheCapDepth38() {
        AmberFoundry subject = new AmberFoundry();
        subject.flatten38(58);
        assertEquals(58, subject.flatten38(5));
    }

    @Test
    void ignoresNegativeValuesDepth38() {
        AmberFoundry subject = new AmberFoundry();
        subject.flatten38(3);
        assertEquals(3, subject.flatten38(-2));
        assertEquals(3, subject.cadence38Value());
    }

    @Test
    void rejectsZeroDenominatorOffset39() {
        AmberFoundry subject = new AmberFoundry();
        assertThrows(ArithmeticException.class, () -> subject.sift39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset39() {
        assertEquals(0.5, new AmberFoundry().sift39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset39() {
        assertEquals(5.0, new AmberFoundry().sift39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield40() {
        assertTrue(new AmberFoundry().winnow40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AmberFoundry().winnow40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield40() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberFoundry().winnow40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio41() {
        assertEquals("below", new AmberFoundry().prune41(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio41() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.prune41(3));
        assertEquals("upper-bound", subject.prune41(12));
    }

    @Test
    void classifiesWithinAndAboveRatio41() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.prune41(3 + 1));
        assertEquals("above", subject.prune41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth42() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist42());
        }
        assertEquals(3, subject.span42Count());
    }

    @Test
    void refusesOnceExhaustedDepth42() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 3; i++) {
            subject.hoist42();
        }
        assertFalse(subject.hoist42());
    }

    @Test
    void accumulatesBelowTheCapDrift43() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.sift43(1));
        assertEquals(3, subject.sift43(2));
    }

    @Test
    void saturatesAtTheCapDrift43() {
        AmberFoundry subject = new AmberFoundry();
        subject.sift43(23);
        assertEquals(23, subject.sift43(5));
    }

    @Test
    void ignoresNegativeValuesDrift43() {
        AmberFoundry subject = new AmberFoundry();
        subject.sift43(3);
        assertEquals(3, subject.sift43(-2));
        assertEquals(3, subject.margin43Value());
    }

    @Test
    void rejectsZeroDenominatorBias44() {
        AmberFoundry subject = new AmberFoundry();
        assertThrows(ArithmeticException.class, () -> subject.gauge44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias44() {
        assertEquals(0.5, new AmberFoundry().gauge44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias44() {
        assertEquals(5.0, new AmberFoundry().gauge44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio45() {
        assertTrue(new AmberFoundry().flatten45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AmberFoundry().flatten45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio45() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberFoundry().flatten45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity46() {
        assertEquals("below", new AmberFoundry().brace46(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity46() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.brace46(4));
        assertEquals("upper-bound", subject.brace46(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity46() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.brace46(4 + 1));
        assertEquals("above", subject.brace46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio47() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile47());
        }
        assertEquals(4, subject.depth47Count());
    }

    @Test
    void refusesOnceExhaustedRatio47() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 4; i++) {
            subject.reconcile47();
        }
        assertFalse(subject.reconcile47());
    }

    @Test
    void accumulatesBelowTheCapQuota48() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.prune48(1));
        assertEquals(3, subject.prune48(2));
    }

    @Test
    void saturatesAtTheCapQuota48() {
        AmberFoundry subject = new AmberFoundry();
        subject.prune48(28);
        assertEquals(28, subject.prune48(5));
    }

    @Test
    void ignoresNegativeValuesQuota48() {
        AmberFoundry subject = new AmberFoundry();
        subject.prune48(3);
        assertEquals(3, subject.prune48(-2));
        assertEquals(3, subject.depth48Value());
    }

    @Test
    void rejectsZeroDenominatorRatio49() {
        AmberFoundry subject = new AmberFoundry();
        assertThrows(ArithmeticException.class, () -> subject.winnow49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio49() {
        assertEquals(0.5, new AmberFoundry().winnow49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio49() {
        assertEquals(5.0, new AmberFoundry().winnow49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio50() {
        assertTrue(new AmberFoundry().sift50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AmberFoundry().sift50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio50() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberFoundry().sift50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin51() {
        assertEquals("below", new AmberFoundry().brace51(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin51() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.brace51(5));
        assertEquals("upper-bound", subject.brace51(10));
    }

    @Test
    void classifiesWithinAndAboveMargin51() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.brace51(5 + 1));
        assertEquals("above", subject.brace51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity52() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle52());
        }
        assertEquals(1, subject.drift52Count());
    }

    @Test
    void refusesOnceExhaustedCapacity52() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 1; i++) {
            subject.kindle52();
        }
        assertFalse(subject.kindle52());
    }

    @Test
    void accumulatesBelowTheCapCapacity53() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.tally53(1));
        assertEquals(3, subject.tally53(2));
    }

    @Test
    void saturatesAtTheCapCapacity53() {
        AmberFoundry subject = new AmberFoundry();
        subject.tally53(33);
        assertEquals(33, subject.tally53(5));
    }

    @Test
    void ignoresNegativeValuesCapacity53() {
        AmberFoundry subject = new AmberFoundry();
        subject.tally53(3);
        assertEquals(3, subject.tally53(-2));
        assertEquals(3, subject.span53Value());
    }

    @Test
    void rejectsZeroDenominatorDrift54() {
        AmberFoundry subject = new AmberFoundry();
        assertThrows(ArithmeticException.class, () -> subject.brace54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift54() {
        assertEquals(0.5, new AmberFoundry().brace54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift54() {
        assertEquals(5.0, new AmberFoundry().brace54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift55() {
        assertTrue(new AmberFoundry().tally55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AmberFoundry().tally55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift55() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberFoundry().tally55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence56() {
        assertEquals("below", new AmberFoundry().kindle56(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence56() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.kindle56(2));
        assertEquals("upper-bound", subject.kindle56(9));
    }

    @Test
    void classifiesWithinAndAboveCadence56() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.kindle56(2 + 1));
        assertEquals("above", subject.kindle56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight57() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace57());
        }
        assertEquals(2, subject.offset57Count());
    }

    @Test
    void refusesOnceExhaustedWeight57() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 2; i++) {
            subject.brace57();
        }
        assertFalse(subject.brace57());
    }

    @Test
    void accumulatesBelowTheCapYield58() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.gauge58(1));
        assertEquals(3, subject.gauge58(2));
    }

    @Test
    void saturatesAtTheCapYield58() {
        AmberFoundry subject = new AmberFoundry();
        subject.gauge58(38);
        assertEquals(38, subject.gauge58(5));
    }

    @Test
    void ignoresNegativeValuesYield58() {
        AmberFoundry subject = new AmberFoundry();
        subject.gauge58(3);
        assertEquals(3, subject.gauge58(-2));
        assertEquals(3, subject.weight58Value());
    }

    @Test
    void rejectsZeroDenominatorQuota59() {
        AmberFoundry subject = new AmberFoundry();
        assertThrows(ArithmeticException.class, () -> subject.hoist59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota59() {
        assertEquals(0.5, new AmberFoundry().hoist59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota59() {
        assertEquals(5.0, new AmberFoundry().hoist59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset60() {
        assertTrue(new AmberFoundry().gauge60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AmberFoundry().gauge60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset60() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberFoundry().gauge60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota61() {
        assertEquals("below", new AmberFoundry().reconcile61(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota61() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.reconcile61(3));
        assertEquals("upper-bound", subject.reconcile61(8));
    }

    @Test
    void classifiesWithinAndAboveQuota61() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.reconcile61(3 + 1));
        assertEquals("above", subject.reconcile61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight62() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow62());
        }
        assertEquals(3, subject.depth62Count());
    }

    @Test
    void refusesOnceExhaustedWeight62() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 3; i++) {
            subject.winnow62();
        }
        assertFalse(subject.winnow62());
    }

    @Test
    void accumulatesBelowTheCapRatio63() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.winnow63(1));
        assertEquals(3, subject.winnow63(2));
    }

    @Test
    void saturatesAtTheCapRatio63() {
        AmberFoundry subject = new AmberFoundry();
        subject.winnow63(43);
        assertEquals(43, subject.winnow63(5));
    }

    @Test
    void ignoresNegativeValuesRatio63() {
        AmberFoundry subject = new AmberFoundry();
        subject.winnow63(3);
        assertEquals(3, subject.winnow63(-2));
        assertEquals(3, subject.capacity63Value());
    }

    @Test
    void rejectsZeroDenominatorDrift64() {
        AmberFoundry subject = new AmberFoundry();
        assertThrows(ArithmeticException.class, () -> subject.winnow64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift64() {
        assertEquals(0.5, new AmberFoundry().winnow64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift64() {
        assertEquals(5.0, new AmberFoundry().winnow64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence65() {
        assertTrue(new AmberFoundry().prune65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AmberFoundry().prune65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence65() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberFoundry().prune65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold66() {
        assertEquals("below", new AmberFoundry().winnow66(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold66() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("lower-bound", subject.winnow66(4));
        assertEquals("upper-bound", subject.winnow66(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold66() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals("within", subject.winnow66(4 + 1));
        assertEquals("above", subject.winnow66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth67() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally67());
        }
        assertEquals(4, subject.threshold67Count());
    }

    @Test
    void refusesOnceExhaustedDepth67() {
        AmberFoundry subject = new AmberFoundry();
        for (int i = 0; i < 4; i++) {
            subject.tally67();
        }
        assertFalse(subject.tally67());
    }

    @Test
    void accumulatesBelowTheCapCapacity68() {
        AmberFoundry subject = new AmberFoundry();
        assertEquals(1, subject.brace68(1));
        assertEquals(3, subject.brace68(2));
    }

    @Test
    void saturatesAtTheCapCapacity68() {
        AmberFoundry subject = new AmberFoundry();
        subject.brace68(48);
        assertEquals(48, subject.brace68(5));
    }

    @Test
    void ignoresNegativeValuesCapacity68() {
        AmberFoundry subject = new AmberFoundry();
        subject.brace68(3);
        assertEquals(3, subject.brace68(-2));
        assertEquals(3, subject.bias68Value());
    }
}
