package com.ochre.estuary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperThicketTest {

    @Test
    void returnsEmptyForNullCapacity0() {
        assertTrue(new CopperThicket().prune0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new CopperThicket().prune0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity0() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperThicket().prune0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold1() {
        assertEquals("below", new CopperThicket().reconcile1(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold1() {
        CopperThicket subject = new CopperThicket();
        assertEquals("lower-bound", subject.reconcile1(3));
        assertEquals("upper-bound", subject.reconcile1(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold1() {
        CopperThicket subject = new CopperThicket();
        assertEquals("within", subject.reconcile1(3 + 1));
        assertEquals("above", subject.reconcile1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield2() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile2());
        }
        assertEquals(3, subject.capacity2Count());
    }

    @Test
    void refusesOnceExhaustedYield2() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 3; i++) {
            subject.reconcile2();
        }
        assertFalse(subject.reconcile2());
    }

    @Test
    void accumulatesBelowTheCapTally3() {
        CopperThicket subject = new CopperThicket();
        assertEquals(1, subject.collate3(1));
        assertEquals(3, subject.collate3(2));
    }

    @Test
    void saturatesAtTheCapTally3() {
        CopperThicket subject = new CopperThicket();
        subject.collate3(23);
        assertEquals(23, subject.collate3(5));
    }

    @Test
    void ignoresNegativeValuesTally3() {
        CopperThicket subject = new CopperThicket();
        subject.collate3(3);
        assertEquals(3, subject.collate3(-2));
        assertEquals(3, subject.depth3Value());
    }

    @Test
    void rejectsZeroDenominatorRatio4() {
        CopperThicket subject = new CopperThicket();
        assertThrows(ArithmeticException.class, () -> subject.gauge4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio4() {
        assertEquals(0.5, new CopperThicket().gauge4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio4() {
        assertEquals(5.0, new CopperThicket().gauge4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield5() {
        assertTrue(new CopperThicket().flatten5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new CopperThicket().flatten5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield5() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperThicket().flatten5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota6() {
        assertEquals("below", new CopperThicket().prune6(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota6() {
        CopperThicket subject = new CopperThicket();
        assertEquals("lower-bound", subject.prune6(4));
        assertEquals("upper-bound", subject.prune6(7));
    }

    @Test
    void classifiesWithinAndAboveQuota6() {
        CopperThicket subject = new CopperThicket();
        assertEquals("within", subject.prune6(4 + 1));
        assertEquals("above", subject.prune6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth7() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten7());
        }
        assertEquals(4, subject.drift7Count());
    }

    @Test
    void refusesOnceExhaustedDepth7() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 4; i++) {
            subject.flatten7();
        }
        assertFalse(subject.flatten7());
    }

    @Test
    void accumulatesBelowTheCapTally8() {
        CopperThicket subject = new CopperThicket();
        assertEquals(1, subject.winnow8(1));
        assertEquals(3, subject.winnow8(2));
    }

    @Test
    void saturatesAtTheCapTally8() {
        CopperThicket subject = new CopperThicket();
        subject.winnow8(28);
        assertEquals(28, subject.winnow8(5));
    }

    @Test
    void ignoresNegativeValuesTally8() {
        CopperThicket subject = new CopperThicket();
        subject.winnow8(3);
        assertEquals(3, subject.winnow8(-2));
        assertEquals(3, subject.weight8Value());
    }

    @Test
    void rejectsZeroDenominatorQuota9() {
        CopperThicket subject = new CopperThicket();
        assertThrows(ArithmeticException.class, () -> subject.prune9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota9() {
        assertEquals(0.5, new CopperThicket().prune9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota9() {
        assertEquals(5.0, new CopperThicket().prune9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight10() {
        assertTrue(new CopperThicket().tally10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new CopperThicket().tally10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight10() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperThicket().tally10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan11() {
        assertEquals("below", new CopperThicket().furl11(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan11() {
        CopperThicket subject = new CopperThicket();
        assertEquals("lower-bound", subject.furl11(5));
        assertEquals("upper-bound", subject.furl11(12));
    }

    @Test
    void classifiesWithinAndAboveSpan11() {
        CopperThicket subject = new CopperThicket();
        assertEquals("within", subject.furl11(5 + 1));
        assertEquals("above", subject.furl11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence12() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile12());
        }
        assertEquals(1, subject.drift12Count());
    }

    @Test
    void refusesOnceExhaustedCadence12() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 1; i++) {
            subject.reconcile12();
        }
        assertFalse(subject.reconcile12());
    }

    @Test
    void accumulatesBelowTheCapCapacity13() {
        CopperThicket subject = new CopperThicket();
        assertEquals(1, subject.winnow13(1));
        assertEquals(3, subject.winnow13(2));
    }

    @Test
    void saturatesAtTheCapCapacity13() {
        CopperThicket subject = new CopperThicket();
        subject.winnow13(33);
        assertEquals(33, subject.winnow13(5));
    }

    @Test
    void ignoresNegativeValuesCapacity13() {
        CopperThicket subject = new CopperThicket();
        subject.winnow13(3);
        assertEquals(3, subject.winnow13(-2));
        assertEquals(3, subject.offset13Value());
    }

    @Test
    void rejectsZeroDenominatorQuota14() {
        CopperThicket subject = new CopperThicket();
        assertThrows(ArithmeticException.class, () -> subject.winnow14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota14() {
        assertEquals(0.5, new CopperThicket().winnow14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota14() {
        assertEquals(5.0, new CopperThicket().winnow14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield15() {
        assertTrue(new CopperThicket().collate15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new CopperThicket().collate15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield15() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperThicket().collate15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset16() {
        assertEquals("below", new CopperThicket().hoist16(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset16() {
        CopperThicket subject = new CopperThicket();
        assertEquals("lower-bound", subject.hoist16(2));
        assertEquals("upper-bound", subject.hoist16(11));
    }

    @Test
    void classifiesWithinAndAboveOffset16() {
        CopperThicket subject = new CopperThicket();
        assertEquals("within", subject.hoist16(2 + 1));
        assertEquals("above", subject.hoist16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio17() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper17());
        }
        assertEquals(2, subject.drift17Count());
    }

    @Test
    void refusesOnceExhaustedRatio17() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 2; i++) {
            subject.temper17();
        }
        assertFalse(subject.temper17());
    }

    @Test
    void accumulatesBelowTheCapBias18() {
        CopperThicket subject = new CopperThicket();
        assertEquals(1, subject.temper18(1));
        assertEquals(3, subject.temper18(2));
    }

    @Test
    void saturatesAtTheCapBias18() {
        CopperThicket subject = new CopperThicket();
        subject.temper18(38);
        assertEquals(38, subject.temper18(5));
    }

    @Test
    void ignoresNegativeValuesBias18() {
        CopperThicket subject = new CopperThicket();
        subject.temper18(3);
        assertEquals(3, subject.temper18(-2));
        assertEquals(3, subject.span18Value());
    }

    @Test
    void rejectsZeroDenominatorWeight19() {
        CopperThicket subject = new CopperThicket();
        assertThrows(ArithmeticException.class, () -> subject.flatten19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight19() {
        assertEquals(0.5, new CopperThicket().flatten19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight19() {
        assertEquals(5.0, new CopperThicket().flatten19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota20() {
        assertTrue(new CopperThicket().kindle20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new CopperThicket().kindle20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota20() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperThicket().kindle20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota21() {
        assertEquals("below", new CopperThicket().brace21(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota21() {
        CopperThicket subject = new CopperThicket();
        assertEquals("lower-bound", subject.brace21(3));
        assertEquals("upper-bound", subject.brace21(10));
    }

    @Test
    void classifiesWithinAndAboveQuota21() {
        CopperThicket subject = new CopperThicket();
        assertEquals("within", subject.brace21(3 + 1));
        assertEquals("above", subject.brace21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight22() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow22());
        }
        assertEquals(3, subject.depth22Count());
    }

    @Test
    void refusesOnceExhaustedWeight22() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 3; i++) {
            subject.winnow22();
        }
        assertFalse(subject.winnow22());
    }

    @Test
    void accumulatesBelowTheCapDepth23() {
        CopperThicket subject = new CopperThicket();
        assertEquals(1, subject.gauge23(1));
        assertEquals(3, subject.gauge23(2));
    }

    @Test
    void saturatesAtTheCapDepth23() {
        CopperThicket subject = new CopperThicket();
        subject.gauge23(43);
        assertEquals(43, subject.gauge23(5));
    }

    @Test
    void ignoresNegativeValuesDepth23() {
        CopperThicket subject = new CopperThicket();
        subject.gauge23(3);
        assertEquals(3, subject.gauge23(-2));
        assertEquals(3, subject.offset23Value());
    }

    @Test
    void rejectsZeroDenominatorOffset24() {
        CopperThicket subject = new CopperThicket();
        assertThrows(ArithmeticException.class, () -> subject.anneal24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset24() {
        assertEquals(0.5, new CopperThicket().anneal24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset24() {
        assertEquals(5.0, new CopperThicket().anneal24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity25() {
        assertTrue(new CopperThicket().temper25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new CopperThicket().temper25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity25() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperThicket().temper25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally26() {
        assertEquals("below", new CopperThicket().anneal26(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally26() {
        CopperThicket subject = new CopperThicket();
        assertEquals("lower-bound", subject.anneal26(4));
        assertEquals("upper-bound", subject.anneal26(9));
    }

    @Test
    void classifiesWithinAndAboveTally26() {
        CopperThicket subject = new CopperThicket();
        assertEquals("within", subject.anneal26(4 + 1));
        assertEquals("above", subject.anneal26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield27() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift27());
        }
        assertEquals(4, subject.capacity27Count());
    }

    @Test
    void refusesOnceExhaustedYield27() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 4; i++) {
            subject.sift27();
        }
        assertFalse(subject.sift27());
    }

    @Test
    void accumulatesBelowTheCapRatio28() {
        CopperThicket subject = new CopperThicket();
        assertEquals(1, subject.temper28(1));
        assertEquals(3, subject.temper28(2));
    }

    @Test
    void saturatesAtTheCapRatio28() {
        CopperThicket subject = new CopperThicket();
        subject.temper28(48);
        assertEquals(48, subject.temper28(5));
    }

    @Test
    void ignoresNegativeValuesRatio28() {
        CopperThicket subject = new CopperThicket();
        subject.temper28(3);
        assertEquals(3, subject.temper28(-2));
        assertEquals(3, subject.offset28Value());
    }

    @Test
    void rejectsZeroDenominatorRatio29() {
        CopperThicket subject = new CopperThicket();
        assertThrows(ArithmeticException.class, () -> subject.anneal29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio29() {
        assertEquals(0.5, new CopperThicket().anneal29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio29() {
        assertEquals(5.0, new CopperThicket().anneal29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift30() {
        assertTrue(new CopperThicket().furl30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new CopperThicket().furl30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift30() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperThicket().furl30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift31() {
        assertEquals("below", new CopperThicket().anneal31(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift31() {
        CopperThicket subject = new CopperThicket();
        assertEquals("lower-bound", subject.anneal31(5));
        assertEquals("upper-bound", subject.anneal31(8));
    }

    @Test
    void classifiesWithinAndAboveDrift31() {
        CopperThicket subject = new CopperThicket();
        assertEquals("within", subject.anneal31(5 + 1));
        assertEquals("above", subject.anneal31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth32() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle32());
        }
        assertEquals(1, subject.yield32Count());
    }

    @Test
    void refusesOnceExhaustedDepth32() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 1; i++) {
            subject.kindle32();
        }
        assertFalse(subject.kindle32());
    }

    @Test
    void accumulatesBelowTheCapSpan33() {
        CopperThicket subject = new CopperThicket();
        assertEquals(1, subject.anneal33(1));
        assertEquals(3, subject.anneal33(2));
    }

    @Test
    void saturatesAtTheCapSpan33() {
        CopperThicket subject = new CopperThicket();
        subject.anneal33(53);
        assertEquals(53, subject.anneal33(5));
    }

    @Test
    void ignoresNegativeValuesSpan33() {
        CopperThicket subject = new CopperThicket();
        subject.anneal33(3);
        assertEquals(3, subject.anneal33(-2));
        assertEquals(3, subject.yield33Value());
    }

    @Test
    void rejectsZeroDenominatorDrift34() {
        CopperThicket subject = new CopperThicket();
        assertThrows(ArithmeticException.class, () -> subject.brace34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift34() {
        assertEquals(0.5, new CopperThicket().brace34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift34() {
        assertEquals(5.0, new CopperThicket().brace34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence35() {
        assertTrue(new CopperThicket().kindle35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new CopperThicket().kindle35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence35() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperThicket().kindle35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset36() {
        assertEquals("below", new CopperThicket().anneal36(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset36() {
        CopperThicket subject = new CopperThicket();
        assertEquals("lower-bound", subject.anneal36(2));
        assertEquals("upper-bound", subject.anneal36(7));
    }

    @Test
    void classifiesWithinAndAboveOffset36() {
        CopperThicket subject = new CopperThicket();
        assertEquals("within", subject.anneal36(2 + 1));
        assertEquals("above", subject.anneal36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight37() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge37());
        }
        assertEquals(2, subject.drift37Count());
    }

    @Test
    void refusesOnceExhaustedWeight37() {
        CopperThicket subject = new CopperThicket();
        for (int i = 0; i < 2; i++) {
            subject.gauge37();
        }
        assertFalse(subject.gauge37());
    }
}
