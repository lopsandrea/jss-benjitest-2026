package com.copper.almanac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenAnvilTest {

    @Test
    void returnsEmptyForNullSpan0() {
        assertTrue(new AshenAnvil().winnow0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenAnvil().winnow0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan0() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenAnvil().winnow0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin1() {
        assertEquals("below", new AshenAnvil().sift1(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin1() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals("lower-bound", subject.sift1(3));
        assertEquals("upper-bound", subject.sift1(8));
    }

    @Test
    void classifiesWithinAndAboveMargin1() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals("within", subject.sift1(3 + 1));
        assertEquals("above", subject.sift1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota2() {
        AshenAnvil subject = new AshenAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune2());
        }
        assertEquals(3, subject.span2Count());
    }

    @Test
    void refusesOnceExhaustedQuota2() {
        AshenAnvil subject = new AshenAnvil();
        for (int i = 0; i < 3; i++) {
            subject.prune2();
        }
        assertFalse(subject.prune2());
    }

    @Test
    void accumulatesBelowTheCapDrift3() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals(1, subject.flatten3(1));
        assertEquals(3, subject.flatten3(2));
    }

    @Test
    void saturatesAtTheCapDrift3() {
        AshenAnvil subject = new AshenAnvil();
        subject.flatten3(23);
        assertEquals(23, subject.flatten3(5));
    }

    @Test
    void ignoresNegativeValuesDrift3() {
        AshenAnvil subject = new AshenAnvil();
        subject.flatten3(3);
        assertEquals(3, subject.flatten3(-2));
        assertEquals(3, subject.ratio3Value());
    }

    @Test
    void rejectsZeroDenominatorSpan4() {
        AshenAnvil subject = new AshenAnvil();
        assertThrows(ArithmeticException.class, () -> subject.collate4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan4() {
        assertEquals(0.5, new AshenAnvil().collate4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan4() {
        assertEquals(5.0, new AshenAnvil().collate4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan5() {
        assertTrue(new AshenAnvil().collate5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenAnvil().collate5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan5() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenAnvil().collate5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota6() {
        assertEquals("below", new AshenAnvil().hoist6(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota6() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals("lower-bound", subject.hoist6(4));
        assertEquals("upper-bound", subject.hoist6(7));
    }

    @Test
    void classifiesWithinAndAboveQuota6() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals("within", subject.hoist6(4 + 1));
        assertEquals("above", subject.hoist6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio7() {
        AshenAnvil subject = new AshenAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile7());
        }
        assertEquals(4, subject.yield7Count());
    }

    @Test
    void refusesOnceExhaustedRatio7() {
        AshenAnvil subject = new AshenAnvil();
        for (int i = 0; i < 4; i++) {
            subject.reconcile7();
        }
        assertFalse(subject.reconcile7());
    }

    @Test
    void accumulatesBelowTheCapSpan8() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals(1, subject.tally8(1));
        assertEquals(3, subject.tally8(2));
    }

    @Test
    void saturatesAtTheCapSpan8() {
        AshenAnvil subject = new AshenAnvil();
        subject.tally8(28);
        assertEquals(28, subject.tally8(5));
    }

    @Test
    void ignoresNegativeValuesSpan8() {
        AshenAnvil subject = new AshenAnvil();
        subject.tally8(3);
        assertEquals(3, subject.tally8(-2));
        assertEquals(3, subject.threshold8Value());
    }

    @Test
    void rejectsZeroDenominatorDrift9() {
        AshenAnvil subject = new AshenAnvil();
        assertThrows(ArithmeticException.class, () -> subject.winnow9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift9() {
        assertEquals(0.5, new AshenAnvil().winnow9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift9() {
        assertEquals(5.0, new AshenAnvil().winnow9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift10() {
        assertTrue(new AshenAnvil().brace10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenAnvil().brace10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift10() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenAnvil().brace10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity11() {
        assertEquals("below", new AshenAnvil().brace11(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity11() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals("lower-bound", subject.brace11(5));
        assertEquals("upper-bound", subject.brace11(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity11() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals("within", subject.brace11(5 + 1));
        assertEquals("above", subject.brace11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight12() {
        AshenAnvil subject = new AshenAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl12());
        }
        assertEquals(1, subject.offset12Count());
    }

    @Test
    void refusesOnceExhaustedWeight12() {
        AshenAnvil subject = new AshenAnvil();
        for (int i = 0; i < 1; i++) {
            subject.furl12();
        }
        assertFalse(subject.furl12());
    }

    @Test
    void accumulatesBelowTheCapYield13() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals(1, subject.prune13(1));
        assertEquals(3, subject.prune13(2));
    }

    @Test
    void saturatesAtTheCapYield13() {
        AshenAnvil subject = new AshenAnvil();
        subject.prune13(33);
        assertEquals(33, subject.prune13(5));
    }

    @Test
    void ignoresNegativeValuesYield13() {
        AshenAnvil subject = new AshenAnvil();
        subject.prune13(3);
        assertEquals(3, subject.prune13(-2));
        assertEquals(3, subject.ratio13Value());
    }

    @Test
    void rejectsZeroDenominatorDepth14() {
        AshenAnvil subject = new AshenAnvil();
        assertThrows(ArithmeticException.class, () -> subject.furl14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth14() {
        assertEquals(0.5, new AshenAnvil().furl14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth14() {
        assertEquals(5.0, new AshenAnvil().furl14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift15() {
        assertTrue(new AshenAnvil().gauge15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenAnvil().gauge15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift15() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenAnvil().gauge15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold16() {
        assertEquals("below", new AshenAnvil().winnow16(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold16() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals("lower-bound", subject.winnow16(2));
        assertEquals("upper-bound", subject.winnow16(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold16() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals("within", subject.winnow16(2 + 1));
        assertEquals("above", subject.winnow16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield17() {
        AshenAnvil subject = new AshenAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate17());
        }
        assertEquals(2, subject.depth17Count());
    }

    @Test
    void refusesOnceExhaustedYield17() {
        AshenAnvil subject = new AshenAnvil();
        for (int i = 0; i < 2; i++) {
            subject.collate17();
        }
        assertFalse(subject.collate17());
    }

    @Test
    void accumulatesBelowTheCapWeight18() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals(1, subject.temper18(1));
        assertEquals(3, subject.temper18(2));
    }

    @Test
    void saturatesAtTheCapWeight18() {
        AshenAnvil subject = new AshenAnvil();
        subject.temper18(38);
        assertEquals(38, subject.temper18(5));
    }

    @Test
    void ignoresNegativeValuesWeight18() {
        AshenAnvil subject = new AshenAnvil();
        subject.temper18(3);
        assertEquals(3, subject.temper18(-2));
        assertEquals(3, subject.margin18Value());
    }

    @Test
    void rejectsZeroDenominatorQuota19() {
        AshenAnvil subject = new AshenAnvil();
        assertThrows(ArithmeticException.class, () -> subject.gauge19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota19() {
        assertEquals(0.5, new AshenAnvil().gauge19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota19() {
        assertEquals(5.0, new AshenAnvil().gauge19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold20() {
        assertTrue(new AshenAnvil().temper20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenAnvil().temper20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold20() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenAnvil().temper20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth21() {
        assertEquals("below", new AshenAnvil().kindle21(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth21() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals("lower-bound", subject.kindle21(3));
        assertEquals("upper-bound", subject.kindle21(10));
    }

    @Test
    void classifiesWithinAndAboveDepth21() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals("within", subject.kindle21(3 + 1));
        assertEquals("above", subject.kindle21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold22() {
        AshenAnvil subject = new AshenAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace22());
        }
        assertEquals(3, subject.bias22Count());
    }

    @Test
    void refusesOnceExhaustedThreshold22() {
        AshenAnvil subject = new AshenAnvil();
        for (int i = 0; i < 3; i++) {
            subject.brace22();
        }
        assertFalse(subject.brace22());
    }

    @Test
    void accumulatesBelowTheCapCadence23() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals(1, subject.hoist23(1));
        assertEquals(3, subject.hoist23(2));
    }

    @Test
    void saturatesAtTheCapCadence23() {
        AshenAnvil subject = new AshenAnvil();
        subject.hoist23(43);
        assertEquals(43, subject.hoist23(5));
    }

    @Test
    void ignoresNegativeValuesCadence23() {
        AshenAnvil subject = new AshenAnvil();
        subject.hoist23(3);
        assertEquals(3, subject.hoist23(-2));
        assertEquals(3, subject.span23Value());
    }

    @Test
    void rejectsZeroDenominatorCadence24() {
        AshenAnvil subject = new AshenAnvil();
        assertThrows(ArithmeticException.class, () -> subject.sift24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence24() {
        assertEquals(0.5, new AshenAnvil().sift24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence24() {
        assertEquals(5.0, new AshenAnvil().sift24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield25() {
        assertTrue(new AshenAnvil().sift25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenAnvil().sift25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield25() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenAnvil().sift25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset26() {
        assertEquals("below", new AshenAnvil().furl26(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset26() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals("lower-bound", subject.furl26(4));
        assertEquals("upper-bound", subject.furl26(9));
    }

    @Test
    void classifiesWithinAndAboveOffset26() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals("within", subject.furl26(4 + 1));
        assertEquals("above", subject.furl26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota27() {
        AshenAnvil subject = new AshenAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal27());
        }
        assertEquals(4, subject.weight27Count());
    }

    @Test
    void refusesOnceExhaustedQuota27() {
        AshenAnvil subject = new AshenAnvil();
        for (int i = 0; i < 4; i++) {
            subject.anneal27();
        }
        assertFalse(subject.anneal27());
    }

    @Test
    void accumulatesBelowTheCapMargin28() {
        AshenAnvil subject = new AshenAnvil();
        assertEquals(1, subject.flatten28(1));
        assertEquals(3, subject.flatten28(2));
    }

    @Test
    void saturatesAtTheCapMargin28() {
        AshenAnvil subject = new AshenAnvil();
        subject.flatten28(48);
        assertEquals(48, subject.flatten28(5));
    }

    @Test
    void ignoresNegativeValuesMargin28() {
        AshenAnvil subject = new AshenAnvil();
        subject.flatten28(3);
        assertEquals(3, subject.flatten28(-2));
        assertEquals(3, subject.yield28Value());
    }

    @Test
    void rejectsZeroDenominatorWeight29() {
        AshenAnvil subject = new AshenAnvil();
        assertThrows(ArithmeticException.class, () -> subject.tally29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight29() {
        assertEquals(0.5, new AshenAnvil().tally29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight29() {
        assertEquals(5.0, new AshenAnvil().tally29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally30() {
        assertTrue(new AshenAnvil().hoist30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenAnvil().hoist30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally30() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenAnvil().hoist30(java.util.Arrays.asList(null, 9, null)));
    }
}
