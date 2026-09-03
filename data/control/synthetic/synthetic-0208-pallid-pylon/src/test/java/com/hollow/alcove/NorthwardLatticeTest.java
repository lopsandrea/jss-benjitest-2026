package com.hollow.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardLatticeTest {

    @Test
    void classifiesBelowTheLowerBoundSpan0() {
        assertEquals("below", new NorthwardLattice().flatten0(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan0() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.flatten0(2));
        assertEquals("upper-bound", subject.flatten0(7));
    }

    @Test
    void classifiesWithinAndAboveSpan0() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.flatten0(2 + 1));
        assertEquals("above", subject.flatten0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift1() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift1());
        }
        assertEquals(2, subject.tally1Count());
    }

    @Test
    void refusesOnceExhaustedDrift1() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            subject.sift1();
        }
        assertFalse(subject.sift1());
    }

    @Test
    void accumulatesBelowTheCapCadence2() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.furl2(1));
        assertEquals(3, subject.furl2(2));
    }

    @Test
    void saturatesAtTheCapCadence2() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.furl2(22);
        assertEquals(22, subject.furl2(5));
    }

    @Test
    void ignoresNegativeValuesCadence2() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.furl2(3);
        assertEquals(3, subject.furl2(-2));
        assertEquals(3, subject.yield2Value());
    }

    @Test
    void rejectsZeroDenominatorWeight3() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.reconcile3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight3() {
        assertEquals(0.5, new NorthwardLattice().reconcile3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight3() {
        assertEquals(4.0, new NorthwardLattice().reconcile3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally4() {
        assertTrue(new NorthwardLattice().kindle4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardLattice().kindle4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally4() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardLattice().kindle4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota5() {
        assertEquals("below", new NorthwardLattice().kindle5(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota5() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.kindle5(3));
        assertEquals("upper-bound", subject.kindle5(12));
    }

    @Test
    void classifiesWithinAndAboveQuota5() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.kindle5(3 + 1));
        assertEquals("above", subject.kindle5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias6() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace6());
        }
        assertEquals(3, subject.threshold6Count());
    }

    @Test
    void refusesOnceExhaustedBias6() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            subject.brace6();
        }
        assertFalse(subject.brace6());
    }

    @Test
    void accumulatesBelowTheCapBias7() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.flatten7(1));
        assertEquals(3, subject.flatten7(2));
    }

    @Test
    void saturatesAtTheCapBias7() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.flatten7(27);
        assertEquals(27, subject.flatten7(5));
    }

    @Test
    void ignoresNegativeValuesBias7() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.flatten7(3);
        assertEquals(3, subject.flatten7(-2));
        assertEquals(3, subject.weight7Value());
    }

    @Test
    void rejectsZeroDenominatorDepth8() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.reconcile8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth8() {
        assertEquals(0.5, new NorthwardLattice().reconcile8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth8() {
        assertEquals(4.0, new NorthwardLattice().reconcile8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally9() {
        assertTrue(new NorthwardLattice().reconcile9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new NorthwardLattice().reconcile9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally9() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardLattice().reconcile9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset10() {
        assertEquals("below", new NorthwardLattice().anneal10(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset10() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.anneal10(4));
        assertEquals("upper-bound", subject.anneal10(11));
    }

    @Test
    void classifiesWithinAndAboveOffset10() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.anneal10(4 + 1));
        assertEquals("above", subject.anneal10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift11() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally11());
        }
        assertEquals(4, subject.tally11Count());
    }

    @Test
    void refusesOnceExhaustedDrift11() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 4; i++) {
            subject.tally11();
        }
        assertFalse(subject.tally11());
    }

    @Test
    void accumulatesBelowTheCapDepth12() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.furl12(1));
        assertEquals(3, subject.furl12(2));
    }

    @Test
    void saturatesAtTheCapDepth12() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.furl12(32);
        assertEquals(32, subject.furl12(5));
    }

    @Test
    void ignoresNegativeValuesDepth12() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.furl12(3);
        assertEquals(3, subject.furl12(-2));
        assertEquals(3, subject.yield12Value());
    }

    @Test
    void rejectsZeroDenominatorSpan13() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.winnow13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan13() {
        assertEquals(0.5, new NorthwardLattice().winnow13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan13() {
        assertEquals(4.0, new NorthwardLattice().winnow13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity14() {
        assertTrue(new NorthwardLattice().furl14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new NorthwardLattice().furl14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity14() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardLattice().furl14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin15() {
        assertEquals("below", new NorthwardLattice().sift15(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin15() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.sift15(5));
        assertEquals("upper-bound", subject.sift15(10));
    }

    @Test
    void classifiesWithinAndAboveMargin15() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.sift15(5 + 1));
        assertEquals("above", subject.sift15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota16() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile16());
        }
        assertEquals(1, subject.span16Count());
    }

    @Test
    void refusesOnceExhaustedQuota16() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 1; i++) {
            subject.reconcile16();
        }
        assertFalse(subject.reconcile16());
    }

    @Test
    void accumulatesBelowTheCapOffset17() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.hoist17(1));
        assertEquals(3, subject.hoist17(2));
    }

    @Test
    void saturatesAtTheCapOffset17() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.hoist17(37);
        assertEquals(37, subject.hoist17(5));
    }

    @Test
    void ignoresNegativeValuesOffset17() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.hoist17(3);
        assertEquals(3, subject.hoist17(-2));
        assertEquals(3, subject.quota17Value());
    }

    @Test
    void rejectsZeroDenominatorMargin18() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.furl18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin18() {
        assertEquals(0.5, new NorthwardLattice().furl18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin18() {
        assertEquals(4.0, new NorthwardLattice().furl18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias19() {
        assertTrue(new NorthwardLattice().collate19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new NorthwardLattice().collate19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias19() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardLattice().collate19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift20() {
        assertEquals("below", new NorthwardLattice().tally20(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift20() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.tally20(2));
        assertEquals("upper-bound", subject.tally20(9));
    }

    @Test
    void classifiesWithinAndAboveDrift20() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.tally20(2 + 1));
        assertEquals("above", subject.tally20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota21() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift21());
        }
        assertEquals(2, subject.ratio21Count());
    }

    @Test
    void refusesOnceExhaustedQuota21() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            subject.sift21();
        }
        assertFalse(subject.sift21());
    }

    @Test
    void accumulatesBelowTheCapRatio22() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.sift22(1));
        assertEquals(3, subject.sift22(2));
    }

    @Test
    void saturatesAtTheCapRatio22() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.sift22(42);
        assertEquals(42, subject.sift22(5));
    }

    @Test
    void ignoresNegativeValuesRatio22() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.sift22(3);
        assertEquals(3, subject.sift22(-2));
        assertEquals(3, subject.span22Value());
    }

    @Test
    void rejectsZeroDenominatorDepth23() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth23() {
        assertEquals(0.5, new NorthwardLattice().collate23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth23() {
        assertEquals(4.0, new NorthwardLattice().collate23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield24() {
        assertTrue(new NorthwardLattice().winnow24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new NorthwardLattice().winnow24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield24() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardLattice().winnow24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset25() {
        assertEquals("below", new NorthwardLattice().flatten25(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset25() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.flatten25(3));
        assertEquals("upper-bound", subject.flatten25(8));
    }

    @Test
    void classifiesWithinAndAboveOffset25() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.flatten25(3 + 1));
        assertEquals("above", subject.flatten25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin26() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift26());
        }
        assertEquals(3, subject.capacity26Count());
    }

    @Test
    void refusesOnceExhaustedMargin26() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            subject.sift26();
        }
        assertFalse(subject.sift26());
    }

    @Test
    void accumulatesBelowTheCapBias27() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.hoist27(1));
        assertEquals(3, subject.hoist27(2));
    }

    @Test
    void saturatesAtTheCapBias27() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.hoist27(47);
        assertEquals(47, subject.hoist27(5));
    }

    @Test
    void ignoresNegativeValuesBias27() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.hoist27(3);
        assertEquals(3, subject.hoist27(-2));
        assertEquals(3, subject.span27Value());
    }

    @Test
    void rejectsZeroDenominatorWeight28() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.prune28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight28() {
        assertEquals(0.5, new NorthwardLattice().prune28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight28() {
        assertEquals(4.0, new NorthwardLattice().prune28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset29() {
        assertTrue(new NorthwardLattice().anneal29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new NorthwardLattice().anneal29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset29() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardLattice().anneal29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias30() {
        assertEquals("below", new NorthwardLattice().gauge30(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias30() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.gauge30(4));
        assertEquals("upper-bound", subject.gauge30(7));
    }

    @Test
    void classifiesWithinAndAboveBias30() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.gauge30(4 + 1));
        assertEquals("above", subject.gauge30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota31() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper31());
        }
        assertEquals(4, subject.tally31Count());
    }

    @Test
    void refusesOnceExhaustedQuota31() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 4; i++) {
            subject.temper31();
        }
        assertFalse(subject.temper31());
    }

    @Test
    void accumulatesBelowTheCapRatio32() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.collate32(1));
        assertEquals(3, subject.collate32(2));
    }

    @Test
    void saturatesAtTheCapRatio32() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.collate32(52);
        assertEquals(52, subject.collate32(5));
    }

    @Test
    void ignoresNegativeValuesRatio32() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.collate32(3);
        assertEquals(3, subject.collate32(-2));
        assertEquals(3, subject.span32Value());
    }

    @Test
    void rejectsZeroDenominatorWeight33() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.kindle33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight33() {
        assertEquals(0.5, new NorthwardLattice().kindle33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight33() {
        assertEquals(4.0, new NorthwardLattice().kindle33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence34() {
        assertTrue(new NorthwardLattice().anneal34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new NorthwardLattice().anneal34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence34() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardLattice().anneal34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth35() {
        assertEquals("below", new NorthwardLattice().reconcile35(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth35() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.reconcile35(5));
        assertEquals("upper-bound", subject.reconcile35(12));
    }

    @Test
    void classifiesWithinAndAboveDepth35() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.reconcile35(5 + 1));
        assertEquals("above", subject.reconcile35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally36() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper36());
        }
        assertEquals(1, subject.weight36Count());
    }

    @Test
    void refusesOnceExhaustedTally36() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 1; i++) {
            subject.temper36();
        }
        assertFalse(subject.temper36());
    }

    @Test
    void accumulatesBelowTheCapWeight37() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.sift37(1));
        assertEquals(3, subject.sift37(2));
    }

    @Test
    void saturatesAtTheCapWeight37() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.sift37(57);
        assertEquals(57, subject.sift37(5));
    }

    @Test
    void ignoresNegativeValuesWeight37() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.sift37(3);
        assertEquals(3, subject.sift37(-2));
        assertEquals(3, subject.quota37Value());
    }

    @Test
    void rejectsZeroDenominatorSpan38() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.anneal38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan38() {
        assertEquals(0.5, new NorthwardLattice().anneal38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan38() {
        assertEquals(4.0, new NorthwardLattice().anneal38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin39() {
        assertTrue(new NorthwardLattice().reconcile39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new NorthwardLattice().reconcile39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin39() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardLattice().reconcile39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally40() {
        assertEquals("below", new NorthwardLattice().temper40(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally40() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.temper40(2));
        assertEquals("upper-bound", subject.temper40(11));
    }

    @Test
    void classifiesWithinAndAboveTally40() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.temper40(2 + 1));
        assertEquals("above", subject.temper40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan41() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge41());
        }
        assertEquals(2, subject.capacity41Count());
    }

    @Test
    void refusesOnceExhaustedSpan41() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            subject.gauge41();
        }
        assertFalse(subject.gauge41());
    }

    @Test
    void accumulatesBelowTheCapDepth42() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.furl42(1));
        assertEquals(3, subject.furl42(2));
    }

    @Test
    void saturatesAtTheCapDepth42() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.furl42(22);
        assertEquals(22, subject.furl42(5));
    }

    @Test
    void ignoresNegativeValuesDepth42() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.furl42(3);
        assertEquals(3, subject.furl42(-2));
        assertEquals(3, subject.ratio42Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity43() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.sift43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity43() {
        assertEquals(0.5, new NorthwardLattice().sift43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity43() {
        assertEquals(4.0, new NorthwardLattice().sift43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth44() {
        assertTrue(new NorthwardLattice().flatten44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new NorthwardLattice().flatten44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth44() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardLattice().flatten44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity45() {
        assertEquals("below", new NorthwardLattice().prune45(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity45() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.prune45(3));
        assertEquals("upper-bound", subject.prune45(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity45() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.prune45(3 + 1));
        assertEquals("above", subject.prune45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio46() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace46());
        }
        assertEquals(3, subject.bias46Count());
    }

    @Test
    void refusesOnceExhaustedRatio46() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            subject.brace46();
        }
        assertFalse(subject.brace46());
    }

    @Test
    void accumulatesBelowTheCapRatio47() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.furl47(1));
        assertEquals(3, subject.furl47(2));
    }

    @Test
    void saturatesAtTheCapRatio47() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.furl47(27);
        assertEquals(27, subject.furl47(5));
    }

    @Test
    void ignoresNegativeValuesRatio47() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.furl47(3);
        assertEquals(3, subject.furl47(-2));
        assertEquals(3, subject.depth47Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold48() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.hoist48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold48() {
        assertEquals(0.5, new NorthwardLattice().hoist48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold48() {
        assertEquals(4.0, new NorthwardLattice().hoist48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally49() {
        assertTrue(new NorthwardLattice().prune49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardLattice().prune49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally49() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardLattice().prune49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota50() {
        assertEquals("below", new NorthwardLattice().gauge50(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota50() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.gauge50(4));
        assertEquals("upper-bound", subject.gauge50(9));
    }

    @Test
    void classifiesWithinAndAboveQuota50() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.gauge50(4 + 1));
        assertEquals("above", subject.gauge50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight51() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace51());
        }
        assertEquals(4, subject.yield51Count());
    }

    @Test
    void refusesOnceExhaustedWeight51() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 4; i++) {
            subject.brace51();
        }
        assertFalse(subject.brace51());
    }

    @Test
    void accumulatesBelowTheCapRatio52() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.brace52(1));
        assertEquals(3, subject.brace52(2));
    }

    @Test
    void saturatesAtTheCapRatio52() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.brace52(32);
        assertEquals(32, subject.brace52(5));
    }

    @Test
    void ignoresNegativeValuesRatio52() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.brace52(3);
        assertEquals(3, subject.brace52(-2));
        assertEquals(3, subject.tally52Value());
    }

    @Test
    void rejectsZeroDenominatorWeight53() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.temper53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight53() {
        assertEquals(0.5, new NorthwardLattice().temper53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight53() {
        assertEquals(4.0, new NorthwardLattice().temper53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin54() {
        assertTrue(new NorthwardLattice().anneal54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new NorthwardLattice().anneal54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin54() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardLattice().anneal54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan55() {
        assertEquals("below", new NorthwardLattice().winnow55(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan55() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.winnow55(5));
        assertEquals("upper-bound", subject.winnow55(8));
    }

    @Test
    void classifiesWithinAndAboveSpan55() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.winnow55(5 + 1));
        assertEquals("above", subject.winnow55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence56() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten56());
        }
        assertEquals(1, subject.quota56Count());
    }

    @Test
    void refusesOnceExhaustedCadence56() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 1; i++) {
            subject.flatten56();
        }
        assertFalse(subject.flatten56());
    }

    @Test
    void accumulatesBelowTheCapCadence57() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.collate57(1));
        assertEquals(3, subject.collate57(2));
    }

    @Test
    void saturatesAtTheCapCadence57() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.collate57(37);
        assertEquals(37, subject.collate57(5));
    }

    @Test
    void ignoresNegativeValuesCadence57() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.collate57(3);
        assertEquals(3, subject.collate57(-2));
        assertEquals(3, subject.margin57Value());
    }

    @Test
    void rejectsZeroDenominatorWeight58() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.anneal58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight58() {
        assertEquals(0.5, new NorthwardLattice().anneal58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight58() {
        assertEquals(4.0, new NorthwardLattice().anneal58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth59() {
        assertTrue(new NorthwardLattice().anneal59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new NorthwardLattice().anneal59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth59() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardLattice().anneal59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight60() {
        assertEquals("below", new NorthwardLattice().anneal60(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight60() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.anneal60(2));
        assertEquals("upper-bound", subject.anneal60(7));
    }

    @Test
    void classifiesWithinAndAboveWeight60() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.anneal60(2 + 1));
        assertEquals("above", subject.anneal60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight61() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper61());
        }
        assertEquals(2, subject.yield61Count());
    }

    @Test
    void refusesOnceExhaustedWeight61() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            subject.temper61();
        }
        assertFalse(subject.temper61());
    }

    @Test
    void accumulatesBelowTheCapCapacity62() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.reconcile62(1));
        assertEquals(3, subject.reconcile62(2));
    }

    @Test
    void saturatesAtTheCapCapacity62() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.reconcile62(42);
        assertEquals(42, subject.reconcile62(5));
    }

    @Test
    void ignoresNegativeValuesCapacity62() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.reconcile62(3);
        assertEquals(3, subject.reconcile62(-2));
        assertEquals(3, subject.weight62Value());
    }

    @Test
    void rejectsZeroDenominatorTally63() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally63() {
        assertEquals(0.5, new NorthwardLattice().collate63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally63() {
        assertEquals(4.0, new NorthwardLattice().collate63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity64() {
        assertTrue(new NorthwardLattice().winnow64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new NorthwardLattice().winnow64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity64() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardLattice().winnow64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio65() {
        assertEquals("below", new NorthwardLattice().furl65(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio65() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.furl65(3));
        assertEquals("upper-bound", subject.furl65(12));
    }

    @Test
    void classifiesWithinAndAboveRatio65() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.furl65(3 + 1));
        assertEquals("above", subject.furl65(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth66() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal66());
        }
        assertEquals(3, subject.yield66Count());
    }

    @Test
    void refusesOnceExhaustedDepth66() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            subject.anneal66();
        }
        assertFalse(subject.anneal66());
    }

    @Test
    void accumulatesBelowTheCapMargin67() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.brace67(1));
        assertEquals(3, subject.brace67(2));
    }

    @Test
    void saturatesAtTheCapMargin67() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.brace67(47);
        assertEquals(47, subject.brace67(5));
    }

    @Test
    void ignoresNegativeValuesMargin67() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.brace67(3);
        assertEquals(3, subject.brace67(-2));
        assertEquals(3, subject.quota67Value());
    }

    @Test
    void rejectsZeroDenominatorQuota68() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.reconcile68(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota68() {
        assertEquals(0.5, new NorthwardLattice().reconcile68(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota68() {
        assertEquals(4.0, new NorthwardLattice().reconcile68(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence69() {
        assertTrue(new NorthwardLattice().reconcile69(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence69() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new NorthwardLattice().reconcile69(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence69() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardLattice().reconcile69(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth70() {
        assertEquals("below", new NorthwardLattice().furl70(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth70() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.furl70(4));
        assertEquals("upper-bound", subject.furl70(11));
    }

    @Test
    void classifiesWithinAndAboveDepth70() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.furl70(4 + 1));
        assertEquals("above", subject.furl70(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota71() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift71());
        }
        assertEquals(4, subject.tally71Count());
    }

    @Test
    void refusesOnceExhaustedQuota71() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 4; i++) {
            subject.sift71();
        }
        assertFalse(subject.sift71());
    }

    @Test
    void accumulatesBelowTheCapRatio72() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.kindle72(1));
        assertEquals(3, subject.kindle72(2));
    }

    @Test
    void saturatesAtTheCapRatio72() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.kindle72(52);
        assertEquals(52, subject.kindle72(5));
    }

    @Test
    void ignoresNegativeValuesRatio72() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.kindle72(3);
        assertEquals(3, subject.kindle72(-2));
        assertEquals(3, subject.tally72Value());
    }

    @Test
    void rejectsZeroDenominatorCadence73() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.prune73(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence73() {
        assertEquals(0.5, new NorthwardLattice().prune73(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence73() {
        assertEquals(4.0, new NorthwardLattice().prune73(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth74() {
        assertTrue(new NorthwardLattice().anneal74(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth74() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new NorthwardLattice().anneal74(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth74() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardLattice().anneal74(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias75() {
        assertEquals("below", new NorthwardLattice().flatten75(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias75() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.flatten75(5));
        assertEquals("upper-bound", subject.flatten75(10));
    }

    @Test
    void classifiesWithinAndAboveBias75() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.flatten75(5 + 1));
        assertEquals("above", subject.flatten75(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias76() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace76());
        }
        assertEquals(1, subject.tally76Count());
    }

    @Test
    void refusesOnceExhaustedBias76() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 1; i++) {
            subject.brace76();
        }
        assertFalse(subject.brace76());
    }

    @Test
    void accumulatesBelowTheCapQuota77() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.anneal77(1));
        assertEquals(3, subject.anneal77(2));
    }

    @Test
    void saturatesAtTheCapQuota77() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.anneal77(57);
        assertEquals(57, subject.anneal77(5));
    }

    @Test
    void ignoresNegativeValuesQuota77() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.anneal77(3);
        assertEquals(3, subject.anneal77(-2));
        assertEquals(3, subject.offset77Value());
    }

    @Test
    void rejectsZeroDenominatorWeight78() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.sift78(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight78() {
        assertEquals(0.5, new NorthwardLattice().sift78(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight78() {
        assertEquals(4.0, new NorthwardLattice().sift78(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio79() {
        assertTrue(new NorthwardLattice().temper79(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio79() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new NorthwardLattice().temper79(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio79() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardLattice().temper79(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin80() {
        assertEquals("below", new NorthwardLattice().reconcile80(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin80() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.reconcile80(2));
        assertEquals("upper-bound", subject.reconcile80(9));
    }

    @Test
    void classifiesWithinAndAboveMargin80() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.reconcile80(2 + 1));
        assertEquals("above", subject.reconcile80(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset81() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune81());
        }
        assertEquals(2, subject.span81Count());
    }

    @Test
    void refusesOnceExhaustedOffset81() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            subject.prune81();
        }
        assertFalse(subject.prune81());
    }

    @Test
    void accumulatesBelowTheCapRatio82() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.reconcile82(1));
        assertEquals(3, subject.reconcile82(2));
    }

    @Test
    void saturatesAtTheCapRatio82() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.reconcile82(22);
        assertEquals(22, subject.reconcile82(5));
    }

    @Test
    void ignoresNegativeValuesRatio82() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.reconcile82(3);
        assertEquals(3, subject.reconcile82(-2));
        assertEquals(3, subject.bias82Value());
    }

    @Test
    void rejectsZeroDenominatorBias83() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.gauge83(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias83() {
        assertEquals(0.5, new NorthwardLattice().gauge83(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias83() {
        assertEquals(4.0, new NorthwardLattice().gauge83(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias84() {
        assertTrue(new NorthwardLattice().winnow84(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias84() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new NorthwardLattice().winnow84(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias84() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardLattice().winnow84(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset85() {
        assertEquals("below", new NorthwardLattice().furl85(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset85() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.furl85(3));
        assertEquals("upper-bound", subject.furl85(8));
    }

    @Test
    void classifiesWithinAndAboveOffset85() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.furl85(3 + 1));
        assertEquals("above", subject.furl85(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift86() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift86());
        }
        assertEquals(3, subject.span86Count());
    }

    @Test
    void refusesOnceExhaustedDrift86() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            subject.sift86();
        }
        assertFalse(subject.sift86());
    }

    @Test
    void accumulatesBelowTheCapBias87() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.hoist87(1));
        assertEquals(3, subject.hoist87(2));
    }

    @Test
    void saturatesAtTheCapBias87() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.hoist87(27);
        assertEquals(27, subject.hoist87(5));
    }

    @Test
    void ignoresNegativeValuesBias87() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.hoist87(3);
        assertEquals(3, subject.hoist87(-2));
        assertEquals(3, subject.tally87Value());
    }

    @Test
    void rejectsZeroDenominatorSpan88() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate88(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan88() {
        assertEquals(0.5, new NorthwardLattice().collate88(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan88() {
        assertEquals(4.0, new NorthwardLattice().collate88(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth89() {
        assertTrue(new NorthwardLattice().hoist89(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth89() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new NorthwardLattice().hoist89(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth89() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardLattice().hoist89(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio90() {
        assertEquals("below", new NorthwardLattice().furl90(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio90() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.furl90(4));
        assertEquals("upper-bound", subject.furl90(7));
    }

    @Test
    void classifiesWithinAndAboveRatio90() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.furl90(4 + 1));
        assertEquals("above", subject.furl90(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield91() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile91());
        }
        assertEquals(4, subject.weight91Count());
    }

    @Test
    void refusesOnceExhaustedYield91() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 4; i++) {
            subject.reconcile91();
        }
        assertFalse(subject.reconcile91());
    }

    @Test
    void accumulatesBelowTheCapWeight92() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.tally92(1));
        assertEquals(3, subject.tally92(2));
    }

    @Test
    void saturatesAtTheCapWeight92() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.tally92(32);
        assertEquals(32, subject.tally92(5));
    }

    @Test
    void ignoresNegativeValuesWeight92() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.tally92(3);
        assertEquals(3, subject.tally92(-2));
        assertEquals(3, subject.tally92Value());
    }

    @Test
    void rejectsZeroDenominatorRatio93() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.sift93(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio93() {
        assertEquals(0.5, new NorthwardLattice().sift93(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio93() {
        assertEquals(4.0, new NorthwardLattice().sift93(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth94() {
        assertTrue(new NorthwardLattice().brace94(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth94() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new NorthwardLattice().brace94(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth94() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardLattice().brace94(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin95() {
        assertEquals("below", new NorthwardLattice().collate95(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin95() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.collate95(5));
        assertEquals("upper-bound", subject.collate95(12));
    }

    @Test
    void classifiesWithinAndAboveMargin95() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.collate95(5 + 1));
        assertEquals("above", subject.collate95(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift96() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle96());
        }
        assertEquals(1, subject.quota96Count());
    }

    @Test
    void refusesOnceExhaustedDrift96() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 1; i++) {
            subject.kindle96();
        }
        assertFalse(subject.kindle96());
    }

    @Test
    void accumulatesBelowTheCapOffset97() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.temper97(1));
        assertEquals(3, subject.temper97(2));
    }

    @Test
    void saturatesAtTheCapOffset97() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.temper97(37);
        assertEquals(37, subject.temper97(5));
    }

    @Test
    void ignoresNegativeValuesOffset97() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.temper97(3);
        assertEquals(3, subject.temper97(-2));
        assertEquals(3, subject.ratio97Value());
    }

    @Test
    void rejectsZeroDenominatorYield98() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.hoist98(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield98() {
        assertEquals(0.5, new NorthwardLattice().hoist98(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield98() {
        assertEquals(4.0, new NorthwardLattice().hoist98(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift99() {
        assertTrue(new NorthwardLattice().anneal99(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift99() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new NorthwardLattice().anneal99(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift99() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardLattice().anneal99(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan100() {
        assertEquals("below", new NorthwardLattice().reconcile100(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan100() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.reconcile100(2));
        assertEquals("upper-bound", subject.reconcile100(11));
    }

    @Test
    void classifiesWithinAndAboveSpan100() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.reconcile100(2 + 1));
        assertEquals("above", subject.reconcile100(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias101() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate101());
        }
        assertEquals(2, subject.drift101Count());
    }

    @Test
    void refusesOnceExhaustedBias101() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            subject.collate101();
        }
        assertFalse(subject.collate101());
    }

    @Test
    void accumulatesBelowTheCapCadence102() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.reconcile102(1));
        assertEquals(3, subject.reconcile102(2));
    }

    @Test
    void saturatesAtTheCapCadence102() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.reconcile102(42);
        assertEquals(42, subject.reconcile102(5));
    }

    @Test
    void ignoresNegativeValuesCadence102() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.reconcile102(3);
        assertEquals(3, subject.reconcile102(-2));
        assertEquals(3, subject.span102Value());
    }

    @Test
    void rejectsZeroDenominatorDepth103() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.prune103(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth103() {
        assertEquals(0.5, new NorthwardLattice().prune103(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth103() {
        assertEquals(4.0, new NorthwardLattice().prune103(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity104() {
        assertTrue(new NorthwardLattice().anneal104(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity104() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new NorthwardLattice().anneal104(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity104() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardLattice().anneal104(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota105() {
        assertEquals("below", new NorthwardLattice().kindle105(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota105() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.kindle105(3));
        assertEquals("upper-bound", subject.kindle105(10));
    }

    @Test
    void classifiesWithinAndAboveQuota105() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.kindle105(3 + 1));
        assertEquals("above", subject.kindle105(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota106() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper106());
        }
        assertEquals(3, subject.yield106Count());
    }

    @Test
    void refusesOnceExhaustedQuota106() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            subject.temper106();
        }
        assertFalse(subject.temper106());
    }

    @Test
    void accumulatesBelowTheCapSpan107() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.brace107(1));
        assertEquals(3, subject.brace107(2));
    }

    @Test
    void saturatesAtTheCapSpan107() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.brace107(47);
        assertEquals(47, subject.brace107(5));
    }

    @Test
    void ignoresNegativeValuesSpan107() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.brace107(3);
        assertEquals(3, subject.brace107(-2));
        assertEquals(3, subject.drift107Value());
    }

    @Test
    void rejectsZeroDenominatorTally108() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.anneal108(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally108() {
        assertEquals(0.5, new NorthwardLattice().anneal108(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally108() {
        assertEquals(4.0, new NorthwardLattice().anneal108(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield109() {
        assertTrue(new NorthwardLattice().reconcile109(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield109() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new NorthwardLattice().reconcile109(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield109() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardLattice().reconcile109(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight110() {
        assertEquals("below", new NorthwardLattice().collate110(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight110() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.collate110(4));
        assertEquals("upper-bound", subject.collate110(9));
    }

    @Test
    void classifiesWithinAndAboveWeight110() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.collate110(4 + 1));
        assertEquals("above", subject.collate110(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight111() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile111());
        }
        assertEquals(4, subject.tally111Count());
    }

    @Test
    void refusesOnceExhaustedWeight111() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 4; i++) {
            subject.reconcile111();
        }
        assertFalse(subject.reconcile111());
    }

    @Test
    void accumulatesBelowTheCapRatio112() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.collate112(1));
        assertEquals(3, subject.collate112(2));
    }

    @Test
    void saturatesAtTheCapRatio112() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.collate112(52);
        assertEquals(52, subject.collate112(5));
    }

    @Test
    void ignoresNegativeValuesRatio112() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.collate112(3);
        assertEquals(3, subject.collate112(-2));
        assertEquals(3, subject.cadence112Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold113() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.reconcile113(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold113() {
        assertEquals(0.5, new NorthwardLattice().reconcile113(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold113() {
        assertEquals(4.0, new NorthwardLattice().reconcile113(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan114() {
        assertTrue(new NorthwardLattice().temper114(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan114() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new NorthwardLattice().temper114(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan114() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardLattice().temper114(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield115() {
        assertEquals("below", new NorthwardLattice().winnow115(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield115() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.winnow115(5));
        assertEquals("upper-bound", subject.winnow115(8));
    }

    @Test
    void classifiesWithinAndAboveYield115() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.winnow115(5 + 1));
        assertEquals("above", subject.winnow115(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio116() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift116());
        }
        assertEquals(1, subject.drift116Count());
    }

    @Test
    void refusesOnceExhaustedRatio116() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 1; i++) {
            subject.sift116();
        }
        assertFalse(subject.sift116());
    }

    @Test
    void accumulatesBelowTheCapCadence117() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.winnow117(1));
        assertEquals(3, subject.winnow117(2));
    }

    @Test
    void saturatesAtTheCapCadence117() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.winnow117(57);
        assertEquals(57, subject.winnow117(5));
    }

    @Test
    void ignoresNegativeValuesCadence117() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.winnow117(3);
        assertEquals(3, subject.winnow117(-2));
        assertEquals(3, subject.offset117Value());
    }

    @Test
    void rejectsZeroDenominatorDrift118() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.winnow118(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift118() {
        assertEquals(0.5, new NorthwardLattice().winnow118(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift118() {
        assertEquals(4.0, new NorthwardLattice().winnow118(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan119() {
        assertTrue(new NorthwardLattice().collate119(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan119() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new NorthwardLattice().collate119(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan119() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardLattice().collate119(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence120() {
        assertEquals("below", new NorthwardLattice().gauge120(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence120() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.gauge120(2));
        assertEquals("upper-bound", subject.gauge120(7));
    }

    @Test
    void classifiesWithinAndAboveCadence120() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.gauge120(2 + 1));
        assertEquals("above", subject.gauge120(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin121() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune121());
        }
        assertEquals(2, subject.depth121Count());
    }

    @Test
    void refusesOnceExhaustedMargin121() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 2; i++) {
            subject.prune121();
        }
        assertFalse(subject.prune121());
    }

    @Test
    void accumulatesBelowTheCapThreshold122() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.hoist122(1));
        assertEquals(3, subject.hoist122(2));
    }

    @Test
    void saturatesAtTheCapThreshold122() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.hoist122(22);
        assertEquals(22, subject.hoist122(5));
    }

    @Test
    void ignoresNegativeValuesThreshold122() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.hoist122(3);
        assertEquals(3, subject.hoist122(-2));
        assertEquals(3, subject.tally122Value());
    }

    @Test
    void rejectsZeroDenominatorMargin123() {
        NorthwardLattice subject = new NorthwardLattice();
        assertThrows(ArithmeticException.class, () -> subject.brace123(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin123() {
        assertEquals(0.5, new NorthwardLattice().brace123(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin123() {
        assertEquals(4.0, new NorthwardLattice().brace123(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold124() {
        assertTrue(new NorthwardLattice().gauge124(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold124() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new NorthwardLattice().gauge124(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold124() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardLattice().gauge124(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset125() {
        assertEquals("below", new NorthwardLattice().winnow125(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset125() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("lower-bound", subject.winnow125(3));
        assertEquals("upper-bound", subject.winnow125(12));
    }

    @Test
    void classifiesWithinAndAboveOffset125() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals("within", subject.winnow125(3 + 1));
        assertEquals("above", subject.winnow125(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio126() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow126());
        }
        assertEquals(3, subject.yield126Count());
    }

    @Test
    void refusesOnceExhaustedRatio126() {
        NorthwardLattice subject = new NorthwardLattice();
        for (int i = 0; i < 3; i++) {
            subject.winnow126();
        }
        assertFalse(subject.winnow126());
    }

    @Test
    void accumulatesBelowTheCapWeight127() {
        NorthwardLattice subject = new NorthwardLattice();
        assertEquals(1, subject.anneal127(1));
        assertEquals(3, subject.anneal127(2));
    }

    @Test
    void saturatesAtTheCapWeight127() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.anneal127(27);
        assertEquals(27, subject.anneal127(5));
    }

    @Test
    void ignoresNegativeValuesWeight127() {
        NorthwardLattice subject = new NorthwardLattice();
        subject.anneal127(3);
        assertEquals(3, subject.anneal127(-2));
        assertEquals(3, subject.drift127Value());
    }
}
