package com.northward.trellis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberAnvilTest {

    @Test
    void returnsEmptyForNullDepth0() {
        assertTrue(new AmberAnvil().furl0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AmberAnvil().furl0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth0() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberAnvil().furl0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias1() {
        assertEquals("below", new AmberAnvil().flatten1(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias1() {
        AmberAnvil subject = new AmberAnvil();
        assertEquals("lower-bound", subject.flatten1(3));
        assertEquals("upper-bound", subject.flatten1(8));
    }

    @Test
    void classifiesWithinAndAboveBias1() {
        AmberAnvil subject = new AmberAnvil();
        assertEquals("within", subject.flatten1(3 + 1));
        assertEquals("above", subject.flatten1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity2() {
        AmberAnvil subject = new AmberAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune2());
        }
        assertEquals(3, subject.drift2Count());
    }

    @Test
    void refusesOnceExhaustedCapacity2() {
        AmberAnvil subject = new AmberAnvil();
        for (int i = 0; i < 3; i++) {
            subject.prune2();
        }
        assertFalse(subject.prune2());
    }

    @Test
    void accumulatesBelowTheCapYield3() {
        AmberAnvil subject = new AmberAnvil();
        assertEquals(1, subject.kindle3(1));
        assertEquals(3, subject.kindle3(2));
    }

    @Test
    void saturatesAtTheCapYield3() {
        AmberAnvil subject = new AmberAnvil();
        subject.kindle3(23);
        assertEquals(23, subject.kindle3(5));
    }

    @Test
    void ignoresNegativeValuesYield3() {
        AmberAnvil subject = new AmberAnvil();
        subject.kindle3(3);
        assertEquals(3, subject.kindle3(-2));
        assertEquals(3, subject.weight3Value());
    }

    @Test
    void rejectsZeroDenominatorCadence4() {
        AmberAnvil subject = new AmberAnvil();
        assertThrows(ArithmeticException.class, () -> subject.brace4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence4() {
        assertEquals(0.5, new AmberAnvil().brace4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence4() {
        assertEquals(5.0, new AmberAnvil().brace4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota5() {
        assertTrue(new AmberAnvil().prune5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AmberAnvil().prune5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota5() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberAnvil().prune5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota6() {
        assertEquals("below", new AmberAnvil().kindle6(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota6() {
        AmberAnvil subject = new AmberAnvil();
        assertEquals("lower-bound", subject.kindle6(4));
        assertEquals("upper-bound", subject.kindle6(7));
    }

    @Test
    void classifiesWithinAndAboveQuota6() {
        AmberAnvil subject = new AmberAnvil();
        assertEquals("within", subject.kindle6(4 + 1));
        assertEquals("above", subject.kindle6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold7() {
        AmberAnvil subject = new AmberAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl7());
        }
        assertEquals(4, subject.quota7Count());
    }

    @Test
    void refusesOnceExhaustedThreshold7() {
        AmberAnvil subject = new AmberAnvil();
        for (int i = 0; i < 4; i++) {
            subject.furl7();
        }
        assertFalse(subject.furl7());
    }

    @Test
    void accumulatesBelowTheCapMargin8() {
        AmberAnvil subject = new AmberAnvil();
        assertEquals(1, subject.sift8(1));
        assertEquals(3, subject.sift8(2));
    }

    @Test
    void saturatesAtTheCapMargin8() {
        AmberAnvil subject = new AmberAnvil();
        subject.sift8(28);
        assertEquals(28, subject.sift8(5));
    }

    @Test
    void ignoresNegativeValuesMargin8() {
        AmberAnvil subject = new AmberAnvil();
        subject.sift8(3);
        assertEquals(3, subject.sift8(-2));
        assertEquals(3, subject.bias8Value());
    }

    @Test
    void rejectsZeroDenominatorQuota9() {
        AmberAnvil subject = new AmberAnvil();
        assertThrows(ArithmeticException.class, () -> subject.kindle9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota9() {
        assertEquals(0.5, new AmberAnvil().kindle9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota9() {
        assertEquals(5.0, new AmberAnvil().kindle9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally10() {
        assertTrue(new AmberAnvil().winnow10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AmberAnvil().winnow10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally10() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberAnvil().winnow10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift11() {
        assertEquals("below", new AmberAnvil().winnow11(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift11() {
        AmberAnvil subject = new AmberAnvil();
        assertEquals("lower-bound", subject.winnow11(5));
        assertEquals("upper-bound", subject.winnow11(12));
    }

    @Test
    void classifiesWithinAndAboveDrift11() {
        AmberAnvil subject = new AmberAnvil();
        assertEquals("within", subject.winnow11(5 + 1));
        assertEquals("above", subject.winnow11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias12() {
        AmberAnvil subject = new AmberAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift12());
        }
        assertEquals(1, subject.ratio12Count());
    }

    @Test
    void refusesOnceExhaustedBias12() {
        AmberAnvil subject = new AmberAnvil();
        for (int i = 0; i < 1; i++) {
            subject.sift12();
        }
        assertFalse(subject.sift12());
    }

    @Test
    void accumulatesBelowTheCapMargin13() {
        AmberAnvil subject = new AmberAnvil();
        assertEquals(1, subject.prune13(1));
        assertEquals(3, subject.prune13(2));
    }

    @Test
    void saturatesAtTheCapMargin13() {
        AmberAnvil subject = new AmberAnvil();
        subject.prune13(33);
        assertEquals(33, subject.prune13(5));
    }

    @Test
    void ignoresNegativeValuesMargin13() {
        AmberAnvil subject = new AmberAnvil();
        subject.prune13(3);
        assertEquals(3, subject.prune13(-2));
        assertEquals(3, subject.cadence13Value());
    }

    @Test
    void rejectsZeroDenominatorMargin14() {
        AmberAnvil subject = new AmberAnvil();
        assertThrows(ArithmeticException.class, () -> subject.kindle14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin14() {
        assertEquals(0.5, new AmberAnvil().kindle14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin14() {
        assertEquals(5.0, new AmberAnvil().kindle14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth15() {
        assertTrue(new AmberAnvil().anneal15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AmberAnvil().anneal15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth15() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberAnvil().anneal15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth16() {
        assertEquals("below", new AmberAnvil().anneal16(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth16() {
        AmberAnvil subject = new AmberAnvil();
        assertEquals("lower-bound", subject.anneal16(2));
        assertEquals("upper-bound", subject.anneal16(11));
    }

    @Test
    void classifiesWithinAndAboveDepth16() {
        AmberAnvil subject = new AmberAnvil();
        assertEquals("within", subject.anneal16(2 + 1));
        assertEquals("above", subject.anneal16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin17() {
        AmberAnvil subject = new AmberAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune17());
        }
        assertEquals(2, subject.drift17Count());
    }

    @Test
    void refusesOnceExhaustedMargin17() {
        AmberAnvil subject = new AmberAnvil();
        for (int i = 0; i < 2; i++) {
            subject.prune17();
        }
        assertFalse(subject.prune17());
    }

    @Test
    void accumulatesBelowTheCapCadence18() {
        AmberAnvil subject = new AmberAnvil();
        assertEquals(1, subject.prune18(1));
        assertEquals(3, subject.prune18(2));
    }

    @Test
    void saturatesAtTheCapCadence18() {
        AmberAnvil subject = new AmberAnvil();
        subject.prune18(38);
        assertEquals(38, subject.prune18(5));
    }

    @Test
    void ignoresNegativeValuesCadence18() {
        AmberAnvil subject = new AmberAnvil();
        subject.prune18(3);
        assertEquals(3, subject.prune18(-2));
        assertEquals(3, subject.quota18Value());
    }

    @Test
    void rejectsZeroDenominatorBias19() {
        AmberAnvil subject = new AmberAnvil();
        assertThrows(ArithmeticException.class, () -> subject.anneal19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias19() {
        assertEquals(0.5, new AmberAnvil().anneal19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias19() {
        assertEquals(5.0, new AmberAnvil().anneal19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight20() {
        assertTrue(new AmberAnvil().temper20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AmberAnvil().temper20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight20() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberAnvil().temper20(java.util.Arrays.asList(null, 8, null)));
    }
}
