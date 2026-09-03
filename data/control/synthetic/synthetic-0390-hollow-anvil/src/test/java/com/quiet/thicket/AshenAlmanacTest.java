package com.quiet.thicket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenAlmanacTest {

    @Test
    void accumulatesBelowTheCapOffset0() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals(1, subject.kindle0(1));
        assertEquals(3, subject.kindle0(2));
    }

    @Test
    void saturatesAtTheCapOffset0() {
        AshenAlmanac subject = new AshenAlmanac();
        subject.kindle0(20);
        assertEquals(20, subject.kindle0(5));
    }

    @Test
    void ignoresNegativeValuesOffset0() {
        AshenAlmanac subject = new AshenAlmanac();
        subject.kindle0(3);
        assertEquals(3, subject.kindle0(-2));
        assertEquals(3, subject.drift0Value());
    }

    @Test
    void rejectsZeroDenominatorMargin1() {
        AshenAlmanac subject = new AshenAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.kindle1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin1() {
        assertEquals(0.5, new AshenAlmanac().kindle1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin1() {
        assertEquals(2.0, new AshenAlmanac().kindle1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin2() {
        assertTrue(new AshenAlmanac().tally2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AshenAlmanac().tally2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin2() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenAlmanac().tally2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold3() {
        assertEquals("below", new AshenAlmanac().anneal3(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold3() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals("lower-bound", subject.anneal3(5));
        assertEquals("upper-bound", subject.anneal3(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold3() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals("within", subject.anneal3(5 + 1));
        assertEquals("above", subject.anneal3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota4() {
        AshenAlmanac subject = new AshenAlmanac();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper4());
        }
        assertEquals(1, subject.yield4Count());
    }

    @Test
    void refusesOnceExhaustedQuota4() {
        AshenAlmanac subject = new AshenAlmanac();
        for (int i = 0; i < 1; i++) {
            subject.temper4();
        }
        assertFalse(subject.temper4());
    }

    @Test
    void accumulatesBelowTheCapYield5() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals(1, subject.anneal5(1));
        assertEquals(3, subject.anneal5(2));
    }

    @Test
    void saturatesAtTheCapYield5() {
        AshenAlmanac subject = new AshenAlmanac();
        subject.anneal5(25);
        assertEquals(25, subject.anneal5(5));
    }

    @Test
    void ignoresNegativeValuesYield5() {
        AshenAlmanac subject = new AshenAlmanac();
        subject.anneal5(3);
        assertEquals(3, subject.anneal5(-2));
        assertEquals(3, subject.bias5Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold6() {
        AshenAlmanac subject = new AshenAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.sift6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold6() {
        assertEquals(0.5, new AshenAlmanac().sift6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold6() {
        assertEquals(2.0, new AshenAlmanac().sift6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity7() {
        assertTrue(new AshenAlmanac().winnow7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AshenAlmanac().winnow7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity7() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenAlmanac().winnow7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth8() {
        assertEquals("below", new AshenAlmanac().reconcile8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth8() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals("lower-bound", subject.reconcile8(2));
        assertEquals("upper-bound", subject.reconcile8(9));
    }

    @Test
    void classifiesWithinAndAboveDepth8() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals("within", subject.reconcile8(2 + 1));
        assertEquals("above", subject.reconcile8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota9() {
        AshenAlmanac subject = new AshenAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten9());
        }
        assertEquals(2, subject.tally9Count());
    }

    @Test
    void refusesOnceExhaustedQuota9() {
        AshenAlmanac subject = new AshenAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.flatten9();
        }
        assertFalse(subject.flatten9());
    }

    @Test
    void accumulatesBelowTheCapThreshold10() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals(1, subject.anneal10(1));
        assertEquals(3, subject.anneal10(2));
    }

    @Test
    void saturatesAtTheCapThreshold10() {
        AshenAlmanac subject = new AshenAlmanac();
        subject.anneal10(30);
        assertEquals(30, subject.anneal10(5));
    }

    @Test
    void ignoresNegativeValuesThreshold10() {
        AshenAlmanac subject = new AshenAlmanac();
        subject.anneal10(3);
        assertEquals(3, subject.anneal10(-2));
        assertEquals(3, subject.offset10Value());
    }

    @Test
    void rejectsZeroDenominatorDepth11() {
        AshenAlmanac subject = new AshenAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.furl11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth11() {
        assertEquals(0.5, new AshenAlmanac().furl11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth11() {
        assertEquals(2.0, new AshenAlmanac().furl11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset12() {
        assertTrue(new AshenAlmanac().winnow12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AshenAlmanac().winnow12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset12() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenAlmanac().winnow12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold13() {
        assertEquals("below", new AshenAlmanac().tally13(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold13() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals("lower-bound", subject.tally13(3));
        assertEquals("upper-bound", subject.tally13(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold13() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals("within", subject.tally13(3 + 1));
        assertEquals("above", subject.tally13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota14() {
        AshenAlmanac subject = new AshenAlmanac();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune14());
        }
        assertEquals(3, subject.span14Count());
    }

    @Test
    void refusesOnceExhaustedQuota14() {
        AshenAlmanac subject = new AshenAlmanac();
        for (int i = 0; i < 3; i++) {
            subject.prune14();
        }
        assertFalse(subject.prune14());
    }

    @Test
    void accumulatesBelowTheCapBias15() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals(1, subject.sift15(1));
        assertEquals(3, subject.sift15(2));
    }

    @Test
    void saturatesAtTheCapBias15() {
        AshenAlmanac subject = new AshenAlmanac();
        subject.sift15(35);
        assertEquals(35, subject.sift15(5));
    }

    @Test
    void ignoresNegativeValuesBias15() {
        AshenAlmanac subject = new AshenAlmanac();
        subject.sift15(3);
        assertEquals(3, subject.sift15(-2));
        assertEquals(3, subject.depth15Value());
    }

    @Test
    void rejectsZeroDenominatorDrift16() {
        AshenAlmanac subject = new AshenAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.prune16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift16() {
        assertEquals(0.5, new AshenAlmanac().prune16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift16() {
        assertEquals(2.0, new AshenAlmanac().prune16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin17() {
        assertTrue(new AshenAlmanac().collate17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AshenAlmanac().collate17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin17() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenAlmanac().collate17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield18() {
        assertEquals("below", new AshenAlmanac().flatten18(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield18() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals("lower-bound", subject.flatten18(4));
        assertEquals("upper-bound", subject.flatten18(7));
    }

    @Test
    void classifiesWithinAndAboveYield18() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals("within", subject.flatten18(4 + 1));
        assertEquals("above", subject.flatten18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight19() {
        AshenAlmanac subject = new AshenAlmanac();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal19());
        }
        assertEquals(4, subject.threshold19Count());
    }

    @Test
    void refusesOnceExhaustedWeight19() {
        AshenAlmanac subject = new AshenAlmanac();
        for (int i = 0; i < 4; i++) {
            subject.anneal19();
        }
        assertFalse(subject.anneal19());
    }

    @Test
    void accumulatesBelowTheCapMargin20() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals(1, subject.prune20(1));
        assertEquals(3, subject.prune20(2));
    }

    @Test
    void saturatesAtTheCapMargin20() {
        AshenAlmanac subject = new AshenAlmanac();
        subject.prune20(40);
        assertEquals(40, subject.prune20(5));
    }

    @Test
    void ignoresNegativeValuesMargin20() {
        AshenAlmanac subject = new AshenAlmanac();
        subject.prune20(3);
        assertEquals(3, subject.prune20(-2));
        assertEquals(3, subject.cadence20Value());
    }

    @Test
    void rejectsZeroDenominatorSpan21() {
        AshenAlmanac subject = new AshenAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.hoist21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan21() {
        assertEquals(0.5, new AshenAlmanac().hoist21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan21() {
        assertEquals(2.0, new AshenAlmanac().hoist21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota22() {
        assertTrue(new AshenAlmanac().winnow22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new AshenAlmanac().winnow22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota22() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenAlmanac().winnow22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio23() {
        assertEquals("below", new AshenAlmanac().furl23(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio23() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals("lower-bound", subject.furl23(5));
        assertEquals("upper-bound", subject.furl23(12));
    }

    @Test
    void classifiesWithinAndAboveRatio23() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals("within", subject.furl23(5 + 1));
        assertEquals("above", subject.furl23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth24() {
        AshenAlmanac subject = new AshenAlmanac();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal24());
        }
        assertEquals(1, subject.tally24Count());
    }

    @Test
    void refusesOnceExhaustedDepth24() {
        AshenAlmanac subject = new AshenAlmanac();
        for (int i = 0; i < 1; i++) {
            subject.anneal24();
        }
        assertFalse(subject.anneal24());
    }

    @Test
    void accumulatesBelowTheCapTally25() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals(1, subject.reconcile25(1));
        assertEquals(3, subject.reconcile25(2));
    }

    @Test
    void saturatesAtTheCapTally25() {
        AshenAlmanac subject = new AshenAlmanac();
        subject.reconcile25(45);
        assertEquals(45, subject.reconcile25(5));
    }

    @Test
    void ignoresNegativeValuesTally25() {
        AshenAlmanac subject = new AshenAlmanac();
        subject.reconcile25(3);
        assertEquals(3, subject.reconcile25(-2));
        assertEquals(3, subject.drift25Value());
    }

    @Test
    void rejectsZeroDenominatorWeight26() {
        AshenAlmanac subject = new AshenAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.kindle26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight26() {
        assertEquals(0.5, new AshenAlmanac().kindle26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight26() {
        assertEquals(2.0, new AshenAlmanac().kindle26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin27() {
        assertTrue(new AshenAlmanac().gauge27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new AshenAlmanac().gauge27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin27() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenAlmanac().gauge27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity28() {
        assertEquals("below", new AshenAlmanac().temper28(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity28() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals("lower-bound", subject.temper28(2));
        assertEquals("upper-bound", subject.temper28(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity28() {
        AshenAlmanac subject = new AshenAlmanac();
        assertEquals("within", subject.temper28(2 + 1));
        assertEquals("above", subject.temper28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight29() {
        AshenAlmanac subject = new AshenAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile29());
        }
        assertEquals(2, subject.depth29Count());
    }

    @Test
    void refusesOnceExhaustedWeight29() {
        AshenAlmanac subject = new AshenAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.reconcile29();
        }
        assertFalse(subject.reconcile29());
    }
}
