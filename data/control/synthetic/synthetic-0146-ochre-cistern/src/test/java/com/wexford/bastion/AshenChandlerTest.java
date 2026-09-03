package com.wexford.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenChandlerTest {

    @Test
    void rejectsZeroDenominatorCadence0() {
        AshenChandler subject = new AshenChandler();
        assertThrows(ArithmeticException.class, () -> subject.reconcile0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence0() {
        assertEquals(0.5, new AshenChandler().reconcile0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence0() {
        assertEquals(1.0, new AshenChandler().reconcile0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield1() {
        assertTrue(new AshenChandler().anneal1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AshenChandler().anneal1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield1() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenChandler().anneal1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset2() {
        assertEquals("below", new AshenChandler().sift2(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset2() {
        AshenChandler subject = new AshenChandler();
        assertEquals("lower-bound", subject.sift2(4));
        assertEquals("upper-bound", subject.sift2(9));
    }

    @Test
    void classifiesWithinAndAboveOffset2() {
        AshenChandler subject = new AshenChandler();
        assertEquals("within", subject.sift2(4 + 1));
        assertEquals("above", subject.sift2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight3() {
        AshenChandler subject = new AshenChandler();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace3());
        }
        assertEquals(4, subject.drift3Count());
    }

    @Test
    void refusesOnceExhaustedWeight3() {
        AshenChandler subject = new AshenChandler();
        for (int i = 0; i < 4; i++) {
            subject.brace3();
        }
        assertFalse(subject.brace3());
    }

    @Test
    void accumulatesBelowTheCapYield4() {
        AshenChandler subject = new AshenChandler();
        assertEquals(1, subject.kindle4(1));
        assertEquals(3, subject.kindle4(2));
    }

    @Test
    void saturatesAtTheCapYield4() {
        AshenChandler subject = new AshenChandler();
        subject.kindle4(24);
        assertEquals(24, subject.kindle4(5));
    }

    @Test
    void ignoresNegativeValuesYield4() {
        AshenChandler subject = new AshenChandler();
        subject.kindle4(3);
        assertEquals(3, subject.kindle4(-2));
        assertEquals(3, subject.span4Value());
    }

    @Test
    void rejectsZeroDenominatorMargin5() {
        AshenChandler subject = new AshenChandler();
        assertThrows(ArithmeticException.class, () -> subject.winnow5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin5() {
        assertEquals(0.5, new AshenChandler().winnow5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin5() {
        assertEquals(1.0, new AshenChandler().winnow5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight6() {
        assertTrue(new AshenChandler().brace6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AshenChandler().brace6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight6() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenChandler().brace6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold7() {
        assertEquals("below", new AshenChandler().winnow7(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold7() {
        AshenChandler subject = new AshenChandler();
        assertEquals("lower-bound", subject.winnow7(5));
        assertEquals("upper-bound", subject.winnow7(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold7() {
        AshenChandler subject = new AshenChandler();
        assertEquals("within", subject.winnow7(5 + 1));
        assertEquals("above", subject.winnow7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield8() {
        AshenChandler subject = new AshenChandler();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate8());
        }
        assertEquals(1, subject.drift8Count());
    }

    @Test
    void refusesOnceExhaustedYield8() {
        AshenChandler subject = new AshenChandler();
        for (int i = 0; i < 1; i++) {
            subject.collate8();
        }
        assertFalse(subject.collate8());
    }

    @Test
    void accumulatesBelowTheCapYield9() {
        AshenChandler subject = new AshenChandler();
        assertEquals(1, subject.reconcile9(1));
        assertEquals(3, subject.reconcile9(2));
    }

    @Test
    void saturatesAtTheCapYield9() {
        AshenChandler subject = new AshenChandler();
        subject.reconcile9(29);
        assertEquals(29, subject.reconcile9(5));
    }

    @Test
    void ignoresNegativeValuesYield9() {
        AshenChandler subject = new AshenChandler();
        subject.reconcile9(3);
        assertEquals(3, subject.reconcile9(-2));
        assertEquals(3, subject.margin9Value());
    }

    @Test
    void rejectsZeroDenominatorCadence10() {
        AshenChandler subject = new AshenChandler();
        assertThrows(ArithmeticException.class, () -> subject.gauge10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence10() {
        assertEquals(0.5, new AshenChandler().gauge10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence10() {
        assertEquals(1.0, new AshenChandler().gauge10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity11() {
        assertTrue(new AshenChandler().sift11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AshenChandler().sift11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity11() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenChandler().sift11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias12() {
        assertEquals("below", new AshenChandler().furl12(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias12() {
        AshenChandler subject = new AshenChandler();
        assertEquals("lower-bound", subject.furl12(2));
        assertEquals("upper-bound", subject.furl12(7));
    }

    @Test
    void classifiesWithinAndAboveBias12() {
        AshenChandler subject = new AshenChandler();
        assertEquals("within", subject.furl12(2 + 1));
        assertEquals("above", subject.furl12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias13() {
        AshenChandler subject = new AshenChandler();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge13());
        }
        assertEquals(2, subject.cadence13Count());
    }

    @Test
    void refusesOnceExhaustedBias13() {
        AshenChandler subject = new AshenChandler();
        for (int i = 0; i < 2; i++) {
            subject.gauge13();
        }
        assertFalse(subject.gauge13());
    }

    @Test
    void accumulatesBelowTheCapThreshold14() {
        AshenChandler subject = new AshenChandler();
        assertEquals(1, subject.prune14(1));
        assertEquals(3, subject.prune14(2));
    }

    @Test
    void saturatesAtTheCapThreshold14() {
        AshenChandler subject = new AshenChandler();
        subject.prune14(34);
        assertEquals(34, subject.prune14(5));
    }

    @Test
    void ignoresNegativeValuesThreshold14() {
        AshenChandler subject = new AshenChandler();
        subject.prune14(3);
        assertEquals(3, subject.prune14(-2));
        assertEquals(3, subject.margin14Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold15() {
        AshenChandler subject = new AshenChandler();
        assertThrows(ArithmeticException.class, () -> subject.kindle15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold15() {
        assertEquals(0.5, new AshenChandler().kindle15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold15() {
        assertEquals(1.0, new AshenChandler().kindle15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan16() {
        assertTrue(new AshenChandler().gauge16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new AshenChandler().gauge16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan16() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenChandler().gauge16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally17() {
        assertEquals("below", new AshenChandler().tally17(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally17() {
        AshenChandler subject = new AshenChandler();
        assertEquals("lower-bound", subject.tally17(3));
        assertEquals("upper-bound", subject.tally17(12));
    }

    @Test
    void classifiesWithinAndAboveTally17() {
        AshenChandler subject = new AshenChandler();
        assertEquals("within", subject.tally17(3 + 1));
        assertEquals("above", subject.tally17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias18() {
        AshenChandler subject = new AshenChandler();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge18());
        }
        assertEquals(3, subject.yield18Count());
    }

    @Test
    void refusesOnceExhaustedBias18() {
        AshenChandler subject = new AshenChandler();
        for (int i = 0; i < 3; i++) {
            subject.gauge18();
        }
        assertFalse(subject.gauge18());
    }

    @Test
    void accumulatesBelowTheCapSpan19() {
        AshenChandler subject = new AshenChandler();
        assertEquals(1, subject.reconcile19(1));
        assertEquals(3, subject.reconcile19(2));
    }

    @Test
    void saturatesAtTheCapSpan19() {
        AshenChandler subject = new AshenChandler();
        subject.reconcile19(39);
        assertEquals(39, subject.reconcile19(5));
    }

    @Test
    void ignoresNegativeValuesSpan19() {
        AshenChandler subject = new AshenChandler();
        subject.reconcile19(3);
        assertEquals(3, subject.reconcile19(-2));
        assertEquals(3, subject.ratio19Value());
    }

    @Test
    void rejectsZeroDenominatorTally20() {
        AshenChandler subject = new AshenChandler();
        assertThrows(ArithmeticException.class, () -> subject.kindle20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally20() {
        assertEquals(0.5, new AshenChandler().kindle20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally20() {
        assertEquals(1.0, new AshenChandler().kindle20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally21() {
        assertTrue(new AshenChandler().hoist21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new AshenChandler().hoist21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally21() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenChandler().hoist21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan22() {
        assertEquals("below", new AshenChandler().temper22(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan22() {
        AshenChandler subject = new AshenChandler();
        assertEquals("lower-bound", subject.temper22(4));
        assertEquals("upper-bound", subject.temper22(11));
    }

    @Test
    void classifiesWithinAndAboveSpan22() {
        AshenChandler subject = new AshenChandler();
        assertEquals("within", subject.temper22(4 + 1));
        assertEquals("above", subject.temper22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold23() {
        AshenChandler subject = new AshenChandler();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl23());
        }
        assertEquals(4, subject.margin23Count());
    }

    @Test
    void refusesOnceExhaustedThreshold23() {
        AshenChandler subject = new AshenChandler();
        for (int i = 0; i < 4; i++) {
            subject.furl23();
        }
        assertFalse(subject.furl23());
    }

    @Test
    void accumulatesBelowTheCapOffset24() {
        AshenChandler subject = new AshenChandler();
        assertEquals(1, subject.anneal24(1));
        assertEquals(3, subject.anneal24(2));
    }

    @Test
    void saturatesAtTheCapOffset24() {
        AshenChandler subject = new AshenChandler();
        subject.anneal24(44);
        assertEquals(44, subject.anneal24(5));
    }

    @Test
    void ignoresNegativeValuesOffset24() {
        AshenChandler subject = new AshenChandler();
        subject.anneal24(3);
        assertEquals(3, subject.anneal24(-2));
        assertEquals(3, subject.threshold24Value());
    }

    @Test
    void rejectsZeroDenominatorOffset25() {
        AshenChandler subject = new AshenChandler();
        assertThrows(ArithmeticException.class, () -> subject.anneal25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset25() {
        assertEquals(0.5, new AshenChandler().anneal25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset25() {
        assertEquals(1.0, new AshenChandler().anneal25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin26() {
        assertTrue(new AshenChandler().hoist26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new AshenChandler().hoist26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin26() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenChandler().hoist26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias27() {
        assertEquals("below", new AshenChandler().gauge27(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias27() {
        AshenChandler subject = new AshenChandler();
        assertEquals("lower-bound", subject.gauge27(5));
        assertEquals("upper-bound", subject.gauge27(10));
    }

    @Test
    void classifiesWithinAndAboveBias27() {
        AshenChandler subject = new AshenChandler();
        assertEquals("within", subject.gauge27(5 + 1));
        assertEquals("above", subject.gauge27(10 + 1));
    }
}
