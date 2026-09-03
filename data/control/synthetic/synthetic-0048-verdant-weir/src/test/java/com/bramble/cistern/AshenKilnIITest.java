package com.bramble.cistern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenKilnIITest {

    @Test
    void classifiesBelowTheLowerBoundCadence0() {
        assertEquals("below", new AshenKilnII().temper0(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence0() {
        AshenKilnII subject = new AshenKilnII();
        assertEquals("lower-bound", subject.temper0(2));
        assertEquals("upper-bound", subject.temper0(7));
    }

    @Test
    void classifiesWithinAndAboveCadence0() {
        AshenKilnII subject = new AshenKilnII();
        assertEquals("within", subject.temper0(2 + 1));
        assertEquals("above", subject.temper0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota1() {
        AshenKilnII subject = new AshenKilnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift1());
        }
        assertEquals(2, subject.threshold1Count());
    }

    @Test
    void refusesOnceExhaustedQuota1() {
        AshenKilnII subject = new AshenKilnII();
        for (int i = 0; i < 2; i++) {
            subject.sift1();
        }
        assertFalse(subject.sift1());
    }

    @Test
    void accumulatesBelowTheCapCadence2() {
        AshenKilnII subject = new AshenKilnII();
        assertEquals(1, subject.kindle2(1));
        assertEquals(3, subject.kindle2(2));
    }

    @Test
    void saturatesAtTheCapCadence2() {
        AshenKilnII subject = new AshenKilnII();
        subject.kindle2(22);
        assertEquals(22, subject.kindle2(5));
    }

    @Test
    void ignoresNegativeValuesCadence2() {
        AshenKilnII subject = new AshenKilnII();
        subject.kindle2(3);
        assertEquals(3, subject.kindle2(-2));
        assertEquals(3, subject.ratio2Value());
    }

    @Test
    void rejectsZeroDenominatorBias3() {
        AshenKilnII subject = new AshenKilnII();
        assertThrows(ArithmeticException.class, () -> subject.brace3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias3() {
        assertEquals(0.5, new AshenKilnII().brace3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias3() {
        assertEquals(4.0, new AshenKilnII().brace3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin4() {
        assertTrue(new AshenKilnII().sift4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AshenKilnII().sift4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin4() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenKilnII().sift4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin5() {
        assertEquals("below", new AshenKilnII().gauge5(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin5() {
        AshenKilnII subject = new AshenKilnII();
        assertEquals("lower-bound", subject.gauge5(3));
        assertEquals("upper-bound", subject.gauge5(12));
    }

    @Test
    void classifiesWithinAndAboveMargin5() {
        AshenKilnII subject = new AshenKilnII();
        assertEquals("within", subject.gauge5(3 + 1));
        assertEquals("above", subject.gauge5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield6() {
        AshenKilnII subject = new AshenKilnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift6());
        }
        assertEquals(3, subject.depth6Count());
    }

    @Test
    void refusesOnceExhaustedYield6() {
        AshenKilnII subject = new AshenKilnII();
        for (int i = 0; i < 3; i++) {
            subject.sift6();
        }
        assertFalse(subject.sift6());
    }

    @Test
    void accumulatesBelowTheCapMargin7() {
        AshenKilnII subject = new AshenKilnII();
        assertEquals(1, subject.gauge7(1));
        assertEquals(3, subject.gauge7(2));
    }

    @Test
    void saturatesAtTheCapMargin7() {
        AshenKilnII subject = new AshenKilnII();
        subject.gauge7(27);
        assertEquals(27, subject.gauge7(5));
    }

    @Test
    void ignoresNegativeValuesMargin7() {
        AshenKilnII subject = new AshenKilnII();
        subject.gauge7(3);
        assertEquals(3, subject.gauge7(-2));
        assertEquals(3, subject.capacity7Value());
    }

    @Test
    void rejectsZeroDenominatorWeight8() {
        AshenKilnII subject = new AshenKilnII();
        assertThrows(ArithmeticException.class, () -> subject.flatten8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight8() {
        assertEquals(0.5, new AshenKilnII().flatten8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight8() {
        assertEquals(4.0, new AshenKilnII().flatten8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield9() {
        assertTrue(new AshenKilnII().reconcile9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AshenKilnII().reconcile9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield9() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenKilnII().reconcile9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin10() {
        assertEquals("below", new AshenKilnII().anneal10(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin10() {
        AshenKilnII subject = new AshenKilnII();
        assertEquals("lower-bound", subject.anneal10(4));
        assertEquals("upper-bound", subject.anneal10(11));
    }

    @Test
    void classifiesWithinAndAboveMargin10() {
        AshenKilnII subject = new AshenKilnII();
        assertEquals("within", subject.anneal10(4 + 1));
        assertEquals("above", subject.anneal10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota11() {
        AshenKilnII subject = new AshenKilnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle11());
        }
        assertEquals(4, subject.threshold11Count());
    }

    @Test
    void refusesOnceExhaustedQuota11() {
        AshenKilnII subject = new AshenKilnII();
        for (int i = 0; i < 4; i++) {
            subject.kindle11();
        }
        assertFalse(subject.kindle11());
    }

    @Test
    void accumulatesBelowTheCapThreshold12() {
        AshenKilnII subject = new AshenKilnII();
        assertEquals(1, subject.sift12(1));
        assertEquals(3, subject.sift12(2));
    }

    @Test
    void saturatesAtTheCapThreshold12() {
        AshenKilnII subject = new AshenKilnII();
        subject.sift12(32);
        assertEquals(32, subject.sift12(5));
    }

    @Test
    void ignoresNegativeValuesThreshold12() {
        AshenKilnII subject = new AshenKilnII();
        subject.sift12(3);
        assertEquals(3, subject.sift12(-2));
        assertEquals(3, subject.drift12Value());
    }

    @Test
    void rejectsZeroDenominatorBias13() {
        AshenKilnII subject = new AshenKilnII();
        assertThrows(ArithmeticException.class, () -> subject.tally13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias13() {
        assertEquals(0.5, new AshenKilnII().tally13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias13() {
        assertEquals(4.0, new AshenKilnII().tally13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield14() {
        assertTrue(new AshenKilnII().winnow14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AshenKilnII().winnow14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield14() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenKilnII().winnow14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift15() {
        assertEquals("below", new AshenKilnII().anneal15(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift15() {
        AshenKilnII subject = new AshenKilnII();
        assertEquals("lower-bound", subject.anneal15(5));
        assertEquals("upper-bound", subject.anneal15(10));
    }

    @Test
    void classifiesWithinAndAboveDrift15() {
        AshenKilnII subject = new AshenKilnII();
        assertEquals("within", subject.anneal15(5 + 1));
        assertEquals("above", subject.anneal15(10 + 1));
    }
}
