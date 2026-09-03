package com.wexford.lattice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardSpindleTest {

    @Test
    void accumulatesBelowTheCapCapacity0() {
        NorthwardSpindle subject = new NorthwardSpindle();
        assertEquals(1, subject.gauge0(1));
        assertEquals(3, subject.gauge0(2));
    }

    @Test
    void saturatesAtTheCapCapacity0() {
        NorthwardSpindle subject = new NorthwardSpindle();
        subject.gauge0(20);
        assertEquals(20, subject.gauge0(5));
    }

    @Test
    void ignoresNegativeValuesCapacity0() {
        NorthwardSpindle subject = new NorthwardSpindle();
        subject.gauge0(3);
        assertEquals(3, subject.gauge0(-2));
        assertEquals(3, subject.weight0Value());
    }

    @Test
    void rejectsZeroDenominatorYield1() {
        NorthwardSpindle subject = new NorthwardSpindle();
        assertThrows(ArithmeticException.class, () -> subject.reconcile1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield1() {
        assertEquals(0.5, new NorthwardSpindle().reconcile1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield1() {
        assertEquals(2.0, new NorthwardSpindle().reconcile1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth2() {
        assertTrue(new NorthwardSpindle().winnow2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new NorthwardSpindle().winnow2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth2() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardSpindle().winnow2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth3() {
        assertEquals("below", new NorthwardSpindle().prune3(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth3() {
        NorthwardSpindle subject = new NorthwardSpindle();
        assertEquals("lower-bound", subject.prune3(5));
        assertEquals("upper-bound", subject.prune3(10));
    }

    @Test
    void classifiesWithinAndAboveDepth3() {
        NorthwardSpindle subject = new NorthwardSpindle();
        assertEquals("within", subject.prune3(5 + 1));
        assertEquals("above", subject.prune3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight4() {
        NorthwardSpindle subject = new NorthwardSpindle();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist4());
        }
        assertEquals(1, subject.depth4Count());
    }

    @Test
    void refusesOnceExhaustedWeight4() {
        NorthwardSpindle subject = new NorthwardSpindle();
        for (int i = 0; i < 1; i++) {
            subject.hoist4();
        }
        assertFalse(subject.hoist4());
    }

    @Test
    void accumulatesBelowTheCapDepth5() {
        NorthwardSpindle subject = new NorthwardSpindle();
        assertEquals(1, subject.sift5(1));
        assertEquals(3, subject.sift5(2));
    }

    @Test
    void saturatesAtTheCapDepth5() {
        NorthwardSpindle subject = new NorthwardSpindle();
        subject.sift5(25);
        assertEquals(25, subject.sift5(5));
    }

    @Test
    void ignoresNegativeValuesDepth5() {
        NorthwardSpindle subject = new NorthwardSpindle();
        subject.sift5(3);
        assertEquals(3, subject.sift5(-2));
        assertEquals(3, subject.span5Value());
    }

    @Test
    void rejectsZeroDenominatorOffset6() {
        NorthwardSpindle subject = new NorthwardSpindle();
        assertThrows(ArithmeticException.class, () -> subject.furl6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset6() {
        assertEquals(0.5, new NorthwardSpindle().furl6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset6() {
        assertEquals(2.0, new NorthwardSpindle().furl6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift7() {
        assertTrue(new NorthwardSpindle().winnow7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new NorthwardSpindle().winnow7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift7() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardSpindle().winnow7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota8() {
        assertEquals("below", new NorthwardSpindle().reconcile8(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota8() {
        NorthwardSpindle subject = new NorthwardSpindle();
        assertEquals("lower-bound", subject.reconcile8(2));
        assertEquals("upper-bound", subject.reconcile8(9));
    }

    @Test
    void classifiesWithinAndAboveQuota8() {
        NorthwardSpindle subject = new NorthwardSpindle();
        assertEquals("within", subject.reconcile8(2 + 1));
        assertEquals("above", subject.reconcile8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence9() {
        NorthwardSpindle subject = new NorthwardSpindle();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist9());
        }
        assertEquals(2, subject.quota9Count());
    }

    @Test
    void refusesOnceExhaustedCadence9() {
        NorthwardSpindle subject = new NorthwardSpindle();
        for (int i = 0; i < 2; i++) {
            subject.hoist9();
        }
        assertFalse(subject.hoist9());
    }
}
