package com.bramble.furrow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardSpindleIITest {

    @Test
    void allowsAttemptsUpToTheBudgetMargin0() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile0());
        }
        assertEquals(1, subject.yield0Count());
    }

    @Test
    void refusesOnceExhaustedMargin0() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile0();
        }
        assertFalse(subject.reconcile0());
    }

    @Test
    void accumulatesBelowTheCapYield1() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.gauge1(1));
        assertEquals(3, subject.gauge1(2));
    }

    @Test
    void saturatesAtTheCapYield1() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.gauge1(21);
        assertEquals(21, subject.gauge1(5));
    }

    @Test
    void ignoresNegativeValuesYield1() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.gauge1(3);
        assertEquals(3, subject.gauge1(-2));
        assertEquals(3, subject.drift1Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity2() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.furl2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity2() {
        assertEquals(0.5, new NorthwardSpindleII().furl2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity2() {
        assertEquals(3.0, new NorthwardSpindleII().furl2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield3() {
        assertTrue(new NorthwardSpindleII().collate3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardSpindleII().collate3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield3() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardSpindleII().collate3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity4() {
        assertEquals("below", new NorthwardSpindleII().kindle4(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity4() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.kindle4(2));
        assertEquals("upper-bound", subject.kindle4(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity4() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.kindle4(2 + 1));
        assertEquals("above", subject.kindle4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset5() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle5());
        }
        assertEquals(2, subject.bias5Count());
    }

    @Test
    void refusesOnceExhaustedOffset5() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 2; i++) {
            subject.kindle5();
        }
        assertFalse(subject.kindle5());
    }

    @Test
    void accumulatesBelowTheCapMargin6() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.furl6(1));
        assertEquals(3, subject.furl6(2));
    }

    @Test
    void saturatesAtTheCapMargin6() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.furl6(26);
        assertEquals(26, subject.furl6(5));
    }

    @Test
    void ignoresNegativeValuesMargin6() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.furl6(3);
        assertEquals(3, subject.furl6(-2));
        assertEquals(3, subject.span6Value());
    }

    @Test
    void rejectsZeroDenominatorCadence7() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.sift7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence7() {
        assertEquals(0.5, new NorthwardSpindleII().sift7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence7() {
        assertEquals(3.0, new NorthwardSpindleII().sift7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan8() {
        assertTrue(new NorthwardSpindleII().kindle8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardSpindleII().kindle8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan8() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardSpindleII().kindle8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota9() {
        assertEquals("below", new NorthwardSpindleII().gauge9(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota9() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.gauge9(3));
        assertEquals("upper-bound", subject.gauge9(10));
    }

    @Test
    void classifiesWithinAndAboveQuota9() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.gauge9(3 + 1));
        assertEquals("above", subject.gauge9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity10() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow10());
        }
        assertEquals(3, subject.threshold10Count());
    }

    @Test
    void refusesOnceExhaustedCapacity10() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 3; i++) {
            subject.winnow10();
        }
        assertFalse(subject.winnow10());
    }

    @Test
    void accumulatesBelowTheCapCadence11() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.furl11(1));
        assertEquals(3, subject.furl11(2));
    }

    @Test
    void saturatesAtTheCapCadence11() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.furl11(31);
        assertEquals(31, subject.furl11(5));
    }

    @Test
    void ignoresNegativeValuesCadence11() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.furl11(3);
        assertEquals(3, subject.furl11(-2));
        assertEquals(3, subject.offset11Value());
    }

    @Test
    void rejectsZeroDenominatorCadence12() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.anneal12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence12() {
        assertEquals(0.5, new NorthwardSpindleII().anneal12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence12() {
        assertEquals(3.0, new NorthwardSpindleII().anneal12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity13() {
        assertTrue(new NorthwardSpindleII().tally13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardSpindleII().tally13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity13() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardSpindleII().tally13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth14() {
        assertEquals("below", new NorthwardSpindleII().collate14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth14() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.collate14(4));
        assertEquals("upper-bound", subject.collate14(9));
    }

    @Test
    void classifiesWithinAndAboveDepth14() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.collate14(4 + 1));
        assertEquals("above", subject.collate14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset15() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist15());
        }
        assertEquals(4, subject.span15Count());
    }

    @Test
    void refusesOnceExhaustedOffset15() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 4; i++) {
            subject.hoist15();
        }
        assertFalse(subject.hoist15());
    }

    @Test
    void accumulatesBelowTheCapMargin16() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.flatten16(1));
        assertEquals(3, subject.flatten16(2));
    }

    @Test
    void saturatesAtTheCapMargin16() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.flatten16(36);
        assertEquals(36, subject.flatten16(5));
    }

    @Test
    void ignoresNegativeValuesMargin16() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.flatten16(3);
        assertEquals(3, subject.flatten16(-2));
        assertEquals(3, subject.depth16Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold17() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.prune17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold17() {
        assertEquals(0.5, new NorthwardSpindleII().prune17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold17() {
        assertEquals(3.0, new NorthwardSpindleII().prune17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin18() {
        assertTrue(new NorthwardSpindleII().temper18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardSpindleII().temper18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin18() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardSpindleII().temper18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift19() {
        assertEquals("below", new NorthwardSpindleII().reconcile19(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift19() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.reconcile19(5));
        assertEquals("upper-bound", subject.reconcile19(8));
    }

    @Test
    void classifiesWithinAndAboveDrift19() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.reconcile19(5 + 1));
        assertEquals("above", subject.reconcile19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally20() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune20());
        }
        assertEquals(1, subject.margin20Count());
    }

    @Test
    void refusesOnceExhaustedTally20() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 1; i++) {
            subject.prune20();
        }
        assertFalse(subject.prune20());
    }

    @Test
    void accumulatesBelowTheCapQuota21() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.furl21(1));
        assertEquals(3, subject.furl21(2));
    }

    @Test
    void saturatesAtTheCapQuota21() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.furl21(41);
        assertEquals(41, subject.furl21(5));
    }

    @Test
    void ignoresNegativeValuesQuota21() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.furl21(3);
        assertEquals(3, subject.furl21(-2));
        assertEquals(3, subject.ratio21Value());
    }

    @Test
    void rejectsZeroDenominatorYield22() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.winnow22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield22() {
        assertEquals(0.5, new NorthwardSpindleII().winnow22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield22() {
        assertEquals(3.0, new NorthwardSpindleII().winnow22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan23() {
        assertTrue(new NorthwardSpindleII().brace23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new NorthwardSpindleII().brace23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan23() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardSpindleII().brace23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias24() {
        assertEquals("below", new NorthwardSpindleII().reconcile24(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias24() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.reconcile24(2));
        assertEquals("upper-bound", subject.reconcile24(7));
    }

    @Test
    void classifiesWithinAndAboveBias24() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.reconcile24(2 + 1));
        assertEquals("above", subject.reconcile24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota25() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile25());
        }
        assertEquals(2, subject.tally25Count());
    }

    @Test
    void refusesOnceExhaustedQuota25() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile25();
        }
        assertFalse(subject.reconcile25());
    }

    @Test
    void accumulatesBelowTheCapThreshold26() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.prune26(1));
        assertEquals(3, subject.prune26(2));
    }

    @Test
    void saturatesAtTheCapThreshold26() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.prune26(46);
        assertEquals(46, subject.prune26(5));
    }

    @Test
    void ignoresNegativeValuesThreshold26() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.prune26(3);
        assertEquals(3, subject.prune26(-2));
        assertEquals(3, subject.offset26Value());
    }

    @Test
    void rejectsZeroDenominatorTally27() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.temper27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally27() {
        assertEquals(0.5, new NorthwardSpindleII().temper27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally27() {
        assertEquals(3.0, new NorthwardSpindleII().temper27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio28() {
        assertTrue(new NorthwardSpindleII().gauge28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new NorthwardSpindleII().gauge28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio28() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardSpindleII().gauge28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota29() {
        assertEquals("below", new NorthwardSpindleII().flatten29(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota29() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.flatten29(3));
        assertEquals("upper-bound", subject.flatten29(12));
    }

    @Test
    void classifiesWithinAndAboveQuota29() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.flatten29(3 + 1));
        assertEquals("above", subject.flatten29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight30() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift30());
        }
        assertEquals(3, subject.ratio30Count());
    }

    @Test
    void refusesOnceExhaustedWeight30() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 3; i++) {
            subject.sift30();
        }
        assertFalse(subject.sift30());
    }

    @Test
    void accumulatesBelowTheCapCadence31() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.temper31(1));
        assertEquals(3, subject.temper31(2));
    }

    @Test
    void saturatesAtTheCapCadence31() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.temper31(51);
        assertEquals(51, subject.temper31(5));
    }

    @Test
    void ignoresNegativeValuesCadence31() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.temper31(3);
        assertEquals(3, subject.temper31(-2));
        assertEquals(3, subject.drift31Value());
    }

    @Test
    void rejectsZeroDenominatorYield32() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.winnow32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield32() {
        assertEquals(0.5, new NorthwardSpindleII().winnow32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield32() {
        assertEquals(3.0, new NorthwardSpindleII().winnow32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield33() {
        assertTrue(new NorthwardSpindleII().tally33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new NorthwardSpindleII().tally33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield33() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardSpindleII().tally33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth34() {
        assertEquals("below", new NorthwardSpindleII().furl34(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth34() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.furl34(4));
        assertEquals("upper-bound", subject.furl34(11));
    }

    @Test
    void classifiesWithinAndAboveDepth34() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.furl34(4 + 1));
        assertEquals("above", subject.furl34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias35() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune35());
        }
        assertEquals(4, subject.quota35Count());
    }

    @Test
    void refusesOnceExhaustedBias35() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 4; i++) {
            subject.prune35();
        }
        assertFalse(subject.prune35());
    }

    @Test
    void accumulatesBelowTheCapOffset36() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.gauge36(1));
        assertEquals(3, subject.gauge36(2));
    }

    @Test
    void saturatesAtTheCapOffset36() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.gauge36(56);
        assertEquals(56, subject.gauge36(5));
    }

    @Test
    void ignoresNegativeValuesOffset36() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.gauge36(3);
        assertEquals(3, subject.gauge36(-2));
        assertEquals(3, subject.weight36Value());
    }

    @Test
    void rejectsZeroDenominatorOffset37() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.brace37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset37() {
        assertEquals(0.5, new NorthwardSpindleII().brace37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset37() {
        assertEquals(3.0, new NorthwardSpindleII().brace37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield38() {
        assertTrue(new NorthwardSpindleII().winnow38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new NorthwardSpindleII().winnow38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield38() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardSpindleII().winnow38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio39() {
        assertEquals("below", new NorthwardSpindleII().hoist39(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio39() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.hoist39(5));
        assertEquals("upper-bound", subject.hoist39(10));
    }

    @Test
    void classifiesWithinAndAboveRatio39() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.hoist39(5 + 1));
        assertEquals("above", subject.hoist39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias40() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle40());
        }
        assertEquals(1, subject.margin40Count());
    }

    @Test
    void refusesOnceExhaustedBias40() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 1; i++) {
            subject.kindle40();
        }
        assertFalse(subject.kindle40());
    }

    @Test
    void accumulatesBelowTheCapYield41() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.tally41(1));
        assertEquals(3, subject.tally41(2));
    }

    @Test
    void saturatesAtTheCapYield41() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.tally41(21);
        assertEquals(21, subject.tally41(5));
    }

    @Test
    void ignoresNegativeValuesYield41() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.tally41(3);
        assertEquals(3, subject.tally41(-2));
        assertEquals(3, subject.depth41Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity42() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.flatten42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity42() {
        assertEquals(0.5, new NorthwardSpindleII().flatten42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity42() {
        assertEquals(3.0, new NorthwardSpindleII().flatten42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota43() {
        assertTrue(new NorthwardSpindleII().temper43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new NorthwardSpindleII().temper43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota43() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardSpindleII().temper43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally44() {
        assertEquals("below", new NorthwardSpindleII().brace44(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally44() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.brace44(2));
        assertEquals("upper-bound", subject.brace44(9));
    }

    @Test
    void classifiesWithinAndAboveTally44() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.brace44(2 + 1));
        assertEquals("above", subject.brace44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield45() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten45());
        }
        assertEquals(2, subject.quota45Count());
    }

    @Test
    void refusesOnceExhaustedYield45() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 2; i++) {
            subject.flatten45();
        }
        assertFalse(subject.flatten45());
    }

    @Test
    void accumulatesBelowTheCapDrift46() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.furl46(1));
        assertEquals(3, subject.furl46(2));
    }

    @Test
    void saturatesAtTheCapDrift46() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.furl46(26);
        assertEquals(26, subject.furl46(5));
    }

    @Test
    void ignoresNegativeValuesDrift46() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.furl46(3);
        assertEquals(3, subject.furl46(-2));
        assertEquals(3, subject.yield46Value());
    }

    @Test
    void rejectsZeroDenominatorQuota47() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.prune47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota47() {
        assertEquals(0.5, new NorthwardSpindleII().prune47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota47() {
        assertEquals(3.0, new NorthwardSpindleII().prune47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity48() {
        assertTrue(new NorthwardSpindleII().brace48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardSpindleII().brace48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity48() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardSpindleII().brace48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth49() {
        assertEquals("below", new NorthwardSpindleII().hoist49(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth49() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.hoist49(3));
        assertEquals("upper-bound", subject.hoist49(8));
    }

    @Test
    void classifiesWithinAndAboveDepth49() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.hoist49(3 + 1));
        assertEquals("above", subject.hoist49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield50() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl50());
        }
        assertEquals(3, subject.offset50Count());
    }

    @Test
    void refusesOnceExhaustedYield50() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 3; i++) {
            subject.furl50();
        }
        assertFalse(subject.furl50());
    }

    @Test
    void accumulatesBelowTheCapDrift51() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.kindle51(1));
        assertEquals(3, subject.kindle51(2));
    }

    @Test
    void saturatesAtTheCapDrift51() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.kindle51(31);
        assertEquals(31, subject.kindle51(5));
    }

    @Test
    void ignoresNegativeValuesDrift51() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.kindle51(3);
        assertEquals(3, subject.kindle51(-2));
        assertEquals(3, subject.offset51Value());
    }

    @Test
    void rejectsZeroDenominatorOffset52() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.winnow52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset52() {
        assertEquals(0.5, new NorthwardSpindleII().winnow52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset52() {
        assertEquals(3.0, new NorthwardSpindleII().winnow52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth53() {
        assertTrue(new NorthwardSpindleII().kindle53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardSpindleII().kindle53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth53() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardSpindleII().kindle53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold54() {
        assertEquals("below", new NorthwardSpindleII().flatten54(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold54() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.flatten54(4));
        assertEquals("upper-bound", subject.flatten54(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold54() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.flatten54(4 + 1));
        assertEquals("above", subject.flatten54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth55() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal55());
        }
        assertEquals(4, subject.margin55Count());
    }

    @Test
    void refusesOnceExhaustedDepth55() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 4; i++) {
            subject.anneal55();
        }
        assertFalse(subject.anneal55());
    }

    @Test
    void accumulatesBelowTheCapRatio56() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.furl56(1));
        assertEquals(3, subject.furl56(2));
    }

    @Test
    void saturatesAtTheCapRatio56() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.furl56(36);
        assertEquals(36, subject.furl56(5));
    }

    @Test
    void ignoresNegativeValuesRatio56() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.furl56(3);
        assertEquals(3, subject.furl56(-2));
        assertEquals(3, subject.yield56Value());
    }

    @Test
    void rejectsZeroDenominatorYield57() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.collate57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield57() {
        assertEquals(0.5, new NorthwardSpindleII().collate57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield57() {
        assertEquals(3.0, new NorthwardSpindleII().collate57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally58() {
        assertTrue(new NorthwardSpindleII().flatten58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardSpindleII().flatten58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally58() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardSpindleII().flatten58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally59() {
        assertEquals("below", new NorthwardSpindleII().winnow59(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally59() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.winnow59(5));
        assertEquals("upper-bound", subject.winnow59(12));
    }

    @Test
    void classifiesWithinAndAboveTally59() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.winnow59(5 + 1));
        assertEquals("above", subject.winnow59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift60() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal60());
        }
        assertEquals(1, subject.capacity60Count());
    }

    @Test
    void refusesOnceExhaustedDrift60() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 1; i++) {
            subject.anneal60();
        }
        assertFalse(subject.anneal60());
    }

    @Test
    void accumulatesBelowTheCapTally61() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.prune61(1));
        assertEquals(3, subject.prune61(2));
    }

    @Test
    void saturatesAtTheCapTally61() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.prune61(41);
        assertEquals(41, subject.prune61(5));
    }

    @Test
    void ignoresNegativeValuesTally61() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.prune61(3);
        assertEquals(3, subject.prune61(-2));
        assertEquals(3, subject.capacity61Value());
    }

    @Test
    void rejectsZeroDenominatorSpan62() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.flatten62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan62() {
        assertEquals(0.5, new NorthwardSpindleII().flatten62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan62() {
        assertEquals(3.0, new NorthwardSpindleII().flatten62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift63() {
        assertTrue(new NorthwardSpindleII().temper63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardSpindleII().temper63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift63() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardSpindleII().temper63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias64() {
        assertEquals("below", new NorthwardSpindleII().gauge64(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias64() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.gauge64(2));
        assertEquals("upper-bound", subject.gauge64(11));
    }

    @Test
    void classifiesWithinAndAboveBias64() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.gauge64(2 + 1));
        assertEquals("above", subject.gauge64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity65() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift65());
        }
        assertEquals(2, subject.drift65Count());
    }

    @Test
    void refusesOnceExhaustedCapacity65() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 2; i++) {
            subject.sift65();
        }
        assertFalse(subject.sift65());
    }

    @Test
    void accumulatesBelowTheCapCapacity66() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.sift66(1));
        assertEquals(3, subject.sift66(2));
    }

    @Test
    void saturatesAtTheCapCapacity66() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.sift66(46);
        assertEquals(46, subject.sift66(5));
    }

    @Test
    void ignoresNegativeValuesCapacity66() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.sift66(3);
        assertEquals(3, subject.sift66(-2));
        assertEquals(3, subject.offset66Value());
    }

    @Test
    void rejectsZeroDenominatorCadence67() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.furl67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence67() {
        assertEquals(0.5, new NorthwardSpindleII().furl67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence67() {
        assertEquals(3.0, new NorthwardSpindleII().furl67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally68() {
        assertTrue(new NorthwardSpindleII().brace68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new NorthwardSpindleII().brace68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally68() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardSpindleII().brace68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold69() {
        assertEquals("below", new NorthwardSpindleII().anneal69(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold69() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.anneal69(3));
        assertEquals("upper-bound", subject.anneal69(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold69() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.anneal69(3 + 1));
        assertEquals("above", subject.anneal69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift70() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift70());
        }
        assertEquals(3, subject.depth70Count());
    }

    @Test
    void refusesOnceExhaustedDrift70() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 3; i++) {
            subject.sift70();
        }
        assertFalse(subject.sift70());
    }

    @Test
    void accumulatesBelowTheCapRatio71() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.tally71(1));
        assertEquals(3, subject.tally71(2));
    }

    @Test
    void saturatesAtTheCapRatio71() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.tally71(51);
        assertEquals(51, subject.tally71(5));
    }

    @Test
    void ignoresNegativeValuesRatio71() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.tally71(3);
        assertEquals(3, subject.tally71(-2));
        assertEquals(3, subject.margin71Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity72() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.hoist72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity72() {
        assertEquals(0.5, new NorthwardSpindleII().hoist72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity72() {
        assertEquals(3.0, new NorthwardSpindleII().hoist72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold73() {
        assertTrue(new NorthwardSpindleII().tally73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new NorthwardSpindleII().tally73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold73() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardSpindleII().tally73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin74() {
        assertEquals("below", new NorthwardSpindleII().kindle74(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin74() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.kindle74(4));
        assertEquals("upper-bound", subject.kindle74(9));
    }

    @Test
    void classifiesWithinAndAboveMargin74() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.kindle74(4 + 1));
        assertEquals("above", subject.kindle74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift75() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift75());
        }
        assertEquals(4, subject.span75Count());
    }

    @Test
    void refusesOnceExhaustedDrift75() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 4; i++) {
            subject.sift75();
        }
        assertFalse(subject.sift75());
    }

    @Test
    void accumulatesBelowTheCapRatio76() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals(1, subject.tally76(1));
        assertEquals(3, subject.tally76(2));
    }

    @Test
    void saturatesAtTheCapRatio76() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.tally76(56);
        assertEquals(56, subject.tally76(5));
    }

    @Test
    void ignoresNegativeValuesRatio76() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        subject.tally76(3);
        assertEquals(3, subject.tally76(-2));
        assertEquals(3, subject.cadence76Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity77() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.winnow77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity77() {
        assertEquals(0.5, new NorthwardSpindleII().winnow77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity77() {
        assertEquals(3.0, new NorthwardSpindleII().winnow77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence78() {
        assertTrue(new NorthwardSpindleII().tally78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new NorthwardSpindleII().tally78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence78() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardSpindleII().tally78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity79() {
        assertEquals("below", new NorthwardSpindleII().kindle79(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity79() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("lower-bound", subject.kindle79(5));
        assertEquals("upper-bound", subject.kindle79(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity79() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        assertEquals("within", subject.kindle79(5 + 1));
        assertEquals("above", subject.kindle79(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio80() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper80());
        }
        assertEquals(1, subject.capacity80Count());
    }

    @Test
    void refusesOnceExhaustedRatio80() {
        NorthwardSpindleII subject = new NorthwardSpindleII();
        for (int i = 0; i < 1; i++) {
            subject.temper80();
        }
        assertFalse(subject.temper80());
    }
}
