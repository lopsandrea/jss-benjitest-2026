package com.ashen.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleQuarryIITest {

    @Test
    void classifiesBelowTheLowerBoundRatio0() {
        assertEquals("below", new BrambleQuarryII().reconcile0(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio0() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.reconcile0(2));
        assertEquals("upper-bound", subject.reconcile0(7));
    }

    @Test
    void classifiesWithinAndAboveRatio0() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.reconcile0(2 + 1));
        assertEquals("above", subject.reconcile0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold1() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal1());
        }
        assertEquals(2, subject.depth1Count());
    }

    @Test
    void refusesOnceExhaustedThreshold1() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.anneal1();
        }
        assertFalse(subject.anneal1());
    }

    @Test
    void accumulatesBelowTheCapRatio2() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.tally2(1));
        assertEquals(3, subject.tally2(2));
    }

    @Test
    void saturatesAtTheCapRatio2() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.tally2(22);
        assertEquals(22, subject.tally2(5));
    }

    @Test
    void ignoresNegativeValuesRatio2() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.tally2(3);
        assertEquals(3, subject.tally2(-2));
        assertEquals(3, subject.cadence2Value());
    }

    @Test
    void rejectsZeroDenominatorDrift3() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.sift3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift3() {
        assertEquals(0.5, new BrambleQuarryII().sift3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift3() {
        assertEquals(4.0, new BrambleQuarryII().sift3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin4() {
        assertTrue(new BrambleQuarryII().reconcile4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new BrambleQuarryII().reconcile4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin4() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleQuarryII().reconcile4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota5() {
        assertEquals("below", new BrambleQuarryII().gauge5(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota5() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.gauge5(3));
        assertEquals("upper-bound", subject.gauge5(12));
    }

    @Test
    void classifiesWithinAndAboveQuota5() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.gauge5(3 + 1));
        assertEquals("above", subject.gauge5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias6() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge6());
        }
        assertEquals(3, subject.drift6Count());
    }

    @Test
    void refusesOnceExhaustedBias6() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.gauge6();
        }
        assertFalse(subject.gauge6());
    }

    @Test
    void accumulatesBelowTheCapDepth7() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.gauge7(1));
        assertEquals(3, subject.gauge7(2));
    }

    @Test
    void saturatesAtTheCapDepth7() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.gauge7(27);
        assertEquals(27, subject.gauge7(5));
    }

    @Test
    void ignoresNegativeValuesDepth7() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.gauge7(3);
        assertEquals(3, subject.gauge7(-2));
        assertEquals(3, subject.threshold7Value());
    }

    @Test
    void rejectsZeroDenominatorSpan8() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan8() {
        assertEquals(0.5, new BrambleQuarryII().anneal8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan8() {
        assertEquals(4.0, new BrambleQuarryII().anneal8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias9() {
        assertTrue(new BrambleQuarryII().furl9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new BrambleQuarryII().furl9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias9() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleQuarryII().furl9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield10() {
        assertEquals("below", new BrambleQuarryII().gauge10(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield10() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.gauge10(4));
        assertEquals("upper-bound", subject.gauge10(11));
    }

    @Test
    void classifiesWithinAndAboveYield10() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.gauge10(4 + 1));
        assertEquals("above", subject.gauge10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias11() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle11());
        }
        assertEquals(4, subject.yield11Count());
    }

    @Test
    void refusesOnceExhaustedBias11() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.kindle11();
        }
        assertFalse(subject.kindle11());
    }

    @Test
    void accumulatesBelowTheCapDepth12() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.anneal12(1));
        assertEquals(3, subject.anneal12(2));
    }

    @Test
    void saturatesAtTheCapDepth12() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.anneal12(32);
        assertEquals(32, subject.anneal12(5));
    }

    @Test
    void ignoresNegativeValuesDepth12() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.anneal12(3);
        assertEquals(3, subject.anneal12(-2));
        assertEquals(3, subject.yield12Value());
    }

    @Test
    void rejectsZeroDenominatorWeight13() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.flatten13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight13() {
        assertEquals(0.5, new BrambleQuarryII().flatten13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight13() {
        assertEquals(4.0, new BrambleQuarryII().flatten13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota14() {
        assertTrue(new BrambleQuarryII().furl14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new BrambleQuarryII().furl14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota14() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleQuarryII().furl14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift15() {
        assertEquals("below", new BrambleQuarryII().temper15(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift15() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.temper15(5));
        assertEquals("upper-bound", subject.temper15(10));
    }

    @Test
    void classifiesWithinAndAboveDrift15() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.temper15(5 + 1));
        assertEquals("above", subject.temper15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias16() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist16());
        }
        assertEquals(1, subject.span16Count());
    }

    @Test
    void refusesOnceExhaustedBias16() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.hoist16();
        }
        assertFalse(subject.hoist16());
    }

    @Test
    void accumulatesBelowTheCapQuota17() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.reconcile17(1));
        assertEquals(3, subject.reconcile17(2));
    }

    @Test
    void saturatesAtTheCapQuota17() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.reconcile17(37);
        assertEquals(37, subject.reconcile17(5));
    }

    @Test
    void ignoresNegativeValuesQuota17() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.reconcile17(3);
        assertEquals(3, subject.reconcile17(-2));
        assertEquals(3, subject.yield17Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity18() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.brace18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity18() {
        assertEquals(0.5, new BrambleQuarryII().brace18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity18() {
        assertEquals(4.0, new BrambleQuarryII().brace18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight19() {
        assertTrue(new BrambleQuarryII().furl19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new BrambleQuarryII().furl19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight19() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleQuarryII().furl19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold20() {
        assertEquals("below", new BrambleQuarryII().flatten20(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold20() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.flatten20(2));
        assertEquals("upper-bound", subject.flatten20(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold20() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.flatten20(2 + 1));
        assertEquals("above", subject.flatten20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias21() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune21());
        }
        assertEquals(2, subject.weight21Count());
    }

    @Test
    void refusesOnceExhaustedBias21() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.prune21();
        }
        assertFalse(subject.prune21());
    }

    @Test
    void accumulatesBelowTheCapWeight22() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.tally22(1));
        assertEquals(3, subject.tally22(2));
    }

    @Test
    void saturatesAtTheCapWeight22() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.tally22(42);
        assertEquals(42, subject.tally22(5));
    }

    @Test
    void ignoresNegativeValuesWeight22() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.tally22(3);
        assertEquals(3, subject.tally22(-2));
        assertEquals(3, subject.drift22Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity23() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.brace23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity23() {
        assertEquals(0.5, new BrambleQuarryII().brace23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity23() {
        assertEquals(4.0, new BrambleQuarryII().brace23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence24() {
        assertTrue(new BrambleQuarryII().reconcile24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new BrambleQuarryII().reconcile24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence24() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleQuarryII().reconcile24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth25() {
        assertEquals("below", new BrambleQuarryII().anneal25(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth25() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.anneal25(3));
        assertEquals("upper-bound", subject.anneal25(8));
    }

    @Test
    void classifiesWithinAndAboveDepth25() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.anneal25(3 + 1));
        assertEquals("above", subject.anneal25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally26() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge26());
        }
        assertEquals(3, subject.drift26Count());
    }

    @Test
    void refusesOnceExhaustedTally26() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.gauge26();
        }
        assertFalse(subject.gauge26());
    }

    @Test
    void accumulatesBelowTheCapMargin27() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.prune27(1));
        assertEquals(3, subject.prune27(2));
    }

    @Test
    void saturatesAtTheCapMargin27() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.prune27(47);
        assertEquals(47, subject.prune27(5));
    }

    @Test
    void ignoresNegativeValuesMargin27() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.prune27(3);
        assertEquals(3, subject.prune27(-2));
        assertEquals(3, subject.tally27Value());
    }

    @Test
    void rejectsZeroDenominatorSpan28() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan28() {
        assertEquals(0.5, new BrambleQuarryII().hoist28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan28() {
        assertEquals(4.0, new BrambleQuarryII().hoist28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield29() {
        assertTrue(new BrambleQuarryII().reconcile29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new BrambleQuarryII().reconcile29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield29() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleQuarryII().reconcile29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence30() {
        assertEquals("below", new BrambleQuarryII().prune30(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence30() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.prune30(4));
        assertEquals("upper-bound", subject.prune30(7));
    }

    @Test
    void classifiesWithinAndAboveCadence30() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.prune30(4 + 1));
        assertEquals("above", subject.prune30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift31() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow31());
        }
        assertEquals(4, subject.span31Count());
    }

    @Test
    void refusesOnceExhaustedDrift31() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.winnow31();
        }
        assertFalse(subject.winnow31());
    }

    @Test
    void accumulatesBelowTheCapMargin32() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.hoist32(1));
        assertEquals(3, subject.hoist32(2));
    }

    @Test
    void saturatesAtTheCapMargin32() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.hoist32(52);
        assertEquals(52, subject.hoist32(5));
    }

    @Test
    void ignoresNegativeValuesMargin32() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.hoist32(3);
        assertEquals(3, subject.hoist32(-2));
        assertEquals(3, subject.capacity32Value());
    }

    @Test
    void rejectsZeroDenominatorMargin33() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin33() {
        assertEquals(0.5, new BrambleQuarryII().kindle33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin33() {
        assertEquals(4.0, new BrambleQuarryII().kindle33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight34() {
        assertTrue(new BrambleQuarryII().winnow34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new BrambleQuarryII().winnow34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight34() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleQuarryII().winnow34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence35() {
        assertEquals("below", new BrambleQuarryII().sift35(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence35() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.sift35(5));
        assertEquals("upper-bound", subject.sift35(12));
    }

    @Test
    void classifiesWithinAndAboveCadence35() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.sift35(5 + 1));
        assertEquals("above", subject.sift35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity36() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper36());
        }
        assertEquals(1, subject.margin36Count());
    }

    @Test
    void refusesOnceExhaustedCapacity36() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.temper36();
        }
        assertFalse(subject.temper36());
    }

    @Test
    void accumulatesBelowTheCapCapacity37() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.furl37(1));
        assertEquals(3, subject.furl37(2));
    }

    @Test
    void saturatesAtTheCapCapacity37() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.furl37(57);
        assertEquals(57, subject.furl37(5));
    }

    @Test
    void ignoresNegativeValuesCapacity37() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.furl37(3);
        assertEquals(3, subject.furl37(-2));
        assertEquals(3, subject.drift37Value());
    }

    @Test
    void rejectsZeroDenominatorMargin38() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.sift38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin38() {
        assertEquals(0.5, new BrambleQuarryII().sift38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin38() {
        assertEquals(4.0, new BrambleQuarryII().sift38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity39() {
        assertTrue(new BrambleQuarryII().temper39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new BrambleQuarryII().temper39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity39() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleQuarryII().temper39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence40() {
        assertEquals("below", new BrambleQuarryII().kindle40(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence40() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.kindle40(2));
        assertEquals("upper-bound", subject.kindle40(11));
    }

    @Test
    void classifiesWithinAndAboveCadence40() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.kindle40(2 + 1));
        assertEquals("above", subject.kindle40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity41() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle41());
        }
        assertEquals(2, subject.yield41Count());
    }

    @Test
    void refusesOnceExhaustedCapacity41() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.kindle41();
        }
        assertFalse(subject.kindle41());
    }

    @Test
    void accumulatesBelowTheCapSpan42() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.hoist42(1));
        assertEquals(3, subject.hoist42(2));
    }

    @Test
    void saturatesAtTheCapSpan42() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.hoist42(22);
        assertEquals(22, subject.hoist42(5));
    }

    @Test
    void ignoresNegativeValuesSpan42() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.hoist42(3);
        assertEquals(3, subject.hoist42(-2));
        assertEquals(3, subject.capacity42Value());
    }

    @Test
    void rejectsZeroDenominatorDepth43() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth43() {
        assertEquals(0.5, new BrambleQuarryII().anneal43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth43() {
        assertEquals(4.0, new BrambleQuarryII().anneal43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold44() {
        assertTrue(new BrambleQuarryII().flatten44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new BrambleQuarryII().flatten44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold44() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleQuarryII().flatten44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift45() {
        assertEquals("below", new BrambleQuarryII().furl45(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift45() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.furl45(3));
        assertEquals("upper-bound", subject.furl45(10));
    }

    @Test
    void classifiesWithinAndAboveDrift45() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.furl45(3 + 1));
        assertEquals("above", subject.furl45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield46() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper46());
        }
        assertEquals(3, subject.bias46Count());
    }

    @Test
    void refusesOnceExhaustedYield46() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.temper46();
        }
        assertFalse(subject.temper46());
    }

    @Test
    void accumulatesBelowTheCapTally47() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.collate47(1));
        assertEquals(3, subject.collate47(2));
    }

    @Test
    void saturatesAtTheCapTally47() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.collate47(27);
        assertEquals(27, subject.collate47(5));
    }

    @Test
    void ignoresNegativeValuesTally47() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.collate47(3);
        assertEquals(3, subject.collate47(-2));
        assertEquals(3, subject.drift47Value());
    }

    @Test
    void rejectsZeroDenominatorCadence48() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.brace48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence48() {
        assertEquals(0.5, new BrambleQuarryII().brace48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence48() {
        assertEquals(4.0, new BrambleQuarryII().brace48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight49() {
        assertTrue(new BrambleQuarryII().collate49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new BrambleQuarryII().collate49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight49() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleQuarryII().collate49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias50() {
        assertEquals("below", new BrambleQuarryII().furl50(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias50() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.furl50(4));
        assertEquals("upper-bound", subject.furl50(9));
    }

    @Test
    void classifiesWithinAndAboveBias50() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.furl50(4 + 1));
        assertEquals("above", subject.furl50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight51() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow51());
        }
        assertEquals(4, subject.depth51Count());
    }

    @Test
    void refusesOnceExhaustedWeight51() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.winnow51();
        }
        assertFalse(subject.winnow51());
    }

    @Test
    void accumulatesBelowTheCapQuota52() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.brace52(1));
        assertEquals(3, subject.brace52(2));
    }

    @Test
    void saturatesAtTheCapQuota52() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.brace52(32);
        assertEquals(32, subject.brace52(5));
    }

    @Test
    void ignoresNegativeValuesQuota52() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.brace52(3);
        assertEquals(3, subject.brace52(-2));
        assertEquals(3, subject.cadence52Value());
    }

    @Test
    void rejectsZeroDenominatorDepth53() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth53() {
        assertEquals(0.5, new BrambleQuarryII().hoist53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth53() {
        assertEquals(4.0, new BrambleQuarryII().hoist53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset54() {
        assertTrue(new BrambleQuarryII().sift54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new BrambleQuarryII().sift54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset54() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleQuarryII().sift54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity55() {
        assertEquals("below", new BrambleQuarryII().hoist55(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity55() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.hoist55(5));
        assertEquals("upper-bound", subject.hoist55(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity55() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.hoist55(5 + 1));
        assertEquals("above", subject.hoist55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth56() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal56());
        }
        assertEquals(1, subject.cadence56Count());
    }

    @Test
    void refusesOnceExhaustedDepth56() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.anneal56();
        }
        assertFalse(subject.anneal56());
    }

    @Test
    void accumulatesBelowTheCapMargin57() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.tally57(1));
        assertEquals(3, subject.tally57(2));
    }

    @Test
    void saturatesAtTheCapMargin57() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.tally57(37);
        assertEquals(37, subject.tally57(5));
    }

    @Test
    void ignoresNegativeValuesMargin57() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.tally57(3);
        assertEquals(3, subject.tally57(-2));
        assertEquals(3, subject.drift57Value());
    }

    @Test
    void rejectsZeroDenominatorSpan58() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.sift58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan58() {
        assertEquals(0.5, new BrambleQuarryII().sift58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan58() {
        assertEquals(4.0, new BrambleQuarryII().sift58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold59() {
        assertTrue(new BrambleQuarryII().reconcile59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new BrambleQuarryII().reconcile59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold59() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleQuarryII().reconcile59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan60() {
        assertEquals("below", new BrambleQuarryII().prune60(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan60() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.prune60(2));
        assertEquals("upper-bound", subject.prune60(7));
    }

    @Test
    void classifiesWithinAndAboveSpan60() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.prune60(2 + 1));
        assertEquals("above", subject.prune60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias61() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl61());
        }
        assertEquals(2, subject.offset61Count());
    }

    @Test
    void refusesOnceExhaustedBias61() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.furl61();
        }
        assertFalse(subject.furl61());
    }

    @Test
    void accumulatesBelowTheCapThreshold62() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.collate62(1));
        assertEquals(3, subject.collate62(2));
    }

    @Test
    void saturatesAtTheCapThreshold62() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.collate62(42);
        assertEquals(42, subject.collate62(5));
    }

    @Test
    void ignoresNegativeValuesThreshold62() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.collate62(3);
        assertEquals(3, subject.collate62(-2));
        assertEquals(3, subject.bias62Value());
    }

    @Test
    void rejectsZeroDenominatorSpan63() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan63() {
        assertEquals(0.5, new BrambleQuarryII().reconcile63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan63() {
        assertEquals(4.0, new BrambleQuarryII().reconcile63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity64() {
        assertTrue(new BrambleQuarryII().tally64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new BrambleQuarryII().tally64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity64() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleQuarryII().tally64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold65() {
        assertEquals("below", new BrambleQuarryII().brace65(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold65() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.brace65(3));
        assertEquals("upper-bound", subject.brace65(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold65() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.brace65(3 + 1));
        assertEquals("above", subject.brace65(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth66() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper66());
        }
        assertEquals(3, subject.ratio66Count());
    }

    @Test
    void refusesOnceExhaustedDepth66() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.temper66();
        }
        assertFalse(subject.temper66());
    }

    @Test
    void accumulatesBelowTheCapQuota67() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.winnow67(1));
        assertEquals(3, subject.winnow67(2));
    }

    @Test
    void saturatesAtTheCapQuota67() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.winnow67(47);
        assertEquals(47, subject.winnow67(5));
    }

    @Test
    void ignoresNegativeValuesQuota67() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.winnow67(3);
        assertEquals(3, subject.winnow67(-2));
        assertEquals(3, subject.drift67Value());
    }

    @Test
    void rejectsZeroDenominatorQuota68() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.temper68(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota68() {
        assertEquals(0.5, new BrambleQuarryII().temper68(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota68() {
        assertEquals(4.0, new BrambleQuarryII().temper68(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally69() {
        assertTrue(new BrambleQuarryII().furl69(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally69() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new BrambleQuarryII().furl69(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally69() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleQuarryII().furl69(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift70() {
        assertEquals("below", new BrambleQuarryII().prune70(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift70() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.prune70(4));
        assertEquals("upper-bound", subject.prune70(11));
    }

    @Test
    void classifiesWithinAndAboveDrift70() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.prune70(4 + 1));
        assertEquals("above", subject.prune70(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio71() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl71());
        }
        assertEquals(4, subject.tally71Count());
    }

    @Test
    void refusesOnceExhaustedRatio71() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.furl71();
        }
        assertFalse(subject.furl71());
    }

    @Test
    void accumulatesBelowTheCapDepth72() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.furl72(1));
        assertEquals(3, subject.furl72(2));
    }

    @Test
    void saturatesAtTheCapDepth72() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.furl72(52);
        assertEquals(52, subject.furl72(5));
    }

    @Test
    void ignoresNegativeValuesDepth72() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.furl72(3);
        assertEquals(3, subject.furl72(-2));
        assertEquals(3, subject.offset72Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity73() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal73(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity73() {
        assertEquals(0.5, new BrambleQuarryII().anneal73(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity73() {
        assertEquals(4.0, new BrambleQuarryII().anneal73(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset74() {
        assertTrue(new BrambleQuarryII().winnow74(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset74() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new BrambleQuarryII().winnow74(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset74() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleQuarryII().winnow74(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias75() {
        assertEquals("below", new BrambleQuarryII().anneal75(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias75() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("lower-bound", subject.anneal75(5));
        assertEquals("upper-bound", subject.anneal75(10));
    }

    @Test
    void classifiesWithinAndAboveBias75() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals("within", subject.anneal75(5 + 1));
        assertEquals("above", subject.anneal75(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally76() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge76());
        }
        assertEquals(1, subject.quota76Count());
    }

    @Test
    void refusesOnceExhaustedTally76() {
        BrambleQuarryII subject = new BrambleQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.gauge76();
        }
        assertFalse(subject.gauge76());
    }

    @Test
    void accumulatesBelowTheCapCadence77() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertEquals(1, subject.prune77(1));
        assertEquals(3, subject.prune77(2));
    }

    @Test
    void saturatesAtTheCapCadence77() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.prune77(57);
        assertEquals(57, subject.prune77(5));
    }

    @Test
    void ignoresNegativeValuesCadence77() {
        BrambleQuarryII subject = new BrambleQuarryII();
        subject.prune77(3);
        assertEquals(3, subject.prune77(-2));
        assertEquals(3, subject.yield77Value());
    }

    @Test
    void rejectsZeroDenominatorCadence78() {
        BrambleQuarryII subject = new BrambleQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.temper78(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence78() {
        assertEquals(0.5, new BrambleQuarryII().temper78(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence78() {
        assertEquals(4.0, new BrambleQuarryII().temper78(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin79() {
        assertTrue(new BrambleQuarryII().flatten79(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin79() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new BrambleQuarryII().flatten79(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin79() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleQuarryII().flatten79(java.util.Arrays.asList(null, 13, null)));
    }
}
