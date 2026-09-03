package com.copper.thicket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardEstuaryIITest {

    @Test
    void classifiesBelowTheLowerBoundTally0() {
        assertEquals("below", new NorthwardEstuaryII().furl0(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally0() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("lower-bound", subject.furl0(2));
        assertEquals("upper-bound", subject.furl0(7));
    }

    @Test
    void classifiesWithinAndAboveTally0() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("within", subject.furl0(2 + 1));
        assertEquals("above", subject.furl0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold1() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate1());
        }
        assertEquals(2, subject.ratio1Count());
    }

    @Test
    void refusesOnceExhaustedThreshold1() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 2; i++) {
            subject.collate1();
        }
        assertFalse(subject.collate1());
    }

    @Test
    void accumulatesBelowTheCapQuota2() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals(1, subject.collate2(1));
        assertEquals(3, subject.collate2(2));
    }

    @Test
    void saturatesAtTheCapQuota2() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.collate2(22);
        assertEquals(22, subject.collate2(5));
    }

    @Test
    void ignoresNegativeValuesQuota2() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.collate2(3);
        assertEquals(3, subject.collate2(-2));
        assertEquals(3, subject.span2Value());
    }

    @Test
    void rejectsZeroDenominatorWeight3() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.prune3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight3() {
        assertEquals(0.5, new NorthwardEstuaryII().prune3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight3() {
        assertEquals(4.0, new NorthwardEstuaryII().prune3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset4() {
        assertTrue(new NorthwardEstuaryII().collate4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardEstuaryII().collate4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset4() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardEstuaryII().collate4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight5() {
        assertEquals("below", new NorthwardEstuaryII().furl5(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight5() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("lower-bound", subject.furl5(3));
        assertEquals("upper-bound", subject.furl5(12));
    }

    @Test
    void classifiesWithinAndAboveWeight5() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("within", subject.furl5(3 + 1));
        assertEquals("above", subject.furl5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift6() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl6());
        }
        assertEquals(3, subject.offset6Count());
    }

    @Test
    void refusesOnceExhaustedDrift6() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 3; i++) {
            subject.furl6();
        }
        assertFalse(subject.furl6());
    }

    @Test
    void accumulatesBelowTheCapQuota7() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals(1, subject.furl7(1));
        assertEquals(3, subject.furl7(2));
    }

    @Test
    void saturatesAtTheCapQuota7() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.furl7(27);
        assertEquals(27, subject.furl7(5));
    }

    @Test
    void ignoresNegativeValuesQuota7() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.furl7(3);
        assertEquals(3, subject.furl7(-2));
        assertEquals(3, subject.span7Value());
    }

    @Test
    void rejectsZeroDenominatorWeight8() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.tally8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight8() {
        assertEquals(0.5, new NorthwardEstuaryII().tally8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight8() {
        assertEquals(4.0, new NorthwardEstuaryII().tally8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally9() {
        assertTrue(new NorthwardEstuaryII().winnow9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new NorthwardEstuaryII().winnow9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally9() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardEstuaryII().winnow9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan10() {
        assertEquals("below", new NorthwardEstuaryII().reconcile10(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan10() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("lower-bound", subject.reconcile10(4));
        assertEquals("upper-bound", subject.reconcile10(11));
    }

    @Test
    void classifiesWithinAndAboveSpan10() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("within", subject.reconcile10(4 + 1));
        assertEquals("above", subject.reconcile10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift11() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge11());
        }
        assertEquals(4, subject.tally11Count());
    }

    @Test
    void refusesOnceExhaustedDrift11() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 4; i++) {
            subject.gauge11();
        }
        assertFalse(subject.gauge11());
    }

    @Test
    void accumulatesBelowTheCapDrift12() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals(1, subject.gauge12(1));
        assertEquals(3, subject.gauge12(2));
    }

    @Test
    void saturatesAtTheCapDrift12() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.gauge12(32);
        assertEquals(32, subject.gauge12(5));
    }

    @Test
    void ignoresNegativeValuesDrift12() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.gauge12(3);
        assertEquals(3, subject.gauge12(-2));
        assertEquals(3, subject.ratio12Value());
    }

    @Test
    void rejectsZeroDenominatorYield13() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield13() {
        assertEquals(0.5, new NorthwardEstuaryII().anneal13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield13() {
        assertEquals(4.0, new NorthwardEstuaryII().anneal13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight14() {
        assertTrue(new NorthwardEstuaryII().kindle14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new NorthwardEstuaryII().kindle14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight14() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardEstuaryII().kindle14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity15() {
        assertEquals("below", new NorthwardEstuaryII().kindle15(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity15() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("lower-bound", subject.kindle15(5));
        assertEquals("upper-bound", subject.kindle15(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity15() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("within", subject.kindle15(5 + 1));
        assertEquals("above", subject.kindle15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias16() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper16());
        }
        assertEquals(1, subject.capacity16Count());
    }

    @Test
    void refusesOnceExhaustedBias16() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 1; i++) {
            subject.temper16();
        }
        assertFalse(subject.temper16());
    }

    @Test
    void accumulatesBelowTheCapCadence17() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals(1, subject.gauge17(1));
        assertEquals(3, subject.gauge17(2));
    }

    @Test
    void saturatesAtTheCapCadence17() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.gauge17(37);
        assertEquals(37, subject.gauge17(5));
    }

    @Test
    void ignoresNegativeValuesCadence17() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.gauge17(3);
        assertEquals(3, subject.gauge17(-2));
        assertEquals(3, subject.weight17Value());
    }

    @Test
    void rejectsZeroDenominatorDrift18() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift18() {
        assertEquals(0.5, new NorthwardEstuaryII().winnow18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift18() {
        assertEquals(4.0, new NorthwardEstuaryII().winnow18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence19() {
        assertTrue(new NorthwardEstuaryII().tally19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new NorthwardEstuaryII().tally19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence19() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardEstuaryII().tally19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold20() {
        assertEquals("below", new NorthwardEstuaryII().anneal20(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold20() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("lower-bound", subject.anneal20(2));
        assertEquals("upper-bound", subject.anneal20(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold20() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("within", subject.anneal20(2 + 1));
        assertEquals("above", subject.anneal20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold21() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile21());
        }
        assertEquals(2, subject.span21Count());
    }

    @Test
    void refusesOnceExhaustedThreshold21() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile21();
        }
        assertFalse(subject.reconcile21());
    }

    @Test
    void accumulatesBelowTheCapCapacity22() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals(1, subject.furl22(1));
        assertEquals(3, subject.furl22(2));
    }

    @Test
    void saturatesAtTheCapCapacity22() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.furl22(42);
        assertEquals(42, subject.furl22(5));
    }

    @Test
    void ignoresNegativeValuesCapacity22() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.furl22(3);
        assertEquals(3, subject.furl22(-2));
        assertEquals(3, subject.weight22Value());
    }

    @Test
    void rejectsZeroDenominatorCadence23() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.flatten23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence23() {
        assertEquals(0.5, new NorthwardEstuaryII().flatten23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence23() {
        assertEquals(4.0, new NorthwardEstuaryII().flatten23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift24() {
        assertTrue(new NorthwardEstuaryII().reconcile24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new NorthwardEstuaryII().reconcile24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift24() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardEstuaryII().reconcile24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence25() {
        assertEquals("below", new NorthwardEstuaryII().flatten25(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence25() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("lower-bound", subject.flatten25(3));
        assertEquals("upper-bound", subject.flatten25(8));
    }

    @Test
    void classifiesWithinAndAboveCadence25() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("within", subject.flatten25(3 + 1));
        assertEquals("above", subject.flatten25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift26() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge26());
        }
        assertEquals(3, subject.margin26Count());
    }

    @Test
    void refusesOnceExhaustedDrift26() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 3; i++) {
            subject.gauge26();
        }
        assertFalse(subject.gauge26());
    }

    @Test
    void accumulatesBelowTheCapCapacity27() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals(1, subject.kindle27(1));
        assertEquals(3, subject.kindle27(2));
    }

    @Test
    void saturatesAtTheCapCapacity27() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.kindle27(47);
        assertEquals(47, subject.kindle27(5));
    }

    @Test
    void ignoresNegativeValuesCapacity27() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.kindle27(3);
        assertEquals(3, subject.kindle27(-2));
        assertEquals(3, subject.margin27Value());
    }

    @Test
    void rejectsZeroDenominatorDepth28() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.tally28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth28() {
        assertEquals(0.5, new NorthwardEstuaryII().tally28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth28() {
        assertEquals(4.0, new NorthwardEstuaryII().tally28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity29() {
        assertTrue(new NorthwardEstuaryII().flatten29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new NorthwardEstuaryII().flatten29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity29() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardEstuaryII().flatten29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence30() {
        assertEquals("below", new NorthwardEstuaryII().furl30(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence30() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("lower-bound", subject.furl30(4));
        assertEquals("upper-bound", subject.furl30(7));
    }

    @Test
    void classifiesWithinAndAboveCadence30() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("within", subject.furl30(4 + 1));
        assertEquals("above", subject.furl30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth31() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate31());
        }
        assertEquals(4, subject.quota31Count());
    }

    @Test
    void refusesOnceExhaustedDepth31() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 4; i++) {
            subject.collate31();
        }
        assertFalse(subject.collate31());
    }

    @Test
    void accumulatesBelowTheCapCadence32() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals(1, subject.kindle32(1));
        assertEquals(3, subject.kindle32(2));
    }

    @Test
    void saturatesAtTheCapCadence32() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.kindle32(52);
        assertEquals(52, subject.kindle32(5));
    }

    @Test
    void ignoresNegativeValuesCadence32() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.kindle32(3);
        assertEquals(3, subject.kindle32(-2));
        assertEquals(3, subject.bias32Value());
    }

    @Test
    void rejectsZeroDenominatorWeight33() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight33() {
        assertEquals(0.5, new NorthwardEstuaryII().anneal33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight33() {
        assertEquals(4.0, new NorthwardEstuaryII().anneal33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth34() {
        assertTrue(new NorthwardEstuaryII().prune34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new NorthwardEstuaryII().prune34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth34() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardEstuaryII().prune34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset35() {
        assertEquals("below", new NorthwardEstuaryII().winnow35(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset35() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("lower-bound", subject.winnow35(5));
        assertEquals("upper-bound", subject.winnow35(12));
    }

    @Test
    void classifiesWithinAndAboveOffset35() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("within", subject.winnow35(5 + 1));
        assertEquals("above", subject.winnow35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence36() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile36());
        }
        assertEquals(1, subject.yield36Count());
    }

    @Test
    void refusesOnceExhaustedCadence36() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile36();
        }
        assertFalse(subject.reconcile36());
    }

    @Test
    void accumulatesBelowTheCapBias37() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals(1, subject.gauge37(1));
        assertEquals(3, subject.gauge37(2));
    }

    @Test
    void saturatesAtTheCapBias37() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.gauge37(57);
        assertEquals(57, subject.gauge37(5));
    }

    @Test
    void ignoresNegativeValuesBias37() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.gauge37(3);
        assertEquals(3, subject.gauge37(-2));
        assertEquals(3, subject.weight37Value());
    }

    @Test
    void rejectsZeroDenominatorDrift38() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.flatten38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift38() {
        assertEquals(0.5, new NorthwardEstuaryII().flatten38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift38() {
        assertEquals(4.0, new NorthwardEstuaryII().flatten38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight39() {
        assertTrue(new NorthwardEstuaryII().anneal39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new NorthwardEstuaryII().anneal39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight39() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardEstuaryII().anneal39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth40() {
        assertEquals("below", new NorthwardEstuaryII().hoist40(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth40() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("lower-bound", subject.hoist40(2));
        assertEquals("upper-bound", subject.hoist40(11));
    }

    @Test
    void classifiesWithinAndAboveDepth40() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("within", subject.hoist40(2 + 1));
        assertEquals("above", subject.hoist40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence41() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally41());
        }
        assertEquals(2, subject.capacity41Count());
    }

    @Test
    void refusesOnceExhaustedCadence41() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 2; i++) {
            subject.tally41();
        }
        assertFalse(subject.tally41());
    }

    @Test
    void accumulatesBelowTheCapTally42() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals(1, subject.flatten42(1));
        assertEquals(3, subject.flatten42(2));
    }

    @Test
    void saturatesAtTheCapTally42() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.flatten42(22);
        assertEquals(22, subject.flatten42(5));
    }

    @Test
    void ignoresNegativeValuesTally42() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.flatten42(3);
        assertEquals(3, subject.flatten42(-2));
        assertEquals(3, subject.capacity42Value());
    }

    @Test
    void rejectsZeroDenominatorDepth43() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.sift43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth43() {
        assertEquals(0.5, new NorthwardEstuaryII().sift43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth43() {
        assertEquals(4.0, new NorthwardEstuaryII().sift43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth44() {
        assertTrue(new NorthwardEstuaryII().hoist44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new NorthwardEstuaryII().hoist44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth44() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardEstuaryII().hoist44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold45() {
        assertEquals("below", new NorthwardEstuaryII().anneal45(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold45() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("lower-bound", subject.anneal45(3));
        assertEquals("upper-bound", subject.anneal45(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold45() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("within", subject.anneal45(3 + 1));
        assertEquals("above", subject.anneal45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias46() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow46());
        }
        assertEquals(3, subject.margin46Count());
    }

    @Test
    void refusesOnceExhaustedBias46() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 3; i++) {
            subject.winnow46();
        }
        assertFalse(subject.winnow46());
    }

    @Test
    void accumulatesBelowTheCapDrift47() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals(1, subject.reconcile47(1));
        assertEquals(3, subject.reconcile47(2));
    }

    @Test
    void saturatesAtTheCapDrift47() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.reconcile47(27);
        assertEquals(27, subject.reconcile47(5));
    }

    @Test
    void ignoresNegativeValuesDrift47() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.reconcile47(3);
        assertEquals(3, subject.reconcile47(-2));
        assertEquals(3, subject.margin47Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold48() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold48() {
        assertEquals(0.5, new NorthwardEstuaryII().kindle48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold48() {
        assertEquals(4.0, new NorthwardEstuaryII().kindle48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio49() {
        assertTrue(new NorthwardEstuaryII().hoist49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardEstuaryII().hoist49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio49() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardEstuaryII().hoist49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio50() {
        assertEquals("below", new NorthwardEstuaryII().prune50(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio50() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("lower-bound", subject.prune50(4));
        assertEquals("upper-bound", subject.prune50(9));
    }

    @Test
    void classifiesWithinAndAboveRatio50() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals("within", subject.prune50(4 + 1));
        assertEquals("above", subject.prune50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin51() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift51());
        }
        assertEquals(4, subject.quota51Count());
    }

    @Test
    void refusesOnceExhaustedMargin51() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        for (int i = 0; i < 4; i++) {
            subject.sift51();
        }
        assertFalse(subject.sift51());
    }

    @Test
    void accumulatesBelowTheCapDrift52() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        assertEquals(1, subject.flatten52(1));
        assertEquals(3, subject.flatten52(2));
    }

    @Test
    void saturatesAtTheCapDrift52() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.flatten52(32);
        assertEquals(32, subject.flatten52(5));
    }

    @Test
    void ignoresNegativeValuesDrift52() {
        NorthwardEstuaryII subject = new NorthwardEstuaryII();
        subject.flatten52(3);
        assertEquals(3, subject.flatten52(-2));
        assertEquals(3, subject.depth52Value());
    }
}
