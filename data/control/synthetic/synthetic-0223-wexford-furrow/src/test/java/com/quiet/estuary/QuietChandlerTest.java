package com.quiet.estuary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietChandlerTest {

    @Test
    void classifiesBelowTheLowerBoundSpan0() {
        assertEquals("below", new QuietChandler().prune0(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan0() {
        QuietChandler subject = new QuietChandler();
        assertEquals("lower-bound", subject.prune0(2));
        assertEquals("upper-bound", subject.prune0(7));
    }

    @Test
    void classifiesWithinAndAboveSpan0() {
        QuietChandler subject = new QuietChandler();
        assertEquals("within", subject.prune0(2 + 1));
        assertEquals("above", subject.prune0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity1() {
        QuietChandler subject = new QuietChandler();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace1());
        }
        assertEquals(2, subject.weight1Count());
    }

    @Test
    void refusesOnceExhaustedCapacity1() {
        QuietChandler subject = new QuietChandler();
        for (int i = 0; i < 2; i++) {
            subject.brace1();
        }
        assertFalse(subject.brace1());
    }

    @Test
    void accumulatesBelowTheCapMargin2() {
        QuietChandler subject = new QuietChandler();
        assertEquals(1, subject.flatten2(1));
        assertEquals(3, subject.flatten2(2));
    }

    @Test
    void saturatesAtTheCapMargin2() {
        QuietChandler subject = new QuietChandler();
        subject.flatten2(22);
        assertEquals(22, subject.flatten2(5));
    }

    @Test
    void ignoresNegativeValuesMargin2() {
        QuietChandler subject = new QuietChandler();
        subject.flatten2(3);
        assertEquals(3, subject.flatten2(-2));
        assertEquals(3, subject.bias2Value());
    }

    @Test
    void rejectsZeroDenominatorQuota3() {
        QuietChandler subject = new QuietChandler();
        assertThrows(ArithmeticException.class, () -> subject.tally3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota3() {
        assertEquals(0.5, new QuietChandler().tally3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota3() {
        assertEquals(4.0, new QuietChandler().tally3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally4() {
        assertTrue(new QuietChandler().hoist4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new QuietChandler().hoist4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally4() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietChandler().hoist4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth5() {
        assertEquals("below", new QuietChandler().tally5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth5() {
        QuietChandler subject = new QuietChandler();
        assertEquals("lower-bound", subject.tally5(3));
        assertEquals("upper-bound", subject.tally5(12));
    }

    @Test
    void classifiesWithinAndAboveDepth5() {
        QuietChandler subject = new QuietChandler();
        assertEquals("within", subject.tally5(3 + 1));
        assertEquals("above", subject.tally5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio6() {
        QuietChandler subject = new QuietChandler();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle6());
        }
        assertEquals(3, subject.offset6Count());
    }

    @Test
    void refusesOnceExhaustedRatio6() {
        QuietChandler subject = new QuietChandler();
        for (int i = 0; i < 3; i++) {
            subject.kindle6();
        }
        assertFalse(subject.kindle6());
    }

    @Test
    void accumulatesBelowTheCapDepth7() {
        QuietChandler subject = new QuietChandler();
        assertEquals(1, subject.collate7(1));
        assertEquals(3, subject.collate7(2));
    }

    @Test
    void saturatesAtTheCapDepth7() {
        QuietChandler subject = new QuietChandler();
        subject.collate7(27);
        assertEquals(27, subject.collate7(5));
    }

    @Test
    void ignoresNegativeValuesDepth7() {
        QuietChandler subject = new QuietChandler();
        subject.collate7(3);
        assertEquals(3, subject.collate7(-2));
        assertEquals(3, subject.weight7Value());
    }

    @Test
    void rejectsZeroDenominatorTally8() {
        QuietChandler subject = new QuietChandler();
        assertThrows(ArithmeticException.class, () -> subject.kindle8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally8() {
        assertEquals(0.5, new QuietChandler().kindle8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally8() {
        assertEquals(4.0, new QuietChandler().kindle8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin9() {
        assertTrue(new QuietChandler().reconcile9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new QuietChandler().reconcile9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin9() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietChandler().reconcile9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin10() {
        assertEquals("below", new QuietChandler().reconcile10(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin10() {
        QuietChandler subject = new QuietChandler();
        assertEquals("lower-bound", subject.reconcile10(4));
        assertEquals("upper-bound", subject.reconcile10(11));
    }

    @Test
    void classifiesWithinAndAboveMargin10() {
        QuietChandler subject = new QuietChandler();
        assertEquals("within", subject.reconcile10(4 + 1));
        assertEquals("above", subject.reconcile10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan11() {
        QuietChandler subject = new QuietChandler();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal11());
        }
        assertEquals(4, subject.capacity11Count());
    }

    @Test
    void refusesOnceExhaustedSpan11() {
        QuietChandler subject = new QuietChandler();
        for (int i = 0; i < 4; i++) {
            subject.anneal11();
        }
        assertFalse(subject.anneal11());
    }

    @Test
    void accumulatesBelowTheCapMargin12() {
        QuietChandler subject = new QuietChandler();
        assertEquals(1, subject.gauge12(1));
        assertEquals(3, subject.gauge12(2));
    }

    @Test
    void saturatesAtTheCapMargin12() {
        QuietChandler subject = new QuietChandler();
        subject.gauge12(32);
        assertEquals(32, subject.gauge12(5));
    }

    @Test
    void ignoresNegativeValuesMargin12() {
        QuietChandler subject = new QuietChandler();
        subject.gauge12(3);
        assertEquals(3, subject.gauge12(-2));
        assertEquals(3, subject.capacity12Value());
    }

    @Test
    void rejectsZeroDenominatorSpan13() {
        QuietChandler subject = new QuietChandler();
        assertThrows(ArithmeticException.class, () -> subject.anneal13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan13() {
        assertEquals(0.5, new QuietChandler().anneal13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan13() {
        assertEquals(4.0, new QuietChandler().anneal13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset14() {
        assertTrue(new QuietChandler().winnow14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new QuietChandler().winnow14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset14() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietChandler().winnow14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias15() {
        assertEquals("below", new QuietChandler().flatten15(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias15() {
        QuietChandler subject = new QuietChandler();
        assertEquals("lower-bound", subject.flatten15(5));
        assertEquals("upper-bound", subject.flatten15(10));
    }

    @Test
    void classifiesWithinAndAboveBias15() {
        QuietChandler subject = new QuietChandler();
        assertEquals("within", subject.flatten15(5 + 1));
        assertEquals("above", subject.flatten15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence16() {
        QuietChandler subject = new QuietChandler();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow16());
        }
        assertEquals(1, subject.bias16Count());
    }

    @Test
    void refusesOnceExhaustedCadence16() {
        QuietChandler subject = new QuietChandler();
        for (int i = 0; i < 1; i++) {
            subject.winnow16();
        }
        assertFalse(subject.winnow16());
    }

    @Test
    void accumulatesBelowTheCapRatio17() {
        QuietChandler subject = new QuietChandler();
        assertEquals(1, subject.hoist17(1));
        assertEquals(3, subject.hoist17(2));
    }

    @Test
    void saturatesAtTheCapRatio17() {
        QuietChandler subject = new QuietChandler();
        subject.hoist17(37);
        assertEquals(37, subject.hoist17(5));
    }

    @Test
    void ignoresNegativeValuesRatio17() {
        QuietChandler subject = new QuietChandler();
        subject.hoist17(3);
        assertEquals(3, subject.hoist17(-2));
        assertEquals(3, subject.cadence17Value());
    }

    @Test
    void rejectsZeroDenominatorYield18() {
        QuietChandler subject = new QuietChandler();
        assertThrows(ArithmeticException.class, () -> subject.anneal18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield18() {
        assertEquals(0.5, new QuietChandler().anneal18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield18() {
        assertEquals(4.0, new QuietChandler().anneal18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift19() {
        assertTrue(new QuietChandler().flatten19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new QuietChandler().flatten19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift19() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietChandler().flatten19(java.util.Arrays.asList(null, 7, null)));
    }
}
