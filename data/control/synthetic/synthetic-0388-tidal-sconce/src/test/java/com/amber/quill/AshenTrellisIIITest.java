package com.amber.quill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenTrellisIIITest {

    @Test
    void classifiesBelowTheLowerBoundTally0() {
        assertEquals("below", new AshenTrellisIII().reconcile0(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally0() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("lower-bound", subject.reconcile0(2));
        assertEquals("upper-bound", subject.reconcile0(7));
    }

    @Test
    void classifiesWithinAndAboveTally0() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("within", subject.reconcile0(2 + 1));
        assertEquals("above", subject.reconcile0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias1() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune1());
        }
        assertEquals(2, subject.depth1Count());
    }

    @Test
    void refusesOnceExhaustedBias1() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 2; i++) {
            subject.prune1();
        }
        assertFalse(subject.prune1());
    }

    @Test
    void accumulatesBelowTheCapCapacity2() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals(1, subject.flatten2(1));
        assertEquals(3, subject.flatten2(2));
    }

    @Test
    void saturatesAtTheCapCapacity2() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.flatten2(22);
        assertEquals(22, subject.flatten2(5));
    }

    @Test
    void ignoresNegativeValuesCapacity2() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.flatten2(3);
        assertEquals(3, subject.flatten2(-2));
        assertEquals(3, subject.span2Value());
    }

    @Test
    void rejectsZeroDenominatorBias3() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias3() {
        assertEquals(0.5, new AshenTrellisIII().anneal3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias3() {
        assertEquals(4.0, new AshenTrellisIII().anneal3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset4() {
        assertTrue(new AshenTrellisIII().brace4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AshenTrellisIII().brace4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset4() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenTrellisIII().brace4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin5() {
        assertEquals("below", new AshenTrellisIII().winnow5(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin5() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("lower-bound", subject.winnow5(3));
        assertEquals("upper-bound", subject.winnow5(12));
    }

    @Test
    void classifiesWithinAndAboveMargin5() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("within", subject.winnow5(3 + 1));
        assertEquals("above", subject.winnow5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield6() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally6());
        }
        assertEquals(3, subject.cadence6Count());
    }

    @Test
    void refusesOnceExhaustedYield6() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 3; i++) {
            subject.tally6();
        }
        assertFalse(subject.tally6());
    }

    @Test
    void accumulatesBelowTheCapOffset7() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals(1, subject.winnow7(1));
        assertEquals(3, subject.winnow7(2));
    }

    @Test
    void saturatesAtTheCapOffset7() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.winnow7(27);
        assertEquals(27, subject.winnow7(5));
    }

    @Test
    void ignoresNegativeValuesOffset7() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.winnow7(3);
        assertEquals(3, subject.winnow7(-2));
        assertEquals(3, subject.quota7Value());
    }

    @Test
    void rejectsZeroDenominatorRatio8() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio8() {
        assertEquals(0.5, new AshenTrellisIII().gauge8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio8() {
        assertEquals(4.0, new AshenTrellisIII().gauge8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota9() {
        assertTrue(new AshenTrellisIII().kindle9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AshenTrellisIII().kindle9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota9() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenTrellisIII().kindle9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity10() {
        assertEquals("below", new AshenTrellisIII().sift10(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity10() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("lower-bound", subject.sift10(4));
        assertEquals("upper-bound", subject.sift10(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity10() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("within", subject.sift10(4 + 1));
        assertEquals("above", subject.sift10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset11() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune11());
        }
        assertEquals(4, subject.margin11Count());
    }

    @Test
    void refusesOnceExhaustedOffset11() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 4; i++) {
            subject.prune11();
        }
        assertFalse(subject.prune11());
    }

    @Test
    void accumulatesBelowTheCapMargin12() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals(1, subject.gauge12(1));
        assertEquals(3, subject.gauge12(2));
    }

    @Test
    void saturatesAtTheCapMargin12() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.gauge12(32);
        assertEquals(32, subject.gauge12(5));
    }

    @Test
    void ignoresNegativeValuesMargin12() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.gauge12(3);
        assertEquals(3, subject.gauge12(-2));
        assertEquals(3, subject.quota12Value());
    }

    @Test
    void rejectsZeroDenominatorMargin13() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin13() {
        assertEquals(0.5, new AshenTrellisIII().anneal13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin13() {
        assertEquals(4.0, new AshenTrellisIII().anneal13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence14() {
        assertTrue(new AshenTrellisIII().temper14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AshenTrellisIII().temper14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence14() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenTrellisIII().temper14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota15() {
        assertEquals("below", new AshenTrellisIII().winnow15(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota15() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("lower-bound", subject.winnow15(5));
        assertEquals("upper-bound", subject.winnow15(10));
    }

    @Test
    void classifiesWithinAndAboveQuota15() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("within", subject.winnow15(5 + 1));
        assertEquals("above", subject.winnow15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota16() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle16());
        }
        assertEquals(1, subject.drift16Count());
    }

    @Test
    void refusesOnceExhaustedQuota16() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 1; i++) {
            subject.kindle16();
        }
        assertFalse(subject.kindle16());
    }

    @Test
    void accumulatesBelowTheCapRatio17() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals(1, subject.winnow17(1));
        assertEquals(3, subject.winnow17(2));
    }

    @Test
    void saturatesAtTheCapRatio17() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.winnow17(37);
        assertEquals(37, subject.winnow17(5));
    }

    @Test
    void ignoresNegativeValuesRatio17() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.winnow17(3);
        assertEquals(3, subject.winnow17(-2));
        assertEquals(3, subject.margin17Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold18() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertThrows(ArithmeticException.class, () -> subject.sift18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold18() {
        assertEquals(0.5, new AshenTrellisIII().sift18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold18() {
        assertEquals(4.0, new AshenTrellisIII().sift18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias19() {
        assertTrue(new AshenTrellisIII().reconcile19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new AshenTrellisIII().reconcile19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias19() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenTrellisIII().reconcile19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold20() {
        assertEquals("below", new AshenTrellisIII().prune20(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold20() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("lower-bound", subject.prune20(2));
        assertEquals("upper-bound", subject.prune20(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold20() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("within", subject.prune20(2 + 1));
        assertEquals("above", subject.prune20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan21() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge21());
        }
        assertEquals(2, subject.offset21Count());
    }

    @Test
    void refusesOnceExhaustedSpan21() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 2; i++) {
            subject.gauge21();
        }
        assertFalse(subject.gauge21());
    }

    @Test
    void accumulatesBelowTheCapQuota22() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals(1, subject.anneal22(1));
        assertEquals(3, subject.anneal22(2));
    }

    @Test
    void saturatesAtTheCapQuota22() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.anneal22(42);
        assertEquals(42, subject.anneal22(5));
    }

    @Test
    void ignoresNegativeValuesQuota22() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.anneal22(3);
        assertEquals(3, subject.anneal22(-2));
        assertEquals(3, subject.cadence22Value());
    }

    @Test
    void rejectsZeroDenominatorOffset23() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertThrows(ArithmeticException.class, () -> subject.temper23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset23() {
        assertEquals(0.5, new AshenTrellisIII().temper23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset23() {
        assertEquals(4.0, new AshenTrellisIII().temper23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield24() {
        assertTrue(new AshenTrellisIII().winnow24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new AshenTrellisIII().winnow24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield24() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenTrellisIII().winnow24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin25() {
        assertEquals("below", new AshenTrellisIII().prune25(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin25() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("lower-bound", subject.prune25(3));
        assertEquals("upper-bound", subject.prune25(8));
    }

    @Test
    void classifiesWithinAndAboveMargin25() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("within", subject.prune25(3 + 1));
        assertEquals("above", subject.prune25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally26() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile26());
        }
        assertEquals(3, subject.bias26Count());
    }

    @Test
    void refusesOnceExhaustedTally26() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile26();
        }
        assertFalse(subject.reconcile26());
    }

    @Test
    void accumulatesBelowTheCapYield27() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals(1, subject.furl27(1));
        assertEquals(3, subject.furl27(2));
    }

    @Test
    void saturatesAtTheCapYield27() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.furl27(47);
        assertEquals(47, subject.furl27(5));
    }

    @Test
    void ignoresNegativeValuesYield27() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.furl27(3);
        assertEquals(3, subject.furl27(-2));
        assertEquals(3, subject.depth27Value());
    }

    @Test
    void rejectsZeroDenominatorDrift28() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertThrows(ArithmeticException.class, () -> subject.brace28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift28() {
        assertEquals(0.5, new AshenTrellisIII().brace28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift28() {
        assertEquals(4.0, new AshenTrellisIII().brace28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth29() {
        assertTrue(new AshenTrellisIII().flatten29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new AshenTrellisIII().flatten29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth29() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenTrellisIII().flatten29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence30() {
        assertEquals("below", new AshenTrellisIII().anneal30(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence30() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("lower-bound", subject.anneal30(4));
        assertEquals("upper-bound", subject.anneal30(7));
    }

    @Test
    void classifiesWithinAndAboveCadence30() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("within", subject.anneal30(4 + 1));
        assertEquals("above", subject.anneal30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold31() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten31());
        }
        assertEquals(4, subject.weight31Count());
    }

    @Test
    void refusesOnceExhaustedThreshold31() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 4; i++) {
            subject.flatten31();
        }
        assertFalse(subject.flatten31());
    }

    @Test
    void accumulatesBelowTheCapMargin32() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals(1, subject.anneal32(1));
        assertEquals(3, subject.anneal32(2));
    }

    @Test
    void saturatesAtTheCapMargin32() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.anneal32(52);
        assertEquals(52, subject.anneal32(5));
    }

    @Test
    void ignoresNegativeValuesMargin32() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.anneal32(3);
        assertEquals(3, subject.anneal32(-2));
        assertEquals(3, subject.drift32Value());
    }

    @Test
    void rejectsZeroDenominatorQuota33() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertThrows(ArithmeticException.class, () -> subject.sift33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota33() {
        assertEquals(0.5, new AshenTrellisIII().sift33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota33() {
        assertEquals(4.0, new AshenTrellisIII().sift33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity34() {
        assertTrue(new AshenTrellisIII().reconcile34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new AshenTrellisIII().reconcile34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity34() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenTrellisIII().reconcile34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally35() {
        assertEquals("below", new AshenTrellisIII().prune35(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally35() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("lower-bound", subject.prune35(5));
        assertEquals("upper-bound", subject.prune35(12));
    }

    @Test
    void classifiesWithinAndAboveTally35() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals("within", subject.prune35(5 + 1));
        assertEquals("above", subject.prune35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold36() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper36());
        }
        assertEquals(1, subject.quota36Count());
    }

    @Test
    void refusesOnceExhaustedThreshold36() {
        AshenTrellisIII subject = new AshenTrellisIII();
        for (int i = 0; i < 1; i++) {
            subject.temper36();
        }
        assertFalse(subject.temper36());
    }

    @Test
    void accumulatesBelowTheCapOffset37() {
        AshenTrellisIII subject = new AshenTrellisIII();
        assertEquals(1, subject.prune37(1));
        assertEquals(3, subject.prune37(2));
    }

    @Test
    void saturatesAtTheCapOffset37() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.prune37(57);
        assertEquals(57, subject.prune37(5));
    }

    @Test
    void ignoresNegativeValuesOffset37() {
        AshenTrellisIII subject = new AshenTrellisIII();
        subject.prune37(3);
        assertEquals(3, subject.prune37(-2));
        assertEquals(3, subject.tally37Value());
    }
}
