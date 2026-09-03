package com.hollow.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperQuillIITest {

    @Test
    void classifiesBelowTheLowerBoundSpan0() {
        assertEquals("below", new CopperQuillII().kindle0(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan0() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.kindle0(2));
        assertEquals("upper-bound", subject.kindle0(7));
    }

    @Test
    void classifiesWithinAndAboveSpan0() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.kindle0(2 + 1));
        assertEquals("above", subject.kindle0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift1() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow1());
        }
        assertEquals(2, subject.ratio1Count());
    }

    @Test
    void refusesOnceExhaustedDrift1() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            subject.winnow1();
        }
        assertFalse(subject.winnow1());
    }

    @Test
    void accumulatesBelowTheCapYield2() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.winnow2(1));
        assertEquals(3, subject.winnow2(2));
    }

    @Test
    void saturatesAtTheCapYield2() {
        CopperQuillII subject = new CopperQuillII();
        subject.winnow2(22);
        assertEquals(22, subject.winnow2(5));
    }

    @Test
    void ignoresNegativeValuesYield2() {
        CopperQuillII subject = new CopperQuillII();
        subject.winnow2(3);
        assertEquals(3, subject.winnow2(-2));
        assertEquals(3, subject.quota2Value());
    }

    @Test
    void rejectsZeroDenominatorMargin3() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.anneal3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin3() {
        assertEquals(0.5, new CopperQuillII().anneal3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin3() {
        assertEquals(4.0, new CopperQuillII().anneal3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity4() {
        assertTrue(new CopperQuillII().sift4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new CopperQuillII().sift4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity4() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperQuillII().sift4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally5() {
        assertEquals("below", new CopperQuillII().collate5(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally5() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.collate5(3));
        assertEquals("upper-bound", subject.collate5(12));
    }

    @Test
    void classifiesWithinAndAboveTally5() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.collate5(3 + 1));
        assertEquals("above", subject.collate5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan6() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow6());
        }
        assertEquals(3, subject.capacity6Count());
    }

    @Test
    void refusesOnceExhaustedSpan6() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            subject.winnow6();
        }
        assertFalse(subject.winnow6());
    }

    @Test
    void accumulatesBelowTheCapRatio7() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.brace7(1));
        assertEquals(3, subject.brace7(2));
    }

    @Test
    void saturatesAtTheCapRatio7() {
        CopperQuillII subject = new CopperQuillII();
        subject.brace7(27);
        assertEquals(27, subject.brace7(5));
    }

    @Test
    void ignoresNegativeValuesRatio7() {
        CopperQuillII subject = new CopperQuillII();
        subject.brace7(3);
        assertEquals(3, subject.brace7(-2));
        assertEquals(3, subject.drift7Value());
    }

    @Test
    void rejectsZeroDenominatorYield8() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.anneal8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield8() {
        assertEquals(0.5, new CopperQuillII().anneal8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield8() {
        assertEquals(4.0, new CopperQuillII().anneal8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight9() {
        assertTrue(new CopperQuillII().collate9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new CopperQuillII().collate9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight9() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperQuillII().collate9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth10() {
        assertEquals("below", new CopperQuillII().tally10(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth10() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.tally10(4));
        assertEquals("upper-bound", subject.tally10(11));
    }

    @Test
    void classifiesWithinAndAboveDepth10() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.tally10(4 + 1));
        assertEquals("above", subject.tally10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota11() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate11());
        }
        assertEquals(4, subject.span11Count());
    }

    @Test
    void refusesOnceExhaustedQuota11() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            subject.collate11();
        }
        assertFalse(subject.collate11());
    }

    @Test
    void accumulatesBelowTheCapCapacity12() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.reconcile12(1));
        assertEquals(3, subject.reconcile12(2));
    }

    @Test
    void saturatesAtTheCapCapacity12() {
        CopperQuillII subject = new CopperQuillII();
        subject.reconcile12(32);
        assertEquals(32, subject.reconcile12(5));
    }

    @Test
    void ignoresNegativeValuesCapacity12() {
        CopperQuillII subject = new CopperQuillII();
        subject.reconcile12(3);
        assertEquals(3, subject.reconcile12(-2));
        assertEquals(3, subject.weight12Value());
    }

    @Test
    void rejectsZeroDenominatorDrift13() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.winnow13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift13() {
        assertEquals(0.5, new CopperQuillII().winnow13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift13() {
        assertEquals(4.0, new CopperQuillII().winnow13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias14() {
        assertTrue(new CopperQuillII().flatten14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new CopperQuillII().flatten14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias14() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperQuillII().flatten14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan15() {
        assertEquals("below", new CopperQuillII().collate15(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan15() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.collate15(5));
        assertEquals("upper-bound", subject.collate15(10));
    }

    @Test
    void classifiesWithinAndAboveSpan15() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.collate15(5 + 1));
        assertEquals("above", subject.collate15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift16() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune16());
        }
        assertEquals(1, subject.span16Count());
    }

    @Test
    void refusesOnceExhaustedDrift16() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            subject.prune16();
        }
        assertFalse(subject.prune16());
    }

    @Test
    void accumulatesBelowTheCapQuota17() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.flatten17(1));
        assertEquals(3, subject.flatten17(2));
    }

    @Test
    void saturatesAtTheCapQuota17() {
        CopperQuillII subject = new CopperQuillII();
        subject.flatten17(37);
        assertEquals(37, subject.flatten17(5));
    }

    @Test
    void ignoresNegativeValuesQuota17() {
        CopperQuillII subject = new CopperQuillII();
        subject.flatten17(3);
        assertEquals(3, subject.flatten17(-2));
        assertEquals(3, subject.capacity17Value());
    }

    @Test
    void rejectsZeroDenominatorTally18() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.gauge18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally18() {
        assertEquals(0.5, new CopperQuillII().gauge18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally18() {
        assertEquals(4.0, new CopperQuillII().gauge18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin19() {
        assertTrue(new CopperQuillII().winnow19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new CopperQuillII().winnow19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin19() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperQuillII().winnow19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan20() {
        assertEquals("below", new CopperQuillII().tally20(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan20() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.tally20(2));
        assertEquals("upper-bound", subject.tally20(9));
    }

    @Test
    void classifiesWithinAndAboveSpan20() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.tally20(2 + 1));
        assertEquals("above", subject.tally20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan21() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle21());
        }
        assertEquals(2, subject.bias21Count());
    }

    @Test
    void refusesOnceExhaustedSpan21() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            subject.kindle21();
        }
        assertFalse(subject.kindle21());
    }

    @Test
    void accumulatesBelowTheCapThreshold22() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.tally22(1));
        assertEquals(3, subject.tally22(2));
    }

    @Test
    void saturatesAtTheCapThreshold22() {
        CopperQuillII subject = new CopperQuillII();
        subject.tally22(42);
        assertEquals(42, subject.tally22(5));
    }

    @Test
    void ignoresNegativeValuesThreshold22() {
        CopperQuillII subject = new CopperQuillII();
        subject.tally22(3);
        assertEquals(3, subject.tally22(-2));
        assertEquals(3, subject.tally22Value());
    }

    @Test
    void rejectsZeroDenominatorYield23() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.anneal23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield23() {
        assertEquals(0.5, new CopperQuillII().anneal23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield23() {
        assertEquals(4.0, new CopperQuillII().anneal23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset24() {
        assertTrue(new CopperQuillII().temper24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new CopperQuillII().temper24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset24() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperQuillII().temper24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield25() {
        assertEquals("below", new CopperQuillII().flatten25(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield25() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.flatten25(3));
        assertEquals("upper-bound", subject.flatten25(8));
    }

    @Test
    void classifiesWithinAndAboveYield25() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.flatten25(3 + 1));
        assertEquals("above", subject.flatten25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin26() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate26());
        }
        assertEquals(3, subject.bias26Count());
    }

    @Test
    void refusesOnceExhaustedMargin26() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            subject.collate26();
        }
        assertFalse(subject.collate26());
    }

    @Test
    void accumulatesBelowTheCapWeight27() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.gauge27(1));
        assertEquals(3, subject.gauge27(2));
    }

    @Test
    void saturatesAtTheCapWeight27() {
        CopperQuillII subject = new CopperQuillII();
        subject.gauge27(47);
        assertEquals(47, subject.gauge27(5));
    }

    @Test
    void ignoresNegativeValuesWeight27() {
        CopperQuillII subject = new CopperQuillII();
        subject.gauge27(3);
        assertEquals(3, subject.gauge27(-2));
        assertEquals(3, subject.quota27Value());
    }

    @Test
    void rejectsZeroDenominatorTally28() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.gauge28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally28() {
        assertEquals(0.5, new CopperQuillII().gauge28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally28() {
        assertEquals(4.0, new CopperQuillII().gauge28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight29() {
        assertTrue(new CopperQuillII().flatten29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new CopperQuillII().flatten29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight29() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuillII().flatten29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin30() {
        assertEquals("below", new CopperQuillII().flatten30(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin30() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.flatten30(4));
        assertEquals("upper-bound", subject.flatten30(7));
    }

    @Test
    void classifiesWithinAndAboveMargin30() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.flatten30(4 + 1));
        assertEquals("above", subject.flatten30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota31() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally31());
        }
        assertEquals(4, subject.tally31Count());
    }

    @Test
    void refusesOnceExhaustedQuota31() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            subject.tally31();
        }
        assertFalse(subject.tally31());
    }

    @Test
    void accumulatesBelowTheCapMargin32() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.prune32(1));
        assertEquals(3, subject.prune32(2));
    }

    @Test
    void saturatesAtTheCapMargin32() {
        CopperQuillII subject = new CopperQuillII();
        subject.prune32(52);
        assertEquals(52, subject.prune32(5));
    }

    @Test
    void ignoresNegativeValuesMargin32() {
        CopperQuillII subject = new CopperQuillII();
        subject.prune32(3);
        assertEquals(3, subject.prune32(-2));
        assertEquals(3, subject.offset32Value());
    }

    @Test
    void rejectsZeroDenominatorMargin33() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.tally33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin33() {
        assertEquals(0.5, new CopperQuillII().tally33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin33() {
        assertEquals(4.0, new CopperQuillII().tally33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity34() {
        assertTrue(new CopperQuillII().collate34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new CopperQuillII().collate34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity34() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuillII().collate34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally35() {
        assertEquals("below", new CopperQuillII().collate35(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally35() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.collate35(5));
        assertEquals("upper-bound", subject.collate35(12));
    }

    @Test
    void classifiesWithinAndAboveTally35() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.collate35(5 + 1));
        assertEquals("above", subject.collate35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally36() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile36());
        }
        assertEquals(1, subject.threshold36Count());
    }

    @Test
    void refusesOnceExhaustedTally36() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile36();
        }
        assertFalse(subject.reconcile36());
    }

    @Test
    void accumulatesBelowTheCapDrift37() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.reconcile37(1));
        assertEquals(3, subject.reconcile37(2));
    }

    @Test
    void saturatesAtTheCapDrift37() {
        CopperQuillII subject = new CopperQuillII();
        subject.reconcile37(57);
        assertEquals(57, subject.reconcile37(5));
    }

    @Test
    void ignoresNegativeValuesDrift37() {
        CopperQuillII subject = new CopperQuillII();
        subject.reconcile37(3);
        assertEquals(3, subject.reconcile37(-2));
        assertEquals(3, subject.offset37Value());
    }

    @Test
    void rejectsZeroDenominatorQuota38() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.tally38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota38() {
        assertEquals(0.5, new CopperQuillII().tally38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota38() {
        assertEquals(4.0, new CopperQuillII().tally38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth39() {
        assertTrue(new CopperQuillII().reconcile39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new CopperQuillII().reconcile39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth39() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuillII().reconcile39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight40() {
        assertEquals("below", new CopperQuillII().collate40(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight40() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.collate40(2));
        assertEquals("upper-bound", subject.collate40(11));
    }

    @Test
    void classifiesWithinAndAboveWeight40() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.collate40(2 + 1));
        assertEquals("above", subject.collate40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight41() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift41());
        }
        assertEquals(2, subject.span41Count());
    }

    @Test
    void refusesOnceExhaustedWeight41() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            subject.sift41();
        }
        assertFalse(subject.sift41());
    }

    @Test
    void accumulatesBelowTheCapDrift42() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.hoist42(1));
        assertEquals(3, subject.hoist42(2));
    }

    @Test
    void saturatesAtTheCapDrift42() {
        CopperQuillII subject = new CopperQuillII();
        subject.hoist42(22);
        assertEquals(22, subject.hoist42(5));
    }

    @Test
    void ignoresNegativeValuesDrift42() {
        CopperQuillII subject = new CopperQuillII();
        subject.hoist42(3);
        assertEquals(3, subject.hoist42(-2));
        assertEquals(3, subject.capacity42Value());
    }

    @Test
    void rejectsZeroDenominatorRatio43() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.prune43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio43() {
        assertEquals(0.5, new CopperQuillII().prune43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio43() {
        assertEquals(4.0, new CopperQuillII().prune43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally44() {
        assertTrue(new CopperQuillII().collate44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new CopperQuillII().collate44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally44() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperQuillII().collate44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset45() {
        assertEquals("below", new CopperQuillII().kindle45(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset45() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.kindle45(3));
        assertEquals("upper-bound", subject.kindle45(10));
    }

    @Test
    void classifiesWithinAndAboveOffset45() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.kindle45(3 + 1));
        assertEquals("above", subject.kindle45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence46() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally46());
        }
        assertEquals(3, subject.weight46Count());
    }

    @Test
    void refusesOnceExhaustedCadence46() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            subject.tally46();
        }
        assertFalse(subject.tally46());
    }

    @Test
    void accumulatesBelowTheCapCadence47() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.gauge47(1));
        assertEquals(3, subject.gauge47(2));
    }

    @Test
    void saturatesAtTheCapCadence47() {
        CopperQuillII subject = new CopperQuillII();
        subject.gauge47(27);
        assertEquals(27, subject.gauge47(5));
    }

    @Test
    void ignoresNegativeValuesCadence47() {
        CopperQuillII subject = new CopperQuillII();
        subject.gauge47(3);
        assertEquals(3, subject.gauge47(-2));
        assertEquals(3, subject.ratio47Value());
    }

    @Test
    void rejectsZeroDenominatorWeight48() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.flatten48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight48() {
        assertEquals(0.5, new CopperQuillII().flatten48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight48() {
        assertEquals(4.0, new CopperQuillII().flatten48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold49() {
        assertTrue(new CopperQuillII().sift49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new CopperQuillII().sift49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold49() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperQuillII().sift49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin50() {
        assertEquals("below", new CopperQuillII().furl50(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin50() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.furl50(4));
        assertEquals("upper-bound", subject.furl50(9));
    }

    @Test
    void classifiesWithinAndAboveMargin50() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.furl50(4 + 1));
        assertEquals("above", subject.furl50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin51() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally51());
        }
        assertEquals(4, subject.threshold51Count());
    }

    @Test
    void refusesOnceExhaustedMargin51() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            subject.tally51();
        }
        assertFalse(subject.tally51());
    }

    @Test
    void accumulatesBelowTheCapBias52() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.sift52(1));
        assertEquals(3, subject.sift52(2));
    }

    @Test
    void saturatesAtTheCapBias52() {
        CopperQuillII subject = new CopperQuillII();
        subject.sift52(32);
        assertEquals(32, subject.sift52(5));
    }

    @Test
    void ignoresNegativeValuesBias52() {
        CopperQuillII subject = new CopperQuillII();
        subject.sift52(3);
        assertEquals(3, subject.sift52(-2));
        assertEquals(3, subject.yield52Value());
    }

    @Test
    void rejectsZeroDenominatorRatio53() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.tally53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio53() {
        assertEquals(0.5, new CopperQuillII().tally53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio53() {
        assertEquals(4.0, new CopperQuillII().tally53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold54() {
        assertTrue(new CopperQuillII().kindle54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new CopperQuillII().kindle54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold54() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperQuillII().kindle54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan55() {
        assertEquals("below", new CopperQuillII().flatten55(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan55() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.flatten55(5));
        assertEquals("upper-bound", subject.flatten55(8));
    }

    @Test
    void classifiesWithinAndAboveSpan55() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.flatten55(5 + 1));
        assertEquals("above", subject.flatten55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth56() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl56());
        }
        assertEquals(1, subject.offset56Count());
    }

    @Test
    void refusesOnceExhaustedDepth56() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            subject.furl56();
        }
        assertFalse(subject.furl56());
    }

    @Test
    void accumulatesBelowTheCapBias57() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.brace57(1));
        assertEquals(3, subject.brace57(2));
    }

    @Test
    void saturatesAtTheCapBias57() {
        CopperQuillII subject = new CopperQuillII();
        subject.brace57(37);
        assertEquals(37, subject.brace57(5));
    }

    @Test
    void ignoresNegativeValuesBias57() {
        CopperQuillII subject = new CopperQuillII();
        subject.brace57(3);
        assertEquals(3, subject.brace57(-2));
        assertEquals(3, subject.margin57Value());
    }

    @Test
    void rejectsZeroDenominatorCadence58() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.flatten58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence58() {
        assertEquals(0.5, new CopperQuillII().flatten58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence58() {
        assertEquals(4.0, new CopperQuillII().flatten58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence59() {
        assertTrue(new CopperQuillII().sift59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new CopperQuillII().sift59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence59() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperQuillII().sift59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift60() {
        assertEquals("below", new CopperQuillII().sift60(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift60() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.sift60(2));
        assertEquals("upper-bound", subject.sift60(7));
    }

    @Test
    void classifiesWithinAndAboveDrift60() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.sift60(2 + 1));
        assertEquals("above", subject.sift60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio61() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl61());
        }
        assertEquals(2, subject.cadence61Count());
    }

    @Test
    void refusesOnceExhaustedRatio61() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            subject.furl61();
        }
        assertFalse(subject.furl61());
    }

    @Test
    void accumulatesBelowTheCapRatio62() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.furl62(1));
        assertEquals(3, subject.furl62(2));
    }

    @Test
    void saturatesAtTheCapRatio62() {
        CopperQuillII subject = new CopperQuillII();
        subject.furl62(42);
        assertEquals(42, subject.furl62(5));
    }

    @Test
    void ignoresNegativeValuesRatio62() {
        CopperQuillII subject = new CopperQuillII();
        subject.furl62(3);
        assertEquals(3, subject.furl62(-2));
        assertEquals(3, subject.weight62Value());
    }

    @Test
    void rejectsZeroDenominatorRatio63() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.brace63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio63() {
        assertEquals(0.5, new CopperQuillII().brace63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio63() {
        assertEquals(4.0, new CopperQuillII().brace63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally64() {
        assertTrue(new CopperQuillII().hoist64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new CopperQuillII().hoist64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally64() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperQuillII().hoist64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight65() {
        assertEquals("below", new CopperQuillII().tally65(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight65() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.tally65(3));
        assertEquals("upper-bound", subject.tally65(12));
    }

    @Test
    void classifiesWithinAndAboveWeight65() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.tally65(3 + 1));
        assertEquals("above", subject.tally65(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias66() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate66());
        }
        assertEquals(3, subject.threshold66Count());
    }

    @Test
    void refusesOnceExhaustedBias66() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            subject.collate66();
        }
        assertFalse(subject.collate66());
    }

    @Test
    void accumulatesBelowTheCapWeight67() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.sift67(1));
        assertEquals(3, subject.sift67(2));
    }

    @Test
    void saturatesAtTheCapWeight67() {
        CopperQuillII subject = new CopperQuillII();
        subject.sift67(47);
        assertEquals(47, subject.sift67(5));
    }

    @Test
    void ignoresNegativeValuesWeight67() {
        CopperQuillII subject = new CopperQuillII();
        subject.sift67(3);
        assertEquals(3, subject.sift67(-2));
        assertEquals(3, subject.tally67Value());
    }

    @Test
    void rejectsZeroDenominatorDrift68() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.sift68(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift68() {
        assertEquals(0.5, new CopperQuillII().sift68(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift68() {
        assertEquals(4.0, new CopperQuillII().sift68(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity69() {
        assertTrue(new CopperQuillII().furl69(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity69() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new CopperQuillII().furl69(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity69() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperQuillII().furl69(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence70() {
        assertEquals("below", new CopperQuillII().hoist70(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence70() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.hoist70(4));
        assertEquals("upper-bound", subject.hoist70(11));
    }

    @Test
    void classifiesWithinAndAboveCadence70() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.hoist70(4 + 1));
        assertEquals("above", subject.hoist70(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold71() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten71());
        }
        assertEquals(4, subject.bias71Count());
    }

    @Test
    void refusesOnceExhaustedThreshold71() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            subject.flatten71();
        }
        assertFalse(subject.flatten71());
    }

    @Test
    void accumulatesBelowTheCapCadence72() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.sift72(1));
        assertEquals(3, subject.sift72(2));
    }

    @Test
    void saturatesAtTheCapCadence72() {
        CopperQuillII subject = new CopperQuillII();
        subject.sift72(52);
        assertEquals(52, subject.sift72(5));
    }

    @Test
    void ignoresNegativeValuesCadence72() {
        CopperQuillII subject = new CopperQuillII();
        subject.sift72(3);
        assertEquals(3, subject.sift72(-2));
        assertEquals(3, subject.threshold72Value());
    }

    @Test
    void rejectsZeroDenominatorDepth73() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.brace73(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth73() {
        assertEquals(0.5, new CopperQuillII().brace73(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth73() {
        assertEquals(4.0, new CopperQuillII().brace73(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity74() {
        assertTrue(new CopperQuillII().kindle74(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity74() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new CopperQuillII().kindle74(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity74() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuillII().kindle74(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence75() {
        assertEquals("below", new CopperQuillII().brace75(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence75() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.brace75(5));
        assertEquals("upper-bound", subject.brace75(10));
    }

    @Test
    void classifiesWithinAndAboveCadence75() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.brace75(5 + 1));
        assertEquals("above", subject.brace75(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota76() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper76());
        }
        assertEquals(1, subject.margin76Count());
    }

    @Test
    void refusesOnceExhaustedQuota76() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            subject.temper76();
        }
        assertFalse(subject.temper76());
    }

    @Test
    void accumulatesBelowTheCapCapacity77() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.collate77(1));
        assertEquals(3, subject.collate77(2));
    }

    @Test
    void saturatesAtTheCapCapacity77() {
        CopperQuillII subject = new CopperQuillII();
        subject.collate77(57);
        assertEquals(57, subject.collate77(5));
    }

    @Test
    void ignoresNegativeValuesCapacity77() {
        CopperQuillII subject = new CopperQuillII();
        subject.collate77(3);
        assertEquals(3, subject.collate77(-2));
        assertEquals(3, subject.margin77Value());
    }

    @Test
    void rejectsZeroDenominatorCadence78() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.collate78(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence78() {
        assertEquals(0.5, new CopperQuillII().collate78(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence78() {
        assertEquals(4.0, new CopperQuillII().collate78(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth79() {
        assertTrue(new CopperQuillII().reconcile79(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth79() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new CopperQuillII().reconcile79(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth79() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuillII().reconcile79(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias80() {
        assertEquals("below", new CopperQuillII().brace80(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias80() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.brace80(2));
        assertEquals("upper-bound", subject.brace80(9));
    }

    @Test
    void classifiesWithinAndAboveBias80() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.brace80(2 + 1));
        assertEquals("above", subject.brace80(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio81() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile81());
        }
        assertEquals(2, subject.threshold81Count());
    }

    @Test
    void refusesOnceExhaustedRatio81() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile81();
        }
        assertFalse(subject.reconcile81());
    }

    @Test
    void accumulatesBelowTheCapOffset82() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.flatten82(1));
        assertEquals(3, subject.flatten82(2));
    }

    @Test
    void saturatesAtTheCapOffset82() {
        CopperQuillII subject = new CopperQuillII();
        subject.flatten82(22);
        assertEquals(22, subject.flatten82(5));
    }

    @Test
    void ignoresNegativeValuesOffset82() {
        CopperQuillII subject = new CopperQuillII();
        subject.flatten82(3);
        assertEquals(3, subject.flatten82(-2));
        assertEquals(3, subject.span82Value());
    }

    @Test
    void rejectsZeroDenominatorDrift83() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile83(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift83() {
        assertEquals(0.5, new CopperQuillII().reconcile83(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift83() {
        assertEquals(4.0, new CopperQuillII().reconcile83(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio84() {
        assertTrue(new CopperQuillII().gauge84(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio84() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new CopperQuillII().gauge84(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio84() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuillII().gauge84(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset85() {
        assertEquals("below", new CopperQuillII().hoist85(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset85() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.hoist85(3));
        assertEquals("upper-bound", subject.hoist85(8));
    }

    @Test
    void classifiesWithinAndAboveOffset85() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.hoist85(3 + 1));
        assertEquals("above", subject.hoist85(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift86() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper86());
        }
        assertEquals(3, subject.ratio86Count());
    }

    @Test
    void refusesOnceExhaustedDrift86() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            subject.temper86();
        }
        assertFalse(subject.temper86());
    }

    @Test
    void accumulatesBelowTheCapCapacity87() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.temper87(1));
        assertEquals(3, subject.temper87(2));
    }

    @Test
    void saturatesAtTheCapCapacity87() {
        CopperQuillII subject = new CopperQuillII();
        subject.temper87(27);
        assertEquals(27, subject.temper87(5));
    }

    @Test
    void ignoresNegativeValuesCapacity87() {
        CopperQuillII subject = new CopperQuillII();
        subject.temper87(3);
        assertEquals(3, subject.temper87(-2));
        assertEquals(3, subject.threshold87Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold88() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.sift88(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold88() {
        assertEquals(0.5, new CopperQuillII().sift88(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold88() {
        assertEquals(4.0, new CopperQuillII().sift88(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan89() {
        assertTrue(new CopperQuillII().brace89(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan89() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new CopperQuillII().brace89(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan89() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperQuillII().brace89(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity90() {
        assertEquals("below", new CopperQuillII().kindle90(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity90() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.kindle90(4));
        assertEquals("upper-bound", subject.kindle90(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity90() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.kindle90(4 + 1));
        assertEquals("above", subject.kindle90(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset91() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally91());
        }
        assertEquals(4, subject.tally91Count());
    }

    @Test
    void refusesOnceExhaustedOffset91() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            subject.tally91();
        }
        assertFalse(subject.tally91());
    }

    @Test
    void accumulatesBelowTheCapRatio92() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.gauge92(1));
        assertEquals(3, subject.gauge92(2));
    }

    @Test
    void saturatesAtTheCapRatio92() {
        CopperQuillII subject = new CopperQuillII();
        subject.gauge92(32);
        assertEquals(32, subject.gauge92(5));
    }

    @Test
    void ignoresNegativeValuesRatio92() {
        CopperQuillII subject = new CopperQuillII();
        subject.gauge92(3);
        assertEquals(3, subject.gauge92(-2));
        assertEquals(3, subject.capacity92Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity93() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.anneal93(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity93() {
        assertEquals(0.5, new CopperQuillII().anneal93(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity93() {
        assertEquals(4.0, new CopperQuillII().anneal93(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan94() {
        assertTrue(new CopperQuillII().brace94(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan94() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new CopperQuillII().brace94(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan94() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperQuillII().brace94(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan95() {
        assertEquals("below", new CopperQuillII().kindle95(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan95() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.kindle95(5));
        assertEquals("upper-bound", subject.kindle95(12));
    }

    @Test
    void classifiesWithinAndAboveSpan95() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.kindle95(5 + 1));
        assertEquals("above", subject.kindle95(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio96() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle96());
        }
        assertEquals(1, subject.capacity96Count());
    }

    @Test
    void refusesOnceExhaustedRatio96() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            subject.kindle96();
        }
        assertFalse(subject.kindle96());
    }

    @Test
    void accumulatesBelowTheCapWeight97() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.tally97(1));
        assertEquals(3, subject.tally97(2));
    }

    @Test
    void saturatesAtTheCapWeight97() {
        CopperQuillII subject = new CopperQuillII();
        subject.tally97(37);
        assertEquals(37, subject.tally97(5));
    }

    @Test
    void ignoresNegativeValuesWeight97() {
        CopperQuillII subject = new CopperQuillII();
        subject.tally97(3);
        assertEquals(3, subject.tally97(-2));
        assertEquals(3, subject.yield97Value());
    }

    @Test
    void rejectsZeroDenominatorTally98() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile98(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally98() {
        assertEquals(0.5, new CopperQuillII().reconcile98(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally98() {
        assertEquals(4.0, new CopperQuillII().reconcile98(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio99() {
        assertTrue(new CopperQuillII().flatten99(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio99() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new CopperQuillII().flatten99(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio99() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperQuillII().flatten99(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield100() {
        assertEquals("below", new CopperQuillII().tally100(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield100() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.tally100(2));
        assertEquals("upper-bound", subject.tally100(11));
    }

    @Test
    void classifiesWithinAndAboveYield100() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.tally100(2 + 1));
        assertEquals("above", subject.tally100(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin101() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge101());
        }
        assertEquals(2, subject.drift101Count());
    }

    @Test
    void refusesOnceExhaustedMargin101() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            subject.gauge101();
        }
        assertFalse(subject.gauge101());
    }

    @Test
    void accumulatesBelowTheCapTally102() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.reconcile102(1));
        assertEquals(3, subject.reconcile102(2));
    }

    @Test
    void saturatesAtTheCapTally102() {
        CopperQuillII subject = new CopperQuillII();
        subject.reconcile102(42);
        assertEquals(42, subject.reconcile102(5));
    }

    @Test
    void ignoresNegativeValuesTally102() {
        CopperQuillII subject = new CopperQuillII();
        subject.reconcile102(3);
        assertEquals(3, subject.reconcile102(-2));
        assertEquals(3, subject.span102Value());
    }

    @Test
    void rejectsZeroDenominatorOffset103() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.winnow103(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset103() {
        assertEquals(0.5, new CopperQuillII().winnow103(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset103() {
        assertEquals(4.0, new CopperQuillII().winnow103(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth104() {
        assertTrue(new CopperQuillII().tally104(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth104() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new CopperQuillII().tally104(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth104() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperQuillII().tally104(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift105() {
        assertEquals("below", new CopperQuillII().reconcile105(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift105() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.reconcile105(3));
        assertEquals("upper-bound", subject.reconcile105(10));
    }

    @Test
    void classifiesWithinAndAboveDrift105() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.reconcile105(3 + 1));
        assertEquals("above", subject.reconcile105(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally106() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal106());
        }
        assertEquals(3, subject.span106Count());
    }

    @Test
    void refusesOnceExhaustedTally106() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            subject.anneal106();
        }
        assertFalse(subject.anneal106());
    }

    @Test
    void accumulatesBelowTheCapCapacity107() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.kindle107(1));
        assertEquals(3, subject.kindle107(2));
    }

    @Test
    void saturatesAtTheCapCapacity107() {
        CopperQuillII subject = new CopperQuillII();
        subject.kindle107(47);
        assertEquals(47, subject.kindle107(5));
    }

    @Test
    void ignoresNegativeValuesCapacity107() {
        CopperQuillII subject = new CopperQuillII();
        subject.kindle107(3);
        assertEquals(3, subject.kindle107(-2));
        assertEquals(3, subject.margin107Value());
    }

    @Test
    void rejectsZeroDenominatorOffset108() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.furl108(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset108() {
        assertEquals(0.5, new CopperQuillII().furl108(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset108() {
        assertEquals(4.0, new CopperQuillII().furl108(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift109() {
        assertTrue(new CopperQuillII().anneal109(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift109() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new CopperQuillII().anneal109(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift109() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperQuillII().anneal109(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan110() {
        assertEquals("below", new CopperQuillII().temper110(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan110() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.temper110(4));
        assertEquals("upper-bound", subject.temper110(9));
    }

    @Test
    void classifiesWithinAndAboveSpan110() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.temper110(4 + 1));
        assertEquals("above", subject.temper110(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset111() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper111());
        }
        assertEquals(4, subject.yield111Count());
    }

    @Test
    void refusesOnceExhaustedOffset111() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            subject.temper111();
        }
        assertFalse(subject.temper111());
    }

    @Test
    void accumulatesBelowTheCapBias112() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.winnow112(1));
        assertEquals(3, subject.winnow112(2));
    }

    @Test
    void saturatesAtTheCapBias112() {
        CopperQuillII subject = new CopperQuillII();
        subject.winnow112(52);
        assertEquals(52, subject.winnow112(5));
    }

    @Test
    void ignoresNegativeValuesBias112() {
        CopperQuillII subject = new CopperQuillII();
        subject.winnow112(3);
        assertEquals(3, subject.winnow112(-2));
        assertEquals(3, subject.drift112Value());
    }

    @Test
    void rejectsZeroDenominatorQuota113() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.kindle113(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota113() {
        assertEquals(0.5, new CopperQuillII().kindle113(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota113() {
        assertEquals(4.0, new CopperQuillII().kindle113(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold114() {
        assertTrue(new CopperQuillII().winnow114(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold114() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new CopperQuillII().winnow114(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold114() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperQuillII().winnow114(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota115() {
        assertEquals("below", new CopperQuillII().anneal115(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota115() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.anneal115(5));
        assertEquals("upper-bound", subject.anneal115(8));
    }

    @Test
    void classifiesWithinAndAboveQuota115() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.anneal115(5 + 1));
        assertEquals("above", subject.anneal115(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight116() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle116());
        }
        assertEquals(1, subject.capacity116Count());
    }

    @Test
    void refusesOnceExhaustedWeight116() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            subject.kindle116();
        }
        assertFalse(subject.kindle116());
    }

    @Test
    void accumulatesBelowTheCapRatio117() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.sift117(1));
        assertEquals(3, subject.sift117(2));
    }

    @Test
    void saturatesAtTheCapRatio117() {
        CopperQuillII subject = new CopperQuillII();
        subject.sift117(57);
        assertEquals(57, subject.sift117(5));
    }

    @Test
    void ignoresNegativeValuesRatio117() {
        CopperQuillII subject = new CopperQuillII();
        subject.sift117(3);
        assertEquals(3, subject.sift117(-2));
        assertEquals(3, subject.quota117Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold118() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.kindle118(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold118() {
        assertEquals(0.5, new CopperQuillII().kindle118(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold118() {
        assertEquals(4.0, new CopperQuillII().kindle118(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally119() {
        assertTrue(new CopperQuillII().kindle119(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally119() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new CopperQuillII().kindle119(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally119() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuillII().kindle119(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio120() {
        assertEquals("below", new CopperQuillII().furl120(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio120() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.furl120(2));
        assertEquals("upper-bound", subject.furl120(7));
    }

    @Test
    void classifiesWithinAndAboveRatio120() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.furl120(2 + 1));
        assertEquals("above", subject.furl120(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan121() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl121());
        }
        assertEquals(2, subject.offset121Count());
    }

    @Test
    void refusesOnceExhaustedSpan121() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            subject.furl121();
        }
        assertFalse(subject.furl121());
    }

    @Test
    void accumulatesBelowTheCapSpan122() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.brace122(1));
        assertEquals(3, subject.brace122(2));
    }

    @Test
    void saturatesAtTheCapSpan122() {
        CopperQuillII subject = new CopperQuillII();
        subject.brace122(22);
        assertEquals(22, subject.brace122(5));
    }

    @Test
    void ignoresNegativeValuesSpan122() {
        CopperQuillII subject = new CopperQuillII();
        subject.brace122(3);
        assertEquals(3, subject.brace122(-2));
        assertEquals(3, subject.ratio122Value());
    }

    @Test
    void rejectsZeroDenominatorBias123() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.gauge123(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias123() {
        assertEquals(0.5, new CopperQuillII().gauge123(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias123() {
        assertEquals(4.0, new CopperQuillII().gauge123(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift124() {
        assertTrue(new CopperQuillII().kindle124(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift124() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new CopperQuillII().kindle124(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift124() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuillII().kindle124(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth125() {
        assertEquals("below", new CopperQuillII().flatten125(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth125() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.flatten125(3));
        assertEquals("upper-bound", subject.flatten125(12));
    }

    @Test
    void classifiesWithinAndAboveDepth125() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.flatten125(3 + 1));
        assertEquals("above", subject.flatten125(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity126() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift126());
        }
        assertEquals(3, subject.drift126Count());
    }

    @Test
    void refusesOnceExhaustedCapacity126() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            subject.sift126();
        }
        assertFalse(subject.sift126());
    }

    @Test
    void accumulatesBelowTheCapSpan127() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.gauge127(1));
        assertEquals(3, subject.gauge127(2));
    }

    @Test
    void saturatesAtTheCapSpan127() {
        CopperQuillII subject = new CopperQuillII();
        subject.gauge127(27);
        assertEquals(27, subject.gauge127(5));
    }

    @Test
    void ignoresNegativeValuesSpan127() {
        CopperQuillII subject = new CopperQuillII();
        subject.gauge127(3);
        assertEquals(3, subject.gauge127(-2));
        assertEquals(3, subject.depth127Value());
    }

    @Test
    void rejectsZeroDenominatorCadence128() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.kindle128(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence128() {
        assertEquals(0.5, new CopperQuillII().kindle128(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence128() {
        assertEquals(4.0, new CopperQuillII().kindle128(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan129() {
        assertTrue(new CopperQuillII().brace129(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan129() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new CopperQuillII().brace129(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan129() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuillII().brace129(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally130() {
        assertEquals("below", new CopperQuillII().collate130(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally130() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.collate130(4));
        assertEquals("upper-bound", subject.collate130(11));
    }

    @Test
    void classifiesWithinAndAboveTally130() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.collate130(4 + 1));
        assertEquals("above", subject.collate130(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally131() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace131());
        }
        assertEquals(4, subject.threshold131Count());
    }

    @Test
    void refusesOnceExhaustedTally131() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            subject.brace131();
        }
        assertFalse(subject.brace131());
    }

    @Test
    void accumulatesBelowTheCapSpan132() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.brace132(1));
        assertEquals(3, subject.brace132(2));
    }

    @Test
    void saturatesAtTheCapSpan132() {
        CopperQuillII subject = new CopperQuillII();
        subject.brace132(32);
        assertEquals(32, subject.brace132(5));
    }

    @Test
    void ignoresNegativeValuesSpan132() {
        CopperQuillII subject = new CopperQuillII();
        subject.brace132(3);
        assertEquals(3, subject.brace132(-2));
        assertEquals(3, subject.capacity132Value());
    }

    @Test
    void rejectsZeroDenominatorBias133() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.gauge133(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias133() {
        assertEquals(0.5, new CopperQuillII().gauge133(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias133() {
        assertEquals(4.0, new CopperQuillII().gauge133(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio134() {
        assertTrue(new CopperQuillII().sift134(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio134() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new CopperQuillII().sift134(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio134() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperQuillII().sift134(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota135() {
        assertEquals("below", new CopperQuillII().temper135(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota135() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.temper135(5));
        assertEquals("upper-bound", subject.temper135(10));
    }

    @Test
    void classifiesWithinAndAboveQuota135() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.temper135(5 + 1));
        assertEquals("above", subject.temper135(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio136() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl136());
        }
        assertEquals(1, subject.offset136Count());
    }

    @Test
    void refusesOnceExhaustedRatio136() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            subject.furl136();
        }
        assertFalse(subject.furl136());
    }

    @Test
    void accumulatesBelowTheCapSpan137() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.winnow137(1));
        assertEquals(3, subject.winnow137(2));
    }

    @Test
    void saturatesAtTheCapSpan137() {
        CopperQuillII subject = new CopperQuillII();
        subject.winnow137(37);
        assertEquals(37, subject.winnow137(5));
    }

    @Test
    void ignoresNegativeValuesSpan137() {
        CopperQuillII subject = new CopperQuillII();
        subject.winnow137(3);
        assertEquals(3, subject.winnow137(-2));
        assertEquals(3, subject.tally137Value());
    }

    @Test
    void rejectsZeroDenominatorBias138() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.collate138(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias138() {
        assertEquals(0.5, new CopperQuillII().collate138(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias138() {
        assertEquals(4.0, new CopperQuillII().collate138(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield139() {
        assertTrue(new CopperQuillII().collate139(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield139() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new CopperQuillII().collate139(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield139() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperQuillII().collate139(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence140() {
        assertEquals("below", new CopperQuillII().collate140(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence140() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.collate140(2));
        assertEquals("upper-bound", subject.collate140(9));
    }

    @Test
    void classifiesWithinAndAboveCadence140() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.collate140(2 + 1));
        assertEquals("above", subject.collate140(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth141() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist141());
        }
        assertEquals(2, subject.tally141Count());
    }

    @Test
    void refusesOnceExhaustedDepth141() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            subject.hoist141();
        }
        assertFalse(subject.hoist141());
    }

    @Test
    void accumulatesBelowTheCapCapacity142() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.furl142(1));
        assertEquals(3, subject.furl142(2));
    }

    @Test
    void saturatesAtTheCapCapacity142() {
        CopperQuillII subject = new CopperQuillII();
        subject.furl142(42);
        assertEquals(42, subject.furl142(5));
    }

    @Test
    void ignoresNegativeValuesCapacity142() {
        CopperQuillII subject = new CopperQuillII();
        subject.furl142(3);
        assertEquals(3, subject.furl142(-2));
        assertEquals(3, subject.yield142Value());
    }

    @Test
    void rejectsZeroDenominatorBias143() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.sift143(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias143() {
        assertEquals(0.5, new CopperQuillII().sift143(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias143() {
        assertEquals(4.0, new CopperQuillII().sift143(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence144() {
        assertTrue(new CopperQuillII().temper144(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence144() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new CopperQuillII().temper144(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence144() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperQuillII().temper144(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota145() {
        assertEquals("below", new CopperQuillII().kindle145(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota145() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.kindle145(3));
        assertEquals("upper-bound", subject.kindle145(8));
    }

    @Test
    void classifiesWithinAndAboveQuota145() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.kindle145(3 + 1));
        assertEquals("above", subject.kindle145(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota146() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift146());
        }
        assertEquals(3, subject.offset146Count());
    }

    @Test
    void refusesOnceExhaustedQuota146() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            subject.sift146();
        }
        assertFalse(subject.sift146());
    }

    @Test
    void accumulatesBelowTheCapMargin147() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.winnow147(1));
        assertEquals(3, subject.winnow147(2));
    }

    @Test
    void saturatesAtTheCapMargin147() {
        CopperQuillII subject = new CopperQuillII();
        subject.winnow147(47);
        assertEquals(47, subject.winnow147(5));
    }

    @Test
    void ignoresNegativeValuesMargin147() {
        CopperQuillII subject = new CopperQuillII();
        subject.winnow147(3);
        assertEquals(3, subject.winnow147(-2));
        assertEquals(3, subject.bias147Value());
    }

    @Test
    void rejectsZeroDenominatorSpan148() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.flatten148(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan148() {
        assertEquals(0.5, new CopperQuillII().flatten148(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan148() {
        assertEquals(4.0, new CopperQuillII().flatten148(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio149() {
        assertTrue(new CopperQuillII().furl149(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio149() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new CopperQuillII().furl149(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio149() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperQuillII().furl149(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin150() {
        assertEquals("below", new CopperQuillII().tally150(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin150() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.tally150(4));
        assertEquals("upper-bound", subject.tally150(7));
    }

    @Test
    void classifiesWithinAndAboveMargin150() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.tally150(4 + 1));
        assertEquals("above", subject.tally150(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift151() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist151());
        }
        assertEquals(4, subject.weight151Count());
    }

    @Test
    void refusesOnceExhaustedDrift151() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            subject.hoist151();
        }
        assertFalse(subject.hoist151());
    }

    @Test
    void accumulatesBelowTheCapRatio152() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.anneal152(1));
        assertEquals(3, subject.anneal152(2));
    }

    @Test
    void saturatesAtTheCapRatio152() {
        CopperQuillII subject = new CopperQuillII();
        subject.anneal152(52);
        assertEquals(52, subject.anneal152(5));
    }

    @Test
    void ignoresNegativeValuesRatio152() {
        CopperQuillII subject = new CopperQuillII();
        subject.anneal152(3);
        assertEquals(3, subject.anneal152(-2));
        assertEquals(3, subject.offset152Value());
    }

    @Test
    void rejectsZeroDenominatorOffset153() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.collate153(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset153() {
        assertEquals(0.5, new CopperQuillII().collate153(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset153() {
        assertEquals(4.0, new CopperQuillII().collate153(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift154() {
        assertTrue(new CopperQuillII().furl154(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift154() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new CopperQuillII().furl154(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift154() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperQuillII().furl154(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity155() {
        assertEquals("below", new CopperQuillII().prune155(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity155() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.prune155(5));
        assertEquals("upper-bound", subject.prune155(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity155() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.prune155(5 + 1));
        assertEquals("above", subject.prune155(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset156() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune156());
        }
        assertEquals(1, subject.margin156Count());
    }

    @Test
    void refusesOnceExhaustedOffset156() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 1; i++) {
            subject.prune156();
        }
        assertFalse(subject.prune156());
    }

    @Test
    void accumulatesBelowTheCapQuota157() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.prune157(1));
        assertEquals(3, subject.prune157(2));
    }

    @Test
    void saturatesAtTheCapQuota157() {
        CopperQuillII subject = new CopperQuillII();
        subject.prune157(57);
        assertEquals(57, subject.prune157(5));
    }

    @Test
    void ignoresNegativeValuesQuota157() {
        CopperQuillII subject = new CopperQuillII();
        subject.prune157(3);
        assertEquals(3, subject.prune157(-2));
        assertEquals(3, subject.span157Value());
    }

    @Test
    void rejectsZeroDenominatorTally158() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.furl158(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally158() {
        assertEquals(0.5, new CopperQuillII().furl158(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally158() {
        assertEquals(4.0, new CopperQuillII().furl158(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold159() {
        assertTrue(new CopperQuillII().collate159(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold159() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new CopperQuillII().collate159(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold159() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperQuillII().collate159(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias160() {
        assertEquals("below", new CopperQuillII().reconcile160(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias160() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.reconcile160(2));
        assertEquals("upper-bound", subject.reconcile160(11));
    }

    @Test
    void classifiesWithinAndAboveBias160() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.reconcile160(2 + 1));
        assertEquals("above", subject.reconcile160(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield161() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl161());
        }
        assertEquals(2, subject.margin161Count());
    }

    @Test
    void refusesOnceExhaustedYield161() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 2; i++) {
            subject.furl161();
        }
        assertFalse(subject.furl161());
    }

    @Test
    void accumulatesBelowTheCapTally162() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.furl162(1));
        assertEquals(3, subject.furl162(2));
    }

    @Test
    void saturatesAtTheCapTally162() {
        CopperQuillII subject = new CopperQuillII();
        subject.furl162(22);
        assertEquals(22, subject.furl162(5));
    }

    @Test
    void ignoresNegativeValuesTally162() {
        CopperQuillII subject = new CopperQuillII();
        subject.furl162(3);
        assertEquals(3, subject.furl162(-2));
        assertEquals(3, subject.threshold162Value());
    }

    @Test
    void rejectsZeroDenominatorBias163() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.hoist163(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias163() {
        assertEquals(0.5, new CopperQuillII().hoist163(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias163() {
        assertEquals(4.0, new CopperQuillII().hoist163(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth164() {
        assertTrue(new CopperQuillII().flatten164(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth164() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new CopperQuillII().flatten164(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth164() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuillII().flatten164(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset165() {
        assertEquals("below", new CopperQuillII().brace165(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset165() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.brace165(3));
        assertEquals("upper-bound", subject.brace165(10));
    }

    @Test
    void classifiesWithinAndAboveOffset165() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.brace165(3 + 1));
        assertEquals("above", subject.brace165(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset166() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl166());
        }
        assertEquals(3, subject.drift166Count());
    }

    @Test
    void refusesOnceExhaustedOffset166() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 3; i++) {
            subject.furl166();
        }
        assertFalse(subject.furl166());
    }

    @Test
    void accumulatesBelowTheCapBias167() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.furl167(1));
        assertEquals(3, subject.furl167(2));
    }

    @Test
    void saturatesAtTheCapBias167() {
        CopperQuillII subject = new CopperQuillII();
        subject.furl167(27);
        assertEquals(27, subject.furl167(5));
    }

    @Test
    void ignoresNegativeValuesBias167() {
        CopperQuillII subject = new CopperQuillII();
        subject.furl167(3);
        assertEquals(3, subject.furl167(-2));
        assertEquals(3, subject.tally167Value());
    }

    @Test
    void rejectsZeroDenominatorDepth168() {
        CopperQuillII subject = new CopperQuillII();
        assertThrows(ArithmeticException.class, () -> subject.hoist168(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth168() {
        assertEquals(0.5, new CopperQuillII().hoist168(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth168() {
        assertEquals(4.0, new CopperQuillII().hoist168(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio169() {
        assertTrue(new CopperQuillII().reconcile169(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio169() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new CopperQuillII().reconcile169(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio169() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuillII().reconcile169(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight170() {
        assertEquals("below", new CopperQuillII().furl170(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight170() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("lower-bound", subject.furl170(4));
        assertEquals("upper-bound", subject.furl170(9));
    }

    @Test
    void classifiesWithinAndAboveWeight170() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals("within", subject.furl170(4 + 1));
        assertEquals("above", subject.furl170(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset171() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle171());
        }
        assertEquals(4, subject.ratio171Count());
    }

    @Test
    void refusesOnceExhaustedOffset171() {
        CopperQuillII subject = new CopperQuillII();
        for (int i = 0; i < 4; i++) {
            subject.kindle171();
        }
        assertFalse(subject.kindle171());
    }

    @Test
    void accumulatesBelowTheCapThreshold172() {
        CopperQuillII subject = new CopperQuillII();
        assertEquals(1, subject.gauge172(1));
        assertEquals(3, subject.gauge172(2));
    }

    @Test
    void saturatesAtTheCapThreshold172() {
        CopperQuillII subject = new CopperQuillII();
        subject.gauge172(32);
        assertEquals(32, subject.gauge172(5));
    }

    @Test
    void ignoresNegativeValuesThreshold172() {
        CopperQuillII subject = new CopperQuillII();
        subject.gauge172(3);
        assertEquals(3, subject.gauge172(-2));
        assertEquals(3, subject.margin172Value());
    }
}
