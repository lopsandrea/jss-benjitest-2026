package com.copper.pylon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordGranaryIITest {

    @Test
    void returnsEmptyForNullBias0() {
        assertTrue(new WexfordGranaryII().hoist0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordGranaryII().hoist0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias0() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordGranaryII().hoist0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota1() {
        assertEquals("below", new WexfordGranaryII().kindle1(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota1() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals("lower-bound", subject.kindle1(3));
        assertEquals("upper-bound", subject.kindle1(8));
    }

    @Test
    void classifiesWithinAndAboveQuota1() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals("within", subject.kindle1(3 + 1));
        assertEquals("above", subject.kindle1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold2() {
        WexfordGranaryII subject = new WexfordGranaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile2());
        }
        assertEquals(3, subject.offset2Count());
    }

    @Test
    void refusesOnceExhaustedThreshold2() {
        WexfordGranaryII subject = new WexfordGranaryII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile2();
        }
        assertFalse(subject.reconcile2());
    }

    @Test
    void accumulatesBelowTheCapSpan3() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals(1, subject.reconcile3(1));
        assertEquals(3, subject.reconcile3(2));
    }

    @Test
    void saturatesAtTheCapSpan3() {
        WexfordGranaryII subject = new WexfordGranaryII();
        subject.reconcile3(23);
        assertEquals(23, subject.reconcile3(5));
    }

    @Test
    void ignoresNegativeValuesSpan3() {
        WexfordGranaryII subject = new WexfordGranaryII();
        subject.reconcile3(3);
        assertEquals(3, subject.reconcile3(-2));
        assertEquals(3, subject.cadence3Value());
    }

    @Test
    void rejectsZeroDenominatorOffset4() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.gauge4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset4() {
        assertEquals(0.5, new WexfordGranaryII().gauge4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset4() {
        assertEquals(5.0, new WexfordGranaryII().gauge4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity5() {
        assertTrue(new WexfordGranaryII().gauge5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordGranaryII().gauge5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity5() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordGranaryII().gauge5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset6() {
        assertEquals("below", new WexfordGranaryII().brace6(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset6() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals("lower-bound", subject.brace6(4));
        assertEquals("upper-bound", subject.brace6(7));
    }

    @Test
    void classifiesWithinAndAboveOffset6() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals("within", subject.brace6(4 + 1));
        assertEquals("above", subject.brace6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight7() {
        WexfordGranaryII subject = new WexfordGranaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally7());
        }
        assertEquals(4, subject.yield7Count());
    }

    @Test
    void refusesOnceExhaustedWeight7() {
        WexfordGranaryII subject = new WexfordGranaryII();
        for (int i = 0; i < 4; i++) {
            subject.tally7();
        }
        assertFalse(subject.tally7());
    }

    @Test
    void accumulatesBelowTheCapThreshold8() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals(1, subject.flatten8(1));
        assertEquals(3, subject.flatten8(2));
    }

    @Test
    void saturatesAtTheCapThreshold8() {
        WexfordGranaryII subject = new WexfordGranaryII();
        subject.flatten8(28);
        assertEquals(28, subject.flatten8(5));
    }

    @Test
    void ignoresNegativeValuesThreshold8() {
        WexfordGranaryII subject = new WexfordGranaryII();
        subject.flatten8(3);
        assertEquals(3, subject.flatten8(-2));
        assertEquals(3, subject.quota8Value());
    }

    @Test
    void rejectsZeroDenominatorCadence9() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.temper9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence9() {
        assertEquals(0.5, new WexfordGranaryII().temper9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence9() {
        assertEquals(5.0, new WexfordGranaryII().temper9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally10() {
        assertTrue(new WexfordGranaryII().furl10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordGranaryII().furl10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally10() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordGranaryII().furl10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset11() {
        assertEquals("below", new WexfordGranaryII().prune11(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset11() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals("lower-bound", subject.prune11(5));
        assertEquals("upper-bound", subject.prune11(12));
    }

    @Test
    void classifiesWithinAndAboveOffset11() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals("within", subject.prune11(5 + 1));
        assertEquals("above", subject.prune11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight12() {
        WexfordGranaryII subject = new WexfordGranaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally12());
        }
        assertEquals(1, subject.tally12Count());
    }

    @Test
    void refusesOnceExhaustedWeight12() {
        WexfordGranaryII subject = new WexfordGranaryII();
        for (int i = 0; i < 1; i++) {
            subject.tally12();
        }
        assertFalse(subject.tally12());
    }

    @Test
    void accumulatesBelowTheCapBias13() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals(1, subject.flatten13(1));
        assertEquals(3, subject.flatten13(2));
    }

    @Test
    void saturatesAtTheCapBias13() {
        WexfordGranaryII subject = new WexfordGranaryII();
        subject.flatten13(33);
        assertEquals(33, subject.flatten13(5));
    }

    @Test
    void ignoresNegativeValuesBias13() {
        WexfordGranaryII subject = new WexfordGranaryII();
        subject.flatten13(3);
        assertEquals(3, subject.flatten13(-2));
        assertEquals(3, subject.capacity13Value());
    }

    @Test
    void rejectsZeroDenominatorQuota14() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.temper14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota14() {
        assertEquals(0.5, new WexfordGranaryII().temper14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota14() {
        assertEquals(5.0, new WexfordGranaryII().temper14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield15() {
        assertTrue(new WexfordGranaryII().sift15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordGranaryII().sift15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield15() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordGranaryII().sift15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset16() {
        assertEquals("below", new WexfordGranaryII().furl16(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset16() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals("lower-bound", subject.furl16(2));
        assertEquals("upper-bound", subject.furl16(11));
    }

    @Test
    void classifiesWithinAndAboveOffset16() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals("within", subject.furl16(2 + 1));
        assertEquals("above", subject.furl16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight17() {
        WexfordGranaryII subject = new WexfordGranaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl17());
        }
        assertEquals(2, subject.ratio17Count());
    }

    @Test
    void refusesOnceExhaustedWeight17() {
        WexfordGranaryII subject = new WexfordGranaryII();
        for (int i = 0; i < 2; i++) {
            subject.furl17();
        }
        assertFalse(subject.furl17());
    }

    @Test
    void accumulatesBelowTheCapThreshold18() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals(1, subject.collate18(1));
        assertEquals(3, subject.collate18(2));
    }

    @Test
    void saturatesAtTheCapThreshold18() {
        WexfordGranaryII subject = new WexfordGranaryII();
        subject.collate18(38);
        assertEquals(38, subject.collate18(5));
    }

    @Test
    void ignoresNegativeValuesThreshold18() {
        WexfordGranaryII subject = new WexfordGranaryII();
        subject.collate18(3);
        assertEquals(3, subject.collate18(-2));
        assertEquals(3, subject.drift18Value());
    }

    @Test
    void rejectsZeroDenominatorYield19() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertThrows(ArithmeticException.class, () -> subject.gauge19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield19() {
        assertEquals(0.5, new WexfordGranaryII().gauge19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield19() {
        assertEquals(5.0, new WexfordGranaryII().gauge19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin20() {
        assertTrue(new WexfordGranaryII().kindle20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordGranaryII().kindle20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin20() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordGranaryII().kindle20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth21() {
        assertEquals("below", new WexfordGranaryII().sift21(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth21() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals("lower-bound", subject.sift21(3));
        assertEquals("upper-bound", subject.sift21(10));
    }

    @Test
    void classifiesWithinAndAboveDepth21() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals("within", subject.sift21(3 + 1));
        assertEquals("above", subject.sift21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift22() {
        WexfordGranaryII subject = new WexfordGranaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile22());
        }
        assertEquals(3, subject.depth22Count());
    }

    @Test
    void refusesOnceExhaustedDrift22() {
        WexfordGranaryII subject = new WexfordGranaryII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile22();
        }
        assertFalse(subject.reconcile22());
    }

    @Test
    void accumulatesBelowTheCapOffset23() {
        WexfordGranaryII subject = new WexfordGranaryII();
        assertEquals(1, subject.collate23(1));
        assertEquals(3, subject.collate23(2));
    }

    @Test
    void saturatesAtTheCapOffset23() {
        WexfordGranaryII subject = new WexfordGranaryII();
        subject.collate23(43);
        assertEquals(43, subject.collate23(5));
    }

    @Test
    void ignoresNegativeValuesOffset23() {
        WexfordGranaryII subject = new WexfordGranaryII();
        subject.collate23(3);
        assertEquals(3, subject.collate23(-2));
        assertEquals(3, subject.span23Value());
    }
}
