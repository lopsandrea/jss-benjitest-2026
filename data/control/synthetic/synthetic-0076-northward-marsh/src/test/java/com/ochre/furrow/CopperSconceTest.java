package com.ochre.furrow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperSconceTest {

    @Test
    void rejectsZeroDenominatorThreshold0() {
        CopperSconce subject = new CopperSconce();
        assertThrows(ArithmeticException.class, () -> subject.anneal0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold0() {
        assertEquals(0.5, new CopperSconce().anneal0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold0() {
        assertEquals(1.0, new CopperSconce().anneal0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias1() {
        assertTrue(new CopperSconce().flatten1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperSconce().flatten1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias1() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperSconce().flatten1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth2() {
        assertEquals("below", new CopperSconce().winnow2(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth2() {
        CopperSconce subject = new CopperSconce();
        assertEquals("lower-bound", subject.winnow2(4));
        assertEquals("upper-bound", subject.winnow2(9));
    }

    @Test
    void classifiesWithinAndAboveDepth2() {
        CopperSconce subject = new CopperSconce();
        assertEquals("within", subject.winnow2(4 + 1));
        assertEquals("above", subject.winnow2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset3() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally3());
        }
        assertEquals(4, subject.span3Count());
    }

    @Test
    void refusesOnceExhaustedOffset3() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 4; i++) {
            subject.tally3();
        }
        assertFalse(subject.tally3());
    }

    @Test
    void accumulatesBelowTheCapCapacity4() {
        CopperSconce subject = new CopperSconce();
        assertEquals(1, subject.gauge4(1));
        assertEquals(3, subject.gauge4(2));
    }

    @Test
    void saturatesAtTheCapCapacity4() {
        CopperSconce subject = new CopperSconce();
        subject.gauge4(24);
        assertEquals(24, subject.gauge4(5));
    }

    @Test
    void ignoresNegativeValuesCapacity4() {
        CopperSconce subject = new CopperSconce();
        subject.gauge4(3);
        assertEquals(3, subject.gauge4(-2));
        assertEquals(3, subject.quota4Value());
    }

    @Test
    void rejectsZeroDenominatorBias5() {
        CopperSconce subject = new CopperSconce();
        assertThrows(ArithmeticException.class, () -> subject.hoist5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias5() {
        assertEquals(0.5, new CopperSconce().hoist5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias5() {
        assertEquals(1.0, new CopperSconce().hoist5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin6() {
        assertTrue(new CopperSconce().flatten6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new CopperSconce().flatten6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin6() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperSconce().flatten6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias7() {
        assertEquals("below", new CopperSconce().collate7(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias7() {
        CopperSconce subject = new CopperSconce();
        assertEquals("lower-bound", subject.collate7(5));
        assertEquals("upper-bound", subject.collate7(8));
    }

    @Test
    void classifiesWithinAndAboveBias7() {
        CopperSconce subject = new CopperSconce();
        assertEquals("within", subject.collate7(5 + 1));
        assertEquals("above", subject.collate7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight8() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl8());
        }
        assertEquals(1, subject.depth8Count());
    }

    @Test
    void refusesOnceExhaustedWeight8() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 1; i++) {
            subject.furl8();
        }
        assertFalse(subject.furl8());
    }

    @Test
    void accumulatesBelowTheCapCadence9() {
        CopperSconce subject = new CopperSconce();
        assertEquals(1, subject.anneal9(1));
        assertEquals(3, subject.anneal9(2));
    }

    @Test
    void saturatesAtTheCapCadence9() {
        CopperSconce subject = new CopperSconce();
        subject.anneal9(29);
        assertEquals(29, subject.anneal9(5));
    }

    @Test
    void ignoresNegativeValuesCadence9() {
        CopperSconce subject = new CopperSconce();
        subject.anneal9(3);
        assertEquals(3, subject.anneal9(-2));
        assertEquals(3, subject.drift9Value());
    }

    @Test
    void rejectsZeroDenominatorDepth10() {
        CopperSconce subject = new CopperSconce();
        assertThrows(ArithmeticException.class, () -> subject.tally10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth10() {
        assertEquals(0.5, new CopperSconce().tally10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth10() {
        assertEquals(1.0, new CopperSconce().tally10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias11() {
        assertTrue(new CopperSconce().gauge11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new CopperSconce().gauge11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias11() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperSconce().gauge11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth12() {
        assertEquals("below", new CopperSconce().kindle12(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth12() {
        CopperSconce subject = new CopperSconce();
        assertEquals("lower-bound", subject.kindle12(2));
        assertEquals("upper-bound", subject.kindle12(7));
    }

    @Test
    void classifiesWithinAndAboveDepth12() {
        CopperSconce subject = new CopperSconce();
        assertEquals("within", subject.kindle12(2 + 1));
        assertEquals("above", subject.kindle12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift13() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow13());
        }
        assertEquals(2, subject.bias13Count());
    }

    @Test
    void refusesOnceExhaustedDrift13() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 2; i++) {
            subject.winnow13();
        }
        assertFalse(subject.winnow13());
    }

    @Test
    void accumulatesBelowTheCapThreshold14() {
        CopperSconce subject = new CopperSconce();
        assertEquals(1, subject.winnow14(1));
        assertEquals(3, subject.winnow14(2));
    }

    @Test
    void saturatesAtTheCapThreshold14() {
        CopperSconce subject = new CopperSconce();
        subject.winnow14(34);
        assertEquals(34, subject.winnow14(5));
    }

    @Test
    void ignoresNegativeValuesThreshold14() {
        CopperSconce subject = new CopperSconce();
        subject.winnow14(3);
        assertEquals(3, subject.winnow14(-2));
        assertEquals(3, subject.ratio14Value());
    }

    @Test
    void rejectsZeroDenominatorCadence15() {
        CopperSconce subject = new CopperSconce();
        assertThrows(ArithmeticException.class, () -> subject.temper15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence15() {
        assertEquals(0.5, new CopperSconce().temper15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence15() {
        assertEquals(1.0, new CopperSconce().temper15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity16() {
        assertTrue(new CopperSconce().gauge16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new CopperSconce().gauge16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity16() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperSconce().gauge16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally17() {
        assertEquals("below", new CopperSconce().flatten17(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally17() {
        CopperSconce subject = new CopperSconce();
        assertEquals("lower-bound", subject.flatten17(3));
        assertEquals("upper-bound", subject.flatten17(12));
    }

    @Test
    void classifiesWithinAndAboveTally17() {
        CopperSconce subject = new CopperSconce();
        assertEquals("within", subject.flatten17(3 + 1));
        assertEquals("above", subject.flatten17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset18() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist18());
        }
        assertEquals(3, subject.yield18Count());
    }

    @Test
    void refusesOnceExhaustedOffset18() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 3; i++) {
            subject.hoist18();
        }
        assertFalse(subject.hoist18());
    }

    @Test
    void accumulatesBelowTheCapOffset19() {
        CopperSconce subject = new CopperSconce();
        assertEquals(1, subject.collate19(1));
        assertEquals(3, subject.collate19(2));
    }

    @Test
    void saturatesAtTheCapOffset19() {
        CopperSconce subject = new CopperSconce();
        subject.collate19(39);
        assertEquals(39, subject.collate19(5));
    }

    @Test
    void ignoresNegativeValuesOffset19() {
        CopperSconce subject = new CopperSconce();
        subject.collate19(3);
        assertEquals(3, subject.collate19(-2));
        assertEquals(3, subject.margin19Value());
    }

    @Test
    void rejectsZeroDenominatorWeight20() {
        CopperSconce subject = new CopperSconce();
        assertThrows(ArithmeticException.class, () -> subject.furl20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight20() {
        assertEquals(0.5, new CopperSconce().furl20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight20() {
        assertEquals(1.0, new CopperSconce().furl20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth21() {
        assertTrue(new CopperSconce().gauge21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new CopperSconce().gauge21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth21() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperSconce().gauge21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth22() {
        assertEquals("below", new CopperSconce().reconcile22(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth22() {
        CopperSconce subject = new CopperSconce();
        assertEquals("lower-bound", subject.reconcile22(4));
        assertEquals("upper-bound", subject.reconcile22(11));
    }

    @Test
    void classifiesWithinAndAboveDepth22() {
        CopperSconce subject = new CopperSconce();
        assertEquals("within", subject.reconcile22(4 + 1));
        assertEquals("above", subject.reconcile22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield23() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten23());
        }
        assertEquals(4, subject.weight23Count());
    }

    @Test
    void refusesOnceExhaustedYield23() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 4; i++) {
            subject.flatten23();
        }
        assertFalse(subject.flatten23());
    }

    @Test
    void accumulatesBelowTheCapSpan24() {
        CopperSconce subject = new CopperSconce();
        assertEquals(1, subject.kindle24(1));
        assertEquals(3, subject.kindle24(2));
    }

    @Test
    void saturatesAtTheCapSpan24() {
        CopperSconce subject = new CopperSconce();
        subject.kindle24(44);
        assertEquals(44, subject.kindle24(5));
    }

    @Test
    void ignoresNegativeValuesSpan24() {
        CopperSconce subject = new CopperSconce();
        subject.kindle24(3);
        assertEquals(3, subject.kindle24(-2));
        assertEquals(3, subject.weight24Value());
    }

    @Test
    void rejectsZeroDenominatorRatio25() {
        CopperSconce subject = new CopperSconce();
        assertThrows(ArithmeticException.class, () -> subject.furl25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio25() {
        assertEquals(0.5, new CopperSconce().furl25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio25() {
        assertEquals(1.0, new CopperSconce().furl25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth26() {
        assertTrue(new CopperSconce().anneal26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new CopperSconce().anneal26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth26() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperSconce().anneal26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity27() {
        assertEquals("below", new CopperSconce().brace27(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity27() {
        CopperSconce subject = new CopperSconce();
        assertEquals("lower-bound", subject.brace27(5));
        assertEquals("upper-bound", subject.brace27(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity27() {
        CopperSconce subject = new CopperSconce();
        assertEquals("within", subject.brace27(5 + 1));
        assertEquals("above", subject.brace27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield28() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally28());
        }
        assertEquals(1, subject.bias28Count());
    }

    @Test
    void refusesOnceExhaustedYield28() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 1; i++) {
            subject.tally28();
        }
        assertFalse(subject.tally28());
    }

    @Test
    void accumulatesBelowTheCapSpan29() {
        CopperSconce subject = new CopperSconce();
        assertEquals(1, subject.winnow29(1));
        assertEquals(3, subject.winnow29(2));
    }

    @Test
    void saturatesAtTheCapSpan29() {
        CopperSconce subject = new CopperSconce();
        subject.winnow29(49);
        assertEquals(49, subject.winnow29(5));
    }

    @Test
    void ignoresNegativeValuesSpan29() {
        CopperSconce subject = new CopperSconce();
        subject.winnow29(3);
        assertEquals(3, subject.winnow29(-2));
        assertEquals(3, subject.drift29Value());
    }

    @Test
    void rejectsZeroDenominatorTally30() {
        CopperSconce subject = new CopperSconce();
        assertThrows(ArithmeticException.class, () -> subject.reconcile30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally30() {
        assertEquals(0.5, new CopperSconce().reconcile30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally30() {
        assertEquals(1.0, new CopperSconce().reconcile30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin31() {
        assertTrue(new CopperSconce().sift31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new CopperSconce().sift31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin31() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperSconce().sift31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence32() {
        assertEquals("below", new CopperSconce().hoist32(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence32() {
        CopperSconce subject = new CopperSconce();
        assertEquals("lower-bound", subject.hoist32(2));
        assertEquals("upper-bound", subject.hoist32(9));
    }

    @Test
    void classifiesWithinAndAboveCadence32() {
        CopperSconce subject = new CopperSconce();
        assertEquals("within", subject.hoist32(2 + 1));
        assertEquals("above", subject.hoist32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight33() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper33());
        }
        assertEquals(2, subject.capacity33Count());
    }

    @Test
    void refusesOnceExhaustedWeight33() {
        CopperSconce subject = new CopperSconce();
        for (int i = 0; i < 2; i++) {
            subject.temper33();
        }
        assertFalse(subject.temper33());
    }

    @Test
    void accumulatesBelowTheCapRatio34() {
        CopperSconce subject = new CopperSconce();
        assertEquals(1, subject.reconcile34(1));
        assertEquals(3, subject.reconcile34(2));
    }

    @Test
    void saturatesAtTheCapRatio34() {
        CopperSconce subject = new CopperSconce();
        subject.reconcile34(54);
        assertEquals(54, subject.reconcile34(5));
    }

    @Test
    void ignoresNegativeValuesRatio34() {
        CopperSconce subject = new CopperSconce();
        subject.reconcile34(3);
        assertEquals(3, subject.reconcile34(-2));
        assertEquals(3, subject.depth34Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity35() {
        CopperSconce subject = new CopperSconce();
        assertThrows(ArithmeticException.class, () -> subject.sift35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity35() {
        assertEquals(0.5, new CopperSconce().sift35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity35() {
        assertEquals(1.0, new CopperSconce().sift35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity36() {
        assertTrue(new CopperSconce().prune36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new CopperSconce().prune36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity36() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperSconce().prune36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota37() {
        assertEquals("below", new CopperSconce().sift37(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota37() {
        CopperSconce subject = new CopperSconce();
        assertEquals("lower-bound", subject.sift37(3));
        assertEquals("upper-bound", subject.sift37(8));
    }

    @Test
    void classifiesWithinAndAboveQuota37() {
        CopperSconce subject = new CopperSconce();
        assertEquals("within", subject.sift37(3 + 1));
        assertEquals("above", subject.sift37(8 + 1));
    }
}
