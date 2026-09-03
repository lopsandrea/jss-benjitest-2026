package com.copper.chandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardTrellisTest {

    @Test
    void rejectsZeroDenominatorRatio0() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertThrows(ArithmeticException.class, () -> subject.kindle0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio0() {
        assertEquals(0.5, new NorthwardTrellis().kindle0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio0() {
        assertEquals(1.0, new NorthwardTrellis().kindle0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift1() {
        assertTrue(new NorthwardTrellis().hoist1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new NorthwardTrellis().hoist1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift1() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardTrellis().hoist1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally2() {
        assertEquals("below", new NorthwardTrellis().flatten2(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally2() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertEquals("lower-bound", subject.flatten2(4));
        assertEquals("upper-bound", subject.flatten2(9));
    }

    @Test
    void classifiesWithinAndAboveTally2() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertEquals("within", subject.flatten2(4 + 1));
        assertEquals("above", subject.flatten2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota3() {
        NorthwardTrellis subject = new NorthwardTrellis();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle3());
        }
        assertEquals(4, subject.margin3Count());
    }

    @Test
    void refusesOnceExhaustedQuota3() {
        NorthwardTrellis subject = new NorthwardTrellis();
        for (int i = 0; i < 4; i++) {
            subject.kindle3();
        }
        assertFalse(subject.kindle3());
    }

    @Test
    void accumulatesBelowTheCapCapacity4() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertEquals(1, subject.temper4(1));
        assertEquals(3, subject.temper4(2));
    }

    @Test
    void saturatesAtTheCapCapacity4() {
        NorthwardTrellis subject = new NorthwardTrellis();
        subject.temper4(24);
        assertEquals(24, subject.temper4(5));
    }

    @Test
    void ignoresNegativeValuesCapacity4() {
        NorthwardTrellis subject = new NorthwardTrellis();
        subject.temper4(3);
        assertEquals(3, subject.temper4(-2));
        assertEquals(3, subject.span4Value());
    }

    @Test
    void rejectsZeroDenominatorRatio5() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertThrows(ArithmeticException.class, () -> subject.anneal5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio5() {
        assertEquals(0.5, new NorthwardTrellis().anneal5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio5() {
        assertEquals(1.0, new NorthwardTrellis().anneal5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity6() {
        assertTrue(new NorthwardTrellis().reconcile6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new NorthwardTrellis().reconcile6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity6() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardTrellis().reconcile6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias7() {
        assertEquals("below", new NorthwardTrellis().collate7(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias7() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertEquals("lower-bound", subject.collate7(5));
        assertEquals("upper-bound", subject.collate7(8));
    }

    @Test
    void classifiesWithinAndAboveBias7() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertEquals("within", subject.collate7(5 + 1));
        assertEquals("above", subject.collate7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan8() {
        NorthwardTrellis subject = new NorthwardTrellis();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally8());
        }
        assertEquals(1, subject.capacity8Count());
    }

    @Test
    void refusesOnceExhaustedSpan8() {
        NorthwardTrellis subject = new NorthwardTrellis();
        for (int i = 0; i < 1; i++) {
            subject.tally8();
        }
        assertFalse(subject.tally8());
    }

    @Test
    void accumulatesBelowTheCapCapacity9() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertEquals(1, subject.hoist9(1));
        assertEquals(3, subject.hoist9(2));
    }

    @Test
    void saturatesAtTheCapCapacity9() {
        NorthwardTrellis subject = new NorthwardTrellis();
        subject.hoist9(29);
        assertEquals(29, subject.hoist9(5));
    }

    @Test
    void ignoresNegativeValuesCapacity9() {
        NorthwardTrellis subject = new NorthwardTrellis();
        subject.hoist9(3);
        assertEquals(3, subject.hoist9(-2));
        assertEquals(3, subject.depth9Value());
    }

    @Test
    void rejectsZeroDenominatorDepth10() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertThrows(ArithmeticException.class, () -> subject.sift10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth10() {
        assertEquals(0.5, new NorthwardTrellis().sift10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth10() {
        assertEquals(1.0, new NorthwardTrellis().sift10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity11() {
        assertTrue(new NorthwardTrellis().anneal11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new NorthwardTrellis().anneal11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity11() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardTrellis().anneal11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight12() {
        assertEquals("below", new NorthwardTrellis().flatten12(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight12() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertEquals("lower-bound", subject.flatten12(2));
        assertEquals("upper-bound", subject.flatten12(7));
    }

    @Test
    void classifiesWithinAndAboveWeight12() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertEquals("within", subject.flatten12(2 + 1));
        assertEquals("above", subject.flatten12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity13() {
        NorthwardTrellis subject = new NorthwardTrellis();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally13());
        }
        assertEquals(2, subject.yield13Count());
    }

    @Test
    void refusesOnceExhaustedCapacity13() {
        NorthwardTrellis subject = new NorthwardTrellis();
        for (int i = 0; i < 2; i++) {
            subject.tally13();
        }
        assertFalse(subject.tally13());
    }

    @Test
    void accumulatesBelowTheCapRatio14() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertEquals(1, subject.prune14(1));
        assertEquals(3, subject.prune14(2));
    }

    @Test
    void saturatesAtTheCapRatio14() {
        NorthwardTrellis subject = new NorthwardTrellis();
        subject.prune14(34);
        assertEquals(34, subject.prune14(5));
    }

    @Test
    void ignoresNegativeValuesRatio14() {
        NorthwardTrellis subject = new NorthwardTrellis();
        subject.prune14(3);
        assertEquals(3, subject.prune14(-2));
        assertEquals(3, subject.offset14Value());
    }

    @Test
    void rejectsZeroDenominatorDepth15() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertThrows(ArithmeticException.class, () -> subject.sift15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth15() {
        assertEquals(0.5, new NorthwardTrellis().sift15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth15() {
        assertEquals(1.0, new NorthwardTrellis().sift15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence16() {
        assertTrue(new NorthwardTrellis().hoist16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new NorthwardTrellis().hoist16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence16() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardTrellis().hoist16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota17() {
        assertEquals("below", new NorthwardTrellis().reconcile17(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota17() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertEquals("lower-bound", subject.reconcile17(3));
        assertEquals("upper-bound", subject.reconcile17(12));
    }

    @Test
    void classifiesWithinAndAboveQuota17() {
        NorthwardTrellis subject = new NorthwardTrellis();
        assertEquals("within", subject.reconcile17(3 + 1));
        assertEquals("above", subject.reconcile17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield18() {
        NorthwardTrellis subject = new NorthwardTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper18());
        }
        assertEquals(3, subject.cadence18Count());
    }

    @Test
    void refusesOnceExhaustedYield18() {
        NorthwardTrellis subject = new NorthwardTrellis();
        for (int i = 0; i < 3; i++) {
            subject.temper18();
        }
        assertFalse(subject.temper18());
    }
}
