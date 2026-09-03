package com.bramble.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreHarborTest {

    @Test
    void allowsAttemptsUpToTheBudgetCapacity0() {
        OchreHarbor subject = new OchreHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle0());
        }
        assertEquals(1, subject.threshold0Count());
    }

    @Test
    void refusesOnceExhaustedCapacity0() {
        OchreHarbor subject = new OchreHarbor();
        for (int i = 0; i < 1; i++) {
            subject.kindle0();
        }
        assertFalse(subject.kindle0());
    }

    @Test
    void accumulatesBelowTheCapMargin1() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals(1, subject.prune1(1));
        assertEquals(3, subject.prune1(2));
    }

    @Test
    void saturatesAtTheCapMargin1() {
        OchreHarbor subject = new OchreHarbor();
        subject.prune1(21);
        assertEquals(21, subject.prune1(5));
    }

    @Test
    void ignoresNegativeValuesMargin1() {
        OchreHarbor subject = new OchreHarbor();
        subject.prune1(3);
        assertEquals(3, subject.prune1(-2));
        assertEquals(3, subject.threshold1Value());
    }

    @Test
    void rejectsZeroDenominatorBias2() {
        OchreHarbor subject = new OchreHarbor();
        assertThrows(ArithmeticException.class, () -> subject.reconcile2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias2() {
        assertEquals(0.5, new OchreHarbor().reconcile2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias2() {
        assertEquals(3.0, new OchreHarbor().reconcile2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold3() {
        assertTrue(new OchreHarbor().flatten3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new OchreHarbor().flatten3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold3() {
        assertEquals(java.util.Arrays.asList(9),
                new OchreHarbor().flatten3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio4() {
        assertEquals("below", new OchreHarbor().temper4(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio4() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals("lower-bound", subject.temper4(2));
        assertEquals("upper-bound", subject.temper4(11));
    }

    @Test
    void classifiesWithinAndAboveRatio4() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals("within", subject.temper4(2 + 1));
        assertEquals("above", subject.temper4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias5() {
        OchreHarbor subject = new OchreHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow5());
        }
        assertEquals(2, subject.tally5Count());
    }

    @Test
    void refusesOnceExhaustedBias5() {
        OchreHarbor subject = new OchreHarbor();
        for (int i = 0; i < 2; i++) {
            subject.winnow5();
        }
        assertFalse(subject.winnow5());
    }

    @Test
    void accumulatesBelowTheCapYield6() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals(1, subject.temper6(1));
        assertEquals(3, subject.temper6(2));
    }

    @Test
    void saturatesAtTheCapYield6() {
        OchreHarbor subject = new OchreHarbor();
        subject.temper6(26);
        assertEquals(26, subject.temper6(5));
    }

    @Test
    void ignoresNegativeValuesYield6() {
        OchreHarbor subject = new OchreHarbor();
        subject.temper6(3);
        assertEquals(3, subject.temper6(-2));
        assertEquals(3, subject.quota6Value());
    }

    @Test
    void rejectsZeroDenominatorQuota7() {
        OchreHarbor subject = new OchreHarbor();
        assertThrows(ArithmeticException.class, () -> subject.anneal7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota7() {
        assertEquals(0.5, new OchreHarbor().anneal7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota7() {
        assertEquals(3.0, new OchreHarbor().anneal7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity8() {
        assertTrue(new OchreHarbor().brace8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new OchreHarbor().brace8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity8() {
        assertEquals(java.util.Arrays.asList(14),
                new OchreHarbor().brace8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias9() {
        assertEquals("below", new OchreHarbor().hoist9(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias9() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals("lower-bound", subject.hoist9(3));
        assertEquals("upper-bound", subject.hoist9(10));
    }

    @Test
    void classifiesWithinAndAboveBias9() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals("within", subject.hoist9(3 + 1));
        assertEquals("above", subject.hoist9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin10() {
        OchreHarbor subject = new OchreHarbor();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally10());
        }
        assertEquals(3, subject.weight10Count());
    }

    @Test
    void refusesOnceExhaustedMargin10() {
        OchreHarbor subject = new OchreHarbor();
        for (int i = 0; i < 3; i++) {
            subject.tally10();
        }
        assertFalse(subject.tally10());
    }

    @Test
    void accumulatesBelowTheCapOffset11() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals(1, subject.hoist11(1));
        assertEquals(3, subject.hoist11(2));
    }

    @Test
    void saturatesAtTheCapOffset11() {
        OchreHarbor subject = new OchreHarbor();
        subject.hoist11(31);
        assertEquals(31, subject.hoist11(5));
    }

    @Test
    void ignoresNegativeValuesOffset11() {
        OchreHarbor subject = new OchreHarbor();
        subject.hoist11(3);
        assertEquals(3, subject.hoist11(-2));
        assertEquals(3, subject.weight11Value());
    }

    @Test
    void rejectsZeroDenominatorWeight12() {
        OchreHarbor subject = new OchreHarbor();
        assertThrows(ArithmeticException.class, () -> subject.prune12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight12() {
        assertEquals(0.5, new OchreHarbor().prune12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight12() {
        assertEquals(3.0, new OchreHarbor().prune12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally13() {
        assertTrue(new OchreHarbor().prune13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new OchreHarbor().prune13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally13() {
        assertEquals(java.util.Arrays.asList(10),
                new OchreHarbor().prune13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth14() {
        assertEquals("below", new OchreHarbor().sift14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth14() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals("lower-bound", subject.sift14(4));
        assertEquals("upper-bound", subject.sift14(9));
    }

    @Test
    void classifiesWithinAndAboveDepth14() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals("within", subject.sift14(4 + 1));
        assertEquals("above", subject.sift14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield15() {
        OchreHarbor subject = new OchreHarbor();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile15());
        }
        assertEquals(4, subject.tally15Count());
    }

    @Test
    void refusesOnceExhaustedYield15() {
        OchreHarbor subject = new OchreHarbor();
        for (int i = 0; i < 4; i++) {
            subject.reconcile15();
        }
        assertFalse(subject.reconcile15());
    }

    @Test
    void accumulatesBelowTheCapTally16() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals(1, subject.kindle16(1));
        assertEquals(3, subject.kindle16(2));
    }

    @Test
    void saturatesAtTheCapTally16() {
        OchreHarbor subject = new OchreHarbor();
        subject.kindle16(36);
        assertEquals(36, subject.kindle16(5));
    }

    @Test
    void ignoresNegativeValuesTally16() {
        OchreHarbor subject = new OchreHarbor();
        subject.kindle16(3);
        assertEquals(3, subject.kindle16(-2));
        assertEquals(3, subject.margin16Value());
    }

    @Test
    void rejectsZeroDenominatorCadence17() {
        OchreHarbor subject = new OchreHarbor();
        assertThrows(ArithmeticException.class, () -> subject.prune17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence17() {
        assertEquals(0.5, new OchreHarbor().prune17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence17() {
        assertEquals(3.0, new OchreHarbor().prune17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity18() {
        assertTrue(new OchreHarbor().flatten18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new OchreHarbor().flatten18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity18() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreHarbor().flatten18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset19() {
        assertEquals("below", new OchreHarbor().collate19(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset19() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals("lower-bound", subject.collate19(5));
        assertEquals("upper-bound", subject.collate19(8));
    }

    @Test
    void classifiesWithinAndAboveOffset19() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals("within", subject.collate19(5 + 1));
        assertEquals("above", subject.collate19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset20() {
        OchreHarbor subject = new OchreHarbor();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle20());
        }
        assertEquals(1, subject.weight20Count());
    }

    @Test
    void refusesOnceExhaustedOffset20() {
        OchreHarbor subject = new OchreHarbor();
        for (int i = 0; i < 1; i++) {
            subject.kindle20();
        }
        assertFalse(subject.kindle20());
    }

    @Test
    void accumulatesBelowTheCapQuota21() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals(1, subject.winnow21(1));
        assertEquals(3, subject.winnow21(2));
    }

    @Test
    void saturatesAtTheCapQuota21() {
        OchreHarbor subject = new OchreHarbor();
        subject.winnow21(41);
        assertEquals(41, subject.winnow21(5));
    }

    @Test
    void ignoresNegativeValuesQuota21() {
        OchreHarbor subject = new OchreHarbor();
        subject.winnow21(3);
        assertEquals(3, subject.winnow21(-2));
        assertEquals(3, subject.depth21Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold22() {
        OchreHarbor subject = new OchreHarbor();
        assertThrows(ArithmeticException.class, () -> subject.kindle22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold22() {
        assertEquals(0.5, new OchreHarbor().kindle22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold22() {
        assertEquals(3.0, new OchreHarbor().kindle22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias23() {
        assertTrue(new OchreHarbor().flatten23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new OchreHarbor().flatten23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias23() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreHarbor().flatten23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold24() {
        assertEquals("below", new OchreHarbor().sift24(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold24() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals("lower-bound", subject.sift24(2));
        assertEquals("upper-bound", subject.sift24(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold24() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals("within", subject.sift24(2 + 1));
        assertEquals("above", subject.sift24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold25() {
        OchreHarbor subject = new OchreHarbor();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift25());
        }
        assertEquals(2, subject.margin25Count());
    }

    @Test
    void refusesOnceExhaustedThreshold25() {
        OchreHarbor subject = new OchreHarbor();
        for (int i = 0; i < 2; i++) {
            subject.sift25();
        }
        assertFalse(subject.sift25());
    }

    @Test
    void accumulatesBelowTheCapBias26() {
        OchreHarbor subject = new OchreHarbor();
        assertEquals(1, subject.collate26(1));
        assertEquals(3, subject.collate26(2));
    }

    @Test
    void saturatesAtTheCapBias26() {
        OchreHarbor subject = new OchreHarbor();
        subject.collate26(46);
        assertEquals(46, subject.collate26(5));
    }

    @Test
    void ignoresNegativeValuesBias26() {
        OchreHarbor subject = new OchreHarbor();
        subject.collate26(3);
        assertEquals(3, subject.collate26(-2));
        assertEquals(3, subject.ratio26Value());
    }

    @Test
    void rejectsZeroDenominatorMargin27() {
        OchreHarbor subject = new OchreHarbor();
        assertThrows(ArithmeticException.class, () -> subject.brace27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin27() {
        assertEquals(0.5, new OchreHarbor().brace27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin27() {
        assertEquals(3.0, new OchreHarbor().brace27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift28() {
        assertTrue(new OchreHarbor().anneal28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new OchreHarbor().anneal28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift28() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreHarbor().anneal28(java.util.Arrays.asList(null, 7, null)));
    }
}
