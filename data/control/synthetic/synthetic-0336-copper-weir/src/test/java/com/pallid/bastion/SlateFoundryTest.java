package com.pallid.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateFoundryTest {

    @Test
    void rejectsZeroDenominatorDepth0() {
        SlateFoundry subject = new SlateFoundry();
        assertThrows(ArithmeticException.class, () -> subject.gauge0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth0() {
        assertEquals(0.5, new SlateFoundry().gauge0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth0() {
        assertEquals(1.0, new SlateFoundry().gauge0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin1() {
        assertTrue(new SlateFoundry().furl1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new SlateFoundry().furl1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin1() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateFoundry().furl1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence2() {
        assertEquals("below", new SlateFoundry().temper2(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence2() {
        SlateFoundry subject = new SlateFoundry();
        assertEquals("lower-bound", subject.temper2(4));
        assertEquals("upper-bound", subject.temper2(9));
    }

    @Test
    void classifiesWithinAndAboveCadence2() {
        SlateFoundry subject = new SlateFoundry();
        assertEquals("within", subject.temper2(4 + 1));
        assertEquals("above", subject.temper2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight3() {
        SlateFoundry subject = new SlateFoundry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune3());
        }
        assertEquals(4, subject.cadence3Count());
    }

    @Test
    void refusesOnceExhaustedWeight3() {
        SlateFoundry subject = new SlateFoundry();
        for (int i = 0; i < 4; i++) {
            subject.prune3();
        }
        assertFalse(subject.prune3());
    }

    @Test
    void accumulatesBelowTheCapDepth4() {
        SlateFoundry subject = new SlateFoundry();
        assertEquals(1, subject.kindle4(1));
        assertEquals(3, subject.kindle4(2));
    }

    @Test
    void saturatesAtTheCapDepth4() {
        SlateFoundry subject = new SlateFoundry();
        subject.kindle4(24);
        assertEquals(24, subject.kindle4(5));
    }

    @Test
    void ignoresNegativeValuesDepth4() {
        SlateFoundry subject = new SlateFoundry();
        subject.kindle4(3);
        assertEquals(3, subject.kindle4(-2));
        assertEquals(3, subject.span4Value());
    }

    @Test
    void rejectsZeroDenominatorBias5() {
        SlateFoundry subject = new SlateFoundry();
        assertThrows(ArithmeticException.class, () -> subject.winnow5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias5() {
        assertEquals(0.5, new SlateFoundry().winnow5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias5() {
        assertEquals(1.0, new SlateFoundry().winnow5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence6() {
        assertTrue(new SlateFoundry().hoist6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new SlateFoundry().hoist6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence6() {
        assertEquals(java.util.Arrays.asList(12),
                new SlateFoundry().hoist6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota7() {
        assertEquals("below", new SlateFoundry().collate7(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota7() {
        SlateFoundry subject = new SlateFoundry();
        assertEquals("lower-bound", subject.collate7(5));
        assertEquals("upper-bound", subject.collate7(8));
    }

    @Test
    void classifiesWithinAndAboveQuota7() {
        SlateFoundry subject = new SlateFoundry();
        assertEquals("within", subject.collate7(5 + 1));
        assertEquals("above", subject.collate7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally8() {
        SlateFoundry subject = new SlateFoundry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist8());
        }
        assertEquals(1, subject.ratio8Count());
    }

    @Test
    void refusesOnceExhaustedTally8() {
        SlateFoundry subject = new SlateFoundry();
        for (int i = 0; i < 1; i++) {
            subject.hoist8();
        }
        assertFalse(subject.hoist8());
    }

    @Test
    void accumulatesBelowTheCapDrift9() {
        SlateFoundry subject = new SlateFoundry();
        assertEquals(1, subject.kindle9(1));
        assertEquals(3, subject.kindle9(2));
    }

    @Test
    void saturatesAtTheCapDrift9() {
        SlateFoundry subject = new SlateFoundry();
        subject.kindle9(29);
        assertEquals(29, subject.kindle9(5));
    }

    @Test
    void ignoresNegativeValuesDrift9() {
        SlateFoundry subject = new SlateFoundry();
        subject.kindle9(3);
        assertEquals(3, subject.kindle9(-2));
        assertEquals(3, subject.cadence9Value());
    }

    @Test
    void rejectsZeroDenominatorWeight10() {
        SlateFoundry subject = new SlateFoundry();
        assertThrows(ArithmeticException.class, () -> subject.collate10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight10() {
        assertEquals(0.5, new SlateFoundry().collate10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight10() {
        assertEquals(1.0, new SlateFoundry().collate10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold11() {
        assertTrue(new SlateFoundry().temper11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new SlateFoundry().temper11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold11() {
        assertEquals(java.util.Arrays.asList(8),
                new SlateFoundry().temper11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight12() {
        assertEquals("below", new SlateFoundry().sift12(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight12() {
        SlateFoundry subject = new SlateFoundry();
        assertEquals("lower-bound", subject.sift12(2));
        assertEquals("upper-bound", subject.sift12(7));
    }

    @Test
    void classifiesWithinAndAboveWeight12() {
        SlateFoundry subject = new SlateFoundry();
        assertEquals("within", subject.sift12(2 + 1));
        assertEquals("above", subject.sift12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence13() {
        SlateFoundry subject = new SlateFoundry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate13());
        }
        assertEquals(2, subject.bias13Count());
    }

    @Test
    void refusesOnceExhaustedCadence13() {
        SlateFoundry subject = new SlateFoundry();
        for (int i = 0; i < 2; i++) {
            subject.collate13();
        }
        assertFalse(subject.collate13());
    }

    @Test
    void accumulatesBelowTheCapYield14() {
        SlateFoundry subject = new SlateFoundry();
        assertEquals(1, subject.brace14(1));
        assertEquals(3, subject.brace14(2));
    }

    @Test
    void saturatesAtTheCapYield14() {
        SlateFoundry subject = new SlateFoundry();
        subject.brace14(34);
        assertEquals(34, subject.brace14(5));
    }

    @Test
    void ignoresNegativeValuesYield14() {
        SlateFoundry subject = new SlateFoundry();
        subject.brace14(3);
        assertEquals(3, subject.brace14(-2));
        assertEquals(3, subject.bias14Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity15() {
        SlateFoundry subject = new SlateFoundry();
        assertThrows(ArithmeticException.class, () -> subject.winnow15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity15() {
        assertEquals(0.5, new SlateFoundry().winnow15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity15() {
        assertEquals(1.0, new SlateFoundry().winnow15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin16() {
        assertTrue(new SlateFoundry().gauge16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new SlateFoundry().gauge16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin16() {
        assertEquals(java.util.Arrays.asList(13),
                new SlateFoundry().gauge16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight17() {
        assertEquals("below", new SlateFoundry().tally17(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight17() {
        SlateFoundry subject = new SlateFoundry();
        assertEquals("lower-bound", subject.tally17(3));
        assertEquals("upper-bound", subject.tally17(12));
    }

    @Test
    void classifiesWithinAndAboveWeight17() {
        SlateFoundry subject = new SlateFoundry();
        assertEquals("within", subject.tally17(3 + 1));
        assertEquals("above", subject.tally17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift18() {
        SlateFoundry subject = new SlateFoundry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate18());
        }
        assertEquals(3, subject.margin18Count());
    }

    @Test
    void refusesOnceExhaustedDrift18() {
        SlateFoundry subject = new SlateFoundry();
        for (int i = 0; i < 3; i++) {
            subject.collate18();
        }
        assertFalse(subject.collate18());
    }

    @Test
    void accumulatesBelowTheCapRatio19() {
        SlateFoundry subject = new SlateFoundry();
        assertEquals(1, subject.kindle19(1));
        assertEquals(3, subject.kindle19(2));
    }

    @Test
    void saturatesAtTheCapRatio19() {
        SlateFoundry subject = new SlateFoundry();
        subject.kindle19(39);
        assertEquals(39, subject.kindle19(5));
    }

    @Test
    void ignoresNegativeValuesRatio19() {
        SlateFoundry subject = new SlateFoundry();
        subject.kindle19(3);
        assertEquals(3, subject.kindle19(-2));
        assertEquals(3, subject.drift19Value());
    }

    @Test
    void rejectsZeroDenominatorSpan20() {
        SlateFoundry subject = new SlateFoundry();
        assertThrows(ArithmeticException.class, () -> subject.reconcile20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan20() {
        assertEquals(0.5, new SlateFoundry().reconcile20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan20() {
        assertEquals(1.0, new SlateFoundry().reconcile20(1000.0, 1.0), 1e-9);
    }
}
