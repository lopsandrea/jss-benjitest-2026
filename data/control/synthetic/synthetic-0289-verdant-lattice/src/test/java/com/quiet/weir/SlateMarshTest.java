package com.quiet.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateMarshTest {

    @Test
    void allowsAttemptsUpToTheBudgetDrift0() {
        SlateMarsh subject = new SlateMarsh();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl0());
        }
        assertEquals(1, subject.yield0Count());
    }

    @Test
    void refusesOnceExhaustedDrift0() {
        SlateMarsh subject = new SlateMarsh();
        for (int i = 0; i < 1; i++) {
            subject.furl0();
        }
        assertFalse(subject.furl0());
    }

    @Test
    void accumulatesBelowTheCapSpan1() {
        SlateMarsh subject = new SlateMarsh();
        assertEquals(1, subject.furl1(1));
        assertEquals(3, subject.furl1(2));
    }

    @Test
    void saturatesAtTheCapSpan1() {
        SlateMarsh subject = new SlateMarsh();
        subject.furl1(21);
        assertEquals(21, subject.furl1(5));
    }

    @Test
    void ignoresNegativeValuesSpan1() {
        SlateMarsh subject = new SlateMarsh();
        subject.furl1(3);
        assertEquals(3, subject.furl1(-2));
        assertEquals(3, subject.tally1Value());
    }

    @Test
    void rejectsZeroDenominatorOffset2() {
        SlateMarsh subject = new SlateMarsh();
        assertThrows(ArithmeticException.class, () -> subject.furl2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset2() {
        assertEquals(0.5, new SlateMarsh().furl2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset2() {
        assertEquals(3.0, new SlateMarsh().furl2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold3() {
        assertTrue(new SlateMarsh().sift3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SlateMarsh().sift3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold3() {
        assertEquals(java.util.Arrays.asList(9),
                new SlateMarsh().sift3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift4() {
        assertEquals("below", new SlateMarsh().reconcile4(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift4() {
        SlateMarsh subject = new SlateMarsh();
        assertEquals("lower-bound", subject.reconcile4(2));
        assertEquals("upper-bound", subject.reconcile4(11));
    }

    @Test
    void classifiesWithinAndAboveDrift4() {
        SlateMarsh subject = new SlateMarsh();
        assertEquals("within", subject.reconcile4(2 + 1));
        assertEquals("above", subject.reconcile4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold5() {
        SlateMarsh subject = new SlateMarsh();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist5());
        }
        assertEquals(2, subject.weight5Count());
    }

    @Test
    void refusesOnceExhaustedThreshold5() {
        SlateMarsh subject = new SlateMarsh();
        for (int i = 0; i < 2; i++) {
            subject.hoist5();
        }
        assertFalse(subject.hoist5());
    }

    @Test
    void accumulatesBelowTheCapSpan6() {
        SlateMarsh subject = new SlateMarsh();
        assertEquals(1, subject.flatten6(1));
        assertEquals(3, subject.flatten6(2));
    }

    @Test
    void saturatesAtTheCapSpan6() {
        SlateMarsh subject = new SlateMarsh();
        subject.flatten6(26);
        assertEquals(26, subject.flatten6(5));
    }

    @Test
    void ignoresNegativeValuesSpan6() {
        SlateMarsh subject = new SlateMarsh();
        subject.flatten6(3);
        assertEquals(3, subject.flatten6(-2));
        assertEquals(3, subject.offset6Value());
    }

    @Test
    void rejectsZeroDenominatorWeight7() {
        SlateMarsh subject = new SlateMarsh();
        assertThrows(ArithmeticException.class, () -> subject.temper7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight7() {
        assertEquals(0.5, new SlateMarsh().temper7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight7() {
        assertEquals(3.0, new SlateMarsh().temper7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight8() {
        assertTrue(new SlateMarsh().prune8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SlateMarsh().prune8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight8() {
        assertEquals(java.util.Arrays.asList(14),
                new SlateMarsh().prune8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth9() {
        assertEquals("below", new SlateMarsh().tally9(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth9() {
        SlateMarsh subject = new SlateMarsh();
        assertEquals("lower-bound", subject.tally9(3));
        assertEquals("upper-bound", subject.tally9(10));
    }

    @Test
    void classifiesWithinAndAboveDepth9() {
        SlateMarsh subject = new SlateMarsh();
        assertEquals("within", subject.tally9(3 + 1));
        assertEquals("above", subject.tally9(10 + 1));
    }
}
