package com.bramble.furrow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleQuillIITest {

    @Test
    void classifiesBelowTheLowerBoundOffset0() {
        assertEquals("below", new BrambleQuillII().furl0(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset0() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("lower-bound", subject.furl0(2));
        assertEquals("upper-bound", subject.furl0(7));
    }

    @Test
    void classifiesWithinAndAboveOffset0() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("within", subject.furl0(2 + 1));
        assertEquals("above", subject.furl0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota1() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile1());
        }
        assertEquals(2, subject.depth1Count());
    }

    @Test
    void refusesOnceExhaustedQuota1() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile1();
        }
        assertFalse(subject.reconcile1());
    }

    @Test
    void accumulatesBelowTheCapSpan2() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals(1, subject.winnow2(1));
        assertEquals(3, subject.winnow2(2));
    }

    @Test
    void saturatesAtTheCapSpan2() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.winnow2(22);
        assertEquals(22, subject.winnow2(5));
    }

    @Test
    void ignoresNegativeValuesSpan2() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.winnow2(3);
        assertEquals(3, subject.winnow2(-2));
        assertEquals(3, subject.threshold2Value());
    }

    @Test
    void rejectsZeroDenominatorMargin3() {
        BrambleQuillII subject = new BrambleQuillII();
        assertThrows(ArithmeticException.class, () -> subject.tally3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin3() {
        assertEquals(0.5, new BrambleQuillII().tally3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin3() {
        assertEquals(4.0, new BrambleQuillII().tally3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity4() {
        assertTrue(new BrambleQuillII().kindle4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new BrambleQuillII().kindle4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity4() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleQuillII().kindle4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift5() {
        assertEquals("below", new BrambleQuillII().anneal5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift5() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("lower-bound", subject.anneal5(3));
        assertEquals("upper-bound", subject.anneal5(12));
    }

    @Test
    void classifiesWithinAndAboveDrift5() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("within", subject.anneal5(3 + 1));
        assertEquals("above", subject.anneal5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin6() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile6());
        }
        assertEquals(3, subject.ratio6Count());
    }

    @Test
    void refusesOnceExhaustedMargin6() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile6();
        }
        assertFalse(subject.reconcile6());
    }

    @Test
    void accumulatesBelowTheCapSpan7() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals(1, subject.prune7(1));
        assertEquals(3, subject.prune7(2));
    }

    @Test
    void saturatesAtTheCapSpan7() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.prune7(27);
        assertEquals(27, subject.prune7(5));
    }

    @Test
    void ignoresNegativeValuesSpan7() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.prune7(3);
        assertEquals(3, subject.prune7(-2));
        assertEquals(3, subject.depth7Value());
    }

    @Test
    void rejectsZeroDenominatorDrift8() {
        BrambleQuillII subject = new BrambleQuillII();
        assertThrows(ArithmeticException.class, () -> subject.tally8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift8() {
        assertEquals(0.5, new BrambleQuillII().tally8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift8() {
        assertEquals(4.0, new BrambleQuillII().tally8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity9() {
        assertTrue(new BrambleQuillII().sift9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new BrambleQuillII().sift9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity9() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleQuillII().sift9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio10() {
        assertEquals("below", new BrambleQuillII().anneal10(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio10() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("lower-bound", subject.anneal10(4));
        assertEquals("upper-bound", subject.anneal10(11));
    }

    @Test
    void classifiesWithinAndAboveRatio10() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("within", subject.anneal10(4 + 1));
        assertEquals("above", subject.anneal10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth11() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle11());
        }
        assertEquals(4, subject.offset11Count());
    }

    @Test
    void refusesOnceExhaustedDepth11() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 4; i++) {
            subject.kindle11();
        }
        assertFalse(subject.kindle11());
    }

    @Test
    void accumulatesBelowTheCapOffset12() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals(1, subject.sift12(1));
        assertEquals(3, subject.sift12(2));
    }

    @Test
    void saturatesAtTheCapOffset12() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.sift12(32);
        assertEquals(32, subject.sift12(5));
    }

    @Test
    void ignoresNegativeValuesOffset12() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.sift12(3);
        assertEquals(3, subject.sift12(-2));
        assertEquals(3, subject.quota12Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity13() {
        BrambleQuillII subject = new BrambleQuillII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity13() {
        assertEquals(0.5, new BrambleQuillII().reconcile13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity13() {
        assertEquals(4.0, new BrambleQuillII().reconcile13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield14() {
        assertTrue(new BrambleQuillII().brace14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new BrambleQuillII().brace14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield14() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleQuillII().brace14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset15() {
        assertEquals("below", new BrambleQuillII().brace15(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset15() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("lower-bound", subject.brace15(5));
        assertEquals("upper-bound", subject.brace15(10));
    }

    @Test
    void classifiesWithinAndAboveOffset15() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("within", subject.brace15(5 + 1));
        assertEquals("above", subject.brace15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight16() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift16());
        }
        assertEquals(1, subject.cadence16Count());
    }

    @Test
    void refusesOnceExhaustedWeight16() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 1; i++) {
            subject.sift16();
        }
        assertFalse(subject.sift16());
    }

    @Test
    void accumulatesBelowTheCapQuota17() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals(1, subject.gauge17(1));
        assertEquals(3, subject.gauge17(2));
    }

    @Test
    void saturatesAtTheCapQuota17() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.gauge17(37);
        assertEquals(37, subject.gauge17(5));
    }

    @Test
    void ignoresNegativeValuesQuota17() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.gauge17(3);
        assertEquals(3, subject.gauge17(-2));
        assertEquals(3, subject.threshold17Value());
    }

    @Test
    void rejectsZeroDenominatorWeight18() {
        BrambleQuillII subject = new BrambleQuillII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight18() {
        assertEquals(0.5, new BrambleQuillII().reconcile18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight18() {
        assertEquals(4.0, new BrambleQuillII().reconcile18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth19() {
        assertTrue(new BrambleQuillII().temper19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new BrambleQuillII().temper19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth19() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleQuillII().temper19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift20() {
        assertEquals("below", new BrambleQuillII().anneal20(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift20() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("lower-bound", subject.anneal20(2));
        assertEquals("upper-bound", subject.anneal20(9));
    }

    @Test
    void classifiesWithinAndAboveDrift20() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("within", subject.anneal20(2 + 1));
        assertEquals("above", subject.anneal20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity21() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate21());
        }
        assertEquals(2, subject.ratio21Count());
    }

    @Test
    void refusesOnceExhaustedCapacity21() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 2; i++) {
            subject.collate21();
        }
        assertFalse(subject.collate21());
    }

    @Test
    void accumulatesBelowTheCapBias22() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals(1, subject.gauge22(1));
        assertEquals(3, subject.gauge22(2));
    }

    @Test
    void saturatesAtTheCapBias22() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.gauge22(42);
        assertEquals(42, subject.gauge22(5));
    }

    @Test
    void ignoresNegativeValuesBias22() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.gauge22(3);
        assertEquals(3, subject.gauge22(-2));
        assertEquals(3, subject.yield22Value());
    }

    @Test
    void rejectsZeroDenominatorSpan23() {
        BrambleQuillII subject = new BrambleQuillII();
        assertThrows(ArithmeticException.class, () -> subject.anneal23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan23() {
        assertEquals(0.5, new BrambleQuillII().anneal23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan23() {
        assertEquals(4.0, new BrambleQuillII().anneal23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift24() {
        assertTrue(new BrambleQuillII().anneal24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new BrambleQuillII().anneal24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift24() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleQuillII().anneal24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan25() {
        assertEquals("below", new BrambleQuillII().winnow25(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan25() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("lower-bound", subject.winnow25(3));
        assertEquals("upper-bound", subject.winnow25(8));
    }

    @Test
    void classifiesWithinAndAboveSpan25() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("within", subject.winnow25(3 + 1));
        assertEquals("above", subject.winnow25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota26() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow26());
        }
        assertEquals(3, subject.cadence26Count());
    }

    @Test
    void refusesOnceExhaustedQuota26() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 3; i++) {
            subject.winnow26();
        }
        assertFalse(subject.winnow26());
    }

    @Test
    void accumulatesBelowTheCapCapacity27() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals(1, subject.kindle27(1));
        assertEquals(3, subject.kindle27(2));
    }

    @Test
    void saturatesAtTheCapCapacity27() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.kindle27(47);
        assertEquals(47, subject.kindle27(5));
    }

    @Test
    void ignoresNegativeValuesCapacity27() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.kindle27(3);
        assertEquals(3, subject.kindle27(-2));
        assertEquals(3, subject.yield27Value());
    }

    @Test
    void rejectsZeroDenominatorMargin28() {
        BrambleQuillII subject = new BrambleQuillII();
        assertThrows(ArithmeticException.class, () -> subject.brace28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin28() {
        assertEquals(0.5, new BrambleQuillII().brace28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin28() {
        assertEquals(4.0, new BrambleQuillII().brace28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias29() {
        assertTrue(new BrambleQuillII().collate29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new BrambleQuillII().collate29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias29() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleQuillII().collate29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin30() {
        assertEquals("below", new BrambleQuillII().gauge30(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin30() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("lower-bound", subject.gauge30(4));
        assertEquals("upper-bound", subject.gauge30(7));
    }

    @Test
    void classifiesWithinAndAboveMargin30() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("within", subject.gauge30(4 + 1));
        assertEquals("above", subject.gauge30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth31() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow31());
        }
        assertEquals(4, subject.yield31Count());
    }

    @Test
    void refusesOnceExhaustedDepth31() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 4; i++) {
            subject.winnow31();
        }
        assertFalse(subject.winnow31());
    }

    @Test
    void accumulatesBelowTheCapOffset32() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals(1, subject.gauge32(1));
        assertEquals(3, subject.gauge32(2));
    }

    @Test
    void saturatesAtTheCapOffset32() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.gauge32(52);
        assertEquals(52, subject.gauge32(5));
    }

    @Test
    void ignoresNegativeValuesOffset32() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.gauge32(3);
        assertEquals(3, subject.gauge32(-2));
        assertEquals(3, subject.depth32Value());
    }

    @Test
    void rejectsZeroDenominatorDrift33() {
        BrambleQuillII subject = new BrambleQuillII();
        assertThrows(ArithmeticException.class, () -> subject.gauge33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift33() {
        assertEquals(0.5, new BrambleQuillII().gauge33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift33() {
        assertEquals(4.0, new BrambleQuillII().gauge33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias34() {
        assertTrue(new BrambleQuillII().kindle34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new BrambleQuillII().kindle34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias34() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleQuillII().kindle34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally35() {
        assertEquals("below", new BrambleQuillII().reconcile35(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally35() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("lower-bound", subject.reconcile35(5));
        assertEquals("upper-bound", subject.reconcile35(12));
    }

    @Test
    void classifiesWithinAndAboveTally35() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("within", subject.reconcile35(5 + 1));
        assertEquals("above", subject.reconcile35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift36() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile36());
        }
        assertEquals(1, subject.threshold36Count());
    }

    @Test
    void refusesOnceExhaustedDrift36() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile36();
        }
        assertFalse(subject.reconcile36());
    }

    @Test
    void accumulatesBelowTheCapOffset37() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals(1, subject.temper37(1));
        assertEquals(3, subject.temper37(2));
    }

    @Test
    void saturatesAtTheCapOffset37() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.temper37(57);
        assertEquals(57, subject.temper37(5));
    }

    @Test
    void ignoresNegativeValuesOffset37() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.temper37(3);
        assertEquals(3, subject.temper37(-2));
        assertEquals(3, subject.capacity37Value());
    }

    @Test
    void rejectsZeroDenominatorBias38() {
        BrambleQuillII subject = new BrambleQuillII();
        assertThrows(ArithmeticException.class, () -> subject.winnow38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias38() {
        assertEquals(0.5, new BrambleQuillII().winnow38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias38() {
        assertEquals(4.0, new BrambleQuillII().winnow38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias39() {
        assertTrue(new BrambleQuillII().gauge39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new BrambleQuillII().gauge39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias39() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleQuillII().gauge39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift40() {
        assertEquals("below", new BrambleQuillII().prune40(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift40() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("lower-bound", subject.prune40(2));
        assertEquals("upper-bound", subject.prune40(11));
    }

    @Test
    void classifiesWithinAndAboveDrift40() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("within", subject.prune40(2 + 1));
        assertEquals("above", subject.prune40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota41() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge41());
        }
        assertEquals(2, subject.depth41Count());
    }

    @Test
    void refusesOnceExhaustedQuota41() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 2; i++) {
            subject.gauge41();
        }
        assertFalse(subject.gauge41());
    }

    @Test
    void accumulatesBelowTheCapCapacity42() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals(1, subject.reconcile42(1));
        assertEquals(3, subject.reconcile42(2));
    }

    @Test
    void saturatesAtTheCapCapacity42() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.reconcile42(22);
        assertEquals(22, subject.reconcile42(5));
    }

    @Test
    void ignoresNegativeValuesCapacity42() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.reconcile42(3);
        assertEquals(3, subject.reconcile42(-2));
        assertEquals(3, subject.margin42Value());
    }

    @Test
    void rejectsZeroDenominatorDepth43() {
        BrambleQuillII subject = new BrambleQuillII();
        assertThrows(ArithmeticException.class, () -> subject.tally43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth43() {
        assertEquals(0.5, new BrambleQuillII().tally43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth43() {
        assertEquals(4.0, new BrambleQuillII().tally43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias44() {
        assertTrue(new BrambleQuillII().temper44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new BrambleQuillII().temper44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias44() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleQuillII().temper44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight45() {
        assertEquals("below", new BrambleQuillII().anneal45(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight45() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("lower-bound", subject.anneal45(3));
        assertEquals("upper-bound", subject.anneal45(10));
    }

    @Test
    void classifiesWithinAndAboveWeight45() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("within", subject.anneal45(3 + 1));
        assertEquals("above", subject.anneal45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin46() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper46());
        }
        assertEquals(3, subject.quota46Count());
    }

    @Test
    void refusesOnceExhaustedMargin46() {
        BrambleQuillII subject = new BrambleQuillII();
        for (int i = 0; i < 3; i++) {
            subject.temper46();
        }
        assertFalse(subject.temper46());
    }

    @Test
    void accumulatesBelowTheCapSpan47() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals(1, subject.prune47(1));
        assertEquals(3, subject.prune47(2));
    }

    @Test
    void saturatesAtTheCapSpan47() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.prune47(27);
        assertEquals(27, subject.prune47(5));
    }

    @Test
    void ignoresNegativeValuesSpan47() {
        BrambleQuillII subject = new BrambleQuillII();
        subject.prune47(3);
        assertEquals(3, subject.prune47(-2));
        assertEquals(3, subject.margin47Value());
    }

    @Test
    void rejectsZeroDenominatorSpan48() {
        BrambleQuillII subject = new BrambleQuillII();
        assertThrows(ArithmeticException.class, () -> subject.anneal48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan48() {
        assertEquals(0.5, new BrambleQuillII().anneal48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan48() {
        assertEquals(4.0, new BrambleQuillII().anneal48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold49() {
        assertTrue(new BrambleQuillII().brace49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new BrambleQuillII().brace49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold49() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleQuillII().brace49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset50() {
        assertEquals("below", new BrambleQuillII().tally50(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset50() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("lower-bound", subject.tally50(4));
        assertEquals("upper-bound", subject.tally50(9));
    }

    @Test
    void classifiesWithinAndAboveOffset50() {
        BrambleQuillII subject = new BrambleQuillII();
        assertEquals("within", subject.tally50(4 + 1));
        assertEquals("above", subject.tally50(9 + 1));
    }
}
