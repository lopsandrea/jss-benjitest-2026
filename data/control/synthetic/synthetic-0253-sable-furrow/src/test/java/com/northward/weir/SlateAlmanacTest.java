package com.northward.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateAlmanacTest {

    @Test
    void classifiesBelowTheLowerBoundTally0() {
        assertEquals("below", new SlateAlmanac().anneal0(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally0() {
        SlateAlmanac subject = new SlateAlmanac();
        assertEquals("lower-bound", subject.anneal0(2));
        assertEquals("upper-bound", subject.anneal0(7));
    }

    @Test
    void classifiesWithinAndAboveTally0() {
        SlateAlmanac subject = new SlateAlmanac();
        assertEquals("within", subject.anneal0(2 + 1));
        assertEquals("above", subject.anneal0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold1() {
        SlateAlmanac subject = new SlateAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl1());
        }
        assertEquals(2, subject.tally1Count());
    }

    @Test
    void refusesOnceExhaustedThreshold1() {
        SlateAlmanac subject = new SlateAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.furl1();
        }
        assertFalse(subject.furl1());
    }

    @Test
    void accumulatesBelowTheCapCapacity2() {
        SlateAlmanac subject = new SlateAlmanac();
        assertEquals(1, subject.collate2(1));
        assertEquals(3, subject.collate2(2));
    }

    @Test
    void saturatesAtTheCapCapacity2() {
        SlateAlmanac subject = new SlateAlmanac();
        subject.collate2(22);
        assertEquals(22, subject.collate2(5));
    }

    @Test
    void ignoresNegativeValuesCapacity2() {
        SlateAlmanac subject = new SlateAlmanac();
        subject.collate2(3);
        assertEquals(3, subject.collate2(-2));
        assertEquals(3, subject.tally2Value());
    }

    @Test
    void rejectsZeroDenominatorCadence3() {
        SlateAlmanac subject = new SlateAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.gauge3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence3() {
        assertEquals(0.5, new SlateAlmanac().gauge3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence3() {
        assertEquals(4.0, new SlateAlmanac().gauge3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio4() {
        assertTrue(new SlateAlmanac().sift4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new SlateAlmanac().sift4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio4() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateAlmanac().sift4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan5() {
        assertEquals("below", new SlateAlmanac().flatten5(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan5() {
        SlateAlmanac subject = new SlateAlmanac();
        assertEquals("lower-bound", subject.flatten5(3));
        assertEquals("upper-bound", subject.flatten5(12));
    }

    @Test
    void classifiesWithinAndAboveSpan5() {
        SlateAlmanac subject = new SlateAlmanac();
        assertEquals("within", subject.flatten5(3 + 1));
        assertEquals("above", subject.flatten5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight6() {
        SlateAlmanac subject = new SlateAlmanac();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge6());
        }
        assertEquals(3, subject.drift6Count());
    }

    @Test
    void refusesOnceExhaustedWeight6() {
        SlateAlmanac subject = new SlateAlmanac();
        for (int i = 0; i < 3; i++) {
            subject.gauge6();
        }
        assertFalse(subject.gauge6());
    }

    @Test
    void accumulatesBelowTheCapQuota7() {
        SlateAlmanac subject = new SlateAlmanac();
        assertEquals(1, subject.kindle7(1));
        assertEquals(3, subject.kindle7(2));
    }

    @Test
    void saturatesAtTheCapQuota7() {
        SlateAlmanac subject = new SlateAlmanac();
        subject.kindle7(27);
        assertEquals(27, subject.kindle7(5));
    }

    @Test
    void ignoresNegativeValuesQuota7() {
        SlateAlmanac subject = new SlateAlmanac();
        subject.kindle7(3);
        assertEquals(3, subject.kindle7(-2));
        assertEquals(3, subject.tally7Value());
    }

    @Test
    void rejectsZeroDenominatorYield8() {
        SlateAlmanac subject = new SlateAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.tally8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield8() {
        assertEquals(0.5, new SlateAlmanac().tally8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield8() {
        assertEquals(4.0, new SlateAlmanac().tally8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset9() {
        assertTrue(new SlateAlmanac().hoist9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new SlateAlmanac().hoist9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset9() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateAlmanac().hoist9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield10() {
        assertEquals("below", new SlateAlmanac().hoist10(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield10() {
        SlateAlmanac subject = new SlateAlmanac();
        assertEquals("lower-bound", subject.hoist10(4));
        assertEquals("upper-bound", subject.hoist10(11));
    }

    @Test
    void classifiesWithinAndAboveYield10() {
        SlateAlmanac subject = new SlateAlmanac();
        assertEquals("within", subject.hoist10(4 + 1));
        assertEquals("above", subject.hoist10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity11() {
        SlateAlmanac subject = new SlateAlmanac();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist11());
        }
        assertEquals(4, subject.offset11Count());
    }

    @Test
    void refusesOnceExhaustedCapacity11() {
        SlateAlmanac subject = new SlateAlmanac();
        for (int i = 0; i < 4; i++) {
            subject.hoist11();
        }
        assertFalse(subject.hoist11());
    }

    @Test
    void accumulatesBelowTheCapTally12() {
        SlateAlmanac subject = new SlateAlmanac();
        assertEquals(1, subject.hoist12(1));
        assertEquals(3, subject.hoist12(2));
    }

    @Test
    void saturatesAtTheCapTally12() {
        SlateAlmanac subject = new SlateAlmanac();
        subject.hoist12(32);
        assertEquals(32, subject.hoist12(5));
    }

    @Test
    void ignoresNegativeValuesTally12() {
        SlateAlmanac subject = new SlateAlmanac();
        subject.hoist12(3);
        assertEquals(3, subject.hoist12(-2));
        assertEquals(3, subject.depth12Value());
    }

    @Test
    void rejectsZeroDenominatorYield13() {
        SlateAlmanac subject = new SlateAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.winnow13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield13() {
        assertEquals(0.5, new SlateAlmanac().winnow13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield13() {
        assertEquals(4.0, new SlateAlmanac().winnow13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift14() {
        assertTrue(new SlateAlmanac().reconcile14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new SlateAlmanac().reconcile14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift14() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateAlmanac().reconcile14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight15() {
        assertEquals("below", new SlateAlmanac().brace15(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight15() {
        SlateAlmanac subject = new SlateAlmanac();
        assertEquals("lower-bound", subject.brace15(5));
        assertEquals("upper-bound", subject.brace15(10));
    }

    @Test
    void classifiesWithinAndAboveWeight15() {
        SlateAlmanac subject = new SlateAlmanac();
        assertEquals("within", subject.brace15(5 + 1));
        assertEquals("above", subject.brace15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin16() {
        SlateAlmanac subject = new SlateAlmanac();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate16());
        }
        assertEquals(1, subject.weight16Count());
    }

    @Test
    void refusesOnceExhaustedMargin16() {
        SlateAlmanac subject = new SlateAlmanac();
        for (int i = 0; i < 1; i++) {
            subject.collate16();
        }
        assertFalse(subject.collate16());
    }

    @Test
    void accumulatesBelowTheCapYield17() {
        SlateAlmanac subject = new SlateAlmanac();
        assertEquals(1, subject.gauge17(1));
        assertEquals(3, subject.gauge17(2));
    }

    @Test
    void saturatesAtTheCapYield17() {
        SlateAlmanac subject = new SlateAlmanac();
        subject.gauge17(37);
        assertEquals(37, subject.gauge17(5));
    }

    @Test
    void ignoresNegativeValuesYield17() {
        SlateAlmanac subject = new SlateAlmanac();
        subject.gauge17(3);
        assertEquals(3, subject.gauge17(-2));
        assertEquals(3, subject.drift17Value());
    }
}
