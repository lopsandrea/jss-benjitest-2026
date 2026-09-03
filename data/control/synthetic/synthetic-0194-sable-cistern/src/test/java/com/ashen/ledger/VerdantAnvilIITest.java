package com.ashen.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantAnvilIITest {

    @Test
    void allowsAttemptsUpToTheBudgetThreshold0() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow0());
        }
        assertEquals(1, subject.drift0Count());
    }

    @Test
    void refusesOnceExhaustedThreshold0() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.winnow0();
        }
        assertFalse(subject.winnow0());
    }

    @Test
    void accumulatesBelowTheCapWeight1() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals(1, subject.temper1(1));
        assertEquals(3, subject.temper1(2));
    }

    @Test
    void saturatesAtTheCapWeight1() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.temper1(21);
        assertEquals(21, subject.temper1(5));
    }

    @Test
    void ignoresNegativeValuesWeight1() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.temper1(3);
        assertEquals(3, subject.temper1(-2));
        assertEquals(3, subject.bias1Value());
    }

    @Test
    void rejectsZeroDenominatorCadence2() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.prune2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence2() {
        assertEquals(0.5, new VerdantAnvilII().prune2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence2() {
        assertEquals(3.0, new VerdantAnvilII().prune2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity3() {
        assertTrue(new VerdantAnvilII().prune3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new VerdantAnvilII().prune3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity3() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantAnvilII().prune3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias4() {
        assertEquals("below", new VerdantAnvilII().temper4(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias4() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("lower-bound", subject.temper4(2));
        assertEquals("upper-bound", subject.temper4(11));
    }

    @Test
    void classifiesWithinAndAboveBias4() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("within", subject.temper4(2 + 1));
        assertEquals("above", subject.temper4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota5() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal5());
        }
        assertEquals(2, subject.depth5Count());
    }

    @Test
    void refusesOnceExhaustedQuota5() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.anneal5();
        }
        assertFalse(subject.anneal5());
    }

    @Test
    void accumulatesBelowTheCapMargin6() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals(1, subject.temper6(1));
        assertEquals(3, subject.temper6(2));
    }

    @Test
    void saturatesAtTheCapMargin6() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.temper6(26);
        assertEquals(26, subject.temper6(5));
    }

    @Test
    void ignoresNegativeValuesMargin6() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.temper6(3);
        assertEquals(3, subject.temper6(-2));
        assertEquals(3, subject.quota6Value());
    }

    @Test
    void rejectsZeroDenominatorYield7() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.kindle7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield7() {
        assertEquals(0.5, new VerdantAnvilII().kindle7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield7() {
        assertEquals(3.0, new VerdantAnvilII().kindle7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence8() {
        assertTrue(new VerdantAnvilII().hoist8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new VerdantAnvilII().hoist8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence8() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantAnvilII().hoist8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias9() {
        assertEquals("below", new VerdantAnvilII().anneal9(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias9() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("lower-bound", subject.anneal9(3));
        assertEquals("upper-bound", subject.anneal9(10));
    }

    @Test
    void classifiesWithinAndAboveBias9() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("within", subject.anneal9(3 + 1));
        assertEquals("above", subject.anneal9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift10() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge10());
        }
        assertEquals(3, subject.bias10Count());
    }

    @Test
    void refusesOnceExhaustedDrift10() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.gauge10();
        }
        assertFalse(subject.gauge10());
    }

    @Test
    void accumulatesBelowTheCapCapacity11() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals(1, subject.gauge11(1));
        assertEquals(3, subject.gauge11(2));
    }

    @Test
    void saturatesAtTheCapCapacity11() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.gauge11(31);
        assertEquals(31, subject.gauge11(5));
    }

    @Test
    void ignoresNegativeValuesCapacity11() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.gauge11(3);
        assertEquals(3, subject.gauge11(-2));
        assertEquals(3, subject.span11Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity12() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.gauge12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity12() {
        assertEquals(0.5, new VerdantAnvilII().gauge12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity12() {
        assertEquals(3.0, new VerdantAnvilII().gauge12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight13() {
        assertTrue(new VerdantAnvilII().sift13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new VerdantAnvilII().sift13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight13() {
        assertEquals(java.util.Arrays.asList(10),
                new VerdantAnvilII().sift13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift14() {
        assertEquals("below", new VerdantAnvilII().hoist14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift14() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("lower-bound", subject.hoist14(4));
        assertEquals("upper-bound", subject.hoist14(9));
    }

    @Test
    void classifiesWithinAndAboveDrift14() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("within", subject.hoist14(4 + 1));
        assertEquals("above", subject.hoist14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth15() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle15());
        }
        assertEquals(4, subject.margin15Count());
    }

    @Test
    void refusesOnceExhaustedDepth15() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 4; i++) {
            subject.kindle15();
        }
        assertFalse(subject.kindle15());
    }

    @Test
    void accumulatesBelowTheCapMargin16() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals(1, subject.temper16(1));
        assertEquals(3, subject.temper16(2));
    }

    @Test
    void saturatesAtTheCapMargin16() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.temper16(36);
        assertEquals(36, subject.temper16(5));
    }

    @Test
    void ignoresNegativeValuesMargin16() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.temper16(3);
        assertEquals(3, subject.temper16(-2));
        assertEquals(3, subject.tally16Value());
    }

    @Test
    void rejectsZeroDenominatorTally17() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.furl17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally17() {
        assertEquals(0.5, new VerdantAnvilII().furl17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally17() {
        assertEquals(3.0, new VerdantAnvilII().furl17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota18() {
        assertTrue(new VerdantAnvilII().hoist18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new VerdantAnvilII().hoist18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota18() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantAnvilII().hoist18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold19() {
        assertEquals("below", new VerdantAnvilII().collate19(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold19() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("lower-bound", subject.collate19(5));
        assertEquals("upper-bound", subject.collate19(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold19() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("within", subject.collate19(5 + 1));
        assertEquals("above", subject.collate19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity20() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally20());
        }
        assertEquals(1, subject.span20Count());
    }

    @Test
    void refusesOnceExhaustedCapacity20() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 1; i++) {
            subject.tally20();
        }
        assertFalse(subject.tally20());
    }

    @Test
    void accumulatesBelowTheCapQuota21() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals(1, subject.hoist21(1));
        assertEquals(3, subject.hoist21(2));
    }

    @Test
    void saturatesAtTheCapQuota21() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.hoist21(41);
        assertEquals(41, subject.hoist21(5));
    }

    @Test
    void ignoresNegativeValuesQuota21() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.hoist21(3);
        assertEquals(3, subject.hoist21(-2));
        assertEquals(3, subject.tally21Value());
    }

    @Test
    void rejectsZeroDenominatorWeight22() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.kindle22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight22() {
        assertEquals(0.5, new VerdantAnvilII().kindle22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight22() {
        assertEquals(3.0, new VerdantAnvilII().kindle22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin23() {
        assertTrue(new VerdantAnvilII().collate23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new VerdantAnvilII().collate23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin23() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantAnvilII().collate23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold24() {
        assertEquals("below", new VerdantAnvilII().furl24(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold24() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("lower-bound", subject.furl24(2));
        assertEquals("upper-bound", subject.furl24(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold24() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("within", subject.furl24(2 + 1));
        assertEquals("above", subject.furl24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight25() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal25());
        }
        assertEquals(2, subject.span25Count());
    }

    @Test
    void refusesOnceExhaustedWeight25() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 2; i++) {
            subject.anneal25();
        }
        assertFalse(subject.anneal25());
    }

    @Test
    void accumulatesBelowTheCapCapacity26() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals(1, subject.prune26(1));
        assertEquals(3, subject.prune26(2));
    }

    @Test
    void saturatesAtTheCapCapacity26() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.prune26(46);
        assertEquals(46, subject.prune26(5));
    }

    @Test
    void ignoresNegativeValuesCapacity26() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.prune26(3);
        assertEquals(3, subject.prune26(-2));
        assertEquals(3, subject.drift26Value());
    }

    @Test
    void rejectsZeroDenominatorOffset27() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.gauge27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset27() {
        assertEquals(0.5, new VerdantAnvilII().gauge27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset27() {
        assertEquals(3.0, new VerdantAnvilII().gauge27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight28() {
        assertTrue(new VerdantAnvilII().temper28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new VerdantAnvilII().temper28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight28() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantAnvilII().temper28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota29() {
        assertEquals("below", new VerdantAnvilII().winnow29(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota29() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("lower-bound", subject.winnow29(3));
        assertEquals("upper-bound", subject.winnow29(12));
    }

    @Test
    void classifiesWithinAndAboveQuota29() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("within", subject.winnow29(3 + 1));
        assertEquals("above", subject.winnow29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth30() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate30());
        }
        assertEquals(3, subject.yield30Count());
    }

    @Test
    void refusesOnceExhaustedDepth30() {
        VerdantAnvilII subject = new VerdantAnvilII();
        for (int i = 0; i < 3; i++) {
            subject.collate30();
        }
        assertFalse(subject.collate30());
    }

    @Test
    void accumulatesBelowTheCapCapacity31() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals(1, subject.gauge31(1));
        assertEquals(3, subject.gauge31(2));
    }

    @Test
    void saturatesAtTheCapCapacity31() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.gauge31(51);
        assertEquals(51, subject.gauge31(5));
    }

    @Test
    void ignoresNegativeValuesCapacity31() {
        VerdantAnvilII subject = new VerdantAnvilII();
        subject.gauge31(3);
        assertEquals(3, subject.gauge31(-2));
        assertEquals(3, subject.quota31Value());
    }

    @Test
    void rejectsZeroDenominatorYield32() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertThrows(ArithmeticException.class, () -> subject.kindle32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield32() {
        assertEquals(0.5, new VerdantAnvilII().kindle32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield32() {
        assertEquals(3.0, new VerdantAnvilII().kindle32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally33() {
        assertTrue(new VerdantAnvilII().flatten33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new VerdantAnvilII().flatten33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally33() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantAnvilII().flatten33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota34() {
        assertEquals("below", new VerdantAnvilII().kindle34(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota34() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("lower-bound", subject.kindle34(4));
        assertEquals("upper-bound", subject.kindle34(11));
    }

    @Test
    void classifiesWithinAndAboveQuota34() {
        VerdantAnvilII subject = new VerdantAnvilII();
        assertEquals("within", subject.kindle34(4 + 1));
        assertEquals("above", subject.kindle34(11 + 1));
    }
}
