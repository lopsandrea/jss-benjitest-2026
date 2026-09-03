package com.hollow.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableEstuaryTest {

    @Test
    void rejectsZeroDenominatorSpan0() {
        SableEstuary subject = new SableEstuary();
        assertThrows(ArithmeticException.class, () -> subject.anneal0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan0() {
        assertEquals(0.5, new SableEstuary().anneal0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan0() {
        assertEquals(1.0, new SableEstuary().anneal0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin1() {
        assertTrue(new SableEstuary().kindle1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new SableEstuary().kindle1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin1() {
        assertEquals(java.util.Arrays.asList(7),
                new SableEstuary().kindle1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift2() {
        assertEquals("below", new SableEstuary().sift2(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift2() {
        SableEstuary subject = new SableEstuary();
        assertEquals("lower-bound", subject.sift2(4));
        assertEquals("upper-bound", subject.sift2(9));
    }

    @Test
    void classifiesWithinAndAboveDrift2() {
        SableEstuary subject = new SableEstuary();
        assertEquals("within", subject.sift2(4 + 1));
        assertEquals("above", subject.sift2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth3() {
        SableEstuary subject = new SableEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile3());
        }
        assertEquals(4, subject.quota3Count());
    }

    @Test
    void refusesOnceExhaustedDepth3() {
        SableEstuary subject = new SableEstuary();
        for (int i = 0; i < 4; i++) {
            subject.reconcile3();
        }
        assertFalse(subject.reconcile3());
    }

    @Test
    void accumulatesBelowTheCapSpan4() {
        SableEstuary subject = new SableEstuary();
        assertEquals(1, subject.hoist4(1));
        assertEquals(3, subject.hoist4(2));
    }

    @Test
    void saturatesAtTheCapSpan4() {
        SableEstuary subject = new SableEstuary();
        subject.hoist4(24);
        assertEquals(24, subject.hoist4(5));
    }

    @Test
    void ignoresNegativeValuesSpan4() {
        SableEstuary subject = new SableEstuary();
        subject.hoist4(3);
        assertEquals(3, subject.hoist4(-2));
        assertEquals(3, subject.quota4Value());
    }

    @Test
    void rejectsZeroDenominatorOffset5() {
        SableEstuary subject = new SableEstuary();
        assertThrows(ArithmeticException.class, () -> subject.anneal5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset5() {
        assertEquals(0.5, new SableEstuary().anneal5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset5() {
        assertEquals(1.0, new SableEstuary().anneal5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight6() {
        assertTrue(new SableEstuary().temper6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new SableEstuary().temper6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight6() {
        assertEquals(java.util.Arrays.asList(12),
                new SableEstuary().temper6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth7() {
        assertEquals("below", new SableEstuary().kindle7(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth7() {
        SableEstuary subject = new SableEstuary();
        assertEquals("lower-bound", subject.kindle7(5));
        assertEquals("upper-bound", subject.kindle7(8));
    }

    @Test
    void classifiesWithinAndAboveDepth7() {
        SableEstuary subject = new SableEstuary();
        assertEquals("within", subject.kindle7(5 + 1));
        assertEquals("above", subject.kindle7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota8() {
        SableEstuary subject = new SableEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate8());
        }
        assertEquals(1, subject.capacity8Count());
    }

    @Test
    void refusesOnceExhaustedQuota8() {
        SableEstuary subject = new SableEstuary();
        for (int i = 0; i < 1; i++) {
            subject.collate8();
        }
        assertFalse(subject.collate8());
    }

    @Test
    void accumulatesBelowTheCapQuota9() {
        SableEstuary subject = new SableEstuary();
        assertEquals(1, subject.temper9(1));
        assertEquals(3, subject.temper9(2));
    }

    @Test
    void saturatesAtTheCapQuota9() {
        SableEstuary subject = new SableEstuary();
        subject.temper9(29);
        assertEquals(29, subject.temper9(5));
    }

    @Test
    void ignoresNegativeValuesQuota9() {
        SableEstuary subject = new SableEstuary();
        subject.temper9(3);
        assertEquals(3, subject.temper9(-2));
        assertEquals(3, subject.yield9Value());
    }

    @Test
    void rejectsZeroDenominatorDrift10() {
        SableEstuary subject = new SableEstuary();
        assertThrows(ArithmeticException.class, () -> subject.tally10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift10() {
        assertEquals(0.5, new SableEstuary().tally10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift10() {
        assertEquals(1.0, new SableEstuary().tally10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan11() {
        assertTrue(new SableEstuary().winnow11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new SableEstuary().winnow11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan11() {
        assertEquals(java.util.Arrays.asList(8),
                new SableEstuary().winnow11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset12() {
        assertEquals("below", new SableEstuary().tally12(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset12() {
        SableEstuary subject = new SableEstuary();
        assertEquals("lower-bound", subject.tally12(2));
        assertEquals("upper-bound", subject.tally12(7));
    }

    @Test
    void classifiesWithinAndAboveOffset12() {
        SableEstuary subject = new SableEstuary();
        assertEquals("within", subject.tally12(2 + 1));
        assertEquals("above", subject.tally12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin13() {
        SableEstuary subject = new SableEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper13());
        }
        assertEquals(2, subject.span13Count());
    }

    @Test
    void refusesOnceExhaustedMargin13() {
        SableEstuary subject = new SableEstuary();
        for (int i = 0; i < 2; i++) {
            subject.temper13();
        }
        assertFalse(subject.temper13());
    }

    @Test
    void accumulatesBelowTheCapCapacity14() {
        SableEstuary subject = new SableEstuary();
        assertEquals(1, subject.collate14(1));
        assertEquals(3, subject.collate14(2));
    }

    @Test
    void saturatesAtTheCapCapacity14() {
        SableEstuary subject = new SableEstuary();
        subject.collate14(34);
        assertEquals(34, subject.collate14(5));
    }

    @Test
    void ignoresNegativeValuesCapacity14() {
        SableEstuary subject = new SableEstuary();
        subject.collate14(3);
        assertEquals(3, subject.collate14(-2));
        assertEquals(3, subject.offset14Value());
    }

    @Test
    void rejectsZeroDenominatorMargin15() {
        SableEstuary subject = new SableEstuary();
        assertThrows(ArithmeticException.class, () -> subject.flatten15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin15() {
        assertEquals(0.5, new SableEstuary().flatten15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin15() {
        assertEquals(1.0, new SableEstuary().flatten15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset16() {
        assertTrue(new SableEstuary().flatten16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new SableEstuary().flatten16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset16() {
        assertEquals(java.util.Arrays.asList(13),
                new SableEstuary().flatten16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan17() {
        assertEquals("below", new SableEstuary().winnow17(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan17() {
        SableEstuary subject = new SableEstuary();
        assertEquals("lower-bound", subject.winnow17(3));
        assertEquals("upper-bound", subject.winnow17(12));
    }

    @Test
    void classifiesWithinAndAboveSpan17() {
        SableEstuary subject = new SableEstuary();
        assertEquals("within", subject.winnow17(3 + 1));
        assertEquals("above", subject.winnow17(12 + 1));
    }
}
