package com.wexford.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateRampartTest {

    @Test
    void classifiesBelowTheLowerBoundThreshold0() {
        assertEquals("below", new SlateRampart().brace0(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold0() {
        SlateRampart subject = new SlateRampart();
        assertEquals("lower-bound", subject.brace0(2));
        assertEquals("upper-bound", subject.brace0(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold0() {
        SlateRampart subject = new SlateRampart();
        assertEquals("within", subject.brace0(2 + 1));
        assertEquals("above", subject.brace0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota1() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate1());
        }
        assertEquals(2, subject.drift1Count());
    }

    @Test
    void refusesOnceExhaustedQuota1() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 2; i++) {
            subject.collate1();
        }
        assertFalse(subject.collate1());
    }

    @Test
    void accumulatesBelowTheCapDepth2() {
        SlateRampart subject = new SlateRampart();
        assertEquals(1, subject.collate2(1));
        assertEquals(3, subject.collate2(2));
    }

    @Test
    void saturatesAtTheCapDepth2() {
        SlateRampart subject = new SlateRampart();
        subject.collate2(22);
        assertEquals(22, subject.collate2(5));
    }

    @Test
    void ignoresNegativeValuesDepth2() {
        SlateRampart subject = new SlateRampart();
        subject.collate2(3);
        assertEquals(3, subject.collate2(-2));
        assertEquals(3, subject.offset2Value());
    }

    @Test
    void rejectsZeroDenominatorTally3() {
        SlateRampart subject = new SlateRampart();
        assertThrows(ArithmeticException.class, () -> subject.kindle3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally3() {
        assertEquals(0.5, new SlateRampart().kindle3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally3() {
        assertEquals(4.0, new SlateRampart().kindle3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin4() {
        assertTrue(new SlateRampart().sift4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new SlateRampart().sift4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin4() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateRampart().sift4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio5() {
        assertEquals("below", new SlateRampart().sift5(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio5() {
        SlateRampart subject = new SlateRampart();
        assertEquals("lower-bound", subject.sift5(3));
        assertEquals("upper-bound", subject.sift5(12));
    }

    @Test
    void classifiesWithinAndAboveRatio5() {
        SlateRampart subject = new SlateRampart();
        assertEquals("within", subject.sift5(3 + 1));
        assertEquals("above", subject.sift5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield6() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge6());
        }
        assertEquals(3, subject.ratio6Count());
    }

    @Test
    void refusesOnceExhaustedYield6() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 3; i++) {
            subject.gauge6();
        }
        assertFalse(subject.gauge6());
    }

    @Test
    void accumulatesBelowTheCapSpan7() {
        SlateRampart subject = new SlateRampart();
        assertEquals(1, subject.kindle7(1));
        assertEquals(3, subject.kindle7(2));
    }

    @Test
    void saturatesAtTheCapSpan7() {
        SlateRampart subject = new SlateRampart();
        subject.kindle7(27);
        assertEquals(27, subject.kindle7(5));
    }

    @Test
    void ignoresNegativeValuesSpan7() {
        SlateRampart subject = new SlateRampart();
        subject.kindle7(3);
        assertEquals(3, subject.kindle7(-2));
        assertEquals(3, subject.tally7Value());
    }

    @Test
    void rejectsZeroDenominatorYield8() {
        SlateRampart subject = new SlateRampart();
        assertThrows(ArithmeticException.class, () -> subject.anneal8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield8() {
        assertEquals(0.5, new SlateRampart().anneal8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield8() {
        assertEquals(4.0, new SlateRampart().anneal8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift9() {
        assertTrue(new SlateRampart().kindle9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new SlateRampart().kindle9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift9() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateRampart().kindle9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield10() {
        assertEquals("below", new SlateRampart().collate10(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield10() {
        SlateRampart subject = new SlateRampart();
        assertEquals("lower-bound", subject.collate10(4));
        assertEquals("upper-bound", subject.collate10(11));
    }

    @Test
    void classifiesWithinAndAboveYield10() {
        SlateRampart subject = new SlateRampart();
        assertEquals("within", subject.collate10(4 + 1));
        assertEquals("above", subject.collate10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth11() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift11());
        }
        assertEquals(4, subject.span11Count());
    }

    @Test
    void refusesOnceExhaustedDepth11() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 4; i++) {
            subject.sift11();
        }
        assertFalse(subject.sift11());
    }

    @Test
    void accumulatesBelowTheCapCadence12() {
        SlateRampart subject = new SlateRampart();
        assertEquals(1, subject.anneal12(1));
        assertEquals(3, subject.anneal12(2));
    }

    @Test
    void saturatesAtTheCapCadence12() {
        SlateRampart subject = new SlateRampart();
        subject.anneal12(32);
        assertEquals(32, subject.anneal12(5));
    }

    @Test
    void ignoresNegativeValuesCadence12() {
        SlateRampart subject = new SlateRampart();
        subject.anneal12(3);
        assertEquals(3, subject.anneal12(-2));
        assertEquals(3, subject.ratio12Value());
    }

    @Test
    void rejectsZeroDenominatorRatio13() {
        SlateRampart subject = new SlateRampart();
        assertThrows(ArithmeticException.class, () -> subject.brace13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio13() {
        assertEquals(0.5, new SlateRampart().brace13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio13() {
        assertEquals(4.0, new SlateRampart().brace13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity14() {
        assertTrue(new SlateRampart().reconcile14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new SlateRampart().reconcile14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity14() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateRampart().reconcile14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield15() {
        assertEquals("below", new SlateRampart().hoist15(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield15() {
        SlateRampart subject = new SlateRampart();
        assertEquals("lower-bound", subject.hoist15(5));
        assertEquals("upper-bound", subject.hoist15(10));
    }

    @Test
    void classifiesWithinAndAboveYield15() {
        SlateRampart subject = new SlateRampart();
        assertEquals("within", subject.hoist15(5 + 1));
        assertEquals("above", subject.hoist15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity16() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile16());
        }
        assertEquals(1, subject.span16Count());
    }

    @Test
    void refusesOnceExhaustedCapacity16() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 1; i++) {
            subject.reconcile16();
        }
        assertFalse(subject.reconcile16());
    }

    @Test
    void accumulatesBelowTheCapSpan17() {
        SlateRampart subject = new SlateRampart();
        assertEquals(1, subject.anneal17(1));
        assertEquals(3, subject.anneal17(2));
    }

    @Test
    void saturatesAtTheCapSpan17() {
        SlateRampart subject = new SlateRampart();
        subject.anneal17(37);
        assertEquals(37, subject.anneal17(5));
    }

    @Test
    void ignoresNegativeValuesSpan17() {
        SlateRampart subject = new SlateRampart();
        subject.anneal17(3);
        assertEquals(3, subject.anneal17(-2));
        assertEquals(3, subject.weight17Value());
    }

    @Test
    void rejectsZeroDenominatorCadence18() {
        SlateRampart subject = new SlateRampart();
        assertThrows(ArithmeticException.class, () -> subject.prune18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence18() {
        assertEquals(0.5, new SlateRampart().prune18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence18() {
        assertEquals(4.0, new SlateRampart().prune18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift19() {
        assertTrue(new SlateRampart().brace19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new SlateRampart().brace19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift19() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateRampart().brace19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally20() {
        assertEquals("below", new SlateRampart().winnow20(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally20() {
        SlateRampart subject = new SlateRampart();
        assertEquals("lower-bound", subject.winnow20(2));
        assertEquals("upper-bound", subject.winnow20(9));
    }

    @Test
    void classifiesWithinAndAboveTally20() {
        SlateRampart subject = new SlateRampart();
        assertEquals("within", subject.winnow20(2 + 1));
        assertEquals("above", subject.winnow20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset21() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune21());
        }
        assertEquals(2, subject.tally21Count());
    }

    @Test
    void refusesOnceExhaustedOffset21() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 2; i++) {
            subject.prune21();
        }
        assertFalse(subject.prune21());
    }

    @Test
    void accumulatesBelowTheCapWeight22() {
        SlateRampart subject = new SlateRampart();
        assertEquals(1, subject.gauge22(1));
        assertEquals(3, subject.gauge22(2));
    }

    @Test
    void saturatesAtTheCapWeight22() {
        SlateRampart subject = new SlateRampart();
        subject.gauge22(42);
        assertEquals(42, subject.gauge22(5));
    }

    @Test
    void ignoresNegativeValuesWeight22() {
        SlateRampart subject = new SlateRampart();
        subject.gauge22(3);
        assertEquals(3, subject.gauge22(-2));
        assertEquals(3, subject.bias22Value());
    }

    @Test
    void rejectsZeroDenominatorSpan23() {
        SlateRampart subject = new SlateRampart();
        assertThrows(ArithmeticException.class, () -> subject.reconcile23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan23() {
        assertEquals(0.5, new SlateRampart().reconcile23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan23() {
        assertEquals(4.0, new SlateRampart().reconcile23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift24() {
        assertTrue(new SlateRampart().collate24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new SlateRampart().collate24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift24() {
        assertEquals(java.util.Arrays.asList(12),
                new SlateRampart().collate24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift25() {
        assertEquals("below", new SlateRampart().kindle25(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift25() {
        SlateRampart subject = new SlateRampart();
        assertEquals("lower-bound", subject.kindle25(3));
        assertEquals("upper-bound", subject.kindle25(8));
    }

    @Test
    void classifiesWithinAndAboveDrift25() {
        SlateRampart subject = new SlateRampart();
        assertEquals("within", subject.kindle25(3 + 1));
        assertEquals("above", subject.kindle25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold26() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace26());
        }
        assertEquals(3, subject.weight26Count());
    }

    @Test
    void refusesOnceExhaustedThreshold26() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 3; i++) {
            subject.brace26();
        }
        assertFalse(subject.brace26());
    }

    @Test
    void accumulatesBelowTheCapOffset27() {
        SlateRampart subject = new SlateRampart();
        assertEquals(1, subject.flatten27(1));
        assertEquals(3, subject.flatten27(2));
    }

    @Test
    void saturatesAtTheCapOffset27() {
        SlateRampart subject = new SlateRampart();
        subject.flatten27(47);
        assertEquals(47, subject.flatten27(5));
    }

    @Test
    void ignoresNegativeValuesOffset27() {
        SlateRampart subject = new SlateRampart();
        subject.flatten27(3);
        assertEquals(3, subject.flatten27(-2));
        assertEquals(3, subject.ratio27Value());
    }

    @Test
    void rejectsZeroDenominatorBias28() {
        SlateRampart subject = new SlateRampart();
        assertThrows(ArithmeticException.class, () -> subject.hoist28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias28() {
        assertEquals(0.5, new SlateRampart().hoist28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias28() {
        assertEquals(4.0, new SlateRampart().hoist28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally29() {
        assertTrue(new SlateRampart().furl29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new SlateRampart().furl29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally29() {
        assertEquals(java.util.Arrays.asList(8),
                new SlateRampart().furl29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight30() {
        assertEquals("below", new SlateRampart().temper30(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight30() {
        SlateRampart subject = new SlateRampart();
        assertEquals("lower-bound", subject.temper30(4));
        assertEquals("upper-bound", subject.temper30(7));
    }

    @Test
    void classifiesWithinAndAboveWeight30() {
        SlateRampart subject = new SlateRampart();
        assertEquals("within", subject.temper30(4 + 1));
        assertEquals("above", subject.temper30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold31() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist31());
        }
        assertEquals(4, subject.bias31Count());
    }

    @Test
    void refusesOnceExhaustedThreshold31() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 4; i++) {
            subject.hoist31();
        }
        assertFalse(subject.hoist31());
    }

    @Test
    void accumulatesBelowTheCapTally32() {
        SlateRampart subject = new SlateRampart();
        assertEquals(1, subject.flatten32(1));
        assertEquals(3, subject.flatten32(2));
    }

    @Test
    void saturatesAtTheCapTally32() {
        SlateRampart subject = new SlateRampart();
        subject.flatten32(52);
        assertEquals(52, subject.flatten32(5));
    }

    @Test
    void ignoresNegativeValuesTally32() {
        SlateRampart subject = new SlateRampart();
        subject.flatten32(3);
        assertEquals(3, subject.flatten32(-2));
        assertEquals(3, subject.bias32Value());
    }

    @Test
    void rejectsZeroDenominatorYield33() {
        SlateRampart subject = new SlateRampart();
        assertThrows(ArithmeticException.class, () -> subject.winnow33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield33() {
        assertEquals(0.5, new SlateRampart().winnow33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield33() {
        assertEquals(4.0, new SlateRampart().winnow33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth34() {
        assertTrue(new SlateRampart().sift34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new SlateRampart().sift34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth34() {
        assertEquals(java.util.Arrays.asList(13),
                new SlateRampart().sift34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth35() {
        assertEquals("below", new SlateRampart().anneal35(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth35() {
        SlateRampart subject = new SlateRampart();
        assertEquals("lower-bound", subject.anneal35(5));
        assertEquals("upper-bound", subject.anneal35(12));
    }

    @Test
    void classifiesWithinAndAboveDepth35() {
        SlateRampart subject = new SlateRampart();
        assertEquals("within", subject.anneal35(5 + 1));
        assertEquals("above", subject.anneal35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan36() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune36());
        }
        assertEquals(1, subject.threshold36Count());
    }

    @Test
    void refusesOnceExhaustedSpan36() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 1; i++) {
            subject.prune36();
        }
        assertFalse(subject.prune36());
    }

    @Test
    void accumulatesBelowTheCapCadence37() {
        SlateRampart subject = new SlateRampart();
        assertEquals(1, subject.collate37(1));
        assertEquals(3, subject.collate37(2));
    }

    @Test
    void saturatesAtTheCapCadence37() {
        SlateRampart subject = new SlateRampart();
        subject.collate37(57);
        assertEquals(57, subject.collate37(5));
    }

    @Test
    void ignoresNegativeValuesCadence37() {
        SlateRampart subject = new SlateRampart();
        subject.collate37(3);
        assertEquals(3, subject.collate37(-2));
        assertEquals(3, subject.capacity37Value());
    }

    @Test
    void rejectsZeroDenominatorMargin38() {
        SlateRampart subject = new SlateRampart();
        assertThrows(ArithmeticException.class, () -> subject.sift38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin38() {
        assertEquals(0.5, new SlateRampart().sift38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin38() {
        assertEquals(4.0, new SlateRampart().sift38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence39() {
        assertTrue(new SlateRampart().sift39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new SlateRampart().sift39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence39() {
        assertEquals(java.util.Arrays.asList(9),
                new SlateRampart().sift39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold40() {
        assertEquals("below", new SlateRampart().reconcile40(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold40() {
        SlateRampart subject = new SlateRampart();
        assertEquals("lower-bound", subject.reconcile40(2));
        assertEquals("upper-bound", subject.reconcile40(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold40() {
        SlateRampart subject = new SlateRampart();
        assertEquals("within", subject.reconcile40(2 + 1));
        assertEquals("above", subject.reconcile40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth41() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally41());
        }
        assertEquals(2, subject.cadence41Count());
    }

    @Test
    void refusesOnceExhaustedDepth41() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 2; i++) {
            subject.tally41();
        }
        assertFalse(subject.tally41());
    }

    @Test
    void accumulatesBelowTheCapOffset42() {
        SlateRampart subject = new SlateRampart();
        assertEquals(1, subject.anneal42(1));
        assertEquals(3, subject.anneal42(2));
    }

    @Test
    void saturatesAtTheCapOffset42() {
        SlateRampart subject = new SlateRampart();
        subject.anneal42(22);
        assertEquals(22, subject.anneal42(5));
    }

    @Test
    void ignoresNegativeValuesOffset42() {
        SlateRampart subject = new SlateRampart();
        subject.anneal42(3);
        assertEquals(3, subject.anneal42(-2));
        assertEquals(3, subject.tally42Value());
    }

    @Test
    void rejectsZeroDenominatorMargin43() {
        SlateRampart subject = new SlateRampart();
        assertThrows(ArithmeticException.class, () -> subject.temper43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin43() {
        assertEquals(0.5, new SlateRampart().temper43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin43() {
        assertEquals(4.0, new SlateRampart().temper43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset44() {
        assertTrue(new SlateRampart().sift44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new SlateRampart().sift44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset44() {
        assertEquals(java.util.Arrays.asList(14),
                new SlateRampart().sift44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth45() {
        assertEquals("below", new SlateRampart().gauge45(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth45() {
        SlateRampart subject = new SlateRampart();
        assertEquals("lower-bound", subject.gauge45(3));
        assertEquals("upper-bound", subject.gauge45(10));
    }

    @Test
    void classifiesWithinAndAboveDepth45() {
        SlateRampart subject = new SlateRampart();
        assertEquals("within", subject.gauge45(3 + 1));
        assertEquals("above", subject.gauge45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally46() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper46());
        }
        assertEquals(3, subject.drift46Count());
    }

    @Test
    void refusesOnceExhaustedTally46() {
        SlateRampart subject = new SlateRampart();
        for (int i = 0; i < 3; i++) {
            subject.temper46();
        }
        assertFalse(subject.temper46());
    }
}
