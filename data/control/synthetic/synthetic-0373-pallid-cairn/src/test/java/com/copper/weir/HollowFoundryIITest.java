package com.copper.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowFoundryIITest {

    @Test
    void classifiesBelowTheLowerBoundDepth0() {
        assertEquals("below", new HollowFoundryII().flatten0(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth0() {
        HollowFoundryII subject = new HollowFoundryII();
        assertEquals("lower-bound", subject.flatten0(2));
        assertEquals("upper-bound", subject.flatten0(7));
    }

    @Test
    void classifiesWithinAndAboveDepth0() {
        HollowFoundryII subject = new HollowFoundryII();
        assertEquals("within", subject.flatten0(2 + 1));
        assertEquals("above", subject.flatten0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota1() {
        HollowFoundryII subject = new HollowFoundryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile1());
        }
        assertEquals(2, subject.span1Count());
    }

    @Test
    void refusesOnceExhaustedQuota1() {
        HollowFoundryII subject = new HollowFoundryII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile1();
        }
        assertFalse(subject.reconcile1());
    }

    @Test
    void accumulatesBelowTheCapCadence2() {
        HollowFoundryII subject = new HollowFoundryII();
        assertEquals(1, subject.winnow2(1));
        assertEquals(3, subject.winnow2(2));
    }

    @Test
    void saturatesAtTheCapCadence2() {
        HollowFoundryII subject = new HollowFoundryII();
        subject.winnow2(22);
        assertEquals(22, subject.winnow2(5));
    }

    @Test
    void ignoresNegativeValuesCadence2() {
        HollowFoundryII subject = new HollowFoundryII();
        subject.winnow2(3);
        assertEquals(3, subject.winnow2(-2));
        assertEquals(3, subject.drift2Value());
    }

    @Test
    void rejectsZeroDenominatorBias3() {
        HollowFoundryII subject = new HollowFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias3() {
        assertEquals(0.5, new HollowFoundryII().anneal3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias3() {
        assertEquals(4.0, new HollowFoundryII().anneal3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity4() {
        assertTrue(new HollowFoundryII().sift4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new HollowFoundryII().sift4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity4() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowFoundryII().sift4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth5() {
        assertEquals("below", new HollowFoundryII().flatten5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth5() {
        HollowFoundryII subject = new HollowFoundryII();
        assertEquals("lower-bound", subject.flatten5(3));
        assertEquals("upper-bound", subject.flatten5(12));
    }

    @Test
    void classifiesWithinAndAboveDepth5() {
        HollowFoundryII subject = new HollowFoundryII();
        assertEquals("within", subject.flatten5(3 + 1));
        assertEquals("above", subject.flatten5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin6() {
        HollowFoundryII subject = new HollowFoundryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift6());
        }
        assertEquals(3, subject.depth6Count());
    }

    @Test
    void refusesOnceExhaustedMargin6() {
        HollowFoundryII subject = new HollowFoundryII();
        for (int i = 0; i < 3; i++) {
            subject.sift6();
        }
        assertFalse(subject.sift6());
    }

    @Test
    void accumulatesBelowTheCapDrift7() {
        HollowFoundryII subject = new HollowFoundryII();
        assertEquals(1, subject.winnow7(1));
        assertEquals(3, subject.winnow7(2));
    }

    @Test
    void saturatesAtTheCapDrift7() {
        HollowFoundryII subject = new HollowFoundryII();
        subject.winnow7(27);
        assertEquals(27, subject.winnow7(5));
    }

    @Test
    void ignoresNegativeValuesDrift7() {
        HollowFoundryII subject = new HollowFoundryII();
        subject.winnow7(3);
        assertEquals(3, subject.winnow7(-2));
        assertEquals(3, subject.weight7Value());
    }

    @Test
    void rejectsZeroDenominatorDepth8() {
        HollowFoundryII subject = new HollowFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.temper8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth8() {
        assertEquals(0.5, new HollowFoundryII().temper8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth8() {
        assertEquals(4.0, new HollowFoundryII().temper8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity9() {
        assertTrue(new HollowFoundryII().anneal9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new HollowFoundryII().anneal9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity9() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowFoundryII().anneal9(java.util.Arrays.asList(null, 6, null)));
    }
}
