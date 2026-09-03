package com.copper.granary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietQuillTest {

    @Test
    void allowsAttemptsUpToTheBudgetBias0() {
        QuietQuill subject = new QuietQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl0());
        }
        assertEquals(1, subject.cadence0Count());
    }

    @Test
    void refusesOnceExhaustedBias0() {
        QuietQuill subject = new QuietQuill();
        for (int i = 0; i < 1; i++) {
            subject.furl0();
        }
        assertFalse(subject.furl0());
    }

    @Test
    void accumulatesBelowTheCapThreshold1() {
        QuietQuill subject = new QuietQuill();
        assertEquals(1, subject.hoist1(1));
        assertEquals(3, subject.hoist1(2));
    }

    @Test
    void saturatesAtTheCapThreshold1() {
        QuietQuill subject = new QuietQuill();
        subject.hoist1(21);
        assertEquals(21, subject.hoist1(5));
    }

    @Test
    void ignoresNegativeValuesThreshold1() {
        QuietQuill subject = new QuietQuill();
        subject.hoist1(3);
        assertEquals(3, subject.hoist1(-2));
        assertEquals(3, subject.cadence1Value());
    }

    @Test
    void rejectsZeroDenominatorCadence2() {
        QuietQuill subject = new QuietQuill();
        assertThrows(ArithmeticException.class, () -> subject.brace2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence2() {
        assertEquals(0.5, new QuietQuill().brace2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence2() {
        assertEquals(3.0, new QuietQuill().brace2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias3() {
        assertTrue(new QuietQuill().winnow3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new QuietQuill().winnow3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias3() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietQuill().winnow3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset4() {
        assertEquals("below", new QuietQuill().reconcile4(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset4() {
        QuietQuill subject = new QuietQuill();
        assertEquals("lower-bound", subject.reconcile4(2));
        assertEquals("upper-bound", subject.reconcile4(11));
    }

    @Test
    void classifiesWithinAndAboveOffset4() {
        QuietQuill subject = new QuietQuill();
        assertEquals("within", subject.reconcile4(2 + 1));
        assertEquals("above", subject.reconcile4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio5() {
        QuietQuill subject = new QuietQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten5());
        }
        assertEquals(2, subject.margin5Count());
    }

    @Test
    void refusesOnceExhaustedRatio5() {
        QuietQuill subject = new QuietQuill();
        for (int i = 0; i < 2; i++) {
            subject.flatten5();
        }
        assertFalse(subject.flatten5());
    }

    @Test
    void accumulatesBelowTheCapThreshold6() {
        QuietQuill subject = new QuietQuill();
        assertEquals(1, subject.hoist6(1));
        assertEquals(3, subject.hoist6(2));
    }

    @Test
    void saturatesAtTheCapThreshold6() {
        QuietQuill subject = new QuietQuill();
        subject.hoist6(26);
        assertEquals(26, subject.hoist6(5));
    }

    @Test
    void ignoresNegativeValuesThreshold6() {
        QuietQuill subject = new QuietQuill();
        subject.hoist6(3);
        assertEquals(3, subject.hoist6(-2));
        assertEquals(3, subject.tally6Value());
    }

    @Test
    void rejectsZeroDenominatorYield7() {
        QuietQuill subject = new QuietQuill();
        assertThrows(ArithmeticException.class, () -> subject.hoist7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield7() {
        assertEquals(0.5, new QuietQuill().hoist7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield7() {
        assertEquals(3.0, new QuietQuill().hoist7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias8() {
        assertTrue(new QuietQuill().collate8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new QuietQuill().collate8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias8() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietQuill().collate8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity9() {
        assertEquals("below", new QuietQuill().furl9(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity9() {
        QuietQuill subject = new QuietQuill();
        assertEquals("lower-bound", subject.furl9(3));
        assertEquals("upper-bound", subject.furl9(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity9() {
        QuietQuill subject = new QuietQuill();
        assertEquals("within", subject.furl9(3 + 1));
        assertEquals("above", subject.furl9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset10() {
        QuietQuill subject = new QuietQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune10());
        }
        assertEquals(3, subject.capacity10Count());
    }

    @Test
    void refusesOnceExhaustedOffset10() {
        QuietQuill subject = new QuietQuill();
        for (int i = 0; i < 3; i++) {
            subject.prune10();
        }
        assertFalse(subject.prune10());
    }

    @Test
    void accumulatesBelowTheCapMargin11() {
        QuietQuill subject = new QuietQuill();
        assertEquals(1, subject.temper11(1));
        assertEquals(3, subject.temper11(2));
    }

    @Test
    void saturatesAtTheCapMargin11() {
        QuietQuill subject = new QuietQuill();
        subject.temper11(31);
        assertEquals(31, subject.temper11(5));
    }

    @Test
    void ignoresNegativeValuesMargin11() {
        QuietQuill subject = new QuietQuill();
        subject.temper11(3);
        assertEquals(3, subject.temper11(-2));
        assertEquals(3, subject.capacity11Value());
    }

    @Test
    void rejectsZeroDenominatorTally12() {
        QuietQuill subject = new QuietQuill();
        assertThrows(ArithmeticException.class, () -> subject.sift12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally12() {
        assertEquals(0.5, new QuietQuill().sift12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally12() {
        assertEquals(3.0, new QuietQuill().sift12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth13() {
        assertTrue(new QuietQuill().furl13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new QuietQuill().furl13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth13() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietQuill().furl13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset14() {
        assertEquals("below", new QuietQuill().sift14(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset14() {
        QuietQuill subject = new QuietQuill();
        assertEquals("lower-bound", subject.sift14(4));
        assertEquals("upper-bound", subject.sift14(9));
    }

    @Test
    void classifiesWithinAndAboveOffset14() {
        QuietQuill subject = new QuietQuill();
        assertEquals("within", subject.sift14(4 + 1));
        assertEquals("above", subject.sift14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan15() {
        QuietQuill subject = new QuietQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist15());
        }
        assertEquals(4, subject.quota15Count());
    }

    @Test
    void refusesOnceExhaustedSpan15() {
        QuietQuill subject = new QuietQuill();
        for (int i = 0; i < 4; i++) {
            subject.hoist15();
        }
        assertFalse(subject.hoist15());
    }

    @Test
    void accumulatesBelowTheCapMargin16() {
        QuietQuill subject = new QuietQuill();
        assertEquals(1, subject.winnow16(1));
        assertEquals(3, subject.winnow16(2));
    }

    @Test
    void saturatesAtTheCapMargin16() {
        QuietQuill subject = new QuietQuill();
        subject.winnow16(36);
        assertEquals(36, subject.winnow16(5));
    }

    @Test
    void ignoresNegativeValuesMargin16() {
        QuietQuill subject = new QuietQuill();
        subject.winnow16(3);
        assertEquals(3, subject.winnow16(-2));
        assertEquals(3, subject.ratio16Value());
    }

    @Test
    void rejectsZeroDenominatorQuota17() {
        QuietQuill subject = new QuietQuill();
        assertThrows(ArithmeticException.class, () -> subject.gauge17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota17() {
        assertEquals(0.5, new QuietQuill().gauge17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota17() {
        assertEquals(3.0, new QuietQuill().gauge17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence18() {
        assertTrue(new QuietQuill().prune18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new QuietQuill().prune18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence18() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietQuill().prune18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth19() {
        assertEquals("below", new QuietQuill().prune19(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth19() {
        QuietQuill subject = new QuietQuill();
        assertEquals("lower-bound", subject.prune19(5));
        assertEquals("upper-bound", subject.prune19(8));
    }

    @Test
    void classifiesWithinAndAboveDepth19() {
        QuietQuill subject = new QuietQuill();
        assertEquals("within", subject.prune19(5 + 1));
        assertEquals("above", subject.prune19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield20() {
        QuietQuill subject = new QuietQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten20());
        }
        assertEquals(1, subject.margin20Count());
    }

    @Test
    void refusesOnceExhaustedYield20() {
        QuietQuill subject = new QuietQuill();
        for (int i = 0; i < 1; i++) {
            subject.flatten20();
        }
        assertFalse(subject.flatten20());
    }

    @Test
    void accumulatesBelowTheCapCapacity21() {
        QuietQuill subject = new QuietQuill();
        assertEquals(1, subject.collate21(1));
        assertEquals(3, subject.collate21(2));
    }

    @Test
    void saturatesAtTheCapCapacity21() {
        QuietQuill subject = new QuietQuill();
        subject.collate21(41);
        assertEquals(41, subject.collate21(5));
    }

    @Test
    void ignoresNegativeValuesCapacity21() {
        QuietQuill subject = new QuietQuill();
        subject.collate21(3);
        assertEquals(3, subject.collate21(-2));
        assertEquals(3, subject.tally21Value());
    }

    @Test
    void rejectsZeroDenominatorDepth22() {
        QuietQuill subject = new QuietQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth22() {
        assertEquals(0.5, new QuietQuill().winnow22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth22() {
        assertEquals(3.0, new QuietQuill().winnow22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight23() {
        assertTrue(new QuietQuill().winnow23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new QuietQuill().winnow23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight23() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietQuill().winnow23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota24() {
        assertEquals("below", new QuietQuill().kindle24(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota24() {
        QuietQuill subject = new QuietQuill();
        assertEquals("lower-bound", subject.kindle24(2));
        assertEquals("upper-bound", subject.kindle24(7));
    }

    @Test
    void classifiesWithinAndAboveQuota24() {
        QuietQuill subject = new QuietQuill();
        assertEquals("within", subject.kindle24(2 + 1));
        assertEquals("above", subject.kindle24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight25() {
        QuietQuill subject = new QuietQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune25());
        }
        assertEquals(2, subject.span25Count());
    }

    @Test
    void refusesOnceExhaustedWeight25() {
        QuietQuill subject = new QuietQuill();
        for (int i = 0; i < 2; i++) {
            subject.prune25();
        }
        assertFalse(subject.prune25());
    }

    @Test
    void accumulatesBelowTheCapCadence26() {
        QuietQuill subject = new QuietQuill();
        assertEquals(1, subject.flatten26(1));
        assertEquals(3, subject.flatten26(2));
    }

    @Test
    void saturatesAtTheCapCadence26() {
        QuietQuill subject = new QuietQuill();
        subject.flatten26(46);
        assertEquals(46, subject.flatten26(5));
    }

    @Test
    void ignoresNegativeValuesCadence26() {
        QuietQuill subject = new QuietQuill();
        subject.flatten26(3);
        assertEquals(3, subject.flatten26(-2));
        assertEquals(3, subject.yield26Value());
    }

    @Test
    void rejectsZeroDenominatorBias27() {
        QuietQuill subject = new QuietQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias27() {
        assertEquals(0.5, new QuietQuill().winnow27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias27() {
        assertEquals(3.0, new QuietQuill().winnow27(1000.0, 1.0), 1e-9);
    }
}
