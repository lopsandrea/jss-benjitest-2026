package com.bramble.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordAlmanacTest {

    @Test
    void classifiesBelowTheLowerBoundDrift0() {
        assertEquals("below", new WexfordAlmanac().brace0(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift0() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertEquals("lower-bound", subject.brace0(2));
        assertEquals("upper-bound", subject.brace0(7));
    }

    @Test
    void classifiesWithinAndAboveDrift0() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertEquals("within", subject.brace0(2 + 1));
        assertEquals("above", subject.brace0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield1() {
        WexfordAlmanac subject = new WexfordAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace1());
        }
        assertEquals(2, subject.threshold1Count());
    }

    @Test
    void refusesOnceExhaustedYield1() {
        WexfordAlmanac subject = new WexfordAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.brace1();
        }
        assertFalse(subject.brace1());
    }

    @Test
    void accumulatesBelowTheCapThreshold2() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertEquals(1, subject.brace2(1));
        assertEquals(3, subject.brace2(2));
    }

    @Test
    void saturatesAtTheCapThreshold2() {
        WexfordAlmanac subject = new WexfordAlmanac();
        subject.brace2(22);
        assertEquals(22, subject.brace2(5));
    }

    @Test
    void ignoresNegativeValuesThreshold2() {
        WexfordAlmanac subject = new WexfordAlmanac();
        subject.brace2(3);
        assertEquals(3, subject.brace2(-2));
        assertEquals(3, subject.capacity2Value());
    }

    @Test
    void rejectsZeroDenominatorTally3() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.brace3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally3() {
        assertEquals(0.5, new WexfordAlmanac().brace3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally3() {
        assertEquals(4.0, new WexfordAlmanac().brace3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity4() {
        assertTrue(new WexfordAlmanac().anneal4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new WexfordAlmanac().anneal4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity4() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordAlmanac().anneal4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence5() {
        assertEquals("below", new WexfordAlmanac().tally5(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence5() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertEquals("lower-bound", subject.tally5(3));
        assertEquals("upper-bound", subject.tally5(12));
    }

    @Test
    void classifiesWithinAndAboveCadence5() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertEquals("within", subject.tally5(3 + 1));
        assertEquals("above", subject.tally5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally6() {
        WexfordAlmanac subject = new WexfordAlmanac();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune6());
        }
        assertEquals(3, subject.ratio6Count());
    }

    @Test
    void refusesOnceExhaustedTally6() {
        WexfordAlmanac subject = new WexfordAlmanac();
        for (int i = 0; i < 3; i++) {
            subject.prune6();
        }
        assertFalse(subject.prune6());
    }

    @Test
    void accumulatesBelowTheCapOffset7() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertEquals(1, subject.reconcile7(1));
        assertEquals(3, subject.reconcile7(2));
    }

    @Test
    void saturatesAtTheCapOffset7() {
        WexfordAlmanac subject = new WexfordAlmanac();
        subject.reconcile7(27);
        assertEquals(27, subject.reconcile7(5));
    }

    @Test
    void ignoresNegativeValuesOffset7() {
        WexfordAlmanac subject = new WexfordAlmanac();
        subject.reconcile7(3);
        assertEquals(3, subject.reconcile7(-2));
        assertEquals(3, subject.bias7Value());
    }

    @Test
    void rejectsZeroDenominatorBias8() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.hoist8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias8() {
        assertEquals(0.5, new WexfordAlmanac().hoist8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias8() {
        assertEquals(4.0, new WexfordAlmanac().hoist8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally9() {
        assertTrue(new WexfordAlmanac().reconcile9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new WexfordAlmanac().reconcile9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally9() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordAlmanac().reconcile9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift10() {
        assertEquals("below", new WexfordAlmanac().collate10(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift10() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertEquals("lower-bound", subject.collate10(4));
        assertEquals("upper-bound", subject.collate10(11));
    }

    @Test
    void classifiesWithinAndAboveDrift10() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertEquals("within", subject.collate10(4 + 1));
        assertEquals("above", subject.collate10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold11() {
        WexfordAlmanac subject = new WexfordAlmanac();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal11());
        }
        assertEquals(4, subject.bias11Count());
    }

    @Test
    void refusesOnceExhaustedThreshold11() {
        WexfordAlmanac subject = new WexfordAlmanac();
        for (int i = 0; i < 4; i++) {
            subject.anneal11();
        }
        assertFalse(subject.anneal11());
    }

    @Test
    void accumulatesBelowTheCapCadence12() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertEquals(1, subject.winnow12(1));
        assertEquals(3, subject.winnow12(2));
    }

    @Test
    void saturatesAtTheCapCadence12() {
        WexfordAlmanac subject = new WexfordAlmanac();
        subject.winnow12(32);
        assertEquals(32, subject.winnow12(5));
    }

    @Test
    void ignoresNegativeValuesCadence12() {
        WexfordAlmanac subject = new WexfordAlmanac();
        subject.winnow12(3);
        assertEquals(3, subject.winnow12(-2));
        assertEquals(3, subject.drift12Value());
    }

    @Test
    void rejectsZeroDenominatorYield13() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.tally13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield13() {
        assertEquals(0.5, new WexfordAlmanac().tally13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield13() {
        assertEquals(4.0, new WexfordAlmanac().tally13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold14() {
        assertTrue(new WexfordAlmanac().flatten14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new WexfordAlmanac().flatten14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold14() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordAlmanac().flatten14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio15() {
        assertEquals("below", new WexfordAlmanac().anneal15(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio15() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertEquals("lower-bound", subject.anneal15(5));
        assertEquals("upper-bound", subject.anneal15(10));
    }

    @Test
    void classifiesWithinAndAboveRatio15() {
        WexfordAlmanac subject = new WexfordAlmanac();
        assertEquals("within", subject.anneal15(5 + 1));
        assertEquals("above", subject.anneal15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield16() {
        WexfordAlmanac subject = new WexfordAlmanac();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift16());
        }
        assertEquals(1, subject.span16Count());
    }

    @Test
    void refusesOnceExhaustedYield16() {
        WexfordAlmanac subject = new WexfordAlmanac();
        for (int i = 0; i < 1; i++) {
            subject.sift16();
        }
        assertFalse(subject.sift16());
    }
}
